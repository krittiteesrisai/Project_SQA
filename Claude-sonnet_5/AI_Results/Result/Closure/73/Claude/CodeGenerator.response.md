# วิเคราะห์คลาสเป้าหมาย

`CodeGenerator` เป็นคลาส **package-private** (`com.google.javascript.jscomp`) เมธอดส่วนใหญ่เป็น `package-private`/`private` และพึ่งพา `Node`, `CodeConsumer`, `Token`, `NodeUtil` ซึ่งเป็นคลาสภายในโปรเจกต์ที่ไม่มี source ให้ตรวจสอบพฤติกรรมแน่ชัด

ผมจึงเลือก **โฟกัสที่เมธอด static utility ที่ไม่ต้องพึ่งพา Node/CodeConsumer** (เช่น `isSimpleNumber`, `getSimpleNumber`, `jsString`, `regexpEscape`, `escapeToDoubleQuotedJsString`, `strEscape`, `identifierEscape`) เพราะสามารถวิเคราะห์ branch ได้ครบจาก source ที่ให้มาจริง ๆ โดยไม่ต้องเดา และเพิ่มการทดสอบ constructor (ผ่าน reflection) กับกรณี null-consumer ที่วิเคราะห์ได้ตรง ๆ จากโค้ด

หมายเหตุ: บางกรณี (เช่น `identifierEscape` กับ non-latin string, หรือค่าคงที่ `NodeUtil.MAX_POSITIVE_INTEGER_NUMBER`) ไม่มีซอร์สให้ตรวจสอบ จึงมีคอมเมนต์กำกับความไม่แน่นอนไว้ในโค้ด

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.common.base.Charsets;
import com.google.javascript.jscomp.CodeGenerator; // ซ้ำซ้อนเพราะ package เดียวกัน แต่ระบุตามข้อกำหนด

import org.junit.Test;

import java.lang.reflect.Field;
import java.nio.charset.CharsetEncoder;

/**
 * Unit tests for {@link CodeGenerator}.
 *
 * หมายเหตุสำคัญ: CodeGenerator เป็นคลาส package-private และเมธอดจำนวนมาก
 * ต้องพึ่งพา Node/CodeConsumer ที่ไม่มี source ให้ตรวจสอบพฤติกรรมชัดเจน
 * จึงเลือกทดสอบเฉพาะเมธอด static utility และ constructor ที่วิเคราะห์
 * branch ได้ตรงจาก source ที่ให้มา เพื่อไม่ให้เดา behavior เกินขอบเขต
 */
public class CodeGeneratorTest {

  // ---------------------------------------------------------------------
  // Constructor branch tests (ตรวจผ่าน reflection field outputCharsetEncoder)
  // ---------------------------------------------------------------------

  private Object getEncoderField(CodeGenerator cg) throws Exception {
    Field f = CodeGenerator.class.getDeclaredField("outputCharsetEncoder");
    f.setAccessible(true);
    return f.get(cg);
  }

  @Test
  public void testConstructor_NullCharset_EncoderIsNull() throws Exception {
    CodeGenerator cg = new CodeGenerator(null, null);
    assertNull(getEncoderField(cg));
  }

  @Test
  public void testConstructor_USASCIICharset_EncoderIsNull() throws Exception {
    CodeGenerator cg = new CodeGenerator(null, Charsets.US_ASCII);
    assertNull(getEncoderField(cg));
  }

  @Test
  public void testConstructor_UTF8Charset_EncoderIsNotNull() throws Exception {
    CodeGenerator cg = new CodeGenerator(null, Charsets.UTF_8);
    assertNotNull(getEncoderField(cg));
  }

  @Test
  public void testConstructor_SingleArg_DelegatesToNullCharset() throws Exception {
    CodeGenerator cg = new CodeGenerator(null);
    assertNull(getEncoderField(cg));
  }

  // ---------------------------------------------------------------------
  // Null-consumer fault-finding tests: ไม่มี null-check บน cc ในซอร์ส
  // ---------------------------------------------------------------------

  @Test(expected = NullPointerException.class)
  public void testAddString_NullConsumer_ThrowsNPE() {
    CodeGenerator cg = new CodeGenerator(null);
    cg.add("test");
  }

  @Test(expected = NullPointerException.class)
  public void testTagAsStrict_NullConsumer_ThrowsNPE() {
    CodeGenerator cg = new CodeGenerator(null);
    cg.tagAsStrict();
  }

