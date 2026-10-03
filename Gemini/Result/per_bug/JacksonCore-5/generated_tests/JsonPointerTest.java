package com.fasterxml.jackson.core;

import org.junit.Test;
import static org.junit.Assert.*;

public class JsonPointerTest {

    @Test
    public void testCompileNullAndEmpty() {
        // Test Branch: input == null || input.length() == 0
        assertSame(JsonPointer.EMPTY, JsonPointer.compile(null));
        assertSame(JsonPointer.EMPTY, JsonPointer.compile(""));
        assertSame(JsonPointer.EMPTY, JsonPointer.valueOf(""));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCompileInvalidStartChar() {
        // Test Branch: input.charAt(0) != '/'
        JsonPointer.compile("invalidPointer");
    }

    @Test
    public void testCompileSimplePath() {
        JsonPointer ptr = JsonPointer.compile("/foo");
        assertFalse(ptr.matches());
        assertEquals("foo", ptr.getMatchingProperty());
        assertEquals(-1, ptr.getMatchingIndex());
        assertTrue(ptr.mayMatchProperty());
        assertFalse(ptr.mayMatchElement());
        assertEquals("/foo", ptr.toString());

        JsonPointer tail = ptr.tail();
        assertTrue(tail.matches());
        assertEquals("", tail.getMatchingProperty());
    }

    @Test
    public void testCompileNestedAndArrayPath() {
        JsonPointer ptr = JsonPointer.compile("/foo/123/bar");
        assertEquals("foo", ptr.getMatchingProperty());
        assertEquals(-1, ptr.getMatchingIndex());

        JsonPointer next = ptr.tail();
        assertEquals("123", next.getMatchingProperty());
        assertEquals(123, next.getMatchingIndex());
        assertTrue(next.mayMatchElement());

        JsonPointer last = next.tail();
        assertEquals("bar", last.getMatchingProperty());
        assertTrue(last.matches());
    }

    @Test
    public void testEscapedCharacters() {
        // Test ~0 (tilde) and ~1 (slash) and general escape fallback
        JsonPointer ptr = JsonPointer.compile("/a~0b/c~1d/e~f");
        assertEquals("a~b", ptr.getMatchingProperty());
        
        JsonPointer next = ptr.tail();
        assertEquals("c/d", next.getMatchingProperty());

        JsonPointer last = next.tail();
        assertEquals("e~f", last.getMatchingProperty());
    }

    @Test
    public void testParseIndexEdgeCases() {
        // Empty or too long (> 10 chars)
        JsonPointer ptr1 = JsonPointer.compile("/abcDEFGHIJK"); // length 11
        assertEquals(-1, ptr1.getMatchingIndex());

        // Non-numeric
        JsonPointer ptr2 = JsonPointer.compile("/123a");
        assertEquals(-1, ptr2.getMatchingIndex());

        // Length 10 but overflows Integer.MAX_VALUE (e.g., 3000000000)
        JsonPointer ptr3 = JsonPointer.compile("/3000000000");
        assertEquals(-1, ptr3.getMatchingIndex());

        // Valid max int boundary
        JsonPointer ptr4 = JsonPointer.compile("/2147483647");
        assertEquals(Integer.MAX_VALUE, ptr4.getMatchingIndex());
    }

    @Test
    public void testMatchingOperations() {
        JsonPointer ptr = JsonPointer.compile("/prop/5");

        // matchProperty
        assertNull(ptr.matchProperty("wrong"));
        assertNotNull(ptr.matchProperty("prop"));
        
        // matchElement
        JsonPointer elementPtr = ptr.tail();
        assertNull(elementPtr.matchElement(-1));
        assertNull(elementPtr.matchElement(4));
        assertNotNull(elementPtr.matchElement(5));
    }

    @Test
    public void testEqualsAndHashCode() {
        JsonPointer p1 = JsonPointer.compile("/a/b");
        JsonPointer p2 = JsonPointer.compile("/a/b");
        JsonPointer p3 = JsonPointer.compile("/a/c");

        assertTrue(p1.equals(p1)); // self
        assertFalse(p1.equals(null)); // null
        assertFalse(p1.equals("notAJsonPointer")); // different class
        assertTrue(p1.equals(p2)); // equal contents
        assertFalse(p1.equals(p3)); // different contents
        assertEquals(p1.hashCode(), p2.hashCode());
    }
}