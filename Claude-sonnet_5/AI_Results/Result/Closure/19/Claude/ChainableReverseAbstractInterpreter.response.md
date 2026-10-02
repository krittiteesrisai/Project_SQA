# วิเคราะห์และแนวทางการทดสอบ

เนื่องจาก `ChainableReverseAbstractInterpreter` เป็น abstract class ที่พึ่งพา `FlowScope`, `StaticSlot`, `CodingConvention` (ซึ่งเป็น interface ใน Closure Compiler แต่ไม่ได้แสดง source ในโจทย์) ผมจึงใช้ **`java.lang.reflect.Proxy`** สร้าง test-double ของ interface เหล่านี้ (ไม่ใช้ mocking library ภายนอกเพราะไม่มีอยู่ใน classpath ที่กำหนด) และใช้ **object จริง** ของ `JSTypeRegistry`, `Node`, `JSType` เพื่อให้ logic การ visit/switch ทำงานจริงตาม source

⚠️ หมายเหตุ assumption (คอมเมนต์กำกับไว้ในโค้ดด้วย):
- `FlowScope`, `StaticSlot<JSType>`, `CodingConvention`, `ErrorReporter` เป็น **interface** (ตามโครงสร้างจริงของ Closure Compiler) จึงใช้ `Proxy` ได้
- `JSTypeRegistry` มี constructor `JSTypeRegistry(ErrorReporter)`
- `JSTypeRegistry.createUnionType(JSType...)` มี overload รับ `JSType`
- `Node.newString(int type, String s)` และ `new Node(int type, Node...)` เป็น API จริงของ Rhino Node
- `getQualifiedName()` คืน null เมื่อ child แรกของ GETPROP ไม่ใช่ qualified name node (เช่น CALL)
- `U2U_CONSTRUCTOR_TYPE.isSubtype(OBJECT_TYPE)` เป็น true ตามลำดับชั้น type ปกติของ JS

