package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class DataUtilTest {

    @Test
    public void testParseByteDataWithNullCharsetAndMetaHttpEquiv() {
        // ทดสอบกรณี charsetName == null และมี meta http-equiv กำหนด charset
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"></head><body>Hello</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));
        
        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteDataWithNullCharsetAndHtml5MetaCharset() {
        // ทดสอบกรณี charsetName == null และมี HTML5 meta charset tag
        String html = "<html><head><meta charset=\"UTF-8\"></head><body>UTF-8 Test</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));
        
        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        // เนื่องจากตรงกับ defaultCharset (UTF-8) จึงไม่ต้อง re-decode ซ้ำ แต่ต้องทำงานถูกต้อง
        assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteDataWithNullCharsetAndMetaHttpEquivFallbackToCharsetAttr() {
        // ทดสอบกรณี http-equiv ไม่มี charset แต่มี attribute charset สำรอง
        String html = "<html><head><meta http-equiv=\"Content-Type\" charset=\"ISO-8859-1\"></head><body>Fallback</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));
        
        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteDataWithInvalidCharsetNameExceptionInMeta() {
        // ทดสอบกรณีเจอ IllegalCharsetNameException ใน meta tag
        String html = "<html><head><meta http-equiv=\"Content-Type\" charset=\"invalid-charset-name!\"></head><body>Invalid Charset</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));
        
        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        // ควรตกลงมาใช้ค่า default (UTF-8)
        assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteDataWithSpecifiedCharset() {
        // ทดสอบกรณีระบุ charsetName มาตั้งแต่แรก (ไม่เป็น null)
        String html = "<html><head></head><body>Specified Charset</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(StandardCharsets.ISO_8859_1));
        
        Document doc = DataUtil.parseByteData(byteData, "ISO-8859-1", "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteDataWithBOM() {
        // ทดสอบกรณีมี UTF-8 BOM indicator (char at 0 == 65279)
        String html = "\uFEFF<html><head></head><body>BOM Test</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));
        
        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("UTF-8", doc.outputSettings().charset().name());
        assertTrue(doc.body().text().contains("BOM Test"));
    }

    @Test
    public void testReadToByteBufferWithMaxSizeUnlimited() throws IOException {
        // ทดสอบอ่าน InputStream แบบไม่จำกัดขนาด (maxSize = 0)
        String content = "Hello World DataUtil Stream Test";
        InputStream in = new ByteArrayInputStream(content.getBytes(StandardCharsets.UTF_8));
        
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 0);
        assertNotNull(buffer);
        assertEquals(content, new String(buffer.array(), 0, buffer.remaining(), StandardCharsets.UTF_8));
    }

    @Test
    public void testReadToByteBufferWithMaxSizeCappedExceeded() throws IOException {
        // ทดสอบอ่าน InputStream แบบจำกัดขนาด (maxSize) และข้อมูลยาวเกินกำหนด
        String content = "1234567890ABCDEF";
        InputStream in = new ByteArrayInputStream(content.getBytes(StandardCharsets.UTF_8));
        
        // กำหนด maxSize แค่ 5 ไบต์ เพื่อทดสอบเงื่อนไข read > remaining
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 5);
        assertNotNull(buffer);
        assertEquals(5, buffer.remaining());
        assertEquals("12345", new String(buffer.array(), 0, buffer.remaining(), StandardCharsets.UTF_8));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadToByteBufferInvalidMaxSize() throws IOException {
        // ทดสอบขอบเขต maxSize ติดลบ ต้องโยน IllegalArgumentException
        InputStream in = new ByteArrayInputStream(new byte[0]);
        DataUtil.readToByteBuffer(in, -1);
    }

    @Test
    public void testGetCharsetFromContentTypeNull() {
        // ทดสอบ contentType เป็น null
        assertNull(DataUtil.getCharsetFromContentType(null));
    }

    @Test
    public void testGetCharsetFromContentTypeValid() {
        // ทดสอบดึง charset จากรูปแบบต่างๆ
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=utf-8"));
        assertEquals("EUC-JP", DataUtil.getCharsetFromContentType("text/html; charset=\"EUC-JP\""));
        assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType("text/html; charset='ISO-8859-1'"));
    }

    @Test
    public void testGetCharsetFromContentTypeEmptyAndInvalid() {
        // ทดสอบกรณี charset ว่างเปล่า หรือไม่รองรับ
        assertNull(DataUtil.getCharsetFromContentType("text/html; charset="));
        assertNull(DataUtil.getCharsetFromContentType("text/html; charset=not-a-real-charset-xyz"));
    }

    @Test
    public void testLoadStreamWithParser() throws IOException {
        // ทดสอบเมธอด load จาก InputStream พร้อมระบุ Parser
        String html = "<root><item>Test</item></root>";
        InputStream in = new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8));
        
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com", Parser.xmlParser());
        assertNotNull(doc);
        assertEquals("Test", doc.select("item").text());
    }
}