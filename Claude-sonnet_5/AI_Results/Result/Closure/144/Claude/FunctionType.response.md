# FunctionTypeTest.java

หมายเหตุสำคัญก่อนเริ่ม (ข้อสมมติที่ไม่สามารถยืนยันได้ 100% จากซอร์สที่ให้มา แต่จำเป็นสำหรับ setup):
- `JSTypeRegistry` มี constructor รับ `ErrorReporter` ตัวเดียว (ไม่ปรากฏใน source ที่ให้มา แต่จำเป็นสำหรับสร้าง instance)
- `Node` มี `setVarArgs(boolean)` คู่กับ `isVarArgs()` และมี `addChildToBack(Node)` คู่กับ `addChildToFront(Node)` ที่เห็นในซอร์ส
- `JSType.toObjectType()` ของ primitive type (เช่น NUMBER_TYPE) คืนค่า `null`
- ค่า `toString()` ของ NUMBER_TYPE/STRING_TYPE คือ `"number"`/`"string"`

ทุกจุดที่มีความไม่แน่ใจสูงจะมีคอมเมนต์กำกับไว้ในโค้ด

```java
package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.collect.Lists;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Unit tests สำหรับ {@link FunctionType} (Defects4J: Closure-144b)
 * อยู่ใน package เดียวกันเพื่อเข้าถึง constructor/เมธอด package-private ที่จำเป็น
 */
public class FunctionTypeTest {

  private JSTypeRegistry registry;

  @Before
  public void setUp() {
    // ข้อสมมติ: JSTypeRegistry(ErrorReporter) เป็น constructor ที่ใช้ได้
    registry = new JSTypeRegistry(new ErrorReporter() {
      @Override
      public void warning(String message, String sourceName, int line, int lineOffset) {
        // ignore
      }

      @Override
      public void error(String message, String sourceName, int line, int lineOffset) {
        fail("Unexpected type error: " + message);
      }
    });
  }

  // ---------- Helpers ----------

  private JSType unknownType() {
    return registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
  }

  private ArrowType simpleArrow(JSType returnType) {
    return new ArrowType(registry, new Node(Token.LP), returnType);
  }

  private FunctionType ordinaryFunction(String name, Node paramsNode, JSType returnType) {
    ArrowType arrow = new ArrowType(registry, paramsNode, returnType);
    return new FunctionType(registry, name, null, arrow, null, null, false, false);
  }

  private FunctionType constructorFunction(String name, Node paramsNode, JSType returnType) {
    ArrowType arrow = new ArrowType(registry, paramsNode, returnType);
    return new FunctionType(registry, name, null, arrow, null, null, true, false);
  }

  private Node param(String name, boolean optional, boolean varArgs) {
    Node n = Node.newString(Token.NAME, name);
    n.setOptionalArg(optional);
    n.setVarArgs(varArgs); // สมมติว่ามีเมธอดนี้คู่กับ isVarArgs()
    return n;
  }

  private Node lp(Node... params) {
    Node lpNode = new Node(Token.LP);
    for (Node p : params) {
      lpNode.addChildToBack(p); // สมมติว่ามีเมธอดนี้คู่กับ addChildToFront ที่เห็นในซอร์ส
    }
    return lpNode;
  }

  // ---------- Constructors / Kind ----------

  @Test
  public void testOrdinaryFunctionKind() {
    FunctionType f = ordinaryFunction("foo", new Node(Token.LP), unknownType());
    assertTrue(f.isOrdinaryFunction());
    assertFalse(f.isConstructor());
    assertFalse(f.isInterface());
    assertTrue(f.isFunctionType());
    assertTrue(f.canBeCalled());
  }

  @Test
  public void testConstructorKindCreatesInstanceType() {
    FunctionType ctor = constructorFunction("Foo", new Node(Token.LP), unknownType());
    assertTrue(ctor.isConstructor());
    assertTrue(ctor.hasInstanceType());
    assertNotNull(ctor.getInstanceType());
  }

  @Test
  public void testInterfaceCreation() {
    FunctionType iface = FunctionType.forInterface(registry, "Bar", null);
    assertTrue(iface.isInterface());
    assertFalse(iface.isConstructor());
    assertFalse(iface.isOrdinaryFunction());
    assertTrue(iface.hasInstanceType());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testInterfaceNullNameThrows() {
    FunctionType.forInterface(registry, null, null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testConstructorInvalidSourceTokenThrows() {
    Node badSource = new Node(Token.LP); // ไม่ใช่ FUNCTION token -> ควร throw
    ArrowType arrow = simpleArrow(unknownType());
    new FunctionType(registry, "foo", badSource, arrow, null, null, false, false);
  }

  @Test(expected = NullPointerException.class)
  public void testNullArrowTypeThrowsNPE() {
    new FunctionType(registry, "foo", null, null, null, null, false, false);
  }

  // ---------- getParameters / getParametersNode ----------

  @Test
  public void testGetParametersEmptyWhenParamsNodeNull() {
    ArrowType arrow = new ArrowType(registry, null, unknownType());
    FunctionType f = new FunctionType(registry, "foo", null, arrow, null, null, false, false);
    assertNull(f.getParametersNode());
    assertFalse(f.getParameters().iterator().hasNext());
  }

  @Test
  public void testGetParametersWithChildren() {
    Node p1 = param("a", false, false);
    Node p2 = param("b", true, false);
    Node lpNode = lp(p1, p2);
    FunctionType f = ordinaryFunction("foo", lpNode, unknownType());
    List<Node> params = Lists.newArrayList(f.getParameters());
    assertEquals(2, params.size());
    assertSame(p1, params.get(0));
    assertSame(p2, params.get(1));
    assertSame(lpNode, f.getParametersNode());
  }

  // ---------- getMinArguments ----------

  @Test
  public void testMinArgumentsNoParams() {
    FunctionType f = ordinaryFunction("foo", new Node(Token.LP), unknownType());
    assertEquals(0, f.getMinArguments());
  }

  @Test
  public void testMinArgumentsAllRequired() {
    Node lpNode = lp(param("a", false, false), param("b", false, false));
    FunctionType f = ordinaryFunction("foo", lpNode, unknownType());
    assertEquals(2, f.getMinArguments());
  }

  @Test
  public void testMinArgumentsOptionalBeforeRequired() {
    Node lpNode = lp(param("a", true, false), param("b", false, false));
    FunctionType f = ordinaryFunction("foo", lpNode, unknownType());
    assertEquals(2, f.getMinArguments());
  }

  @Test
  public void testMinArgumentsRequiredThenOptional() {
    Node lpNode = lp(param("a", false, false), param("b", true, false));
    FunctionType f = ordinaryFunction("foo", lpNode, unknownType());
    assertEquals(1, f.getMinArguments());
  }

  @Test
  public void testMinArgumentsAllOptional() {
    Node lpNode = lp(param("a", true, false), param("b", true, false));
    FunctionType f = ordinaryFunction("foo", lpNode, unknownType());
    assertEquals(0, f.getMinArguments());
  }

  @Test
  public void testMinArgumentsVarArgsExcluded() {
    Node lpNode = lp(param("a", false, false), param("rest", false, true));
    FunctionType f = ordinaryFunction("foo", lpNode, unknownType());
    assertEquals(1, f.getMinArguments());
  }

  // ---------- getMaxArguments ----------

  @Test
  public void testMaxArgumentsNullParamsNode() {
    ArrowType arrow = new ArrowType(registry, null, unknownType());
    FunctionType f = new FunctionType(registry, "foo", null, arrow, null, null, false, false);
    assertEquals(Integer.MAX_VALUE, f.getMaxArguments());
  }

  @Test
  public void testMaxArgumentsNoChildren() {
    FunctionType f = ordinaryFunction("foo", new Node(Token.LP), unknownType());
    assertEquals(0, f.getMaxArguments());
  }

  @Test
  public void testMaxArgumentsLastNotVarArgs() {
    Node lpNode = lp(param("a", false, false), param("b", true, false));
    FunctionType f = ordinaryFunction("foo", lpNode, unknownType());
    assertEquals(2, f.getMaxArguments());
  }

  @Test
  public void testMaxArgumentsLastIsVarArgs() {
    Node lpNode = lp(param("a", false, false), param("rest", false, true));
    FunctionType f = ordinaryFunction("foo", lpNode, unknownType());
    assertEquals(Integer.MAX_VALUE, f.getMaxArguments());
  }

  // ---------- returnType / inferred ----------

  @Test
  public void testReturnTypeAndInferredFlagTrue() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    ArrowType arrow = new ArrowType(registry, new Node(Token.LP), numberType, true);
    FunctionType f = new FunctionType(registry, "foo", null, arrow, null, null, false, false);
    assertSame(numberType, f.getReturnType());
    assertTrue(f.isReturnTypeInferred());
  }

  @Test
  public void testReturnTypeInferredDefaultFalse() {
    // ข้อสมมติ: ArrowType constructor แบบ 3 พารามิเตอร์ ตั้งค่า returnTypeInferred = false โดย default
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    ArrowType arrow = new ArrowType(registry, new Node(Token.LP), numberType);
    FunctionType f = new FunctionType(registry, "foo", null, arrow, null, null, false, false);
    assertFalse(f.isReturnTypeInferred());
  }

  // ---------- getPrototype / setPrototype / setPrototypeBasedOn ----------

  @Test
  public void testGetPrototypeLazyInitAndCache() {
    FunctionType f = ordinaryFunction("foo", new Node(Token.LP), unknownType());
    assertFalse(f.hasCachedValues());
    FunctionPrototypeType p1 = f.getPrototype();
    assertNotNull(p1);
    assertTrue(f.hasCachedValues());
    assertSame(p1, f.getPrototype());
  }

  @Test
  public void testSetPrototypeNullReturnsFalse() {
    FunctionType f = ordinaryFunction("foo", new Node(Token.LP), unknownType());
    assertFalse(f.setPrototype(null));
  }

  @Test
  public void testSetPrototypeSameAsInstanceTypeReturnsFalseForConstructor() {
    FunctionType ctor = constructorFunction("Foo", new Node(Token.LP), unknownType());
    FunctionPrototypeType fakeInstance = new FunctionPrototypeType(registry, ctor, null);
    ctor.setInstanceType(fakeInstance);
    assertFalse(ctor.setPrototype(fakeInstance));
  }

  @Test
  public void testSetPrototypeOrdinaryFunctionSkipsSuperclassLogic() {
    FunctionType f = ordinaryFunction("foo", new Node(Token.LP), unknownType());
    FunctionPrototypeType proto = new FunctionPrototypeType(registry, f, null);
    assertTrue(f.setPrototype(proto));
    assertSame(proto, f.getPrototype());
  }

  @Test
  public void testSetPrototypeConstructorNoThrow() {
    FunctionType ctor = constructorFunction("Foo", new Node(Token.LP), unknownType());
    FunctionPrototypeType proto = new FunctionPrototypeType(registry, ctor, null);
    assertTrue(ctor.setPrototype(proto));
    // ไม่ยืนยันค่า superClass ที่แน่นอน เพราะขึ้นกับ implicit prototype เริ่มต้นของ FunctionPrototypeType
  }

  @Test
  public void testSetPrototypeBasedOnCreatesThenUpdatesImplicit() {
    FunctionType f = ordinaryFunction("foo", new Node(Token.LP), unknownType());
    ObjectType base1 = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    f.setPrototypeBasedOn(base1); // prototype == null branch
    FunctionPrototypeType proto1 = f.getPrototype();
    assertNotNull(proto1);

    ObjectType base2 = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    f.setPrototypeBasedOn(base2); // prototype != null branch -> setImplicitPrototype
    assertSame(proto1, f.getPrototype());
  }

  // ---------- hasProperty / hasOwnProperty / isPropertyTypeInferred ----------

  @Test
  public void testHasPropertyAndOwnPropertyPrototype() {
    FunctionType f = ordinaryFunction("foo", new Node(Token.LP), unknownType());
    assertTrue(f.hasProperty("prototype"));
    assertTrue(f.hasOwnProperty("prototype"));
  }

  @Test
  public void testIsPropertyTypeInferredPrototype() {
    FunctionType f = ordinaryFunction("foo", new Node(Token.LP), unknownType());
    assertTrue(f.isPropertyTypeInferred("prototype"));
  }

  // ---------- getPropertyType ----------

  @Test
  public void testGetPropertyTypePrototype() {
    FunctionType f = ordinaryFunction("foo", new Node(Token.LP), unknownType());
    assertSame(f.getPrototype(), f.getPropertyType("prototype"));
  }

  @Test
  public void testGetPropertyTypeCallWithNullParams() {
    ArrowType arrow = new ArrowType(registry, null, unknownType());
    FunctionType f = new FunctionType(registry, "foo", null, arrow, null, null, false, false);
    JSType callType = f.getPropertyType("call");
    assertNotNull(callType);
    assertTrue(callType.isFunctionType());
  }

  @Test
  public void testGetPropertyTypeCallWithParams() {
    Node p = param("a", false, false);
    p.setJSType(unknownType());
    Node lpNode = lp(p);
    FunctionType f = ordinaryFunction("foo", lpNode, unknownType());
    JSType callType = f.getPropertyType("call");
    assertNotNull(callType);
  }

  @Test
  public void testGetPropertyTypeApply() {
    FunctionType f = ordinaryFunction("foo", new Node(Token.LP), unknownType());
    JSType applyType = f.getPropertyType("apply");
    assertNotNull(applyType);
  }

  @Test
  public void testGetPropertyTypeUnknownPropertyDoesNotThrow() {
    FunctionType f = ordinaryFunction("foo", new Node(Token.LP), unknownType());
    f.getPropertyType("nonExistentProp"); // ไม่ throw = ผ่าน branch นี้
  }

  // ---------- defineProperty ----------

  @Test
  public void testDefinePropertyPrototypeWithNonObjectTypeReturnsFalse() {
    FunctionType f = ordinaryFunction("foo", new Node(Token.LP), unknownType());
    JSType nonObjType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    // ข้อสมมติ: NUMBER_TYPE.toObjectType() คืนค่า null
    assertFalse(f.defineProperty("prototype", nonObjType, false, false));
  }

  @Test
  public void testDefinePropertyPrototypeWithObjectTypeSetsPrototype() {
    FunctionType f = ordinaryFunction("foo", new Node(Token.LP), unknownType());
    ObjectType objType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    assertTrue(f.defineProperty("prototype", objType, false, false));
    assertNotNull(f.getPrototype());
  }

  // ---------- supAndInfHelper (getLeastSupertype/getGreatestSubtype) ----------

  @Test
  public void testSupAndInfEquivalentReturnsThis() {
    FunctionType f = ordinaryFunction("foo", new Node(Token.LP), unknownType());
    assertSame(f, f.getLeastSupertype(f));
    assertSame(f, f.getGreatestSubtype(f));
  }

  @Test
  public void testSupAndInfSameSignatureDifferentReturnType() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    FunctionType f1 = ordinaryFunction("f1", new Node(Token.LP), numberType);
    FunctionType f2 = ordinaryFunction("f2", new Node(Token.LP), stringType);
    JSType sup = f1.getLeastSupertype(f2);
    assertTrue(sup.isFunctionType());
    assertTrue(((FunctionType) sup).isOrdinaryFunction());
  }

  @Test
  public void testSupWithFunctionInstanceType() {
    FunctionType f = ordinaryFunction("foo", new Node(Token.LP), unknownType());
    JSType functionInstance = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
    assertSame(functionInstance, f.getLeastSupertype(functionInstance));
    assertSame(f, f.getGreatestSubtype(functionInstance));
  }

  @Test
  public void testSupAndInfDifferentSignaturesFallbackToU2UOrNoObject() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    Node lp1 = lp(param("a", false, false));
    FunctionType f1 = ordinaryFunction("f1", lp1, numberType);
    FunctionType f2 = ordinaryFunction("f2", new Node(Token.LP), numberType);
    assertSame(registry.getNativeType(JSTypeNative.U2U_CONSTRUCTOR_TYPE),
        f1.getLeastSupertype(f2));
    assertSame(registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE),
        f1.getGreatestSubtype(f2));
  }

  @Test
  public void testSupAndInfWithNonFunctionTypeFallsBackToSuper() {
    FunctionType f = ordinaryFunction("foo", new Node(Token.LP), unknownType());
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType sup = f.getLeastSupertype(numberType);
    assertNotNull(sup);
  }

  // ---------- cloneWithNewReturnType ----------

  @Test
  public void testCloneWithNewReturnType() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    FunctionType f = ordinaryFunction("foo", new Node(Token.LP), numberType);
    FunctionType clone = f.cloneWithNewReturnType(stringType, true);
    assertSame(stringType, clone.getReturnType());
    assertTrue(clone.isReturnTypeInferred());
    assertTrue(clone.isOrdinaryFunction());
  }

  // ---------- getSuperClassConstructor / hasUnknownSupertype ----------

  @Test(expected = IllegalArgumentException.class)
  public void testGetSuperClassConstructorInvalidKindThrows() {
    FunctionType f = ordinaryFunction("foo", new Node(Token.LP), unknownType());
    f.getSuperClassConstructor();
  }

  @Test
  public void testGetSuperClassConstructorIdempotent() {
    FunctionType ctor = constructorFunction("Foo", new Node(Token.LP), unknownType());
    FunctionType s1 = ctor.getSuperClassConstructor();
    FunctionType s2 = ctor.getSuperClassConstructor();
    assertEquals(s1, s2); // ไม่ยืนยันค่าจริง เพียงตรวจว่า behavior consistent
  }

  @Test(expected = IllegalArgumentException.class)
  public void testHasUnknownSupertypeRequiresConstructorOrInterface() {
    FunctionType f = ordinaryFunction("foo", new Node(Token.LP), unknownType());
    f.hasUnknownSupertype();
  }

  @Test
  public void testHasUnknownSupertypeExecutesWithoutException() {
    FunctionType ctor = constructorFunction("Foo", new Node(Token.LP), unknownType());
    ctor.hasUnknownSupertype(); // ตรวจว่าไม่ throw exception ที่ไม่คาดหวัง (ไม่ยืนยันผลลัพธ์ที่แน่นอน)
  }

  // ---------- getTopMostDefiningType ----------

  @Test(expected = IllegalStateException.class)
  public void testGetTopMostDefiningTypeRequiresConstructorOrInterface() {
    FunctionType f = ordinaryFunction("foo", new Node(Token.LP), unknownType());
    f.getTopMostDefiningType("prototype");
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetTopMostDefiningTypeMissingPropertyThrows() {
    FunctionType ctor = constructorFunction("Foo", new Node(Token.LP), unknownType());
    ctor.getTopMostDefiningType("missingProp");
  }

  @Test
  public void testGetTopMostDefiningTypeFound() {
    FunctionType ctor = constructorFunction("Foo", new Node(Token.LP), unknownType());
    FunctionPrototypeType proto = ctor.getPrototype();
    proto.defineProperty("bar", unknownType(), false, false);
    JSType top = ctor.getTopMostDefiningType("bar");
    assertSame(ctor.getInstanceType(), top);
  }

  // ---------- isEquivalentTo ----------

  @Test
  public void testIsEquivalentToNonFunctionType() {
    FunctionType f = ordinaryFunction("foo", new Node(Token.LP), unknownType());
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    assertFalse(f.isEquivalentTo(numberType));
  }

  @Test
  public void testIsEquivalentToConstructorsSameAndDifferentInstance() {
    FunctionType ctor1 = constructorFunction("Foo", new Node(Token.LP), unknownType());
    FunctionType ctor2 = constructorFunction("Foo", new Node(Token.LP), unknownType());
    assertTrue(ctor1.isEquivalentTo(ctor1));
    assertFalse(ctor1.isEquivalentTo(ctor2));
  }

  @Test
  public void testIsEquivalentToConstructorVsOrdinary() {
    FunctionType ctor = constructorFunction("Foo", new Node(Token.LP), unknownType());
    FunctionType ordinary = ordinaryFunction("foo", new Node(Token.LP), unknownType());
    assertFalse(ctor.isEquivalentTo(ordinary));
  }

  @Test
  public void testIsEquivalentToInterfacesByName() {
    FunctionType iface1 = FunctionType.forInterface(registry, "Bar", null);
    FunctionType iface2 = FunctionType.forInterface(registry, "Bar", null);
    FunctionType iface3 = FunctionType.forInterface(registry, "Baz", null);
    assertTrue(iface1.isEquivalentTo(iface2));
    assertFalse(iface1.isEquivalentTo(iface3));
  }

  @Test
  public void testIsEquivalentToInterfaceVsOrdinary() {
    FunctionType iface = FunctionType.forInterface(registry, "Bar", null);
    FunctionType ordinary = ordinaryFunction("foo", new Node(Token.LP), unknownType());
    assertFalse(iface.isEquivalentTo(ordinary));
    assertFalse(ordinary.isEquivalentTo(iface));
  }

  @Test
  public void testIsEquivalentToOrdinarySameAndDifferentSignature() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    FunctionType f1 = ordinaryFunction("f1", new Node(Token.LP), numberType);
    FunctionType f2 = ordinaryFunction("f2", new Node(Token.LP), numberType);
    FunctionType f3 = ordinaryFunction("f3", new Node(Token.LP), stringType);
    assertTrue(f1.isEquivalentTo(f2));
    assertFalse(f1.isEquivalentTo(f3));
  }

  // ---------- hashCode / hasEqualCallType ----------

  @Test
  public void testHashCodeInterfaceUsesReferenceName() {
    FunctionType iface = FunctionType.forInterface(registry, "Bar", null);
    assertEquals("Bar".hashCode(), iface.hashCode());
  }

  @Test
  public void testHashCodeOrdinaryUsesCall() {
    FunctionType f = ordinaryFunction("foo", new Node(Token.LP), unknownType());
    assertEquals(f.getInternalArrowType().hashCode(), f.hashCode());
  }

  @Test
  public void testHasEqualCallType() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    FunctionType f1 = ordinaryFunction("f1", new Node(Token.LP), numberType);
    FunctionType f2 = ordinaryFunction("f2", new Node(Token.LP), numberType);
    FunctionType f3 = ordinaryFunction("f3", new Node(Token.LP), stringType);
    assertTrue(f1.hasEqualCallType(f2));
    assertFalse(f1.hasEqualCallType(f3));
  }

  // ---------- toString ----------

  @Test
  public void testToStringForFunctionInstanceType() {
    FunctionType instanceFn = (FunctionType) registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
    assertEquals("Function", instanceFn.toString());
  }

  @Test
  public void testToStringNoParamsUnknownThis() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    FunctionType f = ordinaryFunction("foo", new Node(Token.LP), numberType);
    // ข้อสมมติ: numberType.toString() == "number"
    assertEquals("function (): number", f.toString());
  }

  @Test
  public void testToStringKnownThisType() {
    FunctionType ctor = constructorFunction(
        "Foo", new Node(Token.LP), registry.getNativeType(JSTypeNative.VOID_TYPE));
    assertTrue(ctor.toString().startsWith("function (this:"));
  }

  @Test
  public void testToStringWithParamsAndKnownThis() {
    Node p1 = param("a", false, false);
    p1.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    Node lpNode = lp(p1);
    FunctionType ctor = constructorFunction(
        "Foo", lpNode, registry.getNativeType(JSTypeNative.VOID_TYPE));
    String s = ctor.toString();
    assertTrue(s.contains("this:"));
    assertTrue(s.contains("number"));
  }

  @Test
  public void testToStringWithVarArgsParam() {
    Node p1 = param("rest", false, true);
    p1.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    Node lpNode = lp(p1);
    FunctionType f = ordinaryFunction(
        "foo", lpNode, registry.getNativeType(JSTypeNative.VOID_TYPE));
    assertTrue(f.toString().contains("...["));
  }

  @Test
  public void testToStringWithMultipleParams() {
    Node p1 = param("a", false, false);
    p1.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    Node p2 = param("b", false, false);
    p2.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
    Node lpNode = lp(p1, p2);
    FunctionType f = ordinaryFunction(
        "foo", lpNode, registry.getNativeType(JSTypeNative.VOID_TYPE));
    assertTrue(f.toString().contains("number, string"));
  }

  // ---------- toDebugHashCodeString ----------

  @Test
  public void testToDebugHashCodeStringForFunctionInstance() {
    FunctionType instanceFn = (FunctionType) registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
    assertNotNull(instanceFn.toDebugHashCodeString());
  }

  @Test
  public void testToDebugHashCodeStringSelfReference() {
    Node p1 = param("a", false, false);
    FunctionType f = ordinaryFunction("foo", lp(p1), unknownType());
    p1.setJSType(f); // ทำให้ param ชี้กลับมาตัวเอง เพื่อทดสอบ branch "me"
    assertTrue(f.toDebugHashCodeString().contains("me"));
  }

  // ---------- isSubtype ----------

  @Test
  public void testIsSubtypeEquivalent() {
    FunctionType f = ordinaryFunction("foo", new Node(Token.LP), unknownType());
    assertTrue(f.isSubtype(f));
  }

  @Test
  public void testIsSubtypeToInterfaceAlwaysTrue() {
    FunctionType f = ordinaryFunction("foo", new Node(Token.LP), unknownType());
    FunctionType iface = FunctionType.forInterface(registry, "Bar", null);
    assertTrue(f.isSubtype(iface));
  }

  @Test
  public void testIsSubtypeInterfaceToOrdinaryIsFalse() {
    FunctionType iface = FunctionType.forInterface(registry, "Bar", null);
    FunctionType f = ordinaryFunction("foo", new Node(Token.LP), unknownType());
    assertFalse(iface.isSubtype(f));
  }

  @Test
  public void testIsSubtypeOrdinaryCompatibleCallTypes() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    FunctionType f1 = ordinaryFunction("f1", new Node(Token.LP), numberType);
    FunctionType f2 = ordinaryFunction("f2", new Node(Token.LP), numberType);
    assertTrue(f1.isSubtype(f2));
  }

  @Test
  public void testIsSubtypeFallbackToFunctionPrototype() {
    FunctionType f = ordinaryFunction("foo", new Node(Token.LP), unknownType());
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    // numberType ไม่ใช่ FunctionType หรือ UnionType -> ตกไปที่ fallback ผ่าน FUNCTION_PROTOTYPE
    boolean result = f.isSubtype(numberType);
    assertFalse(result);
  }

  // หมายเหตุ: branch "that instanceof UnionType" ไม่ได้ทดสอบ เนื่องจาก UnionType
  // ไม่มี public API ที่ยืนยันได้จาก source ของ FunctionType ที่ให้มา
  // (หลีกเลี่ยงการเดา behavior ตามข้อกำหนด)

  // ---------- getTypeOfThis ----------

  @Test
  public void testGetTypeOfThisWhenNoObjectType() {
    FunctionType ctor = constructorFunction("Foo", new Node(Token.LP), unknownType());
    ObjectType noObjectType = registry.getNativeObjectType(JSTypeNative.NO_OBJECT_TYPE);
    ctor.setInstanceType(noObjectType);
    assertSame(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE), ctor.getTypeOfThis());
  }

  @Test
  public void testGetTypeOfThisNormal() {
    FunctionType ctor = constructorFunction("Foo", new Node(Token.LP), unknownType());
    ObjectType typeOfThis = ctor.getInstanceType();
    assertSame(typeOfThis, ctor.getTypeOfThis());
  }

  // ---------- getSource / setSource ----------

  @Test
  public void testGetSetSource() {
    FunctionType f = ordinaryFunction("foo", new Node(Token.LP), unknownType());
    assertNull(f.getSource());
    Node src = new Node(Token.FUNCTION);
    f.setSource(src);
    assertSame(src, f.getSource());
  }

  // ---------- getSubTypes / addSubType ----------

  @Test
  public void testGetSubTypesNullByDefault() {
    FunctionType f = ordinaryFunction("foo", new Node(Token.LP), unknownType());
    assertNull(f.getSubTypes());
  }

  @Test
  public void testAddSubTypeViaSetPrototypeChain() {
    FunctionType parentCtor = constructorFunction("Parent", new Node(Token.LP), unknownType());
    FunctionType childCtor = constructorFunction("Child", new Node(Token.LP), unknownType());

    // ข้อสมมติ: baseType ที่ส่งเข้า FunctionPrototypeType จะกลายเป็น implicit prototype
    FunctionPrototypeType childProto =
        new FunctionPrototypeType(registry, childCtor, parentCtor.getInstanceType());
    childCtor.setPrototype(childProto);

    List<FunctionType> subTypes = parentCtor.getSubTypes();
    assertNotNull(subTypes);
    assertTrue(subTypes.contains(childCtor));
  }

  // ---------- getTemplateTypeName ----------

  @Test
  public void testGetTemplateTypeName() {
    ArrowType arrow = simpleArrow(unknownType());
    FunctionType f = new FunctionType(registry, "foo", null, arrow, null, "T", false, false);
    assertEquals("T", f.getTemplateTypeName());

    FunctionType f2 = new FunctionType(registry, "foo2", null, arrow, null, null, false, false);
    assertNull(f2.getTemplateTypeName());
  }

  // ---------- isInstanceType ----------

  @Test
  public void testIsInstanceTypeForU2UConstructor() {
    FunctionType u2u = (FunctionType) registry.getNativeType(JSTypeNative.U2U_CONSTRUCTOR_TYPE);
    assertTrue(u2u.isInstanceType());
  }

  @Test
  public void testIsInstanceTypeFalseForOrdinaryConstructor() {
    FunctionType ctor = constructorFunction("Foo", new Node(Token.LP), unknownType());
    assertFalse(ctor.isInstanceType());
  }

  // ---------- implementedInterfaces ----------

  @Test
  public void testGetImplementedInterfacesOrdinaryFunctionUsesDirectListOnly() {
    FunctionType f = ordinaryFunction("foo", new Node(Token.LP), unknownType());
    FunctionType iface = FunctionType.forInterface(registry, "Bar", null);
    f.setImplementedInterfaces(Lists.newArrayList((ObjectType) iface.getInstanceType()));
    List<ObjectType> result = Lists.newArrayList(f.getImplementedInterfaces());
    assertEquals(1, result.size());
  }

  @Test
  public void testGetAllImplementedInterfaces() {
    FunctionType iface = FunctionType.forInterface(registry, "Bar", null);
    FunctionType ctor = constructorFunction("Foo", new Node(Token.LP), unknownType());
    ctor.setImplementedInterfaces(Lists.newArrayList((ObjectType) iface.getInstanceType()));
    List<ObjectType> all = Lists.newArrayList(ctor.getAllImplementedInterfaces());
    assertTrue(all.contains(iface.getInstanceType()));
  }
}
```

