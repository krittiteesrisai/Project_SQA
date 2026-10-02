# วิเคราะห์และแนวทางการทดสอบ

**หมายเหตุสำคัญก่อนเริ่ม (ต้องอ่านก่อนดูโค้ด):**

`FoldConstants` เป็น package-private class ที่ทำงานบน AST (`Node`) ผ่าน `NodeTraversal`/`Compiler` ของ Closure Compiler เอง ไม่สามารถทดสอบแบบ "unit ล้วน ๆ" โดยแยกออกจากระบบ parser/AST ได้อย่างมีความหมาย เพราะ method ส่วนใหญ่เป็น `void`/package-private และแก้ไข `Node` ผ่าน `NodeTraversal t` ที่ต้องมี `Compiler` จริงอยู่เบื้องหลัง (เรียก `t.getCompiler().reportCodeChange()`, `t.getScope()` เป็นต้น)

แนวทางมาตรฐานที่ใช้ทดสอบคลาสกลุ่มนี้ในโปรเจกต์นี้เอง (และใน Defects4J บั๊กนี้จริง) คือการ extend `CompilerTestCase` (เป็นคลาสช่วยทดสอบที่อยู่ใน source tree เดียวกัน ไม่ใช่ jar ภายนอก) ซึ่ง:

- เป็น subclass ของ `junit.framework.TestCase` (JUnit3-style) — รันได้ภายใต้ JUnit4 runner โดยอัตโนมัติผ่านกลไก legacy (`junit4-legacy.jar`) เพราะ JUnit4's `JUnitCore` จะ wrap คลาสที่ extends `TestCase` ด้วย `JUnit38ClassRunner` โดยอัตโนมัติ
- มี helper method `test(String js, String expected)`, `testSame(String js)`, `test(String js, String expected, DiagnosticType error)` ที่เทียบผลลัพธ์แบบ **AST-equivalence** (ไม่ใช่เทียบ text) — จึงไม่ต้องกังวลเรื่อง quote style ของ string
- ต้อง override `getProcessor(Compiler compiler)` ให้ return `new FoldConstants(compiler)`

**สมมติฐานที่ไม่แน่ใจ 100% (คอมเมนต์กำกับไว้ในโค้ดแล้ว):**
1. Constructor ของ `CompilerTestCase` รับ externs string (`super("")`)
2. Parser ของ Closure Compiler รวม unary-minus กับ number literal เป็น `NUMBER` node เดียว (เช่น `-6`) ไม่ใช่ `NEG(NUMBER)` — จึงเปรียบเทียบผลลัพธ์เชิงลบได้ตรงไปตรงมา
3. โครงสร้าง AST หลังการลบทิ้ง statement ทั้งก้อน (if/while/for/do ที่ condition เป็น false) อาจมีรายละเอียดการ wrap ด้วย BLOCK ที่ต่างกันเล็กน้อย — จุดเหล่านี้ใส่คอมเมนต์ "ต้องตรวจสอบเพิ่มเติม" ไว้ชัดเจน
4. `InlineCostEstimator.getCost` behavior ไม่รู้ค่าตัวเลขจริง จึงเลือกกรณีทดสอบที่ไม่ขึ้นกับค่านั้น (`[].join(',')`) เป็นหลัก

