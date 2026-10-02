# วิเคราะห์และแนวทางการทดสอบ

**ข้อสังเกตสำคัญ:**
- `CodeGenerator` เป็น **package-private class** (`class CodeGenerator`) ดังนั้นไฟล์ทดสอบต้องอยู่ใน package `com.google.javascript.jscomp` เดียวกัน — จึง **ไม่มี import statement สำหรับ `CodeGenerator`** (ไม่สามารถ import class ที่ไม่ public จากอีก package ได้ และไม่จำเป็นเพราะอยู่ package เดียวกัน)
- เมธอด `isSimpleNumber`, `getSimpleNumber`, `identifierEscape` เป็น static method ที่ไม่ผูกกับ `Node`/`CodeConsumer` เลย → ทดสอบได้ตรงไปตรงมาและมั่นใจสูงสุด (deterministic 100% จาก source ที่ให้มา)
- สำหรับ branch ที่อยู่ใน `add(Node, Context)` (switch ยักษ์) ผมเลือกทดสอบผ่าน **pipeline การ parse+print จริง** ของโปรเจกต์ (`Compiler.parseTestCode` + `CodePrinter.Builder`) เพราะการสร้าง `Node` เองหรือ mock `CodeConsumer` เอง มีความเสี่ยงสูงที่จะ “เดา” signature ของ method ภายใน (`cc.addOp`, `cc.beginBlock` ฯลฯ) ที่ไม่มีอยู่ในซอร์สที่ให้มา — ผมจึง **คอมเมนต์กำกับชัดเจน** ว่าส่วนนี้อิงกับ public API มาตรฐานของโปรเจกต์ (ไม่ได้แสดงในซอร์สที่ให้มา) และใช้ assertion แบบ `contains(...)` ในกรณีที่การจัด format (เช่น เครื่องหมาย `;` ก่อน `}`) ไม่สามารถยืนยันได้ 100% จากซอร์สที่ให้มา เพื่อลด false-fail แต่ยังคงตรวจจับ fault สำคัญ (คำสำคัญหาย, โครงสร้างผิด) ได้

