package org.joda.time;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;

import org.joda.time.tz.DefaultNameProvider;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * High coverage and mutation/fault-detection test suite for {@link DateTimeZone}.
 */
public class DateTimeZoneTest {

    private DateTimeZone originalDefaultZone;
    private Provider originalProvider;
    private NameProvider originalNameProvider;
    private Locale originalLocale;

    @Before
    public void setUp() {
        originalDefaultZone = DateTimeZone.getDefault();
        originalProvider = DateTimeZone.getProvider();
        originalNameProvider = DateTimeZone.getNameProvider();
        originalLocale = Locale.getDefault();
    }

    @After
    public void tearDown() {
        DateTimeZone.setDefault(originalDefaultZone);
        DateTimeZone.setProvider(originalProvider);
        DateTimeZone.setNameProvider(originalNameProvider);
        Locale.setDefault(originalLocale);
    }

    // =========================================================================
    // getDefault() and setDefault()
    // =========================================================================

    @Test
    public void testGetDefault_NotNull() {
        DateTimeZone def = DateTimeZone.getDefault();
        assertNotNull(def);
    }

    @Test
    public void testSetDefault_Valid() {
        DateTimeZone tokyo = DateTimeZone.forID("Asia/Tokyo");
        DateTimeZone.setDefault(tokyo);
        assertEquals(tokyo, DateTimeZone.getDefault());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDefault_Null() {
        DateTimeZone.setDefault(null);
    }

    // =========================================================================
    // forID(String)
    // =========================================================================

    @Test
    public void testForID_NullReturnsDefault() {
        DateTimeZone def = DateTimeZone.getDefault();
        assertSame(def, DateTimeZone.forID(null));
    }

    @Test
    public void testForID_UTC() {
        DateTimeZone zone = DateTimeZone.forID("UTC");
        assertSame(DateTimeZone.UTC, zone);
        assertEquals("UTC", zone.getID());
        assertEquals(0, zone.getOffset(0L));
    }

    @Test
    public void testForID_ValidProviderZone() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        assertNotNull(zone);
        assertEquals("Europe/London", zone.getID());
    }

    @Test
    public void testForID_PositiveOffset() {
        DateTimeZone zone = DateTimeZone.forID("+02:00");
        assertEquals("+02:00", zone.getID());
        assertEquals(2 * 3600 * 1000, zone.getOffset(0L));
    }

    @Test
    public void testForID_NegativeOffset() {
        DateTimeZone zone = DateTimeZone.forID("-05:30");
        assertEquals("-05:30", zone.getID());
        assertEquals(-(5 * 3600 + 30 * 60) * 1000, zone.getOffset(0L));
    }

    @Test
    public void testForID_ZeroOffsetReturnsUTC() {
        DateTimeZone zone = DateTimeZone.forID("+00:00");
        assertSame(DateTimeZone.UTC, zone);

        DateTimeZone zoneNegZero = DateTimeZone.forID("-00:00");
        assertSame(DateTimeZone.UTC, zoneNegZero);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_InvalidFormatPrefixOnly() {
        DateTimeZone.forID("+");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_InvalidIDUnknown() {
        DateTimeZone.forID("Invalid/NonExistent_Zone");
    }

    // =========================================================================
    // forOffsetHours(int), forOffsetHoursMinutes(int, int), forOffsetMillis(int)
    // =========================================================================

    @Test
    public void testForOffsetHours_ZeroReturnsUTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHours(0));
    }

    @Test
    public void testForOffsetHours_PositiveAndNegative() {
        DateTimeZone zonePlus5 = DateTimeZone.forOffsetHours(5);
        assertEquals("+05:00", zonePlus5.getID());
        assertEquals(5 * 3600000, zonePlus5.getOffset(0L));

        DateTimeZone zoneMinus8 = DateTimeZone.forOffsetHours(-8);
        assertEquals("-08:00", zoneMinus8.getID());
        assertEquals(-8 * 3600000, zoneMinus8.getOffset(0L));
    }

