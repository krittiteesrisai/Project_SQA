package org.joda.time;

import static org.junit.Assert.*;

import java.util.Locale;

import org.junit.Test;

import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * JUnit4 test suite for org.joda.time.Partial (Defects4J Time-1b)
 *
 * หมายเหตุทั่วไป:
 * - ใช้ public API เป็นหลัก ยกเว้นบางจุดที่ตรวจสอบ branch ภายใน constructor
 *   โดยใช้ field type ที่ public ทุกตัว (ไม่ใช้ constructor package-private โดยตรง)
 * - บาง test ถูกเขียนตามสัญญาที่ Javadoc ระบุไว้ ("Types array must be in order
 *   largest-smallest") ถึงแม้ source ปัจจุบันอาจมี defect ทำให้ไม่ throw
 *   ตามที่ควร -> จุดประสงค์คือดักจับ fault ดังกล่าว (คอมเมนต์ไว้ชัดเจนในแต่ละจุด)
 */
public class PartialTest {

    // ===================== Constructors =====================

    @Test
    public void testConstructor_default() {
        Partial p = new Partial();
        assertEquals(0, p.size());
        assertEquals(ISOChronology.getInstanceUTC(), p.getChronology());
    }

    @Test
    public void testConstructor_chronologyNull() {
        Partial p = new Partial((Chronology) null);
        assertEquals(ISOChronology.getInstanceUTC(), p.getChronology());
        assertEquals(0, p.size());
    }

    @Test
    public void testConstructor_chronologyNonNull() {
        Chronology chrono = GJChronology.getInstance();
        Partial p = new Partial(chrono);
        assertEquals(chrono.withUTC(), p.getChronology());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_typeValue_nullType() {
        new Partial((DateTimeFieldType) null, 1);
    }

    @Test
    public void testConstructor_typeValue_valid() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 6);
        assertEquals(1, p.size());
        assertEquals(6, p.getValue(0));
        assertEquals(DateTimeFieldType.monthOfYear(), p.getFieldType(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_typeValue_invalidValue() {
        // month = 13 ไม่ถูกต้อง -> chronology.validate ต้อง throw
        new Partial(DateTimeFieldType.monthOfYear(), 13);
    }

    @Test
    public void testConstructor_typeValueChronology_nonNull() {
        Chronology chrono = GJChronology.getInstance();
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 5, chrono);
        assertEquals(chrono.withUTC(), p.getChronology());
        assertEquals(5, p.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_typesValues_nullTypes() {
        new Partial((DateTimeFieldType[]) null, new int[] {1});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_typesValues_nullValues() {
        new Partial(new DateTimeFieldType[] {DateTimeFieldType.year()}, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_typesValues_lengthMismatch() {
        new Partial(new DateTimeFieldType[] {DateTimeFieldType.year()}, new int[] {1, 2});
    }

    @Test
    public void testConstructor_typesValues_emptyArrays() {
        Partial p = new Partial(new DateTimeFieldType[0], new int[0]);
        assertEquals(0, p.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_typesValues_nullElement() {
        new Partial(new DateTimeFieldType[] {DateTimeFieldType.year(), null}, new int[] {2000, 1});
    }

    @Test
    public void testConstructor_typesValues_validOrder() {
        DateTimeFieldType[] types = {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth()};
        int[] values = {2004, 6, 9};
        Partial p = new Partial(types, values);
        assertEquals(3, p.size());
        assertEquals(2004, p.getValue(0));
        assertEquals(6, p.getValue(1));
        assertEquals(9, p.getValue(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_typesValues_outOfOrder_unitCompareLessThanZero() {
        // monthOfYear (เล็ก) มาก่อน year (ใหญ่) -> compare < 0 -> throw
        DateTimeFieldType[] types = {DateTimeFieldType.monthOfYear(), DateTimeFieldType.year()};
        int[] values = {6, 2004};
        new Partial(types, values);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_typesValues_duplicateSameType() {
        // ฟิลด์เดียวกันซ้ำ -> duration เท่ากัน, range เท่ากัน -> duplicate
        new Partial(new DateTimeFieldType[] {DateTimeFieldType.dayOfMonth(), DateTimeFieldType.dayOfMonth()},
                new int[] {1, 2});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_typesValues_duplicateRangeBothNull() {
        // year() มี rangeDurationType == null ทั้งคู่ -> duplicate branch (last==null && loop==null)
        new Partial(new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.year()},
                new int[] {2000, 2001});
    }

    /**
     * ตามสัญญาของ Javadoc (constructor Partial(types,values,chronology)):
     * "Types array must be in order largest-smallest" และห้ามมีฟิลด์ที่ทับซ้อนกันแบบไม่ถูกต้อง
     * year() และ yearOfEra() มี duration เดียวกัน (years) แต่ year().getRangeDurationType() == null
     * ส่วน yearOfEra().getRangeDurationType() == eras (ไม่ null)
     * ตามเจตนาของโค้ดกรณีนี้ควร throw IllegalArgumentException เพราะลำดับไม่ชัดเจน/ขัดกัน
     * แต่จาก source ที่ให้มา branch "last.getRangeDurationType()==null && loop.getRangeDurationType()!=null"
     * ไม่มีการ throw ใด ๆ (ไม่มี else รองรับ) ซึ่งอาจเป็นจุดบกพร่อง (fault) ของคลาสนี้
     * -> test นี้เขียนตามสัญญาที่ Javadoc ระบุไว้เพื่อดักจับข้อบกพร่องดังกล่าว
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_typesValues_lastRangeNullLoopRangeNotNull_shouldRejectOrder_FAULT_CHECK() {
        new Partial(new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.yearOfEra()},
                new int[] {2000, 2000});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_typesValues_lastRangeNotNullLoopRangeNull() {
        // yearOfEra (range=eras,not null) แล้วตามด้วย year (range=null) -> branch throw "must be in order"
        new Partial(new DateTimeFieldType[] {DateTimeFieldType.yearOfEra(), DateTimeFieldType.year()},
                new int[] {2000, 2000});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_typesValues_rangeCompareLessThanZero() {
        // minuteOfHour (range=hours) แล้วตามด้วย minuteOfDay (range=days)
        // lastRangeField(hours).compareTo(loopRangeField(days)) < 0 -> throw order violation
        new Partial(new DateTimeFieldType[] {DateTimeFieldType.minuteOfHour(), DateTimeFieldType.minuteOfDay()},
                new int[] {30, 500});
    }

    @Test
    public void testConstructor_typesValues_rangeCompareGreaterThanZero_valid() {
        // minuteOfDay (range=days) แล้วตามด้วย minuteOfHour (range=hours) -> ไม่ throw (valid)
        Partial p = new Partial(new DateTimeFieldType[] {DateTimeFieldType.minuteOfDay(), DateTimeFieldType.minuteOfHour()},
                new int[] {500, 30});
        assertEquals(2, p.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_readablePartial_null() {
        new Partial((ReadablePartial) null);
    }

    @Test
    public void testConstructor_readablePartial_valid() {
        Partial source = new Partial(DateTimeFieldType.year(), 2000);
        Partial copy = new Partial(source);
        assertEquals(1, copy.size());
        assertEquals(2000, copy.getValue(0));
        assertEquals(source.getChronology(), copy.getChronology());
    }

    // ===================== Getters =====================

    @Test
    public void testGetters_basic() {
        DateTimeFieldType[] types = {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()};
        int[] values = {2004, 6};
        Partial p = new Partial(types, values);

        assertEquals(2, p.size());
        assertEquals(DateTimeFieldType.year(), p.getFieldType(0));
        assertEquals(DateTimeFieldType.monthOfYear(), p.getFieldType(1));
        assertArrayEquals(types, p.getFieldTypes());
        assertEquals(2004, p.getValue(0));
        assertEquals(6, p.getValue(1));
        assertArrayEquals(values, p.getValues());

        // ตรวจสอบว่า getFieldTypes()/getValues() คืนค่าเป็น clone ไม่ใช่ array ตัวเดียวกัน
        assertNotSame(types, p.getFieldTypes());
        assertNotSame(values, p.getValues());
    }

    // ===================== withChronologyRetainFields =====================

    @Test
    public void testWithChronologyRetainFields_sameChronology_returnsThis() {
        Partial p = new Partial();
        Partial p2 = p.withChronologyRetainFields(null);
        assertSame(p, p2);
    }

    @Test
    public void testWithChronologyRetainFields_differentChronology() {
        Partial p = new Partial(DateTimeFieldType.year(), 2000);
        Chronology newChrono = GJChronology.getInstance();
        Partial p2 = p.withChronologyRetainFields(newChrono);
        assertNotSame(p, p2);
        assertEquals(newChrono.withUTC(), p2.getChronology());
        assertEquals(2000, p2.getValue(0));
    }

    // ===================== with(fieldType, value) =====================

    @Test(expected = IllegalArgumentException.class)
    public void testWith_nullFieldType() {
        new Partial().with(null, 1);
    }

    @Test
    public void testWith_newFieldAtEnd() {
        Partial p = new Partial(DateTimeFieldType.year(), 2000);
        Partial p2 = p.with(DateTimeFieldType.monthOfYear(), 6);
        assertEquals(2, p2.size());
        assertEquals(DateTimeFieldType.year(), p2.getFieldType(0));
        assertEquals(DateTimeFieldType.monthOfYear(), p2.getFieldType(1));
    }

    @Test
    public void testWith_newFieldAtStart() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 6);
        Partial p2 = p.with(DateTimeFieldType.year(), 2000);
        assertEquals(2, p2.size());
        assertEquals(DateTimeFieldType.year(), p2.getFieldType(0));
        assertEquals(DateTimeFieldType.monthOfYear(), p2.getFieldType(1));
    }

    @Test
    public void testWith_sameValueReturnsThis() {
        Partial p = new Partial(DateTimeFieldType.year(), 2000);
        assertSame(p, p.with(DateTimeFieldType.year(), 2000));
    }

    @Test
    public void testWith_differentValue() {
        Partial p = new Partial(DateTimeFieldType.year(), 2000);
        Partial p2 = p.with(DateTimeFieldType.year(), 2001);
        assertNotSame(p, p2);
        assertEquals(2001, p2.getValue(0));
    }

    @Test
    public void testWith_insertMiddle_rangeCompareBreak() {
        // dayOfWeek (range=weeks) อยู่แล้ว, เพิ่ม dayOfMonth (range=months, duration เดียวกัน=days)
        // rangeField(months).compareTo(loopRangeField(weeks)) > 0 -> break -> insert ก่อน dayOfWeek
        Partial p = new Partial(DateTimeFieldType.dayOfWeek(), 3);
        Partial p2 = p.with(DateTimeFieldType.dayOfMonth(), 15);
        assertEquals(2, p2.size());
        assertEquals(DateTimeFieldType.dayOfMonth(), p2.getFieldType(0));
        assertEquals(DateTimeFieldType.dayOfWeek(), p2.getFieldType(1));
    }

    // ===================== without =====================

    @Test
    public void testWithout_fieldPresent() {
        Partial p = new Partial(new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()},
                new int[] {2000, 6});
        Partial p2 = p.without(DateTimeFieldType.monthOfYear());
        assertEquals(1, p2.size());
        assertEquals(DateTimeFieldType.year(), p2.getFieldType(0));
    }

    @Test
    public void testWithout_fieldAbsent_returnsThis() {
        Partial p = new Partial(DateTimeFieldType.year(), 2000);
        assertSame(p, p.without(DateTimeFieldType.monthOfYear()));
    }

    // ===================== withField =====================

    @Test(expected = IllegalArgumentException.class)
    public void testWithField_unsupported() {
        Partial p = new Partial(DateTimeFieldType.year(), 2000);
        p.withField(DateTimeFieldType.monthOfYear(), 6);
    }

    @Test
    public void testWithField_sameValue_returnsThis() {
        Partial p = new Partial(DateTimeFieldType.year(), 2000);
        assertSame(p, p.withField(DateTimeFieldType.year(), 2000));
    }

    @Test
    public void testWithField_differentValue() {
        Partial p = new Partial(DateTimeFieldType.year(), 2000);
        Partial p2 = p.withField(DateTimeFieldType.year(), 2005);
        assertEquals(2005, p2.getValue(0));
    }

    // ===================== withFieldAdded =====================

    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAdded_unsupported() {
        Partial p = new Partial(DateTimeFieldType.year(), 2000);
        p.withFieldAdded(DurationFieldType.months(), 1);
    }

    @Test
    public void testWithFieldAdded_zero_returnsThis() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 6);
        assertSame(p, p.withFieldAdded(DurationFieldType.months(), 0));
    }

    @Test
    public void testWithFieldAdded_nonZero() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 6);
        Partial p2 = p.withFieldAdded(DurationFieldType.months(), 2);
        assertEquals(8, p2.getValue(0));
    }

    // ===================== withFieldAddWrapped =====================

    @Test
    public void testWithFieldAddWrapped_zero_returnsThis() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 6);
        assertSame(p, p.withFieldAddWrapped(DurationFieldType.months(), 0));
    }

    @Test
    public void testWithFieldAddWrapped_wrap() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 12);
        Partial p2 = p.withFieldAddWrapped(DurationFieldType.months(), 1);
        assertEquals(1, p2.getValue(0)); // wrap กลับไปเดือน 1 โดยไม่กระทบฟิลด์อื่น (ไม่มีฟิลด์อื่นอยู่แล้ว)
    }

    // ===================== withPeriodAdded / plus / minus =====================

    @Test
    public void testWithPeriodAdded_nullPeriod_returnsThis() {
        Partial p = new Partial(DateTimeFieldType.year(), 2000);
        assertSame(p, p.withPeriodAdded(null, 1));
    }

    @Test
    public void testWithPeriodAdded_zeroScalar_returnsThis() {
        Partial p = new Partial(DateTimeFieldType.year(), 2000);
        Period period = new Period(1, 0, 0, 0, 0, 0, 0, 0);
        assertSame(p, p.withPeriodAdded(period, 0));
    }

    @Test
    public void testWithPeriodAdded_fieldNotPresent_ignored() {
        Partial p = new Partial(DateTimeFieldType.year(), 2000);
        // months ไม่ถูก support ใน p -> index < 0 -> ถูก skip, years ถูก support แต่ value=0 ไม่กระทบ
        Period period = new Period(0, 1, 0, 0, 0, 0, 0, 0);
        Partial p2 = p.withPeriodAdded(period, 1);
        assertEquals(2000, p2.getValue(0));
    }

    @Test
    public void testWithPeriodAdded_fieldPresent() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 6);
        Period period = new Period(0, 2, 0, 0, 0, 0, 0, 0);
        Partial p2 = p.withPeriodAdded(period, 1);
        assertEquals(8, p2.getValue(0));
    }

    @Test
    public void testPlus() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 6);
        Period period = new Period(0, 1, 0, 0, 0, 0, 0, 0);
        Partial p2 = p.plus(period);
        assertEquals(7, p2.getValue(0));
    }

    @Test
    public void testMinus() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 6);
        Period period = new Period(0, 1, 0, 0, 0, 0, 0, 0);
        Partial p2 = p.minus(period);
        assertEquals(5, p2.getValue(0));
    }

    // ===================== property() =====================

    @Test
    public void testProperty_valid() {
        Partial p = new Partial(DateTimeFieldType.year(), 2000);
        Partial.Property prop = p.property(DateTimeFieldType.year());
        assertEquals(2000, prop.get());
        assertSame(p, prop.getPartial());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProperty_unsupported() {
        Partial p = new Partial(DateTimeFieldType.year(), 2000);
        p.property(DateTimeFieldType.monthOfYear());
    }

    // ===================== isMatch(ReadableInstant) =====================

    @Test
    public void testIsMatchInstant_true() {
        Partial p = new Partial(DateTimeFieldType.year(), 2000);
        DateTime dt = new DateTime(2000, 6, 15, 0, 0, 0, 0, DateTimeZone.UTC);
        assertTrue(p.isMatch(dt));
    }

    @Test
    public void testIsMatchInstant_false() {
        Partial p = new Partial(DateTimeFieldType.year(), 2000);
        DateTime dt = new DateTime(2001, 6, 15, 0, 0, 0, 0, DateTimeZone.UTC);
        assertFalse(p.isMatch(dt));
    }

    @Test
    public void testIsMatchInstant_nullInstant_emptyPartialAlwaysMatches() {
        // partial ว่าง -> loop ไม่ทำงานเลย -> return true เสมอ ไม่ว่า instant จะเป็นอะไร (รวมถึง null = now)
        Partial p = new Partial();
        assertTrue(p.isMatch((ReadableInstant) null));
    }

    // ===================== isMatch(ReadablePartial) =====================

    @Test(expected = IllegalArgumentException.class)
    public void testIsMatchPartial_null() {
        Partial p = new Partial(DateTimeFieldType.year(), 2000);
        p.isMatch((ReadablePartial) null);
    }

    @Test
    public void testIsMatchPartial_true() {
        Partial p = new Partial(DateTimeFieldType.year(), 2000);
        Partial other = new Partial(new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()},
                new int[] {2000, 6});
        assertTrue(p.isMatch(other));
    }

    @Test
    public void testIsMatchPartial_false() {
        Partial p = new Partial(DateTimeFieldType.year(), 2000);
        Partial other = new Partial(new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()},
                new int[] {2001, 6});
        assertFalse(p.isMatch(other));
    }

    // ===================== getFormatter / toString =====================

    @Test
    public void testGetFormatter_emptyPartial_returnsNull() {
        Partial p = new Partial();
        assertNull(p.getFormatter());
    }

    @Test
    public void testGetFormatter_validFullDate_notNull() {
        Partial p = new Partial(new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth()},
                new int[] {2004, 6, 9});
        assertNotNull(p.getFormatter());
    }

    @Test
    public void testToString_emptyPartial_fallbackToStringList() {
        // size()==0 -> getFormatter() คืน null ทันที โดยไม่ตั้งค่า iFormatter
        // -> toString() จึงต้อง fallback ไปที่ toStringList()
        Partial p = new Partial();
        assertEquals("[]", p.toString());
        assertEquals("[]", p.toStringList());
    }

    @Test
    public void testToString_fullDate_usesIsoFormatter() {
        Partial p = new Partial(new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth()},
                new int[] {2004, 6, 9});
        assertEquals("2004-06-09", p.toString());
    }

    @Test
    public void testToStringList_multiField() {
        Partial p = new Partial(new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()},
                new int[] {2004, 6});
        String s = p.toStringList();
        assertTrue(s.startsWith("["));
        assertTrue(s.endsWith("]"));
        assertTrue(s.contains("year=2004"));
        assertTrue(s.contains("monthOfYear=6"));
    }

    @Test
    public void testToString_pattern_null_sameAsToString() {
        Partial p = new Partial(DateTimeFieldType.year(), 2000);
        assertEquals(p.toString(), p.toString((String) null));
    }

    @Test
    public void testToString_pattern_valid() {
        Partial p = new Partial(new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth()},
                new int[] {2004, 6, 9});
        assertEquals("2004-06-09", p.toString("yyyy-MM-dd"));
    }

    @Test
    public void testToString_patternLocale_null_sameAsToString() {
        Partial p = new Partial(DateTimeFieldType.year(), 2000);
        assertEquals(p.toString(), p.toString(null, Locale.FRENCH));
    }

    @Test
    public void testToString_patternLocale_valid() {
        Partial p = new Partial(new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth()},
                new int[] {2004, 6, 9});
        // pattern นี้ไม่มีชื่อเดือน/วันตามภาษา จึงไม่ขึ้นกับ locale
        assertEquals("2004-06-09", p.toString("yyyy-MM-dd", Locale.US));
    }

    // ===================== Property (inner class) =====================

    @Test
    public void testPropertyClass_getFieldAndPartial() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 6);
        Partial.Property prop = p.property(DateTimeFieldType.monthOfYear());
        assertNotNull(prop.getField());
        assertSame(p, prop.getPartial());
        assertEquals(6, prop.get());
    }

    @Test
    public void testPropertyClass_addToCopy_noOverflow() {
        Partial p = new Partial(new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()},
                new int[] {2004, 6});
        Partial p2 = p.property(DateTimeFieldType.monthOfYear()).addToCopy(1);
        assertEquals(2004, p2.getValue(0));
        assertEquals(7, p2.getValue(1));
    }

    @Test
    public void testPropertyClass_addToCopy_overflowIntoLargerField() {
        Partial p = new Partial(new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()},
                new int[] {2004, 12});
        Partial p2 = p.property(DateTimeFieldType.monthOfYear()).addToCopy(1);
        assertEquals(2005, p2.getValue(0));
        assertEquals(1, p2.getValue(1));
    }

    @Test
    public void testPropertyClass_addWrapFieldToCopy() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 12);
        Partial p2 = p.property(DateTimeFieldType.monthOfYear()).addWrapFieldToCopy(1);
        assertEquals(1, p2.getValue(0));
    }

    @Test
    public void testPropertyClass_setCopyInt() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 6);
        Partial p2 = p.property(DateTimeFieldType.monthOfYear()).setCopy(9);
        assertEquals(9, p2.getValue(0));
    }

    @Test
    public void testPropertyClass_setCopyText() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 1);
        Partial p2 = p.property(DateTimeFieldType.monthOfYear()).setCopy("December");
        assertEquals(12, p2.getValue(0));
    }

    @Test
    public void testPropertyClass_setCopyTextLocale() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 1);
        Partial p2 = p.property(DateTimeFieldType.monthOfYear()).setCopy("décembre", Locale.FRENCH);
        assertEquals(12, p2.getValue(0));
    }

    @Test
    public void testPropertyClass_withMaximumAndMinimumValue() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 6);
        Partial.Property prop = p.property(DateTimeFieldType.monthOfYear());
        assertEquals(12, prop.withMaximumValue().getValue(0));
        assertEquals(1, prop.withMinimumValue().getValue(0));
    }
}
