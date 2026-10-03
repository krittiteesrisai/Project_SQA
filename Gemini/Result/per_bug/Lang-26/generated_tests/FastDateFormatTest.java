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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FastDateFormatTest {

    private TimeZone defaultTimeZone;
    private Locale defaultLocale;

    @Before
    public void setUp() {
        defaultTimeZone = TimeZone.getDefault();
        defaultLocale = Locale.getDefault();
    }

    @After
    public void tearDown() {
        TimeZone.setDefault(defaultTimeZone);
        Locale.setDefault(defaultLocale);
    }

    @Test
    public void testFactoryMethodsAndCaching() {
        FastDateFormat f1 = FastDateFormat.getInstance();
        FastDateFormat f2 = FastDateFormat.getInstance();
        assertSame(f1, f2);

        FastDateFormat f3 = FastDateFormat.getInstance("yyyy-MM-dd");
        FastDateFormat f4 = FastDateFormat.getInstance("yyyy-MM-dd");
        assertSame(f3, f4);

        TimeZone tz = TimeZone.getTimeZone("GMT+1");
        FastDateFormat f5 = FastDateFormat.getInstance("yyyy-MM-dd", tz);
        FastDateFormat f6 = FastDateFormat.getInstance("yyyy-MM-dd", tz, null);
        assertSame(f5, f6);

        Locale loc = Locale.GERMANY;
        FastDateFormat f7 = FastDateFormat.getInstance("yyyy-MM-dd", loc);
        FastDateFormat f8 = FastDateFormat.getInstance("yyyy-MM-dd", null, loc);
        assertSame(f7, f8);
    }

    @Test
    public void testDateStyleInstances() {
        int[] styles = {FastDateFormat.FULL, FastDateFormat.LONG, FastDateFormat.MEDIUM, FastDateFormat.SHORT};
        TimeZone tz = TimeZone.getTimeZone("America/New_York");
        Locale loc = Locale.FRANCE;

        for (int style : styles) {
            FastDateFormat f1 = FastDateFormat.getDateInstance(style);
            FastDateFormat f2 = FastDateFormat.getDateInstance(style, loc);
            FastDateFormat f3 = FastDateFormat.getDateInstance(style, tz);
            FastDateFormat f4 = FastDateFormat.getDateInstance(style, tz, loc);

            assertNotNull(f1);
            assertNotNull(f2);
            assertNotNull(f3);
            assertNotNull(f4);

            assertSame(f4, FastDateFormat.getDateInstance(style, tz, loc));
        }
    }

    @Test
    public void testTimeStyleInstances() {
        int[] styles = {FastDateFormat.FULL, FastDateFormat.LONG, FastDateFormat.MEDIUM, FastDateFormat.SHORT};
        TimeZone tz = TimeZone.getTimeZone("Europe/London");
        Locale loc = Locale.UK;

        for (int style : styles) {
            FastDateFormat f1 = FastDateFormat.getTimeInstance(style);
            FastDateFormat f2 = FastDateFormat.getTimeInstance(style, loc);
            FastDateFormat f3 = FastDateFormat.getTimeInstance(style, tz);
            FastDateFormat f4 = FastDateFormat.getTimeInstance(style, tz, loc);

            assertNotNull(f1);
            assertNotNull(f2);
            assertNotNull(f3);
            assertNotNull(f4);

            assertSame(f4, FastDateFormat.getTimeInstance(style, tz, loc));
        }
    }

    @Test
    public void testDateTimeStyleInstances() {
        int[] styles = {FastDateFormat.FULL, FastDateFormat.LONG, FastDateFormat.MEDIUM, FastDateFormat.SHORT};
        TimeZone tz = TimeZone.getTimeZone("Asia/Tokyo");
        Locale loc = Locale.JAPAN;

        for (int dStyle : styles) {
            for (int tStyle : styles) {
                FastDateFormat f1 = FastDateFormat.getDateTimeInstance(dStyle, tStyle);
                FastDateFormat f2 = FastDateFormat.getDateTimeInstance(dStyle, tStyle, loc);
                FastDateFormat f3 = FastDateFormat.getDateTimeInstance(dStyle, tStyle, tz);
                FastDateFormat f4 = FastDateFormat.getDateTimeInstance(dStyle, tStyle, tz, loc);

                assertNotNull(f1);
                assertNotNull(f2);
                assertNotNull(f3);
                assertNotNull(f4);

                assertSame(f4, FastDateFormat.getDateTimeInstance(dStyle, tStyle, tz, loc));
            }
        }
    }

    @Test
    public void testAllPatternTokens() {
        String pattern = "G yyyy yy MMMM MMM MM M d h H m s S EEEE E D F w W a k K z zzzz Z ZZ '' 'T' 'Text'";
        FastDateFormat fdf = FastDateFormat.getInstance(pattern, TimeZone.getTimeZone("GMT"), Locale.US);

        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.US);
        cal.clear();
        cal.set(2023, Calendar.MARCH, 5, 0, 15, 30);
        cal.set(Calendar.MILLISECOND, 7);

        String result = fdf.format(cal);
        assertNotNull(result);
        assertTrue(result.contains("AD"));
        assertTrue(result.contains("2023"));
        assertTrue(result.contains("23"));
        assertTrue(result.contains("March"));
        assertTrue(result.contains("Mar"));
        assertTrue(result.contains("03"));
        assertTrue(result.contains("3"));
        assertTrue(result.contains("Sunday"));
        assertTrue(result.contains("Sun"));
        assertTrue(result.contains("AM"));
        assertTrue(result.contains("'"));
        assertTrue(result.contains("T"));
        assertTrue(result.contains("Text"));
    }

    @Test
    public void testTwelveAndTwentyFourHourFieldBoundaries() {
        FastDateFormat fdf = FastDateFormat.getInstance("h K H k", TimeZone.getTimeZone("GMT"), Locale.US);

        Calendar midnight = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.US);
        midnight.clear();
        midnight.set(2023, Calendar.JANUARY, 1, 0, 0, 0); // 00:00

        // h (1..12) -> 12, K (0..11) -> 0, H (0..23) -> 0, k (1..24) -> 24
        String midResult = fdf.format(midnight);
        assertEquals("12 0 0 24", midResult);

        Calendar noon = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.US);
        noon.clear();
        noon.set(2023, Calendar.JANUARY, 1, 12, 0, 0); // 12:00
        // h (1..12) -> 12, K (0..11) -> 0, H (0..23) -> 12, k (1..24) -> 12
        String noonResult = fdf.format(noon);
        assertEquals("12 0 12 12", noonResult);
    }

    @Test
    public void testNumberPaddingRules() {
        FastDateFormat fdfUnpadded = FastDateFormat.getInstance("s", TimeZone.getTimeZone("GMT"));
        FastDateFormat fdfTwoDigit = FastDateFormat.getInstance("ss", TimeZone.getTimeZone("GMT"));
        FastDateFormat fdfPadded3 = FastDateFormat.getInstance("SSS", TimeZone.getTimeZone("GMT"));
        FastDateFormat fdfPadded5 = FastDateFormat.getInstance("SSSSS", TimeZone.getTimeZone("GMT"));

        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.clear();
        cal.set(2023, Calendar.JANUARY, 1, 0, 0, 5);
        cal.set(Calendar.MILLISECOND, 9);

        assertEquals("5", fdfUnpadded.format(cal));
        assertEquals("05", fdfTwoDigit.format(cal));
        assertEquals("009", fdfPadded3.format(cal));
        assertEquals("00009", fdfPadded5.format(cal));

        cal.set(Calendar.MILLISECOND, 123);
        assertEquals("123", fdfPadded3.format(cal));
        assertEquals("00123", fdfPadded5.format(cal));
    }

    @Test
    public void testTimeZoneNumericFormatting() {
        FastDateFormat noColon = FastDateFormat.getInstance("Z", TimeZone.getTimeZone("GMT+07:00"));
        FastDateFormat colon = FastDateFormat.getInstance("ZZ", TimeZone.getTimeZone("GMT-05:00"));

        Calendar cal = Calendar.getInstance();
        assertEquals("+0700", noColon.format(cal));
        assertEquals("-05:00", colon.format(cal));
    }

    @Test
    public void testTimeZoneNameFormattingDaylight() {
        SimpleTimeZone stz = new SimpleTimeZone(
                -5 * 3600000,
                "America/New_York",
                Calendar.APRIL, 1, 0, 2 * 3600000,
                Calendar.OCTOBER, -1, Calendar.SUNDAY, 2 * 3600000,
                3600000
        );

        FastDateFormat fdfShort = FastDateFormat.getInstance("z", stz, Locale.US);
        FastDateFormat fdfLong = FastDateFormat.getInstance("zzzz", stz, Locale.US);

        Calendar standardCal = Calendar.getInstance(stz, Locale.US);
        standardCal.clear();
        standardCal.set(2023, Calendar.JANUARY, 15, 12, 0, 0);

        Calendar daylightCal = Calendar.getInstance(stz, Locale.US);
        daylightCal.clear();
        daylightCal.set(2023, Calendar.JULY, 15, 12, 0, 0);

        assertNotNull(fdfShort.format(standardCal));
        assertNotNull(fdfShort.format(daylightCal));
        assertNotNull(fdfLong.format(standardCal));
        assertNotNull(fdfLong.format(daylightCal));
    }

    @Test
    public void testFormatObjectTypes() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        Long millis = Long.valueOf(date.getTime());

        StringBuffer buf1 = fdf.format((Object) date, new StringBuffer(), new FieldPosition(0));
        StringBuffer buf2 = fdf.format((Object) cal, new StringBuffer(), new FieldPosition(0));
        StringBuffer buf3 = fdf.format((Object) millis, new StringBuffer(), new FieldPosition(0));

        assertNotNull(buf1);
        assertNotNull(buf2);
        assertNotNull(buf3);
        assertEquals(buf1.toString(), buf3.toString());

        try {
            fdf.format("2023-01-01", new StringBuffer(), new FieldPosition(0));
            fail("Expected IllegalArgumentException for String");
        } catch (IllegalArgumentException expected) {
        }

        try {
            fdf.format(null, new StringBuffer(), new FieldPosition(0));
            fail("Expected IllegalArgumentException for null");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testFormatCalendarWithForcedTimeZone() {
        TimeZone tzGmt = TimeZone.getTimeZone("GMT");
        TimeZone tzTokyo = TimeZone.getTimeZone("Asia/Tokyo");

        FastDateFormat fdfForced = FastDateFormat.getInstance("HH:mm", tzTokyo);
        assertTrue(fdfForced.getTimeZoneOverridesCalendar());

        Calendar gmtCal = Calendar.getInstance(tzGmt);
        gmtCal.clear();
        gmtCal.set(2023, Calendar.JANUARY, 1, 0, 0, 0); // 00:00 GMT

        // Tokyo is GMT+9 -> 09:00
        assertEquals("09:00", fdfForced.format(gmtCal));
    }

    @Test
    public void testLang26WeekOfYearWithLocale() {
        // Defects4J Lang-26 Target Bug:
        // Format with Date vs Calendar for a locale where first day of week / minimal days in week differs
        Locale swedishLocale = new Locale("sv", "SE");
        FastDateFormat fdf = FastDateFormat.getInstance("w", swedishLocale);

        Calendar cal = new GregorianCalendar(swedishLocale);
        cal.clear();
        cal.set(2010, Calendar.JANUARY, 1); // 1 Jan 2010 was week 53 in Sweden
        Date date = cal.getTime();

        String fromCal = fdf.format(cal);
        String fromDate = fdf.format(date);
        assertEquals("Format(Date) should match Format(Calendar) for locale week calculation", fromCal, fromDate);
    }

    @Test
    public void testInvalidPatternsAndNull() {
        try {
            FastDateFormat.getInstance(null);
            fail("Expected IllegalArgumentException for null pattern");
        } catch (IllegalArgumentException expected) {
        }

        try {
            FastDateFormat.getInstance("yyyy-MM-dd X"); // 'X' is invalid in standard SimpleDateFormat/FastDateFormat
            fail("Expected IllegalArgumentException for invalid token 'X'");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testParseObjectNotSupported() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd");
        ParsePosition pos = new ParsePosition(0);
        Object result = fdf.parseObject("2023-01-01", pos);
        assertNull(result);
        assertEquals(0, pos.getIndex());
        assertEquals(0, pos.getErrorIndex());
    }

    @Test
    public void testEqualsHashCodeToStringAndAccessors() {
        TimeZone tz1 = TimeZone.getTimeZone("GMT");
        TimeZone tz2 = TimeZone.getTimeZone("UTC");
        Locale loc1 = Locale.US;
        Locale loc2 = Locale.UK;

        FastDateFormat f1 = FastDateFormat.getInstance("yyyy-MM-dd", tz1, loc1);
        FastDateFormat f2 = FastDateFormat.getInstance("yyyy-MM-dd", tz1, loc1);
        FastDateFormat fDiffPattern = FastDateFormat.getInstance("yyyy/MM/dd", tz1, loc1);
        FastDateFormat fDiffTz = FastDateFormat.getInstance("yyyy-MM-dd", tz2, loc1);
        FastDateFormat fDiffLoc = FastDateFormat.getInstance("yyyy-MM-dd", tz1, loc2);

        assertTrue(f1.equals(f1));
        assertTrue(f1.equals(f2));
        assertEquals(f1.hashCode(), f2.hashCode());

        assertFalse(f1.equals(null));
        assertFalse(f1.equals("OtherType"));
        assertFalse(f1.equals(fDiffPattern));
        assertFalse(f1.equals(fDiffTz));
        assertFalse(f1.equals(fDiffLoc));

        assertEquals("yyyy-MM-dd", f1.getPattern());
        assertEquals(tz1, f1.getTimeZone());
        assertEquals(loc1, f1.getLocale());
        assertTrue(f1.getMaxLengthEstimate() > 0);
        assertTrue(f1.toString().contains("FastDateFormat[yyyy-MM-dd]"));
    }

    @Test
    public void testSerialization() throws Exception {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss.SSS Z", TimeZone.getTimeZone("GMT"), Locale.US);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(fdf);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        FastDateFormat deserialized = (FastDateFormat) ois.readObject();

        assertEquals(fdf, deserialized);
        assertEquals(fdf.getPattern(), deserialized.getPattern());
        assertEquals(fdf.getTimeZone(), deserialized.getTimeZone());
        assertEquals(fdf.getLocale(), deserialized.getLocale());

        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.US);
        cal.clear();
        cal.set(2023, Calendar.MARCH, 15, 10, 20, 30);
        cal.set(Calendar.MILLISECOND, 456);

        assertEquals(fdf.format(cal), deserialized.format(cal));
    }
}