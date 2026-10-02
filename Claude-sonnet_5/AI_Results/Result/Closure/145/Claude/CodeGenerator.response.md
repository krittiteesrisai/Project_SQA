# วิเคราะห์และแนวทางการทดสอบ

**ข้อจำกัดที่ต้องเปิดเผยตามข้อกำหนด #4:**
เมธอด `add(Node, Context)`, `addList(...)`, `addExpr(...)` ฯลฯ ต้องพึ่งพา `CodeConsumer`, `Node`, `NodeUtil`, `Token`, `TokenStream` ซึ่ง**ไม่มีซอร์สโค้ดของคลาสเหล่านี้ให้มา** (เช่น method signature ของ `CodeConsumer` ว่าเป็น abstract/interface, มี default behavior อย่างไร) การสร้าง mock/stub ของคลาสเหล่านี้โดยไม่เห็นซอร์สจะเป็นการ "เดา behavior" ซึ่งขัดกับข้อกำหนด #4 จึง **ไม่ทดสอบเมธอดกลุ่มนี้โดยตรง**

สิ่งที่ทดสอบได้อย่างปลอดภัยและมี branch จำนวนมากคือ **static utility methods** (`jsString`, `strEscape`, `regexpEscape`, `escapeToDoubleQuotedJsString`, `identifierEscape`, `appendHexJavaScriptRepresentation`) ซึ่งมี logic ครบถ้วนอยู่ในซอร์สที่ให้มา และเป็นจุดที่ Closure-145 เกี่ยวข้องโดยตรง (string/regex escaping)

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/**
 * Unit tests สำหรับ static utility methods ของ CodeGenerator
 * (com.google.javascript.jscomp.CodeGenerator - Closure-145b)
 *
 * หมายเหตุ: เมธอด add(Node,...) และ constructor ที่ต้องพึ่ง CodeConsumer/Node
 * ไม่ได้ถูกทดสอบ เนื่องจากไม่มีซอร์สโค้ดของ CodeConsumer/Node/NodeUtil ให้มา
 * การสร้าง mock โดยไม่ทราบ contract จริงจะเป็นการเดา behavior
 */
public class CodeGeneratorTest {

  // ==================== jsString(String, CharsetEncoder) ====================

  @Test
  public void testJsString_EmptyString_UsesDoubleQuoteDelimiter() {
    assertEquals("\"\"", CodeGenerator.jsString("", null));
  }

  @Test
  public void testJsString_NoQuotesInInput_UsesDoubleQuoteDelimiter() {
    assertEquals("\"abc\"", CodeGenerator.jsString("abc", null));
  }

  @Test
  public void testJsString_MoreDoubleQuotes_UsesSingleQuoteDelimiter() {
    // singleq(1) < doubleq(2) -> true : quote = ' , " คงเดิม, ' ถูก escape
    assertEquals("'a\"b\"c\\'d'", CodeGenerator.jsString("a\"b\"c'd", null));
  }

  @Test
  public void testJsString_MoreSingleQuotes_UsesDoubleQuoteDelimiter() {
    // singleq(2) < doubleq(1) -> false : quote = " , " ถูก escape, ' คงเดิม
    assertEquals("\"a'b'c\\\"d\"", CodeGenerator.jsString("a'b'c\"d", null));
  }

  @Test
  public void testJsString_EqualQuoteCounts_UsesDoubleQuoteDelimiter() {
    // singleq(1) < doubleq(1) -> false (boundary เท่ากัน)
    assertEquals("\"a'b\\\"c\"", CodeGenerator.jsString("a'b\"c", null));
  }

  @Test
  public void testJsString_WithEncoder_UnencodableChar_IsEscaped() {
    CharsetEncoder encoder = Charset.forName("ISO-8859-1").newEncoder();
    assertEquals("\"\\u0100\"", CodeGenerator.jsString("\u0100", encoder));
  }

  @Test(expected = NullPointerException.class)
  public void testJsString_NullInput_ThrowsNPE() {
    // ไม่มีการตรวจ null ในซอร์ส -> s.length() ใน for-loop จะ throw NPE
    CodeGenerator.jsString(null, null);
  }

  // ==================== strEscape(...) - switch/case ทุกสาขา ====================

  @Test
  public void testStrEscape_NewlineCarriageReturnTab() {
    assertEquals("Qa\\nb\\rc\\tdQ",
        CodeGenerator.strEscape("a\nb\rc\td", 'Q', "DQ", "SQ", "BS", null));
  }

