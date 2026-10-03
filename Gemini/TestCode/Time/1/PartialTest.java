package org.joda.time;

import static org.junit.Assert.*;

import java.util.Locale;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.ISOChronology;
import org.junit.Test;

public class PartialTest {

    // -----------------------------------------------------------------------
    // Constructors Tests
    // -----------------------------------------------------------------------
    @Test
    public void testConstructor_EmptyAndChronology() {
        Partial p1 = new Partial();
        assertEquals(0, p1.size());
        assertEquals(ISOChronology.getInstanceUTC(), p1.getChronology());

        Partial p2 = new Partial((Chronology) null);
        assertEquals(0, p2.size());
        assertEquals(ISOChronology.getInstanceUTC(), p2.getChronology());

        Partial p3 = new Partial(BuddhistChronology.getInstance());
        assertEquals(0, p3.size());
        assertEquals(BuddhistChronology.getInstanceUTC(), p3.getChronology());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_SingleField_NullType() {
        new Partial((DateTimeFieldType) null, 1);
    }

    @Test
    public void testConstructor_SingleField_Valid() {
        Partial p = new Partial(DateTimeFieldType.year(), 2023);
        assertEquals(1, p.size());
        assertEquals(DateTimeFieldType.year(), p.getFieldType(0));
        assertEquals(2023, p.getValue(0));
        assertEquals(ISOChronology.getInstanceUTC(), p.getChronology());

        Partial p2 = new Partial(DateTimeFieldType.monthOfYear(), 5, CopticChronology.getInstance());
        assertEquals(CopticChronology.getInstanceUTC(), p2.getChronology());
        assertEquals(5, p2.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Array_NullTypes() {
        new Partial(null, new int[] {1});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Array_NullValues() {
        new Partial(new DateTimeFieldType[] {DateTimeFieldType.year()}, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Array_LengthMismatch() {
        new Partial(new DateTimeFieldType[] {DateTimeFieldType.year()}, new int[] {2020, 1});
    }

    @Test
    public void testConstructor_Array_Empty() {
        Partial p = new Partial(new DateTimeFieldType[0], new int[0]);
        assertEquals(0, p.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Array_ContainsNullType() {
        new Partial(new DateTimeFieldType[] {DateTimeFieldType.year(), null}, new int[] {2020, 1});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Array_WrongOrder_Units() {
        // monthOfYear has smaller unit than year -> invalid if month comes before year
        new Partial(
            new DateTimeFieldType[] {DateTimeFieldType.monthOfYear(), DateTimeFieldType.year()},
            new int[] {5, 2020}
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Array_Duplicate_NoRange() {
        new Partial(
            new DateTimeFieldType[] {DateTimeFieldType.era(), DateTimeFieldType.era()},
            new int[] {1, 1}
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Array_Duplicate_WithRange() {
        new Partial(
            new DateTimeFieldType[] {DateTimeFieldType.hourOfDay(), DateTimeFieldType.hourOfDay()},
            new int[] {10, 12}
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Array_WrongOrder_SameUnit_DifferentRange() {
        // hourOfHalfday range is Halfday, hourOfDay range is Day.
        // Day > Halfday, so hourOfDay must come before hourOfHalfday.
        new Partial(
            new DateTimeFieldType[] {DateTimeFieldType.hourOfHalfday(), DateTimeFieldType.hourOfDay()},
            new int[] {5, 10}
        );
    }

    @Test
    public void testConstructor_Array_CorrectOrder_SameUnit_DifferentRange() {
        Partial p = new Partial(
            new DateTimeFieldType[] {DateTimeFieldType.hourOfDay(), DateTimeFieldType.hourOfHalfday()},
            new int[] {10, 5}
        );
        assertEquals(2, p.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_ReadablePartial_Null() {
        new Partial((ReadablePartial) null);
    }

    @Test
    public void testConstructor_ReadablePartial_Valid() {
        Partial orig = new Partial(DateTimeFieldType.year(), 2024);
        Partial copy = new Partial(orig);
        assertEquals(orig.size(), copy.size());
        assertEquals(orig.getValue(0), copy.getValue(0));
    }

    // -----------------------------------------------------------------------
    // Getters and Chronology
    // -----------------------------------------------------------------------
    @Test
    public void testGetters() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()};
        int[] values = new int[] {2024, 6};
        Partial p = new Partial(types, values);

        assertArrayEquals(types, p.getFieldTypes());
        assertArrayEquals(values, p.getValues());
        assertEquals(DateTimeFieldType.year(), p.getFieldType(0));
        assertEquals(2024, p.getValue(0));
        assertNotNull(p.getField(0, p.getChronology()));
    }

    @Test
    public void testWithChronologyRetainFields() {
        Partial p = new Partial(DateTimeFieldType.year(), 2024);
        assertSame(p, p.withChronologyRetainFields(null));
        assertSame(p, p.withChronologyRetainFields(ISOChronology.getInstance()));

        Partial coptic = p.withChronologyRetainFields(CopticChronology.getInstance());
        assertEquals(CopticChronology.getInstanceUTC(), coptic.getChronology());
        assertEquals(2024, coptic.getValue(0));
    }

    // -----------------------------------------------------------------------
    // with and without Operations
    // -----------------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testWith_NullType() {
        new Partial().with(null, 1);
    }

    @Test
    public void testWith_Insertions() {
        Partial p = new Partial();
        // Insert into empty
        p = p.with(DateTimeFieldType.monthOfYear(), 6);
        assertEquals(1, p.size());

        // Insert larger unit at beginning
        p = p.with(DateTimeFieldType.year(), 2024);
        assertEquals(2, p.size());
        assertEquals(DateTimeFieldType.year(), p.getFieldType(0));
        assertEquals(DateTimeFieldType.monthOfYear(), p.getFieldType(1));

        // Insert smaller unit at end
        p = p.with(DateTimeFieldType.dayOfMonth(), 15);
        assertEquals(3, p.size());
        assertEquals(DateTimeFieldType.dayOfMonth(), p.getFieldType(2));

        // Insert middle / same unit different range
        Partial pTime = new Partial(DateTimeFieldType.hourOfDay(), 10);
        pTime = pTime.with(DateTimeFieldType.hourOfHalfday(), 10);
        assertEquals(2, pTime.size());
        assertEquals(DateTimeFieldType.hourOfDay(), pTime.getFieldType(0));
        assertEquals(DateTimeFieldType.hourOfHalfday(), pTime.getFieldType(1));

        // Setting existing field with same value returns this
        assertSame(p, p.with(DateTimeFieldType.year(), 2024));

        // Setting existing field with different value
        Partial updated = p.with(DateTimeFieldType.year(), 2025);
        assertEquals(2025, updated.getValue(0));
        assertNotSame(p, updated);
    }

    @Test
    public void testWithout() {
        Partial p = new Partial(
            new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth()},
            new int[] {2024, 6, 15}
        );

        // Remove unsupported field -> returns this
        assertSame(p, p.without(DateTimeFieldType.hourOfDay()));

        // Remove supported field
        Partial p2 = p.without(DateTimeFieldType.monthOfYear());
        assertEquals(2, p2.size());
        assertEquals(DateTimeFieldType.year(), p2.getFieldType(0));
        assertEquals(DateTimeFieldType.dayOfMonth(), p2.getFieldType(1));
    }

    // -----------------------------------------------------------------------
    // withField, withFieldAdded, withFieldAddWrapped
    // -----------------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testWithField_Unsupported() {
        Partial p = new Partial(DateTimeFieldType.year(), 2024);
        p.withField(DateTimeFieldType.monthOfYear(), 5);
    }

    @Test
    public void testWithField_Supported() {
        Partial p = new Partial(DateTimeFieldType.year(), 2024);
        assertSame(p, p.withField(DateTimeFieldType.year(), 2024));

        Partial p2 = p.withField(DateTimeFieldType.year(), 2025);
        assertEquals(2025, p2.getValue(0));
    }

    @Test
    public void testWithFieldAddedAndWrapped() {
        Partial p = new Partial(DateTimeFieldType.dayOfMonth(), 10);

        assertSame(p, p.withFieldAdded(DurationFieldType.days(), 0));
        Partial added = p.withFieldAdded(DurationFieldType.days(), 5);
        assertEquals(15, added.getValue(0));

        assertSame(p, p.withFieldAddWrapped(DurationFieldType.days(), 0));
        Partial wrapped = p.withFieldAddWrapped(DurationFieldType.days(), 25);
        assertEquals(4, wrapped.getValue(0)); // 10 + 25 = 35 -> wraps in month of 31 days
    }

    // -----------------------------------------------------------------------
    // Period Operations: plus, minus, withPeriodAdded
    // -----------------------------------------------------------------------
    @Test
    public void testPeriodOperations() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 5);

        assertSame(p, p.withPeriodAdded(null, 1));
        assertSame(p, p.withPeriodAdded(Period.months(1), 0));
        assertSame(p, p.plus(null));
        assertSame(p, p.minus(null));

        Period periodWithSupportedAndUnsupported = Period.months(2).withDays(5);
        Partial plusResult = p.plus(periodWithSupportedAndUnsupported);
        assertEquals(7, plusResult.getValue(0));

        Partial minusResult = p.minus(Period.months(2));
        assertEquals(3, minusResult.getValue(0));
    }

    // -----------------------------------------------------------------------
    // isMatch Operations
    // -----------------------------------------------------------------------
    @Test
    public void testIsMatch_Instant() {
        DateTime dt = new DateTime(2024, 6, 15, 12, 0, 0, ISOChronology.getInstanceUTC());
        Partial pMatch = new Partial(DateTimeFieldType.year(), 2024).with(DateTimeFieldType.monthOfYear(), 6);
        Partial pNoMatch = new Partial(DateTimeFieldType.year(), 2023);

        assertTrue(pMatch.isMatch(dt));
        assertFalse(pNoMatch.isMatch(dt));

        // Test with null instant (current time)
        Partial pEra = new Partial(DateTimeFieldType.era(), 1);
        assertTrue(pEra.isMatch((ReadableInstant) null));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsMatch_Partial_Null() {
        new Partial().isMatch((ReadablePartial) null);
    }

    @Test
    public void testIsMatch_Partial() {
        Partial p1 = new Partial(DateTimeFieldType.year(), 2024).with(DateTimeFieldType.monthOfYear(), 6);
        YearMonth ymMatch = new YearMonth(2024, 6);
        YearMonth ymNoMatch = new YearMonth(2024, 7);

        assertTrue(p1.isMatch(ymMatch));
        assertFalse(p1.isMatch(ymNoMatch));
    }

    // -----------------------------------------------------------------------
    // Formatter & toString
    // -----------------------------------------------------------------------
    @Test
    public void testToStringAndFormatting() {
        Partial empty = new Partial();
        assertNull(empty.getFormatter());
        assertEquals("[]", empty.toString());

        Partial pISO = new Partial(DateTimeFieldType.year(), 2024).with(DateTimeFieldType.monthOfYear(), 6);
        assertEquals("2024-06", pISO.toString());
        assertEquals("2024/06", pISO.toString("yyyy/MM"));
        assertEquals("2024/06", pISO.toString("yyyy/MM", Locale.ENGLISH));
        assertEquals("2024-06", pISO.toString(null));
        assertEquals("2024-06", pISO.toString(null, Locale.ENGLISH));

        // Partial with fields that don't produce standard ISO (fallback to toStringList)
        Partial pOverlap = new Partial(DateTimeFieldType.dayOfWeek(), 3).with(DateTimeFieldType.dayOfMonth(), 15);
        assertEquals("[dayOfWeek=3, dayOfMonth=15]", pOverlap.toString());
        assertEquals("[dayOfWeek=3, dayOfMonth=15]", pOverlap.toStringList());
    }

    // -----------------------------------------------------------------------
    // Property Inner Class Tests
    // -----------------------------------------------------------------------
    @Test
    public void testPropertyOperations() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 6);
        Partial.Property prop = p.property(DateTimeFieldType.monthOfYear());

        assertEquals(p, prop.getPartial());
        assertEquals(p, prop.getReadablePartial());
        assertEquals(6, prop.get());
        assertEquals(DateTimeFieldType.monthOfYear().getField(p.getChronology()), prop.getField());

        Partial added = prop.addToCopy(2);
        assertEquals(8, added.getValue(0));

        Partial wrapped = prop.addWrapFieldToCopy(8);
        assertEquals(2, wrapped.getValue(0));

        Partial setVal = prop.setCopy(12);
        assertEquals(12, setVal.getValue(0));

        Partial setString = prop.setCopy("11");
        assertEquals(11, setString.getValue(0));

        Partial setStringLocale = prop.setCopy("10", Locale.ENGLISH);
        assertEquals(10, setStringLocale.getValue(0));

        Partial max = prop.withMaximumValue();
        assertEquals(12, max.getValue(0));

        Partial min = prop.withMinimumValue();
        assertEquals(1, min.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProperty_UnsupportedField() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 6);
        p.property(DateTimeFieldType.year());
    }
}