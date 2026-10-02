package com.google.javascript.jscomp;

import org.junit.Test;

/**
 * Unit tests for {@link PeepholeFoldConstants}.
 *
 * ใช้ CompilerTestCase (test harness ที่มีอยู่แล้วในโปรเจกต์ Closure Compiler)
 * เพื่อรันการพับค่าคงที่ผ่าน PeepholeOptimizationsPass จริง แทนการเรียก
 * private method ภายใน PeepholeFoldConstants ตรง ๆ (ซึ่งต้องพึ่งพา
 * AbstractPeepholeOptimization ที่ไม่มีซอร์สโค้ดให้ในโจทย์)
 */
public class PeepholeFoldConstantsTest extends CompilerTestCase {

  public PeepholeFoldConstantsTest() {
    super("");
  }

  @Override
  protected CompilerPass getProcessor(final Compiler compiler) {
    return new PeepholeOptimizationsPass(compiler, new PeepholeFoldConstants());
  }

  private void fold(String js, String expected) {
    test(js, expected);
  }

  private void foldSame(String js) {
    testSame(js);
  }

  private void fold(String js, String expected, DiagnosticType error) {
    test(js, expected, error);
  }

  // ===================== typeof =====================

  @Test
  public void testFoldTypeofLiterals() {
    fold("typeof(1)", "\"number\"");
    fold("typeof('foo')", "\"string\"");
    fold("typeof(true)", "\"boolean\"");
    fold("typeof(false)", "\"boolean\"");
    fold("typeof(null)", "\"object\"");
    fold("typeof([])", "\"object\"");
    fold("typeof({})", "\"object\"");
    fold("typeof(void 0)", "\"undefined\"");
    fold("typeof(undefined)", "\"undefined\"");
    fold("typeof(function() {})", "\"function\"");
  }

  @Test
  public void testFoldTypeofNotLiteral() {
    // argumentNode ไม่เป็น literal value -> คงเดิม
    foldSame("typeof(x)");
  }

  // ===================== NOT =====================

  @Test
  public void testFoldNot() {
    fold("!true", "false");
    fold("!false", "true");
    fold("!2", "false");
  }

  @Test
  public void testFoldNotZeroOrOneGuard() {
    // กันไม่ให้ fold !0 / !1 กลับเป็น false/true ตามที่คอมเมนต์ในซอร์สระบุ
    foldSame("!0");
    foldSame("!1");
  }

  @Test
  public void testFoldNotUnknownBoolean() {
    foldSame("!x"); // leftVal == UNKNOWN -> return n
  }

  // ===================== POS =====================

  @Test
  public void testFoldPosNumeric() {
    fold("+1", "1");
  }

  @Test
  public void testFoldPosUnknown() {
    // leftVal ของตัวแปร x เป็น UNKNOWN -> return n ก่อนถึง switch เลย
    // (เลี่ยงกรณี +"a" เพราะ tryReduceOperandsForOp อาจแปลง string เป็นตัวเลขก่อน
    //  ทำให้ผลลัพธ์สุดท้ายไม่แน่นอนจากซอร์สที่ให้มา)
    foldSame("+x");
  }

  // ===================== NEG =====================

  @Test
  public void testFoldNegNumber() {
    fold("-1", "-1");
  }

  @Test
  public void testFoldNegInfinity() {
    foldSame("-Infinity"); // ไม่แก้ไข "-Infinity" ตามคอมเมนต์ในซอร์ส
  }

  @Test
  public void testFoldNegNaN() {
    // สมมติ (assumption): NodeUtil ปฏิบัติกับ NAME "NaN" เป็นค่าที่ทราบ boolean/ตัวเลขแน่นอน
    fold("-NaN", "NaN");
  }

  // หมายเหตุ: ข้ามกรณี -"a" / ~"a" (UnsupportedOperationException path)
  // เนื่องจาก tryReduceOperandsForOp เรียก tryConvertOperandsToNumber ก่อน
  // ซึ่งพฤติกรรมของ NodeUtil.getNumberValue(STRING) ไม่ปรากฏในซอร์สที่ให้มา
  // จึงไม่สามารถยืนยัน branch ปลายทาง (NEGATING_A_NON_NUMBER_ERROR) ได้อย่างมั่นใจ

