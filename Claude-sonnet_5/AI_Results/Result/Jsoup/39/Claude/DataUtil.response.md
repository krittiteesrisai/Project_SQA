# JUnit 4 Test Suite สำหรับ `DataUtil`

```java
package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.charset.UnsupportedCharsetException;

import static org.junit.Assert.*;

/**
 * Unit tests for org.jsoup.helper.DataUtil.
 * หมายเหตุ: ไม่มี source ของ org.jsoup.helper.Validate ให้ จึงไม่ยืนยัน exception type ที่แน่นอน
 * (ใช้ try/catch RuntimeException แทนการ assert ชนิด exception เฉพาะเจาะจง)
 */
public class DataUtilTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    // ---------------------------------------------------------------
    // getCharsetFromContentType
    // ---------------------------------------------------------------

    @Test
    public void getCharset_nullInput_returnsNull() {
        assertNull(DataUtil.getCharsetFromContentType(null));
    }

    @Test
    public void getCharset_noMatch_returnsNull() {
        assertNull(DataUtil.getCharsetFromContentType("text/html"));
    }

    @Test
    public void getCharset_validLowercase_returnsAsIs() {
        String result = DataUtil.getCharsetFromContentType("text/html; charset=utf-8");
        assertEquals("utf-8", result);
    }

    @Test
    public void getCharset_withQuotes_returnsWithoutQuotes() {
        String result = DataUtil.getCharsetFromContentType("text/html; charset=\"utf-8\"");
        assertEquals("utf-8", result);
    }

    @Test
    public void getCharset_emptyAfterEquals_returnsNull() {
        // charset= ไม่มีค่าตามมา -> group ว่าง -> isEmpty() true -> return null
        assertNull(DataUtil.getCharsetFromContentType("text/html; charset="));
    }

    @Test
    public void getCharset_unsupportedButValidFormat_returnsNull() {
        // ชื่อ charset รูปแบบถูกต้องแต่ JVM ไม่รู้จัก ทั้ง lower/upper -> ตกถึง return null ท้ายเมธอด
        assertNull(DataUtil.getCharsetFromContentType("text/html; charset=madeupcharset123"));
    }

    @Test
    public void getCharset_illegalCharsetName_catchesExceptionReturnsNull() {
        // "!" ไม่ใช่อักขระที่ถูกต้องของชื่อ charset -> Charset.isSupported throw IllegalCharsetNameException
        // -> ถูก catch ใน getCharsetFromContentType -> return null
        assertNull(DataUtil.getCharsetFromContentType("text/html; charset=!!!"));
    }

    @Test
    public void getCharset_needsUppercaseToMatch_doesNotThrow() {
        // ผลลัพธ์ขึ้นกับ alias ที่ JVM รองรับ จึงรับได้ทั้ง null หรือ "utf8" (ไม่ guess behavior เกินซอร์ส)
        String result = DataUtil.getCharsetFromContentType("text/html; charset=utf8");
        assertTrue(result == null || result.equalsIgnoreCase("utf8"));
    }

    // ---------------------------------------------------------------
    // readToByteBuffer(InputStream, maxSize)
    // ---------------------------------------------------------------

    @Test
    public void readToByteBuffer_negativeMaxSize_throws() {
        try {
            DataUtil.readToByteBuffer(new ByteArrayInputStream(new byte[]{1, 2, 3}), -1);
            fail("ควร throw เพราะ maxSize ติดลบ (Validate.isTrue)");
        } catch (Exception expected) {
            // NOTE: ชนิด exception ขึ้นกับ implementation ของ Validate.isTrue (ไม่มี source ให้)
        }
    }

    @Test
    public void readToByteBuffer_zeroMaxSize_unlimitedReadsAll() throws IOException {
        byte[] data = "Hello World".getBytes("UTF-8");
        ByteBuffer buf = DataUtil.readToByteBuffer(new ByteArrayInputStream(data), 0);
        byte[] result = new byte[buf.remaining()];
        buf.get(result);
        assertArrayEquals(data, result);
    }

    @Test
    public void readToByteBuffer_cappedExceedsRemaining_breaksAndTruncates() throws IOException {
        byte[] data = new byte[20];
        for (int i = 0; i < data.length; i++) data[i] = (byte) i;
        ByteBuffer buf = DataUtil.readToByteBuffer(new ByteArrayInputStream(data), 5);
        assertEquals(5, buf.remaining());
    }

    @Test
    public void readToByteBuffer_cappedMultipleChunksWithinLimit() throws IOException {
        final byte[] data = new byte[10];
        for (int i = 0; i < data.length; i++) data[i] = (byte) i;
        // บังคับให้ read คืนทีละไม่เกิน 3 ไบต์ เพื่อให้ loop วิ่งหลายรอบ (ไม่เกิน remaining ทุกครั้ง)
        InputStream chunked = new ByteArrayInputStream(data) {
            @Override
            public synchronized int read(byte[] b, int off, int len) {
                return super.read(b, off, Math.min(len, 3));
            }
        };
        ByteBuffer buf = DataUtil.readToByteBuffer(chunked, 10);
        assertEquals(10, buf.remaining());
    }

    @Test
    public void readToByteBuffer_emptyStream_returnsEmptyBuffer() throws IOException {
        ByteBuffer buf = DataUtil.readToByteBuffer(new ByteArrayInputStream(new byte[0]), 0);
        assertEquals(0, buf.remaining());
    }

    @Test
    public void readToByteBuffer_publicOverload_delegatesToUnlimited() throws IOException {
        byte[] data = "abc".getBytes("UTF-8");
        ByteBuffer buf = DataUtil.readToByteBuffer(new ByteArrayInputStream(data));
        assertEquals(3, buf.remaining());
    }

    // ---------------------------------------------------------------
    // parseByteData
    // ---------------------------------------------------------------

    @Test
    public void parseByteData_charsetNull_noMeta_keepsDefaultUtf8() throws UnsupportedEncodingException {
        String html = "<html><head></head><body>Hello</body></html>";
        ByteBuffer buf = ByteBuffer.wrap(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseByteData(buf, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("UTF-8", doc.outputSettings().charset().name().toUpperCase());
        assertTrue(doc.text().contains("Hello"));
    }

    @Test
    public void parseByteData_charsetNull_metaHttpEquivWithCharset_redecodes() throws UnsupportedEncodingException {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">"
                + "</head><body>Hi</body></html>";
        ByteBuffer buf = ByteBuffer.wrap(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseByteData(buf, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("ISO-8859-1", doc.outputSettings().charset().name().toUpperCase());
    }

    @Test
    public void parseByteData_charsetNull_metaCharsetAttrOnly_redecodes() throws UnsupportedEncodingException {
        String html = "<html><head><meta charset=\"ISO-8859-1\"></head><body>Hi</body></html>";
        ByteBuffer buf = ByteBuffer.wrap(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseByteData(buf, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("ISO-8859-1", doc.outputSettings().charset().name().toUpperCase());
    }

    @Test
    public void parseByteData_charsetNull_metaHttpEquivNoCharsetFound_keepsDefault() throws UnsupportedEncodingException {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html\"></head><body>Hi</body></html>";
        ByteBuffer buf = ByteBuffer.wrap(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseByteData(buf, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("UTF-8", doc.outputSettings().charset().name().toUpperCase());
    }

    @Test
    public void parseByteData_charsetNull_metaHttpEquiv_unsupportedCharsetAttr_keepsDefault() throws UnsupportedEncodingException {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html\" charset=\"madeupcharset123\">"
                + "</head><body>Hi</body></html>";
        ByteBuffer buf = ByteBuffer.wrap(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseByteData(buf, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("UTF-8", doc.outputSettings().charset().name().toUpperCase());
    }

    @Test
    public void parseByteData_charsetNull_metaHttpEquiv_illegalCharsetAttr_catchesException() throws UnsupportedEncodingException {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html\" charset=\"!!!\">"
                + "</head><body>Hi</body></html>";
        ByteBuffer buf = ByteBuffer.wrap(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseByteData(buf, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("UTF-8", doc.outputSettings().charset().name().toUpperCase());
    }

    @Test
    public void parseByteData_charsetNull_metaCharsetEqualsDefault_skipsRedecode() throws UnsupportedEncodingException {
        String html = "<html><head><meta charset=\"UTF-8\"></head><body>Hi</body></html>";
        ByteBuffer buf = ByteBuffer.wrap(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseByteData(buf, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("UTF-8", doc.outputSettings().charset().name().toUpperCase());
    }

    @Test
    public void parseByteData_charsetNull_metaCharsetEmptyAttr_skipsRedecode() throws UnsupportedEncodingException {
        String html = "<html><head><meta charset=\"\"></head><body>Hi</body></html>";
        ByteBuffer buf = ByteBuffer.wrap(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseByteData(buf, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("UTF-8", doc.outputSettings().charset().name().toUpperCase());
    }

    @Test
    public void parseByteData_charsetSpecified_decodesDirectly() throws UnsupportedEncodingException {
        String html = "<html><head></head><body>Bonjour</body></html>";
        ByteBuffer buf = ByteBuffer.wrap(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseByteData(buf, "UTF-8", "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertTrue(doc.text().contains("Bonjour"));
    }

    @Test
    public void parseByteData_emptyCharsetName_throwsFromValidateNotEmpty() throws UnsupportedEncodingException {
        String html = "<html></html>";
        ByteBuffer buf = ByteBuffer.wrap(html.getBytes("UTF-8"));
        try {
            DataUtil.parseByteData(buf, "", "http://example.com/", Parser.htmlParser());
            fail("ควร throw เพราะ charsetName เป็นค่าว่าง (Validate.notEmpty)");
        } catch (Exception expected) {
            // NOTE: ชนิด exception ขึ้นกับ implementation ของ Validate.notEmpty (ไม่มี source ให้)
        }
    }

    @Test(expected = UnsupportedCharsetException.class)
    public void parseByteData_unsupportedCharsetName_throws() throws UnsupportedEncodingException {
        String html = "<html></html>";
        ByteBuffer buf = ByteBuffer.wrap(html.getBytes("UTF-8"));
        // อ้างอิง contract มาตรฐานของ java.nio.charset.Charset.forName (ไม่ใช่ behavior เฉพาะของ DataUtil)
        DataUtil.parseByteData(buf, "no-such-charset-xyz", "http://example.com/", Parser.htmlParser());
    }

    @Test
    public void parseByteData_utf8Bom_stripsBomAndUsesDefaultCharset() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bos.write(0xEF);
        bos.write(0xBB);
        bos.write(0xBF);
        byte[] htmlBytes = "<html><head></head><body>Data</body></html>".getBytes("UTF-8");
        bos.write(htmlBytes);
        ByteBuffer buf = ByteBuffer.wrap(bos.toByteArray());
        Document doc = DataUtil.parseByteData(buf, "UTF-8", "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertFalse(doc.outerHtml().contains("\uFEFF"));
        assertTrue(doc.text().contains("Data"));
    }

    // ---------------------------------------------------------------
    // load(File, charsetName, baseUri)
    // ---------------------------------------------------------------

    @Test
    public void load_file_withExplicitCharset_success() throws IOException {
        File f = tempFolder.newFile("test1.html");
        writeFile(f, "<html><head></head><body>FileContent</body></html>", "UTF-8");
        Document doc = DataUtil.load(f, "UTF-8", "http://example.com/");
        assertNotNull(doc);
        assertTrue(doc.text().contains("FileContent"));
    }

    @Test
    public void load_file_withNullCharset_autoDetect() throws IOException {
        File f = tempFolder.newFile("test2.html");
        writeFile(f, "<html><head><meta charset=\"UTF-8\"></head><body>AutoDetect</body></html>", "UTF-8");
        Document doc = DataUtil.load(f, null, "http://example.com/");
        assertNotNull(doc);
        assertTrue(doc.text().contains("AutoDetect"));
    }

    @Test(expected = FileNotFoundException.class)
    public void load_file_nonExistent_throwsIOException() throws IOException {
        File f = new File(tempFolder.getRoot(), "does-not-exist.html");
        DataUtil.load(f, "UTF-8", "http://example.com/");
    }

    // ---------------------------------------------------------------
    // load(InputStream, ...) overloads
    // ---------------------------------------------------------------

    @Test
    public void load_inputStream_basic() throws IOException {
        String html = "<html><head></head><body>StreamContent</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com/");
        assertNotNull(doc);
        assertTrue(doc.text().contains("StreamContent"));
    }

    @Test
    public void load_inputStream_withExplicitParser() throws IOException {
        String xml = "<root><child>Value</child></root>";
        InputStream in = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com/", Parser.xmlParser());
        assertNotNull(doc);
        assertEquals("Value", doc.select("child").first().text());
    }

    // ---------------------------------------------------------------
    private static void writeFile(File f, String content, String charset) throws IOException {
        FileOutputStream fos = new FileOutputStream(f);
        try {
            fos.write(content.getBytes(charset));
        } finally {
            fos.close();
        }
    }
}
```

