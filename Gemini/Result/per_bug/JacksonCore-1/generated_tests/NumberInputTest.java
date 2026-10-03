package com.fasterxml.jackson.core.io;

import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.*;

public class NumberInputTest {

    @Test
    public void testParseIntCharArray() {
        char[] chars = "123456789".toCharArray();
        // ทดสอบความยาวต่าง ๆ ตั้งแต่ 1 ถึง 9 หลัก
        assertEquals(1, NumberInput.parseInt(chars, 0, 1));
        assertEquals(12, NumberInput.parseInt(chars, 0, 2));
        assertEquals(123, NumberInput.parseInt(chars, 0, 3));
        assertEquals(1234, NumberInput.parseInt(chars, 0, 4));
        assertEquals(12345, NumberInput.parseInt(chars, 0, 5));
        assertEquals(123456, NumberInput.parseInt(chars, 0, 6));
        assertEquals(1234567, NumberInput.parseInt(chars, 0, 7));
        assertEquals(12345678, NumberInput.parseInt(chars, 0, 8));
        assertEquals(123456789, NumberInput.parseInt(chars, 0, 9));
    }

    @Test
    public void testParseIntStringValid() {
        // บวก 1-9 หลัก
        assertEquals(5, NumberInput.parseInt("5"));
        assertEquals(123, NumberInput.parseInt("123"));
        assertEquals(123456789, NumberInput.parseInt("123456789"));

        // ลบ 1-10 หลัก
        assertEquals(-5, NumberInput.parseInt("-5"));
        assertEquals(-123, NumberInput.parseInt("-123"));
        assertEquals(-123456789, NumberInput.parseInt("-123456789"));
        assertEquals(-2147483648, NumberInput.parseInt("-2147483648"));
    }

    @Test
    public void testParseIntStringFallbackJdk() {
        // ความยาวเกินกำหนดสำหรับ Fast path (>9 สำหรับบวก, >10 หรือ ==1 สำหรับลบ)
        assertEquals(1234567890, NumberInput.parseInt("1234567890"));
        assertEquals(-1, NumberInput.parseInt("-"));
        assertEquals(-1234567890, NumberInput.parseInt("-12345678901")); // > 10 สำหรับติดลบ

        // ตัวอักษรตัวแรกหรือตัวถัดไปไม่ใช่ตัวเลข
        assertEquals(123, NumberInput.parseInt("123a"));
        assertEquals(12, NumberInput.parseInt("1a2"));
        assertEquals(1, NumberInput.parseInt("1a"));
        assertEquals(123, NumberInput.parseInt("123a4"));
        assertEquals(Integer.parseInt("a123"), NumberInput.parseInt("a123"));
    }

    @Test
    public void testParseLongCharArray() {
        char[] chars = "123456789012345678".toCharArray();
        long val = NumberInput.parseLong(chars, 0, 18);
        assertEquals(123456789012345678L, val);
    }

    @Test
    public void testParseLongString() {
        // ความยาว <= 9 (เรียก parseInt ภายใน)
        assertEquals(12345, NumberInput.parseLong("12345"));
        // ความยาว > 9 (เรียก Long.parseLong ภายใน)
        assertEquals(12345678901L, NumberInput.parseLong("12345678901"));
    }

    @Test
    public void testInLongRangeCharArray() {
        char[] maxLong = NumberInput.MAX_LONG_STR.toCharArray();
        char[] minLongNoSign = NumberInput.MIN_LONG_STR_NO_SIGN.toCharArray();

        // len < cmpLen
        assertTrue(NumberInput.inLongRange(maxLong, 0, 5, false));
        // len > cmpLen
        assertFalse(NumberInput.inLongRange(maxLong, 0, maxLong.length + 1, false));

        // len == cmpLen, ค่าเท่ากัน
        assertTrue(NumberInput.inLongRange(maxLong, 0, maxLong.length, false));
        assertTrue(NumberInput.inLongRange(minLongNoSign, 0, minLongNoSign.length, true));

        // len == cmpLen, diff < 0 (ค่าน้อยกว่า Max Long)
        char[] smaller = maxLong.clone();
        smaller[0] = '1';
        assertTrue(NumberInput.inLongRange(smaller, 0, smaller.length, false));

        // len == cmpLen, diff > 0 (ค่ามากกว่า Max Long)
        char[] larger = maxLong.clone();
        larger[0] = '9';
        assertFalse(NumberInput.inLongRange(larger, 0, larger.length, false));
    }

