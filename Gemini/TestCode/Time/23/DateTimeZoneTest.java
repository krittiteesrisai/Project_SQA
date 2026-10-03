package org.joda.time;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
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
    // Test getDefault() / setDefault()
    // -----------------------------------------------------------------------
    @Test
    public void testGetDefault() {
        DateTimeZone zone = DateTimeZone.getDefault();
        assertNotNull(zone);
    }

    @Test
    public void testSetDefault_Valid() {
        DateTimeZone paris = DateTimeZone.forID("Europe/Paris");
        DateTimeZone.setDefault(paris);
        assertEquals(paris, DateTimeZone.getDefault());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDefault_Null() {
        DateTimeZone.setDefault(null);
    }

    // -----------------------------------------------------------------------
    // Test forID(String)
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
    public void testForID_ValidKnownZone() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        assertNotNull(zone);
        assertEquals("Europe/London", zone.getID());
    }

    @Test
    public void testForID_ZeroOffsetFormats() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("+00:00"));
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("-00:00"));
    }

    @Test
    public void testForID_OffsetFormats() {
        DateTimeZone plusTwo = DateTimeZone.forID("+02:00");
        assertEquals("+02:00", plusTwo.getID());
        assertEquals(2 * 3600 * 1000, plusTwo.getOffset(0L));

        DateTimeZone minusFive = DateTimeZone.forID("-05:00");
        assertEquals("-05:00", minusFive.getID());
        assertEquals(-5 * 3600 * 1000, minusFive.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_InvalidString() {
        DateTimeZone.forID("InvalidZoneIdentifier123");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_InvalidOffsetString() {
        DateTimeZone.forID("+99:99");
    }

    // -----------------------------------------------------------------------
    // Test forOffsetHours / forOffsetHoursMinutes / forOffsetMillis
    // -----------------------------------------------------------------------
    @Test
    public void testForOffsetHours_Zero() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHours(0));
    }

    @Test
    public void testForOffsetHours_PositiveNegative() {
        DateTimeZone zonePlus3 = DateTimeZone.forOffsetHours(3);
        assertEquals("+03:00", zonePlus3.getID());

        DateTimeZone zoneMinus4 = DateTimeZone.forOffsetHours(-4);
        assertEquals("-04:00", zoneMinus4.getID());
    }

    @Test
    public void testForOffsetHoursMinutes_Zero() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHoursMinutes(0, 0));
    }

    @Test
    public void testForOffsetHoursMinutes_ValidOffsets() {
        DateTimeZone zone1 = DateTimeZone.forOffsetHoursMinutes(5, 30);
        assertEquals("+05:30", zone1.getID());
        assertEquals((5 * 60 + 30) * 60000, zone1.getOffset(0L));

        DateTimeZone zone2 = DateTimeZone.forOffsetHoursMinutes(-2, 30);
        assertEquals("-02:30", zone2.getID());
        assertEquals(-(2 * 60 + 30) * 60000, zone2.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_MinutesNegative() {
        DateTimeZone.forOffsetHoursMinutes(5, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_MinutesOver59() {
        DateTimeZone.forOffsetHoursMinutes(5, 60);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_Overflow() {
        DateTimeZone.forOffsetHoursMinutes(Integer.MAX_VALUE, 0);
    }

    @Test
    public void testForOffsetMillis_Zero() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0));
    }

    @Test
    public void testForOffsetMillis_WithSecondsAndMillis() {
        int millis = (1 * 3600 + 23 * 60 + 45) * 1000 + 678;
        DateTimeZone zone = DateTimeZone.forOffsetMillis(millis);
        assertEquals("+01:23:45.678", zone.getID());
        assertEquals(millis, zone.getOffset(0L));

        DateTimeZone zoneNeg = DateTimeZone.forOffsetMillis(-millis);
        assertEquals("-01:23:45.678", zoneNeg.getID());
        assertEquals(-millis, zoneNeg.getOffset(0L));
    }

    // -----------------------------------------------------------------------
    // Test forTimeZone(TimeZone) & Old 3-letter IDs
    // -----------------------------------------------------------------------
    @Test
    public void testForTimeZone_Null() {
        assertEquals(DateTimeZone.getDefault(), DateTimeZone.forTimeZone(null));
    }

    @Test
    public void testForTimeZone_UTC() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(tz));
    }

    @Test
    public void testForTimeZone_ConvertedAliases() {
        assertEquals("America/New_York", DateTimeZone.forTimeZone(TimeZone.getTimeZone("EST")).getID());
        assertEquals("America/Los_Angeles", DateTimeZone.forTimeZone(TimeZone.getTimeZone("PST")).getID());
        assertEquals("America/Chicago", DateTimeZone.forTimeZone(TimeZone.getTimeZone("CST")).getID());
        assertEquals("Europe/London", DateTimeZone.forTimeZone(TimeZone.getTimeZone("WET")).getID());
        assertEquals("Europe/Bucharest", DateTimeZone.forTimeZone(TimeZone.getTimeZone("EET")).getID());
        assertEquals("Asia/Tokyo", DateTimeZone.forTimeZone(TimeZone.getTimeZone("JST")).getID());
    }

    @Test
    public void testForTimeZone_CustomGMT() {
        TimeZone customPlus = new SimpleTimeZone(2 * 3600000, "GMT+02:00");
        DateTimeZone zonePlus = DateTimeZone.forTimeZone(customPlus);
        assertEquals("+02:00", zonePlus.getID());

        TimeZone customZero = new SimpleTimeZone(0, "GMT+00:00");
        DateTimeZone zoneZero = DateTimeZone.forTimeZone(customZero);
        assertSame(DateTimeZone.UTC, zoneZero);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForTimeZone_Unrecognized() {
        TimeZone invalid = new SimpleTimeZone(0, "UNKNOWN_TZ_ID");
        DateTimeZone.forTimeZone(invalid);
    }

    // -----------------------------------------------------------------------
    // Test Provider & NameProvider
    // -----------------------------------------------------------------------
    @Test
    public void testGetAvailableIDs() {
        Set<String> ids = DateTimeZone.getAvailableIDs();
        assertNotNull(ids);
        assertTrue(ids.contains("UTC"));
    }

    @Test
    public void testSetProvider_NullResetsToDefault() {
        DateTimeZone.setProvider(null);
        assertNotNull(DateTimeZone.getProvider());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_EmptyIds() {
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String id) { return null; }
            public Set<String> getAvailableIDs() { return Collections.emptySet(); }
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_NoUTC() {
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String id) { return null; }
            public Set<String> getAvailableIDs() {
                Set<String> set = new HashSet<String>();
                set.add("America/New_York");
                return set;
            }
        });
    }

    @Test
    public void testSetNameProvider_NullResetsToDefault() {
        DateTimeZone.setNameProvider(null);
        assertNotNull(DateTimeZone.getNameProvider());
    }

    @Test
    public void testSetNameProvider_Custom() {
        DateTimeZone.setNameProvider(new DefaultNameProvider());
        assertNotNull(DateTimeZone.getNameProvider());
    }

    // -----------------------------------------------------------------------
    // Test Names and Offsets
    // -----------------------------------------------------------------------
    @Test
    public void testGetNames() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        long winterInstant = 0L; // 1970-01-01 (GMT)
        long summerInstant = 10000000000L; // 1970-04-26 (BST)

        assertNotNull(zone.getName(winterInstant));
        assertNotNull(zone.getName(winterInstant, Locale.ENGLISH));
        assertNotNull(zone.getShortName(summerInstant));
        assertNotNull(zone.getShortName(summerInstant, Locale.UK));

        DateTimeZone fixed = DateTimeZone.forOffsetHours(3);
        assertEquals("+03:00", fixed.getName(0L, null));
        assertEquals("+03:00", fixed.getShortName(0L, null));
    }

    @Test
    public void testGetOffset_ReadableInstant() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertEquals(2 * 3600000, zone.getOffset((ReadableInstant) null));
        assertEquals(2 * 3600000, zone.getOffset(new Instant(0L)));
    }

    @Test
    public void testIsStandardOffset() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        assertTrue(zone.isStandardOffset(0L)); // Winter standard time
    }

    // -----------------------------------------------------------------------
    // Test UTC to Local & Local to UTC conversions and Overflows
    // -----------------------------------------------------------------------
    @Test
    public void testConvertUTCToLocal() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(3);
        assertEquals(10800000L, zone.convertUTCToLocal(0L));
    }

    @Test(expected = ArithmeticException.class)
    public void testConvertUTCToLocal_Overflow() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        zone.convertUTCToLocal(Long.MAX_VALUE);
    }

    @Test
    public void testConvertLocalToUTC_LenientAndStrict() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(3);
        assertEquals(0L, zone.convertLocalToUTC(10800000L, true));
        assertEquals(0L, zone.convertLocalToUTC(10800000L, false));
    }

    @Test(expected = ArithmeticException.class)
    public void testConvertLocalToUTC_Underflow() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        zone.convertLocalToUTC(Long.MIN_VALUE, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertLocalToUTC_StrictInDstGap() {
        // America/New_York DST cutover on 2007-03-11: 02:00 becomes 03:00
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        // Local time: 2007-03-11T02:30:00.000 in America/New_York millis
        long gapLocalInstant = 1173598200000L;
        zone.convertLocalToUTC(gapLocalInstant, true);
    }

    @Test
    public void testConvertLocalToUTC_LenientInDstGap() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        long gapLocalInstant = 1173598200000L;
        // Lenient should succeed and not throw IllegalArgumentException
        long utc = zone.convertLocalToUTC(gapLocalInstant, false);
        assertTrue(utc > 0);
    }

    @Test
    public void testConvertLocalToUTC_WithOriginalInstant() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        long original = 0L;
        long converted = zone.convertLocalToUTC(0L, false, original);
        assertEquals(0L, converted);
    }

    @Test
    public void testGetMillisKeepLocal() {
        DateTimeZone london = DateTimeZone.forID("Europe/London");
        DateTimeZone paris = DateTimeZone.forID("Europe/Paris");

        assertEquals(0L, london.getMillisKeepLocal(london, 0L));
        assertEquals(0L, london.getMillisKeepLocal(null, 0L) - london.getMillisKeepLocal(DateTimeZone.getDefault(), 0L));
        
        long parisMillis = london.getMillisKeepLocal(paris, 0L);
        assertEquals(-3600000L, parisMillis);
    }

    // -----------------------------------------------------------------------
    // Test Gap / Overlap / Transitions
    // -----------------------------------------------------------------------
    @Test
    public void testIsLocalDateTimeGap() {
        DateTimeZone fixedZone = DateTimeZone.forOffsetHours(2);
        LocalDateTime ldt = new LocalDateTime(2007, 3, 11, 2, 30);
        assertFalse(fixedZone.isLocalDateTimeGap(ldt));

        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        assertTrue(ny.isLocalDateTimeGap(ldt));
        assertFalse(ny.isLocalDateTimeGap(new LocalDateTime(2007, 3, 11, 4, 30)));
    }

    @Test
    public void testAdjustOffset() {
        DateTimeZone fixed = DateTimeZone.forOffsetHours(2);
        assertEquals(1000L, fixed.adjustOffset(1000L, true));
        assertEquals(1000L, fixed.adjustOffset(1000L, false));

        DateTimeZone london = DateTimeZone.forID("Europe/London");
        long overlapInstant = 1193533200000L; // 2007-10-28 DST overlap
        long earlier = london.adjustOffset(overlapInstant, false);
        long later = london.adjustOffset(overlapInstant, true);
        assertTrue(earlier <= later);
    }

    // -----------------------------------------------------------------------
    // Test Base Methods & Serialization (writeReplace / Stub)
    // -----------------------------------------------------------------------
    @Test
    public void testBaseMethods() {
        DateTimeZone zone1 = DateTimeZone.forOffsetHours(2);
        DateTimeZone zone2 = DateTimeZone.forOffsetHours(2);
        DateTimeZone zone3 = DateTimeZone.forOffsetHours(3);

        assertEquals(zone1, zone2);
        assertNotEquals(zone1, zone3);
        assertEquals(zone1.hashCode(), zone2.hashCode());
        assertEquals("+02:00", zone1.toString());
        assertEquals("+02:00", zone1.toTimeZone().getID());
    }

    @Test
    public void testSerialization() throws Exception {
        DateTimeZone original = DateTimeZone.forID("Europe/Paris");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        DateTimeZone deserialized = (DateTimeZone) ois.readObject();
        ois.close();

        assertSame(original, deserialized);
    }

    @Test
    public void testProtectedConstructor_NullId() throws Throwable {
        Constructor<DateTimeZone> constructor = (Constructor<DateTimeZone>) DateTimeZone.class.getDeclaredConstructors()[0];
        constructor.setAccessible(true);
        try {
            // Instantiate anonymous subclass using the protected constructor with null
            constructor.newInstance((String) null);
            fail("Expected InvocationTargetException wrapping IllegalArgumentException");
        } catch (InvocationTargetException ex) {
            assertTrue(ex.getCause() instanceof IllegalArgumentException);
        }
    }
}