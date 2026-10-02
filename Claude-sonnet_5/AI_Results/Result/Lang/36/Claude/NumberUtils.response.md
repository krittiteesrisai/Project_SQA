# NumberUtilsTest.java

```java
package org.apache.commons.lang3.math;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Test;
import org.apache.commons.lang3.math.NumberUtils; // explicit import ตามข้อกำหนด

public class NumberUtilsTest {

    // ===================== toInt =====================
    @Test
    public void testToInt_Null() {
        assertEquals(0, NumberUtils.toInt(null));
    }

    @Test
    public void testToInt_Empty() {
        assertEquals(0, NumberUtils.toInt(""));
    }

    @Test
    public void testToInt_Valid() {
        assertEquals(1, NumberUtils.toInt("1"));
    }

    @Test
    public void testToIntDefault_Null() {
        assertEquals(1, NumberUtils.toInt(null, 1));
    }

    @Test
    public void testToIntDefault_Invalid() {
        assertEquals(5, NumberUtils.toInt("xyz", 5));
    }

    @Test
    public void testToIntDefault_Valid() {
        assertEquals(1, NumberUtils.toInt("1", 0));
    }

    // ===================== toLong =====================
    @Test
    public void testToLong_Null() {
        assertEquals(0L, NumberUtils.toLong(null));
    }

    @Test
    public void testToLong_Empty() {
        assertEquals(0L, NumberUtils.toLong(""));
    }

    @Test
    public void testToLong_Valid() {
        assertEquals(1L, NumberUtils.toLong("1"));
    }

    @Test
    public void testToLongDefault_Null() {
        assertEquals(1L, NumberUtils.toLong(null, 1L));
    }

    @Test
    public void testToLongDefault_Invalid() {
        assertEquals(1L, NumberUtils.toLong("abc", 1L));
    }

    @Test
    public void testToLongDefault_Valid() {
        assertEquals(1L, NumberUtils.toLong("1", 0L));
    }

    // ===================== toFloat =====================
    @Test
    public void testToFloat_Null() {
        assertEquals(0.0f, NumberUtils.toFloat(null), 0.0001f);
    }

    @Test
    public void testToFloat_Empty() {
        // "" ทำให้ Float.parseFloat throw NFE -> default 0.0f
        assertEquals(0.0f, NumberUtils.toFloat(""), 0.0001f);
    }

    @Test
    public void testToFloat_Valid() {
        assertEquals(1.5f, NumberUtils.toFloat("1.5"), 0.0001f);
    }

    @Test
    public void testToFloatDefault_Null() {
        assertEquals(1.1f, NumberUtils.toFloat(null, 1.1f), 0.0001f);
    }

    @Test
    public void testToFloatDefault_Invalid() {
        assertEquals(1.1f, NumberUtils.toFloat("abc", 1.1f), 0.0001f);
    }

    @Test
    public void testToFloatDefault_Valid() {
        assertEquals(1.5f, NumberUtils.toFloat("1.5", 0.0f), 0.0001f);
    }

    // ===================== toDouble =====================
    @Test
    public void testToDouble_Null() {
        assertEquals(0.0d, NumberUtils.toDouble(null), 0.0001d);
    }

    @Test
    public void testToDouble_Empty() {
        assertEquals(0.0d, NumberUtils.toDouble(""), 0.0001d);
    }

    @Test
    public void testToDouble_Valid() {
        assertEquals(1.5d, NumberUtils.toDouble("1.5"), 0.0001d);
    }

    @Test
    public void testToDoubleDefault_Null() {
        assertEquals(1.1d, NumberUtils.toDouble(null, 1.1d), 0.0001d);
    }

    @Test
    public void testToDoubleDefault_Invalid() {
        assertEquals(1.1d, NumberUtils.toDouble("abc", 1.1d), 0.0001d);
    }

    @Test
    public void testToDoubleDefault_Valid() {
        assertEquals(1.5d, NumberUtils.toDouble("1.5", 0.0d), 0.0001d);
    }

    // ===================== toByte =====================
    @Test
    public void testToByte_Null() {
        assertEquals((byte) 0, NumberUtils.toByte(null));
    }

    @Test
    public void testToByte_Empty() {
        assertEquals((byte) 0, NumberUtils.toByte(""));
    }

    @Test
    public void testToByte_Valid() {
        assertEquals((byte) 1, NumberUtils.toByte("1"));
    }

    @Test
    public void testToByteDefault_Null() {
        assertEquals((byte) 1, NumberUtils.toByte(null, (byte) 1));
    }

    @Test
    public void testToByteDefault_Invalid() {
        assertEquals((byte) 1, NumberUtils.toByte("abc", (byte) 1));
    }

    @Test
    public void testToByteDefault_Valid() {
        assertEquals((byte) 1, NumberUtils.toByte("1", (byte) 0));
    }

    // ===================== toShort =====================
    @Test
    public void testToShort_Null() {
        assertEquals((short) 0, NumberUtils.toShort(null));
    }

    @Test
    public void testToShort_Empty() {
        assertEquals((short) 0, NumberUtils.toShort(""));
    }

    @Test
    public void testToShort_Valid() {
        assertEquals((short) 1, NumberUtils.toShort("1"));
    }

    @Test
    public void testToShortDefault_Null() {
        assertEquals((short) 1, NumberUtils.toShort(null, (short) 1));
    }

    @Test
    public void testToShortDefault_Invalid() {
        assertEquals((short) 1, NumberUtils.toShort("abc", (short) 1));
    }

    @Test
    public void testToShortDefault_Valid() {
        assertEquals((short) 1, NumberUtils.toShort("1", (short) 0));
    }

    // ===================== createNumber =====================
    @Test
    public void testCreateNumber_Null() {
        assertNull(NumberUtils.createNumber(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_Empty() {
        NumberUtils.createNumber("");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_Blank() {
        NumberUtils.createNumber("   ");
    }

    @Test
    public void testCreateNumber_DoubleMinus() {
        assertNull(NumberUtils.createNumber("--1"));
    }

    @Test
    public void testCreateNumber_Hex() {
        assertEquals(Integer.valueOf(26), NumberUtils.createNumber("0x1A"));
    }

    @Test
    public void testCreateNumber_NegativeHex() {
        assertEquals(Integer.valueOf(-26), NumberUtils.createNumber("-0x1A"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_ExpBeforeDecimal() {
        // expPos(1) < decPos(3) -> throw
        NumberUtils.createNumber("1e2.3");
    }

    @Test
    public void testCreateNumber_PlainInteger() {
        Number n = NumberUtils.createNumber("123");
        assertTrue(n instanceof Integer);
        assertEquals(123, n.intValue());
    }

    @Test
    public void testCreateNumber_LongRange() {
        Number n = NumberUtils.createNumber("12345678901"); // เกิน Integer แต่ยังอยู่ใน Long
        assertTrue(n instanceof Long);
    }

    @Test
    public void testCreateNumber_BigIntegerRange() {
        Number n = NumberUtils.createNumber("123456789012345678901234567890");
        assertTrue(n instanceof BigInteger);
    }

    @Test
    public void testCreateNumber_LongQualifier() {
        Number n = NumberUtils.createNumber("123L");
        assertTrue(n instanceof Long);
        assertEquals(123L, n.longValue());
    }

    @Test
    public void testCreateNumber_NegativeLongQualifier() {
        Number n = NumberUtils.createNumber("-123L");
        assertTrue(n instanceof Long);
        assertEquals(-123L, n.longValue());
    }

    @Test
    public void testCreateNumber_BigIntegerQualifierTooBig() {
        Number n = NumberUtils.createNumber("99999999999999999999L");
        assertTrue(n instanceof BigInteger);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_InvalidLongQualifier_NonDigits() {
        NumberUtils.createNumber("abcL");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_InvalidLongQualifier_WithDecimal() {
        NumberUtils.createNumber("123.5L");
    }

    @Test
    public void testCreateNumber_FloatQualifier() {
        Number n = NumberUtils.createNumber("1.5f");
        assertTrue(n instanceof Float);
        assertEquals(1.5f, n.floatValue(), 0.0001f);
    }

    @Test
    public void testCreateNumber_FloatQualifierUpper() {
        assertTrue(NumberUtils.createNumber("1.5F") instanceof Float);
    }

    @Test
    public void testCreateNumber_FloatZeroAllZeros() {
        // allZeros = true -> ข้ามเงื่อนไข zero-check, ยังคืน Float
        Number n = NumberUtils.createNumber("0.0f");
        assertTrue(n instanceof Float);
        assertEquals(0.0f, n.floatValue(), 0.0001f);
    }

    @Test
    public void testCreateNumber_DoubleQualifier() {
        assertTrue(NumberUtils.createNumber("1.5d") instanceof Double);
    }

    @Test
    public void testCreateNumber_DoubleQualifierUpper() {
        assertTrue(NumberUtils.createNumber("1.5D") instanceof Double);
    }

    @Test
    public void testCreateNumber_FloatOverflowFallsThroughToBigDecimal() {
        // float Infinity -> fall-through ไป double (Infinity) -> BigDecimal
        Number n = NumberUtils.createNumber("1.0E400F");
        assertTrue(n instanceof BigDecimal);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_InvalidQualifier() {
        // default case ของ switch
        NumberUtils.createNumber("1.5x");
    }

    @Test
    public void testCreateNumber_PlainDecimal() {
        Number n = NumberUtils.createNumber("1.5");
        assertTrue(n instanceof Float);
        assertEquals(1.5f, n.floatValue(), 0.0001f);
    }

    @Test
    public void testCreateNumber_DecimalWithExponent() {
        Number n = NumberUtils.createNumber("1.5e2");
        assertTrue(n instanceof Float);
        assertEquals(150.0f, n.floatValue(), 0.0001f);
    }

    @Test
    public void testCreateNumber_NoQualifierOverflowToBigDecimal() {
        Number n = NumberUtils.createNumber("1.0e400");
        assertTrue(n instanceof BigDecimal);
    }

    // ===================== create* primitives =====================
    @Test
    public void testCreateFloat_Null() {
        assertNull(NumberUtils.createFloat(null));
    }

    @Test
    public void testCreateFloat_Valid() {
        assertEquals(1.5f, NumberUtils.createFloat("1.5").floatValue(), 0.0001f);
    }

    @Test
    public void testCreateDouble_Null() {
        assertNull(NumberUtils.createDouble(null));
    }

    @Test
    public void testCreateDouble_Valid() {
        assertEquals(1.5d, NumberUtils.createDouble("1.5").doubleValue(), 0.0001d);
    }

    @Test
    public void testCreateInteger_Null() {
        assertNull(NumberUtils.createInteger(null));
    }

    @Test
    public void testCreateInteger_Valid() {
        assertEquals(Integer.valueOf(123), NumberUtils.createInteger("123"));
    }

    @Test
    public void testCreateLong_Null() {
        assertNull(NumberUtils.createLong(null));
    }

    @Test
    public void testCreateLong_Valid() {
        assertEquals(Long.valueOf(123L), NumberUtils.createLong("123"));
    }

    @Test
    public void testCreateBigInteger_Null() {
        assertNull(NumberUtils.createBigInteger(null));
    }

    @Test
    public void testCreateBigInteger_Valid() {
        assertEquals(new BigInteger("123"), NumberUtils.createBigInteger("123"));
    }

    @Test
    public void testCreateBigDecimal_Null() {
        assertNull(NumberUtils.createBigDecimal(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_Blank() {
        NumberUtils.createBigDecimal("  ");
    }

    @Test
    public void testCreateBigDecimal_Valid() {
        assertEquals(new BigDecimal("1.5"), NumberUtils.createBigDecimal("1.5"));
    }

    // ===================== min array =====================
    @Test(expected = IllegalArgumentException.class)
    public void testMinLongArray_Null() { NumberUtils.min((long[]) null); }

    @Test(expected = IllegalArgumentException.class)
    public void testMinLongArray_Empty() { NumberUtils.min(new long[0]); }

    @Test
    public void testMinLongArray_Valid() {
        assertEquals(1L, NumberUtils.min(new long[]{3L, 1L, 2L}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinIntArray_Null() { NumberUtils.min((int[]) null); }

    @Test(expected = IllegalArgumentException.class)
    public void testMinIntArray_Empty() { NumberUtils.min(new int[0]); }

    @Test
    public void testMinIntArray_Valid() {
        assertEquals(1, NumberUtils.min(new int[]{3, 1, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinShortArray_Null() { NumberUtils.min((short[]) null); }

    @Test(expected = IllegalArgumentException.class)
    public void testMinShortArray_Empty() { NumberUtils.min(new short[0]); }

    @Test
    public void testMinShortArray_Valid() {
        assertEquals((short) 1, NumberUtils.min(new short[]{3, 1, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinByteArray_Null() { NumberUtils.min((byte[]) null); }

    @Test(expected = IllegalArgumentException.class)
    public void testMinByteArray_Empty() { NumberUtils.min(new byte[0]); }

    @Test
    public void testMinByteArray_Valid() {
        assertEquals((byte) 1, NumberUtils.min(new byte[]{3, 1, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinDoubleArray_Null() { NumberUtils.min((double[]) null); }

    @Test(expected = IllegalArgumentException.class)
    public void testMinDoubleArray_Empty() { NumberUtils.min(new double[0]); }

    @Test
    public void testMinDoubleArray_Valid() {
        assertEquals(1.0d, NumberUtils.min(new double[]{3.0, 1.0, 2.0}), 0.0001d);
    }

    @Test
    public void testMinDoubleArray_NaN() {
        assertTrue(Double.isNaN(NumberUtils.min(new double[]{1.0, Double.NaN, 2.0})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinFloatArray_Null() { NumberUtils.min((float[]) null); }

    @Test(expected = IllegalArgumentException.class)
    public void testMinFloatArray_Empty() { NumberUtils.min(new float[0]); }

    @Test
    public void testMinFloatArray_Valid() {
        assertEquals(1.0f, NumberUtils.min(new float[]{3.0f, 1.0f, 2.0f}), 0.0001f);
    }

    @Test
    public void testMinFloatArray_NaN() {
        assertTrue(Float.isNaN(NumberUtils.min(new float[]{1.0f, Float.NaN, 2.0f})));
    }

    // ===================== max array =====================
    @Test(expected = IllegalArgumentException.class)
    public void testMaxLongArray_Null() { NumberUtils.max((long[]) null); }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxLongArray_Empty() { NumberUtils.max(new long[0]); }

    @Test
    public void testMaxLongArray_Valid() {
        assertEquals(3L, NumberUtils.max(new long[]{1L, 3L, 2L}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxIntArray_Null() { NumberUtils.max((int[]) null); }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxIntArray_Empty() { NumberUtils.max(new int[0]); }

    @Test
    public void testMaxIntArray_Valid() {
        assertEquals(3, NumberUtils.max(new int[]{1, 3, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxShortArray_Null() { NumberUtils.max((short[]) null); }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxShortArray_Empty() { NumberUtils.max(new short[0]); }

    @Test
    public void testMaxShortArray_Valid() {
        assertEquals((short) 3, NumberUtils.max(new short[]{1, 3, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxByteArray_Null() { NumberUtils.max((byte[]) null); }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxByteArray_Empty() { NumberUtils.max(new byte[0]); }

    @Test
    public void testMaxByteArray_Valid() {
        assertEquals((byte) 3, NumberUtils.max(new byte[]{1, 3, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxDoubleArray_Null() { NumberUtils.max((double[]) null); }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxDoubleArray_Empty() { NumberUtils.max(new double[0]); }

    @Test
    public void testMaxDoubleArray_Valid() {
        assertEquals(3.0d, NumberUtils.max(new double[]{1.0, 3.0, 2.0}), 0.0001d);
    }

    @Test
    public void testMaxDoubleArray_NaN() {
        assertTrue(Double.isNaN(NumberUtils.max(new double[]{1.0, Double.NaN, 2.0})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxFloatArray_Null() { NumberUtils.max((float[]) null); }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxFloatArray_Empty() { NumberUtils.max(new float[0]); }

    @Test
    public void testMaxFloatArray_Valid() {
        assertEquals(3.0f, NumberUtils.max(new float[]{1.0f, 3.0f, 2.0f}), 0.0001f);
    }

    @Test
    public void testMaxFloatArray_NaN() {
        assertTrue(Float.isNaN(NumberUtils.max(new float[]{1.0f, Float.NaN, 2.0f})));
    }

    // ===================== 3-param min =====================
    @Test public void testMinLong3_A() { assertEquals(1L, NumberUtils.min(1L, 2L, 3L)); }
    @Test public void testMinLong3_B() { assertEquals(1L, NumberUtils.min(2L, 1L, 3L)); }
    @Test public void testMinLong3_C() { assertEquals(1L, NumberUtils.min(3L, 2L, 1L)); }

    @Test public void testMinInt3_A() { assertEquals(1, NumberUtils.min(1, 2, 3)); }
    @Test public void testMinInt3_B() { assertEquals(1, NumberUtils.min(2, 1, 3)); }
    @Test public void testMinInt3_C() { assertEquals(1, NumberUtils.min(3, 2, 1)); }

    @Test public void testMinShort3_A() { assertEquals((short) 1, NumberUtils.min((short) 1, (short) 2, (short) 3)); }
    @Test public void testMinShort3_B() { assertEquals((short) 1, NumberUtils.min((short) 2, (short) 1, (short) 3)); }
    @Test public void testMinShort3_C() { assertEquals((short) 1, NumberUtils.min((short) 3, (short) 2, (short) 1)); }

    @Test public void testMinByte3_A() { assertEquals((byte) 1, NumberUtils.min((byte) 1, (byte) 2, (byte) 3)); }
    @Test public void testMinByte3_B() { assertEquals((byte) 1, NumberUtils.min((byte) 2, (byte) 1, (byte) 3)); }
    @Test public void testMinByte3_C() { assertEquals((byte) 1, NumberUtils.min((byte) 3, (byte) 2, (byte) 1)); }

    @Test public void testMinDouble3() { assertEquals(1.0d, NumberUtils.min(1.0, 2.0, 3.0), 0.0001d); }
    @Test public void testMinFloat3() { assertEquals(1.0f, NumberUtils.min(1.0f, 2.0f, 3.0f), 0.0001f); }

    // ===================== 3-param max =====================
    @Test public void testMaxLong3_A() { assertEquals(3L, NumberUtils.max(3L, 2L, 1L)); }
    @Test public void testMaxLong3_B() { assertEquals(3L, NumberUtils.max(1L, 3L, 2L)); }
    @Test public void testMaxLong3_C() { assertEquals(3L, NumberUtils.max(1L, 2L, 3L)); }

    @Test public void testMaxInt3_A() { assertEquals(3, NumberUtils.max(3, 2, 1)); }
    @Test public void testMaxInt3_B() { assertEquals(3, NumberUtils.max(1, 3, 2)); }
    @Test public void testMaxInt3_C() { assertEquals(3, NumberUtils.max(1, 2, 3)); }

    @Test public void testMaxShort3_A() { assertEquals((short) 3, NumberUtils.max((short) 3, (short) 2, (short) 1)); }
    @Test public void testMaxShort3_B() { assertEquals((short) 3, NumberUtils.max((short) 1, (short) 3, (short) 2)); }
    @Test public void testMaxShort3_C() { assertEquals((short) 3, NumberUtils.max((short) 1, (short) 2, (short) 3)); }

    @Test public void testMaxByte3_A() { assertEquals((byte) 3, NumberUtils.max((byte) 3, (byte) 2, (byte) 1)); }
    @Test public void testMaxByte3_B() { assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 3, (byte) 2)); }
    @Test public void testMaxByte3_C() { assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 2, (byte) 3)); }

    @Test public void testMaxDouble3() { assertEquals(3.0d, NumberUtils.max(1.0, 2.0, 3.0), 0.0001d); }
    @Test public void testMaxFloat3() { assertEquals(3.0f, NumberUtils.max(1.0f, 2.0f, 3.0f), 0.0001f); }

    // ===================== isDigits =====================
    @Test public void testIsDigits_Null() { assertFalse(NumberUtils.isDigits(null)); }
    @Test public void testIsDigits_Empty() { assertFalse(NumberUtils.isDigits("")); }
    @Test public void testIsDigits_AllDigits() { assertTrue(NumberUtils.isDigits("12345")); }
    @Test public void testIsDigits_NonDigits() { assertFalse(NumberUtils.isDigits("123a")); }

    // ===================== isNumber =====================
    @Test public void testIsNumber_Null() { assertFalse(NumberUtils.isNumber(null)); }
    @Test public void testIsNumber_Empty() { assertFalse(NumberUtils.isNumber("")); }

    @Test public void testIsNumber_HexOnly() { assertFalse(NumberUtils.isNumber("0x")); }
    @Test public void testIsNumber_HexValid() { assertTrue(NumberUtils.isNumber("0x1A")); }
    @Test public void testIsNumber_HexInvalid() { assertFalse(NumberUtils.isNumber("0x1G")); }
    @Test public void testIsNumber_NegativeHexValid() { assertTrue(NumberUtils.isNumber("-0x1A")); }

    @Test public void testIsNumber_PlainInteger() { assertTrue(NumberUtils.isNumber("12345")); }
    @Test public void testIsNumber_NegativeInteger() { assertTrue(NumberUtils.isNumber("-12345")); }

    @Test public void testIsNumber_DecimalValid() { assertTrue(NumberUtils.isNumber("123.45")); }
    @Test public void testIsNumber_TwoDecimalPoints() { assertFalse(NumberUtils.isNumber("123.45.6")); }

    @Test public void testIsNumber_ExponentValid() { assertTrue(NumberUtils.isNumber("1.2e3")); }
    @Test public void testIsNumber_TwoExponents() { assertFalse(NumberUtils.isNumber("1.2e3e4")); }
    @Test public void testIsNumber_ExponentWithoutDigitBefore() { assertFalse(NumberUtils.isNumber("e10")); }
    @Test public void testIsNumber_ExponentWithSign() {
        assertTrue(NumberUtils.isNumber("1.2e+3"));
        assertTrue(NumberUtils.isNumber("1.2e-3"));
    }

    @Test public void testIsNumber_SignWithoutAllow() { assertFalse(NumberUtils.isNumber("1+2")); }
    @Test public void testIsNumber_IllegalChar() { assertFalse(NumberUtils.isNumber("12a45")); }

    @Test public void testIsNumber_NoQualifier_TrailingDigit() { assertTrue(NumberUtils.isNumber("123")); }
    @Test public void testIsNumber_TrailingUpperE_Invalid() { assertFalse(NumberUtils.isNumber("123E")); }
    @Test public void testIsNumber_TrailingD_Valid() {
        assertTrue(NumberUtils.isNumber("123D"));
        assertTrue(NumberUtils.isNumber("123d"));
    }
    @Test public void testIsNumber_TrailingF_Valid() {
        assertTrue(NumberUtils.isNumber("123F"));
        assertTrue(NumberUtils.isNumber("123f"));
    }
    @Test public void testIsNumber_TrailingD_NoDigitFound() {
        // foundDigit == false -> false
        assertFalse(NumberUtils.isNumber(".D"));
    }
    @Test public void testIsNumber_TrailingL_Valid() {
        assertTrue(NumberUtils.isNumber("123L"));
        assertTrue(NumberUtils.isNumber("123l"));
    }
    @Test public void testIsNumber_TrailingL_WithExponent_Invalid() {
        assertFalse(NumberUtils.isNumber("1.2e3L"));
    }
    @Test public void testIsNumber_IllegalLastChar() { assertFalse(NumberUtils.isNumber("123z")); }
    @Test public void testIsNumber_DecimalThenTrailingLowerE_Invalid() {
        assertFalse(NumberUtils.isNumber("1.2e"));
    }
}
```

