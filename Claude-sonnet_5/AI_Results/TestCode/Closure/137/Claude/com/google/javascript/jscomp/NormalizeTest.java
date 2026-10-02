package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests สำหรับ {@link Normalize} และ inner class
 * {@link Normalize.NormalizeStatements}, {@link Normalize.PropogateConstantAnnotations}
 *
 * หมายเหตุ: ดูข้อสมมติเกี่ยวกับ API ที่ไม่ได้แสดงในซอร์สต้นฉบับ ในคำอธิบายก่อนโค้ดนี้
 */
public class NormalizeTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  /**
   * ใช้ Compiler#parseTestCode เพื่อ parse JS -> AST (สมมติฐาน: ดูหมายเหตุด้านบน)
   */
  private Node parse(String js) {
    return compiler.parseTestCode(js);
  }

  private void runNormalizeStatements(Node root, boolean assertOnChange) {
    // Pattern เดียวกับที่ Normalize.process() ใช้เอง:
    // NodeTraversal.traverse(compiler, root, new NormalizeStatements(...));
    NodeTraversal.traverse(
        compiler, root,
        new Normalize.NormalizeStatements(compiler, assertOnChange));
  }

  // =========================================================
  // splitVarDeclarations
  // =========================================================

  @Test
  public void testSplitVarDeclaration_twoNames() {
    Node root = parse("var a, b;");
    runNormalizeStatements(root, false);

    assertEquals(2, root.getChildCount());
    Node first = root.getFirstChild();
    Node second = root.getLastChild();
    assertEquals(Token.VAR, first.getType());
    assertEquals(Token.VAR, second.getType());
    assertEquals(1, first.getChildCount());
    assertEquals(1, second.getChildCount());
    assertEquals("a", first.getFirstChild().getString());
    assertEquals("b", second.getFirstChild().getString());
  }

  @Test
  public void testSplitVarDeclaration_threeNames() {
    Node root = parse("var a, b, c;");
    runNormalizeStatements(root, false);

    assertEquals(3, root.getChildCount());
    assertEquals("a", root.getFirstChild().getFirstChild().getString());
    assertEquals("b",
        root.getFirstChild().getNext().getFirstChild().getString());
    assertEquals("c", root.getLastChild().getFirstChild().getString());
  }

  @Test
  public void testSplitVarDeclaration_singleNameNoChange() {
    Node root = parse("var a;");
    runNormalizeStatements(root, false);

    // มีชื่อเดียว -> while(firstChild != lastChild) เป็น false ทันที ไม่มีการแยก
    assertEquals(1, root.getChildCount());
    assertEquals(1, root.getFirstChild().getChildCount());
  }

  @Test(expected = IllegalStateException.class)
  public void testSplitVarDeclaration_assertOnChangeThrows() {
    Node root = parse("var a, b;");
    // assertOnChange = true -> reportCodeChange ต้อง throw IllegalStateException
    runNormalizeStatements(root, true);
  }

  // =========================================================
  // WHILE -> FOR conversion (visit())
  // =========================================================

  @Test
  public void testWhileConvertedToFor() {
    Node root = parse("while (a) { foo(); }");
    runNormalizeStatements(root, false);

    Node stmt = root.getFirstChild();
    assertEquals(Token.FOR, stmt.getType());
    // FOR ต้องมี 4 children: EMPTY(init), cond, EMPTY(incr), body
    assertEquals(4, stmt.getChildCount());
    assertEquals(Token.EMPTY, stmt.getFirstChild().getType());
    assertEquals(Token.EMPTY,
        stmt.getFirstChild().getNext().getNext().getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testWhileConvertedToFor_assertOnChangeThrows() {
    Node root = parse("while (a) { foo(); }");
    runNormalizeStatements(root, true);
  }

  // =========================================================
  // extractForInitializer
  // =========================================================

  @Test
  public void testForInitializerExtraction_varInit() {
    Node root = parse("for (var i = 0; i < 10; i++) {}");
    runNormalizeStatements(root, false);

    assertEquals(2, root.getChildCount());
    Node extracted = root.getFirstChild();
    assertEquals(Token.VAR, extracted.getType());

    Node forNode = root.getLastChild();
    assertEquals(Token.FOR, forNode.getType());
    assertEquals(Token.EMPTY, forNode.getFirstChild().getType());
  }

  @Test
  public void testForInitializerExtraction_exprInit() {
    Node root = parse("for (i = 0; i < 10; i++) {}");
    runNormalizeStatements(root, false);

    assertEquals(2, root.getChildCount());
    Node extracted = root.getFirstChild();
    // ไม่ใช่ VAR -> ใช้ NodeUtil.newExpr(init) (สมมติว่าได้ EXPR_RESULT)
    assertEquals(Token.EXPR_RESULT, extracted.getType());

    Node forNode = root.getLastChild();
    assertEquals(Token.EMPTY, forNode.getFirstChild().getType());
  }

  @Test
  public void testForIn_notExtracted() {
    Node root = parse("for (var a in b) {}");
    runNormalizeStatements(root, false);

    // NodeUtil.isForIn(c) == true -> ไม่ดึง initializer ออก
    assertEquals(1, root.getChildCount());
    Node forNode = root.getFirstChild();
    assertEquals(Token.VAR, forNode.getFirstChild().getType());
  }

  @Test
  public void testForEmptyInit_notExtracted() {
    Node root = parse("for (; i < 10; i++) {}");
    runNormalizeStatements(root, false);

    // c.getFirstChild().getType() == EMPTY อยู่แล้ว -> เงื่อนไข false ไม่มีการเปลี่ยนแปลง
    assertEquals(1, root.getChildCount());
    Node forNode = root.getFirstChild();
    assertEquals(Token.EMPTY, forNode.getFirstChild().getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testForInitializerExtraction_assertOnChangeThrows() {
    Node root = parse("for (var i = 0; i < 10; i++) {}");
    runNormalizeStatements(root, true);
  }

  @Test
  public void testForInitializerExtraction_underLabel() {
    // LABEL ก็ต้องถูก inspect (n.getType() == Token.LABEL branch)
    Node root = parse("lbl: for (var i = 0; i < 10; i++) {}");
    runNormalizeStatements(root, false);

    // var i=0 ควรถูกดึงออกมาไว้ก่อน LABEL statement
    assertEquals(2, root.getChildCount());
    assertEquals(Token.VAR, root.getFirstChild().getType());
    assertEquals(Token.LABEL, root.getLastChild().getType());
  }

  // =========================================================
  // normalizeLabels
  // =========================================================

  @Test
  public void testLabelNormalization_wrapsNonBlockChild() {
    Node root = parse("a: foo();");
    runNormalizeStatements(root, false);

    Node label = root.getFirstChild();
    assertEquals(Token.LABEL, label.getType());
    Node last = label.getLastChild();
    assertEquals(Token.BLOCK, last.getType());
    assertEquals(1, last.getChildCount());
  }

  @Test
  public void testLabelNormalization_blockNotWrapped() {
    Node root = parse("a: { foo(); }");
    runNormalizeStatements(root, false);

    Node label = root.getFirstChild();
    Node last = label.getLastChild();
    assertEquals(Token.BLOCK, last.getType());
  }

  @Test
  public void testLabelNormalization_forNotWrapped() {
    Node root = parse("a: for(;;) {}");
    runNormalizeStatements(root, false);

    Node label = root.getFirstChild();
    assertEquals(Token.FOR, label.getLastChild().getType());
  }

  @Test
  public void testLabelNormalization_doNotWrapped() {
    Node root = parse("a: do {} while(x);");
    runNormalizeStatements(root, false);

    Node label = root.getFirstChild();
    assertEquals(Token.DO, label.getLastChild().getType());
  }

  @Test
  public void testLabelNormalization_whileBecomesForButNotWrapped() {
    // ตอน normalizeLabels ตรวจสอบ (pre-order) last child ยังเป็น WHILE -> case WHILE -> return
    // จากนั้น WHILE ตัวเดียวกันถูก mutate เป็น FOR ใน visit() (post-order) ภายหลัง
    Node root = parse("a: while (x) {}");
    runNormalizeStatements(root, false);

    Node label = root.getFirstChild();
    assertEquals(Token.FOR, label.getLastChild().getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testLabelNormalization_assertOnChangeThrows() {
    Node root = parse("a: foo();");
    runNormalizeStatements(root, true);
  }

  @Test
  public void testLabelNormalization_nestedLabelNotWrapped() {
    Node root = parse("a: b: foo();");
    runNormalizeStatements(root, false);

    Node outerLabel = root.getFirstChild();
    assertEquals(Token.LABEL, outerLabel.getType());
    Node innerLabel = outerLabel.getLastChild();
    // last child ของ outer label เป็น LABEL -> case LABEL -> return (ไม่ครอบ BLOCK)
    assertEquals(Token.LABEL, innerLabel.getType());
  }

  // =========================================================
  // moveNamedFunctions
  // =========================================================

  @Test
  public void testMoveNamedFunctions_moveToFront() {
    Node root = parse("function f() { foo(); function bar() {} }");
    runNormalizeStatements(root, false);

    Node funcF = root.getFirstChild();
    assertEquals(Token.FUNCTION, funcF.getType());
    Node body = funcF.getLastChild();
    assertEquals(Token.BLOCK, body.getType());

    Node firstStmt = body.getFirstChild();
    assertEquals(Token.FUNCTION, firstStmt.getType());
    assertEquals("bar", firstStmt.getFirstChild().getString());

    Node secondStmt = firstStmt.getNext();
    assertEquals(Token.EXPR_RESULT, secondStmt.getType());
  }

  @Test
  public void testMoveNamedFunctions_alreadyAtTopNoChange() {
    Node root = parse("function f() { function bar() {} foo(); }");
    runNormalizeStatements(root, false);

    Node funcF = root.getFirstChild();
    Node body = funcF.getLastChild();
    Node firstStmt = body.getFirstChild();
    assertEquals(Token.FUNCTION, firstStmt.getType());
    assertEquals("bar", firstStmt.getFirstChild().getString());
  }

  @Test
  public void testMoveNamedFunctions_multipleDeclarationsMoved() {
    Node root = parse(
        "function f() { foo(); function bar() {} function baz() {} }");
    runNormalizeStatements(root, false);

    Node funcF = root.getFirstChild();
    Node body = funcF.getLastChild();

    Node firstStmt = body.getFirstChild();
    assertEquals(Token.FUNCTION, firstStmt.getType());
    assertEquals("bar", firstStmt.getFirstChild().getString());

    Node secondStmt = firstStmt.getNext();
    assertEquals(Token.FUNCTION, secondStmt.getType());
    assertEquals("baz", secondStmt.getFirstChild().getString());

    Node thirdStmt = secondStmt.getNext();
    assertEquals(Token.EXPR_RESULT, thirdStmt.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testMoveNamedFunctions_assertOnChangeThrows() {
    Node root = parse("function f() { foo(); function bar() {} }");
    runNormalizeStatements(root, true);
  }

  // =========================================================
  // Boundary / empty cases
  // =========================================================

  @Test
  public void testEmptyScript_noChanges() {
    Node root = parse("");
    // ไม่ควรมีการเปลี่ยนแปลงใด ๆ ดังนั้น assertOnChange=true ต้องไม่ throw
    runNormalizeStatements(root, true);
    assertEquals(0, root.getChildCount());
  }

  @Test
  public void testSplitVarInsideBlock() {
    // ทดสอบว่า splitVarDeclarations ทำงานภายใน BLOCK ด้วย (ตามคอมเมนต์ในซอร์ส)
    Node root = parse("if (x) { var a, b; }");
    runNormalizeStatements(root, false);

    Node ifNode = root.getFirstChild();
    Node thenBlock = ifNode.getFirstChild().getNext(); // [cond, thenBlock]
    assertEquals(Token.BLOCK, thenBlock.getType());
    assertEquals(2, thenBlock.getChildCount());
  }

  // =========================================================
  // PropogateConstantAnnotations - branch: n.getType() != Token.NAME
  // และ n.getString().isEmpty()
  // (ไม่ครอบคลุม branch ที่ต้องพึ่ง Scope/JSDocInfo เพราะ logic ของ
  //  Scope/Var ไม่ได้แสดงอยู่ในซอร์สที่ให้มา จึงไม่ทดสอบเพื่อไม่ให้ "เดา" behavior)
  // =========================================================

  @Test
  public void testPropogateConstantAnnotations_nonNameNodeNoOp() {
    Normalize.PropogateConstantAnnotations pass =
        new Normalize.PropogateConstantAnnotations(compiler, false);
    Node block = new Node(Token.BLOCK);
    // branch: if (n.getType() == Token.NAME) เป็น false -> ไม่ทำอะไร ไม่ throw
    pass.visit(null, block, null);
  }

  @Test
  public void testPropogateConstantAnnotations_emptyNameNoException() {
    Normalize.PropogateConstantAnnotations pass =
        new Normalize.PropogateConstantAnnotations(compiler, false);
    // สมมติฐาน: Node.newString(type, str) เป็น factory มาตรฐานของ Rhino Node
    Node emptyName = Node.newString(Token.NAME, "");
    // branch: n.getString().isEmpty() == true -> return ก่อนเรียก t.getScope()
    pass.visit(null, emptyName, null);
    assertFalse(emptyName.getBooleanProp(Node.IS_CONSTANT_NAME));
  }

  // =========================================================
  // reportCodeChange ผ่าน NormalizeStatements: assertOnChange=false ไม่ throw
  // และมีผลลัพธ์การเปลี่ยนแปลงจริง (สาขา else ของ if (assertOnChange))
  // =========================================================

  @Test
  public void testReportCodeChange_noAssert_appliesChange() {
    Node root = parse("var a, b;");
    // ไม่ควร throw และต้องมีการเปลี่ยนแปลงจริง (แยก var สำเร็จ)
    runNormalizeStatements(root, false);
    assertTrue(root.getChildCount() == 2);
  }
}
