package com.google.javascript.jscomp.parsing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.ImmutableSet;
import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.head.CompilerEnvirons;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.Parser;
import com.google.javascript.rhino.head.ast.AstRoot;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit tests สำหรับ {@link IRFactory} (Defects4J Closure-42b)
 *
 * หมายเหตุสำคัญ (สมมติฐานที่ไม่มีอยู่ใน source ที่ให้มาโดยตรง):
 * - Constructor ของ {@link Config} ที่ใช้ในเทสนี้อ้างอิงจาก known API ของ Closure Compiler
 *   ณ ช่วงเวลาเดียวกัน: Config(Set<String>, boolean, LanguageMode, boolean)
 *   หาก signature จริงต่างจากนี้ ต้องปรับ createConfig() ให้ตรง
 * - ใช้ Rhino Parser จริง (rhino.jar) เพื่อสร้าง AstRoot แทนการ mock AST เอง
 * - ส่ง sourceFile = null เสมอ (รองรับตามคอมเมนต์ในตัว constructor ของ IRFactory)
 */
public class IRFactoryTest {

  private TestErrorReporter errorReporter;

  /** ErrorReporter แบบเก็บ log เพื่อตรวจสอบ error/warning message จาก IRFactory */
  private static class TestErrorReporter implements ErrorReporter {
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

  @Before
  public void setUp() {
    errorReporter = new TestErrorReporter();
  }

  /** สร้าง Config ตามสมมติฐานที่ระบุไว้ในคอมเมนต์ด้านบนของคลาส */
  private Config createConfig(LanguageMode mode, boolean ideMode, boolean acceptConst) {
    return new Config(ImmutableSet.<String>of(), ideMode, mode, acceptConst);
  }

  /** parse JS source ด้วย Rhino Parser จริง แล้วส่งต่อให้ IRFactory.transformTree */
  private Node parseAndTransform(String js, Config config) {
    CompilerEnvirons env = new CompilerEnvirons();
    env.setRecordingComments(true); // จำเป็นสำหรับเทสเรื่อง block comment
    Parser parser = new Parser(env, errorReporter);
    AstRoot root = parser.parse(js, "test.js", 1);
    return IRFactory.transformTree(root, null, js, config, errorReporter);
  }

  // ===================== Basic transform =====================

