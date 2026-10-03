package org.joda.time.field;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.chrono.ISOChronology;
import org.junit.Test;

public class FieldUtilsTest {

    // -----------------------------------------------------------------------
    // safeNegate(int)
    // -----------------------------------------------------------------------
    @Test
    public void testSafeNegate_success() {
        assertEquals(0, FieldUtils.safeNegate(0));
        assertEquals(-1, FieldUtils.safeNegate(1));
        assertEquals(1, FieldUtils.safeNegate(-1));
        assertEquals(-Integer.MAX_VALUE, FieldUtils.safeNegate(Integer.MAX_VALUE));
        assertEquals(Integer.MAX_VALUE, FieldUtils.safeNegate(-Integer.MAX_VALUE));
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeNegate_overflow() {
        FieldUtils.safeNegate(Integer.MIN_VALUE);
    }

    // -----------------------------------------------------------------------
    // safeAdd(int, int)
    // -----------------------------------------------------------------------
    @Test
    public void testSafeAddInt_success() {
        assertEquals(0, FieldUtils.safeAdd(0, 0));
        assertEquals(5, FieldUtils.safeAdd(2, 3));
        assertEquals(-1, FieldUtils.safeAdd(2, -3));
        assertEquals(Integer.MAX_VALUE, FieldUtils.safeAdd(Integer.MAX_VALUE - 1, 1));
        assertEquals(Integer.MIN_VALUE, FieldUtils.safeAdd(Integer.MIN_VALUE + 1, -1));
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeAddInt_overflowPositive() {
        FieldUtils.safeAdd(Integer.MAX_VALUE, 1);
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeAddInt_overflowNegative() {
        FieldUtils.safeAdd(Integer.MIN_VALUE, -1);
    }

    // -----------------------------------------------------------------------
    // safeAdd(long, long)
    // -----------------------------------------------------------------------
    @Test
    public void testSafeAddLong_success() {
        assertEquals(0L, FieldUtils.safeAdd(0L, 0L));
        assertEquals(5L, FieldUtils.safeAdd(2L, 3L));
        assertEquals(-1L, FieldUtils.safeAdd(2L, -3L));
        assertEquals(Long.MAX_VALUE, FieldUtils.safeAdd(Long.MAX_VALUE - 1L, 1L));
        assertEquals(Long.MIN_VALUE, FieldUtils.safeAdd(Long.MIN_VALUE + 1L, -1L));
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeAddLong_overflowPositive() {
        FieldUtils.safeAdd(Long.MAX_VALUE, 1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeAddLong_overflowNegative() {
        FieldUtils.safeAdd(Long.MIN_VALUE, -1L);
    }

    // -----------------------------------------------------------------------
    // safeSubtract(long, long)
    // -----------------------------------------------------------------------
    @Test
    public void testSafeSubtract_success() {
        assertEquals(0L, FieldUtils.safeSubtract(0L, 0L));
        assertEquals(-1L, FieldUtils.safeSubtract(2L, 3L));
        assertEquals(5L, FieldUtils.safeSubtract(2L, -3L));
        assertEquals(Long.MAX_VALUE, FieldUtils.safeSubtract(Long.MAX_VALUE - 1L, -1L));
        assertEquals(Long.MIN_VALUE, FieldUtils.safeSubtract(Long.MIN_VALUE + 1L, 1L));
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeSubtract_overflowPositive() {
        FieldUtils.safeSubtract(Long.MAX_VALUE, -1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeSubtract_overflowNegative() {
        FieldUtils.safeSubtract(Long.MIN_VALUE, 1L);
    }

    // -----------------------------------------------------------------------
    // safeMultiply(int, int)
    // -----------------------------------------------------------------------
    @Test
    public void testSafeMultiplyInt_success() {
        assertEquals(0, FieldUtils.safeMultiply(0, 100));
        assertEquals(0, FieldUtils.safeMultiply(100, 0));
        assertEquals(6, FieldUtils.safeMultiply(2, 3));
        assertEquals(-6, FieldUtils.safeMultiply(2, -3));
        assertEquals(6, FieldUtils.safeMultiply(-2, -3));
        assertEquals(Integer.MAX_VALUE, FieldUtils.safeMultiply(Integer.MAX_VALUE, 1));
        assertEquals(Integer.MIN_VALUE, FieldUtils.safeMultiply(Integer.MIN_VALUE, 1));
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeMultiplyInt_overflowPositive() {
        FieldUtils.safeMultiply(Integer.MAX_VALUE / 2 + 1, 2);
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeMultiplyInt_overflowNegative() {
        FieldUtils.safeMultiply(Integer.MIN_VALUE / 2 - 1, 2);
    }

    // -----------------------------------------------------------------------
    // safeMultiply(long, int)
    // -----------------------------------------------------------------------
    @Test
    public void testSafeMultiplyLongInt_success() {
        assertEquals(0L, FieldUtils.safeMultiply(100L, 0));
        assertEquals(100L, FieldUtils.safeMultiply(100L, 1));
        assertEquals(-100L, FieldUtils.safeMultiply(100L, -1));
        assertEquals(600L, FieldUtils.safeMultiply(200L, 3));
        assertEquals(-600L, FieldUtils.safeMultiply(200L, -3));
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeMultiplyLongInt_overflowNegateMin() {
        FieldUtils.safeMultiply(Long.MIN_VALUE, -1);
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeMultiplyLongInt_overflowPositive() {
        FieldUtils.safeMultiply(Long.MAX_VALUE / 2 + 1, 2);
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeMultiplyLongInt_overflowNegative() {
        FieldUtils.safeMultiply(Long.MIN_VALUE / 2 - 1, 2);
    }

    // -----------------------------------------------------------------------
    // safeMultiply(long, long)
    // -----------------------------------------------------------------------
    @Test
    public void testSafeMultiplyLongLong_success() {
        assertEquals(0L, FieldUtils.safeMultiply(0L, 0L));
        assertEquals(0L, FieldUtils.safeMultiply(0L, 10L));
        assertEquals(0L, FieldUtils.safeMultiply(10L, 0L));
        assertEquals(10L, FieldUtils.safeMultiply(10L, 1L));
        assertEquals(10L, FieldUtils.safeMultiply(1L, 10L));
        assertEquals(-10L, FieldUtils.safeMultiply(-10L, 1L));
        assertEquals(-10L, FieldUtils.safeMultiply(1L, -10L));
        assertEquals(600L, FieldUtils.safeMultiply(20L, 30L));
        assertEquals(-600L, FieldUtils.safeMultiply(-20L, 30L));
        assertEquals(600L, FieldUtils.safeMultiply(-20L, -30L));
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeMultiplyLongLong_overflowPositive() {
        FieldUtils.safeMultiply(Long.MAX_VALUE / 2 + 1, 2L);
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeMultiplyLongLong_overflowNegative() {
        FieldUtils.safeMultiply(Long.MIN_VALUE / 2 - 1, 2L);
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeMultiplyLongLong_overflowMinVal1NegOne() {
        FieldUtils.safeMultiply(Long.MIN_VALUE, -1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeMultiplyLongLong_overflowMinVal2NegOne() {
        FieldUtils.safeMultiply(-1L, Long.MIN_VALUE);
    }

    // -----------------------------------------------------------------------
    // safeToInt(long)
    // -----------------------------------------------------------------------
    @Test
    public void testSafeToInt_success() {
        assertEquals(0, FieldUtils.safeToInt(0L));
        assertEquals(Integer.MAX_VALUE, FieldUtils.safeToInt((long) Integer.MAX_VALUE));
        assertEquals(Integer.MIN_VALUE, FieldUtils.safeToInt((long) Integer.MIN_VALUE));
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeToInt_overflowUpper() {
        FieldUtils.safeToInt((long) Integer.MAX_VALUE + 1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeToInt_overflowLower() {
        FieldUtils.safeToInt((long) Integer.MIN_VALUE - 1L);
    }

    // -----------------------------------------------------------------------
    // safeMultiplyToInt(long, long)
    // -----------------------------------------------------------------------
    @Test
    public void testSafeMultiplyToInt_success() {
        assertEquals(0, FieldUtils.safeMultiplyToInt(0L, 100L));
        assertEquals(200, FieldUtils.safeMultiplyToInt(20L, 10L));
        assertEquals(-200, FieldUtils.safeMultiplyToInt(-20L, 10L));
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeMultiplyToInt_overflowLongMultiply() {
        FieldUtils.safeMultiplyToInt(Long.MAX_VALUE, 2L);
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeMultiplyToInt_overflowIntRange() {
        FieldUtils.safeMultiplyToInt((long) Integer.MAX_VALUE, 2L);
    }

    // -----------------------------------------------------------------------
    // verifyValueBounds
    // -----------------------------------------------------------------------
    @Test
    public void testVerifyValueBounds_DateTimeField_success() {
        DateTimeField field = ISOChronology.getInstance().dayOfMonth();
        FieldUtils.verifyValueBounds(field, 1, 1, 31);
        FieldUtils.verifyValueBounds(field, 31, 1, 31);
        FieldUtils.verifyValueBounds(field, 15, 1, 31);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testVerifyValueBounds_DateTimeField_underflow() {
        DateTimeField field = ISOChronology.getInstance().dayOfMonth();
        FieldUtils.verifyValueBounds(field, 0, 1, 31);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testVerifyValueBounds_DateTimeField_overflow() {
        DateTimeField field = ISOChronology.getInstance().dayOfMonth();
        FieldUtils.verifyValueBounds(field, 32, 1, 31);
    }

    @Test
    public void testVerifyValueBounds_DateTimeFieldType_success() {
        DateTimeFieldType fieldType = DateTimeFieldType.dayOfMonth();
        FieldUtils.verifyValueBounds(fieldType, 1, 1, 31);
        FieldUtils.verifyValueBounds(fieldType, 31, 1, 31);
        FieldUtils.verifyValueBounds(fieldType, 15, 1, 31);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testVerifyValueBounds_DateTimeFieldType_underflow() {
        DateTimeFieldType fieldType = DateTimeFieldType.dayOfMonth();
        FieldUtils.verifyValueBounds(fieldType, 0, 1, 31);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testVerifyValueBounds_DateTimeFieldType_overflow() {
        DateTimeFieldType fieldType = DateTimeFieldType.dayOfMonth();
        FieldUtils.verifyValueBounds(fieldType, 32, 1, 31);
    }

    @Test
    public void testVerifyValueBounds_String_success() {
        FieldUtils.verifyValueBounds("hour", 0, 0, 23);
        FieldUtils.verifyValueBounds("hour", 23, 0, 23);
        FieldUtils.verifyValueBounds("hour", 12, 0, 23);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testVerifyValueBounds_String_underflow() {
        FieldUtils.verifyValueBounds("hour", -1, 0, 23);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testVerifyValueBounds_String_overflow() {
        FieldUtils.verifyValueBounds("hour", 24, 0, 23);
    }

    // -----------------------------------------------------------------------
    // getWrappedValue
    // -----------------------------------------------------------------------
    @Test
    public void testGetWrappedValue_threeArgs_success() {
        // value >= 0 branch (value - minValue >= 0)
        assertEquals(5, FieldUtils.getWrappedValue(5, 1, 10));
        assertEquals(1, FieldUtils.getWrappedValue(1, 1, 10));
        assertEquals(10, FieldUtils.getWrappedValue(10, 1, 10));
        assertEquals(1, FieldUtils.getWrappedValue(11, 1, 10));
        assertEquals(2, FieldUtils.getWrappedValue(12, 1, 10));

        // value - minValue < 0 branch, remByRange == 0
        assertEquals(1, FieldUtils.getWrappedValue(-9, 1, 10)); // -9 - 1 = -10, remByRange = 0 -> 1

        // value - minValue < 0 branch, remByRange != 0
        assertEquals(10, FieldUtils.getWrappedValue(0, 1, 10)); // 0 - 1 = -1, rem = 1 -> 10 - 1 + 1 = 10
        assertEquals(9, FieldUtils.getWrappedValue(-1, 1, 10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetWrappedValue_invalidBoundsEqual() {
        FieldUtils.getWrappedValue(5, 10, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetWrappedValue_invalidBoundsGreater() {
        FieldUtils.getWrappedValue(5, 11, 10);
    }

    @Test
    public void testGetWrappedValue_fourArgs_success() {
        assertEquals(7, FieldUtils.getWrappedValue(5, 2, 1, 10));
        assertEquals(2, FieldUtils.getWrappedValue(5, 7, 1, 10));
        assertEquals(10, FieldUtils.getWrappedValue(5, -5, 1, 10));
    }

    // -----------------------------------------------------------------------
    // equals(Object, Object)
    // -----------------------------------------------------------------------
    @Test
    public void testEquals() {
        // Both null
        assertTrue(FieldUtils.equals(null, null));

        // Same reference
        String str = "test";
        assertTrue(FieldUtils.equals(str, str));

        // Equal content
        assertTrue(FieldUtils.equals(new String("test"), new String("test")));

        // One null, one non-null
        assertFalse(FieldUtils.equals(null, "test"));
        assertFalse(FieldUtils.equals("test", null));

        // Different objects
        assertFalse(FieldUtils.equals("test", "other"));
        assertFalse(FieldUtils.equals("test", Integer.valueOf(1)));
    }
}