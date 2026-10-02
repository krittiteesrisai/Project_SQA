# JUnit 4 Test Suite สำหรับ `DataUtil` (Jsoup-36b)

## การวิเคราะห์ branch ที่ต้องครอบคลุม

- `load(File,...)` : success path / FileNotFoundException
- `load(InputStream,...)` (3-arg, 4-arg)
- `parseByteData`:
  - `charsetName == null` → ไม่พบ meta / พบ meta แบบ `http-equiv` (charset ต่างจาก default → re-decode) / พบ meta แบบ `charset` ที่เท่ากับ default (ข้าม) / `charset` เป็นค่าว่าง (ข้าม)
  - `charsetName != null` (ปกติ / ค่าว่าง → exception)
  - `doc == null` branch → ตัด BOM หรือไม่ตัด
- `readToByteBuffer(InputStream,int)`:
  - `maxSize < 0` → exception
  - `capped=false` (unlimited)
  - `capped=true` กรณี `read <= remaining` (ปกติ, รวม boundary ที่ `read==remaining`)
  - `capped=true` กรณี `read > remaining` (ตัดข้อมูล)
  - stream ว่าง (`read==-1` ทันที)
- `readToByteBuffer(InputStream)` overload
- `getCharsetFromContentType`:
  - `contentType == null`
  - ไม่ match regex
  - match + `isSupported` ผ่านตรง ๆ (ไม่ uppercase)
  - match + lower-case ก็ supported (ตรวจว่าไม่ได้ uppercase ค่าที่ return)
  - match แต่ charset ไม่ supported เลย → null
  - รูปแบบมี quote/semicolon

