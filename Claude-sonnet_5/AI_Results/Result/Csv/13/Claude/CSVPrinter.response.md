# CSVPrinterTest.java

หมายเหตุสำคัญก่อนเริ่ม: เนื่องจากซอร์สของ `CSVFormat` ไม่ได้ให้มาด้วย ผมอ้างอิง API ของ `CSVFormat`/`QuoteMode` จาก commons-csv 1.0 (ตรงกับ `csv-1.0.jar` ที่อยู่ใน classpath) ได้แก่ `CSVFormat.newFormat(char)`, `withDelimiter`, `withQuote`, `withEscape`, `withCommentMarker`, `withHeader`, `withHeaderComments`, `withNullString`, `withQuoteMode`, `withRecordSeparator`, `withSkipHeaderRecord()` (no-arg) — จุดที่ไม่แน่ใจ 100% ได้ทำคอมเมนต์กำกับไว้ในโค้ด

```java
package org.apache.commons.csv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests สำหรับ {@link CSVPrinter} (Defects4J: Csv-13b)
 *
 * หมายเหตุ: บาง overload ของ CSVFormat (เช่น withSkipHeaderRecord() แบบ no-arg)
 * ถูกสมมติจาก commons-csv 1.0 API เนื่องจากซอร์ส CSVFormat ไม่ได้ให้มา
 */
public class CSVPrinterTest {

    /**
     * Appendable ปลอมที่ implement ทั้ง Closeable และ Flushable
     * เพื่อยืนยันว่า close()/flush() ของ CSVPrinter เรียกลงไปจริง
     */
    private static class TrackingAppendable implements Appendable, Closeable, Flushable {
        final StringBuilder sb = new StringBuilder();
        boolean closed = false;
        boolean flushed = false;

        @Override
        public Appendable append(CharSequence csq) throws IOException {
            sb.append(csq);
            return this;
        }

        @Override
        public Appendable append(CharSequence csq, int start, int end) throws IOException {
            sb.append(csq, start, end);
            return this;
        }

        @Override
        public Appendable append(char c) throws IOException {
            sb.append(c);
            return this;
        }

        @Override
        public void close() throws IOException {
            closed = true;
        }

        @Override
        public void flush() throws IOException {
            flushed = true;
        }

        @Override
        public String toString() {
            return sb.toString();
        }
    }

    // ==================== Constructor ====================

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_NullOut_Throws() throws IOException {
        new CSVPrinter(null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_NullFormat_Throws() throws IOException {
        new CSVPrinter(new StringBuilder(), null);
    }

    @Test
    public void testConstructor_NoHeaderNoComments_NoOutput() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',').withRecordSeparator("\n");
        new CSVPrinter(sb, format);
        assertEquals("", sb.toString());
    }

    @Test
    public void testConstructor_HeaderComments_PrintsComments_SkipsNull() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',')
                .withRecordSeparator("\n")
                .withCommentMarker('#')
                .withHeaderComments("Comment1", null, "Comment2");
        new CSVPrinter(sb, format);
        assertEquals("# Comment1\n# Comment2\n", sb.toString());
    }

    @Test
    public void testConstructor_Header_NotSkipped_PrintsHeaderRecord() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',')
                .withRecordSeparator("\n")
                .withHeader("H1", "H2");
        new CSVPrinter(sb, format);
        assertEquals("H1,H2\n", sb.toString());
    }

    @Test
    public void testConstructor_Header_Skipped_NoHeaderOutput() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',')
                .withRecordSeparator("\n")
                .withHeader("H1", "H2")
                .withSkipHeaderRecord(); // assumption: no-arg overload ตาม commons-csv 1.0
        new CSVPrinter(sb, format);
        assertEquals("", sb.toString());
    }

    @Test
    public void testGetOut_ReturnsSameAppendable() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(sb, CSVFormat.newFormat(','));
        assertSame(sb, printer.getOut());
    }

    // ==================== close() / flush() ====================

    @Test
    public void testClose_CallsCloseable() throws IOException {
        TrackingAppendable ta = new TrackingAppendable();
        CSVPrinter printer = new CSVPrinter(ta, CSVFormat.newFormat(','));
        printer.close();
        assertTrue(ta.closed);
    }

    @Test
    public void testClose_NonCloseable_NoOp() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(sb, CSVFormat.newFormat(','));
        printer.close(); // ต้องไม่ throw
    }

    @Test
    public void testFlush_CallsFlushable() throws IOException {
        TrackingAppendable ta = new TrackingAppendable();
        CSVPrinter printer = new CSVPrinter(ta, CSVFormat.newFormat(','));
        printer.flush();
        assertTrue(ta.flushed);
    }

    @Test
    public void testFlush_NonFlushable_NoOp() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(sb, CSVFormat.newFormat(','));
        printer.flush(); // ต้องไม่ throw
    }

    // ==================== print(Object) ====================

    @Test
    public void testPrint_NullValue_DefaultNullString_EmptyOutput() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',').withRecordSeparator("\n");
        CSVPrinter printer = new CSVPrinter(sb, format);
        printer.printRecord((Object) null);
        assertEquals("\n", sb.toString());
    }

    @Test
    public void testPrint_NullValue_CustomNullString() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',').withRecordSeparator("\n").withNullString("NULL");
        CSVPrinter printer = new CSVPrinter(sb, format);
        printer.printRecord((Object) null);
        assertEquals("NULL\n", sb.toString());
    }

    @Test
    public void testPrint_NonNullValue_UsesToString() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',').withRecordSeparator("\n");
        CSVPrinter printer = new CSVPrinter(sb, format);
        printer.printRecord(123);
        assertEquals("123\n", sb.toString());
    }

    @Test
    public void testPrint_DelimiterBetweenMultipleValues() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',').withRecordSeparator("\n");
        CSVPrinter printer = new CSVPrinter(sb, format);
        printer.printRecord("a", "b", "c");
        assertEquals("a,b,c\n", sb.toString());
    }

    // ==================== printAndEscape ====================

    @Test
    public void testPrintAndEscape_EscapesSpecialChars() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',').withRecordSeparator("\n").withEscape('\\');
        CSVPrinter printer = new CSVPrinter(sb, format);
        printer.printRecord("a,b\r\nc\\d");
        assertEquals("a\\,b\\r\\nc\\\\d\n", sb.toString());
    }

    // ==================== printAndQuote: QuoteMode.ALL ====================

    @Test
    public void testPrintAndQuote_ALL_AlwaysQuotes() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',').withRecordSeparator("\n")
                .withQuote('"').withQuoteMode(QuoteMode.ALL);
        CSVPrinter printer = new CSVPrinter(sb, format);
        printer.printRecord("abc");
        assertEquals("\"abc\"\n", sb.toString());
    }

    // ==================== printAndQuote: QuoteMode.NON_NUMERIC ====================

    @Test
    public void testPrintAndQuote_NonNumeric_QuotesString() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',').withRecordSeparator("\n")
                .withQuote('"').withQuoteMode(QuoteMode.NON_NUMERIC);
        CSVPrinter printer = new CSVPrinter(sb, format);
        printer.printRecord("abc");
        assertEquals("\"abc\"\n", sb.toString());
    }

    @Test
    public void testPrintAndQuote_NonNumeric_DoesNotQuoteNumber() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',').withRecordSeparator("\n")
                .withQuote('"').withQuoteMode(QuoteMode.NON_NUMERIC);
        CSVPrinter printer = new CSVPrinter(sb, format);
        printer.printRecord(123);
        assertEquals("123\n", sb.toString());
    }

    // ==================== printAndQuote: QuoteMode.NONE (delegate to escape) ====================

    @Test
    public void testPrintAndQuote_None_DelegatesToEscape() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',').withRecordSeparator("\n")
                .withQuote('"').withEscape('\\').withQuoteMode(QuoteMode.NONE);
        CSVPrinter printer = new CSVPrinter(sb, format);
        printer.printRecord("a,b");
        assertEquals("a\\,b\n", sb.toString());
    }

    // ==================== printAndQuote: QuoteMode.MINIMAL ====================

    @Test
    public void testPrintAndQuote_Minimal_EmptyFirstToken_Quoted() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',').withRecordSeparator("\n").withQuote('"');
        CSVPrinter printer = new CSVPrinter(sb, format);
        printer.printRecord("");
        assertEquals("\"\"\n", sb.toString());
    }

    @Test
    public void testPrintAndQuote_Minimal_EmptyNonFirstToken_NotQuoted() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',').withRecordSeparator("\n").withQuote('"');
        CSVPrinter printer = new CSVPrinter(sb, format);
        printer.printRecord("a", "");
        assertEquals("a,\n", sb.toString());
    }

    @Test
    public void testPrintAndQuote_Minimal_StartCharBelowZero_Quoted() throws IOException {
        // '!' (33) < '0' (48)
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',').withRecordSeparator("\n").withQuote('"');
        CSVPrinter printer = new CSVPrinter(sb, format);
        printer.printRecord("!abc");
        assertEquals("\"!abc\"\n", sb.toString());
    }

    @Test
    public void testPrintAndQuote_Minimal_StartCharBetween9AndA_Quoted() throws IOException {
        // ':' (58) > '9'(57) และ < 'A'(65)
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',').withRecordSeparator("\n").withQuote('"');
        CSVPrinter printer = new CSVPrinter(sb, format);
        printer.printRecord(":abc");
        assertEquals("\":abc\"\n", sb.toString());
    }

    @Test
    public void testPrintAndQuote_Minimal_StartCharBetweenZAndA_Quoted() throws IOException {
        // '[' (91) > 'Z'(90) และ < 'a'(97)
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',').withRecordSeparator("\n").withQuote('"');
        CSVPrinter printer = new CSVPrinter(sb, format);
        printer.printRecord("[abc");
        assertEquals("\"[abc\"\n", sb.toString());
    }

    @Test
    public void testPrintAndQuote_Minimal_StartCharAboveZ_Quoted() throws IOException {
        // '{' (123) > 'z'(122)
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',').withRecordSeparator("\n").withQuote('"');
        CSVPrinter printer = new CSVPrinter(sb, format);
        printer.printRecord("{abc");
        assertEquals("\"{abc\"\n", sb.toString());
    }

    @Test
    public void testPrintAndQuote_Minimal_NotFirstField_CommentCharAtStart_Quoted() throws IOException {
        // branch: newRecord == false และ c <= COMMENT('#')
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',').withRecordSeparator("\n").withQuote('"');
        CSVPrinter printer = new CSVPrinter(sb, format);
        printer.printRecord("first", "#second");
        assertEquals("first,\"#second\"\n", sb.toString());
    }

    @Test
    public void testPrintAndQuote_Minimal_NormalValue_NoQuote() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',').withRecordSeparator("\n").withQuote('"');
        CSVPrinter printer = new CSVPrinter(sb, format);
        printer.printRecord("abc");
        assertEquals("abc\n", sb.toString());
    }

    @Test
    public void testPrintAndQuote_Minimal_ContainsDelimiter_Quoted() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',').withRecordSeparator("\n").withQuote('"');
        CSVPrinter printer = new CSVPrinter(sb, format);
        printer.printRecord("a,bc");
        assertEquals("\"a,bc\"\n", sb.toString());
    }

    @Test
    public void testPrintAndQuote_Minimal_ContainsLF_Quoted() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',').withRecordSeparator("\n").withQuote('"');
        CSVPrinter printer = new CSVPrinter(sb, format);
        printer.printRecord("a\nbc");
        assertEquals("\"a\nbc\"\n", sb.toString());
    }

    @Test
    public void testPrintAndQuote_Minimal_EndsWithSpace_Quoted() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',').withRecordSeparator("\n").withQuote('"');
        CSVPrinter printer = new CSVPrinter(sb, format);
        printer.printRecord("ab ");
        assertEquals("\"ab \"\n", sb.toString());
    }

    @Test
    public void testPrintAndQuote_Minimal_ContainsQuoteChar_DoublesQuote() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',').withRecordSeparator("\n").withQuote('"');
        CSVPrinter printer = new CSVPrinter(sb, format);
        printer.printRecord("a\"b");
        assertEquals("\"a\"\"b\"\n", sb.toString());
    }

    // ==================== printComment ====================

    @Test
    public void testPrintComment_Disabled_NoOutput() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',').withRecordSeparator("\n");
        CSVPrinter printer = new CSVPrinter(sb, format);
        printer.printComment("hello");
        assertEquals("", sb.toString());
    }

    @Test
    public void testPrintComment_SingleLine() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',').withRecordSeparator("\n").withCommentMarker('#');
        CSVPrinter printer = new CSVPrinter(sb, format);
        printer.printComment("hello");
        assertEquals("# hello\n", sb.toString());
    }

    @Test
    public void testPrintComment_WhenNotNewRecord_PrintsNewlineFirst() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',').withRecordSeparator("\n").withCommentMarker('#');
        CSVPrinter printer = new CSVPrinter(sb, format);
        printer.print("x");
        printer.printComment("hello");
        assertEquals("x\n# hello\n", sb.toString());
    }

    @Test
    public void testPrintComment_MultilineWithLF() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',').withRecordSeparator("\n").withCommentMarker('#');
        CSVPrinter printer = new CSVPrinter(sb, format);
        printer.printComment("line1\nline2");
        assertEquals("# line1\n# line2\n", sb.toString());
    }

    @Test
    public void testPrintComment_WithCRLF_TreatedAsSingleNewline() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',').withRecordSeparator("\n").withCommentMarker('#');
        CSVPrinter printer = new CSVPrinter(sb, format);
        printer.printComment("line1\r\nline2");
        assertEquals("# line1\n# line2\n", sb.toString());
    }

    @Test
    public void testPrintComment_WithCROnly() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',').withRecordSeparator("\n").withCommentMarker('#');
        CSVPrinter printer = new CSVPrinter(sb, format);
        printer.printComment("line1\rline2");
        assertEquals("# line1\n# line2\n", sb.toString());
    }

    // ==================== println ====================

    @Test
    public void testPrintln_WithRecordSeparator() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',').withRecordSeparator("\r\n");
        CSVPrinter printer = new CSVPrinter(sb, format);
        printer.println();
        assertEquals("\r\n", sb.toString());
    }

    @Test
    public void testPrintln_NullRecordSeparator_NoAppend() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(','); // recordSeparator = null
        CSVPrinter printer = new CSVPrinter(sb, format);
        printer.println();
        assertEquals("", sb.toString());
        // ยืนยันว่า newRecord ถูกตั้งเป็น true แม้ไม่ append: print ครั้งต่อไปไม่มี delimiter นำหน้า
        printer.print("x");
        assertEquals("x", sb.toString());
    }

    // ==================== printRecord(Iterable) / printRecord(Object...) ====================

    @Test
    public void testPrintRecord_Iterable() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',').withRecordSeparator("\n");
        CSVPrinter printer = new CSVPrinter(sb, format);
        printer.printRecord(Arrays.asList("a", "b", "c"));
        assertEquals("a,b,c\n", sb.toString());
    }

    @Test
    public void testPrintRecord_ObjectArray() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',').withRecordSeparator("\n");
        CSVPrinter printer = new CSVPrinter(sb, format);
        printer.printRecord("a", "b", "c");
        assertEquals("a,b,c\n", sb.toString());
    }

    // ==================== printRecords(Iterable) ====================

    @Test
    public void testPrintRecords_Iterable_WithNestedObjectArray() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',').withRecordSeparator("\n");
        CSVPrinter printer = new CSVPrinter(sb, format);
        List<Object> data = new ArrayList<Object>();
        data.add(new String[] { "A", "B" });
        printer.printRecords(data);
        assertEquals("A,B\n", sb.toString());
    }

    @Test
    public void testPrintRecords_Iterable_WithNestedIterable() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',').withRecordSeparator("\n");
        CSVPrinter printer = new CSVPrinter(sb, format);
        List<Object> data = new ArrayList<Object>();
        data.add(Arrays.asList("A", "B"));
        printer.printRecords(data);
        assertEquals("A,B\n", sb.toString());
    }

    @Test
    public void testPrintRecords_Iterable_WithPlainObject() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',').withRecordSeparator("\n");
        CSVPrinter printer = new CSVPrinter(sb, format);
        List<Object> data = new ArrayList<Object>();
        data.add("A");
        data.add("B");
        printer.printRecords(data);
        assertEquals("A\nB\n", sb.toString());
    }

    // ==================== printRecords(Object...) ====================

    @Test
    public void testPrintRecords_ObjectArray_WithNestedArraysAndIterables() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',').withRecordSeparator("\n");
        CSVPrinter printer = new CSVPrinter(sb, format);
        printer.printRecords(new String[] { "A", "B" }, Arrays.asList("1", "2"), "plain");
        assertEquals("A,B\n1,2\nplain\n", sb.toString());
    }

    // ==================== printRecords(ResultSet) ====================

    @Test
    public void testPrintRecords_ResultSet_MultipleRows() throws IOException, SQLException {
        ResultSet rs = mock(ResultSet.class);
        ResultSetMetaData rsmd = mock(ResultSetMetaData.class);
        when(rs.getMetaData()).thenReturn(rsmd);
        when(rsmd.getColumnCount()).thenReturn(2);
        when(rs.next()).thenReturn(true, true, false);
        when(rs.getObject(1)).thenReturn("r1c1", "r2c1");
        when(rs.getObject(2)).thenReturn("r1c2", "r2c2");

        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',').withRecordSeparator("\n");
        CSVPrinter printer = new CSVPrinter(sb, format);
        printer.printRecords(rs);
        assertEquals("r1c1,r1c2\nr2c1,r2c2\n", sb.toString());
    }

    @Test
    public void testPrintRecords_ResultSet_NoRows() throws IOException, SQLException {
        ResultSet rs = mock(ResultSet.class);
        ResultSetMetaData rsmd = mock(ResultSetMetaData.class);
        when(rs.getMetaData()).thenReturn(rsmd);
        when(rsmd.getColumnCount()).thenReturn(2);
        when(rs.next()).thenReturn(false);

        StringBuilder sb = new StringBuilder();
        CSVFormat format = CSVFormat.newFormat(',').withRecordSeparator("\n");
        CSVPrinter printer = new CSVPrinter(sb, format);
        printer.printRecords(rs);
        assertEquals("", sb.toString());
    }
}
```

