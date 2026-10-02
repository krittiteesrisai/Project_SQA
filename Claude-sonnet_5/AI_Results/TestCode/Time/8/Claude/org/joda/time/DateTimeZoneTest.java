package org.joda.time;

import static org.junit.Assert.*;

import org.junit.Test;

import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.IllegalInstantException;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;

public class DateTimeZoneTest {

    //=====================================================================
    // Test double: ควบคุม abstract methods เพื่อ drive branch ได้แม่นยำ
    //=====================================================================
    private static class BaseTestZone extends DateTimeZone {
        BaseTestZone(String id) { super(id); }
        public String getNameKey(long instant) { return null; }
        public int getStandardOffset(long instant) { return 0; }
        public boolean isFixed() { return false; }
        public long nextTransition(long instant) { return instant; }
        public long previousTransition(long instant) { return instant; }
        public int getOffset(long instant) { return 0; }
        public boolean equals(Object obj) { return obj == this; }
    }

    private DateTimeZone buildAdjustOffsetZone(final long tr, final int high, final int low) {
        return new BaseTestZone("Adjust") {
            public int getOffset(long instant) { return instant < tr ? high : low; }
            public long nextTransition(long instant) { return instant < tr ? tr : instant; }
        };
    }

    //=====================================================================
    // forID
    //=====================================================================
    @Test
    public void testForID_NullReturnsDefault() {
        assertNotNull(DateTimeZone.forID(null));
        assertEquals(DateTimeZone.getDefault(), DateTimeZone.forID(null));
    }

