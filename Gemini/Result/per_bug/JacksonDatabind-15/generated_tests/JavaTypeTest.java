package com.fasterxml.jackson.databind;

import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.type.SimpleType;

public class JavaTypeTest {

    // Helper Concrete Subclass สำหรับทดสอบ JavaType ที่เป็น Abstract
    private static class TestJavaType extends SimpleType {
        private static final long serialVersionUID = 1L;

        public TestJavaType(Class<?> cls) {
            super(cls);
        }

        public TestJavaType(Class<?> cls, Object valueHandler, Object typeHandler, boolean asStatic) {
            super(cls, null, null, valueHandler, typeHandler, asStatic);
        }

        @Override
        protected JavaType _narrow(Class<?> subclass) {
            return new TestJavaType(subclass, _valueHandler, _typeHandler, _asStatic);
        }

        @Override
        public JavaType withTypeHandler(Object h) {
            return new TestJavaType(_class, _valueHandler, h, _asStatic);
        }

        @Override
        public JavaType withContentTypeHandler(Object h) {
            return this;
        }

        @Override
        public JavaType withValueHandler(Object h) {
            return new TestJavaType(_class, h, _typeHandler, _asStatic);
        }

        @Override
        public JavaType withContentValueHandler(Object h) {
            return this;
        }

        @Override
        public JavaType withStaticTyping() {
            return new TestJavaType(_class, _valueHandler, _typeHandler, true);
        }
    }

    @Test
    public void testNarrowBySameClass() {
        JavaType type = new TestJavaType(String.class);
        JavaType result = type.narrowBy(String.class);
        assertSame(type, result);
    }

    @Test
    public void testNarrowByValidSubclass() {
        JavaType type = new TestJavaType(Number.class);
        JavaType result = type.narrowBy(Integer.class);
        assertEquals(Integer.class, result.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNarrowByInvalidSubclass() {
        JavaType type = new TestJavaType(Integer.class);
        type.narrowBy(String.class);
    }

    @Test
    public void testNarrowByWithHandlers() {
        Object vHandler = new Object();
        Object tHandler = new Object();
        // สร้าง TestJavaType โดยที่ _narrow จะไม่ใส่ Handler มาให้ เพื่อบังคับให้เข้าเงื่อนไขอัปเดต Handler ใน narrowBy
        JavaType type = new TestJavaType(Number.class, vHandler, tHandler, false) {
            @Override
            protected JavaType _narrow(Class<?> subclass) {
                return new TestJavaType(subclass, null, null, false);
            }
        };
        JavaType result = type.narrowBy(Integer.class);
        assertEquals(vHandler, result.getValueHandler());
        assertEquals(tHandler, result.getTypeHandler());
    }

    @Test
    public void testForcedNarrowBySameClass() {
        JavaType type = new TestJavaType(String.class);
        JavaType result = type.forcedNarrowBy(String.class);
        assertSame(type, result);
    }

    @Test
    public void testForcedNarrowBySubclassWithHandlers() {
        Object vHandler = new Object();
        Object tHandler = new Object();
        JavaType type = new TestJavaType(Number.class, vHandler, tHandler, false) {
            @Override
            protected JavaType _narrow(Class<?> subclass) {
                return new TestJavaType(subclass, null, null, false);
            }
        };
        JavaType result = type.forcedNarrowBy(Integer.class);
        assertEquals(vHandler, result.getValueHandler());
        assertEquals(tHandler, result.getTypeHandler());
    }

    @Test
    public void testWidenBySameClass() {
        JavaType type = new TestJavaType(Integer.class);
        JavaType result = type.widenBy(Integer.class);
        assertSame(type, result);
    }

    @Test
    public void testWidenBySuperclass() {
        JavaType type = new TestJavaType(Integer.class);
        JavaType result = type.widenBy(Number.class);
        assertEquals(Number.class, result.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWidenByInvalidSuperclass() {
        JavaType type = new TestJavaType(String.class);
        type.widenBy(Integer.class);
    }

    @Test
    public void testIsConcreteBranches() {
        JavaType concreteType = new TestJavaType(String.class);
        assertTrue(concreteType.isConcrete());

        JavaType abstractType = new TestJavaType(Number.class);
        assertFalse(abstractType.isConcrete());

        JavaType primitiveType = new TestJavaType(int.class);
        assertTrue(primitiveType.isConcrete());
    }

    @Test
    public void testContainedTypeOrUnknown() {
        JavaType type = new TestJavaType(Object.class);
        // containedType(0) returns null by default in JavaType base implementation
        JavaType unknown = type.containedTypeOrUnknown(0);
        assertNotNull(unknown);
        assertEquals(Object.class, unknown.getRawClass());
    }

    @Test
    public void testSignaturesAndBasicGetters() {
        JavaType type = new TestJavaType(String.class, "valH", "typeH", true);
        assertEquals("valH", type.getValueHandler());
        assertEquals("typeH", type.getTypeHandler());
        assertTrue(type.useStaticType());
        assertFalse(type.hasGenericTypes());
        assertNull(type.getKeyType());
        assertNull(type.getContentType());
        assertEquals(0, type.containedTypeCount());
        assertNull(type.containedType(0));
        assertNull(type.containedTypeName(0));
        assertFalse(type.isCollectionLikeType());
        assertFalse(type.isMapLikeType());
        assertFalse(type.isArrayType());
        assertTrue(type.hasRawClass(String.class));
        assertFalse(type.isThrowable());
        assertFalse(type.isEnumType());
        assertFalse(type.isInterface());
        assertFalse(type.isPrimitive());
        assertTrue(type.isFinal());
        assertNotNull(type.getGenericSignature());
        assertNotNull(type.getErasedSignature());
        assertEquals(type.hashCode(), type.hashCode());
    }
}