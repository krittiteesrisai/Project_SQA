package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.JSTypeExpression;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionBuilder;
import com.google.javascript.rhino.jstype.FunctionParamBuilder;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.List;

/**
 * Unit test สำหรับ {@link FunctionTypeBuilder} (Defects4J Closure-144b)
 *
 * หมายเหตุ: ใช้ reflection เข้าถึง private field ของ FunctionTypeBuilder โดยตรง
 * เพื่อยืนยัน state ภายใน โดยไม่ต้องพึ่งพา public API ของ FunctionType/ObjectType
 * ที่ไม่ได้ปรากฏในซอร์สโค้ดเป้าหมาย
 */
public class FunctionTypeBuilderTest {

  private Compiler compiler;
  private JSTypeRegistry registry;
  private Node errorRoot;
  private Scope globalScope;

  @Before
  public void setUp() {
    compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    registry = compiler.getTypeRegistry();
    errorRoot = new Node(Token.SCRIPT);
    // หมายเหตุ: สมมติว่า Scope มี constructor แบบ (Node rootNode, AbstractCompiler compiler)
    // สำหรับสร้าง "global scope" (parent == null) ซึ่ง scope.isGlobal() ที่ใช้ในซอร์สเป้าหมาย
    // อ้างอิงพฤติกรรมนี้ - ไม่ได้ยืนยัน signature 100% จากซอร์สที่ให้มา
    globalScope = new Scope(errorRoot, compiler);
  }

  // ---------------- Helpers ----------------

  private FunctionTypeBuilder newBuilder(String fnName) {
    return new FunctionTypeBuilder(fnName, compiler, errorRoot, "test.js", globalScope);
  }

  @SuppressWarnings("unchecked")
  private <T> T field(FunctionTypeBuilder b, String name) {
    try {
      Field f = FunctionTypeBuilder.class.getDeclaredField(name);
      f.setAccessible(true);
      return (T) f.get(b);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * หมายเหตุ: สมมติโครงสร้าง type-node ตามรูปแบบที่ JsDocInfoParser ใช้แทนชื่อ type
   * แบบง่าย (Token.STRING) - ไม่ได้ยืนยันจากซอร์สที่ให้มาโดยตรง
   */
  private JSTypeExpression namedType(String typeName) {
    return new JSTypeExpression(Node.newString(Token.STRING, typeName), "test.js");
  }

  /**
   * หมายเหตุ (ความเสี่ยงสูง / ไม่ยืนยันจากซอร์ส): สมมติว่า root node ชนิด Token.EQUALS
   * แทนความหมาย optional parameter ("{number=}") ตามรูปแบบ encoding ของ JsDocInfoParser
   */
  private JSTypeExpression optionalType(String typeName) {
    Node eq = new Node(Token.EQUALS, Node.newString(Token.STRING, typeName));
    return new JSTypeExpression(eq, "test.js");
  }

  // ================= Constructor =================

  @Test(expected = NullPointerException.class)
  public void testConstructor_nullErrorRoot_throwsNpe() {
    // Preconditions.checkNotNull(errorRoot) -> ต้อง throw NPE
    new FunctionTypeBuilder("foo", compiler, null, "test.js", globalScope);
  }

  @Test
  public void testConstructor_nullFnName_defaultsToEmptyString() {
    FunctionTypeBuilder b = new FunctionTypeBuilder(
        null, compiler, errorRoot, "test.js", globalScope);
    assertEquals("", field(b, "fnName"));
  }

  @Test
  public void testConstructor_nonNullFnName_isPreserved() {
    FunctionTypeBuilder b = newBuilder("myFunc");
    assertEquals("myFunc", field(b, "fnName"));
  }

  // ================= setSourceNode =================

  @Test
  public void testSetSourceNode_setsFieldAndReturnsThis() {
    FunctionTypeBuilder b = newBuilder("f");
    Node fn = new Node(Token.FUNCTION);
    FunctionTypeBuilder result = b.setSourceNode(fn);
    assertSame(b, result);
    assertSame(fn, field(b, "sourceNode"));
  }

  @Test
  public void testSetSourceNode_null_isAllowed() {
    FunctionTypeBuilder b = newBuilder("f");
    b.setSourceNode(null);
    assertNull(field(b, "sourceNode"));
  }

  // ================= inferReturnType =================

  @Test
  public void testInferReturnType_nullInfo_usesUnknownType() {
    FunctionTypeBuilder b = newBuilder("f");
    b.inferReturnType(null);
    JSType returnType = field(b, "returnType");
    assertSame(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), returnType);
  }

  @Test
  public void testInferReturnType_infoWithoutReturnType_usesUnknownType() {
    FunctionTypeBuilder b = newBuilder("f");
    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(false);
    docBuilder.recordDescription("no return type here");
    JSDocInfo info = docBuilder.build(errorRoot);
    b.inferReturnType(info);
    JSType returnType = field(b, "returnType");
    assertSame(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), returnType);
  }

