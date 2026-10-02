package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.collect.ImmutableList;
import com.google.javascript.jscomp.Scope.Var;
// นำเข้าคลาสเป้าหมายอย่างชัดเจนตามข้อกำหนด (แม้อยู่ใน package เดียวกันแล้ว)
import com.google.javascript.jscomp.TypedScopeCreator;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.ObjectType;

import org.junit.Test;

/**
 * JUnit4 test suite for {@link TypedScopeCreator} (Defects4J Closure-171b).
 *
 * แนวทาง: ใช้ Compiler จริงในการ parse ซอร์ส JS เป็น AST แล้วเรียก
 * TypedScopeCreator#createScope(...) ตรง ๆ เพื่อตรวจสอบผลลัพธ์ของ Scope/Var/JSType
 * ที่ถูกสร้างขึ้น รวมถึง diagnostic ที่ถูก report ผ่าน compiler.getWarnings()/getErrors()
 */
public class TypedScopeCreatorTest {

  private Compiler compiler;
  private Node parsedRoot;
  private TypedScopeCreator creator;

  /** สร้าง global scope จาก JS source (externs ว่าง) */
  private Scope createGlobalScope(String js) {
    return createGlobalScope("", js);
  }

  /** สร้าง global scope จาก externs + JS source ที่กำหนด */
  private Scope createGlobalScope(String externs, String js) {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    // ตั้งค่า ES5 เพื่อให้ getter/setter ใน object literal (ใช้ในเทส enum) parse ได้
    // สมมติฐาน: enum ECMASCRIPT5 มีอยู่แล้วใน CompilerOptions.LanguageMode ณ commit นี้
    options.setLanguageIn(CompilerOptions.LanguageMode.ECMASCRIPT5);

    compiler.init(
        ImmutableList.of(SourceFile.fromCode("externs.js", externs)),
        ImmutableList.of(SourceFile.fromCode("input.js", js)),
        options);

    // parseInputs() ให้ Node ที่มีลูกสองตัวคือ externsRoot กับ jsRoot
    // ตรงกับที่ TypedScopeCreator#createScope คาดหวัง
    parsedRoot = compiler.parseInputs();
    assertNotNull("การ parse ควรสำเร็จ (ไม่มี fatal error)", parsedRoot);

    creator = new TypedScopeCreator(compiler);
    return creator.createScope(parsedRoot, null);
  }

  /** ค้นหา Node แรกที่ตรงกับ token type ที่ระบุแบบ pre-order DFS */
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

  private boolean hasDiagnostic(JSError[] errors, DiagnosticType type) {
    for (JSError e : errors) {
      if (e.getType() == type) {
        return true;
      }
    }
    return false;
  }

  // ---------------------------------------------------------------------
  // 1. Global scope / native types (createScope, createInitialScope)
  // ---------------------------------------------------------------------

