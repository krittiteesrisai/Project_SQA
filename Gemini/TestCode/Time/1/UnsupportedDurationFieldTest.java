package org.joda.time.field;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.junit.Before;
import org.junit.Test;

/**
 * High-coverage unit tests for UnsupportedDurationField.
 */
public class UnsupportedDurationFieldTest {

    private UnsupportedDurationField daysField;
    private UnsupportedDurationField hoursField;

    @Before
    public void setUp() {
        daysField = UnsupportedDurationField.getInstance(DurationFieldType.days());
        hoursField = UnsupportedDurationField.getInstance(DurationFieldType.hours());
    }

    // -----------------------------------------------------------------------
    // Factory & Singleton Caching
    // -----------------------------------------------------------------------

    @Test
    public void testGetInstance_CachingAndNullHandling() {
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(DurationFieldType.years());
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(DurationFieldType.years());
        
        assertNotNull(field1);
        assertSame("Repeated calls with same type must return identical cached instance", field1, field2);

        UnsupportedDurationField fieldMonths = UnsupportedDurationField.getInstance(DurationFieldType.months());
        assertNotNull(fieldMonths);
        assertFalse("Different types should produce distinct instances", field1 == fieldMonths);
    }

    // -----------------------------------------------------------------------
    // Basic Accessors
    // -----------------------------------------------------------------------

    @Test
    public void testBasicProperties() {
        assertEquals(DurationFieldType.days(), daysField.getType());
        assertEquals("days", daysField.getName());
        assertFalse("isSupported should always be false", daysField.isSupported());
        assertTrue("isPrecise should always be true", daysField.isPrecise());
        assertEquals("getUnitMillis should always be 0", 0L, daysField.getUnitMillis());
    }

    // -----------------------------------------------------------------------
    // compareTo Coverage
    // -----------------------------------------------------------------------

    @Test
    public void testCompareTo_SupportedField() {
        DurationField supported = MillisDurationField.INSTANCE;
        assertTrue(supported.isSupported());
        assertEquals(1, daysField.compareTo(supported));
    }

    @Test
    public void testCompareTo_UnsupportedField() {
        assertEquals(0, daysField.compareTo(daysField));
        assertEquals(0, daysField.compareTo(hoursField));
    }

    @Test(expected = NullPointerException.class)
    public void testCompareTo_NullField() {
        daysField.compareTo(null);
    }

    // -----------------------------------------------------------------------
    // equals, hashCode, toString
    // -----------------------------------------------------------------------

    @Test
    public void testEqualsAndHashCode() {
        // Same instance
        assertTrue(daysField.equals(daysField));
        assertEquals(daysField.hashCode(), daysField.hashCode());

        // Same type from factory
        UnsupportedDurationField daysField2 = UnsupportedDurationField.getInstance(DurationFieldType.days());
        assertTrue(daysField.equals(daysField2));
        assertEquals(daysField.hashCode(), daysField2.hashCode());

        // Different type
        assertFalse(daysField.equals(hoursField));

        // Different class / null
        assertFalse(daysField.equals(null));
        assertFalse(daysField.equals("days"));
        assertFalse(daysField.equals(MillisDurationField.INSTANCE));
    }

    @Test
    public void testToString() {
        assertEquals("UnsupportedDurationField[days]", daysField.toString());
        assertEquals("UnsupportedDurationField[hours]", hoursField.toString());
    }

    // -----------------------------------------------------------------------
    // Unsupported Operations (Boundary Limits Verification)
    // -----------------------------------------------------------------------

    @Test
    public void testUnsupported_getValue() {
        long[] testValues = { 0L, 1L, -1L, Long.MIN_VALUE, Long.MAX_VALUE };
        for (long val : testValues) {
            try {
                daysField.getValue(val);
                fail("getValue(long) should throw UnsupportedOperationException for " + val);
            } catch (UnsupportedOperationException ex) {
                assertTrue(ex.getMessage().contains("days field is unsupported"));
            }
        }
    }

    @Test
    public void testUnsupported_getValueAsLong() {
        long[] testValues = { 0L, 1L, -1L, Long.MIN_VALUE, Long.MAX_VALUE };
        for (long val : testValues) {
            try {
                daysField.getValueAsLong(val);
                fail("getValueAsLong(long) should throw UnsupportedOperationException for " + val);
            } catch (UnsupportedOperationException ex) {
                assertTrue(ex.getMessage().contains("days field is unsupported"));
            }
        }
    }

    @Test
    public void testUnsupported_getValueWithInstant() {
        long[] testValues = { 0L, Long.MIN_VALUE, Long.MAX_VALUE };
        for (long duration : testValues) {
            for (long instant : testValues) {
                try {
                    daysField.getValue(duration, instant);
                    fail("getValue(long, long) should throw UnsupportedOperationException");
                } catch (UnsupportedOperationException ex) {
                    assertTrue(ex.getMessage().contains("days field is unsupported"));
                }
            }
        }
    }

