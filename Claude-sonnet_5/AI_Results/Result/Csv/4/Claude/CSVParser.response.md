# CSVParserTest.java

```java
import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.junit.Test;

/**
 * Unit tests for {@link CSVParser}.
 *
 * หมายเหตุ: การทดสอบบางกรณี (เช่น branch INVALID ของ Token.Type)
 * อ้างอิงพฤติกรรมของ Lexer ซึ่งไม่มี source ให้ตรวจสอบตรง ๆ
 * จึงมีคอมเมนต์กำกับความไม่แน่ใจไว้ในแต่ละจุด
 */
public class CSVParserTest {

    // ---------------------------------------------------------------
    // Constructor null-checks
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_NullReader_ThrowsIllegalArgumentException() throws IOException {
        new CSVParser(null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_NullFormat_ThrowsIllegalArgumentException() throws IOException {
        new CSVParser(new java.io.StringReader("a,b"), null);
    }

    // ---------------------------------------------------------------
    // Static factory: parse(File, format)
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testParseFile_NullFile_ThrowsIllegalArgumentException() throws IOException {
        CSVParser.parse((File) null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseFile_NullFormat_ThrowsIllegalArgumentException() throws IOException {
        // ใช้ไฟล์ dummy ที่ไม่มีจริงก็ได้ เพราะ Assertions.notNull(format) ควร throw ก่อนเปิดไฟล์
        CSVParser.parse(new File("nonexistent.csv"), null);
    }

    // ---------------------------------------------------------------
    // Static factory: parse(String, format)
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testParseString_NullString_ThrowsIllegalArgumentException() throws IOException {
        CSVParser.parse((String) null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseString_NullFormat_ThrowsIllegalArgumentException() throws IOException {
        CSVParser.parse("a,b", null);
    }

    // ---------------------------------------------------------------
    // Static factory: parse(URL, charset, format)
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testParseURL_NullUrl_ThrowsIllegalArgumentException() throws IOException {
        CSVParser.parse((URL) null, Charset.forName("UTF-8"), CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseURL_NullCharset_ThrowsIllegalArgumentException() throws IOException {
        URL url = new URL("http://example.com/dummy.csv");
        CSVParser.parse(url, null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseURL_NullFormat_ThrowsIllegalArgumentException() throws IOException {
        URL url = new URL("http://example.com/dummy.csv");
        CSVParser.parse(url, Charset.forName("UTF-8"), null);
    }

    // ---------------------------------------------------------------
    // Basic parsing - TOKEN / EORECORD / EOF branches
    // ---------------------------------------------------------------

    @Test
    public void testParseString_SimpleCsv_ReturnsRecords() throws IOException {
        CSVParser parser = CSVParser.parse("a,b\nc,d\n", CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(2, records.size());
        assertEquals("a", records.get(0).get(0));
        assertEquals("b", records.get(0).get(1));
        assertEquals("c", records.get(1).get(0));
        assertEquals("d", records.get(1).get(1));
    }

    @Test
    public void testParseString_EmptyString_ReturnsEmptyList() throws IOException {
        // input ว่าง -> nextRecord() คืน null ทันที (record.isEmpty() == true)
        CSVParser parser = CSVParser.parse("", CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        assertTrue(records.isEmpty());
    }

    @Test
    public void testParseString_NoTrailingNewline_EOFReadyBranch() throws IOException {
        // ไม่มี newline ปิดท้าย -> token สุดท้ายเป็น EOF แต่ isReady=true -> ต้อง addRecordValue()
        CSVParser parser = CSVParser.parse("a,b", CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        assertEquals("a", records.get(0).get(0));
        assertEquals("b", records.get(0).get(1));
    }

    @Test
    public void testGetRecords_MultipleLines() throws IOException {
        CSVParser parser = CSVParser.parse("1,2\n3,4\n5,6\n", CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(3, records.size());
    }

    // ---------------------------------------------------------------
    // Header handling - initializeHeader() branches
    // ---------------------------------------------------------------

    @Test
    public void testHeaderMap_ExplicitHeader_NoSkip() throws IOException {
        // formatHeader.length != 0, skipHeaderRecord=false (default) -> ไม่ nextRecord() ก่อน
        CSVFormat format = CSVFormat.DEFAULT.withHeader("A", "B");
        CSVParser parser = CSVParser.parse("1,2\n3,4\n", format);

        Map<String, Integer> headerMap = parser.getHeaderMap();
        assertEquals(Integer.valueOf(0), headerMap.get("A"));
        assertEquals(Integer.valueOf(1), headerMap.get("B"));

        List<CSVRecord> records = parser.getRecords();
        // เนื่องจากไม่ skip เรคคอร์ดแรกของข้อมูล ("1,2") ยังถูกอ่านเป็นข้อมูลปกติ
        assertEquals(2, records.size());
        assertEquals("1", records.get(0).get("A"));
    }

    @Test
    public void testHeaderMap_ExplicitHeader_SkipHeaderRecord() throws IOException {
        // formatHeader.length != 0, skipHeaderRecord=true -> เรียก nextRecord() เพื่อ skip แถวแรกของ input
        CSVFormat format = CSVFormat.DEFAULT.withHeader("A", "B").withSkipHeaderRecord(true);
        CSVParser parser = CSVParser.parse("A,B\n1,2\n3,4\n", format);

        Map<String, Integer> headerMap = parser.getHeaderMap();
        assertEquals(Integer.valueOf(0), headerMap.get("A"));
        assertEquals(Integer.valueOf(1), headerMap.get("B"));

        List<CSVRecord> records = parser.getRecords();
        // แถวแรก "A,B" ถูก skip ไปแล้ว เหลือ 2 records ข้อมูล
        assertEquals(2, records.size());
        assertEquals("1", records.get(0).get("A"));
        assertEquals("2", records.get(0).get("B"));
    }

    @Test
    public void testHeaderMap_EmptyHeaderArray_ReadsFirstLineAsHeader() throws IOException {
        // formatHeader.length == 0 -> อ่านบรรทัดแรกของ input มาเป็น header
        CSVFormat format = CSVFormat.DEFAULT.withHeader();
        CSVParser parser = CSVParser.parse("a,b\nc,d\n", format);

        Map<String, Integer> headerMap = parser.getHeaderMap();
        assertEquals(Integer.valueOf(0), headerMap.get("a"));
        assertEquals(Integer.valueOf(1), headerMap.get("b"));

        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        assertEquals("c", records.get(0).get("a"));
        assertEquals("d", records.get(0).get("b"));
    }

    @Test
    public void testGetHeaderMap_NoHeaderDefined_ThrowsNPE() throws IOException {
        // เมื่อไม่มี header ใน format, headerMap ภายในจะเป็น null
        // getHeaderMap() ทำ `new LinkedHashMap<>(this.headerMap)` ซึ่งจะ throw NPE
        // (นี่คือพฤติกรรมที่ปรากฏจาก source จริง ไม่ใช่การเดา)
        CSVParser parser = CSVParser.parse("a,b\n", CSVFormat.DEFAULT);
        try {
            parser.getHeaderMap();
            fail("Expected NullPointerException when no header format is defined");
        } catch (NullPointerException expected) {
            // pass - ยืนยันพฤติกรรม NPE ตาม source
        }
    }

    // ---------------------------------------------------------------
    // addRecordValue() - nullString handling
    // ---------------------------------------------------------------

    @Test
    public void testNullStringHandling_ReplacesWithNull() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        CSVParser parser = CSVParser.parse("NULL,foo\n", format);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        assertNull(records.get(0).get(0));
        assertEquals("foo", records.get(0).get(1));
    }

    @Test
    public void testNullStringHandling_DefaultNoNullString() throws IOException {
        // nullString == null (ค่าเริ่มต้น) -> ค่าที่อ่านได้เก็บตามเดิม
        CSVParser parser = CSVParser.parse("NULL,foo\n", CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        assertEquals("NULL", records.get(0).get(0));
    }

    // ---------------------------------------------------------------
    // COMMENT branch handling
    // ---------------------------------------------------------------

    @Test
    public void testCommentHandling_SingleComment() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        CSVParser parser = CSVParser.parse("# comment\na,b\n", format);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        assertEquals("a", records.get(0).get(0));
        assertEquals("b", records.get(0).get(1));
    }

    @Test
    public void testCommentHandling_MultipleCommentsAppendLF() throws IOException {
        // ครอบคลุม branch sb != null -> sb.append(Constants.LF)
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        CSVParser parser = CSVParser.parse("#c1\n#c2\na,b\n", format);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        assertEquals("a", records.get(0).get(0));
    }

    // ---------------------------------------------------------------
    // INVALID branch - ไม่แน่ใจ 100% ว่า input นี้ trigger INVALID จาก Lexer จริงหรือไม่
    // จึงมีคอมเมนต์กำกับความไม่แน่ใจไว้ตามข้อกำหนด
    // ---------------------------------------------------------------

    @Test(expected = IOException.class)
    public void testInvalidTokenSequence_ThrowsIOException() throws IOException {
        // สมมติฐาน: field ที่มีตัวอักษรตามหลัง closing quote ทันที (ไม่ใช่ delimiter)
        // จะทำให้ Lexer ส่งกลับ Token.Type.INVALID -> nextRecord() throw IOException
        // ไม่มี source ของ Lexer ให้ยืนยัน 100% จึงมาร์คไว้เป็นกรณีที่อาจต้องปรับปรุงหากพฤติกรรมจริงต่างออกไป
        CSVParser parser = CSVParser.parse("\"a\"b,c\n", CSVFormat.DEFAULT);
        parser.getRecords();
    }

    // ---------------------------------------------------------------
    // Iterator behavior
    // ---------------------------------------------------------------

    @Test
    public void testIterator_HasNextAndNext() throws IOException {
        CSVParser parser = CSVParser.parse("a,b\nc,d\n", CSVFormat.DEFAULT);
        Iterator<CSVRecord> it = parser.iterator();
        assertTrue(it.hasNext());
        CSVRecord first = it.next();
        assertEquals("a", first.get(0));
        assertTrue(it.hasNext());
        CSVRecord second = it.next();
        assertEquals("c", second.get(0));
        assertFalse(it.hasNext());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testIterator_Remove_ThrowsUnsupportedOperationException() throws IOException {
        CSVParser parser = CSVParser.parse("a,b\n", CSVFormat.DEFAULT);
        Iterator<CSVRecord> it = parser.iterator();
        it.remove();
    }

    @Test(expected = NoSuchElementException.class)
    public void testIterator_NextAfterClose_ThrowsNoSuchElementException() throws IOException {
        CSVParser parser = CSVParser.parse("a,b\n", CSVFormat.DEFAULT);
        parser.close();
        Iterator<CSVRecord> it = parser.iterator();
        it.next(); // isClosed() == true -> throws NoSuchElementException
    }

    @Test(expected = NoSuchElementException.class)
    public void testIterator_NextWhenNoMoreRecords_ThrowsNoSuchElementException() throws IOException {
        CSVParser parser = CSVParser.parse("a,b\n", CSVFormat.DEFAULT);
        Iterator<CSVRecord> it = parser.iterator();
        it.next(); // ดึง record เดียวที่มี
        it.next(); // ไม่มี record เหลือ -> getNextRecord() คืน null -> throw NoSuchElementException
    }

    @Test
    public void testIterator_HasNextFalseWhenClosed() throws IOException {
        CSVParser parser = CSVParser.parse("a,b\n", CSVFormat.DEFAULT);
        parser.close();
        Iterator<CSVRecord> it = parser.iterator();
        assertFalse(it.hasNext());
    }

    // ---------------------------------------------------------------
    // close() / isClosed()
    // ---------------------------------------------------------------

    @Test
    public void testCloseAndIsClosed() throws IOException {
        CSVParser parser = CSVParser.parse("a,b\n", CSVFormat.DEFAULT);
        assertFalse(parser.isClosed());
        parser.close();
        assertTrue(parser.isClosed());
    }

    // ---------------------------------------------------------------
    // Line number / record number
    // ---------------------------------------------------------------

    @Test
    public void testGetCurrentLineNumber() throws IOException {
        CSVParser parser = CSVParser.parse("a,b\nc,d\n", CSVFormat.DEFAULT);
        assertEquals(0, parser.getCurrentLineNumber());
        parser.getRecords();
        // หลังอ่านจบ 2 บรรทัด ควร >= 2
        assertTrue(parser.getCurrentLineNumber() >= 2);
    }

    @Test
    public void testGetRecordNumberIncrements() throws IOException {
        CSVParser parser = CSVParser.parse("a,b\nc,d\ne,f\n", CSVFormat.DEFAULT);
        assertEquals(0, parser.getRecordNumber());
        List<CSVRecord> records = parser.getRecords();
        assertEquals(3, records.size());
        assertEquals(3, parser.getRecordNumber());
        // ตรวจสอบว่า recordNumber ของแต่ละ record ถูกกำหนดตามลำดับ
        assertEquals(1, records.get(0).getRecordNumber());
        assertEquals(2, records.get(1).getRecordNumber());
        assertEquals(3, records.get(2).getRecordNumber());
    }
}
```

