package com.google.javascript.jscomp;

/**
 * JUnit 4 test suite for {@link PeepholeFoldConstants}.
 *
 * หมายเหตุการออกแบบ:
 * - ใช้ CompilerTestCase (utility ภายในโปรเจกต์ jscomp เดียวกัน, ไม่ใช่ external jar)
 *   เพื่อ parse/traverse/รัน pass จริง เนื่องจาก AbstractPeepholeOptimization
 *   ต้องพึ่งพา AbstractCompiler context ที่ไม่สามารถ mock ได้ง่ายด้วย JUnit เพียว ๆ
 * - เมธอดทดสอบใช้รูปแบบ testXxx() (ไม่มี @Test) เพราะ CompilerTestCase ขยาย
 *   junit.framework.TestCase (JUnit3) ซึ่งเมื่อรันผ่าน JUnit4 runner
 *   (JUnit38ClassRunner / vintage engine) จะยังทำงานได้ตามปกติ และเป็นวิธีเดียว
 *   ที่ทำให้เข้าถึง infrastructure การ parse/print ของ Closure Compiler ได้จริง
 * - ทุก assertion อ้างอิงจาก logic ที่ trace จากซอร์สที่ให้มาโดยตรง
 */
public class PeepholeFoldConstantsTest extends CompilerTestCase {

  public PeepholeFoldConstantsTest() {
    super("");
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    enableLineNumberCheck(false);
  }

  @Override
  protected int getNumRepetitions() {
    // รันแค่ 1 รอบ เพื่อให้ผลลัพธ์ตรงกับที่ trace จาก source ทีละขั้นเท่านั้น
    return 1;
  }

  @Override
  public CompilerPass getProcessor(final Compiler compiler) {
    return new PeepholeOptimizationsPass(compiler, new PeepholeFoldConstants());
  }

  // =========================================================================
  // optimizeSubtree -> Token.TYPEOF -> tryFoldTypeof
  // =========================================================================

  public void testTypeofFunction() {
    test("typeof function() {}", "'function'");
  }

  public void testTypeofString() {
    test("typeof 'foo'", "'string'");
  }

  public void testTypeofNumber() {
    test("typeof 1", "'number'");
  }

  public void testTypeofBooleanTrue() {
    test("typeof true", "'boolean'");
  }

  public void testTypeofNull() {
    test("typeof null", "'object'");
  }

  public void testTypeofArrayLit() {
    test("typeof []", "'object'");
  }

  public void testTypeofVoidLiteral() {
    test("typeof void 0", "'undefined'");
  }

  public void testTypeofUndefinedName() {
    test("typeof undefined", "'undefined'");
  }

  public void testTypeofNonLiteralUnchanged() {
    // argumentNode ไม่ใช่ literal value -> return originalTypeofNode
    testSame("typeof x;");
  }

  public void testTypeofUnsupportedLiteralUnchanged() {
    // literal ที่ไม่มี case รองรับ (เช่น REGEXP) -> typeNameString เป็น null -> unchanged
    testSame("typeof /abc/;");
  }

  // =========================================================================
  // optimizeSubtree -> Token.NEW -> tryFoldCtorCall / inForcedStringContext
  // =========================================================================

  public void testNewCtorOutsideStringContextUnchanged() {
    // parent ไม่ใช่ GETELEM -> inForcedStringContext = false -> unchanged
    testSame("var x = new String('hello');");
  }

  public void testNewStringInGetElemWithValueFolds() {
    test("this[new String('eval')];", "this['eval'];");
  }

  public void testNewStringInGetElemNoArgsFolds() {
    // value == null -> stringValue = ""
    test("this[new String()];", "this[''];");
  }

  public void testNewStringInGetElemNonImmutableArgUnchanged() {
    // value ไม่ใช่ immutable -> return n
    testSame("this[new String(x)];");
  }

  public void testNewNonStringCtorInGetElemUnchanged() {
    testSame("this[new Foo('a')];");
  }

  public void testNewNonNameCtorInGetElemUnchanged() {
    // objectType.getType() != NAME -> return n
    testSame("this[new (foo())('a')];");
  }

  // =========================================================================
  // optimizeSubtree -> Token.NOT -> tryFoldUnaryOperator (NOT branch)
  // NOT ไม่อยู่ใน tryReduceOperandsForOp list จึงไม่ถูก pre-convert
  // =========================================================================