    @Test
    public void testInLongRangeString() {
        String maxStr = NumberInput.MAX_LONG_STR;
        String minStrNoSign = NumberInput.MIN_LONG_STR_NO_SIGN;

        assertTrue(NumberInput.inLongRange("123", false));
        assertFalse(NumberInput.inLongRange(maxStr + "0", false));
        assertTrue(NumberInput.inLongRange(maxStr, false));
        assertTrue(NumberInput.inLongRange(minStrNoSign, true));

        // diff < 0 และ diff > 0 แบบ String
        String smaller = "1" + maxStr.substring(1);
        String larger = "9" + maxStr.substring(1);
        assertTrue(NumberInput.inLongRange(smaller, false));
        assertFalse(NumberInput.inLongRange(larger, false));
    }

    @Test
    public void testParseAsInt() {
        assertEquals(10, NumberInput.parseAsInt(null, 10));
        assertEquals(10, NumberInput.parseAsInt("", 10));
        assertEquals(10, NumberInput.parseAsInt("   ", 10));
        assertEquals(123, NumberInput.parseAsInt("+123", 10));
        assertEquals(-123, NumberInput.parseAsInt("-123", 10));
        assertEquals(123, NumberInput.parseAsInt("123", 10));
        
        // Non-numeric coerced via Double
        assertEquals(12, NumberInput.parseAsInt("12.34", 10));
        // Invalid format returning default
        assertEquals(10, NumberInput.parseAsInt("invalid", 10));
        assertEquals(10, NumberInput.parseAsInt("123.45.67", 10));
    }

    @Test
    public void testParseAsLong() {
        assertEquals(10L, NumberInput.parseAsLong(null, 10L));
        assertEquals(10L, NumberInput.parseAsLong("", 10L));
        assertEquals(10L, NumberInput.parseAsLong("   ", 10L));
        assertEquals(123L, NumberInput.parseAsLong("+123", 10L));
        assertEquals(-123L, NumberInput.parseAsLong("-123", 10L));
        assertEquals(123L, NumberInput.parseAsLong("123", 10L));

        assertEquals(12L, NumberInput.parseAsLong("12.34", 10L));
        assertEquals(10L, NumberInput.parseAsLong("invalid", 10L));
    }

    @Test
    public void testParseAsDouble() {
        assertEquals(10.0, NumberInput.parseAsDouble(null, 10.0), 0.001);
        assertEquals(10.0, NumberInput.parseAsDouble("", 10.0), 0.001);
        assertEquals(10.0, NumberInput.parseAsDouble("   ", 10.0), 0.001);
        assertEquals(123.45, NumberInput.parseAsDouble("123.45", 10.0), 0.001);
        assertEquals(10.0, NumberInput.parseAsDouble("invalid", 10.0), 0.001);
    }

    @Test
    public void testParseDoubleNastySmallDouble() {
        double result = NumberInput.parseDouble(NumberInput.NASTY_SMALL_DOUBLE);
        assertEquals(Double.MIN_VALUE, result, 0.0001);

        double normal = NumberInput.parseDouble("123.456");
        assertEquals(123.456, normal, 0.0001);
    }

    @Test
    public void testParseBigDecimal() {
        BigDecimal bdStr = NumberInput.parseBigDecimal("123.456");
        assertEquals(new BigDecimal("123.456"), bdStr);

        char[] buf = "987.654".toCharArray();
        BigDecimal bdBuf1 = NumberInput.parseBigDecimal(buf);
        assertEquals(new BigDecimal("987.654"), bdBuf1);

        BigDecimal bdBuf2 = NumberInput.parseBigDecimal(buf, 0, 3);
        assertEquals(new BigDecimal("987"), bdBuf2);
    }
}