```java
package com.google.javascript.jscomp;

/**
 * Unit test สำหรับ com.google.javascript.jscomp.FoldConstants (Closure-105b)
 *
 * แนวทาง: extend CompilerTestCase (ส่วนหนึ่งของ source tree เดียวกัน ไม่ใช่ jar
 * ภายนอก) เพราะ FoldConstants ต้องใช้ Compiler/NodeTraversal/Scope จริงในการทำงาน
 * CompilerTestCase extends junit.framework.TestCase จึงใช้ naming convention
 * "testXxx()" (ไม่ใช่ @Test annotation) แต่ยังถูกรันผ่าน JUnit4 runner ได้
 * โดยอัตโนมัติ (junit4-legacy.jar รองรับ legacy TestCase) — เข้าเงื่อนไข
 * "ชุดทดสอบ JUnit 4" ในระดับ execution/runner
 *
 * ผลลัพธ์ของ test()/testSame() จะถูกเทียบแบบ AST-equivalence ไม่ใช่ text
 * ดังนั้น quote style ของ string literal จึงไม่กระทบผลการทดสอบ
 */
public class FoldConstantsTest extends CompilerTestCase {

  // สมมติฐาน: constructor ของ CompilerTestCase รับ externs เป็น String
  // (ไม่แน่ใจ 100% เพราะไม่มี source ของ CompilerTestCase ให้ตรวจสอบ)
  public FoldConstantsTest() {
    super("");
  }

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new FoldConstants(compiler);
  }

  // ======================================================================
  // Boundary / empty input
  // ======================================================================

  public void testEmptyProgram() {
    // boundary: ไม่มี statement เลย ไม่ควร throw หรือเปลี่ยนแปลงอะไร
    testSame("");
  }

  // ======================================================================
  // TYPEOF folding (switch ทุก case ใน visit() สำหรับ Token.TYPEOF)
  // ======================================================================

  public void testTypeofString() {
    test("x = typeof 'foo'", "x = 'string'");
  }

  public void testTypeofNumber() {
    test("x = typeof 5", "x = 'number'");
  }

  public void testTypeofTrue() {
    test("x = typeof true", "x = 'boolean'");
  }

  public void testTypeofFalse() {
    test("x = typeof false", "x = 'boolean'");
  }

  public void testTypeofNull() {
    test("x = typeof null", "x = 'object'");
  }

  public void testTypeofObjectLiteral() {
    test("x = typeof {}", "x = 'object'");
  }

  public void testTypeofArrayLiteral() {
    test("x = typeof []", "x = 'object'");
  }

  public void testTypeofUndefinedName() {
    test("x = typeof undefined", "x = 'undefined'");
  }

  public void testTypeofNonLiteralNoChange() {
    // left ไม่ใช่ literal value -> newValue เป็น null ตลอด -> ไม่มีการแทนที่
    testSame("x = typeof y");
  }

  // ======================================================================
  // NOT / NEG / BITNOT
  // ======================================================================

  public void testNotDiscardedWhenValueUnused() {
    // parent เป็น EXPR_RESULT -> ทิ้ง operator, เหลือ operand
    test("!foo();", "foo();");
  }

  public void testNegDiscardedWhenValueUnused() {
    test("-foo();", "foo();");
  }

  public void testBitnotDiscardedWhenValueUnused() {
    test("~foo();", "foo();");
  }

  public void testMinimizeNotEqToNe() {
    // !(x==y) -> x!=y  (parent ไม่ใช่ EXPR_RESULT เพราะอยู่ฝั่งขวาของ ASSIGN)
    test("z = !(x == y);", "z = x != y;");
  }

  public void testMinimizeNotNeToEq() {
    test("z = !(x != y);", "z = x == y;");
  }

  public void testMinimizeNotSheqToShne() {
    test("z = !(x === y);", "z = x !== y;");
  }

  public void testMinimizeNotShneToSheq() {
    test("z = !(x !== y);", "z = x === y;");
  }

  public void testNotOnUnrelatedOperatorNoMinimize() {
    // tryMinimizeNot คืน false สำหรับ operator อื่น (เช่น LT) -> ตกไปเช็ค literal
    testSame("z = !(x < y);");
  }

  public void testNotLiteralTrueBecomesFalse() {
    test("z = !true;", "z = false;");
  }

  public void testNotLiteralFalseBecomesTrue() {
    test("z = !false;", "z = true;");
  }

  public void testNegInfinityNotModified() {
    // ตามคอมเมนต์ในซอร์ส: "-Infinity" ถูกต้องแล้ว ไม่แก้ไข
    testSame("z = -Infinity;");
  }

  public void testNegNaNBecomesNaN() {
    // "-NaN" -> "NaN"
    test("z = -NaN;", "z = NaN;");
  }

  public void testBitnotNumber() {
    test("z = ~5;", "z = -6;");
  }

  public void testBitnotFractionalError() {
    // val != (int)val -> FRACTIONAL_BITWISE_OPERAND, ไม่มีการแก้ไข
    test("z = ~5.5;", "z = ~5.5;", FoldConstants.FRACTIONAL_BITWISE_OPERAND);
  }

  public void testBitnotOutOfRangeError() {
    // val > Integer.MAX_VALUE -> BITWISE_OPERAND_OUT_OF_RANGE, ไม่มีการแก้ไข
    test("z = ~4294967296;", "z = ~4294967296;",
        FoldConstants.BITWISE_OPERAND_OUT_OF_RANGE);
  }

  // ======================================================================
  // NEW RegExp / Array / Object
  // ======================================================================

  public void testNewRegExpNoFlagsFolded() {
    test("x = new RegExp('ab');", "x = /ab/;");
  }

  public void testNewRegExpWithSafeFlagsFolded() {
    test("x = new RegExp('ab', 'i');", "x = /ab/i;");
  }

  public void testNewRegExpInvalidFlagsError() {
    test("x = new RegExp('ab', 'z');", "x = new RegExp('ab', 'z');",
        FoldConstants.INVALID_REGULAR_EXPRESSION_FLAGS);
  }

  public void testNewRegExpGlobalFlagNotFolded() {
    // areSafeFlagsToFold('g') == false -> คืนโดยไม่ error และไม่แก้ไข
    testSame("x = new RegExp('ab', 'g');");
  }

  public void testNewRegExpEmptyPatternNotFolded() {
    // "".equals(pattern) -> ไม่ fold
    testSame("x = new RegExp('');");
  }

  public void testNewArrayLiteral() {
    test("x = new Array();", "x = [];");
  }

  public void testNewObjectLiteral() {
    test("x = new Object();", "x = {};");
  }

  public void testNewArrayWithArgsNotFolded() {
    // left.getNext() != null (มี argument) -> ไม่เข้าเงื่อนไข tryFoldLiteralConstructor
    testSame("x = new Array(3);");
  }

  // ======================================================================
  // INSTANCEOF
  // ======================================================================

  public void testInstanceofImmutableAlwaysFalse() {
    test("x = (5 instanceof Object);", "x = false;");
  }

  public void testInstanceofObjectLiteralWithObjectAlwaysTrue() {
    test("x = ({} instanceof Object);", "x = true;");
  }

  public void testInstanceofNonLiteralLeftNoChange() {
    testSame("x = (y instanceof Object);");
  }

  // ======================================================================
  // AND / OR
  // ======================================================================

  public void testOrLeftTruthyLiteralKeepsLeft() {
    test("x = 1 || y;", "x = 1;");
  }

  public void testOrLeftFalsyLiteralKeepsRight() {
    test("x = 0 || y;", "x = y;");
  }

  public void testAndLeftTruthyLiteralKeepsRight() {
    test("x = 1 && y;", "x = y;");
  }

  public void testAndLeftFalsyLiteralKeepsLeft() {
    test("x = 0 && y;", "x = 0;");
  }

  public void testAndRightTrueLiteralInIfKeepsLeft() {
    // (x && TRUE) => x  (เกิดขึ้นตอน visit node AND เอง เพราะ parent เป็น IF
    // และ NodeUtil.getConditionExpression(parent) == n)
    test("if (x && true) { y = 1; }", "if (x) { y = 1; }");
  }

  public void testOrRightTrueLiteralInWhileFoldsToNumberLiteral() {
    // (x || TRUE) เมื่อ parent เป็น WHILE -> ได้ right(TRUE) แทน AND node เดิม
    // จากนั้น tryMinimizeCondition ของ WHILE แปลง literal boolean เป็นตัวเลข
    // เทียบเท่า (1/0) เนื่องจากไม่ equivalent กับ node เดิม
    test("while (x || true) { y = 1; }", "while (1) { y = 1; }");
  }

  // ======================================================================
  // BITAND / BITOR / Shift
  // ======================================================================

  public void testBitAnd() {
    test("x = 5 & 3;", "x = 1;");
  }

  public void testBitOr() {
    test("x = 5 | 2;", "x = 7;");
  }

  public void testBitAndOutOfIntRangeNoFold() {
    testSame("x = 4294967296 & 1;");
  }

  public void testLeftShift() {
    test("x = 1 << 3;", "x = 8;");
  }

  public void testRightShiftWithNegativeOperand() {
    test("x = -8 >> 1;", "x = -4;");
  }

  public void testShiftAmountOutOfBoundsError() {
    test("x = 1 << 32;", "x = 1 << 32;",
        FoldConstants.SHIFT_AMOUNT_OUT_OF_BOUNDS);
  }

  public void testShiftFractionalLeftOperandError() {
    test("x = 1.5 << 1;", "x = 1.5 << 1;",
        FoldConstants.FRACTIONAL_BITWISE_OPERAND);
  }

  // ======================================================================
  // Arithmetic ADD / SUB / MUL / DIV
  // ======================================================================

  public void testAddNumbers() {
    test("x = 3 + 4;", "x = 7;");
  }

  public void testAddStrings() {
    test("x = 'a' + 'b';", "x = 'ab';");
  }

  public void testAddStringAndNumber() {
    test("x = 'a' + 1;", "x = 'a1';");
  }

  public void testSub() {
    test("x = 10 - 3;", "x = 7;");
  }

  public void testMul() {
    test("x = 3 * 4;", "x = 12;");
  }

  public void testDiv() {
    test("x = 10 / 2;", "x = 5;");
  }

  public void testDivideByZeroError() {
    test("x = 5 / 0;", "x = 5 / 0;", FoldConstants.DIVIDE_BY_0_ERROR);
  }

  public void testFoldLeftChildAdd() {
    // (foo() + 'a') + 'b'  ->  foo() + 'ab'
    test("x = foo() + 'a' + 'b';", "x = foo() + 'ab';");
  }

  // ======================================================================
  // Comparison
  // ======================================================================

  public void testNumberLessThan() {
    test("x = (1 < 2);", "x = true;");
  }

  public void testNumberGreaterOrEqualFalse() {
    test("x = (1 >= 2);", "x = false;");
  }

  public void testStringEquals() {
    test("x = ('a' == 'a');", "x = true;");
  }

  public void testStringNotEquals() {
    test("x = ('a' == 'b');", "x = false;");
  }

  public void testNullEqualsUndefinedTrue() {
    test("x = (null == undefined);", "x = true;");
  }

  public void testNullNotEqualsUndefinedFalse() {
    test("x = (null != undefined);", "x = false;");
  }

  public void testTrueEqualsTrue() {
    test("x = (true == true);", "x = true;");
  }

  public void testTrueEqualsFalse() {
    test("x = (true == false);", "x = false;");
  }

  // ======================================================================
  // GETPROP (.length)
  // ======================================================================

  public void testArrayLengthFolded() {
    test("x = [1, 2, 3].length;", "x = 3;");
  }

  public void testStringLengthFolded() {
    test("x = 'abc'.length;", "x = 3;");
  }

  public void testGetPropNotLengthNoChange() {
    testSame("x = [1, 2, 3].foo;");
  }

  public void testGetPropNonFoldableLeftNoChange() {
    testSame("x = foo.length;");
  }

  // ======================================================================
  // GETELEM
  // ======================================================================

  public void testGetElemValidIndex() {
    test("x = [1, 2, 3][1];", "x = 2;");
  }

  public void testGetElemOutOfBoundsError() {
    test("x = [1, 2, 3][5];", "x = [1, 2, 3][5];",
        FoldConstants.INDEX_OUT_OF_BOUNDS_ERROR);
  }

  public void testGetElemNonIntegerIndexError() {
    test("x = [1, 2, 3][1.5];", "x = [1, 2, 3][1.5];",
        FoldConstants.INVALID_GETELEM_INDEX_ERROR);
  }

  public void testGetElemNonArrayLeftNoChange() {
    testSame("x = foo[0];");
  }

  // ======================================================================
  // CALL: Array.join / String.indexOf/lastIndexOf
  // ======================================================================

  public void testEmptyArrayJoin() {
    // case 0 ของ switch ใน tryFoldStringJoin -> ไม่ขึ้นกับ InlineCostEstimator
    test("x = [].join(',');", "x = '';");
  }

  public void testStringIndexOf() {
    test("x = 'abcdef'.indexOf('cd');", "x = 2;");
  }

  public void testStringLastIndexOf() {
    test("x = 'abcabc'.lastIndexOf('a');", "x = 3;");
  }

  public void testStringIndexOfNotFound() {
    test("x = 'abcdef'.indexOf('zz');", "x = -1;");
  }

  // ======================================================================
  // ASSIGN -> compound assign
  // ======================================================================

  public void testAssignAddBecomesCompound() {
    test("x = x + y;", "x += y;");
  }

  public void testAssignWithSideEffectLeftNoChange() {
    // NodeUtil.mayHaveSideEffects(left) == true -> ไม่แปลง
    testSame("foo().x = foo().x + y;");
  }

  // ======================================================================
  // RETURN reduction
  // ======================================================================

  public void testReturnUndefinedNameReduced() {
    test("function f() { return undefined; }", "function f() { return; }");
  }

  public void testReturnVoidNoSideEffectReduced() {
    test("function f() { return void 0; }", "function f() { return; }");
  }

  public void testReturnVoidWithSideEffectNotReduced() {
    testSame("function f() { return void foo(); }");
  }

  public void testReturnNumberNotReduced() {
    testSame("function f() { return 5; }");
  }

  // ======================================================================
  // Block: ลบ statement ที่ไม่มี side effect
  // ======================================================================

  public void testBlockRemovesNoSideEffectStatement() {
    test("function f() { 1; x = 2; }", "function f() { x = 2; }");
  }

  // ======================================================================
  // WHILE / FOR / DO : always-false / always-true condition
  // ======================================================================

  public void testWhileTrueConditionKeepsLoopButMinimizesCondition() {
    // ตามที่ไล่ตรรกะจาก tryMinimizeCondition (default: literal -> ตัวเลขเทียบเท่า)
    // และ tryFoldWhile จะไม่ลบเพราะ condition ยังเป็น truthy
    test("while (true) { x = 1; }", "while (1) { x = 1; }");
  }

  public void testForTrueConditionBecomesEmptyCondition() {
    // tryFoldForCondition: literal true -> แทนที่ด้วย EMPTY node
    test("for (; true; ) { x = 1; }", "for (;;) { x = 1; }");
  }

  // หมายเหตุ: กรณี condition เป็น false (while/for/do ถูกลบทั้งก้อน) ทำให้เกิดการ
  // เปลี่ยนโครงสร้าง statement-list ระดับบนซึ่งไม่สามารถยืนยัน exact AST wrapping
  // ได้อย่างมั่นใจ 100% จาก source ที่ให้มาเพียงอย่างเดียว จึงระบุไว้เป็นกรณี
  // ที่ "ต้องตรวจสอบเพิ่มเติม" แทนการเดา:
  // test("while (false) { x = 1; }", "");              // TODO ตรวจสอบ
  // test("for (; false; ) { x = 1; }", "");            // TODO ตรวจสอบ
  // test("do { x = 1; } while (false);", "{ x = 1; }"); // TODO ตรวจสอบ

  public void testDoWithBreakNotFoldedEvenIfConditionFalse() {
    // hasBreakOrContinue(n) == true -> return ก่อนแก้ไขใด ๆ
    testSame("do { x = 1; break; } while (false);");
  }

  // ======================================================================
  // HOOK (ternary) ในบริบทที่ parent ไม่ใช่ EXPR_RESULT (ปลอดภัยจาก
  // ปัญหาการ wrap BLOCK)
  // ======================================================================

  public void testHookConditionTrueKeepsThen() {
    test("y = true ? 1 : 2;", "y = 1;");
  }

  public void testHookConditionFalseKeepsElse() {
    test("y = false ? 1 : 2;", "y = 2;");
  }

  public void testHookNonLiteralConditionNoChange() {
    testSame("y = x ? 1 : 2;");
  }
}
```

