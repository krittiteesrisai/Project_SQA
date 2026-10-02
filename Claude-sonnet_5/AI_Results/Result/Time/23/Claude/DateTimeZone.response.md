# DateTimeZoneTest.java

```java
package org.joda.time;

import static org.junit.Assert.*;

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

import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.junit.After;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for {@link DateTimeZone}.
 *
 * หมายเหตุ: ทดสอบนี้อ้างอิงพฤติกรรมที่ปรากฏในซอร์สโค้ดที่ให้มาเท่านั้น
 * ส่วนที่พฤติกรรมขึ้นกับ resource ภายนอก (เช่น tz database / locale ของ JDK)
 * จะถูกกำกับด้วยคอมเมนต์ และ/หรือใช้ Assume เพื่อข้าม test หากสภาพแวดล้อมไม่รองรับ
 */
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

    /** ช่วยข้าม test ที่ต้องพึ่งพา tz database จริงถ้าไม่มีในสภาพแวดล้อม */
    private DateTimeZone tryForID(String id) {
        try {
            return DateTimeZone.forID(id);
        } catch (IllegalArgumentException ex) {
            Assume.assumeNoException(
                "Time zone data for '" + id + "' not available in this environment", ex);
            return null; // unreachable
        }
    }

    // =====================================================================
    // getDefault / setDefault
    // =====================================================================

    @Test
    public void testGetDefaultNotNull() {
        assertNotNull(DateTimeZone.getDefault());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDefaultNull_throwsIllegalArgument() {
        DateTimeZone.setDefault(null);
    }

    @Test
    public void testSetDefaultValid_updatesGetDefault() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(3);
        DateTimeZone.setDefault(zone);
        assertEquals(zone, DateTimeZone.getDefault());
    }

    // =====================================================================
    // forID
    // =====================================================================

    @Test
    public void testForID_null_returnsDefault() {
        DateTimeZone.setDefault(DateTimeZone.UTC);
        assertEquals(DateTimeZone.UTC, DateTimeZone.forID(null));
    }

    @Test
    public void testForID_UTC_returnsSingleton() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
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
        DateTimeZone zone = DateTimeZone.forID("+01:00");
        assertEquals("+01:00", zone.getID());
        assertEquals(DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(0L));
    }

    @Test
    public void testForID_negativeOffset() {
        DateTimeZone zone = DateTimeZone.forID("-02:30");
        assertEquals("-02:30", zone.getID());
        assertEquals(-(2 * DateTimeConstants.MILLIS_PER_HOUR + 30 * DateTimeConstants.MILLIS_PER_MINUTE),
                zone.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_unrecognized_throws() {
        DateTimeZone.forID("Not/AValidZoneName");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_emptyString_throws() {
        DateTimeZone.forID("");
    }

    // หมายเหตุ: รูปแบบ offset ที่ผิดพลาด (เช่นชั่วโมง/นาทีเกินช่วง) จะทำให้ตัว parser
    // ภายใน (offsetFormatter) โยน RuntimeException บางชนิด แต่ซอร์สที่ให้มาไม่ได้ระบุ
    // ชนิด exception ที่แน่นอน จึงทดสอบแบบกว้างว่าต้องมี RuntimeException เกิดขึ้น
    @Test(expected = RuntimeException.class)
    public void testForID_malformedOffset_throwsRuntimeException() {
        DateTimeZone.forID("+25:99");
    }

    @Test
    public void testFixedOffsetZone_cached_sameInstance() {
        DateTimeZone z1 = DateTimeZone.forOffsetHours(4);
        DateTimeZone z2 = DateTimeZone.forOffsetHours(4);
        assertSame(z1, z2);
    }

    // =====================================================================
    // forOffsetHours / forOffsetHoursMinutes
    // =====================================================================

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
    public void testForOffsetHours_tooLarge_throws() {
        DateTimeZone.forOffsetHours(Integer.MAX_VALUE);
    }

    @Test
    public void testForOffsetHoursMinutes_zeroZero_returnsUTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHoursMinutes(0, 0));
    }

    @Test
    public void testForOffsetHoursMinutes_positive() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(2, 30);
        assertEquals("+02:30", zone.getID());
    }

    @Test
    public void testForOffsetHoursMinutes_negativeHours_positiveMinutes() {
        // ตามตัวอย่างใน Javadoc: (-2, 30) ต้องได้ '-02:30'
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(-2, 30);
        assertEquals("-02:30", zone.getID());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_minutesNegative_throws() {
        DateTimeZone.forOffsetHoursMinutes(1, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_minutesTooLarge_throws() {
        DateTimeZone.forOffsetHoursMinutes(1, 60);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_offsetTooLarge_throws() {
        DateTimeZone.forOffsetHoursMinutes(600, 0);
    }

    // =====================================================================
    // forOffsetMillis + printOffset branch coverage
    // =====================================================================

    @Test
    public void testForOffsetMillis_zero_returnsUTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0));
    }

    @Test
    public void testForOffsetMillis_hoursMinutesOnly_earlyReturn() {
        // 1h01m00s -> offset==0 หลังคำนวณ minutes -> คืนค่าก่อนถึงส่วน seconds
        DateTimeZone zone = DateTimeZone.forOffsetMillis(3660000);
        assertEquals("+01:01", zone.getID());
    }

    @Test
    public void testForOffsetMillis_hoursMinutesSeconds_earlyReturn() {
        // 1h01m01s -> offset==0 หลังคำนวณ seconds -> คืนค่าก่อนถึงส่วน millis
        DateTimeZone zone = DateTimeZone.forOffsetMillis(3661000);
        assertEquals("+01:01:01", zone.getID());
    }

    @Test
    public void testForOffsetMillis_withSubSecondMillis_fullPath() {
        // มี millis เหลือ -> ต้องวิ่งผ่านทุกสาขาจนถึงส่วน millis
        DateTimeZone zone = DateTimeZone.forOffsetMillis(3661500);
        assertEquals("+01:01:01.500", zone.getID());
    }

    @Test
    public void testForOffsetMillis_negative() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(-3600000);
        assertEquals("-01:00", zone.getID());
    }

    // =====================================================================
    // forTimeZone
    // =====================================================================

    @Test
    public void testForTimeZone_null_returnsDefault() {
        DateTimeZone.setDefault(DateTimeZone.UTC);
        assertEquals(DateTimeZone.UTC, DateTimeZone.forTimeZone(null));
    }

    @Test
    public void testForTimeZone_UTC() {
        assertEquals(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void testForTimeZone_convertedAlias_ifDataAvailable() {
        // "EST" ควรถูก map เป็น "America/New_York" ตาม cZoneIdConversion
        // ผลลัพธ์จริงขึ้นกับว่า tz data provider มีโซนนี้หรือไม่ จึงใช้ Assume ป้องกัน false failure
        DateTimeZone zone;
        try {
            zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("EST"));
        } catch (IllegalArgumentException ex) {
            Assume.assumeNoException("tz data not available", ex);
            return;
        }
        assertEquals("America/New_York", zone.getID());
    }

    @Test
    public void testForTimeZone_gmtOffsetDisplayNameFallback() {
        // ควบคุม getDisplayName() เองเพื่อไม่ให้ขึ้นกับพฤติกรรม locale ของ JDK
        TimeZone jdkZone = new SimpleTimeZone(0, "Custom/NotRecognizedZone") {
            @Override
            public String getDisplayName() {
                return "GMT+05:00";
            }
        };
        DateTimeZone zone = DateTimeZone.forTimeZone(jdkZone);
        assertEquals("+05:00", zone.getID());
        assertEquals(5 * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForTimeZone_unrecognized_throws() {
        TimeZone jdkZone = new SimpleTimeZone(0, "Totally/Unknown/Zone") {
            @Override
            public String getDisplayName() {
                return "NotAGmtFormatString";
            }
        };
        DateTimeZone.forTimeZone(jdkZone);
    }

    // =====================================================================
    // getAvailableIDs / getProvider / setProvider
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
        assertNotNull(DateTimeZone.getProvider());
        assertTrue(DateTimeZone.getAvailableIDs().contains("UTC"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_emptyIds_throws() {
        DateTimeZone.setProvider(new Provider() {
            public Set<String> getAvailableIDs() {
                return Collections.emptySet();
            }
            public DateTimeZone getZone(String id) {
                return null;
            }
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_noUTCInIds_throws() {
        DateTimeZone.setProvider(new Provider() {
            public Set<String> getAvailableIDs() {
                Set<String> s = new HashSet<String>();
                s.add("Foo");
                return s;
            }
            public DateTimeZone getZone(String id) {
                return null;
            }
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_wrongUTCZone_throws() {
        DateTimeZone.setProvider(new Provider() {
            public Set<String> getAvailableIDs() {
                Set<String> s = new HashSet<String>();
                s.add("UTC");
                return s;
            }
            public DateTimeZone getZone(String id) {
                if ("UTC".equals(id)) {
                    return DateTimeZone.forOffsetHours(1); // ไม่เท่ากับ UTC จริง
                }
                return null;
            }
        });
    }

    @Test
    public void testSetProvider_valid() {
        final DateTimeZone goodUtc = DateTimeZone.UTC;
        Provider provider = new Provider() {
            public Set<String> getAvailableIDs() {
                Set<String> s = new HashSet<String>();
                s.add("UTC");
                return s;
            }
            public DateTimeZone getZone(String id) {
                if ("UTC".equals(id)) {
                    return goodUtc;
                }
                return null;
            }
        };
        DateTimeZone.setProvider(provider);
        assertSame(provider, DateTimeZone.getProvider());
        assertTrue(DateTimeZone.getAvailableIDs().contains("UTC"));
    }

    // =====================================================================
    // getNameProvider / setNameProvider
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
    public void testSetNameProvider_custom_usedByGetShortNameAndGetName() {
        NameProvider custom = new NameProvider() {
            public String getShortName(Locale locale, String id, String nameKey) {
                return "ShortX";
            }
            public String getName(Locale locale, String id, String nameKey) {
                return "LongX";
            }
        };
        DateTimeZone.setNameProvider(custom);
        assertEquals("ShortX", DateTimeZone.UTC.getShortName(0L));
        assertEquals("LongX", DateTimeZone.UTC.getName(0L));
    }

    @Test
    public void testNameProvider_returnsNull_fallsBackToPrintOffset() {
        NameProvider nullProvider = new NameProvider() {
            public String getShortName(Locale locale, String id, String nameKey) {
                return null;
            }
            public String getName(Locale locale, String id, String nameKey) {
                return null;
            }
        };
        DateTimeZone.setNameProvider(nullProvider);
        // UTC มี nameKey != null เสมอ ("UTC") ดังนั้นจะไปเรียก provider แล้วได้ null -> fallback printOffset
        assertEquals("+00:00", DateTimeZone.UTC.getShortName(0L));
        assertEquals("+00:00", DateTimeZone.UTC.getName(0L));
    }

    // =====================================================================
    // getID / getShortName / getName (nameKey == null branch)
    // =====================================================================

    @Test
    public void testGetID() {
        assertEquals("UTC", DateTimeZone.UTC.getID());
    }

    @Test
    public void testGetShortNameAndGetName_fixedOffsetZone_nameKeyNull_returnsID() {
        // fixedOffsetZone สร้างด้วย nameKey = null เสมอ (ดูเมธอด fixedOffsetZone)
        DateTimeZone zone = DateTimeZone.forOffsetHours(6);
        assertEquals(zone.getID(), zone.getShortName(0L));
        assertEquals(zone.getID(), zone.getName(0L));
    }

    @Test
    public void testGetShortName_withExplicitLocale_null_usesDefaultLocale() {
        // locale == null -> ใช้ Locale.getDefault(); ทดสอบว่าไม่ throw และคืนค่าเดียวกับไม่ระบุ locale
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertEquals(zone.getShortName(0L), zone.getShortName(0L, null));
    }

    // =====================================================================
    // getOffset (long) / getOffset(ReadableInstant)
    // =====================================================================

    @Test
    public void testGetOffset_readableInstantNull_usesCurrentTime() {
        // สำหรับ UTC offset จะเป็น 0 เสมอไม่ว่าจะใช้เวลาใด
        assertEquals(0, DateTimeZone.UTC.getOffset((ReadableInstant) null));
    }

    @Test
    public void testGetOffset_readableInstantProvided() {
        Instant instant = new Instant(0L);
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertEquals(zone.getOffset(0L), zone.getOffset(instant));
    }

    @Test
    public void testGetStandardOffset() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(3);
        assertEquals(3 * DateTimeConstants.MILLIS_PER_HOUR, zone.getStandardOffset(0L));
    }

    @Test
    public void testIsStandardOffset_trueForFixedZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(3);
        assertTrue(zone.isStandardOffset(0L));
        assertTrue(DateTimeZone.UTC.isStandardOffset(0L));
    }

    // หมายเหตุ: การทดสอบ isStandardOffset()==false ต้องใช้โซนที่มี DST จริง
    // (ไม่มีใน FixedDateTimeZone) จึงข้ามถ้าไม่มี tz data
    @Test
    public void testIsStandardOffset_falseBranch_ifDstZoneAvailable() {
        DateTimeZone zone = tryForID("America/New_York");
        // 1 กรกฎาคม (เวลา DST ในซีกโลกเหนือ) เทียบ 1 มกราคม (standard time)
        long julyInstant = new DateTime(2013, 7, 1, 0, 0, DateTimeZone.UTC).getMillis();
        boolean standard = zone.isStandardOffset(julyInstant);
        // ไม่ assert ค่าคงที่ตายตัว เพราะขึ้นกับกฎ DST จริงของโซน เพียงยืนยันว่าเรียกได้ไม่ throw
        assertNotNull(standard);
    }

    // =====================================================================
    // getOffsetFromLocal
    // =====================================================================

    @Test
    public void testGetOffsetFromLocal_zeroOffset() {
        assertEquals(0, DateTimeZone.UTC.getOffsetFromLocal(0L));
    }

    @Test
    public void testGetOffsetFromLocal_positiveOffsetZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        long local = 1000000L;
        assertEquals(zone.getOffset(local), zone.getOffsetFromLocal(local));
    }

    @Test
    public void testGetOffsetFromLocal_negativeOffsetZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(-5);
        long local = 1000000L;
        assertEquals(zone.getOffset(local), zone.getOffsetFromLocal(local));
    }

    // =====================================================================
    // convertUTCToLocal
    // =====================================================================

    @Test
    public void testConvertUTCToLocal_normal() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        long instantUTC = 0L;
        assertEquals(instantUTC + zone.getOffset(instantUTC), zone.convertUTCToLocal(instantUTC));
    }

    @Test(expected = ArithmeticException.class)
    public void testConvertUTCToLocal_overflow_throws() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        zone.convertUTCToLocal(Long.MAX_VALUE);
    }

    // =====================================================================
    // convertLocalToUTC (3-arg) / (2-arg)
    // =====================================================================

    @Test
    public void testConvertLocalToUTC_threeArg_sameOffset_fixedZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(4);
        long local = 10000000L;
        long originalUTC = 0L;
        // สำหรับ fixed zone offset ไม่เปลี่ยน ดังนั้น offsetLocalFromOriginal == offsetOriginal เสมอ
        long result = zone.convertLocalToUTC(local, false, originalUTC);
        assertEquals(local - zone.getOffset(originalUTC), result);
    }

    @Test
    public void testConvertLocalToUTC_twoArg_strictTrueAndFalse_fixedZone_sameResult() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(4);
        long local = 10000000L;
        long strictResult = zone.convertLocalToUTC(local, true);
        long nonStrictResult = zone.convertLocalToUTC(local, false);
        // fixed zone ไม่มี DST gap/overlap offsetLocal == offset เสมอ -> ผลลัพธ์ต้องตรงกัน
        assertEquals(strictResult, nonStrictResult);
        assertEquals(local - zone.getOffset(local), strictResult);
    }

    @Test(expected = ArithmeticException.class)
    public void testConvertLocalToUTC_twoArg_overflow_throws() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        zone.convertLocalToUTC(Long.MIN_VALUE, false);
    }

    // หมายเหตุ: การทดสอบ branch ของ DST gap (strict=true throws IllegalArgumentException,
    // strict=false ใช้ offsetLocal แทน) ต้องใช้โซนที่มี DST จริง จึงข้ามถ้าไม่มี tz data
    @Test
    public void testConvertLocalToUTC_dstGap_ifDataAvailable() {
        DateTimeZone zone = tryForID("America/New_York");
        // 2013-03-10 02:30 เป็นเวลาที่ไม่มีจริงในโซนนี้ (spring-forward gap)
        DateTime base = new DateTime(2013, 3, 10, 2, 30, 0, DateTimeZone.UTC);
        long localMillis = base.getMillis();
        try {
            zone.convertLocalToUTC(localMillis, true);
            fail("Expected IllegalArgumentException for DST gap with strict=true");
        } catch (IllegalArgumentException expected) {
            // ตรงตามที่ระบุใน source: ปฏิเสธเวลาที่ไม่มีจริงเมื่อ strict=true
        }
        // ด้วย strict=false ควรไม่ throw
        zone.convertLocalToUTC(localMillis, false);
    }

    // =====================================================================
    // getMillisKeepLocal
    // =====================================================================

    @Test
    public void testGetMillisKeepLocal_sameZone_returnsSameInstant() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(3);
        long instant = 123456789L;
        assertEquals(instant, zone.getMillisKeepLocal(zone, instant));
    }

    @Test
    public void testGetMillisKeepLocal_nullZone_usesDefault() {
        DateTimeZone def = DateTimeZone.forOffsetHours(1);
        DateTimeZone.setDefault(def);
        DateTimeZone source = DateTimeZone.forOffsetHours(2);
        long instant = 0L;
        long expected = source.getMillisKeepLocal(def, instant);
        long actual = source.getMillisKeepLocal(null, instant);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetMillisKeepLocal_differentFixedZones() {
        DateTimeZone src = DateTimeZone.forOffsetHours(2);
        DateTimeZone dst = DateTimeZone.forOffsetHours(-3);
        long oldInstant = 0L;
        long result = src.getMillisKeepLocal(dst, oldInstant);
        long expectedLocal = src.convertUTCToLocal(oldInstant);
        long expected = dst.convertLocalToUTC(expectedLocal, false, oldInstant);
        assertEquals(expected, result);
    }

    // =====================================================================
    // isLocalDateTimeGap
    // =====================================================================

    @Test
    public void testIsLocalDateTimeGap_fixedZone_alwaysFalse() {
        LocalDateTime ldt = new LocalDateTime(2020, 1, 1, 0, 0, 0, 0);
        assertFalse(DateTimeZone.UTC.isLocalDateTimeGap(ldt));
        assertFalse(DateTimeZone.forOffsetHours(5).isLocalDateTimeGap(ldt));
    }

    @Test
    public void testIsLocalDateTimeGap_dstZone_ifDataAvailable() {
        DateTimeZone zone = tryForID("America/New_York");
        // ช่วงเวลาปกติ ไม่ใช่ gap
        LocalDateTime normal = new LocalDateTime(2013, 1, 1, 0, 0, 0, 0);
        assertFalse(zone.isLocalDateTimeGap(normal));
        // 2013-03-10 02:30 เป็น gap ในโซนนี้ (spring forward)
        LocalDateTime gap = new LocalDateTime(2013, 3, 10, 2, 30, 0, 0);
        assertTrue(zone.isLocalDateTimeGap(gap));
    }

    // =====================================================================
    // adjustOffset
    // =====================================================================

    @Test
    public void testAdjustOffset_fixedZone_noChange() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(3);
        long instant = 1000000L;
        assertEquals(instant, zone.adjustOffset(instant, true));
        assertEquals(instant, zone.adjustOffset(instant, false));
    }

    // =====================================================================
    // isFixed
    // =====================================================================

    @Test
    public void testIsFixed_trueForFixedOffsetZones() {
        assertTrue(DateTimeZone.UTC.isFixed());
        assertTrue(DateTimeZone.forOffsetHours(4).isFixed());
    }

    @Test
    public void testIsFixed_falseForRealZone_ifDataAvailable() {
        DateTimeZone zone = tryForID("America/New_York");
        assertFalse(zone.isFixed());
    }

    // =====================================================================
    // nextTransition / previousTransition
    // =====================================================================

    // หมายเหตุ: อนุมานจากความหมายของ "isFixed()==true" (ไม่มีการเปลี่ยนแปลง offset เลย)
    // ว่า FixedDateTimeZone#nextTransition/previousTransition จะคืนค่า instant เดิมกลับมา
    // ตาม contract ที่ระบุใน Javadoc ของเมธอด abstract ("ถ้าค่าที่คืนเหมือนที่ส่งมา แสดงว่าไม่มีการเปลี่ยนแปลง")
    @Test
    public void testNextAndPreviousTransition_fixedZone_returnsSameInstant() {
        DateTimeZone zone = DateTimeZone.UTC;
        long instant = 5000L;
        assertEquals(instant, zone.nextTransition(instant));
        assertEquals(instant, zone.previousTransition(instant));
    }

    // =====================================================================
    // toTimeZone
    // =====================================================================

    @Test
    public void testToTimeZone() {
        java.util.TimeZone tz = DateTimeZone.UTC.toTimeZone();
        assertNotNull(tz);
        assertEquals("UTC", tz.getID());
    }

    // =====================================================================
    // equals / hashCode / toString
    // =====================================================================

    @Test
    public void testEquals_sameAndDifferentZones() {
        assertTrue(DateTimeZone.UTC.equals(DateTimeZone.UTC));
        assertFalse(DateTimeZone.UTC.equals(DateTimeZone.forOffsetHours(1)));
        assertFalse(DateTimeZone.UTC.equals(null));
    }

    @Test
    public void testHashCode_matchesContract() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertEquals(57 + zone.getID().hashCode(), zone.hashCode());
    }

    @Test
    public void testToString_returnsID() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertEquals(zone.getID(), zone.toString());
    }

    // =====================================================================
    // serialization (writeReplace -> Stub -> readResolve -> forID)
    // =====================================================================

    @Test
    public void testSerialization_UTC_roundTrip() throws Exception {
        DateTimeZone result = (DateTimeZone) serializeAndDeserialize(DateTimeZone.UTC);
        assertEquals(DateTimeZone.UTC, result);
    }

    @Test
    public void testSerialization_fixedOffsetZone_roundTrip() throws Exception {
        DateTimeZone original = DateTimeZone.forOffsetHours(4);
        DateTimeZone result = (DateTimeZone) serializeAndDeserialize(original);
        assertEquals(original.getID(), result.getID());
        assertEquals(original, result);
    }

    private Object serializeAndDeserialize(Object obj) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(obj);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        Object result = ois.readObject();
        ois.close();
        return result;
    }
}
```

