package org.mockito.internal.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class PrimitivesTest {

    // =========================================================================
    // Tests for primitiveTypeOf(Class<T> clazz)
    // =========================================================================

    @Test
    public void primitiveTypeOf_shouldReturnSameClass_whenGivenPrimitiveTypes() {
        assertEquals(boolean.class, Primitives.primitiveTypeOf(boolean.class));
        assertEquals(byte.class, Primitives.primitiveTypeOf(byte.class));
        assertEquals(char.class, Primitives.primitiveTypeOf(char.class));
        assertEquals(short.class, Primitives.primitiveTypeOf(short.class));
        assertEquals(int.class, Primitives.primitiveTypeOf(int.class));
        assertEquals(long.class, Primitives.primitiveTypeOf(long.class));
        assertEquals(float.class, Primitives.primitiveTypeOf(float.class));
        assertEquals(double.class, Primitives.primitiveTypeOf(double.class));
    }

    @Test
    public void primitiveTypeOf_shouldReturnPrimitiveClass_whenGivenWrapperTypes() {
        assertEquals(boolean.class, Primitives.primitiveTypeOf(Boolean.class));
        assertEquals(byte.class, Primitives.primitiveTypeOf(Byte.class));
        assertEquals(char.class, Primitives.primitiveTypeOf(Character.class));
        assertEquals(short.class, Primitives.primitiveTypeOf(Short.class));
        assertEquals(int.class, Primitives.primitiveTypeOf(Integer.class));
        assertEquals(long.class, Primitives.primitiveTypeOf(Long.class));
        assertEquals(float.class, Primitives.primitiveTypeOf(Float.class));
        assertEquals(double.class, Primitives.primitiveTypeOf(Double.class));
    }

    @Test
    public void primitiveTypeOf_shouldReturnNull_whenGivenNonPrimitiveNonWrapperTypes() {
        assertNull(Primitives.primitiveTypeOf(String.class));
        assertNull(Primitives.primitiveTypeOf(Object.class));
        assertNull(Primitives.primitiveTypeOf(Void.class));
        assertNull(Primitives.primitiveTypeOf(int[].class));
    }

    @Test(expected = NullPointerException.class)
    public void primitiveTypeOf_shouldThrowNullPointerException_whenGivenNull() {
        Primitives.primitiveTypeOf(null);
    }

    // =========================================================================
    // Tests for isPrimitiveWrapper(Class<?> type)
    // =========================================================================

    @Test
    public void isPrimitiveWrapper_shouldReturnTrue_forAllEightWrapperTypes() {
        assertTrue(Primitives.isPrimitiveWrapper(Boolean.class));
        assertTrue(Primitives.isPrimitiveWrapper(Byte.class));
        assertTrue(Primitives.isPrimitiveWrapper(Character.class));
        assertTrue(Primitives.isPrimitiveWrapper(Short.class));
        assertTrue(Primitives.isPrimitiveWrapper(Integer.class));
        assertTrue(Primitives.isPrimitiveWrapper(Long.class));
        assertTrue(Primitives.isPrimitiveWrapper(Float.class));
        assertTrue(Primitives.isPrimitiveWrapper(Double.class));
    }

    @Test
    public void isPrimitiveWrapper_shouldReturnFalse_forPrimitivesAndOtherTypes() {
        assertFalse(Primitives.isPrimitiveWrapper(boolean.class));
        assertFalse(Primitives.isPrimitiveWrapper(byte.class));
        assertFalse(Primitives.isPrimitiveWrapper(char.class));
        assertFalse(Primitives.isPrimitiveWrapper(short.class));
        assertFalse(Primitives.isPrimitiveWrapper(int.class));
        assertFalse(Primitives.isPrimitiveWrapper(long.class));
        assertFalse(Primitives.isPrimitiveWrapper(float.class));
        assertFalse(Primitives.isPrimitiveWrapper(double.class));
        assertFalse(Primitives.isPrimitiveWrapper(void.class));
        assertFalse(Primitives.isPrimitiveWrapper(Void.class));
        assertFalse(Primitives.isPrimitiveWrapper(String.class));
        assertFalse(Primitives.isPrimitiveWrapper(Object.class));
        assertFalse(Primitives.isPrimitiveWrapper(Integer[].class));
    }

    @Test
    public void isPrimitiveWrapper_shouldReturnFalse_whenGivenNull() {
        assertFalse(Primitives.isPrimitiveWrapper(null));
    }

    // =========================================================================
    // Tests for primitiveWrapperOf(Class<T> type)
    // =========================================================================

    @Test
    public void primitiveWrapperOf_shouldReturnCorrectDefaultValuesAndTypes_forWrapperTypes() {
        Boolean boolVal = Primitives.primitiveWrapperOf(Boolean.class);
        assertNotNull(boolVal);
        assertEquals(Boolean.FALSE, boolVal);

        Byte byteVal = Primitives.primitiveWrapperOf(Byte.class);
        assertNotNull(byteVal);
        assertEquals(Byte.valueOf((byte) 0), byteVal);

        Character charVal = Primitives.primitiveWrapperOf(Character.class);
        assertNotNull(charVal);
        assertEquals(Character.valueOf('\u0000'), charVal);

        Short shortVal = Primitives.primitiveWrapperOf(Short.class);
        assertNotNull(shortVal);
        assertEquals(Short.valueOf((short) 0), shortVal);

        Integer intVal = Primitives.primitiveWrapperOf(Integer.class);
        assertNotNull(intVal);
        assertEquals(Integer.valueOf(0), intVal);

        Long longVal = Primitives.primitiveWrapperOf(Long.class);
        assertNotNull(longVal);
        assertEquals(Long.valueOf(0L), longVal);

        Float floatVal = Primitives.primitiveWrapperOf(Float.class);
        assertNotNull(floatVal);
        assertEquals(Float.valueOf(0F), floatVal);

        Double doubleVal = Primitives.primitiveWrapperOf(Double.class);
        assertNotNull(doubleVal);
        assertEquals(Double.valueOf(0D), doubleVal);
    }

    @Test
    public void primitiveWrapperOf_shouldReturnNull_forNonWrapperTypesAndNull() {
        assertNull(Primitives.primitiveWrapperOf(int.class));
        assertNull(Primitives.primitiveWrapperOf(double.class));
        assertNull(Primitives.primitiveWrapperOf(String.class));
        assertNull(Primitives.primitiveWrapperOf(Object.class));
        assertNull(Primitives.primitiveWrapperOf(null));
    }

    // =========================================================================
    // Tests for primitiveValueOrNullFor(Class<T> primitiveType)
    // =========================================================================

    @Test
    public void primitiveValueOrNullFor_shouldReturnCorrectDefaultValueAndExactType_forPrimitives() {
        Boolean boolVal = Primitives.primitiveValueOrNullFor(boolean.class);
        assertEquals(Boolean.FALSE, boolVal);

        Byte byteVal = Primitives.primitiveValueOrNullFor(byte.class);
        assertEquals(Byte.valueOf((byte) 0), byteVal);

        Character charVal = Primitives.primitiveValueOrNullFor(char.class);
        assertEquals(Character.valueOf('\u0000'), charVal);

        Short shortVal = Primitives.primitiveValueOrNullFor(short.class);
        assertEquals(Short.valueOf((short) 0), shortVal);

        Integer intVal = Primitives.primitiveValueOrNullFor(int.class);
        assertEquals(Integer.valueOf(0), intVal);

        Long longVal = Primitives.primitiveValueOrNullFor(long.class);
        assertEquals(Long.valueOf(0L), longVal);

        Float floatVal = Primitives.primitiveValueOrNullFor(float.class);
        assertEquals(Float.valueOf(0F), floatVal);

        // ดักจับ Defect ของ Mockito-26b: double.class ต้องคืนค่า Double ไม่ใช่ Integer
        Double doubleVal = Primitives.primitiveValueOrNullFor(double.class);
        assertNotNull(doubleVal);
        assertEquals(Double.valueOf(0D), doubleVal);
    }

    @Test
    public void primitiveValueOrNullFor_shouldReturnNull_forNonPrimitiveTypesAndNull() {
        assertNull(Primitives.primitiveValueOrNullFor(Integer.class));
        assertNull(Primitives.primitiveValueOrNullFor(Double.class));
        assertNull(Primitives.primitiveValueOrNullFor(String.class));
        assertNull(Primitives.primitiveValueOrNullFor(Object.class));
        assertNull(Primitives.primitiveValueOrNullFor(void.class));
        assertNull(Primitives.primitiveValueOrNullFor(Void.class));
        assertNull(Primitives.primitiveValueOrNullFor(null));
    }
}