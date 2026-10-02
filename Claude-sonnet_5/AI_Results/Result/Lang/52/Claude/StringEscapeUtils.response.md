# JUnit 4 Test Suite สำหรับ `StringEscapeUtils` (Lang-52b)

```java
package org.apache.commons.lang;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import org.apache.commons.lang.exception.NestableRuntimeException;
import org.junit.Test;

/**
 * Unit tests for {@link StringEscapeUtils} (Defects4J Lang-52b)
 * มุ่งเน้น branch coverage ให้มากที่สุดเท่าที่วิเคราะห์ได้จาก source ที่ให้มา
 */
public class StringEscapeUtilsTest {

    // ===================================================================
    // escapeJava(String) / escapeJavaScript(String)
    // ===================================================================

    @Test
    public void testEscapeJava_null() {
        assertNull(StringEscapeUtils.escapeJava(null));
    }

    @Test
    public void testEscapeJava_empty() {
        assertEquals("", StringEscapeUtils.escapeJava(""));
    }

    @Test
    public void testEscapeJava_doubleQuoteAndSingleQuoteNotEscaped() {
        // escapeSingleQuotes = false -> single quote ไม่ถูก escape, double quote ถูก escape
        String input = "He didn't say, \"Stop!\"";
        String expected = "He didn't say, \\\"Stop!\\\"";
        assertEquals(expected, StringEscapeUtils.escapeJava(input));
    }

    @Test
    public void testEscapeJavaScript_singleQuoteEscaped() {
        // escapeSingleQuotes = true -> single quote ต้องถูก escape ด้วย
        String input = "He didn't say, \"Stop!\"";
        String expected = "He didn\\'t say, \\\"Stop!\\\"";
        assertEquals(expected, StringEscapeUtils.escapeJavaScript(input));
    }

    @Test
    public void testEscapeJava_backslash() {
        assertEquals("a\\\\b", StringEscapeUtils.escapeJava("a\\b"));
    }

    @Test
    public void testEscapeJava_controlChars() {
        // ครอบคลุม switch-case: \b \n \t \f \r
        assertEquals("\\b", StringEscapeUtils.escapeJava("\b"));
        assertEquals("\\n", StringEscapeUtils.escapeJava("\n"));
        assertEquals("\\t", StringEscapeUtils.escapeJava("\t"));
        assertEquals("\\f", StringEscapeUtils.escapeJava("\f"));
        assertEquals("\\r", StringEscapeUtils.escapeJava("\r"));
    }

    @Test
    public void testEscapeJava_controlChar_defaultLowHex() {
        // ch < 32, ไม่ตรง case พิเศษ, ch <= 0xf -> "\\u000" + hex
        // char code 1 (SOH) -> hex "1"
        assertEquals("\\u0001", StringEscapeUtils.escapeJava("\u0001"));
    }

    @Test
    public void testEscapeJava_controlChar_defaultHighHex() {
        // ch < 32, ไม่ตรง case พิเศษ, ch > 0xf -> "\\u00" + hex
        // char code 0x11 (17) -> hex "11"
        assertEquals("\\u0011", StringEscapeUtils.escapeJava("\u0011"));
    }

    @Test
    public void testEscapeJava_unicode_above0x7f() {
        // ch > 0x7f (<=0xff) -> "\\u00" + hex
        assertEquals("\\u0080", StringEscapeUtils.escapeJava("\u0080"));
    }

    @Test
    public void testEscapeJava_unicode_above0xff() {
        // ch > 0xff (<=0xfff) -> "\\u0" + hex
        assertEquals("\\u0100", StringEscapeUtils.escapeJava("\u0100"));
    }

    @Test
    public void testEscapeJava_unicode_above0xfff() {
        // ch > 0xfff -> "\\u" + hex
        assertEquals("\\u1000", StringEscapeUtils.escapeJava("\u1000"));
    }

    @Test
    public void testEscapeJava_normalChar() {
        // default case ของ switch สำหรับ char ปกติในช่วง 32-126
        assertEquals("abcXYZ123", StringEscapeUtils.escapeJava("abcXYZ123"));
    }

    // ===================================================================
    // escapeJava(Writer, String) / escapeJavaScript(Writer, String)
    // ===================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testEscapeJavaWriter_nullWriter() throws IOException {
        StringEscapeUtils.escapeJava(null, "abc");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEscapeJavaScriptWriter_nullWriter() throws IOException {
        StringEscapeUtils.escapeJavaScript(null, "abc");
    }

    @Test
    public void testEscapeJavaWriter_nullString_noEffect() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeJava(writer, null);
        assertEquals("", writer.toString());
    }

    @Test
    public void testEscapeJavaWriter_validInput() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeJava(writer, "a\tb");
        assertEquals("a\\tb", writer.toString());
    }

    // ===================================================================
    // unescapeJava(String)
    // ===================================================================

    @Test
    public void testUnescapeJava_null() {
        assertNull(StringEscapeUtils.unescapeJava(null));
    }

    @Test
    public void testUnescapeJava_empty() {
        assertEquals("", StringEscapeUtils.unescapeJava(""));
    }

    @Test
    public void testUnescapeJava_plainChars() {
        assertEquals("abc", StringEscapeUtils.unescapeJava("abc"));
    }

    @Test
    public void testUnescapeJava_allEscapeCases() {
        // ครอบคลุม switch-case ของ hadSlash: \\ ' " r f t n b
        assertEquals("\\", StringEscapeUtils.unescapeJava("\\\\"));
        assertEquals("'", StringEscapeUtils.unescapeJava("\\'"));
        assertEquals("\"", StringEscapeUtils.unescapeJava("\\\""));
        assertEquals("\r", StringEscapeUtils.unescapeJava("\\r"));
        assertEquals("\f", StringEscapeUtils.unescapeJava("\\f"));
        assertEquals("\t", StringEscapeUtils.unescapeJava("\\t"));
        assertEquals("\n", StringEscapeUtils.unescapeJava("\\n"));
        assertEquals("\b", StringEscapeUtils.unescapeJava("\\b"));
    }

    @Test
    public void testUnescapeJava_defaultSlashCase() {
        // hadSlash=true, ch ไม่ตรง case ใดๆ -> default: out.write(ch)
        assertEquals("x", StringEscapeUtils.unescapeJava("\\x"));
    }

    @Test
    public void testUnescapeJava_unicodeValid() {
        // inUnicode -> parse 4 hex digit สำเร็จ
        assertEquals("A", StringEscapeUtils.unescapeJava("\\u0041"));
    }

    @Test(expected = NestableRuntimeException.class)
    public void testUnescapeJava_unicodeInvalidHex_throws() {
        // NumberFormatException ภายในถูกครอบเป็น NestableRuntimeException
        StringEscapeUtils.unescapeJava("\\uZZZZ");
    }

    @Test
    public void testUnescapeJava_trailingBackslash() {
        // กรณีพิเศษ: \ ที่ปลายสตริง -> ยังคง output '\\' ตาม logic หลัง loop
        assertEquals("ab\\", StringEscapeUtils.unescapeJava("ab\\"));
    }

    @Test
    public void testUnescapeJava_incompleteUnicodeSequence() {
        // ตาม logic จริงของ source: ถ้า unicode buffer ไม่ครบ 4 ตัวอักษรก่อน string จบ
        // จะไม่มีการ output อะไรเลยสำหรับ escape sequence นี้ (ไม่ใช่ error, เป็น behavior ตามโค้ด)
        assertEquals("", StringEscapeUtils.unescapeJava("\\u12"));
    }

    // ===================================================================
    // unescapeJava(Writer, String)
    // ===================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testUnescapeJavaWriter_nullWriter() throws IOException {
        StringEscapeUtils.unescapeJava(null, "abc");
    }

    @Test
    public void testUnescapeJavaWriter_nullString_noEffect() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeJava(writer, null);
        assertEquals("", writer.toString());
    }

    @Test
    public void testUnescapeJavaWriter_validInput() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeJava(writer, "a\\tb");
        assertEquals("a\tb", writer.toString());
    }

    // ===================================================================
    // unescapeJavaScript(String) / unescapeJavaScript(Writer, String)
    // ===================================================================

    @Test
    public void testUnescapeJavaScript_delegatesToUnescapeJava() {
        assertEquals("a\nb", StringEscapeUtils.unescapeJavaScript("a\\nb"));
        assertNull(StringEscapeUtils.unescapeJavaScript(null));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnescapeJavaScriptWriter_nullWriter() throws IOException {
        StringEscapeUtils.unescapeJavaScript(null, "abc");
    }

    @Test
    public void testUnescapeJavaScriptWriter_validInput() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeJavaScript(writer, "a\\nb");
        assertEquals("a\nb", writer.toString());
    }

    // ===================================================================
    // escapeHtml(String) / escapeHtml(Writer, String)
    // ===================================================================

    @Test
    public void testEscapeHtml_null() {
        assertNull(StringEscapeUtils.escapeHtml(null));
    }

    @Test
    public void testEscapeHtml_basic() {
        String input = "\"bread\" & \"butter\"";
        String expected = "&quot;bread&quot; &amp; &quot;butter&quot;";
        assertEquals(expected, StringEscapeUtils.escapeHtml(input));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEscapeHtmlWriter_nullWriter() throws IOException {
        StringEscapeUtils.escapeHtml(null, "abc");
    }

    @Test
    public void testEscapeHtmlWriter_nullString_noEffect() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeHtml(writer, null);
        assertEquals("", writer.toString());
    }

    @Test
    public void testEscapeHtmlWriter_validInput() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeHtml(writer, "<a>");
        assertEquals("&lt;a&gt;", writer.toString());
    }

    // ===================================================================
    // unescapeHtml(String) / unescapeHtml(Writer, String)
    // ===================================================================

    @Test
    public void testUnescapeHtml_null() {
        assertNull(StringEscapeUtils.unescapeHtml(null));
    }

    @Test
    public void testUnescapeHtml_basic() {
        String input = "&quot;bread&quot; &amp; &quot;butter&quot;";
        String expected = "\"bread\" & \"butter\"";
        assertEquals(expected, StringEscapeUtils.unescapeHtml(input));
    }

    @Test
    public void testUnescapeHtml_unrecognizedEntity_leftAsIs() {
        // ตามเอกสาร: entity ที่ไม่รู้จักให้คงไว้ตามเดิม
        assertEquals("&zzzz;x", StringEscapeUtils.unescapeHtml("&zzzz;x"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnescapeHtmlWriter_nullWriter() throws IOException {
        StringEscapeUtils.unescapeHtml(null, "abc");
    }

    @Test
    public void testUnescapeHtmlWriter_nullString_noEffect() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeHtml(writer, null);
        assertEquals("", writer.toString());
    }

    // ===================================================================
    // escapeXml(String) / escapeXml(Writer, String)
    // ===================================================================

    @Test
    public void testEscapeXml_null() {
        assertNull(StringEscapeUtils.escapeXml(null));
    }

    @Test
    public void testEscapeXml_basic() {
        String input = "bread & butter";
        String expected = "bread &amp; butter";
        assertEquals(expected, StringEscapeUtils.escapeXml(input));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEscapeXmlWriter_nullWriter() throws IOException {
        StringEscapeUtils.escapeXml(null, "abc");
    }

    @Test
    public void testEscapeXmlWriter_nullString_noEffect() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeXml(writer, null);
        assertEquals("", writer.toString());
    }

    @Test
    public void testEscapeXmlWriter_validInput() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeXml(writer, "<a>");
        assertEquals("&lt;a&gt;", writer.toString());
    }

    // ===================================================================
    // unescapeXml(String) / unescapeXml(Writer, String)
    // ===================================================================

    @Test
    public void testUnescapeXml_null() {
        assertNull(StringEscapeUtils.unescapeXml(null));
    }

    @Test
    public void testUnescapeXml_basic() {
        assertEquals("<foo>", StringEscapeUtils.unescapeXml("&lt;foo&gt;"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnescapeXmlWriter_nullWriter() throws IOException {
        StringEscapeUtils.unescapeXml(null, "abc");
    }

    @Test
    public void testUnescapeXmlWriter_nullString_noEffect() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeXml(writer, null);
        assertEquals("", writer.toString());
    }

    // ===================================================================
    // escapeSql(String)
    // ===================================================================

    @Test
    public void testEscapeSql_null() {
        assertNull(StringEscapeUtils.escapeSql(null));
    }

    @Test
    public void testEscapeSql_basic() {
        assertEquals("McHale''s Navy", StringEscapeUtils.escapeSql("McHale's Navy"));
    }

    @Test
    public void testEscapeSql_noQuotes() {
        // ไม่มี single quote เลย -> string เดิม
        assertEquals("plain text", StringEscapeUtils.escapeSql("plain text"));
    }

    @Test
    public void testEscapeSql_empty() {
        assertEquals("", StringEscapeUtils.escapeSql(""));
    }
}
```

