package org.apache.commons.csv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.StringWriter;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Arrays;

import org.junit.Test;
import org.mockito.Mockito;

public class CSVFormatTest {

    // --- Validate & Exception Tests (Branch Coverage) ---

    @Test(expected = IllegalArgumentException.class)
    public void testValidateDelimiterIsLineBreakLF() {
        CSVFormat.newFormat('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidateDelimiterIsLineBreakCR() {
        CSVFormat.newFormat('\r');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidateDelimiterEqualsQuote() {
        CSVFormat.DEFAULT.withDelimiter('"').withQuote('"');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidateDelimiterEqualsEscape() {
        CSVFormat.DEFAULT.withDelimiter('\\').withEscape('\\');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidateDelimiterEqualsComment() {
        CSVFormat.DEFAULT.withDelimiter('#').withCommentMarker('#');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidateQuoteEqualsComment() {
        CSVFormat.DEFAULT.withQuote('#').withCommentMarker('#');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidateEscapeEqualsComment() {
        CSVFormat.DEFAULT.withEscape('#').withCommentMarker('#');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidateNoEscapeAndQuoteModeNone() {
        CSVFormat.DEFAULT.withEscape(null).withQuoteMode(QuoteMode.NONE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidateDuplicateHeader() {
        CSVFormat.DEFAULT.withHeader("Col1", "Col1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarkerLineBreak() {
        CSVFormat.DEFAULT.withCommentMarker('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithEscapeLineBreak() {
        CSVFormat.DEFAULT.withEscape('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteLineBreak() {
        CSVFormat.DEFAULT.withQuote('\n');
    }

    // --- Equals and HashCode Branch Coverage ---

    @Test
    public void testEqualsAndHashCodeEdgeCases() {
        CSVFormat format = CSVFormat.DEFAULT;

        assertTrue(format.equals(format));
        assertFalse(format.equals(null));
        assertFalse(format.equals("NotADataFormat"));

        CSVFormat format2 = CSVFormat.DEFAULT;
        assertEquals(format, format2);
        assertEquals(format.hashCode(), format2.hashCode());

        // Test differences in fields to cover all branches in equals()
        assertFalse(format.equals(CSVFormat.DEFAULT.withDelimiter(';')));
        assertFalse(format.equals(CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL)));
        assertFalse(format.equals(CSVFormat.DEFAULT.withQuote(null).withQuote('\'')));
        assertFalse(format.equals(CSVFormat.DEFAULT.withQuote('\'').withQuote(null)));
        assertFalse(format.equals(CSVFormat.DEFAULT.withCommentMarker(null).withCommentMarker('#')));
        assertFalse(format.equals(CSVFormat.DEFAULT.withCommentMarker('#').withCommentMarker(null)));
        assertFalse(format.equals(CSVFormat.DEFAULT.withEscape(null).withEscape('\\')));
        assertFalse(format.equals(CSVFormat.DEFAULT.withEscape('\\').withEscape(null)));
        assertFalse(format.equals(CSVFormat.DEFAULT.withNullString(null).withNullString("NULL")));
        assertFalse(format.equals(CSVFormat.DEFAULT.withNullString("NULL").withNullString(null)));
        assertFalse(format.equals(CSVFormat.DEFAULT.withNullString("A").withNullString("B")));
        assertFalse(format.equals(CSVFormat.DEFAULT.withHeader("A").withHeader("B")));
        assertFalse(format.equals(CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true)));
        assertFalse(format.equals(CSVFormat.DEFAULT.withIgnoreEmptyLines(false)));
        assertFalse(format.equals(CSVFormat.DEFAULT.withSkipHeaderRecord(true)));
        assertFalse(format.equals(CSVFormat.DEFAULT.withRecordSeparator(null).withRecordSeparator("\n")));
        assertFalse(format.equals(CSVFormat.DEFAULT.withRecordSeparator("\n").withRecordSeparator(null)));
        assertFalse(format.equals(CSVFormat.DEFAULT.withRecordSeparator("\n").withRecordSeparator("\r")));
    }

    // --- Getters and Builders Coverage ---

    @Test
    public void testGettersAndPredefined() {
        assertNotNull(CSVFormat.valueOf("Default"));
        assertNotNull(CSVFormat.DEFAULT.getCommentMarker());
        assertNotNull(CSVFormat.DEFAULT.getEscapeCharacter());
        assertNotNull(CSVFormat.DEFAULT.getQuoteCharacter());
        assertNotNull(CSVFormat.DEFAULT.getNullString());
        assertFalse(CSVFormat.DEFAULT.isCommentMarkerSet());
        assertFalse(CSVFormat.DEFAULT.isEscapeCharacterSet());
        assertTrue(CSVFormat.DEFAULT.isQuoteCharacterSet());
        assertFalse(CSVFormat.DEFAULT.isNullStringSet());

        CSVFormat custom = CSVFormat.newFormat(',')
                .withCommentMarker('#')
                .withEscape('\\')
                .withNullString("NULL")
                .withIgnoreHeaderCase()
                .withAutoFlush(true)
                .withHeaderComments("Comment1")
                .withTrailingDelimiter()
                .withTrim();

        assertTrue(custom.isCommentMarkerSet());
        assertTrue(custom.isEscapeCharacterSet());
        assertTrue(custom.isNullStringSet());
        assertTrue(custom.getIgnoreHeaderCase());
        assertTrue(custom.getAutoFlush());
        assertTrue(custom.getTrailingDelimiter());
        assertTrue(custom.getTrim());
        assertNotNull(custom.getHeaderComments());
    }

    @Test
    public void testHeaderMetadataAndEnums() throws SQLException {
        enum TestEnum { ONE, TWO }
        CSVFormat f1 = CSVFormat.DEFAULT.withHeader(TestEnum.class);
        assertNotNull(f1.getHeader());

        ResultSetMetaData metaData = Mockito.mock(ResultSetMetaData.class);
        Mockito.when(metaData.getColumnCount()).thenReturn(2);
        Mockito.when(metaData.getColumnLabel(1)).thenReturn("Col1");
        Mockito.when(metaData.getColumnLabel(2)).thenReturn("Col2");

        CSVFormat f2 = CSVFormat.DEFAULT.withHeader(metaData);
        assertEquals(2, f2.getHeader().length);

        CSVFormat f3 = CSVFormat.DEFAULT.withHeader((ResultSetMetaData) null);
        assertNull(f3.getHeader());
        
        CSVFormat f4 = CSVFormat.DEFAULT.withHeader((java.sql.ResultSet) null);
        assertNull(f4.getHeader());
    }

    // --- Printing & Quote Modes Coverage ---

    @Test
    public void testPrintNullValues() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL").withQuoteMode(QuoteMode.ALL);
        String formatted = format.format(new Object[] { null });
        assertEquals("\"NULL\"", formatted);

        CSVFormat formatMinimalNull = CSVFormat.DEFAULT.withNullString(null);
        assertEquals("", formatMinimalNull.format(new Object[] { null }));
    }

    @Test
    public void testQuoteModes() throws IOException {
        // ALL_NON_NULL
        String res1 = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL_NON_NULL).format("test");
        assertEquals("\"test\"", res1);

        // NON_NUMERIC
        String res2 = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.NON_NUMERIC).format("test", 123);
        assertEquals("\"test\",123", res2);

        // NONE (requires escape character)
        String res3 = CSVFormat.DEFAULT.withEscape('\\').withQuoteMode(QuoteMode.NONE).format("test,value");
        assertEquals("test\\,value", res3);

        // MINIMAL Edge Cases (Control characters, delimiters, spaces)
        String res4 = CSVFormat.DEFAULT.format("\nval");
        assertTrue(res4.contains("\n"));
        
        String res5 = CSVFormat.DEFAULT.format("val ");
        assertTrue(res5.startsWith("\"") && res5.endsWith("\""));

        String res6 = CSVFormat.DEFAULT.format("");
        assertEquals("\"\"", res6);
    }

    @Test(expected = IllegalStateException.class)
    public void testInvalidQuoteModeState() throws IOException {
        CSVFormat custom = CSVFormat.DEFAULT.withQuoteMode(null);
        // Force an invalid internal state or bypass to trigger default switch error if possible, 
        // or test via format with a mocked/invalid setup if accessible.
        // Here we test format invocation that hits default or handle exception paths.
        Appendable out = new StringWriter();
        custom.print("val", out, true);
    }

    @Test
    public void testToStringOutput() {
        String str = CSVFormat.DEFAULT
                .withCommentMarker('#')
                .withEscape('\\')
                .withNullString("N")
                .withIgnoreEmptyLines()
                .withIgnoreSurroundingSpaces()
                .withIgnoreHeaderCase()
                .withHeader("H1")
                .withHeaderComments("C1")
                .toString();
        assertTrue(str.contains("Delimiter=<,>"));
        assertTrue(str.contains("Escape=<\\>"));
        assertTrue(str.contains("CommentStart=<#>"));
    }

    @Test
    public void testPrintlnAndRecordSeparator() throws IOException {
        StringWriter out = new StringWriter();
        CSVFormat.DEFAULT.withRecordSeparator("\n").withTrailingDelimiter().println(out);
        assertTrue(out.toString().length() > 0);
    }
}