---

## ตารางสรุป Branch/Condition ที่ครอบคลุม

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testConstructor_NullReader_*`, `testConstructor_NullFormat_*` | constructor: `Assertions.notNull(reader)`, `Assertions.notNull(format)` |
| `testParseFile_Null*` | static `parse(File,format)`: null-check ทั้งสอง parameter |
| `testParseString_Null*` | static `parse(String,format)`: null-check ทั้งสอง parameter |
| `testParseURL_Null*` | static `parse(URL,charset,format)`: null-check 3 parameter |
| `testParseString_SimpleCsv_*` | `nextRecord()`: case `TOKEN`, `EORECORD`; loop `while(type==TOKEN)` |
| `testParseString_EmptyString_*` | `nextRecord()`: `record.isEmpty()==true` → return null |
| `testParseString_NoTrailingNewline_*` | `nextRecord()`: case `EOF` กับ `isReady==true` → `addRecordValue()` |
| `testGetRecords_MultipleLines` | `getRecords()` loop จนกว่า `nextRecord()==null` |
| `testHeaderMap_ExplicitHeader_NoSkip` | `initializeHeader()`: `formatHeader.length!=0`, `getSkipHeaderRecord()==false` |
| `testHeaderMap_ExplicitHeader_SkipHeaderRecord` | `initializeHeader()`: `formatHeader.length!=0`, `getSkipHeaderRecord()==true` → เรียก `nextRecord()` |
| `testHeaderMap_EmptyHeaderArray_*` | `initializeHeader()`: `formatHeader.length==0` → อ่าน header จากบรรทัดแรก |
| `testGetHeaderMap_NoHeaderDefined_ThrowsNPE` | `getHeaderMap()` เมื่อ `headerMap==null` (formatHeader==null) — เผยพฤติกรรม NPE ที่แท้จริงจาก source |
| `testNullStringHandling_ReplacesWithNull` | `addRecordValue()`: `nullString!=null` และ `input.equalsIgnoreCase(nullString)==true` |
| `testNullStringHandling_DefaultNoNullString` | `addRecordValue()`: `nullString==null` |
| `testCommentHandling_SingleComment` | `nextRecord()`: case `COMMENT`, `sb==null` (first comment) |
| `testCommentHandling_MultipleCommentsAppendLF` | `nextRecord()`: case `COMMENT`, `sb!=null` → `sb.append(Constants.LF)` |
| `testInvalidTokenSequence_ThrowsIOException` | `nextRecord()`: case `INVALID` → throw `IOException` (⚠️ สมมติฐาน ไม่ยืนยัน 100% เนื่องจากไม่มี source ของ `Lexer`) |
| `testIterator_HasNextAndNext` | `iterator().hasNext()`/`next()`: `current==null`→`getNextRecord()`, `current!=null` |
| `testIterator_Remove_*` | `iterator().remove()` → `UnsupportedOperationException` |
| `testIterator_NextAfterClose_*` | `iterator().next()`: `isClosed()==true` → `NoSuchElementException` |
| `testIterator_NextWhenNoMoreRecords_*` | `iterator().next()`: `next==null` หลัง `getNextRecord()` → `NoSuchElementException` |
| `testIterator_HasNextFalseWhenClosed` | `iterator().hasNext()`: `isClosed()==true` → return false |
| `testCloseAndIsClosed` | `close()`, `isClosed()` |
| `testGetCurrentLineNumber` | `getCurrentLineNumber()` เปลี่ยนแปลงตาม parse progress |
| `testGetRecordNumberIncrements` | `getRecordNumber()` และ `this.recordNumber++` ใน `nextRecord()` |

**ข้อสังเกตสำคัญ:** เคส `testGetHeaderMap_NoHeaderDefined_ThrowsNPE` เผยให้เห็น fault จริงในซอร์ส — `getHeaderMap()` ไม่ได้ตรวจสอบ `null` ก่อนสร้าง `LinkedHashMap` ใหม่ ซึ่งทำให้เกิด `NullPointerException` เมื่อไม่มีการกำหนด header ในรูปแบบ (`CSVFormat`) — เทสนี้ช่วยดักจับข้อบกพร่องนี้ได้โดยตรง