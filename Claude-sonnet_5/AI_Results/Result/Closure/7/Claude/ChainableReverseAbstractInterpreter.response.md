# วิเคราะห์และแนวทางการทดสอบ

`ChainableReverseAbstractInterpreter` เป็น abstract class ที่พึ่งพา `Node`, `JSType`, `JSTypeRegistry` (คลาสจริงของ Closure Compiler ที่คอมไพล์อยู่ใน source tree เดียวกัน) และ `FlowScope`/`StaticSlot` (interface ที่ **ไม่ได้แสดง signature เต็มในซอร์สที่ให้มา**)

**หมายเหตุสำคัญ (ตามข้อกำหนดห้ามเดา behavior):**
- เนื่องจาก `FlowScope` และ `StaticSlot<JSType>` ไม่มี source ให้ดู ผมจึงใช้ `java.lang.reflect.Proxy` สร้าง test-double ที่ intercept **เฉพาะ method ที่เห็นการเรียกใช้จริงในซอร์ส** คือ `getSlot`, `inferSlotType`, `inferQualifiedSlot` (ของ FlowScope) และ `getType` (ของ StaticSlot) เท่านั้น — ไม่เดา method อื่น ๆ ที่ไม่ถูกเรียกใช้
- `caseEnumElementType` (ทั้งใน restrictUndefinedVisitor/restrictNullVisitor/RestrictByTypeOfResultVisitor) **ไม่ได้ทดสอบตรง** เพราะไม่แน่ใจ API การสร้าง `EnumElementType` จาก `JSTypeRegistry` ในเวอร์ชันนี้ — กำกับด้วยคอมเมนต์ในโค้ด
- ความสัมพันธ์ `isSubtype` ระหว่าง `U2U_CONSTRUCTOR_TYPE` กับ native object type อื่น ๆ (เช่น ARRAY_TYPE) ไม่แน่ใจ 100% จึงทดสอบเฉพาะกรณีที่มั่นใจ (Function is-subtype-of Object) และกำกับคอมเมนต์จุดที่ไม่ทดสอบ
- `convention` field ไม่ถูกใช้งานจริงในเมธอดใด ๆ ของคลาสนี้ (ตรวจสอบจากซอร์สแล้ว) จึงใช้ `GoogleCodingConvention` เพียงเพื่อผ่าน null-check ใน constructor เท่านั้น

