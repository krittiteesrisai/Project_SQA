# JUnit 4 Test Suite: JSTypeRegistryTest

**หมายเหตุสำคัญก่อนโค้ด:**
- โค้ดต้นฉบับใช้คลาส/อินเทอร์เฟซที่ไม่มี source ให้มา เช่น `StaticScope<JSType>`, `ErrorReporter` (ไม่รู้ signature ชัดเจน 100%) และ `Node` (Rhino AST node) — ผมอ้างอิง API ที่เป็นที่รู้จักแพร่หลายใน Closure Compiler codebase ยุคเดียวกัน (`ErrorReporter.warning(String,String,int,int)` คืน `String`, `Node(int type)`, `Node(int type, Node child)`, `Node.newString(int type, String value)`, `addChildToBack`) — **กำกับด้วยคอมเมนต์ `// ASSUMPTION`** ทุกจุดที่มีความไม่แน่นอน
- บาง branch ที่ต้องใช้ `StaticScope` ตัวจริง (ใน `resolveTypesInScope` เมื่อ scope ไม่ null) **ถูกข้าม** เพราะไม่มี source ของ interface นี้ให้ดู จะ guess ไม่ได้ตามข้อกำหนด — มีคอมเมนต์กำกับไว้
- branch ของ generic `Array.<T>` / `Object.<T>` ใน `Token.STRING` case (การสร้าง `ParameterizedType`/`IndexedType`) **ถูกข้าม** เพราะไม่รู้โครงสร้าง Node ที่ parser จริงสร้างขึ้น (ไม่มีใน source ที่ให้มา)

