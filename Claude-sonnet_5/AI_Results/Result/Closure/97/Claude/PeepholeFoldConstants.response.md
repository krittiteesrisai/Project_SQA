# PeepholeFoldConstantsTest.java

**หมายเหตุสำคัญก่อนเริ่ม:**
- `PeepholeFoldConstants` มี method เดียวที่ package-visible คือ `optimizeSubtree(Node)` เมธอด private อื่น ๆ ทั้งหมด (tryFold...) จึงถูกทดสอบทางอ้อมผ่าน `optimizeSubtree` เท่านั้น
- คลาสฐาน `AbstractPeepholeOptimization`, `NodeUtil`, `InlineCostEstimator`, `DiagnosticType`, `Compiler` ไม่ได้แสดงซอร์สในโจทย์ ดังนั้นจุดที่ต้อง "เดา" พฤติกรรม (field/method ที่ไม่เห็นซอร์ส) จะมีคอมเมนต์ `ASSUMPTION:` กำกับไว้ชัดเจนตามข้อกำหนด
- ใช้การ reflect เข้าไปตั้งค่า compiler ให้กับ pass (เพราะ `reportCodeChange()`/`error()` ต้องมี compiler ที่ไม่ใช่ null) — เป็นจุดเสี่ยงที่ทำเครื่องหมายไว้

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 * Unit tests for {@link PeepholeFoldConstants}.
 *
 * ทดสอบผ่านจุดเข้าเดียวที่ package-visible คือ optimizeSubtree(Node)
 * เนื่องจากเมธอด tryFoldXxx ทั้งหมดเป็น private
 */
public class PeepholeFoldConstantsTest {

  private Compiler compiler;
  private PeepholeFoldConstants pass;

  @Before
  public void setUp() throws Exception {
    compiler = new Compiler();

    // ASSUMPTION: Compiler#initOptions(CompilerOptions) มีอยู่จริงและตั้งค่า
    // error manager ภายในซึ่งจำเป็นสำหรับ error(...)/report(...) ที่เรียกจาก
    // AbstractPeepholeOptimization (ไม่ปรากฏในซอร์สที่ให้มา)
    try {
      compiler.initOptions(new CompilerOptions());
    } catch (Throwable ignored) {
      // ไม่สามารถยืนยัน signature 100% จึงกันไว้ไม่ให้ setUp ทั้งชุดพัง
    }

    pass = new PeepholeFoldConstants();

    // ASSUMPTION: AbstractPeepholeOptimization (superclass ที่ไม่แสดงในซอร์ส)
    // มี field ชื่อ "compiler" ชนิด AbstractCompiler ที่ reportCodeChange()/error()
    // ใช้งาน เราจึงใช้ reflection ฉีดค่าให้ เพราะ API สาธารณะที่แท้จริง
    // (เช่น beginTraversal(NodeTraversal)) ไม่ปรากฏในซอร์สที่ให้มา
    try {
      Field f = AbstractPeepholeOptimization.class.getDeclaredField("compiler");
      f.setAccessible(true);
      f.set(pass, compiler);
    } catch (Exception e) {
      throw new RuntimeException(
          "ไม่สามารถฉีด compiler เข้า PeepholeFoldConstants เพื่อทดสอบได้ "
              + "(field name อาจต่างจากที่สมมติ)", e);
    }
  }

  // ---------- Node-building helpers ----------

  private static Node num(double v) {
    return Node.newNumber(v);
  }

  private static Node str(String s) {
    return Node.newString(s);
  }

  /**
   * ASSUMPTION: ไม่มีการสร้าง NAME node ในซอร์สที่ให้มา จึงสมมติว่า Node มี
   * setString(String) คู่กับ getString() ที่ใช้งานจริงในซอร์ส
   */
  private static Node nm(String s) {
    Node n = new Node(Token.NAME);
    n.setString(s);
    return n;
  }

  private static Node trueN() {
    return new Node(Token.TRUE);
  }

  private static Node falseN() {
    return new Node(Token.FALSE);
  }

