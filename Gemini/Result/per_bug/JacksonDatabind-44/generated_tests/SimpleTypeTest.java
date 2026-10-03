package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Map;
import java.util.Collection;
import java.util.HashMap;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.JavaType;

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
    public void testWithTypeHandlerSameAndDifferent() {
        SimpleType type = SimpleType.construct(String.class);
        Object handler = new Object();
        
        SimpleType type1 = type.withTypeHandler(handler);
        assertSame(type1, type1.withTypeHandler(handler)); // Same handler check

        SimpleType type2 = type.withTypeHandler(handler);
        assertNotNull(type2);
        
        SimpleType type3 = type.withTypeHandler(null);
        assertNotNull(type3);
    }

    @Test
    public void testWithValueHandlerSameAndDifferent() {
        SimpleType type = SimpleType.construct(String.class);
        Object handler = new Object();
        
        SimpleType type1 = type.withValueHandler(handler);
        assertSame(type1, type1.withValueHandler(handler)); // Same handler check

        SimpleType type2 = type.withValueHandler(handler);
        assertNotNull(type2);
    }

    @Test
    public void testWithStaticTyping() {
        SimpleType type = SimpleType.construct(String.class);
        assertFalse(type.isUseStaticTyping());

        SimpleType staticType = type.withStaticTyping();
        assertTrue(staticType.isUseStaticTyping());
        
        // Calling again should return self
        assertSame(staticType, staticType.withStaticTyping());
    }

    @Test
    public void testRefine() {
        SimpleType type = SimpleType.construct(String.class);
        assertNull(type.refine(String.class, TypeBindings.emptyBindings(), null, null));
    }

    @Test
    public void testToStringAndCanonicalName() {
        SimpleType type = SimpleType.construct(String.class);
        String toStringVal = type.toString();
        assertTrue(toStringVal.contains("java.lang.String"));
    }

    @Test
    public void testEqualsEdgeCases() {
        SimpleType type1 = SimpleType.construct(String.class);
        SimpleType type2 = SimpleType.construct(String.class);
        SimpleType type3 = SimpleType.construct(Integer.class);

        // Reflexive
        assertTrue(type1.equals(type1));

        // Null check
        assertFalse(type1.equals(null));

        // Different class type check
        assertFalse(type1.equals("NotAJavaType"));

        // Same class and bindings
        assertTrue(type1.equals(type2));

        // Different raw class
        assertFalse(type1.equals(type3));
    }

    @Test
    public void testGetSignatures() {
        SimpleType type = SimpleType.construct(String.class);
        StringBuilder sb = new StringBuilder();
        assertNotNull(type.getErasedSignature(sb));
        
        StringBuilder sb2 = new StringBuilder();
        assertNotNull(type.getGenericSignature(sb2));
    }
}