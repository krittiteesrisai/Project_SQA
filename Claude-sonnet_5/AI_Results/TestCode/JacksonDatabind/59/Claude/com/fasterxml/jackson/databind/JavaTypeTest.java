package com.fasterxml.jackson.databind;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;

/**
 * Unit tests for abstract class {@link JavaType}.
 * ทดสอบผ่าน stub subclass ที่ควบคุม behavior ของ abstract method ได้
 */
public class JavaTypeTest {

    /** Minimal abstract class ใช้สำหรับทดสอบ isAbstract()/isConcrete()/isFinal() */
    abstract static class AbstractDummy { }

    // ------------------------------------------------------------------
    // Stub concrete implementation of JavaType สำหรับทดสอบ
    // ------------------------------------------------------------------
    static class ConcreteType extends JavaType {
        private int containedCount = 0;
        private boolean containerType = false;
        private JavaType narrowResult;
        private JavaType containedTypeResult;

        ConcreteType(Class<?> raw, int additionalHash, Object valueHandler,
                Object typeHandler, boolean asStatic) {
            super(raw, additionalHash, valueHandler, typeHandler, asStatic);
        }

        void setContainedCount(int c) { this.containedCount = c; }
        void setNarrowResult(JavaType t) { this.narrowResult = t; }
        void setContainedTypeResult(JavaType t) { this.containedTypeResult = t; }

        @Override public JavaType withTypeHandler(Object h) {
            return new ConcreteType(_class, 0, _valueHandler, h, _asStatic);
        }
        @Override public JavaType withContentTypeHandler(Object h) { return this; }
        @Override public JavaType withValueHandler(Object h) {
            return new ConcreteType(_class, 0, h, _typeHandler, _asStatic);
        }
        @Override public JavaType withContentValueHandler(Object h) { return this; }
        @Override public JavaType withContentType(JavaType contentType) { return this; }
        @Override public JavaType withStaticTyping() { return this; }
        @Override public JavaType refine(Class<?> rawType, TypeBindings bindings,
                JavaType superClass, JavaType[] superInterfaces) { return null; }
        @Override protected JavaType _narrow(Class<?> subclass) { return narrowResult; }

        @Override public boolean isContainerType() { return containerType; }
        @Override public int containedTypeCount() { return containedCount; }
        @Override public JavaType containedType(int index) { return containedTypeResult; }
        @Override public String containedTypeName(int index) { return null; }
        @Override public TypeBindings getBindings() { return null; }
        @Override public JavaType findSuperType(Class<?> erasedTarget) { return null; }
        @Override public JavaType getSuperClass() { return null; }
        @Override public List<JavaType> getInterfaces() { return Collections.emptyList(); }
        @Override public JavaType[] findTypeParameters(Class<?> expType) { return new JavaType[0]; }
        @Override public StringBuilder getGenericSignature(StringBuilder sb) { return sb.append("GENERIC"); }
        @Override public StringBuilder getErasedSignature(StringBuilder sb) { return sb.append("ERASED"); }
        @Override public String toString() { return "ConcreteType:" + _class.getName(); }
        @Override public boolean equals(Object o) { return o == this; }
    }

