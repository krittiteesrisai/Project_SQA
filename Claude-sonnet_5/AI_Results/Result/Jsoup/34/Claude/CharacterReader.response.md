# CharacterReaderTest.java

```java
package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * JUnit 4 test suite for CharacterReader (Jsoup-34b).
 * Target class is package-private, so this test class lives in the
 * same package: org.jsoup.parser
 */
public class CharacterReaderTest {

    // ---------------------------------------------------------------
    // Constructor
    // ---------------------------------------------------------------

    @Test
    public void testConstructorNullThrowsException() {
        // Validate.notNull(input) is expected to throw some RuntimeException.
        // Exact exception type is not guaranteed from the given source
        // (Validate class body not shown), so we only assert that an
        // exception is thrown, without asserting a specific type.
        try {
            new CharacterReader(null);
            fail("Expected an exception to be thrown for null input");
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testConstructorEmptyStringIsValid() {
        CharacterReader r = new CharacterReader("");
        assertEquals(0, r.pos());
        assertTrue(r.isEmpty());
    }

    // ---------------------------------------------------------------
    // pos() / isEmpty()
    // ---------------------------------------------------------------

    @Test
    public void testPosInitialValue() {
        CharacterReader r = new CharacterReader("abc");
        assertEquals(0, r.pos());
    }

    @Test
    public void testIsEmptyFalseWhenDataRemains() {
        CharacterReader r = new CharacterReader("a");
        assertFalse(r.isEmpty());
    }

    @Test
    public void testIsEmptyTrueAfterConsumingAll() {
        CharacterReader r = new CharacterReader("a");
        r.consume();
        assertTrue(r.isEmpty());
    }

    // ---------------------------------------------------------------
    // current()
    // ---------------------------------------------------------------

    @Test
    public void testCurrentReturnsEOFWhenEmpty() {
        CharacterReader r = new CharacterReader("");
        assertEquals(CharacterReader.EOF, r.current());
    }

    @Test
    public void testCurrentReturnsCharWhenNotEmpty() {
        CharacterReader r = new CharacterReader("abc");
        assertEquals('a', r.current());
    }

    // ---------------------------------------------------------------
    // consume()
    // ---------------------------------------------------------------

    @Test
    public void testConsumeNormalSequence() {
        CharacterReader r = new CharacterReader("ab");
        assertEquals('a', r.consume());
        assertEquals('b', r.consume());
        assertEquals(2, r.pos());
    }

    @Test
    public void testConsumeAtEOFReturnsEOFAndStillAdvancesPos() {
        CharacterReader r = new CharacterReader("");
        assertEquals(CharacterReader.EOF, r.consume());
        // pos still increments even when input was already empty
        assertEquals(1, r.pos());
    }

    // ---------------------------------------------------------------
    // unconsume() / advance()
    // ---------------------------------------------------------------

    @Test
    public void testUnconsumeRestoresPreviousChar() {
        CharacterReader r = new CharacterReader("ab");
        r.consume();          // pos=1
        r.unconsume();        // pos=0
        assertEquals('a', r.current());
    }

    @Test
    public void testAdvanceMovesPosForwardWithoutReturningChar() {
        CharacterReader r = new CharacterReader("ab");
        r.advance();
        assertEquals(1, r.pos());
        assertEquals('b', r.current());
    }

    // ---------------------------------------------------------------
    // mark() / rewindToMark()
    // ---------------------------------------------------------------

    @Test
    public void testMarkAndRewindToMark() {
        CharacterReader r = new CharacterReader("abcdef");
        r.advance();
        r.advance();
        r.mark();              // mark = 2
        r.advance();
        r.advance();
        r.rewindToMark();      // pos back to 2
        assertEquals(2, r.pos());
    }

    @Test
    public void testRewindToMarkWithoutExplicitMarkUsesDefaultZero() {
        CharacterReader r = new CharacterReader("abcdef");
        r.advance();
        r.advance();
        r.rewindToMark(); // mark never set -> default 0
        assertEquals(0, r.pos());
    }

    // ---------------------------------------------------------------
    // consumeAsString()
    // ---------------------------------------------------------------

    @Test
    public void testConsumeAsStringNormal() {
        CharacterReader r = new CharacterReader("xyz");
        assertEquals("x", r.consumeAsString());
        assertEquals(1, r.pos());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testConsumeAsStringAtEOFThrows() {
        CharacterReader r = new CharacterReader("");
        r.consumeAsString(); // offset=0, count=1 but length=0 -> throws
    }

    // ---------------------------------------------------------------
    // nextIndexOf(char)
    // ---------------------------------------------------------------

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

    @Test
    public void testNextIndexOfCharAtCurrentPos() {
        CharacterReader r = new CharacterReader("abcdef");
        assertEquals(0, r.nextIndexOf('a'));
    }

    // ---------------------------------------------------------------
    // nextIndexOf(CharSequence)
    // ---------------------------------------------------------------

    @Test
    public void testNextIndexOfSeqFoundAtStart() {
        CharacterReader r = new CharacterReader("abcabd");
        assertEquals(0, r.nextIndexOf("abc"));
    }

    @Test
    public void testNextIndexOfSeqFoundAfterPartialMismatchRescan() {
        // "abcabd" searching for "abd":
        // first attempt at offset 0 partially matches "ab" then fails on 'c' vs 'd'
        // then re-scans for start char 'a', finds it later and matches fully at offset 3
        CharacterReader r = new CharacterReader("abcabd");
        assertEquals(3, r.nextIndexOf("abd"));
    }

    @Test
    public void testNextIndexOfSeqNotFoundAtAll() {
        CharacterReader r = new CharacterReader("abcdef");
        assertEquals(-1, r.nextIndexOf("xyz"));
    }

    @Test
    public void testNextIndexOfSeqNotFoundWhenTooLongForRemainingInput() {
        CharacterReader r = new CharacterReader("ab");
        assertEquals(-1, r.nextIndexOf("abcdef"));
    }

    // ---------------------------------------------------------------
    // consumeTo(char)
    // ---------------------------------------------------------------

    @Test
    public void testConsumeToCharFound() {
        CharacterReader r = new CharacterReader("one,two");
        assertEquals("one", r.consumeTo(','));
        assertEquals(3, r.pos());
    }

    @Test
    public void testConsumeToCharNotFoundConsumesToEnd() {
        CharacterReader r = new CharacterReader("onetwo");
        assertEquals("onetwo", r.consumeTo('x'));
        assertTrue(r.isEmpty());
    }

    // ---------------------------------------------------------------
    // consumeTo(String)
    // ---------------------------------------------------------------

    @Test
    public void testConsumeToStringFound() {
        CharacterReader r = new CharacterReader("one--two");
        assertEquals("one", r.consumeTo("--"));
        assertEquals(3, r.pos());
    }

    @Test
    public void testConsumeToStringNotFoundConsumesToEnd() {
        CharacterReader r = new CharacterReader("onetwo");
        assertEquals("onetwo", r.consumeTo("xyz"));
        assertTrue(r.isEmpty());
    }

    // ---------------------------------------------------------------
    // consumeToAny(char...)
    // ---------------------------------------------------------------

    @Test
    public void testConsumeToAnyFoundImmediately() {
        CharacterReader r = new CharacterReader("<div>");
        assertEquals("", r.consumeToAny('<', '>'));
    }

    @Test
    public void testConsumeToAnyFoundAfterSomeChars() {
        CharacterReader r = new CharacterReader("one two");
        assertEquals("one", r.consumeToAny(' ', '\t'));
    }

    @Test
    public void testConsumeToAnyNotFoundConsumesToEnd() {
        CharacterReader r = new CharacterReader("onetwo");
        assertEquals("onetwo", r.consumeToAny('x', 'y'));
        assertTrue(r.isEmpty());
    }

    // ---------------------------------------------------------------
    // consumeToEnd()
    // ---------------------------------------------------------------

    @Test
    public void testConsumeToEnd() {
        CharacterReader r = new CharacterReader("abc");
        assertEquals("abc", r.consumeToEnd());
        assertTrue(r.isEmpty());
    }

    // ---------------------------------------------------------------
    // consumeLetterSequence()
    // ---------------------------------------------------------------

    @Test
    public void testConsumeLetterSequenceStopsAtNonLetter() {
        CharacterReader r = new CharacterReader("abc123");
        assertEquals("abc", r.consumeLetterSequence());
        assertEquals(3, r.pos());
    }

    @Test
    public void testConsumeLetterSequenceEmptyWhenStartsNonLetter() {
        CharacterReader r = new CharacterReader("123abc");
        assertEquals("", r.consumeLetterSequence());
        assertEquals(0, r.pos());
    }

    @Test
    public void testConsumeLetterSequenceConsumesWholeInput() {
        CharacterReader r = new CharacterReader("abcXYZ");
        assertEquals("abcXYZ", r.consumeLetterSequence());
        assertTrue(r.isEmpty());
    }

    // ---------------------------------------------------------------
    // consumeLetterThenDigitSequence()
    // ---------------------------------------------------------------

    @Test
    public void testConsumeLetterThenDigitSequenceBothParts() {
        CharacterReader r = new CharacterReader("abc123xyz");
        assertEquals("abc123", r.consumeLetterThenDigitSequence());
    }

    @Test
    public void testConsumeLetterThenDigitSequenceOnlyLetters() {
        CharacterReader r = new CharacterReader("abc!!!");
        assertEquals("abc", r.consumeLetterThenDigitSequence());
    }

    @Test
    public void testConsumeLetterThenDigitSequenceOnlyDigitsNoLetters() {
        CharacterReader r = new CharacterReader("123abc");
        assertEquals("123", r.consumeLetterThenDigitSequence());
    }

    // ---------------------------------------------------------------
    // consumeHexSequence()
    // ---------------------------------------------------------------

    @Test
    public void testConsumeHexSequenceMixedCaseDigitsAndLetters() {
        CharacterReader r = new CharacterReader("1aF9gh");
        assertEquals("1aF9", r.consumeHexSequence());
    }

    @Test
    public void testConsumeHexSequenceEmptyWhenNoHexChar() {
        CharacterReader r = new CharacterReader("ghij");
        assertEquals("", r.consumeHexSequence());
    }

    // ---------------------------------------------------------------
    // consumeDigitSequence()
    // ---------------------------------------------------------------

    @Test
    public void testConsumeDigitSequenceStopsAtNonDigit() {
        CharacterReader r = new CharacterReader("123abc");
        assertEquals("123", r.consumeDigitSequence());
    }

    @Test
    public void testConsumeDigitSequenceEmptyWhenStartsNonDigit() {
        CharacterReader r = new CharacterReader("abc123");
        assertEquals("", r.consumeDigitSequence());
    }

    // ---------------------------------------------------------------
    // matches(char)
    // ---------------------------------------------------------------

    @Test
    public void testMatchesCharTrue() {
        CharacterReader r = new CharacterReader("abc");
        assertTrue(r.matches('a'));
    }

    @Test
    public void testMatchesCharFalseWhenMismatch() {
        CharacterReader r = new CharacterReader("abc");
        assertFalse(r.matches('z'));
    }

    @Test
    public void testMatchesCharFalseWhenEmpty() {
        CharacterReader r = new CharacterReader("");
        assertFalse(r.matches('a'));
    }

    // ---------------------------------------------------------------
    // matches(String)
    // ---------------------------------------------------------------

    @Test
    public void testMatchesStringTrue() {
        CharacterReader r = new CharacterReader("abcdef");
        assertTrue(r.matches("abc"));
    }

    @Test
    public void testMatchesStringFalseOnMismatch() {
        CharacterReader r = new CharacterReader("abcdef");
        assertFalse(r.matches("abz"));
    }

    @Test
    public void testMatchesStringFalseWhenLongerThanRemaining() {
        CharacterReader r = new CharacterReader("ab");
        assertFalse(r.matches("abcdef"));
    }

    // ---------------------------------------------------------------
    // matchesIgnoreCase(String)
    // ---------------------------------------------------------------

    @Test
    public void testMatchesIgnoreCaseTrue() {
        CharacterReader r = new CharacterReader("ABCdef");
        assertTrue(r.matchesIgnoreCase("abc"));
    }

    @Test
    public void testMatchesIgnoreCaseFalseOnMismatch() {
        CharacterReader r = new CharacterReader("ABCdef");
        assertFalse(r.matchesIgnoreCase("xyz"));
    }

    @Test
    public void testMatchesIgnoreCaseFalseWhenLongerThanRemaining() {
        CharacterReader r = new CharacterReader("ab");
        assertFalse(r.matchesIgnoreCase("abcdef"));
    }

    // ---------------------------------------------------------------
    // matchesAny(char...)
    // ---------------------------------------------------------------

    @Test
    public void testMatchesAnyFalseWhenEmpty() {
        CharacterReader r = new CharacterReader("");
        assertFalse(r.matchesAny('a', 'b'));
    }

    @Test
    public void testMatchesAnyTrueWhenFound() {
        CharacterReader r = new CharacterReader("abc");
        assertTrue(r.matchesAny('x', 'a', 'y'));
    }

    @Test
    public void testMatchesAnyFalseWhenNotFound() {
        CharacterReader r = new CharacterReader("abc");
        assertFalse(r.matchesAny('x', 'y', 'z'));
    }

    // ---------------------------------------------------------------
    // matchesLetter()
    // ---------------------------------------------------------------

    @Test
    public void testMatchesLetterTrue() {
        CharacterReader r = new CharacterReader("abc");
        assertTrue(r.matchesLetter());
    }

    @Test
    public void testMatchesLetterFalseOnDigit() {
        CharacterReader r = new CharacterReader("123");
        assertFalse(r.matchesLetter());
    }

    @Test
    public void testMatchesLetterFalseWhenEmpty() {
        CharacterReader r = new CharacterReader("");
        assertFalse(r.matchesLetter());
    }

    // ---------------------------------------------------------------
    // matchesDigit()
    // ---------------------------------------------------------------

    @Test
    public void testMatchesDigitTrue() {
        CharacterReader r = new CharacterReader("123");
        assertTrue(r.matchesDigit());
    }

    @Test
    public void testMatchesDigitFalseOnLetter() {
        CharacterReader r = new CharacterReader("abc");
        assertFalse(r.matchesDigit());
    }

    @Test
    public void testMatchesDigitFalseWhenEmpty() {
        CharacterReader r = new CharacterReader("");
        assertFalse(r.matchesDigit());
    }

    // ---------------------------------------------------------------
    // matchConsume(String)
    // ---------------------------------------------------------------

    @Test
    public void testMatchConsumeTrueAdvancesPos() {
        CharacterReader r = new CharacterReader("abcdef");
        assertTrue(r.matchConsume("abc"));
        assertEquals(3, r.pos());
    }

    @Test
    public void testMatchConsumeFalseDoesNotAdvance() {
        CharacterReader r = new CharacterReader("abcdef");
        assertFalse(r.matchConsume("xyz"));
        assertEquals(0, r.pos());
    }

    // ---------------------------------------------------------------
    // matchConsumeIgnoreCase(String)
    // ---------------------------------------------------------------

    @Test
    public void testMatchConsumeIgnoreCaseTrueAdvancesPos() {
        CharacterReader r = new CharacterReader("ABCdef");
        assertTrue(r.matchConsumeIgnoreCase("abc"));
        assertEquals(3, r.pos());
    }

    @Test
    public void testMatchConsumeIgnoreCaseFalseDoesNotAdvance() {
        CharacterReader r = new CharacterReader("ABCdef");
        assertFalse(r.matchConsumeIgnoreCase("xyz"));
        assertEquals(0, r.pos());
    }

    // ---------------------------------------------------------------
    // containsIgnoreCase(String)
    // ---------------------------------------------------------------

    @Test
    public void testContainsIgnoreCaseTrueLowerCasePresent() {
        CharacterReader r = new CharacterReader("blah </title> blah");
        assertTrue(r.containsIgnoreCase("</title>"));
    }

    @Test
    public void testContainsIgnoreCaseTrueUpperCasePresent() {
        CharacterReader r = new CharacterReader("blah </TITLE> blah");
        assertTrue(r.containsIgnoreCase("</title>"));
    }

    @Test
    public void testContainsIgnoreCaseFalseWhenNotPresent() {
        CharacterReader r = new CharacterReader("blah blah blah");
        assertFalse(r.containsIgnoreCase("</title>"));
    }

    // ---------------------------------------------------------------
    // toString()
    // ---------------------------------------------------------------

    @Test
    public void testToStringReturnsRemainingInput() {
        CharacterReader r = new CharacterReader("abcdef");
        r.advance();
        r.advance();
        assertEquals("cdef", r.toString());
    }

    @Test
    public void testToStringEmptyWhenFullyConsumed() {
        CharacterReader r = new CharacterReader("abc");
        r.consumeToEnd();
        assertEquals("", r.toString());
    }
}
```

