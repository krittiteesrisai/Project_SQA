# CodeGeneratorTest.java

## หมายเหตุสำคัญก่อนเริ่ม (Scope Decision)

คลาส `CodeGenerator` ส่วนใหญ่ (`add(Node, Context)`, `addNonEmptyStatement`, `isOneExactlyFunctionOrDo`, `getNonEmptyChildCount`, ฯลฯ) **ต้องพึ่งพา `Node`, `Token`, `CodeConsumer`, `NodeUtil`, `TokenStream`** ซึ่ง **ไม่มี source ของคลาสเหล่านี้ให้มาในโจทย์** การสร้าง mock/instance ของ `CodeConsumer` (abstract methods เช่น `addOp`, `startSourceMapping`, `endBlock` ฯลฯ) จะต้อง "เดา" signature ที่ไม่มีในซอร์สที่ให้มา ซึ่งขัดกับข้อกำหนดที่ 4

ดังนั้นชุดทดสอบนี้จะ**เจาะเฉพาะส่วนที่ self-contained และ verify ได้จริงจาก source ที่ให้มา** ได้แก่:
- `jsString`, `regexpEscape`, `escapeToDoubleQuotedJsString`, `strEscape` (ฟังก์ชัน static ที่ logic ทั้งหมดอยู่ใน source)
- `identifierEscape` (มีจุดที่พึ่ง `NodeUtil.isLatin` — จะกำกับ comment ว่าเป็นสมมติฐานตามความหมายทั่วไปของ "Latin")
- Constructor `CodeGenerator(CodeConsumer, Charset)` และ `CodeGenerator(CodeConsumer)` — ตรวจผ่าน reflection บน field `outputCharsetEncoder` ซึ่ง logic ชัดเจนในซอร์ส

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.google.common.base.Charsets;
import com.google.javascript.jscomp.CodeGenerator;

import java.lang.reflect.Field;
import java.nio.charset.CharsetEncoder;

/**
 * Unit tests for {@link CodeGenerator}.
 *
 * ขอบเขตการทดสอบ: จำกัดเฉพาะ static helper methods (jsString, regexpEscape,
 * escapeToDoubleQuotedJsString, strEscape, identifierEscape) และ constructor
 * เนื่องจาก method add(Node, Context) และ helper อื่น ๆ ต้องพึ่งพา Node/Token/
 * CodeConsumer/NodeUtil/TokenStream ซึ่งไม่มี source ให้มาในโจทย์ - การ mock
 * จะต้องเดา method signature ที่ไม่ปรากฏในซอร์ส จึงไม่ทำตามข้อกำหนดที่ 4
 */
public class CodeGeneratorTest {

  // ---------------------------------------------------------------------
  // Helper: อ่าน private field outputCharsetEncoder ผ่าน reflection
  // ---------------------------------------------------------------------
  private CharsetEncoder getEncoderField(CodeGenerator gen) throws Exception {
    Field f = CodeGenerator.class.getDeclaredField("outputCharsetEncoder");
    f.setAccessible(true);
    return (CharsetEncoder) f.get(gen);
  }

  // ---------------------------------------------------------------------
  // Constructor branch coverage
  // ---------------------------------------------------------------------

  @Test
  public void testConstructor_nullCharset_encoderIsNull() throws Exception {
    // consumer ไม่ถูกใช้งานในคอนสตรัคเตอร์ (แค่ assign ให้ field cc) จึงส่ง null ได้อย่างปลอดภัย
    CodeGenerator gen = new CodeGenerator(null, null);
    assertNull(getEncoderField(gen));
  }

  @Test
  public void testConstructor_usAsciiCharset_encoderIsNull() throws Exception {
    CodeGenerator gen = new CodeGenerator(null, Charsets.US_ASCII);
    assertNull(getEncoderField(gen));
  }

  @Test
  public void testConstructor_otherCharset_encoderIsCreated() throws Exception {
    CodeGenerator gen = new CodeGenerator(null, Charsets.UTF_8);
    assertNotNull(getEncoderField(gen));
  }

  @Test
  public void testConstructor_singleArgDelegatesToNullCharset() throws Exception {
    CodeGenerator gen = new CodeGenerator(null);
    assertNull(getEncoderField(gen));
  }

  // ---------------------------------------------------------------------
  // jsString: null / empty (boundary)
  // ---------------------------------------------------------------------

