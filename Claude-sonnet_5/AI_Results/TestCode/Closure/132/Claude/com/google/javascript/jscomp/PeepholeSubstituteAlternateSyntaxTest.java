package com.google.javascript.jscomp;

import com.google.common.base.Strings;

/**
 * Unit tests for {@link PeepholeSubstituteAlternateSyntax}.
 *
 * หมายเหตุ: คลาสนี้ extends {@code CompilerTestCase} (ซึ่ง extends junit.framework.TestCase)
 * ตามรูปแบบมาตรฐานของการทดสอบ peephole pass ใน Closure Compiler เอง
 * เมธอดทดสอบใช้ naming convention "testXxx" แบบ JUnit3 เนื่องจาก JUnit4 รองรับการรัน
 * TestCase-based class โดยอัตโนมัติผ่าน JUnit38ClassRunner (ไม่จำเป็นต้องใช้ @Test annotation
 * และการใส่ @Test บนคลาสที่ extends TestCase จะไม่มีผลใด ๆ เพิ่มเติม)
 */
public class PeepholeSubstituteAlternateSyntaxTest extends CompilerTestCase {

  /** ค่าเริ่มต้นของ "late" (ดู constructor ของ PeepholeSubstituteAlternateSyntax) */
  private boolean late = true;

  public PeepholeSubstituteAlternateSyntaxTest() {
    super("");
  }

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    late = true;
    disableNormalize();
  }

  @Override
  protected int getNumRepetitions() {
    // รันเพียง 1 รอบทั้งต้นไม้ เพื่อให้ผลลัพธ์ของแต่ละ testcase คาดเดาได้แน่นอน
    return 1;
  }

  @Override
  protected CompilerPass getProcessor(final Compiler compiler) {
    return new PeepholeOptimizationsPass(
        compiler, new PeepholeSubstituteAlternateSyntax(late));
  }

  private void fold(String js, String expected) {
    test(js, expected);
  }

  private void foldSame(String js) {
    testSame(js);
  }

  // =========================================================================
  // 0) ค่าว่าง / boundary พื้นฐาน
  // =========================================================================

  public void testEmptyScript() {
    foldSame("");
  }

  public void testBareTrailingReturnRemoved() {
    // "return;" ที่เป็นคำสั่งสุดท้ายของฟังก์ชันถือเป็น redundant exit (follow == null)
    fold("function f(){return;}", "function f(){}");
  }

  public void testEmptyArrayLiteralUnchanged() {
    late = true;
    // numElements == 0 -> saving <= 0 -> ไม่ fold (boundary)
    foldSame("var x=[];");
  }

  // =========================================================================
  // 1) Token.TRUE / Token.FALSE -> reduceTrueFalse
  // =========================================================================

  public void testReduceTrueLate() {
    late = true;
    fold("var x=true;", "var x=!0;");
  }

  public void testReduceFalseLate() {
    late = true;
    fold("var x=false;", "var x=!1;");
  }

  public void testReduceTrueFalseNotLate() {
    late = false;
    foldSame("var x=true;");
    foldSame("var x=false;");
  }

  // =========================================================================
  // 2) Token.NOT -> tryMinimizeNot (!(x==y) -> x!=y, ฯลฯ)
  // =========================================================================

  public void testMinimizeNotEqToNe() {
    fold("!(x==y);", "x!=y;");
  }

  public void testMinimizeNotNeToEq() {
    fold("!(x!=y);", "x==y;");
  }

  public void testMinimizeNotShEqToShNe() {
    fold("!(x===y);", "x!==y;");
  }

  public void testMinimizeNotShNeToShEq() {
    fold("!(x!==y);", "x===y;");
  }

  public void testMinimizeNotDefaultUnchanged() {
    // GT/LT ไม่ถูก handle เพราะ !(x<NaN) != x>=NaN ตาม comment ในซอร์ส
    foldSame("!(x<y);");
  }

  // =========================================================================
  // 3) tryMinimizeCondition: !! และ De Morgan (ผ่าน Token.EXPR_RESULT)
  // =========================================================================

  public void testDoubleNotRemoved() {
    fold("!!x;", "x;");
  }

  public void testDeMorganAndToOr() {
    fold("!(x&&y);", "!x||!y;");
  }

  public void testDeMorganOrToAnd() {
    fold("!(x||y);", "!x&&!y;");
  }

  public void testDeMorganWithNotChildrenAndToOr() {
    fold("!(!x&&!y);", "x||y;");
  }

  public void testDeMorganWithNotChildrenOrToAnd() {
    fold("!(!x||!y);", "x&&y;");
  }

  // =========================================================================
  // 4) tryMinimizeCondition: AND/OR กับค่าคงที่ boolean
  //    (late=false เพื่อไม่ให้ reduceTrueFalse แปลง true/false เป็น !0/!1 ก่อน)
  // =========================================================================

  public void testOrFalseRemoved() {
    late = false;
    fold("x||false;", "x;");
  }

  public void testAndTrueRemoved() {
    late = false;
    fold("x&&true;", "x;");
  }

  public void testOrTrueBecomesRightOperand() {
    late = false;
    fold("x||true;", "1;");
  }

  public void testAndFalseBecomesRightOperand() {
    late = false;
    fold("x&&false;", "0;");
  }

  // =========================================================================
  // 5) tryMinimizeCondition: HOOK (x?true:false ฯลฯ)
  // =========================================================================

  public void testHookTrueFalseToCondition() {
    late = false;
    fold("x?true:false;", "x;");
  }

  public void testHookFalseTrueToNotCondition() {
    late = false;
    fold("x?false:true;", "!x;");
  }

  public void testHookTrueYToOr() {
    late = false;
    fold("x?true:y;", "x||y;");
  }

  public void testHookYFalseToAnd() {
    late = false;
    fold("x?y:false;", "x&&y;");
  }

  // =========================================================================
  // 6) tryMinimizeCondition: default branch ของ NOT (!true;) และ while/do/for(true)
  //    (late=false เพื่อกัน reduceTrueFalse แทรกก่อน)
  // =========================================================================

  public void testNotTrueLiteralFolds() {
    late = false;
    fold("!true;", "0;");
  }

  public void testWhileTrueToWhile1() {
    late = false;
    fold("while(true){}", "while(1){}");
  }

  public void testDoWhileTrueToDoWhile1() {
    late = false;
    fold("do{}while(true);", "do{}while(1);");
  }

  public void testForTrueToFor1() {
    late = false;
    fold("for(;true;){}", "for(;1;){}");
  }

  public void testForInSkipped() {
    // isForIn(node) == true -> ไม่ทำ tryJoinForCondition/tryMinimizeCondition
    late = false;
    foldSame("for(x in y){}");
  }

  // =========================================================================
  // 7) tryMinimizeIf (Token.IF)
  // =========================================================================

  public void testIfToAnd() {
    late = true;
    fold("if(x)foo();", "x&&foo();");
  }

  public void testIfNotToOr() {
    late = true;
    fold("if(!x)foo();", "x||foo();");
  }

  public void testIfElseReturnToHook() {
    fold("function f(x){if(x)return 1;else return 2;}",
         "function f(x){return x?1:2;}");
  }

  public void testIfElseAssignSameLhsToHook() {
    fold("function f(x){if(x){a=1;}else{a=2;}}",
         "function f(x){a=x?1:2;}");
  }

  public void testIfElseGeneralHook() {
    fold("function f(x){if(x){foo();}else{bar();}}",
         "function f(x){x?foo():bar();}");
  }

  public void testIfVarElseAssignToVarHook() {
    fold("function f(x){if(x)var y=1;else y=2;}",
         "function f(x){var y=x?1:2;}");
  }

  public void testIfAssignElseVarToVarHook() {
    fold("function f(x){if(x)y=1;else var y=2;}",
         "function f(x){var y=x?1:2;}");
  }

  /**
   * ทดสอบ branch การสลับ if(!x)a();else b(); -> if(x)b();else a();
   * แล้วต่อยอดเป็น hook. ผลลัพธ์สุดท้ายอิงพฤติกรรม fixpoint-per-node ของ
   * PeepholeOptimizationsPass (ตาม trace ของโค้ดสองรอบ: สลับสาขาก่อน แล้ว
   * general-hook branch จะ match อีกครั้งบน node เดิม) - เป็นพฤติกรรมที่รู้จัก
   * ของ Closure Compiler แม้ source ของ PeepholeOptimizationsPass ไม่ได้ให้มา
   */
  public void testIfNotSwapThenHookify() {
    late = true;
    fold("if(!x)foo();else bar();", "x?bar():foo();");
  }

  public void testStatementMustExitParentMovesElseOut() {
    fold("function f(x){if(x){return 1;}else{y=2;}}",
         "function f(x){if(x)return 1;{y=2;}}");
  }

  public void testIfLiteralConditionUnchanged() {
    // NodeUtil.isLiteralValue(cond, true) == true -> ให้ optimization อื่นจัดการ
    late = false;
    foldSame("if(true)foo();");
  }

  // =========================================================================
  // 8) Token.BLOCK -> tryReplaceIf
  // =========================================================================

  public void testIfReturnThenReturnToHookReturn() {
    fold("function f(x){if(x)return 1;return 2;}",
         "function f(x){return x?1:2;}");
  }

  public void testTwoIfSameReturnMergedWithOr() {
    fold("function f(x,y){if(x)return 1;if(y)return 1;}",
         "function f(x,y){if(x||y)return 1;}");
  }

  public void testTwoIfMergedWithAnd() {
    fold("function f(x,y){if(x)return 1;if(y)foo();else return 1;}",
         "function f(x,y){if(!x&&y)foo();else return 1;}");
  }

  // =========================================================================
  // 9) tryJoinForCondition (เรียกจาก Token.FOR เมื่อ late == true)
  // =========================================================================

  public void testJoinForConditionEmptyNoElse() {
    late = true;
    fold("for(;;){if(x)break;foo();}", "for(;!x;){foo();}");
  }

  public void testJoinForConditionNonEmptyNoElse() {
    late = true;
    fold("for(;y;){if(x)break;foo();}", "for(;y&&!x;){foo();}");
  }

  public void testJoinForConditionEmptyWithElse() {
    late = true;
    fold("for(;;){if(x){break;}else{bar();}foo();}",
         "for(;!x;){{bar();}foo();}");
  }

  public void testJoinForConditionNotLateNoOp() {
    // !late -> tryJoinForCondition คืนค่าทันทีโดยไม่ทำอะไร
    late = false;
    foldSame("for(;y;){if(x)break;foo();}");
  }

  public void testJoinForConditionGuardBreakNotBare() {
    // thenBranch ไม่ใช่ bare break -> ไม่ join
    late = true;
    foldSame("for(;y;){if(x)foo();bar();}");
  }

  public void testJoinForConditionGuardLabeledBreak() {
    // maybeBreak.hasChildren() == true (มี label) -> ไม่ join
    late = true;
    foldSame("for(;y;){if(x)break label;bar();}");
  }

  // =========================================================================
  // 10) Token.NEW / Token.CALL -> tryFoldStandardConstructors / tryFoldLiteralConstructor
  //     ต้องเปิด normalize เพื่อให้ isASTNormalized() == true
  // =========================================================================

  public void testNewObjectToObjectLiteral() {
    enableNormalize();
    fold("var x=new Object();", "var x={};");
  }

  public void testNewArrayNoArgsToEmptyArray() {
    enableNormalize();
    fold("var x=new Array();", "var x=[];");
  }

  public void testNewArrayMultipleArgsToArrayLiteral() {
    enableNormalize();
    fold("var x=new Array(1,2,3);", "var x=[1,2,3];");
  }

  public void testNewArraySingleZeroToEmptyArray() {
    enableNormalize();
    fold("var x=new Array(0);", "var x=[];");
  }

  public void testNewArraySingleNonZeroUnchanged() {
    // "Array(number)" สร้าง array ที่มีความยาวคงที่ ไม่สามารถ fold ได้อย่างปลอดภัย
    enableNormalize();
    foldSame("var x=new Array(7);");
  }

  public void testNewArraySingleStringToArrayLiteral() {
    enableNormalize();
    fold("var x=new Array('a');", "var x=['a'];");
  }

  public void testNewArraySingleArrayLitArgToArrayLiteral() {
    enableNormalize();
    fold("var x=new Array([1,2]);", "var x=[[1,2]];");
  }

  public void testNewNonStandardConstructorUnchanged() {
    enableNormalize();
    // className ไม่อยู่ใน STANDARD_OBJECT_CONSTRUCTORS -> tryFoldStandardConstructors
    // ไม่แปลง NEW เป็น CALL -> !node.isCall() -> return node ทันที
    foldSame("var x=new Foo();");
  }

  public void testConstructorFoldingRequiresNormalize() {
    // ไม่เปิด normalize -> isASTNormalized() == false -> ไม่ fold เลย
    foldSame("var x=new Array();");
    foldSame("var x=new Object();");
  }

  // =========================================================================
  // 11) tryFoldRegularExpressionConstructor (ผ่าน NEW และ CALL)
  // =========================================================================

  public void testNewRegExpNoFlagsToLiteral() {
    enableNormalize();
    fold("var x=new RegExp('abc');", "var x=/abc/;");
  }

  public void testCallRegExpNoFlagsToLiteral() {
    // ไม่มี "new" -> เข้าทาง Token.CALL -> tryFoldLiteralConstructor เช่นเดียวกัน
    enableNormalize();
    fold("var x=RegExp('abc');", "var x=/abc/;");
  }

  public void testNewRegExpValidFlagToLiteral() {
    enableNormalize();
    // 'i' ไม่มี 'g' -> areSafeFlagsToFold() == true เสมอไม่ว่า ES version ใด
    fold("var x=new RegExp('abc','i');", "var x=/abc/i;");
  }

  public void testNewRegExpEmptyPatternUnchanged() {
    enableNormalize();
    // ป้องกัน pattern ว่างกลาย //  ที่กำกวม
    foldSame("var x=new RegExp('');");
  }

  public void testNewRegExpTooLongPatternUnchanged() {
    enableNormalize();
    String longPattern = Strings.repeat("a", 100);
    foldSame("var x=new RegExp('" + longPattern + "');");
  }

  public void testNewRegExpNoArgsUnchanged() {
    enableNormalize();
    // pattern == null -> "too few arguments"
    foldSame("var x=new RegExp();");
  }

  public void testNewRegExpTooManyArgsUnchanged() {
    enableNormalize();
    // flags.getNext() != null -> "too many arguments"
    foldSame("var x=new RegExp('a','g','extra');");
  }

  public void testNewRegExpForwardSlashEscaped() {
    enableNormalize();
    fold("var x=new RegExp('a/b');", "var x=/a\\/b/;");
  }

  // =========================================================================
  // 12) tryFoldSimpleFunctionCall (String(...) -> ''+...)
  // =========================================================================

  public void testStringCallOfImmutableLiteralFolds() {
    fold("String(1);", "\"\"+1;");
  }

  public void testStringCallOfNonImmutableUnchanged() {
    foldSame("String(x);");
  }

  public void testStringCallMultipleArgsUnchanged() {
    foldSame("String(1,2);");
  }

  // =========================================================================
  // 13) trySplitComma (Token.COMMA)
  // =========================================================================

  public void testSplitCommaNotLate() {
    late = false;
    fold("foo(),bar();", "foo();bar();");
  }

  public void testSplitCommaLateNoOp() {
    late = true;
    foldSame("foo(),bar();");
  }

  public void testSplitCommaWrongParentUnchanged() {
    // parent ของ COMMA ไม่ใช่ EXPR_RESULT (อยู่ใน VAR) -> ไม่ split
    late = false;
    foldSame("var x=(foo(),bar());");
  }

  // =========================================================================
  // 14) tryReplaceUndefined (Token.NAME) - ต้อง isASTNormalized() == true
  // =========================================================================

  public void testUndefinedToVoid0() {
    enableNormalize();
    fold("var a=undefined;", "var a=void 0;");
  }

  public void testUndefinedAsLValueUnchanged() {
    enableNormalize();
    // NodeUtil.isLValue(n) == true -> ไม่แทนที่
    foldSame("undefined=1;");
  }

  public void testUndefinedNotNormalizedUnchanged() {
    // isASTNormalized() == false (ไม่ enableNormalize) -> ไม่แทนที่
    foldSame("var a=undefined;");
  }

  // =========================================================================
  // 15) tryMinimizeArrayLiteral / tryMinimizeStringArrayLiteral / pickDelimiter
  //     (Token.ARRAYLIT) - ต้อง late == true
  // =========================================================================

  public void testStringArrayAllLength1ToEmptyDelimiterSplit() {
    late = true;
    fold("var x=[\"a\",\"b\",\"c\",\"d\",\"e\",\"f\",\"g\"];",
         "var x=\"abcdefg\".split(\"\");");
  }

  public void testStringArrayPickSpaceDelimiterSplit() {
    late = true;
    fold("var x=[\"aa\",\"bb\",\"cc\",\"dd\",\"ee\",\"ff\",\"gg\"];",
         "var x=\"aa bb cc dd ee ff gg\".split(\" \");");
  }

  public void testStringArraySavingNotEnoughUnchanged() {
    late = true;
    // numElements(3)*2 - 12 <= 0 -> ไม่ fold
    foldSame("var x=[\"a\",\"b\",\"c\"];");
  }

  public void testMixedArrayLiteralNotAllStringsUnchanged() {
    late = true;
    foldSame("var x=[\"a\",1,\"c\",\"d\",\"e\",\"f\",\"g\"];");
  }

  public void testStringArrayNotLateUnchanged() {
    late = false;
    foldSame("var x=[\"a\",\"b\",\"c\",\"d\",\"e\",\"f\",\"g\"];");
  }

  public void testStringArrayDelimiterExhaustedUnchanged() {
    late = true;
    // ทุกตัวคั่นมาตรฐาน ( ,;,{,} ) ปรากฏอยู่ในสตริงทุกตัว -> pickDelimiter คืนค่า null
    String s = "\" ;,{}\"";
    fold("var x=[" + s + "," + s + "," + s + "," + s + "," + s + "," + s
         + "," + s + "];",
         "var x=[" + s + "," + s + "," + s + "," + s + "," + s + "," + s
         + "," + s + "];");
  }
}
