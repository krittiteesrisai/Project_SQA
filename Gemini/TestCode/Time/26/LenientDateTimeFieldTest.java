package org.joda.time.field;

import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Test cases for LenientDateTimeField focusing on branch coverage and edge cases.
 */
public class LenientDateTimeFieldTest {

    private DateTimeZone originalDefaultZone;

    @Before
    public void setUp() {
        originalDefaultZone = DateTimeZone.getDefault();
        DateTimeZone.setDefault(DateTimeZone.UTC);
    }

    @After
    public void tearDown() {
        DateTimeZone.setDefault(originalDefaultZone);
    }

    // -----------------------------------------------------------------------
    // Branch Coverage for getInstance()
    // -----------------------------------------------------------------------

    @Test
    public void testGetInstance_NullField() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField result = LenientDateTimeField.getInstance(null, chrono);
        assertNull("getInstance with null field should return null", result);
    }

    @Test
    public void testGetInstance_StrictDateTimeField() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField strictField = StrictDateTimeField.getInstance(chrono.hourOfDay());
        
        assertNotNull(strictField);
        assertTrue(strictField instanceof StrictDateTimeField);
        assertFalse(strictField.isLenient());

        DateTimeField lenientField = LenientDateTimeField.getInstance(strictField, chrono);
        assertNotNull(lenientField);
        assertTrue(lenientField.isLenient());
        assertEquals(DateTimeFieldType.hourOfDay(), lenientField.getType());
    }

    @Test
    public void testGetInstance_AlreadyLenientField() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField rawField = chrono.monthOfYear();
        DateTimeField lenientField1 = LenientDateTimeField.getInstance(rawField, chrono);

        // Call getInstance again with already lenient field
        DateTimeField lenientField2 = LenientDateTimeField.getInstance(lenientField1, chrono);
        
        assertSame("Should return the exact same instance if already lenient", lenientField1, lenientField2);
        assertTrue(lenientField2.isLenient());
    }

    @Test
    public void testGetInstance_StandardField() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField standardField = chrono.dayOfMonth();
        
        DateTimeField lenientField = LenientDateTimeField.getInstance(standardField, chrono);
        assertNotNull(lenientField);
        assertTrue(lenientField instanceof LenientDateTimeField);
        assertTrue(lenientField.isLenient());
        assertEquals(standardField.getType(), lenientField.getType());
    }

    // -----------------------------------------------------------------------
    // Tests for isLenient()
    // -----------------------------------------------------------------------

    @Test
    public void testIsLenient_ReturnsTrue() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField lenientField = LenientDateTimeField.getInstance(chrono.minuteOfHour(), chrono);
        assertTrue(lenientField.isLenient());
    }

    // -----------------------------------------------------------------------
    // Tests for set(long instant, int value) - In bounds & Lenient logic
    // -----------------------------------------------------------------------

    @Test
    public void testSet_WithinBounds() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField lenientField = LenientDateTimeField.getInstance(chrono.monthOfYear(), chrono);

        // 2023-01-15T00:00:00Z (instant = 1673740800000L)
        long instant = 1673740800000L;
        assertEquals(1, lenientField.get(instant)); // January

        // Set to month 6 (June)
        long result = lenientField.set(instant, 6);
        assertEquals(6, chrono.monthOfYear().get(result));
        assertEquals(2023, chrono.year().get(result));
        assertEquals(15, chrono.dayOfMonth().get(result));
    }

    @Test
    public void testSet_LenientMonthOverflow() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField lenientField = LenientDateTimeField.getInstance(chrono.monthOfYear(), chrono);

        // 2023-01-15T00:00:00Z
        long instant = 1673740800000L;

        // Set to month 13 -> Should become 2024-01-15
        long result = lenientField.set(instant, 13);
        assertEquals(1, chrono.monthOfYear().get(result));
        assertEquals(2024, chrono.year().get(result));
        assertEquals(15, chrono.dayOfMonth().get(result));
    }

    @Test
    public void testSet_LenientMonthUnderflow() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField lenientField = LenientDateTimeField.getInstance(chrono.monthOfYear(), chrono);

        // 2023-01-15T00:00:00Z
        long instant = 1673740800000L;

        // Set to month 0 -> Should become 2022-12-15
        long result0 = lenientField.set(instant, 0);
        assertEquals(12, chrono.monthOfYear().get(result0));
        assertEquals(2022, chrono.year().get(result0));
        assertEquals(15, chrono.dayOfMonth().get(result0));

        // Set to month -1 -> Should become 2022-11-15
        long resultNeg = lenientField.set(instant, -1);
        assertEquals(11, chrono.monthOfYear().get(resultNeg));
        assertEquals(2022, chrono.year().get(resultNeg));
        assertEquals(15, chrono.dayOfMonth().get(resultNeg));
    }

    @Test
    public void testSet_LenientDayOfMonthOverflow() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField lenientField = LenientDateTimeField.getInstance(chrono.dayOfMonth(), chrono);

        // 2023-01-01T00:00:00Z
        long instant = 1672531200000L;

        // Set day 32 in Jan -> Should become 2023-02-01
        long result = lenientField.set(instant, 32);
        assertEquals(2, chrono.monthOfYear().get(result));
        assertEquals(1, chrono.dayOfMonth().get(result));
        assertEquals(2023, chrono.year().get(result));
    }

    @Test
    public void testSet_LenientHourOfDay() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField lenientField = LenientDateTimeField.getInstance(chrono.hourOfDay(), chrono);

        // 2023-01-01T00:00:00Z
        long instant = 1672531200000L;

        // Set hour 25 -> Should become 2023-01-02T01:00:00Z
        long result = lenientField.set(instant, 25);
        assertEquals(2, chrono.dayOfMonth().get(result));
        assertEquals(1, chrono.hourOfDay().get(result));

        // Set hour -1 -> Should become 2022-12-31T23:00:00Z
        long resultNeg = lenientField.set(instant, -1);
        assertEquals(31, chrono.dayOfMonth().get(resultNeg));
        assertEquals(12, chrono.monthOfYear().get(resultNeg));
        assertEquals(2022, chrono.year().get(resultNeg));
        assertEquals(23, chrono.hourOfDay().get(resultNeg));
    }

    // -----------------------------------------------------------------------
    // Tests for TimeZone and DST Cutover Handling
    // -----------------------------------------------------------------------

    @Test
    public void testSet_WithNonUtcChronologyAndDst() {
        // America/New_York transitions to EDT on 2007-03-11 (Clocks forward from 02:00 to 03:00)
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        Chronology chrono = ISOChronology.getInstance(zone);
        DateTimeField lenientField = LenientDateTimeField.getInstance(chrono.hourOfDay(), chrono);

        // 2007-03-11T00:00:00 in America/New_York
        // UTC: 2007-03-11 05:00:00 UTC = 1173592800000L
        long instant = 1173589200000L;

        // Set hour to 2 (which is skipped due to DST gap) or 3
        long result = lenientField.set(instant, 3);
        assertEquals(3, chrono.hourOfDay().get(result));
        assertEquals(11, chrono.dayOfMonth().get(result));
    }

    @Test
    public void testSet_WithDifferentChronology() {
        Chronology chrono = BuddhistChronology.getInstanceUTC();
        DateTimeField lenientField = LenientDateTimeField.getInstance(chrono.year(), chrono);

        // 2550 BE (approx 2007 CE)
        long instant = 1173589200000L;
        int currentYear = lenientField.get(instant);

        long result = lenientField.set(instant, currentYear + 10);
        assertEquals(currentYear + 10, lenientField.get(result));
    }

    // -----------------------------------------------------------------------
    // Tests for Arithmetic Boundaries & Overflow
    // -----------------------------------------------------------------------

    @Test
    public void testSet_ArithmeticOverflowThrowsException() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField lenientField = LenientDateTimeField.getInstance(chrono.year(), chrono);

        long instant = 0L; // 1970
        try {
            lenientField.set(instant, Integer.MIN_VALUE);
            // In safeSubtract: Integer.MIN_VALUE - 1970 overflows 32-bit int
            fail("Expected ArithmeticException on integer subtraction overflow");
        } catch (ArithmeticException expected) {
            // Success
        }
    }
}