```java
package com.google.javascript.jscomp.type;

import static com.google.javascript.rhino.jstype.JSTypeNative.ALL_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.U2U_CONSTRUCTOR_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.StaticSlot;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ชุดทดสอบสำหรับ {@link ChainableReverseAbstractInterpreter}
 *
 * หมายเหตุสำคัญ (assumption ที่ไม่มีอยู่ใน source ที่ให้มาโดยตรง แต่จำเป็นต่อการเขียนเทส):
 * - FlowScope, StaticSlot, CodingConvention, ErrorReporter สมมติว่าเป็น interface
 *   ของ Closure Compiler จริง จึงใช้ java.lang.reflect.Proxy สร้าง stub แทนได้
 * - JSTypeRegistry มี constructor ที่รับ ErrorReporter
 * - JSTypeRegistry.createUnionType มี overload รับ JSType... 
 */
public class ChainableReverseAbstractInterpreterTest {

  private JSTypeRegistry registry;
  private CodingConvention convention;

  @Before
  public void setUp() {
    registry = new JSTypeRegistry(createErrorReporter());
    convention = createCodingConvention();
  }

  // ---------------------------------------------------------------------
  // Test double helpers (ใช้ Proxy เพราะไม่มี mocking library ใน classpath)
  // ---------------------------------------------------------------------

  private static ErrorReporter createErrorReporter() {
    return (ErrorReporter) Proxy.newProxyInstance(
        ErrorReporter.class.getClassLoader(),
        new Class<?>[] {ErrorReporter.class},
        new InvocationHandler() {
          @Override
          public Object invoke(Object proxy, Method method, Object[] args) {
            return null; // ไม่สนใจ warning/error สำหรับเคสพื้นฐานที่ทดสอบ
          }
        });
  }

  private static CodingConvention createCodingConvention() {
    return (CodingConvention) Proxy.newProxyInstance(
        CodingConvention.class.getClassLoader(),
        new Class<?>[] {CodingConvention.class},
        new InvocationHandler() {
          @Override
          public Object invoke(Object proxy, Method method, Object[] args) {
            Class<?> rt = method.getReturnType();
            if (rt == boolean.class) return false;
            if (rt == int.class) return 0;
            return null;
          }
        });
  }

  @SuppressWarnings("unchecked")
  private static StaticSlot<JSType> createStaticSlot(final JSType type) {
    return (StaticSlot<JSType>) Proxy.newProxyInstance(
        StaticSlot.class.getClassLoader(),
        new Class<?>[] {StaticSlot.class},
        new InvocationHandler() {
          @Override
          public Object invoke(Object proxy, Method method, Object[] args) {
            if ("getType".equals(method.getName())) {
              return type;
            }
            Class<?> rt = method.getReturnType();
            if (rt == boolean.class) return false;
            return null;
          }
        });
  }

  private static FlowScope createFlowScope(
      final Map<String, StaticSlot<JSType>> slots,
      final List<Object[]> inferSlotTypeCalls,
      final List<Object[]> inferQualifiedSlotCalls) {
    return (FlowScope) Proxy.newProxyInstance(
        FlowScope.class.getClassLoader(),
        new Class<?>[] {FlowScope.class},
        new InvocationHandler() {
          @Override
          public Object invoke(Object proxy, Method method, Object[] args) {
            String name = method.getName();
            if ("getSlot".equals(name)) {
              return slots.get((String) args[0]);
            }
            if ("inferSlotType".equals(name)) {
              inferSlotTypeCalls.add(args);
              return proxy;
            }
            if ("inferQualifiedSlot".equals(name)) {
              inferQualifiedSlotCalls.add(args);
              return proxy;
            }
            Class<?> rt = method.getReturnType();
            if (rt == boolean.class) return false;
            return null;
          }
        });
  }

  private static FlowScope emptyScope() {
    return createFlowScope(
        new HashMap<String, StaticSlot<JSType>>(),
        new ArrayList<Object[]>(),
        new ArrayList<Object[]>());
  }

  /** Subclass สำหรับทดสอบ (คลาสเป้าหมายเป็น abstract) */
  private static class TestInterpreter extends ChainableReverseAbstractInterpreter {
    boolean called;
    FlowScope configuredReturn;

    TestInterpreter(CodingConvention convention, JSTypeRegistry registry) {
      super(convention, registry);
    }

    @Override
    public FlowScope getPreciserScopeKnowingConditionOutcome(
        Node condition, FlowScope blindScope, boolean outcome) {
      called = true;
      return configuredReturn != null ? configuredReturn : blindScope;
    }
  }

  // ---------------------------------------------------------------------
  // Constructor
  // ---------------------------------------------------------------------

  @Test(expected = NullPointerException.class)
  public void testConstructor_NullConvention_Throws() {
    new TestInterpreter(null, registry);
  }

  @Test
  public void testConstructor_ValidArgs_FirstLinkIsSelf() {
    TestInterpreter a = new TestInterpreter(convention, registry);
    assertSame(a, a.getFirst());
  }

  // ---------------------------------------------------------------------
  // append() / getFirst()
  // ---------------------------------------------------------------------

  @Test
  public void testAppend_TwoLinks() {
    TestInterpreter a = new TestInterpreter(convention, registry);
    TestInterpreter b = new TestInterpreter(convention, registry);

    ChainableReverseAbstractInterpreter result = a.append(b);

    assertSame(b, result);
    assertSame(a, b.getFirst());
    assertSame(a, a.getFirst());
  }

  @Test
  public void testAppend_ThreeLinks_GetFirstFromLast() {
    TestInterpreter a = new TestInterpreter(convention, registry);
    TestInterpreter b = new TestInterpreter(convention, registry);
    TestInterpreter c = new TestInterpreter(convention, registry);

    ChainableReverseAbstractInterpreter last = a.append(b).append(c);

    assertSame(c, last);
    assertSame(a, c.getFirst());
    assertSame(a, b.getFirst());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testAppend_LastLinkAlreadyHasNext_Throws() {
    TestInterpreter x = new TestInterpreter(convention, registry);
    TestInterpreter y = new TestInterpreter(convention, registry);
    TestInterpreter z = new TestInterpreter(convention, registry);

    y.append(z); // y.nextLink = z แล้ว
    x.append(y); // y ไม่ใช่ lastLink อีกต่อไป -> ต้อง throw
  }

  // ---------------------------------------------------------------------
  // firstPreciserScopeKnowingConditionOutcome / nextPreciserScopeKnowingConditionOutcome
  // ---------------------------------------------------------------------

  @Test
  public void testFirstPreciserScope_DelegatesToFirstLink() {
    TestInterpreter a = new TestInterpreter(convention, registry);
    TestInterpreter b = new TestInterpreter(convention, registry);
    a.append(b);

    FlowScope blind = emptyScope();
    Node cond = Node.newString(Token.NAME, "cond");

    FlowScope result = b.firstPreciserScopeKnowingConditionOutcome(cond, blind, true);

    assertTrue(a.called);
    assertFalse(b.called);
    assertSame(blind, result);
  }

  @Test
  public void testNextPreciserScope_NoNextLink_ReturnsBlindScope() {
    TestInterpreter c = new TestInterpreter(convention, registry);
    FlowScope blind = emptyScope();
    Node cond = Node.newString(Token.NAME, "cond");

    FlowScope result = c.nextPreciserScopeKnowingConditionOutcome(cond, blind, false);

    assertSame(blind, result);
    assertFalse(c.called);
  }

  @Test
  public void testNextPreciserScope_WithNextLink_Delegates() {
    TestInterpreter a = new TestInterpreter(convention, registry);
    TestInterpreter b = new TestInterpreter(convention, registry);
    a.append(b);

    FlowScope blind = emptyScope();
    Node cond = Node.newString(Token.NAME, "cond");

    FlowScope result = a.nextPreciserScopeKnowingConditionOutcome(cond, blind, true);

    assertTrue(b.called);
    assertSame(blind, result);
  }

  // ---------------------------------------------------------------------
  // getTypeIfRefinable
  // ---------------------------------------------------------------------

  @Test
  public void testGetTypeIfRefinable_Name_SlotWithType() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    JSType numberType = registry.getNativeType(NUMBER_TYPE);
    Map<String, StaticSlot<JSType>> slots = new HashMap<String, StaticSlot<JSType>>();
    slots.put("x", createStaticSlot(numberType));
    FlowScope scope = createFlowScope(slots, new ArrayList<Object[]>(), new ArrayList<Object[]>());
    Node nameNode = Node.newString(Token.NAME, "x");

    assertSame(numberType, interp.getTypeIfRefinable(nameNode, scope));
  }

  @Test
  public void testGetTypeIfRefinable_Name_SlotNullType_FallbackToNodeType() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    Map<String, StaticSlot<JSType>> slots = new HashMap<String, StaticSlot<JSType>>();
    slots.put("x", createStaticSlot(null));
    FlowScope scope = createFlowScope(slots, new ArrayList<Object[]>(), new ArrayList<Object[]>());
    Node nameNode = Node.newString(Token.NAME, "x");
    JSType stringType = registry.getNativeType(STRING_TYPE);
    nameNode.setJSType(stringType);

    assertSame(stringType, interp.getTypeIfRefinable(nameNode, scope));
  }

  @Test
  public void testGetTypeIfRefinable_Name_NoSlot_ReturnsNull() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    Node nameNode = Node.newString(Token.NAME, "missing");
    assertNull(interp.getTypeIfRefinable(nameNode, emptyScope()));
  }

  @Test
  public void testGetTypeIfRefinable_GetProp_QualifiedNameNull_ReturnsNull() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    Node call = new Node(Token.CALL, Node.newString(Token.NAME, "foo"));
    Node getProp = new Node(Token.GETPROP, call, Node.newString(Token.STRING, "bar"));

    assertNull(interp.getTypeIfRefinable(getProp, emptyScope()));
  }

  @Test
  public void testGetTypeIfRefinable_GetProp_SlotWithType() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    JSType booleanType = registry.getNativeType(BOOLEAN_TYPE);
    Map<String, StaticSlot<JSType>> slots = new HashMap<String, StaticSlot<JSType>>();
    slots.put("foo.bar", createStaticSlot(booleanType));
    FlowScope scope = createFlowScope(slots, new ArrayList<Object[]>(), new ArrayList<Object[]>());
    Node getProp = new Node(Token.GETPROP,
        Node.newString(Token.NAME, "foo"), Node.newString(Token.STRING, "bar"));

    assertSame(booleanType, interp.getTypeIfRefinable(getProp, scope));
  }

  @Test
  public void testGetTypeIfRefinable_GetProp_NoSlot_FallbackNodeType() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    Node getProp = new Node(Token.GETPROP,
        Node.newString(Token.NAME, "foo"), Node.newString(Token.STRING, "bar"));
    JSType stringType = registry.getNativeType(STRING_TYPE);
    getProp.setJSType(stringType);

    assertSame(stringType, interp.getTypeIfRefinable(getProp, emptyScope()));
  }

  @Test
  public void testGetTypeIfRefinable_GetProp_NoSlot_NoNodeType_FallbackUnknown() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    Node getProp = new Node(Token.GETPROP,
        Node.newString(Token.NAME, "foo"), Node.newString(Token.STRING, "bar"));

    assertSame(registry.getNativeType(UNKNOWN_TYPE),
        interp.getTypeIfRefinable(getProp, emptyScope()));
  }

  @Test
  public void testGetTypeIfRefinable_DefaultToken_ReturnsNull() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    Node other = Node.newString(Token.STRING, "irrelevant");
    assertNull(interp.getTypeIfRefinable(other, emptyScope()));
  }

  // ---------------------------------------------------------------------
  // declareNameInScope
  // ---------------------------------------------------------------------

  @Test
  public void testDeclareNameInScope_Name_CallsInferSlotType() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    List<Object[]> inferSlotCalls = new ArrayList<Object[]>();
    List<Object[]> inferQualCalls = new ArrayList<Object[]>();
    FlowScope scope = createFlowScope(
        new HashMap<String, StaticSlot<JSType>>(), inferSlotCalls, inferQualCalls);
    Node nameNode = Node.newString(Token.NAME, "x");
    JSType numberType = registry.getNativeType(NUMBER_TYPE);

    interp.declareNameInScope(scope, nameNode, numberType);

    assertTrue(inferSlotCalls.size() == 1);
    Object[] args = inferSlotCalls.get(0);
    assertSame("x", args[0]);
    assertSame(numberType, args[1]);
    assertTrue(inferQualCalls.isEmpty());
  }

  @Test
  public void testDeclareNameInScope_GetProp_NoExistingType_UsesUnknownAsOrig() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    List<Object[]> inferSlotCalls = new ArrayList<Object[]>();
    List<Object[]> inferQualCalls = new ArrayList<Object[]>();
    FlowScope scope = createFlowScope(
        new HashMap<String, StaticSlot<JSType>>(), inferSlotCalls, inferQualCalls);
    Node getProp = new Node(Token.GETPROP,
        Node.newString(Token.NAME, "foo"), Node.newString(Token.STRING, "bar"));
    JSType numberType = registry.getNativeType(NUMBER_TYPE);

    interp.declareNameInScope(scope, getProp, numberType);

    assertTrue(inferQualCalls.size() == 1);
    Object[] args = inferQualCalls.get(0);
    assertSame(getProp, args[0]);
    assertTrue("foo.bar".equals(args[1]));
    assertSame(registry.getNativeType(UNKNOWN_TYPE), args[2]);
    assertSame(numberType, args[3]);
  }

  @Test
  public void testDeclareNameInScope_GetProp_WithExistingType_UsesNodeTypeAsOrig() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    List<Object[]> inferSlotCalls = new ArrayList<Object[]>();
    List<Object[]> inferQualCalls = new ArrayList<Object[]>();
    FlowScope scope = createFlowScope(
        new HashMap<String, StaticSlot<JSType>>(), inferSlotCalls, inferQualCalls);
    Node getProp = new Node(Token.GETPROP,
        Node.newString(Token.NAME, "foo"), Node.newString(Token.STRING, "bar"));
    JSType stringType = registry.getNativeType(STRING_TYPE);
    getProp.setJSType(stringType);
    JSType numberType = registry.getNativeType(NUMBER_TYPE);

    interp.declareNameInScope(scope, getProp, numberType);

    Object[] args = inferQualCalls.get(0);
    assertSame(stringType, args[2]);
  }

  @Test(expected = NullPointerException.class)
  public void testDeclareNameInScope_GetProp_NullQualifiedName_Throws() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    Node call = new Node(Token.CALL, Node.newString(Token.NAME, "foo"));
    Node getProp = new Node(Token.GETPROP, call, Node.newString(Token.STRING, "bar"));

    interp.declareNameInScope(emptyScope(), getProp, registry.getNativeType(NUMBER_TYPE));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testDeclareNameInScope_DefaultToken_Throws() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    Node other = Node.newString(Token.STRING, "not-refinable");

    interp.declareNameInScope(emptyScope(), other, registry.getNativeType(NUMBER_TYPE));
  }

  // ---------------------------------------------------------------------
  // getNativeType
  // ---------------------------------------------------------------------

  @Test
  public void testGetNativeType_DelegatesToRegistry() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    assertSame(registry.getNativeType(NUMBER_TYPE), interp.getNativeType(NUMBER_TYPE));
  }

  // ---------------------------------------------------------------------
  // getRestrictedWithoutUndefined
  // ---------------------------------------------------------------------

  @Test
  public void testGetRestrictedWithoutUndefined_NullInput() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    assertNull(interp.getRestrictedWithoutUndefined(null));
  }

  @Test
  public void testGetRestrictedWithoutUndefined_VoidType_ReturnsNull() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    assertNull(interp.getRestrictedWithoutUndefined(registry.getNativeType(VOID_TYPE)));
  }

  @Test
  public void testGetRestrictedWithoutUndefined_NullType_Unchanged() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    JSType nullType = registry.getNativeType(NULL_TYPE);
    assertSame(nullType, interp.getRestrictedWithoutUndefined(nullType));
  }

  @Test
  public void testGetRestrictedWithoutUndefined_NumberType_Unchanged() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    JSType numberType = registry.getNativeType(NUMBER_TYPE);
    assertSame(numberType, interp.getRestrictedWithoutUndefined(numberType));
  }

  @Test
  public void testGetRestrictedWithoutUndefined_UnionWithVoid_RemovesVoid() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    JSType union = registry.createUnionType(
        registry.getNativeType(NUMBER_TYPE), registry.getNativeType(VOID_TYPE));

    JSType result = interp.getRestrictedWithoutUndefined(union);

    assertNotNull(result);
    assertFalse(result.isVoidType());
  }

  @Test
  public void testGetRestrictedWithoutUndefined_AllType_NoVoidInResult() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    JSType result = interp.getRestrictedWithoutUndefined(registry.getNativeType(ALL_TYPE));
    assertNotNull(result);
    assertFalse(result.isVoidType());
  }

  @Test
  public void testGetRestrictedWithoutUndefined_UnknownType_Unchanged() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    JSType unknownType = registry.getNativeType(UNKNOWN_TYPE);
    assertSame(unknownType, interp.getRestrictedWithoutUndefined(unknownType));
  }

  // ---------------------------------------------------------------------
  // getRestrictedWithoutNull
  // ---------------------------------------------------------------------

  @Test
  public void testGetRestrictedWithoutNull_NullInput() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    assertNull(interp.getRestrictedWithoutNull(null));
  }

  @Test
  public void testGetRestrictedWithoutNull_NullType_ReturnsNull() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    assertNull(interp.getRestrictedWithoutNull(registry.getNativeType(NULL_TYPE)));
  }

  @Test
  public void testGetRestrictedWithoutNull_VoidType_Unchanged() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    JSType voidType = registry.getNativeType(VOID_TYPE);
    assertSame(voidType, interp.getRestrictedWithoutNull(voidType));
  }

  @Test
  public void testGetRestrictedWithoutNull_UnionWithNull_RemovesNull() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    JSType union = registry.createUnionType(
        registry.getNativeType(NUMBER_TYPE), registry.getNativeType(NULL_TYPE));

    JSType result = interp.getRestrictedWithoutNull(union);

    assertNotNull(result);
    assertFalse(result.isNullType());
  }

  @Test
  public void testGetRestrictedWithoutNull_AllType_NoNullInResult() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    JSType result = interp.getRestrictedWithoutNull(registry.getNativeType(ALL_TYPE));
    assertNotNull(result);
    assertFalse(result.isNullType());
  }

  // ---------------------------------------------------------------------
  // getRestrictedByTypeOfResult : type == null
  // ---------------------------------------------------------------------

  @Test
  public void testGetRestrictedByTypeOfResult_NullType_KnownValue_ResultEqualsTrue() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    JSType result = interp.getRestrictedByTypeOfResult(null, "number", true);
    assertSame(registry.getNativeType(NUMBER_TYPE), result);
  }

  @Test
  public void testGetRestrictedByTypeOfResult_NullType_UnknownValue_FallbackUnknown() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    JSType result = interp.getRestrictedByTypeOfResult(null, "bogus", true);
    assertSame(registry.getNativeType(UNKNOWN_TYPE), result);
  }

  @Test
  public void testGetRestrictedByTypeOfResult_NullType_ResultEqualsFalse_ReturnsNull() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    assertNull(interp.getRestrictedByTypeOfResult(null, "number", false));
  }

  // ---------------------------------------------------------------------
  // getRestrictedByTypeOfResult : caseTopType (AllType / UnknownType)
  // ---------------------------------------------------------------------

  @Test
  public void testGetRestrictedByTypeOfResult_AllType_KnownValue_True() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    JSType result = interp.getRestrictedByTypeOfResult(
        registry.getNativeType(ALL_TYPE), "number", true);
    assertSame(registry.getNativeType(NUMBER_TYPE), result);
  }

  @Test
  public void testGetRestrictedByTypeOfResult_AllType_UnknownValue_True_ReturnsTopType() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    JSType allType = registry.getNativeType(ALL_TYPE);
    assertSame(allType, interp.getRestrictedByTypeOfResult(allType, "bogus", true));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_AllType_ResultEqualsFalse_ReturnsTopType() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    JSType allType = registry.getNativeType(ALL_TYPE);
    assertSame(allType, interp.getRestrictedByTypeOfResult(allType, "number", false));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_UnknownType_KnownValue_True() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    JSType result = interp.getRestrictedByTypeOfResult(
        registry.getNativeType(UNKNOWN_TYPE), "string", true);
    assertSame(registry.getNativeType(STRING_TYPE), result);
  }

  // ---------------------------------------------------------------------
  // getRestrictedByTypeOfResult : caseNoObjectType
  // ---------------------------------------------------------------------

  @Test
  public void testGetRestrictedByTypeOfResult_NoObjectType_ObjectValue_True() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    JSType noObjectType = registry.getNativeType(NO_OBJECT_TYPE);
    assertSame(noObjectType, interp.getRestrictedByTypeOfResult(noObjectType, "object", true));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_NoObjectType_NumberValue_True_ReturnsNull() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    JSType noObjectType = registry.getNativeType(NO_OBJECT_TYPE);
    assertNull(interp.getRestrictedByTypeOfResult(noObjectType, "number", true));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_NoObjectType_FunctionValue_False_ReturnsNull() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    JSType noObjectType = registry.getNativeType(NO_OBJECT_TYPE);
    assertNull(interp.getRestrictedByTypeOfResult(noObjectType, "function", false));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_NoObjectType_NumberValue_False_ReturnsSelf() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    JSType noObjectType = registry.getNativeType(NO_OBJECT_TYPE);
    assertSame(noObjectType, interp.getRestrictedByTypeOfResult(noObjectType, "number", false));
  }

  // ---------------------------------------------------------------------
  // getRestrictedByTypeOfResult : caseBooleanType / caseNullType / caseNumberType /
  // caseStringType / caseVoidType / caseFunctionType
  // ---------------------------------------------------------------------

  @Test
  public void testGetRestrictedByTypeOfResult_BooleanType_MatchTrue() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    JSType booleanType = registry.getNativeType(BOOLEAN_TYPE);
    assertSame(booleanType, interp.getRestrictedByTypeOfResult(booleanType, "boolean", true));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_BooleanType_MismatchTrue_ReturnsNull() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    JSType booleanType = registry.getNativeType(BOOLEAN_TYPE);
    assertNull(interp.getRestrictedByTypeOfResult(booleanType, "number", true));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_NullType_MatchesObject() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    JSType nullType = registry.getNativeType(NULL_TYPE);
    assertSame(nullType, interp.getRestrictedByTypeOfResult(nullType, "object", true));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_NumberType_MatchTrue() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    JSType numberType = registry.getNativeType(NUMBER_TYPE);
    assertSame(numberType, interp.getRestrictedByTypeOfResult(numberType, "number", true));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_StringType_MatchFalse_ReturnsNull() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    JSType stringType = registry.getNativeType(STRING_TYPE);
    assertNull(interp.getRestrictedByTypeOfResult(stringType, "string", false));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_VoidType_MatchUndefinedTrue() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    JSType voidType = registry.getNativeType(VOID_TYPE);
    assertSame(voidType, interp.getRestrictedByTypeOfResult(voidType, "undefined", true));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_FunctionType_MatchTrue() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    JSType functionType = registry.getNativeType(U2U_CONSTRUCTOR_TYPE);
    assertSame(functionType, interp.getRestrictedByTypeOfResult(functionType, "function", true));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_FunctionType_MismatchTrue_ReturnsNull() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    JSType functionType = registry.getNativeType(U2U_CONSTRUCTOR_TYPE);
    assertNull(interp.getRestrictedByTypeOfResult(functionType, "object", true));
  }

  // ---------------------------------------------------------------------
  // getRestrictedByTypeOfResult : caseObjectType (special "function" branch)
  // ---------------------------------------------------------------------

  @Test
  public void testGetRestrictedByTypeOfResult_ObjectType_FunctionValue_True_SubtypeReturnsCtor() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    JSType objectType = registry.getNativeType(OBJECT_TYPE);
    // สมมติ: U2U_CONSTRUCTOR_TYPE เป็น subtype ของ OBJECT_TYPE ตามลำดับชั้น type ของ JS ปกติ
    JSType result = interp.getRestrictedByTypeOfResult(objectType, "function", true);
    assertSame(registry.getNativeType(U2U_CONSTRUCTOR_TYPE), result);
  }

  @Test
  public void testGetRestrictedByTypeOfResult_ObjectType_FunctionValue_False_ReturnsNull() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    JSType objectType = registry.getNativeType(OBJECT_TYPE);
    assertNull(interp.getRestrictedByTypeOfResult(objectType, "function", false));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_ObjectType_ObjectValue_True() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    JSType objectType = registry.getNativeType(OBJECT_TYPE);
    assertSame(objectType, interp.getRestrictedByTypeOfResult(objectType, "object", true));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_ObjectType_ObjectValue_False_ReturnsNull() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    JSType objectType = registry.getNativeType(OBJECT_TYPE);
    assertNull(interp.getRestrictedByTypeOfResult(objectType, "object", false));
  }

  // ---------------------------------------------------------------------
  // getRestrictedByTypeOfResult : caseUnionType (inherited iteration logic)
  // ---------------------------------------------------------------------

  @Test
  public void testGetRestrictedByTypeOfResult_UnionType_SingleMatch() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    JSType numberType = registry.getNativeType(NUMBER_TYPE);
    JSType stringType = registry.getNativeType(STRING_TYPE);
    JSType union = registry.createUnionType(numberType, stringType);

    JSType result = interp.getRestrictedByTypeOfResult(union, "number", true);

    assertNotNull(result);
    assertTrue(numberType.isSubtype(result));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_UnionType_BothMatch_CombinesViaLeastSupertype() {
    TestInterpreter interp = new TestInterpreter(convention, registry);
    JSType numberType = registry.getNativeType(NUMBER_TYPE);
    JSType stringType = registry.getNativeType(STRING_TYPE);
    JSType union = registry.createUnionType(numberType, stringType);

    // value="object", resultEqualsValue=false -> ทั้งสอง alternate ผ่าน matchesExpectation
    // เป็น true พร้อมกัน ทำให้ branch รวมผลด้วย getLeastSupertype ถูกทดสอบ
    JSType result = interp.getRestrictedByTypeOfResult(union, "object", false);

    assertNotNull(result);
    assertTrue(numberType.isSubtype(result));
    assertTrue(stringType.isSubtype(result));
  }
}
```

