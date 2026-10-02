package com.fasterxml.jackson.databind;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit4 tests for abstract class JavaType.
 * ใช้ concrete stub subclass (TType) เพื่อทดสอบ logic ที่ implement จริงใน JavaType.
 */
public class JavaTypeTest {

    /** Test double implementing all abstract methods of JavaType */
    static class TType extends JavaType {
        boolean container = false;
        int containedCount = 0;
        JavaType containedType0;
        Class<?> paramSource = Object.class;
        /** ถ้าถูกกำหนด _narrow จะ return ค่านี้ตรง ๆ (ใช้ควบคุม test scenario) */
        JavaType narrowResult;

        TType(Class<?> raw, int additionalHash, Object vh, Object th, boolean asStatic) {
            super(raw, additionalHash, vh, th, asStatic);
        }

        @Override
        public JavaType withTypeHandler(Object h) {
            TType t = new TType(_class, 0, _valueHandler, h, _asStatic);
            copyFieldsTo(t);
            return t;
        }

        @Override
        public JavaType withContentTypeHandler(Object h) {
            return this; // ไม่ถูกใช้ในเคสทดสอบนี้
        }

        @Override
        public JavaType withValueHandler(Object h) {
            TType t = new TType(_class, 0, h, _typeHandler, _asStatic);
            copyFieldsTo(t);
            return t;
        }

        @Override
        public JavaType withContentValueHandler(Object h) {
            return this;
        }

        @Override
        public JavaType withStaticTyping() {
            TType t = new TType(_class, 0, _valueHandler, _typeHandler, true);
            copyFieldsTo(t);
            return t;
        }

        @Override
        protected JavaType _narrow(Class<?> subclass) {
            if (narrowResult != null) {
                return narrowResult;
            }
            TType t = new TType(subclass, 0, _valueHandler, _typeHandler, _asStatic);
            copyFieldsTo(t);
            return t;
        }

        @Override
        public JavaType narrowContentsBy(Class<?> contentClass) { return this; }

        @Override
        public JavaType widenContentsBy(Class<?> contentClass) { return this; }

        @Override
        public boolean isContainerType() { return container; }

        @Override
        public Class<?> getParameterSource() { return paramSource; }

        @Override
        public int containedTypeCount() { return containedCount; }

        @Override
        public JavaType containedType(int index) { return containedType0; }

        @Override
        public StringBuilder getGenericSignature(StringBuilder sb) {
            sb.append("GENERIC");
            return sb;
        }

        @Override
        public StringBuilder getErasedSignature(StringBuilder sb) {
            sb.append("ERASED");
            return sb;
        }

        @Override
        public String toString() { return "TType:" + _class.getName(); }

        @Override
        public boolean equals(Object o) { return o == this; }

        private void copyFieldsTo(TType other) {
            other.container = this.container;
            other.containedCount = this.containedCount;
            other.containedType0 = this.containedType0;
            other.paramSource = this.paramSource;
            other.narrowResult = this.narrowResult;
        }
    }

    // ---------- Constructor / hashCode ----------

    @Test
    public void testConstructor_HashCode() {
        TType t = new TType(String.class, 5, null, null, false);
        int expected = String.class.getName().hashCode() + 5;
        assertEquals(expected, t.hashCode());
    }

    // ---------- getRawClass / hasRawClass ----------

    @Test
    public void testGetRawClass_And_HasRawClass() {
        TType t = new TType(Integer.class, 0, null, null, false);
        assertEquals(Integer.class, t.getRawClass());
        assertTrue(t.hasRawClass(Integer.class));
        assertFalse(t.hasRawClass(String.class));
    }

    // ---------- isAbstract ----------

    @Test
    public void testIsAbstract_TrueForAbstractClass() {
        TType t = new TType(java.util.AbstractList.class, 0, null, null, false);
        assertTrue(t.isAbstract());
    }

    @Test
    public void testIsAbstract_FalseForConcreteClass() {
        TType t = new TType(String.class, 0, null, null, false);
        assertFalse(t.isAbstract());
    }

    // ---------- isConcrete ----------

    @Test
    public void testIsConcrete_TrueForConcreteClass() {
        TType t = new TType(String.class, 0, null, null, false);
        assertTrue(t.isConcrete());
    }

    @Test
    public void testIsConcrete_FalseForInterface() {
        TType t = new TType(Runnable.class, 0, null, null, false);
        assertFalse(t.isConcrete());
    }

