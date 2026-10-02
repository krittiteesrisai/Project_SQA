package com.google.javascript.rhino.jstype;

import static org.junit.Assert.*;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * JUnit 4 tests for {@link FunctionType}.
 *
 * หมายเหตุ: หลาย assumption เกี่ยวกับ behavior ภายในของ Closure Compiler jstype
 * (เช่น รูปแบบ exact string ของ toString, ค่า null ที่ getPropertyType คืนเมื่อไม่พบ property)
 * ถูกกำกับด้วยคอมเมนต์ "NOTE:" เพื่อระบุว่าเป็นการอนุมานจากพฤติกรรมทั่วไปของโค้ด
 * ไม่ใช่การเดาแบบไม่มีหลักฐานจากซอร์สที่ให้มา
 */
public class FunctionTypeTest {

  private JSTypeRegistry registry;

  @Before
  public void setUp() {
    ErrorReporter errorReporter = new ErrorReporter() {
      @Override
      public void warning(String message, String sourceName, int line, int lineOffset) {
        // no-op สำหรับการทดสอบ
      }
      @Override
      public void error(String message, String sourceName, int line, int lineOffset) {
        // no-op สำหรับการทดสอบ
      }
    };
    registry = new JSTypeRegistry(errorReporter);
  }

  // ---------- Helpers ----------

  private Node newParamsNode(boolean[] optional, boolean[] varArgs) {
    Node lp = new Node(Token.LP);
    for (int i = 0; i < optional.length; i++) {
      Node p = Node.newString(Token.NAME, "p" + i);
      p.setOptionalArg(optional[i]);
      p.setVarArgs(varArgs[i]);
      lp.addChildToBack(p);
    }
    return lp;
  }

  private JSType voidType() {
    return registry.getNativeType(JSTypeNative.VOID_TYPE);
  }

  private FunctionType newOrdinaryFunction(Node params, JSType returnType) {
    ArrowType arrow = new ArrowType(registry, params, returnType);
    return new FunctionType(
        registry, "TestFn", null, arrow, null, null, false, false);
  }

  private FunctionType newConstructorFunction(Node params, JSType returnType) {
    ArrowType arrow = new ArrowType(registry, params, returnType);
    return new FunctionType(
        registry, "TestCtor", null, arrow, null, null, true, false);
  }

  // ---------- Interface creation ----------