```java
package com.google.javascript.jscomp.type;

import static com.google.javascript.rhino.jstype.JSTypeNative.ALL_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.CHECKED_UNKNOWN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.U2U_CONSTRUCTOR_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.StaticSlot;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Unit tests for {@link ChainableReverseAbstractInterpreter}.
 *
 * หมายเหตุ: FlowScope / StaticSlot ไม่มี source ให้ดูในโจทย์นี้ จึงใช้
 * java.lang.reflect.Proxy จำลอง behavior เฉพาะ method ที่ถูกเรียกใช้จริง
 * ในซอร์สโค้ดเป้าหมาย (getSlot, inferSlotType, inferQualifiedSlot, getType)
 */
public class ChainableReverseAbstractInterpreterTest {

  private static final ErrorReporter TEST_ERROR_REPORTER = new ErrorReporter() {
    @Override
    public void warning(String message, String sourceName, int line, int lineOffset) {}
    @Override
    public void error(String message, String sourceName, int line, int lineOffset) {}
  };

  private JSTypeRegistry registry;
  private CodingConvention convention;
  private TestInterpreter interpreter;

  /** Concrete subclass เพื่อให้ instantiate ได้ (คลาสเป้าหมายเป็น abstract) */
  private static class TestInterpreter extends ChainableReverseAbstractInterpreter {
    FlowScope scopeToReturn;
    Node lastCondition;
    FlowScope lastBlindScope;
    Boolean lastOutcome;
    int callCount = 0;

    TestInterpreter(CodingConvention convention, JSTypeRegistry registry) {
      super(convention, registry);
    }

    @Override
    public FlowScope getPreciserScopeKnowingConditionOutcome(
        Node condition, FlowScope blindScope, boolean outcome) {
      callCount++;
      lastCondition = condition;
      lastBlindScope = blindScope;
      lastOutcome = outcome;
      return scopeToReturn != null ? scopeToReturn : blindScope;
    }
  }

  @Before
  public void setUp() {
    convention = new GoogleCodingConvention();
    registry = new JSTypeRegistry(TEST_ERROR_REPORTER);
    interpreter = new TestInterpreter(convention, registry);
  }

  private JSType getNative(JSTypeNative type) {
    return registry.getNativeType(type);
  }

  // ---------- Proxy helpers สำหรับ FlowScope / StaticSlot ----------

  @SuppressWarnings("unchecked")
  private StaticSlot<JSType> makeSlot(final JSType type) {
    return (StaticSlot<JSType>) java.lang.reflect.Proxy.newProxyInstance(
        getClass().getClassLoader(),
        new Class<?>[] { StaticSlot.class },
        new InvocationHandler() {
          @Override
          public Object invoke(Object proxy, Method method, Object[] args) {
            if ("getType".equals(method.getName())) {
              return type;
            }
            return null;
          }
        });
  }

  private FlowScope makeFlowScope(final Map<String, StaticSlot<JSType>> slots,
      final List<Object[]> inferSlotCalls, final List<Object[]> inferQualifiedCalls) {
    return (FlowScope) java.lang.reflect.Proxy.newProxyInstance(
        getClass().getClassLoader(),
        new Class<?>[] { FlowScope.class },
        new InvocationHandler() {
          @Override
          public Object invoke(Object proxy, Method method, Object[] args) {
            String name = method.getName();
            if ("getSlot".equals(name)) {
              return slots.get((String) args[0]);
            }
            if ("inferSlotType".equals(name)) {
              inferSlotCalls.add(args);
              slots.put((String) args[0], makeSlot((JSType) args[1]));
              return null;
            }
            if ("inferQualifiedSlot".equals(name)) {
              // ลำดับ arg อ้างจากการเรียกจริงใน source:
              // scope.inferQualifiedSlot(node, qualifiedName, origType, type)
              inferQualifiedCalls.add(args);
              slots.put((String) args[1], makeSlot((JSType) args[3]));
              return null;
            }
            if ("equals".equals(name)) {
              return proxy == args[0];
            }
            if ("hashCode".equals(name)) {
              return System.identityHashCode(proxy);
            }
            return null;
          }
        });
  }

  private FlowScope emptyScope() {
    return makeFlowScope(new HashMap<String, StaticSlot<JSType>>(),
        new ArrayList<Object[]>(), new ArrayList<Object[]>());
  }

  // ================= Constructor =================

  @Test(expected = NullPointerException.class)
  public void testConstructor_NullConvention_ThrowsNPE() {
    new TestInterpreter(null, registry);
  }

  @Test
  public void testConstructor_ValidConvention_FirstLinkIsSelf() {
    TestInterpreter ti = new TestInterpreter(convention, registry);
    assertSame(ti, ti.getFirst());
  }

  // ================= append() / getFirst() =================

  @Test
  public void testAppend_UpdatesNextLinkAndFirstLink() {
    TestInterpreter second = new TestInterpreter(convention, registry);
    ChainableReverseAbstractInterpreter result = interpreter.append(second);
    assertSame(second, result);
    assertSame(interpreter, second.getFirst());
    assertSame(interpreter, interpreter.getFirst());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testAppend_LastLinkAlreadyHasNext_ThrowsIAE() {
    TestInterpreter second = new TestInterpreter(convention, registry);
    TestInterpreter third = new TestInterpreter(convention, registry);
    second.append(third); // second.nextLink != null แล้ว
    interpreter.append(second); // ต้อง throw
  }

  @Test(expected = NullPointerException.class)
  public void testAppend_NullLastLink_ThrowsNPE() {
    interpreter.append(null);
  }

  // ========== firstPreciserScopeKnowingConditionOutcome / nextPreciserScopeKnowingConditionOutcome ==========

  @Test
  public void testNextPreciserScope_NoNextLink_ReturnsBlindScopeUnchanged() {
    FlowScope blind = emptyScope();
    Node cond = Node.newString(Token.NAME, "x");
    FlowScope result = interpreter.nextPreciserScopeKnowingConditionOutcome(cond, blind, true);
    assertSame(blind, result);
    assertEquals(0, interpreter.callCount);
  }

  @Test
  public void testNextPreciserScope_WithNextLink_DelegatesToNext() {
    TestInterpreter second = new TestInterpreter(convention, registry);
    interpreter.append(second);
    FlowScope blind = emptyScope();
    FlowScope marker = emptyScope();
    second.scopeToReturn = marker;
    Node cond = Node.newString(Token.NAME, "y");

    FlowScope result = interpreter.nextPreciserScopeKnowingConditionOutcome(cond, blind, false);

    assertSame(marker, result);
    assertEquals(1, second.callCount);
    assertSame(cond, second.lastCondition);
    assertSame(blind, second.lastBlindScope);
    assertEquals(Boolean.FALSE, second.lastOutcome);
  }

  @Test
  public void testFirstPreciserScope_DelegatesToFirstLink() {
    TestInterpreter second = new TestInterpreter(convention, registry);
    interpreter.append(second); // second.getFirst() == interpreter
    FlowScope blind = emptyScope();
    FlowScope marker = emptyScope();
    interpreter.scopeToReturn = marker;
    Node cond = Node.newString(Token.NAME, "z");

    FlowScope result = second.firstPreciserScopeKnowingConditionOutcome(cond, blind, true);

    assertSame(marker, result);
    assertEquals(1, interpreter.callCount);
  }

  // ================= getTypeIfRefinable() =================

  @Test(expected = NullPointerException.class)
  public void testGetTypeIfRefinable_NullNode_ThrowsNPE() {
    interpreter.getTypeIfRefinable(null, emptyScope());
  }

  @Test
  public void testGetTypeIfRefinable_NameNode_SlotFoundWithType() {
    Node nameNode = Node.newString(Token.NAME, "x");
    Map<String, StaticSlot<JSType>> slots = new HashMap<String, StaticSlot<JSType>>();
    slots.put("x", makeSlot(getNative(NUMBER_TYPE)));
    FlowScope scope = makeFlowScope(slots, new ArrayList<Object[]>(), new ArrayList<Object[]>());

    assertSame(getNative(NUMBER_TYPE), interpreter.getTypeIfRefinable(nameNode, scope));
  }

  @Test
  public void testGetTypeIfRefinable_NameNode_SlotTypeNull_UsesNodeJSType() {
    Node nameNode = Node.newString(Token.NAME, "x");
    nameNode.setJSType(getNative(STRING_TYPE));
    Map<String, StaticSlot<JSType>> slots = new HashMap<String, StaticSlot<JSType>>();
    slots.put("x", makeSlot(null)); // slot มีอยู่แต่ type เป็น null
    FlowScope scope = makeFlowScope(slots, new ArrayList<Object[]>(), new ArrayList<Object[]>());

    assertSame(getNative(STRING_TYPE), interpreter.getTypeIfRefinable(nameNode, scope));
  }

  @Test
  public void testGetTypeIfRefinable_NameNode_SlotNotFound_ReturnsNull() {
    Node nameNode = Node.newString(Token.NAME, "y");
    assertNull(interpreter.getTypeIfRefinable(nameNode, emptyScope()));
  }

  @Test
  public void testGetTypeIfRefinable_GetPropNode_QualifiedNameNull_ReturnsNull() {
    // receiver เป็น CALL node -> getQualifiedName() ต้องเป็น null
    Node call = new Node(Token.CALL, Node.newString(Token.NAME, "foo"));
    Node getProp = new Node(Token.GETPROP, call, Node.newString("bar"));
    assertNull(interpreter.getTypeIfRefinable(getProp, emptyScope()));
  }

  @Test
  public void testGetTypeIfRefinable_GetPropNode_SlotFound_ReturnsSlotType() {
    Node receiver = Node.newString(Token.NAME, "obj");
    Node getProp = new Node(Token.GETPROP, receiver, Node.newString("prop"));
    Map<String, StaticSlot<JSType>> slots = new HashMap<String, StaticSlot<JSType>>();
    slots.put("obj.prop", makeSlot(getNative(BOOLEAN_TYPE)));
    FlowScope scope = makeFlowScope(slots, new ArrayList<Object[]>(), new ArrayList<Object[]>());

    assertSame(getNative(BOOLEAN_TYPE), interpreter.getTypeIfRefinable(getProp, scope));
  }

  @Test
  public void testGetTypeIfRefinable_GetPropNode_NoSlot_UsesNodeJSType() {
    Node receiver = Node.newString(Token.NAME, "obj2");
    Node getProp = new Node(Token.GETPROP, receiver, Node.newString("prop2"));
    getProp.setJSType(getNative(BOOLEAN_TYPE));

    assertSame(getNative(BOOLEAN_TYPE), interpreter.getTypeIfRefinable(getProp, emptyScope()));
  }

  @Test
  public void testGetTypeIfRefinable_GetPropNode_NoSlotNoNodeType_ReturnsUnknown() {
    Node receiver = Node.newString(Token.NAME, "obj3");
    Node getProp = new Node(Token.GETPROP, receiver, Node.newString("prop3"));

    assertSame(getNative(UNKNOWN_TYPE), interpreter.getTypeIfRefinable(getProp, emptyScope()));
  }

  @Test
  public void testGetTypeIfRefinable_OtherToken_ReturnsNull() {
    Node numberNode = Node.newNumber(42);
    assertNull(interpreter.getTypeIfRefinable(numberNode, emptyScope()));
  }

  // ================= declareNameInScope() =================

  @Test(expected = NullPointerException.class)
  public void testDeclareNameInScope_NullNode_ThrowsNPE() {
    interpreter.declareNameInScope(emptyScope(), null, getNative(NUMBER_TYPE));
  }

  @Test
  public void testDeclareNameInScope_NameNode_CallsInferSlotType() {
    Node nameNode = Node.newString(Token.NAME, "x");
    List<Object[]> inferCalls = new ArrayList<Object[]>();
    FlowScope scope = makeFlowScope(
        new HashMap<String, StaticSlot<JSType>>(), inferCalls, new ArrayList<Object[]>());

    interpreter.declareNameInScope(scope, nameNode, getNative(NUMBER_TYPE));

    assertEquals(1, inferCalls.size());
    assertEquals("x", inferCalls.get(0)[0]);
    assertSame(getNative(NUMBER_TYPE), inferCalls.get(0)[1]);
  }

  @Test
  public void testDeclareNameInScope_GetPropNode_CallsInferQualifiedSlot() {
    Node receiver = Node.newString(Token.NAME, "obj");
    Node getProp = new Node(Token.GETPROP, receiver, Node.newString("prop"));
    getProp.setJSType(getNative(STRING_TYPE)); // origType

    List<Object[]> qualifiedCalls = new ArrayList<Object[]>();
    FlowScope scope = makeFlowScope(
        new HashMap<String, StaticSlot<JSType>>(), new ArrayList<Object[]>(), qualifiedCalls);

    interpreter.declareNameInScope(scope, getProp, getNative(NUMBER_TYPE));

    assertEquals(1, qualifiedCalls.size());
    Object[] callArgs = qualifiedCalls.get(0);
    assertSame(getProp, callArgs[0]);
    assertEquals("obj.prop", callArgs[1]);
    assertSame(getNative(STRING_TYPE), callArgs[2]);
    assertSame(getNative(NUMBER_TYPE), callArgs[3]);
  }

  @Test
  public void testDeclareNameInScope_GetPropNode_NoJSType_UsesUnknownAsOrigType() {
    Node receiver = Node.newString(Token.NAME, "obj4");
    Node getProp = new Node(Token.GETPROP, receiver, Node.newString("prop4"));
    // ไม่ setJSType -> origType เป็น null -> ต้องถูกแทนด้วย UNKNOWN_TYPE

    List<Object[]> qualifiedCalls = new ArrayList<Object[]>();
    FlowScope scope = makeFlowScope(
        new HashMap<String, StaticSlot<JSType>>(), new ArrayList<Object[]>(), qualifiedCalls);

    interpreter.declareNameInScope(scope, getProp, getNative(BOOLEAN_TYPE));

    assertSame(getNative(UNKNOWN_TYPE), qualifiedCalls.get(0)[2]);
  }

  @Test(expected = NullPointerException.class)
  public void testDeclareNameInScope_GetPropNode_NullQualifiedName_ThrowsNPE() {
    Node call = new Node(Token.CALL, Node.newString(Token.NAME, "foo"));
    Node getProp = new Node(Token.GETPROP, call, Node.newString("bar"));
    interpreter.declareNameInScope(emptyScope(), getProp, getNative(NUMBER_TYPE));
  }

  @Test
  public void testDeclareNameInScope_ThisNode_NoOp() {
    Node thisNode = new Node(Token.THIS);
    // ต้องไม่ throw exception
    interpreter.declareNameInScope(emptyScope(), thisNode, getNative(NUMBER_TYPE));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testDeclareNameInScope_DefaultToken_ThrowsIAE() {
    Node numberNode = Node.newNumber(1);
    interpreter.declareNameInScope(emptyScope(), numberNode, getNative(NUMBER_TYPE));
  }

  // ================= getRestrictedWithoutUndefined() =================

  @Test
  public void testGetRestrictedWithoutUndefined_NullInput_ReturnsNull() {
    assertNull(interpreter.getRestrictedWithoutUndefined(null));
  }

  @Test
  public void testGetRestrictedWithoutUndefined_SimpleNativeTypes_Unchanged() {
    assertSame(getNative(NO_OBJECT_TYPE),
        interpreter.getRestrictedWithoutUndefined(getNative(NO_OBJECT_TYPE)));
    assertSame(getNative(NO_TYPE),
        interpreter.getRestrictedWithoutUndefined(getNative(NO_TYPE)));
    assertSame(getNative(BOOLEAN_TYPE),
        interpreter.getRestrictedWithoutUndefined(getNative(BOOLEAN_TYPE)));
    assertSame(getNative(U2U_CONSTRUCTOR_TYPE),
        interpreter.getRestrictedWithoutUndefined(getNative(U2U_CONSTRUCTOR_TYPE)));
    assertSame(getNative(NULL_TYPE),
        interpreter.getRestrictedWithoutUndefined(getNative(NULL_TYPE)));
    assertSame(getNative(NUMBER_TYPE),
        interpreter.getRestrictedWithoutUndefined(getNative(NUMBER_TYPE)));
    assertSame(getNative(OBJECT_TYPE),
        interpreter.getRestrictedWithoutUndefined(getNative(OBJECT_TYPE)));
    assertSame(getNative(STRING_TYPE),
        interpreter.getRestrictedWithoutUndefined(getNative(STRING_TYPE)));
    assertSame(getNative(UNKNOWN_TYPE),
        interpreter.getRestrictedWithoutUndefined(getNative(UNKNOWN_TYPE)));
  }

  @Test
  public void testGetRestrictedWithoutUndefined_VoidType_ReturnsNull() {
    assertNull(interpreter.getRestrictedWithoutUndefined(getNative(VOID_TYPE)));
  }

  @Test
  public void testGetRestrictedWithoutUndefined_UnionType_RemovesVoid() {
    JSType union = registry.createUnionType(NUMBER_TYPE, VOID_TYPE);
    JSType result = interpreter.getRestrictedWithoutUndefined(union);
    assertNotNull(result);
    assertTrue(result.isEquivalentTo(getNative(NUMBER_TYPE)));
  }

  @Test
  public void testGetRestrictedWithoutUndefined_AllType_ReturnsNonNull() {
    // ตามซอร์สควรได้ union(OBJECT,NUMBER,STRING,BOOLEAN,NULL)
    // ไม่ตรวจสอบสมาชิกละเอียด เนื่องจากไม่มั่นใจ API ตรวจสอบสมาชิก union แบบเจาะจง
    JSType result = interpreter.getRestrictedWithoutUndefined(getNative(ALL_TYPE));
    assertNotNull(result);
  }

  // ================= getRestrictedWithoutNull() =================

  @Test
  public void testGetRestrictedWithoutNull_NullInput_ReturnsNull() {
    assertNull(interpreter.getRestrictedWithoutNull(null));
  }

  @Test
  public void testGetRestrictedWithoutNull_SimpleNativeTypes_Unchanged() {
    assertSame(getNative(NO_OBJECT_TYPE),
        interpreter.getRestrictedWithoutNull(getNative(NO_OBJECT_TYPE)));
    assertSame(getNative(NO_TYPE),
        interpreter.getRestrictedWithoutNull(getNative(NO_TYPE)));
    assertSame(getNative(BOOLEAN_TYPE),
        interpreter.getRestrictedWithoutNull(getNative(BOOLEAN_TYPE)));
    assertSame(getNative(U2U_CONSTRUCTOR_TYPE),
        interpreter.getRestrictedWithoutNull(getNative(U2U_CONSTRUCTOR_TYPE)));
    assertSame(getNative(NUMBER_TYPE),
        interpreter.getRestrictedWithoutNull(getNative(NUMBER_TYPE)));
    assertSame(getNative(OBJECT_TYPE),
        interpreter.getRestrictedWithoutNull(getNative(OBJECT_TYPE)));
    assertSame(getNative(STRING_TYPE),
        interpreter.getRestrictedWithoutNull(getNative(STRING_TYPE)));
    assertSame(getNative(UNKNOWN_TYPE),
        interpreter.getRestrictedWithoutNull(getNative(UNKNOWN_TYPE)));
  }

  @Test
  public void testGetRestrictedWithoutNull_NullType_ReturnsNull() {
    assertNull(interpreter.getRestrictedWithoutNull(getNative(NULL_TYPE)));
  }

  @Test
  public void testGetRestrictedWithoutNull_VoidType_Unchanged() {
    assertSame(getNative(VOID_TYPE), interpreter.getRestrictedWithoutNull(getNative(VOID_TYPE)));
  }

  @Test
  public void testGetRestrictedWithoutNull_UnionType_RemovesNull() {
    JSType union = registry.createUnionType(NUMBER_TYPE, NULL_TYPE);
    JSType result = interpreter.getRestrictedWithoutNull(union);
    assertNotNull(result);
    assertTrue(result.isEquivalentTo(getNative(NUMBER_TYPE)));
  }

  @Test
  public void testGetRestrictedWithoutNull_AllType_ReturnsNonNull() {
    JSType result = interpreter.getRestrictedWithoutNull(getNative(ALL_TYPE));
    assertNotNull(result);
  }

  // ================= getRestrictedByTypeOfResult() =================

  @Test
  public void testGetRestrictedByTypeOfResult_NullType_EqualsTrue_KnownValue() {
    assertSame(getNative(NUMBER_TYPE),
        interpreter.getRestrictedByTypeOfResult(null, "number", true));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_NullType_EqualsTrue_UnknownValue() {
    assertSame(getNative(CHECKED_UNKNOWN_TYPE),
        interpreter.getRestrictedByTypeOfResult(null, "object", true));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_EmptyValueString_ReturnsCheckedUnknown() {
    // ค่าว่าง (boundary/malformed input)
    assertSame(getNative(CHECKED_UNKNOWN_TYPE),
        interpreter.getRestrictedByTypeOfResult(null, "", true));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_NullType_EqualsFalse_ReturnsNull() {
    assertNull(interpreter.getRestrictedByTypeOfResult(null, "number", false));
  }

  @Test(expected = NullPointerException.class)
  public void testGetRestrictedByTypeOfResult_NullValueString_ThrowsNPE() {
    // malformed input: value = null ขณะ type=null, resultEqualsValue=true
    interpreter.getRestrictedByTypeOfResult(null, null, true);
  }

  @Test
  public void testGetRestrictedByTypeOfResult_NumberType_MatchesTrue() {
    assertSame(getNative(NUMBER_TYPE),
        interpreter.getRestrictedByTypeOfResult(getNative(NUMBER_TYPE), "number", true));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_NumberType_NoMatchTrue_ReturnsNull() {
    assertNull(interpreter.getRestrictedByTypeOfResult(getNative(NUMBER_TYPE), "string", true));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_NumberType_NoMatchFalse_ReturnsType() {
    assertSame(getNative(NUMBER_TYPE),
        interpreter.getRestrictedByTypeOfResult(getNative(NUMBER_TYPE), "string", false));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_BooleanType() {
    assertSame(getNative(BOOLEAN_TYPE),
        interpreter.getRestrictedByTypeOfResult(getNative(BOOLEAN_TYPE), "boolean", true));
    assertNull(interpreter.getRestrictedByTypeOfResult(getNative(BOOLEAN_TYPE), "number", true));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_StringType() {
    assertSame(getNative(STRING_TYPE),
        interpreter.getRestrictedByTypeOfResult(getNative(STRING_TYPE), "string", true));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_VoidType() {
    assertSame(getNative(VOID_TYPE),
        interpreter.getRestrictedByTypeOfResult(getNative(VOID_TYPE), "undefined", true));
    assertNull(interpreter.getRestrictedByTypeOfResult(getNative(VOID_TYPE), "object", true));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_NullType_MatchesObject() {
    assertSame(getNative(NULL_TYPE),
        interpreter.getRestrictedByTypeOfResult(getNative(NULL_TYPE), "object", true));
    assertNull(interpreter.getRestrictedByTypeOfResult(getNative(NULL_TYPE), "number", true));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_FunctionType() {
    JSType fnType = getNative(U2U_CONSTRUCTOR_TYPE);
    assertSame(fnType, interpreter.getRestrictedByTypeOfResult(fnType, "function", true));
    assertNull(interpreter.getRestrictedByTypeOfResult(fnType, "object", true));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_NoObjectType() {
    JSType noObj = getNative(NO_OBJECT_TYPE);
    assertSame(getNative(NO_OBJECT_TYPE),
        interpreter.getRestrictedByTypeOfResult(noObj, "object", true));
    assertSame(getNative(NO_OBJECT_TYPE),
        interpreter.getRestrictedByTypeOfResult(noObj, "function", true));
    assertNull(interpreter.getRestrictedByTypeOfResult(noObj, "number", true));
    assertSame(getNative(NO_OBJECT_TYPE),
        interpreter.getRestrictedByTypeOfResult(noObj, "number", false));
    assertNull(interpreter.getRestrictedByTypeOfResult(noObj, "object", false));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_ObjectType_NonFunctionValue() {
    JSType obj = getNative(OBJECT_TYPE);
    assertSame(obj, interpreter.getRestrictedByTypeOfResult(obj, "object", true));
    assertNull(interpreter.getRestrictedByTypeOfResult(obj, "number", true));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_ObjectType_FunctionValue_Subtype() {
    // สมมติฐาน: U2U_CONSTRUCTOR_TYPE (Function) เป็น subtype ของ OBJECT_TYPE
    // (ความสัมพันธ์มาตรฐานของ JS type lattice) — กำกับไว้เพราะไม่มีการยืนยันจาก source ที่ให้มา
    JSType obj = getNative(OBJECT_TYPE);
    JSType result = interpreter.getRestrictedByTypeOfResult(obj, "function", true);
    assertSame(getNative(U2U_CONSTRUCTOR_TYPE), result);
  }

  @Test
  public void testGetRestrictedByTypeOfResult_ObjectType_FunctionValue_ResultEqualsValueFalse() {
    JSType obj = getNative(OBJECT_TYPE);
    assertNull(interpreter.getRestrictedByTypeOfResult(obj, "function", false));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_NoType() {
    assertSame(getNative(NO_TYPE),
        interpreter.getRestrictedByTypeOfResult(getNative(NO_TYPE), "number", true));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_AllType_KnownValueTrue() {
    assertSame(getNative(NUMBER_TYPE),
        interpreter.getRestrictedByTypeOfResult(getNative(ALL_TYPE), "number", true));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_AllType_UnknownValueTrue() {
    assertSame(getNative(ALL_TYPE),
        interpreter.getRestrictedByTypeOfResult(getNative(ALL_TYPE), "object", true));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_AllType_ResultEqualsValueFalse() {
    assertSame(getNative(ALL_TYPE),
        interpreter.getRestrictedByTypeOfResult(getNative(ALL_TYPE), "number", false));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_UnknownType_KnownValueTrue() {
    assertSame(getNative(STRING_TYPE),
        interpreter.getRestrictedByTypeOfResult(getNative(UNKNOWN_TYPE), "string", true));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_UnionType_HasMatch() {
    JSType union = registry.createUnionType(NUMBER_TYPE, STRING_TYPE);
    JSType result = interpreter.getRestrictedByTypeOfResult(union, "number", true);
    assertNotNull(result);
    assertTrue(result.isEquivalentTo(getNative(NUMBER_TYPE)));
  }

  @Test
  public void testGetRestrictedByTypeOfResult_UnionType_NoMatch_ReturnsNull() {
    JSType union = registry.createUnionType(NUMBER_TYPE, STRING_TYPE);
    JSType result = interpreter.getRestrictedByTypeOfResult(union, "boolean", true);
    assertNull(result);
  }

  // ================= getNativeType() =================

  @Test
  public void testGetNativeType_DelegatesToRegistry() {
    assertSame(registry.getNativeType(NUMBER_TYPE), interpreter.getNativeType(NUMBER_TYPE));
  }
}
```

