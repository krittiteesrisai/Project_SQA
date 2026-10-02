# วิเคราะห์และแผนการทดสอบ

จากซอร์สโค้ด `Week.java` พบจุดสำคัญที่ต้องระวัง:
1. **Bug ที่ตั้งใจปล่อยไว้ (dead code)**: เงื่อนไข `if ((week < FIRST_WEEK_IN_YEAR) && (week > LAST_WEEK_IN_YEAR))` ใช้ `&&` แทน `||` ทำให้เป็นไปไม่ได้ที่ทั้งสองเงื่อนไขจะจริงพร้อมกัน — exception จะไม่ถูก throw ไม่ว่าค่า week จะเป็นเท่าใด ผมจะเขียนเทสยืนยัน behavior ปัจจุบัน (ไม่ throw) พร้อมคอมเมนต์ระบุว่าเป็น known defect
2. **Constructor `Week(Date, TimeZone)` (deprecated)** ไม่ได้ใช้ค่า `zone` ที่รับมาเลย (bug) — เทสยืนยัน behavior ตามซอร์ส
3. การคำนวณ week/year ที่พึ่งพา `Calendar.getInstance()` (system default) ทำให้ไม่ deterministic — ผมจะ fix `Locale`/`TimeZone` default ใน `@Before`/`@After` เพื่อความแน่นอน
4. Branch ที่พึ่งพา locale-specific calendar rule (December→week1 ปีหน้า, January→week52/53 ปีก่อน) ใช้ `Assume.assumeTrue` เพื่อป้องกัน false failure ข้าม JVM/locale โดยยังคง cover branch ได้จริงเมื่อเงื่อนไข precondition เป็นจริง

