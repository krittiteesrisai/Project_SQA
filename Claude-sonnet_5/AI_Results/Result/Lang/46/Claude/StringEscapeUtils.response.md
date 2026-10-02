# StringEscapeUtilsTest.java

```java
package org.apache.commons.lang;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import org.apache.commons.lang.exception.NestableRuntimeException;
import org.junit.Test;

/**
 * Unit tests for {@link StringEscapeUtils} (Defects4J Lang-46b).
 *
 * หมายเหตุทั่วไป:
 * - escapeHtml/unescapeHtml/escapeXml/unescapeXml ภายในเรียก Entities.HTML40 / Entities.XML
 *   ซึ่ง source ของ Entities ไม่ได้ให้มา จึงทดสอบเฉพาะกรณีที่ถูกระบุไว้อย่างชัดเจนใน Javadoc
 *   ของ StringEscapeUtils เท่านั้น (เช่น 5 entity พื้นฐานของ XML, apostrophe ไม่ถูก escape ใน HTML)
 * - catch (IOException) ใน worker method ที่สร้าง StringWriter เองภายใน (escapeJavaStyleString(String,..),
 *   unescapeJava(String), escapeHtml(String), unescapeHtml(String), escapeCsv(String), unescapeCsv(String))
 *   ไม่สามารถ trigger ได้จาก black-box test เพราะ StringWriter ไม่ throw IOException และ Writer
 *   ถูกสร้างภายในเมธอดเอง ไม่สามารถแทนที่ด้วย mock ได้ -> ไม่ทดสอบ branch นี้ (unreachable จาก public API)
 * - สำหรับเมธอดที่รับ Writer จากภายนอก (escapeJava(Writer,String) ฯลฯ) เราทดสอบการ propagate
 *   IOException จริง โดยใช้ ThrowingWriter (Writer ที่ throw IOException เสมอ) แทนการ guess
 *   behavior ของ Entities
 */
public class StringEscapeUtilsTest {

    /** Writer ที่ throw IOException ทุกครั้งที่เขียน เพื่อทดสอบการ propagate exception จริง */
    private static class ThrowingWriter extends Writer {
        @Override
        public void write(char[] cbuf, int off, int len) throws IOException {
            throw new IOException("boom");
        }
        @Override
        public void flush() throws IOException { }
        @Override
        public void close() throws IOException { }
    }

    // ======================= escapeJava(String) =======================

    @Test
    public void escapeJava_nullInput_returnsNull() {
        assertNull(StringEscapeUtils.escapeJava(null));
    }

    @Test
    public void escapeJava_emptyString_returnsEmpty() {
        assertEquals("", StringEscapeUtils.escapeJava(""));
    }

    @Test
    public void escapeJava_quotesAndApostrophe_exampleFromJavadoc() {
        // ตัวอย่างตรงจาก Javadoc: apostrophe ไม่ escape, double-quote escape
        String input = "He didn't say, \"Stop!\"";
        String expected = "He didn't say, \\\"Stop!\\\"";
        assertEquals(expected, StringEscapeUtils.escapeJava(input));
    }

    @Test
    public void escapeJava_backslashAndForwardSlash() {
        assertEquals("a\\\\b", StringEscapeUtils.escapeJava("a\\b"));
        assertEquals("a\\/b", StringEscapeUtils.escapeJava("a/b"));
    }

    @Test
    public void escapeJava_controlCharsNamedEscapes() {
        assertEquals("\\b", StringEscapeUtils.escapeJava("\b"));
        assertEquals("\\n", StringEscapeUtils.escapeJava("\n"));
        assertEquals("\\t", StringEscapeUtils.escapeJava("\t"));
        assertEquals("\\f", StringEscapeUtils.escapeJava("\f"));
        assertEquals("\\r", StringEscapeUtils.escapeJava("\r"));
    }

    @Test
    public void escapeJava_controlChar_defaultBranch_hexGreaterThanF() {
        // ch < 32, not one of named escapes, ch > 0xf  -> "\u00" + hex (2 digit)
        char ch = 0x15; // 21
        assertEquals("\\u0015", StringEscapeUtils.escapeJava(String.valueOf(ch)));
    }

    @Test
    public void escapeJava_controlChar_defaultBranch_hexLessOrEqualF() {
        // ch < 32, not named escape, ch <= 0xf -> "\u000" + hex (1 digit)
        char ch = 0x0e; // 14
        assertEquals("\\u000E", StringEscapeUtils.escapeJava(String.valueOf(ch)));
    }

    @Test
    public void escapeJava_zeroChar() {
        char ch = 0x00;
        assertEquals("\\u0000", StringEscapeUtils.escapeJava(String.valueOf(ch)));
    }

    @Test
    public void escapeJava_singleQuote_notEscaped() {
        // escapeSingleQuotes = false สำหรับ escapeJava
        assertEquals("'", StringEscapeUtils.escapeJava("'"));
    }

    @Test
    public void escapeJava_del_0x7f_passThroughUnescaped() {
        // boundary: ch == 0x7f ไม่เข้า branch ch<32 และไม่เข้า branch ch>0x7f -> เข้า switch ปกติ default -> คงค่าเดิม
        char ch = 0x7f;
        assertEquals(String.valueOf(ch), StringEscapeUtils.escapeJava(String.valueOf(ch)));
    }

    @Test
    public void escapeJava_boundary_0x80_unicodeTwoZero() {
        // ch > 0x7f, <= 0xff -> "\u00" + hex
        char ch = 0x80;
        assertEquals("\\u0080", StringEscapeUtils.escapeJava(String.valueOf(ch)));
    }

    @Test
    public void escapeJava_boundary_0xff_unicodeTwoZero() {
        char ch = 0xff;
        assertEquals("\\u00FF", StringEscapeUtils.escapeJava(String.valueOf(ch)));
    }

    @Test
    public void escapeJava_boundary_0x100_unicodeOneZero() {
        // ch > 0xff, <= 0xfff -> "\u0" + hex (3 digit)
        char ch = 0x100;
        assertEquals("\\u0100", StringEscapeUtils.escapeJava(String.valueOf(ch)));
    }

    @Test
    public void escapeJava_boundary_0xfff_unicodeOneZero() {
        char ch = 0xfff;
        assertEquals("\\u0FFF", StringEscapeUtils.escapeJava(String.valueOf(ch)));
    }

    @Test
    public void escapeJava_boundary_0x1000_unicodeFullDigits() {
        // ch > 0xfff -> "\u" + hex (4 digit)
        char ch = 0x1000;
        assertEquals("\\u1000", StringEscapeUtils.escapeJava(String.valueOf(ch)));
    }

    // ===================== escapeJavaScript(String) =====================

    @Test
    public void escapeJavaScript_nullInput_returnsNull() {
        assertNull(StringEscapeUtils.escapeJavaScript(null));
    }

    @Test
    public void escapeJavaScript_apostropheEscaped_exampleFromJavadoc() {
        String input = "He didn't say, \"Stop!\"";
        String expected = "He didn\\'t say, \\\"Stop!\\\"";
        assertEquals(expected, StringEscapeUtils.escapeJavaScript(input));
    }

    // ================= escapeJava(Writer,String) / escapeJavaScript(Writer,String) =================

    @Test(expected = IllegalArgumentException.class)
    public void escapeJava_writer_nullWriter_throwsIAE() throws IOException {
        StringEscapeUtils.escapeJava((Writer) null, "abc");
    }

    @Test
    public void escapeJava_writer_nullString_noEffect() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeJava(writer, null);
        assertEquals("", writer.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void escapeJavaScript_writer_nullWriter_throwsIAE() throws IOException {
        StringEscapeUtils.escapeJavaScript((Writer) null, "abc");
    }

    @Test(expected = IOException.class)
    public void escapeJava_writer_ioExceptionPropagates() throws IOException {
        // ไม่ถูก catch ภายใน escapeJava(Writer,String) -> ต้อง propagate ออกมา
        StringEscapeUtils.escapeJava(new ThrowingWriter(), "a");
    }

    // ========================= unescapeJava(String) =========================

    @Test
    public void unescapeJava_nullInput_returnsNull() {
        assertNull(StringEscapeUtils.unescapeJava(null));
    }

    @Test
    public void unescapeJava_emptyString_returnsEmpty() {
        assertEquals("", StringEscapeUtils.unescapeJava(""));
    }

    @Test
    public void unescapeJava_namedEscapes() {
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
    public void unescapeJava_defaultEscape_unknownChar() {
        // default: switch ไม่ตรง case ใด -> เขียน ch เดิม
        assertEquals("q", StringEscapeUtils.unescapeJava("\\q"));
    }

    @Test
    public void unescapeJava_unicodeEscape_valid() {
        assertEquals("A", StringEscapeUtils.unescapeJava("\\u0041"));
    }

    @Test(expected = NestableRuntimeException.class)
    public void unescapeJava_unicodeEscape_invalidHex_throwsNestableRuntimeException() {
        StringEscapeUtils.unescapeJava("\\uZZZZ");
    }

    @Test
    public void unescapeJava_trailingSingleBackslash_preserved() {
        // hadSlash == true ที่ปลาย string -> เขียน backslash ออกมาด้วย
        assertEquals("abc\\", StringEscapeUtils.unescapeJava("abc\\"));
    }

    @Test
    public void unescapeJava_plainCharsPassThrough() {
        assertEquals("abc", StringEscapeUtils.unescapeJava("abc"));
    }

    @Test
    public void unescapeJava_roundTrip_withEscapeJava() {
        String original = "Line1\nTab\tQuote\"Slash\\End";
        String escaped = StringEscapeUtils.escapeJava(original);
        assertEquals(original, StringEscapeUtils.unescapeJava(escaped));
    }

    // ===================== unescapeJavaScript(String) =====================

    @Test
    public void unescapeJavaScript_delegatesToUnescapeJava() {
        assertEquals("'", StringEscapeUtils.unescapeJavaScript("\\'"));
        assertNull(StringEscapeUtils.unescapeJavaScript(null));
    }

    // ================= unescapeJava(Writer,String) =================

    @Test(expected = IllegalArgumentException.class)
    public void unescapeJava_writer_nullWriter_throwsIAE() throws IOException {
        StringEscapeUtils.unescapeJava((Writer) null, "abc");
    }

    @Test
    public void unescapeJava_writer_nullString_noEffect() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeJava(writer, null);
        assertEquals("", writer.toString());
    }

    @Test(expected = IOException.class)
    public void unescapeJava_writer_ioExceptionPropagates() throws IOException {
        StringEscapeUtils.unescapeJava(new ThrowingWriter(), "a");
    }

    @Test(expected = IllegalArgumentException.class)
    public void unescapeJavaScript_writer_nullWriter_throwsIAE() throws IOException {
        StringEscapeUtils.unescapeJavaScript((Writer) null, "abc");
    }

    // ========================= escapeHtml =========================

    @Test
    public void escapeHtml_nullInput_returnsNull() {
        assertNull(StringEscapeUtils.escapeHtml(null));
    }

    @Test
    public void escapeHtml_basicEntities() {
        assertEquals("&lt;", StringEscapeUtils.escapeHtml("<"));
        assertEquals("&gt;", StringEscapeUtils.escapeHtml(">"));
        assertEquals("&amp;", StringEscapeUtils.escapeHtml("&"));
        assertEquals("&quot;", StringEscapeUtils.escapeHtml("\""));
    }

    @Test
    public void escapeHtml_apostrophe_notEscaped_perJavadoc() {
        // Javadoc: "...apostrophe escape character (&apos;) is not a legal entity
        // and so is not supported" -> apostrophe ไม่ถูกแปลง
        assertEquals("'", StringEscapeUtils.escapeHtml("'"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void escapeHtml_writer_nullWriter_throwsIAE() throws IOException {
        StringEscapeUtils.escapeHtml((Writer) null, "abc");
    }

    @Test
    public void escapeHtml_writer_nullString_noEffect() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeHtml(writer, null);
        assertEquals("", writer.toString());
    }

    // ========================= unescapeHtml =========================

    @Test
    public void unescapeHtml_nullInput_returnsNull() {
        assertNull(StringEscapeUtils.unescapeHtml(null));
    }

    @Test
    public void unescapeHtml_basicEntities() {
        assertEquals("<", StringEscapeUtils.unescapeHtml("&lt;"));
        assertEquals(">", StringEscapeUtils.unescapeHtml("&gt;"));
        assertEquals("&", StringEscapeUtils.unescapeHtml("&amp;"));
        assertEquals("\"", StringEscapeUtils.unescapeHtml("&quot;"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void unescapeHtml_writer_nullWriter_throwsIAE() throws IOException {
        StringEscapeUtils.unescapeHtml((Writer) null, "abc");
    }

    @Test
    public void unescapeHtml_writer_nullString_noEffect() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeHtml(writer, null);
        assertEquals("", writer.toString());
    }

    // ========================= escapeXml =========================

    @Test
    public void escapeXml_nullInput_returnsNull() {
        assertNull(StringEscapeUtils.escapeXml(null));
    }

    @Test
    public void escapeXml_fiveBasicEntities() {
        // Javadoc: "Supports only the five basic XML entities (gt, lt, quot, amp, apos)"
        assertEquals("&lt;", StringEscapeUtils.escapeXml("<"));
        assertEquals("&gt;", StringEscapeUtils.escapeXml(">"));
        assertEquals("&amp;", StringEscapeUtils.escapeXml("&"));
        assertEquals("&quot;", StringEscapeUtils.escapeXml("\""));
        assertEquals("&apos;", StringEscapeUtils.escapeXml("'"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void escapeXml_writer_nullWriter_throwsIAE() throws IOException {
        StringEscapeUtils.escapeXml((Writer) null, "abc");
    }

    @Test
    public void escapeXml_writer_nullString_noEffect() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeXml(writer, null);
        assertEquals("", writer.toString());
    }

    // ========================= unescapeXml =========================

    @Test
    public void unescapeXml_nullInput_returnsNull() {
        assertNull(StringEscapeUtils.unescapeXml(null));
    }

    @Test
    public void unescapeXml_fiveBasicEntities() {
        assertEquals("<", StringEscapeUtils.unescapeXml("&lt;"));
        assertEquals(">", StringEscapeUtils.unescapeXml("&gt;"));
        assertEquals("&", StringEscapeUtils.unescapeXml("&amp;"));
        assertEquals("\"", StringEscapeUtils.unescapeXml("&quot;"));
        assertEquals("'", StringEscapeUtils.unescapeXml("&apos;"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void unescapeXml_writer_nullWriter_throwsIAE() throws IOException {
        StringEscapeUtils.unescapeXml((Writer) null, "abc");
    }

    @Test
    public void unescapeXml_writer_nullString_noEffect() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeXml(writer, null);
        assertEquals("", writer.toString());
    }

    // ========================= escapeSql =========================

    @Test
    public void escapeSql_nullInput_returnsNull() {
        assertNull(StringEscapeUtils.escapeSql(null));
    }

    @Test
    public void escapeSql_singleQuoteDoubled() {
        assertEquals("McHale''s Navy", StringEscapeUtils.escapeSql("McHale's Navy"));
    }

    @Test
    public void escapeSql_noQuote_unchanged() {
        assertEquals("plain text", StringEscapeUtils.escapeSql("plain text"));
    }

    // ========================= escapeCsv(String) =========================

    @Test
    public void escapeCsv_nullInput_returnsNull() {
        // ข้อสมมติ: StringUtils.containsNone(null, chars) == true ตาม contract มาตรฐานของ
        // Commons Lang StringUtils (null-safe) ทำให้ str (null) ถูก return ตรง ๆ
        assertNull(StringEscapeUtils.escapeCsv(null));
    }

    @Test
    public void escapeCsv_noSpecialChars_unchangedSameReference() {
        String input = "plain";
        assertSame(input, StringEscapeUtils.escapeCsv(input));
    }

    @Test
    public void escapeCsv_withComma_quoted() {
        assertEquals("\"a,b\"", StringEscapeUtils.escapeCsv("a,b"));
    }

    @Test
    public void escapeCsv_withQuote_quotedAndDoubled() {
        assertEquals("\"a\"\"b\"", StringEscapeUtils.escapeCsv("a\"b"));
    }

    @Test
    public void escapeCsv_withCRLF_quoted() {
        assertEquals("\"a\r\nb\"", StringEscapeUtils.escapeCsv("a\r\nb"));
    }

    // ===================== escapeCsv(Writer,String) =====================

    @Test
    public void escapeCsv_writer_nullString_writesNothing() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeCsv(writer, null);
        assertEquals("", writer.toString());
    }

    @Test
    public void escapeCsv_writer_noSpecialChars_writesAsIs() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeCsv(writer, "plain");
        assertEquals("plain", writer.toString());
    }

    @Test
    public void escapeCsv_writer_withQuote_quotedAndDoubled() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeCsv(writer, "a\"b");
        assertEquals("\"a\"\"b\"", writer.toString());
    }

    @Test(expected = IOException.class)
    public void escapeCsv_writer_ioExceptionPropagates() throws IOException {
        // "a,b" มี comma -> เข้า branch ที่ต้องเขียน CSV_QUOTE ก่อน -> ThrowingWriter จะ throw
        StringEscapeUtils.escapeCsv(new ThrowingWriter(), "a,b");
    }

    // ========================= unescapeCsv(String) =========================

    @Test
    public void unescapeCsv_nullInput_returnsNull() {
        assertNull(StringEscapeUtils.unescapeCsv(null));
    }

    @Test
    public void unescapeCsv_emptyString_unchanged() {
        assertEquals("", StringEscapeUtils.unescapeCsv(""));
    }

    @Test
    public void unescapeCsv_singleChar_lengthLessThanTwo_unchanged() {
        assertEquals("a", StringEscapeUtils.unescapeCsv("a"));
    }

    @Test
    public void unescapeCsv_notWrappedInQuotes_unchanged() {
        assertEquals("ab", StringEscapeUtils.unescapeCsv("ab"));
    }

    @Test
    public void unescapeCsv_quotedButNoSpecialCharsInside_returnedUnchangedWithQuotes() {
        // ตามโค้ดจริง: ถ้า quoteless ไม่มี special char, ตัวแปร str จะไม่ถูก reassign
        // และ out.write(str) จะเขียน "str" เดิม (ที่ยังมี quote ล้อมอยู่) -> ผลลัพธ์ "\"ab\""
        // นี่คือ behavior ที่อนุมานได้ตรงจาก source code (ไม่ใช่การเดา)
        assertEquals("\"ab\"", StringEscapeUtils.unescapeCsv("\"ab\""));
    }

    @Test
    public void unescapeCsv_quotedWithComma_stripsQuotes() {
        assertEquals("a,b", StringEscapeUtils.unescapeCsv("\"a,b\""));
    }

    @Test
    public void unescapeCsv_quotedWithDoubledQuote_unescapesToSingleQuote() {
        // สร้าง input: "a""b" (ล้อมด้วย quote, ภายในมี "" ซึ่งเป็น escaped quote)
        String input = "\"a" + "\"\"" + "b\"";
        assertEquals("a\"b", StringEscapeUtils.unescapeCsv(input));
    }

    // ===================== unescapeCsv(Writer,String) =====================

    @Test
    public void unescapeCsv_writer_nullString_noEffect() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeCsv(writer, null);
        assertEquals("", writer.toString());
    }

    @Test
    public void unescapeCsv_writer_shortString_writesAsIs() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeCsv(writer, "a");
        assertEquals("a", writer.toString());
    }

    @Test
    public void unescapeCsv_writer_notQuoted_writesAsIs() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeCsv(writer, "ab");
        assertEquals("ab", writer.toString());
    }

    @Test(expected = IOException.class)
    public void unescapeCsv_writer_ioExceptionPropagates() throws IOException {
        // str.length() < 2 -> ไป out.write(str) ตรง ๆ -> ThrowingWriter throw
        StringEscapeUtils.unescapeCsv(new ThrowingWriter(), "x");
    }

    // ===================== private hex()/escapeJavaStyleString(String,..) IOException catch =====================

    @Test
    public void note_unreachableCatchBlocks_notTestableFromPublicApi() {
        // escapeJavaStyleString(String,boolean), unescapeJava(String), escapeHtml(String),
        // unescapeHtml(String), escapeCsv(String), unescapeCsv(String)
        // ใช้ StringWriter ภายในซึ่งไม่ throw IOException จริง และสร้าง Writer เองภายในเมธอด
        // (ไม่สามารถแทนที่ด้วย mock จาก test ภายนอกได้) -> catch(IOException) ใน method เหล่านี้
        // ไม่สามารถ cover ได้จาก black-box test; คอมเมนต์นี้ไว้เพื่อบันทึกเหตุผลเท่านั้น ไม่มี assertion
        assertSame(StringEscapeUtils.class, StringEscapeUtils.class);
    }
}
```

