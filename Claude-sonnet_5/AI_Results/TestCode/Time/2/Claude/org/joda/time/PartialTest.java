package org.joda.time;

import static org.junit.Assert.*;

import org.junit.Test;

import org.joda.time.Partial;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.Chronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.ReadablePartial;
import org.joda.time.format.DateTimeFormatter;

import java.util.Locale;

public class PartialTest {

    // ---------------------------------------------------------------
    // Constructors
    // ---------------------------------------------------------------

    @Test
    public void testDefaultConstructor() {
        Partial p = new Partial();
        assertEquals(0, p.size());
        assertEquals(ISOChronology.getInstanceUTC(), p.getChronology());
    }

    @Test
    public void testChronologyConstructorNull() {
        Partial p = new Partial((Chronology) null);
        assertEquals(0, p.size());
        assertEquals(ISOChronology.getInstanceUTC(), p.getChronology());
    }

    @Test
    public void testSingleFieldConstructor() {
        Partial p = new Partial(DateTimeFieldType.year(), 2005);
        assertEquals(1, p.size());
        assertEquals(DateTimeFieldType.year(), p.getFieldType(0));
        assertEquals(2005, p.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSingleFieldConstructorNullType() {
        new Partial((DateTimeFieldType) null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSingleFieldConstructorInvalidValue() {
        // monthOfYear ต้องอยู่ในช่วง 1-12
        new Partial(DateTimeFieldType.monthOfYear(), 13, null);
    }

    @Test
    public void testArrayConstructorValid() {
        DateTimeFieldType[] types = {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth()};
        int[] values = {2005, 6, 15};
        Partial p = new Partial(types, values);
        assertEquals(3, p.size());
        assertEquals(2005, p.getValue(0));
        assertEquals(6, p.getValue(1));
        assertEquals(15, p.getValue(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayConstructorNullTypes() {
        new Partial((DateTimeFieldType[]) null, new int[] {1});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayConstructorNullValues() {
        new Partial(new DateTimeFieldType[] {DateTimeFieldType.year()}, (int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayConstructorLengthMismatch() {
        new Partial(new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()},
                new int[] {2005});
    }

    @Test
    public void testArrayConstructorEmptyArrays() {
        Partial p = new Partial(new DateTimeFieldType[0], new int[0]);
        assertEquals(0, p.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayConstructorNullElementInTypes() {
        new Partial(new DateTimeFieldType[] {DateTimeFieldType.year(), null}, new int[] {2005, 1});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayConstructorOutOfOrder() {
        // dayOfMonth มาก่อน monthOfYear -> เล็กมาก่อนใหญ่ -> ผิดลำดับ
        new Partial(new DateTimeFieldType[] {DateTimeFieldType.dayOfMonth(), DateTimeFieldType.monthOfYear()},
                new int[] {15, 6});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayConstructorDuplicateTypes() {
        new Partial(new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.year()},
                new int[] {2005, 2006});
    }

    @Test
    public void testCopyConstructorFromReadablePartial() {
        Partial original = new Partial(DateTimeFieldType.year(), 2005);
        Partial copy = new Partial((ReadablePartial) original);
        assertEquals(original.size(), copy.size());
        assertEquals(original.getValue(0), copy.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCopyConstructorNull() {
        new Partial((ReadablePartial) null);
    }

    // ---------------------------------------------------------------
    // size / chronology / fields accessors
    // ---------------------------------------------------------------

    @Test
    public void testSizeAndChronology() {
        Partial p = new Partial(DateTimeFieldType.year(), 2000);
        assertEquals(1, p.size());
        assertNotNull(p.getChronology());
    }

    @Test
    public void testGetFieldTypeValid() {
        Partial p = new Partial(DateTimeFieldType.year(), 2000);
        assertEquals(DateTimeFieldType.year(), p.getFieldType(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetFieldTypeInvalidIndex() {
        Partial p = new Partial(DateTimeFieldType.year(), 2000);
        p.getFieldType(5);
    }

    @Test
    public void testGetFieldTypesClone() {
        Partial p = new Partial(DateTimeFieldType.year(), 2000);
        DateTimeFieldType[] types = p.getFieldTypes();
        types[0] = DateTimeFieldType.monthOfYear(); // แก้ array ที่คืนมาไม่ควรกระทบภายใน
        assertEquals(DateTimeFieldType.year(), p.getFieldType(0));
    }

    @Test
    public void testGetValueValid() {
        Partial p = new Partial(DateTimeFieldType.year(), 2000);
        assertEquals(2000, p.getValue(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValueInvalidIndex() {
        Partial p = new Partial(DateTimeFieldType.year(), 2000);
        p.getValue(5);
    }

    @Test
    public void testGetValuesClone() {
        Partial p = new Partial(DateTimeFieldType.year(), 2000);
        int[] values = p.getValues();
        values[0] = 1999;
        assertEquals(2000, p.getValue(0));
    }

    // ---------------------------------------------------------------
    // withChronologyRetainFields
    // ---------------------------------------------------------------

    @Test
    public void testWithChronologyRetainFieldsSame() {
        Partial p = new Partial(DateTimeFieldType.year(), 2000);
        Partial result = p.withChronologyRetainFields(p.getChronology());
        assertSame(p, result);
    }

    @Test
    public void testWithChronologyRetainFieldsDifferent() {
        Partial p = new Partial(DateTimeFieldType.year(), 2000);
        Partial result = p.withChronologyRetainFields(GregorianChronology.getInstance());
        assertNotSame(p, result);
        assertEquals(2000, result.getValue(0));
    }

    // ---------------------------------------------------------------
    // with()
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testWithNullFieldType() {
        Partial p = new Partial();
        p.with(null, 1);
    }

    @Test
    public void testWithNewFieldAddedAtEnd() {
        Partial p = new Partial(DateTimeFieldType.year(), 2005);
        Partial result = p.with(DateTimeFieldType.monthOfYear(), 6);
        assertEquals(2, result.size());
        assertEquals(DateTimeFieldType.year(), result.getFieldType(0));
        assertEquals(DateTimeFieldType.monthOfYear(), result.getFieldType(1));
        assertEquals(6, result.getValue(1));
    }

    @Test
    public void testWithNewFieldInsertedAtFront() {
        DateTimeFieldType[] types = {DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth()};
        int[] values = {6, 15};
        Partial p = new Partial(types, values);
        Partial result = p.with(DateTimeFieldType.year(), 2005);
        assertEquals(3, result.size());
        assertEquals(DateTimeFieldType.year(), result.getFieldType(0));
        assertEquals(DateTimeFieldType.monthOfYear(), result.getFieldType(1));
        assertEquals(DateTimeFieldType.dayOfMonth(), result.getFieldType(2));
    }

    @Test
    public void testWithExistingFieldSameValue() {
        Partial p = new Partial(DateTimeFieldType.year(), 2005);
        Partial result = p.with(DateTimeFieldType.year(), 2005);
        assertSame(p, result);
    }

    @Test
    public void testWithExistingFieldDifferentValue() {
        Partial p = new Partial(DateTimeFieldType.year(), 2005);
        Partial result = p.with(DateTimeFieldType.year(), 2006);
        assertNotSame(p, result);
        assertEquals(2006, result.getValue(0));
    }

    // ---------------------------------------------------------------
    // without()
    // ---------------------------------------------------------------

    @Test
    public void testWithoutExistingField() {
        DateTimeFieldType[] types = {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()};
        int[] values = {2005, 6};
        Partial p = new Partial(types, values);
        Partial result = p.without(DateTimeFieldType.monthOfYear());
        assertEquals(1, result.size());
        assertEquals(DateTimeFieldType.year(), result.getFieldType(0));
    }

    @Test
    public void testWithoutNonExistingField() {
        Partial p = new Partial(DateTimeFieldType.year(), 2005);
        Partial result = p.without(DateTimeFieldType.monthOfYear());
        assertSame(p, result);
    }

    @Test
    public void testWithoutNullFieldType() {
        // สมมติฐาน: indexOf(null) คืน -1 เสมอเพราะไม่มี field ที่ equals กับ null
        Partial p = new Partial(DateTimeFieldType.year(), 2005);
        Partial result = p.without(null);
        assertSame(p, result);
    }

    // ---------------------------------------------------------------
    // withField()
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldUnsupported() {
        Partial p = new Partial(DateTimeFieldType.year(), 2005);
        p.withField(DateTimeFieldType.monthOfYear(), 6);
    }

    @Test
    public void testWithFieldSameValue() {
        Partial p = new Partial(DateTimeFieldType.year(), 2005);
        Partial result = p.withField(DateTimeFieldType.year(), 2005);
        assertSame(p, result);
    }

    @Test
    public void testWithFieldDifferentValue() {
        Partial p = new Partial(DateTimeFieldType.year(), 2005);
        Partial result = p.withField(DateTimeFieldType.year(), 2006);
        assertNotSame(p, result);
        assertEquals(2006, result.getValue(0));
    }

    // ---------------------------------------------------------------
    // withFieldAdded()
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAddedUnsupported() {
        Partial p = new Partial(DateTimeFieldType.year(), 2005);
        p.withFieldAdded(DurationFieldType.months(), 1);
    }

    @Test
    public void testWithFieldAddedZeroAmount() {
        Partial p = new Partial(DateTimeFieldType.year(), 2005);
        Partial result = p.withFieldAdded(DurationFieldType.years(), 0);
        assertSame(p, result);
    }

    @Test
    public void testWithFieldAddedNonZero() {
        Partial p = new Partial(DateTimeFieldType.year(), 2005);
        Partial result = p.withFieldAdded(DurationFieldType.years(), 1);
        assertEquals(2006, result.getValue(0));
    }

    // ---------------------------------------------------------------
    // withFieldAddWrapped()
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAddWrappedUnsupported() {
        Partial p = new Partial(DateTimeFieldType.year(), 2005);
        p.withFieldAddWrapped(DurationFieldType.months(), 1);
    }

    @Test
    public void testWithFieldAddWrappedZeroAmount() {
        Partial p = new Partial(DateTimeFieldType.year(), 2005);
        Partial result = p.withFieldAddWrapped(DurationFieldType.years(), 0);
        assertSame(p, result);
    }

    @Test
    public void testWithFieldAddWrappedNonZero() {
        // NOTE: สมมติฐานว่า addWrapPartial สำหรับ single-field partial
        // จะ wrap ภายใน field เดียวกัน (12 -> 1) เนื่องจากไม่มี field ที่ใหญ่กว่าในพาเชียล
        DateTimeFieldType[] types = {DateTimeFieldType.monthOfYear()};
        int[] values = {12};
        Partial p = new Partial(types, values);
        Partial result = p.withFieldAddWrapped(DurationFieldType.months(), 1);
        assertEquals(1, result.getValue(0));
    }

    // ---------------------------------------------------------------
    // withPeriodAdded() / plus() / minus()
    // ---------------------------------------------------------------

    @Test
    public void testWithPeriodAddedNullPeriod() {
        Partial p = new Partial(DateTimeFieldType.year(), 2005);
        Partial result = p.withPeriodAdded(null, 1);
        assertSame(p, result);
    }

    @Test
    public void testWithPeriodAddedZeroScalar() {
        Partial p = new Partial(DateTimeFieldType.year(), 2005);
        Period period = new Period(1, 0, 0, 0, 0, 0, 0, 0);
        Partial result = p.withPeriodAdded(period, 0);
        assertSame(p, result);
    }

    @Test
    public void testWithPeriodAddedMatchingField() {
        Partial p = new Partial(DateTimeFieldType.year(), 2005);
        Period period = new Period(1, 0, 0, 0, 0, 0, 0, 0); // years = 1
        Partial result = p.withPeriodAdded(period, 1);
        assertEquals(2006, result.getValue(0));
    }

    @Test
    public void testWithPeriodAddedNonMatchingFieldIgnored() {
        Partial p = new Partial(DateTimeFieldType.year(), 2005);
        Period period = new Period(0, 1, 0, 0, 0, 0, 0, 0); // months ไม่ถูกรองรับ
        Partial result = p.withPeriodAdded(period, 1);
        assertEquals(2005, result.getValue(0));
    }

    @Test
    public void testPlus() {
        Partial p = new Partial(DateTimeFieldType.year(), 2005);
        Period period = new Period(1, 0, 0, 0, 0, 0, 0, 0);
        Partial result = p.plus(period);
        assertEquals(2006, result.getValue(0));
    }

    @Test
    public void testMinus() {
        Partial p = new Partial(DateTimeFieldType.year(), 2005);
        Period period = new Period(1, 0, 0, 0, 0, 0, 0, 0);
        Partial result = p.minus(period);
        assertEquals(2004, result.getValue(0));
    }

    // ---------------------------------------------------------------
    // property()
    // ---------------------------------------------------------------

    @Test
    public void testPropertyValid() {
        Partial p = new Partial(DateTimeFieldType.year(), 2005);
        Partial.Property prop = p.property(DateTimeFieldType.year());
        assertEquals(2005, prop.get());
        assertSame(p, prop.getPartial());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPropertyUnsupported() {
        Partial p = new Partial(DateTimeFieldType.year(), 2005);
        p.property(DateTimeFieldType.monthOfYear());
    }

    // ---------------------------------------------------------------
    // isMatch(ReadableInstant)
    // ---------------------------------------------------------------

    @Test
    public void testIsMatchInstantEmptyPartialAlwaysTrue() {
        Partial p = new Partial();
        DateTime dt = new DateTime(2005, 6, 15, 0, 0, 0, 0);
        assertTrue(p.isMatch(dt));
    }

    @Test
    public void testIsMatchInstantTrue() {
        Partial p = new Partial(DateTimeFieldType.year(), 2005);
        DateTime dt = new DateTime(2005, 6, 15, 0, 0, 0, 0);
        assertTrue(p.isMatch(dt));
    }

    @Test
    public void testIsMatchInstantFalse() {
        Partial p = new Partial(DateTimeFieldType.year(), 2005);
        DateTime dt = new DateTime(2006, 6, 15, 0, 0, 0, 0);
        assertFalse(p.isMatch(dt));
    }

    // ---------------------------------------------------------------
    // isMatch(ReadablePartial)
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testIsMatchPartialNull() {
        Partial p = new Partial(DateTimeFieldType.year(), 2005);
        p.isMatch((ReadablePartial) null);
    }

    @Test
    public void testIsMatchPartialTrue() {
        Partial p1 = new Partial(DateTimeFieldType.year(), 2005);
        Partial p2 = new Partial(DateTimeFieldType.year(), 2005);
        assertTrue(p1.isMatch(p2));
    }

    @Test
    public void testIsMatchPartialFalse() {
        Partial p1 = new Partial(DateTimeFieldType.year(), 2005);
        Partial p2 = new Partial(DateTimeFieldType.year(), 2006);
        assertFalse(p1.isMatch(p2));
    }

    // ---------------------------------------------------------------
    // getFormatter() / toString family
    // ---------------------------------------------------------------

    @Test
    public void testGetFormatterEmptyPartial() {
        Partial p = new Partial();
        assertNull(p.getFormatter());
    }

    @Test
    public void testGetFormatterValidFields() {
        DateTimeFieldType[] types = {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth()};
        int[] values = {2005, 6, 15};
        Partial p = new Partial(types, values);
        DateTimeFormatter f = p.getFormatter();
        assertNotNull(f);
    }

    @Test
    public void testToStringListEmpty() {
        Partial p = new Partial();
        assertEquals("[]", p.toStringList());
    }

    @Test
    public void testToStringListWithFields() {
        DateTimeFieldType[] types = {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()};
        int[] values = {2005, 6};
        Partial p = new Partial(types, values);
        String s = p.toStringList();
        assertTrue(s.startsWith("["));
        assertTrue(s.contains("year=2005"));
        assertTrue(s.contains("monthOfYear=6"));
    }

    @Test
    public void testToStringWithFullIsoFormat() {
        DateTimeFieldType[] types = {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth()};
        int[] values = {2005, 6, 15};
        Partial p = new Partial(types, values);
        String s = p.toString();
        assertEquals("2005-06-15", s);
    }

    @Test
    public void testToStringPatternNull() {
        Partial p = new Partial(DateTimeFieldType.year(), 2005);
        assertEquals(p.toString(), p.toString((String) null));
    }

    @Test
    public void testToStringPatternValid() {
        Partial p = new Partial(DateTimeFieldType.year(), 2005);
        String s = p.toString("yyyy");
        assertEquals("2005", s);
    }

    @Test
    public void testToStringPatternLocaleNull() {
        Partial p = new Partial(DateTimeFieldType.year(), 2005);
        assertEquals(p.toString(), p.toString(null, Locale.US));
    }

    @Test
    public void testToStringPatternWithLocale() {
        Partial p = new Partial(DateTimeFieldType.year(), 2005);
        String s = p.toString("yyyy", Locale.US);
        assertEquals("2005", s);
    }

    // ---------------------------------------------------------------
    // Property class
    // ---------------------------------------------------------------

    @Test
    public void testPropertyGetField() {
        Partial p = new Partial(DateTimeFieldType.year(), 2005);
        Partial.Property prop = p.property(DateTimeFieldType.year());
        assertNotNull(prop.getField());
    }

    @Test
    public void testPropertyAddToCopy() {
        Partial p = new Partial(DateTimeFieldType.year(), 2005);
        Partial.Property prop = p.property(DateTimeFieldType.year());
        Partial result = prop.addToCopy(1);
        assertEquals(2006, result.getValue(0));
    }

    @Test
    public void testPropertyAddWrapFieldToCopy() {
        DateTimeFieldType[] types = {DateTimeFieldType.monthOfYear()};
        int[] values = {12};
        Partial p = new Partial(types, values);
        Partial.Property prop = p.property(DateTimeFieldType.monthOfYear());
        Partial result = prop.addWrapFieldToCopy(1);
        assertEquals(1, result.getValue(0));
    }

    @Test
    public void testPropertySetCopyInt() {
        Partial p = new Partial(DateTimeFieldType.year(), 2005);
        Partial.Property prop = p.property(DateTimeFieldType.year());
        Partial result = prop.setCopy(2010);
        assertEquals(2010, result.getValue(0));
    }

    @Test
    public void testPropertySetCopyString() {
        DateTimeFieldType[] types = {DateTimeFieldType.monthOfYear()};
        int[] values = {1};
        Partial p = new Partial(types, values);
        Partial.Property prop = p.property(DateTimeFieldType.monthOfYear());
        Partial result = prop.setCopy("December");
        assertEquals(12, result.getValue(0));
    }

    @Test
    public void testPropertySetCopyStringWithLocale() {
        DateTimeFieldType[] types = {DateTimeFieldType.monthOfYear()};
        int[] values = {1};
        Partial p = new Partial(types, values);
        Partial.Property prop = p.property(DateTimeFieldType.monthOfYear());
        Partial result = prop.setCopy("December", Locale.ENGLISH);
        assertEquals(12, result.getValue(0));
    }

    @Test
    public void testPropertyWithMaximumValue() {
        DateTimeFieldType[] types = {DateTimeFieldType.monthOfYear()};
        int[] values = {5};
        Partial p = new Partial(types, values);
        Partial.Property prop = p.property(DateTimeFieldType.monthOfYear());
        Partial result = prop.withMaximumValue();
        assertEquals(12, result.getValue(0));
    }

    @Test
    public void testPropertyWithMinimumValue() {
        DateTimeFieldType[] types = {DateTimeFieldType.monthOfYear()};
        int[] values = {5};
        Partial p = new Partial(types, values);
        Partial.Property prop = p.property(DateTimeFieldType.monthOfYear());
        Partial result = prop.withMinimumValue();
        assertEquals(1, result.getValue(0));
    }
}