## สรุปการครอบคลุม (Branch/Condition Coverage)

| กลุ่มเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testConstructor_*` | `Preconditions.checkNotNull(convention)` ทั้งกรณี null (throw) และไม่ null; `firstLink = this` |
| `testAppend_*` | `checkArgument(lastLink.nextLink == null)` ทั้ง true/false; null-input (NPE); การอัปเดต `firstLink`/`nextLink` |
| `testNextPreciserScope_*` | ternary `nextLink != null ? ... : blindScope` ทั้งสองสาขา |
| `testFirstPreciserScope_*` | การ delegate ไปยัง `firstLink.getPreciserScopeKnowingConditionOutcome` |
| `testGetTypeIfRefinable_NameNode_*` | switch case `Token.NAME`: slot found (type != null / type == null ใช้ node.getJSType()), slot not found |
| `testGetTypeIfRefinable_GetPropNode_*` | switch case `Token.GETPROP`: qualifiedName null, slot found, slot null→node type, slot null→node type null→UNKNOWN |
| `testGetTypeIfRefinable_OtherToken_*` / NullNode | default case ของ switch, null-input (NPE) |
| `testDeclareNameInScope_NameNode_*` | case `Token.NAME` → `inferSlotType` ถูกเรียก |
| `testDeclareNameInScope_GetPropNode_*` | case `Token.GETPROP`: origType null→UNKNOWN, qualifiedName null (NPE), `inferQualifiedSlot` args ถูกต้อง |
| `testDeclareNameInScope_ThisNode_*` | case `Token.THIS` (no-op) |
| `testDeclareNameInScope_DefaultToken_*` / NullNode | default case → `IllegalArgumentException`, null-input (NPE) |
| `testGetRestrictedWithoutUndefined_*` | null-input; ทุก `case*Type()` ของ `restrictUndefinedVisitor` รวม `caseVoidType`(null), `caseUnionType`, `caseAllType` |
| `testGetRestrictedWithoutNull_*` | null-input; ทุก `case*Type()` ของ `restrictNullVisitor` รวม `caseNullType`(null), `caseVoidType`(unchanged), `caseUnionType`, `caseAllType` |
| `testGetRestrictedByTypeOfResult_NullType_*` / Empty/NullValue | `type == null` branch: `resultEqualsValue` true (known/unknown value) และ false; malformed/empty string; null value (NPE) |
| `testGetRestrictedByTypeOfResult_NumberType/BooleanType/StringType/VoidType/NullType_*` | `matchesExpectation(...)` true/false ในแต่ละ `case*Type()` ของ `RestrictByOneTypeOfResultVisitor` |
| `testGetRestrictedByTypeOfResult_FunctionType_*` | `caseFunctionType` matches/ไม่ matches |
| `testGetRestrictedByTypeOfResult_NoObjectType_*` | เงื่อนไข `(value.equals("object")||value.equals("function"))==resultEqualsValue` ทุกสาขา |
| `testGetRestrictedByTypeOfResult_ObjectType_*` | `caseObjectType`: branch `value.equals("function")` (subtype true/false via resultEqualsValue) และ branch อื่น |
| `testGetRestrictedByTypeOfResult_NoType/AllType/UnknownType_*` | `caseTopType` ทั้ง `resultEqualsValue` true (พบ/ไม่พบ typeByName) และ false |
| `testGetRestrictedByTypeOfResult_UnionType_*` | `caseUnionType` (inherited): มี/ไม่มี match ในกลุ่ม alternates |
| `testGetNativeType_*` | การ delegate ไปยัง `typeRegistry.getNativeType` |

**จุดที่ไม่ได้ทดสอบ (กำกับด้วยคอมเมนต์ในโค้ด):** `caseEnumElementType` ในทุก visitor (ไม่มั่นใจ API สร้าง `EnumElementType`), และกรณี `isSubtype` เป็น false ใน `caseObjectType` ของ `RestrictByOneTypeOfResultVisitor` (ไม่มั่นใจ type hierarchy fixture ที่เหมาะสม)