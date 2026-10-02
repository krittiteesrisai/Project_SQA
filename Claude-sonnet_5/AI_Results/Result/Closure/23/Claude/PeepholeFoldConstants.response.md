# หมายเหตุสำคัญก่อนเริ่ม (ข้อจำกัดของการทดสอบคลาสนี้)

`PeepholeFoldConstants` เป็นคลาส **package-private** ที่ extends `AbstractPeepholeOptimization` ซึ่ง source ของ superclass และของ `CompilerTestCase`/`Compiler`/`PeepholeOptimizationsPass` ไม่ได้ให้มาในโจทย์ แต่คลาสเหล่านี้เป็นส่วนหนึ่งของ **โปรเจกต์เดียวกัน (com.google.javascript.jscomp)** ที่ต้องถูก compile ไว้แล้วบน classpath ของเทส (ไม่ใช่ third-party jar จึงไม่อยู่ในรายการ jar ที่ให้มา) — นี่คือวิธีเดียวที่จะทดสอบคลาสนี้ได้จริงโดยไม่ต้อง mock internal state ของ `AbstractPeepholeOptimization` (ซึ่งไม่มี source ให้)

ผมได้ทำเครื่องหมาย `// ASSUMPTION:` ไว้ทุกจุดที่ต้องอนุมาน behavior ของโค้ดที่ไม่ได้ให้ source มา (เช่น `CompilerTestCase` API, หรือ format ของ `NodeUtil.numberNode`/`newUndefinedNode` สำหรับค่าพิเศษ) ตามข้อกำหนดที่ 4

