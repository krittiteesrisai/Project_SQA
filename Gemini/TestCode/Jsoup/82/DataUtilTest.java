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
    public void testParseInputStreamNullInput() throws IOException {
        Document doc = DataUtil.load((InputStream) null, "UTF-8", "http://example.com");
        assertNotNull(doc);
        assertEquals("http://example.com", doc.baseUri());
    }

    @Test
    public void testGetCharsetFromContentTypeEdgeCases() {
        assertNull(DataUtil.getCharsetFromContentType(null));
        assertNull(DataUtil.getCharsetFromContentType("text/html"));
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=utf-8"));
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=\"UTF-8\""));
        assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType("text/html;charset=ISO-8859-1"));
        assertNull(DataUtil.getCharsetFromContentType("text/html; charset=invalid-charset-name-xyz"));
    }

    @Test
    public void testReadToByteBufferValidation() {
        try {
            DataUtil.readToByteBuffer(new ByteArrayInputStream(new byte[0]), -1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException | IOException e) {
            // Expected exception due to negative maxSize
        }
    }

    @Test
    public void testMimeBoundaryGeneration() {
        String boundary1 = DataUtil.mimeBoundary();
        String boundary2 = DataUtil.mimeBoundary();
        assertNotNull(boundary1);
        assertEquals(DataUtil.boundaryLength, boundary1.length());
        assertNotEquals(boundary1, boundary2);
    }

    @Test
    public void testLoadInputStreamWithCharsetSpecified() throws IOException {
        String html = "<html><head><title>Test</title></head><body>Hello</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com");
        assertNotNull(doc);
        assertEquals("Test", doc.title());
    }

    @Test
    public void testLoadInputStreamWithMetaCharset() throws IOException {
        String html = "<html><head><meta charset=\"UTF-8\"><title>Meta Test</title></head><body></body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.load(in, null, "http://example.com");
        assertNotNull(doc);
        assertEquals("Meta Test", doc.title());
    }

    @Test
    public void testLoadInputStreamWithHttpEquivCharset() throws IOException {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"><title>HttpEquiv</title></head><body></body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.load(in, null, "http://example.com");
        assertNotNull(doc);
        assertEquals("HttpEquiv", doc.title());
    }

    @Test
    public void testLoadInputStreamWithXmlDeclaration() throws IOException {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><root><child>data</child></root>";
        InputStream in = new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.load(in, null, "http://example.com", Parser.xmlParser());
        assertNotNull(doc);
        assertEquals("data", doc.select("child").text());
    }

    @Test
    public void testLoadInputStreamWithXmlCommentDeclaration() throws IOException {
        String xml = "<!--<?xml version=\"1.0\" encoding=\"UTF-8\"?>--><root></root>";
        InputStream in = new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.load(in, null, "http://example.com", Parser.xmlParser());
        assertNotNull(doc);
    }

    @Test
    public void testLoadInputStreamWithBomUtf8() throws IOException {
        byte[] bom = {(byte) 0xEF, (byte) 0xBB, (byte) 0xBF};
        byte[] content = "<html><head><title>BOM</title></head></html>".getBytes(StandardCharsets.UTF_8);
        byte[] combined = new byte[bom.length + content.length];
        System.arraycopy(bom, 0, combined, 0, bom.length);
        System.arraycopy(content, 0, combined, bom.length, content.length);

        InputStream in = new ByteArrayInputStream(combined);
        Document doc = DataUtil.load(in, null, "http://example.com");
        assertNotNull(doc);
        assertEquals("BOM", doc.title());
    }

    @Test
    public void testLoadInputStreamWithBomUtf16Be() throws IOException {
        byte[] bom = {(byte) 0xFE, (byte) 0xFF};
        byte[] content = "<html></html>".getBytes(StandardCharsets.UTF_16BE);
        byte[] combined = new byte[bom.length + content.length];
        System.arraycopy(bom, 0, combined, 0, bom.length);
        System.arraycopy(content, 0, combined, bom.length, content.length);

        InputStream in = new ByteArrayInputStream(combined);
        Document doc = DataUtil.load(in, null, "http://example.com");
        assertNotNull(doc);
    }
}