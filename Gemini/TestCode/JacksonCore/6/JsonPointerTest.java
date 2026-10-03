package com.fasterxml.jackson.core;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * ชุดทดสอบสำหรับ com.fasterxml.jackson.core.JsonPointer (Defects4J JacksonCore-6b)
 * ออกแบบโดยเน้น Branch/Condition Coverage ขั้นสูงสุด, Edge Cases และ Boundary Limits
 */
public class JsonPointerTest {

    @Test
    public void testCompile_NullAndEmpty() {
        // ทดสอบกรณี input เป็น null หรือ empty string (คืนค่า EMPTY)
        assertSame(JsonPointer.EMPTY, JsonPointer.compile(null));
        assertSame(JsonPointer.EMPTY, JsonPointer.compile(""));
        assertSame(JsonPointer.EMPTY, JsonPointer.valueOf(""));
        
        assertTrue(JsonPointer.EMPTY.matches());
        assertEquals("", JsonPointer.EMPTY.toString());
        assertEquals("", JsonPointer.EMPTY.getMatchingProperty());
        assertEquals(-1, JsonPointer.EMPTY.getMatchingIndex());
        assertNull(JsonPointer.EMPTY.tail());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCompile_InvalidStartChar() {
        // ทดสอบกรณีที่ไม่ได้เริ่มต้นด้วยเครื่องหมาย '/' ต้องโยน IllegalArgumentException
        JsonPointer.compile("invalid-pointer");
    }

    @Test
    public void testCompile_ValidSimplePointer() {
        // ทดสอบ Pointer แบบธรรมดา เช่น "/property"
        JsonPointer ptr = JsonPointer.compile("/property");
        assertNotNull(ptr);
        assertFalse(ptr.matches());
        assertEquals("/property", ptr.toString());
        assertEquals("property", ptr.getMatchingProperty());
        assertEquals(-1, ptr.getMatchingIndex());
        assertTrue(ptr.mayMatchProperty());
        assertFalse(ptr.mayMatchElement());
        
        // ทดสอบ Tail
        JsonPointer tail = ptr.tail();
        assertSame(JsonPointer.EMPTY, tail);
    }

    @Test
    public void testCompile_MultipleSegmentsAndIndices() {
        // ทดสอบหลาย Segment และ Element Index เช่น "/store/book/0/title"
        JsonPointer ptr = JsonPointer.compile("/store/book/0/title");
        
        assertEquals("/store/book/0/title", ptr.toString());
        assertEquals("store", ptr.getMatchingProperty());
        assertEquals(-1, ptr.getMatchingIndex());
        
        ptr = ptr.tail();
        assertEquals("book", ptr.getMatchingProperty());
        assertEquals(-1, ptr.getMatchingIndex());
        
        ptr = ptr.tail();
        assertEquals("0", ptr.getMatchingProperty());
        assertEquals(0, ptr.getMatchingIndex());
        assertTrue(ptr.mayMatchElement());
        
        ptr = ptr.tail();
        assertEquals("title", ptr.getMatchingProperty());
        assertEquals(-1, ptr.getMatchingIndex());
        
        assertTrue(ptr.tail().matches());
    }

    @Test
    public void testParseIndex_EdgeCasesAndBoundaries() {
        // ทดสอบ Parsing Index ที่ขอบเขตต่างๆ ผ่าน matchElement
        // เคสปกติ
        JsonPointer ptr = JsonPointer.compile("/123");
        assertEquals(123, ptr.getMatchingIndex());
        
        // เคสติดลบ (Invalid)
        JsonPointer ptrNeg = JsonPointer.compile("/-1");
        assertEquals(-1, ptrNeg.getMatchingIndex());
        
        // เคสความยาวเกิน 10 ตัวอักษร (เกินขอบเขต int)
        JsonPointer ptrTooLong = JsonPointer.compile("/12345678901");
        assertEquals(-1, ptrTooLong.getMatchingIndex());
        
        // เคสมีตัวอักษรปนกับตัวเลข
        JsonPointer ptrAlpha = JsonPointer.compile("/123a");
        assertEquals(-1, ptrAlpha.getMatchingIndex());
        
        // เคสค่าเกิน Integer.MAX_VALUE (2147483647) แต่ยาว 10 หลัก เช่น 9999999999
        JsonPointer ptrOverflow = JsonPointer.compile("/9999999999");
        assertEquals(-1, ptrOverflow.getMatchingIndex());
    }

    @Test
    public void testEscapedPointers() {
        // ทดสอบการ Escaping ตามมาตรฐาน JSON Pointer (~0 แทน '~', ~1 แทน '/')
        // เช่น /a~0b/c~1d
        JsonPointer ptr = JsonPointer.compile("/a~0b/c~1d");
        assertEquals("a~b", ptr.getMatchingProperty());
        
        JsonPointer next = ptr.tail();
        assertEquals("c/d", next.getMatchingProperty());
        
        // ทดสอบ escape แบบพิเศษ หรือเครื่องหมาย tilde เดี่ยวๆ
        JsonPointer ptrTilde = JsonPointer.compile("/foo~");
        assertEquals("foo~", ptrTilde.getMatchingProperty());
    }

    @Test
    public void testMatchingAPIs() {
        JsonPointer ptr = JsonPointer.compile("/parent/child");
        
        // matchProperty
        assertNull(ptr.matchProperty("wrong"));
        assertNotNull(ptr.matchProperty("parent"));
        
        // matchElement
        JsonPointer ptrIdx = JsonPointer.compile("/5");
        assertNull(ptrIdx.matchElement(4));
        assertNull(ptrIdx.matchElement(-1));
        assertNotNull(ptrIdx.matchElement(5));
    }

    @Test
    public void testEqualsAndHashCode() {
        JsonPointer p1 = JsonPointer.compile("/a/b");
        JsonPointer p2 = JsonPointer.compile("/a/b");
        JsonPointer p3 = JsonPointer.compile("/a/c");

        assertTrue(p1.equals(p1)); // self
        assertTrue(p1.equals(p2)); // structural equality
        assertFalse(p1.equals(p3));
        assertFalse(p1.equals(null));
        assertFalse(p1.equals("not a json pointer"));

        assertEquals(p1.hashCode(), p2.hashCode());
    }
}