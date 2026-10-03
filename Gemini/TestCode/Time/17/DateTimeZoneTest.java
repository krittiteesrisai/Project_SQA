package org.joda.time;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
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

public class DateTimeZoneTest {

    private DateTimeZone originalDefault;
    private Provider originalProvider;
    private NameProvider originalNameProvider;

    @Before
    public void setUp() {
        originalDefault = DateTimeZone.getDefault();
        originalProvider = DateTimeZone.getProvider();
        originalNameProvider = DateTimeZone.getNameProvider();
    }

    @After
    public void tearDown() {
        DateTimeZone.setDefault(originalDefault);
        DateTimeZone.setProvider(originalProvider);
        DateTimeZone.setNameProvider(originalNameProvider);
    }

    // -----------------------------------------------------------------------
    // Tests for getDefault() and setDefault()
    // -----------------------------------------------------------------------
    @Test
    public void testGetAndSetDefault() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        DateTimeZone.setDefault(zone);
        assertEquals(zone, DateTimeZone.getDefault());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDefault_Null() {
        DateTimeZone.setDefault(null);
    }

    // -----------------------------------------------------------------------
    // Tests for forID(String)
    // -----------------------------------------------------------------------
    @Test
    public void testForID_Null() {
        assertEquals(DateTimeZone.getDefault(), DateTimeZone.forID(null));
    }

