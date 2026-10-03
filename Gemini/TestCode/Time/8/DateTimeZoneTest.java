package org.joda.time;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;

import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.junit.After;
import org.junit.Assert;
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
        try {
            DateTimeZone.setProvider(originalProvider);
        } catch (Exception ignored) {
        }
        try {
            DateTimeZone.setNameProvider(originalNameProvider);
        } catch (Exception ignored) {
        }
    }

    // -----------------------------------------------------------------------
    // Tests for forOffsetHours, forOffsetHoursMinutes, forOffsetMillis
    // -----------------------------------------------------------------------

    @Test
    public void testForOffsetHours_valid() {
        Assert.assertEquals(DateTimeZone.UTC, DateTimeZone.forOffsetHours(0));
        Assert.assertEquals(DateTimeZone.forOffsetMillis(3 * 3600000), DateTimeZone.forOffsetHours(3));
        Assert.assertEquals(DateTimeZone.forOffsetMillis(-5 * 3600000), DateTimeZone.forOffsetHours(-5));
        Assert.assertEquals(DateTimeZone.forOffsetMillis(23 * 3600000), DateTimeZone.forOffsetHours(23));
        Assert.assertEquals(DateTimeZone.forOffsetMillis(-23 * 3600000), DateTimeZone.forOffsetHours(-23));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHours_tooHigh() {
        DateTimeZone.forOffsetHours(24);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHours_tooLow() {
        DateTimeZone.forOffsetHours(-24);
    }

    @Test
    public void testForOffsetHoursMinutes_validCombinations() {
        // Zero
        Assert.assertEquals(DateTimeZone.UTC, DateTimeZone.forOffsetHoursMinutes(0, 0));

        // +ve hour, +ve min
        Assert.assertEquals(DateTimeZone.forOffsetMillis((2 * 60 + 15) * 60000), DateTimeZone.forOffsetHoursMinutes(2, 15));

        // +ve hour, zero min
        Assert.assertEquals(DateTimeZone.forOffsetMillis(2 * 3600000), DateTimeZone.forOffsetHoursMinutes(2, 0));

        // zero hour, +ve min
        Assert.assertEquals(DateTimeZone.forOffsetMillis(15 * 60000), DateTimeZone.forOffsetHoursMinutes(0, 15));

        // -ve hour, zero min
        Assert.assertEquals(DateTimeZone.forOffsetMillis(-2 * 3600000), DateTimeZone.forOffsetHoursMinutes(-2, 0));

        // -ve hour, +ve min -> interpreted as - (2 hours + 15 mins)
        Assert.assertEquals(DateTimeZone.forOffsetMillis(-(2 * 60 + 15) * 60000), DateTimeZone.forOffsetHoursMinutes(-2, 15));
    }

    @Test
    public void testForOffsetHoursMinutes_negativeMinutesDefects4J_Time8() {
        // Zero hour, -ve min: should represent -00:15
        try {
            DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(0, -15);
            Assert.assertEquals(DateTimeZone.forOffsetMillis(-15 * 60000), zone);
        } catch (IllegalArgumentException ex) {
            // Defects4J Time-8 bug exposes this failure when minutes are negative
            Assert.fail("DateTimeZone.forOffsetHoursMinutes(0, -15) should be allowed: " + ex.getMessage());
        }

        // -ve hour, -ve min: should represent -02:15
        try {
            DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(-2, -15);
            Assert.assertEquals(DateTimeZone.forOffsetMillis(-(2 * 60 + 15) * 60000), zone);
        } catch (IllegalArgumentException ex) {
            Assert.fail("DateTimeZone.forOffsetHoursMinutes(-2, -15) should be allowed: " + ex.getMessage());
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_positiveHoursNegativeMinutes() {
        // +ve hour, -ve min is invalid by specification
        DateTimeZone.forOffsetHoursMinutes(2, -15);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_minutesTooHigh() {
        DateTimeZone.forOffsetHoursMinutes(0, 60);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_minutesTooLow() {
        DateTimeZone.forOffsetHoursMinutes(0, -60);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_hoursTooHigh() {
        DateTimeZone.forOffsetHoursMinutes(24, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_hoursTooLow() {
        DateTimeZone.forOffsetHoursMinutes(-24, 0);
    }

    @Test
    public void testForOffsetMillis_boundaries() {
        int maxMillis = (86400 * 1000) - 1;
        Assert.assertEquals(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0));
        Assert.assertNotNull(DateTimeZone.forOffsetMillis(maxMillis));
        Assert.assertNotNull(DateTimeZone.forOffsetMillis(-maxMillis));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetMillis_aboveMax() {
        int maxMillis = (86400 * 1000) - 1;
        DateTimeZone.forOffsetMillis(maxMillis + 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetMillis_belowMin() {
        int maxMillis = (86400 * 1000) - 1;
        DateTimeZone.forOffsetMillis(-maxMillis - 1);
    }

    // -----------------------------------------------------------------------
    // Tests for forID
    // -----------------------------------------------------------------------

    @Test
    public void testForID_nullReturnsDefault() {
        DateTimeZone.setDefault(DateTimeZone.UTC);
        Assert.assertEquals(DateTimeZone.UTC, DateTimeZone.forID(null));
    }

    @Test
    public void testForID_utc() {
        Assert.assertEquals(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
    }

    @Test
    public void testForID_formattedOffsets() {
        Assert.assertEquals(DateTimeZone.UTC, DateTimeZone.forID("+00:00"));
        Assert.assertEquals(DateTimeZone.UTC, DateTimeZone.forID("-00:00"));
        Assert.assertEquals(DateTimeZone.forOffsetHours(2), DateTimeZone.forID("+02:00"));
        Assert.assertEquals(DateTimeZone.forOffsetHours(-5), DateTimeZone.forID("-05:00"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_invalidString() {
        DateTimeZone.forID("InvalidZoneID");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_invalidOffsetFormat() {
        DateTimeZone.forID("+99:99");
    }

    // -----------------------------------------------------------------------
    // Tests for forTimeZone
    // -----------------------------------------------------------------------

    @Test
    public void testForTimeZone_null() {
        DateTimeZone.setDefault(DateTimeZone.UTC);
        Assert.assertEquals(DateTimeZone.UTC, DateTimeZone.forTimeZone(null));
    }

    @Test
    public void testForTimeZone_utc() {
        Assert.assertEquals(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void testForTimeZone_conversions() {
        Assert.assertEquals(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT")));
        Assert.assertEquals("America/New_York", DateTimeZone.forTimeZone(TimeZone.getTimeZone("EST")).getID());
        Assert.assertEquals("America/Los_Angeles", DateTimeZone.forTimeZone(TimeZone.getTimeZone("PST")).getID());
    }

    @Test
    public void testForTimeZone_gmtOffset() {
        Assert.assertEquals(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+00:00")));
        Assert.assertEquals(DateTimeZone.forOffsetHours(3), DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+03:00")));
        Assert.assertEquals(DateTimeZone.forOffsetHours(-4), DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT-04:00")));
    }

    // -----------------------------------------------------------------------
    // Tests for Default TimeZone management & Providers
    // -----------------------------------------------------------------------

    @Test
    public void testGetSetDefault() {
        DateTimeZone london = DateTimeZone.forID("Europe/London");
        DateTimeZone.setDefault(london);
        Assert.assertEquals(london, DateTimeZone.getDefault());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDefault_null() {
        DateTimeZone.setDefault(null);
    }

    @Test
    public void testGetAvailableIDs() {
        Set<String> ids = DateTimeZone.getAvailableIDs();
        Assert.assertNotNull(ids);
        Assert.assertTrue(ids.contains("UTC"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_emptyIds() {
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String id) {
                return null;
            }
            public Set<String> getAvailableIDs() {
                return java.util.Collections.emptySet();
            }
        });
    }

    @Test
    public void testSetProvider_nullRestoresDefault() {
        DateTimeZone.setProvider(null);
        Assert.assertNotNull(DateTimeZone.getProvider());
    }

    @Test
    public void testSetNameProvider_nullRestoresDefault() {
        DateTimeZone.setNameProvider(null);
        Assert.assertNotNull(DateTimeZone.getNameProvider());
    }

    // -----------------------------------------------------------------------
    // Tests for Time Zone conversions & calculations
    // -----------------------------------------------------------------------

    @Test
    public void testConvertUTCToLocal_and_ConvertLocalToUTC() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        long instantUTC = 1000000000L;
        long instantLocal = zone.convertUTCToLocal(instantUTC);
        Assert.assertEquals(instantUTC + 2 * 3600000L, instantLocal);

        long backToUTC = zone.convertLocalToUTC(instantLocal, false);
        Assert.assertEquals(instantUTC, backToUTC);

        long backToUTCStrict = zone.convertLocalToUTC(instantLocal, true);
        Assert.assertEquals(instantUTC, backToUTCStrict);

        long backWithOriginal = zone.convertLocalToUTC(instantLocal, false, instantUTC);
        Assert.assertEquals(instantUTC, backWithOriginal);
    }

    @Test(expected = ArithmeticException.class)
    public void testConvertUTCToLocal_overflow() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        zone.convertUTCToLocal(Long.MAX_VALUE);
    }

    @Test(expected = ArithmeticException.class)
    public void testConvertLocalToUTC_underflow() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        zone.convertLocalToUTC(Long.MIN_VALUE, false);
    }

    @Test
    public void testGetMillisKeepLocal() {
        DateTimeZone zone1 = DateTimeZone.forOffsetHours(1);
        DateTimeZone zone2 = DateTimeZone.forOffsetHours(3);

        long instant = 1000000000L;
        // Same zone
        Assert.assertEquals(instant, zone1.getMillisKeepLocal(zone1, instant));
        // Different zone
        long converted = zone1.getMillisKeepLocal(zone2, instant);
        Assert.assertEquals(instant - 2 * 3600000L, converted);
        // Null newZone means default
        DateTimeZone.setDefault(zone1);
        Assert.assertEquals(instant, zone1.getMillisKeepLocal(null, instant));
    }

    @Test
    public void testGetNamesAndLocale() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        long instant = 0L; // Winter time
        Assert.assertNotNull(zone.getName(instant));
        Assert.assertNotNull(zone.getName(instant, Locale.UK));
        Assert.assertNotNull(zone.getShortName(instant));
        Assert.assertNotNull(zone.getShortName(instant, Locale.UK));

        Assert.assertTrue(zone.isStandardOffset(instant));
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
        DateTimeZone result = (DateTimeZone) ois.readObject();
        ois.close();

        Assert.assertEquals(zone, result);
        Assert.assertSame(zone, result);
    }
}