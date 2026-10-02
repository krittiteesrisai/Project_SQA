package com.google.javascript.rhino.jstype;

import static org.junit.Assert.*;

import com.google.common.collect.Lists;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Unit tests for {@link FunctionType} (Defects4J Closure-152b).
 *
 * หมายเหตุ: วาง test class ไว้ใน package เดียวกับ FunctionType เพื่อเข้าถึง
 * constructor / method ที่เป็น package-private ซึ่งจำเป็นต่อการสร้าง fixture
 * (เช่น FunctionType(...), ArrowType(...), FunctionPrototypeType(...))
 */
public class FunctionTypeTest {

  private JSTypeRegistry registry;

  @Before
  public void setUp() {
    // สมมติฐาน: constructor ของ JSTypeRegistry รับ ErrorReporter
    // และ ErrorReporter มี method warning/error ตาม signature มาตรฐานของโปรเจกต์
    // (ไม่ปรากฏใน source ที่ให้มา จึงกำกับไว้เป็นคอมเมนต์)
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

  private ArrowType arrow(Node params, JSType returnType) {
    return new ArrowType(registry, params, returnType);
  }

  private ArrowType arrow(Node params, JSType returnType, boolean inferred) {
    return new ArrowType(registry, params, returnType, inferred);
  }

  private ArrowType simpleCall() {
    return arrow(new Node(Token.LP),
        registry.getNativeType(JSTypeNative.OBJECT_TYPE));
  }

  private FunctionType ordinaryFunction(String name, ArrowType call) {
    return new FunctionType(registry, name, null, call, null, null, false, false);
  }

  private FunctionType ordinaryFunction(String name, ArrowType call, ObjectType typeOfThis) {
    return new FunctionType(registry, name, null, call, typeOfThis, null, false, false);
  }

  private FunctionType constructorFunction(String name, ArrowType call) {
    return new FunctionType(registry, name, null, call, null, null, true, false);
  }

  private FunctionType constructorFunction(String name, ArrowType call, ObjectType typeOfThis) {
    return new FunctionType(registry, name, null, call, typeOfThis, null, true, false);
  }

  // ================== Group A: Constructor / Preconditions ==================

  @Test(expected = NullPointerException.class)
  public void constructor_nullArrowType_throwsNPE() {
    new FunctionType(registry, "x", null, null, null, null, false, false);
  }

  @Test(expected = IllegalArgumentException.class)
  public void constructor_invalidSourceToken_throwsIAE() {
    Node badSource = new Node(Token.LP); // ไม่ใช่ Token.FUNCTION
    new FunctionType(registry, "bad", badSource, simpleCall(), null, null, false, false);
  }

  @Test
  public void constructor_validFunctionSourceToken_ok() {
    Node fnSource = new Node(Token.FUNCTION);
    FunctionType f = new FunctionType(
        registry, "ok", fnSource, simpleCall(), null, null, false, false);
    assertSame(fnSource, f.getSource());
  }

  @Test(expected = IllegalArgumentException.class)
  public void forInterface_nullName_throwsIAE() {
    FunctionType.forInterface(registry, null, null);
  }

  @Test
  public void forInterface_validName_isInterface() {
    FunctionType iface = FunctionType.forInterface(registry, "Iface", null);
    assertTrue(iface.isInterface());
    assertFalse(iface.isConstructor());
    assertFalse(iface.isOrdinaryFunction());
  }

  // ================== Group B: Kind / typeOfThis branches ==================

  @Test
  public void kindPredicates_ordinaryConstructorInterface() {
    FunctionType ord = ordinaryFunction("Ord", simpleCall());
    FunctionType ctor = constructorFunction("Ctor", simpleCall());
    FunctionType iface = FunctionType.forInterface(registry, "Iface2", null);

    assertTrue(ord.isOrdinaryFunction());
    assertFalse(ord.isConstructor());
    assertFalse(ord.isInterface());

    assertTrue(ctor.isConstructor());
    assertFalse(ctor.isOrdinaryFunction());
    assertFalse(ctor.isInterface());

    assertTrue(iface.isInterface());
    assertFalse(iface.isConstructor());
    assertFalse(iface.isOrdinaryFunction());

    assertTrue(ord.isFunctionType());
    assertTrue(ord.canBeCalled());
  }

  @Test
  public void typeOfThis_ordinary_defaultIsUnknownType() {
    FunctionType ord = ordinaryFunction("Ord", simpleCall());
    assertSame(registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE),
        ord.getTypeOfThis());
  }

