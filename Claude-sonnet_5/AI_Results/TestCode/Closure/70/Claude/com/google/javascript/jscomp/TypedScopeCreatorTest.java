package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.jscomp.TypedScopeCreator; // คลาสเป้าหมาย (อยู่ package เดียวกัน แต่ import ตามข้อกำหนด)
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.ObjectType;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests สำหรับ {@link TypedScopeCreator} (Defects4J Closure-70b)
 *
 * ดูคอมเมนต์ระดับไฟล์ (คำอธิบายก่อนโค้ด) สำหรับข้อสมมติฐานเกี่ยวกับ API
 * ของ Compiler ที่ไม่ได้แสดงในซอร์สของ TypedScopeCreator เอง
 */
public class TypedScopeCreatorTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    // ASSUMPTION: initOptions() เตรียม TypeRegistry/TypeValidator ก่อนใช้งาน
    compiler.initOptions(options);
  }

  // ------------------------------------------------------------------
  // Helpers
  // ------------------------------------------------------------------

  /** สร้าง global scope (parent == null) จาก JS source เต็มรูปแบบผ่าน public API */
  private Scope createGlobalScope(String js) {
    Node root = compiler.parseTestCode(js); // ASSUMPTION: ดู class javadoc
    return new TypedScopeCreator(compiler).createScope(root, null);
  }

  /** คืน DiagnosticType ของ warning ตัวแรกที่ compiler รายงาน */
  private DiagnosticType firstWarningType() {
    JSError[] warnings = compiler.getWarnings(); // ASSUMPTION: ดู class javadoc
    assertTrue("expected at least one warning but found none", warnings.length > 0);
    return warnings[0].getType();
  }

  /** ค้นหา Node ตัวแรกที่ตรงกับ token type แบบ DFS */
  private Node findFirstNodeOfType(Node n, int type) {
    if (n.getType() == type) {
      return n;
    }
    for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
      Node result = findFirstNodeOfType(c, type);
      if (result != null) {
        return result;
      }
    }
    return null;
  }

  /** จาก global scope, หา FUNCTION node ของฟังก์ชันที่ชื่อ name */
  private Node getFunctionNode(Scope globalScope, String name) {
    Var fnVar = globalScope.getVar(name);
    assertNotNull(fnVar);
    Node nameNode = fnVar.getNameNode();
    assertNotNull(nameNode);
    return nameNode.getParent();
  }

  // ------------------------------------------------------------------
  // createInitialScope() : native types
  // ------------------------------------------------------------------

  @Test
  public void testCreateInitialScope_declaresCommonNativeConstructors() {
    Scope scope = createGlobalScope("");
    assertNotNull(scope.getVar("Object"));
    assertNotNull(scope.getVar("Array"));
    assertNotNull(scope.getVar("Date"));
    assertNotNull(scope.getVar("Function"));
  }

  @Test
  public void testCreateInitialScope_declaresUndefinedTypedefAndActiveXObject() {
    Scope scope = createGlobalScope("");
    assertNotNull(scope.getVar("undefined"));
    assertNotNull(scope.getVar("goog.typedef"));
    assertNotNull(scope.getVar("ActiveXObject"));
  }

  @Test
  public void testCreateScope_emptyProgram_onlyNativeTypesPresent() {
    // boundary: empty input string
    Scope scope = createGlobalScope("");
    assertNotNull(scope);
    assertNotNull(scope.getVar("Object"));
  }

  @Test(expected = RuntimeException.class)
  public void testCreateScope_nullRoot_throwsException() {
    // ค่า null: root ต้องไม่เป็น null (คาดว่าจะ NPE ภายใน NodeTraversal/Scope ctor)
    new TypedScopeCreator(compiler).createScope(null, null);
  }

  @Test
  public void testCreateScope_malformedSyntax_doesNotThrow() {
    // อินพุตผิดรูปแบบ: ต้องมั่นใจว่า TypedScopeCreator เองไม่ throw exception
    // ที่ไม่ถูกจัดการเมื่อ AST มาจาก error-recovery ของ parser
    Node root = compiler.parseTestCode("var x = ;");
    Scope scope = new TypedScopeCreator(compiler).createScope(root, null);
    assertNotNull(scope);
  }

  // ------------------------------------------------------------------
  // defineVar()/defineName(): hasMoreThanOneChild + info branches
  // ------------------------------------------------------------------

  @Test
  public void testVarWithoutInitializer_isInferredType() {
    Scope scope = createGlobalScope("var x;");
    Var x = scope.getVar("x");
    assertNotNull(x);
    assertTrue(x.isTypeInferred());
  }

  @Test
  public void testMultipleVarDeclWithJSDocOnVar_reportsMultipleVarDefWarning() {
    createGlobalScope("/** @type {number} */ var a = 1, b = 2;");
    assertEquals(TypeCheck.MULTIPLE_VAR_DEF, firstWarningType());
  }

  @Test
  public void testMultipleVarDeclWithoutJSDoc_noWarning() {
    createGlobalScope("var a = 1, b = 2;");
    assertEquals(0, compiler.getWarnings().length);
  }

  @Test
  public void testMultipleVarDeclEachOwnJSDoc_declaresEachType() {
    Scope scope = createGlobalScope(
        "var /** @type {number} */ a = 1, /** @type {string} */ b = 'x';");
    assertEquals(0, compiler.getWarnings().length);
    assertEquals("number", scope.getVar("a").getType().toString());
    assertEquals("string", scope.getVar("b").getType().toString());
  }

  @Test
  public void testVarWithTypeAnnotationOnVarKeyword_declaredType() {
    Scope scope = createGlobalScope("/** @type {string} */ var s = 'hi';");
    Var s = scope.getVar("s");
    assertFalse(s.isTypeInferred());
    assertEquals("string", s.getType().toString());
  }

  @Test
  public void testVarWithTypeAnnotationOnNameNode_declaredType() {
    Scope scope = createGlobalScope("var /** @type {string} */ s = 'hi';");
    Var s = scope.getVar("s");
    assertFalse(s.isTypeInferred());
    assertEquals("string", s.getType().toString());
  }

  // ------------------------------------------------------------------
  // defineCatch()
  // ------------------------------------------------------------------

  @Test
  public void testCatchParameter_isDeclaredAndInferred() {
    Scope scope = createGlobalScope("try { throw 1; } catch (e) { var y = e; }");
    Var e = scope.getVar("e");
    assertNotNull(e);
    assertTrue(e.isTypeInferred());
  }

  // ------------------------------------------------------------------
  // defineFunctionLiteral() / shouldUseFunctionLiteralType()
  // ------------------------------------------------------------------

  @Test
  public void testFunctionDeclaration_declaredNotInferred() {
    Scope scope = createGlobalScope("function Foo() {}");
    Var foo = scope.getVar("Foo");
    assertNotNull(foo);
    assertFalse(foo.isTypeInferred());
    assertTrue(foo.getType() instanceof FunctionType);
  }

  // ------------------------------------------------------------------
  // defineSlot(): constructor/interface initializer checks
  // ------------------------------------------------------------------

  @Test
  public void testConstructorWithoutInitializer_reportsCtorInitializerWarning() {
    createGlobalScope("/** @constructor */ var Foo;");
    assertEquals(TypedScopeCreator.CTOR_INITIALIZER, firstWarningType());
  }

  @Test
  public void testInterfaceWithoutInitializer_reportsIfaceInitializerWarning() {
    createGlobalScope("/** @interface */ var Foo;");
    assertEquals(TypedScopeCreator.IFACE_INITIALIZER, firstWarningType());
  }

  @Test
  public void testConstructorWithInitializer_noCtorInitializerWarning() {
    createGlobalScope("/** @constructor */ function Foo() {}");
    assertEquals(0, compiler.getWarnings().length);
  }

  // ------------------------------------------------------------------
  // defineSlot(): enum initializer check
  // ------------------------------------------------------------------

  @Test
  public void testEnumWithoutInitializer_reportsEnumInitializerWarning() {
    createGlobalScope("/** @enum {number} */ var Foo;");
    assertEquals(TypedScopeCreator.ENUM_INITIALIZER, firstWarningType());
  }

  @Test
  public void testEnumWithObjectLiteralInitializer_noWarning() {
    createGlobalScope("/** @enum {number} */ var Foo = {A:1, B:2};");
    assertEquals(0, compiler.getWarnings().length);
  }

  // ------------------------------------------------------------------
  // createEnumTypeFromNodes(): key iteration branches
  // ------------------------------------------------------------------

  @Test
  public void testEnumDuplicateKey_reportsEnumDupWarning() {
    createGlobalScope("/** @enum {number} */ var Foo = {A:1, A:2};");
    assertEquals(TypeCheck.ENUM_DUP, firstWarningType());
  }

  @Test
  public void testEnumGetterKey_reportsEnumNotConstantWarning() {
    // ASSUMPTION: parser รองรับ ES5 getter ในอ็อบเจกต์ลิเทอรัล และ
    // NodeUtil.getStringValue คืน null สำหรับ GET/SET ตามคอมเมนต์ในซอร์สเดิม
    createGlobalScope("/** @enum {number} */ var Foo = { get A() { return 1; } };");
    assertEquals(TypeCheck.ENUM_NOT_CONSTANT, firstWarningType());
  }

  // ------------------------------------------------------------------
  // defineObjectLiteral(): @lends branches
  // ------------------------------------------------------------------

  @Test
  public void testObjectLiteralLends_unknownVariable_reportsUnknownLends() {
    createGlobalScope("var x = /** @lends {NotDeclared} */ ({});");
    assertEquals(TypedScopeCreator.UNKNOWN_LENDS, firstWarningType());
  }

  @Test
  public void testObjectLiteralLends_nonObjectType_reportsLendsOnNonObject() {
    createGlobalScope(
        "/** @type {number} */ var target = 1;"
        + "var x = /** @lends {target} */ ({});");
    assertEquals(TypedScopeCreator.LENDS_ON_NON_OBJECT, firstWarningType());
  }

  @Test
  public void testObjectLiteralLends_validPrototypeTarget_noWarning() {
    createGlobalScope(
        "/** @constructor */ function Foo() {}"
        + "var x = /** @lends {Foo.prototype} */ ({ bar: 1 });");
    assertEquals(0, compiler.getWarnings().length);
  }

  // ------------------------------------------------------------------
  // maybeDeclareQualifiedName(): stub declaration (valueType == null)
  // ------------------------------------------------------------------

  @Test
  public void testStubPropertyDeclaration_resolvesToUnknownType() {
    Scope scope = createGlobalScope(
        "/** @constructor */ function Foo() {} Foo.prototype.bar;");
    Var bar = scope.getVar("Foo.prototype.bar");
    assertNotNull(bar);
    assertTrue(bar.isTypeInferred());
  }

  // ------------------------------------------------------------------
  // GlobalScopeBuilder.checkForTypedef()
  // ------------------------------------------------------------------

  @Test
  public void testTypedefDeclaration_registersRealType() {
    createGlobalScope("/** @typedef {number} */ var MyNum;");
    JSType numberType =
        compiler.getTypeRegistry().getNativeType(JSTypeNative.NUMBER_TYPE);
    assertEquals(numberType, compiler.getTypeRegistry().getType("MyNum"));
  }

  // ------------------------------------------------------------------
  // maybeDeclareQualifiedName(): declared property via ASSIGN + @type
  // ------------------------------------------------------------------

  @Test
  public void testQualifiedNamePropertyAssignmentWithTypeAnnotation_declaresProperty() {
    Scope scope = createGlobalScope(
        "/** @constructor */ function Foo() {}"
        + "/** @type {number} */ Foo.bar = 1;");
    Var bar = scope.getVar("Foo.bar");
    assertNotNull(bar);
    assertFalse(bar.isTypeInferred());
    assertEquals("number", bar.getType().toString());
  }

  // ------------------------------------------------------------------
  // maybeDeclareQualifiedName(): "prototype" special-case, declared (not
  // inferred) -> ignore reassignment (early return)
  // ------------------------------------------------------------------

  @Test
  public void testPrototypeReassignmentWithDeclaredSupertype_isIgnored() {
    // อนุมานจากการไล่โค้ดใน maybeDeclareQualifiedName: เมื่อ
    // qVar.isTypeInferred() == false (มี @extends ชัดเจน) จะ return ก่อน
    // undeclare/redeclare ทำให้การ assign ใหม่ถูกเมิน แต่ var เดิมยังคงอยู่
    Scope scope = createGlobalScope(
        "/** @constructor */ function Base() {}"
        + "/** @constructor @extends {Base} */ function Sub() {}"
        + "Sub.prototype = {};");
    Var proto = scope.getVar("Sub.prototype");
    assertNotNull(proto);
  }

  // ------------------------------------------------------------------
  // attachLiteralTypes(): literal token branches
  // ------------------------------------------------------------------

  @Test
  public void testLiteralTypesAreAttachedToAstNodes() {
    Node root = compiler.parseTestCode(
        "null; void 0; 'str'; 123; true; false; /abc/;");
    new TypedScopeCreator(compiler).createScope(root, null);

    assertNotNull(findFirstNodeOfType(root, Token.NULL).getJSType());
    assertNotNull(findFirstNodeOfType(root, Token.VOID).getJSType());
    assertNotNull(findFirstNodeOfType(root, Token.STRING).getJSType());
    assertNotNull(findFirstNodeOfType(root, Token.NUMBER).getJSType());
    assertNotNull(findFirstNodeOfType(root, Token.TRUE).getJSType());
    assertNotNull(findFirstNodeOfType(root, Token.FALSE).getJSType());
    assertNotNull(findFirstNodeOfType(root, Token.REGEXP).getJSType());
  }

  @Test
  public void testObjectLiteralKeyType_isNotGenericStringType() {
    // ตรวจสาขา: Token.STRING ที่เป็น object-lit key ต้อง "ไม่" ได้ค่า
    // STRING_TYPE แบบทั่วไปจาก attachLiteralTypes แต่ได้ type ตาม value จริง
    Node root = compiler.parseTestCode("var o = {'key': 1};");
    new TypedScopeCreator(compiler).createScope(root, null);
    Node keyNode = findFirstNodeOfType(root, Token.STRING);
    assertNotNull(keyNode);
    assertNotNull(keyNode.getJSType());
    assertEquals("number", keyNode.getJSType().toString());
  }

  // ------------------------------------------------------------------
  // LocalScopeBuilder / createScope(parent != null)
  // ------------------------------------------------------------------

  @Test
  public void testLocalScope_declaresLocalVariable() {
    Scope global = createGlobalScope("function foo() { var c = 1; }");
    Node fnNode = getFunctionNode(global, "foo");
    Scope local = new TypedScopeCreator(compiler).createScope(fnNode, global);
    assertNotNull(local.getVar("c"));
    assertEquals(global, local.getGlobalScope());
  }

  @Test
  public void testLocalScope_qualifiedPropertyAssignmentRootedInGlobalScope_declaredInGlobalScope() {
    Scope global = createGlobalScope(
        "/** @constructor */ function Foo() {}"
        + "function bar() { Foo.baz = 1; }");
    Node fnNode = getFunctionNode(global, "bar");
    new TypedScopeCreator(compiler).createScope(fnNode, global);
    // isQnameRootedInGlobalScope(): ต้องประกาศ Foo.baz ไว้ที่ global scope
    // แม้ assignment จะเกิดขึ้นภายใน local scope ของ bar()
    assertNotNull(global.getVar("Foo.baz"));
  }

  // ------------------------------------------------------------------
  // createScope(): CollectProperties loop (@this-typed methods)
  // ------------------------------------------------------------------

  @Test
  public void testCollectProperties_thisAssignmentInMethod_declaresPropertyOnInstanceType() {
    Scope scope = createGlobalScope(
        "/** @constructor */ function Foo() {}"
        + "Foo.prototype.setup = function() {"
        + "  /** @type {string} */"
        + "  this.bar = 'x';"
        + "};");
    Var foo = scope.getVar("Foo");
    assertNotNull(foo);
    FunctionType fooType = (FunctionType) foo.getType();
    ObjectType instanceType = fooType.getInstanceType();
    JSType barType = instanceType.getPropertyType("bar");
    assertNotNull(barType);
    assertEquals("string", barType.toString());
  }
}
