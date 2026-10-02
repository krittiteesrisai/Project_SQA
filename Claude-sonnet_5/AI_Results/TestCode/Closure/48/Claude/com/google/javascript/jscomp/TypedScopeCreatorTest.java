package com.google.javascript.jscomp;

import static com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.GLOBAL_THIS;
import static com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.REGEXP_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.Lists;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.ObjectType;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for {@link TypedScopeCreator} (Closure-48b).
 *
 * หมายเหตุ: เมธอด/สัญญาณของ Compiler/SourceFile/Node บางตัวที่ใช้ในไฟล์นี้
 * (init/parseInputs/getRoot/getParent/addChildToBack/JSError.getType)
 * ไม่ได้ถูกกำหนด behavior ไว้ในซอร์สโค้ดของ TypedScopeCreator ที่ให้มา
 * แต่เป็น API มาตรฐานของ Closure Compiler ที่จำเป็นสำหรับสร้าง AST จริง
 * เพื่อ drive การทดสอบ ผู้เขียนจึงสมมติ (assume) ว่ามี behavior ตามปกติของ
 * Closure Compiler เวอร์ชันนี้ และคอมเมนต์กำกับไว้ ณ จุดที่ใช้
 */
public class TypedScopeCreatorTest {

  private Compiler compiler;
  private CompilerOptions options;

  @Before
  public void setUp() {
    compiler = new Compiler();
    options = new CompilerOptions();
  }

  // ---------------------------------------------------------------------
  // Helpers
  // ---------------------------------------------------------------------

  /** สมมติฐาน: compiler.init(...)/parseInputs()/getRoot() คือ API มาตรฐาน
   *  ของ Closure Compiler สำหรับ parse externs+input เป็น AST เดียว
   *  ที่มีโครงสร้าง root.getFirstChild() = externsRoot,
   *  root.getLastChild() = jsRoot (ตามที่ TypedScopeCreator ต้องการ
   *  ใน FirstOrderFunctionAnalyzer.process(root.getFirstChild(), root.getLastChild())) */
  private Node parseRoot(String externsCode, String js) {
    compiler.init(
        Lists.newArrayList(SourceFile.fromCode("externs.js", externsCode)),
        Lists.newArrayList(SourceFile.fromCode("input.js", js)),
        options);
    compiler.parseInputs();
    return compiler.getRoot();
  }

  private Node parseRoot(String js) {
    return parseRoot("", js);
  }

  private Scope createGlobalScope(Node root) {
    return new TypedScopeCreator(compiler).createScope(root, null);
  }

  private Scope buildGlobalScope(String js) {
    return createGlobalScope(parseRoot(js));
  }

  /** สมมติฐาน: JSError มีเมธอด getType() คืน DiagnosticType (API มาตรฐาน) */
  private boolean hasWarningOfType(DiagnosticType type) {
    for (JSError e : compiler.getWarnings()) {
      if (e.getType() == type) {
        return true;
      }
    }
    return false;
  }

  private JSType nativeType(com.google.javascript.rhino.jstype.JSTypeNative t) {
    return compiler.getTypeRegistry().getNativeType(t);
  }

  // ---------------------------------------------------------------------
  // 1) Boundary / empty input
  // ---------------------------------------------------------------------

  @Test
  public void testEmptyProgram_onlyNativeTypesDeclared() {
    Scope scope = buildGlobalScope("");
    assertTrue(scope.isGlobal());
    // ตัวแปร native ที่ createInitialScope ประกาศไว้ต้องมีอยู่
    assertNotNull(scope.getVar("Object"));
    assertNotNull(scope.getVar("Array"));
    assertNotNull(scope.getVar("undefined"));
    assertNotNull(scope.getVar("ActiveXObject"));
    // ไม่มีตัวแปรของผู้ใช้ที่ไม่ได้ประกาศ
    assertNull(scope.getVar("notDeclared"));
  }

  @Test
  public void testWhitespaceOnlyProgram() {
    Scope scope = buildGlobalScope("   \n\t  ");
    assertTrue(scope.isGlobal());
  }

  // ---------------------------------------------------------------------
  // 2) Malformed input (ข้อกำหนดที่ 3: อินพุตผิดรูปแบบ)
  // ---------------------------------------------------------------------

  @Test
  public void testMalformedInput_parseErrorReported() {
    // syntax error: ขาด identifier หลัง var
    parseRoot("var = 5;");
    assertTrue("ควรมี parse error ถูก report", compiler.getErrorCount() > 0);
    // ไม่ดำเนินการ createScope ต่อเพราะ AST อาจไม่สมบูรณ์
  }

