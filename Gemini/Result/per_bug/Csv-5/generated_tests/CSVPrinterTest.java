package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringWriter;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CSVPrinterTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullOut() {
        new CSVPrinter(null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullFormat() {
        new CSVPrinter(new StringWriter(), null);
    }

    @Test
    public void testCloseAndFlushWithNonCloseable() throws IOException {
        Appendable dummyAppendable = new Appendable() {
            @Override
            public Appendable append(CharSequence csq) { return this; }
            @Override
            public Appendable append(CharSequence csq, int start, int end) { return this; }
            @Override
            public Appendable append(char c) { return this; }
        };
        CSVPrinter printer = new CSVPrinter(dummyAppendable, CSVFormat.DEFAULT);
        printer.flush();
        printer.close();
        assertNotNull(printer.getOut());
    }

    @Test
    public void testCloseAndFlushWithStandardWriter() throws IOException {
        StringWriter sw = new StringWriter();
        CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        printer.flush();
        printer.close();
    }

    @Test
    public void testPrintNullValues() throws IOException {
        StringWriter sw = new StringWriter();
        CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT.withNullString("NULL"));
        printer.print(null);
        printer.print(123);
        assertEquals("NULL,123", sw.toString());
    }

    @Test
    public void testPrintNullWithoutNullString() throws IOException {
        StringWriter sw = new StringWriter();
        CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        printer.print(null);
        assertEquals("", sw.toString());
    }

    @Test
    public void testPrintEscapingBranch() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withEscape('\\').withQuote(null);
        CSVPrinter printer = new CSVPrinter(sw, format);
        printer.print("a,b\n\"c\"\r\\d");
        // Should escape delimiter, LF, quote, CR, escape
        assertTrue(sw.toString().contains("\\n"));
        assertTrue(sw.toString().contains("\\r"));
    }

    @Test
    public void testPrintPlainNoQuoteNoEscape() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withQuote(null).withEscape(null);
        CSVPrinter printer = new CSVPrinter(sw, format);
        printer.print("hello");
        printer.print("world");
        assertEquals("hello,world", sw.toString());
    }

    @Test
    public void testQuotePolicyAll() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withQuotePolicy(Quote.ALL);
        CSVPrinter printer = new CSVPrinter(sw, format);
        printer.print(123);
        assertEquals("\"123\"", sw.toString());
    }

    @Test
    public void testQuotePolicyNonNumeric() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withQuotePolicy(Quote.NON_NUMERIC);
        CSVPrinter printer = new CSVPrinter(sw, format);
        printer.print(123); // Number -> No quote
        printer.print("abc"); // Non-Number -> Quote
        assertEquals("123,\"abc\"", sw.toString());
    }

    @Test
    public void testQuotePolicyNone() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withQuotePolicy(Quote.NONE).withEscape('\\');
        CSVPrinter printer = new CSVPrinter(sw, format);
        printer.print("a,b");
        assertEquals("a\\,b", sw.toString());
    }

    @Test
    public void testQuotePolicyMinimalEdgeCases() throws IOException {
        StringWriter sw = new StringWriter();
        // Minimal quote policy with various triggers
        CSVFormat format = CSVFormat.DEFAULT.withQuotePolicy(Quote.MINIMAL);
        CSVPrinter printer = new CSVPrinter(sw, format);
        printer.print(""); // empty on new record -> quoted
        printer.print("\t"); // starts with <= COMMENT -> quoted
        printer.print("a,b"); // contains delimiter -> quoted
        printer.print("abc "); // ends with <= SP -> quoted
        printer.print("quote\"test"); // contains quote -> quoted and doubled
        assertEquals("\"\",\"\\t\",\"a,b\",\"abc \",\"quote\"\"test\"", sw.toString());
    }

    @Test
    public void testQuotePolicyMinimalNoQuoteNeeded() throws IOException {
        StringWriter sw = new StringWriter();
        CSVPrinter printer = new CSVPrinter(new StringWriter(), CSVFormat.DEFAULT);
        // Test non-newRecord empty len <= 0 branch
        printer.print("first");
        StringWriter sw2 = new StringWriter();
        CSVPrinter printer2 = new CSVPrinter(sw2, CSVFormat.DEFAULT);
        printer2.print("abc");
        printer2.print(""); // newRecord false, len 0
        assertEquals("abc,", sw2.toString());
    }

    @Test
    public void testPrintCommentDisabled() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withCommentStart((Character) null);
        CSVPrinter printer = new CSVPrinter(sw, format);
        printer.printComment("This is a comment");
        assertEquals("", sw.toString());
    }

    @Test
    public void testPrintCommentEnabled() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#');
        CSVPrinter printer = new CSVPrinter(sw, format);
        printer.print("val1");
        printer.printComment("Line1\nLine2\rLine3\r\nLine4");
        assertTrue(sw.toString().contains("# Line1"));
        assertTrue(sw.toString().contains("# Line2"));
    }

    @Test
    public void testPrintln() throws IOException {
        StringWriter sw = new StringWriter();
        CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT.withRecordSeparator("\n"));
        printer.println();
        assertEquals("\n", sw.toString());
    }

    @Test
    public void testPrintRecordIterable() throws IOException {
        StringWriter sw = new StringWriter();
        CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        printer.printRecord(Arrays.asList("a", "b", "c"));
        assertEquals("a,b,c\r\n", sw.toString());
    }

    @Test
    public void testPrintRecordsIterableVariations() throws IOException {
        StringWriter sw = new StringWriter();
        CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        List<Object> records = Arrays.asList(
            new Object[] { "array1", "array2" },
            Arrays.asList("list1", "list2"),
            "singleVal"
        );
        printer.printRecords(records);
        assertTrue(sw.toString().contains("array1,array2"));
        assertTrue(sw.toString().contains("list1,list2"));
        assertTrue(sw.toString().contains("singleVal"));
    }

    @Test
    public void testPrintRecordsArrayVariations() throws IOException {
        StringWriter sw = new StringWriter();
        CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        Object[] records = new Object[] {
            new Object[] { "a1", "a2" },
            Arrays.asList("l1", "l2"),
            "val"
        };
        printer.printRecords(records);
        assertTrue(sw.toString().contains("a1,a2"));
        assertTrue(sw.toString().contains("l1,l2"));
        assertTrue(sw.toString().contains("val"));
    }

    @Test
    public void testPrintRecordsResultSet() throws SQLException, IOException {
        ResultSetMetaData rsmd = org.easymock.EasyMock.createMock(ResultSetMetaData.class);
        org.easymock.EasyMock.expect(rsmd.getColumnCount()).andReturn(2);
        org.easymock.EasyMock.replay(rsmd);

        ResultSet rs = org.easymock.EasyMock.createMock(ResultSet.class);
        org.easymock.EasyMock.expect(rs.getMetaData()).andReturn(rsmd);
        org.easymock.EasyMock.expect(rs.next()).andReturn(true).andReturn(false);
        org.easymock.EasyMock.expect(rs.getString(1)).andReturn("col1");
        org.easymock.EasyMock.expect(rs.getString(2)).andReturn("col2");
        org.easymock.EasyMock.replay(rs);

        StringWriter sw = new StringWriter();
        CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        printer.printRecords(rs);
        assertEquals("col1,col2\r\n", sw.toString());
    }
}