    /** subclass สำหรับทดสอบ copy-constructor JavaType(JavaType base) */
    static class CopyConcreteType extends JavaType {
        CopyConcreteType(JavaType base) { super(base); }
        @Override public JavaType withTypeHandler(Object h) { return this; }
        @Override public JavaType withContentTypeHandler(Object h) { return this; }
        @Override public JavaType withValueHandler(Object h) { return this; }
        @Override public JavaType withContentValueHandler(Object h) { return this; }
        @Override public JavaType withContentType(JavaType contentType) { return this; }
        @Override public JavaType withStaticTyping() { return this; }
        @Override public JavaType refine(Class<?> rawType, TypeBindings bindings,
                JavaType superClass, JavaType[] superInterfaces) { return null; }
        @Override protected JavaType _narrow(Class<?> subclass) { return this; }
        @Override public boolean isContainerType() { return false; }
        @Override public int containedTypeCount() { return 0; }
        @Override public JavaType containedType(int index) { return null; }
        @Override public String containedTypeName(int index) { return null; }
        @Override public TypeBindings getBindings() { return null; }
        @Override public JavaType findSuperType(Class<?> erasedTarget) { return null; }
        @Override public JavaType getSuperClass() { return null; }
        @Override public List<JavaType> getInterfaces() { return Collections.emptyList(); }
        @Override public JavaType[] findTypeParameters(Class<?> expType) { return new JavaType[0]; }
        @Override public StringBuilder getGenericSignature(StringBuilder sb) { return sb; }
        @Override public StringBuilder getErasedSignature(StringBuilder sb) { return sb; }
        @Override public String toString() { return "Copy"; }
        @Override public boolean equals(Object o) { return o == this; }
    }

    // ------------------------------------------------------------------
    // Helper factory
    // ------------------------------------------------------------------
    private ConcreteType type(Class<?> raw) {
        return new ConcreteType(raw, 0, null, null, false);
    }

    private ConcreteType type(Class<?> raw, Object valueHandler, Object typeHandler, boolean asStatic) {
        return new ConcreteType(raw, 0, valueHandler, typeHandler, asStatic);
    }

    // ------------------------------------------------------------------
    // getRawClass / hasRawClass
    // ------------------------------------------------------------------
    @Test
    public void testGetRawClass() {
        ConcreteType t = type(String.class);
        assertSame(String.class, t.getRawClass());
    }

    @Test
    public void testHasRawClass_true() {
        ConcreteType t = type(String.class);
        assertTrue(t.hasRawClass(String.class));
    }

    @Test
    public void testHasRawClass_false() {
        ConcreteType t = type(String.class);
        assertFalse(t.hasRawClass(Integer.class));
    }

    // ------------------------------------------------------------------
    // hasContentType - default true (no branch, fixed)
    // ------------------------------------------------------------------
    @Test
    public void testHasContentType_default() {
        assertTrue(type(String.class).hasContentType());
    }

    // ------------------------------------------------------------------
    // isTypeOrSubTypeOf
    // ------------------------------------------------------------------
    @Test
    public void testIsTypeOrSubTypeOf_sameClass() {
        ConcreteType t = type(String.class);
        assertTrue(t.isTypeOrSubTypeOf(String.class));
    }

    @Test
    public void testIsTypeOrSubTypeOf_assignableFrom() {
        ConcreteType t = type(java.util.ArrayList.class);
        assertTrue(t.isTypeOrSubTypeOf(List.class));
    }

    @Test
    public void testIsTypeOrSubTypeOf_notAssignable() {
        ConcreteType t = type(String.class);
        assertFalse(t.isTypeOrSubTypeOf(List.class));
    }

    // ------------------------------------------------------------------
    // isAbstract
    // ------------------------------------------------------------------
    @Test
    public void testIsAbstract_false() {
        assertFalse(type(String.class).isAbstract());
    }

    @Test
    public void testIsAbstract_true() {
        assertTrue(type(AbstractDummy.class).isAbstract());
    }

    // ------------------------------------------------------------------
    // isConcrete (มี 2 return point + primitive special-case)
    // ------------------------------------------------------------------
    @Test
    public void testIsConcrete_plainClass_true() {
        assertTrue(type(String.class).isConcrete());
    }

    @Test
    public void testIsConcrete_abstractClass_false() {
        assertFalse(type(AbstractDummy.class).isConcrete());
    }

    @Test
    public void testIsConcrete_interface_false() {
        assertFalse(type(Runnable.class).isConcrete());
    }

    @Test
    public void testIsConcrete_primitive_true() {
        // primitive type ตาม comment ใน source: 'abstract' flag ถูกตั้งไว้ใน JDK
        // แต่ isPrimitive() ทำให้ return true (สาขาที่สอง)
        assertTrue(type(int.class).isConcrete());
    }

