package com.fasterxml.jackson.databind.type;

import static org.junit.Assert.*;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.JavaType;
// import ซ้ำคลาสเป้าหมาย (แม้อยู่ package เดียวกัน) ตามข้อกำหนด
import com.fasterxml.jackson.databind.type.CollectionType;

/**
 * Unit test สำหรับ {@link CollectionType}
 *
 * หมายเหตุการออกแบบ:
 * - อยู่ package เดียวกับคลาสเป้าหมาย เพื่อเข้าถึง protected method (_narrow)
 *   และ protected field ที่สืบทอดมา (_asStatic, _bindings, _superClass,
 *   _superInterfaces, _valueHandler, _typeHandler) ได้โดยตรง
 * - ใช้ TypeFactory / TypeBindings (ไม่ได้อยู่ในซอร์สที่ให้มา แต่เป็น dependency
 *   จริงของ CollectionType) เพื่อสร้าง JavaType fixture สำหรับทดสอบ
 * - ไม่ได้เดา behavior ของ getter ที่ไม่แน่ใจ (เช่น useStaticType()) จึงใช้
 *   การเข้าถึง field ภายใน (_asStatic) โดยตรงแทน
 */
public class CollectionTypeTest {

    private JavaType stringType;
    private JavaType integerType;
    private JavaType superClassType;
    private TypeBindings emptyBindings;
    private JavaType[] emptySupers;

    @Before
    public void setUp() {
        TypeFactory tf = TypeFactory.defaultInstance();
        stringType = tf.constructType(String.class);
        integerType = tf.constructType(Integer.class);
        superClassType = tf.constructType(Object.class);
        emptyBindings = TypeBindings.emptyBindings();
        emptySupers = new JavaType[0];
    }

    // ---------- construct(Class, TypeBindings, superClass, superInts, elemT) ----------

    @Test
    public void testConstructWithBindings_basicFields() {
        CollectionType ct = CollectionType.construct(List.class, emptyBindings,
                superClassType, emptySupers, stringType);

        assertEquals(List.class, ct.getRawClass());
        assertSame(stringType, ct.getContentType());
        assertNull(ct.getValueHandler());
        assertNull(ct.getTypeHandler());
        assertFalse(ct._asStatic);
        assertSame(emptyBindings, ct._bindings);
        assertSame(superClassType, ct._superClass);
        assertSame(emptySupers, ct._superInterfaces);
    }

    @Test
    public void testConstructWithBindings_nullElementType_allowed() {
        // constructor ไม่มี validation ห้าม elemT เป็น null
        CollectionType ct = CollectionType.construct(List.class, emptyBindings,
                superClassType, emptySupers, null);
        assertNull(ct.getContentType());
    }

    @Test
    public void testConstructWithBindings_nullSuperInterfaces_allowed() {
        CollectionType ct = CollectionType.construct(Set.class, emptyBindings,
                superClassType, null, stringType);
        assertNull(ct._superInterfaces);
        assertEquals(Set.class, ct.getRawClass());
    }

    // ---------- deprecated construct(Class, elemT) ----------

    @Test
    @SuppressWarnings("deprecation")
    public void testConstructDeprecated_basicFields() {
        CollectionType ct = CollectionType.construct(List.class, stringType);

        assertEquals(List.class, ct.getRawClass());
        assertSame(stringType, ct.getContentType());
        // deprecated constructor ส่ง bindings เป็น null ตรงๆ
        assertNull(ct._bindings);
        assertFalse(ct._asStatic);
        assertNull(ct.getValueHandler());
        assertNull(ct.getTypeHandler());
    }

    // ---------- _narrow (protected, deprecated) ----------

    @Test
    @SuppressWarnings("deprecation")
    public void testNarrow_changesRawClassKeepsOtherFields() {
        CollectionType ct = CollectionType.construct(List.class, emptyBindings,
                superClassType, emptySupers, stringType);

        JavaType narrowed = ct._narrow(ArrayList.class);

        assertTrue(narrowed instanceof CollectionType);
        assertEquals(ArrayList.class, narrowed.getRawClass());
        assertSame(stringType, narrowed.getContentType());
        assertSame(emptyBindings, ((CollectionType) narrowed)._bindings);
        assertSame(superClassType, ((CollectionType) narrowed)._superClass);
        assertFalse(((CollectionType) narrowed)._asStatic);
    }

    // ---------- withContentType : branch 1 (same reference -> return this) ----------

    @Test
    public void testWithContentType_sameReference_returnsThis() {
        CollectionType ct = CollectionType.construct(List.class, emptyBindings,
                superClassType, emptySupers, stringType);

        JavaType result = ct.withContentType(stringType);

        assertSame(ct, result);
    }

    // ---------- withContentType : branch 2 (different reference -> new instance) ----------

    @Test
    public void testWithContentType_differentReference_createsNewInstance() {
        CollectionType ct = CollectionType.construct(List.class, emptyBindings,
                superClassType, emptySupers, stringType);

        JavaType result = ct.withContentType(integerType);

        assertNotSame(ct, result);
        assertSame(integerType, result.getContentType());
        assertEquals(List.class, result.getRawClass());
    }

    @Test
    public void testWithContentType_equalButDifferentInstance_stillCreatesNewInstance() {
        // ยืนยันว่าการเทียบใช้ '==' (reference) ไม่ใช่ .equals()
        JavaType anotherStringType = TypeFactory.defaultInstance().constructType(String.class);
        CollectionType ct = CollectionType.construct(List.class, emptyBindings,
                superClassType, emptySupers, stringType);

        JavaType result = ct.withContentType(anotherStringType);

        if (anotherStringType != stringType) {
            assertNotSame(ct, result);
        }
    }

