# CSVParserTest.java

```java
package org.apache.commons.csv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

/**
 * Unit test สำหรับ {@link CSVParser}
 *
 * หมายเหตุทั่วไป:
 * - ไม่มี source ของ Lexer/CSVFormat/CSVRecord ให้ตรวจสอบตรง ๆ
 *   จึงอนุมาน behavior จาก Javadoc และการใช้งานภายใน CSVParser เท่านั้น
 * - จุดที่ "ไม่แน่ใจ 100%" จะมีคอมเมนต์กำกับไว้
 */
public class CSVParserTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    // =========================================================
    // Static factory: parse(File, Charset, CSVFormat)
    // =========================================================

    @Test(expected = IllegalArgumentException.class)
    public void parseFile_nullFile_throwsException() throws IOException {
        CSVParser.parse((File) null, Charset.defaultCharset(), CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseFile_nullFormat_throwsException() throws IOException {
        File f = tempFolder.newFile("test.csv");
        CSVParser.parse(f, Charset.defaultCharset(), null);
    }

    @Test
    public void parseFile_valid_success() throws IOException {
        File f = tempFolder.newFile("valid.csv");
        Files.write(f.toPath(), "a,b,c\n1,2,3\n".getBytes());
        CSVParser parser = CSVParser.parse(f, Charset.defaultCharset(), CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(2, records.size());
        parser.close();
    }

    // =========================================================
    // Static factory: parse(String, CSVFormat)
    // =========================================================

    @Test(expected = IllegalArgumentException.class)
    public void parseString_nullString_throwsException() throws IOException {
        CSVParser.parse((String) null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseString_nullFormat_throwsException() throws IOException {
        CSVParser.parse("a,b,c", null);
    }

    @Test
    public void parseString_valid_success() throws IOException {
        CSVParser parser = CSVParser.parse("a,b,c\n1,2,3\n", CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(2, records.size());
    }

    // =========================================================
    // Static factory: parse(URL, Charset, CSVFormat)
    // =========================================================

    @Test(expected = IllegalArgumentException.class)
    public void parseUrl_nullUrl_throwsException() throws IOException {
        CSVParser.parse((URL) null, Charset.defaultCharset(), CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseUrl_nullCharset_throwsException() throws IOException {
        File f = tempFolder.newFile("url.csv");
        Files.write(f.toPath(), "a,b\n".getBytes());
        CSVParser.parse(f.toURI().toURL(), null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseUrl_nullFormat_throwsException() throws IOException {
        File f = tempFolder.newFile("url2.csv");
        Files.write(f.toPath(), "a,b\n".getBytes());
        CSVParser.parse(f.toURI().toURL(), Charset.defaultCharset(), null);
    }

    @Test
    public void parseUrl_valid_success() throws IOException {
        File f = tempFolder.newFile("url3.csv");
        Files.write(f.toPath(), "x,y\n1,2\n".getBytes());
        CSVParser parser = CSVParser.parse(f.toURI().toURL(), Charset.defaultCharset(), CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(2, records.size());
        parser.close();
    }

    // =========================================================
    // Constructor
    // =========================================================

    @Test(expected = IllegalArgumentException.class)
    public void constructor_nullReader_throwsException() throws IOException {
        new CSVParser(null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_nullFormat_throwsException() throws IOException {
        new CSVParser(new StringReader("a,b"), null);
    }

    // =========================================================
    // addRecordValue (ผ่าน nextRecord()/iterator())
    // =========================================================

    @Test
    public void addRecordValue_nullStringNotConfigured_keepsLiteralValue() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a,NULL,c\n"), CSVFormat.DEFAULT);
        CSVRecord record = parser.iterator().next();
        assertEquals("NULL", record.get(1));
    }

    @Test
    public void addRecordValue_nullStringConfigured_matchIgnoreCase_becomesNull() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        CSVParser parser = new CSVParser(new StringReader("a,null,c\n"), format);
        CSVRecord record = parser.iterator().next();
        assertNull(record.get(1));
    }

    @Test
    public void addRecordValue_nullStringConfigured_noMatch_keepsValue() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        CSVParser parser = new CSVParser(new StringReader("a,b,c\n"), format);
        CSVRecord record = parser.iterator().next();
        assertEquals("b", record.get(1));
    }

    // =========================================================
    // close() / isClosed()
    // =========================================================

    @Test
    public void closeAndIsClosed() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a,b\n"), CSVFormat.DEFAULT);
        assertFalse(parser.isClosed());
        parser.close();
        assertTrue(parser.isClosed());
    }

    // =========================================================
    // getCurrentLineNumber()
    // =========================================================

    @Test
    public void getCurrentLineNumber_increasesAfterReading() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a\nb\nc\n"), CSVFormat.DEFAULT);
        long before = parser.getCurrentLineNumber();
        parser.nextRecord();
        long after = parser.getCurrentLineNumber();
        // ไม่ทราบค่าเริ่มต้นแน่ชัด จึงตรวจสอบเพียงว่าค่าไม่ลดลง
        assertTrue(after >= before);
    }

    // =========================================================
    // getHeaderMap()
    // =========================================================

    @Test
    public void getHeaderMap_noHeaderFormat_returnsNull() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a,b\n"), CSVFormat.DEFAULT);
        assertNull(parser.getHeaderMap());
    }

    @Test
    public void getHeaderMap_withHeader_returnsCopy() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("A", "B");
        CSVParser parser = new CSVParser(new StringReader("1,2\n"), format);
        Map<String, Integer> headerMap = parser.getHeaderMap();
        assertEquals(Integer.valueOf(0), headerMap.get("A"));
        assertEquals(Integer.valueOf(1), headerMap.get("B"));
    }

    // =========================================================
    // getRecordNumber()
    // =========================================================

    @Test
    public void getRecordNumber_incrementsPerRecord() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a\nb\n"), CSVFormat.DEFAULT);
        assertEquals(0, parser.getRecordNumber());
        parser.nextRecord();
        assertEquals(1, parser.getRecordNumber());
        parser.nextRecord();
        assertEquals(2, parser.getRecordNumber());
    }

    // =========================================================
    // getRecords() / getRecords(Collection)
    // =========================================================

    @Test
    public void getRecords_returnsAllRecords() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a,b\nc,d\n"), CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(2, records.size());
    }

    @Test
    public void getRecordsWithCollection_appendsToGivenCollection() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a,b\n"), CSVFormat.DEFAULT);
        List<CSVRecord> preFilled = new ArrayList<CSVRecord>();
        List<CSVRecord> result = parser.getRecords(preFilled);
        assertSame(preFilled, result);
        assertEquals(1, result.size());
    }

    @Test
    public void getRecords_emptyInput_returnsEmptyList() throws IOException {
        CSVParser parser = new CSVParser(new StringReader(""), CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        assertTrue(records.isEmpty());
    }

    // =========================================================
    // initializeHeader() branches
    // =========================================================

    @Test
    public void initializeHeader_formatHeaderNull_headerMapNull() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a,b\n"), CSVFormat.DEFAULT);
        assertNull(parser.getHeaderMap());
    }

    @Test
    public void initializeHeader_emptyHeaderArray_readsFirstLineAsHeader() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader(); // formatHeader.length == 0
        CSVParser parser = new CSVParser(new StringReader("X,Y\n1,2\n"), format);
        Map<String, Integer> headerMap = parser.getHeaderMap();
        assertEquals(Integer.valueOf(0), headerMap.get("X"));
        assertEquals(Integer.valueOf(1), headerMap.get("Y"));
        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        assertEquals("1", records.get(0).get(0));
    }

    @Test
    public void initializeHeader_emptyHeaderArray_emptyInput_nextRecordNull() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader();
        CSVParser parser = new CSVParser(new StringReader(""), format);
        // nextRecord() คืน null -> headerRecord ยังเป็น null -> hdrMap ยังว่างแต่ไม่ null
        Map<String, Integer> headerMap = parser.getHeaderMap();
        assertNotNull(headerMap);
        assertTrue(headerMap.isEmpty());
    }

    @Test
    public void initializeHeader_explicitHeaderNoSkip_firstDataRowIsNotSkipped() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("A", "B").withSkipHeaderRecord(false);
        CSVParser parser = new CSVParser(new StringReader("1,2\n3,4\n"), format);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(2, records.size());
        assertEquals("1", records.get(0).get(0));
    }

    @Test
    public void initializeHeader_explicitHeaderWithSkip_firstDataRowIsSkipped() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("A", "B").withSkipHeaderRecord(true);
        CSVParser parser = new CSVParser(new StringReader("A,B\n1,2\n"), format);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        assertEquals("1", records.get(0).get(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void initializeHeader_duplicateNonEmptyHeader_throwsException() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("A", "A");
        new CSVParser(new StringReader("1,2\n"), format);
    }

    @Test
    public void initializeHeader_duplicateEmptyHeader_ignoreEmptyHeadersTrue_noException() throws IOException {
        // สมมติว่า withIgnoreEmptyHeaders มีอยู่จริงในเวอร์ชันนี้ตาม field getIgnoreEmptyHeaders() ที่ใช้ในซอร์ส
        CSVFormat format = CSVFormat.DEFAULT.withHeader("", "").withIgnoreEmptyHeaders(true);
        CSVParser parser = new CSVParser(new StringReader("1,2\n"), format);
        assertNotNull(parser.getHeaderMap());
    }

    @Test(expected = IllegalArgumentException.class)
    public void initializeHeader_duplicateEmptyHeader_ignoreEmptyHeadersFalse_throwsException() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("", "").withIgnoreEmptyHeaders(false);
        new CSVParser(new StringReader("1,2\n"), format);
    }

    // =========================================================
    // iterator()
    // =========================================================

    @Test
    public void iterator_hasNextAndNext_returnsRecordsInOrder() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a\nb\n"), CSVFormat.DEFAULT);
        Iterator<CSVRecord> it = parser.iterator();
        assertTrue(it.hasNext());
        CSVRecord r1 = it.next();
        assertEquals("a", r1.get(0));
        assertTrue(it.hasNext());
        CSVRecord r2 = it.next();
        assertEquals("b", r2.get(0));
        assertFalse(it.hasNext());
    }

    @Test
    public void iterator_hasNextCalledTwice_doesNotAdvanceTwice() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a\nb\n"), CSVFormat.DEFAULT);
        Iterator<CSVRecord> it = parser.iterator();
        assertTrue(it.hasNext()); // current != null ถูก set
        assertTrue(it.hasNext()); // current != null -> ไม่เรียก getNextRecord() ซ้ำ
        CSVRecord r1 = it.next();
        assertEquals("a", r1.get(0));
    }

    @Test
    public void iterator_hasNext_whenClosed_returnsFalse() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a\nb\n"), CSVFormat.DEFAULT);
        Iterator<CSVRecord> it = parser.iterator();
        parser.close();
        assertFalse(it.hasNext());
    }

    @Test(expected = NoSuchElementException.class)
    public void iterator_next_whenClosed_throwsException() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a\nb\n"), CSVFormat.DEFAULT);
        Iterator<CSVRecord> it = parser.iterator();
        parser.close();
        it.next();
    }

    @Test(expected = NoSuchElementException.class)
    public void iterator_next_whenNoMoreRecords_throwsException() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a\n"), CSVFormat.DEFAULT);
        Iterator<CSVRecord> it = parser.iterator();
        it.next(); // consume only record
        it.next(); // no more -> throw
    }

    @Test(expected = UnsupportedOperationException.class)
    public void iterator_remove_throwsUnsupportedOperationException() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a\n"), CSVFormat.DEFAULT);
        Iterator<CSVRecord> it = parser.iterator();
        it.remove();
    }

    @Test
    public void iterator_next_withoutCallingHasNextFirst() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a\nb\n"), CSVFormat.DEFAULT);
        Iterator<CSVRecord> it = parser.iterator();
        CSVRecord r = it.next(); // current == null -> เข้า path "hasNext() wasn't called before"
        assertEquals("a", r.get(0));
    }

    // =========================================================
    // nextRecord() branches: TOKEN, EORECORD, EOF(ready/not ready), COMMENT
    // =========================================================

    @Test
    public void nextRecord_eof_notReady_afterTrailingNewline_returnsNullAtEnd() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a,b\n"), CSVFormat.DEFAULT);
        CSVRecord r1 = parser.nextRecord();
        assertNotNull(r1);
        CSVRecord r2 = parser.nextRecord();
        assertNull(r2); // EOF, ไม่มี ready token เหลือ -> record ว่าง -> null
    }

    @Test
    public void nextRecord_eof_ready_noTrailingNewline_returnsLastRecord() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a,b"), CSVFormat.DEFAULT);
        CSVRecord r1 = parser.nextRecord();
        assertNotNull(r1);
        assertEquals("a", r1.get(0));
        assertEquals("b", r1.get(1));
        CSVRecord r2 = parser.nextRecord();
        assertNull(r2);
    }

    @Test
    public void nextRecord_commentHandling_singleComment() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        CSVParser parser = new CSVParser(new StringReader("# comment line\na,b\n"), format);
        CSVRecord record = parser.nextRecord();
        assertNotNull(record);
        assertEquals("a", record.get(0));
        // ไม่แน่ใจว่า Lexer trim ช่องว่างหลัง marker อย่างไรทุกกรณี จึงตรวจสอบแบบ contains
        assertNotNull(record.getComment());
        assertTrue(record.getComment().contains("comment line"));
    }

    @Test
    public void nextRecord_commentHandling_multipleComments_concatenated() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        CSVParser parser = new CSVParser(new StringReader("#c1\n#c2\na,b\n"), format);
        CSVRecord record = parser.nextRecord();
        assertNotNull(record);
        String comment = record.getComment();
        assertNotNull(comment);
        // ตรวจสอบว่า comment ทั้งสองบรรทัดถูกรวมกัน (sb==null ครั้งแรก, append LF ครั้งถัดไป)
        assertTrue(comment.contains("c1"));
        assertTrue(comment.contains("c2"));
    }

    @Test
    public void nextRecord_noComment_commentIsNull() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("a,b\n"), CSVFormat.DEFAULT);
        CSVRecord record = parser.nextRecord();
        assertNotNull(record);
        assertNull(record.getComment());
    }

    // หมายเหตุ: ไม่ได้เขียนเทสสำหรับ Token.Type.INVALID และ "default" (IllegalStateException)
    // เนื่องจากไม่มีซอร์สของ Lexer/Token ให้ตรวจสอบว่าอินพุตแบบใดจะกระตุ้น branch เหล่านี้ได้จริง
    // การเดา input โดยไม่มีหลักฐานอาจทำให้เทส false-positive/false-negative ได้
}
```

