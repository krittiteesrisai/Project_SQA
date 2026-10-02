# CSVParserTest.java

```java
package org.apache.commons.csv;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

/**
 * JUnit 4 tests for {@link CSVParser} (Defects4J Csv-16b).
 *
 * หมายเหตุ: บาง branch (เช่น Token.Type.INVALID จาก Lexer) ไม่สามารถ trigger ได้อย่างมั่นใจ
 * เพราะซอร์สของ Lexer ไม่ได้ให้มา จึงไม่ได้เขียนเทสสำหรับ branch นั้นโดยตรง (คอมเมนต์กำกับไว้)
 */
public class CSVParserTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    // ---------- Static factory: parse(String, CSVFormat) ----------

    @Test(expected = IllegalArgumentException.class)
    public void testParseString_NullString_ThrowsIAE() throws IOException {
        CSVParser.parse((String) null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseString_NullFormat_ThrowsIAE() throws IOException {
        CSVParser.parse("a,b,c", null);
    }

    @Test
    public void testParseString_Basic() throws IOException {
        try (CSVParser parser = CSVParser.parse("a,b,c\n1,2,3\n", CSVFormat.DEFAULT)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("a", records.get(0).get(0));
            assertEquals("3", records.get(1).get(2));
        }
    }

    // ---------- Static factory: parse(File, Charset, CSVFormat) ----------

    @Test(expected = IllegalArgumentException.class)
    public void testParseFile_NullFile_ThrowsIAE() throws IOException {
        CSVParser.parse((File) null, StandardCharsets.UTF_8, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseFile_NullFormat_ThrowsIAE() throws IOException {
        File file = tempFolder.newFile("test.csv");
        CSVParser.parse(file, StandardCharsets.UTF_8, null);
    }

    @Test
    public void testParseFile_Basic() throws IOException {
        File file = tempFolder.newFile("test.csv");
        try (FileWriter fw = new FileWriter(file)) {
            fw.write("x,y\n1,2\n");
        }
        try (CSVParser parser = CSVParser.parse(file, StandardCharsets.UTF_8, CSVFormat.DEFAULT)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
        }
    }

    // ---------- Static factory: parse(InputStream, Charset, CSVFormat) ----------

    @Test(expected = IllegalArgumentException.class)
    public void testParseInputStream_NullStream_ThrowsIAE() throws IOException {
        CSVParser.parse((InputStream) null, StandardCharsets.UTF_8, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseInputStream_NullFormat_ThrowsIAE() throws IOException {
        InputStream in = new java.io.ByteArrayInputStream("a,b".getBytes(StandardCharsets.UTF_8));
        CSVParser.parse(in, StandardCharsets.UTF_8, null);
    }

    @Test
    public void testParseInputStream_Basic() throws IOException {
        InputStream in = new java.io.ByteArrayInputStream("a,b\n1,2\n".getBytes(StandardCharsets.UTF_8));
        try (CSVParser parser = CSVParser.parse(in, StandardCharsets.UTF_8, CSVFormat.DEFAULT)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
        }
    }

    // ---------- Static factory: parse(Path, Charset, CSVFormat) ----------

    @Test(expected = IllegalArgumentException.class)
    public void testParsePath_NullPath_ThrowsIAE() throws IOException {
        CSVParser.parse((Path) null, StandardCharsets.UTF_8, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParsePath_NullFormat_ThrowsIAE() throws IOException {
        File file = tempFolder.newFile("test2.csv");
        CSVParser.parse(file.toPath(), StandardCharsets.UTF_8, null);
    }

    @Test
    public void testParsePath_Basic() throws IOException {
        File file = tempFolder.newFile("test2.csv");
        try (FileWriter fw = new FileWriter(file)) {
            fw.write("a,b\n1,2\n");
        }
        try (CSVParser parser = CSVParser.parse(file.toPath(), StandardCharsets.UTF_8, CSVFormat.DEFAULT)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
        }
    }

    // ---------- Static factory: parse(URL, Charset, CSVFormat) ----------

    @Test(expected = IllegalArgumentException.class)
    public void testParseURL_NullURL_ThrowsIAE() throws IOException {
        CSVParser.parse((URL) null, StandardCharsets.UTF_8, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseURL_NullCharset_ThrowsIAE() throws IOException {
        File file = tempFolder.newFile("test3.csv");
        CSVParser.parse(file.toURI().toURL(), null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseURL_NullFormat_ThrowsIAE() throws IOException {
        File file = tempFolder.newFile("test3.csv");
        CSVParser.parse(file.toURI().toURL(), StandardCharsets.UTF_8, null);
    }

    @Test
    public void testParseURL_Basic() throws IOException {
        File file = tempFolder.newFile("test3.csv");
        try (FileWriter fw = new FileWriter(file)) {
            fw.write("a,b\n1,2\n");
        }
        try (CSVParser parser = CSVParser.parse(file.toURI().toURL(), StandardCharsets.UTF_8, CSVFormat.DEFAULT)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
        }
    }

    // ---------- Static factory: parse(Reader, CSVFormat) ----------

    @Test
    public void testParseReader_Basic() throws IOException {
        try (CSVParser parser = CSVParser.parse(new StringReader("a,b\n1,2\n"), CSVFormat.DEFAULT)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
        }
    }

    // ---------- Constructor: notNull checks ----------

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_NullReader_ThrowsIAE() throws IOException {
        new CSVParser(null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_NullFormat_ThrowsIAE() throws IOException {
        new CSVParser(new StringReader("a,b"), null);
    }

    // ---------- Constructor with offset & recordNumber ----------

    @Test
    public void testConstructor_OffsetAndRecordNumber() throws IOException {
        try (CSVParser parser = new CSVParser(new StringReader("a,b\n1,2\n"), CSVFormat.DEFAULT, 5L, 10L)) {
            CSVRecord rec = parser.nextRecord();
            assertNotNull(rec);
            assertEquals(10L, parser.getRecordNumber());
        }
    }

    // ---------- Empty input ----------

    @Test
    public void testEmptyInput_ReturnsEmptyList() throws IOException {
        try (CSVParser parser = CSVParser.parse("", CSVFormat.DEFAULT)) {
            List<CSVRecord> records = parser.getRecords();
            assertTrue(records.isEmpty());
        }
    }

    @Test
    public void testEmptyInput_NextRecordReturnsNull() throws IOException {
        try (CSVParser parser = CSVParser.parse("", CSVFormat.DEFAULT)) {
            assertNull(parser.nextRecord());
        }
    }

    // ---------- addRecordValue: trim branch ----------

    @Test
    public void testTrim_True_TrimsWhitespace() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withTrim(true);
        try (CSVParser parser = CSVParser.parse("  a  , b \n", format)) {
            CSVRecord rec = parser.nextRecord();
            assertEquals("a", rec.get(0));
            assertEquals("b", rec.get(1));
        }
    }

    @Test
    public void testTrim_False_KeepsWhitespace() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withTrim(false);
        try (CSVParser parser = CSVParser.parse("  a  , b \n", format)) {
            CSVRecord rec = parser.nextRecord();
            assertEquals("  a  ", rec.get(0));
            assertEquals(" b ", rec.get(1));
        }
    }

    // ---------- addRecordValue: trailing delimiter branch ----------

    @Test
    public void testTrailingDelimiter_True_DropsEmptyLastField() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter(true);
        try (CSVParser parser = CSVParser.parse("a,b,\n", format)) {
            CSVRecord rec = parser.nextRecord();
            assertEquals(2, rec.size());
            assertEquals("a", rec.get(0));
            assertEquals("b", rec.get(1));
        }
    }

    @Test
    public void testTrailingDelimiter_False_KeepsEmptyLastField() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter(false);
        try (CSVParser parser = CSVParser.parse("a,b,\n", format)) {
            CSVRecord rec = parser.nextRecord();
            assertEquals(3, rec.size());
            assertEquals("", rec.get(2));
        }
    }

    // ---------- addRecordValue: nullString branch ----------

    @Test
    public void testNullString_MatchingValueBecomesNull() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        try (CSVParser parser = CSVParser.parse("NULL,b\n", format)) {
            CSVRecord rec = parser.nextRecord();
            assertNull(rec.get(0));
            assertEquals("b", rec.get(1));
        }
    }

    @Test
    public void testNullString_NonMatchingValueUnchanged() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        try (CSVParser parser = CSVParser.parse("abc,b\n", format)) {
            CSVRecord rec = parser.nextRecord();
            assertEquals("abc", rec.get(0));
        }
    }

    // ---------- nextRecord: multiple lines, EOF handling ----------

    @Test
    public void testGetRecords_MultipleLines() throws IOException {
        try (CSVParser parser = CSVParser.parse("1,2\n3,4\n5,6", CSVFormat.DEFAULT)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(3, records.size());
            assertEquals("5", records.get(2).get(0));
        }
    }

    @Test
    public void testGetRecords_NoTrailingNewline_LastRecordCaptured() throws IOException {
        // EOF branch: reusableToken.isReady == true -> addRecordValue(true) called
        try (CSVParser parser = CSVParser.parse("a,b", CSVFormat.DEFAULT)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(1, records.size());
            assertEquals("b", records.get(0).get(1));
        }
    }

    // ---------- nextRecord: COMMENT branch ----------

    @Test
    public void testComment_Ignored_ButAttachedToRecord() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        try (CSVParser parser = CSVParser.parse("# this is a comment\na,b\n", format)) {
            CSVRecord rec = parser.nextRecord();
            assertNotNull(rec);
            assertEquals("a", rec.get(0));
            assertEquals("this is a comment", rec.getComment());
        }
    }

    @Test
    public void testComment_MultipleCommentLines_ConcatenatedWithLF() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        try (CSVParser parser = CSVParser.parse("# line1\n# line2\na,b\n", format)) {
            CSVRecord rec = parser.nextRecord();
            assertNotNull(rec);
            assertTrue(rec.getComment().contains("line1"));
            assertTrue(rec.getComment().contains("line2"));
        }
    }

    // ---------- initializeHeader: no header (null) ----------

    @Test
    public void testGetHeaderMap_NullWhenNoHeaderDefined() throws IOException {
        try (CSVParser parser = CSVParser.parse("a,b\n1,2\n", CSVFormat.DEFAULT)) {
            assertNull(parser.getHeaderMap());
        }
    }

    // ---------- initializeHeader: formatHeader.length == 0 (read header from first line) ----------

    @Test
    public void testHeader_ReadFromFirstLine() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader();
        try (CSVParser parser = CSVParser.parse("col1,col2\n1,2\n", format)) {
            Map<String, Integer> headerMap = parser.getHeaderMap();
            assertNotNull(headerMap);
            assertEquals(Integer.valueOf(0), headerMap.get("col1"));
            assertEquals(Integer.valueOf(1), headerMap.get("col2"));
            // header line consumed; only remaining data record left
            List<CSVRecord> records = parser.getRecords();
            assertEquals(1, records.size());
            assertEquals("1", records.get(0).get(0));
        }
    }

    @Test
    public void testHeader_ReadFromFirstLine_EmptyInput_NoHeaderMapEntries() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader();
        try (CSVParser parser = CSVParser.parse("", format)) {
            // nextRecord() returns null -> headerRecord stays null -> map stays empty (not null, but no entries)
            Map<String, Integer> headerMap = parser.getHeaderMap();
            assertNotNull(headerMap);
            assertTrue(headerMap.isEmpty());
        }
    }

    // ---------- initializeHeader: explicit header, skipHeaderRecord = false ----------

    @Test
    public void testHeader_Explicit_NoSkip_FirstDataRowNotSkipped() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("H1", "H2").withSkipHeaderRecord(false);
        try (CSVParser parser = CSVParser.parse("1,2\n3,4\n", format)) {
            Map<String, Integer> headerMap = parser.getHeaderMap();
            assertEquals(Integer.valueOf(0), headerMap.get("H1"));
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size()); // first data row not skipped
        }
    }

    // ---------- initializeHeader: explicit header, skipHeaderRecord = true ----------

    @Test
    public void testHeader_Explicit_Skip_FirstDataRowSkipped() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("H1", "H2").withSkipHeaderRecord(true);
        try (CSVParser parser = CSVParser.parse("H1,H2\n1,2\n", format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(1, records.size());
            assertEquals("1", records.get(0).get(0));
        }
    }

    // ---------- initializeHeader: duplicate header names ----------

    @Test(expected = IllegalArgumentException.class)
    public void testHeader_DuplicateNonEmptyNames_Throws() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("A", "A");
        CSVParser.parse("1,2\n", format);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHeader_DuplicateEmptyNames_AllowMissingFalse_Throws() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("", "").withAllowMissingColumnNames(false);
        CSVParser.parse("1,2\n", format);
    }

    @Test
    public void testHeader_DuplicateEmptyNames_AllowMissingTrue_NoThrow() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("", "").withAllowMissingColumnNames(true);
        try (CSVParser parser = CSVParser.parse("1,2\n", format)) {
            Map<String, Integer> headerMap = parser.getHeaderMap();
            assertNotNull(headerMap);
            // second empty header overwrote first, resulting in one entry with value 1
            assertEquals(Integer.valueOf(1), headerMap.get(""));
        }
    }

    // ---------- getHeaderMap returns a copy ----------

    @Test
    public void testGetHeaderMap_ReturnsIndependentCopy() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("A", "B");
        try (CSVParser parser = CSVParser.parse("1,2\n", format)) {
            Map<String, Integer> map1 = parser.getHeaderMap();
            map1.put("C", 99);
            Map<String, Integer> map2 = parser.getHeaderMap();
            assertFalse(map2.containsKey("C"));
        }
    }

    // ---------- ignoreHeaderCase branch ----------

    @Test
    public void testHeader_IgnoreCase_True() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("Name").withIgnoreHeaderCase(true);
        try (CSVParser parser = CSVParser.parse("value\n", format)) {
            Map<String, Integer> headerMap = parser.getHeaderMap();
            assertTrue(headerMap.containsKey("name"));
            assertTrue(headerMap.containsKey("NAME"));
        }
    }

    // ---------- isClosed / close ----------

    @Test
    public void testIsClosed_FalseInitially_TrueAfterClose() throws IOException {
        CSVParser parser = CSVParser.parse("a,b\n", CSVFormat.DEFAULT);
        assertFalse(parser.isClosed());
        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test
    public void testClose_Idempotent() throws IOException {
        CSVParser parser = CSVParser.parse("a,b\n", CSVFormat.DEFAULT);
        parser.close();
        parser.close(); // should not throw
    }

    // ---------- getCurrentLineNumber / getFirstEndOfLine / getRecordNumber ----------

    @Test
    public void testGetCurrentLineNumber_IncreasesAfterParsing() throws IOException {
        try (CSVParser parser = CSVParser.parse("a,b\nc,d\n", CSVFormat.DEFAULT)) {
            long before = parser.getCurrentLineNumber();
            parser.nextRecord();
            long after = parser.getCurrentLineNumber();
            assertTrue(after > before);
        }
    }

    @Test
    public void testGetFirstEndOfLine() throws IOException {
        try (CSVParser parser = CSVParser.parse("a,b\r\nc,d\r\n", CSVFormat.DEFAULT)) {
            parser.nextRecord();
            assertEquals("\r\n", parser.getFirstEndOfLine());
        }
    }

    @Test
    public void testGetRecordNumber_IncrementsPerRecord() throws IOException {
        try (CSVParser parser = CSVParser.parse("a\nb\nc\n", CSVFormat.DEFAULT)) {
            assertEquals(0, parser.getRecordNumber());
            parser.nextRecord();
            assertEquals(1, parser.getRecordNumber());
            parser.nextRecord();
            assertEquals(2, parser.getRecordNumber());
        }
    }

    // ---------- Iterator: hasNext / next / remove ----------

    @Test
    public void testIterator_HasNextAndNext_Basic() throws IOException {
        try (CSVParser parser = CSVParser.parse("1\n2\n", CSVFormat.DEFAULT)) {
            Iterator<CSVRecord> it = parser.iterator();
            assertTrue(it.hasNext());
            CSVRecord r1 = it.next();
            assertEquals("1", r1.get(0));
            assertTrue(it.hasNext());
            CSVRecord r2 = it.next();
            assertEquals("2", r2.get(0));
            assertFalse(it.hasNext());
        }
    }

    @Test
    public void testIterator_NextWithoutHasNext() throws IOException {
        try (CSVParser parser = CSVParser.parse("1\n", CSVFormat.DEFAULT)) {
            Iterator<CSVRecord> it = parser.iterator();
            CSVRecord r = it.next(); // hasNext() not called before
            assertEquals("1", r.get(0));
        }
    }

    @Test(expected = NoSuchElementException.class)
    public void testIterator_NextThrowsWhenExhausted() throws IOException {
        try (CSVParser parser = CSVParser.parse("1\n", CSVFormat.DEFAULT)) {
            Iterator<CSVRecord> it = parser.iterator();
            it.next();
            it.next(); // no more records -> NoSuchElementException
        }
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testIterator_RemoveThrows() throws IOException {
        try (CSVParser parser = CSVParser.parse("1\n", CSVFormat.DEFAULT)) {
            Iterator<CSVRecord> it = parser.iterator();
            it.remove();
        }
    }

    @Test
    public void testIterator_HasNextFalseWhenClosed() throws IOException {
        CSVParser parser = CSVParser.parse("1\n", CSVFormat.DEFAULT);
        parser.close();
        Iterator<CSVRecord> it = parser.iterator();
        assertFalse(it.hasNext());
    }

    @Test(expected = NoSuchElementException.class)
    public void testIterator_NextThrowsWhenClosed() throws IOException {
        CSVParser parser = CSVParser.parse("1\n", CSVFormat.DEFAULT);
        parser.close();
        Iterator<CSVRecord> it = parser.iterator();
        it.next();
    }

    // ---------- getRecords() empty-list branch when nextRecord always null ----------

    @Test
    public void testGetRecords_EmptyWhenAllWhitespaceTrimmedAway() throws IOException {
        // trim true, trailing delimiter true, single empty field -> record list can end up empty
        CSVFormat format = CSVFormat.DEFAULT.withTrim(true).withTrailingDelimiter(true);
        try (CSVParser parser = CSVParser.parse("   \n", format)) {
            CSVRecord rec = parser.nextRecord();
            // single trimmed-empty last field dropped by trailing delimiter -> record has 0 fields
            // Depending on lexer behavior, this may still produce a record with size 0.
            // We assert nextRecord() is either null or has zero-size record - documented as best-effort.
            if (rec != null) {
                assertEquals(0, rec.size());
            }
        }
    }
}
```