  @Test(expected = NullPointerException.class)
  public void testJsString_nullInput_throwsNPE() {
    CodeGenerator.jsString(null, null);
  }

  @Test
  public void testJsString_emptyString_producesEmptyQuotedBody() {
    // singleq==0, doubleq==0 -> singleq<doubleq เป็น false -> else branch, quote='"'
    assertEquals("\"\"", CodeGenerator.jsString("", null));
  }

  // ---------------------------------------------------------------------
  // jsString: quote-selection branch (if singleq<doubleq ... else ...)
  // ---------------------------------------------------------------------

  @Test
  public void testJsString_moreDoubleQuotesThanSingle_usesSingleQuoteDelimiter() {
    // doubleq=2, singleq=1 -> 1<2 true -> if-branch: quote=' \' ', double เก็บตรง, single ถูก escape
    String input = "\"\"'";
    String expected = "'" + "\"\"" + "\\'" + "'";
    assertEquals(expected, CodeGenerator.jsString(input, null));
  }

  @Test
  public void testJsString_equalQuoteCounts_boundaryUsesDoubleQuoteDelimiter() {
    // boundary: singleq==doubleq==1 -> "singleq<doubleq" เป็น false -> else-branch
    String input = "'\"";
    String expected = "\"" + "'" + "\\\"" + "\"";
    assertEquals(expected, CodeGenerator.jsString(input, null));
  }

  @Test
  public void testJsString_moreSingleQuotesThanDouble_usesDoubleQuoteDelimiter() {
    // singleq=3, doubleq=2 -> 3<2 false -> else-branch: quote='"', double escaped, single ตรง
    String input = "it's a 'test' \"ok\"";
    String expected = "\"" + input.replace("\"", "\\\"") + "\"";
    assertEquals(expected, CodeGenerator.jsString(input, null));
  }

  @Test
  public void testJsString_onlySingleQuotesPresent_usesDoubleQuoteDelimiter() {
    // doubleq=0 -> 1<0 false -> else-branch
    String input = "it's";
    assertEquals("\"it's\"", CodeGenerator.jsString(input, null));
  }

  @Test
  public void testJsString_onlyDoubleQuotesPresent_usesSingleQuoteDelimiter() {
    // singleq=0 -> 0<2 true -> if-branch
    String input = "he said \"hi\"";
    assertEquals("'" + input + "'", CodeGenerator.jsString(input, null));
  }

  // ---------------------------------------------------------------------
  // strEscape via jsString: \n \r \t \\ escaping
  // ---------------------------------------------------------------------

  @Test
  public void testJsString_escapesNewlineTabCRBackslash() {
    String input = "a\nb\tc\\d\re";
    // ไม่มี quote ในสตริง -> else-branch quote='"'
    String expected = "\"a\\nb\\tc\\\\d\\re\"";
    assertEquals(expected, CodeGenerator.jsString(input, null));
  }

  // ---------------------------------------------------------------------
  // strEscape: '>' escaping logic (case '-- >' and ']] >')
  // ---------------------------------------------------------------------

  @Test
  public void testJsString_greaterThan_afterDoubleDash_isEscaped() {
    assertEquals("\"--\\>\"", CodeGenerator.jsString("-->", null));
  }

  @Test
  public void testJsString_greaterThan_afterDoubleBracket_isEscaped() {
    assertEquals("\"]]\\>\"", CodeGenerator.jsString("]]>", null));
  }

  @Test
  public void testJsString_greaterThan_indexLessThanTwo_notEscaped() {
    // i < 2 -> ไม่ตรวจ prefix -> ไม่ escape
    assertEquals("\">ab\"", CodeGenerator.jsString(">ab", null));
  }

  @Test
  public void testJsString_greaterThan_prefixMismatch_notEscaped() {
    // i>=2 แต่ prefix ไม่ตรงทั้ง "--" และ "]]"
    assertEquals("\"ab>\"", CodeGenerator.jsString("ab>", null));
  }

  // ---------------------------------------------------------------------
  // strEscape: '<' escaping logic (case "/script" and "!--")
  // ---------------------------------------------------------------------

  @Test
  public void testJsString_lessThan_beforeScriptCloseTag_isEscaped_caseInsensitive() {
    // regionMatches(true, ...) ignore case
    assertEquals("\"<\\/SCRIPT\"", CodeGenerator.jsString("</SCRIPT", null));
  }