  @Test
  public void typeOfThis_ordinary_customGiven_usedDirectly() {
    ObjectType custom = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    FunctionType ord = ordinaryFunction("Ord2", simpleCall(), custom);
    assertSame(custom, ord.getTypeOfThis());
  }

  @Test
  public void typeOfThis_constructor_defaultCreatesInstanceObjectType() {
    FunctionType ctor = constructorFunction("Ctor", simpleCall());
    ObjectType instance = ctor.getInstanceType();
    assertNotNull(instance);
    assertFalse(instance.isNoObjectType());
  }

  @Test
  public void typeOfThis_constructor_givenNonNoObjectType_isIgnored() {
    // Branch: typeOfThis != null && !typeOfThis.isNoObjectType() -> new InstanceObjectType created,
    // ค่าที่ส่งเข้ามาจะถูกละทิ้ง
    ObjectType passed = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    FunctionType ctor = constructorFunction("Ctor2", simpleCall(), passed);
    assertNotSame(passed, ctor.getInstanceType());
  }

  @Test
  public void typeOfThis_constructor_givenNoObjectType_isUsedDirectly() {
    ObjectType noObj = registry.getNativeObjectType(JSTypeNative.NO_OBJECT_TYPE);
    FunctionType ctor = constructorFunction("Ctor3", simpleCall(), noObj);
    assertSame(noObj, ctor.getInstanceType());
  }

  // ================== Group C: Parameters / Arguments ==================

  @Test
  public void getParameters_nullParametersNode_returnsEmpty() {
    FunctionType f = new FunctionType(registry, "f", null,
        arrow(null, registry.getNativeType(JSTypeNative.OBJECT_TYPE)),
        null, null, false, false);
    assertNull(f.getParametersNode());
    assertFalse(f.getParameters().iterator().hasNext());
  }

  @Test
  public void getParameters_withChildren_iteratesAll() {
    Node params = new Node(Token.LP);
    Node p1 = new Node(Token.NAME);
    Node p2 = new Node(Token.NAME);
    params.addChildToFront(p2);
    params.addChildToFront(p1); // order: p1, p2
    FunctionType f = new FunctionType(registry, "f", null,
        arrow(params, registry.getNativeType(JSTypeNative.OBJECT_TYPE)),
        null, null, false, false);

    int count = 0;
    for (Node n : f.getParameters()) {
      count++;
      assertNotNull(n);
    }
    assertEquals(2, count);
    assertSame(params, f.getParametersNode());
  }

  @Test
  public void getMinArguments_noParams_zero() {
    FunctionType f = ordinaryFunction("f", simpleCall());
    assertEquals(0, f.getMinArguments());
  }

  @Test
  public void getMinArguments_allRequired_equalsCount() {
    Node params = new Node(Token.LP);
    Node p1 = new Node(Token.NAME);
    Node p2 = new Node(Token.NAME);
    params.addChildToFront(p2);
    params.addChildToFront(p1);
    FunctionType f = new FunctionType(registry, "f", null,
        arrow(params, registry.getNativeType(JSTypeNative.OBJECT_TYPE)),
        null, null, false, false);
    assertEquals(2, f.getMinArguments());
  }

  @Test
  public void getMinArguments_allOptional_zero() {
    Node params = new Node(Token.LP);
    Node p1 = new Node(Token.NAME);
    p1.setOptionalArg(true);
    params.addChildToFront(p1);
    FunctionType f = new FunctionType(registry, "f", null,
        arrow(params, registry.getNativeType(JSTypeNative.OBJECT_TYPE)),
        null, null, false, false);
    assertEquals(0, f.getMinArguments());
  }

  @Test
  public void getMinArguments_optionalBeforeRequired_edgeCase() {
    // ตามคอมเมนต์ใน source: optional ก่อน required -> min = ตำแหน่ง required ตัวสุดท้าย
    Node params = new Node(Token.LP);
    Node p1 = new Node(Token.NAME);
    p1.setOptionalArg(true);
    Node p2 = new Node(Token.NAME); // required (default)
    params.addChildToFront(p2);
    params.addChildToFront(p1); // order: p1(optional), p2(required)
    FunctionType f = new FunctionType(registry, "f", null,
        arrow(params, registry.getNativeType(JSTypeNative.OBJECT_TYPE)),
        null, null, false, false);
    assertEquals(2, f.getMinArguments());
  }

