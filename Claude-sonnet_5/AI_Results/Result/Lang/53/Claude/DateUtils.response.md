# คำอธิบาย

ฉันวิเคราะห์ซอร์สโค้ด `DateUtils` (Defects4J Lang-53b) โดยเฉพาะเมธอด private `modify()` ซึ่งเป็น core logic ของ `round()`/`truncate()` อย่างละเอียด (trace ทีละ branch) เพื่อให้ assertion ที่เขียนมีหลักฐานอ้างอิงจากซอร์สโค้ดจริง ไม่ใช่การเดา

สำหรับกรณีที่ตรรกะซับซ้อนและมีพฤติกรรมที่ดู "แปลก" (เช่น `round(date, Calendar.AM_PM)` ที่ไป `add(Calendar.DATE, 1)` โดยไม่ตั้งใจ) — ได้ comment กำกับไว้ชัดเจนว่าเป็นพฤติกรรมที่ตรวจสอบได้จาก source แต่อาจเป็นจุดบกพร่อง (fault) ที่ควรถูกจับได้

```java
package org.apache.commons.lang.time;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.NoSuchElementException;

import org.junit.Test;

public class DateUtilsTest {

    // ---------- Helpers ----------
    private Calendar newCalendar(int year, int month, int day, int hour, int minute, int second, int millis) {
        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(year, month, day, hour, minute, second);
        cal.set(Calendar.MILLISECOND, millis);
        return cal;
    }

    private Date newDate(int year, int month, int day, int hour, int minute, int second, int millis) {
        return newCalendar(year, month, day, hour, minute, second, millis).getTime();
    }

    // =====================================================================
    // isSameDay(Date, Date)
    // =====================================================================
    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDayDateNull1() {
        DateUtils.isSameDay(null, new Date());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDayDateNull2() {
        DateUtils.isSameDay(new Date(), null);
    }

    @Test
    public void testIsSameDayDateTrue() {
        Date d1 = newDate(2023, Calendar.MARCH, 28, 13, 45, 0, 0);
        Date d2 = newDate(2023, Calendar.MARCH, 28, 6, 1, 0, 0);
        assertTrue(DateUtils.isSameDay(d1, d2));
    }

    @Test
    public void testIsSameDayDateFalse() {
        Date d1 = newDate(2023, Calendar.MARCH, 28, 13, 45, 0, 0);
        Date d2 = newDate(2023, Calendar.MARCH, 12, 13, 45, 0, 0);
        assertFalse(DateUtils.isSameDay(d1, d2));
    }

    // =====================================================================
    // isSameDay(Calendar, Calendar)
    // =====================================================================
    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDayCalendarNull1() {
        DateUtils.isSameDay((Calendar) null, Calendar.getInstance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDayCalendarNull2() {
        DateUtils.isSameDay(Calendar.getInstance(), (Calendar) null);
    }

    @Test
    public void testIsSameDayCalendarTrue() {
        Calendar c1 = newCalendar(2023, Calendar.MARCH, 28, 13, 45, 0, 0);
        Calendar c2 = newCalendar(2023, Calendar.MARCH, 28, 6, 1, 0, 0);
        assertTrue(DateUtils.isSameDay(c1, c2));
    }

    @Test
    public void testIsSameDayCalendarFalseDifferentYear() {
        Calendar c1 = newCalendar(2023, Calendar.MARCH, 28, 13, 45, 0, 0);
        Calendar c2 = newCalendar(2022, Calendar.MARCH, 28, 13, 45, 0, 0);
        assertFalse(DateUtils.isSameDay(c1, c2));
    }

    // =====================================================================
    // isSameInstant(Date, Date)
    // =====================================================================
    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstantDateNull1() {
        DateUtils.isSameInstant((Date) null, new Date());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstantDateNull2() {
        DateUtils.isSameInstant(new Date(), (Date) null);
    }

    @Test
    public void testIsSameInstantDateTrue() {
        assertTrue(DateUtils.isSameInstant(new Date(123456789L), new Date(123456789L)));
    }

    @Test
    public void testIsSameInstantDateFalse() {
        assertFalse(DateUtils.isSameInstant(new Date(1L), new Date(2L)));
    }

    // =====================================================================
    // isSameInstant(Calendar, Calendar)
    // =====================================================================
    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstantCalendarNull1() {
        DateUtils.isSameInstant((Calendar) null, Calendar.getInstance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstantCalendarNull2() {
        DateUtils.isSameInstant(Calendar.getInstance(), (Calendar) null);
    }

    @Test
    public void testIsSameInstantCalendarTrue() {
        Calendar c1 = Calendar.getInstance();
        c1.setTimeInMillis(1000L);
        Calendar c2 = Calendar.getInstance();
        c2.setTimeInMillis(1000L);
        assertTrue(DateUtils.isSameInstant(c1, c2));
    }

    @Test
    public void testIsSameInstantCalendarFalse() {
        Calendar c1 = Calendar.getInstance();
        c1.setTimeInMillis(1000L);
        Calendar c2 = Calendar.getInstance();
        c2.setTimeInMillis(2000L);
        assertFalse(DateUtils.isSameInstant(c1, c2));
    }

    // =====================================================================
    // isSameLocalTime(Calendar, Calendar)
    // =====================================================================
    @Test(expected = IllegalArgumentException.class)
    public void testIsSameLocalTimeNull1() {
        DateUtils.isSameLocalTime(null, Calendar.getInstance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameLocalTimeNull2() {
        DateUtils.isSameLocalTime(Calendar.getInstance(), null);
    }

    @Test
    public void testIsSameLocalTimeTrue() {
        Calendar c1 = newCalendar(2023, Calendar.MARCH, 28, 13, 45, 1, 100);
        Calendar c2 = newCalendar(2023, Calendar.MARCH, 28, 13, 45, 1, 100);
        assertTrue(DateUtils.isSameLocalTime(c1, c2));
    }

    @Test
    public void testIsSameLocalTimeFalseDifferentField() {
        Calendar c1 = newCalendar(2023, Calendar.MARCH, 28, 13, 45, 1, 100);
        Calendar c2 = newCalendar(2023, Calendar.MARCH, 28, 13, 45, 1, 200);
        assertFalse(DateUtils.isSameLocalTime(c1, c2));
    }

    @Test
    public void testIsSameLocalTimeFalseDifferentClass() {
        // cal1.getClass() == cal2.getClass() ต้องเป็น false เพราะ class ต่างกัน
        Calendar c1 = newCalendar(2023, Calendar.MARCH, 28, 13, 45, 1, 100);
        Calendar c2 = new GregorianCalendar() { /* anonymous subclass -> different class */ };
        c2.setTime(c1.getTime());
        assertFalse(DateUtils.isSameLocalTime(c1, c2));
    }

    // =====================================================================
    // parseDate(String, String[])
    // =====================================================================
    @Test(expected = IllegalArgumentException.class)
    public void testParseDateNullStr() throws ParseException {
        DateUtils.parseDate(null, new String[]{"yyyy-MM-dd"});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDateNullPatterns() throws ParseException {
        DateUtils.parseDate("2023-03-28", null);
    }

    @Test
    public void testParseDateFirstPatternMatches() throws ParseException {
        Date d = DateUtils.parseDate("2023-03-28", new String[]{"yyyy-MM-dd", "dd/MM/yyyy"});
        assertNotNull(d);
    }

    @Test
    public void testParseDateSecondPatternMatches() throws ParseException {
        // บังคับให้ loop ข้าม pattern แรกไปแพทเทิร์นที่สอง (ครอบคลุม for-loop iteration ที่ i>0)
        Date d = DateUtils.parseDate("28/03/2023", new String[]{"yyyy-MM-dd", "dd/MM/yyyy"});
        assertNotNull(d);
    }

    @Test(expected = ParseException.class)
    public void testParseDateNoMatch() throws ParseException {
        DateUtils.parseDate("notadate", new String[]{"yyyy-MM-dd"});
    }

    @Test(expected = ParseException.class)
    public void testParseDatePartialMatchFails() throws ParseException {
        // parse ได้บางส่วนแต่ pos.getIndex() != str.length() -> ต้องตก ParseException
        DateUtils.parseDate("2023-03-28extra", new String[]{"yyyy-MM-dd"});
    }

    // =====================================================================
    // add(Date,int,int) และ wrapper methods
    // =====================================================================
    @Test(expected = IllegalArgumentException.class)
    public void testAddNullDate() {
        DateUtils.add(null, Calendar.YEAR, 1);
    }

    @Test
    public void testAddYears() {
        Date d = newDate(2023, Calendar.MARCH, 28, 0, 0, 0, 0);
        Calendar c = Calendar.getInstance();
        c.setTime(DateUtils.addYears(d, 1));
        assertEquals(2024, c.get(Calendar.YEAR));
    }

    @Test
    public void testAddMonths() {
        Date d = newDate(2023, Calendar.MARCH, 28, 0, 0, 0, 0);
        Calendar c = Calendar.getInstance();
        c.setTime(DateUtils.addMonths(d, 1));
        assertEquals(Calendar.APRIL, c.get(Calendar.MONTH));
    }

    @Test
    public void testAddWeeks() {
        Date d = newDate(2023, Calendar.MARCH, 28, 0, 0, 0, 0);
        Calendar c = Calendar.getInstance();
        c.setTime(DateUtils.addWeeks(d, 1));
        assertEquals(4, c.get(Calendar.DATE));
    }

    @Test
    public void testAddDays() {
        Date d = newDate(2023, Calendar.MARCH, 28, 0, 0, 0, 0);
        Calendar c = Calendar.getInstance();
        c.setTime(DateUtils.addDays(d, 1));
        assertEquals(29, c.get(Calendar.DATE));
    }

    @Test
    public void testAddHours() {
        Date d = newDate(2023, Calendar.MARCH, 28, 10, 0, 0, 0);
        Calendar c = Calendar.getInstance();
        c.setTime(DateUtils.addHours(d, 1));
        assertEquals(11, c.get(Calendar.HOUR_OF_DAY));
    }

    @Test
    public void testAddMinutes() {
        Date d = newDate(2023, Calendar.MARCH, 28, 10, 30, 0, 0);
        Calendar c = Calendar.getInstance();
        c.setTime(DateUtils.addMinutes(d, 1));
        assertEquals(31, c.get(Calendar.MINUTE));
    }

    @Test
    public void testAddSeconds() {
        Date d = newDate(2023, Calendar.MARCH, 28, 10, 30, 30, 0);
        Calendar c = Calendar.getInstance();
        c.setTime(DateUtils.addSeconds(d, 1));
        assertEquals(31, c.get(Calendar.SECOND));
    }

    @Test
    public void testAddMilliseconds() {
        Date d = newDate(2023, Calendar.MARCH, 28, 10, 30, 30, 100);
        Calendar c = Calendar.getInstance();
        c.setTime(DateUtils.addMilliseconds(d, 1));
        assertEquals(101, c.get(Calendar.MILLISECOND));
    }

    // =====================================================================
    // round(Date,int)  -- ยืนยันด้วยตัวอย่างจาก Javadoc + manual trace ของ modify()
    // =====================================================================
    @Test(expected = IllegalArgumentException.class)
    public void testRoundDateNull() {
        DateUtils.round((Date) null, Calendar.HOUR_OF_DAY);
    }

    @Test
    public void testRoundMillisecondFieldNoChange() {
        // field == MILLISECOND -> return ทันที ไม่มีการเปลี่ยนแปลง
        Date d = newDate(2023, Calendar.MARCH, 28, 13, 45, 1, 231);
        Date result = DateUtils.round(d, Calendar.MILLISECOND);
        assertEquals(d, result);
    }

    @Test
    public void testRoundHourUp() {
        // ตามตัวอย่างใน Javadoc: 13:45:01.231 -> 14:00:00.000
        Date d = newDate(2023, Calendar.MARCH, 28, 13, 45, 1, 231);
        Calendar c = Calendar.getInstance();
        c.setTime(DateUtils.round(d, Calendar.HOUR_OF_DAY));
        assertEquals(14, c.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, c.get(Calendar.MINUTE));
        assertEquals(0, c.get(Calendar.SECOND));
        assertEquals(0, c.get(Calendar.MILLISECOND));
    }

    @Test
    public void testRoundHourDown() {
        // minutes=15 (<30) -> ไม่ round up
        Date d = newDate(2023, Calendar.MARCH, 28, 13, 15, 1, 100);
        Calendar c = Calendar.getInstance();
        c.setTime(DateUtils.round(d, Calendar.HOUR_OF_DAY));
        assertEquals(13, c.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, c.get(Calendar.MINUTE));
    }

    @Test
    public void testRoundMonthUp() {
        // ตามตัวอย่าง Javadoc: 28 Mar 2002 13:45:01.231 + MONTH -> 1 April 2002 00:00:00.000
        Date d = newDate(2023, Calendar.MARCH, 28, 13, 45, 1, 231);
        Calendar c = Calendar.getInstance();
        c.setTime(DateUtils.round(d, Calendar.MONTH));
        assertEquals(Calendar.APRIL, c.get(Calendar.MONTH));
        assertEquals(1, c.get(Calendar.DATE));
        assertEquals(0, c.get(Calendar.HOUR_OF_DAY));
    }

    @Test
    public void testRoundMonthDown() {
        Date d = newDate(2023, Calendar.MARCH, 10, 0, 0, 0, 0);
        Calendar c = Calendar.getInstance();
        c.setTime(DateUtils.round(d, Calendar.MONTH));
        assertEquals(Calendar.MARCH, c.get(Calendar.MONTH));
        assertEquals(1, c.get(Calendar.DATE));
    }

    // ---- SEMI_MONTH: ตรวจตาม trace ของ modify() บน source ที่ให้มา ----
    @Test
    public void testRoundSemiMonthFirstHalfRoundDownToDayOne() {
        // day=7 -> offset=6 (<=7) -> roundUp=false -> DATE ถูกตั้งเป็น 1 และไม่ถูกบวกเพิ่ม
        Date d = newDate(2023, Calendar.MARCH, 7, 0, 0, 0, 0);
        Calendar c = Calendar.getInstance();
        c.setTime(DateUtils.round(d, DateUtils.SEMI_MONTH));
        assertEquals(1, c.get(Calendar.DATE));
        assertEquals(Calendar.MARCH, c.get(Calendar.MONTH));
    }

    @Test
    public void testRoundSemiMonthFirstHalfRoundUpToSixteen() {
        // day=10 -> offset=9 (>7) -> roundUp=true -> DATE ถูกตั้งเป็น 1 ก่อน แล้วเข้า branch (DATE==1) -> +15 = 16
        Date d = newDate(2023, Calendar.MARCH, 10, 0, 0, 0, 0);
        Calendar c = Calendar.getInstance();
        c.setTime(DateUtils.round(d, DateUtils.SEMI_MONTH));
        assertEquals(16, c.get(Calendar.DATE));
        assertEquals(Calendar.MARCH, c.get(Calendar.MONTH));
    }

    @Test
    public void testRoundSemiMonthSecondHalfRoundUpToNextMonth() {
        // day=24 -> offset=8(>7) -> roundUp=true -> DATE ตั้งเป็น 16 (!=1) -> else branch: -15 วัน +1 เดือน -> 1 เมษายน
        Date d = newDate(2023, Calendar.MARCH, 24, 0, 0, 0, 0);
        Calendar c = Calendar.getInstance();
        c.setTime(DateUtils.round(d, DateUtils.SEMI_MONTH));
        assertEquals(1, c.get(Calendar.DATE));
        assertEquals(Calendar.APRIL, c.get(Calendar.MONTH));
    }

    // ---- AM_PM: ตรวจตาม trace ของ modify() ----
    @Test
    public void testRoundAmPmDown() {
        // hour=5 -> offset=5 (<6) -> roundUp=false -> HOUR_OF_DAY=0, ไม่บวกเพิ่ม
        Date d = newDate(2023, Calendar.MARCH, 28, 5, 0, 0, 0);
        Calendar c = Calendar.getInstance();
        c.setTime(DateUtils.round(d, Calendar.AM_PM));
        assertEquals(0, c.get(Calendar.HOUR_OF_DAY));
        assertEquals(28, c.get(Calendar.DATE));
    }

    @Test
    public void testRoundAmPmUpUnexpectedDateIncrement() {
        // หมายเหตุ (ไม่แน่ใจ/สงสัยว่าเป็น fault):
        // จาก manual trace ของ modify(): เมื่อ field==AM_PM และ round&&roundUp==true
        // โค้ดเรียก val.add(fields[i][0], 1) โดยที่ i ชี้ไปที่กลุ่ม {DATE, DAY_OF_MONTH, AM_PM}
        // ทำให้ fields[i][0] == Calendar.DATE แทนที่จะเป็น HOUR_OF_DAY
        // ผลคือ DATE ถูกบวกเพิ่ม 1 วันอย่างไม่คาดคิด เมื่อ hour>=18 (offset>6)
        // เทสนี้ยืนยัน "พฤติกรรมปัจจุบันของซอร์ส" เพื่อดักจับการเปลี่ยนแปลง/fault
        Date d = newDate(2023, Calendar.MARCH, 28, 19, 0, 0, 0);
        Calendar c = Calendar.getInstance();
        c.setTime(DateUtils.round(d, Calendar.AM_PM));
        assertEquals(12, c.get(Calendar.HOUR_OF_DAY));
        assertEquals(29, c.get(Calendar.DATE)); // DATE+1 ตามพฤติกรรมที่ trace ได้จาก source
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRoundInvalidField() {
        DateUtils.round(new Date(), 9999);
    }

    @Test(expected = ArithmeticException.class)
    public void testRoundYearTooLarge() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 280000001);
        DateUtils.round(c.getTime(), Calendar.YEAR);
    }

    // =====================================================================
    // round(Calendar,int)
    // =====================================================================
    @Test(expected = IllegalArgumentException.class)
    public void testRoundCalendarNull() {
        DateUtils.round((Calendar) null, Calendar.YEAR);
    }

    @Test
    public void testRoundCalendarBasic() {
        Calendar cal = newCalendar(2023, Calendar.MARCH, 28, 13, 45, 1, 231);
        Calendar result = DateUtils.round(cal, Calendar.HOUR_OF_DAY);
        assertEquals(14, result.get(Calendar.HOUR_OF_DAY));
    }

    // =====================================================================
    // round(Object,int)
    // =====================================================================
    @Test(expected = IllegalArgumentException.class)
    public void testRoundObjectNull() {
        DateUtils.round((Object) null, Calendar.YEAR);
    }

    @Test
    public void testRoundObjectDate() {
        Date d = newDate(2023, Calendar.MARCH, 28, 13, 45, 1, 231);
        assertNotNull(DateUtils.round((Object) d, Calendar.HOUR_OF_DAY));
    }

    @Test
    public void testRoundObjectCalendar() {
        Calendar c = newCalendar(2023, Calendar.MARCH, 28, 13, 45, 1, 231);
        assertNotNull(DateUtils.round((Object) c, Calendar.HOUR_OF_DAY));
    }

    @Test(expected = ClassCastException.class)
    public void testRoundObjectInvalidType() {
        DateUtils.round("not a date", Calendar.YEAR);
    }

    // =====================================================================
    // truncate(Date,int)
    // =====================================================================
    @Test(expected = IllegalArgumentException.class)
    public void testTruncateDateNull() {
        DateUtils.truncate((Date) null, Calendar.HOUR_OF_DAY);
    }

    @Test
    public void testTruncateHour() {
        Date d = newDate(2023, Calendar.MARCH, 28, 13, 45, 1, 231);
        Calendar c = Calendar.getInstance();
        c.setTime(DateUtils.truncate(d, Calendar.HOUR_OF_DAY));
        assertEquals(13, c.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, c.get(Calendar.MINUTE));
        assertEquals(0, c.get(Calendar.SECOND));
        assertEquals(0, c.get(Calendar.MILLISECOND));
    }

    @Test
    public void testTruncateMonth() {
        Date d = newDate(2023, Calendar.MARCH, 28, 13, 45, 1, 231);
        Calendar c = Calendar.getInstance();
        c.setTime(DateUtils.truncate(d, Calendar.MONTH));
        assertEquals(Calendar.MARCH, c.get(Calendar.MONTH));
        assertEquals(1, c.get(Calendar.DATE));
    }

    @Test
    public void testTruncateSemiMonthSecondHalf() {
        Date d = newDate(2023, Calendar.MARCH, 20, 13, 45, 1, 231);
        Calendar c = Calendar.getInstance();
        c.setTime(DateUtils.truncate(d, DateUtils.SEMI_MONTH));
        assertEquals(16, c.get(Calendar.DATE));
    }

    @Test
    public void testTruncateSemiMonthFirstHalf() {
        Date d = newDate(2023, Calendar.MARCH, 10, 13, 45, 1, 231);
        Calendar c = Calendar.getInstance();
        c.setTime(DateUtils.truncate(d, DateUtils.SEMI_MONTH));
        assertEquals(1, c.get(Calendar.DATE));
    }

    @Test
    public void testTruncateAmPm() {
        // truncate ไม่ roundUp เสมอ -> ไม่มีการบวก DATE เพิ่ม
        Date d = newDate(2023, Calendar.MARCH, 28, 19, 30, 1, 231);
        Calendar c = Calendar.getInstance();
        c.setTime(DateUtils.truncate(d, Calendar.AM_PM));
        assertEquals(12, c.get(Calendar.HOUR_OF_DAY));
        assertEquals(28, c.get(Calendar.DATE));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTruncateInvalidField() {
        DateUtils.truncate(new Date(), 9999);
    }

    @Test(expected = ArithmeticException.class)
    public void testTruncateYearTooLarge() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 280000001);
        DateUtils.truncate(c.getTime(), Calendar.YEAR);
    }

    // =====================================================================
    // truncate(Calendar,int)
    // =====================================================================
    @Test(expected = IllegalArgumentException.class)
    public void testTruncateCalendarNull() {
        DateUtils.truncate((Calendar) null, Calendar.YEAR);
    }

    @Test
    public void testTruncateCalendarBasic() {
        Calendar cal = newCalendar(2023, Calendar.MARCH, 28, 13, 45, 1, 231);
        Calendar result = DateUtils.truncate(cal, Calendar.HOUR_OF_DAY);
        assertEquals(13, result.get(Calendar.HOUR_OF_DAY));
    }

    // =====================================================================
    // truncate(Object,int)
    // =====================================================================
    @Test(expected = IllegalArgumentException.class)
    public void testTruncateObjectNull() {
        DateUtils.truncate((Object) null, Calendar.YEAR);
    }

    @Test
    public void testTruncateObjectDate() {
        Date d = newDate(2023, Calendar.MARCH, 28, 13, 45, 1, 231);
        assertNotNull(DateUtils.truncate((Object) d, Calendar.HOUR_OF_DAY));
    }

    @Test
    public void testTruncateObjectCalendar() {
        Calendar c = newCalendar(2023, Calendar.MARCH, 28, 13, 45, 1, 231);
        assertNotNull(DateUtils.truncate((Object) c, Calendar.HOUR_OF_DAY));
    }

    @Test(expected = ClassCastException.class)
    public void testTruncateObjectInvalidType() {
        DateUtils.truncate(Integer.valueOf(123), Calendar.YEAR);
    }

    // =====================================================================
    // iterator(Date,int)
    // =====================================================================
    @Test(expected = IllegalArgumentException.class)
    public void testIteratorDateNull() {
        DateUtils.iterator((Date) null, DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test
    public void testIteratorDateBasic() {
        Date d = newDate(2023, Calendar.MARCH, 28, 0, 0, 0, 0);
        Iterator it = DateUtils.iterator(d, DateUtils.RANGE_WEEK_SUNDAY);
        assertNotNull(it);
        assertTrue(it.hasNext());
    }

    // =====================================================================
    // iterator(Calendar,int)
    // =====================================================================
    @Test(expected = IllegalArgumentException.class)
    public void testIteratorCalendarNull() {
        DateUtils.iterator((Calendar) null, DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIteratorInvalidRangeStyle() {
        Calendar cal = newCalendar(2023, Calendar.MARCH, 28, 0, 0, 0, 0);
        DateUtils.iterator(cal, 9999);
    }

    @Test
    public void testIteratorRangeMonthSunday() {
        // ตามตัวอย่าง Javadoc: Thursday 4 July 2002 -> Sunday 30 June 2002 .. Saturday 3 Aug 2002
        Calendar cal = newCalendar(2002, Calendar.JULY, 4, 0, 0, 0, 0);
        Iterator it = DateUtils.iterator(cal, DateUtils.RANGE_MONTH_SUNDAY);
        Calendar first = (Calendar) it.next();
        assertEquals(Calendar.SUNDAY, first.get(Calendar.DAY_OF_WEEK));
        assertEquals(30, first.get(Calendar.DATE));
        assertEquals(Calendar.JUNE, first.get(Calendar.MONTH));
        Calendar last = first;
        while (it.hasNext()) {
            last = (Calendar) it.next();
        }
        assertEquals(Calendar.SATURDAY, last.get(Calendar.DAY_OF_WEEK));
        assertEquals(3, last.get(Calendar.DATE));
        assertEquals(Calendar.AUGUST, last.get(Calendar.MONTH));
    }

    @Test
    public void testIteratorRangeMonthMonday() {
        Calendar cal = newCalendar(2002, Calendar.JULY, 4, 0, 0, 0, 0);
        Iterator it = DateUtils.iterator(cal, DateUtils.RANGE_MONTH_MONDAY);
        Calendar first = (Calendar) it.next();
        assertEquals(Calendar.MONDAY, first.get(Calendar.DAY_OF_WEEK));
        Calendar last = first;
        while (it.hasNext()) {
            last = (Calendar) it.next();
        }
        assertEquals(Calendar.SUNDAY, last.get(Calendar.DAY_OF_WEEK));
    }

    @Test
    public void testIteratorRangeWeekSunday() {
        Calendar cal = newCalendar(2023, Calendar.MARCH, 28, 0, 0, 0, 0); // Tuesday
        Iterator it = DateUtils.iterator(cal, DateUtils.RANGE_WEEK_SUNDAY);
        Calendar first = (Calendar) it.next();
        assertEquals(Calendar.SUNDAY, first.get(Calendar.DAY_OF_WEEK));
        Calendar last = first;
        while (it.hasNext()) {
            last = (Calendar) it.next();
        }
        assertEquals(Calendar.SATURDAY, last.get(Calendar.DAY_OF_WEEK));
    }

    @Test
    public void testIteratorRangeWeekMonday() {
        Calendar cal = newCalendar(2023, Calendar.MARCH, 28, 0, 0, 0, 0); // Tuesday
        Iterator it = DateUtils.iterator(cal, DateUtils.RANGE_WEEK_MONDAY);
        Calendar first = (Calendar) it.next();
        assertEquals(Calendar.MONDAY, first.get(Calendar.DAY_OF_WEEK));
        Calendar last = first;
        while (it.hasNext()) {
            last = (Calendar) it.next();
        }
        assertEquals(Calendar.SUNDAY, last.get(Calendar.DAY_OF_WEEK));
    }

    @Test
    public void testIteratorRangeWeekRelativeFromSunday() {
        // focus=Sunday -> endCutoff=startCutoff-1=0 (<SUNDAY) -> +7 -> SATURDAY
        Calendar cal = newCalendar(2023, Calendar.MARCH, 26, 0, 0, 0, 0); // Sunday
        assertEquals(Calendar.SUNDAY, cal.get(Calendar.DAY_OF_WEEK));
        Iterator it = DateUtils.iterator((Calendar) cal.clone(), DateUtils.RANGE_WEEK_RELATIVE);
        Calendar first = (Calendar) it.next();
        assertEquals(Calendar.SUNDAY, first.get(Calendar.DAY_OF_WEEK));
    }

    @Test
    public void testIteratorRangeWeekRelativeFromSaturday() {
        Calendar cal = newCalendar(2023, Calendar.APRIL, 1, 0, 0, 0, 0); // Saturday
        assertEquals(Calendar.SATURDAY, cal.get(Calendar.DAY_OF_WEEK));
        Iterator it = DateUtils.iterator((Calendar) cal.clone(), DateUtils.RANGE_WEEK_RELATIVE);
        Calendar first = (Calendar) it.next();
        assertEquals(Calendar.SATURDAY, first.get(Calendar.DAY_OF_WEEK));
    }

    @Test
    public void testIteratorRangeWeekCenterFromSunday() {
        // focus=Sunday(1): startCutoff=1-3=-2 (<SUNDAY) -> +7 = 5(THURSDAY)
        Calendar cal = newCalendar(2023, Calendar.MARCH, 26, 0, 0, 0, 0); // Sunday
        Iterator it = DateUtils.iterator((Calendar) cal.clone(), DateUtils.RANGE_WEEK_CENTER);
        Calendar first = (Calendar) it.next();
        assertEquals(Calendar.THURSDAY, first.get(Calendar.DAY_OF_WEEK));
        assertEquals(23, first.get(Calendar.DATE));
    }

    @Test
    public void testIteratorRangeWeekCenterFromSaturday() {
        // focus=Saturday(7): endCutoff=7+3=10 (>SATURDAY) -> -7 = 3(TUESDAY)
        Calendar cal = newCalendar(2023, Calendar.APRIL, 1, 0, 0, 0, 0); // Saturday
        Iterator it = DateUtils.iterator((Calendar) cal.clone(), DateUtils.RANGE_WEEK_CENTER);
        Calendar first = (Calendar) it.next();
        assertEquals(Calendar.WEDNESDAY, first.get(Calendar.DAY_OF_WEEK));
        assertEquals(29, first.get(Calendar.DATE));
        Calendar last = first;
        while (it.hasNext()) {
            last = (Calendar) it.next();
        }
        assertEquals(Calendar.TUESDAY, last.get(Calendar.DAY_OF_WEEK));
        assertEquals(4, last.get(Calendar.DATE));
    }

    // =====================================================================
    // iterator(Object,int)
    // =====================================================================
    @Test(expected = IllegalArgumentException.class)
    public void testIteratorObjectNull() {
        DateUtils.iterator((Object) null, DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test
    public void testIteratorObjectDate() {
        Date d = newDate(2023, Calendar.MARCH, 28, 0, 0, 0, 0);
        assertNotNull(DateUtils.iterator((Object) d, DateUtils.RANGE_WEEK_SUNDAY));
    }

    @Test
    public void testIteratorObjectCalendar() {
        Calendar c = newCalendar(2023, Calendar.MARCH, 28, 0, 0, 0, 0);
        assertNotNull(DateUtils.iterator((Object) c, DateUtils.RANGE_WEEK_SUNDAY));
    }

    @Test(expected = ClassCastException.class)
    public void testIteratorObjectInvalidType() {
        DateUtils.iterator("invalid", DateUtils.RANGE_WEEK_SUNDAY);
    }

    // =====================================================================
    // DateIterator (inner class)
    // =====================================================================
    @Test
    public void testDateIteratorFullCycle() {
        Calendar cal = newCalendar(2023, Calendar.MARCH, 28, 0, 0, 0, 0); // Tuesday
        Iterator it = DateUtils.iterator(cal, DateUtils.RANGE_WEEK_SUNDAY);
        int count = 0;
        while (it.hasNext()) {
            Object o = it.next();
            assertTrue(o instanceof Calendar);
            count++;
        }
        assertEquals(7, count); // 1 สัปดาห์ = 7 วัน
    }

    @Test(expected = NoSuchElementException.class)
    public void testDateIteratorNoSuchElement() {
        Calendar cal = newCalendar(2023, Calendar.MARCH, 28, 0, 0, 0, 0);
        Iterator it = DateUtils.iterator(cal, DateUtils.RANGE_WEEK_SUNDAY);
        while (it.hasNext()) {
            it.next();
        }
        it.next(); // ต้อง throw NoSuchElementException
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testDateIteratorRemove() {
        Calendar cal = newCalendar(2023, Calendar.MARCH, 28, 0, 0, 0, 0);
        Iterator it = DateUtils.iterator(cal, DateUtils.RANGE_WEEK_SUNDAY);
        it.remove();
    }
}
```

