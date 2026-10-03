package org.joda.time;

import java.util.Locale;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PartialTest {

    private DateTimeZone originalDateTimeZone;
    private Locale originalLocale;

    @Before
    public void setUp() {
        originalDateTimeZone = DateTimeZone.getDefault();
        originalLocale = Locale.getDefault();
        DateTimeZone.setDefault(DateTimeZone.UTC);
        Locale.setDefault(Locale.UK);
    }

    @After
    public void tearDown() {
        DateTimeZone.setDefault(originalDateTimeZone);
        Locale.setDefault(originalLocale);
    }

    // ==========================================
    // 1. Constructor Tests & Boundary Validations
    // ==========================================

    @Test
    public void testConstructor_EmptyAndNullChrono() {
        Partial p1 = new Partial();
        assertEquals(0, p1.size());
        assertEquals(ISOChronology.getInstanceUTC(), p1.getChronology());

        Partial p2 = new Partial((Chronology) null);
        assertEquals(0, p2.size());
        assertEquals(ISOChronology.getInstanceUTC(), p2.getChronology());

        Partial p3 = new Partial(BuddhistChronology.getInstanceUTC());
        assertEquals(BuddhistChronology.getInstanceUTC(), p3.getChronology());
    }

    @Test
    public void testConstructor_SingleField() {
        Partial p = new Partial(DateTimeFieldType.hourOfDay(), 10);
        assertEquals(1, p.size());
        assertEquals(DateTimeFieldType.hourOfDay(), p.getFieldType(0));
        assertEquals(10, p.getValue(0));
        assertEquals(ISOChronology.getInstanceUTC(), p.getChronology());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_SingleField_NullType() {
        new Partial(null, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_SingleField_InvalidValue() {
        new Partial(DateTimeFieldType.hourOfDay(), 25);
    }

    @Test
    public void testConstructor_Array_Empty() {
        Partial p = new Partial(new DateTimeFieldType[0], new int[0]);
        assertEquals(0, p.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Array_NullTypes() {
        new Partial((DateTimeFieldType[]) null, new int[]{1});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Array_NullValues() {
        new Partial(new DateTimeFieldType[]{DateTimeFieldType.year()}, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Array_MismatchedLengths() {
        new Partial(new DateTimeFieldType[]{DateTimeFieldType.year()}, new int[]{2020, 10});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Array_NullElement() {
        new Partial(new DateTimeFieldType[]{DateTimeFieldType.year(), null}, new int[]{2020, 10});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Array_InvalidOrder_SmallerToLarger() {
        DateTimeFieldType[] types = new DateTimeFieldType[]{DateTimeFieldType.monthOfYear(), DateTimeFieldType.year()};
        int[] values = new int[]{5, 2020};
        new Partial(types, values);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Array_DuplicateWithoutRange() {
        DateTimeFieldType[] types = new DateTimeFieldType[]{DateTimeFieldType.era(), DateTimeFieldType.era()};
        int[] values = new int[]{1, 1};
        new Partial(types, values);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Array_SameUnitField_InvalidRangeOrder() {
        // dayOfYear has unit=days, range=years; dayOfMonth has unit=days, range=months.
        // largest to smallest: range years > range months, so dayOfYear must come before dayOfMonth.
        DateTimeFieldType[] types = new DateTimeFieldType[]{DateTimeFieldType.dayOfMonth(), DateTimeFieldType.dayOfYear()};
        int[] values = new int[]{15, 100};
        new Partial(types, values);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Array_SameUnitField_DuplicateRange() {
        DateTimeFieldType[] types = new DateTimeFieldType[]{DateTimeFieldType.dayOfMonth(), DateTimeFieldType.dayOfMonth()};
        int[] values = new int[]{15, 15};
        new Partial(types, values);
    }

    @Test
    public void testConstructor_Array_SameUnitField_ValidOrder() {
        DateTimeFieldType[] types = new DateTimeFieldType[]{DateTimeFieldType.dayOfYear(), DateTimeFieldType.dayOfMonth()};
        int[] values = new int[]{15, 15};
        Partial p = new Partial(types, values);
        assertEquals(2, p.size());
    }

    @Test
    public void testConstructor_CopyReadablePartial() {
        Partial source = new Partial(DateTimeFieldType.year(), 2020)
                .with(DateTimeFieldType.monthOfYear(), 5);
        Partial copy = new Partial(source);
        assertEquals(2, copy.size());
        assertEquals(2020, copy.getValue(0));
        assertEquals(5, copy.getValue(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_CopyReadablePartial_Null() {
        new Partial((ReadablePartial) null);
    }

    // ==========================================
    // 2. Getters, Chronology & Basic Operations
    // ==========================================

    @Test
    public void testGettersAndCloning() {
        Partial p = new Partial(new DateTimeFieldType[]{DateTimeFieldType.year(), DateTimeFieldType.hourOfDay()},
                new int[]{2023, 14});

        assertEquals(2, p.size());
        assertEquals(DateTimeFieldType.year(), p.getFieldType(0));
        assertEquals(2023, p.getValue(0));
        assertNotNull(p.getField(0, ISOChronology.getInstanceUTC()));

        DateTimeFieldType[] types = p.getFieldTypes();
        int[] values = p.getValues();
        assertEquals(2, types.length);
        assertEquals(2, values.length);

        // Verify cloning ensures immutability of returned array
        types[0] = DateTimeFieldType.dayOfMonth();
        values[0] = 99;
        assertEquals(DateTimeFieldType.year(), p.getFieldType(0));
        assertEquals(2023, p.getValue(0));
    }

    @Test
    public void testWithChronologyRetainFields() {
        Partial p = new Partial(DateTimeFieldType.year(), 2020);
        assertSame(p, p.withChronologyRetainFields(null));
        assertSame(p, p.withChronologyRetainFields(ISOChronology.getInstance()));

        Partial buddhist = p.withChronologyRetainFields(BuddhistChronology.getInstance());
        assertEquals(BuddhistChronology.getInstanceUTC(), buddhist.getChronology());
        assertEquals(2020, buddhist.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithChronologyRetainFields_InvalidForNewChronology() {
        // Coptic year month 13 has maximum 6 days
        Partial p = new Partial(new DateTimeFieldType[]{DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth()},
                new int[]{13, 15}, ISOChronology.getInstanceUTC());
        p.withChronologyRetainFields(CopticChronology.getInstanceUTC());
    }

    // ==========================================
    // 3. Mutation Operations (with, without, withField)
    // ==========================================

    @Test
    public void testWith_Insertions() {
        Partial p = new Partial();
        // Insert first
        p = p.with(DateTimeFieldType.minuteOfHour(), 30);
        assertEquals(1, p.size());
        assertEquals(DateTimeFieldType.minuteOfHour(), p.getFieldType(0));

        // Insert larger (at index 0)
        p = p.with(DateTimeFieldType.hourOfDay(), 10);
        assertEquals(2, p.size());
        assertEquals(DateTimeFieldType.hourOfDay(), p.getFieldType(0));
        assertEquals(DateTimeFieldType.minuteOfHour(), p.getFieldType(1));

        // Insert smaller (at end)
        p = p.with(DateTimeFieldType.secondOfMinute(), 45);
        assertEquals(3, p.size());
        assertEquals(DateTimeFieldType.secondOfMinute(), p.getFieldType(2));

        // Insert middle & same unit field with range comparison
        p = p.with(DateTimeFieldType.dayOfYear(), 100);
        p = p.with(DateTimeFieldType.dayOfMonth(), 10); // same unit 'days', dayOfYear > dayOfMonth
        assertEquals(5, p.size());
        assertEquals(DateTimeFieldType.dayOfYear(), p.getFieldType(0));
        assertEquals(DateTimeFieldType.dayOfMonth(), p.getFieldType(1));

        // Existing field same value -> returns this
        assertSame(p, p.with(DateTimeFieldType.hourOfDay(), 10));

        // Existing field updated value
        Partial updated = p.with(DateTimeFieldType.hourOfDay(), 15);
        assertEquals(15, updated.get(DateTimeFieldType.hourOfDay()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWith_NullFieldType() {
        new Partial().with(null, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWith_InvalidValue() {
        new Partial().with(DateTimeFieldType.hourOfDay(), 99);
    }

    @Test
    public void testWithout() {
        Partial p = new Partial(new DateTimeFieldType[]{DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth()},
                new int[]{2020, 5, 20});

        // Remove non-existing or null
        assertSame(p, p.without(DateTimeFieldType.hourOfDay()));
        assertSame(p, p.without(null));

        // Remove middle
        Partial p2 = p.without(DateTimeFieldType.monthOfYear());
        assertEquals(2, p2.size());
        assertEquals(DateTimeFieldType.year(), p2.getFieldType(0));
        assertEquals(DateTimeFieldType.dayOfMonth(), p2.getFieldType(1));

        // Remove start
        Partial p3 = p2.without(DateTimeFieldType.year());
        assertEquals(1, p3.size());
        assertEquals(DateTimeFieldType.dayOfMonth(), p3.getFieldType(0));

        // Remove last remaining
        Partial p4 = p3.without(DateTimeFieldType.dayOfMonth());
        assertEquals(0, p4.size());
    }

    @Test
    public void testWithField() {
        Partial p = new Partial(DateTimeFieldType.year(), 2020);
        assertSame(p, p.withField(DateTimeFieldType.year(), 2020));

        Partial p2 = p.withField(DateTimeFieldType.year(), 2025);
        assertEquals(2025, p2.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithField_Unsupported() {
        new Partial(DateTimeFieldType.year(), 2020).withField(DateTimeFieldType.dayOfMonth(), 5);
    }

    // ==========================================
    // 4. Arithmetic & Period Calculations
    // ==========================================

    @Test
    public void testWithFieldAddedAndWrapped() {
        Partial p = new Partial(new DateTimeFieldType[]{DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()},
                new int[]{23, 50});

        // 0 amount returns this
        assertSame(p, p.withFieldAdded(DurationFieldType.minutes(), 0));
        assertSame(p, p.withFieldAddWrapped(DurationFieldType.minutes(), 0));

        // Add without wrap (overflows into hour)
        Partial pAdded = p.withFieldAdded(DurationFieldType.minutes(), 20);
        assertEquals(0, pAdded.get(DateTimeFieldType.hourOfDay()));
        assertEquals(10, pAdded.get(DateTimeFieldType.minuteOfHour()));

        // Add wrapped (wraps only within minute, hour unaffected)
        Partial pWrapped = p.withFieldAddWrapped(DurationFieldType.minutes(), 20);
        assertEquals(23, pWrapped.get(DateTimeFieldType.hourOfDay()));
        assertEquals(10, pWrapped.get(DateTimeFieldType.minuteOfHour()));
    }

    @Test
    public void testPeriodOperations() {
        Partial p = new Partial(new DateTimeFieldType[]{DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()},
                new int[]{2020, 5});

        // Null / Zero period
        assertSame(p, p.withPeriodAdded(null, 1));
        assertSame(p, p.withPeriodAdded(Period.months(1), 0));
        assertSame(p, p.plus(null));
        assertSame(p, p.minus(null));

        // Plus period (including fields not present in partial which should be ignored)
        Period period = Period.years(2).withMonths(3).withDays(10);
        Partial pPlus = p.plus(period);
        assertEquals(2022, pPlus.get(DateTimeFieldType.year()));
        assertEquals(8, pPlus.get(DateTimeFieldType.monthOfYear()));

        // Minus period
        Partial pMinus = p.minus(Period.years(1).withMonths(2));
        assertEquals(2019, pMinus.get(DateTimeFieldType.year()));
        assertEquals(3, pMinus.get(DateTimeFieldType.monthOfYear()));
    }

    // ==========================================
    // 5. Matching Methods
    // ==========================================

    @Test
    public void testIsMatch_Instant() {
        Partial p = new Partial(new DateTimeFieldType[]{DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()},
                new int[]{2020, 5});

        DateTime dtMatch = new DateTime(2020, 5, 15, 12, 0, DateTimeZone.UTC);
        DateTime dtMismatch = new DateTime(2021, 5, 15, 12, 0, DateTimeZone.UTC);

        assertTrue(p.isMatch(dtMatch));
        assertFalse(p.isMatch(dtMismatch));

        // Null instant uses now
        Partial empty = new Partial();
        assertTrue(empty.isMatch((ReadableInstant) null));
    }

    @Test
    public void testIsMatch_Partial() {
        Partial p1 = new Partial(new DateTimeFieldType[]{DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()},
                new int[]{2020, 5});
        Partial p2 = new Partial(new DateTimeFieldType[]{DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()},
                new int[]{2020, 5});
        Partial p3 = new Partial(new DateTimeFieldType[]{DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()},
                new int[]{2020, 6});

        assertTrue(p1.isMatch(p2));
        assertFalse(p1.isMatch(p3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsMatch_Partial_Null() {
        new Partial().isMatch((ReadablePartial) null);
    }

    // ==========================================
    // 6. Formatting & String Output
    // ==========================================

    @Test
    public void testToStringAndFormatting() {
        Partial empty = new Partial();
        assertNull(empty.getFormatter());
        assertEquals("[]", empty.toString());
        assertEquals("[]", empty.toStringList());

        Partial p = new Partial(new DateTimeFieldType[]{DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()},
                new int[]{2020, 5});
        assertNotNull(p.getFormatter());
        assertEquals("2020-05", p.toString());
        assertEquals("[year=2020, monthOfYear=5]", p.toStringList());

        // Custom patterns
        assertEquals("2020-05", p.toString((String) null));
        assertEquals("05/2020", p.toString("MM/yyyy"));
        assertEquals("05/2020", p.toString("MM/yyyy", Locale.FRANCE));
        assertEquals("2020-05", p.toString(null, Locale.FRANCE));

        // Partial with non-standard ISO representation
        Partial nonStandard = new Partial(DateTimeFieldType.dayOfWeek(), 3);
        assertEquals("[dayOfWeek=3]", nonStandard.toString());
    }

    // ==========================================
    // 7. Property Inner Class Tests
    // ==========================================

    @Test
    public void testPropertyOperations() {
        Partial p = new Partial(new DateTimeFieldType[]{DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()},
                new int[]{2020, 5});

        Partial.Property prop = p.property(DateTimeFieldType.monthOfYear());
        assertEquals(5, prop.get());
        assertEquals(DateTimeFieldType.monthOfYear(), prop.getFieldType());
        assertSame(p, prop.getPartial());
        assertSame(p, prop.getReadablePartial());
        assertNotNull(prop.getField());

        // Add
        Partial added = prop.addToCopy(3);
        assertEquals(8, added.get(DateTimeFieldType.monthOfYear()));

        // Add wrap
        Partial wrapped = prop.addWrapFieldToCopy(10);
        assertEquals(3, wrapped.get(DateTimeFieldType.monthOfYear()));

        // Set int
        Partial setInt = prop.setCopy(12);
        assertEquals(12, setInt.get(DateTimeFieldType.monthOfYear()));

        // Set String & Locale
        Partial setStr = prop.setCopy("July", Locale.UK);
        assertEquals(7, setStr.get(DateTimeFieldType.monthOfYear()));
        Partial setStrDefaultLocale = prop.setCopy("2");
        assertEquals(2, setStrDefaultLocale.get(DateTimeFieldType.monthOfYear()));

        // Min & Max values
        Partial minP = prop.withMinimumValue();
        assertEquals(1, minP.get(DateTimeFieldType.monthOfYear()));
        Partial maxP = prop.withMaximumValue();
        assertEquals(12, maxP.get(DateTimeFieldType.monthOfYear()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProperty_UnsupportedField() {
        Partial p = new Partial(DateTimeFieldType.year(), 2020);
        p.property(DateTimeFieldType.secondOfMinute());
    }
}