    @Test
    public void testForOffsetHoursMinutes_ZeroZeroReturnsUTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHoursMinutes(0, 0));
    }

    @Test
    public void testForOffsetHoursMinutes_Positive() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(5, 45);
        assertEquals("+05:45", zone.getID());
        assertEquals((5 * 60 + 45) * 60000, zone.getOffset(0L));
    }

    @Test
    public void testForOffsetHoursMinutes_NegativeHoursPositiveMinutes() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(-5, 30);
        assertEquals("-05:30", zone.getID());
        assertEquals(-(5 * 60 + 30) * 60000, zone.getOffset(0L));
    }

    @Test
    public void testForOffsetHoursMinutes_ZeroHoursPositiveMinutes() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(0, 30);
        assertEquals("+00:30", zone.getID());
        assertEquals(30 * 60000, zone.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_MinutesNegative() {
        DateTimeZone.forOffsetHoursMinutes(2, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_MinutesOver59() {
        DateTimeZone.forOffsetHoursMinutes(2, 60);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_HoursOverflow() {
        DateTimeZone.forOffsetHoursMinutes(Integer.MAX_VALUE, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_HoursUnderflow() {
        DateTimeZone.forOffsetHoursMinutes(Integer.MIN_VALUE, 0);
    }

    @Test
    public void testForOffsetMillis_ZeroReturnsUTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0));
    }

    @Test
    public void testForOffsetMillis_WithSecondsAndMilliseconds() {
        int millis = (1 * 3600 + 23 * 60 + 45) * 1000 + 678;
        DateTimeZone zone = DateTimeZone.forOffsetMillis(millis);
        assertEquals("+01:23:45.678", zone.getID());
        assertEquals(millis, zone.getOffset(0L));

        DateTimeZone zoneNeg = DateTimeZone.forOffsetMillis(-millis);
        assertEquals("-01:23:45.678", zoneNeg.getID());
        assertEquals(-millis, zoneNeg.getOffset(0L));

        // Fixed Offset Cache hit verification
        DateTimeZone cachedZone = DateTimeZone.forOffsetMillis(millis);
        assertSame(zone, cachedZone);
    }

    // =========================================================================
    // forTimeZone(TimeZone)
    // =========================================================================

    @Test
    public void testForTimeZone_NullReturnsDefault() {
        assertSame(DateTimeZone.getDefault(), DateTimeZone.forTimeZone(null));
    }

    @Test
    public void testForTimeZone_UTC() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(tz));
    }

    @Test
    public void testForTimeZone_ConvertedAliases() {
        // "EST" maps to "America/New_York", "GMT" maps to "UTC", "PST" maps to "America/Los_Angeles"
        DateTimeZone est = DateTimeZone.forTimeZone(TimeZone.getTimeZone("EST"));
        assertEquals("America/New_York", est.getID());

        DateTimeZone gmt = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT"));
        assertSame(DateTimeZone.UTC, gmt);

        DateTimeZone pst = DateTimeZone.forTimeZone(TimeZone.getTimeZone("PST"));
        assertEquals("America/Los_Angeles", pst.getID());
    }

    @Test
    public void testForTimeZone_GMTCustomOffsets() {
        TimeZone tzPlus = TimeZone.getTimeZone("GMT+04:00");
        DateTimeZone zonePlus = DateTimeZone.forTimeZone(tzPlus);
        assertEquals("+04:00", zonePlus.getID());
        assertEquals(4 * 3600000, zonePlus.getOffset(0L));

        TimeZone tzMinus = TimeZone.getTimeZone("GMT-07:00");
        DateTimeZone zoneMinus = DateTimeZone.forTimeZone(tzMinus);
        assertEquals("-07:00", zoneMinus.getID());
        assertEquals(-7 * 3600000, zoneMinus.getOffset(0L));

        TimeZone tzZero = TimeZone.getTimeZone("GMT+00:00");
        DateTimeZone zoneZero = DateTimeZone.forTimeZone(tzZero);
        assertSame(DateTimeZone.UTC, zoneZero);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForTimeZone_UnrecognisedID() {
        TimeZone tz = new TimeZone() {
            @Override
            public int getOffset(int era, int year, int month, int day, int dayOfWeek, int milliseconds) {
                return 0;
            }
            @Override
            public void setRawOffset(int offsetMillis) {}
            @Override
            public int getRawOffset() { return 0; }
            @Override
            public boolean useDaylightTime() { return false; }
            @Override
            public boolean inDaylightTime(java.util.Date date) { return false; }
            @Override
            public String getID() { return "Custom_Invalid_ID"; }
        };
        DateTimeZone.forTimeZone(tz);
    }

    // =========================================================================
    // Provider & NameProvider Management
    // =========================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_EmptyIds() {
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String id) { return null; }
            public Set<String> getAvailableIDs() { return Collections.emptySet(); }
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_NullAvailableIDs() {
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String id) { return null; }
            public Set<String> getAvailableIDs() { return null; }
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_MissingUTC() {
        final Set<String> ids = new HashSet<String>();
        ids.add("America/New_York");
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String id) { return null; }
            public Set<String> getAvailableIDs() { return ids; }
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_InvalidUTCZoneReturned() {
        final Set<String> ids = new HashSet<String>();
        ids.add("UTC");
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String id) {
                return DateTimeZone.forOffsetHours(1); // Not equal to DateTimeZone.UTC
            }
            public Set<String> getAvailableIDs() { return ids; }
        });
    }

    @Test
    public void testSetProvider_ValidAndResetToDefault() {
        DateTimeZone.setProvider(new UTCProvider());
        assertEquals(1, DateTimeZone.getAvailableIDs().size());
        assertTrue(DateTimeZone.getAvailableIDs().contains("UTC"));

        // Passing null resets to default
        DateTimeZone.setProvider(null);
        assertTrue(DateTimeZone.getAvailableIDs().size() > 1);
    }

    @Test
    public void testSetNameProvider_ValidAndResetToDefault() {
        NameProvider customNp = new DefaultNameProvider();
        DateTimeZone.setNameProvider(customNp);
        assertSame(customNp, DateTimeZone.getNameProvider());

        DateTimeZone.setNameProvider(null);
        assertNotNull(DateTimeZone.getNameProvider());
    }

    // =========================================================================
    // Names, Short Names & Locale
    // =========================================================================

    @Test
    public void testGetNamesAndShortNames() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        long winterInstant = 0L; // 1970-01-01 GMT

        String shortName = zone.getShortName(winterInstant, Locale.UK);
        assertNotNull(shortName);

        String longName = zone.getName(winterInstant, Locale.UK);
        assertNotNull(longName);

        // Test overloads with null locale (falls back to Locale.getDefault())
        assertEquals(zone.getShortName(winterInstant, Locale.getDefault()), zone.getShortName(winterInstant));
        assertEquals(zone.getName(winterInstant, Locale.getDefault()), zone.getName(winterInstant));
    }

    @Test
    public void testGetName_FallbackToOffset() {
        DateTimeZone customFixed = DateTimeZone.forOffsetHoursMinutes(3, 30);
        assertEquals("+03:30", customFixed.getName(0L, Locale.ENGLISH));
        assertEquals("+03:30", customFixed.getShortName(0L, Locale.ENGLISH));
    }

    // =========================================================================
    // Time conversions, Overflow & DST Gap/Overlap
    // =========================================================================

    @Test
    public void testConvertUTCToLocal_BasicAndOverflow() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertEquals(1000L + 2 * 3600000, zone.convertUTCToLocal(1000L));

        try {
            zone.convertUTCToLocal(Long.MAX_VALUE - 100);
            fail("Expected ArithmeticException on positive overflow");
        } catch (ArithmeticException ex) {
            // Success
        }

        DateTimeZone zoneNeg = DateTimeZone.forOffsetHours(-2);
        try {
            zoneNeg.convertUTCToLocal(Long.MIN_VALUE + 100);
            fail("Expected ArithmeticException on negative overflow");
        } catch (ArithmeticException ex) {
            // Success
        }
    }

    @Test
    public void testConvertLocalToUTC_BasicAndOverflow() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(3);
        assertEquals(0L, zone.convertLocalToUTC(3 * 3600000L, false));

        DateTimeZone zoneNeg = DateTimeZone.forOffsetHours(-3);
        try {
            zoneNeg.convertLocalToUTC(Long.MAX_VALUE - 100, false);
            fail("Expected ArithmeticException on overflow");
        } catch (ArithmeticException ex) {
            // Success
        }
    }

    @Test
    public void testConvertLocalToUTC_StrictDSTGapThrows() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        // 2007-03-11 02:30:00 EST did not exist (clocks jumped from 02:00 to 03:00)
        long localGapInstant = new DateTime(2007, 3, 11, 2, 30, 0, 0, DateTimeZone.UTC).getMillis();

        try {
            zone.convertLocalToUTC(localGapInstant, true);
            fail("Expected IllegalInstantException on DST gap in strict mode");
        } catch (IllegalInstantException ex) {
            // Success
        }

        // In lenient mode (strict = false), it should resolve without exception
        long converted = zone.convertLocalToUTC(localGapInstant, false);
        assertTrue(converted > 0);
    }

    @Test
    public void testConvertLocalToUTC_WithOriginalInstant() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        long utc = new DateTime(2007, 11, 4, 1, 30, 0, 0, DateTimeZone.UTC).getMillis();
        long local = zone.convertUTCToLocal(utc);

        long result = zone.convertLocalToUTC(local, false, utc);
        assertEquals(utc, result);
    }

    @Test
    public void testGetMillisKeepLocal() {
        DateTimeZone zoneLondon = DateTimeZone.forID("Europe/London");
        DateTimeZone zoneParis = DateTimeZone.forID("Europe/Paris");

        long instant = 0L;
        // Same zone identity return
        assertEquals(instant, zoneLondon.getMillisKeepLocal(zoneLondon, instant));

        // null newZone uses default
        long toDefault = zoneLondon.getMillisKeepLocal(null, instant);
        assertEquals(zoneLondon.getMillisKeepLocal(DateTimeZone.getDefault(), instant), toDefault);

        // London to Paris
        long keepLocalParis = zoneLondon.getMillisKeepLocal(zoneParis, instant);
        assertEquals(instant - 3600000L, keepLocalParis);
    }

    @Test
    public void testIsLocalDateTimeGap() {
        DateTimeZone zoneNY = DateTimeZone.forID("America/New_York");
        LocalDateTime gapTime = new LocalDateTime(2007, 3, 11, 2, 30, 0, 0);
        assertTrue(zoneNY.isLocalDateTimeGap(gapTime));

        LocalDateTime normalTime = new LocalDateTime(2007, 3, 11, 4, 30, 0, 0);
        assertFalse(zoneNY.isLocalDateTimeGap(normalTime));

        // Fixed zone has no gaps
        assertFalse(DateTimeZone.UTC.isLocalDateTimeGap(gapTime));
    }

    @Test
    public void testAdjustOffset() {
        DateTimeZone zoneNY = DateTimeZone.forID("America/New_York");
        // Non-transition instant returns same instant
        long regularInstant = new DateTime(2010, 1, 1, 12, 0, 0, 0, zoneNY).getMillis();
        assertEquals(regularInstant, zoneNY.adjustOffset(regularInstant, true));
        assertEquals(regularInstant, zoneNY.adjustOffset(regularInstant, false));

        // 2007-11-04 DST Overlap (01:00:00 occurs twice: EDT then EST)
        long overlapInstant = new DateTime(2007, 11, 4, 1, 30, 0, 0, DateTimeZone.forOffsetHours(-4)).getMillis();
        long earlier = zoneNY.adjustOffset(overlapInstant, false);
        long later = zoneNY.adjustOffset(overlapInstant, true);

        assertEquals(3600000L, later - earlier);
    }

    // =========================================================================
    // General Methods: equals, hashCode, toString, toTimeZone, serialization
    // =========================================================================

    @Test
    public void testEqualsAndHashCode() {
        DateTimeZone zone1 = DateTimeZone.forOffsetHours(3);
        DateTimeZone zone2 = DateTimeZone.forOffsetHoursMinutes(3, 0);
        DateTimeZone zone3 = DateTimeZone.forOffsetHours(4);

        assertEquals(zone1, zone2);
        assertEquals(zone1.hashCode(), zone2.hashCode());
        assertFalse(zone1.equals(zone3));
        assertFalse(zone1.equals(null));
        assertFalse(zone1.equals("NotADateTimeZone"));
    }

    @Test
    public void testToStringAndToTimeZone() {
        DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        assertEquals("Europe/Paris", zone.toString());

        TimeZone javaTz = zone.toTimeZone();
        assertEquals("Europe/Paris", javaTz.getID());
    }

    @Test
    public void testSerialization() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("America/Chicago");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(zone);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        DateTimeZone deserialized = (DateTimeZone) ois.readObject();
        ois.close();

        assertSame(zone, deserialized);
    }

    @Test
    public void testIsStandardOffset() {
        DateTimeZone zoneNY = DateTimeZone.forID("America/New_York");
        long winter = new DateTime(2007, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        long summer = new DateTime(2007, 7, 1, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();

        assertTrue(zoneNY.isStandardOffset(winter));
        assertFalse(zoneNY.isStandardOffset(summer));
    }

    @Test
    public void testGetOffsetWithReadableInstant() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertEquals(2 * 3600000, zone.getOffset(new Instant(1000L)));
        // Null ReadableInstant returns offset for current time
        assertEquals(2 * 3600000, zone.getOffset((ReadableInstant) null));
    }
}