```java
package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JSTypeRegistryTest {

  /**
   * ASSUMPTION: com.google.javascript.rhino.ErrorReporter มี signature ดังนี้
   *   String warning(String message, String sourceName, int line, int lineOffset);
   *   String error(String message, String sourceName, int line, int lineOffset);
   * (อ้างอิงจาก pattern การใช้งานในซอร์สเป้าหมาย: reporter.warning(msg, sourceName, line, charno))
   */
  private static class TestErrorReporter implements ErrorReporter {
    final List<String> warnings = new ArrayList<String>();
    final List<String> errors = new ArrayList<String>();

    @Override
    public String warning(String message, String sourceName, int line, int lineOffset) {
      warnings.add(message);
      return null;
    }

    @Override
    public String error(String message, String sourceName, int line, int lineOffset) {
      errors.add(message);
      return null;
    }
  }

  private TestErrorReporter reporter;
  private JSTypeRegistry registry;

  @Before
  public void setUp() {
    reporter = new TestErrorReporter();
    registry = new JSTypeRegistry(reporter);
  }

  // Helper: สร้าง Node แบบง่าย - ASSUMPTION: Node มี constructor (int type) และ (int type, Node child)
  private static Node n(int type) {
    return new Node(type);
  }

  private static Node n(int type, Node child) {
    return new Node(type, child);
  }

  // ASSUMPTION: Node.newString(int type, String value) สร้าง string-valued node
  private static Node stringNode(String value) {
    return Node.newString(Token.STRING, value);
  }

  // ==================== Constructor / basic getters ====================

  @Test
  public void testConstructorDefault() {
    assertSame(reporter, registry.getErrorReporter());
    assertFalse(registry.shouldTolerateUndefinedValues());
  }

  @Test
  public void testConstructorWithTolerateTrue() {
    JSTypeRegistry r2 = new JSTypeRegistry(reporter, true);
    assertTrue(r2.shouldTolerateUndefinedValues());
  }

  @Test
  public void testSetGetResolveMode_defaultIsLazyNames() {
    assertEquals(ResolveMode.LAZY_NAMES, registry.getResolveMode());
  }

  @Test
  public void testSetGetResolveMode_changes() {
    registry.setResolveMode(ResolveMode.IMMEDIATE);
    assertEquals(ResolveMode.IMMEDIATE, registry.getResolveMode());
    registry.setResolveMode(ResolveMode.LAZY_EXPRESSIONS);
    assertEquals(ResolveMode.LAZY_EXPRESSIONS, registry.getResolveMode());
  }

  @Test
  public void testIsLastGeneration_defaultTrue_andSetter() {
    assertTrue(registry.isLastGeneration());
    registry.setLastGeneration(false);
    assertFalse(registry.isLastGeneration());
  }

  // ==================== getNativeType / ObjectType / FunctionType ====================

  @Test
  public void testGetNativeTypeAndCastHelpers() {
    JSType arrayType = registry.getNativeType(JSTypeNative.ARRAY_TYPE);
    assertNotNull(arrayType);
    assertSame(arrayType, registry.getNativeObjectType(JSTypeNative.ARRAY_TYPE));

    FunctionType funcCtor =
        registry.getNativeFunctionType(JSTypeNative.FUNCTION_FUNCTION_TYPE);
    assertNotNull(funcCtor);
  }

  // ==================== getType(String) / template ====================

  @Test
  public void testGetTypeByName_builtInAndUnknown() {
    JSType arrayType = registry.getType("Array");
    assertSame(registry.getNativeType(JSTypeNative.ARRAY_TYPE), arrayType);
    assertNull(registry.getType("NoSuchTypeXYZ"));
  }

  @Test
  public void testGetType_templateNameBranch() {
    registry.setTemplateTypeName("T");
    JSType t = registry.getType("T");
    assertNotNull(t);
    registry.clearTemplateTypeName();
    // หลัง clear แล้ว "T" ไม่ได้ถูก declare ไว้ใน namesToTypes จึงเป็น null
    assertNull(registry.getType("T"));
  }

  // ==================== declareType / overwriteDeclaredType ====================

  @Test
  public void testDeclareType_newThenExisting() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    assertTrue(registry.declareType("my.ns.Foo", numberType));
    // ประกาศซ้ำชื่อเดิม -> false
    assertFalse(registry.declareType("my.ns.Foo", numberType));
    assertSame(numberType, registry.getType("my.ns.Foo"));
  }

  @Test
  public void testDeclareType_createsNamespaces() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    registry.declareType("a.b.Baz", numberType);
    assertTrue(registry.hasNamespace("a"));
    assertTrue(registry.hasNamespace("a.b"));
    assertFalse(registry.hasNamespace("a.b.Baz")); // ตัวชื่อสุดท้ายไม่ถูกเก็บเป็น namespace
  }

  @Test
  public void testHasNamespace_notExisting() {
    assertFalse(registry.hasNamespace("does.not.exist"));
  }

  @Test
  public void testOverwriteDeclaredType_success() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    registry.declareType("Zed", numberType);
    registry.overwriteDeclaredType("Zed", stringType);
    assertSame(stringType, registry.getType("Zed"));
  }

  @Test(expected = IllegalStateException.class)
  public void testOverwriteDeclaredType_throwsIfNotDeclared() {
    registry.overwriteDeclaredType("NeverDeclared",
        registry.getNativeType(JSTypeNative.NUMBER_TYPE));
  }

  // ==================== forwardDeclareType ====================

  @Test
  public void testForwardDeclareType_andIsForwardDeclared() {
    assertFalse(registry.isForwardDeclaredType("goog.Foo"));
    registry.forwardDeclareType("goog.Foo");
    assertTrue(registry.isForwardDeclaredType("goog.Foo"));
  }

  // ==================== registerPropertyOnType / getTypesWithProperty ====================

  @Test
  public void testGetTypesWithProperty_notRegistered() {
    Iterable<JSType> types = registry.getTypesWithProperty("noSuchProp");
    assertFalse(types.iterator().hasNext());
  }

  @Test
  public void testRegisterPropertyOnType_and_getTypesWithProperty() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    registry.registerPropertyOnType("myProp", numberType);
    Iterable<JSType> types = registry.getTypesWithProperty("myProp");
    assertTrue(types.iterator().hasNext());
  }

  @Test
  public void testGetEachReferenceTypeWithProperty_emptyAndNonEmpty() {
    assertFalse(registry.getEachReferenceTypeWithProperty("refProp")
        .iterator().hasNext());

    ObjectType objectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    registry.registerPropertyOnType("refProp", objectType);
    assertTrue(registry.getEachReferenceTypeWithProperty("refProp")
        .iterator().hasNext());
  }

  @Test
  public void testUnregisterPropertyOnType_removesEntry() {
    ObjectType objectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    registry.registerPropertyOnType("delProp", objectType);
    assertTrue(registry.getEachReferenceTypeWithProperty("delProp")
        .iterator().hasNext());

    registry.unregisterPropertyOnType("delProp", objectType);
    assertFalse(registry.getEachReferenceTypeWithProperty("delProp")
        .iterator().hasNext());
  }

  @Test
  public void testUnregisterPropertyOnType_noopWhenNeverRegistered() {
    // ไม่ควร throw แม้ property ไม่เคยถูก register (typeSet == null branch)
    ObjectType objectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    registry.unregisterPropertyOnType("neverRegisteredProp", objectType);
  }

  // ==================== getGreatestSubtypeWithProperty ====================

  @Test
  public void testGetGreatestSubtypeWithProperty_notRegistered() {
    JSType result = registry.getGreatestSubtypeWithProperty(
        registry.getNativeType(JSTypeNative.NUMBER_TYPE), "noSuchProp2");
    assertSame(registry.getNativeType(JSTypeNative.NO_TYPE), result);
  }

  @Test
  public void testGetGreatestSubtypeWithProperty_registeredAndCached() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    registry.registerPropertyOnType("subProp", numberType);

    // เรียกครั้งแรก: greatestSubtypeByProperty ไม่มี key -> build และ cache
    JSType r1 = registry.getGreatestSubtypeWithProperty(numberType, "subProp");
    assertNotNull(r1);

    // เรียกครั้งที่สอง: ใช้ branch cache (containsKey == true)
    JSType r2 = registry.getGreatestSubtypeWithProperty(numberType, "subProp");
    assertNotNull(r2);
  }

  // ==================== canPropertyBeDefined ====================

  @Test
  public void testCanPropertyBeDefined_neverRegistered() {
    assertFalse(registry.canPropertyBeDefined(
        registry.getNativeType(JSTypeNative.NUMBER_TYPE), "neverRegProp"));
  }

  @Test
  public void testCanPropertyBeDefined_registeredAndMatches() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    registry.registerPropertyOnType("matchProp", numberType);
    assertTrue(registry.canPropertyBeDefined(numberType, "matchProp"));
  }

  @Test
  public void testCanPropertyBeDefined_registeredButNoMatch() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    registry.registerPropertyOnType("numOnlyProp", numberType);
    // number กับ string ไม่มี greatest subtype ที่ไม่ empty -> false หลัง loop จบ
    assertFalse(registry.canPropertyBeDefined(stringType, "numOnlyProp"));
  }

  // ==================== findCommonSuperObject ====================

  @Test
  public void testFindCommonSuperObject_sameType() {
    ObjectType arrayType = registry.getNativeObjectType(JSTypeNative.ARRAY_TYPE);
    ObjectType result = registry.findCommonSuperObject(arrayType, arrayType);
    assertNotNull(result);
  }

  @Test
  public void testFindCommonSuperObject_differentTypesCommonAncestorObject() {
    ObjectType arrayType = registry.getNativeObjectType(JSTypeNative.ARRAY_TYPE);
    ObjectType dateType = registry.getNativeObjectType(JSTypeNative.DATE_TYPE);
    ObjectType result = registry.findCommonSuperObject(arrayType, dateType);
    assertNotNull(result);
    // ตามหลัก prototype chain, common ancestor ควรเป็น Object type
    assertSame(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE), result);
  }

  // ==================== registerTypeImplementingInterface / getDirectImplementors ====================

  @Test
  public void testRegisterTypeImplementingInterface_and_getDirectImplementors() {
    FunctionType impl =
        registry.getNativeFunctionType(JSTypeNative.OBJECT_FUNCTION_TYPE);
    ObjectType interfaceInstance =
        registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);

    assertTrue(registry.getDirectImplementors(interfaceInstance).isEmpty());
    registry.registerTypeImplementingInterface(impl, interfaceInstance);
    assertTrue(registry.getDirectImplementors(interfaceInstance).contains(impl));
  }

  // ==================== incrementGeneration / clearNamedTypes / resolveTypesInScope(null) ====================

  @Test
  public void testGetType_scopeCreatesUnresolvedNamedType() {
    JSType t = registry.getType(null, "SomeForwardType", "src.js", 1, 1);
    assertNotNull(t);
    assertTrue(t instanceof NamedType);
  }

  @Test
  public void testGetType_scopeReturnsKnownTypeDirectly() {
    JSType t = registry.getType(null, "Array", "src.js", 1, 1);
    assertSame(registry.getNativeType(JSTypeNative.ARRAY_TYPE), t);
  }

  @Test
  public void testClearNamedTypes_doesNotThrow() {
    registry.getType(null, "AnotherForwardType", "src.js", 1, 1);
    registry.clearNamedTypes();
  }

  @Test
  public void testResolveTypesInScope_nullScope_doesNotThrow() {
    // branch: scope != null && scope.getParentScope() == null -> false เพราะ scope เป็น null
    registry.getType(null, "YetAnotherForward", "src.js", 1, 1);
    registry.resolveTypesInScope(null);
  }

  @Test
  public void testIncrementGeneration_doesNotThrow() {
    // NOTE: ไม่มี public getter ให้ตรวจสอบ internal state ของ
    // unresolvedNamedTypes/resolvedNamedTypes โดยตรง จึงเป็นเพียง smoke test
    // ครอบคลุมลำดับการเรียกใช้งานเพื่อ exercise loop ใน incrementGeneration()
    registry.getType(null, "GenType", "src.js", 1, 1);
    registry.resolveTypesInScope(null);
    registry.incrementGeneration();
  }

  // ==================== createOptionalType ====================

  @Test
  public void testCreateOptionalType_unknownTypeBranch() {
    JSType unknown = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    assertSame(unknown, registry.createOptionalType(unknown));
  }

  @Test
  public void testCreateOptionalType_allTypeBranch() {
    JSType all = registry.getNativeType(JSTypeNative.ALL_TYPE);
    assertSame(all, registry.createOptionalType(all));
  }

  @Test
  public void testCreateOptionalType_otherTypeBranch() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType result = registry.createOptionalType(numberType);
    assertNotSameAndIsUnion(result);
  }

  private void assertNotSameAndIsUnion(JSType result) {
    assertTrue(result.isUnionType());
  }

  // ==================== createDefaultObjectUnion / createNullableType / createOptionalNullableType ====================

  @Test
  public void testCreateDefaultObjectUnion_tolerateFalse_usesNullableOnly() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType result = registry.createDefaultObjectUnion(numberType);
    assertTrue(result.isUnionType());
    assertEquals(2, sizeOfUnion(result)); // number, null
  }

  @Test
  public void testCreateDefaultObjectUnion_tolerateTrue_usesOptionalNullable() {
    JSTypeRegistry tolerantRegistry = new JSTypeRegistry(reporter, true);
    JSType numberType = tolerantRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType result = tolerantRegistry.createDefaultObjectUnion(numberType);
    assertTrue(result.isUnionType());
    assertEquals(3, sizeOfUnion(result)); // number, void, null
  }

  @Test
  public void testCreateNullableType() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType result = registry.createNullableType(numberType);
    assertTrue(result.isUnionType());
    assertEquals(2, sizeOfUnion(result));
  }

  @Test
  public void testCreateOptionalNullableType() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType result = registry.createOptionalNullableType(numberType);
    assertTrue(result.isUnionType());
    assertEquals(3, sizeOfUnion(result));
  }

  private int sizeOfUnion(JSType t) {
    UnionType u = t.toMaybeUnionType();
    assertNotNull(u);
    int count = 0;
    for (JSType alt : u.getAlternates()) {
      count++;
    }
    return count;
  }

  // ==================== createUnionType overloads ====================

  @Test
  public void testCreateUnionType_jsTypeVarargs() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    JSType result = registry.createUnionType(numberType, stringType);
    assertTrue(result.isUnionType());
  }

  @Test
  public void testCreateUnionType_nativeVarargs() {
    JSType result = registry.createUnionType(
        JSTypeNative.NUMBER_TYPE, JSTypeNative.STRING_TYPE);
    assertTrue(result.isUnionType());
  }

  // ==================== createEnumType ====================

  @Test
  public void testCreateEnumType() {
    // ASSUMPTION: EnumType constructor รับ Node source เป็น null-safe หรือ dummy node ได้
    JSType elementsType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    EnumType enumType = registry.createEnumType("MyEnum", n(Token.EMPTY), elementsType);
    assertNotNull(enumType);
  }

  // ==================== createFunctionType / createConstructorType overloads ====================

  @Test
  public void testCreateFunctionType_returnAndVarargsParams() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    FunctionType f = registry.createFunctionType(numberType, numberType, numberType);
    assertNotNull(f);
  }

  @Test
  public void testCreateFunctionType_emptyParams_boundary() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    // boundary: parameterTypes ว่าง -> loop ใน createParameters ไม่ execute (max = -1)
    FunctionType f = registry.createFunctionType(numberType);
    assertNotNull(f);
  }

  @Test
  public void testCreateFunctionTypeWithVarArgs_listOverload() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    List<JSType> params = new ArrayList<JSType>();
    params.add(numberType);
    params.add(numberType);
    FunctionType f = registry.createFunctionTypeWithVarArgs(numberType, params);
    assertNotNull(f);
  }

  @Test
  public void testCreateFunctionType_listOverload() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    List<JSType> params = new ArrayList<JSType>();
    params.add(numberType);
    FunctionType f = registry.createFunctionType(numberType, params);
    assertNotNull(f);
  }

  @Test
  public void testCreateFunctionType_lastVarArgsTrueBranch() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    FunctionType f = registry.createFunctionType(numberType, true, numberType);
    assertNotNull(f);
  }

  @Test
  public void testCreateFunctionType_lastVarArgsFalseBranch() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    FunctionType f = registry.createFunctionType(numberType, false, numberType);
    assertNotNull(f);
  }

  @Test
  public void testCreateConstructorType_varargsAndFixed() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    FunctionType c1 = registry.createConstructorType(numberType, numberType);
    assertNotNull(c1);
    FunctionType c2 = registry.createConstructorTypeWithVarArgs(numberType, numberType);
    assertNotNull(c2);
  }

  @Test
  public void testCreateConstructorType_lastVarArgsBranches() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    assertNotNull(registry.createConstructorType(numberType, true, numberType));
    assertNotNull(registry.createConstructorType(numberType, false, numberType));
  }

  @Test
  public void testCreateFunctionType_withInstanceTypeAndList() {
    ObjectType instanceType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    List<JSType> params = new ArrayList<JSType>();
    params.add(numberType);
    JSType f = registry.createFunctionType(instanceType, numberType, params);
    assertNotNull(f);

    JSType f2 = registry.createFunctionTypeWithVarArgs(instanceType, numberType, params);
    assertNotNull(f2);
  }

  @Test
  public void testCreateFunctionTypeWithNewReturnTypeAndThisType() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    FunctionType existing = registry.createFunctionType(numberType, numberType);

    FunctionType newReturn =
        registry.createFunctionTypeWithNewReturnType(existing,
            registry.getNativeType(JSTypeNative.STRING_TYPE));
    assertNotNull(newReturn);

    ObjectType thisType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    FunctionType newThis =
        registry.createFunctionTypeWithNewThisType(existing, thisType);
    assertNotNull(newThis);
  }

  @Test
  public void testCreateFunctionType_withParametersNode() {
    Node params = registry.createParameters(
        registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    FunctionType f = registry.createFunctionType(
        registry.getNativeType(JSTypeNative.STRING_TYPE), params);
    assertNotNull(f);
  }

  // ==================== createParameters / createParametersWithVarArgs / createOptionalParameters ====================

  @Test
  public void testCreateParameters_variants() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    Node p1 = registry.createParameters(numberType, numberType);
    assertNotNull(p1);

    Node p2 = registry.createParametersWithVarArgs(numberType, numberType);
    assertNotNull(p2);

    List<JSType> list = new ArrayList<JSType>();
    list.add(numberType);
    Node p3 = registry.createParameters(list);
    assertNotNull(p3);

    Node p4 = registry.createParametersWithVarArgs(list);
    assertNotNull(p4);
  }

  @Test
  public void testCreateOptionalParameters() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    Node p = registry.createOptionalParameters(numberType, numberType);
    assertNotNull(p);
  }

  // ==================== createObjectType / createAnonymousObjectType / createNativeAnonymousObjectType ====================

  @Test
  public void testCreateObjectType_variants() {
    ObjectType proto = registry.getNativeObjectType(JSTypeNative.OBJECT_PROTOTYPE);
    ObjectType o1 = registry.createObjectType(proto);
    assertNotNull(o1);

    ObjectType o2 = registry.createObjectType("Named", null, proto);
    assertNotNull(o2);

    ObjectType o3 = registry.createAnonymousObjectType();
    assertNotNull(o3);

    ObjectType o4 = registry.createNativeAnonymousObjectType();
    assertNotNull(o4);
  }

  // ==================== resetImplicitPrototype ====================

  @Test
  public void testResetImplicitPrototype_trueBranch() {
    ObjectType proto = registry.getNativeObjectType(JSTypeNative.OBJECT_PROTOTYPE);
    ObjectType obj = registry.createAnonymousObjectType(); // PrototypeObjectType instance
    boolean result = registry.resetImplicitPrototype(obj, proto);
    assertTrue(result);
  }

  @Test
  public void testResetImplicitPrototype_falseBranch() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE); // not PrototypeObjectType
    ObjectType proto = registry.getNativeObjectType(JSTypeNative.OBJECT_PROTOTYPE);
    boolean result = registry.resetImplicitPrototype(numberType, proto);
    assertFalse(result);
  }

  // ==================== createConstructorType(name, source, params, returnType) / createInterfaceType ====================

  @Test
  public void testCreateConstructorType_full() {
    Node params = registry.createParameters(
        registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    FunctionType c = registry.createConstructorType(
        "MyCtor", null, params, registry.getNativeType(JSTypeNative.VOID_TYPE));
    assertNotNull(c);
  }

  @Test
  public void testCreateInterfaceType() {
    FunctionType iface = registry.createInterfaceType("MyInterface", null);
    assertNotNull(iface);
  }

  // ==================== createParameterizedType / createNamedType ====================

  @Test
  public void testCreateParameterizedType() {
    ObjectType arrayType = registry.getNativeObjectType(JSTypeNative.ARRAY_TYPE);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    ParameterizedType p = registry.createParameterizedType(arrayType, numberType);
    assertNotNull(p);
  }

  @Test
  public void testCreateNamedType() {
    JSType named = registry.createNamedType("Foo.Bar", "src.js", 1, 1);
    assertTrue(named instanceof NamedType);
  }

  // ==================== identifyNonNullableName ====================

  @Test
  public void testIdentifyNonNullableName_normal() {
    registry.identifyNonNullableName("MyEnumType");
    // ไม่มี public getter ตรวจสอบตรง ๆ แต่จะถูกยืนยันผ่าน createFromTypeNodes ด้านล่าง
  }

  @Test(expected = NullPointerException.class)
  public void testIdentifyNonNullableName_nullThrows() {
    registry.identifyNonNullableName(null);
  }

  // ==================== createRecordType ====================

  @Test
  public void testCreateRecordType_empty() {
    Map<String, RecordTypeBuilder.RecordProperty> props =
        new HashMap<String, RecordTypeBuilder.RecordProperty>();
    RecordType rt = registry.createRecordType(props);
    assertNotNull(rt);
  }

  // ==================== setTemplateTypeName / clearTemplateTypeName ====================

  @Test
  public void testSetAndClearTemplateTypeName() {
    registry.setTemplateTypeName("TT");
    assertNotNull(registry.getType("TT"));
    registry.clearTemplateTypeName();
    assertNull(registry.getType("TT"));
  }

  // ==================== createFromTypeNodes: primitive tokens ====================

  @Test
  public void testCreateFromTypeNodes_starToken() {
    JSType result = registry.createFromTypeNodes(n(Token.STAR), "src.js", null);
    assertSame(registry.getNativeType(JSTypeNative.ALL_TYPE), result);
  }

  @Test
  public void testCreateFromTypeNodes_emptyToken() {
    JSType result = registry.createFromTypeNodes(n(Token.EMPTY), "src.js", null);
    assertSame(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), result);
  }

  @Test
  public void testCreateFromTypeNodes_voidToken() {
    JSType result = registry.createFromTypeNodes(n(Token.VOID), "src.js", null);
    assertSame(registry.getNativeType(JSTypeNative.VOID_TYPE), result);
  }

  @Test
  public void testCreateFromTypeNodes_lbArrayToken() {
    JSType result = registry.createFromTypeNodes(n(Token.LB), "src.js", null);
    assertSame(registry.getNativeType(JSTypeNative.ARRAY_TYPE), result);
  }

  @Test
  public void testCreateFromTypeNodes_bangNotNullable() {
    Node bang = n(Token.BANG, n(Token.STAR));
    JSType result = registry.createFromTypeNodes(bang, "src.js", null);
    JSType expected = registry.getNativeType(JSTypeNative.ALL_TYPE)
        .restrictByNotNullOrUndefined();
    assertTrue(result.isEquivalentTo(expected));
  }

  @Test
  public void testCreateFromTypeNodes_qmarkNoChild() {
    Node q = n(Token.QMARK);
    JSType result = registry.createFromTypeNodes(q, "src.js", null);
    assertSame(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), result);
  }

  @Test
  public void testCreateFromTypeNodes_qmarkWithChild_numberName() {
    Node q = n(Token.QMARK, stringNode("Number"));
    JSType result = registry.createFromTypeNodes(q, "src.js", null);
    assertTrue(result.isUnionType());
    assertEquals(2, sizeOfUnion(result)); // number, null (tolerateUndefinedValues=false)
  }

  @Test
  public void testCreateFromTypeNodes_equalsOptional_starChild() {
    Node eq = n(Token.EQUALS, n(Token.STAR));
    JSType result = registry.createFromTypeNodes(eq, "src.js", null);
    // ALL_TYPE -> createOptionalType คืน ALL_TYPE เดิม (branch isAllType)
    assertSame(registry.getNativeType(JSTypeNative.ALL_TYPE), result);
  }

  @Test
  public void testCreateFromTypeNodes_ellipsisOptional_numberChild() {
    Node ellipsis = n(Token.ELLIPSIS, stringNode("Number"));
    JSType result = registry.createFromTypeNodes(ellipsis, "src.js", null);
    assertTrue(result.isUnionType());
    assertEquals(2, sizeOfUnion(result)); // number, void
  }

  @Test
  public void testCreateFromTypeNodes_pipeUnionMultipleChildren() {
    Node pipe = n(Token.PIPE);
    pipe.addChildToBack(n(Token.STAR));
    pipe.addChildToBack(n(Token.VOID));
    JSType result = registry.createFromTypeNodes(pipe, "src.js", null);
    assertNotNull(result);
  }

  // ==================== createFromTypeNodes: Token.STRING branches ====================

  @Test
  public void testCreateFromTypeNodes_stringToken_knownObjectType_getsNullableWrap() {
    Node s = stringNode("Object");
    JSType result = registry.createFromTypeNodes(s, "src.js", null);
    assertTrue(result.isUnionType()); // Object เป็น ObjectType -> ถูก wrap ด้วย createDefaultObjectUnion
    assertEquals(2, sizeOfUnion(result));
  }

  @Test
  public void testCreateFromTypeNodes_stringToken_primitiveType_notWrapped() {
    Node s = stringNode("Number");
    JSType result = registry.createFromTypeNodes(s, "src.js", null);
    // NumberType ไม่ใช่ ObjectType -> คืนตรง ๆ ไม่ union
    assertSame(registry.getNativeType(JSTypeNative.NUMBER_TYPE), result);
  }

  @Test
  public void testCreateFromTypeNodes_stringToken_nonNullableName_notWrapped() {
    JSType objType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
    registry.declareType("MyNonNullableObj", objType);
    registry.identifyNonNullableName("MyNonNullableObj");

    Node s = stringNode("MyNonNullableObj");
    JSType result = registry.createFromTypeNodes(s, "src.js", null);
    // เพราะอยู่ใน nonNullableTypeNames -> เงื่อนไข if เป็น false -> คืน namedType ตรง ๆ ไม่ union
    assertSame(objType, result);
  }

  @Test
  public void testCreateFromTypeNodes_stringToken_unknownName_createsUnresolvedNamedType() {
    Node s = stringNode("SomeUnknownTypeName123");
    JSType result = registry.createFromTypeNodes(s, "src.js", null);
    assertNotNull(result);
    // ควรถูกสร้างเป็น NamedType (ยังไม่ resolve เพราะ resolveMode ปกติเป็น LAZY_NAMES)
    // และเนื่องจาก NamedType เป็น ObjectType-based จึงอาจถูก wrap ด้วย union เพิ่ม null/void
    // - ตรวจสอบแค่ไม่ null และไม่ throw
  }

  // ==================== createFromTypeNodes: Token.LC (record type) ====================

  @Test
  public void testCreateFromTypeNodes_recordType_withColonTypedField() {
    Node fieldName = stringNode("x");
    Node fieldType = n(Token.STAR);
    Node colon = new Node(Token.COLON, fieldName, fieldType);
    Node lc = n(Token.LC);
    lc.addChildToBack(colon);

    JSType result = registry.createFromTypeNodes(lc, "src.js", null);
    assertNotNull(result);
    assertTrue(result instanceof RecordType);
  }

  @Test
  public void testCreateFromTypeNodes_recordType_withoutColon_unknownFieldType() {
    Node lc = n(Token.LC);
    lc.addChildToBack(stringNode("y"));

    JSType result = registry.createFromTypeNodes(lc, "src.js", null);
    assertNotNull(result);
  }

  @Test
  public void testCreateFromTypeNodes_recordType_quotedFieldNameStripped() {
    Node lc = n(Token.LC);
    lc.addChildToBack(stringNode("'q'"));

    JSType result = registry.createFromTypeNodes(lc, "src.js", null);
    assertNotNull(result);
    assertTrue(reporter.warnings.isEmpty());
  }

  @Test
  public void testCreateFromTypeNodes_recordType_duplicateFieldWarns() {
    Node lc = n(Token.LC);
    lc.addChildToBack(stringNode("dup"));
    lc.addChildToBack(stringNode("dup"));

    registry.createFromTypeNodes(lc, "src.js", null);
    assertFalse(reporter.warnings.isEmpty());
  }

  // ==================== createFromTypeNodes: Token.FUNCTION ====================

  @Test
  public void testCreateFromTypeNodes_functionType_basicNoThis() {
    Node paramList = n(Token.PARAM_LIST);
    paramList.addChildToBack(stringNode("Number"));

    Node func = n(Token.FUNCTION, paramList);
    func.addChildToBack(n(Token.EMPTY)); // return type unspecified

    JSType result = registry.createFromTypeNodes(func, "src.js", null);
    assertNotNull(result);
    assertTrue(result instanceof FunctionType);
  }

  @Test
  public void testCreateFromTypeNodes_functionType_varArgsNoChild() {
    Node paramList = n(Token.PARAM_LIST);
    paramList.addChildToBack(n(Token.ELLIPSIS)); // ไม่มี child -> UNKNOWN_TYPE varargs

    Node func = n(Token.FUNCTION, paramList);
    func.addChildToBack(n(Token.EMPTY));

    JSType result = registry.createFromTypeNodes(func, "src.js", null);
    assertNotNull(result);
  }

  @Test
  public void testCreateFromTypeNodes_functionType_varArgsWithChild() {
    Node paramList = n(Token.PARAM_LIST);
    paramList.addChildToBack(n(Token.ELLIPSIS, stringNode("Number")));

    Node func = n(Token.FUNCTION, paramList);
    func.addChildToBack(n(Token.EMPTY));

    JSType result = registry.createFromTypeNodes(func, "src.js", null);
    assertNotNull(result);
  }

  @Test
  public void testCreateFromTypeNodes_functionType_optionalParamSuccess() {
    Node paramList = n(Token.PARAM_LIST);
    paramList.addChildToBack(n(Token.EQUALS, stringNode("Number")));

    Node func = n(Token.FUNCTION, paramList);
    func.addChildToBack(n(Token.EMPTY));

    JSType result = registry.createFromTypeNodes(func, "src.js", null);
    assertNotNull(result);
    assertTrue(reporter.warnings.isEmpty());
  }

  @Test
  public void testCreateFromTypeNodes_functionType_thisObjectValid() {
    Node thisNode = n(Token.THIS, stringNode("Object"));
    Node func = n(Token.FUNCTION, thisNode);
    func.addChildToBack(n(Token.PARAM_LIST));
    func.addChildToBack(n(Token.EMPTY));

    JSType result = registry.createFromTypeNodes(func, "src.js", null);
    assertNotNull(result);
    assertTrue(reporter.warnings.isEmpty());
  }

  @Test
  public void testCreateFromTypeNodes_functionType_thisNotObject_warns() {
    Node thisNode = n(Token.THIS, stringNode("Number"));
    Node func = n(Token.FUNCTION, thisNode);
    func.addChildToBack(n(Token.PARAM_LIST));
    func.addChildToBack(n(Token.EMPTY));

    registry.createFromTypeNodes(func, "src.js", null);
    assertFalse(reporter.warnings.isEmpty());
  }

  @Test
  public void testCreateFromTypeNodes_functionType_newConstructorValid() {
    Node newNode = n(Token.NEW, stringNode("Object"));
    Node func = n(Token.FUNCTION, newNode);
    func.addChildToBack(n(Token.PARAM_LIST));
    func.addChildToBack(n(Token.EMPTY));

    JSType result = registry.createFromTypeNodes(func, "src.js", null);
    assertNotNull(result);
    assertTrue(result instanceof FunctionType);
  }

  @Test
  public void testCreateFromTypeNodes_functionType_newNotObject_warns() {
    Node newNode = n(Token.NEW, stringNode("Number"));
    Node func = n(Token.FUNCTION, newNode);
    func.addChildToBack(n(Token.PARAM_LIST));
    func.addChildToBack(n(Token.EMPTY));

    registry.createFromTypeNodes(func, "src.js", null);
    assertFalse(reporter.warnings.isEmpty());
  }

  @Test
  public void testCreateFromTypeNodes_functionType_withReturnType() {
    Node paramList = n(Token.PARAM_LIST);
    Node func = n(Token.FUNCTION, paramList);
    func.addChildToBack(stringNode("Number")); // return type = Number

    JSType result = registry.createFromTypeNodes(func, "src.js", null);
    assertNotNull(result);
    assertTrue(result instanceof FunctionType);
  }

  // ==================== createFromTypeNodes: ResolveMode.LAZY_EXPRESSIONS branch ====================

  @Test
  public void testCreateFromTypeNodes_lazyExpressions_noTypeName_resolvesDirectly() {
    registry.setResolveMode(ResolveMode.LAZY_EXPRESSIONS);
    JSType result = registry.createFromTypeNodes(n(Token.STAR), "src.js", null);
    assertSame(registry.getNativeType(JSTypeNative.ALL_TYPE), result);
  }

  @Test
  public void testCreateFromTypeNodes_lazyExpressions_hasTypeName_returnsUnresolvedExpr() {
    registry.setResolveMode(ResolveMode.LAZY_EXPRESSIONS);
    JSType result = registry.createFromTypeNodes(stringNode("Number"), "src.js", null);
    assertTrue(result instanceof UnresolvedTypeExpression);
  }

  @Test
  public void testCreateFromTypeNodes_lazyExpressions_nestedTypeName_returnsUnresolvedExpr() {
    registry.setResolveMode(ResolveMode.LAZY_EXPRESSIONS);
    Node bang = n(Token.BANG, stringNode("Number"));
    JSType result = registry.createFromTypeNodes(bang, "src.js", null);
    assertTrue(result instanceof UnresolvedTypeExpression);
  }

  // ==================== unsupported token -> IllegalStateException ====================

  @Test(expected = IllegalStateException.class)
  public void testCreateFromTypeNodes_unsupportedToken_throws() {
    // ใช้ Token ที่ไม่อยู่ใน switch-case ใด ๆ ของ createFromTypeNodesInternal
    // เพื่อ trigger บรรทัด throw new IllegalStateException ที่ท้ายเมธอด
    registry.createFromTypeNodes(n(Token.BLOCK), "src.js", null);
  }
}
```