  @Test
  public void testStrEscape_BackslashUsesProvidedEscapeString() {
    assertEquals("QaBSbQ",
        CodeGenerator.strEscape("a\\b", 'Q', "DQ", "SQ", "BS", null));
  }

  @Test
  public void testStrEscape_DoubleAndSingleQuoteUseProvidedEscapeStrings() {
    assertEquals("QaDQbSQcQ",
        CodeGenerator.strEscape("a\"b'c", 'Q', "DQ", "SQ", "BS", null));
  }

  @Test
  public void testStrEscape_GreaterThan_AfterDoubleDash_IsEscaped() {
    assertEquals("Qa--\\>bQ",
        CodeGenerator.strEscape("a-->b", 'Q', "DQ", "SQ", "BS", null));
  }

  @Test
  public void testStrEscape_GreaterThan_AfterDoubleCloseBracket_IsEscaped() {
    assertEquals("Qa]]\\>bQ",
        CodeGenerator.strEscape("a]]>b", 'Q', "DQ", "SQ", "BS", null));
  }

  @Test
  public void testStrEscape_GreaterThan_AtIndexZero_NotEscaped() {
    // i >= 2 เป็นเท็จ (i = 0)
    assertEquals("Q>abQ",
        CodeGenerator.strEscape(">ab", 'Q', "DQ", "SQ", "BS", null));
  }

  @Test
  public void testStrEscape_GreaterThan_AtIndexOne_NotEscaped() {
    // i >= 2 เป็นเท็จ (i = 1)
    assertEquals("Qa>bQ",
        CodeGenerator.strEscape("a>b", 'Q', "DQ", "SQ", "BS", null));
  }

  @Test
  public void testStrEscape_GreaterThan_PrecedingCharsDontMatch_NotEscaped() {
    assertEquals("Qab>cdQ",
        CodeGenerator.strEscape("ab>cd", 'Q', "DQ", "SQ", "BS", null));
  }

  @Test
  public void testStrEscape_LessThan_BeforeScriptLowerCase_IsEscaped() {
    assertEquals("Qa<\\/script>bQ",
        CodeGenerator.strEscape("a</script>b", 'Q', "DQ", "SQ", "BS", null));
  }

  @Test
  public void testStrEscape_LessThan_BeforeScriptUpperCase_IsEscapedCaseInsensitive() {
    assertEquals("Qa<\\/SCRIPT>bQ",
        CodeGenerator.strEscape("a</SCRIPT>b", 'Q', "DQ", "SQ", "BS", null));
  }

  @Test
  public void testStrEscape_LessThan_NotBeforeScript_NotEscaped() {
    assertEquals("Qa<div>bQ",
        CodeGenerator.strEscape("a<div>b", 'Q', "DQ", "SQ", "BS", null));
  }

  @Test
  public void testStrEscape_DefaultChar_NoEncoder_AsciiPassThrough() {
    assertEquals("QAQ",
        CodeGenerator.strEscape("A", 'Q', "DQ", "SQ", "BS", null));
  }

  @Test
  public void testStrEscape_DefaultChar_NoEncoder_LowerBoundary_0x1F_IsEscaped() {
    assertEquals("Q\\u001fQ",
        CodeGenerator.strEscape("\u001f", 'Q', "DQ", "SQ", "BS", null));
  }

  @Test
  public void testStrEscape_DefaultChar_NoEncoder_0x20_PassThrough() {
    assertEquals("Q\u0020Q",
        CodeGenerator.strEscape("\u0020", 'Q', "DQ", "SQ", "BS", null));
  }

  @Test
  public void testStrEscape_DefaultChar_NoEncoder_0x7F_PassThrough() {
    // ตามซอร์ส: c > 0x1f && c <= 0x7f เป็นจริงสำหรับ DEL (0x7F) จึงไม่ escape
    assertEquals("Q\u007fQ",
        CodeGenerator.strEscape("\u007f", 'Q', "DQ", "SQ", "BS", null));
  }

  @Test
  public void testStrEscape_DefaultChar_NoEncoder_Above0x7F_IsEscaped() {
    assertEquals("Q\\u0080Q",
        CodeGenerator.strEscape("\u0080", 'Q', "DQ", "SQ", "BS", null));
  }

  @Test
  public void testStrEscape_DefaultChar_WithEncoder_CanEncode_PassThrough() {
    CharsetEncoder encoder = Charset.forName("ISO-8859-1").newEncoder();
    assertEquals("Q\u00e9Q",
        CodeGenerator.strEscape("\u00e9", 'Q', "DQ", "SQ", "BS", encoder));
  }

