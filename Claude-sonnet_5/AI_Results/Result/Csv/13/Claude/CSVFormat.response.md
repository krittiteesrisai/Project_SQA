# CSVFormatTest.java

```java
package org.apache.commons.csv;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.junit.Test;

/**
 * Unit tests for {@link CSVFormat} (Defects4J Csv-13b).
 *
 * หมายเหตุ: บาง assertion อ้างอิงจาก Javadoc ของคลาสเป้าหมาย (เช่น MYSQL.getNullString())
 * ซึ่งอาจไม่ตรงกับ implementation จริงในเวอร์ชันที่มีบั๊ก - จุดนี้ถูกกำกับด้วยคอมเมนต์ชัดเจน
 * เพื่อให้ทดสอบสามารถดักจับ fault ที่ทราบใน Defects4J (Csv-13b) ได้
 */
public class CSVFormatTest {

    // ---------------------------------------------------------------
    // newFormat() / valueOf()
    // ---------------------------------------------------------------

    @Test
    public void testNewFormatValidDelimiter() {
        CSVFormat fmt = CSVFormat.newFormat(';');
        assertEquals(';', fmt.getDelimiter());
        assertNull(fmt.getQuoteCharacter());
        assertNull(fmt.getCommentMarker());
        assertNull(fmt.getEscapeCharacter());
        assertFalse(fmt.getIgnoreSurroundingSpaces());
        assertFalse(fmt.getAllowMissingColumnNames());
        assertFalse(fmt.getIgnoreEmptyLines());
        assertNull(fmt.getRecordSeparator());
        assertNull(fmt.getNullString());
        assertNull(fmt.getHeader());
        assertFalse(fmt.getSkipHeaderRecord());
        assertFalse(fmt.getIgnoreHeaderCase());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewFormatDelimiterIsLF() {
        CSVFormat.newFormat('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewFormatDelimiterIsCR() {
        CSVFormat.newFormat('\r');
    }

    @Test
    public void testValueOfPredefined() {
        assertSame(CSVFormat.DEFAULT, CSVFormat.valueOf("Default"));
        assertSame(CSVFormat.EXCEL, CSVFormat.valueOf("Excel"));
        assertSame(CSVFormat.MYSQL, CSVFormat.valueOf("MySQL"));
        assertSame(CSVFormat.RFC4180, CSVFormat.valueOf("RFC4180"));
        assertSame(CSVFormat.TDF, CSVFormat.valueOf("TDF"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOfInvalid() {
        CSVFormat.valueOf("NoSuchFormat");
    }

    // ---------------------------------------------------------------
    // validate() branches
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiterLineBreakLF() {
        CSVFormat.DEFAULT.withDelimiter('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiterLineBreakCR() {
        CSVFormat.DEFAULT.withDelimiter('\r');
    }

    @Test
    public void testWithDelimiterValid() {
        CSVFormat fmt = CSVFormat.DEFAULT.withDelimiter(';');
        assertEquals(';', fmt.getDelimiter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testQuoteCharacterSameAsDelimiter() {
        CSVFormat.DEFAULT.withDelimiter(',').withQuote(',');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEscapeCharacterSameAsDelimiter() {
        CSVFormat.DEFAULT.withDelimiter(',').withEscape(',');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCommentMarkerSameAsDelimiter() {
        CSVFormat.DEFAULT.withDelimiter(',').withCommentMarker(',');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testQuoteCharacterSameAsCommentMarker() {
        CSVFormat.DEFAULT.withQuote('#').withCommentMarker('#');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEscapeCharacterSameAsCommentMarker() {
        CSVFormat.DEFAULT.withEscape('#').withCommentMarker('#');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNoEscapeWithQuoteModeNone() {
        CSVFormat.DEFAULT.withEscape((Character) null).withQuoteMode(QuoteMode.NONE);
    }

    @Test
    public void testEscapeWithQuoteModeNoneOk() {
        CSVFormat fmt = CSVFormat.DEFAULT.withEscape('\\').withQuoteMode(QuoteMode.NONE);
        assertEquals(QuoteMode.NONE, fmt.getQuoteMode());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDuplicateHeaderNames() {
        CSVFormat.DEFAULT.withHeader("A", "B", "A");
    }

    @Test
    public void testHeaderNoDuplicates() {
        CSVFormat fmt = CSVFormat.DEFAULT.withHeader("A", "B", "C");
        assertArrayEquals(new String[]{"A", "B", "C"}, fmt.getHeader());
    }

    @Test
    public void testHeaderNull() {
        CSVFormat fmt = CSVFormat.DEFAULT.withHeader((String[]) null);
        assertNull(fmt.getHeader());
    }

    @Test
    public void testHeaderEmpty() {
        CSVFormat fmt = CSVFormat.DEFAULT.withHeader();
        assertNotNull(fmt.getHeader());
        assertEquals(0, fmt.getHeader().length);
    }

    // ---------------------------------------------------------------
    // withCommentMarker
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarkerCharLineBreak() {
        CSVFormat.DEFAULT.withCommentMarker('\n');
    }

    @Test
    public void testWithCommentMarkerNull() {
        CSVFormat fmt = CSVFormat.DEFAULT.withCommentMarker((Character) null);
        assertNull(fmt.getCommentMarker());
        assertFalse(fmt.isCommentMarkerSet());
    }

    @Test
    public void testWithCommentMarkerValid() {
        CSVFormat fmt = CSVFormat.DEFAULT.withCommentMarker('#');
        assertEquals(Character.valueOf('#'), fmt.getCommentMarker());
        assertTrue(fmt.isCommentMarkerSet());
    }

    // ---------------------------------------------------------------
    // withEscape
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testWithEscapeCharLineBreak() {
        CSVFormat.DEFAULT.withEscape('\r');
    }

    @Test
    public void testWithEscapeNull() {
        CSVFormat fmt = CSVFormat.DEFAULT.withEscape((Character) null);
        assertNull(fmt.getEscapeCharacter());
        assertFalse(fmt.isEscapeCharacterSet());
    }

    @Test
    public void testWithEscapeValid() {
        CSVFormat fmt = CSVFormat.DEFAULT.withEscape('\\');
        assertEquals(Character.valueOf('\\'), fmt.getEscapeCharacter());
        assertTrue(fmt.isEscapeCharacterSet());
    }

    // ---------------------------------------------------------------
    // withQuote
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteCharLineBreak() {
        CSVFormat.DEFAULT.withQuote('\n');
    }

    @Test
    public void testWithQuoteNullDisable() {
        CSVFormat fmt = CSVFormat.DEFAULT.withQuote((Character) null);
        assertNull(fmt.getQuoteCharacter());
        assertFalse(fmt.isQuoteCharacterSet());
    }

    @Test
    public void testWithQuoteValid() {
        CSVFormat fmt = CSVFormat.DEFAULT.withQuote('\'');
        assertEquals(Character.valueOf('\''), fmt.getQuoteCharacter());
        assertTrue(fmt.isQuoteCharacterSet());
    }

    // ---------------------------------------------------------------
    // withNullString
    // ---------------------------------------------------------------

    @Test
    public void testWithNullStringNull() {
        CSVFormat fmt = CSVFormat.DEFAULT.withNullString(null);
        assertNull(fmt.getNullString());
        assertFalse(fmt.isNullStringSet());
    }

    @Test
    public void testWithNullStringValue() {
        CSVFormat fmt = CSVFormat.DEFAULT.withNullString("NULL");
        assertEquals("NULL", fmt.getNullString());
        assertTrue(fmt.isNullStringSet());
    }

    // ---------------------------------------------------------------
    // boolean toggles (no-arg / explicit)
    // ---------------------------------------------------------------

    @Test
    public void testWithIgnoreEmptyLinesNoArg() {
        CSVFormat fmt = CSVFormat.newFormat(',').withIgnoreEmptyLines();
        assertTrue(fmt.getIgnoreEmptyLines());
    }

    @Test
    public void testWithIgnoreEmptyLinesFalse() {
        CSVFormat fmt = CSVFormat.DEFAULT.withIgnoreEmptyLines(false);
        assertFalse(fmt.getIgnoreEmptyLines());
    }

    @Test
    public void testWithIgnoreSurroundingSpacesNoArg() {
        CSVFormat fmt = CSVFormat.newFormat(',').withIgnoreSurroundingSpaces();
        assertTrue(fmt.getIgnoreSurroundingSpaces());
    }

    @Test
    public void testWithIgnoreSurroundingSpacesFalse() {
        CSVFormat fmt = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(false);
        assertFalse(fmt.getIgnoreSurroundingSpaces());
    }

    @Test
    public void testWithIgnoreHeaderCaseNoArg() {
        CSVFormat fmt = CSVFormat.newFormat(',').withIgnoreHeaderCase();
        assertTrue(fmt.getIgnoreHeaderCase());
    }

    @Test
    public void testWithIgnoreHeaderCaseFalse() {
        CSVFormat fmt = CSVFormat.DEFAULT.withIgnoreHeaderCase(false);
        assertFalse(fmt.getIgnoreHeaderCase());
    }

    @Test
    public void testWithAllowMissingColumnNamesNoArg() {
        CSVFormat fmt = CSVFormat.newFormat(',').withAllowMissingColumnNames();
        assertTrue(fmt.getAllowMissingColumnNames());
    }

    @Test
    public void testWithAllowMissingColumnNamesFalse() {
        CSVFormat fmt = CSVFormat.DEFAULT.withAllowMissingColumnNames(false);
        assertFalse(fmt.getAllowMissingColumnNames());
    }

    @Test
    public void testWithSkipHeaderRecordNoArg() {
        CSVFormat fmt = CSVFormat.newFormat(',').withSkipHeaderRecord();
        assertTrue(fmt.getSkipHeaderRecord());
    }

    @Test
    public void testWithSkipHeaderRecordFalse() {
        CSVFormat fmt = CSVFormat.DEFAULT.withSkipHeaderRecord(false);
        assertFalse(fmt.getSkipHeaderRecord());
    }

    // ---------------------------------------------------------------
    // withRecordSeparator
    // ---------------------------------------------------------------

    @Test
    public void testWithRecordSeparatorChar() {
        CSVFormat fmt = CSVFormat.DEFAULT.withRecordSeparator('\n');
        assertEquals("\n", fmt.getRecordSeparator());
    }

    @Test
    public void testWithRecordSeparatorString() {
        CSVFormat fmt = CSVFormat.DEFAULT.withRecordSeparator("\r\n");
        assertEquals("\r\n", fmt.getRecordSeparator());
    }

    // ---------------------------------------------------------------
    // withHeaderComments / toStringArray()
    // ---------------------------------------------------------------

    @Test
    public void testWithHeaderCommentsNull() {
        CSVFormat fmt = CSVFormat.DEFAULT.withHeaderComments((Object[]) null);
        assertNull(fmt.getHeaderComments());
    }

    @Test
    public void testWithHeaderCommentsValues() {
        CSVFormat fmt = CSVFormat.DEFAULT.withHeaderComments("Comment1", null, "Comment2");
        String[] comments = fmt.getHeaderComments();
        assertNotNull(comments);
        assertEquals(3, comments.length);
        assertEquals("Comment1", comments[0]);
        assertNull(comments[1]); // covers value == null branch inside toStringArray loop
        assertEquals("Comment2", comments[2]);
    }

    // ---------------------------------------------------------------
    // withQuoteMode
    // ---------------------------------------------------------------

    @Test
    public void testWithQuoteModeAll() {
        CSVFormat fmt = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL);
        assertEquals(QuoteMode.ALL, fmt.getQuoteMode());
    }

    // ---------------------------------------------------------------
    // withHeader(ResultSet) / withHeader(ResultSetMetaData)
    // ---------------------------------------------------------------

    @Test
    public void testWithHeaderResultSetNull() throws SQLException {
        CSVFormat fmt = CSVFormat.DEFAULT.withHeader((ResultSet) null);
        assertNull(fmt.getHeader());
    }

    @Test
    public void testWithHeaderResultSetValid() throws SQLException {
        ResultSet resultSet = mock(ResultSet.class);
        ResultSetMetaData metaData = mock(ResultSetMetaData.class);
        when(resultSet.getMetaData()).thenReturn(metaData);
        when(metaData.getColumnCount()).thenReturn(2);
        when(metaData.getColumnLabel(1)).thenReturn("Col1");
        when(metaData.getColumnLabel(2)).thenReturn("Col2");

        CSVFormat fmt = CSVFormat.DEFAULT.withHeader(resultSet);
        assertArrayEquals(new String[]{"Col1", "Col2"}, fmt.getHeader());
    }

    @Test
    public void testWithHeaderMetaDataNull() throws SQLException {
        CSVFormat fmt = CSVFormat.DEFAULT.withHeader((ResultSetMetaData) null);
        assertNull(fmt.getHeader());
    }

    @Test
    public void testWithHeaderMetaDataZeroColumns() throws SQLException {
        ResultSetMetaData metaData = mock(ResultSetMetaData.class);
        when(metaData.getColumnCount()).thenReturn(0);
        CSVFormat fmt = CSVFormat.DEFAULT.withHeader(metaData);
        assertNotNull(fmt.getHeader());
        assertEquals(0, fmt.getHeader().length);
    }

    @Test
    public void testWithHeaderMetaDataMultipleColumns() throws SQLException {
        ResultSetMetaData metaData = mock(ResultSetMetaData.class);
        when(metaData.getColumnCount()).thenReturn(3);
        when(metaData.getColumnLabel(1)).thenReturn("A");
        when(metaData.getColumnLabel(2)).thenReturn("B");
        when(metaData.getColumnLabel(3)).thenReturn("C");
        CSVFormat fmt = CSVFormat.DEFAULT.withHeader(metaData);
        assertArrayEquals(new String[]{"A", "B", "C"}, fmt.getHeader());
    }

    // ---------------------------------------------------------------
    // equals()
    // ---------------------------------------------------------------

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
        assertFalse(CSVFormat.DEFAULT.equals("NotACSVFormat"));
    }

    @Test
    public void testEqualsDifferentDelimiter() {
        CSVFormat a = CSVFormat.newFormat(',').withEscape('\\');
        CSVFormat b = CSVFormat.newFormat(';').withEscape('\\');
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsQuoteModeOneNull() {
        CSVFormat a = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL);
        CSVFormat b = CSVFormat.DEFAULT; // quoteMode null
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsDifferentQuoteMode() {
        CSVFormat a = CSVFormat.DEFAULT.withEscape('\\').withQuoteMode(QuoteMode.ALL);
        CSVFormat b = CSVFormat.DEFAULT.withEscape('\\').withQuoteMode(QuoteMode.MINIMAL);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsQuoteCharacterOneNull() {
        CSVFormat a = CSVFormat.DEFAULT.withQuote((Character) null);
        CSVFormat b = CSVFormat.DEFAULT.withQuote('"');
        assertFalse(a.equals(b));
        assertFalse(b.equals(a));
    }

    @Test
    public void testEqualsQuoteCharacterBothNonNullDifferent() {
        CSVFormat a = CSVFormat.DEFAULT.withQuote('\'');
        CSVFormat b = CSVFormat.DEFAULT.withQuote('"');
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsQuoteCharacterBothNonNullEqual() {
        CSVFormat a = CSVFormat.DEFAULT.withQuote('"');
        CSVFormat b = CSVFormat.DEFAULT.withQuote('"');
        assertTrue(a.equals(b));
    }

    @Test
    public void testEqualsCommentMarkerOneNull() {
        CSVFormat a = CSVFormat.DEFAULT.withCommentMarker('#');
        CSVFormat b = CSVFormat.DEFAULT;
        assertFalse(a.equals(b));
        assertFalse(b.equals(a));
    }

    @Test
    public void testEqualsCommentMarkerBothNonNullDifferent() {
        CSVFormat a = CSVFormat.DEFAULT.withCommentMarker('#');
        CSVFormat b = CSVFormat.DEFAULT.withCommentMarker('!');
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsEscapeCharacterOneNull() {
        CSVFormat a = CSVFormat.DEFAULT.withEscape('\\');
        CSVFormat b = CSVFormat.DEFAULT;
        assertFalse(a.equals(b));
        assertFalse(b.equals(a));
    }

    @Test
    public void testEqualsEscapeCharacterBothNonNullDifferent() {
        CSVFormat a = CSVFormat.DEFAULT.withEscape('\\');
        CSVFormat b = CSVFormat.DEFAULT.withEscape('/');
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsNullStringOneNull() {
        CSVFormat a = CSVFormat.DEFAULT.withNullString("NULL");
        CSVFormat b = CSVFormat.DEFAULT;
        assertFalse(a.equals(b));
        assertFalse(b.equals(a));
    }

    @Test
    public void testEqualsNullStringBothNonNullDifferent() {
        CSVFormat a = CSVFormat.DEFAULT.withNullString("NULL");
        CSVFormat b = CSVFormat.DEFAULT.withNullString("NIL");
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsHeaderDifferent() {
        CSVFormat a = CSVFormat.DEFAULT.withHeader("A", "B");
        CSVFormat b = CSVFormat.DEFAULT.withHeader("A", "C");
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsHeaderSame() {
        CSVFormat a = CSVFormat.DEFAULT.withHeader("A", "B");
        CSVFormat b = CSVFormat.DEFAULT.withHeader("A", "B");
        assertTrue(a.equals(b));
    }

    @Test
    public void testEqualsIgnoreSurroundingSpacesDifferent() {
        CSVFormat a = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true);
        CSVFormat b = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(false);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsIgnoreEmptyLinesDifferent() {
        CSVFormat a = CSVFormat.DEFAULT.withIgnoreEmptyLines(true);
        CSVFormat b = CSVFormat.DEFAULT.withIgnoreEmptyLines(false);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsSkipHeaderRecordDifferent() {
        CSVFormat a = CSVFormat.DEFAULT.withSkipHeaderRecord(true);
        CSVFormat b = CSVFormat.DEFAULT.withSkipHeaderRecord(false);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsRecordSeparatorOneNull() {
        CSVFormat a = CSVFormat.newFormat(',').withEscape('\\').withRecordSeparator("\n");
        CSVFormat b = CSVFormat.newFormat(',').withEscape('\\');
        assertFalse(a.equals(b));
        assertFalse(b.equals(a));
    }

    @Test
    public void testEqualsRecordSeparatorBothNonNullDifferent() {
        CSVFormat a = CSVFormat.DEFAULT.withRecordSeparator("\n");
        CSVFormat b = CSVFormat.DEFAULT.withRecordSeparator("\r");
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsFullyEqual() {
        CSVFormat a = CSVFormat.DEFAULT;
        CSVFormat b = CSVFormat.DEFAULT.withDelimiter(',');
        assertTrue(a.equals(b));
    }

    // ---------------------------------------------------------------
    // hashCode()
    // ---------------------------------------------------------------

    @Test
    public void testHashCodeConsistency() {
        CSVFormat a = CSVFormat.DEFAULT.withHeader("A", "B");
        CSVFormat b = CSVFormat.DEFAULT.withHeader("A", "B");
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testHashCodeDifferent() {
        CSVFormat a = CSVFormat.DEFAULT.withNullString("NULL");
        CSVFormat b = CSVFormat.DEFAULT.withNullString("NIL");
        assertNotEquals(a.hashCode(), b.hashCode());
    }

    // ---------------------------------------------------------------
    // toString()
    // ---------------------------------------------------------------

    @Test
    public void testToStringDefault() {
        String s = CSVFormat.DEFAULT.toString();
        assertTrue(s.contains("Delimiter=<,>"));
        assertTrue(s.contains("QuoteChar=<\">"));
        assertTrue(s.contains("SkipHeaderRecord:false"));
    }

    @Test
    public void testToStringWithAllOptions() {
        CSVFormat fmt = CSVFormat.DEFAULT
                .withEscape('\\')
                .withQuote('\'')
                .withCommentMarker('#')
                .withNullString("NULL")
                .withRecordSeparator("\r\n")
                .withIgnoreEmptyLines(true)
                .withIgnoreSurroundingSpaces(true)
                .withIgnoreHeaderCase(true)
                .withSkipHeaderRecord(true)
                .withHeaderComments("Comment")
                .withHeader("A", "B");

        String s = fmt.toString();
        assertTrue(s.contains("Escape=<\\>"));
        assertTrue(s.contains("QuoteChar=<'>"));
        assertTrue(s.contains("CommentStart=<#>"));
        assertTrue(s.contains("NullString=<NULL>"));
        assertTrue(s.contains("RecordSeparator=<\r\n>"));
        assertTrue(s.contains("EmptyLines:ignored"));
        assertTrue(s.contains("SurroundingSpaces:ignored"));
        assertTrue(s.contains("IgnoreHeaderCase:ignored"));
        assertTrue(s.contains("SkipHeaderRecord:true"));
        assertTrue(s.contains("HeaderComments:"));
        assertTrue(s.contains("Header:"));
    }

    @Test
    public void testToStringNoRecordSeparatorNoHeader() {
        CSVFormat fmt = CSVFormat.newFormat(',').withEscape('\\');
        String s = fmt.toString();
        assertFalse(s.contains("RecordSeparator="));
        assertFalse(s.contains("Header:"));
        assertFalse(s.contains("HeaderComments:"));
    }

    // ---------------------------------------------------------------
    // format()
    // ---------------------------------------------------------------

    @Test
    public void testFormatSimple() {
        // อาศัย CSVPrinter (ไม่ได้แสดง source) แต่พฤติกรรมพื้นฐานของค่าไม่มีตัวอักษรพิเศษ
        // ควรได้ผลลัพธ์ตรงไปตรงมา
        String result = CSVFormat.DEFAULT.format("a", "b", "c");
        assertEquals("a,b,c", result);
    }

    // ---------------------------------------------------------------
    // parse() / print()
    // ---------------------------------------------------------------

    @Test
    public void testParse() throws IOException {
        Reader reader = new StringReader("a,b,c");
        CSVParser parser = CSVFormat.DEFAULT.parse(reader);
        assertNotNull(parser);
        parser.close();
    }

    @Test
    public void testPrint() throws IOException {
        StringWriter sw = new StringWriter();
        CSVPrinter printer = CSVFormat.DEFAULT.print(sw);
        assertNotNull(printer);
        printer.close();
    }

    // ---------------------------------------------------------------
    // Predefined formats & enum
    // ---------------------------------------------------------------

    @Test
    public void testPredefinedFormats() {
        assertEquals(',', CSVFormat.DEFAULT.getDelimiter());
        assertTrue(CSVFormat.DEFAULT.getIgnoreEmptyLines());

        assertFalse(CSVFormat.RFC4180.getIgnoreEmptyLines());

        assertFalse(CSVFormat.EXCEL.getIgnoreEmptyLines());
        assertTrue(CSVFormat.EXCEL.getAllowMissingColumnNames());

        assertEquals('\t', CSVFormat.TDF.getDelimiter());
        assertTrue(CSVFormat.TDF.getIgnoreSurroundingSpaces());

        assertEquals('\t', CSVFormat.MYSQL.getDelimiter());
        assertNull(CSVFormat.MYSQL.getQuoteCharacter());
        assertEquals(Character.valueOf('\\'), CSVFormat.MYSQL.getEscapeCharacter());
        assertFalse(CSVFormat.MYSQL.getIgnoreEmptyLines());
    }

    @Test
    public void testMysqlNullString() {
        // NOTE: Javadoc ของ CSVFormat.MYSQL ระบุว่า nullString ควรเป็น "\\N"
        // (withNullString("\\N")) แต่ source ที่ให้มาไม่มีการเรียก .withNullString("\\N")
        // ใน static field MYSQL จริง ๆ  -> นี่คือ known fault (Defects4J Csv-13b)
        // Test นี้เขียนตามพฤติกรรมที่ "ตั้งใจ" ไว้ตาม Javadoc เพื่อดักจับ fault ดังกล่าว
        // และคาดว่าจะ FAIL บนซอร์สที่มีบั๊ก (ตรงตามจุดประสงค์ของ mutation/fault detection)
        assertEquals("\\N", CSVFormat.MYSQL.getNullString());
    }

    @Test
    public void testPredefinedEnumGetFormat() {
        assertSame(CSVFormat.DEFAULT, CSVFormat.Predefined.Default.getFormat());
        assertSame(CSVFormat.EXCEL, CSVFormat.Predefined.Excel.getFormat());
        assertSame(CSVFormat.MYSQL, CSVFormat.Predefined.MySQL.getFormat());
        assertSame(CSVFormat.RFC4180, CSVFormat.Predefined.RFC4180.getFormat());
        assertSame(CSVFormat.TDF, CSVFormat.Predefined.TDF.getFormat());
    }
}
```

