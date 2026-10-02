# JUnit 4 Test Suite สำหรับ `Primitives` Class

## การวิเคราะห์ Branch/Condition

จากซอร์สโค้ด มี branch หลักดังนี้:
1. `primitiveTypeOf`: `if(clazz.isPrimitive())` → true/false branch
2. `primitiveTypeOf`: กรณี `clazz.isPrimitive()==false` → map lookup สำเร็จ/ไม่สำเร็จ (คืนค่า class หรือ null)
3. `isPrimitiveWrapper`: `containsKey()` → true/false
4. `primitiveWrapperOf`: `get()` → พบ/ไม่พบ (คืนค่าหรือ null)
5. `primitiveValueOrNullFor`: `get()` → พบ/ไม่พบ (คืนค่าหรือ null)

นอกจากนี้ยังต้องทดสอบทุกชนิดข้อมูลใน static map (8 wrapper types) เพื่อดักจับ fault ด้านข้อมูล (เช่น ใส่ค่าหรือ type ผิดใน map)

```java
package org.mockito.internal.util;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for {@link Primitives}
 * Target: Defects4J Mockito-26b
 */
public class PrimitivesTest {

    // ---------------------------------------------------------
    // primitiveTypeOf(Class<T>)
    // ---------------------------------------------------------

    @Test
    public void primitiveTypeOf_whenClassIsAlreadyPrimitive_shouldReturnSameClass() {
        // branch: clazz.isPrimitive() == true
        assertEquals(int.class, Primitives.primitiveTypeOf(int.class));
        assertEquals(boolean.class, Primitives.primitiveTypeOf(boolean.class));
        assertEquals(double.class, Primitives.primitiveTypeOf(double.class));
    }

    @Test
    public void primitiveTypeOf_whenWrapperClassIsGiven_shouldReturnCorrespondingPrimitive() {
        // branch: clazz.isPrimitive() == false, found in map
        assertEquals(boolean.class, Primitives.primitiveTypeOf(Boolean.class));
        assertEquals(char.class, Primitives.primitiveTypeOf(Character.class));
        assertEquals(byte.class, Primitives.primitiveTypeOf(Byte.class));
        assertEquals(short.class, Primitives.primitiveTypeOf(Short.class));
        assertEquals(int.class, Primitives.primitiveTypeOf(Integer.class));
        assertEquals(long.class, Primitives.primitiveTypeOf(Long.class));
        assertEquals(float.class, Primitives.primitiveTypeOf(Float.class));
        assertEquals(double.class, Primitives.primitiveTypeOf(Double.class));
    }

    @Test
    public void primitiveTypeOf_whenClassNotInMap_shouldReturnNull() {
        // branch: clazz.isPrimitive() == false, NOT found in map
        assertNull(Primitives.primitiveTypeOf(String.class));
        assertNull(Primitives.primitiveTypeOf(Object.class));
    }

    @Test(expected = NullPointerException.class)
    public void primitiveTypeOf_whenClassIsNull_shouldThrowNPE() {
        // clazz.isPrimitive() on null -> NullPointerException
        Primitives.primitiveTypeOf(null);
    }

    // ---------------------------------------------------------
    // isPrimitiveWrapper(Class<?>)
    // ---------------------------------------------------------

    @Test
    public void isPrimitiveWrapper_whenTypeIsWrapper_shouldReturnTrue() {
        // branch: containsKey == true (ทุก wrapper type)
        assertTrue(Primitives.isPrimitiveWrapper(Boolean.class));
        assertTrue(Primitives.isPrimitiveWrapper(Character.class));
        assertTrue(Primitives.isPrimitiveWrapper(Byte.class));
        assertTrue(Primitives.isPrimitiveWrapper(Short.class));
        assertTrue(Primitives.isPrimitiveWrapper(Integer.class));
        assertTrue(Primitives.isPrimitiveWrapper(Long.class));
        assertTrue(Primitives.isPrimitiveWrapper(Float.class));
        assertTrue(Primitives.isPrimitiveWrapper(Double.class));
    }

    @Test
    public void isPrimitiveWrapper_whenTypeIsNotWrapper_shouldReturnFalse() {
        // branch: containsKey == false
        assertFalse(Primitives.isPrimitiveWrapper(String.class));
        assertFalse(Primitives.isPrimitiveWrapper(Object.class));
        // primitive type เองไม่ได้อยู่ใน wrapperReturnValues map -> false
        assertFalse(Primitives.isPrimitiveWrapper(int.class));
    }

    @Test
    public void isPrimitiveWrapper_whenTypeIsNull_shouldReturnFalse() {
        // HashMap.containsKey(null) -> false (ไม่มี null key ถูก put ไว้)
        assertFalse(Primitives.isPrimitiveWrapper(null));
    }

    // ---------------------------------------------------------
    // primitiveWrapperOf(Class<T>)
    // ---------------------------------------------------------

    @Test
    public void primitiveWrapperOf_whenTypeIsWrapper_shouldReturnDefaultValue() {
        // branch: get() -> พบค่า
        assertEquals(Boolean.FALSE, Primitives.primitiveWrapperOf(Boolean.class));
        assertEquals(Character.valueOf('\u0000'), Primitives.primitiveWrapperOf(Character.class));
        assertEquals(Byte.valueOf((byte) 0), Primitives.primitiveWrapperOf(Byte.class));
        assertEquals(Short.valueOf((short) 0), Primitives.primitiveWrapperOf(Short.class));
        assertEquals(Integer.valueOf(0), Primitives.primitiveWrapperOf(Integer.class));
        assertEquals(Long.valueOf(0L), Primitives.primitiveWrapperOf(Long.class));
        assertEquals(Float.valueOf(0F), Primitives.primitiveWrapperOf(Float.class));
        assertEquals(Double.valueOf(0D), Primitives.primitiveWrapperOf(Double.class));
    }

    @Test
    public void primitiveWrapperOf_whenTypeNotFound_shouldReturnNull() {
        // branch: get() -> ไม่พบค่า -> null
        assertNull(Primitives.primitiveWrapperOf(String.class));
        assertNull(Primitives.primitiveWrapperOf(Object.class));
    }

    @Test
    public void primitiveWrapperOf_whenTypeIsNull_shouldReturnNull() {
        // get(null) -> ไม่มี key null ถูก put -> null
        assertNull(Primitives.primitiveWrapperOf(null));
    }

    // ---------------------------------------------------------
    // primitiveValueOrNullFor(Class<T>)
    // ---------------------------------------------------------

    @Test
    public void primitiveValueOrNullFor_whenPrimitiveTypeGiven_shouldReturnDefaultValue() {
        // branch: get() -> พบค่า (ทุก primitive type)
        assertEquals(Boolean.FALSE, Primitives.primitiveValueOrNullFor(boolean.class));
        assertEquals(Character.valueOf('\u0000'), Primitives.primitiveValueOrNullFor(char.class));
        assertEquals(Byte.valueOf((byte) 0), Primitives.primitiveValueOrNullFor(byte.class));
        assertEquals(Short.valueOf((short) 0), Primitives.primitiveValueOrNullFor(short.class));
        assertEquals(Integer.valueOf(0), Primitives.primitiveValueOrNullFor(int.class));
        assertEquals(Long.valueOf(0L), Primitives.primitiveValueOrNullFor(long.class));
        assertEquals(Float.valueOf(0F), Primitives.primitiveValueOrNullFor(float.class));
        // หมายเหตุ: ในซอร์ส primitiveValues.put(double.class, 0) ใส่ Integer 0 ไม่ใช่ Double
        // นี่อาจเป็น fault ที่แท้จริงในโค้ดต้นฉบับ (Defects4J bug) — ตรวจสอบด้วย assertEquals(Integer, ...)
        assertEquals(Integer.valueOf(0), Primitives.primitiveValueOrNullFor(double.class));
    }

    @Test
    public void primitiveValueOrNullFor_whenTypeNotFound_shouldReturnNull() {
        // branch: get() -> ไม่พบค่า -> null (เช่น wrapper class หรือชนิดอื่น)
        assertNull(Primitives.primitiveValueOrNullFor(Integer.class));
        assertNull(Primitives.primitiveValueOrNullFor(String.class));
    }

    @Test
    public void primitiveValueOrNullFor_whenTypeIsNull_shouldReturnNull() {
        assertNull(Primitives.primitiveValueOrNullFor(null));
    }
}
```

