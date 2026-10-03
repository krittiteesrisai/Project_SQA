package org.apache.commons.lang.enums;

import org.apache.commons.lang.SerializationUtils;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * In-depth test suite for {@link ValuedEnum} focusing on maximum branch/condition coverage
 * and edge cases for Defects4J Lang-64.
 */
public class ValuedEnumTest {

    // =========================================================================
    // Concrete Subclasses for Testing
    // =========================================================================

    public static final class ColorValuedEnum extends ValuedEnum {
        private static final long serialVersionUID = 1L;

        public static final int RED_VALUE = 10;
        public static final int GREEN_VALUE = 20;
        public static final int BLUE_VALUE = 30;
        public static final int ZERO_VALUE = 0;
        public static final int NEGATIVE_VALUE = -100;
        public static final int MIN_INT_VALUE = Integer.MIN_VALUE;
        public static final int MAX_INT_VALUE = Integer.MAX_VALUE;

        public static final ColorValuedEnum RED = new ColorValuedEnum("Red", RED_VALUE);
        public static final ColorValuedEnum GREEN = new ColorValuedEnum("Green", GREEN_VALUE);
        public static final ColorValuedEnum BLUE = new ColorValuedEnum("Blue", BLUE_VALUE);
        public static final ColorValuedEnum ZERO = new ColorValuedEnum("Zero", ZERO_VALUE);
        public static final ColorValuedEnum NEGATIVE = new ColorValuedEnum("Negative", NEGATIVE_VALUE);
        public static final ColorValuedEnum MIN_INT = new ColorValuedEnum("MinInt", MIN_INT_VALUE);
        public static final ColorValuedEnum MAX_INT = new ColorValuedEnum("MaxInt", MAX_INT_VALUE);

        private ColorValuedEnum(String name, int value) {
            super(name, value);
        }

        public static ColorValuedEnum getEnum(String name) {
            return (ColorValuedEnum) getEnum(ColorValuedEnum.class, name);
        }

        public static ColorValuedEnum getEnum(int value) {
            return (ColorValuedEnum) getEnum(ColorValuedEnum.class, value);
        }

        public static Map getEnumMap() {
            return getEnumMap(ColorValuedEnum.class);
        }

        public static List getEnumList() {
            return getEnumList(ColorValuedEnum.class);
        }

        public static Iterator iterator() {
            return iterator(ColorValuedEnum.class);
        }
    }

    public static final class PriorityValuedEnum extends ValuedEnum {
        private static final long serialVersionUID = 1L;

        public static final int LOW_VALUE = 10; // Same int value as ColorValuedEnum.RED_VALUE
        public static final int HIGH_VALUE = 20;

        public static final PriorityValuedEnum LOW = new PriorityValuedEnum("Low", LOW_VALUE);
        public static final PriorityValuedEnum HIGH = new PriorityValuedEnum("High", HIGH_VALUE);

        private PriorityValuedEnum(String name, int value) {
            super(name, value);
        }

        public static PriorityValuedEnum getEnum(int value) {
            return (PriorityValuedEnum) getEnum(PriorityValuedEnum.class, value);
        }
    }

    public static final class EmptyValuedEnum extends ValuedEnum {
        private static final long serialVersionUID = 1L;

        private EmptyValuedEnum(String name, int value) {
            super(name, value);
        }
    }

