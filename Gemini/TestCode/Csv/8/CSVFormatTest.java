package org.apache.commons.csv;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CSVFormatTest {

    @Test(expected = IllegalArgumentException.class)
    public void testNewFormatWithLineBreakDelimiter() {
        CSVFormat.newFormat('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiterLineBreak() {
        CSVFormat.DEFAULT.withDelimiter('\r');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentStartLineBreak() {
        CSVFormat.DEFAULT.withCommentStart('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithEscapeLineBreakChar() {
        CSVFormat.DEFAULT.withEscape('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteCharLineBreakChar() {
        CSVFormat.DEFAULT.withQuoteChar('\r');
    }

    @Test(expected = IllegalStateException.class)
    public void testValidateQuoteCharEqualsDelimiter() {
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(',').withQuoteChar(',');
        format.validate();
    }

    @Test(expected = IllegalStateException.class)
    public void testValidateEscapeEqualsDelimiter() {
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(',').withEscape(',');
        format.validate();
    }

    @Test(expected = IllegalStateException.class)
    public void testValidateCommentStartEqualsDelimiter() {
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(',').withCommentStart(',');
        format.validate();
    }

    @Test(expected = IllegalStateException.class)
    public void testValidateCommentStartEqualsQuoteChar() {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteChar('"').withCommentStart('"');
        format.validate();
    }

    @Test(expected = IllegalStateException.class)
    public void testValidateCommentStartEqualsEscape() {
        CSVFormat format = CSVFormat.DEFAULT.withEscape('\\').withCommentStart('\\');
        format.validate();
    }

    @Test(expected = IllegalStateException.class)
    public void testValidateNoQuotesModeSetButNoEscape() {
        CSVFormat format = CSVFormat.DEFAULT.withQuotePolicy(Quote.NONE).withEscape(null);
        format.validate();
    }

    @Test(expected = IllegalStateException.class)
    public void testValidateDuplicateHeader() {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("Col1", "Col1");
        format.validate();
    }

    @Test
    public void testGettersAndStateMethods() {
        CSVFormat format = CSVFormat.DEFAULT
                .withCommentStart('#')
                .withEscape('\\')
                .withNullString("NULL")
                .withQuoteChar('"')
                .withHeader("A", "B")
                .withSkipHeaderRecord(true)
                .withRecordSeparator("\n")
                .withIgnoreEmptyLines(true)
                .withIgnoreSurroundingSpaces(true)
                .withQuotePolicy(Quote.ALL);

        assertEquals(Character.valueOf('#'), format.getCommentStart());
        assertEquals(',', format.getDelimiter());
        assertEquals(Character.valueOf('\\'), format.getEscape());
        assertArrayEquals(new String[]{"A", "B"}, format.getHeader());
        assertTrue(format.getIgnoreEmptyLines());
        assertTrue(format.getIgnoreSurroundingSpaces());
        assertEquals("NULL", format.getNullString());
        assertEquals(Character.valueOf('"'), format.getQuoteChar());
        assertEquals(Quote.ALL, format.getQuotePolicy());
        assertEquals("\n", format.getRecordSeparator());
        assertTrue(format.getSkipHeaderRecord());

        assertTrue(format.isCommentingEnabled());
        assertTrue(format.isEscaping());
        assertTrue(format.isNullHandling());
        assertTrue(format.isQuoting());
    }

    @Test
    public void testHeaderNullHandling() {
        CSVFormat format = CSVFormat.DEFAULT.withHeader((String[]) null);
        assertNull(format.getHeader());
    }

    @Test
    public void testEqualsAndHashCodeEdges() {
        CSVFormat fmt1 = CSVFormat.DEFAULT.withHeader("H1").withNullString(null).withQuoteChar(null).withCommentStart(null).withEscape(null).withRecordSeparator(null);
        CSVFormat fmt2 = CSVFormat.DEFAULT.withHeader("H1").withNullString(null).withQuoteChar(null).withCommentStart(null).withEscape(null).withRecordSeparator(null);
        CSVFormat fmt3 = CSVFormat.DEFAULT.withHeader("H2");

        assertTrue(fmt1.equals(fmt1));
        assertFalse(fmt1.equals(null));
        assertFalse(fmt1.equals("NotACSVFormat"));
        assertTrue(fmt1.equals(fmt2));
        assertEquals(fmt1.hashCode(), fmt2.hashCode());

        assertFalse(fmt1.equals(fmt3));

        // Test null vs non-null branches in equals
        assertFalse(CSVFormat.DEFAULT.withQuoteChar('"').equals(CSVFormat.DEFAULT.withQuoteChar(null)));
        assertFalse(CSVFormat.DEFAULT.withQuoteChar(null).equals(CSVFormat.DEFAULT.withQuoteChar('"')));
        
        assertFalse(CSVFormat.DEFAULT.withCommentStart('#').equals(CSVFormat.DEFAULT.withCommentStart(null)));
        assertFalse(CSVFormat.DEFAULT.withCommentStart(null).equals(CSVFormat.DEFAULT.withCommentStart('#')));

        assertFalse(CSVFormat.DEFAULT.withEscape('\\').equals(CSVFormat.DEFAULT.withEscape(null)));
        assertFalse(CSVFormat.DEFAULT.withEscape(null).equals(CSVFormat.DEFAULT.withEscape('\\')));

        assertFalse(CSVFormat.DEFAULT.withNullString("N").equals(CSVFormat.DEFAULT.withNullString(null)));
        assertFalse(CSVFormat.DEFAULT.withNullString(null).equals(CSVFormat.DEFAULT.withNullString("N")));

        assertFalse(CSVFormat.DEFAULT.withRecordSeparator("CR").equals(CSVFormat.DEFAULT.withRecordSeparator(null)));
        assertFalse(CSVFormat.DEFAULT.withRecordSeparator(null).equals(CSVFormat.DEFAULT.withRecordSeparator("CR")));

        assertFalse(CSVFormat.DEFAULT.withDelimiter(';').equals(CSVFormat.DEFAULT.withDelimiter(',')));
        assertFalse(CSVFormat.DEFAULT.withQuotePolicy(Quote.ALL).equals(CSVFormat.DEFAULT.withQuotePolicy(Quote.MINIMAL)));
        assertFalse(CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true).equals(CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(false)));
        assertFalse(CSVFormat.DEFAULT.withIgnoreEmptyLines(false).equals(CSVFormat.DEFAULT.withIgnoreEmptyLines(true)));
        assertFalse(CSVFormat.DEFAULT.withSkipHeaderRecord(true).equals(CSVFormat.DEFAULT.withSkipHeaderRecord(false)));
    }

    @Test
    public void testToStringCoverage() {
        CSVFormat format = CSVFormat.DEFAULT
                .withEscape('\\')
                .withQuoteChar('"')
                .withCommentStart('#')
                .withNullString("NULL")
                .withRecordSeparator("\r\n")
                .withIgnoreEmptyLines(true)
                .withIgnoreSurroundingSpaces(true)
                .withSkipHeaderRecord(true)
                .withHeader("Col1");

        String str = format.toString();
        assertNotNull(str);
        assertTrue(str.contains("Delimiter=<,>"));
        assertTrue(str.contains("Escape=<\\>"));
        assertTrue(str.contains("QuoteChar=<\">"));
        assertTrue(str.contains("CommentStart=<#>"));
        assertTrue(str.contains("NullString=<NULL>"));
        assertTrue(str.contains("RecordSeparator=<"));
        assertTrue(str.contains("EmptyLines:ignored"));
        assertTrue(str.contains("SurroundingSpaces:ignored"));
        assertTrue(str.contains("SkipHeaderRecord:true"));
        assertTrue(str.contains("Header:[Col1]"));
    }

    @Test
    public void testFormatMethod() {
        String result = CSVFormat.DEFAULT.format("val1", "val2");
        assertEquals("val1,val2", result);
    }
}