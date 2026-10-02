# วิเคราะห์และออกแบบ Test Suite

เนื่องจาก `CharacterReader` มี method หลายตัวเป็น package-private ผมจึงต้องวาง test class ไว้ใน package เดียวกัน (`org.jsoup.parser`) เพื่อเข้าถึงได้โดยตรง (ไม่ใช้ reflection)

**ข้อสังเกตสำคัญที่พบจากการวิเคราะห์ source (ป้องกันการเขียนเทสผิด):**
- `consumeToEnd()` อ่านแค่ buffer ปัจจุบัน ไม่ได้ดึงข้อมูลทั้งหมดจาก stream ถ้า content ใหญ่กว่า buffer เดียว — ต้องทดสอบด้วย content ที่พอดีกับ buffer เดียวเท่านั้น
- `bufferUp()` จะ **reset `bufMark = -1`** ทุกครั้งที่มีการ refill buffer จริง (read != -1) แม้จะเพิ่ง `mark()` ไปแล้วก็ตาม ถ้า cross buffer boundary อีกครั้ง mark จะ invalid — ใช้พฤติกรรมนี้ทดสอบ fault-detection
- `Validate.notNull` / `Validate.isTrue` ไม่ทราบ exception type ที่แน่ชัดจาก source ที่ให้มา จึงใช้ `expected = Exception.class` แทนการเดา type เฉพาะ (คอมเมนต์กำกับไว้)