  @Test
  public void testSimpleVarDeclaration() {
    Node script = parseAndTransform("var a = 1;",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    assertEquals(Token.SCRIPT, script.getType());
    assertTrue(script.hasChildren());
    assertEquals(Token.VAR, script.getFirstChild().getType());
    assertTrue(errorReporter.errors.isEmpty());
  }

  @Test
  public void testEmptyScript() {
    Node script = parseAndTransform("",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    assertEquals(Token.SCRIPT, script.getType());
    assertFalse(script.hasChildren());
  }

  // ===================== Directives (parseDirectives) =====================

  @Test
  public void testUseStrictDirectiveRemovedAndRecorded() {
    Node script = parseAndTransform("'use strict'; var a = 1;",
        createConfig(LanguageMode.ECMASCRIPT5, false, false));
    assertNotNull(script.getDirectives());
    assertTrue(script.getDirectives().contains("use strict"));
    assertEquals(Token.VAR, script.getFirstChild().getType());
  }

  @Test
  public void testNoDirectivesWhenNoUseStrict() {
    Node script = parseAndTransform("var a = 1;",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    assertNull(script.getDirectives());
  }

  // ===================== Reserved keywords branch =====================

  @Test
  public void testEs3AllowsReservedWordAsIdentifier() {
    // ES3: reservedKeywords == null -> isReservedKeyword ต้อง false เสมอ
    parseAndTransform("var super_ = 1;",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    assertTrue(errorReporter.errors.isEmpty());
  }

  @Test
  public void testEs5RejectsReservedWordAsIdentifier() {
    // NOTE: สมมติฐานว่า Rhino parser เองไม่ reject "class" ในระดับ syntax (ปล่อยให้
    // Closure ตรวจสอบเอง) — เป็นเหตุผลว่าทำไม IRFactory ต้องมี logic นี้เอง
    parseAndTransform("var class = 1;",
        createConfig(LanguageMode.ECMASCRIPT5, false, false));
    assertFalse(errorReporter.errors.isEmpty());
    assertEquals("identifier is a reserved word", errorReporter.errors.get(0));
  }

  @Test
  public void testEs5StrictRejectsStrictOnlyReservedWord() {
    // "let" อยู่เฉพาะใน ES5_STRICT_RESERVED_KEYWORDS ไม่อยู่ใน ES5_RESERVED_KEYWORDS
    parseAndTransform("var let = 1;",
        createConfig(LanguageMode.ECMASCRIPT5_STRICT, false, false));
    assertFalse(errorReporter.errors.isEmpty());
    assertEquals("identifier is a reserved word", errorReporter.errors.get(0));
  }

  @Test
  public void testEs5DoesNotRejectStrictOnlyReservedWord() {
    // "let" ไม่อยู่ใน ES5_RESERVED_KEYWORDS ธรรมดา -> ไม่ error
    parseAndTransform("var let = 1;",
        createConfig(LanguageMode.ECMASCRIPT5, false, false));
    assertTrue(errorReporter.errors.isEmpty());
  }

  // ===================== Unary expression (NEG fold, DELPROP, INC/DEC) =====================

  @Test
  public void testUnaryMinusOnNumberLiteralFoldsIntoNumberNode() {
    Node script = parseAndTransform("var a = -5;",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    Node value = script.getFirstChild().getFirstChild().getFirstChild();
    assertEquals(Token.NUMBER, value.getType());
    assertEquals(-5.0, value.getDouble(), 0.0001);
  }

  @Test
  public void testUnaryMinusOnNonNumberKeepsNegNode() {
    Node script = parseAndTransform("var a = -x;",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    Node value = script.getFirstChild().getFirstChild().getFirstChild();
    assertEquals(Token.NEG, value.getType());
  }

  @Test
  public void testDeleteOnNonPropertyReportsError() {
    parseAndTransform("delete 5;", createConfig(LanguageMode.ECMASCRIPT3, false, false));
    assertFalse(errorReporter.errors.isEmpty());
    assertTrue(errorReporter.errors.get(0).contains("Invalid delete operand"));
  }

  @Test
  public void testDeleteOnPropertyNoError() {
    parseAndTransform("delete a.b;", createConfig(LanguageMode.ECMASCRIPT3, false, false));
    assertTrue(errorReporter.errors.isEmpty());
  }

  @Test
  public void testIncrementInvalidTargetReportsError() {
    parseAndTransform("5++;", createConfig(LanguageMode.ECMASCRIPT3, false, false));
    assertFalse(errorReporter.errors.isEmpty());
    assertTrue(errorReporter.errors.get(0).contains("invalid increment target"));
  }

  @Test
  public void testDecrementInvalidTargetReportsError() {
    parseAndTransform("5--;", createConfig(LanguageMode.ECMASCRIPT3, false, false));
    assertFalse(errorReporter.errors.isEmpty());
    assertTrue(errorReporter.errors.get(0).contains("invalid decrement target"));
  }

  @Test
  public void testIncrementValidTargetNoError() {
    parseAndTransform("a++;", createConfig(LanguageMode.ECMASCRIPT3, false, false));
    assertTrue(errorReporter.errors.isEmpty());
  }

  // ===================== Assignment target validation =====================

  @Test
  public void testAssignmentToLiteralReportsError() {
    // NOTE: สมมติฐานว่า Rhino parser อนุญาต parse "5 = 1;" ทางไวยากรณ์
    parseAndTransform("5 = 1;", createConfig(LanguageMode.ECMASCRIPT3, false, false));
    assertFalse(errorReporter.errors.isEmpty());
    assertTrue(errorReporter.errors.get(0).contains("invalid assignment target"));
  }

  @Test
  public void testAssignmentToNameNoError() {
    parseAndTransform("a = 1;", createConfig(LanguageMode.ECMASCRIPT3, false, false));
    assertTrue(errorReporter.errors.isEmpty());
  }

  // ===================== Object literal getter/setter =====================

  @Test
  public void testGetterInEs3ReportsErrorAndElementSkipped() {
    Node script = parseAndTransform("var o = {get a() { return 1; }};",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    assertFalse(errorReporter.errors.isEmpty());
    assertTrue(errorReporter.errors.get(0).contains("getters are not supported"));
    Node objectLit = script.getFirstChild().getFirstChild().getFirstChild();
    assertEquals(Token.OBJECTLIT, objectLit.getType());
    assertFalse(objectLit.hasChildren()); // continue -> element ถูก skip
  }

  @Test
  public void testSetterInEs3ReportsErrorAndElementSkipped() {
    parseAndTransform("var o = {set a(x) {}};",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    assertFalse(errorReporter.errors.isEmpty());
    assertTrue(errorReporter.errors.get(0).contains("setters are not supported"));
  }

  @Test
  public void testGetterInEs5ProducesGetterDefNodeNoError() {
    Node script = parseAndTransform("var o = {get a() { return 1; }};",
        createConfig(LanguageMode.ECMASCRIPT5, false, false));
    assertTrue(errorReporter.errors.isEmpty());
    Node objectLit = script.getFirstChild().getFirstChild().getFirstChild();
    Node getterDef = objectLit.getFirstChild();
    assertEquals(Token.GETTER_DEF, getterDef.getType());
  }

  @Test
  public void testGetterWithParamReportsError() {
    parseAndTransform("var o = {get a(x) { return 1; }};",
        createConfig(LanguageMode.ECMASCRIPT5, false, false));
    assertFalse(errorReporter.errors.isEmpty());
    assertTrue(errorReporter.errors.get(0).contains("getters may not have parameters"));
  }

  @Test
  public void testSetterWithoutExactlyOneParamReportsError() {
    parseAndTransform("var o = {set a() {}};",
        createConfig(LanguageMode.ECMASCRIPT5, false, false));
    assertFalse(errorReporter.errors.isEmpty());
    assertTrue(errorReporter.errors.get(0).contains("setters must have exactly one parameter"));
  }

  @Test
  public void testSetterWithExactlyOneParamNoError() {
    parseAndTransform("var o = {set a(x) {}};",
        createConfig(LanguageMode.ECMASCRIPT5, false, false));
    assertTrue(errorReporter.errors.isEmpty());
  }

  // ===================== Regex literal =====================

  @Test
  public void testRegexLiteralWithFlags() {
    Node script = parseAndTransform("var r = /abc/gi;",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    Node regex = script.getFirstChild().getFirstChild().getFirstChild();
    assertEquals(Token.REGEXP, regex.getType());
    assertEquals(2, regex.getChildCount());
  }

  @Test
  public void testRegexLiteralWithoutFlags() {
    Node script = parseAndTransform("var r = /abc/;",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    Node regex = script.getFirstChild().getFirstChild().getFirstChild();
    assertEquals(Token.REGEXP, regex.getType());
    assertEquals(1, regex.getChildCount());
  }

  // ===================== String literal / SLASH_V =====================

  @Test
  public void testStringLiteralWithVerticalTabEscapeSetsSlashVProp() {
    // Java string "'\\v'" -> JS source: '\v'
    Node script = parseAndTransform("var s = '\\v';",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    Node str = script.getFirstChild().getFirstChild().getFirstChild();
    assertEquals(Token.STRING, str.getType());
    assertTrue(str.getBooleanProp(Node.SLASH_V));
  }

  @Test
  public void testStringLiteralWithoutVerticalTabDoesNotSetSlashVProp() {
    Node script = parseAndTransform("var s = 'hello';",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    Node str = script.getFirstChild().getFirstChild().getFirstChild();
    assertFalse(str.getBooleanProp(Node.SLASH_V));
  }

  // ===================== Block comment (SUSPICIOUS_COMMENT_WARNING) =====================

  @Test
  public void testBlockCommentWithAtSignTriggersWarning() {
    parseAndTransform("/* @something */ var a = 1;",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    assertFalse(errorReporter.warnings.isEmpty());
    assertEquals(IRFactory.SUSPICIOUS_COMMENT_WARNING, errorReporter.warnings.get(0));
  }

  @Test
  public void testBlockCommentWithoutAtSignNoWarning() {
    parseAndTransform("/* normal comment */ var a = 1;",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    assertTrue(errorReporter.warnings.isEmpty());
  }

  // ===================== const keyword =====================

  @Test
  public void testConstKeywordRejectedWhenNotAccepted() {
    parseAndTransform("const a = 1;",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    assertFalse(errorReporter.errors.isEmpty());
    assertTrue(errorReporter.errors.get(0).contains("Unsupported syntax"));
  }

  @Test
  public void testConstKeywordAcceptedWhenConfigured() {
    Node script = parseAndTransform("const a = 1;",
        createConfig(LanguageMode.ECMASCRIPT3, false, true));
    assertTrue(errorReporter.errors.isEmpty());
    assertEquals(Token.VAR, script.getFirstChild().getType());
  }

  // ===================== Labeled statement / break / continue =====================

  @Test
  public void testLabeledStatementSingleLabel() {
    Node script = parseAndTransform("foo: a = 1;",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    assertEquals(Token.LABEL, script.getFirstChild().getType());
  }

  @Test
  public void testLabeledStatementMultipleLabels() {
    Node script = parseAndTransform("a: b: x = 1;",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    Node outer = script.getFirstChild();
    assertEquals(Token.LABEL, outer.getType());
    assertEquals(2, outer.getChildCount());
    Node inner = outer.getLastChild();
    assertEquals(Token.LABEL, inner.getType());
    assertEquals(2, inner.getChildCount());
  }

  @Test
  public void testBreakWithLabel() {
    Node script = parseAndTransform("foo: while(true) { break foo; }",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    Node body = script.getFirstChild().getLastChild().getLastChild();
    Node breakStmt = body.getFirstChild();
    assertEquals(Token.BREAK, breakStmt.getType());
    assertTrue(breakStmt.hasChildren());
    assertEquals(Token.LABEL_NAME, breakStmt.getFirstChild().getType());
  }

  @Test
  public void testBreakWithoutLabel() {
    Node script = parseAndTransform("while(true) { break; }",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    Node body = script.getFirstChild().getLastChild();
    Node breakStmt = body.getFirstChild();
    assertEquals(Token.BREAK, breakStmt.getType());
    assertFalse(breakStmt.hasChildren());
  }

  @Test
  public void testContinueWithLabel() {
    Node script = parseAndTransform("foo: while(true) { continue foo; }",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    Node body = script.getFirstChild().getLastChild().getLastChild();
    Node cont = body.getFirstChild();
    assertEquals(Token.CONTINUE, cont.getType());
    assertTrue(cont.hasChildren());
  }

  @Test
  public void testContinueWithoutLabel() {
    Node script = parseAndTransform("while(true) { continue; }",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    Node body = script.getFirstChild().getLastChild();
    Node cont = body.getFirstChild();
    assertEquals(Token.CONTINUE, cont.getType());
    assertFalse(cont.hasChildren());
  }

  // ===================== If / else =====================

  @Test
  public void testIfWithoutElse() {
    Node script = parseAndTransform("if (a) { b = 1; }",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    Node ifNode = script.getFirstChild();
    assertEquals(Token.IF, ifNode.getType());
    assertEquals(2, ifNode.getChildCount());
  }

  @Test
  public void testIfWithElse() {
    Node script = parseAndTransform("if (a) { b = 1; } else { b = 2; }",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    Node ifNode = script.getFirstChild();
    assertEquals(Token.IF, ifNode.getType());
    assertEquals(3, ifNode.getChildCount());
  }

  @Test
  public void testIfBodyNotBlockGetsWrapped() {
    Node script = parseAndTransform("if (a) b();",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    Node thenBlock = script.getFirstChild().getLastChild();
    assertEquals(Token.BLOCK, thenBlock.getType());
    assertTrue(thenBlock.hasChildren());
  }

  @Test
  public void testIfBodyEmptyStatementBecomesEmptyBlock() {
    Node script = parseAndTransform("if (a);",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    Node thenBlock = script.getFirstChild().getLastChild();
    assertEquals(Token.BLOCK, thenBlock.getType());
    // NOTE: setWasEmptyNode ไม่มี getter ที่ยืนยันได้จาก source ที่ให้มา
    // จึงตรวจสอบผลลัพธ์ทางอ้อมว่าไม่มี children เท่านั้น
    assertFalse(thenBlock.hasChildren());
  }

  @Test
  public void testIfBodyAlreadyBlockNotWrapped() {
    Node script = parseAndTransform("if (a) { b(); }",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    Node thenBlock = script.getFirstChild().getLastChild();
    assertEquals(Token.BLOCK, thenBlock.getType());
    assertTrue(thenBlock.hasChildren());
  }

  // ===================== Try / catch / finally =====================

  @Test
  public void testTryWithCatchOnly() {
    Node script = parseAndTransform("try { a(); } catch (e) { b(); }",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    Node tryNode = script.getFirstChild();
    assertEquals(Token.TRY, tryNode.getType());
    assertEquals(2, tryNode.getChildCount());
  }

  @Test
  public void testTryWithFinallyOnly() {
    Node script = parseAndTransform("try { a(); } finally { c(); }",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    Node tryNode = script.getFirstChild();
    assertEquals(Token.TRY, tryNode.getType());
    assertEquals(3, tryNode.getChildCount());
  }

  @Test
  public void testTryWithCatchAndFinally() {
    Node script = parseAndTransform(
        "try { a(); } catch (e) { b(); } finally { c(); }",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    Node tryNode = script.getFirstChild();
    assertEquals(Token.TRY, tryNode.getType());
    assertEquals(3, tryNode.getChildCount());
  }

  // ===================== Loops =====================

  @Test
  public void testForLoop() {
    Node script = parseAndTransform("for (var i=0; i<10; i++) { a(); }",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    Node forNode = script.getFirstChild();
    assertEquals(Token.FOR, forNode.getType());
    assertEquals(4, forNode.getChildCount());
  }

  @Test
  public void testForInLoop() {
    Node script = parseAndTransform("for (var k in obj) { a(); }",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    Node forNode = script.getFirstChild();
    assertEquals(Token.FOR, forNode.getType());
    assertEquals(3, forNode.getChildCount());
  }

  @Test
  public void testWhileLoop() {
    Node script = parseAndTransform("while (a) { b(); }",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    assertEquals(Token.WHILE, script.getFirstChild().getType());
  }

  @Test
  public void testDoLoop() {
    Node script = parseAndTransform("do { b(); } while(a);",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    assertEquals(Token.DO, script.getFirstChild().getType());
  }

  // ===================== Switch =====================

  @Test
  public void testSwitchWithCaseAndDefault() {
    Node script = parseAndTransform(
        "switch (a) { case 1: b(); break; default: c(); }",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    Node switchNode = script.getFirstChild();
    assertEquals(Token.SWITCH, switchNode.getType());
    assertEquals(3, switchNode.getChildCount());
    Node caseNode = switchNode.getFirstChild().getNext();
    assertEquals(Token.CASE, caseNode.getType());
    Node defaultNode = switchNode.getLastChild();
    assertEquals(Token.DEFAULT_CASE, defaultNode.getType());
  }

  // ===================== Call / New =====================

  @Test
  public void testFunctionCallMultipleArgs() {
    Node script = parseAndTransform("foo(1,2);",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    Node call = script.getFirstChild().getFirstChild();
    assertEquals(Token.CALL, call.getType());
    assertEquals(3, call.getChildCount());
  }

  @Test
  public void testNewExpression() {
    Node script = parseAndTransform("new Foo(1);",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    Node newNode = script.getFirstChild().getFirstChild();
    assertEquals(Token.NEW, newNode.getType());
  }

  // ===================== Array literal / destructuring =====================

  @Test
  public void testArrayLiteral() {
    Node script = parseAndTransform("var a = [1,2,3];",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    Node arr = script.getFirstChild().getFirstChild().getFirstChild();
    assertEquals(Token.ARRAYLIT, arr.getType());
    assertEquals(3, arr.getChildCount());
  }

  @Test
  public void testDestructuringArrayAssignmentReportsError() {
    // NOTE: ต้องอาศัย Rhino parser ยอมรับ syntax นี้ทางไวยากรณ์
    // (ArrayLiteral.isDestructuring() == true) ก่อนถึง IRFactory
    parseAndTransform("[a, b] = [1, 2];",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    assertFalse(errorReporter.errors.isEmpty());
    assertTrue(errorReporter.errors.get(0).contains("destructuring assignment forbidden"));
  }

  // ===================== Number literal =====================

  @Test
  public void testNumberLiteral() {
    Node script = parseAndTransform("var a = 42;",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    Node num = script.getFirstChild().getFirstChild().getFirstChild();
    assertEquals(Token.NUMBER, num.getType());
    assertEquals(42.0, num.getDouble(), 0.0001);
  }

  // ===================== maybeSetLengthFrom (isIdeMode) =====================

  @Test
  public void testIdeModeSetsLength() {
    Node script = parseAndTransform("var a = 1;",
        createConfig(LanguageMode.ECMASCRIPT3, true, false));
    Node var = script.getFirstChild();
    assertTrue(var.getLength() > 0);
  }

  @Test
  public void testNonIdeModeDoesNotSetLength() {
    Node script = parseAndTransform("var a = 1;",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    Node var = script.getFirstChild();
    // NOTE: ค่า default ของ Node.getLength() เมื่อไม่ถูก set สมมติว่าเป็น 0
    // (ไม่ได้ยืนยัน 100% จาก source ที่ให้มา)
    assertEquals(0, var.getLength());
  }

  // ===================== position2charno =====================

  @Test
  public void testCharnoOnFirstLine() {
    Node script = parseAndTransform("var a=1;",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    assertEquals(0, script.getFirstChild().getCharno());
  }

  @Test
  public void testCharnoOnSecondLine() {
    String js = "var a=1;\nvar b=2;";
    Node script = parseAndTransform(js, createConfig(LanguageMode.ECMASCRIPT3, false, false));
    Node secondVar = script.getFirstChild().getNext();
    assertEquals(0, secondVar.getCharno());
  }

  // ===================== Parenthesized expression =====================

  @Test
  public void testParenthesizedExpressionSetsProp() {
    Node script = parseAndTransform("var a = (1);",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    Node num = script.getFirstChild().getFirstChild().getFirstChild();
    assertEquals(Token.NUMBER, num.getType());
    assertTrue(Boolean.TRUE.equals(num.getProp(Node.PARENTHESIZED_PROP)));
  }

  // ===================== With statement =====================

  @Test
  public void testWithStatement() {
    Node script = parseAndTransform("with (a) { b(); }",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    assertEquals(Token.WITH, script.getFirstChild().getType());
  }

  // ===================== VariableInitializer (with/without init) =====================

  @Test
  public void testVarWithoutInitializer() {
    Node script = parseAndTransform("var a;",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    Node name = script.getFirstChild().getFirstChild();
    assertEquals(Token.NAME, name.getType());
    assertFalse(name.hasChildren());
  }

  @Test
  public void testVarWithInitializer() {
    Node script = parseAndTransform("var a = 1;",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    Node name = script.getFirstChild().getFirstChild();
    assertTrue(name.hasChildren());
  }

  // ===================== Return statement =====================

  @Test
  public void testReturnWithValue() {
    Node script = parseAndTransform("function f() { return 1; }",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    Node body = script.getFirstChild().getLastChild();
    Node ret = body.getFirstChild();
    assertEquals(Token.RETURN, ret.getType());
    assertTrue(ret.hasChildren());
  }

  @Test
  public void testReturnWithoutValue() {
    Node script = parseAndTransform("function f() { return; }",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    Node body = script.getFirstChild().getLastChild();
    Node ret = body.getFirstChild();
    assertEquals(Token.RETURN, ret.getType());
    assertFalse(ret.hasChildren());
  }

  // ===================== Function expression (unnamed) =====================

  @Test
  public void testUnnamedFunctionExpression() {
    Node script = parseAndTransform("var f = function() { return 1; };",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    Node func = script.getFirstChild().getFirstChild().getFirstChild();
    assertEquals(Token.FUNCTION, func.getType());
    Node funcName = func.getFirstChild();
    assertEquals(Token.NAME, funcName.getType());
    assertEquals("", funcName.getString());
  }

  // ===================== PropertyGet / ElementGet =====================

  @Test
  public void testPropertyGet() {
    Node script = parseAndTransform("a.b;",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    Node getProp = script.getFirstChild().getFirstChild();
    assertEquals(Token.GETPROP, getProp.getType());
  }

  @Test
  public void testElementGet() {
    Node script = parseAndTransform("a[b];",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    Node getElem = script.getFirstChild().getFirstChild();
    assertEquals(Token.GETELEM, getElem.getType());
  }

  // ===================== Conditional expression =====================

  @Test
  public void testConditionalExpression() {
    Node script = parseAndTransform("var a = b ? 1 : 2;",
        createConfig(LanguageMode.ECMASCRIPT3, false, false));
    Node hook = script.getFirstChild().getFirstChild().getFirstChild();
    assertEquals(Token.HOOK, hook.getType());
    assertEquals(3, hook.getChildCount());
  }
}
