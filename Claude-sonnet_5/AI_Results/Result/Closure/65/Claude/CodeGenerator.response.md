# CodeGeneratorTest.java

**หมายเหตุสำคัญก่อนเริ่ม:**
- คลาส `CodeGenerator` เป็น package-private (default access) และ method ส่วนใหญ่ที่ทดสอบได้โดยไม่ต้องพึ่งพา `CodeConsumer`/`Node` (ซึ่งไม่มี source ให้) ก็เป็น package-private เช่นกัน ดังนั้น test class ต้องอยู่ใน package เดียวกัน (`com.google.javascript.jscomp`) — จึงไม่จำเป็นต้องมี `import` แยกสำหรับ `CodeGenerator`
- เนื่องจากไม่มี source ของ `CodeConsumer` และ `Node` ให้มา (มีแค่การอ้างอิงใน `CodeGenerator.java`) การทดสอบ method `add(Node, Context)` (switch-case ขนาดใหญ่) จึงถูก**ข้ามไปโดยเจตนา** เพื่อไม่ให้ต้อง "เดา" API ของ `CodeConsumer`/`Node` ตามข้อกำหนดที่ 4 — เราเลือกทดสอบ constructor และ method ที่ไม่ต้องพึ่ง `cc` (เช่น `jsString`) โดยส่ง `null` เป็น `CodeConsumer` (ใช้ได้เพราะ `jsString()` ไม่เรียกใช้ `cc` เลย)
- `NodeUtil.isLatin(...)` และค่าคงที่ `NodeUtil.MAX_POSITIVE_INTEGER_NUMBER` ไม่มี source ให้ จึงมีการ comment กำกับจุดที่เป็น "สมมติฐานที่สมเหตุสมผล" ไว้ชัดเจน

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import com.google.common.base.Charsets;
import org.junit.Test;

import java.nio.charset.CharsetEncoder;

/**
 * Unit tests for {@link CodeGenerator}.
 *
 * หมายเหตุ: ทดสอบเฉพาะส่วนที่ไม่ต้องพึ่งพา CodeConsumer/Node เนื่องจากไม่มี source
 * ของคลาสเหล่านั้นให้มา (จึงไม่สามารถประกอบ AST หรือ mock CodeConsumer ได้อย่างถูกต้อง
 * โดยไม่เดา API) ตามข้อกำหนดที่ 4 ของงาน
 */
public class CodeGeneratorTest {

  // ---------------------------------------------------------------------
  // isSimpleNumber(String)
  // ---------------------------------------------------------------------

  @Test
  public void testIsSimpleNumber_EmptyString_ReturnsFalse() {
    // boundary: len == 0 -> "len > 0" false
    assertFalse(CodeGenerator.isSimpleNumber(""));
  }

  @Test
  public void testIsSimpleNumber_AllDigits_ReturnsTrue() {
    assertTrue(CodeGenerator.isSimpleNumber("1234567890"));
  }

  @Test
  public void testIsSimpleNumber_WithLetter_ReturnsFalse() {
    assertFalse(CodeGenerator.isSimpleNumber("123a"));
  }

  @Test
  public void testIsSimpleNumber_WithNegativeSign_ReturnsFalse() {
    assertFalse(CodeGenerator.isSimpleNumber("-123"));
  }

  @Test
  public void testIsSimpleNumber_SingleDigit_ReturnsTrue() {
    // boundary: len == 1
    assertTrue(CodeGenerator.isSimpleNumber("7"));
  }

  // ---------------------------------------------------------------------
  // getSimpleNumber(String)
  // ---------------------------------------------------------------------

  @Test
  public void testGetSimpleNumber_ValidNumber_ReturnsValue() {
    assertEquals(123.0, CodeGenerator.getSimpleNumber("123"), 0.0);
  }

