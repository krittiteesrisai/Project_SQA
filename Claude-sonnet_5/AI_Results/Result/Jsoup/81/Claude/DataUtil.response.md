# คำอธิบายแนวทาง

เนื่องจาก method ส่วนใหญ่ของ `DataUtil` เป็น **package-private** (`static` ไม่มี `public`) จึงต้องวาง `DataUtilTest` ไว้ใน package `org.jsoup.helper` เดียวกัน เพื่อให้เรียกใช้ได้โดยตรงโดยไม่ต้องใช้ reflection

หมายเหตุสำคัญ: คลาส `Validate` และ `Document` (default charset ของ `OutputSettings`) ไม่ได้อยู่ในซอร์สที่ให้มา ดังนั้นในบางเคสที่ต้องพึ่งพา behavior ของคลาสเหล่านี้ ผมจะ**คอมเมนต์กำกับไว้ชัดเจน**ว่าเป็นสมมติฐาน (assumption) ตามรูปแบบทั่วไปของ jsoup ไม่ใช่สิ่งที่ยืนยันได้จากซอร์สที่ให้มาโดยตรง

```java
package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

import static org.junit.Assert.*;

public class DataUtilTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    // ---------- helper ----------
    private static byte[] concat(byte[] a, byte[] b) {
        byte[] out = new byte[a.length + b.length];
        System.arraycopy(a, 0, out, 0, a.length);
        System.arraycopy(b, 0, out, a.length, b.length);
        return out;
    }

    // =========================================================
    // parseInputStream - null input
    // =========================================================
    @Test
    public void parseInputStream_nullInput_returnsEmptyDocumentWithBaseUri() throws IOException {
        Document doc = DataUtil.parseInputStream(null, "UTF-8", "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("http://example.com/", doc.baseUri());
    }

    // =========================================================
    // parseInputStream - charsetName specified (skips meta-detect branch)
    // =========================================================
    @Test
    public void parseInputStream_withExplicitCharset_parsesCorrectly() throws IOException {
        String html = "<html><head><title>T</title></head><body>Hello</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseInputStream(in, "UTF-8", "http://example.com/", Parser.htmlParser());
        assertEquals("T", doc.title());
        assertEquals("Hello", doc.body().text());
        assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseInputStream_withEmptyCharsetName_throwsIllegalArgumentException() throws IOException {
        // สมมติฐาน: Validate.notEmpty(...) throw IllegalArgumentException เมื่อ string ว่าง
        // (คลาส Validate ไม่ได้แสดงในซอร์สที่ให้มา จึงยึดตาม pattern ทั่วไปของ jsoup)
        String html = "<html><body>x</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes());
        DataUtil.parseInputStream(in, "", "http://example.com/", Parser.htmlParser());
    }

    // =========================================================
    // parseInputStream - charsetName == null -> meta http-equiv detection -> re-decode
    // =========================================================
    @Test
    public void parseInputStream_detectCharsetFromMetaHttpEquiv_redecodes() throws IOException {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">"
                + "</head><body>caf\u00e9</body></html>";
        byte[] bytes = html.getBytes("ISO-8859-1");
        InputStream in = new ByteArrayInputStream(bytes);

        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());

        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
        assertEquals("caf\u00e9", doc.body().text());
    }

    // =========================================================
    // parseInputStream - meta[charset] attribute detection (HTML5 style)
    // =========================================================
    @Test
    public void parseInputStream_detectCharsetFromMetaCharsetAttr_redecodes() throws IOException {
        String html = "<html><head><meta charset=\"ISO-8859-1\"></head><body>caf\u00e9</body></html>";
        byte[] bytes = html.getBytes("ISO-8859-1");
        InputStream in = new ByteArrayInputStream(bytes);

        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());

        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
        assertEquals("caf\u00e9", doc.body().text());
    }

    // =========================================================
    // parseInputStream - XML declaration encoding detection (branch: XmlDeclaration)
    // =========================================================
    @Test
    public void parseInputStream_detectCharsetFromXmlDeclaration_redecodes() throws IOException {
        String xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><root>caf\u00e9</root>";
        byte[] bytes = xml.getBytes("ISO-8859-1");
        InputStream in = new ByteArrayInputStream(bytes);

        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.xmlParser());

        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
        assertEquals("caf\u00e9", doc.select("root").text());
    }

    // =========================================================
    // parseInputStream - no charset found anywhere, small content, fullyRead branch
    // =========================================================
    @Test
    public void parseInputStream_noCharsetFound_fullyReadKeepsInitialParse() throws IOException {
        String html = "<html><head><title>NoCharset</title></head><body>plain text</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));

        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());

        assertEquals("NoCharset", doc.title());
        assertEquals("plain text", doc.body().text());
        // ไม่ assert ค่า charset ของ outputSettings ในกรณีนี้ เนื่องจาก DataUtil
        // ไม่ได้ set charset เอง (ปล่อยให้เป็นค่า default ของ Document ซึ่งคลาส Document
        // ไม่ได้แสดงอยู่ในซอร์สที่ให้มา จึงไม่ควรเดา behavior)
    }

    // =========================================================
    // parseInputStream - BOM detection: UTF-8 (offset = true -> reader.skip(1))
    // =========================================================
    @Test
    public void parseInputStream_bomUtf8_detectedAndSkipped() throws IOException {
        byte[] bom = {(byte) 0xEF, (byte) 0xBB, (byte) 0xBF};
        String html = "<html><body>hello</body></html>";
        byte[] combined = concat(bom, html.getBytes("UTF-8"));
        InputStream in = new ByteArrayInputStream(combined);

        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());

        assertEquals("UTF-8", doc.outputSettings().charset().name());
        assertEquals("hello", doc.body().text());
    }

    // =========================================================
    // parseInputStream - BOM detection: UTF-16 BE (offset = false, no explicit skip)
    // =========================================================
    @Test
    public void parseInputStream_bomUtf16be_detected() throws IOException {
        byte[] bom = {(byte) 0xFE, (byte) 0xFF};
        String html = "<html><body>hello</body></html>";
        byte[] contentBytes = html.getBytes("UTF-16BE");
        byte[] combined = concat(bom, contentBytes);
        InputStream in = new ByteArrayInputStream(combined);

        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());

        assertEquals("UTF-16", doc.outputSettings().charset().name());
        assertEquals("hello", doc.body().text());
    }

    // UTF-32 BOM branch (0x00 0x00 0xFE 0xFF / 0xFF 0xFE 0x00 0x00) ไม่ถูกทดสอบจริง
    // เพราะ "UTF-32" ใน Charset.forName อาจไม่ได้รับการ support แบบเท่ากันในทุก JVM/Provider
    // ทำให้ test ไม่ deterministic ข้าม environment - คอมเมนต์กำกับไว้ตามกฎข้อ 4

    // =========================================================
    // load(File, charsetName, baseUri)
    // =========================================================
    @Test
    public void load_fromFile_withExplicitCharset_parsesCorrectly() throws IOException {
        File file = tempFolder.newFile("test.html");
        String html = "<html><head><title>FileTitle</title></head><body>body text</body></html>";
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(html.getBytes("UTF-8"));
        }

        Document doc = DataUtil.load(file, "UTF-8", "http://example.com/");
        assertEquals("FileTitle", doc.title());
        assertEquals("body text", doc.body().text());
    }

    @Test(expected = FileNotFoundException.class)
    public void load_fromNonExistingFile_throwsFileNotFoundException() throws IOException {
        File notExist = new File(tempFolder.getRoot(), "doesNotExist.html");
        DataUtil.load(notExist, "UTF-8", "http://example.com/");
    }

    // =========================================================
    // load(InputStream, charsetName, baseUri)
    // =========================================================
    @Test
    public void load_fromInputStream_nullCharset_detectsFromContent() throws IOException {
        String html = "<html><head><meta charset=\"UTF-8\"></head><body>abc</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.load(in, null, "http://example.com/");
        assertEquals("abc", doc.body().text());
    }

    // =========================================================
    // load(InputStream, charsetName, baseUri, parser) - with explicit Parser
    // =========================================================
    @Test
    public void load_fromInputStream_withExplicitParser_xml() throws IOException {
        String xml = "<root><child>val</child></root>";
        InputStream in = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com/", Parser.xmlParser());
        assertEquals("val", doc.select("child").text());
    }

    // =========================================================
    // crossStreams
    // =========================================================
    @Test
    public void crossStreams_copiesAllBytes() throws IOException {
        byte[] data = "Hello World Cross Streams Test".getBytes("UTF-8");
        InputStream in = new ByteArrayInputStream(data);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        DataUtil.crossStreams(in, out);

        assertArrayEquals(data, out.toByteArray());
    }

    @Test
    public void crossStreams_emptyInput_writesNothing() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        DataUtil.crossStreams(in, out);

        assertEquals(0, out.toByteArray().length);
    }

    // =========================================================
    // readToByteBuffer(InputStream, int maxSize)
    // =========================================================
    @Test(expected = IllegalArgumentException.class)
    public void readToByteBuffer_negativeMaxSize_throwsIllegalArgumentException() throws IOException {
        // สมมติฐาน: Validate.isTrue throw IllegalArgumentException เมื่อ condition false
        // (คลาส Validate ไม่ได้แสดงอยู่ในซอร์สที่ให้มา)
        InputStream in = new ByteArrayInputStream("data".getBytes());
        DataUtil.readToByteBuffer(in, -1);
    }

    @Test
    public void readToByteBuffer_zeroMaxSize_readsAllContent() throws IOException {
        byte[] data = "0123456789".getBytes("UTF-8");
        InputStream in = new ByteArrayInputStream(data);

        ByteBuffer buf = DataUtil.readToByteBuffer(in, 0);

        byte[] actual = new byte[buf.remaining()];
        buf.get(actual);
        assertArrayEquals(data, actual);
    }

    @Test
    public void readToByteBuffer_positiveMaxSize_limitsReadSize() throws IOException {
        byte[] data = "0123456789ABCDEFGHIJ".getBytes("UTF-8"); // 20 bytes
        InputStream in = new ByteArrayInputStream(data);

        ByteBuffer buf = DataUtil.readToByteBuffer(in, 5);

        assertEquals(5, buf.remaining());
    }

    // package-private overload readToByteBuffer(InputStream) -> maxSize=0
    @Test
    public void readToByteBuffer_defaultOverload_readsAllContent() throws IOException {
        byte[] data = "abcdef".getBytes("UTF-8");
        InputStream in = new ByteArrayInputStream(data);

        ByteBuffer buf = DataUtil.readToByteBuffer(in);

        byte[] actual = new byte[buf.remaining()];
        buf.get(actual);
        assertArrayEquals(data, actual);
    }

    // =========================================================
    // readFileToByteBuffer(File)
    // =========================================================
    @Test
    public void readFileToByteBuffer_readsFileContentCorrectly() throws IOException {
        File file = tempFolder.newFile("data.bin");
        byte[] content = "FileContentForByteBufferTest".getBytes("UTF-8");
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(content);
        }

        ByteBuffer buf = DataUtil.readFileToByteBuffer(file);
        byte[] actual = new byte[buf.remaining()];
        buf.get(actual);

        assertArrayEquals(content, actual);
    }

    // =========================================================
    // emptyByteBuffer
    // =========================================================
    @Test
    public void emptyByteBuffer_hasZeroCapacityAndRemaining() {
        ByteBuffer buf = DataUtil.emptyByteBuffer();
        assertEquals(0, buf.capacity());
        assertEquals(0, buf.remaining());
    }

    // =========================================================
    // getCharsetFromContentType
    // =========================================================
    @Test
    public void getCharsetFromContentType_nullInput_returnsNull() {
        assertNull(DataUtil.getCharsetFromContentType(null));
    }

    @Test
    public void getCharsetFromContentType_noCharsetPresent_returnsNull() {
        assertNull(DataUtil.getCharsetFromContentType("text/html"));
    }

    @Test
    public void getCharsetFromContentType_validCharset_returnsCharset() {
        String result = DataUtil.getCharsetFromContentType("text/html; charset=UTF-8");
        assertEquals("UTF-8", result);
    }

    @Test
    public void getCharsetFromContentType_quotedCharset_returnsTrimmedCharset() {
        String result = DataUtil.getCharsetFromContentType("text/html; charset=\"UTF-8\"");
        assertEquals("UTF-8", result);
    }

    @Test
    public void getCharsetFromContentType_unsupportedCharset_returnsNull() {
        String result = DataUtil.getCharsetFromContentType("text/html; charset=not-a-real-charset-xyz");
        assertNull(result);
    }

    @Test
    public void getCharsetFromContentType_lowercaseSupportedViaUppercaseFallback() {
        // บาง charset อาจถูก support เฉพาะตัวพิมพ์ใหญ่ -> ทดสอบ branch toUpperCase fallback
        String result = DataUtil.getCharsetFromContentType("text/html; charset=utf-8");
        assertEquals("UTF-8", result);
    }

    // =========================================================
    // mimeBoundary
    // =========================================================
    @Test
    public void mimeBoundary_hasCorrectLengthAndValidCharacters() {
        String boundary = DataUtil.mimeBoundary();
        assertEquals(DataUtil.boundaryLength, boundary.length());

        String allowed = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (char c : boundary.toCharArray()) {
            assertTrue("unexpected char: " + c, allowed.indexOf(c) >= 0);
        }
    }

    @Test
    public void mimeBoundary_generatesDifferentValuesAcrossCalls() {
        // ไม่ guarantee 100% แต่ความชนกันของ random 32-char string นั้นแทบเป็นไปไม่ได้
        String b1 = DataUtil.mimeBoundary();
        String b2 = DataUtil.mimeBoundary();
        assertNotEquals(b1, b2);
    }
}
```