  // ---------------------------------------------------------------------
  // 3) defineVar / defineName branches
  // ---------------------------------------------------------------------

  @Test
  public void testGlobalVarDeclaration_typeFromLiteral_number() {
    Scope scope = buildGlobalScope("var x = 1;");
    Var v = scope.getVar("x");
    assertNotNull(v);
    assertEquals(nativeType(NUMBER_TYPE), v.getType());
    assertFalse(v.isTypeInferred() && v.getType() != null);
  }

  @Test
  public void testGlobalVarDeclaration_typeFromLiteral_string() {
    Scope scope = buildGlobalScope("var s = 'hello';");
    Var v = scope.getVar("s");
    assertNotNull(v);
    assertEquals(nativeType(STRING_TYPE), v.getType());
  }

  @Test
  public void testGlobalVarDeclaration_noInitializer_inferred() {
    Scope scope = buildGlobalScope("var x;");
    Var v = scope.getVar("x");
    assertNotNull(v);
    assertTrue(v.isTypeInferred());
  }

  @Test
  public void testMultipleVarDefWithJsDoc_warns() {
    buildGlobalScope("/** @type {number} */ var a = 1, b = 2;");
    assertTrue(hasWarningOfType(TypeCheck.MULTIPLE_VAR_DEF));
  }

  @Test
  public void testMultipleVarDefWithoutJsDoc_noWarning() {
    Scope scope = buildGlobalScope("var a = 1, b = 2;");
    assertFalse(hasWarningOfType(TypeCheck.MULTIPLE_VAR_DEF));
    assertNotNull(scope.getVar("a"));
    assertNotNull(scope.getVar("b"));
  }

  // ---------------------------------------------------------------------
  // 4) defineCatch
  // ---------------------------------------------------------------------

  @Test
  public void testCatchParameter_declared() {
    Scope scope = buildGlobalScope("try { throw 1; } catch (e) {}");
    Var v = scope.getVar("e");
    assertNotNull(v);
    // defineCatch เรียก defineSlot(catchName, n, null) -> type=null -> inferred
    assertTrue(v.isTypeInferred());
  }

  // ---------------------------------------------------------------------
  // 5) attachLiteralTypes switch branches
  // ---------------------------------------------------------------------

  @Test
  public void testLiteralTypesAttachedToNodes() {
    String js =
        "var a = null;\n"
        + "var b = void 0;\n"
        + "var c = true;\n"
        + "var d = 1;\n"
        + "var e = 'str';\n"
        + "var f = /abc/;\n";
    Node root = parseRoot(js);
    createGlobalScope(root);

    Node script = root.getLastChild().getFirstChild();
    Node stmt = script.getFirstChild();

    assertEquals(nativeType(NULL_TYPE), stmt.getFirstChild().getFirstChild().getJSType());
    stmt = stmt.getNext();
    assertEquals(nativeType(VOID_TYPE), stmt.getFirstChild().getFirstChild().getJSType());
    stmt = stmt.getNext();
    assertEquals(nativeType(BOOLEAN_TYPE), stmt.getFirstChild().getFirstChild().getJSType());
    stmt = stmt.getNext();
    assertEquals(nativeType(NUMBER_TYPE), stmt.getFirstChild().getFirstChild().getJSType());
    stmt = stmt.getNext();
    assertEquals(nativeType(STRING_TYPE), stmt.getFirstChild().getFirstChild().getJSType());
    stmt = stmt.getNext();
    assertEquals(nativeType(REGEXP_TYPE), stmt.getFirstChild().getFirstChild().getJSType());
  }

  // ---------------------------------------------------------------------
  // 6) defineObjectLiteral / processObjectLitProperties
  // ---------------------------------------------------------------------

  @Test
  public void testObjectLiteralProperties_declaredOnOwner() {
    Scope scope = buildGlobalScope("var obj = {a: 1, b: 'x'};");
    Var objVar = scope.getVar("obj");
    assertNotNull(objVar);
    ObjectType objType = ObjectType.cast(objVar.getType());
    assertNotNull(objType);
    assertTrue(objType.hasOwnProperty("a"));
    assertTrue(objType.hasOwnProperty("b"));
    assertEquals(nativeType(NUMBER_TYPE), objType.getPropertyType("a"));
    assertEquals(nativeType(STRING_TYPE), objType.getPropertyType("b"));
  }

