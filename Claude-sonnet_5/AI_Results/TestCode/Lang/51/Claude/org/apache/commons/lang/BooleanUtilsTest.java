package org.apache.commons.lang;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * JUnit 4 test suite for org.apache.commons.lang.BooleanUtils (Defects4J Lang-51b).
 * ครอบคลุม boundary, null/empty, malformed input และทุก if/else/switch branch ที่วิเคราะห์ได้จาก source
 */
public class BooleanUtilsTest {

    // ---------------------------------------------------------------
    // negate(Boolean)
    // ---------------------------------------------------------------
    @Test
    public void testNegate_null() {
        assertNull(BooleanUtils.negate(null));
    }

    @Test
    public void testNegate_true() {
        assertEquals(Boolean.FALSE, BooleanUtils.negate(Boolean.TRUE));
    }

    @Test
    public void testNegate_false() {
        assertEquals(Boolean.TRUE, BooleanUtils.negate(Boolean.FALSE));
    }

    // ---------------------------------------------------------------
    // isTrue / isNotTrue
    // ---------------------------------------------------------------
    @Test
    public void testIsTrue() {
        assertTrue(BooleanUtils.isTrue(Boolean.TRUE));
        assertFalse(BooleanUtils.isTrue(Boolean.FALSE));
        assertFalse(BooleanUtils.isTrue(null));
    }

    @Test
    public void testIsNotTrue() {
        assertFalse(BooleanUtils.isNotTrue(Boolean.TRUE));
        assertTrue(BooleanUtils.isNotTrue(Boolean.FALSE));
        assertTrue(BooleanUtils.isNotTrue(null));
    }

    // ---------------------------------------------------------------
    // isFalse / isNotFalse
    // ---------------------------------------------------------------
    @Test
    public void testIsFalse() {
        assertFalse(BooleanUtils.isFalse(Boolean.TRUE));
        assertTrue(BooleanUtils.isFalse(Boolean.FALSE));
        assertFalse(BooleanUtils.isFalse(null));
    }

    @Test
    public void testIsNotFalse() {
        assertTrue(BooleanUtils.isNotFalse(Boolean.TRUE));
        assertFalse(BooleanUtils.isNotFalse(Boolean.FALSE));
        assertTrue(BooleanUtils.isNotFalse(null));
    }