  public void testNotUnknownLeftUnchanged() {
    testSame("!x;"); // getPureBooleanValue(x) == UNKNOWN
  }

  public void testNotZeroNotFolded() {
    // กันไว้ไม่ให้ !0 พับกลับ false
    testSame("!0;");
  }

  public void testNotOneNotFolded() {
    testSame("!1;");
  }

  public void testNotTruthyNumberFolds() {
    test("!5;", "false;");
  }

  public void testNotEmptyStringFolds() {
    test("!'';", "true;");
  }

  // =========================================================================
  // Token.POS
  // =========================================================================

  public void testPosNumericFolds() {
    test("+5;", "5;");
  }

  public void testPosBooleanConvertedThenFolds() {
    // tryReduceOperandsForOp(POS) แปลง true -> 1 ก่อน แล้ว isNumericResult(1)=true
    test("+true;", "1;");
  }

  public void testPosNonNumericResultUnchanged() {
    // getNumberValue(CALL) ไม่รู้ค่า -> ไม่ถูกแปลง -> leftVal UNKNOWN -> unchanged
    testSame("+foo();");
  }

  // =========================================================================
  // Token.NEG
  // =========================================================================

  public void testNegNormalFolds() {
    test("-5;", "-5;");
  }

  public void testNegInfinityNameUnchanged() {
    testSame("-Infinity;");
  }

  public void testNegNaNFolds() {
    test("-NaN;", "NaN;");
  }

  public void testNegNonNumberError() {
    test("-x;", "-x;", PeepholeFoldConstants.NEGATING_A_NON_NUMBER_ERROR);
  }

  // =========================================================================
  // Token.BITNOT
  // =========================================================================

  public void testBitnotNormalFolds() {
    test("~5;", "-6;");
  }

  public void testBitnotFractionalError() {
    test("~5.5;", "~5.5;", PeepholeFoldConstants.FRACTIONAL_BITWISE_OPERAND);
  }

  public void testBitnotOutOfRangeError() {
    test("~4294967296;", "~4294967296;",
        PeepholeFoldConstants.BITWISE_OPERAND_OUT_OF_RANGE);
  }

  public void testBitnotNonNumberError() {
    test("~x;", "~x;", PeepholeFoldConstants.NEGATING_A_NON_NUMBER_ERROR);
  }

  public void testBitnotStringOperandConvertedThenFolds() {
    // tryReduceOperandsForOp(BITNOT) แปลง '5' -> 5 ก่อน แล้ว fold ~5 = -6
    test("~'5';", "-6;");
  }

  // =========================================================================
  // Token.INSTANCEOF
  // =========================================================================

  public void testInstanceofNonLiteralLeftUnchanged() {
    testSame("x instanceof Object;");
  }

  public void testInstanceofSideEffectRightUnchanged() {
    testSame("1 instanceof foo();");
  }

  public void testInstanceofImmutableLeftFoldsFalse() {
    test("1 instanceof Foo;", "false;");
  }

  public void testInstanceofObjectLiteralRightObjectFoldsTrue() {
    test("({}) instanceof Object;", "true;");
  }

  public void testInstanceofObjectLiteralOtherRightUnchanged() {
    testSame("({}) instanceof Foo;");
  }

  // =========================================================================
  // Token.ASSIGN -> tryFoldAssign
  // =========================================================================

  public void testAssignAddSameOrderFolds() {
    test("x = x + y;", "x += y;");
  }

  public void testAssignAddCommutativeOrderFolds() {
    test("x = y + x;", "x += y;");
  }

  public void testAssignSubSameOrderFolds() {
    test("x = x - y;", "x -= y;");
  }

  public void testAssignSubNonCommutativeUnchanged() {
    // SUB ไม่ commutative -> เงื่อนไข else if ไม่ผ่าน -> unchanged
    testSame("x = y - x;");
  }

  public void testAssignRhsTooFewChildrenUnchanged() {
    // right.hasChildren() == false
    testSame("x = 5;");
  }

  public void testAssignRhsUnaryUnchanged() {
    // right มีลูกแค่ 1 ตัว -> firstChild.getNext() == null != lastChild
    testSame("x = -y;");
  }

