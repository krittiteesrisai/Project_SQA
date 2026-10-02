package org.mockito.internal.util.reflection;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class GenericMasterTest {

    private final GenericMaster genericMaster = new GenericMaster();

    // Fixture class ที่มี field หลายรูปแบบเพื่อ cover ทุก branch
    static class Generics<T> {
        private List<String> listField;              // ParameterizedType -> Class (ปกติ)
        private String simpleField;                  // ไม่ใช่ generic -> Object.class
        private List<List<String>> nestedListField;   // ParameterizedType -> actual เป็น ParameterizedType (cast fail)
        private Map<String, Integer> mapField;        // ParameterizedType -> actual[0] = String.class (ปกติ)
        private List<?> wildcardField;                // ParameterizedType -> actual เป็น WildcardType (cast fail)
        private T typeVariableField;                  // TypeVariable ไม่ใช่ ParameterizedType -> Object.class
    }

    // ---------- Branch A: generic != null && instanceof ParameterizedType = true, cast สำเร็จ ----------

    @Test
    public void shouldReturnActualTypeArgument_whenFieldIsParameterizedType() throws Exception {
        Field field = Generics.class.getDeclaredField("listField");
        Class result = genericMaster.getGenericType(field);
        assertEquals(String.class, result);
    }

    @Test
    public void shouldReturnFirstActualTypeArgument_whenFieldIsMapParameterizedType() throws Exception {
        Field field = Generics.class.getDeclaredField("mapField");
        Class result = genericMaster.getGenericType(field);
        // getActualTypeArguments()[0] ของ Map<String,Integer> คือ String.class
        assertEquals(String.class, result);
    }

    // ---------- Branch A: true แต่ actual ไม่สามารถ cast เป็น Class ได้ (nested generic / wildcard) ----------
    // หมายเหตุ: พฤติกรรมนี้อ้างอิงจาก source โดยตรง (cast (Class) actual ล้มเหลวจริงตาม runtime type ของ Type)

    @Test(expected = ClassCastException.class)
    public void shouldThrowClassCastException_whenFieldIsNestedGeneric() throws Exception {
        Field field = Generics.class.getDeclaredField("nestedListField");
        genericMaster.getGenericType(field);
    }

    @Test(expected = ClassCastException.class)
    public void shouldThrowClassCastException_whenFieldIsWildcardGeneric() throws Exception {
        Field field = Generics.class.getDeclaredField("wildcardField");
        genericMaster.getGenericType(field);
    }

    // ---------- Branch B: generic ไม่ใช่ ParameterizedType -> return Object.class ----------

    @Test
    public void shouldReturnObjectClass_whenFieldIsNotGeneric() throws Exception {
        Field field = Generics.class.getDeclaredField("simpleField");
        Class result = genericMaster.getGenericType(field);
        assertEquals(Object.class, result);
    }

    @Test
    public void shouldReturnObjectClass_whenFieldIsTypeVariable() throws Exception {
        Field field = Generics.class.getDeclaredField("typeVariableField");
        Class result = genericMaster.getGenericType(field);
        assertEquals(Object.class, result);
    }

    // ---------- Boundary case: field == null ----------
    // หมายเหตุ: ไม่มีการ null-check ใน source จึงคาดว่าจะเกิด NullPointerException
    // ตั้งแต่เรียก field.getGenericType() (deduced ตรงจาก source, ไม่ใช่การเดา behavior)

    @Test(expected = NullPointerException.class)
    public void shouldThrowNullPointerException_whenFieldIsNull() {
        genericMaster.getGenericType(null);
    }
}
