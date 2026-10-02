package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.*;
import java.nio.ByteBuffer;

import static org.junit.Assert.*;

/**
 * JUnit4 tests for org.jsoup.helper.DataUtil
 * หมายเหตุ: บางเงื่อนไข (เช่น exception type ของ Validate) อิงจาก pattern ปกติของ jsoup
 * (IllegalArgumentException) เนื่องจากซอร์ส Validate ไม่ได้ถูกให้มาโดยตรง
 */
public class DataUtilTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    // ---------------------------------------------------------
    // getCharsetFromContentType
    // ---------------------------------------------------------

    @Test
    public void testGetCharsetFromContentType_null() {
        assertNull(DataUtil.getCharsetFromContentType(null));
    }

    @Test
    public void testGetCharsetFromContentType_found() {
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=UTF-8"));
    }

    @Test
    public void testGetCharsetFromContentType_doubleQuoted() {
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=\"UTF-8\""));
    }

    @Test
    public void testGetCharsetFromContentType_singleQuoted() {
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset='UTF-8'"));
    }

    @Test
    public void testGetCharsetFromContentType_notFound() {
        assertNull(DataUtil.getCharsetFromContentType("text/html"));
    }

    @Test
    public void testGetCharsetFromContentType_unsupportedCharset() {
        // valid format แต่ charset ไม่ถูก support -> validateCharset คืน null
        assertNull(DataUtil.getCharsetFromContentType("text/html; charset=invalid-charset-xyz"));
    }

    @Test
    public void testGetCharsetFromContentType_illegalCharsetName() {
        // ชื่อมีอักขระไม่ valid -> ทำให้เกิด IllegalCharsetNameException ใน validateCharset (catch branch)
        assertNull(DataUtil.getCharsetFromContentType("text/html; charset=!!!invalid!!!"));
    }

    @Test
    public void testGetCharsetFromContentType_lowerCaseSupportedDirectly() {
        // กรณี isSupported(cs) เป็น true ตั้งแต่รอบแรก (ไม่ต้อง uppercase)
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=utf-8"));
    }

    // ---------------------------------------------------------
    // mimeBoundary
    // ---------------------------------------------------------

    @Test
    public void testMimeBoundary_lengthAndCharset() {
        String boundary = DataUtil.mimeBoundary();
        assertEquals(DataUtil.boundaryLength, boundary.length());
        for (char c : boundary.toCharArray()) {
            assertTrue(Character.isLetterOrDigit(c) || c == '-' || c == '_');
        }
    }

    // ---------------------------------------------------------
    // crossStreams
    // ---------------------------------------------------------

    @Test
    public void testCrossStreams_normalData() throws IOException {
        byte[] data = "Hello World cross stream test data".getBytes("UTF-8");
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DataUtil.crossStreams(in, out);
        assertArrayEquals(data, out.toByteArray());
    }

    @Test
    public void testCrossStreams_emptyStream() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[0]);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DataUtil.crossStreams(in, out);
        assertEquals(0, out.toByteArray().length);
    }

    // ---------------------------------------------------------
    // readToByteBuffer
    // ---------------------------------------------------------

    @Test
    public void testReadToByteBuffer_unlimited() throws IOException {
        byte[] data = "sample data content".getBytes("UTF-8");
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        ByteBuffer buf = DataUtil.readToByteBuffer(in, 0);
        assertEquals(data.length, buf.limit());
    }

    @Test
    public void testReadToByteBuffer_limitedSize() throws IOException {
        byte[] data = "sample data longer than the limit set".getBytes("UTF-8");
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        ByteBuffer buf = DataUtil.readToByteBuffer(in, 5);
        assertEquals(5, buf.limit());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadToByteBuffer_negativeMaxSize_throws() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream("data".getBytes());
        DataUtil.readToByteBuffer(in, -1);
    }

    // ---------------------------------------------------------
    // emptyByteBuffer
    // ---------------------------------------------------------

    @Test
    public void testEmptyByteBuffer() {
        ByteBuffer buf = DataUtil.emptyByteBuffer();
        assertEquals(0, buf.capacity());
    }

    // ---------------------------------------------------------
    // parseInputStream - null input branch
    // ---------------------------------------------------------

    @Test
    public void testParseInputStream_nullInput_returnsEmptyDoc() throws IOException {
        Document doc = DataUtil.parseInputStream(null, "UTF-8", "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("http://example.com", doc.baseUri());
    }

    // ---------------------------------------------------------
    // parseInputStream - explicit charset branch (Validate.notEmpty)
    // ---------------------------------------------------------

    @Test
    public void testParseInputStream_withExplicitCharset() throws IOException {
        String html = "<html><head></head><body>Hello</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseInputStream(in, "UTF-8", "http://example.com/", Parser.htmlParser());
        assertTrue(doc.text().contains("Hello"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseInputStream_emptyCharsetName_throws() throws IOException {
        String html = "<html></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        DataUtil.parseInputStream(in, "", "http://example.com/", Parser.htmlParser());
    }

    // ---------------------------------------------------------
    // parseInputStream - meta charset detection
    // ---------------------------------------------------------

    @Test
    public void testParseInputStream_metaHttpEquivCharset() throws IOException {
        String html = "<html><head><meta http-equiv=\"Content-Type\" " +
                "content=\"text/html; charset=ISO-8859-1\"></head><body>Test</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());
        assertTrue(doc.text().contains("Test"));
        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseInputStream_metaCharsetAttr() throws IOException {
        String html = "<html><head><meta charset=\"ISO-8859-1\"></head><body>Test2</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());
        assertTrue(doc.text().contains("Test2"));
        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseInputStream_metaCharsetEqualsDefault_fullyRead() throws IOException {
        // foundCharset == "UTF-8" (เท่ากับ defaultCharset) และ fullyRead == true -> ไม่ reparse
        String html = "<html><head><meta charset=\"UTF-8\"></head><body>EqualsDefault</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());
        assertTrue(doc.text().contains("EqualsDefault"));
    }

    @Test
    public void testParseInputStream_noMetaCharset_fullyRead_defaultUtf8() throws IOException {
        String html = "<html><head></head><body>NoMeta</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());
        assertTrue(doc.text().contains("NoMeta"));
        assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    // ---------------------------------------------------------
    // parseInputStream - XML declaration detection
    // ---------------------------------------------------------

    @Test
    public void testParseInputStream_xmlDeclaration_viaXmlParser() throws IOException {
        // first child เป็น XmlDeclaration จริง เมื่อใช้ xmlParser
        String xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><root>data</root>";
        InputStream in = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.xmlParser());
        assertNotNull(doc);
        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseInputStream_xmlDeclaration_asComment_viaHtmlParser() throws IOException {
        // เมื่อ parse ด้วย htmlParser, "<?xml...?>" มักถูกตีความเป็น Comment ที่ isXmlDeclaration()==true
        String xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><html><body>Hi</body></html>";
        InputStream in = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
        assertTrue(doc.text().contains("Hi"));
    }

    // ---------------------------------------------------------
    // parseInputStream - BOM detection
    // ---------------------------------------------------------

    @Test
    public void testParseInputStream_bomUtf8() throws IOException {
        byte[] bom = new byte[]{(byte) 0xEF, (byte) 0xBB, (byte) 0xBF};
        byte[] htmlBytes = "<html><body>BOMTest</body></html>".getBytes("UTF-8");
        byte[] combined = concat(bom, htmlBytes);
        InputStream in = new ByteArrayInputStream(combined);
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());
        assertTrue(doc.text().contains("BOMTest"));
    }

    @Test
    public void testParseInputStream_bomUtf16BE() throws IOException {
        byte[] bomBE = new byte[]{(byte) 0xFE, (byte) 0xFF};
        byte[] htmlBytes = "<html><body>U16BE</body></html>".getBytes("UTF-16BE");
        byte[] combined = concat(bomBE, htmlBytes);
        InputStream in = new ByteArrayInputStream(combined);
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
    }

    @Test
    public void testParseInputStream_bomUtf16LE() throws IOException {
        byte[] bomLE = new byte[]{(byte) 0xFF, (byte) 0xFE};
        byte[] htmlBytes = "<html><body>U16LE</body></html>".getBytes("UTF-16LE");
        byte[] combined = concat(bomLE, htmlBytes);
        InputStream in = new ByteArrayInputStream(combined);
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
    }

    @Test
    public void testParseInputStream_bomOverridesExplicitCharset() throws IOException {
        byte[] bom = new byte[]{(byte) 0xEF, (byte) 0xBB, (byte) 0xBF};
        byte[] htmlBytes = "<html><body>BOMOverride</body></html>".getBytes("UTF-8");
        byte[] combined = concat(bom, htmlBytes);
        InputStream in = new ByteArrayInputStream(combined);
        // charsetName ที่ส่งมาควรถูก BOM override
        Document doc = DataUtil.parseInputStream(in, "ISO-8859-1", "http://example.com/", Parser.htmlParser());
        assertTrue(doc.text().contains("BOMOverride"));
    }

    @Test
    public void testParseInputStream_shortStream_noBom() throws IOException {
        // stream สั้นกว่า 4 bytes -> remaining() < bom.length -> ข้ามการ detect
        byte[] data = "ab".getBytes("UTF-8");
        InputStream in = new ByteArrayInputStream(data);
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
    }

    // ---------------------------------------------------------
    // parseInputStream - fullyRead == false (large content, meta charset reparse)
    // ---------------------------------------------------------

    @Test
    public void testParseInputStream_largeContentWithMetaCharset_reparse() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("<html><head><meta charset=\"UTF-8\"></head><body>");
        for (int i = 0; i < 10000; i++) sb.append("word").append(i).append(" ");
        sb.append("</body></html>");
        InputStream in = new ByteArrayInputStream(sb.toString().getBytes("UTF-8"));
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());
        assertTrue(doc.text().contains("word9999"));
    }

    @Test
    public void testParseInputStream_largeContentNoMetaCharset_notFullyRead() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("<html><body>");
        for (int i = 0; i < 10000; i++) sb.append("x");
        sb.append("</body></html>");
        InputStream in = new ByteArrayInputStream(sb.toString().getBytes("UTF-8"));
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com/", Parser.htmlParser());
        assertNotNull(doc);
    }

    // ---------------------------------------------------------
    // load(File, String, String)
    // ---------------------------------------------------------

    @Test
    public void testLoad_fromFile() throws IOException {
        File f = tempFolder.newFile("test.html");
        try (FileOutputStream fos = new FileOutputStream(f)) {
            fos.write("<html><body>FileLoad</body></html>".getBytes("UTF-8"));
        }
        Document doc = DataUtil.load(f, "UTF-8", "http://example.com/");
        assertTrue(doc.text().contains("FileLoad"));
    }

    @Test(expected = FileNotFoundException.class)
    public void testLoad_fromFile_notFound() throws IOException {
        File f = new File(tempFolder.getRoot(), "nonexistent.html");
        DataUtil.load(f, "UTF-8", "http://example.com/");
    }

    // ---------------------------------------------------------
    // load(InputStream, String, String)
    // ---------------------------------------------------------

    @Test
    public void testLoad_fromInputStream() throws IOException {
        String html = "<html><body>StreamLoad</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com/");
        assertTrue(doc.text().contains("StreamLoad"));
    }

    // ---------------------------------------------------------
    // load(InputStream, String, String, Parser)
    // ---------------------------------------------------------

    @Test
    public void testLoad_fromInputStreamWithXmlParser() throws IOException {
        String xml = "<root><child>Value</child></root>";
        InputStream in = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com/", Parser.xmlParser());
        assertEquals("Value", doc.select("child").text());
    }

    // ---------------------------------------------------------
    // helper
    // ---------------------------------------------------------
    private static byte[] concat(byte[] a, byte[] b) {
        byte[] out = new byte[a.length + b.length];
        System.arraycopy(a, 0, out, 0, a.length);
        System.arraycopy(b, 0, out, a.length, b.length);
        return out;
    }
}