  private static Node nullN() {
    return new Node(Token.NULL);
  }

  private static Node arr(Node... elems) {
    Node a = new Node(Token.ARRAYLIT);
    for (Node e : elems) {
      a.addChildToBack(e);
    }
    return a;
  }

  private static Node bin(int type, Node left, Node right) {
    return new Node(type, left, right);
  }

  private static Node call(Node callee, Node... args) {
    Node c = new Node(Token.CALL);
    c.addChildToBack(callee);
    for (Node a : args) {
      c.addChildToBack(a);
    }
    return c;
  }

  /** ครอบ node ด้วย parent generic (BLOCK) เพราะ fold-path ส่วนใหญ่ต้องมี parent */
  private static Node attach(Node child) {
    Node parent = new Node(Token.BLOCK);
    parent.addChildToBack(child);
    return child;
  }

  private static Node attachUnder(Node child, Node parent) {
    parent.addChildToBack(child);
    return child;
  }

  // ---------- Assert helpers ----------

  private static void assertNumberResult(double expected, Node result) {
    assertEquals(Token.NUMBER, result.getType());
    assertEquals(expected, result.getDouble(), 1e-9);
  }

  private static void assertStringResult(String expected, Node result) {
    assertEquals(Token.STRING, result.getType());
    assertEquals(expected, result.getString());
  }

  // =====================================================================
  // 1. tryFoldBinaryOperator - guard clauses / dispatch
  // =====================================================================

  @Test
  public void testBinaryOperator_LeftNull_ReturnsUnchanged() {
    Node n = new Node(Token.ADD); // ไม่มีลูกเลย -> left == null
    Node result = pass.optimizeSubtree(n);
    assertSame(n, result);
  }

  @Test
  public void testBinaryOperator_RightNull_ReturnsUnchanged() {
    Node n = new Node(Token.ADD);
    n.addChildToBack(nm("x")); // มี left แต่ไม่มี right
    Node result = pass.optimizeSubtree(n);
    assertSame(n, result);
  }

  @Test
  public void testDefaultBinaryOperator_UnknownType_ReturnsUnchanged() {
    // HOOK ไม่อยู่ใน switch ของ tryFoldBinaryOperator -> default -> unchanged
    Node n = bin(Token.HOOK, nm("x"), nm("y"));
    attach(n);
    Node result = pass.optimizeSubtree(n);
    assertSame(n, result);
  }

  // =====================================================================
  // 2. TYPEOF
  // =====================================================================

  @Test
  public void testTypeof_NoChild_ReturnsUnchanged() {
    Node n = new Node(Token.TYPEOF); // argumentNode == null
    Node result = pass.optimizeSubtree(n);
    assertSame(n, result);
  }

  @Test
  public void testTypeof_String() {
    Node n = new Node(Token.TYPEOF);
    attachUnder(str("bar"), n);
    attach(n);
    Node result = pass.optimizeSubtree(n);
    assertStringResult("string", result);
  }

  @Test
  public void testTypeof_Number() {
    Node n = new Node(Token.TYPEOF);
    attachUnder(num(6), n);
    attach(n);
    assertStringResult("number", pass.optimizeSubtree(n));
  }

  @Test
  public void testTypeof_True() {
    Node n = new Node(Token.TYPEOF);
    attachUnder(trueN(), n);
    attach(n);
    assertStringResult("boolean", pass.optimizeSubtree(n));
  }

  @Test
  public void testTypeof_Null() {
    Node n = new Node(Token.TYPEOF);
    attachUnder(nullN(), n);
    attach(n);
    assertStringResult("object", pass.optimizeSubtree(n));
  }

  @Test
  public void testTypeof_ArrayLit() {
    Node n = new Node(Token.TYPEOF);
    attachUnder(arr(), n);
    attach(n);
    assertStringResult("object", pass.optimizeSubtree(n));
  }

  @Test
  public void testTypeof_NameUndefined() {
    Node n = new Node(Token.TYPEOF);
    attachUnder(nm("undefined"), n);
    attach(n);
    assertStringResult("undefined", pass.optimizeSubtree(n));
  }