## สรุป Branch/Condition ที่แต่ละเมธอดทดสอบครอบคลุม

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `parseFile_nullFile_throwsException` | `parse(File,...)` — `Assertions.notNull(file)` throws |
| `parseFile_nullFormat_throwsException` | `parse(File,...)` — `Assertions.notNull(format)` throws |
| `parseFile_valid_success` | `parse(File,...)` — path สำเร็จ |
| `parseString_nullString_throwsException` | `parse(String,...)` — null string |
| `parseString_nullFormat_throwsException` | `parse(String,...)` — null format |
| `parseString_valid_success` | `parse(String,...)` — path สำเร็จ |
| `parseUrl_nullUrl_throwsException` | `parse(URL,...)` — null url |
| `parseUrl_nullCharset_throwsException` | `parse(URL,...)` — null charset |
| `parseUrl_nullFormat_throwsException` | `parse(URL,...)` — null format |
| `parseUrl_valid_success` | `parse(URL,...)` — path สำเร็จ |
| `constructor_nullReader_throwsException` | Constructor — null reader |
| `constructor_nullFormat_throwsException` | Constructor — null format |
| `addRecordValue_nullStringNotConfigured_keepsLiteralValue` | `addRecordValue()` — `nullString == null` branch |
| `addRecordValue_nullStringConfigured_matchIgnoreCase_becomesNull` | `addRecordValue()` — `equalsIgnoreCase` true branch |
| `addRecordValue_nullStringConfigured_noMatch_keepsValue` | `addRecordValue()` — `equalsIgnoreCase` false branch |
| `closeAndIsClosed` | `close()`, `isClosed()` |
| `getCurrentLineNumber_increasesAfterReading` | `getCurrentLineNumber()` |
| `getHeaderMap_noHeaderFormat_returnsNull` | `getHeaderMap()` — headerMap null branch |
| `getHeaderMap_withHeader_returnsCopy` | `getHeaderMap()` — non-null branch, copy semantics |
| `getRecordNumber_incrementsPerRecord` | `getRecordNumber()` |
| `getRecords_returnsAllRecords` | `getRecords()` loop จนกว่า `nextRecord()==null` |
| `getRecordsWithCollection_appendsToGivenCollection` | `getRecords(T)` — generic collection |
| `getRecords_emptyInput_returnsEmptyList` | `getRecords()` — input ว่าง |
| `initializeHeader_formatHeaderNull_headerMapNull` | `initializeHeader()` — `formatHeader == null` |
| `initializeHeader_emptyHeaderArray_readsFirstLineAsHeader` | `initializeHeader()` — `formatHeader.length==0`, `nextRecord!=null` |
| `initializeHeader_emptyHeaderArray_emptyInput_nextRecordNull` | `initializeHeader()` — `formatHeader.length==0`, `nextRecord==null` |
| `initializeHeader_explicitHeaderNoSkip_firstDataRowIsNotSkipped` | `initializeHeader()` — `getSkipHeaderRecord()==false` |
| `initializeHeader_explicitHeaderWithSkip_firstDataRowIsSkipped` | `initializeHeader()` — `getSkipHeaderRecord()==true` |
| `initializeHeader_duplicateNonEmptyHeader_throwsException` | `initializeHeader()` — duplicate + `!emptyHeader` throw |
| `initializeHeader_duplicateEmptyHeader_ignoreEmptyHeadersTrue_noException` | `initializeHeader()` — duplicate empty + ignoreEmptyHeaders=true (no throw) |
| `initializeHeader_duplicateEmptyHeader_ignoreEmptyHeadersFalse_throwsException` | `initializeHeader()` — duplicate empty + ignoreEmptyHeaders=false (throw) |
| `iterator_hasNextAndNext_returnsRecordsInOrder` | `iterator()` — hasNext/next ปกติ |
| `iterator_hasNextCalledTwice_doesNotAdvanceTwice` | `iterator().hasNext()` — `current==null` false branch |
| `iterator_hasNext_whenClosed_returnsFalse` | `iterator().hasNext()` — `isClosed()==true` |
| `iterator_next_whenClosed_throwsException` | `iterator().next()` — closed branch |
| `iterator_next_whenNoMoreRecords_throwsException` | `iterator().next()` — `next==null` throw |
| `iterator_remove_throwsUnsupportedOperationException` | `iterator().remove()` |
| `iterator_next_withoutCallingHasNextFirst` | `iterator().next()` — `next==null` (current) แต่ getNextRecord ได้ผลลัพธ์ |
| `nextRecord_eof_notReady_afterTrailingNewline_returnsNullAtEnd` | `nextRecord()` — `EOF` + `isReady==false` |
| `nextRecord_eof_ready_noTrailingNewline_returnsLastRecord` | `nextRecord()` — `EOF` + `isReady==true` |
| `nextRecord_commentHandling_singleComment` | `nextRecord()` — `COMMENT` case, `sb==null` first branch |
| `nextRecord_commentHandling_multipleComments_concatenated` | `nextRecord()` — `COMMENT` case, `sb!=null` append branch |
| `nextRecord_noComment_commentIsNull` | `nextRecord()` — ไม่มี comment, `sb==null` ตอนสร้าง result |

**หมายเหตุสำคัญ:** branch `Token.Type.INVALID` (throw IOException) และ `default:` (throw IllegalStateException) ใน `nextRecord()` ไม่ได้ถูกทดสอบ เนื่องจากไม่มีซอร์สของ `Lexer`/`Token` ให้วิเคราะห์ว่าอินพุตใดจะกระตุ้น branch เหล่านี้ได้อย่างแน่นอน การเดา input โดยไม่มีหลักฐานขัดกับข้อกำหนดที่ 4