```java
package org.jsoup.parser;

import org.jsoup.UncheckedIOException;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import static org.junit.Assert.*;

public class CharacterReaderTest {

    // ---------------------------------------------------------------
    // Constructor tests
    // ---------------------------------------------------------------

    @Test
    public void testConstructorFromString() {
        CharacterReader r = new CharacterReader("hello");
        assertEquals(0, r.pos());
        assertEquals('h', r.current());
    }

    @Test
    public void testConstructorFromReaderNormal() {
        CharacterReader r = new CharacterReader(new StringReader("abc"), 10);
        assertEquals('a', r.current());
    }

    @Test
    public void testConstructorSzLargerThanMaxBuffer() {
        // sz > maxBufferLen => charBuf clipped to maxBufferLen (ternary branch true)
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 40000; i++) sb.append('x');
        CharacterReader r = new CharacterReader(new StringReader(sb.toString()), 40000);
        assertEquals('x', r.current());
    }

    @Test(expected = Exception.class) // exact type ไม่ยืนยันจาก source ที่ให้ (Validate.notNull)
    public void testConstructorNullReaderThrows() {
        new CharacterReader((Reader) null, 10);
    }

    @Test(expected = Exception.class) // exact type ไม่ยืนยันจาก source ที่ให้ (Validate.isTrue)
    public void testConstructorMarkNotSupportedThrows() {
        Reader noMark = new StringReader("abc") {
            @Override
            public boolean markSupported() { return false; }
        };
        new CharacterReader(noMark, 10);
    }

    @Test(expected = UncheckedIOException.class)
    public void testConstructorIOExceptionWrapped() {
        Reader throwing = new Reader() {
            @Override public int read(char[] cbuf, int off, int len) throws IOException {
                throw new IOException("read fail");
            }
            @Override public void close() {}
            @Override public boolean markSupported() { return true; }
            @Override public long skip(long n) throws IOException {
                throw new IOException("skip fail");
            }
        };
        new CharacterReader(throwing, 10);
    }

    // ---------------------------------------------------------------
    // pos / isEmpty / current / consume / unconsume / advance
    // ---------------------------------------------------------------

    @Test
    public void testPosAdvancesOnConsume() {
        CharacterReader r = new CharacterReader("ab");
        assertEquals(0, r.pos());
        r.consume();
        assertEquals(1, r.pos());
    }

    @Test
    public void testIsEmptyFalseThenTrue() {
        CharacterReader r = new CharacterReader("a");
        assertFalse(r.isEmpty());
        r.consume();
        assertTrue(r.isEmpty());
    }

    @Test
    public void testCurrentReturnsEOFWhenEmpty() {
        CharacterReader r = new CharacterReader("");
        assertEquals(CharacterReader.EOF, r.current());
    }

    @Test
    public void testConsumeReturnsEOFAtEnd() {
        CharacterReader r = new CharacterReader("a");
        assertEquals('a', r.consume());
        assertEquals(CharacterReader.EOF, r.consume());
    }

    @Test(expected = UncheckedIOException.class)
    public void testUnconsumeThrowsAtStart() {
        new CharacterReader("abc").unconsume();
    }

    @Test
    public void testUnconsumeRestoresPosition() {
        CharacterReader r = new CharacterReader("abc");
        r.consume();
        r.unconsume();
        assertEquals('a', r.current());
    }

    @Test
    public void testAdvanceMovesPos() {
        CharacterReader r = new CharacterReader("abc");
        r.advance();
        assertEquals('b', r.current());
    }

    // ---------------------------------------------------------------
    // mark / rewindToMark
    // ---------------------------------------------------------------

    @Test(expected = UncheckedIOException.class)
    public void testRewindWithoutMarkThrows() {
        new CharacterReader("abc").rewindToMark();
    }

    @Test
    public void testMarkAndRewindWithinSameBuffer() {
        CharacterReader r = new CharacterReader("abcdef");
        r.consume(); r.consume(); // pos=2
        r.mark();
        r.consume(); r.consume(); // pos=4
        r.rewindToMark();
        assertEquals('c', r.current());
    }

    @Test(expected = UncheckedIOException.class)
    public void testRewindToMarkInvalidAfterBufferRefill() {
        // สร้างสถานการณ์ที่ mark ถูก invalidate เพราะมี bufferUp refill เกิดขึ้นหลัง mark()
        String content = "abcdefghij";
        CharacterReader r = new CharacterReader(new StringReader(content), 4);
        r.consume(); r.consume(); r.consume(); // pos=3 (ยังอยู่ใน buffer window แรก)
        r.mark();                              // force refill ภายใน mark(), bufMark ถูกตั้งใหม่หลัง refill
        for (int i = 0; i < 5; i++) r.consume(); // ข้าม buffer boundary อีกครั้ง -> bufMark ถูก reset เป็น -1
        r.rewindToMark();                      // ต้อง throw เพราะ mark invalid แล้ว
    }

    // ---------------------------------------------------------------
    // bufferUp (multi-refill, large content)
    // ---------------------------------------------------------------

    @Test
    public void testConsumeToEndWithinSingleBuffer() {
        // content อยู่ภายใน buffer เดียว (<=maxBufferLen) จึง consumeToEnd ได้ครบ
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2000; i++) sb.append((char) ('a' + (i % 26)));
        String content = sb.toString();
        CharacterReader r = new CharacterReader(content);
        String consumed = r.consumeToEnd();
        assertEquals(content, consumed);
        assertTrue(r.isEmpty());
    }

    @Test
    public void testSmallBufferMultipleRefillsConsumeAll() {
        String content = "abcdefghij";
        CharacterReader r = new CharacterReader(new StringReader(content), 4);
        StringBuilder sb = new StringBuilder();
        while (!r.isEmpty()) {
            sb.append(r.consume());
        }
        assertEquals(content, sb.toString());
    }

    // ---------------------------------------------------------------
    // nextIndexOf(char)
    // ---------------------------------------------------------------

    @Test
    public void testNextIndexOfCharFound() {
        assertEquals(3, new CharacterReader("abcdef").nextIndexOf('d'));
    }

    @Test
    public void testNextIndexOfCharNotFound() {
        assertEquals(-1, new CharacterReader("abcdef").nextIndexOf('z'));
    }

    // ---------------------------------------------------------------
    // nextIndexOf(CharSequence)
    // ---------------------------------------------------------------

    @Test
    public void testNextIndexOfSeqFound() {
        assertEquals(2, new CharacterReader("aaxyzaa").nextIndexOf("xyz"));
    }

    @Test
    public void testNextIndexOfSeqNotFound() {
        assertEquals(-1, new CharacterReader("abcde").nextIndexOf("xy"));
    }

    @Test
    public void testNextIndexOfSeqLastExceedsBufLength() {
        // ทดสอบ branch: last <= bufLength เป็น false (seq ยาวเกินพื้นที่ที่เหลือ)
        assertEquals(-1, new CharacterReader("abcde").nextIndexOf("cdef"));
    }

    // ---------------------------------------------------------------
    // consumeTo(char)
    // ---------------------------------------------------------------

    @Test
    public void testConsumeToCharFound() {
        CharacterReader r = new CharacterReader("abc,def");
        assertEquals("abc", r.consumeTo(','));
        assertEquals(',', r.current());
    }

    @Test
    public void testConsumeToCharNotFoundConsumesAll() {
        CharacterReader r = new CharacterReader("abcdef");
        assertEquals("abcdef", r.consumeTo('z'));
        assertTrue(r.isEmpty());
    }

    // ---------------------------------------------------------------
    // consumeTo(String)
    // ---------------------------------------------------------------

    @Test
    public void testConsumeToStringFound() {
        assertEquals("hello ", new CharacterReader("hello world").consumeTo("world"));
    }

    @Test
    public void testConsumeToStringNotFound() {
        CharacterReader r = new CharacterReader("hello");
        assertEquals("hello", r.consumeTo("xyz"));
        assertTrue(r.isEmpty());
    }

    // ---------------------------------------------------------------
    // consumeToAny
    // ---------------------------------------------------------------

    @Test
    public void testConsumeToAnyFound() {
        assertEquals("abc", new CharacterReader("abc<def").consumeToAny('<', '&'));
    }

    @Test
    public void testConsumeToAnyImmediateDelimiterReturnsEmpty() {
        assertEquals("", new CharacterReader("<abc").consumeToAny('<'));
    }

    @Test
    public void testConsumeToAnyNoneFoundConsumesAll() {
        assertEquals("abcdef", new CharacterReader("abcdef").consumeToAny('z', 'y'));
    }

    // ---------------------------------------------------------------
    // consumeToAnySorted
    // ---------------------------------------------------------------

    @Test
    public void testConsumeToAnySortedFound() {
        char[] sorted = {'&', '<'};
        assertEquals("abc", new CharacterReader("abc<def").consumeToAnySorted(sorted));
    }

    @Test
    public void testConsumeToAnySortedImmediate() {
        char[] sorted = {'<'};
        assertEquals("", new CharacterReader("<abc").consumeToAnySorted(sorted));
    }

    // ---------------------------------------------------------------
    // consumeData
    // ---------------------------------------------------------------

    @Test
    public void testConsumeDataStopsAtAmp() {
        assertEquals("abc", new CharacterReader("abc&def").consumeData());
    }

    @Test
    public void testConsumeDataStopsAtLt() {
        assertEquals("abc", new CharacterReader("abc<def").consumeData());
    }

    @Test
    public void testConsumeDataStopsAtNullChar() {
        String content = "abc" + TokeniserState.nullChar + "def";
        assertEquals("abc", new CharacterReader(content).consumeData());
    }

    @Test
    public void testConsumeDataConsumesAllWhenNoDelimiter() {
        assertEquals("abcdef", new CharacterReader("abcdef").consumeData());
    }

    // ---------------------------------------------------------------
    // consumeTagName
    // ---------------------------------------------------------------

    @Test
    public void testConsumeTagNameStopsAtSpace() {
        assertEquals("div", new CharacterReader("div class").consumeTagName());
    }

    @Test
    public void testConsumeTagNameStopsAtSlash() {
        assertEquals("br", new CharacterReader("br/>").consumeTagName());
    }

    @Test
    public void testConsumeTagNameStopsAtGt() {
        assertEquals("p", new CharacterReader("p>").consumeTagName());
    }

    @Test
    public void testConsumeTagNameStopsAtLt() {
        assertEquals("a", new CharacterReader("a<b").consumeTagName());
    }

    @Test
    public void testConsumeTagNameStopsAtTab() {
        assertEquals("a", new CharacterReader("a\tb").consumeTagName());
    }

    @Test
    public void testConsumeTagNameStopsAtNewline() {
        assertEquals("a", new CharacterReader("a\nb").consumeTagName());
    }

    @Test
    public void testConsumeTagNameStopsAtCarriageReturn() {
        assertEquals("a", new CharacterReader("a\rb").consumeTagName());
    }

    @Test
    public void testConsumeTagNameStopsAtFormFeed() {
        assertEquals("a", new CharacterReader("a\fb").consumeTagName());
    }

    @Test
    public void testConsumeTagNameStopsAtNullChar() {
        String content = "a" + TokeniserState.nullChar + "b";
        assertEquals("a", new CharacterReader(content).consumeTagName());
    }

    @Test
    public void testConsumeTagNameNoDelimiterConsumesAll() {
        assertEquals("tagname", new CharacterReader("tagname").consumeTagName());
    }

    // ---------------------------------------------------------------
    // consumeToEnd
    // ---------------------------------------------------------------

    @Test
    public void testConsumeToEnd() {
        CharacterReader r = new CharacterReader("abcdef");
        r.consume();
        assertEquals("bcdef", r.consumeToEnd());
        assertTrue(r.isEmpty());
    }

    // ---------------------------------------------------------------
    // consumeLetterSequence
    // ---------------------------------------------------------------

    @Test
    public void testConsumeLetterSequenceAsciiOnly() {
        assertEquals("abcXYZ", new CharacterReader("abcXYZ123").consumeLetterSequence());
    }

    @Test
    public void testConsumeLetterSequenceUnicodeLetter() {
        // 'À' (U+00C0) อยู่นอกช่วง A-Z/a-z แต่ Character.isLetter()==true -> ทดสอบ OR branch ที่สอง
        assertEquals("abc\u00C0def", new CharacterReader("abc\u00C0def123").consumeLetterSequence());
    }

    @Test
    public void testConsumeLetterSequenceEmptyWhenStartsWithDigit() {
        assertEquals("", new CharacterReader("123abc").consumeLetterSequence());
    }

    // ---------------------------------------------------------------
    // consumeLetterThenDigitSequence
    // ---------------------------------------------------------------

    @Test
    public void testConsumeLetterThenDigitSequence() {
        assertEquals("abc123", new CharacterReader("abc123xyz").consumeLetterThenDigitSequence());
    }

    @Test
    public void testConsumeLetterThenDigitSequenceNoDigits() {
        assertEquals("abcxyz", new CharacterReader("abcxyz").consumeLetterThenDigitSequence());
    }

    @Test
    public void testConsumeLetterThenDigitSequenceNoLetters() {
        assertEquals("123", new CharacterReader("123abc").consumeLetterThenDigitSequence());
    }

    // ---------------------------------------------------------------
    // consumeHexSequence
    // ---------------------------------------------------------------

    @Test
    public void testConsumeHexSequenceMixedCase() {
        assertEquals("1aF9", new CharacterReader("1aF9xyz").consumeHexSequence());
    }

    @Test
    public void testConsumeHexSequenceStopsAtNonHex() {
        assertEquals("", new CharacterReader("zz").consumeHexSequence());
    }

    // ---------------------------------------------------------------
    // consumeDigitSequence
    // ---------------------------------------------------------------

    @Test
    public void testConsumeDigitSequence() {
        assertEquals("12345", new CharacterReader("12345abc").consumeDigitSequence());
    }

    @Test
    public void testConsumeDigitSequenceEmpty() {
        assertEquals("", new CharacterReader("abc").consumeDigitSequence());
    }

    // ---------------------------------------------------------------
    // matches(char)
    // ---------------------------------------------------------------

    @Test
    public void testMatchesCharTrue() {
        assertTrue(new CharacterReader("abc").matches('a'));
    }

    @Test
    public void testMatchesCharFalseMismatch() {
        assertFalse(new CharacterReader("abc").matches('b'));
    }

    @Test
    public void testMatchesCharFalseWhenEmpty() {
        assertFalse(new CharacterReader("").matches('a'));
    }

    // ---------------------------------------------------------------
    // matches(String)
    // ---------------------------------------------------------------

    @Test
    public void testMatchesStringTrue() {
        assertTrue(new CharacterReader("hello world").matches("hello"));
    }

    @Test
    public void testMatchesStringFalseMismatch() {
        assertFalse(new CharacterReader("hello world").matches("world"));
    }

    @Test
    public void testMatchesStringFalseTooLong() {
        assertFalse(new CharacterReader("hi").matches("hello"));
    }

    // ---------------------------------------------------------------
    // matchesIgnoreCase
    // ---------------------------------------------------------------

    @Test
    public void testMatchesIgnoreCaseTrue() {
        assertTrue(new CharacterReader("HeLLo world").matchesIgnoreCase("hello"));
    }

    @Test
    public void testMatchesIgnoreCaseFalseTooLong() {
        assertFalse(new CharacterReader("hi").matchesIgnoreCase("hello"));
    }

    @Test
    public void testMatchesIgnoreCaseFalseMismatch() {
        assertFalse(new CharacterReader("abcdef").matchesIgnoreCase("xyz"));
    }

    // ---------------------------------------------------------------
    // matchesAny(char...)
    // ---------------------------------------------------------------

    @Test
    public void testMatchesAnyTrue() {
        assertTrue(new CharacterReader("abc").matchesAny('x', 'a', 'y'));
    }

    @Test
    public void testMatchesAnyFalse() {
        assertFalse(new CharacterReader("abc").matchesAny('x', 'y'));
    }

    @Test
    public void testMatchesAnyFalseWhenEmpty() {
        assertFalse(new CharacterReader("").matchesAny('x', 'y'));
    }

    // ---------------------------------------------------------------
    // matchesAnySorted
    // ---------------------------------------------------------------

    @Test
    public void testMatchesAnySortedTrue() {
        assertTrue(new CharacterReader("abc").matchesAnySorted(new char[]{'a', 'm', 'z'}));
    }

    @Test
    public void testMatchesAnySortedFalse() {
        assertFalse(new CharacterReader("abc").matchesAnySorted(new char[]{'x', 'y', 'z'}));
    }

    @Test
    public void testMatchesAnySortedFalseWhenEmpty() {
        assertFalse(new CharacterReader("").matchesAnySorted(new char[]{'a'}));
    }

    // ---------------------------------------------------------------
    // matchesLetter
    // ---------------------------------------------------------------

    @Test
    public void testMatchesLetterTrueAscii() {
        assertTrue(new CharacterReader("abc").matchesLetter());
    }

    @Test
    public void testMatchesLetterTrueUnicode() {
        assertTrue(new CharacterReader("\u00C0bc").matchesLetter());
    }

    @Test
    public void testMatchesLetterFalseDigit() {
        assertFalse(new CharacterReader("1bc").matchesLetter());
    }

    @Test
    public void testMatchesLetterFalseWhenEmpty() {
        assertFalse(new CharacterReader("").matchesLetter());
    }

    // ---------------------------------------------------------------
    // matchesDigit
    // ---------------------------------------------------------------

    @Test
    public void testMatchesDigitTrue() {
        assertTrue(new CharacterReader("5bc").matchesDigit());
    }

    @Test
    public void testMatchesDigitFalse() {
        assertFalse(new CharacterReader("abc").matchesDigit());
    }

    @Test
    public void testMatchesDigitFalseWhenEmpty() {
        assertFalse(new CharacterReader("").matchesDigit());
    }

    // ---------------------------------------------------------------
    // matchConsume
    // ---------------------------------------------------------------

    @Test
    public void testMatchConsumeTrueAdvances() {
        CharacterReader r = new CharacterReader("hello world");
        assertTrue(r.matchConsume("hello"));
        assertEquals(5, r.pos());
    }

    @Test
    public void testMatchConsumeFalseNoAdvance() {
        CharacterReader r = new CharacterReader("hello world");
        assertFalse(r.matchConsume("world"));
        assertEquals(0, r.pos());
    }

    // ---------------------------------------------------------------
    // matchConsumeIgnoreCase
    // ---------------------------------------------------------------

    @Test
    public void testMatchConsumeIgnoreCaseTrue() {
        CharacterReader r = new CharacterReader("HELLO world");
        assertTrue(r.matchConsumeIgnoreCase("hello"));
        assertEquals(5, r.pos());
    }

    @Test
    public void testMatchConsumeIgnoreCaseFalse() {
        CharacterReader r = new CharacterReader("hello world");
        assertFalse(r.matchConsumeIgnoreCase("world"));
        assertEquals(0, r.pos());
    }

    // ---------------------------------------------------------------
    // containsIgnoreCase
    // ---------------------------------------------------------------

    @Test
    public void testContainsIgnoreCaseLowerFound() {
        assertTrue(new CharacterReader("abc</title>def").containsIgnoreCase("</title>"));
    }

    @Test
    public void testContainsIgnoreCaseUpperFound() {
        assertTrue(new CharacterReader("abc</TITLE>def").containsIgnoreCase("</title>"));
    }

    @Test
    public void testContainsIgnoreCaseMixedCaseNotFound() {
        // ตาม comment ใน source: "only finds consistent case"
        assertFalse(new CharacterReader("abc</Title>def").containsIgnoreCase("</title>"));
    }

    @Test
    public void testContainsIgnoreCaseNotPresent() {
        assertFalse(new CharacterReader("abcdef").containsIgnoreCase("xyz"));
    }

    // ---------------------------------------------------------------
    // toString
    // ---------------------------------------------------------------

    @Test
    public void testToStringReturnsRemaining() {
        CharacterReader r = new CharacterReader("abcdef");
        r.consume(); r.consume();
        assertEquals("cdef", r.toString());
    }

    // ---------------------------------------------------------------
    // cacheString / rangeEquals
    // ---------------------------------------------------------------

    @Test
    public void testCacheStringEmptyWhenCountLessThanOne() {
        assertEquals("", new CharacterReader(",abc").consumeTo(','));
    }

    @Test
    public void testCacheStringNoCacheWhenTooLong() {
        // count > maxStringCacheLen(12) -> ไม่ cache, แต่ต้อง return ค่าที่ถูกต้อง
        CharacterReader r = new CharacterReader("thisisaverylongtoken,end");
        assertEquals("thisisaverylongtoken", r.consumeTo(','));
    }

    @Test
    public void testCacheStringReusesCachedInstanceForShortRepeatedToken() {
        CharacterReader r = new CharacterReader("ab,ab,");
        String first = r.consumeTo(',');
        r.advance(); // ข้าม comma
        String second = r.consumeTo(',');
        assertEquals(first, second);
        // flyweight pattern: เนื้อหาเดียวกัน, hash เดียวกัน, ไม่มี collision -> ได้ instance เดียวกัน
        assertSame(first, second);
    }

    @Test
    public void testRangeEqualsTrue() {
        assertTrue(new CharacterReader("abcdef").rangeEquals(0, 3, "abc"));
    }

    @Test
    public void testRangeEqualsFalseDifferentLength() {
        assertFalse(new CharacterReader("abcdef").rangeEquals(0, 3, "ab"));
    }

    @Test
    public void testRangeEqualsFalseDifferentContent() {
        assertFalse(new CharacterReader("abcdef").rangeEquals(0, 3, "xyz"));
    }
}
```

