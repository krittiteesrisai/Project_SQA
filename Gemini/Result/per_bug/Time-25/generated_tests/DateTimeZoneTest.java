package org.joda.time;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

import org.joda.time.tz.DefaultNameProvider;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateTimeZoneTest {

    private DateTimeZone originalDefault;
    private Provider originalProvider;
    private NameProvider originalNameProvider;
    private Locale originalLocale;

    @Before
    public void setUp() {
        originalDefault = DateTimeZone.getDefault();
        originalProvider = DateTimeZone.getProvider();
        originalNameProvider = DateTimeZone.getNameProvider();
        originalLocale = Locale.getDefault();
    }

    @After
    public void tearDown() {
        DateTimeZone.setDefault(originalDefault);
        DateTimeZone.setProvider(originalProvider);
        DateTimeZone.setNameProvider(originalNameProvider);
        Locale.setDefault(originalLocale);
    }

    // -----------------------------------------------------------------------
    // getDefault() and setDefault()
    // -----------------------------------------------------------------------

    @Test
    public void testGetAndSetDefault() {
        DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        DateTimeZone.setDefault(zone);
        assertEquals(zone, DateTimeZone.getDefault());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDefault_null() {
        DateTimeZone.setDefault(null);
    }

    // -----------------------------------------------------------------------
    // forID(String)
    // -----------------------------------------------------------------------

    @Test
    public void testForID_null() {
        assertEquals(DateTimeZone.getDefault(), DateTimeZone.forID(null));
    }

    @Test
    public void testForID_UTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
    }

    @Test
    public void testForID_validNames() {
        DateTimeZone london = DateTimeZone.forID("Europe/London");
        assertEquals("Europe/London", london.getID());

        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        assertEquals("America/New_York", ny.getID());
    }

    @Test
    public void testForID_zeroOffset() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("+00:00"));
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("-00:00"));
    }

    @Test
    public void testForID_offsets() {
        DateTimeZone zone1 = DateTimeZone.forID("+01:00");
        assertEquals("+01:00", zone1.getID());
        assertEquals(3600000, zone1.getOffset(0L));

        DateTimeZone zone2 = DateTimeZone.forID("-05:30");
        assertEquals("-05:30", zone2.getID());
        assertEquals(-(5 * 3600000 + 30 * 60000), zone2.getOffset(0L));

        DateTimeZone zone3 = DateTimeZone.forID("+00:01:15");
        assertEquals("+00:01:15", zone3.getID());
        assertEquals(75000, zone3.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_invalid() {
        DateTimeZone.forID("InvalidZoneID");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_emptyString() {
        DateTimeZone.forID("");
    }

    // -----------------------------------------------------------------------
    // forOffsetHours, forOffsetHoursMinutes, forOffsetMillis
    // -----------------------------------------------------------------------

    @Test
    public void testForOffsetHours_zero() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHours(0));
    }

    @Test
    public void testForOffsetHours_values() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        assertEquals("+05:00", zone.getID());
        assertEquals(5 * 3600000, zone.getOffset(0L));

        zone = DateTimeZone.forOffsetHours(-8);
        assertEquals("-08:00", zone.getID());
        assertEquals(-8 * 3600000, zone.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHours_overflow() {
        DateTimeZone.forOffsetHours(Integer.MAX_VALUE);
    }

    @Test
    public void testForOffsetHoursMinutes_zero() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHoursMinutes(0, 0));
    }

    @Test
    public void testForOffsetHoursMinutes_positiveAndNegative() {
        DateTimeZone zonePos = DateTimeZone.forOffsetHoursMinutes(2, 30);
        assertEquals("+02:30", zonePos.getID());
        assertEquals(2 * 3600000 + 30 * 60000, zonePos.getOffset(0L));

        DateTimeZone zoneNeg = DateTimeZone.forOffsetHoursMinutes(-2, 30);
        assertEquals("-02:30", zoneNeg.getID());
        assertEquals(-(2 * 3600000 + 30 * 60000), zoneNeg.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_minutesNegative() {
        DateTimeZone.forOffsetHoursMinutes(5, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_minutesGreaterThan59() {
        DateTimeZone.forOffsetHoursMinutes(5, 60);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_overflow() {
        DateTimeZone.forOffsetHoursMinutes(Integer.MAX_VALUE / 60 + 1, 0);
    }

    @Test
    public void testForOffsetMillis_zero() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0));
    }

    @Test
    public void testForOffsetMillis_cachingAndPrintFormats() {
        DateTimeZone zone1 = DateTimeZone.forOffsetMillis(3600000);
        DateTimeZone zone2 = DateTimeZone.forOffsetMillis(3600000);
        assertSame(zone1, zone2);
        assertEquals("+01:00", zone1.getID());

        // Offset containing seconds and millis
        int millisWithSec = 3600000 + 20000 + 123;
        DateTimeZone zoneDetailed = DateTimeZone.forOffsetMillis(millisWithSec);
        assertEquals("+01:00:20.123", zoneDetailed.getID());

        int millisWithSecOnly = -(3600000 + 20000);
        DateTimeZone zoneSecOnly = DateTimeZone.forOffsetMillis(millisWithSecOnly);
        assertEquals("-01:00:20", zoneSecOnly.getID());
    }

    // -----------------------------------------------------------------------
    // forTimeZone(TimeZone)
    // -----------------------------------------------------------------------

    @Test
    public void testForTimeZone_null() {
        assertEquals(DateTimeZone.getDefault(), DateTimeZone.forTimeZone(null));
    }

    @Test
    public void testForTimeZone_UTC() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(tz));
    }

    @Test
    public void testForTimeZone_conversions() {
        TimeZone tz = TimeZone.getTimeZone("EST");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        assertEquals("America/New_York", zone.getID());

        tz = TimeZone.getTimeZone("PST");
        zone = DateTimeZone.forTimeZone(tz);
        assertEquals("America/Los_Angeles", zone.getID());

        tz = TimeZone.getTimeZone("GMT");
        zone = DateTimeZone.forTimeZone(tz);
        assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void testForTimeZone_customGMT() {
        TimeZone tzPos = TimeZone.getTimeZone("GMT+02:00");
        DateTimeZone zonePos = DateTimeZone.forTimeZone(tzPos);
        assertEquals("+02:00", zonePos.getID());

        TimeZone tzNeg = TimeZone.getTimeZone("GMT-05:00");
        DateTimeZone zoneNeg = DateTimeZone.forTimeZone(tzNeg);
        assertEquals("-05:00", zoneNeg.getID());

        TimeZone tzZero = TimeZone.getTimeZone("GMT+00:00");
        DateTimeZone zoneZero = DateTimeZone.forTimeZone(tzZero);
        assertSame(DateTimeZone.UTC, zoneZero);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForTimeZone_unrecognised() {
        TimeZone custom = new SimpleTimeZone(0, "UNKNOWN_TZ_ID");
        DateTimeZone.forTimeZone(custom);
    }

    // -----------------------------------------------------------------------
    // Providers & NameProviders
    // -----------------------------------------------------------------------

    @Test
    public void testGetAvailableIDs() {
        Set<String> ids = DateTimeZone.getAvailableIDs();
        assertNotNull(ids);
        assertTrue(ids.contains("UTC"));
        assertTrue(ids.contains("Europe/London"));
    }

    @Test
    public void testSetProvider_null() {
        DateTimeZone.setProvider(null);
        assertNotNull(DateTimeZone.getProvider());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_emptyIDs() {
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String id) { return null; }
            public Set<String> getAvailableIDs() { return Collections.emptySet(); }
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_nullIDs() {
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String id) { return null; }
            public Set<String> getAvailableIDs() { return null; }
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_noUTC() {
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String id) { return null; }
            public Set<String> getAvailableIDs() {
                Set<String> set = new HashSet<String>();
                set.add("America/New_York");
                return set;
            }
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_invalidUTC() {
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String id) { return null; } // returns null for UTC
            public Set<String> getAvailableIDs() {
                Set<String> set = new HashSet<String>();
                set.add("UTC");
                return set;
            }
        });
    }

    @Test
    public void testSetNameProvider_nullAndCustom() {
        DateTimeZone.setNameProvider(null);
        assertNotNull(DateTimeZone.getNameProvider());

        NameProvider customProvider = new DefaultNameProvider();
        DateTimeZone.setNameProvider(customProvider);
        assertSame(customProvider, DateTimeZone.getNameProvider());
    }

    // -----------------------------------------------------------------------
    // Names, ShortNames, and Offset Queries
    // -----------------------------------------------------------------------

    @Test
    public void testGetNameAndShortName() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        long summer = new DateTime(2020, 7, 1, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        long winter = new DateTime(2020, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();

        assertNotNull(zone.getName(summer));
        assertNotNull(zone.getName(winter));
        assertNotNull(zone.getShortName(summer));
        assertNotNull(zone.getShortName(winter));

        assertNotNull(zone.getName(summer, Locale.ENGLISH));
        assertNotNull(zone.getShortName(summer, Locale.ENGLISH));
        assertNotNull(zone.getName(summer, null));
        assertNotNull(zone.getShortName(summer, null));
    }

    @Test
    public void testGetName_fallbackToPrintOffset() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(3);
        assertEquals("+03:00", zone.getName(0L));
        assertEquals("+03:00", zone.getShortName(0L));
    }

    @Test
    public void testGetOffset_ReadableInstant() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(4);
        assertEquals(4 * 3600000, zone.getOffset((ReadableInstant) null));

        Instant inst = new Instant(1000000L);
        assertEquals(4 * 3600000, zone.getOffset(inst));
    }

    @Test
    public void testIsStandardOffset() {
        DateTimeZone london = DateTimeZone.forID("Europe/London");
        long winter = new DateTime(2020, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        long summer = new DateTime(2020, 7, 1, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();

        assertTrue(london.isStandardOffset(winter));
        assertFalse(london.isStandardOffset(summer));
    }

    // -----------------------------------------------------------------------
    // getOffsetFromLocal and DST transitions
    // -----------------------------------------------------------------------

    @Test
    public void testGetOffsetFromLocal_fixedZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(3);
        assertEquals(3 * 3600000, zone.getOffsetFromLocal(0L));
    }

    @Test
    public void testGetOffsetFromLocal_DSTTransitions() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        // Spring forward in London (2020-03-29 01:00 UTC -> 02:00 Local)
        long springGapLocal = new DateTime(2020, 3, 29, 1, 30, 0, 0, DateTimeZone.UTC).getMillis();
        int offset = zone.getOffsetFromLocal(springGapLocal);
        assertTrue(offset == 0 || offset == 3600000);

        // Fall back overlap in London (2020-10-25 02:00 BST -> 01:00 GMT)
        long fallOverlapLocal = new DateTime(2020, 10, 25, 1, 30, 0, 0, DateTimeZone.UTC).getMillis();
        int overlapOffset = zone.getOffsetFromLocal(fallOverlapLocal);
        assertEquals(3600000, overlapOffset); // Favors summer time offset during overlap
    }

    @Test
    public void testGetOffsetFromLocal_WesternHemisphereDST() {
        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        // Spring forward in NY (2020-03-08 02:00 -> 03:00)
        long springGap = new DateTime(2020, 3, 8, 2, 30, 0, 0, DateTimeZone.UTC).getMillis();
        int offset = ny.getOffsetFromLocal(springGap);
        assertNotNull(offset);
    }

    // -----------------------------------------------------------------------
    // convertUTCToLocal and convertLocalToUTC
    // -----------------------------------------------------------------------

    @Test
    public void testConvertUTCToLocal() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        long utc = 10000L;
        assertEquals(10000L + 2 * 3600000L, zone.convertUTCToLocal(utc));
    }

    @Test(expected = ArithmeticException.class)
    public void testConvertUTCToLocal_overflow() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        zone.convertUTCToLocal(Long.MAX_VALUE);
    }

    @Test
    public void testConvertLocalToUTC_strictAndLenient() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        long regularLocal = new DateTime(2020, 1, 1, 12, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals(regularLocal, zone.convertLocalToUTC(regularLocal, true));
        assertEquals(regularLocal, zone.convertLocalToUTC(regularLocal, false));

        // Spring forward gap (2020-03-29 01:30 is in the gap for Europe/London)
        long gapLocal = new DateTime(2020, 3, 29, 1, 30, 0, 0, DateTimeZone.UTC).getMillis();
        try {
            zone.convertLocalToUTC(gapLocal, true);
            fail("Expected IllegalArgumentException for DST gap with strict=true");
        } catch (IllegalArgumentException ex) {
            // expected
        }

        // With strict=false, should not throw
        long resolved = zone.convertLocalToUTC(gapLocal, false);
        assertNotNull(resolved);
    }

    @Test(expected = ArithmeticException.class)
    public void testConvertLocalToUTC_overflow() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(-5);
        zone.convertLocalToUTC(Long.MAX_VALUE, false);
    }

    @Test
    public void testConvertLocalToUTC_withOriginalInstantUTC() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        long local = new DateTime(2020, 10, 25, 1, 30, 0, 0, DateTimeZone.UTC).getMillis();
        long origSummerUTC = new DateTime(2020, 10, 25, 0, 30, 0, 0, DateTimeZone.UTC).getMillis();
        long origWinterUTC = new DateTime(2020, 10, 25, 1, 30, 0, 0, DateTimeZone.UTC).getMillis();

        long res1 = zone.convertLocalToUTC(local, false, origSummerUTC);
        long res2 = zone.convertLocalToUTC(local, false, origWinterUTC);
        assertEquals(origSummerUTC, res1);
        assertEquals(origWinterUTC, res2);
    }

    // -----------------------------------------------------------------------
    // getMillisKeepLocal and isLocalDateTimeGap
    // -----------------------------------------------------------------------

    @Test
    public void testGetMillisKeepLocal() {
        DateTimeZone zoneLondon = DateTimeZone.forID("Europe/London");
        DateTimeZone zoneParis = DateTimeZone.forID("Europe/Paris");

        long instant = 10000000L;
        assertEquals(instant, zoneLondon.getMillisKeepLocal(zoneLondon, instant));
        assertEquals(instant, zoneLondon.getMillisKeepLocal(null, instant)); // uses default zone

        long parisInstant = zoneLondon.getMillisKeepLocal(zoneParis, instant);
        long londonBack = zoneParis.getMillisKeepLocal(zoneLondon, parisInstant);
        assertEquals(instant, londonBack);
    }

    @Test
    public void testIsLocalDateTimeGap() {
        DateTimeZone fixed = DateTimeZone.forOffsetHours(2);
        assertFalse(fixed.isLocalDateTimeGap(new LocalDateTime(2020, 3, 29, 1, 30)));

        DateTimeZone london = DateTimeZone.forID("Europe/London");
        assertTrue(london.isLocalDateTimeGap(new LocalDateTime(2020, 3, 29, 1, 30)));
        assertFalse(london.isLocalDateTimeGap(new LocalDateTime(2020, 3, 29, 3, 30)));
    }

    // -----------------------------------------------------------------------
    // Object Contract: toTimeZone, equals, hashCode, toString, Serialization
    // -----------------------------------------------------------------------

    @Test
    public void testToTimeZone() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        TimeZone tz = zone.toTimeZone();
        assertEquals("America/New_York", tz.getID());
    }

    @Test
    public void testEqualsAndHashCode() {
        DateTimeZone zone1 = DateTimeZone.forID("Europe/London");
        DateTimeZone zone2 = DateTimeZone.forID("Europe/London");
        DateTimeZone zone3 = DateTimeZone.forID("America/New_York");

        assertTrue(zone1.equals(zone2));
        assertFalse(zone1.equals(zone3));
        assertFalse(zone1.equals(null));
        assertFalse(zone1.equals("NotAZone"));
        assertEquals(zone1.hashCode(), zone2.hashCode());
        assertEquals("Europe/London", zone1.toString());
    }

    @Test
    public void testSerialization() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("Europe/Paris");

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
}