    // ------------------------------------------------------------------
    // isThrowable
    // ------------------------------------------------------------------
    @Test
    public void testIsThrowable_true() {
        assertTrue(type(Exception.class).isThrowable());
    }

    @Test
    public void testIsThrowable_false() {
        assertFalse(type(String.class).isThrowable());
    }

    // ------------------------------------------------------------------
    // isArrayType - default always false ใน base class
    // ------------------------------------------------------------------
    @Test
    public void testIsArrayType_defaultFalse() {
        assertFalse(type(int[].class).isArrayType());
    }

    // ------------------------------------------------------------------
    // isEnumType
    // ------------------------------------------------------------------
    @Test
    public void testIsEnumType_true() {
        assertTrue(type(TimeUnit.class).isEnumType());
    }

    @Test
    public void testIsEnumType_false() {
        assertFalse(type(String.class).isEnumType());
    }

    // ------------------------------------------------------------------
    // isInterface
    // ------------------------------------------------------------------
    @Test
    public void testIsInterface_true() {
        assertTrue(type(Runnable.class).isInterface());
    }

    @Test
    public void testIsInterface_false() {
        assertFalse(type(String.class).isInterface());
    }

    // ------------------------------------------------------------------
    // isPrimitive
    // ------------------------------------------------------------------
    @Test
    public void testIsPrimitive_true() {
        assertTrue(type(int.class).isPrimitive());
    }

    @Test
    public void testIsPrimitive_false() {
        assertFalse(type(String.class).isPrimitive());
    }

    // ------------------------------------------------------------------
    // isFinal
    // ------------------------------------------------------------------
    @Test
    public void testIsFinal_true() {
        assertTrue(type(String.class).isFinal()); // String is final
    }

    @Test
    public void testIsFinal_false() {
        assertFalse(type(AbstractDummy.class).isFinal());
    }

    // ------------------------------------------------------------------
    // isCollectionLikeType / isMapLikeType - default false
    // ------------------------------------------------------------------
    @Test
    public void testIsCollectionLikeType_default() {
        assertFalse(type(String.class).isCollectionLikeType());
    }

    @Test
    public void testIsMapLikeType_default() {
        assertFalse(type(String.class).isMapLikeType());
    }

    // ------------------------------------------------------------------
    // isJavaLangObject
    // ------------------------------------------------------------------
    @Test
    public void testIsJavaLangObject_true() {
        assertTrue(type(Object.class).isJavaLangObject());
    }

    @Test
    public void testIsJavaLangObject_false() {
        assertFalse(type(String.class).isJavaLangObject());
    }

    // ------------------------------------------------------------------
    // useStaticType
    // ------------------------------------------------------------------
    @Test
    public void testUseStaticType_true() {
        assertTrue(type(String.class, null, null, true).useStaticType());
    }

    @Test
    public void testUseStaticType_false() {
        assertFalse(type(String.class, null, null, false).useStaticType());
    }

    // ------------------------------------------------------------------
    // hasGenericTypes (ขึ้นกับ containedTypeCount())
    // ------------------------------------------------------------------
    @Test
    public void testHasGenericTypes_zero() {
        ConcreteType t = type(String.class);
        t.setContainedCount(0);
        assertFalse(t.hasGenericTypes());
    }

    @Test
    public void testHasGenericTypes_positive() {
        ConcreteType t = type(String.class);
        t.setContainedCount(2);
        assertTrue(t.hasGenericTypes());
    }

    // ------------------------------------------------------------------
    // getKeyType / getContentType / getReferencedType - default null
    // ------------------------------------------------------------------
    @Test
    public void testDefaultNullAccessors() {
        ConcreteType t = type(String.class);
        assertNull(t.getKeyType());
        assertNull(t.getContentType());
        assertNull(t.getReferencedType());
    }