  // ---------------------------------------------------------------------
  // isSimpleNumber
  // ---------------------------------------------------------------------

  @Test
  public void testIsSimpleNumber_EmptyString_False() {
    assertFalse(CodeGenerator.isSimpleNumber(""));
  }

  @Test
  public void testIsSimpleNumber_AllDigits_True() {
    assertTrue(CodeGenerator.isSimpleNumber("1234567890"));
  }

  @Test
  public void testIsSimpleNumber_SingleDigit_True() {
    assertTrue(CodeGenerator.isSimpleNumber("0"));
  }

  @Test
  public void testIsSimpleNumber_NonDigitChar_False() {
    assertFalse(CodeGenerator.isSimpleNumber("12a3"));
  }

  @Test
  public void testIsSimpleNumber_NegativeSign_False() {
    assertFalse(CodeGenerator.isSimpleNumber("-123"));
  }

  // ---------------------------------------------------------------------
  // getSimpleNumber
  // ---------------------------------------------------------------------

  @Test
  public void testGetSimpleNumber_ValidSmallNumber() {
    assertEquals(123.0, CodeGenerator.getSimpleNumber("123"), 0.0);
  }

  @Test
  public void testGetSimpleNumber_LeadingZeros() {
    assertEquals(7.0, CodeGenerator.getSimpleNumber("007"), 0.0);
  }