  @Test
  public void testUnknownLendsAnnotation_warns() {
    buildGlobalScope("var x = /** @lends {UnknownThing} */ ({});");
    assertTrue(hasWarningOfType(TypedScopeCreator.UNKNOWN_LENDS));
  }

  // @lends บน non-object type (เช่น number) ขึ้นกับว่า NUMBER_TYPE เป็น subtype
  // ของ OBJECT_TYPE หรือไม่ในระบบ type ของ Closure ซึ่งไม่ปรากฏชัดในซอร์สที่ให้มา
  // จึงไม่เขียนเทสยืนยัน branch LENDS_ON_NON_OBJECT เพื่อไม่ให้เดา behavior ผิด

  // ---------------------------------------------------------------------
  // 7) Enum branches (createEnumTypeFromNodes / ENUM_INITIALIZER)
  // ---------------------------------------------------------------------

  @Test
  public void testEnumWithObjectLiteral_noWarning() {
    Scope scope = buildGlobalScope(
        "/** @enum {number} */ var Color = {RED: 0, GREEN: 1};");
    assertFalse(hasWarningOfType(TypedScopeCreator.ENUM_INITIALIZER));
    Var v = scope.getVar("Color");
    assertNotNull(v);
    assertTrue(v.getType() instanceof EnumType);
    EnumType enumType = (EnumType) v.getType();
    assertEquals(nativeType(NUMBER_TYPE), enumType.getElementsType());
    assertNotNull(compiler.getTypeRegistry().getType("Color"));
  }

  @Test
  public void testEnumWithoutInitializer_warns() {
    buildGlobalScope("/** @enum {number} */ var Color;");
    assertTrue(hasWarningOfType(TypedScopeCreator.ENUM_INITIALIZER));
  }

  // ---------------------------------------------------------------------
  // 8) Constructor / Interface initializer branches
  // ---------------------------------------------------------------------

  @Test
  public void testConstructorWithoutInitializer_warns() {
    buildGlobalScope("/** @constructor */ var Foo;");
    assertTrue(hasWarningOfType(TypedScopeCreator.CTOR_INITIALIZER));
  }

  @Test
  public void testInterfaceWithoutInitializer_warns() {
    buildGlobalScope("/** @interface */ var Bar;");
    assertTrue(hasWarningOfType(TypedScopeCreator.IFACE_INITIALIZER));
  }

  @Test
  public void testFunctionDeclaration_hoisted_declaresPrototype() {
    Scope scope = buildGlobalScope("/** @constructor */ function Foo() {}");
    Var fooVar = scope.getVar("Foo");
    assertNotNull(fooVar);
    assertTrue(fooVar.getType().isFunctionType());
    FunctionType fooType = fooVar.getType().toMaybeFunctionType();
    assertTrue(fooType.isConstructor());
    // defineSlot ประกาศ "Foo.prototype" อัตโนมัติในสโคป
    assertNotNull(scope.getVar("Foo.prototype"));
  }

  // ---------------------------------------------------------------------
  // 9) Aliased constructor branch ใน createFunctionTypeFromNodes
  // ---------------------------------------------------------------------

  @Test
  public void testAliasedConstructor_sharesFunctionType() {
    Scope scope = buildGlobalScope(
        "/** @constructor */ function Foo() {}\n"
        + "/** @constructor */ var Bar = Foo;");
    Var fooVar = scope.getVar("Foo");
    Var barVar = scope.getVar("Bar");
    assertNotNull(fooVar);
    assertNotNull(barVar);
    assertEquals(fooVar.getType(), barVar.getType());
    assertNotNull(compiler.getTypeRegistry().getType("Bar"));
  }

  // ---------------------------------------------------------------------
  // 10) GlobalScopeBuilder.checkForTypedef
  // ---------------------------------------------------------------------

  @Test
  public void testTypedefDeclaration_registersType() {
    buildGlobalScope("/** @typedef {number} */ var MyNum;");
    JSType typedefType = compiler.getTypeRegistry().getType("MyNum");
    assertNotNull(typedefType);
    assertEquals(nativeType(NUMBER_TYPE), typedefType);
  }

  // MALFORMED_TYPEDEF: ต้องการ jsdoc ที่ hasTypedefType()==true แต่ evaluate()
  // คืน null ซึ่งรูปแบบ JSDoc ที่ทำให้เกิดกรณีนี้ไม่ปรากฏชัดในซอร์สที่ให้มา
  // จึงไม่เขียนเทสยืนยัน branch นี้เพื่อไม่ให้เดา behavior ผิด

