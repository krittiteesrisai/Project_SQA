package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class JavaTypeTest {

    // Concrete subclass stub สำหรับทดสอบ Abstract methods ของ JavaType
    private static class DummyJavaType extends JavaType {
        private final JavaType contained;

        protected DummyJavaType(Class<?> raw, Object valueHandler, Object typeHandler, JavaType contained) {
            super(raw, 0, valueHandler, typeHandler, false);
            this.contained = contained;
        }

        @Override public JavaType withTypeHandler(Object h) { return new DummyJavaType(_class, _valueHandler, h, contained); }
        @Override public JavaType withContentTypeHandler(Object h) { return this; }
        @Override public JavaType withValueHandler(Object h) { return new DummyJavaType(_class, h, _typeHandler, contained); }
        @Override public JavaType withContentValueHandler(Object h) { return this; }
        @Override public JavaType withContentType(JavaType contentType) { return this; }
        @Override public JavaType withStaticTyping() { return this; }
        @Override public JavaType refine(Class<?> rawType, TypeBindings bindings, JavaType superClass, JavaType[] superInterfaces) { return null; }
        @Override protected JavaType _narrow(Class<?> subclass) { return new DummyJavaType(subclass, _valueHandler, _typeHandler, contained); }
        @Override public boolean isContainerType() { return false; }
        @Override public int containedTypeCount() { return contained == null ? 0 : 1; }
        @Override public JavaType containedType(int index) { return index == 0 ? contained : null; }
        @Override public String containedTypeName(int index) { return null; }
        @Override public TypeBindings getBindings() { return TypeBindings.emptyBindings(); }
        @Override public JavaType findSuperType(Class<?> erasedTarget) { return null; }
        @Override public JavaType getSuperClass() { return null; }
        @Override public List<JavaType> getInterfaces() { return null; }
        @Override public JavaType[] findTypeParameters(Class<?> expType) { return null; }
        @Override public StringBuilder getGenericSignature(StringBuilder sb) { return sb.append("Dummy;"); }
        @Override public StringBuilder getErasedSignature(StringBuilder sb) { return sb.append("Dummy;"); }
        @Override public String toString() { return "DummyType"; }
        @Override public boolean equals(Object o) { return o == this; }
    }

    @Test
    public void testForcedNarrowBySameClass() {
        JavaType type = SimpleType.constructUnsafe(String.class);
        JavaType result = type.forcedNarrowBy(String.class);
        assertSame(type, result);
    }

    @Test
    public void testForcedNarrowBySubclassWithHandlers() {
        Object vHandler = new Object();
        Object tHandler = new Object();
        // สร้าง DummyJavaType ที่ซับclass จาก String เป็น Object (หรือคลาสอื่นเพื่อเทส branching)
        JavaType type = new DummyJavaType(CharSequence.class, vHandler, tHandler, null);
        
        JavaType result = type.forcedNarrowBy(String.class);
        assertNotNull(result);
        assertEquals(String.class, result.getRawClass());
        // ตรวจสอบว่า Handlers ถูกโอนย้าย/กำหนดค่าถูกต้องตามเงื่อนไข branch
        assertNotNull(result.getValueHandler());
        assertNotNull(result.getTypeHandler());
    }

    @Test
    public void testIsTypeOrSubTypeOf() {
        JavaType type = SimpleType.constructUnsafe(String.class);
        assertTrue(type.isTypeOrSubTypeOf(String.class));
        assertTrue(type.isTypeOrSubTypeOf(CharSequence.class));
        assertTrue(type.isTypeOrSubTypeOf(Object.class));
        assertFalse(type.isTypeOrSubTypeOf(Integer.class));
    }

    @Test
    public void testIsConcreteEdgeCases() {
        // Concrete class
        JavaType stringType = SimpleType.constructUnsafe(String.class);
        assertTrue(stringType.isConcrete());

        // Abstract class
        JavaType numberType = SimpleType.constructUnsafe(Number.class);
        assertFalse(numberType.isConcrete());

        // Interface
        JavaType charSeqType = SimpleType.constructUnsafe(CharSequence.class);
        assertFalse(charSeqType.isConcrete());

        // Primitive type (มี abstract flag แต่ต้องคืนค่า true ตามดีไซน์)
        JavaType intPrimitiveType = SimpleType.constructUnsafe(int.class);
        assertTrue(intPrimitiveType.isConcrete());
    }

    @Test
    public void testContainedTypeOrUnknown() {
        JavaType innerType = SimpleType.constructUnsafe(String.class);
        JavaType typeWithContained = new DummyJavaType(List.class, null, null, innerType);
        JavaType typeWithoutContained = new DummyJavaType(List.class, null, null, null);

        // กรณี containedType != null
        assertEquals(innerType, typeWithContained.containedTypeOrUnknown(0));

        // กรณี containedType == null (ต้องคืนค่า unknownType ซึ่งเป็น Object.class)
        JavaType unknown = typeWithoutContained.containedTypeOrUnknown(0);
        assertNotNull(unknown);
        assertEquals(Object.class, unknown.getRawClass());
    }

    @Test
    public void testHasHandlersCombinations() {
        Object vHandler = new Object();
        Object tHandler = new Object();

        JavaType none = new DummyJavaType(String.class, null, null, null);
        assertFalse(none.hasHandlers());
        assertFalse(none.hasValueHandler());

        JavaType onlyValue = new DummyJavaType(String.class, vHandler, null, null);
        assertTrue(onlyValue.hasHandlers());
        assertTrue(onlyValue.hasValueHandler());
        assertNotNull(onlyValue.getValueHandler());

        JavaType onlyType = new DummyJavaType(String.class, null, tHandler, null);
        assertTrue(onlyType.hasHandlers());
        assertNotNull(onlyType.getTypeHandler());

        JavaType both = new DummyJavaType(String.class, vHandler, tHandler, null);
        assertTrue(both.hasHandlers());
    }

    @Test
    public void testSignaturesAndBasicPredicates() {
        JavaType type = SimpleType.constructUnsafe(String.class);
        assertNotNull(type.getGenericSignature());
        assertNotNull(type.getErasedSignature());
        assertTrue(type.isFinal());
        assertFalse(type.isArrayType());
        assertFalse(type.isEnumType());
        assertFalse(type.isInterface());
        assertFalse(type.isPrimitive());
        assertFalse(type.isThrowable());
        assertFalse(type.hasGenericTypes());
        assertNull(type.getKeyType());
        assertNull(type.getContentType());
        assertNull(type.getReferencedType());
        assertNull(type.getParameterSource());
        assertNull(type.getContentValueHandler());
        assertNull(type.getContentTypeHandler());
    }
}