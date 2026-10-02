# DataUtilTest.java

```java
package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

import static org.junit.Assert.*;

/**
 * JUnit4 tests for org.jsoup.helper.DataUtil (Defects4J Jsoup-52b)
 * อยู่ใน package เดียวกับคลาสเป้าหมาย เพื่อให้เข้าถึง package-private methods ได้โดยตรง
 */
public class DataUtilTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    // ==================== getCharsetFromContentType ====================

    @Test
    public void getCharsetFromContentType_null_returnsNull() {
        assertNull(DataUtil.getCharsetFromContentType(null));
    }

    @Test
    public void getCharsetFromContentType_noCharsetKeyword_returnsNull() {
        assertNull(DataUtil.getCharsetFromContentType("text/html"));
    }

    @Test
    public void getCharsetFromContentType_simpleValue() {
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=UTF-8"));
    }

    @Test
    public void getCharsetFromContentType_doubleQuoted() {
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=\"UTF-8\""));
    }

    @Test
    public void getCharsetFromContentType_singleQuoted() {
        assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType("text/html; charset='ISO-8859-1'"));
    }

    @Test
    public void getCharsetFromContentType_unsupportedButValidFormat_returnsNull() {
        // ชื่อ charset รูปแบบถูกต้องแต่ JVM ไม่รองรับ -> validateCharset คืน null (ไม่ throw)
        assertNull(DataUtil.getCharsetFromContentType("text/html; charset=unsupported-xyz-123"));
    }

    @Test
    public void getCharsetFromContentType_illegalCharsetName_caughtException() {
        // "@@@" เป็นชื่อ charset ที่ผิดกฎ -> Charset.isSupported throw IllegalCharsetNameException
        // ซึ่งถูก catch ภายใน validateCharset แล้วคืน null
        assertNull(DataUtil.getCharsetFromContentType("text/html; charset=@@@"));
    }

    @Test
    public void getCharsetFromContentType_regexStopsAtWhitespace() {
        // NOTE: regex [^\s,;"']* จะตัดที่ whitespace ทำให้ค่าที่ parse ได้คือ "not" เท่านั้น
        // (ไม่ใช่ "not a valid name" ทั้งหมด) จึงไม่ trigger IllegalCharsetNameException จาก space
        assertNull(DataUtil.getCharsetFromContentType("text/html; charset=not a valid name"));
    }

    // ==================== mimeBoundary ====================

    @Test
    public void mimeBoundary_hasCorrectLengthAndCharset() {
        String boundary = DataUtil.mimeBoundary();
        assertEquals(DataUtil.boundaryLength, boundary.length());
        String allowed = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (char c : boundary.toCharArray()) {
            assertTrue("unexpected char: " + c, allowed.indexOf(c) >= 0);
        }
    }

    @Test
    public void mimeBoundary_notNull() {
        assertNotNull(DataUtil.mimeBoundary());
    }

    // ==================== readToByteBuffer ====================

    @Test
    public void readToByteBuffer_unlimited_readsAll() throws IOException {
        byte[] data = "Hello World".getBytes("UTF-8");
        ByteBuffer buf = DataUtil.readToByteBuffer(new ByteArrayInputStream(data), 0);
        assertEquals(data.length, buf.limit());
        byte[] out = new byte[buf.limit()];
        buf.get(out);
        assertArrayEquals(data, out);
    }

    @Test
    public void readToByteBuffer_noArgOverload_delegatesToUnlimited() throws IOException {
        byte[] data = "abc".getBytes("UTF-8");
        ByteBuffer buf = DataUtil.readToByteBuffer(new ByteArrayInputStream(data));
        assertEquals(3, buf.limit());
    }

    @Test
    public void readToByteBuffer_capped_readGreaterThanRemaining_breaksAndTruncates() throws IOException {
        byte[] data = "0123456789".getBytes("UTF-8");
        ByteBuffer buf = DataUtil.readToByteBuffer(new ByteArrayInputStream(data), 5);
        assertEquals(5, buf.limit());
        byte[] out = new byte[5];
        buf.get(out);
        assertArrayEquals("01234".getBytes("UTF-8"), out);
    }

    @Test
    public void readToByteBuffer_capped_readLessThanRemaining_continuesLoop() throws IOException {
        byte[] data = "short".getBytes("UTF-8");
        ByteBuffer buf = DataUtil.readToByteBuffer(new ByteArrayInputStream(data), 1000);
        assertEquals(data.length, buf.limit());
    }

    @Test
    public void readToByteBuffer_emptyStream_returnsEmptyBuffer() throws IOException {
        ByteBuffer buf = DataUtil.readToByteBuffer(new ByteArrayInputStream(new byte[0]), 0);
        assertEquals(0, buf.limit());
    }

    @Test(expected = IllegalArgumentException.class)
    public void readToByteBuffer_negativeMaxSize_throws() throws IOException {
        // สมมติฐาน: Validate.isTrue โยน IllegalArgumentException (พฤติกรรมปกติของ jsoup Validate)
        DataUtil.readToByteBuffer(new ByteArrayInputStream("x".getBytes("UTF-8")), -1);
    }

    // ==================== readFileToByteBuffer ====================

    @Test
    public void readFileToByteBuffer_readsFileContentCorrectly() throws IOException {
        File f = tempFolder.newFile("test.txt");
        byte[] content = "file content".getBytes("UTF-8");
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(content);
        fos.close();

        ByteBuffer buf = DataUtil.readFileToByteBuffer(f);
        assertEquals(content.length, buf.limit());
        byte[] out = new byte[buf.limit()];
        buf.get(out);
        assertArrayEquals(content, out);
    }

    @Test(expected = IOException.class)
    public void readFileToByteBuffer_missingFile_throwsIOException() throws IOException {
        File f = new File(tempFolder.getRoot(), "doesNotExist.txt");
        DataUtil.readFileToByteBuffer(f);
    }

    // ==================== emptyByteBuffer ====================

    @Test
    public void emptyByteBuffer_hasZeroCapacity() {
        assertEquals(0, DataUtil.emptyByteBuffer().capacity());
    }

    // ==================== crossStreams ====================

    @Test
    public void crossStreams_copiesAllBytes() throws IOException {
        byte[] data = "cross stream data".getBytes("UTF-8");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DataUtil.crossStreams(new ByteArrayInputStream(data), out);
        assertArrayEquals(data, out.toByteArray());
    }

    @Test
    public void crossStreams_emptyInput_writesNothing() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DataUtil.crossStreams(new ByteArrayInputStream(new byte[0]), out);
        assertEquals(0, out.toByteArray().length);
    }

    // ==================== parseByteData: BOM detection branches ====================

    @Test
    public void parseByteData_utf8Bom_detectedAndStripped() throws IOException {
        byte[] bom = new byte[]{(byte) 0xEF, (byte) 0xBB, (byte) 0xBF};
        byte[] html = "<html><head></head><body>BOM UTF8</body></html>".getBytes("UTF-8");
        ByteBuffer buf = ByteBuffer.wrap(concat(bom, html));
        Document doc = DataUtil.parseByteData(buf, null, "http://example.com", Parser.htmlParser());
        assertTrue(doc.text().contains("BOM UTF8"));
        assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test
    public void parseByteData_utf32BE_bom_detected() {
        byte[] bom = new byte[]{0x00, 0x00, (byte) 0xFE, (byte) 0xFF};
        Document doc = DataUtil.parseByteData(ByteBuffer.wrap(bom), null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("UTF-32", doc.outputSettings().charset().name());
    }

    @Test
    public void parseByteData_utf32LE_bom_detected() {
        byte[] bom = new byte[]{(byte) 0xFF, (byte) 0xFE, 0x00, 0x00};
        Document doc = DataUtil.parseByteData(ByteBuffer.wrap(bom), null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("UTF-32", doc.outputSettings().charset().name());
    }

    @Test
    public void parseByteData_utf16BE_bom_detected() {
        // byte[2],byte[3] ไม่ตรงกับเงื่อนไข UTF-32 (ไม่ใช่ FE FF) จึงตกไปตรวจ UTF-16 BE (disjunct แรก)
        byte[] bom = new byte[]{(byte) 0xFE, (byte) 0xFF, 0x12, 0x34};
        Document doc = DataUtil.parseByteData(ByteBuffer.wrap(bom), null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("UTF-16", doc.outputSettings().charset().name());
    }

    @Test
    public void parseByteData_utf16LE_bom_detected() {
        // byte[2],byte[3] != 0x00,0x00 จึงไม่ตรง UTF-32 LE แต่ตรง UTF-16 LE (disjunct ที่สอง)
        byte[] bom = new byte[]{(byte) 0xFF, (byte) 0xFE, 0x12, 0x34};
        Document doc = DataUtil.parseByteData(ByteBuffer.wrap(bom), null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("UTF-16", doc.outputSettings().charset().name());
    }

    @Test
    public void parseByteData_lessThan4Bytes_noBomCheckPerformed() {
        // remaining() < 4 -> ข้าม byteData.get(bom) ทั้งหมด, bom array เป็น {0,0,0,0} ซึ่งไม่ตรงเงื่อนไขใด ๆ
        byte[] tiny = new byte[]{0x3C, 0x70, 0x3E}; // "<p>"
        Document doc = DataUtil.parseByteData(ByteBuffer.wrap(tiny), null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
    }

    // ==================== parseByteData: charset=null -> meta detection branches ====================

    @Test
    public void parseByteData_noMeta_defaultsToUtf8() {
        String html = "<html><head></head><body>No meta tags here</body></html>";
        Document doc = DataUtil.parseByteData(ByteBuffer.wrap(html.getBytes()), null, "http://example.com", Parser.htmlParser());
        assertTrue(doc.text().contains("No meta tags here"));
    }

    @Test
    public void parseByteData_metaHttpEquiv_triggersRedecodeWithFoundCharset() throws IOException {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">" +
                "</head><body>Meta test</body></html>";
        ByteBuffer buf = ByteBuffer.wrap(html.getBytes("ISO-8859-1"));
        Document doc = DataUtil.parseByteData(buf, null, "http://example.com", Parser.htmlParser());
        assertTrue(doc.text().contains("Meta test"));
        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void parseByteData_metaCharsetAttr_html5_supportedCharset() throws IOException {
        String html = "<html><head><meta charset=\"ISO-8859-1\"></head><body>Html5 charset</body></html>";
        ByteBuffer buf = ByteBuffer.wrap(html.getBytes("ISO-8859-1"));
        Document doc = DataUtil.parseByteData(buf, null, "http://example.com", Parser.htmlParser());
        assertTrue(doc.text().contains("Html5 charset"));
        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void parseByteData_metaCharsetAttr_illegalCharsetName_caughtException() throws IOException {
        // "not a charset" มีช่องว่าง -> Charset.isSupported throw IllegalCharsetNameException
        // ซึ่งถูก catch ใน parseByteData แล้ว foundCharset เป็น null (ไม่ throw ออกมาให้ caller)
        String html = "<html><head><meta charset=\"not a charset\"></head><body>Illegal charset meta</body></html>";
        ByteBuffer buf = ByteBuffer.wrap(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseByteData(buf, null, "http://example.com", Parser.htmlParser());
        assertTrue(doc.text().contains("Illegal charset meta"));
    }

    @Test
    public void parseByteData_metaCharsetEqualsDefault_noRedecodeNeeded() throws IOException {
        String html = "<html><head><meta charset=\"UTF-8\"></head><body>Default charset</body></html>";
        ByteBuffer buf = ByteBuffer.wrap(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseByteData(buf, null, "http://example.com", Parser.htmlParser());
        assertTrue(doc.text().contains("Default charset"));
    }

    @Test
    public void parseByteData_xmlDeclarationProlog_encodingBranch() throws IOException {
        // NOTE: การทดสอบนี้พึ่งพาพฤติกรรมของ jsoup HTML parser (นอก source ของ DataUtil)
        // ที่ต้องสร้าง XmlDeclaration เป็น childNode(0) เมื่อพบ "<?xml ... ?>" prolog
        // หากพาร์เซอร์ไม่สร้าง XmlDeclaration ตามคาด จะไม่ throw แต่ branch นี้จะไม่ถูกเข้าทดสอบจริง
        String xmlProlog = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>" +
                "<html><head></head><body>Prolog test</body></html>";
        ByteBuffer buf = ByteBuffer.wrap(xmlProlog.getBytes("ISO-8859-1"));
        Document doc = DataUtil.parseByteData(buf, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
    }

    // ==================== parseByteData: charset specified by caller (else-branch) ====================

    @Test
    public void parseByteData_userSpecifiedCharset_decodesDirectly() throws IOException {
        String html = "<html><head></head><body>User specified charset</body></html>";
        ByteBuffer buf = ByteBuffer.wrap(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseByteData(buf, "UTF-8", "http://example.com", Parser.htmlParser());
        assertTrue(doc.text().contains("User specified charset"));
        assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseByteData_userSpecifiedEmptyCharset_throws() throws IOException {
        // สมมติฐาน: Validate.notEmpty โยน IllegalArgumentException เมื่อ charsetName เป็น ""
        String html = "<html><body>empty charset test</body></html>";
        ByteBuffer buf = ByteBuffer.wrap(html.getBytes("UTF-8"));
        DataUtil.parseByteData(buf, "", "http://example.com", Parser.htmlParser());
    }

    // ==================== load(File, String, String) ====================

    @Test
    public void load_file_withExplicitCharset_parsesCorrectly() throws IOException {
        File f = tempFolder.newFile("page.html");
        String html = "<html><head></head><body>File load test</body></html>";
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(html.getBytes("UTF-8"));
        fos.close();

        Document doc = DataUtil.load(f, "UTF-8", "http://example.com");
        assertTrue(doc.text().contains("File load test"));
    }

    @Test(expected = IOException.class)
    public void load_file_missingFile_throwsIOException() throws IOException {
        File f = new File(tempFolder.getRoot(), "missing.html");
        DataUtil.load(f, "UTF-8", "http://example.com");
    }

    // ==================== load(InputStream, String, String) ====================

    @Test
    public void load_inputStream_nullCharset_detectsFromMetaOrDefault() throws IOException {
        String html = "<html><head></head><body>Stream load test</body></html>";
        ByteArrayInputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.load(in, null, "http://example.com");
        assertTrue(doc.text().contains("Stream load test"));
    }

    // ==================== load(InputStream, String, String, Parser) ====================

    @Test
    public void load_inputStream_withExplicitParserAndCharset() throws IOException {
        String html = "<html><head></head><body>Stream parser test</body></html>";
        ByteArrayInputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com", Parser.htmlParser());
        assertTrue(doc.text().contains("Stream parser test"));
    }

    // ==================== helper ====================

    private static byte[] concat(byte[] a, byte[] b) {
        byte[] result = new byte[a.length + b.length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
    }
}
```

