package org.apache.commons.lang.time;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class FastDateFormatTest {

    private Locale defaultLocale;
    private TimeZone defaultTimeZone;

    @Before
    public void setUp() {
        defaultLocale = Locale.getDefault();
        defaultTimeZone = TimeZone.getDefault();
    }

    @After
    public void tearDown() {
        Locale.setDefault(defaultLocale);
        TimeZone.setDefault(defaultTimeZone);
    }

    // =========================================================================
    // Factory methods & Instance cache coverage (including Lang-50 fault check)
    // =========================================================================

    @Test
    public void testGetInstance_Default() {
        FastDateFormat fdf = FastDateFormat.getInstance();
        assertNotNull(fdf);
        assertNotNull(fdf.getPattern());
        assertEquals(TimeZone.getDefault(), fdf.getTimeZone());
        assertEquals(Locale.getDefault(), fdf.getLocale());
    }

    @Test
    public void testGetInstance_Pattern() {
        FastDateFormat fdf1 = FastDateFormat.getInstance("yyyy-MM-dd");
        FastDateFormat fdf2 = FastDateFormat.getInstance("yyyy-MM-dd");
        assertSame(fdf1, fdf2);
        assertEquals("yyyy-MM-dd", fdf1.getPattern());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetInstance_NullPattern() {
        FastDateFormat.getInstance(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetInstance_InvalidPattern() {
        FastDateFormat.getInstance("yyyy-MM-dd QQQ");
    }

    @Test
    public void testGetInstance_PatternTimeZoneLocale() {
        TimeZone tz = TimeZone.getTimeZone("GMT+2");
        Locale locale = Locale.GERMANY;

        FastDateFormat fdf1 = FastDateFormat.getInstance("yyyy-MM-dd", tz);
        FastDateFormat fdf2 = FastDateFormat.getInstance("yyyy-MM-dd", locale);
        FastDateFormat fdf3 = FastDateFormat.getInstance("yyyy-MM-dd", tz, locale);

        assertEquals(tz, fdf1.getTimeZone());
        assertEquals(locale, fdf2.getLocale());
        assertEquals(tz, fdf3.getTimeZone());
        assertEquals(locale, fdf3.getLocale());
        assertTrue(fdf1.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetDateInstance_StylesAndLocales() {
        FastDateFormat fdfDefault = FastDateFormat.getDateInstance(FastDateFormat.SHORT);
        FastDateFormat fdfUS = FastDateFormat.getDateInstance(FastDateFormat.SHORT, Locale.US);
        FastDateFormat fdfDE = FastDateFormat.getDateInstance(FastDateFormat.SHORT, Locale.GERMANY);

        assertNotNull(fdfDefault);
        assertNotNull(fdfUS);
        assertNotNull(fdfDE);

        FastDateFormat fdfTz = FastDateFormat.getDateInstance(FastDateFormat.MEDIUM, TimeZone.getTimeZone("GMT"));
        assertNotNull(fdfTz);

        FastDateFormat fdfAll = FastDateFormat.getDateInstance(FastDateFormat.LONG, TimeZone.getTimeZone("UTC"), Locale.FRANCE);
        assertNotNull(fdfAll);
        assertEquals(Locale.FRANCE, fdfAll.getLocale());
    }

    @Test
    public void testGetTimeInstance_StylesAndLocales() {
        FastDateFormat fdfDefault = FastDateFormat.getTimeInstance(FastDateFormat.SHORT);
        FastDateFormat fdfLocale = FastDateFormat.getTimeInstance(FastDateFormat.MEDIUM, Locale.UK);
        FastDateFormat fdfTz = FastDateFormat.getTimeInstance(FastDateFormat.LONG, TimeZone.getTimeZone("GMT"));
        FastDateFormat fdfAll = FastDateFormat.getTimeInstance(FastDateFormat.FULL, TimeZone.getTimeZone("UTC"), Locale.JAPAN);

        assertNotNull(fdfDefault);
        assertNotNull(fdfLocale);
        assertNotNull(fdfTz);
        assertNotNull(fdfAll);
        assertEquals(Locale.JAPAN, fdfAll.getLocale());
    }

    @Test
    public void testGetDateTimeInstance_StylesAndLocales() {
        FastDateFormat fdfDefault = FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.SHORT);
        FastDateFormat fdfLocale = FastDateFormat.getDateTimeInstance(FastDateFormat.MEDIUM, FastDateFormat.SHORT, Locale.FRANCE);
        FastDateFormat fdfTz = FastDateFormat.getDateTimeInstance(FastDateFormat.LONG, FastDateFormat.MEDIUM, TimeZone.getTimeZone("GMT"));
        FastDateFormat fdfAll = FastDateFormat.getDateTimeInstance(FastDateFormat.FULL, FastDateFormat.FULL, TimeZone.getTimeZone("UTC"), Locale.ITALY);

        assertNotNull(fdfDefault);
        assertNotNull(fdfLocale);
        assertNotNull(fdfTz);
        assertNotNull(fdfAll);
        assertEquals(Locale.ITALY, fdfAll.getLocale());
    }

    @Test
    public void testDateInstanceCachingWithLocaleChange() {
        Locale.setDefault(Locale.US);
        FastDateFormat usInstance1 = FastDateFormat.getDateInstance(FastDateFormat.SHORT, (Locale) null);
        FastDateFormat usInstance2 = FastDateFormat.getDateInstance(FastDateFormat.SHORT, Locale.US);
        assertEquals(usInstance1.format(new Date()), usInstance2.format(new Date()));

        Locale.setDefault(Locale.GERMANY);
        FastDateFormat deInstance = FastDateFormat.getDateInstance(FastDateFormat.SHORT, (Locale) null);
        assertNotNull(deInstance);
    }

    // =========================================================================
    // Format Rule Coverage (All pattern tokens)
    // =========================================================================

    @Test
    public void testFormat_EraAndYear() {
        // 'G' (Era), 'y' (<4 TwoDigitYearField, >=4 Padded/selectNumberRule)
        FastDateFormat fdf = FastDateFormat.getInstance("G yy yyyy", Locale.US);
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1);
        String formatted = fdf.format(cal);
        assertEquals("AD 23 2023", formatted);
    }

    @Test
    public void testFormat_Months() {
        // 'M' (1 unpadded, 2 two-digit, 3 short, 4 full)
        FastDateFormat fdf = FastDateFormat.getInstance("M MM MMM MMMM", Locale.US);
        Calendar cal = new GregorianCalendar(2023, Calendar.MARCH, 5);
        assertEquals("3 03 Mar March", fdf.format(cal));

        Calendar calOct = new GregorianCalendar(2023, Calendar.OCTOBER, 5);
        assertEquals("10 10 Oct October", fdf.format(calOct));
    }

    @Test
    public void testFormat_DayOfWeekAndDayInMonth() {
        // 'd', 'dd', 'E', 'EEEE', 'F', 'D'
        FastDateFormat fdf = FastDateFormat.getInstance("d dd E EEEE F D", Locale.US);
        Calendar cal = new GregorianCalendar(2023, Calendar.MARCH, 5); // Sunday, 64th day of 2023
        assertEquals("5 05 Sun Sunday 1 64", fdf.format(cal));
    }

    @Test
    public void testFormat_HoursAndAmPm() {
        // 'h' (1..12), 'H' (0..23), 'k' (1..24), 'K' (0..11), 'a' (AM/PM)
        FastDateFormat fdf = FastDateFormat.getInstance("h H k K a", Locale.US);

        // Midnight edge case
        Calendar midnight = new GregorianCalendar(2023, Calendar.JANUARY, 1, 0, 15, 0);
        assertEquals("12 0 24 0 AM", fdf.format(midnight));

        // Noon edge case
        Calendar noon = new GregorianCalendar(2023, Calendar.JANUARY, 1, 12, 15, 0);
        assertEquals("12 12 12 0 PM", fdf.format(noon));

        // Afternoon
        Calendar afternoon = new GregorianCalendar(2023, Calendar.JANUARY, 1, 15, 15, 0);
        assertEquals("3 15 15 3 PM", fdf.format(afternoon));
    }

    @Test
    public void testFormat_MinutesSecondsAndMilliseconds() {
        // 'm', 's', 'S', 'SS', 'SSS', 'SSSS'
        FastDateFormat fdf = FastDateFormat.getInstance("m:s:S:SS:SSS:SSSS");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1, 1, 5, 9);
        cal.set(Calendar.MILLISECOND, 7);
        assertEquals("5:9:7:07:007:0007", fdf.format(cal));

        cal.set(Calendar.MILLISECOND, 123);
        assertEquals("5:9:123:123:123:0123", fdf.format(cal));
    }

    @Test
    public void testFormat_Weeks() {
        // 'w' (week of year), 'W' (week of month)
        FastDateFormat fdf = FastDateFormat.getInstance("w W", Locale.US);
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 15);
        String result = fdf.format(cal);
        assertNotNull(result);
        assertTrue(result.contains(" "));
    }

    @Test
    public void testFormat_TimeZones() {
        // 'z' (short), 'zzzz' (long), 'Z' (RFC822), 'ZZ' (ISO8601)
        TimeZone tz = TimeZone.getTimeZone("GMT-05:00");
        FastDateFormat fdf = FastDateFormat.getInstance("z zzzz Z ZZ", tz, Locale.US);
        Calendar cal = new GregorianCalendar(tz, Locale.US);
        cal.set(2023, Calendar.JANUARY, 1, 12, 0, 0);

        String result = fdf.format(cal);
        assertTrue(result.contains("-0500"));
        assertTrue(result.contains("-05:00"));
    }

    @Test
    public void testFormat_DaylightSavingTimeZone() {
        // Use SimpleTimeZone with DST
        SimpleTimeZone dstTz = new SimpleTimeZone(
                -5 * 3600000, "America/New_York",
                Calendar.MARCH, 2, Calendar.SUNDAY, 2 * 3600000,
                Calendar.NOVEMBER, 1, Calendar.SUNDAY, 2 * 3600000
        );
        FastDateFormat fdf = FastDateFormat.getInstance("z zzzz", dstTz, Locale.US);

        Calendar calDst = new GregorianCalendar(dstTz, Locale.US);
        calDst.set(2023, Calendar.JUNE, 1, 12, 0, 0); // Summer (DST active)
        String dstResult = fdf.format(calDst);
        assertTrue(dstResult.contains("EDT") || dstResult.contains("Eastern Daylight"));

        // Unforced timezone formatting with Calendar's own timezone
        FastDateFormat fdfUnforced = FastDateFormat.getInstance("z zzzz", Locale.US);
        String unforcedResult = fdfUnforced.format(calDst);
        assertNotNull(unforcedResult);
    }

    @Test
    public void testFormat_LiteralsAndEscapes() {
        FastDateFormat fdf = FastDateFormat.getInstance("'' 'Year:' yyyy 'o''clock' ''");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1);
        assertEquals("' Year: 2023 o'clock '", fdf.format(cal));
    }

    // =========================================================================
    // format(...) Overloads & Boundary Conditions
    // =========================================================================

    @Test
    public void testFormat_Overloads() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss", TimeZone.getTimeZone("UTC"), Locale.US);
        Date date = new Date(1672531199000L); // 2022-12-31 23:59:59 UTC
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("UTC"), Locale.US);
        cal.setTime(date);

        // format(long)
        assertEquals("2022-12-31 23:59:59", fdf.format(date.getTime()));

        // format(Date)
        assertEquals("2022-12-31 23:59:59", fdf.format(date));

        // format(Calendar)
        assertEquals("2022-12-31 23:59:59", fdf.format(cal));

        // format(long, StringBuffer)
        StringBuffer sb1 = new StringBuffer("Result: ");
        assertSame(sb1, fdf.format(date.getTime(), sb1));
        assertEquals("Result: 2022-12-31 23:59:59", sb1.toString());

        // format(Date, StringBuffer)
        StringBuffer sb2 = new StringBuffer();
        assertSame(sb2, fdf.format(date, sb2));
        assertEquals("2022-12-31 23:59:59", sb2.toString());

        // format(Calendar, StringBuffer)
        StringBuffer sb3 = new StringBuffer();
        assertSame(sb3, fdf.format(cal, sb3));
        assertEquals("2022-12-31 23:59:59", sb3.toString());

        // format(Object, StringBuffer, FieldPosition)
        assertEquals("2022-12-31 23:59:59", fdf.format((Object) date, new StringBuffer(), new FieldPosition(0)).toString());
        assertEquals("2022-12-31 23:59:59", fdf.format((Object) cal, new StringBuffer(), new FieldPosition(0)).toString());
        assertEquals("2022-12-31 23:59:59", fdf.format((Object) new Long(date.getTime()), new StringBuffer(), new FieldPosition(0)).toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormat_NullObjectThrows() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy");
        fdf.format(null, new StringBuffer(), new FieldPosition(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormat_InvalidObjectTypeThrows() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy");
        fdf.format("Not a date", new StringBuffer(), new FieldPosition(0));
    }

    @Test
    public void testParseObjectUnsupported() {
        FastDateFormat fdf = FastDateFormat.getInstance();
        ParsePosition pos = new ParsePosition(5);
        Object result = fdf.parseObject("2023-01-01", pos);
        assertNull(result);
        assertEquals(0, pos.getIndex());
        assertEquals(0, pos.getErrorIndex());
    }

    // =========================================================================
    // Number Padding Boundary Cases
    // =========================================================================

    @Test
    public void testNumberRule_PaddingEdgeCases() {
        // Test padded year with 5 digits, large numbers
        FastDateFormat fdf = FastDateFormat.getInstance("yyyyy-MM-dd");
        Calendar cal = new GregorianCalendar(999, Calendar.JANUARY, 1);
        assertEquals("00999-01-01", fdf.format(cal));

        cal.set(Calendar.YEAR, 12345);
        assertEquals("12345-01-01", fdf.format(cal));
    }

    // =========================================================================
    // equals(), hashCode(), toString() & Serialization
    // =========================================================================

    @Test
    public void testEqualsAndHashCode() {
        FastDateFormat fdf1 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("UTC"), Locale.US);
        FastDateFormat fdf2 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("UTC"), Locale.US);
        FastDateFormat fdfDiffPattern = FastDateFormat.getInstance("yyyy/MM/dd", TimeZone.getTimeZone("UTC"), Locale.US);
        FastDateFormat fdfDiffTz = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT+1"), Locale.US);
        FastDateFormat fdfDiffLocale = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("UTC"), Locale.GERMANY);

        assertTrue(fdf1.equals(fdf1));
        assertTrue(fdf1.equals(fdf2));
        assertEquals(fdf1.hashCode(), fdf2.hashCode());

        assertFalse(fdf1.equals(null));
        assertFalse(fdf1.equals("A String"));
        assertFalse(fdf1.equals(fdfDiffPattern));
        assertFalse(fdf1.equals(fdfDiffTz));
        assertFalse(fdf1.equals(fdfDiffLocale));

        assertTrue(fdf1.toString().contains("FastDateFormat[yyyy-MM-dd]"));
    }

    @Test
    public void testSerialization() throws Exception {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss", TimeZone.getTimeZone("UTC"), Locale.US);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(fdf);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        FastDateFormat deserialized = (FastDateFormat) ois.readObject();
        ois.close();

        assertEquals(fdf, deserialized);
        Date now = new Date();
        assertEquals(fdf.format(now), deserialized.format(now));
        assertTrue(deserialized.getMaxLengthEstimate() > 0);
    }
}