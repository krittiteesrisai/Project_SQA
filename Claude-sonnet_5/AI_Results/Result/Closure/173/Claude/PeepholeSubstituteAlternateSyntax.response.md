# คำอธิบายก่อนโค้ด

คลาส `PeepholeSubstituteAlternateSyntax` เป็นคลาสภายใน package `com.google.javascript.jscomp` ที่สืบทอดจาก `AbstractPeepholeOptimization` และต้องพึ่งพา infrastructure ของ Closure Compiler เอง (เช่น `Node`, `IR`, `Compiler`, `CompilerTestCase`, `PeepholeOptimizationsPass`) ซึ่ง**เป็นส่วนหนึ่งของ source tree เดียวกันกับคลาสเป้าหมาย** (ไม่ใช่ external jar ตามข้อ 1) จึงยังใช้ได้ตามข้อกำหนด

**ข้อสมมติที่ต้องระบุตามข้อ 4 (ไม่มีซอร์สของ `CompilerTestCase`/`AbstractPeepholeOptimization` ให้มา):**
- สมมติว่า `CompilerTestCase` มีเมธอด `test(js, expected)`, `testSame(js)`, `enableNormalize()`, `disableNormalize()`, `setAcceptedLanguage(LanguageMode)`, `getProcessor(Compiler)`, `getNumRepetitions()` ตามรูปแบบมาตรฐานที่ใช้ทดสอบ peephole pass อื่น ๆ ใน Closure Compiler
- `isASTNormalized()` ผูกกับ `enableNormalize()/disableNormalize()`
- พฤติกรรมของ `CodingConvention.describeFunctionBind` (bind != null) **ไม่ได้ทดสอบเชิงลึก** เพราะไม่มีซอร์สให้ตรวจสอบ — ทดสอบเฉพาะกรณี `bind == null` เท่านั้น (ระบุคอมเมนต์ในโค้ด)
- Sub-branch บางอันของ `makeForwardSlashBracketSafe` (เช่น `\r`, `\u2028`, `\u2029`, isEscaped+lineTerminator ร่วมกัน) และ `containsUnicodeEscape` **ไม่ได้ทดสอบครบทุกกรณี** เนื่องจากไม่มีซอร์ส `CodeGenerator.regexpEscape` ให้ยืนยันพฤติกรรม — ระบุคอมเมนต์กำกับ

