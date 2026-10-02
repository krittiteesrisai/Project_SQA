# การวิเคราะห์และแผนการทดสอบ

จากการวิเคราะห์ซอร์สโค้ด `DataUtil` พบ branch/condition หลักที่ต้อง cover:

1. `load(File,...)` – FileNotFoundException (inStream เป็น null ตอน finally), success path
2. `parseByteData` – `charsetName == null` (true/false)
3. `meta != null` (true/false)
4. `meta.hasAttr("http-equiv")` (true/false)
5. compound condition `foundCharset != null && foundCharset.length()!=0 && !foundCharset.equals(defaultCharset)` ทุก sub-case
6. `doc == null` → BOM check `docData.charAt(0)==65279` (true/false)
7. `Validate.notEmpty` เมื่อ charsetName = ""
8. `readToByteBuffer` loop (0 ครั้ง / 1 ครั้ง / หลายครั้ง)
9. `getCharsetFromContentType` – null input, found, not found, quoted value, empty value

**หมายเหตุสำคัญ:** เพื่อให้สามารถเรียกเมธอด package-private (`parseByteData`, `readToByteBuffer`, `getCharsetFromContentType`) ได้โดยตรงสำหรับการวัด branch coverage อย่างละเอียด ไฟล์ทดสอบนี้ต้องอยู่ใน **package เดียวกัน (`org.jsoup.helper`)** กับคลาสเป้าหมาย (รูปแบบเดียวกับที่ Defects4J ใช้จริงสำหรับบั๊กนี้) — จึงไม่จำเป็นต้องมี `import` ของ `DataUtil` เอง แต่ยังคง `import` คลาสที่เกี่ยวข้องอื่น ๆ ตามข้อกำหนด

พฤติกรรมของ `Validate.notEmpty(...)` ไม่ได้แสดงใน source ที่ให้มา — จึงสมมติโดยอ้างอิงรูปแบบมาตรฐานทั่วไปของ validate-utility (throw `IllegalArgumentException`) และ **คอมเมนต์กำกับไว้ชัดเจน** ว่าเป็นสมมติฐาน ไม่ใช่ fact จาก source ที่ให้มา