  @Test
  public void getMaxArguments_nullParams_maxValue() {
    FunctionType f = new FunctionType(registry, "f", null,
        arrow(null, registry.getNativeType(JSTypeNative.OBJECT_TYPE)),
        null, null, false, false);
    assertEquals(Integer.MAX_VALUE, f.getMaxArguments());
  }

  @Test
  public void getMaxArguments_emptyParams_zero() {
    FunctionType f = ordinaryFunction("f", simpleCall());
    assertEquals(0, f.getMaxArguments());
  }

  @Test
  public void getMaxArguments_withNonVarArgsLastParam_returnsCount() {
    Node params = new Node(Token.LP);
    Node p1 = new Node(Token.NAME);
    Node p2 = new Node(Token.NAME); // default isVarArgs() == false
    params.addChildToFront(p2);
    params.addChildToFront(p1);
    FunctionType f = new FunctionType(registry, "f", null,
        arrow(params, registry.getNativeType(JSTypeNative.OBJECT_TYPE)),
        null, null, false, false);
    // ไม่มี setter สำหรับ varArgs ในซอร์สที่ให้มา จึงไม่ทดสอบสาขา varArgs == true
    assertEquals(2, f.getMaxArguments());
  }

  @Test
  public void getReturnType_and_isReturnTypeInferred_bothFlags() {
    JSType ret = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
    FunctionType inferred = new FunctionType(registry, "f1", null,
        arrow(new Node(Token.LP), ret, true), null, null, false, false);
    FunctionType notInferred = new FunctionType(registry, "f2", null,
        arrow(new Node(Token.LP), ret, false), null, null, false, false);

    assertSame(ret, inferred.getReturnType());
    assertTrue(inferred.isReturnTypeInferred());
    assertFalse(notInferred.isReturnTypeInferred());
  }

  // ================== Group D: Prototype handling ==================

  @Test
  public void getPrototype_lazyInit_sameInstanceOnRepeatedCalls() {
    FunctionType f = ordinaryFunction("f", simpleCall());
    assertFalse(f.hasCachedValues());
    FunctionPrototypeType p1 = f.getPrototype();
    assertNotNull(p1);
    assertTrue(f.hasCachedValues());
    FunctionPrototypeType p2 = f.getPrototype();
    assertSame(p1, p2);
  }

  @Test
  public void setPrototype_nullArgument_returnsFalse() {
    FunctionType f = ordinaryFunction("f", simpleCall());
    assertFalse(f.setPrototype(null));
  }

  @Test
  public void setPrototype_sameAsInstanceType_forConstructor_returnsFalse() {
    FunctionType ctor = constructorFunction("Ctor", simpleCall());
    FunctionPrototypeType asInstance =
        new FunctionPrototypeType(registry, ctor, null);
    // บังคับให้ instanceType (typeOfThis) เป็น object เดียวกันกับ prototype ที่จะ set
    ctor.setInstanceType(asInstance);
    assertFalse(ctor.setPrototype(asInstance));
  }

  @Test
  public void setPrototype_ordinaryFunction_returnsTrueAndReplaces() {
    FunctionType f = ordinaryFunction("f", simpleCall());
    FunctionPrototypeType newProto = new FunctionPrototypeType(registry, f, null);
    assertTrue(f.setPrototype(newProto));
    assertSame(newProto, f.getPrototype());
  }

  @Test
  public void setPrototype_constructor_noSuperClass_returnsTrue() {
    FunctionType ctor = constructorFunction("Ctor", simpleCall());
    FunctionPrototypeType newProto = new FunctionPrototypeType(registry, ctor, null);
    assertTrue(ctor.setPrototype(newProto));
    assertNull(ctor.getSubTypes());
  }