```java
package com.google.javascript.jscomp;

import com.google.javascript.jscomp.CompilerOptions.LanguageMode;

/**
 * Unit test สำหรับ PeepholeSubstituteAlternateSyntax (Defects4J Closure-173b)
 *
 * หมายเหตุ: ทดสอบผ่าน CompilerTestCase (ส่วนหนึ่งของ source tree เดียวกับคลาสเป้าหมาย)
 * เนื่องจากคลาสเป้าหมายพึ่งพา Node/AST/Compiler ที่สร้างขึ้นจากการ parse จริง
 * บาง API ของ CompilerTestCase ถูกสมมติตามรูปแบบมาตรฐานของ Closure Compiler test suite
 * (ดูคำอธิบายก่อนโค้ด)
 */
public class PeepholeSubstituteAlternateSyntaxTest extends CompilerTestCase {

  private boolean late = false;

  public PeepholeSubstituteAlternateSyntaxTest() {
    super("");
  }

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    late = false;
    disableNormalize();
    setAcceptedLanguage(LanguageMode.ECMASCRIPT5);
  }

  @Override
  protected CompilerPass getProcessor(final Compiler compiler) {
    return new PeepholeOptimizationsPass(
        compiler, new PeepholeSubstituteAlternateSyntax(late));
  }

  @Override
  protected int getNumRepetitions() {
    // ป้องกันการวนซ้ำหลายรอบที่อาจบัง masked-branch อื่น ๆ
    return 1;
  }

  private void fold(String js, String expected) {
    test(js, expected);
  }

  private void foldSame(String js) {
    testSame(js);
  }

  // ================= TRUE / FALSE =================

  public void testReduceTrueFalse_late() {
    late = true;
    fold("x = true", "x = !0");
    fold("x = false", "x = !1");
  }

  public void testReduceTrueFalse_notLate() {
    late = false;
    foldSame("x = true");
    foldSame("x = false");
  }

  // ================= NEW -> standard constructors / literal constructor =================

  public void testFoldNewObject_normalized_noArgs() {
    enableNormalize();
    // NEW -> CALL (tryFoldStandardConstructors) -> literal (tryFoldLiteralConstructor)
    fold("var x = new Object();", "var x = {};");
  }

  public void testFoldNewObject_normalized_withArgs() {
    enableNormalize();
    // constructorHasArgs == true -> ไม่ fold เป็น literal, เหลือแค่ NEW->CALL
    fold("var x = new Object(1);", "var x = Object(1);");
  }

  public void testFoldNewObject_notNormalized() {
    disableNormalize();
    foldSame("var x = new Object();");
  }

  public void testFoldNewCustomClass_normalized_notInSet() {
    enableNormalize();
    // className ไม่อยู่ใน STANDARD_OBJECT_CONSTRUCTORS -> ไม่แปลงเป็น CALL, !node.isCall() -> return node
    foldSame("var x = new Foo();");
  }

  public void testFoldNewError_normalized() {
    enableNormalize();
    // Error อยู่ใน set แต่ tryFoldLiteralConstructor ไม่รู้จัก "Error" -> เหลือเป็น CALL เฉย ๆ
    fold("var x = new Error('msg');", "var x = Error('msg');");
  }

  // ================= Array constructor folding =================

  public void testFoldArray_noArgs() {
    enableNormalize();
    fold("new Array();", "[];");
  }

  public void testFoldArray_multipleArgs() {
    enableNormalize();
    fold("new Array(1,2,3);", "[1,2,3];");
  }

  public void testFoldArray_singleNumberZero() {
    enableNormalize();
    // NUMBER == 0 -> SAFE_TO_FOLD_WITHOUT_ARGS
    fold("new Array(0);", "[];");
  }

  public void testFoldArray_singleNumberNonZero_unsafe() {
    enableNormalize();
    // NUMBER != 0 -> NOT_SAFE_TO_FOLD (เหลือเป็น Array(7) เพราะ NEW->CALL ยังทำ)
    fold("new Array(7);", "Array(7);");
  }

  public void testFoldArray_singleString() {
    enableNormalize();
    fold("new Array('a');", "['a'];");
  }

  public void testFoldArray_singleArrayLit() {
    enableNormalize();
    fold("new Array([1,2]);", "[[1,2]];");
  }

  public void testFoldArray_singleOtherType_unsafe() {
    enableNormalize();
    // default case ของ isSafeToFoldArrayConstructor (เช่น NAME) -> NOT_SAFE_TO_FOLD
    fold("var x; new Array(x);", "var x; Array(x);");
  }

  public void testFoldLiteralConstructor_notNormalized() {
    disableNormalize();
    foldSame("Array(1,2);");
  }

  public void testFoldLiteralConstructor_targetNotName() {
    enableNormalize();
    // constructorNameNode ไม่ใช่ Token.NAME (เป็น GETPROP) -> skip
    foldSame("obj.Array(1,2);");
  }

  // ================= RegExp constructor folding =================

  public void testFoldRegExp_noFlags() {
    enableNormalize();
    fold("var x = new RegExp('abc');", "var x = /abc/;");
  }

  public void testFoldRegExp_withValidFlags_es5() {
    enableNormalize();
    // ES5 -> areSafeFlagsToFold true แม้มี 'g'
    fold("var x = new RegExp('abc','g');", "var x = /abc/g;");
  }

  public void testFoldRegExp_invalidFlags_reportsWarning() {
    enableNormalize();
    // ธง 'z' ไม่ผ่าน REGEXP_FLAGS_RE -> report warning, คืน CALL รูปแบบเดิม
    test("var x = new RegExp('abc','z');",
         "var x = RegExp('abc','z');",
         PeepholeSubstituteAlternateSyntax.INVALID_REGULAR_EXPRESSION_FLAGS);
  }

  public void testFoldRegExp_emptyPattern_notFolded() {
    enableNormalize();
    // pattern == "" -> ไม่ fold เป็น literal
    fold("var x = new RegExp('');", "var x = RegExp('');");
  }

  public void testFoldRegExp_tooManyArgs_notFolded() {
    enableNormalize();
    fold("var x = new RegExp('a','g','extra');",
         "var x = RegExp('a','g','extra');");
  }

  public void testFoldRegExp_patternTooLong_notFolded() {
    enableNormalize();
    StringBuilder longPattern = new StringBuilder();
    for (int i = 0; i < 100; i++) {
      longPattern.append('a');
    }
    String p = longPattern.toString();
    fold("var x = new RegExp('" + p + "');",
         "var x = RegExp('" + p + "');");
  }

  public void testFoldRegExp_patternNotString_notFolded() {
    enableNormalize();
    fold("var r; var x = new RegExp(r);",
         "var r; var x = RegExp(r);");
  }

  public void testFoldRegExp_flagsNotString_notFolded() {
    enableNormalize();
    fold("var f; var x = new RegExp('a', f);",
         "var f; var x = RegExp('a', f);");
  }

  // ---- makeForwardSlashBracketSafe branches ----

  public void testRegExpSlashEscape_unescapedSlash() {
    enableNormalize();
    fold("var x = new RegExp('a/b');", "var x = /a\\/b/;");
  }

  public void testRegExpSlashEscape_alreadyEscapedSlash() {
    enableNormalize();
    // content จริงคือ a\/b (backslash+slash) -> isEscaped == true ตอนพบ '/'
    fold("var x = new RegExp('a\\\\/b');", "var x = /a\\/b/;");
  }

  public void testRegExpSlashEscape_insideCharset() {
    enableNormalize();
    // '/' อยู่ใน [...] -> ไม่ escape
    fold("var x = new RegExp('[/]');", "var x = /[/]/;");
  }

  public void testRegExpSlashEscape_newlineEscaped() {
    enableNormalize();
    // content จริงคือ a<LF>b -> ถูกแปลงเป็น \n ใน literal
    fold("var x = new RegExp('a\\nb');", "var x = /a\\nb/;");
    // หมายเหตุ: กรณี \r, \u2028, \u2029 และ isEscaped+lineTerminator ร่วมกัน
    // ไม่ได้ทดสอบเพิ่มเติมในชุดนี้ (ครอบคลุมโครงสร้าง switch เดียวกัน)
  }

  // หมายเหตุ: containsUnicodeEscape() ขึ้นกับ CodeGenerator.regexpEscape ซึ่งไม่มีซอร์สให้
  // จึงไม่เขียนเทสยืนยันพฤติกรรมที่แน่ชัดของ branch นี้ (ตามข้อ 4)

  // ================= CALL: tryFoldSimpleFunctionCall =================

  public void testFoldStringCall_immutableLiteral() {
    fold("x = String(1);", "x = '' + 1;");
  }

  public void testFoldStringCall_nonImmutableValue() {
    foldSame("x = String(foo());");
  }

  public void testFoldStringCall_multipleArgs() {
    foldSame("x = String(1, 2);");
  }

  public void testFoldStringCall_noArgs() {
    foldSame("x = String();");
  }

  public void testFoldStringCall_wrongTargetName() {
    foldSame("x = NotString(1);");
  }

  // ================= CALL: tryFoldImmediateCallToBoundFunction =================

  public void testBoundFunctionCall_noBindDetected() {
    // bind == null (ไม่มี .bind ในรูปแบบที่ CodingConvention รู้จัก) -> ไม่เปลี่ยนแปลง
    foldSame("f();");
    // หมายเหตุ: กรณี bind != null (การ rewrite จริง) ไม่ได้ทดสอบ
    // เนื่องจากไม่มีซอร์สของ CodingConvention.describeFunctionBind ให้ตรวจสอบพฤติกรรม (ข้อ 4)
  }

  // ================= RETURN =================

  public void testReduceReturn_voidNoSideEffect() {
    fold("function f(){return void 0;}", "function f(){return;}");
  }

  public void testReduceReturn_voidWithSideEffect() {
    foldSame("function f(){return void foo();}");
  }

  public void testReduceReturn_undefinedName() {
    fold("function f(){return undefined;}", "function f(){return;}");
  }

  public void testReduceReturn_otherName() {
    foldSame("function f(){return x;}");
  }

  public void testReduceReturn_otherType() {
    foldSame("function f(){return 1;}");
  }

  public void testReduceReturn_noValue() {
    foldSame("function f(){return;}");
  }

  // ================= COMMA: trySplitComma =================

  public void testSplitComma_late_noSplit() {
    late = true;
    foldSame("1, 2;");
  }

  public void testSplitComma_notLate_exprResult() {
    late = false;
    fold("1, 2;", "1;2;");
  }

  public void testSplitComma_notLate_notExprResult() {
    late = false;
    foldSame("x = (1, 2);");
  }

  public void testSplitComma_notLate_underLabel() {
    late = false;
    foldSame("foo: 1, 2;");
  }

  // ================= NAME: tryReplaceUndefined =================

  public void testReplaceUndefined_normalized_rvalue() {
    enableNormalize();
    fold("var x = undefined;", "var x = void 0;");
  }

  public void testReplaceUndefined_notNormalized() {
    disableNormalize();
    foldSame("x = undefined;");
  }

  public void testReplaceUndefined_notUndefinedName() {
    enableNormalize();
    foldSame("x = y;");
  }

  public void testReplaceUndefined_isLValue() {
    enableNormalize();
    // หมายเหตุ: สมมติว่า undefined++ ถือเป็น LValue context ตาม NodeUtil.isLValue
    // (ไม่มีซอร์ส NodeUtil ให้ยืนยัน) -> คาดว่าไม่ fold
    foldSame("undefined++;");
  }

  // ================= ARRAYLIT: tryMinimizeArrayLiteral =================

  public void testMinimizeArrayLiteral_notAllStrings() {
    late = true;
    foldSame("x = ['a', 1, 'b'];");
  }

  public void testMinimizeArrayLiteral_allStrings_notLate() {
    late = false;
    foldSame("x = ['a','b','c','d','e','f'];");
  }

  public void testMinimizeArrayLiteral_allStrings_late_savingPositive() {
    late = true;
    fold("x = ['a','b','c','d','e','f'];", "x = 'abcdef'.split('');");
  }

  public void testMinimizeArrayLiteral_allStrings_late_savingNonPositive() {
    late = true;
    // numElements = 5 -> saving = 5*2-11 = -1 <= 0
    foldSame("x = ['a','b','c','d','e'];");
  }

  public void testMinimizeArrayLiteral_allStrings_late_noDelimiterFound() {
    late = true;
    // ทุก delimiter (" ", ";", ",", "{", "}") ถูกใช้ครบในสตริงต่าง ๆ -> pickDelimiter คืน null
    foldSame("x = ['a b','a;b','a,b','a{b','a}b','zz'];");
  }

  // ================= default branch =================

  public void testDefaultBranch_unhandledNodeType() {
    foldSame("x = 1;");
  }
}
```

