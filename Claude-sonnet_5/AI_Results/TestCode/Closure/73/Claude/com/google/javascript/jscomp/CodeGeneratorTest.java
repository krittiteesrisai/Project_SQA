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
