# คำอธิบายแนวทางก่อนโค้ด

**ข้อจำกัดสำคัญที่พบในซอร์สโค้ดต้นฉบับ:**

1. `IRFactory` มี constructor เป็น `private` และ field/method ภายในส่วนใหญ่เป็น `private`/package-private ทางเข้าเดียวที่เป็น public คือ `static Node transformTree(AstRoot, StaticSourceFile, String, Config, ErrorReporter)`
2. คลาสที่ `IRFactory` พึ่งพา (`Config`, `ParserRunner`, `StaticSourceFile`, `JsDocInfoParser` ฯลฯ) **ไม่ได้ให้ source มาด้วย** ดังนั้นตาม requirement ข้อ 4 ผมจะ**ไม่เดา behavior ภายใน**ของคลาสเหล่านี้ แต่จะใช้เฉพาะ public API ที่จำเป็นต่อการเรียก `IRFactory` (ซึ่งมีอยู่จริงในโปรเจกต์ Closure Compiler เพราะเป็น dependency ที่ compile ร่วมกับ `IRFactory` อยู่แล้ว) คือ `ParserRunner.createConfig(...)` และ `ParserRunner.parse(...)` — นี่คือช่องทางสาธารณะเดียวในโปรเจกต์จริงที่เรียก `IRFactory.transformTree(...)` (เทียบเท่ากับที่ `ParserTest` ในซอร์สจริงทำ) หากลายเซ็นจริงต่างจากที่สมมติไว้ ต้องปรับให้ตรง — **กำกับด้วยคอมเมนต์ในโค้ด**
3. เพื่อให้ assertion อ้างอิงกับพฤติกรรมที่ "พิสูจน์ได้จากซอร์สที่ให้มาจริง" ผมใช้ **ค่าคงที่ error/warning message ที่ประกาศอยู่ใน `IRFactory` เอง** (`GETTER_ERROR_MESSAGE`, `SETTER_ERROR_MESSAGE`, `SUSPICIOUS_COMMENT_WARNING`, `MISPLACED_TYPE_ANNOTATION`, `INVALID_ES3_PROP_NAME`) แทนการ hardcode string เอง
4. `ErrorReporter` (จาก rhino.jar) ยืนยัน signature ได้จากจุดเรียกจริงใน `IRFactory` (เช่น `errorReporter.warning(msg, sourceName, lineno, "", 0)`) จึงมั่นใจได้สูงว่า interface มีรูปแบบตามที่ implement ด้านล่าง
5. `StaticSourceFile` ไม่มี source ให้ — สมมติว่ามีเพียง `getName()` และ `isExtern()` ตามการใช้งานจริงใน Closure Compiler (กำกับคอมเมนต์)

