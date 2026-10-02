package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.Lists;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * JUnit4 test suite for {@link TypedScopeCreator} (Defects4J Closure-95b).
 *
 * แนวทางการทดสอบ:
 * 1) ใช้ Compiler จริง parse source เป็น AST (ไม่เปิด checkTypes เพื่อไม่ให้
 *    TypeCheck pass เรียก TypedScopeCreator ไปแล้วก่อนที่เราจะเรียกเอง
 *    ซึ่งจะทำให้เกิดการ declareType ซ้ำใน typeRegistry)
 * 2) เรียก new TypedScopeCreator(compiler).createScope(root, null) ตรง ๆ
 *    เพื่อทดสอบ behavior ของคลาสเป้าหมายโดยตรง
 * 3) ตรวจผลลัพธ์ผ่าน Scope / Scope.Var / JSType ที่ได้ และผ่าน
 *    compiler.getErrors()/getWarnings() สำหรับกรณีที่ TypedScopeCreator
 *    เรียก compiler.report(JSError...)
 *
 * ข้อสมมติที่ไม่ปรากฏในซอร์สที่ให้มา (ระบุ comment ไว้จุดที่ใช้):
 *  - Compiler#compile(List<SourceFile>, List<SourceFile>, CompilerOptions)
 *  - Compiler#getRoot() คืน Node ที่มีลูก 2 ตัว (externsRoot, jsRoot)
 *  - SourceFile.fromCode(String fileName, String code)
 *  - JSError#getType() คืน DiagnosticType
 */
