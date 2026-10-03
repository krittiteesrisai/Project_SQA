package org.apache.commons.lang;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Comprehensive JUnit 4 test cases for {@link BooleanUtils}.
 */
public class BooleanUtilsTest {

    // -----------------------------------------------------------------------
    // Constructor
    // -----------------------------------------------------------------------
    @Test
    public void testConstructor() {
        assertNotNull(new BooleanUtils());
    }

    // -----------------------------------------------------------------------
    // Boolean Logic Operations
    // -----------------------------------------------------------------------
    @Test
    public void testNegate() {
        assertNull(BooleanUtils.negate(null));
        assertEquals(Boolean.FALSE, BooleanUtils.negate(Boolean.TRUE));
        assertEquals(Boolean.TRUE, BooleanUtils.negate(Boolean.FALSE));
    }

    @Test
    public void testIsTrue() {
        assertFalse(BooleanUtils.isTrue(null));
        assertTrue(BooleanUtils.isTrue(Boolean.TRUE));
        assertFalse(BooleanUtils.isTrue(Boolean.FALSE));
    }

    @Test
    public void testIsNotTrue() {
        assertTrue(BooleanUtils.isNotTrue(null));
        assertFalse(BooleanUtils.isNotTrue(Boolean.TRUE));
        assertTrue(BooleanUtils.isNotTrue(Boolean.FALSE));
    }

    @Test
    public void testIsFalse() {
        assertFalse(BooleanUtils.isFalse(null));
        assertFalse(BooleanUtils.isFalse(Boolean.TRUE));
        assertTrue(BooleanUtils.isFalse(Boolean.FALSE));
    }

    @Test
    public void testIsNotFalse() {
        assertTrue(BooleanUtils.isNotFalse(null));
        assertTrue(BooleanUtils.isNotFalse(Boolean.TRUE));
        assertFalse(BooleanUtils.isNotFalse(Boolean.FALSE));
    }

    @Test
    public void testToBooleanObject_boolean() {
        assertSame(Boolean.TRUE, BooleanUtils.toBooleanObject(true));
        assertSame(Boolean.FALSE, BooleanUtils.toBooleanObject(false));
    }

    @Test
    public void testToBoolean_Boolean() {
        assertFalse(BooleanUtils.toBoolean((Boolean) null));
        assertTrue(BooleanUtils.toBoolean(Boolean.TRUE));
        assertFalse(BooleanUtils.toBoolean(Boolean.FALSE));
    }

    @Test
    public void testToBooleanDefaultIfNull() {
        assertTrue(BooleanUtils.toBooleanDefaultIfNull(null, true));
        assertFalse(BooleanUtils.toBooleanDefaultIfNull(null, false));
        assertTrue(BooleanUtils.toBooleanDefaultIfNull(Boolean.TRUE, false));
        assertFalse(BooleanUtils.toBooleanDefaultIfNull(Boolean.FALSE, true));
    }

    // -----------------------------------------------------------------------
    // Integer to Boolean Conversions
    // -----------------------------------------------------------------------
    @Test
    public void testToBoolean_int() {
        assertFalse(BooleanUtils.toBoolean(0));
        assertTrue(BooleanUtils.toBoolean(1));
        assertTrue(BooleanUtils.toBoolean(-1));
        assertTrue(BooleanUtils.toBoolean(Integer.MAX_VALUE));
        assertTrue(BooleanUtils.toBoolean(Integer.MIN_VALUE));
    }

    @Test
    public void testToBooleanObject_int() {
        assertSame(Boolean.FALSE, BooleanUtils.toBooleanObject(0));
        assertSame(Boolean.TRUE, BooleanUtils.toBooleanObject(1));
        assertSame(Boolean.TRUE, BooleanUtils.toBooleanObject(-1));
    }