  @Test
  public void testGetSimpleNumber_NotASimpleNumber_ReturnsNaN() {
    assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("12a3")));
  }

  @Test
  public void testGetSimpleNumber_EmptyString_ReturnsNaN() {
    assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("")));
  }

  /**
   * Long.parseLong จะโยน NumberFormatException สำหรับสตริงตัวเลขที่ยาวเกิน
   * ความสามารถของ long (>19 หลัก) โดยไม่มีการ catch ในซอร์ส
   * เทสนี้ยืนยันพฤติกรรมปัจจุบัน (อาจเป็น fault ที่ยังไม่ได้ป้องกัน)
   */
  @Test(expected = NumberFormatException.class)
  public void testGetSimpleNumber_OverflowString_ThrowsNumberFormatException() {
    CodeGenerator.getSimpleNumber("123456789012345678901234567890");
  }

  // ---------------------------------------------------------------------
  // jsString
  // ---------------------------------------------------------------------

  @Test
  public void testJsString_MoreDoubleQuotes_UsesSingleQuoteDelimiter() {
    String s = "a\"b\"c'"; // doubleq=2, singleq=1 -> singleq < doubleq = true
    String result = CodeGenerator.jsString(s, null);
    assertEquals('\'', result.charAt(0));
    assertEquals('\'', result.charAt(result.length() - 1));
    assertTrue(result.contains("\\'")); // single quote ต้องถูก escape
  }

  @Test
  public void testJsString_MoreSingleQuotes_UsesDoubleQuoteDelimiter() {
    String s = "a'b'c\""; // singleq=2, doubleq=1 -> singleq < doubleq = false
    String result = CodeGenerator.jsString(s, null);
    assertEquals('"', result.charAt(0));
    assertEquals('"', result.charAt(result.length() - 1));
    assertTrue(result.contains("\\\"")); // double quote ต้องถูก escape
  }

  @Test
  public void testJsString_EqualQuoteCounts_UsesDoubleQuoteDelimiter() {
    String s = "'\""; // singleq=1, doubleq=1 -> singleq < doubleq = false (เท่ากัน)
    String result = CodeGenerator.jsString(s, null);
    assertEquals('"', result.charAt(0));
    assertEquals('"', result.charAt(result.length() - 1));
  }

  @Test
  public void testJsString_NoQuotes_UsesDoubleQuoteDelimiter() {
    String s = "hello";
    String result = CodeGenerator.jsString(s, null);
    assertEquals("\"hello\"", result);
  }

  // ---------------------------------------------------------------------
  // regexpEscape
  // ---------------------------------------------------------------------

  @Test
  public void testRegexpEscape_NoEncoder_WrapsWithSlash() {
    String result = CodeGenerator.regexpEscape("abc");
    String expected = "/" + "abc" + "/";
    assertEquals(expected, result);
  }

  /**
   * strEscape ไม่มี case สำหรับ '/' จึงไม่ได้ escape เครื่องหมาย '/' ที่อยู่
   * ภายใน regex source เอง — เทสนี้บันทึกพฤติกรรมจริงของโค้ด (อาจเป็นข้อบกพร่อง)
   */
  @Test
  public void testRegexpEscape_EmbeddedSlash_NotEscaped() {
    String result = CodeGenerator.regexpEscape("a/b");
    String expected = "/" + "a/b" + "/";
    assertEquals(expected, result);
  }

  // ---------------------------------------------------------------------
  // escapeToDoubleQuotedJsString
  // ---------------------------------------------------------------------

  @Test
  public void testEscapeToDoubleQuotedJsString_Basic() {
    String input = "a\"b'c";
    String result = CodeGenerator.escapeToDoubleQuotedJsString(input);
    String expected = "\"" + "a" + "\\\"" + "b" + "'" + "c" + "\"";
    assertEquals(expected, result);
  }

  // ---------------------------------------------------------------------
  // strEscape (เรียกตรงเพื่อคุม parameter และครอบคลุมทุก switch-case)
  // ---------------------------------------------------------------------

  @Test
  public void testStrEscape_ControlCharacters() {
    String result = CodeGenerator.strEscape(
        "\0\n\r\t", '"', "\\\"", "'", "\\\\", null);
    String expected = "\"" + "\\0" + "\\n" + "\\r" + "\\t" + "\"";
    assertEquals(expected, result);
  }

  @Test
  public void testStrEscape_Backslash() {
    String backslashEscape = "\\\\";
    String result = CodeGenerator.strEscape(
        "\\", '"', "\\\"", "'", backslashEscape, null);
    String expected = "\"" + backslashEscape + "\"";
    assertEquals(expected, result);
  }

  @Test
  public void testStrEscape_DoubleQuoteEscape() {
    String doublequoteEscape = "\\\"";
    String result = CodeGenerator.strEscape(
        "\"", '"', doublequoteEscape, "'", "\\\\", null);
    String expected = "\"" + doublequoteEscape + "\"";
    assertEquals(expected, result);
  }

  @Test
  public void testStrEscape_SingleQuoteEscape() {
    String singlequoteEscape = "'";
    String result = CodeGenerator.strEscape(
        "'", '"', "\\\"", singlequoteEscape, "\\\\", null);
    String expected = "\"" + singlequoteEscape + "\"";
    assertEquals(expected, result);
  }

  @Test
  public void testStrEscape_GreaterThan_AfterDoubleDash_Escaped() {
    String result = CodeGenerator.strEscape(
        "a-->", '"', "\\\"", "'", "\\\\", null);
    String expected = "\"" + "a--" + "\\>" + "\"";
    assertEquals(expected, result);
  }

  @Test
  public void testStrEscape_GreaterThan_AfterDoubleCloseBracket_Escaped() {
    String result = CodeGenerator.strEscape(
        "]]>", '"', "\\\"", "'", "\\\\", null);
    String expected = "\"" + "]]" + "\\>" + "\"";
    assertEquals(expected, result);
  }

  @Test
  public void testStrEscape_GreaterThan_Normal_NotEscaped() {
    String result = CodeGenerator.strEscape(
        "a>b", '"', "\\\"", "'", "\\\\", null);
    String expected = "\"" + "a>b" + "\"";
    assertEquals(expected, result);
  }

  @Test
  public void testStrEscape_LessThan_BeforeScript_CaseInsensitive_Escaped() {
    String result = CodeGenerator.strEscape(
        "</SCRIPT", '"', "\\\"", "'", "\\\\", null);
    String expected = "\"" + "<\\" + "/SCRIPT" + "\"";
    assertEquals(expected, result);
  }

  @Test
  public void testStrEscape_LessThan_BeforeCommentStart_Escaped() {
    String result = CodeGenerator.strEscape(
        "<!--x", '"', "\\\"", "'", "\\\\", null);
    String expected = "\"" + "<\\" + "!--x" + "\"";
    assertEquals(expected, result);
  }

  @Test
  public void testStrEscape_LessThan_Normal_NotEscaped() {
    String result = CodeGenerator.strEscape(
        "<div", '"', "\\\"", "'", "\\\\", null);
    String expected = "\"" + "<div" + "\"";
    assertEquals(expected, result);
  }

  @Test
  public void testStrEscape_NoEncoder_PrintableAscii_Literal() {
    String result = CodeGenerator.strEscape(
        "abcXYZ019", '"', "\\\"", "'", "\\\\", null);
    String expected = "\"" + "abcXYZ019" + "\"";
    assertEquals(expected, result);
  }

  @Test
  public void testStrEscape_NoEncoder_NonPrintable_UnicodeEscaped() {
    // char 0x80 อยู่นอกช่วง (0x1f, 0x7f] -> ต้อง unicode-escape
    String result = CodeGenerator.strEscape(
        "\u0080", '"', "\\\"", "'", "\\\\", null);
    String expected = "\"" + "\\u0080" + "\"";
    assertEquals(expected, result);
  }

  @Test
  public void testStrEscape_NoEncoder_BelowRangeChar_UnicodeEscaped() {
    // char 0x01 ไม่มากกว่า 0x1f -> ต้อง unicode-escape
    String result = CodeGenerator.strEscape(
        "\u0001", '"', "\\\"", "'", "\\\\", null);
    String expected = "\"" + "\\u0001" + "\"";
    assertEquals(expected, result);
  }

  @Test
  public void testStrEscape_WithEncoder_CanEncode_Literal() {
    CharsetEncoder encoder = Charsets.US_ASCII.newEncoder();
    String result = CodeGenerator.strEscape(
        "a", '"', "\\\"", "'", "\\\\", encoder);
    String expected = "\"" + "a" + "\"";
    assertEquals(expected, result);
  }

  @Test
  public void testStrEscape_WithEncoder_CannotEncode_UnicodeEscaped() {
    // 'é' (\u00e9) ไม่สามารถ encode ได้ด้วย US-ASCII
    CharsetEncoder encoder = Charsets.US_ASCII.newEncoder();
    String result = CodeGenerator.strEscape(
        "\u00e9", '"', "\\\"", "'", "\\\\", encoder);
    String expected = "\"" + "\\u00e9" + "\"";
    assertEquals(expected, result);
  }

  // ---------------------------------------------------------------------
  // identifierEscape
  // ---------------------------------------------------------------------

  /**
   * สมมติฐาน (ไม่สามารถยืนยันได้จาก source ที่ให้มา เพราะไม่มี source ของ
   * NodeUtil.isLatin): สตริง ASCII ตัวอักษรล้วน ๆ ถือเป็น "Latin" จึงคืนค่า
   * เดิมโดยไม่ escape ใด ๆ — เทสนี้ครอบคลุม branch "ไม่ต้อง escape"
   */
  @Test
  public void testIdentifierEscape_PlainAscii_ReturnedUnchanged() {
    String result = CodeGenerator.identifierEscape("abcXYZ");
    assertEquals("abcXYZ", result);
  }
}
```

## ตารางสรุป Branch/Condition ที่ครอบคลุม

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testConstructor_NullCharset_EncoderIsNull` | constructor: `outputCharset == null` → true branch |
| `testConstructor_USASCIICharset_EncoderIsNull` | constructor: `outputCharset == Charsets.US_ASCII` → true branch |
| `testConstructor_UTF8Charset_EncoderIsNotNull` | constructor: เงื่อนไข `==null \|\| ==US_ASCII` → false → else branch (newEncoder) |
| `testConstructor_SingleArg_DelegatesToNullCharset` | constructor overload เดียวพารามิเตอร์ → เรียก this(consumer, null) |
| `testAddString_NullConsumer_ThrowsNPE` | `add(String)` เมื่อ `cc == null` (fault-finding, ไม่มี null-check) |
| `testTagAsStrict_NullConsumer_ThrowsNPE` | `tagAsStrict()` → `add(String)` เส้นทางเดียวกัน |
| `testIsSimpleNumber_EmptyString_False` | loop ไม่ทำงานเลย, `len > 0` → false |
| `testIsSimpleNumber_AllDigits_True` | loop วนครบไม่เจอ non-digit, คืน true |
| `testIsSimpleNumber_SingleDigit_True` | boundary length=1, true |
| `testIsSimpleNumber_NonDigitChar_False` | `c < '0' \|\| c > '9'` → true (return false กลางลูป) |
| `testIsSimpleNumber_NegativeSign_False` | ตัวอักษรแรกไม่ใช่ digit ('-') → false |
| `testGetSimpleNumber_ValidSmallNumber` | `isSimpleNumber==true`, `l < MAX` → true, คืนค่า l |
| `testGetSimpleNumber_LeadingZeros` | boundary เลขนำหน้าศูนย์ |
| `testGetSimpleNumber_NotASimpleNumber_ReturnsNaN` | `isSimpleNumber==false` → NaN |
| `testGetSimpleNumber_EmptyString_ReturnsNaN` | edge case string ว่าง → NaN |
| `testGetSimpleNumber_OverflowString_ThrowsNumberFormatException` | fault-finding: parseLong overflow ไม่มีการจัดการ |
| `testJsString_MoreDoubleQuotes_UsesSingleQuoteDelimiter` | `singleq < doubleq` → true branch |
| `testJsString_MoreSingleQuotes_UsesDoubleQuoteDelimiter` | `singleq < doubleq` → false (singleq>doubleq) |
| `testJsString_EqualQuoteCounts_UsesDoubleQuoteDelimiter` | `singleq < doubleq` → false (เท่ากัน) boundary |
| `testJsString_NoQuotes_UsesDoubleQuoteDelimiter` | boundary ไม่มี quote เลย (0<0 false) |
| `testRegexpEscape_NoEncoder_WrapsWithSlash` | `regexpEscape(String)` overload ที่เรียก `regexpEscape(s,null)` |
| `testRegexpEscape_EmbeddedSlash_NotEscaped` | fault-finding: ไม่มี case escape สำหรับ `/` |
| `testEscapeToDoubleQuotedJsString_Basic` | wrapper เรียก `strEscape` พารามิเตอร์เฉพาะของฟังก์ชันนี้ |
| `testStrEscape_ControlCharacters` | case `\0`,`\n`,`\r`,`\t` |
| `testStrEscape_Backslash` | case `'\\'` |
| `testStrEscape_DoubleQuoteEscape` | case `'"'` |
| `testStrEscape_SingleQuoteEscape` | case `'\''` |
| `testStrEscape_GreaterThan_AfterDoubleDash_Escaped` | `'>' `: `i>=2` true, เงื่อนไข `--` true |
| `testStrEscape_GreaterThan_AfterDoubleCloseBracket_Escaped` | `'>'`: เงื่อนไข `]]` true |
| `testStrEscape_GreaterThan_Normal_NotEscaped` | `'>'`: `i>=2` false → else literal |
| `testStrEscape_LessThan_BeforeScript_CaseInsensitive_Escaped` | `'<'`: regionMatches "/script" true |
| `testStrEscape_LessThan_BeforeCommentStart_Escaped` | `'<'`: regionMatches "!--" true (เมื่อ /script false) |
| `testStrEscape_LessThan_Normal_NotEscaped` | `'<'`: ทั้งสองเงื่อนไข false → else literal |
| `testStrEscape_NoEncoder_PrintableAscii_Literal` | default-case: `encoder==null`, `c>0x1f && c<=0x7f` true |
| `testStrEscape_NoEncoder_NonPrintable_UnicodeEscaped` | default-case: `encoder==null`, เงื่อนไขช่วง false → escape |
| `testStrEscape_NoEncoder_BelowRangeChar_UnicodeEscaped` | default-case: `c<=0x1f` → escape |
| `testStrEscape_WithEncoder_CanEncode_Literal` | default-case: `encoder!=null`, `canEncode==true` |
| `testStrEscape_WithEncoder_CannotEncode_UnicodeEscaped` | default-case: `encoder!=null`, `canEncode==false` → escape |
| `testIdentifierEscape_PlainAscii_ReturnedUnchanged` | `identifierEscape`: `isLatin(s)==true` → คืนค่าเดิม (สมมติฐานตามคอมเมนต์) |

**หมายเหตุความครอบคลุมที่ไม่ได้ทำ:** เมธอด `add(Node,...)`, `addList`, `addExpr`, `addNonEmptyStatement`, `isOneExactlyFunctionOrDo`, `getNonEmptyChildCount`, `getFirstNonEmptyChild` ฯลฯ ต้องพึ่งพา `Node`, `Token`, `CodeConsumer`, `NodeUtil` ซึ่งไม่มี source ให้ยืนยัน behavior การสร้าง mock/stub ที่ถูกต้องจึงไม่ได้ทำเพื่อป้องกันการเดา behavior ตามข้อกำหนดที่ 4