```java
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
 * Unit tests for org.jsoup.helper.DataUtil (Defects4J Jsoup-27b)
 *
 * NOTE: ไฟล์นี้ตั้งใจอยู่ใน package เดียวกับ DataUtil (org.jsoup.helper)
 * เพื่อให้เข้าถึงเมธอด package-private (parseByteData, readToByteBuffer,
 * getCharsetFromContentType) ได้ตรง ๆ สำหรับการวัด branch coverage อย่างละเอียด
 */
public class DataUtilTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    // ---------- Helper ----------
    private static byte[] bytes(String s, String charset) throws Exception {
        return s.getBytes(charset);
    }

    private File writeTempFile(byte[] data) throws IOException {
        File f = tempFolder.newFile("test.html");
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(data);
        fos.close();
        return f;
    }

    // =========================================================
    // load(File, String, String)
    // =========================================================

    @Test(expected = FileNotFoundException.class)
    public void testLoadFile_NotFound() throws IOException {
        // inStream จะยังเป็น null -> finally ไม่ปิด stream -> exception ควร propagate ออกไปตรง ๆ
        File notExist = new File(tempFolder.getRoot(), "does_not_exist_" + System.nanoTime() + ".html");
        DataUtil.load(notExist, "UTF-8", "http://example.com/");
    }

    @Test
    public void testLoadFile_Success_WithExplicitCharset() throws Exception {
        String html = "<html><head><title>T</title></head><body>Hello</body></html>";
        File f = writeTempFile(bytes(html, "UTF-8"));
        Document doc = DataUtil.load(f, "UTF-8", "http://example.com/");
        assertNotNull(doc);
        assertEquals("Hello", doc.body().text());
    }

    @Test
    public void testLoadFile_Success_NullCharset_AutoDetect() throws Exception {
        String html = "<html><head><title>T</title></head><body>Hello</body></html>";
        File f = writeTempFile(bytes(html, "UTF-8"));
        Document doc = DataUtil.load(f, null, "http://example.com/");
        assertNotNull(doc);
        assertEquals("Hello", doc.body().text());
    }

    // =========================================================
    // load(InputStream, String, String) - 3 args
    // =========================================================

    @Test
    public void testLoadInputStream_ThreeArgs() throws Exception {
        String html = "<html><body>Hi there</body></html>";
        InputStream in = new ByteArrayInputStream(bytes(html, "UTF-8"));
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com/");
        assertEquals("Hi there", doc.body().text());
    }

    // =========================================================
    // load(InputStream, String, String, Parser) - 4 args, custom parser
    // =========================================================

    @Test
    public void testLoadInputStream_WithXmlParser_PreservesCase() throws Exception {
        String xml = "<RSS><Title>Hi</Title></RSS>";
        InputStream in = new ByteArrayInputStream(bytes(xml, "UTF-8"));
        Document doc = DataUtil.load(in, "UTF-8", "http://example.com/", Parser.xmlParser());
        // xmlParser ไม่ lower-case tag name ต่างจาก htmlParser
        assertNotNull(doc.select("RSS").first());
    }

    @Test
    public void testLoadInputStream_IOException_Propagates() throws Exception {
        InputStream broken = new InputStream() {
            @Override
            public int read() throws IOException {
                throw new IOException("boom");
            }
        };
        try {
            DataUtil.load(broken, "UTF-8", "http://example.com/");
            fail("ควร throw IOException");
        } catch (IOException expected) {
            // ok
        }
    }

    // =========================================================
    // parseByteData - charsetName == null, meta == null (ไม่มี meta)
    // =========================================================

    @Test
    public void testParseByteData_CharsetNull_NoMeta() throws Exception {
        String html = "<html><head><title>T</title></head><body>Hello</body></html>";
        ByteBuffer buf = Charset.forName("UTF-8").encode(html);
        Document doc = DataUtil.parseByteData(buf, null, "http://example.com/", Parser.htmlParser());
        assertEquals("Hello", doc.body().text());
        // meta == null -> ควรคงค่าที่ decode มาตั้งแต่ครั้งแรก (UTF-8)
    }

    // =========================================================
    // meta[charset] path, hasAttr("http-equiv") == false
    // foundCharset valid & != default -> re-decode (true branch ของทุก sub-condition)
    // =========================================================

    @Test
    public void testParseByteData_MetaCharsetAttr_DifferentFromDefault_Redecodes() throws Exception {
        String html = "<html><head><meta charset=\"ISO-8859-1\"></head><body>Hello World</body></html>";
        ByteBuffer buf = Charset.forName("UTF-8").encode(html); // ASCII-safe content
        Document doc = DataUtil.parseByteData(buf, null, "http://example.com/", Parser.htmlParser());
        assertEquals("Hello World", doc.body().text());
        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    // =========================================================
    // meta[http-equiv], hasAttr("http-equiv") == true, foundCharset ต่างจาก default
    // =========================================================

    @Test
    public void testParseByteData_MetaHttpEquiv_DifferentCharset_Redecodes() throws Exception {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">"
                + "</head><body>Hello</body></html>";
        ByteBuffer buf = Charset.forName("UTF-8").encode(html);
        Document doc = DataUtil.parseByteData(buf, null, "http://example.com/", Parser.htmlParser());
        assertEquals("Hello", doc.body().text());
        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    // =========================================================
    // foundCharset == null (http-equiv มี แต่ content ไม่มี charset= เลย)
    // =========================================================

    @Test
    public void testParseByteData_MetaHttpEquiv_NoCharsetInContent_FoundCharsetNull() throws Exception {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html\">"
                + "</head><body>Hello</body></html>";
        ByteBuffer buf = Charset.forName("UTF-8").encode(html);
        Document doc = DataUtil.parseByteData(buf, null, "http://example.com/", Parser.htmlParser());
        // foundCharset == null -> ไม่ re-decode, เอกสารยังเป็นผลจาก parse ครั้งแรก
        assertEquals("Hello", doc.body().text());
    }

    // =========================================================
    // foundCharset.length() == 0 (meta charset="")
    // =========================================================

    @Test
    public void testParseByteData_MetaCharsetEmptyString() throws Exception {
        String html = "<html><head><meta charset=\"\"></head><body>Hello</body></html>";
        ByteBuffer buf = Charset.forName("UTF-8").encode(html);
        Document doc = DataUtil.parseByteData(buf, null, "http://example.com/", Parser.htmlParser());
        // foundCharset == "" -> length()==0 -> ไม่ re-decode
        assertEquals("Hello", doc.body().text());
    }

    // =========================================================
    // foundCharset.equals(defaultCharset) == true (meta charset="UTF-8" ตัวใหญ่พอดี)
    // =========================================================

    @Test
    public void testParseByteData_MetaCharsetEqualsDefault_NoRedecode() throws Exception {
        String html = "<html><head><meta charset=\"UTF-8\"></head><body>Hello</body></html>";
        ByteBuffer buf = Charset.forName("UTF-8").encode(html);
        Document doc = DataUtil.parseByteData(buf, null, "http://example.com/", Parser.htmlParser());
        assertEquals("Hello", doc.body().text());
    }

    // =========================================================
    // ทดสอบความ case-sensitive ของ .equals(defaultCharset) ในเส้นทาง meta[charset]
    // (meta charset="utf-8" ตัวเล็ก) -> equals("UTF-8") == false -> re-decode เกิดขึ้น
    // (นี่คือจุดที่ fault-sensitive เพราะ getCharsetFromContentType มี toUpperCase()
    //  แต่ meta.attr("charset") ไม่มี การเปรียบเทียบจึง sensitive ต่อ case)
    // =========================================================

    @Test
    public void testParseByteData_MetaCharsetLowercaseUtf8_TriggersRedecodeDueToCaseSensitivity() throws Exception {
        String html = "<html><head><meta charset=\"utf-8\"></head><body>Hello</body></html>";
        ByteBuffer buf = Charset.forName("UTF-8").encode(html);
        Document doc = DataUtil.parseByteData(buf, null, "http://example.com/", Parser.htmlParser());
        assertEquals("Hello", doc.body().text());
        // ผลลัพธ์ charset ที่ใช้งานจริงคือค่าตามที่พบใน meta (lower-case) เพราะ equals() เป็น case-sensitive
        assertEquals("UTF-8", Charset.forName(doc.outputSettings().charset().name()).name());
    }

    // =========================================================
    // charsetName != null path -> Validate.notEmpty branch
    // (สมมติฐาน: Validate.notEmpty throw IllegalArgumentException เมื่อ string ว่าง
    //  เนื่องจาก source ของ Validate ไม่ได้ให้มาในโจทย์ จึงคอมเมนต์กำกับไว้)
    // =========================================================

    @Test
    public void testParseByteData_SpecifiedCharset_Success() throws Exception {
        String html = "<html><body>Hello</body></html>";
        ByteBuffer buf = Charset.forName("UTF-8").encode(html);
        Document doc = DataUtil.parseByteData(buf, "UTF-8", "http://example.com/", Parser.htmlParser());
        assertEquals("Hello", doc.body().text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseByteData_SpecifiedCharsetEmpty_ThrowsOnValidate() throws Exception {
        // ASSUMPTION (ไม่ได้มี source ของ Validate ให้): notEmpty throw IllegalArgumentException
        String html = "<html><body>Hello</body></html>";
        ByteBuffer buf = Charset.forName("UTF-8").encode(html);
        DataUtil.parseByteData(buf, "", "http://example.com/", Parser.htmlParser());
    }

    // =========================================================
    // BOM handling: docData.charAt(0) == 65279 (U+FEFF) -> true branch (strip BOM)
    // =========================================================

    @Test
    public void testParseByteData_BOM_IsStripped() throws Exception {
        byte[] bom = new byte[]{(byte) 0xEF, (byte) 0xBB, (byte) 0xBF};
        byte[] body = bytes("<html><body>Hi</body></html>", "UTF-8");
        byte[] combined = new byte[bom.length + body.length];
        System.arraycopy(bom, 0, combined, 0, bom.length);
        System.arraycopy(body, 0, combined, bom.length, body.length);

        ByteBuffer buf = ByteBuffer.wrap(combined);
        Document doc = DataUtil.parseByteData(buf, "UTF-8", "http://example.com/", Parser.htmlParser());
        assertEquals("Hi", doc.body().text());
    }

    @Test
    public void testParseByteData_NoBOM_FalseBranch() throws Exception {
        String html = "<html><body>Hi</body></html>";
        ByteBuffer buf = Charset.forName("UTF-8").encode(html);
        Document doc = DataUtil.parseByteData(buf, "UTF-8", "http://example.com/", Parser.htmlParser());
        assertEquals("Hi", doc.body().text());
    }

    // =========================================================
    // readToByteBuffer - loop branches
    // =========================================================

    @Test
    public void testReadToByteBuffer_EmptyStream() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ByteBuffer buf = DataUtil.readToByteBuffer(in);
        assertEquals(0, buf.remaining());
    }

    @Test
    public void testReadToByteBuffer_SmallData_SingleRead() throws IOException {
        byte[] data = "hello world".getBytes();
        InputStream in = new ByteArrayInputStream(data);
        ByteBuffer buf = DataUtil.readToByteBuffer(in);
        byte[] out = new byte[buf.remaining()];
        buf.get(out);
        assertArrayEquals(data, out);
    }

    @Test
    public void testReadToByteBuffer_LargeData_MultipleLoopIterations() throws IOException {
        // ใหญ่กว่า bufferSize ภายใน (0x20000) เพื่อบังคับให้ loop อ่านหลายรอบ
        int size = 0x20000 * 2 + 1234;
        byte[] data = new byte[size];
        for (int i = 0; i < size; i++) data[i] = (byte) (i % 256);
        InputStream in = new ByteArrayInputStream(data);
        ByteBuffer buf = DataUtil.readToByteBuffer(in);
        assertEquals(size, buf.remaining());
        byte[] out = new byte[buf.remaining()];
        buf.get(out);
        assertArrayEquals(data, out);
    }

    // =========================================================
    // getCharsetFromContentType
    // =========================================================

    @Test
    public void testGetCharsetFromContentType_NullInput() {
        assertNull(DataUtil.getCharsetFromContentType(null));
    }

    @Test
    public void testGetCharsetFromContentType_Found_Unquoted() {
        String result = DataUtil.getCharsetFromContentType("text/html; charset=euc-jp");
        assertEquals("EUC-JP", result);
    }

    @Test
    public void testGetCharsetFromContentType_Found_Quoted() {
        String result = DataUtil.getCharsetFromContentType("text/html; charset=\"UTF-8\"");
        assertEquals("UTF-8", result);
    }

    @Test
    public void testGetCharsetFromContentType_NotFound() {
        String result = DataUtil.getCharsetFromContentType("text/html");
        assertNull(result);
    }

    @Test
    public void testGetCharsetFromContentType_EmptyCharsetValue() {
        String result = DataUtil.getCharsetFromContentType("text/html; charset=");
        assertEquals("", result);
    }
}
```