## ตารางสรุป Test method → Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testConstructor_NullOut_Throws | `Assertions.notNull(out,...)` → throw เมื่อ out null |
| testConstructor_NullFormat_Throws | `Assertions.notNull(format,...)` → throw เมื่อ format null |
| testConstructor_NoHeaderNoComments_NoOutput | `headerComments==null`, `header==null` → ไม่มี output |
| testConstructor_HeaderComments_PrintsComments_SkipsNull | loop headerComments, `if(line!=null)` true/false branch |
| testConstructor_Header_NotSkipped_PrintsHeaderRecord | `header!=null && !skipHeaderRecord` true |
| testConstructor_Header_Skipped_NoHeaderOutput | `!skipHeaderRecord` false (skip=true) |
| testGetOut_ReturnsSameAppendable | `getOut()` คืน field ตรง |
| testClose_CallsCloseable / testClose_NonCloseable_NoOp | `out instanceof Closeable` true/false |
| testFlush_CallsFlushable / testFlush_NonFlushable_NoOp | `out instanceof Flushable` true/false |
| testPrint_NullValue_DefaultNullString_EmptyOutput | `value==null` + `nullString==null` |
| testPrint_NullValue_CustomNullString | `value==null` + `nullString!=null` |
| testPrint_NonNullValue_UsesToString | `value!=null` branch |
| testPrint_DelimiterBetweenMultipleValues | `!newRecord` true (delimiter insertion) |
| testPrintAndEscape_EscapesSpecialChars | escape branch: CR, LF, delimiter, escape char, `pos>start` true/false |
| testPrintAndQuote_ALL_AlwaysQuotes | `case ALL` |
| testPrintAndQuote_NonNumeric_QuotesString / DoesNotQuoteNumber | `case NON_NUMERIC`, `!(object instanceof Number)` true/false |
| testPrintAndQuote_None_DelegatesToEscape | `case NONE` → เรียก printAndEscape |
| testPrintAndQuote_Minimal_EmptyFirstToken_Quoted | `len<=0 && newRecord` true |
| testPrintAndQuote_Minimal_EmptyNonFirstToken_NotQuoted | `len<=0 && newRecord` false |
| testPrintAndQuote_Minimal_StartCharBelowZero_Quoted | `c<'0'` |
| testPrintAndQuote_Minimal_StartCharBetween9AndA_Quoted | `c>'9'&&c<'A'` |
| testPrintAndQuote_Minimal_StartCharBetweenZAndA_Quoted | `c>'Z'&&c<'a'` |
| testPrintAndQuote_Minimal_StartCharAboveZ_Quoted | `c>'z'` |
| testPrintAndQuote_Minimal_NotFirstField_CommentCharAtStart_Quoted | `newRecord==false` + `c<=COMMENT` (elseif branch) |
| testPrintAndQuote_Minimal_NormalValue_NoQuote | else-branch scan ไม่พบเงื่อนไข quote |
| testPrintAndQuote_Minimal_ContainsDelimiter_Quoted | while-loop พบ `c==delimChar` |
| testPrintAndQuote_Minimal_ContainsLF_Quoted | while-loop พบ `c==LF` |
| testPrintAndQuote_Minimal_EndsWithSpace_Quoted | `c<=SP` ที่ท้ายค่า |
| testPrintAndQuote_Minimal_ContainsQuoteChar_DoublesQuote | double-quote doubling loop (`c==quoteChar`) |
| testPrintComment_Disabled_NoOutput | `!isCommentMarkerSet()` true → return |
| testPrintComment_SingleLine | `!newRecord` false (ไม่ println ก่อน) |
| testPrintComment_WhenNotNewRecord_PrintsNewlineFirst | `!newRecord` true (println ก่อน comment) |
| testPrintComment_MultilineWithLF | `case LF` ใน switch |
| testPrintComment_WithCRLF_TreatedAsSingleNewline | `case CR` + `i+1<len && charAt==LF` true |
| testPrintComment_WithCROnly | `case CR` + เงื่อนไข next==LF false |
| testPrintln_WithRecordSeparator | `recordSeparator!=null` |
| testPrintln_NullRecordSeparator_NoAppend | `recordSeparator==null` |
| testPrintRecord_Iterable / ObjectArray | loop overload ทั้งสอง |
| testPrintRecords_Iterable_WithNestedObjectArray | `value instanceof Object[]` true |
| testPrintRecords_Iterable_WithNestedIterable | `value instanceof Iterable` true |
| testPrintRecords_Iterable_WithPlainObject | else branch (`printRecord(value)`) |
| testPrintRecords_ObjectArray_WithNestedArraysAndIterables | ทุก branch ของ `printRecords(Object...)` ในครั้งเดียว |
| testPrintRecords_ResultSet_MultipleRows | `while(resultSet.next())` true หลายรอบ + for loop column |
| testPrintRecords_ResultSet_NoRows | `while(resultSet.next())` false ทันที |

**หมายเหตุ:** สาขา `default: throw new IllegalStateException(...)` ใน `printAndQuote` ไม่สามารถทดสอบได้จริงเพราะ `QuoteMode` enum มีค่าครบทุกกรณีตาม switch แล้ว (ALL, NON_NUMERIC, NONE, MINIMAL) จึงไม่มีทางเข้าถึง branch นี้โดยไม่ mock/แก้ enum ซึ่งผิดข้อกำหนดห้ามเดา behavior