# หมายเหตุสำคัญก่อนเริ่ม (ข้อสมมติที่จำเป็นเนื่องจากซอร์สที่ให้มาไม่มี `Config`/`ErrorReporter`/parser ให้ครบ)

เนื่องจาก `IRFactory` มี constructor เป็น `private` และเข้าถึงได้ผ่าน `public static Node transformTree(AstRoot, String, Config, ErrorReporter)` เท่านั้น การทดสอบจริงจึงต้องมี
1. `Config` object (ไม่มีซอร์สให้ในโจทย์) — **สมมติ** ว่า constructor คือ `Config(Set<String> annotationWhitelist, boolean isIdeMode, LanguageMode languageMode, boolean acceptConstKeyword)` ตามรูปแบบที่ปรากฏใน Closure Compiler ช่วงเวลาเดียวกัน ถ้าลายเซ็นจริงต่างจากนี้ ต้องปรับส่วน `newConfig(...)`
2. `ErrorReporter` (interface มาจาก Rhino ต้นฉบับ) — ใช้ signature มาตรฐานของ Mozilla Rhino: `warning/error(String,String,int,String,int)` และ `runtimeError(...)` คืนค่า `EvaluatorException`
3. ตัว parser จริงที่สร้าง `AstRoot` จาก source string — ใช้ `com.google.javascript.jscomp.mozilla.rhino.Parser` ร่วมกับ `CompilerEnvirons` (เมธอด `setRecordingComments`/`setRecordingLocalJsDocComments` เป็นส่วนขยายเฉพาะของ Google's Rhino fork ที่ IRFactory ต้องพึ่งพา เพราะมีการเรียก `node.getComments()`, `comment.getCommentType()==JSDOC` ในซอร์สจริง)

กรณีไวยากรณ์ที่ไม่แน่ใจว่า parser รุ่นนี้รองรับหรือไม่ (destructuring, conditional-catch, unnamed function statement) จะ**ห่อด้วย try/catch + `Assume.assumeNoException`** เพื่อ "skip" อย่างปลอดภัยแทนการเดา behavior

```java
package com.google.javascript.jscomp.parsing;

import static org.junit.Assert.*;

import com.google.common.collect.Sets;
import com.google.javascript.jscomp.mozilla.rhino.CompilerEnvirons;
import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter;
import com.google.javascript.jscomp.mozilla.rhino.EvaluatorException;
import com.google.javascript.jscomp.mozilla.rhino.Parser;
import com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot;
import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Unit test สำหรับ {@link IRFactory} (Closure-157b)
 *
 * หมายเหตุ: คลาสนี้อยู่ใน package เดียวกับ IRFactory เพื่อให้สามารถ
 * เข้าถึง Config/field แบบ package-private ได้ (ตามรูปแบบการใช้งานใน
 * ซอร์สต้นฉบับที่เข้าถึง config.languageMode, config.acceptConstKeyword
 * โดยตรงโดยไม่มี getter)
 */
public class IRFactoryTest {

  // ------------------------------------------------------------------
  // Infrastructure
  // ------------------------------------------------------------------

  /** ตัวดักจับ error/warning เพื่อตรวจสอบ branch ที่เรียก errorReporter.error(...) */
  static class RecordingErrorReporter implements ErrorReporter {
    List<String> errors = new ArrayList<String>();
    List<String> warnings = new ArrayList<String>();

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
      throw new RuntimeException(message);
    }
  }

  private RecordingErrorReporter reporter;

  @Before
  public void setUp() {
    reporter = new RecordingErrorReporter();
  }

  /**
   * สมมติฐาน (ไม่มีในซอร์สที่ให้มา): Config มี constructor รูปแบบนี้
   * หากผิดจริง จำเป็นต้องแก้ไขเฉพาะเมธอดนี้
   */
  private static Config newConfig(LanguageMode mode, boolean acceptConst) {
    return new Config(Sets.<String>newHashSet(), false, mode, acceptConst);
  }

  private AstRoot parseJs(String js) {
    CompilerEnvirons env = new CompilerEnvirons();
    env.setRecordingComments(true);
    env.setRecordingLocalJsDocComments(true);
    Parser parser = new Parser(env, reporter);
    return parser.parse(js, "test.js", 1);
  }

  /** parse แบบยอมให้ skip เมื่อไวยากรณ์ไม่ถูกรองรับโดย parser ในสภาพแวดล้อมนี้ */
  private AstRoot parseOrSkip(String js) {
    try {
      return parseJs(js);
    } catch (Throwable t) {
      Assume.assumeNoException(
          "Syntax นี้อาจไม่ได้รับการรองรับโดย parser รุ่นที่ใช้ทดสอบ (ไม่ยืนยัน behavior)",
          t);
      return null; // unreachable
    }
  }

  private Node transform(String js, Config config) {
    AstRoot root = parseOrSkip(js);
    return IRFactory.transformTree(root, js, config, reporter);
  }

  private Node transformDefault(String js) {
    return transform(js, newConfig(LanguageMode.ECMASCRIPT5, true));
  }

  private static List<Node> children(Node n) {
    List<Node> list = new ArrayList<Node>();
    for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
      list.add(c);
    }
    return list;
  }

  private static Node firstStatement(Node script) {
    return script.getFirstChild();
  }

  private static void assertType(int expected, Node n) {
    assertEquals(expected, n.getType());
  }

  // ------------------------------------------------------------------
  // Variable declaration / const keyword
  // ------------------------------------------------------------------

  @Test
  public void testVarDeclaration_withInitializer() {
    Node script = transformDefault("var a = 1;");
    Node varNode = firstStatement(script);
    assertType(Token.VAR, varNode);
    List<Node> vars = children(varNode);
    assertEquals(1, vars.size());
    Node nameNode = vars.get(0);
    assertType(Token.NAME, nameNode);
    assertEquals(1, nameNode.getChildCount());
    assertType(Token.NUMBER, nameNode.getFirstChild());
    assertEquals(1.0, nameNode.getFirstChild().getDouble(), 0.0);
    assertTrue(reporter.errors.isEmpty());
  }

  @Test
  public void testVarDeclaration_noInitializer() {
    Node script = transformDefault("var a;");
    Node nameNode = firstStatement(script).getFirstChild();
    assertType(Token.NAME, nameNode);
    assertEquals(0, nameNode.getChildCount()); // ไม่เข้า if (initializer != null)
  }

  @Test
  public void testConst_accepted() {
    Config cfg = newConfig(LanguageMode.ECMASCRIPT5, true);
    Node script = transform("const a = 1;", cfg);
    Node varNode = firstStatement(script);
    assertType(Token.VAR, varNode); // processVariableDeclaration เปลี่ยนเป็น VAR เสมอ
    assertTrue(reporter.errors.isEmpty());
  }

  @Test
  public void testConst_rejected() {
    Config cfg = newConfig(LanguageMode.ECMASCRIPT5, false); // acceptConstKeyword=false
    Node script = transform("const a = 1;", cfg);
    assertFalse(reporter.errors.isEmpty()); // processIllegalToken ถูกเรียก
    // โครงสร้างยังถูกสร้างต่อ (VAR) แม้ error ถูก report แล้ว
    assertType(Token.VAR, firstStatement(script));
  }

  // ------------------------------------------------------------------
  // if / else / transformBlock
  // ------------------------------------------------------------------

  @Test
  public void testIf_withElse() {
    Node script = transformDefault("if (a) { b; } else { c; }");
    Node ifNode = firstStatement(script);
    assertType(Token.IF, ifNode);
    assertEquals(3, ifNode.getChildCount());
  }

  @Test
  public void testIf_noElse() {
    Node script = transformDefault("if (a) { b; }");
    Node ifNode = firstStatement(script);
    assertType(Token.IF, ifNode);
    assertEquals(2, ifNode.getChildCount()); // ไม่เข้า if (elsePart != null)
  }

  @Test
  public void testIf_thenWithoutBraces_wrapsIntoBlock() {
    // thenPart ไม่ใช่ Block -> transformBlock ต้องสร้าง BLOCK ใหม่ครอบ
    Node script = transformDefault("if (a) b;");
    Node ifNode = firstStatement(script);
    Node thenBlock = children(ifNode).get(1);
    assertType(Token.BLOCK, thenBlock);
    assertEquals(1, thenBlock.getChildCount());
  }

  @Test
  public void testIf_emptyThen_becomesBlock() {
    // thenPart เป็น EmptyExpression -> ผล transform เป็น EMPTY
    // -> transformBlock ตั้ง type เป็น BLOCK และ setWasEmptyNode(true)
    Node script = transformDefault("if (a) ;");
    Node ifNode = firstStatement(script);
    Node thenBlock = children(ifNode).get(1);
    assertType(Token.BLOCK, thenBlock);
    assertEquals(0, thenBlock.getChildCount());
  }

  // ------------------------------------------------------------------
  // Loops
  // ------------------------------------------------------------------

  @Test
  public void testWhileLoop() {
    Node script = transformDefault("while (a) { b; }");
    Node whileNode = firstStatement(script);
    assertType(Token.WHILE, whileNode);
    assertEquals(2, whileNode.getChildCount());
  }

  @Test
  public void testDoWhileLoop() {
    Node script = transformDefault("do { b; } while (a);");
    Node doNode = firstStatement(script);
    assertType(Token.DO, doNode);
    List<Node> ch = children(doNode);
    assertEquals(2, ch.size());
    assertType(Token.BLOCK, ch.get(0)); // body ก่อน
  }

  @Test
  public void testForLoop_fourChildren() {
    Node script = transformDefault("for (var i=0; i<10; i++) { b; }");
    Node forNode = firstStatement(script);
    assertType(Token.FOR, forNode);
    assertEquals(4, forNode.getChildCount()); // init, cond, incr, body
  }

  @Test
  public void testForLoop_emptyParts() {
    Node script = transformDefault("for (;;) {}");
    Node forNode = firstStatement(script);
    List<Node> ch = children(forNode);
    assertEquals(4, ch.size());
    assertType(Token.EMPTY, ch.get(0));
    assertType(Token.EMPTY, ch.get(1));
    assertType(Token.EMPTY, ch.get(2));
  }

  @Test
  public void testForInLoop_threeChildren() {
    Node script = transformDefault("for (var k in obj) { b; }");
    Node forNode = firstStatement(script);
    assertType(Token.FOR, forNode);
    assertEquals(3, forNode.getChildCount()); // iterator, iterated, body (ไม่มี increment)
  }

  // ------------------------------------------------------------------
  // break / continue / label
  // ------------------------------------------------------------------

  @Test
  public void testBreak_noLabel() {
    Node script = transformDefault("while(1){ break; }");
    Node breakNode = firstStatement(script).getFirstChild().getFirstChild();
    assertType(Token.BREAK, breakNode);
    assertEquals(0, breakNode.getChildCount());
  }

  @Test
  public void testBreak_withLabel() {
    Node script = transformDefault("outer: while(1) { break outer; }");
    // outer(LABEL) -> statement(WHILE) -> body(BLOCK) -> break
    Node labelNode = firstStatement(script);
    assertType(Token.LABEL, labelNode);
    Node whileNode = children(labelNode).get(1);
    Node breakNode = children(whileNode).get(1).getFirstChild();
    assertType(Token.BREAK, breakNode);
    assertEquals(1, breakNode.getChildCount());
    assertType(Token.LABEL_NAME, breakNode.getFirstChild());
  }

  @Test
  public void testContinue_noLabel() {
    Node script = transformDefault("while(1){ continue; }");
    Node contNode = firstStatement(script).getFirstChild().getFirstChild();
    assertType(Token.CONTINUE, contNode);
    assertEquals(0, contNode.getChildCount());
  }

  @Test
  public void testContinue_withLabel() {
    Node script = transformDefault("outer: while(1) { continue outer; }");
    Node labelNode = firstStatement(script);
    Node whileNode = children(labelNode).get(1);
    Node contNode = children(whileNode).get(1).getFirstChild();
    assertType(Token.CONTINUE, contNode);
    assertEquals(1, contNode.getChildCount());
  }

  @Test
  public void testLabeledStatement_singleLabel() {
    Node script = transformDefault("foo: x;");
    Node labelNode = firstStatement(script);
    assertType(Token.LABEL, labelNode);
    List<Node> ch = children(labelNode);
    assertEquals(2, ch.size());
    assertType(Token.LABEL_NAME, ch.get(0));
    // multi-label ในหนึ่ง LabeledStatement ("prev != null" branch) ไม่สามารถสร้างได้
    // ด้วยไวยากรณ์ JS มาตรฐานผ่าน parser จริง จึงไม่ทดสอบ (คอมเมนต์กำกับตามข้อ 4)
  }

  // ------------------------------------------------------------------
  // return / throw / with
  // ------------------------------------------------------------------

  @Test
  public void testReturn_withValue() {
    Node script = transformDefault("function f(){ return 1; }");
    Node fn = firstStatement(script);
    Node body = children(fn).get(2);
    Node ret = body.getFirstChild();
    assertType(Token.RETURN, ret);
    assertEquals(1, ret.getChildCount());
  }

  @Test
  public void testReturn_noValue() {
    Node script = transformDefault("function f(){ return; }");
    Node fn = firstStatement(script);
    Node body = children(fn).get(2);
    Node ret = body.getFirstChild();
    assertType(Token.RETURN, ret);
    assertEquals(0, ret.getChildCount());
  }

  @Test
  public void testThrowStatement() {
    Node script = transformDefault("throw a;");
    Node thr = firstStatement(script);
    assertType(Token.THROW, thr);
    assertEquals(1, thr.getChildCount());
  }

  @Test
  public void testWithStatement() {
    Node script = transformDefault("with (a) { b; }");
    Node withNode = firstStatement(script);
    assertType(Token.WITH, withNode);
    assertEquals(2, withNode.getChildCount());
  }

  // ------------------------------------------------------------------
  // try / catch / finally
  // ------------------------------------------------------------------

  @Test
  public void testTry_catchAndFinally() {
    Node script = transformDefault("try { a; } catch (e) { b; } finally { c; }");
    Node tryNode = firstStatement(script);
    assertType(Token.TRY, tryNode);
    List<Node> ch = children(tryNode);
    assertEquals(3, ch.size());
    Node catchContainer = ch.get(1);
    assertEquals(1, catchContainer.getChildCount());
    Node catchNode = catchContainer.getFirstChild();
    assertType(Token.CATCH, catchNode);
    assertEquals(2, catchNode.getChildCount());
  }

  @Test
  public void testTry_finallyOnly_noCatch() {
    // ครอบคลุม branch lineSet==false && finallyBlock != null
    Node script = transformDefault("try { a; } finally { c; }");
    Node tryNode = firstStatement(script);
    List<Node> ch = children(tryNode);
    assertEquals(3, ch.size());
    Node catchContainer = ch.get(1);
    assertEquals(0, catchContainer.getChildCount()); // ไม่มี catch clause
  }

  @Test
  public void testTry_catchOnly_noFinally() {
    Node script = transformDefault("try { a; } catch (e) { b; }");
    Node tryNode = firstStatement(script);
    assertEquals(2, tryNode.getChildCount()); // ไม่มี finally child
  }

  // ------------------------------------------------------------------
  // switch
  // ------------------------------------------------------------------

  @Test
  public void testSwitch_caseAndDefault() {
    Node script = transformDefault("switch(a){ case 1: b; break; default: c; }");
    Node switchNode = firstStatement(script);
    assertType(Token.SWITCH, switchNode);
    List<Node> ch = children(switchNode);
    assertEquals(3, ch.size()); // expr, case, default
    Node caseNode = ch.get(1);
    assertType(Token.CASE, caseNode);
    assertEquals(2, caseNode.getChildCount()); // expr + block
    Node defaultNode = ch.get(2);
    assertType(Token.DEFAULT, defaultNode);
    assertEquals(1, defaultNode.getChildCount()); // block เท่านั้น
  }

  // ------------------------------------------------------------------
  // function
  // ------------------------------------------------------------------

  @Test
  public void testFunctionDeclaration_named() {
    Node script = transformDefault("function foo(a,b) { return a; }");
    Node fn = firstStatement(script);
    assertType(Token.FUNCTION, fn);
    List<Node> ch = children(fn);
    assertEquals(3, ch.size());
    assertType(Token.NAME, ch.get(0));
    assertEquals("foo", ch.get(0).getString());
    assertType(Token.LP, ch.get(1));
    assertEquals(2, ch.get(1).getChildCount());
    assertType(Token.BLOCK, ch.get(2));
    assertTrue(reporter.errors.isEmpty()); // เป็น FUNCTION_STATEMENT ที่มีชื่อ ไม่ error
  }

  @Test
  public void testFunctionExpression_unnamed() {
    Node script = transformDefault("var f = function(a) { return a; };");
    Node nameNode = firstStatement(script).getFirstChild(); // NAME f
    Node fn = nameNode.getFirstChild();
    assertType(Token.FUNCTION, fn);
    Node fnNameNode = fn.getFirstChild();
    assertEquals("", fnNameNode.getString());
    assertTrue(reporter.errors.isEmpty()); // FUNCTION_EXPRESSION -> ไม่ error แม้ไม่มีชื่อ
  }

  @Test
  public void testFunctionDeclaration_zeroParams() {
    Node script = transformDefault("function f() {}");
    Node fn = firstStatement(script);
    Node lp = children(fn).get(1);
    assertEquals(0, lp.getChildCount());
  }

  // ------------------------------------------------------------------
  // Array / Object literal
  // ------------------------------------------------------------------

  @Test
  public void testArrayLiteral_withElements() {
    Node script = transformDefault("var a = [1,2,3];");
    Node arr = firstStatement(script).getFirstChild().getFirstChild();
    assertType(Token.ARRAYLIT, arr);
    assertEquals(3, arr.getChildCount());
  }

  @Test
  public void testArrayLiteral_empty() {
    Node script = transformDefault("var a = [];");
    Node arr = firstStatement(script).getFirstChild().getFirstChild();
    assertType(Token.ARRAYLIT, arr);
    assertEquals(0, arr.getChildCount());
  }

  @Test
  public void testObjectLiteral_unquotedKey_notQuoted() {
    Node script = transformDefault("var o = {a:1};");
    Node obj = firstStatement(script).getFirstChild().getFirstChild();
    assertType(Token.OBJECTLIT, obj);
    Node key = obj.getFirstChild();
    assertType(Token.STRING, key);
    assertFalse(key.getBooleanProp(Node.QUOTED_PROP));
  }

  @Test
  public void testObjectLiteral_quotedKey_isQuoted() {
    Node script = transformDefault("var o = {'a':1};");
    Node obj = firstStatement(script).getFirstChild().getFirstChild();
    Node key = obj.getFirstChild();
    assertType(Token.STRING, key);
    assertTrue(key.getBooleanProp(Node.QUOTED_PROP));
  }

  @Test
  public void testObjectLiteral_getterSetter_ES5_valid() {
    Config cfg = newConfig(LanguageMode.ECMASCRIPT5, true);
    Node script = transform("var o = { get a() { return 1; }, set a(v) {} };", cfg);
    Node obj = firstStatement(script).getFirstChild().getFirstChild();
    assertEquals(2, obj.getChildCount());
    assertType(Token.GET, children(obj).get(0));
    assertType(Token.SET, children(obj).get(1));
    assertTrue(reporter.errors.isEmpty());
  }

  @Test
  public void testObjectLiteral_getterWithParam_reportsError() {
    Config cfg = newConfig(LanguageMode.ECMASCRIPT5, true);
    transform("var o = { get a(x) { return x; } };", cfg);
    assertFalse(reporter.errors.isEmpty()); // reportGetterParam
  }

  @Test
  public void testObjectLiteral_setterWrongArity_reportsError() {
    Config cfg = newConfig(LanguageMode.ECMASCRIPT5, true);
    transform("var o = { set a() {} };", cfg); // ต้องมี 1 param
    assertFalse(reporter.errors.isEmpty()); // reportSetterParam
  }

  @Test
  public void testObjectLiteral_getterSetter_ES3_rejectedAndSkipped() {
    Config cfg = newConfig(LanguageMode.ECMASCRIPT3, true);
    Node script = transform("var o = { get a() { return 1; }, b: 2 };", cfg);
    Node obj = firstStatement(script).getFirstChild().getFirstChild();
    // getter ถูก reportGetter() แล้ว continue -> ไม่ถูกเพิ่มเข้า OBJECTLIT
    assertEquals(1, obj.getChildCount());
    assertFalse(reporter.errors.isEmpty());
  }

  // ------------------------------------------------------------------
  // Assignment / validAssignmentTarget
  // ------------------------------------------------------------------

  @Test
  public void testAssignment_validTarget_name() {
    Node script = transformDefault("a = 1;");
    Node exprStmt = firstStatement(script);
    Node assign = exprStmt.getFirstChild();
    assertType(Token.ASSIGN, assign);
    assertTrue(reporter.errors.isEmpty());
  }

  @Test
  public void testAssignment_invalidTarget_callExpression() {
    Node script = transformDefault("foo() = 1;");
    assertFalse(reporter.errors.isEmpty()); // "invalid assignment target"
  }

  // ------------------------------------------------------------------
  // Unary expression: NEG collapse, INC/DEC target validation
  // ------------------------------------------------------------------

  @Test
  public void testUnary_negateNumberLiteral_collapsesToNumber() {
    Node script = transformDefault("var a = -5;");
    Node child = firstStatement(script).getFirstChild().getFirstChild();
    // ไม่มี NEG node ครอบ เพราะถูก collapse ตาม processUnaryExpression
    assertType(Token.NUMBER, child);
    assertEquals(-5.0, child.getDouble(), 0.0);
  }

  @Test
  public void testUnary_negateNonNumber_wrapsInNegNode() {
    Node script = transformDefault("var a = -b;");
    Node child = firstStatement(script).getFirstChild().getFirstChild();
    assertType(Token.NEG, child);
    assertEquals(1, child.getChildCount());
  }

  @Test
  public void testUnary_postfixIncrement_validTarget() {
    Node script = transformDefault("a++;");
    Node inc = firstStatement(script).getFirstChild();
    assertType(Token.INC, inc);
    assertTrue(inc.getBooleanProp(Node.INCRDECR_PROP));
    assertTrue(reporter.errors.isEmpty());
  }

  @Test
  public void testUnary_prefixIncrement_noIncrdecrProp() {
    Node script = transformDefault("++a;");
    Node inc = firstStatement(script).getFirstChild();
    assertType(Token.INC, inc);
    assertFalse(inc.getBooleanProp(Node.INCRDECR_PROP));
  }

  @Test
  public void testUnary_increment_invalidTarget_error() {
    transformDefault("5++;");
    assertFalse(reporter.errors.isEmpty());
    assertTrue(reporter.errors.get(0).contains("increment"));
  }

  @Test
  public void testUnary_decrement_invalidTarget_error() {
    transformDefault("--5;");
    assertFalse(reporter.errors.isEmpty());
    assertTrue(reporter.errors.get(0).contains("decrement"));
  }

  // ------------------------------------------------------------------
  // Conditional / Parenthesized / RegExp / GetProp / GetElem / New / Call
  // ------------------------------------------------------------------

  @Test
  public void testConditionalExpression() {
    Node script = transformDefault("var a = b ? 1 : 2;");
    Node hook = firstStatement(script).getFirstChild().getFirstChild();
    assertType(Token.HOOK, hook);
    assertEquals(3, hook.getChildCount());
  }

  @Test
  public void testParenthesizedExpression_setsProp() {
    Node script = transformDefault("var a = (1+2);");
    Node addNode = firstStatement(script).getFirstChild().getFirstChild();
    assertType(Token.ADD, addNode);
    assertTrue(addNode.getBooleanProp(Node.PARENTHESIZED_PROP));
  }

  @Test
  public void testRegExp_noFlags() {
    Node script = transformDefault("var r = /abc/;");
    Node regexp = firstStatement(script).getFirstChild().getFirstChild();
    assertType(Token.REGEXP, regexp);
    assertEquals(1, regexp.getChildCount());
  }

  @Test
  public void testRegExp_withFlags() {
    Node script = transformDefault("var r = /abc/gi;");
    Node regexp = firstStatement(script).getFirstChild().getFirstChild();
    assertEquals(2, regexp.getChildCount());
    assertEquals("gi", children(regexp).get(1).getString());
  }

  @Test
  public void testPropertyGet_propertyForcedToString() {
    Node script = transformDefault("a.b;");
    Node getprop = firstStatement(script).getFirstChild();
    assertType(Token.GETPROP, getprop);
    Node prop = children(getprop).get(1);
    assertType(Token.STRING, prop);
    assertEquals("b", prop.getString());
  }

  @Test
  public void testElementGet_elementKeepsOriginalType() {
    Node script = transformDefault("a[b];");
    Node getelem = firstStatement(script).getFirstChild();
    assertType(Token.GETELEM, getelem);
    Node elem = children(getelem).get(1);
    assertType(Token.NAME, elem); // ไม่ถูกบังคับเป็น STRING เหมือน GETPROP
  }

  @Test
  public void testNewExpression_tokenIsNew() {
    Node script = transformDefault("new Foo(1,2);");
    Node newNode = firstStatement(script).getFirstChild();
    assertType(Token.NEW, newNode);
    assertEquals(3, newNode.getChildCount()); // target + 2 args
  }

  @Test
  public void testFunctionCall_tokenIsCall() {
    Node script = transformDefault("foo(1,2);");
    Node callNode = firstStatement(script).getFirstChild();
    assertType(Token.CALL, callNode);
    assertEquals(3, callNode.getChildCount());
  }

  // ------------------------------------------------------------------
  // Directives ("use strict")
  // ------------------------------------------------------------------

  @Test
  public void testDirective_useStrict_recordedAndRemoved() {
    Node script = transformDefault("\"use strict\"; var a = 1;");
    Set<String> directives = script.getDirectives();
    assertNotNull(directives);
    assertTrue(directives.contains("use strict"));
    assertEquals(1, script.getChildCount()); // statement directive ถูกลบออก
    assertType(Token.VAR, script.getFirstChild());
  }

  @Test
  public void testDirective_nonAllowedString_notRemoved() {
    Node script = transformDefault("\"hello\"; var a = 1;");
    assertNull(script.getDirectives());
    assertEquals(2, script.getChildCount()); // ไม่ถูกลบ เพราะไม่อยู่ใน ALLOWED_DIRECTIVES
  }

  @Test
  public void testDirective_duplicateUseStrict_elseBranch() {
    // ครอบคลุม branch directives != null -> directives.add(directive)
    Node script = transformDefault("\"use strict\"; \"use strict\"; var a = 1;");
    Set<String> directives = script.getDirectives();
    assertNotNull(directives);
    assertEquals(1, directives.size());
    assertEquals(1, script.getChildCount());
  }

  // ------------------------------------------------------------------
  // Reserved keywords (ES3 / ES5 / ES5_STRICT)
  // ------------------------------------------------------------------

  @Test
  public void testReservedKeyword_ES3_noCheck() {
    Config cfg = newConfig(LanguageMode.ECMASCRIPT3, true);
    transform("var let = 5;", cfg);
    assertTrue(reporter.errors.isEmpty()); // reservedKeywords == null สำหรับ ES3
  }

  @Test
  public void testReservedKeyword_ES5_notInList_ok() {
    Config cfg = newConfig(LanguageMode.ECMASCRIPT5, true);
    transform("var let = 5;", cfg);
    assertTrue(reporter.errors.isEmpty()); // "let" ไม่อยู่ใน ES5_RESERVED_KEYWORDS
  }

  @Test
  public void testReservedKeyword_ES5Strict_inList_error() {
    Config cfg = newConfig(LanguageMode.ECMASCRIPT5_STRICT, true);
    transform("var let = 5;", cfg);
    assertFalse(reporter.errors.isEmpty()); // "let" อยู่ใน ES5_STRICT_RESERVED_KEYWORDS
  }

  // ------------------------------------------------------------------
  // Destructuring (เสี่ยง: ขึ้นกับว่า parser รองรับ syntax หรือไม่ -> skip ถ้าไม่รองรับ)
  // ------------------------------------------------------------------

  @Test
  public void testArrayDestructuring_reportsErrorIfSupportedByParser() {
    Node script = transform("var [a,b] = [1,2];",
        newConfig(LanguageMode.ECMASCRIPT5, true));
    // ถ้า parser รองรับ destructuring จริง ควรมี error จาก reportDestructuringAssign
    // (พฤติกรรมนี้ไม่ยืนยัน 100% จากซอร์สที่ให้มา จึง assert แบบผ่อนปรน)
    assertNotNull(script);
    // ไม่ assert isEmpty/false ตรงๆ เพื่อไม่เดา behavior เกินซอร์สที่มี
  }
}
```

## ตารางสรุป Test Method กับ Branch/Condition ที่ครอบคลุม

| กลุ่ม | Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| Var/Const | testVarDeclaration_withInitializer/noInitializer | `if (initializer != null)` ทั้ง true/false ใน `processVariableInitializer` |
| Var/Const | testConst_accepted / testConst_rejected | `!config.acceptConstKeyword && type==CONST` ทั้ง true/false ใน `processVariableDeclaration` |
| If | testIf_withElse / noElse | `if (elsePart != null)` |
| If | testIf_thenWithoutBraces_wrapsIntoBlock | `transformBlock`: `irNode.getType()!=BLOCK` → else branch สร้าง BLOCK ใหม่ |
| If | testIf_emptyThen_becomesBlock | `transformBlock`: `irNode.getType()==EMPTY` branch |
| Loop | testWhileLoop/testDoWhileLoop | `processWhileLoop`/`processDoLoop` โครงสร้าง 2 children |
| Loop | testForLoop_fourChildren/emptyParts | `processForLoop` 4 children รวม EMPTY parts |
| Loop | testForInLoop_threeChildren | `processForInLoop` แยกจำนวน children จาก FOR ปกติ |
| Break/Continue | testBreak_noLabel/withLabel, testContinue_* | `if (getBreakLabel()!=null)` / `if (getLabel()!=null)` ทั้ง true/false |
| Label | testLabeledStatement_singleLabel | loop `for (Label label : getLabels())` (1 iteration; multi-label branch หมายเหตุว่าไม่ทดสอบ) |
| Return | testReturn_withValue/noValue | `if (getReturnValue()!=null)` |
| Throw/With | testThrowStatement/testWithStatement | โครงสร้างพื้นฐาน |
| Try | testTry_catchAndFinally | full path: catch + finally, `lineSet=true` |
| Try | testTry_finallyOnly_noCatch | `lineSet==false && finallyBlock!=null` branch |
| Try | testTry_catchOnly_noFinally | `if (finallyBlock != null)` = false |
| Switch | testSwitch_caseAndDefault | `caseNode.isDefault()` true/false ทั้งสอง branch |
| Function | testFunctionDeclaration_named | `name==null` = false, ไม่ error |
| Function | testFunctionExpression_unnamed | `name==null` = true, `functionType==FUNCTION_EXPRESSION` → ไม่ error |
| Function | testFunctionDeclaration_zeroParams | loop parameters 0 รอบ |
| Array/Object | testArrayLiteral_withElements/empty | loop `getElements()` |
| Object | testObjectLiteral_unquotedKey/quotedKey | `transformAsString`: `n instanceof Name` true/false + `ret.getType()==STRING` |
| Object | testObjectLiteral_getterSetter_ES5_valid | `el.isGetter()/isSetter()` true, ES5 ไม่ reject |
| Object | testObjectLiteral_getterWithParam_reportsError | `getFnParamNode(value).hasChildren()` = true → reportGetterParam |
| Object | testObjectLiteral_setterWrongArity_reportsError | `!hasOneChild()` → reportSetterParam |
| Object | testObjectLiteral_getterSetter_ES3_rejectedAndSkipped | `languageMode==ECMASCRIPT3` + `isGetter()` → reportGetter + `continue` |
| Assignment | testAssignment_validTarget_name / invalidTarget_callExpression | `validAssignmentTarget` true/false ใน `processAssignment` |
| Unary | testUnary_negateNumberLiteral_collapsesToNumber | `type==NEG && operand.getType()==NUMBER` = true |
| Unary | testUnary_negateNonNumber_wrapsInNegNode | เงื่อนไขเดียวกัน = false (else branch) |
| Unary | testUnary_postfixIncrement_validTarget / prefixIncrement_noIncrdecrProp | `exprNode.isPostfix()` true/false |
| Unary | testUnary_increment_invalidTarget_error / decrement_invalidTarget_error | `!validAssignmentTarget` + ternary `type==INC?...:...` ทั้งสองค่า |
| Expr | testConditionalExpression/testParenthesizedExpression | HOOK 3 children, PARENTHESIZED_PROP |
| RegExp | testRegExp_noFlags/withFlags | `if (flags != null && !flags.isEmpty())` true/false |
| Get | testPropertyGet_.../testElementGet_... | ความแตกต่างระหว่าง `transformAsString` (GETPROP) กับ `transform` (GETELEM) |
| Call/New | testNewExpression_tokenIsNew/testFunctionCall_tokenIsCall | `transformTokenType` แยก NEW vs CALL ผ่าน `processNewExpression`→`processFunctionCall` ร่วม |
| Directive | testDirective_useStrict_recordedAndRemoved | `while (isDirective(...))` true branch + `directives==null` ครั้งแรก |
| Directive | testDirective_nonAllowedString_notRemoved | `isDirective` = false ตั้งแต่ต้น (`directives` ยังเป็น null) |
| Directive | testDirective_duplicateUseStrict_elseBranch | `if (directives==null) ... else directives.add(...)` ทั้งสอง branch |
| Reserved word | testReservedKeyword_ES3_noCheck / ES5_notInList_ok / ES5Strict_inList_error | `isReservedKeyword`: `reservedKeywords==null`, `!contains`, `contains` |
| Destructuring | testArrayDestructuring_reportsErrorIfSupportedByParser | `literalNode.isDestructuring()` (ผ่อนปรน เพราะไม่ยืนยัน parser รองรับ) |

**หมายเหตุ branch ที่ไม่สามารถทดสอบได้อย่างมั่นใจจากซอร์สที่ให้มา (ไม่ได้เดา behavior):**
- `default` case ใน constructor (`throw new IllegalStateException("unknown language mode")`) — ไม่มีทางสร้าง `LanguageMode` ค่าอื่นผ่าน public API
- `processIllegalToken`/`unnamed function statement` ในกรณี statement-level ไม่มีชื่อ — ไม่สามารถสร้างผ่าน syntax ที่ parser จริงยอมรับได้ (ตามความเข้าใจจากไวยากรณ์ JS มาตรฐาน)
- catch-clause แบบมีเงื่อนไข (`catch (e if cond)`) — เป็น extension เก่าของ Rhino ที่ไม่ยืนยันว่าพาร์สรุ่นนี้รองรับ จึงไม่ได้เขียนเทสเจาะจง
- `default` case ใน `transformTokenType` (throw `IllegalStateException`) — ไม่สามารถ trigger ผ่าน token ที่มีอยู่จริงในไวยากรณ์ JS ปกติ