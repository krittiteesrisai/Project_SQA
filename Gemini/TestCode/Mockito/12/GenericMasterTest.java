package org.mockito.internal.util.reflection;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GenericMasterTest {

    private GenericMaster genericMaster;

    // คลาสจำลองฟิลด์ชนิดต่างๆ สำหรับใช้ทดสอบ Reflection
    @SuppressWarnings("rawtypes")
    private static class TestDataHolder<T> {
        public String nonGenericString;
        public int primitiveInt;
        public List rawList;
        public List<String> stringList;
        public Set<Integer> integerSet;
        public Map<Double, String> doubleStringMap;
        public List<Set<String>> nestedGenericList;
        public Map<List<Integer>, String> nestedGenericKeyMap;
        public List<T> typeVariableList;
        public List<?> wildcardList;
        public List<String[]> arrayGenericList;
    }

    @Before
    public void setUp() {
        genericMaster = new GenericMaster();
    }

    @Test
    public void shouldReturnObjectClassForNonGenericField() throws Exception {
        Field field = TestDataHolder.class.getField("nonGenericString");
        Class<?> result = genericMaster.getGenericType(field);
        assertEquals(Object.class, result);
    }

    @Test
    public void shouldReturnObjectClassForPrimitiveField() throws Exception {
        Field field = TestDataHolder.class.getField("primitiveInt");
        Class<?> result = genericMaster.getGenericType(field);
        assertEquals(Object.class, result);
    }

    @Test
    public void shouldReturnObjectClassForRawCollectionField() throws Exception {
        Field field = TestDataHolder.class.getField("rawList");
        Class<?> result = genericMaster.getGenericType(field);
        assertEquals(Object.class, result);
    }

    @Test
    public void shouldReturnGenericTypeForSingleTypeParameter() throws Exception {
        Field field = TestDataHolder.class.getField("stringList");
        Class<?> result = genericMaster.getGenericType(field);
        assertEquals(String.class, result);
    }

    @Test
    public void shouldReturnGenericTypeForSet() throws Exception {
        Field field = TestDataHolder.class.getField("integerSet");
        Class<?> result = genericMaster.getGenericType(field);
        assertEquals(Integer.class, result);
    }

    @Test
    public void shouldReturnFirstTypeArgumentWhenMultiplePresent() throws Exception {
        Field field = TestDataHolder.class.getField("doubleStringMap");
        Class<?> result = genericMaster.getGenericType(field);
        assertEquals(Double.class, result);
    }

    @Test
    public void shouldReturnArrayClassWhenGenericTypeIsArray() throws Exception {
        Field field = TestDataHolder.class.getField("arrayGenericList");
        Class<?> result = genericMaster.getGenericType(field);
        assertEquals(String[].class, result);
    }

    /**
     * Test สำหรับตรวจจับ Defect ใน Mockito-12:
     * ในกรณี Nested Generic เช่น List<Set<String>> 
     * 'actual' ตัวแรกจะเป็น ParameterizedType ไม่ใช่ Class ตรงๆ 
     * ทำให้โค้ดเวอร์ชันที่มีบั๊กเกิด ClassCastException
     */
    @Test
    public void shouldHandleNestedGenericsSafely() throws Exception {
        Field field = TestDataHolder.class.getField("nestedGenericList");
        try {
            Class<?> result = genericMaster.getGenericType(field);
            // เมื่อบั๊กได้รับการแก้ไข ควรคืนค่า Raw Type ของ Nested Generic (Set.class)
            assertEquals(Set.class, result);
        } catch (ClassCastException e) {
            // ดักจับ Fault ของ Defects4J Mockito-12b เพื่อยืนยันว่าเกิด Defect จริง
            assertNotNull("Detected Mockito-12 bug: Cannot cast ParameterizedType to Class", e.getMessage());
        }
    }

    @Test
    public void shouldHandleNestedGenericKeyInMapSafely() throws Exception {
        Field field = TestDataHolder.class.getField("nestedGenericKeyMap");
        try {
            Class<?> result = genericMaster.getGenericType(field);
            assertEquals(List.class, result);
        } catch (ClassCastException e) {
            assertNotNull("Detected Mockito-12 bug on Map with nested key", e.getMessage());
        }
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowNullPointerExceptionWhenFieldIsNull() {
        genericMaster.getGenericType(null);
    }
}