## สรุปตาราง Branch/Condition ที่ครอบคลุม

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| testConstructorNullThrowsException | Validate.notNull → throw branch |
| testConstructorEmptyStringIsValid | constructor ปกติ, length=0 |
| testPosInitialValue | pos() ค่าเริ่มต้น |
| testIsEmptyFalseWhenDataRemains / testIsEmptyTrueAfterConsumingAll | isEmpty() true/false ทั้งสอง branch |
| testCurrentReturnsEOFWhenEmpty / testCurrentReturnsCharWhenNotEmpty | current(): isEmpty ? EOF : char ทั้งสอง branch |
| testConsumeNormalSequence / testConsumeAtEOFReturnsEOFAndStillAdvancesPos | consume(): isEmpty true/false, pos++ |
| testUnconsumeRestoresPreviousChar | unconsume() pos-- |
| testAdvanceMovesPosForwardWithoutReturningChar | advance() pos++ |
| testMarkAndRewindToMark / testRewindToMarkWithoutExplicitMarkUsesDefaultZero | mark()/rewindToMark() ค่า default และหลัง mark |
| testConsumeAsStringNormal / testConsumeAsStringAtEOFThrows | consumeAsString() ปกติ และ boundary throw |
| testNextIndexOfCharFound/NotFound/AtCurrentPos | nextIndexOf(char): found, not found, offset=0 |
| testNextIndexOfSeqFoundAtStart / FoundAfterPartialMismatchRescan / NotFoundAtAll / NotFoundWhenTooLongForRemainingInput | nextIndexOf(CharSequence): while-scan branch, inner for mismatch/match, outer loop exhaustion |
| testConsumeToCharFound/NotFoundConsumesToEnd | consumeTo(char): offset!=-1 / else→consumeToEnd |
| testConsumeToStringFound/NotFoundConsumesToEnd | consumeTo(String): offset!=-1 / else |
| testConsumeToAnyFoundImmediately/FoundAfterSomeChars/NotFoundConsumesToEnd | consumeToAny(): break OUTER ทันที, break หลังบางตัว, loop จนสุด (pos>start false/true) |
| testConsumeToEnd | consumeToEnd() พื้นฐาน |
| testConsumeLetterSequenceStopsAtNonLetter/EmptyWhenStartsNonLetter/ConsumesWholeInput | consumeLetterSequence(): if/else, while loop exit by break หรือ length |
| testConsumeLetterThenDigitSequenceBothParts/OnlyLetters/OnlyDigitsNoLetters | consumeLetterThenDigitSequence(): loop1 และ loop2 ทั้ง 2 branch แยกกัน |
| testConsumeHexSequenceMixedCaseDigitsAndLetters/EmptyWhenNoHexChar | consumeHexSequence(): if เงื่อนไข 0-9/A-F/a-f จริง/เท็จ |
| testConsumeDigitSequenceStopsAtNonDigit/EmptyWhenStartsNonDigit | consumeDigitSequence(): if จริง/เท็จ |
| testMatchesCharTrue/FalseWhenMismatch/FalseWhenEmpty | matches(char): isEmpty, equality true/false |
| testMatchesStringTrue/FalseOnMismatch/FalseWhenLongerThanRemaining | matches(String): length check, loop mismatch, full match |
| testMatchesIgnoreCaseTrue/FalseOnMismatch/FalseWhenLongerThanRemaining | matchesIgnoreCase(String): เช่นเดียวกันแบบ case-insensitive |
| testMatchesAnyFalseWhenEmpty/TrueWhenFound/FalseWhenNotFound | matchesAny(): isEmpty, loop found/not found |
| testMatchesLetterTrue/FalseOnDigit/FalseWhenEmpty | matchesLetter(): isEmpty, เงื่อนไขตัวอักษร true/false |
| testMatchesDigitTrue/FalseOnLetter/FalseWhenEmpty | matchesDigit(): isEmpty, เงื่อนไขเลข true/false |
| testMatchConsumeTrueAdvancesPos/FalseDoesNotAdvance | matchConsume(): if matches true/false |
| testMatchConsumeIgnoreCaseTrueAdvancesPos/FalseDoesNotAdvance | matchConsumeIgnoreCase(): if matchesIgnoreCase true/false |
| testContainsIgnoreCaseTrueLowerCasePresent/TrueUpperCasePresent/FalseWhenNotPresent | containsIgnoreCase(): ทั้ง loScan/hiScan branch (||) และ false |
| testToStringReturnsRemainingInput/EmptyWhenFullyConsumed | toString(): คืนค่าปกติ/ว่าง |

**หมายเหตุ:** กรณี `consumeTo(String)`/`nextIndexOf(CharSequence)` กับ seq ว่าง (`""`) จะทำให้ `seq.charAt(0)` throw `StringIndexOutOfBoundsException` แต่ไม่ได้เขียนเทสสำหรับกรณีนี้เนื่องจากเป็น behavior ที่ไม่ชัดเจนว่าตั้งใจหรือเป็น fault — ใส่ไว้เป็นข้อสังเกตเพื่อความโปร่งใสตามข้อกำหนดที่ 4.