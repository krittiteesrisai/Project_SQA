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

    // =========================================================================
    // 1. Default Zone & Setters
    // =========================================================================

    @Test
    public void testGetAndSetDefault() {
        DateTimeZone paris = DateTimeZone.forID("Europe/Paris");
        DateTimeZone.setDefault(paris);
        assertSame(paris, DateTimeZone.getDefault());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDefault_null() {
        DateTimeZone.setDefault(null);
    }

    // =========================================================================
    // 2. forID(String)
    // =========================================================================

    @Test
    public void testForID_null() {
        DateTimeZone.setDefault(DateTimeZone.UTC);
        assertSame(DateTimeZone.UTC, DateTimeZone.forID(null));
    }

    @Test
    public void testForID_UTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
    }

    @Test
    public void testForID_validZone() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        assertNotNull(zone);
        assertEquals("Europe/London", zone.getID());
    }

    @Test
    public void testForID_offsetZero() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("+00:00"));
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("-00:00"));
    }

    @Test
    public void testForID_offsetPositiveAndNegative() {
        DateTimeZone zonePlus = DateTimeZone.forID("+05:30");
        assertEquals("+05:30", zonePlus.getID());
        assertEquals(19800000, zonePlus.getOffset(0L));

        DateTimeZone zoneMinus = DateTimeZone.forID("-08:00");
        assertEquals("-08:00", zoneMinus.getID());
        assertEquals(-28800000, zoneMinus.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_invalidPrefixOffset() {
        DateTimeZone.forID("+Invalid");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_unknownID() {
        DateTimeZone.forID("NonExistent/Zone_ID");
    }

    // =========================================================================
    // 3. Offset Factories (forOffsetHours, forOffsetHoursMinutes, forOffsetMillis)
    // =========================================================================

    @Test
    public void testForOffsetHours_zero() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHours(0));
    }

    @Test
    public void testForOffsetHours_positiveAndNegative() {
        DateTimeZone zone1 = DateTimeZone.forOffsetHours(3);
        assertEquals("+03:00", zone1.getID());
        assertEquals(3 * 3600000, zone1.getOffset(0L));

        DateTimeZone zone2 = DateTimeZone.forOffsetHours(-5);
        assertEquals("-05:00", zone2.getID());
        assertEquals(-5 * 3600000, zone2.getOffset(0L));
    }

    @Test
    public void testForOffsetHoursMinutes_zero() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHoursMinutes(0, 0));
    }

    @Test
    public void testForOffsetHoursMinutes_valid() {
        DateTimeZone zonePlus = DateTimeZone.forOffsetHoursMinutes(5, 30);
        assertEquals("+05:30", zonePlus.getID());

        DateTimeZone zoneMinus = DateTimeZone.forOffsetHoursMinutes(-5, 30);
        assertEquals("-05:30", zoneMinus.getID());
        assertEquals(-19800000, zoneMinus.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_minutesNegative() {
        DateTimeZone.forOffsetHoursMinutes(2, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_minutesTooHigh() {
        DateTimeZone.forOffsetHoursMinutes(2, 60);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_overflow() {
        DateTimeZone.forOffsetHoursMinutes(Integer.MAX_VALUE, 30);
    }

    @Test
    public void testForOffsetMillis_variousFormats() {
        // Zero
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0));

        // Hours & Minutes only
        DateTimeZone z1 = DateTimeZone.forOffsetMillis(3600000);
        assertEquals("+01:00", z1.getID());

        // Hours, Minutes, Seconds
        DateTimeZone z2 = DateTimeZone.forOffsetMillis(3661000);
        assertEquals("+01:01:01", z2.getID());

        // Hours, Minutes, Seconds, Millis
        DateTimeZone z3 = DateTimeZone.forOffsetMillis(-3661123);
        assertEquals("-01:01:01.123", z3.getID());

        // Test fixedOffsetZone SoftReference caching
        DateTimeZone z3Cached = DateTimeZone.forOffsetMillis(-3661123);
        assertSame(z3, z3Cached);
    }

    // =========================================================================
    // 4. forTimeZone(TimeZone)
    // =========================================================================

    @Test
    public void testForTimeZone_null() {
        DateTimeZone.setDefault(DateTimeZone.UTC);
        assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(null));
    }

    @Test
    public void testForTimeZone_UTC() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(tz));
    }

    @Test
    public void testForTimeZone_convertedAliases() {
        assertEquals("America/New_York", DateTimeZone.forTimeZone(TimeZone.getTimeZone("EST")).getID());
        assertEquals("America/Los_Angeles", DateTimeZone.forTimeZone(TimeZone.getTimeZone("PST")).getID());
        assertEquals("Europe/London", DateTimeZone.forTimeZone(TimeZone.getTimeZone("WET")).getID());
        assertEquals("Pacific/Apia", DateTimeZone.forTimeZone(TimeZone.getTimeZone("MIT")).getID());
    }

    @Test
    public void testForTimeZone_customGMT() {
        TimeZone tz1 = TimeZone.getTimeZone("GMT+02:00");
        DateTimeZone dtz1 = DateTimeZone.forTimeZone(tz1);
        assertEquals("+02:00", dtz1.getID());

        TimeZone tz2 = TimeZone.getTimeZone("GMT+00:00");
        assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(tz2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForTimeZone_unrecognised() {
        TimeZone custom = new TimeZone() {
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
            public String getID() { return "CustomInvalidZoneID"; }
            @Override
            public String getDisplayName() { return "CustomDisplay"; }
        };
        DateTimeZone.forTimeZone(custom);
    }

    // =========================================================================
    // 5. Providers and NameProviders
    // =========================================================================

    @Test
    public void testSetProvider_null() {
        DateTimeZone.setProvider(null);
        assertNotNull(DateTimeZone.getProvider());
        assertTrue(DateTimeZone.getAvailableIDs().contains("UTC"));
    }

    @Test
    public void testSetProvider_valid() {
        DateTimeZone.setProvider(new UTCProvider());
        assertEquals(1, DateTimeZone.getAvailableIDs().size());
        assertTrue(DateTimeZone.getAvailableIDs().contains("UTC"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_emptyIds() {
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String id) { return null; }
            public Set<String> getAvailableIDs() { return Collections.emptySet(); }
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_noUTC() {
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String id) { return null; }
            public Set<String> getAvailableIDs() {
                Set<String> set = new HashSet<String>();
                set.add("Europe/London");
                return set;
            }
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_invalidUTCZone() {
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String id) {
                if ("UTC".equals(id)) {
                    return DateTimeZone.forOffsetHours(1);
                }
                return null;
            }
            public Set<String> getAvailableIDs() {
                Set<String> set = new HashSet<String>();
                set.add("UTC");
                return set;
            }
        });
    }

    @Test
    public void testSetNameProvider_null() {
        DateTimeZone.setNameProvider(null);
        assertNotNull(DateTimeZone.getNameProvider());
    }

    @Test
    public void testSetNameProvider_custom() {
        NameProvider custom = new DefaultNameProvider();
        DateTimeZone.setNameProvider(custom);
        assertSame(custom, DateTimeZone.getNameProvider());
    }

    // =========================================================================
    // 6. Names, ShortNames and Offsets
    // =========================================================================

    @Test
    public void testGetNameAndShortName() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        Locale.setDefault(Locale.UK);

        assertNotNull(zone.getName(0L));
        assertNotNull(zone.getName(0L, Locale.GERMANY));
        assertNotNull(zone.getShortName(0L));
        assertNotNull(zone.getShortName(0L, Locale.GERMANY));

        // Fixed zone fallback name
        DateTimeZone fixedZone = DateTimeZone.forOffsetHours(3);
        assertEquals("+03:00", fixedZone.getName(0L));
        assertEquals("+03:00", fixedZone.getShortName(0L));
    }

    @Test
    public void testGetName_nameProviderReturnsNull() {
        DateTimeZone.setNameProvider(new NameProvider() {
            public String getShortName(Locale locale, String id, String nameKey) { return null; }
            public String getName(Locale locale, String id, String nameKey) { return null; }
        });

        DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        // Fallback to printOffset
        assertEquals("+01:00", zone.getName(0L, Locale.ENGLISH));
        assertEquals("+01:00", zone.getShortName(0L, Locale.ENGLISH));
    }

    @Test
    public void testGetOffset_ReadableInstant() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        Instant instant = new Instant(0L);
        assertEquals(zone.getOffset(0L), zone.getOffset(instant));

        // null ReadableInstant means now
        int nowOffset = zone.getOffset((ReadableInstant) null);
        assertTrue(nowOffset == 0 || nowOffset == 3600000);
    }

    @Test
    public void testIsStandardOffset() {
        DateTimeZone london = DateTimeZone.forID("Europe/London");
        // Winter (Standard)
        assertTrue(london.isStandardOffset(0L));
        // Summer (DST) -> 1970-07-01
        assertFalse(london.isStandardOffset(15552000000L));
    }

    // =========================================================================
    // 7. Time Conversions, DST Gap, Overlap, and Arithmetic Overflows
    // =========================================================================

    @Test
    public void testConvertUTCToLocal() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertEquals(7200000L, zone.convertUTCToLocal(0L));
    }

    @Test(expected = ArithmeticException.class)
    public void testConvertUTCToLocal_overflow() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        zone.convertUTCToLocal(Long.MAX_VALUE);
    }

    @Test
    public void testConvertLocalToUTC_strictAndNonStrict() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        // Regular instant
        long regularUTC = zone.convertLocalToUTC(0L, false);
        assertEquals(18000000L, regularUTC);

        // DST Gap cutover in America/New_York: 2007-03-11 02:00 to 03:00 (Gap)
        // Local: 2007-03-11 02:30:00 -> 1173598200000L
        long gapLocal = 1173598200000L;
        assertTrue(zone.isLocalDateTimeGap(new LocalDateTime(gapLocal, zone)));

        // Non-strict mode should not throw
        long nonStrictUTC = zone.convertLocalToUTC(gapLocal, false);
        assertTrue(nonStrictUTC > 0);

        // Strict mode must throw IllegalArgumentException
        try {
            zone.convertLocalToUTC(gapLocal, true);
            fail("Expected IllegalArgumentException on strict conversion in DST gap");
        } catch (IllegalArgumentException ex) {
            // Success
        }
    }

    @Test(expected = ArithmeticException.class)
    public void testConvertLocalToUTC_overflow() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        zone.convertLocalToUTC(Long.MIN_VALUE, false);
    }

    @Test
    public void testConvertLocalToUTC_withOriginalInstant() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        long result = zone.convertLocalToUTC(0L, false, 0L);
        assertEquals(18000000L, result);
    }

    @Test
    public void testGetOffsetFromLocal_gapAndOverlap() {
        // Paris DST gap and overlap
        DateTimeZone zone = DateTimeZone.forID("Europe/Paris");

        // Normal Winter
        assertEquals(3600000, zone.getOffsetFromLocal(0L));
        // Normal Summer (1970-07-01)
        assertEquals(7200000, zone.getOffsetFromLocal(15552000000L));

        // Overlap in Europe/London (negative/zero transition overlap test)
        DateTimeZone london = DateTimeZone.forID("Europe/London");
        // 2007-10-28 01:30:00 BST -> Overlap occurs at 02:00 back to 01:00
        long overlapLocal = 1193531400000L;
        int offset = london.getOffsetFromLocal(overlapLocal);
        assertTrue(offset == 3600000 || offset == 0);
    }

    @Test
    public void testGetMillisKeepLocal() {
        DateTimeZone zone1 = DateTimeZone.forOffsetHours(1);
        DateTimeZone zone2 = DateTimeZone.forOffsetHours(3);

        // null defaults to current default
        DateTimeZone.setDefault(zone2);
        assertEquals(zone2.convertLocalToUTC(zone1.convertUTCToLocal(1000L), false),
                     zone1.getMillisKeepLocal(null, 1000L));

        // same zone returns same instant
        assertEquals(1000L, zone1.getMillisKeepLocal(zone1, 1000L));

        // different zone
        assertEquals(-6199000L, zone1.getMillisKeepLocal(zone2, 1000L));
    }

    @Test
    public void testIsLocalDateTimeGap_fixedZone() {
        assertFalse(DateTimeZone.UTC.isLocalDateTimeGap(new LocalDateTime(0L)));
    }

    @Test
    public void testAdjustOffset() {
        DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        // Normal instant (no overlap)
        assertEquals(0L, zone.adjustOffset(0L, false));
        assertEquals(0L, zone.adjustOffset(0L, true));

        // During overlap in America/New_York: 2007-11-04 01:30:00 (EDT / EST)
        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        long overlapInstant = 1194157800000L; // 01:30 EDT
        long earlier = ny.adjustOffset(overlapInstant, false);
        long later = ny.adjustOffset(overlapInstant, true);
        assertTrue(earlier <= later);
    }

    // =========================================================================
    // 8. Basic Methods & Serialization
    // =========================================================================

    @Test
    public void testEqualsAndHashCode() {
        DateTimeZone z1 = DateTimeZone.forOffsetHours(2);
        DateTimeZone z2 = DateTimeZone.forOffsetHours(2);
        DateTimeZone z3 = DateTimeZone.forOffsetHours(3);

        assertEquals(z1, z2);
        assertNotEquals(z1, z3);
        assertEquals(z1.hashCode(), z2.hashCode());
        assertEquals("+02:00", z1.toString());
    }

    @Test
    public void testToTimeZone() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        TimeZone tz = zone.toTimeZone();
        assertEquals("Europe/London", tz.getID());
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