  @Test
  public void testGlobalScopeIsCreatedAndIsGlobal() {
    Scope scope = createGlobalScope("");
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateInitialScopeDeclaresNativeFunctionAndPrototypeTypes() {
    Scope scope = createGlobalScope("");
    // declareNativeFunctionType ประกาศทั้งชื่อ instance type และ prototype
    assertTrue(scope.isDeclared("Object", false));
    assertTrue(scope.isDeclared("Object.prototype", false));
    assertTrue(scope.isDeclared("Array", false));
    assertTrue(scope.isDeclared("Function", false));
    assertTrue(scope.isDeclared("Date", false));
    assertTrue(scope.isDeclared("RegExp", false));
    assertTrue(scope.isDeclared("Error", false));
  }

  @Test
  public void testCreateInitialScopeDeclaresValueTypes() {
    Scope scope = createGlobalScope("");
    assertTrue(scope.isDeclared("undefined", false));
    assertTrue(scope.isDeclared("ActiveXObject", false));
  }

  // ---------------------------------------------------------------------
  // 2. defineVar / defineName — boundary: มี/ไม่มี @type, single/multi child
  // ---------------------------------------------------------------------

  @Test
  public void testVarWithExplicitTypeAnnotationIsDeclared() {
    Scope scope = createGlobalScope("/** @type {string} */ var s = 'hi';");
    Var s = scope.getVar("s");
    assertNotNull(s);
    assertNotNull(s.getType());
    assertEquals("string", s.getType().toString());
    assertFalse(s.isTypeInferred());
  }

  @Test
  public void testVarWithoutAnnotationIsInferred() {
    // ไม่มี JSDoc -> TypedScopeCreator ไม่กำหนด type ที่ชัดเจน (ปล่อยให้ TypeInference
    // pass อื่นทำหน้าที่ต่อ) จึง type อาจเป็น null หรือ unknown แล้วแต่การ resolve
    // ของ Scope ภายใน (ไม่มีรายละเอียดใน source ที่ให้มา) — assert แบบยืดหยุ่น
    Scope scope = createGlobalScope("var x = 1;");
    Var x = scope.getVar("x");
    assertNotNull(x);
    assertTrue(x.isTypeInferred());
    assertTrue(x.getType() == null || x.getType().isUnknownType());
  }

  @Test
  public void testMultipleVarDeclarationWithJsDocTriggersWarning() {
    Scope scope = createGlobalScope(
        "/** @type {number} */ var x = 1, y = 2;");
    assertNotNull(scope.getVar("x"));
    assertNotNull(scope.getVar("y"));
    assertTrue(hasDiagnostic(compiler.getWarnings(), TypeCheck.MULTIPLE_VAR_DEF));
  }

  @Test
  public void testMultipleVarDeclarationWithoutJsDocNoWarning() {
    Scope scope = createGlobalScope("var x = 1, y = 2;");
    assertNotNull(scope.getVar("x"));
    assertNotNull(scope.getVar("y"));
    assertFalse(hasDiagnostic(compiler.getWarnings(), TypeCheck.MULTIPLE_VAR_DEF));
  }

  // ---------------------------------------------------------------------
  // 3. defineFunctionLiteral / shouldUseFunctionLiteralType branches
  // ---------------------------------------------------------------------

  @Test
  public void testHoistedFunctionDeclarationIsDeclaredFunctionType() {
    Scope scope = createGlobalScope("function f() {} f();");
    Var f = scope.getVar("f");
    assertNotNull(f);
    assertNotNull(f.getType());
    assertTrue(f.getType().isFunctionType());
    assertFalse(f.isTypeInferred());
  }

  @Test
  public void testFunctionExpressionAssignedToVarIsDeclaredType() {
    // scope.isGlobal() == true -> shouldUseFunctionLiteralType คืนค่า true เสมอ
    Scope scope = createGlobalScope("var g = function() {};");
    Var g = scope.getVar("g");
    assertNotNull(g);
    assertNotNull(g.getType());
    assertTrue(g.getType().isFunctionType());
    assertFalse(g.isTypeInferred());
  }

  @Test
  public void testObjectLiteralFunctionValueIsInferred() {
    // lValue เป็น object-literal key -> shouldUseFunctionLiteralType คืน false
    // ทำให้ property นี้ถูกประกาศแบบ inferred
    Scope scope = createGlobalScope("var obj = { foo: function() {} };");
    Var foo = scope.getVar("obj.foo");
    assertNotNull(foo);
    assertTrue(foo.isTypeInferred());
  }

  // ---------------------------------------------------------------------
  // 4. defineCatch
  // ---------------------------------------------------------------------

  @Test
  public void testCatchParameterIsDeclaredAndInferred() {
    Scope scope = createGlobalScope("try { throw 1; } catch (err) {}");
    Var err = scope.getVar("err");
    assertNotNull(err);
    assertTrue(err.isTypeInferred());
  }

  // ---------------------------------------------------------------------
  // 5. Enum handling (createEnumTypeFromNodes, ENUM_INITIALIZER, ENUM_NOT_CONSTANT)
  // ---------------------------------------------------------------------

  @Test
  public void testEnumDeclarationCreatesEnumType() {
    Scope scope = createGlobalScope(
        "/** @enum {number} */ var Color = {RED: 1, GREEN: 2};");
    Var color = scope.getVar("Color");
    assertNotNull(color);
    assertNotNull(color.getType());
    assertTrue(color.getType().isEnumType());
    assertFalse(hasDiagnostic(
        compiler.getWarnings(), TypedScopeCreator.ENUM_INITIALIZER));
  }

  @Test
  public void testEnumWithoutInitializerTriggersEnumInitializerWarning() {
    createGlobalScope("/** @enum {number} */ var E;");
    assertTrue(hasDiagnostic(
        compiler.getWarnings(), TypedScopeCreator.ENUM_INITIALIZER));
  }

  @Test
  public void testEnumWithGetterKeyTriggersEnumNotConstantWarning() {
    createGlobalScope(
        "/** @enum {number} */ var E = { get FOO() { return 1; } };");
    assertTrue(hasDiagnostic(compiler.getWarnings(), TypeCheck.ENUM_NOT_CONSTANT));
  }

  // ---------------------------------------------------------------------
  // 6. Constructor / Interface without initializer
  // ---------------------------------------------------------------------

  @Test
  public void testConstructorWithoutInitializerTriggersCtorInitializerWarning() {
    createGlobalScope("/** @constructor */ var Foo;");
    assertTrue(hasDiagnostic(
        compiler.getWarnings(), TypedScopeCreator.CTOR_INITIALIZER));
  }

  @Test
  public void testInterfaceWithoutInitializerTriggersIfaceInitializerWarning() {
    createGlobalScope("/** @interface */ var Foo;");
    assertTrue(hasDiagnostic(
        compiler.getWarnings(), TypedScopeCreator.IFACE_INITIALIZER));
  }

  // ---------------------------------------------------------------------
  // 7. @lends handling (UNKNOWN_LENDS, LENDS_ON_NON_OBJECT, success path)
  // ---------------------------------------------------------------------

  @Test
  public void testLendsOnUndeclaredNameTriggersUnknownLends() {
    createGlobalScope("/** @lends {NotDeclared} */ ({x: 1});");
    assertTrue(hasDiagnostic(
        compiler.getWarnings(), TypedScopeCreator.UNKNOWN_LENDS));
  }

  @Test
  public void testLendsOnNonObjectTypeTriggersLendsOnNonObject() {
    // ต้องใช้ @type ชัดเจนเพื่อให้ num.getType() เป็น NUMBER_TYPE จริง (ไม่ใช่ null/unknown)
    createGlobalScope(
        "/** @type {number} */ var num = 1;"
        + "/** @lends {num} */ ({y: 2});");
    assertTrue(hasDiagnostic(
        compiler.getWarnings(), TypedScopeCreator.LENDS_ON_NON_OBJECT));
  }

  @Test
  public void testLendsOnValidPrototypeNoWarning() {
    createGlobalScope(
        "/** @constructor */ function Foo() {}"
        + "/** @lends {Foo.prototype} */ ({bar: 1});");
    assertFalse(hasDiagnostic(
        compiler.getWarnings(), TypedScopeCreator.UNKNOWN_LENDS));
    assertFalse(hasDiagnostic(
        compiler.getWarnings(), TypedScopeCreator.LENDS_ON_NON_OBJECT));
  }

  // ---------------------------------------------------------------------
  // 8. Stub declarations (resolveStubDeclarations)
  // ---------------------------------------------------------------------

  @Test
  public void testStubPropertyDeclarationResolvedAsUnknownType() {
    Scope scope = createGlobalScope("var A = {}; A.B = {}; A.B.C;");
    assertTrue(scope.isDeclared("A.B.C", false));
    Var abc = scope.getVar("A.B.C");
    assertTrue(abc.isTypeInferred());
    assertSame(
        compiler.getTypeRegistry().getNativeType(JSTypeNative.UNKNOWN_TYPE),
        abc.getType());
  }

  // ---------------------------------------------------------------------
  // 9. attachLiteralTypes branches (NULL/VOID/BOOLEAN/STRING/NUMBER/REGEXP)
  // ---------------------------------------------------------------------

  @Test
  public void testAttachLiteralTypesForPrimitives() {
    createGlobalScope(
        "var a = null;"
        + "var b = void 0;"
        + "var c = true;"
        + "var d = false;"
        + "var e = 'str';"
        + "var f = 123;"
        + "var g = /re/;");

    JSTypeRegistry registry = compiler.getTypeRegistry();

    Node nullNode = findFirstNodeOfType(parsedRoot, Token.NULL);
    assertNotNull(nullNode);
    assertSame(registry.getNativeType(JSTypeNative.NULL_TYPE), nullNode.getJSType());

    Node voidNode = findFirstNodeOfType(parsedRoot, Token.VOID);
    assertNotNull(voidNode);
    assertSame(registry.getNativeType(JSTypeNative.VOID_TYPE), voidNode.getJSType());

    Node trueNode = findFirstNodeOfType(parsedRoot, Token.TRUE);
    assertNotNull(trueNode);
    assertSame(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), trueNode.getJSType());

    Node falseNode = findFirstNodeOfType(parsedRoot, Token.FALSE);
    assertNotNull(falseNode);
    assertSame(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), falseNode.getJSType());

