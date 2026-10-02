package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * JUnit4 test suite for {@link TypedScopeCreator} (Defects4J Closure-144b).
 *
 * ดูหมายเหตุ/ข้อสมมติทั้งหมดที่หัวข้อคำอธิบายก่อนโค้ดนี้.
 */
public class TypedScopeCreatorTest {

  private Compiler compiler;
  private CompilerOptions options;

  @Before
  public void setUp() {
    compiler = new Compiler();
    options = new CompilerOptions();
    options.setCheckTypes(true);
  }

  private void compile(String js) {
    SourceFile externs = SourceFile.fromCode("externs.js", "");
    SourceFile input = SourceFile.fromCode("input.js", js);
    compiler.compile(externs, input, options);
  }

  private void assertNoErrors() {
    assertEquals("expected no compile errors", 0, compiler.getErrorCount());
  }

  private void assertHasWarning() {
    assertTrue("expected at least one warning", compiler.getWarningCount() > 0);
  }

  // ---------------------------------------------------------------------
  // 1) การประกาศตัวแปร/ฟังก์ชันพื้นฐาน — เส้นทางปกติของ define()
  // ---------------------------------------------------------------------

  @Test
  public void testSimpleVarDeclaration_NoErrors() {
    compile("var x = 1;");
    assertNoErrors();
  }

  @Test
  public void testEmptySource_NoErrors() {
    compile("");
    assertNoErrors();
  }

  @Test
  public void testVarWithTypeAnnotation_NoErrors() {
    compile("/** @type {number} */ var x = 1;");
    assertNoErrors();
  }

  @Test
  public void testFunctionDeclaration_NoErrors() {
    compile("function f(a, b) { return a + b; }");
    assertNoErrors();
  }

  @Test
  public void testCatchVariableDeclaration_NoErrors() {
    // ครอบคลุม case Token.CATCH ใน define()
    compile("try { throw 1; } catch (e) { var y = e; }");
    assertNoErrors();
  }

  @Test
  public void testBleedingFunctionName_NoErrors() {
    // ครอบคลุม LocalScopeBuilder.handleFunctionInputs: bleeding function name
    compile("var f = function g() { return g; };");
    assertNoErrors();
  }

  // ---------------------------------------------------------------------
  // 2) MULTIPLE_VAR_DEF: Token.VAR ที่มีมากกว่า 1 ชื่อ + มี/ไม่มี JSDocInfo
  // ---------------------------------------------------------------------

  @Test
  public void testMultipleVarDeclarationWithJsDoc_ReportsWarning() {
    // branch: n.getChildCount() > 1 && info != null -> report(MULTIPLE_VAR_DEF)
    // และ loop for (Node name : n.children()) ทำงาน 2 รอบ
    compile("/** @type {number} */ var a, b;");
    assertHasWarning();
  }

  @Test
  public void testMultipleVarDeclarationWithoutJsDoc_NoErrors() {
    // branch: n.getChildCount() > 1 && info == null (ไม่ report MULTIPLE_VAR_DEF)
    compile("var a, b;");
    assertNoErrors();
  }

  // ---------------------------------------------------------------------
  // 3) Enum: object literal, ซ้ำ key, ว่าง, key เดียว (boundary ของ while loop)
  // ---------------------------------------------------------------------

  @Test
  public void testEnumDuplicateKey_ReportsWarning() {
    // branch: enumType.hasOwnProperty(keyName) == true -> report(ENUM_DUP)
    compile("/** @enum {number} */ var Color = { RED: 1, GREEN: 2, RED: 3 };");
    assertHasWarning();
  }

  @Test
  public void testEnumValidMultipleKeys_NoErrors() {
    compile("/** @enum {number} */ var Color = { RED: 1, GREEN: 2 };");
    assertNoErrors();
  }

  @Test
  public void testEnumSingleKey_NoErrors() {
    // boundary: while(key != null) วนหนึ่งรอบ
    compile("/** @enum {number} */ var Single = { ONLY: 1 };");
    assertNoErrors();
  }

  @Test
  public void testEnumEmptyObjectLiteral_NoErrors() {
    // boundary: while(key != null) ไม่วนเลย (key == null ตั้งแต่แรก)
    compile("/** @enum {number} */ var Empty = {};");
    assertNoErrors();
  }

