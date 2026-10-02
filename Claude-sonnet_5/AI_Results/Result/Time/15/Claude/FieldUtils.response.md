# JUnit 4 Test Suite สำหรับ `FieldUtils`

```java
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

/**
 * JUnit 4 test suite for {@link FieldUtils}.
 * เป้าหมาย: ครอบคลุม branch / boundary ของทุกเมธอด public static
 */
public class FieldUtilsTest {

    // ใช้ field จริงจาก ISOChronology เนื่องจาก classpath ไม่มี mocking library
    private final DateTimeField realField = ISOChronology.getInstanceUTC().millisOfSecond();
    private final DateTimeFieldType realFieldType = DateTimeFieldType.secondOfMinute();

    // ------------------------------------------------------------------
    // safeNegate(int)
    // ------------------------------------------------------------------

    @Test
    public void safeNegate_positiveValue() {
        assertEquals(-5, FieldUtils.safeNegate(5));
    }

    @Test
    public void safeNegate_negativeValue() {
        assertEquals(5, FieldUtils.safeNegate(-5));
    }

    @Test
    public void safeNegate_zero() {
        assertEquals(0, FieldUtils.safeNegate(0));
    }

    @Test(expected = ArithmeticException.class)
    public void safeNegate_minValue_throws() {
        FieldUtils.safeNegate(Integer.MIN_VALUE);
    }

    // ------------------------------------------------------------------
    // safeAdd(int,int)
    // ------------------------------------------------------------------

    @Test
    public void safeAddInt_normal() {
        assertEquals(10, FieldUtils.safeAdd(4, 6));
    }

    @Test
    public void safeAddInt_boundaryNoOverflow() {
        // MAX_VALUE + 0 ไม่ overflow
        assertEquals(Integer.MAX_VALUE, FieldUtils.safeAdd(Integer.MAX_VALUE, 0));
    }

    @Test(expected = ArithmeticException.class)
    public void safeAddInt_positiveOverflow() {
        FieldUtils.safeAdd(Integer.MAX_VALUE, 1);
    }

    @Test(expected = ArithmeticException.class)
    public void safeAddInt_negativeOverflow() {
        FieldUtils.safeAdd(Integer.MIN_VALUE, -1);
    }

    // ------------------------------------------------------------------
    // safeAdd(long,long)
    // ------------------------------------------------------------------

    @Test
    public void safeAddLong_normal() {
        assertEquals(10L, FieldUtils.safeAdd(4L, 6L));
    }

    @Test
    public void safeAddLong_boundaryNoOverflow() {
        assertEquals(Long.MAX_VALUE, FieldUtils.safeAdd(Long.MAX_VALUE, 0L));
    }

    @Test(expected = ArithmeticException.class)
    public void safeAddLong_positiveOverflow() {
        FieldUtils.safeAdd(Long.MAX_VALUE, 1L);
    }

    @Test(expected = ArithmeticException.class)
    public void safeAddLong_negativeOverflow() {
        FieldUtils.safeAdd(Long.MIN_VALUE, -1L);
    }

    // ------------------------------------------------------------------
    // safeSubtract(long,long)
    // ------------------------------------------------------------------

    @Test
    public void safeSubtract_normal() {
        assertEquals(4L, FieldUtils.safeSubtract(10L, 6L));
    }

    @Test
    public void safeSubtract_boundaryNoOverflow() {
        assertEquals(Long.MAX_VALUE, FieldUtils.safeSubtract(Long.MAX_VALUE, 0L));
    }

    @Test(expected = ArithmeticException.class)
    public void safeSubtract_overflow_minMinusPositive() {
        FieldUtils.safeSubtract(Long.MIN_VALUE, 1L);
    }

    @Test(expected = ArithmeticException.class)
    public void safeSubtract_overflow_maxMinusNegative() {
        FieldUtils.safeSubtract(Long.MAX_VALUE, -1L);
    }

    // ------------------------------------------------------------------
    // safeMultiply(int,int)
    // ------------------------------------------------------------------

    @Test
    public void safeMultiplyInt_normal() {
        assertEquals(20, FieldUtils.safeMultiply(4, 5));
    }

    @Test
    public void safeMultiplyInt_boundaryNoOverflow() {
        assertEquals(Integer.MIN_VALUE, FieldUtils.safeMultiply(Integer.MIN_VALUE, 1));
    }

    @Test(expected = ArithmeticException.class)
    public void safeMultiplyInt_overflowAboveMax() {
        FieldUtils.safeMultiply(Integer.MAX_VALUE, 2);
    }

    @Test(expected = ArithmeticException.class)
    public void safeMultiplyInt_overflowBelowMin() {
        FieldUtils.safeMultiply(Integer.MIN_VALUE, 2);
    }

    // ------------------------------------------------------------------
    // safeMultiply(long,int)
    // ------------------------------------------------------------------

    @Test
    public void safeMultiplyLongInt_caseMinusOne() {
        assertEquals(-5L, FieldUtils.safeMultiply(5L, -1));
    }

    @Test
    public void safeMultiplyLongInt_caseZero() {
        assertEquals(0L, FieldUtils.safeMultiply(123456789L, 0));
    }

    @Test
    public void safeMultiplyLongInt_caseOne() {
        assertEquals(123456789L, FieldUtils.safeMultiply(123456789L, 1));
    }

    @Test
    public void safeMultiplyLongInt_normalNoOverflow() {
        assertEquals(30L, FieldUtils.safeMultiply(10L, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void safeMultiplyLongInt_overflow() {
        FieldUtils.safeMultiply(Long.MAX_VALUE, 2);
    }

    // ------------------------------------------------------------------
    // safeMultiply(long,long)
    // ------------------------------------------------------------------

    @Test
    public void safeMultiplyLongLong_val2EqualsOne() {
        assertEquals(42L, FieldUtils.safeMultiply(42L, 1L));
    }

    @Test
    public void safeMultiplyLongLong_val1EqualsOne() {
        assertEquals(99L, FieldUtils.safeMultiply(1L, 99L));
    }

    @Test
    public void safeMultiplyLongLong_val1EqualsZero() {
        assertEquals(0L, FieldUtils.safeMultiply(0L, 999L));
    }

    @Test
    public void safeMultiplyLongLong_val2EqualsZero() {
        assertEquals(0L, FieldUtils.safeMultiply(999L, 0L));
    }

    @Test
    public void safeMultiplyLongLong_normal() {
        assertEquals(200L, FieldUtils.safeMultiply(10L, 20L));
    }

    @Test(expected = ArithmeticException.class)
    public void safeMultiplyLongLong_generalOverflow() {
        FieldUtils.safeMultiply(Long.MAX_VALUE, 2L);
    }

    @Test(expected = ArithmeticException.class)
    public void safeMultiplyLongLong_specialCase_minValueTimesMinusOne() {
        // ครอบคลุมเงื่อนไขพิเศษ: val1 == Long.MIN_VALUE && val2 == -1
        FieldUtils.safeMultiply(Long.MIN_VALUE, -1L);
    }

    @Test(expected = ArithmeticException.class)
    public void safeMultiplyLongLong_specialCase_minusOneTimesMinValue() {
        // หมายเหตุ: กรณีนี้ (val2==Long.MIN_VALUE && val1==-1) จริง ๆ แล้วเงื่อนไขแรก
        // (total/val2 != val1) ก็ true อยู่แล้ว ทำให้ไม่สามารถแยก branch ที่ 3 ได้อย่างอิสระ
        // แต่ยังคงทดสอบเพื่อยืนยัน behavior ว่า throw exception ตามที่คาด
        FieldUtils.safeMultiply(-1L, Long.MIN_VALUE);
    }

    // ------------------------------------------------------------------
    // safeToInt(long)
    // ------------------------------------------------------------------

    @Test
    public void safeToInt_withinRange() {
        assertEquals(100, FieldUtils.safeToInt(100L));
    }

    @Test
    public void safeToInt_boundaryMin() {
        assertEquals(Integer.MIN_VALUE, FieldUtils.safeToInt((long) Integer.MIN_VALUE));
    }

    @Test
    public void safeToInt_boundaryMax() {
        assertEquals(Integer.MAX_VALUE, FieldUtils.safeToInt((long) Integer.MAX_VALUE));
    }

    @Test(expected = ArithmeticException.class)
    public void safeToInt_aboveMax_throws() {
        FieldUtils.safeToInt((long) Integer.MAX_VALUE + 1L);
    }

    @Test(expected = ArithmeticException.class)
    public void safeToInt_belowMin_throws() {
        FieldUtils.safeToInt((long) Integer.MIN_VALUE - 1L);
    }

    // ------------------------------------------------------------------
    // safeMultiplyToInt(long,long)
    // ------------------------------------------------------------------

    @Test
    public void safeMultiplyToInt_normal() {
        assertEquals(20000, FieldUtils.safeMultiplyToInt(100L, 200L));
    }

    @Test(expected = ArithmeticException.class)
    public void safeMultiplyToInt_overflowInMultiply() {
        FieldUtils.safeMultiplyToInt(Long.MAX_VALUE, 2L);
    }

    @Test(expected = ArithmeticException.class)
    public void safeMultiplyToInt_overflowInToInt() {
        // multiply ไม่ overflow (long) แต่ค่าเกิน int range
        FieldUtils.safeMultiplyToInt(3000000000L, 1L);
    }

    // ------------------------------------------------------------------
    // verifyValueBounds(DateTimeField, int, int, int)
    // ------------------------------------------------------------------

    @Test
    public void verifyValueBoundsField_withinBounds_noException() {
        FieldUtils.verifyValueBounds(realField, 5, 0, 10);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void verifyValueBoundsField_belowLower_throws() {
        FieldUtils.verifyValueBounds(realField, -1, 0, 10);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void verifyValueBoundsField_aboveUpper_throws() {
        FieldUtils.verifyValueBounds(realField, 11, 0, 10);
    }

    @Test
    public void verifyValueBoundsField_boundaryExactLower_noException() {
        FieldUtils.verifyValueBounds(realField, 0, 0, 10);
    }

    @Test
    public void verifyValueBoundsField_boundaryExactUpper_noException() {
        FieldUtils.verifyValueBounds(realField, 10, 0, 10);
    }

    // ------------------------------------------------------------------
    // verifyValueBounds(DateTimeFieldType, int, int, int)
    // ------------------------------------------------------------------

    @Test
    public void verifyValueBoundsFieldType_withinBounds_noException() {
        FieldUtils.verifyValueBounds(realFieldType, 5, 0, 10);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void verifyValueBoundsFieldType_belowLower_throws() {
        FieldUtils.verifyValueBounds(realFieldType, -1, 0, 10);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void verifyValueBoundsFieldType_aboveUpper_throws() {
        FieldUtils.verifyValueBounds(realFieldType, 11, 0, 10);
    }

    // ------------------------------------------------------------------
    // verifyValueBounds(String, int, int, int)
    // ------------------------------------------------------------------

    @Test
    public void verifyValueBoundsString_withinBounds_noException() {
        FieldUtils.verifyValueBounds("testField", 5, 0, 10);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void verifyValueBoundsString_belowLower_throws() {
        FieldUtils.verifyValueBounds("testField", -1, 0, 10);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void verifyValueBoundsString_aboveUpper_throws() {
        FieldUtils.verifyValueBounds("testField", 11, 0, 10);
    }

    // ------------------------------------------------------------------
    // getWrappedValue(int currentValue, int wrapValue, int minValue, int maxValue)
    // ------------------------------------------------------------------

    @Test
    public void getWrappedValue4args_normal() {
        // currentValue + wrapValue = 8, range [0,9] -> ไม่ wrap
        assertEquals(8, FieldUtils.getWrappedValue(5, 3, 0, 9));
    }

    @Test
    public void getWrappedValue4args_wrapsAround() {
        // currentValue + wrapValue = 15, range [0,9] wrapRange=10 -> 15%10=5
        assertEquals(5, FieldUtils.getWrappedValue(10, 5, 0, 9));
    }

    // ------------------------------------------------------------------
    // getWrappedValue(int value, int minValue, int maxValue)
    // ------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void getWrappedValue3args_minGreaterEqualMax_throws() {
        FieldUtils.getWrappedValue(5, 10, 10);
    }

    @Test
    public void getWrappedValue3args_valueNonNegativeAfterSubtract() {
        // value=15, min=10, max=20 -> value-min=5 (>=0) -> wrapRange=11 -> 5%11+10=15
        assertEquals(15, FieldUtils.getWrappedValue(15, 10, 20));
    }

    @Test
    public void getWrappedValue3args_negative_remByRangeZero() {
        // min=10,max=19 -> wrapRange=10 ; value=0 -> value-min=-10 -> remByRange=10%10=0 -> return min
        assertEquals(10, FieldUtils.getWrappedValue(0, 10, 19));
    }

    @Test
    public void getWrappedValue3args_negative_remByRangeNonZero() {
        // min=10,max=19 -> wrapRange=10 ; value=5 -> value-min=-5 -> remByRange=5%10=5 -> (10-5)+10=15
        assertEquals(15, FieldUtils.getWrappedValue(5, 10, 19));
    }

    // ------------------------------------------------------------------
    // equals(Object, Object)
    // ------------------------------------------------------------------

    @Test
    public void equals_sameReference_true() {
        Object o = new Object();
        assertTrue(FieldUtils.equals(o, o));
    }

    @Test
    public void equals_bothNull_true() {
        // object1 == object2 เมื่อทั้งคู่เป็น null -> true (ตรวจจาก branch แรก)
        assertTrue(FieldUtils.equals(null, null));
    }

    @Test
    public void equals_oneNull_false() {
        assertFalse(FieldUtils.equals(null, "abc"));
        assertFalse(FieldUtils.equals("abc", null));
    }

    @Test
    public void equals_nonNullEqualContent_true() {
        String a = new String("hello");
        String b = new String("hello");
        assertTrue(FieldUtils.equals(a, b));
    }

    @Test
    public void equals_nonNullDifferentContent_false() {
        assertFalse(FieldUtils.equals("hello", "world"));
    }
}
```

