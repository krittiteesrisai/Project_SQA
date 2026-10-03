package org.joda.time.field;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.chrono.ISOChronology;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Comprehensive test suite for UnsupportedDurationField targeting 100% Branch Coverage.
 */
public class UnsupportedDurationFieldTest {

    // -----------------------------------------------------------------------
    // Factory Method & Singleton Cache Tests
    // -----------------------------------------------------------------------

    @Test
    public void testGetInstance_CacheAndDifferentTypes() {
        DurationFieldType hoursType = DurationFieldType.hours();
        DurationFieldType daysType = DurationFieldType.days();

        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(hoursType);
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(hoursType);
        UnsupportedDurationField field3 = UnsupportedDurationField.getInstance(daysType);

        assertNotNull(field1);
        assertSame("Same instance should be returned from cache for the same type", field1, field2);
        assertNotSame("Different instances should be returned for different types", field1, field3);
    }

    @Test
    public void testGetInstance_NullType() {
        UnsupportedDurationField fieldNull1 = UnsupportedDurationField.getInstance(null);
        UnsupportedDurationField fieldNull2 = UnsupportedDurationField.getInstance(null);

        assertNotNull(fieldNull1);
        assertSame("Same instance should be returned from cache for null type", fieldNull1, fieldNull2);
        assertNull(fieldNull1.getType());
    }

    // -----------------------------------------------------------------------
    // Accessor and State Query Tests
    // -----------------------------------------------------------------------

    @Test
    public void testBasicAccessors() {
        DurationFieldType type = DurationFieldType.minutes();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);

        assertEquals(type, field.getType());
        assertEquals(type.getName(), field.getName());
        assertEquals("minutes", field.getName());
        assertFalse(field.isSupported());
        assertTrue(field.isPrecise());
        assertEquals(0L, field.getUnitMillis());
    }

    @Test
    public void testToString() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.years());
        assertEquals("UnsupportedDurationField[years]", field.toString());
    }

    @Test
    public void testCompareTo() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.months());
        DurationField otherField = ISOChronology.getInstanceUTC().days();

        assertEquals(0, field.compareTo(field));
        assertEquals(0, field.compareTo(otherField));
        assertEquals(0, field.compareTo(null));
    }

    // -----------------------------------------------------------------------
    // equals() and hashCode() Branch Coverage Tests
    // -----------------------------------------------------------------------

    @Test
    public void testEquals_SameInstance() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        assertTrue(field.equals(field));
    }

    @Test
    public void testEquals_DifferentTypeOrNull() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        assertFalse(field.equals(null));
        assertFalse(field.equals("Some String"));
        assertFalse(field.equals(ISOChronology.getInstanceUTC().seconds()));
    }

    @Test
    public void testEquals_SameAndDifferentFieldTypes() {
        UnsupportedDurationField fieldSeconds = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        UnsupportedDurationField fieldMillis = UnsupportedDurationField.getInstance(DurationFieldType.millis());

        assertTrue(fieldSeconds.equals(UnsupportedDurationField.getInstance(DurationFieldType.seconds())));
        assertFalse(fieldSeconds.equals(fieldMillis));
    }

    @Test
    public void testHashCode() {
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(DurationFieldType.halfdays());
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(DurationFieldType.halfdays());

        assertEquals(field1.hashCode(), field2.hashCode());
        assertEquals(DurationFieldType.halfdays().getName().hashCode(), field1.hashCode());
    }

    // -----------------------------------------------------------------------
    // Unsupported Operations / Exception Tests (Boundary limits)
    // -----------------------------------------------------------------------

    @Test
    public void testUnsupportedOperations_GetValue() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.centuries());

        long[] testDurations = {Long.MIN_VALUE, -1L, 0L, 1L, Long.MAX_VALUE};
        long[] testInstants = {Long.MIN_VALUE, 0L, Long.MAX_VALUE};

        for (long duration : testDurations) {
            try {
                field.getValue(duration);
                fail("Expected UnsupportedOperationException");
            } catch (UnsupportedOperationException ex) {
                assertTrue(ex.getMessage().contains("centuries field is unsupported"));
            }

            try {
                field.getValueAsLong(duration);
                fail("Expected UnsupportedOperationException");
            } catch (UnsupportedOperationException ex) {
                assertTrue(ex.getMessage().contains("centuries field is unsupported"));
            }

            for (long instant : testInstants) {
                try {
                    field.getValue(duration, instant);
                    fail("Expected UnsupportedOperationException");
                } catch (UnsupportedOperationException ex) {
                    assertTrue(ex.getMessage().contains("centuries field is unsupported"));
                }

                try {
                    field.getValueAsLong(duration, instant);
                    fail("Expected UnsupportedOperationException");
                } catch (UnsupportedOperationException ex) {
                    assertTrue(ex.getMessage().contains("centuries field is unsupported"));
                }
            }
        }
    }

    @Test
    public void testUnsupportedOperations_GetMillis() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.eras());

        int[] intValues = {Integer.MIN_VALUE, -1, 0, 1, Integer.MAX_VALUE};
        long[] longValues = {Long.MIN_VALUE, -1L, 0L, 1L, Long.MAX_VALUE};
        long instant = 123456789L;

        for (int val : intValues) {
            try {
                field.getMillis(val);
                fail("Expected UnsupportedOperationException");
            } catch (UnsupportedOperationException ex) {
                assertTrue(ex.getMessage().contains("eras field is unsupported"));
            }

            try {
                field.getMillis(val, instant);
                fail("Expected UnsupportedOperationException");
            } catch (UnsupportedOperationException ex) {
                assertTrue(ex.getMessage().contains("eras field is unsupported"));
            }
        }

        for (long val : longValues) {
            try {
                field.getMillis(val);
                fail("Expected UnsupportedOperationException");
            } catch (UnsupportedOperationException ex) {
                assertTrue(ex.getMessage().contains("eras field is unsupported"));
            }

            try {
                field.getMillis(val, instant);
                fail("Expected UnsupportedOperationException");
            } catch (UnsupportedOperationException ex) {
                assertTrue(ex.getMessage().contains("eras field is unsupported"));
            }
        }
    }

    @Test
    public void testUnsupportedOperations_Add() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.weeks());
        long instant = 1000L;

        try {
            field.add(instant, 5);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ex) {
            assertTrue(ex.getMessage().contains("weeks field is unsupported"));
        }

        try {
            field.add(instant, 5L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ex) {
            assertTrue(ex.getMessage().contains("weeks field is unsupported"));
        }
    }

    @Test
    public void testUnsupportedOperations_GetDifference() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());

        try {
            field.getDifference(10000L, 5000L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ex) {
            assertTrue(ex.getMessage().contains("days field is unsupported"));
        }

        try {
            field.getDifferenceAsLong(Long.MAX_VALUE, Long.MIN_VALUE);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ex) {
            assertTrue(ex.getMessage().contains("days field is unsupported"));
        }
    }

    // -----------------------------------------------------------------------
    // Serialization & readResolve Test
    // -----------------------------------------------------------------------

    @Test
    public void testSerialization() throws Exception {
        UnsupportedDurationField original = UnsupportedDurationField.getInstance(DurationFieldType.hours());

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        UnsupportedDurationField deserialized = (UnsupportedDurationField) ois.readObject();
        ois.close();

        assertSame("readResolve should return the cached singleton instance", original, deserialized);
    }
}