  // ---------------------------------------------------------------------
  // 11) maybeDeclareQualifiedName branches (ASSIGN / GETPROP stub)
  // ---------------------------------------------------------------------

  @Test
  public void testAssignFunctionToPrototypeProperty_declared() {
    Scope scope = buildGlobalScope(
        "/** @constructor */ function Foo() {}\n"
        + "Foo.prototype.bar = function() {};");
    Var fooVar = scope.getVar("Foo");
    assertNotNull(fooVar);
    FunctionType fooType = fooVar.getType().toMaybeFunctionType();
    ObjectType proto = fooType.getPrototype();
    assertTrue(proto.hasOwnProperty("bar"));
    assertTrue(proto.getPropertyType("bar").isFunctionType());
  }

  @Test
  public void testStubPropertyDeclaration_resolvedAsUnknown() {
    // GETPROP ที่เป็น EXPR_RESULT โดยไม่มี jsdoc/ค่า -> stub -> resolveStubDeclarations
    Scope scope = buildGlobalScope(
        "/** @constructor */ function Foo() {}\n"
        + "Foo.prototype.bar;");
    Var fooVar = scope.getVar("Foo");
    assertNotNull(fooVar);
    FunctionType fooType = fooVar.getType().toMaybeFunctionType();
    ObjectType proto = fooType.getPrototype();
    assertTrue(proto.hasOwnProperty("bar"));
  }

  // ---------------------------------------------------------------------
  // 12) defineSlot: shouldDeclareOnGlobalThis / "Window" special-case
  // ---------------------------------------------------------------------

  @Test
  public void testGlobalVarDeclaredOnGlobalThis() {
    buildGlobalScope("var x = 1;");
    ObjectType globalThis =
        compiler.getTypeRegistry().getNativeObjectType(GLOBAL_THIS);
    assertTrue(globalThis.hasOwnProperty("x"));
  }

  @Test
  public void testWindowConstructor_noExceptionAndDeclared() {
    // ครอบคลุมสาขา isGlobalVar && "Window".equals(variableName) && ...
    Scope scope = buildGlobalScope("/** @constructor */ function Window() {}");
    Var windowVar = scope.getVar("Window");
    assertNotNull(windowVar);
    assertTrue(windowVar.getType().isFunctionType());
    assertTrue(windowVar.getType().toMaybeFunctionType().isConstructor());
  }

  // ---------------------------------------------------------------------
  // 13) checkForClassDefiningCalls: smoke test สำหรับสาขา relationship == null ฯลฯ
  //     (ไม่ตั้งค่า CodingConvention พิเศษ จึงไม่ควร throw exception)
  // ---------------------------------------------------------------------

  @Test
  public void testUnrelatedCallExpression_noException() {
    Scope scope = buildGlobalScope("function foo() {} foo();");
    assertNotNull(scope.getVar("foo"));
    // ไม่ควรมี error/warning จากการเรียกฟังก์ชันธรรมดา
    assertEquals(0, compiler.getErrorCount());
  }

  // ---------------------------------------------------------------------
  // 14) createScope(parent != null) -> LocalScopeBuilder branch
  // ---------------------------------------------------------------------

  @Test
  public void testLocalScope_paramsAndLocalVarsDeclared() {
    Node root = parseRoot("function f(a, b) { var c = a + b; return c; }");
    Scope globalScope = createGlobalScope(root);

    Var fVar = globalScope.getVar("f");
    assertNotNull(fVar);

    // สมมติฐาน: Node.getParent() เป็น API มาตรฐานของ Rhino Node (ไม่ได้อยู่ในซอร์สที่ให้มา)
    Node fnNameNode = fVar.getNameNode();
    Node fnNode = fnNameNode.getParent();
    assertNotNull(fnNode);
    assertTrue(fnNode.isFunction());

    Scope localScope = new TypedScopeCreator(compiler).createScope(fnNode, globalScope);
    assertFalse(localScope.isGlobal());
    assertNotNull(localScope.getVar("a"));
    assertNotNull(localScope.getVar("c"));
    // 'c' ไม่มี jsdoc และค่าเป็น expression ไม่ใช่ function -> inferred
    assertTrue(localScope.getVar("c").isTypeInferred());
  }
}
