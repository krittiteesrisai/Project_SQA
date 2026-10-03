package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
    public void testConstructWithMap() {
        SimpleType.construct(HashMap.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructWithCollection() {
        SimpleType.construct(ArrayList.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructWithArray() {
        SimpleType.construct(String[].class);
    }

    @Test
    public void testConstructValid() {
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
    public void testNarrowDifferentClass() {
        SimpleType type = SimpleType.construct(CharSequence.class);
        JavaType narrowed = type._narrow(String.class);
        assertNotSame(type, narrowed);
        assertEquals(String.class, narrowed.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithContentTypeThrowsException() {
        SimpleType type = SimpleType.construct(String.class);
        type.withContentType(SimpleType.construct(Integer.class));
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
    public void testWithTypeHandlerDifferent() {
        SimpleType type = SimpleType.construct(String.class);
        Object handler1 = new Object();
        Object handler2 = new Object();
        SimpleType t1 = type.withTypeHandler(handler1);
        SimpleType t2 = type.withTypeHandler(handler2);
        assertNotSame(t1, t2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithContentTypeHandlerThrowsException() {
        SimpleType type = SimpleType.construct(String.class);
        type.withContentTypeHandler(new Object());
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
    public void testWithValueHandlerDifferent() {
        SimpleType type = SimpleType.construct(String.class);
        SimpleType t1 = type.withValueHandler(new Object());
        SimpleType t2 = type.withValueHandler(new Object());
        assertNotSame(t1, t2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithContentValueHandlerThrowsException() {
        SimpleType type = SimpleType.construct(String.class);
        type.withContentValueHandler(new Object());
    }

    @Test
    public void testWithStaticTyping() {
        SimpleType type = SimpleType.construct(String.class);
        SimpleType staticType = type.withStaticTyping();
        assertNotSame(type, staticType);
        
        // Calling again when already static should return the same instance
        SimpleType staticType2 = staticType.withStaticTyping();
        assertSame(staticType, staticType2);
    }

    @Test
    public void testRefine() {
        SimpleType type = SimpleType.construct(String.class);
        assertNull(type.refine(String.class, TypeBindings.emptyBindings(), null, null));
    }

    @Test
    public void testGetSignaturesAndToString() {
        SimpleType type = SimpleType.construct(String.class);
        StringBuilder sbErased = new StringBuilder();
        assertNotNull(type.getErasedSignature(sbErased));

        StringBuilder sbGeneric = new StringBuilder();
        assertNotNull(type.getGenericSignature(sbGeneric));

        String toStringResult = type.toString();
        assertTrue(toStringResult.contains("simple type"));
        assertTrue(toStringResult.contains(String.class.getName()));
    }

    @Test
    public void testEqualsEdgeCases() {
        SimpleType type1 = SimpleType.construct(String.class);
        SimpleType type2 = SimpleType.construct(String.class);
        SimpleType type3 = SimpleType.construct(Integer.class);

        // Reflexive
        assertTrue(type1.equals(type1));

        // Null comparison
        assertFalse(type1.equals(null));

        // Different class type
        assertFalse(type1.equals("Not a SimpleType"));

        // Identical values
        assertTrue(type1.equals(type2));

        // Different raw class
        assertFalse(type1.equals(type3));
    }
}