```java
package com.google.javascript.jscomp;

// หมายเหตุ: CodeGenerator เป็น package-private class จึงต้องวางไฟล์ทดสอบนี้ไว้ใน
// package เดียวกัน (com.google.javascript.jscomp) และไม่สามารถ/ไม่จำเป็นต้อง import
// CodeGenerator ข้าม package ได้ - เข้าถึงได้โดยตรงเพราะอยู่ package เดียวกัน

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

import com.google.javascript.jscomp.CompilerOptions.LanguageMode;
import com.google.javascript.rhino.Node;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test สำหรับ CodeGenerator (Defects4J Closure-173b)
 *
 * หมายเหตุสำคัญเกี่ยวกับสมมติฐาน (assumption) ที่ไม่ได้แสดงอยู่ในซอร์สโค้ดที่ให้มาโดยตรง
 * แต่จำเป็นต่อการเขียนเทสให้ compile/run ได้:
 *  1) Compiler#parseTestCode(String) - เมธอดช่วย parse โค้ดสำหรับการทดสอบภายใน package นี้
 *  2) CodePrinter.Builder(Node).setCompilerOptions(...).setPrettyPrint(false).setLineBreak(false).build()
 *     - API มาตรฐานของ CodePrinter ที่ภายในจะสร้าง CodeConsumer และเรียก CodeGenerator.add(Node)
 *     เพื่อสร้างสตริงผลลัพธ์ (นี่คือกลไกที่ใช้เรียก CodeGenerator จริง)
 *  3) CompilerOptions#setLanguageIn / #setLanguageOut - API มาตรฐานของ CompilerOptions
 *  4) ค่า default ของ CompilerOptions: trustedStrings, outputCharset(null),
 *     preferSingleQuotes(false) - อ้างอิงจาก constructor ของ CodeGenerator ที่รับ CompilerOptions
 *  5) NodeUtil.isLatin(...) (ใช้ใน identifierEscape) ไม่มี source ให้ - ทดสอบเฉพาะกรณีที่มั่นใจสูง
 *     (ASCII ธรรมดา) เท่านั้น เพื่อไม่ "เดา" behavior ที่ไม่มีหลักฐาน
 */
public class CodeGeneratorTest {

  private CompilerOptions options;

  @Before
  public void setUp() {
    options = new CompilerOptions();
    options.setLanguageIn(LanguageMode.ECMASCRIPT5);
  }

  // ---------- Helper ----------

  private String print(String js) {
    return print(js, options);
  }

  private String print(String js, CompilerOptions opts) {
    Compiler compiler = new Compiler();
    Node root = compiler.parseTestCode(js);
    return new CodePrinter.Builder(root)
        .setCompilerOptions(opts)
        .setPrettyPrint(false)
        .setLineBreak(false)
        .build();
  }

  private void assertPrint(String js, String expected) {
    assertEquals("JS: " + js, expected, print(js));
  }

  private void assertPrintContains(String js, String... expectedSubstrings) {
    String out = print(js);
    for (String s : expectedSubstrings) {
      assertTrue("Expected output to contain [" + s + "] but was: " + out,
          out.contains(s));
    }
  }

  // =====================================================================
  // 1. ทดสอบ static helper method โดยตรง (ไม่ผ่าน Node/Compiler) - มั่นใจสูงสุด
  // =====================================================================

  @Test
  public void testIsSimpleNumber_EmptyString() {
    assertFalse(CodeGenerator.isSimpleNumber(""));
  }

  @Test
  public void testIsSimpleNumber_SingleZero() {
    assertTrue(CodeGenerator.isSimpleNumber("0"));
  }

  @Test
  public void testIsSimpleNumber_LeadingZeroMultiDigit() {
    // len != 1 && charAt(0) == '0' -> false
    assertFalse(CodeGenerator.isSimpleNumber("00"));
    assertFalse(CodeGenerator.isSimpleNumber("007"));
  }

  @Test
  public void testIsSimpleNumber_ValidMultiDigit() {
    assertTrue(CodeGenerator.isSimpleNumber("12345"));
  }

  @Test
  public void testIsSimpleNumber_NonDigitChar() {
    assertFalse(CodeGenerator.isSimpleNumber("12a45"));
    assertFalse(CodeGenerator.isSimpleNumber("-5"));
  }

  @Test
  public void testGetSimpleNumber_Valid() {
    assertEquals(0.0, CodeGenerator.getSimpleNumber("0"), 0.0);
    assertEquals(42.0, CodeGenerator.getSimpleNumber("42"), 0.0);
  }

  @Test
  public void testGetSimpleNumber_InvalidReturnsNaN() {
    assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("")));
    assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("007")));
    assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("abc")));
  }

  @Test
  public void testGetSimpleNumber_OverflowReturnsNaN() {
    // ยาวเกิน long -> NumberFormatException ถูก catch -> NaN (branch ของ catch)
    assertTrue(Double.isNaN(
        CodeGenerator.getSimpleNumber("99999999999999999999999999999999999999")));
  }

  @Test
  public void testIdentifierEscape_PlainAscii() {
    // สมมติฐาน: NodeUtil.isLatin(...) คืนค่า true สำหรับสตริง ASCII ธรรมดา
    // (ไม่มี source ของ NodeUtil ให้ยืนยัน แต่เป็นกรณีที่มีความเสี่ยงต่ำที่สุด)
    assertEquals("abc123", CodeGenerator.identifierEscape("abc123"));
  }

  // =====================================================================
  // 2. VAR / Binary operator branches
  // =====================================================================

  @Test
  public void testVarSingleDeclaration() {
    assertPrint("var x;", "var x;");
  }

  @Test
  public void testVarMultipleDeclarations() {
    assertPrint("var x=1,y=2;", "var x=1,y=2;");
  }

  @Test
  public void testBinaryAssociativeMergesParens() {
    // last.getType()==type && NodeUtil.isAssociative(ADD) -> true : parens ถูกลดออก
    assertPrint("1+(2+3);", "1+2+3;");
  }

  @Test
  public void testBinaryNonAssociativeKeepsParens() {
    // SUB ไม่ associative -> ต้องคง parens ไว้ (ผ่าน addExpr ที่ precedence ไม่พอ)
    assertPrint("1-(2-3);", "1-(2-3);");
  }

  @Test
  public void testAssignmentRightAssociative() {
    // isAssignmentOp(n) && isAssignmentOp(last) branch
    assertPrint("a=b=c;", "a=b=c;");
  }

  @Test
  public void testGeneralBinaryUnroll() {
    // else -> unrollBinaryOperator
    assertPrint("1+2+3;", "1+2+3;");
  }

  @Test
  public void testCommaExpression() {
    assertPrint("a,b;", "a,b;");
  }

  // =====================================================================
  // 3. Unary operator branches
  // =====================================================================

  @Test
  public void testUnaryOperators() {
    assertPrint("typeof a;", "typeof a;");
    assertPrint("void a;", "void a;");
    assertPrint("!a;", "!a;");
    assertPrint("~a;", "~a;");
    assertPrint("+a;", "+a;");
  }

  @Test
  public void testNegNumberLiteral() {
    // NEG + first.isNumber() -> cc.addNumber(-d)
    assertPrint("-1;", "-1;");
  }

  @Test
  public void testNegNonNumber() {
    // NEG + else -> cc.addOp + addExpr
    assertPrint("-a;", "-a;");
  }

  @Test
  public void testIncDecPrefixPostfix() {
    assertPrint("a++;", "a++;");   // postProp != 0
    assertPrint("++a;", "++a;");   // postProp == 0
    assertPrint("a--;", "a--;");
    assertPrint("--a;", "--a;");
  }

  @Test
  public void testHookTernary() {
    assertPrint("a?b:c;", "a?b:c;");
  }

  // =====================================================================
  // 4. REGEXP
  // =====================================================================

  @Test
  public void testRegexpNoFlags() {
    assertPrint("/abc/;", "/abc/;"); // childCount == 1 branch
  }

  @Test
  public void testRegexpWithFlags() {
    assertPrint("/abc/gi;", "/abc/gi;"); // childCount == 2 branch
  }

  // =====================================================================
  // 5. ARRAYLIT (addArrayList + lastWasEmpty)
  // =====================================================================

  @Test
  public void testArrayLiteralLeadingHole() {
    assertPrint("[,1];", "[,1];");
  }

  @Test
  public void testArrayLiteralTrailingHole() {
    // lastWasEmpty == true -> extra listSeparator ถูกเติม
    assertPrint("[1,,];", "[1,,];");
  }

  // =====================================================================
  // 6. GETPROP / GETELEM
  // =====================================================================

  @Test
  public void testGetPropRequiresParensForNumberBase() {
    assertPrint("(1).foo;", "(1).foo;");
  }

  @Test
  public void testGetPropNormal() {
    assertPrint("a.b;", "a.b;");
  }

  @Test
  public void testGetPropEcmascript3KeywordUsesBracket() {
    CompilerOptions es3 = new CompilerOptions();
    es3.setLanguageIn(LanguageMode.ECMASCRIPT5);
    es3.setLanguageOut(LanguageMode.ECMASCRIPT3);
    assertEquals("a[\"class\"];", print("a.class;", es3));
  }

  @Test
  public void testGetPropEcmascript5KeywordUsesDot() {
    // languageMode != ECMASCRIPT3 -> ใช้ '.' ตามปกติ
    assertPrint("a.class;", "a.class;");
  }

  @Test
  public void testGetElem() {
    assertPrint("a[b];", "a[b];");
  }

  // =====================================================================
  // 7. NEW
  // =====================================================================

  @Test
  public void testNewWithArgs() {
    assertPrint("new Foo(1,2);", "new Foo(1,2);");
  }

  @Test
  public void testNewWithoutArgs() {
    // '()' ถูกละเมื่อไม่มี arguments
    assertPrint("new Foo();", "new Foo;");
  }

  @Test
  public void testNewForcesParensWhenCalleeContainsCall() {
    // NodeUtil.containsType(first, CALL, ...) -> เพิ่ม precedence เพื่อบีบให้เกิด parens
    assertPrint("new (foo());", "new (foo());");
  }

  // =====================================================================
  // 8. IF / dangling-else / empty body
  // =====================================================================

  @Test
  public void testIfWithoutElse() {
    assertPrint("if(a)b();", "if(a)b();");
  }

  @Test
  public void testIfWithElse() {
    assertPrint("if(a)b();else c();", "if(a)b();else c();");
  }

  @Test
  public void testEmptyIfBody() {
    // getNonEmptyChildCount == 0 -> cc.endStatement(true)
    assertPrint("if(a);", "if(a);");
  }

  // =====================================================================
  // 9. Loop statements
  // =====================================================================

  @Test
  public void testWhileLoop() {
    assertPrint("while(1)x++;", "while(1)x++;");
  }

  @Test
  public void testDoWhileLoop() {
    assertPrint("do x++;while(1);", "do x++;while(1);");
  }

  @Test
  public void testForClassic() {
    // childCount == 4 branch
    assertPrint("for(i=0;i<10;i++)x++;", "for(i=0;i<10;i++)x++;");
  }

  @Test
  public void testForIn() {
    // childCount == 3 branch
    assertPrint("for(var i in obj)x++;", "for(var i in obj)x++;");
  }

  @Test
  public void testWithStatement() {
    assertPrintContains("with(a)b();", "with(a)", "b()");
  }

  // =====================================================================
  // 10. TRY / CATCH / FINALLY
  // =====================================================================

  @Test
  public void testTryCatchNoFinally() {
    assertPrintContains("try{a()}catch(e){b()}", "try{", "a()", "catch(e)", "b()");
    assertFalse(print("try{a()}catch(e){b()}").contains("finally"));
  }

  @Test
  public void testTryCatchFinally() {
    assertPrintContains("try{a()}catch(e){b()}finally{c()}",
        "try{", "a()", "catch(e)", "b()", "finally", "c()");
  }

  @Test
  public void testTryFinallyNoCatch() {
    assertPrintContains("try{a()}finally{c()}", "try{", "a()", "finally", "c()");
    assertFalse(print("try{a()}finally{c()}").contains("catch"));
  }

  @Test
  public void testThrowStatement() {
    assertPrint("throw a;", "throw a;");
  }

  // =====================================================================
  // 11. CONTINUE / BREAK / DEBUGGER / DELETE
  // =====================================================================

  @Test
  public void testContinuePlain() {
    assertPrintContains("while(1){continue}", "continue");
  }

  @Test
  public void testContinueLabeled() {
    assertPrintContains("a:while(1){continue a}", "continue a");
  }

  @Test
  public void testBreakPlain() {
    assertPrintContains("while(1){break}", "break");
  }

  @Test
  public void testDebuggerStatement() {
    assertPrint("debugger;", "debugger;");
  }

  @Test
  public void testDeleteProperty() {
    assertPrint("delete a.b;", "delete a.b;");
  }

  // =====================================================================
  // 12. Literal tokens: NULL / THIS / TRUE / FALSE
  // =====================================================================

  @Test
  public void testLiteralsNullThisTrueFalse() {
    assertPrint("null;", "null;");
    assertPrint("this;", "this;");
    assertPrint("true;", "true;");
    assertPrint("false;", "false;");
  }

  // =====================================================================
  // 13. FUNCTION
  // =====================================================================

  @Test
  public void testFunctionDeclaration() {
    assertPrint("function foo(){}", "function foo(){}");
  }

  @Test
  public void testFunctionExpressionNeedsParensAsIIFE() {
    // context == START_OF_EXPR -> funcNeedsParens == true
    assertPrint("(function(){})();", "(function(){})();");
  }

  // =====================================================================
  // 14. OBJECTLIT / GETTER_DEF / SETTER_DEF
  // =====================================================================

  @Test
  public void testObjectLiteralIdentifierKey() {
    assertPrint("var x={a:1};", "var x={a:1};");
  }

  @Test
  public void testObjectLiteralQuotedNonIdentifierKey() {
    assertPrint("var x={'a-b':1};", "var x={\"a-b\":1};");
  }

  @Test
  public void testObjectLiteralNumericKey() {
    // getSimpleNumber branch
    assertPrint("var x={1:1};", "var x={1:1};");
  }

  @Test
  public void testObjectLiteralGetter() {
    assertPrintContains("var x={get a(){return 1}};", "get a(", "return 1");
  }

  @Test
  public void testObjectLiteralSetter() {
    assertPrintContains("var x={set a(v){}};", "set a(v)");
  }

  // =====================================================================
  // 15. SWITCH / CASE / DEFAULT_CASE
  // =====================================================================

  @Test
  public void testSwitchCaseDefault() {
    assertPrintContains("switch(a){case 1:b();break;default:c()}",
        "switch(a)", "case 1:", "b()", "break", "default:", "c()");
  }

  // =====================================================================
  // 16. LABEL
  // =====================================================================

  @Test
  public void testLabelStatement() {
    assertPrint("foo:a();", "foo:a();");
  }

  // =====================================================================
  // 17. String escaping (jsString / strEscape)
  // =====================================================================

  @Test
  public void testStringLiteralPrefersSingleQuoteWhenMoreDoubles() {
    // singleq(0) < doubleq(1) -> ใช้ single quote รอบสตริง
    assertPrint("'a\"b';", "'a\"b';");
  }

  @Test
  public void testStringLiteralPrefersDoubleQuoteWhenMoreSingles() {
    // singleq(1) < doubleq(0) เป็น false -> ใช้ double quote (escape single ปกติ)
    assertPrint("\"a'b\";", "\"a'b\";");
  }

  @Test
  public void testStringLiteralEscapesNewline() {
    assertPrint("\"a\\nb\";", "\"a\\nb\";");
  }

  @Test
  public void testStringLiteralEscapesScriptCloseTag() {
    // '<' ตามด้วย "/script" -> ถูก escape เป็น LT_ESCAPED เสมอ
    // ไม่ว่า trustedStrings จะเป็น true/false ก็ตาม (ผลลัพธ์เดียวกันทั้งสองกรณี)
    assertPrint("\"a</script>b\";", "\"a\\x3c/script>b\";");
  }

  // =====================================================================
  // 18. Smoke test: ตรวจว่า factory method ไม่ throw
  // =====================================================================

  @Test
  public void testForCostEstimationFactoryDoesNotThrow() {
    // ไม่สามารถ mock CodeConsumer ได้อย่างมั่นใจ (ไม่มี source ของ CodeConsumer)
    // จึงทดสอบเพียงว่าเรียก factory method ด้วย null-safe consumer แล้วได้ instance ไม่ null
    // (CodeConsumer เป็น abstract class ที่ไม่มี source ให้ในที่นี้ - จึงไม่ทดสอบ behavior เพิ่มเติม)
    assertNotNull(CodeGenerator.forCostEstimation(null) != null
        ? CodeGenerator.forCostEstimation(null) : null);
  }
}
```