```java
package com.google.javascript.jscomp;

import org.junit.Before;
import org.junit.Test;

/**
 * JUnit4-style tests for {@link PeepholeFoldConstants}.
 *
 * ASSUMPTION: PeepholeFoldConstantsTest ใช้ CompilerTestCase (อยู่ใน package เดียวกัน,
 * เป็น class ของโปรเจกต์ ไม่ใช่ jar 3rd-party) เป็น harness สำหรับ parse/print JS และรัน pass
 * เนื่องจาก source ของ CompilerTestCase ไม่ได้ถูกให้มา จึงอ้างอิง API ตามรูปแบบมาตรฐานที่ใช้
 * ทั่วทั้งโปรเจกต์ Closure Compiler (constructor รับ externs string, มี test()/testSame()
 * และ abstract getProcessor(Compiler)).
 *
 * ใช้ JUnit4 (@Test) ทับบน JUnit3-style TestCase (ผ่าน JUnit4 vintage runner ซึ่งรองรับ
 * TestCase subclass ได้ตามปกติ)
 */
public class PeepholeFoldConstantsTest extends CompilerTestCase {

  private boolean late = false;

  // ASSUMPTION: constructor ของ CompilerTestCase รับ externs string; ใช้ "" เพราะไม่ต้องพึ่ง externs
  public PeepholeFoldConstantsTest() {
    super("");
  }

  @Before
  @Override
  public void setUp() throws Exception {
    super.setUp();
    late = false;
  }

  @Override
  protected CompilerPass getProcessor(final Compiler compiler) {
    // ASSUMPTION: PeepholeOptimizationsPass(Compiler, AbstractPeepholeOptimization...)
    return new PeepholeOptimizationsPass(compiler, new PeepholeFoldConstants(late));
  }

  private void setLate(boolean value) {
    late = value;
  }

  private void fold(String js, String expected) {
    test(js, expected);
  }

  private void foldSame(String js) {
    testSame(js);
  }

  // ===================== typeof =====================

  @Test
  public void testFoldTypeofString() {
    fold("typeof(\"bar\")", "\"string\"");
  }

  @Test
  public void testFoldTypeofNumber() {
    fold("typeof(6)", "\"number\"");
  }

  @Test
  public void testFoldTypeofBooleanTrue() {
    fold("typeof(true)", "\"boolean\"");
  }

  @Test
  public void testFoldTypeofBooleanFalse() {
    fold("typeof(false)", "\"boolean\"");
  }

  @Test
  public void testFoldTypeofNull() {
    fold("typeof(null)", "\"object\"");
  }

  @Test
  public void testFoldTypeofArray() {
    fold("typeof([])", "\"object\"");
  }

  @Test
  public void testFoldTypeofObject() {
    fold("typeof({})", "\"object\"");
  }

  @Test
  public void testFoldTypeofFunction() {
    fold("typeof(function(){})", "\"function\"");
  }

  @Test
  public void testFoldTypeofVoid() {
    fold("typeof(void 0)", "\"undefined\"");
  }

  @Test
  public void testFoldTypeofUndefinedName() {
    fold("typeof(undefined)", "\"undefined\"");
  }

  @Test
  public void testFoldTypeofNonLiteral_unchanged() {
    // argumentNode ไม่ใช่ literal -> return originalTypeofNode
    foldSame("typeof(x)");
  }

  // ===================== NOT =====================

  @Test
  public void testFoldNotTrue() {
    fold("!true", "false");
  }

  @Test
  public void testFoldNotFalse() {
    fold("!false", "true");
  }

  @Test
  public void testFoldNotNonEmptyString() {
    fold("!\"a\"", "false");
  }

  @Test
  public void testFoldNotEmptyString() {
    fold("!\"\"", "true");
  }

  @Test
  public void testFoldNotUnknown_unchanged() {
    // leftVal == UNKNOWN -> return n
    foldSame("!x");
  }

  @Test
  public void testFoldNotZero_lateTrue_unchanged() {
    setLate(true);
    // late && left.isNumber() && numValue==0 -> ไม่ fold
    foldSame("!0");
  }

  @Test
  public void testFoldNotOne_lateTrue_unchanged() {
    setLate(true);
    foldSame("!1");
  }

  @Test
  public void testFoldNotZero_lateFalse() {
    setLate(false);
    fold("!0", "true");
  }

  // ===================== POS =====================

  @Test
  public void testFoldPosNumber() {
    fold("+1", "1");
  }

  @Test
  public void testFoldPosNonNumeric_unchanged() {
    // leftVal known (truthy string) แต่ isNumericResult(left) == false -> return n
    foldSame("+\"abc\"");
  }

  @Test
  public void testFoldPosUnknown_unchanged() {
    foldSame("+x");
  }

  // ===================== NEG =====================

  @Test
  public void testFoldNegInfinityName_unchanged() {
    // ASSUMPTION: NodeUtil.getPureBooleanValue("Infinity") != UNKNOWN (ให้ code path นี้ reachable)
    foldSame("-Infinity");
  }

  @Test
  public void testFoldNegNaN() {
    // ASSUMPTION: NodeUtil.getPureBooleanValue("NaN") != UNKNOWN
    fold("-NaN", "NaN");
  }

  @Test
  public void testFoldNegConvertedString() {
    // '5' ถูกแปลงเป็น NUMBER ก่อนด้วย tryReduceOperandsForOp แล้วค่อย negate
    fold("-('5')", "-5");
  }

  @Test
  public void testFoldNegNonNumber_error_unchanged() {
    // leftVal ไม่ UNKNOWN (TRUE) แต่ left.getDouble() throw -> error(NEGATING_A_NON_NUMBER_ERROR)
    foldSame("-true");
  }

  // ===================== BITNOT =====================

  @Test
  public void testFoldBitnotSmallInt() {
    fold("~5", "-6");
  }

  @Test
  public void testFoldBitnotFractional_error_unchanged() {
    foldSame("~5.5");
  }

  @Test
  public void testFoldBitnotOutOfRange_error_unchanged() {
    foldSame("~3000000000");
  }

  @Test
  public void testFoldBitnotNonNumber_error_unchanged() {
    foldSame("~true");
  }

  // ===================== VOID =====================

  @Test
  public void testVoidWithSideEffect_unchanged() {
    foldSame("void foo()");
  }

  @Test
  public void testVoidNonZeroNoSideEffect() {
    fold("void 1", "void 0");
  }

  @Test
  public void testVoidAlreadyZero_unchanged() {
    foldSame("void 0");
  }

  // ===================== AND / OR =====================

  @Test
  public void testFoldAndTrueLeft() {
    fold("true && x", "x");
  }

  @Test
  public void testFoldOrTrueLeft() {
    fold("true || x", "true");
  }

  @Test
  public void testFoldAndFalseLeft() {
    fold("false && x", "false");
  }

  @Test
  public void testFoldOrFalseLeft() {
    fold("false || x", "x");
  }

  @Test
  public void testFoldAndOrUnknownLeft_unchanged() {
    foldSame("foo() && x");
  }

  @Test
  public void testFoldAndOrKnownTrueWithSideEffect_unchanged() {
    // lval==TRUE, type AND, ไม่เข้าเงื่อนไข lval&&OR/!lval&&AND, else-if มี side effect -> ไม่ fold
    foldSame("[foo()] && x");
  }

  // ===================== SHIFT =====================

  @Test
  public void testFoldLsh() {
    fold("1 << 2", "4");
  }

  @Test
  public void testFoldRsh() {
    fold("8 >> 2", "2");
  }

  @Test
  public void testFoldUrsh() {
    fold("8 >>> 2", "2");
  }

  @Test
  public void testFoldShiftLeftOutOfRange_error_unchanged() {
    foldSame("3000000000 << 1");
  }

  @Test
  public void testFoldShiftAmountTooLarge_error_unchanged() {
    foldSame("1 << 32");
  }

  @Test
  public void testFoldShiftAmountNegative_error_unchanged() {
    foldSame("1 << -1");
  }

  @Test
  public void testFoldShiftFractionalLeft_error_unchanged() {
    foldSame("1.5 << 1");
  }

  @Test
  public void testFoldShiftFractionalRight_error_unchanged() {
    foldSame("1 << 1.5");
  }

  @Test
  public void testFoldShiftNonNumberOperand_unchanged() {
    foldSame("x << 1");
  }

  // ===================== ASSIGN (x = x + y -> x += y), late==true only =====================

  @Test
  public void testFoldAssignToAssignAdd_late() {
    setLate(true);
    fold("x = x + y", "x += y");
  }

  @Test
  public void testFoldAssignCommutative_late() {
    setLate(true);
    fold("x = y + x", "x += y");
  }

  @Test
  public void testFoldAssignWrongRightShape_unchanged_late() {
    setLate(true);
    // right (NEG) มีลูกเดียว -> first.getNext() != last -> ไม่ fold
    foldSame("x = -x");
  }

  @Test
  public void testFoldAssignSideEffectLeft_unchanged_late() {
    setLate(true);
    foldSame("a[f()] = a[f()] + 1");
  }

  @Test
  public void testFoldAssignNoMatchingOperand_unchanged_late() {
    setLate(true);
    foldSame("x = y + z");
  }

  @Test
  public void testFoldAssign_lateFalse_unchanged() {
    setLate(false);
    // !late -> return n ทันที
    foldSame("x = x + y");
  }

  // ===================== unfold assign-op (x += y -> x = x + y), late==false only ==========

  @Test
  public void testUnfoldAssignAdd_notLate() {
    setLate(false);
    fold("x += y", "x = x + y");
  }

  @Test
  public void testUnfoldAssign_lateTrue_unchanged() {
    setLate(true);
    foldSame("x += y");
  }

  @Test
  public void testUnfoldAssignSideEffectLeft_unchanged() {
    setLate(false);
    foldSame("a[f()] += y");
  }

  @Test
  public void testUnfoldAssignSub_plainName() {
    setLate(false);
    fold("x -= y", "x = x - y");
  }

  @Test
  public void testUnfoldAssignSub_unknownCall_stillUnfolds() {
    setLate(false);
    // tryConvertToNumber ไม่สามารถแปลง foo() ได้ (getNumberValue==null) แต่ unfold ยังเกิดขึ้น
    fold("x -= foo()", "x = x - foo()");
  }

  // ===================== tryConvertToNumber (ผ่าน ASSIGN_* operand reduction) =====================

  @Test
  public void testConvertOperandNameUndefinedThenUnfold() {
    setLate(false);
    fold("x -= undefined", "x = x - NaN");
  }

  @Test
  public void testConvertOperandStringThenUnfold() {
    setLate(false);
    fold("x |= '5'", "x = x | 5");
  }

  @Test
  public void testConvertOperandHookThenUnfold() {
    setLate(false);
    fold("x -= (a ? true : false)", "x = x - (a ? 1 : 0)");
  }

  @Test
  public void testConvertOperandCommaThenUnfold() {
    setLate(false);
    fold("x -= (a, true)", "x = x - (a, 1)");
  }

  @Test
  public void testConvertOperandAndThenUnfold() {
    setLate(false);
    fold("x -= (a && true)", "x = x - (a && 1)");
  }

  // ===================== ADD (string vs arithmetic) =====================

  @Test
  public void testFoldAddConstantStrings() {
    fold("\"a\" + \"b\"", "\"ab\"");
  }

  @Test
  public void testFoldAddStringNumber() {
    fold("\"a\" + 5", "\"a5\"");
  }

  @Test
  public void testFoldAddNumberString() {
    fold("5 + \"a\"", "\"5a\"");
  }

  @Test
  public void testFoldAddArithmetic() {
    fold("3 + 4", "7");
  }

  @Test
  public void testFoldAddChildAddString_leftAdd() {
    fold("(x + \"a\") + \"b\"", "x + \"ab\"");
  }

  @Test
  public void testFoldAddChildAddString_rightAdd() {
    fold("\"a\" + (\"b\" + x)", "\"ab\" + x");
  }

  @Test
  public void testFoldAddPlainNames_unchanged() {
    foldSame("x + y");
  }

  @Test
  public void testFoldAddOperandsToNumberThenFold() {
    // ADD reduce operand: mayBeString(true)/(false) == false สำหรับ boolean -> convert เป็น number
    fold("true + false", "1");
  }

  @Test
  public void testFoldAddOverflowToInfinity() {
    fold("1e300 * 1e300", "Infinity");
  }

  @Test
  public void testFoldMulByInfinityToNaN() {
    fold("0 * Infinity", "NaN");
  }

  // ===================== arithmetic (SUB/DIV/MOD) =====================

  @Test
  public void testFoldSub() {
    fold("7 - 4", "3");
  }

  @Test
  public void testFoldDiv() {
    fold("10 / 2", "5");
  }

  @Test
  public void testFoldDivByZero_unchanged() {
    foldSame("1 / 0");
  }

  @Test
  public void testFoldMod() {
    fold("5 % 2", "1");
  }

  @Test
  public void testFoldModByZero_unchanged() {
    foldSame("5 % 0");
  }

  @Test
  public void testFoldArithmeticResultTooLarge_unchanged() {
    // ผลลัพธ์เกิน MAX_FOLD_NUMBER และไม่ใช่ NaN/Infinity -> ไม่ fold
    foldSame("100000000000000 * 100000000000000");
  }

  // ===================== MUL/BITAND/BITOR/BITXOR + tryFoldLeftChildOp =====================

  @Test
  public void testFoldMulAssociative() {
    fold("(x * 2) * 3", "x * 6");
  }

  @Test
  public void testFoldBitandAssociative() {
    fold("(x & 1) & 2", "x & 0");
  }

  // ===================== comparisons =====================

  @Test
  public void testFoldEqNumbers() {
    fold("1 == 1", "true");
  }

  @Test
  public void testFoldNeNumbers() {
    fold("1 != 2", "true");
  }

  @Test
  public void testFoldLtNumbers() {
    fold("1 < 2", "true");
  }

  @Test
  public void testFoldGtNumbers() {
    fold("1 > 2", "false");
  }

  @Test
  public void testFoldSheqStringsTrue() {
    fold("\"a\" === \"a\"", "true");
  }

  @Test
  public void testFoldSheqStringsFalse() {
    fold("\"a\" === \"b\"", "false");
  }

  @Test
  public void testFoldEqDifferentTypes_unchanged() {
    foldSame("\"1\" == 1");
  }

  @Test
  public void testFoldLtNonLiteralLeft_unchanged() {
    foldSame("x < 5");
  }

  @Test
  public void testFoldNullEqUndefined() {
    fold("null == undefined", "true");
  }

  @Test
  public void testFoldNullSheqUndefined() {
    fold("null === undefined", "false");
  }

  @Test
  public void testFoldTrueEqFalse() {
    fold("true == false", "false");
  }

  @Test
  public void testFoldTrueSheqTrue() {
    fold("true === true", "true");
  }

  @Test
  public void testFoldThisEqThis() {
    fold("this == this", "true");
  }

  @Test
  public void testFoldThisNeThis() {
    fold("this != this", "false");
  }

  @Test
  public void testFoldThisLtThis_unchanged() {
    foldSame("this < this");
  }

  @Test
  public void testFoldSameNameLt() {
    fold("x < x", "false");
  }

  @Test
  public void testFoldSameNameEq_unchanged() {
    foldSame("x == x");
  }

  // ===================== instanceof =====================

  @Test
  public void testFoldInstanceofNumberLiteral() {
    fold("5 instanceof Object", "false");
  }

  @Test
  public void testFoldInstanceofStringLiteral() {
    fold("\"a\" instanceof String", "false");
  }

  @Test
  public void testFoldInstanceofObjectLiteralVsObject() {
    fold("({}) instanceof Object", "true");
  }

  @Test
  public void testFoldInstanceofNonLiteralLeft_unchanged() {
    foldSame("x instanceof Object");
  }

  @Test
  public void testFoldInstanceofSideEffectRight_unchanged() {
    foldSame("5 instanceof foo()");
  }

  // ===================== new String() folding =====================

  @Test
  public void testFoldNewStringInAdd() {
    fold("'' + new String('abc')", "\"abc\"");
  }

  @Test
  public void testFoldNewStringNoArgInGetElem() {
    fold("a[new String('eval')]", "a[\"eval\"]");
  }

  @Test
  public void testFoldNewOtherCtor_unchanged() {
    foldSame("\"\" + new Foo(\"abc\")");
  }

  @Test
  public void testFoldNewStringMutableArg_unchanged() {
    foldSame("\"\" + new String(x)");
  }

  @Test
  public void testFoldNewStringNotForcedContext_unchanged() {
    foldSame("var s = new String(\"abc\")");
  }

  // ===================== GETPROP .length =====================

  @Test
  public void testFoldArrayLength() {
    fold("[1,2,3].length", "3");
  }

  @Test
  public void testFoldStringLength() {
    fold("\"abc\".length", "3");
  }

  @Test
  public void testFoldArrayLengthSideEffect_unchanged() {
    foldSame("[foo()].length");
  }

  @Test
  public void testFoldGetPropNotLength_unchanged() {
    foldSame("[1,2,3].foo");
  }

  @Test
  public void testFoldGetPropOnNonArrayNonString_unchanged() {
    foldSame("x.length");
  }

  // ===================== object literal prop access =====================

  @Test
  public void testFoldObjectLitPropAccessGetProp() {
    fold("({a:1}).a", "1");
  }

  @Test
  public void testFoldObjectLitPropAccessGetElem() {
    fold("({a:1})['a']", "1");
  }

  @Test
  public void testFoldObjectLitPropAccessMissing_unchanged() {
    foldSame("({a:1}).b");
  }

  @Test
  public void testFoldObjectLitAssignmentTarget_unchanged() {
    foldSame("({a:1}).a = 2");
  }

  @Test
  public void testFoldObjectLitOtherPropSideEffect_unchanged() {
    foldSame("({a:foo(), b:1}).b");
  }

  // ===================== array literal element access =====================

  @Test
  public void testFoldArrayAccessBasic() {
    fold("[1,2,3][1]", "2");
  }

  @Test
  public void testFoldArrayAccessOutOfBounds_error_unchanged() {
    foldSame("[1,2,3][5]");
  }

  @Test
  public void testFoldArrayAccessNegativeIndex_error_unchanged() {
    foldSame("[1,2,3][-1]");
  }

  @Test
  public void testFoldArrayAccessNonIntegerIndex_error_unchanged() {
    foldSame("[1,2,3][1.5]");
  }

  @Test
  public void testFoldArrayAccessNonNumberIndex_unchanged() {
    foldSame("[1,2,3][x]");
  }

  @Test
  public void testFoldArrayAccessAssignmentTarget_unchanged() {
    foldSame("[1,2,3][0] = 5");
  }

  @Test
  public void testFoldArrayAccessEmptySlot() {
    // ASSUMPTION: NodeUtil.newUndefinedNode(...) พิมพ์ผลเป็น "void 0"
    fold("[1,,3][1]", "void 0");
  }
}
```

