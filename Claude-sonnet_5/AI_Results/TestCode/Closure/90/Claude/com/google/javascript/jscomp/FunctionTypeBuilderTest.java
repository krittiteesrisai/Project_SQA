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
 * Unit tests for {@link FunctionTypeBuilder} (Defects4J Closure-90b).
 *
 * หมายเหตุ: ดูคอมเมนต์ประกอบด้านบนของไฟล์คำตอบเกี่ยวกับข้อสมมติที่ใช้
 * (Compiler#initOptions, JSDocInfoBuilder API, scope = null)
 */
public class FunctionTypeBuilderTest {

  private Compiler compiler;
  private JSTypeRegistry typeRegistry;
  private Node errorRoot;

  @Before
  public void setUp() {
    // สมมติ: Compiler + initOptions เป็น pattern มาตรฐานของ Closure Compiler
    // สำหรับเตรียม JSTypeRegistry / error manager โดยไม่ต้อง compile จริง
    compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    typeRegistry = compiler.getTypeRegistry();
    errorRoot = new Node(Token.FUNCTION);
  }

  /**
   * scope ส่งเป็น null โดยเจตนา (ดูหมายเหตุด้านบน) - ปลอดภัยเฉพาะ path
   * ที่ไม่เรียกใช้ scope.
   */
  private FunctionTypeBuilder newBuilder(String fnName) {
    return new FunctionTypeBuilder(fnName, compiler, errorRoot, "test.js", null);
  }

  private JSTypeExpression typeExpr(String typeName) {
    // สมมติโครงสร้าง Node แบบง่ายสำหรับชื่อชนิดข้อมูล (ไม่มีซอร์สยืนยัน 100%)
    return new JSTypeExpression(Node.newString(Token.STRING, typeName), "test.js");
  }

  private static Object getField(Object target, String name) throws Exception {
    Field f = FunctionTypeBuilder.class.getDeclaredField(name);
    f.setAccessible(true);
    return f.get(target);
  }

  private static void setField(Object target, String name, Object value) throws Exception {
    Field f = FunctionTypeBuilder.class.getDeclaredField(name);
    f.setAccessible(true);
    f.set(target, value);
  }

  // ---------------------------------------------------------------------
  // isFunctionTypeDeclaration (static) - ครอบคลุมทั้ง 5 เงื่อนไข OR + false
  // ---------------------------------------------------------------------

  @Test
  public void testIsFunctionTypeDeclaration_paramCountGreaterThanZero_true() {
    JSDocInfoBuilder b = new JSDocInfoBuilder(false);
    b.recordParameter("x", typeExpr("string"));
    JSDocInfo info = b.build(null);
    assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(info));
  }

  @Test
  public void testIsFunctionTypeDeclaration_hasReturnType_true() {
    JSDocInfoBuilder b = new JSDocInfoBuilder(false);
    b.recordReturnType(typeExpr("string"));
    JSDocInfo info = b.build(null);
    assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(info));
  }

  @Test
  public void testIsFunctionTypeDeclaration_hasThisType_true() {
    JSDocInfoBuilder b = new JSDocInfoBuilder(false);
    b.recordThisType(typeExpr("Object"));
    JSDocInfo info = b.build(null);
    assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(info));
  }

  @Test
  public void testIsFunctionTypeDeclaration_isConstructor_true() {
    JSDocInfoBuilder b = new JSDocInfoBuilder(false);
    b.recordConstructor();
    JSDocInfo info = b.build(null);
    assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(info));
  }

  @Test
  public void testIsFunctionTypeDeclaration_isInterface_true() {
    JSDocInfoBuilder b = new JSDocInfoBuilder(false);
    b.recordInterface();
    JSDocInfo info = b.build(null);
    assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(info));
  }

  @Test
  public void testIsFunctionTypeDeclaration_allFalse_false() {
    JSDocInfo info = new JSDocInfoBuilder(false).build(null);
    assertFalse(FunctionTypeBuilder.isFunctionTypeDeclaration(info));
  }

  // ---------------------------------------------------------------------
  // Constructor
  // ---------------------------------------------------------------------

  @Test(expected = NullPointerException.class)
  public void testConstructor_nullErrorRoot_throwsNPE() {
    // ซอร์สมี Preconditions.checkNotNull(errorRoot) อย่างชัดเจน
    new FunctionTypeBuilder("foo", compiler, null, "test.js", null);
  }

  @Test
  public void testConstructor_nullFnName_defaultsToEmptyString() throws Exception {
    FunctionTypeBuilder builder =
        new FunctionTypeBuilder(null, compiler, errorRoot, "test.js", null);
    assertEquals("", getField(builder, "fnName"));
  }

  @Test
  public void testConstructor_nonNullFnName_keepsName() throws Exception {
    FunctionTypeBuilder builder =
        new FunctionTypeBuilder("myFn", compiler, errorRoot, "test.js", null);
    assertEquals("myFn", getField(builder, "fnName"));
  }

  // ---------------------------------------------------------------------
  // setSourceNode
  // ---------------------------------------------------------------------

  @Test
  public void testSetSourceNode_returnsSameInstanceAndSetsField() throws Exception {
    FunctionTypeBuilder builder = newBuilder("Foo9");
    Node fnNode = new Node(Token.FUNCTION);

    FunctionTypeBuilder result = builder.setSourceNode(fnNode);

    assertSame(builder, result);
    assertSame(fnNode, getField(builder, "sourceNode"));
  }

  // ---------------------------------------------------------------------
  // inferFromOverriddenFunction - เฉพาะกรณี oldType == null (short-circuit)
  // ---------------------------------------------------------------------

  @Test
  public void testInferFromOverriddenFunction_nullOldType_noOpReturnsThis() throws Exception {
    FunctionTypeBuilder builder = newBuilder("Foo0");

    FunctionTypeBuilder result = builder.inferFromOverriddenFunction(null, null);

    assertSame(builder, result);
    assertNull(getField(builder, "returnType"));
    assertNull(getField(builder, "parametersNode"));
  }

  // ---------------------------------------------------------------------
  // inferReturnType
  // ---------------------------------------------------------------------

  @Test
  public void testInferReturnType_nullInfo_noOp() throws Exception {
    FunctionTypeBuilder builder = newBuilder("Foo10");
    builder.inferReturnType(null);
    assertNull(getField(builder, "returnType"));
  }

  @Test
  public void testInferReturnType_infoWithoutReturnType_noOp() throws Exception {
    FunctionTypeBuilder builder = newBuilder("Foo11");
    JSDocInfo info = new JSDocInfoBuilder(false).build(null); // hasReturnType() == false
    builder.inferReturnType(info);
    assertNull(getField(builder, "returnType"));
  }

  // ---------------------------------------------------------------------
  // inferReturnStatementsAsLastResort - เฉพาะ short-circuit functionBlock==null
  // (ไม่ทดสอบกรณี != null เพราะต้องมี CompilerInput ที่ลงทะเบียน sourceName จริง)
  // ---------------------------------------------------------------------

  @Test
  public void testInferReturnStatementsAsLastResort_nullBlock_noOp() throws Exception {
    FunctionTypeBuilder builder = newBuilder("Foo12");

    FunctionTypeBuilder result = builder.inferReturnStatementsAsLastResort(null);

    assertSame(builder, result);
    assertNull(getField(builder, "returnType"));
  }

  // ---------------------------------------------------------------------
  // inferInheritance
  // ---------------------------------------------------------------------

  @Test
  public void testInferInheritance_nullInfo_noOp() throws Exception {
    FunctionTypeBuilder builder = newBuilder("Foo1a");

    builder.inferInheritance(null);

    assertNull(getField(builder, "baseType"));
    assertNull(getField(builder, "implementedInterfaces"));
    assertFalse((Boolean) getField(builder, "isConstructor"));
    assertFalse((Boolean) getField(builder, "isInterface"));
  }

  @Test
  public void testInferInheritance_constructorNoBaseNoInterfaces_emptyInterfaceList()
      throws Exception {
    FunctionTypeBuilder builder = newBuilder("Foo2a");
    JSDocInfoBuilder b = new JSDocInfoBuilder(false);
    b.recordConstructor();
    JSDocInfo info = b.build(null);

    builder.inferInheritance(info);

    assertTrue((Boolean) getField(builder, "isConstructor"));
    assertNull(getField(builder, "baseType")); // hasBaseType() == false -> ไม่ถูกกำหนด
    Object interfaces = getField(builder, "implementedInterfaces");
    assertNotNull(interfaces);
    assertTrue(((List<?>) interfaces).isEmpty());
  }

  @Test
  public void testInferInheritance_baseTypeWithoutConstructorOrInterface_reportsWarning()
      throws Exception {
    FunctionTypeBuilder builder = newBuilder("Foo3a");
    JSDocInfoBuilder b = new JSDocInfoBuilder(false);
    b.recordBaseType(typeExpr("Object"));
    JSDocInfo info = b.build(null);

    builder.inferInheritance(info);

    // isConstructor/isInterface เป็น false -> เข้า else -> EXTENDS_WITHOUT_TYPEDEF
    assertNull(getField(builder, "baseType"));
    assertTrue("ควรมี warning เกิดขึ้น (EXTENDS_WITHOUT_TYPEDEF)",
        compiler.getWarnings().length > 0);
  }

  @Test
  public void testInferInheritance_implementsWithoutConstructor_reportsWarning()
      throws Exception {
    FunctionTypeBuilder builder = newBuilder("Foo4a");
    JSDocInfoBuilder b = new JSDocInfoBuilder(false);
    b.recordImplementedInterface(typeExpr("SomeInterface"));
    JSDocInfo info = b.build(null);

    builder.inferInheritance(info);

    assertTrue("ควรมี warning เกิดขึ้น (IMPLEMENTS_WITHOUT_CONSTRUCTOR)",
        compiler.getWarnings().length > 0);
  }

  // ---------------------------------------------------------------------
  // inferTemplateTypeName - เฉพาะ info == null
  // ---------------------------------------------------------------------

  @Test
  public void testInferTemplateTypeName_nullInfo_noOp() throws Exception {
    FunctionTypeBuilder builder = newBuilder("Foo13");
    builder.inferTemplateTypeName(null);
    assertNull(getField(builder, "templateTypeName"));
  }

  // ---------------------------------------------------------------------
  // inferThisType(JSDocInfo, JSType)
  // ---------------------------------------------------------------------

  @Test
  public void testInferThisType_typeNotObject_thisTypeStaysNull() throws Exception {
    FunctionTypeBuilder builder = newBuilder("Foo5a");
    JSType voidType = typeRegistry.getNativeType(JSTypeNative.VOID_TYPE);

    builder.inferThisType(null, voidType);

    assertNull(getField(builder, "thisType"));
  }

  @Test
  public void testInferThisType_typeObjectInfoNull_setsThisType() throws Exception {
    FunctionTypeBuilder builder = newBuilder("Foo6a");
    JSType objectType = typeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE);

    builder.inferThisType(null, objectType);

    assertNotNull(getField(builder, "thisType"));
  }

  @Test
  public void testInferThisType_typeObjectInfoHasType_thisTypeStaysNull() throws Exception {
    FunctionTypeBuilder builder = newBuilder("Foo7a");
    JSDocInfoBuilder b = new JSDocInfoBuilder(false);
    // สมมติ: มี method recordType(JSTypeExpression) ใน JSDocInfoBuilder (ไม่มีในซอร์สที่ให้มา)
    b.recordType(typeExpr("Object"));
    JSDocInfo info = b.build(null);
    JSType objectType = typeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE);

    builder.inferThisType(info, objectType);

    // info.hasType() == true -> เงื่อนไข (info==null || !info.hasType()) เป็น false
    assertNull(getField(builder, "thisType"));
  }

  // ---------------------------------------------------------------------
  // inferParameterTypes
  // ---------------------------------------------------------------------

  @Test
  public void testInferParameterTypes_bothNull_noOp() throws Exception {
    FunctionTypeBuilder builder = newBuilder("Foo14");

    FunctionTypeBuilder result = builder.inferParameterTypes(null, null);

    assertSame(builder, result);
    assertNull(getField(builder, "parametersNode"));
  }

  @Test
  public void testInferParameterTypes_inexistentParam_reportsWarning() throws Exception {
    FunctionTypeBuilder builder = newBuilder("Foo15");
    JSDocInfoBuilder b = new JSDocInfoBuilder(false);
    b.recordParameter("a", typeExpr("string"));
    JSDocInfo info = b.build(null);
    // argsParent ไม่มี parameter จริงเลย -> ทำให้ "a" ตกไปอยู่ใน allJsDocParams ที่เหลือ
    Node argsParent = new Node(Token.LP);

    builder.inferParameterTypes(argsParent, info);

    assertTrue("ควรมี warning INEXISTANT_PARAM", compiler.getWarnings().length > 0);
    assertNotNull(getField(builder, "parametersNode")); // builder.build() ถูกเรียกเสมอ
  }

  // ---------------------------------------------------------------------
  // buildAndRegister
  // ---------------------------------------------------------------------

  @Test(expected = IllegalStateException.class)
  public void testBuildAndRegister_noParametersNode_throwsIllegalStateException() {
    FunctionTypeBuilder builder = newBuilder("Foo8");
    builder.buildAndRegister();
  }

  @Test
  public void testBuildAndRegister_plainFunction_buildsSuccessfully() throws Exception {
    // isConstructor == false, isInterface == false (default) -> เข้า branch "plain function"
    // ซึ่งไม่เรียก scope.isGlobal() จึงปลอดภัยแม้ scope == null
    FunctionTypeBuilder builder = newBuilder("PlainFunc123");
    Node params = new FunctionParamBuilder(typeRegistry).build();
    setField(builder, "parametersNode", params);

    FunctionType fnType = builder.buildAndRegister();

    assertNotNull(fnType);
    assertEquals(typeRegistry.getNativeType(JSTypeNative.UNKNOWN_TYPE),
        fnType.getReturnType());
  }
}