    // =========================================================================
    // Test Methods for getEnum(Class, int)
    // =========================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testGetEnum_NullClass_ThrowsIllegalArgumentException() {
        ValuedEnum.getEnum(null, 10);
    }

    @Test
    public void testGetEnum_FoundMatch() {
        Enum resultRed = ValuedEnum.getEnum(ColorValuedEnum.class, ColorValuedEnum.RED_VALUE);
        assertNotNull("Enum should be found", resultRed);
        assertSame("Found enum must match RED", ColorValuedEnum.RED, resultRed);

        Enum resultMin = ValuedEnum.getEnum(ColorValuedEnum.class, Integer.MIN_VALUE);
        assertSame("Found enum must match MIN_INT", ColorValuedEnum.MIN_INT, resultMin);

        Enum resultMax = ValuedEnum.getEnum(ColorValuedEnum.class, Integer.MAX_VALUE);
        assertSame("Found enum must match MAX_INT", ColorValuedEnum.MAX_INT, resultMax);
    }

    @Test
    public void testGetEnum_NotFound_ReturnsNull() {
        Enum result = ValuedEnum.getEnum(ColorValuedEnum.class, 99999);
        assertNull("Should return null for non-existent value", result);
    }

    @Test
    public void testGetEnum_EmptyEnumClass_ReturnsNull() {
        Enum result = ValuedEnum.getEnum(EmptyValuedEnum.class, 10);
        assertNull("Should return null when class has no instances", result);
    }

    // =========================================================================
    // Test Methods for getValue()
    // =========================================================================

    @Test
    public void testGetValue_CoversBoundaryAndStandardValues() {
        assertEquals(10, ColorValuedEnum.RED.getValue());
        assertEquals(0, ColorValuedEnum.ZERO.getValue());
        assertEquals(-100, ColorValuedEnum.NEGATIVE.getValue());
        assertEquals(Integer.MIN_VALUE, ColorValuedEnum.MIN_INT.getValue());
        assertEquals(Integer.MAX_VALUE, ColorValuedEnum.MAX_INT.getValue());
    }

    // =========================================================================
    // Test Methods for compareTo(Object)
    // =========================================================================

    @Test
    public void testCompareTo_SameClass_StandardOrder() {
        // Same value -> 0
        assertEquals(0, ColorValuedEnum.RED.compareTo(ColorValuedEnum.RED));

        // Less than -> negative
        assertTrue("RED (10) < GREEN (20)", ColorValuedEnum.RED.compareTo(ColorValuedEnum.GREEN) < 0);
        assertTrue("NEGATIVE (-100) < ZERO (0)", ColorValuedEnum.NEGATIVE.compareTo(ColorValuedEnum.ZERO) < 0);

        // Greater than -> positive
        assertTrue("GREEN (20) > RED (10)", ColorValuedEnum.GREEN.compareTo(ColorValuedEnum.RED) > 0);
        assertTrue("ZERO (0) > NEGATIVE (-100)", ColorValuedEnum.ZERO.compareTo(ColorValuedEnum.NEGATIVE) > 0);
    }

    @Test(expected = NullPointerException.class)
    public void testCompareTo_NullArgument_ThrowsException() {
        ColorValuedEnum.RED.compareTo(null);
    }

    @Test(expected = ClassCastException.class)
    public void testCompareTo_NonEnumObject_ThrowsClassCastException() {
        ColorValuedEnum.RED.compareTo("Not a ValuedEnum");
    }

    @Test
    public void testCompareTo_DifferentEnumSubclasses_ShouldThrowClassCastException() {
        // Even if values are identical (RED=10, LOW=10), comparing two different Enum types must fail
        try {
            ColorValuedEnum.RED.compareTo(PriorityValuedEnum.LOW);
            fail("Comparing different ValuedEnum subclasses must throw ClassCastException");
        } catch (ClassCastException expected) {
            // Expected behavior according to Comparable and Enum contract
        }
    }

    @Test
    public void testCompareTo_IntegerOverflowBoundary() {
        // MAX_VALUE vs MIN_VALUE: (MAX_VALUE - MIN_VALUE) could overflow if naive subtraction is used
        int result = ColorValuedEnum.MAX_INT.compareTo(ColorValuedEnum.MIN_INT);
        assertTrue("MAX_INT should be strictly greater than MIN_INT without overflow bug", result > 0);

        int reverseResult = ColorValuedEnum.MIN_INT.compareTo(ColorValuedEnum.MAX_INT);
        assertTrue("MIN_INT should be strictly less than MAX_INT without overflow bug", reverseResult < 0);
    }

    // =========================================================================
    // Test Methods for toString()
    // =========================================================================

    @Test
    public void testToString_FormatAndCaching() {
        String expected = "ValuedEnumTest.ColorValuedEnum[Red=10]";
        String firstCall = ColorValuedEnum.RED.toString();
        assertEquals(expected, firstCall);

        // Subsequent call triggers iToString != null cache branch
        String secondCall = ColorValuedEnum.RED.toString();
        assertSame("Cached toString string must be returned", firstCall, secondCall);
    }

    // =========================================================================
    // Test Serialization / Deserialization & Enum Identity
    // =========================================================================

    @Test
    public void testSerialization_PreservesSingletonIdentity() {
        ColorValuedEnum red = ColorValuedEnum.RED;
        byte[] serialized = SerializationUtils.serialize(red);
        ColorValuedEnum deserialized = (ColorValuedEnum) SerializationUtils.deserialize(serialized);

        assertSame("Deserialized ValuedEnum should maintain singleton instance", red, deserialized);
        assertEquals(red.getValue(), deserialized.getValue());
        assertEquals(red.getName(), deserialized.getName());
    }
}