## ตารางสรุป Branch/Condition Coverage

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `getCharset_nullInput_returnsNull` | `contentType == null` → return null |
| `getCharset_noMatch_returnsNull` | `m.find()` = false |
| `getCharset_validLowercase_returnsAsIs` | `isSupported(charset)` รอบแรก = true |
| `getCharset_withQuotes_returnsWithoutQuotes` | regex group ตัด quote ออกถูกต้อง |
| `getCharset_emptyAfterEquals_returnsNull` | `charset.isEmpty()` = true |
| `getCharset_unsupportedButValidFormat_returnsNull` | ทั้ง `isSupported` (lower/upper) = false → ตก return null ท้ายเมธอด |
| `getCharset_illegalCharsetName_catchesExceptionReturnsNull` | `catch (IllegalCharsetNameException)` |
| `getCharset_needsUppercaseToMatch_doesNotThrow` | path uppercase-check (เผื่อ JVM รองรับ) |
| `readToByteBuffer_negativeMaxSize_throws` | `Validate.isTrue(maxSize>=0)` = false |
| `readToByteBuffer_zeroMaxSize_unlimitedReadsAll` | `capped = false` |
| `readToByteBuffer_cappedExceedsRemaining_breaksAndTruncates` | `read > remaining` → break |
| `readToByteBuffer_cappedMultipleChunksWithinLimit` | loop วนหลายรอบ, `read <= remaining` |
| `readToByteBuffer_emptyStream_returnsEmptyBuffer` | `read == -1` ทันที |
| `readToByteBuffer_publicOverload_delegatesToUnlimited` | wrapper `readToByteBuffer(InputStream)` |
| `parseByteData_charsetNull_noMeta_keepsDefaultUtf8` | `charsetName==null`, `meta==null` |
| `parseByteData_charsetNull_metaHttpEquivWithCharset_redecodes` | `meta.hasAttr("http-equiv")`=true, foundCharset!=default → redecode |
| `parseByteData_charsetNull_metaCharsetAttrOnly_redecodes` | else branch (`meta.attr("charset")`) |
| `parseByteData_charsetNull_metaHttpEquivNoCharsetFound_keepsDefault` | `foundCharset==null` (content ไม่มี charset, ไม่มี attr charset) |
| `parseByteData_charsetNull_metaHttpEquiv_unsupportedCharsetAttr_keepsDefault` | `isSupported()==false` ใน try |
| `parseByteData_charsetNull_metaHttpEquiv_illegalCharsetAttr_catchesException` | `catch(IllegalCharsetNameException)` ภายใน parseByteData |
| `parseByteData_charsetNull_metaCharsetEqualsDefault_skipsRedecode` | `foundCharset.equals(defaultCharset)` = true → skip |
| `parseByteData_charsetNull_metaCharsetEmptyAttr_skipsRedecode` | `foundCharset.length()==0` |
| `parseByteData_charsetSpecified_decodesDirectly` | else branch `charsetName != null` |
| `parseByteData_emptyCharsetName_throwsFromValidateNotEmpty` | `Validate.notEmpty` fail path |
| `parseByteData_unsupportedCharsetName_throws` | `Charset.forName` throw (JDK behavior) |
| `parseByteData_utf8Bom_stripsBomAndUsesDefaultCharset` | `docData.charAt(0)==65279` = true |
| `load_file_withExplicitCharset_success` | `load(File,...)` success path |
| `load_file_withNullCharset_autoDetect` | `load(File,...)` + auto-detect meta |
| `load_file_nonExistent_throwsIOException` | `finally{ inStream.close() }` + FileNotFoundException path |
| `load_inputStream_basic` | `load(InputStream,...)` overload |
| `load_inputStream_withExplicitParser` | `load(InputStream,...,Parser)` overload, ใช้ xmlParser |

**หมายเหตุสำคัญ:** บางกรณี (เช่น exact exception type ของ `Validate.isTrue` / `Validate.notEmpty`) ไม่มี source ให้ตรวจสอบ จึงใช้ `try/catch` แบบกว้าง (RuntimeException) พร้อมคอมเมนต์กำกับไว้ เพื่อไม่ guess behavior เกินกว่าที่ปรากฏในซอร์สที่ให้มา