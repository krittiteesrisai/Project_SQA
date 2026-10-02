package com.google.javascript.jscomp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.google.javascript.rhino.Node;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/**
 * Unit tests for {@link CodeGenerator} (Defects4J Closure-34b).
 *
 * ส่วนที่ทดสอบเมธอด static/pure ทดสอบตรงไม่ผ่าน AST (มั่นใจสูง)
 * ส่วนที่ทดสอบ add(Node, Context) ใช้ Compiler.parseTestCode + CodePrinter.Builder
 * (รูปแบบมาตรฐานที่ใช้ทดสอบ CodeGenerator ใน Closure Compiler จริง)
 */
public class CodeGeneratorTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
  }

  private Node parseRoot(String js) {
    Node n = compiler.parseTestCode(js);
    assertEquals("Unexpected parse errors for: " + js,
        0, compiler.getErrors().length);
    return n;
  }

  private String toSource(Node n) {
    return new CodePrinter.Builder(n).setPrettyPrint(false).build();
  }

  private String parsePrint(String js) {
    return toSource(parseRoot(js));
  }

  // =========================================================================
  // 1. isSimpleNumber(String) - boundary / malformed
  // =========================================================================

  @Test
  public void testIsSimpleNumber_valid() {
    assertTrue(CodeGenerator.isSimpleNumber("123"));
  }

  @Test
  public void testIsSimpleNumber_leadingZeroMultiDigit() {
    assertFalse(CodeGenerator.isSimpleNumber("0123"));
  }

  @Test
  public void testIsSimpleNumber_singleZero() {
    // Boundary: charAt(0) == '0' -> false
    assertFalse(CodeGenerator.isSimpleNumber("0"));
  }

  @Test
  public void testIsSimpleNumber_empty() {
    // Boundary: len == 0
    assertFalse(CodeGenerator.isSimpleNumber(""));
  }

  @Test
  public void testIsSimpleNumber_nonDigitChar() {
    assertFalse(CodeGenerator.isSimpleNumber("12a3"));
  }

  // =========================================================================
  // 2. getSimpleNumber(String) - boundary / malformed / exception path
  // =========================================================================

  @Test
  public void testGetSimpleNumber_valid() {
    assertEquals(123.0, CodeGenerator.getSimpleNumber("123"), 0.0);
  }

  @Test
  public void testGetSimpleNumber_notSimpleReturnsNaN() {
    assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("0123")));
  }

  @Test
  public void testGetSimpleNumber_tooManyDigitsCausesNumberFormatException() {
    // 25-digit number overflows long -> caught NumberFormatException -> NaN
    String big = "9999999999999999999999999";
    assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber(big)));
  }

  @Test
  public void testGetSimpleNumber_exceedsMaxPositiveIntegerButFitsInLong() {
    // Assumption: NodeUtil.MAX_POSITIVE_INTEGER_NUMBER == 2^53 (9007199254740992)
    // ไม่แน่ใจ 100% ในค่าคงที่นี้ (ไม่มีซอร์สของ NodeUtil ให้) — คอมเมนต์กำกับตามข้อ 4
    String justOver = "9007199254740993";
    assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber(justOver)));
  }

  // =========================================================================
  // 3. identifierEscape(String)
  // =========================================================================

  @Test
  public void testIdentifierEscape_latinPassThrough() {
    assertEquals("abc123", CodeGenerator.identifierEscape("abc123"));
  }

  @Test
  public void testIdentifierEscape_nonLatinAndControlChar() {
    // ใส่ตัวอักษรที่ไม่เป็น latin (é) เพื่อบังคับให้ NodeUtil.isLatin คืน false
    // แล้ว loop จะประมวลผลทุกตัวอักษร รวมถึง control char (0x01) และ 'a' ปกติ
    String input = "a\u0001\u00e9";
    String out = CodeGenerator.identifierEscape(input);
    assertTrue(out.contains("a"));
    assertTrue(out.contains("\\u0001"));
    assertTrue(out.contains("\\u00e9"));
  }

  // =========================================================================
  // 4. escapeToDoubleQuotedJsString(String) -> strEscape (null encoder, useSlashV=false)
  // =========================================================================

  @Test
  public void testEscapeToDoubleQuotedJsString_basicQuotes() {
    String out = CodeGenerator.escapeToDoubleQuotedJsString("a\"b'c");
    assertTrue(out.contains("\\\"")); // double quote escaped
    assertTrue(out.contains("'"));    // single quote NOT escaped
    assertTrue(out.startsWith("\""));
    assertTrue(out.endsWith("\""));
  }

  @Test
  public void testEscape_nullChar() {
    assertTrue(CodeGenerator.escapeToDoubleQuotedJsString("\0").contains("\\x00"));
  }

  @Test
  public void testEscape_verticalTab_noSlashV() {
    // useSlashV=false ในเมธอดนี้เสมอ -> ต้องได้ \x0B ไม่ใช่ \v
    String out = CodeGenerator.escapeToDoubleQuotedJsString("\u000B");
    assertTrue(out.contains("\\x0B"));
    assertFalse(out.contains("\\v"));
  }

  @Test
  public void testEscape_newlineCarriageReturnTab() {
    assertTrue(CodeGenerator.escapeToDoubleQuotedJsString("\n").contains("\\n"));
    assertTrue(CodeGenerator.escapeToDoubleQuotedJsString("\r").contains("\\r"));
    assertTrue(CodeGenerator.escapeToDoubleQuotedJsString("\t").contains("\\t"));
  }

  @Test
  public void testEscape_backslash() {
    assertTrue(CodeGenerator.escapeToDoubleQuotedJsString("\\").contains("\\\\"));
  }

  @Test
  public void testEscape_greaterThan_afterDoubleDash() {
    String out = CodeGenerator.escapeToDoubleQuotedJsString("a-->b");
    assertTrue(out.contains("--\\>b"));
  }

  @Test
  public void testEscape_greaterThan_afterDoubleCloseBracket() {
    String out = CodeGenerator.escapeToDoubleQuotedJsString("]]>x");
    assertTrue(out.contains("]]\\>x"));
  }

  @Test
  public void testEscape_greaterThan_plain() {
    String out = CodeGenerator.escapeToDoubleQuotedJsString("a>b");
    assertTrue(out.contains("a>b"));
    assertFalse(out.contains("\\>"));
  }

  @Test
  public void testEscape_lessThan_endScript() {
    String out = CodeGenerator.escapeToDoubleQuotedJsString("</script>");
    assertTrue(out.contains("<\\/script>"));
  }

  @Test
  public void testEscape_lessThan_commentStart() {
    String out = CodeGenerator.escapeToDoubleQuotedJsString("<!--x");
    assertTrue(out.contains("<\\!--x"));
  }

  @Test
  public void testEscape_lessThan_plain() {
    String out = CodeGenerator.escapeToDoubleQuotedJsString("a<b");
    assertTrue(out.contains("a<b"));
    assertFalse(out.contains("<\\"));
  }

  @Test
  public void testEscape_defaultBranch_boundaryChars_nullEncoder() {
    // 0x1F: c > 0x1f เป็น false -> ต้อง escape
    assertTrue(CodeGenerator.escapeToDoubleQuotedJsString("\u001F").contains("\\u001f"));
    // 0x20 (space): อยู่ในช่วง -> pass through
    assertEquals("\" \"", CodeGenerator.escapeToDoubleQuotedJsString(" "));
    // 0x7E (~): อยู่ในช่วง -> pass through
    assertTrue(CodeGenerator.escapeToDoubleQuotedJsString("~").contains("~"));
    // 0x7F (DEL): c < 0x7f เป็น false -> ต้อง escape
    assertTrue(CodeGenerator.escapeToDoubleQuotedJsString("\u007F").contains("\\u007f"));
  }

  @Test
  public void testEscape_nonAsciiUnicode_nullEncoder() {
    String out = CodeGenerator.escapeToDoubleQuotedJsString("caf\u00e9");
    assertTrue(out.contains("caf"));
    assertTrue(out.contains("\\u00e9"));
  }

  // =========================================================================
  // 5. regexpEscape(String) / regexpEscape(String, CharsetEncoder)
  // =========================================================================

  @Test
  public void testRegexpEscape_basicSlashes() {
    String out = CodeGenerator.regexpEscape("abc");
    assertEquals("/abc/", out);
  }

  @Test
  public void testRegexpEscape_backslashKeptSingle() {
    // backslashEscape ของ regexpEscape คือ "\\" (single backslash) ไม่ใช่ double
    String out = CodeGenerator.regexpEscape("a\\d");
    assertEquals("/a\\d/", out);
  }

  @Test
  public void testRegexpEscape_quotesNotEscaped() {
    String out = CodeGenerator.regexpEscape("a\"b'c");
    // doublequoteEscape/singlequoteEscape ของ regexp คือตัวอักษรเปล่า (ไม่ escape)
    assertEquals("/a\"b'c/", out);
  }

  @Test
  public void testRegexpEscape_withEncoder_canEncode() {
    CharsetEncoder ascii = Charset.forName("US-ASCII").newEncoder();
    String out = CodeGenerator.regexpEscape("cat", ascii);
    assertEquals("/cat/", out);
  }

  @Test
  public void testRegexpEscape_withEncoder_cannotEncode() {
    CharsetEncoder ascii = Charset.forName("US-ASCII").newEncoder();
    String out = CodeGenerator.regexpEscape("caf\u00e9", ascii);
    assertTrue(out.startsWith("/"));
    assertTrue(out.endsWith("/"));
    assertTrue(out.contains("caf"));
    assertTrue(out.contains("\\u00e9"));
  }

  // =========================================================================
  // 6. add(Node, Context) - binary operator branches
  // =========================================================================

  @Test
  public void testBinary_associativeAdditionNoExtraParens() {
    String out = parsePrint("x=1+2+3;");
    assertTrue(out.contains("1+2+3"));
    assertFalse(out.contains("(1+2)"));
    assertFalse(out.contains("(2+3)"));
  }

  @Test
  public void testBinary_nonAssociativeSubtractionKeepsParens() {
    String out = parsePrint("x=1-(2-3);");
    assertTrue(out.contains("1-(2-3)"));
  }

  @Test
  public void testBinary_assignmentRightAssociative() {
    String out = parsePrint("x=y=z;");
    assertTrue(out.contains("x=y=z"));
    assertFalse(out.contains("("));
  }

  @Test
  public void testBinary_relationalOperator() {
    String out = parsePrint("x=(1<2);");
    assertTrue(out.contains("1<2"));
  }

  @Test
  public void testBinary_compoundAssignmentOp() {
    String out = parsePrint("x+=1;");
    assertTrue(out.contains("x+=1"));
  }

  // =========================================================================
  // 7. TRY / CATCH / FINALLY
  // =========================================================================

  @Test
  public void testTryCatchFinally() {
    String out = parsePrint("try{a();}catch(e){b();}finally{c();}");
    assertTrue(out.contains("catch(e)"));
    assertTrue(out.contains("finally"));
  }

  @Test
  public void testTryCatchNoFinally() {
    String out = parsePrint("try{a();}catch(e){b();}");
    assertTrue(out.contains("catch(e)"));
    assertFalse(out.contains("finally"));
  }

  @Test
  public void testTryFinallyNoCatch() {
    String out = parsePrint("try{a();}finally{b();}");
    assertFalse(out.contains("catch"));
    assertTrue(out.contains("finally"));
  }

  // =========================================================================
  // 8. THROW / RETURN
  // =========================================================================

  @Test
  public void testThrowStatement() {
    assertTrue(parsePrint("throw a;").contains("throw"));
  }

  @Test
  public void testReturnWithValue() {
    String out = parsePrint("function f(){return 1;}");
    assertTrue(out.contains("return"));
    assertTrue(out.contains("1"));
  }

  @Test
  public void testReturnNoValue() {
    String out = parsePrint("function f(){return;}");
    assertTrue(out.contains("return"));
  }

  // =========================================================================
  // 9. VAR / NAME
  // =========================================================================

  @Test
  public void testVarMultipleDeclarators() {
    String out = parsePrint("var a,b=2;");
    assertTrue(out.contains("var a"));
    assertTrue(out.contains("b=2"));
  }

  @Test
  public void testNameCommaInitializer() {
    String out = parsePrint("var a=(b,c);");
    assertTrue(out.contains("b,c"));
  }

  // =========================================================================
  // 10. ARRAYLIT / PARAM_LIST
  // =========================================================================

  @Test
  public void testArrayLiteralWithInternalHole() {
    String out = parsePrint("x=[1,,3];");
    assertTrue(out.contains("[1,,3]"));
  }

  @Test
  public void testFunctionParamList() {
    String out = parsePrint("function f(a,b,c){}");
    assertTrue(out.contains("f(a,b,c)"));
  }

  // =========================================================================
  // 11. NUMBER / unary operators / NEG
  // =========================================================================

  @Test
  public void testUnaryOperators() {
    String out = parsePrint("x=typeof a;y=void b;z=!c;w=~d;v=+e;");
    assertTrue(out.contains("typeof a"));
    assertTrue(out.contains("void b"));
    assertTrue(out.contains("!c"));
    assertTrue(out.contains("~d"));
    assertTrue(out.contains("+e"));
  }

  @Test
  public void testNegOfNumberLiteral() {
    // NEG ของ NUMBER -> พิมพ์ค่าลบตรง ๆ ผ่าน cc.addNumber(-d)
    String out = parsePrint("x=-2;");
    assertTrue(out.contains("-2"));
  }

  @Test
  public void testNegOfNonNumber() {
    String out = parsePrint("x=-a;");
    assertTrue(out.contains("-a"));
  }

  // =========================================================================
  // 12. HOOK (ternary)
  // =========================================================================

  @Test
  public void testTernaryHook() {
    assertTrue(parsePrint("x=a?b:c;").contains("a?b:c"));
  }

  // =========================================================================
  // 13. REGEXP node
  // =========================================================================

  @Test
  public void testRegexpLiteralNoFlags() {
    assertTrue(parsePrint("x=/abc/;").contains("/abc/"));
  }

  @Test
  public void testRegexpLiteralWithFlags() {
    assertTrue(parsePrint("x=/abc/gi;").contains("/abc/gi"));
  }

  // =========================================================================
  // 14. FUNCTION (needsParens ที่ START_OF_EXPR)
  // =========================================================================

  @Test
  public void testFunctionExpressionAtStartOfExpressionNeedsParens() {
    String out = parsePrint("(function(){return 1;})();");
    assertTrue(out.contains("(function("));
  }

  // =========================================================================
  // 15. GETTER_DEF / SETTER_DEF / OBJECTLIT key printing
  // =========================================================================

  @Test
  public void testGetterSetterDefInObjectLiteral() {
    String out = parsePrint("x={get a(){return 1;}, set b(v){}};");
    assertTrue(out.contains("get a("));
    assertTrue(out.contains("set b("));
  }

  @Test
  public void testObjectLiteralKeyVariants() {
    String out = parsePrint("x={a:1, 'b-c':2, 3:4};");
    assertTrue(out.contains("a:1"));            // unquoted valid identifier key
    assertTrue(out.contains("\"b-c\":2"));      // needs quoting -> addExpr(STRING)
    assertTrue(out.contains("3:4"));            // simple number key -> cc.addNumber
  }

  // =========================================================================
  // 16. SCRIPT/BLOCK - addNonEmptyStatement branches (count 0/1/>1, function/do)
  // =========================================================================

  @Test
  public void testIfBlockCollapsesToSingleStatement() {
    String out = parsePrint("if(a){b();}");
    assertTrue(out.contains("if(a)"));
    assertFalse(out.contains("{"));   // single statement -> braces removed
  }

  @Test
  public void testIfBlockPreservedWithMultipleStatements() {
    String out = parsePrint("if(a){b();c();}");
    assertTrue(out.contains("{"));
    assertTrue(out.contains("}"));
  }

  @Test
  public void testIfBlockEmptyBecomesEmptyStatement() {
    String out = parsePrint("if(a){}");
    assertTrue(out.contains("if(a)"));
    assertFalse(out.contains("{}"));
  }

  @Test
  public void testIfBlockSoleFunctionAlwaysWrapped() {
    // ตาม comment ในซอร์ส: Safari ต้องการ block ล้อม function declaration เดี่ยว
    String out = parsePrint("if(a){function f(){}}");
    assertTrue(out.contains("{"));
  }

  @Test
  public void testIfBlockSoleDoAlwaysWrapped() {
    String out = parsePrint("if(a){do{b();}while(c);}");
    assertTrue(out.contains("{"));
  }

  // =========================================================================
  // 17. FOR / FOR-IN / DO / WHILE
  // =========================================================================

  @Test
  public void testForClassicLoop() {
    assertTrue(parsePrint("for(i=0;i<10;i++){x++;}").contains("for(i=0;i<10;i++)"));
  }

  @Test
  public void testForInLoop() {
    String out = parsePrint("for(var k in obj){x++;}");
    assertTrue(out.contains("for(var k"));
    assertTrue(out.contains("in obj)"));
  }

  @Test
  public void testDoWhileLoop() {
    String out = parsePrint("do{x++;}while(x<10);");
    assertTrue(out.contains("do{"));
    assertTrue(out.contains("}while(x<10)"));
  }

  @Test
  public void testWhileLoop() {
    assertTrue(parsePrint("while(x<10){x++;}").contains("while(x<10)"));
  }

  // =========================================================================
  // 18. IF / ELSE
  // =========================================================================

  @Test
  public void testIfElse() {
    String out = parsePrint("if(a){b();}else{c();}");
    assertTrue(out.contains("if(a)"));
    assertTrue(out.contains("else"));
  }

  @Test
  public void testIfNoElse() {
    String out = parsePrint("if(a){b();}");
    assertFalse(out.contains("else"));
  }

  // =========================================================================
  // 19. GETPROP / GETELEM / WITH / DELPROP
  // =========================================================================

  @Test
  public void testGetPropNeedsParensForNumberReceiver() {
    String out = parsePrint("(1).toString();");
    assertTrue(out.contains("(1)."));
  }

  @Test
  public void testGetElem() {
    assertTrue(parsePrint("x=a[b];").contains("a[b]"));
  }

  @Test
  public void testWithStatement() {
    assertTrue(parsePrint("with(a){b();}").contains("with(a)"));
  }

  @Test
  public void testDeletePropertyStatement() {
    assertTrue(parsePrint("delete a.b;").contains("delete a.b"));
  }

  // =========================================================================
  // 20. INC / DEC (pre/post)
  // =========================================================================

  @Test
  public void testIncDecPrefixAndPostfix() {
    String out = parsePrint("++a;a++;--b;b--;");
    assertTrue(out.contains("++a"));
    assertTrue(out.contains("a++"));
    assertTrue(out.contains("--b"));
    assertTrue(out.contains("b--"));
  }

  // =========================================================================
  // 21. CALL - direct eval / plain property call
  // =========================================================================

  @Test
  public void testCallDirectEvalNotWrapped() {
    String out = parsePrint("eval('1');");
    assertFalse(out.contains("(0,eval)"));
    assertTrue(out.contains("eval("));
  }

  @Test
  public void testCallPlainPropertyCallNotWrapped() {
    String out = parsePrint("a.b();");
    assertFalse(out.contains("(0,"));
    assertTrue(out.contains("a.b()"));
  }

  // =========================================================================
  // 22. NEW - args optional / forced precedence for CALL child
  // =========================================================================

  @Test
  public void testNewWithoutArgsOmitsParens() {
    String out = parsePrint("new Date;");
    assertTrue(out.contains("new Date"));
    assertFalse(out.contains("new Date("));
  }

  @Test
  public void testNewWithArgs() {
    String out = parsePrint("new Foo(1,2);");
    assertTrue(out.contains("new Foo(1,2)"));
  }

  @Test
  public void testNewWithCallExpressionForcesParens() {
    String out = parsePrint("new (f())();");
    assertTrue(out.contains("new (f())"));
  }

  // =========================================================================
  // 23. Literals: NULL/THIS/FALSE/TRUE
  // =========================================================================

  @Test
  public void testLiteralKeywords() {
    String out = parsePrint("x=null;y=this;z=false;w=true;");
    assertTrue(out.contains("null"));
    assertTrue(out.contains("this"));
    assertTrue(out.contains("false"));
    assertTrue(out.contains("true"));
  }

  // =========================================================================
  // 24. CONTINUE / BREAK / DEBUGGER
  // =========================================================================

  @Test
  public void testContinueWithLabel() {
    assertTrue(parsePrint("a:for(;;){continue a;}").contains("continue a"));
  }

  @Test
  public void testContinueWithoutLabel() {
    String out = parsePrint("for(;;){continue;}");
    assertTrue(out.contains("continue"));
  }

  @Test
  public void testBreakWithLabel() {
    assertTrue(parsePrint("foo:for(;;){break foo;}").contains("break foo"));
  }

  @Test
  public void testBreakWithoutLabel() {
    String out = parsePrint("for(;;){break;}");
    assertTrue(out.contains("break"));
    assertFalse(out.contains("break foo"));
  }

  @Test
  public void testDebuggerStatement() {
    assertTrue(parsePrint("debugger;").contains("debugger"));
  }

  // =========================================================================
  // 25. SWITCH / CASE / DEFAULT_CASE
  // =========================================================================

  @Test
  public void testSwitchCaseDefault() {
    String out = parsePrint("switch(x){case 1:a();break;default:b();}");
    assertTrue(out.contains("switch(x)"));
    assertTrue(out.contains("case 1:"));
    assertTrue(out.contains("default"));
  }

  // =========================================================================
  // 26. LABEL statement
  // =========================================================================

  @Test
  public void testLabelStatement() {
    String out = parsePrint("foo:for(;;){break foo;}");
    assertTrue(out.contains("foo:for("));
  }

  // =========================================================================
  // 27. EMPTY (if without body statement content)
  // =========================================================================

  @Test
  public void testEmptyIfBody() {
    String out = parsePrint("if(a);");
    assertTrue(out.contains("if(a)"));
  }
}