## สรุปตารางความครอบคลุม (Branch/Condition Coverage)

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testEscapeJava_null/_empty` | `escapeJavaStyleString(String,...)`: str==null, str.length()==0 (loop 0 รอบ) |
| `testEscapeJava_doubleQuoteAndSingleQuoteNotEscaped` | switch `'\''` (escapeSingleQuotes=false), case `'"'` |
| `testEscapeJavaScript_singleQuoteEscaped` | switch `'\''` (escapeSingleQuotes=true) |
| `testEscapeJava_backslash` | case `'\\'` ใน switch หลัก |
| `testEscapeJava_controlChars` | switch(ch<32): case `\b,\n,\t,\f,\r` |
| `testEscapeJava_controlChar_defaultLowHex` | switch default: `ch<=0xf` branch |
| `testEscapeJava_controlChar_defaultHighHex` | switch default: `ch>0xf` branch |
| `testEscapeJava_unicode_above0x7f/above0xff/above0xfff` | if-else chain: `ch>0xfff`, `ch>0xff`, `ch>0x7f` |
| `testEscapeJava_normalChar` | switch default (char ปกติ) |
| `testEscapeJavaWriter_nullWriter`, `testEscapeJavaScriptWriter_nullWriter` | `out==null` → IllegalArgumentException |
| `testEscapeJavaWriter_nullString_noEffect` | `str==null` → return (no-op) |
| `testEscapeJavaWriter_validInput` | เส้นทาง normal execution ของ `escapeJava(Writer,String)` |
| `testUnescapeJava_null/_empty` | `unescapeJava(String)`: str==null, loop 0 รอบ |
| `testUnescapeJava_plainChars` | else branch `out.write(ch)` (ไม่มี `\`) |
| `testUnescapeJava_allEscapeCases` | switch(hadSlash): case `\\ ' " r f t n b` |
| `testUnescapeJava_defaultSlashCase` | switch(hadSlash) default case |
| `testUnescapeJava_unicodeValid` | case `'u'` → inUnicode, unicode.length()==4 สำเร็จ |
| `testUnescapeJava_unicodeInvalidHex_throws` | catch(NumberFormatException) → NestableRuntimeException |
| `testUnescapeJava_trailingBackslash` | หลัง loop: `if(hadSlash)` == true |
| `testUnescapeJava_incompleteUnicodeSequence` | inUnicode ค้างสถานะ, unicode.length()<4 ตอน loop จบ (edge case ตาม source) |
| `testUnescapeJavaWriter_nullWriter` | `out==null` → IllegalArgumentException |
| `testUnescapeJavaWriter_nullString_noEffect` | `str==null` → return |
| `testUnescapeJavaWriter_validInput` | normal execution path |
| `testUnescapeJavaScript_*` | delegate call ไปยัง `unescapeJava` (null และ normal) |
| `testEscapeHtml_null/_basic` | `escapeHtml(String)`: str==null, normal path ผ่าน `Entities.HTML40.escape` |
| `testEscapeHtmlWriter_nullWriter/_nullString/_validInput` | `writer==null`, `string==null`, normal execution |
| `testUnescapeHtml_null/_basic/_unrecognizedEntity_leftAsIs` | `str==null`, normal unescape, entity ไม่รู้จักคงเดิม |
| `testUnescapeHtmlWriter_nullWriter/_nullString_noEffect` | `writer==null`, `string==null` |
| `testEscapeXml_null/_basic` | `escapeXml(String)`: str==null, normal path |
| `testEscapeXmlWriter_nullWriter/_nullString_noEffect/_validInput` | `writer==null`, `str==null`, normal path |
| `testUnescapeXml_null/_basic` | `unescapeXml(String)`: str==null, normal path |
| `testUnescapeXmlWriter_nullWriter/_nullString_noEffect` | `writer==null`, `str==null` |
| `testEscapeSql_null/_basic/_noQuotes/_empty` | `escapeSql(String)`: str==null, มี/ไม่มี quote, empty string |

**หมายเหตุสำคัญ:**
- Branch ของ `catch(IOException)` ใน `escapeJavaStyleString(String,...)`, `unescapeJava(String)`, `escapeHtml(String)`, `unescapeHtml(String)` **ไม่สามารถ trigger ได้จริง** เนื่องจาก `StringWriter` ไม่ throw `IOException` ตามปกติ — จึงไม่ได้เขียนเทสสำหรับ branch นี้ (ตรงตามคอมเมนต์ในซอร์ส "this should never ever happen")
- Test `testUnescapeJava_incompleteUnicodeSequence` อ้างอิงจาก**การ trace logic ของซอร์สโค้ดจริง** ไม่ใช่การเดา behavior — หากผลลัพธ์ไม่ตรงกับที่คาดไว้ อาจเป็นสัญญาณของ fault ในโค้ด
- `Entities` และ `StringUtils` เป็นคลาสที่มีอยู่แล้วใน commons-lang source (Lang-52b) จึงใช้ค่าจริงจากคลาสเหล่านี้ได้โดยไม่ต้อง mock