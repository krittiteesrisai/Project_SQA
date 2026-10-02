package org.apache.commons.csv;

import static org.apache.commons.csv.Constants.BACKSPACE;
import static org.apache.commons.csv.Constants.CR;
import static org.apache.commons.csv.Constants.END_OF_STREAM;
import static org.apache.commons.csv.Constants.FF;
import static org.apache.commons.csv.Constants.LF;
import static org.apache.commons.csv.Constants.TAB;
import static org.apache.commons.csv.Constants.UNDEFINED;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.StringReader;

import org.junit.Test;

/**
 * JUnit4 tests for {@link Lexer}.
 *
 * หมายเหตุ: Lexer เป็น abstract class จึงสร้าง concrete subclass ชั่วคราว (TestLexer)
 * เพื่อ instantiate สำหรับทดสอบ method ที่ implement แล้วทั้งหมด (nextToken ไม่ได้ถูกทดสอบ
 * เพราะไม่มี implementation จริงในซอร์สที่ให้มา - จะ return null เฉย ๆ)
 */
public class LexerTest {

    /** Concrete subclass สำหรับทดสอบ (nextToken ไม่ได้ใช้ในเทสนี้) */
    private static class TestLexer extends Lexer {
        TestLexer(final CSVFormat format, final ExtendedBufferedReader in) {
            super(format, in);
        }

        @Override
        Token nextToken(final Token reusableToken) throws IOException {
            // ไม่มี logic ให้ทดสอบตามซอร์สที่ให้มา (abstract method)
            return null;
        }
    }

    /** Helper: สร้าง ExtendedBufferedReader จาก String
     *  หมายเหตุ: สมมติว่า ExtendedBufferedReader มี constructor รับ java.io.Reader
     *  (ไม่มีซอร์สของคลาสนี้ให้ตรวจสอบตรง ๆ)
     */
    private ExtendedBufferedReader newReader(final String content) {
        return new ExtendedBufferedReader(new StringReader(content));
    }

    // ---------------------------------------------------------------
    // getLineNumber()
    // ---------------------------------------------------------------

    @Test
    public void testGetLineNumberDelegatesToReader() throws IOException {
        final ExtendedBufferedReader reader = newReader("a\nb\nc");
        final Lexer lexer = new TestLexer(CSVFormat.DEFAULT, reader);
        // getLineNumber() ต้อง delegate ไปยัง in.getLineNumber() ตรง ๆ
        assertEquals(reader.getLineNumber(), lexer.getLineNumber());
    }

    // ---------------------------------------------------------------
    // readEscape() - ครอบคลุมทุก case ของ switch
    // ---------------------------------------------------------------

    @Test
    public void testReadEscape_r_returnsCR() throws IOException {
        final Lexer lexer = new TestLexer(CSVFormat.DEFAULT, newReader("r"));
        assertEquals(CR, lexer.readEscape());
    }

    @Test
    public void testReadEscape_n_returnsLF() throws IOException {
        final Lexer lexer = new TestLexer(CSVFormat.DEFAULT, newReader("n"));
        assertEquals(LF, lexer.readEscape());
    }

    @Test
    public void testReadEscape_t_returnsTAB() throws IOException {
        final Lexer lexer = new TestLexer(CSVFormat.DEFAULT, newReader("t"));
        assertEquals(TAB, lexer.readEscape());
    }

    @Test
    public void testReadEscape_b_returnsBACKSPACE() throws IOException {
        final Lexer lexer = new TestLexer(CSVFormat.DEFAULT, newReader("b"));
        assertEquals(BACKSPACE, lexer.readEscape());
    }

    @Test
    public void testReadEscape_f_returnsFF() throws IOException {
        final Lexer lexer = new TestLexer(CSVFormat.DEFAULT, newReader("f"));
        assertEquals(FF, lexer.readEscape());
    }

