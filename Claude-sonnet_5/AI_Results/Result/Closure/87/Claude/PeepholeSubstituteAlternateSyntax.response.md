# PeepholeSubstituteAlternateSyntaxTest

## หมายเหตุสำคัญก่อนโค้ด (ข้อสมมติที่ต้องระบุตามข้อกำหนดที่ 4)

1. คลาส `PeepholeSubstituteAlternateSyntax` ที่ให้มา **ไม่ได้ถูกออกแบบให้ทดสอบแบบ isolate** — มันต้องพึ่ง `AbstractPeepholeOptimization`, `NodeUtil`, `ControlFlowAnalysis`, `CodeGenerator`, `Compiler` ฯลฯ ซึ่งเป็นคลาสอื่นใน package `com.google.javascript.jscomp` เดียวกัน (เป็นซอร์สของโปรเจกต์ Closure Compiler เอง ไม่ใช่ jar ภายนอกที่ระบุ) จึงต้องถือว่ามีอยู่ใน classpath ของโปรเจกต์ (ตาม convention ของ Defects4J-Closure ทุกบั๊ก จะมี `CompilerTestCase` เป็นฐานของเทสอยู่แล้ว)
2. ผมใช้ `CompilerTestCase` (JUnit3 `TestCase`) ตาม pattern มาตรฐานของชุดทดสอบ Closure Compiler ทั้งหมด และรัน "ที่รันด้วย JUnit4 runner" ซึ่ง JUnit4 รองรับการรัน JUnit3 `TestCase` ผ่าน `JUnit38ClassRunner` โดยอัตโนมัติ — จึงยัง "ใช้ JUnit4" (junit.jar) เป็น runner ตามข้อกำหนด แต่เขียนเมธอด public void testXxx() ตาม convention เพื่อให้ runner รู้จัก (มีการแนบ `@Test` เพิ่มเพื่อความชัดเจน)
3. เมธอด `getProcessor`, `test(js, expected)`, `testSame(js)` เป็น API มาตรฐานของ `CompilerTestCase` ที่ใช้กันทั่วทั้ง test suite ของ Closure Compiler — **สมมติฐานนี้จำเป็นเพื่อให้เทสรันได้จริง**
4. กรณีที่ต้องพึ่ง `isASTNormalized() == true` (การ fold `new Object()/new Array()/RegExp()`) **ไม่ได้เขียนเทสสำหรับกรณีเปิด normalize** เพราะไม่มีข้อมูลแน่ชัดในซอร์สที่ให้มาว่าจะ enable normalize ผ่าน `CompilerTestCase` อย่างไร (ป้องกันการเดา behavior ตามข้อกำหนดที่ 4) — จึงเทสเฉพาะ branch "ยังไม่ normalize → ไม่เปลี่ยนแปลง" ซึ่งพิสูจน์ได้ตรงจากซอร์สโค้ด 100%
5. เทสที่เกี่ยวกับการแปลง `return` → `break` (ผ่าน `ControlFlowAnalysis.isBreakTarget` / `computeFollowNode`) อ้างอิงจาก comment ในซอร์สโค้ดที่อธิบาย behavior เหล่านี้ไว้ชัดเจน (loop/switch คือ break target, FUNCTION/SCRIPT ทำให้ safe=false, follow==null คือปลายฟังก์ชัน) — มีความเสี่ยงเล็กน้อยเพราะไม่เห็น implementation จริงของ `ControlFlowAnalysis` จึงกำกับด้วยคอมเมนต์ไว้ในโค้ด

