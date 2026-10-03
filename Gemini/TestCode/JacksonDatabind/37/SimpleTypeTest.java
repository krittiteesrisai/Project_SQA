package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import com.fasterxml.jackson.databind.JavaType;
import java.util.*;

import static org.junit.Assert.*;

public class SimpleTypeTest {

    @Test
    public void testConstructUnsafe() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());
        assertFalse(type.isContainerType());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructMapThrowsException() {
        SimpleType.construct(HashMap.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructCollectionThrowsException() {
        SimpleType.construct(ArrayList.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructArrayThrowsException() {
        SimpleType.construct(String[].class);
    }

    @Test
    public void testConstructValidClass() {
        SimpleType type = SimpleType.construct(String.class);
        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void testNarrowSameClass() {
        SimpleType type = SimpleType.construct(String.class);
        JavaType narrowed = type._narrow(String.class);
        assertSame(type, narrowed);
    }

    @Test
    public void testNarrowSubClass() {
        SimpleType type = SimpleType.construct(Number.class);
        JavaType narrowed = type._narrow(Integer.class);
        assertNotSame(type, narrowed);
        assertEquals(Integer.class, narrowed.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithContentTypeThrowsException() {
        SimpleType type = SimpleType.construct(String.class);
        type.withContentType(SimpleType.construct(Integer.class));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithContentTypeHandlerThrowsException() {
        SimpleType type = SimpleType.construct(String.class);
        type.withContentTypeHandler(new Object());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithContentValueHandlerThrowsException() {
        SimpleType type = SimpleType.construct(String.class);
        type.withContentValueHandler(new Object());
    }

    @Test
    public void testWithTypeHandlerSame() {
        SimpleType type = SimpleType.construct(String.class);
        Object handler = new Object();
        SimpleType t1 = type.withTypeHandler(handler);
        SimpleType t2 = t1.withTypeHandler(handler);
        assertSame(t1, t2);
    }

    @Test
    public void testWithTypeHandlerNew() {
        SimpleType type = SimpleType.construct(String.class);
        SimpleType t1 = type.withTypeHandler(new Object());
        assertNotNull(t1);
        assertNotSame(type, t1);
    }

    @Test
    public void testWithValueHandlerSame() {
        SimpleType type = SimpleType.construct(String.class);
        Object handler = new Object();
        SimpleType t1 = type.withValueHandler(handler);
        SimpleType t2 = t1.withValueHandler(handler);
        assertSame(t1, t2);
    }

    @Test
    public void testWithValueHandlerNew() {
        SimpleType type = SimpleType.construct(String.class);
        SimpleType t1 = type.withValueHandler(new Object());
        assertNotNull(t1);
        assertNotSame(type, t1);
    }

    @Test
    public void testWithStaticTyping() {
        SimpleType type = SimpleType.construct(String.class);
        JavaType t1 = type.withStaticTyping();
        JavaType t2 = t1.withStaticTyping();
        assertNotNull(t1);
        assertSame(t1, t2);
    }

    @Test
    public void testRefine() {
        SimpleType type = SimpleType.construct(String.class);
        assertNull(type.refine(String.class, TypeBindings.emptyBindings(), null, null));
    }

    @Test
    public void testSignaturesAndCanonicalName() {
        SimpleType type = SimpleType.construct(String.class);
        StringBuilder sb = new StringBuilder();
        assertNotNull(type.getErasedSignature(sb));
        
        StringBuilder sb2 = new StringBuilder();
        assertNotNull(type.getGenericSignature(sb2));
        
        String toStringResult = type.toString();
        assertTrue(toStringResult.contains("java.lang.String"));
    }

    @Test
    public void testEqualsAndHashCodeEdgeCases() {
        SimpleType type1 = SimpleType.construct(String.class);
        SimpleType type2 = SimpleType.construct(String.class);
        SimpleType type3 = SimpleType.construct(Integer.class);

        assertTrue(type1.equals(type1)); // self
        assertFalse(type1.equals(null)); // null
        assertFalse(type1.equals("Some String")); // different class type
        assertFalse(type1.equals(type3)); // different raw class
        assertTrue(type1.equals(type2)); // equivalent object
    }
}