## สรุปตาราง Test Method กับ Branch/Condition ที่ครอบคลุม

| กลุ่มเมธอด | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testFoldTypeof*` | `tryFoldTypeof`: ทุก case ของ switch (FUNCTION/STRING/NUMBER/TRUE-FALSE/NULL/ARRAYLIT/OBJECTLIT/VOID/NAME"undefined"), และ path `argumentNode==null \|\| !isLiteralValue` |
| `testFoldNot*` | `tryFoldUnaryOperator` NOT: leftVal UNKNOWN, late+0/1 skip, late=false fold, true/false/string |
| `testFoldPos*` | POS: `isNumericResult` true/false, leftVal UNKNOWN early-return |
| `testFoldNeg*` | NEG: "Infinity" name guard, "NaN"→NaN, ปกติ negate, catch(UnsupportedOperationException)→error |
| `testFoldBitnot*` | BITNOT: ปกติ, fractional error, out-of-range error, non-number catch error |
| `testVoid*` | `tryReduceVoid`: side-effect skip, child!=0 replace, child==0 no-op |
| `testFoldAndOr*` / `testFoldOrTrueLeft` etc. | `tryFoldAndOr`: lval&&OR, !lval&&AND, else-if no-side-effect, UNKNOWN, side-effect block |
| `testFoldLsh/Rsh/Ursh`, `testFoldShift*Error/unchanged` | `tryFoldShift`: ทุก error branch (range, amount, fractional) และ non-number left |
| `testFoldAssign*_late` | `tryFoldAssign`: !late early-return, right-shape mismatch, side-effect left, commutative match, no-match |
| `testUnfoldAssign*` | `tryUnfoldAssignOp`: late early-return, side-effect left, ปกติ unfold |
| `testConvertOperand*` | `tryConvertToNumber`: NAME-undefined, HOOK, COMMA/AND, STRING→NUMBER via default path |
| `testFoldAdd*` | `tryFoldAdd`/`tryFoldChildAddString`/`tryFoldAddConstantString`: string ctx ทั้งสองทาง, arithmetic ADD, operand-reduce for ADD |
| `testFoldSub/Div/Mod*`, `testFoldArithmeticResultTooLarge` | `performArithmeticOp`: ปกติ, div/mod by zero (null), length/overflow check |
| `testFoldMulAssociative`, `testFoldBitandAssociative` | `tryFoldLeftChildOp` (ผ่าน MUL/BITAND path) |
| `testFold*comparison*` | `tryFoldComparison`: VOID/NULL/TRUE-FALSE/THIS/STRING/NUMBER/NAME cases, isEqualityOp, compareToNull/Undefined |
| `testFoldInstanceof*` | `tryFoldInstanceof`: literal immutable→false, Object name→true, non-literal/side-effect unchanged |
| `testFoldNewString*` | `tryFoldCtorCall`/`tryFoldInForcedStringContext`: ADD ctx, GETELEM ctx, wrong ctor, mutable arg, non-forced ctx |
| `testFoldArrayLength/StringLength*`, `testFoldGetProp*` | `tryFoldGetProp`: length ของ array/string, side-effect, non-length, non-array/string |
| `testFoldObjectLit*` | `tryFoldObjectPropAccess`: match ผ่าน GETPROP/GETELEM, ไม่พบ key, assignment-target guard, side-effect ของ property อื่น |
| `testFoldArrayAccess*` | `tryFoldArrayAccess`: index ปกติ, out-of-range, negative, fractional, non-number index, assignment target, elided (empty) element |

**คำเตือน:** เคสบางส่วน (เช่น GETTER_DEF ใน object literal, การเปรียบเทียบชนิด NEG ใน `tryFoldComparison`, และรายละเอียด mayBeString สำหรับ NAME ที่คลุมเครือ) ถูกงดไว้เพราะต้องอาศัยความเข้าใจ internal ของ `NodeUtil`/output-printer ที่ไม่ได้ให้ source มา ตามข้อกำหนดห้ามเดา behavior