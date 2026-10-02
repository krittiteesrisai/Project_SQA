# CSVParserTest.java

```java
package org.apache.commons.csv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.junit.Test;

/**
 * Unit test สำหรับ {@link CSVParser} (Defects4J: Csv-7b)
 *
 * หมายเหตุ: บาง test case ที่เกี่ยวข้องกับ Lexer/CSVFormat internal behaviour
 * (เช่น token INVALID, format.validate()) ถูก comment กำกับไว้ว่าอ้างอิงจาก
 * พฤติกรรมมาตรฐานของ Apache Commons CSV ซึ่งไม่ได้แสดง source ให้เห็นตรง ๆ
 * ในไฟล์ CSVParser.java ที่ให้มา
 */
public class CSVParserTest {

    // ---------------------------------------------------------------
    // 1) Null-argument validation ในเมธอด static factory / constructor
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testParseFileNullFile_throwsIllegalArgumentException() throws IOException {
        CSVParser.parse((java.io.File) null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseFileNullFormat_throwsIllegalArgumentException() throws IOException {
        CSVParser.parse(new java.io.File("dummy.csv"), null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseStringNullString_throwsIllegalArgumentException() throws IOException {
        CSVParser.parse((String) null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseStringNullFormat_throwsIllegalArgumentException() throws IOException {
        CSVParser.parse("a,b,c", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseURLNullUrl_throwsIllegalArgumentException() throws IOException {
        CSVParser.parse((URL) null, Charset.forName("UTF-8"), CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseURLNullCharset_throwsIllegalArgumentException() throws IOException {
        CSVParser.parse(new URL("http://example.com"), null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseURLNullFormat_throwsIllegalArgumentException() throws IOException {
        CSVParser.parse(new URL("http://example.com"), Charset.forName("UTF-8"), null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullReader_throwsIllegalArgumentException() throws IOException {
        new CSVParser((Reader) null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullFormat_throwsIllegalArgumentException() throws IOException {
        new CSVParser(new StringReader("a,b,c"), null);
    }

    // ---------------------------------------------------------------
    // 2) Basic parsing / getRecords()
    // ---------------------------------------------------------------

    @Test
    public void testParseSimpleCsv_returnsRecordsWithCorrectValues() throws IOException {
        final CSVParser parser = CSVParser.parse("a,b,c\n1,2,3\n", CSVFormat.DEFAULT);
        final List<CSVRecord> records = parser.getRecords();
        assertEquals(2, records.size());
        assertEquals("a", records.get(0).get(0));
        assertEquals("b", records.get(0).get(1));
        assertEquals("c", records.get(0).get(2));
        assertEquals("1", records.get(1).get(0));
        assertEquals("2", records.get(1).get(1));
        assertEquals("3", records.get(1).get(2));
        parser.close();
    }

    @Test
    public void testParseEmptyString_returnsEmptyList() throws IOException {
        final CSVParser parser = CSVParser.parse("", CSVFormat.DEFAULT);
        final List<CSVRecord> records = parser.getRecords();
        assertTrue(records.isEmpty());
        parser.close();
    }

    @Test
    public void testGetRecordsAppendsToProvidedCollection() throws IOException {
        final CSVParser parser = CSVParser.parse("x,y\n1,2\n", CSVFormat.DEFAULT);
        final List<CSVRecord> existing = new ArrayList<CSVRecord>();
        final List<CSVRecord> result = parser.getRecords(existing);
        assertTrue("ต้องคืนอ้างอิง collection เดิม", result == existing);
        assertEquals(2, result.size());
        parser.close();
    }

    @Test
    public void testRecordNumberIncrementsPerRecord() throws IOException {
        final CSVParser parser = CSVParser.parse("a\nb\nc\n", CSVFormat.DEFAULT);
        assertEquals(0, parser.getRecordNumber());
        parser.nextRecord();
        assertEquals(1, parser.getRecordNumber());
        parser.nextRecord();
        assertEquals(2, parser.getRecordNumber());
        parser.nextRecord();
        assertEquals(3, parser.getRecordNumber());
        assertNull(parser.nextRecord());
        parser.close();
    }

    @Test
    public void testCurrentLineNumberAdvances() throws IOException {
        final CSVParser parser = CSVParser.parse("a\nb\nc\n", CSVFormat.DEFAULT);
        final long before = parser.getCurrentLineNumber();
        parser.getRecords();
        final long after = parser.getCurrentLineNumber();
        assertTrue(after > before);
        parser.close();
    }

    // ---------------------------------------------------------------
    // 3) branch: TOKEN / EORECORD / EOF(isReady) ใน nextRecord()
    // ---------------------------------------------------------------

    @Test
    public void testTrailingNewlinePresent_noExtraEmptyRecord() throws IOException {
        // มี \n ปิดท้าย -> record สุดท้ายถูกปิดด้วย EORECORD, ครั้งต่อไป EOF(isReady=false)
        final CSVParser parser = CSVParser.parse("1,2,3\n", CSVFormat.DEFAULT);
        final List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        assertEquals("3", records.get(0).get(2));
        parser.close();
    }

    @Test
    public void testNoTrailingNewline_lastRecordStillParsed() throws IOException {
        // ไม่มี \n ปิดท้าย -> token EOF แต่ isReady=true -> ต้อง addRecordValue() ให้ field สุดท้าย
        final CSVParser parser = CSVParser.parse("1,2,3", CSVFormat.DEFAULT);
        final List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        assertEquals("1", records.get(0).get(0));
        assertEquals("2", records.get(0).get(1));
        assertEquals("3", records.get(0).get(2));
        parser.close();
    }

    // ---------------------------------------------------------------
    // 4) addRecordValue(): nullString branch
    // ---------------------------------------------------------------

    @Test
    public void testNullStringConversion_caseInsensitive() throws IOException {
        final CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        final CSVParser parser = CSVParser.parse("NuLl,value\n", format);
        final CSVRecord record = parser.nextRecord();
        assertNull("nullString ต้อง match แบบ case-insensitive", record.get(0));
        assertEquals("value", record.get(1));
        parser.close();
    }

    @Test
    public void testNullStringNotSetDefault_valueUnchanged() throws IOException {
        // ไม่ตั้ง nullString (เป็น null ตาม default) -> ค่า "NULL" ไม่ถูกแปลง
        final CSVParser parser = CSVParser.parse("NULL,value\n", CSVFormat.DEFAULT);
        final CSVRecord record = parser.nextRecord();
        assertEquals("NULL", record.get(0));
        parser.close();
    }

    // ---------------------------------------------------------------
    // 5) initializeHeader(): header branches
    // ---------------------------------------------------------------

    @Test
    public void testHeaderMapNullWhenNoHeaderFormat() throws IOException {
        final CSVParser parser = CSVParser.parse("a,b\n1,2\n", CSVFormat.DEFAULT);
        assertNull(parser.getHeaderMap());
        parser.close();
    }

    @Test
    public void testHeaderReadFromFirstLine_emptyHeaderArray() throws IOException {
        // withHeader() ไม่มี argument -> formatHeader.length == 0 -> อ่าน header จากบรรทัดแรก
        final CSVFormat format = CSVFormat.DEFAULT.withHeader();
        final CSVParser parser = CSVParser.parse("col1,col2\nval1,val2\n", format);
        final Map<String, Integer> headerMap = parser.getHeaderMap();
        assertNotNull(headerMap);
        assertEquals(Integer.valueOf(0), headerMap.get("col1"));
        assertEquals(Integer.valueOf(1), headerMap.get("col2"));

        final List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        assertEquals("val1", records.get(0).get("col1"));
        parser.close();
    }

    @Test
    public void testHeaderProvided_skipHeaderRecordTrue() throws IOException {
        // header ระบุเอง + skipHeaderRecord=true -> บรรทัดแรกของข้อมูล (ซึ่งซ้ำกับ header) ถูก skip
        final CSVFormat format = CSVFormat.DEFAULT.withHeader("col1", "col2").withSkipHeaderRecord(true);
        final CSVParser parser = CSVParser.parse("col1,col2\nval1,val2\n", format);
        final List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        assertEquals("val1", records.get(0).get("col1"));
        parser.close();
    }

    @Test
    public void testHeaderProvided_skipHeaderRecordFalse() throws IOException {
        // header ระบุเอง + skipHeaderRecord=false (default) -> บรรทัดแรกถือเป็น data ปกติ
        final CSVFormat format = CSVFormat.DEFAULT.withHeader("col1", "col2").withSkipHeaderRecord(false);
        final CSVParser parser = CSVParser.parse("row1a,row1b\nrow2a,row2b\n", format);
        final List<CSVRecord> records = parser.getRecords();
        assertEquals(2, records.size());
        assertEquals("row1a", records.get(0).get("col1"));
        parser.close();
    }

    // ---------------------------------------------------------------
    // 6) COMMENT branch ใน nextRecord()
    // ---------------------------------------------------------------

    @Test
    public void testCommentSingleLineAttachedToNextRecord() throws IOException {
        final CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        final CSVParser parser = CSVParser.parse("# a comment\na,b,c\n", format);
        final CSVRecord record = parser.nextRecord();
        assertEquals("a comment", record.getComment());
        assertEquals("a", record.get(0));
        parser.close();
    }

    @Test
    public void testCommentMultipleLinesJoinedWithLF() throws IOException {
        final CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        final CSVParser parser = CSVParser.parse("# line1\n# line2\na,b\n", format);
        final CSVRecord record = parser.nextRecord();
        assertEquals("line1\nline2", record.getComment());
        parser.close();
    }

    @Test
    public void testCommentOnlyInput_returnsNull() throws IOException {
        // sb != null (มี comment) แต่ record.isEmpty() == true -> nextRecord() คืน null
        final CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        final CSVParser parser = CSVParser.parse("# only a comment", format);
        final CSVRecord record = parser.nextRecord();
        assertNull(record);
        parser.close();
    }

    // ---------------------------------------------------------------
    // 7) close()/isClosed()
    // ---------------------------------------------------------------

    @Test
    public void testCloseAndIsClosed() throws IOException {
        final CSVParser parser = CSVParser.parse("a,b\n", CSVFormat.DEFAULT);
        assertFalse(parser.isClosed());
        parser.close();
        assertTrue(parser.isClosed());
    }

    // ---------------------------------------------------------------
    // 8) iterator()
    // ---------------------------------------------------------------

    @Test
    public void testIteratorBasicIteration() throws IOException {
        final CSVParser parser = CSVParser.parse("a\nb\nc\n", CSVFormat.DEFAULT);
        int count = 0;
        for (final CSVRecord record : parser) {
            count++;
            assertNotNull(record);
        }
        assertEquals(3, count);
        parser.close();
    }

    @Test
    public void testIteratorHasNextFalseWhenClosed() throws IOException {
        final CSVParser parser = CSVParser.parse("a,b\n", CSVFormat.DEFAULT);
        final Iterator<CSVRecord> it = parser.iterator();
        parser.close();
        assertFalse(it.hasNext());
    }

    @Test(expected = NoSuchElementException.class)
    public void testIteratorNextThrowsWhenClosed() throws IOException {
        final CSVParser parser = CSVParser.parse("a,b\n", CSVFormat.DEFAULT);
        final Iterator<CSVRecord> it = parser.iterator();
        parser.close();
        it.next();
    }

    @Test
    public void testIteratorNextWithoutHasNext_returnsRecord() throws IOException {
        // เรียก next() ตรง ๆ โดยไม่เรียก hasNext() ก่อน -> current == null -> ไป getNextRecord()
        final CSVParser parser = CSVParser.parse("val1,val2\n", CSVFormat.DEFAULT);
        final Iterator<CSVRecord> it = parser.iterator();
        final CSVRecord record = it.next();
        assertEquals("val1", record.get(0));
        parser.close();
    }

    @Test(expected = NoSuchElementException.class)
    public void testIteratorNextWithoutHasNext_throwsNoSuchElementWhenEmpty() throws IOException {
        final CSVParser parser = CSVParser.parse("", CSVFormat.DEFAULT);
        final Iterator<CSVRecord> it = parser.iterator();
        it.next(); // ไม่มี record เลย -> NoSuchElementException
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testIteratorRemoveThrowsUnsupportedOperationException() throws IOException {
        final CSVParser parser = CSVParser.parse("a,b\n", CSVFormat.DEFAULT);
        final Iterator<CSVRecord> it = parser.iterator();
        it.remove();
    }

    // ---------------------------------------------------------------
    // 9) getHeaderMap() คืนค่าเป็น copy
    // ---------------------------------------------------------------

    @Test
    public void testGetHeaderMapReturnsCopyNotSameInstance() throws IOException {
        final CSVFormat format = CSVFormat.DEFAULT.withHeader("col1", "col2");
        final CSVParser parser = CSVParser.parse("v1,v2\n", format);
        final Map<String, Integer> map1 = parser.getHeaderMap();
        final Map<String, Integer> map2 = parser.getHeaderMap();
        assertNotSame("ทุกครั้งที่เรียกต้องได้ instance ใหม่ (copy)", map1, map2);
        assertEquals(map1, map2);
        parser.close();
    }

    // ---------------------------------------------------------------
    // 10) กรณีไม่แน่ใจ 100% ใน behavior ของ Lexer/CSVFormat internal
    //     (ไม่ได้แสดง source ให้เห็นตรง ๆ ในไฟล์ CSVParser.java ที่ให้มา)
    // ---------------------------------------------------------------

    @Test(expected = IOException.class)
    public void testInvalidQuoteSequence_throwsIOException() throws IOException {
        // หมายเหตุ: อ้างอิงพฤติกรรมมาตรฐานของ Lexer ใน Apache Commons CSV
        // ที่ quoted-field ตามด้วยตัวอักษรอื่นก่อน delimiter/line-ending
        // ถือเป็น INVALID token -> nextRecord() throw IOException
        // (ไม่ได้เห็น source ของ Lexer จริง จึงกำกับไว้ว่าอาจต้องปรับหากพฤติกรรมต่างไป)
        final CSVParser parser = CSVParser.parse("\"a\"b,c\n", CSVFormat.DEFAULT);
        try {
            parser.getRecords();
        } finally {
            parser.close();
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidateInconsistentFormat_throwsIllegalArgumentException() throws IOException {
        // หมายเหตุ: format.validate() ไม่ได้แสดง source ในไฟล์ที่ให้มา
        // อ้างอิงกฎที่รู้กันทั่วไปว่า delimiter และ quote character ห้ามเป็นตัวเดียวกัน
        final CSVFormat invalidFormat = CSVFormat.DEFAULT.withDelimiter(',').withQuote(',');
        new CSVParser(new StringReader("a,b\n"), invalidFormat);
    }

    // helper สำหรับ assertNotNull เพื่อความชัดเจน (ป้องกัน static import ซ้ำ)
    private static void assertNotNull(final Object o) {
        org.junit.Assert.assertNotNull(o);
    }
}
```