## ตารางสรุปการครอบคลุม Branch/Condition

| กลุ่มเมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testIsSimpleNumber_*` | `isSimpleNumber`: len==0, leading-zero multi-digit, digit ปกติ, non-digit char |
| `testGetSimpleNumber_*` | `getSimpleNumber`: ค่าปกติ, NaN จาก isSimpleNumber=false, NaN จาก `NumberFormatException` (catch) |
| `testIdentifierEscape_PlainAscii` | `identifierEscape`: branch `isLatin==true` (คืนค่าเดิม) |
| `testVar*` | `Token.VAR`: first!=null, `addList` หลายตัว |
| `testBinary*`, `testAssignmentRightAssociative`, `testGeneralBinaryUnroll`, `testCommaExpression` | binary operator top branch: `last.getType()==type && isAssociative`, `isAssignmentOp` right-assoc, else→`unrollBinaryOperator`, `Token.COMMA` |
| `testUnaryOperators`, `testNeg*` | `TYPEOF/VOID/NOT/BITNOT/POS`, `NEG` (number vs non-number) |
| `testIncDecPrefixPostfix` | `INC/DEC`: `postProp!=0` vs `postProp==0` |
| `testHookTernary` | `Token.HOOK` |
| `testRegexp*` | `Token.REGEXP`: childCount==1 vs 2 |
| `testArrayLiteral*` | `addArrayList`: hole กลาง/หลัง, `lastWasEmpty` |
| `testGetProp*`, `testGetElem` | `GETPROP` needsParens, ES3-keyword bracket vs dot, `GETELEM` |
| `testNew*` | `NEW`: มี/ไม่มี args, `containsType(CALL)` force parens |
| `testIf*` | `IF`: hasElse true/false, `ambiguousElseClause`(ผ่าน empty-body count==0) |
| `testWhileLoop`, `testDoWhileLoop`, `testForClassic`, `testForIn`, `testWithStatement` | `WHILE`, `DO`, `FOR` (childCount 4 และ 3), `WITH`, `addNonEmptyStatement` unwrap count==1 |
| `testTry*` | `TRY`: childCount 2/3, catchblock null/non-null |
| `testContinue*`, `testBreakPlain`, `testDebuggerStatement`, `testDeleteProperty` | `CONTINUE/BREAK` with/without label, `DEBUGGER`, `DELPROP` |
| `testLiteralsNullThisTrueFalse` | `NULL/THIS/TRUE/FALSE` |
| `testFunctionDeclaration`, `testFunctionExpressionNeedsParensAsIIFE` | `FUNCTION`: `funcNeedsParens` true/false |
| `testObjectLiteral*` | `OBJECTLIT`: identifier key, quoted key, numeric key, `GETTER_DEF/SETTER_DEF` |
| `testSwitchCaseDefault` | `SWITCH/CASE/DEFAULT_CASE` |
| `testLabelStatement` | `LABEL` |
| `testStringLiteral*` | `jsString/strEscape`: เลือก quote (single/double), escape `\n`, escape `<`+`/script` |
| `testForCostEstimationFactoryDoesNotThrow` | smoke test ของ `forCostEstimation` (ไม่ทดสอบ behavior ภายในเพราะไม่มี source ของ `CodeConsumer`) |

**ข้อจำกัดที่ยอมรับ (ตามข้อกำหนดห้ามเดา):** ไม่ได้ทดสอบ `CAST`, indirect-`eval` CALL branch, และ behavior ละเอียดของ `CodeConsumer` (เช่น `shouldPreserveExtraBlocks`, `breakAfterBlockFor` ที่ทำให้เกิดการห่อ block พิเศษ) เนื่องจากไม่มีซอร์สของ `CodeConsumer`/`NodeUtil` ให้ยืนยัน exact behavior จึงเลี่ยงการเขียน assertion ที่เป็นการเดา