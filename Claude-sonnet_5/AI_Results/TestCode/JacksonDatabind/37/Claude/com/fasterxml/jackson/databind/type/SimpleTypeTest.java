package com.fasterxml.jackson.databind.type;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import com.fasterxml.jackson.databind.JavaType;

/**
 * Unit tests for {@link SimpleType} (Defects4J: JacksonDatabind-37b)
 */
public class SimpleTypeTest {

    // ---------- constructUnsafe ----------

    @Test
    public void testConstructUnsafe_basicClass() {
        SimpleType t = SimpleType.constructUnsafe(String.class);
        assertEquals(String.class, t.getRawClass());
        assertFalse(t.isContainerType());
    }

    // ---------- construct(Class) : deprecated factory, 3 throw branches + success ----------

    @Test
    public void testConstruct_mapThrows() {
        try {
            SimpleType.construct(HashMap.class);
            fail("Expected IllegalArgumentException for Map subtype");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Map"));
        }
    }

    @Test
    public void testConstruct_collectionThrows() {
        try {
            SimpleType.construct(ArrayList.class);
            fail("Expected IllegalArgumentException for Collection subtype");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Collection"));
        }
    }

    @Test
    public void testConstruct_arrayThrows() {
        try {
            SimpleType.construct(int[].class);
            fail("Expected IllegalArgumentException for array type");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("array"));
        }
    }

    @Test
    public void testConstruct_validClassSucceeds() {
        SimpleType t = SimpleType.construct(String.class);
        assertNotNull(t);
        assertEquals(String.class, t.getRawClass());
    }

    // NPE boundary: Class.isAssignableFrom(null) ตามสัญญาของ JDK (documented behavior)
    @Test(expected = NullPointerException.class)
    public void testConstruct_nullClassThrowsNPE() {
        SimpleType.construct(null);
    }

    // ---------- _narrow : branch _class == subclass (true/false) ----------

    @Test
    public void testNarrow_sameClassReturnsThis() {
        SimpleType t = SimpleType.constructUnsafe(Number.class);
        JavaType narrowed = t._narrow(Number.class);
        assertSame(t, narrowed);
    }

    @Test
    public void testNarrow_differentClassReturnsNewInstance() {
        SimpleType t = SimpleType.constructUnsafe(Number.class);
        JavaType narrowed = t._narrow(Integer.class);
        assertNotSame(t, narrowed);
        assertEquals(Integer.class, narrowed.getRawClass());
    }

    // ---------- withContentType / withContentTypeHandler / withContentValueHandler : always throw ----------

    @Test(expected = IllegalArgumentException.class)
    public void testWithContentType_alwaysThrows() {
        SimpleType t = SimpleType.constructUnsafe(String.class);
        t.withContentType(t);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithContentTypeHandler_alwaysThrows() {
        SimpleType t = SimpleType.constructUnsafe(String.class);
        t.withContentTypeHandler(new Object());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithContentValueHandler_alwaysThrows() {
        SimpleType t = SimpleType.constructUnsafe(String.class);
        t.withContentValueHandler(new Object());
    }

    // ---------- withTypeHandler : branch h == _typeHandler (true/false) ----------

    @Test
    public void testWithTypeHandler_sameHandlerReturnsThis() {
        SimpleType t = SimpleType.constructUnsafe(String.class); // typeHandler เริ่มต้น = null
        SimpleType result = t.withTypeHandler(null);
        assertSame(t, result);
    }

    @Test
    public void testWithTypeHandler_differentHandlerReturnsNewInstance() {
        Object handler = new Object();
        SimpleType t = SimpleType.constructUnsafe(String.class);
        SimpleType result = t.withTypeHandler(handler);
        assertNotSame(t, result);
        assertEquals(handler, result.getTypeHandler());
        // ensure original ไม่ถูกกระทบ
        assertNull(t.getTypeHandler());
    }

    // ---------- withValueHandler : branch h == _valueHandler (true/false) ----------

    @Test
    public void testWithValueHandler_sameHandlerReturnsThis() {
        SimpleType t = SimpleType.constructUnsafe(String.class); // valueHandler เริ่มต้น = null
        SimpleType result = t.withValueHandler(null);
        assertSame(t, result);
    }

    @Test
    public void testWithValueHandler_differentHandlerReturnsNewInstance() {
        Object handler = new Object();
        SimpleType t = SimpleType.constructUnsafe(String.class);
        SimpleType result = t.withValueHandler(handler);
        assertNotSame(t, result);
        assertEquals(handler, result.getValueHandler());
    }

    // ---------- withStaticTyping : branch _asStatic (true/false) ----------

    @Test
    public void testWithStaticTyping_notStaticCreatesNewInstance() {
        SimpleType t = SimpleType.constructUnsafe(String.class); // asStatic = false
        SimpleType result = t.withStaticTyping();
        assertNotSame(t, result);
    }

    @Test
    public void testWithStaticTyping_alreadyStaticReturnsThis() {
        SimpleType t = SimpleType.constructUnsafe(String.class);
        SimpleType s1 = t.withStaticTyping();       // now static
        SimpleType s2 = s1.withStaticTyping();       // already static -> branch true
        assertSame(s1, s2);
    }

    // ---------- refine : always return null ----------

    @Test
    public void testRefine_alwaysReturnsNull() {
        SimpleType t = SimpleType.constructUnsafe(String.class);
        JavaType result = t.refine(Integer.class, null, null, null);
        assertNull(result);
    }

    // ---------- buildCanonicalName : count == 0 branch (accessible via protected, same package) ----------

    @Test
    public void testBuildCanonicalName_noBindings() {
        SimpleType t = SimpleType.constructUnsafe(String.class);
        String canonical = t.buildCanonicalName();
        // count == 0 -> ไม่มี '<' '>' เพิ่ม, ผลลัพธ์คือชื่อคลาสตรง ๆ
        assertEquals(String.class.getName(), canonical);
    }
    // NOTE: branch count > 0 (มี generic bindings จริง) ไม่ได้ทดสอบ เนื่องจากไม่มีซอร์สของ
    // TypeBindings/TypeFactory ให้ตรวจสอบวิธีสร้าง binding ที่มี type parameter จริง
    // จึงไม่กล้าเดา behavior ตามข้อกำหนด

    // ---------- isContainerType ----------

    @Test
    public void testIsContainerType_alwaysFalse() {
        SimpleType t = SimpleType.constructUnsafe(Object.class);
        assertFalse(t.isContainerType());
    }

    // ---------- getErasedSignature / getGenericSignature (pass-through, count==0) ----------

    @Test
    public void testGetErasedSignature_returnsSameBuilder() {
        SimpleType t = SimpleType.constructUnsafe(String.class);
        StringBuilder sb = new StringBuilder();
        StringBuilder result = t.getErasedSignature(sb);
        assertSame(sb, result);
        assertTrue(result.length() > 0);
    }

    @Test
    public void testGetGenericSignature_endsWithSemicolon() {
        SimpleType t = SimpleType.constructUnsafe(String.class);
        StringBuilder sb = new StringBuilder();
        StringBuilder result = t.getGenericSignature(sb);
        assertTrue(result.toString().endsWith(";"));
    }

    // ---------- toString ----------

    @Test
    public void testToString_format() {
        SimpleType t = SimpleType.constructUnsafe(String.class);
        String s = t.toString();
        assertEquals("[simple type, class " + String.class.getName() + "]", s);
    }

    // ---------- equals : 5 branch ----------

    @Test
    public void testEquals_sameInstance() {
        SimpleType t = SimpleType.constructUnsafe(String.class);
        assertTrue(t.equals(t));
    }

    @Test
    public void testEquals_null() {
        SimpleType t = SimpleType.constructUnsafe(String.class);
        assertFalse(t.equals(null));
    }

    @Test
    public void testEquals_differentRuntimeClass() {
        SimpleType t = SimpleType.constructUnsafe(String.class);
        assertFalse(t.equals("not a JavaType"));
    }

    @Test
    public void testEquals_differentRawClass() {
        SimpleType t1 = SimpleType.constructUnsafe(String.class);
        SimpleType t2 = SimpleType.constructUnsafe(Integer.class);
        assertFalse(t1.equals(t2));
    }

    @Test
    public void testEquals_sameRawClassEqualBindings() {
        SimpleType t1 = SimpleType.constructUnsafe(String.class);
        SimpleType t2 = SimpleType.constructUnsafe(String.class);
        assertTrue(t1.equals(t2));
    }

    // ---------- Constructors อื่น ๆ (ไม่มีเงื่อนไข branch แต่ต้องถูกเรียกให้ทำงานถูกต้อง) ----------

    @Test
    public void testProtectedSingleArgConstructor() {
        SimpleType t = new SimpleType(String.class);
        assertEquals(String.class, t.getRawClass());
        assertFalse(t.isContainerType());
    }

    @Test
    public void testProtectedFourArgConstructor() {
        SimpleType t = new SimpleType(String.class, TypeBindings.emptyBindings(), null, null);
        assertEquals(String.class, t.getRawClass());
    }

    // สมมติฐาน: copy-constructor (TypeBase base) คัดลอกฟิลด์หลัก (_class, _bindings ฯลฯ)
    // ตรงจาก base ตาม pattern ปกติของ TypeBase (ไม่มีซอร์ส TypeBase ให้ยืนยัน 100%)
    @Test
    public void testCopyConstructor() {
        SimpleType original = SimpleType.constructUnsafe(String.class);
        SimpleType copy = new SimpleType(original);
        assertEquals(original.getRawClass(), copy.getRawClass());
        assertTrue(original.equals(copy));
    }
}