    @Test
    public void testForID_UTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
    }

    @Test
    public void testForID_ZeroOffsetReturnsUTC() {
        assertEquals(DateTimeZone.UTC, DateTimeZone.forID("+00:00"));
    }

    @Test
    public void testForID_PositiveOffset() {
        DateTimeZone zone = DateTimeZone.forID("+02:00");
        assertEquals("+02:00", zone.getID());
        assertEquals(7200000, zone.getOffset(0L));
    }

    @Test
    public void testForID_NegativeOffset() {
        DateTimeZone zone = DateTimeZone.forID("-05:30");
        assertEquals("-05:30", zone.getID());
        assertEquals(-(5 * 3600000 + 30 * 60000), zone.getOffset(0L));
    }

    @Test
    public void testForID_KnownLongZoneId() {
        // สมมติว่า provider มีข้อมูล tz 'America/New_York' (เป็นส่วนหนึ่งของไลบรารี joda-time ปกติ)
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        assertNotNull(zone);
        assertEquals("America/New_York", zone.getID());
    }

    @Test
    public void testForID_InvalidThrows() {
        try {
            DateTimeZone.forID("Not/AZone");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // ok
        }
    }

    //=====================================================================
    // forOffsetHours
    //=====================================================================
    @Test
    public void testForOffsetHours_Boundaries() {
        assertEquals(DateTimeZone.UTC, DateTimeZone.forOffsetHours(0));
        assertEquals("+23:00", DateTimeZone.forOffsetHours(23).getID());
        assertEquals("-23:00", DateTimeZone.forOffsetHours(-23).getID());
    }

    @Test
    public void testForOffsetHours_OutOfRangeThrows() {
        try {
            DateTimeZone.forOffsetHours(24);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        try {
            DateTimeZone.forOffsetHours(-24);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    //=====================================================================
    // forOffsetHoursMinutes
    //=====================================================================
    @Test
    public void testForOffsetHoursMinutes_PositiveHourPositiveMinute() {
        assertEquals("+02:15", DateTimeZone.forOffsetHoursMinutes(2, 15).getID());
    }

    @Test
    public void testForOffsetHoursMinutes_PositiveHourZeroMinute() {
        assertEquals("+02:00", DateTimeZone.forOffsetHoursMinutes(2, 0).getID());
    }

    @Test
    public void testForOffsetHoursMinutes_PositiveHourNegativeMinuteThrows() {
        // ตรงกับ Javadoc ด้วย (ควร throw) และตรงกับ code ด้วย
        try {
            DateTimeZone.forOffsetHoursMinutes(2, -15);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testForOffsetHoursMinutes_ZeroHourPositiveMinute() {
        assertEquals("+00:15", DateTimeZone.forOffsetHoursMinutes(0, 15).getID());
    }

    @Test
    public void testForOffsetHoursMinutes_ZeroZero_UTC() {
        assertEquals(DateTimeZone.UTC, DateTimeZone.forOffsetHoursMinutes(0, 0));
    }

    @Test
    public void testForOffsetHoursMinutes_NegativeHourPositiveMinute() {
        assertEquals("-02:15", DateTimeZone.forOffsetHoursMinutes(-2, 15).getID());
    }

    @Test
    public void testForOffsetHoursMinutes_NegativeHourZeroMinute() {
        assertEquals("-02:00", DateTimeZone.forOffsetHoursMinutes(-2, 0).getID());
    }

    @Test
    public void testForOffsetHoursMinutes_HourOutOfRangeThrows() {
        try {
            DateTimeZone.forOffsetHoursMinutes(24, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        try {
            DateTimeZone.forOffsetHoursMinutes(-24, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testForOffsetHoursMinutes_MinuteOutOfRangeThrows() {
        try {
            DateTimeZone.forOffsetHoursMinutes(0, 60);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    /**
     * FAULT-DETECTING TEST (Defects4J Time-8):
     * ตาม Javadoc ของ forOffsetHoursMinutes ตาราง (0,-15) ต้องได้ "-00:15" และ
     * (-2,-15) ต้องได้ "-02:15" โดยไม่ throw exception
     * แต่โค้ดจริงตรวจ `minutesOffset < 0` ก่อนพิจารณาเครื่องหมายของ hoursOffset
     * ทำให้ throw IllegalArgumentException เสมอ -> เทสนี้คาดว่าจะ FAIL บนโค้ดที่มีบั๊ก
     * (เขียนตาม contract ที่ระบุใน Javadoc ซึ่งเป็นส่วนหนึ่งของซอร์สที่ให้มา ไม่ใช่การเดา)
     */
    @Test
    public void testForOffsetHoursMinutes_KnownDefect_NegativeMinutesNonPositiveHours() {
        assertEquals("-00:15", DateTimeZone.forOffsetHoursMinutes(0, -15).getID());
        assertEquals("-02:15", DateTimeZone.forOffsetHoursMinutes(-2, -15).getID());
    }

    //=====================================================================
    // forOffsetMillis
    //=====================================================================
    @Test
    public void testForOffsetMillis_Boundaries() {
        assertEquals("+23:59:59.999", DateTimeZone.forOffsetMillis(86399999).getID());
        assertEquals("-23:59:59.999", DateTimeZone.forOffsetMillis(-86399999).getID());
    }

    @Test
    public void testForOffsetMillis_Zero_UTC() {
        assertEquals(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0));
    }

    @Test
    public void testForOffsetMillis_OutOfRangeThrows() {
        try {
            DateTimeZone.forOffsetMillis(86400000);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        try {
            DateTimeZone.forOffsetMillis(-86400000);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    //=====================================================================
    // forTimeZone
    //=====================================================================
    @Test
    public void testForTimeZone_NullReturnsDefault() {
        assertEquals(DateTimeZone.getDefault(), DateTimeZone.forTimeZone(null));
    }

    @Test
    public void testForTimeZone_UTC() {
        assertEquals(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void testForTimeZone_KnownLongId() {
        DateTimeZone zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("America/New_York"));
        assertEquals("America/New_York", zone.getID());
    }

    @Test
    public void testForTimeZone_OldAliasGMT_ReturnsUTC() {
        assertEquals(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT")));
    }

    @Test
    public void testForTimeZone_OldAliasEST_MapsToAmericaNewYork() {
        DateTimeZone result = DateTimeZone.forTimeZone(TimeZone.getTimeZone("EST"));
        assertEquals("America/New_York", result.getID());
    }

    @Test
    public void testForTimeZone_GMTPlusOffsetFormat() {
        TimeZone fake = new TimeZone() {
            public int getOffset(int era, int year, int month, int day, int dayOfWeek, int millis) { return 7200000; }
            public void setRawOffset(int offsetMillis) { }
            public int getRawOffset() { return 7200000; }
            public boolean useDaylightTime() { return false; }
            public boolean inDaylightTime(Date date) { return false; }
        };
        fake.setID("GMT+02:00");
        DateTimeZone result = DateTimeZone.forTimeZone(fake);
        assertEquals("+02:00", result.getID());
    }

    @Test
    public void testForTimeZone_UnrecognizedThrows() {
        TimeZone fake = new TimeZone() {
            public int getOffset(int era, int year, int month, int day, int dayOfWeek, int millis) { return 0; }
            public void setRawOffset(int offsetMillis) { }
            public int getRawOffset() { return 0; }
            public boolean useDaylightTime() { return false; }
            public boolean inDaylightTime(Date date) { return false; }
        };
        fake.setID("Totally/Unknown/Zone123");
        try {
            DateTimeZone.forTimeZone(fake);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    //=====================================================================
    // getDefault / setDefault
    //=====================================================================
    @Test
    public void testGetDefault_NotNull() {
        assertNotNull(DateTimeZone.getDefault());
    }

    @Test
    public void testSetDefault_NullThrows() {
        try {
            DateTimeZone.setDefault(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testSetDefault_ValidZone() {
        DateTimeZone original = DateTimeZone.getDefault();
        try {
            DateTimeZone newDefault = DateTimeZone.forOffsetHours(4);
            DateTimeZone.setDefault(newDefault);
            assertEquals(newDefault, DateTimeZone.getDefault());
        } finally {
            DateTimeZone.setDefault(original);
        }
    }

    //=====================================================================
    // getAvailableIDs / getProvider / setProvider
    //=====================================================================
    @Test
    public void testGetAvailableIDs_ContainsUTC() {
        Set<String> ids = DateTimeZone.getAvailableIDs();
        assertNotNull(ids);
        assertTrue(ids.contains("UTC"));
    }

    @Test
    public void testGetProvider_NotNull() {
        assertNotNull(DateTimeZone.getProvider());
    }

    @Test
    public void testSetProvider_NullResetsToDefault() {
        Provider original = DateTimeZone.getProvider();
        try {
            DateTimeZone.setProvider(null);
            assertNotNull(DateTimeZone.getProvider());
            assertTrue(DateTimeZone.getAvailableIDs().contains("UTC"));
        } finally {
            DateTimeZone.setProvider(original);
        }
    }

    @Test
    public void testSetProvider_EmptyIdsThrows() {
        try {
            DateTimeZone.setProvider(new Provider() {
                public Set<String> getAvailableIDs() { return new HashSet<String>(); }
                public DateTimeZone getZone(String id) { return null; }
            });
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testSetProvider_MissingUTCThrows() {
        try {
            DateTimeZone.setProvider(new Provider() {
                public Set<String> getAvailableIDs() {
                    Set<String> s = new HashSet<String>();
                    s.add("Foo/Bar");
                    return s;
                }
                public DateTimeZone getZone(String id) { return null; }
            });
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testSetProvider_InvalidUTCZoneThrows() {
        try {
            DateTimeZone.setProvider(new Provider() {
                public Set<String> getAvailableIDs() {
                    Set<String> s = new HashSet<String>();
                    s.add("UTC");
                    return s;
                }
                public DateTimeZone getZone(String id) {
                    return "UTC".equals(id) ? DateTimeZone.forOffsetHours(1) : null;
                }
            });
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    //=====================================================================
    // getNameProvider / setNameProvider
    //=====================================================================
    @Test
    public void testSetNameProvider_NullResetsToDefault() {
        NameProvider original = DateTimeZone.getNameProvider();
        try {
            DateTimeZone.setNameProvider(null);
            assertNotNull(DateTimeZone.getNameProvider());
        } finally {
            DateTimeZone.setNameProvider(original);
        }
    }

    @Test
    public void testSetNameProvider_CustomUsedInGetShortNameAndGetName() {
        NameProvider original = DateTimeZone.getNameProvider();
        try {
            DateTimeZone.setNameProvider(new NameProvider() {
                public String getName(Locale locale, String id, String nameKey) { return "LONG_" + nameKey; }
                public String getShortName(Locale locale, String id, String nameKey) { return "SHORT_" + nameKey; }
            });
            DateTimeZone zone = new BaseTestZone("Test/Zone") {
                public String getNameKey(long instant) { return "KEY"; }
            };
            assertEquals("SHORT_KEY", zone.getShortName(0L));
            assertEquals("LONG_KEY", zone.getName(0L));
        } finally {
            DateTimeZone.setNameProvider(original);
        }
    }

    @Test
    public void testGetShortNameAndGetName_NameKeyNull_ReturnsID() {
        DateTimeZone zone = new BaseTestZone("Zone/NullKey") {
            public String getNameKey(long instant) { return null; }
        };
        assertEquals("Zone/NullKey", zone.getShortName(0L));
        assertEquals("Zone/NullKey", zone.getName(0L));
    }

    @Test
    public void testGetShortNameAndGetName_NameProviderReturnsNull_FallsBackToOffsetString() {
        NameProvider original = DateTimeZone.getNameProvider();
        try {
            DateTimeZone.setNameProvider(new NameProvider() {
                public String getName(Locale locale, String id, String nameKey) { return null; }
                public String getShortName(Locale locale, String id, String nameKey) { return null; }
            });
            DateTimeZone zone = new BaseTestZone("Zone/X") {
                public String getNameKey(long instant) { return "KEY"; }
                public int getOffset(long instant) { return 3600000; }
            };
            assertEquals("+01:00", zone.getShortName(0L));
            assertEquals("+01:00", zone.getName(0L));
        } finally {
            DateTimeZone.setNameProvider(original);
        }
    }

    @Test
    public void testGetShortName_NullLocaleDoesNotThrow() {
        DateTimeZone zone = new BaseTestZone("Z") {
            public String getNameKey(long instant) { return null; }
        };
        assertNotNull(zone.getShortName(0L, null));
    }

    //=====================================================================
    // Constructor / getID / hashCode / toString / equals / isFixed / toTimeZone
    //=====================================================================
    @Test
    public void testConstructor_NullId_Throws() {
        try {
            new BaseTestZone(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testGetID() {
        DateTimeZone zone = new BaseTestZone("MyId");
        assertEquals("MyId", zone.getID());
    }

    @Test
    public void testHashCode() {
        DateTimeZone zone = new BaseTestZone("HashZone");
        assertEquals(57 + "HashZone".hashCode(), zone.hashCode());
    }

    @Test
    public void testToString() {
        DateTimeZone zone = new BaseTestZone("ToStringZone");
        assertEquals("ToStringZone", zone.toString());
    }

    @Test
    public void testEquals_Reflexive() {
        assertTrue(DateTimeZone.UTC.equals(DateTimeZone.UTC));
    }

    @Test
    public void testIsFixed_Override() {
        DateTimeZone fixedZone = new BaseTestZone("F") { public boolean isFixed() { return true; } };
        DateTimeZone nonFixedZone = new BaseTestZone("NF") { public boolean isFixed() { return false; } };
        assertTrue(fixedZone.isFixed());
        assertFalse(nonFixedZone.isFixed());
    }

    @Test
    public void testToTimeZone() {
        java.util.TimeZone tz = DateTimeZone.UTC.toTimeZone();
        assertNotNull(tz);
        assertEquals("UTC", tz.getID());
    }

    //=====================================================================
    // getOffset(ReadableInstant) / isStandardOffset
    //=====================================================================
    @Test
    public void testGetOffset_ReadableInstant_NullUsesCurrentTime() {
        DateTimeZone zone = new BaseTestZone("Const") {
            public int getOffset(long instant) { return 1234; }
        };
        assertEquals(1234, zone.getOffset((ReadableInstant) null));
    }

    @Test
    public void testGetOffset_ReadableInstant_NonNull() {
        DateTimeZone zone = new BaseTestZone("Const") {
            public int getOffset(long instant) { return 1234; }
        };
        assertEquals(1234, zone.getOffset(new Instant(500000L)));
    }

    @Test
    public void testIsStandardOffset_TrueAndFalse() {
        DateTimeZone zone = new BaseTestZone("Std") {
            public int getOffset(long instant) { return instant < 1000 ? 0 : 3600000; }
            public int getStandardOffset(long instant) { return 0; }
        };
        assertTrue(zone.isStandardOffset(0L));
        assertFalse(zone.isStandardOffset(2000L));
    }

    //=====================================================================
    // getOffsetFromLocal - ครอบคลุมทุก branch
    //=====================================================================
    @Test
    public void testGetOffsetFromLocal_NoDst_NegativeOffset_SkipElseIf() {
        DateTimeZone zone = new BaseTestZone("Neg") {
            public int getOffset(long instant) { return -3600000; }
        };
        assertEquals(-3600000, zone.getOffsetFromLocal(0L));
    }

    @Test
    public void testGetOffsetFromLocal_NoDst_PositiveOffset_PrevNotBeforeAdjusted() {
        DateTimeZone zone = new BaseTestZone("Pos") {
            public int getOffset(long instant) { return 3600000; }
            public long previousTransition(long instant) { return instant; }
        };
        assertEquals(3600000, zone.getOffsetFromLocal(0L));
    }

    @Test
    public void testGetOffsetFromLocal_PrevTransitionWithinDiff_ReturnsOffsetPrev() {
        DateTimeZone zone = new BaseTestZone("PrevRet") {
            public int getOffset(long instant) { return instant == -1000L ? 1500 : 0; }
            public long previousTransition(long instant) { return -1000L; }
        };
        assertEquals(1500, zone.getOffsetFromLocal(0L));
    }

    @Test
    public void testGetOffsetFromLocal_PrevTransitionOutsideDiff_FallThrough() {
        DateTimeZone zone = new BaseTestZone("PrevFall") {
            public int getOffset(long instant) { return instant == -1000L ? 500 : 0; }
            public long previousTransition(long instant) { return -1000L; }
        };
        assertEquals(0, zone.getOffsetFromLocal(0L));
    }

    @Test
    public void testGetOffsetFromLocal_GapDetected_ReturnsOffsetLocal() {
        DateTimeZone zone = new BaseTestZone("Gap") {
            public int getOffset(long instant) {
                if (instant == 0L) return -1000;
                if (instant == 1000L) return 2000;
                return 0;
            }
            public long nextTransition(long instant) {
                if (instant == 1000L) return 5000L;
                if (instant == -2000L) return 9999L;
                return instant;
            }
        };
        assertEquals(-1000, zone.getOffsetFromLocal(0L));
    }

    @Test
    public void testGetOffsetFromLocal_GapNotDetected_FallThrough() {
        DateTimeZone zone = new BaseTestZone("GapFall") {
            public int getOffset(long instant) {
                if (instant == 0L) return -1000;
                if (instant == 1000L) return 2000;
                return 0;
            }
            public long nextTransition(long instant) { return 5000L; }
        };
        assertEquals(2000, zone.getOffsetFromLocal(0L));
    }

    @Test
    public void testGetOffsetFromLocal_Overlap_SkipsInnerIf() {
        DateTimeZone zone = new BaseTestZone("Overlap") {
            public int getOffset(long instant) {
                if (instant == 0L) return 2000;
                if (instant == -2000L) return 500;
                return 0;
            }
        };
        assertEquals(500, zone.getOffsetFromLocal(0L));
    }

    //=====================================================================
    // convertUTCToLocal
    //=====================================================================
    @Test
    public void testConvertUTCToLocal_Normal() {
        DateTimeZone zone = new BaseTestZone("UTCtoLocal") {
            public int getOffset(long instant) { return 3600000; }
        };
        assertEquals(3600000L, zone.convertUTCToLocal(0L));
    }

    @Test
    public void testConvertUTCToLocal_Overflow_Throws() {
        DateTimeZone zone = new BaseTestZone("Overflow") {
            public int getOffset(long instant) { return 1; }
        };
        try {
            zone.convertUTCToLocal(Long.MAX_VALUE);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException expected) { }
    }

    //=====================================================================
    // convertLocalToUTC(instantLocal, strict) - 2 args
    //=====================================================================
    @Test
    public void testConvertLocalToUTC2_NoBoundary() {
        DateTimeZone zone = new BaseTestZone("NoBoundary") {
            public int getOffset(long instant) { return 3600000; }
        };
        assertEquals(-3600000L, zone.convertLocalToUTC(0L, true));
        assertEquals(-3600000L, zone.convertLocalToUTC(0L, false));
    }

    @Test
    public void testConvertLocalToUTC2_Strict_GapThrows() {
        DateTimeZone zone = new BaseTestZone("StrictGap") {
            public int getOffset(long instant) {
                if (instant == 0L) return 1000;
                if (instant == -1000L) return 2000;
                return 0;
            }
            public long nextTransition(long instant) {
                if (instant == -1000L) return 5000L;
                if (instant == -2000L) return 6000L;
                return instant;
            }
        };
        try {
            zone.convertLocalToUTC(0L, true);
            fail("Expected IllegalInstantException");
        } catch (IllegalInstantException expected) { }
    }

    @Test
    public void testConvertLocalToUTC2_Strict_NoGap_UsesAdjustedOffset() {
        DateTimeZone zone = new BaseTestZone("StrictNoGap") {
            public int getOffset(long instant) {
                if (instant == 0L) return 1000;
                if (instant == -1000L) return 2000;
                return 0;
            }
            public long nextTransition(long instant) { return 7000L; }
        };
        assertEquals(-2000L, zone.convertLocalToUTC(0L, true));
    }

    @Test
    public void testConvertLocalToUTC2_NonStrict_NegativeOffsetGap_UsesOffsetLocal() {
        DateTimeZone zone = new BaseTestZone("NonStrictNeg") {
            public int getOffset(long instant) {
                if (instant == 0L) return -1000;
                if (instant == 1000L) return -2000;
                return 0;
            }
            public long nextTransition(long instant) {
                if (instant == 1000L) return 8000L;
                if (instant == 2000L) return 9000L;
                return instant;
            }
        };
        assertEquals(1000L, zone.convertLocalToUTC(0L, false));
    }

    @Test
    public void testConvertLocalToUTC2_NonStrict_PositiveOffset_SkipsInner() {
        DateTimeZone zone = new BaseTestZone("NonStrictPos") {
            public int getOffset(long instant) {
                if (instant == 0L) return 1000;
                if (instant == -1000L) return 2000;
                return 0;
            }
        };
        assertEquals(-2000L, zone.convertLocalToUTC(0L, false));
    }

    @Test
    public void testConvertLocalToUTC2_Overflow_Throws() {
        DateTimeZone zone = new BaseTestZone("Overflow2") {
            public int getOffset(long instant) { return 1; }
        };
        try {
            zone.convertLocalToUTC(Long.MIN_VALUE, true);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException expected) { }
    }

    //=====================================================================
    // convertLocalToUTC(instantLocal, strict, originalInstantUTC) - 3 args
    //=====================================================================
    @Test
    public void testConvertLocalToUTC3_SameOffset_DirectReturn() {
        DateTimeZone zone = new BaseTestZone("Same3") {
            public int getOffset(long instant) { return 3600000; }
        };
        assertEquals(10000L - 3600000L, zone.convertLocalToUTC(10000L, true, 5000L));
    }

    @Test
    public void testConvertLocalToUTC3_DifferentOffset_Delegates() {
        DateTimeZone zone = new BaseTestZone("Delegate3") {
            public int getOffset(long instant) {
                if (instant == 5000L) return 1000;
                if (instant == 9000L) return 2000;
                if (instant == 10000L) return 2000;
                if (instant == 8000L) return 2000;
                return 0;
            }
        };
        assertEquals(8000L, zone.convertLocalToUTC(10000L, false, 5000L));
    }

    //=====================================================================
    // getMillisKeepLocal
    //=====================================================================
    @Test
    public void testGetMillisKeepLocal_NullZoneUsesDefault() {
        DateTimeZone original = DateTimeZone.getDefault();
        try {
            DateTimeZone defaultZone = DateTimeZone.forOffsetHours(3);
            DateTimeZone.setDefault(defaultZone);
            DateTimeZone zone = DateTimeZone.UTC;
            long oldInstant = 0L;
            long expected = defaultZone.convertLocalToUTC(zone.convertUTCToLocal(oldInstant), false, oldInstant);
            assertEquals(expected, zone.getMillisKeepLocal(null, oldInstant));
        } finally {
            DateTimeZone.setDefault(original);
        }
    }

    @Test
    public void testGetMillisKeepLocal_SameZoneShortcut() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        long oldInstant = 123456L;
        assertEquals(oldInstant, zone.getMillisKeepLocal(zone, oldInstant));
    }

    @Test
    public void testGetMillisKeepLocal_DifferentZone() {
        DateTimeZone zoneA = new BaseTestZone("A") { public int getOffset(long instant) { return 3600000; } };
        DateTimeZone zoneB = new BaseTestZone("B") { public int getOffset(long instant) { return 7200000; } };
        long oldInstant = 0L;
        long instantLocal = zoneA.convertUTCToLocal(oldInstant);
        long expected = zoneB.convertLocalToUTC(instantLocal, false, oldInstant);
        assertEquals(expected, zoneA.getMillisKeepLocal(zoneB, oldInstant));
    }

    //=====================================================================
    // adjustOffset - ครอบคลุมทุก branch
    //=====================================================================
    @Test
    public void testAdjustOffset_NoOverlap_EqualOffsetsBothSides() {
        long tr = 100000000L;
        DateTimeZone zone = buildAdjustOffsetZone(tr, 7200000, 3600000);
        long farBefore = tr - 10 * 3600000L;
        assertEquals(farBefore, zone.adjustOffset(farBefore, true));
    }

    @Test
    public void testAdjustOffset_NoOverlap_BeforeOverlapStart() {
        long tr = 100000000L;
        int high = 7200000, low = 3600000, diff = high - low;
        DateTimeZone zone = buildAdjustOffsetZone(tr, high, low);
        long instant = (tr - diff) - 1;
        assertEquals(instant, zone.adjustOffset(instant, true));
    }

    @Test
    public void testAdjustOffset_NoOverlap_AtOrAfterOverlapEnd() {
        long tr = 100000000L;
        int high = 7200000, low = 3600000, diff = high - low;
        DateTimeZone zone = buildAdjustOffsetZone(tr, high, low);
        long overlapEnd = tr + diff;
        assertEquals(overlapEnd, zone.adjustOffset(overlapEnd, true));
    }

    @Test
    public void testAdjustOffset_LaterOffset_EarlierOrLaterTrue() {
        long tr = 100000000L;
        DateTimeZone zone = buildAdjustOffsetZone(tr, 7200000, 3600000);
        assertEquals(tr, zone.adjustOffset(tr, true));
    }

    @Test
    public void testAdjustOffset_LaterOffset_EarlierOrLaterFalse() {
        long tr = 100000000L;
        int high = 7200000, low = 3600000, diff = high - low;
        DateTimeZone zone = buildAdjustOffsetZone(tr, high, low);
        assertEquals(tr - diff, zone.adjustOffset(tr, false));
    }

    @Test
    public void testAdjustOffset_EarlierOffset_EarlierOrLaterTrue() {
        long tr = 100000000L;
        int high = 7200000, low = 3600000, diff = high - low;
        DateTimeZone zone = buildAdjustOffsetZone(tr, high, low);
        long overlapStart = tr - diff;
        assertEquals(tr, zone.adjustOffset(overlapStart, true));
    }

    @Test
    public void testAdjustOffset_EarlierOffset_EarlierOrLaterFalse() {
        long tr = 100000000L;
        int high = 7200000, low = 3600000, diff = high - low;
        DateTimeZone zone = buildAdjustOffsetZone(tr, high, low);
        long overlapStart = tr - diff;
        assertEquals(overlapStart, zone.adjustOffset(overlapStart, false));
    }

    //=====================================================================
    // isLocalDateTimeGap
    //=====================================================================
    @Test
    public void testIsLocalDateTimeGap_FixedZone_ReturnsFalse() {
        DateTimeZone zone = new BaseTestZone("FixedZ") { public boolean isFixed() { return true; } };
        LocalDateTime ldt = new LocalDateTime(2000, 1, 1, 0, 0);
        assertFalse(zone.isLocalDateTimeGap(ldt));
    }

    @Test
    public void testIsLocalDateTimeGap_NonFixed_NoGap_ReturnsFalse() {
        DateTimeZone zone = new BaseTestZone("NonFixedNoGap") {
            public int getOffset(long instant) { return 0; }
        };
        LocalDateTime ldt = new LocalDateTime(2000, 1, 1, 0, 0);
        assertFalse(zone.isLocalDateTimeGap(ldt));
        // หมายเหตุ: กรณี "true" (เกิด gap จริง) ไม่ทดสอบ เพราะพึ่งพา internal ของ
        // LocalDateTime.toDateTime() ซึ่งไม่มีซอร์สโค้ดให้มาด้วย (หลีกเลี่ยงการเดา)
    }

    //=====================================================================
    // Serialization (writeReplace / Stub / readResolve -> forID)
    //=====================================================================
    @Test
    public void testSerialization_WriteReplace_RoundTrip() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("+02:00");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(zone);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        Object result = ois.readObject();
        ois.close();

        assertTrue(result instanceof DateTimeZone);
        assertEquals(zone.getID(), ((DateTimeZone) result).getID());
    }
}