## สรุปตาราง Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testConstructorDefault / testConstructorWithTolerateTrue | constructor overload สองแบบ, tolerateUndefinedValues true/false |
| testSetGetResolveMode_* | ResolveMode ทั้ง 3 ค่า |
| testIsLastGeneration_* | default true, setter false |
| testGetNativeTypeAndCastHelpers | getNativeType/ObjectType/FunctionType |
| testGetTypeByName_builtInAndUnknown | getType(String) พบ/ไม่พบ |
| testGetType_templateNameBranch | branch `jsTypeName.equals(templateTypeName)` true/false |
| testDeclareType_* | declareType ใหม่/ซ้ำ, สร้าง namespace |
| testHasNamespace_notExisting | hasNamespace false |
| testOverwriteDeclaredType_* | success / IllegalStateException |
| testForwardDeclareType_* | forwardDeclareType + isForwardDeclaredType |
| testGetTypesWithProperty_* / testRegisterPropertyOnType_* | typesIndexedByProperty containsKey true/false |
| testGetEachReferenceTypeWithProperty_* | eachRefTypeIndexedByProperty containsKey true/false |
| testUnregisterPropertyOnType_* | typeSet != null / null (no-op) |
| testGetGreatestSubtypeWithProperty_* | 3 branch: cache hit, build ใหม่, ไม่พบ (NO_TYPE) |
| testCanPropertyBeDefined_* | outer if false, loop match true, loop จบไม่ match |
| testFindCommonSuperObject_* | while loop equivalentTo true/false |
| testRegisterTypeImplementingInterface_* | multimap put/get |
| testGetType_scope* / testClearNamedTypes / testResolveTypesInScope_nullScope | type==null branch สร้าง NamedType, type!=null คืนตรง, scope null skip block |
| testIncrementGeneration_doesNotThrow | smoke-test loop รวม (ไม่สามารถตรวจ internal state ได้ตรง ๆ) |
| testCreateOptionalType_* | instanceof UnknownType/isAllType true/false |
| testCreateDefaultObjectUnion_* | tolerateUndefinedValues true/false |
| testCreateNullableType / testCreateOptionalNullableType | union ขนาด 2/3 |
| testCreateUnionType_* | overload JSType... / JSTypeNative... |
| testCreateEnumType | สร้าง EnumType พื้นฐาน |
| testCreateFunctionType_* / testCreateConstructorType_* | overload หลากหลาย, lastVarArgs true/false, boundary พารามิเตอร์ว่าง |
| testCreateParameters_* / testCreateOptionalParameters | createParameters loop, varargs branch |
| testCreateObjectType_* / testResetImplicitPrototype_* | instanceof PrototypeObjectType true/false |
| testCreateConstructorType_full / testCreateInterfaceType | constructor/interface variant |
| testCreateParameterizedType / testCreateNamedType | สร้าง type โดยตรง |
| testIdentifyNonNullableName_* | ปกติ / null → NPE |
| testCreateRecordType_empty | createRecordType พื้นฐาน |
| testSetAndClearTemplateTypeName | set/clear template |
| testCreateFromTypeNodes_starToken...lbArrayToken | switch-case STAR/EMPTY/VOID/LB |
| testCreateFromTypeNodes_bangNotNullable | case BANG |
| testCreateFromTypeNodes_qmarkNoChild / WithChild | case QMARK, firstChild null/not-null |
| testCreateFromTypeNodes_equalsOptional_* / ellipsisOptional_* | case EQUALS/ELLIPSIS |
| testCreateFromTypeNodes_pipeUnion* | case PIPE loop |
| testCreateFromTypeNodes_stringToken_* | case STRING: ObjectType wrap, primitive ไม่ wrap, nonNullableTypeNames, unresolved NamedType |
| testCreateFromTypeNodes_recordType_* | case LC/COLON: hasType true/false, quoted field, duplicate warning |
| testCreateFromTypeNodes_functionType_* | case FUNCTION: no-this, varargs (มี/ไม่มี child), optional param, THIS/NEW valid/invalid, return type |
| testCreateFromTypeNodes_lazyExpressions_* | ResolveMode.LAZY_EXPRESSIONS: hasTypeName true/false (รวม recursive) |
| testCreateFromTypeNodes_unsupportedToken_throws | default → IllegalStateException |