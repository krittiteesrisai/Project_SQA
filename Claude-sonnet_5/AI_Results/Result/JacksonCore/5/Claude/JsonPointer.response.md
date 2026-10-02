# วิเคราะห์ซอร์สโค้ด

จากการวิเคราะห์ `JsonPointer.java` พบจุดที่ต้องทดสอบ:

1. `compile()` - null/empty → EMPTY, ไม่มี `/` นำหน้า → throw exception, valid input → `_parseTail`
2. `_parseIndex()` - **พบ bug ที่น่าสงสัย**: `char c = str.charAt(i++);` อยู่ใน for-loop ที่มี `++i` อยู่แล้ว ทำให้ index เพิ่มขึ้น 2 ครั้งต่อรอบ ตรวจสอบตัวอักษรแค่ตำแหน่งคู่ (0,2,4,...) เท่านั้น เขียน test เพื่อดักจับ fault นี้
3. `_parseTail()` / `_parseQuotedTail()` - แยก segment ปกติ, segment ที่มี escape (`~0`, `~1`), escape ไม่รู้จัก, escape ที่ตามด้วย slash จริง
4. `matchProperty()`, `matchElement()`, `tail()`, `equals()`, `hashCode()`, `toString()` - ทุก branch

# JsonPointerTest.java

