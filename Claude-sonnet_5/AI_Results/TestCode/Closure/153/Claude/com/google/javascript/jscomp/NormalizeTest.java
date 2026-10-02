package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

/**
 * Unit test สำหรับ com.google.javascript.jscomp.Normalize (Defects4J Closure-153b)
 *
 * หมายเหตุ:
 * - Normalize, NormalizeStatements, Compiler, CompilerOptions, Node, Token, NodeTraversal
 *   อยู่ใน package เดียวกัน/เป็นส่วนหนึ่งของโปรเจกต์เดียวกัน ไม่จำเป็นต้อง import แยก
 * - ใช้ Compiler จริง (concrete AbstractCompiler) เพื่อ parse code ผ่าน compiler.parseTestCode(...)
 *   ซึ่งเป็นรูปแบบเดียวกับที่ปรากฏใน Normalize.parseAndNormalizeTestCode() ในซอร์สต้นฉบับ
 * - ทดสอบเน้นที่ NormalizeStatements เพราะเป็น logic หลักที่ถูกแสดง (fully specified) ใน source
 */
public class NormalizeTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
    // จำเป็นสำหรับ parseTestCode ภายใน ไม่มีแสดงใน source ที่ให้มา
    // แต่เป็น setup มาตรฐานของ Compiler class ในโปรเจกต์นี้
    compiler.initOptions(new CompilerOptions());
  }

  /** helper: parse แล้ว traverse ด้วย NormalizeStatements เพียงอย่างเดียว */
  private Node parseAndNormalizeStatements(String code, boolean assertOnChange) {
    Node js = compiler.parseTestCode(code);
    NodeTraversal.traverse(compiler, js,
        new Normalize.NormalizeStatements(compiler, assertOnChange));
    return js;
  }

  // ---------- splitVarDeclarations ----------

  @Test
  public void testSplitVarDeclarations_TwoVars() {
    Node js = parseAndNormalizeStatements("var a=0,b=1;", false);
    Node first = js.getFirstChild();
    assertEquals(Token.VAR, first.getType());
    assertNull(first.getFirstChild().getNext()); // exactly 1 child
    Node second = first.getNext();
    assertNotNull(second);
    assertEquals(Token.VAR, second.getType());
    assertNull(second.getFirstChild().getNext());
    assertNull(second.getNext());
  }

  @Test
  public void testSplitVarDeclarations_ThreeVars_LoopMultipleIterations() {
    Node js = parseAndNormalizeStatements("var a,b,c;", false);
    int count = 0;
    Node stmt = js.getFirstChild();
    while (stmt != null) {
      assertEquals(Token.VAR, stmt.getType());
      assertNull(stmt.getFirstChild().getNext());
      count++;
      stmt = stmt.getNext();
    }
    assertEquals(3, count);
  }

  @Test
  public void testSplitVarDeclarations_SingleVarNoChange() {
    Node js = parseAndNormalizeStatements("var a=0;", false);
    Node first = js.getFirstChild();
    assertEquals(Token.VAR, first.getType());
    assertNull(first.getNext()); // ไม่มี statement เพิ่ม
  }

  @Test
  public void testNonVarStatementUnaffectedBySplit() {
    Node js = parseAndNormalizeStatements("foo();", false);
    assertNull(js.getFirstChild().getNext());
  }

  @Test(expected = IllegalStateException.class)
  public void testAssertOnChangeThrowsOnVarSplit() {
    // ครอบคลุม branch: if (assertOnChange) throw ...
    parseAndNormalizeStatements("var a=0,b=1;", true);
  }

  // ---------- WHILE -> FOR ----------

  @Test
  public void testWhileToForConversion() {
    Node js = parseAndNormalizeStatements("while(a) foo();", false);
    Node forNode = js.getFirstChild();
    assertEquals(Token.FOR, forNode.getType());
    Node init = forNode.getFirstChild();
    Node cond = init.getNext();
    Node incr = cond.getNext();
    Node body = incr.getNext();
    assertEquals(Token.EMPTY, init.getType());
    assertEquals(Token.EMPTY, incr.getType());
    assertNotNull(body);
    assertNull(body.getNext()); // มี 4 children เท่านั้น
  }

  // ---------- FUNCTION declaration rewrite ----------

  @Test
  public void testHoistedFunctionNotRewritten() {
    Node js = parseAndNormalizeStatements("function f(){}", false);
    assertEquals(Token.FUNCTION, js.getFirstChild().getType());
  }

  @Test
  public void testFunctionExpressionNotRewritten() {
    Node js = parseAndNormalizeStatements("var f = function() {};", false);
    Node varStmt = js.getFirstChild();
    Node nameNode = varStmt.getFirstChild();
    assertEquals(Token.FUNCTION, nameNode.getFirstChild().getType());
  }

  @Test
  public void testRewriteNonHoistedFunctionDeclaration() {
    // สมมติฐาน: NodeUtil.isHoistedFunctionDeclaration คืน false
    // สำหรับ function declaration ที่อยู่ภายใน if-block (ไม่ได้แสดงใน source ที่ให้มา
    // แต่เป็นพฤติกรรมมาตรฐานของ Closure Compiler)
    Node js = parseAndNormalizeStatements("if (x) { function f() {} }", false);
    Node ifNode = js.getFirstChild();
    Node block = ifNode.getFirstChild().getNext();
    Node stmt = block.getFirstChild();
    assertEquals(Token.VAR, stmt.getType());
    Node nameNode = stmt.getFirstChild();
    assertEquals("f", nameNode.getString());
    assertEquals(Token.FUNCTION, nameNode.getFirstChild().getType());
  }

  // ---------- extractForInitializer ----------

  @Test
  public void testExtractForInitializerVar() {
    Node js = parseAndNormalizeStatements("for(var a=0;a<10;a++);", false);
    Node varStmt = js.getFirstChild();
    assertEquals(Token.VAR, varStmt.getType());
    Node forStmt = varStmt.getNext();
    assertEquals(Token.FOR, forStmt.getType());
    assertEquals(Token.EMPTY, forStmt.getFirstChild().getType());
  }

  @Test
  public void testExtractForInitializerExpr() {
    Node js = parseAndNormalizeStatements("for(a=0;a<10;a++);", false);
    Node firstStmt = js.getFirstChild();
    assertNotNull(firstStmt);
    Node forStmt = firstStmt.getNext();
    assertEquals(Token.FOR, forStmt.getType());
    assertEquals(Token.EMPTY, forStmt.getFirstChild().getType());
  }

  @Test
  public void testExtractForInitializerAlreadyEmpty() {
    Node js = parseAndNormalizeStatements("for(;;);", false);
    Node forStmt = js.getFirstChild();
    assertEquals(Token.FOR, forStmt.getType());
    assertEquals(Token.EMPTY, forStmt.getFirstChild().getType());
    assertNull(forStmt.getNext()); // ไม่มี statement ถูกดึงออกมา
  }

  @Test
  public void testExtractForInVarDeclaration() {
    Node js = parseAndNormalizeStatements("for(var a in b);", false);
    Node varStmt = js.getFirstChild();
    assertEquals(Token.VAR, varStmt.getType());
    Node forStmt = varStmt.getNext();
    assertEquals(Token.FOR, forStmt.getType());
    Node nameInFor = forStmt.getFirstChild();
    assertEquals(Token.NAME, nameInFor.getType());
    assertEquals("a", nameInFor.getString());
  }

  @Test
  public void testExtractForInWithoutVarNoChange() {
    Node js = parseAndNormalizeStatements("for(a in b);", false);
    Node forStmt = js.getFirstChild();
    assertEquals(Token.FOR, forStmt.getType());
    assertNull(forStmt.getNext());
  }

  @Test
  public void testExtractForInitializerThroughLabel() {
    Node js = parseAndNormalizeStatements("l: for(var a=0;;);", false);
    Node first = js.getFirstChild();
    assertEquals(Token.VAR, first.getType());
    Node label = first.getNext();
    assertEquals(Token.LABEL, label.getType());
    Node forStmt = label.getLastChild();
    assertEquals(Token.FOR, forStmt.getType());
    assertEquals(Token.EMPTY, forStmt.getFirstChild().getType());
  }

  // ---------- normalizeLabels ----------

  @Test
  public void testLabelNormalizationWrapsStatement() {
    Node js = parseAndNormalizeStatements("l: foo();", false);
    Node label = js.getFirstChild();
    assertEquals(Token.LABEL, label.getType());
    Node last = label.getLastChild();
    assertEquals(Token.BLOCK, last.getType());
  }

  @Test
  public void testLabelNormalizationKeepsBlockUnchanged() {
    Node js = parseAndNormalizeStatements("l: { foo(); }", false);
    Node label = js.getFirstChild();
    Node last = label.getLastChild();
    assertEquals(Token.BLOCK, last.getType());
    assertTrue(last.getFirstChild().getType() != Token.BLOCK); // ไม่ถูกห่อซ้ำ
  }

  @Test
  public void testLabelWithForNoWrap() {
    Node js = parseAndNormalizeStatements("l: for(;;);", false);
    Node label = js.getFirstChild();
    assertEquals(Token.FOR, label.getLastChild().getType());
  }

  @Test
  public void testLabelWithWhileNoWrap() {
    Node js = parseAndNormalizeStatements("l: while(x) {}", false);
    Node label = js.getFirstChild();
    // WHILE ถูก convert เป็น FOR ในขั้นตอนถัดมา แต่ LABEL ไม่ถูกห่อ BLOCK เพิ่ม
    assertEquals(Token.FOR, label.getLastChild().getType());
  }

  @Test
  public void testLabelWithDoNoWrap() {
    Node js = parseAndNormalizeStatements("l: do {} while(x);", false);
    Node label = js.getFirstChild();
    assertEquals(Token.DO, label.getLastChild().getType());
  }

  @Test
  public void testNestedLabelNoWrap() {
    Node js = parseAndNormalizeStatements("l1: l2: foo();", false);
    Node outerLabel = js.getFirstChild();
    Node innerLabel = outerLabel.getLastChild();
    assertEquals(Token.LABEL, innerLabel.getType());
  }

  // ---------- moveNamedFunctions ----------

  @Test
  public void testMoveNamedFunctionToFront() {
    Node js = parseAndNormalizeStatements(
        "function f(){ var x; function g(){} }", false);
    Node body = js.getFirstChild().getLastChild();
    Node firstStmt = body.getFirstChild();
    assertEquals(Token.FUNCTION, firstStmt.getType());
    assertEquals("g", firstStmt.getFirstChild().getString());
    Node secondStmt = firstStmt.getNext();
    assertEquals(Token.VAR, secondStmt.getType());
  }

  @Test
  public void testMoveNamedFunctionNoChangeWhenAlreadyAtTop() {
    // assertOnChange=true เพื่อยืนยันว่าไม่มีการแก้ไขเกิดขึ้นเลย (ไม่ throw)
    Node js = parseAndNormalizeStatements(
        "function f(){ function g(){} var x; }", true);
    Node body = js.getFirstChild().getLastChild();
    Node firstStmt = body.getFirstChild();
    assertEquals(Token.FUNCTION, firstStmt.getType());
    Node secondStmt = firstStmt.getNext();
    assertEquals(Token.VAR, secondStmt.getType());
  }

  @Test
  public void testMoveNamedFunctionsEmptyBody() {
    Node js = parseAndNormalizeStatements("function f(){}", false);
    Node body = js.getFirstChild().getLastChild();
    assertNull(body.getFirstChild());
  }

  // ---------- boundary / edge ----------

  @Test
  public void testEmptyProgram() {
    Node js = parseAndNormalizeStatements("", false);
    assertNotNull(js);
    assertNull(js.getFirstChild());
  }

  // ---------- annotateConstantsByConvention (branch execution only) ----------

  @Test
  public void testObjectLiteralKeyAnnotationDoesNotCrash() {
    // ครอบคลุมสาขา isObjLitKey ใน annotateConstantsByConvention
    // ไม่ assert ค่า flag ที่แน่นอน เพราะ NodeUtil.isObjectLitKey/isConstantByConvention
    // ไม่ได้แสดงใน source ที่ให้มา
    Node js = parseAndNormalizeStatements("var o = {A_B: 1};", false);
    assertNotNull(js);
  }

  @Test
  public void testGetPropAnnotationDoesNotCrash() {
    // ครอบคลุมสาขา parent.getType()==GETPROP && parent.getLastChild()==n
    Node js = parseAndNormalizeStatements("a.B_C;", false);
    assertNotNull(js);
  }

  @Test
  public void testConstantByConventionAnnotation() {
    // หมายเหตุ: กฎ "constant by convention" (เช่นชื่อตัวแปรตัวพิมพ์ใหญ่ทั้งหมด)
    // ถูกกำหนดใน NodeUtil.isConstantByConvention/CodingConvention ซึ่งไม่ได้แสดง
    // ใน source ที่ให้มา — เป็นพฤติกรรมที่รู้จักทั่วไปของ Closure Compiler เท่านั้น
    Node js = parseAndNormalizeStatements("var CONST_NAME = 1;", false);
    Node nameNode = js.getFirstChild().getFirstChild();
    assertTrue(nameNode.getBooleanProp(Node.IS_CONSTANT_NAME));
  }
}