  // =====================================================================
  // 3. Unary operator: NOT / NEG / BITNOT
  // =====================================================================

  @Test
  public void testNot_True() {
    Node n = new Node(Token.NOT);
    attachUnder(trueN(), n);
    attach(n);
    Node result = pass.optimizeSubtree(n);
    assertEquals(Token.FALSE, result.getType());
  }

  @Test
  public void testNot_False() {
    Node n = new Node(Token.NOT);
    attachUnder(falseN(), n);
    attach(n);
    Node result = pass.optimizeSubtree(n);
    assertEquals(Token.TRUE, result.getType());
  }

  @Test
  public void testNot_UnknownValue_ReturnsUnchanged() {
    Node n = new Node(Token.NOT);
    attachUnder(nm("x"), n); // ค่า boolean ไม่รู้ชัด -> UNKNOWN
    attach(n);
    Node result = pass.optimizeSubtree(n);
    assertSame(n, result);
  }

  @Test
  public void testNeg_Number() {
    Node n = new Node(Token.NEG);
    attachUnder(num(5), n);
    attach(n);
    Node result = pass.optimizeSubtree(n);
    assertNumberResult(-5.0, result);
  }

  @Test
  public void testNeg_Infinity_ReturnsUnchanged() {
    Node n = new Node(Token.NEG);
    attachUnder(nm("Infinity"), n);
    attach(n);
    Node result = pass.optimizeSubtree(n);
    assertSame(n, result);
  }

  @Test
  public void testNeg_NaN_ReplacesWithNaNNode() {
    Node n = new Node(Token.NEG);
    Node nanNode = nm("NaN");
    attachUnder(nanNode, n);
    attach(n);
    Node result = pass.optimizeSubtree(n);
    assertSame(nanNode, result); // ตามซอร์ส: parent.replaceChild(n, left); return left;
  }

  @Test
  public void testBitnot_Integer() {
    Node n = new Node(Token.BITNOT);
    attachUnder(num(5), n);
    attach(n);
    Node result = pass.optimizeSubtree(n);
    assertNumberResult(~5, result);
  }

  @Test
  public void testBitnot_Fractional_ReturnsUnchanged() {
    Node n = new Node(Token.BITNOT);
    attachUnder(num(3.5), n);
    attach(n);
    Node result = pass.optimizeSubtree(n);
    assertSame(n, result);
  }

  @Test
  public void testBitnot_OutOfRange_ReturnsUnchanged() {
    Node n = new Node(Token.BITNOT);
    attachUnder(num(1e20), n);
    attach(n);
    Node result = pass.optimizeSubtree(n);
    assertSame(n, result);
  }

  // =====================================================================
  // 4. GETPROP (.length)
  // =====================================================================

  @Test
  public void testGetProp_ArrayLength() {
    Node left = arr(num(1), num(2), num(3));
    Node n = bin(Token.GETPROP, left, str("length"));
    attach(n);
    assertNumberResult(3, pass.optimizeSubtree(n));
  }

  @Test
  public void testGetProp_StringLength() {
    Node n = bin(Token.GETPROP, str("hello"), str("length"));
    attach(n);
    assertNumberResult(5, pass.optimizeSubtree(n));
  }

  @Test
  public void testGetProp_NotLengthProperty_ReturnsUnchanged() {
    Node n = bin(Token.GETPROP, arr(num(1)), str("foo"));
    attach(n);
    assertSame(n, pass.optimizeSubtree(n));
  }

  @Test
  public void testGetProp_UnsupportedLeftType_ReturnsUnchanged() {
    Node n = bin(Token.GETPROP, trueN(), str("length"));
    attach(n);
    assertSame(n, pass.optimizeSubtree(n));
  }

  // =====================================================================
  // 5. GETELEM
  // =====================================================================

  @Test
  public void testGetElem_ValidIndex() {
    Node left = arr(num(10), num(20), num(30));
    Node n = bin(Token.GETELEM, left, num(1));
    attach(n);
    assertNumberResult(20, pass.optimizeSubtree(n));
  }