    @Test
    public void testReadEscape_literalCR_returnsAsIs() throws IOException {
        final Lexer lexer = new TestLexer(CSVFormat.DEFAULT, newReader("\r"));
        assertEquals(CR, lexer.readEscape());
    }

    @Test
    public void testReadEscape_literalLF_returnsAsIs() throws IOException {
        final Lexer lexer = new TestLexer(CSVFormat.DEFAULT, newReader("\n"));
        assertEquals(LF, lexer.readEscape());
    }

    @Test
    public void testReadEscape_literalFF_returnsAsIs() throws IOException {
        final Lexer lexer = new TestLexer(CSVFormat.DEFAULT, newReader("\f"));
        assertEquals(FF, lexer.readEscape());
    }

    @Test
    public void testReadEscape_literalTAB_returnsAsIs() throws IOException {
        final Lexer lexer = new TestLexer(CSVFormat.DEFAULT, newReader("\t"));
        assertEquals(TAB, lexer.readEscape());
    }

    @Test
    public void testReadEscape_literalBACKSPACE_returnsAsIs() throws IOException {
        final Lexer lexer = new TestLexer(CSVFormat.DEFAULT, newReader("\b"));
        assertEquals(BACKSPACE, lexer.readEscape());
    }

    @Test(expected = IOException.class)
    public void testReadEscape_endOfStream_throwsIOException() throws IOException {
        // stream ว่าง -> read() จะคืนค่า END_OF_STREAM ทันที
        final Lexer lexer = new TestLexer(CSVFormat.DEFAULT, newReader(""));
        lexer.readEscape();
    }

    @Test
    public void testReadEscape_defaultCase_returnsCharAsIs() throws IOException {
        // ตัวอักษรที่ไม่ตรงกับ case ใด ๆ ต้อง fallthrough ไป default แล้ว return ตัวเอง
        final Lexer lexer = new TestLexer(CSVFormat.DEFAULT, newReader("x"));
        assertEquals('x', lexer.readEscape());
    }

    // ---------------------------------------------------------------
    // trimTrailingSpaces()
    // ---------------------------------------------------------------

    @Test
    public void testTrimTrailingSpaces_withTrailingWhitespace() {
        final StringBuilder sb = new StringBuilder("hello   \t\n");
        final Lexer lexer = new TestLexer(CSVFormat.DEFAULT, newReader(""));
        lexer.trimTrailingSpaces(sb);
        assertEquals("hello", sb.toString());
    }

    @Test
    public void testTrimTrailingSpaces_noTrailingWhitespace() {
        final StringBuilder sb = new StringBuilder("hello");
        final Lexer lexer = new TestLexer(CSVFormat.DEFAULT, newReader(""));
        lexer.trimTrailingSpaces(sb);
        assertEquals("hello", sb.toString());
    }

    @Test
    public void testTrimTrailingSpaces_emptyBuffer() {
        final StringBuilder sb = new StringBuilder("");
        final Lexer lexer = new TestLexer(CSVFormat.DEFAULT, newReader(""));
        lexer.trimTrailingSpaces(sb);
        assertEquals("", sb.toString());
    }

    @Test
    public void testTrimTrailingSpaces_allWhitespace() {
        final StringBuilder sb = new StringBuilder("   \t\n");
        final Lexer lexer = new TestLexer(CSVFormat.DEFAULT, newReader(""));
        lexer.trimTrailingSpaces(sb);
        assertEquals("", sb.toString());
    }

    // ---------------------------------------------------------------
    // readEndOfLine()
    // ---------------------------------------------------------------

    @Test
    public void testReadEndOfLine_CRLF_consumesLF() throws IOException {
        final ExtendedBufferedReader reader = newReader("\nX");
        final Lexer lexer = new TestLexer(CSVFormat.DEFAULT, reader);
        assertTrue(lexer.readEndOfLine(CR));
        // LF ถูก consume ไปแล้ว ตัวถัดไปที่อ่านได้ต้องเป็น 'X'
        assertEquals('X', reader.read());
    }

