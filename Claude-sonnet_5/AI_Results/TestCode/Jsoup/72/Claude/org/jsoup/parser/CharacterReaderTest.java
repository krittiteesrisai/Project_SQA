package org.jsoup.parser;

import org.jsoup.UncheckedIOException;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import static org.junit.Assert.*;

/**
 * Unit tests for {@link CharacterReader}.
 * หมายเหตุ: บางสมมติฐาน (เช่น ชนิด exception ที่ Validate.* โยน หรือค่า TokeniserState.nullChar)
 * ไม่ได้มีซอร์สโค้ดให้ตรวจสอบตรง ๆ จึงกำกับด้วยคอมเมนต์ไว้ตามจุดที่เกี่ยวข้อง
 */
public class CharacterReaderTest {

    // ---------- Constructors ----------

    @Test(expected = IllegalArgumentException.class)
    public void constructor_nullReader_throws() {
        // สมมติว่า Validate.notNull โยน IllegalArgumentException (แบบมาตรฐานของ jsoup Validate)
        new CharacterReader((Reader) null, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_readerNotSupportingMark_throws() {
        Reader r = new Reader() {
            @Override public int read(char[] cbuf, int off, int len) { return -1; }
            @Override public void close() {}
            @Override public boolean markSupported() { return false; }
        };
        new CharacterReader(r, 10);
    }

    @Test(expected = UncheckedIOException.class)
    public void constructor_ioExceptionDuringBufferUp_throwsUncheckedIOException() {
        Reader r = new Reader() {
            @Override public int read(char[] cbuf, int off, int len) throws IOException {
                throw new IOException("boom");
            }
            @Override public void close() {}
            @Override public boolean markSupported() { return true; }
            @Override public void mark(int readAheadLimit) throws IOException { /* no-op */ }
        };
        new CharacterReader(r, 10);
    }

    @Test
    public void constructor_fromString_initializesCorrectly() {
        CharacterReader r = new CharacterReader("abc");
        assertEquals(0, r.pos());
        assertFalse(r.isEmpty());
        assertEquals('a', r.current());
    }

    @Test
    public void constructor_emptyString() {
        CharacterReader r = new CharacterReader("");
        assertTrue(r.isEmpty());
        assertEquals(CharacterReader.EOF, r.current());
    }

    // ---------- pos/isEmpty/current/consume/unconsume/advance ----------

    @Test
    public void pos_and_isEmpty_and_current_and_consume() {
        CharacterReader r = new CharacterReader("AB");
        assertEquals(0, r.pos());
        assertFalse(r.isEmpty());
        assertEquals('A', r.current());
        assertEquals('A', r.consume());
        assertEquals(1, r.pos());
        assertEquals('B', r.consume());
        assertEquals(2, r.pos());
        assertTrue(r.isEmpty());
        assertEquals(CharacterReader.EOF, r.current());
        assertEquals(CharacterReader.EOF, r.consume());
    }

    @Test
    public void unconsume_movesBackOneChar() {
        CharacterReader r = new CharacterReader("AB");
        r.consume();
        r.unconsume();
        assertEquals('A', r.current());
    }

    @Test
    public void advance_movesPositionForward() {
        CharacterReader r = new CharacterReader("AB");
        r.advance();
        assertEquals('B', r.current());
    }

    @Test
    public void mark_and_rewindToMark() {
        CharacterReader r = new CharacterReader("ABCDE");
        r.consume();
        r.consume();
        r.mark();
        r.consume();
        r.consume();
        r.rewindToMark();
        assertEquals('C', r.current());
    }

    // ---------- nextIndexOf ----------

    @Test
    public void nextIndexOfChar_found() {
        CharacterReader r = new CharacterReader("abcde");
        assertEquals(3, r.nextIndexOf('d'));
    }

    @Test
    public void nextIndexOfChar_notFound() {
        CharacterReader r = new CharacterReader("abcde");
        assertEquals(-1, r.nextIndexOf('z'));
    }

    @Test
    public void nextIndexOfSeq_foundWithMismatchSkipping() {
        // ครอบคลุม: mismatch startChar -> while skip loop, partial match -> continue, full match -> found
        CharacterReader r = new CharacterReader("axab");
        assertEquals(2, r.nextIndexOf("ab"));
    }

    @Test
    public void nextIndexOfSeq_notFound() {
        CharacterReader r = new CharacterReader("xxxxx");
        assertEquals(-1, r.nextIndexOf("ab"));
    }

    // ---------- consumeTo(char) / consumeTo(String) ----------

    @Test
    public void consumeToChar_found() {
        CharacterReader r = new CharacterReader("abc,def");
        String s = r.consumeTo(',');
        assertEquals("abc", s);
        assertEquals(',', r.current());
    }

    @Test
    public void consumeToChar_notFound_consumesToEnd() {
        CharacterReader r = new CharacterReader("abcdef");
        String s = r.consumeTo('z');
        assertEquals("abcdef", s);
        assertTrue(r.isEmpty());
    }

    @Test
    public void consumeToString_found() {
        CharacterReader r = new CharacterReader("abcSTOPdef");
        String s = r.consumeTo("STOP");
        assertEquals("abc", s);
    }

    @Test
    public void consumeToString_notFound_consumesToEnd() {
        CharacterReader r = new CharacterReader("abcdef");
        String s = r.consumeTo("ZZZ");
        assertEquals("abcdef", s);
        assertTrue(r.isEmpty());
    }

    // ---------- consumeToAny ----------

    @Test
    public void consumeToAny_findsDelimiterAfterChars() {
        CharacterReader r = new CharacterReader("abcXdef");
        String s = r.consumeToAny('X', 'Y');
        assertEquals("abc", s);
        assertEquals('X', r.current());
    }

    @Test
    public void consumeToAny_immediateMatch_returnsEmptyString() {
        CharacterReader r = new CharacterReader("Xdef");
        String s = r.consumeToAny('X', 'Y');
        assertEquals("", s);
    }

    @Test
    public void consumeToAny_noDelimiterFound_consumesAll() {
        CharacterReader r = new CharacterReader("abcdef");
        String s = r.consumeToAny('X', 'Y');
        assertEquals("abcdef", s);
        assertTrue(r.isEmpty());
    }

    // ---------- consumeToAnySorted ----------

    @Test
    public void consumeToAnySorted_findsDelimiter() {
        CharacterReader r = new CharacterReader("abcXdef");
        String s = r.consumeToAnySorted('X', 'Y'); // ต้องเรียงลำดับ ascending ตาม Arrays.binarySearch
        assertEquals("abc", s);
    }

    @Test
    public void consumeToAnySorted_immediateMatch() {
        CharacterReader r = new CharacterReader("Xdef");
        String s = r.consumeToAnySorted('X', 'Y');
        assertEquals("", s);
    }

    // ---------- consumeData ----------

    @Test
    public void consumeData_stopsAtAmpersand() {
        CharacterReader r = new CharacterReader("abc&amp;");
        assertEquals("abc", r.consumeData());
        assertEquals('&', r.current());
    }

    @Test
    public void consumeData_stopsAtLessThan() {
        CharacterReader r = new CharacterReader("abc<div>");
        assertEquals("abc", r.consumeData());
        assertEquals('<', r.current());
    }

    @Test
    public void consumeData_stopsAtNullChar() {
        // สมมติว่า TokeniserState.nullChar == '\u0000' (ไม่มีซอร์ส TokeniserState ให้ตรวจสอบตรง ๆ)
        CharacterReader r = new CharacterReader("abc\u0000def");
        assertEquals("abc", r.consumeData());
    }

    @Test
    public void consumeData_noDelimiter_consumesAll() {
        CharacterReader r = new CharacterReader("abcdef");
        assertEquals("abcdef", r.consumeData());
        assertTrue(r.isEmpty());
    }

    // ---------- consumeTagName ----------

    @Test
    public void consumeTagName_stopsAtSpace() {
        CharacterReader r = new CharacterReader("div class");
        assertEquals("div", r.consumeTagName());
    }

    @Test
    public void consumeTagName_stopsAtSlash() {
        CharacterReader r = new CharacterReader("div/>");
        assertEquals("div", r.consumeTagName());
    }

    @Test
    public void consumeTagName_stopsAtGreaterThan() {
        CharacterReader r = new CharacterReader("div>");
        assertEquals("div", r.consumeTagName());
    }

    @Test
    public void consumeTagName_noDelimiter_consumesAll() {
        CharacterReader r = new CharacterReader("divtagname");
        assertEquals("divtagname", r.consumeTagName());
    }

    // ---------- consumeToEnd ----------

    @Test
    public void consumeToEnd_consumesRemaining() {
        CharacterReader r = new CharacterReader("abcdef");
        r.consume();
        String s = r.consumeToEnd();
        assertEquals("bcdef", s);
        assertTrue(r.isEmpty());
    }

    // ---------- consumeLetterSequence ----------

    @Test
    public void consumeLetterSequence_asciiLetters() {
        CharacterReader r = new CharacterReader("abcXYZ123");
        assertEquals("abcXYZ", r.consumeLetterSequence());
    }

    @Test
    public void consumeLetterSequence_unicodeLetter() {
        // Character.isLetter('\u03A9') == true (GREEK CAPITAL LETTER OMEGA)
        CharacterReader r = new CharacterReader("\u03A9abc123");
        assertEquals("\u03A9abc", r.consumeLetterSequence());
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
    public void consumeLetterThenDigitSequence_onlyDigits() {
        CharacterReader r = new CharacterReader("123abc");
        assertEquals("123", r.consumeLetterThenDigitSequence());
    }

    // ---------- consumeHexSequence ----------

    @Test
    public void consumeHexSequence_stopsAtNonHex() {
        CharacterReader r = new CharacterReader("1A2fg");
        assertEquals("1A2f", r.consumeHexSequence());
    }

    @Test
    public void consumeHexSequence_empty() {
        CharacterReader r = new CharacterReader("g123");
        assertEquals("", r.consumeHexSequence());
    }

    // ---------- consumeDigitSequence ----------

    @Test
    public void consumeDigitSequence_stopsAtNonDigit() {
        CharacterReader r = new CharacterReader("123abc");
        assertEquals("123", r.consumeDigitSequence());
    }

    @Test
    public void consumeDigitSequence_empty() {
        CharacterReader r = new CharacterReader("abc123");
        assertEquals("", r.consumeDigitSequence());
    }

    // ---------- matches(char) ----------

    @Test
    public void matchesChar_trueAndFalse() {
        CharacterReader r = new CharacterReader("a");
        assertTrue(r.matches('a'));
        assertFalse(r.matches('b'));
        r.consume();
        assertFalse(r.matches('a')); // isEmpty -> false
    }

    // ---------- matches(String) ----------

    @Test
    public void matchesString_tooLong_returnsFalse() {
        CharacterReader r = new CharacterReader("ab");
        assertFalse(r.matches("abcdef"));
    }

    @Test
    public void matchesString_mismatch_returnsFalse() {
        CharacterReader r = new CharacterReader("abcdef");
        assertFalse(r.matches("abX"));
    }

    @Test
    public void matchesString_match_returnsTrue() {
        CharacterReader r = new CharacterReader("abcdef");
        assertTrue(r.matches("abc"));
    }

    // ---------- matchesIgnoreCase ----------

    @Test
    public void matchesIgnoreCase_trueAndFalse() {
        CharacterReader r = new CharacterReader("AbCdef");
        assertTrue(r.matchesIgnoreCase("abc"));
        assertFalse(r.matchesIgnoreCase("xyz"));
        assertFalse(r.matchesIgnoreCase("abcdefgh")); // scanLength > remaining
    }

    // ---------- matchesAny ----------

    @Test
    public void matchesAny_emptyReader_returnsFalse() {
        CharacterReader r = new CharacterReader("");
        assertFalse(r.matchesAny('a', 'b'));
    }

    @Test
    public void matchesAny_matchFoundAndNotFound() {
        CharacterReader r = new CharacterReader("x");
        assertTrue(r.matchesAny('x', 'y'));
        assertFalse(r.matchesAny('a', 'b'));
    }

    // ---------- matchesAnySorted ----------

    @Test
    public void matchesAnySorted_trueAndFalse() {
        CharacterReader r = new CharacterReader("c");
        assertTrue(r.matchesAnySorted(new char[]{'a', 'b', 'c'}));
        assertFalse(r.matchesAnySorted(new char[]{'x', 'y', 'z'}));
    }

    @Test
    public void matchesAnySorted_emptyReader_returnsFalse() {
        CharacterReader r = new CharacterReader("");
        assertFalse(r.matchesAnySorted(new char[]{'a', 'b', 'c'}));
    }

    // ---------- matchesLetter ----------

    @Test
    public void matchesLetter_trueFalseAndEmpty() {
        CharacterReader r = new CharacterReader("a1");
        assertTrue(r.matchesLetter());
        r.consume();
        assertFalse(r.matchesLetter());
        r.consume();
        assertFalse(r.matchesLetter()); // isEmpty
    }

    // ---------- matchesDigit ----------

    @Test
    public void matchesDigit_trueFalseAndEmpty() {
        CharacterReader r = new CharacterReader("1a");
        assertTrue(r.matchesDigit());
        r.consume();
        assertFalse(r.matchesDigit());
        r.consume();
        assertFalse(r.matchesDigit()); // isEmpty
    }

    // ---------- matchConsume ----------

    @Test
    public void matchConsume_trueConsumesAndFalseLeavesPosition() {
        CharacterReader r = new CharacterReader("abcdef");
        assertTrue(r.matchConsume("abc"));
        assertEquals(3, r.pos());
        assertFalse(r.matchConsume("xyz"));
        assertEquals(3, r.pos()); // ไม่ถูกเลื่อน
    }

    // ---------- matchConsumeIgnoreCase ----------

    @Test
    public void matchConsumeIgnoreCase_trueAndFalse() {
        CharacterReader r = new CharacterReader("ABCdef");
        assertTrue(r.matchConsumeIgnoreCase("abc"));
        assertEquals(3, r.pos());
        assertFalse(r.matchConsumeIgnoreCase("xyz"));
    }

    // ---------- containsIgnoreCase ----------

    @Test
    public void containsIgnoreCase_foundLowerAndUpper() {
        CharacterReader r1 = new CharacterReader("blah blah </title> blah");
        assertTrue(r1.containsIgnoreCase("</title>"));

        CharacterReader r2 = new CharacterReader("blah blah </TITLE> blah");
        assertTrue(r2.containsIgnoreCase("</title>"));
    }

    @Test
    public void containsIgnoreCase_notFound() {
        CharacterReader r = new CharacterReader("blah blah blah");
        assertFalse(r.containsIgnoreCase("</title>"));
    }

    // ---------- toString ----------

    @Test
    public void toString_returnsRemainingContent() {
        CharacterReader r = new CharacterReader("abcdef");
        r.consume();
        r.consume();
        assertEquals("cdef", r.toString());
    }

    // ---------- cacheString / rangeEquals ----------

    @Test
    public void cacheString_shortString_cachedAndReused() {
        CharacterReader r = new CharacterReader("abc,abc,");
        String s1 = r.consumeTo(',');
        r.advance(); // skip ','
        String s2 = r.consumeTo(',');
        assertEquals("abc", s1);
        assertEquals("abc", s2);
        assertSame(s1, s2); // คาดว่าได้ reference เดียวกันจาก stringCache (cache hit)
    }

    @Test
    public void cacheString_longString_notCached() {
        String longStr = "abcdefghijklmnop"; // length 16 > maxStringCacheLen(12)
        CharacterReader r = new CharacterReader(longStr + ",");
        String s = r.consumeTo(',');
        assertEquals(longStr, s);
    }

    @Test
    public void rangeEquals_trueCase() {
        CharacterReader r = new CharacterReader("hello world");
        assertTrue(r.rangeEquals(0, 5, "hello"));
    }

    @Test
    public void rangeEquals_falseCase_differentLength() {
        CharacterReader r = new CharacterReader("hello world");
        assertFalse(r.rangeEquals(0, 5, "hell"));
    }

    @Test
    public void rangeEquals_falseCase_sameLengthDifferentContent() {
        CharacterReader r = new CharacterReader("hello world");
        assertFalse(r.rangeEquals(0, 5, "hallo"));
    }

    // ---------- bufferUp / multi-buffer behaviour ----------

    @Test
    public void bufferUp_multipleRefills_acrossSmallBuffer() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 50; i++) {
            sb.append((char) ('0' + (i % 10)));
        }
        String input = sb.toString(); // length 50
        Reader reader = new StringReader(input);
        CharacterReader r = new CharacterReader(reader, 20); // บัฟเฟอร์เล็กกว่า input บังคับ refill หลายรอบ

        StringBuilder consumedChars = new StringBuilder();
        for (int i = 0; i < 50; i++) {
            consumedChars.append(r.consume());
        }

        assertEquals(input, consumedChars.toString());
        assertTrue(r.isEmpty());
        assertEquals(CharacterReader.EOF, r.consume());
    }

    @Test
    public void bufferUp_noRefillNeeded_whenBufPosBelowSplitPoint() {
        CharacterReader r = new CharacterReader("abcdef");
        assertEquals('a', r.current());
        assertEquals('a', r.consume());
        assertEquals('b', r.current());
    }
}