  @Test
  public void testJsString_lessThan_beforeCommentOpen_isEscaped() {
    assertEquals("\"<\\!--comment\"", CodeGenerator.jsString("<!--comment", null));
  }

  @Test
  public void testJsString_lessThan_plainTag_notEscaped() {
    assertEquals("\"<div>\"", CodeGenerator.jsString("<div>", null));
  }

  @Test
  public void testJsString_lessThan_nearEndOfString_noExceptionAndNotEscaped() {
    // regionMatches เกินความยาวสตริง ต้อง return false อย่างปลอดภัย ไม่ throw
    assertEquals("\"abc<\"", CodeGenerator.jsString("abc<", null));
  }

  // ---------------------------------------------------------------------
  // strEscape: default case, ไม่มี encoder (ASCII range check c>0x1f && c<=0x7f)
  // ---------------------------------------------------------------------

  @Test
  public void testJsString_noEncoder_belowLowerBound_isEscaped() {
    // 0x1f: 0x1f>0x1f เป็น false -> escape
    assertEquals("\"\\u001f\"", CodeGenerator.jsString("\u001f", null));
  }

  @Test
  public void testJsString_noEncoder_atLowerBoundaryEdge_isLiteral() {
    // 0x20 (space): 0x20>0x1f true && 0x20<=0x7f true -> literal
    assertEquals("\" \"", CodeGenerator.jsString("\u0020", null));
  }

  @Test
  public void testJsString_noEncoder_atUpperBoundaryEdge_isLiteral() {
    // 0x7f: <=0x7f true (boundary inclusive) -> literal
    assertEquals("\"\u007f\"", CodeGenerator.jsString("\u007f", null));
  }

  @Test
  public void testJsString_noEncoder_aboveUpperBound_isEscaped() {
    // 0x80: <=0x7f false -> escape
    assertEquals("\"\\u0080\"", CodeGenerator.jsString("\u0080", null));
  }

  // ---------------------------------------------------------------------
  // strEscape: default case, มี CharsetEncoder (canEncode branch)
  // ---------------------------------------------------------------------

  @Test
  public void testJsString_withAsciiEncoder_canEncode_isLiteral() {
    CharsetEncoder ascii = Charsets.US_ASCII.newEncoder();
    assertEquals("\"a\"", CodeGenerator.jsString("a", ascii));
  }

  @Test
  public void testJsString_withAsciiEncoder_cannotEncode_isEscaped() {
    CharsetEncoder ascii = Charsets.US_ASCII.newEncoder();
    // \u00e9 (é) ไม่สามารถ encode ด้วย US-ASCII ได้
    assertEquals("\"a\\u00e9\"", CodeGenerator.jsString("a\u00e9", ascii));
  }

  @Test
  public void testJsString_withUtf8Encoder_canEncodeNonAscii_isLiteral() {
    // ตัดกันกับ test ด้านบน: encoder ต่างชนิดทำให้ผลลัพธ์ต่างกัน (canEncode true)
    CharsetEncoder utf8 = Charsets.UTF_8.newEncoder();
    assertEquals("\"\u00e9\"", CodeGenerator.jsString("\u00e9", utf8));
  }

  // ---------------------------------------------------------------------
  // regexpEscape
  // ---------------------------------------------------------------------

  @Test
  public void testRegexpEscape_twoArg_quoteIsSlash_backslashNotDoubled() {
    // ต่างจาก jsString: backslashEscape = "\\" (ตัวเดียว, ไม่ถูก double)
    String input = "a\\b";
    assertEquals("/" + input + "/", CodeGenerator.regexpEscape(input, null));
  }

  @Test
  public void testRegexpEscape_slashCharacterInBody_notSpeciallyEscaped() {
    // ไม่มี case สำหรับ '/' ใน switch ของ strEscape -> ผ่านแบบ literal
    // (พฤติกรรมตามซอร์สที่ให้มาโดยตรง ไม่ใช่การเดา)
    String input = "a/b";
    assertEquals("/" + input + "/", CodeGenerator.regexpEscape(input, null));
  }

  @Test
  public void testRegexpEscape_oneArgOverload_delegatesToNullEncoder() {
    String input = "a\u00e9";
    assertEquals(
        CodeGenerator.regexpEscape(input, null),
        CodeGenerator.regexpEscape(input));
  }

  // ---------------------------------------------------------------------
  // escapeToDoubleQuotedJsString
  // ---------------------------------------------------------------------