# สรุป Branch/Condition Coverage

| กลุ่มเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| testOrdinaryFunctionKind, testConstructorKindCreatesInstanceType, testInterfaceCreation | kind ORDINARY/CONSTRUCTOR/INTERFACE, typeOfThis null-branch ในแต่ละ constructor |
| testInterfaceNullNameThrows, testConstructorInvalidSourceTokenThrows, testNullArrowTypeThrowsNPE | Preconditions.checkArgument/checkNotNull ผิดรูปแบบ (malformed input) |
| testGetParametersEmptyWhenParamsNodeNull, testGetParametersWithChildren | if/else ใน getParameters() (n==null vs n!=null) |
| testMinArguments* (6 เมธอด) | loop และ if `!isOptionalArg() && !isVarArgs()` ทุก branch (required, optional-before, required-then-optional, all-optional, varargs) |
| testMaxArguments* (4 เมธอด) | if (params==null), (lastParam==null), (!isVarArgs()), varargs-true branch |
| testReturnTypeAndInferredFlagTrue/Default | getReturnType/isReturnTypeInferred ทั้งสองค่า |
| testGetPrototypeLazyInitAndCache | if (prototype==null) lazy-init กับ cache |
| testSetPrototype* (4 เมธอด) | null check, isConstructor&&prototype==instance, isConstructor/isInterface superclass block |
| testSetPrototypeBasedOnCreatesThenUpdatesImplicit | if(prototype==null) vs else branch |
| testHasPropertyAndOwnPropertyPrototype, testIsPropertyTypeInferredPrototype | "prototype" special-case branch |
| testGetPropertyType* (5 เมธอด) | branch "prototype", "call" (params null/non-null), "apply", unknown property (super) |
| testDefineProperty* (2 เมธอด) | objType null → false, objType!=null → setPrototype |
| testSupAndInf* (5 เมธอด) | isEquivalentTo-true, ordinary+equalParams, functionInstance equivalence (both directions), fallback U2U/NoObject, non-function fallback to super |
| testCloneWithNewReturnType | สร้าง FunctionType ใหม่ตาม logic ตรง ๆ |
| testGetSuperClassConstructor*, testHasUnknownSupertype* | Preconditions.checkArgument ผิด kind, loop/early-return ปกติ |
| testGetTopMostDefiningType* (3 เมธอด) | checkState ผิด kind, checkArgument property ไม่มี, loop do-while ปกติ |
| testIsEquivalentTo* (7 เมธอด) | ทุก if-branch: not FunctionType, constructor==/!=, constructor-vs-else, interface==/!=name, interface-vs-else, ordinary same/diff signature |
| testHashCode*, testHasEqualCallType | isInterface ? name.hashCode() : call.hashCode(); equal/ไม่เท่ากัน call |
| testToString* (6 เมธอด) | FUNCTION_INSTANCE_TYPE special-case, hasKnownTypeOfThis true/false, paramNum>0, varargs vs ไม่ varargs, loop multiple params |
| testToDebugHashCodeString* (2 เมธอด) | FUNCTION_INSTANCE_TYPE special-case, self-reference "me" branch |
| testIsSubtype* (5 เมธอด) | isEquivalentTo-true, that.isInterface, this.isInterface, ordinary compatible, fallback ผ่าน FUNCTION_PROTOTYPE (ยังไม่ครอบคลุม UnionType branch — ระบุเหตุผลในคอมเมนต์) |
| testGetTypeOfThis* (2 เมธอด) | isNoObjectType true/false |
| testGetSetSource | getter/setter ปกติ |
| testGetSubTypesNullByDefault, testAddSubTypeViaSetPrototypeChain | subTypes==null branch, addSubType ผ่าน setPrototype chain |
| testGetTemplateTypeName | ค่า non-null/null |
| testIsInstanceType* (2 เมธอด) | isEquivalentTo(U2U_CONSTRUCTOR_TYPE) true/false |
| testGetImplementedInterfaces*, testGetAllImplementedInterfaces | superCtor==null branch, addRelatedInterfaces recursive logic |

**ข้อจำกัดที่ระบุไว้ในคอมเมนต์**: ไม่ได้ทดสอบ branch `that instanceof UnionType` ใน `isSubtype()` และ branch `that.isFunctionType()==false` ใน `isEquivalentTo()` (unreachable ในทางปฏิบัติ) เนื่องจากต้องใช้ API ของ `UnionType` ที่ไม่ปรากฏหลักฐานในซอร์สที่ให้มา