```java
package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

import static org.junit.Assert.*;

/**
 * Unit tests for {@link DataUtil}.
 * ครอบคลุม branch/condition ตามที่วิเคราะห์ได้จาก source ของ Jsoup-36b
 */
public class DataUtilTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    // ---------------------------------------------------------------------
    // load(File, String, String)
    // ---------------------------------------------------------------------

    @Test
    public void testLoadFile_success() throws IOException {
        File f = tempFolder.newFile("test.html");
        writeFile(f, "<html><head><title>Test</title></head><body>Hello</body></html>", "UTF-8");
        Document doc = DataUtil.load(f, "UTF-8", "http://example.com/");
        assertNotNull(doc);
        assertEquals("Test", doc.title());
    }

    @Test(expected = IOException.class)
    public void testLoadFile_notFound_throwsIOException() throws IOException {
        File f = new File(tempFolder.getRoot(), "doesNotExist.html");
        DataUtil.load(f, "UTF-8", "http://example.com/");
    }

    // ---------------------------------------------------------------------
    // load(InputStream, String, String)  -- 3-arg
    // ---------------------------------------------------------------------

    @Test
    public void testLoadInputStream_3arg() throws IOException {
        String html = "<html><head><title>Stream</title></head><body></body></html>";
        InputStream is = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.load(is, "UTF-8", "http://example.com/");
        assertEquals("Stream", doc.title());
    }

    // ---------------------------------------------------------------------
    // load(InputStream, String, String, Parser) -- 4-arg
    // ---------------------------------------------------------------------

    @Test
    public void testLoadInputStream_4arg_withHtmlParser() throws IOException {
        String html = "<html><head><title>Parsed</title></head><body></body></html>";
        InputStream is = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.load(is, "UTF-8", "http://example.com/", Parser.htmlParser());
        assertEquals("Parsed", doc.title());
    }

    // ---------------------------------------------------------------------
    // parseByteData
    // ---------------------------------------------------------------------

    @Test
    public void testParseByteData_charsetNull_noMetaFound() throws Exception {
        // charsetName == null, meta ไม่พบ -> คง doc ที่ parse ด้วย UTF-8 ไว้
        String html = "<html><head><title>NoMeta</title></head><body>Hi</body></html>";
        ByteBuffer bb = Charset.forName("UTF-8").encode(html);
        Document doc = DataUtil.parseByteData(bb, null, "http://example.com/", Parser.htmlParser());
        assertEquals("NoMeta", doc.title());
    }

    @Test
    public void testParseByteData_charsetNull_metaHttpEquiv_differentCharset_triggersRedecode() throws Exception {
        // meta[http-equiv] พบ, foundCharset != null/empty และ != default -> re-decode branch
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">"
                + "<title>Meta</title></head><body>Cafe</body></html>";
        ByteBuffer bb = Charset.forName("ISO-8859-1").encode(html);
        Document doc = DataUtil.parseByteData(bb, null, "http://example.com/", Parser.htmlParser());
        assertEquals("Meta", doc.title());
        assertFalse("ควร re-decode เป็น charset อื่นจาก default",
                doc.outputSettings().charset().name().equalsIgnoreCase("UTF-8"));
    }

    @Test
    public void testParseByteData_charsetNull_metaCharsetAttr_equalsDefault_noRedecode() throws Exception {
        // meta[charset] = "UTF-8" (เท่ากับ default) -> condition false, ไม่ redecode
        String html = "<html><head><meta charset=\"UTF-8\"><title>SameCharset</title></head><body></body></html>";
        ByteBuffer bb = Charset.forName("UTF-8").encode(html);
        Document doc = DataUtil.parseByteData(bb, null, "http://example.com/", Parser.htmlParser());
        assertEquals("SameCharset", doc.title());
    }

    @Test
    public void testParseByteData_charsetNull_metaCharsetAttr_empty_noRedecode() throws Exception {
        // meta[charset] = "" -> foundCharset.length() == 0 -> ไม่ redecode
        String html = "<html><head><meta charset=\"\"><title>EmptyCharset</title></head><body></body></html>";
        ByteBuffer bb = Charset.forName("UTF-8").encode(html);
        Document doc = DataUtil.parseByteData(bb, null, "http://example.com/", Parser.htmlParser());
        assertEquals("EmptyCharset", doc.title());
    }

    @Test
    public void testParseByteData_charsetSpecified_normal() throws Exception {
        String html = "<html><head><title>Specified</title></head><body></body></html>";
        ByteBuffer bb = Charset.forName("UTF-8").encode(html);
        Document doc = DataUtil.parseByteData(bb, "UTF-8", "http://example.com/", Parser.htmlParser());
        assertEquals("Specified", doc.title());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseByteData_charsetSpecified_empty_throwsValidateException() throws Exception {
        String html = "<html></html>";
        ByteBuffer bb = Charset.forName("UTF-8").encode(html);
        // charsetName = "" -> Validate.notEmpty ควร throw IllegalArgumentException
        DataUtil.parseByteData(bb, "", "http://example.com/", Parser.htmlParser());
    }

    @Test
    public void testParseByteData_bomStripped_whenCharsetSpecified() throws Exception {
        // doc == null branch (charsetName ไม่ null) -> ตรวจว่า BOM (char 65279) ถูก strip
        String html = "\uFEFF<html><head><title>BOM</title></head><body></body></html>";
        ByteBuffer bb = Charset.forName("UTF-8").encode(html);
        Document doc = DataUtil.parseByteData(bb, "UTF-8", "http://example.com/", Parser.htmlParser());
        assertEquals("BOM", doc.title());
    }

    // ---------------------------------------------------------------------
    // readToByteBuffer(InputStream, int)
    // ---------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testReadToByteBuffer_negativeMaxSize_throws() throws IOException {
        InputStream is = new ByteArrayInputStream("abc".getBytes());
        DataUtil.readToByteBuffer(is, -1);
    }

    @Test
    public void testReadToByteBuffer_unlimited_capturesAllData() throws IOException {
        String data = "Hello World";
        InputStream is = new ByteArrayInputStream(data.getBytes("UTF-8"));
        ByteBuffer bb = DataUtil.readToByteBuffer(is, 0); // capped=false
        assertEquals(data, bufferToString(bb));
    }

    @Test
    public void testReadToByteBuffer_cappedLargerThanData() throws IOException {
        String data = "Short";
        InputStream is = new ByteArrayInputStream(data.getBytes("UTF-8"));
        ByteBuffer bb = DataUtil.readToByteBuffer(is, 100); // read <= remaining
        assertEquals(data, bufferToString(bb));
    }

    @Test
    public void testReadToByteBuffer_cappedEqualsDataLengthExactly() throws IOException {
        // boundary: read == remaining (ไม่ใช่ read > remaining)
        String data = "ExactLen";
        byte[] bytes = data.getBytes("UTF-8");
        InputStream is = new ByteArrayInputStream(bytes);
        ByteBuffer bb = DataUtil.readToByteBuffer(is, bytes.length);
        assertEquals(data, bufferToString(bb));
    }

    @Test
    public void testReadToByteBuffer_cappedSmallerThanData_truncates() throws IOException {
        String data = "HelloWorldThisIsLongText";
        InputStream is = new ByteArrayInputStream(data.getBytes("UTF-8"));
        int cap = 5;
        ByteBuffer bb = DataUtil.readToByteBuffer(is, cap); // read > remaining -> break
        assertEquals(cap, bb.remaining());
        assertEquals("Hello", bufferToString(bb));
    }

    @Test
    public void testReadToByteBuffer_emptyStream_returnsEmptyBuffer() throws IOException {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        ByteBuffer bb = DataUtil.readToByteBuffer(is, 0); // read == -1 ทันที -> break
        assertEquals(0, bb.remaining());
    }

    // ---------------------------------------------------------------------
    // readToByteBuffer(InputStream)  -- overload เรียก maxSize=0
    // ---------------------------------------------------------------------

    @Test
    public void testReadToByteBuffer_defaultOverload() throws IOException {
        String data = "DefaultOverload";
        InputStream is = new ByteArrayInputStream(data.getBytes("UTF-8"));
        ByteBuffer bb = DataUtil.readToByteBuffer(is);
        assertEquals(data, bufferToString(bb));
    }

    // ---------------------------------------------------------------------
    // getCharsetFromContentType
    // ---------------------------------------------------------------------

    @Test
    public void testGetCharsetFromContentType_null_returnsNull() {
        assertNull(DataUtil.getCharsetFromContentType(null));
    }

    @Test
    public void testGetCharsetFromContentType_noMatch_returnsNull() {
        assertNull(DataUtil.getCharsetFromContentType("text/html"));
    }

    @Test
    public void testGetCharsetFromContentType_supportedAsIs() {
        String result = DataUtil.getCharsetFromContentType("text/html; charset=UTF-8");
        assertEquals("UTF-8", result);
    }

    @Test
    public void testGetCharsetFromContentType_lowerCaseSupported_notForcedUppercase() {
        // Charset.isSupported ไม่สน case -> ค่าที่ return ควรเป็นค่าดิบ (ไม่ uppercase)
        // เพราะ isSupported(charset) ตัวแรกผ่านไปแล้ว
        String result = DataUtil.getCharsetFromContentType("text/html; charset=utf-8");
        assertEquals("utf-8", result);
    }

    @Test
    public void testGetCharsetFromContentType_unsupportedCharset_returnsNull() {
        // NOTE: เลือกชื่อ charset ที่ format ถูกต้อง (ไม่ throw IllegalCharsetNameException)
        // แต่ไม่ supported ทั้งก่อนและหลัง uppercase -> คาดว่า return null ตาม source
        String result = DataUtil.getCharsetFromContentType("text/html; charset=bogus-charset-xyz");
        assertNull(result);
    }

    @Test
    public void testGetCharsetFromContentType_quotedAndTrailingSemicolon() {
        String result = DataUtil.getCharsetFromContentType("text/html; charset=\"UTF-8\";");
        assertEquals("UTF-8", result);
    }

    // ---------------------------------------------------------------------
    // Helpers
    // ---------------------------------------------------------------------

    private void writeFile(File f, String content, String charsetName) throws IOException {
        FileOutputStream fos = new FileOutputStream(f);
        try {
            fos.write(content.getBytes(charsetName));
        } finally {
            fos.close();
        }
    }

    private String bufferToString(ByteBuffer bb) throws IOException {
        byte[] arr = new byte[bb.remaining()];
        bb.get(arr);
        return new String(arr, "UTF-8");
    }
}
```