  // ===================== BITNOT =====================

  @Test
  public void testFoldBitnot() {
    fold("~0", "-1");
    fold("~3", "-4");
  }

  @Test
  public void testFoldBitnotFractional() {
    fold("~1.5", "~1.5", PeepholeFoldConstants.FRACTIONAL_BITWISE_OPERAND);
  }

  @Test
  public void testFoldBitnotOutOfRange() {
    fold("~1e20", "~1e20", PeepholeFoldConstants.BITWISE_OPERAND_OUT_OF_RANGE);
  }

  // ===================== VOID =====================

  @Test
  public void testFoldVoidNonZero() {
    fold("void 1", "void 0");
  }

  @Test
  public void testFoldVoidAlreadyZero() {
    foldSame("void 0");
  }

  @Test
  public void testFoldVoidSideEffect() {
    foldSame("void foo()"); // มี side effect -> ไม่ fold
  }

  // ===================== AND / OR =====================

  @Test
  public void testFoldOrTrueLeft() {
    fold("1 || x", "1");
  }

  @Test
  public void testFoldAndFalseLeft() {
    fold("0 && x", "0");
  }

  @Test
  public void testFoldOrFalseLeftNoSideEffect() {
    fold("0 || x", "x");
  }

  @Test
  public void testFoldAndTrueLeftNoSideEffect() {
    fold("1 && x", "x");
  }

  @Test
  public void testFoldAndOrUnknownLeft() {
    foldSame("x && y");
    foldSame("x || y");
  }

  // ===================== SHIFT =====================

  @Test
  public void testFoldShiftBasic() {
    fold("1 << 2", "4");
    fold("8 >> 2", "2");
    fold("1 >>> 0", "1");
  }

  @Test
  public void testFoldShiftNonNumberOperand() {
    foldSame("x << 1");
  }

  @Test
  public void testFoldShiftLeftOutOfRange() {
    fold("1e20 << 1", "1e20 << 1",
        PeepholeFoldConstants.BITWISE_OPERAND_OUT_OF_RANGE);
  }

  @Test
  public void testFoldShiftAmountOutOfBounds() {
    fold("1 << 32", "1 << 32", PeepholeFoldConstants.SHIFT_AMOUNT_OUT_OF_BOUNDS);
    fold("1 << -1", "1 << -1", PeepholeFoldConstants.SHIFT_AMOUNT_OUT_OF_BOUNDS);
  }

  @Test
  public void testFoldShiftFractionalLeft() {
    fold("1.5 << 1", "1.5 << 1", PeepholeFoldConstants.FRACTIONAL_BITWISE_OPERAND);
  }

  @Test
  public void testFoldShiftFractionalRight() {
    fold("1 << 1.5", "1 << 1.5", PeepholeFoldConstants.FRACTIONAL_BITWISE_OPERAND);
  }

  // ===================== ASSIGN =====================

  @Test
  public void testFoldAssignAddSameOrder() {
    fold("x = x + 1", "x += 1");
  }

  @Test
  public void testFoldAssignAddCommutative() {
    fold("x = 1 + x", "x += 1");
  }

  @Test
  public void testFoldAssignSub() {
    fold("x = x - 1", "x -= 1");
  }

  @Test
  public void testFoldAssignSingleChildRhs() {
    foldSame("x = 1"); // right.hasChildren() == false
  }

  @Test
  public void testFoldAssignUnsupportedRhsOp() {
    foldSame("x = x && 1"); // right op ไม่อยู่ใน switch -> default
  }

  // ===================== ADD (string concat) =====================

  @Test
  public void testFoldAddConstantString() {
    fold("'a' + 'b'", "\"ab\"");
    fold("'a' + 1", "\"a1\"");
  }

  @Test
  public void testFoldChildAddStringLeftAssoc() {
    fold("foo() + 'a' + 'b'", "foo() + \"ab\"");
  }

  @Test
  public void testFoldChildAddStringRightAssoc() {
    fold("'a' + ('b' + foo())", "\"ab\" + foo()");
  }

  // ===================== ADD / arithmetic =====================

  @Test
  public void testFoldAddArithmetic() {
    fold("1 + 2", "3");
  }