    @Test
    public void testIsConcrete_FalseForAbstractClass() {
        TType t = new TType(java.util.AbstractList.class, 0, null, null, false);
        assertFalse(t.isConcrete());
    }

    @Test
    public void testIsConcrete_TrueForPrimitive() {
        // primitive types have 'abstract' flag set แต่ isConcrete ต้อง return true
        TType t = new TType(int.class, 0, null, null, false);
        assertTrue(t.isConcrete());
    }

    // ---------- isThrowable ----------

    @Test
    public void testIsThrowable_True() {
        TType t = new TType(Exception.class, 0, null, null, false);
        assertTrue(t.isThrowable());
    }

    @Test
    public void testIsThrowable_False() {
        TType t = new TType(String.class, 0, null, null, false);
        assertFalse(t.isThrowable());
    }

    // ---------- isArrayType (default impl) ----------

    @Test
    public void testIsArrayType_DefaultFalse() {
        TType t = new TType(int[].class, 0, null, null, false);
        assertFalse(t.isArrayType());
    }

    // ---------- isEnumType ----------

    @Test
    public void testIsEnumType_True() {
        TType t = new TType(java.util.concurrent.TimeUnit.class, 0, null, null, false);
        assertTrue(t.isEnumType());
    }

    @Test
    public void testIsEnumType_False() {
        TType t = new TType(String.class, 0, null, null, false);
        assertFalse(t.isEnumType());
    }

    // ---------- isInterface ----------

    @Test
    public void testIsInterface_True() {
        TType t = new TType(Runnable.class, 0, null, null, false);
        assertTrue(t.isInterface());
    }

    @Test
    public void testIsInterface_False() {
        TType t = new TType(String.class, 0, null, null, false);
        assertFalse(t.isInterface());
    }

    // ---------- isPrimitive ----------

    @Test
    public void testIsPrimitive_True() {
        TType t = new TType(int.class, 0, null, null, false);
        assertTrue(t.isPrimitive());
    }

    @Test
    public void testIsPrimitive_False() {
        TType t = new TType(String.class, 0, null, null, false);
        assertFalse(t.isPrimitive());
    }

    // ---------- isFinal ----------

    @Test
    public void testIsFinal_True() {
        TType t = new TType(String.class, 0, null, null, false); // String is final
        assertTrue(t.isFinal());
    }

    @Test
    public void testIsFinal_False() {
        TType t = new TType(Object.class, 0, null, null, false);
        assertFalse(t.isFinal());
    }

    // ---------- isCollectionLikeType / isMapLikeType (default) ----------

    @Test
    public void testIsCollectionLikeType_DefaultFalse() {
        TType t = new TType(java.util.List.class, 0, null, null, false);
        assertFalse(t.isCollectionLikeType());
    }

    @Test
    public void testIsMapLikeType_DefaultFalse() {
        TType t = new TType(java.util.Map.class, 0, null, null, false);
        assertFalse(t.isMapLikeType());
    }

    // ---------- useStaticType ----------

    @Test
    public void testUseStaticType_True() {
        TType t = new TType(String.class, 0, null, null, true);
        assertTrue(t.useStaticType());
    }

    @Test
    public void testUseStaticType_False() {
        TType t = new TType(String.class, 0, null, null, false);
        assertFalse(t.useStaticType());
    }

    // ---------- hasGenericTypes ----------

    @Test
    public void testHasGenericTypes_FalseWhenZeroContained() {
        TType t = new TType(String.class, 0, null, null, false);
        t.containedCount = 0;
        assertFalse(t.hasGenericTypes());
    }

    @Test
    public void testHasGenericTypes_TrueWhenNonZeroContained() {
        TType t = new TType(String.class, 0, null, null, false);
        t.containedCount = 2;
        assertTrue(t.hasGenericTypes());
    }

    // ---------- getKeyType / getContentType (default null) ----------

    @Test
    public void testGetKeyType_DefaultNull() {
        TType t = new TType(String.class, 0, null, null, false);
        assertNull(t.getKeyType());
    }

    @Test
    public void testGetContentType_DefaultNull() {
        TType t = new TType(String.class, 0, null, null, false);
        assertNull(t.getContentType());
    }

    // ---------- containedType / containedTypeName ----------

    @Test
    public void testContainedType_DefaultNullWhenNotSet() {
        TType t = new TType(String.class, 0, null, null, false);
        assertNull(t.containedType(0));
    }

