# DateTimeZoneTest.java

หมายเหตุสำคัญก่อนเริ่ม:
- ใช้ `Provider`/`NameProvider` interface ตาม signature มาตรฐานของ joda-time (`getZone`, `getAvailableIDs`, `getShortName`, `getName`) ซึ่งไม่ได้แสดงใน source ที่ให้มา แต่เป็น interface ที่ถูก import ไว้ — คอมเมนต์กำกับไว้ในโค้ด
- บางเทสที่ต้องใช้ real zone id (เช่น `Europe/London`) ใช้ `Assume` เพื่อข้ามถ้า tz data ไม่พร้อมใน classpath เพื่อไม่ให้ทดสอบ fail โดยไม่เกี่ยวกับ logic ที่ต้องการทดสอบ
- ใช้ custom subclass ของ `DateTimeZone` (abstract class) เพื่อควบคุม branch ของ algorithm ภายใน (`convertLocalToUTC`, `getOffsetFromLocal`, `adjustOffset` ฯลฯ) อย่างแม่นยำ โดย trace ตาม source code ที่ให้มาเท่านั้น ไม่ได้เดา behavior เพิ่ม

```java
package org.joda.time;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;

import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.junit.After;
import org.junit.Assume;
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
        // คืนค่า static state ทุกครั้งเพื่อไม่ให้เทสอื่นได้รับผลกระทบ
        DateTimeZone.setProvider(originalProvider);
        DateTimeZone.setNameProvider(originalNameProvider);
        DateTimeZone.setDefault(originalDefault);
    }

    // =====================================================================
    // Helper zones (ควบคุม branch ได้แน่นอน โดย trace ตาม source ที่ให้มา)
    // =====================================================================

    /** zone offset คงที่ ใช้ทดสอบ sanity / overflow */
    private static class ConstantOffsetZone extends DateTimeZone {
        private final int offset;
        private final boolean fixed;

        ConstantOffsetZone(String id, int offset, boolean fixed) {
            super(id);
            this.offset = offset;
            this.fixed = fixed;
        }

        public String getNameKey(long instant) { return null; }
        public int getOffset(long instant) { return offset; }
        public int getStandardOffset(long instant) { return offset; }
        public boolean isFixed() { return fixed; }
        public long nextTransition(long instant) { return instant; }
        public long previousTransition(long instant) { return instant; }
        public boolean equals(Object object) { return object == this; }
    }

    /** zone แบบ step offset เดียว (offsetBefore ก่อน transition, offsetAfter หลัง/ที่ transition) */
    private static class StepZone extends DateTimeZone {
        final long t;
        final int before;
        final int after;

        StepZone(String id, long t, int before, int after) {
            super(id);
            this.t = t;
            this.before = before;
            this.after = after;
        }

        public String getNameKey(long instant) { return null; }
        public int getOffset(long instant) { return instant < t ? before : after; }
        public int getStandardOffset(long instant) { return Math.min(before, after); }
        public boolean isFixed() { return false; }
        public long nextTransition(long instant) { return instant < t ? t : instant; }
        public long previousTransition(long instant) { return instant > t ? t : instant; }
        public boolean equals(Object object) {
            return object instanceof StepZone && ((StepZone) object).getID().equals(getID());
        }
    }

    /** zone สำหรับทดสอบ nameKey != null และ printOffset fallback */
    private static class KeyedZone extends DateTimeZone {
        private final String key;
        private final int offset;

        KeyedZone(String id, String key, int offset) {
            super(id);
            this.key = key;
            this.offset = offset;
        }

        public String getNameKey(long instant) { return key; }
        public int getOffset(long instant) { return offset; }
        public int getStandardOffset(long instant) { return offset; }
        public boolean isFixed() { return true; }
        public long nextTransition(long instant) { return instant; }
        public long previousTransition(long instant) { return instant; }
        public boolean equals(Object object) { return object == this; }
    }

    /** zone สำหรับ branch C1 ของ getOffsetFromLocal (ควบคุมผ่าน hardcode ตาม instant ที่ใช้จริง) */
    private static class OverlapTableZone extends DateTimeZone {
        OverlapTableZone() { super("OverlapTableZone"); }
        public String getNameKey(long instant) { return null; }
        public int getOffset(long instant) {
            if (instant == 1000L) return 0;
            if (instant == 900L) return 200;
            return 0;
        }
        public int getStandardOffset(long instant) { return 0; }
        public boolean isFixed() { return false; }
        public long nextTransition(long instant) { return instant; }
        public long previousTransition(long instant) {
            return instant == 1000L ? 900L : instant;
        }
        public boolean equals(Object object) { return object == this; }
    }

    /** subclass สำหรับทดสอบ constructor(null) */
    private static class NullIdZone extends DateTimeZone {
        NullIdZone(String id) { super(id); }
        public String getNameKey(long instant) { return null; }
        public int getOffset(long instant) { return 0; }
        public int getStandardOffset(long instant) { return 0; }
        public boolean isFixed() { return true; }
        public long nextTransition(long instant) { return instant; }
        public long previousTransition(long instant) { return instant; }
        public boolean equals(Object object) { return object == this; }
    }

    // =====================================================================
    // 1) Constructor
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullId_throws() {
        new NullIdZone(null);
    }

    @Test
    public void testConstructor_validId() {
        DateTimeZone z = new NullIdZone("abc");
        assertEquals("abc", z.getID());
    }

    // =====================================================================
    // 2) forID branches
    // =====================================================================

    @Test
    public void testForID_null_returnsDefault() {
        assertEquals(DateTimeZone.getDefault(), DateTimeZone.forID(null));
    }

    @Test
    public void testForID_UTCString() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
    }

    @Test
    public void testForID_knownProviderZone_ifAvailable() {
        DateTimeZone zone;
        try {
            zone = DateTimeZone.forID("Europe/Paris");
        } catch (IllegalArgumentException ex) {
            Assume.assumeNoException("tz data not available in this environment", ex);
            return;
        }
        assertEquals("Europe/Paris", zone.getID());
    }

    @Test
    public void testForID_plusOffsetZero_returnsUTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("+00:00"));
    }

    @Test
    public void testForID_plusOffsetNonZero() {
        DateTimeZone zone = DateTimeZone.forID("+02:30");
        assertEquals(9000000, zone.getOffset(0L));
        assertEquals("+02:30", zone.getID());
    }

    @Test
    public void testForID_minusOffsetNonZero() {
        DateTimeZone zone = DateTimeZone.forID("-02:30");
        assertEquals(-9000000, zone.getOffset(0L));
        assertEquals("-02:30", zone.getID());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_invalid_throws() {
        DateTimeZone.forID("Not_A_Valid/Zone_Name_12345");
    }

    // =====================================================================
    // 3) forOffsetHours / forOffsetHoursMinutes / forOffsetMillis
    // =====================================================================

    @Test
    public void testForOffsetHours_zero() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHours(0));
    }

    @Test
    public void testForOffsetHours_positive() {
        DateTimeZone z = DateTimeZone.forOffsetHours(3);
        assertEquals(3 * 3600000, z.getOffset(0L));
    }

    @Test
    public void testForOffsetHours_negative() {
        DateTimeZone z = DateTimeZone.forOffsetHours(-4);
        assertEquals(-4 * 3600000, z.getOffset(0L));
    }

    @Test
    public void testForOffsetHoursMinutes_zeroZero() {
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
    public void testForOffsetHoursMinutes_positiveHours() {
        DateTimeZone z = DateTimeZone.forOffsetHoursMinutes(5, 30);
        assertEquals(19800000, z.getOffset(0L));
    }

    @Test
    public void testForOffsetHoursMinutes_negativeHours() {
        DateTimeZone z = DateTimeZone.forOffsetHoursMinutes(-5, 30);
        assertEquals(-19800000, z.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_overflow_throws() {
        DateTimeZone.forOffsetHoursMinutes(Integer.MAX_VALUE, 59);
    }

    @Test
    public void testForOffsetMillis_zero() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0));
    }

    @Test
    public void testForOffsetMillis_nonZero() {
        DateTimeZone z = DateTimeZone.forOffsetMillis(3661000); // 01:01:01
        assertEquals(3661000, z.getOffset(0L));
    }

    // =====================================================================
    // 4) forTimeZone branches
    // =====================================================================

    @Test
    public void testForTimeZone_null_returnsDefault() {
        assertEquals(DateTimeZone.getDefault(), DateTimeZone.forTimeZone(null));
    }

    @Test
    public void testForTimeZone_UTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void testForTimeZone_convertedOldAlias_ifAvailable() {
        // "EST" -> "America/New_York" ผ่าน getConvertedId
        DateTimeZone zone;
        try {
            zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("EST"));
        } catch (IllegalArgumentException ex) {
            Assume.assumeNoException("tz data not available", ex);
            return;
        }
        assertNotNull(zone);
    }

    @Test
    public void testForTimeZone_GMTDisplayNameZeroOffset_returnsUTC() {
        // custom TimeZone ที่ id ไม่รู้จัก แต่ display name เป็น GMT+00:00 แบบ default ของ SimpleTimeZone
        TimeZone custom = new java.util.SimpleTimeZone(0, "Totally_Unknown_Id_For_Test");
        DateTimeZone result;
        try {
            result = DateTimeZone.forTimeZone(custom);
        } catch (IllegalArgumentException ex) {
            // ถ้า JDK คืน displayName ไม่ตรงรูปแบบ GMT+/- ให้ข้ามเทสนี้ (พฤติกรรม JDK อาจต่างกันในแต่ละ version)
            Assume.assumeNoException("JVM display name format differs", ex);
            return;
        }
        assertSame(DateTimeZone.UTC, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForTimeZone_unrecognized_throws() {
        TimeZone unknown = new TimeZone() {
            public int getOffset(int era, int year, int month, int day, int dayOfWeek, int ms) { return 0; }
            public void setRawOffset(int offsetMillis) { }
            public int getRawOffset() { return 0; }
            public boolean useDaylightTime() { return false; }
            public boolean inDaylightTime(Date date) { return false; }
            public String getDisplayName() { return "NotAGmtFormatString"; }
        };
        unknown.setID("Totally/Unknown/Zone/Id/ForTest");
        DateTimeZone.forTimeZone(unknown);
    }

    // =====================================================================
    // 5) setDefault / getDefault
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testSetDefault_null_throws() {
        DateTimeZone.setDefault(null);
    }

    @Test
    public void testSetDefault_valid() {
        DateTimeZone.setDefault(DateTimeZone.UTC);
        assertSame(DateTimeZone.UTC, DateTimeZone.getDefault());
    }

    // =====================================================================
    // 6) getAvailableIDs / getProvider / setProvider branches
    // =====================================================================

    @Test
    public void testGetAvailableIDs_containsUTC() {
        Set<String> ids = DateTimeZone.getAvailableIDs();
        assertNotNull(ids);
        assertTrue(ids.contains("UTC"));
    }

    @Test
    public void testGetProvider_notNull() {
        assertNotNull(DateTimeZone.getProvider());
    }

    @Test
    public void testSetProvider_null_resetsToDefault() {
        DateTimeZone.setProvider(null);
        assertTrue(DateTimeZone.getProvider().getAvailableIDs().contains("UTC"));
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
    public void testSetProvider_valid_succeeds() {
        Provider valid = new Provider() {
            public DateTimeZone getZone(String id) {
                return "UTC".equals(id) ? DateTimeZone.UTC : null;
            }
            public Set<String> getAvailableIDs() {
                Set<String> s = new HashSet<String>();
                s.add("UTC");
                return s;
            }
        };
        DateTimeZone.setProvider(valid);
        assertSame(valid, DateTimeZone.getProvider());
    }

    // =====================================================================
    // 7) getNameProvider / setNameProvider
    // =====================================================================

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
            public String getShortName(Locale locale, String id, String nameKey) { return "S"; }
            public String getName(Locale locale, String id, String nameKey) { return "L"; }
        };
        DateTimeZone.setNameProvider(custom);
        assertSame(custom, DateTimeZone.getNameProvider());
    }

    // =====================================================================
    // 8) getShortName / getName branches
    // =====================================================================

    @Test
    public void testGetShortName_nameKeyNull_returnsId() {
        DateTimeZone z = new ConstantOffsetZone("NoKeyZone", 0, true); // getNameKey -> null
        assertEquals("NoKeyZone", z.getShortName(0L));
    }

    @Test
    public void testGetName_nameKeyNull_returnsId() {
        DateTimeZone z = new ConstantOffsetZone("NoKeyZone2", 0, true);
        assertEquals("NoKeyZone2", z.getName(0L));
    }

    @Test
    public void testGetShortName_providerReturnsName() {
        DateTimeZone.setNameProvider(new NameProvider() {
            public String getShortName(Locale locale, String id, String nameKey) { return "ShortX"; }
            public String getName(Locale locale, String id, String nameKey) { return "LongX"; }
        });
        DateTimeZone z = new KeyedZone("Keyed1", "key1", 3600000);
        assertEquals("ShortX", z.getShortName(0L));
        assertEquals("ShortX", z.getShortName(0L, Locale.US)); // locale != null branch
    }

    @Test
    public void testGetName_providerReturnsName() {
        DateTimeZone.setNameProvider(new NameProvider() {
            public String getShortName(Locale locale, String id, String nameKey) { return "ShortY"; }
            public String getName(Locale locale, String id, String nameKey) { return "LongY"; }
        });
        DateTimeZone z = new KeyedZone("Keyed2", "key2", 3600000);
        assertEquals("LongY", z.getName(0L));
        assertEquals("LongY", z.getName(0L, Locale.US));
    }

    @Test
    public void testGetShortName_providerReturnsNull_fallbackPrintOffset() {
        DateTimeZone.setNameProvider(new NameProvider() {
            public String getShortName(Locale locale, String id, String nameKey) { return null; }
            public String getName(Locale locale, String id, String nameKey) { return null; }
        });
        // offset = +01:00:00 -> ตาม printOffset algorithm ในซอร์ส จะได้ "+01:00"
        DateTimeZone z = new KeyedZone("Keyed3", "key3", 3600000);
        assertEquals("+01:00", z.getShortName(0L));
    }

    @Test
    public void testGetName_providerReturnsNull_fallbackPrintOffset() {
        DateTimeZone.setNameProvider(new NameProvider() {
            public String getShortName(Locale locale, String id, String nameKey) { return null; }
            public String getName(Locale locale, String id, String nameKey) { return null; }
        });
        DateTimeZone z = new KeyedZone("Keyed4", "key4", -5400000); // -01:30
        assertEquals("-01:30", z.getName(0L));
    }

    // =====================================================================
    // 9) getOffset(ReadableInstant)
    // =====================================================================

    @Test
    public void testGetOffset_readableInstant_null() {
        assertEquals(0, DateTimeZone.UTC.getOffset((ReadableInstant) null));
    }

    @Test
    public void testGetOffset_readableInstant_nonNull() {
        assertEquals(0, DateTimeZone.UTC.getOffset(new Instant(123456L)));
    }

    // =====================================================================
    // 10) isStandardOffset
    // =====================================================================

    @Test
    public void testIsStandardOffset_trueAndFalse() {
        DateTimeZone z = new StepZone("StdZone", 1000L, 0, 100);
        assertTrue(z.isStandardOffset(0L));   // offset(0)=0 == standardOffset(0)=min(0,100)=0
        assertFalse(z.isStandardOffset(1000L)); // offset(1000)=100 != standardOffset=0
    }

    // =====================================================================
    // 11) convertUTCToLocal: normal + overflow
    // =====================================================================

    @Test
    public void testConvertUTCToLocal_normal() {
        DateTimeZone z = new ConstantOffsetZone("ConvZone1", 500, true);
        assertEquals(1500L, z.convertUTCToLocal(1000L));
    }

    @Test(expected = ArithmeticException.class)
    public void testConvertUTCToLocal_overflow_throws() {
        DateTimeZone z = new ConstantOffsetZone("ConvZoneOverflow", 1, true);
        z.convertUTCToLocal(Long.MAX_VALUE);
    }

    // =====================================================================
    // 12) convertLocalToUTC(instantLocal, strict) branches
    // =====================================================================

    @Test
    public void testConvertLocalToUTC_noDifference() {
        DateTimeZone z = new ConstantOffsetZone("ConvZone2", 200, true);
        assertEquals(800L, z.convertLocalToUTC(1000L, true));
        assertEquals(800L, z.convertLocalToUTC(1000L, false));
    }

    @Test(expected = ArithmeticException.class)
    public void testConvertLocalToUTC_overflow_throws() {
        DateTimeZone z = new ConstantOffsetZone("ConvZoneOverflow2", 1, true);
        z.convertLocalToUTC(Long.MIN_VALUE, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertLocalToUTC_gap_strict_positiveOffsetLocal_throws() {
        long t = 1000000000L;
        DateTimeZone z = new StepZone("GapZonePos", t, 0, 3600000);
        long localInGap = t + 1800000L;
        z.convertLocalToUTC(localInGap, true);
    }

    @Test
    public void testConvertLocalToUTC_gap_lenient_positiveOffsetLocal_noThrow() {
        long t = 1000000000L;
        DateTimeZone z = new StepZone("GapZonePos2", t, 0, 3600000);
        long localInGap = t + 1800000L;
        long result = z.convertLocalToUTC(localInGap, false);
        assertEquals(localInGap, result); // ตามการไล่ algorithm: offset ที่ใช้คือ 0
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertLocalToUTC_gap_strict_negativeOffsetLocal_throws() {
        long t = 1000000000L;
        DateTimeZone z = new StepZone("GapZoneNeg", t, -7200000, -3600000);
        long local = t - 5400000L;
        z.convertLocalToUTC(local, true);
    }

    @Test
    public void testConvertLocalToUTC_gap_lenient_negativeOffsetLocal_fallback() {
        long t = 1000000000L;
        DateTimeZone z = new StepZone("GapZoneNeg2", t, -7200000, -3600000);
        long local = t - 5400000L;
        long result = z.convertLocalToUTC(local, false);
        assertEquals(t + 1800000L, result); // คำนวณตาม algorithm ในซอร์ส
    }

    // =====================================================================
    // 13) convertLocalToUTC(instantLocal, strict, originalInstantUTC) branches
    // =====================================================================

    @Test
    public void testConvertLocalToUTC_withOriginal_fastPath() {
        long t = 1000000000L;
        DateTimeZone z = new StepZone("OrigZone1", t, 0, 3600000);
        long originalUTC = t - 10000000L; // ก่อน transition, offset=0
        long local = originalUTC; // local = utc + offset(0)
        long result = z.convertLocalToUTC(local, false, originalUTC);
        assertEquals(local, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertLocalToUTC_withOriginal_delegate_strict_throws() {
        long t = 1000000000L;
        DateTimeZone z = new StepZone("OrigZone2", t, 0, 3600000);
        long originalUTC = t - 1800000L; // offsetOriginal = 0
        long local = t + 1800000L;       // อยู่ใน gap
        z.convertLocalToUTC(local, true, originalUTC);
    }

    @Test
    public void testConvertLocalToUTC_withOriginal_delegate_lenient_noThrow() {
        long t = 1000000000L;
        DateTimeZone z = new StepZone("OrigZone3", t, 0, 3600000);
        long originalUTC = t - 1800000L;
        long local = t + 1800000L;
        long result = z.convertLocalToUTC(local, false, originalUTC);
        assertEquals(local, result);
    }

    // =====================================================================
    // 14) getOffsetFromLocal branches (A/B/C1/C2/C3/D)
    // =====================================================================

    @Test
    public void testGetOffsetFromLocal_branchB_fallthrough() {
        long t = 1000000000L;
        DateTimeZone z = new StepZone("OffLocalB", t, 0, 3600000);
        long local = t + 1800000L;
        assertEquals(0, z.getOffsetFromLocal(local));
    }

    @Test
    public void testGetOffsetFromLocal_branchA_earlyReturn() {
        long t = 1000000000L;
        DateTimeZone z = new StepZone("OffLocalA", t, -3600000, 0);
        long local = t - 100L;
        assertEquals(-3600000, z.getOffsetFromLocal(local));
    }

    @Test
    public void testGetOffsetFromLocal_branchD_negativeOffsetEqual() {
        long t = 1000000000L;
        DateTimeZone z = new StepZone("OffLocalD", t, -3600000, 0);
        long local = t - 10000000L;
        assertEquals(-3600000, z.getOffsetFromLocal(local));
    }

    @Test
    public void testGetOffsetFromLocal_branchC3_noPreviousTransition() {
        long t = 1000000000L;
        DateTimeZone z = new StepZone("OffLocalC3", t, 0, 3600000);
        long local = t - 5000000L;
        assertEquals(0, z.getOffsetFromLocal(local));
    }

    @Test
    public void testGetOffsetFromLocal_branchC2_diffConditionFalse() {
        long t = 1000000000L;
        DateTimeZone z = new StepZone("OffLocalC2", t, 0, 3600000);
        long local = t + 100L;
        assertEquals(0, z.getOffsetFromLocal(local));
    }

    @Test
    public void testGetOffsetFromLocal_branchC1_returnOffsetPrev() {
        DateTimeZone z = new OverlapTableZone();
        assertEquals(200, z.getOffsetFromLocal(1000L));
    }

    // =====================================================================
    // 15) getMillisKeepLocal branches
    // =====================================================================

    @Test
    public void testGetMillisKeepLocal_sameZone_shortCircuit() {
        DateTimeZone z = new ConstantOffsetZone("KeepLocal1", 100, true);
        assertEquals(12345L, z.getMillisKeepLocal(z, 12345L));
    }

    @Test
    public void testGetMillisKeepLocal_nullNewZone_usesDefault() {
        DateTimeZone.setDefault(DateTimeZone.UTC);
        DateTimeZone z = new ConstantOffsetZone("KeepLocal2", 100, true);
        long result = z.getMillisKeepLocal(null, 0L);
        assertEquals(100L, result);
    }

    @Test
    public void testGetMillisKeepLocal_differentZone() {
        DateTimeZone z1 = new ConstantOffsetZone("KeepLocal3", 100, true);
        DateTimeZone z2 = new ConstantOffsetZone("KeepLocal4", 100, true);
        long result = z1.getMillisKeepLocal(z2, 5000L);
        assertEquals(5000L, result);
    }

    // =====================================================================
    // 16) isLocalDateTimeGap branches
    // =====================================================================

    @Test
    public void testIsLocalDateTimeGap_fixedZone_alwaysFalse() {
        DateTimeZone z = new ConstantOffsetZone("GapFixed", 0, true);
        assertFalse(z.isLocalDateTimeGap(new LocalDateTime(2000, 1, 1, 0, 0)));
    }

    @Test
    public void testIsLocalDateTimeGap_realZone_gapAndNonGap_ifAvailable() {
        DateTimeZone london;
        try {
            london = DateTimeZone.forID("Europe/London");
        } catch (IllegalArgumentException ex) {
            Assume.assumeNoException("tz data not available", ex);
            return;
        }
        // British Summer Time เริ่ม 31 Mar 2013 01:00 -> 02:00 (gap)
        // หมายเหตุ: ขึ้นกับ tz data จริงของสิ่งแวดล้อม
        boolean gap = london.isLocalDateTimeGap(new LocalDateTime(2013, 3, 31, 1, 30));
        boolean nonGap = london.isLocalDateTimeGap(new LocalDateTime(2013, 3, 31, 3, 0));
        assertTrue(gap);
        assertFalse(nonGap);
    }

    // =====================================================================
    // 17) adjustOffset branches
    // =====================================================================

    @Test
    public void testAdjustOffset_noOverlap_returnsSameInstant() {
        DateTimeZone z = new ConstantOffsetZone("AdjustNoOverlap", 100, true);
        assertEquals(5000L, z.adjustOffset(5000L, true));
        assertEquals(5000L, z.adjustOffset(5000L, false));
    }

    @Test
    public void testAdjustOffset_withDifference_earlier() {
        long t = 1000000000L;
        DateTimeZone z = new StepZone("AdjustEarlier", t, 0, 3600000);
        long instant = t + 1000000L;
        long result = z.adjustOffset(instant, false);
        assertEquals(instant, result); // คำนวณตาม algorithm ในซอร์ส (delegate branch)
    }

    @Test
    public void testAdjustOffset_withDifference_later() {
        long t = 1000000000L;
        DateTimeZone z = new StepZone("AdjustLater", t, 0, 3600000);
        long instant = t + 1000000L;
        long result = z.adjustOffset(instant, true);
        assertEquals(instant, result); // คำนวณตาม algorithm ในซอร์ส (fast-path branch)
    }

    // =====================================================================
    // 18) equals / hashCode / toString / toTimeZone
    // =====================================================================

    @Test
    public void testEqualsHashCodeToString_UTC() {
        assertTrue(DateTimeZone.UTC.equals(DateTimeZone.UTC));
        assertEquals(57 + "UTC".hashCode(), DateTimeZone.UTC.hashCode());
        assertEquals("UTC", DateTimeZone.UTC.toString());
    }

    @Test
    public void testToTimeZone() {
        TimeZone tz = DateTimeZone.UTC.toTimeZone();
        assertNotNull(tz);
    }

    // =====================================================================
    // 19) Serialization (writeReplace / Stub.readResolve)
    // =====================================================================

    @Test
    public void testSerialization_UTC_roundTrip() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(DateTimeZone.UTC);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        Object result = ois.readObject();
        ois.close();

        assertSame(DateTimeZone.UTC, result);
    }
}
```