  @Test
  public void testFoldLeftChildOpMul() {
    // ตัวอย่างตรงจาก javadoc ในซอร์ส: foo() * 10 * 20 -> foo() * 200
    fold("foo() * 10 * 20", "foo() * 200");
  }

  // ===================== SUB / DIV / MOD =====================

  @Test
  public void testFoldSub() {
    fold("5 - 2", "3");
  }

  @Test
  public void testFoldDiv() {
    fold("6 / 3", "2");
  }

  @Test
  public void testFoldDivByZero() {
    foldSame("1 / 0"); // rval == 0 -> return null
  }

  @Test
  public void testFoldModByZero() {
    foldSame("1 % 0");
  }

  @Test
  public void testFoldArithmeticNaNResult() {
    fold("NaN - 1", "NaN");
  }

  @Test
  public void testFoldArithmeticInfinityResult() {
    fold("0 - Infinity", "-Infinity");
  }

  @Test
  public void testFoldArithmeticResultTooLong() {
    // ผลลัพธ์ 0.3333333333333333 ยาวเกิน length-check เกณฑ์ -> ไม่ fold
    foldSame("1 / 3");
  }

  // ===================== Comparison =====================

  @Test
  public void testFoldComparisonNumber() {
    fold("1 < 2", "true");
    fold("2 > 3", "false");
  }

  @Test
  public void testFoldComparisonUnknownNameDiffer() {
    foldSame("x < y");
  }

  @Test
  public void testFoldComparisonSameNameLtGt() {
    fold("x < x", "false");
    fold("x > x", "false");
  }

  @Test
  public void testFoldComparisonSameNameNonLtGtOp() {
    // ไม่ใช่ literal ทั้งคู่ และ op ไม่ใช่ GT/LT -> ติดเงื่อนไขด่านแรก -> ไม่ fold
    foldSame("x == x");
  }

  @Test
  public void testFoldComparisonString() {
    fold("'a' == 'a'", "true");
    fold("'a' == 'b'", "false");
    fold("'a' != 'a'", "false");
  }

  @Test
  public void testFoldComparisonNull() {
    fold("null == null", "true");
    fold("null != null", "false");
  }

  @Test
  public void testFoldComparisonBoolean() {
    fold("true == true", "true");
    fold("true == false", "false");
    fold("true != false", "true");
    fold("true < false", "false");
    fold("false < true", "true");
  }

  @Test
  public void testFoldComparisonVoidNotLiteralOperand() {
    // ลูกของ void ไม่ใช่ literal -> ไม่ fold (ติดเงื่อนไขด่านแรกด้วย เพราะ left ไม่ literal)
    foldSame("void foo() == undefined");
  }

  // ===================== instanceof =====================

  @Test
  public void testFoldInstanceofImmutableLeft() {
    fold("1 instanceof Number", "false");
  }

  @Test
  public void testFoldInstanceofObjectRight() {
    fold("({} instanceof Object)", "true");
  }

  @Test
  public void testFoldInstanceofNonLiteralLeft() {
    foldSame("x instanceof Object");
  }

  @Test
  public void testFoldInstanceofSideEffectRight() {
    foldSame("1 instanceof foo()");
  }

  // ===================== GETPROP (.length / object literal) =====================

  @Test
  public void testFoldGetPropArrayLength() {
    fold("[1, 2, 3].length", "3");
  }

  @Test
  public void testFoldGetPropStringLength() {
    fold("'abc'.length", "3");
  }

  @Test
  public void testFoldGetPropNotFoldable() {
    foldSame("x.length");
  }

  @Test
  public void testFoldGetPropArrayLengthSideEffect() {
    foldSame("[foo()].length");
  }

  @Test
  public void testFoldObjectLitPropAccess() {
    fold("({a:1}).a", "1");
  }

  @Test
  public void testFoldObjectLitPropAccessSideEffectOtherProp() {
    foldSame("({a:foo(), b:1}).b");
  }

  @Test
  public void testFoldObjectLitPropAccessAssignTarget() {
    foldSame("({a:1}).a = 2");
  }

  // ===================== GETELEM (array index) =====================

  @Test
  public void testFoldGetElemArray() {
    fold("[1, 2, 3][0]", "1");
    fold("[1, 2, 3][2]", "3");
  }

