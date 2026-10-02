เข้าใจแล้วครับ ผมจะวิเคราะห์ source code ของ `TokenQueue` ทีละเมธอด, trace การทำงานจริงของแต่ละ branch (โดยเฉพาะ `chompBalanced`, `consumeToIgnoreCase`, `unescape` ที่มี logic ซับซ้อน) แล้วเขียน JUnit 4 test ให้ครอบคลุมมากที่สุดโดยไม่เดา behavior ที่ไม่มีอยู่ในซอร์ส

```java
package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

public class TokenQueueTest {

    // ---------- Constructor ----------

    @Test(expected = IllegalArgumentException.class)
    // สมมติฐาน: org.jsoup.helper.Validate.notNull() throw IllegalArgumentException
    // (ตามรูปแบบทั่วไปของ jsoup ในเวอร์ชันนี้) หากไม่ตรงอาจต้องปรับ exception type
    public void constructorNullThrows() {
        new TokenQueue(null);
    }

    @Test
    public void constructorAcceptsEmptyString() {
        TokenQueue tq = new TokenQueue("");
        assertTrue(tq.isEmpty());
    }

    // ---------- isEmpty / remainingLength / peek ----------

    @Test
    public void isEmptyTrueWhenEmptyString() {
        assertTrue(new TokenQueue("").isEmpty());
    }

    @Test
    public void isEmptyFalseWhenHasContent() {
        assertFalse(new TokenQueue("a").isEmpty());
    }

    @Test
    public void peekReturnsZeroWhenEmpty() {
        TokenQueue tq = new TokenQueue("");
        assertEquals(0, tq.peek());
    }

    @Test
    public void peekReturnsFirstCharWhenNotEmpty() {
        TokenQueue tq = new TokenQueue("abc");
        assertEquals('a', tq.peek());
    }

    // ---------- addFirst ----------

    @Test
    public void addFirstCharacterPrepends() {
        TokenQueue tq = new TokenQueue("bc");
        tq.addFirst('a');
        assertEquals('a', tq.peek());
        assertEquals("abc", tq.toString());
    }

    @Test
    public void addFirstStringPrependsAndResetsPos() {
        TokenQueue tq = new TokenQueue("world");
        tq.consume(); // advance pos to 1
        tq.addFirst("hello ");
        assertEquals("hello orld", tq.toString()); // pos ถูก reset เป็น 0 แล้ว prepend บน substring(pos)
    }

    // ---------- matches / matchesCS ----------

    @Test
    public void matchesCaseInsensitiveTrue() {
        TokenQueue tq = new TokenQueue("ABC");
        assertTrue(tq.matches("abc"));
    }

    @Test
    public void matchesCaseInsensitiveFalse() {
        TokenQueue tq = new TokenQueue("ABC");
        assertFalse(tq.matches("xyz"));
    }

    @Test
    public void matchesCSCaseSensitiveTrue() {
        TokenQueue tq = new TokenQueue("ABC");
        assertTrue(tq.matchesCS("ABC"));
    }

    @Test
    public void matchesCSCaseSensitiveFalseDueToCase() {
        TokenQueue tq = new TokenQueue("ABC");
        assertFalse(tq.matchesCS("abc"));
    }

    // ---------- matchesAny(String...) ----------

    @Test
    public void matchesAnyStringTrue() {
        TokenQueue tq = new TokenQueue("hello");
        assertTrue(tq.matchesAny("xx", "he"));
    }

    @Test
    public void matchesAnyStringFalse() {
        TokenQueue tq = new TokenQueue("hello");
        assertFalse(tq.matchesAny("xx", "yy"));
    }

    @Test
    public void matchesAnyStringEmptyVarargsFalse() {
        TokenQueue tq = new TokenQueue("hello");
        assertFalse(tq.matchesAny(new String[0])); // loop ไม่ execute เลย
    }

    // ---------- matchesAny(char...) ----------

    @Test
    public void matchesAnyCharEmptyQueueFalse() {
        TokenQueue tq = new TokenQueue("");
        assertFalse(tq.matchesAny('a', 'b')); // isEmpty() -> true branch
    }

    @Test
    public void matchesAnyCharMatchTrue() {
        TokenQueue tq = new TokenQueue("abc");
        assertTrue(tq.matchesAny('x', 'a'));
    }

    @Test
    public void matchesAnyCharNoMatchFalse() {
        TokenQueue tq = new TokenQueue("abc");
        assertFalse(tq.matchesAny('x', 'y'));
    }

    @Test
    public void matchesAnyCharEmptyVarargsFalse() {
        TokenQueue tq = new TokenQueue("abc");
        assertFalse(tq.matchesAny(new char[0])); // loop ไม่ execute เลย (ไม่ใช่ isEmpty)
    }

    // ---------- matchesStartTag ----------

    @Test
    public void matchesStartTagTrue() {
        TokenQueue tq = new TokenQueue("<div>");
        assertTrue(tq.matchesStartTag());
    }

    @Test
    public void matchesStartTagFalseNotLetter() {
        TokenQueue tq = new TokenQueue("<1div");
        assertFalse(tq.matchesStartTag());
    }

    @Test
    public void matchesStartTagFalseTooShort() {
        TokenQueue tq = new TokenQueue("<");
        assertFalse(tq.matchesStartTag()); // remainingLength() < 2
    }

    @Test
    public void matchesStartTagFalseNoLt() {
        TokenQueue tq = new TokenQueue("ab");
        assertFalse(tq.matchesStartTag());
    }

    // ---------- matchChomp ----------

    @Test
    public void matchChompTrueAdvances() {
        TokenQueue tq = new TokenQueue("foobar");
        assertTrue(tq.matchChomp("foo"));
        assertEquals("bar", tq.toString());
    }

    @Test
    public void matchChompFalseNoAdvance() {
        TokenQueue tq = new TokenQueue("foobar");
        assertFalse(tq.matchChomp("xyz"));
        assertEquals("foobar", tq.toString());
    }

    // ---------- matchesWhitespace / matchesWord ----------

    @Test
    public void matchesWhitespaceTrue() {
        TokenQueue tq = new TokenQueue(" abc");
        assertTrue(tq.matchesWhitespace());
    }

    @Test
    public void matchesWhitespaceFalseNotWs() {
        TokenQueue tq = new TokenQueue("abc");
        assertFalse(tq.matchesWhitespace());
    }

    @Test
    public void matchesWhitespaceFalseEmpty() {
        TokenQueue tq = new TokenQueue("");
        assertFalse(tq.matchesWhitespace());
    }

    @Test
    public void matchesWordTrueLetter() {
        TokenQueue tq = new TokenQueue("abc");
        assertTrue(tq.matchesWord());
    }

    @Test
    public void matchesWordTrueDigit() {
        TokenQueue tq = new TokenQueue("5abc");
        assertTrue(tq.matchesWord());
    }

    @Test
    public void matchesWordFalseSymbol() {
        TokenQueue tq = new TokenQueue("@abc");
        assertFalse(tq.matchesWord());
    }

    @Test
    public void matchesWordFalseEmpty() {
        TokenQueue tq = new TokenQueue("");
        assertFalse(tq.matchesWord());
    }

    // ---------- advance / consume() ----------

    @Test
    public void advanceMovesPosWhenNotEmpty() {
        TokenQueue tq = new TokenQueue("abc");
        tq.advance();
        assertEquals("bc", tq.toString());
    }

    @Test
    public void advanceNoOpWhenEmpty() {
        TokenQueue tq = new TokenQueue("");
        tq.advance(); // ไม่ควร throw, ไม่ควรเปลี่ยนอะไร
        assertEquals("", tq.toString());
    }

    @Test
    public void consumeCharReturnsAndAdvances() {
        TokenQueue tq = new TokenQueue("abc");
        char c = tq.consume();
        assertEquals('a', c);
        assertEquals("bc", tq.toString());
    }

    // ---------- consume(String) ----------

    @Test
    public void consumeStringSuccess() {
        TokenQueue tq = new TokenQueue("foobar");
        tq.consume("foo");
        assertEquals("bar", tq.toString());
    }

    @Test(expected = IllegalStateException.class)
    public void consumeStringThrowsWhenNotMatching() {
        TokenQueue tq = new TokenQueue("foobar");
        tq.consume("xyz");
    }

    // หมายเหตุ: branch "Queue not long enough to consume sequence" (len > remainingLength)
    // ดูเหมือนจะเป็น dead code ในทางปฏิบัติ เพราะ regionMatches() จะ return false
    // ไปแล้วตั้งแต่ตอนเรียก matches(seq) หาก seq.length() > remainingLength()
    // จึงไม่สามารถเขียนเทสเพื่อ reach branch ที่สองได้โดยไม่แก้ไข internal state

    // ---------- consumeTo ----------

    @Test
    public void consumeToFoundReturnsSubstringAndLeavesSeq() {
        TokenQueue tq = new TokenQueue("abc<def");
        String result = tq.consumeTo("<");
        assertEquals("abc", result);
        assertEquals("<def", tq.toString());
    }

    @Test
    public void consumeToNotFoundReturnsRemainder() {
        TokenQueue tq = new TokenQueue("abcdef");
        String result = tq.consumeTo("<");
        assertEquals("abcdef", result);
        assertTrue(tq.isEmpty());
    }

    // ---------- consumeToIgnoreCase ----------

    @Test
    public void consumeToIgnoreCaseImmediateMatch() {
        TokenQueue tq = new TokenQueue("ABCdef");
        String result = tq.consumeToIgnoreCase("abc");
        assertEquals("", result);
        assertEquals("ABCdef", tq.toString());
    }

    @Test
    public void consumeToIgnoreCaseCanScanFalse_LetterBasedScan() {
        // first char ของ seq เป็นตัวอักษร (cased) -> canScan = false -> loop แบบ pos++ ทีละตัว
        TokenQueue tq = new TokenQueue("hello END world");
        String result = tq.consumeToIgnoreCase("END");
        assertEquals("hello ", result);
        assertEquals("END world", tq.toString());
    }

    @Test
    public void consumeToIgnoreCaseCanScanFalse_RunsToEndWhenNoMatch() {
        TokenQueue tq = new TokenQueue("abcdef");
        String result = tq.consumeToIgnoreCase("xyz");
        assertEquals("abcdef", result);
        assertTrue(tq.isEmpty());
    }

    @Test
    public void consumeToIgnoreCaseCanScanTrue_SkipZeroThenPositive() {
        // first char ของ seq เป็นตัวเลข (ไม่มี case) -> canScan = true
        // trace: queue="1a12", seq="12"
        // skip=0 ครั้งแรก (บังคับ pos++), จากนั้น skip>0 แล้ว match สำเร็จ
        TokenQueue tq = new TokenQueue("1a12");
        String result = tq.consumeToIgnoreCase("12");
        assertEquals("1a", result);
        assertEquals("12", tq.toString());
    }

    @Test
    public void consumeToIgnoreCaseCanScanTrue_SkipNegativeConsumesAll() {
        // first char ของ seq ไม่ปรากฎในที่เหลือของ queue เลย -> skip < 0 -> pos = queue.length()
        TokenQueue tq = new TokenQueue("abc");
        String result = tq.consumeToIgnoreCase("1");
        assertEquals("abc", result);
        assertTrue(tq.isEmpty());
    }

    // ---------- consumeToAny ----------

    @Test
    public void consumeToAnyStopsAtMatch() {
        TokenQueue tq = new TokenQueue("abc<def");
        String result = tq.consumeToAny("<", "/");
        assertEquals("abc", result);
        assertEquals("<def", tq.toString());
    }

    @Test
    public void consumeToAnyNoMatchConsumesAll() {
        TokenQueue tq = new TokenQueue("abcdef");
        String result = tq.consumeToAny("<");
        assertEquals("abcdef", result);
        assertTrue(tq.isEmpty());
    }

    @Test
    public void consumeToAnyEmptyQueueFromStart() {
        TokenQueue tq = new TokenQueue("");
        String result = tq.consumeToAny("<");
        assertEquals("", result);
    }

    // ---------- chompTo / chompToIgnoreCase ----------

    @Test
    public void chompToFoundRemovesSeqToo() {
        TokenQueue tq = new TokenQueue("abc<def");
        String result = tq.chompTo("<");
        assertEquals("abc", result);
        assertEquals("def", tq.toString()); // "<" ถูก chomp ออกไปด้วย
    }

    @Test
    public void chompToIgnoreCaseFoundRemovesSeqToo() {
        TokenQueue tq = new TokenQueue("hello END world");
        String result = tq.chompToIgnoreCase("end");
        assertEquals("hello ", result);
        assertEquals(" world", tq.toString());
    }

    // ---------- chompBalanced ----------

    @Test
    public void chompBalancedSimpleNested() {
        // ตามตัวอย่างใน Javadoc: "(one (two) three) four" -> "one (two) three", เหลือ " four"
        TokenQueue tq = new TokenQueue("(one (two) three) four");
        String result = tq.chompBalanced('(', ')');
        assertEquals("one (two) three", result);
        assertEquals(" four", tq.toString());
    }

    @Test
    public void chompBalancedWithEscapedCloser() {
        // input: ( a \) b )  -- escaped ')' ไม่ถูกนับเป็น closer
        TokenQueue tq = new TokenQueue("(a\\)b)");
        String result = tq.chompBalanced('(', ')');
        assertEquals("a\\)b", result);
        assertTrue(tq.isEmpty());
    }

    @Test
    public void chompBalancedUnbalanced_NoClosingBracket() {
        // trace: "(abc" ไม่มี ')' เลย depth ไม่ลงมาเป็น 0, loop break เพราะ isEmpty()
        // แต่ end ถูก set ไว้แล้วจากการ consume ตัวอักษรหลัง '(' ทำให้ได้ "abc" กลับมา (ไม่ใช่ "")
        TokenQueue tq = new TokenQueue("(abc");
        String result = tq.chompBalanced('(', ')');
        assertEquals("abc", result);
        assertTrue(tq.isEmpty());
    }

    @Test
    public void chompBalancedNoOpenerAtAll() {
        // trace: "abc" ไม่มี open เลย -> depth ไม่เคย >0 -> end คงเป็น -1 -> คืน ""
        // สังเกตว่า loop ออกทันทีหลัง consume ตัวแรกเพราะ depth==0 (while condition false)
        TokenQueue tq = new TokenQueue("abc");
        String result = tq.chompBalanced('(', ')');
        assertEquals("", result);
    }

    @Test
    public void chompBalancedEmptyQueue() {
        TokenQueue tq = new TokenQueue("");
        String result = tq.chompBalanced('(', ')');
        assertEquals("", result);
    }

    // ---------- unescape (static) ----------

    @Test
    public void unescapeNoEscapeCharsUnchanged() {
        assertEquals("abc", TokenQueue.unescape("abc"));
    }

    @Test
    public void unescapeSingleBackslashDropsEscape() {
        // "a\bc" (backslash จริง 1 ตัว) -> backslash ถูกตัดออก, ตัวหลังเก็บไว้
        assertEquals("abc", TokenQueue.unescape("a\\bc"));
    }

    @Test
    public void unescapeDoubleBackslashKeepsOne() {
        // "\\" (backslash จริง 2 ตัว) -> ผลลัพธ์ backslash จริง 1 ตัว
        assertEquals("\\", TokenQueue.unescape("\\\\"));
    }

    @Test
    public void unescapeLeadingBackslashThenChar() {
        assertEquals("a", TokenQueue.unescape("\\a"));
    }

    // ---------- consumeWhitespace ----------

    @Test
    public void consumeWhitespaceTrueConsumesLeadingWs() {
        TokenQueue tq = new TokenQueue("   abc");
        boolean seen = tq.consumeWhitespace();
        assertTrue(seen);
        assertEquals("abc", tq.toString());
    }

    @Test
    public void consumeWhitespaceFalseWhenNoLeadingWs() {
        TokenQueue tq = new TokenQueue("abc");
        boolean seen = tq.consumeWhitespace();
        assertFalse(seen);
        assertEquals("abc", tq.toString());
    }

    @Test
    public void consumeWhitespaceFalseWhenEmpty() {
        TokenQueue tq = new TokenQueue("");
        assertFalse(tq.consumeWhitespace());
    }

    // ---------- consumeWord ----------

    @Test
    public void consumeWordExtractsLettersAndDigits() {
        TokenQueue tq = new TokenQueue("abc123 def");
        String word = tq.consumeWord();
        assertEquals("abc123", word);
        assertEquals(" def", tq.toString());
    }

    @Test
    public void consumeWordEmptyWhenStartsNonWord() {
        TokenQueue tq = new TokenQueue("@abc");
        String word = tq.consumeWord();
        assertEquals("", word);
    }

    // ---------- consumeTagName ----------

    @Test
    public void consumeTagNameAllowsWordAndSpecialChars() {
        TokenQueue tq = new TokenQueue("my:tag_name-1 rest");
        String tag = tq.consumeTagName();
        assertEquals("my:tag_name-1", tag);
        assertEquals(" rest", tq.toString());
    }

    @Test
    public void consumeTagNameEmptyWhenEmptyQueue() {
        TokenQueue tq = new TokenQueue("");
        assertEquals("", tq.consumeTagName());
    }

    @Test
    public void consumeTagNameStopsAtDisallowedChar() {
        TokenQueue tq = new TokenQueue("div>rest");
        String tag = tq.consumeTagName();
        assertEquals("div", tag);
        assertEquals(">rest", tq.toString());
    }

    // ---------- consumeElementSelector ----------

    @Test
    public void consumeElementSelectorAllowsPipeUnderscoreDash() {
        TokenQueue tq = new TokenQueue("ns|tag_name-1 rest");
        String sel = tq.consumeElementSelector();
        assertEquals("ns|tag_name-1", sel);
        assertEquals(" rest", tq.toString());
    }

    @Test
    public void consumeElementSelectorEmptyWhenEmptyQueue() {
        TokenQueue tq = new TokenQueue("");
        assertEquals("", tq.consumeElementSelector());
    }

    @Test
    public void consumeElementSelectorStopsAtColon() {
        // ':' ไม่ได้รับอนุญาตใน consumeElementSelector (ต่างจาก consumeTagName)
        TokenQueue tq = new TokenQueue("div:pseudo");
        String sel = tq.consumeElementSelector();
        assertEquals("div", sel);
        assertEquals(":pseudo", tq.toString());
    }

    // ---------- consumeCssIdentifier ----------

    @Test
    public void consumeCssIdentifierAllowsDashUnderscore() {
        TokenQueue tq = new TokenQueue("my-class_1 rest");
        String id = tq.consumeCssIdentifier();
        assertEquals("my-class_1", id);
        assertEquals(" rest", tq.toString());
    }

    @Test
    public void consumeCssIdentifierEmptyWhenEmptyQueue() {
        TokenQueue tq = new TokenQueue("");
        assertEquals("", tq.consumeCssIdentifier());
    }

    @Test
    public void consumeCssIdentifierStopsAtColon() {
        TokenQueue tq = new TokenQueue("ident:rest");
        String id = tq.consumeCssIdentifier();
        assertEquals("ident", id);
        assertEquals(":rest", tq.toString());
    }

    // ---------- consumeAttributeKey ----------

    @Test
    public void consumeAttributeKeyAllowsColonDashUnderscore() {
        TokenQueue tq = new TokenQueue("data-foo:bar_1=val");
        String key = tq.consumeAttributeKey();
        assertEquals("data-foo:bar_1", key);
        assertEquals("=val", tq.toString());
    }

    @Test
    public void consumeAttributeKeyEmptyWhenEmptyQueue() {
        TokenQueue tq = new TokenQueue("");
        assertEquals("", tq.consumeAttributeKey());
    }

    @Test
    public void consumeAttributeKeyStopsAtEquals() {
        TokenQueue tq = new TokenQueue("key=value");
        String key = tq.consumeAttributeKey();
        assertEquals("key", key);
        assertEquals("=value", tq.toString());
    }

    // ---------- remainder ----------

    @Test
    public void remainderReturnsRestAndConsumesAll() {
        TokenQueue tq = new TokenQueue("abcdef");
        tq.consume(); // pos=1
        String rem = tq.remainder();
        assertEquals("bcdef", rem);
        assertTrue(tq.isEmpty());
    }

    @Test
    public void remainderEmptyWhenAlreadyEmpty() {
        TokenQueue tq = new TokenQueue("");
        assertEquals("", tq.remainder());
    }

    // ---------- toString ----------

    @Test
    public void toStringReflectsRemainingAfterConsume() {
        TokenQueue tq = new TokenQueue("hello");
        tq.consume();
        tq.consume();
        assertEquals("llo", tq.toString());
    }
}
```

