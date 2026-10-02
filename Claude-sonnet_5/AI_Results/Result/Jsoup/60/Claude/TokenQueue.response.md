# JUnit 4 Test Suite สำหรับ TokenQueue

```java
package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

public class TokenQueueTest {

    // ===================== Constructor =====================
    @Test(expected = IllegalArgumentException.class)
    // Validate.notNull (commons-lang) throws IllegalArgumentException เมื่อ argument เป็น null
    public void testConstructorNull() {
        new TokenQueue(null);
    }

    @Test
    public void testConstructorEmptyString() {
        TokenQueue tq = new TokenQueue("");
        assertTrue(tq.isEmpty());
    }

    // ===================== isEmpty / remainingLength =====================
    @Test
    public void testIsEmptyTrue() {
        assertTrue(new TokenQueue("").isEmpty());
    }

    @Test
    public void testIsEmptyFalse() {
        assertFalse(new TokenQueue("abc").isEmpty());
    }

    // ===================== peek =====================
    @Test
    public void testPeekEmptyReturnsZero() {
        TokenQueue tq = new TokenQueue("");
        assertEquals(0, tq.peek());
    }

    @Test
    public void testPeekNonEmpty() {
        TokenQueue tq = new TokenQueue("abc");
        assertEquals('a', tq.peek());
    }

    // ===================== addFirst(Character) =====================
    @Test
    public void testAddFirstCharacter() {
        TokenQueue tq = new TokenQueue("bc");
        tq.addFirst(Character.valueOf('a'));
        assertEquals("abc", tq.toString());
    }

    // ===================== addFirst(String) =====================
    @Test
    public void testAddFirstStringAfterConsume() {
        TokenQueue tq = new TokenQueue("bc");
        tq.consume(); // pos=1
        tq.addFirst("XY");
        assertEquals("XYc", tq.toString());
    }

    @Test
    public void testAddFirstStringOnEmptyQueue() {
        TokenQueue tq = new TokenQueue("");
        tq.addFirst("abc");
        assertEquals("abc", tq.toString());
    }

    // ===================== matches =====================
    @Test
    public void testMatchesTrueCaseInsensitive() {
        assertTrue(new TokenQueue("ABCdef").matches("abc"));
    }

    @Test
    public void testMatchesFalse() {
        assertFalse(new TokenQueue("abc").matches("xyz"));
    }

    @Test
    public void testMatchesSeqLongerThanRemaining() {
        assertFalse(new TokenQueue("ab").matches("abcdef"));
    }

    // ===================== matchesCS =====================
    @Test
    public void testMatchesCSTrue() {
        assertTrue(new TokenQueue("ABCdef").matchesCS("ABC"));
    }

    @Test
    public void testMatchesCSFalseCaseSensitive() {
        assertFalse(new TokenQueue("ABCdef").matchesCS("abc"));
    }

    // ===================== matchesAny(String...) =====================
    @Test
    public void testMatchesAnyStringFound() {
        assertTrue(new TokenQueue("hello").matchesAny("xyz", "he"));
    }

    @Test
    public void testMatchesAnyStringNotFound() {
        assertFalse(new TokenQueue("hello").matchesAny("xyz", "abc"));
    }

    @Test
    public void testMatchesAnyStringEmptyArray() {
        assertFalse(new TokenQueue("hello").matchesAny());
    }

    // ===================== matchesAny(char...) =====================
    @Test
    public void testMatchesAnyCharEmptyQueue() {
        assertFalse(new TokenQueue("").matchesAny('a', 'b'));
    }

    @Test
    public void testMatchesAnyCharFound() {
        assertTrue(new TokenQueue("abc").matchesAny('x', 'a'));
    }

    @Test
    public void testMatchesAnyCharNotFound() {
        assertFalse(new TokenQueue("abc").matchesAny('x', 'y'));
    }

    // ===================== matchesStartTag =====================
    @Test
    public void testMatchesStartTagTrue() {
        assertTrue(new TokenQueue("<div>").matchesStartTag());
    }

    @Test
    public void testMatchesStartTagFalseShortLength() {
        assertFalse(new TokenQueue("<").matchesStartTag());
    }

    @Test
    public void testMatchesStartTagFalseNotLt() {
        assertFalse(new TokenQueue("ab").matchesStartTag());
    }

    @Test
    public void testMatchesStartTagFalseNotLetter() {
        assertFalse(new TokenQueue("<1").matchesStartTag());
    }

    // ===================== matchChomp =====================
    @Test
    public void testMatchChompTrue() {
        TokenQueue tq = new TokenQueue("abcdef");
        assertTrue(tq.matchChomp("abc"));
        assertEquals("def", tq.toString());
    }

    @Test
    public void testMatchChompFalse() {
        TokenQueue tq = new TokenQueue("abcdef");
        assertFalse(tq.matchChomp("xyz"));
        assertEquals("abcdef", tq.toString());
    }

    // ===================== matchesWhitespace =====================
    @Test
    public void testMatchesWhitespaceTrue() {
        assertTrue(new TokenQueue(" abc").matchesWhitespace());
    }

    @Test
    public void testMatchesWhitespaceFalse() {
        assertFalse(new TokenQueue("abc").matchesWhitespace());
    }

    @Test
    public void testMatchesWhitespaceEmptyQueue() {
        assertFalse(new TokenQueue("").matchesWhitespace());
    }

    // ===================== matchesWord =====================
    @Test
    public void testMatchesWordTrue() {
        assertTrue(new TokenQueue("a1b").matchesWord());
    }

    @Test
    public void testMatchesWordFalse() {
        assertFalse(new TokenQueue("-abc").matchesWord());
    }

    @Test
    public void testMatchesWordEmptyQueue() {
        assertFalse(new TokenQueue("").matchesWord());
    }

    // ===================== advance =====================
    @Test
    public void testAdvanceNonEmpty() {
        TokenQueue tq = new TokenQueue("ab");
        tq.advance();
        assertEquals("b", tq.toString());
    }

    @Test
    public void testAdvanceEmptyQueueNoException() {
        TokenQueue tq = new TokenQueue("");
        tq.advance();
        assertEquals("", tq.toString());
    }

    // ===================== consume() =====================
    @Test
    public void testConsumeChar() {
        TokenQueue tq = new TokenQueue("abc");
        assertEquals('a', tq.consume());
        assertEquals("bc", tq.toString());
    }

    // ===================== consume(String) =====================
    @Test
    public void testConsumeStringMatches() {
        TokenQueue tq = new TokenQueue("abcdef");
        tq.consume("abc");
        assertEquals("def", tq.toString());
    }

    @Test(expected = IllegalStateException.class)
    public void testConsumeStringNoMatchThrows() {
        new TokenQueue("abcdef").consume("xyz");
    }

    @Test
    // หมายเหตุ: เงื่อนไข (len > remainingLength()) ดูเหมือนเป็น dead code
    // เพราะถ้า matches(seq) เป็น true (ผ่าน regionMatches) แสดงว่า remainingLength() >= seq.length() แล้ว
    // จึงไม่พบวิธี trigger branch "Queue not long enough" ได้จริงจาก public API
    public void testConsumeStringExactLengthNoException() {
        TokenQueue tq = new TokenQueue("ab");
        tq.consume("ab");
        assertTrue(tq.isEmpty());
    }

    // ===================== consumeTo =====================
    @Test
    public void testConsumeToFound() {
        TokenQueue tq = new TokenQueue("hello world");
        String result = tq.consumeTo("world");
        assertEquals("hello ", result);
        assertEquals("world", tq.toString());
    }

    @Test
    public void testConsumeToNotFoundReturnsRemainder() {
        TokenQueue tq = new TokenQueue("hello world");
        String result = tq.consumeTo("xyz");
        assertEquals("hello world", result);
        assertTrue(tq.isEmpty());
    }

    // ===================== consumeToIgnoreCase =====================
    @Test
    public void testConsumeToIgnoreCaseFoundCasedFirstChar() {
        // first char 'w' มี case ต่างกัน -> canScan=false -> ใช้ pos++ loop
        TokenQueue tq = new TokenQueue("HelloWORLDend");
        String result = tq.consumeToIgnoreCase("world");
        assertEquals("Hello", result);
    }

    @Test
    public void testConsumeToIgnoreCaseNotFoundCasedFirstChar() {
        TokenQueue tq = new TokenQueue("abcdef");
        String result = tq.consumeToIgnoreCase("xyz");
        assertEquals("abcdef", result);
        assertTrue(tq.isEmpty());
    }

    @Test
    public void testConsumeToIgnoreCaseCanScanBranch() {
        // first char '1' ไม่มี case difference -> canScan=true
        TokenQueue tq = new TokenQueue("abc123def");
        String result = tq.consumeToIgnoreCase("123");
        assertEquals("abc", result);
    }

    @Test
    public void testConsumeToIgnoreCaseSkipZeroBranch() {
        // canScan=true, current char == first char ของ seq แต่ seq ไม่ match เต็ม -> skip==0 branch
        TokenQueue tq = new TokenQueue("11123abc");
        String result = tq.consumeToIgnoreCase("123");
        assertEquals("11", result);
    }

    @Test
    public void testConsumeToIgnoreCaseSkipNegativeBranch() {
        // canScan=true, first char ของ seq ไม่พบใน queue เลย -> skip<0 -> jump to end
        TokenQueue tq = new TokenQueue("abcdef");
        String result = tq.consumeToIgnoreCase("123");
        assertEquals("abcdef", result);
        assertTrue(tq.isEmpty());
    }

    // ===================== consumeToAny =====================
    @Test
    public void testConsumeToAnyFound() {
        TokenQueue tq = new TokenQueue("abc,def;ghi");
        String result = tq.consumeToAny(",", ";");
        assertEquals("abc", result);
    }

    @Test
    public void testConsumeToAnyNotFound() {
        TokenQueue tq = new TokenQueue("abcdef");
        String result = tq.consumeToAny("x", "y");
        assertEquals("abcdef", result);
        assertTrue(tq.isEmpty());
    }

    // ===================== chompTo =====================
    @Test
    public void testChompToFoundRemovesSeq() {
        TokenQueue tq = new TokenQueue("hello world end");
        String result = tq.chompTo("world");
        assertEquals("hello ", result);
        assertEquals(" end", tq.toString());
    }

    @Test
    public void testChompToNotFound() {
        TokenQueue tq = new TokenQueue("hello");
        String result = tq.chompTo("xyz");
        assertEquals("hello", result);
        assertTrue(tq.isEmpty());
    }

    // ===================== chompToIgnoreCase =====================
    @Test
    public void testChompToIgnoreCaseFound() {
        TokenQueue tq = new TokenQueue("HelloWORLDend");
        String result = tq.chompToIgnoreCase("world");
        assertEquals("Hello", result);
        assertEquals("end", tq.toString());
    }

    // ===================== chompBalanced =====================
    @Test
    public void testChompBalancedSimpleNested() {
        TokenQueue tq = new TokenQueue("(one (two) three) four");
        String result = tq.chompBalanced('(', ')');
        assertEquals("one (two) three", result);
        assertEquals(" four", tq.toString());
    }

    @Test
    public void testChompBalancedSingleQuoteProtectsOpener() {
        TokenQueue tq = new TokenQueue("(one 'two(three' four)rest");
        String result = tq.chompBalanced('(', ')');
        assertEquals("one 'two(three' four", result);
    }

    @Test
    public void testChompBalancedDoubleQuoteProtectsOpener() {
        TokenQueue tq = new TokenQueue("(one \"two(three\" four)rest");
        String result = tq.chompBalanced('(', ')');
        assertEquals("one \"two(three\" four", result);
    }

    @Test
    public void testChompBalancedEscapedCloser() {
        // \) ที่ escape ไว้ ไม่ถูกนับเป็นตัวปิดจริง (ตาม escape ESC='\\')
        TokenQueue tq = new TokenQueue("(one \\) two)rest");
        String result = tq.chompBalanced('(', ')');
        assertEquals("one \\) two", result);
    }

    @Test
    public void testChompBalancedEmptyQueueReturnsEmpty() {
        TokenQueue tq = new TokenQueue("");
        String result = tq.chompBalanced('(', ')');
        assertEquals("", result);
    }

    @Test
    public void testChompBalancedNoOpenerBreaksAfterFirstChar() {
        // depth ไม่เคยเกิน 0 ดังนั้น do-while loop จบหลัง iteration แรก (while(depth>0) false)
        TokenQueue tq = new TokenQueue("abc");
        String result = tq.chompBalanced('(', ')');
        assertEquals("", result);
        assertEquals("bc", tq.toString()); // เฉพาะ 'a' ถูก consume ไป
    }

    // ===================== unescape (static) =====================
    @Test
    public void testUnescapeNoEscapeChars() {
        assertEquals("abc", TokenQueue.unescape("abc"));
    }

    @Test
    public void testUnescapeDoubleBackslashProducesOne() {
        assertEquals("a\\c", TokenQueue.unescape("a\\\\c"));
    }

    @Test
    public void testUnescapeTrailingSingleBackslashDropped() {
        // c==ESC แต่ last!=ESC -> ไม่ append ตัว backslash นี้
        assertEquals("ab", TokenQueue.unescape("ab\\"));
    }

    @Test
    public void testUnescapeEmptyString() {
        assertEquals("", TokenQueue.unescape(""));
    }

    // ===================== consumeWhitespace =====================
    @Test
    public void testConsumeWhitespaceSeenTrue() {
        TokenQueue tq = new TokenQueue("   abc");
        assertTrue(tq.consumeWhitespace());
        assertEquals("abc", tq.toString());
    }

    @Test
    public void testConsumeWhitespaceSeenFalse() {
        TokenQueue tq = new TokenQueue("abc");
        assertFalse(tq.consumeWhitespace());
        assertEquals("abc", tq.toString());
    }

    // ===================== consumeWord =====================
    @Test
    public void testConsumeWordNormal() {
        TokenQueue tq = new TokenQueue("abc123 def");
        assertEquals("abc123", tq.consumeWord());
    }

    @Test
    public void testConsumeWordEmptyResult() {
        TokenQueue tq = new TokenQueue(" abc");
        assertEquals("", tq.consumeWord());
    }

    // ===================== consumeTagName =====================
    @Test
    public void testConsumeTagNameWithSymbols() {
        TokenQueue tq = new TokenQueue("div-1:foo_bar baz");
        assertEquals("div-1:foo_bar", tq.consumeTagName());
    }

    @Test
    public void testConsumeTagNameEmptyQueue() {
        TokenQueue tq = new TokenQueue("");
        assertEquals("", tq.consumeTagName());
    }

    // ===================== consumeElementSelector =====================
    @Test
    public void testConsumeElementSelectorWildcardNamespace() {
        TokenQueue tq = new TokenQueue("*|div rest");
        assertEquals("*|div", tq.consumeElementSelector());
    }

    @Test
    public void testConsumeElementSelectorNamedNamespace() {
        TokenQueue tq = new TokenQueue("ns|div rest");
        assertEquals("ns|div", tq.consumeElementSelector());
    }

    @Test
    public void testConsumeElementSelectorUnderscoreDash() {
        TokenQueue tq = new TokenQueue("my-element_name rest");
        assertEquals("my-element_name", tq.consumeElementSelector());
    }

    // ===================== consumeCssIdentifier =====================
    @Test
    public void testConsumeCssIdentifierNormal() {
        TokenQueue tq = new TokenQueue("my-class_1 rest");
        assertEquals("my-class_1", tq.consumeCssIdentifier());
    }

    @Test
    public void testConsumeCssIdentifierEmptyResult() {
        TokenQueue tq = new TokenQueue(" rest");
        assertEquals("", tq.consumeCssIdentifier());
    }

    // ===================== consumeAttributeKey =====================
    @Test
    public void testConsumeAttributeKeyNormal() {
        TokenQueue tq = new TokenQueue("data-foo:bar=val");
        assertEquals("data-foo:bar", tq.consumeAttributeKey());
    }

    @Test
    public void testConsumeAttributeKeyEmptyResult() {
        TokenQueue tq = new TokenQueue("=val");
        assertEquals("", tq.consumeAttributeKey());
    }

    // ===================== remainder =====================
    @Test
    public void testRemainderAfterPartialConsume() {
        TokenQueue tq = new TokenQueue("abcdef");
        tq.consume();
        String result = tq.remainder();
        assertEquals("bcdef", result);
        assertTrue(tq.isEmpty());
    }

    @Test
    public void testRemainderOnEmptyQueue() {
        TokenQueue tq = new TokenQueue("");
        assertEquals("", tq.remainder());
    }

    // ===================== toString =====================
    @Test
    public void testToStringAfterConsume() {
        TokenQueue tq = new TokenQueue("abcdef");
        tq.consume();
        assertEquals("bcdef", tq.toString());
    }
}
```

