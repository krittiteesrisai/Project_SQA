package org.apache.commons.lang.time;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

import org.junit.Test;

/**
 * High coverage and edge case test suite for {@link FastDateFormat}.
 */
public class FastDateFormatTest {

    @Test
    public void testFactoryGetInstanceCachingAndVariations() {
        FastDateFormat f1 = FastDateFormat.getInstance();
        assertNotNull(f1);

        FastDateFormat f2 = FastDateFormat.getInstance();
        assertSame("Instances should be cached", f1, f2);

        FastDateFormat f3 = FastDateFormat.getInstance("yyyy-MM-dd");
        FastDateFormat f4 = FastDateFormat.getInstance("yyyy-MM-dd");
        assertSame(f3, f4);
        assertNotSame(f1, f3);

        TimeZone tz = TimeZone.getTimeZone("GMT+7");
        FastDateFormat fTz = FastDateFormat.getInstance("yyyy-MM-dd", tz);
        FastDateFormat fTzCached = FastDateFormat.getInstance("yyyy-MM-dd", tz);
        assertSame(fTz, fTzCached);
        assertTrue(fTz.getTimeZoneOverridesCalendar());

        Locale loc = Locale.GERMANY;
        FastDateFormat fLoc = FastDateFormat.getInstance("yyyy-MM-dd", loc);
        FastDateFormat fLocCached = FastDateFormat.getInstance("yyyy-MM-dd", loc);
        assertSame(fLoc, fLocCached);

        FastDateFormat fFull = FastDateFormat.getInstance("yyyy-MM-dd", tz, loc);
        FastDateFormat fFullCached = FastDateFormat.getInstance("yyyy-MM-dd", tz, loc);
        assertSame(fFull, fFullCached);
        assertEquals(tz, fFull.getTimeZone());
        assertEquals(loc, fFull.getLocale());
    }

    @Test
    public void testFactoryNullPatternThrowsException() {
        try {
            FastDateFormat.getInstance(null);
            fail("Expected IllegalArgumentException for null pattern");
        } catch (IllegalArgumentException expected) {
            // Success
        }
    }

    @Test
    public void testFactoryGetDateInstance() {
        FastDateFormat f1 = FastDateFormat.getDateInstance(FastDateFormat.SHORT);
        FastDateFormat f2 = FastDateFormat.getDateInstance(FastDateFormat.SHORT);
        assertSame(f1, f2);

        Locale loc = Locale.FRANCE;
        FastDateFormat fLoc = FastDateFormat.getDateInstance(FastDateFormat.FULL, loc);
        assertNotNull(fLoc);

        TimeZone tz = TimeZone.getTimeZone("GMT");
        FastDateFormat fTz = FastDateFormat.getDateInstance(FastDateFormat.MEDIUM, tz);
        assertNotNull(fTz);

        FastDateFormat fAll = FastDateFormat.getDateInstance(FastDateFormat.LONG, tz, loc);
        assertNotNull(fAll);
        FastDateFormat fAllCached = FastDateFormat.getDateInstance(FastDateFormat.LONG, tz, loc);
        assertSame(fAll, fAllCached);
    }

    @Test
    public void testFactoryGetTimeInstance() {
        FastDateFormat f1 = FastDateFormat.getTimeInstance(FastDateFormat.SHORT);
        FastDateFormat f2 = FastDateFormat.getTimeInstance(FastDateFormat.SHORT);
        assertSame(f1, f2);

        Locale loc = Locale.ITALY;
        FastDateFormat fLoc = FastDateFormat.getTimeInstance(FastDateFormat.MEDIUM, loc);
        assertNotNull(fLoc);

        TimeZone tz = TimeZone.getTimeZone("GMT-5");
        FastDateFormat fTz = FastDateFormat.getTimeInstance(FastDateFormat.LONG, tz);
        assertNotNull(fTz);

        FastDateFormat fAll = FastDateFormat.getTimeInstance(FastDateFormat.FULL, tz, loc);
        assertNotNull(fAll);
        assertSame(fAll, FastDateFormat.getTimeInstance(FastDateFormat.FULL, tz, loc));
    }