    @Test
    public void testUnsupported_getValueAsLongWithInstant() {
        long[] testValues = { 0L, Long.MIN_VALUE, Long.MAX_VALUE };
        for (long duration : testValues) {
            for (long instant : testValues) {
                try {
                    daysField.getValueAsLong(duration, instant);
                    fail("getValueAsLong(long, long) should throw UnsupportedOperationException");
                } catch (UnsupportedOperationException ex) {
                    assertTrue(ex.getMessage().contains("days field is unsupported"));
                }
            }
        }
    }

    @Test
    public void testUnsupported_getMillisInt() {
        int[] testValues = { 0, 1, -1, Integer.MIN_VALUE, Integer.MAX_VALUE };
        for (int val : testValues) {
            try {
                daysField.getMillis(val);
                fail("getMillis(int) should throw UnsupportedOperationException");
            } catch (UnsupportedOperationException ex) {
                assertTrue(ex.getMessage().contains("days field is unsupported"));
            }
        }
    }

    @Test
    public void testUnsupported_getMillisLong() {
        long[] testValues = { 0L, 1L, -1L, Long.MIN_VALUE, Long.MAX_VALUE };
        for (long val : testValues) {
            try {
                daysField.getMillis(val);
                fail("getMillis(long) should throw UnsupportedOperationException");
            } catch (UnsupportedOperationException ex) {
                assertTrue(ex.getMessage().contains("days field is unsupported"));
            }
        }
    }

    @Test
    public void testUnsupported_getMillisIntWithInstant() {
        int[] intValues = { 0, Integer.MIN_VALUE, Integer.MAX_VALUE };
        long[] longValues = { 0L, Long.MIN_VALUE, Long.MAX_VALUE };
        for (int val : intValues) {
            for (long instant : longValues) {
                try {
                    daysField.getMillis(val, instant);
                    fail("getMillis(int, long) should throw UnsupportedOperationException");
                } catch (UnsupportedOperationException ex) {
                    assertTrue(ex.getMessage().contains("days field is unsupported"));
                }
            }
        }
    }

    @Test
    public void testUnsupported_getMillisLongWithInstant() {
        long[] longValues = { 0L, Long.MIN_VALUE, Long.MAX_VALUE };
        for (long val : longValues) {
            for (long instant : longValues) {
                try {
                    daysField.getMillis(val, instant);
                    fail("getMillis(long, long) should throw UnsupportedOperationException");
                } catch (UnsupportedOperationException ex) {
                    assertTrue(ex.getMessage().contains("days field is unsupported"));
                }
            }
        }
    }

    @Test
    public void testUnsupported_addInt() {
        int[] intValues = { 0, Integer.MIN_VALUE, Integer.MAX_VALUE };
        long[] longValues = { 0L, Long.MIN_VALUE, Long.MAX_VALUE };
        for (long instant : longValues) {
            for (int val : intValues) {
                try {
                    daysField.add(instant, val);
                    fail("add(long, int) should throw UnsupportedOperationException");
                } catch (UnsupportedOperationException ex) {
                    assertTrue(ex.getMessage().contains("days field is unsupported"));
                }
            }
        }
    }

    @Test
    public void testUnsupported_addLong() {
        long[] longValues = { 0L, 1L, -1L, Long.MIN_VALUE, Long.MAX_VALUE };
        for (long instant : longValues) {
            for (long val : longValues) {
                try {
                    daysField.add(instant, val);
                    fail("add(long, long) should throw UnsupportedOperationException");
                } catch (UnsupportedOperationException ex) {
                    assertTrue(ex.getMessage().contains("days field is unsupported"));
                }
            }
        }
    }

    @Test
    public void testUnsupported_getDifference() {
        long[] longValues = { 0L, 1L, -1L, Long.MIN_VALUE, Long.MAX_VALUE };
        for (long minInstant : longValues) {
            for (long subInstant : longValues) {
                try {
                    daysField.getDifference(minInstant, subInstant);
                    fail("getDifference(long, long) should throw UnsupportedOperationException");
                } catch (UnsupportedOperationException ex) {
                    assertTrue(ex.getMessage().contains("days field is unsupported"));
                }
            }
        }
    }

    @Test
    public void testUnsupported_getDifferenceAsLong() {
        long[] longValues = { 0L, 1L, -1L, Long.MIN_VALUE, Long.MAX_VALUE };
        for (long minInstant : longValues) {
            for (long subInstant : longValues) {
                try {
                    daysField.getDifferenceAsLong(minInstant, subInstant);
                    fail("getDifferenceAsLong(long, long) should throw UnsupportedOperationException");
                } catch (UnsupportedOperationException ex) {
                    assertTrue(ex.getMessage().contains("days field is unsupported"));
                }
            }
        }
    }

    // -----------------------------------------------------------------------
    // Serialization & readResolve
    // -----------------------------------------------------------------------

    @Test
    public void testSerializationSingleton() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(daysField);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        UnsupportedDurationField deserialized = (UnsupportedDurationField) ois.readObject();
        ois.close();

        assertSame("Deserialized instance must maintain singleton reference via readResolve", daysField, deserialized);
    }
}