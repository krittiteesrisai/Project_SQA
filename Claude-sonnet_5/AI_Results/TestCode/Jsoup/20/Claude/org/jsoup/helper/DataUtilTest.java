package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.*;
import java.nio.ByteBuffer;

import static org.junit.Assert.*;

public class DataUtilTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    // =========================================================
    // getCharsetFromContentType(String)
    // =========================================================

    @Test
    public void getCharset_nullInput_returnsNull() {
        assertNull(DataUtil.getCharsetFromContentType(null));
    }

    @Test
    public void getCharset_noCharsetPresent_returnsNull() {
        assertNull(DataUtil.getCharsetFromContentType("text/html"));
    }

    @Test
    public void getCharset_simpleCharset_returnsUppercaseTrimmed() {
        assertEquals("GB2312", DataUtil.getCharsetFromContentType("text/html; charset=gb2312"));
    }

    @Test
    public void getCharset_quotedCharset_returnsValue() {
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=\"UTF-8\""));
    }

    @Test
    public void getCharset_caseInsensitivePatternKeyword() {
        // (?i) flag ต้องทำให้ "CHARSET=" ถูกจับคู่ได้เช่นเดียวกับ "charset="
        assertEquals("BIG5", DataUtil.getCharsetFromContentType("text/html; CHARSET=Big5"));
    }

    @Test
    public void getCharset_withExtraSpacesBeforeValue_returnsTrimmedValue() {
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=   UTF-8;"));
    }

    @Test
    public void getCharset_emptyCharsetValue_returnsEmptyString() {
        // m.find() เป็น true แต่ group(1) เป็นสตริงว่าง -> ควร return "" ไม่ใช่ null
        assertEquals("", DataUtil.getCharsetFromContentType("text/html; charset="));
    }

    // =========================================================
    // readToByteBuffer(InputStream)
    // =========================================================

    @Test
    public void readToByteBuffer_emptyStream_returnsEmptyBuffer() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[0]);
        ByteBuffer buf = DataUtil.readToByteBuffer(in);
        assertEquals(0, buf.limit());
    }

    @Test
    public void readToByteBuffer_smallStream_returnsCorrectBytes() throws IOException {
        byte[] data = "Hello Jsoup".getBytes("UTF-8");
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        ByteBuffer buf = DataUtil.readToByteBuffer(in);
        byte[] result = new byte[buf.limit()];
        buf.get(result);
        assertArrayEquals(data, result);
    }

    @Test
    public void readToByteBuffer_multipleChunks_readsAllBytesAcrossLoopIterations() throws IOException {
        final byte[] data = "This is a longer piece of content read in multiple small chunks."
                .getBytes("UTF-8");
        InputStream chunkedIn = new InputStream() {
            int pos = 0;
            @Override
            public int read() throws IOException {
                if (pos >= data.length) return -1;
                return data[pos++] & 0xFF;
            }
            @Override
            public int read(byte[] b, int off, int len) throws IOException {
                if (pos >= data.length) return -1;
                int toRead = Math.min(3, Math.min(len, data.length - pos)); // บีบให้ read หลายครั้ง
                System.arraycopy(data, pos, b, off, toRead);
                pos += toRead;
                return toRead;
            }
        };
        ByteBuffer buf = DataUtil.readToByteBuffer(chunkedIn);
        byte[] result = new byte[buf.limit()];
        buf.get(result);
        assertArrayEquals(data, result);
    }

    @Test(expected = IOException.class)
    public void readToByteBuffer_streamThrowsIOException_propagates() throws IOException {
        InputStream badIn = new InputStream() {
            @Override
            public int read() throws IOException {
                throw new IOException("boom");
            }
            @Override
            public int read(byte[] b, int off, int len) throws IOException {
                throw new IOException("boom");
            }
        };
        DataUtil.readToByteBuffer(badIn);
    }

    // =========================================================
    // parseByteData(ByteBuffer, String, String, Parser)
    // charsetName == null branches
    // =========================================================

    @Test
    public void parseByteData_nullCharset_noMetaTag_usesDefaultUtf8() throws Exception {
        String html = "<html><head><title>No meta</title></head><body>Hello</body></html>";
        ByteBuffer bb = ByteBuffer.wrap(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseByteData(bb, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("Hello", doc.body().text());
        assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test
    public void parseByteData_nullCharset_metaHttpEquiv_noCharsetFound_keepsOriginalDoc() throws Exception {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html\">" +
                "</head><body>Plain</body></html>";
        ByteBuffer bb = ByteBuffer.wrap(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseByteData(bb, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("Plain", doc.body().text());
    }

    @Test
    public void parseByteData_nullCharset_metaHttpEquiv_emptyCharsetValue_doesNotRedecode() throws Exception {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=\">" +
                "</head><body>EmptyCharsetValue</body></html>";
        ByteBuffer bb = ByteBuffer.wrap(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseByteData(bb, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("EmptyCharsetValue", doc.body().text());
    }

    @Test
    public void parseByteData_nullCharset_metaHttpEquiv_sameAsDefault_doesNotRedecode() throws Exception {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">" +
                "</head><body>SameCharset</body></html>";
        ByteBuffer bb = ByteBuffer.wrap(html.getBytes("UTF-8"));
        Document doc = DataUtil.parseByteData(bb, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("SameCharset", doc.body().text());
    }

    @Test
    public void parseByteData_nullCharset_metaHttpEquiv_differentCharset_redecodes() throws Exception {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">" +
                "</head><body>caf\u00e9</body></html>";
        byte[] bytes = html.getBytes("ISO-8859-1");
        ByteBuffer bb = ByteBuffer.wrap(bytes);
        Document doc = DataUtil.parseByteData(bb, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("café", doc.body().text());
        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void parseByteData_nullCharset_metaCharsetAttribute_html5style_redecodes() throws Exception {
        String html = "<html><head><meta charset=\"ISO-8859-1\">" +
                "</head><body>na\u00efve</body></html>";
        byte[] bytes = html.getBytes("ISO-8859-1");
        ByteBuffer bb = ByteBuffer.wrap(bytes);
        Document doc = DataUtil.parseByteData(bb, null, "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("naïve", doc.body().text());
    }

    // =========================================================
    // parseByteData: charsetName != null branches
    // =========================================================

    @Test
    public void parseByteData_explicitCharset_decodesAndSetsOutputCharset() throws Exception {
        String html = "<html><head></head><body>Explicit</body></html>";
        byte[] bytes = html.getBytes("UTF-8");
        ByteBuffer bb = ByteBuffer.wrap(bytes);
        Document doc = DataUtil.parseByteData(bb, "UTF-8", "http://example.com", Parser.htmlParser());
        assertNotNull(doc);
        assertEquals("Explicit", doc.body().text());
        assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseByteData_explicitEmptyCharset_throwsIllegalArgumentException() throws Exception {
        // สมมติฐาน: Validate.notEmpty(...) throw IllegalArgumentException เมื่อ charsetName เป็นสตริงว่าง
        // (ไม่พบ source ของ Validate ในไฟล์ที่ให้มา จึงกำกับไว้เป็นสมมติฐาน)
        byte[] bytes = "ignored".getBytes("UTF-8");
        ByteBuffer bb = ByteBuffer.wrap(bytes);
        DataUtil.parseByteData(bb, "", "http://example.com", Parser.htmlParser());
    }

    // =========================================================
    // load(InputStream, String, String) / load(InputStream, String, String, Parser)
    // =========================================================

    @Test
    public void load_inputStream_withNullCharset_parsesHtml() throws IOException {
        String html = "<html><body>Stream Content</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.load(in, null, "http://example.com");
        assertEquals("Stream Content", doc.body().text());
    }

    @Test
    public void load_inputStream_withExplicitCharset_parsesHtml() throws IOException {
        String html = "<html><body>Explicit Stream</body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com");
        assertEquals("Explicit Stream", doc.body().text());
    }

    @Test
    public void load_inputStream_withCustomParser_usesGivenParser() throws IOException {
        String xml = "<root><child>value</child></root>";
        InputStream in = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com", Parser.xmlParser());
        assertNotNull(doc);
        assertEquals("value", doc.select("child").text());
    }

    // =========================================================
    // load(File, String, String)
    // =========================================================

    @Test
    public void load_file_withExplicitCharset_parsesHtml() throws IOException {
        File f = tempFolder.newFile("test.html");
        String html = "<html><body>File Content</body></html>";
        writeBytes(f, html.getBytes("UTF-8"));
        Document doc = DataUtil.load(f, "UTF-8", "http://example.com");
        assertEquals("File Content", doc.body().text());
    }

    @Test
    public void load_file_withNullCharset_detectsFromMeta() throws IOException {
        File f = tempFolder.newFile("test2.html");
        String html = "<html><head><meta charset=\"UTF-8\"></head><body>Detected</body></html>";
        writeBytes(f, html.getBytes("UTF-8"));
        Document doc = DataUtil.load(f, null, "http://example.com");
        assertEquals("Detected", doc.body().text());
    }

    @Test(expected = FileNotFoundException.class)
    public void load_file_nonExistentFile_throwsFileNotFoundException() throws IOException {
        File f = new File(tempFolder.getRoot(), "does-not-exist.html");
        DataUtil.load(f, "UTF-8", "http://example.com");
    }

    private void writeBytes(File f, byte[] bytes) throws IOException {
        FileOutputStream fos = new FileOutputStream(f);
        try {
            fos.write(bytes);
        } finally {
            fos.close();
        }
    }
}
