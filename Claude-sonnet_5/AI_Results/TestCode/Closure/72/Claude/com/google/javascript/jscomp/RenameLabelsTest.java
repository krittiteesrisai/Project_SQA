package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.common.base.Supplier;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

/**
 * Unit tests for {@link RenameLabels} (Defects4J Closure-72b).
 *
 * หมายเหตุสำคัญ (สมมติฐานที่ไม่ได้ยืนยันจากซอร์สที่ให้มาโดยตรง แต่จำเป็นสำหรับสร้าง AST):
 * - Constructors ของ {@link Node} เช่น {@code new Node(int type)} และเมธอด
 *   {@code addChildToBack}, static factory {@code Node.newString(int type, String s)}
 *   เป็น API มาตรฐานของ Closure Compiler AST (Rhino-based) ที่ RenameLabels ใช้งานอยู่
 *   (เห็นได้บางส่วนจาก removeChild/replaceChild/getFirstChild/getString ในซอร์สจริง)
 * - {@link Compiler} มี public no-arg constructor และ addToDebugLog()/reportCodeChange()
 *   ทำงานได้โดยไม่ต้องเรียก init() เพิ่ม (field เป็นค่าเริ่มต้นแบบ inline)
 * - NodeTraversal จะเรียก enterScope/exitScope เมื่อพบ Token.FUNCTION (มาตรฐานของ
 *   Closure Compiler ทุกเวอร์ชันที่ทราบ) — ใช้ในเทสของ scope isolation เท่านั้น
 */
