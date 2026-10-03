package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.databind.JavaType;

public class ResolvedRecursiveTypeTest {

    @Test
    public void testSetReferenceAndGetters() {
        TypeBindings bindings = TypeBindings.emptyBindings();
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, bindings);

        // Initially null
        assertNull(type.getSelfReferencedType());

        // Set reference first time (Branch: _referencedType == null)
        ResolvedRecursiveType refType = new ResolvedRecursiveType(Integer.class, bindings);
        type.setReference(refType);
        assertEquals(refType, type.getSelfReferencedType());

        // Set reference second time should throw IllegalStateException (Branch: _referencedType != null)
        try {
            type.setReference(refType);
            fail("Expected IllegalStateException due to re-setting self reference");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("Trying to re-set self reference"));
        }
    }

    @Test
    public void testToString() {
        TypeBindings bindings = TypeBindings.emptyBindings();
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, bindings);

        // Branch: _referencedType == null -> UNRESOLVED
        String strUnresolved = type.toString();
        assertTrue(strUnresolved.contains("UNRESOLVED"));

        // Branch: _referencedType != null -> includes raw class name
        ResolvedRecursiveType refType = new ResolvedRecursiveType(Integer.class, bindings);
        type.setReference(refType);
        String strResolved = type.toString();
        assertTrue(strResolved.contains(Integer.class.getName()));
    }

    @Test
    public void testEqualsEdgeCases() {
        TypeBindings bindings = TypeBindings.emptyBindings();
        ResolvedRecursiveType type1 = new ResolvedRecursiveType(String.class, bindings);
        ResolvedRecursiveType type2 = new ResolvedRecursiveType(String.class, bindings);

        // Branch: o == this
        assertTrue(type1.equals(type1));

        // Branch: o == null
        assertFalse(type1.equals(null));

        // Branch: _referencedType == null (unresolved comparison returns false)
        assertFalse(type1.equals(type2));

        // Set reference for type1 and type2 with same referenced type
        ResolvedRecursiveType ref1 = new ResolvedRecursiveType(Integer.class, bindings);
        ResolvedRecursiveType ref2 = new ResolvedRecursiveType(Integer.class, bindings);
        type1.setReference(ref1);
        type2.setReference(ref2);

        // Branch: Different class comparison
        assertFalse(type1.equals("some string object"));

        // Branch: Equal classes / referenced types
        assertTrue(type1.equals(type2));

        // Branch: Not equal referenced types
        ResolvedRecursiveType ref3 = new ResolvedRecursiveType(Boolean.class, bindings);
        ResolvedRecursiveType type3 = new ResolvedRecursiveType(String.class, bindings);
        type3.setReference(ref3);
        assertFalse(type1.equals(type3));
    }

    @Test
    public void testDelegatingAndModifierMethods() {
        TypeBindings bindings = TypeBindings.emptyBindings();
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, bindings);
        ResolvedRecursiveType refType = new ResolvedRecursiveType(Integer.class, bindings);
        type.setReference(refType);

        StringBuilder sb = new StringBuilder();
        // Since refType doesn't have its reference set, calling getGenericSignature might throw NullPointerException if it delegates to uninitialized ref.
        // Let's fully resolve refType or use a dummy mock-like SimpleType if needed, 
        // Or test delegation properly by setting reference on refType too.
        ResolvedRecursiveType leafType = new ResolvedRecursiveType(Double.class, bindings);
        refType.setReference(leafType);

        assertNotNull(type.getGenericSignature(sb));
        assertNotNull(type.getErasedSignature(new StringBuilder()));

        assertSame(type, type.withContentType(null));
        assertSame(type, type.withTypeHandler(null));
        assertSame(type, type.withContentTypeHandler(null));
        assertSame(type, type.withValueHandler(null));
        assertSame(type, type.withContentValueHandler(null));
        assertSame(type, type.withStaticTyping());
        assertSame(type, type._narrow(Integer.class));

        assertNull(type.refine(null, null, null, null));
        assertFalse(type.isContainerType());
    }
}