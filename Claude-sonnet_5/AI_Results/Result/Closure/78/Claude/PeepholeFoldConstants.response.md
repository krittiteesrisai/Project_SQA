# หมายเหตุสำคัญก่อนเริ่ม (ตามข้อกำหนด #4)

`PeepholeFoldConstants` เป็นคลาสที่ทำงานบนโครงสร้าง AST (`Node`/`Token`) ของ Closure Compiler การเรียก `optimizeSubtree()` ตรง ๆ ต้องมี `Compiler`/`AbstractCompiler` context ที่ initialize ถูกต้อง (สำหรับ `reportCodeChange()`, `mayHaveSideEffects()`, `error()`) การ mock เองมีความเสี่ยงสูงที่จะ hallucinate behavior จึงเลือกใช้ **`CompilerTestCase`** ซึ่งเป็น test harness มาตรฐานที่อยู่ใน source เดียวกันของโปรเจกต์ Closure Compiler (ไม่ใช่ external jar) และเป็นวิธีที่ทีม Closure ใช้ทดสอบ peephole pass ทุกตัวจริง ๆ — จุดที่ไม่แน่ใจ 100% เกี่ยวกับ API/behavior จะระบุเป็นคอมเมนต์ `// สมมติ:` ไว้ในโค้ด

จุดที่ "ข้ามการทดสอบ" เพราะไม่มีข้อมูลยืนยันแน่ชัดในซอร์ส:
- Divide-by-zero (`%`/`/` ด้วย 0) เพราะ `DiagnosticType` ถูกสร้างแบบ inline ทุกครั้งที่เรียก ไม่มี static field ให้ reference เพื่อเทียบ ทำให้ไม่แน่ใจว่า `test(..., error)` จะ match ได้หรือไม่
- กรณี `VOID`/`void 0` ในการเปรียบเทียบ/typeof เพราะไม่แน่ใจว่า `NodeUtil.isLiteralValue` ปฏิบัติกับ `VOID` node อย่างไร (ไม่มีซอร์สของ `NodeUtil` ให้ตรวจสอบ)

