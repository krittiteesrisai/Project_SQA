package com.fasterxml.jackson.databind.type;

import static org.junit.Assert.*;

import java.util.concurrent.atomic.AtomicReference;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.fasterxml.jackson.databind.JavaType;
// import ของคลาสเป้าหมาย (อยู่ใน package เดียวกันแล้ว แต่ระบุไว้ตามข้อกำหนด)
import com.fasterxml.jackson.databind.type.ReferenceType;

/**
 * Unit tests สำหรับ {@link ReferenceType} (Defects4J: JacksonDatabind-99b)
 *
 * หมายเหตุ: เนื่องจากบางเมธอด/ฟิลด์ของ superclass (TypeBase/JavaType) ไม่ได้อยู่ใน
 * ซอร์สที่ให้มา จึงหลีกเลี่ยงการเดา format ที่แน่นอนของ _classSignature(...)
 * โดยตรวจสอบเฉพาะสิ่งที่ยืนยันได้จากซอร์สของ ReferenceType เท่านั้น
 */
public class ReferenceTypeTest {

    private JavaType stringType;
    private JavaType intType;

    // subclass เล็ก ๆ สำหรับทดสอบ _narrow()
    static class MyAtomicRef extends AtomicReference<Object> {
        private static final long serialVersionUID = 1L;
    }

    @Before
    public void setUp() {
        stringType = TypeFactory.defaultInstance().constructType(String.class);
        intType    = TypeFactory.defaultInstance().constructType(Integer.class);
    }

    private ReferenceType buildBaseRefType(JavaType content) {
        return ReferenceType.construct(AtomicReference.class,
                TypeBindings.emptyBindings(), null, null, content);
    }

    // ---------------------------------------------------------
    // Factory: construct(cls, bindings, superClass, superInts, refType)
    // ---------------------------------------------------------

    @Test
    public void testConstruct_basicProperties() {
        ReferenceType rt = buildBaseRefType(stringType);

        assertSame(stringType, rt.getContentType());
        assertSame(stringType, rt.getReferencedType());
        assertTrue(rt.hasContentType());
        assertTrue(rt.isReferenceType());
        // anchorType ไม่ได้ส่งเข้ามา (null) -> ควรกลายเป็น this
        assertTrue(rt.isAnchorType());
        assertSame(rt, rt.getAnchorType());
    }

    @Test(expected = NullPointerException.class)
    public void testConstruct_nullRefType_throwsNPE() {
        // ไม่มี null-check ใน constructor นี้ -> refType.hashCode() จะ NPE
        ReferenceType.construct(AtomicReference.class,
                TypeBindings.emptyBindings(), null, null, null);
    }

    // ---------------------------------------------------------
    // Deprecated factory construct(cls, refType)
    // ทดสอบ "fault" จากการสลับตำแหน่งอาร์กิวเมนต์ผิดใน source ที่ให้มา
    // ---------------------------------------------------------

    @Test(expected = NullPointerException.class)
    public void testDeprecatedConstruct_argumentOrderBug_throwsNPE() {
        // ตามซอร์สที่ให้มา: new ReferenceType(cls, bindings, null, null, null,
        //     refType, null, null, false)
        // ทำให้พารามิเตอร์ refType (ตัวที่ 5 ของ constructor หลัก) เป็น null
        // และ refType.hashCode() จะ NPE -> นี่คือ fault ที่ต้องดักจับ
        ReferenceType.construct(AtomicReference.class, stringType);
    }