    @Test
    public void testReadEndOfLine_CROnly_doesNotConsumeNext() throws IOException {
        final ExtendedBufferedReader reader = newReader("X");
        final Lexer lexer = new TestLexer(CSVFormat.DEFAULT, reader);
        assertTrue(lexer.readEndOfLine(CR));
        // lookAhead ไม่ใช่ LF จึงไม่ถูก consume, 'X' ยังคงอ่านได้
        assertEquals('X', reader.read());
    }

    @Test
    public void testReadEndOfLine_LF_returnsTrue() throws IOException {
        final Lexer lexer = new TestLexer(CSVFormat.DEFAULT, newReader(""));
        assertTrue(lexer.readEndOfLine(LF));
    }

    @Test
    public void testReadEndOfLine_otherChar_returnsFalse() throws IOException {
        final Lexer lexer = new TestLexer(CSVFormat.DEFAULT, newReader(""));
        assertFalse(lexer.readEndOfLine('a'));
    }

    // ---------------------------------------------------------------
    // isWhitespace()
    // ---------------------------------------------------------------

    @Test
    public void testIsWhitespace_spaceIsWhitespace() {
        final Lexer lexer = new TestLexer(CSVFormat.DEFAULT, newReader(""));
        assertTrue(lexer.isWhitespace(' '));
    }

    @Test
    public void testIsWhitespace_nonWhitespaceChar() {
        final Lexer lexer = new TestLexer(CSVFormat.DEFAULT, newReader(""));
        assertFalse(lexer.isWhitespace('a'));
    }

    @Test
    public void testIsWhitespace_charEqualsDelimiter_shortCircuitsFalse() {
        // ตั้ง delimiter เป็น space เพื่อบังคับให้ c == delimiter (แม้เป็น whitespace ก็ต้อง false)
        final CSVFormat format = CSVFormat.DEFAULT.withDelimiter(' ');
        final Lexer lexer = new TestLexer(format, newReader(""));
        assertFalse(lexer.isWhitespace(' '));
    }

    // ---------------------------------------------------------------
    // isStartOfLine()
    // ---------------------------------------------------------------

    @Test
    public void testIsStartOfLine_LF() {
        final Lexer lexer = new TestLexer(CSVFormat.DEFAULT, newReader(""));
        assertTrue(lexer.isStartOfLine(LF));
    }

    @Test
    public void testIsStartOfLine_CR() {
        final Lexer lexer = new TestLexer(CSVFormat.DEFAULT, newReader(""));
        assertTrue(lexer.isStartOfLine(CR));
    }

    @Test
    public void testIsStartOfLine_UNDEFINED() {
        final Lexer lexer = new TestLexer(CSVFormat.DEFAULT, newReader(""));
        assertTrue(lexer.isStartOfLine(UNDEFINED));
    }

    @Test
    public void testIsStartOfLine_otherChar_false() {
        final Lexer lexer = new TestLexer(CSVFormat.DEFAULT, newReader(""));
        assertFalse(lexer.isStartOfLine('a'));
    }

    // ---------------------------------------------------------------
    // isEndOfFile()
    // ---------------------------------------------------------------

    @Test
    public void testIsEndOfFile_true() {
        final Lexer lexer = new TestLexer(CSVFormat.DEFAULT, newReader(""));
        assertTrue(lexer.isEndOfFile(END_OF_STREAM));
    }

    @Test
    public void testIsEndOfFile_false() {
        final Lexer lexer = new TestLexer(CSVFormat.DEFAULT, newReader(""));
        assertFalse(lexer.isEndOfFile('a'));
    }

    // ---------------------------------------------------------------
    // isDelimiter()
    // ---------------------------------------------------------------

    @Test
    public void testIsDelimiter_match() {
        final CSVFormat format = CSVFormat.DEFAULT.withDelimiter(',');
        final Lexer lexer = new TestLexer(format, newReader(""));
        assertTrue(lexer.isDelimiter(','));
    }

