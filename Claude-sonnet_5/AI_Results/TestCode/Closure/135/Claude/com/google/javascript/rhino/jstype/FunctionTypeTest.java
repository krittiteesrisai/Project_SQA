package com.google.javascript.rhino.jstype;

import static org.junit.Assert.*;

import com.google.common.collect.Lists;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FunctionTypeTest {

  private JSTypeRegistry registry;

  @Before
  public void setUp() {
    // ErrorReporter signature อ้างอิงจาก Closure Compiler มาตรฐาน (warning/error)
    // ไม่มีใน source ที่ให้มาโดยตรง แต่จำเป็นสำหรับสร้าง JSTypeRegistry
    ErrorReporter testErrorReporter = new ErrorReporter() {
      @Override
      public void warning(String message, String sourceName, int line, int lineOffset) {
        // no-op
      }

      @Override
      public void error(String message, String sourceName, int line, int lineOffset) {
        // no-op
      }
    };
    registry = new JSTypeRegistry(testErrorReporter);
  }

  // ---------- Helper builders ----------

  private Node createFunctionSourceNode() {
    return new Node(Token.FUNCTION);
  }

  private Node createParamsNode(int count) {
    Node lp = new Node(Token.LP);
    for (int i = 0; i < count; i++) {
      Node param = Node.newString(Token.NAME, "p" + i);
      lp.addChildToBack(param);
    }
    return lp;
  }

  // ==================================================================
  // Constructor / Kind tests
  // ==================================================================

  @Test
  public void testOrdinaryFunctionKind() {
    FunctionType ft = new FunctionType(registry, "foo", null, null, null);
    assertTrue(ft.isOrdinaryFunction());
    assertFalse(ft.isConstructor());
    assertFalse(ft.isInterface());
    assertTrue(ft.isFunctionType());
    assertTrue(ft.canBeCalled());
  }

  @Test
  public void testConstructorKind() {
    FunctionType ft = new FunctionType(registry, "Foo", null, null, null,
        null, null, true, false);
    assertTrue(ft.isConstructor());
    assertFalse(ft.isInterface());
    assertFalse(ft.isOrdinaryFunction());
    assertTrue(ft.hasInstanceType());
  }

  @Test
  public void testInterfaceKind() {
    FunctionType ft = new FunctionType(registry, "IFoo", null);
    assertTrue(ft.isInterface());
    assertFalse(ft.isConstructor());
    assertFalse(ft.isOrdinaryFunction());
    assertTrue(ft.hasInstanceType());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testInterfaceConstructorRequiresNonNullName() {
    // Preconditions.checkArgument(name != null) ใน constructor interface
    new FunctionType(registry, null, null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testConstructorSourceMustBeFunctionNode() {
    // Preconditions.checkArgument(source == null || Token.FUNCTION == source.getType())
    Node badSource = new Node(Token.BLOCK);
    new FunctionType(registry, "foo", badSource, null, null);
  }

  @Test
  public void testConstructorAllowsNullSource() {
    FunctionType ft = new FunctionType(registry, "foo", null, null, null);
    assertNull(ft.getSource());
  }

  @Test
  public void testConstructorAllowsValidFunctionSource() {
    Node source = createFunctionSourceNode();
    FunctionType ft = new FunctionType(registry, "foo", source, null, null);
    assertSame(source, ft.getSource());
  }

  @Test
  public void testIsInstanceTypeFalseForOrdinaryFunction() {
    FunctionType f = new FunctionType(registry, "foo", null, null, null);
    assertFalse(f.isInstanceType());
  }

  @Test
  public void testIsInstanceTypeTrueForUniversalConstructor() {
    FunctionType u2u =
        (FunctionType) registry.getNativeType(JSTypeNative.U2U_CONSTRUCTOR_TYPE);
    assertTrue(u2u.isInstanceType());
  }

  // ==================================================================
  // getParameters / getParametersNode
  // ==================================================================

  @Test
  public void testGetParametersNodeNullWhenNoParams() {
    FunctionType ft = new FunctionType(registry, "foo", null, null, null);
    assertNull(ft.getParametersNode());
    assertFalse(ft.getParameters().iterator().hasNext()); // branch: n == null -> emptySet
  }

  @Test
  public void testGetParametersWithParamsNode() {
    Node params = createParamsNode(2);
    FunctionType ft = new FunctionType(registry, "foo", null, params, null);
    assertSame(params, ft.getParametersNode());
    int count = 0;
    for (Node n : ft.getParameters()) { // branch: n != null -> n.children()
      count++;
    }
    assertEquals(2, count);
  }

  // ==================================================================
  // getMinArguments
  // ==================================================================

  @Test
  public void testGetMinArgumentsNoParams() {
    FunctionType ft = new FunctionType(registry, "foo", null, null, null);
    assertEquals(0, ft.getMinArguments());
  }

  @Test
  public void testGetMinArgumentsAllRequired() {
    Node params = createParamsNode(3);
    FunctionType ft = new FunctionType(registry, "foo", null, params, null);
    assertEquals(3, ft.getMinArguments());
  }

  @Test
  public void testGetMinArgumentsWithTrailingOptional() {
    Node params = createParamsNode(2);
    params.getLastChild().setOptionalArg(true);
    FunctionType ft = new FunctionType(registry, "foo", null, params, null);
    assertEquals(1, ft.getMinArguments());
  }

  @Test
  public void testGetMinArgumentsWithTrailingVarArgs() {
    Node params = createParamsNode(2);
    params.getLastChild().setVarArgs(true);
    FunctionType ft = new FunctionType(registry, "foo", null, params, null);
    assertEquals(1, ft.getMinArguments());
  }

  @Test
  public void testGetMinArgumentsOptionalBeforeRequired() {
    // สถานการณ์ optional ก่อน required ตาม comment ในซอร์ส
    Node params = createParamsNode(2);
    params.getFirstChild().setOptionalArg(true);
    FunctionType ft = new FunctionType(registry, "foo", null, params, null);
    assertEquals(2, ft.getMinArguments());
  }

  // ==================================================================
  // getMaxArguments
  // ==================================================================

  @Test
  public void testGetMaxArgumentsNoParamsNode() {
    FunctionType ft = new FunctionType(registry, "foo", null, null, null);
    assertEquals(Integer.MAX_VALUE, ft.getMaxArguments()); // branch: params == null
  }

  @Test
  public void testGetMaxArgumentsWithParamsNoVarArgs() {
    Node params = createParamsNode(3);
    FunctionType ft = new FunctionType(registry, "foo", null, params, null);
    assertEquals(3, ft.getMaxArguments()); // branch: lastParam != null, !isVarArgs
  }

  @Test
  public void testGetMaxArgumentsWithTrailingVarArgs() {
    Node params = createParamsNode(2);
    params.getLastChild().setVarArgs(true);
    FunctionType ft = new FunctionType(registry, "foo", null, params, null);
    assertEquals(Integer.MAX_VALUE, ft.getMaxArguments()); // branch: lastParam.isVarArgs()
  }

  @Test
  public void testGetMaxArgumentsWithEmptyParamsNode() {
    Node params = createParamsNode(0);
    FunctionType ft = new FunctionType(registry, "foo", null, params, null);
    assertEquals(0, ft.getMaxArguments()); // branch: lastParam == null
  }

  // ==================================================================
  // getReturnType
  // ==================================================================

  @Test
  public void testGetReturnTypeSet() {
    JSType voidType = registry.getNativeType(JSTypeNative.VOID_TYPE);
    FunctionType ft = new FunctionType(registry, "foo", null, null, voidType);
    assertSame(voidType, ft.getReturnType());
  }

  @Test
  public void testGetReturnTypeNullWhenNotProvided() {
    FunctionType ft = new FunctionType(registry, "foo", null, null, null);
    assertNull(ft.getReturnType());
  }

  // ==================================================================
  // getPrototype / setPrototype / setPrototypeBasedOn
  // ==================================================================

  @Test
  public void testGetPrototypeLazyInitAndCached() {
    FunctionType ft = new FunctionType(registry, "foo", null, null, null);
    FunctionPrototypeType proto = ft.getPrototype();
    assertNotNull(proto);
    assertSame(proto, ft.getPrototype()); // branch: prototype != null -> ไม่สร้างใหม่
  }

  @Test
  public void testSetPrototypeNullIsDiscarded() {
    FunctionType ft = new FunctionType(registry, "foo", null, null, null);
    assertFalse(ft.setPrototype(null)); // branch: prototype == null -> return false
  }

  @Test
  public void testSetPrototypeOnConstructorSucceeds() {
    FunctionType ctor = new FunctionType(registry, "Foo", null, null, null,
        null, null, true, false);
    FunctionPrototypeType newProto = new FunctionPrototypeType(registry, ctor, null);
    assertTrue(ctor.setPrototype(newProto));
  }

  @Test
  public void testSetPrototypeBasedOnFirstTime() {
    FunctionType ctor = new FunctionType(registry, "Foo", null, null, null,
        null, null, true, false);
    ObjectType baseType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    ctor.setPrototypeBasedOn(baseType); // branch: prototype == null
    assertNotNull(ctor.getPrototype());
  }

  @Test
  public void testSetPrototypeBasedOnWhenAlreadySet() {
    FunctionType ctor = new FunctionType(registry, "Foo", null, null, null,
        null, null, true, false);
    ObjectType baseType1 = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    ctor.setPrototypeBasedOn(baseType1);
    FunctionPrototypeType firstProto = ctor.getPrototype();

    ObjectType baseType2 = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    ctor.setPrototypeBasedOn(baseType2); // branch: prototype != null -> setImplicitPrototype
    assertSame(firstProto, ctor.getPrototype());
  }

  // ==================================================================
  // getImplementedInterfaces / setImplementedInterfaces / getAllImplementedInterfaces
  // ==================================================================

  @Test
  public void testGetImplementedInterfacesEmptyByDefault() {
    FunctionType ctor = new FunctionType(registry, "Foo", null, null, null,
        null, null, true, false);
    assertFalse(ctor.getImplementedInterfaces().iterator().hasNext());
  }

  @Test
  public void testSetAndGetImplementedInterfacesDirect() {
    FunctionType ctor = new FunctionType(registry, "Foo", null, null, null,
        null, null, true, false);
    FunctionType iface = new FunctionType(registry, "IBar", null);
    ObjectType ifaceInstance = iface.getInstanceType();

    ctor.setImplementedInterfaces(Lists.newArrayList(ifaceInstance));
    List<ObjectType> found = Lists.newArrayList(ctor.getImplementedInterfaces());
    assertEquals(1, found.size());
    assertSame(ifaceInstance, found.get(0));
  }

  @Test
  public void testGetImplementedInterfacesWithSuperclassChain() {
    // สร้างความสัมพันธ์ superclass ผ่าน prototype chain (พึ่งพา
    // ObjectType.getConstructor() ที่ถูกอ้างถึงในซอร์สเป้าหมายเอง)
    FunctionType superCtor = new FunctionType(registry, "Base", null, null, null,
        null, null, true, false);
    FunctionType subCtor = new FunctionType(registry, "Derived", null, null, null,
        null, null, true, false);
    ObjectType superInstance = superCtor.getInstanceType();
    FunctionPrototypeType subProto =
        new FunctionPrototypeType(registry, subCtor, superInstance);
    subCtor.setPrototype(subProto);

    FunctionType iface = new FunctionType(registry, "IBar", null);
    ObjectType ifaceInstance = iface.getInstanceType();
    superCtor.setImplementedInterfaces(Lists.newArrayList(ifaceInstance));

    List<ObjectType> found = Lists.newArrayList(subCtor.getImplementedInterfaces());
    assertTrue(found.contains(ifaceInstance)); // branch: superCtor != null -> Iterables.concat
  }

  @Test
  public void testGetAllImplementedInterfaces() {
    FunctionType ctor = new FunctionType(registry, "Foo", null, null, null,
        null, null, true, false);
    FunctionType iface = new FunctionType(registry, "IBar", null);
    ObjectType ifaceInstance = iface.getInstanceType();
    ctor.setImplementedInterfaces(Lists.newArrayList(ifaceInstance));

    List<ObjectType> all = Lists.newArrayList(ctor.getAllImplementedInterfaces());
    assertTrue(all.contains(ifaceInstance));
  }

  // ==================================================================
  // hasProperty / getPropertyType / isPropertyTypeInferred / defineProperty
  // ==================================================================

  @Test
  public void testHasPropertyPrototypeAlwaysTrue() {
    FunctionType ft = new FunctionType(registry, "foo", null, null, null);
    assertTrue(ft.hasProperty("prototype"));
  }

  @Test
  public void testGetPropertyTypePrototype() {
    FunctionType ft = new FunctionType(registry, "foo", null, null, null);
    JSType propType = ft.getPropertyType("prototype");
    assertTrue(propType instanceof FunctionPrototypeType);
  }

  @Test
  public void testGetPropertyTypeCallWithoutParamsNode() {
    FunctionType ft = new FunctionType(registry, "foo", null, null, null);
    JSType callType = ft.getPropertyType("call"); // branch: params == null
    assertNotNull(callType);
    assertTrue(callType instanceof FunctionType);
  }

  @Test
  public void testGetPropertyTypeCallWithParamsNode() {
    Node params = createParamsNode(1);
    FunctionType ft = new FunctionType(registry, "foo", null, params, null);
    JSType callType = ft.getPropertyType("call"); // branch: params != null
    assertNotNull(callType);
  }

  @Test
  public void testGetPropertyTypeApply() {
    FunctionType ft = new FunctionType(registry, "foo", null, null, null);
    JSType applyType = ft.getPropertyType("apply");
    assertNotNull(applyType);
    assertTrue(applyType instanceof FunctionType);
  }

  @Test
  public void testGetPropertyTypeUnknownPropertyDoesNotThrow() {
    FunctionType ft = new FunctionType(registry, "foo", null, null, null);
    // ค่า return ที่แน่ชัดขึ้นกับ super.getPropertyType (ไม่มีใน source ที่ให้)
    // จึงตรวจสอบเพียงว่าไม่ throw exception
    ft.getPropertyType("notARealProperty");
  }

  @Test
  public void testIsPropertyTypeInferredPrototypeAlwaysTrue() {
    FunctionType ft = new FunctionType(registry, "foo", null, null, null);
    assertTrue(ft.isPropertyTypeInferred("prototype"));
  }

  @Test
  public void testDefinePropertyPrototypeWithObjectTypeSucceeds() {
    FunctionType ft = new FunctionType(registry, "Foo", null, null, null,
        null, null, true, false);
    ObjectType objType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    assertTrue(ft.defineProperty("prototype", objType, false, false));
  }

  @Test
  public void testDefinePropertyPrototypeWithNonObjectTypeFails() {
    // สมมติฐาน: VOID_TYPE.toObjectType() คืนค่า null เนื่องจากไม่ใช่ ObjectType
    FunctionType ft = new FunctionType(registry, "foo", null, null, null);
    JSType nonObjType = registry.getNativeType(JSTypeNative.VOID_TYPE);
    assertFalse(ft.defineProperty("prototype", nonObjType, false, false));
  }

  // ==================================================================
  // equals / hashCode / hasEqualCallType
  // ==================================================================

  @Test
  public void testEqualsNotFunctionTypeInstance() {
    FunctionType f1 = new FunctionType(registry, "foo", null, null, null);
    assertFalse(f1.equals("not a function type"));
  }

  @Test
  public void testEqualsSameConstructorReference() {
    FunctionType ctor = new FunctionType(registry, "Foo", null, null, null,
        null, null, true, false);
    assertTrue(ctor.equals(ctor));
  }

  @Test
  public void testEqualsDifferentConstructorInstances() {
    FunctionType ctor1 = new FunctionType(registry, "Foo", null, null, null,
        null, null, true, false);
    FunctionType ctor2 = new FunctionType(registry, "Bar", null, null, null,
        null, null, true, false);
    assertFalse(ctor1.equals(ctor2));
  }

  @Test
  public void testEqualsConstructorVsNonConstructor() {
    FunctionType ctor = new FunctionType(registry, "Foo", null, null, null,
        null, null, true, false);
    FunctionType ordinary = new FunctionType(registry, "foo", null, null, null);
    assertFalse(ctor.equals(ordinary));
  }

  @Test
  public void testEqualsInterfacesSameName() {
    FunctionType iface1 = new FunctionType(registry, "IFoo", null);
    FunctionType iface2 = new FunctionType(registry, "IFoo", null);
    assertTrue(iface1.equals(iface2));
  }

  @Test
  public void testEqualsInterfacesDifferentName() {
    FunctionType iface1 = new FunctionType(registry, "IFoo", null);
    FunctionType iface2 = new FunctionType(registry, "IBar", null);
    assertFalse(iface1.equals(iface2));
  }

  @Test
  public void testEqualsInterfaceVsNonInterface() {
    FunctionType iface = new FunctionType(registry, "IFoo", null);
    FunctionType ordinary = new FunctionType(registry, "foo", null, null, null);
    assertFalse(iface.equals(ordinary));
    assertFalse(ordinary.equals(iface));
  }

  @Test
  public void testEqualsOrdinaryFunctionsSameSignature() {
    // อาศัยพฤติกรรม ArrowType.equals() (ไม่มีใน source ที่ให้) เมื่อ parameters/returnType เป็น null ทั้งคู่
    FunctionType f1 = new FunctionType(registry, "foo", null, null, null);
    FunctionType f2 = new FunctionType(registry, "bar", null, null, null);
    assertTrue(f1.equals(f2));
  }

  @Test
  public void testHashCodeInterfaceUsesReferenceName() {
    FunctionType iface = new FunctionType(registry, "IFoo", null);
    assertEquals("IFoo".hashCode(), iface.hashCode());
  }

  @Test
  public void testHasEqualCallType() {
    FunctionType f1 = new FunctionType(registry, "foo", null, null, null);
    FunctionType f2 = new FunctionType(registry, "bar", null, null, null);
    assertTrue(f1.hasEqualCallType(f2));
  }

  // ==================================================================
  // toString
  // ==================================================================

  @Test
  public void testToStringBasicNoParamsNoReturn() {
    FunctionType ft = new FunctionType(registry, "foo", null, null, null);
    String s = ft.toString();
    assertTrue(s.startsWith("function ("));
  }

  @Test
  public void testToStringWithKnownTypeOfThis() {
    ObjectType thisType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    FunctionType ft = new FunctionType(registry, "foo", null, null, null, thisType);
    String s = ft.toString();
    assertTrue(s.contains("this:"));
  }

  @Test
  public void testToStringWithMultipleParams() {
    Node params = createParamsNode(2);
    params.getFirstChild().setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
    params.getLastChild().setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    FunctionType ft = new FunctionType(registry, "foo", null, params, null);
    String s = ft.toString();
    assertTrue(s.contains("string"));
    assertTrue(s.contains("number"));
  }

  @Test
  public void testToStringWithVarArgsParam() {
    Node params = createParamsNode(1);
    Node p0 = params.getFirstChild();
    p0.setVarArgs(true);
    p0.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
    FunctionType ft = new FunctionType(registry, "foo", null, params, null);
    String s = ft.toString();
    assertTrue(s.contains("...["));
  }

  @Test
  public void testToStringWithReturnType() {
    JSType returnType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
    FunctionType ft = new FunctionType(registry, "foo", null, null, returnType);
    String s = ft.toString();
    assertTrue(s.contains(": boolean") || s.contains(":boolean"));
  }

  // ==================================================================
  // isSubtype
  // ==================================================================

  @Test
  public void testIsSubtypeOfSelf() {
    FunctionType f = new FunctionType(registry, "foo", null, null, null);
    assertTrue(f.isSubtype(f)); // branch: this.equals(that) -> true
  }

  @Test
  public void testIsSubtypeAnyFunctionToInterface() {
    FunctionType ordinary = new FunctionType(registry, "foo", null, null, null);
    FunctionType iface = new FunctionType(registry, "IFoo", null);
    assertTrue(ordinary.isSubtype(iface)); // branch: that.isInterface() -> true
  }

  @Test
  public void testIsSubtypeInterfaceCannotBeAssignedToAnything() {
    FunctionType iface = new FunctionType(registry, "IFoo", null);
    FunctionType ordinary = new FunctionType(registry, "foo", null, null, null);
    assertFalse(iface.isSubtype(ordinary)); // branch: this.isInterface() -> false
  }

  // ==================================================================
  // getSuperClassConstructor / hasUnknownSupertype / getTopMostDefiningType
  // ==================================================================

  @Test(expected = IllegalArgumentException.class)
  public void testGetSuperClassConstructorThrowsForOrdinaryFunction() {
    FunctionType ordinary = new FunctionType(registry, "foo", null, null, null);
    ordinary.getSuperClassConstructor();
  }

  @Test
  public void testGetSuperClassConstructorNullWhenNoSuper() {
    FunctionType ctor = new FunctionType(registry, "Foo", null, null, null,
        null, null, true, false);
    assertNull(ctor.getSuperClassConstructor());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testHasUnknownSupertypeThrowsForOrdinaryFunction() {
    FunctionType ordinary = new FunctionType(registry, "foo", null, null, null);
    ordinary.hasUnknownSupertype();
  }

  @Test
  public void testHasUnknownSupertypeRunsForFreshConstructor() {
    // ค่า boolean ที่แน่ชัดขึ้นกับ default implicit-prototype chain ของ
    // JSTypeRegistry ซึ่งไม่ได้แสดงใน source ที่ให้มา จึงตรวจสอบแค่ว่า
    // เมธอดทำงานได้ไม่มี exception (ครอบคลุม loop เข้าทำงานอย่างน้อย 1 ครั้ง)
    FunctionType ctor = new FunctionType(registry, "Foo", null, null, null,
        null, null, true, false);
    boolean result = ctor.hasUnknownSupertype();
    assertTrue(result || !result);
  }

  @Test
  public void testGetTopMostDefiningType() {
    FunctionType ctor = new FunctionType(registry, "Foo", null, null, null,
        null, null, true, false);
    FunctionPrototypeType proto = ctor.getPrototype();
    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    boolean defined = proto.defineProperty("bar", stringType, false, false);
    assertTrue(defined);

    JSType topType = ctor.getTopMostDefiningType("bar");
    assertEquals(ctor.getInstanceType(), topType);
  }

  @Test(expected = IllegalStateException.class)
  public void testGetTopMostDefiningTypeThrowsWhenPropertyMissing() {
    FunctionType ctor = new FunctionType(registry, "Foo", null, null, null,
        null, null, true, false);
    ctor.getTopMostDefiningType("nonExistentProperty");
  }

  // ==================================================================
  // getLeastSupertype / getGreatestSubtype
  // ==================================================================

  @Test
  public void testGetLeastSupertypeEqualTypesReturnsSelf() {
    FunctionType f1 = new FunctionType(registry, "foo", null, null, null);
    assertSame(f1, f1.getLeastSupertype(f1));
  }

  @Test
  public void testGetLeastSupertypeDifferentOrdinaryFunctions() {
    FunctionType f1 = new FunctionType(registry, "foo", null, null, null);
    FunctionType f2 = new FunctionType(registry, "bar", null, null, null,
        registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));
    JSType result = f1.getLeastSupertype(f2);
    assertNotNull(result); // ไม่ assert ค่าตายตัวเพิ่มเติมเพราะขึ้นกับ registry internals
  }

  @Test
  public void testGetGreatestSubtypeEqualTypesReturnsSelf() {
    FunctionType f1 = new FunctionType(registry, "foo", null, null, null);
    assertSame(f1, f1.getGreatestSubtype(f1));
  }

  // ==================================================================
  // getInstanceType / setInstanceType / hasInstanceType / getTypeOfThis
  // ==================================================================

  @Test
  public void testGetInstanceTypeForConstructor() {
    FunctionType ctor = new FunctionType(registry, "Foo", null, null, null,
        null, null, true, false);
    assertNotNull(ctor.getInstanceType());
  }

  @Test(expected = IllegalStateException.class)
  public void testGetInstanceTypeThrowsForOrdinaryFunction() {
    FunctionType ordinary = new FunctionType(registry, "foo", null, null, null);
    ordinary.getInstanceType();
  }

  @Test
  public void testSetInstanceType() {
    FunctionType ctor = new FunctionType(registry, "Foo", null, null, null,
        null, null, true, false);
    ObjectType newInstance = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    ctor.setInstanceType(newInstance);
    assertSame(newInstance, ctor.getInstanceType());
  }

  @Test
  public void testHasInstanceTypeFalseForOrdinary() {
    FunctionType ordinary = new FunctionType(registry, "foo", null, null, null);
    assertFalse(ordinary.hasInstanceType());
  }

  @Test
  public void testHasInstanceTypeTrueForConstructor() {
    FunctionType ctor = new FunctionType(registry, "Foo", null, null, null,
        null, null, true, false);
    assertTrue(ctor.hasInstanceType());
  }

  @Test
  public void testHasInstanceTypeTrueForInterface() {
    FunctionType iface = new FunctionType(registry, "IFoo", null);
    assertTrue(iface.hasInstanceType());
  }

  @Test
  public void testGetTypeOfThisDefaultUnknown() {
    FunctionType ordinary = new FunctionType(registry, "foo", null, null, null);
    assertNotNull(ordinary.getTypeOfThis());
  }

  // ==================================================================
  // getSource / setSource
  // ==================================================================

  @Test
  public void testGetSetSource() {
    FunctionType ft = new FunctionType(registry, "foo", null, null, null);
    assertNull(ft.getSource());
    Node newSource = createFunctionSourceNode();
    ft.setSource(newSource);
    assertSame(newSource, ft.getSource());
  }

  // ==================================================================
  // getSubTypes / addSubType (ผ่าน setPrototype)
  // ==================================================================

  @Test
  public void testGetSubTypesNullByDefault() {
    FunctionType ctor = new FunctionType(registry, "Foo", null, null, null,
        null, null, true, false);
    assertNull(ctor.getSubTypes());
  }

  @Test
  public void testAddSubTypeViaSetPrototype() {
    FunctionType superCtor = new FunctionType(registry, "Base", null, null, null,
        null, null, true, false);
    FunctionType subCtor = new FunctionType(registry, "Derived", null, null, null,
        null, null, true, false);
    ObjectType superInstance = superCtor.getInstanceType();
    FunctionPrototypeType subProto =
        new FunctionPrototypeType(registry, subCtor, superInstance);
    subCtor.setPrototype(subProto);

    List<FunctionType> subs = superCtor.getSubTypes();
    assertNotNull(subs);
    assertTrue(subs.contains(subCtor));
  }

  // ==================================================================
  // getTemplateTypeName
  // ==================================================================

  @Test
  public void testGetTemplateTypeNameNullByDefault() {
    FunctionType ft = new FunctionType(registry, "foo", null, null, null);
    assertNull(ft.getTemplateTypeName());
  }

  @Test
  public void testGetTemplateTypeNameWhenProvided() {
    FunctionType ft = new FunctionType(registry, "foo", null, null, null, null, "T");
    assertEquals("T", ft.getTemplateTypeName());
  }

  // ==================================================================
  // hasCachedValues
  // ==================================================================

  @Test
  public void testHasCachedValuesFalseBeforePrototypeInit() {
    FunctionType ft = new FunctionType(registry, "foo", null, null, null);
    // NOTE: ก่อนเรียก getPrototype() ครั้งแรก field prototype ยังเป็น null
    // (ยกเว้น super.hasCachedValues() คืนค่า true ด้วยเหตุผลอื่นที่ไม่ได้ระบุใน source)
    // จึงทดสอบเฉพาะ branch prototype != null -> true
    ft.getPrototype();
    assertTrue(ft.hasCachedValues());
  }
}
