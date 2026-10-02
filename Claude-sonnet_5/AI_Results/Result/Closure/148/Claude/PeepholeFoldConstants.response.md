# หมายเหตุสำคัญก่อนเริ่ม (ข้อกำหนด #4)

โค้ดต้นฉบับที่ให้มาเป็นเพียงคลาส `PeepholeFoldConstants` ซึ่ง extend `AbstractPeepholeOptimization` และพึ่งพา infrastructure อื่นของ Closure Compiler (เช่น `Compiler`, `CompilerOptions`, `PeepholeOptimizationsPass`, `Node`, `NodeUtil`, `Token`) ที่ **ไม่ได้แสดง source ในโจทย์** แต่เป็นส่วนหนึ่งของ source tree เดียวกัน (compile ร่วมกันตามแนวทาง Defects4J)

สมมติฐาน (assumption) ที่ผมใช้ในการเขียนเทส และ **ไม่มีอยู่ในซอร์สที่ให้มา** (กำกับตามข้อ 4):
- `Compiler` มี constructor สาธารณะ `new Compiler()`, method `initOptions(CompilerOptions)`, method (package-private) `parseTestCode(String)` ที่คืน `Node` (SCRIPT root) สำหรับใช้ทดสอบ, และ `getErrorCount()`
- `PeepholeOptimizationsPass` มี constructor `(AbstractCompiler, AbstractPeepholeOptimization...)` และ method `process(Node externs, Node root)` ที่ traverse แล้วเรียก `optimizeSubtree` ให้อัตโนมัติ
- โครงสร้าง AST: `VAR -> NAME -> <initializer>`, statement แรกของ SCRIPT คือ child ตัวแรก

หากสมมติฐานเหล่านี้ไม่ตรงกับ API จริงในโปรเจกต์ Defects4J-Closure-148b ที่ compile จริง ให้ปรับชื่อ method/constructor ให้ตรง — ตรรกะการทดสอบ (input/expected branch) ยังคงถูกต้องตามซอร์สที่วิเคราะห์

