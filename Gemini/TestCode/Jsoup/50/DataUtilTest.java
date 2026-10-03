package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class DataUtilTest {

    @Test
    public void testLoadFile() throws IOException {
        // ทดสอบการโหลดจาก File ปกติ (Edge Case: สร้างไฟล์ชั่วคราว)
        File tempFile = File.createTempFile("jsoup-test", ".html");
        tempFile.deleteOnExit();
        try (FileWriter writer = new FileWriter(tempFile, StandardCharsets.UTF_8)) {
            writer.write("<html><head><meta charset=\"UTF-8\"></head><body>Hello File</body></html>");
        }

        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        assertNotNull(doc);
        assertTrue(doc.body().text().contains("Hello File"));
    }

    @Test
    public void testLoadInputStreamWithCharset() throws IOException {
        // ทดสอบ InputStream พร้อมระบุ Charset ชัดเจน (ข้ามการตรวจจับจาก Meta)
        String html = "<html><body>InputStream Test</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.load(in, "UTF-8", "http://example.com");
        assertNotNull(doc);
        assertEquals("InputStream Test", doc.body().text());
    }

    @Test
    public void testLoadInputStreamWithParser() throws IOException {
        // ทดสอบ InputStream พร้อม Parser กำหนดเอง (XML Parser)
        String xml = "<root><child>Data</child></root>";
        InputStream in = new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.load(in, "UTF-8", "http://example.com", Parser.xmlParser());
        assertNotNull(doc);
        assertEquals("Data", doc.select("child").text());
    }

    @Test
    public void testParseByteDataMetaHttpEquivAndCharset() {
        // ทดสอบตรวจจับ charset จาก meta http-equiv และ meta charset
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"></head><body>ISO</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(StandardCharsets.ISO_8859_1));

        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void testParseByteDataMetaCharsetOnly() {
        // ทดสอบตรวจจับจาก <meta charset="..."> และเงื่อนไข IllegalCharsetNameException
        String html = "<html><head><meta charset=\"invalid-charset-name!\"></meta><meta charset=\"UTF-16\"></meta></head><body>UTF16</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_16));

        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
    }

    @Test
    public void testParseByteDataWithUnicodeBOM() {
        // ทดสอบเคสมี BOM (Byte Order Mark \uFEFF) นำหน้า
        String html = "\uFEFF<html><body>BOM Test</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(StandardCharsets.UTF_8));

        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertTrue(doc.body().text().contains("BOM Test"));
    }

    @Test
    public void testReadToByteBufferCapped() throws IOException {
        // ทดสอบ readToByteBuffer แบบจำกัดขนาด (maxSize > 0 และข้อมูลเกิน maxSize)
        String data = "1234567890abcdefghijklmnopqrstuvwxyz";
        InputStream in = new ByteArrayInputStream(data.getBytes(StandardCharsets.UTF_8));

        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 5);
        assertEquals(5, buffer.remaining());
    }

    @Test
    public void testReadToByteBufferUnlimited() throws IOException {
        // ทดสอบ readToByteBuffer แบบไม่จำกัดขนาด (maxSize = 0)
        String data = "Unlimited Size Test";
        InputStream in = new ByteArrayInputStream(data.getBytes(StandardCharsets.UTF_8));

        ByteBuffer buffer = DataUtil.readToByteBuffer(in, 0);
        assertNotNull(buffer);
        assertTrue(buffer.remaining() > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadToByteBufferInvalidMaxSize() throws IOException {
        // Edge Case: maxSize ติดลบ ต้องโยน IllegalArgumentException
        InputStream in = new ByteArrayInputStream(new byte[0]);
        DataUtil.readToByteBuffer(in, -1);
    }

    @Test
    public void testEmptyByteBuffer() {
        // ทดสอบ emptyByteBuffer
        ByteBuffer buffer = DataUtil.emptyByteBuffer();
        assertNotNull(buffer);
        assertEquals(0, buffer.capacity());
    }

    @Test
    public void testGetCharsetFromContentType() {
        // ครอบคลุมทุกเงื่อนไขของ getCharsetFromContentType
        assertNull(DataUtil.getCharsetFromContentType(null));
        assertNull(DataUtil.getCharsetFromContentType("text/html")); // ไม่เจอ charset
        assertNull(DataUtil.getCharsetFromContentType("text/html; charset=")); // ค่าว่าง
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=UTF-8"));
        assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType("text/html; charset=\"ISO-8859-1\""));
        assertNull(DataUtil.getCharsetFromContentType("text/html; charset=INVALID_CHARSET_NAME_XYZ"));
    }

    @Test
    public void testMimeBoundary() {
        // ทดสอบการสร้าง Mime Boundary ว่าได้ความยาวตามกำหนด (32 ตัวอักษร)
        String boundary = DataUtil.mimeBoundary();
        assertNotNull(boundary);
        assertEquals(32, boundary.length());
    }

    @Test
    public void testCrossStreams() throws IOException {
        // ทดสอบ crossStreams คัดลอกข้อมูลจาก InputStream ไป OutputStream
        String content = "Cross Streams Content";
        InputStream in = new ByteArrayInputStream(content.getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        DataUtil.crossStreams(in, out);
        assertEquals(content, out.toString("UTF-8"));
    }
}