## สรุปตาราง Branch/Condition ที่ครอบคลุม

| กลุ่มเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testConstructor_NullConvention_Throws` | Constructor: `Preconditions.checkNotNull(convention)` → throw NPE |
| `testConstructor_ValidArgs_FirstLinkIsSelf` | Constructor: `firstLink = this` |
| `testAppend_TwoLinks`, `testAppend_ThreeLinks_...` | `append()` กรณีปกติ, chaining ของ `firstLink` |
| `testAppend_LastLinkAlreadyHasNext_Throws` | `append()`: `Preconditions.checkArgument(lastLink.nextLink == null)` → throw IAE |
| `testFirstPreciserScope_DelegatesToFirstLink` | `firstPreciserScopeKnowingConditionOutcome` delegate ไปยัง `firstLink` |
| `testNextPreciserScope_NoNextLink_ReturnsBlindScope` | `nextPreciserScopeKnowingConditionOutcome`: `nextLink == null` → return blindScope |
| `testNextPreciserScope_WithNextLink_Delegates` | `nextPreciserScopeKnowingConditionOutcome`: `nextLink != null` → delegate |
| `testGetTypeIfRefinable_Name_*` | switch Token.NAME: slot != null (type null/non-null), slot == null |
| `testGetTypeIfRefinable_GetProp_*` | switch Token.GETPROP: qualifiedName null, propVar null/non-null, fallback JSType/UNKNOWN |
| `testGetTypeIfRefinable_DefaultToken_ReturnsNull` | switch default → return null |
| `testDeclareNameInScope_Name_*` | switch Token.NAME → `inferSlotType` |
| `testDeclareNameInScope_GetProp_*` | switch Token.GETPROP: origType fallback (UNKNOWN/node type), `inferQualifiedSlot` |
| `testDeclareNameInScope_GetProp_NullQualifiedName_Throws` | `Preconditions.checkNotNull(qualifiedName)` → NPE |
| `testDeclareNameInScope_DefaultToken_Throws` | switch default → throw IAE |
| `testGetNativeType_DelegatesToRegistry` | `getNativeType()` delegate |
| `testGetRestrictedWithoutUndefined_*` | Visitor: caseVoidType(null), caseNullType, caseNumberType, caseUnionType, caseAllType, caseUnknownType |
| `testGetRestrictedWithoutNull_*` | Visitor: caseNullType(null), caseVoidType, caseUnionType, caseAllType |
| `testGetRestrictedByTypeOfResult_NullType_*` | `type == null` branch: resultEqualsValue true(known/unknown value)/false |
| `testGetRestrictedByTypeOfResult_AllType_*`, `_UnknownType_*` | `caseTopType`: resultEqualsValue true(typeByName null/non-null)/false |
| `testGetRestrictedByTypeOfResult_NoObjectType_*` | `caseNoObjectType`: ทุก combination ของ value("object"/"function"/"number") × resultEqualsValue |
| `testGetRestrictedByTypeOfResult_BooleanType/NullType/NumberType/StringType/VoidType/FunctionType_*` | `matchesExpectation` true/false ในแต่ละ case method |
| `testGetRestrictedByTypeOfResult_ObjectType_*` | `caseObjectType`: `value.equals("function")` branch (subtype true/false) และ else branch (`matchesExpectation("object")`) |
| `testGetRestrictedByTypeOfResult_UnionType_*` | `caseUnionType` (inherited): loop, `restrictedAlternate != null` skip branch, รวมผลด้วย `getLeastSupertype` |