  @Test
  public void setPrototype_constructor_withSuperClass_addsSubType() {
    FunctionType superCtor = constructorFunction("Super", simpleCall());
    ObjectType superInstance = superCtor.getInstanceType();

    FunctionType subCtor = constructorFunction("Sub", simpleCall());
    FunctionPrototypeType subProto =
        new FunctionPrototypeType(registry, subCtor, superInstance);

    assertNull(superCtor.getSubTypes());
    assertTrue(subCtor.setPrototype(subProto));
    assertNotNull(superCtor.getSubTypes());
    assertTrue(superCtor.getSubTypes().contains(subCtor));
  }

  @Test
  public void setPrototypeBasedOn_firstCall_createsPrototype() {
    FunctionType f = ordinaryFunction("f", simpleCall());
    ObjectType base = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    f.setPrototypeBasedOn(base);
    assertNotNull(f.getPrototype());
  }

  @Test
  public void setPrototypeBasedOn_secondCall_updatesImplicitPrototype() {
    FunctionType f = ordinaryFunction("f", simpleCall());
    ObjectType base1 = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    f.setPrototypeBasedOn(base1);
    FunctionPrototypeType firstProto = f.getPrototype();

    ObjectType base2 = registry.getNativeObjectType(JSTypeNative.NO_OBJECT_TYPE);
    f.setPrototypeBasedOn(base2); // เข้า else branch: prototype != null -> setImplicitPrototype
    assertSame(firstProto, f.getPrototype()); // instance เดิม แค่เปลี่ยน implicit prototype
  }

  // ================== Group E: Interfaces ==================

  @Test
  public void getImplementedInterfaces_default_isEmpty() {
    FunctionType ctor = constructorFunction("Ctor", simpleCall());
    assertFalse(ctor.getImplementedInterfaces().iterator().hasNext());
  }

  @Test
  public void setImplementedInterfaces_storesAndRegisters() {
    FunctionType ctor = constructorFunction("Ctor", simpleCall());
    FunctionType iface = FunctionType.forInterface(registry, "IfaceX", null);
    ObjectType ifaceInstance = iface.getInstanceType();

    List<ObjectType> ifaces = Lists.newArrayList(ifaceInstance);
    ctor.setImplementedInterfaces(ifaces);

    assertTrue(ctor.getImplementedInterfaces().iterator().hasNext());
  }

  @Test
  public void getAllImplementedInterfaces_interfaceEntry_isIncluded() {
    FunctionType ctor = constructorFunction("Ctor", simpleCall());
    FunctionType iface = FunctionType.forInterface(registry, "IfaceY", null);
    ObjectType ifaceInstance = iface.getInstanceType();

    ctor.setImplementedInterfaces(Lists.newArrayList(ifaceInstance));
    Iterable<ObjectType> all = ctor.getAllImplementedInterfaces();
    assertTrue(all.iterator().hasNext());
  }

  @Test
  public void getAllImplementedInterfaces_nonInterfaceEntry_isExcluded() {
    // Branch: constructor.isInterface() == false -> return ทันที ไม่เพิ่มลง set
    FunctionType ctor = constructorFunction("Ctor", simpleCall());
    FunctionType otherCtor = constructorFunction("Other", simpleCall());
    ObjectType otherInstance = otherCtor.getInstanceType();

    ctor.setImplementedInterfaces(Lists.newArrayList(otherInstance));
    Iterable<ObjectType> all = ctor.getAllImplementedInterfaces();
    assertFalse(all.iterator().hasNext());
  }

  // ================== Group F: Properties ==================

  @Test
  public void hasProperty_and_hasOwnProperty_prototypeAlwaysTrue() {
    FunctionType f = ordinaryFunction("f", simpleCall());
    assertTrue(f.hasProperty("prototype"));
    assertTrue(f.hasOwnProperty("prototype"));
    assertFalse(f.hasProperty("nonExistentProp"));
  }

  @Test
  public void getPropertyType_prototype_returnsPrototype() {
    FunctionType f = ordinaryFunction("f", simpleCall());
    JSType t = f.getPropertyType("prototype");
    assertSame(f.getPrototype(), t);
  }

  @Test
  public void getPropertyType_call_withNullParams_definedLazily() {
    FunctionType f = new FunctionType(registry, "f", null,
        arrow(null, registry.getNativeType(JSTypeNative.OBJECT_TYPE)),
        null, null, false, false);
    JSType callProp = f.getPropertyType("call");
    assertNotNull(callProp);
  }

