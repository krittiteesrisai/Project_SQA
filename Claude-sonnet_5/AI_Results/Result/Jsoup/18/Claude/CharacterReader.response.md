# CharacterReaderTest.java

```java
package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit4 test suite for org.jsoup.parser.CharacterReader (Jsoup-18b, Defects4J)
 *
 * หมายเหตุสำคัญ:
 * - บางเทสถูกเขียนขึ้นตาม "สัญญา (contract)" ที่ชื่อเมธอดบ่งบอก (เช่น consumeToEnd()
 *   ควร consume ไปจนถึงตัวอักษรตัวสุดท้ายของ input ทั้งหมด) เพื่อให้มีโอกาสดักจับ fault
 *   ที่แท้จริงในซอร์สโค้ด (เช่น off-by-one ใน consumeToEnd()) ตามข้อกำหนดของงาน
 * - จุดที่คาดว่าจะชนกับ known defect จะมีคอมเมนต์ "// NOTE: potential defect" กำกับไว้ชัดเจน
 * - คลาสเป้าหมายเป็น package-private จึงต้องอยู่ใน package เดียวกัน (org.jsoup.parser)
 */
public class CharacterReaderTest {

    // ---------- Constructor ----------

    @Test(expected = IllegalArgumentException.class)
    // สมมติฐาน: org.jsoup.helper.Validate.notNull throw IllegalArgumentException
    // (ตามรูปแบบทั่วไปของ jsoup ในช่วงเวลานี้) หากไม่ตรง ให้ปรับ exception type
    public void testConstructorNullThrows() {
        new CharacterReader(null);
    }

    @Test
    public void testConstructorValid() {
        CharacterReader r = new CharacterReader("abc");
        assertEquals(0, r.pos());
    }

    // ---------- pos() / isEmpty() ----------

    @Test
    public void testPosInitialZero() {
        CharacterReader r = new CharacterReader("abc");
        assertEquals(0, r.pos());
    }

    @Test
    public void testIsEmptyOnEmptyString() {
        CharacterReader r = new CharacterReader("");
        assertTrue(r.isEmpty());
    }

    @Test
    public void testIsEmptyOnNonEmptyString() {
        CharacterReader r = new CharacterReader("abc");
        assertFalse(r.isEmpty());
    }

    @Test
    public void testIsEmptyAfterConsumingAll() {
        CharacterReader r = new CharacterReader("abc");
        r.consume();
        r.consume();
        r.consume();
        assertTrue(r.isEmpty());
    }

    // ---------- current() ----------

    @Test
    public void testCurrentNormal() {
        CharacterReader r = new CharacterReader("abc");
        assertEquals('a', r.current());
        // current() ไม่ควรขยับ pos
        assertEquals(0, r.pos());
    }

    @Test
    public void testCurrentAtEOF() {
        CharacterReader r = new CharacterReader("a");
        r.consume();
        assertEquals(CharacterReader.EOF, r.current());
    }

    // ---------- consume() ----------

    @Test
    public void testConsumeNormalSequenceAndEOF() {
        CharacterReader r = new CharacterReader("ab");
        assertEquals('a', r.consume());
        assertEquals(1, r.pos());
        assertEquals('b', r.consume());
        assertEquals(2, r.pos());
        // เมื่อ isEmpty() แล้ว ควร return EOF
        assertEquals(CharacterReader.EOF, r.consume());
        assertEquals(3, r.pos()); // pos ยังเพิ่มต่อไปตามโค้ด (ไม่มี guard)
    }

    // ---------- unconsume() ----------

    @Test
    public void testUnconsume() {
        CharacterReader r = new CharacterReader("abc");
        r.consume(); // pos=1
        r.unconsume(); // pos=0
        assertEquals(0, r.pos());
        assertEquals('a', r.current());
    }

    // ---------- advance() ----------

    @Test
    public void testAdvance() {
        CharacterReader r = new CharacterReader("abc");
        r.advance();
        assertEquals(1, r.pos());
        assertEquals('b', r.current());
    }

    // ---------- mark() / rewindToMark() ----------

    @Test
    public void testMarkAndRewindToMarkAtZero() {
        CharacterReader r = new CharacterReader("abcdef");
        r.mark(); // mark=0
        r.advance();
        r.advance();
        r.advance(); // pos=3
        r.rewindToMark();
        assertEquals(0, r.pos());
        assertEquals('a', r.current());
    }

    @Test
    public void testMarkAndRewindToMarkNonZero() {
        CharacterReader r = new CharacterReader("abcdef");
        r.advance();
        r.advance(); // pos=2
        r.mark();    // mark=2
        r.advance();
        r.advance();
        r.advance(); // pos=5
        r.rewindToMark();
        assertEquals(2, r.pos());
        assertEquals('c', r.current());
    }

    // ---------- consumeAsString() ----------

    @Test
    public void testConsumeAsStringNormal() {
        CharacterReader r = new CharacterReader("ab");
        assertEquals("a", r.consumeAsString());
        assertEquals(1, r.pos());
        assertEquals("b", r.consumeAsString());
        assertEquals(2, r.pos());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testConsumeAsStringPastEndThrows() {
        // ตามโค้ดจริงไม่มีการป้องกัน pos เกิน length -> คาดว่าจะ throw
        CharacterReader r = new CharacterReader("a");
        r.consumeAsString(); // pos=1 (empty)
        r.consumeAsString(); // substring(1,2) on length-1 string -> throw
    }

    // ---------- consumeTo(char) ----------

    @Test
    public void testConsumeToCharFound() {
        CharacterReader r = new CharacterReader("hello world");
        String consumed = r.consumeTo('o');
        assertEquals("hell", consumed);
        assertEquals(4, r.pos());
    }

    @Test
    public void testConsumeToCharNotFound() {
        // NOTE: potential defect - consumeTo() delegates to consumeToEnd()
        // ซึ่งมี off-by-one bug (substring(pos, length-1)) ทำให้ตัวอักษรสุดท้ายหาย
        // ตามสัญญาที่ถูกต้อง ควรได้ "abc" แต่โค้ดจริงอาจคืน "ab"
        CharacterReader r = new CharacterReader("abc");
        String consumed = r.consumeTo('z');
        assertEquals("abc", consumed); // expected ตาม contract ที่ถูกต้อง
        assertEquals(3, r.pos());
    }

    // ---------- consumeTo(String) ----------

    @Test
    public void testConsumeToStringFound() {
        CharacterReader r = new CharacterReader("hello world");
        String consumed = r.consumeTo("wor");
        assertEquals("hello ", consumed);
        assertEquals(6, r.pos());
    }

    @Test
    public void testConsumeToStringNotFound() {
        // NOTE: potential defect - เหมือนกับ consumeTo(char) เนื่องจากเรียก consumeToEnd()
        CharacterReader r = new CharacterReader("abc");
        String consumed = r.consumeTo("zz");
        assertEquals("abc", consumed); // expected ตาม contract ที่ถูกต้อง
        assertEquals(3, r.pos());
    }

    // ---------- consumeToAny(char...) ----------

    @Test
    public void testConsumeToAnyFound() {
        CharacterReader r = new CharacterReader("abc123");
        String consumed = r.consumeToAny('1', '2');
        assertEquals("abc", consumed);
        assertEquals(3, r.pos());
    }

    @Test
    public void testConsumeToAnyNotFoundReturnsFullString() {
        // เส้นทางนี้ไม่ได้เรียก consumeToEnd() จึงไม่ติด bug off-by-one
        CharacterReader r = new CharacterReader("abcdef");
        String consumed = r.consumeToAny('z');
        assertEquals("abcdef", consumed);
        assertEquals(6, r.pos());
        assertTrue(r.isEmpty());
    }

    @Test
    public void testConsumeToAnyImmediateMatchReturnsEmpty() {
        CharacterReader r = new CharacterReader("abc");
        String consumed = r.consumeToAny('a');
        assertEquals("", consumed);
        assertEquals(0, r.pos());
    }

    // ---------- consumeToEnd() ----------

    @Test
    public void testConsumeToEndNormal() {
        // NOTE: potential defect - โค้ดจริงใช้ input.substring(pos, input.length()-1)
        // ซึ่งตัดตัวอักษรสุดท้ายหายไป ตาม contract ที่ถูกต้องควรได้ "hello" ครบ
        CharacterReader r = new CharacterReader("hello");
        String consumed = r.consumeToEnd();
        assertEquals("hello", consumed); // expected ตาม contract ที่ถูกต้อง
        assertEquals(5, r.pos());
        assertTrue(r.isEmpty());
    }

    @Test
    public void testConsumeToEndOnEmptyInput() {
        // NOTE: potential defect - เมื่อ input ว่าง, length-1 = -1 -> substring(0,-1)
        // จะ throw StringIndexOutOfBoundsException ในโค้ดจริง แต่ตาม contract ที่ถูกต้อง
        // ควรได้ "" โดยไม่ throw
        CharacterReader r = new CharacterReader("");
        String consumed = r.consumeToEnd();
        assertEquals("", consumed); // expected ตาม contract ที่ถูกต้อง
    }

    // ---------- consumeLetterSequence() ----------

    @Test
    public void testConsumeLetterSequenceMixed() {
        CharacterReader r = new CharacterReader("abcDEF123");
        String consumed = r.consumeLetterSequence();
        assertEquals("abcDEF", consumed);
        assertEquals(6, r.pos());
    }

    @Test
    public void testConsumeLetterSequenceNoneAtStart() {
        CharacterReader r = new CharacterReader("123abc");
        String consumed = r.consumeLetterSequence();
        assertEquals("", consumed);
        assertEquals(0, r.pos());
    }

    @Test
    public void testConsumeLetterSequenceAllLetters() {
        CharacterReader r = new CharacterReader("abcXYZ");
        String consumed = r.consumeLetterSequence();
        assertEquals("abcXYZ", consumed);
        assertTrue(r.isEmpty());
    }

    // ---------- consumeHexSequence() ----------

    @Test
    public void testConsumeHexSequenceMixed() {
        CharacterReader r = new CharacterReader("1a2B3g");
        String consumed = r.consumeHexSequence();
        assertEquals("1a2B3", consumed);
        assertEquals(5, r.pos());
    }

    @Test
    public void testConsumeHexSequenceNoneAtStart() {
        CharacterReader r = new CharacterReader("zzz");
        String consumed = r.consumeHexSequence();
        assertEquals("", consumed);
        assertEquals(0, r.pos());
    }

    @Test
    public void testConsumeHexSequenceAllHex() {
        CharacterReader r = new CharacterReader("deadBEEF");
        String consumed = r.consumeHexSequence();
        assertEquals("deadBEEF", consumed);
        assertTrue(r.isEmpty());
    }

    // ---------- consumeDigitSequence() ----------

    @Test
    public void testConsumeDigitSequenceMixed() {
        CharacterReader r = new CharacterReader("123abc");
        String consumed = r.consumeDigitSequence();
        assertEquals("123", consumed);
        assertEquals(3, r.pos());
    }

    @Test
    public void testConsumeDigitSequenceNoneAtStart() {
        CharacterReader r = new CharacterReader("abc123");
        String consumed = r.consumeDigitSequence();
        assertEquals("", consumed);
        assertEquals(0, r.pos());
    }

    @Test
    public void testConsumeDigitSequenceAllDigits() {
        CharacterReader r = new CharacterReader("456");
        String consumed = r.consumeDigitSequence();
        assertEquals("456", consumed);
        assertTrue(r.isEmpty());
    }

    // ---------- matches(char) ----------

    @Test
    public void testMatchesCharTrue() {
        CharacterReader r = new CharacterReader("cat");
        assertTrue(r.matches('c'));
    }

    @Test
    public void testMatchesCharFalse() {
        CharacterReader r = new CharacterReader("cat");
        assertFalse(r.matches('x'));
    }

    @Test
    public void testMatchesCharWhenEmpty() {
        CharacterReader r = new CharacterReader("c");
        r.consume();
        assertFalse(r.matches('c'));
    }

    // ---------- matches(String) ----------

    @Test
    public void testMatchesStringTrue() {
        CharacterReader r = new CharacterReader("hello");
        assertTrue(r.matches("he"));
    }

    @Test
    public void testMatchesStringFalse() {
        CharacterReader r = new CharacterReader("hello");
        assertFalse(r.matches("xx"));
    }

    @Test
    public void testMatchesStringWhenPosExceedsLength() {
        CharacterReader r = new CharacterReader("hello");
        for (int i = 0; i < 5; i++) r.advance(); // pos=5
        assertFalse(r.matches("x"));
    }

    // ---------- matchesIgnoreCase(String) ----------

    @Test
    public void testMatchesIgnoreCaseTrue() {
        CharacterReader r = new CharacterReader("Hello");
        assertTrue(r.matchesIgnoreCase("HE"));
    }

    @Test
    public void testMatchesIgnoreCaseFalse() {
        CharacterReader r = new CharacterReader("Hello");
        assertFalse(r.matchesIgnoreCase("ZZ"));
    }

    // ---------- matchesAny(char...) ----------

    @Test
    public void testMatchesAnyTrue() {
        CharacterReader r = new CharacterReader("a1");
        assertTrue(r.matchesAny('a', 'b'));
    }

    @Test
    public void testMatchesAnyFalse() {
        CharacterReader r = new CharacterReader("a1");
        assertFalse(r.matchesAny('x', 'y'));
    }

    @Test
    public void testMatchesAnyWhenEmpty() {
        CharacterReader r = new CharacterReader("a");
        r.consume();
        assertFalse(r.matchesAny('a'));
    }

    // ---------- matchesLetter() ----------

    @Test
    public void testMatchesLetterTrue() {
        CharacterReader r = new CharacterReader("a1");
        assertTrue(r.matchesLetter());
    }

    @Test
    public void testMatchesLetterFalseDigit() {
        CharacterReader r = new CharacterReader("1a");
        assertFalse(r.matchesLetter());
    }

    @Test
    public void testMatchesLetterWhenEmpty() {
        CharacterReader r = new CharacterReader("a");
        r.consume();
        assertFalse(r.matchesLetter());
    }

    // ---------- matchesDigit() ----------

    @Test
    public void testMatchesDigitTrue() {
        CharacterReader r = new CharacterReader("1a");
        assertTrue(r.matchesDigit());
    }

    @Test
    public void testMatchesDigitFalseLetter() {
        CharacterReader r = new CharacterReader("a1");
        assertFalse(r.matchesDigit());
    }

    @Test
    public void testMatchesDigitWhenEmpty() {
        CharacterReader r = new CharacterReader("1");
        r.consume();
        assertFalse(r.matchesDigit());
    }

    // ---------- matchConsume(String) ----------

    @Test
    public void testMatchConsumeTrue() {
        CharacterReader r = new CharacterReader("hello world");
        boolean result = r.matchConsume("hello");
        assertTrue(result);
        assertEquals(5, r.pos());
    }

    @Test
    public void testMatchConsumeFalse() {
        CharacterReader r = new CharacterReader("hello world");
        boolean result = r.matchConsume("world");
        assertFalse(result);
        assertEquals(0, r.pos()); // pos ไม่เปลี่ยนเมื่อไม่ตรง
    }

    // ---------- matchConsumeIgnoreCase(String) ----------

    @Test
    public void testMatchConsumeIgnoreCaseTrue() {
        CharacterReader r = new CharacterReader("HELLO world");
        boolean result = r.matchConsumeIgnoreCase("hello");
        assertTrue(result);
        assertEquals(5, r.pos());
    }

    @Test
    public void testMatchConsumeIgnoreCaseFalse() {
        CharacterReader r = new CharacterReader("HELLO world");
        boolean result = r.matchConsumeIgnoreCase("world");
        assertFalse(result);
        assertEquals(0, r.pos());
    }

    // ---------- containsIgnoreCase(String) ----------

    @Test
    public void testContainsIgnoreCaseTrueLowerCase() {
        CharacterReader r = new CharacterReader("ABC</xyz>DEF");
        assertTrue(r.containsIgnoreCase("</xyz>"));
    }

    @Test
    public void testContainsIgnoreCaseTrueUpperCase() {
        CharacterReader r = new CharacterReader("ABC</XYZ>DEF");
        assertTrue(r.containsIgnoreCase("</xyz>"));
    }

    @Test
    public void testContainsIgnoreCaseFalseMixedCaseOnly() {
        // ตามคอมเมนต์ในโค้ดจริง: หาได้แค่ "consistent case" (ทั้งหมด lower หรือ ทั้งหมด upper)
        // ถ้าเป้าหมายเป็น mixed-case จะไม่พบ -> false
        CharacterReader r = new CharacterReader("ABC</Xyz>DEF");
        assertFalse(r.containsIgnoreCase("</xyz>"));
    }

    @Test
    public void testContainsIgnoreCaseFalseNotPresent() {
        CharacterReader r = new CharacterReader("ABCDEF");
        assertFalse(r.containsIgnoreCase("xyz"));
    }

    // ---------- toString() ----------

    @Test
    public void testToStringFromStart() {
        CharacterReader r = new CharacterReader("hello");
        assertEquals("hello", r.toString());
    }

    @Test
    public void testToStringAfterConsume() {
        CharacterReader r = new CharacterReader("hello");
        r.consume();
        r.consume();
        assertEquals("llo", r.toString());
    }

    @Test
    public void testToStringWhenEmpty() {
        CharacterReader r = new CharacterReader("hello");
        for (int i = 0; i < 5; i++) r.consume();
        assertEquals("", r.toString());
    }
}
```