    @Test
    public void testIsDelimiter_noMatch() {
        final CSVFormat format = CSVFormat.DEFAULT.withDelimiter(',');
        final Lexer lexer = new TestLexer(format, newReader(""));
        assertFalse(lexer.isDelimiter('a'));
    }

    // ---------------------------------------------------------------
    // isEscape() - รวมถึงกรณี escape ถูก disable (null -> DISABLED)
    // ---------------------------------------------------------------

    @Test
    public void testIsEscape_enabledMatch() {
        final CSVFormat format = CSVFormat.DEFAULT.withEscape('\\');
        final Lexer lexer = new TestLexer(format, newReader(""));
        assertTrue(lexer.isEscape('\\'));
    }

    @Test
    public void testIsEscape_enabledNoMatch() {
        final CSVFormat format = CSVFormat.DEFAULT.withEscape('\\');
        final Lexer lexer = new TestLexer(format, newReader(""));
        assertFalse(lexer.isEscape('a'));
    }

    @Test
    public void testIsEscape_disabled_returnsFalseForOrdinaryChar() {
        final CSVFormat format = CSVFormat.DEFAULT.withEscape((Character) null);
        final Lexer lexer = new TestLexer(format, newReader(""));
        assertFalse(lexer.isEscape('\\'));
    }

    @Test
    public void testIsEscape_disabled_matchesDisabledSentinel() {
        // เมื่อ escape ถูก disable (null) constructor จะ map เป็นค่า sentinel '\ufffe'
        // ดังนั้น isEscape((int)'\ufffe') จะคืนค่า true ตามที่ระบุไว้ในซอร์ส (mapNullToDisabled)
        final CSVFormat format = CSVFormat.DEFAULT.withEscape((Character) null);
        final Lexer lexer = new TestLexer(format, newReader(""));
        assertTrue(lexer.isEscape((int) '\ufffe'));
    }

    // ---------------------------------------------------------------
    // isQuoteChar()
    // ---------------------------------------------------------------

    @Test
    public void testIsQuoteChar_enabledMatch() {
        final CSVFormat format = CSVFormat.DEFAULT.withQuoteChar('"');
        final Lexer lexer = new TestLexer(format, newReader(""));
        assertTrue(lexer.isQuoteChar('"'));
    }

    @Test
    public void testIsQuoteChar_enabledNoMatch() {
        final CSVFormat format = CSVFormat.DEFAULT.withQuoteChar('"');
        final Lexer lexer = new TestLexer(format, newReader(""));
        assertFalse(lexer.isQuoteChar('a'));
    }

    @Test
    public void testIsQuoteChar_disabled_matchesDisabledSentinel() {
        final CSVFormat format = CSVFormat.DEFAULT.withQuoteChar((Character) null);
        final Lexer lexer = new TestLexer(format, newReader(""));
        assertFalse(lexer.isQuoteChar('"'));
        assertTrue(lexer.isQuoteChar((int) '\ufffe'));
    }

    // ---------------------------------------------------------------
    // isCommentStart()
    // ---------------------------------------------------------------

    @Test
    public void testIsCommentStart_enabledMatch() {
        final CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#');
        final Lexer lexer = new TestLexer(format, newReader(""));
        assertTrue(lexer.isCommentStart('#'));
    }

    @Test
    public void testIsCommentStart_enabledNoMatch() {
        final CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#');
        final Lexer lexer = new TestLexer(format, newReader(""));
        assertFalse(lexer.isCommentStart('a'));
    }

    @Test
    public void testIsCommentStart_disabled_matchesDisabledSentinel() {
        final CSVFormat format = CSVFormat.DEFAULT.withCommentStart((Character) null);
        final Lexer lexer = new TestLexer(format, newReader(""));
        assertFalse(lexer.isCommentStart('#'));
        assertTrue(lexer.isCommentStart((int) '\ufffe'));
    }
}
