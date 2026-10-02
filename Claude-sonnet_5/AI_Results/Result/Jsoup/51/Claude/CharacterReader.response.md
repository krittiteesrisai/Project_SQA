```java
package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit4 test suite for org.jsoup.parser.CharacterReader
 *
 * หมายเหตุ:
 * - CharacterReader เป็น package-private class จึงต้องวางไฟล์ทดสอบนี้ไว้ใน package เดียวกัน
 *   (org.jsoup.parser) เพื่อให้สามารถเข้าถึงได้โดยตรงโดยไม่ต้องใช้ reflection
 * - สมมติฐาน (assumption) ที่ใช้ในชุดทดสอบนี้ (ระบุไว้เป็นคอมเมนต์กำกับ):
 *   1) org.jsoup.helper.Validate.notNull(...) จะ throw IllegalArgumentException เมื่อค่าเป็น null
 *      (ตาม implementation จริงของ jsoup ที่ CharacterReader พึ่งพา)
 *   2) TokeniserState.nullChar มีค่าเท่ากับ '\u0000' (null character) ตาม source ของ jsoup
 */
public class CharacterReaderTest {

    // ---------- Constructor ----------

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullThrows() {
        // สมมติฐาน: Validate.notNull throw IllegalArgumentException
        new CharacterReader(null);
    }

    @Test
    public void testConstructorEmptyString() {
        CharacterReader r = new CharacterReader("");
        assertTrue(r.isEmpty());
        assertEquals(0, r.pos());
        assertEquals(CharacterReader.EOF, r.current());
    }

    // ---------- pos(), isEmpty(), current(), consume(), unconsume(), advance() ----------

    @Test
    public void testPosAndIsEmptyBoundary() {
        CharacterReader r = new CharacterReader("a");
        assertEquals(0, r.pos());
        assertFalse(r.isEmpty());
        r.advance();
        assertTrue(r.isEmpty()); // pos >= length branch true
        assertEquals(1, r.pos());
    }

    @Test
    public void testCurrentWithinAndAtEnd() {
        CharacterReader r = new CharacterReader("ab");
        assertEquals('a', r.current()); // pos < length branch
        r.advance();
        r.advance();
        assertEquals(CharacterReader.EOF, r.current()); // pos >= length branch
    }

    @Test
    public void testConsumeNormalAndAtEOF() {
        CharacterReader r = new CharacterReader("ab");
        assertEquals('a', r.consume());
        assertEquals('b', r.consume());
        assertEquals(CharacterReader.EOF, r.consume()); // pos >= length branch
        assertEquals(3, r.pos());
    }

    @Test
    public void testUnconsume() {
        CharacterReader r = new CharacterReader("ab");
        r.consume();
        r.unconsume();
        assertEquals(0, r.pos());
        assertEquals('a', r.consume());
    }

    @Test
    public void testAdvance() {
        CharacterReader r = new CharacterReader("abc");
        r.advance();
        assertEquals(1, r.pos());
    }

    // ---------- mark(), rewindToMark() ----------

    @Test
    public void testMarkAndRewind() {
        CharacterReader r = new CharacterReader("abcdef");
        r.consume();
        r.consume();
        r.mark();
        r.consume();
        r.consume();
        r.rewindToMark();
        assertEquals(2, r.pos());
    }

    // ---------- consumeAsString() ----------

    @Test
    public void testConsumeAsString() {
        CharacterReader r = new CharacterReader("xy");
        assertEquals("x", r.consumeAsString());
        assertEquals("y", r.consumeAsString());
        assertEquals(2, r.pos());
    }

    // ---------- nextIndexOf(char) ----------

    @Test
    public void testNextIndexOfCharFound() {
        CharacterReader r = new CharacterReader("abcdef");
        assertEquals(3, r.nextIndexOf('d'));
    }

    @Test
    public void testNextIndexOfCharNotFound() {
        CharacterReader r = new CharacterReader("abcdef");
        assertEquals(-1, r.nextIndexOf('z'));
    }

    // ---------- nextIndexOf(CharSequence) ----------

    @Test
    public void testNextIndexOfSeqFound() {
        CharacterReader r = new CharacterReader("xxabcxx");
        assertEquals(2, r.nextIndexOf("abc"));
    }

    @Test
    public void testNextIndexOfSeqNotFound() {
        CharacterReader r = new CharacterReader("xxabcxx");
        assertEquals(-1, r.nextIndexOf("zzz"));
    }

    @Test
    public void testNextIndexOfSeqWithMismatchSkipping() {
        // startChar mismatch forces internal while loop to skip ahead
        CharacterReader r = new CharacterReader("zzzzzabc");
        assertEquals(5, r.nextIndexOf("abc"));
    }

    @Test
    public void testNextIndexOfSeqTooLongNearEnd() {
        // seq ไม่พอดีกับความยาวที่เหลือ (last > length) -> ต้อง return -1
        CharacterReader r = new CharacterReader("ab");
        assertEquals(-1, r.nextIndexOf("abcdef"));
    }

    @Test
    public void testNextIndexOfSeqSingleChar() {
        CharacterReader r = new CharacterReader("hello");
        assertEquals(4, r.nextIndexOf("o"));
    }

    // ---------- consumeTo(char) ----------

    @Test
    public void testConsumeToCharFound() {
        CharacterReader r = new CharacterReader("foo,bar");
        String s = r.consumeTo(',');
        assertEquals("foo", s);
        assertEquals(3, r.pos());
    }

    @Test
    public void testConsumeToCharNotFoundConsumesToEnd() {
        CharacterReader r = new CharacterReader("foobar");
        String s = r.consumeTo('z');
        assertEquals("foobar", s);
        assertTrue(r.isEmpty());
    }

    // ---------- consumeTo(String) ----------

    @Test
    public void testConsumeToStringFound() {
        CharacterReader r = new CharacterReader("foo</div>bar");
        String s = r.consumeTo("</div>");
        assertEquals("foo", s);
    }

    @Test
    public void testConsumeToStringNotFoundConsumesToEnd() {
        CharacterReader r = new CharacterReader("foobar");
        String s = r.consumeTo("zzz");
        assertEquals("foobar", s);
        assertTrue(r.isEmpty());
    }

    // ---------- consumeToAny ----------

    @Test
    public void testConsumeToAnyStopsAtMatch() {
        CharacterReader r = new CharacterReader("foo bar");
        String s = r.consumeToAny(' ', '\t');
        assertEquals("foo", s);
    }

    @Test
    public void testConsumeToAnyNoMatchConsumesAllReturnsEmptyIfNothingConsumed() {
        // pos == start ตั้งแต่แรก (empty input) -> ต้อง return ""
        CharacterReader r = new CharacterReader("");
        String s = r.consumeToAny(' ', '\t');
        assertEquals("", s);
    }

    @Test
    public void testConsumeToAnyConsumesWholeInputWhenNoCharMatches() {
        CharacterReader r = new CharacterReader("foobar");
        String s = r.consumeToAny('z');
        assertEquals("foobar", s);
    }

    // ---------- consumeToAnySorted ----------

    @Test
    public void testConsumeToAnySortedStopsAtMatch() {
        CharacterReader r = new CharacterReader("foo bar");
        char[] sorted = {' ', '\t'}; // ต้อง sorted สำหรับ binarySearch
        String s = r.consumeToAnySorted(sorted);
        assertEquals("foo", s);
    }

    @Test
    public void testConsumeToAnySortedEmptyWhenNothingConsumed() {
        CharacterReader r = new CharacterReader("");
        char[] sorted = {' '};
        assertEquals("", r.consumeToAnySorted(sorted));
    }

    // ---------- consumeData ----------

    @Test
    public void testConsumeDataStopsAtAmp() {
        CharacterReader r = new CharacterReader("foo&bar");
        assertEquals("foo", r.consumeData());
    }

    @Test
    public void testConsumeDataStopsAtLt() {
        CharacterReader r = new CharacterReader("foo<bar");
        assertEquals("foo", r.consumeData());
    }

    @Test
    public void testConsumeDataStopsAtNullChar() {
        // สมมติฐาน: TokeniserState.nullChar == '\u0000'
        CharacterReader r = new CharacterReader("foo\u0000bar");
        assertEquals("foo", r.consumeData());
    }

    @Test
    public void testConsumeDataNoSpecialCharConsumesAll() {
        CharacterReader r = new CharacterReader("foobar");
        assertEquals("foobar", r.consumeData());
    }

    // ---------- consumeTagName ----------

    @Test
    public void testConsumeTagNameStopsAtWhitespace() {
        CharacterReader r = new CharacterReader("div class");
        assertEquals("div", r.consumeTagName());
    }

    @Test
    public void testConsumeTagNameStopsAtSlash() {
        CharacterReader r = new CharacterReader("div/");
        assertEquals("div", r.consumeTagName());
    }

    @Test
    public void testConsumeTagNameStopsAtGt() {
        CharacterReader r = new CharacterReader("div>");
        assertEquals("div", r.consumeTagName());
    }

    @Test
    public void testConsumeTagNameStopsAtNullChar() {
        CharacterReader r = new CharacterReader("div\u0000");
        assertEquals("div", r.consumeTagName());
    }

    @Test
    public void testConsumeTagNameConsumesAllWhenNoStopChar() {
        CharacterReader r = new CharacterReader("divname");
        assertEquals("divname", r.consumeTagName());
    }

    // ---------- consumeToEnd ----------

    @Test
    public void testConsumeToEnd() {
        CharacterReader r = new CharacterReader("abcdef");
        r.consume();
        String s = r.consumeToEnd();
        assertEquals("bcdef", s);
        assertTrue(r.isEmpty());
    }

    @Test
    public void testConsumeToEndLongStringBypassesCache() {
        // ความยาว > maxCacheLen (12) เพื่อทดสอบ branch "count > maxCacheLen" ใน cacheString
        String longStr = "abcdefghijklmnopqrstuvwxyz"; // length 26 > 12
        CharacterReader r = new CharacterReader(longStr);
        assertEquals(longStr, r.consumeToEnd());
    }

    // ---------- consumeLetterSequence ----------

    @Test
    public void testConsumeLetterSequence() {
        CharacterReader r = new CharacterReader("abcXYZ123");
        assertEquals("abcXYZ", r.consumeLetterSequence());
    }

    @Test
    public void testConsumeLetterSequenceNoLetters() {
        CharacterReader r = new CharacterReader("123abc");
        assertEquals("", r.consumeLetterSequence());
    }

    @Test
    public void testConsumeLetterSequenceEntireInput() {
        CharacterReader r = new CharacterReader("abcXYZ");
        assertEquals("abcXYZ", r.consumeLetterSequence());
        assertTrue(r.isEmpty());
    }

    // ---------- consumeLetterThenDigitSequence ----------

    @Test
    public void testConsumeLetterThenDigitSequence() {
        CharacterReader r = new CharacterReader("abc123xyz");
        assertEquals("abc123", r.consumeLetterThenDigitSequence());
    }

    @Test
    public void testConsumeLetterThenDigitSequenceNoDigits() {
        CharacterReader r = new CharacterReader("abcxyz");
        assertEquals("abcxyz", r.consumeLetterThenDigitSequence());
    }

    @Test
    public void testConsumeLetterThenDigitSequenceNoLetters() {
        CharacterReader r = new CharacterReader("123abc");
        assertEquals("123", r.consumeLetterThenDigitSequence());
    }

    @Test
    public void testConsumeLetterThenDigitSequenceEntireInputExhausted() {
        // ทดสอบ branch isEmpty() == true ใน loop ที่สอง
        CharacterReader r = new CharacterReader("abc123");
        assertEquals("abc123", r.consumeLetterThenDigitSequence());
        assertTrue(r.isEmpty());
    }

    // ---------- consumeHexSequence ----------

    @Test
    public void testConsumeHexSequenceMixedCase() {
        CharacterReader r = new CharacterReader("1aF9xyz");
        assertEquals("1aF9", r.consumeHexSequence());
    }

    @Test
    public void testConsumeHexSequenceNoHex() {
        CharacterReader r = new CharacterReader("xyz");
        assertEquals("", r.consumeHexSequence());
    }

    // ---------- consumeDigitSequence ----------

    @Test
    public void testConsumeDigitSequence() {
        CharacterReader r = new CharacterReader("123abc");
        assertEquals("123", r.consumeDigitSequence());
    }

    @Test
    public void testConsumeDigitSequenceNoDigits() {
        CharacterReader r = new CharacterReader("abc");
        assertEquals("", r.consumeDigitSequence());
    }

    // ---------- matches(char) ----------

    @Test
    public void testMatchesCharTrue() {
        CharacterReader r = new CharacterReader("abc");
        assertTrue(r.matches('a'));
    }

    @Test
    public void testMatchesCharFalseDueToMismatch() {
        CharacterReader r = new CharacterReader("abc");
        assertFalse(r.matches('z'));
    }

    @Test
    public void testMatchesCharFalseDueToEmpty() {
        CharacterReader r = new CharacterReader("");
        assertFalse(r.matches('a'));
    }

    // ---------- matches(String) ----------

    @Test
    public void testMatchesStringTrue() {
        CharacterReader r = new CharacterReader("hello world");
        assertTrue(r.matches("hello"));
    }

    @Test
    public void testMatchesStringFalseTooLong() {
        // scanLength > length - pos branch
        CharacterReader r = new CharacterReader("ab");
        assertFalse(r.matches("abcdef"));
    }

    @Test
    public void testMatchesStringFalseMismatchInLoop() {
        CharacterReader r = new CharacterReader("hello world");
        assertFalse(r.matches("hezlo"));
    }

    // ---------- matchesIgnoreCase ----------

    @Test
    public void testMatchesIgnoreCaseTrue() {
        CharacterReader r = new CharacterReader("HeLLo world");
        assertTrue(r.matchesIgnoreCase("hello"));
    }

    @Test
    public void testMatchesIgnoreCaseFalseTooLong() {
        CharacterReader r = new CharacterReader("ab");
        assertFalse(r.matchesIgnoreCase("abcdef"));
    }

    @Test
    public void testMatchesIgnoreCaseFalseMismatch() {
        CharacterReader r = new CharacterReader("hello world");
        assertFalse(r.matchesIgnoreCase("hezlo"));
    }

    // ---------- matchesAny(char...) ----------

    @Test
    public void testMatchesAnyTrue() {
        CharacterReader r = new CharacterReader("abc");
        assertTrue(r.matchesAny('x', 'a', 'y'));
    }

    @Test
    public void testMatchesAnyFalse() {
        CharacterReader r = new CharacterReader("abc");
        assertFalse(r.matchesAny('x', 'y', 'z'));
    }

    @Test
    public void testMatchesAnyFalseWhenEmpty() {
        CharacterReader r = new CharacterReader("");
        assertFalse(r.matchesAny('a', 'b'));
    }

    // ---------- matchesAnySorted ----------

    @Test
    public void testMatchesAnySortedTrue() {
        CharacterReader r = new CharacterReader("abc");
        char[] sorted = {'a', 'm', 'z'};
        assertTrue(r.matchesAnySorted(sorted));
    }

    @Test
    public void testMatchesAnySortedFalse() {
        CharacterReader r = new CharacterReader("abc");
        char[] sorted = {'x', 'y', 'z'};
        assertFalse(r.matchesAnySorted(sorted));
    }

    @Test
    public void testMatchesAnySortedFalseWhenEmpty() {
        CharacterReader r = new CharacterReader("");
        char[] sorted = {'a'};
        assertFalse(r.matchesAnySorted(sorted));
    }

    // ---------- matchesLetter ----------

    @Test
    public void testMatchesLetterTrue() {
        CharacterReader r = new CharacterReader("abc");
        assertTrue(r.matchesLetter());
    }

    @Test
    public void testMatchesLetterFalseDigit() {
        CharacterReader r = new CharacterReader("123");
        assertFalse(r.matchesLetter());
    }

    @Test
    public void testMatchesLetterFalseEmpty() {
        CharacterReader r = new CharacterReader("");
        assertFalse(r.matchesLetter());
    }

    // ---------- matchesDigit ----------

    @Test
    public void testMatchesDigitTrue() {
        CharacterReader r = new CharacterReader("123");
        assertTrue(r.matchesDigit());
    }

    @Test
    public void testMatchesDigitFalseLetter() {
        CharacterReader r = new CharacterReader("abc");
        assertFalse(r.matchesDigit());
    }

    @Test
    public void testMatchesDigitFalseEmpty() {
        CharacterReader r = new CharacterReader("");
        assertFalse(r.matchesDigit());
    }

    // ---------- matchConsume ----------

    @Test
    public void testMatchConsumeTrue() {
        CharacterReader r = new CharacterReader("hello world");
        assertTrue(r.matchConsume("hello"));
        assertEquals(5, r.pos());
    }

    @Test
    public void testMatchConsumeFalse() {
        CharacterReader r = new CharacterReader("hello world");
        assertFalse(r.matchConsume("zzz"));
        assertEquals(0, r.pos());
    }

    // ---------- matchConsumeIgnoreCase ----------

    @Test
    public void testMatchConsumeIgnoreCaseTrue() {
        CharacterReader r = new CharacterReader("HELLO world");
        assertTrue(r.matchConsumeIgnoreCase("hello"));
        assertEquals(5, r.pos());
    }

    @Test
    public void testMatchConsumeIgnoreCaseFalse() {
        CharacterReader r = new CharacterReader("hello world");
        assertFalse(r.matchConsumeIgnoreCase("zzz"));
        assertEquals(0, r.pos());
    }

    // ---------- containsIgnoreCase ----------

    @Test
    public void testContainsIgnoreCaseFoundLowercase() {
        CharacterReader r = new CharacterReader("foo </title> bar");
        assertTrue(r.containsIgnoreCase("</title>"));
    }

    @Test
    public void testContainsIgnoreCaseFoundUppercase() {
        CharacterReader r = new CharacterReader("foo </TITLE> bar");
        assertTrue(r.containsIgnoreCase("</title>"));
    }

    @Test
    public void testContainsIgnoreCaseNotFound() {
        CharacterReader r = new CharacterReader("foo bar");
        assertFalse(r.containsIgnoreCase("</title>"));
    }

    // ---------- toString ----------

    @Test
    public void testToStringAfterConsumption() {
        CharacterReader r = new CharacterReader("hello world");
        r.consumeTo(' ');
        assertEquals(" world", r.toString());
    }

    @Test
    public void testToStringAtStart() {
        CharacterReader r = new CharacterReader("abc");
        assertEquals("abc", r.toString());
    }

    // ---------- cacheString / rangeEquals ----------

    @Test
    public void testCacheStringReusedForRepeatedShortStrings() {
        // เรียก consumeTo ซ้ำกับ string สั้น ๆ ที่เหมือนกัน เพื่อตรวจสอบความถูกต้องของ cache
        CharacterReader r1 = new CharacterReader("cat,cat,dog");
        String s1 = r1.consumeTo(',');
        r1.advance(); // skip ','
        String s2 = r1.consumeTo(',');
        assertEquals("cat", s1);
        assertEquals("cat", s2);
        assertEquals(s1, s2); // ค่าเนื้อหาต้องเท่ากัน (อาจเป็น object เดียวกันจาก cache หรือไม่ก็ได้)
    }

    @Test
    public void testRangeEqualsTrueAndFalse() {
        CharacterReader r = new CharacterReader("hello");
        assertTrue(r.rangeEquals(0, 5, "hello"));
        assertFalse(r.rangeEquals(0, 5, "world"));
        assertFalse(r.rangeEquals(0, 4, "hello")); // count != cached.length()
    }
}
```

