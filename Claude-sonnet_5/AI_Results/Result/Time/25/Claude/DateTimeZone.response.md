# คำอธิบายแนวทางการทดสอบ

เนื่องจาก `DateTimeZone` เป็น abstract class ที่มี static state ร่วมกัน (provider, nameProvider, default zone) ผมจึง:
- ใช้ `@Before`/`@After` เก็บและคืนค่า static state เดิม เพื่อไม่ให้ test กระทบกัน
- สร้าง inner test-double class `TestZone` เพื่อควบคุม behavior ของ abstract methods (`getOffset`, `getNameKey`, `isFixed` ฯลฯ) สำหรับทดสอบ branch ที่ยากจะ trigger ด้วย zone จริง (เช่น overflow, nameKey=null)
- ใช้ zone จริงเช่น `America/New_York` สำหรับทดสอบ DST gap/overlap (คอมเมนต์กำกับว่าพึ่งพา tzdata)

```java
package org.joda.time;

import static org.junit.Assert.*;

import java.io.*;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.SimpleTimeZone;

import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DateTimeZoneTest {

    private Provider originalProvider;
    private NameProvider originalNameProvider;
    private DateTimeZone originalDefault;

    @Before
    public void setUp() {
        originalProvider = DateTimeZone.getProvider();
        originalNameProvider = DateTimeZone.getNameProvider();
        originalDefault = DateTimeZone.getDefault();
    }

    @After
    public void tearDown() {
        DateTimeZone.setProvider(originalProvider);
        DateTimeZone.setNameProvider(originalNameProvider);
        DateTimeZone.setDefault(originalDefault);
    }

    //=====================================================================
    // Test double เพื่อควบคุม abstract methods ได้เต็มที่
    //=====================================================================
    private static class TestZone extends DateTimeZone {
        private final int offset;
        private final int standardOffset;
        private final boolean fixed;
        private final String nameKey;

        TestZone(String id, int offset, int standardOffset, boolean fixed, String nameKey) {
            super(id);
            this.offset = offset;
            this.standardOffset = standardOffset;
            this.fixed = fixed;
            this.nameKey = nameKey;
        }

        TestZone(String id, int offset) {
            this(id, offset, offset, true, id);
        }

        @Override public String getNameKey(long instant) { return nameKey; }
        @Override public int getOffset(long instant) { return offset; }
        @Override public int getStandardOffset(long instant) { return standardOffset; }
        @Override public boolean isFixed() { return fixed; }
        @Override public long nextTransition(long instant) { return instant; }
        @Override public long previousTransition(long instant) { return instant; }
        @Override public boolean equals(Object object) {
            if (!(object instanceof TestZone)) {
                return false;
            }
            return getID().equals(((TestZone) object).getID());
        }
    }

    //=====================================================================
    // forID
    //=====================================================================
    @Test
    public void testForID_null_returnsDefault() {
        assertEquals(DateTimeZone.getDefault(), DateTimeZone.forID(null));
    }

    @Test
    public void testForID_UTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
    }

    @Test
    public void testForID_knownProviderZone() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        assertEquals("Europe/London", zone.getID());
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
    public void testForID_positiveOffset() {
        DateTimeZone zone = DateTimeZone.forID("+02:00");
        assertEquals("+02:00", zone.getID());
        assertEquals(2 * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(0L));
    }

    @Test
    public void testForID_negativeOffset() {
        DateTimeZone zone = DateTimeZone.forID("-05:00");
        assertEquals("-05:00", zone.getID());
        assertEquals(-5 * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(0L));
    }

    @Test
    public void testForID_fixedOffsetCache_sameInstance() {
        DateTimeZone z1 = DateTimeZone.forID("+03:00");
        DateTimeZone z2 = DateTimeZone.forID("+03:00");
        // ตรวจ branch cache hit ใน fixedOffsetZone (อาจ flaky หาก GC เคลียร์ SoftReference)
        assertSame(z1, z2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_unknownId_throws() {
        DateTimeZone.forID("Bogus/Nowhere");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_malformedOffset_throws() {
        DateTimeZone.forID("+bogus");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_hoursOnlyOffset_throws() {
        // offsetFormatter ถูกสร้างด้วย minFields=2 -> คาดว่าต้องมีอย่างน้อย ชม:นาที
        DateTimeZone.forID("+09");
    }

    //=====================================================================
    // forOffsetHours
    //=====================================================================
    @Test
    public void testForOffsetHours_zero_returnsUTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHours(0));
    }

    @Test
    public void testForOffsetHours_positive() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        assertEquals("+05:00", zone.getID());
    }

    @Test
    public void testForOffsetHours_negative() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(-5);
        assertEquals("-05:00", zone.getID());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHours_overflow_throws() {
        DateTimeZone.forOffsetHours(Integer.MAX_VALUE);
    }

    //=====================================================================
    // forOffsetHoursMinutes
    //=====================================================================
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
    public void testForOffsetHoursMinutes_minutesBoundary59_ok() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(0, 59);
        assertEquals("+00:59", zone.getID());
    }

    @Test
    public void testForOffsetHoursMinutes_positiveHours() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(2, 30);
        assertEquals("+02:30", zone.getID());
    }

    @Test
    public void testForOffsetHoursMinutes_negativeHours() {
        // ตาม javadoc: (-2,30) -> "-02:30"
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(-2, 30);
        assertEquals("-02:30", zone.getID());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_overflow_throws() {
        DateTimeZone.forOffsetHoursMinutes(Integer.MAX_VALUE, 30);
    }

    //=====================================================================
    // forOffsetMillis / printOffset branches
    //=====================================================================
    @Test
    public void testForOffsetMillis_zero_returnsUTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0));
    }

    @Test
    public void testForOffsetMillis_minutesOnly() {
        int offset = DateTimeConstants.MILLIS_PER_HOUR + DateTimeConstants.MILLIS_PER_MINUTE; // 1h1m
        DateTimeZone zone = DateTimeZone.forOffsetMillis(offset);
        assertEquals("+01:01", zone.getID());
    }

    @Test
    public void testForOffsetMillis_withSeconds() {
        int offset = DateTimeConstants.MILLIS_PER_HOUR + DateTimeConstants.MILLIS_PER_MINUTE
                + DateTimeConstants.MILLIS_PER_SECOND; // 1h1m1s
        DateTimeZone zone = DateTimeZone.forOffsetMillis(offset);
        assertEquals("+01:01:01", zone.getID());
    }

    @Test
    public void testForOffsetMillis_withMillisComponent() {
        int offset = DateTimeConstants.MILLIS_PER_HOUR + DateTimeConstants.MILLIS_PER_MINUTE
                + DateTimeConstants.MILLIS_PER_SECOND + 500; // 1h1m1s500ms
        DateTimeZone zone = DateTimeZone.forOffsetMillis(offset);
        assertEquals("+01:01:01.500", zone.getID());
    }

    @Test
    public void testForOffsetMillis_negativeWithMillis() {
        int offset = -(DateTimeConstants.MILLIS_PER_HOUR + 500);
        DateTimeZone zone = DateTimeZone.forOffsetMillis(offset);
        assertEquals("-01:00:00.500", zone.getID());
    }

    //=====================================================================
    // forTimeZone
    //=====================================================================
    @Test
    public void testForTimeZone_null_returnsDefault() {
        assertEquals(DateTimeZone.getDefault(), DateTimeZone.forTimeZone(null));
    }

    @Test
    public void testForTimeZone_UTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void testForTimeZone_directId() {
        DateTimeZone zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("Europe/Paris"));
        assertEquals("Europe/Paris", zone.getID());
    }

    @Test
    public void testForTimeZone_oldAliasConverted() {
        // "EST" เป็น short id เก่าที่ map ไปยัง America/New_York (getConvertedId)
        DateTimeZone zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("EST"));
        assertEquals("America/New_York", zone.getID());
    }

    @Test
    public void testForTimeZone_GMTOffsetDisplayName() {
        // สมมติฐาน: getDisplayName() ของ custom GMT TimeZone คืนรูปแบบ "GMT+02:00"
        // (ขึ้นกับ JVM/locale - ถ้า assumption ผิด testนี้อาจ fail)
        TimeZone jdkZone = new SimpleTimeZone(2 * 60 * 60 * 1000, "CustomGMT+2");
        DateTimeZone zone = DateTimeZone.forTimeZone(jdkZone);
        assertEquals(2 * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForTimeZone_unrecognized_throws() {
        TimeZone jdkZone = new SimpleTimeZone(0, "Totally/Unknown/Zone/Id") {
            @Override public String getDisplayName() { return "NotGMTFormat"; }
        };
        DateTimeZone.forTimeZone(jdkZone);
    }

    //=====================================================================
    // getAvailableIDs
    //=====================================================================
    @Test
    public void testGetAvailableIDs_containsUTC() {
        Set<String> ids = DateTimeZone.getAvailableIDs();
        assertNotNull(ids);
        assertTrue(ids.contains("UTC"));
    }

    //=====================================================================
    // Provider
    //=====================================================================
    @Test
    public void testGetProvider_notNull() {
        assertNotNull(DateTimeZone.getProvider());
    }

    @Test
    public void testSetProvider_null_resetsToDefault() {
        DateTimeZone.setProvider(null);
        assertNotNull(DateTimeZone.getProvider());
        assertTrue(DateTimeZone.getAvailableIDs().contains("UTC"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_emptyIds_throws() {
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String id) { return null; }
            public Set<String> getAvailableIDs() { return new HashSet<String>(); }
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_noUTC_throws() {
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String id) { return null; }
            public Set<String> getAvailableIDs() {
                Set<String> s = new HashSet<String>();
                s.add("Foo/Bar");
                return s;
            }
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_wrongUTCZone_throws() {
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String id) {
                if ("UTC".equals(id)) {
                    return DateTimeZone.forOffsetHours(1); // ไม่เท่ากับ DateTimeZone.UTC
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
    public void testSetProvider_valid_custom() {
        final Provider delegate = originalProvider;
        Provider custom = new Provider() {
            public DateTimeZone getZone(String id) { return delegate.getZone(id); }
            public Set<String> getAvailableIDs() { return delegate.getAvailableIDs(); }
        };
        DateTimeZone.setProvider(custom);
        assertSame(custom, DateTimeZone.getProvider());
    }

    //=====================================================================
    // NameProvider
    //=====================================================================
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
    public void testSetNameProvider_custom_usedInGetShortName() {
        DateTimeZone.setNameProvider(new NameProvider() {
            public String getShortName(Locale locale, String id, String nameKey) {
                return "CUSTOM_SHORT";
            }
            public String getName(Locale locale, String id, String nameKey) {
                return "CUSTOM_LONG";
            }
        });
        assertEquals("CUSTOM_SHORT", DateTimeZone.UTC.getShortName(0L));
        assertEquals("CUSTOM_LONG", DateTimeZone.UTC.getName(0L));
    }

    //=====================================================================
    // setDefault / getDefault
    //=====================================================================
    @Test(expected = IllegalArgumentException.class)
    public void testSetDefault_null_throws() {
        DateTimeZone.setDefault(null);
    }

    @Test
    public void testSetDefault_valid() {
        DateTimeZone zone = DateTimeZone.forID("Asia/Tokyo");
        DateTimeZone.setDefault(zone);
        assertEquals(zone, DateTimeZone.getDefault());
    }

    //=====================================================================
    // Instance: getID / getOffset / getStandardOffset / isStandardOffset
    //=====================================================================
    @Test
    public void testGetID() {
        assertEquals("UTC", DateTimeZone.UTC.getID());
    }

    @Test
    public void testGetOffset_long_UTC() {
        assertEquals(0, DateTimeZone.UTC.getOffset(0L));
    }

    @Test
    public void testGetOffset_ReadableInstant_null_usesCurrentTime() {
        int offset = DateTimeZone.UTC.getOffset((ReadableInstant) null);
        assertEquals(0, offset);
    }

    @Test
    public void testGetOffset_ReadableInstant_withInstant() {
        Instant instant = new Instant(0L);
        assertEquals(0, DateTimeZone.UTC.getOffset(instant));
    }

    @Test
    public void testIsStandardOffset_trueWhenEqual() {
        TestZone z = new TestZone("Test1", 1000, 1000, true, "Test1");
        assertTrue(z.isStandardOffset(0L));
    }

    @Test
    public void testIsStandardOffset_falseWhenDifferent() {
        TestZone z = new TestZone("Test2", 2000, 1000, true, "Test2");
        assertFalse(z.isStandardOffset(0L));
    }

    @Test
    public void testIsStandardOffset_realZone_winterSummer() {
        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        DateTime winter = new DateTime(2013, 1, 1, 0, 0, ny);
        DateTime summer = new DateTime(2013, 7, 1, 0, 0, ny);
        assertTrue(ny.isStandardOffset(winter.getMillis()));
        assertFalse(ny.isStandardOffset(summer.getMillis()));
    }

    //=====================================================================
    // getShortName / getName branches
    //=====================================================================
    @Test
    public void testGetShortName_nameKeyNull_returnsID() {
        TestZone z = new TestZone("MyZone", 0, 0, true, null);
        assertEquals("MyZone", z.getShortName(0L));
    }

    @Test
    public void testGetShortName_unknownNameKey_fallsBackToOffset() {
        TestZone z = new TestZone("MyZone2", DateTimeConstants.MILLIS_PER_HOUR,
                DateTimeConstants.MILLIS_PER_HOUR, true, "SomeUnknownNameKeyXYZ");
        String result = z.getShortName(0L, Locale.US);
        assertEquals("+01:00", result);
    }

    @Test
    public void testGetName_nameKeyNull_returnsID() {
        TestZone z = new TestZone("MyZone3", 0, 0, true, null);
        assertEquals("MyZone3", z.getName(0L));
    }

    @Test
    public void testGetName_unknownNameKey_fallsBackToOffset() {
        TestZone z = new TestZone("MyZone4", -2 * DateTimeConstants.MILLIS_PER_HOUR,
                -2 * DateTimeConstants.MILLIS_PER_HOUR, true, "AnotherUnknownKeyXYZ");
        String result = z.getName(0L, Locale.US);
        assertEquals("-02:00", result);
    }

    @Test
    public void testGetShortName_explicitLocale() {
        // ใช้ locale ที่ไม่ null เพื่อเลี่ยง branch locale==null
        String result = DateTimeZone.UTC.getShortName(0L, Locale.US);
        assertNotNull(result);
    }

    //=====================================================================
    // getOffsetFromLocal
    //=====================================================================
    @Test
    public void testGetOffsetFromLocal_fixedZone_noDstBoundary() {
        // UTC ไม่มี DST, offsetLocal == offsetAdjusted เสมอ
        long instantLocal = 0L;
        assertEquals(0, DateTimeZone.UTC.getOffsetFromLocal(instantLocal));
    }

    @Test
    public void testGetOffsetFromLocal_dstGap_afterGapOffset() {
        // 2013-03-10 02:30 America/New_York เป็น DST gap (ขึ้นกับ tzdata)
        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        LocalDateTime ldt = new LocalDateTime(2013, 3, 10, 2, 30, 0, 0);
        long instantLocal = ldt.toDateTime(DateTimeZone.UTC).getMillis();
        int offset = ny.getOffsetFromLocal(instantLocal);
        // คาดหวัง DST offset (-4h) เพราะต้องอยู่ "หลัง gap"
        assertEquals(-4 * DateTimeConstants.MILLIS_PER_HOUR, offset);
    }

    //=====================================================================
    // convertUTCToLocal
    //=====================================================================
    @Test
    public void testConvertUTCToLocal_normal() {
        TestZone z = new TestZone("Fixed1", DateTimeConstants.MILLIS_PER_HOUR);
        assertEquals(DateTimeConstants.MILLIS_PER_HOUR, z.convertUTCToLocal(0L));
    }

    @Test(expected = ArithmeticException.class)
    public void testConvertUTCToLocal_overflow_throws() {
        int bigOffset = 1_000_000_000;
        TestZone z = new TestZone("BigOffset", bigOffset);
        long instantUTC = Long.MAX_VALUE - 500_000_000L;
        z.convertUTCToLocal(instantUTC);
    }

    //=====================================================================
    // convertLocalToUTC (strict / non-strict / overlap / gap / overflow)
    //=====================================================================
    @Test
    public void testConvertLocalToUTC_fixedZone_noDst() {
        TestZone z = new TestZone("FixedConv", DateTimeConstants.MILLIS_PER_HOUR);
        long instantLocal = DateTimeConstants.MILLIS_PER_HOUR * 2L;
        assertEquals(DateTimeConstants.MILLIS_PER_HOUR, z.convertLocalToUTC(instantLocal, true));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertLocalToUTC_gap_strict_throws() {
        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        LocalDateTime ldt = new LocalDateTime(2013, 3, 10, 2, 30, 0, 0);
        long instantLocal = ldt.toDateTime(DateTimeZone.UTC).getMillis();
        ny.convertLocalToUTC(instantLocal, true);
    }

    @Test
    public void testConvertLocalToUTC_gap_nonStrict_doesNotThrow() {
        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        LocalDateTime ldt = new LocalDateTime(2013, 3, 10, 2, 30, 0, 0);
        long instantLocal = ldt.toDateTime(DateTimeZone.UTC).getMillis();
        long result = ny.convertLocalToUTC(instantLocal, false);
        assertTrue(result != 0); // แค่ยืนยันไม่ throw และได้ค่ากลับมา
    }

    @Test
    public void testConvertLocalToUTC_overlap_favoursDaylightTime() {
        // 2013-11-03 01:30 America/New_York เกิดขึ้น 2 ครั้ง (overlap)
        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        LocalDateTime ldt = new LocalDateTime(2013, 11, 3, 1, 30, 0, 0);
        long instantLocal = ldt.toDateTime(DateTimeZone.UTC).getMillis();
        long instantUTC = ny.convertLocalToUTC(instantLocal, true);
        int offsetUsed = ny.getOffset(instantUTC);
        // ตาม javadoc: ต้อง favour daylight (summer) time เสมอ -> EDT = -4h
        assertEquals(-4 * DateTimeConstants.MILLIS_PER_HOUR, offsetUsed);
    }

    @Test(expected = ArithmeticException.class)
    public void testConvertLocalToUTC_overflow_throws() {
        int bigOffset = 1_000_000_000;
        TestZone z = new TestZone("BigOffset2", bigOffset);
        long instantLocal = Long.MIN_VALUE + 500_000_000L;
        z.convertLocalToUTC(instantLocal, true);
    }

    //=====================================================================
    // convertLocalToUTC(instantLocal, strict, originalInstantUTC)
    //=====================================================================
    @Test
    public void testConvertLocalToUTC_withOriginal_sameOffset_returnsDirectly() {
        TestZone z = new TestZone("OrigSame", DateTimeConstants.MILLIS_PER_HOUR);
        long originalUTC = 0L;
        long instantLocal = DateTimeConstants.MILLIS_PER_HOUR * 3L;
        long result = z.convertLocalToUTC(instantLocal, true, originalUTC);
        assertEquals(instantLocal - DateTimeConstants.MILLIS_PER_HOUR, result);
    }

    @Test
    public void testConvertLocalToUTC_withOriginal_differentOffset_delegates() {
        // ใช้ zone จริงที่มี DST เพื่อให้ offsetLocalFromOriginal != offsetOriginal
        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        long originalUTC = new DateTime(2013, 1, 1, 0, 0, ny).getMillis(); // winter -5h
        LocalDateTime ldt = new LocalDateTime(2013, 7, 1, 12, 0, 0, 0); // summer local time
        long instantLocal = ldt.toDateTime(DateTimeZone.UTC).getMillis();
        long result = ny.convertLocalToUTC(instantLocal, true, originalUTC);
        // ตรวจแค่ไม่ throw และ offset ที่ใช้คำนวณสมเหตุสมผล (delegate ไปยัง convertLocalToUTC(2-arg))
        assertEquals(instantLocal - ny.getOffset(result), result);
    }

    //=====================================================================
    // getMillisKeepLocal
    //=====================================================================
    @Test
    public void testGetMillisKeepLocal_sameZone_returnsUnchanged() {
        long oldInstant = 123456789L;
        assertEquals(oldInstant, DateTimeZone.UTC.getMillisKeepLocal(DateTimeZone.UTC, oldInstant));
    }

    @Test
    public void testGetMillisKeepLocal_nullNewZone_usesDefault() {
        DateTimeZone.setDefault(DateTimeZone.UTC);
        long oldInstant = 1000L;
        long result = DateTimeZone.UTC.getMillisKeepLocal(null, oldInstant);
        assertEquals(oldInstant, result);
    }

    @Test
    public void testGetMillisKeepLocal_differentZone() {
        DateTimeZone tokyo = DateTimeZone.forID("Asia/Tokyo"); // +9h, ไม่มี DST
        long oldInstant = 0L;
        long result = DateTimeZone.UTC.getMillisKeepLocal(tokyo, oldInstant);
        // local time เดียวกัน (00:00) แต่ของ Tokyo ต้องลบ offset +9h -> UTC instant -9h
        assertEquals(-9 * DateTimeConstants.MILLIS_PER_HOUR, result);
    }

    //=====================================================================
    // isLocalDateTimeGap
    //=====================================================================
    @Test
    public void testIsLocalDateTimeGap_fixedZone_alwaysFalse() {
        assertFalse(DateTimeZone.UTC.isLocalDateTimeGap(new LocalDateTime(2013, 3, 10, 2, 30)));
    }

    @Test
    public void testIsLocalDateTimeGap_realGap_true() {
        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        assertTrue(ny.isLocalDateTimeGap(new LocalDateTime(2013, 3, 10, 2, 30, 0, 0)));
    }

    @Test
    public void testIsLocalDateTimeGap_normalTime_false() {
        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        assertFalse(ny.isLocalDateTimeGap(new LocalDateTime(2013, 3, 10, 10, 0, 0, 0)));
    }

    //=====================================================================
    // toTimeZone / equals / hashCode / toString
    //=====================================================================
    @Test
    public void testToTimeZone() {
        TimeZone tz = DateTimeZone.UTC.toTimeZone();
        assertEquals("UTC", tz.getID());
    }

    @Test
    public void testEquals_sameId() {
        assertTrue(DateTimeZone.UTC.equals(DateTimeZone.forID("UTC")));
    }

    @Test
    public void testEquals_null_false() {
        assertFalse(DateTimeZone.UTC.equals(null));
    }

    @Test
    public void testHashCode_consistentWithId() {
        assertEquals(57 + "UTC".hashCode(), DateTimeZone.UTC.hashCode());
    }

    @Test
    public void testToString_returnsId() {
        assertEquals("UTC", DateTimeZone.UTC.toString());
    }

    //=====================================================================
    // Serialization (writeReplace / Stub.readResolve)
    //=====================================================================
    @Test
    public void testSerialization_UTC_roundTrip() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(DateTimeZone.UTC);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        DateTimeZone result = (DateTimeZone) ois.readObject();
        assertSame(DateTimeZone.UTC, result);
    }

    @Test
    public void testSerialization_namedZone_roundTrip() throws Exception {
        DateTimeZone original = DateTimeZone.forID("Europe/Paris");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        DateTimeZone result = (DateTimeZone) ois.readObject();
        assertEquals(original, result);
    }
}
```