## ตารางสรุป Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testParseString_NullString_ThrowsIAE / NullFormat | `Assertions.notNull` throw ใน `parse(String,...)` |
| testParseFile_NullFile / NullFormat / Basic | `Assertions.notNull` ใน `parse(File,...)`, success path |
| testParseInputStream_* | `Assertions.notNull` ใน `parse(InputStream,...)`, success path |
| testParsePath_* | `Assertions.notNull` ใน `parse(Path,...)`, success path |
| testParseURL_* | `Assertions.notNull` (url/charset/format) ใน `parse(URL,...)`, success path |
| testParseReader_Basic | `parse(Reader, CSVFormat)` shortcut |
| testConstructor_NullReader / NullFormat | `Assertions.notNull` ใน constructor หลัก |
| testConstructor_OffsetAndRecordNumber | constructor พร้อม `characterOffset`, `recordNumber` |
| testEmptyInput_* | loop ใน `nextRecord()` เมื่อ EOF ทันที, `recordList.isEmpty()` -> return null |
| testTrim_True / False | branch `this.format.getTrim() ? ... : ...` ใน `addRecordValue` |
| testTrailingDelimiter_True / False | branch `lastRecord && inputClean.isEmpty() && getTrailingDelimiter()` |
| testNullString_Matching / NonMatching | branch `inputClean.equals(nullString) ? null : inputClean` |
| testGetRecords_MultipleLines | loop หลายบรรทัด, case `TOKEN`/`EORECORD` |
| testGetRecords_NoTrailingNewline | case `EOF` เมื่อ `reusableToken.isReady == true` |
| testComment_Ignored / MultipleCommentLines | case `COMMENT`, การต่อ `Constants.LF`, ตั้ง `sb` ครั้งแรก vs ครั้งต่อไป |
| testGetHeaderMap_NullWhenNoHeaderDefined | `formatHeader == null` -> `hdrMap` เป็น null |
| testHeader_ReadFromFirstLine / EmptyInput | `formatHeader.length == 0` branch, `nextRecord()!=null` / `==null` |
| testHeader_Explicit_NoSkip / Skip | `format.getSkipHeaderRecord()` true/false |
| testHeader_DuplicateNonEmptyNames_Throws | duplicate + `!emptyHeader` -> throw |
| testHeader_DuplicateEmptyNames_AllowMissingFalse_Throws | duplicate + empty + `!allowMissing` -> throw |
| testHeader_DuplicateEmptyNames_AllowMissingTrue_NoThrow | duplicate + empty + `allowMissing=true` -> no throw |
| testGetHeaderMap_ReturnsIndependentCopy | `getHeaderMap()` คืนค่า copy ใหม่ (LinkedHashMap) |
| testHeader_IgnoreCase_True | `getIgnoreHeaderCase()` -> ใช้ `TreeMap` case-insensitive |
| testIsClosed_* / testClose_Idempotent | `close()`, `isClosed()`, `lexer != null` check |
| testGetCurrentLineNumber | `getCurrentLineNumber()` |
| testGetFirstEndOfLine | `getFirstEndOfLine()` |
| testGetRecordNumber_IncrementsPerRecord | `recordNumber++` ใน `nextRecord()` |
| testIterator_HasNextAndNext_Basic | `hasNext()`/`next()` ปกติ |
| testIterator_NextWithoutHasNext | branch `next == null` ใน `next()` (เรียก `getNextRecord()` เอง) |
| testIterator_NextThrowsWhenExhausted | branch `next == null` หลังเรียก `getNextRecord()` แล้วยัง null -> throw |
| testIterator_RemoveThrows | `remove()` throw `UnsupportedOperationException` |
| testIterator_HasNextFalseWhenClosed / NextThrowsWhenClosed | branch `isClosed()` ใน `hasNext()`/`next()` |
| testGetRecords_EmptyWhenAllWhitespaceTrimmedAway | เคสขอบ (trim+trailing delimiter รวมกัน) — ผลลัพธ์ไม่แน่ใจ 100% จึงเขียนแบบ best-effort |

**หมายเหตุสำคัญ:** branch สำหรับ `case INVALID` และ `default` (Unexpected Token type) ใน `nextRecord()` ไม่ได้ทดสอบโดยตรง เนื่องจากซอร์สของ `Lexer`/`Token` ไม่ได้ให้มา ทำให้ไม่สามารถยืนยัน input ที่ trigger branch เหล่านี้ได้อย่างแน่ชัดโดยไม่เดา behavior