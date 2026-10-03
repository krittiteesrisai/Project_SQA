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
    public void testParseByteDataWithNullCharsetAndHttpEquivMeta() {
        // ทดสอบ charsetName == null, มี meta http-equiv, และต้อง re-decode
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=Shift_JIS\"></head><body>Hello Shift_JIS</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));
        
        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
    }

    @Test
    public void testParseByteDataWithNullCharsetAndCharsetMeta() {
        // ทดสอบ charsetName == null, มี meta charset (HTML5 style), และ re-decode
        String html = "<html><head><meta charset=\"ISO-8859-1\"></head><body>Hello ISO</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));
        
        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
    }

    @Test
    public void testParseByteDataWithNullCharsetAndNoMeta() {
        // ทดสอบ charsetName == null, แต่ไม่พบ meta tag (คงเหลือ UTF-8 เป็นค่าปริยาย)
        String html = "<html><head></head><body>Hello UTF-8</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));
        
        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
    }

    @Test
    public void testParseByteDataWithNullCharsetAndDefaultCharsetMeta() {
        // ทดสอบ charsetName == null, พบ meta แต่ charset ตรงกับ defaultCharset (UTF-8) จึงไม่ต้อง re-decode ซ้ำ
        String html = "<html><head><meta charset=\"UTF-8\"></head><body>Hello UTF-8</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));
        
        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
    }

    @Test
    public void testParseByteDataWithExplicitCharset() {
        // ทดสอบระบุ charsetName มาตรงๆ ไม่เป็น null
        String html = "<html><body>Explicit Charset</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));
        
        Document doc = DataUtil.parseByteData(byteData, "UTF-8", "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseByteDataWithEmptyExplicitCharset() {
        // ทดสอบระบุ charsetName เป็นสตริงว่าง เพื่อให้ Validate.notEmptyโยน Exception
        ByteBuffer byteData = ByteBuffer.wrap(new byte[0]);
        DataUtil.parseByteData(byteData, "", "http://example.com", Parser.htmlParser());
    }

    @Test
    public void testParseByteDataWithBOM() {
        // ทดสอบกรณีมี Byte Order Mark (BOM - \uFEFF หรือค่า 65279) ที่ต้นสตรีม
        String html = "\uFEFF<html><body>BOM Test</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));
        
        Document doc = DataUtil.parseByteData(byteData, "UTF-8", "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
    }

    @Test
    public void testReadToByteBufferWithMaxSizeUnlimited() throws IOException {
        // ทดสอบอ่าน InputStream แบบไม่จำกัด maxSize (maxSize = 0)
        String content = "Hello DataUtil Stream Read Test";
        InputStream in = new ByteArrayInputStream(content.getBytes(StandardCharsets.UTF_8));
        
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 0);
        assertNotNull(buffer);
        assertTrue(buffer.capacity() > 0);
    }

    @Test
    public void testReadToByteBufferWithCappedMaxSize() throws IOException {
        // ทดสอบอ่าน InputStream แบบจำกัด maxSize และข้อมูลยาวกว่า maxSize (เข้าเงื่อนไข read > remaining)
        String content = "Long content that exceeds max size limit.";
        InputStream in = new ByteArrayInputStream(content.getBytes(StandardCharsets.UTF_8));
        
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 5);
        assertNotNull(buffer);
        assertEquals(5, buffer.remaining());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadToByteBufferInvalidMaxSize() throws IOException {
        // ทดสอบส่ง maxSize ติดลบ เพื่อให้ Validate.isTrue โยน Exception
        InputStream in = new ByteArrayInputStream(new byte[0]);
        DataUtil.readToByteBuffer(in, -1);
    }

    @Test
    public void testGetCharsetFromContentTypeNull() {
        // ทดสอบ getCharsetFromContentType ด้วยค่า null
        assertNull(DataUtil.getCharsetFromContentType(null));
    }

    @Test
    public void testGetCharsetFromContentTypeValid() {
        // ทดสอบดึง charset ที่รองรับสำเร็จ
        String contentType = "text/html; charset=UTF-8";
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType(contentType));
    }

    @Test
    public void testGetCharsetFromContentTypeWithQuotesAndSpaces() {
        // ทดสอบดึง charset ที่มีเครื่องหมายคำพูดและเว้นวรรค
        String contentType = "text/html; charset=\"ISO-8859-1\"";
        assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType(contentType));
    }

    @Test
    public void testGetCharsetFromContentTypeUnsupportedFallbackToNull() {
        // ทดสอบกรณี charset ไม่รองรับ คืนค่า null
        String contentType = "text/html; charset=INVALID-CHARSET-XYZ";
        assertNull(DataUtil.getCharsetFromContentType(contentType));
    }

    @Test
    public void testLoadInputStreamWithParser() throws IOException {
        // ทดสอบเมธอด load(InputStream, charsetName, baseUri, parser)
        String content = "<html><body>Load Test</body></html>";
        InputStream in = new ByteArrayInputStream(content.getBytes(StandardCharsets.UTF_8));
        
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
    }

    @Test
    public void testLoadInputStreamWithoutParser() throws IOException {
        // ทดสอบเมธอด load(InputStream, charsetName, baseUri)
        String content = "<html><body>Load Test 2</body></html>";
        InputStream in = new ByteArrayInputStream(content.getBytes(StandardCharsets.UTF_8));
        
        Document doc = DataUtil.load(in, null, "http://example.com");
        assertNotNull(doc);
    }
}