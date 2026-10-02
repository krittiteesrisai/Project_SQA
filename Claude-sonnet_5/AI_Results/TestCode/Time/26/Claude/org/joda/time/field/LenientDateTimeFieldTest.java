package org.joda.time.field;

import static org.junit.Assert.*;

import org.junit.Test;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.DelegatedDateTimeField;
import org.joda.time.field.LenientDateTimeField;
import org.joda.time.field.StrictDateTimeField;

/**
 * Unit tests for {@link LenientDateTimeField} (Defects4J Time-26b).
 *
 * หมายเหตุ: StrictDateTimeField และ DelegatedDateTimeField ไม่ได้ให้ซอร์สโค้ดมาด้วย
 * การใช้งานคลาสเหล่านี้ในชุดทดสอบนี้ อ้างอิงเฉพาะ public API ที่จำเป็นต้องมีอยู่จริง
 * เพื่อให้ LenientDateTimeField ทำงานได้ตามที่ปรากฏในซอร์สที่ให้มา (เช่น super(field),
 * getType(), get(instant) ที่ถูก delegate) ไม่ได้เดา behavior พิเศษเพิ่มเติม
 */
public class LenientDateTimeFieldTest {

    private final Chronology utcBase = ISOChronology.getInstanceUTC();

    // ======================= getInstance() =======================

    @Test
    public void testGetInstance_nullField_returnsNull() {
        DateTimeField result = LenientDateTimeField.getInstance(null, utcBase);
        assertNull(result);
    }

    @Test
    public void testGetInstance_nonLenientField_createsNewLenientInstance() {
        DateTimeField dayOfMonth = utcBase.dayOfMonth();
        // precondition: standard ISO field ต้องไม่ lenient (เหตุผลที่ต้องมี LenientDateTimeField)
        assertFalse("precondition failed: standard field should not be lenient",
                dayOfMonth.isLenient());

        DateTimeField result = LenientDateTimeField.getInstance(dayOfMonth, utcBase);

        assertNotNull(result);
        assertTrue(result instanceof LenientDateTimeField);
        assertTrue(result.isLenient());
        assertNotSame(dayOfMonth, result);
        assertEquals(dayOfMonth.getType(), result.getType());
    }

    @Test
    public void testGetInstance_alreadyLenientField_returnsSameInstance() {
        DateTimeField dayOfMonth = utcBase.dayOfMonth();
        DateTimeField lenientField = LenientDateTimeField.getInstance(dayOfMonth, utcBase);
        assertTrue(lenientField.isLenient());

        // field ไม่ใช่ StrictDateTimeField แต่ isLenient()==true -> ต้อง return ตัวเดิม
        DateTimeField result = LenientDateTimeField.getInstance(lenientField, utcBase);

        assertSame(lenientField, result);
    }

    @Test
    public void testGetInstance_strictDateTimeFieldInstance_unwrapsAndReturnsLenientField() {
        // สร้าง "lenient field" ของเราเองที่ไม่ใช่ LenientDateTimeField เพื่อให้แน่ใจว่า
        // StrictDateTimeField.getInstance() จะสร้าง instance จริงของ StrictDateTimeField
        // (เลี่ยงการพึ่งพา logic unwrap ภายในของ StrictDateTimeField ที่เราไม่มีซอร์ส)
        final DateTimeField base = utcBase.dayOfMonth();
        DateTimeField customLenient = new DelegatedDateTimeField(base) {
            @Override
            public boolean isLenient() {
                return true;
            }
        };

        DateTimeField strictWrapped = StrictDateTimeField.getInstance(customLenient);
        // precondition check
        assertTrue("precondition failed: expected a real StrictDateTimeField instance",
                strictWrapped instanceof StrictDateTimeField);

        DateTimeField result = LenientDateTimeField.getInstance(strictWrapped, utcBase);

        // field instanceof StrictDateTimeField -> unwrap -> customLenient.isLenient()==true
        // -> return field ตามเดิม (ไม่สร้าง instance ใหม่)
        assertSame(customLenient, result);
    }

