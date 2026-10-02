package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/**
 * Unit test สำหรับ {@link CodeGenerator} (Defects4J Closure-128b)
 *
 * หมายเหตุสำคัญ:
 * ซอร์สของ {@code CodeConsumer} และการสร้าง {@code Node} tree ไม่ได้ถูกให้มาในโจทย์
 * เมธอดที่ต้องพึ่งพา cc.xxx() หรือ Node (เช่น add(Node,Context) ซึ่งเป็น switch-case ใหญ่,
 * addNonEmptyStatement, unrollBinaryOperator, addList, tagAsStrict, forCostEstimation ฯลฯ)
 * จึง "ไม่ถูกทดสอบ" ในไฟล์นี้ เพื่อไม่เดา behavior ของ CodeConsumer ที่ไม่มีในซอร์สที่ให้มา
 * (ตามข้อกำหนดที่ 4) การทดสอบจะเน้นเฉพาะส่วนที่ compile/verify ได้จริงโดยไม่ต้องเดา API ภายนอก
 */
public class CodeGeneratorTest {

  private static final char DQ = '"';

  private static String wrap(String content) {
    return DQ + content + DQ;
  }

  /**
   * สร้าง CodeGenerator โดยไม่แตะ cc เลย (ใช้ null ได้เพราะ constructor ไม่ dereference
   * consumer และเมธอดที่เราจะเทสต์ - escapeToDoubleQuotedJsString / regexpEscape - ไม่เรียก cc)
   *
   * สมมติฐาน: CompilerOptions มี no-arg constructor และ field preferSingleQuotes / trustedStrings
   * เป็น field ระดับ package (อนุมานได้จากซอร์ส CodeGenerator ที่เข้าถึง options.preferSingleQuotes
   * และ options.trustedStrings โดยตรงแบบ field access ไม่ใช่ getter)
   */
  private CodeGenerator newGenerator(boolean preferSingleQuotes, boolean trustedStrings) {
    CompilerOptions options = new CompilerOptions();
    options.preferSingleQuotes = preferSingleQuotes;
    options.trustedStrings = trustedStrings;
    return new CodeGenerator(null, options);
  }

  // ================= isSimpleNumber =================

  @Test
  public void isSimpleNumber_emptyString_false() {
    // boundary: len == 0
    assertFalse(CodeGenerator.isSimpleNumber(""));
  }

  @Test
  public void isSimpleNumber_leadingZero_false() {
    // เงื่อนไข s.charAt(0) != '0'
    assertFalse(CodeGenerator.isSimpleNumber("0"));
    assertFalse(CodeGenerator.isSimpleNumber("0123"));
  }

  @Test
  public void isSimpleNumber_allDigitsNoLeadingZero_true() {
    assertTrue(CodeGenerator.isSimpleNumber("5"));
    assertTrue(CodeGenerator.isSimpleNumber("123"));
  }

  @Test
  public void isSimpleNumber_containsNonDigit_false() {
    // for-loop: branch c < '0' || c > '9' == true -> return false ทันที
    assertFalse(CodeGenerator.isSimpleNumber("12a3"));
    assertFalse(CodeGenerator.isSimpleNumber("-123"));
  }

  // ================= getSimpleNumber =================