```java
package com.fasterxml.jackson.core;

import static org.junit.Assert.*;
import org.junit.Test;

public class JsonPointerTest {

    // ==================== compile(): null/empty ====================

    @Test
    public void testCompileNullReturnsEmpty() {
        JsonPointer p = JsonPointer.compile(null);
        assertNotNull(p);
        assertTrue(p.matches());
        assertEquals("", p.toString());
        assertEquals("", p.getMatchingProperty());
        assertEquals(-1, p.getMatchingIndex());
        assertFalse(p.mayMatchElement());
        assertNull(p.tail());
    }

    @Test
    public void testCompileEmptyStringReturnsEmpty() {
        JsonPointer p = JsonPointer.compile("");
        assertTrue(p.matches());
        assertEquals("", p.toString());
    }

    // ==================== compile(): malformed input ====================

    @Test(expected = IllegalArgumentException.class)
    public void testCompileInvalidInputNoLeadingSlashThrows() {
        JsonPointer.compile("foo");
    }

    @Test
    public void testValueOfIsAliasForCompile() {
        JsonPointer p1 = JsonPointer.compile("/foo");
        JsonPointer p2 = JsonPointer.valueOf("/foo");
        assertEquals(p1, p2);
        assertEquals(p1.toString(), p2.toString());
    }

    // ==================== segment parsing (_parseTail) ====================

    @Test
    public void testSingleSegmentProperty() {
        JsonPointer p = JsonPointer.compile("/foo");
        // ต่อไปยัง EMPTY sentinel (ไม่ใช่ null) จึง matches() == false
        assertFalse(p.matches());
        assertEquals("foo", p.getMatchingProperty());
        assertEquals(-1, p.getMatchingIndex());
        assertTrue(p.mayMatchProperty());
        assertFalse(p.mayMatchElement());
        JsonPointer tail = p.tail();
        assertNotNull(tail);
        assertTrue(tail.matches());
    }

    @Test
    public void testMultiSegmentPath() {
        JsonPointer p = JsonPointer.compile("/foo/bar");
        assertEquals("foo", p.getMatchingProperty());
        JsonPointer tail1 = p.tail();
        assertEquals("bar", tail1.getMatchingProperty());
        JsonPointer tail2 = tail1.tail();
        assertTrue(tail2.matches());
        assertNull(tail2.tail());
    }

    @Test
    public void testTrailingSlashCreatesEmptyPropertySegment() {
        JsonPointer p = JsonPointer.compile("/foo/");
        assertEquals("foo", p.getMatchingProperty());
        JsonPointer tail = p.tail();
        assertEquals("", tail.getMatchingProperty());
        assertFalse(tail.mayMatchElement());
        assertTrue(tail.tail().matches());
    }

    @Test
    public void testSingleSlashOnlyProducesEmptyPropertySegment() {
        JsonPointer p = JsonPointer.compile("/");
        assertEquals("", p.getMatchingProperty());
        assertFalse(p.mayMatchElement());
        assertTrue(p.tail().matches());
    }

    @Test
    public void testDoubleSlashProducesEmptyFirstSegment() {
        JsonPointer p = JsonPointer.compile("//");
        assertEquals("", p.getMatchingProperty());
        assertFalse(p.mayMatchElement());
        JsonPointer tail = p.tail();
        assertEquals("", tail.getMatchingProperty());
        assertTrue(tail.tail().matches());
    }

    // ==================== _parseIndex(): boundary ====================

    @Test
    public void testNumericSegmentIsValidIndex() {
        JsonPointer p = JsonPointer.compile("/12");
        assertTrue(p.mayMatchElement());
        assertEquals(12, p.getMatchingIndex());
    }

    @Test
    public void testZeroIndex() {
        JsonPointer p = JsonPointer.compile("/0");
        assertTrue(p.mayMatchElement());
        assertEquals(0, p.getMatchingIndex());
    }

    @Test
    public void testNonNumericSegmentIsNotIndex() {
        // char c > '9' || c < '0' -> return -1 (ตรวจพบทันทีที่ index 0)
        JsonPointer p = JsonPointer.compile("/abc");
        assertFalse(p.mayMatchElement());
        assertEquals(-1, p.getMatchingIndex());
    }

    @Test
    public void testIndexLengthExceeding10DigitsIsInvalid() {
        // len > 10 branch
        JsonPointer p = JsonPointer.compile("/12345678901"); // 11 หลัก
        assertFalse(p.mayMatchElement());
        assertEquals(-1, p.getMatchingIndex());
    }

    @Test
    public void testIndexAt10DigitsExactIntegerMax() {
        // len == 10, l > Integer.MAX_VALUE == false
        JsonPointer p = JsonPointer.compile("/2147483647");
        assertTrue(p.mayMatchElement());
        assertEquals(Integer.MAX_VALUE, p.getMatchingIndex());
    }

    @Test
    public void testIndexAt10DigitsOverflowIsInvalid() {
        // len == 10, l > Integer.MAX_VALUE == true
        JsonPointer p = JsonPointer.compile("/9999999999");
        assertFalse(p.mayMatchElement());
        assertEquals(-1, p.getMatchingIndex());
    }

    /**
     * FAULT-DETECTION TEST:
     * _parseIndex ใช้ for-loop ร่วมกับ str.charAt(i++) ทำให้ i ถูกเพิ่มค่า
     * สองครั้งต่อรอบ ตรวจสอบตัวอักษรแค่ index คู่ (0,2,4,...) เท่านั้น
     * ตัวอักษรที่ index คี่ (เช่น 'a' ใน "1a" ที่ index 1) จะไม่ถูกตรวจสอบ
     * ตามสเปคที่ถูกต้อง segment "1a" ไม่ใช่ array index ที่ถูกต้อง จึงควรได้
     * mayMatchElement()==false, getMatchingIndex()==-1 แต่ถ้ามี bug ตาม
     * ซอร์สที่ให้มา อาจ throw NumberFormatException จาก parseInt("1a")
     * หรือคืนค่าที่ไม่ถูกต้อง ทำให้ test นี้ fail และดักจับ fault ได้
     */
    @Test
    public void testParseIndexSkipsOddPositionCharacterCheck_FaultDetection() {
        JsonPointer p = JsonPointer.compile("/1a");
        assertFalse("Segment '1a' ไม่ควรถูกตีความว่าเป็น array index ที่ถูกต้อง",
                p.mayMatchElement());
        assertEquals(-1, p.getMatchingIndex());
    }

    @Test
    public void testMayMatchPropertyAlwaysTrueForNormalPointers() {
        JsonPointer empty = JsonPointer.compile("");
        assertTrue(empty.mayMatchProperty());
        JsonPointer p = JsonPointer.compile("/x");
        assertTrue(p.mayMatchProperty());
    }

    // ==================== matchProperty() ====================

    @Test
    public void testMatchPropertySuccess() {
        JsonPointer p = JsonPointer.compile("/foo/bar");
        JsonPointer next = p.matchProperty("foo");
        assertNotNull(next);
        assertEquals(p.tail(), next);
        assertEquals("bar", next.getMatchingProperty());
    }

    @Test
    public void testMatchPropertyNameMismatchReturnsNull() {
        JsonPointer p = JsonPointer.compile("/foo/bar");
        assertNull(p.matchProperty("nope"));
    }

    @Test
    public void testMatchPropertyOnEmptyReturnsNull() {
        // _nextSegment == null -> return null
        JsonPointer empty = JsonPointer.compile("");
        assertNull(empty.matchProperty(""));
        assertNull(empty.matchProperty("anything"));
    }

    @Test
    public void testMatchPropertyOnLastSegmentReturnsEmptySentinel() {
        JsonPointer p = JsonPointer.compile("/bar");
        JsonPointer result = p.matchProperty("bar");
        assertNotNull(result);
        assertTrue(result.matches());
    }

    // ==================== matchElement() ====================

    @Test
    public void testMatchElementSuccess() {
        JsonPointer p = JsonPointer.compile("/12/34");
        JsonPointer next = p.matchElement(12);
        assertNotNull(next);
        assertEquals(p.tail(), next);
    }

    @Test
    public void testMatchElementMismatchReturnsNull() {
        JsonPointer p = JsonPointer.compile("/12");
        assertNull(p.matchElement(5));
    }

    @Test
    public void testMatchElementNegativeIndexReturnsNull() {
        // segment ไม่ใช่ตัวเลข -> _matchingElementIndex == -1
        // matchElement(-1): เงื่อนไขแรก (index != _matchingElementIndex) == false
        // เงื่อนไขที่สอง (index < 0) == true -> return null
        JsonPointer p = JsonPointer.compile("/foo");
        assertNull(p.matchElement(-1));
    }

    // ==================== tail() ====================

    @Test
    public void testTailOfEmptyIsNull() {
        JsonPointer empty = JsonPointer.compile("");
        assertNull(empty.tail());
    }

    // ==================== toString / hashCode / equals ====================

    @Test
    public void testToString() {
        JsonPointer p = JsonPointer.compile("/foo/bar");
        assertEquals("/foo/bar", p.toString());
    }

    @Test
    public void testHashCodeConsistentWithString() {
        JsonPointer p = JsonPointer.compile("/foo");
        assertEquals("/foo".hashCode(), p.hashCode());
    }

    @Test
    public void testEqualsSameReference() {
        JsonPointer p = JsonPointer.compile("/foo");
        assertTrue(p.equals(p));
    }

    @Test
    public void testEqualsNull() {
        JsonPointer p = JsonPointer.compile("/foo");
        assertFalse(p.equals(null));
    }

    @Test
    public void testEqualsDifferentType() {
        JsonPointer p = JsonPointer.compile("/foo");
        assertFalse(p.equals("some string"));
    }

    @Test
    public void testEqualsSameContentDifferentInstances() {
        JsonPointer p1 = JsonPointer.compile("/foo/bar");
        JsonPointer p2 = JsonPointer.compile("/foo/bar");
        assertNotSame(p1, p2);
        assertTrue(p1.equals(p2));
        assertTrue(p2.equals(p1));
    }

    @Test
    public void testEqualsDifferentContent() {
        JsonPointer p1 = JsonPointer.compile("/foo");
        JsonPointer p2 = JsonPointer.compile("/bar");
        assertFalse(p1.equals(p2));
    }

    // ==================== escape handling (_parseQuotedTail) ====================

    @Test
    public void testEscapeTilde1DecodesToSlash() {
        JsonPointer p = JsonPointer.compile("/a~1b");
        assertEquals("a/b", p.getMatchingProperty());
        assertTrue(p.tail().matches());
    }

    @Test
    public void testEscapeTilde0DecodesToTilde() {
        JsonPointer p = JsonPointer.compile("/a~0b");
        assertEquals("a~b", p.getMatchingProperty());
    }

    @Test
    public void testUnknownEscapeSequenceKeptLiteral() {
        // c != '0' && c != '1' -> else branch: sb.append('~'); sb.append(c)
        JsonPointer p = JsonPointer.compile("/a~2b");
        assertEquals("a~2b", p.getMatchingProperty());
    }

    @Test
    public void testEscapeAtVeryStartOfSegment_iNotGreaterThan2() {
        // ทดสอบ branch (i > 2) เป็น false ใน _parseQuotedTail
        JsonPointer p = JsonPointer.compile("/~1a");
        assertEquals("/a", p.getMatchingProperty());
    }

    @Test
    public void testEscapedSegmentFollowedByRealSlashContinuesTail() {
        // ทดสอบ branch c == '/' ภายใน while loop ของ _parseQuotedTail
        JsonPointer p = JsonPointer.compile("/a~1b/c");
        assertEquals("a/b", p.getMatchingProperty());
        JsonPointer tail = p.tail();
        assertNotNull(tail);
        assertEquals("c", tail.getMatchingProperty());
        assertTrue(tail.tail().matches());
    }

    @Test
    public void testMultipleEscapesInSingleSegment() {
        // ทดสอบ branch continue (c=='~' && i<end) ซ้ำหลายครั้งใน segment เดียว
        JsonPointer p = JsonPointer.compile("/x~0y~1z");
        assertEquals("x~y/z", p.getMatchingProperty());
    }
}
```