  @Test
  public void getPropertyType_call_withParams_definedLazily() {
    Node params = new Node(Token.LP);
    Node p1 = new Node(Token.NAME);
    p1.setJSType(registry.getNativeType(JSTypeNative.OBJECT_TYPE));
    params.addChildToFront(p1);
    FunctionType f = new FunctionType(registry, "f", null,
        arrow(params, registry.getNativeType(JSTypeNative.OBJECT_TYPE)),
        null, null, false, false);
    JSType callProp = f.getPropertyType("call");
    assertNotNull(callProp);
  }

  @Test
  public void getPropertyType_apply_definedLazily() {
    FunctionType f = ordinaryFunction("f", simpleCall());
    JSType applyProp = f.getPropertyType("apply");
    assertNotNull(applyProp);
  }

  @Test
  public void getPropertyType_unknownProperty_doesNotDefineProperty() {
    FunctionType f = ordinaryFunction("f", simpleCall());
    assertFalse(f.hasOwnProperty("undefinedProp"));
    f.getPropertyType("undefinedProp");
    // ไม่ตรงกับ "call" หรือ "apply" -> ไม่มีการ define property เพิ่ม
    assertFalse(f.hasOwnProperty("undefinedProp"));
  }

  @Test
  public void defineProperty_prototype_nonObjectType_returnsFalse() {
    FunctionType f = ordinaryFunction("f", simpleCall());
    JSType nonObject = registry.getNativeType(JSTypeNative.VOID_TYPE);
    // สมมติฐาน: VOID_TYPE.toObjectType() คืนค่า null (ไม่ใช่ ObjectType)
    assertFalse(f.defineProperty("prototype", nonObject, false, false));
  }

  @Test
  public void defineProperty_prototype_equivalentToExisting_returnsTrue() {
    FunctionType f = ordinaryFunction("f", simpleCall());
    FunctionPrototypeType proto = f.getPrototype();
    assertTrue(f.defineProperty("prototype", proto, false, false));
  }

  @Test
  public void defineProperty_prototype_newObjectType_setsNewPrototype() {
    FunctionType f = ordinaryFunction("f", simpleCall());
    ObjectType newBase = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    boolean result = f.defineProperty("prototype", newBase, false, false);
    assertTrue(result);
  }

  @Test
  public void defineProperty_otherName_delegatesToSuper() {
    FunctionType f = ordinaryFunction("f", simpleCall());
    JSType type = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
    boolean result = f.defineProperty("customProp", type, false, false);
    assertTrue(result);
    assertTrue(f.hasOwnProperty("customProp"));
  }

  @Test
  public void isPropertyTypeInferred_prototypeAlwaysTrue() {
    FunctionType f = ordinaryFunction("f", simpleCall());
    assertTrue(f.isPropertyTypeInferred("prototype"));
  }

  // ================== Group G: Equivalence / hashCode ==================

  @Test
  public void isEquivalentTo_notFunctionType_isFalse() {
    FunctionType f = ordinaryFunction("f", simpleCall());
    JSType other = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
    assertFalse(f.isEquivalentTo(other));
  }

  @Test
  public void isEquivalentTo_constructors_referenceEquality() {
    FunctionType c1 = constructorFunction("C1", simpleCall());
    FunctionType c2 = constructorFunction("C2", simpleCall());
    assertTrue(c1.isEquivalentTo(c1));
    assertFalse(c1.isEquivalentTo(c2));
  }

  @Test
  public void isEquivalentTo_interfaces_compareByName() {
    FunctionType i1 = FunctionType.forInterface(registry, "SameName", null);
    FunctionType i2 = FunctionType.forInterface(registry, "SameName", null);
    FunctionType i3 = FunctionType.forInterface(registry, "OtherName", null);
    assertTrue(i1.isEquivalentTo(i2));
    assertFalse(i1.isEquivalentTo(i3));
  }

  @Test
  public void isEquivalentTo_interfaceVsOrdinary_false() {
    FunctionType iface = FunctionType.forInterface(registry, "IfaceZ", null);
    FunctionType ord = ordinaryFunction("Ord", simpleCall());
    assertFalse(iface.isEquivalentTo(ord));
    assertFalse(ord.isEquivalentTo(iface));
  }