  @Test
  public void testEnumInitializerNotObjectOrEnum_ReportsWarning() {
    // branch: value ไม่ใช่ OBJECTLIT และไม่ใช่ qualified name ของ enum
    // -> enumType == null -> report(ENUM_INITIALIZER)
    compile("/** @enum {number} */ var Color = 5;");
    assertHasWarning();
  }

  @Test
  public void testEnumAliasOfExistingEnum_NoErrors() {
    // branch: value.isQualifiedName() == true && var.getType() instanceof EnumType
    compile(
        "/** @enum {number} */ var Color = { RED: 1 };"
        + "/** @enum {number} */ var Hue = Color;");
    assertNoErrors();
  }

  @Test
  public void testEnumAliasOfUndefinedName_ReportsWarning() {
    // branch: value.isQualifiedName() == true แต่หา var ไม่เจอ -> enumType == null
    compile("/** @enum {number} */ var Hue = UndefinedThing;");
    assertHasWarning();
  }

  // ---------------------------------------------------------------------
  // 4) Constructor / prototype / function alias / stub declarations
  // ---------------------------------------------------------------------

  @Test
  public void testConstructorFunctionDeclaration_NoErrors() {
    compile("/** @constructor */ function Foo() {} var f = new Foo();");
    assertNoErrors();
  }

  @Test
  public void testPrototypeMethodAssignment_NoErrors() {
    // ครอบคลุม getPrototypePropertyOwner ผ่าน integration path (Foo.prototype.bar)
    compile(
        "/** @constructor */ function Foo() {}"
        + "Foo.prototype.bar = function() { return 1; };");
    assertNoErrors();
  }

  @Test
  public void testFunctionAlias_NoErrors() {
    // branch: rValue.isQualifiedName() ใน getFunctionType (function alias)
    compile("/** @constructor */ function Foo() {} var Bar = Foo;");
    assertNoErrors();
  }

  @Test
  public void testStubPropertyDeclaration_NoErrors() {
    // stubDeclarations.add(...) + resolveStubDeclarations loop (isDeclared == false)
    compile("/** @constructor */ function Foo() {} Foo.prototype.bar;");
    assertNoErrors();
  }

  @Test
  public void testStubThenRealDeclaration_NoErrors() {
    // branch: scope.isDeclared(qName, false) == true -> continue ใน resolveStubDeclarations()
    compile(
        "/** @constructor */ function Foo() {}"
        + "Foo.prototype.bar;"
        + "Foo.prototype.bar = function() {};");
    assertNoErrors();
  }

  @Test
  public void testMethodWithThisPropertyAnnotation_NoErrors() {
    // createScope(): loop over nonExternFunctions + CollectProperties
    // (fnThisType ไม่ใช่ unknown type เพราะมี @constructor)
    compile(
        "/** @constructor */ function Foo() {}"
        + "Foo.prototype.setup = function() {"
        + "  /** @type {number} */ this.x = 5;"
        + "};");
    assertNoErrors();
  }

  @Test
  public void testRedeclarationConflictingTypes_ReportsWarning() {
    // branch: scope.isDeclared(variableName, false) == true ใน defineSlot()
    // -> validator.expectUndeclaredVariable(...)
    compile(
        "/** @type {number} */ var x = 1;"
        + "/** @type {string} */ var x = 'hello';");
    assertHasWarning();
  }

  // ---------------------------------------------------------------------
  // 5) declareArguments loop: 0 พารามิเตอร์ / เท่ากับ jsdoc / มากกว่า jsdoc
  // ---------------------------------------------------------------------

  @Test
  public void testFunctionNoParameters_NoErrors() {
    // boundary: astParameters loop ว่าง
    compile("/** @return {number} */ function f() { return 1; }");
    assertNoErrors();
  }

  @Test
  public void testFunctionParametersMatchJsDoc_NoErrors() {
    compile("/** @param {number} a @param {string} b */ function f(a, b) {}");
    assertNoErrors();
  }

  @Test
  public void testFunctionMoreParamsThanJsDoc_NoErrors() {
    // branch: jsDocParameter == null กลางลูป -> defineSlot(..., null, true)
    compile("/** @param {number} a */ function f(a, b) {}");
    assertNoErrors();
  }

