# การวิเคราะห์โค้ดเป้าหมาย

จากซอร์สโค้ด `GenericMaster.getGenericType(Field field)` มี branch หลัก ๆ ดังนี้

```java
Type generic = field.getGenericType();
if (generic != null && generic instanceof ParameterizedType) {   // Branch A (true) / Branch B (false)
    Type actual = ((ParameterizedType) generic).getActualTypeArguments()[0];
    return (Class) actual;   // อาจ throw ClassCastException ถ้า actual ไม่ใช่ Class (nested generic / wildcard)
}
return Object.class;
```

- **Branch A (true):** `generic` เป็น `ParameterizedType` → cast `actual` เป็น `Class`
  - กรณีปกติ (เช่น `List<String>`) → cast สำเร็จ
  - กรณี nested generic (เช่น `List<List<String>>`) หรือ wildcard (`List<?>`) → `actual` ไม่ใช่ `Class` → **ClassCastException** (เป็น behavior จริงที่อ่านได้จากซอร์ส ไม่ใช่การเดา)
- **Branch B (false):** `generic` เป็น `null` หรือไม่ใช่ `ParameterizedType` (เช่น field ธรรมดา หรือ `TypeVariable`) → return `Object.class`
- **Boundary/Null:** หาก `field` เป็น `null` จะเกิด `NullPointerException` ตั้งแต่เรียก `field.getGenericType()` (deduced จาก source ตรง ๆ)

---

# GenericMasterTest.java

```java
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
```

---

# สรุปตาราง Branch/Condition Coverage

| Test Method | Field / Input ที่ใช้ | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| `shouldReturnActualTypeArgument_whenFieldIsParameterizedType` | `listField` (`List<String>`) | `generic != null && instanceof ParameterizedType` = true, cast `(Class) actual` สำเร็จ (normal case) |
| `shouldReturnFirstActualTypeArgument_whenFieldIsMapParameterizedType` | `mapField` (`Map<String,Integer>`) | เหมือนด้านบน แต่ตรวจว่าใช้ `actualTypeArguments[0]` (ตัวแรก) ถูกต้อง |
| `shouldThrowClassCastException_whenFieldIsNestedGeneric` | `nestedListField` (`List<List<String>>`) | `instanceof ParameterizedType` = true แต่ `actual` เป็น `ParameterizedType` ไม่ใช่ `Class` → ClassCastException (nested generic ไม่ลงลึกตาม comment ในโค้ด) |
| `shouldThrowClassCastException_whenFieldIsWildcardGeneric` | `wildcardField` (`List<?>`) | เหมือนด้านบนแต่ actual เป็น `WildcardType` → ClassCastException |
| `shouldReturnObjectClass_whenFieldIsNotGeneric` | `simpleField` (`String`) | `generic instanceof ParameterizedType` = false (ไม่ใช่ generic เลย) → return `Object.class` |
| `shouldReturnObjectClass_whenFieldIsTypeVariable` | `typeVariableField` (`T`) | `generic` เป็น `TypeVariable` ไม่ใช่ `ParameterizedType` → false branch → `Object.class` |
| `shouldThrowNullPointerException_whenFieldIsNull` | `field = null` | Boundary/null input: เรียก `field.getGenericType()` บน null → NullPointerException (ก่อนถึง if-condition) |

**หมายเหตุสำคัญ:** เคส `ClassCastException` ทั้งสองเคส (`nestedListField`, `wildcardField`) เป็นพฤติกรรมจริงที่อ่านได้จาก logic การ cast `(Class) actual` ในซอร์สโค้ด ซึ่งสอดคล้องกับ comment `//in case of nested generics we don't go deep` — เป็นจุดที่ควรดักจับได้หากมีการแก้ไข defect ในอนาคต (เช่นเพิ่มการตรวจสอบ `instanceof Class` ก่อน cast)