## สรุปตาราง Branch/Condition ที่ครอบคลุม

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testConstructorNullThrows` | Validate.notNull throw เมื่อ input == null |
| `testConstructorEmptyString` | constructor กับ empty string, isEmpty()=true ทันที |
| `testPosAndIsEmptyBoundary` | isEmpty(): pos<length (false) / pos>=length (true) |
| `testCurrentWithinAndAtEnd` | current(): pos<length / pos>=length (EOF) |
| `testConsumeNormalAndAtEOF` | consume(): ปกติ และ pos>=length คืน EOF |
| `testUnconsume` | unconsume() ลด pos |
| `testAdvance` | advance() เพิ่ม pos |
| `testMarkAndRewind` | mark()/rewindToMark() |
| `testConsumeAsString` | consumeAsString() คืนค่าถูกต้อง + เพิ่ม pos |
| `testNextIndexOfCharFound/NotFound` | nextIndexOf(char): พบ/ไม่พบ |
| `testNextIndexOfSeqFound/NotFound/WithMismatchSkipping/TooLongNearEnd/SingleChar` | nextIndexOf(CharSequence): if(startChar!=input) loop, inner for loop match/mismatch, boundary `last<=length` true/false |
| `testConsumeToCharFound/NotFoundConsumesToEnd` | consumeTo(char): offset!=-1 / offset==-1 (เรียก consumeToEnd) |
| `testConsumeToStringFound/NotFoundConsumesToEnd` | consumeTo(String): offset!=-1 / -1 |
| `testConsumeToAny*` | consumeToAny(): OUTER loop break / ไม่พบ (วนจนสุด) / pos>start true/false |
| `testConsumeToAnySorted*` | consumeToAnySorted(): binarySearch>=0 break, และ pos>start true/false |
| `testConsumeData*` | consumeData(): หยุดที่ '&', '<', nullChar, และไม่มี special char |
| `testConsumeTagName*` | consumeTagName(): หยุดที่ whitespace, '/', '>', nullChar, ไม่มี stop char |
| `testConsumeToEnd*` | consumeToEnd(): ปกติ และ string ยาว>maxCacheLen (bypass cache) |
| `testConsumeLetterSequence*` | consumeLetterSequence(): มี/ไม่มีตัวอักษร, กินทั้ง input |
| `testConsumeLetterThenDigitSequence*` | consumeLetterThenDigitSequence(): loop ตัวอักษร+ตัวเลข, ไม่มีเลข, ไม่มีตัวอักษร, isEmpty() true ใน loop 2 |
| `testConsumeHexSequence*` | consumeHexSequence(): hex ผสม case / ไม่มี hex |
| `testConsumeDigitSequence*` | consumeDigitSequence(): มี/ไม่มีเลข |
| `testMatchesChar*` | matches(char): true/false(mismatch)/false(empty) |
| `testMatchesString*` | matches(String): scanLength>length-pos true/false, mismatch in loop |
| `testMatchesIgnoreCase*` | matchesIgnoreCase(): เงื่อนไขเดียวกันแบบ ignore case |
| `testMatchesAny*` | matchesAny(): isEmpty() true, match found/not found |
| `testMatchesAnySorted*` | matchesAnySorted(): isEmpty(), binarySearch>=0 true/false |
| `testMatchesLetter*` | matchesLetter(): empty/letter/non-letter |
| `testMatchesDigit*` | matchesDigit(): empty/digit/non-digit |
| `testMatchConsume*` | matchConsume(): matches true→consume / false |
| `testMatchConsumeIgnoreCase*` | matchConsumeIgnoreCase(): true/false |
| `testContainsIgnoreCase*` | containsIgnoreCase(): พบใน lower, upper, ไม่พบ |
| `testToString*` | toString(): ตำแหน่งเริ่มต้นและหลัง consume |
| `testCacheStringReusedForRepeatedShortStrings` | cacheString(): hash hit + rangeEquals true (cache reuse) |
| `testRangeEqualsTrueAndFalse` | rangeEquals(): count==length matched/mismatched, count!=length |

**หมายเหตุ:** branch "hashcode conflict" ภายใน `cacheString` (กรณี hash ชนกันแต่เนื้อหาไม่ตรง) ไม่สามารถบังคับให้เกิดได้อย่างน่าเชื่อถือโดยไม่พึ่งพา internal hash implementation ที่ไม่เปิดเผยเป็น public API จึงไม่ได้เขียนเทสเฉพาะสำหรับกรณีนี้ (เสี่ยงต่อการเดา behavior ที่ไม่ได้ระบุชัดในซอร์ส)