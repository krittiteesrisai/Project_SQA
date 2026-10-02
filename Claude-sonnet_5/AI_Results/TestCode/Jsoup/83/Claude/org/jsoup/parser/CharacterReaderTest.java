package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/**
 * JUnit4 test suite สำหรับ org.jsoup.parser.CharacterReader
 * วางไว้ใน package เดียวกันเพื่อเข้าถึง method ระดับ package-private ได้
 */
public class CharacterReaderTest {

    // ---------- Constructor tests ----------

    @Test(expected = IllegalArgumentException.class)
    public void constructor_nullReader_throws() {
        // Validate.notNull(input) -> IllegalArgumentException
        new CharacterReader((Reader) null, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_markNotSupported_throws() {
        // Validate.isTrue(input.markSupported())
        Reader r = new Reader() {
            @Override
            public int read(char[] cbuf, int off, int len) { return -1; }
            @Override
            public void close() { }
            @Override
            public boolean markSupported() { return false; }
        };
        new CharacterReader(r, 10);
    }

    @Test
    public void constructor_withReaderOnly_defaultSize_works() {
        CharacterReader r = new CharacterReader(new StringReader("abc"));
        assertEquals(0, r.pos());
        assertFalse(r.isEmpty());
    }

    @Test
    public void constructor_withString_setsSizeFromLength() {
        CharacterReader r = new CharacterReader("hello");
        assertEquals(0, r.pos());
        assertEquals('h', r.current());
    }

    @Test
    public void constructor_sizeGreaterThanMaxBuffer_clampedNoException() {
        // sz > maxBufferLen -> charBuf clamp ไป maxBufferLen, ต้องไม่ throw
        String big = buildRepeated('x', CharacterReader.maxBufferLen + 100);
        CharacterReader r = new CharacterReader(new StringReader(big), CharacterReader.maxBufferLen + 500);
        assertFalse(r.isEmpty());
    }

    // ---------- pos / isEmpty / current ----------

    @Test
    public void pos_initialAndAfterConsume() {
        CharacterReader r = new CharacterReader("abc");
        assertEquals(0, r.pos());
        r.consume();
        assertEquals(1, r.pos());
    }

    @Test
    public void isEmpty_trueForEmptyString() {
        CharacterReader r = new CharacterReader("");
        assertTrue(r.isEmpty());
    }

    @Test
    public void isEmpty_falseForNonEmpty() {
        CharacterReader r = new CharacterReader("a");
        assertFalse(r.isEmpty());
    }

    @Test
    public void current_onEmpty_returnsEOF() {
        CharacterReader r = new CharacterReader("");
        assertEquals(CharacterReader.EOF, r.current());
    }

    @Test
    public void current_returnsFirstChar_withoutAdvancing() {
        CharacterReader r = new CharacterReader("xy");
        assertEquals('x', r.current());
        assertEquals('x', r.current()); // ไม่เลื่อน pos
        assertEquals(0, r.pos());
    }

    // ---------- consume / unconsume / advance ----------

    @Test
    public void consume_readsAndAdvances() {
        CharacterReader r = new CharacterReader("ab");
        assertEquals('a', r.consume());
        assertEquals('b', r.consume());
        assertEquals(CharacterReader.EOF, r.consume());
    }

    @Test
    public void unconsume_movesBackOnePosition() {
        CharacterReader r = new CharacterReader("ab");
        r.consume();
        r.unconsume();
        assertEquals('a', r.consume());
    }

    @Test
    public void advance_movesPositionForward() {
        CharacterReader r = new CharacterReader("abc");
        r.advance();
        assertEquals('b', r.current());
    }

    // ---------- mark / rewindToMark ----------

    @Test
    public void mark_and_rewindToMark() {
        CharacterReader r = new CharacterReader("abcdef");
        r.consume();
        r.consume();
        r.mark();
        r.consume();
        r.consume();
        r.rewindToMark();
        assertEquals('c', r.current());
    }

    // ---------- nextIndexOf(char) ----------

    @Test
    public void nextIndexOfChar_found() {
        CharacterReader r = new CharacterReader("abcXde");
        assertEquals(3, r.nextIndexOf('X'));
    }

    @Test
    public void nextIndexOfChar_notFound_returnsMinusOne() {
        CharacterReader r = new CharacterReader("abcde");
        assertEquals(-1, r.nextIndexOf('Z'));
    }

    // ---------- nextIndexOf(CharSequence) ----------

    @Test
    public void nextIndexOfSeq_found_withWhileLoop() {
        // startChar ไม่ตรงตั้งแต่ offset แรก ต้องเข้า while loop สแกนหา
        CharacterReader r = new CharacterReader("xxxabc");
        assertEquals(3, r.nextIndexOf("abc"));
    }

    @Test
    public void nextIndexOfSeq_matchAtStart() {
        CharacterReader r = new CharacterReader("abcxyz");
        assertEquals(0, r.nextIndexOf("abc"));
    }

    @Test
    public void nextIndexOfSeq_notFound_tooShortBuffer() {
        // last > bufLength -> ข้าม inner for loop, ทดสอบ boundary branch
        CharacterReader r = new CharacterReader("ab");
        assertEquals(-1, r.nextIndexOf("abcd"));
    }

    @Test
    public void nextIndexOfSeq_notFound_noMatchAtAll() {
        CharacterReader r = new CharacterReader("abcdef");
        assertEquals(-1, r.nextIndexOf("zzz"));
    }

    // ---------- consumeTo(char) ----------

    @Test
    public void consumeToChar_found() {
        CharacterReader r = new CharacterReader("abc,def");
        assertEquals("abc", r.consumeTo(','));
        assertEquals(',', r.current());
    }

    @Test
    public void consumeToChar_notFound_consumesToEnd() {
        CharacterReader r = new CharacterReader("abcdef");
        assertEquals("abcdef", r.consumeTo('Z'));
        assertTrue(r.isEmpty());
    }

    @Test
    public void consumeToChar_immediateMatch_returnsEmpty() {
        CharacterReader r = new CharacterReader(",abc");
        assertEquals("", r.consumeTo(','));
    }

    // ---------- consumeTo(String) ----------

    @Test
    public void consumeToStringSeq_found() {
        CharacterReader r = new CharacterReader("hello</title>world");
        assertEquals("hello", r.consumeTo("</title>"));
    }

    @Test
    public void consumeToStringSeq_notFound_consumesToEnd() {
        CharacterReader r = new CharacterReader("hello world");
        assertEquals("hello world", r.consumeTo("ZZZZ"));
        assertTrue(r.isEmpty());
    }

    // ---------- consumeToAny ----------

    @Test
    public void consumeToAny_stopsAtDelimiter() {
        CharacterReader r = new CharacterReader("abc<def");
        String s = r.consumeToAny('<', '&');
        assertEquals("abc", s);
        assertEquals('<', r.current());
    }

    @Test
    public void consumeToAny_immediateMatch_returnsEmptyString() {
        CharacterReader r = new CharacterReader("<abc");
        assertEquals("", r.consumeToAny('<', '&'));
    }

    @Test
    public void consumeToAny_emptyDelimiterArray_consumesAll() {
        // chars ว่าง -> inner for loop ไม่ break -> consume ถึงสุด buffer
        CharacterReader r = new CharacterReader("abcdef");
        assertEquals("abcdef", r.consumeToAny());
    }

    // ---------- consumeToAnySorted ----------

    @Test
    public void consumeToAnySorted_stopsAtDelimiter() {
        CharacterReader r = new CharacterReader("abc&def");
        assertEquals("abc", r.consumeToAnySorted('&', '<'));
    }

    @Test
    public void consumeToAnySorted_immediateMatch_returnsEmpty() {
        CharacterReader r = new CharacterReader("&abc");
        assertEquals("", r.consumeToAnySorted('&', '<'));
    }

    // ---------- consumeData ----------

    @Test
    public void consumeData_stopsAtAmpersand() {
        CharacterReader r = new CharacterReader("text&amp;");
        assertEquals("text", r.consumeData());
    }

    @Test
    public void consumeData_stopsAtLt() {
        CharacterReader r = new CharacterReader("text<tag>");
        assertEquals("text", r.consumeData());
    }

    @Test
    public void consumeData_stopsAtNullChar() {
        CharacterReader r = new CharacterReader("text\u0000rest");
        assertEquals("text", r.consumeData());
    }

    @Test
    public void consumeData_immediateStop_returnsEmpty() {
        CharacterReader r = new CharacterReader("&amp;");
        assertEquals("", r.consumeData());
    }

    // ---------- consumeTagName ----------

    @Test
    public void consumeTagName_stopsAtSpace() {
        CharacterReader r = new CharacterReader("div class");
        assertEquals("div", r.consumeTagName());
    }

    @Test
    public void consumeTagName_stopsAtGt() {
        CharacterReader r = new CharacterReader("div>");
        assertEquals("div", r.consumeTagName());
    }

    @Test
    public void consumeTagName_stopsAtSlash() {
        CharacterReader r = new CharacterReader("div/>");
        assertEquals("div", r.consumeTagName());
    }

    @Test
    public void consumeTagName_stopsAtLt_outOfSpecBugFix() {
        CharacterReader r = new CharacterReader("div<p>");
        assertEquals("div", r.consumeTagName());
    }

    @Test
    public void consumeTagName_immediateStop_returnsEmpty() {
        CharacterReader r = new CharacterReader(">rest");
        assertEquals("", r.consumeTagName());
    }

    // ---------- consumeToEnd ----------

    @Test
    public void consumeToEnd_consumesRemaining() {
        CharacterReader r = new CharacterReader("abcdef");
        r.consume();
        assertEquals("bcdef", r.consumeToEnd());
        assertTrue(r.isEmpty());
    }

    // ---------- consumeLetterSequence ----------

    @Test
    public void consumeLetterSequence_asciiLetters() {
        CharacterReader r = new CharacterReader("abcXYZ123");
        assertEquals("abcXYZ", r.consumeLetterSequence());
    }

    @Test
    public void consumeLetterSequence_unicodeLetter_viaCharacterIsLetter() {
        CharacterReader r = new CharacterReader("caf\u00e9123"); // é เป็น letter แบบ unicode
        assertEquals("caf\u00e9", r.consumeLetterSequence());
    }

    @Test
    public void consumeLetterSequence_noLetters_returnsEmpty() {
        CharacterReader r = new CharacterReader("123abc");
        assertEquals("", r.consumeLetterSequence());
    }

    // ---------- consumeLetterThenDigitSequence ----------

    @Test
    public void consumeLetterThenDigitSequence_lettersThenDigits() {
        CharacterReader r = new CharacterReader("abc123xyz");
        assertEquals("abc123", r.consumeLetterThenDigitSequence());
    }

    @Test
    public void consumeLetterThenDigitSequence_lettersOnly_toEndOfBuffer() {
        // หลัง letter loop ชน EOF, isEmptyNoBufferUp() == true -> digit loop break ทันที
        CharacterReader r = new CharacterReader("abc");
        assertEquals("abc", r.consumeLetterThenDigitSequence());
    }

    @Test
    public void consumeLetterThenDigitSequence_noLettersNoDigits() {
        CharacterReader r = new CharacterReader("!!!abc");
        assertEquals("", r.consumeLetterThenDigitSequence());
    }

    // ---------- consumeHexSequence ----------

    @Test
    public void consumeHexSequence_mixedCaseHex() {
        CharacterReader r = new CharacterReader("1aF9GG");
        assertEquals("1aF9", r.consumeHexSequence());
    }

    @Test
    public void consumeHexSequence_noHexChars_returnsEmpty() {
        CharacterReader r = new CharacterReader("GGG");
        assertEquals("", r.consumeHexSequence());
    }

    // ---------- consumeDigitSequence ----------

    @Test
    public void consumeDigitSequence_digitsOnly() {
        CharacterReader r = new CharacterReader("12345abc");
        assertEquals("12345", r.consumeDigitSequence());
    }

    @Test
    public void consumeDigitSequence_noDigits_returnsEmpty() {
        CharacterReader r = new CharacterReader("abc123");
        assertEquals("", r.consumeDigitSequence());
    }

    // ---------- matches(char) ----------

    @Test
    public void matchesChar_trueAndFalse() {
        CharacterReader r = new CharacterReader("a");
        assertTrue(r.matches('a'));
        assertFalse(r.matches('b'));
    }

    @Test
    public void matchesChar_onEmpty_returnsFalse() {
        CharacterReader r = new CharacterReader("");
        assertFalse(r.matches('a'));
    }

    // ---------- matches(String) ----------

    @Test
    public void matchesString_true() {
        CharacterReader r = new CharacterReader("hello world");
        assertTrue(r.matches("hello"));
    }

    @Test
    public void matchesString_falseDifferentContent() {
        CharacterReader r = new CharacterReader("hello world");
        assertFalse(r.matches("world"));
    }

    @Test
    public void matchesString_scanLengthTooLong_returnsFalse() {
        CharacterReader r = new CharacterReader("ab");
        assertFalse(r.matches("abcde"));
    }

    // ---------- matchesIgnoreCase(String) ----------

    @Test
    public void matchesIgnoreCase_true() {
        CharacterReader r = new CharacterReader("HELLO world");
        assertTrue(r.matchesIgnoreCase("hello"));
    }

    @Test
    public void matchesIgnoreCase_false() {
        CharacterReader r = new CharacterReader("HELLO world");
        assertFalse(r.matchesIgnoreCase("world"));
    }

    @Test
    public void matchesIgnoreCase_scanTooLong_returnsFalse() {
        CharacterReader r = new CharacterReader("ab");
        assertFalse(r.matchesIgnoreCase("abcde"));
    }

    // ---------- matchesAny(char...) ----------

    @Test
    public void matchesAny_true() {
        CharacterReader r = new CharacterReader("<div>");
        assertTrue(r.matchesAny('<', '&'));
    }

    @Test
    public void matchesAny_false() {
        CharacterReader r = new CharacterReader("div>");
        assertFalse(r.matchesAny('<', '&'));
    }

    @Test
    public void matchesAny_onEmpty_returnsFalse() {
        CharacterReader r = new CharacterReader("");
        assertFalse(r.matchesAny('<', '&'));
    }

    // ---------- matchesAnySorted(char[]) ----------

    @Test
    public void matchesAnySorted_true() {
        CharacterReader r = new CharacterReader("&amp;");
        assertTrue(r.matchesAnySorted(new char[]{'&', '<'}));
    }

    @Test
    public void matchesAnySorted_false() {
        CharacterReader r = new CharacterReader("amp;");
        assertFalse(r.matchesAnySorted(new char[]{'&', '<'}));
    }

    // ---------- matchesLetter ----------

    @Test
    public void matchesLetter_asciiTrue() {
        CharacterReader r = new CharacterReader("a1");
        assertTrue(r.matchesLetter());
    }

    @Test
    public void matchesLetter_unicodeTrue() {
        CharacterReader r = new CharacterReader("\u00e9rest"); // é
        assertTrue(r.matchesLetter());
    }

    @Test
    public void matchesLetter_falseForDigit() {
        CharacterReader r = new CharacterReader("1a");
        assertFalse(r.matchesLetter());
    }

    @Test
    public void matchesLetter_onEmpty_returnsFalse() {
        CharacterReader r = new CharacterReader("");
        assertFalse(r.matchesLetter());
    }

    // ---------- matchesDigit ----------

    @Test
    public void matchesDigit_true() {
        CharacterReader r = new CharacterReader("9a");
        assertTrue(r.matchesDigit());
    }

    @Test
    public void matchesDigit_falseForLetter() {
        CharacterReader r = new CharacterReader("a9");
        assertFalse(r.matchesDigit());
    }

    @Test
    public void matchesDigit_onEmpty_returnsFalse() {
        CharacterReader r = new CharacterReader("");
        assertFalse(r.matchesDigit());
    }

    // ---------- matchConsume(String) ----------

    @Test
    public void matchConsume_trueAdvancesPos() {
        CharacterReader r = new CharacterReader("hello world");
        assertTrue(r.matchConsume("hello"));
        assertEquals(' ', r.current());
    }

    @Test
    public void matchConsume_falseDoesNotAdvance() {
        CharacterReader r = new CharacterReader("hello world");
        assertFalse(r.matchConsume("world"));
        assertEquals(0, r.pos());
    }

    // ---------- matchConsumeIgnoreCase(String) ----------

    @Test
    public void matchConsumeIgnoreCase_trueAdvancesPos() {
        CharacterReader r = new CharacterReader("HELLO world");
        assertTrue(r.matchConsumeIgnoreCase("hello"));
        assertEquals(' ', r.current());
    }

    @Test
    public void matchConsumeIgnoreCase_falseDoesNotAdvance() {
        CharacterReader r = new CharacterReader("HELLO world");
        assertFalse(r.matchConsumeIgnoreCase("world"));
        assertEquals(0, r.pos());
    }

    // ---------- containsIgnoreCase(String) ----------

    @Test
    public void containsIgnoreCase_foundViaLowerScan() {
        CharacterReader r = new CharacterReader("blah blah </title> blah");
        assertTrue(r.containsIgnoreCase("</title>"));
    }

    @Test
    public void containsIgnoreCase_foundViaUpperScanOnly() {
        // เนื้อหามีเฉพาะตัวพิมพ์ใหญ่ -> loScan หาไม่เจอ, hiScan เจอ
        CharacterReader r = new CharacterReader("blah </TITLE> blah");
        assertTrue(r.containsIgnoreCase("</title>"));
    }

    @Test
    public void containsIgnoreCase_notFound() {
        CharacterReader r = new CharacterReader("no tag here");
        assertFalse(r.containsIgnoreCase("</title>"));
    }

    // ---------- toString ----------

    @Test
    public void toString_returnsRemainingBuffer() {
        CharacterReader r = new CharacterReader("abcdef");
        r.consume();
        r.consume();
        assertEquals("cdef", r.toString());
    }

    // ---------- rangeEquals (package-visible test hook) ----------

    @Test
    public void rangeEquals_true() {
        CharacterReader r = new CharacterReader("abcdef");
        assertTrue(r.rangeEquals(0, 3, "abc"));
    }

    @Test
    public void rangeEquals_falseDifferentContent() {
        CharacterReader r = new CharacterReader("abcdef");
        assertFalse(r.rangeEquals(0, 3, "xyz"));
    }

    @Test
    public void rangeEquals_falseLengthMismatch() {
        CharacterReader r = new CharacterReader("abcdef");
        assertFalse(r.rangeEquals(0, 3, "abcd"));
    }

    // ---------- cacheString boundary ผ่าน consumeToAny (count > maxStringCacheLen) ----------

    @Test
    public void consumeToAny_longToken_bypassesCache_correctContent() {
        // ความยาว token > maxStringCacheLen(12) -> ไม่ใช้ cache แต่ยังต้องได้ค่าที่ถูกต้อง
        String longToken = "abcdefghijklmnopqrstuvwxyz"; // 26 ตัวอักษร
        CharacterReader r = new CharacterReader(longToken + "<end");
        assertEquals(longToken, r.consumeToAny('<'));
    }

    @Test
    public void consumeToAny_shortToken_usesCache_correctContent() {
        CharacterReader r = new CharacterReader("abc<end");
        assertEquals("abc", r.consumeToAny('<'));
    }

    // ---------- buffer refill (bufferUp) กับ input ขนาดใหญ่ ----------

    @Test
    public void bufferUp_largeInput_readsAllCorrectly() throws IOException {
        // สร้าง content ใหญ่กว่า maxBufferLen เพื่อบังคับให้ bufferUp() โหลดซ้ำหลายครั้ง
        int len = CharacterReader.maxBufferLen + 5000;
        String big = buildRepeated('z', len);
        CharacterReader r = new CharacterReader(new StringReader(big));

        int count = 0;
        while (!r.isEmpty()) {
            char c = r.consume();
            assertEquals('z', c);
            count++;
        }
        assertEquals(len, count);
        assertEquals(len, r.pos());
    }

    @Test
    public void bufferUp_consumeToEndAcrossBoundary_matchesWholeContent() {
        int len = CharacterReader.maxBufferLen + 10;
        String big = buildRepeated('q', len);
        CharacterReader r = new CharacterReader(new StringReader(big));
        String result = r.consumeToEnd();
        assertEquals(len, result.length());
        assertTrue(r.isEmpty());
    }

    // ---------- helper ----------

    private static String buildRepeated(char c, int len) {
        char[] arr = new char[len];
        for (int i = 0; i < len; i++) arr[i] = c;
        return new String(arr);
    }
}
