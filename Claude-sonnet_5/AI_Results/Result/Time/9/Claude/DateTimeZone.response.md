ด้านล่างนี้คือชุดทดสอบ JUnit 4 สำหรับ `org.joda.time.DateTimeZone` (Time-9b) ที่ออกแบบมาให้ครอบคลุม branch/condition ให้มากที่สุดเท่าที่วิเคราะห์ได้จาก source ที่ให้มา

ผมใช้เทคนิคสร้าง "fake DateTimeZone subclass" (GapZone, NegativeGapZone, OverlapZone) เพื่อควบคุม transition/offset แบบ deterministic สำหรับทดสอบ branch ที่ซับซ้อนอย่าง `getOffsetFromLocal`, `convertLocalToUTC`, `adjustOffset` โดยไม่ต้องพึ่งพาข้อมูล timezone จริงที่อาจไม่แน่นอน ส่วนที่ต้องพึ่งข้อมูลจริง (เช่น `America/Los_Angeles`, `Europe/London`) จะมีคอมเมนต์กำกับว่าอิงกับข้อมูลจริงของระบบ

```java
import static org.junit.Assert.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;

import org.joda.time.DateTimeZone;
import org.joda.time.IllegalInstantException;
import org.joda.time.Instant;
import org.joda.time.LocalDateTime;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DateTimeZoneTest {

    // ---------------------------------------------------------------
    // Fake zones สำหรับควบคุม branch ของ getOffsetFromLocal / convertLocalToUTC / adjustOffset
    // ---------------------------------------------------------------

    /** Gap zone: offset = 0 ก่อน T, +1h ตั้งแต่ T (จำลองตัวอย่างใน javadoc ของ getOffsetFromLocal) */
    private static final long GAP_T = 3600000L;
    private static class GapZone extends DateTimeZone {
        GapZone() { super("GapZone"); }
        public String getNameKey(long instant) { return null; }
        public int getOffset(long instant) { return instant < GAP_T ? 0 : 3600000; }
        public int getStandardOffset(long instant) { return 0; }
        public boolean isFixed() { return false; }
        public long nextTransition(long instant) { return instant < GAP_T ? GAP_T : instant; }
        public long previousTransition(long instant) { return instant > GAP_T ? GAP_T : instant; }
        public boolean equals(Object o) { return o instanceof GapZone; }
    }

    /** Gap zone แบบ offset ติดลบ (ซีกตะวันตกของ UTC): -1h ก่อน T, 0h ตั้งแต่ T */
    private static final long NEG_T = 3600000L;
    private static class NegativeGapZone extends DateTimeZone {
        NegativeGapZone() { super("NegGapZone"); }
        public String getNameKey(long instant) { return null; }
        public int getOffset(long instant) { return instant < NEG_T ? -3600000 : 0; }
        public int getStandardOffset(long instant) { return -3600000; }
        public boolean isFixed() { return false; }
        public long nextTransition(long instant) { return instant < NEG_T ? NEG_T : instant; }
        public long previousTransition(long instant) { return instant > NEG_T ? NEG_T : instant; }
        public boolean equals(Object o) { return o instanceof NegativeGapZone; }
    }

    /** Overlap zone: +1h ก่อน T, 0h ตั้งแต่ T (offset ลดลง -> overlap) */
    private static final long OVERLAP_T = 3600000L;
    private static class OverlapZone extends DateTimeZone {
        OverlapZone() { super("OverlapZone"); }
        public String getNameKey(long instant) { return null; }
        public int getOffset(long instant) { return instant < OVERLAP_T ? 3600000 : 0; }
        public int getStandardOffset(long instant) { return 0; }
        public boolean isFixed() { return false; }
        public long nextTransition(long instant) { return instant < OVERLAP_T ? OVERLAP_T : instant; }
        public long previousTransition(long instant) { return instant > OVERLAP_T ? OVERLAP_T : instant; }
        public boolean equals(Object o) { return o instanceof OverlapZone; }
    }

    /** TimeZone ปลอม ที่ id ไม่ตรงกับ map การแปลงใดๆ และไม่ใช่รูปแบบ GMT+/- */
    private static class FakeUnknownTimeZone extends TimeZone {
        private final String id;
        FakeUnknownTimeZone(String id) { this.id = id; setID(id); }
        public int getOffset(int era, int year, int month, int day, int dayOfWeek, int millis) { return 0; }
        public void setRawOffset(int offsetMillis) {}
        public int getRawOffset() { return 0; }
        public String getID() { return id; }
        public boolean useDaylightTime() { return false; }
        public boolean inDaylightTime(Date date) { return false; }
    }

    // ---------------------------------------------------------------
    // Save / restore global static state
    // ---------------------------------------------------------------

    private Provider originalProvider;
    private NameProvider originalNameProvider;
    private DateTimeZone originalDefault;

    @Before
    public void saveState() {
        originalProvider = DateTimeZone.getProvider();
        originalNameProvider = DateTimeZone.getNameProvider();
        originalDefault = DateTimeZone.getDefault();
    }

    @After
    public void restoreState() {
        DateTimeZone.setProvider(originalProvider);
        DateTimeZone.setNameProvider(originalNameProvider);
        DateTimeZone.setDefault(originalDefault);
        System.clearProperty("org.joda.time.DateTimeZone.Provider");
        System.clearProperty("org.joda.time.DateTimeZone.NameProvider");
    }

    // ---------------------------------------------------------------
    // forID
    // ---------------------------------------------------------------

    @Test
    public void testForID_NullReturnsDefault() {
        assertSame(DateTimeZone.getDefault(), DateTimeZone.forID(null));
    }

    @Test
    public void testForID_UTCLiteral() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
    }

    @Test
    public void testForID_FixedOffsetPositiveAndNegative() {
        // อ้างอิงพฤติกรรมมาตรฐานของ joda-time: forID("+02:00") ให้ offset = +2h
        DateTimeZone plus = DateTimeZone.forID("+02:00");
        assertEquals("+02:00", plus.getID());
        assertEquals(7200000, plus.getOffset(0L));

        DateTimeZone minus = DateTimeZone.forID("-02:30");
        assertEquals("-02:30", minus.getID());
        assertEquals(-9000000, minus.getOffset(0L));
    }

    @Test
    public void testForID_ZeroOffsetReturnsUTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("+00:00"));
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("-00:00"));
    }

    @Test
    public void testForID_UnknownThrows() {
        try {
            DateTimeZone.forID("Bogus/Unknown");
            fail("ควร throw IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            assertEquals("The datetime zone id 'Bogus/Unknown' is not recognised", ex.getMessage());
        }
    }

    @Test
    public void testForID_EmptyThrows() {
        try {
            DateTimeZone.forID("");
            fail("ควร throw IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            // คาดหวังตามโครงสร้างโค้ด
        }
    }

    @Test
    public void testForID_RealRegionIfAvailable() {
        // สมมติว่า ZoneInfoProvider มีข้อมูล Europe/London อยู่ใน classpath ของโปรเจกต์จริง
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        assertEquals("Europe/London", zone.getID());
    }

    // ---------------------------------------------------------------
    // forOffsetHours / forOffsetHoursMinutes / forOffsetMillis
    // ---------------------------------------------------------------

    @Test
    public void testForOffsetHours_BoundaryAndZero() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHours(0));

        DateTimeZone plus23 = DateTimeZone.forOffsetHours(23);
        assertEquals("+23:00", plus23.getID());
        assertEquals(23 * 3600000, plus23.getOffset(0L));

        DateTimeZone minus23 = DateTimeZone.forOffsetHours(-23);
        assertEquals("-23:00", minus23.getID());
        assertEquals(-23 * 3600000, minus23.getOffset(0L));
    }

    @Test
    public void testForOffsetHoursMinutes_SignHandling() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHoursMinutes(0, 0));

        DateTimeZone pos = DateTimeZone.forOffsetHoursMinutes(2, 30);
        assertEquals("+02:30", pos.getID());
        assertEquals(9000000, pos.getOffset(0L));

        DateTimeZone neg = DateTimeZone.forOffsetHoursMinutes(-2, 30);
        assertEquals("-02:30", neg.getID());
        assertEquals(-9000000, neg.getOffset(0L));
    }

    @Test
    public void testForOffsetHoursMinutes_MinutesOutOfRangeThrows() {
        try {
            DateTimeZone.forOffsetHoursMinutes(1, -1);
            fail();
        } catch (IllegalArgumentException ex) {
            assertEquals("Minutes out of range: -1", ex.getMessage());
        }
        try {
            DateTimeZone.forOffsetHoursMinutes(1, 60);
            fail();
        } catch (IllegalArgumentException ex) {
            assertEquals("Minutes out of range: 60", ex.getMessage());
        }
    }

    @Test
    public void testForOffsetHoursMinutes_OverflowThrows() {
        try {
            DateTimeZone.forOffsetHoursMinutes(Integer.MAX_VALUE, 30);
            fail();
        } catch (IllegalArgumentException ex) {
            assertEquals("Offset is too large", ex.getMessage());
        }
    }

    @Test
    public void testForOffsetMillis_ZeroPositiveNegative() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0));

        DateTimeZone pos = DateTimeZone.forOffsetMillis(3600000);
        assertEquals("+01:00", pos.getID());

        DateTimeZone neg = DateTimeZone.forOffsetMillis(-3600000);
        assertEquals("-01:00", neg.getID());
    }

    // ---------------------------------------------------------------
    // forTimeZone
    // ---------------------------------------------------------------

    @Test
    public void testForTimeZone_NullReturnsDefault() {
        assertSame(DateTimeZone.getDefault(), DateTimeZone.forTimeZone(null));
    }

    @Test
    public void testForTimeZone_UTCLiteral() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void testForTimeZone_GMTAlias() {
        // "GMT" ถูกแปลงผ่าน getConvertedId -> "UTC" แล้วหาผ่าน provider
        DateTimeZone zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT"));
        assertTrue(DateTimeZone.UTC.equals(zone));
    }

    @Test
    public void testForTimeZone_GMTOffsetFormats() {
        // สมมติ: JDK คืน TimeZone ที่ getID() เป็น "GMT+02:00" ตรงตามรูปแบบที่ป้อน
        DateTimeZone plus = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+02:00"));
        assertEquals("+02:00", plus.getID());

        DateTimeZone minus = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT-02:00"));
        assertEquals("-02:00", minus.getID());
    }

    @Test
    public void testForTimeZone_UnknownThrows() {
        try {
            DateTimeZone.forTimeZone(new FakeUnknownTimeZone("Nonsense/Zone"));
            fail();
        } catch (IllegalArgumentException ex) {
            assertEquals("The datetime zone id 'Nonsense/Zone' is not recognised", ex.getMessage());
        }
    }

    // ---------------------------------------------------------------
    // Provider
    // ---------------------------------------------------------------

    @Test
    public void testGetAvailableIDs() {
        Set<String> ids = DateTimeZone.getAvailableIDs();
        assertNotNull(ids);
        assertTrue(ids.contains("UTC"));
    }

    @Test
    public void testProvider_GetSet_Success() {
        Provider custom = new Provider() {
            public Set<String> getAvailableIDs() {
                Set<String> s = new HashSet<String>();
                s.add("UTC");
                return s;
            }
            public DateTimeZone getZone(String id) {
                return "UTC".equals(id) ? DateTimeZone.UTC : null;
            }
        };
        DateTimeZone.setProvider(custom);
        assertSame(custom, DateTimeZone.getProvider());
        assertEquals(1, DateTimeZone.getAvailableIDs().size());
    }

    @Test
    public void testProvider_SetNull_FallbackDefault() {
        DateTimeZone.setProvider(null);
        assertNotNull(DateTimeZone.getProvider());
        assertTrue(DateTimeZone.getAvailableIDs().contains("UTC"));
    }

    @Test
    public void testProvider_SetInvalid_EmptyIds_Throws() {
        Provider empty = new Provider() {
            public Set<String> getAvailableIDs() { return new HashSet<String>(); }
            public DateTimeZone getZone(String id) { return null; }
        };
        try {
            DateTimeZone.setProvider(empty);
            fail();
        } catch (IllegalArgumentException ex) {
            assertEquals("The provider doesn't have any available ids", ex.getMessage());
        }
    }

    @Test
    public void testProvider_SetInvalid_NoUTC_Throws() {
        Provider noUtc = new Provider() {
            public Set<String> getAvailableIDs() {
                Set<String> s = new HashSet<String>();
                s.add("Foo");
                return s;
            }
            public DateTimeZone getZone(String id) { return null; }
        };
        try {
            DateTimeZone.setProvider(noUtc);
            fail();
        } catch (IllegalArgumentException ex) {
            assertEquals("The provider doesn't support UTC", ex.getMessage());
        }
    }

    @Test
    public void testProvider_SetInvalid_WrongUTC_Throws() {
        Provider wrongUtc = new Provider() {
            public Set<String> getAvailableIDs() {
                Set<String> s = new HashSet<String>();
                s.add("UTC");
                return s;
            }
            public DateTimeZone getZone(String id) {
                return DateTimeZone.forOffsetHours(1);
            }
        };
        try {
            DateTimeZone.setProvider(wrongUtc);
            fail();
        } catch (IllegalArgumentException ex) {
            assertEquals("Invalid UTC zone provided", ex.getMessage());
        }
    }

    @Test
    public void testProvider_DefaultProviderClassLoadFailureFallback() {
        // บังคับให้ getDefaultProvider() เจอ Class.forName ล้มเหลว -> ตก catch -> fallback
        System.setProperty("org.joda.time.DateTimeZone.Provider", "no.such.ClassXYZ");
        DateTimeZone.setProvider(null); // ไม่ควร throw ออกมา (exception ถูก swallow ภายใน)
        assertNotNull(DateTimeZone.getProvider());
        assertTrue(DateTimeZone.getAvailableIDs().contains("UTC"));
    }

    // ---------------------------------------------------------------
    // NameProvider
    // ---------------------------------------------------------------

    @Test
    public void testNameProvider_GetSet() {
        assertNotNull(DateTimeZone.getNameProvider());
    }

    @Test
    public void testNameProvider_SetNull_FallbackDefault() {
        DateTimeZone.setNameProvider(null);
        assertNotNull(DateTimeZone.getNameProvider());
    }

    @Test
    public void testNameProvider_DefaultClassLoadFailureFallback() {
        System.setProperty("org.joda.time.DateTimeZone.NameProvider", "no.such.ClassABC");
        DateTimeZone.setNameProvider(null);
        assertNotNull(DateTimeZone.getNameProvider());
    }

    // ---------------------------------------------------------------
    // Default zone
    // ---------------------------------------------------------------

    @Test
    public void testSetDefault_NullThrows() {
        try {
            DateTimeZone.setDefault(null);
            fail();
        } catch (IllegalArgumentException ex) {
            assertEquals("The datetime zone must not be null", ex.getMessage());
        }
    }

    @Test
    public void testSetDefault_AndGetDefault() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        DateTimeZone.setDefault(zone);
        assertSame(zone, DateTimeZone.getDefault());
    }

    @Test
    public void testGetDefault_NotNullAndCached() {
        DateTimeZone d1 = DateTimeZone.getDefault();
        DateTimeZone d2 = DateTimeZone.getDefault();
        assertNotNull(d1);
        assertSame(d1, d2);
    }

    // ---------------------------------------------------------------
    // Basic instance methods
    // ---------------------------------------------------------------

    @Test
    public void testGetID_ToString_HashCode() {
        assertEquals("UTC", DateTimeZone.UTC.getID());
        assertEquals("UTC", DateTimeZone.UTC.toString());
        assertEquals(57 + "UTC".hashCode(), DateTimeZone.UTC.hashCode());
    }

    @Test
    public void testEquals_Basic() {
        assertTrue(DateTimeZone.UTC.equals(DateTimeZone.UTC));
        assertFalse(DateTimeZone.UTC.equals("UTC"));
        assertFalse(DateTimeZone.UTC.equals(null));
    }

    @Test
    public void testToTimeZone() {
        assertEquals("UTC", DateTimeZone.UTC.toTimeZone().getID());
    }

    @Test
    public void testIsFixed() {
        assertTrue(DateTimeZone.UTC.isFixed());
        assertFalse(new GapZone().isFixed());
    }

    @Test
    public void testGetOffset_ReadableInstantOverload() {
        assertEquals(0, DateTimeZone.UTC.getOffset((org.joda.time.ReadableInstant) null));
        assertEquals(0, DateTimeZone.UTC.getOffset(new Instant(0L)));
    }

    @Test
    public void testIsStandardOffset() {
        assertTrue(DateTimeZone.UTC.isStandardOffset(0L));
        GapZone gz = new GapZone();
        assertTrue(gz.isStandardOffset(0L));       // offset 0 == standard 0
        assertFalse(gz.isStandardOffset(3600000L)); // offset +1h != standard 0
    }

    @Test
    public void testGetShortName_NameKeyNullReturnsId() {
        GapZone gz = new GapZone();
        assertEquals("GapZone", gz.getShortName(0L));
        assertEquals("GapZone", gz.getShortName(0L, null));
        assertEquals("GapZone", gz.getShortName(0L, Locale.US));
    }

    @Test
    public void testGetShortName_WithRealNameKey() {
        // UTC มี nameKey ไม่เป็น null -> ไม่เข้า branch "return iID" ทันที
        String name = DateTimeZone.UTC.getShortName(0L, Locale.US);
        assertNotNull(name);
    }

    @Test
    public void testGetName_NameKeyNullReturnsId() {
        GapZone gz = new GapZone();
        assertEquals("GapZone", gz.getName(0L));
        assertEquals("GapZone", gz.getName(0L, null));
    }

    // ---------------------------------------------------------------
    // convertUTCToLocal / convertLocalToUTC
    // ---------------------------------------------------------------

    @Test
    public void testConvertUTCToLocal_NoOffsetAndOverflow() {
        assertEquals(123456789L, DateTimeZone.UTC.convertUTCToLocal(123456789L));

        DateTimeZone plus1h = DateTimeZone.forOffsetHours(1);
        try {
            plus1h.convertUTCToLocal(Long.MAX_VALUE);
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test
    public void testConvertLocalToUTC_TwoArg_NoGap_AndOverflow() {
        assertEquals(123L, DateTimeZone.UTC.convertLocalToUTC(123L, true));
        assertEquals(123L, DateTimeZone.UTC.convertLocalToUTC(123L, false));

        DateTimeZone plus1h = DateTimeZone.forOffsetHours(1);
        try {
            plus1h.convertLocalToUTC(Long.MIN_VALUE, false);
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test
    public void testConvertLocalToUTC_TwoArg_GapPositiveOffset_StrictThrowsNonStrictNoThrow() {
        GapZone gz = new GapZone();
        long localInGap = 5400000L; // 01:30 ซึ่งอยู่ในช่วง gap ตาม javadoc
        try {
            gz.convertLocalToUTC(localInGap, true);
            fail("ควร throw IllegalInstantException เมื่อ strict=true และอยู่ใน gap");
        } catch (IllegalInstantException ex) {
            // expected
        }
        // strict=false และ offsetLocal >= 0 (ซีกตะวันออก) -> ไม่ตรวจ gap, ไม่ throw
        long result = gz.convertLocalToUTC(localInGap, false);
        assertEquals(localInGap, result);
    }

    @Test
    public void testConvertLocalToUTC_TwoArg_GapNegativeOffset_StrictThrowsNonStrictAdjust() {
        NegativeGapZone ngz = new NegativeGapZone();
        long localInGap = 1800000L;
        try {
            ngz.convertLocalToUTC(localInGap, true);
            fail("ควร throw IllegalInstantException เมื่อ strict=true และอยู่ใน gap");
        } catch (IllegalInstantException ex) {
            // expected
        }
        long result = ngz.convertLocalToUTC(localInGap, false);
        assertEquals(5400000L, result); // offset ถูกปรับเป็น offsetLocal (-3600000)
    }

    @Test
    public void testConvertLocalToUTC_ThreeArg_SameOffsetShortCircuit() {
        long result = DateTimeZone.UTC.convertLocalToUTC(100L, false, 50L);
        assertEquals(100L, result);
    }

    @Test
    public void testConvertLocalToUTC_ThreeArg_DifferentOffsetDelegates() {
        GapZone gz = new GapZone();
        // originalInstantUTC อยู่ก่อน transition (offset=0), instantLocal อยู่ในช่วงหลัง transition
        long result = gz.convertLocalToUTC(7200000L, false, 0L);
        // offsetOriginal=0 -> instantUTC=7200000 -> offset ที่ instantUTC(7200000)=DST(3600000) != offsetOriginal(0)
        // จึงต้อง delegate ไปยัง convertLocalToUTC(instantLocal, strict) ซึ่งคำนวณใหม่
        assertEquals(gz.convertLocalToUTC(7200000L, false), result);
    }

    // ---------------------------------------------------------------
    // getMillisKeepLocal
    // ---------------------------------------------------------------

    @Test
    public void testGetMillisKeepLocal_NullZone_SameZone_DifferentZone() {
        DateTimeZone.setDefault(DateTimeZone.UTC);
        assertEquals(12345L, DateTimeZone.UTC.getMillisKeepLocal(null, 12345L));
        assertEquals(999L, DateTimeZone.UTC.getMillisKeepLocal(DateTimeZone.UTC, 999L));

        DateTimeZone plus2h = DateTimeZone.forOffsetHours(2);
        long result = DateTimeZone.UTC.getMillisKeepLocal(plus2h, 0L);
        assertEquals(-7200000L, result);
    }

    // ---------------------------------------------------------------
    // isLocalDateTimeGap
    // ---------------------------------------------------------------

    @Test
    public void testIsLocalDateTimeGap_FixedZoneAlwaysFalse() {
        assertFalse(DateTimeZone.UTC.isLocalDateTimeGap(new LocalDateTime(2000, 1, 1, 0, 0)));
    }

    @Test
    public void testIsLocalDateTimeGap_RealZoneIfAvailable() {
        // อ้างอิงข้อมูล tz จริงของระบบ: America/Los_Angeles spring-forward 2007-03-11 02:00->03:00
        DateTimeZone la = DateTimeZone.forID("America/Los_Angeles");
        assertTrue(la.isLocalDateTimeGap(new LocalDateTime(2007, 3, 11, 2, 30, 0)));
        assertFalse(la.isLocalDateTimeGap(new LocalDateTime(2007, 1, 1, 12, 0, 0)));
    }

    // ---------------------------------------------------------------
    // adjustOffset
    // ---------------------------------------------------------------

    @Test
    public void testAdjustOffset_GapZone_NoOverlap() {
        GapZone gz = new GapZone();
        assertEquals(GAP_T, gz.adjustOffset(GAP_T, true));
        assertEquals(GAP_T, gz.adjustOffset(GAP_T, false));
    }

    @Test
    public void testAdjustOffset_OverlapZone_InsideWindow_BothBranches() {
        OverlapZone oz = new OverlapZone();
        // afterStart >= diff -> "currently in later offset"
        assertEquals(3600000L, oz.adjustOffset(3600000L, true));
        assertEquals(0L, oz.adjustOffset(3600000L, false));

        // afterStart < diff -> "currently in earlier offset"
        assertEquals(4600000L, oz.adjustOffset(1000000L, true));
        assertEquals(1000000L, oz.adjustOffset(1000000L, false));
    }

    @Test
    public void testAdjustOffset_OverlapZone_OutsideWindow_BothSides() {
        OverlapZone oz = new OverlapZone();
        assertEquals(8000000L, oz.adjustOffset(8000000L, true));   // instant >= overlapEnd
        assertEquals(-1000000L, oz.adjustOffset(-1000000L, true)); // instant < overlapStart
    }

    // ---------------------------------------------------------------
    // getOffsetFromLocal
    // ---------------------------------------------------------------

    @Test
    public void testGetOffsetFromLocal_GapZone_MatchesJavadoc() {
        GapZone gz = new GapZone();
        // Input -> expected offset o, ตรวจผ่าน formula: millisUTC = input - o; output = millisUTC + getOffset(millisUTC)
        assertEquals(0, gz.getOffsetFromLocal(0L));         // 00:00 -> 00:00
        assertEquals(0, gz.getOffsetFromLocal(1800000L));   // 00:30 -> 00:30
        assertEquals(0, gz.getOffsetFromLocal(3600000L));   // 01:00 -> 02:00 (gap)
        assertEquals(0, gz.getOffsetFromLocal(5400000L));   // 01:30 -> 02:30 (gap)
        assertEquals(3600000, gz.getOffsetFromLocal(7200000L)); // 02:00 -> 02:00
        assertEquals(3600000, gz.getOffsetFromLocal(9000000L)); // 02:30 -> 02:30
    }

    @Test
    public void testGetOffsetFromLocal_NegativeOffsetGap_BothSubBranches() {
        NegativeGapZone ngz = new NegativeGapZone();
        // nextLocal != nextAdjusted -> return offsetLocal
        assertEquals(-3600000, ngz.getOffsetFromLocal(1800000L));
        // nextLocal == nextAdjusted -> fall through, return offsetAdjusted
        assertEquals(0, ngz.getOffsetFromLocal(0L));
    }

    @Test
    public void testGetOffsetFromLocal_EqualOffsets_NegativeSkipsElseIf() {
        NegativeGapZone ngz = new NegativeGapZone();
        // ไกลมากก่อน transition: offsetLocal==offsetAdjusted (ทั้งคู่ STD, ลบ) -> else-if (offsetLocal>=0) เป็น false
        assertEquals(-3600000, ngz.getOffsetFromLocal(-10000000L));
    }

    @Test
    public void testGetOffsetFromLocal_EqualOffsets_PrevNotBeforeInstantAdjusted() {
        GapZone gz = new GapZone();
        // ไกลมากหลัง transition: offsetLocal==offsetAdjusted, else-if true, prev<instantAdjusted -> true
        // แต่ instantAdjusted-prev > diff -> คืน offsetAdjusted
        assertEquals(3600000, gz.getOffsetFromLocal(10000000L));
    }

    @Test
    public void testGetOffsetFromLocal_RealOverlap_FavoursDaylightIfAvailable() {
        // ตาม javadoc: "...always favour daylight (summer) time over standard (winter) time."
        // America/Los_Angeles fall-back 2007-11-04 02:00 PDT(-7) -> 01:00 PST(-8)
        DateTimeZone la = DateTimeZone.forID("America/Los_Angeles");
        long instantLocal = new LocalDateTime(2007, 11, 4, 1, 30, 0).toDateTime(DateTimeZone.UTC).getMillis();
        int offset = la.getOffsetFromLocal(instantLocal);
        assertEquals(-25200000, offset); // PDT = UTC-7
    }

    // ---------------------------------------------------------------
    // nextTransition / previousTransition (fixed zone)
    // ---------------------------------------------------------------

    @Test
    public void testNextPreviousTransition_FixedZone() {
        // สมมติพฤติกรรมมาตรฐานของ FixedDateTimeZone: ไม่มี transition จะคืน instant เดิม
        assertEquals(12345L, DateTimeZone.UTC.nextTransition(12345L));
        assertEquals(12345L, DateTimeZone.UTC.previousTransition(12345L));
    }
}
```

## สรุปตาราง Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testForID_NullReturnsDefault | `forID`: `id == null` |
| testForID_UTCLiteral | `forID`: `id.equals("UTC")` |
| testForID_FixedOffsetPositiveAndNegative | `forID`: `startsWith("+"/"-")`, `offset != 0` |
| testForID_ZeroOffsetReturnsUTC | `forID`: `offset == 0L` |
| testForID_UnknownThrows / Empty | `forID`: throw ไม่พบ id |
| testForID_RealRegionIfAvailable | `forID`: `cProvider.getZone(id) != null` |
| testForOffsetHours_BoundaryAndZero | `forOffsetHoursMinutes`: hoursOffset==0&&minutesOffset==0, hoursInMinutes>=0/<0 |
| testForOffsetHoursMinutes_SignHandling | branch `hoursInMinutes < 0` ทั้ง true/false |
| testForOffsetHoursMinutes_MinutesOutOfRangeThrows | `minutesOffset<0 \|\| >59` |
|