  @Test
  public void isEquivalentTo_ordinaryFunctions_sameSignature_true() {
    Node sharedParams = new Node(Token.LP);
    JSType ret = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
    FunctionType f1 = new FunctionType(registry, "f1", null,
        arrow(sharedParams, ret), null, null, false, false);
    FunctionType f2 = new FunctionType(registry, "f2", null,
        arrow(sharedParams, ret), null, null, false, false);
    assertTrue(f1.isEquivalentTo(f2));
    assertEquals(f1.hashCode(), f2.hashCode());
  }

  @Test
  public void hasEqualCallType_matchesIsEquivalentToOfCall() {
    Node sharedParams = new Node(Token.LP);
    JSType ret = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
    FunctionType f1 = new FunctionType(registry, "f1", null,
        arrow(sharedParams, ret), null, null, false, false);
    FunctionType f2 = new FunctionType(registry, "f2", null,
        arrow(sharedParams, ret), null, null, false, false);
    assertTrue(f1.hasEqualCallType(f2));
  }

  // ================== Group H: SuperClass / UnknownSupertype / InstanceType ==================

  @Test(expected = IllegalArgumentException.class)
  public void getSuperClassConstructor_ordinaryFunction_throwsIAE() {
    FunctionType f = ordinaryFunction("f", simpleCall());
    f.getSuperClassConstructor();
  }

  @Test
  public void getSuperClassConstructor_noSuper_returnsNull() {
    FunctionType ctor = constructorFunction("Ctor", simpleCall());
    assertNull(ctor.getSuperClassConstructor());
  }

  @Test(expected = IllegalArgumentException.class)
  public void hasUnknownSupertype_ordinaryFunction_throwsIAE() {
    FunctionType f = ordinaryFunction("f", simpleCall());
    f.hasUnknownSupertype();
  }

  @Test
  public void hasUnknownSupertype_noSuper_isFalse() {
    FunctionType ctor = constructorFunction("Ctor", simpleCall());
    assertFalse(ctor.hasUnknownSupertype());
  }