# สรุปตาราง Branch/Condition ที่ครอบคลุม

| กลุ่มเมธอดทดสอบ | เมธอดเป้าหมาย | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| testToInt_*, testToIntDefault_* | `toInt` | str==null / isBlank→default, parse สำเร็จ, parse ล้มเหลว (NFE catch) |
| testToLong_*, testToLongDefault_* | `toLong` | เหมือนข้างบน สำหรับ long |
| testToFloat_*, testToFloatDefault_* | `toFloat` | str==null, "" (NFE), valid, invalid→default |
| testToDouble_*, testToDoubleDefault_* | `toDouble` | เหมือนข้างบน สำหรับ double |
| testToByte_*, testToByteDefault_* | `toByte` | str==null, "", valid, invalid |
| testToShort_*, testToShortDefault_* | `toShort` | str==null, "", valid, invalid |
| testCreateNumber_Null/Empty/Blank | `createNumber` | str==null→null, isBlank→throw |
| testCreateNumber_DoubleMinus | `createNumber` | startsWith("--")→null |
| testCreateNumber_Hex/NegativeHex | `createNumber` | startsWith("0x")/"-0x"→createInteger |
| testCreateNumber_ExpBeforeDecimal | `createNumber` | decPos>-1 && expPos>-1 && expPos<decPos → throw |
| testCreateNumber_PlainInteger/LongRange/BigIntegerRange | `createNumber` | lastChar digit, dec==null&&exp==null: createInteger→createLong→createBigInteger (try/catch ทุกขั้น) |
| testCreateNumber_LongQualifier/Negative/BigIntegerQualifierTooBig | `createNumber` | case 'l'/'L': condition true → createLong สำเร็จ/ล้มเหลว→createBigInteger |
| testCreateNumber_InvalidLongQualifier_* | `createNumber` | case 'l'/'L': condition false → throw |
| testCreateNumber_FloatQualifier*/FloatZeroAllZeros | `createNumber` | case 'f'/'F': createFloat สำเร็จ, allZeros true/false |
| testCreateNumber_DoubleQualifier* | `createNumber` | case 'd'/'D': createDouble สำเร็จ |
| testCreateNumber_FloatOverflowFallsThroughToBigDecimal | `createNumber` | fall-through f→d→BigDecimal เมื่อ isInfinite() true |
| testCreateNumber_InvalidQualifier | `createNumber` | switch default → throw |
| testCreateNumber_PlainDecimal/DecimalWithExponent/NoQualifierOverflow | `createNumber` | เส้นทาง no-qualifier, dec/exp != null: Float→Double→BigDecimal |
| testCreateFloat/Double/Integer/Long/BigInteger/BigDecimal_* | `create*` helpers | str==null→null, blank→throw (เฉพาะ BigDecimal), valid parse |
| testMin/MaxXxxArray_Null/Empty/Valid/NaN | `min`/`max` (array) | array==null→throw, length==0→throw, loop update (`<`/`>` true/false), NaN short-circuit (double/float) |
| testMin/MaxXxx3_A/B/C | `min`/`max` (3-param) | if(b</>a) true/false, if(c</>a) true/false ทุก type (long,int,short,byte) + double/float (Math.min/max) |
| testIsDigits_* | `isDigits` | isEmpty true/false, loop พบอักขระไม่ใช่ตัวเลข/ครบทุกตัว |
| testIsNumber_HexOnly/HexValid/HexInvalid/NegativeHexValid | `isNumber` | hex branch: length==2→false, loop hex char valid/invalid |
| testIsNumber_PlainInteger/NegativeInteger | `isNumber` | start index (มี/ไม่มี '-'), loop ends ปกติ, digit check หลัง loop |
| testIsNumber_DecimalValid/TwoDecimalPoints | `isNumber` | hasDecPoint flag true/false branch |
| testIsNumber_ExponentValid/TwoExponents/WithoutDigitBefore/WithSign | `isNumber` | hasExp flag, allowSigns, foundDigit check ก่อน 'e' |
| testIsNumber_SignWithoutAllow | `isNumber` | allowSigns false → return false ที่ '+'/'-' |
| testIsNumber_IllegalChar | `isNumber` | else → return false (อักขระผิดกฎ) |
| testIsNumber_NoQualifier_TrailingDigit | `isNumber` | post-loop: digit → true |
| testIsNumber_TrailingUpperE_Invalid / DecimalThenTrailingLowerE_Invalid | `isNumber` | post-loop: 'e'/'E' → false |
| testIsNumber_TrailingD_Valid/F_Valid/TrailingD_NoDigitFound | `isNumber` | post-loop: d/D/f/F branch, foundDigit true/false |
| testIsNumber_TrailingL_Valid/WithExponent_Invalid | `isNumber` | post-loop: l/L branch, hasExp true/false |
| testIsNumber_IllegalLastChar | `isNumber` | post-loop: last-char illegal → false |

**หมายเหตุ:** บางกรณี (เช่น การใช้ `d.floatValue()==0.0D` ใน case 'd'/'D' ของ `createNumber`) เป็นพฤติกรรมที่มีอยู่จริงในซอร์สโค้ดที่ให้มา (อาจเป็นข้อบกพร่องที่ Defects4J ระบุ) จึงเขียน assertion ให้ตรงกับผลลัพธ์จริงของโค้ด ไม่ได้เดาพฤติกรรมที่ไม่มีอยู่ในซอร์ส