  @Test
  public void testGetSimpleNumber_NonNumericString_ReturnsNaN() {
    assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("abc")));
  }

  @Test
  public void testGetSimpleNumber_EmptyString_ReturnsNaN() {
    // isSimpleNumber("") == false -> ตรง else path
    assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("")));
  }

  @Test
  public void testGetSimpleNumber_OverflowLong_ReturnsNaN() {
    // ยาวเกินกว่า Long.parseLong จะรับได้ -> NumberFormatException -> NaN
    String hugeNumber = "999999999999999999999999999999";
    assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber(hugeNumber)));
  }

  // NOTE: กรณี l >= NodeUtil.MAX_POSITIVE_INTEGER_NUMBER (แต่ยัง parse เป็น long ได้)
  // ไม่ได้ทดสอบ เนื่องจากไม่มี source/ค่าคงที่จริงของ NodeUtil.MAX_POSITIVE_INTEGER_NUMBER
  // ให้มาในซอร์สที่ให้ จึงไม่ต้องการเดาค่า boundary ที่แท้จริง

  // ---------------------------------------------------------------------
  // strEscape(...) - ทดสอบ switch-case ทุก branch โดยตรง
  // ---------------------------------------------------------------------

  @Test
  public void testStrEscape_NullChar() {
    String result = CodeGenerator.strEscape("\0", '#', "DQ", "SQ", "BS", null);
    assertEquals("#" + "\\0" + "#", result);
  }

  @Test
  public void testStrEscape_Newline() {
    String result = CodeGenerator.strEscape("\n", '#', "DQ", "SQ", "BS", null);
    assertEquals("#" + "\\n" + "#", result);
  }

  @Test
  public void testStrEscape_CarriageReturn() {
    String result = CodeGenerator.strEscape("\r", '#', "DQ", "SQ", "BS", null);
    assertEquals("#" + "\\r" + "#", result);
  }

  @Test
  public void testStrEscape_Tab() {
    String result = CodeGenerator.strEscape("\t", '#', "DQ", "SQ", "BS", null);
    assertEquals("#" + "\\t" + "#", result);
  }

  @Test
  public void testStrEscape_Backslash_UsesGivenParam() {
    String result = CodeGenerator.strEscape("\\", '#', "DQ", "SQ", "BS", null);
    assertEquals("#" + "BS" + "#", result);
  }

  @Test
  public void testStrEscape_DoubleQuote_UsesGivenParam() {
    String result = CodeGenerator.strEscape("\"", '#', "DQ", "SQ", "BS", null);
    assertEquals("#" + "DQ" + "#", result);
  }

  @Test
  public void testStrEscape_SingleQuote_UsesGivenParam() {
    String result = CodeGenerator.strEscape("'", '#', "DQ", "SQ", "BS", null);
    assertEquals("#" + "SQ" + "#", result);
  }

  @Test
  public void testStrEscape_GreaterThan_AfterDoubleDash_Escaped() {
    String result = CodeGenerator.strEscape("-->", '#', "DQ", "SQ", "BS", null);
    assertEquals("#" + "--" + "\\>" + "#", result);
  }

  @Test
  public void testStrEscape_GreaterThan_AfterDoubleCloseBracket_Escaped() {
    String result = CodeGenerator.strEscape("]]>", '#', "DQ", "SQ", "BS", null);
    assertEquals("#" + "]]" + "\\>" + "#", result);
  }

  @Test
  public void testStrEscape_GreaterThan_NotPreceded_Unchanged() {
    // i < 2 -> เงื่อนไข i>=2 เป็น false
    String result = CodeGenerator.strEscape(">", '#', "DQ", "SQ", "BS", null);
    assertEquals("#" + ">" + "#", result);
  }

  @Test
  public void testStrEscape_LessThan_FollowedByScriptCaseInsensitive_Escaped() {
    // regionMatches(true, ...) -> case-insensitive
    String result = CodeGenerator.strEscape("</SCRIPT", '#', "DQ", "SQ", "BS", null);
    assertEquals("#" + "<\\" + "/SCRIPT" + "#", result);
  }

  @Test
  public void testStrEscape_LessThan_FollowedByCommentStart_Escaped() {
    // regionMatches(false, ...) -> case-sensitive กับ "!--"
    String result = CodeGenerator.strEscape("<!--", '#', "DQ", "SQ", "BS", null);
    assertEquals("#" + "<\\" + "!--" + "#", result);
  }

  @Test
  public void testStrEscape_LessThan_Otherwise_Unchanged() {
    String result = CodeGenerator.strEscape("<x", '#', "DQ", "SQ", "BS", null);
    assertEquals("#" + "<x" + "#", result);
  }

  @Test
  public void testStrEscape_DefaultNoEncoder_InRange_Unchanged() {
    // c = 'A' (0x41) อยู่ในช่วง (0x1f, 0x7f)
    String result = CodeGenerator.strEscape("A", '#', "DQ", "SQ", "BS", null);
    assertEquals("#" + "A" + "#", result);
  }

  @Test
  public void testStrEscape_DefaultNoEncoder_BoundaryLow_0x1F_Escaped() {
    // c = 0x1F ไม่ผ่านเงื่อนไข c>0x1f (boundary)
    String result = CodeGenerator.strEscape("\u001F", '#', "DQ", "SQ", "BS", null);
    assertEquals("#" + "\\u001f" + "#", result);
  }

  @Test
  public void testStrEscape_DefaultNoEncoder_JustAboveLowBoundary_0x20_Unchanged() {
    String result = CodeGenerator.strEscape("\u0020", '#', "DQ", "SQ", "BS", null);
    assertEquals("#" + "\u0020" + "#", result);
  }

  @Test
  public void testStrEscape_DefaultNoEncoder_JustBelowHighBoundary_0x7E_Unchanged() {
    String result = CodeGenerator.strEscape("\u007E", '#', "DQ", "SQ", "BS", null);
    assertEquals("#" + "\u007E" + "#", result);
  }

  @Test
  public void testStrEscape_DefaultNoEncoder_BoundaryHigh_0x7F_Escaped() {
    // c = 0x7F ไม่ผ่านเงื่อนไข c<0x7f (boundary)
    String result = CodeGenerator.strEscape("\u007F", '#', "DQ", "SQ", "BS", null);
    assertEquals("#" + "\\u007f" + "#", result);
  }

  @Test
  public void testStrEscape_WithEncoder_CanEncode_Unchanged() {
    CharsetEncoder iso = Charsets.ISO_8859_1.newEncoder();
    // 'é' (0xE9) อยู่ใน ISO-8859-1 -> canEncode == true
    String result = CodeGenerator.strEscape("\u00E9", '#', "DQ", "SQ", "BS", iso);
    assertEquals("#" + "\u00E9" + "#", result);
  }

  @Test
  public void testStrEscape_WithEncoder_CannotEncode_Escaped() {
    CharsetEncoder iso = Charsets.ISO_8859_1.newEncoder();
    // '中' (0x4E2D) ไม่อยู่ใน ISO-8859-1 -> canEncode == false
    String result = CodeGenerator.strEscape("\u4E2D", '#', "DQ", "SQ", "BS", iso);
    assertEquals("#" + "\\u4e2d" + "#", result);
  }

  // ---------------------------------------------------------------------
  // escapeToDoubleQuotedJsString(String)
  // ---------------------------------------------------------------------

  @Test
  public void testEscapeToDoubleQuotedJsString_Simple() {
    assertEquals("\"simple\"", CodeGenerator.escapeToDoubleQuotedJsString("simple"));
  }

  @Test
  public void testEscapeToDoubleQuotedJsString_DoubleQuoteEscaped() {
    String result = CodeGenerator.escapeToDoubleQuotedJsString("a\"b");
    String expected = "\"" + "a" + "\\" + "\"" + "b" + "\"";
    assertEquals(expected, result);
  }

  @Test
  public void testEscapeToDoubleQuotedJsString_SingleQuoteNotEscaped() {
    String result = CodeGenerator.escapeToDoubleQuotedJsString("a'b");
    assertEquals("\"a'b\"", result);
  }

  @Test
  public void testEscapeToDoubleQuotedJsString_BackslashEscaped() {
    String result = CodeGenerator.escapeToDoubleQuotedJsString("a\\b");
    String expected = "\"" + "a" + "\\\\" + "b" + "\"";
    assertEquals(expected, result);
  }

  @Test
  public void testEscapeToDoubleQuotedJsString_ExtendedCharEscaped() {
    String result = CodeGenerator.escapeToDoubleQuotedJsString("a\u00E9b");
    String expected = "\"" + "a" + "\\u00e9" + "b" + "\"";
    assertEquals(expected, result);
  }

  // ---------------------------------------------------------------------
  // regexpEscape(String) / regexpEscape(String, CharsetEncoder)
  // ---------------------------------------------------------------------

  @Test
  public void testRegexpEscape_Basic() {
    assertEquals("/abc/", CodeGenerator.regexpEscape("abc"));
  }

  @Test
  public void testRegexpEscape_QuotesAndBackslashUnchanged() {
    // ตาม parameter ที่ regexpEscape ใช้ (doublequote/singlequote/backslash เป็น literal)
    String input = "a\"b'c\\d";
    assertEquals("/" + input + "/", CodeGenerator.regexpEscape(input));
  }

  @Test
  public void testRegexpEscape_WithEncoder_CanEncode() {
    CharsetEncoder iso = Charsets.ISO_8859_1.newEncoder();
    String input = "caf\u00E9";
    assertEquals("/" + input + "/", CodeGenerator.regexpEscape(input, iso));
  }

  @Test
  public void testRegexpEscape_WithEncoder_CannotEncode() {
    CharsetEncoder iso = Charsets.ISO_8859_1.newEncoder();
    String input = "caf\u4E2D";
    String expected = "/caf" + "\\u4e2d" + "/";
    assertEquals(expected, CodeGenerator.regexpEscape(input, iso));
  }

  // ---------------------------------------------------------------------
  // identifierEscape(String)
  // ---------------------------------------------------------------------

  @Test
  public void testIdentifierEscape_AllLatin_Unchanged() {
    // สมมติฐาน: NodeUtil.isLatin() คืน true สำหรับ ASCII letters/digits ปกติ
    // (ไม่มี source ของ NodeUtil ให้ตรวจสอบ แต่เป็นสมมติฐานที่สมเหตุสมผลมาก)
    assertEquals("hello123", CodeGenerator.identifierEscape("hello123"));
  }

  @Test
  public void testIdentifierEscape_NonLatin_Escaped() {
    // '\u3042' (ตัวอักษรฮิรางานะ) ไม่ใช่ latin แน่นอน -> ต้องผ่าน loop escape
    String result = CodeGenerator.identifierEscape("a\u3042b");
    assertNotEquals("a\u3042b", result);
    assertTrue(result.contains("\\u3042"));
    assertTrue(result.startsWith("a"));
    assertTrue(result.endsWith("b"));
  }

  // ---------------------------------------------------------------------
  // Constructors + jsString(String) - ทดสอบ branch ของ outputCharsetEncoder
  // ---------------------------------------------------------------------

  @Test
  public void testJsString_DefaultCharsetNull_EscapesExtendedChar() {
    // constructor 1-arg -> charset == null -> outputCharsetEncoder == null
    CodeGenerator gen = new CodeGenerator(null);
    String result = gen.jsString("caf\u00E9");
    assertEquals("\"caf\\u00e9\"", result);
  }

  @Test
  public void testJsString_USASCIICharset_EscapesExtendedChar() {
    // charset == US_ASCII -> ก็ยังทำให้ outputCharsetEncoder == null (ตาม source)
    CodeGenerator gen = new CodeGenerator(null, Charsets.US_ASCII);
    String result = gen.jsString("caf\u00E9");
    assertEquals("\"caf\\u00e9\"", result);
  }

  @Test
  public void testJsString_UTF8Charset_PreservesExtendedChar() {
    // charset อื่นที่ไม่ใช่ null/US_ASCII -> ใช้ encoder จริง -> canEncode('é') == true
    CodeGenerator gen = new CodeGenerator(null, Charsets.UTF_8);
    String result = gen.jsString("caf\u00E9");
    assertEquals("\"caf\u00E9\"", result);
  }

  @Test
  public void testJsString_MoreDoubleQuotes_UsesSingleQuoteDelimiter() {
    // doubleq(2) > singleq(1) -> quote = '\''
    CodeGenerator gen = new CodeGenerator(null);
    String result = gen.jsString("\"\"'");
    String expected = "'" + "\"" + "\"" + "\\" + "'" + "'";
    assertEquals(expected, result);
  }

  @Test
  public void testJsString_MoreSingleQuotes_UsesDoubleQuoteDelimiter() {
    // singleq(2) > doubleq(1) -> else branch -> quote = '"'
    CodeGenerator gen = new CodeGenerator(null);
    String result = gen.jsString("''\"");
    String expected = "\"" + "'" + "'" + "\\" + "\"" + "\"";
    assertEquals(expected, result);
  }

  @Test
  public void testJsString_EqualQuoteCounts_UsesDoubleQuoteDelimiter() {
    // singleq == doubleq (1,1) -> singleq<doubleq เป็น false -> else branch
    CodeGenerator gen = new CodeGenerator(null);
    String result = gen.jsString("a'b\"c");
    String expected = "\"" + "a'b" + "\\" + "\"" + "c" + "\"";
    assertEquals(expected, result);
  }

  @Test
  public void testJsString_NoQuotes_UsesDoubleQuoteDelimiter() {
    CodeGenerator gen = new CodeGenerator(null);
    assertEquals("\"hello\"", gen.jsString("hello"));
  }

  // ---------------------------------------------------------------------
  // tagAsStrict() - ทดสอบผ่าน add(String) โดยตรงไม่ได้เพราะต้องพึ่ง cc.add()
  // ซึ่งต้อง mock CodeConsumer (ไม่มี source ให้) จึงข้ามการทดสอบนี้ตามข้อกำหนดที่ 4
  // ---------------------------------------------------------------------
}
```

## สรุปตาราง Test coverage

| กลุ่ม Method | Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| `isSimpleNumber` | testIsSimpleNumber_EmptyString_ReturnsFalse | `len > 0` = false (boundary len=0) |
| | testIsSimpleNumber_AllDigits_ReturnsTrue | loop ผ่านทุกตัว, return true |
| | testIsSimpleNumber_WithLetter_ReturnsFalse | `c<'0' || c>'9'` = true (break early) |
| | testIsSimpleNumber_WithNegativeSign_ReturnsFalse | เครื่องหมาย `-` ไม่ผ่านเงื่อนไข |
| | testIsSimpleNumber_SingleDigit_ReturnsTrue | boundary len=1 |
| `getSimpleNumber` | testGetSimpleNumber_ValidNumber_ReturnsValue | isSimpleNumber=true, parse สำเร็จ |
| | testGetSimpleNumber_NonNumericString_ReturnsNaN | isSimpleNumber=false |
| | testGetSimpleNumber_EmptyString_ReturnsNaN | isSimpleNumber=false (empty) |
| | testGetSimpleNumber_OverflowLong_ReturnsNaN | catch(NumberFormatException) branch |
| `strEscape` | testStrEscape_NullChar/Newline/CarriageReturn/Tab | case `\0`,`\n`,`\r`,`\t` |
| | testStrEscape_Backslash/DoubleQuote/SingleQuote_UsesGivenParam | case `\\`,`"`,`'` |
| | testStrEscape_GreaterThan_AfterDoubleDash_Escaped | `>` หลัง `--` → escape |
| | testStrEscape_GreaterThan_AfterDoubleCloseBracket_Escaped | `>` หลัง `]]` → escape |
| | testStrEscape_GreaterThan_NotPreceded_Unchanged | `i>=2` = false |
| | testStrEscape_LessThan_FollowedByScriptCaseInsensitive_Escaped | `regionMatches(true,...END_SCRIPT)` = true |
| | testStrEscape_LessThan_FollowedByCommentStart_Escaped | `regionMatches(false,...START_COMMENT)` = true |
| | testStrEscape_LessThan_Otherwise_Unchanged | ทั้งสอง regionMatches = false |
| | testStrEscape_DefaultNoEncoder_InRange_Unchanged | encoder==null, in-range |
| | testStrEscape_DefaultNoEncoder_BoundaryLow_0x1F_Escaped | boundary `c>0x1f` = false |
| | testStrEscape_DefaultNoEncoder_JustAboveLowBoundary_0x20_Unchanged | boundary ผ่าน low |
| | testStrEscape_DefaultNoEncoder_JustBelowHighBoundary_0x7E_Unchanged | boundary ผ่าน high |
| | testStrEscape_DefaultNoEncoder_BoundaryHigh_0x7F_Escaped | boundary `c<0x7f` = false |
| | testStrEscape_WithEncoder_CanEncode_Unchanged | encoder!=null, canEncode=true |
| | testStrEscape_WithEncoder_CannotEncode_Escaped | encoder!=null, canEncode=false |
| `escapeToDoubleQuotedJsString` | testEscapeToDoubleQuotedJsString_* (5 tests) | quote/backslash/extended-char branches ผ่าน fixed params |
| `regexpEscape` | testRegexpEscape_Basic | 1-arg overload, delimiter `/` |
| | testRegexpEscape_QuotesAndBackslashUnchanged | literal passthrough params เฉพาะของ regexp |
| | testRegexpEscape_WithEncoder_CanEncode/CannotEncode | 2-arg overload + encoder branch |
| `identifierEscape` | testIdentifierEscape_AllLatin_Unchanged | early-return เมื่อ isLatin=true (สมมติฐาน) |
| | testIdentifierEscape_NonLatin_Escaped | loop escape สำหรับ char นอกช่วง 0x1F-0x7F |
| Constructor + `jsString` | testJsString_DefaultCharsetNull_EscapesExtendedChar | charset==null → encoder==null |
| | testJsString_USASCIICharset_EscapesExtendedChar | charset==US_ASCII → encoder==null |
| | testJsString_UTF8Charset_PreservesExtendedChar | charset อื่น → encoder!=null |
| | testJsString_MoreDoubleQuotes_UsesSingleQuoteDelimiter | `singleq<doubleq` = true |
| | testJsString_MoreSingleQuotes_UsesDoubleQuoteDelimiter | `singleq<doubleq` = false (single มากกว่า) |
| | testJsString_EqualQuoteCounts_UsesDoubleQuoteDelimiter | `singleq<doubleq` = false (เท่ากัน) |
| | testJsString_NoQuotes_UsesDoubleQuoteDelimiter | ไม่มี quote เลย |

**จุดที่ไม่ได้ทดสอบ (พร้อมเหตุผล ตามข้อกำหนดที่ 4):**
- `add(Node, Context)` และ helper ที่เกี่ยวข้อง (`addLeftExpr`, `addExpr`, `addList`, `addNonEmptyStatement`, `isOneExactlyFunctionOrDo`, `getNonEmptyChildCount`, `getFirstNonEmptyChild`, `tagAsStrict`, `add(String)`, `addJsString`) — ต้องพึ่งพา `CodeConsumer` และ `Node` ซึ่งไม่มี source ให้ตรวจสอบ API จริง
- boundary ของ `NodeUtil.MAX_POSITIVE_INTEGER_NUMBER` ใน `getSimpleNumber` — ไม่มีค่าคงที่จริงให้ตรวจสอบ
- `appendHexJavaScriptRepresentation(int, Appendable)` กรณี supplementary code point — ไม่สามารถ trigger ได้จาก path ที่มีอยู่ (เรียกด้วย `char` เท่านั้นซึ่งไม่มีทาง exceed `0xFFFF`)