## ตารางสรุป Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `parseInputStream_nullInput_returnsEmptyDocumentWithBaseUri` | `if (input == null)` → true |
| `parseInputStream_withExplicitCharset_parsesCorrectly` | `charsetName != null` branch, `Validate.notEmpty` (ผ่าน) |
| `parseInputStream_withEmptyCharsetName_throwsIllegalArgumentException` | `Validate.notEmpty` throw เมื่อ charsetName="" |
| `parseInputStream_detectCharsetFromMetaHttpEquiv_redecodes` | `meta.hasAttr("http-equiv")`, `foundCharset != null && !equalsIgnoreCase(default)` → redecode |
| `parseInputStream_detectCharsetFromMetaCharsetAttr_redecodes` | `foundCharset == null && meta.hasAttr("charset")` |
| `parseInputStream_detectCharsetFromXmlDeclaration_redecodes` | `first instanceof XmlDeclaration`, `decl.name().equalsIgnoreCase("xml")` |
| `parseInputStream_noCharsetFound_fullyReadKeepsInitialParse` | `foundCharset == null`, `fullyRead == true` → keep doc |
| `parseInputStream_bomUtf8_detectedAndSkipped` | `detectCharsetFromBom` EF BB BF branch, `bomCharset.offset == true` → `reader.skip(1)` |
| `parseInputStream_bomUtf16be_detected` | `detectCharsetFromBom` FE FF / FF FE branch, `offset == false` |
| `load_fromFile_withExplicitCharset_parsesCorrectly` | `load(File,...)` → `parseInputStream` ปกติ |
| `load_fromNonExistingFile_throwsFileNotFoundException` | `FileInputStream` throw ก่อนเข้า `parseInputStream` |
| `load_fromInputStream_nullCharset_detectsFromContent` | `load(InputStream, String, String)` overload |
| `load_fromInputStream_withExplicitParser_xml` | `load(InputStream, String, String, Parser)` overload |
| `crossStreams_copiesAllBytes` / `crossStreams_emptyInput_writesNothing` | `while loop` อ่าน/เขียนข้อมูล, loop ไม่รัน (empty input) |
| `readToByteBuffer_negativeMaxSize_throwsIllegalArgumentException` | `Validate.isTrue(maxSize >= 0,...)` false branch |
| `readToByteBuffer_zeroMaxSize_readsAllContent` | `maxSize == 0` (unlimited) |
| `readToByteBuffer_positiveMaxSize_limitsReadSize` | `maxSize > 0` (limited) |
| `readToByteBuffer_defaultOverload_readsAllContent` | overload `readToByteBuffer(InputStream)` → delegate maxSize=0 |
| `readFileToByteBuffer_readsFileContentCorrectly` | try/finally normal path |
| `emptyByteBuffer_hasZeroCapacityAndRemaining` | ตรวจผลลัพธ์ตรง ๆ |
| `getCharsetFromContentType_nullInput_returnsNull` | `if (contentType == null) return null;` |
| `getCharsetFromContentType_noCharsetPresent_returnsNull` | `m.find()` == false |
| `getCharsetFromContentType_validCharset_returnsCharset` | `m.find()` == true, `validateCharset` supported ตรง ๆ |
| `getCharsetFromContentType_quotedCharset_returnsTrimmedCharset` | regex group + replace quotes |
| `getCharsetFromContentType_unsupportedCharset_returnsNull` | `validateCharset` → ทั้งสอง `isSupported` false → null |
| `getCharsetFromContentType_lowercaseSupportedViaUppercaseFallback` | `validateCharset`: `isSupported(cs)` false → `toUpperCase` → `isSupported` true |
| `mimeBoundary_hasCorrectLengthAndValidCharacters` | for-loop ครบ `boundaryLength` ครั้ง, ตรวจ character set |
| `mimeBoundary_generatesDifferentValuesAcrossCalls` | ตรวจ randomness คร่าว ๆ (ไม่ fault-detect โดยตรง) |