```java
package com.google.javascript.jscomp;

/**
 * Unit tests สำหรับ {@link PeepholeFoldConstants}.
 *
 * ใช้ {@link CompilerTestCase} ซึ่งเป็น test harness ที่อยู่ใน source เดียวกัน
 * ของโปรเจกต์ Closure Compiler (ไม่ใช่ external library ใน classpath ที่ระบุ)
 * เพื่อ parse/compare โครงสร้าง AST ของ JavaScript source string
 *
 * สมมติ: CompilerTestCase มี constructor รับ externs string, มี method
 * test(js, expected), testSame(js), test(js, expected, DiagnosticType),
 * enableLineNumberCheck(boolean), getNumRepetitions(), และ
 * getProcessor(Compiler) ตาม pattern มาตรฐานของ Closure Compiler test suite
 */
public class PeepholeFoldConstantsTest extends CompilerTestCase {

  public PeepholeFoldConstantsTest() {
    super("");
  }

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    // ปิดการเช็ค line number เนื่องจากสนใจเฉพาะค่า/โครงสร้างที่ fold ได้
    enableLineNumberCheck(false);
  }

  @Override
  protected int getNumRepetitions() {
    // บาง fold ไม่ idempotent อย่างสมบูรณ์ (เช่นรูปแบบ literal ที่เปลี่ยนไป)
    // รันครั้งเดียวเพื่อไม่ให้ผลทดสอบเพี้ยนจากพฤติกรรมที่ไม่เกี่ยวกับ bug ที่สนใจ
    return 1;
  }

  @Override
  protected CompilerPass getProcessor(final Compiler compiler) {
    return new PeepholeOptimizationsPass(compiler, new PeepholeFoldConstants());
  }

  // ================= typeof =================

  public void testTypeofString() {
    test("a = typeof('bar');", "a = \"string\";");
  }

  public void testTypeofNumber() {
    test("a = typeof(6);", "a = \"number\";");
  }

  public void testTypeofBooleanTrue() {
    test("a = typeof(true);", "a = \"boolean\";");
  }

  public void testTypeofBooleanFalse() {
    test("a = typeof(false);", "a = \"boolean\";");
  }

  public void testTypeofNull() {
    test("a = typeof(null);", "a = \"object\";");
  }

  public void testTypeofArray() {
    test("a = typeof([]);", "a = \"object\";");
  }

  public void testTypeofObject() {
    test("a = typeof({});", "a = \"object\";");
  }

  public void testTypeofFunction() {
    test("a = typeof(function() {});", "a = \"function\";");
  }

  public void testTypeofUndefinedName() {
    test("a = typeof(undefined);", "a = \"undefined\";");
  }

  public void testTypeofNonLiteralNotFolded() {
    // x ไม่ใช่ literal value -> ไม่ควร fold (argumentNode == null || !isLiteralValue)
    testSame("a = typeof(x);");
  }

  // ================= NOT (!) =================

  public void testFoldNotTrue() {
    test("a = !true;", "a = false;");
  }

  public void testFoldNotFalse() {
    test("a = !false;", "a = true;");
  }

  public void testFoldNotEmptyString() {
    test("a = !'';", "a = true;");
  }

  public void testFoldNotNonEmptyString() {
    test("a = !'abc';", "a = false;");
  }

  public void testFoldNotZeroNotChanged() {
    // กรณีพิเศษ: ห้าม fold !0 -> false
    testSame("a = !0;");
  }

  public void testFoldNotOneNotChanged() {
    // กรณีพิเศษ: ห้าม fold !1 -> true
    testSame("a = !1;");
  }

  // ================= POS (+) =================

  public void testFoldPosNumber() {
    // สมมติ: NodeUtil.isNumericResult(NUMBER) == true
    test("a = +5;", "a = 5;");
  }

  public void testFoldPosComposedNumber() {
    // บังคับให้เกิด POS(NUMBER) แน่ ๆ หลัง inner ADD ถูก fold ก่อน (bottom-up)
    test("a = +(1 + 1);", "a = 2;");
  }

  // ================= NEG (-) =================

  public void testFoldNegInfinityNotChanged() {
    testSame("a = -Infinity;");
  }

  public void testFoldNegNaN() {
    test("a = -NaN;", "a = NaN;");
  }

  public void testFoldNegNumberNotChanged() {
    // ค่าเดิม -5 หลัง fold ยังเป็น -5 (ทดสอบว่าไม่ throw/พัง)
    testSame("a = -5;");
  }

  public void testFoldNegComposedNumber() {
    // บังคับให้เกิด NEG(NUMBER) จาก inner ADD ที่ fold ก่อนแล้ว
    test("a = -(1 + 1);", "a = -2;");
  }

  public void testFoldNegNonNumberError() {
    // left เป็น STRING literal -> getDouble() throw -> NEGATING_A_NON_NUMBER_ERROR
    test("a = -'abc';", "a = -'abc';",
        PeepholeFoldConstants.NEGATING_A_NON_NUMBER_ERROR);
  }

  // ================= BITNOT (~) =================

  public void testFoldBitNotBasic() {
    test("a = ~5;", "a = -6;");
  }

  public void testFoldBitNotZero() {
    test("a = ~0;", "a = -1;");
  }

  public void testFoldBitNotMaxInt() {
    // boundary: Integer.MAX_VALUE
    test("a = ~2147483647;", "a = -2147483648;");
  }

  public void testFoldBitNotOutOfRange() {
    // boundary: เกิน Integer.MAX_VALUE
    test("a = ~4294967296;", "a = ~4294967296;",
        PeepholeFoldConstants.BITWISE_OPERAND_OUT_OF_RANGE);
  }

  public void testFoldBitNotFractional() {
    test("a = ~1.5;", "a = ~1.5;",
        PeepholeFoldConstants.FRACTIONAL_BITWISE_OPERAND);
  }

  public void testFoldBitNotNonNumberError() {
    test("a = ~'abc';", "a = ~'abc';",
        PeepholeFoldConstants.NEGATING_A_NON_NUMBER_ERROR);
  }

  // ================= instanceof =================

  public void testFoldInstanceOfImmutableLeft() {
    // left เป็น immutable literal -> ผลลัพธ์ false เสมอ
    test("a = 'str' instanceof Object;", "a = false;");
  }

  public void testFoldInstanceOfObjectLiteral() {
    test("a = ({}) instanceof Object;", "a = true;");
  }

  public void testFoldInstanceOfNonObjectRightNotChanged() {
    testSame("a = ({}) instanceof Foo;");
  }

  // ================= ASSIGN -> compound assign =================

  public void testFoldAssignAddRight() {
    test("x = x + 1;", "x += 1;");
  }

  public void testFoldAssignAddCommutative() {
    test("x = 1 + x;", "x += 1;");
  }

  public void testFoldAssignNotTwoChildren() {
    // สมมติ: NodeUtil.mayBeString(x) == true (ค่า default แบบ conservative)
    testSame("x = x + 1 + 2;");
  }

  public void testFoldAssignDifferentNameNotChanged() {
    testSame("x = y + 1;");
  }

  public void testFoldAssignLeftHasSideEffectsNotChanged() {
    testSame("getX().a = getX().a + 1;");
  }

  // ================= AND / OR =================

  public void testFoldAndTrueLeft() {
    test("a = true && x();", "a = x();");
  }

  public void testFoldAndFalseLeft() {
    test("a = false && x();", "a = false;");
  }

  public void testFoldOrTrueLeft() {
    test("a = true || x();", "a = true;");
  }

  public void testFoldOrFalseLeft() {
    test("a = false || x();", "a = x();");
  }

  public void testFoldOrTruthyNumberLeft() {
    test("a = 3 || x();", "a = 3;");
  }

  public void testFoldAndUnknownLeftNotChanged() {
    testSame("a = x && y;");
  }

  // ================= Shift =================

  public void testFoldShiftLeft() {
    test("a = 1 << 2;", "a = 4;");
  }

  public void testFoldShiftRight() {
    test("a = 8 >> 1;", "a = 4;");
  }

  public void testFoldUnsignedShiftRight() {
    test("a = -1 >>> 0;", "a = 4294967295;");
  }

  public void testFoldShiftLeftOutOfRange() {
    test("a = 4294967296 << 1;", "a = 4294967296 << 1;",
        PeepholeFoldConstants.BITWISE_OPERAND_OUT_OF_RANGE);
  }

  public void testFoldShiftAmountTooLarge() {
    // boundary: 32 คือขอบเขตบน (ต้อง < 32)
    test("a = 1 << 32;", "a = 1 << 32;",
        PeepholeFoldConstants.SHIFT_AMOUNT_OUT_OF_BOUNDS);
  }

  public void testFoldShiftAmountNegative() {
    test("a = 1 << -1;", "a = 1 << -1;",
        PeepholeFoldConstants.SHIFT_AMOUNT_OUT_OF_BOUNDS);
  }

  public void testFoldShiftFractionalLeft() {
    test("a = 1.5 << 1;", "a = 1.5 << 1;",
        PeepholeFoldConstants.FRACTIONAL_BITWISE_OPERAND);
  }

  public void testFoldShiftFractionalRight() {
    test("a = 1 << 1.5;", "a = 1 << 1.5;",
        PeepholeFoldConstants.FRACTIONAL_BITWISE_OPERAND);
  }

  public void testFoldShiftNonNumberNotChanged() {
    testSame("a = x << 1;");
  }

  // ================= Arithmetic (add/sub/mul/div/mod) =================

  public void testFoldAddNumbers() {
    test("a = 3 + 4;", "a = 7;");
  }

  public void testFoldAddStrings() {
    test("a = 'a' + 'b';", "a = \"ab\";");
  }

  public void testFoldAddStringAndNumber() {
    test("a = 'a' + 1;", "a = \"a1\";");
  }

  public void testFoldChildAddString() {
    // ตามตัวอย่างใน docstring ของ tryFoldChildAddString
    test("a = foo() + 'a' + 'b';", "a = foo() + \"ab\";");
  }

  public void testFoldSub() {
    test("a = 10 - 3;", "a = 7;");
  }

  public void testFoldMul() {
    test("a = 3 * 4;", "a = 12;");
  }

  public void testFoldDiv() {
    test("a = 10 / 2;", "a = 5;");
  }

  public void testFoldMod() {
    test("a = 10 % 3;", "a = 1;");
  }

  public void testFoldLeftChildMul() {
    // ตามตัวอย่างใน docstring ของ tryFoldLeftChildOp
    test("a = foo() * 10 * 20;", "a = foo() * 200;");
  }

  public void testFoldLeftChildBitAnd() {
    test("a = foo() & 5 & 3;", "a = foo() & 1;");
  }

  // ================= Comparison =================

  public void testFoldLessThanTrue() {
    test("a = 1 < 2;", "a = true;");
  }

  public void testFoldLessThanFalse() {
    test("a = 2 < 1;", "a = false;");
  }

  public void testFoldEqualNumbers() {
    test("a = 1 == 1;", "a = true;");
  }

  public void testFoldNotEqualNumbers() {
    test("a = 1 != 2;", "a = true;");
  }

  public void testFoldStrictEqualBooleans() {
    test("a = true === true;", "a = true;");
  }

  public void testFoldEqualStringsTrue() {
    test("a = 'abc' == 'abc';", "a = true;");
  }

  public void testFoldEqualStringsFalse() {
    test("a = 'abc' == 'def';", "a = false;");
  }

  public void testFoldNullEqualsUndefined() {
    test("a = (null == undefined);", "a = true;");
  }

  public void testFoldNullStrictNotEqualsUndefined() {
    test("a = (null === undefined);", "a = false;");
  }

  public void testFoldSameNameLessThanFalse() {
    test("a = (x < x);", "a = false;");
  }

  public void testFoldDifferentNameNotChanged() {
    testSame("a = (x < y);");
  }

  public void testFoldThisEqualsThis() {
    test("a = (this == this);", "a = true;");
  }

  public void testFoldThisLessThanNotChanged() {
    testSame("a = (this < this);");
  }

  // ================= GETELEM (array indexing) =================

  public void testFoldGetElemBasic() {
    test("a = [1, 2, 3][1];", "a = 2;");
  }

  public void testFoldGetElemOutOfBounds() {
    test("a = [1, 2, 3][10];", "a = [1, 2, 3][10];",
        PeepholeFoldConstants.INDEX_OUT_OF_BOUNDS_ERROR);
  }

  public void testFoldGetElemNegativeIndex() {
    // boundary: index < 0
    test("a = [1, 2, 3][-1];", "a = [1, 2, 3][-1];",
        PeepholeFoldConstants.INDEX_OUT_OF_BOUNDS_ERROR);
  }

  public void testFoldGetElemFractionalIndex() {
    // อินพุตผิดรูปแบบ: index ไม่ใช่จำนวนเต็ม
    test("a = [1, 2, 3][1.5];", "a = [1, 2, 3][1.5];",
        PeepholeFoldConstants.INVALID_GETELEM_INDEX_ERROR);
  }

  public void testFoldGetElemNonNumberIndexNotChanged() {
    testSame("a = [1, 2, 3]['x'];");
  }

  // ================= GETPROP (.length) =================

  public void testFoldArrayLength() {
    test("a = [1, 2, 3].length;", "a = 3;");
  }

  public void testFoldEmptyArrayLength() {
    // boundary: array ว่าง
    test("a = [].length;", "a = 0;");
  }

  public void testFoldStringLength() {
    test("a = 'abc'.length;", "a = 3;");
  }

  public void testFoldLengthNonFoldableNotChanged() {
    testSame("a = x.length;");
  }

  public void testFoldArrayLengthWithSideEffectNotChanged() {
    testSame("a = [foo()].length;");
  }

  // ================= Known string methods =================

  public void testFoldStringIndexOf() {
    test("a = 'abc'.indexOf('b');", "a = 1;");
  }

  public void testFoldStringLastIndexOf() {
    test("a = 'abcabc'.lastIndexOf('b');", "a = 4;");
  }

  public void testFoldStringToLowerCase() {
    test("a = 'ABC'.toLowerCase();", "a = \"abc\";");
  }

  public void testFoldStringToUpperCase() {
    test("a = 'abc'.toUpperCase();", "a = \"ABC\";");
  }

  public void testFoldStringToUpperCaseEmpty() {
    // boundary: string ว่าง
    test("a = ''.toUpperCase();", "a = \"\";");
  }

  public void testFoldStringSubstr() {
    test("a = 'abcdef'.substr(1, 3);", "a = \"bcd\";");
  }

  public void testFoldStringSubstring() {
    test("a = 'abcdef'.substring(1, 3);", "a = \"bc\";");
  }

  public void testFoldStringSubstrOutOfRangeNotChanged() {
    testSame("a = 'abcdef'.substr(10, 3);");
  }

  public void testFoldStringSubstringNegativeNotChanged() {
    testSame("a = 'abcdef'.substring(-1, 3);");
  }

  public void testFoldStringSubstrExtraArgNotChanged() {
    // อินพุตผิดรูปแบบ: มี argument เกินที่รองรับ
    testSame("a = 'abcdef'.substr(1, 3, 5);");
  }

  public void testFoldStringIndexOfExtraArgNotChanged() {
    // อินพุตผิดรูปแบบ: มี argument ที่ 3 เกินมา
    testSame("a = 'abcdef'.indexOf('c', 1, 2);");
  }

  // ================= Array join =================

  public void testFoldArrayJoin() {
    test("a = ['a', 'b', 'c'].join('-');", "a = \"a-b-c\";");
  }

  public void testFoldArrayJoinEmpty() {
    // boundary: array ว่าง -> string ว่าง
    test("a = [].join(',');", "a = \"\";");
  }

  public void testFoldArrayJoinSingle() {
    test("a = ['a'].join(',');", "a = \"a\";");
  }

  // ================= new String() ในบริบทที่ถูกบังคับเป็น string =================

  public void testFoldNewStringInGetElemContext() {
    test("a = this[new String('eval')];", "a = this[\"eval\"];");
  }

  public void testFoldNewStringNoArgs() {
    // boundary: ไม่มี argument -> string ว่าง
    test("a = this[new String()];", "a = this[\"\"];");
  }

  public void testNewStringNotInForcedContextNotChanged() {
    // ไม่ได้อยู่ใน GETELEM context -> inForcedStringContext() == false
    testSame("a = new String('eval');");
  }
}
```