---

## ตารางสรุปการครอบคลุม Branch/Condition

| เมธอดทดสอบ | ครอบคลุม Branch/Condition |
|---|---|
| testConstructorNull | Validate.notNull → throw IllegalArgumentException |
| testConstructorEmptyString | constructor ปกติ, queue ว่าง |
| testIsEmptyTrue/False | remainingLength()==0 ทั้ง true/false |
| testPeekEmptyReturnsZero/testPeekNonEmpty | isEmpty() ? 0 : charAt(pos) ทั้งสองสาขา |
| testAddFirstCharacter | addFirst(Character) → delegate string |
| testAddFirstStringAfterConsume/OnEmptyQueue | addFirst(String) กับ pos>0 และ pos=0 |
| testMatchesTrueCaseInsensitive/False/SeqLongerThanRemaining | regionMatches ครอบคลุม true/false/length สั้นกว่า |
| testMatchesCSTrue/FalseCaseSensitive | startsWith case-sensitive true/false |
| testMatchesAnyStringFound/NotFound/EmptyArray | loop พบ match, ไม่พบ, array ว่าง |
| testMatchesAnyCharEmptyQueue/Found/NotFound | isEmpty() branch, loop พบ/ไม่พบ char |
| testMatchesStartTagTrue/FalseShortLength/FalseNotLt/FalseNotLetter | ทุกเงื่อนไขของ && (length, '<', isLetter) |
| testMatchChompTrue/False | if(matches) true/false |
| testMatchesWhitespaceTrue/False/EmptyQueue | !isEmpty() && isWhitespace ทุกสาขา |
| testMatchesWordTrue/False/EmptyQueue | !isEmpty() && isLetterOrDigit ทุกสาขา |
| testAdvanceNonEmpty/EmptyQueueNoException | if(!isEmpty()) pos++ ทั้ง true/false |
| testConsumeChar | consume() พื้นฐาน |
| testConsumeStringMatches/NoMatchThrows/ExactLengthNoException | if(!matches) throw, len>remainingLength (หมายเหตุ dead code) |
| testConsumeToFound/NotFoundReturnsRemainder | if(offset!=-1) else branch |
| testConsumeToIgnoreCase* (4 tests) | canScan true/false, skip==0, skip<0, else branch, match break |
| testConsumeToAnyFound/NotFound | while loop with matchesAny ทั้ง found/exhausted |
| testChompToFoundRemovesSeq/NotFound | consumeTo + matchChomp รวมกัน |
| testChompToIgnoreCaseFound | consumeToIgnoreCase + matchChomp |
| testChompBalanced* (6 tests) | depth>0 loop, quote toggle, escape skip, empty queue, no-opener early exit |
| testUnescape* (4 tests) | c==ESC กับ last==ESC/last!=ESC, else branch, empty string |
| testConsumeWhitespaceSeenTrue/False | while loop เข้า/ไม่เข้า |
| testConsumeWordNormal/EmptyResult | while(matchesWord) loop มี/ไม่มี match |
| testConsumeTagNameWithSymbols/EmptyQueue | while loop with matchesWord||matchesAny(':','_','-'), isEmpty() check |
| testConsumeElementSelector* (3 tests) | matchesAny("*|","|","_","-") ทุกรูปแบบ |
| testConsumeCssIdentifierNormal/EmptyResult | matchesAny('-','_') loop มี/ไม่มี |
| testConsumeAttributeKeyNormal/EmptyResult | matchesAny('-','_',':') loop มี/ไม่มี |
| testRemainderAfterPartialConsume/OnEmptyQueue | remainder() กับ pos>0 และ queue ว่าง |
| testToStringAfterConsume | toString() หลัง pos เปลี่ยน |

**หมายเหตุสำคัญ:**
- `consume(String seq)` branch `len > remainingLength()` ดูเหมือนเป็น **dead code** เนื่องจาก `matches()` (ผ่าน `regionMatches`) จะ return false อยู่แล้วหากความยาวไม่พอ จึงไม่สามารถเขียน test ที่ trigger branch นี้ผ่าน public API ได้
- `chompBalanced` มีความซับซ้อนสูง (escape, quote, depth) — test cases อ้างอิงตาม Javadoc behavior ที่ระบุไว้ในคอมเมนต์ของซอร์สโค้ดต้นฉบับ หากพบว่า assertion ไม่ตรงกับผลลัพธ์จริง อาจเป็นจุดที่ fault (Jsoup-60b) ซ่อนอยู่