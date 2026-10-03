package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReferenceTypeTest {

    private TypeFactory typeFactory;
    private JavaType refType;
    private ReferenceType referenceType;

    @Before
    public void setUp() {
        typeFactory = TypeFactory.defaultInstance();
        refType = typeFactory.constructType(String.class);
        referenceType = ReferenceType.construct(java.util.concurrent.atomic.AtomicReference.class, refType, null, null);
    }

    @Test
    public void testConstruct() {
        assertNotNull(referenceType);
        assertEquals(1, referenceType.containedTypeCount());
        assertTrue(referenceType.isReferenceType());
        assertEquals(java.util.concurrent.atomic.AtomicReference.class, referenceType.getParameterSource());
    }

    @Test
    public void testWithTypeNameAndHandlers() {
        // test withTypeHandler - Branch: h == _typeHandler
        Object typeHandler = new Object();
        ReferenceType rt1 = referenceType.withTypeHandler(null);
        assertSame(referenceType, rt1);

        // test withTypeHandler - Branch: h != _typeHandler
        ReferenceType rt2 = referenceType.withTypeHandler(typeHandler);
        assertNotSame(referenceType, rt2);
        assertEquals(typeHandler, rt2.getTypeHandler());

        // test withContentTypeHandler - Branch: h == referencedType.getTypeHandler() (null)
        ReferenceType rt3 = referenceType.withContentTypeHandler(null);
        assertSame(referenceType, rt3);

        // test withContentTypeHandler - Branch: h != referencedType.getTypeHandler()
        ReferenceType rt4 = referenceType.withContentTypeHandler(typeHandler);
        assertNotSame(referenceType, rt4);

        // test withValueHandler - Branch: h == _valueHandler
        ReferenceType rt5 = referenceType.withValueHandler(null);
        assertSame(referenceType, rt5);

        // test withValueHandler - Branch: h != _valueHandler
        Object valueHandler = new Object();
        ReferenceType rt6 = referenceType.withValueHandler(valueHandler);
        assertNotSame(referenceType, rt6);
        assertEquals(valueHandler, rt6.getValueHandler());

        // test withContentValueHandler - Branch: h == _referencedType.getValueHandler()
        ReferenceType rt7 = referenceType.withContentValueHandler(null);
        assertSame(referenceType, rt7);

        // test withContentValueHandler - Branch: h != _referencedType.getValueHandler()
        ReferenceType rt8 = referenceType.withContentValueHandler(valueHandler);
        assertNotSame(referenceType, rt8);
    }

    @Test
    public void testWithStaticTyping() {
        // _asStatic is false initially
        ReferenceType rtStatic = referenceType.withStaticTyping();
        assertNotSame(referenceType, rtStatic);
        assertTrue(rtStatic.isStaticTyping());

        // Calling again should return the same instance (Branch: _asStatic == true)
        ReferenceType rtStaticAgain = rtStatic.withStaticTyping();
        assertSame(rtStatic, rtStaticAgain);
    }

    @Test
    public void testContainedTypeMethods() {
        // Index == 0
        assertEquals(refType, referenceType.containedType(0));
        assertEquals("T", referenceType.containedTypeName(0));

        // Index != 0 (Edge cases: negative and out of bounds)
        assertNull(referenceType.containedType(-1));
        assertNull(referenceType.containedType(1));
        assertNull(referenceType.containedTypeName(-1));
        assertNull(referenceType.containedTypeName(1));
    }

    @Test
    public void testNarrow() {
        JavaType narrowed = referenceType._narrow(java.util.concurrent.atomic.AtomicReference.class);
        assertNotNull(narrowed);
        assertTrue(narrowed instanceof ReferenceType);
        assertEquals(java.util.concurrent.atomic.AtomicReference.class, narrowed.getRawClass());
    }

    @Test
    public void testSignaturesAndCanonicalName() {
        StringBuilder sbCanonical = new StringBuilder();
        // buildCanonicalName is package-private/protected via toString()
        String toStringResult = referenceType.toString();
        assertTrue(toStringResult.contains("java.util.concurrent.atomic.AtomicReference"));

        StringBuilder sbErased = new StringBuilder();
        assertNotNull(referenceType.getErasedSignature(sbErased));

        StringBuilder sbGeneric = new StringBuilder();
        assertNotNull(referenceType.getGenericSignature(sbGeneric));
    }

    @Test
    public void testEqualsAndEdgeCases() {
        // o == this
        assertTrue(referenceType.equals(referenceType));

        // o == null
        assertFalse(referenceType.equals(null));

        // o.getClass() != getClass()
        assertFalse(referenceType.equals("NotA1ReferenceType"));

        // other._class != _class
        ReferenceType differentClass = ReferenceType.construct(Object.class, refType, null, null);
        assertFalse(referenceType.equals(differentClass));

        // Same class and referenced type -> equals true
        ReferenceType sameType = ReferenceType.construct(java.util.concurrent.atomic.AtomicReference.class, refType, null, null);
        assertTrue(referenceType.equals(sameType));

        // Same class, different referenced type -> equals false
        JavaType diffRefType = typeFactory.constructType(Integer.class);
        ReferenceType diffRefTypeObj = ReferenceType.construct(java.util.concurrent.atomic.AtomicReference.class, diffRefType, null, null);
        assertFalse(referenceType.equals(diffRefTypeObj));
    }
}