  @Test
  public void testEscapeToDoubleQuotedJsString_doubleQuoteEscaped_singleQuoteLiteral() {
    String input = "he said \"hi\" it's";
    String expected = "\"" + input.replace("\"", "\\\"") + "\"";
    assertEquals(expected, CodeGenerator.escapeToDoubleQuotedJsString(input));
  }

  @Test
  public void testEscapeToDoubleQuotedJsString_backslashDoubled() {
    String input = "a\\b";
    String expected = "\"" + "a" + "\\\\" + "b" + "\"";
    assertEquals(expected, CodeGenerator.escapeToDoubleQuotedJsString(input));
  }

  // ---------------------------------------------------------------------
  // strEscape: generic direct-call เพื่อทดสอบ switch dispatch โดยไม่ผูกกับ wrapper
  // ---------------------------------------------------------------------

  @Test
  public void testStrEscape_customQuoteAndEscapeStrings() {
    // quote='X', doublequoteEscape="D", singlequoteEscape="S", backslashEscape="B"
    String result = CodeGenerator.strEscape("a'b\"c", 'X', "D", "S", "B", null);
    assertEquals("XaSbDcX", result);
  }

  @Test
  public void testStrEscape_emptyString_onlyQuoteCharsReturned() {
    assertEquals("##", CodeGenerator.strEscape("", '#', "D", "S", "B", null));
  }

  @Test(expected = NullPointerException.class)
  public void testStrEscape_nullInput_throwsNPE() {
    CodeGenerator.strEscape(null, '"', "\\\"", "'", "\\\\", null);
  }

  // ---------------------------------------------------------------------
  // identifierEscape
  // หมายเหตุ: พึ่งพา NodeUtil.isLatin ซึ่งไม่มี source ให้มา
  // สมมติฐาน (ตามความหมายทั่วไปของคำว่า "Latin"): ข้อความ ASCII ล้วนถือเป็น
  // Latin (คืนค่าเดิม) และอักขระ CJK (เช่น '\u4e2d') ไม่ใช่ Latin (ต้อง escape)
  // ---------------------------------------------------------------------

  @Test
  public void testIdentifierEscape_pureAsciiIdentifier_unchanged() {
    // ASSUMPTION: NodeUtil.isLatin("abc123_$") == true
    assertEquals("abc123_$", CodeGenerator.identifierEscape("abc123_$"));
  }

  @Test
  public void testIdentifierEscape_nonLatinCharacter_isEscaped() {
    // ASSUMPTION: NodeUtil.isLatin("\u4e2d") == false
    assertEquals("\\u4e2d", CodeGenerator.identifierEscape("\u4e2d"));
  }