  @Test
  public void testInferReturnType_infoWithReturnType_evaluatesType() {
    FunctionTypeBuilder b = newBuilder("f");
    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(false);
    docBuilder.recordReturnType(namedType("number"));
    JSDocInfo info = docBuilder.build(errorRoot);
    b.inferReturnType(info);
    JSType returnType = field(b, "returnType");
    assertSame(registry.getNativeType(JSTypeNative.NUMBER_TYPE), returnType);
  }

  // ================= inferInheritance =================

  @Test
  public void testInferInheritance_nullInfo_noStateChange() {
    FunctionTypeBuilder b = newBuilder("f");
    b.inferInheritance(null);
    assertFalse((Boolean) field(b, "isConstructor"));
    assertFalse((Boolean) field(b, "isInterface"));
    assertNull(field(b, "baseType"));
    assertNull(field(b, "implementedInterfaces"));
  }

  @Test
  public void testInferInheritance_isConstructor_noBaseNoInterfaces() {
    FunctionTypeBuilder b = newBuilder("f");
    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(false);
    docBuilder.recordConstructor();
    JSDocInfo info = docBuilder.build(errorRoot);
    b.inferInheritance(info);
    assertTrue((Boolean) field(b, "isConstructor"));
    assertNull(field(b, "baseType"));
    List<?> implemented = field(b, "implementedInterfaces");
    assertNotNull(implemented);
    assertTrue(implemented.isEmpty());
  }

  @Test
  public void testInferInheritance_isInterface_flagSet() {
    FunctionTypeBuilder b = newBuilder("f");
    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(false);
    docBuilder.recordInterface();
    JSDocInfo info = docBuilder.build(errorRoot);
    b.inferInheritance(info);
    assertTrue((Boolean) field(b, "isInterface"));
  }

  @Test
  public void testInferInheritance_notCtorNorInterface_withImplements_reportsWarning() {
    FunctionTypeBuilder b = newBuilder("f");
    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(false);
    docBuilder.recordImplementedInterface(namedType("Foo"));
    JSDocInfo info = docBuilder.build(errorRoot);
    int before = compiler.getWarningCount();
    b.inferInheritance(info);
    assertEquals(before + 1, compiler.getWarningCount()); // IMPLEMENTS_WITHOUT_CONSTRUCTOR
  }

  @Test
  public void testInferInheritance_notCtorNorInterface_withBaseType_reportsExtendsWithoutTypedef() {
    FunctionTypeBuilder b = newBuilder("f");
    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(false);
    docBuilder.recordBaseType(namedType("Object"));
    JSDocInfo info = docBuilder.build(errorRoot);
    int before = compiler.getWarningCount();
    b.inferInheritance(info);
    assertEquals(before + 1, compiler.getWarningCount()); // EXTENDS_WITHOUT_TYPEDEF
  }