```java
import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.TimePeriodFormatException;

/**
 * JUnit4 test suite for org.jfree.data.time.Week (Defects4J Chart-8b).
 *
 * หมายเหตุทั่วไป:
 * - บาง constructor/method ใช้ Calendar.getInstance() (system default locale/timezone)
 *   เพื่อความ deterministic เราจึง fix ค่า default locale/timezone ใน @Before และคืนค่าใน @After
 * - จุดที่พึ่งพา behavior ของ java.util.Calendar ที่อาจต่างกันตาม JVM/locale
 *   จะใช้ Assume.assumeTrue เพื่อ skip อย่างปลอดภัยหาก precondition ไม่ตรงตามที่คาด
 */
public class WeekTest {

    private Locale originalLocale;
    private TimeZone originalTimeZone;

    @Before
    public void setUp() {
        originalLocale = Locale.getDefault();
        originalTimeZone = TimeZone.getDefault();
        Locale.setDefault(Locale.US);
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }

    @After
    public void tearDown() {
        Locale.setDefault(originalLocale);
        TimeZone.setDefault(originalTimeZone);
    }

    // ---------------------------------------------------------------
    // Constructors
    // ---------------------------------------------------------------

    @Test
    public void testDefaultConstructor_producesValidWeek() {
        Week w = new Week();
        assertTrue(w.getWeek() >= 1 && w.getWeek() <= 53);
    }

    @Test
    public void testWeekYearConstructor_validBoundaries() {
        Week w1 = new Week(1, 2000);
        assertEquals(1, w1.getWeek());
        assertEquals(2000, w1.getYearValue());

        Week w2 = new Week(53, 2000);
        assertEquals(53, w2.getWeek());
    }

    // NOTE (known defect): เงื่อนไขตรวจสอบใน constructor ใช้ (week < 1) && (week > 53)
    // ซึ่งไม่มีทางเป็น true ได้พร้อมกัน -> IllegalArgumentException ไม่ถูก throw
    // แม้ว่า Javadoc จะระบุว่าต้องอยู่ในช่วง 1-53 ก็ตาม
    @Test
    public void testWeekYearConstructor_belowRange_doesNotThrow_dueToKnownDefect() {
        Week w = new Week(0, 2000);
        assertEquals(0, w.getWeek());
    }

    @Test
    public void testWeekYearConstructor_aboveRange_doesNotThrow_dueToKnownDefect() {
        Week w = new Week(100, 2000);
        assertEquals(100, w.getWeek());
    }

    // Bonus: byte overflow เมื่อ week เกินช่วง byte (-128..127) - latent defect แยกต่างหาก
    @Test
    public void testWeekYearConstructor_largeValue_byteOverflow_documented() {
        int expected = (byte) 200; // overflow -> -56
        Week w = new Week(200, 2000);
        assertEquals(expected, w.getWeek());
    }

    @Test
    public void testWeekYearObjectConstructor() {
        Year y = new Year(2005);
        Week w = new Week(9, y);
        assertEquals(9, w.getWeek());
        assertEquals(2005, w.getYearValue());
    }

    @Test
    public void testDateConstructor_basic() {
        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(2010, Calendar.JUNE, 15, 12, 0, 0);
        Date d = cal.getTime();
        Week w = new Week(d);
        assertTrue(w.getWeek() >= 1 && w.getWeek() <= 53);
    }

    // NOTE: ตามซอร์ส constructor นี้ (deprecated) ไม่ได้ใช้ค่า zone ที่รับมาเลย
    // เทสนี้ยืนยัน behavior ปัจจุบัน (ผลลัพธ์ไม่ขึ้นกับ zone ที่ส่งเข้ามา)
    @Test
    public void testDeprecatedDateTimeZoneConstructor_ignoresPassedZone() {
        Date d = new Date();
        TimeZone tzA = TimeZone.getTimeZone("America/New_York");
        TimeZone tzB = TimeZone.getTimeZone("Asia/Tokyo");
        Week w1 = new Week(d, tzA);
        Week w2 = new Week(d, tzB);
        assertEquals(w1.getWeek(), w2.getWeek());
        assertEquals(w1.getYearValue(), w2.getYearValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDateTimeZoneLocaleConstructor_nullTime() {
        new Week(null, TimeZone.getDefault(), Locale.getDefault());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDateTimeZoneLocaleConstructor_nullZone() {
        new Week(new Date(), null, Locale.getDefault());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDateTimeZoneLocaleConstructor_nullLocale() {
        new Week(new Date(), TimeZone.getDefault(), null);
    }

    @Test
    public void testDateTimeZoneLocaleConstructor_normalMidYear() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        Locale locale = Locale.US;
        Calendar cal = Calendar.getInstance(tz, locale);
        cal.clear();
        cal.set(2020, Calendar.JULY, 1, 12, 0, 0);
        Date d = cal.getTime();
        int tempWeek = cal.get(Calendar.WEEK_OF_YEAR);

        Week w = new Week(d, tz, locale);
        assertEquals(Math.min(tempWeek, Week.LAST_WEEK_IN_YEAR), w.getWeek());
        assertEquals(2020, w.getYearValue());
    }

    @Test
    public void testDateTimeZoneLocaleConstructor_JanuaryNotBoundary() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        Locale locale = Locale.US;
        Calendar cal = Calendar.getInstance(tz, locale);
        cal.clear();
        cal.set(2020, Calendar.JANUARY, 15, 12, 0, 0);
        Date d = cal.getTime();
        int tempWeek = cal.get(Calendar.WEEK_OF_YEAR);

        Week w = new Week(d, tz, locale);
        assertEquals(Math.min(tempWeek, Week.LAST_WEEK_IN_YEAR), w.getWeek());
        assertEquals(2020, w.getYearValue());
    }

    // Branch: tempWeek==1 && MONTH==DECEMBER -> year+1
    @Test
    public void testDateTimeZoneLocaleConstructor_DecemberBelongsToNextYearWeek1() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        Locale locale = Locale.US; // minimalDaysInFirstWeek=1, firstDayOfWeek=SUNDAY
        Calendar cal = Calendar.getInstance(tz, locale);
        cal.clear();
        cal.set(2004, Calendar.DECEMBER, 31, 12, 0, 0);
        Date d = cal.getTime();

        int tempWeek = cal.get(Calendar.WEEK_OF_YEAR);
        int month = cal.get(Calendar.MONTH);
        int yearField = cal.get(Calendar.YEAR);

        Assume.assumeTrue(tempWeek == 1 && month == Calendar.DECEMBER);

        Week w = new Week(d, tz, locale);
        assertEquals(1, w.getWeek());
        assertEquals(yearField + 1, w.getYearValue());
    }

    // Branch: MONTH==JANUARY && week>=52 -> year-1
    @Test
    public void testDateTimeZoneLocaleConstructor_JanuaryBelongsToPreviousYearLastWeek() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        Locale locale = Locale.GERMANY; // minimalDaysInFirstWeek=4, firstDayOfWeek=MONDAY (ISO-like)
        Calendar cal = Calendar.getInstance(tz, locale);
        cal.clear();
        cal.set(2000, Calendar.JANUARY, 1, 12, 0, 0);
        Date d = cal.getTime();

        int tempWeek = cal.get(Calendar.WEEK_OF_YEAR);
        int month = cal.get(Calendar.MONTH);
        int yearField = cal.get(Calendar.YEAR);

        Assume.assumeTrue(month == Calendar.JANUARY && tempWeek >= 52);

        Week w = new Week(d, tz, locale);
        int expectedWeek = Math.min(tempWeek, Week.LAST_WEEK_IN_YEAR);
        int expectedYear = yearField - 1;
        assertEquals(expectedWeek, w.getWeek());
        assertEquals(expectedYear, w.getYearValue());
    }

    // ---------------------------------------------------------------
    // Simple getters
    // ---------------------------------------------------------------

    @Test
    public void testGetYearAndGetYearValue() {
        Week w = new Week(5, 2000);
        assertEquals(2000, w.getYearValue());
        assertEquals(2000, w.getYear().getYear());
    }

    @Test
    public void testGetWeek() {
        Week w = new Week(7, 2003);
        assertEquals(7, w.getWeek());
    }

    @Test
    public void testGetFirstAndLastMillisecond_orderedCorrectly() {
        Week w = new Week(10, 2000);
        assertTrue(w.getFirstMillisecond() < w.getLastMillisecond());
    }

    @Test
    public void testGetSerialIndex() {
        Week w = new Week(10, 2000);
        long expected = 2000L * 53L + 10L;
        assertEquals(expected, w.getSerialIndex());
    }

    @Test
    public void testToString() {
        Week w = new Week(7, 2003);
        assertEquals("Week 7, 2003", w.toString());
    }

    @Test
    public void testPeg_doesNotThrowAndKeepsOrdering() {
        Week w = new Week(10, 2000);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        w.peg(cal);
        assertTrue(w.getFirstMillisecond() <= w.getLastMillisecond());
    }

    @Test(expected = NullPointerException.class)
    public void testGetFirstMillisecondCalendar_null() {
        Week w = new Week(5, 2000);
        w.getFirstMillisecond(null);
    }

    @Test(expected = NullPointerException.class)
    public void testGetLastMillisecondCalendar_null() {
        Week w = new Week(5, 2000);
        w.getLastMillisecond(null);
    }

    // ---------------------------------------------------------------
    // previous()
    // ---------------------------------------------------------------

    @Test
    public void testPrevious_notFirstWeek() {
        Week w = new Week(5, 2000);
        RegularTimePeriod prevPeriod = w.previous();
        assertTrue(prevPeriod instanceof Week);
        Week pw = (Week) prevPeriod;
        assertEquals(4, pw.getWeek());
        assertEquals(2000, pw.getYearValue());
    }

    @Test
    public void testPrevious_firstWeek_yearGreaterThan1900() {
        Week w = new Week(1, 2000);
        RegularTimePeriod prevPeriod = w.previous();
        assertTrue(prevPeriod instanceof Week);
        Week pw = (Week) prevPeriod;
        assertEquals(1999, pw.getYearValue());

        Calendar cal = Calendar.getInstance();
        cal.set(1999, Calendar.DECEMBER, 31);
        int expectedWeek = cal.getActualMaximum(Calendar.WEEK_OF_YEAR);
        assertEquals(expectedWeek, pw.getWeek());
    }

    @Test
    public void testPrevious_firstWeek_year1900_returnsNull() {
        Week w = new Week(1, 1900);
        RegularTimePeriod prevPeriod = w.previous();
        assertNull(prevPeriod);
    }

    // ---------------------------------------------------------------
    // next()
    // ---------------------------------------------------------------

    @Test
    public void testNext_weekLessThan52() {
        Week w = new Week(10, 2000);
        RegularTimePeriod nextPeriod = w.next();
        assertTrue(nextPeriod instanceof Week);
        Week nw = (Week) nextPeriod;
        assertEquals(11, nw.getWeek());
        assertEquals(2000, nw.getYearValue());
    }

    @Test
    public void testNext_week52_lessThanActualMax() {
        Calendar cal = Calendar.getInstance();
        cal.set(2000, Calendar.DECEMBER, 31);
        int actualMax = cal.getActualMaximum(Calendar.WEEK_OF_YEAR);
        Assume.assumeTrue(actualMax > 52);

        Week w = new Week(52, 2000);
        RegularTimePeriod nextPeriod = w.next();
        assertTrue(nextPeriod instanceof Week);
        Week nw = (Week) nextPeriod;
        assertEquals(53, nw.getWeek());
        assertEquals(2000, nw.getYearValue());
    }

    @Test
    public void testNext_weekEqualsActualMax_rolloverToNextYear() {
        Calendar cal = Calendar.getInstance();
        cal.set(2000, Calendar.DECEMBER, 31);
        int actualMax = cal.getActualMaximum(Calendar.WEEK_OF_YEAR);

        Week w = new Week(actualMax, 2000);
        RegularTimePeriod nextPeriod = w.next();
        assertTrue(nextPeriod instanceof Week);
        Week nw = (Week) nextPeriod;
        assertEquals(Week.FIRST_WEEK_IN_YEAR, nw.getWeek());
        assertEquals(2001, nw.getYearValue());
    }

    @Test
    public void testNext_yearAtUpperLimit_returnsNull() {
        Calendar cal = Calendar.getInstance();
        cal.set(9999, Calendar.DECEMBER, 31);
        int actualMax = cal.getActualMaximum(Calendar.WEEK_OF_YEAR);

        Week w = new Week(actualMax, 9999);
        RegularTimePeriod nextPeriod = w.next();
        assertNull(nextPeriod);
    }

    @Test
    public void testNextThenPrevious_roundTrip() {
        Week original = new Week(10, 2000);
        RegularTimePeriod nextP = original.next();
        RegularTimePeriod backP = nextP.previous();
        assertEquals(original, backP);
    }

    // ---------------------------------------------------------------
    // equals() / hashCode()
    // ---------------------------------------------------------------

    @Test
    public void testEquals_sameInstance() {
        Week w = new Week(5, 2000);
        assertTrue(w.equals(w));
    }

    @Test
    public void testEquals_null() {
        Week w = new Week(5, 2000);
        assertFalse(w.equals(null));
    }

    @Test
    public void testEquals_differentClass() {
        Week w = new Week(5, 2000);
        assertFalse(w.equals("not a week"));
    }

    @Test
    public void testEquals_differentWeekNumber() {
        Week w1 = new Week(5, 2000);
        Week w2 = new Week(6, 2000);
        assertFalse(w1.equals(w2));
    }

    @Test
    public void testEquals_differentYear() {
        Week w1 = new Week(5, 2000);
        Week w2 = new Week(5, 2001);
        assertFalse(w1.equals(w2));
    }

    @Test
    public void testEquals_equalWeeks() {
        Week w1 = new Week(5, 2000);
        Week w2 = new Week(5, 2000);
        assertTrue(w1.equals(w2));
    }

    @Test
    public void testHashCode_consistentForEqualObjects() {
        Week w1 = new Week(5, 2000);
        Week w2 = new Week(5, 2000);
        assertEquals(w1.hashCode(), w2.hashCode());
    }

    // ---------------------------------------------------------------
    // compareTo()
    // ---------------------------------------------------------------

    @Test
    public void testCompareTo_sameWeek() {
        Week w1 = new Week(5, 2000);
        Week w2 = new Week(5, 2000);
        assertEquals(0, w1.compareTo(w2));
    }

    @Test
    public void testCompareTo_earlierWeekSameYear() {
        Week w1 = new Week(4, 2000);
        Week w2 = new Week(5, 2000);
        assertTrue(w1.compareTo(w2) < 0);
    }

    @Test
    public void testCompareTo_laterYear() {
        Week w1 = new Week(5, 2001);
        Week w2 = new Week(5, 2000);
        assertTrue(w1.compareTo(w2) > 0);
    }

    // Year ถือว่าเป็น RegularTimePeriod (ใช้ในซอร์สเดิมเป็น parameter type ของ Week(int, Year))
    @Test
    public void testCompareTo_regularTimePeriodOtherType() {
        Week w = new Week(5, 2000);
        Year y = new Year(2000);
        assertEquals(0, w.compareTo(y));
    }

    @Test
    public void testCompareTo_nonTimePeriodObject() {
        Week w = new Week(5, 2000);
        assertEquals(1, w.compareTo("not a time period"));
    }

    // ---------------------------------------------------------------
    // parseWeek()
    // ---------------------------------------------------------------

    @Test
    public void testParseWeek_null() {
        assertNull(Week.parseWeek(null));
    }

    @Test(expected = TimePeriodFormatException.class)
    public void testParseWeek_noSeparator() {
        Week.parseWeek("200003");
    }

    @Test
    public void testParseWeek_yearDashW() {
        Week w = Week.parseWeek("2002-W03");
        assertNotNull(w);
        assertEquals(3, w.getWeek());
        assertEquals(2002, w.getYearValue());
    }

    @Test
    public void testParseWeek_WDashYear() {
        Week w = Week.parseWeek("W03-2002");
        assertNotNull(w);
        assertEquals(3, w.getWeek());
        assertEquals(2002, w.getYearValue());
    }

    @Test
    public void testParseWeek_commaSeparator() {
        Week w = Week.parseWeek("2002,W03");
        assertNotNull(w);
        assertEquals(3, w.getWeek());
        assertEquals(2002, w.getYearValue());
    }

    @Test
    public void testParseWeek_spaceSeparator() {
        Week w = Week.parseWeek("2002 W03");
        assertNotNull(w);
        assertEquals(3, w.getWeek());
        assertEquals(2002, w.getYearValue());
    }

    @Test
    public void testParseWeek_dotSeparator() {
        Week w = Week.parseWeek("2002.W03");
        assertNotNull(w);
        assertEquals(3, w.getWeek());
        assertEquals(2002, w.getYearValue());
    }

    @Test(expected = TimePeriodFormatException.class)
    public void testParseWeek_invalidWeekNumber() {
        Week.parseWeek("2002-W99");
    }

    @Test(expected = TimePeriodFormatException.class)
    public void testParseWeek_invalidYearBothSides() {
        Week.parseWeek("ABCD-EFGH");
    }
}
```

