以下คือชุดทดสอบ JUnit 4 สำหรับคลาส `CharacterReader` (ต้องอยู่ใน package เดียวกัน คือ `org.jsoup.parser` เนื่องจากคลาสเป้าหมายเป็น package-private)

```java
package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

public class CharacterReaderTest {

    // ---------- Constructor ----------

    @Test(expected = IllegalArgumentException.class)
    public void constructorNullThrows() {
        new CharacterReader(null);
    }

    @Test
    public void constructorNormalizesCRLF() {
        CharacterReader r = new CharacterReader("a\r\nb\rc\nd");
        // \r\n -> \n, \r -> \n, \n unchanged
        assertEquals("a\nb\nc\nd", r.toString());
    }

    @Test
    public void constructorEmptyString() {
        CharacterReader r = new CharacterReader("");
        assertTrue(r.isEmpty());
        assertEquals(0, r.pos());
    }

    // ---------- pos() / isEmpty() ----------

    @Test
    public void posInitialAndAfterConsume() {
        CharacterReader r = new CharacterReader("ab");
        assertEquals(0, r.pos());
        r.consume();
        assertEquals(1, r.pos());
    }

    @Test
    public void isEmptyFalseWhenCharsRemain() {
        CharacterReader r = new CharacterReader("a");
        assertFalse(r.isEmpty());
    }

    @Test
    public void isEmptyTrueAtEnd() {
        CharacterReader r = new CharacterReader("a");
        r.consume();
        assertTrue(r.isEmpty());
    }

    // ---------- current() ----------

    @Test
    public void currentReturnsCharWhenNotEmpty() {
        CharacterReader r = new CharacterReader("xyz");
        assertEquals('x', r.current());
    }

    @Test
    public void currentReturnsEOFWhenEmpty() {
        CharacterReader r = new CharacterReader("");
        assertEquals(CharacterReader.EOF, r.current());
    }

    // ---------- consume() ----------

    @Test
    public void consumeReturnsCharsInSequenceAndAdvances() {
        CharacterReader r = new CharacterReader("ab");
        assertEquals('a', r.consume());
        assertEquals('b', r.consume());
        assertEquals(2, r.pos());
    }

    @Test
    public void consumeReturnsEOFWhenEmpty() {
        CharacterReader r = new CharacterReader("");
        assertEquals(CharacterReader.EOF, r.consume());
        // pos still increments per source code behaviour
        assertEquals(1, r.pos());
    }

    // ---------- unconsume() ----------

    @Test
    public void unconsumeDecrementsPos() {
        CharacterReader r = new CharacterReader("ab");
        r.consume();
        r.unconsume();
        assertEquals(0, r.pos());
        assertEquals('a', r.current());
    }

    // ---------- advance() ----------

    @Test
    public void advanceIncrementsPos() {
        CharacterReader r = new CharacterReader("ab");
        r.advance();
        assertEquals(1, r.pos());
    }

    // ---------- mark() / rewindToMark() ----------

    @Test
    public void markAndRewind() {
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
    public void consumeAsStringReturnsSingleCharAndAdvances() {
        CharacterReader r = new CharacterReader("abc");
        assertEquals("a", r.consumeAsString());
        assertEquals(1, r.pos());
    }

    // ---------- consumeTo(char) ----------

    @Test
    public void consumeToCharFound() {
        CharacterReader r = new CharacterReader("abcXdef");
        String consumed = r.consumeTo('X');
        assertEquals("abc", consumed);
        assertEquals('X', r.current());
    }

    @Test
    public void consumeToCharNotFoundConsumesToEnd() {
        CharacterReader r = new CharacterReader("abcdef");
        String consumed = r.consumeTo('Z');
        assertEquals("abcdef", consumed);
        assertTrue(r.isEmpty());
    }

    // ---------- consumeTo(String) ----------

    @Test
    public void consumeToStringFound() {
        CharacterReader r = new CharacterReader("abc</div>def");
        String consumed = r.consumeTo("</div>");
        assertEquals("abc", consumed);
        assertTrue(r.matches("</div>"));
    }

    @Test
    public void consumeToStringNotFoundConsumesToEnd() {
        CharacterReader r = new CharacterReader("abcdef");
        String consumed = r.consumeTo("ZZZ");
        assertEquals("abcdef", consumed);
        assertTrue(r.isEmpty());
    }

    // ---------- consumeToAny(char...) ----------

    @Test
    public void consumeToAnyFindsMatchingSeek() {
        CharacterReader r = new CharacterReader("abc,def;ghi");
        String consumed = r.consumeToAny(',', ';');
        assertEquals("abc", consumed);
        assertEquals(',', r.current());
    }

    @Test
    public void consumeToAnyNoMatchGoesToEnd() {
        CharacterReader r = new CharacterReader("abcdef");
        String consumed = r.consumeToAny('X', 'Y');
        assertEquals("abcdef", consumed);
        assertTrue(r.isEmpty());
    }

    @Test
    public void consumeToAnyEmptyInputReturnsEmptyString() {
        CharacterReader r = new CharacterReader("");
        String consumed = r.consumeToAny('X');
        assertEquals("", consumed);
    }

    @Test
    public void consumeToAnyImmediateMatchReturnsEmptyString() {
        // pos == start immediately -> branch "pos > start ? ... : \"\""
        CharacterReader r = new CharacterReader(",abc");
        String consumed = r.consumeToAny(',');
        assertEquals("", consumed);
    }

    // ---------- consumeToEnd() ----------

    @Test
    public void consumeToEndReturnsRemainderAndSetsPosToLength() {
        CharacterReader r = new CharacterReader("abcdef");
        r.consume();
        String rest = r.consumeToEnd();
        assertEquals("bcdef", rest);
        assertTrue(r.isEmpty());
    }

    // ---------- consumeLetterSequence() ----------

    @Test
    public void consumeLetterSequenceStopsAtNonLetter() {
        CharacterReader r = new CharacterReader("abc123");
        String seq = r.consumeLetterSequence();
        assertEquals("abc", seq);
    }

    @Test
    public void consumeLetterSequenceEmptyWhenStartsWithNonLetter() {
        CharacterReader r = new CharacterReader("123abc");
        String seq = r.consumeLetterSequence();
        assertEquals("", seq);
    }

    @Test
    public void consumeLetterSequenceEntireInputAllLetters() {
        CharacterReader r = new CharacterReader("abcXYZ");
        String seq = r.consumeLetterSequence();
        assertEquals("abcXYZ", seq);
        assertTrue(r.isEmpty());
    }

    // ---------- consumeHexSequence() ----------

    @Test
    public void consumeHexSequenceMixedDigitsAndLetters() {
        CharacterReader r = new CharacterReader("1aF3G");
        String seq = r.consumeHexSequence();
        assertEquals("1aF3", seq);
    }

    @Test
    public void consumeHexSequenceEmptyWhenNoHexAtStart() {
        CharacterReader r = new CharacterReader("G123");
        String seq = r.consumeHexSequence();
        assertEquals("", seq);
    }

    @Test
    public void consumeHexSequenceEntireInput() {
        CharacterReader r = new CharacterReader("abcdefABCDEF0123456789");
        String seq = r.consumeHexSequence();
        assertEquals("abcdefABCDEF0123456789", seq);
        assertTrue(r.isEmpty());
    }

    // ---------- consumeDigitSequence() ----------

    @Test
    public void consumeDigitSequenceStopsAtNonDigit() {
        CharacterReader r = new CharacterReader("123abc");
        String seq = r.consumeDigitSequence();
        assertEquals("123", seq);
    }

    @Test
    public void consumeDigitSequenceEmptyWhenNoDigitAtStart() {
        CharacterReader r = new CharacterReader("abc123");
        String seq = r.consumeDigitSequence();
        assertEquals("", seq);
    }

    @Test
    public void consumeDigitSequenceEntireInput() {
        CharacterReader r = new CharacterReader("123456");
        String seq = r.consumeDigitSequence();
        assertEquals("123456", seq);
        assertTrue(r.isEmpty());
    }

    // ---------- matches(char) ----------

    @Test
    public void matchesCharTrue() {
        CharacterReader r = new CharacterReader("abc");
        assertTrue(r.matches('a'));
    }

    @Test
    public void matchesCharFalseDifferentChar() {
        CharacterReader r = new CharacterReader("abc");
        assertFalse(r.matches('b'));
    }

    @Test
    public void matchesCharFalseWhenEmpty() {
        CharacterReader r = new CharacterReader("");
        assertFalse(r.matches('a'));
    }

    // ---------- matches(String) ----------

    @Test
    public void matchesStringTrue() {
        CharacterReader r = new CharacterReader("abcdef");
        assertTrue(r.matches("abc"));
    }

    @Test
    public void matchesStringFalse() {
        CharacterReader r = new CharacterReader("abcdef");
        assertFalse(r.matches("xyz"));
    }

    // ---------- matchesIgnoreCase(String) ----------

    @Test
    public void matchesIgnoreCaseTrue() {
        CharacterReader r = new CharacterReader("ABCdef");
        assertTrue(r.matchesIgnoreCase("abc"));
    }

    @Test
    public void matchesIgnoreCaseFalse() {
        CharacterReader r = new CharacterReader("ABCdef");
        assertFalse(r.matchesIgnoreCase("xyz"));
    }

    // ---------- matchesAny(char...) ----------

    @Test
    public void matchesAnyTrue() {
        CharacterReader r = new CharacterReader("abc");
        assertTrue(r.matchesAny('x', 'a', 'y'));
    }

    @Test
    public void matchesAnyFalseNoMatch() {
        CharacterReader r = new CharacterReader("abc");
        assertFalse(r.matchesAny('x', 'y'));
    }

    @Test
    public void matchesAnyFalseWhenEmpty() {
        CharacterReader r = new CharacterReader("");
        assertFalse(r.matchesAny('a'));
    }

    // ---------- matchesLetter() ----------

    @Test
    public void matchesLetterTrueUpper() {
        CharacterReader r = new CharacterReader("Abc");
        assertTrue(r.matchesLetter());
    }

    @Test
    public void matchesLetterTrueLower() {
        CharacterReader r = new CharacterReader("abc");
        assertTrue(r.matchesLetter());
    }

    @Test
    public void matchesLetterFalseDigit() {
        CharacterReader r = new CharacterReader("1bc");
        assertFalse(r.matchesLetter());
    }

    @Test
    public void matchesLetterFalseWhenEmpty() {
        CharacterReader r = new CharacterReader("");
        assertFalse(r.matchesLetter());
    }

    // ---------- matchesDigit() ----------

    @Test
    public void matchesDigitTrue() {
        CharacterReader r = new CharacterReader("5bc");
        assertTrue(r.matchesDigit());
    }

    @Test
    public void matchesDigitFalseLetter() {
        CharacterReader r = new CharacterReader("abc");
        assertFalse(r.matchesDigit());
    }

    @Test
    public void matchesDigitFalseWhenEmpty() {
        CharacterReader r = new CharacterReader("");
        assertFalse(r.matchesDigit());
    }

    // ---------- matchConsume(String) ----------

    @Test
    public void matchConsumeTrueAdvancesPos() {
        CharacterReader r = new CharacterReader("abcdef");
        assertTrue(r.matchConsume("abc"));
        assertEquals(3, r.pos());
    }

    @Test
    public void matchConsumeFalseDoesNotAdvance() {
        CharacterReader r = new CharacterReader("abcdef");
        assertFalse(r.matchConsume("xyz"));
        assertEquals(0, r.pos());
    }

    // ---------- matchConsumeIgnoreCase(String) ----------

    @Test
    public void matchConsumeIgnoreCaseTrueAdvancesPos() {
        CharacterReader r = new CharacterReader("ABCdef");
        assertTrue(r.matchConsumeIgnoreCase("abc"));
        assertEquals(3, r.pos());
    }

    @Test
    public void matchConsumeIgnoreCaseFalseDoesNotAdvance() {
        CharacterReader r = new CharacterReader("ABCdef");
        assertFalse(r.matchConsumeIgnoreCase("xyz"));
        assertEquals(0, r.pos());
    }

    // ---------- containsIgnoreCase(String) ----------

    @Test
    public void containsIgnoreCaseTrueLowerScan() {
        CharacterReader r = new CharacterReader("start</title>end");
        assertTrue(r.containsIgnoreCase("</title>"));
    }

    @Test
    public void containsIgnoreCaseTrueUpperScan() {
        CharacterReader r = new CharacterReader("start</TITLE>end");
        assertTrue(r.containsIgnoreCase("</title>"));
    }

    @Test
    public void containsIgnoreCaseFalseWhenNotPresent() {
        CharacterReader r = new CharacterReader("start end");
        assertFalse(r.containsIgnoreCase("</title>"));
    }

    @Test
    public void containsIgnoreCaseFalseMixedCaseNotConsistent() {
        // Comment ที่มีในซอร์ส: "only finds consistent case" -> mixed case เช่น "</Title>" อาจไม่ถูกพบ
        // เนื่องจากไม่ตรงกับ loScan ("</title>") หรือ hiScan ("</TITLE>") ทุกตัวอักษร
        CharacterReader r = new CharacterReader("start</Title>end");
        assertFalse(r.containsIgnoreCase("</title>"));
    }

    // ---------- toString() ----------

    @Test
    public void toStringReturnsRemainingInput() {
        CharacterReader r = new CharacterReader("abcdef");
        r.consume();
        r.consume();
        assertEquals("cdef", r.toString());
    }

    @Test
    public void toStringEmptyWhenFullyConsumed() {
        CharacterReader r = new CharacterReader("ab");
        r.consumeToEnd();
        assertEquals("", r.toString());
    }
}
```

