package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

import static org.junit.Assert.*;

/**
 * JUnit4 tests for org.jsoup.helper.DataUtil
 * วางไว้ใน package เดียวกับคลาสเป้าหมาย เพื่อเข้าถึงเมธอด package-private ได้
 */
public class DataUtilTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    // ---------------------------------------------------------------
    // getCharsetFromContentType
    // ---------------------------------------------------------------

    @Test
    public void getCharsetFromContentType_nullInput_returnsNull() {
        assertNull(DataUtil.getCharsetFromContentType(null));
    }

    @Test
    public void getCharsetFromContentType_noCharset_returnsNull() {
        assertNull(DataUtil.getCharsetFromContentType("text/html"));
    }

    @Test
    public void getCharsetFromContentType_validCharset_returnsCharset() {
        String result = DataUtil.getCharsetFromContentType("text/html; charset=UTF-8");
        assertEquals("UTF-8", result);
    }

    @Test
    public void getCharsetFromContentType_charsetWithQuotes_stripsQuotes() {
        // regex excludes quote characters จากกลุ่มที่ capture ไว้แล้ว
        String result = DataUtil.getCharsetFromContentType("text/html; charset=\"EUC-JP\"");
        assertNotNull(result);
        assertFalse(result.contains("\""));
    }

    @Test
    public void getCharsetFromContentType_emptyCharsetValue_returnsNull() {
        // "charset=" ไม่มีค่าต่อ -> group ที่ capture จะเป็นค่าว่าง -> length()==0 -> null
        String result = DataUtil.getCharsetFromContentType("text/html; charset=");
        assertNull(result);
    }

    @Test
    public void getCharsetFromContentType_unsupportedButWellFormedName_returnsNull() {
        // ชื่อไม่ตรงกับ charset จริงใด ๆ แต่รูปแบบ valid -> isSupported คืน false ไม่มี exception
        String result = DataUtil.getCharsetFromContentType("text/html; charset=not-a-real-charset-zz");
        assertNull(result);
    }

    @Test
    public void getCharsetFromContentType_malformedCharsetName_catchesExceptionReturnsNull() {
        // ชื่อ malformed อาจทำให้เกิด IllegalCharsetNameException ภายใน isSupported
        String result = DataUtil.getCharsetFromContentType("text/html; charset=bad;;name");
        // ไม่แน่ใจ 100% ว่า regex จะจับ segment นี้ครบ แต่ถ้าจับได้ค่าที่ malformed ต้องคืน null
        assertNull(result);
    }

    // ---------------------------------------------------------------
    // mimeBoundary
    // ---------------------------------------------------------------

    @Test
    public void mimeBoundary_hasCorrectLength() {
        String boundary = DataUtil.mimeBoundary();
        assertEquals(DataUtil.boundaryLength, boundary.length());
    }

    @Test
    public void mimeBoundary_onlyContainsAllowedCharacters() {
        String boundary = DataUtil.mimeBoundary();
        String allowed = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (char c : boundary.toCharArray()) {
            assertTrue("unexpected char: " + c, allowed.indexOf(c) >= 0);
        }
    }

    // ---------------------------------------------------------------
    // emptyByteBuffer
    // ---------------------------------------------------------------

    @Test
    public void emptyByteBuffer_hasZeroCapacity() {
        ByteBuffer buf = DataUtil.emptyByteBuffer();
        assertEquals(0, buf.capacity());
    }

    // ---------------------------------------------------------------
    // crossStreams
    // ---------------------------------------------------------------

    @Test
    public void crossStreams_copiesAllBytes() throws IOException {
        byte[] data = "Hello, jsoup!".getBytes("UTF-8");
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        DataUtil.crossStreams(in, out);

        assertArrayEquals(data, out.toByteArray());
    }

    @Test
    public void crossStreams_emptyInput_producesEmptyOutput() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[0]);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        DataUtil.crossStreams(in, out);

        assertEquals(0, out.toByteArray().length);
    }

    // ---------------------------------------------------------------
    // readToByteBuffer(InputStream, int maxSize)
    // ---------------------------------------------------------------

    @Test
    public void readToByteBuffer_negativeMaxSize_throwsException() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream("abc".getBytes("UTF-8"));
        try {
            DataUtil.readToByteBuffer(in, -1);
            fail("ควร throw exception เมื่อ maxSize < 0");
        } catch (IllegalArgumentException | NullPointerException e) {
            // Validate.isTrue คาดว่าจะ throw IllegalArgumentException
            // (ไม่แน่ใจ exact exception type จาก Validate implementation)
        }
    }

    @Test
    public void readToByteBuffer_maxSizeZero_readsAllData() throws IOException {
        byte[] data = "0123456789".getBytes("UTF-8");
        ByteArrayInputStream in = new ByteArrayInputStream(data);

        ByteBuffer result = DataUtil.readToByteBuffer(in, 0); // unlimited
        byte[] out = new byte[result.remaining()];
        result.get(out);

        assertArrayEquals(data, out);
    }

    @Test
    public void readToByteBuffer_maxSizeSmallerThanData_capsOutput() throws IOException {
        byte[] data = "0123456789".getBytes("UTF-8");
        ByteArrayInputStream in = new ByteArrayInputStream(data);

        ByteBuffer result = DataUtil.readToByteBuffer(in, 5);
        byte[] out = new byte[result.remaining()];
        result.get(out);

        assertEquals(5, out.length);
        assertArrayEquals("01234".getBytes("UTF-8"), out);
    }

    @Test
    public void readToByteBuffer_maxSizeLargerThanData_readsAllData() throws IOException {
        byte[] data = "0123456789".getBytes("UTF-8");
        ByteArrayInputStream in = new ByteArrayInputStream(data);

        ByteBuffer result = DataUtil.readToByteBuffer(in, 1000);
        byte[] out = new byte[result.remaining()];
        result.get(out);

        assertArrayEquals(data, out);
    }

    @Test
    public void readToByteBuffer_oneArgOverload_delegatesToUnlimited() throws IOException {
        byte[] data = "sample".getBytes("UTF-8");
        ByteArrayInputStream in = new ByteArrayInputStream(data);

        ByteBuffer result = DataUtil.readToByteBuffer(in);
        byte[] out = new byte[result.remaining()];
        result.get(out);

        assertArrayEquals(data, out);
    }

    // ---------------------------------------------------------------
    // readFileToByteBuffer
    // ---------------------------------------------------------------

    @Test
    public void readFileToByteBuffer_readsFileContentCorrectly() throws IOException {
        File f = tempFolder.newFile("test.txt");
        byte[] data = "file content here".getBytes("UTF-8");
        try (FileOutputStream fos = new FileOutputStream(f)) {
            fos.write(data);
        }

        ByteBuffer result = DataUtil.readFileToByteBuffer(f);
        byte[] out = new byte[result.remaining()];
        result.get(out);

        assertArrayEquals(data, out);
    }

    @Test(expected = FileNotFoundException.class)
    public void readFileToByteBuffer_nonExistentFile_throwsFileNotFoundException() throws IOException {
        File f = new File(tempFolder.getRoot(), "does-not-exist.txt");
        DataUtil.readFileToByteBuffer(f);
    }

    // ---------------------------------------------------------------
    // load(File, charset, baseUri)
    // ---------------------------------------------------------------

    @Test
    public void load_fileWithSpecifiedCharset_parsesCorrectly() throws IOException {
        File f = tempFolder.newFile("page.html");
        String html = "<html><head><title>Test</title></head><body>Hello</body></html>";
        try (FileOutputStream fos = new FileOutputStream(f)) {
            fos.write(html.getBytes("UTF-8"));
        }

        Document doc = DataUtil.load(f, "UTF-8", "http://example.com/");
        assertEquals("Test", doc.title());
        assertEquals("Hello", doc.body().text());
    }

    // ---------------------------------------------------------------
    // load(InputStream, charset, baseUri)
    // ---------------------------------------------------------------

    @Test
    public void load_inputStreamWithCharset_parsesCorrectly() throws IOException {
        String html = "<html><head><title>Stream</title></head><body>Body text</body></html>";
        ByteArrayInputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));

        Document doc = DataUtil.load(in, "UTF-8", "http://example.com/");
        assertEquals("Stream", doc.title());
    }

    @Test
    public void load_inputStreamWithNullCharset_detectsFromMeta() throws IOException {
        String html = "<html><head><title>NullCharset</title></head><body>abc</body></html>";
        ByteArrayInputStream in = new ByteArrayInputStream(html.getBytes("UTF-8"));

        Document doc = DataUtil.load(in, null, "http://example.com/");
        assertEquals("NullCharset", doc.title());
    }

    // ---------------------------------------------------------------
    // load(InputStream, charset, baseUri, Parser)
    // ---------------------------------------------------------------

    @Test
    public void load_withXmlParser_parsesAsXml() throws IOException {
        String xml = "<root><child>value</child></root>";
        ByteArrayInputStream in = new ByteArrayInputStream(xml.getBytes("UTF-8"));

        Document doc = DataUtil.load(in, "UTF-8", "http://example.com/", Parser.xmlParser());
        Element child = doc.select("child").first();
        assertNotNull(child);
        assertEquals("value", child.text());
    }

    // ---------------------------------------------------------------
    // parseByteData - branch coverage ของ logic หา charset
    // ---------------------------------------------------------------

    @Test
    public void parseByteData_explicitCharset_decodesDirectly() throws Exception {
        String html = "<html><body>caf\u00e9</body></html>";
        byte[] bytes = html.getBytes("ISO-8859-1");
        ByteBuffer buf = ByteBuffer.wrap(bytes);

        Document doc = DataUtil.parseByteData(buf, "ISO-8859-1", "http://example.com/", Parser.htmlParser());

        assertEquals("café", doc.body().text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseByteData_emptyExplicitCharset_throwsException() {
        byte[] bytes = "<html></html>".getBytes();
        ByteBuffer buf = ByteBuffer.wrap(bytes);

        // charsetName == "" -> Validate.notEmpty ควร throw
        DataUtil.parseByteData(buf, "", "http://example.com/", Parser.htmlParser());
    }

    @Test
    public void parseByteData_nullCharset_noMeta_defaultsToUtf8() {
        String html = "<html><head><title>NoMeta</title></head><body>plain</body></html>";
        byte[] bytes = html.getBytes();
        ByteBuffer buf = ByteBuffer.wrap(bytes);

        Document doc = DataUtil.parseByteData(buf, null, "http://example.com/", Parser.htmlParser());

        assertEquals("NoMeta", doc.title());
        assertEquals("plain", doc.body().text());
    }

    @Test
    public void parseByteData_nullCharset_metaHttpEquivDifferentCharset_redecodes() throws Exception {
        String html = "<html><head><meta http-equiv=\"Content-Type\" "
                + "content=\"text/html; charset=ISO-8859-1\"></head><body>caf\u00e9</body></html>";
        byte[] bytes = html.getBytes("ISO-8859-1");
        ByteBuffer buf = ByteBuffer.wrap(bytes);

        Document doc = DataUtil.parseByteData(buf, null, "http://example.com/", Parser.htmlParser());

        assertEquals("café", doc.body().text());
    }

    @Test
    public void parseByteData_nullCharset_metaHttpEquivSameAsDefault_skipsRedecode() throws Exception {
        // foundCharset == "UTF-8" (เท่ากับ defaultCharset) -> ไม่ redecode, doc ยังเป็นตัวที่ parse ครั้งแรก
        String html = "<html><head><meta http-equiv=\"Content-Type\" "
                + "content=\"text/html; charset=UTF-8\"></head><body>Hi</body></html>";
        byte[] bytes = html.getBytes("UTF-8");
        ByteBuffer buf = ByteBuffer.wrap(bytes);

        Document doc = DataUtil.parseByteData(buf, null, "http://example.com/", Parser.htmlParser());

        assertEquals("Hi", doc.body().text());
    }

    @Test
    public void parseByteData_nullCharset_metaCharsetAttributeSupported_redecodes() throws Exception {
        String html = "<html><head><meta charset=\"ISO-8859-1\"></head><body>caf\u00e9</body></html>";
        byte[] bytes = html.getBytes("ISO-8859-1");
        ByteBuffer buf = ByteBuffer.wrap(bytes);

        Document doc = DataUtil.parseByteData(buf, null, "http://example.com/", Parser.htmlParser());

        assertEquals("café", doc.body().text());
    }

    @Test
    public void parseByteData_nullCharset_metaCharsetAttributeUnsupported_keepsDefault() {
        // Charset.isSupported(...) == false (ไม่ throw exception) -> foundCharset ยังเป็น null
        String html = "<html><head><meta charset=\"not-a-real-charset-zz\"></head><body>plain</body></html>";
        byte[] bytes = html.getBytes();
        ByteBuffer buf = ByteBuffer.wrap(bytes);

        Document doc = DataUtil.parseByteData(buf, null, "http://example.com/", Parser.htmlParser());

        assertEquals("plain", doc.body().text());
    }

    @Test
    public void parseByteData_nullCharset_metaHttpEquivNoCharsetFound_metaCharsetAbsent() {
        // meta มี http-equiv แต่ content ไม่มี charset= และไม่มี attribute charset เลย
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html\">"
                + "</head><body>plain</body></html>";
        byte[] bytes = html.getBytes();
        ByteBuffer buf = ByteBuffer.wrap(bytes);

        Document doc = DataUtil.parseByteData(buf, null, "http://example.com/", Parser.htmlParser());

        assertEquals("plain", doc.body().text());
    }

    @Test
    public void parseByteData_bomPresent_stripsBomAndUsesUtf8() throws Exception {
        // EF BB BF คือ UTF-8 BOM
        String html = "<html><body>bom-test</body></html>";
        byte[] bomBytes = new byte[]{(byte) 0xEF, (byte) 0xBB, (byte) 0xBF};
        byte[] htmlBytes = html.getBytes("UTF-8");
        byte[] combined = new byte[bomBytes.length + htmlBytes.length];
        System.arraycopy(bomBytes, 0, combined, 0, bomBytes.length);
        System.arraycopy(htmlBytes, 0, combined, bomBytes.length, htmlBytes.length);

        ByteBuffer buf = ByteBuffer.wrap(combined);
        Document doc = DataUtil.parseByteData(buf, null, "http://example.com/", Parser.htmlParser());

        assertEquals("bom-test", doc.body().text());
        // ตรวจว่าไม่มี BOM char หลงเหลือใน title/body
        assertFalse(doc.html().contains("\uFEFF"));
    }
}