```java
package com.google.javascript.jscomp;

import org.junit.Test;

/**
 * JUnit4-style test suite for {@link PeepholeSubstituteAlternateSyntax}.
 *
 * หมายเหตุ: ใช้ {@code CompilerTestCase} (อยู่ใน package เดียวกันของโปรเจกต์ Closure
 * Compiler) เป็นฐาน ตาม convention ของชุดทดสอบ Closure Compiler ทั้งหมด
 * (ดูคำอธิบายสมมติฐานด้านบนของไฟล์นี้)
 */
public class PeepholeSubstituteAlternateSyntaxTest extends CompilerTestCase {

  public PeepholeSubstituteAlternateSyntaxTest() {
    // externs ว่าง เพราะไม่จำเป็นสำหรับการทดสอบ pass นี้
    super("");
  }

  @Override
  protected CompilerPass getProcessor(final Compiler compiler) {
    // สมมติฐาน: PeepholeOptimizationsPass(AbstractCompiler, AbstractPeepholeOptimization...)
    return new PeepholeOptimizationsPass(
        compiler, new PeepholeSubstituteAlternateSyntax());
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    // ไม่เปิด normalize เพื่อไม่ต้องเดา API ของ CompilerTestCase (ดูข้อสมมติฐานที่ 4)
  }

  // ======================================================================
  // 1) tryReduceReturn  (Token.RETURN)
  // ======================================================================

  @Test
  public void testReduceReturn_voidNoSideEffect() {
    // result.getType() == Token.VOID, !mayHaveSideEffects(operand)
    test("function f(){return void 0;}", "function f(){return;}");
  }

  @Test
  public void testReduceReturn_voidWithSideEffect() {
    // VOID branch แต่ operand มี side effect -> ไม่ลบ
    testSame("function f(){return void foo();}");
  }

  @Test
  public void testReduceReturn_nameUndefined() {
    // result.getType() == Token.NAME, name.equals("undefined")
    test("function f(){return undefined;}", "function f(){return;}");
  }

  @Test
  public void testReduceReturn_nameNotUndefined() {
    // NAME branch แต่ไม่ใช่ "undefined" -> ไม่เปลี่ยน
    testSame("function f(){return foo;}");
  }

  @Test
  public void testReduceReturn_defaultCase() {
    // result != null แต่เป็น default (เช่น NUMBER literal) -> "Do nothing"
    testSame("function f(){return 1;}");
  }

  @Test
  public void testReduceReturn_alreadyEmptyReturn() {
    // result == null และไม่มี break target ที่ปลอดภัย -> ไม่เปลี่ยน (boundary case)
    testSame("function f(){return;}");
  }

  @Test
  public void testReduceReturn_safeFalse_dueToFunctionBoundary() {
    // breakTarget เดินขึ้นไปเจอ FUNCTION ก่อนเจอ break target จริง -> safe=false
    // จึงข้าม if(safe){...} ทั้งหมด แล้วไปตกที่ default switch (NUMBER) -> ไม่เปลี่ยน
    // (ดูข้อสมมติฐานที่ 5)
    testSame("function f(x){if(x){return 1;}return 1;}");
  }

  @Test
  public void testReduceReturn_breakConversion_inLoop_noResult() {
    // FOR node เป็น break target ที่ถูกต้อง (safe=true), follow == null
    // (สุดท้ายของฟังก์ชัน) และ result == null -> แปลง RETURN เป็น BREAK
    // (ดูข้อสมมติฐานที่ 5)
    test("function f(){for(;;){return;}}",
         "function f(){for(;;){break;}}");
  }

  @Test
  public void testReduceReturn_breakConversion_mergeWithFollowingReturn() {
    // WHILE เป็น break target, follow ของ WHILE คือ "return 1;" ตัวถัดไปซึ่งมีค่า
    // เท่ากันแบบ tree-equal -> merge เป็น BREAK
    // (ดูข้อสมมติฐานที่ 5)
    test("function f(x){while(1){if(x){return 1;}return 1;}}",
         "function f(x){while(1){if(x){break;}return 1;}}");
  }

  // ======================================================================
  // 2) tryMinimizeNot  (Token.NOT)
  // ======================================================================

  @Test
  public void testMinimizeNot_eqToNe() {
    test("a = !(x==y);", "a = x!=y;");
  }

  @Test
  public void testMinimizeNot_neToEq() {
    test("a = !(x!=y);", "a = x==y;");
  }

  @Test
  public void testMinimizeNot_sheqToShne() {
    test("a = !(x===y);", "a = x!==y;");
  }

  @Test
  public void testMinimizeNot_shneToSheq() {
    test("a = !(x!==y);", "a = x===y;");
  }

  @Test
  public void testMinimizeNot_defaultNotHandled() {
    // GT/LT ไม่ถูกจัดการ (comment ในซอร์สอธิบายเหตุผลไว้ชัด)
    testSame("a = !(x<y);");
  }

  // ======================================================================
  // 3) tryMinimizeIf  (Token.IF)
  // ======================================================================

  @Test
  public void testMinimizeIf_literalCondition_noChange() {
    // NodeUtil.isLiteralValue(cond, true) == true -> return n unchanged
    testSame("if(true) foo();");
  }

  @Test
  public void testMinimizeIf_noElse_notFoldableBlock() {
    // thenBranch มีมากกว่า 1 statement -> isFoldableExpressBlock == false
    testSame("if(x){foo();bar();}");
  }

  @Test
  public void testMinimizeIf_noElse_propertyAssignment_kept() {
    // isPropertyAssignmentInExpression == true -> คงไว้ (เผื่อ CollapseProperties)
    testSame("if(x) a.b = 1;");
  }

  @Test
  public void testMinimizeIf_noElse_simpleAndFold() {
    // if(x)foo(); -> x&&foo();
    test("if(x) foo();", "x&&foo();");
  }

  @Test
  public void testMinimizeIf_noElse_notCond_orFold() {
    // if(!x)foo(); -> x||foo();
    test("if(!x) foo();", "x||foo();");
  }

  @Test
  public void testMinimizeIf_noElse_andBlockedByLowPrecedence() {
    // expr.getFirstChild() มี precedence ต่ำกว่า AND -> ไม่แปลง
    testSame("if(x) a=b=1;");
  }

  @Test
  public void testMinimizeIf_noElse_orBlockedByLowPrecedence() {
    // cond เป็น NOT แต่ expr precedence ต่ำกว่า OR -> ไม่แปลง
    testSame("if(!x) a=b=1;");
  }

  @Test
  public void testMinimizeIf_notCond_swapThenElse() {
    // if(!x)foo();else bar(); -> if(x)bar();else foo();  (consumesDanglingElse == false)
    test("if(!x) foo(); else bar();",
         "if(x) bar(); else foo();");
  }

  @Test
  public void testMinimizeIf_notCond_danglingElse_blocksSwap() {
    // elseBranch เป็น "else if" ที่ไม่มี else ของตัวเอง -> consumesDanglingElse == true
    // จึงข้ามการสวับ then/else และ transform อื่น ๆ ก็ไม่ match -> ไม่เปลี่ยน
    testSame("if(!x)foo();else if(y)bar();");
  }

  @Test
  public void testMinimizeIf_returnHook() {
    // if(x)return 1;else return 2; -> return x?1:2;
    test("function f(){if(x) return 1; else return 2;}",
         "function f(){return x?1:2;}");
  }

  @Test
  public void testMinimizeIf_callHook() {
    // if(x)foo();else bar(); -> x?foo():bar();
    test("if(x) foo(); else bar();", "x?foo():bar();");
  }

  @Test
  public void testMinimizeIf_assignHook() {
    // if(x)a=1;else a=2; -> a=x?1:2;
    test("if(x) a=1; else a=2;", "a=x?1:2;");
  }

  @Test
  public void testMinimizeIf_varThenAssignElse() {
    // if(x)var y=1;else y=2; -> var y=x?1:2;
    test("if(x) var y=1; else y=2;", "var y=x?1:2;");
  }

  @Test
  public void testMinimizeIf_assignThenVarElse() {
    // if(x)y=1;else var y=2; -> var y=x?1:2;
    test("if(x) y=1; else var y=2;", "var y=x?1:2;");
  }

  @Test
  public void testMinimizeIf_repeatedStatementsThenMerge() {
    // tryRemoveRepeatedStatements ย้าย foo() ที่ซ้ำออกมาก่อน จากนั้น
    // then/else เหลือ statement เดียว (assign) ที่ merge ต่อได้ทันทีในรอบเดียวกัน
    test("if(a){x=1;foo();}else{x=2;foo();}",
         "x=a?1:2;foo();");
  }

  // ======================================================================
  // 4) tryMinimizeCondition  (ผ่าน Token.NOT / OR / AND / HOOK / EXPR_RESULT /
  //    IF / WHILE / DO / FOR / HOOK ใน optimizeSubtree)
  // ======================================================================

  @Test
  public void testMinimizeCondition_doubleNot_viaIf() {
    // !!x ในเงื่อนไข if -> x, แล้วต่อด้วย if(x)foo(); -> x&&foo();
    test("if(!!x) foo();", "x&&foo();");
  }

  @Test
  public void testMinimizeCondition_doubleNot_viaHook() {
    // Token.HOOK case ใน optimizeSubtree: minimize เฉพาะ condition ของ hook
    test("(!!x)?a():b();", "x?a():b();");
  }

  @Test
  public void testMinimizeCondition_deMorgan_notOr_bothNotChildren() {
    // !(!x||!y) -> x&&y
    test("!(!x||!y);", "x&&y;");
  }

  @Test
  public void testMinimizeCondition_deMorgan_notAnd_bothNotChildren() {
    // !(!x&&!y) -> x||y
    test("!(!x&&!y);", "x||y;");
  }

  @Test
  public void testMinimizeCondition_deMorgan_notMatched_noBothNot() {
    // OR children ไม่ใช่ NOT ทั้งคู่ -> ไม่แปลง (แค่ minimize ชั้นต่อไปตามปกติ)
    testSame("!(x||y);");
  }

  @Test
  public void testMinimizeCondition_orFalse() {
    // x||false -> x   (false ถูก normalize เป็น 0 ก่อน แล้ว OR ถูกยุบเป็น left)
    test("x||false;", "x;");
  }

  @Test
  public void testMinimizeCondition_orTrue() {
    // x||true -> 1  (true ถูก minimize เป็น NUMBER 1 ก่อน, จากนั้นแทน OR ด้วย right)
    test("x||true;", "1;");
  }

  @Test
  public void testMinimizeCondition_andTrue() {
    // x&&true -> x
    test("x&&true;", "x;");
  }

  @Test
  public void testMinimizeCondition_andFalse() {
    // x&&false -> 0
    test("x&&false;", "0;");
  }

  @Test
  public void testMinimizeCondition_hook_trueFalse() {
    // a?true:false -> a
    test("a?true:false;", "a;");
  }

  @Test
  public void testMinimizeCondition_hook_falseTrue() {
    // a?false:true -> !a
    test("a?false:true;", "!a;");
  }

  @Test
  public void testMinimizeCondition_hook_trueElse() {
    // a?true:b -> a||b
    test("a?true:b;", "a||b;");
  }

  @Test
  public void testMinimizeCondition_hook_thenFalse() {
    // a?b:false -> a&&b
    test("a?b:false;", "a&&b;");
  }

  @Test
  public void testMinimizeCondition_while() {
    // Token.WHILE case
    test("while(!!x){}", "while(x){}");
  }

  @Test
  public void testMinimizeCondition_doWhile() {
    // Token.DO case
    test("do{}while(!!x);", "do{}while(x);");
  }

  @Test
  public void testMinimizeCondition_forRegular() {
    // Token.FOR, !isForIn(node) -> minimize condition
    test("for(;!!x;){}", "for(;x;){}");
  }

  @Test
  public void testMinimizeCondition_forIn_skipped() {
    // Token.FOR, isForIn(node) -> ไม่แตะ condition (ไม่มี boolean condition ให้ minimize จริง)
    testSame("for(x in y){}");
  }

  // ======================================================================
  // 5) tryFoldStandardConstructors / tryFoldLiteralConstructor
  //    (Token.NEW / Token.CALL) — เทสเฉพาะกรณี isASTNormalized() == false
  //    (ดูข้อสมมติฐานที่ 4)
  // ======================================================================

  @Test
  public void testNewObject_notNormalized_noChange() {
    // isASTNormalized() == false -> ข้ามการ fold ทั้งหมดใน tryFoldStandardConstructors
    // และเพราะ node ยังเป็น NEW (ไม่ใช่ CALL) จึง return ก่อนถึง tryFoldLiteralConstructor
    testSame("new Object();");
  }

  @Test
  public void testNewArray_notNormalized_noChange() {
    testSame("new Array(1,2,3);");
  }

  @Test
  public void testCallRegExp_notNormalized_noChange() {
    // Token.CALL ตรง ๆ -> tryFoldLiteralConstructor ถูกเรียกทันที แต่ isASTNormalized()==false
    testSame("RegExp('a','g');");
  }

  @Test
  public void testCallObject_notNormalized_noChange() {
    testSame("Object();");
  }

  // ======================================================================
  // 6) Boundary / default-case coverage
  // ======================================================================

  @Test
  public void testDefaultCase_unrelatedStatement_noChange() {
    // node type ที่ไม่อยู่ใน switch ใด ๆ ของ optimizeSubtree -> "Nothing changed"
    testSame("var z = 5;");
  }

  @Test
  public void testEmptyFunctionBody_boundary() {
    testSame("function f(){}");
  }

  @Test
  public void testEmptyProgram_boundary() {
    testSame("");
  }
}
```

