package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReferenceTypeTest {

    private TypeFactory typeFactory;
    private JavaType stringType;
    private JavaType intType;
    private ReferenceType refType;

    @Before
    public void setUp() {
        typeFactory = TypeFactory.defaultInstance();
        stringType = typeFactory.constructType(String.class);
        intType = typeFactory.constructType(Integer.class);
        
        // สร้าง ReferenceType พื้นฐานสำหรับการทดสอบ
        refType = ReferenceType.construct(java.util.concurrent.atomic.AtomicReference.class, null, null, null, stringType);
    }

    @Test
    public void testUpgradeFrom_NullRefdType() {
        try {
            ReferenceType.upgradeFrom(stringType, null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Missing referencedType", e.getMessage());
        }
    }

    @Test
    public void testUpgradeFrom_ValidTypeBase() {
        // SimpleType สืบทอดมาจาก TypeBase
        SimpleType base = SimpleType.constructUnsafe(String.class);
        ReferenceType upgraded = ReferenceType.upgradeFrom(base, stringType);
        assertNotNull(upgraded);
        assertEquals(stringType, upgraded.getContentType());
    }

    @Test
    public void testUpgradeFrom_InvalidBaseType() {
        // ใช้ Object.class ซึ่งไม่ใช่ TypeBase เพื่อทดสอบ Exception branch
        JavaType nonTypeBase = typeFactory.constructType(Object.class);
        try {
            ReferenceType.upgradeFrom(nonTypeBase, stringType);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Can not upgrade from an instance of"));
        }
    }

    @Test
    public void testConstructorsAndGetters() {
        ReferenceType constructed = ReferenceType.construct(java.util.concurrent.atomic.AtomicReference.class, null, null, null, stringType);
        assertNotNull(constructed);
        assertTrue(constructed.isReferenceType());
        assertTrue(constructed.hasContentType());
        assertEquals(stringType, constructed.getContentType());
        assertEquals(stringType, constructed.getReferencedType());
        assertEquals(constructed, constructed.getAnchorType());
        assertTrue(constructed.isAnchorType());

        // ทดสอบ deprecated construct(Class, JavaType)
        ReferenceType deprecatedConstruct = ReferenceType.construct(java.util.concurrent.atomic.AtomicReference.class, stringType);
        assertNotNull(deprecatedConstruct);
        assertEquals(stringType, deprecatedConstruct.getContentType());
    }

    @Test
    public void testWithContentType_Same() {
        JavaType sameContent = refType.getContentType();
        JavaType result = refType.withContentType(sameContent);
        assertSame(refType, result);
    }

    @Test
    public void testWithContentType_Different() {
        JavaType newContent = intType;
        JavaType result = refType.withContentType(newContent);
        assertNotSame(refType, result);
        assertEquals(newContent, result.getContentType());
    }

    @Test
    public void testWithTypeHandler_SameAndDifferent() {
        Object handler = "TypeHandler";
        ReferenceType withH = refType.withTypeHandler(handler);
        assertSame(withH, withH.withTypeHandler(handler));

        ReferenceType withDifferentH = refType.withTypeHandler("OtherHandler");
        assertNotSame(refType, withDifferentH);
    }

    @Test
    public void testWithContentTypeHandler_SameAndDifferent() {
        Object handler = "ContentTypeHandler";
        ReferenceType withH = refType.withContentTypeHandler(handler);
        // ทดสอบ Branch เมื่อ Handler เหมือนกัน
        assertSame(withH, withH.withContentTypeHandler(handler));

        ReferenceType withDifferentH = refType.withContentTypeHandler("NewContentTypeHandler");
        assertNotSame(refType, withDifferentH);
    }

    @Test
    public void testWithValueHandler_SameAndDifferent() {
        Object handler = "ValueHandler";
        ReferenceType withH = refType.withValueHandler(handler);
        assertSame(withH, withH.withValueHandler(handler));

        ReferenceType withDifferentH = refType.withValueHandler("OtherValueHandler");
        assertNotSame(refType, withDifferentH);
    }

    @Test
    public void testWithContentValueHandler_SameAndDifferent() {
        Object handler = "ContentValueHandler";
        ReferenceType withH = refType.withContentValueHandler(handler);
        assertSame(withH, withH.withContentValueHandler(handler));

        ReferenceType withDifferentH = refType.withContentValueHandler("NewContentValueHandler");
        assertNotSame(refType, withDifferentH);
    }

    @Test
    public void testWithStaticTyping() {
        ReferenceType staticType = refType.withStaticTyping();
        assertNotNull(staticType);
        // ทดสอบ Branch เมื่อเรียกซ้ำแล้วได้ instance เดิม
        assertSame(staticType, staticType.withStaticTyping());
    }

    @Test
    public void testRefine() {
        JavaType refined = refType.refine(java.util.concurrent.atomic.AtomicReference.class, refType.Bindings(), null, null);
        assertNotNull(refined);
        assertTrue(refined instanceof ReferenceType);
    }

    @Test
    public void testSignaturesAndToString() {
        StringBuilder sb = new StringBuilder();
        assertNotNull(refType.getErasedSignature(sb));
        
        StringBuilder sbGen = new StringBuilder();
        assertNotNull(refType.getGenericSignature(sbGen));

        String toStringVal = refType.toString();
        assertTrue(toStringVal.contains("reference type"));
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testNarrow() {
        JavaType narrowed = refType._narrow(java.util.concurrent.atomic.AtomicReference.class);
        assertNotNull(narrowed);
        assertTrue(narrowed instanceof ReferenceType);
    }

    @Test
    public void testEqualsEdgeCases() {
        ReferenceType ref1 = ReferenceType.construct(java.util.concurrent.atomic.AtomicReference.class, null, null, null, stringType);
        ReferenceType ref2 = ReferenceType.construct(java.util.concurrent.atomic.AtomicReference.class, null, null, null, stringType);
        ReferenceType ref3 = ReferenceType.construct(java.util.concurrent.atomic.AtomicReference.class, null, null, null, intType);
        SimpleType simple = SimpleType.constructUnsafe(String.class);

        // o == this
        assertTrue(ref1.equals(ref1));
        // o == null
        assertFalse(ref1.equals(null));
        // o.getClass() != getClass()
        assertFalse(ref1.equals(simple));
        // other._class != _class
        ReferenceType refDifferentClass = ReferenceType.construct(String.class, null, null, null, stringType);
        assertFalse(ref1.equals(refDifferentClass));
        // Normal equality & inequality based on referenced type
        assertTrue(ref1.equals(ref2));
        assertFalse(ref1.equals(ref3));
    }
}