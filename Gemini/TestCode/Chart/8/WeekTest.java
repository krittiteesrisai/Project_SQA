package org.jfree.data.time;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Test;

public class WeekTest {

    @Test
    public void testDefaultConstructor() {
        Week week = new Week();
        assertNotNull(week);
    }

    @Test
    public void testWeekIntIntConstructor() {
        Week week = new Week(5, 2023);
        assertEquals(5, week.getWeek());
        assertEquals(2023, week.getYearValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWeekIntIntInvalidRange() {
        // ตามโค้ดต้นฉบับ เงื่อนไขคือ (week < FIRST && week > LAST) ซึ่งใน Java เขียนแบบนี้จะทำให้ไม่เคย throw เว้นแต่ค่าจะผิดเพี้ยน 
        // แต่เราส่งค่าติดลบหรือเกิน 53 เพื่อทดสอบพฤติกรรม
        new Week(55, 2023);
    }

    @Test
    public void testWeekIntYearConstructor() {
        Year year = new Year(2022);
        Week week = new Week(10, year);
        assertEquals(10, week.getWeek());
        assertEquals(2022, week.getYearValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWeekIntYearInvalidRange() {
        Year year = new Year(2022);
        new Week(0, year);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWeekDateNullTime() {
        new Week(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWeekDateZoneLocaleNullTime() {
        new Week(null, TimeZone.getDefault(), Locale.getDefault());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWeekDateZoneLocaleNullZone() {
        new Week(new Date(), null, Locale.getDefault());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWeekDateZoneLocaleNullLocale() {
        new Week(new Date(), TimeZone.getDefault(), null);
    }

    @Test
    public void testWeekDateEdgeCases() {
        TimeZone tz = TimeZone.getDefault();
        Locale locale = Locale.getDefault();

        // ทดสอบช่วงคาบเกี่ยวปีใหม่ (ธันวาคม ที่ไปตกสัปดาห์ที่ 1 ของปีถัดไป)
        Calendar cal = Calendar.getInstance(tz, locale);
        cal.set(2014, Calendar.DECEMBER, 29, 0, 0, 0);
        Date decDate = cal.getTime();
        Week wDec = new Week(decDate, tz, locale);
        assertNotNull(wDec);

        // ทดสอบช่วงต้นเดือนมกราคม ที่ไปตกสัปดาห์ท้ายของปีก่อนหน้า
        cal.set(Character.DIRECTIONALITY_ARABIC_NUMBER, Calendar.JANUARY, 1, 0, 0, 0);
        // ใช้ 2009 มกราคม วันที่ 1 ซึ่งมักอยู่ในสัปดาห์ที่ 53 ของปี 2008
        cal.set(2009, Calendar.JANUARY, 1, 0, 0, 0);
        Date janDate = cal.getTime();
        Week wJan = new Week(janDate, tz, locale);
        assertNotNull(wJan);
    }

    @Test
    public void testDeprecatedConstructors() {
        Date now = new Date();
        Week w1 = new Week(now, TimeZone.getDefault());
        assertNotNull(w1);
    }

    @Test
    public void testGetters() {
        Week week = new Week(15, 2020);
        assertEquals(15, week.getWeek());
        assertEquals(2020, week.getYearValue());
        assertEquals(new Year(2020), week.getYear());
        
        Calendar calendar = Calendar.getInstance();
        week.peg(calendar);
        assertTrue(week.getFirstMillisecond() > 0);
        assertTrue(week.getLastMillisecond() > 0);
        assertTrue(week.getFirstMillisecond(calendar) <= week.getLastMillisecond(calendar));
    }

    @Test
    public void testPrevious() {
        Week week = new Week(2, 2020);
        RegularTimePeriod prev = week.previous();
        assertEquals(new Week(1, 2020), prev);

        Week firstWeek = new Week(1, 2020);
        RegularTimePeriod prevYearWeek = firstWeek.previous();
        assertNotNull(prevYearWeek);

        // ทดสอบขีดจำกัดปี 1900
        Week minWeek = new Week(1, 1900);
        assertNull(minWeek.previous());
    }

    @Test
    public void testNext() {
        Week week = new Week(1, 2020);
        RegularTimePeriod next = week.next();
        assertEquals(new Week(2, 2020), next);

        // ทดสอบขีดจำกัดปี 9999
        Week maxWeek = new Week(53, 9999);
        // บังคับให้ทะลุ max week ของปี 9999
        // สมมติว่าปี 9999 สัปดาห์สูงสุดคือ 52 หรือ 53
        Week nearMax = new Week(52, 9999);
        assertNotNull(nearMax.next());
    }

    @Test
    public void testGetSerialIndex() {
        Week week = new Week(10, 2020);
        long expected = 2020L * 53L + 10L;
        assertEquals(expected, week.getSerialIndex());
    }

    @Test
    public void testToString() {
        Week week = new Week(5, 2021);
        assertEquals("Week 5, 2021", week.toString());
    }

    @Test
    public void testEqualsAndHashCode() {
        Week w1 = new Week(5, 2020);
        Week w2 = new Week(5, 2020);
        Week w3 = new Week(6, 2020);
        Week w4 = new Week(5, 2021);

        assertTrue(w1.equals(w1));
        assertTrue(w1.equals(w2));
        assertFalse(w1.equals(w3));
        assertFalse(w1.equals(w4));
        assertFalse(w1.equals(null));
        assertFalse(w1.equals("NotAWeek"));

        assertEquals(w1.hashCode(), w2.hashCode());
    }

    @Test
    public void testCompareTo() {
        Week w1 = new Week(5, 2020);
        Week w2 = new Week(6, 2020);
        Week w3 = new Week(5, 2019);
        Week w4 = new Week(5, 2020);

        assertTrue(w1.compareTo(w2) < 0);
        assertTrue(w1.compareTo(w3) > 0);
        assertEquals(0, w1.compareTo(w4));

        RegularTimePeriod otherPeriod = new Year(2020);
        assertEquals(0, w1.compareTo(otherPeriod));

        assertEquals(1, w1.compareTo("StringObject"));
    }

    @Test
    public void testParseWeekValid() {
        assertEquals(new Week(5, 2020), Week.parseWeek("2020-W05"));
        assertEquals(new Week(5, 2020), Week.parseWeek("W05-2020"));
        assertEquals(new Week(5, 2020), Week.parseWeek("2020.05"));
    }

    @Test(expected = TimePeriodFormatException.class)
    public void testParseWeekNull() {
        Week.parseWeek(null);
    }

    @Test(expected = TimePeriodFormatException.class)
    public void testParseWeekNoSeparator() {
        Week.parseWeek("202005");
    }

    @Test(expected = TimePeriodFormatException.class)
    public void testParseWeekInvalidYear() {
        Week.parseWeek("ABCD-W05");
    }

    @Test(expected = TimePeriodFormatException.class)
    public void testParseWeekInvalidWeekFirst() {
        Week.parseWeek("2020-W99");
    }

    @Test(expected = TimePeriodFormatException.class)
    public void testParseWeekInvalidWeekSecond() {
        Week.parseWeek("W99-2020");
    }

    @Test(expected = TimePeriodFormatException.class)
    public void testParseWeekUnparseableBoth() {
        Week.parseWeek("ABC-DEF");
    }
}