## สรุปตาราง Test Method ↔ Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testReduceTrueFalse_late | `TRUE/FALSE` + `late==true` ใน reduceTrueFalse |
| testReduceTrueFalse_notLate | `TRUE/FALSE` + `late==false` |
| testFoldNewObject_normalized_noArgs | NEW→CALL (normalized, Object ใน set), Object ไม่มี args → literal `{}` |
| testFoldNewObject_normalized_withArgs | Object มี args → ไม่ fold literal |
| testFoldNewObject_notNormalized | `isASTNormalized()==false` ข้าม tryFoldStandardConstructors |
| testFoldNewCustomClass_normalized_notInSet | className ไม่อยู่ใน STANDARD_OBJECT_CONSTRUCTORS, `!node.isCall()` → return |
| testFoldNewError_normalized | Error ใน set แต่ไม่มี literal folding เฉพาะ |
| testFoldArray_noArgs | `arg==null` → SAFE_TO_FOLD_WITHOUT_ARGS |
| testFoldArray_multipleArgs | `arg.getNext()!=null` → SAFE_TO_FOLD_WITH_ARGS |
| testFoldArray_singleNumberZero | NUMBER==0 → SAFE_TO_FOLD_WITHOUT_ARGS |
| testFoldArray_singleNumberNonZero_unsafe | NUMBER!=0 → NOT_SAFE_TO_FOLD |
| testFoldArray_singleString | STRING case |
| testFoldArray_singleArrayLit | ARRAYLIT case |
| testFoldArray_singleOtherType_unsafe | default case (unsafe) |
| testFoldLiteralConstructor_notNormalized | `isASTNormalized()==false` ใน tryFoldLiteralConstructor |
| testFoldLiteralConstructor_targetNotName | `Token.NAME != type` |
| testFoldRegExp_noFlags / withValidFlags_es5 | fold สำเร็จ, `areSafeFlagsToFold` true (ES5) |
| testFoldRegExp_invalidFlags_reportsWarning | `areValidRegexpFlags==false` → report + return n |
| testFoldRegExp_emptyPattern_notFolded | pattern == "" |
| testFoldRegExp_tooManyArgs_notFolded | `flags.getNext()!=null` |
| testFoldRegExp_patternTooLong_notFolded | length >= 100 |
| testFoldRegExp_patternNotString_notFolded | `pattern.isString()==false` |
| testFoldRegExp_flagsNotString_notFolded | `flags.isString()==false` |
| testRegExpSlashEscape_* | switch-case ต่าง ๆ ใน makeForwardSlashBracketSafe (`/`, charset, newline, isEscaped) |
| testFoldStringCall_* | ทุกเงื่อนไขใน tryFoldSimpleFunctionCall (immutable/not, args count, target name) |
| testBoundFunctionCall_noBindDetected | `bind==null` ใน tryFoldImmediateCallToBoundFunction |
| testReduceReturn_* | ทุก case ของ switch ใน tryReduceReturn (VOID มี/ไม่มี side effect, NAME=undefined/อื่น, type อื่น, ไม่มีค่า) |
| testSplitComma_* | `late` guard, `parent.isExprResult()`, `isLabel()` |
| testReplaceUndefined_* | `isASTNormalized`, `isUndefined`, `isLValue` |
| testMinimizeArrayLiteral_* | allStrings true/false, late true/false, saving >0/<=0, pickDelimiter null/non-null |
| testDefaultBranch_unhandledNodeType | default case ของ switch หลักใน optimizeSubtree |

**ข้อจำกัดที่ยอมรับ (ตามข้อ 4):** ไม่ได้ทดสอบกรณี `bind != null` (การ rewrite จริงของ `.bind()`) และ branch `containsUnicodeEscape`/`isEcmaScript5OrGreater()==false` แบบเจาะจง เนื่องจากไม่มีซอร์สของ `CodingConvention`, `NodeUtil`, และ `CodeGenerator.regexpEscape` ให้ยืนยันพฤติกรรมที่แน่ชัด