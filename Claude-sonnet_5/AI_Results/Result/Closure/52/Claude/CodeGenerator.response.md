# วิเคราะห์และหมายเหตุสำคัญ

`CodeGenerator` เป็น **package-private class** และ constructor ต้องรับ `CodeConsumer` (abstract class) ซึ่ง **ไม่ได้แสดง source ให้ในโจทย์**

ดังนั้นเพื่อไม่ "เดา behavior" ที่ไม่มีหลักฐาน ผมแบ่งการทดสอบเป็น 2 กลุ่ม:

1. **กลุ่มเสี่ยงต่ำ (ไม่ต้องพึ่ง CodeConsumer จริง)** — ทดสอบ static method ทั้งหมด (`isSimpleNumber`, `getSimpleNumber`, `strEscape`, `regexpEscape`, `escapeToDoubleQuotedJsString`, `identifierEscape`) และ instance method `jsString` (ไม่เรียก `cc` เลย) รวมถึง constructor branch ของ charset — ปลอดภัย 100% เพราะอ้างอิงจากซอร์สที่ให้มาโดยตรง
2. **กลุ่มที่ต้องพึ่ง `CodeConsumer`** — ผมสร้าง stub ชื่อ `RecordingCodeConsumer` โดย **อนุมาน signature ของแต่ละเมธอดจากวิธีที่ `CodeGenerator` เรียกใช้ `cc.xxx(...)` ในซอร์สที่ให้มาเท่านั้น** (เช่น `cc.add(String)`, `cc.addOp(String,boolean)`, `cc.endStatement()/(boolean)`, `cc.beginBlock()`, `cc.endBlock(boolean)`, `cc.shouldPreserveExtraBlocks()` ฯลฯ) — **นี่คือสมมติฐาน** เพราะไม่มี source ของ `CodeConsumer` จริง หากมี abstract method อื่นที่ `CodeGenerator` ไม่ได้เรียก จะต้องเพิ่ม override ให้ compile ผ่าน (คอมเมนต์กำกับไว้ในโค้ด)
3. การสร้าง `Node` (เช่น `Node.newNumber`, `Node.newString(int,String)`, `new Node(type, child...)`, `addChildToBack`) เป็น API มาตรฐานของ `com.google.javascript.rhino.Node` ในโปรเจกต์นี้ — **เป็นสมมติฐานที่มีคอมเมนต์กำกับ** เนื่องจากไม่ได้แสดง source ของ `Node` มาให้เช่นกัน
4. หลีกเลี่ยงการทดสอบ branch ของ binary operator (`opstr != null && first != last`) โดยตรง เพราะพึ่งพา `NodeUtil.opToStr/precedence/isAssociative/isAssignmentOp` ซึ่งไม่มี source ให้ — จึงไม่ทดสอบ behavior ละเอียดของ path นี้ (คอมเมนต์กำกับ)

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.base.Charsets;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit tests สำหรับ CodeGenerator (Closure-52b)
 *
 * หมายเหตุสำคัญ (สมมติฐานที่ไม่มี source ยืนยันตรง ๆ ในโจทย์):
 * 1) CodeConsumer เป็น abstract class ที่ไม่ได้แสดง source มาให้ จึงสร้าง stub
 *    RecordingCodeConsumer โดยอนุมาน method signature จากวิธีที่ CodeGenerator
 *    เรียกใช้ cc.xxx(...) ในซอร์สที่ให้มาเท่านั้น
 * 2) การสร้าง Node ใช้ static factory (Node.newNumber, Node.newString) และ
 *    constructor (new Node(type, child...)) ซึ่งเป็น API มาตรฐานของ
 *    com.google.javascript.rhino.Node ในโปรเจกต์นี้ (ไม่ได้ให้ source Node มาด้วย)
 * 3) ไม่ทดสอบ branch ของ binary operator (opstr != null && first != last)
 *    โดยตรง เนื่องจากพึ่งพา NodeUtil.opToStr/precedence/isAssociative ที่ไม่มี
 *    source ยืนยัน จึงถือว่า opToStr(type) คืน null สำหรับ token ที่ไม่ใช่ operator
 *    (VAR, NAME, NUMBER, STRING, TRUE/FALSE/NULL/THIS, EMPTY, ARRAYLIT,
 *     CONTINUE, BREAK, DEBUGGER, DELPROP, EXPR_RESULT, IF, DO, EXPR_VOID,
 *     REGEXP) ซึ่งเป็นข้อสมมติที่สอดคล้องกับความหมายของ token เหล่านี้
 */