    // ---------------------------------------------------------------
    // toBooleanObject(boolean)
    // ---------------------------------------------------------------
    @Test
    public void testToBooleanObject_primitive() {
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(true));
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject(false));
    }

    // ---------------------------------------------------------------
    // toBoolean(Boolean)
    // ---------------------------------------------------------------
    @Test
    public void testToBoolean_Boolean() {
        assertTrue(BooleanUtils.toBoolean(Boolean.TRUE));
        assertFalse(BooleanUtils.toBoolean(Boolean.FALSE));
        assertFalse(BooleanUtils.toBoolean((Boolean) null));
    }

    // ---------------------------------------------------------------
    // toBooleanDefaultIfNull(Boolean, boolean)
    // ---------------------------------------------------------------
    @Test
    public void testToBooleanDefaultIfNull() {
        assertTrue(BooleanUtils.toBooleanDefaultIfNull(Boolean.TRUE, false));
        assertFalse(BooleanUtils.toBooleanDefaultIfNull(Boolean.FALSE, true));
        assertTrue(BooleanUtils.toBooleanDefaultIfNull(null, true));
        assertFalse(BooleanUtils.toBooleanDefaultIfNull(null, false));
    }

    // ---------------------------------------------------------------
    // toBoolean(int)
    // ---------------------------------------------------------------
    @Test
    public void testToBoolean_int() {
        assertFalse(BooleanUtils.toBoolean(0));
        assertTrue(BooleanUtils.toBoolean(1));
        assertTrue(BooleanUtils.toBoolean(2));
        assertTrue(BooleanUtils.toBoolean(-1)); // boundary: negative non-zero
    }

    // ---------------------------------------------------------------
    // toBooleanObject(int)
    // ---------------------------------------------------------------
    @Test
    public void testToBooleanObject_int() {
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject(0));
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(1));
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(2));
    }

    // ---------------------------------------------------------------
    // toBooleanObject(Integer)
    // ---------------------------------------------------------------
    @Test
    public void testToBooleanObject_Integer() {
        assertNull(BooleanUtils.toBooleanObject((Integer) null));
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject(new Integer(0)));
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(new Integer(1)));
    }

    // ---------------------------------------------------------------
    // toBoolean(int, int, int)
    // ---------------------------------------------------------------
    @Test
    public void testToBoolean_int3_trueMatch() {
        assertTrue(BooleanUtils.toBoolean(1, 1, 0));
    }

    @Test
    public void testToBoolean_int3_falseMatch() {
        assertFalse(BooleanUtils.toBoolean(0, 1, 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToBoolean_int3_noMatch() {
        BooleanUtils.toBoolean(2, 1, 0);
    }

    // ---------------------------------------------------------------
    // toBoolean(Integer, Integer, Integer)
    // ---------------------------------------------------------------
    @Test
    public void testToBoolean_Integer3_valueNull_trueValueNull() {
        assertTrue(BooleanUtils.toBoolean(null, null, new Integer(0)));
    }

    @Test
    public void testToBoolean_Integer3_valueNull_falseValueNull() {
        assertFalse(BooleanUtils.toBoolean(null, new Integer(1), null));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToBoolean_Integer3_valueNull_bothNonNull_fallThrough() {
        // value==null, trueValue!=null, falseValue!=null -> ไม่ match ข้อใด ต้อง throw
        BooleanUtils.toBoolean(null, new Integer(1), new Integer(0));
    }

    @Test
    public void testToBoolean_Integer3_valueMatchesTrueValue() {
        assertTrue(BooleanUtils.toBoolean(new Integer(1), new Integer(1), new Integer(0)));
    }

    @Test
    public void testToBoolean_Integer3_valueMatchesFalseValue() {
        assertFalse(BooleanUtils.toBoolean(new Integer(0), new Integer(1), new Integer(0)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToBoolean_Integer3_noMatch() {
        BooleanUtils.toBoolean(new Integer(2), new Integer(1), new Integer(0));
    }

    // ---------------------------------------------------------------
    // toBooleanObject(int, int, int, int)
    // ---------------------------------------------------------------
    @Test
    public void testToBooleanObject_int4_trueMatch() {
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(0, 0, 2, 3));
    }

    @Test
    public void testToBooleanObject_int4_falseMatch() {
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject(2, 1, 2, 3));
    }

    @Test
    public void testToBooleanObject_int4_nullMatch() {
        assertNull(BooleanUtils.toBooleanObject(3, 1, 2, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToBooleanObject_int4_noMatch() {
        BooleanUtils.toBooleanObject(9, 1, 2, 3);
    }

    // ---------------------------------------------------------------
    // toBooleanObject(Integer, Integer, Integer, Integer)
    // ---------------------------------------------------------------
    @Test
    public void testToBooleanObject_Integer4_valueNull_trueValueNull() {
        assertEquals(Boolean.TRUE,
            BooleanUtils.toBooleanObject(null, null, new Integer(2), new Integer(3)));
    }

    @Test
    public void testToBooleanObject_Integer4_valueNull_falseValueNull() {
        assertEquals(Boolean.FALSE,
            BooleanUtils.toBooleanObject(null, new Integer(1), null, new Integer(3)));
    }

    @Test
    public void testToBooleanObject_Integer4_valueNull_nullValueNull() {
        assertNull(BooleanUtils.toBooleanObject(null, new Integer(1), new Integer(2), null));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToBooleanObject_Integer4_valueNull_allNonNull_fallThrough() {
        // value==null แต่ trueValue, falseValue, nullValue ไม่ null ทั้งหมด -> ตก throw
        BooleanUtils.toBooleanObject(null, new Integer(1), new Integer(2), new Integer(3));
    }

    @Test
    public void testToBooleanObject_Integer4_matchesTrueValue() {
        assertEquals(Boolean.TRUE,
            BooleanUtils.toBooleanObject(new Integer(0), new Integer(0), new Integer(2), new Integer(3)));
    }

    @Test
    public void testToBooleanObject_Integer4_matchesFalseValue() {
        assertEquals(Boolean.FALSE,
            BooleanUtils.toBooleanObject(new Integer(2), new Integer(1), new Integer(2), new Integer(3)));
    }

    @Test
    public void testToBooleanObject_Integer4_matchesNullValue() {
        assertNull(
            BooleanUtils.toBooleanObject(new Integer(3), new Integer(1), new Integer(2), new Integer(3)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToBooleanObject_Integer4_noMatch() {
        BooleanUtils.toBooleanObject(new Integer(9), new Integer(1), new Integer(2), new Integer(3));
    }

    // ---------------------------------------------------------------
    // toInteger(boolean) / toIntegerObject(boolean)
    // ---------------------------------------------------------------
    @Test
    public void testToInteger_boolean() {
        assertEquals(1, BooleanUtils.toInteger(true));
        assertEquals(0, BooleanUtils.toInteger(false));
    }

    @Test
    public void testToIntegerObject_boolean() {
        assertEquals(new Integer(1), BooleanUtils.toIntegerObject(true));
        assertEquals(new Integer(0), BooleanUtils.toIntegerObject(false));
    }

    // ---------------------------------------------------------------
    // toIntegerObject(Boolean)
    // ---------------------------------------------------------------
    @Test
    public void testToIntegerObject_Boolean() {
        assertNull(BooleanUtils.toIntegerObject((Boolean) null));
        assertEquals(new Integer(1), BooleanUtils.toIntegerObject(Boolean.TRUE));
        assertEquals(new Integer(0), BooleanUtils.toIntegerObject(Boolean.FALSE));
    }

    // ---------------------------------------------------------------
    // toInteger(boolean, int, int)
    // ---------------------------------------------------------------
    @Test
    public void testToInteger_boolean_int_int() {
        assertEquals(1, BooleanUtils.toInteger(true, 1, 0));
        assertEquals(0, BooleanUtils.toInteger(false, 1, 0));
    }

    // ---------------------------------------------------------------
    // toInteger(Boolean, int, int, int)
    // ---------------------------------------------------------------
    @Test
    public void testToInteger_Boolean_int_int_int() {
        assertEquals(1, BooleanUtils.toInteger(Boolean.TRUE, 1, 0, 2));
        assertEquals(0, BooleanUtils.toInteger(Boolean.FALSE, 1, 0, 2));
        assertEquals(2, BooleanUtils.toInteger(null, 1, 0, 2));
    }

    // ---------------------------------------------------------------
    // toIntegerObject(boolean, Integer, Integer)
    // ---------------------------------------------------------------
    @Test
    public void testToIntegerObject_boolean_Integer_Integer() {
        assertEquals(new Integer(1), BooleanUtils.toIntegerObject(true, new Integer(1), new Integer(0)));
        assertEquals(new Integer(0), BooleanUtils.toIntegerObject(false, new Integer(1), new Integer(0)));
    }

    // ---------------------------------------------------------------
    // toIntegerObject(Boolean, Integer, Integer, Integer)
    // ---------------------------------------------------------------
    @Test
    public void testToIntegerObject_Boolean_Integer_Integer_Integer() {
        assertEquals(new Integer(1),
            BooleanUtils.toIntegerObject(Boolean.TRUE, new Integer(1), new Integer(0), new Integer(2)));
        assertEquals(new Integer(0),
            BooleanUtils.toIntegerObject(Boolean.FALSE, new Integer(1), new Integer(0), new Integer(2)));
        assertEquals(new Integer(2),
            BooleanUtils.toIntegerObject((Boolean) null, new Integer(1), new Integer(0), new Integer(2)));
    }

    // ---------------------------------------------------------------
    // toBooleanObject(String) -- ทุกคำที่รองรับ + case-insensitive + no match
    // ---------------------------------------------------------------
    @Test
    public void testToBooleanObject_String_true() {
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("true"));
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("TRUE"));
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("TrUe"));
    }

    @Test
    public void testToBooleanObject_String_false() {
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("false"));
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("FALSE"));
    }

    @Test
    public void testToBooleanObject_String_onOff() {
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("on"));
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("ON"));
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("off"));
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("oFf"));
    }

    @Test
    public void testToBooleanObject_String_yesNo() {
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("yes"));
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("no"));
    }

    @Test
    public void testToBooleanObject_String_noMatch() {
        assertNull(BooleanUtils.toBooleanObject("blue"));
        assertNull(BooleanUtils.toBooleanObject((String) null)); // null ไม่ match คำใดเลย -> null
        assertNull(BooleanUtils.toBooleanObject(""));
    }

    // ---------------------------------------------------------------
    // toBooleanObject(String, String, String, String)
    // ---------------------------------------------------------------
    @Test
    public void testToBooleanObject_String4_strNull_trueStringNull() {
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(null, null, "false", "null"));
    }

    @Test
    public void testToBooleanObject_String4_strNull_falseStringNull() {
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject(null, "true", null, "null"));
    }

    @Test
    public void testToBooleanObject_String4_strNull_nullStringNull() {
        assertNull(BooleanUtils.toBooleanObject(null, "true", "false", null));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToBooleanObject_String4_strNull_allNonNull_fallThrough() {
        BooleanUtils.toBooleanObject(null, "true", "false", "nullStr");
    }

    @Test
    public void testToBooleanObject_String4_matchesTrueString() {
        assertEquals(Boolean.TRUE,
            BooleanUtils.toBooleanObject("true", "true", "false", "null"));
    }

    @Test
    public void testToBooleanObject_String4_matchesFalseString() {
        assertEquals(Boolean.FALSE,
            BooleanUtils.toBooleanObject("false", "true", "false", "null"));
    }

    @Test
    public void testToBooleanObject_String4_matchesNullString() {
        assertNull(BooleanUtils.toBooleanObject("null", "true", "false", "null"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToBooleanObject_String4_noMatch() {
        BooleanUtils.toBooleanObject("other", "true", "false", "null");
    }

    // ---------------------------------------------------------------
    // toBoolean(String) -- optimized switch logic; ครอบคลุมทุก length (0,1,2,3,4,other)
    // ---------------------------------------------------------------
    @Test
    public void testToBoolean_String_null() {
        assertFalse(BooleanUtils.toBoolean((String) null));
    }

    @Test
    public void testToBoolean_String_identityTrueLiteral() {
        // "str == true" -- string literal interning ทำให้ branch นี้ trigger ได้
        assertTrue(BooleanUtils.toBoolean("true"));
    }

    @Test
    public void testToBoolean_String_trueNotInterned() {
        // สร้าง String ใหม่ที่ไม่ใช่ literal เพื่อข้าม identity check แล้วไปตก switch case 4
        String s = new String("true");
        assertTrue(BooleanUtils.toBoolean(s));
    }

    @Test
    public void testToBoolean_String_length0() {
        assertFalse(BooleanUtils.toBoolean(""));
    }

    @Test
    public void testToBoolean_String_length1() {
        assertFalse(BooleanUtils.toBoolean("o"));
    }

    @Test
    public void testToBoolean_String_length2_on() {
        assertTrue(BooleanUtils.toBoolean("on"));
        assertTrue(BooleanUtils.toBoolean("ON"));
        assertTrue(BooleanUtils.toBoolean("On"));
    }

    @Test
    public void testToBoolean_String_length2_noMatch() {
        assertFalse(BooleanUtils.toBoolean("no"));
        assertFalse(BooleanUtils.toBoolean("xx"));
    }

    @Test
    public void testToBoolean_String_length3_yes() {
        assertTrue(BooleanUtils.toBoolean("yes"));
        assertTrue(BooleanUtils.toBoolean("YES"));
        assertTrue(BooleanUtils.toBoolean("Yes"));
    }

    @Test
    public void testToBoolean_String_length3_Y_noMatchReturnsFalseDirectly() {
        // ch=='Y' แต่ charAt(2) ไม่ match 's'/'S' -> return false โดยตรง (ไม่ fallthrough)
        assertFalse(BooleanUtils.toBoolean("Yet"));
    }

    @Test
    public void testToBoolean_String_length3_shortCircuitAvoidsException() {
        // ch0=='t' ไม่ match 'y'/'Y' -> fallthrough ไป case4 แต่ short-circuit && หยุดก่อนถึง charAt(3)
        assertFalse(BooleanUtils.toBoolean("tab"));
    }

    @Test
    public void testToBoolean_String_length3_noMatchFallsThroughSafely() {
        // ch0 ไม่ใช่ y/Y/t/T เลย -> fallthrough case4 ไม่ตรง if ใดเลย -> return false ปกติ
        assertFalse(BooleanUtils.toBoolean("abc"));
    }

    /**
     * FAULT-DETECTING TEST:
     * เนื่องจาก case 3 ไม่มี break เมื่อ ch0=='t' (ไม่ตรง y/Y) จะ fallthrough ไป case 4
     * ซึ่งใน case 4 เข้า if(ch=='t') แล้วพยายามเข้าถึง str.charAt(3) ที่ไม่มีอยู่จริง (length==3)
     * ทำให้เกิด StringIndexOutOfBoundsException ซึ่งไม่ตรงกับ Javadoc ที่ระบุว่าควร return false
     * เมื่อไม่ match -- นี่คือ fault ที่ทดสอบจับได้จาก source ที่ให้มา (ไม่ได้เดา)
     */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testToBoolean_String_fallthroughBug_lowercase_t() {
        BooleanUtils.toBoolean("tru");
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testToBoolean_String_fallthroughBug_uppercase_T() {
        BooleanUtils.toBoolean("TRU");
    }

    @Test
    public void testToBoolean_String_length4_true() {
        assertTrue(BooleanUtils.toBoolean("true"));
        assertTrue(BooleanUtils.toBoolean("TRUE"));
        assertTrue(BooleanUtils.toBoolean("True"));
    }

    @Test
    public void testToBoolean_String_length4_noMatch() {
        assertFalse(BooleanUtils.toBoolean("fals")); // length4 แต่ ch0 ไม่ใช่ t/T
        assertFalse(BooleanUtils.toBoolean("xxxx"));
    }

    @Test
    public void testToBoolean_String_lengthOther() {
        assertFalse(BooleanUtils.toBoolean("random-string"));
        assertFalse(BooleanUtils.toBoolean("false")); // length 5 -> default false (ไม่ได้ handle ใน switch)
    }

    // ---------------------------------------------------------------
    // toBoolean(String, String, String)
    // ---------------------------------------------------------------
    @Test
    public void testToBoolean_String3_strNull_trueStringNull() {
        assertTrue(BooleanUtils.toBoolean(null, null, "false"));
    }

    @Test
    public void testToBoolean_String3_strNull_falseStringNull() {
        assertFalse(BooleanUtils.toBoolean(null, "true", null));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToBoolean_String3_strNull_bothNonNull_fallThrough() {
        BooleanUtils.toBoolean(null, "true", "false");
    }

    @Test
    public void testToBoolean_String3_matchesTrueString() {
        assertTrue(BooleanUtils.toBoolean("true", "true", "false"));
    }

    @Test
    public void testToBoolean_String3_matchesFalseString() {
        assertFalse(BooleanUtils.toBoolean("false", "true", "false"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToBoolean_String3_noMatch() {
        BooleanUtils.toBoolean("other", "true", "false");
    }

    // ---------------------------------------------------------------
    // toStringTrueFalse / toStringOnOff / toStringYesNo (Boolean)
    // ---------------------------------------------------------------
    @Test
    public void testToStringTrueFalse_Boolean() {
        assertEquals("true", BooleanUtils.toStringTrueFalse(Boolean.TRUE));
        assertEquals("false", BooleanUtils.toStringTrueFalse(Boolean.FALSE));
        assertNull(BooleanUtils.toStringTrueFalse((Boolean) null));
    }

    @Test
    public void testToStringOnOff_Boolean() {
        assertEquals("on", BooleanUtils.toStringOnOff(Boolean.TRUE));
        assertEquals("off", BooleanUtils.toStringOnOff(Boolean.FALSE));
        assertNull(BooleanUtils.toStringOnOff((Boolean) null));
    }

    @Test
    public void testToStringYesNo_Boolean() {
        assertEquals("yes", BooleanUtils.toStringYesNo(Boolean.TRUE));
        assertEquals("no", BooleanUtils.toStringYesNo(Boolean.FALSE));
        assertNull(BooleanUtils.toStringYesNo((Boolean) null));
    }

    // ---------------------------------------------------------------
    // toString(Boolean, String, String, String)
    // ---------------------------------------------------------------
    @Test
    public void testToString_Boolean3Strings() {
        assertEquals("t", BooleanUtils.toString(Boolean.TRUE, "t", "f", "n"));
        assertEquals("f", BooleanUtils.toString(Boolean.FALSE, "t", "f", "n"));
        assertEquals("n", BooleanUtils.toString((Boolean) null, "t", "f", "n"));
    }

    // ---------------------------------------------------------------
    // toStringTrueFalse / toStringOnOff / toStringYesNo (boolean)
    // ---------------------------------------------------------------
    @Test
    public void testToStringTrueFalse_boolean() {
        assertEquals("true", BooleanUtils.toStringTrueFalse(true));
        assertEquals("false", BooleanUtils.toStringTrueFalse(false));
    }

    @Test
    public void testToStringOnOff_boolean() {
        assertEquals("on", BooleanUtils.toStringOnOff(true));
        assertEquals("off", BooleanUtils.toStringOnOff(false));
    }

    @Test
    public void testToStringYesNo_boolean() {
        assertEquals("yes", BooleanUtils.toStringYesNo(true));
        assertEquals("no", BooleanUtils.toStringYesNo(false));
    }

    // ---------------------------------------------------------------
    // toString(boolean, String, String)
    // ---------------------------------------------------------------
    @Test
    public void testToString_boolean2Strings() {
        assertEquals("t", BooleanUtils.toString(true, "t", "f"));
        assertEquals("f", BooleanUtils.toString(false, "t", "f"));
    }

    // ---------------------------------------------------------------
    // xor(boolean[])
    // ---------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testXor_booleanArray_null() {
        BooleanUtils.xor((boolean[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testXor_booleanArray_empty() {
        BooleanUtils.xor(new boolean[0]);
    }

    @Test
    public void testXor_booleanArray_singleTrue() {
        assertTrue(BooleanUtils.xor(new boolean[] { true }));
    }

    @Test
    public void testXor_booleanArray_trueFalse() {
        assertTrue(BooleanUtils.xor(new boolean[] { true, false }));
    }

    @Test
    public void testXor_booleanArray_bothTrue() {
        assertFalse(BooleanUtils.xor(new boolean[] { true, true }));
    }

    @Test
    public void testXor_booleanArray_bothFalse() {
        assertFalse(BooleanUtils.xor(new boolean[] { false, false }));
    }

    @Test
    public void testXor_booleanArray_multipleTrue_earlyReturnFalse() {
        // trueCount เพิ่มจาก item แรก, item ที่สามทำให้ trueCount>=1 -> return false ทันที (ไม่ครบลูป)
        assertFalse(BooleanUtils.xor(new boolean[] { true, false, true }));
    }

    // ---------------------------------------------------------------
    // xor(Boolean[])
    // ---------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testXor_BooleanArray_null() {
        BooleanUtils.xor((Boolean[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testXor_BooleanArray_empty() {
        BooleanUtils.xor(new Boolean[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testXor_BooleanArray_containsNull() {
        // ArrayUtils.toPrimitive ควรโยน NullPointerException เมื่อมี null element
        // ซึ่งถูก catch แล้วแปลงเป็น IllegalArgumentException ตาม source ที่ให้มา
        BooleanUtils.xor(new Boolean[] { Boolean.TRUE, null });
    }

    @Test
    public void testXor_BooleanArray_trueFalse() {
        assertEquals(Boolean.TRUE, BooleanUtils.xor(new Boolean[] { Boolean.TRUE, Boolean.FALSE }));
    }

    @Test
    public void testXor_BooleanArray_bothTrue() {
        assertEquals(Boolean.FALSE, BooleanUtils.xor(new Boolean[] { Boolean.TRUE, Boolean.TRUE }));
    }

    @Test
    public void testXor_BooleanArray_bothFalse() {
        assertEquals(Boolean.FALSE, BooleanUtils.xor(new Boolean[] { Boolean.FALSE, Boolean.FALSE }));
    }
}