---

## สรุปตาราง Test Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| testConstructorNullThrows / testConstructorValid | Validate.notNull: null → throw, non-null → ปกติ |
| testPosInitialZero | ค่าเริ่มต้น pos=0 |
| testIsEmptyOnEmptyString / testIsEmptyOnNonEmptyString / testIsEmptyAfterConsumingAll | isEmpty(): `pos>=length` true/false ทั้งสองฝั่ง |
| testCurrentNormal / testCurrentAtEOF | current(): ternary isEmpty()?EOF:char ทั้งสองสาขา |
| testConsumeNormalSequenceAndEOF | consume(): ปกติ + กรณี EOF |
| testUnconsume | unconsume(): pos ลดลง |
| testAdvance | advance(): pos เพิ่มขึ้น |
| testMarkAndRewindToMarkAtZero / ...NonZero | mark()/rewindToMark(): ค่า mark หลากหลาย |
| testConsumeAsStringNormal / testConsumeAsStringPastEndThrows | consumeAsString(): ปกติ + boundary exception |
| testConsumeToCharFound / testConsumeToCharNotFound | consumeTo(char): offset!=-1 / offset==-1 (เรียก consumeToEnd) |
| testConsumeToStringFound / testConsumeToStringNotFound | consumeTo(String): offset!=-1 / offset==-1 |
| testConsumeToAnyFound / ...NotFoundReturnsFullString / ...ImmediateMatchReturnsEmpty | consumeToAny(): loop match-break / loop ครบ (ไม่ match) / pos==start คืน "" |
| testConsumeToEndNormal / testConsumeToEndOnEmptyInput | consumeToEnd(): เคสปกติ (ตรวจ off-by-one) + เคส empty input |
| testConsumeLetterSequence* (3 เทส) | if/else ในลูป letter ตรง/ไม่ตรง/ครบ string |
| testConsumeHexSequence* (3 เทส) | if/else ในลูป hex ตรง/ไม่ตรง/ครบ string |
| testConsumeDigitSequence* (3 เทส) | if/else ในลูป digit ตรง/ไม่ตรง/ครบ string |
| testMatchesChar* (3 เทส) | matches(char): true/false/empty |
| testMatchesString* (3 เทส) | matches(String): true/false/pos เกิน length |
| testMatchesIgnoreCase* (2 เทส) | matchesIgnoreCase(): true/false |
| testMatchesAny* (3 เทส) | matchesAny(): isEmpty true, match true/false |
| testMatchesLetter* (3 เทส) | matchesLetter(): letter/digit/empty |
| testMatchesDigit* (3 เทส) | matchesDigit(): digit/letter/empty |
| testMatchConsume* (2 เทส) | matchConsume(): if matches true/false |
| testMatchConsumeIgnoreCase* (2 เทส) | matchConsumeIgnoreCase(): if matches true/false |
| testContainsIgnoreCase* (4 เทส) | containsIgnoreCase(): lower found / upper found / mixed-case ไม่พบ / ไม่พบเลย |
| testToString* (3 เทส) | toString(): จากจุดเริ่ม/กลาง/ท้าย (empty) |

**หมายเหตุสำคัญเกี่ยวกับ fault-finding:**
- `testConsumeToEndNormal`, `testConsumeToCharNotFound`, `testConsumeToStringNotFound`, และ `testConsumeToEndOnEmptyInput` ถูกออกแบบมาเพื่อดักจับ known defect ใน `consumeToEnd()` (บั๊ก off-by-one: `input.substring(pos, input.length() - 1)`) ซึ่งเป็นจุดบั๊กจริงใน Defects4J Jsoup-18b — เทสเหล่านี้คาดว่าจะ **FAIL** กับซอร์สโค้ดที่ให้มา และจะ **PASS** เมื่อบั๊กถูกแก้ไข