## ตารางสรุป Branch/Condition Coverage

| กลุ่มเมธอดทดสอบ | Method ที่ครอบคลุม | Branch/Condition |
|---|---|---|
| testConstructor* | Constructor(Reader,int/String) | `sz>maxBufferLen` true/false, `Validate.notNull` fail, `Validate.isTrue` fail, IOException→UncheckedIOException |
| testPos/IsEmpty/Current/Consume/Unconsume/Advance* | pos,isEmpty,current,consume,unconsume,advance | `isEmptyNoBufferUp` true/false, `bufPos<1` true/false |
| testMark*/testRewind* | mark,rewindToMark | `bufMark==-1` true/false, mark invalidation after refill |
| testConsumeToEnd/testSmallBuffer* | bufferUp (loop refill) | `pos<bufSplitPoint` true/false, `read!=-1` true/false |
| testNextIndexOfChar* | nextIndexOf(char) | loop found/not found |
| testNextIndexOfSeq* | nextIndexOf(CharSequence) | startChar mismatch loop, `last<=bufLength` true/false |
| testConsumeToChar*/testConsumeToString* | consumeTo(char/String) | `offset!=-1` true/false |
| testConsumeToAny*/testConsumeToAnySorted* | consumeToAny,consumeToAnySorted | OUTER loop break, `pos>start` true/false |
| testConsumeData* | consumeData | switch case `&`,`<`,nullChar,default |
| testConsumeTagName* | consumeTagName | switch case ทุกตัว (`\t\n\r\f` ` /` `>` `<` nullChar), default |
| testConsumeLetterSequence* | consumeLetterSequence | ASCII OR Character.isLetter, break on non-letter |
| testConsumeLetterThenDigit* | consumeLetterThenDigitSequence | loop1 letter, loop2 digit แยกกัน |
| testConsumeHex*/testConsumeDigit* | consumeHexSequence,consumeDigitSequence | if/else ในแต่ละ loop |
| testMatchesChar*/testMatchesString*/testMatchesIgnoreCase* | matches,matchesIgnoreCase | empty check, length check, mismatch loop |
| testMatchesAny*/testMatchesAnySorted* | matchesAny,matchesAnySorted | isEmpty() true/false, found/not found |
| testMatchesLetter*/testMatchesDigit* | matchesLetter,matchesDigit | isEmpty() true/false, condition true/false |
| testMatchConsume*/testMatchConsumeIgnoreCase* | matchConsume,matchConsumeIgnoreCase | matches true/false branch |
| testContainsIgnoreCase* | containsIgnoreCase | loScan found, hiScan found, ไม่พบเลย |
| testToString* | toString() | normal path |
| testCacheString*/testRangeEquals* | cacheString,rangeEquals | `count>maxStringCacheLen`, `count<1`, cache hit/miss, length mismatch, content mismatch |

**หมายเหตุ:** กรณี hash-collision fallback ใน `cacheString` (เมื่อ `cached!=null` แต่ `rangeEquals` เป็น false) ไม่ได้ทดสอบโดยตรง เนื่องจากต้องคำนวณ hash function ล่วงหน้าเพื่อหาคู่สตริงที่ชนกันจริง ซึ่งไม่สามารถยืนยัน behavior ได้จาก source ที่ให้มาโดยไม่เดา