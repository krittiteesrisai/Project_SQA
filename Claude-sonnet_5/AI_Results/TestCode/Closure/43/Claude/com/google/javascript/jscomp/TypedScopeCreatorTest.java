package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.ImmutableList;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * ชุดทดสอบสำหรับ {@link TypedScopeCreator} (Closure-43b)
 *
 * หมายเหตุทั่วไป (สำคัญ):
 * - เมธอด parseRoot() ใช้ pattern compiler.init(externs, inputs, options);
 *   compiler.parse(); compiler.getRoot(); ซึ่งเป็น pattern มาตรฐานที่ใช้กัน
 *   ใน test suite ของ Closure Compiler แต่ไม่ได้อยู่ใน source ของ
 *   TypedScopeCreator ที่ให้มาโดยตรง จึงกำกับไว้ว่าเป็นสมมติฐาน (assumption)
 * - หลาย test case พึ่งพาพฤติกรรมของ FunctionTypeBuilder / CodingConvention /
 *   JSTypeRegistry ซึ่งไม่ได้แสดงซอร์สโค้ดมาด้วย จึงกำกับคอมเมนต์ไว้ที่
 *   test นั้น ๆ ว่าเป็นสมมติฐานพื้นฐานของระบบ type ของ Closure Compiler
 */
