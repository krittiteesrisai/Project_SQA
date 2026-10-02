package org.apache.commons.csv;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.junit.Test;

/**
 * JUnit 4 tests for {@link CSVFormat} (Defects4J: Csv-15b).
 *
 * หมายเหตุ: หลายเงื่อนไขอ้างอิงค่าคงที่ private ใน Constants (เช่น COMMENT, SP)
 * ซึ่งไม่สามารถเข้าถึงได้ตรง ๆ จาก test — ในกรณีที่ต้องอาศัยสมมติฐานเกี่ยวกับค่าคงที่เหล่านี้
 * จะมีคอมเมนต์กำกับไว้อย่างชัดเจน
 */
public class CSVFormatTest {

    private enum SampleHeader {
        Col1, Col2, Col3
    }

    // ----------------------------------------------------------------
    // newFormat / valueOf
    // ----------------------------------------------------------------

    @Test
    public void testNewFormat_valid() {
        CSVFormat fmt = CSVFormat.newFormat(';');
        assertEquals(';', fmt.getDelimiter());
        assertNull(fmt.getQuoteCharacter());
        assertNull(fmt.getCommentMarker());
        assertNull(fmt.getEscapeCharacter());
        assertFalse(fmt.getIgnoreSurroundingSpaces());
        assertFalse(fmt.getIgnoreEmptyLines());
        assertNull(fmt.getRecordSeparator());
        assertNull(fmt.getNullString());
        assertNull(fmt.getHeaderComments());
        assertNull(fmt.getHeader());
        assertFalse(fmt.getSkipHeaderRecord());
        assertFalse(fmt.getAllowMissingColumnNames());
        assertFalse(fmt.getIgnoreHeaderCase());
        assertFalse(fmt.getTrim());
        assertFalse(fmt.getTrailingDelimiter());
        assertFalse(fmt.getAutoFlush());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewFormat_lineBreakDelimiter_LF_throws() {
        CSVFormat.newFormat('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewFormat_lineBreakDelimiter_CR_throws() {
        CSVFormat.newFormat('\r');
    }

    @Test
    public void testValueOf_Default() {
        CSVFormat fmt = CSVFormat.valueOf("Default");
        assertEquals(CSVFormat.DEFAULT, fmt);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOf_invalid_throws() {
        CSVFormat.valueOf("NoSuchFormat");
    }

    @Test
    public void testPredefinedEnum_getFormat() {
        assertEquals(CSVFormat.DEFAULT, CSVFormat.Predefined.Default.getFormat());
        assertEquals(CSVFormat.EXCEL, CSVFormat.Predefined.Excel.getFormat());
        assertEquals(CSVFormat.MYSQL, CSVFormat.Predefined.MySQL.getFormat());
        assertEquals(CSVFormat.RFC4180, CSVFormat.Predefined.RFC4180.getFormat());
        assertEquals(CSVFormat.TDF, CSVFormat.Predefined.TDF.getFormat());
    }

    // ----------------------------------------------------------------
    // Predefined formats field checks
    // ----------------------------------------------------------------

    @Test
    public void testPredefined_DEFAULT_settings() {
        assertEquals(',', CSVFormat.DEFAULT.getDelimiter());
        assertEquals(Character.valueOf('"'), CSVFormat.DEFAULT.getQuoteCharacter());
        assertNull(CSVFormat.DEFAULT.getCommentMarker());
        assertNull(CSVFormat.DEFAULT.getEscapeCharacter());
        assertFalse(CSVFormat.DEFAULT.getIgnoreSurroundingSpaces());
        assertTrue(CSVFormat.DEFAULT.getIgnoreEmptyLines());
        assertEquals("\r\n", CSVFormat.DEFAULT.getRecordSeparator());
    }

    @Test
    public void testPredefined_EXCEL_settings() {
        assertFalse(CSVFormat.EXCEL.getIgnoreEmptyLines());
        assertTrue(CSVFormat.EXCEL.getAllowMissingColumnNames());
    }

    @Test
    public void testPredefined_RFC4180_settings() {
        assertFalse(CSVFormat.RFC4180.getIgnoreEmptyLines());
    }

    @Test
    public void testPredefined_TDF_settings() {
        assertEquals('\t', CSVFormat.TDF.getDelimiter());
        assertTrue(CSVFormat.TDF.getIgnoreSurroundingSpaces());
    }

    @Test
    public void testPredefined_MYSQL_settings() {
        assertEquals('\t', CSVFormat.MYSQL.getDelimiter());
        assertNull(CSVFormat.MYSQL.getQuoteCharacter());
        assertEquals(Character.valueOf('\\'), CSVFormat.MYSQL.getEscapeCharacter());
        assertFalse(CSVFormat.MYSQL.getIgnoreEmptyLines());
        assertEquals("\n", CSVFormat.MYSQL.getRecordSeparator());
        assertEquals("\\N", CSVFormat.MYSQL.getNullString());
        assertEquals(QuoteMode.ALL_NON_NULL, CSVFormat.MYSQL.getQuoteMode());
    }

    @Test
    public void testPredefined_INFORMIX_UNLOAD_settings() {
        assertEquals('|', CSVFormat.INFORMIX_UNLOAD.getDelimiter());
        assertEquals(Character.valueOf('\\'), CSVFormat.INFORMIX_UNLOAD.getEscapeCharacter());
        assertEquals(Character.valueOf('"'), CSVFormat.INFORMIX_UNLOAD.getQuoteCharacter());
        assertEquals("\n", CSVFormat.INFORMIX_UNLOAD.getRecordSeparator());
    }

    @Test
    public void testPredefined_INFORMIX_UNLOAD_CSV_settings() {
        assertEquals(',', CSVFormat.INFORMIX_UNLOAD_CSV.getDelimiter());
        assertEquals(Character.valueOf('"'), CSVFormat.INFORMIX_UNLOAD_CSV.getQuoteCharacter());
        assertEquals("\n", CSVFormat.INFORMIX_UNLOAD_CSV.getRecordSeparator());
    }

    @Test
    public void testPredefined_POSTGRESQL_CSV_settings() {
        assertEquals(',', CSVFormat.POSTGRESQL_CSV.getDelimiter());
        assertEquals(Character.valueOf('"'), CSVFormat.POSTGRESQL_CSV.getEscapeCharacter());
        assertFalse(CSVFormat.POSTGRESQL_CSV.getIgnoreEmptyLines());
        assertEquals(Character.valueOf('"'), CSVFormat.POSTGRESQL_CSV.getQuoteCharacter());
        assertEquals("\n", CSVFormat.POSTGRESQL_CSV.getRecordSeparator());
        assertEquals("", CSVFormat.POSTGRESQL_CSV.getNullString());
        assertEquals(QuoteMode.ALL_NON_NULL, CSVFormat.POSTGRESQL_CSV.getQuoteMode());
    }

    @Test
    public void testPredefined_POSTGRESQL_TEXT_settings() {
        assertEquals('\t', CSVFormat.POSTGRESQL_TEXT.getDelimiter());
        assertEquals(Character.valueOf('"'), CSVFormat.POSTGRESQL_TEXT.getEscapeCharacter());
        assertEquals("\\N", CSVFormat.POSTGRESQL_TEXT.getNullString());
    }

    // ----------------------------------------------------------------
    // withDelimiter / withQuote / withEscape / withCommentMarker - line break & null checks
    // ----------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiter_LF_throws() {
        CSVFormat.DEFAULT.withDelimiter('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiter_CR_throws() {
        CSVFormat.DEFAULT.withDelimiter('\r');
    }

    @Test
    public void testWithDelimiter_valid() {
        CSVFormat fmt = CSVFormat.DEFAULT.withDelimiter(';');
        assertEquals(';', fmt.getDelimiter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_LF_throws() {
        CSVFormat.newFormat(',').withQuote('\n');
    }

    @Test
    public void testWithQuote_null() {
        CSVFormat fmt = CSVFormat.DEFAULT.withQuote((Character) null);
        assertNull(fmt.getQuoteCharacter());
        assertFalse(fmt.isQuoteCharacterSet());
    }

    @Test
    public void testWithQuote_charOverload() {
        CSVFormat fmt = CSVFormat.newFormat(',').withQuote('\'');
        assertEquals(Character.valueOf('\''), fmt.getQuoteCharacter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_LF_throws() {
        CSVFormat.newFormat(',').withEscape('\n');
    }

    @Test
    public void testWithEscape_null() {
        CSVFormat fmt = CSVFormat.DEFAULT.withEscape((Character) null);
        assertNull(fmt.getEscapeCharacter());
        assertFalse(fmt.isEscapeCharacterSet());
    }

    @Test
    public void testWithEscape_charOverload() {
        CSVFormat fmt = CSVFormat.DEFAULT.withEscape('\\');
        assertEquals(Character.valueOf('\\'), fmt.getEscapeCharacter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_LF_throws() {
        CSVFormat.newFormat(',').withCommentMarker('\n');
    }

    @Test
    public void testWithCommentMarker_null() {
        CSVFormat fmt = CSVFormat.DEFAULT.withCommentMarker((Character) null);
        assertNull(fmt.getCommentMarker());
        assertFalse(fmt.isCommentMarkerSet());
    }

    @Test
    public void testWithCommentMarker_charOverload() {
        CSVFormat fmt = CSVFormat.DEFAULT.withCommentMarker('#');
        assertEquals(Character.valueOf('#'), fmt.getCommentMarker());
    }

    // ----------------------------------------------------------------
    // validate() branches (via constructor invoked by with* methods)
    // ----------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_quoteCharEqualsDelimiter_throws() {
        CSVFormat.newFormat(',').withQuote(',');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_escapeEqualsDelimiter_throws() {
        CSVFormat.newFormat(',').withEscape(',');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_commentEqualsDelimiter_throws() {
        CSVFormat.newFormat(',').withCommentMarker(',');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_quoteEqualsComment_throws() {
        CSVFormat.newFormat(',').withQuote('#').withCommentMarker('#');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_escapeEqualsComment_throws() {
        CSVFormat.newFormat(',').withEscape('#').withCommentMarker('#');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_noEscapeAndQuoteModeNone_throws() {
        CSVFormat.newFormat(',').withQuoteMode(QuoteMode.NONE);
    }

    @Test
    public void testValidate_withEscapeAndQuoteModeNone_ok() {
        CSVFormat fmt = CSVFormat.newFormat(',').withEscape('\\').withQuoteMode(QuoteMode.NONE);
        assertEquals(QuoteMode.NONE, fmt.getQuoteMode());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_duplicateHeader_throws() {
        CSVFormat.DEFAULT.withHeader("a", "b", "a");
    }

    @Test
    public void testValidate_validConfig_noThrow() {
        CSVFormat fmt = CSVFormat.newFormat(',').withQuote('"').withEscape('\\')
                .withCommentMarker('#').withHeader("a", "b");
        assertNotNull(fmt);
    }

    // ----------------------------------------------------------------
    // equals()
    // ----------------------------------------------------------------

    @Test
    public void testEquals_sameInstance() {
        assertTrue(CSVFormat.DEFAULT.equals(CSVFormat.DEFAULT));
    }

    @Test
    public void testEquals_null() {
        assertFalse(CSVFormat.DEFAULT.equals(null));
    }

    @Test
    public void testEquals_differentClass() {
        assertFalse(CSVFormat.DEFAULT.equals("not a format"));
    }

    @Test
    public void testEquals_differentDelimiter() {
        assertFalse(CSVFormat.newFormat(',').equals(CSVFormat.newFormat(';')));
    }

    @Test
    public void testEquals_differentQuoteMode() {
        CSVFormat a = CSVFormat.DEFAULT.withEscape('\\').withQuoteMode(QuoteMode.ALL);
        CSVFormat b = CSVFormat.DEFAULT.withEscape('\\').withQuoteMode(QuoteMode.MINIMAL);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_quoteCharNullVsNotNull() {
        CSVFormat a = CSVFormat.newFormat(',').withQuote((Character) null);
        CSVFormat b = CSVFormat.newFormat(',').withQuote('"');
        assertFalse(a.equals(b));
        assertFalse(b.equals(a));
    }

    @Test
    public void testEquals_quoteCharDifferentValue() {
        CSVFormat a = CSVFormat.newFormat(',').withQuote('"');
        CSVFormat b = CSVFormat.newFormat(',').withQuote('\'');
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_quoteCharSameValue() {
        CSVFormat a = CSVFormat.newFormat(',').withQuote('"');
        CSVFormat b = CSVFormat.newFormat(',').withQuote('"');
        assertTrue(a.equals(b));
    }

    @Test
    public void testEquals_commentMarkerNullVsNotNull() {
        CSVFormat a = CSVFormat.newFormat(',');
        CSVFormat b = CSVFormat.newFormat(',').withCommentMarker('#');
        assertFalse(a.equals(b));
        assertFalse(b.equals(a));
    }

    @Test
    public void testEquals_commentMarkerSameValue() {
        CSVFormat a = CSVFormat.newFormat(',').withCommentMarker('#');
        CSVFormat b = CSVFormat.newFormat(',').withCommentMarker('#');
        assertTrue(a.equals(b));
    }

    @Test
    public void testEquals_escapeCharNullVsNotNull() {
        CSVFormat a = CSVFormat.newFormat(',');
        CSVFormat b = CSVFormat.newFormat(',').withEscape('\\');
        assertFalse(a.equals(b));
        assertFalse(b.equals(a));
    }

    @Test
    public void testEquals_escapeCharSameValue() {
        CSVFormat a = CSVFormat.newFormat(',').withEscape('\\');
        CSVFormat b = CSVFormat.newFormat(',').withEscape('\\');
        assertTrue(a.equals(b));
    }

    @Test
    public void testEquals_nullStringNullVsNotNull() {
        CSVFormat a = CSVFormat.DEFAULT;
        CSVFormat b = CSVFormat.DEFAULT.withNullString("NULL");
        assertFalse(a.equals(b));
        assertFalse(b.equals(a));
    }

    @Test
    public void testEquals_nullStringSameValue() {
        CSVFormat a = CSVFormat.DEFAULT.withNullString("NULL");
        CSVFormat b = CSVFormat.DEFAULT.withNullString("NULL");
        assertTrue(a.equals(b));
    }

    @Test
    public void testEquals_differentHeader() {
        CSVFormat a = CSVFormat.DEFAULT.withHeader("a", "b");
        CSVFormat b = CSVFormat.DEFAULT.withHeader("a", "c");
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentIgnoreSurroundingSpaces() {
        CSVFormat a = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true);
        CSVFormat b = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(false);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentIgnoreEmptyLines() {
        CSVFormat a = CSVFormat.DEFAULT.withIgnoreEmptyLines(true);
        CSVFormat b = CSVFormat.DEFAULT.withIgnoreEmptyLines(false);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentSkipHeaderRecord() {
        CSVFormat a = CSVFormat.DEFAULT.withSkipHeaderRecord(true);
        CSVFormat b = CSVFormat.DEFAULT.withSkipHeaderRecord(false);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_recordSeparatorNullVsNotNull() {
        CSVFormat a = CSVFormat.newFormat(',');
        CSVFormat b = CSVFormat.newFormat(',').withRecordSeparator("\n");
        assertFalse(a.equals(b));
        assertFalse(b.equals(a));
    }

    @Test
    public void testEquals_recordSeparatorSameValue() {
        CSVFormat a = CSVFormat.newFormat(',').withRecordSeparator("\n");
        CSVFormat b = CSVFormat.newFormat(',').withRecordSeparator("\n");
        assertTrue(a.equals(b));
    }

    @Test
    public void testEquals_fullyEqualDefault() {
        assertTrue(CSVFormat.DEFAULT.equals(CSVFormat.DEFAULT.withDelimiter(',')));
    }

    // ----------------------------------------------------------------
    // hashCode()
    // ----------------------------------------------------------------

    @Test
    public void testHashCode_consistency() {
        CSVFormat a = CSVFormat.DEFAULT;
        CSVFormat b = CSVFormat.DEFAULT.withDelimiter(',');
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testHashCode_withAllNullOptionalFields_noException() {
        CSVFormat fmt = CSVFormat.newFormat(',');
        int hash = fmt.hashCode();
        assertTrue(hash != Integer.MIN_VALUE || hash == Integer.MIN_VALUE); // no NPE - just ensure it runs
    }

    // ----------------------------------------------------------------
    // isXxxSet() / getters
    // ----------------------------------------------------------------

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
        assertTrue(CSVFormat.DEFAULT.withNullString("NULL").isNullStringSet());
    }

    @Test
    public void testIsQuoteCharacterSet() {
        assertTrue(CSVFormat.DEFAULT.isQuoteCharacterSet());
        assertFalse(CSVFormat.DEFAULT.withQuote((Character) null).isQuoteCharacterSet());
    }

    @Test
    public void testGetHeader_returnsClone() {
        CSVFormat fmt = CSVFormat.DEFAULT.withHeader("a", "b");
        String[] h1 = fmt.getHeader();
        h1[0] = "changed";
        String[] h2 = fmt.getHeader();
        assertEquals("a", h2[0]);
    }

    @Test
    public void testGetHeaderComments_returnsClone() {
        CSVFormat fmt = CSVFormat.DEFAULT.withHeaderComments("c1");
        String[] c1 = fmt.getHeaderComments();
        c1[0] = "changed";
        String[] c2 = fmt.getHeaderComments();
        assertEquals("c1", c2[0]);
    }

    // ----------------------------------------------------------------
    // format()
    // ----------------------------------------------------------------

    @Test
    public void testFormat_basic() {
        assertEquals("a,b,c", CSVFormat.DEFAULT.format("a", "b", "c"));
    }

    @Test
    public void testFormat_withSpecialChars() {
        assertEquals("\"a,b\",c", CSVFormat.DEFAULT.format("a,b", "c"));
    }

    // ----------------------------------------------------------------
    // parse() / print() / printer()
    // ----------------------------------------------------------------

    @Test
    public void testParse() throws IOException {
        Reader reader = new StringReader("a,b,c");
        CSVParser parser = CSVFormat.DEFAULT.parse(reader);
        assertNotNull(parser);
        parser.close();
    }

    @Test
    public void testPrint_Appendable() throws IOException {
        StringWriter sw = new StringWriter();
        CSVPrinter printer = CSVFormat.DEFAULT.print(sw);
        assertNotNull(printer);
        printer.close();
    }

    @Test
    public void testPrint_File() throws IOException {
        File tempFile = File.createTempFile("csvformattest", ".csv");
        tempFile.deleteOnExit();
        CSVPrinter printer = CSVFormat.DEFAULT.print(tempFile, StandardCharsets.UTF_8);
        printer.close();
    }

    @Test
    public void testPrint_Path() throws IOException {
        Path tempPath = Files.createTempFile("csvformattest", ".csv");
        tempPath.toFile().deleteOnExit();
        CSVPrinter printer = CSVFormat.DEFAULT.print(tempPath, StandardCharsets.UTF_8);
        printer.close();
    }

    @Test
    public void testPrinter_systemOut() throws IOException {
        CSVPrinter printer = CSVFormat.DEFAULT.printer();
        assertNotNull(printer);
        // ไม่เรียก close() เพื่อไม่ให้ System.out ถูกปิดกระทบเทสอื่น
    }

    // ----------------------------------------------------------------
    // print(Object, Appendable, boolean)
    // ----------------------------------------------------------------

    @Test
    public void testPrintObject_null_noNullString() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat.DEFAULT.print(null, sw, true);
        assertEquals("", sw.toString());
    }

    @Test
    public void testPrintObject_null_withNullString_quoteModeAll() throws IOException {
        CSVFormat fmt = CSVFormat.DEFAULT.withNullString("NULL").withQuoteMode(QuoteMode.ALL);
        StringWriter sw = new StringWriter();
        fmt.print(null, sw, true);
        assertEquals("\"NULL\"", sw.toString());
    }

    @Test
    public void testPrintObject_null_withNullString_quoteModeNotAll() throws IOException {
        CSVFormat fmt = CSVFormat.DEFAULT.withNullString("NULL"); // quoteMode = null -> not ALL
        StringWriter sw = new StringWriter();
        fmt.print(null, sw, true);
        assertEquals("NULL", sw.toString());
    }

    @Test
    public void testPrintObject_charSequenceValue() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat.DEFAULT.print("hello", sw, true);
        assertEquals("hello", sw.toString());
    }

    @Test
    public void testPrintObject_nonCharSequenceValue() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat.DEFAULT.print(Integer.valueOf(123), sw, true);
        assertEquals("123", sw.toString());
    }

    @Test
    public void testPrintObject_newRecordFalse_appendsDelimiter() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat.DEFAULT.print("a", sw, true);
        CSVFormat.DEFAULT.print("b", sw, false);
        assertEquals("a,b", sw.toString());
    }

    @Test
    public void testPrintObject_trimStringValue() throws IOException {
        CSVFormat fmt = CSVFormat.DEFAULT.withTrim(true);
        StringWriter sw = new StringWriter();
        fmt.print("  hi  ", sw, true);
        assertEquals("hi", sw.toString());
    }

    @Test
    public void testPrintObject_trimNonStringCharSequence() throws IOException {
        CSVFormat fmt = CSVFormat.DEFAULT.withTrim(true);
        StringWriter sw = new StringWriter();
        fmt.print(new StringBuilder("  hi  "), sw, true);
        assertEquals("hi", sw.toString());
    }

    // ----------------------------------------------------------------
    // printAndEscape (via print, no quote, escape set)
    // ----------------------------------------------------------------

    @Test
    public void testPrintAndEscape_viaPrint() throws IOException {
        CSVFormat fmt = CSVFormat.newFormat(',').withEscape('\\');
        StringWriter sw = new StringWriter();
        fmt.print("a,b\nc\rd\\e", sw, true);
        assertEquals("a\\,b\\nc\\rd\\\\e", sw.toString());
    }

    @Test
    public void testPrint_noQuoteNoEscape_plainAppend() throws IOException {
        CSVFormat fmt = CSVFormat.newFormat(',');
        StringWriter sw = new StringWriter();
        fmt.print("plain,value", sw, true);
        assertEquals("plain,value", sw.toString());
    }

    // ----------------------------------------------------------------
    // printAndQuote - QuoteMode branches
    // ----------------------------------------------------------------

    @Test
    public void testPrintAndQuote_modeALL() throws IOException {
        CSVFormat fmt = CSVFormat.newFormat(',').withQuote('"').withQuoteMode(QuoteMode.ALL);
        StringWriter sw = new StringWriter();
        fmt.print("simple", sw, true);
        assertEquals("\"simple\"", sw.toString());
    }

    @Test
    public void testPrintAndQuote_modeALL_NON_NULL() throws IOException {
        CSVFormat fmt = CSVFormat.newFormat(',').withQuote('"').withQuoteMode(QuoteMode.ALL_NON_NULL);
        StringWriter sw = new StringWriter();
        fmt.print("simple", sw, true);
        assertEquals("\"simple\"", sw.toString());
    }

    @Test
    public void testPrintAndQuote_modeNON_NUMERIC_number() throws IOException {
        CSVFormat fmt = CSVFormat.newFormat(',').withQuote('"').withQuoteMode(QuoteMode.NON_NUMERIC);
        StringWriter sw = new StringWriter();
        fmt.print(Integer.valueOf(42), sw, true);
        assertEquals("42", sw.toString());
    }

    @Test
    public void testPrintAndQuote_modeNON_NUMERIC_nonNumber() throws IOException {
        CSVFormat fmt = CSVFormat.newFormat(',').withQuote('"').withQuoteMode(QuoteMode.NON_NUMERIC);
        StringWriter sw = new StringWriter();
        fmt.print("text", sw, true);
        assertEquals("\"text\"", sw.toString());
    }

    @Test
    public void testPrintAndQuote_modeNONE() throws IOException {
        CSVFormat fmt = CSVFormat.newFormat(',').withQuote('"').withEscape('\\').withQuoteMode(QuoteMode.NONE);
        StringWriter sw = new StringWriter();
        fmt.print("a,b", sw, true);
        assertEquals("a\\,b", sw.toString());
    }

    @Test
    public void testPrintAndQuote_modeMINIMAL_emptyNewRecord() throws IOException {
        CSVFormat fmt = CSVFormat.newFormat(',').withQuote('"'); // quoteMode null -> MINIMAL
        StringWriter sw = new StringWriter();
        fmt.print("", sw, true);
        assertEquals("\"\"", sw.toString());
    }

    @Test
    public void testPrintAndQuote_modeMINIMAL_emptyNotNewRecord() throws IOException {
        CSVFormat fmt = CSVFormat.newFormat(',').withQuote('"');
        StringWriter sw = new StringWriter();
        fmt.print("a", sw, true);
        fmt.print("", sw, false);
        assertEquals("a,", sw.toString());
    }

    @Test
    public void testPrintAndQuote_modeMINIMAL_specialCharAtStart_newRecord() throws IOException {
        // ch = 0x01 < 0x20 -> เข้าเงื่อนไข newRecord && (c<0x20 ...) ทำให้ quote=true
        CSVFormat fmt = CSVFormat.newFormat(',').withQuote('"');
        StringWriter sw = new StringWriter();
        String val = "\u0001abc";
        fmt.print(val, sw, true);
        assertEquals("\"\u0001abc\"", sw.toString());
    }

    @Test
    public void testPrintAndQuote_modeMINIMAL_charLessEqualCommentAtStart_notNewRecord() throws IOException {
        // สมมติฐาน: Constants.COMMENT เป็นอักขระพิมพ์ได้ (เช่น '#' = 0x23)
        // อักขระควบคุม 0x01 <= COMMENT เสมอ และ newRecord=false ทำให้เงื่อนไขแรกไม่ทำงาน
        CSVFormat fmt = CSVFormat.newFormat(',').withQuote('"');
        StringWriter sw = new StringWriter();
        fmt.print("x", sw, true);
        fmt.print("\u0001abc", sw, false);
        assertEquals("x,\"\u0001abc\"", sw.toString());
    }

    @Test
    public void testPrintAndQuote_modeMINIMAL_containsDelimiterMidValue() throws IOException {
        CSVFormat fmt = CSVFormat.newFormat(',').withQuote('"');
        StringWriter sw = new StringWriter();
        fmt.print("abc,def", sw, true);
        assertEquals("\"abc,def\"", sw.toString());
    }

    @Test
    public void testPrintAndQuote_modeMINIMAL_containsQuoteCharMidValue() throws IOException {
        CSVFormat fmt = CSVFormat.newFormat(',').withQuote('"');
        StringWriter sw = new StringWriter();
        fmt.print("abc\"def", sw, true);
        assertEquals("\"abc\"\"def\"", sw.toString());
    }

    @Test
    public void testPrintAndQuote_modeMINIMAL_endsWithSpace() throws IOException {
        CSVFormat fmt = CSVFormat.newFormat(',').withQuote('"');
        StringWriter sw = new StringWriter();
        fmt.print("abc ", sw, true);
        assertEquals("\"abc \"", sw.toString());
    }

    @Test
    public void testPrintAndQuote_modeMINIMAL_noQuoteNeeded() throws IOException {
        CSVFormat fmt = CSVFormat.newFormat(',').withQuote('"');
        StringWriter sw = new StringWriter();
        fmt.print("simple", sw, true);
        assertEquals("simple", sw.toString());
    }

    // ----------------------------------------------------------------
    // println()
    // ----------------------------------------------------------------

    @Test
    public void testPrintln_trailingDelimiterTrue_recordSeparatorSet() throws IOException {
        CSVFormat fmt = CSVFormat.newFormat(',').withTrailingDelimiter(true).withRecordSeparator("\n");
        StringWriter sw = new StringWriter();
        fmt.println(sw);
        assertEquals(",\n", sw.toString());
    }

    @Test
    public void testPrintln_trailingDelimiterFalse_recordSeparatorNull() throws IOException {
        CSVFormat fmt = CSVFormat.newFormat(',');
        StringWriter sw = new StringWriter();
        fmt.println(sw);
        assertEquals("", sw.toString());
    }

    // ----------------------------------------------------------------
    // printRecord()
    // ----------------------------------------------------------------

    @Test
    public void testPrintRecord_multipleValues() throws IOException {
        CSVFormat fmt = CSVFormat.newFormat(',').withRecordSeparator("\n");
        StringWriter sw = new StringWriter();
        fmt.printRecord(sw, "a", "b", "c");
        assertEquals("a,b,c\n", sw.toString());
    }

    @Test
    public void testPrintRecord_emptyValues() throws IOException {
        CSVFormat fmt = CSVFormat.newFormat(',').withRecordSeparator("\n");
        StringWriter sw = new StringWriter();
        fmt.printRecord(sw); // loop ไม่ execute (values.length == 0)
        assertEquals("\n", sw.toString());
    }

    // ----------------------------------------------------------------
    // toString()
    // ----------------------------------------------------------------

    @Test
    public void testToString_defaultFormat() {
        String s = CSVFormat.DEFAULT.toString();
        assertTrue(s.contains("Delimiter=<,>"));
        assertTrue(s.contains("QuoteChar=<\">"));
        assertTrue(s.contains("RecordSeparator="));
        assertTrue(s.contains("EmptyLines:ignored"));
        assertTrue(s.contains("SkipHeaderRecord:false"));
        assertFalse(s.contains("Header:"));
    }

    @Test
    public void testToString_allOptionsSet() {
        CSVFormat fmt = CSVFormat.DEFAULT
                .withEscape('\\')
                .withCommentMarker('#')
                .withNullString("NULL")
                .withIgnoreSurroundingSpaces(true)
                .withIgnoreHeaderCase(true)
                .withHeader("a", "b")
                .withHeaderComments("comment1");
        String s = fmt.toString();
        assertTrue(s.contains("Escape=<\\>"));
        assertTrue(s.contains("CommentStart=<#>"));
        assertTrue(s.contains("NullString=<NULL>"));
        assertTrue(s.contains("SurroundingSpaces:ignored"));
        assertTrue(s.contains("IgnoreHeaderCase:ignored"));
        assertTrue(s.contains("Header:"));
        assertTrue(s.contains("HeaderComments:"));
    }

    // ----------------------------------------------------------------
    // withHeader (variadic, enum, ResultSet, ResultSetMetaData)
    // ----------------------------------------------------------------

    @Test
    public void testWithHeader_variadic() {
        CSVFormat fmt = CSVFormat.DEFAULT.withHeader("a", "b", "c");
        assertArrayEquals(new String[] {"a", "b", "c"}, fmt.getHeader());
    }

    @Test
    public void testWithHeader_nullVarargs() {
        CSVFormat fmt = CSVFormat.DEFAULT.withHeader((String[]) null);
        assertNull(fmt.getHeader());
    }

    @Test
    public void testWithHeader_emptyVarargs() {
        CSVFormat fmt = CSVFormat.DEFAULT.withHeader();
        assertArrayEquals(new String[] {}, fmt.getHeader());
    }

    @Test
    public void testWithHeader_enumClass() {
        CSVFormat fmt = CSVFormat.DEFAULT.withHeader(SampleHeader.class);
        assertArrayEquals(new String[] {"Col1", "Col2", "Col3"}, fmt.getHeader());
    }

    @Test
    public void testWithHeader_enumClassNull() {
        CSVFormat fmt = CSVFormat.DEFAULT.withHeader((Class<? extends Enum<?>>) null);
        assertNull(fmt.getHeader());
    }

    @Test
    public void testWithHeader_resultSet() throws SQLException {
        ResultSet rs = mock(ResultSet.class);
        ResultSetMetaData md = mock(ResultSetMetaData.class);
        when(rs.getMetaData()).thenReturn(md);
        when(md.getColumnCount()).thenReturn(2);
        when(md.getColumnLabel(1)).thenReturn("id");
        when(md.getColumnLabel(2)).thenReturn("name");
        CSVFormat fmt = CSVFormat.DEFAULT.withHeader(rs);
        assertArrayEquals(new String[] {"id", "name"}, fmt.getHeader());
    }

    @Test
    public void testWithHeader_resultSetNull() throws SQLException {
        CSVFormat fmt = CSVFormat.DEFAULT.withHeader((ResultSet) null);
        assertNull(fmt.getHeader());
    }

    @Test
    public void testWithHeader_resultSetMetaDataNull() throws SQLException {
        CSVFormat fmt = CSVFormat.DEFAULT.withHeader((ResultSetMetaData) null);
        assertNull(fmt.getHeader());
    }

    @Test
    public void testWithFirstRecordAsHeader() {
        CSVFormat fmt = CSVFormat.DEFAULT.withFirstRecordAsHeader();
        assertArrayEquals(new String[] {}, fmt.getHeader());
        assertTrue(fmt.getSkipHeaderRecord());
    }

    // ----------------------------------------------------------------
    // withHeaderComments / toStringArray()
    // ----------------------------------------------------------------

    @Test
    public void testWithHeaderComments() {
        CSVFormat fmt = CSVFormat.DEFAULT.withHeaderComments("c1", "c2");
        assertArrayEquals(new String[] {"c1", "c2"}, fmt.getHeaderComments());
    }

    @Test
    public void testWithHeaderComments_null() {
        CSVFormat fmt = CSVFormat.DEFAULT.withHeaderComments((Object[]) null);
        assertNull(fmt.getHeaderComments());
    }

    @Test
    public void testWithHeaderComments_containsNullElement() {
        CSVFormat fmt = CSVFormat.DEFAULT.withHeaderComments("c1", null, "c3");
        assertArrayEquals(new String[] {"c1", null, "c3"}, fmt.getHeaderComments());
    }

    // ----------------------------------------------------------------
    // ตัว with* setter อื่น ๆ (no-arg overload / value overload)
    // ----------------------------------------------------------------

    @Test
    public void testWithIgnoreEmptyLines_noArg() {
        assertTrue(CSVFormat.newFormat(',').withIgnoreEmptyLines().getIgnoreEmptyLines());
    }

    @Test
    public void testWithIgnoreHeaderCase_noArg() {
        assertTrue(CSVFormat.newFormat(',').withIgnoreHeaderCase().getIgnoreHeaderCase());
    }

    @Test
    public void testWithIgnoreSurroundingSpaces_noArg() {
        assertTrue(CSVFormat.newFormat(',').withIgnoreSurroundingSpaces().getIgnoreSurroundingSpaces());
    }

    @Test
    public void testWithSkipHeaderRecord_noArg() {
        assertTrue(CSVFormat.newFormat(',').withSkipHeaderRecord().getSkipHeaderRecord());
    }

    @Test
    public void testWithTrailingDelimiter_noArg() {
        assertTrue(CSVFormat.newFormat(',').withTrailingDelimiter().getTrailingDelimiter());
    }

    @Test
    public void testWithTrim_noArg() {
        assertTrue(CSVFormat.newFormat(',').withTrim().getTrim());
    }

    @Test
    public void testWithAllowMissingColumnNames_noArg() {
        assertTrue(CSVFormat.newFormat(',').withAllowMissingColumnNames().getAllowMissingColumnNames());
    }

    @Test
    public void testWithAutoFlush() {
        assertTrue(CSVFormat.newFormat(',').withAutoFlush(true).getAutoFlush());
    }

    @Test
    public void testWithRecordSeparator_char() {
        assertEquals("\n", CSVFormat.newFormat(',').withRecordSeparator('\n').getRecordSeparator());
    }

    @Test
    public void testWithRecordSeparator_string() {
        assertEquals("\r\n", CSVFormat.newFormat(',').withRecordSeparator("\r\n").getRecordSeparator());
    }

    @Test
    public void testWithQuoteMode() {
        CSVFormat fmt = CSVFormat.newFormat(',').withEscape('\\').withQuoteMode(QuoteMode.NONE);
        assertEquals(QuoteMode.NONE, fmt.getQuoteMode());
    }

    @Test
    public void testWithNullString() {
        assertEquals("N/A", CSVFormat.DEFAULT.withNullString("N/A").getNullString());
    }

    @Test
    public void testWithSkipHeaderRecord_valueOverload() {
        assertTrue(CSVFormat.DEFAULT.withSkipHeaderRecord(true).getSkipHeaderRecord());
        assertFalse(CSVFormat.DEFAULT.withSkipHeaderRecord(false).getSkipHeaderRecord());
    }
}