    @Test
    public void testForID_UTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
    }

    @Test
    public void testForID_ValidZoneName() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        assertNotNull(zone);
        assertEquals("Europe/London", zone.getID());
    }

    @Test
    public void testForID_OffsetFormat() {
        DateTimeZone zonePlus = DateTimeZone.forID("+02:00");
        assertEquals("+02:00", zonePlus.getID());
        assertEquals(2 * 3600000, zonePlus.getOffset(0L));

        DateTimeZone zoneMinus = DateTimeZone.forID("-05:30");
        assertEquals("-05:30", zoneMinus.getID());
        assertEquals(-(5 * 3600000 + 30 * 60000), zoneMinus.getOffset(0L));

        DateTimeZone zoneZero = DateTimeZone.forID("+00:00");
        assertSame(DateTimeZone.UTC, zoneZero);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_InvalidFormat() {
        DateTimeZone.forID("Invalid/Zone_Name");
    }

    // -----------------------------------------------------------------------
    // Tests for forOffsetHours, forOffsetHoursMinutes, forOffsetMillis
    // -----------------------------------------------------------------------
    @Test
    public void testForOffsetHours_Valid() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(3);
        assertEquals("+03:00", zone.getID());
        assertEquals(3 * 3600000, zone.getOffset(0L));

        DateTimeZone zoneZero = DateTimeZone.forOffsetHours(0);
        assertSame(DateTimeZone.UTC, zoneZero);
    }

    @Test
    public void testForOffsetHoursMinutes_Valid() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(2, 30);
        assertEquals("+02:30", zone.getID());
        assertEquals(2 * 3600000 + 30 * 60000, zone.getOffset(0L));

        DateTimeZone zoneNeg = DateTimeZone.forOffsetHoursMinutes(-2, 30);
        assertEquals("-02:30", zoneNeg.getID());
        assertEquals(-(2 * 3600000 + 30 * 60000), zoneNeg.getOffset(0L));

        DateTimeZone zoneZero = DateTimeZone.forOffsetHoursMinutes(0, 0);
        assertSame(DateTimeZone.UTC, zoneZero);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_MinuteOutOfRangeNegative() {
        DateTimeZone.forOffsetHoursMinutes(1, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_MinuteOutOfRangePositive() {
        DateTimeZone.forOffsetHoursMinutes(1, 60);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_HourOverflow() {
        DateTimeZone.forOffsetHoursMinutes(Integer.MAX_VALUE, 0);
    }

    @Test
    public void testForOffsetMillis_EdgeCases() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(3600000 + 60000 + 1000 + 50);
        assertEquals("+01:01:01.050", zone.getID());

        DateTimeZone zoneNeg = DateTimeZone.forOffsetMillis(-(3600000 + 60000 + 1000 + 50));
        assertEquals("-01:01:01.050", zoneNeg.getID());

        DateTimeZone zoneSec = DateTimeZone.forOffsetMillis(3600000 + 1000);
        assertEquals("+01:00:01", zoneSec.getID());

        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0));
    }

    // -----------------------------------------------------------------------
    // Tests for forTimeZone(TimeZone)
    // -----------------------------------------------------------------------
    @Test
    public void testForTimeZone_Null() {
        assertEquals(DateTimeZone.getDefault(), DateTimeZone.forTimeZone(null));
    }

    @Test
    public void testForTimeZone_UTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void testForTimeZone_ConvertedIds() {
        DateTimeZone zoneEST = DateTimeZone.forTimeZone(TimeZone.getTimeZone("EST"));
        assertEquals("America/New_York", zoneEST.getID());

        DateTimeZone zoneGMT = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT"));
        assertSame(DateTimeZone.UTC, zoneGMT);
    }

    @Test
    public void testForTimeZone_CustomGMT() {
        TimeZone tz = TimeZone.getTimeZone("GMT+04:00");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        assertEquals("+04:00", zone.getID());

        TimeZone tzZero = TimeZone.getTimeZone("GMT+00:00");
        DateTimeZone zoneZero = DateTimeZone.forTimeZone(tzZero);
        assertSame(DateTimeZone.UTC, zoneZero);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForTimeZone_Unrecognised() {
        TimeZone tz = new TimeZone() {
            @Override
            public int getOffset(int era, int year, int month, int day, int dayOfWeek, int milliseconds) {
                return 0;
            }
            @Override
            public void setRawOffset(int offsetMillis) {}
            @Override
            public int getRawOffset() {
                return 0;
            }
            @Override
            public boolean useDaylightTime() {
                return false;
            }
            @Override
            public boolean inDaylightTime(java.util.Date date) {
                return false;
            }
            @Override
            public String getID() {
                return "NonExistentTimeZone";
            }
            @Override
            public String getDisplayName() {
                return "NonExistentTimeZone";
            }
        };
        DateTimeZone.forTimeZone(tz);
    }

    // -----------------------------------------------------------------------
    // Tests for Names / Providers
    // -----------------------------------------------------------------------
    @Test
    public void testGetNames() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        long instant = 0L; // 1970-01-01 (Standard time)
        assertNotNull(zone.getName(instant));
        assertNotNull(zone.getShortName(instant));
        assertNotNull(zone.getName(instant, Locale.UK));
        assertNotNull(zone.getShortName(instant, Locale.UK));

        // Fixed offset zone naming fallback
        DateTimeZone fixed = DateTimeZone.forOffsetHours(5);
        assertEquals("+05:00", fixed.getName(instant));
        assertEquals("+05:00", fixed.getShortName(instant));
    }

    @Test
    public void testGetAvailableIDs() {
        Set<String> ids = DateTimeZone.getAvailableIDs();
        assertNotNull(ids);
        assertTrue(ids.contains("UTC"));
        assertTrue(ids.contains("Europe/London"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_Invalid() {
        DateTimeZone.setProvider(new UTCProvider() {
            @Override
            public Set<String> getAvailableIDs() {
                return null;
            }
        });
    }

    @Test
    public void testSetProvider_Valid() {
        Provider provider = new UTCProvider();
        DateTimeZone.setProvider(provider);
        assertSame(provider, DateTimeZone.getProvider());
    }

    @Test
    public void testSetNameProvider() {
        NameProvider np = new DefaultNameProvider();
        DateTimeZone.setNameProvider(np);
        assertSame(np, DateTimeZone.getNameProvider());
    }

    // -----------------------------------------------------------------------
    // Tests for adjustOffset (Targeting Defects4J Time-17)
    // -----------------------------------------------------------------------
    @Test
    public void testAdjustOffset_NonOverlap() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        long instant = 0L; // Non-overlap time
        assertEquals(instant, zone.adjustOffset(instant, false));
        assertEquals(instant, zone.adjustOffset(instant, true));
    }

    @Test
    public void testAdjustOffset_Overlap() {
        // America/New_York DST cutover: 2007-11-04 02:00 EDT -> 01:00 EST
        // 2007-11-04 01:30 EDT = 1194154200000L (offset -4h = 05:30 UTC)
        // 2007-11-04 01:30 EST = 1194157800000L (offset -5h = 06:30 UTC)
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        long overlapInstantEDT = 1194154200000L;
        long overlapInstantEST = 1194157800000L;

        // If earlierOrLater = false -> should pick earlier instant (EDT)
        assertEquals(overlapInstantEDT, zone.adjustOffset(overlapInstantEDT, false));
        assertEquals(overlapInstantEDT, zone.adjustOffset(overlapInstantEST, false));

        // If earlierOrLater = true -> should pick later instant (EST)
        assertEquals(overlapInstantEST, zone.adjustOffset(overlapInstantEDT, true));
        assertEquals(overlapInstantEST, zone.adjustOffset(overlapInstantEST, true));
    }

    // -----------------------------------------------------------------------
    // Tests for convertUTCToLocal and convertLocalToUTC (Boundaries & Exceptions)
    // -----------------------------------------------------------------------
    @Test
    public void testConvertUTCToLocal() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertEquals(2 * 3600000L, zone.convertUTCToLocal(0L));
    }

    @Test(expected = ArithmeticException.class)
    public void testConvertUTCToLocal_Overflow() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        zone.convertUTCToLocal(Long.MAX_VALUE);
    }

    @Test
    public void testConvertLocalToUTC_Strict() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        // Normal conversion
        long utc = zone.convertLocalToUTC(0L, true);
        assertEquals(5 * 3600000L, utc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertLocalToUTC_StrictGap() {
        // America/New_York spring-forward gap: 2007-03-11 02:30:00 does not exist
        // 2007-03-11 02:30:00 local representation
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        long gapLocal = new DateTime(2007, 3, 11, 2, 30, DateTimeZone.UTC).getMillis();
        zone.convertLocalToUTC(gapLocal, true);
    }

    @Test
    public void testConvertLocalToUTC_NonStrictGap() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        long gapLocal = new DateTime(2007, 3, 11, 2, 30, DateTimeZone.UTC).getMillis();
        // Non-strict should resolve without exception
        long utc = zone.convertLocalToUTC(gapLocal, false);
        assertTrue(utc > 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testConvertLocalToUTC_Underflow() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        zone.convertLocalToUTC(Long.MIN_VALUE, false);
    }

    // -----------------------------------------------------------------------
    // Tests for getOffsetFromLocal and isStandardOffset
    // -----------------------------------------------------------------------
    @Test
    public void testGetOffsetFromLocal() {
        DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        int offset = zone.getOffsetFromLocal(0L);
        assertEquals(3600000, offset); // Standard time CET = UTC+1
    }

    @Test
    public void testIsStandardOffset() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        long winterInstant = 0L; // 1970-01-01
        long summerInstant = 15000000000L; // In summer
        assertTrue(zone.isStandardOffset(winterInstant));
        assertFalse(zone.isStandardOffset(summerInstant));
    }

    @Test
    public void testGetOffsetWithReadableInstant() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertEquals(2 * 3600000, zone.getOffset((ReadableInstant) null));
        assertEquals(2 * 3600000, zone.getOffset(new Instant(0L)));
    }

    // -----------------------------------------------------------------------
    // Tests for isLocalDateTimeGap & getMillisKeepLocal
    // -----------------------------------------------------------------------
    @Test
    public void testIsLocalDateTimeGap() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        LocalDateTime gapTime = new LocalDateTime(2007, 3, 11, 2, 30);
        LocalDateTime normalTime = new LocalDateTime(2007, 3, 11, 1, 30);

        assertTrue(zone.isLocalDateTimeGap(gapTime));
        assertFalse(zone.isLocalDateTimeGap(normalTime));
        assertFalse(DateTimeZone.UTC.isLocalDateTimeGap(gapTime));
    }

    @Test
    public void testGetMillisKeepLocal() {
        DateTimeZone zoneNY = DateTimeZone.forID("America/New_York");
        DateTimeZone zoneLondon = DateTimeZone.forID("Europe/London");

        long instant = 0L;
        long result = zoneNY.getMillisKeepLocal(zoneLondon, instant);
        assertEquals(zoneNY.convertUTCToLocal(instant), zoneLondon.convertUTCToLocal(result));

        // Same zone
        assertEquals(instant, zoneNY.getMillisKeepLocal(zoneNY, instant));
        // Null newZone should use default
        long resultNull = zoneNY.getMillisKeepLocal(null, instant);
        assertEquals(zoneNY.convertUTCToLocal(instant), DateTimeZone.getDefault().convertUTCToLocal(resultNull));
    }

    // -----------------------------------------------------------------------
    // Tests for Object methods: equals, hashCode, toString, Serialization
    // -----------------------------------------------------------------------
    @Test
    public void testEqualsAndHashCode() {
        DateTimeZone zone1 = DateTimeZone.forID("Europe/London");
        DateTimeZone zone2 = DateTimeZone.forID("Europe/London");
        DateTimeZone zone3 = DateTimeZone.forID("America/New_York");

        assertTrue(zone1.equals(zone2));
        assertFalse(zone1.equals(zone3));
        assertFalse(zone1.equals(null));
        assertFalse(zone1.equals("SomeString"));
        assertEquals(zone1.hashCode(), zone2.hashCode());
        assertEquals("Europe/London", zone1.toString());
    }

    @Test
    public void testToTimeZone() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        TimeZone tz = zone.toTimeZone();
        assertEquals("Europe/London", tz.getID());
    }

    @Test
    public void testSerialization() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
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
    public void testProtectedConstructor_NullIdThrowsException() throws Throwable {
        Constructor<DateTimeZone> constructor = DateTimeZone.class.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        try {
            constructor.newInstance((String) null);
            fail("Should throw InvocationTargetException wrapping IllegalArgumentException");
        } catch (InvocationTargetException ex) {
            assertTrue(ex.getCause() instanceof IllegalArgumentException);
        }
    }
}