## ตารางสรุป Test → Branch/Condition ที่ครอบคลุม

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| testConstructor_nullId_throws / testConstructor_validId | constructor: `id==null` throw / id ปกติ |
| testForID_null_returnsDefault | forID: `id==null` |
| testForID_UTCString | forID: `id.equals("UTC")` |
| testForID_knownProviderZone_ifAvailable | forID: `cProvider.getZone(id)!=null` |
| testForID_plusOffsetZero_returnsUTC | forID: startsWith "+", offset==0 |
| testForID_plusOffsetNonZero / minusOffsetNonZero | forID: startsWith "+"/"-", offset!=0, fixedOffsetZone |
| testForID_invalid_throws | forID: else throw IllegalArgumentException |
| testForOffsetHours_* | forOffsetHours delegate, zero/positive/negative |
| testForOffsetHoursMinutes_zeroZero | hours==0&&minutes==0 |
| testForOffsetHoursMinutes_minutesNegative/TooLarge_throws | minutesOffset out of range (<0, >59) |
| testForOffsetHoursMinutes_positiveHours/negativeHours | hoursInMinutes>=0 / <0 branch |
| testForOffsetHoursMinutes_overflow_throws | ArithmeticException catch → IllegalArgumentException |
| testForOffsetMillis_* | offset==0 → UTC / offset!=0 |
| testForTimeZone_null/UTC/convertedOldAlias/GMTDisplayName/unrecognized_throws | forTimeZone ทุก branch: null, "UTC", getConvertedId!=null, dtz==null, GMT+/- parsing, throw |
| testSetDefault_null_throws / valid | setDefault: zone==null throw / ปกติ |
| testGetAvailableIDs_containsUTC, testGetProvider_notNull | getter พื้นฐาน |
| testSetProvider_null_resetsToDefault | setProvider0: provider==null → getDefaultProvider |
| testSetProvider_emptyIds/noUTC/invalidUTCZone_throws | setProvider0: validation 3 branch throw |
| testSetProvider_valid_succeeds | setProvider0: success path |
| testGetNameProvider_notNull / setNameProvider_null/custom | setNameProvider0 branch |
| testGetShortName/getName_nameKeyNull_returnsId | nameKey==null branch |
| testGetShortName/getName_providerReturnsName | name!=null branch, locale!=null branch |
| testGetShortName/getName_providerReturnsNull_fallbackPrintOffset | name==null → printOffset fallback |
| testGetOffset_readableInstant_null/nonNull | getOffset(ReadableInstant): instant==null / !=null |
| testIsStandardOffset_trueAndFalse | isStandardOffset true/false |
| testConvertUTCToLocal_normal/overflow_throws | convertUTCToLocal ปกติ / overflow throw |
| testConvertLocalToUTC_noDifference/overflow_throws | offsetLocal==offset skip / overflow |
| testConvertLocalToUTC_gap_strict/lenient_positive/negativeOffsetLocal | `strict||offsetLocal<0` ทั้ง 2 เงื่อนไข, throw vs fallback |
| testConvertLocalToUTC_withOriginal_fastPath/delegate_* | offsetLocalFromOriginal==offsetOriginal / delegate branch |
| testGetOffsetFromLocal_branchA/B/C1/C2/C3/D | ทุก branch ของ getOffsetFromLocal |
| testGetMillisKeepLocal_sameZone/nullNewZone/differentZone | newZone==this / null→default / คำนวณจริง |
| testIsLocalDateTimeGap_fixedZone/realZone | isFixed()==true short-circuit / true-false gap จริง |
| testAdjustOffset_noOverlap/withDifference_earlier/later | instantBefore==instantAfter / delegate / fast-path |
| testEqualsHashCodeToString_UTC, testToTimeZone | instance method พื้นฐาน |
| testSerialization_UTC_roundTrip | writeReplace + Stub.readResolve → forID |