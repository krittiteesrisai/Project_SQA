package org.apache.commons.csv;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.junit.Test;

public class CSVFormatTest {

    // ================= Predefined formats =================

    @Test
    public void testDefaultFormat() {
        assertEquals(',', CSVFormat.DEFAULT.getDelimiter());
        assertEquals(Character.valueOf('"'), CSVFormat.DEFAULT.getQuoteCharacter());
        assertEquals("\r\n", CSVFormat.DEFAULT.getRecordSeparator());
        assertTrue(CSVFormat.DEFAULT.getIgnoreEmptyLines());
        assertFalse(CSVFormat.DEFAULT.getAllowMissingColumnNames());
    }

    @Test
    public void testExcelFormat() {
        assertFalse(CSVFormat.EXCEL.getIgnoreEmptyLines());
        assertTrue(CSVFormat.EXCEL.getAllowMissingColumnNames());
        assertEquals(',', CSVFormat.EXCEL.getDelimiter());
    }

    @Test
    public void testRfc4180Format() {
        assertFalse(CSVFormat.RFC4180.getIgnoreEmptyLines());
        assertEquals(',', CSVFormat.RFC4180.getDelimiter());
    }

    @Test
    public void testMySqlFormat() {
        assertEquals('\t', CSVFormat.MYSQL.getDelimiter());
        assertEquals(Character.valueOf('\\'), CSVFormat.MYSQL.getEscapeCharacter());
        assertNull(CSVFormat.MYSQL.getQuoteCharacter());
        assertEquals("\n", CSVFormat.MYSQL.getRecordSeparator());
        assertEquals("\\N", CSVFormat.MYSQL.getNullString());
        assertFalse(CSVFormat.MYSQL.getIgnoreEmptyLines());
    }

    @Test
    public void testTdfFormat() {
        assertEquals('\t', CSVFormat.TDF.getDelimiter());
        assertTrue(CSVFormat.TDF.getIgnoreSurroundingSpaces());
    }

    @Test
    public void testInformixUnloadFormat() {
        // PIPE/BACKSLASH สมมติเป็น '|' และ '\\' ตามชื่อ constant (ไม่มีไฟล์ Constants.java ให้ตรวจสอบตรง ๆ)
        assertEquals('|', CSVFormat.INFORMIX_UNLOAD.getDelimiter());
        assertEquals(Character.valueOf('\\'), CSVFormat.INFORMIX_UNLOAD.getEscapeCharacter());
        assertEquals(Character.valueOf('"'), CSVFormat.INFORMIX_UNLOAD.getQuoteCharacter());
        assertEquals("\n", CSVFormat.INFORMIX_UNLOAD.getRecordSeparator());
    }

    @Test
    public void testInformixUnloadCsvFormat() {
        assertEquals(',', CSVFormat.INFORMIX_UNLOAD_CSV.getDelimiter());
        assertEquals(Character.valueOf('"'), CSVFormat.INFORMIX_UNLOAD_CSV.getQuoteCharacter());
        assertEquals("\n", CSVFormat.INFORMIX_UNLOAD_CSV.getRecordSeparator());
    }

    @Test
    public void testPredefinedEnum() {
        assertSame(CSVFormat.DEFAULT, CSVFormat.Predefined.Default.getFormat());
        assertSame(CSVFormat.EXCEL, CSVFormat.Predefined.Excel.getFormat());
        assertSame(CSVFormat.MYSQL, CSVFormat.Predefined.MySQL.getFormat());
        assertSame(CSVFormat.RFC4180, CSVFormat.Predefined.RFC4180.getFormat());
        assertSame(CSVFormat.TDF, CSVFormat.Predefined.TDF.getFormat());
        assertSame(CSVFormat.INFORMIX_UNLOAD, CSVFormat.Predefined.InformixUnload.getFormat());
        assertSame(CSVFormat.INFORMIX_UNLOAD_CSV, CSVFormat.Predefined.InformixUnloadCsv.getFormat());
    }