  public void testAssignUnsupportedRhsOpUnchanged() {
    // เข้า switch newType แต่ INSTANCEOF ไม่มี case -> default: return n
    testSame("x = x instanceof y;");
  }

  public void testAssignAllOperatorTypesMapCorrectNewType() {
    test("x = x * y;", "x *= y;");
    test("x = x / y;", "x /= y;");
    test("x = x % y;", "x %= y;");
    test("x = x & y;", "x &= y;");
    test("x = x | y;", "x |= y;");
    test("x = x ^ y;", "x ^= y;");
    test("x = x << y;", "x <<= y;");
    test("x = x >> y;", "x >>= y;");
    test("x = x >>> y;", "x >>>= y;");
  }

  // =========================================================================
  // Token.AND / Token.OR -> tryFoldAndOr
  // =========================================================================

  public void testOrTrueLeftFoldsToLeft() {
    test("true || x;", "true;");
  }

  public void testAndFalseLeftFoldsToLeft() {
    test("false && x;", "false;");
  }

  public void testOrFalseLeftNoSideEffectFoldsToRight() {
    test("false || x;", "x;");
  }

  public void testAndTrueLeftNoSideEffectFoldsToRight() {
    test("true && x;", "x;");
  }

  public void testOrUnknownLeftUnchanged() {
    testSame("a || b;");
  }

  public void testOrLeftSideEffectPreventsFold() {
    // ASSUMPTION: getImpureBooleanValue(void foo()) == FALSE (undefined เป็น falsy เสมอ)
    // lval=false,type=OR -> เข้า else if(!mayHaveSideEffects(left)) ซึ่งเป็น false
    // เพราะ foo() มี side effect -> ไม่ fold
    testSame("void foo() || x;");
  }

  // =========================================================================
  // Token.LSH / RSH / URSH -> tryFoldShift
  // =========================================================================

  public void testShiftBasicFolds() {
    test("1 << 2;", "4;");
    // ASSUMPTION: traversal เป็น post-order ทำให้ NEG(8) ถูก fold เป็น NUMBER(-8)
    // ก่อนที่ RSH node จะถูกประมวลผล
    test("-8 >> 1;", "-4;");
    test("8 >>> 1;", "4;");
    test("-1 >>> 0;", "4294967295;");
  }

  public void testShiftLeftOperandOutOfRangeError() {
    test("2147483648 << 1;", "2147483648 << 1;",
        PeepholeFoldConstants.BITWISE_OPERAND_OUT_OF_RANGE);
  }

  public void testShiftAmountOutOfBoundsErrors() {
    test("1 << 32;", "1 << 32;", PeepholeFoldConstants.SHIFT_AMOUNT_OUT_OF_BOUNDS);
    test("1 << -1;", "1 << -1;", PeepholeFoldConstants.SHIFT_AMOUNT_OUT_OF_BOUNDS);
  }

  public void testShiftFractionalOperandErrors() {
    test("1.5 << 1;", "1.5 << 1;", PeepholeFoldConstants.FRACTIONAL_BITWISE_OPERAND);
    test("1 << 1.5;", "1 << 1.5;", PeepholeFoldConstants.FRACTIONAL_BITWISE_OPERAND);
  }

  // =========================================================================
  // tryFoldComparison / getNormalizedNodeType / compareAsNumbers
  // =========================================================================

  public void testCompareNumbers() {
    test("1 < 2;", "true;");
    test("2 < 1;", "false;");
    test("1 == 1;", "true;");
    test("1 == 2;", "false;");
    test("1 != 2;", "true;");
    test("1 <= 1;", "true;");
    test("2 >= 3;", "false;");
  }

  public void testCompareStrings() {
    test("'a' == 'a';", "true;");
    test("'a' == 'b';", "false;");
    test("'a' != 'b';", "true;");
  }

  public void testCompareNullTrueFalseLiterals() {
    test("null == null;", "true;");
    test("true == false;", "false;");
    test("true == true;", "true;");
    test("true != false;", "true;");
  }

  public void testCompareBooleanRelational() {
    // ASSUMPTION: getNumberValue(TRUE)=1, getNumberValue(FALSE)=0 (มาตรฐาน JS)
    test("true < false;", "false;");
    test("false < true;", "true;");
  }