```java
package com.google.javascript.jscomp.parsing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.jscomp.parsing.Config.LanguageMode;
// นำเข้าคลาสเป้าหมายโดยตรง (แม้อยู่ package เดียวกัน) เพื่อใช้ static message constants
// ที่ประกาศไว้จริงใน IRFactory สำหรับตรวจสอบผลลัพธ์ของ error/warning
import com.google.javascript.jscomp.parsing.IRFactory;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.jstype.StaticSourceFile;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * ชุดทดสอบสำหรับ {@link IRFactory}
 *
 * หมายเหตุสำคัญ (สมมติฐานที่จำเป็นเพราะไม่มี source ของ dependency บางตัว):
 * - IRFactory มี constructor เป็น private และทางเข้าสาธารณะเดียวคือ transformTree(...)
 *   ซึ่งต้องใช้ Config ที่ไม่มี source ให้มา ดังนั้นจึงเรียกผ่าน ParserRunner
 *   (ParserRunner.createConfig / ParserRunner.parse) ซึ่งเป็นทางเข้าสาธารณะจริงในโปรเจกต์
 *   ที่ใช้เรียก IRFactory.transformTree(...) ภายใน (ตรงกับวิธีที่ ParserTest ในโปรเจกต์จริงทดสอบ)
 * - StaticSourceFile ไม่มี source ให้ สมมติว่ามีเมธอด getName()/isExtern() ตามการใช้งานจริง
 * - ErrorReporter (rhino.jar) ยืนยัน signature ได้จากจุดเรียกจริงใน IRFactory
 * - หาก signature จริงของ ParserRunner/Config แตกต่างจากที่ใช้ในไฟล์นี้ ต้องปรับให้ตรงกับของจริง
 */
public class IRFactoryTest {

  private RecordingErrorReporter errorReporter;

  @Before
  public void setUp() {
    errorReporter = new RecordingErrorReporter();
  }

  // ------------------------------------------------------------------
  // Helper: error reporter ที่บันทึกข้อความ error/warning ไว้ตรวจสอบ
  // ------------------------------------------------------------------
  private static class RecordingErrorReporter implements ErrorReporter {
    final List<String> errors = new ArrayList<String>();
    final List<String> warnings = new ArrayList<String>();

    @Override
    public void warning(String message, String sourceName, int line,
        String lineSource, int lineOffset) {
      warnings.add(message);
    }

    @Override
    public void error(String message, String sourceName, int line,
        String lineSource, int lineOffset) {
      errors.add(message);
    }

    @Override
    public EvaluatorException runtimeError(String message, String sourceName,
        int line, String lineSource, int lineOffset) {
      errors.add(message);
      return new EvaluatorException(message);
    }
  }

  // หมายเหตุ: สมมติ shape ของ StaticSourceFile (ไม่มี source ให้ตรวจสอบ)
  private static class SimpleTestSourceFile implements StaticSourceFile {
    private final String name;

    SimpleTestSourceFile(String name) {
      this.name = name;
    }

    @Override
    public String getName() {
      return name;
    }

    @Override
    public boolean isExtern() {
      return false;
    }
  }

  private Node parse(String code, LanguageMode mode, boolean isIdeMode,
      boolean acceptConstKeyword) {
    StaticSourceFile sourceFile = new SimpleTestSourceFile("test_input.js");
    // สมมติ signature: ParserRunner.createConfig(isIdeMode, languageMode, acceptConst, extraAnnotations)
    Config config =
        ParserRunner.createConfig(isIdeMode, mode, acceptConstKeyword, null);
    try {
      // สมมติ signature: ParserRunner.parse(sourceFile, code, config, errorReporter) -> ParseResult{ast, ...}
      ParserRunner.ParseResult result =
          ParserRunner.parse(sourceFile, code, config, errorReporter);
      return result.ast;
    } catch (Exception e) {
      throw new RuntimeException("failed to parse: " + code, e);
    }
  }

  private Node parseEs5(String code) {
    return parse(code, LanguageMode.ECMASCRIPT5, false, true);
  }

  private Node parseEs3(String code) {
    return parse(code, LanguageMode.ECMASCRIPT3, false, true);
  }

  private Node parseEs5Strict(String code) {
    return parse(code, LanguageMode.ECMASCRIPT5_STRICT, false, true);
  }

  private Node firstStatement(Node script) {
    return script.getFirstChild();
  }

  // ================= BASIC / SCRIPT =================

  @Test
  public void testEmptyScript() {
    Node script = parseEs5("");
    assertEquals(Token.SCRIPT, script.getType());
    assertNull(script.getFirstChild());
    assertTrue(errorReporter.errors.isEmpty());
  }

  @Test
  public void testSimpleVarDeclaration() {
    Node script = parseEs5("var x = 1;");
    assertEquals(Token.VAR, firstStatement(script).getType());
    assertTrue(errorReporter.errors.isEmpty());
  }

  // ================= transformBlock branches =================

  @Test
  public void testIfWithBlockThenAndElse() {
    Node script = parseEs5("if (a) { b(); } else { c(); }");
    Node ifNode = firstStatement(script);
    assertEquals(Token.IF, ifNode.getType());
    assertEquals(3, ifNode.getChildCount());
    assertTrue(ifNode.getFirstChild().getNext().isBlock());
  }

  @Test
  public void testIfWithoutElse() {
    Node script = parseEs5("if (a) { b(); }");
    Node ifNode = firstStatement(script);
    assertEquals(2, ifNode.getChildCount());
  }

  @Test
  public void testIfWithSingleStatementThenGetsWrappedInBlock() {
    Node script = parseEs5("if (a) b();");
    Node thenPart = firstStatement(script).getFirstChild().getNext();
    assertTrue(thenPart.isBlock());
    assertEquals(Token.EXPR_RESULT, thenPart.getFirstChild().getType());
  }

  @Test
  public void testIfWithEmptyThenBecomesEmptyBlock() {
    Node script = parseEs5("if (a) ;");
    Node thenPart = firstStatement(script).getFirstChild().getNext();
    assertTrue(thenPart.isBlock());
    assertFalse(thenPart.hasChildren());
  }

  // ================= handleBlockComment =================

  @Test
  public void testSuspiciousBlockCommentTriggersWarning() {
    parseEs5("/* @foo something */\nvar x = 1;");
    assertTrue(errorReporter.warnings.contains(IRFactory.SUSPICIOUS_COMMENT_WARNING));
  }

  @Test
  public void testNormalBlockCommentNoWarning() {
    parseEs5("/* just a comment */\nvar x = 1;");
    assertFalse(errorReporter.warnings.contains(IRFactory.SUSPICIOUS_COMMENT_WARNING));
  }

  // ================= fileoverview jsdoc =================

  @Test
  public void testFileOverviewJsDocAttachedToRoot() {
    Node script = parseEs5("/**\n * @fileoverview Something.\n */\nvar x = 1;");
    assertNotNull(script.getJSDocInfo());
  }

  @Test
  public void testNoFileOverviewMeansRootHasNoJSDoc() {
    Node script = parseEs5("/** @type {number} */ var x = 1;");
    assertNull(script.getJSDocInfo());
  }

  // ================= validateTypeAnnotations =================

  @Test
  public void testMisplacedTypeAnnotationOnGetPropNotAtExprRoot() {
    parseEs5("var x = /** @type {string} */ a.b;");
    assertTrue(errorReporter.warnings.contains(IRFactory.MISPLACED_TYPE_ANNOTATION));
  }

  @Test
  public void testValidTypeAnnotationOnGetPropAtExprRoot() {
    parseEs5("/** @type {string} */ a.b;");
    assertFalse(errorReporter.warnings.contains(IRFactory.MISPLACED_TYPE_ANNOTATION));
  }

  @Test
  public void testValidTypeAnnotationOnFunctionStatement() {
    parseEs5("/** @return {string} */ function f() { return 'a'; }");
    assertFalse(errorReporter.warnings.contains(IRFactory.MISPLACED_TYPE_ANNOTATION));
  }

  // ================= array literal / destructuring =================

  @Test
  public void testArrayLiteralNormal() {
    Node script = parseEs5("var a = [1, 2, 3];");
    Node arrayLit = firstStatement(script).getFirstChild().getFirstChild();
    assertEquals(Token.ARRAYLIT, arrayLit.getType());
    assertEquals(3, arrayLit.getChildCount());
  }

  @Test
  public void testDestructuringArrayAssignReportsError() {
    parseEs5("var [a, b] = c;");
    assertFalse(errorReporter.errors.isEmpty());
  }

  // ================= assignment target =================

  @Test
  public void testValidAssignmentTarget() {
    parseEs5("a = 1;");
    assertTrue(errorReporter.errors.isEmpty());
  }

  @Test
  public void testInvalidAssignmentTargetReportsError() {
    parseEs5("1 = 2;");
    assertTrue(errorReporter.errors.contains("invalid assignment target"));
  }

  // ================= break / continue =================

  @Test
  public void testBreakWithoutLabel() {
    Node script = parseEs5("while (a) { break; }");
    Node body = firstStatement(script).getFirstChild().getNext();
    Node breakNode = body.getFirstChild();
    assertEquals(Token.BREAK, breakNode.getType());
    assertFalse(breakNode.hasChildren());
  }

  @Test
  public void testBreakWithLabel() {
    Node script = parseEs5("outer: while (a) { break outer; }");
    assertEquals(Token.LABEL, firstStatement(script).getType());
  }

  @Test
  public void testContinueWithoutLabel() {
    Node script = parseEs5("while (a) { continue; }");
    Node body = firstStatement(script).getFirstChild().getNext();
    Node contNode = body.getFirstChild();
    assertEquals(Token.CONTINUE, contNode.getType());
    assertFalse(contNode.hasChildren());
  }

  @Test
  public void testContinueWithLabel() {
    parseEs5("outer: while (a) { continue outer; }");
    assertTrue(errorReporter.errors.isEmpty());
  }

  // ================= catch clause =================

  @Test
  public void testTryCatchNormal() {
    Node script = parseEs5("try { a(); } catch (e) { b(); }");
    assertEquals(Token.TRY, firstStatement(script).getType());
    assertTrue(errorReporter.errors.isEmpty());
  }

  // ================= conditional expression =================

  @Test
  public void testConditionalExpression() {
    Node script = parseEs5("a ? b : c;");
    Node expr = firstStatement(script).getFirstChild();
    assertEquals(Token.HOOK, expr.getType());
    assertEquals(3, expr.getChildCount());
  }

  // ================= do loop =================

  @Test
  public void testDoWhileLoop() {
    Node script = parseEs5("do { a(); } while (b);");
    assertEquals(Token.DO, firstStatement(script).getType());
  }

  // ================= element get =================

  @Test
  public void testElementGet() {
    Node script = parseEs5("a[b];");
    Node expr = firstStatement(script).getFirstChild();
    assertEquals(Token.GETELEM, expr.getType());
  }

  // ================= for-in / for =================

  @Test
  public void testForInLoop() {
    Node script = parseEs5("for (a in b) { c(); }");
    Node forNode = firstStatement(script);
    assertEquals(Token.FOR, forNode.getType());
    assertEquals(3, forNode.getChildCount());
  }

  @Test
  public void testForLoopFull() {
    Node script = parseEs5("for (var i = 0; i < 10; i++) { a(); }");
    Node forNode = firstStatement(script);
    assertEquals(Token.FOR, forNode.getType());
    assertEquals(4, forNode.getChildCount());
  }

  @Test
  public void testForLoopEmptyParts() {
    Node script = parseEs5("for (;;) { a(); }");
    Node forNode = firstStatement(script);
    assertEquals(Token.EMPTY, forNode.getFirstChild().getType());
  }

  // ================= function call =================

  @Test
  public void testFunctionCall() {
    Node script = parseEs5("f(a, b);");
    Node call = firstStatement(script).getFirstChild();
    assertEquals(Token.CALL, call.getType());
    assertEquals(3, call.getChildCount());
  }

  // ================= function node =================

  @Test
  public void testNamedFunctionStatement() {
    Node script = parseEs5("function foo(a, b) { return a + b; }");
    Node fn = firstStatement(script);
    assertEquals(Token.FUNCTION, fn.getType());
    assertEquals("foo", fn.getFirstChild().getString());
  }

  @Test
  public void testAnonymousFunctionExpression() {
    Node script = parseEs5("var f = function (a) { return a; };");
    Node fnExpr = firstStatement(script).getFirstChild().getFirstChild();
    assertEquals(Token.FUNCTION, fnExpr.getType());
    assertEquals("", fnExpr.getFirstChild().getString());
  }

  // ================= infix expression sample =================

  @Test
  public void testInfixAddExpression() {
    Node script = parseEs5("a + b;");
    assertEquals(Token.ADD, firstStatement(script).getFirstChild().getType());
  }

  // ================= keyword literal =================

  @Test
  public void testKeywordLiterals() {
    Node script = parseEs5("true; false; null; this;");
    assertEquals(Token.TRUE, script.getFirstChild().getFirstChild().getType());
    assertEquals(Token.FALSE,
        script.getFirstChild().getNext().getFirstChild().getType());
    assertEquals(Token.NULL,
        script.getFirstChild().getNext().getNext().getFirstChild().getType());
    assertEquals(Token.THIS, script.getLastChild().getFirstChild().getType());
  }

  // ================= label chaining =================

  @Test
  public void testMultipleLabels() {
    Node script = parseEs5("outer: inner: while (a) { b(); }");
    Node outerLabel = firstStatement(script);
    assertEquals(Token.LABEL, outerLabel.getType());
    assertEquals(Token.LABEL, outerLabel.getLastChild().getType());
  }

  // ================= reserved keyword check =================

  @Test
  public void testReservedKeywordInEs5StrictReportsError() {
    // "implements" อยู่ใน ES5_STRICT_RESERVED_KEYWORDS แต่ไม่อยู่ใน ES5_RESERVED_KEYWORDS
    parseEs5Strict("var implements = 1;");
    assertTrue(errorReporter.errors.contains("identifier is a reserved word"));
  }

  @Test
  public void testNonReservedIdentifierInEs5NoError() {
    parseEs5("var implementsFoo = 1;");
    assertTrue(errorReporter.errors.isEmpty());
  }

  // ================= new expression =================

  @Test
  public void testNewExpression() {
    Node script = parseEs5("new Foo(a, b);");
    Node newExpr = firstStatement(script).getFirstChild();
    assertEquals(Token.NEW, newExpr.getType());
    assertEquals(3, newExpr.getChildCount());
  }

  // ================= number literal =================

  @Test
  public void testNumberLiteral() {
    Node script = parseEs5("42;");
    Node num = firstStatement(script).getFirstChild();
    assertEquals(Token.NUMBER, num.getType());
    assertEquals(42.0, num.getDouble(), 0.0001);
  }

  // ================= object literal =================

  @Test
  public void testGetterInEs3ReportsErrorAndSkipsElement() {
    Node script = parseEs3("var o = { get a() { return 1; } };");
    assertTrue(errorReporter.errors.contains(IRFactory.GETTER_ERROR_MESSAGE));
    Node obj = firstStatement(script).getFirstChild().getFirstChild();
    assertEquals(Token.OBJECTLIT, obj.getType());
    assertFalse(obj.hasChildren());
  }

  @Test
  public void testSetterInEs3ReportsErrorAndSkipsElement() {
    parseEs3("var o = { set a(v) {} };");
    assertTrue(errorReporter.errors.contains(IRFactory.SETTER_ERROR_MESSAGE));
  }

  @Test
  public void testGetterWithParamInEs5ReportsError() {
    parseEs5("var o = { get a(x) { return x; } };");
    assertTrue(errorReporter.errors.contains("getters may not have parameters"));
  }

  @Test
  public void testSetterWithoutExactlyOneParamInEs5ReportsError() {
    parseEs5("var o = { set a() {} };");
    assertTrue(errorReporter.errors.contains("setters must have exactly one parameter"));
  }

  @Test
  public void testSetterWithOneParamInEs5NoError() {
    parseEs5("var o = { set a(v) {} };");
    assertFalse(errorReporter.errors.contains("setters must have exactly one parameter"));
  }

  @Test
  public void testObjectLiteralKeyTypesAllBecomeStringKey() {
    Node script = parseEs5("var o = {'a': 1, 2: 3, b: 4};");
    Node obj = firstStatement(script).getFirstChild().getFirstChild();
    assertEquals(3, obj.getChildCount());
    for (Node key = obj.getFirstChild(); key != null; key = key.getNext()) {
      assertEquals(Token.STRING_KEY, key.getType());
    }
  }

  @Test
  public void testObjectLiteralKeyQuotingBehavior() {
    // ทดสอบ 3 branch ของ transformAsString: Name(ไม่ quoted), NumberLiteral(quoted),
    // ค่าอื่น เช่น StringLiteral (quoted)
    Node script = parseEs5("var o = {'a': 1, 2: 3, b: 4};");
    Node obj = firstStatement(script).getFirstChild().getFirstChild();
    Node keyA = obj.getFirstChild();     // 'a' -> StringLiteral branch
    Node key2 = keyA.getNext();          // 2   -> NumberLiteral branch
    Node keyB = key2.getNext();          // b   -> Name branch
    assertTrue(keyA.getBooleanProp(Node.QUOTED_PROP));
    assertTrue(key2.getBooleanProp(Node.QUOTED_PROP));
    assertFalse(keyB.getBooleanProp(Node.QUOTED_PROP));
  }

  @Test
  public void testReservedWordAsUnquotedPropertyNameInEs3Warns() {
    parseEs3("var o = { if: 1 };");
    assertTrue(errorReporter.warnings.contains(IRFactory.INVALID_ES3_PROP_NAME));
  }

  @Test
  public void testReservedWordAsUnquotedPropertyNameInEs5NoWarning() {
    parseEs5("var o = { if: 1 };");
    assertFalse(errorReporter.warnings.contains(IRFactory.INVALID_ES3_PROP_NAME));
  }

  // ================= parenthesized expression =================

  @Test
  public void testParenthesizedExpressionPassThrough() {
    Node script = parseEs5("(a);");
    assertEquals(Token.NAME, firstStatement(script).getFirstChild().getType());
  }

  // ================= property get =================

  @Test
  public void testPropertyGetReservedWordEs3Warns() {
    parseEs3("a.if;");
    assertTrue(errorReporter.warnings.contains(IRFactory.INVALID_ES3_PROP_NAME));
  }

  @Test
  public void testPropertyGetNormalEs5NoWarning() {
    parseEs5("a.b;");
    assertTrue(errorReporter.warnings.isEmpty());
  }

  // ================= regexp =================

  @Test
  public void testRegExpWithFlags() {
    Node script = parseEs5("/abc/gi;");
    Node regexp = firstStatement(script).getFirstChild();
    assertEquals(Token.REGEXP, regexp.getType());
    assertEquals(2, regexp.getChildCount());
  }

  @Test
  public void testRegExpWithoutFlags() {
    Node script = parseEs5("/abc/;");
    Node regexp = firstStatement(script).getFirstChild();
    assertEquals(Token.REGEXP, regexp.getType());
    assertEquals(1, regexp.getChildCount());
  }

  // ================= return =================

  @Test
  public void testReturnWithValue() {
    Node script = parseEs5("function f() { return 1; }");
    Node ret = firstStatement(script).getLastChild().getFirstChild();
    assertEquals(Token.RETURN, ret.getType());
    assertTrue(ret.hasChildren());
  }

  @Test
  public void testReturnWithoutValue() {
    Node script = parseEs5("function f() { return; }");
    Node ret = firstStatement(script).getLastChild().getFirstChild();
    assertEquals(Token.RETURN, ret.getType());
    assertFalse(ret.hasChildren());
  }

  // ================= string literal / SLASH_V =================

  @Test
  public void testStringLiteralWithSlashV() {
    Node script = parseEs5("var s = '\\v';");
    Node str = firstStatement(script).getFirstChild().getFirstChild();
    assertEquals(Token.STRING, str.getType());
    assertTrue(str.getBooleanProp(Node.SLASH_V));
  }

  @Test
  public void testStringLiteralWithoutSlashV() {
    Node script = parseEs5("var s = 'hello';");
    Node str = firstStatement(script).getFirstChild().getFirstChild();
    assertFalse(str.getBooleanProp(Node.SLASH_V));
  }

  // ================= switch/case/default =================

  @Test
  public void testSwitchWithCaseAndDefault() {
    Node script = parseEs5("switch (a) { case 1: b(); break; default: c(); }");
    Node switchNode = firstStatement(script);
    assertEquals(Token.SWITCH, switchNode.getType());
    assertEquals(Token.CASE, switchNode.getFirstChild().getNext().getType());
    assertEquals(Token.DEFAULT_CASE, switchNode.getLastChild().getType());
  }

  @Test
  public void testSwitchCaseWithNoStatements() {
    Node script = parseEs5("switch (a) { case 1: }");
    Node caseNode = firstStatement(script).getLastChild();
    Node block = caseNode.getFirstChild();
    assertEquals(Token.BLOCK, block.getType());
    assertFalse(block.hasChildren());
  }

  // ================= throw =================

  @Test
  public void testThrowStatement() {
    Node script = parseEs5("throw a;");
    assertEquals(Token.THROW, firstStatement(script).getType());
  }

  // ================= try/catch/finally lineSet logic =================

  @Test
  public void testTryFinallyWithoutCatch() {
    Node script = parseEs5("try { a(); } finally { b(); }");
    Node tryNode = firstStatement(script);
    assertEquals(3, tryNode.getChildCount());
    Node catchBlock = tryNode.getFirstChild().getNext();
    assertFalse(catchBlock.hasChildren());
  }

  @Test
  public void testTryCatchFinally() {
    Node script = parseEs5("try { a(); } catch (e) { b(); } finally { c(); }");
    assertEquals(3, firstStatement(script).getChildCount());
  }

  // ================= unary expression =================

  @Test
  public void testNegNumberLiteralFoldedToNegativeNumber() {
    Node script = parseEs5("-5;");
    Node num = firstStatement(script).getFirstChild();
    assertEquals(Token.NUMBER, num.getType());
    assertEquals(-5.0, num.getDouble(), 0.0001);
  }

  @Test
  public void testDeletePropValid() {
    parseEs5("delete a.b;");
    assertTrue(errorReporter.errors.isEmpty());
  }

  @Test
  public void testDeleteInvalidOperandReportsError() {
    parseEs5("delete 5;");
    assertTrue(errorReporter.errors.contains(
        "Invalid delete operand. Only properties can be deleted."));
  }

  @Test
  public void testIncrementValidTarget() {
    parseEs5("a++;");
    assertTrue(errorReporter.errors.isEmpty());
  }

  @Test
  public void testIncrementInvalidTargetReportsError() {
    parseEs5("5++;");
    assertTrue(errorReporter.errors.contains("invalid increment target"));
  }

  @Test
  public void testDecrementInvalidTargetReportsError() {
    parseEs5("5--;");
    assertTrue(errorReporter.errors.contains("invalid decrement target"));
  }

  @Test
  public void testPostfixIncrSetsIncrDecrProp() {
    Node script = parseEs5("a++;");
    Node incr = firstStatement(script).getFirstChild();
    assertTrue(incr.getBooleanProp(Node.INCRDECR_PROP));
  }

  @Test
  public void testPrefixIncrDoesNotSetIncrDecrProp() {
    Node script = parseEs5("++a;");
    Node incr = firstStatement(script).getFirstChild();
    assertFalse(incr.getBooleanProp(Node.INCRDECR_PROP));
  }

  // ================= const keyword =================

  @Test
  public void testConstKeywordRejectedWhenNotAccepted() {
    Node script = parse("const x = 1;", LanguageMode.ECMASCRIPT5, false, false);
    assertFalse(errorReporter.errors.isEmpty());
    // แม้ error แต่ node ยังถูกสร้างเป็น VAR เพราะ processVariableDeclaration ไม่ return ก่อน
    assertEquals(Token.VAR, firstStatement(script).getType());
  }

  @Test
  public void testConstKeywordAcceptedWhenConfigured() {
    Node script = parse("const x = 1;", LanguageMode.ECMASCRIPT5, false, true);
    assertTrue(errorReporter.errors.isEmpty());
    assertEquals(Token.VAR, firstStatement(script).getType());
  }

  // ================= variable initializer =================

  @Test
  public void testVarWithInitializer() {
    Node script = parseEs5("var x = 1;");
    assertTrue(firstStatement(script).getFirstChild().hasChildren());
  }

  @Test
  public void testVarWithoutInitializer() {
    Node script = parseEs5("var x;");
    assertFalse(firstStatement(script).getFirstChild().hasChildren());
  }

  // ================= while / with =================

  @Test
  public void testWhileLoop() {
    Node script = parseEs5("while (a) { b(); }");
    assertEquals(Token.WHILE, firstStatement(script).getType());
  }

  @Test
  public void testWithStatement() {
    Node script = parseEs5("with (a) { b(); }");
    assertEquals(Token.WITH, firstStatement(script).getType());
  }

  // ================= directive prologue =================

  @Test
  public void testUseStrictDirectiveRemovedFromBody() {
    Node script = parseEs5("'use strict'; var x = 1;");
    assertEquals(Token.VAR, script.getFirstChild().getType());
  }

  @Test
  public void testNonDirectiveStringNotRemoved() {
    Node script = parseEs5("'not a directive'; var x = 1;");
    assertEquals(Token.EXPR_RESULT, script.getFirstChild().getType());
  }
}
```