  @Test
  public void getSimpleNumber_notSimpleNumber_NaN() {
    // isSimpleNumber() == false -> return NaN ทันที (ไม่เข้า try)
    assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("")));
    assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("0123")));
    assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("12a")));
    assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("-5")));
  }

  @Test
  public void getSimpleNumber_validSmallNumber_returnsValue() {
    // l < NodeUtil.MAX_POSITIVE_INTEGER_NUMBER == true
    assertEquals(123.0, CodeGenerator.getSimpleNumber("123"), 0.0);
  }

  @Test
  public void getSimpleNumber_tooManyDigits_numberFormatException_NaN() {
    // ยาวเกิน long รับได้ -> NumberFormatException ถูก catch -> NaN
    assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("99999999999999999999")));
  }

  @Test
  public void getSimpleNumber_withinLongRangeButExceedsMax_NaN() {
    // สมมติฐาน: NodeUtil.MAX_POSITIVE_INTEGER_NUMBER (~2^53) เล็กกว่า Long.MAX_VALUE มาก
    // จึงใช้ Long.MAX_VALUE เพื่อดัน branch "l < MAX_POSITIVE_INTEGER_NUMBER" ให้เป็น false
    // (parse สำเร็จ ไม่ throw แต่ falls through ไป return Double.NaN ท้ายเมธอด)
    assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("9223372036854775807")));
  }

  // ================= identifierEscape =================

  @Test
  public void identifierEscape_pureAscii_unchanged() {
    // สมมติฐาน: NodeUtil.isLatin("myVar") == true (ข้อความ ASCII ล้วน) -> return s ทันที
    assertEquals("myVar", CodeGenerator.identifierEscape("myVar"));
  }

  @Test
  public void identifierEscape_emptyString_unchanged() {
    assertEquals("", CodeGenerator.identifierEscape(""));
  }

  @Test
  public void identifierEscape_nonLatinChar_escaped() {
    // สมมติฐาน: ตัวอักษรจีน (นอกช่วง ASCII) ทำให้ NodeUtil.isLatin คืนค่า false แน่นอน
    // -> เข้า loop, อักษร 'a'/'b' อยู่ในช่วง (0x1F,0x7F) ถูกคงไว้, อักษรจีนถูก hex-escape
    assertEquals("a\\u4e2db", CodeGenerator.identifierEscape("a\u4e2db"));
  }

  // ================= escapeToDoubleQuotedJsString (ครอบคลุม strEscape) =================

  @Test
  public void escapeDouble_basicString_wrappedInQuotes() {
    CodeGenerator cg = newGenerator(false, true);
    assertEquals(wrap("abc"), cg.escapeToDoubleQuotedJsString("abc"));
  }

  @Test
  public void escapeDouble_nullChar() {
    CodeGenerator cg = newGenerator(false, true);
    assertEquals(wrap("\\x00"), cg.escapeToDoubleQuotedJsString("\0"));
  }

  @Test
  public void escapeDouble_singleEscapeCharacters() {
    CodeGenerator cg = newGenerator(false, true);
    assertEquals(wrap("\\b"), cg.escapeToDoubleQuotedJsString("\b"));
    assertEquals(wrap("\\f"), cg.escapeToDoubleQuotedJsString("\f"));
    assertEquals(wrap("\\n"), cg.escapeToDoubleQuotedJsString("\n"));
    assertEquals(wrap("\\r"), cg.escapeToDoubleQuotedJsString("\r"));
    assertEquals(wrap("\\t"), cg.escapeToDoubleQuotedJsString("\t"));
  }

  @Test
  public void escapeDouble_backslashAndQuotes() {
    CodeGenerator cg = newGenerator(false, true);
    assertEquals(wrap("\\\\"), cg.escapeToDoubleQuotedJsString("\\"));
    assertEquals(wrap("\\\""), cg.escapeToDoubleQuotedJsString("\""));
    assertEquals(wrap("'"), cg.escapeToDoubleQuotedJsString("'"));
  }

  @Test
  public void escapeDouble_lineTerminators() {
    CodeGenerator cg = newGenerator(false, true);
    assertEquals(wrap("\\u2028"), cg.escapeToDoubleQuotedJsString("\u2028"));
    assertEquals(wrap("\\u2029"), cg.escapeToDoubleQuotedJsString("\u2029"));
  }

  @Test
  public void escapeDouble_verticalTab_noSlashV_usesHex() {
    // escapeToDoubleQuotedJsString ส่ง useSlashV = false เสมอ -> ต้องได้ \x0B ไม่ใช่ \v
    CodeGenerator cg = newGenerator(false, true);
    assertEquals(wrap("\\x0B"), cg.escapeToDoubleQuotedJsString("\u000B"));
  }

  @Test
  public void escapeDouble_equalsAndAmp_trustedStrings_true() {
    CodeGenerator cg = newGenerator(false, true);
    assertEquals(wrap("="), cg.escapeToDoubleQuotedJsString("="));
    assertEquals(wrap("&"), cg.escapeToDoubleQuotedJsString("&"));
  }

  @Test
  public void escapeDouble_equalsAndAmp_trustedStrings_false() {
    CodeGenerator cg = newGenerator(false, false);
    assertEquals(wrap("\\x3d"), cg.escapeToDoubleQuotedJsString("="));
    assertEquals(wrap("\\x26"), cg.escapeToDoubleQuotedJsString("&"));
  }

  @Test
  public void escapeDouble_gt_untrusted_alwaysEscaped() {
    // !trustedStrings && !isRegexp == true -> escape ทันทีไม่ว่าตำแหน่งไหน
    CodeGenerator cg = newGenerator(false, false);
    assertEquals(wrap("\\x3e"), cg.escapeToDoubleQuotedJsString(">"));
  }

  @Test
  public void escapeDouble_gt_trusted_afterDoubleDash_escaped() {
    CodeGenerator cg = newGenerator(false, true);
    assertEquals(wrap("--\\x3e"), cg.escapeToDoubleQuotedJsString("-->"));
  }

  @Test
  public void escapeDouble_gt_trusted_afterDoubleBracket_escaped() {
    CodeGenerator cg = newGenerator(false, true);
    assertEquals(wrap("]]\\x3e"), cg.escapeToDoubleQuotedJsString("]]>"));
  }

  @Test
  public void escapeDouble_gt_trusted_noSpecialPrefix_literal() {
    CodeGenerator cg = newGenerator(false, true);
    assertEquals(wrap("a>b"), cg.escapeToDoubleQuotedJsString("a>b"));
  }

  @Test
  public void escapeDouble_gt_trusted_indexLessThanTwo_literal() {
    // boundary: i (== 0) >= 2 เป็น false -> ไม่ escape
    CodeGenerator cg = newGenerator(false, true);
    assertEquals(wrap(">"), cg.escapeToDoubleQuotedJsString(">"));
  }

  @Test
  public void escapeDouble_lt_untrusted_alwaysEscaped() {
    CodeGenerator cg = newGenerator(false, false);
    assertEquals(wrap("\\x3c"), cg.escapeToDoubleQuotedJsString("<"));
  }

  @Test
  public void escapeDouble_lt_trusted_endScript_caseInsensitive_escaped() {
    CodeGenerator cg = newGenerator(false, true);
    assertEquals(wrap("\\x3c/script>"), cg.escapeToDoubleQuotedJsString("</script>"));
  }

  @Test
  public void escapeDouble_lt_trusted_startComment_escaped() {
    CodeGenerator cg = newGenerator(false, true);
    assertEquals(wrap("\\x3c!--"), cg.escapeToDoubleQuotedJsString("<!--"));
  }

  @Test
  public void escapeDouble_lt_trusted_noMatch_literal() {
    CodeGenerator cg = newGenerator(false, true);
    assertEquals(wrap("<div>"), cg.escapeToDoubleQuotedJsString("<div>"));
  }

  @Test
  public void escapeDouble_defaultBranch_nullEncoder_charRangeBoundaries() {
    CodeGenerator cg = newGenerator(false, true);
    // boundary: c > 0x1f false (c == 0x1f) -> escape
    assertEquals(wrap("\\u001f"), cg.escapeToDoubleQuotedJsString("\u001f"));
    // boundary: c > 0x1f true, c < 0x7f true (c == 0x20) -> literal
    assertEquals(wrap(" "), cg.escapeToDoubleQuotedJsString(" "));
    // boundary: c < 0x7f true (c == 0x7e) -> literal
    assertEquals(wrap("~"), cg.escapeToDoubleQuotedJsString("~"));
    // boundary: c < 0x7f false (c == 0x7f) -> escape
    assertEquals(wrap("\\u007f"), cg.escapeToDoubleQuotedJsString("\u007f"));
  }

  // ================= regexpEscape (isRegexp = true) =================

  @Test
  public void regexpEscape_equalsAndAmp_ignoresTrustedStrings() {
    // isRegexp == true -> (trustedStrings || isRegexp) เป็น true เสมอ ไม่ว่า trustedStrings จะเป็นอะไร
    CodeGenerator cgTrusted = newGenerator(false, true);
    CodeGenerator cgUntrusted = newGenerator(false, false);
    assertEquals("/=/", cgTrusted.regexpEscape("="));
    assertEquals("/=/", cgUntrusted.regexpEscape("="));
    assertEquals("/&/", cgTrusted.regexpEscape("&"));
    assertEquals("/&/", cgUntrusted.regexpEscape("&"));
  }

  @Test
  public void regexpEscape_ltgt_alwaysNestedLogic_regardlessOfTrustedStrings() {
    // isRegexp == true -> (!trustedStrings && !isRegexp) เป็น false เสมอ
    // จึงใช้ nested logic (script/comment, --/]] detection) เสมอไม่ว่า trustedStrings จะเป็นอะไร
    CodeGenerator cgTrusted = newGenerator(false, true);
    CodeGenerator cgUntrusted = newGenerator(false, false);
    assertEquals("/--\\x3e/", cgTrusted.regexpEscape("-->"));
    assertEquals("/--\\x3e/", cgUntrusted.regexpEscape("-->"));
  }

  @Test
  public void regexpEscape_withEncoder_canEncode_literal() {
    CodeGenerator cg = newGenerator(false, true);
    CharsetEncoder asciiEncoder = Charset.forName("US-ASCII").newEncoder();
    assertEquals("/a/", cg.regexpEscape("a", asciiEncoder));
  }

  @Test
  public void regexpEscape_withEncoder_cannotEncode_hexEscaped() {
    CodeGenerator cg = newGenerator(false, true);
    CharsetEncoder asciiEncoder = Charset.forName("US-ASCII").newEncoder();
    // 'é' (U+00E9) ไม่สามารถเข้ารหัสด้วย US-ASCII ได้แน่นอน (พฤติกรรมมาตรฐานของ JDK)
    assertEquals("/\\u00e9/", cg.regexpEscape("\u00e9", asciiEncoder));
  }

  @Test
  public void regexpEscape_noArgOverload_delegatesWithNullEncoder() {
    CodeGenerator cg = newGenerator(false, true);
    // regexpEscape(String) ควรให้ผลเหมือน regexpEscape(String, null)
    assertEquals(cg.regexpEscape("abc", null), cg.regexpEscape("abc"));
  }

  // ================= Constructor branch (outputCharset) =================

  @Test
  public void constructor_defaultOptions_outputCharsetNull_noException() {
    // ครอบคลุม branch: outputCharset == null -> outputCharsetEncoder = null
    // หมายเหตุ: ไม่พบ setter สำหรับ outputCharset ในซอร์สที่ให้มา (มีเพียง getOutputCharset())
    // จึงไม่สามารถทดสอบ branch "else" (charset ที่ไม่ใช่ null และไม่ใช่ US_ASCII) ได้
    // โดยไม่เดา API ของ CompilerOptions เพิ่มเติม
    CompilerOptions options = new CompilerOptions();
    CodeGenerator cg = new CodeGenerator(null, options);
    assertNotNull(cg);
  }

  // ================= appendHexJavaScriptRepresentation (dead-code branch via reflection) =================

  @Test
  public void appendHexJavaScriptRepresentation_supplementaryCodePoint_splitsIntoSurrogatePair()
      throws Exception {
    // หมายเหตุ: จากการอ่านซอร์ส ทุกจุดเรียกเมธอดนี้ด้วย "char" เดี่ยวเสมอ (ไม่มีทางที่ codePoint
    // จะเป็น supplementary code point ผ่าน public/package API ปกติของคลาสนี้) จึงใช้ reflection
    // เรียกเมธอด private static ตรง ๆ เพื่อทดสอบ branch Character.isSupplementaryCodePoint == true
    int emoji = 0x1F600;
    Method m = CodeGenerator.class.getDeclaredMethod(
        "appendHexJavaScriptRepresentation", int.class, Appendable.class);
    m.setAccessible(true);

    StringBuilder sb = new StringBuilder();
    m.invoke(null, emoji, sb);

    char[] surrogates = Character.toChars(emoji);
    String expected = String.format("\\u%04x", (int) surrogates[0])
        + String.format("\\u%04x", (int) surrogates[1]);
    assertEquals(expected, sb.toString());
  }
}