---

## สรุปตาราง Test Coverage

| เมธอด Test | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testParseFileNullFile_*`, `testParseFileNullFormat_*` | `parse(File, CSVFormat)` — Assertions.notNull สำหรับ file/format |
| `testParseStringNullString_*`, `testParseStringNullFormat_*` | `parse(String, CSVFormat)` — Assertions.notNull สำหรับ string/format |
| `testParseURLNullUrl_*`, `NullCharset_*`, `NullFormat_*` | `parse(URL, Charset, CSVFormat)` — Assertions.notNull 3 พารามิเตอร์ |
| `testConstructorNullReader_*`, `NullFormat_*` | Constructor `CSVParser(Reader, CSVFormat)` — null check ทั้งสอง |
| `testParseSimpleCsv_*` | สาขา `TOKEN`/`EORECORD` ใน `nextRecord()`, `addRecordValue()` ปกติ |
| `testParseEmptyString_*` | `record.isEmpty()` == true → `nextRecord()` คืน null |
| `testGetRecordsAppendsToProvidedCollection` | `getRecords(T records)` เติมเข้า collection ที่ส่งมา |
| `testRecordNumberIncrementsPerRecord` | `this.recordNumber++` ทุกครั้งที่ record ไม่ว่าง |
| `testCurrentLineNumberAdvances` | `getCurrentLineNumber()` เปลี่ยนค่าหลัง parse |
| `testTrailingNewlinePresent_*` | EORECORD ปิด record, EOF(isReady=false) รอบถัดไป |
| `testNoTrailingNewline_*` | สาขา `case EOF: if(isReady) addRecordValue()` == true |
| `testNullStringConversion_*` | `addRecordValue()` — nullString != null, match case-insensitive → null |
| `testNullStringNotSetDefault_*` | `addRecordValue()` — nullString == null → เก็บค่าตรงๆ |
| `testHeaderMapNullWhenNoHeaderFormat` | `initializeHeader()` — `formatHeader == null` → คืน null |
| `testHeaderReadFromFirstLine_emptyHeaderArray` | `formatHeader.length == 0` → อ่าน header จาก `nextRecord()` |
| `testHeaderProvided_skipHeaderRecordTrue` | `format.getSkipHeaderRecord() == true` → เรียก `nextRecord()` เพื่อ skip |
| `testHeaderProvided_skipHeaderRecordFalse` | `format.getSkipHeaderRecord() == false` → ไม่ skip |
| `testCommentSingleLineAttachedToNextRecord` | `case COMMENT` — `sb == null` (first comment) branch |
| `testCommentMultipleLinesJoinedWithLF` | `case COMMENT` — `sb != null` → `sb.append(LF)` branch |
| `testCommentOnlyInput_returnsNull` | `sb != null` แต่ `record.isEmpty()` → คืน null |
| `testCloseAndIsClosed` | `close()`, `isClosed()` true/false |
| `testIteratorBasicIteration` | `iterator().hasNext()/next()` วนจนหมด |
| `testIteratorHasNextFalseWhenClosed` | `hasNext()` — `isClosed() == true` → return false |
| `testIteratorNextThrowsWhenClosed` | `next()` — `isClosed() == true` → throw NoSuchElementException |
| `testIteratorNextWithoutHasNext_returnsRecord` | `next()` — `current == null` → `getNextRecord()` ได้ record |
| `testIteratorNextWithoutHasNext_throwsNoSuchElement*` | `next()` — `getNextRecord()` คืน null → throw NoSuchElementException |
| `testIteratorRemoveThrowsUnsupportedOperationException` | `remove()` throw เสมอ |
| `testGetHeaderMapReturnsCopyNotSameInstance` | `getHeaderMap()` — คืน copy ใหม่ทุกครั้ง (ไม่ null) |
| `testInvalidQuoteSequence_throwsIOException` | `case INVALID` → throw IOException (⚠️ พฤติกรรม Lexer ไม่ได้แสดงตรง ๆ) |
| `testValidateInconsistentFormat_throwsIllegalArgumentException` | Constructor เรียก `format.validate()` (⚠️ ไม่ได้แสดง source validate()) |

**หมายเหตุสำคัญ:** เนื่องจาก `CSVFormat`, `Lexer`, `Token`, `Constants`, `Assertions`, `ExtendedBufferedReader` ไม่ได้อยู่ในซอร์สที่ให้มา การ assume ชื่อเมธอด (เช่น `withHeader`, `withNullString`, `withCommentMarker`, `withSkipHeaderRecord`) อ้างอิงจาก API มาตรฐานของ Apache Commons CSV รุ่นที่ตรงกับ Defects4J Csv-7 — หากรุ่นจริงใน classpath (`csv-1.0.jar`) มี signature ต่างออกไป อาจต้องปรับ import/เมธอดให้ตรงกัน