บาง branch (เช่น `left == null` / `right == null` ใน `tryFoldBinaryOperator`) **ไม่สามารถ trigger ได้ผ่านการ parse JS ปกติ** เพราะ binary operator ที่ parse ผ่านจริงจะมี 2 children เสมอ จึง**ไม่ได้เขียนเทส**เพื่อไม่ต้อง fabricate Node ผิดรูปแบบ (จะขัดกับข้อกำหนด #4)

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

/**
 * JUnit4 test suite for {@link PeepholeFoldConstants}.
 *
 * หมายเหตุ: ใช้ Compiler / CompilerOptions / PeepholeOptimizationsPass จริงจาก
 * package com.google.javascript.jscomp (compile รวมอยู่ใน classpath เดียวกัน)
 * เพื่อ drive การ traversal เข้าสู่ optimizeSubtree() ของ PeepholeFoldConstants
 * (ดูคำอธิบาย assumption ก่อนโค้ดชุดนี้)
 */
public class PeepholeFoldConstantsTest {

  private Compiler compiler;
  private PeepholeOptimizationsPass pass;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    pass = new PeepholeOptimizationsPass(compiler, new PeepholeFoldConstants());
  }

  // ---------- helpers ----------

  /** parse "var r = <js>;" แล้วรัน pass, คืน Node ของ initializer หลัง fold */
  private Node getFolded(String js) {
    Node script = compiler.parseTestCode("var r=" + js + ";");
    assertEquals("unexpected parse error for: " + js, 0, compiler.getErrorCount());
    pass.process(null, script);
    Node varNode = script.getFirstChild();
    Node nameNode = varNode.getFirstChild();
    return nameNode.getFirstChild();
  }

  /** parse statement เดี่ยว แล้วรัน pass, คืน expression ของ statement แรกหลัง fold */
  private Node getFoldedStatementExpr(String js) {
    Node script = compiler.parseTestCode(js);
    assertEquals(0, compiler.getErrorCount());
    pass.process(null, script);
    Node stmt = script.getFirstChild();
    return stmt.getFirstChild();
  }

  /** parse if(...)/while(...) แล้วคืน condition node หลัง fold */
  private Node getFoldedCondition(String js) {
    Node script = compiler.parseTestCode(js);
    assertEquals(0, compiler.getErrorCount());
    pass.process(null, script);
    Node ctrl = script.getFirstChild();
    return ctrl.getFirstChild();
  }

  // =========================================================
  // tryFoldArithmetic / tryFoldAdd / tryFoldAddConstant
  // =========================================================

  @Test
  public void testFoldAdd_numbers() {
    Node r = getFolded("1 + 2");
    assertEquals(Token.NUMBER, r.getType());
    assertEquals(3.0, r.getDouble(), 0.0);
  }

  @Test
  public void testFoldAdd_strings() {
    Node r = getFolded("'a' + 'b'");
    assertEquals(Token.STRING, r.getType());
    assertEquals("ab", r.getString());
  }

  @Test
  public void testFoldAdd_emptyStrings() {
    // ค่าว่าง (boundary)
    Node r = getFolded("'' + ''");
    assertEquals(Token.STRING, r.getType());
    assertEquals("", r.getString());
  }

  @Test
  public void testFoldAdd_stringAndNumber() {
    Node r = getFolded("'a' + 1");
    assertEquals(Token.STRING, r.getType());
    assertEquals("a1", r.getString());
  }

  @Test
  public void testFoldAdd_leftChildAdd_stringMerge() {
    // (x + 'a') + 'b' -> x + 'ab'   (non-literal x, tryFoldLeftChildAdd)
    Node r = getFolded("(x + 'a') + 'b'");
    assertEquals(Token.ADD, r.getType());
    Node left = r.getFirstChild();
    Node right = left.getNext();
    assertEquals(Token.NAME, left.getType());
    assertEquals("x", left.getString());
    assertEquals(Token.STRING, right.getType());
    assertEquals("ab", right.getString());
  }

  @Test
  public void testFoldAdd_leftChildAdd_noFold_nonStringMiddle() {
    // (x + 1) + 'b' -> lr เป็น NUMBER ไม่ใช่ STRING -> ไม่ fold
    Node r = getFolded("(x + 1) + 'b'");
    assertEquals(Token.ADD, r.getType());
  }

  @Test
  public void testFoldSub() {
    Node r = getFolded("5 - 3");
    assertEquals(Token.NUMBER, r.getType());
    assertEquals(2.0, r.getDouble(), 0.0);
  }

  @Test
  public void testFoldMul() {
    Node r = getFolded("3 * 4");
    assertEquals(Token.NUMBER, r.getType());
    assertEquals(12.0, r.getDouble(), 0.0);
  }

  @Test
  public void testFoldDiv() {
    Node r = getFolded("10 / 2");
    assertEquals(Token.NUMBER, r.getType());
    assertEquals(5.0, r.getDouble(), 0.0);
  }

  @Test
  public void testFoldDiv_byZero_error() {
    Node r = getFolded("10 / 0");
    assertEquals(Token.DIV, r.getType()); // ไม่ fold
    assertTrue(compiler.getErrorCount() > 0); // DIVIDE_BY_0_ERROR
  }

  @Test
  public void testFoldMul_resultExceedsMax_noFold() {
    // ผลลัพธ์เกิน MAX_FOLD_NUMBER (2^53) -> ไม่ fold
    Node r = getFolded("100000000000000 * 100000000000000");
    assertEquals(Token.MUL, r.getType());
  }

  @Test
  public void testFoldArithmetic_notNumbers_noFold() {
    Node r = getFolded("x - 1");
    assertEquals(Token.SUB, r.getType());
  }

  // =========================================================
  // tryFoldBitAndOr
  // =========================================================

  @Test
  public void testFoldBitAnd() {
    Node r = getFolded("6 & 3");
    assertEquals(Token.NUMBER, r.getType());
    assertEquals(2.0, r.getDouble(), 0.0);
  }

  @Test
  public void testFoldBitOr() {
    Node r = getFolded("6 | 1");
    assertEquals(Token.NUMBER, r.getType());
    assertEquals(7.0, r.getDouble(), 0.0);
  }

  @Test
  public void testFoldBitAndOr_outOfRange_noFold() {
    Node r = getFolded("1e20 & 1");
    assertEquals(Token.BITAND, r.getType());
  }

  @Test
  public void testFoldBitAndOr_fractional_noFold() {
    Node r = getFolded("1.5 & 1");
    assertEquals(Token.BITAND, r.getType());
  }

  // =========================================================
  // tryFoldShift
  // =========================================================

  @Test
  public void testFoldLsh() {
    Node r = getFolded("2 << 1");
    assertEquals(Token.NUMBER, r.getType());
    assertEquals(4.0, r.getDouble(), 0.0);
  }

  @Test
  public void testFoldRsh() {
    Node r = getFolded("8 >> 1");
    assertEquals(Token.NUMBER, r.getType());
    assertEquals(4.0, r.getDouble(), 0.0);
  }

  @Test
  public void testFoldUrsh() {
    Node r = getFolded("8 >>> 1");
    assertEquals(Token.NUMBER, r.getType());
    assertEquals(4.0, r.getDouble(), 0.0);
  }

  @Test
  public void testFoldShift_leftOutOfRange_error() {
    Node r = getFolded("1e20 << 1");
    assertEquals(Token.LSH, r.getType());
    assertTrue(compiler.getErrorCount() > 0); // BITWISE_OPERAND_OUT_OF_RANGE
  }

  @Test
  public void testFoldShift_rightOutOfBounds_error() {
    Node r = getFolded("1 << 32");
    assertEquals(Token.LSH, r.getType());
    assertTrue(compiler.getErrorCount() > 0); // SHIFT_AMOUNT_OUT_OF_BOUNDS
  }

  @Test
  public void testFoldShift_leftFractional_error() {
    Node r = getFolded("1.5 << 1");
    assertEquals(Token.LSH, r.getType());
    assertTrue(compiler.getErrorCount() > 0); // FRACTIONAL_BITWISE_OPERAND (left)
  }

  @Test
  public void testFoldShift_rightFractional_error() {
    Node r = getFolded("1 << 1.5");
    assertEquals(Token.LSH, r.getType());
    assertTrue(compiler.getErrorCount() > 0); // FRACTIONAL_BITWISE_OPERAND (right)
  }

  // =========================================================
  // tryFoldAndOr
  // =========================================================

  @Test
  public void testFoldAndOr_trueOr_keepsLeft() {
    Node r = getFolded("true || x");
    assertEquals(Token.TRUE, r.getType());
  }

  @Test
  public void testFoldAndOr_falseAnd_keepsLeft() {
    Node r = getFolded("false && x");
    assertEquals(Token.FALSE, r.getType());
  }

  @Test
  public void testFoldAndOr_falseOr_keepsRight() {
    Node r = getFolded("false || x");
    assertEquals(Token.NAME, r.getType());
    assertEquals("x", r.getString());
  }

  @Test
  public void testFoldAndOr_trueAnd_keepsRight() {
    Node r = getFolded("true && x");
    assertEquals(Token.NAME, r.getType());
  }

  @Test
  public void testFoldAndOr_numberLeftTruthy() {
    // comment ในซอร์ส: (3 || x) => 3
    Node r = getFolded("3 || x");
    assertEquals(Token.NUMBER, r.getType());
    assertEquals(3.0, r.getDouble(), 0.0);
  }

  @Test
  public void testFoldAndOr_ifCondition_orFalse_keepsLeft() {
    Node cond = getFoldedCondition("if(x || false){y;}");
    assertEquals(Token.NAME, cond.getType());
    assertEquals("x", cond.getString());
  }

  @Test
  public void testFoldAndOr_ifCondition_andTrue_keepsLeft() {
    Node cond = getFoldedCondition("if(x && true){y;}");
    assertEquals(Token.NAME, cond.getType());
  }

  @Test
  public void testFoldAndOr_ifCondition_orTrue_noSideEffect_keepsRight() {
    Node cond = getFoldedCondition("if(x || true){y;}");
    assertEquals(Token.TRUE, cond.getType());
  }

  @Test
  public void testFoldAndOr_ifCondition_andFalse_noSideEffect_keepsRight() {
    Node cond = getFoldedCondition("if(x && false){y;}");
    assertEquals(Token.FALSE, cond.getType());
  }

  @Test
  public void testFoldAndOr_ifCondition_leftHasSideEffect_noFold() {
    // foo() มี side effect -> ไม่ fold แม้ right เป็นค่าคงที่
    Node cond = getFoldedCondition("if(foo() || true){y;}");
    assertEquals(Token.OR, cond.getType());
  }

  @Test
  public void testFoldAndOr_whileCondition_folds() {
    Node cond = getFoldedCondition("while(x || false){y;}");
    assertEquals(Token.NAME, cond.getType());
  }

  @Test
  public void testFoldAndOr_parentAssign_noFold() {
    // parent เป็น ASSIGN ไม่อยู่ใน whitelist (IF/WHILE/DO/FOR/HOOK) -> ไม่ fold
    Node r = getFolded("y = (x || false)");
    assertEquals(Token.OR, r.getType());
  }

  @Test
  public void testFoldAndOr_bothUnknown_noFold() {
    Node r = getFolded("x || y");
    assertEquals(Token.OR, r.getType());
  }

  // =========================================================
  // tryFoldInstanceof
  // =========================================================

  @Test
  public void testFoldInstanceof_immutableLeft_false() {
    Node r = getFolded("3 instanceof Object");
    assertEquals(Token.FALSE, r.getType());
  }

  @Test
  public void testFoldInstanceof_objectLiteral_true() {
    Node r = getFolded("{} instanceof Object");
    assertEquals(Token.TRUE, r.getType());
  }

  @Test
  public void testFoldInstanceof_nonObjectName_noFold() {
    Node r = getFolded("[] instanceof Array");
    assertEquals(Token.INSTANCEOF, r.getType());
  }

  @Test
  public void testFoldInstanceof_nonLiteralLeft_noFold() {
    Node r = getFolded("x instanceof Object");
    assertEquals(Token.INSTANCEOF, r.getType());
  }

  @Test
  public void testFoldInstanceof_rightSideEffect_noFold() {
    Node r = getFolded("3 instanceof foo()");
    assertEquals(Token.INSTANCEOF, r.getType());
  }

  // =========================================================
  // tryFoldAssign
  // =========================================================

  @Test
  public void testFoldAssign_add() {
    Node r = getFoldedStatementExpr("x = x + y;");
    assertEquals(Token.ASSIGN_ADD, r.getType());
  }

  @Test
  public void testFoldAssign_sub() {
    Node r = getFoldedStatementExpr("x = x - y;");
    assertEquals(Token.ASSIGN_SUB, r.getType());
  }

  @Test
  public void testFoldAssign_rightNoChildren_noFold() {
    Node r = getFoldedStatementExpr("x = y;");
    assertEquals(Token.ASSIGN, r.getType());
  }

  @Test
  public void testFoldAssign_notEqualOperand_noFold() {
    Node r = getFoldedStatementExpr("x = y + x;");
    assertEquals(Token.ASSIGN, r.getType());
  }

  @Test
  public void testFoldAssign_unsupportedOp_noFold() {
    Node r = getFoldedStatementExpr("x = x && y;");
    assertEquals(Token.ASSIGN, r.getType());
  }

  @Test
  public void testFoldAssign_leftSideEffect_noFold() {
    // left มี CALL อยู่ภายใน -> mayHaveSideEffects(left) == true
    Node r = getFoldedStatementExpr("a[f()] = a[f()] + b;");
    assertEquals(Token.ASSIGN, r.getType());
  }

  // =========================================================
  // tryFoldUnaryOperator: NOT / NEG / BITNOT
  // =========================================================

  @Test
  public void testFoldNot_true() {
    Node r = getFolded("!true");
    assertEquals(Token.FALSE, r.getType());
  }

  @Test
  public void testFoldNot_false() {
    Node r = getFolded("!false");
    assertEquals(Token.TRUE, r.getType());
  }

  @Test
  public void testFoldNot_unknown_noFold() {
    Node r = getFolded("!x");
    assertEquals(Token.NOT, r.getType());
  }

  @Test
  public void testFoldNeg_number() {
    Node r = getFolded("-5");
    assertEquals(Token.NUMBER, r.getType());
    assertEquals(-5.0, r.getDouble(), 0.0);
  }

  @Test
  public void testFoldNeg_infinity_noFold() {
    Node r = getFolded("-Infinity");
    assertEquals(Token.NEG, r.getType());
  }

  @Test
  public void testFoldNeg_nan() {
    Node r = getFolded("-NaN");
    assertEquals(Token.NAME, r.getType());
    assertEquals("NaN", r.getString());
  }

  @Test
  public void testFoldNeg_nonNumber_error() {
    Node r = getFolded("-'abc'");
    assertEquals(Token.NEG, r.getType());
    assertTrue(compiler.getErrorCount() > 0); // NEGATING_A_NON_NUMBER_ERROR
  }

  @Test
  public void testFoldBitnot_number() {
    Node r = getFolded("~5");
    assertEquals(Token.NUMBER, r.getType());
    assertEquals(-6.0, r.getDouble(), 0.0);
  }

  @Test
  public void testFoldBitnot_fractional_error() {
    Node r = getFolded("~5.5");
    assertEquals(Token.BITNOT, r.getType());
    assertTrue(compiler.getErrorCount() > 0); // FRACTIONAL_BITWISE_OPERAND
  }

  @Test
  public void testFoldBitnot_outOfRange_error() {
    Node r = getFolded("~1e20");
    assertEquals(Token.BITNOT, r.getType());
    assertTrue(compiler.getErrorCount() > 0); // BITWISE_OPERAND_OUT_OF_RANGE
  }

  @Test
  public void testFoldBitnot_nonNumber_error() {
    Node r = getFolded("~'abc'");
    assertEquals(Token.BITNOT, r.getType());
    assertTrue(compiler.getErrorCount() > 0); // NEGATING_A_NON_NUMBER_ERROR
  }

  @Test
  public void testFoldUnary_droppedInExpressionStatement() {
    // parent เป็น expression statement -> ตัด operator ทิ้งทันที (ไม่คำนวณค่า)
    // เป็นพฤติกรรมตามคอมเมนต์ TODO(dcc) ในซอร์ส
    Node r = getFoldedStatementExpr("-5;");
    assertEquals(Token.NUMBER, r.getType());
    assertEquals(5.0, r.getDouble(), 0.0); // ไม่ถูก negate เพราะตัด operator ทิ้งเฉยๆ
  }

  // =========================================================
  // tryFoldTypeof
  // =========================================================

  @Test
  public void testFoldTypeof_string() {
    Node r = getFolded("typeof 'x'");
    assertEquals(Token.STRING, r.getType());
    assertEquals("string", r.getString());
  }

  @Test
  public void testFoldTypeof_number() {
    Node r = getFolded("typeof 5");
    assertEquals("number", r.getString());
  }

  @Test
  public void testFoldTypeof_booleanTrue() {
    Node r = getFolded("typeof true");
    assertEquals("boolean", r.getString());
  }

  @Test
  public void testFoldTypeof_booleanFalse() {
    Node r = getFolded("typeof false");
    assertEquals("boolean", r.getString());
  }

  @Test
  public void testFoldTypeof_null() {
    Node r = getFolded("typeof null");
    assertEquals("object", r.getString());
  }

  @Test
  public void testFoldTypeof_objectLiteral() {
    Node r = getFolded("typeof {}");
    assertEquals("object", r.getString());
  }

  @Test
  public void testFoldTypeof_arrayLiteral() {
    Node r = getFolded("typeof []");
    assertEquals("object", r.getString());
  }

  @Test
  public void testFoldTypeof_undefinedName() {
    Node r = getFolded("typeof undefined");
    assertEquals("undefined", r.getString());
  }

  @Test
  public void testFoldTypeof_nonLiteral_noFold() {
    Node r = getFolded("typeof x");
    assertEquals(Token.TYPEOF, r.getType());
  }

  // =========================================================
  // tryFoldComparison
  // =========================================================

  @Test
  public void testFoldComparison_numberEqual() {
    Node r = getFolded("1 == 1");
    assertEquals(Token.TRUE, r.getType());
  }

  @Test
  public void testFoldComparison_numberNotEqual() {
    Node r = getFolded("1 == 2");
    assertEquals(Token.FALSE, r.getType());
  }

  @Test
  public void testFoldComparison_numberLessThan() {
    Node r = getFolded("1 < 2");
    assertEquals(Token.TRUE, r.getType());
  }

  @Test
  public void testFoldComparison_stringEqual() {
    Node r = getFolded("'a' == 'a'");
    assertEquals(Token.TRUE, r.getType());
  }

  @Test
  public void testFoldComparison_trueFalseNotEqual() {
    Node r = getFolded("true != false");
    assertEquals(Token.TRUE, r.getType());
  }

  @Test
  public void testFoldComparison_nullEqualsUndefined() {
    Node r = getFolded("null == undefined");
    assertEquals(Token.TRUE, r.getType());
  }

  @Test
  public void testFoldComparison_sameNameLessThan() {
    // NAME == NAME (ชื่อเดียวกัน), op LT -> result = false ตามซอร์ส
    Node r = getFolded("x < x");
    assertEquals(Token.FALSE, r.getType());
  }

  @Test
  public void testFoldComparison_differentName_noFold() {
    Node r = getFolded("x < y");
    assertEquals(Token.LT, r.getType());
  }

  @Test
  public void testFoldComparison_earlyReturn_nonLiteralEq_noFold() {
    // ทั้ง left/right ไม่ literal และ op ไม่ใช่ GT/LT -> return n ทันที
    Node r = getFolded("x == y");
    assertEquals(Token.EQ, r.getType());
  }

  @Test
  public void testFoldComparison_defaultType_noFold() {
    // left type ไม่ถูก handle ใน switch (เช่น ARRAYLIT) -> default: return n
    Node r = getFolded("[] == []");
    assertEquals(Token.EQ, r.getType());
  }

  // =========================================================
  // tryFoldGetElem
  // =========================================================

  @Test
  public void testFoldGetElem_validIndex() {
    Node r = getFolded("[1,2,3][1]");
    assertEquals(Token.NUMBER, r.getType());
    assertEquals(2.0, r.getDouble(), 0.0);
  }

  @Test
  public void testFoldGetElem_negativeIndex_error() {
    Node r = getFolded("[1,2,3][-1]");
    assertEquals(Token.GETELEM, r.getType());
    assertTrue(compiler.getErrorCount() > 0); // INDEX_OUT_OF_BOUNDS_ERROR
  }

  @Test
  public void testFoldGetElem_outOfBounds_error() {
    Node r = getFolded("[1,2,3][10]");
    assertEquals(Token.GETELEM, r.getType());
    assertTrue(compiler.getErrorCount() > 0); // INDEX_OUT_OF_BOUNDS_ERROR
  }

  @Test
  public void testFoldGetElem_fractionalIndex_error() {
    Node r = getFolded("[1,2,3][1.5]");
    assertEquals(Token.GETELEM, r.getType());
    assertTrue(compiler.getErrorCount() > 0); // INVALID_GETELEM_INDEX_ERROR
  }

  @Test
  public void testFoldGetElem_nonNumberIndex_noFold() {
    Node r = getFolded("[1,2,3][i]");
    assertEquals(Token.GETELEM, r.getType());
  }

  @Test
  public void testFoldGetElem_notArray_noFold() {
    Node r = getFolded("x[1]");
    assertEquals(Token.GETELEM, r.getType());
  }

  // =========================================================
  // tryFoldGetProp
  // =========================================================

  @Test
  public void testFoldGetProp_arrayLength() {
    Node r = getFolded("[1,2,3].length");
    assertEquals(Token.NUMBER, r.getType());
    assertEquals(3.0, r.getDouble(), 0.0);
  }

  @Test
  public void testFoldGetProp_stringLength() {
    Node r = getFolded("'abc'.length");
    assertEquals(Token.NUMBER, r.getType());
    assertEquals(3.0, r.getDouble(), 0.0);
  }

  @Test
  public void testFoldGetProp_notLengthProperty_noFold() {
    Node r = getFolded("[1,2,3].foo");
    assertEquals(Token.GETPROP, r.getType());
  }

  @Test
  public void testFoldGetProp_notFoldableType_noFold() {
    Node r = getFolded("x.length");
    assertEquals(Token.GETPROP, r.getType());
  }

  @Test
  public void testFoldGetProp_arraySideEffect_noFold() {
    Node r = getFolded("[foo()].length");
    assertEquals(Token.GETPROP, r.getType());
  }

  // =========================================================
  // tryFoldKnownMethods: join / indexOf / lastIndexOf
  // =========================================================

  @Test
  public void testFoldStringJoin_empty() {
    // ค่าว่าง: array ไม่มีสมาชิก
    Node r = getFolded("[].join(',')");
    assertEquals(Token.STRING, r.getType());
    assertEquals("", r.getString());
  }

  @Test
  public void testFoldStringJoin_allImmutableMerge() {
    Node r = getFolded("['a','b','c'].join('')");
    assertEquals(Token.STRING, r.getType());
    assertEquals("abc", r.getString());
  }

  @Test
  public void testFoldStringJoin_notArray_noFold() {
    Node r = getFolded("x.join(',')");
    assertEquals(Token.CALL, r.getType());
  }

  @Test
  public void testFoldStringJoin_notJoinMethod_noFold() {
    Node r = getFolded("[1,2].foo(',')");
    assertEquals(Token.CALL, r.getType());
  }

  @Test
  public void testFoldStringIndexOf_basic() {
    Node r = getFolded("'abcdef'.indexOf('cd')");
    assertEquals(Token.NUMBER, r.getType());
    assertEquals(2.0, r.getDouble(), 0.0);
  }

  @Test
  public void testFoldStringIndexOf_withFromIndex() {
    Node r = getFolded("'abcdefbc'.indexOf('bc', 3)");
    assertEquals(Token.NUMBER, r.getType());
    assertEquals(6.0, r.getDouble(), 0.0);
  }

  @Test
  public void testFoldStringIndexOf_lastIndexOf() {
    Node r = getFolded("'abcdefbc'.lastIndexOf('bc')");
    assertEquals(Token.NUMBER, r.getType());
    assertEquals(6.0, r.getDouble(), 0.0);
  }

  @Test
  public void testFoldStringIndexOf_thirdArg_noFold() {
    Node r = getFolded("'abc'.indexOf('bc', 1, 2)");
    assertEquals(Token.CALL, r.getType());
  }

  @Test
  public void testFoldStringIndexOf_secondArgNotNumber_noFold() {
    Node r = getFolded("'abc'.indexOf('bc', 'x')");
    assertEquals(Token.CALL, r.getType());
  }

  // =========================================================
  // อินพุตผิดรูปแบบ (malformed input) / boundary กว้างๆ
  // =========================================================

  @Test
  public void testMalformedInput_parseErrorHandled() {
    // ไวยากรณ์ผิดรูปแบบ -> parser ต้อง report error โดยไม่ crash ก่อนถึง pass.process
    try {
      compiler.parseTestCode("var r = ;"); // invalid syntax
      assertTrue("expected parse error to be recorded",
          compiler.getErrorCount() > 0);
    } catch (RuntimeException ex) {
      // ยอมรับได้หากผู้ parse เลือก throw แทนการบันทึก error
      // (ไม่ยืนยัน behavior ที่แน่ชัดเนื่องจากไม่มี source ของ parser ให้ตรวจสอบ)
    }
  }
}
```

# สรุปตาราง Branch/Condition ที่แต่ละเมธอดครอบคลุม

| หมวด | เมธอดเทส (ตัวอย่าง) | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| ADD/Arithmetic | testFoldAdd_numbers, _strings, _emptyStrings, _stringAndNumber | tryFoldAdd: both-literal→tryFoldAddConstant, STRING-branch vs arithmetic-branch |
| | testFoldAdd_leftChildAdd_stringMerge / _noFold_nonStringMiddle | tryFoldLeftChildAdd: lr==STRING true/false |
| | testFoldSub/Mul/Div, _byZero_error, _resultExceedsMax_noFold, _notNumbers_noFold | tryFoldArithmetic: switch ADD/SUB/MUL/DIV, div==0, ขนาดผลลัพธ์เกิน MAX_FOLD_NUMBER, type ไม่ใช่ NUMBER |
| BitAndOr | testFoldBitAnd/Or, _outOfRange_noFold, _fractional_noFold | tryFoldBitAndOr: switch BITAND/BITOR, range check, fractional check |
| Shift | testFoldLsh/Rsh/Ursh, _leftOutOfRange, _rightOutOfBounds, _leftFractional, _rightFractional | tryFoldShift: switch LSH/RSH/URSH + ทุก error branch (4 เงื่อนไข) |
| AndOr | testFoldAndOr_trueOr/_falseAnd/_falseOr/_trueAnd/_numberLeftTruthy | leftVal known: lval&&OR, !lval&&AND, else-branches |
| | testFoldAndOr_ifCondition_* (orFalse/andTrue/orTrue/andFalse/sideEffect) | rightVal known + parent whitelist + mayHaveSideEffects check |
| | testFoldAndOr_whileCondition_folds, _parentAssign_noFold, _bothUnknown_noFold | parent-type whitelist (WHILE ok, ASSIGN ไม่ ok), leftVal/rightVal ทั้งคู่ UNKNOWN |
| Instanceof | testFoldInstanceof_immutableLeft/_objectLiteral/_nonObjectName/_nonLiteralLeft/_rightSideEffect | isLiteralValue, isImmutableValue, right=="Object", mayHaveSideEffects(right) |
| Assign | testFoldAssign_add/_sub/_rightNoChildren/_notEqualOperand/_unsupportedOp/_leftSideEffect | right.hasChildren, childCount==2, areNodesEqualForInlining, switch newType, mayHaveSideEffects(left) |
| Unary NOT | testFoldNot_true/_false/_unknown_noFold | leftVal true/false/UNKNOWN |
| Unary NEG | testFoldNeg_number/_infinity_noFold/_nan/_nonNumber_error | left=="Infinity", =="NaN", getDouble() success/throw |
| Unary BITNOT | testFoldBitnot_number/_fractional_error/_outOfRange_error/_nonNumber_error | range check, intVal==val, getDouble() throw |
| Unary common | testFoldUnary_droppedInExpressionStatement | NodeUtil.isExpressionNode(parent)==true branch |
| Typeof | testFoldTypeof_string/_number/_booleanTrue/_booleanFalse/_null/_objectLiteral/_arrayLiteral/_undefinedName/_nonLiteral_noFold | switch ทุก case ของ argumentNode.getType() + isLiteralValue==false |
| Comparison | testFoldComparison_numberEqual/_NotEqual/_LessThan/_stringEqual/_trueFalseNotEqual/_nullEqualsUndefined/_sameNameLessThan/_differentName_noFold/_earlyReturn_noFold/_defaultType_noFold | switch(left.getType()): NUMBER/STRING/TRUE-FALSE/NULL/NAME/default, early-return non-literal+non-GT/LT |
| GetElem | testFoldGetElem_validIndex/_negativeIndex/_outOfBounds/_fractionalIndex/_nonNumberIndex/_notArray | right!=NUMBER, fractional, negative, out-of-bounds, left!=ARRAYLIT |
| GetProp | testFoldGetProp_arrayLength/_stringLength/_notLengthProperty/_notFoldableType/_arraySideEffect | right.getString()=="length", switch ARRAYLIT/STRING/default, mayHaveSideEffects(left) |
| Join | testFoldStringJoin_empty/_allImmutableMerge/_notArray_noFold/_notJoinMethod_noFold | arrayFoldedChildren.size()==0/1, isGetProp/isImmutableValue false, functionName!="join" |
| IndexOf | testFoldStringIndexOf_basic/_withFromIndex/_lastIndexOf/_thirdArg_noFold/_secondArgNotNumber_noFold | isIndexOf true/false, secondArg null/NUMBER/non-NUMBER, secondArg.getNext()!=null |
| Malformed | testMalformedInput_parseErrorHandled | ค่า/อินพุตผิดรูปแบบ ก่อนถึง optimizeSubtree เลย (boundary case) |

**ข้อจำกัดที่ไม่ได้ทดสอบ (ตามข้อกำหนด #4 ห้ามเดา):**
- `tryFoldBinaryOperator`: branch `left == null` และ `right == null` — ไม่สามารถเกิดได้จากการ parse JS ที่ถูกต้อง จึงไม่ได้เขียนทดสอบ
- เงื่อนไข string-length secondary check ใน `tryFoldArithmetic` (`String.valueOf(result).length() <= ...`) — ไม่ได้ทดสอบแยกเพราะขึ้นกับรายละเอียด floating-point formatting ที่ไม่แน่นอน
- multi-element `tryFoldStringJoin` default-case ที่ไม่ merge ทั้งหมด — ไม่ทดสอบเพราะขึ้นกับ threshold ขนาด cost ที่ไม่ชัดเจนจากซอร์สที่ให้มา
- การตรวจ `DiagnosticType` ที่แน่นอนของ error แต่ละตัว — ตรวจสอบเพียง `getErrorCount() > 0` เนื่องจากไม่มี API ที่ยืนยันได้ว่าจะอ่าน type ของ error อย่างไร