    @Test
    public void testContainedTypeName_DefaultNull() {
        TType t = new TType(String.class, 0, null, null, false);
        assertNull(t.containedTypeName(0));
    }

    // ---------- containedTypeOrUnknown ----------

    @Test
    public void testContainedTypeOrUnknown_WhenNull_ReturnsUnknownType() {
        TType t = new TType(String.class, 0, null, null, false);
        t.containedType0 = null;
        JavaType result = t.containedTypeOrUnknown(0);
        assertNotNull(result);
        // ตาม Javadoc: unknown type แปลว่า java.lang.Object
        assertEquals(Object.class, result.getRawClass());
    }

    @Test
    public void testContainedTypeOrUnknown_WhenNotNull_ReturnsSameInstance() {
        TType t = new TType(String.class, 0, null, null, false);
        TType contained = new TType(Integer.class, 0, null, null, false);
        t.containedType0 = contained;
        JavaType result = t.containedTypeOrUnknown(0);
        assertSame(contained, result);
    }

    // ---------- getValueHandler / getTypeHandler ----------

    @Test
    public void testGetValueHandler_And_GetTypeHandler() {
        Object vh = "VALUE_HANDLER";
        Object th = "TYPE_HANDLER";
        TType t = new TType(String.class, 0, vh, th, false);
        assertEquals("VALUE_HANDLER", t.<String>getValueHandler());
        assertEquals("TYPE_HANDLER", t.<String>getTypeHandler());
    }

    @Test
    public void testGetValueHandler_And_GetTypeHandler_Null() {
        TType t = new TType(String.class, 0, null, null, false);
        assertNull(t.getValueHandler());
        assertNull(t.getTypeHandler());
    }

    // ---------- getGenericSignature / getErasedSignature ----------

    @Test
    public void testGetGenericSignature_DelegatesToStringBuilder() {
        TType t = new TType(String.class, 0, null, null, false);
        assertEquals("GENERIC", t.getGenericSignature());
    }

    @Test
    public void testGetErasedSignature_DelegatesToStringBuilder() {
        TType t = new TType(String.class, 0, null, null, false);
        assertEquals("ERASED", t.getErasedSignature());
    }

    // ---------- narrowBy ----------

    @Test
    public void testNarrowBy_SameClass_ReturnsSameInstance() {
        TType t = new TType(String.class, 0, "VH", "TH", false);
        JavaType result = t.narrowBy(String.class);
        assertSame(t, result);
    }

    @Test
    public void testNarrowBy_Assignable_SameHandlers_NoOverrideNeeded() {
        Object vh = "VH";
        Object th = "TH";
        TType t = new TType(Number.class, 0, vh, th, false);
        TType narrowed = new TType(Integer.class, 0, vh, th, false); // handler เดียวกัน (reference)
        t.narrowResult = narrowed;

        JavaType result = t.narrowBy(Integer.class);
        assertSame(narrowed, result); // handler match -> ไม่ถูกเรียก with*
        assertEquals(Integer.class, result.getRawClass());
    }