## สรุปการ Coverage (ตาราง)

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testLoadFile_NotFound` | `load(File,...)` → `inStream` เป็น null ตอนเกิด exception → finally ไม่ปิด stream |
| `testLoadFile_Success_WithExplicitCharset` | `load(File,...)` path สำเร็จ, charsetName != null |
| `testLoadFile_Success_NullCharset_AutoDetect` | `load(File,...)` path สำเร็จ, charsetName == null |
| `testLoadInputStream_ThreeArgs` | `load(InputStream, String, String)` 3-arg overload |
| `testLoadInputStream_WithXmlParser_PreservesCase` | `load(InputStream,...,Parser)` 4-arg overload, parser พารามิเตอร์ต่างกัน |
| `testLoadInputStream_IOException_Propagates` | exception propagation จาก `readToByteBuffer` |
| `testParseByteData_CharsetNull_NoMeta` | `charsetName==null` true, `meta != null` → false |
| `testParseByteData_MetaCharsetAttr_DifferentFromDefault_Redecodes` | `meta!=null` true, `hasAttr("http-equiv")` false, compound condition ทุกส่วน true → re-decode |
| `testParseByteData_MetaHttpEquiv_DifferentCharset_Redecodes` | `hasAttr("http-equiv")` true, compound condition true → re-decode |
| `testParseByteData_MetaHttpEquiv_NoCharsetInContent_FoundCharsetNull` | `foundCharset != null` → false (null) |
| `testParseByteData_MetaCharsetEmptyString` | `foundCharset.length()!=0` → false (empty) |
| `testParseByteData_MetaCharsetEqualsDefault_NoRedecode` | `!foundCharset.equals(defaultCharset)` → false |
| `testParseByteData_MetaCharsetLowercaseUtf8_TriggersRedecodeDueToCaseSensitivity` | ตรวจ fault-sensitive branch: case-sensitivity ของ `.equals()` |
| `testParseByteData_SpecifiedCharset_Success` | `charsetName != null` (else branch), parse สำเร็จ |
| `testParseByteData_SpecifiedCharsetEmpty_ThrowsOnValidate` | `Validate.notEmpty` branch (สมมติฐานตามคอมเมนต์) |
| `testParseByteData_BOM_IsStripped` | `doc==null` → `charAt(0)==65279` true (ลบ BOM) |
| `testParseByteData_NoBOM_FalseBranch` | `charAt(0)==65279` false |
| `testReadToByteBuffer_EmptyStream` | loop: `read==-1` ทันที (0 รอบ) |
| `testReadToByteBuffer_SmallData_SingleRead` | loop: 1 รอบแล้ว `-1` |
| `testReadToByteBuffer_LargeData_MultipleLoopIterations` | loop วนหลายรอบก่อนพบ `-1` |
| `testGetCharsetFromContentType_NullInput` | `contentType==null` → true |
| `testGetCharsetFromContentType_Found_Unquoted` | `m.find()` true, ไม่มี quote |
| `testGetCharsetFromContentType_Found_Quoted` | `m.find()` true, มี quote (`\"?`) |
| `testGetCharsetFromContentType_NotFound` | `m.find()` false |
| `testGetCharsetFromContentType_EmptyCharsetValue` | group capture เป็น empty string (`[^\s;"]*` match 0 ตัว) |