## สรุปตาราง Branch/Condition ที่ครอบคลุม

| เมธอดทดสอบ (ตัวอย่าง) | Branch/Condition ที่ครอบคลุมในซอร์ส |
|---|---|
| `testForID_null_returnsDefault` | `forID`: `id == null` → `getDefault()` |
| `testForID_UTC` | `forID`: `id.equals("UTC")` |
| `testForID_knownProviderZone` | `forID`: `cProvider.getZone(id) != null` |
| `testForID_plusZeroOffset_*`, `testForID_minusZeroOffset_*` | `forID`: `startsWith("+"/"-")`, `offset==0` → UTC |
| `testForID_positiveOffset`, `testForID_negativeOffset` | `forID`: offset!=0 → `fixedOffsetZone` |
| `testForID_fixedOffsetCache_sameInstance` | `fixedOffsetZone`: cache hit branch |
| `testForID_unknownId_throws` | `forID`: ไม่ match ใด ๆ → throw |
| `testForID_malformedOffset_throws`, `testForID_hoursOnlyOffset_throws` | `parseOffset` parse fail |
| `testForOffsetHours_*` | `forOffsetHours` delegate + overflow branch |
| `testForOffsetHoursMinutes_*` | `forOffsetHoursMinutes`: both-zero, minutes<0, minutes>59, hoursInMinutes<0/>=0, overflow |
| `testForOffsetMillis_*` | `printOffset`: sign +/-, minutes-only/seconds/millis return branches |
| `testForTimeZone_*` | `forTimeZone`: null, UTC id, convId found, direct id, GMT+/- display name, unrecognized throw |
| `testGetAvailableIDs_containsUTC` | `getAvailableIDs` getter |
| `testSetProvider_*` | `setProvider0`: null→default, empty ids, no UTC, wrong UTC zone, valid custom |
| `testSetNameProvider_*` | `setNameProvider0`: null→default, custom provider used |
| `testSetDefault_*` | `setDefault`: null throw, valid set |
| `testGetOffset_*` | `getOffset(ReadableInstant)`: null/non-null |
| `testIsStandardOffset_*` | `isStandardOffset`: equal/ไม่เท่ากัน, zone จริง DST/standard |
| `testGetShortName_*`, `testGetName_*` | `getShortName/getName`: nameKey==null, locale==null/ไม่null, provider name null→fallback printOffset |
| `testGetOffsetFromLocal_*` | `getOffsetFromLocal`: offsetLocal==offsetAdjusted, DST gap branch (nextTransition compare) |
| `testConvertUTCToLocal_*` | `convertUTCToLocal`: normal, overflow throw |
| `testConvertLocalToUTC_*` (strict/gap/overlap/overflow) | `convertLocalToUTC`: no-DST, gap strict throw, gap non-strict fallback, overlap favour daylight, overflow throw |
| `testConvertLocalToUTC_withOriginal_*` | `convertLocalToUTC(3-arg)`: offset เท่ากันคืนตรง, offset ต่างกัน delegate |
| `testGetMillisKeepLocal_*` | `getMillisKeepLocal`: newZone null, newZone==this, zone ต่างกัน |
| `testIsLocalDateTimeGap_*` | `isLocalDateTimeGap`: isFixed true, gap จริง (catch), ไม่ gap (try success) |
| `testEquals_*`, `testHashCode_*`, `testToString_*`, `testToTimeZone` | basic methods |
| `testSerialization_*` | `writeReplace`/`Stub.readResolve` |

**หมายเหตุ/สมมติฐานที่ไม่ยืนยัน 100%:**
- `testForTimeZone_GMTOffsetDisplayName` พึ่งพารูปแบบ `getDisplayName()` ของ JDK ซึ่งอาจต่างกันตาม JVM/locale
- Test ที่เกี่ยวกับ DST gap/overlap (`America/New_York` ปี 2013) พึ่งพาข้อมูล tzdata ที่ bundle มากับ joda-time
- `testForID_fixedOffsetCache_sameInstance` อาจ flaky หาก SoftReference ถูก GC ก่อนเรียกครั้งที่สอง