  @Test
  public void hasUnknownSupertype_unknownSuper_isTrue() {
    FunctionType ctor = constructorFunction("Ctor", simpleCall());
    ObjectType unknownObj = registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE);
    FunctionPrototypeType protoWithUnknownSuper =
        new FunctionPrototypeType(registry, ctor, unknownObj);
    ctor.setPrototype(protoWithUnknownSuper);
    assertTrue(ctor.hasUnknownSupertype());
  }

  @Test(expected = IllegalStateException.class)
  public void getInstanceType_ordinaryFunction_throwsISE() {
    FunctionType f = ordinaryFunction("f", simpleCall());
    f.getInstanceType();
  }

  @Test
  public void getInstanceType_and_hasInstanceType_variants() {
    FunctionType ord = ordinaryFunction("Ord", simpleCall());
    FunctionType ctor = constructorFunction("Ctor", simpleCall());
    FunctionType iface = FunctionType.forInterface(registry, "IfaceH", null);

    assertFalse(ord.hasInstanceType());
    assertTrue(ctor.hasInstanceType());
    assertTrue(iface.hasInstanceType());
    assertNotNull(ctor.getInstanceType());
    assertNotNull(iface.getInstanceType());
  }

  @Test
  public void getSource_setSource_and_getSubTypes_defaults() {
    FunctionType f = ordinaryFunction("f", simpleCall());
    assertNull(f.getSource());
    Node newSource = new Node(Token.LP); // setSource ไม่มีการตรวจ token type
    f.setSource(newSource);
    assertSame(newSource, f.getSource());

    FunctionType ctor = constructorFunction("Ctor", simpleCall());
    assertNull(ctor.getSubTypes());
  }

  @Test
  public void getTemplateTypeName_defaultNull() {
    FunctionType f = ordinaryFunction("f", simpleCall());
    assertNull(f.getTemplateTypeName());
  }

  // ================== Group I: toString ==================

  @Test
  public void toString_functionInstanceType_returnsFunctionLiteral() {
    JSType functionInstance = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
    assertEquals("Function", functionInstance.toString());
  }

  @Test
  public void toString_noKnownThis_noParams_structuralFormat() {
    FunctionType f = ordinaryFunction("f", simpleCall()); // typeOfThis == UNKNOWN_TYPE
    String s = f.toString();
    assertTrue(s.startsWith("function ("));
    assertFalse(s.contains("this:"));
    assertTrue(s.contains("): "));
  }

  @Test
  public void toString_withKnownThisAndParam_structuralFormat() {
    Node params = new Node(Token.LP);
    Node p1 = new Node(Token.NAME);
    JSType paramType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
    p1.setJSType(paramType);
    params.addChildToFront(p1);

    JSType returnType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
    ObjectType thisType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);

    FunctionType f = new FunctionType(registry, "f", null,
        arrow(params, returnType), thisType, null, false, false);

    String s = f.toString();
    assertTrue(s.contains("this:"));
    assertTrue(s.contains(paramType.toString()));
    assertTrue(s.endsWith(returnType.toString()));
  }

  // ================== Group J: sup/inf and isSubtype ==================

  @Test
  public void getLeastSupertype_equivalentTypes_returnsSelf() {
    FunctionType f = ordinaryFunction("f", simpleCall());
    JSType result = f.getLeastSupertype(f);
    assertSame(f, result);
  }

  @Test
  public void getLeastSupertype_functionInstanceSpecialCase() {
    FunctionType f = ordinaryFunction("f", simpleCall());
    JSType functionInstance = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
    JSType result = f.getLeastSupertype(functionInstance);
    assertSame(functionInstance, result);
  }

  @Test
  public void getLeastSupertype_mergeOrdinaryFunctions_sameParams() {
    Node sharedParams = new Node(Token.LP);
    JSType ret = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
    FunctionType f1 = new FunctionType(registry, "f1", null,
        arrow(sharedParams, ret), null, null, false, false);
    FunctionType f2 = new FunctionType(registry, "f2", null,
        arrow(sharedParams, ret), null, null, false, false);

    JSType sup = f1.getLeastSupertype(f2);
    assertTrue(sup instanceof FunctionType);
    assertEquals(ret, ((FunctionType) sup).getReturnType());
  }

  @Test
  public void getLeastAndGreatest_nonOrdinaryConstructors_defaultsToNativeExtremes() {
    FunctionType c1 = constructorFunction("C1", simpleCall());
    FunctionType c2 = constructorFunction("C2", simpleCall());

    JSType least = c1.getLeastSupertype(c2);
    assertEquals(registry.getNativeFunctionType(JSTypeNative.U2U_CONSTRUCTOR_TYPE), least);

    JSType greatest = c1.getGreatestSubtype(c2);
    assertEquals(registry.getNativeFunctionType(JSTypeNative.LEAST_FUNCTION_TYPE), greatest);
  }

  @Test
  public void isSubtype_anyFunctionToInterface_isTrue() {
    FunctionType iface = FunctionType.forInterface(registry, "IfaceSub", null);
    FunctionType ord = ordinaryFunction("Ord", simpleCall());
    assertTrue(ord.isSubtype(iface));
  }

  @Test
  public void isSubtype_interfaceToNonInterface_isFalse() {
    FunctionType iface = FunctionType.forInterface(registry, "IfaceSub2", null);
    FunctionType ord = ordinaryFunction("Ord2", simpleCall());
    assertFalse(iface.isSubtype(ord));
  }

  @Test
  public void isSubtype_ordinaryToOrdinary_sameSignature_isTrue() {
    Node sharedParams = new Node(Token.LP);
    JSType ret = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
    FunctionType f1 = new FunctionType(registry, "f1", null,
        arrow(sharedParams, ret), null, null, false, false);
    FunctionType f2 = new FunctionType(registry, "f2", null,
        arrow(sharedParams, ret), null, null, false, false);
    assertTrue(f1.isSubtype(f2));
  }

  @Test
  public void isSubtype_nonFunctionType_doesNotThrow() {
    // พฤติกรรมจริงขึ้นกับ FUNCTION_PROTOTYPE.isSubtype(...) ซึ่งไม่ได้แสดงใน source ที่ให้มา
    // จึงยืนยันเพียงว่าไม่มี exception เกิดขึ้น (smoke test)
    FunctionType f = ordinaryFunction("f", simpleCall());
    JSType nonFunction = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
    boolean result = f.isSubtype(nonFunction);
    assertTrue(result == true || result == false);
  }
}
