package com.google.javascript.rhino.jstype;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.google.javascript.rhino.jstype.FunctionType; // redundant (same package) แต่ใส่ตามข้อกำหนด
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.common.collect.Iterables;

import java.util.Collections;

/**
 * Unit test สำหรับ FunctionType (Defects4J Closure-90b)
 *
 * ข้อสมมติที่ไม่ได้ยืนยันจากซอร์สที่ให้มาโดยตรง (มีคอมเมนต์กำกับในแต่ละจุด):
 *  - JSTypeRegistry มี constructor สาธารณะ (ErrorReporter)
 *  - ErrorReporter มี method warning/error ตาม signature มาตรฐานของ Rhino
 *  - Node มี addChildToBack(Node) และ setVarArgs(boolean)
 */
public class FunctionTypeTest {

  private JSTypeRegistry registry;

  @Before
  public void setUp() {
    // สมมติ constructor นี้มีอยู่ (ไม่ได้อยู่ในซอร์สที่ให้มา)
    registry = new JSTypeRegistry(new ErrorReporter() {
      @Override
      public void warning(String message, String sourceName, int line,
          String lineSource, int lineOffset) {}
      @Override
      public void error(String message, String sourceName, int line,
          String lineSource, int lineOffset) {}
    });
  }

  // ---------- Helpers ----------

