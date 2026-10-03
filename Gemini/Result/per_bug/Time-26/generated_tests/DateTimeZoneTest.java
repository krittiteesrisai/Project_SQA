package org.joda.time;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

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
    // getDefault() & setDefault()
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
    // forID() Branches
    // =========================================================================

    @Test
    public void testForID_null() {
        assertSame(DateTimeZone.getDefault(), DateTimeZone.forID(null));
    }

    @Test
    public void testForID_UTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
    }

    @Test
    public void testForID_validID() {
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
    public void testForID_positiveAndNegativeOffset() {
        DateTimeZone plus = DateTimeZone.forID("+02:30");
        assertEquals("+02:30", plus.getID());
        assertEquals(2 * 3600000 + 30 * 60000, plus.getOffset(0L));

        DateTimeZone minus = DateTimeZone.forID("-05:00");
        assertEquals("-05:00", minus.getID());
        assertEquals(-5 * 3600000, minus.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_invalid() {
        DateTimeZone.forID("Invalid/NonExistent_Zone");
    }

    // =========================================================================
    // forOffsetHours(), forOffsetHoursMinutes(), forOffsetMillis()
    // =========================================================================

    @Test
    public void testForOffsetHours_zero() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHours(0));
    }

    @Test
    public void testForOffsetHours_positiveAndNegative() {
        DateTimeZone plusTwo = DateTimeZone.forOffsetHours(2);
        assertEquals("+02:00", plusTwo.getID());
        assertEquals(2 * 3600000, plusTwo.getOffset(0L));

        DateTimeZone minusTwo = DateTimeZone.forOffsetHours(-2);
        assertEquals("-02:00", minusTwo.getID());
        assertEquals(-2 * 3600000, minusTwo.getOffset(0L));
    }

    @Test
    public void testForOffsetHoursMinutes_zero() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHoursMinutes(0, 0));
    }

    @Test
    public void testForOffsetHoursMinutes_negativeHoursPositiveMinutes() {
        // -2 hours and 30 minutes represents -02:30
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(-2, 30);
        assertEquals("-02:30", zone.getID());
        assertEquals(-(2 * 3600000 + 30 * 60000), zone.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_minutesNegative() {
        DateTimeZone.forOffsetHoursMinutes(1, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_minutesTooLarge() {
        DateTimeZone.forOffsetHoursMinutes(1, 60);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_overflow() {
        DateTimeZone.forOffsetHoursMinutes(Integer.MAX_VALUE / 60 + 1, 0);
    }

    @Test
    public void testForOffsetMillis_variousComponents() {
        // Zero
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0));

        // Hours only
        assertEquals("+01:00", DateTimeZone.forOffsetMillis(3600000).getID());

        // Hours and minutes
        assertEquals("+01:30", DateTimeZone.forOffsetMillis(5400000).getID());

        // Hours, minutes, seconds
        assertEquals("+01:30:15", DateTimeZone.forOffsetMillis(5415000).getID());

        // Hours, minutes, seconds, millis
        assertEquals("+01:30:15.123", DateTimeZone.forOffsetMillis(5415123).getID());

        // Negative full
        assertEquals("-01:30:15.123", DateTimeZone.forOffsetMillis(-5415123).getID());
    }

    // =========================================================================
    // forTimeZone()
    // =========================================================================

    @Test
    public void testForTimeZone_null() {
        assertSame(DateTimeZone.getDefault(), DateTimeZone.forTimeZone(null));
    }

    @Test
    public void testForTimeZone_UTC() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(tz));
    }

    @Test
    public void testForTimeZone_convertedOldId() {
        TimeZone tz = TimeZone.getTimeZone("PST");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        assertEquals("America/Los_Angeles", zone.getID());
    }

    @Test
    public void testForTimeZone_customGMTZero() {
        TimeZone tz = new SimpleTimeZone(0, "GMT+00:00");
        assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(tz));
    }

    @Test
    public void testForTimeZone_customGMTOffset() {
        TimeZone tz = new SimpleTimeZone(3600000, "GMT+01:00");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        assertEquals("+01:00", zone.getID());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForTimeZone_unrecognised() {
        TimeZone tz = new SimpleTimeZone(0, "NonExistentZoneID");
        DateTimeZone.forTimeZone(tz);
    }

    // =========================================================================
    // Provider & NameProvider
    // =========================================================================

    @Test
    public void testSetProvider_null() {
        DateTimeZone.setProvider(null);
        assertNotNull(DateTimeZone.getProvider());
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
                set.add("America/New_York");
                return set;
            }
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_invalidUTC() {
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String id) {
                if ("UTC".equals(id)) {
                    return DateTimeZone.forOffsetHours(1); // Not equal to DateTimeZone.UTC
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
        assertTrue(DateTimeZone.getNameProvider() instanceof DefaultNameProvider);
    }

    // =========================================================================
    // Names, Locale, and Offset Queries
    // =========================================================================

    @Test
    public void testGetNameAndShortName_nullLocale() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        long instant = 0L; // 1970-01-01
        String name = zone.getName(instant, null);
        String shortName = zone.getShortName(instant, null);
        assertNotNull(name);
        assertNotNull(shortName);
        assertEquals(zone.getName(instant), name);
        assertEquals(zone.getShortName(instant), shortName);
    }

    @Test
    public void testGetNameAndShortName_nameProviderReturnsNull() {
        DateTimeZone.setNameProvider(new NameProvider() {
            public String getShortName(Locale locale, String id, String nameKey) { return null; }
            public String getName(Locale locale, String id, String nameKey) { return null; }
        });
        DateTimeZone zone = DateTimeZone.forID("+02:00");
        long instant = 0L;
        // Fallback should print the formatted offset
        assertEquals("+02:00", zone.getName(instant, Locale.ENGLISH));
        assertEquals("+02:00", zone.getShortName(instant, Locale.ENGLISH));
    }

    @Test
    public void testGetOffset_ReadableInstant() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        assertEquals(zone.getOffset(0L), zone.getOffset(new Instant(0L)));
        // Null instant defaults to now
        assertTrue(zone.getOffset((ReadableInstant) null) == 0 || zone.getOffset((ReadableInstant) null) == 3600000);
    }

    @Test
    public void testIsStandardOffset() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        // Winter (Standard time)
        assertTrue(zone.isStandardOffset(0L));
        // Summer (DST time, July 1970)
        long summerInstant = 15778463000L;
        assertFalse(zone.isStandardOffset(summerInstant));
    }

    // =========================================================================
    // Offset Transitions, Local/UTC Conversions & Arithmetic Overflow
    // =========================================================================

    @Test
    public void testConvertUTCToLocal_andOverflow() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        assertEquals(3600000L, zone.convertUTCToLocal(0L));

        try {
            zone.convertUTCToLocal(Long.MAX_VALUE);
            fail("Expected ArithmeticException on overflow");
        } catch (ArithmeticException expected) {
            // Success
        }
    }

    @Test
    public void testConvertLocalToUTC_andOverflow() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(-1);
        try {
            zone.convertLocalToUTC(Long.MAX_VALUE, false);
            fail("Expected ArithmeticException on overflow");
        } catch (ArithmeticException expected) {
            // Success
        }
    }

    @Test
    public void testConvertLocalToUTC_DSTGap_StrictVsNonStrict() {
        // America/New_York DST gap in Spring 2007: 2007-03-11 02:00 -> 03:00
        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        // 2007-03-11 02:30:00 local time (Gap instant)
        long gapLocalMillis = new DateTime(2007, 3, 11, 2, 30, 0, 0, DateTimeZone.UTC).getMillis();

        try {
            ny.convertLocalToUTC(gapLocalMillis, true);
            fail("Expected IllegalArgumentException in strict mode for DST gap");
        } catch (IllegalArgumentException expected) {
            assertTrue(expected.getMessage().contains("Illegal instant due to time zone offset transition"));
        }

        // Non-strict mode should not throw
        long utcMillis = ny.convertLocalToUTC(gapLocalMillis, false);
        assertTrue(utcMillis > 0);
    }

    @Test
    public void testGetOffsetFromLocal() {
        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        // Regular standard time
        long winterLocal = new DateTime(2007, 1, 15, 12, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals(-5 * 3600000, ny.getOffsetFromLocal(winterLocal));

        // DST Gap instant
        long gapLocal = new DateTime(2007, 3, 11, 2, 30, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals(-5 * 3600000, ny.getOffsetFromLocal(gapLocal));
    }

    @Test
    public void testGetMillisKeepLocal() {
        DateTimeZone zone1 = DateTimeZone.forOffsetHours(1);
        DateTimeZone zone2 = DateTimeZone.forOffsetHours(3);

        // Same zone
        assertEquals(1000L, zone1.getMillisKeepLocal(zone1, 1000L));

        // null newZone defaults to getDefault()
        DateTimeZone.setDefault(zone2);
        long keepLocalWithNull = zone1.getMillisKeepLocal(null, 0L);
        long keepLocalWithZone2 = zone1.getMillisKeepLocal(zone2, 0L);
        assertEquals(keepLocalWithZone2, keepLocalWithNull);
    }

    @Test
    public void testIsLocalDateTimeGap() {
        DateTimeZone fixed = DateTimeZone.forOffsetHours(2);
        LocalDateTime ldt = new LocalDateTime(2007, 3, 11, 2, 30);
        assertFalse(fixed.isLocalDateTimeGap(ldt));

        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        assertTrue(ny.isLocalDateTimeGap(ldt));

        LocalDateTime nonGapLdt = new LocalDateTime(2007, 1, 15, 12, 0);
        assertFalse(ny.isLocalDateTimeGap(nonGapLdt));
    }

    // =========================================================================
    // Basic Methods & Serialization
    // =========================================================================

    @Test
    public void testToTimeZone_hashCode_toString() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        assertEquals("Europe/London", zone.toString());
        assertEquals("Europe/London", zone.toTimeZone().getID());
        assertEquals(57 + "Europe/London".hashCode(), zone.hashCode());
        assertNotNull(DateTimeZone.getAvailableIDs());
        assertTrue(DateTimeZone.getAvailableIDs().contains("Europe/London"));
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