  /**
   * ทดสอบนี้มุ่งดักจับ "fault" จริงของ Closure-144: เมื่อ @extends ประเมินได้ type ที่ไม่ใช่
   * ObjectType (เช่น primitive "number") โค้ดจะเซ็ต baseType = null แล้วยังเรียก
   *   reportWarning(EXTENDS_NON_OBJECT, fnName, baseType.toString())
   * ซึ่ง baseType เป็น null ทำให้เกิด NullPointerException จริงในซอร์สที่ให้มา
   * (บั๊กที่ Defects4J Closure-144 แก้ไข)
   */
  @Test(expected = NullPointerException.class)
  public void testInferInheritance_baseTypeEvaluatesToNonObject_triggersKnownNpeBug() {
    FunctionTypeBuilder b = newBuilder("f");
    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(false);
    docBuilder.recordConstructor();
    docBuilder.recordBaseType(namedType("number"));
    JSDocInfo info = docBuilder.build(errorRoot);
    b.inferInheritance(info);
  }

  @Test
  public void testInferInheritance_isConstructor_withValidObjectBaseType_setsBaseType() {
    FunctionTypeBuilder b = newBuilder("f");
    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(false);
    docBuilder.recordConstructor();
    docBuilder.recordBaseType(namedType("Object"));
    JSDocInfo info = docBuilder.build(errorRoot);
    b.inferInheritance(info);
    assertNotNull(field(b, "baseType"));
  }

  @Test
  public void testInferInheritance_isConstructor_withValidImplementedInterface_addsToList() {
    FunctionTypeBuilder b = newBuilder("f");
    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(false);
    docBuilder.recordConstructor();
    docBuilder.recordImplementedInterface(namedType("Object"));
    JSDocInfo info = docBuilder.build(errorRoot);
    b.inferInheritance(info);
    List<?> implemented = field(b, "implementedInterfaces");
    assertEquals(1, implemented.size());
  }

  @Test
  public void testInferInheritance_isConstructor_withInvalidImplementedInterface_reportsError() {
    FunctionTypeBuilder b = newBuilder("f");
    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(false);
    docBuilder.recordConstructor();
    docBuilder.recordImplementedInterface(namedType("number")); // ไม่ใช่ ObjectType
    JSDocInfo info = docBuilder.build(errorRoot);
    int before = compiler.getErrorCount();
    b.inferInheritance(info);
    assertEquals(before + 1, compiler.getErrorCount()); // BAD_IMPLEMENTED_TYPE
  }

  // ================= inferThisType(JSDocInfo, JSType) =================