  @Test
  public void testGetElem_FractionalIndex_ReturnsUnchanged() {
    Node n = bin(Token.GETELEM, arr(num(1), num(2)), num(0.5));
    attach(n);
    assertSame(n, pass.optimizeSubtree(n));
  }

  @Test
  public void testGetElem_NegativeIndex_ReturnsUnchanged() {
    Node n = bin(Token.GETELEM, arr(num(1), num(2)), num(-1));
    attach(n);
    assertSame(n, pass.optimizeSubtree(n));
  }

  @Test
  public void testGetElem_OutOfBounds_ReturnsUnchanged() {
    Node n = bin(Token.GETELEM, arr(num(1), num(2)), num(5)); // loop วนจนหมด
    attach(n);
    assertSame(n, pass.optimizeSubtree(n));
  }

  @Test
  public void testGetElem_NonArrayLeft_ReturnsUnchanged() {
    Node n = bin(Token.GETELEM, nm("x"), num(0));
    attach(n);
    assertSame(n, pass.optimizeSubtree(n));
  }

  // =====================================================================
  // 6. INSTANCEOF
  // =====================================================================

  @Test
  public void testInstanceof_ImmutableLeft_False() {
    Node n = bin(Token.INSTANCEOF, num(5), nm("Foo"));
    attach(n);
    Node result = pass.optimizeSubtree(n);
    assertEquals(Token.FALSE, result.getType());
  }

  @Test
  public void testInstanceof_ArrayLitVsObject_True() {
    Node n = bin(Token.INSTANCEOF, arr(num(1)), nm("Object"));
    attach(n);
    Node result = pass.optimizeSubtree(n);
    assertEquals(Token.TRUE, result.getType());
  }

  @Test
  public void testInstanceof_ArrayLitVsOtherName_ReturnsUnchanged() {
    Node n = bin(Token.INSTANCEOF, arr(num(1)), nm("Array"));
    attach(n);
    assertSame(n, pass.optimizeSubtree(n));
  }

  // =====================================================================
  // 7. AND / OR
  // =====================================================================

  @Test
  public void testAnd_TrueLeft_ResultRight() {
    Node right = nm("x");
    Node n = bin(Token.AND, trueN(), right);
    attach(n);
    Node result = pass.optimizeSubtree(n);
    assertSame(right, result);
  }

  @Test
  public void testOr_FalseLeft_ResultRight() {
    Node right = nm("y");
    Node n = bin(Token.OR, falseN(), right);
    attach(n);
    Node result = pass.optimizeSubtree(n);
    assertSame(right, result);
  }

  @Test
  public void testOr_UnknownLeft_TrueRight_ParentIf_ResultTrue() {
    Node left = nm("x");
    Node n = bin(Token.OR, left, trueN());
    Node ifParent = new Node(Token.IF);
    ifParent.addChildToBack(n);
    Node result = pass.optimizeSubtree(n);
    assertEquals(Token.TRUE, result.getType());
  }

  @Test
  public void testOr_UnknownLeftRight_ParentNotQualifying_ReturnsUnchanged() {
    Node left = nm("x");
    Node n = bin(Token.OR, left, trueN());
    attach(n); // parent = BLOCK ไม่ใช่ IF/WHILE/DO/FOR/HOOK
    Node result = pass.optimizeSubtree(n);
    assertSame(n, result);
  }

  // =====================================================================
  // 8. BITAND / BITOR
  // =====================================================================

  @Test
  public void testBitAnd_Basic() {
    Node n = bin(Token.BITAND, num(6), num(3));
    attach(n);
    assertNumberResult(6 & 3, pass.optimizeSubtree(n));
  }

  @Test
  public void testBitOr_Basic() {
    Node n = bin(Token.BITOR, num(5), num(2));
    attach(n);
    assertNumberResult(5 | 2, pass.optimizeSubtree(n));
  }

