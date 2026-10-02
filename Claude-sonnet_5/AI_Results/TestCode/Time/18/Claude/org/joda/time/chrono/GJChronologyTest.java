package org.joda.time.chrono;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * JUnit 4 tests for {@link GJChronology} (Defects4J Time-18b).
 *
 * หมายเหตุ: เนื่องจาก inner class CutoverField / ImpreciseCutoverField เป็น private
 * จึงทดสอบ branch ของ inner class เหล่านี้โดยอ้อมผ่าน public DateTimeField ที่คืนจาก
 * chronology.year(), .era(), .dayOfMonth(), .dayOfYear(), .weekOfWeekyear(), .monthOfYear()
 * ค่าตัวเลขที่ใช้ยืนยัน (เช่น 355, 4, 15) คำนวณจากตรรกะใน source โดยตรง (gap 10 วัน
 * ระหว่าง Julian 4 Oct 1582 - Gregorian 15 Oct 1582) ไม่ใช่การเดา behavior ที่ไม่มีหลักฐาน
 */
public class GJChronologyTest {

    // ค่า millis ของ DEFAULT_CUTOVER ตามที่ระบุใน source (private field, คัดลอกค่ามาใช้ตรง ๆ)
    private static final long DEFAULT_CUTOVER_MILLIS = -12219292800000L;

    private DateTimeZone originalDefaultZone;

    @Before
    public void setUp() {
        originalDefaultZone = DateTimeZone.getDefault();
        // กำหนด default zone ให้แน่นอนเพื่อผลลัพธ์ deterministic
        DateTimeZone.setDefault(DateTimeZone.forID("Europe/Paris"));
    }

    @After
    public void tearDown() {
        DateTimeZone.setDefault(originalDefaultZone);
    }

    // ------------------------------------------------------------------
    // Factory methods
    // ------------------------------------------------------------------