public class CodeGeneratorTest {

  // ---------------------------------------------------------------------
  // Stub CodeConsumer (ดูหมายเหตุข้อ 1 ด้านบน)
  // ---------------------------------------------------------------------
  static class RecordingCodeConsumer extends CodeConsumer {
    final List<String> log = new ArrayList<String>();
    boolean continueProcessing = true;
    boolean preserveExtraBlocks = false;

    @Override boolean continueProcessing() { return continueProcessing; }
    @Override void add(String str) { log.add("add:" + str); }
    @Override void addIdentifier(String identifier) {
      log.add("addIdentifier:" + identifier);
    }
    @Override void addOp(String op, boolean binOp) {
      log.add("addOp:" + op + ":" + binOp);
    }
    @Override void addNumber(double x) { log.add("addNumber:" + x); }
    @Override void startSourceMapping(Node n) { log.add("startSourceMapping"); }
    @Override void endSourceMapping(Node n) { log.add("endSourceMapping"); }
    @Override void endStatement() { log.add("endStatement"); }
    @Override void endStatement(boolean needSemiColon) {
      log.add("endStatement:" + needSemiColon);
    }
    @Override void beginBlock() { log.add("beginBlock"); }
    @Override void endBlock(boolean breakAfter) { log.add("endBlock:" + breakAfter); }
    @Override boolean breakAfterBlockFor(Node n, boolean isStatementContext) {
      return false;
    }
    @Override void maybeLineBreak() { log.add("maybeLineBreak"); }
    @Override void notePreferredLineBreak() { log.add("notePreferredLineBreak"); }
    @Override boolean shouldPreserveExtraBlocks() { return preserveExtraBlocks; }
    @Override void listSeparator() { log.add("listSeparator"); }
    @Override void beginCaseBody() { log.add("beginCaseBody"); }
    @Override void endCaseBody() { log.add("endCaseBody"); }
    @Override void endFunction(boolean statementContext) {
      log.add("endFunction:" + statementContext);
    }
  }

  // ---------------------------------------------------------------------
  // Node helper factories (ดูหมายเหตุข้อ 2)
  // ---------------------------------------------------------------------
  private static Node num(double d) { return Node.newNumber(d); }
  private static Node str(String s) { return Node.newString(s); }
  private static Node typedStr(int type, String s) { return Node.newString(type, s); }

  private RecordingCodeConsumer newConsumer() {
    return new RecordingCodeConsumer();
  }

  private CodeGenerator newGenerator(RecordingCodeConsumer cc) {
    return new CodeGenerator(cc);
  }

  // =====================================================================
  // SECTION 1: static utility methods (ไม่ต้องพึ่ง CodeConsumer, ปลอดภัยสูง)
  // =====================================================================

  @Test
  public void testIsSimpleNumber_empty() {
    assertFalse(CodeGenerator.isSimpleNumber("")); // len>0 == false
  }

  @Test
  public void testIsSimpleNumber_allDigits() {
    assertTrue(CodeGenerator.isSimpleNumber("0123456789"));
  }

  @Test
  public void testIsSimpleNumber_leadingZero() {
    assertTrue(CodeGenerator.isSimpleNumber("007"));
  }

  @Test
  public void testIsSimpleNumber_nonDigitChar() {
    assertFalse(CodeGenerator.isSimpleNumber("12a3"));
  }

  @Test
  public void testIsSimpleNumber_negativeSign() {
    assertFalse(CodeGenerator.isSimpleNumber("-5")); // '-' out of '0'..'9'
  }

  @Test
  public void testGetSimpleNumber_valid() {
    assertEquals(123.0, CodeGenerator.getSimpleNumber("123"), 0.0);
  }