  // ---------------------------------------------------------------------
  // 6) Typedef (new-style), malformed input, null content (boundary)
  // ---------------------------------------------------------------------

  @Test
  public void testValidTypedef_NoErrors() {
    compile("/** @typedef {number} */ var NumberAlias;");
    assertNoErrors();
  }

  @Test
  public void testMalformedSyntax_ReportsError() {
    compile("var 1abc = 5;");
    assertTrue("expected parse error for malformed syntax",
        compiler.getErrorCount() > 0);
  }

  @Test(expected = Exception.class)
  public void testCompileWithNullSourceContent_Throws() {
    // boundary: null content — ไม่ยืนยัน exception type ที่แน่นอน
    SourceFile externs = SourceFile.fromCode("externs.js", "");
    SourceFile input = SourceFile.fromCode("input.js", (String) null);
    compiler.compile(externs, input, options);
  }

  // ---------------------------------------------------------------------
  // 7) getPrototypePropertyOwner(Node) — ทดสอบตรงผ่าน reflection (pure logic)
  // ---------------------------------------------------------------------

  private static Node newGetProp(Node owner, String propName) {
    Node result = new Node(Token.GETPROP);
    result.addChildToBack(owner);
    result.addChildToBack(Node.newString(Token.STRING, propName));
    return result;
  }

  private static Node invokeGetPrototypePropertyOwner(Node n) throws Exception {
    Method m = TypedScopeCreator.class.getDeclaredMethod(
        "getPrototypePropertyOwner", Node.class);
    m.setAccessible(true);
    return (Node) m.invoke(null, new Object[] { n });
  }

  @Test
  public void testGetPrototypePropertyOwner_NotGetProp_ReturnsNull() throws Exception {
    // branch A: n.getType() != Token.GETPROP
    Node name = Node.newString(Token.NAME, "Foo");
    assertNull(invokeGetPrototypePropertyOwner(name));
  }

  @Test
  public void testGetPrototypePropertyOwner_FirstChildNotGetProp_ReturnsNull()
      throws Exception {
    // branch B: firstChild.getType() != Token.GETPROP (Foo.bar)
    Node getProp = newGetProp(Node.newString(Token.NAME, "Foo"), "bar");
    assertNull(invokeGetPrototypePropertyOwner(getProp));
  }

  @Test
  public void testGetPrototypePropertyOwner_NotPrototypeProperty_ReturnsNull()
      throws Exception {
    // branch C: firstChild เป็น GETPROP แต่ property name != "prototype" (Foo.bar.baz)
    Node inner = newGetProp(Node.newString(Token.NAME, "Foo"), "bar");
    Node outer = newGetProp(inner, "baz");
    assertNull(invokeGetPrototypePropertyOwner(outer));
  }

  @Test
  public void testGetPrototypePropertyOwner_OwnerNotQualifiedName_ReturnsNull()
      throws Exception {
    // branch D: maybeOwner ไม่ใช่ qualified name (foo().prototype.bar)
    Node call = new Node(Token.CALL);
    call.addChildToBack(Node.newString(Token.NAME, "foo"));
    Node inner = newGetProp(call, "prototype");
    Node outer = newGetProp(inner, "bar");
    assertNull(invokeGetPrototypePropertyOwner(outer));
  }

  @Test
  public void testGetPrototypePropertyOwner_ValidPrototypeProperty_ReturnsOwner()
      throws Exception {
    // branch E: ทุกเงื่อนไขผ่าน -> return maybeOwner (Foo.prototype.bar -> Foo)
    Node owner = Node.newString(Token.NAME, "Foo");
    Node inner = newGetProp(owner, "prototype");
    Node outer = newGetProp(inner, "bar");

    Node result = invokeGetPrototypePropertyOwner(outer);
    assertNotNull(result);
    assertEquals("Foo", result.getString());
  }

  @Test
  public void testGetPrototypePropertyOwner_NullNode_ThrowsWrappedNpe() {
    // boundary: null input -> NullPointerException ภายในเมธอด (ครอบด้วย reflection)
    try {
      invokeGetPrototypePropertyOwner(null);
      fail("expected an exception for null input");
    } catch (InvocationTargetException e) {
      assertTrue(e.getCause() instanceof NullPointerException);
    } catch (Exception e) {
      fail("expected InvocationTargetException but got: " + e);
    }
  }
}