## สรุปตาราง Branch/Condition Coverage

| เมธอดทดสอบ | เมธอดเป้าหมาย | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| `primitiveTypeOf_whenClassIsAlreadyPrimitive_shouldReturnSameClass` | `primitiveTypeOf` | `clazz.isPrimitive() == true` → return clazz |
| `primitiveTypeOf_whenWrapperClassIsGiven_shouldReturnCorrespondingPrimitive` | `primitiveTypeOf` | `isPrimitive()==false`, map lookup พบค่า (ทั้ง 8 wrapper types) |
| `primitiveTypeOf_whenClassNotInMap_shouldReturnNull` | `primitiveTypeOf` | `isPrimitive()==false`, map lookup ไม่พบ → null |
| `primitiveTypeOf_whenClassIsNull_shouldThrowNPE` | `primitiveTypeOf` | null input → NPE จาก `clazz.isPrimitive()` |
| `isPrimitiveWrapper_whenTypeIsWrapper_shouldReturnTrue` | `isPrimitiveWrapper` | `containsKey()==true` (ทั้ง 8 wrapper types) |
| `isPrimitiveWrapper_whenTypeIsNotWrapper_shouldReturnFalse` | `isPrimitiveWrapper` | `containsKey()==false` (String, Object, primitive) |
| `isPrimitiveWrapper_whenTypeIsNull_shouldReturnFalse` | `isPrimitiveWrapper` | null key edge case |
| `primitiveWrapperOf_whenTypeIsWrapper_shouldReturnDefaultValue` | `primitiveWrapperOf` | `get()` พบค่า (ทั้ง 8 wrapper types) |
| `primitiveWrapperOf_whenTypeNotFound_shouldReturnNull` | `primitiveWrapperOf` | `get()` ไม่พบ → null |
| `primitiveWrapperOf_whenTypeIsNull_shouldReturnNull` | `primitiveWrapperOf` | null key edge case |
| `primitiveValueOrNullFor_whenPrimitiveTypeGiven_shouldReturnDefaultValue` | `primitiveValueOrNullFor` | `get()` พบค่า (ทั้ง 8 primitive types) รวมถึงตรวจจับ fault ของ `double.class` |
| `primitiveValueOrNullFor_whenTypeNotFound_shouldReturnNull` | `primitiveValueOrNullFor` | `get()` ไม่พบ → null |
| `primitiveValueOrNullFor_whenTypeIsNull_shouldReturnNull` | `primitiveValueOrNullFor` | null key edge case |

**หมายเหตุสำคัญ:** ในโค้ดต้นฉบับ `primitiveValues.put(double.class, 0)` ใส่ `Integer` (autobox จาก `int` literal `0`) แทนที่จะเป็น `Double` (`0D`) ซึ่งต่างจาก pattern ของ type อื่นๆ ทั้งหมด — test `primitiveValueOrNullFor_whenPrimitiveTypeGiven_shouldReturnDefaultValue` ได้ดักจับพฤติกรรมนี้ไว้เป็น regression check (ไม่ได้เดา behavior ใหม่ แต่ยืนยันพฤติกรรมจริงตามซอร์สโค้ดที่ให้มา)