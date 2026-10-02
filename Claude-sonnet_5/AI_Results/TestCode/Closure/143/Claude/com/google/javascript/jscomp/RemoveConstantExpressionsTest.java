package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Unit test สำหรับ {@link RemoveConstantExpressions}.
 *
 * หมายเหตุ (ASSUMPTIONS) - เนื่องจากบางคลาสที่ RemoveConstantExpressions ใช้งาน
 * (NodeUtil.nodeTypeMayHaveSideEffects, AstChangeProxy, GatherSideEffectSubexpressionsCallback,
 * ParallelCompilerPass.Result) ไม่ได้แสดง source ในโจทย์ จึงต้องอนุมานพฤติกรรมบางส่วน
 * โดยอ้างอิงจาก docstring ของคลาสเป้าหมาย (ตัวอย่าง "1 + foo() + bar()" -> "foo();bar()"):
 *
 *   1) NodeUtil.nodeTypeMayHaveSideEffects(node) น่าจะพิจารณาเฉพาะ "ชนิดของ node นั้นเอง"
 *      (ไม่ recursive) โดย CALL / ASSIGN ถือว่ามี side effect, ส่วน ADD / NUMBER / STRING / NAME(literal)
 *      ถือว่าไม่มี side effect ที่ node นั้นเอง
 *   2) AstChangeProxy.replaceWith(parent, node, list) แทนที่ node เดิมด้วย node(s) ใน list
 *      ตามลำดับ ณ ตำแหน่งเดิมใน parent (0 รายการ = ลบ statement ทิ้ง)
 *   3) การสร้าง Compiler + CompilerOptions ผ่าน initOptions() เพียงพอให้
 *      Result.notifyCompiler(compiler) ทำงานได้โดยไม่ throw exception
 *
 * คลาสเป้าหมาย (RemoveConstantExpressions) เป็น package-private จึงไม่ต้อง import
 * (ต้องอยู่ package เดียวกันคือ com.google.javascript.jscomp)
 */
public class RemoveConstantExpressionsTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
  }

  private RemoveConstantExpressions createPass() {
    return new RemoveConstantExpressions(compiler);
  }

  /** สร้าง CALL node เช่น foo() */
  private Node call(String name) {
    Node target = Node.newString(Token.NAME, name);
    return new Node(Token.CALL, target);
  }

  private Node exprResult(Node expr) {
    return new Node(Token.EXPR_RESULT, expr);
  }

  /** อ่านชื่อฟังก์ชันของทุก statement ที่เหลืออยู่ใน block (คาดว่าเป็น EXPR_RESULT(CALL) ทั้งหมด) */
  private List<String> collectCallNames(Node block) {
    List<String> names = new ArrayList<String>();
    Node stmt = block.getFirstChild();
    while (stmt != null) {
      assertEquals(Token.EXPR_RESULT, stmt.getType());
      Node expr = stmt.getFirstChild();
      assertEquals(Token.CALL, expr.getType());
      names.add(expr.getFirstChild().getString());
      stmt = stmt.getNext();
    }
    return names;
  }

  // ---------- 1. Constructor: กรณี compiler == null ----------
  @Test
  public void testConstructor_withNullCompiler_doesNotThrow() {
    RemoveConstantExpressions pass = new RemoveConstantExpressions(null);
    assertNotNull(pass);
    // หมายเหตุ: ไม่เรียก process() ในเคสนี้ เพราะ notifyCompiler(null)
    // อาจ NPE ตามพฤติกรรมของคลาสที่ไม่ได้ให้ source มา จึงไม่ทดสอบ (ป้องกันการเดา)
  }

  // ---------- 2. Boundary: root ว่าง (ไม่มี statement เลย) ----------
  @Test
  public void testProcess_emptyBlock_noExceptionNoChange() {
    Node root = new Node(Token.BLOCK);
    createPass().process(null, root);
    assertEquals(0, root.getChildCount());
  }

  // ---------- 3. Branch: node.getType() != EXPR_RESULT -> return ทันที (ข้าม) ----------
  @Test
  public void testProcess_nonExprResultNode_isIgnored() {
    // tree ผิดรูปแบบโดยเจตนา (NAME เป็นลูกตรงของ BLOCK โดยไม่มี EXPR_RESULT ครอบ)
    // เพื่อยืนยันว่า trySimplify คืนค่าทันทีสำหรับ node ที่ไม่ใช่ EXPR_RESULT
    Node name = Node.newString(Token.NAME, "x");
    Node root = new Node(Token.BLOCK, name);
    createPass().process(null, root);
    assertEquals(1, root.getChildCount());
    assertEquals(Token.NAME, root.getFirstChild().getType());
  }

  // ---------- 4. Branch: EXPR_RESULT + exprBody = CALL (มี side effect) -> ไม่ถูกแทนที่ ----------
  @Test
  public void testProcess_exprResultWithCall_notSimplified() {
    Node stmt = exprResult(call("foo"));
    Node root = new Node(Token.BLOCK, stmt);
    createPass().process(null, root);

    assertEquals(1, root.getChildCount());
    Node remaining = root.getFirstChild();
    assertEquals(Token.EXPR_RESULT, remaining.getType());
    assertEquals(Token.CALL, remaining.getFirstChild().getType());
    assertEquals("foo", remaining.getFirstChild().getFirstChild().getString());
  }

  // ---------- 5. Branch: EXPR_RESULT + ASSIGN (มี side effect) -> ไม่ถูกแทนที่ ----------
  @Test
  public void testProcess_exprResultWithAssign_notSimplified() {
    Node assign = new Node(Token.ASSIGN,
        Node.newString(Token.NAME, "x"), Node.newNumber(5));
    Node stmt = exprResult(assign);
    Node root = new Node(Token.BLOCK, stmt);
    createPass().process(null, root);

    assertEquals(1, root.getChildCount());
    assertEquals(Token.ASSIGN, root.getFirstChild().getFirstChild().getType());
  }

  // ---------- 6. Branch: EXPR_RESULT + NUMBER literal (ไม่มี side effect เลย) -> ลบทั้ง statement ----------
  @Test
  public void testProcess_exprResultWithNumberLiteral_removedEntirely() {
    Node stmt = exprResult(Node.newNumber(1));
    Node root = new Node(Token.BLOCK, stmt);
    createPass().process(null, root);

    assertEquals(0, root.getChildCount());
  }

  // ---------- 7. Boundary ค่าว่าง: STRING literal ว่าง "" -> ลบทั้ง statement ----------
  @Test
  public void testProcess_exprResultWithEmptyStringLiteral_removedEntirely() {
    Node stmt = exprResult(Node.newString(""));
    Node root = new Node(Token.BLOCK, stmt);
    createPass().process(null, root);

    assertEquals(0, root.getChildCount());
  }

  // ---------- 8. Branch: ADD(NUMBER, CALL) -> เหลือแค่ CALL เดียว ----------
  @Test
  public void testProcess_addWithOneCall_replacedWithSingleCall() {
    Node add = new Node(Token.ADD, Node.newNumber(1), call("foo"));
    Node stmt = exprResult(add);
    Node root = new Node(Token.BLOCK, stmt);
    createPass().process(null, root);

    assertEquals(Arrays.asList("foo"), collectCallNames(root));
  }

  // ---------- 9. Branch: ADD(CALL foo, CALL bar) -> แทนที่ด้วยสอง statement (ตาม docstring) ----------
  @Test
  public void testProcess_addWithTwoCalls_replacedWithTwoStatements() {
    // ตรงกับตัวอย่างใน docstring: 1 + foo() + bar() -> foo();bar()
    Node add = new Node(Token.ADD, call("foo"), call("bar"));
    Node stmt = exprResult(add);
    Node root = new Node(Token.BLOCK, stmt);
    createPass().process(null, root);

    assertEquals(Arrays.asList("foo", "bar"), collectCallNames(root));
  }

  // ---------- 10. Loop coverage: ADD ซ้อนกันหลายชั้น มี 3 CALL -> for-loop วน 3 รอบ ----------
  @Test
  public void testProcess_nestedAddWithThreeCalls_replacedWithThreeStatements() {
    // (a() + 1) + (b() + c())
    Node left = new Node(Token.ADD, call("a"), Node.newNumber(1));
    Node right = new Node(Token.ADD, call("b"), call("c"));
    Node add = new Node(Token.ADD, left, right);
    Node stmt = exprResult(add);
    Node root = new Node(Token.BLOCK, stmt);
    createPass().process(null, root);

    assertEquals(Arrays.asList("a", "b", "c"), collectCallNames(root));
  }

  // ---------- 11. หลาย statement ปนกัน: skip / remove / replace (ทดสอบความเป็นอิสระของแต่ละ statement) ----------
  @Test
  public void testProcess_multipleStatements_mixedBehaviors() {
    Node s1 = exprResult(call("keep"));                                  // ไม่เปลี่ยน (มี side effect)
    Node s2 = exprResult(Node.newNumber(42));                            // ถูกลบ (ไม่มี side effect)
    Node s3 = exprResult(new Node(Token.ADD, Node.newNumber(2), call("extract"))); // เหลือ extract()

    Node root = new Node(Token.BLOCK);
    root.addChildToBack(s1);
    root.addChildToBack(s2);
    root.addChildToBack(s3);

    createPass().process(null, root);

    assertEquals(Arrays.asList("keep", "extract"), collectCallNames(root));
  }
}
