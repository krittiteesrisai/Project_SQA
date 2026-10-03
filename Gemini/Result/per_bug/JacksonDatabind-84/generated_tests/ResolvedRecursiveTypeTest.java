package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ResolvedRecursiveTypeTest {

    private ResolvedRecursiveType type;
    private Class<?> erasedType;
    private TypeBindings bindings;

    @Before
    public void setUp() {
        erasedType = Object.class;
        bindings = TypeBindings.emptyBindings();
        type = new ResolvedRecursiveType(erasedType, bindings);
    }

    @Test
    public void testConstructorAndGetters() {
        assertNull(type.getSelfReferencedType());
        assertEquals(erasedType, type.getRawClass());
    }

    @Test
    public void testSetReferenceSuccess() {
        ResolvedRecursiveType refType = new ResolvedRecursiveType(String.class, bindings);
        type.setReference(refType);
        assertEquals(refType, type.getSelfReferencedType());
    }

    @Test(expected = IllegalStateException.class)
    public void testSetReferenceTwiceThrowsException() {
        ResolvedRecursiveType refType1 = new ResolvedRecursiveType(String.class, bindings);
        ResolvedRecursiveType refType2 = new ResolvedRecursiveType(Integer.class, bindings);
        
        type.setReference(refType1);
        // Should trigger IllegalStateException
        type.setReference(refType2);
    }

    @Test
    public void testToStringUnresolved() {
        String result = type.toString();
        assertTrue(result.contains("UNRESOLVED"));
    }

    @Test
    public void testToStringResolved() {
        ResolvedRecursiveType refType = new ResolvedRecursiveType(String.class, bindings);
        type.setReference(refType);
        String result = type.toString();
        assertTrue(result.contains(String.class.getName()));
    }

    @Test
    public void testEqualsSelf() {
        assertTrue(type.equals(type));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(type.equals(null));
    }

    @Test
    public void testEqualsUnresolved() {
        ResolvedRecursiveType other = new ResolvedRecursiveType(Object.class, bindings);
        // Both have _referencedType == null
        assertFalse(type.equals(other));
    }

    @Test
    public void testEqualsDifferentClass() {
        ResolvedRecursiveType refType = new ResolvedRecursiveType(String.class, bindings);
        type.setReference(refType);
        
        Object otherObject = new Object();
        assertFalse(type.equals(otherObject));
    }

    @Test
    public void testEqualsResolvedMatchingAndNonMatching() {
        ResolvedRecursiveType refType1 = new ResolvedRecursiveType(String.class, bindings);
        ResolvedRecursiveType refType2 = new ResolvedRecursiveType(String.class, bindings);
        ResolvedRecursiveType refType3 = new ResolvedRecursiveType(Integer.class, bindings);

        ResolvedRecursiveType type1 = new ResolvedRecursiveType(Object.class, bindings);
        ResolvedRecursiveType type2 = new ResolvedRecursiveType(Object.class, bindings);
        ResolvedRecursiveType type3 = new ResolvedRecursiveType(Object.class, bindings);

        type1.setReference(refType1);
        type2.setReference(refType2);
        type3.setReference(refType3);

        // Same referenced type structure/class
        assertTrue(type1.equals(type2));
        
        // Different referenced type
        assertFalse(type1.equals(type3));
    }

    @Test
    public void testDelegatedMethods() {
        // Test methods that return 'this' or dummy values
        assertEquals(type, type.withContentType(null));
        assertEquals(type, type.withTypeHandler(null));
        assertEquals(type, type.withContentTypeHandler(null));
        assertEquals(type, type.withValueHandler(null));
        assertEquals(type, type.withContentValueHandler(null));
        assertEquals(type, type.withStaticTyping());
        assertEquals(type, type._narrow(String.class));
        assertNull(type.refine(null, null, null, null));
        assertFalse(type.isContainerType());
    }
}