  @Test
  public void testBitAndOr_OutOfIntRange_ReturnsUnchanged() {
    Node n = bin(Token.BITOR, num(1e20), num(2));
    attach(n);
    assertSame(n, pass.optimizeSubtree(n));
  }

  // =====================================================================
  // 9. Shift: LSH / RSH / URSH
  // =====================================================================

  @Test
  public void testLsh_Basic() {
    Node n = bin(Token.LSH, num(1), num(3));
    attach(n);
    assertNumberResult(1 << 3, pass.optimizeSubtree(n));
  }

  @Test
  public void testRsh_Basic() {
    Node n = bin(Token.RSH, num(-8), num(1));
    attach(n);
    assertNumberResult(-8 >> 1, pass.optimizeSubtree(n));
  }

  @Test
  public void testUrsh_Basic() {
    Node n = bin(Token.URSH, num(-1), num(0));
    attach(n);
    assertNumberResult(-1 >>> 0, pass.optimizeSubtree(n));
  }

  @Test
  public void testShift_RightOutOfBounds_ReturnsUnchanged() {
    // boundary: rval == 32 ไม่ผ่านเงื่อนไข rval < 32
    Node n = bin(Token.LSH, num(1), num(32));
    attach(n);
    assertSame(n, pass.optimizeSubtree(n));
  }

  @Test
  public void testShift_FractionalLeft_ReturnsUnchanged() {
    Node n = bin(Token.LSH, num(1.5), num(2));
    attach(n);
    assertSame(n, pass.optimizeSubtree(n));
  }

  // =====================================================================
  // 10. ASSIGN
  // =====================================================================

  @Test
  public void testAssign_XPlusY_ToAssignAdd() {
    Node leftX = nm("x");
    Node rhsX = nm("x");
    Node rhsY = nm("y");
    Node right = bin(Token.ADD, rhsX, rhsY);
    Node n = bin(Token.ASSIGN, leftX, right);
    attach(n);
    Node result = pass.optimizeSubtree(n);
    assertEquals(Token.ASSIGN_ADD, result.getType());
    assertEquals("x", result.getFirstChild().getString());
    assertEquals("y", result.getLastChild().getString());
  }

  @Test
  public void testAssign_RightNoChildren_ReturnsUnchanged() {
    Node n = bin(Token.ASSIGN, nm("x"), nm("y")); // right ไม่มีลูก
    attach(n);
    assertSame(n, pass.optimizeSubtree(n));
  }

  @Test
  public void testAssign_LeftMismatch_ReturnsUnchanged() {
    Node right = bin(Token.ADD, nm("y"), nm("z"));
    Node n = bin(Token.ASSIGN, nm("x"), right);
    attach(n);
    assertSame(n, pass.optimizeSubtree(n));
  }

  @Test
  public void testAssign_UnsupportedOperator_ReturnsUnchanged() {
    Node leftX = nm("x");
    Node right = bin(Token.LT, nm("x"), nm("y")); // LT ไม่อยู่ใน switch ของ ASSIGN
    Node n = bin(Token.ASSIGN, leftX, right);
    attach(n);
    assertSame(n, pass.optimizeSubtree(n));
  }

  // =====================================================================
  // 11. ADD
  // =====================================================================

  @Test
  public void testAdd_StringConcatLiterals() {
    Node n = bin(Token.ADD, str("foo"), str("bar"));
    attach(n);
    assertStringResult("foobar", pass.optimizeSubtree(n));
  }

  @Test
  public void testAdd_NumericLiterals() {
    Node n = bin(Token.ADD, num(2), num(3));
    attach(n);
    assertNumberResult(5, pass.optimizeSubtree(n));
  }

  @Test
  public void testAdd_LeftChildAdd_StringFold() {
    Node x = nm("x");
    Node inner = bin(Token.ADD, x, str("a"));
    Node n = bin(Token.ADD, inner, str("b"));
    attach(n);
    Node result = pass.optimizeSubtree(n);
    assertSame(n, result);
    assertSame(x, result.getFirstChild());
    assertStringResult("ab", result.getLastChild());
  }