### ตารางสรุป Branch/Condition Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `constructorNullThrows` | `Validate.notNull` throw เมื่อ input = null |
| `constructorNormalizesCRLF` | regex replace `\r\n`, `\r`, `\n` (ทุก pattern) |
| `constructorEmptyString` | input ว่าง, length=0 |
| `posInitialAndAfterConsume` | ค่า pos เริ่มต้น และหลัง consume |
| `isEmptyFalseWhenCharsRemain` / `isEmptyTrueAtEnd` | เงื่อนไข `pos >= length` ทั้ง true/false |
| `currentReturnsCharWhenNotEmpty` / `currentReturnsEOFWhenEmpty` | ternary ใน `current()` ทั้งสองสาขา |
| `consumeReturnsCharsInSequenceAndAdvances` / `consumeReturnsEOFWhenEmpty` | ternary ใน `consume()` ทั้งสองสาขา |
| `unconsumeDecrementsPos` | การลด pos |
| `advanceIncrementsPos` | การเพิ่ม pos |
| `markAndRewind` | mark/rewindToMark |
| `consumeAsStringReturnsSingleCharAndAdvances` | substring + post-increment |
| `consumeToCharFound` / `consumeToCharNotFoundConsumesToEnd` | if/else ของ `consumeTo(char)` |
| `consumeToStringFound` / `consumeToStringNotFoundConsumesToEnd` | if/else ของ `consumeTo(String)` |
| `consumeToAnyFindsMatchingSeek` / `consumeToAnyNoMatchGoesToEnd` / `consumeToAnyEmptyInputReturnsEmptyString` / `consumeToAnyImmediateMatchReturnsEmptyString` | while-loop, inner for-loop break OUTER, ternary `pos>start` |
| `consumeToEndReturnsRemainderAndSetsPosToLength` | substring ถึง length, ตั้ง pos=length |
| `consumeLetterSequence*` (3 เทส) | while loop + if (letter) / else break, กรณีไม่มีตัวอักษรเลย, กรณีครอบคลุมทั้งหมด |
| `consumeHexSequence*` (3 เทส) | เงื่อนไข digit/A-F/a-f ของ hex, empty, full |
| `consumeDigitSequence*` (3 เทส) | เงื่อนไข digit, empty, full |
| `matchesChar*` (3 เทส) | `!isEmpty() && charAt==c` ทั้ง 3 สาขา (empty, match, mismatch) |
| `matchesString*` (2 เทส) | `startsWith` true/false |
| `matchesIgnoreCase*` (2 เทส) | `regionMatches` true/false |
| `matchesAny*` (3 เทส) | isEmpty true, loop match true, loop ไม่ match |
| `matchesLetter*` (4 เทส) | isEmpty, upper, lower, digit(false) |
| `matchesDigit*` (3 เทส) | isEmpty, digit(true), letter(false) |
| `matchConsume*` (2 เทส) | if/else ของ `matchConsume` |
| `matchConsumeIgnoreCase*` (2 เทส) | if/else ของ `matchConsumeIgnoreCase` |
| `containsIgnoreCase*` (4 เทส) | เงื่อนไข `||` ทั้ง loScan พบ, hiScan พบ, ไม่พบเลย, กรณี mixed-case ที่ไม่ตรงทั้งคู่ (ตามคอมเมนต์ในซอร์ส) |
| `toStringReturnsRemainingInput` / `toStringEmptyWhenFullyConsumed` | substring(pos) ปกติ และกรณี pos=length |

**หมายเหตุ:** กรณี `consumeReturnsEOFWhenEmpty` และพฤติกรรม pos ที่ยังเพิ่มขึ้นแม้ isEmpty (ตามซอร์สโค้ดจริงที่ไม่มี guard) เป็นพฤติกรรมที่ถูกต้องตามซอร์สที่ให้มา ไม่ได้เป็นการเดา behavior เพิ่มเติม — เขียนไว้เพื่อยืนยันว่า method ไม่ throw exception และ pos เปลี่ยนตามโค้ดจริง