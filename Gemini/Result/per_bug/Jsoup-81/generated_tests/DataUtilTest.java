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
    public void testDetectCharsetFromBomUtf8() throws IOException {
        // UTF-8 BOM: EF BB BF
        byte[] bomBytes = new byte[] { (byte) 0xEF, (byte) 0xBB, (byte) 0xBF, '<', 'h', 't', 'm', 'l', '>', '<', '/', 'h', 't', 'm', 'l', '>' };
        InputStream in = new ByteArrayInputStream(bomBytes);
        Document doc = DataUtil.load(in, null, "http://example.com");
        assertNotNull(doc);
        assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test
    public void testDetectCharsetFromBomUtf16Be() throws IOException {
        // UTF-16 BE BOM: FE FF
        byte[] bomBytes = new byte[] { (byte) 0xFE, (byte) 0xFF, 0, '<', 0, 'h', 0, 't', 0, 'm', 0, 'l' };
        InputStream in = new ByteArrayInputStream(bomBytes);
        Document doc = DataUtil.load(in, null, "http://example.com");
        assertNotNull(doc);
        assertEquals("UTF-16", doc.outputSettings().charset().name());
    }

    @Test
    public void testDetectCharsetFromBomUtf16Le() throws IOException {
        // UTF-16 LE BOM: FF FE
        byte[] bomBytes = new byte[] { (byte) 0xFF, (byte) 0xFE, '<', 0, 'h', 0, 't', 0, 'm', 0, 'l', 0 };
        InputStream in = new ByteArrayInputStream(bomBytes);
        Document doc = DataUtil.load(in, null, "http://example.com");
        assertNotNull(doc);
        assertEquals("UTF-16", doc.outputSettings().charset().name());
    }

    @Test
    public void testDetectCharsetFromBomUtf32Be() throws IOException {
        // UTF-32 BE BOM: 00 00 FE FF
        byte[] bomBytes = new byte[] { 0x00, 0x00, (byte) 0xFE, (byte) 0xFF, 0, 0, 0, '<', 0, 0, 0, 'h' };
        InputStream in = new ByteArrayInputStream(bomBytes);
        Document doc = DataUtil.load(in, null, "http://example.com");
        assertNotNull(doc);
        assertEquals("UTF-32", doc.outputSettings().charset().name());
    }

    @Test
    public void testDetectCharsetFromBomUtf32Le() throws IOException {
        // UTF-32 LE BOM: FF FE 00 00
        byte[] bomBytes = new byte[] { (byte) 0xFF, (byte) 0xFE, 0x00, 0x00, '<', 0, 0, 0, 'h', 0, 0, 0 };
        InputStream in = new ByteArrayInputStream(bomBytes);
        Document doc = DataUtil.load(in, null, "http://example.com");
        assertNotNull(doc);
        assertEquals("UTF-32", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseInputStreamMetaCharsetHtml5() throws IOException {
        String html = "<html><head><meta charset=\"ISO-8859-1\"></head><body>Hello</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.load(in, null, "http://example.com");
        assertNotNull(doc);
        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseInputStreamMetaContentType() throws IOException {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=Shift_JIS\"></head><body>Hello</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.load(in, null, "http://example.com");
        assertNotNull(doc);
        assertEquals("Shift_JIS", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseInputStreamXmlDeclarationEncoding() throws IOException {
        String xml = "<?xml version=\"1.0\" encoding=\"EUC-JP\"?><root>Data</root>";
        InputStream in = new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.load(in, null, "http://example.com", Parser.xmlParser());
        assertNotNull(doc);
        assertEquals("EUC-JP", doc.outputSettings().charset().name());
    }

    @Test
    public void testGetCharsetFromContentTypeEdgeCases() {
        assertNull(DataUtil.getCharsetFromContentType(null));
        assertNull(DataUtil.getCharsetFromContentType("text/html"));
        assertNull(DataUtil.getCharsetFromContentType("text/html; charset=INVALID-CHARSET-XYZ"));
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=\"utf-8\""));
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset='UTF-8'"));
    }

    @Test
    public void testReadToByteBufferValidation() {
        try {
            DataUtil.readToByteBuffer(new ByteArrayInputStream(new byte[0]), -1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException | IOException e) {
            // Expected
        }
    }

    @Test
    public void testMimeBoundaryGeneration() {
        String boundary1 = DataUtil.mimeBoundary();
        String boundary2 = DataUtil.mimeBoundary();
        assertNotNull(boundary1);
        assertNotNull(boundary2);
        assertEquals(DataUtil.boundaryLength, boundary1.length());
        assertNotEquals(boundary1, boundary2);
    }

    @Test
    public void testEmptyByteBuffer() {
        ByteBuffer buffer = DataUtil.emptyByteBuffer();
        assertNotNull(buffer);
        assertEquals(0, buffer.capacity());
    }

    @Test
    public void testExplicitCharsetLoad() throws IOException {
        String content = "Test Content";
        InputStream in = new ByteArrayInputStream(content.getBytes(StandardCharsets.UTF_8));
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com");
        assertNotNull(doc);
        assertEquals("UTF-8", doc.outputSettings().charset().name());
    }
}