    // หมายเหตุ: กรณี "field instanceof StrictDateTimeField == true แต่หลัง unwrap แล้ว
    // field.isLenient() == false" (ซึ่งจะนำไปสร้าง new LenientDateTimeField จาก field ที่ unwrap แล้ว)
    // ไม่สามารถทดสอบได้อย่างปลอดภัยโดยไม่เดา behavior ของ StrictDateTimeField เพิ่มเติม
    // เนื่องจากไม่มีซอร์สโค้ดของ StrictDateTimeField ให้มา จึงไม่เขียนเทสสำหรับ branch นี้
    // (คอมเมนต์กำกับตามข้อกำหนด #4)

    // ======================= isLenient() =======================

    @Test
    public void testIsLenient_alwaysTrue() {
        DateTimeField dayOfMonth = utcBase.dayOfMonth();
        DateTimeField lenientField = LenientDateTimeField.getInstance(dayOfMonth, utcBase);
        assertTrue(lenientField.isLenient());
    }

    // ======================= set() =======================

    @Test
    public void testSet_zeroDifference_returnsSameInstant() {
        DateTimeField lenientField =
                LenientDateTimeField.getInstance(utcBase.dayOfMonth(), utcBase);

        long instant = new DateTime(2004, 2, 15, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        long result = lenientField.set(instant, 15); // value == current value -> difference 0

        assertEquals(instant, result);
    }

    @Test
    public void testSet_positiveDifferenceWithinBounds() {
        DateTimeField lenientField =
                LenientDateTimeField.getInstance(utcBase.dayOfMonth(), utcBase);

        long instant = new DateTime(2004, 1, 15, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        long result = lenientField.set(instant, 20); // diff = +5 วัน ยังอยู่ในเดือนม.ค. (31 วัน)

        long expected = new DateTime(2004, 1, 20, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals(expected, result);
    }

    @Test
    public void testSet_outOfUpperBound_rollsOverToNextMonth() {
        DateTimeField lenientField =
                LenientDateTimeField.getInstance(utcBase.dayOfMonth(), utcBase);

        // 2004 เป็นปีอธิกสุรทิน ก.พ. มี 29 วัน
        long instant = new DateTime(2004, 2, 29, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        long result = lenientField.set(instant, 31); // value เกินขอบเขต -> diff = 31-29 = 2

        long expected = new DateTime(2004, 3, 2, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals(expected, result);
    }

    @Test
    public void testSet_outOfLowerBound_rollsOverToPreviousMonth() {
        DateTimeField lenientField =
                LenientDateTimeField.getInstance(utcBase.dayOfMonth(), utcBase);

        long instant = new DateTime(2004, 3, 1, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        long result = lenientField.set(instant, -1); // diff = -1 - 1 = -2

        long expected = new DateTime(2004, 2, 28, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals(expected, result);
    }

    @Test
    public void testSet_largeNegativeDifferenceAcrossMonth() {
        DateTimeField lenientField =
                LenientDateTimeField.getInstance(utcBase.dayOfMonth(), utcBase);

        long instant = new DateTime(2004, 6, 15, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        long result = lenientField.set(instant, 0); // diff = 0 - 15 = -15

        long expected = new DateTime(2004, 5, 31, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals(expected, result);
    }

    @Test
    public void testSet_withFixedOffsetTimeZone_consistentZoneHandling() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        Chronology base = ISOChronology.getInstance(zone);
        DateTimeField lenientField =
                LenientDateTimeField.getInstance(base.dayOfMonth(), base);

        long instant = new DateTime(2004, 2, 29, 0, 0, 0, 0, zone).getMillis();
        long result = lenientField.set(instant, 31);

        long expected = new DateTime(2004, 3, 2, 0, 0, 0, 0, zone).getMillis();
        assertEquals(expected, result);
    }

    @Test
    public void testSet_monthOfYear_rollsOverToNextYear() {
        DateTimeField lenientMonth =
                LenientDateTimeField.getInstance(utcBase.monthOfYear(), utcBase);

        long instant = new DateTime(2004, 12, 1, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        long result = lenientMonth.set(instant, 13); // diff = 13 - 12 = 1

        long expected = new DateTime(2005, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals(expected, result);
    }

    @Test
    public void testSet_monthOfYear_rollsOverToPreviousYear() {
        DateTimeField lenientMonth =
                LenientDateTimeField.getInstance(utcBase.monthOfYear(), utcBase);

        long instant = new DateTime(2004, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        long result = lenientMonth.set(instant, 0); // diff = 0 - 1 = -1

        long expected = new DateTime(2003, 12, 1, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals(expected, result);
    }
}