---

## สรุปการครอบคลุม Branch/Condition

| กลุ่มเมธอดทดสอบ | Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| Constructor | constructorNullThrows, constructorAcceptsEmptyString | null -> throw, empty string ปกติ |
| isEmpty/peek | isEmptyTrue/FalseWhenHasContent, peekReturnsZero/FirstChar | remainingLength()==0 true/false |
| addFirst | addFirstCharacterPrepends, addFirstStringPrependsAndResetsPos | prepend + reset pos=0 |
| matches/matchesCS | matchesCaseInsensitiveTrue/False, matchesCSCaseSensitiveTrue/FalseDueToCase | case-insensitive vs case-sensitive |
| matchesAny(String...) | matchesAnyStringTrue/False/EmptyVarargsFalse | loop found(true-branch)/not-found/ไม่มี element ให้ loop |
| matchesAny(char...) | matchesAnyCharEmptyQueueFalse, MatchTrue, NoMatchFalse, EmptyVarargsFalse | isEmpty()=true branch, found/not-found, empty array |
| matchesStartTag | matchesStartTagTrue/FalseNotLetter/FalseTooShort/FalseNoLt | ทุกเงื่อนไขของ compound && |
| matchChomp | matchChompTrueAdvances/FalseNoAdvance | if matches / else |
| matchesWhitespace/matchesWord | matchesWhitespaceTrue/False/FalseEmpty, matchesWordTrueLetter/TrueDigit/FalseSymbol/FalseEmpty | !isEmpty && condition ทุก combination |
| advance/consume() | advanceMovesPosWhenNotEmpty/NoOpWhenEmpty, consumeCharReturnsAndAdvances | if(!isEmpty) true/false |
| consume(String) | consumeStringSuccess, consumeStringThrowsWhenNotMatching | matches true/false (ส่วน throw ที่สองเป็น dead code ตามที่วิเคราะห์ในคอมเมนต์) |
| consumeTo | consumeToFoundReturnsSubstringAndLeavesSeq, consumeToNotFoundReturnsRemainder | offset != -1 / == -1 |
| consumeToIgnoreCase | ImmediateMatch, CanScanFalse(ScanถึงMatch/ScanถึงEnd), CanScanTrue(SkipZero→Positive, SkipNegative) | matches break, canScan true/false, skip==0/<0/>0 |
| consumeToAny | StopsAtMatch, NoMatchConsumesAll, EmptyQueueFromStart | matchesAny true/false, isEmpty เป็น exit condition |
| chompTo/chompToIgnoreCase | chompToFoundRemovesSeqToo, chompToIgnoreCaseFoundRemovesSeqToo | wrapper ของ consumeTo+matchChomp |
| chompBalanced | SimpleNested, WithEscapedCloser, Unbalanced_NoClosingBracket, NoOpenerAtAll, EmptyQueue | depth++/--, start==-1 check, escape(last==ESC) skip counting, end update true/false, break จาก isEmpty, ผลลัพธ์ end>=0 หรือไม่ |
| unescape | NoEscapeCharsUnchanged, SingleBackslashDropsEscape, DoubleBackslashKeepsOne, LeadingBackslashThenChar | c==ESC true/false, last==ESC true/false |
| consumeWhitespace | True/False/FalseWhenEmpty | loop iterate/not iterate |
| consumeWord | ExtractsLettersAndDigits, EmptyWhenStartsNonWord | loop iterate/not |
| consumeTagName | AllowsWordAndSpecialChars, EmptyWhenEmptyQueue, StopsAtDisallowedChar | !isEmpty && (word||matchesAny) ทุก sub-condition |
| consumeElementSelector | AllowsPipeUnderscoreDash, EmptyWhenEmptyQueue, StopsAtColon | เหมือนด้านบนแต่ set อักขระต่าง (':' ไม่รองรับ) |
| consumeCssIdentifier | AllowsDashUnderscore, EmptyWhenEmptyQueue, StopsAtColon | เหมือนด้านบน |
| consumeAttributeKey | AllowsColonDashUnderscore, EmptyWhenEmptyQueue, StopsAtEquals | เหมือนด้านบนแต่รองรับ ':' |
| remainder | ReturnsRestAndConsumesAll, EmptyWhenAlreadyEmpty | ปกติ/ว่าง |
| toString | ReflectsRemainingAfterConsume | substring(pos) ปกติ |

**หมายเหตุสำคัญ:**
- Exception type ของ `Validate.notNull()` สมมติเป็น `IllegalArgumentException` ตามรูปแบบทั่วไปของ jsoup ช่วงเวลานั้น หากรันแล้วไม่ตรง ต้องปรับเป็น exception จริงที่ library ใช้
- Branch ที่สองใน `consume(String)` (`"Queue not long enough to consume sequence"`) วิเคราะห์แล้วว่าเป็น **dead code ในทางปฏิบัติ** เพราะ `String.regionMatches()` จะ return false ไปก่อนแล้วหาก `seq.length() > remainingLength()` จึงไม่ได้เขียนเทสสำหรับ branch นี้โดยตรง
- Test `chompBalancedUnbalanced_NoClosingBracket` และ `chompBalancedNoOpenerAtAll` ได้มาจากการ trace source code จริงทีละ step (ไม่ใช่การเดา) เพื่อยืนยันค่าที่ถูกต้องตาม logic ของ `start`/`end`/`depth`