public class RenameLabelsTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  // ---------- Helpers ----------

  /** Supplier ที่คืนชื่อตามลำดับคงที่ เพื่อให้ผลลัพธ์ deterministic ไม่พึ่ง NameGenerator จริง */
  private static Supplier<String> fixedNameSupplier(final String... names) {
    return new Supplier<String>() {
      int idx = 0;

      @Override
      public String get() {
        if (idx >= names.length) {
          throw new NoSuchElementException("Ran out of fixed test names");
        }
        return names[idx++];
      }
    };
  }

  private static Node label(String name, Node body) {
    Node lbl = new Node(Token.LABEL);
    lbl.addChildToBack(Node.newString(Token.NAME, name));
    lbl.addChildToBack(body);
    return lbl;
  }

  private static Node breakTo(String name) {
    Node b = new Node(Token.BREAK);
    if (name != null) {
      b.addChildToBack(Node.newString(Token.NAME, name));
    }
    return b;
  }

  private static Node continueTo(String name) {
    Node c = new Node(Token.CONTINUE);
    if (name != null) {
      c.addChildToBack(Node.newString(Token.NAME, name));
    }
    return c;
  }

  private static Node block(Node... children) {
    Node b = new Node(Token.BLOCK);
    for (Node c : children) {
      b.addChildToBack(c);
    }
    return b;
  }

  private static boolean containsType(Node n, int type) {
    if (n.getType() == type) {
      return true;
    }
    for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
      if (containsType(c, type)) {
        return true;
      }
    }
    return false;
  }

  // ---------- 1. Referenced label: renamed both at label and break ----------

  @Test
  public void testSingleReferencedLabel_RenamesBothLabelAndBreak() {
    Node breakNode = breakTo("outer");
    Node body = block(breakNode);
    Node lbl = label("outer", body);
    Node root = block(lbl);

    RenameLabels pass = new RenameLabels(compiler, fixedNameSupplier("a", "b", "c"), true);
    pass.process(null, root);

    assertSame(lbl, root.getFirstChild()); // ยังไม่ถูกลบ (มีการอ้างอิง)
    assertEquals(Token.LABEL, lbl.getType());
    assertEquals("a", lbl.getFirstChild().getString());
    assertEquals("a", breakNode.getFirstChild().getString());
  }

  // ---------- 2. name already equals generated name -> no rename branch ----------

  @Test
  public void testSingleReferencedLabel_NameAlreadyMatchesGeneratedName_NoRenameNeeded() {
    Node breakNode = breakTo("a");
    Node body = block(breakNode);
    Node lbl = label("a", body);
    Node root = block(lbl);

    RenameLabels pass = new RenameLabels(compiler, fixedNameSupplier("a"), true);
    pass.process(null, root);

    assertEquals("a", lbl.getFirstChild().getString());
    assertEquals("a", breakNode.getFirstChild().getString());
  }

  // ---------- 3. Unreferenced label, non-BLOCK body -> removed, tryMergeBlock branch skipped ----------

  @Test
  public void testUnreferencedLabel_NonBlockBody_RemovedAndReplacedByBody() {
    Node marker = new Node(Token.EMPTY);
    Node lbl = label("unused", marker);
    Node root = block(lbl);

    RenameLabels pass = new RenameLabels(compiler, fixedNameSupplier("a"), true);
    pass.process(null, root);

    // node.getLastChild() (marker) เข้ามาแทน LABEL โดยตรง เพราะ marker.getType() != BLOCK
    // จึงไม่เรียก NodeUtil.tryMergeBlock
    assertSame(marker, root.getFirstChild());
    assertNull(root.getFirstChild().getNext());
    assertFalse(containsType(root, Token.LABEL));
  }

  // ---------- 4. Unreferenced label, BLOCK body -> triggers tryMergeBlock branch ----------

  @Test
  public void testUnreferencedLabel_BlockBody_RemovedAndMergedIntoParent() {
    Node marker = new Node(Token.EMPTY);
    Node body = block(marker);
    Node lbl = label("unused2", body);
    Node root = block(lbl);

    RenameLabels pass = new RenameLabels(compiler, fixedNameSupplier("a"), true);
    pass.process(null, root);

    // ไม่ทราบรายละเอียดภายในของ NodeUtil.tryMergeBlock (ไม่ได้อยู่ในซอร์สที่ให้มา)
    // จึงตรวจสอบเพียง invariant ระดับสูง: label ถูกลบ และเนื้อหาภายในยังอยู่ในทรี
    assertFalse(containsType(root, Token.LABEL));
    assertTrue(containsType(root, Token.EMPTY));
  }

  // ---------- 5. removeUnused = false : คาดหวังไม่ลบ label (ตรวจจับ fault ที่สงสัย) ----------

  @Test
  public void testUnreferencedLabel_RemoveUnusedFalse_ShouldNotRemove_PossibleFault() {
    Node marker = new Node(Token.EMPTY);
    Node lbl = label("unused3", marker);
    Node root = block(lbl);

    RenameLabels pass = new RenameLabels(compiler, fixedNameSupplier("a"), false);
    pass.process(null, root);

    /*
     * NOTE: ตามชื่อ field "removeUnused" ควรหมายความว่าเมื่อเป็น false จะไม่ลบ label
     * ที่ไม่ถูกอ้างอิง แต่จากซอร์สที่ให้มา field นี้ไม่ถูกอ่านที่ใดเลยใน
     * shouldTraverse/visit/visitLabel/visitBreakOrContinue ทำให้ label ถูกลบเสมอ
     * ไม่ว่าค่า removeUnused จะเป็นอะไร — คาดว่าเป็น fault จริงของเวอร์ชันนี้
     * (Defects4J Closure-72b) การเทสนี้เขียนตาม "contract ที่ตั้งใจ" เพื่อดักจับบั๊กดังกล่าว
     */
    assertTrue(
        "Expected label to be preserved when removeUnused=false "
            + "(RenameLabels appears to ignore the removeUnused flag - likely fault)",
        containsType(root, Token.LABEL));
  }

  // ---------- 6. Unnamed break/continue -> nameNode null -> no-op ----------

  @Test
  public void testUnnamedBreakAndContinue_NoOp() {
    Node brk = breakTo(null);
    Node cont = continueTo(null);
    Node root = block(brk, cont);

    RenameLabels pass = new RenameLabels(compiler, fixedNameSupplier("a", "b"), true);
    pass.process(null, root);

    assertNull(brk.getFirstChild());
    assertNull(cont.getFirstChild());
  }

  // ---------- 7. break อ้าง label ที่ไม่มีอยู่ -> li == null -> ไม่เปลี่ยนชื่อ ----------

  @Test
  public void testNamedBreakReferencingUnknownLabel_NoRenameNoException() {
    Node brk = breakTo("ghost");
    Node root = block(brk);

    RenameLabels pass = new RenameLabels(compiler, fixedNameSupplier("a"), true);
    pass.process(null, root);

    assertEquals("ghost", brk.getFirstChild().getString());
  }

  // ---------- 8. continue ไป label -> ถูก rename เหมือน break ----------

  @Test
  public void testContinueToLabel_Renamed() {
    Node cont = continueTo("loopLbl");
    Node body = block(cont);
    Node lbl = label("loopLbl", body);
    Node root = block(lbl);

    RenameLabels pass = new RenameLabels(compiler, fixedNameSupplier("z"), true);
    pass.process(null, root);

    assertEquals("z", cont.getFirstChild().getString());
    assertEquals("z", lbl.getFirstChild().getString());
  }

  // ---------- 9. Nested labels: depth ต่างกัน ได้ชื่อต่างกัน ----------

  @Test
  public void testNestedLabels_DifferentDepthsGetDifferentNames() {
    Node breakOuter = breakTo("L1");
    Node continueInner = continueTo("L2");
    Node innerBody = block(continueInner, breakOuter);
    Node inner = label("L2", innerBody);
    Node outerBody = block(inner);
    Node outer = label("L1", outerBody);
    Node root = block(outer);

    RenameLabels pass = new RenameLabels(compiler, fixedNameSupplier("a", "b", "c"), true);
    pass.process(null, root);

    assertEquals("a", outer.getFirstChild().getString());
    assertEquals("b", inner.getFirstChild().getString());
    assertEquals("a", breakOuter.getFirstChild().getString());
    assertEquals("b", continueInner.getFirstChild().getString());
  }

  // ---------- 10. Sibling labels ระดับเดียวกัน ใช้ชื่อซ้ำ (reuse names.get(id-1)) ----------

  @Test
  public void testSiblingLabelsAtSameDepth_ReuseSameGeneratedName() {
    Node b1 = breakTo("S1");
    Node body1 = block(b1);
    Node lbl1 = label("S1", body1);

    Node b2 = breakTo("S2");
    Node body2 = block(b2);
    Node lbl2 = label("S2", body2);

    Node root = block(lbl1, lbl2);

    RenameLabels pass = new RenameLabels(compiler, fixedNameSupplier("a", "b", "c"), true);
    pass.process(null, root);

    assertEquals("a", lbl1.getFirstChild().getString());
    assertEquals("a", b1.getFirstChild().getString());
    assertEquals("a", lbl2.getFirstChild().getString());
    assertEquals("a", b2.getFirstChild().getString());
  }

  // ---------- 11. Duplicate label name ใน namespace เดียวกัน (nested) -> checkState ล้มเหลว ----------

  @Test(expected = IllegalStateException.class)
  public void testDuplicateLabelNameInSameNamespace_ThrowsIllegalStateException() {
    Node innerDup = label("dup", block());
    Node outerDup = label("dup", block(innerDup));
    Node root = block(outerDup);

    RenameLabels pass = new RenameLabels(compiler, fixedNameSupplier("a", "b"), true);
    pass.process(null, root);
  }

  // ---------- 12. Empty-named break -> Preconditions.checkState(name.length()!=0) ล้มเหลว ----------

  @Test(expected = IllegalStateException.class)
  public void testEmptyNamedBreak_ThrowsIllegalStateException() {
    Node brk = new Node(Token.BREAK);
    brk.addChildToBack(Node.newString(Token.NAME, ""));
    Node root = block(brk);

    RenameLabels pass = new RenameLabels(compiler, fixedNameSupplier("a"), true);
    pass.process(null, root);
  }

  // ---------- 13. Malformed LABEL ไม่มี child -> NPE ที่ shouldTraverse ----------

  @Test(expected = NullPointerException.class)
  public void testMalformedLabelWithoutNameChild_ThrowsNullPointerException() {
    Node lbl = new Node(Token.LABEL); // ไม่มี child เลย
    Node root = block(lbl);

    RenameLabels pass = new RenameLabels(compiler, fixedNameSupplier("a"), true);
    pass.process(null, root);
  }

  // ---------- 14. Label ภายใน function scope ใหม่ ใช้ namespace แยกจากภายนอก (enterScope/exitScope) ----------

  @Test
  public void testLabelInNestedFunctionScope_GetsIndependentNamespace() {
    Node outerBreak = breakTo("Rep");
    Node outerBody = block(outerBreak);
    Node outerLbl = label("Rep", outerBody);

    Node innerBreak = breakTo("Rep2");
    Node innerBody = block(innerBreak);
    Node innerLbl = label("Rep2", innerBody);
    Node funcBody = block(innerLbl);

    Node func = new Node(Token.FUNCTION);
    func.addChildToBack(Node.newString(Token.NAME, ""));
    func.addChildToBack(new Node(Token.PARAM_LIST));
    func.addChildToBack(funcBody);

    Node root = block(outerLbl, func);

    RenameLabels pass = new RenameLabels(compiler, fixedNameSupplier("a", "b", "c", "d"), true);
    pass.process(null, root);

    /*
     * NOTE: สมมติฐานว่า NodeTraversal จะเรียก enterScope/exitScope เมื่อพบ Token.FUNCTION
     * (มาตรฐานของ Closure Compiler แต่ไม่ได้แสดงในซอร์สที่ให้มา) หากสมมติฐานนี้ผิด
     * เทสนี้อาจ fail และควรตรวจสอบพฤติกรรมจริงของ NodeTraversal เพิ่มเติม
     */
    assertEquals("a", outerLbl.getFirstChild().getString());
    assertEquals("a", innerLbl.getFirstChild().getString());
  }

  // ---------- 15. Default 1-arg constructor (DefaultNameSupplier + removeUnused=true) ----------

  @Test
  public void testDefaultConstructor_RemovesUnusedLabel() {
    Node marker = new Node(Token.EMPTY);
    Node lbl = label("unusedDefault", marker);
    Node root = block(lbl);

    RenameLabels pass = new RenameLabels(compiler);
    pass.process(null, root);

    assertFalse(containsType(root, Token.LABEL));
  }
}