## สรุปตาราง Test Method ↔ Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `getCharsetFromContentType_null_returnsNull` | `contentType == null` → return null |
| `getCharsetFromContentType_noCharsetKeyword_returnsNull` | regex `m.find()` = false |
| `getCharsetFromContentType_simpleValue/doubleQuoted/singleQuoted` | `m.find()`=true, quote-stripping ของ regex, `validateCharset` cs ถูกต้อง |
| `getCharsetFromContentType_unsupportedButValidFormat_returnsNull` | `Charset.isSupported(cs)`=false (ไม่ throw) |
| `getCharsetFromContentType_illegalCharsetName_caughtException` | `catch(IllegalCharsetNameException)` ใน `validateCharset` |
| `getCharsetFromContentType_regexStopsAtWhitespace` | ยืนยัน behavior regex ตัดที่ whitespace (documented) |
| `mimeBoundary_*` | loop `for i<boundaryLength`, random char selection |
| `readToByteBuffer_unlimited_readsAll` | `capped=false` branch |
| `readToByteBuffer_noArgOverload_delegatesToUnlimited` | overload เรียก maxSize=0 |
| `readToByteBuffer_capped_readGreaterThanRemaining_breaksAndTruncates` | `if (read > remaining)` = true → break |
| `readToByteBuffer_capped_readLessThanRemaining_continuesLoop` | `if (read > remaining)` = false → `remaining -= read` |
| `readToByteBuffer_emptyStream_returnsEmptyBuffer` | `read == -1` ทันที (while loop break แรก) |
| `readToByteBuffer_negativeMaxSize_throws` | `Validate.isTrue(maxSize>=0)` = false → throw |
| `readFileToByteBuffer_readsFileContentCorrectly` | try-block ปกติ, finally close |
| `readFileToByteBuffer_missingFile_throwsIOException` | exception path ก่อนถึง try (FileNotFoundException) |
| `emptyByteBuffer_hasZeroCapacity` | ตรวจ allocate(0) |
| `crossStreams_copiesAllBytes` | while loop `(len=in.read())!=-1` true-path |
| `crossStreams_emptyInput_writesNothing` | while loop condition false ทันที |
| `parseByteData_utf8Bom_detectedAndStripped` | BOM UTF-8 branch + `position(3)` + else-branch (charsetName!=null) |
| `parseByteData_utf32BE/LE_bom_detected` | เงื่อนไข OR แรกของ UTF-32 (BE/LE disjunct) |
| `parseByteData_utf16BE/LE_bom_detected` | เงื่อนไข OR ของ UTF-16 (BE/LE disjunct) หลัง UTF-32 เป็น false |
| `parseByteData_lessThan4Bytes_noBomCheckPerformed` | `byteData.remaining() >= bom.length` = false |
| `parseByteData_noMeta_defaultsToUtf8` | `charsetName==null`, `meta==null` |
| `parseByteData_metaHttpEquiv_triggersRedecodeWithFoundCharset` | `meta.hasAttr("http-equiv")`=true, redecode branch (`foundCharset!=null && !=default`) |
| `parseByteData_metaCharsetAttr_html5_supportedCharset` | `hasAttr("http-equiv")`=false, `hasAttr("charset")`=true, `Charset.isSupported`=true |
| `parseByteData_metaCharsetAttr_illegalCharsetName_caughtException` | `catch(IllegalCharsetNameException)` ใน meta-charset check |
| `parseByteData_metaCharsetEqualsDefault_noRedecodeNeeded` | `foundCharset.equals(defaultCharset)`=true → ไม่ redecode |
| `parseByteData_xmlDeclarationProlog_encodingBranch` | `doc.childNode(0) instanceof XmlDeclaration` + `prolog.name().equals("xml")` (ขึ้นกับ parser ภายนอก) |
| `parseByteData_userSpecifiedCharset_decodesDirectly` | `charsetName!=null` else-branch |
| `parseByteData_userSpecifiedEmptyCharset_throws` | `Validate.notEmpty` = false → throw |
| `load_file_*` | `load(File,...)` → `readFileToByteBuffer` + `parseByteData` |
| `load_inputStream_nullCharset_*` | `load(InputStream,String,String)` overload |
| `load_inputStream_withExplicitParserAndCharset` | `load(InputStream,String,String,Parser)` overload |

**หมายเหตุสำคัญ:**
- Method `validateCharset` และ `detectCharsetFromBom` เป็น `private` จึงทดสอบผ่าน `parseByteData`/`getCharsetFromContentType` โดยอ้อมเท่านั้น
- Branch `cs.toUpperCase(Locale.ENGLISH)` ใน `validateCharset` **ไม่ได้ทดสอบโดยตรง** เนื่องจาก `Charset.isSupported()` ของ Java ทำงานแบบ case-insensitive อยู่แล้ว ทำให้ไม่สามารถยืนยัน (โดยไม่เดา) ว่า branch นี้ reachable ได้จริงในทางปฏิบัติ
- Test ของ XmlDeclaration prolog พึ่งพา behavior ของ jsoup parser ภายนอก source ที่ให้มา จึงระบุ comment กำกับความไม่แน่นอนไว้ตามข้อกำหนด