  @Test
  public void testGetSimpleNumber_nonNumeric() {
    assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("abc")));
  }

  @Test
  public void testGetSimpleNumber_tooLongForLong_NumberFormatException() {
    // เกิน range ของ long -> Long.parseLong throw NumberFormatException -> catch -> NaN
    assertTrue(Double.isNaN(
        CodeGenerator.getSimpleNumber("999999999999999999999999999999")));
  }

  @Test
  public void testGetSimpleNumber_exceedsMaxPositiveInteger() {
    // Long.MAX_VALUE parse ได้ แต่ควรเกิน NodeUtil.MAX_POSITIVE_INTEGER_NUMBER
    // -> ตก branch `l < MAX...` เป็น false -> fallthrough คืน NaN
    assertTrue(Double.isNaN(
        CodeGenerator.getSimpleNumber(String.valueOf(Long.MAX_VALUE))));
  }

  @Test
  public void testEscapeToDoubleQuotedJsString_basic() {
    String r = CodeGenerator.escapeToDoubleQuotedJsString("a\"b'c\\d");
    assertEquals('"', r.charAt(0));
    assertEquals('"', r.charAt(r.length() - 1));
    assertTrue(r.contains("\\\"")); // double quote escaped
    assertTrue(r.contains("\\\\")); // backslash escaped
  }

  @Test
  public void testRegexpEscape_defaultDelimiterAndControlChars() {
    String r = CodeGenerator.regexpEscape("a\nb\tc");
    assertEquals('/', r.charAt(0));
    assertEquals('/', r.charAt(r.length() - 1));
    assertTrue(r.contains("\\n"));
    assertTrue(r.contains("\\t"));
  }

  @Test
  public void testRegexpEscape_oneArgOverload_matchesTwoArgWithNull() {
    assertEquals(CodeGenerator.regexpEscape("xyz", null),
        CodeGenerator.regexpEscape("xyz"));
  }

  @Test
  public void testStrEscape_greaterThan_afterDoubleDash_isEscaped() {
    String r = CodeGenerator.strEscape("a-->b", '"', "\\\"", "'", "\\\\", null);
    assertTrue(r.contains("\\>"));
  }

  @Test
  public void testStrEscape_greaterThan_afterDoubleBracket_isEscaped() {
    String r = CodeGenerator.strEscape("a]]>b", '"', "\\\"", "'", "\\\\", null);
    assertTrue(r.contains("\\>"));
  }

  @Test
  public void testStrEscape_greaterThan_notPreceded_isLiteral() {
    String r = CodeGenerator.strEscape("a>b", '"', "\\\"", "'", "\\\\", null);
    assertTrue(r.contains(">"));
    assertFalse(r.contains("\\>"));
  }

  @Test
  public void testStrEscape_lessThan_beforeSlashScript_caseInsensitive() {
    String r = CodeGenerator.strEscape("a</SCRIPT>", '"', "\\\"", "'", "\\\\", null);
    assertTrue(r.contains("<\\"));
  }

  @Test
  public void testStrEscape_lessThan_beforeBangDashDash() {
    String r = CodeGenerator.strEscape("a<!--", '"', "\\\"", "'", "\\\\", null);
    assertTrue(r.contains("<\\"));
  }

  @Test
  public void testStrEscape_lessThan_plain_isLiteral() {
    String r = CodeGenerator.strEscape("a<b", '"', "\\\"", "'", "\\\\", null);
    assertTrue(r.contains("<"));
    assertFalse(r.contains("<\\"));
  }

  @Test
  public void testStrEscape_noEncoder_boundary_charInRange() {
    // c > 0x1f && c < 0x7f -> literal
    String r = CodeGenerator.strEscape("\u0020", '"', "\\\"", "'", "\\\\", null);
    assertTrue(r.contains("\u0020"));
  }

  @Test
  public void testStrEscape_noEncoder_boundary_lowerEdgeEscaped() {
    // c == 0x1f -> c > 0x1f เป็น false -> ต้อง escape
    String r = CodeGenerator.strEscape("\u001f", '"', "\\\"", "'", "\\\\", null);
    assertTrue(r.contains("\\u001f"));
  }

  @Test
  public void testStrEscape_noEncoder_boundary_upperEdgeEscaped() {
    // c == 0x7f -> c < 0x7f เป็น false -> ต้อง escape
    String r = CodeGenerator.strEscape("\u007f", '"', "\\\"", "'", "\\\\", null);
    assertTrue(r.contains("\\u007f"));
  }

  @Test
  public void testStrEscape_withEncoder_canEncode_true() throws Exception {
    java.nio.charset.CharsetEncoder enc = Charsets.US_ASCII.newEncoder();
    String r = CodeGenerator.strEscape("A", '"', "\\\"", "'", "\\\\", enc);
    assertTrue(r.contains("A")); // ASCII encoder canEncode('A') == true
  }

  @Test
  public void testStrEscape_withEncoder_canEncode_false() throws Exception {
    java.nio.charset.CharsetEncoder enc = Charsets.US_ASCII.newEncoder();
    String r = CodeGenerator.strEscape("\u00e9", '"', "\\\"", "'", "\\\\", enc);
    // ASCII encoder ไม่สามารถ encode ตัวอักษรนอก ASCII -> ต้อง escape
    assertTrue(r.contains("\\u00e9"));
  }

  @Test
  public void testIdentifierEscape_pureAscii_unchanged() {
    assertEquals("test123", CodeGenerator.identifierEscape("test123"));
  }

  @Test
  public void testIdentifierEscape_nonLatinChar_escaped() {
    String r = CodeGenerator.identifierEscape("caf\u00e9");
    assertTrue(r.startsWith("caf"));
    assertTrue(r.contains("\\u00e9"));
  }

  // =====================================================================
  // SECTION 2: constructor charset branch + jsString (ไม่ต้องใช้ cc จริง)
  // =====================================================================

  @Test
  public void testConstructor_nullCharset_usesEscapeDefault() {
    CodeGenerator g = new CodeGenerator(newConsumer(), null);
    String s = g.jsString("caf\u00e9");
    assertTrue(s.contains("\\u00e9"));
  }

  @Test
  public void testConstructor_usAsciiCharset_usesEscapeDefault() {
    CodeGenerator g = new CodeGenerator(newConsumer(), Charsets.US_ASCII);
    String s = g.jsString("caf\u00e9");
    assertTrue(s.contains("\\u00e9"));
  }

  @Test
  public void testConstructor_oneArg_delegatesToNullCharset() {
    CodeGenerator g = new CodeGenerator(newConsumer());
    String s = g.jsString("caf\u00e9");
    assertTrue(s.contains("\\u00e9"));
  }

  @Test
  public void testConstructor_utf8Charset_usesEncoder_noEscape() {
    CodeGenerator g = new CodeGenerator(newConsumer(), Charsets.UTF_8);
    String s = g.jsString("caf\u00e9");
    // UTF-8 encoder สามารถ encode ตัวอักษรนี้ได้ -> ไม่ต้อง escape
    assertTrue(s.contains("\u00e9"));
    assertFalse(s.contains("\\u00e9"));
  }

  @Test
  public void testJsString_quoteSelection_moreDoubleQuotes_usesSingleDelimiter() {
    CodeGenerator g = new CodeGenerator(newConsumer());
    String s = g.jsString("a\"b\"c'd"); // doubleq=2, singleq=1
    assertEquals('\'', s.charAt(0));
    assertEquals('\'', s.charAt(s.length() - 1));
    assertTrue(s.contains("\\'"));
  }

  @Test
  public void testJsString_quoteSelection_moreOrEqualSingleQuotes_usesDoubleDelimiter() {
    CodeGenerator g = new CodeGenerator(newConsumer());
    String s = g.jsString("a'b'c\"d"); // singleq=2, doubleq=1
    assertEquals('"', s.charAt(0));
    assertEquals('"', s.charAt(s.length() - 1));
    assertTrue(s.contains("\\\""));
  }

  // =====================================================================
  // SECTION 3: add(Node) - literal / statement branches ที่ไม่พึ่ง NodeUtil มาก
  // =====================================================================

  @Test
  public void testAdd_continueProcessingFalse_earlyReturn() {
    RecordingCodeConsumer cc = newConsumer();
    cc.continueProcessing = false;
    CodeGenerator g = newGenerator(cc);
    g.add(num(1));
    assertTrue(cc.log.isEmpty()); // ต้อง return ทันที ไม่มีการเรียกอื่นใด
  }

  @Test
  public void testAdd_number() {
    RecordingCodeConsumer cc = newConsumer();
    CodeGenerator g = newGenerator(cc);
    g.add(num(42.0));
    assertTrue(cc.log.contains("addNumber:42.0"));
  }

  @Test
  public void testAdd_neg_onNumberLiteral_foldsToNegativeNumber() {
    RecordingCodeConsumer cc = newConsumer();
    CodeGenerator g = newGenerator(cc);
    g.add(new Node(Token.NEG, num(5.0)));
    assertTrue(cc.log.contains("addNumber:-5.0"));
    assertFalse(anyStartsWith(cc.log, "addOp:-"));
  }

  @Test
  public void testAdd_neg_onNonNumber_usesAddOp() {
    RecordingCodeConsumer cc = newConsumer();
    CodeGenerator g = newGenerator(cc);
    g.add(new Node(Token.NEG, typedStr(Token.NAME, "x")));
    assertTrue(anyStartsWith(cc.log, "addOp:-"));
  }

  @Test
  public void testAdd_stringLiteral_topLevel_noParentObjectLit() {
    RecordingCodeConsumer cc = newConsumer();
    CodeGenerator g = newGenerator(cc);
    g.add(str("hello"));
    assertTrue(anyStartsWith(cc.log, "add:"));
  }

  @Test
  public void testAdd_true_false_null_this() {
    RecordingCodeConsumer cc = newConsumer();
    CodeGenerator g = newGenerator(cc);
    g.add(new Node(Token.TRUE));
    g.add(new Node(Token.FALSE));
    g.add(new Node(Token.NULL));
    g.add(new Node(Token.THIS));
    // ทุกตัวควรเรียก add(Node.tokenToName(type)) อย่างน้อย 4 ครั้ง
    long addCount = 0;
    for (String s : cc.log) {
      if (s.startsWith("add:")) addCount++;
    }
    assertTrue(addCount >= 4);
  }

  @Test
  public void testAdd_empty_noOutput() {
    RecordingCodeConsumer cc = newConsumer();
    CodeGenerator g = newGenerator(cc);
    g.add(new Node(Token.EMPTY));
    assertFalse(anyStartsWith(cc.log, "add:"));
  }

  @Test
  public void testAdd_var_withNameNoInitializer() {
    RecordingCodeConsumer cc = newConsumer();
    CodeGenerator g = newGenerator(cc);
    Node nameNode = typedStr(Token.NAME, "x");
    g.add(new Node(Token.VAR, nameNode));
    assertTrue(cc.log.contains("add:var "));
    assertTrue(cc.log.contains("addIdentifier:x"));
  }

  @Test
  public void testAdd_name_withInitializer() {
    RecordingCodeConsumer cc = newConsumer();
    CodeGenerator g = newGenerator(cc);
    Node nameNode = typedStr(Token.NAME, "x");
    nameNode.addChildToBack(num(5.0));
    g.add(nameNode);
    assertTrue(cc.log.contains("addIdentifier:x"));
    assertTrue(anyStartsWith(cc.log, "addOp:="));
    assertTrue(cc.log.contains("addNumber:5.0"));
  }

  @Test
  public void testAdd_arrayLit_withTrailingHole_extraListSeparator() {
    RecordingCodeConsumer cc = newConsumer();
    CodeGenerator g = newGenerator(cc);
    Node arr = new Node(Token.ARRAYLIT);
    arr.addChildToBack(num(1.0));
    arr.addChildToBack(new Node(Token.EMPTY)); // lastWasEmpty == true
    g.add(arr);
    int sepCount = countOccurrences(cc.log, "listSeparator");
    // 1 separator ระหว่าง element + 1 separator ท้ายเพราะ lastWasEmpty
    assertEquals(2, sepCount);
  }

  @Test
  public void testAdd_arrayLit_withoutTrailingHole_noExtraSeparator() {
    RecordingCodeConsumer cc = newConsumer();
    CodeGenerator g = newGenerator(cc);
    Node arr = new Node(Token.ARRAYLIT);
    arr.addChildToBack(num(1.0));
    arr.addChildToBack(num(2.0)); // ไม่ใช่ EMPTY
    g.add(arr);
    int sepCount = countOccurrences(cc.log, "listSeparator");
    assertEquals(1, sepCount);
  }

  @Test
  public void testAdd_debugger() {
    RecordingCodeConsumer cc = newConsumer();
    CodeGenerator g = newGenerator(cc);
    g.add(new Node(Token.DEBUGGER));
    assertTrue(cc.log.contains("add:debugger"));
  }

  @Test
  public void testAdd_continue_withoutLabel() {
    RecordingCodeConsumer cc = newConsumer();
    CodeGenerator g = newGenerator(cc);
    g.add(new Node(Token.CONTINUE));
    assertTrue(cc.log.contains("add:continue"));
  }

  @Test
  public void testAdd_continue_withValidLabel() {
    RecordingCodeConsumer cc = newConsumer();
    CodeGenerator g = newGenerator(cc);
    g.add(new Node(Token.CONTINUE, typedStr(Token.LABEL_NAME, "L")));
    assertTrue(cc.log.contains("addIdentifier:L"));
  }

  @Test(expected = Error.class)
  public void testAdd_continue_withInvalidLabelType_throwsError() {
    RecordingCodeConsumer cc = newConsumer();
    CodeGenerator g = newGenerator(cc);
    g.add(new Node(Token.CONTINUE, typedStr(Token.NAME, "x")));
  }

  @Test
  public void testAdd_break_withValidLabel() {
    RecordingCodeConsumer cc = newConsumer();
    CodeGenerator g = newGenerator(cc);
    g.add(new Node(Token.BREAK, typedStr(Token.LABEL_NAME, "L")));
    assertTrue(cc.log.contains("addIdentifier:L"));
  }

  @Test(expected = Error.class)
  public void testAdd_break_withInvalidLabelType_throwsError() {
    RecordingCodeConsumer cc = newConsumer();
    CodeGenerator g = newGenerator(cc);
    g.add(new Node(Token.BREAK, typedStr(Token.NAME, "x")));
  }

  @Test
  public void testAdd_delprop() {
    RecordingCodeConsumer cc = newConsumer();
    CodeGenerator g = newGenerator(cc);
    g.add(new Node(Token.DELPROP, typedStr(Token.NAME, "a")));
    assertTrue(cc.log.contains("add:delete "));
  }

  @Test
  public void testAdd_exprResult() {
    RecordingCodeConsumer cc = newConsumer();
    CodeGenerator g = newGenerator(cc);
    g.add(new Node(Token.EXPR_RESULT, typedStr(Token.NAME, "a")));
    assertTrue(cc.log.contains("addIdentifier:a"));
    assertTrue(cc.log.contains("endStatement"));
  }

  @Test(expected = Error.class)
  public void testAdd_exprVoid_throwsError() {
    RecordingCodeConsumer cc = newConsumer();
    CodeGenerator g = newGenerator(cc);
    g.add(new Node(Token.EXPR_VOID));
  }

  @Test(expected = Error.class)
  public void testAdd_regexp_nonStringChildren_throwsError() {
    RecordingCodeConsumer cc = newConsumer();
    CodeGenerator g = newGenerator(cc);
    g.add(new Node(Token.REGEXP, str("abc"), num(1.0)));
  }

  @Test
  public void testTagAsStrict() {
    RecordingCodeConsumer cc = newConsumer();
    CodeGenerator g = newGenerator(cc);
    g.tagAsStrict();
    assertTrue(cc.log.contains("add:'use strict';"));
  }

  // =====================================================================
  // SECTION 4: addNonEmptyStatement / IF - private helper coverage
  // (getNonEmptyChildCount / getFirstNonEmptyChild / isOneExactlyFunctionOrDo)
  // =====================================================================

  @Test
  public void testIf_noElse_emptyBlock_preserveExtraBlocksFalse_usesEndStatement() {
    RecordingCodeConsumer cc = newConsumer();
    cc.preserveExtraBlocks = false;
    CodeGenerator g = newGenerator(cc);
    Node ifNode = new Node(Token.IF, typedStr(Token.NAME, "c"), new Node(Token.BLOCK));
    g.add(ifNode);
    assertTrue(cc.log.contains("endStatement:true"));
    assertFalse(cc.log.contains("beginBlock"));
  }

  @Test
  public void testIf_noElse_emptyBlock_preserveExtraBlocksTrue_usesBeginEndBlock() {
    RecordingCodeConsumer cc = newConsumer();
    cc.preserveExtraBlocks = true;
    CodeGenerator g = newGenerator(cc);
    Node ifNode = new Node(Token.IF, typedStr(Token.NAME, "c"), new Node(Token.BLOCK));
    g.add(ifNode);
    assertTrue(cc.log.contains("beginBlock"));
    assertTrue(anyStartsWith(cc.log, "endBlock:"));
  }

  @Test
  public void testIf_noElse_singleNonFunctionChild_unwrapsBlock() {
    RecordingCodeConsumer cc = newConsumer();
    cc.preserveExtraBlocks = false;
    CodeGenerator g = newGenerator(cc);
    Node block = new Node(Token.BLOCK);
    block.addChildToBack(new Node(Token.EXPR_RESULT, typedStr(Token.NAME, "a")));
    Node ifNode = new Node(Token.IF, typedStr(Token.NAME, "c"), block);
    g.add(ifNode);
    // ไม่ควร beginBlock เพราะ unwrap เป็น child เดียวโดยตรง (ไม่ใช่ FUNCTION/DO)
    assertFalse(cc.log.contains("beginBlock"));
    assertTrue(cc.log.contains("addIdentifier:a"));
  }

  @Test
  public void testIf_noElse_singleDoChild_wrapsInBlock() {
    RecordingCodeConsumer cc = newConsumer();
    cc.preserveExtraBlocks = false;
    CodeGenerator g = newGenerator(cc);
    Node doNode = new Node(Token.DO, new Node(Token.BLOCK), new Node(Token.TRUE));
    Node block = new Node(Token.BLOCK);
    block.addChildToBack(doNode);
    Node ifNode = new Node(Token.IF, typedStr(Token.NAME, "c"), block);
    g.add(ifNode);
    // DO ตัวเดียวใน block ต้อง wrap ด้วย beginBlock/endBlock (isOneExactlyFunctionOrDo == true)
    assertTrue(cc.log.contains("beginBlock"));
    assertTrue(cc.log.contains("add:do"));
  }

  @Test
  public void testIf_withElse_bothBranchesGenerated() {
    RecordingCodeConsumer cc = newConsumer();
    CodeGenerator g = newGenerator(cc);
    Node thenBlock = new Node(Token.BLOCK);
    thenBlock.addChildToBack(new Node(Token.EXPR_RESULT, typedStr(Token.NAME, "a")));
    Node elseBlock = new Node(Token.BLOCK);
    elseBlock.addChildToBack(new Node(Token.EXPR_RESULT, typedStr(Token.NAME, "b")));
    Node ifNode = new Node(Token.IF, typedStr(Token.NAME, "c"), thenBlock, elseBlock);
    g.add(ifNode);
    assertTrue(cc.log.contains("add:if("));
    assertTrue(cc.log.contains("add:else"));
    assertTrue(cc.log.contains("addIdentifier:a"));
    assertTrue(cc.log.contains("addIdentifier:b"));
  }

  // ---------------------------------------------------------------------
  // helpers
  // ---------------------------------------------------------------------
  private static boolean anyStartsWith(List<String> log, String prefix) {
    for (String s : log) {
      if (s.startsWith(prefix)) return true;
    }
    return false;
  }

  private static int countOccurrences(List<String> log, String exact) {
    int c = 0;
    for (String s : log) {
      if (s.equals(exact)) c++;
    }
    return c;
  }
}
```

## สรุปตาราง Test-to-Branch Mapping

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testIsSimpleNumber_empty/allDigits/leadingZero/nonDigitChar/negativeSign` | loop ตรวจ char และ `len > 0` ของ `isSimpleNumber` (ทุก path) |
| `testGetSimpleNumber_valid/nonNumeric/tooLongForLong.../exceedsMaxPositiveInteger` | `isSimpleNumber` true/false, `NumberFormatException` catch, `l < MAX_POSITIVE_INTEGER_NUMBER` true/false |
| `testEscapeToDoubleQuotedJsString_basic`, `testRegexpEscape_*` | overload delegation ของ `regexpEscape`/`escapeToDoubleQuotedJsString` |
| `testStrEscape_greaterThan_*`, `testStrEscape_lessThan_*` | switch-case `'>' `/`'<'` ทุก sub-condition (preceded by `--`,`]]`, `/script`, `!--`, กรณีไม่ตรง) |
| `testStrEscape_noEncoder_boundary_*` | branch `outputCharsetEncoder == null` และค่าขอบ `0x1f`/`0x7f` |
| `testStrEscape_withEncoder_canEncode_*` | branch `outputCharsetEncoder != null` ทั้ง `canEncode` true/false |
| `testIdentifierEscape_*` | branch `NodeUtil.isLatin` true/false ของ `identifierEscape` |
| `testConstructor_nullCharset/usAsciiCharset/oneArg/utf8Charset` | constructor: `outputCharset==null`, `==US_ASCII`, other charset (encoder != null) |
| `testJsString_quoteSelection_*` | branch `singleq < doubleq` true/false ใน `jsString` |
| `testAdd_continueProcessingFalse_earlyReturn` | `if (!cc.continueProcessing()) return;` |
| `testAdd_number` | case `Token.NUMBER` |
| `testAdd_neg_onNumberLiteral_.../testAdd_neg_onNonNumber_...` | if/else ของ `Token.NEG` (double-negation fold) |
| `testAdd_stringLiteral_topLevel...` | case `Token.STRING`, condition parent==null |
| `testAdd_true_false_null_this` | case `TRUE/FALSE/NULL/THIS` |
| `testAdd_empty_noOutput` | case `Token.EMPTY` |
| `testAdd_var_withNameNoInitializer` | case `Token.VAR` (first!=null) + case `NAME` (first==null branch) |
| `testAdd_name_withInitializer` | case `NAME` (first!=null, non-COMMA branch) |
| `testAdd_arrayLit_withTrailingHole/withoutTrailingHole` | `addArrayList` — `lastWasEmpty` true/false |
| `testAdd_debugger` | case `Token.DEBUGGER` |
| `testAdd_continue_withoutLabel/withValidLabel/withInvalidLabelType` | case `CONTINUE`: childCount 0/1, label type ผิด (throw Error) |
| `testAdd_break_withValidLabel/withInvalidLabelType` | case `BREAK`: เหมือนกับ CONTINUE |
| `testAdd_delprop` | case `Token.DELPROP` |
| `testAdd_exprResult` | case `Token.EXPR_RESULT` |
| `testAdd_exprVoid_throwsError` | case `Token.EXPR_VOID` (throw Error) |
| `testAdd_regexp_nonStringChildren_throwsError` | case `Token.REGEXP` (throw Error เมื่อ child ไม่ใช่ STRING) |
| `testTagAsStrict` | `tagAsStrict()` → `add(String)` |
| `testIf_noElse_emptyBlock_preserveExtraBlocksFalse/True` | `addNonEmptyStatement`: count==0, `shouldPreserveExtraBlocks()` true/false |
| `testIf_noElse_singleNonFunctionChild_unwrapsBlock` | count==1, `isOneExactlyFunctionOrDo` == false (unwrap) |
| `testIf_noElse_singleDoChild_wrapsInBlock` | count==1, `isOneExactlyFunctionOrDo` == true (DO) |
| `testIf_withElse_bothBranchesGenerated` | case `Token.IF`: `hasElse == true`, `ambiguousElseClause` false |

**ข้อจำกัดที่ไม่ครอบคลุม (ระบุตามข้อกำหนดที่ 4):** binary operator path (`opstr != null && first != last`), `HOOK`, `FUNCTION`, `GET/SET`, `SWITCH/CASE/DEFAULT`, `TRY/CATCH`, `FOR`, `WHILE`, `WITH`, `NEW`, `CALL` แบบ indirect-eval/free-call, `GETPROP/GETELEM/GET_REF/REF_SPECIAL`, `LABEL`, `OBJECTLIT`, `INC/DEC` — เนื่องจากพึ่งพา `NodeUtil` หลายเมธอด (`opToStr`, `precedence`, `isAssociative`, `isAssignmentOp`, `containsType`, `isGet`) ที่ไม่มี source ยืนยันพฤติกรรมจริงในโจทย์นี้ จึงไม่เขียนเทสที่ตั้งอยู่บนการเดา behavior เหล่านั้น