  @Test
  public void testIdentifierEscape_mixedLatinAndNonLatin_partialEscape() {
    // ASSUMPTION: NodeUtil.isLatin("a\u4e2db") == false
    // ตาม logic ที่ให้มา: c>0x1f && c<0x7f -> literal, มิฉะนั้น escape
    assertEquals("a\\u4e2db", CodeGenerator.identifierEscape("a\u4e2db"));
  }
}
```

## ตารางสรุป Branch/Condition ที่ครอบคลุม

| เมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|
| testConstructor_nullCharset_encoderIsNull | Constructor: `outputCharset == null` → true |
| testConstructor_usAsciiCharset_encoderIsNull | Constructor: `outputCharset == Charsets.US_ASCII` → true |
| testConstructor_otherCharset_encoderIsCreated | Constructor: else branch (`newEncoder()`) |
| testConstructor_singleArgDelegatesToNullCharset | Constructor overload `this(consumer, null)` |
| testJsString_nullInput_throwsNPE | Null input boundary (`s.length()` NPE) |
| testJsString_emptyString_producesEmptyQuotedBody | Empty string boundary, else-branch quote selection |
| testJsString_moreDoubleQuotesThanSingle_usesSingleQuoteDelimiter | `singleq < doubleq` == true (if-branch) |
| testJsString_equalQuoteCounts_boundaryUsesDoubleQuoteDelimiter | Boundary `singleq == doubleq` → false → else-branch |
| testJsString_moreSingleQuotesThanDouble_usesDoubleQuoteDelimiter | `singleq < doubleq` == false (else-branch) |
| testJsString_onlySingleQuotesPresent_usesDoubleQuoteDelimiter | `doubleq == 0` boundary case |
| testJsString_onlyDoubleQuotesPresent_usesSingleQuoteDelimiter | `singleq == 0` boundary case |
| testJsString_escapesNewlineTabCRBackslash | case `\n`,`\t`,`\\`,`\r` ใน switch |
| testJsString_greaterThan_afterDoubleDash_isEscaped | case `'>'`, prefix `"--"` == true |
| testJsString_greaterThan_afterDoubleBracket_isEscaped | case `'>'`, prefix `"]]"` == true |
| testJsString_greaterThan_indexLessThanTwo_notEscaped | case `'>'`, `i>=2` == false |
| testJsString_greaterThan_prefixMismatch_notEscaped | case `'>'`, prefix condition == false |
| testJsString_lessThan_beforeScriptCloseTag_isEscaped_caseInsensitive | case `'<'`, `regionMatches` "/script" == true |
| testJsString_lessThan_beforeCommentOpen_isEscaped | case `'<'`, `regionMatches` "!--" == true |
| testJsString_lessThan_plainTag_notEscaped | case `'<'`, ทั้งสอง condition == false |
| testJsString_lessThan_nearEndOfString_noExceptionAndNotEscaped | `regionMatches` boundary ไม่เกิน exception |
| testJsString_noEncoder_belowLowerBound_isEscaped | default case, `c>0x1f` == false |
| testJsString_noEncoder_atLowerBoundaryEdge_isLiteral | default case, boundary `c>0x1f` == true |
| testJsString_noEncoder_atUpperBoundaryEdge_isLiteral | default case, boundary `c<=0x7f` == true |
| testJsString_noEncoder_aboveUpperBound_isEscaped | default case, `c<=0x7f` == false |
| testJsString_withAsciiEncoder_canEncode_isLiteral | default case, `outputCharsetEncoder != null`, `canEncode` == true |
| testJsString_withAsciiEncoder_cannotEncode_isEscaped | default case, `canEncode` == false |
| testJsString_withUtf8Encoder_canEncodeNonAscii_isLiteral | encoder-dependent branch (คนละ encoder ให้ผลต่าง) |
| testRegexpEscape_twoArg_quoteIsSlash_backslashNotDoubled | regexpEscape param mapping (backslash escape เดี่ยว) |
| testRegexpEscape_slashCharacterInBody_notSpeciallyEscaped | ไม่มี case `'/'` ใน switch (default passthrough) |
| testRegexpEscape_oneArgOverload_delegatesToNullEncoder | 1-arg overload delegation |
| testEscapeToDoubleQuotedJsString_doubleQuoteEscaped_singleQuoteLiteral | fixed quote `"`, double escaped/single literal |
| testEscapeToDoubleQuotedJsString_backslashDoubled | backslash escape doubled |
| testStrEscape_customQuoteAndEscapeStrings | switch-dispatch ทั่วไปของ strEscape |
| testStrEscape_emptyString_onlyQuoteCharsReturned | Empty string boundary |
| testStrEscape_nullInput_throwsNPE | Null input boundary |
| testIdentifierEscape_pureAsciiIdentifier_unchanged | `NodeUtil.isLatin == true` branch (early return) |
| testIdentifierEscape_nonLatinCharacter_isEscaped | `isLatin == false`, char นอกช่วง 0x1F-0x7F |
| testIdentifierEscape_mixedLatinAndNonLatin_partialEscape | loop ผสม literal/escape ในสตริงเดียว |

**สิ่งที่ไม่ได้ครอบคลุม (และเหตุผล):** `add(Node, Context)`, `addNonEmptyStatement`, `isOneExactlyFunctionOrDo`, `getNonEmptyChildCount`, `getFirstNonEmptyChild`, `isIndirectEval`, `addLeftExpr/addExpr/addList/addArrayList/addCaseBody/addAllSiblings`, context helper methods, และ branch เรื่อง supplementary code point ใน `appendHexJavaScriptRepresentation(int, Appendable)` (unreachable จาก path ที่ให้มาเพราะเรียกด้วย `char` เสมอ) — ทั้งหมดนี้ต้องใช้ `Node`/`Token`/`CodeConsumer`/`NodeUtil`/`TokenStream` ซึ่งไม่มี source ให้มา จึงไม่เขียนทดสอบเพื่อไม่ต้อง "เดา" ตามข้อกำหนดที่ 4