# สรุปตาราง Branch/Condition ที่ครอบคลุม

| กลุ่มเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testTypeof*` | `optimizeSubtree` case `TYPEOF`; ทุก case ของ switch ใน `tryFoldTypeof` (FUNCTION/STRING/NUMBER/TRUE/FALSE/NULL/OBJECTLIT/ARRAYLIT/NAME "undefined"); กรณี `argumentNode==null||!isLiteralValue` |
| `testFoldNot*` | `tryFoldUnaryOperator` case `NOT`; branch พิเศษ `numValue==0||1`; `leftVal` true/false |
| `testFoldPos*` | case `POS`; `NodeUtil.isNumericResult` true path |
| `testFoldNeg*` | case `NEG`; branch `Infinity` (ไม่ fold), `NaN`, ปกติ, `catch(UnsupportedOperationException)` → `NEGATING_A_NON_NUMBER_ERROR` |
| `testFoldBitNot*` | case `BITNOT`; ปกติ, boundary `MAX_VALUE`, out-of-range, fractional, non-number(catch) |
| `testFoldInstanceOf*` | `tryFoldInstanceof`; `isImmutableValue` true/false, right เป็น/ไม่เป็น `"Object"` |
| `testFoldAssign*` | `tryFoldAssign`; RHS ไม่มี 2 children, `mayHaveSideEffects(left)`, equal left-first / commutative-equal-last, ชื่อไม่ตรง |
| `testFoldAnd*/Or*` | `tryFoldAndOr`; `leftVal` true/false × type AND/OR ทุก combination, UNKNOWN |
| `testFoldShift*` | `tryFoldShift`; ปกติ (LSH/RSH/URSH), out-of-range left, shift amount OOB (บน/ลบ), fractional left/right, non-number |
| `testFoldAdd*/Sub/Mul/Div/Mod` | `tryFoldAdd`, `tryFoldAddConstantString`, `tryFoldChildAddString`, `tryFoldArithmeticOp` (SUB/MUL/DIV/MOD), `tryFoldLeftChildOp` |
| `testFoldLessThan*/Equal*/Strict*/Null*/Same/DifferentName/This*` | `tryFoldComparison`; case VOID/NULL-TRUE-FALSE/THIS/STRING/NUMBER/NAME; op EQ/NE/SHEQ/SHNE/LT/GT |
| `testFoldGetElem*` | `tryFoldGetElem`; right ไม่ใช่ NUMBER, fractional index, negative index, out-of-bounds, ปกติ |
| `testFoldArrayLength*/StringLength*/Length*` | `tryFoldGetProp`; ARRAYLIT/STRING/side-effect/ไม่ foldable, boundary length=0 |
| `testFoldString*` | `tryFoldKnownStringMethods`, `tryFoldStringIndexOf`, `tryFoldStringSubstr`, `tryFoldStringSubstring`, `tryFoldStringToLowerCase/UpperCase`; อาร์กิวเมนต์เกิน, out-of-range |
| `testFoldArrayJoin*` | `tryFoldArrayJoin`; empty(size 0), single element, multiple elements |
| `testFoldNewString*` | `tryFoldCtorCall`, `inForcedStringContext`, `tryFoldInForcedStringContext`; มี/ไม่มี argument, ไม่ได้อยู่ใน GETELEM context |

**ข้อจำกัดที่ระบุไว้:** ไม่ได้ทดสอบ divide-by-zero (`DIVIDE_BY_0_ERROR`) และกรณี `VOID`/`void 0` เนื่องจากไม่มีหลักฐานพอในซอร์สโค้ดที่ให้มาว่า `DiagnosticType`/`NodeUtil.isLiteralValue` จะ match/behave อย่างไรแน่ชัด (ตามข้อกำหนด #4)