  @Test
  public void testFoldGetElemOutOfBounds() {
    fold("[1, 2, 3][3]", "[1, 2, 3][3]",
        PeepholeFoldConstants.INDEX_OUT_OF_BOUNDS_ERROR);
  }

  @Test
  public void testFoldGetElemNegativeIndex() {
    fold("[1, 2, 3][-1]", "[1, 2, 3][-1]",
        PeepholeFoldConstants.INDEX_OUT_OF_BOUNDS_ERROR);
  }

  @Test
  public void testFoldGetElemNonIntegerIndex() {
    fold("[1, 2, 3][1.5]", "[1, 2, 3][1.5]",
        PeepholeFoldConstants.INVALID_GETELEM_INDEX_ERROR);
  }

  @Test
  public void testFoldGetElemNonNumberIndex() {
    foldSame("[1, 2, 3][x]");
  }

  // ===================== new String() ในบริบท GETELEM =====================

  @Test
  public void testFoldCtorNewStringInGetElem() {
    fold("x[new String('abc')]", "x[\"abc\"]");
  }

  @Test
  public void testFoldCtorNewStringNoArg() {
    fold("x[new String()]", "x[\"\"]");
  }

  @Test
  public void testFoldCtorNewStringNotImmutableArg() {
    foldSame("x[new String(foo())]");
  }

  @Test
  public void testFoldCtorNotInForcedStringContext() {
    foldSame("new String('abc')");
  }

  @Test
  public void testFoldCtorNotStringCtor() {
    foldSame("x[new Number(1)]");
  }

  // ===================== Array.join =====================

  @Test
  public void testFoldArrayJoinBasic() {
    fold("['a', 'b', 'c'].join('')", "\"abc\"");
    fold("['a', 'b'].join(',')", "\"a,b\"");
  }

  @Test
  public void testFoldArrayJoinEmptyArray() {
    fold("[].join(',')", "\"\"");
  }

  @Test
  public void testFoldArrayJoinNonImmutableSeparator() {
    foldSame("[1, 2].join(foo())");
  }

  // ===================== String methods =====================

  @Test
  public void testFoldStringCaseConversion() {
    fold("'ABC'.toLowerCase()", "\"abc\"");
    fold("'abc'.toUpperCase()", "\"ABC\"");
  }

  @Test
  public void testFoldStringIndexOf() {
    fold("'abcdef'.indexOf('cd')", "2");
    fold("'abcdef'.lastIndexOf('cd')", "2");
    fold("'abcdef'.indexOf('cd', 3)", "-1");
  }

  @Test
  public void testFoldStringIndexOfNonImmutableArg() {
    foldSame("'abc'.indexOf(x)");
  }

  @Test
  public void testFoldStringIndexOfExtraArg() {
    foldSame("'abc'.indexOf('a', 0, 1)");
  }

  @Test
  public void testFoldStringSubstr() {
    fold("'abcdef'.substr(1, 2)", "\"bc\"");
    fold("'abcdef'.substr(1)", "\"bcdef\"");
  }

  @Test
  public void testFoldStringSubstrOutOfRange() {
    foldSame("'abc'.substr(-1, 2)");
    foldSame("'abc'.substr(0, 10)");
  }

  @Test
  public void testFoldStringSubstring() {
    fold("'abcdef'.substring(1, 3)", "\"bc\"");
    fold("'abcdef'.substring(1)", "\"bcdef\"");
  }

  @Test
  public void testFoldStringSubstringOutOfRange() {
    foldSame("'abc'.substring(-1, 2)");
    foldSame("'abc'.substring(0, 10)");
  }

  // ===================== Known-methods dispatch guards =====================

  @Test
  public void testFoldKnownMethodsCallTargetNotGet() {
    foldSame("foo(1, 2)");
  }

  @Test
  public void testFoldKnownMethodsTargetNotStringLiteral() {
    foldSame("x.substr(1, 2)");
  }

  // ===================== default branch ของ tryFoldBinaryOperator =====================

  @Test
  public void testFoldBinaryOperatorDefaultCase() {
    // COMMA ไม่ถูกจัดการใน switch ของ tryFoldBinaryOperator -> คงเดิม
    foldSame("1, 2");
  }
}
