package org.apache.commons.csv;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CSVFormatTest {

    // --- Validation & Edge Cases (validate() branches) ---

    @Test(expected = IllegalArgumentException.class)
    public void testDelimiterIsLineBreakLF() {
        CSVFormat.newFormat('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDelimiterIsLineBreakCR() {
        CSVFormat.newFormat('\r');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDelimiterEqualsQuoteChar() {
        CSVFormat.newFormat(',').withQuote(',');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDelimiterEqualsEscapeChar() {
        CSVFormat.newFormat(',').withEscape(',');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDelimiterEqualsCommentMarker() {
        CSVFormat.newFormat(',').withCommentMarker(',');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testQuoteEqualsCommentMarker() {
        CSVFormat.DEFAULT.withQuote('"').withCommentMarker('"');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEscapeEqualsCommentMarker() {
        CSVFormat.DEFAULT.withEscape('\\').withCommentMarker('\\');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testQuoteModeNoneWithoutEscape() {
        CSVFormat.DEFAULT.withQuoteMode(QuoteMode.NONE).withEscape(null);
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
    public void testQuoteCharIsLineBreak() {
        CSVFormat.DEFAULT.withQuote('\r');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEscapeCharIsLineBreak() {
        CSVFormat.DEFAULT.withEscape('\n');
    }

    // --- Predefined Formats & Factory Methods ---

    @Test
    public void testPredefinedValueOf() {
        assertEquals(CSVFormat.DEFAULT, CSVFormat.valueOf("Default"));
        assertEquals(CSVFormat.EXCEL, CSVFormat.valueOf("Excel"));
        assertEquals(CSVFormat.MYSQL, CSVFormat.valueOf("MySQL"));
        assertEquals(CSVFormat.RFC4180, CSVFormat.valueOf("RFC4180"));
        assertEquals(CSVFormat.TDF, CSVFormat.valueOf("TDF"));
    }

    @Test
    public void testPredefinedEnumGetFormat() {
        assertEquals(CSVFormat.DEFAULT, CSVFormat.Predefined.Default.getFormat());
        assertEquals(CSVFormat.EXCEL, CSVFormat.Predefined.Excel.getFormat());
        assertEquals(CSVFormat.MYSQL, CSVFormat.Predefined.MySQL.getFormat());
        assertEquals(CSVFormat.RFC4180, CSVFormat.Predefined.RFC4180.getFormat());
        assertEquals(CSVFormat.TDF, CSVFormat.Predefined.TDF.getFormat());
    }

    // --- Getters & Flags Coverage ---

    @Test
    public void testGettersAndFlags() {
        CSVFormat format = CSVFormat.DEFAULT
                .withCommentMarker('#')
                .withEscape('\\')
                .withHeaderComments("Comment1", null)
                .withNullString("NULL")
                .withQuoteMode(QuoteMode.ALL)
                .withIgnoreHeaderCase(true)
                .withSkipHeaderRecord(true);

        assertEquals('#', format.getCommentMarker().charValue());
        assertTrue(format.isCommentMarkerSet());
        assertEquals('\\', format.getEscapeCharacter().charValue());
        assertTrue(format.isEscapeCharacterSet());
        assertEquals("NULL", format.getNullString());
        assertTrue(format.isNullStringSet());
        assertEquals(QuoteMode.ALL, format.getQuoteMode());
        assertTrue(format.getIgnoreHeaderCase());
        assertTrue(format.getSkipHeaderRecord());
        assertNotNull(format.getHeaderComments());
    }

    @Test
    public void testUnsetOptionalProperties() {
        CSVFormat format = CSVFormat.DEFAULT;
        assertFalse(format.isCommentMarkerSet());
        assertNull(format.getCommentMarker());
        assertFalse(format.isEscapeCharacterSet());
        assertNull(format.getEscapeCharacter());
        assertFalse(format.isNullStringSet());
        assertNull(format.getNullString());
        assertFalse(format.isQuoteCharacterSet());
        assertNull(format.getQuoteCharacter());
        assertNull(format.getHeader());
        assertNull(format.getHeaderComments());
    }

    // --- Equals & HashCode Coverage ---

    @Test
    public void testEqualsAndHashCodeEdgeCases() {
        CSVFormat format1 = CSVFormat.DEFAULT.withHeader("A", "B");
        CSVFormat format2 = CSVFormat.DEFAULT.withHeader("A", "B");
        CSVFormat format3 = CSVFormat.DEFAULT.withHeader("A", "C");

        assertTrue(format1.equals(format1));
        assertFalse(format1.equals(null));
        assertFalse(format1.equals("Some String"));
        assertTrue(format1.equals(format2));
        assertFalse(format1.equals(format3));

        // Delimiter mismatch
        assertFalse(CSVFormat.DEFAULT.withDelimiter(',').equals(CSVFormat.DEFAULT.withDelimiter(';')));

        // QuoteMode mismatch
        assertFalse(CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL).equals(CSVFormat.DEFAULT.withQuoteMode(QuoteMode.MINIMAL)));

        // QuoteCharacter null vs non-null
        CSVFormat fNullQuote = CSVFormat.DEFAULT.withQuote(null);
        CSVFormat fNotNullQuote = CSVFormat.DEFAULT.withQuote('"');
        assertFalse(fNullQuote.equals(fNotNullQuote));
        assertFalse(fNotNullQuote.equals(fNullQuote));
        assertTrue(fNullQuote.equals(CSVFormat.DEFAULT.withQuote(null)));

        // CommentMarker null vs non-null
        CSVFormat fNullComment = CSVFormat.DEFAULT.withCommentMarker(null);
        CSVFormat fNotNullComment = CSVFormat.DEFAULT.withCommentMarker('#');
        assertFalse(fNullComment.equals(fNotNullComment));
        assertFalse(fNotNullComment.equals(fNullComment));
        assertTrue(fNullComment.equals(CSVFormat.DEFAULT.withCommentMarker(null)));

        // EscapeCharacter null vs non-null
        CSVFormat fNullEscape = CSVFormat.DEFAULT.withEscape(null);
        CSVFormat fNotNullEscape = CSVFormat.DEFAULT.withEscape('\\');
        assertFalse(fNullEscape.equals(fNotNullEscape));
        assertFalse(fNotNullEscape.equals(fNullEscape));
        assertTrue(fNullEscape.equals(CSVFormat.DEFAULT.withEscape(null)));

        // NullString null vs non-null
        CSVFormat fNullStr1 = CSVFormat.DEFAULT.withNullString(null);
        CSVFormat fNullStr2 = CSVFormat.DEFAULT.withNullString("NULL");
        assertFalse(fNullStr1.equals(fNullStr2));
        assertFalse(fNullStr2.equals(fNullStr1));
        assertTrue(fNullStr1.equals(CSVFormat.DEFAULT.withNullString(null)));

        // Boolean flags
        assertFalse(CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true).equals(CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(false)));
        assertFalse(CSVFormat.DEFAULT.withIgnoreEmptyLines(true).equals(CSVFormat.DEFAULT.withIgnoreEmptyLines(false)));
        assertFalse(CSVFormat.DEFAULT.withSkipHeaderRecord(true).equals(CSVFormat.DEFAULT.withSkipHeaderRecord(false)));

        // RecordSeparator null vs non-null
        CSVFormat fNullSep = CSVFormat.DEFAULT.withRecordSeparator((String) null);
        CSVFormat fNotNullSep = CSVFormat.DEFAULT.withRecordSeparator("\n");
        assertFalse(fNullSep.equals(fNotNullSep));
        assertFalse(fNotNullSep.equals(fNullSep));
        assertTrue(fNullSep.equals(CSVFormat.DEFAULT.withRecordSeparator((String) null)));

        // HashCode verification
        assertEquals(format1.hashCode(), format2.hashCode());
    }

    // --- Formatting & Parsing / ToString Coverage ---

    @Test
    public void testFormatAndToString() {
        CSVFormat format = CSVFormat.DEFAULT
                .withEscape('\\')
                .withQuote('"')
                .withCommentMarker('#')
                .withNullString("NULL")
                .withRecordSeparator("\r\n")
                .withIgnoreEmptyLines()
                .withIgnoreSurroundingSpaces()
                .withIgnoreHeaderCase()
                .withSkipHeaderRecord(true)
                .withHeaderComments("HeaderComment")
                .withHeader("Col1", "Col2");

        String str = format.toString();
        assertNotNull(str);
        assertTrue(str.contains("Delimiter=<,>"));
        assertTrue(str.contains("Escape=<\\>"));
        assertTrue(str.contains("QuoteChar=<\">"));
        assertTrue(str.contains("CommentStart=<#>"));
        assertTrue(str.contains("NullString=<NULL>"));
        assertTrue(str.contains("EmptyLines:ignored"));
        assertTrue(str.contains("SurroundingSpaces:ignored"));
        assertTrue(str.contains("IgnoreHeaderCase:ignored"));

        String formatted = format.format("val1", "val2");
        assertNotNull(formatted);
    }
}