  public void testCompareThisIsEffectivelyUnreachableForEqAndUnhandledForLt() {
    // outer guard: ทั้งสองข้างไม่ literal และ op ไม่ใช่ GT/LT -> return n ก่อนถึง case THIS
    testSame("this == this;");
    // op เป็น LT ผ่าน guard ได้ แต่ case THIS จัดการแค่ EQ/NE -> default: return n
    testSame("this < this;");
  }

  public void testCompareSameNameAlwaysFalseForLtGt() {
    test("x < x;", "false;");
    test("x > x;", "false;");
  }

  public void testCompareDifferentNamesUnchanged() {
    testSame("x < y;"); // ln != rn -> return n
    testSame("x == y;"); // ไม่ literal ทั้งคู่ และ op ไม่ใช่ GT/LT -> return n
  }

  // =========================================================================
  // Token.ADD / tryFoldAdd / tryFoldAddConstantString / tryFoldChildAddString
  // =========================================================================

  public void testAddConstantStrings() {
    test("'a' + 'b';", "'ab';");
  }

  public void testAddChildStringFolds() {
    test("x + 'a' + 'b';", "x + 'ab';");
  }

  public void testAddNumbersFolds() {
    test("1 + 2;", "3;");
  }

  // =========================================================================
  // Token.SUB / DIV / MOD -> tryFoldArithmeticOp / performArithmeticOp
  // =========================================================================

  public void testSubNumbersFolds() {
    test("5 - 2;", "3;");
  }

  public void testDivNumbersFolds() {
    test("10 / 2;", "5;");
  }

  public void testDivAndModByZeroUnchanged() {
    testSame("10 / 0;");
    testSame("10 % 0;");
  }

  public void testInfinityArithmetic() {
    // ASSUMPTION: getNumberValue(NAME "Infinity") == Double.POSITIVE_INFINITY
    test("Infinity + Infinity;", "Infinity;");
    test("Infinity - Infinity;", "NaN;");
  }

  // =========================================================================
  // Token.MUL / BITAND / BITOR / BITXOR -> tryFoldArithmeticOp then
  // tryFoldLeftChildOp
  // =========================================================================

  public void testBitwiseOpsNumbersFold() {
    test("5 & 3;", "1;");
    test("5 | 2;", "7;");
    test("5 ^ 1;", "4;");
  }

  public void testMulLeftChildAssocFolds() {
    test("x * 2 * 3;", "x * 6;");
  }

  public void testAddLeftChildAssocFolds() {
    test("x + 2 + 3;", "x + 5;");
  }

  public void testMulLeftChildBothOperandsFailUnchanged() {
    // ll=x, lr=y ทั้งคู่ไม่ใช่ตัวเลข -> replacement เป็น null ทั้งสองรอบ -> ไม่เปลี่ยน
    testSame("x * y * 3;");
  }

  public void testMulResultTooLargeUnchanged() {
    // เกิน MAX_FOLD_NUMBER (2^53) -> performArithmeticOp คืน null
    testSame("100000000000000 * 100000000000000;");
  }

  // =========================================================================
  // Token.VOID -> tryReduceVoid
  // =========================================================================

  public void testVoidZeroAlreadyFoldedUnchanged() {
    testSame("void 0;");
  }

  public void testVoidNonZeroNumberFolds() {
    test("void 5;", "void 0;");
  }

  public void testVoidNoSideEffectFolds() {
    test("void 'abc';", "void 0;");
  }

  public void testVoidSideEffectUnchanged() {
    testSame("void foo();");
  }

  // =========================================================================
  // tryReduceOperandsForOp / tryConvertOperandsToNumber / tryConvertToNumber
  // =========================================================================

  public void testReduceOperandsStringToNumberOnSub() {
    // default case ของ tryConvertToNumber: getNumberValue('5')=5 (ASSUMPTION มาตรฐาน)
    test("'5' - '2';", "3;");
  }

  public void testReduceOperandsCommaRecursionInsideAssignSub() {
    test("x -= (1, '2');", "x -= (1, 2);");
  }

  public void testReduceOperandsHookRecursionInsideAssignMul() {
    test("x *= (a ? 1 : '2');", "x *= (a ? 1 : 2);");
  }