    @Test
    public void testFactoryGetDateTimeInstance() {
        FastDateFormat f1 = FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.SHORT);
        FastDateFormat f2 = FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.SHORT);
        assertSame(f1, f2);

        Locale loc = Locale.UK;
        FastDateFormat fLoc = FastDateFormat.getDateTimeInstance(FastDateFormat.FULL, FastDateFormat.MEDIUM, loc);
        assertNotNull(fLoc);

        TimeZone tz = TimeZone.getTimeZone("UTC");
        FastDateFormat fTz = FastDateFormat.getDateTimeInstance(FastDateFormat.MEDIUM, FastDateFormat.SHORT, tz);
        assertNotNull(fTz);

        FastDateFormat fAll = FastDateFormat.getDateTimeInstance(FastDateFormat.LONG, FastDateFormat.LONG, tz, loc);
        assertNotNull(fAll);
        assertSame(fAll, FastDateFormat.getDateTimeInstance(FastDateFormat.LONG, FastDateFormat.LONG, tz, loc));
    }

    @Test
    public void testAllPatternRuleCombinations() {
        // Pattern covering: G, y, M (1,2,3,4), d, h, H, m, s, S, E (3,4), D, F, w, W, a, k, K, z (short, long), Z, ZZ, literals
        String pattern = "G yyyy yy M MM MMM MMMM d h H m s S E EEEE D F w W a k K z zzzz Z ZZ 'literal' ''";
        FastDateFormat format = FastDateFormat.getInstance(pattern, TimeZone.getTimeZone("GMT"), Locale.US);

        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("GMT"), Locale.US);
        cal.set(Calendar.ERA, GregorianCalendar.AD);
        cal.set(2024, Calendar.JULY, 4, 0, 5, 9);
        cal.set(Calendar.MILLISECOND, 8);
        cal.set(Calendar.DAY_OF_YEAR, 186);

        String result = format.format(cal);
        assertNotNull(result);
        assertTrue(result.contains("AD"));
        assertTrue(result.contains("2024"));
        assertTrue(result.contains("24")); // yy
        assertTrue(result.contains("July")); // MMMM
        assertTrue(result.contains("Jul")); // MMM
        assertTrue(result.contains("literal"));
        assertTrue(result.contains("+0000")); // Z
        assertTrue(result.contains("+00:00")); // ZZ
    }

    @Test
    public void testTwelveAndTwentyFourHourEdgeCases() {
        FastDateFormat format = FastDateFormat.getInstance("h K H k", TimeZone.getTimeZone("GMT"), Locale.US);

        // Test midnight (00:00)
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("GMT"), Locale.US);
        cal.set(2024, Calendar.JANUARY, 1, 0, 0, 0);

        // h (1-12) should be 12
        // K (0-11) should be 0
        // H (0-23) should be 0
        // k (1-24) should be 24
        assertEquals("12 0 0 24", format.format(cal));

        // Test noon (12:00)
        cal.set(Calendar.HOUR_OF_DAY, 12);
        assertEquals("12 0 12 12", format.format(cal));

        // Test 1 PM (13:00)
        cal.set(Calendar.HOUR_OF_DAY, 13);
        assertEquals("1 1 13 13", format.format(cal));
    }

    @Test
    public void testNumberRulePaddingsAndBoundaries() {
        FastDateFormat fPadded = FastDateFormat.getInstance("yyyyyy-ddd-SSS-HHH", TimeZone.getTimeZone("GMT"), Locale.US);
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("GMT"), Locale.US);
        cal.set(2024, Calendar.JANUARY, 5, 9, 0, 0);
        cal.set(Calendar.MILLISECOND, 45);

        String formatted = fPadded.format(cal);
        assertTrue(formatted.startsWith("002024-005-045-009"));

        // Value >= 1000 in padded field
        cal.set(Calendar.DAY_OF_YEAR, 365);
        cal.set(Calendar.MILLISECOND, 999);
        String formattedLarge = fPadded.format(cal);
        assertNotNull(formattedLarge);
    }

    @Test
    public void testPaddedNumberFieldConstructorUnderThreeThrows() throws Exception {
        Class<?> paddedClass = Class.forName("org.apache.commons.lang.time.FastDateFormat$PaddedNumberField");
        Constructor<?> ctor = paddedClass.getDeclaredConstructor(int.class, int.class);
        ctor.setAccessible(true);
        try {
            ctor.newInstance(Calendar.YEAR, 2);
            fail("Expected IllegalArgumentException when padding size < 3");
        } catch (InvocationTargetException e) {
            assertTrue(e.getCause() instanceof IllegalArgumentException);
        }
    }

    @Test
    public void testInvalidPatternThrowsException() {
        try {
            FastDateFormat.getInstance("yyyy-MM-dd X");
            fail("Expected IllegalArgumentException for invalid pattern char 'X'");
        } catch (IllegalArgumentException expected) {
            // Success
        }

        try {
            FastDateFormat.getInstance("yyyy-MM-dd ?");
            fail("Expected IllegalArgumentException for invalid pattern char '?'");
        } catch (IllegalArgumentException expected) {
            // Success
        }
    }

    @Test
    public void testFormatOverloadsAndTypes() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss");
        long millis = 1719999999000L;
        Date date = new Date(millis);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        assertEquals(f.format(date), f.format(millis));
        assertEquals(f.format(date), f.format(cal));

        StringBuffer buf = new StringBuffer("Result: ");
        StringBuffer returnedBuf = f.format(millis, buf);
        assertSame(buf, returnedBuf);
        assertTrue(buf.toString().startsWith("Result: "));

        StringBuffer buf2 = new StringBuffer();
        f.format(date, buf2);
        assertEquals(f.format(date), buf2.toString());

        StringBuffer buf3 = new StringBuffer();
        f.format(cal, buf3);
        assertEquals(f.format(cal), buf3.toString());

        // Format(Object, StringBuffer, FieldPosition)
        StringBuffer objBuf1 = new StringBuffer();
        f.format((Object) date, objBuf1, new FieldPosition(0));
        assertEquals(f.format(date), objBuf1.toString());

        StringBuffer objBuf2 = new StringBuffer();
        f.format((Object) cal, objBuf2, new FieldPosition(0));
        assertEquals(f.format(cal), objBuf2.toString());

        StringBuffer objBuf3 = new StringBuffer();
        f.format((Object) new Long(millis), objBuf3, new FieldPosition(0));
        assertEquals(f.format(millis), objBuf3.toString());

        try {
            f.format("invalid-object", new StringBuffer(), new FieldPosition(0));
            fail("Expected IllegalArgumentException for unsupported object type");
        } catch (IllegalArgumentException expected) {
            // Success
        }

        try {
            f.format(null, new StringBuffer(), new FieldPosition(0));
            fail("Expected IllegalArgumentException for null object");
        } catch (IllegalArgumentException expected) {
            // Success
        }
    }

    @Test
    public void testTimeZoneOffsetsNegativeAndPositive() {
        FastDateFormat f = FastDateFormat.getInstance("Z ZZ");

        // Negative Offset (e.g. GMT-08:00)
        Calendar calNeg = new GregorianCalendar(TimeZone.getTimeZone("GMT-8"), Locale.US);
        calNeg.set(2024, Calendar.JANUARY, 1, 12, 0, 0);
        assertEquals("-0800 -08:00", f.format(calNeg));

        // Positive Offset (e.g. GMT+05:30)
        Calendar calPos = new GregorianCalendar(TimeZone.getTimeZone("GMT+05:30"), Locale.US);
        calPos.set(2024, Calendar.JANUARY, 1, 12, 0, 0);
        assertEquals("+0530 +05:30", f.format(calPos));
    }

    @Test
    public void testTimeZoneNameDaylightAndStandard() {
        SimpleTimeZone stz = new SimpleTimeZone(
                -5 * 3600 * 1000, "America/New_York",
                Calendar.APRIL, 1, -Calendar.SUNDAY, 2 * 3600 * 1000,
                Calendar.OCTOBER, -1, Calendar.SUNDAY, 2 * 3600 * 1000,
                3600 * 1000
        );

        FastDateFormat fForced = FastDateFormat.getInstance("z zzzz", stz, Locale.US);
        FastDateFormat fUnforced = FastDateFormat.getInstance("z zzzz", Locale.US);

        Calendar calWinter = new GregorianCalendar(stz, Locale.US);
        calWinter.set(2024, Calendar.JANUARY, 15, 12, 0, 0);

        Calendar calSummer = new GregorianCalendar(stz, Locale.US);
        calSummer.set(2024, Calendar.JULY, 15, 12, 0, 0);

        String winterForced = fForced.format(calWinter);
        String summerForced = fForced.format(calSummer);
        assertNotSame(winterForced, summerForced);

        String winterUnforced = fUnforced.format(calWinter);
        String summerUnforced = fUnforced.format(calSummer);
        assertNotNull(winterUnforced);
        assertNotNull(summerUnforced);
    }

    @Test
    public void testParseObjectUnsupported() {
        FastDateFormat f = FastDateFormat.getInstance();
        ParsePosition pos = new ParsePosition(5);
        Object result = f.parseObject("2024-07-04", pos);
        assertNull(result);
        assertEquals(0, pos.getIndex());
        assertEquals(0, pos.getErrorIndex());
    }

    @Test
    public void testEqualsHashCodeAndToString() {
        FastDateFormat f1 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.US);
        FastDateFormat f2 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.US);
        FastDateFormat fDiffPattern = FastDateFormat.getInstance("yyyy/MM/dd", TimeZone.getTimeZone("GMT"), Locale.US);
        FastDateFormat fDiffTz = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("UTC"), Locale.US);
        FastDateFormat fDiffLoc = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.FRANCE);

        assertTrue(f1.equals(f1));
        assertTrue(f1.equals(f2));
        assertEquals(f1.hashCode(), f2.hashCode());

        assertFalse(f1.equals(null));
        assertFalse(f1.equals("String Object"));
        assertFalse(f1.equals(fDiffPattern));
        assertFalse(f1.equals(fDiffTz));
        assertFalse(f1.equals(fDiffLoc));

        assertEquals("FastDateFormat[yyyy-MM-dd]", f1.toString());
        assertEquals("yyyy-MM-dd", f1.getPattern());
        assertEquals(TimeZone.getTimeZone("GMT"), f1.getTimeZone());
        assertEquals(Locale.US, f1.getLocale());
        assertTrue(f1.getMaxLengthEstimate() > 0);
    }

    @Test
    public void testPairEqualsAndHashCode() throws Exception {
        Class<?> pairClass = Class.forName("org.apache.commons.lang.time.FastDateFormat$Pair");
        Constructor<?> ctor = pairClass.getDeclaredConstructor(Object.class, Object.class);
        ctor.setAccessible(true);

        Object p1 = ctor.newInstance("A", "B");
        Object p2 = ctor.newInstance("A", "B");
        Object pDiff1 = ctor.newInstance("X", "B");
        Object pDiff2 = ctor.newInstance("A", "Y");
        Object pNull1 = ctor.newInstance(null, "B");
        Object pNull2 = ctor.newInstance(null, "B");

        assertTrue(p1.equals(p1));
        assertTrue(p1.equals(p2));
        assertEquals(p1.hashCode(), p2.hashCode());
        assertFalse(p1.equals(null));
        assertFalse(p1.equals("Other"));
        assertFalse(p1.equals(pDiff1));
        assertFalse(p1.equals(pDiff2));
        assertTrue(pNull1.equals(pNull2));
        assertEquals(pNull1.hashCode(), pNull2.hashCode());
        assertEquals("[A:B]", p1.toString());
    }

    @Test
    public void testTimeZoneDisplayKeyEqualsAndHashCode() throws Exception {
        Class<?> keyClass = Class.forName("org.apache.commons.lang.time.FastDateFormat$TimeZoneDisplayKey");
        Constructor<?> ctor = keyClass.getDeclaredConstructor(TimeZone.class, boolean.class, int.class, Locale.class);
        ctor.setAccessible(true);

        TimeZone tz1 = TimeZone.getTimeZone("GMT");
        TimeZone tz2 = TimeZone.getTimeZone("UTC");
        Object k1 = ctor.newInstance(tz1, true, TimeZone.LONG, Locale.US);
        Object k2 = ctor.newInstance(tz1, true, TimeZone.LONG, Locale.US);
        Object kDiffTz = ctor.newInstance(tz2, true, TimeZone.LONG, Locale.US);
        Object kDiffStyle = ctor.newInstance(tz1, false, TimeZone.LONG, Locale.US);
        Object kDiffLoc = ctor.newInstance(tz1, true, TimeZone.LONG, Locale.FRANCE);

        assertTrue(k1.equals(k1));
        assertTrue(k1.equals(k2));
        assertEquals(k1.hashCode(), k2.hashCode());
        assertFalse(k1.equals(null));
        assertFalse(k1.equals("Other"));
        assertFalse(k1.equals(kDiffTz));
        assertFalse(k1.equals(kDiffStyle));
        assertFalse(k1.equals(kDiffLoc));
    }

    @Test
    public void testSerializationRoundTrip() throws Exception {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss.SSS Z", TimeZone.getTimeZone("GMT"), Locale.US);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(format);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        FastDateFormat deserialized = (FastDateFormat) ois.readObject();
        ois.close();

        assertNotNull(deserialized);
        assertEquals(format, deserialized);

        Date testDate = new Date();
        assertEquals(format.format(testDate), deserialized.format(testDate));
    }
}