## ตารางสรุป Test methods กับ Branch/Condition ที่ครอบคลุม

| Test method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testReduceReturn_voidNoSideEffect | `result.getType()==VOID`, `!mayHaveSideEffects` → ลบ operand |
| testReduceReturn_voidWithSideEffect | `VOID` แต่มี side effect → ไม่ลบ |
| testReduceReturn_nameUndefined | `NAME` == "undefined" → ลบ |
| testReduceReturn_nameNotUndefined | `NAME` != "undefined" → ไม่ลบ |
| testReduceReturn_defaultCase | `default` switch (ไม่ทำอะไร) |
| testReduceReturn_alreadyEmptyReturn | `result==null`, boundary case |
| testReduceReturn_safeFalse_dueToFunctionBoundary | `safe=false` (เจอ FUNCTION ก่อนเจอ break target) |
| testReduceReturn_breakConversion_inLoop_noResult | `safe=true`, `follow==null`, `result==null` → BREAK |
| testReduceReturn_breakConversion_mergeWithFollowingReturn | `follow.getType()==RETURN` + tree-equal merge → BREAK |
| testMinimizeNot_* (4 methods) | `EQ/NE/SHEQ/SHNE` ↔ complement ทั้ง 4 branch |
| testMinimizeNot_defaultNotHandled | `default` (GT/LT ไม่ handle) |
| testMinimizeIf_literalCondition_noChange | `isLiteralValue(cond,true)==true` |
| testMinimizeIf_noElse_notFoldableBlock | `isFoldableExpressBlock==false` |
| testMinimizeIf_noElse_propertyAssignment_kept | `isPropertyAssignmentInExpression==true` |
| testMinimizeIf_noElse_simpleAndFold | `if(x)foo();→x&&foo();` |
| testMinimizeIf_noElse_notCond_orFold | `cond.getType()==NOT`→OR fold |
| testMinimizeIf_noElse_andBlockedByLowPrecedence | AND-precedence block check |
| testMinimizeIf_noElse_orBlockedByLowPrecedence | OR-precedence block check |
| testMinimizeIf_notCond_swapThenElse | `consumesDanglingElse==false` → swap |
| testMinimizeIf_notCond_danglingElse_blocksSwap | `consumesDanglingElse==true` → ไม่ swap |
| testMinimizeIf_returnHook | `isReturnExpressBlock` both → HOOK+RETURN |
| testMinimizeIf_callHook | `thenOp/elseOp` เป็น CALL → HOOK |
| testMinimizeIf_assignHook | `NodeUtil.isAssignmentOp` เท่ากัน LHS → HOOK assign |
| testMinimizeIf_varThenAssignElse | then=VAR, else=assign block |
| testMinimizeIf_assignThenVarElse | then=assign, else=VAR block |
| testMinimizeIf_repeatedStatementsThenMerge | `tryRemoveRepeatedStatements` loop + merge ต่อเนื่อง |
| testMinimizeCondition_doubleNot_viaIf / viaHook | `NOT` case: child เป็น `NOT` |
| testMinimizeCondition_deMorgan_notOr/_notAnd_bothNotChildren | `AND/OR` children ทั้งคู่เป็น NOT |
| testMinimizeCondition_deMorgan_notMatched_noBothNot | AND/OR children ไม่ครบ NOT ทั้งคู่ |
| testMinimizeCondition_orFalse/_orTrue/_andTrue/_andFalse | boolean simplification 4 branch ของ OR/AND |
| testMinimizeCondition_hook_* (4 methods) | HOOK 4 branch: TRUE/FALSE, FALSE/TRUE, TRUE/else, then/FALSE |
| testMinimizeCondition_while / doWhile | Token.WHILE / DO case |
| testMinimizeCondition_forRegular / forIn_skipped | Token.FOR: `isForIn` true/false |
| testNewObject/_Array/_CallRegExp/_CallObject_notNormalized | `isASTNormalized()==false` (NEW และ CALL) |
| testDefaultCase_unrelatedStatement_noChange | `default` ของ `optimizeSubtree` |
| testEmptyFunctionBody_boundary / testEmptyProgram_boundary | boundary/empty input |