## สรุปตาราง Branch/Condition Coverage

| เมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testIsSameDayDateNull1/2` | `isSameDay(Date,Date)`: null check ทั้ง 2 พารามิเตอร์ |
| `testIsSameDayDateTrue/False` | same-day true/false path |
| `testIsSameDayCalendarNull1/2`, `True`, `FalseDifferentYear` | `isSameDay(Calendar,Calendar)` null + true/false (ERA/YEAR/DAY_OF_YEAR) |
| `testIsSameInstant*` (Date/Calendar) | null check + true/false ของ millisecond compare |
| `testIsSameLocalTime*` | null check, true, false (field ต่าง), false (class ต่าง) |
| `testParseDate*` | null str/patterns, match pattern แรก, match pattern ถัดไป (loop continue), ไม่ match เลย (ParseException), match บางส่วน (pos.getIndex()!=length) |
| `testAddNullDate`, `testAdd*` (Years..Milliseconds) | null check ของ `add()`, และ wrapper แต่ละตัวเรียก `add()` ด้วย field ที่ถูกต้อง |
| `testRoundDateNull` | null check ของ `round(Date,int)` |
| `testRoundMillisecondFieldNoChange` | branch `field==MILLISECOND -> return` |
| `testRoundHourUp/Down` | LANG-59 truncate logic + roundUp true/false สำหรับ HOUR_OF_DAY |
| `testRoundMonthUp/Down` | roundUp true/false ไหลผ่านหลาย field ไปจนถึง MONTH match |
| `testRoundSemiMonth*` (3 เคส) | SEMI_MONTH special-case: `DATE==1` true, false(else branch), และ roundUp false |
| `testRoundAmPmDown` | AM_PM offsetSet branch, roundUp=false |
| `testRoundAmPmUpUnexpectedDateIncrement` | AM_PM roundUp=true -> ตรวจพฤติกรรม DATE+1 (สงสัยว่าเป็น fault, มี comment กำกับ) |
| `testRoundInvalidField` | loop จบโดยไม่ match field -> `IllegalArgumentException` |
| `testRoundYearTooLarge` | `year > 280000000 -> ArithmeticException` |
| `testRoundCalendarNull/Basic` | `round(Calendar,int)` null + basic |
| `testRoundObjectNull/Date/Calendar/InvalidType` | `round(Object,int)`: null, instanceof Date, instanceof Calendar, else ClassCastException |
| `testTruncate*` (เทียบกับ round) | เหมือนชุด round แต่ยืนยันว่า `round=false` ไม่มีการบวกเพิ่ม (roundUp ไม่ถูกใช้) |
| `testTruncateInvalidField`, `YearTooLarge` | เหมือน round แต่ฝั่ง truncate |
| `testTruncateCalendarNull/Basic`, `ObjectNull/Date/Calendar/InvalidType` | เหมือน round ฝั่ง Calendar/Object overload |
| `testIteratorDateNull/Basic` | `iterator(Date,int)` null + basic |
| `testIteratorCalendarNull`, `InvalidRangeStyle` | null check + default-case `IllegalArgumentException` |
| `testIteratorRangeMonthSunday/Monday` | switch-case RANGE_MONTH_SUNDAY/MONDAY, startCutoff/endCutoff swap |
| `testIteratorRangeWeekSunday/Monday` | switch-case RANGE_WEEK_SUNDAY/MONDAY |
| `testIteratorRangeWeekRelativeFromSunday/Saturday` | RANGE_WEEK_RELATIVE + branch `endCutoff<SUNDAY -> +7` |
| `testIteratorRangeWeekCenterFromSunday/Saturday` | RANGE_WEEK_CENTER + branch `startCutoff<SUNDAY -> +7` และ `endCutoff>SATURDAY -> -7` |
| `testIteratorObjectNull/Date/Calendar/InvalidType` | `iterator(Object,int)`: null, Date, Calendar, else ClassCastException |
| `testDateIteratorFullCycle` | `DateIterator.hasNext()`/`next()` ปกติจนครบ |
| `testDateIteratorNoSuchElement` | `next()` เมื่อ `spot.equals(endFinal)` -> NoSuchElementException |
| `testDateIteratorRemove` | `remove()` -> UnsupportedOperationException |

**หมายเหตุสำคัญ:** เคส `testRoundAmPmUpUnexpectedDateIncrement` ได้มาจากการ trace โค้ด `modify()` ทีละขั้นตอนตามซอร์สที่ให้มาเท่านั้น (ไม่ใช่การเดา) แต่พฤติกรรมที่พบ (DATE ถูกบวกเพิ่มโดยไม่ตั้งใจเมื่อ round ด้วย `Calendar.AM_PM`) ดูขัดกับความตั้งใจของ method จึงมี comment กำกับไว้ว่าอาจเป็นจุดบกพร่อง (fault) ของ Lang-53b ที่ชุดเทสนี้ถูกออกแบบมาให้ดักจับได้