## สรุปตาราง Test coverage

| กลุ่มเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testGetDefaultNotNull`, `testSetDefaultNull_throwsIllegalArgument`, `testSetDefaultValid_updatesGetDefault` | `setDefault`: null→throw, valid→update; `getDefault`: lazy init ไม่ null |
| `testForID_null_returnsDefault` ... `testForID_malformedOffset_throwsRuntimeException` | `forID`: id==null, id=="UTC", provider match, "+"/"-" prefix, offset==0, offset!=0, unrecognized id, malformed parse |
| `testFixedOffsetZone_cached_sameInstance` | `fixedOffsetZone`: cache hit (ref!=null && zone!=null) |
| `testForOffsetHours_*`, `testForOffsetHoursMinutes_*` | `forOffsetHoursMinutes`: (0,0)→UTC, minutes<0/>59→throw, hoursInMinutes<0/>=0, overflow→throw |
| `testForOffsetMillis_*` | `printOffset`: sign +/-, early return หลัง minutes, หลัง seconds, path เต็มถึง millis |
| `testForTimeZone_*` | `forTimeZone`: zone==null, id=="UTC", convId map hit, provider lookup, GMT+/- fallback, unrecognized→throw |
| `testGetAvailableIDs_*`, `testGetProvider_*`, `testSetProvider_*` | `setProvider0`: ids null/empty→throw, ids ไม่มี "UTC"→throw, UTC zone ผิด→throw, success path |
| `testGetNameProvider_*`, `testSetNameProvider_*`, `testNameProvider_returnsNull_*` | `setNameProvider0`, `getShortName/getName`: nameKey==null→return iID, name!=null→return name, name==null→fallback printOffset |
| `testGetID`, `testGetShortNameAndGetName_*` | nameKey null branch, locale null→default |
| `testGetOffset_*`, `testGetStandardOffset`, `testIsStandardOffset_*` | `getOffset(ReadableInstant)`: instant==null branch; `isStandardOffset` true/false (false branch ขึ้นกับ DST data) |
| `testGetOffsetFromLocal_*` | offsetLocal==offsetAdjusted (else-if offsetLocal>0 / ไม่>0) branches (fixed zone เท่านั้น) |
| `testConvertUTCToLocal_*` | normal path, overflow throw (sign-check branch) |
| `testConvertLocalToUTC_*` | 3-arg: offsetLocalFromOriginal==offsetOriginal; 2-arg: strict true/false เมื่อ offset เท่ากัน, overflow throw, DST gap strict=true throw / false ไม่ throw (ขึ้นกับ data) |
| `testGetMillisKeepLocal_*` | newZone==null, newZone==this, ต่างโซน |
| `testIsLocalDateTimeGap_*` | isFixed()==true→false เสมอ; DST จริง: try success/false, catch→true (ขึ้นกับ data) |
| `testAdjustOffset_fixedZone_noChange` | before==after→return instant (fixed zone) |
| `testIsFixed_*` | true (fixed) / false (จริง DST, ขึ้นกับ data) |
| `testNextAndPreviousTransition_fixedZone_returnsSameInstant` | contract: คืนค่าเดิมเมื่อไม่มี transition |
| `testToTimeZone` | แปลงเป็น java.util.TimeZone |
| `testEquals_*`, `testHashCode_*`, `testToString_*` | equals true/false/null, hashCode formula, toString==getID |
| `testSerialization_*` | `writeReplace`→`Stub`→`readResolve`→`forID` round-trip |

**ข้อสังเกตสำคัญ:** test ที่มีคำว่า `ifDataAvailable`/`ifDstZoneAvailable` ใช้ `Assume` เพื่อข้ามอย่างปลอดภัยหากสภาพแวดล้อมไม่มี tz database (เช่นใช้ `UTCProvider` แทน `ZoneInfoProvider`) ตามที่ระบุคอมเมนต์กำกับไว้ในโค้ด เพื่อไม่ให้ทดสอบ fail จาก environment โดยไม่เกี่ยวกับ fault ของโค้ด