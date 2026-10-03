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

    private DateTimeZone originalTimeZone;
    private Chronology isoChronology;

    @Before
    public void setUp() {
        originalTimeZone = DateTimeZone.getDefault();
        DateTimeZone.setDefault(DateTimeZone.UTC);
        isoChronology = ISOChronology.getInstanceUTC();
    }

    @After
    public void tearDown() {
        DateTimeZone.setDefault(originalTimeZone);
    }

    // -----------------------------------------------------------------------
    // Constructors Tests
    // -----------------------------------------------------------------------

    @Test
    public void testConstructor_NoArgs() {
        Partial p = new Partial();
        assertEquals(0, p.size());
        assertEquals(isoChronology, p.getChronology());
        assertEquals(0, p.getFieldTypes().length);
        assertEquals(0, p.getValues().length);
    }

    @Test
    public void testConstructor_Chronology() {
        Partial pNull = new Partial((Chronology) null);
        assertEquals(isoChronology, pNull.getChronology());

        Chronology coptic = CopticChronology.getInstanceUTC();
        Partial pCoptic = new Partial(coptic);
        assertEquals(coptic, pCoptic.getChronology());
        assertEquals(0, pCoptic.size());
    }

    @Test
    public void testConstructor_Type_Value() {
        Partial p = new Partial(DateTimeFieldType.year(), 2023);
        assertEquals(1, p.size());
        assertEquals(DateTimeFieldType.year(), p.getFieldType(0));
        assertEquals(2023, p.getValue(0));
        assertEquals(isoChronology, p.getChronology());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Type_Value_NullType() {
        new Partial((DateTimeFieldType) null, 2023);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Type_Value_InvalidValue() {
        new Partial(DateTimeFieldType.monthOfYear(), 13);
    }

    @Test
    public void testConstructor_Type_Value_Chronology() {
        Chronology bud = BuddhistChronology.getInstanceUTC();
        Partial p = new Partial(DateTimeFieldType.year(), 2566, bud);
        assertEquals(bud, p.getChronology());
        assertEquals(2566, p.getValue(0));
    }

    @Test
    public void testConstructor_Arrays_Empty() {
        DateTimeFieldType[] types = new DateTimeFieldType[0];
        int[] values = new int[0];
        Partial p = new Partial(types, values);
        assertEquals(0, p.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Arrays_NullTypes() {
        new Partial(null, new int[]{1});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Arrays_NullValues() {
        new Partial(new DateTimeFieldType[]{DateTimeFieldType.year()}, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Arrays_MismatchedLength() {
        new Partial(new DateTimeFieldType[]{DateTimeFieldType.year()}, new int[]{2023, 12});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Arrays_NullElementInTypes() {
        DateTimeFieldType[] types = new DateTimeFieldType[]{DateTimeFieldType.year(), null};
        int[] values = new int[]{2023, 5};
        new Partial(types, values);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Arrays_InvalidOrderUnitField() {
        // monthOfYear < year (order is reversed: month first, year second)
        DateTimeFieldType[] types = new DateTimeFieldType[]{DateTimeFieldType.monthOfYear(), DateTimeFieldType.year()};
        int[] values = new int[]{5, 2023};
        new Partial(types, values);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Arrays_DuplicateSameUnitNoRange() {
        DateTimeFieldType[] types = new DateTimeFieldType[]{DateTimeFieldType.era(), DateTimeFieldType.era()};
        int[] values = new int[]{1, 1};
        new Partial(types, values);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Arrays_SameUnit_FirstHasRange_SecondNoRange() {
        DateTimeFieldType[] types = new DateTimeFieldType[]{DateTimeFieldType.yearOfEra(), DateTimeFieldType.year()};
        int[] values = new int[]{2023, 2023};
        new Partial(types, values);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Arrays_SameUnit_LastRangeSmaller() {
        // dayOfWeek (range week) and dayOfMonth (range month) -> unit is day.
        // week < month, so dayOfWeek before dayOfMonth is invalid order
        DateTimeFieldType[] types = new DateTimeFieldType[]{DateTimeFieldType.dayOfWeek(), DateTimeFieldType.dayOfMonth()};
        int[] values = new int[]{1, 1};
        new Partial(types, values);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_Arrays_SameUnit_DuplicateRange() {
        DateTimeFieldType[] types = new DateTimeFieldType[]{DateTimeFieldType.dayOfMonth(), DateTimeFieldType.dayOfMonth()};
        int[] values = new int[]{1, 2};
        new Partial(types, values);
    }

    @Test
    public void testConstructor_Arrays_SameUnit_ValidRangeOrdering() {
        // dayOfMonth (range month) > dayOfWeek (range week) -> Valid
        DateTimeFieldType[] types = new DateTimeFieldType[]{DateTimeFieldType.dayOfMonth(), DateTimeFieldType.dayOfWeek()};
        int[] values = new int[]{15, 3};
        Partial p = new Partial(types, values);
        assertEquals(2, p.size());
    }

    @Test
    public void testConstructor_ReadablePartial_Copy() {
        Partial src = new Partial(DateTimeFieldType.hourOfDay(), 10)
                .with(DateTimeFieldType.minuteOfHour(), 30);
        Partial copy = new Partial(src);
        assertEquals(src.size(), copy.size());
        assertEquals(src.getValue(0), copy.getValue(0));
        assertEquals(src.getValue(1), copy.getValue(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_ReadablePartial_Null() {
        new Partial((ReadablePartial) null);
    }

    // -----------------------------------------------------------------------
    // Core Methods Tests
    // -----------------------------------------------------------------------

    @Test
    public void testWithChronologyRetainFields() {
        Partial p = new Partial(DateTimeFieldType.year(), 2023);
        assertSame(p, p.withChronologyRetainFields(null));
        assertSame(p, p.withChronologyRetainFields(isoChronology));

        Chronology bud = BuddhistChronology.getInstanceUTC();
        Partial budPartial = p.withChronologyRetainFields(bud);
        assertEquals(bud, budPartial.getChronology());
        assertEquals(2023, budPartial.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithChronologyRetainFields_InvalidInNewChrono() {
        Partial p = new Partial(DateTimeFieldType.dayOfMonth(), 31)
                .with(DateTimeFieldType.monthOfYear(), 2);
        // February 31 is invalid in ISO
        p.withChronologyRetainFields(GJChronology.getInstanceUTC());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWith_NullType() {
        Partial p = new Partial();
        p.with(null, 1);
    }

    @Test
    public void testWith_AddField() {
        Partial p = new Partial();
        // Insert into empty
        p = p.with(DateTimeFieldType.minuteOfHour(), 30);
        assertEquals(1, p.size());
        assertEquals(30, p.getValue(0));

        // Insert larger unit (hour > minute) -> inserted at index 0
        p = p.with(DateTimeFieldType.hourOfDay(), 12);
        assertEquals(2, p.size());
        assertEquals(DateTimeFieldType.hourOfDay(), p.getFieldType(0));
        assertEquals(DateTimeFieldType.minuteOfHour(), p.getFieldType(1));

        // Insert smaller unit (second < minute) -> inserted at index 2
        p = p.with(DateTimeFieldType.secondOfMinute(), 45);
        assertEquals(3, p.size());
        assertEquals(DateTimeFieldType.secondOfMinute(), p.getFieldType(2));

        // Insert between hour and minute: not applicable here, but dayOfMonth before hourOfDay
        p = p.with(DateTimeFieldType.dayOfMonth(), 15);
        assertEquals(4, p.size());
        assertEquals(DateTimeFieldType.dayOfMonth(), p.getFieldType(0));

        // Insert same unit but distinct range: dayOfWeek after dayOfMonth
        p = p.with(DateTimeFieldType.dayOfWeek(), 2);
        assertEquals(5, p.size());
        assertEquals(DateTimeFieldType.dayOfMonth(), p.getFieldType(0));
        assertEquals(DateTimeFieldType.dayOfWeek(), p.getFieldType(1));
    }

    @Test
    public void testWith_ExistingField() {
        Partial p = new Partial(DateTimeFieldType.year(), 2023);
        // Same value -> returns this
        assertSame(p, p.with(DateTimeFieldType.year(), 2023));
        // Different value -> returns modified copy
        Partial p2 = p.with(DateTimeFieldType.year(), 2024);
        assertNotSame(p, p2);
        assertEquals(2024, p2.getValue(0));
    }

    @Test
    public void testWithout() {
        Partial p = new Partial(DateTimeFieldType.year(), 2023)
                .with(DateTimeFieldType.monthOfYear(), 5)
                .with(DateTimeFieldType.dayOfMonth(), 10);

        // Remove non-existing field
        assertSame(p, p.without(DateTimeFieldType.hourOfDay()));
        assertSame(p, p.without(null));

        // Remove existing middle field
        Partial p2 = p.without(DateTimeFieldType.monthOfYear());
        assertEquals(2, p2.size());
        assertEquals(DateTimeFieldType.year(), p2.getFieldType(0));
        assertEquals(DateTimeFieldType.dayOfMonth(), p2.getFieldType(1));

        // Remove first
        Partial p3 = p2.without(DateTimeFieldType.year());
        assertEquals(1, p3.size());
        assertEquals(DateTimeFieldType.dayOfMonth(), p3.getFieldType(0));

        // Remove last remaining
        Partial p4 = p3.without(DateTimeFieldType.dayOfMonth());
        assertEquals(0, p4.size());
    }

    @Test
    public void testWithField() {
        Partial p = new Partial(DateTimeFieldType.year(), 2023);
        assertSame(p, p.withField(DateTimeFieldType.year(), 2023));

        Partial p2 = p.withField(DateTimeFieldType.year(), 2025);
        assertEquals(2025, p2.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithField_Unsupported() {
        Partial p = new Partial(DateTimeFieldType.year(), 2023);
        p.withField(DateTimeFieldType.monthOfYear(), 5);
    }

    @Test
    public void testWithFieldAdded() {
        Partial p = new Partial(DateTimeFieldType.hourOfDay(), 10)
                .with(DateTimeFieldType.minuteOfHour(), 30);

        assertSame(p, p.withFieldAdded(DurationFieldType.minutes(), 0));

        Partial p2 = p.withFieldAdded(DurationFieldType.minutes(), 15);
        assertEquals(45, p2.getValue(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAdded_Unsupported() {
        Partial p = new Partial(DateTimeFieldType.hourOfDay(), 10);
        p.withFieldAdded(DurationFieldType.days(), 1);
    }

    @Test
    public void testWithFieldAddWrapped() {
        Partial p = new Partial(DateTimeFieldType.hourOfDay(), 23)
                .with(DateTimeFieldType.minuteOfHour(), 50);

        assertSame(p, p.withFieldAddWrapped(DurationFieldType.minutes(), 0));

        Partial p2 = p.withFieldAddWrapped(DurationFieldType.minutes(), 20);
        assertEquals(10, p2.getValue(1)); // wrapped within minute/hour
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAddWrapped_Unsupported() {
        Partial p = new Partial(DateTimeFieldType.hourOfDay(), 10);
        p.withFieldAddWrapped(DurationFieldType.days(), 1);
    }

    @Test
    public void testWithPeriodAdded_AndPlusMinus() {
        Partial p = new Partial(DateTimeFieldType.year(), 2020)
                .with(DateTimeFieldType.monthOfYear(), 6);

        // Null period or zero scalar
        assertSame(p, p.withPeriodAdded(null, 1));
        assertSame(p, p.withPeriodAdded(Period.years(1), 0));
        assertSame(p, p.plus(null));
        assertSame(p, p.minus(null));

        // Mixed matching and unmatching fields
        Period period = new Period().withYears(2).withMonths(3).withDays(10);
        Partial pPlus = p.plus(period);
        assertEquals(2022, pPlus.getValue(0));
        assertEquals(9, pPlus.getValue(1));

        Partial pMinus = p.minus(period);
        assertEquals(2018, pMinus.getValue(0));
        assertEquals(3, pMinus.getValue(1));
    }

    // -----------------------------------------------------------------------
    // Matching Tests
    // -----------------------------------------------------------------------

    @Test
    public void testIsMatch_Instant() {
        DateTime dt = new DateTime(2023, 5, 20, 12, 30, 0, 0, DateTimeZone.UTC);

        Partial pMatch = new Partial(DateTimeFieldType.year(), 2023)
                .with(DateTimeFieldType.monthOfYear(), 5);
        assertTrue(pMatch.isMatch(dt));

        Partial pNoMatch = new Partial(DateTimeFieldType.year(), 2022);
        assertFalse(pNoMatch.isMatch(dt));

        // Null instant uses now
        Partial pEmpty = new Partial();
        assertTrue(pEmpty.isMatch((ReadableInstant) null));
    }

    @Test
    public void testIsMatch_Partial() {
        Partial p1 = new Partial(DateTimeFieldType.year(), 2023)
                .with(DateTimeFieldType.monthOfYear(), 5);
        Partial p2 = new Partial(DateTimeFieldType.year(), 2023)
                .with(DateTimeFieldType.monthOfYear(), 5)
                .with(DateTimeFieldType.dayOfMonth(), 20);
        Partial p3 = new Partial(DateTimeFieldType.year(), 2023)
                .with(DateTimeFieldType.monthOfYear(), 6);

        assertTrue(p1.isMatch(p2));
        assertFalse(p1.isMatch(p3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsMatch_Partial_Null() {
        Partial p = new Partial(DateTimeFieldType.year(), 2023);
        p.isMatch((ReadablePartial) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsMatch_Partial_MissingFieldInTarget() {
        Partial p1 = new Partial(DateTimeFieldType.year(), 2023);
        Partial p2 = new Partial(DateTimeFieldType.monthOfYear(), 5);
        p1.isMatch(p2); // p2 lacks year field -> throws IAE from target.get()
    }

    // -----------------------------------------------------------------------
    // Formatting & ToString Tests
    // -----------------------------------------------------------------------

    @Test
    public void testToString_Formats() {
        Partial empty = new Partial();
        assertNull(empty.getFormatter());
        assertEquals("[]", empty.toString());

        Partial p = new Partial(DateTimeFieldType.year(), 2023)
                .with(DateTimeFieldType.monthOfYear(), 5)
                .with(DateTimeFieldType.dayOfMonth(), 20);
        assertEquals("2023-05-20", p.toString());
        assertEquals("[year=2023, monthOfYear=5, dayOfMonth=20]", p.toStringList());

        // Custom patterns
        assertEquals("2023/05/20", p.toString("yyyy/MM/dd"));
        assertEquals("2023/05/20", p.toString("yyyy/MM/dd", Locale.US));
        assertEquals("2023-05-20", p.toString(null));
        assertEquals("2023-05-20", p.toString(null, Locale.US));

        // Non ISO standard combinations (fallback to toStringList())
        Partial pNonIso = new Partial(DateTimeFieldType.dayOfWeek(), 3)
                .with(DateTimeFieldType.minuteOfHour(), 15);
        assertEquals("[dayOfWeek=3, minuteOfHour=15]", pNonIso.toString());
    }

    // -----------------------------------------------------------------------
    // Property Inner Class Tests
    // -----------------------------------------------------------------------

    @Test
    public void testProperty() {
        Partial p = new Partial(DateTimeFieldType.year(), 2023)
                .with(DateTimeFieldType.monthOfYear(), 5);

        Partial.Property prop = p.property(DateTimeFieldType.monthOfYear());
        assertNotNull(prop.getField());
        assertSame(p, prop.getReadablePartial());
        assertSame(p, prop.getPartial());
        assertEquals(5, prop.get());

        // addToCopy
        Partial pAdd = prop.addToCopy(2);
        assertEquals(7, pAdd.get(DateTimeFieldType.monthOfYear()));

        // addWrapFieldToCopy
        Partial pWrap = prop.addWrapFieldToCopy(10); // 5 + 10 = 15 -> wraps to 3
        assertEquals(3, pWrap.get(DateTimeFieldType.monthOfYear()));

        // setCopy int & string
        Partial pSetInt = prop.setCopy(11);
        assertEquals(11, pSetInt.get(DateTimeFieldType.monthOfYear()));

        Partial pSetStr = prop.setCopy("8");
        assertEquals(8, pSetStr.get(DateTimeFieldType.monthOfYear()));

        Partial pSetStrLocale = prop.setCopy("December", Locale.ENGLISH);
        assertEquals(12, pSetStrLocale.get(DateTimeFieldType.monthOfYear()));

        // withMaximumValue and withMinimumValue
        Partial pMax = prop.withMaximumValue();
        assertEquals(12, pMax.get(DateTimeFieldType.monthOfYear()));

        Partial pMin = prop.withMinimumValue();
        assertEquals(1, pMin.get(DateTimeFieldType.monthOfYear()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProperty_UnsupportedField() {
        Partial p = new Partial(DateTimeFieldType.year(), 2023);
        p.property(DateTimeFieldType.dayOfMonth());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProperty_NullField() {
        Partial p = new Partial(DateTimeFieldType.year(), 2023);
        p.property(null);
    }
}