public class TypedScopeCreatorTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  // ---------- Helpers ----------

  /**
   * สมมติฐาน: compiler.init()/parse()/getRoot() ให้ root node ที่มีลูกเป็น
   * externsRoot (getFirstChild) และ jsRoot (getLastChild) ตามที่
   * TypedScopeCreator#createScope ใช้งาน (root.getFirstChild()/getLastChild())
   */
  private Node parseRoot(String js) {
    CompilerOptions options = new CompilerOptions();
    List<SourceFile> externs =
        ImmutableList.of(SourceFile.fromCode("externs.js", ""));
    List<SourceFile> inputs =
        ImmutableList.of(SourceFile.fromCode("input.js", js));
    compiler.init(externs, inputs, options);
    compiler.parse();
    assertEquals("Unexpected parse errors", 0, compiler.getErrors().length);
    return compiler.getRoot();
  }

  private Scope createGlobalScope(String js) {
    Node root = parseRoot(js);
    return new TypedScopeCreator(compiler).createScope(root, null);
  }

  /** ค้นหา FUNCTION node แรกในทรีที่ชื่อ (nameNode) ตรงกับ name ที่ระบุ */
  private Node findFunction(Node n, String name) {
    if (n.isFunction()) {
      Node nameNode = n.getFirstChild();
      if (name.equals(nameNode.getString())) {
        return n;
      }
    }
    for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
      Node result = findFunction(c, name);
      if (result != null) {
        return result;
      }
    }
    return null;
  }

  private boolean hasWarningOfType(DiagnosticType type) {
    for (JSError w : compiler.getWarnings()) {
      if (w.getType().equals(type)) {
        return true;
      }
    }
    return false;
  }

  // ---------- createInitialScope ----------

  @Test
  public void testCreateInitialScope_declaresNativeTypes() {
    Node root = parseRoot("");
    Scope scope = new TypedScopeCreator(compiler).createInitialScope(root);

    assertTrue(scope.isGlobal());
    assertNotNull(scope.getVar("Object"));
    assertNotNull(scope.getVar("Object.prototype"));
    assertNotNull(scope.getVar("Array"));
    assertNotNull(scope.getVar("Array.prototype"));
    assertNotNull(scope.getVar("Date"));
    assertNotNull(scope.getVar("Function"));
    assertNotNull(scope.getVar("Boolean"));
    assertNotNull(scope.getVar("Number"));
    assertNotNull(scope.getVar("String"));
    assertNotNull(scope.getVar("RegExp"));
    assertNotNull(scope.getVar("Error"));
    assertNotNull(scope.getVar("undefined"));
    assertNotNull(scope.getVar("ActiveXObject"));
  }

  // ---------- patchGlobalScope (Precondition branches) ----------

  @Test(expected = IllegalStateException.class)
  public void testPatchGlobalScope_throwsIfScriptRootIsNotScript() {
    Node notAScript = new Node(Token.BLOCK);
    // checkState(scriptRoot.isScript()) ควร throw ก่อนถึงบรรทัดอื่น ๆ
    new TypedScopeCreator(compiler).patchGlobalScope(null, notAScript);
  }

  @Test(expected = NullPointerException.class)
  public void testPatchGlobalScope_throwsIfGlobalScopeIsNull() {
    Node script = new Node(Token.SCRIPT);
    new TypedScopeCreator(compiler).patchGlobalScope(null, script);
  }

  @Test(expected = IllegalStateException.class)
  public void testPatchGlobalScope_throwsIfScopeIsNotGlobal() {
    Node root = parseRoot("function f(a) { var y = 1; }");
    Scope globalScope = new TypedScopeCreator(compiler).createScope(root, null);
    Node functionNode = findFunction(root, "f");
    Scope localScope =
        new TypedScopeCreator(compiler).createScope(functionNode, globalScope);

    Node script = new Node(Token.SCRIPT);
    new TypedScopeCreator(compiler).patchGlobalScope(localScope, script);
  }

  // ---------- Empty / boundary ----------

  @Test
  public void testEmptyScript_globalScopeIsGlobalAndHasNoErrors() {
    Scope scope = createGlobalScope("");
    assertTrue(scope.isGlobal());
    assertEquals(0, compiler.getErrors().length);
  }

  // ---------- VAR declarations ----------

  @Test
  public void testSimpleVarDeclaration_isInferred() {
    Scope scope = createGlobalScope("var x = 3;");
    Var x = scope.getVar("x");
    assertNotNull(x);
    assertTrue(x.isTypeInferred());
  }

  @Test
  public void testMultipleVarDeclarationsWithJsDoc_reportsWarning() {
    createGlobalScope("/** @type {number} */ var a = 1, b = 2;");
    assertTrue(hasWarningOfType(TypeCheck.MULTIPLE_VAR_DEF));
  }

  @Test
  public void testMultipleVarDeclarationsWithoutJsDoc_noWarning() {
    createGlobalScope("var a = 1, b = 2;");
    assertFalse(hasWarningOfType(TypeCheck.MULTIPLE_VAR_DEF));
  }

  // ---------- CATCH ----------

  @Test
  public void testCatchParameter_isInferredAndDeclared() {
    Scope scope = createGlobalScope("try { } catch (e) { }");
    Var e = scope.getVar("e");
    assertNotNull(e);
    assertTrue(e.isTypeInferred());
  }

  // ---------- FUNCTION declaration ----------

  @Test
  public void testFunctionDeclaration_isDeclaredFunctionType() {
    Scope scope = createGlobalScope("function f(a, b) {}");
    Var f = scope.getVar("f");
    assertNotNull(f);
    assertFalse(f.isTypeInferred());
    JSType type = f.getType();
    assertNotNull(type);
    assertTrue(type.isFunctionType());
  }

  @Test
  public void testConstructorFunctionDeclaration_declaresPrototypeDeclared() {
    Scope scope = createGlobalScope("/** @constructor */ function Foo() {}");
    Var foo = scope.getVar("Foo");
    assertNotNull(foo);
    FunctionType fooType = foo.getType().toMaybeFunctionType();
    assertNotNull(fooType);
    assertTrue(fooType.isConstructor());

    Var prototype = scope.getVar("Foo.prototype");
    assertNotNull(prototype);
    // สมมติฐาน: ไม่มี @extends -> superClassCtor คือ Object -> prototype "declared"
    assertFalse(prototype.isTypeInferred());
    assertFalse(hasWarningOfType(TypedScopeCreator.CTOR_INITIALIZER));
  }

  @Test
  public void testConstructorWithExplicitSuperType_prototypeIsInferred() {
    // สมมติฐาน: เมื่อมี @extends อย่างชัดเจน superClassCtor != Object's ctor
    // จึงทำให้ "Foo.prototype" ถูก declare แบบ inferred=true
    Scope scope = createGlobalScope(
        "/** @constructor */ function Base() {}\n"
            + "/** @constructor @extends {Base} */ function Foo() {}");
    Var prototype = scope.getVar("Foo.prototype");
    assertNotNull(prototype);
    assertTrue(prototype.isTypeInferred());
  }

  @Test
  public void testConstructorVarWithoutInitializer_reportsCtorInitializerWarning() {
    // หมายเหตุ/สมมติฐาน: อาศัยพฤติกรรมพื้นฐานของ FunctionTypeBuilder ว่า
    // @constructor -> FunctionType.isConstructor() == true (ไม่ได้อยู่ใน
    // source ของ TypedScopeCreator โดยตรง)
    createGlobalScope("/** @constructor */ var Foo;");
    assertTrue(hasWarningOfType(TypedScopeCreator.CTOR_INITIALIZER));
  }

  @Test
  public void testInterfaceVarWithoutInitializer_reportsIfaceInitializerWarning() {
    // เทียบกับเคสข้างบน แต่ทดสอบสาขา isInterface() -> IFACE_INITIALIZER
    createGlobalScope("/** @interface */ var Bar;");
    assertTrue(hasWarningOfType(TypedScopeCreator.IFACE_INITIALIZER));
  }

  // ---------- ENUM ----------

  @Test
  public void testEnumObjectLiteralInitializer_declaresEnumType() {
    Scope scope = createGlobalScope(
        "/** @enum {number} */ var Color = { RED: 0, GREEN: 1 };");
    Var color = scope.getVar("Color");
    assertNotNull(color);
    assertTrue(color.getType() instanceof EnumType);
    assertEquals(0, compiler.getWarnings().length);
    assertEquals(0, compiler.getErrors().length);
  }

  @Test
  public void testEnumNonObjectInitializer_reportsEnumInitializerWarning() {
    createGlobalScope("/** @enum {number} */ var E = 3;");
    assertTrue(hasWarningOfType(TypedScopeCreator.ENUM_INITIALIZER));
  }

  // ---------- @lends ----------

  @Test
  public void testLendsOnUndeclaredVariable_reportsUnknownLends() {
    createGlobalScope("/** @lends {DoesNotExist} */ ({ bar: 1 });");
    assertTrue(hasWarningOfType(TypedScopeCreator.UNKNOWN_LENDS));
  }

  @Test
  public void testLendsOnNonObjectType_reportsLendsOnNonObject() {
    createGlobalScope(
        "var Foo = 3;\n" + "/** @lends {Foo} */ ({ bar: 1 });");
    assertTrue(hasWarningOfType(TypedScopeCreator.LENDS_ON_NON_OBJECT));
  }

  @Test
  public void testLendsOnValidObjectType_noWarnings() {
    createGlobalScope(
        "var Foo = {};\n" + "/** @lends {Foo} */ ({ bar: 1 });");
    assertFalse(hasWarningOfType(TypedScopeCreator.UNKNOWN_LENDS));
    assertFalse(hasWarningOfType(TypedScopeCreator.LENDS_ON_NON_OBJECT));
  }

  // ---------- GETPROP stub declaration ----------

  @Test
  public void testStubGetPropDeclaration_resolvesToUnknownType() {
    Scope scope = createGlobalScope("Foo.bar;");
    Var v = scope.getVar("Foo.bar");
    assertNotNull(v);
    assertTrue(v.isTypeInferred());
  }

  // ---------- typedef ----------

  @Test
  public void testTypedefOnQualifiedName_declaresNoType() {
    Scope scope = createGlobalScope(
        "var ns = {};\n" + "/** @typedef {number} */ ns.T;");
    Var t = scope.getVar("ns.T");
    assertNotNull(t);
    assertFalse(t.isTypeInferred());
  }

  @Test
  public void testTypedefOnSimpleName_registersType() {
    createGlobalScope("/** @typedef {number} */ var T;");
    JSType t = compiler.getTypeRegistry().getType("T");
    assertNotNull(t);
  }

  // ---------- @const branches ----------

  @Test
  public void testConstWithLiteralValue_isDeclaredNotInferred() {
    Scope scope = createGlobalScope("/** @const */ var X = 5;");
    Var x = scope.getVar("X");
    assertNotNull(x);
    assertFalse(x.isTypeInferred());
  }

  @Test
  public void testConstOrIdiomMatchingNames_usesSecondClauseType() {
    Scope scope = createGlobalScope("/** @const */ var x = x || 5;");
    Var v = scope.getVar("x");
    assertNotNull(v);
    assertFalse(v.isTypeInferred());
  }

  @Test
  public void testConstOrIdiomNonMatchingNames_isInferred() {
    Scope scope = createGlobalScope("/** @const */ var x = y || 5;");
    Var v = scope.getVar("x");
    assertNotNull(v);
    assertTrue(v.isTypeInferred());
  }

  // ---------- Function literal assigned to var ----------

  @Test
  public void testFunctionExpressionAssignedGlobalVar_usesFunctionLiteralType() {
    Scope scope = createGlobalScope("var f = function() {};");
    Var f = scope.getVar("f");
    assertNotNull(f);
    assertFalse(f.isTypeInferred());
    assertTrue(f.getType().isFunctionType());
  }

  // ---------- LocalScopeBuilder ----------

  @Test
  public void testLocalScopeBuilder_declaresFunctionParameters() {
    Node root = parseRoot("function f(a, b) {}");
    Scope globalScope = new TypedScopeCreator(compiler).createScope(root, null);
    Node functionNode = findFunction(root, "f");
    assertNotNull(functionNode);

    Scope localScope =
        new TypedScopeCreator(compiler).createScope(functionNode, globalScope);
    assertFalse(localScope.isGlobal());
    assertNotNull(localScope.getVar("a"));
    assertNotNull(localScope.getVar("b"));
  }

  @Test
  public void testLocalScopeBuilder_bleedingFunctionName() {
    Node root = parseRoot("var g = function foo() { return foo; };");
    Scope globalScope = new TypedScopeCreator(compiler).createScope(root, null);
    Node functionNode = findFunction(root, "foo");
    assertNotNull(functionNode);

    Scope localScope =
        new TypedScopeCreator(compiler).createScope(functionNode, globalScope);
    Var foo = localScope.getVar("foo");
    assertNotNull(foo);
    assertFalse(foo.isTypeInferred());
  }
}
