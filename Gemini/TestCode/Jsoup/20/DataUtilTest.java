package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class DataUtilTest {

    @Test
    public void testGetCharsetFromContentTypeNull() {
        assertNull(DataUtil.getCharsetFromContentType(null));
    }

    @Test
    public void testGetCharsetFromContentTypeValid() {
        String contentType = "text/html; charset=ISO-8859-1";
        assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType(contentType));

        String contentTypeQuotes = "text/html; charset=\"shift_jis\"";
        assertEquals("SHIFT_JIS", DataUtil.getCharsetFromContentType(contentTypeQuotes));
    }

    @Test
    public void testGetCharsetFromContentTypeNotFound() {
        String contentType = "text/html; charset=";
        // ถ้ารูปแบบไม่ตรงกับ pattern group(1) จะคืนค่าว่างหรือ null ตามลักษณะ regex
        assertNull(DataUtil.getCharsetFromContentType("text/html"));
    }

    @Test
    public void testParseByteDataWithExplicitCharset() {
        String html = "<html><head><title>Test</title></head><body>Hello</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));
        
        Document doc = DataUtil.parseByteData(byteData, "UTF-8", "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("Test", doc.title());
        assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseByteDataWithEmptyExplicitCharset() {
        String html = "<html></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));
        // จะต้องติด Validate.notEmpty
        DataUtil.parseByteData(byteData, "", "http://example.com", Parser.htmlParser());
    }

    @Test
    public void testParseByteDataAutoDetectMetaCharset() {
        // HTML มี meta charset ระบุไว้เป็น Shift_JIS แต่ตอนแรก parse ด้วย UTF-8
        String html = "<html><head><meta charset=\"Shift_JIS\"></head><body>こんにちは</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("SHIFT_JIS", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteDataAutoDetectHttpEquivCharset() {
        // HTML มี meta http-equiv ระบุ charset
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-JP\"></head><body>Test</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("EUC-JP", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteDataAutoDetectNoMetaFound() {
        // ไม่มี meta tag ระบบควรจะใช้ UTF-8 ตาม default
        String html = "<html><head><title>No Meta</title></head><body>Body</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test
    public void testLoadInputStream() throws IOException {
        String html = "<html><head><title>Stream Load</title></head><body>Stream</body></html>";
        ByteArrayInputStream bais = new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.load(bais, "UTF-8", "http://example.com");
        assertNotNull(doc);
        assertEquals("Stream Load", doc.title());
    }

    @Test
    public void testLoadInputStreamWithParser() throws IOException {
        String html = "<root><child>Text</child></root>";
        ByteArrayInputStream bais = new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.load(bais, "UTF-8", "http://example.com", Parser.xmlParser());
        assertNotNull(doc);
        assertEquals("Text", doc.select("child").text());
    }

    @Test
    public void testLoadFile() throws IOException {
        File tempFile = File.createTempFile("jsoup-test", ".html");
        tempFile.deleteOnExit();

        try (FileOutputStream fos = new FileOutputStream(tempFile)) {
            fos.write("<html><head><title>File Load</title></head><body>File</body></html>".getBytes(StandardCharsets.UTF_8));
        }

        Document doc = DataUtil.load(tempFile, "UTF-8", "http://example.com");
        assertNotNull(doc);
        assertEquals("File Load", doc.title());
    }
}