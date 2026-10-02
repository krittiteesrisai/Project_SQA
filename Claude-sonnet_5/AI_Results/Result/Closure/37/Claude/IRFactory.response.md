# IRFactoryTest — ชุดทดสอบ JUnit 4 สำหรับ `IRFactory` (Closure-37b)

> **หมายเหตุสำคัญเกี่ยวกับสมมติฐาน (ตามข้อกำหนดที่ 4):**
> `IRFactory` เป็นคลาส **package-private** จึงต้องวาง test ไว้ใน package เดียวกัน (`com.google.javascript.jscomp.parsing`)
> จุดเข้า public เพียงจุดเดียวคือ `IRFactory.transformTree(AstRoot, StaticSourceFile, String, Config, ErrorReporter)`
> ซอร์สที่ให้มา **ไม่ได้แสดง** constructor/setters ทั้งหมดของ `Config` และคลาส AST ของ Rhino fork
> (`com.google.javascript.rhino.head.ast.*`) — ผมอนุมานจาก pattern การเรียกใช้ใน `IRFactory` (เช่น `config.languageMode`,
> `config.isIdeMode`, `config.acceptConstKeyword`, `loopNode.isForEach()`, `literalNode.isDestructuring()`,
> `exprNode.isPostfix()`) โดยอ้างอิง API มาตรฐานของ Mozilla Rhino ที่ Closure Compiler fork มา
> **จุดที่ผมไม่มั่นใจเพียงพอ (เช่น การควบคุม absolute position ของ `StringLiteral` เพื่อ trigger branch “\v” ที่แม่นยำ)
> ผมจะ “ข้าม” และคอมเมนต์กำกับไว้อย่างชัดเจน แทนการเดา** เพื่อไม่ให้ทดสอบ behavior ที่ไม่ยืนยันได้