  @Test
  public void testInferThisType_typeIsObjectType_infoNull_setsThisType() {
    FunctionTypeBuilder b = newBuilder("f");
    JSType objType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE); // fallback ปลอดภัย
    // ใช้ OBJECT_TYPE จริงเพื่อให้ ObjectType.cast(...) ไม่เป็น null
    JSType realObjType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
    b.inferThisType(null, realObjType);
    assertNotNull(field(b, "thisType"));
  }

  @Test
  public void testInferThisType_typeIsNotObjectType_thisTypeUnchanged() {
    FunctionTypeBuilder b = newBuilder("f");
    JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    b.inferThisType(null, numType);
    assertNull(field(b, "thisType"));
  }

  // ================= inferThisType(JSDocInfo, Node) =================

  @Test
  public void testInferThisType_infoHasThisType_setsThisType() {
    FunctionTypeBuilder b = newBuilder("f");
    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(false);
    docBuilder.recordThisType(namedType("Object"));
    JSDocInfo info = docBuilder.build(errorRoot);
    b.inferThisType(info, (Node) null);
    assertNotNull(field(b, "thisType"));
  }

  @Test
  public void testInferThisType_ownerNull_infoNull_thisTypeUnchanged() {
    FunctionTypeBuilder b = newBuilder("f");
    b.inferThisType(null, (Node) null);
    assertNull(field(b, "thisType"));
  }

  @Test
  public void testInferThisType_ownerResolvesToKnownType_setsThisType() {
    FunctionTypeBuilder b = newBuilder("f");
    Node owner = Node.newString(Token.NAME, "Object");
    b.inferThisType(null, owner);
    // "Object" เป็นชื่อ native type ที่ลงทะเบียนไว้แล้วใน registry
    assertNotNull(field(b, "thisType"));
  }

  // ================= inferTemplateTypeName =================

  @Test
  public void testInferTemplateTypeName_nullInfo_noChange() {
    FunctionTypeBuilder b = newBuilder("f");
    b.inferTemplateTypeName(null);
    assertNull(field(b, "templateTypeName"));
  }

  @Test
  public void testInferTemplateTypeName_infoWithTemplate_setsField() {
    FunctionTypeBuilder b = newBuilder("f");
    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(false);
    docBuilder.recordTemplateTypeName("T");
    JSDocInfo info = docBuilder.build(errorRoot);
    b.inferTemplateTypeName(info);
    assertEquals("T", field(b, "templateTypeName"));
  }

  // ================= inferParameterTypes =================

  @Test
  public void testInferParameterTypes_argsNullInfoNull_returnsSameNoParametersNode() {
    FunctionTypeBuilder b = newBuilder("f");
    FunctionTypeBuilder result = b.inferParameterTypes((Node) null, (JSDocInfo) null);
    assertSame(b, result);
    assertNull(field(b, "parametersNode"));
  }

  @Test
  public void testInferParameterTypes_argsNullInfoNonNull_delegatesToInfoOverload() {
    FunctionTypeBuilder b = newBuilder("f");
    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(false);
    docBuilder.recordParameter("a", namedType("number"));
    JSDocInfo info = docBuilder.build(errorRoot);
    b.inferParameterTypes((Node) null, info);
    assertNotNull(field(b, "parametersNode"));
  }

  @Test
  public void testInferParameterTypes_simpleRequiredParams_noWarnings() {
    FunctionTypeBuilder b = newBuilder("f");
    Node lp = new Node(Token.LP);
    lp.addChildToBack(Node.newString(Token.NAME, "a"));
    lp.addChildToBack(Node.newString(Token.NAME, "b"));
    int before = compiler.getWarningCount();
    b.inferParameterTypes(lp, null);
    assertEquals(before, compiler.getWarningCount());
    assertNotNull(field(b, "parametersNode"));
  }

  @Test
  public void testInferParameterTypes_paramNotInArgsList_reportsInexistantParamWarning() {
    FunctionTypeBuilder b = newBuilder("f");
    Node lp = new Node(Token.LP);
    lp.addChildToBack(Node.newString(Token.NAME, "a"));
    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(false);
    docBuilder.recordParameter("a", namedType("number"));
    docBuilder.recordParameter("extra", namedType("number"));
    JSDocInfo info = docBuilder.build(errorRoot);
    int before = compiler.getWarningCount();
    b.inferParameterTypes(lp, info);
    assertEquals(before + 1, compiler.getWarningCount()); // INEXISTANT_PARAM
  }

  @Test
  public void testInferParameterTypes_templateTypeExpectedButNotFound_reportsError() {
    FunctionTypeBuilder b = newBuilder("f");
    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(false);
    docBuilder.recordTemplateTypeName("T");
    JSDocInfo info = docBuilder.build(errorRoot);
    b.inferTemplateTypeName(info);
    Node lp = new Node(Token.LP);
    lp.addChildToBack(Node.newString(Token.NAME, "a"));
    int before = compiler.getErrorCount();
    b.inferParameterTypes(lp, null);
    assertEquals(before + 1, compiler.getErrorCount()); // TEMPLATE_TYPE_EXPECTED
  }

  /**
   * หมายเหตุ (ความเสี่ยงสูง): ทดสอบนี้อ้างอิงสมมติฐานเรื่อง encoding ของ optional type
   * ({@link #optionalType(String)}) ซึ่งไม่ได้ยืนยันจากซอร์สที่ให้มาโดยตรง
   */
  @Test
  public void testInferParameterTypes_optionalBeforeRequired_reportsOptionalArgAtEnd() {
    FunctionTypeBuilder b = newBuilder("f");
    Node lp = new Node(Token.LP);
    lp.addChildToBack(Node.newString(Token.NAME, "a"));
    lp.addChildToBack(Node.newString(Token.NAME, "b"));

    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(false);
    docBuilder.recordParameter("a", optionalType("number"));
    docBuilder.recordParameter("b", namedType("number")); // required หลัง optional
    JSDocInfo info = docBuilder.build(errorRoot);

    int before = compiler.getWarningCount();
    b.inferParameterTypes(lp, info);
    assertEquals(before + 1, compiler.getWarningCount()); // OPTIONAL_ARG_AT_END (คาดว่า)
  }

  // ================= inferFromOverriddenFunction =================

  @Test
  public void testInferFromOverriddenFunction_paramsParentNull_reusesOldParametersNode() {
    Node oldParams = new FunctionParamBuilder(registry).build();
    FunctionType oldType = new FunctionBuilder(registry)
        .withReturnType(registry.getNativeType(JSTypeNative.NUMBER_TYPE))
        .withParamsNode(oldParams)
        .build();
    FunctionTypeBuilder b = newBuilder("f");
    b.inferFromOverriddenFunction(oldType, null);
    assertSame(registry.getNativeType(JSTypeNative.NUMBER_TYPE), field(b, "returnType"));
    assertNotNull(field(b, "parametersNode"));
  }

  @Test
  public void testInferFromOverriddenFunction_withLiteralParams_appliesOldParamTypes() {
    FunctionParamBuilder oldParamsBuilder = new FunctionParamBuilder(registry);
    oldParamsBuilder.addRequiredParams(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    Node oldParams = oldParamsBuilder.build();
    FunctionType oldType = new FunctionBuilder(registry)
        .withReturnType(registry.getNativeType(JSTypeNative.VOID_TYPE))
        .withParamsNode(oldParams)
        .build();

    Node paramsParent = new Node(Token.LP);
    paramsParent.addChildToBack(Node.newString(Token.NAME, "x"));

    FunctionTypeBuilder b = newBuilder("f");
    b.inferFromOverriddenFunction(oldType, paramsParent);
    assertNotNull(field(b, "parametersNode"));
  }

  @Test
  public void testInferFromOverriddenFunction_moreLiteralParamsThanOld_addsUnknownTypeParams() {
    // กรณี oldParams หมดก่อน currentParam -> warnedAboutArgList |= addParameter(...UNKNOWN_TYPE...)
    Node oldParams = new FunctionParamBuilder(registry).build(); // ไม่มี param เดิม
    FunctionType oldType = new FunctionBuilder(registry)
        .withReturnType(registry.getNativeType(JSTypeNative.VOID_TYPE))
        .withParamsNode(oldParams)
        .build();

    Node paramsParent = new Node(Token.LP);
    paramsParent.addChildToBack(Node.newString(Token.NAME, "x"));

    FunctionTypeBuilder b = newBuilder("f");
    b.inferFromOverriddenFunction(oldType, paramsParent);
    assertNotNull(field(b, "parametersNode"));
  }

  // ================= isFunctionTypeDeclaration (static) =================

  @Test
  public void testIsFunctionTypeDeclaration_allFalse_returnsFalse() {
    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(false);
    docBuilder.recordDescription("plain doc, no type annotations");
    JSDocInfo info = docBuilder.build(errorRoot);
    assertNotNull(info);
    assertFalse(FunctionTypeBuilder.isFunctionTypeDeclaration(info));
  }

  @Test
  public void testIsFunctionTypeDeclaration_hasParameter_returnsTrue() {
    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(false);
    docBuilder.recordParameter("a", namedType("number"));
    JSDocInfo info = docBuilder.build(errorRoot);
    assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(info));
  }

  @Test
  public void testIsFunctionTypeDeclaration_hasReturnType_returnsTrue() {
    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(false);
    docBuilder.recordReturnType(namedType("number"));
    JSDocInfo info = docBuilder.build(errorRoot);
    assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(info));
  }

  @Test
  public void testIsFunctionTypeDeclaration_hasThisType_returnsTrue() {
    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(false);
    docBuilder.recordThisType(namedType("Object"));
    JSDocInfo info = docBuilder.build(errorRoot);
    assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(info));
  }

  @Test
  public void testIsFunctionTypeDeclaration_isConstructor_returnsTrue() {
    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(false);
    docBuilder.recordConstructor();
    JSDocInfo info = docBuilder.build(errorRoot);
    assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(info));
  }

  @Test
  public void testIsFunctionTypeDeclaration_isInterface_returnsTrue() {
    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(false);
    docBuilder.recordInterface();
    JSDocInfo info = docBuilder.build(errorRoot);
    assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(info));
  }

  // ================= buildAndRegister =================

  @Test(expected = IllegalStateException.class)
  public void testBuildAndRegister_noParametersNode_throwsIllegalState() {
    FunctionTypeBuilder b = newBuilder("f");
    b.buildAndRegister();
  }

  @Test
  public void testBuildAndRegister_plainFunction_buildsSuccessfully() {
    FunctionTypeBuilder b = newBuilder("plainFn");
    b.inferParameterTypes((Node) null, (JSDocInfo) null);
    FunctionType fnType = b.buildAndRegister();
    assertNotNull(fnType);
    assertFalse(fnType.isConstructor());
    assertFalse(fnType.isInterface());
  }

  @Test
  public void testBuildAndRegister_interfaceType_declaresTypeWhenGlobalAndNamed() {
    FunctionTypeBuilder b = newBuilder("MyInterface");
    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(false);
    docBuilder.recordInterface();
    JSDocInfo info = docBuilder.build(errorRoot);
    b.inferInheritance(info);
    b.inferParameterTypes((Node) null, (JSDocInfo) null);
    FunctionType fnType = b.buildAndRegister();
    assertTrue(fnType.isInterface());
    assertNotNull(registry.getType("MyInterface"));
  }

  @Test
  public void testBuildAndRegister_constructorType_newType_declaresTypeWhenGlobalAndNamed() {
    FunctionTypeBuilder b = newBuilder("MyClass");
    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(false);
    docBuilder.recordConstructor();
    JSDocInfo info = docBuilder.build(errorRoot);
    b.inferInheritance(info);
    b.inferParameterTypes((Node) null, (JSDocInfo) null);
    FunctionType fnType = b.buildAndRegister();
    assertTrue(fnType.isConstructor());
    assertNotNull(registry.getType("MyClass"));
  }

  @Test
  public void testBuildAndRegister_constructorType_emptyFnName_doesNotThrow() {
    // fnName == "" (มาจาก null ผ่าน constructor) -> ข้ามเงื่อนไข !fnName.isEmpty() ตอน declareType
    FunctionTypeBuilder b = newBuilder(null);
    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(false);
    docBuilder.recordConstructor();
    JSDocInfo info = docBuilder.build(errorRoot);
    b.inferInheritance(info);
    b.inferParameterTypes((Node) null, (JSDocInfo) null);
    FunctionType fnType = b.buildAndRegister();
    assertTrue(fnType.isConstructor());
  }

  @Test
  public void testBuildAndRegister_constructorType_existingNativeType_reusesExisting() {
    // "Object" เป็น native constructor ที่มีอยู่แล้วใน registry -> เข้า path reuse existingFn
    FunctionTypeBuilder b = newBuilder("Object");
    b.inferParameterTypes((Node) null, (JSDocInfo) null);
    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(false);
    docBuilder.recordConstructor();
    JSDocInfo info = docBuilder.build(errorRoot);
    b.inferInheritance(info);
    FunctionType fnType = b.buildAndRegister();
    assertNotNull(fnType);
  }
}