    // ------------------------------------------------------------------
    // containedTypeOrUnknown
    // ------------------------------------------------------------------
    @Test
    public void testContainedTypeOrUnknown_null_returnsUnknown() {
        ConcreteType t = type(String.class);
        t.setContainedTypeResult(null);
        JavaType result = t.containedTypeOrUnknown(0);
        assertNotNull(result);
        assertEquals(TypeFactory.unknownType().getRawClass(), result.getRawClass());
    }

    @Test
    public void testContainedTypeOrUnknown_nonNull_returnsSame() {
        ConcreteType t = type(String.class);
        ConcreteType content = type(Integer.class);
        t.setContainedTypeResult(content);
        JavaType result = t.containedTypeOrUnknown(0);
        assertSame(content, result);
    }

    // ------------------------------------------------------------------
    // getValueHandler / getTypeHandler
    // ------------------------------------------------------------------
    @Test
    public void testGetValueHandler_and_getTypeHandler() {
        Object vh = "valueHandler";
        Object th = "typeHandler";
        ConcreteType t = type(String.class, vh, th, false);
        assertEquals(vh, t.<Object>getValueHandler());
        assertEquals(th, t.<Object>getTypeHandler());
    }

    @Test
    public void testGetValueHandler_null() {
        ConcreteType t = type(String.class);
        assertNull(t.<Object>getValueHandler());
        assertNull(t.<Object>getTypeHandler());
    }

    // ------------------------------------------------------------------
    // getContentValueHandler / getContentTypeHandler - default null
    // ------------------------------------------------------------------
    @Test
    public void testContentHandlers_defaultNull() {
        ConcreteType t = type(String.class);
        assertNull(t.getContentValueHandler());
        assertNull(t.getContentTypeHandler());
    }

    // ------------------------------------------------------------------
    // hasValueHandler
    // ------------------------------------------------------------------
    @Test
    public void testHasValueHandler_true() {
        ConcreteType t = type(String.class, "vh", null, false);
        assertTrue(t.hasValueHandler());
    }

    @Test
    public void testHasValueHandler_false() {
        ConcreteType t = type(String.class);
        assertFalse(t.hasValueHandler());
    }

    // ------------------------------------------------------------------
    // hasHandlers (OR ของ typeHandler / valueHandler)
    // ------------------------------------------------------------------
    @Test
    public void testHasHandlers_bothNull() {
        ConcreteType t = type(String.class);
        assertFalse(t.hasHandlers());
    }

    @Test
    public void testHasHandlers_onlyTypeHandler() {
        ConcreteType t = type(String.class, null, "th", false);
        assertTrue(t.hasHandlers());
    }

    @Test
    public void testHasHandlers_onlyValueHandler() {
        ConcreteType t = type(String.class, "vh", null, false);
        assertTrue(t.hasHandlers());
    }

    @Test
    public void testHasHandlers_both() {
        ConcreteType t = type(String.class, "vh", "th", false);
        assertTrue(t.hasHandlers());
    }

    // ------------------------------------------------------------------
    // getGenericSignature / getErasedSignature (wrapper methods)
    // ------------------------------------------------------------------
    @Test
    public void testGetGenericSignature() {
        ConcreteType t = type(String.class);
        assertEquals("GENERIC", t.getGenericSignature());
    }

    @Test
    public void testGetErasedSignature() {
        ConcreteType t = type(String.class);
        assertEquals("ERASED", t.getErasedSignature());
    }

    // ------------------------------------------------------------------
    // hashCode
    // ------------------------------------------------------------------
    @Test
    public void testHashCode() {
        ConcreteType t = new ConcreteType(String.class, 5, null, null, false);
        int expected = String.class.getName().hashCode() + 5;
        assertEquals(expected, t.hashCode());
    }

    // ------------------------------------------------------------------
    // forcedNarrowBy
    // ------------------------------------------------------------------
    @Test
    public void testForcedNarrowBy_sameClass_returnsThis() {
        ConcreteType t = type(String.class);
        JavaType result = t.forcedNarrowBy(String.class);
        assertSame(t, result);
    }