  @Test
  public void testStrEscape_DefaultChar_WithEncoder_CannotEncode_IsEscaped() {
    CharsetEncoder encoder = Charset.forName("ISO-8859-1").newEncoder();
    assertEquals("Q\\u0100Q",
        CodeGenerator.strEscape("\u0100", 'Q', "DQ", "SQ", "BS", encoder));
  }

  @Test
  public void testStrEscape_DefaultChar_WithEncoder_ControlCharWithinLatin1_PassThrough() {
    // เมื่อมี encoder เงื่อนไข 0x1f/0x7f จะไม่ถูกใช้ ใช้ canEncode() แทน
    CharsetEncoder encoder = Charset.forName("ISO-8859-1").newEncoder();
    assertEquals("Q\u0001Q",
        CodeGenerator.strEscape("\u0001", 'Q', "DQ", "SQ", "BS", encoder));
  }

  // ==================== regexpEscape ====================

  @Test
  public void testRegexpEscape_NoEncoder_QuotesAndBackslashKeptLiteral() {
    assertEquals("/a\"b'c\\d/", CodeGenerator.regexpEscape("a\"b'c\\d", null));
  }

  @Test
  public void testRegexpEscape_SingleArgOverload_DelegatesWithNullEncoder() {
    assertEquals("/abc/", CodeGenerator.regexpEscape("abc"));
  }

  @Test
  public void testRegexpEscape_NewlineEscaped() {
    assertEquals("/a\\nb/", CodeGenerator.regexpEscape("a\nb", null));
  }

  // ==================== escapeToDoubleQuotedJsString ====================

  @Test
  public void testEscapeToDoubleQuotedJsString_EscapesDoubleQuoteAndBackslash_NotSingleQuote() {
    assertEquals("\"a\\\"b'c\\\\d\"",
        CodeGenerator.escapeToDoubleQuotedJsString("a\"b'c\\d"));
  }

  // ==================== identifierEscape ====================

  @Test
  public void testIdentifierEscape_AllAsciiLatin_ReturnsUnchanged() {
    assertEquals("myVar123", CodeGenerator.identifierEscape("myVar123"));
  }

  @Test
  public void testIdentifierEscape_NonLatinChar_EscapesToUnicode() {
    // สมมติฐาน: NodeUtil.isLatin("中") == false (ไม่มีซอร์สของ NodeUtil ให้ตรวจสอบ)
    assertEquals("\\u4e2d", CodeGenerator.identifierEscape("\u4e2d"));
  }

  @Test
  public void testIdentifierEscape_MixedLatinAndNonLatin() {
    assertEquals("a\\u4e2db", CodeGenerator.identifierEscape("a\u4e2db"));
  }

  // หมายเหตุ: ไม่ทดสอบ identifierEscape(null) เพราะ behavior ขึ้นกับ
  // NodeUtil.isLatin(null) ซึ่งไม่มีซอร์สโค้ดให้ตรวจสอบ (ป้องกันการเดา)

  // ==================== appendHexJavaScriptRepresentation (private, ผ่าน reflection) ====================

  @Test
  public void testAppendHexJavaScriptRepresentation_SupplementaryCodePoint_SplitsIntoSurrogatePair()
      throws Exception {
    Method m = CodeGenerator.class.getDeclaredMethod(
        "appendHexJavaScriptRepresentation", int.class, Appendable.class);
    m.setAccessible(true);
    StringBuilder sb = new StringBuilder();
    // U+1F600 เป็น supplementary code point -> ต้องถูกแยกเป็น surrogate pair
    m.invoke(null, 0x1F600, sb);
    assertEquals("\\ud83d\\ude00", sb.toString());
  }