## สรุป Branch/Condition Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| escapeJava_nullInput_returnsNull | `str == null` ใน escapeJavaStyleString(String,..) |
| escapeJava_emptyString_returnsEmpty | loop `for` ไม่เข้า (`sz == 0`) |
| escapeJava_quotesAndApostrophe_exampleFromJavadoc | switch case `"`, apostrophe (escapeSingleQuote=false) |
| escapeJava_backslashAndForwardSlash | switch case `\\`, `/` |
| escapeJava_controlCharsNamedEscapes | switch case `\b,\n,\t,\f,\r` ใน `ch<32` |
| escapeJava_controlChar_defaultBranch_hexGreaterThanF | default case, `ch>0xf` |
| escapeJava_controlChar_defaultBranch_hexLessOrEqualF | default case, `ch<=0xf` |
| escapeJava_zeroChar | boundary ch=0 |
| escapeJava_singleQuote_notEscaped | `escapeSingleQuote==false` branch |
| escapeJava_del_0x7f_passThroughUnescaped | boundary ch=0x7f (ไม่เข้า branch unicode/control) |
| escapeJava_boundary_0x80/0xff/0x100/0xfff/0x1000 | เงื่อนไข `ch>0x7f`, `ch>0xff`, `ch>0xfff` ทั้ง 3 ชั้น |
| escapeJavaScript_apostropheEscaped_exampleFromJavadoc | `escapeSingleQuote==true` branch |
| escapeJava(Writer,..)_nullWriter | `out==null` → IllegalArgumentException |
| escapeJava(Writer,..)_nullString | `str==null` return ใน void worker |
| escapeJava_writer_ioExceptionPropagates | ยืนยัน IOException ไม่ถูก swallow ใน public writer-API |
| unescapeJava_namedEscapes | switch cases `\\,',",r,f,t,n,b` ของ hadSlash |
| unescapeJava_defaultEscape_unknownChar | default case ของ hadSlash switch |
| unescapeJava_unicodeEscape_valid / invalidHex | `inUnicode` branch, parse สำเร็จ/ล้มเหลว (NumberFormatException→NestableRuntimeException) |
| unescapeJava_trailingSingleBackslash_preserved | `if(hadSlash)` ท้าย method |
| unescapeJava_plainCharsPassThrough / roundTrip | branch `else { out.write(ch) }`, integration |
| unescapeJavaScript_delegatesToUnescapeJava | wrapper delegation + null |
| unescapeJava(Writer,..) null writer/string/IOException | เหมือนชุด escapeJava writer |
| escapeHtml/_unescapeHtml_* | null checks, writer null IAE, 4 entities, apostrophe-not-escaped |
| escapeXml/unescapeXml_* | null checks, writer null IAE, 5 basic entities |
| escapeSql_* | `str==null`, มี/ไม่มี single quote |
| escapeCsv_nullInput / noSpecialChars / withComma / withQuote / withCRLF | `containsNone(...)` true/false, แต่ละตัวอักษรใน CSV_SEARCH_CHARS |
| escapeCsv(Writer,..)_* + ioExceptionPropagates | `str!=null` write branch, quote-doubling loop, IOException ไม่ถูก catch |
| unescapeCsv_emptyString/singleChar | `length<2` branch |
| unescapeCsv_notWrappedInQuotes | first/last char != quote branch |
| unescapeCsv_quotedButNoSpecialCharsInside | `containsAny==false` (str ไม่ถูก reassign) — จุดสำคัญดักจับ fault |
| unescapeCsv_quotedWithComma / quotedWithDoubledQuote | `containsAny==true` + replace doubled quote |
| unescapeCsv(Writer,..)_* + ioExceptionPropagates | เหมือนชุดข้างบนผ่าน Writer, IOException propagate |
| note_unreachableCatchBlocks_* | บันทึกเหตุผลว่า catch(IOException) ใน private wrapper ไม่ cover ได้จาก black-box |

**ข้อควรระวัง/สมมติฐานที่ระบุชัดในคอมเมนต์:**
- พฤติกรรมของ `Entities.HTML40`/`Entities.XML` อ้างอิงจาก Javadoc ของ `StringEscapeUtils` เท่านั้น ไม่ได้เดาจาก source ที่ไม่มีให้
- `StringUtils.containsNone(null, ...)` สมมติว่า return `true` ตาม contract มาตรฐานของ Commons Lang (null-safe)
- `catch(IOException)` ใน private wrapper ที่สร้าง `StringWriter` เองไม่สามารถ cover ได้ เนื่องจาก `StringWriter` ไม่ throw IOException จริง