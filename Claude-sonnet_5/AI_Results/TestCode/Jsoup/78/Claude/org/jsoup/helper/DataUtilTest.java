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
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

import static org.junit.Assert.*;
import static org.junit.Assume.assumeTrue;

public class DataUtilTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    // ---------------------------------------------------------------
    // getCharsetFromContentType
    // ---------------------------------------------------------------

    @Test
    public void getCharsetFromContentType_nullInput_returnsNull() {
        assertNull(DataUtil.getCharsetFromContentType(null));
    }

    @Test
    public void getCharsetFromContentType_emptyInput_returnsNull() {
        assertNull(DataUtil.getCharsetFromContentType(""));
    }

    @Test
    public void getCharsetFromContentType_noCharset_returnsNull() {
        assertNull(DataUtil.getCharsetFromContentType("text/html"));
    }

    @Test
    public void getCharsetFromContentType_validCharset_returnsCharset() {
        String cs = DataUtil.getCharsetFromContentType("text/html; charset=UTF-8");
        assertEquals("UTF-8", cs);
    }

    @Test
    public void getCharsetFromContentType_quotedCharset_returnsStrippedCharset() {
        String cs = DataUtil.getCharsetFromContentType("text/html; charset=\"ISO-8859-1\"");
        assertEquals("ISO-8859-1", cs);
    }

    @Test
    public void getCharsetFromContentType_singleQuotedCharset_returnsStrippedCharset() {
        String cs = DataUtil.getCharsetFromContentType("text/html; charset='ISO-8859-1'");
        assertEquals("ISO-8859-1", cs);
    }

    @Test
    public void getCharsetFromContentType_trailingSemicolon_notIncludedInGroup() {
        String cs = DataUtil.getCharsetFromContentType("text/html; charset=UTF-8;");
        assertEquals("UTF-8", cs);
    }

    @Test
    public void getCharsetFromContentType_unsupportedCharset_returnsNull() {
        // ไม่มี charset ชื่อนี้อยู่จริง -> validateCharset ควร return null
        String cs = DataUtil.getCharsetFromContentType("text/html; charset=not-a-real-charset-xyz");
        assertNull(cs);
    }

    @Test
    public void getCharsetFromContentType_caseInsensitiveHeader_matches() {
        // ตัว pattern เป็น (?i) จึงจับได้แม้ header เป็นตัวพิมพ์ใหญ่/เล็กผสม
        String cs = DataUtil.getCharsetFromContentType("TEXT/HTML; CHARSET=utf-8");
        assertEquals("utf-8", cs); // validateCharset ไม่ได้แปลงเป็น uppercase ถ้า isSupported ผ่านตั้งแต่แรก
    }

    // ---------------------------------------------------------------
    // emptyByteBuffer
    // ---------------------------------------------------------------

    @Test
    public void emptyByteBuffer_hasZeroCapacityAndRemaining() {
        ByteBuffer buf = DataUtil.emptyByteBuffer();
        assertEquals(0, buf.capacity());
        assertEquals(0, buf.remaining());
    }

    // ---------------------------------------------------------------
    // mimeBoundary
    // ---------------------------------------------------------------

    @Test
    public void mimeBoundary_hasCorrectLength() {
        String boundary = DataUtil.mimeBoundary();
        assertEquals(DataUtil.boundaryLength, boundary.length());
    }

    @Test
    public void mimeBoundary_onlyContainsAllowedCharacters() {
        String allowed = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String boundary = DataUtil.mimeBoundary();
        for (char c : boundary.toCharArray()) {
            assertTrue("char not allowed: " + c, allowed.indexOf(c) >= 0);
        }
    }

    @Test
    public void mimeBoundary_twoCallsProduceDifferentValues() {
        // เป็นการสุ่ม (Random) ความน่าจะเป็นชนกันต่ำมาก (65^32 ความเป็นไปได้)
        // ถือเป็น sanity-check เรื่อง randomness ไม่ใช่การยืนยัน uniqueness แบบ absolute
        String a = DataUtil.mimeBoundary();
        String b = DataUtil.mimeBoundary();
        assertNotEquals(a, b);
    }

    // ---------------------------------------------------------------
    // readToByteBuffer(InputStream, int)
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void readToByteBuffer_negativeMaxSize_throws() throws IOException {
        // สมมติฐาน: Validate.isTrue throw IllegalArgumentException (ไม่มี source ของ Validate ให้ดู)
        DataUtil.readToByteBuffer(new ByteArrayInputStream(new byte[]{1, 2, 3}), -1);
    }

    @Test
    public void readToByteBuffer_maxSizeZero_readsAllData() throws IOException {
        byte[] data = "Hello World".getBytes("UTF-8");
        ByteBuffer buf = DataUtil.readToByteBuffer(new ByteArrayInputStream(data), 0);
        assertEquals(data.length, buf.remaining());
        byte[] out = new byte[buf.remaining()];
        buf.get(out);
        assertArrayEquals(data, out);
    }

    @Test
    public void readToByteBuffer_maxSizeSmallerThanData_truncates() throws IOException {
        byte[] data = new byte[1000];
        Arrays.fill(data, (byte) 'x');
        ByteBuffer buf = DataUtil.readToByteBuffer(new ByteArrayInputStream(data), 500);
        // ตาม javadoc: maxSize คือขนาดสูงสุดที่อ่าน
        assertEquals(500, buf.remaining());
    }

    @Test
    public void readToByteBuffer_maxSizeLargerThanData_returnsAllData() throws IOException {
        byte[] data = "short".getBytes("UTF-8");
        ByteBuffer buf = DataUtil.readToByteBuffer(new ByteArrayInputStream(data), 10000);
        assertEquals(data.length, buf.remaining());
    }

    @Test
    public void readToByteBuffer_oneArgOverload_delegatesWithZero() throws IOException {
        byte[] data = "abc".getBytes("UTF-8");
        ByteBuffer buf = DataUtil.readToByteBuffer(new ByteArrayInputStream(data));
        assertEquals(data.length, buf.remaining());
    }

    @Test
    public void readToByteBuffer_emptyStream_returnsEmptyBuffer() throws IOException {
        ByteBuffer buf = DataUtil.readToByteBuffer(new ByteArrayInputStream(new byte[0]), 0);
        assertEquals(0, buf.remaining());
    }

    // ---------------------------------------------------------------
    // readFileToByteBuffer
    // ---------------------------------------------------------------

    @Test
    public void readFileToByteBuffer_readsFileContentCorrectly() throws IOException {
        byte[] content = "File content for test".getBytes("UTF-8");
        File file = tempFolder.newFile("test.txt");
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(content);
        }
        ByteBuffer buf = DataUtil.readFileToByteBuffer(file);
        assertEquals(content.length, buf.remaining());
        byte[] out = new byte[buf.remaining()];
        buf.get(out);
        assertArrayEquals(content, out);
    }

    // ---------------------------------------------------------------
    // crossStreams
    // ---------------------------------------------------------------

    @Test
    public void crossStreams_copiesSmallDataExactly() throws IOException {
        byte[] data = "small payload".getBytes("UTF-8");
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DataUtil.crossStreams(in, out);
        assertArrayEquals(data, out.toByteArray());
    }

    @Test
    public void crossStreams_emptyStream_producesEmptyOutput() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[0]);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DataUtil.crossStreams(in, out);
        assertEquals(0, out.toByteArray().length);
    }

    @Test
    public void crossStreams_largeDataSpanningMultipleBuffers() throws IOException {
        // ขนาดใหญ่กว่า bufferSize (1024*32) เพื่อบังคับให้ loop วิ่งหลายรอบ
        byte[] data = new byte[(1024 * 32) * 2 + 123];
        new java.util.Random(42).nextBytes(data);
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DataUtil.crossStreams(in, out);
        assertArrayEquals(data, out.toByteArray());
    }

    // ---------------------------------------------------------------
    // parseInputStream - null input (boundary case)
    // ---------------------------------------------------------------

    @Test
    public void parseInputStream_nullInput_returnsEmptyDocumentWithBaseUri() throws IOException {
        Document doc = DataUtil.parseInputStream(null, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("http://example.com/", doc.baseUri());
    }

    // ---------------------------------------------------------------
    // parseInputStream - explicit charsetName branch
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void parseInputStream_emptyCharsetName_throws() throws IOException {
        // สมมติฐาน: Validate.notEmpty throw IllegalArgumentException
        String html = "<html><body>hi</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        DataUtil.parseInputStream(in, "", "http://example.com/", Parser.htmlParser());
    }

    @Test
    public void parseInputStream_explicitCharset_overridesMetaCharset() throws IOException {
        // meta ระบุ ISO-8859-1 แต่ caller บังคับ UTF-8 -> ควรใช้ UTF-8 (ไม่เข้า branch meta-detection)
        String html = "<html><head><meta charset=\"ISO-8859-1\"></head><body>Body</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseInputStream(in, "UTF-8", "http://example.com/", Parser.htmlParser());
        assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    // ---------------------------------------------------------------
    // parseInputStream - meta charset detection (charsetName == null)
    // ---------------------------------------------------------------

    @Test
    public void parseInputStream_metaCharsetAttribute_detectsAndRedecodes() throws IOException {
        String html = "<html><head><meta charset=\"ISO-8859-1\"></head><body>Body</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());
        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void parseInputStream_metaHttpEquivContentType_detectsAndRedecodes() throws IOException {
        String html = "<html><head>"
            + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">"
            + "</head><body>Body</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());
        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void parseInputStream_metaCharsetEqualsDefault_noRedecodeNeeded() throws IOException {
        // foundCharset == defaultCharset (UTF-8) (case-insensitive) -> ไม่เข้า branch redecode
        String html = "<html><head><meta charset=\"utf-8\"></head><body>Body</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());
        assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test
    public void parseInputStream_noMetaCharset_shortContent_fullyReadBranch() throws IOException {
        // เนื้อหาสั้น < firstReadBufferSize -> fullyRead=true, ไม่มี meta charset -> คง doc เดิม (UTF-8)
        String html = "<html><body>short</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());
        assertEquals("UTF-8", doc.outputSettings().charset().name());
        assertEquals("short", doc.body().text());
    }

    @Test
    public void parseInputStream_noMetaCharset_largeContent_notFullyReadBranch() throws IOException {
        // เนื้อหายาวกว่า firstReadBufferSize (1024*5) เพื่อบังคับ fullyRead=false -> doc ถูก set null แล้ว re-parse
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) sb.append('a');
        String filler = sb.toString();
        String html = "<html><body>" + filler + "</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());
        assertEquals("UTF-8", doc.outputSettings().charset().name());
        assertEquals(filler, doc.body().text());
    }

    @Test
    public void parseInputStream_xmlPrologEncoding_detectsAndRedecodes() throws IOException {
        String xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><root>data</root>";
        InputStream in = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.xmlParser());
        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    // ---------------------------------------------------------------
    // parseInputStream - BOM detection
    // ---------------------------------------------------------------

    @Test
    public void parseInputStream_utf8Bom_detectedAndSkipped() throws IOException {
        byte[] bom = {(byte) 0xEF, (byte) 0xBB, (byte) 0xBF};
        byte[] body = "<html><head><title>Hi</title></head><body>Body</body></html>".getBytes("UTF-8");
        byte[] all = new byte[bom.length + body.length];
        System.arraycopy(bom, 0, all, 0, bom.length);
        System.arraycopy(body, 0, all, bom.length, body.length);

        InputStream in = new ByteArrayInputStream(all);
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());
        assertEquals("UTF-8", doc.outputSettings().charset().name());
        assertEquals("Hi", doc.title());
    }

    @Test
    public void parseInputStream_utf16BeBom_detected() throws IOException {
        byte[] bom = {(byte) 0xFE, (byte) 0xFF};
        byte[] body = "<html><head><title>Hi</title></head><body>Body</body></html>".getBytes("UTF-16BE");
        byte[] all = new byte[bom.length + body.length];
        System.arraycopy(bom, 0, all, 0, bom.length);
        System.arraycopy(body, 0, all, bom.length, body.length);

        InputStream in = new ByteArrayInputStream(all);
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());
        assertEquals("UTF-16", doc.outputSettings().charset().name());
        assertEquals("Hi", doc.title());
    }

    @Test
    public void parseInputStream_utf16LeBom_detected() throws IOException {
        byte[] bom = {(byte) 0xFF, (byte) 0xFE};
        byte[] body = "<html><head><title>Hi</title></head><body>Body</body></html>".getBytes("UTF-16LE");
        byte[] all = new byte[bom.length + body.length];
        System.arraycopy(bom, 0, all, 0, bom.length);
        System.arraycopy(body, 0, all, bom.length, body.length);

        InputStream in = new ByteArrayInputStream(all);
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());
        assertEquals("UTF-16", doc.outputSettings().charset().name());
        assertEquals("Hi", doc.title());
    }

    @Test
    public void parseInputStream_utf32BeBom_detected_ifSupported() throws IOException {
        // UTF-32 ไม่ได้รับประกันว่ามีในทุก JVM (ตามคอมเมนต์ในซอร์ส "I hope it's on your system")
        assumeTrue(Charset.isSupported("UTF-32"));
        assumeTrue(Charset.isSupported("UTF-32BE"));

        byte[] bom = {0x00, 0x00, (byte) 0xFE, (byte) 0xFF};
        byte[] body = "<html><head><title>Hi</title></head><body>Body</body></html>".getBytes("UTF-32BE");
        byte[] all = new byte[bom.length + body.length];
        System.arraycopy(bom, 0, all, 0, bom.length);
        System.arraycopy(body, 0, all, bom.length, body.length);

        InputStream in = new ByteArrayInputStream(all);
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());
        assertEquals("UTF-32", doc.outputSettings().charset().name());
        assertEquals("Hi", doc.title());
    }

    @Test
    public void parseInputStream_noBom_plainAsciiHtml_noBomBranchTaken() throws IOException {
        // ค่าควบคุม: เนื้อหาไม่มี BOM เลย -> detectCharsetFromBom ต้อง return null และไป path อื่น
        String html = "<html><head><title>NoBom</title></head><body>Body</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());
        assertEquals("NoBom", doc.title());
    }

    // ---------------------------------------------------------------
    // load(File, String, String)
    // ---------------------------------------------------------------

    @Test
    public void loadFile_parsesDocumentCorrectly() throws IOException {
        String html = "<html><head><title>FileTest</title></head><body>FileBody</body></html>";
        File file = tempFolder.newFile("page.html");
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(html.getBytes("UTF-8"));
        }
        Document doc = DataUtil.load(file, "UTF-8", "http://example.com/");
        assertEquals("FileTest", doc.title());
        assertEquals("FileBody", doc.body().text());
    }

    // ---------------------------------------------------------------
    // load(InputStream, String, String)
    // ---------------------------------------------------------------

    @Test
    public void loadInputStream_withNullCharset_detectsFromMeta() throws IOException {
        String html = "<html><head><meta charset=\"ISO-8859-1\"></head><body>B</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.load(in, null, "http://example.com/");
        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    // ---------------------------------------------------------------
    // load(InputStream, String, String, Parser) - with xml parser
    // ---------------------------------------------------------------

    @Test
    public void loadInputStreamWithParser_xmlParser_parsesCorrectly() throws IOException {
        String xml = "<root><child>value</child></root>";
        InputStream in = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com/", Parser.xmlParser());
        assertEquals("value", doc.select("child").text());
    }
}