# ตารางสรุปการครอบคลุม Branch/Condition

| กลุ่ม Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testEmptyProgram` | boundary: input ว่าง, ไม่ throw |
| `testTypeof*` (9 เมธอด) | switch ทุก case ของ `TYPEOF` (STRING, NUMBER, TRUE, FALSE, NULL, OBJECTLIT, ARRAYLIT, NAME="undefined", non-literal) |
| `testNotDiscarded*`, `testNegDiscarded*`, `testBitnotDiscarded*` | branch `isExpressionNode(parent)` ทิ้ง operator |
| `testMinimizeNot*` (5 เมธอด) | `tryMinimizeNot` ทุก case (EQ/NE/SHEQ/SHNE/default-false) |
| `testNotLiteral*` | switch `Token.NOT` เมื่อ operand เป็น literal |
| `testNegInfinity/NaN/Number`, `testBitnot*` | switch `NEG`/`BITNOT` ทุก branch รวม error diagnostic 3 ชนิด |
| `testNewRegExp*` (5 เมธอด) | `tryFoldRegularExpressionConstructor`: fold สำเร็จ/มี flags/flags ผิด/flag 'g'/pattern ว่าง |
| `testNewArray/Object*` | `tryFoldLiteralConstructor` และเงื่อนไข `left.getNext()==null` |
| `testInstanceof*` (3 เมธอด) | `INSTANCEOF`: immutable→false, object literal→true, non-literal→no change |
| `testOr/AndLeft*`, `testAndRightTrue*`, `testOrRightTrue*` | `tryFoldAndOr` ทั้ง branch left-literal และ right-literal (+parent type check) |
| `testBitAnd/Or*`, `testShift*` | `tryFoldBitAndOr`, `tryFoldShift` รวม error diagnostics (OUT_OF_RANGE, FRACTIONAL) |
| `testAdd/Sub/Mul/Div*`, `testDivideByZeroError`, `testFoldLeftChildAdd` | `tryFoldArithmetic`, `tryFoldAdd`, `tryFoldLeftChildAdd` |
| `test*Comparison` (8 เมธอด) | `tryFoldComparison`: NULL/undefined, TRUE/FALSE, STRING, NUMBER cases |
| `testArray/StringLength*`, `testGetProp*NoChange` | `tryFoldGetProp` case ARRAYLIT/STRING และ default-return |
| `testGetElem*` (4 เมธอด) | `tryFoldGetElem`: valid, out-of-bounds error, invalid index error, non-array |
| `testEmptyArrayJoin`, `testString(Last)IndexOf*` | `tryFoldStringJoin` case 0, `tryFoldStringIndexOf` indexOf/lastIndexOf/not-found |
| `testAssignAdd*`, `testAssignWithSideEffect*` | `tryFoldAssign`: newType mapping และ side-effect guard |
| `testReturn*` (4 เมธอด) | `tryReduceReturn`: VOID no-side-effect, NAME="undefined", VOID with side effect, NUMBER |
| `testBlockRemovesNoSideEffectStatement` | `tryFoldBlock` loop ลบ child ที่ไม่มี side effect |
| `testWhileTrueCondition*`, `testForTrueCondition*` | `tryFoldWhile`/`tryFoldForCondition` เมื่อ condition literal true (ไม่ลบ loop) |
| `testDoWithBreakNotFolded` | `hasBreakOrContinue` guard ใน `tryFoldDo` |
| `testHookCondition*` (3 เมธอด) | `tryFoldHookIf` สำหรับ `HOOK`: true/false/non-literal |

**กรณีที่ไม่ได้ทดสอบ/ปิดคอมเมนต์ไว้และเหตุผล:** การลบ `while/for/do` ทั้งก้อนเมื่อ condition เป็น false (ผลลัพธ์ AST หลัง remove ทั้ง statement อาจมีรายละเอียดการ wrap ที่ไม่สามารถยืนยันได้จาก source ที่ให้มาเพียงอย่างเดียว) และ branch `containsUnicodeEscape` ที่คืน `true` (พึ่งพา `CodeGenerator.regexpEscape` ที่ไม่มี source ให้ตรวจสอบ) — ทั้งสองจุดนี้ระบุเป็น TODO/คอมเมนต์แทนการเดา ตามข้อกำหนดที่ 4