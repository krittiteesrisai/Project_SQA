package com.fasterxml.jackson.databind.module;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;

/**
 * Unit tests for {@link SimpleAbstractTypeResolver}.
 * เขียนในแพ็กเกจเดียวกับคลาสเป้าหมาย จึงไม่ต้อง import แยกสำหรับ SimpleAbstractTypeResolver
 */
public class SimpleAbstractTypeResolverTest {

    private SimpleAbstractTypeResolver resolver;
    private final TypeFactory typeFactory = TypeFactory.defaultInstance();

    /**
     * คลาสช่วยทดสอบ: subclass ของ ArrayList (concrete)
     * ใช้เพื่อทดสอบ branch "superType ไม่ใช่ abstract" โดยยังคงความสัมพันธ์ subtype ถูกต้อง
     */
    private static class MyArrayList extends ArrayList<String> {
        private static final long serialVersionUID = 1L;
    }

    @Before
    public void setUp() {
        resolver = new SimpleAbstractTypeResolver();
    }

    // ==================== addMapping ====================

    @Test
    public void testAddMapping_sameClass_throwsIllegalArgumentException() {
        try {
            resolver.addMapping(AbstractList.class, AbstractList.class);
            fail("Expected IllegalArgumentException when superType == subType");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("to itself"));
        }
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Test
    public void testAddMapping_notSubtype_throwsIllegalArgumentException() {
        // ใช้ raw type เพื่อบังคับ runtime check ที่ generic ปกติจะดักไว้ตอน compile
        Class superType = AbstractList.class;
        Class subType = HashMap.class; // ไม่มีความสัมพันธ์ supertype/subtype
        try {
            resolver.addMapping(superType, subType);
            fail("Expected IllegalArgumentException when subType is not subtype of superType");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("not a subtype"));
        }
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Test
    public void testAddMapping_superTypeNotAbstract_throwsIllegalArgumentException() {
        Class superType = ArrayList.class;   // concrete class ไม่ใช่ abstract
        Class subType = MyArrayList.class;   // เป็น subtype ของ ArrayList จริง
        try {
            resolver.addMapping(superType, subType);
            fail("Expected IllegalArgumentException when superType is not abstract");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("not abstract"));
        }
    }

    @Test
    public void testAddMapping_success_withAbstractClass_returnsSelf() {
        SimpleAbstractTypeResolver returned =
                resolver.addMapping(AbstractList.class, ArrayList.class);
        assertSame("addMapping ควร return instance ตัวเองเพื่อ chaining", resolver, returned);
    }

    @Test
    public void testAddMapping_success_withInterfaceSuperType_returnsSelf() {
        // interface ก็มี ABSTRACT modifier bit set เช่นกัน จึงผ่านเงื่อนไข isAbstract
        SimpleAbstractTypeResolver returned =
                resolver.addMapping(List.class, ArrayList.class);
        assertSame(resolver, returned);
    }

    // ==================== findTypeMapping ====================

    @Test
    public void testFindTypeMapping_noMappingRegistered_returnsNull() {
        JavaType type = typeFactory.constructType(HashSet.class);
        JavaType result = resolver.findTypeMapping(null, type);
        assertNull(result);
    }

    @Test
    public void testFindTypeMapping_mappingExists_returnsNarrowedType() {
        resolver.addMapping(List.class, ArrayList.class);
        JavaType listType = typeFactory.constructType(List.class);

        JavaType result = resolver.findTypeMapping(null, listType);

        assertNotNull(result);
        assertEquals(ArrayList.class, result.getRawClass());
    }

    @Test
    public void testFindTypeMapping_typeNotInMapping_returnsNull() {
        resolver.addMapping(List.class, ArrayList.class);
        // Set ไม่ได้ถูก map ไว้ (mapping ใช้ exact-class key ผ่าน ClassKey ไม่ใช่ hierarchy lookup)
        JavaType setType = typeFactory.constructType(Set.class);

        JavaType result = resolver.findTypeMapping(null, setType);

        assertNull(result);
    }

    @Test(expected = NullPointerException.class)
    public void testFindTypeMapping_nullType_throwsNPE() {
        // type.getRawClass() ถูกเรียกโดยตรงบน null -> NPE
        // เป็นผลลัพธ์ตรงไปตรงมาจากซอร์สโค้ด (ไม่ใช่การเดา behavior)
        resolver.findTypeMapping(null, null);
    }

    // ==================== resolveAbstractType ====================

    @Test
    public void testResolveAbstractType_alwaysReturnsNull() {
        JavaType type = typeFactory.constructType(List.class);
        JavaType result = resolver.resolveAbstractType(null, type);
        assertNull(result);
    }

    @Test
    public void testResolveAbstractType_withNullArguments_returnsNullWithoutException() {
        // config และ type ไม่ถูกใช้งานใน method body เลย จึงส่ง null ได้อย่างปลอดภัย
        JavaType result = resolver.resolveAbstractType(null, null);
        assertNull(result);
    }
}