  public void testReduceOperandsUndefinedNameInsideAssignDiv() {
    // ASSUMPTION: NodeUtil.isUndefined(NAME "undefined") == true,
    // getNumberValue(undefined) == NaN -> replaced เป็น NAME "NaN"
    test("x /= undefined;", "x /= NaN;");
  }

  public void testReduceOperandsNonUndefinedNameUnchanged() {
    testSame("x %= y;");
  }

  // =========================================================================
  // Token.GETPROP -> tryFoldGetProp
  // =========================================================================

  public void testGetPropArrayLengthFolds() {
    test("[1,2,3].length;", "3;");
  }

  public void testGetPropStringLengthFolds() {
    test("'abc'.length;", "3;");
  }

  public void testGetPropNonLengthOrNonFoldableLeftUnchanged() {
    testSame("x.length;");           // left ไม่ใช่ ARRAYLIT/STRING
    testSame("[1, 2, 3].foo;");      // right != "length"
  }

  public void testGetPropArrayLengthSideEffectUnchanged() {
    testSame("[foo()].length;");
  }

  public void testGetPropObjectLiteralDelegatesToPropAccess() {
    test("({a:1}).a;", "1;");
  }

  // =========================================================================
  // Token.GETELEM -> tryFoldGetElem
  // =========================================================================

  public void testGetElemObjectLiteralDelegatesToPropAccess() {
    test("({a:1})['a'];", "1;");
  }

  public void testGetElemArrayLiteralDelegatesToArrayAccess() {
    test("[1,2,3][0];", "1;");
  }

  public void testGetElemOtherLeftUnchanged() {
    testSame("x[0];");
  }

  // =========================================================================
  // tryFoldArrayAccess
  // =========================================================================

  public void testArrayAccessNonNumberIndexUnchanged() {
    testSame("[1,2,3]['x'];");
  }

  public void testArrayAccessFractionalIndexError() {
    test("[1,2,3][1.5];", "[1,2,3][1.5];",
        PeepholeFoldConstants.INVALID_GETELEM_INDEX_ERROR);
  }

  public void testArrayAccessNegativeIndexError() {
    test("[1,2,3][-1];", "[1,2,3][-1];",
        PeepholeFoldConstants.INDEX_OUT_OF_BOUNDS_ERROR);
  }

  public void testArrayAccessOutOfBoundsError() {
    test("[1,2,3][5];", "[1,2,3][5];",
        PeepholeFoldConstants.INDEX_OUT_OF_BOUNDS_ERROR);
  }

  public void testArrayAccessNormalFolds() {
    test("[1,2,3][0];", "1;");
    test("[1,2,3][2];", "3;");
  }

  // =========================================================================
  // tryFoldObjectPropAccess
  // =========================================================================

  public void testObjectPropAccessNonStringKeyUnchanged() {
    testSame("({a:1})[x];");
  }

  public void testObjectPropAccessAssignmentTargetUnchanged() {
    testSame("({a:1}).a = 2;");
  }

  public void testObjectPropAccessIncDecTargetUnchanged() {
    testSame("({a:1}).a++;");
    testSame("({a:1}).a--;");
  }

  public void testObjectPropAccessLastDefinitionWins() {
    test("({a:1, b:2}).b;", "2;");
    test("({a:1, a:2}).a;", "2;"); // duplicate key, ไม่มี side-effect ก่อนหน้า
  }

  public void testObjectPropAccessFunctionReferencingThisUnchanged() {
    testSame("({a: function() { return this; }}).a;");
  }

  public void testObjectPropAccessGetterFoldsToCall() {
    test("({get a() { return 1; }}).a;", "(function() { return 1; })();");
  }

  public void testObjectPropAccessSetterOnlyUnchanged() {
    // case SET: continue -> value ไม่ถูกกำหนด -> value==null -> return n
    testSame("({set a(v) {}}).a;");
  }

  public void testObjectPropAccessSideEffectBeforeMatchUnchanged() {
    testSame("({a: foo(), b: 2}).b;");
  }

  public void testObjectPropAccessEmptyObjectUnchanged() {
    testSame("({}).a;");
  }

  // =========================================================================
  // default case ของ optimizeSubtree/tryFoldBinaryOperator (เช่น COMMA)
  // =========================================================================

  public void testDefaultBinaryOpCommaUnchanged() {
    testSame("x, y;");
  }
}