## สรุปการครอบคลุม Branch / Condition

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `safeNegate_positiveValue`, `safeNegate_negativeValue`, `safeNegate_zero` | path ปกติ (`value != MIN_VALUE`) |
| `safeNegate_minValue_throws` | `value == Integer.MIN_VALUE` → throw |
| `safeAddInt_normal`, `safeAddInt_boundaryNoOverflow` | condition false (ไม่เกิด overflow) |
| `safeAddInt_positiveOverflow`, `safeAddInt_negativeOverflow` | condition true → throw (sign change ทั้งสองทิศทาง) |
| `safeAddLong_*` | เหมือนกันกับ `safeAdd(int,int)` แต่สำหรับ `long` |
| `safeSubtract_normal`, `safeSubtract_boundaryNoOverflow` | condition false |
| `safeSubtract_overflow_*` | condition true (`MIN-1`, `MAX-(-1)`) |
| `safeMultiplyInt_normal`, `_boundaryNoOverflow` | `total` อยู่ในช่วง int |
| `safeMultiplyInt_overflowAboveMax`, `_overflowBelowMin` | `total` เกิน/ต่ำกว่าช่วง int |
| `safeMultiplyLongInt_caseMinusOne/Zero/One` | switch case `-1`, `0`, `1` |
| `safeMultiplyLongInt_normalNoOverflow` | path หลัง switch, ไม่ overflow |
| `safeMultiplyLongInt_overflow` | `total / val2 != val1` → throw |
| `safeMultiplyLongLong_val2EqualsOne/val1EqualsOne/val1EqualsZero/val2EqualsZero` | if-chain ต้น method |
| `safeMultiplyLongLong_normal` | path หลัง if-chain, ไม่ overflow |
| `safeMultiplyLongLong_generalOverflow` | เงื่อนไขแรกใน OR (`total/val2 != val1`) |
| `safeMultiplyLongLong_specialCase_minValueTimesMinusOne` | เงื่อนไขกลางใน OR |
| `safeMultiplyLongLong_specialCase_minusOneTimesMinValue` | พยายามครอบคลุมเงื่อนไขสุดท้าย (หมายเหตุ: ถูก short-circuit จากเงื่อนไขแรก) |
| `safeToInt_withinRange`, `_boundaryMin`, `_boundaryMax` | condition true (`MIN<=value<=MAX`) |
| `safeToInt_aboveMax_throws`, `_belowMin_throws` | condition false → throw |
| `safeMultiplyToInt_normal` | ทั้งสอง helper ไม่ throw |
| `safeMultiplyToInt_overflowInMultiply` | throw จาก `safeMultiply` |
| `safeMultiplyToInt_overflowInToInt` | throw จาก `safeToInt` |
| `verifyValueBoundsField_*` | `value<lower`, `value>upper`, และ boundary ตรงขอบ (ไม่ throw) |
| `verifyValueBoundsFieldType_*` | เหมือนกันสำหรับ overload `DateTimeFieldType` |
| `verifyValueBoundsString_*` | เหมือนกันสำหรับ overload `String` |
| `getWrappedValue4args_normal/_wrapsAround` | delegate ไปยัง 3-arg overload ทั้งกรณี wrap และไม่ wrap |
| `getWrappedValue3args_minGreaterEqualMax_throws` | `minValue >= maxValue` → throw |
| `getWrappedValue3args_valueNonNegativeAfterSubtract` | `value >= 0` branch |
| `getWrappedValue3args_negative_remByRangeZero` | `value < 0` และ `remByRange == 0` |
| `getWrappedValue3args_negative_remByRangeNonZero` | `value < 0` และ `remByRange != 0` |
| `equals_sameReference_true` | `object1 == object2` (reference เดียวกัน) |
| `equals_bothNull_true` | `object1 == object2` (ทั้งคู่ null) |
| `equals_oneNull_false` | `object1 == null \|\| object2 == null` |
| `equals_nonNullEqualContent_true`, `_nonNullDifferentContent_false` | `object1.equals(object2)` ทั้ง true/false |

**หมายเหตุสำคัญ:** สำหรับ `safeMultiply(long,long)` เงื่อนไขที่ 3 ใน `||` (`val2 == Long.MIN_VALUE && val1 == -1`) ไม่สามารถทดสอบแบบแยก branch ได้อย่างสมบูรณ์ เนื่องจากค่าตัวเลขที่ทำให้เงื่อนไขนี้เป็น true จะทำให้เงื่อนไขแรก (`total / val2 != val1`) เป็น true ไปด้วยเสมอ (short-circuit OR) จึงไม่สามารถยืนยันว่าโค้ด evaluate ไปถึงเงื่อนไขที่ 3 จริงหรือไม่ด้วย input ใด ๆ — นี่เป็นข้อจำกัดของ source code เอง ไม่ใช่ของชุดทดสอบ