  @Test
  public void testForInterface_basicKindFlags() {
    FunctionType iface = FunctionType.forInterface(registry, "MyInterface", null);
    assertTrue(iface.isInterface());
    assertFalse(iface.isConstructor());
    assertFalse(iface.isOrdinaryFunction());
    assertTrue(iface.canBeCalled());
    assertTrue(iface.hasInstanceType());
    assertNotNull(iface.getInstanceType());
    assertNull(iface.getTemplateTypeName());
    assertEquals(0, iface.getMinArguments());
    assertEquals(0, iface.getMaxArguments());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testForInterface_nullNameThrows() {
    // Preconditions.checkArgument(name != null)
    FunctionType.forInterface(registry, null, null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testForInterface_invalidSourceTokenThrows() {
    Node badSource = new Node(Token.NAME);
    FunctionType.forInterface(registry, "Bad", badSource);
  }

  // ---------- Constructor / Ordinary function creation ----------

  @Test
  public void testOrdinaryFunction_kindFlagsAndInstanceType() {
    FunctionType fn = newOrdinaryFunction(newParamsNode(new boolean[0], new boolean[0]), voidType());
    assertTrue(fn.isOrdinaryFunction());
    assertFalse(fn.isConstructor());
    assertFalse(fn.isInterface());
    assertFalse(fn.hasInstanceType());
  }

  @Test(expected = IllegalStateException.class)
  public void testOrdinaryFunction_getInstanceTypeThrows() {
    FunctionType fn = newOrdinaryFunction(newParamsNode(new boolean[0], new boolean[0]), voidType());
    fn.getInstanceType(); // Preconditions.checkState(hasInstanceType())
  }

  @Test
  public void testConstructorFunction_hasInstanceType() {
    FunctionType ctor = newConstructorFunction(newParamsNode(new boolean[0], new boolean[0]), voidType());
    assertTrue(ctor.isConstructor());
    assertTrue(ctor.hasInstanceType());
    assertNotNull(ctor.getInstanceType());
    assertSame(ctor.getInstanceType(), ctor.getTypeOfThis());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testConstructor_invalidSourceTokenThrows() {
    Node badSource = new Node(Token.NAME);
    ArrowType arrow = new ArrowType(registry, newParamsNode(new boolean[0], new boolean[0]), voidType());
    new FunctionType(registry, "Bad", badSource, arrow, null, null, false, false);
  }

  @Test(expected = NullPointerException.class)
  public void testConstructor_nullArrowTypeThrows() {
    // Preconditions.checkNotNull(arrowType)
    new FunctionType(registry, "NullArrow", null, null, null, null, false, false);
  }

  @Test
  public void testTemplateTypeName_setAndGet() {
    ArrowType arrow = new ArrowType(registry, newParamsNode(new boolean[0], new boolean[0]), voidType());
    FunctionType fn = new FunctionType(registry, "T", null, arrow, null, "T", false, false);
    assertEquals("T", fn.getTemplateTypeName());
  }

  // ---------- getMinArguments / getMaxArguments ----------

  @Test
  public void testMinMaxArguments_allRequired() {
    Node params = newParamsNode(new boolean[]{false, false}, new boolean[]{false, false});
    FunctionType fn = newOrdinaryFunction(params, voidType());
    assertEquals(2, fn.getMinArguments());
    assertEquals(2, fn.getMaxArguments());
  }

  @Test
  public void testMinMaxArguments_trailingOptional() {
    Node params = newParamsNode(new boolean[]{false, true}, new boolean[]{false, false});
    FunctionType fn = newOrdinaryFunction(params, voidType());
    assertEquals(1, fn.getMinArguments());
    assertEquals(2, fn.getMaxArguments());
  }

  @Test
  public void testMaxArguments_trailingVarArgsIsMaxInt() {
    Node params = newParamsNode(new boolean[]{false, false}, new boolean[]{false, true});
    FunctionType fn = newOrdinaryFunction(params, voidType());
    assertEquals(1, fn.getMinArguments());
    assertEquals(Integer.MAX_VALUE, fn.getMaxArguments());
  }

  @Test
  public void testMaxArguments_whenParamsNodeNull() {
    ArrowType arrow = new ArrowType(registry, null, voidType());
    FunctionType fn = new FunctionType(registry, "NoParams", null, arrow, null, null, false, false);
    assertNull(fn.getParametersNode());
    assertEquals(Integer.MAX_VALUE, fn.getMaxArguments());
  }

  @Test
  public void testGetParameters_emptyWhenNodeNull() {
    ArrowType arrow = new ArrowType(registry, null, voidType());
    FunctionType fn = new FunctionType(registry, "NoParams2", null, arrow, null, null, false, false);
    int count = 0;
    for (Node ignored : fn.getParameters()) {
      count++;
    }
    assertEquals(0, count);
  }

  @Test
  public void testGetParameters_iteratesChildren() {
    Node params = newParamsNode(new boolean[]{false, false, false}, new boolean[]{false, false, false});
    FunctionType fn = newOrdinaryFunction(params, voidType());
    int count = 0;
    for (Node ignored : fn.getParameters()) {
      count++;
    }
    assertEquals(3, count);
  }

  @Test
  public void testGetParametersNode_sameReference() {
    Node params = newParamsNode(new boolean[]{false}, new boolean[]{false});
    FunctionType fn = newOrdinaryFunction(params, voidType());
    assertSame(params, fn.getParametersNode());
  }

  // ---------- Return type ----------

  @Test
  public void testReturnType_getterAndInferredFlagFalse() {
    FunctionType fn = newOrdinaryFunction(newParamsNode(new boolean[0], new boolean[0]), voidType());
    assertSame(voidType(), fn.getReturnType());
    assertFalse(fn.isReturnTypeInferred());
  }

  @Test
  public void testReturnType_inferredFlagTrue() {
    ArrowType arrow = new ArrowType(
        registry, newParamsNode(new boolean[0], new boolean[0]), voidType(), true);
    FunctionType fn = new FunctionType(registry, "Inferred", null, arrow, null, null, false, false);
    assertTrue(fn.isReturnTypeInferred());
  }

  @Test
  public void testGetInternalArrowType_notNull() {
    FunctionType fn = newOrdinaryFunction(newParamsNode(new boolean[0], new boolean[0]), voidType());
    assertNotNull(fn.getInternalArrowType());
  }

  // ---------- Source getter/setter ----------

  @Test
  public void testSource_defaultNullAndSetter() {
    FunctionType fn = newOrdinaryFunction(newParamsNode(new boolean[0], new boolean[0]), voidType());
    assertNull(fn.getSource());
    Node funcNode = new Node(Token.FUNCTION);
    fn.setSource(funcNode);
    assertSame(funcNode, fn.getSource());
  }

  // ---------- prototype slot / own property names ----------

  @Test
  public void testGetSlot_unknownPropertyReturnsNull() {
    FunctionType fn = newOrdinaryFunction(newParamsNode(new boolean[0], new boolean[0]), voidType());
    assertNull(fn.getSlot("doesNotExist"));
  }

  @Test
  public void testGetSlot_prototypeLazyInitAndOwnPropertyNames() {
    FunctionType fn = newOrdinaryFunction(newParamsNode(new boolean[0], new boolean[0]), voidType());
    assertFalse(fn.getOwnPropertyNames().contains("prototype"));
    Object slot = fn.getSlot("prototype");
    assertNotNull(slot);
    assertTrue(fn.getOwnPropertyNames().contains("prototype"));
  }

  // ---------- setPrototype ----------

  @Test
  public void testSetPrototype_nullReturnsFalse() {
    FunctionType fn = newOrdinaryFunction(newParamsNode(new boolean[0], new boolean[0]), voidType());
    assertFalse(fn.setPrototype(null));
  }

  @Test
  public void testSetPrototype_normalCaseReturnsTrue() {
    FunctionType fn = newOrdinaryFunction(newParamsNode(new boolean[0], new boolean[0]), voidType());
    PrototypeObjectType proto = new PrototypeObjectType(
        registry, "Custom.prototype", registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));
    assertTrue(fn.setPrototype(proto));
    assertSame(proto, fn.getPrototype());
  }

  @Test
  public void testSetPrototype_sameAsInstanceTypeReturnsFalse() {
    // NOTE: สมมติว่า InstanceObjectType extends PrototypeObjectType (ตามการใช้งานใน FunctionType)
    FunctionType ctor = newConstructorFunction(newParamsNode(new boolean[0], new boolean[0]), voidType());
    ObjectType instanceType = ctor.getInstanceType();
    assertTrue(instanceType instanceof PrototypeObjectType);
    boolean result = ctor.setPrototype((PrototypeObjectType) instanceType);
    assertFalse(result);
  }

  // ---------- setPrototypeBasedOn ----------

  @Test
  public void testSetPrototypeBasedOn_wrapsNamedNativeType() {
    FunctionType fn = newOrdinaryFunction(newParamsNode(new boolean[0], new boolean[0]), voidType());
    ObjectType baseType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE); // hasReferenceName() == true
    fn.setPrototypeBasedOn(baseType);
    ObjectType proto = fn.getPrototype();
    assertNotNull(proto);
    assertNotSame(baseType, proto);
    assertSame(baseType, proto.getImplicitPrototype());
  }

  @Test
  public void testSetPrototypeBasedOn_usesAnonymousPrototypeObjectDirectly() {
    FunctionType fn = newOrdinaryFunction(newParamsNode(new boolean[0], new boolean[0]), voidType());
    PrototypeObjectType anonBase = new PrototypeObjectType(
        registry, null, registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));
    fn.setPrototypeBasedOn(anonBase);
    assertSame(anonBase, fn.getPrototype());
  }

  // ---------- hasImplementedInterfaces / getImplementedInterfaces ----------

  @Test
  public void testHasImplementedInterfaces_ordinaryFunctionAlwaysFalse() {
    FunctionType fn = newOrdinaryFunction(newParamsNode(new boolean[0], new boolean[0]), voidType());
    assertFalse(fn.hasImplementedInterfaces()); // isConstructor()==false -> superCtor null -> false
  }

  @Test
  public void testHasImplementedInterfaces_emptyFallsBackToSuperclass() {
    FunctionType ctor = newConstructorFunction(newParamsNode(new boolean[0], new boolean[0]), voidType());
    // ctor ไม่ implement interface เอง จึง fallback ไปที่ superclass constructor (Object)
    assertFalse(ctor.hasImplementedInterfaces());
  }

  @Test
  public void testHasImplementedInterfaces_directTrue() {
    FunctionType iface = FunctionType.forInterface(registry, "IDirect", null);
    FunctionType ctor = newConstructorFunction(newParamsNode(new boolean[0], new boolean[0]), voidType());
    List<ObjectType> ifaces = Lists.newArrayList();
    ifaces.add(iface.getInstanceType());
    ctor.setImplementedInterfaces(ifaces);
    assertTrue(ctor.hasImplementedInterfaces());
  }

  @Test
  public void testGetImplementedInterfaces_nonConstructorReturnsOwnList() {
    FunctionType fn = newOrdinaryFunction(newParamsNode(new boolean[0], new boolean[0]), voidType());
    Iterable<ObjectType> result = fn.getImplementedInterfaces();
    assertFalse(result.iterator().hasNext());
  }

  @Test
  public void testGetImplementedInterfaces_constructorConcatenatesSuperclass() {
    FunctionType ctor = newConstructorFunction(newParamsNode(new boolean[0], new boolean[0]), voidType());
    // superCtor (Object) != null -> exercise Iterables.concat branch
    Iterable<ObjectType> result = ctor.getImplementedInterfaces();
    assertNotNull(result);
  }

  @Test
  public void testGetAllImplementedInterfaces_containsRegisteredInterface() {
    FunctionType iface = FunctionType.forInterface(registry, "IBar", null);
    FunctionType ctor = newConstructorFunction(newParamsNode(new boolean[0], new boolean[0]), voidType());
    ctor.setImplementedInterfaces(ImmutableList.of((ObjectType) iface.getInstanceType()));
    Iterable<ObjectType> all = ctor.getAllImplementedInterfaces();
    assertTrue(Iterables.contains(all, iface.getInstanceType()));
  }

  // ---------- extended interfaces ----------

  @Test(expected = UnsupportedOperationException.class)
  public void testSetExtendedInterfaces_onNonInterfaceThrows() {
    FunctionType ctor = newConstructorFunction(newParamsNode(new boolean[0], new boolean[0]), voidType());
    ctor.setExtendedInterfaces(ImmutableList.<ObjectType>of());
  }

  @Test
  public void testSetExtendedInterfaces_onInterfaceWorks() {
    FunctionType baseIface = FunctionType.forInterface(registry, "IBase", null);
    FunctionType subIface = FunctionType.forInterface(registry, "ISub", null);
    List<ObjectType> extended = Lists.newArrayList();
    extended.add(baseIface.getInstanceType());
    subIface.setExtendedInterfaces(extended);
    assertEquals(1, subIface.getExtendedInterfacesCount());
    assertTrue(Iterables.contains(subIface.getExtendedInterfaces(), baseIface.getInstanceType()));
  }

  // ---------- isEquivalentTo ----------

  @Test
  public void testIsEquivalentTo_nonFunctionTypeIsFalse() {
    FunctionType fn = newOrdinaryFunction(newParamsNode(new boolean[0], new boolean[0]), voidType());
    JSType notAFunction = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
    assertFalse(fn.isEquivalentTo(notAFunction));
  }

  @Test
  public void testIsEquivalentTo_constructorsEqualOnlyIfSameInstance() {
    FunctionType ctor1 = newConstructorFunction(newParamsNode(new boolean[0], new boolean[0]), voidType());
    FunctionType ctor2 = newConstructorFunction(newParamsNode(new boolean[0], new boolean[0]), voidType());
    assertTrue(ctor1.isEquivalentTo(ctor1));
    assertFalse(ctor1.isEquivalentTo(ctor2));
  }

  @Test
  public void testIsEquivalentTo_interfacesEqualByName() {
    FunctionType iface1 = FunctionType.forInterface(registry, "Same", null);
    FunctionType iface2 = FunctionType.forInterface(registry, "Same", null);
    FunctionType iface3 = FunctionType.forInterface(registry, "Different", null);
    assertTrue(iface1.isEquivalentTo(iface2));
    assertFalse(iface1.isEquivalentTo(iface3));
  }

  @Test
  public void testIsEquivalentTo_constructorVsInterfaceIsFalseBothWays() {
    FunctionType ctor = newConstructorFunction(newParamsNode(new boolean[0], new boolean[0]), voidType());
    FunctionType iface = FunctionType.forInterface(registry, "Iface", null);
    assertFalse(ctor.isEquivalentTo(iface));
    assertFalse(iface.isEquivalentTo(ctor));
  }

  @Test
  public void testIsEquivalentTo_ordinaryFunctionsWithSameSignature() {
    Node params = newParamsNode(new boolean[0], new boolean[0]);
    FunctionType fn1 = newOrdinaryFunction(params, voidType());
    FunctionType fn2 = newOrdinaryFunction(params, voidType());
    assertTrue(fn1.isEquivalentTo(fn2));
  }

  // ---------- hashCode / hasEqualCallType ----------

  @Test
  public void testHashCode_interfaceUsesReferenceName() {
    FunctionType iface = FunctionType.forInterface(registry, "HashIface", null);
    assertEquals("HashIface".hashCode(), iface.hashCode());
  }

  @Test
  public void testHasEqualCallType_trueForSameShape() {
    Node params = newParamsNode(new boolean[0], new boolean[0]);
    FunctionType fn1 = newOrdinaryFunction(params, voidType());
    FunctionType fn2 = newOrdinaryFunction(params, voidType());
    assertTrue(fn1.hasEqualCallType(fn2));
  }

  // ---------- toString ----------

  @Test
  public void testToString_noParamsUnknownThis() {
    FunctionType fn = newOrdinaryFunction(newParamsNode(new boolean[0], new boolean[0]), voidType());
    String s = fn.toString();
    assertTrue(s.startsWith("function ("));
    assertTrue(s.contains("):"));
  }

  @Test
  public void testToString_withParamsAndVarArgs() {
    Node lp = new Node(Token.LP);
    Node p1 = Node.newString(Token.NAME, "a");
    p1.setJSType(registry.getNativeType(JSTypeNative.OBJECT_TYPE));
    lp.addChildToBack(p1);
    Node p2 = Node.newString(Token.NAME, "b");
    p2.setJSType(registry.getNativeType(JSTypeNative.OBJECT_TYPE));
    p2.setVarArgs(true);
    lp.addChildToBack(p2);
    FunctionType fn = newOrdinaryFunction(lp, voidType());
    String s = fn.toString();
    assertTrue(s.contains("...["));
  }

  @Test
  public void testToString_showsThisForOrdinaryFunctionWithKnownThis() {
    ObjectType customThis = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    ArrowType arrow = new ArrowType(
        registry, newParamsNode(new boolean[0], new boolean[0]), voidType());
    FunctionType fn = new FunctionType(registry, "ThisFn", null, arrow, customThis, null, false, false);
    assertTrue(fn.toString().contains("this:"));
  }

  @Test
  public void testToString_showsNewForConstructor() {
    ArrowType arrow = new ArrowType(
        registry, newParamsNode(new boolean[0], new boolean[0]), voidType());
    FunctionType ctor = new FunctionType(registry, "CtorFn", null, arrow, null, null, true, false);
    assertTrue(ctor.toString().contains("new:"));
  }

  @Test
  public void testToDebugHashCodeString_basic() {
    FunctionType fn = newOrdinaryFunction(newParamsNode(new boolean[0], new boolean[0]), voidType());
    String s = fn.toDebugHashCodeString();
    assertTrue(s.startsWith("function ("));
  }

  // ---------- getTypeOfThis ----------

  @Test
  public void testGetTypeOfThis_noObjectTypeFallsBackToObjectType() {
    ObjectType noObjectType = registry.getNativeObjectType(JSTypeNative.NO_OBJECT_TYPE);
    ArrowType arrow = new ArrowType(
        registry, newParamsNode(new boolean[0], new boolean[0]), voidType());
    FunctionType fn = new FunctionType(
        registry, "NoObjThisFn", null, arrow, noObjectType, null, false, false);
    assertSame(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE), fn.getTypeOfThis());
  }