## สรุปตาราง Test Method ↔ Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testNewFormatValidDelimiter | newFormat() ค่าเริ่มต้นทุก field เป็น null/false |
| testNewFormatDelimiterIsLF/CR | isLineBreak(char) true → throw ใน validate() |
| testValueOfPredefined / testValueOfInvalid | valueOf() ผ่าน/ไม่ผ่าน enum lookup |
| testWithDelimiterLineBreakLF/CR, testWithDelimiterValid | withDelimiter(char): isLineBreak true/false |
| testQuoteCharacterSameAsDelimiter | validate(): quoteCharacter!=null && ==delimiter |
| testEscapeCharacterSameAsDelimiter | validate(): escapeCharacter!=null && ==delimiter |
| testCommentMarkerSameAsDelimiter | validate(): commentMarker!=null && ==delimiter |
| testQuoteCharacterSameAsCommentMarker | validate(): quoteCharacter.equals(commentMarker) |
| testEscapeCharacterSameAsCommentMarker | validate(): escapeCharacter.equals(commentMarker) |
| testNoEscapeWithQuoteModeNone / testEscapeWithQuoteModeNoneOk | validate(): escape==null && quoteMode==NONE (throw/ไม่throw) |
| testDuplicateHeaderNames / testHeaderNoDuplicates | validate(): loop header, dupCheck.add() false/true |
| testHeaderNull / testHeaderEmpty | header==null vs header.length==0 |
| testWithCommentMarkerCharLineBreak/Null/Valid | isLineBreak(Character) true/false(null)/false |
| testWithEscapeCharLineBreak/Null/Valid | isLineBreak(Character) กรณี escape |
| testWithQuoteCharLineBreak/NullDisable/Valid | isLineBreak(Character) กรณี quote |
| testWithNullStringNull/Value | isNullStringSet() true/false |
| testWithIgnoreEmptyLines* / SurroundingSpaces* / HeaderCase* / AllowMissingColumnNames* / SkipHeaderRecord* | no-arg wrapper (true) vs explicit false |
| testWithRecordSeparatorChar/String | withRecordSeparator(char) → String.valueOf() |
| testWithHeaderCommentsNull/Values | toStringArray(): values==null, loop value==null/not null |
| testWithQuoteModeAll | withQuoteMode() setter |
| testWithHeaderResultSetNull/Valid | withHeader(ResultSet): null vs getMetaData() |
| testWithHeaderMetaDataNull/ZeroColumns/MultipleColumns | withHeader(ResultSetMetaData): metaData==null, loop 0 ครั้ง/หลายครั้ง |
| testEqualsSameInstance/Null/DifferentClass | equals(): this==obj, obj==null, class mismatch |
| testEqualsDifferentDelimiter | equals(): delimiter != |
| testEqualsQuoteModeOneNull/DifferentQuoteMode | equals(): quoteMode != |
| testEqualsQuoteCharacter* (OneNull/BothDifferent/BothEqual) | equals(): quoteCharacter null/not-null/equal/not-equal |
| testEqualsCommentMarker* | equals(): commentMarker null/not-null/equal |
| testEqualsEscapeCharacter* | equals(): escapeCharacter null/not-null/equal |
| testEqualsNullString* | equals(): nullString null/not-null/equal |
| testEqualsHeaderDifferent/Same | equals(): Arrays.equals(header,...) |
| testEqualsIgnoreSurroundingSpacesDifferent | equals(): ignoreSurroundingSpaces != |
| testEqualsIgnoreEmptyLinesDifferent | equals(): ignoreEmptyLines != |
| testEqualsSkipHeaderRecordDifferent | equals(): skipHeaderRecord != |
| testEqualsRecordSeparator* | equals(): recordSeparator null/not-null/equal |
| testEqualsFullyEqual | equals(): ผ่านทุก branch แบบ true |
| testHashCodeConsistency/Different | hashCode(): ternary null-check ต่าง ๆ |
| testToStringDefault/WithAllOptions/NoRecordSeparatorNoHeader | toString(): ทุก if (escape/quote/comment/nullString/recordSeparator/emptyLines/surroundingSpaces/headerCase/headerComments/header) true/false |
| testFormatSimple | format() basic happy path |
| testParse / testPrint | parse()/print() ทำงานไม่ throw |
| testPredefinedFormats | ตรวจ static fields DEFAULT/RFC4180/EXCEL/TDF/MYSQL |
| testMysqlNullString | **Fault detection**: ตรวจตาม Javadoc MYSQL.nullString ("\\N") ซึ่งอาจไม่ตรงกับ implementation จริง (Csv-13b) |
| testPredefinedEnumGetFormat | Predefined enum → getFormat() คืนค่า static field ที่ถูกต้อง |

**หมายเหตุสำคัญ:** `testMysqlNullString` เขียนขึ้นเพื่อดักจับ fault ที่ทราบใน Defects4J Csv-13b (การขาดการเรียก `.withNullString("\\N")` ใน static field `MYSQL`) โดยอ้างอิงจาก Javadoc ที่ให้มา — หากรันบนซอร์สที่มีบั๊กจริง test นี้จะ **FAIL**