    @Test
    public void testGetInstanceUTC() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        assertEquals(DateTimeZone.UTC, chrono.getZone());
        assertEquals(4, chrono.getMinimumDaysInFirstWeek());
        assertEquals(DEFAULT_CUTOVER_MILLIS, chrono.getGregorianCutover().getMillis());
    }

    @Test
    public void testGetInstance_defaultZone() {
        GJChronology chrono = GJChronology.getInstance();
        assertEquals(DateTimeZone.getDefault(), chrono.getZone());
    }

    @Test
    public void testGetInstance_zoneParam_null_usesDefaultZone() {
        GJChronology chrono = GJChronology.getInstance((DateTimeZone) null);
        assertEquals(DateTimeZone.getDefault(), chrono.getZone());
    }

    @Test
    public void testGetInstance_zoneParam_explicitZone() {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.forID("Europe/London"));
        assertEquals(DateTimeZone.forID("Europe/London"), chrono.getZone());
        assertEquals(4, chrono.getMinimumDaysInFirstWeek());
    }

    @Test
    public void testGetInstance_zoneAndCutover_2arg_defaultMinDays() {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, new Instant(500000L));
        assertEquals(4, chrono.getMinimumDaysInFirstWeek());
        assertEquals(500000L, chrono.getGregorianCutover().getMillis());
    }

    @Test
    public void testGetInstance_cutoverNull_usesDefaultCutover() {
        // branch: gregorianCutover == null -> cutoverInstant = DEFAULT_CUTOVER
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, null, 4);
        assertEquals(DEFAULT_CUTOVER_MILLIS, chrono.getGregorianCutover().getMillis());
    }

    @Test
    public void testGetInstance_zoneUTC_constructsDirectly() {
        // branch: zone == DateTimeZone.UTC
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, null, 4);
        assertEquals(DateTimeZone.UTC, chrono.getZone());
    }

    @Test
    public void testGetInstance_nonUTCZone_wrapsViaZonedChronology() {
        // branch: zone != DateTimeZone.UTC
        GJChronology chrono = GJChronology.getInstance(
                DateTimeZone.forID("America/New_York"), null, 4);
        assertEquals(DateTimeZone.forID("America/New_York"), chrono.getZone());
    }

    @Test
    public void testGetInstance_cache_hit_returnsSameInstance() {
        DateTimeZone zone = DateTimeZone.forID("Asia/Tokyo");
        Instant cutover = new Instant(123456789L);
        GJChronology c1 = GJChronology.getInstance(zone, cutover, 4);
        GJChronology c2 = GJChronology.getInstance(zone, cutover, 4);
        // branch: loop finds matching cached entry -> returns same reference
        assertSame(c1, c2);
    }

    @Test
    public void testGetInstance_cache_miss_createsNewEntry() {
        DateTimeZone zone = DateTimeZone.forID("Asia/Tokyo");
        Instant cutover = new Instant(123456789L);
        GJChronology c1 = GJChronology.getInstance(zone, cutover, 4);
        // different minDaysInFirstWeek -> loop does not find a match -> new instance created & cached
        GJChronology c3 = GJChronology.getInstance(zone, cutover, 7);
        assertNotSame(c1, c3);
        assertEquals(7, c3.getMinimumDaysInFirstWeek());
    }

    @Test
    public void testGetInstance_longCutover_equalsDefault_setsNullInstant() {
        // branch: gregorianCutover == DEFAULT_CUTOVER.getMillis() -> cutoverInstant = null
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, DEFAULT_CUTOVER_MILLIS, 4);
        assertEquals(DEFAULT_CUTOVER_MILLIS, chrono.getGregorianCutover().getMillis());
    }

    @Test
    public void testGetInstance_longCutover_notDefault_createsInstant() {
        // branch: else -> cutoverInstant = new Instant(gregorianCutover)
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, 0L, 4);
        assertEquals(0L, chrono.getGregorianCutover().getMillis());
    }

    // ------------------------------------------------------------------
    // getZone / withUTC / withZone
    // ------------------------------------------------------------------

    @Test
    public void testGetZone_UTC_baseNull() {
        assertEquals(DateTimeZone.UTC, GJChronology.getInstanceUTC().getZone());
    }

    @Test
    public void testGetZone_nonUTC_baseNotNull() {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.forID("Europe/Paris"));
        assertEquals(DateTimeZone.forID("Europe/Paris"), chrono.getZone());
    }

    @Test
    public void testWithUTC() {
        GJChronology paris = GJChronology.getInstance(DateTimeZone.forID("Europe/Paris"));
        assertEquals(DateTimeZone.UTC, paris.withUTC().getZone());
    }

    @Test
    public void testWithZone_null_usesDefaultZone() {
        Chronology c = GJChronology.getInstanceUTC().withZone(null);
        assertEquals(DateTimeZone.getDefault(), c.getZone());
    }

    @Test
    public void testWithZone_sameZone_returnsThis() {
        GJChronology utc = GJChronology.getInstanceUTC();
        Chronology same = utc.withZone(DateTimeZone.UTC);
        assertSame(utc, same);
    }

    @Test
    public void testWithZone_differentZone_createsNewInstance() {
        GJChronology utc = GJChronology.getInstanceUTC();
        Chronology diff = utc.withZone(DateTimeZone.forID("Europe/Paris"));
        assertEquals(DateTimeZone.forID("Europe/Paris"), diff.getZone());
        assertNotSame(utc, diff);
    }

    // ------------------------------------------------------------------
    // getDateTimeMillis (4-arg) : base null / Gregorian / Julian / gap
    // ------------------------------------------------------------------

    @Test
    public void testGetDateTimeMillis4_gregorianBranch() {
        GJChronology utc = GJChronology.getInstanceUTC();
        long m = utc.getDateTimeMillis(2000, 2, 29, 0); // leap day, after cutover
        assertEquals(2000, utc.year().get(m));
        assertTrue(m >= utc.getGregorianCutover().getMillis());
    }

    @Test
    public void testGetDateTimeMillis4_julianBranch() {
        GJChronology utc = GJChronology.getInstanceUTC();
        long m = utc.getDateTimeMillis(1500, 1, 1, 0); // well before cutover
        assertEquals(1500, utc.year().get(m));
        assertTrue(m < utc.getGregorianCutover().getMillis());
    }

    @Test
    public void testGetDateTimeMillis4_gapThrows() {
        GJChronology utc = GJChronology.getInstanceUTC();
        try {
            utc.getDateTimeMillis(1582, 10, 10, 0); // in the 10-day gap
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // ok
        }
    }

    @Test
    public void testGetDateTimeMillis4_nonUTCZone_delegatesToBase() {
        GJChronology paris = GJChronology.getInstance(DateTimeZone.forID("Europe/Paris"));
        long m = paris.getDateTimeMillis(2000, 6, 15, 0);
        assertEquals(2000, paris.year().get(m));
    }

    // ------------------------------------------------------------------
    // getDateTimeMillis (7-arg) : base null / Gregorian / Julian / gap
    // ------------------------------------------------------------------

    @Test
    public void testGetDateTimeMillis7_gregorianBranch() {
        GJChronology utc = GJChronology.getInstanceUTC();
        long m = utc.getDateTimeMillis(2000, 2, 29, 1, 2, 3, 4);
        assertEquals(2000, utc.year().get(m));
    }

    @Test
    public void testGetDateTimeMillis7_julianBranch() {
        GJChronology utc = GJChronology.getInstanceUTC();
        long m = utc.getDateTimeMillis(1500, 1, 1, 1, 2, 3, 4);
        assertTrue(m < utc.getGregorianCutover().getMillis());
    }

    @Test
    public void testGetDateTimeMillis7_gapThrows() {
        GJChronology utc = GJChronology.getInstanceUTC();
        try {
            utc.getDateTimeMillis(1582, 10, 10, 1, 2, 3, 4);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // ok
        }
    }

    @Test
    public void testGetDateTimeMillis7_nonUTCZone_delegatesToBase() {
        GJChronology paris = GJChronology.getInstance(DateTimeZone.forID("Europe/Paris"));
        long m = paris.getDateTimeMillis(2000, 6, 15, 1, 2, 3, 4);
        assertEquals(2000, paris.year().get(m));
    }

    // ------------------------------------------------------------------
    // Simple getters
    // ------------------------------------------------------------------

    @Test
    public void testGetGregorianCutover() {
        Instant cutover = new Instant(999999L);
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, cutover, 4);
        assertEquals(cutover, chrono.getGregorianCutover());
    }

    @Test
    public void testGetMinimumDaysInFirstWeek() {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, null, 6);
        assertEquals(6, chrono.getMinimumDaysInFirstWeek());
    }

    // ------------------------------------------------------------------
    // equals / hashCode
    // ------------------------------------------------------------------

    @Test
    public void testEquals_sameCachedInstance() {
        GJChronology a = GJChronology.getInstance(DateTimeZone.UTC, new Instant(100000L), 4);
        GJChronology b = GJChronology.getInstance(DateTimeZone.UTC, new Instant(100000L), 4);
        assertTrue(a.equals(b));
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testEquals_differentCutover() {
        GJChronology a = GJChronology.getInstance(DateTimeZone.UTC, new Instant(100000L), 4);
        GJChronology c = GJChronology.getInstance(DateTimeZone.UTC, new Instant(200000L), 4);
        assertFalse(a.equals(c));
    }

    @Test
    public void testEquals_null_and_differentType() {
        GJChronology a = GJChronology.getInstanceUTC();
        assertFalse(a.equals(null));
        assertFalse(a.equals("not a chronology"));
    }

    // ------------------------------------------------------------------
    // toString
    // ------------------------------------------------------------------

    @Test
    public void testToString_defaultCutoverAndMinDays() {
        // ไม่มี branch cutover/mdfw เพิ่ม เพราะเท่ากับ default ทั้งคู่
        assertEquals("GJChronology[UTC]", GJChronology.getInstanceUTC().toString());
    }

    @Test
    public void testToString_customCutover_midnight_usesDateFormatter() {
        // cutover ที่ millis=0 (1970-01-01T00:00:00.000Z) หารด้วยหนึ่งวันลงตัว -> ใช้ printer แบบ date()
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, new Instant(0L), 4);
        String s = chrono.toString();
        assertTrue(s.contains("cutover=1970-01-01"));
        assertFalse(s.contains("T")); // ไม่มี time component เพราะใช้ ISODateTimeFormat.date()
    }

    @Test
    public void testToString_customCutover_nonMidnight_usesDateTimeFormatter() {
        // cutover ที่ millis=1000 ไม่ลงตัวพอดีวัน -> ใช้ printer แบบ dateTime()
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, new Instant(1000L), 4);
        String s = chrono.toString();
        assertTrue(s.contains("cutover="));
        assertTrue(s.contains("T")); // มี time component
    }

    @Test
    public void testToString_customMinDaysInFirstWeek() {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, null, 7);
        String s = chrono.toString();
        assertTrue(s.contains("mdfw=7"));
    }

    // ------------------------------------------------------------------
    // Field branches ผ่าน CutoverField / ImpreciseCutoverField (public DateTimeField API)
    // ------------------------------------------------------------------

    @Test
    public void testYearField_aroundCutover_bothBranches() {
        GJChronology utc = GJChronology.getInstanceUTC();
        long cutoverMillis = utc.getGregorianCutover().getMillis();
        assertEquals(1582, utc.year().get(cutoverMillis));      // instant >= cutover -> Gregorian
        assertEquals(1582, utc.year().get(cutoverMillis - 1));  // instant < cutover -> Julian
    }

    @Test
    public void testEraField_aroundCutover_bothBranches() {
        GJChronology utc = GJChronology.getInstanceUTC();
        long cutoverMillis = utc.getGregorianCutover().getMillis();
        // แค่ยืนยันว่าทำงานได้ทั้งสองฝั่งโดยไม่ throw (ครอบคลุม if/else ของ CutoverField.get)
        assertTrue(utc.era().get(cutoverMillis) >= 0);
        assertTrue(utc.era().get(cutoverMillis - 1) >= 0);
    }

    @Test
    public void testDayOfYear_maximumValue_cutoverYearIsShortened() {
        // ปี 1582 ขาดไป 10 วัน (5-14 Oct) และไม่ใช่ปีอธิกสุรทินทั้ง Julian/Gregorian
        // ดังนั้น max dayOfYear ของปี 1582 ควรเป็น 365-10 = 355 (คำนวณจาก algorithm ตรง ๆ)
        GJChronology utc = GJChronology.getInstanceUTC();
        long jan1_1582Julian = JulianChronology.getInstanceUTC()
                .getDateTimeMillis(1582, 1, 1, 0, 0, 0, 0);
        int maxDayOfYear = utc.dayOfYear().getMaximumValue(jan1_1582Julian);
        assertEquals(355, maxDayOfYear);
    }

    @Test
    public void testWeekOfWeekyear_maximumValue_cutoverYear_sane() {
        GJChronology utc = GJChronology.getInstanceUTC();
        long jan1_1582Julian = JulianChronology.getInstanceUTC()
                .getDateTimeMillis(1582, 1, 1, 0, 0, 0, 0);
        int maxWeek = utc.weekOfWeekyear().getMaximumValue(jan1_1582Julian);
        assertTrue(maxWeek > 0 && maxWeek <= 53);
    }

    @Test
    public void testDayOfMonth_maximumValue_cutoverMonth_correctedToFour() {
        // ตรรกะ CutoverField.getMaximumValue(long): ถ้า set เป็นค่า max ของ Julian (31)
        // แล้วข้าม cutover ไป จะถูกบังคับให้ใช้ค่า day-of-month ที่ cutover-1 วัน (=4)
        GJChronology utc = GJChronology.getInstanceUTC();
        long oct1_1582Julian = JulianChronology.getInstanceUTC()
                .getDateTimeMillis(1582, 10, 1, 0, 0, 0, 0);
        int maxDay = utc.dayOfMonth().getMaximumValue(oct1_1582Julian);
        assertEquals(4, maxDay);
    }

    @Test
    public void testDayOfMonth_minimumValue_beforeCutover_simpleBranch() {
        GJChronology utc = GJChronology.getInstanceUTC();
        long sep15_1582Julian = JulianChronology.getInstanceUTC()
                .getDateTimeMillis(1582, 9, 15, 0, 0, 0, 0);
        assertEquals(1, utc.dayOfMonth().getMinimumValue(sep15_1582Julian));
    }

    @Test
    public void testDayOfMonth_minimumValue_afterCutover_correctedToFifteen() {
        // ตรรกะ CutoverField.getMinimumValue(long): ถ้า set เป็น 1 (Gregorian) แล้วตกไปก่อน
        // cutover จะถูกบังคับให้คืนค่า day-of-month ที่ cutover เอง (=15)
        GJChronology utc = GJChronology.getInstanceUTC();
        long oct20_1582Gregorian = utc.getDateTimeMillis(1582, 10, 20, 0, 0, 0, 0);
        int minDay = utc.dayOfMonth().getMinimumValue(oct20_1582Gregorian);
        assertEquals(15, minDay);
    }

    @Test
    public void testDayOfMonth_set_intoGap_throwsIllegalFieldValueException() {
        // ตั้งค่า dayOfMonth=10 ให้กับ instant หลัง cutover (Oct 1582) ซึ่งตกอยู่ในช่วง gap
        // CutoverField.set ต้อง throw IllegalFieldValueException เพราะ get(instant) != value หลังปรับ
        GJChronology utc = GJChronology.getInstanceUTC();
        long oct20_1582Gregorian = utc.getDateTimeMillis(1582, 10, 20, 0, 0, 0, 0);
        try {
            utc.dayOfMonth().set(oct20_1582Gregorian, 10);
            fail("Expected IllegalFieldValueException");
        } catch (IllegalFieldValueException expected) {
            // ok
        }
    }

    @Test
    public void testYearField_add_crossesFromJulianToGregorian() {
        // ImpreciseCutoverField.add(long,int): เริ่มก่อน cutover แล้วบวกจนข้าม cutover
        GJChronology utc = GJChronology.getInstanceUTC();
        long year1580Julian = JulianChronology.getInstanceUTC()
                .getDateTimeMillis(1580, 1, 1, 0, 0, 0, 0);
        long afterAdd = utc.year().add(year1580Julian, 3); // -> 1583, after cutover
        assertEquals(1583, utc.year().get(afterAdd));
        assertTrue(afterAdd >= utc.getGregorianCutover().getMillis());
    }

    @Test
    public void testYearField_add_crossesFromGregorianToJulian() {
        // ImpreciseCutoverField.add(long,int): เริ่มหลัง cutover แล้วบวก (ลบ) จนข้ามกลับไป Julian
        GJChronology utc = GJChronology.getInstanceUTC();
        long year1585Gregorian = utc.getDateTimeMillis(1585, 1, 1, 0, 0, 0, 0);
        long afterSub = utc.year().add(year1585Gregorian, -4); // -> 1581, before cutover
        assertEquals(1581, utc.year().get(afterSub));
        assertTrue(afterSub < utc.getGregorianCutover().getMillis());
    }

    @Test
    public void testMonthOfYear_basicGetSet_noExceptionOutsideCutover() {
        // Sanity: ตรวจ ImpreciseCutoverField ทำงานได้ปรกติไกลจาก cutover (ไม่ตก gap)
        GJChronology utc = GJChronology.getInstanceUTC();
        long m = utc.getDateTimeMillis(2000, 5, 1, 0);
        long after = utc.monthOfYear().add(m, 2);
        assertEquals(7, utc.monthOfYear().get(after));
    }
}
