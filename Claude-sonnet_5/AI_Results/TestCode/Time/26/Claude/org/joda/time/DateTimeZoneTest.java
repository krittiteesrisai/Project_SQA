package org.joda.time;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DateTimeZoneTest {

    // ---------------------------------------------------------------
    // Fixtures เพื่อ backup/restore static state ของ DateTimeZone
    // ---------------------------------------------------------------
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

    // ---------------------------------------------------------------
    // Helper: Concrete subclass ของ abstract DateTimeZone
    // เพื่อควบคุม getOffset/getStandardOffset/isFixed/nextTransition/
    // previousTransition/getNameKey/equals ได้เอง (ไม่พึ่ง tz data จริง)
    // ---------------------------------------------------------------
    private static class TestZone extends DateTimeZone {
        private final int standardOffset;
        private final int dstOffset;
        private final long transitionInstant;
        private final boolean fixed;
        private final String nameKey;

        TestZone(String id, int standardOffset, int dstOffset,
                 long transitionInstant, boolean fixed, String nameKey) {
            super(id);
            this.standardOffset = standardOffset;
            this.dstOffset = dstOffset;
            this.transitionInstant = transitionInstant;
            this.fixed = fixed;
            this.nameKey = nameKey;
        }

        @Override
        public String getNameKey(long instant) {
            return nameKey;
        }

        @Override
        public int getOffset(long instant) {
            return instant < transitionInstant ? standardOffset : dstOffset;
        }

        @Override
        public int getStandardOffset(long instant) {
            return standardOffset;
        }

        @Override
        public boolean isFixed() {
            return fixed;
        }

        @Override
        public long nextTransition(long instant) {
            return instant < transitionInstant ? transitionInstant : instant;
        }

        @Override
        public long previousTransition(long instant) {
            return instant >= transitionInstant ? transitionInstant - 1 : instant;
        }

        @Override
        public boolean equals(Object object) {
            return object instanceof TestZone
                    && ((TestZone) object).getID().equals(getID());
        }
    }

    // =================================================================
    // forID(String)
    // =================================================================

    @Test
    public void testForID_null_returnsDefault() {
        assertEquals(DateTimeZone.getDefault(), DateTimeZone.forID(null));
    }

    @Test
    public void testForID_UTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
    }

    @Test
    public void testForID_validProviderZone() {
        // ขึ้นกับว่า tz-data มี America/Los_Angeles อยู่ใน classpath จริง
        DateTimeZone zone = DateTimeZone.forID("America/Los_Angeles");
        assertEquals("America/Los_Angeles", zone.getID());
    }

    @Test
    public void testForID_plusZeroOffset_returnsUTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("+00:00"));
    }

    @Test
    public void testForID_minusZeroOffset_returnsUTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("-00:00"));
    }

    @Test
    public void testForID_positiveOffset_fixedZone() {
        DateTimeZone zone = DateTimeZone.forID("+02:00");
        assertEquals("+02:00", zone.getID());
        assertEquals(2 * 60 * 60 * 1000, zone.getOffset(0L));
    }

    @Test
    public void testForID_negativeOffset_fixedZone() {
        DateTimeZone zone = DateTimeZone.forID("-02:30");
        assertEquals("-02:30", zone.getID());
        assertEquals(-(2 * 60 + 30) * 60 * 1000, zone.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_invalidId_throws() {
        DateTimeZone.forID("Not/AValidZone_XYZ");
    }

    // =================================================================
    // forOffsetHours / forOffsetHoursMinutes
    // =================================================================

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

    @Test
    public void testForOffsetHoursMinutes_zeroZero_returnsUTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHoursMinutes(0, 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_negativeMinutes_throws() {
        DateTimeZone.forOffsetHoursMinutes(1, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_minutesTooLarge_throws() {
        DateTimeZone.forOffsetHoursMinutes(1, 60);
    }

    @Test
    public void testForOffsetHoursMinutes_positiveHours() {
        assertEquals("+02:30", DateTimeZone.forOffsetHoursMinutes(2, 30).getID());
    }

    @Test
    public void testForOffsetHoursMinutes_negativeHours() {
        // ตาม javadoc: (-2, 30) -> "-02:30"
        assertEquals("-02:30", DateTimeZone.forOffsetHoursMinutes(-2, 30).getID());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_overflow_throws() {
        DateTimeZone.forOffsetHoursMinutes(Integer.MAX_VALUE, 30);
    }

    // =================================================================
    // forOffsetMillis(int)  -> ครอบ printOffset ทุก branch
    // =================================================================

    @Test
    public void testForOffsetMillis_zero_returnsUTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0));
    }

    @Test
    public void testForOffsetMillis_positive_hoursMinutesOnly() {
        assertEquals("+01:00", DateTimeZone.forOffsetMillis(3600000).getID());
    }

    @Test
    public void testForOffsetMillis_negative_hoursMinutesOnly() {
        assertEquals("-01:00", DateTimeZone.forOffsetMillis(-3600000).getID());
    }

    @Test
    public void testForOffsetMillis_withSecondsPart() {
        // 1h + 1s = 3601000ms -> "+01:00:01"
        assertEquals("+01:00:01", DateTimeZone.forOffsetMillis(3601000).getID());
    }

    @Test
    public void testForOffsetMillis_withMillisPart() {
        // 1h + 1s + 1ms -> "+01:00:01.001"
        assertEquals("+01:00:01.001", DateTimeZone.forOffsetMillis(3601001).getID());
    }

    // =================================================================
    // forTimeZone(TimeZone)
    // =================================================================

    @Test
    public void testForTimeZone_null_returnsDefault() {
        assertEquals(DateTimeZone.getDefault(), DateTimeZone.forTimeZone(null));
    }

    @Test
    public void testForTimeZone_UTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void testForTimeZone_oldAlias_GMT_convertedToUTC() {
        DateTimeZone zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT"));
        assertEquals("UTC", zone.getID());
    }

    @Test
    public void testForTimeZone_validLongId() {
        DateTimeZone zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        assertEquals("America/Los_Angeles", zone.getID());
    }

    @Test
    public void testForTimeZone_gmtPositiveOffsetDisplayName_fixedZone() {
        // บังคับ getDisplayName() ให้ deterministic ไม่พึ่ง JDK format
        TimeZone custom = new SimpleTimeZone(0, "CUSTOM_NOT_IN_PROVIDER") {
            @Override
            public String getDisplayName() {
                return "GMT+02:00";
            }
        };
        DateTimeZone zone = DateTimeZone.forTimeZone(custom);
        assertEquals("+02:00", zone.getID());
    }

    @Test
    public void testForTimeZone_gmtZeroOffsetDisplayName_returnsUTC() {
        TimeZone custom = new SimpleTimeZone(0, "CUSTOM_ZERO_NOT_IN_PROVIDER") {
            @Override
            public String getDisplayName() {
                return "GMT+00:00";
            }
        };
        assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(custom));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForTimeZone_unrecognized_throws() {
        TimeZone fake = new SimpleTimeZone(0, "FAKE_ZONE_NOT_RECOGNIZED") {
            @Override
            public String getDisplayName() {
                return "NotGMTFormat";
            }
        };
        DateTimeZone.forTimeZone(fake);
    }

    // =================================================================
    // getAvailableIDs()
    // =================================================================

    @Test
    public void testGetAvailableIDs_containsUTC() {
        Set<String> ids = DateTimeZone.getAvailableIDs();
        assertNotNull(ids);
        assertTrue(ids.contains("UTC"));
    }

    // =================================================================
    // getProvider() / setProvider(Provider)
    // =================================================================

    @Test
    public void testGetProvider_notNull() {
        assertNotNull(DateTimeZone.getProvider());
    }

    @Test
    public void testSetProvider_null_resetsToDefault() {
        DateTimeZone.setProvider(null);
        assertNotNull(DateTimeZone.getProvider());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_emptyIds_throws() {
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String id) { return null; }
            public Set<String> getAvailableIDs() { return new HashSet<String>(); }
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_missingUTC_throws() {
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String id) { return null; }
            public Set<String> getAvailableIDs() {
                Set<String> s = new HashSet<String>();
                s.add("Some/Zone");
                return s;
            }
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_invalidUTCZone_throws() {
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String id) {
                if ("UTC".equals(id)) {
                    return DateTimeZone.forOffsetHours(1); // ไม่เท่ากับ UTC จริง
                }
                return null;
            }
            public Set<String> getAvailableIDs() {
                Set<String> s = new HashSet<String>();
                s.add("UTC");
                return s;
            }
        });
    }

    @Test
    public void testSetProvider_valid() {
        final DateTimeZone utcZone = DateTimeZone.UTC;
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String id) {
                return "UTC".equals(id) ? utcZone : null;
            }
            public Set<String> getAvailableIDs() {
                Set<String> s = new HashSet<String>();
                s.add("UTC");
                return s;
            }
        });
        assertTrue(DateTimeZone.getAvailableIDs().contains("UTC"));
    }

    // =================================================================
    // getNameProvider() / setNameProvider(NameProvider)
    // =================================================================

    @Test
    public void testGetNameProvider_notNull() {
        assertNotNull(DateTimeZone.getNameProvider());
    }

    @Test
    public void testSetNameProvider_null_resetsToDefault() {
        DateTimeZone.setNameProvider(null);
        assertNotNull(DateTimeZone.getNameProvider());
    }

    @Test
    public void testSetNameProvider_custom() {
        NameProvider custom = new NameProvider() {
            public String getShortName(Locale locale, String id, String nameKey) { return "SHORT"; }
            public String getName(Locale locale, String id, String nameKey) { return "LONG"; }
        };
        DateTimeZone.setNameProvider(custom);
        assertSame(custom, DateTimeZone.getNameProvider());
    }

    // =================================================================
    // setDefault(DateTimeZone)
    // =================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testSetDefault_null_throws() {
        DateTimeZone.setDefault(null);
    }

    @Test
    public void testSetDefault_valid() {
        DateTimeZone.setDefault(DateTimeZone.UTC);
        assertEquals(DateTimeZone.UTC, DateTimeZone.getDefault());
    }

    // =================================================================
    // getID()
    // =================================================================

    @Test
    public void testGetID() {
        assertEquals("UTC", DateTimeZone.UTC.getID());
    }

    // =================================================================
    // getShortName(long) / getShortName(long, Locale)
    // =================================================================

    @Test
    public void testGetShortName_nameKeyNull_returnsID() {
        TestZone zone = new TestZone("TestZoneNullKey", 0, 0, Long.MAX_VALUE, true, null);
        assertEquals("TestZoneNullKey", zone.getShortName(0L));
    }

    @Test
    public void testGetShortName_withLocale_customNameProvider() {
        DateTimeZone.setNameProvider(new NameProvider() {
            public String getShortName(Locale locale, String id, String nameKey) { return "SN"; }
            public String getName(Locale locale, String id, String nameKey) { return "LN"; }
        });
        TestZone zone = new TestZone("TZ1", 0, 0, Long.MAX_VALUE, true, "KEY");
        assertEquals("SN", zone.getShortName(0L, Locale.US));
    }

    @Test
    public void testGetShortName_nullLocale_usesDefault() {
        DateTimeZone.setNameProvider(new NameProvider() {
            public String getShortName(Locale locale, String id, String nameKey) { return "SN2"; }
            public String getName(Locale locale, String id, String nameKey) { return "LN2"; }
        });
        TestZone zone = new TestZone("TZ2", 0, 0, Long.MAX_VALUE, true, "KEY");
        assertEquals("SN2", zone.getShortName(0L, null));
    }

    @Test
    public void testGetShortName_providerReturnsNull_fallbackToOffset() {
        DateTimeZone.setNameProvider(new NameProvider() {
            public String getShortName(Locale locale, String id, String nameKey) { return null; }
            public String getName(Locale locale, String id, String nameKey) { return null; }
        });
        TestZone zone = new TestZone("TZ3", 3600000, 3600000, Long.MAX_VALUE, true, "KEY");
        assertEquals("+01:00", zone.getShortName(0L));
    }

    // =================================================================
    // getName(long) / getName(long, Locale)
    // =================================================================

    @Test
    public void testGetName_nameKeyNull_returnsID() {
        TestZone zone = new TestZone("TZNameNull", 0, 0, Long.MAX_VALUE, true, null);
        assertEquals("TZNameNull", zone.getName(0L));
    }

    @Test
    public void testGetName_withCustomProvider() {
        DateTimeZone.setNameProvider(new NameProvider() {
            public String getShortName(Locale locale, String id, String nameKey) { return "SN"; }
            public String getName(Locale locale, String id, String nameKey) { return "FULLNAME"; }
        });
        TestZone zone = new TestZone("TZ4", 0, 0, Long.MAX_VALUE, true, "KEY");
        assertEquals("FULLNAME", zone.getName(0L, Locale.US));
    }

    @Test
    public void testGetName_nullLocale_usesDefault() {
        DateTimeZone.setNameProvider(new NameProvider() {
            public String getShortName(Locale locale, String id, String nameKey) { return "SN"; }
            public String getName(Locale locale, String id, String nameKey) { return "FULLNAME2"; }
        });
        TestZone zone = new TestZone("TZ5", 0, 0, Long.MAX_VALUE, true, "KEY");
        assertEquals("FULLNAME2", zone.getName(0L, null));
    }

    @Test
    public void testGetName_providerReturnsNull_fallbackToOffset() {
        DateTimeZone.setNameProvider(new NameProvider() {
            public String getShortName(Locale locale, String id, String nameKey) { return null; }
            public String getName(Locale locale, String id, String nameKey) { return null; }
        });
        TestZone zone = new TestZone("TZ6", -3600000, -3600000, Long.MAX_VALUE, true, "KEY");
        assertEquals("-01:00", zone.getName(0L));
    }

    // =================================================================
    // getOffset(ReadableInstant)
    // =================================================================

    @Test
    public void testGetOffsetInstant_null_usesCurrentTime() {
        // UTC offset = 0 เสมอ ไม่ขึ้นกับเวลาปัจจุบัน จึง assert ได้แน่นอน
        assertEquals(0, DateTimeZone.UTC.getOffset((ReadableInstant) null));
    }

    @Test
    public void testGetOffsetInstant_nonNull() {
        TestZone zone = new TestZone("TZ7", 3600000, 3600000, Long.MAX_VALUE, true, "KEY");
        assertEquals(3600000, zone.getOffset(new Instant(0L)));
    }

    // =================================================================
    // isStandardOffset(long)
    // =================================================================

    @Test
    public void testIsStandardOffset_true() {
        TestZone zone = new TestZone("TZ8", 0, 3600000, 1000000L, false, "KEY");
        assertTrue(zone.isStandardOffset(0L));
    }

    @Test
    public void testIsStandardOffset_false() {
        TestZone zone = new TestZone("TZ9", 0, 3600000, 1000000L, false, "KEY");
        assertFalse(zone.isStandardOffset(2000000L));
    }

    // =================================================================
    // convertUTCToLocal(long)
    // =================================================================

    @Test
    public void testConvertUTCToLocal_normal() {
        TestZone zone = new TestZone("TZ10", 3600000, 3600000, Long.MAX_VALUE, true, "KEY");
        assertEquals(3600000L, zone.convertUTCToLocal(0L));
    }

    @Test(expected = ArithmeticException.class)
    public void testConvertUTCToLocal_overflow() {
        TestZone zone = new TestZone("TZ11", 1, 1, Long.MAX_VALUE, true, "KEY");
        zone.convertUTCToLocal(Long.MAX_VALUE);
    }

    // =================================================================
    // convertLocalToUTC(long, boolean)
    // =================================================================

    @Test(expected = ArithmeticException.class)
    public void testConvertLocalToUTC_overflow() {
        TestZone zone = new TestZone("TZ_Overflow", Integer.MIN_VALUE, Integer.MIN_VALUE,
                Long.MAX_VALUE, true, "KEY");
        zone.convertLocalToUTC(Long.MAX_VALUE, false);
    }

    @Test
    public void testConvertLocalToUTC_strictGap_throws_realZone() {
        DateTimeZone laZone = DateTimeZone.forID("America/Los_Angeles");
        // 2007-03-11 02:30 ไม่มีอยู่จริงที่ LA เพราะ DST เปลี่ยนจาก 02:00 เป็น 03:00
        LocalDateTime gapTime = new LocalDateTime(2007, 3, 11, 2, 30, 0);
        long instantLocal = gapTime.toDateTime(DateTimeZone.UTC).getMillis();
        try {
            laZone.convertLocalToUTC(instantLocal, true);
            fail("ควร throw IllegalArgumentException เพราะอยู่ใน DST gap และ strict=true");
        } catch (IllegalArgumentException expected) {
            // ok
        }
    }

    @Test
    public void testConvertLocalToUTC_nonStrictGap_noThrow_realZone() {
        DateTimeZone laZone = DateTimeZone.forID("America/Los_Angeles");
        LocalDateTime gapTime = new LocalDateTime(2007, 3, 11, 2, 30, 0);
        long instantLocal = gapTime.toDateTime(DateTimeZone.UTC).getMillis();
        // strict=false ไม่ควร throw
        laZone.convertLocalToUTC(instantLocal, false);
    }

    @Test
    public void testConvertLocalToUTC_normalNoDstBoundary() {
        TestZone zone = new TestZone("TZ_Normal", 3600000, 3600000, Long.MAX_VALUE, true, "KEY");
        assertEquals(-3600000L, zone.convertLocalToUTC(0L, true));
    }

    // =================================================================
    // getOffsetFromLocal(long)
    // =================================================================

    @Test
    public void testGetOffsetFromLocal_noTransition() {
        TestZone zone = new TestZone("TZ_NoTrans", 3600000, 3600000, Long.MAX_VALUE, true, "KEY");
        assertEquals(3600000, zone.getOffsetFromLocal(1000000L));
    }

    @Test
    public void testGetOffsetFromLocal_positiveDiff_skipsNextTransitionCheck() {
        // standard=0, dst=+1h, transition ที่ T -> จำลอง spring-forward gap
        long transition = 10_000_000L;
        TestZone zone = new TestZone("TZ_Gap", 0, 3600000, transition, false, "KEY");
        long instantLocal = transition + 1_800_000L; // อยู่กลาง gap
        // offsetLocal=3600000(dst), offsetAdjusted=0(std) -> diff=3600000 (>=0) -> return offsetAdjusted
        assertEquals(0, zone.getOffsetFromLocal(instantLocal));
    }

    @Test
    public void testGetOffsetFromLocal_springForwardGap_realZone() {
        DateTimeZone laZone = DateTimeZone.forID("America/Los_Angeles");
        LocalDateTime gapTime = new LocalDateTime(2007, 3, 11, 2, 30, 0);
        DateTime dt = gapTime.toDateTime(laZone);
        // เวลา 02:xx ไม่มีอยู่จริงที่ LA วันนี้ ผลลัพธ์ต้องไม่ใช่ hour=2
        assertNotEquals(2, dt.getHourOfDay());
    }

    // =================================================================
    // getMillisKeepLocal(DateTimeZone, long)
    // =================================================================

    @Test
    public void testGetMillisKeepLocal_sameZoneReference() {
        TestZone zone = new TestZone("TZ12", 3600000, 3600000, Long.MAX_VALUE, true, "KEY");
        assertEquals(12345L, zone.getMillisKeepLocal(zone, 12345L));
    }

    @Test
    public void testGetMillisKeepLocal_nullNewZone_usesDefault() {
        DateTimeZone.setDefault(DateTimeZone.UTC);
        TestZone zone = new TestZone("TZ13", 3600000, 3600000, Long.MAX_VALUE, true, "KEY");
        assertEquals(3600000L, zone.getMillisKeepLocal(null, 0L));
    }

    @Test
    public void testGetMillisKeepLocal_differentZone() {
        TestZone zoneA = new TestZone("TZA", 3600000, 3600000, Long.MAX_VALUE, true, "KEYA");
        TestZone zoneB = new TestZone("TZB", 7200000, 7200000, Long.MAX_VALUE, true, "KEYB");
        assertEquals(-3600000L, zoneA.getMillisKeepLocal(zoneB, 0L));
    }

    // =================================================================
    // isLocalDateTimeGap(LocalDateTime)
    // =================================================================

    @Test
    public void testIsLocalDateTimeGap_fixedZone_alwaysFalse() {
        TestZone zone = new TestZone("TZFixed", 0, 0, Long.MAX_VALUE, true, "KEY");
        assertFalse(zone.isLocalDateTimeGap(new LocalDateTime(2000, 1, 1, 0, 0)));
    }

    @Test
    public void testIsLocalDateTimeGap_notFixed_noGap() {
        TestZone zone = new TestZone("TZNoGap", 0, 0, Long.MAX_VALUE, false, "KEY");
        assertFalse(zone.isLocalDateTimeGap(new LocalDateTime(2000, 1, 1, 0, 0)));
    }

    @Test
    public void testIsLocalDateTimeGap_realZone_gapExists() {
        DateTimeZone laZone = DateTimeZone.forID("America/Los_Angeles");
        LocalDateTime gapTime = new LocalDateTime(2007, 3, 11, 2, 30, 0);
        assertTrue(laZone.isLocalDateTimeGap(gapTime));
    }

    @Test
    public void testIsLocalDateTimeGap_realZone_noGap() {
        DateTimeZone laZone = DateTimeZone.forID("America/Los_Angeles");
        LocalDateTime normalTime = new LocalDateTime(2007, 6, 1, 12, 0, 0);
        assertFalse(laZone.isLocalDateTimeGap(normalTime));
    }

    // =================================================================
    // toTimeZone() / hashCode() / toString() / equals()
    // =================================================================

    @Test
    public void testToTimeZone() {
        TimeZone tz = DateTimeZone.UTC.toTimeZone();
        assertEquals("UTC", tz.getID());
    }

    @Test
    public void testHashCode() {
        assertEquals(57 + "UTC".hashCode(), DateTimeZone.UTC.hashCode());
    }

    @Test
    public void testToString() {
        assertEquals("UTC", DateTimeZone.UTC.toString());
    }

    @Test
    public void testEquals_customZone_sameId_true() {
        TestZone a = new TestZone("SAME", 0, 0, Long.MAX_VALUE, true, "KEY");
        TestZone b = new TestZone("SAME", 0, 0, Long.MAX_VALUE, true, "KEY");
        assertTrue(a.equals(b));
    }

    @Test
    public void testEquals_customZone_differentId_false() {
        TestZone a = new TestZone("A1", 0, 0, Long.MAX_VALUE, true, "KEY");
        TestZone b = new TestZone("B1", 0, 0, Long.MAX_VALUE, true, "KEY");
        assertFalse(a.equals(b));
    }
}