  @Test
  public void testAdd_LeftChildAdd_NonStringLeftChild_ReturnsUnchanged() {
    Node inner = bin(Token.ADD, nm("x"), num(2)); // lr ไม่ใช่ STRING
    Node n = bin(Token.ADD, inner, num(3));
    attach(n);
    assertSame(n, pass.optimizeSubtree(n));
  }

  @Test
  public void testAdd_NonLiteralOperands_ReturnsUnchanged() {
    Node n = bin(Token.ADD, nm("x"), nm("y"));
    attach(n);
    assertSame(n, pass.optimizeSubtree(n));
  }

  // =====================================================================
  // 12. Arithmetic: SUB / MUL / DIV
  // =====================================================================

  @Test
  public void testSub_Basic() {
    Node n = bin(Token.SUB, num(5), num(3));
    attach(n);
    assertNumberResult(2, pass.optimizeSubtree(n));
  }

  @Test
  public void testMul_Basic() {
    Node n = bin(Token.MUL, num(5), num(3));
    attach(n);
    assertNumberResult(15, pass.optimizeSubtree(n));
  }

  @Test
  public void testDiv_Basic() {
    Node n = bin(Token.DIV, num(6), num(3));
    attach(n);
    assertNumberResult(2, pass.optimizeSubtree(n));
  }

  @Test
  public void testDiv_ByZero_ReturnsUnchanged() {
    Node n = bin(Token.DIV, num(5), num(0));
    attach(n);
    Node result = pass.optimizeSubtree(n);
    assertSame(n, result);
  }

  @Test
  public void testDiv_ResultTooLong_ReturnsUnchanged() {
    // 1/3 = 0.3333333333333333 ยาวเกิน left+right+1 -> ไม่ fold
    Node n = bin(Token.DIV, num(1), num(3));
    attach(n);
    assertSame(n, pass.optimizeSubtree(n));
  }

  // =====================================================================
  // 13. Comparison
  // =====================================================================

  @Test
  public void testComparison_NonLiteralNonLtGt_ReturnsUnchanged() {
    Node n = bin(Token.EQ, nm("x"), nm("y"));
    attach(n);
    assertSame(n, pass.optimizeSubtree(n));
  }

  @Test
  public void testComparison_NameLtDifferentNames_ReturnsUnchanged() {
    Node n = bin(Token.LT, nm("x"), nm("y"));
    attach(n);
    assertSame(n, pass.optimizeSubtree(n));
  }

  @Test
  public void testComparison_NameLtSameName_False() {
    Node n = bin(Token.LT, nm("x"), nm("x"));
    attach(n);
    Node result = pass.optimizeSubtree(n);
    assertEquals(Token.FALSE, result.getType());
  }

  @Test
  public void testComparison_VoidEqualsNull_True() {
    Node left = new Node(Token.VOID);
    left.addChildToBack(num(0));
    Node n = bin(Token.EQ, left, nullN());
    attach(n);
    Node result = pass.optimizeSubtree(n);
    assertEquals(Token.TRUE, result.getType());
  }

  @Test
  public void testComparison_TrueEqualsFalse_False() {
    Node n = bin(Token.EQ, trueN(), falseN());
    attach(n);
    Node result = pass.optimizeSubtree(n);
    assertEquals(Token.FALSE, result.getType());
  }

  @Test
  public void testComparison_StringEquals() {
    Node n = bin(Token.SHEQ, str("ab"), str("ab"));
    attach(n);
    Node result = pass.optimizeSubtree(n);
    assertEquals(Token.TRUE, result.getType());
  }

  @Test
  public void testComparison_StringVsNumberMismatch_ReturnsUnchanged() {
    Node n = bin(Token.EQ, str("5"), num(5));
    attach(n);
    assertSame(n, pass.optimizeSubtree(n));
  }

  @Test
  public void testComparison_NumberComparisons() {
    Node n = bin(Token.GT, num(5), num(3));
    attach(n);
    Node result = pass.optimizeSubtree(n);
    assertEquals(Token.TRUE, result.getType());
  }