    Node stringNode = findFirstNodeOfType(parsedRoot, Token.STRING);
    assertNotNull(stringNode);
    assertSame(registry.getNativeType(JSTypeNative.STRING_TYPE), stringNode.getJSType());

    Node numberNode = findFirstNodeOfType(parsedRoot, Token.NUMBER);
    assertNotNull(numberNode);
    assertSame(registry.getNativeType(JSTypeNative.NUMBER_TYPE), numberNode.getJSType());

    Node regexpNode = findFirstNodeOfType(parsedRoot, Token.REGEXP);
    assertNotNull(regexpNode);
    assertSame(registry.getNativeType(JSTypeNative.REGEXP_TYPE), regexpNode.getJSType());
  }

  // ---------------------------------------------------------------------
  // 10. shouldDeclareOnGlobalThis branch
  // ---------------------------------------------------------------------

  @Test
  public void testGlobalVarDeclaredAsPropertyOnGlobalThis() {
    createGlobalScope("var GlobalVar = 5;");
    ObjectType globalThis =
        compiler.getTypeRegistry().getNativeObjectType(JSTypeNative.GLOBAL_THIS);
    assertNotNull(globalThis);
    assertTrue(globalThis.hasOwnProperty("GlobalVar"));
  }

  // ---------------------------------------------------------------------
  // 11. LocalScopeBuilder (parent != null path)
  // ---------------------------------------------------------------------

  @Test
  public void testLocalScopeBuilderDeclaresParametersAndLocals() {
    Scope globalScope = createGlobalScope(
        "function f(a, b) { var c = 1; return a; }");
    Node functionNode = findFirstNodeOfType(parsedRoot, Token.FUNCTION);
    assertNotNull(functionNode);

    // ใช้ creator ตัวเดียวกับที่สร้าง global scope เพราะ functionAnalysisResults
    // (state ภายใน instance) ถูกเก็บไว้จากการ createScope ครั้งแรกแล้ว
    Scope localScope = creator.createScope(functionNode, globalScope);
    assertNotNull(localScope);
    assertFalse(localScope.isGlobal());
    assertTrue(localScope.isDeclared("a", false));
    assertTrue(localScope.isDeclared("b", false));
    assertTrue(localScope.isDeclared("c", false));
  }

  // ---------------------------------------------------------------------
  // 12. "prototype" special-case branch ใน maybeDeclareQualifiedName
  // ---------------------------------------------------------------------

  @Test
  public void testPrototypeAssignedObjectLiteralDoesNotThrow() {
    Scope scope = createGlobalScope(
        "/** @constructor */ function F() {} "
        + "F.prototype = {bar: function() {}};");
    assertNotNull(scope.getVar("F"));
    // ตามการวิเคราะห์ซอร์ส: เมื่อ F ไม่มี @extends ชัดเจนและถูก assign เป็น object
    // literal โดยไม่มี JSDoc, "F.prototype" var เดิมจะถูก undeclare และไม่ถูก
    // ประกาศใหม่ (เพราะ isQualifiedNameInferred คืน true ในกรณีนี้)
    // -- ถ้าพฤติกรรมจริงต่างจากนี้ ถือเป็นจุดที่ควรตรวจสอบเพิ่มเติมด้วย debugger
    assertFalse(scope.isDeclared("F.prototype", false));
  }

  // ---------------------------------------------------------------------
  // 13. Malformed / not-guessed behaviors (คอมเมนต์กำกับตามข้อกำหนด)
  // ---------------------------------------------------------------------

  /*
   * หมายเหตุ: ไม่ได้เขียนเทสสำหรับ MALFORMED_TYPEDEF และ CONSTRUCTOR_EXPECTED เพราะ
   * ทั้งสอง diagnostic นี้ขึ้นกับพฤติกรรมภายในของ JSTypeExpression#evaluate() และ
   * CodingConvention#getObjectLiteralCast() ตามลำดับ ซึ่งไม่มีรายละเอียดพอใน source
   * ที่ให้มาให้ยืนยันได้ว่าจะ trigger ด้วย input แบบใดแน่นอน จึงไม่ทดสอบเพื่อไม่เดา
   * behavior เกินขอบเขตของโค้ดที่ตรวจสอบได้จริง
   *
   * เช่นเดียวกัน ไม่ได้เขียนเทสสำหรับ patchGlobalScope() เนื่องจากต้องอาศัย
   * internal state (functionAnalysisResults, Var#getInputName ตรงกับ scriptName)
   * ที่ประกอบกันซับซ้อนเกินกว่าจะยืนยัน behavior จาก source ที่ให้มาได้อย่างมั่นใจ
   */

  @Test
  public void testNoCrashOnEmptyProgram() {
    Scope scope = createGlobalScope("", "");
    assertNotNull(scope);
    assertEquals(0, compiler.getErrors().length);
  }
}
