package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import junit.framework.TestCase;

/**
 * ชุดทดสอบเชิงลึกสำหรับคลาส RenameLabels (Defects4J Closure-72b)
 * มุ่งเน้นการครอบคลุม Branch/Condition สูงสุด และจำลอง Edge Cases
 */
public class RenameLabelsTest extends TestCase {

  private Compiler compiler;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    compiler = new Compiler();
    // ตั้งค่าเบื้องต้นให้ Compiler พร้อมใช้งาน
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
  }

  /**
   * ทดสอบกรณีปกติ: Label ถูกอ้างอิงด้วย break และต้องถูกเปลี่ยนชื่อเป็นชื่อย่อ (เช่น "a")
   */
  public void testRenamedReferencedLabel() {
    // โค้ดต้นฉบับ: mylabel: { break mylabel; }
    Node root = new Node(Token.BLOCK);
    Node labelNode = new Node(Token.LABEL, Node.newString(Token.NAME, "mylabel"),
        new Node(Token.BLOCK, new Node(Token.BREAK, Node.newString(Token.NAME, "mylabel"))));
    root.addChildToBack(labelNode);

    RenameLabels pass = new RenameLabels(compiler);
    pass.process(null, root);

    // ตรวจสอบว่าป้ายกำกับถูกเปลี่ยนชื่อเป็น "a"
    assertEquals("a", labelNode.getFirstChild().getString());
    assertEquals("a", labelNode.getLastChild().getFirstChild().getFirstChild().getString());
  }

  /**
   * ทดสอบกรณี: Label ไม่ถูกอ้างอิง (Unused) จะต้องถูกลบออก (Remove unused label)
   */
  public void testUnusedLabelRemoval() {
    // โค้ดต้นฉบับ: unusedLabel: { var x = 1; }
    Node blockChild = new Node(Token.BLOCK, new Node(Token.VAR, Node.newString(Token.NAME, "x")));
    Node labelNode = new Node(Token.LABEL, Node.newString(Token.NAME, "unusedLabel"), blockChild);
    Node root = new Node(Token.BLOCK, labelNode);

    RenameLabels pass = new RenameLabels(compiler);
    pass.process(null, root);

    // ตรวจสอบว่า Label ถูกถอดออก เหลือเพียง Block ภายใน
    assertEquals(Token.BLOCK, root.getFirstChild().getType());
  }

  /**
   * ทดสอบกรณี: Unused Label ที่มี child เป็น Token.BLOCK เพื่อทดสอบ branch tryMergeBlock
   */
  public void testUnusedLabelWithBlockMerge() {
    Node innerBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(1)));
    Node labelNode = new Node(Token.LABEL, Node.newString(Token.NAME, "myblocklabel"), innerBlock);
    Node root = new Node(Token.BLOCK, labelNode);

    RenameLabels pass = new RenameLabels(compiler);
    pass.process(null, root);

    // ตรวจสอบการยุบรวม Block
    assertNotNull(root.getFirstChild());
  }

  /**
   * ทดสอบ Edge Case: Anonymous Break (break ไม่มีชื่อป้ายกำกับ)
   */
  public void testAnonymousBreak() {
    // โค้ด: { break; }
    Node breakNode = new Node(Token.BREAK); // firstChild เป็น null
    Node root = new Node(Token.BLOCK, breakNode);

    RenameLabels pass = new RenameLabels(compiler);
    // ไม่ควรเกิด NullPointerException
    pass.process(null, root);
    assertNull(breakNode.getFirstChild());
  }

  /**
   * ทดสอบ Edge Case: Nested Labels (มีการซ้อนกันของ Label หลายระดับเพื่อกระตุ้น names.size() < currentDepth)
   */
  public void testNestedLabels() {
    // label1: { label2: { break label2; break label1; } }
    Node innerBreak = new Node(Token.BREAK, Node.newString(Token.NAME, "label2"));
    Node outerBreak = new Node(Token.BREAK, Node.newString(Token.NAME, "label1"));
    
    Node innerBlock = new Node(Token.BLOCK, innerBreak, outerBreak);
    Node innerLabel = new Node(Token.LABEL, Node.newString(Token.NAME, "label2"), innerBlock);
    
    Node outerBlock = new Node(Token.BLOCK, innerLabel);
    Node outerLabel = new Node(Token.LABEL, Node.newString(Token.NAME, "label1"), outerBlock);
    
    Node root = new Node(Token.BLOCK, outerLabel);

    RenameLabels pass = new RenameLabels(compiler);
    pass.process(null, root);

    // ตรวจสอบการเปลี่ยนชื่อตามความลึก (Depth 1 เป็น "a", Depth 2 เป็น "b")
    assertEquals("a", outerLabel.getFirstChild().getString());
    assertEquals("b", innerLabel.getFirstChild().getString());
  }

  /**
   * ทดสอบ Invalid State / Precondition: ชื่อ Label ซ้ำกันใน Scope เดียวกัน ต้องเจอ IllegalStateException
   */
  public void testDuplicateLabelNamesInSameScope() {
    // labelA: { } labelA: { } (ใน Block เดียวกันหรือ scope เดียวกัน)
    Node label1 = new Node(Token.LABEL, Node.newString(Token.NAME, "labelA"), new Node(Token.BLOCK));
    Node label2 = new Node(Token.LABEL, Node.newString(Token.NAME, "labelA"), new Node(Token.BLOCK));
    Node root = new Node(Token.BLOCK, label1, label2);

    RenameLabels pass = new RenameLabels(compiler);
    try {
      pass.process(null, root);
      fail("Expected IllegalStateException due to duplicate label names in namespace");
    } catch (IllegalStateException e) {
      // ผ่านตามคาด เนื่องจาก Preconditions.checkState ตรวจจับความซ้ำซ้อน
      assertNotNull(e.getMessage());
    }
  }

  /**
   * ทดสอบ Continue กับ Label
   */
  public void testContinueLabel() {
    // loopLabel: { continue loopLabel; }
    Node continueNode = new Node(Token.CONTINUE, Node.newString(Token.NAME, "loopLabel"));
    Node labelNode = new Node(Token.LABEL, Node.newString(Token.NAME, "loopLabel"),
        new Node(Token.BLOCK, continueNode));
    Node root = new Node(Token.BLOCK, labelNode);

    RenameLabels pass = new RenameLabels(compiler);
    pass.process(null, root);

    assertEquals("a", labelNode.getFirstChild().getString());
    assertEquals("a", continueNode.getFirstChild().getString());
  }
}