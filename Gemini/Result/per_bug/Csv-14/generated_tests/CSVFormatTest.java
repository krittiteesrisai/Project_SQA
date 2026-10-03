package org.apache.commons.csv;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.StringReader;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import org.junit.Test;
import org.mockito.Mockito;

public class CSVFormatTest {

    // --- Validation & Edge Cases Tests ---

    @Test(expected = IllegalArgumentException.class)
    public void testDelimiterIsLineBreakLF() {
        CSVFormat.newFormat('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDelimiterIsLineBreakCR() {
        CSVFormat.newFormat('\r');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDelimiterEqualsQuote() {
        CSVFormat.DEFAULT.withDelimiter('"').withQuote('"');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDelimiterEqualsEscape() {
        CSVFormat.DEFAULT.withDelimiter('\\').withEscape('\\');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDelimiterEqualsComment() {
        CSVFormat.DEFAULT.withDelimiter('#').withCommentMarker('#');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testQuoteEqualsComment() {
        CSVFormat.DEFAULT.withQuote('#').withCommentMarker('#');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEscapeEqualsComment() {
        CSVFormat.DEFAULT.withEscape('#').withCommentMarker('#');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNoQuotesModeWithoutEscape() {
        CSVFormat.DEFAULT.withQuote(null).withEscape(null).withQuoteMode(QuoteMode.NONE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDuplicateHeader() {
        CSVFormat.DEFAULT.withHeader("Col1", "Col1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCommentMarkerIsLineBreak() {
        CSVFormat.DEFAULT.withCommentMarker('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEscapeIsLineBreak() {
        CSVFormat.DEFAULT.withEscape('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testQuoteIsLineBreak() {
        CSVFormat.DEFAULT.withQuote('\n');
    }

    // --- Predefined & ValueOf Tests ---

    @Test
    public void testValueOfPredefined() {
        assertEquals(CSVFormat.DEFAULT, CSVFormat.valueOf("Default"));
        assertEquals(CSVFormat.EXCEL, CSVFormat.valueOf("Excel"));
        assertEquals(CSVFormat.MYSQL, CSVFormat.valueOf("MySQL"));
        assertEquals(CSVFormat.RFC4180, CSVFormat.valueOf("RFC4180"));
        assertEquals(CSVFormat.TDF, CSVFormat.valueOf("TDF"));
        assertEquals(CSVFormat.INFORMIX_UNLOAD, CSVFormat.valueOf("InformixUnload"));
        assertEquals(CSVFormat.INFORMIX_UNLOAD_CSV, CSVFormat.valueOf("InformixUnloadCsv"));
    }

    @Test
    public void testPredefinedEnumGetFormat() {
        for (CSVFormat.Predefined p : CSVFormat.Predefined.values()) {
            assertNotNull(p.getFormat());
        }
    }

    // --- Formatting & Quoting Modes Tests ---

    @Test
    public void testFormatWithNullValues() {
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        assertEquals("NULL,val2", format.format(null, "val2"));
    }

    @Test
    public void testFormatWithNullStringNull() {
        CSVFormat format = CSVFormat.DEFAULT.withNullString(null);
        assertEquals(",val2", format.format(null, "val2"));
    }

    @Test
    public void testQuoteModeAll() {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL);
        assertEquals("\"a\",\"123\"", format.format("a", 123));
    }

    @Test
    public void testQuoteModeNonNumeric() {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.NON_NUMERIC);
        assertEquals("\"a\",123", format.format("a", 123));
    }

    @Test
    public void testQuoteModeNone() {
        CSVFormat format = CSVFormat.DEFAULT.withEscape('\\').withQuoteMode(QuoteMode.NONE);
        assertEquals("a\\,b", format.format("a,b"));
    }

    @Test
    public void testQuoteModeMinimalWithSpecialChars() {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.MINIMAL);
        assertEquals("\"a,b\"", format.format("a,b"));
        assertEquals("\"a\nb\"", format.format("a\nb"));
        assertEquals("\"a\"\"b\"", format.format("a\"b"));
        assertEquals("   ", format.format("   ")); // Starts/ends with space
    }

    @Test
    public void testPrintAndEscapeBranches() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT.withQuote(null).withEscape('\\');
        StringBuilder out = new StringBuilder();
        format.print("a\nb\r,c\\d", out, true);
        assertEquals("a\\nb\\r\\,c\\\\d", out.toString());
    }

    // --- Header and Metadata Tests ---

    @Test
    public void testWithHeaderEnum() {
        enum TestEnum { A, B }
        CSVFormat format = CSVFormat.DEFAULT.withHeader(TestEnum.class);
        assertArrayEquals(new String[] { "A", "B" }, format.getHeader());
    }

    @Test
    public void testWithHeaderResultSetMetaData() throws SQLException {
        ResultSetMetaData metaData = Mockito.mock(ResultSetMetaData.class);
        Mockito.when(metaData.getColumnCount()).thenReturn(2);
        Mockito.when(metaData.getColumnLabel(1)).thenReturn("Col1");
        Mockito.when(metaData.getColumnLabel(2)).thenReturn("Col2");

        CSVFormat format = CSVFormat.DEFAULT.withHeader(metaData);
        assertArrayEquals(new String[] { "Col1", "Col2" }, format.getHeader());
    }

    @Test
    public void testWithHeaderNullResultSet() throws SQLException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader((ResultSetMetaData) null);
        assertNull(format.getHeader());
    }

    // --- Getters, Equals, HashCode, ToString Tests ---

    @Test
    public void testGettersAndState() {
        CSVFormat format = CSVFormat.DEFAULT
                .withCommentMarker('#')
                .withHeaderComments("Comment")
                .withAllowMissingColumnNames(true)
                .withIgnoreHeaderCase(true)
                .withTrim(true)
                .withTrailingDelimiter(true);

        assertTrue(format.isCommentMarkerSet());
        assertTrue(format.isEscapeCharacterSet() == false);
        assertTrue(format.isNullStringSet() == false);
        assertTrue(format.isQuoteCharacterSet());
        assertTrue(format.getAllowMissingColumnNames());
        assertTrue(format.getIgnoreHeaderCase());
        assertTrue(format.getTrim());
        assertTrue(format.getTrailingDelimiter());
        assertEquals('#', (char) format.getCommentMarker());
        assertNotNull(format.getHeaderComments());
    }

    @Test
    public void testEqualsAndHashCode() {
        CSVFormat f1 = CSVFormat.DEFAULT;
        CSVFormat f2 = CSVFormat.DEFAULT;
        CSVFormat f3 = CSVFormat.EXCEL;

        assertTrue(f1.equals(f1));
        assertTrue(f1.equals(f2));
        assertFalse(f1.equals(null));
        assertFalse(f1.equals("SomeString"));
        assertFalse(f1.equals(f3));
        assertEquals(f1.hashCode(), f2.hashCode());
    }

    @Test
    public void testToString() {
        String str = CSVFormat.DEFAULT.withCommentMarker('#').withNullString("NULL").toString();
        assertTrue(str.contains("Delimiter=<,>"));
        assertTrue(str.contains("CommentStart=<#>"));
        assertTrue(str.contains("NullString=<NULL>"));
    }

    @Test
    public void testPrintlnAndRecordSeparator() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator("\n").withTrailingDelimiter(true);
        format.println(out);
        assertEquals(",\n", out.toString());
    }
}