# สรุปตาราง Test coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testCompileNullReturnsEmpty` | `compile()`: `input == null` → EMPTY |
| `testCompileEmptyStringReturnsEmpty` | `compile()`: `input.length()==0` → EMPTY |
| `testCompileInvalidInputNoLeadingSlashThrows` | `compile()`: `charAt(0) != '/'` → throw |
| `testValueOfIsAliasForCompile` | `valueOf()` delegate branch |
| `testSingleSegmentProperty` | `_parseTail`: ไม่พบ `/` → segment สุดท้าย, `matches()`/`tail()` |
| `testMultiSegmentPath` | `_parseTail`: พบ `/` → recursive segment |
| `testTrailingSlashCreatesEmptyPropertySegment` | `_parseTail` segment ท้ายว่าง |
| `testSingleSlashOnlyProducesEmptyPropertySegment` | loop `i<end` เป็น false ทันที |
| `testDoubleSlashProducesEmptyFirstSegment` | segment แรกว่าง + recursion |
| `testNumericSegmentIsValidIndex` / `testZeroIndex` | `_parseIndex`: digit-check loop ผ่านทั้งหมด |
| `testNonNumericSegmentIsNotIndex` | `_parseIndex`: char out-of-range → -1 |
| `testIndexLengthExceeding10DigitsIsInvalid` | `_parseIndex`: `len > 10` → -1 |
| `testIndexAt10DigitsExactIntegerMax` | `_parseIndex`: `len==10`, `l > MAX_VALUE` false |
| `testIndexAt10DigitsOverflowIsInvalid` | `_parseIndex`: `len==10`, `l > MAX_VALUE` true |
| `testParseIndexSkipsOddPositionCharacterCheck_FaultDetection` | **ดักจับ fault**: double-increment bug ใน for-loop ของ `_parseIndex` |
| `testMayMatchPropertyAlwaysTrueForNormalPointers` | `mayMatchProperty()` |
| `testMatchPropertySuccess` / `Mismatch` / `OnEmpty` / `OnLastSegment` | `matchProperty()`: ทั้ง 2 เงื่อนไข OR |
| `testMatchElementSuccess` / `Mismatch` / `NegativeIndexReturnsNull` | `matchElement()`: ทั้ง 2 เงื่อนไข OR |
| `testTailOfEmptyIsNull` | `tail()` เมื่อ `_nextSegment==null` |
| `testToString` / `testHashCodeConsistentWithString` | accessor พื้นฐาน |
| `testEqualsSameReference/Null/DifferentType/SameContent/DifferentContent` | `equals()` ทุก branch |
| `testEscapeTilde1DecodesToSlash` / `Tilde0DecodesToTilde` | `_appendEscape`: `c=='1'`, `c=='0'` |
| `testUnknownEscapeSequenceKeptLiteral` | `_appendEscape`: else branch |
| `testEscapeAtVeryStartOfSegment_iNotGreaterThan2` | `_parseQuotedTail`: `if (i>2)` false branch |
| `testEscapedSegmentFollowedByRealSlashContinuesTail` | `_parseQuotedTail`: while loop `c=='/'` branch |
| `testMultipleEscapesInSingleSegment` | `_parseQuotedTail`: while loop `continue` (multiple escapes) |

**หมายเหตุ**: การทดสอบ `testParseIndexSkipsOddPositionCharacterCheck_FaultDetection` เขียนขึ้นจากการวิเคราะห์ logic ของ `_parseIndex()` ที่มี `for (int i = 0; i < len; ++i) { char c = str.charAt(i++); ... }` ซึ่งทำให้ `i` ถูกเพิ่มค่าสองครั้งต่อรอบ ส่งผลให้ตรวจสอบตัวอักษรเพียงครึ่งหนึ่งของ string เท่านั้น — เป็น behavior ที่คาดเดาจาก source code ตรง ๆ ไม่ได้ guess เพิ่มเติม