## ตารางสรุปการครอบคลุม Branch/Condition

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testLoadFile_success` | `load(File,..)` success path, `inStream.close()` ใน finally |
| `testLoadFile_notFound_throwsIOException` | `load(File,..)` FileNotFoundException propagate |
| `testLoadInputStream_3arg` | `load(InputStream,..)` 3-arg overload |
| `testLoadInputStream_4arg_withHtmlParser` | `load(InputStream,..,Parser)` 4-arg overload |
| `testParseByteData_charsetNull_noMetaFound` | `charsetName==null`, `meta==null` (ไม่เข้า if) |
| `testParseByteData_charsetNull_metaHttpEquiv_differentCharset_triggersRedecode` | `meta!=null`, `hasAttr("http-equiv")==true`, `foundCharset` valid & != default → re-decode branch |
| `testParseByteData_charsetNull_metaCharsetAttr_equalsDefault_noRedecode` | `hasAttr("http-equiv")==false` (ใช้ `meta.attr("charset")`), `foundCharset.equals(defaultCharset)==true` → skip redecode |
| `testParseByteData_charsetNull_metaCharsetAttr_empty_noRedecode` | `foundCharset.length()==0` → skip redecode |
| `testParseByteData_charsetSpecified_normal` | `charsetName!=null` branch ปกติ |
| `testParseByteData_charsetSpecified_empty_throwsValidateException` | `Validate.notEmpty` throw เมื่อ charsetName = "" |
| `testParseByteData_bomStripped_whenCharsetSpecified` | `doc==null` branch, BOM char `65279` ถูก strip |
| `testReadToByteBuffer_negativeMaxSize_throws` | `Validate.isTrue(maxSize>=0)` throw |
| `testReadToByteBuffer_unlimited_capturesAllData` | `capped=false` |
| `testReadToByteBuffer_cappedLargerThanData` | `capped=true`, `read<=remaining` |
| `testReadToByteBuffer_cappedEqualsDataLengthExactly` | boundary `read==remaining` |
| `testReadToByteBuffer_cappedSmallerThanData_truncates` | `read>remaining` → break + partial write |
| `testReadToByteBuffer_emptyStream_returnsEmptyBuffer` | `read==-1` ทันที → break ก่อนเข้า if capped |
| `testReadToByteBuffer_defaultOverload` | overload `readToByteBuffer(InputStream)` เรียก maxSize=0 |
| `testGetCharsetFromContentType_null_returnsNull` | `contentType==null` → return null |
| `testGetCharsetFromContentType_noMatch_returnsNull` | `m.find()==false` → return null |
| `testGetCharsetFromContentType_supportedAsIs` | `Charset.isSupported(charset)==true` (ตัวแรก) |
| `testGetCharsetFromContentType_lowerCaseSupported_notForcedUppercase` | ยืนยันไม่ uppercase เมื่อ supported ตั้งแต่แรก |
| `testGetCharsetFromContentType_unsupportedCharset_returnsNull` | ทั้งสอง `isSupported` เป็น false → fallthrough return null |
| `testGetCharsetFromContentType_quotedAndTrailingSemicolon` | regex กรณีมี quote/semicolon |

**หมายเหตุ/ข้อสังเกตที่ไม่แน่ใจ (ตามข้อกำหนดข้อ 4):**
- Branch ที่สอง (`charset = charset.toUpperCase(...); if (Charset.isSupported(charset))`) ยากจะ trigger แยกจาก branch แรกด้วยชื่อ charset มาตรฐาน เพราะ `Charset.isSupported` เป็น case-insensitive อยู่แล้ว จึงไม่มี test ที่ isolate branch นี้ได้ 100% — คอมเมนต์ไว้ในโค้ดแล้ว
- ไม่ได้ทดสอบ loop หลายรอบของ `readToByteBuffer` ด้วยข้อมูลเกิน `bufferSize` (128KB) เนื่องจากต้องใช้ข้อมูลขนาดใหญ่มาก ซึ่งไม่กระทบ branch logic เพิ่มเติมจากที่ทดสอบไว้