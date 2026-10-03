package org.apache.commons.lang3.time;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

import org.junit.Test;

public class FastDateFormatTest {

    private static final TimeZone GMT = TimeZone.getTimeZone("GMT");
    private static final TimeZone EST = TimeZone.getTimeZone("America/New_York");
    private static final TimeZone PLUS_TWO = TimeZone.getTimeZone("GMT+02:00");
    private static final TimeZone MINUS_FIVE = TimeZone.getTimeZone("GMT-05:00");

    @Test
    public void testFactoryGetInstances() {
        FastDateFormat fdfDefault = FastDateFormat.getInstance();
        assertNotNull(fdfDefault);
        assertNotNull(fdfDefault.getPattern());

        FastDateFormat fdfPattern = FastDateFormat.getInstance("yyyy-MM-dd");
        assertEquals("yyyy-MM-dd", fdfPattern.getPattern());

        FastDateFormat fdfTz = FastDateFormat.getInstance("yyyy-MM-dd", GMT);
        assertEquals(GMT, fdfTz.getTimeZone());
        assertTrue(fdfTz.getTimeZoneOverridesCalendar());

        FastDateFormat fdfLoc = FastDateFormat.getInstance("yyyy-MM-dd", Locale.GERMANY);
        assertEquals(Locale.GERMANY, fdfLoc.getLocale());

        FastDateFormat fdfAll = FastDateFormat.getInstance("yyyy-MM-dd", GMT, Locale.GERMANY);
        assertEquals(GMT, fdfAll.getTimeZone());
        assertEquals(Locale.GERMANY, fdfAll.getLocale());

        // Test Caching
        FastDateFormat fdfCached = FastDateFormat.getInstance("yyyy-MM-dd", GMT, Locale.GERMANY);
        assertSame(fdfAll, fdfCached);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetInstanceNullPattern() {
        FastDateFormat.getInstance(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetInstanceInvalidPattern() {
        FastDateFormat.getInstance("yyyy-MM-dd QQQ");
    }

    @Test
    public void testDateStyleInstances() {
        FastDateFormat fdf1 = FastDateFormat.getDateInstance(FastDateFormat.FULL);
        FastDateFormat fdf2 = FastDateFormat.getDateInstance(FastDateFormat.LONG, Locale.US);
        FastDateFormat fdf3 = FastDateFormat.getDateInstance(FastDateFormat.MEDIUM, GMT);
        FastDateFormat fdf4 = FastDateFormat.getDateInstance(FastDateFormat.SHORT, GMT, Locale.US);

        assertNotNull(fdf1);
        assertNotNull(fdf2);
        assertNotNull(fdf3);
        assertNotNull(fdf4);

        // Cache verification
        FastDateFormat fdf4Cached = FastDateFormat.getDateInstance(FastDateFormat.SHORT, GMT, Locale.US);
        assertSame(fdf4, fdf4Cached);
    }

    @Test
    public void testTimeStyleInstances() {
        FastDateFormat fdf1 = FastDateFormat.getTimeInstance(FastDateFormat.FULL);
        FastDateFormat fdf2 = FastDateFormat.getTimeInstance(FastDateFormat.LONG, Locale.US);
        FastDateFormat fdf3 = FastDateFormat.getTimeInstance(FastDateFormat.MEDIUM, GMT);
        FastDateFormat fdf4 = FastDateFormat.getTimeInstance(FastDateFormat.SHORT, GMT, Locale.US);

        assertNotNull(fdf1);
        assertNotNull(fdf2);
        assertNotNull(fdf3);
        assertNotNull(fdf4);

        FastDateFormat fdf4Cached = FastDateFormat.getTimeInstance(FastDateFormat.SHORT, GMT, Locale.US);
        assertSame(fdf4, fdf4Cached);
    }

    @Test
    public void testDateTimeStyleInstances() {
        FastDateFormat fdf1 = FastDateFormat.getDateTimeInstance(FastDateFormat.FULL, FastDateFormat.SHORT);
        FastDateFormat fdf2 = FastDateFormat.getDateTimeInstance(FastDateFormat.LONG, FastDateFormat.MEDIUM, Locale.US);
        FastDateFormat fdf3 = FastDateFormat.getDateTimeInstance(FastDateFormat.MEDIUM, FastDateFormat.LONG, GMT);
        FastDateFormat fdf4 = FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.FULL, GMT, Locale.US);

        assertNotNull(fdf1);
        assertNotNull(fdf2);
        assertNotNull(fdf3);
        assertNotNull(fdf4);

        FastDateFormat fdf4Cached = FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.FULL, GMT, Locale.US);
        assertSame(fdf4, fdf4Cached);
    }

    @Test
    public void testPatternFormattingAllFields() {
        // Date: 2023-01-05 00:07:09.008 (Midnight, Jan 5, 2023)
        Calendar cal = new GregorianCalendar(GMT, Locale.US);
        cal.clear();
        cal.set(2023, Calendar.JANUARY, 5, 0, 7, 9);
        cal.set(Calendar.MILLISECOND, 8);
        Date date = cal.getTime();

        // Testing:
        // G: AD
        // yyyy / yy: 2023 / 23
        // MMMM / MMM / MM / M: January / Jan / 01 / 1
        // dd / d: 05 / 5
        // h / H / k / K: (12 at midnight) / 00 / 24 / 0
        // mm / m: 07 / 7
        // ss / s: 09 / 9
        // SSS / S: 008 / 8
        // EEEE / E: Thursday / Thu
        // D / w / W / F: Day of year / Week in year / Week in month / Day of week in month
        // a: AM
        String pattern = "G yyyy yy MMMM MMM MM M dd d hh h HH H kk k KK K mm m ss s SSS S EEEE E D w W F a";
        FastDateFormat fdf = FastDateFormat.getInstance(pattern, GMT, Locale.US);
        String formatted = fdf.format(date);

        assertTrue(formatted.contains("AD"));
        assertTrue(formatted.contains("2023 23"));
        assertTrue(formatted.contains("January Jan 01 1"));
        assertTrue(formatted.contains("05 5"));
        assertTrue(formatted.contains("12 12 00 0 24 24 00 0"));
        assertTrue(formatted.contains("07 7"));
        assertTrue(formatted.contains("09 9"));
        assertTrue(formatted.contains("008 8"));
        assertTrue(formatted.contains("Thursday Thu"));
        assertTrue(formatted.contains("AM"));
    }

    @Test
    public void testLiteralsAndQuotes() {
        FastDateFormat fdf = FastDateFormat.getInstance("'' 'Text' 'A' yyyy", GMT);
        Calendar cal = new GregorianCalendar(GMT, Locale.US);
        cal.set(2023, Calendar.JANUARY, 1);
        String formatted = fdf.format(cal);
        assertEquals("' Text A 2023", formatted);
    }

    @Test
    public void testPaddedNumberRules() {
        // Padding >= 3: yyyyy, ddd
        FastDateFormat fdf = FastDateFormat.getInstance("yyyyy-ddd-SSS", GMT);
        Calendar cal = new GregorianCalendar(GMT, Locale.US);
        
        // Value < 100
        cal.set(Calendar.YEAR, 23);
        cal.set(Calendar.DAY_OF_YEAR, 5);
        cal.set(Calendar.MILLISECOND, 9);
        assertEquals("00023-005-009", fdf.format(cal));

        // Value 100 - 999
        cal.set(Calendar.YEAR, 456);
        cal.set(Calendar.DAY_OF_YEAR, 123);
        cal.set(Calendar.MILLISECOND, 789);
        assertEquals("00456-123-789", fdf.format(cal));

        // Value >= 1000
        cal.set(Calendar.YEAR, 2023);
        assertEquals("02023-123-789", fdf.format(cal));
    }

    @Test
    public void testTimeZoneNumericRules() {
        FastDateFormat fdfNoColon = FastDateFormat.getInstance("Z", PLUS_TWO);
        FastDateFormat fdfColon = FastDateFormat.getInstance("ZZ", PLUS_TWO);
        FastDateFormat fdfNegNoColon = FastDateFormat.getInstance("Z", MINUS_FIVE);
        FastDateFormat fdfNegColon = FastDateFormat.getInstance("ZZ", MINUS_FIVE);

        Calendar cal = new GregorianCalendar(GMT);
        cal.setTimeInMillis(0);

        assertEquals("+0200", fdfNoColon.format(cal));
        assertEquals("+02:00", fdfColon.format(cal));
        assertEquals("-0500", fdfNegNoColon.format(cal));
        assertEquals("-05:00", fdfNegColon.format(cal));
    }

    @Test
    public void testTimeZoneNameRules() {
        // Long and Short style, Forced TimeZone
        FastDateFormat fdfShortForced = FastDateFormat.getInstance("z", EST, Locale.US);
        FastDateFormat fdfLongForced = FastDateFormat.getInstance("zzzz", EST, Locale.US);

        Calendar standardTime = new GregorianCalendar(EST, Locale.US);
        standardTime.set(2023, Calendar.JANUARY, 1);

        String shortStd = fdfShortForced.format(standardTime);
        String longStd = fdfLongForced.format(standardTime);
        assertEquals("EST", shortStd);
        assertEquals("Eastern Standard Time", longStd);

        // Daylight Saving Time (DST)
        Calendar daylightTime = new GregorianCalendar(EST, Locale.US);
        daylightTime.set(2023, Calendar.JULY, 1);
        String shortDst = fdfShortForced.format(daylightTime);
        String longDst = fdfLongForced.format(daylightTime);
        assertEquals("EDT", shortDst);
        assertEquals("Eastern Daylight Time", longDst);

        // Unforced TimeZone
        FastDateFormat fdfUnforced = FastDateFormat.getInstance("z zzzz", Locale.US);
        assertFalse(fdfUnforced.getTimeZoneOverridesCalendar());
        String unforcedResult = fdfUnforced.format(standardTime);
        assertTrue(unforcedResult.contains("EST"));
    }

    @Test
    public void testFormatOverloads() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss", GMT);
        long millis = 1672531199000L; // 2022-12-31 23:59:59 GMT
        Date date = new Date(millis);
        Calendar cal = new GregorianCalendar(GMT);
        cal.setTime(date);

        assertEquals("2022-12-31 23:59:59", fdf.format(millis));
        assertEquals("2022-12-31 23:59:59", fdf.format(date));
        assertEquals("2022-12-31 23:59:59", fdf.format(cal));

        StringBuffer buf = new StringBuffer("Prefix: ");
        fdf.format(millis, buf);
        assertEquals("Prefix: 2022-12-31 23:59:59", buf.toString());

        buf = new StringBuffer("Date: ");
        fdf.format(date, buf);
        assertEquals("Date: 2022-12-31 23:59:59", buf.toString());

        buf = new StringBuffer("Cal: ");
        fdf.format(cal, buf);
        assertEquals("Cal: 2022-12-31 23:59:59", buf.toString());

        // Format Object dispatch
        StringBuffer objBuf = new StringBuffer();
        fdf.format((Object) date, objBuf, new FieldPosition(0));
        assertEquals("2022-12-31 23:59:59", objBuf.toString());

        objBuf = new StringBuffer();
        fdf.format((Object) cal, objBuf, new FieldPosition(0));
        assertEquals("2022-12-31 23:59:59", objBuf.toString());

        objBuf = new StringBuffer();
        fdf.format((Object) Long.valueOf(millis), objBuf, new FieldPosition(0));
        assertEquals("2022-12-31 23:59:59", objBuf.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatInvalidObject() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy");
        fdf.format("2023-01-01", new StringBuffer(), new FieldPosition(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatNullObject() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy");
        fdf.format(null, new StringBuffer(), new FieldPosition(0));
    }

    @Test
    public void testCalendarTimeZoneOverride() {
        // Defect Lang-38 regression check
        // Formatter is forced to GMT+02:00
        FastDateFormat fdf = FastDateFormat.getInstance("HH:mm", PLUS_TWO);
        
        // Calendar is created in GMT-05:00 with time 10:00 GMT-05:00
        Calendar cal = new GregorianCalendar(MINUS_FIVE);
        cal.clear();
        cal.set(2023, Calendar.JANUARY, 1, 10, 0, 0); // 10:00 -05:00 is 15:00 GMT, which is 17:00 +02:00
        
        String formatted = fdf.format(cal);
        assertEquals("17:00", formatted);
    }

    @Test
    public void testParseObject() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd");
        ParsePosition pos = new ParsePosition(5);
        pos.setErrorIndex(2);
        Object result = fdf.parseObject("2023-01-01", pos);
        assertNull(result);
        assertEquals(0, pos.getIndex());
        assertEquals(0, pos.getErrorIndex());
    }

    @Test
    public void testEqualsAndHashCode() {
        FastDateFormat fdf1 = FastDateFormat.getInstance("yyyy-MM-dd", GMT, Locale.US);
        FastDateFormat fdf2 = FastDateFormat.getInstance("yyyy-MM-dd", GMT, Locale.US);
        FastDateFormat fdfDiffPattern = FastDateFormat.getInstance("yyyy/MM/dd", GMT, Locale.US);
        FastDateFormat fdfDiffTz = FastDateFormat.getInstance("yyyy-MM-dd", EST, Locale.US);
        FastDateFormat fdfDiffLoc = FastDateFormat.getInstance("yyyy-MM-dd", GMT, Locale.GERMANY);
        FastDateFormat fdfUnforcedTz = FastDateFormat.getInstance("yyyy-MM-dd", Locale.US);

        assertTrue(fdf1.equals(fdf1));
        assertTrue(fdf1.equals(fdf2));
        assertEquals(fdf1.hashCode(), fdf2.hashCode());

        assertFalse(fdf1.equals(null));
        assertFalse(fdf1.equals("Not a FastDateFormat"));
        assertFalse(fdf1.equals(fdfDiffPattern));
        assertFalse(fdf1.equals(fdfDiffTz));
        assertFalse(fdf1.equals(fdfDiffLoc));
        assertFalse(fdf1.equals(fdfUnforcedTz));

        assertEquals("FastDateFormat[yyyy-MM-dd]", fdf1.toString());
        assertTrue(fdf1.getMaxLengthEstimate() > 0);
    }

    @Test
    public void testSerialization() throws Exception {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss.SSS Z", GMT, Locale.US);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(fdf);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        FastDateFormat deserialized = (FastDateFormat) ois.readObject();
        ois.close();

        assertEquals(fdf, deserialized);
        assertEquals(fdf.getPattern(), deserialized.getPattern());
        assertEquals(fdf.getTimeZone(), deserialized.getTimeZone());
        assertEquals(fdf.getLocale(), deserialized.getLocale());
        assertEquals(fdf.getMaxLengthEstimate(), deserialized.getMaxLengthEstimate());

        Date now = new Date();
        assertEquals(fdf.format(now), deserialized.format(now));
    }
}