    // ---------------------------------------------------------
    // upgradeFrom(...)
    // ---------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testUpgradeFrom_nullRefdType_throws() {
        ReferenceType.upgradeFrom(stringType, null);
    }

    @Test
    public void testUpgradeFrom_notTypeBase_throwsIllegalArgument() {
        // mock JavaType จะเป็น subclass ของ JavaType ตรง ๆ ไม่ใช่ TypeBase
        JavaType mockBase = Mockito.mock(JavaType.class);
        try {
            ReferenceType.upgradeFrom(mockBase, stringType);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().startsWith("Can not upgrade from an instance of"));
        }
    }

    @Test
    public void testUpgradeFrom_withTypeBase_success() {
        // stringType ควรเป็น SimpleType ซึ่ง extends TypeBase
        ReferenceType rt = ReferenceType.upgradeFrom(stringType, intType);

        assertSame(intType, rt.getReferencedType());
        assertTrue(rt.isReferenceType());
        // constructor (TypeBase base, JavaType refType) กำหนด _anchorType = this
        assertTrue(rt.isAnchorType());
        assertSame(rt, rt.getAnchorType());
    }

    // ---------------------------------------------------------
    // withContentType
    // ---------------------------------------------------------

    @Test
    public void testWithContentType_sameReference_returnsSelf() {
        ReferenceType rt = buildBaseRefType(stringType);
        JavaType result = rt.withContentType(rt.getContentType());
        assertSame(rt, result);
    }

    @Test
    public void testWithContentType_differentReference_returnsNewInstance() {
        ReferenceType rt = buildBaseRefType(stringType);
        JavaType result = rt.withContentType(intType);

        assertNotSame(rt, result);
        assertTrue(result instanceof ReferenceType);
        assertSame(intType, result.getContentType());
    }

    @Test(expected = NullPointerException.class)
    public void testWithContentType_null_throwsNPE() {
        // ผ่าน null เข้าไป -> สร้าง ReferenceType ใหม่ด้วย refType=null -> NPE ที่ hashCode()
        ReferenceType rt = buildBaseRefType(stringType);
        rt.withContentType(null);
    }

    // ---------------------------------------------------------
    // withTypeHandler
    // ---------------------------------------------------------

    @Test
    public void testWithTypeHandler_same_returnsSelf() {
        ReferenceType rt = buildBaseRefType(stringType);
        // _typeHandler เริ่มต้นเป็น null
        ReferenceType result = rt.withTypeHandler(null);
        assertSame(rt, result);
    }

    @Test
    public void testWithTypeHandler_different_returnsNewInstance() {
        ReferenceType rt = buildBaseRefType(stringType);
        Object handler = new Object();
        ReferenceType result = rt.withTypeHandler(handler);

        assertNotSame(rt, result);
        assertSame(handler, result.<Object>getTypeHandler());
    }

    // ---------------------------------------------------------
    // withContentTypeHandler
    // ---------------------------------------------------------

    @Test
    public void testWithContentTypeHandler_same_returnsSelf() {
        ReferenceType rt = buildBaseRefType(stringType);
        // content typeHandler เริ่มต้นเป็น null -> ส่ง null เข้าไปตรงกัน -> return this
        ReferenceType result = rt.withContentTypeHandler(null);
        assertSame(rt, result);
    }

    @Test
    public void testWithContentTypeHandler_different_returnsNewInstance() {
        ReferenceType rt = buildBaseRefType(stringType);
        Object handler = new Object();
        ReferenceType result = rt.withContentTypeHandler(handler);

        assertNotSame(rt, result);
        assertSame(handler, result.getContentType().<Object>getTypeHandler());
    }

    // ---------------------------------------------------------
    // withValueHandler
    // ---------------------------------------------------------

    @Test
    public void testWithValueHandler_same_returnsSelf() {
        ReferenceType rt = buildBaseRefType(stringType);
        ReferenceType result = rt.withValueHandler(null);
        assertSame(rt, result);
    }

    @Test
    public void testWithValueHandler_different_returnsNewInstance() {
        ReferenceType rt = buildBaseRefType(stringType);
        Object handler = new Object();
        ReferenceType result = rt.withValueHandler(handler);

        assertNotSame(rt, result);
        assertSame(handler, result.<Object>getValueHandler());
    }

    // ---------------------------------------------------------
    // withContentValueHandler
    // ---------------------------------------------------------

    @Test
    public void testWithContentValueHandler_same_returnsSelf() {
        ReferenceType rt = buildBaseRefType(stringType);
        ReferenceType result = rt.withContentValueHandler(null);
        assertSame(rt, result);
    }

    @Test
    public void testWithContentValueHandler_different_returnsNewInstance() {
        ReferenceType rt = buildBaseRefType(stringType);
        Object handler = new Object();
        ReferenceType result = rt.withContentValueHandler(handler);

        assertNotSame(rt, result);
        assertSame(handler, result.getContentType().<Object>getValueHandler());
    }

    // ---------------------------------------------------------
    // withStaticTyping
    // ---------------------------------------------------------

    @Test
    public void testWithStaticTyping_branches() {
        ReferenceType rt = buildBaseRefType(stringType);

        // ครั้งแรก _asStatic=false -> ต้องได้ instance ใหม่
        ReferenceType staticOnce = rt.withStaticTyping();
        assertNotSame(rt, staticOnce);

        // ครั้งที่สอง _asStatic=true แล้ว -> ต้องได้ this (branch "if (_asStatic) return this;")
        ReferenceType staticTwice = staticOnce.withStaticTyping();
        assertSame(staticOnce, staticTwice);
    }

    // ---------------------------------------------------------
    // refine(...)
    // ---------------------------------------------------------

    @Test
    public void testRefine_returnsNewReferenceTypeWithNewRawClass() {
        ReferenceType rt = buildBaseRefType(stringType);
        JavaType refined = rt.refine(MyAtomicRef.class, TypeBindings.emptyBindings(), null, null);

        assertTrue(refined instanceof ReferenceType);
        assertEquals(MyAtomicRef.class, refined.getRawClass());
        assertSame(stringType, ((ReferenceType) refined).getReferencedType());
    }

    // ---------------------------------------------------------
    // _narrow(...) (protected, deprecated, เข้าถึงได้เพราะอยู่ package เดียวกัน)
    // ---------------------------------------------------------

    @Test
    public void testNarrow_changesRawClassKeepsReferencedType() {
        ReferenceType rt = buildBaseRefType(stringType);
        JavaType narrowed = rt._narrow(MyAtomicRef.class);

        assertTrue(narrowed instanceof ReferenceType);
        assertEquals(MyAtomicRef.class, narrowed.getRawClass());
        assertSame(stringType, ((ReferenceType) narrowed).getReferencedType());
    }

    // ---------------------------------------------------------
    // buildCanonicalName() (protected, เข้าถึงได้เพราะอยู่ package เดียวกัน)
    // ---------------------------------------------------------

    @Test
    public void testBuildCanonicalName_format() {
        ReferenceType rt = buildBaseRefType(stringType);
        String canon = rt.buildCanonicalName();

        // ตามซอร์ส: className + '<' + referencedType.toCanonical()  (ไม่มี '>' ปิด)
        String expected = AtomicReference.class.getName() + "<" + stringType.toCanonical();
        assertEquals(expected, canon);
    }

    // ---------------------------------------------------------
    // toString()
    // ---------------------------------------------------------

    @Test
    public void testToString_format() {
        ReferenceType rt = buildBaseRefType(stringType);
        String expected = "[reference type, class " + rt.buildCanonicalName()
                + "<" + stringType.toString() + ">]";
        assertEquals(expected, rt.toString());
    }

    // ---------------------------------------------------------
    // getErasedSignature / getGenericSignature
    // (ไม่เดารูปแบบภายในของ _classSignature ที่ inherited มา)
    // ---------------------------------------------------------

    @Test
    public void testGetErasedSignature_notNullAndNonEmpty() {
        ReferenceType rt = buildBaseRefType(stringType);
        StringBuilder sb = new StringBuilder();
        StringBuilder result = rt.getErasedSignature(sb);

        assertNotNull(result);
        assertTrue(result.length() > 0);
    }

    @Test
    public void testGetGenericSignature_structure() {
        ReferenceType rt = buildBaseRefType(stringType);
        StringBuilder sb = new StringBuilder();
        StringBuilder result = rt.getGenericSignature(sb);
        String s = result.toString();

        // ตามซอร์ส: ...<[genericSignatureของreferencedType]>;
        assertTrue(s.contains("<"));
        assertTrue(s.endsWith(">;"));
        String contentSig = stringType.getGenericSignature(new StringBuilder()).toString();
        assertTrue(s.contains(contentSig));
    }

    // ---------------------------------------------------------
    // equals()
    // ---------------------------------------------------------

    @Test
    public void testEquals_sameInstance() {
        ReferenceType rt = buildBaseRefType(stringType);
        assertTrue(rt.equals(rt));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        ReferenceType rt = buildBaseRefType(stringType);
        assertFalse(rt.equals(null));
    }

    @Test
    public void testEquals_differentClassType_returnsFalse() {
        ReferenceType rt = buildBaseRefType(stringType);
        assertFalse(rt.equals("not a reference type"));
    }

    @Test
    public void testEquals_differentRawClass_returnsFalse() {
        ReferenceType rt1 = buildBaseRefType(stringType);
        ReferenceType rt2 = ReferenceType.construct(java.util.concurrent.atomic.AtomicMarkableReference.class,
                TypeBindings.emptyBindings(), null, null, stringType);
        assertFalse(rt1.equals(rt2));
    }

    @Test
    public void testEquals_sameRawClassDifferentReferencedType_returnsFalse() {
        ReferenceType rt1 = buildBaseRefType(stringType);
        ReferenceType rt2 = buildBaseRefType(intType);
        assertFalse(rt1.equals(rt2));
    }

    @Test
    public void testEquals_sameRawClassSameReferencedType_returnsTrue() {
        ReferenceType rt1 = buildBaseRefType(stringType);
        JavaType stringType2 = TypeFactory.defaultInstance().constructType(String.class);
        ReferenceType rt2 = buildBaseRefType(stringType2);
        assertTrue(rt1.equals(rt2));
    }

    // ---------------------------------------------------------
    // getAnchorType / isAnchorType จากอินสแตนซ์ที่ derived (withXxx)
    // ---------------------------------------------------------

    @Test
    public void testAnchorType_propagatedThroughDerivedInstances() {
        ReferenceType original = buildBaseRefType(stringType);
        assertTrue(original.isAnchorType());

        ReferenceType derived = (ReferenceType) original.withContentType(intType);

        // anchorType ของ derived ต้องยังชี้ไปที่ original ไม่ใช่ตัวมันเอง
        assertFalse(derived.isAnchorType());
        assertSame(original, derived.getAnchorType());
    }
}
