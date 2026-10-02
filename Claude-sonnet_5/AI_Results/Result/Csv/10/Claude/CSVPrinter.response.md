# CSVPrinterTest.java

หมายเหตุสำคัญก่อนเริ่ม (ข้อกำหนด #4):
- `CSVFormat` และ `Quote` เป็นคลาส dependency ที่ไม่ได้แสดงซอร์สมาให้ ผมอ้างอิง public API จริงของ `csv-1.0.jar` (Apache Commons CSV 1.0-era ที่ใช้ enum `Quote` ไม่ใช่ `QuoteMode`) ได้แก่ `CSVFormat.DEFAULT`, `withQuoteChar(Character)`, `withEscape(Character)`, `withCommentStart(Character)`, `withNullString(String)`, `withQuotePolicy(Quote)`, และ getter ที่ตรงกับที่ `CSVPrinter` เรียกใช้ (`getDelimiter()`, `getQuoteChar()`, `getRecordSeparator()` ฯลฯ)
- เพื่อลดการเดาค่า default (เช่น delimiter, recordSeparator) ผมจะ**ดึงค่าจริงจาก format ด้วย getter แบบ dynamic** มาประกอบ expected string แทนการ hardcode
- จุดที่ไม่แน่ใจ 100% (เช่น `validate()` อนุญาตให้ตั้งทั้ง quoteChar และ escape พร้อมกันหรือไม่เมื่อ `Quote.NONE`) จะมีคอมเมนต์กำกับไว้ชัดเจน

```java
import static org.junit.Assert.*;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.Quote;

public class CSVPrinterTest {

    // ช่วย Appendable แบบง่ายที่ "ไม่ใช่" Closeable/Flushable
    // ใช้ทดสอบสาขา false ของ close()/flush() และใช้เป็น sink ทั่วไปสำหรับตรวจ output string
    private static class PlainAppendable implements Appendable {
        private final StringBuilder sb = new StringBuilder();

        public Appendable append(CharSequence csq) {
            sb.append(csq);
            return this;
        }

        public Appendable append(CharSequence csq, int start, int end) {
            sb.append(csq, start, end);
            return this;
        }

        public Appendable append(char c) {
            sb.append(c);
            return this;
        }

        @Override
        public String toString() {
            return sb.toString();
        }
    }

    // ---------------------------------------------------------------
    // Constructor
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullOut_throws() throws IOException {
        new CSVPrinter(null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullFormat_throws() throws IOException {
        new CSVPrinter(new PlainAppendable(), null);
    }

    @Test
    public void testGetOut_returnsSameAppendable() throws IOException {
        PlainAppendable out = new PlainAppendable();
        CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT);
        assertSame(out, printer.getOut());
    }

    // ---------------------------------------------------------------
    // print(Object) : null value handling
    // ---------------------------------------------------------------

    @Test
    public void testPrint_nullValue_withNullNullString_printsEmpty() throws IOException {
        // format.getNullString() == null -> ควรพิมพ์เป็น Constants.EMPTY ("")
        CSVFormat format = CSVFormat.DEFAULT.withQuoteChar(null); // ปิด quoting ให้ output ตรวจง่าย
        PlainAppendable out = new PlainAppendable();
        CSVPrinter printer = new CSVPrinter(out, format);
        printer.print(null);
        assertEquals("", out.toString());
    }

    @Test
    public void testPrint_nullValue_withNullString_printsNullString() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteChar(null).withNullString("NULL");
        PlainAppendable out = new PlainAppendable();
        CSVPrinter printer = new CSVPrinter(out, format);
        printer.print(null);
        assertEquals("NULL", out.toString());
    }

    // ---------------------------------------------------------------
    // print(): เส้นทางไม่มี quoting และไม่มี escaping (else branch ตรงๆ)
    // ---------------------------------------------------------------

    @Test
    public void testPrint_noQuoting_noEscaping_plainAppend() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteChar(null); // escape เป็น null อยู่แล้วโดย default
        PlainAppendable out = new PlainAppendable();
        CSVPrinter printer = new CSVPrinter(out, format);

        printer.print("abc");
        printer.print("de,f"); // ค่านี้ไม่ถูก escape/quote เลยเพราะปิดทั้งสองแบบ

        char delim = format.getDelimiter();
        assertEquals("abc" + delim + "de,f", out.toString());
    }

    // ---------------------------------------------------------------
    // printAndEscape: ทดสอบทุก special char (CR, LF, delimiter, escape char) + segment ปกติ
    // ---------------------------------------------------------------

    @Test
    public void testPrintAndEscape_allSpecialChars() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteChar(null).withEscape('\\');
        PlainAppendable out = new PlainAppendable();
        CSVPrinter printer = new CSVPrinter(out, format);

        char delim = format.getDelimiter();
        String value = "a" + '\r' + "b" + '\n' + "c" + delim + "d" + '\\' + "e";

        printer.print(value);

        String expected = "a" + '\\' + 'r' + "b" + '\\' + 'n'
                + "c" + '\\' + delim + "d" + '\\' + '\\' + "e";
        assertEquals(expected, out.toString());
    }

    @Test
    public void testPrintAndEscape_plainValue_noSpecialChars() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteChar(null).withEscape('\\');
        PlainAppendable out = new PlainAppendable();
        CSVPrinter printer = new CSVPrinter(out, format);

        printer.print("hello");
        assertEquals("hello", out.toString());
    }

    // ---------------------------------------------------------------
    // printAndQuote : Quote.ALL
    // ---------------------------------------------------------------

    @Test
    public void testPrintAndQuote_ALL_alwaysQuotes() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withQuotePolicy(Quote.ALL);
        char q = format.getQuoteChar();
        PlainAppendable out = new PlainAppendable();
        CSVPrinter printer = new CSVPrinter(out, format);

        printer.print("abc");
        assertEquals(q + "abc" + q, out.toString());
    }

    // ---------------------------------------------------------------
    // printAndQuote : Quote.NON_NUMERIC
    // ---------------------------------------------------------------

    @Test
    public void testPrintAndQuote_NONNUMERIC_numberNotQuoted() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withQuotePolicy(Quote.NON_NUMERIC);
        PlainAppendable out = new PlainAppendable();
        CSVPrinter printer = new CSVPrinter(out, format);

        printer.print(Integer.valueOf(42));
        assertEquals("42", out.toString());
    }

    @Test
    public void testPrintAndQuote_NONNUMERIC_stringIsQuoted() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withQuotePolicy(Quote.NON_NUMERIC);
        char q = format.getQuoteChar();
        PlainAppendable out = new PlainAppendable();
        CSVPrinter printer = new CSVPrinter(out, format);

        printer.print("42");
        assertEquals(q + "42" + q, out.toString());
    }

    // ---------------------------------------------------------------
    // printAndQuote : Quote.NONE  (delegate ไป printAndEscape)
    // ข้อสังเกต: จาก source, กรณี NONE จะเรียก printAndEscape โดยไม่ตรวจว่า escape ถูกตั้งหรือไม่
    // -> เป็น "fault" ที่คาดหวังให้ทดสอบจับได้ (NPE) ตาม comment ในซอร์ส
    // ---------------------------------------------------------------

    @Test(expected = NullPointerException.class)
    public void testPrintAndQuote_NONE_withoutEscape_throwsNPE() throws IOException {
        // quoteChar ยังถูกตั้งอยู่ (จาก DEFAULT) แต่ escape ไม่ได้ตั้ง -> isQuoting()==true,
        // policy NONE จะเรียก printAndEscape() ซึ่งต้องใช้ format.getEscape().charValue()
        CSVFormat format = CSVFormat.DEFAULT.withQuotePolicy(Quote.NONE);
        PlainAppendable out = new PlainAppendable();
        CSVPrinter printer = new CSVPrinter(out, format);
        printer.print("abc"); // คาดหวัง NPE ตาม comment ในซอร์ส
    }

    @Test
    public void testPrintAndQuote_NONE_withEscape_delegatesToEscape() throws IOException {
        // สมมติฐาน (ไม่แน่ใจ 100%): validate() อนุญาตให้ quoteChar และ escape ถูกตั้งพร้อมกัน
        // ตราบใดที่ quotePolicy เป็น NONE — ถ้า validate() ไม่อนุญาตจริง เทสนี้จะ throw ตอน construct
        CSVFormat format = CSVFormat.DEFAULT.withQuotePolicy(Quote.NONE).withEscape('\\');
        char delim = format.getDelimiter();
        PlainAppendable out = new PlainAppendable();
        CSVPrinter printer = new CSVPrinter(out, format);

        String value = "a" + delim + "b";
        printer.print(value);

        String expected = "a" + '\\' + delim + "b";
        assertEquals(expected, out.toString());
    }

    // ---------------------------------------------------------------
    // printAndQuote : Quote.MINIMAL (default เมื่อ quotePolicy == null ก็ตกมาที่นี่)
    // ---------------------------------------------------------------

    @Test
    public void testPrintAndQuote_MINIMAL_emptyFirstValue_isQuoted() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT; // quotePolicy = null -> MINIMAL
        char q = format.getQuoteChar();
        PlainAppendable out = new PlainAppendable();
        CSVPrinter printer = new CSVPrinter(out, format);

        printer.print(""); // เป็น field แรกของ record (newRecord == true)
        assertEquals("" + q + q, out.toString());
    }

    @Test
    public void testPrintAndQuote_MINIMAL_emptyNonFirstValue_notQuoted() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT;
        char delim = format.getDelimiter();
        PlainAppendable out = new PlainAppendable();
        CSVPrinter printer = new CSVPrinter(out, format);

        printer.print("a");
        printer.print(""); // newRecord == false, len<=0 -> quote ยังคง false
        assertEquals("a" + delim, out.toString());
    }

    @Test
    public void testPrintAndQuote_MINIMAL_firstCharSpecial_newRecordTrue_isQuoted() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT;
        char q = format.getQuoteChar();
        PlainAppendable out = new PlainAppendable();
        CSVPrinter printer = new CSVPrinter(out, format);

        printer.print("!abc"); // field แรก, ตัวแรกเป็น '!' (code < '0')
        assertEquals(q + "!abc" + q, out.toString());
    }

    @Test
    public void testPrintAndQuote_MINIMAL_leadingCommentLikeChar_nonFirst_isQuoted() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT;
        char delim = format.getDelimiter();
        char q = format.getQuoteChar();
        PlainAppendable out = new PlainAppendable();
        CSVPrinter printer = new CSVPrinter(out, format);

        printer.print("x");
        printer.print(" abc"); // field ที่ 2 (newRecord=false) ตัวแรกเป็น space (<= COMMENT '#')
        assertEquals("x" + delim + q + " abc" + q, out.toString());
    }

    @Test
    public void testPrintAndQuote_MINIMAL_delimiterInside_isQuoted() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT;
        char delim = format.getDelimiter();
        char q = format.getQuoteChar();
        PlainAppendable out = new PlainAppendable();
        CSVPrinter printer = new CSVPrinter(out, format);

        printer.print("x");
        printer.print("ab" + delim + "cd");
        assertEquals("x" + delim + q + "ab" + delim + "cd" + q, out.toString());
    }

    @Test
    public void testPrintAndQuote_MINIMAL_trailingSpace_isQuoted() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT;
        char delim = format.getDelimiter();
        char q = format.getQuoteChar();
        PlainAppendable out = new PlainAppendable();
        CSVPrinter printer = new CSVPrinter(out, format);

        printer.print("x");
        printer.print("ab "); // ลงท้ายด้วย space
        assertEquals("x" + delim + q + "ab " + q, out.toString());
    }

    @Test
    public void testPrintAndQuote_MINIMAL_normalValue_notQuoted() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT;
        char delim = format.getDelimiter();
        PlainAppendable out = new PlainAppendable();
        CSVPrinter printer = new CSVPrinter(out, format);

        printer.print("x");
        printer.print("abc"); // ไม่มี special char, ไม่ลงท้ายด้วย space
        assertEquals("x" + delim + "abc", out.toString());
    }

    @Test
    public void testPrintAndQuote_MINIMAL_embeddedQuoteChar_isDoubled() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT;
        char delim = format.getDelimiter();
        char q = format.getQuoteChar();
        PlainAppendable out = new PlainAppendable();
        CSVPrinter printer = new CSVPrinter(out, format);

        printer.print("x");
        printer.print("a" + q + "b"); // ตัวอักษร quoteChar ฝังอยู่กลางค่า
        assertEquals("x" + delim + q + "a" + q + q + "b" + q, out.toString());
    }

    // ---------------------------------------------------------------
    // printComment
    // ---------------------------------------------------------------

    @Test
    public void testPrintComment_disabled_doesNothing() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withCommentStart(null); // isCommentingEnabled() == false
        PlainAppendable out = new PlainAppendable();
        CSVPrinter printer = new CSVPrinter(out, format);

        printer.printComment("hello");
        assertEquals("", out.toString());
    }

    @Test
    public void testPrintComment_enabled_newRecordTrue_noLeadingPrintln() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteChar(null).withCommentStart('#');
        char commentChar = format.getCommentStart();
        String rs = format.getRecordSeparator();
        PlainAppendable out = new PlainAppendable();
        CSVPrinter printer = new CSVPrinter(out, format);

        printer.printComment("hi"); // newRecord == true ตอนเริ่ม -> ไม่มี println() นำหน้า
        String expected = commentChar + " " + "hi" + (rs == null ? "" : rs);
        assertEquals(expected, out.toString());
    }

    @Test
    public void testPrintComment_enabled_newRecordFalse_hasLeadingPrintln() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteChar(null).withCommentStart('#');
        char commentChar = format.getCommentStart();
        String rs = format.getRecordSeparator();
        String rsSafe = rs == null ? "" : rs;
        PlainAppendable out = new PlainAppendable();
        CSVPrinter printer = new CSVPrinter(out, format);

        printer.print("x"); // ทำให้ newRecord == false
        printer.printComment("hi");

        String expected = "x" + rsSafe + commentChar + " " + "hi" + rsSafe;
        assertEquals(expected, out.toString());
    }

    @Test
    public void testPrintComment_withCRLF_skipsFollowingLF() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteChar(null).withCommentStart('#');
        char commentChar = format.getCommentStart();
        String rs = format.getRecordSeparator();
        String rsSafe = rs == null ? "" : rs;
        PlainAppendable out = new PlainAppendable();
        CSVPrinter printer = new CSVPrinter(out, format);

        printer.printComment("line1\r\nline2");

        String expected = commentChar + " " + "line1" + rsSafe
                + commentChar + " " + "line2" + rsSafe;
        assertEquals(expected, out.toString());
    }

    @Test
    public void testPrintComment_withLFOnly() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteChar(null).withCommentStart('#');
        char commentChar = format.getCommentStart();
        String rs = format.getRecordSeparator();
        String rsSafe = rs == null ? "" : rs;
        PlainAppendable out = new PlainAppendable();
        CSVPrinter printer = new CSVPrinter(out, format);

        printer.printComment("line1\nline2");

        String expected = commentChar + " " + "line1" + rsSafe
                + commentChar + " " + "line2" + rsSafe;
        assertEquals(expected, out.toString());
    }

    @Test
    public void testPrintComment_withCROnly_noFollowingLF() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteChar(null).withCommentStart('#');
        char commentChar = format.getCommentStart();
        String rs = format.getRecordSeparator();
        String rsSafe = rs == null ? "" : rs;
        PlainAppendable out = new PlainAppendable();
        CSVPrinter printer = new CSVPrinter(out, format);

        printer.printComment("line1\rline2"); // CR ไม่ตามด้วย LF -> ไม่ข้าม char ถัดไป

        String expected = commentChar + " " + "line1" + rsSafe
                + commentChar + " " + "line2" + rsSafe;
        assertEquals(expected, out.toString());
    }

    // ---------------------------------------------------------------
    // println()
    // ---------------------------------------------------------------

    @Test
    public void testPrintln_withRecordSeparator_appendsSeparator() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteChar(null).withRecordSeparator("\n");
        PlainAppendable out = new PlainAppendable();
        CSVPrinter printer = new CSVPrinter(out, format);

        printer.println();
        assertEquals("\n", out.toString());
    }

    @Test
    public void testPrintln_withNullRecordSeparator_appendsNothingButResetsNewRecord() throws IOException {
        // ใช้ withRecordSeparator((String) null) เพื่อให้ format.getRecordSeparator() == null
        CSVFormat format = CSVFormat.DEFAULT.withQuoteChar(null).withRecordSeparator((String) null);
        char delim = format.getDelimiter();
        PlainAppendable out = new PlainAppendable();
        CSVPrinter printer = new CSVPrinter(out, format);

        printer.println(); // ไม่ควร append อะไร แต่ newRecord จะกลายเป็น true
        assertEquals("", out.toString());

        // ยืนยันว่า newRecord ถูกรีเซ็ตเป็น true จริง: print ถัดไปต้อง "ไม่" เติม delimiter นำหน้า
        printer.print("a");
        assertEquals("a", out.toString());

        printer.print("b"); // ตอนนี้ newRecord=false แล้ว -> ต้องมี delimiter
        assertEquals("a" + delim + "b", out.toString());
    }

    // ---------------------------------------------------------------
    // printRecord(Iterable) / printRecord(Object...)
    // ---------------------------------------------------------------

    @Test
    public void testPrintRecord_iterable() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteChar(null);
        char delim = format.getDelimiter();
        String rs = format.getRecordSeparator();
        String rsSafe = rs == null ? "" : rs;
        PlainAppendable out = new PlainAppendable();
        CSVPrinter printer = new CSVPrinter(out, format);

        printer.printRecord(Arrays.asList("a", "b", "c"));
        assertEquals("a" + delim + "b" + delim + "c" + rsSafe, out.toString());
    }

    @Test
    public void testPrintRecord_varargs() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteChar(null);
        char delim = format.getDelimiter();
        String rs = format.getRecordSeparator();
        String rsSafe = rs == null ? "" : rs;
        PlainAppendable out = new PlainAppendable();
        CSVPrinter printer = new CSVPrinter(out, format);

        printer.printRecord("a", "b", "c");
        assertEquals("a" + delim + "b" + delim + "c" + rsSafe, out.toString());
    }

    @Test
    public void testPrintRecord_emptyIterable_onlyPrintln() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteChar(null);
        String rs = format.getRecordSeparator();
        String rsSafe = rs == null ? "" : rs;
        PlainAppendable out = new PlainAppendable();
        CSVPrinter printer = new CSVPrinter(out, format);

        printer.printRecord(Collections.emptyList());
        assertEquals(rsSafe, out.toString());
    }

    // ---------------------------------------------------------------
    // printRecords(Iterable) : 3 สาขา (Object[], Iterable, plain Object)
    // ---------------------------------------------------------------

    @Test
    public void testPrintRecords_iterable_withObjectArrayElement() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteChar(null);
        char delim = format.getDelimiter();
        String rsSafe = format.getRecordSeparator() == null ? "" : format.getRecordSeparator();
        PlainAppendable out = new PlainAppendable();
        CSVPrinter printer = new CSVPrinter(out, format);

        List<Object> outer = Collections.singletonList((Object) new String[] { "a", "b" });
        printer.printRecords(outer);

        assertEquals("a" + delim + "b" + rsSafe, out.toString());
    }

    @Test
    public void testPrintRecords_iterable_withIterableElement() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteChar(null);
        char delim = format.getDelimiter();
        String rsSafe = format.getRecordSeparator() == null ? "" : format.getRecordSeparator();
        PlainAppendable out = new PlainAppendable();
        CSVPrinter printer = new CSVPrinter(out, format);

        List<Object> inner = Arrays.<Object>asList("a", "b");
        List<Object> outer = Collections.singletonList((Object) inner);
        printer.printRecords(outer);

        assertEquals("a" + delim + "b" + rsSafe, out.toString());
    }

    @Test
    public void testPrintRecords_iterable_withPlainObjectElement() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteChar(null);
        String rsSafe = format.getRecordSeparator() == null ? "" : format.getRecordSeparator();
        PlainAppendable out = new PlainAppendable();
        CSVPrinter printer = new CSVPrinter(out, format);

        List<Object> outer = Collections.singletonList((Object) "solo");
        printer.printRecords(outer);

        assertEquals("solo" + rsSafe, out.toString());
    }

    // ---------------------------------------------------------------
    // printRecords(Object[]) : 3 สาขาเดียวกัน แต่ผ่าน array
    // ---------------------------------------------------------------

    @Test
    public void testPrintRecords_array_withObjectArrayElement() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteChar(null);
        char delim = format.getDelimiter();
        String rsSafe = format.getRecordSeparator() == null ? "" : format.getRecordSeparator();
        PlainAppendable out = new PlainAppendable();
        CSVPrinter printer = new CSVPrinter(out, format);

        Object[] outer = new Object[] { new String[] { "a", "b" } };
        printer.printRecords(outer);

        assertEquals("a" + delim + "b" + rsSafe, out.toString());
    }

    @Test
    public void testPrintRecords_array_withIterableElement() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteChar(null);
        char delim = format.getDelimiter();
        String rsSafe = format.getRecordSeparator() == null ? "" : format.getRecordSeparator();
        PlainAppendable out = new PlainAppendable();
        CSVPrinter printer = new CSVPrinter(out, format);

        Object[] outer = new Object[] { Arrays.asList("a", "b") };
        printer.printRecords(outer);

        assertEquals("a" + delim + "b" + rsSafe, out.toString());
    }

    @Test
    public void testPrintRecords_array_withPlainObjectElement() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteChar(null);
        String rsSafe = format.getRecordSeparator() == null ? "" : format.getRecordSeparator();
        PlainAppendable out = new PlainAppendable();
        CSVPrinter printer = new CSVPrinter(out, format);

        Object[] outer = new Object[] { "solo" };
        printer.printRecords(outer);

        assertEquals("solo" + rsSafe, out.toString());
    }

    // ---------------------------------------------------------------
    // printRecords(ResultSet)
    // ---------------------------------------------------------------

    @Test
    public void testPrintRecords_resultSet_multipleRows() throws IOException, SQLException {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteChar(null);
        char delim = format.getDelimiter();
        String rsSafe = format.getRecordSeparator() == null ? "" : format.getRecordSeparator();
        PlainAppendable out = new PlainAppendable();
        CSVPrinter printer = new CSVPrinter(out, format);

        ResultSet rs = Mockito.mock(ResultSet.class);
        ResultSetMetaData md = Mockito.mock(ResultSetMetaData.class);
        Mockito.when(rs.getMetaData()).thenReturn(md);
        Mockito.when(md.getColumnCount()).thenReturn(2);
        Mockito.when(rs.next()).thenReturn(true, true, false);
        Mockito.when(rs.getString(1)).thenReturn("r1c1", "r2c1");
        Mockito.when(rs.getString(2)).thenReturn("r1c2", "r2c2");

        printer.printRecords(rs);

        String expected = "r1c1" + delim + "r1c2" + rsSafe
                + "r2c1" + delim + "r2c2" + rsSafe;
        assertEquals(expected, out.toString());
    }

    @Test
    public void testPrintRecords_resultSet_noRows_producesNothing() throws IOException, SQLException {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteChar(null);
        PlainAppendable out = new PlainAppendable();
        CSVPrinter printer = new CSVPrinter(out, format);

        ResultSet rs = Mockito.mock(ResultSet.class);
        ResultSetMetaData md = Mockito.mock(ResultSetMetaData.class);
        Mockito.when(rs.getMetaData()).thenReturn(md);
        Mockito.when(md.getColumnCount()).thenReturn(2);
        Mockito.when(rs.next()).thenReturn(false); // loop ไม่ทำงานเลย

        printer.printRecords(rs);

        assertEquals("", out.toString());
    }

    // ---------------------------------------------------------------
    // close() / flush()
    // ---------------------------------------------------------------

    @Test
    public void testClose_withCloseableOut_callsClose() throws IOException {
        Appendable out = (Appendable) Mockito.mock(Appendable.class,
                Mockito.withSettings().extraInterfaces(Closeable.class));
        CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT.withQuoteChar(null));

        printer.close();

        Mockito.verify((Closeable) out).close();
    }

    @Test
    public void testClose_withNonCloseableOut_doesNothing() throws IOException {
        PlainAppendable out = new PlainAppendable(); // ไม่ implement Closeable
        CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT.withQuoteChar(null));

        printer.close(); // ต้องไม่ throw และไม่มี effect พิเศษใด ๆ
        assertEquals("", out.toString());
    }

    @Test
    public void testFlush_withFlushableOut_callsFlush() throws IOException {
        Appendable out = (Appendable) Mockito.mock(Appendable.class,
                Mockito.withSettings().extraInterfaces(Flushable.class));
        CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT.withQuoteChar(null));

        printer.flush();

        Mockito.verify((Flushable) out).flush();
    }

    @Test
    public void testFlush_withNonFlushableOut_doesNothing() throws IOException {
        PlainAppendable out = new PlainAppendable(); // ไม่ implement Flushable
        CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT.withQuoteChar(null));

        printer.flush(); // ต้องไม่ throw
        assertEquals("", out.toString());
    }
}
```

## สรุป Branch/Condition Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| testConstructor_nullOut_throws / nullFormat_throws | `Assertions.notNull` สาขา throw ของ out/format |
| testGetOut_returnsSameAppendable | `getOut()` return path |
| testPrint_nullValue_withNullNullString/withNullString | `print(Object)`: `value==null` + `nullString==null` / `!=null` |
| testPrint_noQuoting_noEscaping_plainAppend | `print()`: `isQuoting()=false`, `isEscaping()=false` (else append ตรง) และ `!newRecord` เติม delimiter |
| testPrintAndEscape_allSpecialChars / plainValue | `printAndEscape`: c==CR, c==LF, c==delim, c==escape, segment ปกติ, กรณีไม่มี special char เลย (loop ไม่ trigger if) |
| testPrintAndQuote_ALL_alwaysQuotes | `switch case ALL` |
| testPrintAndQuote_NONNUMERIC_number/string | `case NON_NUMERIC`: `instanceof Number` true/false |
| testPrintAndQuote_NONE_withoutEscape_throwsNPE | `case NONE` delegate escape โดยไม่มี escape (NPE - fault-detecting) |
| testPrintAndQuote_NONE_withEscape_delegatesToEscape | `case NONE` ทำงานถูกต้องเมื่อมี escape |
| testPrintAndQuote_MINIMAL_emptyFirstValue/emptyNonFirstValue | `len<=0` + `newRecord` true/false |
| testPrintAndQuote_MINIMAL_firstCharSpecial_newRecordTrue | เงื่อนไข `newRecord && (c<'0'...)` true |
| testPrintAndQuote_MINIMAL_leadingCommentLikeChar_nonFirst | `else if (c<=COMMENT)` true (newRecord=false) |
| testPrintAndQuote_MINIMAL_delimiterInside | while-loop พบ `c==delimChar` → quote=true break |
| testPrintAndQuote_MINIMAL_trailingSpace | หลัง loop ไม่ quote, ตรวจ `c<=SP` ที่ตัวสุดท้าย → true |
| testPrintAndQuote_MINIMAL_normalValue_notQuoted | ทุกเงื่อนไข false → `!quote` append ตรง |
| testPrintAndQuote_MINIMAL_embeddedQuoteChar_isDoubled | while-loop `c==quoteChar` → doubling logic |
| testPrintComment_disabled | `isCommentingEnabled()==false` |
| testPrintComment_enabled_newRecordTrue/False | `if(!newRecord) println()` true/false |
| testPrintComment_withCRLF/LFOnly/CROnly | `switch(c)`: CR+fallthrough+skip LF, LF ตรง, CR ไม่ตามด้วย LF |
| testPrintln_withRecordSeparator/withNullRecordSeparator | `recordSeparator != null` true/false + reset `newRecord` |
| testPrintRecord_iterable/varargs/emptyIterable | `printRecord` overload ทั้งสอง + loop 0/หลายรอบ |
| testPrintRecords_iterable_* (3 tests) | `printRecords(Iterable)`: `Object[]`/`Iterable`/plain object branch |
| testPrintRecords_array_* (3 tests) | `printRecords(Object[])`: 3 branch เดียวกัน |
| testPrintRecords_resultSet_multipleRows/noRows | `printRecords(ResultSet)`: loop `next()` true×N/false, inner for loop คอลัมน์ |
| testClose_with/withoutCloseable | `close()`: `instanceof Closeable` true/false |
| testFlush_with/withoutFlushable | `flush()`: `instanceof Flushable` true/false |

**หมายเหตุ**: สาขา `default: throw new IllegalStateException(...)` ใน switch ของ `Quote` ไม่สามารถทดสอบได้ผ่าน public API เนื่องจาก `Quote` เป็น enum ปิด (fixed values ALL/NON_NUMERIC/NONE/MINIMAL) จึงไม่ได้เขียนเทสสำหรับสาขานี้