    @Test
    public void testNarrowBy_Assignable_DifferentHandlers_OverridesWithOriginal() {
        Object originalVH = "ORIGINAL_VH";
        Object originalTH = "ORIGINAL_TH";
        TType t = new TType(Number.class, 0, originalVH, originalTH, false);
        TType narrowed = new TType(Integer.class, 0, "OTHER_VH", "OTHER_TH", false);
        t.narrowResult = narrowed;

        JavaType result = t.narrowBy(Integer.class);
        assertEquals(Integer.class, result.getRawClass());
        assertEquals(originalVH, result.<String>getValueHandler());
        assertEquals(originalTH, result.<String>getTypeHandler());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNarrowBy_NotAssignable_ThrowsIllegalArgumentException() {
        TType t = new TType(Integer.class, 0, null, null, false);
        t.narrowBy(String.class); // String ไม่ assignable ให้ Integer
    }

    @Test(expected = NullPointerException.class)
    public void testNarrowBy_NullSubclass_ThrowsNPE() {
        // Class.isAssignableFrom(null) throws NullPointerException
        TType t = new TType(Integer.class, 0, null, null, false);
        t.narrowBy(null);
    }

    // ---------- forcedNarrowBy ----------

    @Test
    public void testForcedNarrowBy_SameClass_ReturnsSameInstance() {
        TType t = new TType(String.class, 0, "VH", "TH", false);
        JavaType result = t.forcedNarrowBy(String.class);
        assertSame(t, result);
    }

    @Test
    public void testForcedNarrowBy_DifferentHandlers_OverridesWithOriginal() {
        Object originalVH = "ORIGINAL_VH";
        Object originalTH = "ORIGINAL_TH";
        TType t = new TType(Number.class, 0, originalVH, originalTH, false);
        TType narrowed = new TType(Integer.class, 0, "OTHER_VH", "OTHER_TH", false);
        t.narrowResult = narrowed;

        JavaType result = t.forcedNarrowBy(Integer.class);
        assertEquals(Integer.class, result.getRawClass());
        assertEquals(originalVH, result.<String>getValueHandler());
        assertEquals(originalTH, result.<String>getTypeHandler());
    }

    @Test
    public void testForcedNarrowBy_SkipsAssignabilityCheck_NoExceptionForUnrelatedClass() {
        // forcedNarrowBy ไม่เรียก _assertSubclass -> ไม่ throw แม้ class ไม่ compatible
        TType t = new TType(Integer.class, 0, "VH", "TH", false);
        TType narrowed = new TType(String.class, 0, "VH", "TH", false);
        t.narrowResult = narrowed;

        JavaType result = t.forcedNarrowBy(String.class);
        assertSame(narrowed, result);
    }

    // ---------- widenBy ----------

    @Test
    public void testWidenBy_SameClass_ReturnsSameInstance() {
        TType t = new TType(String.class, 0, null, null, false);
        JavaType result = t.widenBy(String.class);
        assertSame(t, result);
    }

    @Test
    public void testWidenBy_DelegatesTo_WidenAndNarrow_ForDifferentClass() {
        // หมายเหตุ: _assertSubclass ที่เรียกจาก widenBy จะเช็ค _class.isAssignableFrom(_class)
        // ซึ่งเป็นจริงเสมอ (ไม่ได้ใช้ superclass param จริง ๆ) - เป็น behavior จาก source ตรง ๆ
        TType t = new TType(Integer.class, 0, "VH", "TH", false);
        JavaType result = t.widenBy(Number.class);
        assertEquals(Number.class, result.getRawClass());
    }

    @Test
    public void testWidenBy_NoExceptionEvenForUnrelatedClass_DueToAssertSubclassImplementation() {
        // แสดง behavior จริงของ source: widenBy ไม่ throw แม้ superclass ไม่ compatible จริง
        TType t = new TType(Integer.class, 0, null, null, false);
        JavaType result = t.widenBy(String.class); // ไม่เกี่ยวข้องกัน แต่ไม่ throw
        assertEquals(String.class, result.getRawClass());
    }

    @Test(expected = NullPointerException.class)
    public void testWidenBy_NullSuperclass_ThrowsNPEFromDownstreamNarrow() {
        // _assertSubclass ไม่ throw (เพราะไม่ใช้ superClass param)
        // แต่ _widen -> _narrow(null) จะพยายามสร้าง TType ด้วย raw=null -> NPE จาก raw.getName()
        TType t = new TType(Integer.class, 0, null, null, false);
        t.widenBy(null);
    }

    // ---------- equals / toString (abstract overrides) ----------

    @Test
    public void testEquals_SameInstanceTrue() {
        TType t = new TType(String.class, 0, null, null, false);
        assertTrue(t.equals(t));
    }

    @Test
    public void testEquals_DifferentInstanceFalse() {
        TType t1 = new TType(String.class, 0, null, null, false);
        TType t2 = new TType(String.class, 0, null, null, false);
        assertFalse(t1.equals(t2));
    }

    @Test
    public void testToString_NotNull() {
        TType t = new TType(String.class, 0, null, null, false);
        assertNotNull(t.toString());
        assertTrue(t.toString().contains("String"));
    }

    // ---------- getParameterSource / isContainerType (pass-through) ----------

    @Test
    public void testGetParameterSource() {
        TType t = new TType(String.class, 0, null, null, false);
        t.paramSource = Number.class;
        assertEquals(Number.class, t.getParameterSource());
    }

    @Test
    public void testIsContainerType_TrueAndFalse() {
        TType t = new TType(String.class, 0, null, null, false);
        t.container = true;
        assertTrue(t.isContainerType());
        t.container = false;
        assertFalse(t.isContainerType());
    }
}
