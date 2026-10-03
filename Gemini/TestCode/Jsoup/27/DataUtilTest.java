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
    public void testGetCharsetFromContentTypeNull() {
        assertNull(DataUtil.getCharsetFromContentType(null));
    }

    @Test
    public void testGetCharsetFromContentTypeNoMatch() {
        assertNull(DataUtil.getCharsetFromContentType("text/html"));
        assertNull(DataUtil.getCharsetFromContentType("text/plain; foo=bar"));
    }

    @Test
    public void testGetCharsetFromContentTypeValidHttpEquiv() {
        String contentType = "text/html; charset=shift-jis";
        assertEquals("SHIFT-JIS", DataUtil.getCharsetFromContentType(contentType));
    }

    @Test
    public void testGetCharsetFromContentTypeWithQuotes() {
        String contentType = "text/html; charset=\"utf-8\"";
        // Since utf-8 equals defaultCharset, but method just extracts and uppercases:
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType(contentType));
    }

    @Test
    public void testParseByteDataWithExplicitCharset() throws Exception {
        String html = "<html><head><title>Explicit</title></head><body>Hello</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));
        
        Document doc = DataUtil.parseByteData(byteData, "UTF-8", "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("Explicit", doc.title());
    }

    @Test
    public void testParseByteDataDetectCharsetHttpEquiv() throws Exception {
        // HTML with meta http-equiv specifying a different charset (e.g., ISO-8859-1)
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"><title>Meta Content</title></head><body>ümlaut</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("Meta Content", doc.title());
    }

    @Test
    public void testParseByteDataDetectCharsetHtml5Meta() throws Exception {
        // HTML5 style meta charset
        String html = "<html><head><meta charset=\"ISO-8859-1\"><title>HTML5 Meta</title></head><body>test</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("HTML5 Meta", doc.title());
    }

    @Test
    public void testParseByteDataNoMetaDefaultsToUtf8() throws Exception {
        String html = "<html><head><title>No Meta</title></head><body>test</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("No Meta", doc.title());
    }

    @Test
    public void testParseByteDataWithBOM() throws Exception {
        // BOM character is \uFEFF (code 65279)
        String html = "\uFEFF<html><head><title>BOM Test</title></head><body>test</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.parseByteData(byteData, "UTF-8", "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("BOM Test", doc.title());
    }

    @Test
    public void testLoadInputStreamWithCharset() throws Exception {
        String html = "<html><head><title>Stream Load</title></head><body>content</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.load(in, "UTF-8", "http://example.com");
        assertNotNull(doc);
        assertEquals("Stream Load", doc.title());
    }

    @Test
    public void testLoadInputStreamWithParser() throws Exception {
        String html = "<root><child>Text</child></root>";
        InputStream in = new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.load(in, "UTF-8", "http://example.com", Parser.xmlParser());
        assertNotNull(doc);
        assertEquals("Text", doc.select("child").text());
    }

    @Test(expected = IOException.class)
    public void testLoadNonExistentFile() throws Exception {
        File nonExistent = new File("non_existent_file_12345.html");
        DataUtil.load(nonExistent, "UTF-8", "http://example.com");
    }

    @Test
    public void testReadToByteBufferEdgeCases() throws Exception {
        byte[] data = new byte[0];
        InputStream in = new ByteArrayInputStream(data);
        ByteBuffer buffer = DataUtil.readToByteBuffer(in);
        assertNotNull(buffer);
        assertEquals(0, buffer.remaining());
    }
}