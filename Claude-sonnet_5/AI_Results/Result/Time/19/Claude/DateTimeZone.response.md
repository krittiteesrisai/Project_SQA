# JUnit 4 Test Suite สำหรับ `DateTimeZone` (Time-19b)

ด้านล่างนี้คือชุดทดสอบ `DateTimeZoneTest` ที่ครอบคลุม branch/condition หลักของคลาส `DateTimeZone` เท่าที่วิเคราะห์ได้จากซอร์สที่ให้มา โดยใช้เฉพาะ JUnit 4 + joda-convert ตามที่กำหนด

```java
import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;

import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
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

    // ======================================================================
    // Helper: custom TimeZone implementation to deterministically control
    // getDisplayName()/getID() so that forTimeZone() branches become
    // reproducible regardless of JDK locale data.
    // ======================================================================
    private static final class CustomTimeZone extends TimeZone {
        private final String id;
        private final String displayName;

        CustomTimeZone(String id, String displayName) {
            this.id = id;
            this.displayName = displayName;
            setID(id);
        }

        @Override
        public int getOffset(int era, int year, int month, int day, int dayOfWeek, int millis) {
            return 0;
        }

        @Override
        public int getRawOffset() {
            return 0;
        }

        @Override
        public void setRawOffset(int offsetMillis) {
            // no-op
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
        public String getDisplayName() {
            return displayName;
        }

        @Override
        public String getID() {
            return id;
        }
    }

    // ======================================================================
    // forID(String)
    // ======================================================================

    @Test
    public void testForID_null_returnsDefault() {
        DateTimeZone.setDefault(DateTimeZone.UTC);
        assertSame(DateTimeZone.UTC, DateTimeZone.forID(null));
    }

    @Test
    public void testForID_UTC_literal() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
    }

    @Test
    public void testForID_validLongId_fromProvider() {
        DateTimeZone zone = DateTimeZone.forID("America/Los_Angeles");
        assertEquals("America/Los_Angeles", zone.getID());
    }

    @Test
    public void testForID_plusOffsetZero_returnsUTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("+00:00"));
    }

    @Test
    public void testForID_minusOffsetZero_returnsUTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("-00:00"));
    }

    @Test
    public void testForID_plusOffsetNonZero() {
        DateTimeZone zone = DateTimeZone.forID("+01:00");
        assertEquals("+01:00", zone.getID());
        assertEquals(3600000, zone.getOffset(0L));
    }

    @Test
    public void testForID_minusOffsetNonZero() {
        DateTimeZone zone = DateTimeZone.forID("-01:00");
        assertEquals("-01:00", zone.getID());
        assertEquals(-3600000, zone.getOffset(0L));
    }

    @Test
    public void testForID_fixedOffsetCache_sameInstanceOnSecondCall() {
        // covers fixedOffsetZone(): iFixedOffsetCache != null branch + cache-hit branch
        DateTimeZone zone1 = DateTimeZone.forID("+03:00");
        DateTimeZone zone2 = DateTimeZone.forID("+03:00");
        assertSame(zone1, zone2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_unrecognizedId_throws() {
        DateTimeZone.forID("Not/AValidZone");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_emptyString_throws() {
        DateTimeZone.forID("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_malformedOffset_throws() {
        // NOTE: อ้างอิงพฤติกรรมมาตรฐานของ parser ภายใน joda-time ว่าค่าที่ parse ไม่ได้
        // จะโยน IllegalArgumentException ไม่ได้เดา exception type อื่น
        DateTimeZone.forID("+abc");
    }

    // ======================================================================
    // forOffsetHours(int)
    // ======================================================================

    @Test
    public void testForOffsetHours_zero_returnsUTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHours(0));
    }

    @Test
    public void testForOffsetHours_positive() {
        assertEquals("+05:00", DateTimeZone.forOffsetHours(5).getID());
    }

    @Test
    public void testForOffsetHours_negative() {
        assertEquals("-05:00", DateTimeZone.forOffsetHours(-5).getID());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHours_overflow_throws() {
        DateTimeZone.forOffsetHours(Integer.MAX_VALUE);
    }

    // ======================================================================
    // forOffsetHoursMinutes(int, int)
    // ======================================================================

    @Test
    public void testForOffsetHoursMinutes_zeroZero_returnsUTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHoursMinutes(0, 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_minutesNegative_throws() {
        DateTimeZone.forOffsetHoursMinutes(1, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_minutesTooLarge_throws() {
        DateTimeZone.forOffsetHoursMinutes(1, 60);
    }

    @Test
    public void testForOffsetHoursMinutes_minutesBoundaryZero() {
        assertEquals("+02:00", DateTimeZone.forOffsetHoursMinutes(2, 0).getID());
    }

    @Test
    public void testForOffsetHoursMinutes_minutesBoundary59() {
        assertEquals("+02:59", DateTimeZone.forOffsetHoursMinutes(2, 59).getID());
    }

    @Test
    public void testForOffsetHoursMinutes_positiveHours() {
        assertEquals("+02:30", DateTimeZone.forOffsetHoursMinutes(2, 30).getID());
    }

    @Test
    public void testForOffsetHoursMinutes_negativeHours() {
        // per javadoc: (-2, 30) -> '-02:30'
        assertEquals("-02:30", DateTimeZone.forOffsetHoursMinutes(-2, 30).getID());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_overflow_throws() {
        DateTimeZone.forOffsetHoursMinutes(Integer.MAX_VALUE, 30);
    }

    // ======================================================================
    // forOffsetMillis(int)
    // ======================================================================

    @Test
    public void testForOffsetMillis_zero_returnsUTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0));
    }

    @Test
    public void testForOffsetMillis_positive() {
        assertEquals("+01:00", DateTimeZone.forOffsetMillis(3600000).getID());
    }

    @Test
    public void testForOffsetMillis_negative() {
        assertEquals("-01:00", DateTimeZone.forOffsetMillis(-3600000).getID());
    }

    @Test
    public void testForOffsetMillis_withSecondsRemainder() {
        // ครอบคลุมสาขา seconds != 0 ใน printOffset()
        assertEquals("+01:00:30", DateTimeZone.forOffsetMillis(3600000 + 30000).getID());
    }

    @Test
    public void testForOffsetMillis_withMillisRemainder() {
        // ครอบคลุมสาขา millis != 0 ใน printOffset()
        assertEquals("+01:00:30.123", DateTimeZone.forOffsetMillis(3600000 + 30000 + 123).getID());
    }

    // ======================================================================
    // forTimeZone(TimeZone) - ใช้ CustomTimeZone เพื่อควบคุม branch แบบ deterministic
    // ======================================================================

    @Test
    public void testForTimeZone_null_returnsDefault() {
        DateTimeZone.setDefault(DateTimeZone.UTC);
        assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(null));
    }

    @Test
    public void testForTimeZone_idUTC_returnsUTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void testForTimeZone_knownLongId_viaProvider() {
        TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        assertEquals("America/Los_Angeles", zone.getID());
    }

    @Test
    public void testForTimeZone_oldShortId_convertedViaMap() {
        // "PST" -> "America/Los_Angeles" ผ่าน getConvertedId()
        TimeZone tz = TimeZone.getTimeZone("PST");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        assertEquals("America/Los_Angeles", zone.getID());
    }

    @Test
    public void testForTimeZone_oldShortId_GMT_convertedToUTC() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        assertEquals(DateTimeZone.UTC, DateTimeZone.forTimeZone(tz));
    }

    @Test
    public void testForTimeZone_gmtDisplayName_zeroOffset_returnsUTC() {
        TimeZone tz = new CustomTimeZone("Totally/Unknown1", "GMT+00:00");
        assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(tz));
    }

    @Test
    public void testForTimeZone_gmtDisplayName_nonZeroOffset() {
        TimeZone tz = new CustomTimeZone("Totally/Unknown2", "GMT+02:00");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        assertEquals("+02:00", zone.getID());
    }

    @Test
    public void testForTimeZone_gmtDisplayName_negativeOffset() {
        TimeZone tz = new CustomTimeZone("Totally/Unknown3", "GMT-03:00");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        assertEquals("-03:00", zone.getID());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForTimeZone_unrecognized_notGmtFormat_throws() {
        TimeZone tz = new CustomTimeZone("Totally/Unknown4", "NotAGmtFormat");
        DateTimeZone.forTimeZone(tz);
    }

    // ======================================================================
    // getAvailableIDs / getProvider / setProvider
    // ======================================================================

    @Test
    public void testGetAvailableIDs_containsUTC() {
        Set<String> ids = DateTimeZone.getAvailableIDs();
        assertNotNull(ids);
        assertTrue(ids.contains("UTC"));
    }

    @Test
    public void testSetProvider_null_usesDefaultProvider() {
        DateTimeZone.setProvider(null);
        assertNotNull(DateTimeZone.getProvider());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_nullIds_throws() {
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String id) { return null; }
            public Set<String> getAvailableIDs() { return null; }
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_emptyIds_throws() {
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String id) { return null; }
            public Set<String> getAvailableIDs() { return Collections.emptySet(); }
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_missingUTC_throws() {
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String id) { return null; }
            public Set<String> getAvailableIDs() {
                Set<String> s = new HashSet<String>();
                s.add("SomeOtherZone");
                return s;
            }
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_invalidUTCZone_throws() {
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String id) { return null; } // ไม่เท่ากับ DateTimeZone.UTC
            public Set<String> getAvailableIDs() {
                Set<String> s = new HashSet<String>();
                s.add("UTC");
                return s;
            }
        });
    }

    // ======================================================================
    // getNameProvider / setNameProvider
    // ======================================================================

    @Test
    public void testSetNameProvider_null_usesDefault() {
        DateTimeZone.setNameProvider(null);
        assertNotNull(DateTimeZone.getNameProvider());
    }

    // ======================================================================
    // setDefault / getDefault
    // ======================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testSetDefault_null_throws() {
        DateTimeZone.setDefault(null);
    }

    @Test
    public void testSetDefault_getDefault_returnsSameZone() {
        DateTimeZone zone = DateTimeZone.forID("America/Los_Angeles");
        DateTimeZone.setDefault(zone);
        assertEquals(zone, DateTimeZone.getDefault());
    }

    // ======================================================================
    // Instance methods: getID / getShortName / getName
    // ======================================================================

    @Test
    public void testGetID() {
        assertEquals("UTC", DateTimeZone.UTC.getID());
    }

    @Test
    public void testGetShortName_defaultLocale() {
        assertNotNull(DateTimeZone.UTC.getShortName(0L));
    }

    @Test
    public void testGetShortName_withLocale() {
        assertNotNull(DateTimeZone.UTC.getShortName(0L, Locale.US));
    }

    @Test
    public void testGetName_defaultLocale() {
        assertNotNull(DateTimeZone.UTC.getName(0L));
    }

    @Test
    public void testGetName_withLocale() {
        assertNotNull(DateTimeZone.UTC.getName(0L, Locale.US));
    }

    // ======================================================================
    // getOffset(ReadableInstant)
    // ======================================================================

    @Test
    public void testGetOffset_readableInstantNull() {
        assertEquals(0, DateTimeZone.UTC.getOffset((ReadableInstant) null));
    }

    @Test
    public void testGetOffset_readableInstantNonNull() {
        assertEquals(0, DateTimeZone.UTC.getOffset(new Instant(0L)));
    }

    // ======================================================================
    // isStandardOffset
    // ======================================================================

    @Test
    public void testIsStandardOffset_fixedZone_alwaysTrue() {
        assertTrue(DateTimeZone.UTC.isStandardOffset(0L));
    }

    // ======================================================================
    // convertUTCToLocal / convertLocalToUTC
    // ======================================================================

    @Test
    public void testConvertUTCToLocal_zeroOffset() {
        assertEquals(0L, DateTimeZone.UTC.convertUTCToLocal(0L));
    }

    @Test
    public void testConvertUTCToLocal_positiveOffset_noOverflow() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        assertEquals(1000L + 5 * 3600000L, zone.convertUTCToLocal(1000L));
    }

    @Test(expected = ArithmeticException.class)
    public void testConvertUTCToLocal_overflow_throws() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        zone.convertUTCToLocal(Long.MAX_VALUE);
    }

    @Test
    public void testConvertLocalToUTC_fixedZone_noException() {
        assertEquals(0L, DateTimeZone.UTC.convertLocalToUTC(0L, true));
    }

    @Test(expected = ArithmeticException.class)
    public void testConvertLocalToUTC_overflow_throws() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        zone.convertLocalToUTC(Long.MIN_VALUE, false);
    }

    @Test
    public void testConvertLocalToUTC_withOriginalInstant_sameOffset() {
        long result = DateTimeZone.UTC.convertLocalToUTC(0L, false, 0L);
        assertEquals(0L, result);
    }

    @Test
    public void testConvertLocalToUTC_withOriginalInstant_differentOffset_fallsBackToTwoArg() {
        // America/Los_Angeles: ปรับ originalInstantUTC ให้ offset ต่างจากที่คำนวณใหม่
        DateTimeZone laZone = DateTimeZone.forID("America/Los_Angeles");
        LocalDateTime ldt = new LocalDateTime(2007, 7, 1, 12, 0, 0, 0); // DST period
        long instantLocal = ldt.toDateTime(DateTimeZone.UTC).getMillis();
        long originalInstantUTC = 0L; // winter, standard time (different offset)
        long result = laZone.convertLocalToUTC(instantLocal, false, originalInstantUTC);
        long expected = laZone.convertLocalToUTC(instantLocal, false);
        assertEquals(expected, result);
    }

    // ======================================================================
    // getMillisKeepLocal
    // ======================================================================

    @Test
    public void testGetMillisKeepLocal_sameZoneReference_returnsSameInstant() {
        long result = DateTimeZone.UTC.getMillisKeepLocal(DateTimeZone.UTC, 12345L);
        assertEquals(12345L, result);
    }

    @Test
    public void testGetMillisKeepLocal_nullNewZone_usesDefault() {
        DateTimeZone.setDefault(DateTimeZone.UTC);
        long result = DateTimeZone.UTC.getMillisKeepLocal(null, 12345L);
        assertEquals(12345L, result);
    }

    @Test
    public void testGetMillisKeepLocal_differentZone() {
        // NOTE: อ้างอิงกติกา timezone มาตรฐานของ America/Los_Angeles ม.ค. 1970 = UTC-8 (ไม่มี DST)
        DateTimeZone laZone = DateTimeZone.forID("America/Los_Angeles");
        long result = DateTimeZone.UTC.getMillisKeepLocal(laZone, 0L);
        assertEquals(28800000L, result);
    }

    // ======================================================================
    // isLocalDateTimeGap
    // ======================================================================

    @Test
    public void testIsLocalDateTimeGap_fixedZone_alwaysFalse() {
        LocalDateTime ldt = new LocalDateTime(2000, 1, 1, 0, 0, 0, 0);
        assertFalse(DateTimeZone.UTC.isLocalDateTimeGap(ldt));
    }

    @Test
    public void testIsLocalDateTimeGap_nonFixedZone_inGap_returnsTrue() {
        // 2007-03-11 02:00-03:00 local ไม่มีอยู่จริงใน America/Los_Angeles (spring-forward gap)
        DateTimeZone laZone = DateTimeZone.forID("America/Los_Angeles");
        LocalDateTime ldt = new LocalDateTime(2007, 3, 11, 2, 30, 0, 0);
        assertTrue(laZone.isLocalDateTimeGap(ldt));
    }

    @Test
    public void testIsLocalDateTimeGap_nonFixedZone_notInGap_returnsFalse() {
        DateTimeZone laZone = DateTimeZone.forID("America/Los_Angeles");
        LocalDateTime ldt = new LocalDateTime(2007, 3, 11, 1, 30, 0, 0);
        assertFalse(laZone.isLocalDateTimeGap(ldt));
    }

    // ======================================================================
    // adjustOffset
    // ======================================================================

    @Test
    public void testAdjustOffset_fixedZone_sameInstant() {
        assertEquals(0L, DateTimeZone.UTC.adjustOffset(0L, false));
    }

    @Test
    public void testAdjustOffset_nonFixedZone_aroundRealTransition() {
        DateTimeZone laZone = DateTimeZone.forID("America/Los_Angeles");
        long t = laZone.nextTransition(0L);
        long earlier = laZone.adjustOffset(t, false);
        long later = laZone.adjustOffset(t, true);
        assertTrue(earlier <= later);
    }

    // ======================================================================
    // getOffsetFromLocal / convertLocalToUTC near DST boundary (Time-19 context)
    // ======================================================================

    @Test
    public void testGetOffsetFromLocal_inSpringForwardGap_usesOffsetAfterGap() {
        // America/Los_Angeles 2007: gap 02:00-03:00, offset ก่อน=-8h หลัง=-7h
        DateTimeZone laZone = DateTimeZone.forID("America/Los_Angeles");
        LocalDateTime ldt = new LocalDateTime(2007, 3, 11, 2, 30, 0, 0);
        long instantLocal = ldt.toDateTime(DateTimeZone.UTC).getMillis();
        int offset = laZone.getOffsetFromLocal(instantLocal);
        assertEquals(-25200000, offset); // -7h (DST)
    }

    @Test
    public void testGetOffsetFromLocal_duringFallBackOverlap_favoursDaylight() {
        // America/Los_Angeles 2007: overlap 01:00-02:00, favour daylight (-7h) ตาม javadoc
        DateTimeZone laZone = DateTimeZone.forID("America/Los_Angeles");
        LocalDateTime ldt = new LocalDateTime(2007, 11, 4, 1, 30, 0, 0);
        long instantLocal = ldt.toDateTime(DateTimeZone.UTC).getMillis();
        int offset = laZone.getOffsetFromLocal(instantLocal);
        assertEquals(-25200000, offset);
    }

    @Test
    public void testGetOffsetFromLocal_positiveOffsetZone_normalCase() {
        // ครอบคลุมสาขา (offsetLocal > 0) โดยไม่ hardcode ค่าผลลัพธ์ที่ขึ้นกับ transition ภายใน
        DateTimeZone parisZone = DateTimeZone.forID("Europe/Paris");
        LocalDateTime ldt = new LocalDateTime(2007, 7, 15, 12, 0, 0, 0);
        long instantLocal = ldt.toDateTime(DateTimeZone.UTC).getMillis();
        int offsetLocal = parisZone.getOffset(instantLocal);
        long instantAdjusted = instantLocal - offsetLocal;
        int expectedOffset = parisZone.getOffset(instantAdjusted);
        int actualOffset = parisZone.getOffsetFromLocal(instantLocal);
        assertEquals(expectedOffset, actualOffset);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertLocalToUTC_strict_inGap_throws() {
        DateTimeZone laZone = DateTimeZone.forID("America/Los_Angeles");
        LocalDateTime ldt = new LocalDateTime(2007, 3, 11, 2, 30, 0, 0);
        long instantLocal = ldt.toDateTime(DateTimeZone.UTC).getMillis();
        laZone.convertLocalToUTC(instantLocal, true);
    }

    @Test
    public void testConvertLocalToUTC_nonStrict_inGap_doesNotThrow() {
        DateTimeZone laZone = DateTimeZone.forID("America/Los_Angeles");
        LocalDateTime ldt = new LocalDateTime(2007, 3, 11, 2, 30, 0, 0);
        long instantLocal = ldt.toDateTime(DateTimeZone.UTC).getMillis();
        // ต้องไม่ throw (ครอบคลุมสาขา strict=false ใน DST gap -> ใช้ offsetLocal)
        laZone.convertLocalToUTC(instantLocal, false);
    }

    // ======================================================================
    // equals / hashCode / toString / toTimeZone
    // ======================================================================

    @Test
    public void testEquals_sameInstance_true() {
        assertTrue(DateTimeZone.UTC.equals(DateTimeZone.UTC));
    }

    @Test
    public void testEquals_differentZones_false() {
        DateTimeZone laZone = DateTimeZone.forID("America/Los_Angeles");
        assertFalse(DateTimeZone.UTC.equals(laZone));
    }

    @Test
    public void testHashCode_consistentForEqualZones() {
        DateTimeZone z1 = DateTimeZone.forID("UTC");
        DateTimeZone z2 = DateTimeZone.forID("UTC");
        assertEquals(z1.hashCode(), z2.hashCode());
    }

    @Test
    public void testToString_returnsId() {
        assertEquals("UTC", DateTimeZone.UTC.toString());
    }

    @Test
    public void testToTimeZone_notNull() {
        TimeZone tz = DateTimeZone.UTC.toTimeZone();
        assertNotNull(tz);
        assertEquals("UTC", tz.getID());
    }

    // ======================================================================
    // Serialization (writeReplace / Stub.readResolve)
    // ======================================================================

    @Test
    public void testSerialization_roundTrip_preservesId() throws Exception {
        DateTimeZone original = DateTimeZone.forID("America/Los_Angeles");
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        java.io.ObjectInputStream ois =
                new java.io.ObjectInputStream(new java.io.ByteArrayInputStream(baos.toByteArray()));
        DateTimeZone result = (DateTimeZone) ois.readObject();
        ois.close();

        assertEquals(original.getID(), result.getID());
    }
}
```