    @Test
    public void testToBooleanObject_Integer() {
        assertNull(BooleanUtils.toBooleanObject((Integer) null));
        assertSame(Boolean.FALSE, BooleanUtils.toBooleanObject(new Integer(0)));
        assertSame(Boolean.TRUE, BooleanUtils.toBooleanObject(new Integer(1)));
        assertSame(Boolean.TRUE, BooleanUtils.toBooleanObject(new Integer(-1)));
    }

    @Test
    public void testToBoolean_int_int_int() {
        assertTrue(BooleanUtils.toBoolean(1, 1, 2));
        assertFalse(BooleanUtils.toBoolean(2, 1, 2));

        try {
            BooleanUtils.toBoolean(3, 1, 2);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }

    @Test
    public void testToBoolean_Integer_Integer_Integer() {
        Integer val1 = new Integer(1);
        Integer val2 = new Integer(2);

        // value == null branch
        assertTrue(BooleanUtils.toBoolean(null, null, val2));
        assertFalse(BooleanUtils.toBoolean(null, val1, null));
        try {
            BooleanUtils.toBoolean(null, val1, val2);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            // expected
        }

        // value != null branch
        assertTrue(BooleanUtils.toBoolean(val1, val1, val2));
        assertFalse(BooleanUtils.toBoolean(val2, val1, val2));
        try {
            BooleanUtils.toBoolean(new Integer(3), val1, val2);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }

    @Test
    public void testToBooleanObject_int_int_int_int() {
        assertSame(Boolean.TRUE, BooleanUtils.toBooleanObject(1, 1, 2, 3));
        assertSame(Boolean.FALSE, BooleanUtils.toBooleanObject(2, 1, 2, 3));
        assertNull(BooleanUtils.toBooleanObject(3, 1, 2, 3));

        try {
            BooleanUtils.toBooleanObject(4, 1, 2, 3);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }

    @Test
    public void testToBooleanObject_Integer_Integer_Integer_Integer() {
        Integer val1 = new Integer(1);
        Integer val2 = new Integer(2);
        Integer val3 = new Integer(3);

        // value == null branch
        assertSame(Boolean.TRUE, BooleanUtils.toBooleanObject(null, null, val2, val3));
        assertSame(Boolean.FALSE, BooleanUtils.toBooleanObject(null, val1, null, val3));
        assertNull(BooleanUtils.toBooleanObject(null, val1, val2, null));
        try {
            BooleanUtils.toBooleanObject(null, val1, val2, val3);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            // expected
        }

        // value != null branch
        assertSame(Boolean.TRUE, BooleanUtils.toBooleanObject(val1, val1, val2, val3));
        assertSame(Boolean.FALSE, BooleanUtils.toBooleanObject(val2, val1, val2, val3));
        assertNull(BooleanUtils.toBooleanObject(val3, val1, val2, val3));
        try {
            BooleanUtils.toBooleanObject(new Integer(4), val1, val2, val3);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }

    // -----------------------------------------------------------------------
    // Boolean to Integer Conversions
    // -----------------------------------------------------------------------
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

    @Test
    public void testToIntegerObject_Boolean() {
        assertNull(BooleanUtils.toIntegerObject((Boolean) null));
        assertEquals(new Integer(1), BooleanUtils.toIntegerObject(Boolean.TRUE));
        assertEquals(new Integer(0), BooleanUtils.toIntegerObject(Boolean.FALSE));
    }

    @Test
    public void testToInteger_boolean_int_int() {
        assertEquals(10, BooleanUtils.toInteger(true, 10, 20));
        assertEquals(20, BooleanUtils.toInteger(false, 10, 20));
    }

    @Test
    public void testToInteger_Boolean_int_int_int() {
        assertEquals(30, BooleanUtils.toInteger(null, 10, 20, 30));
        assertEquals(10, BooleanUtils.toInteger(Boolean.TRUE, 10, 20, 30));
        assertEquals(20, BooleanUtils.toInteger(Boolean.FALSE, 10, 20, 30));
    }

    @Test
    public void testToIntegerObject_boolean_Integer_Integer() {
        Integer trueVal = new Integer(10);
        Integer falseVal = new Integer(20);
        assertEquals(trueVal, BooleanUtils.toIntegerObject(true, trueVal, falseVal));
        assertEquals(falseVal, BooleanUtils.toIntegerObject(false, trueVal, falseVal));
    }

    @Test
    public void testToIntegerObject_Boolean_Integer_Integer_Integer() {
        Integer trueVal = new Integer(10);
        Integer falseVal = new Integer(20);
        Integer nullVal = new Integer(30);

        assertEquals(nullVal, BooleanUtils.toIntegerObject(null, trueVal, falseVal, nullVal));
        assertEquals(trueVal, BooleanUtils.toIntegerObject(Boolean.TRUE, trueVal, falseVal, nullVal));
        assertEquals(falseVal, BooleanUtils.toIntegerObject(Boolean.FALSE, trueVal, falseVal, nullVal));
    }

    // -----------------------------------------------------------------------
    // String to Boolean Conversions
    // -----------------------------------------------------------------------
    @Test
    public void testToBooleanObject_String() {
        assertNull(BooleanUtils.toBooleanObject((String) null));
        assertNull(BooleanUtils.toBooleanObject(""));
        assertNull(BooleanUtils.toBooleanObject("invalid"));

        assertSame(Boolean.TRUE, BooleanUtils.toBooleanObject("true"));
        assertSame(Boolean.TRUE, BooleanUtils.toBooleanObject("TRUE"));
        assertSame(Boolean.TRUE, BooleanUtils.toBooleanObject("TrUe"));

        assertSame(Boolean.FALSE, BooleanUtils.toBooleanObject("false"));
        assertSame(Boolean.FALSE, BooleanUtils.toBooleanObject("FALSE"));
        assertSame(Boolean.FALSE, BooleanUtils.toBooleanObject("FaLsE"));

        assertSame(Boolean.TRUE, BooleanUtils.toBooleanObject("on"));
        assertSame(Boolean.TRUE, BooleanUtils.toBooleanObject("ON"));
        assertSame(Boolean.TRUE, BooleanUtils.toBooleanObject("oN"));

        assertSame(Boolean.FALSE, BooleanUtils.toBooleanObject("off"));
        assertSame(Boolean.FALSE, BooleanUtils.toBooleanObject("OFF"));
        assertSame(Boolean.FALSE, BooleanUtils.toBooleanObject("oFf"));

        assertSame(Boolean.TRUE, BooleanUtils.toBooleanObject("yes"));
        assertSame(Boolean.TRUE, BooleanUtils.toBooleanObject("YES"));
        assertSame(Boolean.TRUE, BooleanUtils.toBooleanObject("yEs"));

        assertSame(Boolean.FALSE, BooleanUtils.toBooleanObject("no"));
        assertSame(Boolean.FALSE, BooleanUtils.toBooleanObject("NO"));
        assertSame(Boolean.FALSE, BooleanUtils.toBooleanObject("nO"));
    }

    @Test
    public void testToBooleanObject_String_String_String_String() {
        // str == null branch
        assertSame(Boolean.TRUE, BooleanUtils.toBooleanObject(null, null, "false", "null"));
        assertSame(Boolean.FALSE, BooleanUtils.toBooleanObject(null, "true", null, "null"));
        assertNull(BooleanUtils.toBooleanObject(null, "true", "false", null));
        try {
            BooleanUtils.toBooleanObject(null, "true", "false", "null");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            // expected
        }

        // str != null branch
        assertSame(Boolean.TRUE, BooleanUtils.toBooleanObject("T", "T", "F", "N"));
        assertSame(Boolean.FALSE, BooleanUtils.toBooleanObject("F", "T", "F", "N"));
        assertNull(BooleanUtils.toBooleanObject("N", "T", "F", "N"));
        try {
            BooleanUtils.toBooleanObject("X", "T", "F", "N");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }

    @Test
    public void testToBoolean_String() {
        // Interned string check
        assertTrue(BooleanUtils.toBoolean("true"));

        // Null and length mismatch edge cases
        assertFalse(BooleanUtils.toBoolean((String) null));
        assertFalse(BooleanUtils.toBoolean(""));
        assertFalse(BooleanUtils.toBoolean("a"));
        assertFalse(BooleanUtils.toBoolean("k"));

        // Length 2: on / ON / oN / On / invalid
        assertTrue(BooleanUtils.toBoolean("on"));
        assertTrue(BooleanUtils.toBoolean("ON"));
        assertTrue(BooleanUtils.toBoolean("oN"));
        assertTrue(BooleanUtils.toBoolean("On"));
        assertFalse(BooleanUtils.toBoolean("ox"));
        assertFalse(BooleanUtils.toBoolean("no"));

        // Length 3: yes / YES / combinations / invalid
        assertTrue(BooleanUtils.toBoolean("yes"));
        assertTrue(BooleanUtils.toBoolean("YES"));
        assertTrue(BooleanUtils.toBoolean("yEs"));
        assertTrue(BooleanUtils.toBoolean("YeS"));
        assertTrue(BooleanUtils.toBoolean("yeS"));
        assertTrue(BooleanUtils.toBoolean("YEs"));
        assertTrue(BooleanUtils.toBoolean("Yes"));
        assertTrue(BooleanUtils.toBoolean("yES"));
        assertFalse(BooleanUtils.toBoolean("yet"));
        assertFalse(BooleanUtils.toBoolean("YET"));
        assertFalse(BooleanUtils.toBoolean("foo"));
        assertFalse(BooleanUtils.toBoolean("tru")); // Length 3 boundary check

        // Length 4: true / TRUE / combinations / invalid
        assertTrue(BooleanUtils.toBoolean(new String("true")));
        assertTrue(BooleanUtils.toBoolean("TRUE"));
        assertTrue(BooleanUtils.toBoolean("True"));
        assertTrue(BooleanUtils.toBoolean("tRuE"));
        assertTrue(BooleanUtils.toBoolean("TRUe"));
        assertTrue(BooleanUtils.toBoolean("trUE"));
        assertTrue(BooleanUtils.toBoolean("TRue"));
        assertFalse(BooleanUtils.toBoolean("tree"));
        assertFalse(BooleanUtils.toBoolean("TREE"));
        assertFalse(BooleanUtils.toBoolean("talk"));
        assertFalse(BooleanUtils.toBoolean("fals"));
        assertFalse(BooleanUtils.toBoolean("abcd"));

        // Length > 4
        assertFalse(BooleanUtils.toBoolean("false"));
        assertFalse(BooleanUtils.toBoolean("trues"));
        assertFalse(BooleanUtils.toBoolean("longstringnotboolean"));
    }

    @Test
    public void testToBoolean_String_String_String() {
        // str == null branch
        assertTrue(BooleanUtils.toBoolean(null, null, "false"));
        assertFalse(BooleanUtils.toBoolean(null, "true", null));
        try {
            BooleanUtils.toBoolean(null, "true", "false");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            // expected
        }

        // str != null branch
        assertTrue(BooleanUtils.toBoolean("true", "true", "false"));
        assertFalse(BooleanUtils.toBoolean("false", "true", "false"));
        try {
            BooleanUtils.toBoolean("invalid", "true", "false");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }

    // -----------------------------------------------------------------------
    // Boolean to String Conversions
    // -----------------------------------------------------------------------
    @Test
    public void testToStringTrueFalse_Boolean() {
        assertNull(BooleanUtils.toStringTrueFalse(null));
        assertEquals("true", BooleanUtils.toStringTrueFalse(Boolean.TRUE));
        assertEquals("false", BooleanUtils.toStringTrueFalse(Boolean.FALSE));
    }

    @Test
    public void testToStringOnOff_Boolean() {
        assertNull(BooleanUtils.toStringOnOff(null));
        assertEquals("on", BooleanUtils.toStringOnOff(Boolean.TRUE));
        assertEquals("off", BooleanUtils.toStringOnOff(Boolean.FALSE));
    }

    @Test
    public void testToStringYesNo_Boolean() {
        assertNull(BooleanUtils.toStringYesNo(null));
        assertEquals("yes", BooleanUtils.toStringYesNo(Boolean.TRUE));
        assertEquals("no", BooleanUtils.toStringYesNo(Boolean.FALSE));
    }

    @Test
    public void testToString_Boolean_String_String_String() {
        assertEquals("nullValue", BooleanUtils.toString(null, "trueValue", "falseValue", "nullValue"));
        assertEquals("trueValue", BooleanUtils.toString(Boolean.TRUE, "trueValue", "falseValue", "nullValue"));
        assertEquals("falseValue", BooleanUtils.toString(Boolean.FALSE, "trueValue", "falseValue", "nullValue"));
    }

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

    @Test
    public void testToString_boolean_String_String() {
        assertEquals("trueValue", BooleanUtils.toString(true, "trueValue", "falseValue"));
        assertEquals("falseValue", BooleanUtils.toString(false, "trueValue", "falseValue"));
    }

    // -----------------------------------------------------------------------
    // XOR Operations
    // -----------------------------------------------------------------------
    @Test
    public void testXor_primitiveArray() {
        // Exception branches
        try {
            BooleanUtils.xor((boolean[]) null);
            fail("Expected IllegalArgumentException for null array");
        } catch (IllegalArgumentException ex) {
            // expected
        }

        try {
            BooleanUtils.xor(new boolean[0]);
            fail("Expected IllegalArgumentException for empty array");
        } catch (IllegalArgumentException ex) {
            // expected
        }

        // Evaluation branches
        assertTrue(BooleanUtils.xor(new boolean[] { true }));
        assertFalse(BooleanUtils.xor(new boolean[] { false }));
        assertTrue(BooleanUtils.xor(new boolean[] { true, false }));
        assertTrue(BooleanUtils.xor(new boolean[] { false, true }));
        assertTrue(BooleanUtils.xor(new boolean[] { false, false, true, false }));

        // Multiple true branches (early return false)
        assertFalse(BooleanUtils.xor(new boolean[] { true, true }));
        assertFalse(BooleanUtils.xor(new boolean[] { true, false, true }));
        assertFalse(BooleanUtils.xor(new boolean[] { false, true, true, false }));
        assertFalse(BooleanUtils.xor(new boolean[] { false, false, false }));
    }

    @Test
    public void testXor_objectArray() {
        // Exception branches
        try {
            BooleanUtils.xor((Boolean[]) null);
            fail("Expected IllegalArgumentException for null array");
        } catch (IllegalArgumentException ex) {
            // expected
        }

        try {
            BooleanUtils.xor(new Boolean[0]);
            fail("Expected IllegalArgumentException for empty array");
        } catch (IllegalArgumentException ex) {
            // expected
        }

        try {
            BooleanUtils.xor(new Boolean[] { Boolean.TRUE, null });
            fail("Expected IllegalArgumentException for array with null element");
        } catch (IllegalArgumentException ex) {
            // expected
        }

        // Evaluation branches
        assertEquals(Boolean.TRUE, BooleanUtils.xor(new Boolean[] { Boolean.TRUE }));
        assertEquals(Boolean.FALSE, BooleanUtils.xor(new Boolean[] { Boolean.FALSE }));
        assertEquals(Boolean.TRUE, BooleanUtils.xor(new Boolean[] { Boolean.TRUE, Boolean.FALSE }));
        assertEquals(Boolean.TRUE, BooleanUtils.xor(new Boolean[] { Boolean.FALSE, Boolean.TRUE }));
        assertEquals(Boolean.FALSE, BooleanUtils.xor(new Boolean[] { Boolean.TRUE, Boolean.TRUE }));
        assertEquals(Boolean.FALSE, BooleanUtils.xor(new Boolean[] { Boolean.FALSE, Boolean.FALSE }));
    }
}