  @Test
  public void testComparison_DefaultLeftType_ReturnsUnchanged() {
    // ARRAYLIT ไม่อยู่ใน switch(left.getType()) ของ tryFoldComparison
    Node n = bin(Token.LT, arr(), arr());
    attach(n);
    assertSame(n, pass.optimizeSubtree(n));
  }

  // =====================================================================
  // 14. CALL: indexOf / lastIndexOf / join
  // =====================================================================

  @Test
  public void testIndexOf_Basic() {
    Node getProp = bin(Token.GETPROP, str("abcdef"), str("indexOf"));
    Node n = call(getProp, str("bc"));
    attach(n);
    assertNumberResult(1, pass.optimizeSubtree(n));
  }

  @Test
  public void testIndexOf_WithFromIndex() {
    Node getProp = bin(Token.GETPROP, str("abcdefbc"), str("indexOf"));
    Node n = call(getProp, str("bc"), num(3));
    attach(n);
    assertNumberResult(6, pass.optimizeSubtree(n));
  }

  @Test
  public void testLastIndexOf_Basic() {
    Node getProp = bin(Token.GETPROP, str("abcbc"), str("lastIndexOf"));
    Node n = call(getProp, str("bc"));
    attach(n);
    assertNumberResult(3, pass.optimizeSubtree(n));
  }

  @Test
  public void testIndexOf_ThirdArg_ReturnsUnchanged() {
    Node getProp = bin(Token.GETPROP, str("abcdef"), str("indexOf"));
    Node n = call(getProp, str("bc"), num(0), num(1)); // มี argument ที่ 3
    attach(n);
    assertSame(n, pass.optimizeSubtree(n));
  }

  @Test
  public void testCall_NotGetProp_ReturnsUnchanged() {
    Node n = call(nm("foo"), num(1));
    attach(n);
    Node result = pass.optimizeSubtree(n);
    assertSame(n, result);
    assertEquals(Token.CALL, result.getType());
  }

  @Test
  public void testJoin_AllStringLiterals_Folds() {
    Node arrayNode = arr(str("a"), str("b"), str("c"));
    Node getProp = bin(Token.GETPROP, arrayNode, str("join"));
    Node n = call(getProp, str(""));
    attach(n);
    Node result = pass.optimizeSubtree(n);
    assertStringResult("abc", result);
  }

  @Test
  public void testJoin_EmptyArray_FoldsToEmptyString() {
    Node arrayNode = arr();
    Node getProp = bin(Token.GETPROP, arrayNode, str("join"));
    Node n = call(getProp, str(","));
    attach(n);
    Node result = pass.optimizeSubtree(n);
    assertStringResult("", result);
  }

  @Test
  public void testJoin_MixedLiteralNonLiteral_ReturnsUnchanged() {
    Node arrayNode = arr(nm("x"), str("a"));
    Node getProp = bin(Token.GETPROP, arrayNode, str("join"));
    Node n = call(getProp, str(","));
    attach(n);
    Node result = pass.optimizeSubtree(n);
    assertSame(n, result);
    assertEquals(Token.CALL, result.getType());
  }

  // =====================================================================
  // 15. Null / malformed input (defensive)
  // =====================================================================