  @Test
  public void testAppendHexJavaScriptRepresentation_BmpCodePoint_SingleEscape()
      throws Exception {
    Method m = CodeGenerator.class.getDeclaredMethod(
        "appendHexJavaScriptRepresentation", int.class, Appendable.class);
    m.setAccessible(true);
    StringBuilder sb = new StringBuilder();
    m.invoke(null, (int) 'A', sb);
    assertEquals("\\u0041", sb.toString());
  }
}
```

## สรุปตาราง Test Method ↔ Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testJsString_EmptyString_...` | `singleq < doubleq` = false (0<0) → else branch, string ว่าง |
| `testJsString_NoQuotesInInput_...` | เหมือนบน แต่มีเนื้อหา ascii ปกติ |
| `testJsString_MoreDoubleQuotes_...` | `singleq < doubleq` = true → if branch (quote=') |
| `testJsString_MoreSingleQuotes_...` | `singleq < doubleq` = false (2<1) → else branch |
| `testJsString_EqualQuoteCounts_...` | boundary singleq==doubleq → false branch |
| `testJsString_WithEncoder_...` | ส่ง encoder ผ่าน jsString ไปยัง strEscape, branch canEncode=false |
| `testJsString_NullInput_ThrowsNPE` | null input, ไม่มีการเช็ค null |
| `testStrEscape_NewlineCarriageReturnTab` | case `\n`,`\r`,`\t` |
| `testStrEscape_BackslashUsesProvidedEscapeString` | case `\\` |
| `testStrEscape_DoubleAndSingleQuoteUse...` | case `"`, `'` |
| `testStrEscape_GreaterThan_AfterDoubleDash_...` | `i>=2` true + `--` match |
| `testStrEscape_GreaterThan_AfterDoubleCloseBracket_...` | `i>=2` true + `]]` match |
| `testStrEscape_GreaterThan_AtIndexZero_...` | `i>=2` false (i=0) |
| `testStrEscape_GreaterThan_AtIndexOne_...` | `i>=2` false (i=1) |
| `testStrEscape_GreaterThan_PrecedingCharsDontMatch_...` | `i>=2` true, แต่เงื่อนไข `--`/`]]` false |
| `testStrEscape_LessThan_BeforeScriptLowerCase_...` | `regionMatches` true (lowercase) |
| `testStrEscape_LessThan_BeforeScriptUpperCase_...` | `regionMatches` true (case-insensitive) |
| `testStrEscape_LessThan_NotBeforeScript_...` | `regionMatches` false |
| `testStrEscape_DefaultChar_NoEncoder_AsciiPassThrough` | encoder==null, `c>0x1f && c<=0x7f` true |
| `testStrEscape_DefaultChar_NoEncoder_LowerBoundary_0x1F_...` | boundary c==0x1f → false → escape |
| `testStrEscape_DefaultChar_NoEncoder_0x20_...` | boundary c==0x20 → true |
| `testStrEscape_DefaultChar_NoEncoder_0x7F_...` | boundary c==0x7f → true (pass through) |
| `testStrEscape_DefaultChar_NoEncoder_Above0x7F_...` | c==0x80 → false → escape |
| `testStrEscape_DefaultChar_WithEncoder_CanEncode_...` | encoder!=null, `canEncode`=true |
| `testStrEscape_DefaultChar_WithEncoder_CannotEncode_...` | encoder!=null, `canEncode`=false |
| `testStrEscape_DefaultChar_WithEncoder_ControlCharWithinLatin1_...` | แสดงความต่างจาก path encoder==null |
| `testRegexpEscape_*` | ตรวจ parameter การเรียก strEscape ผ่าน regexpEscape ทั้ง 2 overload |
| `testEscapeToDoubleQuotedJsString_...` | ตรวจ escape string เฉพาะของฟังก์ชันนี้ (`"`,`\\` escape, `'` ไม่ escape) |
| `testIdentifierEscape_AllAsciiLatin_...` | fast path `NodeUtil.isLatin()==true` |
| `testIdentifierEscape_NonLatinChar_...` | slow path, escape branch ในลูป |
| `testIdentifierEscape_MixedLatinAndNonLatin` | ผสมทั้ง pass-through และ escape ในลูปเดียว |
| `testAppendHexJavaScriptRepresentation_SupplementaryCodePoint_...` | `Character.isSupplementaryCodePoint()==true` → recursive call |
| `testAppendHexJavaScriptRepresentation_BmpCodePoint_...` | `isSupplementaryCodePoint()==false` → escape ตรง |

**ข้อจำกัดที่เหลือ:** เมธอด `add(Node,...)`, constructor ทั้งสอง, `addNonEmptyExpression`, `addList`, `addCaseBody` ฯลฯ ไม่ได้ถูกทดสอบเพราะต้องใช้ `CodeConsumer`/`Node`/`NodeUtil`/`Token`/`TokenStream` ที่ไม่มีซอร์สโค้ดให้ตรวจสอบ contract จริง — หากต้องการ coverage ในส่วนนี้ ควรจัดหาซอร์สของคลาสเหล่านั้นเพิ่มเติม