    @Test
    public void testForcedNarrowBy_differentClass_handlersIdentical_noCopy() {
        Object vh = "vh";
        Object th = "th";
        ConcreteType original = type(String.class, vh, th, false);
        // narrowResult มี handler เดียวกันกับ original -> ไม่ต้อง copy (ทั้งสอง if false)
        ConcreteType narrowResult = type(Integer.class, vh, th, false);
        original.setNarrowResult(narrowResult);

        JavaType result = original.forcedNarrowBy(Integer.class);
        assertSame(narrowResult, result); // ไม่มีการเรียก with* เลย
    }

    @Test
    public void testForcedNarrowBy_differentClass_valueHandlerDiffers_only() {
        Object vh = "vh";
        Object th = "th";
        ConcreteType original = type(String.class, vh, th, false);
        // narrowResult valueHandler ต่างจาก original -> if แรก true, if สอง false
        ConcreteType narrowResult = type(Integer.class, "otherVh", th, false);
        original.setNarrowResult(narrowResult);

        JavaType result = original.forcedNarrowBy(Integer.class);
        assertNotSame(narrowResult, result); // ถูก copy ด้วย withValueHandler
        assertEquals(vh, result.<Object>getValueHandler());
        assertEquals(th, result.<Object>getTypeHandler());
    }

    @Test
    public void testForcedNarrowBy_differentClass_typeHandlerDiffers_only() {
        Object vh = "vh";
        Object th = "th";
        ConcreteType original = type(String.class, vh, th, false);
        // narrowResult typeHandler ต่างจาก original -> if แรก false, if สอง true
        ConcreteType narrowResult = type(Integer.class, vh, "otherTh", false);
        original.setNarrowResult(narrowResult);

        JavaType result = original.forcedNarrowBy(Integer.class);
        assertNotSame(narrowResult, result);
        assertEquals(vh, result.<Object>getValueHandler());
        assertEquals(th, result.<Object>getTypeHandler());
    }

    @Test
    public void testForcedNarrowBy_differentClass_bothHandlersDiffer() {
        Object vh = "vh";
        Object th = "th";
        ConcreteType original = type(String.class, vh, th, false);
        ConcreteType narrowResult = type(Integer.class, "otherVh", "otherTh", false);
        original.setNarrowResult(narrowResult);

        JavaType result = original.forcedNarrowBy(Integer.class);
        assertNotSame(narrowResult, result);
        assertEquals(vh, result.<Object>getValueHandler());
        assertEquals(th, result.<Object>getTypeHandler());
    }

    // ------------------------------------------------------------------
    // Copy constructor JavaType(JavaType base)
    // ------------------------------------------------------------------
    @Test
    public void testCopyConstructor_copiesAllFields() {
        Object vh = "vh";
        Object th = "th";
        ConcreteType base = type(String.class, vh, th, true);
        CopyConcreteType copy = new CopyConcreteType(base);

        assertSame(base.getRawClass(), copy.getRawClass());
        assertEquals(base.hashCode(), copy.hashCode());
        assertEquals(vh, copy.<Object>getValueHandler());
        assertEquals(th, copy.<Object>getTypeHandler());
        assertEquals(base.useStaticType(), copy.useStaticType());
    }

    // ------------------------------------------------------------------
    // null-input edge cases
    // ------------------------------------------------------------------
    @Test
    public void testHasRawClass_withNullArgument() {
        ConcreteType t = type(String.class);
        assertFalse(t.hasRawClass(null));
    }

    @Test
    public void testIsTypeOrSubTypeOf_withNullArgument_throwsNPE() {
        // clz.isAssignableFrom(_class) เมื่อ clz เป็น null จะ throw NPE
        // (ไม่ได้มี null-check ใน source นี้ จึงคาดหวัง exception)
        ConcreteType t = type(String.class);
        try {
            t.isTypeOrSubTypeOf(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException expected) {
            // คาดหวังตาม behavior จริงของ source (ไม่มี null check)
        }
    }
}