    @Test
    public void testValueOf() {
        assertSame(CSVFormat.DEFAULT, CSVFormat.valueOf("Default"));
        assertSame(CSVFormat.EXCEL, CSVFormat.valueOf("Excel"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOfInvalid() {
        CSVFormat.valueOf("NoSuchFormat");
    }

    // ================= newFormat =================

    @Test
    public void testNewFormatBasic() {
        CSVFormat f = CSVFormat.newFormat(';');
        assertEquals(';', f.getDelimiter());
        assertNull(f.getQuoteCharacter());
        assertNull(f.getCommentMarker());
        assertNull(f.getEscapeCharacter());
        assertNull(f.getHeader());
        assertFalse(f.getIgnoreSurroundingSpaces());
        assertFalse(f.getIgnoreEmptyLines());
        assertNull(f.getRecordSeparator());
        assertNull(f.getNullString());
        assertFalse(f.getSkipHeaderRecord());
        assertFalse(f.getAllowMissingColumnNames());
        assertFalse(f.getIgnoreHeaderCase());
        assertFalse(f.getTrim());
        assertFalse(f.getTrailingDelimiter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewFormatDelimiterIsLF() {
        CSVFormat.newFormat('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewFormatDelimiterIsCR() {
        CSVFormat.newFormat('\r');
    }

    // ================= validate() branches =================

    @Test(expected = IllegalArgumentException.class)
    public void testValidateQuoteEqualsDelimiter() {
        CSVFormat.newFormat(',').withQuote(',');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidateEscapeEqualsDelimiter() {
        CSVFormat.newFormat(',').withEscape(',');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidateCommentEqualsDelimiter() {
        CSVFormat.newFormat(',').withCommentMarker(',');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidateQuoteEqualsComment() {
        CSVFormat.newFormat(',').withQuote('#').withCommentMarker('#');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidateEscapeEqualsComment() {
        CSVFormat.newFormat(',').withEscape('#').withCommentMarker('#');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidateNoneModeWithoutEscape() {
        CSVFormat.newFormat(',').withQuoteMode(QuoteMode.NONE);
    }

    @Test
    public void testValidateNoneModeWithEscapeOk() {
        CSVFormat f = CSVFormat.newFormat(',').withEscape('\\').withQuoteMode(QuoteMode.NONE);
        assertEquals(QuoteMode.NONE, f.getQuoteMode());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidateDuplicateHeader() {
        CSVFormat.newFormat(',').withHeader("a", "b", "a");
    }

    @Test
    public void testValidateHeaderNoDuplicateOk() {
        CSVFormat f = CSVFormat.newFormat(',').withHeader("a", "b", "c");
        assertArrayEquals(new String[] {"a", "b", "c"}, f.getHeader());
    }

    // ================= withCommentMarker / withEscape / withQuote =================

    @Test
    public void testWithCommentMarkerNullDisables() {
        CSVFormat f = CSVFormat.newFormat(',').withCommentMarker((Character) null);
        assertFalse(f.isCommentMarkerSet());
        assertNull(f.getCommentMarker());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarkerLineBreak() {
        CSVFormat.newFormat(',').withCommentMarker('\n');
    }

    @Test
    public void testWithEscapeNullDisables() {
        CSVFormat f = CSVFormat.newFormat(',').withEscape((Character) null);
        assertFalse(f.isEscapeCharacterSet());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithEscapeLineBreak() {
        CSVFormat.newFormat(',').withEscape('\r');
    }

    @Test
    public void testWithQuoteNullDisables() {
        CSVFormat f = CSVFormat.newFormat(',').withQuote((Character) null);
        assertFalse(f.isQuoteCharacterSet());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteLineBreak() {
        CSVFormat.newFormat(',').withQuote('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiterLineBreak() {
        CSVFormat.newFormat(',').withDelimiter('\r');
    }

    // ================= equals() =================

    @Test
    public void testEqualsSameInstance() {
        assertTrue(CSVFormat.DEFAULT.equals(CSVFormat.DEFAULT));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(CSVFormat.DEFAULT.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        assertFalse(CSVFormat.DEFAULT.equals("not a format"));
    }

    @Test
    public void testEqualsDifferentDelimiter() {
        assertFalse(CSVFormat.newFormat(',').equals(CSVFormat.newFormat(';')));
    }

    @Test
    public void testEqualsDifferentQuoteMode() {
        CSVFormat a = CSVFormat.newFormat(',').withEscape('\\').withQuoteMode(QuoteMode.NONE);
        CSVFormat b = CSVFormat.newFormat(',').withEscape('\\').withQuoteMode(QuoteMode.ALL);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsQuoteCharacterOneNull() {
        CSVFormat a = CSVFormat.newFormat(',');
        CSVFormat b = CSVFormat.newFormat(',').withQuote('"');
        assertFalse(a.equals(b));
        assertFalse(b.equals(a));
    }

    @Test
    public void testEqualsQuoteCharacterDifferent() {
        CSVFormat a = CSVFormat.newFormat(',').withQuote('"');
        CSVFormat b = CSVFormat.newFormat(',').withQuote('\'');
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsCommentMarkerOneNull() {
        CSVFormat a = CSVFormat.newFormat(',');
        CSVFormat b = CSVFormat.newFormat(',').withCommentMarker('#');
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsCommentMarkerDifferent() {
        CSVFormat a = CSVFormat.newFormat(',').withCommentMarker('#');
        CSVFormat b = CSVFormat.newFormat(',').withCommentMarker('!');
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsEscapeCharacterOneNull() {
        CSVFormat a = CSVFormat.newFormat(',');
        CSVFormat b = CSVFormat.newFormat(',').withEscape('\\');
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsEscapeCharacterDifferent() {
        CSVFormat a = CSVFormat.newFormat(',').withEscape('\\');
        CSVFormat b = CSVFormat.newFormat(',').withEscape('!');
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsNullStringOneNull() {
        CSVFormat a = CSVFormat.newFormat(',');
        CSVFormat b = CSVFormat.newFormat(',').withNullString("NULL");
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsNullStringDifferent() {
        CSVFormat a = CSVFormat.newFormat(',').withNullString("N/A");
        CSVFormat b = CSVFormat.newFormat(',').withNullString("NULL");
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsHeaderDifferent() {
        CSVFormat a = CSVFormat.newFormat(',').withHeader("a", "b");
        CSVFormat b = CSVFormat.newFormat(',').withHeader("a", "c");
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsIgnoreSurroundingSpacesDifferent() {
        CSVFormat a = CSVFormat.newFormat(',').withIgnoreSurroundingSpaces(true);
        CSVFormat b = CSVFormat.newFormat(',').withIgnoreSurroundingSpaces(false);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsIgnoreEmptyLinesDifferent() {
        CSVFormat a = CSVFormat.newFormat(',').withIgnoreEmptyLines(true);
        CSVFormat b = CSVFormat.newFormat(',').withIgnoreEmptyLines(false);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsSkipHeaderRecordDifferent() {
        CSVFormat a = CSVFormat.newFormat(',').withSkipHeaderRecord(true);
        CSVFormat b = CSVFormat.newFormat(',').withSkipHeaderRecord(false);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsRecordSeparatorOneNull() {
        CSVFormat a = CSVFormat.newFormat(',');
        CSVFormat b = CSVFormat.newFormat(',').withRecordSeparator("\n");
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsRecordSeparatorDifferent() {
        CSVFormat a = CSVFormat.newFormat(',').withRecordSeparator("\n");
        CSVFormat b = CSVFormat.newFormat(',').withRecordSeparator("\r\n");
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsFullyEqualObjects() {
        CSVFormat a = CSVFormat.newFormat(',').withQuote('"').withEscape('\\')
                .withCommentMarker('#').withNullString("NULL").withHeader("a", "b")
                .withIgnoreSurroundingSpaces(true).withIgnoreEmptyLines(true)
                .withSkipHeaderRecord(true).withRecordSeparator("\n");
        CSVFormat b = CSVFormat.newFormat(',').withQuote('"').withEscape('\\')
                .withCommentMarker('#').withNullString("NULL").withHeader("a", "b")
                .withIgnoreSurroundingSpaces(true).withIgnoreEmptyLines(true)
                .withSkipHeaderRecord(true).withRecordSeparator("\n");
        assertTrue(a.equals(b));
        assertEquals(a.hashCode(), b.hashCode());
    }

    // ================= hashCode =================

    @Test
    public void testHashCodeConsistent() {
        CSVFormat f = CSVFormat.DEFAULT;
        assertEquals(f.hashCode(), f.hashCode());
    }

    // ================= getters / is*Set() =================

    @Test
    public void testGettersDefaultsFalseNull() {
        CSVFormat f = CSVFormat.newFormat(',');
        assertFalse(f.isCommentMarkerSet());
        assertFalse(f.isEscapeCharacterSet());
        assertFalse(f.isNullStringSet());
        assertFalse(f.isQuoteCharacterSet());
        assertNull(f.getHeaderComments());
    }

    @Test
    public void testGettersSetTrueNonNull() {
        CSVFormat f = CSVFormat.newFormat(',').withCommentMarker('#').withEscape('\\')
                .withNullString("NULL").withQuote('"').withHeaderComments("c1");
        assertTrue(f.isCommentMarkerSet());
        assertTrue(f.isEscapeCharacterSet());
        assertTrue(f.isNullStringSet());
        assertTrue(f.isQuoteCharacterSet());
        assertArrayEquals(new String[]{"c1"}, f.getHeaderComments());
    }

    @Test
    public void testGetHeaderCloneIndependence() {
        CSVFormat f = CSVFormat.newFormat(',').withHeader("a", "b");
        String[] h1 = f.getHeader();
        h1[0] = "changed";
        String[] h2 = f.getHeader();
        assertEquals("a", h2[0]); // ต้องเป็น clone อิสระ ไม่ใช่ reference เดียวกัน
    }

    @Test
    public void testGetHeaderNull() {
        assertNull(CSVFormat.newFormat(',').getHeader());
    }

    // ================= withHeader(Class<Enum>) =================

    private enum SampleHeader { NAME, EMAIL, PHONE }

    @Test
    public void testWithHeaderEnum() {
        CSVFormat f = CSVFormat.newFormat(',').withHeader(SampleHeader.class);
        assertArrayEquals(new String[] {"NAME", "EMAIL", "PHONE"}, f.getHeader());
    }

    @Test
    public void testWithHeaderEnumNull() {
        CSVFormat f = CSVFormat.newFormat(',').withHeader((Class<? extends Enum<?>>) null);
        assertNull(f.getHeader());
    }

    // ================= withHeader(ResultSet) / (ResultSetMetaData) =================

    @Test
    public void testWithHeaderResultSetMetaData() throws SQLException {
        ResultSetMetaData metaData = mock(ResultSetMetaData.class);
        when(metaData.getColumnCount()).thenReturn(2);
        when(metaData.getColumnLabel(1)).thenReturn("A");
        when(metaData.getColumnLabel(2)).thenReturn("B");

        CSVFormat f = CSVFormat.newFormat(',').withHeader(metaData);
        assertArrayEquals(new String[] {"A", "B"}, f.getHeader());
    }

    @Test
    public void testWithHeaderResultSetMetaDataNull() throws SQLException {
        CSVFormat f = CSVFormat.newFormat(',').withHeader((ResultSetMetaData) null);
        assertNull(f.getHeader());
    }

    @Test
    public void testWithHeaderResultSet() throws SQLException {
        ResultSetMetaData metaData = mock(ResultSetMetaData.class);
        when(metaData.getColumnCount()).thenReturn(1);
        when(metaData.getColumnLabel(1)).thenReturn("COL1");

        ResultSet rs = mock(ResultSet.class);
        when(rs.getMetaData()).thenReturn(metaData);

        CSVFormat f = CSVFormat.newFormat(',').withHeader(rs);
        assertArrayEquals(new String[] {"COL1"}, f.getHeader());
    }

    @Test
    public void testWithHeaderResultSetNull() throws SQLException {
        CSVFormat f = CSVFormat.newFormat(',').withHeader((ResultSet) null);
        assertNull(f.getHeader());
    }

    // ================= withFirstRecordAsHeader =================

    @Test
    public void testWithFirstRecordAsHeader() {
        CSVFormat f = CSVFormat.newFormat(',').withFirstRecordAsHeader();
        assertNotNull(f.getHeader());
        assertEquals(0, f.getHeader().length);
        assertTrue(f.getSkipHeaderRecord());
    }

    // ================= withHeaderComments =================

    @Test
    public void testWithHeaderCommentsWithNullEntry() {
        CSVFormat f = CSVFormat.newFormat(',').withHeaderComments("first", null, 123);
        assertArrayEquals(new String[] {"first", null, "123"}, f.getHeaderComments());
    }

    @Test
    public void testWithHeaderCommentsNullArray() {
        CSVFormat f = CSVFormat.newFormat(',').withHeaderComments((Object[]) null);
        assertNull(f.getHeaderComments());
    }

    // ================= boolean with* toggles =================

    @Test
    public void testWithAllowMissingColumnNames() {
        assertTrue(CSVFormat.newFormat(',').withAllowMissingColumnNames().getAllowMissingColumnNames());
        assertFalse(CSVFormat.newFormat(',').withAllowMissingColumnNames(false).getAllowMissingColumnNames());
    }

    @Test
    public void testWithIgnoreEmptyLines() {
        assertTrue(CSVFormat.newFormat(',').withIgnoreEmptyLines().getIgnoreEmptyLines());
        assertFalse(CSVFormat.newFormat(',').withIgnoreEmptyLines(false).getIgnoreEmptyLines());
    }

    @Test
    public void testWithIgnoreHeaderCase() {
        assertTrue(CSVFormat.newFormat(',').withIgnoreHeaderCase().getIgnoreHeaderCase());
        assertFalse(CSVFormat.newFormat(',').withIgnoreHeaderCase(false).getIgnoreHeaderCase());
    }

    @Test
    public void testWithIgnoreSurroundingSpaces() {
        assertTrue(CSVFormat.newFormat(',').withIgnoreSurroundingSpaces().getIgnoreSurroundingSpaces());
        assertFalse(CSVFormat.newFormat(',').withIgnoreSurroundingSpaces(false).getIgnoreSurroundingSpaces());
    }

    @Test
    public void testWithSkipHeaderRecord() {
        assertTrue(CSVFormat.newFormat(',').withSkipHeaderRecord().getSkipHeaderRecord());
        assertFalse(CSVFormat.newFormat(',').withSkipHeaderRecord(false).getSkipHeaderRecord());
    }

    @Test
    public void testWithTrailingDelimiter() {
        assertTrue(CSVFormat.newFormat(',').withTrailingDelimiter().getTrailingDelimiter());
        assertFalse(CSVFormat.newFormat(',').withTrailingDelimiter(false).getTrailingDelimiter());
    }

    @Test
    public void testWithTrim() {
        assertTrue(CSVFormat.newFormat(',').withTrim().getTrim());
        assertFalse(CSVFormat.newFormat(',').withTrim(false).getTrim());
    }

    @Test
    public void testWithNullString() {
        assertEquals("N/A", CSVFormat.newFormat(',').withNullString("N/A").getNullString());
        assertNull(CSVFormat.newFormat(',').withNullString(null).getNullString());
    }

    @Test
    public void testWithRecordSeparatorChar() {
        assertEquals("\n", CSVFormat.newFormat(',').withRecordSeparator('\n').getRecordSeparator());
    }

    @Test
    public void testWithRecordSeparatorString() {
        assertEquals("\r\n", CSVFormat.newFormat(',').withRecordSeparator("\r\n").getRecordSeparator());
    }

    @Test
    public void testWithQuoteModeGetter() {
        CSVFormat f = CSVFormat.newFormat(',').withEscape('\\').withQuoteMode(QuoteMode.ALL);
        assertEquals(QuoteMode.ALL, f.getQuoteMode());
    }

    // ================= toString =================

    @Test
    public void testToStringMinimal() {
        String s = CSVFormat.newFormat(',').toString();
        assertTrue(s.contains("Delimiter=<,>"));
        assertFalse(s.contains("Escape="));
        assertFalse(s.contains("QuoteChar="));
        assertFalse(s.contains("CommentStart="));
        assertFalse(s.contains("NullString="));
        assertTrue(s.contains("SkipHeaderRecord:false"));
    }

    @Test
    public void testToStringFull() {
        CSVFormat f = CSVFormat.newFormat(',').withQuote('"').withEscape('\\').withCommentMarker('#')
                .withNullString("NULL").withRecordSeparator("\n").withIgnoreEmptyLines(true)
                .withIgnoreSurroundingSpaces(true).withIgnoreHeaderCase(true).withSkipHeaderRecord(true)
                .withHeaderComments("hc").withHeader("a", "b");
        String s = f.toString();
        assertTrue(s.contains("Escape=<\\>"));
        assertTrue(s.contains("QuoteChar=<\">"));
        assertTrue(s.contains("CommentStart=<#>"));
        assertTrue(s.contains("NullString=<NULL>"));
        assertTrue(s.contains("RecordSeparator=<\n>"));
        assertTrue(s.contains("EmptyLines:ignored"));
        assertTrue(s.contains("SurroundingSpaces:ignored"));
        assertTrue(s.contains("IgnoreHeaderCase:ignored"));
        assertTrue(s.contains("SkipHeaderRecord:true"));
        assertTrue(s.contains("HeaderComments:"));
        assertTrue(s.contains("Header:"));
    }

    // ================= format(Object...) =================

    @Test
    public void testFormatMethod() {
        assertEquals("a,b,c", CSVFormat.DEFAULT.format("a", "b", "c"));
    }

    // ================= print(Object, Appendable, boolean) =================

    private CSVFormat quoteCommaFormat() {
        return CSVFormat.newFormat(',').withQuote('"');
    }

    @Test
    public void testPrintNullValueNoNullString() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat.newFormat(',').print(null, sw, true);
        assertEquals("", sw.toString());
    }

    @Test
    public void testPrintNullValueWithNullString() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat.newFormat(',').withNullString("NULL").print(null, sw, true);
        assertEquals("NULL", sw.toString());
    }

    @Test
    public void testPrintPlainNoQuoteNoEscape() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat.newFormat(',').print("A,B", sw, true);
        assertEquals("A,B", sw.toString());
    }

    @Test
    public void testPrintWithEscapeOnlyDelimiter() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat.newFormat(',').withEscape('\\').print("A,B", sw, true);
        assertEquals("A\\,B", sw.toString());
    }

    @Test
    public void testPrintWithEscapeLF() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat.newFormat(',').withEscape('\\').print("A\nB", sw, true);
        assertEquals("A\\nB", sw.toString());
    }

    @Test
    public void testPrintWithEscapeCR() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat.newFormat(',').withEscape('\\').print("A\rB", sw, true);
        assertEquals("A\\rB", sw.toString());
    }

    @Test
    public void testPrintWithEscapeCharItself() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat.newFormat(',').withEscape('\\').print("A\\B", sw, true);
        assertEquals("A\\\\B", sw.toString());
    }

    @Test
    public void testPrintNotNewRecordPrependsDelimiter() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat.newFormat(',').print("X", sw, false);
        assertEquals(",X", sw.toString());
    }

    // ----- MINIMAL quote mode branches -----

    @Test
    public void testPrintQuoteMinimalEmptyNewRecord() throws IOException {
        StringWriter sw = new StringWriter();
        quoteCommaFormat().print("", sw, true);
        assertEquals("\"\"", sw.toString());
    }

    @Test
    public void testPrintQuoteMinimalEmptyNotNewRecord() throws IOException {
        StringWriter sw = new StringWriter();
        quoteCommaFormat().print("", sw, false);
        assertEquals(",", sw.toString());
    }

    @Test
    public void testPrintQuoteMinimalAlnumUnquoted() throws IOException {
        StringWriter sw = new StringWriter();
        quoteCommaFormat().print("A", sw, true);
        assertEquals("A", sw.toString());
    }

    @Test
    public void testPrintQuoteMinimalLeadingSpecialNewRecord() throws IOException {
        // อักขระแรก '#' ทำให้เข้าเงื่อนไข newRecord && อักขระไม่ใช่ alnum -> quote=true
        StringWriter sw = new StringWriter();
        quoteCommaFormat().print("#abc", sw, true);
        assertEquals("\"#abc\"", sw.toString());
    }

    @Test
    public void testPrintQuoteMinimalLeadingSpaceNotNewRecord() throws IOException {
        // อักขระแรกเป็น space (<=COMMENT) กับ newRecord=false ทำให้เข้า elif c<=COMMENT
        StringWriter sw = new StringWriter();
        quoteCommaFormat().print(" A", sw, false);
        assertEquals(",\" A\"", sw.toString());
    }

    @Test
    public void testPrintQuoteMinimalContainsDelimiter() throws IOException {
        StringWriter sw = new StringWriter();
        quoteCommaFormat().print("A,B", sw, true);
        assertEquals("\"A,B\"", sw.toString());
    }

    @Test
    public void testPrintQuoteMinimalContainsQuoteChar() throws IOException {
        StringWriter sw = new StringWriter();
        quoteCommaFormat().print("A\"B", sw, true);
        assertEquals("\"A\"\"B\"", sw.toString());
    }

    @Test
    public void testPrintQuoteMinimalContainsLF() throws IOException {
        StringWriter sw = new StringWriter();
        quoteCommaFormat().print("A\nB", sw, true);
        assertEquals("\"A\nB\"", sw.toString());
    }

    @Test
    public void testPrintQuoteMinimalContainsCR() throws IOException {
        StringWriter sw = new StringWriter();
        quoteCommaFormat().print("A\rB", sw, true);
        assertEquals("\"A\rB\"", sw.toString());
    }

    @Test
    public void testPrintQuoteMinimalTrailingSpace() throws IOException {
        StringWriter sw = new StringWriter();
        quoteCommaFormat().print("A ", sw, true);
        assertEquals("\"A \"", sw.toString());
    }

    // ----- ALL / NON_NUMERIC / NONE modes -----

    @Test
    public void testPrintQuoteModeAll() throws IOException {
        StringWriter sw = new StringWriter();
        quoteCommaFormat().withQuoteMode(QuoteMode.ALL).print("A", sw, true);
        assertEquals("\"A\"", sw.toString());
    }

    @Test
    public void testPrintQuoteModeNonNumericString() throws IOException {
        StringWriter sw = new StringWriter();
        quoteCommaFormat().withQuoteMode(QuoteMode.NON_NUMERIC).print("A", sw, true);
        assertEquals("\"A\"", sw.toString());
    }

    @Test
    public void testPrintQuoteModeNonNumericNumber() throws IOException {
        StringWriter sw = new StringWriter();
        quoteCommaFormat().withQuoteMode(QuoteMode.NON_NUMERIC).print(Integer.valueOf(5), sw, true);
        assertEquals("5", sw.toString());
    }

    @Test
    public void testPrintQuoteModeNoneDelegatesToEscape() throws IOException {
        StringWriter sw = new StringWriter();
        quoteCommaFormat().withEscape('\\').withQuoteMode(QuoteMode.NONE).print("A,B", sw, true);
        assertEquals("A\\,B", sw.toString());
    }

    // ----- trim behaviour -----

    @Test
    public void testPrintTrimStringValue() throws IOException {
        StringWriter sw = new StringWriter();
        quoteCommaFormat().withTrim().print(" A ", sw, true);
        assertEquals("A", sw.toString());
    }

    @Test
    public void testPrintTrimNonStringCharSequenceWithSpaces() throws IOException {
        StringWriter sw = new StringWriter();
        quoteCommaFormat().withTrim().print(new StringBuilder(" A "), sw, true);
        assertEquals("A", sw.toString());
    }

    @Test
    public void testPrintTrimNonStringCharSequenceNoSpaces() throws IOException {
        StringWriter sw = new StringWriter();
        quoteCommaFormat().withTrim().print(new StringBuilder("AB"), sw, true);
        assertEquals("AB", sw.toString());
    }

    // ================= println =================

    @Test
    public void testPrintlnNoTrailingNoSeparator() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat.newFormat(',').println(sw);
        assertEquals("", sw.toString());
    }

    @Test
    public void testPrintlnTrailingDelimiterOnly() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat.newFormat(',').withTrailingDelimiter().println(sw);
        assertEquals(",", sw.toString());
    }

    @Test
    public void testPrintlnSeparatorOnly() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat.newFormat(',').withRecordSeparator("\r\n").println(sw);
        assertEquals("\r\n", sw.toString());
    }

    @Test
    public void testPrintlnTrailingDelimiterAndSeparator() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat.newFormat(',').withTrailingDelimiter().withRecordSeparator("\r\n").println(sw);
        assertEquals(",\r\n", sw.toString());
    }

    // ================= printRecord =================

    @Test
    public void testPrintRecordMultipleValues() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat.DEFAULT.printRecord(sw, "a", "b", "c");
        assertEquals("a,b,c\r\n", sw.toString());
    }

    @Test
    public void testPrintRecordEmptyValues() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat.DEFAULT.printRecord(sw);
        assertEquals("\r\n", sw.toString());
    }

    // ================= parse / print(Appendable/File/Path) =================

    @Test
    public void testParseReturnsParser() throws IOException {
        // สมมติ CSVParser เป็น Closeable ตามพฤติกรรมมาตรฐานของ commons-csv
        Reader reader = new StringReader("a,b\n");
        CSVParser parser = CSVFormat.DEFAULT.parse(reader);
        assertNotNull(parser);
        parser.close();
    }

    @Test
    public void testPrintAppendable() throws IOException {
        StringWriter sw = new StringWriter();
        CSVPrinter printer = CSVFormat.DEFAULT.print(sw);
        printer.printRecord("a", "b");
        printer.close();
        assertEquals("a,b\r\n", sw.toString());
    }

    @Test
    public void testPrintToFile() throws IOException {
        File tempFile = File.createTempFile("csvformattest", ".csv");
        tempFile.deleteOnExit();
        CSVPrinter printer = CSVFormat.DEFAULT.print(tempFile, StandardCharsets.UTF_8);
        printer.printRecord("x", "y");
        printer.close();

        byte[] data = new byte[(int) tempFile.length()];
        try (FileInputStream fis = new FileInputStream(tempFile)) {
            fis.read(data);
        }
        String content = new String(data, StandardCharsets.UTF_8);
        assertEquals("x,y\r\n", content);
    }

    @Test
    public void testPrintToPath() throws IOException {
        File tempFile = File.createTempFile("csvformattest2", ".csv");
        tempFile.deleteOnExit();
        CSVPrinter printer = CSVFormat.DEFAULT.print(tempFile.toPath(), StandardCharsets.UTF_8);
        printer.printRecord("p", "q");
        printer.close();

        byte[] data = new byte[(int) tempFile.length()];
        try (FileInputStream fis = new FileInputStream(tempFile)) {
            fis.read(data);
        }
        String content = new String(data, StandardCharsets.UTF_8);
        assertEquals("p,q\r\n", content);
    }
}