**หมายเหตุสำคัญ (ตามกฎข้อ 4):**
- Branch `detectCharsetFromBom` สำหรับ **UTF-32** ไม่ได้ทดสอบจริง เนื่องจากพฤติกรรมของ `Charset.forName("UTF-32")`/decoder อาจแตกต่างกันในแต่ละ JVM provider ทำให้ test ไม่ deterministic
- Branch `catch (UncheckedIOException e)` ใน `parseInputStream` ไม่ได้ทดสอบ เนื่องจากต้องพึ่งพา internal behavior ของ `Parser.parseInput` ในการโยน `UncheckedIOException` ซึ่งไม่ปรากฏชัดเจนในซอร์สที่ให้มาว่าจะเกิดขึ้นได้อย่างไรโดยไม่ mock stream ที่ error ขณะอ่าน (ซึ่งต้องพึ่งพา `ConstrainableInputStream` behavior ที่ไม่ได้แสดงในซอร์ส)
- สมมติฐานเกี่ยวกับ exception type ที่โยนจาก `Validate.notEmpty` และ `Validate.isTrue` (`IllegalArgumentException`) มีคอมเมนต์กำกับไว้ในโค้ดเนื่องจากคลาส `Validate` ไม่ได้อยู่ในซอร์สที่ให้มา