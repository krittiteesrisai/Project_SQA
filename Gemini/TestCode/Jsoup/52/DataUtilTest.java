package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class DataUtilTest {

    @Test
    public void testParseByteDataWithUtf8Bom() {
        // UTF-8 BOM: EF BB BF followed by HTML with a specific charset or default
        byte[] data = new byte[]{(byte) 0xEF, (byte) 0xBB, (byte) 0xBF, '<', 'h', 't', 'm', 'l', '>', '<', '/', 'h', 't', 'm', 'l', '>'};
        ByteBuffer byteData = ByteBuffer.wrap(data);
        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteDataWithUtf16Bom() {
        // UTF-16 BE BOM: FE FF
        byte[] data = new byte[]{(byte) 0xFE, (byte) 0xFF, 0, '<', 0, 'h', 0, 't', 0, 'm', 0, 'l', 0, '>', 0, '<', 0, '/', 0, 'h', 0, 't', 0, 'm', 0, 'l', 0, '>'};
        ByteBuffer byteData = ByteBuffer.wrap(data);
        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
    }

    @Test
    public void testParseByteDataWithUtf32Bom() {
        // UTF-32 BE BOM: 00 00 FE FF
        byte[] data = new byte[]{0, 0, (byte) 0xFE, (byte) 0xFF, 0, 0, 0, '<', 0, 0, 0, 'h', 0, 0, 0, 't', 0, 0, 0, 'm', 0, 0, 0, 'l', 0, 0, 0, '>'};
        ByteBuffer byteData = ByteBuffer.wrap(data);
        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
    }

    @Test
    public void testParseByteDataMetaCharsetAndHttpEquiv() {
        // Test meta http-equiv and meta charset switching midstream
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html;charset=ISO-8859-1\"></head><body>Hello</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteDataMetaCharsetAttribute() {
        // Test HTML5 <meta charset="...">
        String html = "<html><head><meta charset=\"UTF-16\"></head><body>Hello</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("UTF-16", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteDataXmlDeclarationEncoding() {
        // Test <?xml encoding='ISO-8859-1'?>
        String xml = "<?xml encoding=\"ISO-8859-1\"?><root>Data</root>";
        ByteBuffer byteData = ByteBuffer.wrap(xml.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.xmlParser());
        assertNotNull(doc);
        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteDataWithInvalidCharsetName() {
        // Test invalid or unsupported charset inside meta to trigger exception catch block
        String html = "<html><head><meta charset=\"INVALID-CHARSET-XYZ\"></head><body>Hello</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
    }

    @Test
    public void testGetCharsetFromContentType() {
        assertNull(DataUtil.getCharsetFromContentType(null));
        assertNull(DataUtil.getCharsetFromContentType("text/html"));
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=utf-8"));
        assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType("text/html; charset=\"iso-8859-1\""));
    }

    @Test
    public void testReadToByteBufferCapped() throws IOException {
        byte[] data = "Hello, World! This is a test stream for reading bytes into buffer.".getBytes(StandardCharsets.UTF_8);
        InputStream in = new ByteArrayInputStream(data);
        // Read with maxSize smaller than data length
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 5);
        assertEquals(5, buffer.remaining());
    }

    @Test
    public void testReadToByteBufferUnlimited() throws IOException {
        byte[] data = "Short data".getBytes(StandardCharsets.UTF_8);
        InputStream in = new ByteArrayInputStream(data);
        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 0);
        assertEquals(data.length, buffer.remaining());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadToByteBufferInvalidMaxSize() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        DataUtil.readToByteBuffer(in, -1);
    }

    @Test
    public void testCrossStreams() throws IOException {
        byte[] data = "Cross streams test data".getBytes(StandardCharsets.UTF_8);
        InputStream in = new ByteArrayInputStream(data);
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        DataUtil.crossStreams(in, out);
        assertArrayEquals(data, out.toByteArray());
    }

    @Test
    public void testLoadFile() throws IOException {
        File tempFile = File.createTempFile("jsoup-test", ".html");
        tempFile.deleteOnExit();
        try (FileOutputStream fos = new FileOutputStream(tempFile)) {
            fos.write("<html><body>File Load Test</body></html>".getBytes(StandardCharsets.UTF_8));
        }

        Document doc = DataUtil.load(tempFile, "UTF-8", "http://example.com");
        assertNotNull(doc);
        assertTrue(doc.text().contains("File Load Test"));
    }

    @Test
    public void testEmptyByteBuffer() {
        ByteBuffer buf = DataUtil.emptyByteBuffer();
        assertNotNull(buf);
        assertEquals(0, buf.capacity());
    }

    @Test
    public void testMimeBoundary() {
        String boundary1 = DataUtil.mimeBoundary();
        String boundary2 = DataUtil.mimeBoundary();
        assertNotNull(boundary1);
        assertEquals(DataUtil.boundaryLength, boundary1.length());
        assertNotEquals(boundary1, boundary2);
    }
}