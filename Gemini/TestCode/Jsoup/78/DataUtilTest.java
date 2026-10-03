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
    public void testParseInputStream_NullInput() throws IOException {
        Document doc = DataUtil.parseInputStream(null, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("http://example.com", doc.baseUri());
    }

    @Test
    public void testParseInputStream_WithUtf8Bom() throws IOException {
        byte[] bomData = new byte[] { (byte) 0xEF, (byte) 0xBB, (byte) 0xBF, '<', 'h', 't', 'm', 'l', '>', '<', 'h', 'e', 'a', 'd', '>', '<', '/', 'h', 'e', 'a', 'd', '>', '<', 'b', 'o', 'd', 'y', '>', 'H', 'e', 'l', 'l', 'o', '<', '/', 'b', 'o', 'd', 'y', '>', '<', '/', 'h', 't', 'm', 'l', '>' };
        InputStream in = new ByteArrayInputStream(bomData);
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertTrue(doc.text().contains("Hello"));
    }

    @Test
    public void testParseInputStream_WithUtf16BeBom() throws IOException {
        byte[] bomData = new byte[] { (byte) 0xFE, (byte) 0xFF, 0, '<', 0, 'h', 0, 't', 0, 'm', 0, 'l', 0, '>' };
        InputStream in = new ByteArrayInputStream(bomData);
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
    }

    @Test
    public void testParseInputStream_MetaCharsetHtml5() throws IOException {
        String html = "<html><head><meta charset=\"ISO-8859-1\"></head><body>ISO Content</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertTrue(doc.text().contains("ISO Content"));
    }

    @Test
    public void testParseInputStream_MetaContentType() throws IOException {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=Shift_JIS\"></head><body>Shift JIS</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
    }

    @Test
    public void testParseInputStream_XmlDeclarationEncoding() throws IOException {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-16\"?><root>XML Content</root>";
        InputStream in = new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com", Parser.xmlParser());
        assertNotNull(doc);
    }

    @Test
    public void testParseInputStream_ExplicitCharset() throws IOException {
        String html = "<html><body>Explicit Charset</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.parseInputStream(in, "UTF-8", "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertTrue(doc.text().contains("Explicit Charset"));
    }

    @Test
    public void testParseInputStream_NotFullyRead() throws IOException {
        // Create input larger than firstReadBufferSize (1024 * 5 - 1) to trigger !fullyRead branch
        StringBuilder sb = new StringBuilder();
        sb.append("<html><head><meta charset=\"UTF-8\"></head><body>");
        for (int i = 0; i < 6000; i++) {
            sb.append("a");
        }
        sb.append("</body></html>");
        InputStream in = new ByteArrayInputStream(sb.toString().getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.parseInputStream(in, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
    }

    @Test
    public void testGetCharsetFromContentType() {
        assertNull(DataUtil.getCharsetFromContentType(null));
        assertNull(DataUtil.getCharsetFromContentType("text/html"));
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=UTF-8"));
        assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType("text/html; charset=\"ISO-8859-1\""));
        assertNull(DataUtil.getCharsetFromContentType("text/html; charset=INVALID_CHARSET_NAME_XYZ"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadToByteBuffer_InvalidMaxSize() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[10]);
        DataUtil.readToByteBuffer(in, -1);
    }

    @Test
    public void testReadToByteBuffer_Valid() throws IOException {
        byte[] data = "Test Buffer Data".getBytes(StandardCharsets.UTF_8);
        InputStream in = new ByteArrayInputStream(data);
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 5);
        assertNotNull(buffer);
        assertEquals(5, buffer.remaining());
    }

    @Test
    public void testMimeBoundary() {
        String boundary1 = DataUtil.mimeBoundary();
        String boundary2 = DataUtil.mimeBoundary();
        assertNotNull(boundary1);
        assertEquals(DataUtil.boundaryLength, boundary1.length());
        assertNotEquals(boundary1, boundary2);
    }

    @Test
    public void testLoadFile_EdgeCases() {
        File nonExistent = new File("non_existent_file_12345.html");
        try {
            DataUtil.load(nonExistent, "UTF-8", "http://example.com");
            fail("Expected IOException");
        } catch (IOException e) {
            // Expected
        }
    }
}