  private FunctionType createOrdinaryFunction() {
    ArrowType arrow = new ArrowType(
        registry, new Node(Token.LP), registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    return new FunctionType(registry, "ordinaryFn", null, arrow, null, null, false, false);
  }

  private FunctionType createConstructorFunction(String name) {
    ArrowType arrow = new ArrowType(
        registry, new Node(Token.LP), registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    return new FunctionType(registry, name, null, arrow, null, null, true, false);
  }

  // ---------- Kind: ordinary / constructor / interface ----------

  @Test
  public void testOrdinaryFunctionKind() {
    FunctionType f = createOrdinaryFunction();
    assertTrue(f.isOrdinaryFunction());
    assertFalse(f.isConstructor());
    assertFalse(f.isInterface());
    assertTrue(f.isFunctionType());
  }

  @Test
  public void testCanBeCalledAlwaysTrue() {
    assertTrue(createOrdinaryFunction().canBeCalled());
  }

  @Test
  public void testIsFunctionTypeAlwaysTrue() {
    assertTrue(createConstructorFunction("Foo").isFunctionType());
  }

  @Test
  public void testConstructorKind() {
    FunctionType f = createConstructorFunction("Foo");
    assertTrue(f.isConstructor());
    assertFalse(f.isInterface());
    assertFalse(f.isOrdinaryFunction());
  }

  @Test
  public void testInterfaceKind() {
    FunctionType f = FunctionType.forInterface(registry, "Bar", null);
    assertTrue(f.isInterface());
    assertFalse(f.isConstructor());
    assertFalse(f.isOrdinaryFunction());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testInterfaceRequiresNonNullName() {
    FunctionType.forInterface(registry, null, null);
  }

  @Test
  public void testForInterfaceWithEmptyNameAllowed() {
    // boundary: empty string ไม่ใช่ null จึงผ่าน Preconditions.checkArgument(name != null)
    FunctionType f = FunctionType.forInterface(registry, "", null);
    assertTrue(f.isInterface());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testForInterfaceInvalidSourceType() {
    Node badSource = new Node(Token.NAME); // ไม่ใช่ Token.FUNCTION
    FunctionType.forInterface(registry, "Bad", badSource);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testConstructorInvalidSourceType() {
    Node badSource = new Node(Token.NAME);
    ArrowType arrow = new ArrowType(registry, new Node(Token.LP), null);
    new FunctionType(registry, "Foo", badSource, arrow, null, null, true, false);
  }

  @Test
  public void testConstructorNullSourceAllowed() {
    ArrowType arrow = new ArrowType(registry, new Node(Token.LP), null);
    FunctionType f = new FunctionType(registry, "Foo", null, arrow, null, null, true, false);
    assertNull(f.getSource());
  }

  @Test(expected = NullPointerException.class)
  public void testArrowTypeCannotBeNull() {
    new FunctionType(registry, "Foo", null, null, null, null, false, false);
  }

  @Test
  public void testConstructorWithEmptyName() {
    ArrowType arrow = new ArrowType(registry, new Node(Token.LP), null);
    FunctionType f = new FunctionType(registry, "", null, arrow, null, null, false, false);
    assertNotNull(f);
  }

  // ---------- typeOfThis branches ----------

  @Test
  public void testConstructorTypeOfThisDefaultsToInstanceType() {
    ArrowType arrow = new ArrowType(registry, new Node(Token.LP), null);
    FunctionType f = new FunctionType(registry, "Foo", null, arrow, null, null, true, false);
    assertTrue(f.hasInstanceType());
    assertNotNull(f.getInstanceType());
  }

  @Test
  public void testConstructorTypeOfThisNoObjectTypeKept() {
    ObjectType noObjectType = registry.getNativeObjectType(JSTypeNative.NO_OBJECT_TYPE);
    ArrowType arrow = new ArrowType(registry, new Node(Token.LP), null);
    FunctionType f = new FunctionType(registry, "Foo", null, arrow, noObjectType, null, true, false);
    assertSame(noObjectType, f.getInstanceType());
  }

  @Test
  public void testOrdinaryTypeOfThisDefaultsToUnknown() {
    ArrowType arrow = new ArrowType(
        registry, new Node(Token.LP), registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    FunctionType f = new FunctionType(registry, "foo", null, arrow, null, null, false, false);
    assertSame(registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE), f.getTypeOfThis());
  }

  @Test
  public void testGetTypeOfThis_noObjectTypeMappedToObjectType() {
    ObjectType noObjectType = registry.getNativeObjectType(JSTypeNative.NO_OBJECT_TYPE);
    ArrowType arrow = new ArrowType(
        registry, new Node(Token.LP), registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    FunctionType f = new FunctionType(registry, "f", null, arrow, noObjectType, null, false, false);
    assertSame(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE), f.getTypeOfThis());
  }

  // ---------- getMinArguments / getMaxArguments / getParameters ----------

  @Test
  public void testMinMaxArguments_noParamsNode() {
    ArrowType arrow = new ArrowType(
        registry, null, registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    FunctionType f = new FunctionType(registry, "f", null, arrow, null, null, false, false);
    assertEquals(0, f.getMinArguments());
    assertEquals(Integer.MAX_VALUE, f.getMaxArguments());
    assertFalse(f.getParameters().iterator().hasNext());
  }

  @Test
  public void testMinMaxArguments_emptyParams() {
    Node lp = new Node(Token.LP);
    ArrowType arrow = new ArrowType(
        registry, lp, registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    FunctionType f = new FunctionType(registry, "f", null, arrow, null, null, false, false);
    assertEquals(0, f.getMinArguments());
    assertEquals(0, f.getMaxArguments());
  }

  @Test
  public void testMinMaxArguments_requiredOnly() {
    Node lp = new Node(Token.LP);
    Node p1 = Node.newString(Token.NAME, "a");
    Node p2 = Node.newString(Token.NAME, "b");
    lp.addChildToBack(p1); // สมมติ API นี้มีอยู่ (ไม่ปรากฏตรง ๆ ในซอร์สที่ให้มา)
    lp.addChildToBack(p2);
    ArrowType arrow = new ArrowType(
        registry, lp, registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    FunctionType f = new FunctionType(registry, "f", null, arrow, null, null, false, false);
    assertEquals(2, f.getMinArguments());
    assertEquals(2, f.getMaxArguments());
    int count = 0;
    for (Node n : f.getParameters()) { count++; }
    assertEquals(2, count);
  }

  @Test
  public void testMinArguments_optionalBeforeRequired() {
    Node lp = new Node(Token.LP);
    Node p1 = Node.newString(Token.NAME, "a");
    p1.setOptionalArg(true);
    Node p2 = Node.newString(Token.NAME, "b"); // required after optional
    lp.addChildToBack(p1);
    lp.addChildToBack(p2);
    ArrowType arrow = new ArrowType(
        registry, lp, registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    FunctionType f = new FunctionType(registry, "f", null, arrow, null, null, false, false);
    assertEquals(2, f.getMinArguments());
  }

  @Test
  public void testMinArguments_allOptional() {
    Node lp = new Node(Token.LP);
    Node p1 = Node.newString(Token.NAME, "a");
    p1.setOptionalArg(true);
    lp.addChildToBack(p1);
    ArrowType arrow = new ArrowType(
        registry, lp, registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    FunctionType f = new FunctionType(registry, "f", null, arrow, null, null, false, false);
    assertEquals(0, f.getMinArguments());
    assertEquals(1, f.getMaxArguments());
  }

  @Test
  public void testMaxArguments_varArgs() {
    Node lp = new Node(Token.LP);
    Node p1 = Node.newString(Token.NAME, "a");
    Node p2 = Node.newString(Token.NAME, "rest");
    p2.setVarArgs(true); // สมมติ setter นี้มีอยู่คู่กับ isVarArgs()
    lp.addChildToBack(p1);
    lp.addChildToBack(p2);
    ArrowType arrow = new ArrowType(
        registry, lp, registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    FunctionType f = new FunctionType(registry, "f", null, arrow, null, null, false, false);
    assertEquals(Integer.MAX_VALUE, f.getMaxArguments());
    assertEquals(1, f.getMinArguments());
  }

  @Test
  public void testGetParametersNode() {
    Node lp = new Node(Token.LP);
    ArrowType arrow = new ArrowType(registry, lp, null);
    FunctionType f = new FunctionType(registry, "f", null, arrow, null, null, false, false);
    assertSame(lp, f.getParametersNode());
  }

  @Test
  public void testGetInternalArrowType() {
    assertNotNull(createOrdinaryFunction().getInternalArrowType());
  }

  @Test
  public void testReturnTypeAndInferredFlag() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    ArrowType arrow = new ArrowType(registry, new Node(Token.LP), numberType, true);
    FunctionType f = new FunctionType(registry, "f", null, arrow, null, null, false, false);
    assertSame(numberType, f.getReturnType());
    assertTrue(f.isReturnTypeInferred());
  }

  // ---------- prototype ----------

  @Test
  public void testGetPrototypeLazyInit() {
    FunctionType f = createOrdinaryFunction();
    FunctionPrototypeType p1 = f.getPrototype();
    assertNotNull(p1);
    assertSame(p1, f.getPrototype());
  }

  @Test
  public void testSetPrototypeNullReturnsFalse() {
    assertFalse(createOrdinaryFunction().setPrototype(null));
  }

  @Test
  public void testHasCachedValuesAfterPrototypeSet() {
    FunctionType f = createOrdinaryFunction();
    f.getPrototype();
    assertTrue(f.hasCachedValues());
  }

  @Test
  public void testGetSubTypes_defaultNull() {
    assertNull(createConstructorFunction("Foo").getSubTypes());
  }

  // ---------- hasProperty / hasOwnProperty ----------

  @Test
  public void testHasPropertyPrototypeAlwaysTrue() {
    FunctionType f = createOrdinaryFunction();
    assertTrue(f.hasProperty("prototype"));
    assertTrue(f.hasOwnProperty("prototype"));
  }

  @Test
  public void testHasPropertyForUndefinedNameFalse() {
    // อาศัย behavior เริ่มต้นของ super (PrototypeObjectType) ที่ไม่มีในซอร์สที่ให้มา
    assertFalse(createOrdinaryFunction().hasProperty("nonExistentProp"));
  }

  // ---------- getPropertyType ----------

  @Test
  public void testGetPropertyTypePrototype() {
    FunctionType f = createOrdinaryFunction();
    assertSame(f.getPrototype(), f.getPropertyType("prototype"));
  }

  @Test
  public void testGetPropertyTypeCall_withNullParams() {
    ArrowType arrow = new ArrowType(
        registry, null, registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    FunctionType f = new FunctionType(registry, "f", null, arrow, null, null, false, false);
    JSType callType = f.getPropertyType("call");
    assertNotNull(callType);
    assertTrue(callType.isFunctionType());
  }

  @Test
  public void testGetPropertyTypeCall_withParams() {
    FunctionType f = createOrdinaryFunction();
    assertNotNull(f.getPropertyType("call"));
  }

  @Test
  public void testGetPropertyTypeCall_calledTwiceUsesCache() {
    FunctionType f = createOrdinaryFunction();
    JSType first = f.getPropertyType("call");
    JSType second = f.getPropertyType("call");
    assertSame(first, second);
  }

  @Test
  public void testGetPropertyTypeApply() {
    assertNotNull(createOrdinaryFunction().getPropertyType("apply"));
  }

  @Test
  public void testGetPropertyType_unknownProperty() {
    // ไม่ยืนยันค่า return เพราะพึ่ง super.getPropertyType ที่ไม่มีซอร์สให้ตรวจสอบ
    createOrdinaryFunction().getPropertyType("randomProp");
  }

  // ---------- defineProperty ----------

  @Test
  public void testDefinePropertyPrototypeWithObjectType() {
    FunctionType f = createOrdinaryFunction();
    ObjectType newProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    assertTrue(f.defineProperty("prototype", newProto, false, false));
  }

  @Test
  public void testDefinePropertyPrototypeWithNonObjectTypeReturnsFalse() {
    FunctionType f = createOrdinaryFunction();
    JSType nonObjectType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    assertFalse(f.defineProperty("prototype", nonObjectType, false, false));
  }

  @Test
  public void testDefinePropertyPrototypeEquivalentReturnsTrueWithoutChange() {
    FunctionType f = createOrdinaryFunction();
    FunctionPrototypeType proto = f.getPrototype();
    assertTrue(f.defineProperty("prototype", proto, false, false));
    assertSame(proto, f.getPrototype());
  }

  @Test
  public void testDefineProperty_nonPrototypeDelegatesToSuper() {
    FunctionType f = createOrdinaryFunction();
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    f.defineProperty("customProp", numberType, false, false);
    // ไม่ assert ค่า return เพราะพึ่ง super.defineProperty
  }

  @Test
  public void testIsPropertyTypeInferredPrototypeTrue() {
    assertTrue(createOrdinaryFunction().isPropertyTypeInferred("prototype"));
  }

  // ---------- isEquivalentTo / hashCode / hasEqualCallType ----------

  @Test
  public void testIsEquivalentTo_null() {
    assertFalse(createOrdinaryFunction().isEquivalentTo(null));
  }

  @Test
  public void testIsEquivalentTo_notFunctionType() {
    FunctionType f = createOrdinaryFunction();
    assertFalse(f.isEquivalentTo(registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
  }

  @Test
  public void testIsEquivalentTo_sameConstructorInstance() {
    FunctionType f = createConstructorFunction("Foo");
    assertTrue(f.isEquivalentTo(f));
  }

  @Test
  public void testIsEquivalentTo_differentConstructors() {
    FunctionType f1 = createConstructorFunction("Foo");
    FunctionType f2 = createConstructorFunction("Foo");
    assertFalse(f1.isEquivalentTo(f2));
  }

  @Test
  public void testIsEquivalentTo_constructorVsNonConstructor() {
    FunctionType f1 = createConstructorFunction("Foo");
    FunctionType f2 = createOrdinaryFunction();
    assertFalse(f1.isEquivalentTo(f2));
  }

  @Test
  public void testIsEquivalentTo_interfaceSameName() {
    FunctionType i1 = FunctionType.forInterface(registry, "Bar", null);
    FunctionType i2 = FunctionType.forInterface(registry, "Bar", null);
    assertTrue(i1.isEquivalentTo(i2));
  }

  @Test
  public void testIsEquivalentTo_interfaceDifferentName() {
    FunctionType i1 = FunctionType.forInterface(registry, "Bar", null);
    FunctionType i2 = FunctionType.forInterface(registry, "Baz", null);
    assertFalse(i1.isEquivalentTo(i2));
  }

  @Test
  public void testIsEquivalentTo_interfaceVsNonInterface() {
    FunctionType i1 = FunctionType.forInterface(registry, "Bar", null);
    FunctionType f2 = createOrdinaryFunction();
    assertFalse(i1.isEquivalentTo(f2));
    assertFalse(f2.isEquivalentTo(i1));
  }

  @Test
  public void testIsEquivalentTo_ordinaryFunctionsDifferentReturnType() {
    FunctionType f1 = createOrdinaryFunction();
    ArrowType arrow2 = new ArrowType(
        registry, new Node(Token.LP), registry.getNativeType(JSTypeNative.STRING_TYPE));
    FunctionType f2 = new FunctionType(registry, "f2", null, arrow2, null, null, false, false);
    assertFalse(f1.isEquivalentTo(f2));
  }

  @Test
  public void testHashCode_interfaceUsesReferenceNameHash() {
    FunctionType i = FunctionType.forInterface(registry, "Bar", null);
    assertEquals("Bar".hashCode(), i.hashCode());
  }

  @Test
  public void testHashCode_nonInterfaceUsesCallHash() {
    FunctionType f = createOrdinaryFunction();
    assertEquals(f.getInternalArrowType().hashCode(), f.hashCode());
  }

  @Test
  public void testHasEqualCallType() {
    FunctionType f1 = createOrdinaryFunction();
    FunctionType f2 = createOrdinaryFunction();
    boolean result = f1.hasEqualCallType(f2);
    assertEquals(f1.getInternalArrowType().isEquivalentTo(f2.getInternalArrowType()), result);
  }

  // ---------- toString / toDebugHashCodeString ----------

  @Test
  public void testToStringFunctionInstanceType() {
    FunctionType f = registry.getNativeFunctionType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
    assertEquals("Function", f.toString());
  }

  @Test
  public void testToStringNoParamsUnknownThis() {
    FunctionType f = createOrdinaryFunction();
    String s = f.toString();
    assertTrue(s.startsWith("function ("));
    assertFalse(s.contains("this:"));
  }

  @Test
  public void testToStringWithKnownThisType() {
    ObjectType thisType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    ArrowType arrow = new ArrowType(
        registry, new Node(Token.LP), registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    FunctionType f = new FunctionType(registry, "f", null, arrow, thisType, null, false, false);
    assertTrue(f.toString().contains("this:"));
  }

  @Test
  public void testToStringWithParams() {
    Node lp = new Node(Token.LP);
    Node p1 = Node.newString(Token.NAME, "a");
    p1.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    lp.addChildToBack(p1);
    ArrowType arrow = new ArrowType(
        registry, lp, registry.getNativeType(JSTypeNative.STRING_TYPE));
    FunctionType f = new FunctionType(registry, "f", null, arrow, null, null, false, false);
    assertTrue(f.toString().contains("function ("));
  }

  @Test
  public void testToStringMultipleParams() {
    Node lp = new Node(Token.LP);
    Node p1 = Node.newString(Token.NAME, "a");
    p1.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    Node p2 = Node.newString(Token.NAME, "b");
    p2.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
    lp.addChildToBack(p1);
    lp.addChildToBack(p2);
    ArrowType arrow = new ArrowType(
        registry, lp, registry.getNativeType(JSTypeNative.VOID_TYPE));
    FunctionType f = new FunctionType(registry, "f", null, arrow, null, null, false, false);
    assertTrue(f.toString().contains(", "));
  }

  @Test
  public void testToStringWithVarArgsParam() {
    Node lp = new Node(Token.LP);
    Node p1 = Node.newString(Token.NAME, "rest");
    p1.setVarArgs(true);
    p1.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    lp.addChildToBack(p1);
    ArrowType arrow = new ArrowType(
        registry, lp, registry.getNativeType(JSTypeNative.VOID_TYPE));
    FunctionType f = new FunctionType(registry, "f", null, arrow, null, null, false, false);
    assertTrue(f.toString().contains("...["));
  }

  @Test
  public void testToDebugHashCodeStringWithParams() {
    Node lp = new Node(Token.LP);
    Node p1 = Node.newString(Token.NAME, "a");
    p1.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    Node p2 = Node.newString(Token.NAME, "b");
    p2.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
    lp.addChildToBack(p1);
    lp.addChildToBack(p2);
    ArrowType arrow = new ArrowType(
        registry, lp, registry.getNativeType(JSTypeNative.VOID_TYPE));
    FunctionType f = new FunctionType(registry, "f", null, arrow, null, null, false, false);
    String s = f.toDebugHashCodeString();
    assertNotNull(s);
    assertTrue(s.contains(", "));
  }

  // ---------- isSubtype (บางสาขาที่ระบุชัดในคอมเมนต์ของซอร์ส) ----------

  @Test
  public void testIsSubtype_toInterfaceAlwaysTrue() {
    FunctionType ordinary = createOrdinaryFunction();
    FunctionType iface = FunctionType.forInterface(registry, "Iface", null);
    assertTrue(ordinary.isSubtype(iface));
  }

  @Test
  public void testIsSubtype_interfaceToOrdinaryFalse() {
    FunctionType iface = FunctionType.forInterface(registry, "Iface", null);
    FunctionType ordinary = createOrdinaryFunction();
    assertFalse(iface.isSubtype(ordinary));
  }

  // ---------- getInstanceType / hasInstanceType / setInstanceType ----------

  @Test
  public void testGetInstanceType_constructor() {
    FunctionType f = createConstructorFunction("Foo");
    assertTrue(f.hasInstanceType());
    assertNotNull(f.getInstanceType());
  }

  @Test
  public void testHasInstanceType_ordinaryFalse() {
    assertFalse(createOrdinaryFunction().hasInstanceType());
  }

  @Test(expected = IllegalStateException.class)
  public void testGetInstanceType_ordinaryThrows() {
    createOrdinaryFunction().getInstanceType();
  }

  @Test
  public void testSetInstanceType() {
    FunctionType f = createConstructorFunction("Foo");
    ObjectType newInstance = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    f.setInstanceType(newInstance);
    assertSame(newInstance, f.getInstanceType());
  }

  // ---------- getSource / setSource ----------

  @Test
  public void testGetSetSource() {
    FunctionType f = createOrdinaryFunction();
    assertNull(f.getSource());
    Node src = new Node(Token.FUNCTION);
    f.setSource(src);
    assertSame(src, f.getSource());
  }

  // ---------- templateTypeName ----------

  @Test
  public void testGetTemplateTypeName() {
    ArrowType arrow = new ArrowType(
        registry, new Node(Token.LP), registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    FunctionType f = new FunctionType(registry, "f", null, arrow, null, "T", false, false);
    assertEquals("T", f.getTemplateTypeName());
  }

  @Test
  public void testGetTemplateTypeName_null() {
    assertNull(createOrdinaryFunction().getTemplateTypeName());
  }

  // ---------- getSuperClassConstructor / hasUnknownSupertype / getTopMostDefiningType ----------

  @Test(expected = IllegalArgumentException.class)
  public void testGetSuperClassConstructor_notConstructorOrInterfaceThrows() {
    createOrdinaryFunction().getSuperClassConstructor();
  }

  @Test(expected = IllegalArgumentException.class)
  public void testHasUnknownSupertype_notConstructorOrInterfaceThrows() {
    createOrdinaryFunction().hasUnknownSupertype();
  }

  @Test(expected = IllegalStateException.class)
  public void testGetTopMostDefiningType_notConstructorOrInterfaceThrows() {
    createOrdinaryFunction().getTopMostDefiningType("foo");
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetTopMostDefiningType_propertyNotDefinedThrows() {
    createConstructorFunction("Foo").getTopMostDefiningType("nonExistentProperty");
  }

  // ---------- implemented interfaces ----------

  @Test
  public void testGetImplementedInterfaces_emptyByDefault() {
    FunctionType f = createConstructorFunction("Foo");
    assertFalse(f.getImplementedInterfaces().iterator().hasNext());
  }

  @Test
  public void testGetAllImplementedInterfaces_emptyByDefault() {
    FunctionType f = createConstructorFunction("Foo");
    assertFalse(f.getAllImplementedInterfaces().iterator().hasNext());
  }

  @Test
  public void testSetImplementedInterfaces() {
    FunctionType f = createConstructorFunction("Foo");
    FunctionType iface = FunctionType.forInterface(registry, "Iface", null);
    ObjectType ifaceInstance = iface.getInstanceType();
    f.setImplementedInterfaces(Collections.singletonList(ifaceInstance));
    assertTrue(f.getImplementedInterfaces().iterator().hasNext());
    assertSame(ifaceInstance, f.getImplementedInterfaces().iterator().next());
  }

  @Test
  public void testGetAllImplementedInterfaces() {
    FunctionType f = createConstructorFunction("Foo");
    FunctionType iface = FunctionType.forInterface(registry, "Iface", null);
    ObjectType ifaceInstance = iface.getInstanceType();
    f.setImplementedInterfaces(Collections.singletonList(ifaceInstance));
    assertTrue(Iterables.contains(f.getAllImplementedInterfaces(), ifaceInstance));
  }

  // ---------- sup/inf (getLeastSupertype / getGreatestSubtype) ----------

  @Test
  public void testGetLeastSupertype_sameInstanceReturnsThis() {
    FunctionType f = createOrdinaryFunction();
    assertSame(f, f.getLeastSupertype(f));
  }

  @Test
  public void testGetGreatestSubtype_sameInstanceReturnsThis() {
    FunctionType f = createOrdinaryFunction();
    assertSame(f, f.getGreatestSubtype(f));
  }

  @Test
  public void testGetLeastSupertype_nonFunctionType_fallsBackToSuper() {
    FunctionType f = createOrdinaryFunction();
    JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    // ไม่ assert ค่าที่แน่นอน เพราะพึ่ง super.getLeastSupertype ที่ไม่มีซอร์สให้ตรวจสอบ
    assertNotNull(f.getLeastSupertype(number));
  }

  // ---------- isInstanceType ----------

  @Test
  public void testIsInstanceType_forU2UConstructor() {
    FunctionType u2u = registry.getNativeFunctionType(JSTypeNative.U2U_CONSTRUCTOR_TYPE);
    assertTrue(u2u.isInstanceType());
  }

  @Test
  public void testIsInstanceType_ordinaryFalse() {
    assertFalse(createOrdinaryFunction().isInstanceType());
  }
}