  @Test
  public void testGetTypeOfThis_normalCaseReturnsAsIs() {
    ObjectType customThis = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    ArrowType arrow = new ArrowType(
        registry, newParamsNode(new boolean[0], new boolean[0]), voidType());
    FunctionType fn = new FunctionType(
        registry, "CustomThisFn", null, arrow, customThis, null, false, false);
    assertSame(customThis, fn.getTypeOfThis());
  }

  // ---------- cached values / subtypes ----------

  @Test
  public void testHasCachedValues_falseUntilPrototypeAccessed() {
    FunctionType fn = newOrdinaryFunction(newParamsNode(new boolean[0], new boolean[0]), voidType());
    assertFalse(fn.hasCachedValues());
    fn.getPrototype();
    assertTrue(fn.hasCachedValues());
    fn.clearCachedValues(); // ตรวจสอบว่าไม่ throw exception
  }

  @Test
  public void testGetSubTypes_initiallyNull() {
    FunctionType fn = newOrdinaryFunction(newParamsNode(new boolean[0], new boolean[0]), voidType());
    assertNull(fn.getSubTypes());
  }

  // ---------- getSuperClassConstructor / getTopMostDefiningType ----------

  @Test
  public void testGetSuperClassConstructor_defaultsToObjectConstructor() {
    FunctionType ctor = newConstructorFunction(newParamsNode(new boolean[0], new boolean[0]), voidType());
    FunctionType superCtor = ctor.getSuperClassConstructor();
    assertNotNull(superCtor);
    assertTrue(superCtor.isConstructor());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetSuperClassConstructor_requiresCtorOrInterface() {
    FunctionType fn = newOrdinaryFunction(newParamsNode(new boolean[0], new boolean[0]), voidType());
    fn.getSuperClassConstructor(); // Preconditions.checkArgument(isConstructor() || isInterface())
  }

  @Test(expected = IllegalStateException.class)
  public void testGetTopMostDefiningType_requiresCtorOrInterface() {
    FunctionType fn = newOrdinaryFunction(newParamsNode(new boolean[0], new boolean[0]), voidType());
    fn.getTopMostDefiningType("foo"); // Preconditions.checkState(isConstructor() || isInterface())
  }

  // ---------- getPropertyType (lazy "call"/"apply") ----------

  @Test
  public void testGetPropertyType_callWithNullParamsNode() {
    FunctionType fn = newOrdinaryFunction(null, voidType());
    JSType callType = fn.getPropertyType("call");
    assertNotNull(callType);
    // เรียกซ้ำเพื่อชน branch hasOwnProperty(name) == true (ไม่ define ซ้ำ)
    JSType callType2 = fn.getPropertyType("call");
    assertNotNull(callType2);
  }

  @Test
  public void testGetPropertyType_callWithParamsNode() {
    Node params = newParamsNode(new boolean[]{false}, new boolean[]{false});
    FunctionType fn = newOrdinaryFunction(params, voidType());
    JSType callType = fn.getPropertyType("call");
    assertNotNull(callType);
  }

  @Test
  public void testGetPropertyType_apply() {
    FunctionType fn = newOrdinaryFunction(newParamsNode(new boolean[0], new boolean[0]), voidType());
    JSType applyType = fn.getPropertyType("apply");
    assertNotNull(applyType);
  }

  @Test
  public void testGetPropertyType_unrelatedNameReturnsNull() {
    // NOTE: สมมติว่า super.getPropertyType คืน null เมื่อไม่พบ property (ตามพฤติกรรมทั่วไปของ ObjectType)
    FunctionType fn = newOrdinaryFunction(newParamsNode(new boolean[0], new boolean[0]), voidType());
    assertNull(fn.getPropertyType("nonExistentProp"));
  }

  // ---------- defineProperty ----------

  @Test
  public void testDefineProperty_prototypeWithNonObjectTypeReturnsFalse() {
    FunctionType fn = newOrdinaryFunction(newParamsNode(new boolean[0], new boolean[0]), voidType());
    boolean result = fn.defineProperty("prototype", voidType(), false, null);
    assertFalse(result); // objType.toObjectType() == null สำหรับ VOID_TYPE
  }

  @Test
  public void testDefineProperty_prototypeWithObjectTypeReturnsTrue() {
    FunctionType fn = newOrdinaryFunction(newParamsNode(new boolean[0], new boolean[0]), voidType());
    ObjectType objType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    boolean result = fn.defineProperty("prototype", objType, false, null);
    assertTrue(result);
    assertNotNull(fn.getPrototype());
  }

  @Test
  public void testDefineProperty_prototypeAlreadyEquivalentReturnsTrueWithoutChange() {
    FunctionType fn = newOrdinaryFunction(newParamsNode(new boolean[0], new boolean[0]), voidType());
    ObjectType objType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    fn.defineProperty("prototype", objType, false, null);
    ObjectType firstPrototype = fn.getPrototype();
    // เรียกซ้ำด้วย type เดิม -> ชน branch objType.isEquivalentTo(prototype) == true -> return true ทันที
    boolean result = fn.defineProperty("prototype", firstPrototype, false, null);
    assertTrue(result);
    assertSame(firstPrototype, fn.getPrototype());
  }
}