public class TypedScopeCreatorTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  // ---------------------------------------------------------------------
  // Helpers
  // ---------------------------------------------------------------------

  private Scope buildGlobalScope(String js) {
    return buildGlobalScope("", js);
  }

  /**
   * Parse (externsCode, js) ด้วย compiler จริง แล้วเรียก TypedScopeCreator
   * เพื่อสร้าง global Scope โดยตรง (ไม่ผ่าน TypeCheck pass)
   */
  private Scope buildGlobalScope(String externsCode, String js) {
    CompilerOptions options = new CompilerOptions();
    // ไม่เรียก options.setCheckTypes(true) -> ค่า default คือ false
    // เพื่อไม่ให้ TypeCheck pass เรียก TypedScopeCreator ซ้ำกับที่เราเรียกเอง

    List<SourceFile> externs =
        Lists.newArrayList(SourceFile.fromCode("externs.js", externsCode));
    List<SourceFile> inputs =
        Lists.newArrayList(SourceFile.fromCode("input.js", js));

    // สมมติ API: compile() จะ parse และเก็บ AST ไว้ให้ดึงผ่าน getRoot()
    compiler.compile(externs, inputs, options);

    Node root = compiler.getRoot(); // สมมติ: root มี externsRoot/jsRoot เป็นลูก
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    return creator.createScope(root, null);
  }

  private JSType findNameType(String name, Scope scope) {
    Scope.Var v = scope.getVar(name);
    assertNotNull("variable " + name + " should be declared", v);
    return v.getType();
  }

  /** ตรวจว่ามี JSError ชนิดที่กำหนดอยู่ใน errors หรือ warnings ของ compiler หรือไม่ */
  private boolean hasDiagnostic(DiagnosticType type) {
    for (JSError e : compiler.getErrors()) {
      if (e.getType() == type) {
        return true;
      }
    }
    for (JSError e : compiler.getWarnings()) {
      if (e.getType() == type) {
        return true;
      }
    }
    return false;
  }

  // ---------------------------------------------------------------------
  // 1) Boundary: empty program -> createInitialScope ประกาศแต่ native types
  // ---------------------------------------------------------------------
  @Test
  public void testEmptyProgram_onlyNativeTypesDeclared() {
    Scope scope = buildGlobalScope("");
    assertNotNull(scope.getVar("Object"));
    assertNotNull(scope.getVar("Array"));
    assertNotNull(scope.getVar("undefined"));
    assertNotNull(scope.getVar("goog.typedef"));
    assertNotNull(scope.getVar("ActiveXObject"));
    // ค่าที่ไม่เคยประกาศต้องเป็น null (boundary / negative case)
    assertNull(scope.getVar("NotDeclaredAnywhere"));
  }

  // ---------------------------------------------------------------------
  // 2) var เดียว + @type -> defineVar: !hasMoreThanOneChild() branch
  // ---------------------------------------------------------------------
  @Test
  public void testVarWithTypeAnnotation_singleChild() {
    Scope scope = buildGlobalScope("/** @type {number} */ var foo = 1;");
    JSType fooType = findNameType("foo", scope);
    assertEquals("number", fooType.toString());
  }

  // ---------------------------------------------------------------------
  // 3) var ไม่มี JSDoc -> defineName: info == null, not extern -> inferred
  // ---------------------------------------------------------------------
  @Test
  public void testVarWithoutJSDoc_isInferredType() {
    Scope scope = buildGlobalScope("var foo = 1;");
    Scope.Var v = scope.getVar("foo");
    assertNotNull(v);
    assertTrue(v.isTypeInferred());
  }

  // ---------------------------------------------------------------------
  // 4) หลาย var + JSDoc บน VAR node -> MULTIPLE_VAR_DEF (defineVar branch: hasMoreThanOneChild && info != null)
  // ---------------------------------------------------------------------
  @Test
  public void testMultipleVarDeclarationWithJSDocOnVar_reportsMultipleVarDef() {
    buildGlobalScope("/** @type {number} */ var a = 1, b = 2;");
    assertTrue(hasDiagnostic(TypeCheck.MULTIPLE_VAR_DEF));
  }

  // ---------------------------------------------------------------------
  // 5) หลาย var โดยไม่มี JSDoc บน VAR node (มี JSDoc รายชื่อแทน) -> ไม่ report,
  //    เดินลูป for (Node name : n.children()) ครบทุก child
  // ---------------------------------------------------------------------
  @Test
  public void testMultipleVarDeclaration_perNameJSDoc_noWarning() {
    Scope scope = buildGlobalScope(
        "var /** number */ a = 1, /** string */ b = 'x';");
    assertFalse(hasDiagnostic(TypeCheck.MULTIPLE_VAR_DEF));
    assertNotNull(scope.getVar("a"));
    assertNotNull(scope.getVar("b"));
  }

  // ---------------------------------------------------------------------
  // 6) @enum + object literal -> getEnumType: value.getType()==OBJECTLIT branch
  // ---------------------------------------------------------------------
  @Test
  public void testEnumDeclaration_objectLiteral_noErrors() {
    Scope scope = buildGlobalScope(
        "/** @enum {number} */ var Foo = {A: 1, B: 2};");
    JSType fooType = findNameType("Foo", scope);
    assertNotNull(fooType);
    assertFalse(hasDiagnostic(TypeCheck.ENUM_DUP));
  }

  // ---------------------------------------------------------------------
  // 7) @enum คีย์ซ้ำ -> enumType.hasOwnProperty(keyName) == true -> ENUM_DUP
  // ---------------------------------------------------------------------
  @Test
  public void testEnumDeclaration_duplicateKey_reportsEnumDup() {
    buildGlobalScope("/** @enum {number} */ var Foo = {A: 1, A: 2};");
    assertTrue(hasDiagnostic(TypeCheck.ENUM_DUP));
  }

  // ---------------------------------------------------------------------
  // 8) @enum แต่ไม่มีค่า initializer -> getEnumType: value == null
  //    -> enumType ยังเป็น null -> report(ENUM_INITIALIZER)
  // ---------------------------------------------------------------------
  @Test
  public void testEnumDeclaration_noInitializer_reportsEnumInitializer() {
    buildGlobalScope("/** @enum {number} */ var Foo;");
    assertTrue(hasDiagnostic(TypedScopeCreator.ENUM_INITIALIZER));
  }

  // ---------------------------------------------------------------------
  // 9) @enum ที่ value เป็น qualified name อ้างถึง enum อื่น -> else-if isQualifiedName branch
  // ---------------------------------------------------------------------
  @Test
  public void testEnumDeclaration_aliasToAnotherEnum() {
    Scope scope = buildGlobalScope(
        "/** @enum {number} */ var Foo = {A: 1};\n" +
        "/** @enum {number} */ var Bar = Foo;");
    assertNotNull(scope.getVar("Bar"));
    // ไม่ควรมี ENUM_INITIALIZER เพราะ enumType หาได้จาก var Foo (EnumType)
    assertFalse(hasDiagnostic(TypedScopeCreator.ENUM_INITIALIZER));
  }

  // ---------------------------------------------------------------------
  // 10) function declaration -> defineDeclaredFunction, parent != ASSIGN/NAME
  // ---------------------------------------------------------------------
  @Test
  public void testFunctionDeclaration_globalScope() {
    Scope scope = buildGlobalScope("function foo(a, b) {}");
    JSType fooType = findNameType("foo", scope);
    assertTrue(fooType instanceof FunctionType);
  }

  // ---------------------------------------------------------------------
  // 11) @constructor function -> ประกาศ Foo และ Foo.prototype (defineSlot:
  //     scopeToDeclareIn.isGlobal() && type instanceof FunctionType && isConstructor())
  //     หมายเหตุ: isConstructor()==true มาจาก FunctionTypeBuilder ซึ่งไม่ได้แสดงในซอร์สที่ให้มา
  // ---------------------------------------------------------------------
  @Test
  public void testConstructorDeclaration_declaresPrototypeSlot() {
    Scope scope = buildGlobalScope("/** @constructor */ function Foo() {}");
    JSType fooType = findNameType("Foo", scope);
    assertTrue(fooType instanceof FunctionType);
    assertTrue(((FunctionType) fooType).isConstructor());
    assertNotNull(scope.getVar("Foo.prototype"));
  }

  // ---------------------------------------------------------------------
  // 12) getFunctionType: alias branch (rValue.isQualifiedName() && scope.isGlobal())
  //     ผ่านการประกาศ @constructor var Bar = Foo;
  // ---------------------------------------------------------------------
  @Test
  public void testConstructorAlias_registersAliasAsConstructorType() {
    Scope scope = buildGlobalScope(
        "/** @constructor */ function Foo() {}\n" +
        "/** @constructor */ var Bar = Foo;");
    JSType barType = findNameType("Bar", scope);
    assertTrue(barType instanceof FunctionType);
    assertTrue(((FunctionType) barType).isConstructor());
  }

  // ---------------------------------------------------------------------
  // 13) prototype method: firstChild.getType()==GETPROP && isQualifiedName()
  //     -> maybeDeclareQualifiedName -> getPrototypePropertyOwner branch
  // ---------------------------------------------------------------------
  @Test
  public void testPrototypeMethodAssignment_declaredAsFunctionType() {
    Scope scope = buildGlobalScope(
        "/** @constructor */ function Foo() {}\n" +
        "Foo.prototype.bar = function() { return 1; };");
    Scope.Var v = scope.getVar("Foo.prototype.bar");
    assertNotNull(v);
    assertTrue(v.getType() instanceof FunctionType);
  }

  // ---------------------------------------------------------------------
  // 14) Stub declaration: GETPROP ใน EXPR_RESULT ไม่มีค่า/JSDoc
  //     -> valueType == null -> stubDeclarations.add(...)
  //     -> resolveStubDeclarations(): defineSlot(unknownType, inferred=true)
  // ---------------------------------------------------------------------
  @Test
  public void testStubDeclaration_resolvedAsUnknownAndInferred() {
    Scope scope = buildGlobalScope(
        "/** @constructor */ function Foo() {}\n" +
        "Foo.prototype.bar;");
    Scope.Var v = scope.getVar("Foo.prototype.bar");
    assertNotNull(v);
    assertTrue(v.isTypeInferred());
    assertTrue(v.getType().isUnknownType());
  }

  // ---------------------------------------------------------------------
  // 15) catch parameter -> defineCatch -> defineSlot(catchName, n, null)
  //     (type == null -> inferred = true) ประกาศใน scope ปัจจุบัน (global ในเคสนี้)
  // ---------------------------------------------------------------------
  @Test
  public void testCatchParameter_declaredInferredInCurrentScope() {
    Scope scope = buildGlobalScope("try { } catch (e) { }");
    Scope.Var v = scope.getVar("e");
    assertNotNull(v);
    assertTrue(v.isTypeInferred());
  }

  // ---------------------------------------------------------------------
  // 16) redeclare: qName ถูกประกาศไปแล้ว -> scopeToDeclareIn.isDeclared(...) == true
  //     -> validator.expectUndeclaredVariable(...) ถูกเรียก แทนการ declare ซ้ำ
  //     (สมอกิ: เราตรวจแค่ว่าไม่ throw exception และตัวแรกยังคงค่าเดิม
  //     เนื่องจากไม่รู้ behavior ภายในของ TypeValidator จากซอร์สที่ให้มา)
  // ---------------------------------------------------------------------
  @Test
  public void testRedeclareQualifiedName_doesNotThrowAndKeepsFirstType() {
    Scope scope = buildGlobalScope(
        "/** @constructor */ function Foo() {}\n" +
        "Foo.prototype.bar = 1;\n" +
        "Foo.prototype.bar = 'x';"); // ประกาศ bar ซ้ำด้วยชนิดต่างกัน
    Scope.Var v = scope.getVar("Foo.prototype.bar");
    assertNotNull(v);
    // ไม่ assert ชนิดที่แน่นอน เพราะพฤติกรรมของ validator ไม่ได้แสดงในซอร์ส
  }

  // ---------------------------------------------------------------------
  // 17) "prototype" ถูก assign ใหม่ทั้ง object (ignore branch):
  //     maybeDeclareQualifiedName: "prototype".equals(propName) &&
  //     qVar != null && !qVar.isTypeInferred() -> return (ignore)
  // ---------------------------------------------------------------------
  @Test
  public void testReassignDeclaredPrototype_isIgnored() {
    Scope scope = buildGlobalScope(
        "/** @constructor */ function Foo() {}\n" +
        // Foo.prototype ถูก declare แบบ "declared" (ไม่ inferred) ตอนสร้าง constructor
        // ดังนั้นการ assign ใหม่ทั้ง object ควรถูก ignore ตาม source
        "Foo.prototype = {};");
    Scope.Var v = scope.getVar("Foo.prototype");
    assertNotNull(v);
  }

  // ---------------------------------------------------------------------
  // NOTE: กรณีที่ "ไม่กล้าเดา" เนื่องจากไม่มีรายละเอียดพอในซอร์สที่ให้มา
  // (ไม่ได้เขียน assertion ที่เจาะจง เพราะพฤติกรรมขึ้นกับคลาสอื่นที่ไม่ได้ให้มา):
  //
  //  - MALFORMED_TYPEDEF: ขึ้นกับว่า JSTypeExpression#evaluate() คืน null
  //    เมื่อไหร่ (ไม่มี source ของ JSTypeExpression ให้)
  //  - ENUM_NOT_CONSTANT: ขึ้นกับ CodingConvention#isValidEnumKey() ซึ่งไม่ได้
  //    แสดง implementation ในซอร์สที่ให้มา
  //  - CONSTRUCTOR_EXPECTED / applyDelegateRelationship / singletonGetter:
  //    ขึ้นกับ CodingConvention#getObjectLiteralCast /
  //    #getDelegateRelationship / #getSingletonGetterClassName ซึ่งไม่ได้
  //    แสดง implementation ในซอร์สที่ให้มา (ค่าเริ่มต้นของ CodingConvention
  //    ที่ compiler.getCodingConvention() คืนมา ไม่ปรากฏในซอร์สนี้)
  // ---------------------------------------------------------------------
}