```java
package com.google.javascript.jscomp.parsing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.ast.ArrayLiteral;
import com.google.javascript.rhino.head.ast.Assignment;
import com.google.javascript.rhino.head.ast.AstNode;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ast.Block;
import com.google.javascript.rhino.head.ast.BreakStatement;
import com.google.javascript.rhino.head.ast.CatchClause;
import com.google.javascript.rhino.head.ast.ConditionalExpression;
import com.google.javascript.rhino.head.ast.ContinueStatement;
import com.google.javascript.rhino.head.ast.DoLoop;
import com.google.javascript.rhino.head.ast.ElementGet;
import com.google.javascript.rhino.head.ast.EmptyExpression;
import com.google.javascript.rhino.head.ast.ExpressionStatement;
import com.google.javascript.rhino.head.ast.ForInLoop;
import com.google.javascript.rhino.head.ast.ForLoop;
import com.google.javascript.rhino.head.ast.FunctionCall;
import com.google.javascript.rhino.head.ast.FunctionNode;
import com.google.javascript.rhino.head.ast.IfStatement;
import com.google.javascript.rhino.head.ast.InfixExpression;
import com.google.javascript.rhino.head.ast.KeywordLiteral;
import com.google.javascript.rhino.head.ast.Label;
import com.google.javascript.rhino.head.ast.LabeledStatement;
import com.google.javascript.rhino.head.ast.Name;
import com.google.javascript.rhino.head.ast.NumberLiteral;
import com.google.javascript.rhino.head.ast.ObjectLiteral;
import com.google.javascript.rhino.head.ast.ObjectProperty;
import com.google.javascript.rhino.head.ast.ParenthesizedExpression;
import com.google.javascript.rhino.head.ast.PropertyGet;
import com.google.javascript.rhino.head.ast.RegExpLiteral;
import com.google.javascript.rhino.head.ast.ReturnStatement;
import com.google.javascript.rhino.head.ast.StringLiteral;
import com.google.javascript.rhino.head.ast.SwitchCase;
import com.google.javascript.rhino.head.ast.SwitchStatement;
import com.google.javascript.rhino.head.ast.TryStatement;
import com.google.javascript.rhino.head.ast.UnaryExpression;
import com.google.javascript.rhino.head.ast.VariableDeclaration;
import com.google.javascript.rhino.head.ast.VariableInitializer;
import com.google.javascript.rhino.head.ast.WhileLoop;
import com.google.javascript.rhino.head.ast.WithStatement;

public class IRFactoryTest {

  /** Fake ErrorReporter ที่เก็บ error/warning ไว้ตรวจสอบ (สัญญาแบบมาตรฐาน Rhino ErrorReporter) */
  private static class TestErrorReporter implements ErrorReporter {
    List<String> errors = new ArrayList<String>();
    List<String> warnings = new ArrayList<String>();

    public void warning(String message, String sourceName, int line,
        String lineSource, int lineOffset) {
      warnings.add(message);
    }

    public void error(String message, String sourceName, int line,
        String lineSource, int lineOffset) {
      errors.add(message);
    }

    public EvaluatorException runtimeError(String message, String sourceName,
        int line, String lineSource, int lineOffset) {
      // ไม่ถูกเรียกใช้จาก IRFactory ในซอร์สที่ให้มา
      return null;
    }
  }

  private TestErrorReporter er;

  @Before
  public void setUp() {
    er = new TestErrorReporter();
  }

  // ---------- Helpers (สมมติฐาน API ของ Config ตามที่กล่าวไว้ข้างบน) ----------

  private Config config(Config.LanguageMode mode) {
    // ASSUMPTION: Config(Set<String>, boolean isIdeMode, LanguageMode, boolean acceptConstKeyword)
    return new Config(new HashSet<String>(), false, mode, false);
  }

  private Config configFull(Config.LanguageMode mode, boolean ide, boolean acceptConst) {
    return new Config(new HashSet<String>(), ide, mode, acceptConst);
  }

  private AstRoot rootOf(AstNode... children) {
    AstRoot root = new AstRoot();
    for (AstNode c : children) {
      root.addChildToBack(c);
    }
    return root;
  }

  private Node run(AstRoot root, Config cfg, String src) {
    return IRFactory.transformTree(root, null, src, cfg, er);
  }

  private Node run(AstRoot root) {
    return run(root, config(Config.LanguageMode.ECMASCRIPT5), "");
  }

  /** ดึง child ตาม index โดยใช้ getFirstChild()/getNext() (Node API มาตรฐานของ Closure) */
  private Node child(Node n, int index) {
    Node c = n.getFirstChild();
    for (int i = 0; i < index; i++) {
      c = c.getNext();
    }
    return c;
  }

  private int childCount(Node n) {
    int count = 0;
    for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
      count++;
    }
    return count;
  }

  private Name name(String id) {
    Name n = new Name();
    n.setIdentifier(id);
    return n;
  }

  private ExpressionStatement exprStmt(AstNode e) {
    return new ExpressionStatement(e);
  }

  private FunctionNode functionExpr(int paramCount) {
    FunctionNode fn = new FunctionNode();
    fn.setFunctionType(FunctionNode.FUNCTION_EXPRESSION);
    for (int i = 0; i < paramCount; i++) {
      fn.addParam(name("p" + i));
    }
    fn.setBody(new Block());
    return fn;
  }

  // =====================================================================
  // parseDirectives / isDirective
  // =====================================================================

  @Test
  public void testEmptyScript_NoDirectives() {
    Node result = run(rootOf());
    assertEquals(Token.SCRIPT, result.getType());
    assertNull(result.getFirstChild());
    assertTrue(er.errors.isEmpty());
  }

  @Test
  public void testDirective_SingleUseStrict_Removed() {
    Node result = run(rootOf(exprStmt(new StringLiteral() {{ setValue("use strict"); }})));
    // ExpressionStatement("use strict") ถูกดึงออกเป็น directive -> ไม่เหลือ child
    assertEquals(Token.SCRIPT, result.getType());
    assertNull(result.getFirstChild());
  }

  @Test
  public void testDirective_TwoDirectivesThenNonAllowedString_LoopBranches() {
    StringLiteral s1 = new StringLiteral();
    s1.setValue("use strict");
    StringLiteral s2 = new StringLiteral();
    s2.setValue("use strict");
    StringLiteral s3 = new StringLiteral();
    s3.setValue("use loose"); // ไม่อยู่ใน ALLOWED_DIRECTIVES -> หยุดลูป
    Node result = run(rootOf(exprStmt(s1), exprStmt(s2), exprStmt(s3)));
    // เหลือ statement เดียว (s3) เพราะ directive 2 ตัวแรกถูกดึงออก (ครอบคลุม directives==null และ !=null)
    assertEquals(1, childCount(result));
    assertEquals(Token.EXPR_RESULT, result.getFirstChild().getType());
  }

  @Test
  public void testIsDirective_NonExprResultFirstChild() {
    Node result = run(rootOf(new EmptyExpression()));
    // EMPTY ไม่ใช่ EXPR_RESULT -> isDirective คืน false ทันที ไม่มีอะไรถูกลบ
    assertEquals(1, childCount(result));
  }

  @Test
  public void testIsDirective_StringNotAllowed_NotRemoved() {
    StringLiteral s = new StringLiteral();
    s.setValue("use loose");
    Node result = run(rootOf(exprStmt(s)));
    assertEquals(1, childCount(result));
  }

  // =====================================================================
  // processName / isReservedKeyword
  // =====================================================================

  @Test
  public void testReservedKeyword_ES3_NoError() {
    run(rootOf(exprStmt(name("class"))), config(Config.LanguageMode.ECMASCRIPT3), "");
    assertTrue(er.errors.isEmpty());
  }

  @Test
  public void testReservedKeyword_ES5_ReportsError() {
    run(rootOf(exprStmt(name("class"))), config(Config.LanguageMode.ECMASCRIPT5), "");
    assertEquals(1, er.errors.size());
    assertTrue(er.errors.get(0).contains("reserved word"));
  }

  @Test
  public void testReservedKeyword_ES5Strict_ReportsError() {
    run(rootOf(exprStmt(name("let"))), config(Config.LanguageMode.ECMASCRIPT5_STRICT), "");
    assertEquals(1, er.errors.size());
  }

  @Test
  public void testNonReservedKeyword_NoError() {
    run(rootOf(exprStmt(name("foo"))), config(Config.LanguageMode.ECMASCRIPT5), "");
    assertTrue(er.errors.isEmpty());
  }

  @Test
  public void testObjectLiteral_NameKeyAsString_BypassesReservedCheck() {
    // key ที่เป็น Name จะถูกแปลงผ่าน transformAsString -> processName(asString=true)
    // ซึ่ง "ข้าม" การตรวจ reserved keyword ไปเลย
    ObjectProperty p = new ObjectProperty();
    p.setLeft(name("class"));
    p.setRight(new NumberLiteral(1));
    ObjectLiteral ol = new ObjectLiteral();
    ol.addElement(p);
    run(rootOf(exprStmt(ol)), config(Config.LanguageMode.ECMASCRIPT5), "");
    assertTrue(er.errors.isEmpty());
  }

  // =====================================================================
  // processUnaryExpression
  // =====================================================================

  @Test
  public void testUnary_Neg_OnNumber_CollapsesToNegativeLiteral() {
    UnaryExpression u = new UnaryExpression();
    u.setType(com.google.javascript.rhino.head.Token.NEG);
    u.setOperand(new NumberLiteral(5));
    Node result = run(rootOf(exprStmt(u)));
    Node numberNode = child(result.getFirstChild(), 0);
    assertTrue(numberNode.isNumber());
    assertEquals(-5.0, numberNode.getDouble(), 0.0001);
  }

  @Test
  public void testUnary_Neg_OnName_WrapsInNegNode() {
    UnaryExpression u = new UnaryExpression();
    u.setType(com.google.javascript.rhino.head.Token.NEG);
    u.setOperand(name("x"));
    Node result = run(rootOf(exprStmt(u)));
    Node neg = child(result.getFirstChild(), 0);
    assertEquals(Token.NEG, neg.getType());
    assertEquals(Token.NAME, neg.getFirstChild().getType());
  }

  @Test
  public void testUnary_DelProp_OnName_NoError() {
    UnaryExpression u = new UnaryExpression();
    u.setType(com.google.javascript.rhino.head.Token.DELPROP);
    u.setOperand(name("x"));
    run(rootOf(exprStmt(u)));
    assertTrue(er.errors.isEmpty());
  }

  @Test
  public void testUnary_DelProp_OnNumber_ReportsError() {
    UnaryExpression u = new UnaryExpression();
    u.setType(com.google.javascript.rhino.head.Token.DELPROP);
    u.setOperand(new NumberLiteral(1));
    run(rootOf(exprStmt(u)));
    assertEquals(1, er.errors.size());
    assertTrue(er.errors.get(0).contains("Invalid delete operand"));
  }

  @Test
  public void testUnary_Inc_OnName_Postfix_NoErrorSetsFlag() {
    UnaryExpression u = new UnaryExpression();
    u.setType(com.google.javascript.rhino.head.Token.INC);
    u.setOperand(name("x"));
    u.setIsPostfix(true);
    Node result = run(rootOf(exprStmt(u)));
    Node incNode = child(result.getFirstChild(), 0);
    assertEquals(Token.INC, incNode.getType());
    assertTrue(incNode.getBooleanProp(Node.INCRDECR_PROP));
    assertTrue(er.errors.isEmpty());
  }

  @Test
  public void testUnary_Inc_OnNumber_ReportsError() {
    UnaryExpression u = new UnaryExpression();
    u.setType(com.google.javascript.rhino.head.Token.INC);
    u.setOperand(new NumberLiteral(1));
    run(rootOf(exprStmt(u)));
    assertEquals(1, er.errors.size());
    assertTrue(er.errors.get(0).contains("invalid increment target"));
  }

  @Test
  public void testUnary_Dec_OnNumber_ReportsError() {
    UnaryExpression u = new UnaryExpression();
    u.setType(com.google.javascript.rhino.head.Token.DEC);
    u.setOperand(new NumberLiteral(1));
    run(rootOf(exprStmt(u)));
    assertTrue(er.errors.get(0).contains("invalid decrement target"));
  }

  @Test
  public void testUnary_Inc_Prefix_FlagNotSet() {
    UnaryExpression u = new UnaryExpression();
    u.setType(com.google.javascript.rhino.head.Token.INC);
    u.setOperand(name("x"));
    u.setIsPostfix(false);
    Node result = run(rootOf(exprStmt(u)));
    Node incNode = child(result.getFirstChild(), 0);
    assertFalse(incNode.getBooleanProp(Node.INCRDECR_PROP));
  }

  // =====================================================================
  // processAssignment
  // =====================================================================

  @Test
  public void testAssignment_ValidTarget_NoError() {
    Assignment a = new Assignment();
    a.setType(com.google.javascript.rhino.head.Token.ASSIGN);
    a.setLeft(name("x"));
    a.setRight(new NumberLiteral(1));
    Node result = run(rootOf(exprStmt(a)));
    assertEquals(Token.ASSIGN, child(result.getFirstChild(), 0).getType());
    assertTrue(er.errors.isEmpty());
  }

  @Test
  public void testAssignment_InvalidTarget_ReportsError() {
    Assignment a = new Assignment();
    a.setType(com.google.javascript.rhino.head.Token.ASSIGN);
    a.setLeft(new NumberLiteral(1));
    a.setRight(new NumberLiteral(2));
    run(rootOf(exprStmt(a)));
    assertEquals(1, er.errors.size());
    assertTrue(er.errors.get(0).contains("invalid assignment target"));
  }

  // =====================================================================
  // processForInLoop
  // =====================================================================

  @Test
  public void testForInLoop_Normal() {
    ForInLoop f = new ForInLoop();
    f.setIsForEach(false);
    f.setIterator(name("k"));
    f.setIteratedObject(name("obj"));
    f.setBody(new Block());
    Node result = run(rootOf(f));
    assertEquals(Token.FOR, result.getFirstChild().getType());
    assertEquals(3, childCount(result.getFirstChild()));
  }

  @Test
  public void testForInLoop_ForEach_ReportsErrorAndFallback() {
    ForInLoop f = new ForInLoop();
    f.setIsForEach(true);
    f.setIterator(name("k"));
    f.setIteratedObject(name("obj"));
    f.setBody(new Block());
    Node result = run(rootOf(f));
    assertEquals(1, er.errors.size());
    assertTrue(er.errors.get(0).contains("for each"));
    assertEquals(Token.EXPR_RESULT, result.getFirstChild().getType());
  }

  // =====================================================================
  // processIfStatement / transformBlock
  // =====================================================================

  @Test
  public void testIfStatement_NoElse() {
    IfStatement s = new IfStatement();
    s.setCondition(name("c"));
    s.setThenPart(new Block());
    Node result = run(rootOf(s));
    assertEquals(Token.IF, result.getFirstChild().getType());
    assertEquals(2, childCount(result.getFirstChild()));
  }

  @Test
  public void testIfStatement_WithElse() {
    IfStatement s = new IfStatement();
    s.setCondition(name("c"));
    s.setThenPart(new Block());
    s.setElsePart(new Block());
    Node result = run(rootOf(s));
    assertEquals(3, childCount(result.getFirstChild()));
  }

  @Test
  public void testTransformBlock_WrapsEmptyExpression() {
    IfStatement s = new IfStatement();
    s.setCondition(name("c"));
    s.setThenPart(new EmptyExpression()); // ไม่ใช่ Block, isEmpty()==true
    Node result = run(rootOf(s));
    Node thenNode = child(result.getFirstChild(), 1);
    assertEquals(Token.BLOCK, thenNode.getType());
  }

  @Test
  public void testTransformBlock_WrapsNonBlockStatement() {
    IfStatement s = new IfStatement();
    s.setCondition(name("c"));
    s.setThenPart(exprStmt(name("x"))); // ไม่ใช่ Block, ไม่ใช่ Empty
    Node result = run(rootOf(s));
    Node thenNode = child(result.getFirstChild(), 1);
    assertEquals(Token.BLOCK, thenNode.getType());
    assertEquals(Token.EXPR_RESULT, thenNode.getFirstChild().getType());
  }

  // =====================================================================
  // processTryStatement / processCatchClause
  // =====================================================================

  @Test
  public void testTryStatement_CatchAndFinally() {
    TryStatement t = new TryStatement();
    t.setTryBlock(new Block());
    CatchClause cc = new CatchClause();
    cc.setVarName(name("e"));
    cc.setBody(new Block());
    t.addCatchClause(cc);
    t.setFinallyBlock(new Block());
    Node result = run(rootOf(t));
    assertEquals(Token.TRY, result.getFirstChild().getType());
    assertEquals(3, childCount(result.getFirstChild()));
  }

  @Test
  public void testTryStatement_NoCatchNoFinally() {
    TryStatement t = new TryStatement();
    t.setTryBlock(new Block());
    Node result = run(rootOf(t));
    assertEquals(2, childCount(result.getFirstChild()));
  }

  @Test
  public void testTryStatement_NoCatchWithFinally_SetsLineFromFinally() {
    TryStatement t = new TryStatement();
    t.setTryBlock(new Block());
    t.setFinallyBlock(new Block());
    Node result = run(rootOf(t)); // ต้องไม่ throw NPE จากการอ่าน finallyBlock.getLineno()
    assertEquals(3, childCount(result.getFirstChild()));
  }

  @Test
  public void testCatchClause_WithCondition_ReportsError() {
    TryStatement t = new TryStatement();
    t.setTryBlock(new Block());
    CatchClause cc = new CatchClause();
    cc.setVarName(name("e"));
    cc.setCatchCondition(name("cond")); // ไม่รองรับ -> error
    cc.setBody(new Block());
    t.addCatchClause(cc);
    run(rootOf(t));
    assertEquals(1, er.errors.size());
    assertTrue(er.errors.get(0).contains("Catch clauses are not supported"));
  }

  // =====================================================================
  // processSwitchStatement / processSwitchCase
  // =====================================================================

  @Test
  public void testSwitchStatement_CaseAndDefault() {
    SwitchStatement sw = new SwitchStatement();
    sw.setExpression(name("x"));

    SwitchCase caseNode = new SwitchCase();
    caseNode.setExpression(new NumberLiteral(1));
    caseNode.addStatement(exprStmt(name("y")));

    SwitchCase defaultNode = new SwitchCase(); // ไม่ setExpression -> isDefault() == true

    sw.addCase(caseNode);
    sw.addCase(defaultNode);

    Node result = run(rootOf(sw));
    Node switchNode = result.getFirstChild();
    assertEquals(Token.SWITCH, switchNode.getType());
    assertEquals(3, childCount(switchNode)); // expr + 2 case node

    Node caseIr = child(switchNode, 1);
    Node defaultIr = child(switchNode, 2);
    assertEquals(Token.CASE, caseIr.getType());
    assertEquals(Token.DEFAULT_CASE, defaultIr.getType());
    // block ของ case ปกติมี 1 statement, ของ default ไม่มี statement เลย
    assertEquals(1, childCount(caseIr.getLastChild() == null ? caseIr : caseIr));
  }

  // =====================================================================
  // processWithStatement / While / Do / For
  // =====================================================================

  @Test
  public void testWithStatement_Basic() {
    WithStatement w = new WithStatement();
    w.setExpression(name("o"));
    w.setStatement(new Block());
    Node result = run(rootOf(w));
    assertEquals(Token.WITH, result.getFirstChild().getType());
    assertEquals(2, childCount(result.getFirstChild()));
  }

  @Test
  public void testWhileLoop_Basic() {
    WhileLoop wl = new WhileLoop();
    wl.setCondition(name("c"));
    wl.setBody(new EmptyExpression());
    Node result = run(rootOf(wl));
    Node whileNode = result.getFirstChild();
    assertEquals(Token.WHILE, whileNode.getType());
    assertEquals(Token.BLOCK, child(whileNode, 1).getType());
  }

  @Test
  public void testDoLoop_Basic() {
    DoLoop dl = new DoLoop();
    dl.setBody(new Block());
    dl.setCondition(name("c"));
    Node result = run(rootOf(dl));
    Node doNode = result.getFirstChild();
    assertEquals(Token.DO, doNode.getType());
    assertEquals(Token.BLOCK, child(doNode, 0).getType());
    assertEquals(Token.NAME, child(doNode, 1).getType());
  }

  @Test
  public void testForLoop_AllEmptyClauses() {
    ForLoop fl = new ForLoop();
    fl.setInitializer(new EmptyExpression());
    fl.setCondition(new EmptyExpression());
    fl.setIncrement(new EmptyExpression());
    fl.setBody(new Block());
    Node result = run(rootOf(fl));
    Node forNode = result.getFirstChild();
    assertEquals(Token.FOR, forNode.getType());
    assertEquals(4, childCount(forNode));
    assertEquals(Token.BLOCK, child(forNode, 3).getType());
  }

  // =====================================================================
  // processFunctionCall / processElementGet / processPropertyGet
  // =====================================================================

  @Test
  public void testFunctionCall_Basic() {
    FunctionCall fc = new FunctionCall();
    fc.setTarget(name("f"));
    fc.addArgument(new NumberLiteral(1));
    fc.addArgument(new NumberLiteral(2));
    Node result = run(rootOf(exprStmt(fc)));
    Node callNode = child(result.getFirstChild(), 0);
    assertEquals(Token.CALL, callNode.getType());
    assertEquals(3, childCount(callNode));
  }

  @Test
  public void testElementGet_Basic() {
    ElementGet eg = new ElementGet();
    eg.setTarget(name("a"));
    eg.setElement(new NumberLiteral(0));
    Node result = run(rootOf(exprStmt(eg)));
    Node getElem = child(result.getFirstChild(), 0);
    assertEquals(Token.GETELEM, getElem.getType());
  }

  @Test
  public void testPropertyGet_TransformsPropertyAsString() {
    PropertyGet pg = new PropertyGet();
    pg.setTarget(name("a"));
    pg.setProperty(name("b"));
    Node result = run(rootOf(exprStmt(pg)));
    Node getProp = child(result.getFirstChild(), 0);
    assertEquals(Token.GETPROP, getProp.getType());
    Node prop = child(getProp, 1);
    assertEquals(Token.STRING, prop.getType());
    assertEquals("b", prop.getString());
  }

  // =====================================================================
  // processConditionalExpression / ParenthesizedExpression / RegExp
  // =====================================================================

  @Test
  public void testConditionalExpression_Basic() {
    ConditionalExpression ce = new ConditionalExpression();
    ce.setTestExpression(name("t"));
    ce.setTrueExpression(new NumberLiteral(1));
    ce.setFalseExpression(new NumberLiteral(2));
    Node result = run(rootOf(exprStmt(ce)));
    Node hook = child(result.getFirstChild(), 0);
    assertEquals(Token.HOOK, hook.getType());
    assertEquals(3, childCount(hook));
  }

  @Test
  public void testParenthesizedExpression_SetsParenProp() {
    ParenthesizedExpression pe = new ParenthesizedExpression(name("x"));
    Node result = run(rootOf(exprStmt(pe)));
    Node n = child(result.getFirstChild(), 0);
    assertEquals(Token.NAME, n.getType());
    assertTrue(Boolean.TRUE.equals(n.getProp(Node.PARENTHESIZED_PROP)));
  }

  @Test
  public void testRegExpLiteral_NoFlags() {
    RegExpLiteral rl = new RegExpLiteral();
    rl.setValue("abc");
    Node result = run(rootOf(exprStmt(rl)));
    Node regexp = child(result.getFirstChild(), 0);
    assertEquals(Token.REGEXP, regexp.getType());
    assertEquals(1, childCount(regexp));
  }

  @Test
  public void testRegExpLiteral_WithFlags() {
    RegExpLiteral rl = new RegExpLiteral();
    rl.setValue("abc");
    rl.setFlags("gi");
    Node result = run(rootOf(exprStmt(rl)));
    Node regexp = child(result.getFirstChild(), 0);
    assertEquals(2, childCount(regexp));
  }

  // =====================================================================
  // Return / Break / Continue / Label
  // =====================================================================

  @Test
  public void testReturnStatement_NoValue() {
    ReturnStatement rs = new ReturnStatement();
    Node result = run(rootOf(rs));
    assertEquals(Token.RETURN, result.getFirstChild().getType());
    assertEquals(0, childCount(result.getFirstChild()));
  }

  @Test
  public void testReturnStatement_WithValue() {
    ReturnStatement rs = new ReturnStatement();
    rs.setReturnValue(new NumberLiteral(1));
    Node result = run(rootOf(rs));
    assertEquals(1, childCount(result.getFirstChild()));
  }

  @Test
  public void testBreakStatement_NoLabel() {
    BreakStatement bs = new BreakStatement();
    Node result = run(rootOf(bs));
    assertEquals(Token.BREAK, result.getFirstChild().getType());
    assertEquals(0, childCount(result.getFirstChild()));
  }

  @Test
  public void testBreakStatement_WithLabel() {
    BreakStatement bs = new BreakStatement();
    bs.setBreakLabel(name("L"));
    Node result = run(rootOf(bs));
    Node breakNode = result.getFirstChild();
    assertEquals(1, childCount(breakNode));
    assertEquals(Token.LABEL_NAME, breakNode.getFirstChild().getType());
  }

  @Test
  public void testContinueStatement_WithLabel() {
    ContinueStatement cs = new ContinueStatement();
    cs.setLabel(name("L"));
    Node result = run(rootOf(cs));
    Node contNode = result.getFirstChild();
    assertEquals(Token.CONTINUE, contNode.getType());
    assertEquals(Token.LABEL_NAME, contNode.getFirstChild().getType());
  }

  @Test
  public void testLabeledStatement_SingleLabel() {
    Label l = new Label();
    l.setName("L");
    LabeledStatement ls = new LabeledStatement();
    ls.addLabel(l);
    ls.setStatement(exprStmt(name("x")));
    Node result = run(rootOf(ls));
    Node labelNode = result.getFirstChild();
    assertEquals(Token.LABEL, labelNode.getType());
    assertEquals(2, childCount(labelNode));
    assertEquals(Token.LABEL_NAME, child(labelNode, 0).getType());
    assertEquals(Token.EXPR_RESULT, child(labelNode, 1).getType());
  }

  @Test
  public void testLabeledStatement_MultipleLabels_NestedChain() {
    Label l1 = new Label();
    l1.setName("L1");
    Label l2 = new Label();
    l2.setName("L2");
    LabeledStatement ls = new LabeledStatement();
    ls.addLabel(l1);
    ls.addLabel(l2);
    ls.setStatement(exprStmt(name("x")));
    Node result = run(rootOf(ls));
    Node outer = result.getFirstChild();
    assertEquals(Token.LABEL, outer.getType());
    assertEquals(2, childCount(outer));
    Node inner = child(outer, 1);
    assertEquals(Token.LABEL, inner.getType());
    assertEquals(2, childCount(inner));
    assertEquals(Token.EXPR_RESULT, child(inner, 1).getType());
  }

  // =====================================================================
  // VariableDeclaration / VariableInitializer
  // =====================================================================

  @Test
  public void testVariableDeclaration_Basic() {
    VariableInitializer vi = new VariableInitializer();
    vi.setTarget(name("x"));
    vi.setInitializer(new NumberLiteral(1));
    VariableDeclaration vd = new VariableDeclaration();
    vd.addVariable(vi);
    Node result = run(rootOf(vd));
    Node varNode = result.getFirstChild();
    assertEquals(Token.VAR, varNode.getType());
    Node nameNode = varNode.getFirstChild();
    assertEquals(1, childCount(nameNode));
  }

  @Test
  public void testVariableInitializer_NoInitializer() {
    VariableInitializer vi = new VariableInitializer();
    vi.setTarget(name("x"));
    VariableDeclaration vd = new VariableDeclaration();
    vd.addVariable(vi);
    Node result = run(rootOf(vd));
    Node nameNode = result.getFirstChild().getFirstChild();
    assertEquals(0, childCount(nameNode));
  }

  @Test
  public void testVariableDeclaration_ConstRejected_ButStillBuilt() {
    VariableDeclaration vd = new VariableDeclaration();
    vd.setType(com.google.javascript.rhino.head.Token.CONST);
    VariableInitializer vi = new VariableInitializer();
    vi.setTarget(name("x"));
    vd.addVariable(vi);
    Node result = run(rootOf(vd), configFull(Config.LanguageMode.ECMASCRIPT5, false, false), "");
    // acceptConstKeyword == false -> processIllegalToken รายงาน error
    // แต่ (ตามซอร์ส) การสร้าง node VAR ยังดำเนินต่อตามปกติ - เจตนาพิเศษที่ควรทดสอบ
    assertEquals(1, er.errors.size());
    assertEquals(Token.VAR, result.getFirstChild().getType());
  }

  @Test
  public void testVariableDeclaration_ConstAccepted_NoError() {
    VariableDeclaration vd = new VariableDeclaration();
    vd.setType(com.google.javascript.rhino.head.Token.CONST);
    VariableInitializer vi = new VariableInitializer();
    vi.setTarget(name("x"));
    vd.addVariable(vi);
    Node result = run(rootOf(vd), configFull(Config.LanguageMode.ECMASCRIPT5, false, true), "");
    assertTrue(er.errors.isEmpty());
    assertEquals(Token.VAR, result.getFirstChild().getType());
  }

  // =====================================================================
  // KeywordLiteral
  // =====================================================================

  @Test
  public void testKeywordLiteral_True() {
    KeywordLiteral k = new KeywordLiteral();
    k.setType(com.google.javascript.rhino.head.Token.TRUE);
    Node result = run(rootOf(exprStmt(k)));
    assertEquals(Token.TRUE, child(result.getFirstChild(), 0).getType());
  }

  @Test
  public void testKeywordLiteral_False() {
    KeywordLiteral k = new KeywordLiteral();
    k.setType(com.google.javascript.rhino.head.Token.FALSE);
    Node result = run(rootOf(exprStmt(k)));
    assertEquals(Token.FALSE, child(result.getFirstChild(), 0).getType());
  }

  // =====================================================================
  // ObjectLiteral key stringification / getter-setter / ES3
  // =====================================================================

  @Test
  public void testObjectLiteral_NumberKeyInteger_NoTrailingZero() {
    ObjectProperty p = new ObjectProperty();
    p.setLeft(new NumberLiteral(1.0));
    p.setRight(new NumberLiteral(2));
    ObjectLiteral ol = new ObjectLiteral();
    ol.addElement(p);
    Node result = run(rootOf(exprStmt(ol)));
    Node key = child(child(result.getFirstChild(), 0), 0);
    assertEquals("1", key.getString());
    assertTrue(key.getBooleanProp(Node.QUOTED_PROP));
  }

  @Test
  public void testObjectLiteral_NumberKeyNonInteger_KeepsDecimal() {
    ObjectProperty p = new ObjectProperty();
    p.setLeft(new NumberLiteral(1.5));
    p.setRight(new NumberLiteral(2));
    ObjectLiteral ol = new ObjectLiteral();
    ol.addElement(p);
    Node result = run(rootOf(exprStmt(ol)));
    Node key = child(child(result.getFirstChild(), 0), 0);
    assertEquals("1.5", key.getString());
  }

  @Test
  public void testObjectLiteral_StringKey_QuotedProp() {
    StringLiteral sl = new StringLiteral();
    sl.setValue("a");
    ObjectProperty p = new ObjectProperty();
    p.setLeft(sl);
    p.setRight(new NumberLiteral(1));
    ObjectLiteral ol = new ObjectLiteral();
    ol.addElement(p);
    Node result = run(rootOf(exprStmt(ol)));
    Node key = child(child(result.getFirstChild(), 0), 0);
    assertEquals("a", key.getString());
    assertTrue(key.getBooleanProp(Node.QUOTED_PROP));
  }

  @Test
  public void testObjectLiteral_ES3Getter_ReportedAndSkipped() {
    ObjectProperty p = new ObjectProperty();
    p.setLeft(name("g"));
    p.setRight(new NumberLiteral(1)); // ไม่ถูกใช้เพราะ continue ก่อนถึง transform(right)
    p.setIsGetter();
    ObjectLiteral ol = new ObjectLiteral();
    ol.addElement(p);
    Node result = run(rootOf(exprStmt(ol)), config(Config.LanguageMode.ECMASCRIPT3), "");
    assertEquals(1, er.errors.size());
    assertTrue(er.errors.get(0).contains("getters are not supported"));
    assertEquals(0, childCount(child(result.getFirstChild(), 0))); // property ถูกข้าม
  }

  @Test
  public void testObjectLiteral_ES3Setter_ReportedAndSkipped() {
    ObjectProperty p = new ObjectProperty();
    p.setLeft(name("s"));
    p.setRight(new NumberLiteral(1));
    p.setIsSetter();
    ObjectLiteral ol = new ObjectLiteral();
    ol.addElement(p);
    Node result = run(rootOf(exprStmt(ol)), config(Config.LanguageMode.ECMASCRIPT3), "");
    assertEquals(1, er.errors.size());
    assertTrue(er.errors.get(0).contains("setters are not supported"));
  }

  @Test
  public void testObjectLiteral_Getter_NoParams_NoError() {
    ObjectProperty p = new ObjectProperty();
    p.setLeft(name("g"));
    p.setRight(functionExpr(0));
    p.setIsGetter();
    ObjectLiteral ol = new ObjectLiteral();
    ol.addElement(p);
    Node result = run(rootOf(exprStmt(ol)), config(Config.LanguageMode.ECMASCRIPT5), "");
    assertTrue(er.errors.isEmpty());
    Node key = child(child(result.getFirstChild(), 0), 0);
    assertEquals(Token.GETTER_DEF, key.getType());
  }

  @Test
  public void testObjectLiteral_Getter_WithParam_ReportsError() {
    ObjectProperty p = new ObjectProperty();
    p.setLeft(name("g"));
    p.setRight(functionExpr(1));
    p.setIsGetter();
    ObjectLiteral ol = new ObjectLiteral();
    ol.addElement(p);
    run(rootOf(exprStmt(ol)), config(Config.LanguageMode.ECMASCRIPT5), "");
    assertEquals(1, er.errors.size());
    assertTrue(er.errors.get(0).contains("getters may not have parameters"));
  }

  @Test
  public void testObjectLiteral_Setter_OneParam_NoError() {
    ObjectProperty p = new ObjectProperty();
    p.setLeft(name("s"));
    p.setRight(functionExpr(1));
    p.setIsSetter();
    ObjectLiteral ol = new ObjectLiteral();
    ol.addElement(p);
    run(rootOf(exprStmt(ol)), config(Config.LanguageMode.ECMASCRIPT5), "");
    assertTrue(er.errors.isEmpty());
  }

  @Test
  public void testObjectLiteral_Setter_ZeroParams_ReportsError() {
    ObjectProperty p = new ObjectProperty();
    p.setLeft(name("s"));
    p.setRight(functionExpr(0));
    p.setIsSetter();
    ObjectLiteral ol = new ObjectLiteral();
    ol.addElement(p);
    run(rootOf(exprStmt(ol)), config(Config.LanguageMode.ECMASCRIPT5), "");
    assertEquals(1, er.errors.size());
    assertTrue(er.errors.get(0).contains("setters must have exactly one parameter"));
  }

  // =====================================================================
  // ArrayLiteral / destructuring
  // =====================================================================

  @Test
  public void testArrayLiteral_Normal() {
    ArrayLiteral al = new ArrayLiteral();
    al.addElement(new NumberLiteral(1));
    al.addElement(new NumberLiteral(2));
    Node result = run(rootOf(exprStmt(al)));
    Node arr = child(result.getFirstChild(), 0);
    assertEquals(Token.ARRAYLIT, arr.getType());
    assertEquals(2, childCount(arr));
    assertTrue(er.errors.isEmpty());
  }

  @Test
  public void testArrayLiteral_Destructuring_ReportsErrorButStillBuilt() {
    ArrayLiteral al = new ArrayLiteral();
    al.setIsDestructuring(true);
    Node result = run(rootOf(exprStmt(al)));
    assertEquals(1, er.errors.size());
    assertTrue(er.errors.get(0).contains("destructuring assignment forbidden"));
    Node arr = child(result.getFirstChild(), 0);
    assertEquals(Token.ARRAYLIT, arr.getType());
  }

  // =====================================================================
  // processFunctionNode
  // =====================================================================

  @Test
  public void testFunctionNode_Named_NoError() {
    FunctionNode fn = new FunctionNode();
    fn.setFunctionName(name("foo"));
    fn.setBody(new Block());
    Node result = run(rootOf(fn));
    assertEquals(Token.FUNCTION, result.getFirstChild().getType());
    assertTrue(er.errors.isEmpty());
  }

  @Test
  public void testFunctionNode_Anonym