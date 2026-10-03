package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CSVPrinterTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullOut() throws IOException {
        new CSVPrinter(null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullFormat() throws IOException {
        new CSVPrinter(new StringBuilder(), null);
    }

    @Test
    public void testFlushAndClose() throws IOException {
        StringWriter sw = new StringWriter();
        CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        printer.flush();
        printer.close();
        
        // Test with non-Flushable/Closeable Appendable (StringBuilder)
        StringBuilder sb = new StringBuilder();
        CSVPrinter printerSb = new CSVPrinter(sb, CSVFormat.DEFAULT);
        printerSb.flush();
        printerSb.close();
        assertNotNull(printerSb.getOut());
    }

    @Test
    public void testPrintNullValues() throws IOException {
        StringWriter sw = new StringWriter();
        CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        printer.print(null);
        assertEquals("", sw.toString());

        // Test with custom nullString
        StringWriter sw2 = new StringWriter();
        CSVFormat formatWithNull = CSVFormat.DEFAULT.withNullString("NULL");
        CSVPrinter printer2 = new CSVPrinter(sw2, formatWithNull);
        printer2.print(null);
        assertEquals("NULL", sw2.toString());
    }

    @Test
    public void testPrintWithEscaping() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withQuote(null).withEscape('\\');
        CSVPrinter printer = new CSVPrinter(sw, format);
        printer.print("a,b\nc\"d\r");
        // Expected escape behavior
        assertEquals("a\\,b\\nc\\\"d\\r", sw.toString());
    }

    @Test
    public void testQuotePolicyAll() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withQuotePolicy(Quote.ALL);
        CSVPrinter printer = new CSVPrinter(sw, format);
        printer.print("test");
        assertEquals("\"test\"", sw.toString());
    }

    @Test
    public void testQuotePolicyNonNumeric() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withQuotePolicy(Quote.NON_NUMERIC);
        CSVPrinter printer = new CSVPrinter(sw, format);
        printer.print(123);
        printer.print("123");
        assertEquals("123,\"123\"", sw.toString());
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
        // 1. Empty value on new record
        StringWriter sw1 = new StringWriter();
        CSVPrinter printer1 = new CSVPrinter(sw1, CSVFormat.DEFAULT);
        printer1.print("");
        printer1.print("val");
        assertEquals("\"\",val", sw1.toString());

        // 2. Value starting with comment char or special chars (< '0')
        StringWriter sw2 = new StringWriter();
        CSVPrinter printer2 = new CSVPrinter(sw2, CSVFormat.DEFAULT);
        printer2.print("#comment");
        assertEquals("\"#comment\"", sw2.toString());

        // 3. Value ending with whitespace (<= SP)
        StringWriter sw3 = new StringWriter();
        CSVPrinter printer3 = new CSVPrinter(sw3, CSVFormat.DEFAULT);
        printer3.print("end ");
        assertEquals("\"end \"", sw3.toString());

        // 4. Value containing quoteChar (escaping quotes by doubling)
        StringWriter sw4 = new StringWriter();
        CSVPrinter printer4 = new CSVPrinter(sw4, CSVFormat.DEFAULT);
        printer4.print("foo\"bar");
        assertEquals("\"foo\"\"bar\"", sw4.toString());
    }

    @Test
    public void testPrintComment() throws IOException {
        // Disabled comment
        StringWriter sw1 = new StringWriter();
        CSVPrinter printer1 = new CSVPrinter(sw1, CSVFormat.DEFAULT);
        printer1.printComment("This is a comment");
        assertEquals("", sw1.toString());

        // Enabled comment with different line breaks (CR, LF, CRLF)
        StringWriter sw2 = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#');
        CSVPrinter printer2 = new CSVPrinter(sw2, format);
        printer2.print("value");
        printer2.printComment("Line1\rLine2\nLine3\r\nLine4");
        assertTrue(sw2.toString().contains("# Line1"));
    }

    @Test
    public void testPrintRecordsAndIterables() throws IOException {
        StringWriter sw = new StringWriter();
        CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        
        List<String> record1 = Arrays.asList("A", "B", "C");
        List<Object> records = Arrays.asList(
            record1,
            new String[]{"D", "E"},
            "F"
        );
        
        printer.printRecords(records);
        assertTrue(sw.toString().contains("A,B,C"));
        assertTrue(sw.toString().contains("D,E"));
        assertTrue(sw.toString().contains("F"));
    }

    @Test
    public void testPrintRecordVarargs() throws IOException {
        StringWriter sw = new StringWriter();
        CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        printer.printRecord("Val1", "Val2", "Val3");
        assertEquals("Val1,Val2,Val3\r\n", sw.toString());
    }
}