    // ---------- withTypeHandler ----------

    @Test
    public void testWithTypeHandler_setsHandlerCreatesNewInstance() {
        CollectionType ct = CollectionType.construct(List.class, emptyBindings,
                superClassType, emptySupers, stringType);
        Object handler = new Object();

        CollectionType result = ct.withTypeHandler(handler);

        assertNotSame(ct, result);
        assertSame(handler, result.getTypeHandler());
        assertSame(stringType, result.getContentType());
        assertNull(ct.getTypeHandler()); // original ต้อง immutable
    }

    // ---------- withContentTypeHandler ----------

    @Test
    public void testWithContentTypeHandler_setsHandlerOnElementType() {
        CollectionType ct = CollectionType.construct(List.class, emptyBindings,
                superClassType, emptySupers, stringType);
        Object handler = new Object();

        CollectionType result = ct.withContentTypeHandler(handler);

        assertSame(handler, result.getContentType().getTypeHandler());
        assertNull(ct.getContentType().getTypeHandler());
    }

    @Test(expected = NullPointerException.class)
    public void testWithContentTypeHandler_nullElementType_throwsNPE() {
        CollectionType ct = CollectionType.construct(List.class, emptyBindings,
                superClassType, emptySupers, null);
        ct.withContentTypeHandler(new Object());
    }

    // ---------- withValueHandler ----------

    @Test
    public void testWithValueHandler_setsHandlerCreatesNewInstance() {
        CollectionType ct = CollectionType.construct(List.class, emptyBindings,
                superClassType, emptySupers, stringType);
        Object handler = new Object();

        CollectionType result = ct.withValueHandler(handler);

        assertNotSame(ct, result);
        assertSame(handler, result.getValueHandler());
        assertNull(ct.getValueHandler());
    }

    // ---------- withContentValueHandler ----------

    @Test
    public void testWithContentValueHandler_setsHandlerOnElementType() {
        CollectionType ct = CollectionType.construct(List.class, emptyBindings,
                superClassType, emptySupers, stringType);
        Object handler = new Object();

        CollectionType result = ct.withContentValueHandler(handler);

        assertSame(handler, result.getContentType().getValueHandler());
        assertNull(ct.getContentType().getValueHandler());
    }

    @Test(expected = NullPointerException.class)
    public void testWithContentValueHandler_nullElementType_throwsNPE() {
        CollectionType ct = CollectionType.construct(List.class, emptyBindings,
                superClassType, emptySupers, null);
        ct.withContentValueHandler(new Object());
    }

    // ---------- withStaticTyping : branch 1 (_asStatic == true -> return this) ----------

    @Test
    public void testWithStaticTyping_alreadyStatic_returnsThis() {
        CollectionType base = CollectionType.construct(List.class, emptyBindings,
                superClassType, emptySupers, stringType);
        CollectionType alreadyStatic = base.withStaticTyping(); // false -> true (สร้างใหม่)

        assertTrue(alreadyStatic._asStatic);

        CollectionType result = alreadyStatic.withStaticTyping();

        assertSame(alreadyStatic, result); // ตอนนี้ asStatic=true แล้ว ควร return this
    }

    // ---------- withStaticTyping : branch 2 (_asStatic == false -> create new, propagate) ----------

    @Test
    public void testWithStaticTyping_notStatic_createsNewInstanceAndPropagates() {
        CollectionType ct = CollectionType.construct(List.class, emptyBindings,
                superClassType, emptySupers, stringType);
        assertFalse(ct._asStatic);

        CollectionType result = ct.withStaticTyping();

        assertNotSame(ct, result);
        assertTrue(result._asStatic);
        // elementType ต้องถูก propagate ผ่าน _elementType.withStaticTyping() ด้วย
        assertNotSame(stringType, result.getContentType());
    }

    // ---------- refine ----------

    @Test
    public void testRefine_changesRawTypeKeepsElementTypeAndHandlers() {
        Object valueHandler = new Object();
        Object typeHandler = new Object();
        CollectionType ct = CollectionType.construct(List.class, emptyBindings,
                superClassType, emptySupers, stringType)
                .withValueHandler(valueHandler)
                .withTypeHandler(typeHandler);

        JavaType newSuperClass = TypeFactory.defaultInstance().constructType(Collection.class);
        JavaType[] newSuperInterfaces = new JavaType[] {
                TypeFactory.defaultInstance().constructType(Iterable.class)
        };

        JavaType refined = ct.refine(ArrayList.class, emptyBindings, newSuperClass, newSuperInterfaces);

        assertTrue(refined instanceof CollectionType);
        assertEquals(ArrayList.class, refined.getRawClass());
        assertSame(stringType, refined.getContentType());
        assertSame(valueHandler, refined.getValueHandler());
        assertSame(typeHandler, refined.getTypeHandler());
        assertSame(newSuperClass, ((CollectionType) refined)._superClass);
        assertSame(newSuperInterfaces, ((CollectionType) refined)._superInterfaces);
    }

    // ---------- toString ----------

    @Test
    public void testToString_containsClassNameAndContentType() {
        CollectionType ct = CollectionType.construct(List.class, emptyBindings,
                superClassType, emptySupers, stringType);

        String s = ct.toString();

        assertTrue(s.startsWith("[collection type; class " + List.class.getName() + ", contains "));
        assertTrue(s.endsWith("]"));
        assertTrue(s.contains(stringType.toString()));
    }

    @Test
    public void testToString_withNullElementType_doesNotThrow() {
        CollectionType ct = CollectionType.construct(List.class, emptyBindings,
                superClassType, emptySupers, null);

        String s = ct.toString(); // string concat กับ null ไม่ throw

        assertTrue(s.contains("null"));
    }
}
