package org.apache.commons.csv;

import static org.apache.commons.csv.Constants.BACKSLASH;
import static org.apache.commons.csv.Constants.CR;
import static org.apache.commons.csv.Constants.CRLF;
import static org.apache.commons.csv.Constants.LF;
import static org.apache.commons.csv.Constants.TAB;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;

import org.junit.Test;

/**
 * JUnit 4 tests for {@link CSVFormat}.
 * Target: Defects4J Csv-12b (org.apache.commons.csv.CSVFormat)
 */
public class CSVFormatTest {

    // ---------------------------------------------------------------
    // newFormat() / constructor - delimiter line-break validation
    // ---------------------------------------------------------------

    @Test
    public void testNewFormatValidDelimiter() {
        final CSVFormat fmt = CSVFormat.newFormat(';');
        assertEquals(';', fmt.getDelimiter());
        assertNull(fmt.getQuoteCharacter());
        assertNull(fmt.getCommentMarker());
        assertNull(fmt.getEscapeCharacter());
        assertFalse(fmt.getIgnoreSurroundingSpaces());
        assertFalse(fmt.getIgnoreEmptyLines());
        assertNull(fmt.getRecordSeparator());
        assertNull(fmt.getNullString());
        assertNull(fmt.getHeader());
        assertFalse(fmt.getSkipHeaderRecord());
        assertFalse(fmt.getAllowMissingColumnNames());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewFormatDelimiterIsLF() {
        CSVFormat.newFormat(LF);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewFormatDelimiterIsCR() {
        CSVFormat.newFormat(CR);
    }

    // ---------------------------------------------------------------
    // withDelimiter
    // ---------------------------------------------------------------

    @Test
    public void testWithDelimiterValid() {
        final CSVFormat fmt = CSVFormat.DEFAULT.withDelimiter('|');
        assertEquals('|', fmt.getDelimiter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiterLineBreakLFThrows() {
        CSVFormat.DEFAULT.withDelimiter(LF);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiterLineBreakCRThrows() {
        CSVFormat.DEFAULT.withDelimiter(CR);
    }

    // ---------------------------------------------------------------
    // withCommentMarker
    // ---------------------------------------------------------------

    @Test
    public void testWithCommentMarkerCharValid() {
        final CSVFormat fmt = CSVFormat.DEFAULT.withCommentMarker('#');
        assertEquals(Character.valueOf('#'), fmt.getCommentMarker());
        assertTrue(fmt.isCommentMarkerSet());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarkerCharLineBreakThrows() {
        CSVFormat.DEFAULT.withCommentMarker(LF);
    }

    @Test
    public void testWithCommentMarkerCharacterNullDisables() {
        final CSVFormat fmt = CSVFormat.DEFAULT.withCommentMarker('#').withCommentMarker((Character) null);
        assertNull(fmt.getCommentMarker());
        assertFalse(fmt.isCommentMarkerSet());
    }

    // ---------------------------------------------------------------
    // withEscape
    // ---------------------------------------------------------------

    @Test
    public void testWithEscapeCharValid() {
        final CSVFormat fmt = CSVFormat.DEFAULT.withEscape('\\');
        assertEquals(Character.valueOf('\\'), fmt.getEscapeCharacter());
        assertTrue(fmt.isEscapeCharacterSet());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithEscapeCharLineBreakThrows() {
        CSVFormat.DEFAULT.withEscape(CR);
    }

    @Test
    public void testWithEscapeNullDisables() {
        final CSVFormat fmt = CSVFormat.DEFAULT.withEscape('\\').withEscape((Character) null);
        assertNull(fmt.getEscapeCharacter());
        assertFalse(fmt.isEscapeCharacterSet());
    }

    // ---------------------------------------------------------------
    // withQuote
    // ---------------------------------------------------------------

    @Test
    public void testWithQuoteCharValid() {
        final CSVFormat fmt = CSVFormat.newFormat(',').withQuote('\'');
        assertEquals(Character.valueOf('\''), fmt.getQuoteCharacter());
        assertTrue(fmt.isQuoteCharacterSet());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteCharLineBreakThrows() {
        CSVFormat.DEFAULT.withQuote(LF);
    }

    @Test
    public void testWithQuoteCharacterNullDisables() {
        final CSVFormat fmt = CSVFormat.DEFAULT.withQuote((Character) null);
        assertNull(fmt.getQuoteCharacter());
        assertFalse(fmt.isQuoteCharacterSet());
    }

    // ---------------------------------------------------------------
    // withHeader - header duplication / null handling in constructor
    // ---------------------------------------------------------------

    @Test
    public void testWithHeaderNoArgsEmptyArray() {
        final CSVFormat fmt = CSVFormat.DEFAULT.withHeader();
        assertNotNull(fmt.getHeader());
        assertEquals(0, fmt.getHeader().length);
    }

    @Test
    public void testWithHeaderNullDisables() {
        final CSVFormat fmt = CSVFormat.DEFAULT.withHeader((String[]) null);
        assertNull(fmt.getHeader());
    }

    @Test
    public void testWithHeaderValid() {
        final CSVFormat fmt = CSVFormat.DEFAULT.withHeader("a", "b", "c");
        assertArrayEquals(new String[]{"a", "b", "c"}, fmt.getHeader());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithHeaderDuplicateThrows() {
        CSVFormat.DEFAULT.withHeader("a", "a");
    }

    @Test
    public void testWithHeaderSingleNullAllowed() {
        // one null value is allowed since HashSet permits a single null element
        final CSVFormat fmt = CSVFormat.DEFAULT.withHeader("a", null);
        assertNotNull(fmt.getHeader());
        assertEquals(2, fmt.getHeader().length);
        assertNull(fmt.getHeader()[1]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithHeaderDuplicateNullThrows() {
        // second null is treated as a duplicate by the HashSet-based check
        CSVFormat.DEFAULT.withHeader("a", null, null);
    }

    @Test
    public void testGetHeaderReturnsClone() {
        final CSVFormat fmt = CSVFormat.DEFAULT.withHeader("a", "b");
        final String[] h1 = fmt.getHeader();
        final String[] h2 = fmt.getHeader();
        assertNotSame(h1, h2);
        assertArrayEquals(h1, h2);
    }

    // ---------------------------------------------------------------
    // validate() branches (via with* + constructor)
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testValidateQuoteEqualsDelimiterThrows() {
        CSVFormat.newFormat(',').withQuote(',');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidateEscapeEqualsDelimiterThrows() {
        CSVFormat.newFormat(',').withEscape(',');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidateCommentEqualsDelimiterThrows() {
        CSVFormat.newFormat(',').withCommentMarker(',');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidateQuoteEqualsCommentThrows() {
        // delimiter differs from both quote and comment, but quote == comment
        CSVFormat.newFormat(',').withQuote('#').withCommentMarker('#');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidateEscapeEqualsCommentThrows() {
        CSVFormat.newFormat(',').withEscape('#').withCommentMarker('#');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidateQuoteModeNoneWithoutEscapeThrows() {
        // escape is null by default in newFormat -> should throw
        CSVFormat.newFormat(',').withQuoteMode(QuoteMode.NONE);
    }

    @Test
    public void testValidateQuoteModeNoneWithEscapeOk() {
        final CSVFormat fmt = CSVFormat.newFormat(',').withEscape('\\').withQuoteMode(QuoteMode.NONE);
        assertEquals(QuoteMode.NONE, fmt.getQuoteMode());
    }

    @Test
    public void testValidateNoConflictOk() {
        // sanity: legitimate combination should not throw
        final CSVFormat fmt = CSVFormat.newFormat(',')
                .withQuote('"')
                .withCommentMarker('#')
                .withEscape('\\');
        assertNotNull(fmt);
    }

    // ---------------------------------------------------------------
    // simple with* setters (state changes)
    // ---------------------------------------------------------------

    @Test
    public void testWithAllowMissingColumnNames() {
        final CSVFormat fmt = CSVFormat.DEFAULT.withAllowMissingColumnNames(true);
        assertTrue(fmt.getAllowMissingColumnNames());
        final CSVFormat fmt2 = fmt.withAllowMissingColumnNames(false);
        assertFalse(fmt2.getAllowMissingColumnNames());
    }

    @Test
    public void testWithIgnoreEmptyLines() {
        final CSVFormat fmt = CSVFormat.DEFAULT.withIgnoreEmptyLines(false);
        assertFalse(fmt.getIgnoreEmptyLines());
        final CSVFormat fmt2 = fmt.withIgnoreEmptyLines(true);
        assertTrue(fmt2.getIgnoreEmptyLines());
    }

    @Test
    public void testWithIgnoreSurroundingSpaces() {
        final CSVFormat fmt = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true);
        assertTrue(fmt.getIgnoreSurroundingSpaces());
        final CSVFormat fmt2 = fmt.withIgnoreSurroundingSpaces(false);
        assertFalse(fmt2.getIgnoreSurroundingSpaces());
    }

    @Test
    public void testWithNullString() {
        final CSVFormat fmt = CSVFormat.DEFAULT.withNullString("N/A");
        assertEquals("N/A", fmt.getNullString());
        assertTrue(fmt.isNullStringSet());
    }

    @Test
    public void testWithNullStringNull() {
        final CSVFormat fmt = CSVFormat.DEFAULT.withNullString(null);
        assertNull(fmt.getNullString());
        assertFalse(fmt.isNullStringSet());
    }

    @Test
    public void testWithQuoteMode() {
        final CSVFormat fmt = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL);
        assertEquals(QuoteMode.ALL, fmt.getQuoteMode());
    }

    @Test
    public void testWithRecordSeparatorChar() {
        final CSVFormat fmt = CSVFormat.DEFAULT.withRecordSeparator('\n');
        assertEquals("\n", fmt.getRecordSeparator());
    }

    @Test
    public void testWithRecordSeparatorString() {
        final CSVFormat fmt = CSVFormat.DEFAULT.withRecordSeparator("\r\n");
        assertEquals("\r\n", fmt.getRecordSeparator());
    }

    @Test
    public void testWithSkipHeaderRecord() {
        final CSVFormat fmt = CSVFormat.DEFAULT.withSkipHeaderRecord(true);
        assertTrue(fmt.getSkipHeaderRecord());
        final CSVFormat fmt2 = fmt.withSkipHeaderRecord(false);
        assertFalse(fmt2.getSkipHeaderRecord());
    }

    // ---------------------------------------------------------------
    // isXxxSet()
    // ---------------------------------------------------------------

    @Test
    public void testIsCommentMarkerSet() {
        assertFalse(CSVFormat.DEFAULT.isCommentMarkerSet());
        assertTrue(CSVFormat.DEFAULT.withCommentMarker('#').isCommentMarkerSet());
    }

    @Test
    public void testIsEscapeCharacterSet() {
        assertFalse(CSVFormat.DEFAULT.isEscapeCharacterSet());
        assertTrue(CSVFormat.DEFAULT.withEscape('\\').isEscapeCharacterSet());
    }

    @Test
    public void testIsNullStringSet() {
        assertFalse(CSVFormat.DEFAULT.isNullStringSet());
        assertTrue(CSVFormat.DEFAULT.withNullString("x").isNullStringSet());
    }

    @Test
    public void testIsQuoteCharacterSet() {
        assertTrue(CSVFormat.DEFAULT.isQuoteCharacterSet());
        assertFalse(CSVFormat.DEFAULT.withQuote((Character) null).isQuoteCharacterSet());
    }

    // ---------------------------------------------------------------
    // equals()
    // ---------------------------------------------------------------

    @Test
    public void testEqualsSameInstance() {
        final CSVFormat fmt = CSVFormat.DEFAULT;
        assertTrue(fmt.equals(fmt));
    }

    @Test
    public void testEqualsNullObject() {
        assertFalse(CSVFormat.DEFAULT.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        assertFalse(CSVFormat.DEFAULT.equals("not a CSVFormat"));
    }

    @Test
    public void testEqualsTrueForIdenticalCopies() {
        final CSVFormat a = CSVFormat.newFormat(',').withQuote('"').withEscape('\\')
                .withCommentMarker('#').withNullString("NULL").withHeader("x", "y")
                .withIgnoreEmptyLines(true).withIgnoreSurroundingSpaces(true)
                .withSkipHeaderRecord(true).withRecordSeparator("\n");
        final CSVFormat b = CSVFormat.newFormat(',').withQuote('"').withEscape('\\')
                .withCommentMarker('#').withNullString("NULL").withHeader("x", "y")
                .withIgnoreEmptyLines(true).withIgnoreSurroundingSpaces(true)
                .withSkipHeaderRecord(true).withRecordSeparator("\n");
        assertTrue(a.equals(b));
        assertTrue(b.equals(a));
    }

    @Test
    public void testEqualsDifferentDelimiter() {
        final CSVFormat a = CSVFormat.newFormat(',');
        final CSVFormat b = CSVFormat.newFormat(';');
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsDifferentQuoteMode() {
        final CSVFormat a = CSVFormat.newFormat(',').withEscape('\\').withQuoteMode(QuoteMode.ALL);
        final CSVFormat b = CSVFormat.newFormat(',').withEscape('\\').withQuoteMode(QuoteMode.MINIMAL);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsQuoteCharacterNullVsSet() {
        final CSVFormat a = CSVFormat.DEFAULT; // quote = '"'
        final CSVFormat b = CSVFormat.DEFAULT.withQuote((Character) null);
        assertFalse(a.equals(b));
        assertFalse(b.equals(a));
    }

    @Test
    public void testEqualsQuoteCharacterDifferentValue() {
        final CSVFormat a = CSVFormat.DEFAULT.withQuote('"');
        final CSVFormat b = CSVFormat.DEFAULT.withQuote('\'');
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsCommentMarkerNullVsSet() {
        final CSVFormat a = CSVFormat.DEFAULT;
        final CSVFormat b = CSVFormat.DEFAULT.withCommentMarker('#');
        assertFalse(a.equals(b));
        assertFalse(b.equals(a));
    }

    @Test
    public void testEqualsCommentMarkerDifferentValue() {
        final CSVFormat a = CSVFormat.DEFAULT.withCommentMarker('#');
        final CSVFormat b = CSVFormat.DEFAULT.withCommentMarker('!');
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsEscapeCharacterNullVsSet() {
        final CSVFormat a = CSVFormat.DEFAULT;
        final CSVFormat b = CSVFormat.DEFAULT.withEscape('\\');
        assertFalse(a.equals(b));
        assertFalse(b.equals(a));
    }

    @Test
    public void testEqualsEscapeCharacterDifferentValue() {
        final CSVFormat a = CSVFormat.DEFAULT.withEscape('\\');
        final CSVFormat b = CSVFormat.DEFAULT.withEscape('/');
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsNullStringNullVsSet() {
        final CSVFormat a = CSVFormat.DEFAULT;
        final CSVFormat b = CSVFormat.DEFAULT.withNullString("N/A");
        assertFalse(a.equals(b));
        assertFalse(b.equals(a));
    }

    @Test
    public void testEqualsNullStringDifferentValue() {
        final CSVFormat a = CSVFormat.DEFAULT.withNullString("N/A");
        final CSVFormat b = CSVFormat.DEFAULT.withNullString("NULL");
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsHeaderDifferent() {
        final CSVFormat a = CSVFormat.DEFAULT.withHeader("a");
        final CSVFormat b = CSVFormat.DEFAULT.withHeader("b");
        assertFalse(a.equals(b));
        final CSVFormat c = CSVFormat.DEFAULT; // header == null
        assertFalse(a.equals(c));
    }

    @Test
    public void testEqualsIgnoreSurroundingSpacesDifferent() {
        final CSVFormat a = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true);
        final CSVFormat b = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(false);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsIgnoreEmptyLinesDifferent() {
        final CSVFormat a = CSVFormat.DEFAULT.withIgnoreEmptyLines(true);
        final CSVFormat b = CSVFormat.DEFAULT.withIgnoreEmptyLines(false);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsSkipHeaderRecordDifferent() {
        final CSVFormat a = CSVFormat.DEFAULT.withSkipHeaderRecord(true);
        final CSVFormat b = CSVFormat.DEFAULT.withSkipHeaderRecord(false);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsRecordSeparatorNullVsSet() {
        final CSVFormat a = CSVFormat.newFormat(','); // recordSeparator = null
        final CSVFormat b = CSVFormat.newFormat(',').withRecordSeparator("\n");
        assertFalse(a.equals(b));
        assertFalse(b.equals(a));
    }

    @Test
    public void testEqualsRecordSeparatorDifferentValue() {
        final CSVFormat a = CSVFormat.DEFAULT.withRecordSeparator("\n");
        final CSVFormat b = CSVFormat.DEFAULT.withRecordSeparator("\r");
        assertFalse(a.equals(b));
    }

    // ---------------------------------------------------------------
    // hashCode()
    // ---------------------------------------------------------------

    @Test
    public void testHashCodeConsistentWithEquals() {
        final CSVFormat a = CSVFormat.newFormat(',').withQuote('"').withHeader("x");
        final CSVFormat b = CSVFormat.newFormat(',').withQuote('"').withHeader("x");
        assertTrue(a.equals(b));
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testHashCodeDifferentForDifferentFormats() {
        final CSVFormat a = CSVFormat.newFormat(',');
        final CSVFormat b = CSVFormat.newFormat(';');
        assertNotEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testHashCodeStableAcrossCalls() {
        final CSVFormat a = CSVFormat.DEFAULT;
        assertEquals(a.hashCode(), a.hashCode());
    }

    // ---------------------------------------------------------------
    // toString()
    // ---------------------------------------------------------------

    @Test
    public void testToStringDefaultContainsDelimiterAndSkipHeader() {
        final String s = CSVFormat.newFormat(',').toString();
        assertTrue(s.contains("Delimiter=<,>"));
        assertTrue(s.contains("SkipHeaderRecord:false"));
        // none of the optional sections should be present
        assertFalse(s.contains("Escape="));
        assertFalse(s.contains("QuoteChar="));
        assertFalse(s.contains("CommentStart="));
        assertFalse(s.contains("NullString="));
        assertFalse(s.contains("RecordSeparator="));
        assertFalse(s.contains("Header:"));
    }

    @Test
    public void testToStringWithAllOptionalFieldsSet() {
        final CSVFormat fmt = CSVFormat.newFormat(',')
                .withEscape('\\')
                .withQuote('"')
                .withCommentMarker('#')
                .withNullString("N/A")
                .withRecordSeparator("\n")
                .withIgnoreEmptyLines(true)
                .withIgnoreSurroundingSpaces(true)
                .withSkipHeaderRecord(true)
                .withHeader("a", "b");
        final String s = fmt.toString();
        assertTrue(s.contains("Escape=<\\>"));
        assertTrue(s.contains("QuoteChar=<\">"));
        assertTrue(s.contains("CommentStart=<#>"));
        assertTrue(s.contains("NullString=<N/A>"));
        assertTrue(s.contains("RecordSeparator=<"));
        assertTrue(s.contains("EmptyLines:ignored"));
        assertTrue(s.contains("SurroundingSpaces:ignored"));
        assertTrue(s.contains("SkipHeaderRecord:true"));
        assertTrue(s.contains("Header:"));
    }

    // ---------------------------------------------------------------
    // format()
    // ---------------------------------------------------------------

    @Test
    public void testFormatSimpleValues() {
        final String result = CSVFormat.DEFAULT.format("a", "b", "c");
        assertEquals("a,b,c", result);
    }

    @Test
    public void testFormatEmptyValues() {
        final String result = CSVFormat.DEFAULT.format();
        assertEquals("", result);
    }

    // NOTE: The IOException catch-branch inside format() cannot be triggered
    // through the public API because StringWriter never throws IOException;
    // this branch is left uncovered as it is unreachable via black-box testing.

    // ---------------------------------------------------------------
    // parse() / print()
    // ---------------------------------------------------------------

    @Test
    public void testParseReturnsParser() throws IOException {
        final Reader in = new StringReader("a,b,c\n");
        final CSVParser parser = CSVFormat.DEFAULT.parse(in);
        assertNotNull(parser);
        parser.close();
    }

    @Test
    public void testPrintReturnsPrinter() throws IOException {
        final StringWriter out = new StringWriter();
        final CSVPrinter printer = CSVFormat.DEFAULT.print(out);
        assertNotNull(printer);
        printer.close();
    }

    // ---------------------------------------------------------------
    // Predefined formats
    // ---------------------------------------------------------------

    @Test
    public void testPredefinedDefaultFormat() {
        final CSVFormat fmt = CSVFormat.DEFAULT;
        assertEquals(',', fmt.getDelimiter());
        assertEquals(Character.valueOf('"'), fmt.getQuoteCharacter());
        assertNull(fmt.getCommentMarker());
        assertNull(fmt.getEscapeCharacter());
        assertFalse(fmt.getIgnoreSurroundingSpaces());
        assertTrue(fmt.getIgnoreEmptyLines());
        assertEquals(CRLF, fmt.getRecordSeparator());
        assertNull(fmt.getNullString());
        assertNull(fmt.getHeader());
        assertFalse(fmt.getSkipHeaderRecord());
    }

    @Test
    public void testPredefinedRfc4180Format() {
        final CSVFormat fmt = CSVFormat.RFC4180;
        assertFalse(fmt.getIgnoreEmptyLines());
        assertEquals(',', fmt.getDelimiter());
        assertEquals(Character.valueOf('"'), fmt.getQuoteCharacter());
    }

    @Test
    public void testPredefinedExcelFormat() {
        final CSVFormat fmt = CSVFormat.EXCEL;
        assertFalse(fmt.getIgnoreEmptyLines());
        assertEquals(',', fmt.getDelimiter());
    }

    @Test
    public void testPredefinedTdfFormat() {
        final CSVFormat fmt = CSVFormat.TDF;
        assertEquals(TAB, fmt.getDelimiter());
        assertTrue(fmt.getIgnoreSurroundingSpaces());
    }

    @Test
    public void testPredefinedMysqlFormat() {
        final CSVFormat fmt = CSVFormat.MYSQL;
        assertEquals(TAB, fmt.getDelimiter());
        assertEquals(Character.valueOf(BACKSLASH), fmt.getEscapeCharacter());
        assertFalse(fmt.getIgnoreEmptyLines());
        assertNull(fmt.getQuoteCharacter());
        assertEquals(String.valueOf(LF), fmt.getRecordSeparator());
    }

    // ---------------------------------------------------------------
    // Boundary: chaining with* preserves untouched fields (immutability)
    // ---------------------------------------------------------------

    @Test
    public void testImmutabilityOfWithMethods() {
        final CSVFormat original = CSVFormat.DEFAULT;
        final CSVFormat changed = original.withDelimiter(';');
        assertEquals(',', original.getDelimiter());
        assertEquals(';', changed.getDelimiter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarkerCharacterLineBreakThrowsViaWrapper() {
        // covers withCommentMarker(char) delegating to withCommentMarker(Character)
        CSVFormat.DEFAULT.withCommentMarker(CR);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithEscapeCharacterLineBreakThrowsViaWrapper() {
        CSVFormat.DEFAULT.withEscape(LF);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteCharacterLineBreakThrowsViaWrapper() {
        CSVFormat.DEFAULT.withQuote(CR);
    }
}