## สรุปการครอบคลุม Branch/Condition

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| testDefaultConstructor_producesValidWeek | `Week()` → เรียก `this(new Date())` |
| testWeekYearConstructor_validBoundaries | ค่า boundary week=1, week=53 (ไม่ throw) |
| testWeekYearConstructor_belowRange/aboveRange_...defect | เงื่อนไข `&&` dead-code — ยืนยันไม่ throw (known defect) |
| testWeekYearConstructor_largeValue_byteOverflow | byte overflow ของ field `week` |
| testWeekYearObjectConstructor | Constructor `Week(int, Year)` |
| testDateConstructor_basic | Constructor `Week(Date)` |
| testDeprecatedDateTimeZoneConstructor_ignoresPassedZone | Constructor `Week(Date, TimeZone)` (bug: ไม่ใช้ zone) |
| testDateTimeZoneLocaleConstructor_nullTime/nullZone/nullLocale | 3 if-null check ใน `Week(Date, TimeZone, Locale)` |
| testDateTimeZoneLocaleConstructor_normalMidYear | else branch หลัก + else-if false (month≠JAN) |
| testDateTimeZoneLocaleConstructor_JanuaryNotBoundary | else branch, month==JAN but week<52 (false condition) |
| testDateTimeZoneLocaleConstructor_DecemberBelongsToNextYearWeek1 | if branch: `tempWeek==1 && MONTH==DECEMBER` true |
| testDateTimeZoneLocaleConstructor_JanuaryBelongsToPreviousYearLastWeek | else branch: `MONTH==JANUARY && week>=52` true |
| testGetYearAndGetYearValue / testGetWeek | Getter methods |
| testGetFirstAndLastMillisecond_orderedCorrectly | `getFirstMillisecond()`/`getLastMillisecond()` |
| testGetSerialIndex | `getSerialIndex()` |
| testToString | `toString()` |
| testPeg_doesNotThrowAndKeepsOrdering | `peg(Calendar)` |
| testGetFirstMillisecondCalendar_null / testGetLastMillisecondCalendar_null | NullPointerException เมื่อ calendar เป็น null |
| testPrevious_notFirstWeek | `previous()`: `week != FIRST_WEEK_IN_YEAR` true |
| testPrevious_firstWeek_yearGreaterThan1900 | `previous()`: week==1, `year > 1900` true |
| testPrevious_firstWeek_year1900_returnsNull | `previous()`: week==1, `year > 1900` false → null |
| testNext_weekLessThan52 | `next()`: `week < 52` true |
| testNext_week52_lessThanActualMax | `next()`: `week < actualMaxWeek` true |
| testNext_weekEqualsActualMax_rolloverToNextYear | `next()`: else branch, `year < 9999` true |
| testNext_yearAtUpperLimit_returnsNull | `next()`: else branch, `year < 9999` false → null |
| testNextThenPrevious_roundTrip | ทดสอบความสอดคล้องระหว่าง next()/previous() |
| testEquals_sameInstance | `equals()`: `obj == this` true |
| testEquals_null / testEquals_differentClass | `equals()`: `!(obj instanceof Week)` true |
| testEquals_differentWeekNumber | `equals()`: `week != week` true |
| testEquals_differentYear | `equals()`: `year != year` true |
| testEquals_equalWeeks | `equals()`: ทุกเงื่อนไข false → true |
| testHashCode_consistentForEqualObjects | `hashCode()` |
| testCompareTo_sameWeek/earlierWeekSameYear/laterYear | `compareTo()`: case `instanceof Week` (result==0 และ !=0) |
| testCompareTo_regularTimePeriodOtherType | `compareTo()`: case `instanceof RegularTimePeriod` |
| testCompareTo_nonTimePeriodObject | `compareTo()`: else case |
| testParseWeek_null | `parseWeek(null)` → return null |
| testParseWeek_noSeparator | `findSeparator` return -1 → throw |
| testParseWeek_yearDashW / WDashYear / comma / space / dot | if-else ของ s1/s2 เป็น year, และ `findSeparator` ทุก separator char |
| testParseWeek_invalidWeekNumber | `stringToWeek` return -1 → throw |
| testParseWeek_invalidYearBothSides | ทั้ง s1,s2 ไม่ใช่ year → throw |

**หมายเหตุสำคัญ**: เทสหลายตัวใช้ `Assume.assumeTrue` สำหรับ branch ที่พึ่งพา locale-specific calendar computation (Dec→week1, Jan→week52/53) เพื่อความปลอดภัยข้าม JVM/environment โดยยังคง execute และ assert จริงเมื่อ precondition เป็นไปตามที่คาด — ไม่ได้ hardcode ค่าที่ไม่แน่ใจ 100%