  @Test
  public void testOptimizeSubtree_NullChild_DoesNotThrow() {
    // TYPEOF ไม่มีลูกเลย ต้องไม่ throw exception (argumentNode == null branch)
    Node n = new Node(Token.TYPEOF);
    try {
      Node result = pass.optimizeSubtree(n);
      assertSame(n, result);
    } catch (Exception e) {
      fail("optimizeSubtree ไม่ควร throw exception เมื่ออินพุตไม่มีลูก: " + e);
    }
  }
}
```

# ตารางสรุป Test coverage

| กลุ่ม/เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| testBinaryOperator_LeftNull/RightNull_ReturnsUnchanged | `tryFoldBinaryOperator`: left==null, right==null |
| testDefaultBinaryOperator_UnknownType | switch default ใน `tryFoldBinaryOperator` |
| testTypeof_* (String/Number/True/Null/ArrayLit/NameUndefined/NoChild) | `tryFoldTypeof`: switch ทุกกรณี, argumentNode==null, isLiteralValue |
| testNot_True/False/UnknownValue | `tryFoldUnaryOperator` NOT: leftVal TRUE/FALSE/UNKNOWN |
| testNeg_Number/Infinity/NaN | NEG: ปกติ, Infinity guard, NaN replace |
| testBitnot_Integer/Fractional/OutOfRange | BITNOT: ปกติ, fractional error, out-of-range error |
| testGetProp_ArrayLength/StringLength/NotLengthProperty/UnsupportedLeftType | `tryFoldGetProp`: ARRAYLIT, STRING, right!=length, default case |
| testGetElem_ValidIndex/FractionalIndex/NegativeIndex/OutOfBounds/NonArrayLeft | `tryFoldGetElem`: index ปกติ (loop), fractional, negative, out-of-bounds (loop จนหมด), left ไม่ใช่ array |
| testInstanceof_ImmutableLeft/ArrayLitVsObject/ArrayLitVsOtherName | `tryFoldInstanceof`: immutable→false, array vs Object→true, ไม่เข้าเงื่อนไข |
| testAnd_TrueLeft/testOr_FalseLeft | `tryFoldAndOr`: leftVal known (AND/OR) |
| testOr_UnknownLeft_TrueRight_ParentIf / ParentNotQualifying | rightVal known + parent IF (fold), parent ไม่ตรง (unchanged) |
| testBitAnd_Basic/testBitOr_Basic/OutOfIntRange | `tryFoldBitAndOr`: ปกติ, out-of-range |
| testLsh/Rsh/Ursh_Basic, RightOutOfBounds, FractionalLeft | `tryFoldShift`: 3 operator, boundary rval=32, fractional |
| testAssign_XPlusY / RightNoChildren / LeftMismatch / UnsupportedOperator | `tryFoldAssign`: fold สำเร็จ, right ไม่มี 2 children, left≠leftChild, operator ไม่รองรับ |
| testAdd_StringConcat/NumericLiterals | `tryFoldAddConstant` string/arithmetic |
| testAdd_LeftChildAdd_StringFold / NonStringLeftChild / NonLiteralOperands | `tryFoldLeftChildAdd`: fold สำเร็จ, lr ไม่ใช่ STRING, right ไม่ literal |
| testSub/Mul/Div_Basic, Div_ByZero, Div_ResultTooLong | `tryFoldArithmetic`: 3 operator, DIVIDE_BY_0_ERROR, length-guard branch |
| testComparison_* (หลายเมธอด) | `tryFoldComparison`: early-return non-LT/GT, NAME เท่ากัน/ไม่เท่ากัน, VOID/NULL/TRUE/FALSE/STRING/NUMBER case, type mismatch, default case |
| testIndexOf_Basic/WithFromIndex/ThirdArg, testLastIndexOf_Basic, testCall_NotGetProp | `tryFoldStringIndexOf`: fold สำเร็จ, fromIndex, 3rd-arg guard, ไม่ใช่ GETPROP |
| testJoin_AllStringLiterals/EmptyArray/MixedLiteralNonLiteral | `tryFoldStringJoin`: loop รวม string, array ว่าง (case 0), ไม่สามารถ fold (case default) |
| testOptimizeSubtree_NullChild_DoesNotThrow | boundary/malformed input: ไม่มี children เลย |

**ข้อจำกัดที่ทำเครื่องหมายไว้ (comment ในโค้ด):** การสร้าง NAME node (`setString`) และการฉีด compiler ผ่าน reflection (`field "compiler"`) เป็นการสมมติ API ของคลาสฐาน/รีลาเทดคลาสที่ไม่ปรากฏในซอร์สที่ให้มา หากชื่อ field/สัญลักษณ์จริงต่างออกไป เคสที่พึ่ง `reportCodeChange()`/`error()` (เช่น DIV by 0, shift errors) อาจต้องปรับแก้