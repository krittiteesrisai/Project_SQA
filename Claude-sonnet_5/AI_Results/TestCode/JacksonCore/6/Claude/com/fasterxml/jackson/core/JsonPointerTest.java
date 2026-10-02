package com.fasterxml.jackson.core;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonPointer;

/**
 * JUnit 4 test suite for {@link com.fasterxml.jackson.core.JsonPointer}
 * (Defects4J: JacksonCore-6b)
 *
 * ครอบคลุม: compile(), matches(), mayMatchProperty()/mayMatchElement(),
 * matchProperty()/matchElement(), tail(), toString()/hashCode()/equals(),
 * และ internal parsing (_parseIndex, _parseTail, _parseQuotedTail, _appendEscape)
 * ผ่าน public API เท่านั้น (เพราะเมธอด internal เป็น private/protected)
 */
public class JsonPointerTest {

    // ---------------------------------------------------------------
    // compile() / valueOf()
    // ---------------------------------------------------------------

    @Test
    public void testCompile_NullInput_ReturnsEmpty() {
        JsonPointer p = JsonPointer.compile(null);
        assertTrue(p.matches());
        assertEquals("", p.toString());
    }

    @Test
    public void testCompile_EmptyStringInput_ReturnsEmpty() {
        JsonPointer p = JsonPointer.compile("");
        assertTrue(p.matches());
        assertEquals("", p.toString());
        assertEquals("", p.getMatchingProperty());
        assertEquals(-1, p.getMatchingIndex());
        assertFalse(p.mayMatchElement());
        // ตาม constructor เปล่า _matchingPropertyName = "" (ไม่ null) เสมอ
        assertTrue(p.mayMatchProperty());
        // EMPTY._nextSegment == null -> matchProperty/matchElement/tail ต้องเป็น null
        assertNull(p.matchProperty("anything"));
        assertNull(p.matchElement(0));
        assertNull(p.tail());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCompile_InvalidInput_NoLeadingSlash_ThrowsException() {
        JsonPointer.compile("abc"); // ไม่ขึ้นต้นด้วย '/'
    }

    @Test
    public void testValueOf_IsAliasOfCompile() {
        JsonPointer p1 = JsonPointer.compile("/a");
        JsonPointer p2 = JsonPointer.valueOf("/a");
        assertEquals(p1.toString(), p2.toString());
    }

    @Test
    public void testCompile_RootSlashOnly() {
        // "/" -> segment เป็น "" (substring(1) ของ "/")
        JsonPointer p = JsonPointer.compile("/");
        assertEquals("", p.getMatchingProperty());
        assertFalse(p.mayMatchElement()); // _parseIndex("") -> len==0 -> -1
        assertFalse(p.matches());         // next = EMPTY (ไม่ใช่ null)
        JsonPointer tail = p.tail();
        assertTrue(tail.matches());
        assertEquals("", tail.toString());
    }

    @Test
    public void testCompile_SingleSegment() {
        JsonPointer p = JsonPointer.compile("/a");
        assertEquals("a", p.getMatchingProperty());
        assertFalse(p.matches()); // next = EMPTY
        assertEquals("/a", p.toString());
    }

    @Test
    public void testCompile_MultipleSegments_MatchTraversal() {
        JsonPointer p1 = JsonPointer.compile("/a/b");
        assertEquals("a", p1.getMatchingProperty());
        assertFalse(p1.matches());
        assertNull(p1.matchProperty("x")); // ชื่อไม่ตรง

        JsonPointer p2 = p1.matchProperty("a"); // ตรง -> ได้ next segment
        assertNotNull(p2);
        assertEquals("b", p2.getMatchingProperty());
        assertFalse(p2.matches());

        JsonPointer p3 = p2.matchProperty("b");
        assertNotNull(p3);
        assertTrue(p3.matches()); // ถึง EMPTY แล้ว
        assertEquals("", p3.toString());

        // tail() คืนค่า _nextSegment ตรง ๆ โดยไม่ตรวจชื่อ
        JsonPointer t = p1.tail();
        assertEquals("b", t.getMatchingProperty());
    }

    // ---------------------------------------------------------------
    // matches()
    // ---------------------------------------------------------------

    @Test
    public void testMatches_EmptyPointerTrue() {
        assertTrue(JsonPointer.compile("").matches());
    }

    @Test
    public void testMatches_NonEmptySegmentFalseUntilTraversed() {
        JsonPointer p = JsonPointer.compile("/x");
        assertFalse(p.matches());
    }

    // ---------------------------------------------------------------
    // mayMatchProperty() / mayMatchElement()
    // ---------------------------------------------------------------

    @Test
    public void testMayMatchProperty_AlwaysTrueGivenNonNullSegment() {
        // หมายเหตุ: จากซอร์ส _matchingPropertyName ถูกกำหนดเป็น "" หรือ segment string
        // เสมอ ไม่มีทางเป็น null ผ่าน public API ดังนั้น false-branch
        // ของ mayMatchProperty() ไม่สามารถ trigger ได้จากภายนอก
        assertTrue(JsonPointer.compile("/a").mayMatchProperty());
        assertTrue(JsonPointer.compile("").mayMatchProperty());
    }

    @Test
    public void testMayMatchElement_TrueForNumericSegment() {
        assertTrue(JsonPointer.compile("/0").mayMatchElement());
        assertTrue(JsonPointer.compile("/123").mayMatchElement());
    }

    @Test
    public void testMayMatchElement_FalseForNonNumericSegment() {
        assertFalse(JsonPointer.compile("/a").mayMatchElement());
    }

    @Test
    public void testMayMatchElement_FalseForEmptyPointer() {
        assertFalse(JsonPointer.compile("").mayMatchElement());
    }

    // ---------------------------------------------------------------
    // matchProperty()
    // ---------------------------------------------------------------

    @Test
    public void testMatchProperty_NullNextSegmentReturnsNull() {
        // EMPTY._nextSegment == null -> branch แรกเป็น true
        assertNull(JsonPointer.compile("").matchProperty("x"));
    }

    @Test
    public void testMatchProperty_NameMismatchReturnsNull() {
        JsonPointer p = JsonPointer.compile("/a");
        assertNull(p.matchProperty("b"));
    }

    @Test
    public void testMatchProperty_SuccessReturnsTail() {
        JsonPointer p = JsonPointer.compile("/a");
        JsonPointer next = p.matchProperty("a");
        assertNotNull(next);
        assertTrue(next.matches());
    }

    // ---------------------------------------------------------------
    // matchElement()
    // ---------------------------------------------------------------

    @Test
    public void testMatchElement_IndexMismatchReturnsNull() {
        JsonPointer p = JsonPointer.compile("/2");
        assertNull(p.matchElement(3)); // index != _matchingElementIndex
    }

    @Test
    public void testMatchElement_NegativeIndexReturnsNull_WhenEqualToMatchingIndex() {
        // ทดสอบ branch ที่สองแยกออกจาก branch แรก:
        // pointer ที่ _matchingElementIndex == -1 (segment ไม่ใช่ตัวเลข)
        // เรียก matchElement(-1) -> index == matchingIndex (branch แรก false)
        // แต่ index < 0 (branch สอง true) -> คืน null
        JsonPointer p = JsonPointer.compile("/a"); // _matchingElementIndex = -1
        assertNull(p.matchElement(-1));
    }

    @Test
    public void testMatchElement_SuccessReturnsTail() {
        JsonPointer p = JsonPointer.compile("/2");
        JsonPointer next = p.matchElement(2);
        assertNotNull(next);
        assertTrue(next.matches());
    }

    // ---------------------------------------------------------------
    // tail()
    // ---------------------------------------------------------------

    @Test
    public void testTail_ReturnsNextSegmentUnconditionally() {
        JsonPointer p = JsonPointer.compile("/a/b");
        JsonPointer t = p.tail();
        assertEquals("b", t.getMatchingProperty());
    }

    @Test
    public void testTail_OnEmptyPointerIsNull() {
        assertNull(JsonPointer.compile("").tail());
    }

    // ---------------------------------------------------------------
    // toString() / hashCode() / equals()
    // ---------------------------------------------------------------

    @Test
    public void testToString_ReflectsOriginalInput() {
        assertEquals("/a/b/c", JsonPointer.compile("/a/b/c").toString());
    }

    @Test
    public void testHashCode_ConsistentWithUnderlyingString() {
        JsonPointer p = JsonPointer.compile("/a");
        assertEquals("/a".hashCode(), p.hashCode());
    }

    @Test
    public void testEquals_SameInstance() {
        JsonPointer p = JsonPointer.compile("/a");
        assertTrue(p.equals(p));
    }

    @Test
    public void testEquals_Null() {
        JsonPointer p = JsonPointer.compile("/a");
        assertFalse(p.equals(null));
    }

    @Test
    public void testEquals_DifferentType() {
        JsonPointer p = JsonPointer.compile("/a");
        assertFalse(p.equals("someString"));
    }

    @Test
    public void testEquals_SameStringDifferentInstances() {
        JsonPointer p1 = JsonPointer.compile("/a/b");
        JsonPointer p2 = JsonPointer.compile("/a/b");
        assertTrue(p1.equals(p2));
    }

    @Test
    public void testEquals_DifferentStrings() {
        JsonPointer p1 = JsonPointer.compile("/a");
        JsonPointer p2 = JsonPointer.compile("/b");
        assertFalse(p1.equals(p2));
    }

    // ---------------------------------------------------------------
    // _parseIndex() ผ่าน getMatchingIndex()/mayMatchElement()
    // ---------------------------------------------------------------

    @Test
    public void testParseIndex_EmptySegment() {
        // segment == "" -> len==0 -> -1
        JsonPointer p = JsonPointer.compile("/");
        assertEquals(-1, p.getMatchingIndex());
    }

    @Test
    public void testParseIndex_LengthGreaterThan10_ReturnsMinusOne() {
        // 11 หลัก, ทุกตัวเป็นเลข แต่ len > 10 -> คืน -1 ทันที (ไม่ผ่าน loop)
        JsonPointer p = JsonPointer.compile("/12345678901");
        assertEquals(-1, p.getMatchingIndex());
        assertFalse(p.mayMatchElement());
    }

    @Test
    public void testParseIndex_NonDigitCharacter_Greater() {
        // มีอักขระที่ไม่ใช่เลข (c > '9') อยู่กลาง segment
        JsonPointer p = JsonPointer.compile("/1a2");
        assertEquals(-1, p.getMatchingIndex());
    }

    @Test
    public void testParseIndex_NonDigitCharacter_Less() {
        // มีอักขระ c < '0' (เช่น '-')
        JsonPointer p = JsonPointer.compile("/1-2");
        assertEquals(-1, p.getMatchingIndex());
    }

    @Test
    public void testParseIndex_Exactly10Digits_WithinIntMax() {
        // len==10 พอดี, ค่า == Integer.MAX_VALUE (ไม่เกิน) -> ไม่ return -1
        JsonPointer p = JsonPointer.compile("/2147483647");
        assertEquals(2147483647, p.getMatchingIndex());
        assertTrue(p.mayMatchElement());
    }

    @Test
    public void testParseIndex_Exactly10Digits_ExceedsIntMax() {
        // len==10 พอดี, ค่า > Integer.MAX_VALUE -> ต้อง return -1
        JsonPointer p = JsonPointer.compile("/2147483648");
        assertEquals(-1, p.getMatchingIndex());
        assertFalse(p.mayMatchElement());
    }

    @Test
    public void testParseIndex_LeadingZero_PerSourceCommentShouldBeRejected() {
        // หมายเหตุสำคัญ: comment ในซอร์ส "_parseIndex" ระบุว่า
        // "[core#176]: no leading zeroes allowed" แต่ loop ตรวจสอบเพียง
        // ช่วงอักขระ (0-9) โดยไม่ได้ตรวจ leading zero จริง ๆ
        // -> เป็นไปได้ว่านี่คือ "fault" ของคลาสนี้ (Defects4J JacksonCore-6b)
        // Assertion นี้อ้างอิงตามเจตนาที่ระบุใน comment ของซอร์สโค้ดเอง
        // (ไม่ใช่การเดา behavior จากภายนอก) หากเทสนี้ fail แสดงว่าพบ fault จริง
        JsonPointer p = JsonPointer.compile("/01");
        assertFalse("ตาม comment ในซอร์ส index ที่มี leading zero ไม่ควร valid",
                p.mayMatchElement());
    }

    // ---------------------------------------------------------------
    // _parseTail() branches: '/', '~' at end-of-string, ปกติ
    // ---------------------------------------------------------------

    @Test
    public void testParseTail_TildeAtEndOfString_NotTreatedAsEscape() {
        // c=='~' but i==end -> เงื่อนไข (i<end) เป็น false -> วนต่อแบบ literal
        JsonPointer p = JsonPointer.compile("/a~");
        assertEquals("a~", p.getMatchingProperty());
    }

    @Test
    public void testParseTail_MultipleSlashSegments_Recursion() {
        JsonPointer p = JsonPointer.compile("/a/b/c");
        assertEquals("a", p.getMatchingProperty());
        JsonPointer p2 = p.tail();
        assertEquals("b", p2.getMatchingProperty());
        JsonPointer p3 = p2.tail();
        assertEquals("c", p3.getMatchingProperty());
        assertTrue(p3.tail().matches());
    }

    // ---------------------------------------------------------------
    // _parseQuotedTail() + _appendEscape() branches
    // ---------------------------------------------------------------

    @Test
    public void testParseQuotedTail_EscapeSlash_Tilde1() {
        // "~1" -> '/'
        JsonPointer p = JsonPointer.compile("/a~1b");
        assertEquals("a/b", p.getMatchingProperty());
    }

    @Test
    public void testParseQuotedTail_EscapeTilde_Tilde0() {
        // "~0" -> '~'
        JsonPointer p = JsonPointer.compile("/a~0b");
        assertEquals("a~b", p.getMatchingProperty());
    }

    @Test
    public void testParseQuotedTail_InvalidEscapeChar_AppendsLiteralTilde() {
        // c ไม่ใช่ '0' หรือ '1' -> else branch: sb.append('~') แล้วต่อด้วย c เดิม
        JsonPointer p = JsonPointer.compile("/~2");
        assertEquals("~2", p.getMatchingProperty());
    }

    @Test
    public void testParseQuotedTail_TildeAtVeryStart_NoPrefixAppend() {
        // i (หลัง tilde) == 2 พอดี -> i>2 เป็น false -> ไม่ append prefix substring
        JsonPointer p = JsonPointer.compile("/~1");
        assertEquals("/", p.getMatchingProperty());
    }

    @Test
    public void testParseQuotedTail_PrefixLongerThanTwo_AppendsPrefix() {
        // i > 2 -> true -> append prefix substring(1, i-1)
        JsonPointer p = JsonPointer.compile("/ab~1cd");
        assertEquals("ab/cd", p.getMatchingProperty());
    }

    @Test
    public void testParseQuotedTail_SlashEndsQuotedSegment_RecursesTail() {
        // ภายใน quoted parsing เจอ '/' -> return พร้อม _parseTail(rest)
        JsonPointer p = JsonPointer.compile("/a~1b/c");
        assertEquals("a/b", p.getMatchingProperty());
        JsonPointer tail = p.tail();
        assertEquals("c", tail.getMatchingProperty());
    }

    @Test
    public void testParseQuotedTail_TwoConsecutiveEscapes_ContinueBranch() {
        // ทดสอบ true-branch ของ (c=='~' && i<end) ภายใน while loop สองครั้ง
        JsonPointer p = JsonPointer.compile("/a~1b~0c");
        assertEquals("a/b~c", p.getMatchingProperty());
    }

    @Test
    public void testParseQuotedTail_TildeAtEndOfQuotedSegment_FalseBranch() {
        // ทดสอบ false-branch ของ (c=='~' && i<end) ภายใน while loop
        // (tilde อยู่ตำแหน่งสุดท้ายพอดี -> i<end เป็น false -> append literal)
        JsonPointer p = JsonPointer.compile("/a~1~");
        assertEquals("a/~", p.getMatchingProperty());
    }
}