## สรุป Branch/Condition Coverage

| กลุ่มเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testForID_*` | `id==null`, `id.equals("UTC")`, provider-resolved, `startsWith("+"/"-")`, `offset==0`, cache hit/miss, invalid id → throw, empty string → throw, malformed offset → throw |
| `testForOffsetHours_*` | `hoursOffset==0`, positive, negative, overflow → `IllegalArgumentException` |
| `testForOffsetHoursMinutes_*` | both-zero, `minutesOffset<0`, `minutesOffset>59`, boundary 0/59, `hoursInMinutes<0` true/false, overflow |
| `testForOffsetMillis_*` | offset 0, positive, negative, seconds-remainder≠0, millis-remainder≠0 (printOffset loop ทุก branch) |
| `testForTimeZone_*` | `zone==null`, `id.equals("UTC")`, `convId!=null`, `dtz!=null` (map+provider), GMT+/- parse (`offset==0` / ≠0, +/-), unresolved → throw |
| `testSetProvider_*` / `testSetNameProvider_*` | provider null→default, ids null/empty, ids ไม่มี UTC, UTC zone ไม่ valid |
| `testSetDefault_*` / `testGetDefault*` | `zone==null` → throw, set/get ปกติ, lazy-init ใน `getDefault()` |
| `testGetShortName_*` / `testGetName_*` | locale null → default, มี locale |
| `testGetOffset_readableInstant*` | `instant==null`, `instant!=null` |
| `testConvertUTCToLocal_*` / `testConvertLocalToUTC_*` | offset ปกติ, overflow → `ArithmeticException`, 3-arg เมธอด (`offset` เท่ากัน/ไม่เท่ากัน) |
| `testGetMillisKeepLocal_*` | `newZone==null`, `newZone==this`, `newZone!=this` |
| `testIsLocalDateTimeGap_*` | `isFixed()==true` (คืน false ทันที), non-fixed + gap (`catch IllegalArgumentException`→true), non-fixed + ไม่ gap (→false) |
| `testAdjustOffset_*` | `before==after` (fixed zone), non-fixed zone รอบ transition จริง |
| `testGetOffsetFromLocal_*` / `testConvertLocalToUTC_strict/nonStrict_inGap` | DST gap (`offsetLocal!=offsetAdjusted`, `(offsetLocal-offsetAdjusted)<0`), DST overlap (favour daylight), `offsetLocal>0` branch, strict vs non-strict throw/no-throw |
| `testEquals_*` / `testHashCode_*` / `testToString_*` / `testToTimeZone_*` | ความสอดคล้องของ `equals`/`hashCode`/`toString`/`toTimeZone` |
| `testSerialization_roundTrip_*` | `writeReplace()` → `Stub` → `readResolve()` → `forID()` |

**หมายเหตุ (ตามข้อกำหนด #4):**
- Branch `offsetLocal > 0` ใน `getOffsetFromLocal` บางเงื่อนไขย่อย (กรณี `instantAdjusted - prev <= diff` เป็น true) ไม่ได้ทดสอบตรง ๆ เพราะต้องพึ่งพารายละเอียด transition data ภายในที่ไม่ได้ระบุไว้ในซอร์ส จึงทดสอบเฉพาะ sanity-check ของผลลัพธ์แทนการ hardcode ค่า
- การทดสอบ `forID("+abc")` คาดหวัง `IllegalArgumentException` ตามพฤติกรรมมาตรฐานของ parser ใน joda-time แต่ไม่ได้ยืนยัน exact exception message