# ตารางสรุป Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุมใน IRFactory |
|---|---|
| testEmptyScript, testSimpleVarDeclaration | Sanity/baseline path, processAstRoot, no error |
| testIfWithBlockThenAndElse / WithoutElse | `processIfStatement`: มี/ไม่มี else part |
| testIfWithSingleStatementThenGetsWrappedInBlock | `transformBlock`: else-branch (wrap เป็น BLOCK ใหม่) |
| testIfWithEmptyThenBecomesEmptyBlock | `transformBlock`: `irNode.isEmpty()` → true (wasEmptyNode) |
| testSuspiciousBlockCommentTriggersWarning / testNormalBlockCommentNoWarning | `handleBlockComment`: if-condition true/false |
| testFileOverviewJsDocAttachedToRoot / testNoFileOverviewMeansRootHasNoJSDoc | `handlePossibleFileOverviewJsDoc`, `setFileOverviewJsDoc` |
| testMisplacedTypeAnnotation* / testValidTypeAnnotation* | `validateTypeAnnotations`: switch-case GETPROP/FUNCTION, valid=true/false |
| testArrayLiteralNormal / testDestructuringArrayAssignReportsError | `processArrayLiteral`: isDestructuring true/false |
| testValidAssignmentTarget / testInvalidAssignmentTargetReportsError | `processAssignment`+`validAssignmentTarget`: true/false branch |
| testBreakWithoutLabel / WithLabel | `processBreakStatement`: label null/not-null |
| testContinueWithoutLabel / WithLabel | `processContinueStatement`: label null/not-null |
| testTryCatchNormal | `processCatchClause` (ไม่มี catchCondition) |
| testConditionalExpression | `processConditionalExpression` |
| testDoWhileLoop | `processDoLoop` |
| testElementGet | `processElementGet` |
| testForInLoop | `processForInLoop`: isForEach()=false |
| testForLoopFull / testForLoopEmptyParts | `processForLoop`, `processEmptyExpression` |
| testFunctionCall | `processFunctionCall` (lineno/charno from first child) |
| testNamedFunctionStatement / testAnonymousFunctionExpression | `processFunctionNode`: name!=null / name==null+FUNCTION_EXPRESSION |
| testInfixAddExpression | `processInfixExpression` |
| testKeywordLiterals | `processKeywordLiteral` (TRUE/FALSE/NULL/THIS) |
| testMultipleLabels | `processLabeledStatement`: loop หลาย label (prev/cur chaining) |
| testReservedKeywordInEs5StrictReportsError / testNonReservedIdentifierInEs5NoError | `isReservedKeyword` true/false branch |
| testNewExpression | `processNewExpression` |
| testNumberLiteral | `processNumberLiteral` |
| testGetterInEs3.../testSetterInEs3... | `processObjectLiteral`: ES3 + isGetter/isSetter → continue |
| testGetterWithParamInEs5.../testSetterWithoutExactlyOneParam.../testSetterWithOneParamInEs5NoError | getter/setter param validation branches |
| testObjectLiteralKeyTypesAllBecomeStringKey / testObjectLiteralKeyQuotingBehavior | `transformAsString`: Name/NumberLiteral/else branch |
| testReservedWordAsUnquotedPropertyNameInEs3Warns / ...Es5NoWarning | `isAllowedProp` true/false (object key) |
| testParenthesizedExpressionPassThrough | `processParenthesizedExpression` |
| testPropertyGetReservedWordEs3Warns / ...Es5NoWarning | `isAllowedProp` (property get) |
| testRegExpWithFlags / WithoutFlags | `processRegExpLiteral`: flags != null && !empty / else |
| testReturnWithValue / WithoutValue | `processReturnStatement`: returnValue null/not-null |
| testStringLiteralWithSlashV / WithoutSlashV | `processStringLiteral`: `\u000B` + `\v` source check |
| testSwitchWithCaseAndDefault / testSwitchCaseWithNoStatements | `processSwitchCase`: isDefault, statements null check |
| testThrowStatement | `processThrowStatement` |
| testTryFinallyWithoutCatch / testTryCatchFinally | `processTryStatement`: lineSet/finallyBlock branches |
| testNegNumberLiteralFoldedToNegativeNumber | `processUnaryExpression`: NEG+isNumber branch |
| testDeletePropValid / testDeleteInvalidOperandReportsError | DELPROP valid/invalid operand |
| testIncrementValidTarget / Invalid / testDecrementInvalidTargetReportsError | INC/DEC validAssignmentTarget branch |
| testPostfixIncrSetsIncrDecrProp / testPrefixIncrDoesNotSetIncrDecrProp | `isPostfix()` true/false |
| testConstKeywordRejectedWhenNotAccepted / AcceptedWhenConfigured | `processVariableDeclaration`: acceptConstKeyword false/true |
| testVarWithInitializer / WithoutInitializer | `processVariableInitializer`: initializer null/not-null |
| testWhileLoop / testWithStatement | `processWhileLoop` / `processWithStatement` |
| testUseStrictDirectiveRemovedFromBody / testNonDirectiveStringNotRemoved | `parseDirectives`/`isDirective`: true/false |

**หมายเหตุกรณีที่ไม่ครอบคลุม (เสี่ยงเดา behavior เกินซอร์สที่ให้มา):** `for each...in` (E4X extension), unnamed function *statement* error path, `catch (e if cond)` (Mozilla extension) — ไม่รวมไว้เพราะไม่มีข้อมูลยืนยันว่า Rhino parser fork นี้ parse syntax เหล่านี้ได้อย่างไรโดยไม่เดา config เพิ่มเติมที่ไม่มีอยู่ในซอร์ส