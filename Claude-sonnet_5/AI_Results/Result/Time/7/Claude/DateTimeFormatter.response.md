# DateTimeFormatterTest - ชุดทดสอบ JUnit 4

```java
package org.joda.time.format;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Locale;

import org.junit.Before;
import org.junit.Test;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.chrono.ISOChronology;

/**
 * JUnit4 tests for {@link DateTimeFormatter}.
 * หมายเหตุ: ทดสอบอยู่ใน package เดียวกับคลาสเป้าหมาย (org.joda.time.format)
 * เพื่อให้สามารถใช้ constructor public ที่รับ DateTimePrinter/DateTimeParser ได้สะดวก
 */
public class DateTimeFormatterTest {

    // ---- fixtures ----
    private DateTimeFormatter isoDateTime;      // yyyy-MM-dd'T'HH:mm:ss.SSSZZ (printer+parser)
    private DateTimeFormatter plainDateTime;    // yyyy-MM-dd'T'HH:mm:ss (ไม่มี zone/offset)
    private DateTimeFormatter zoneIdFormatter;  // ... + appendTimeZoneId()
    private DateTimeFormatter printerOnly;
    private DateTimeFormatter parserOnly;
    private DateTimeFormatter noPrinterNoParser;

    @Before
    public void setUp() {
        isoDateTime = ISODateTimeFormat.dateTime();
        plainDateTime = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss");
        zoneIdFormatter = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd'T'HH:mm:ss ")
                .appendTimeZoneId()
                .toFormatter();
        printerOnly = new DateTimeFormatter(isoDateTime.getPrinter(), null);
        parserOnly = new DateTimeFormatter(null, isoDateTime.getParser());
        noPrinterNoParser = new DateTimeFormatter(null, null);
    }

    // =====================================================================
    // isPrinter / isParser / getPrinter / getParser
    // =====================================================================

    @Test
    public void testIsPrinterIsParser_full() {
        assertTrue(isoDateTime.isPrinter());
        assertTrue(isoDateTime.isParser());
        assertNotNull(isoDateTime.getPrinter());
        assertNotNull(isoDateTime.getParser());
    }

    @Test
    public void testIsPrinterIsParser_printerOnly() {
        assertTrue(printerOnly.isPrinter());
        assertFalse(printerOnly.isParser());
        assertNull(printerOnly.getParser());
    }

    @Test
    public void testIsPrinterIsParser_parserOnly() {
        assertFalse(parserOnly.isPrinter());
        assertTrue(parserOnly.isParser());
        assertNull(parserOnly.getPrinter());
    }

    @Test
    public void testIsPrinterIsParser_none() {
        assertFalse(noPrinterNoParser.isPrinter());
        assertFalse(noPrinterNoParser.isParser());
    }

    // =====================================================================
    // withLocale / getLocale  (branch: same ref / equals / different)
    // =====================================================================

    @Test
    public void testWithLocale_nullWhenAlreadyNull_returnsSame() {
        // iLocale เริ่มต้นเป็น null -> locale==getLocale() (null==null) true
        DateTimeFormatter result = isoDateTime.withLocale(null);
        assertSame(isoDateTime, result);
    }

    @Test
    public void testWithLocale_newLocale_createsNewInstance() {
        DateTimeFormatter f = isoDateTime.withLocale(Locale.FRENCH);
        assertNotSame(isoDateTime, f);
        assertEquals(Locale.FRENCH, f.getLocale());
    }

    @Test
    public void testWithLocale_equalButDifferentRef_returnsSame() {
        Locale l1 = new Locale("fr");
        Locale l2 = new Locale("fr"); // equals(l1) == true, แต่ reference ต่างกัน
        DateTimeFormatter f1 = isoDateTime.withLocale(l1);
        DateTimeFormatter f2 = f1.withLocale(l2);
        assertSame(f1, f2); // ใช้ equals() fallback ตาม source
    }

    // =====================================================================
    // withOffsetParsed / isOffsetParsed
    // =====================================================================

    @Test
    public void testWithOffsetParsed_falseToTrue() {
        assertFalse(isoDateTime.isOffsetParsed());
        DateTimeFormatter f = isoDateTime.withOffsetParsed();
        assertTrue(f.isOffsetParsed());
        assertNotSame(isoDateTime, f);
        assertNull(f.getZone()); // withOffsetParsed ตั้ง zone เป็น null เสมอ
    }

    @Test
    public void testWithOffsetParsed_trueStaysSame() {
        DateTimeFormatter f = isoDateTime.withOffsetParsed();
        DateTimeFormatter f2 = f.withOffsetParsed();
        assertSame(f, f2); // iOffsetParsed==true -> return this
    }

    // =====================================================================
    // withChronology / getChronology / getChronolgy (deprecated)
    // =====================================================================

    @Test
    public void testWithChronology_nullWhenAlreadyNull_returnsSame() {
        DateTimeFormatter f = isoDateTime.withChronology(null);
        assertSame(isoDateTime, f);
    }

    @Test
    public void testWithChronology_newChrono_createsNewAndSameRefShortCircuit() {
        Chronology c = ISOChronology.getInstanceUTC();
        DateTimeFormatter f1 = isoDateTime.withChronology(c);
        assertNotSame(isoDateTime, f1);
        assertEquals(c, f1.getChronology());
        assertEquals(c, f1.getChronolgy()); // deprecated alias

        DateTimeFormatter f2 = f1.withChronology(c); // reference เดิม
        assertSame(f1, f2);
    }

    // =====================================================================
    // withZone / getZone  (branch: strict reference equality เท่านั้น)
    // =====================================================================

    @Test
    public void testWithZone_nullWhenAlreadyNull_returnsSame() {
        DateTimeFormatter f = isoDateTime.withZone(null);
        assertSame(isoDateTime, f);
    }

    @Test
    public void testWithZone_sameReference_returnsSame() {
        DateTimeZone z = DateTimeZone.forOffsetMillis(7200000);
        DateTimeFormatter f1 = isoDateTime.withZone(z);
        DateTimeFormatter f2 = f1.withZone(z); // reference เดิม
        assertSame(f1, f2);
    }

    @Test
    public void testWithZone_equalButDifferentReference_createsNewInstance() {
        // forOffsetMillis ไม่ cache instance -> สอง object ต่างกันแม้ logically equal
        DateTimeZone zA = DateTimeZone.forOffsetMillis(7200000);
        DateTimeZone zB = DateTimeZone.forOffsetMillis(7200000);
        DateTimeFormatter f1 = isoDateTime.withZone(zA);
        DateTimeFormatter f2 = f1.withZone(zB);
        // code ใช้ "==" เท่านั้น ไม่ fallback เป็น equals เหมือน withLocale
        assertNotSame(f1, f2);
        assertEquals(zB, f2.getZone());
    }

    @Test
    public void testWithZone_resetsOffsetParsedToFalse_whenZoneChanges() {
        DateTimeFormatter f = isoDateTime.withOffsetParsed(); // offsetParsed=true, zone=null
        DateTimeZone z = DateTimeZone.forID("Europe/Paris");
        DateTimeFormatter f2 = f.withZone(z); // zone เปลี่ยนจาก null -> z
        assertFalse(f2.isOffsetParsed());
        assertEquals(z, f2.getZone());
    }

    @Test
    public void testWithZoneUTC_delegatesToWithZone() {
        DateTimeFormatter f = isoDateTime.withZoneUTC();
        assertEquals(DateTimeZone.UTC, f.getZone());
    }

    // =====================================================================
    // withPivotYear(Integer) / withPivotYear(int) / getPivotYear
    // =====================================================================

    @Test
    public void testWithPivotYear_nullWhenAlreadyNull_returnsSame() {
        DateTimeFormatter f = isoDateTime.withPivotYear((Integer) null);
        assertSame(isoDateTime, f);
    }

    @Test
    public void testWithPivotYear_newValue_createsNewInstance() {
        DateTimeFormatter f = isoDateTime.withPivotYear(Integer.valueOf(1950));
        assertNotSame(isoDateTime, f);
        assertEquals(Integer.valueOf(1950), f.getPivotYear());
    }

    @Test
    public void testWithPivotYear_equalButDifferentReference_returnsSame() {
        DateTimeFormatter f1 = isoDateTime.withPivotYear(Integer.valueOf(1950));
        Integer p2 = new Integer(1950); // บังคับให้เป็น reference คนละตัว (นอก Integer cache)
        DateTimeFormatter f2 = f1.withPivotYear(p2);
        assertSame(f1, f2); // iPivotYear!=null && equals(pivotYear)
    }

    @Test
    public void testWithPivotYear_intOverload_delegates() {
        DateTimeFormatter f = isoDateTime.withPivotYear(2000);
        assertEquals(Integer.valueOf(2000), f.getPivotYear());
    }

    // =====================================================================
    // withDefaultYear / getDefaultYear
    // =====================================================================

    @Test
    public void testDefaultYear_defaultIs2000() {
        assertEquals(2000, isoDateTime.getDefaultYear());
    }

    @Test
    public void testWithDefaultYear_alwaysCreatesNewInstance() {
        DateTimeFormatter f1 = isoDateTime.withDefaultYear(1999);
        DateTimeFormatter f2 = f1.withDefaultYear(1999); // ค่าเดิมก็ยัง new เสมอ (ไม่มี shortcut)
        assertNotSame(f1, f2);
        assertEquals(1999, f1.getDefaultYear());
        assertEquals(1999, f2.getDefaultYear());
    }

    // =====================================================================
    // print / printTo - ReadableInstant, long, ReadablePartial, Appendable
    // =====================================================================

    @Test
    public void testPrint_readableInstant_and_printTo_consistency() throws IOException {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0, DateTimeZone.UTC);
        DateTimeFormatter f = isoDateTime.withZoneUTC();

        String s1 = f.print((org.joda.time.ReadableInstant) dt);

        StringBuffer buf = new StringBuffer();
        f.printTo(buf, (org.joda.time.ReadableInstant) dt);
        assertEquals(s1, buf.toString());

        StringWriter w = new StringWriter();
        f.printTo(w, (org.joda.time.ReadableInstant) dt);
        assertEquals(s1, w.toString());

        StringBuilder sb = new StringBuilder();
        f.printTo((Appendable) sb, (org.joda.time.ReadableInstant) dt);
        assertEquals(s1, sb.toString());
    }

    @Test
    public void testPrint_nullInstant_usesNow_noException() {
        // instant=null -> DateTimeUtils.getInstantMillis(null) = now; ไม่ throw
        String s = isoDateTime.withZoneUTC().print((org.joda.time.ReadableInstant) null);
        assertNotNull(s);
        assertTrue(s.length() > 0);
    }

    @Test
    public void testPrint_long_and_printTo_consistency() throws IOException {
        DateTimeFormatter f = isoDateTime.withZoneUTC();
        long millis = new DateTime(2004, 6, 9, 10, 20, 30, 0, DateTimeZone.UTC).getMillis();

        String s1 = f.print(millis);

        StringBuffer buf = new StringBuffer();
        f.printTo(buf, millis);
        assertEquals(s1, buf.toString());

        StringWriter w = new StringWriter();
        f.printTo(w, millis);
        assertEquals(s1, w.toString());

        StringBuilder sb = new StringBuilder();
        f.printTo((Appendable) sb, millis);
        assertEquals(s1, sb.toString());
    }

    @Test
    public void testPrint_readablePartial_and_printTo_consistency() throws IOException {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd");
        LocalDate ld = new LocalDate(2004, 6, 9);

        String s1 = f.print(ld);

        StringBuffer buf = new StringBuffer();
        f.printTo(buf, ld);
        assertEquals(s1, buf.toString());

        StringWriter w = new StringWriter();
        f.printTo(w, ld);
        assertEquals(s1, w.toString());

        StringBuilder sb = new StringBuilder();
        f.printTo((Appendable) sb, ld);
        assertEquals(s1, sb.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintTo_partial_null_throws_stringBuffer() {
        DateTimeFormat.forPattern("yyyy-MM-dd").printTo(new StringBuffer(), (org.joda.time.ReadablePartial) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintTo_partial_null_throws_writer() throws IOException {
        DateTimeFormat.forPattern("yyyy-MM-dd").printTo(new StringWriter(), (org.joda.time.ReadablePartial) null);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testPrint_requiresPrinter_throwsWhenNoPrinter() {
        parserOnly.print(0L);
    }

    // =====================================================================
    // selectChronology (ผ่าน print/parseMillis) - iChrono / iZone override
    // =====================================================================

    @Test
    public void testSelectChronology_chronoOverride_zoneFromChrono() {
        Chronology parisChrono = ISOChronology.getInstance(DateTimeZone.forID("Europe/Paris"));
        DateTimeFormatter f = plainDateTime.withChronology(parisChrono);
        long millisUtcNoon = new DateTime(2004, 1, 1, 12, 0, 0, 0, DateTimeZone.UTC).getMillis();
        String printed = f.print(millisUtcNoon);
        // Paris ใน ม.ค. คือ UTC+1 -> ควรเป็น 13:00:00
        assertEquals("2004-01-01T13:00:00", printed);
    }

    @Test
    public void testSelectChronology_zoneOverride_overridesChronoZone() {
        Chronology parisChrono = ISOChronology.getInstance(DateTimeZone.forID("Europe/Paris"));
        DateTimeZone london = DateTimeZone.forID("Europe/London"); // UTC+0 ในเดือน ม.ค.
        DateTimeFormatter f = plainDateTime.withChronology(parisChrono).withZone(london);
        long millisUtcNoon = new DateTime(2004, 1, 1, 12, 0, 0, 0, DateTimeZone.UTC).getMillis();
        String printed = f.print(millisUtcNoon);
        // iZone (London) ต้อง override zone ของ chrono (Paris) ตาม javadoc
        assertEquals("2004-01-01T12:00:00", printed);
    }

    // =====================================================================
    // parseInto
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testParseInto_nullInstant_throws() {
        isoDateTime.parseInto(null, "2004-06-09T10:20:30.000+02:00", 0);
    }

    @Test
    public void testParseInto_offsetParsedBranch_andFinalZoneOverride() {
        DateTimeFormatter f = isoDateTime.withOffsetParsed(); // offsetParsed=true, zone=null
        MutableDateTime mdt = new MutableDateTime(2000, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC);
        String text = "2004-06-09T10:20:30.000+02:00";
        int pos = f.parseInto(mdt, text, 0);
        assertEquals(text.length(), pos);
        assertEquals(DateTimeZone.forOffsetMillis(7200000), mdt.getZone());
    }

    @Test
    public void testParseInto_zoneBranch_viaZoneId() {
        MutableDateTime mdt = new MutableDateTime(2000, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC);
        String text = "2004-06-09T10:20:30 Europe/Paris";
        int pos = zoneIdFormatter.parseInto(mdt, text, 0);
        assertEquals(text.length(), pos);
        assertEquals(DateTimeZone.forID("Europe/Paris"), mdt.getZone());
    }

    @Test
    public void testParseInto_finalIZoneOverride() {
        MutableDateTime mdt = new MutableDateTime(2000, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC);
        String text = "2004-06-09T10:20:30.000+02:00";
        int pos = isoDateTime.withZoneUTC().parseInto(mdt, text, 0);
        assertEquals(text.length(), pos);
        assertEquals(DateTimeZone.UTC, mdt.getZone()); // ถูก override ด้วย iZone
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testParseInto_requiresParser_throwsWhenNoParser() {
        printerOnly.parseInto(new MutableDateTime(), "x", 0);
    }

    // =====================================================================
    // parseMillis
    // =====================================================================

    @Test
    public void testParseMillis_success() {
        String text = "2004-06-09T10:20:30.000+02:00";
        long millis = isoDateTime.withZoneUTC().parseMillis(text);
        long expected = new DateTime(2004, 6, 9, 8, 20, 30, 0, DateTimeZone.UTC).getMillis();
        assertEquals(expected, millis);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseMillis_partialMatch_throws() {
        // newPos >=0 แต่ < text.length()
        isoDateTime.parseMillis("2004-06-09T10:20:30.000+02:00XYZ");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseMillis_invalidText_throws() {
        // newPos < 0
        isoDateTime.parseMillis("not-a-date");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseMillis_emptyString_throws() {
        isoDateTime.parseMillis("");
    }

    // สมมติฐาน: ตาม behavior ทั่วไปของ parser ภายใน joda-time เมื่อรับ text=null
    // จะเกิด NullPointerException (ไม่ได้ handle เป็น IllegalArgumentException ในคลาสนี้)
    @Test(expected = NullPointerException.class)
    public void testParseMillis_nullText_npe() {
        isoDateTime.parseMillis(null);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testParseMillis_requiresParser_throwsWhenNoParser() {
        printerOnly.parseMillis("2004-06-09T10:20:30.000+02:00");
    }

    // =====================================================================
    // parseLocalDateTime / parseLocalDate / parseLocalTime
    // =====================================================================

    @Test
    public void testParseLocalDateTime_offsetBranch() {
        // ตาม source: offsetInteger != null -> "treat withOffsetParsed() as being true"
        String text = "2004-06-09T10:20:30.000+02:00";
        LocalDateTime ldt = isoDateTime.parseLocalDateTime(text);
        // millis คำนวณจาก field ดิบ (UTC) แล้วตีความใหม่ด้วย zone offset ที่ parse ได้ (+2h)
        assertEquals(new LocalDateTime(2004, 6, 9, 12, 20, 30, 0), ldt);
    }

    @Test
    public void testParseLocalDateTime_zoneBranch() {
        String text = "2004-06-09T10:20:30 Europe/Paris";
        LocalDateTime ldt = zoneIdFormatter.parseLocalDateTime(text);
        assertEquals(new LocalDateTime(2004, 6, 9, 12, 20, 30, 0), ldt);
    }

    @Test
    public void testParseLocalDateTime_noOffsetNoZone() {
        String text = "2004-06-09T10:20:30";
        LocalDateTime ldt = plainDateTime.parseLocalDateTime(text);
        assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30, 0), ldt);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseLocalDateTime_partialMatch_throws() {
        plainDateTime.parseLocalDateTime("2004-06-09T10:20:30XYZ");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseLocalDateTime_invalidText_throws() {
        plainDateTime.parseLocalDateTime("garbage");
    }

    @Test
    public void testParseLocalDate_delegation() {
        LocalDate ld = plainDateTime.parseLocalDate("2004-06-09T10:20:30");
        assertEquals(new LocalDate(2004, 6, 9), ld);
    }

    @Test
    public void testParseLocalTime_delegation() {
        LocalTime lt = plainDateTime.parseLocalTime("2004-06-09T10:20:30");
        assertEquals(new LocalTime(10, 20, 30, 0), lt);
    }

    // =====================================================================
    // parseDateTime
    // =====================================================================

    @Test
    public void testParseDateTime_neitherOffsetNorZoneBranchTaken() {
        // offsetParsed=false (default) -> branch1 false, ไม่มี zone id field -> branch2 false
        DateTimeFormatter f = isoDateTime.withZoneUTC();
        DateTime dt = f.parseDateTime("2004-06-09T10:20:30.000+02:00");
        DateTime expected = new DateTime(2004, 6, 9, 8, 20, 30, 0, DateTimeZone.UTC);
        assertEquals(expected.getMillis(), dt.getMillis());
        assertEquals(DateTimeZone.UTC, dt.getZone());
    }

    @Test
    public void testParseDateTime_offsetParsedBranch() {
        DateTimeFormatter f = isoDateTime.withOffsetParsed(); // offsetParsed=true, zone=null
        DateTime dt = f.parseDateTime("2004-06-09T10:20:30.000+02:00");
        assertEquals(DateTimeZone.forOffsetMillis(7200000), dt.getZone());
        DateTime expected = new DateTime(2004, 6, 9, 8, 20, 30, 0, DateTimeZone.UTC);
        assertEquals(expected.getMillis(), dt.getMillis());
    }

    @Test
    public void testParseDateTime_zoneIdBranch() {
        DateTime dt = zoneIdFormatter.parseDateTime("2004-06-09T10:20:30 Europe/Paris");
        assertEquals(DateTimeZone.forID("Europe/Paris"), dt.getZone());
        DateTime expected = new DateTime(2004, 6, 9, 10, 20, 30, 0, DateTimeZone.forID("Europe/Paris"));
        assertEquals(expected.getMillis(), dt.getMillis());
    }

    @Test
    public void testParseDateTime_finalZoneOverride_keepsInstant() {
        DateTime expectedInstant = new DateTime(2004, 6, 9, 10, 20, 30, 0, DateTimeZone.forID("Europe/Paris"));
        DateTimeFormatter f = zoneIdFormatter.withZone(DateTimeZone.forID("America/New_York"));
        DateTime dt = f.parseDateTime("2004-06-09T10:20:30 Europe/Paris");
        assertEquals(DateTimeZone.forID("America/New_York"), dt.getZone());
        assertEquals(expectedInstant.getMillis(), dt.getMillis()); // instant ไม่เปลี่ยน
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDateTime_partialMatch_throws() {
        isoDateTime.parseDateTime("2004-06-09T10:20:30.000+02:00XYZ");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDateTime_invalidText_throws() {
        isoDateTime.parseDateTime("garbage");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testParseDateTime_requiresParser_throws() {
        printerOnly.parseDateTime("2004-06-09T10:20:30.000+02:00");
    }

    // =====================================================================
    // parseMutableDateTime
    // =====================================================================

    @Test
    public void testParseMutableDateTime_offsetParsedBranch() {
        DateTimeFormatter f = isoDateTime.withOffsetParsed();
        MutableDateTime dt = f.parseMutableDateTime("2004-06-09T10:20:30.000+02:00");
        assertEquals(DateTimeZone.forOffsetMillis(7200000), dt.getZone());
    }

    @Test
    public void testParseMutableDateTime_zoneBranch_andFinalOverride() {
        DateTimeFormatter f = zoneIdFormatter.withZone(DateTimeZone.forID("America/New_York"));
        MutableDateTime dt = f.parseMutableDateTime("2004-06-09T10:20:30 Europe/Paris");
        assertEquals(DateTimeZone.forID("America/New_York"), dt.getZone());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseMutableDateTime_invalidText_throws() {
        isoDateTime.parseMutableDateTime("garbage");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseMutableDateTime_partialMatch_throws() {
        isoDateTime.parseMutableDateTime("2004-06-09T10:20:30.000+02:00XYZ");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testParseMutableDateTime_requiresParser_throws() {
        printerOnly.parseMutableDateTime("2004-06-09T10:20:30.000+02:00");
    }

    // =====================================================================
    // Overflow branch ใน printTo(StringBuffer/Writer, long, Chronology)
    // หมายเหตุสำคัญ: branch (instant ^ adjustedInstant) < 0 && (instant ^ offset) >= 0
    // เกิดขึ้นเฉพาะเมื่อ instant อยู่ใกล้ขอบ Long.MAX_VALUE/MIN_VALUE ซึ่งเกินขอบเขตปีที่
    // ISOChronology รองรับอยู่แล้ว (อาจโยน ArithmeticException จาก field คำนวณปี ซึ่งเป็น
    // พฤติกรรมของ Chronology ไม่ใช่ของ DateTimeFormatter โดยตรง) จึงไม่สามารถยืนยัน
    // ผลลัพธ์ที่แน่นอนได้โดยไม่เดา behavior - จึงข้ามการทดสอบ branch นี้แบบตรง ๆ
    // ตามข้อกำหนดที่ 4 (ห้ามเดา behavior ที่ไม่มีอยู่ในซอร์ส)
}
```

## ตารางสรุปการครอบคลุม (Test Method → Branch/Condition)

| กลุ่ม | Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| isPrinter/isParser | testIsPrinterIsParser_* (4 เมธอด) | `iPrinter!=null`, `iParser!=null` ทั้ง true/false |
| withLocale | testWithLocale_nullWhenAlreadyNull_returnsSame | `locale==getLocale()` (null==null) |
| | testWithLocale_newLocale_createsNewInstance | else-branch สร้าง instance ใหม่ |
| | testWithLocale_equalButDifferentRef_returnsSame | `locale.equals(getLocale())` |
| withOffsetParsed | testWithOffsetParsed_falseToTrue | `iOffsetParsed==false` → สร้างใหม่ |
| | testWithOffsetParsed_trueStaysSame | `iOffsetParsed==true` → return this |
| withChronology | testWithChronology_nullWhenAlreadyNull_returnsSame | `iChrono==chrono` (null) |
| | testWithChronology_newChrono_createsNewAndSameRefShortCircuit | else-branch + reference equality branch, getChronolgy() |
| withZone | testWithZone_nullWhenAlreadyNull_returnsSame | `iZone==zone` (null) |
| | testWithZone_sameReference_returnsSame | reference equality true |
| | testWithZone_equalButDifferentReference_createsNewInstance | พิสูจน์ใช้ `==` ไม่ใช่ `.equals()` (fault-detecting) |
| | testWithZone_resetsOffsetParsedToFalse_whenZoneChanges | side-effect offsetParsed→false |
| | testWithZoneUTC_delegatesToWithZone | delegation path |
| withPivotYear | testWithPivotYear_nullWhenAlreadyNull_returnsSame | `iPivotYear==pivotYear` (null) |
| | testWithPivotYear_newValue_createsNewInstance | else-branch |
| | testWithPivotYear_equalButDifferentReference_returnsSame | `.equals()` fallback |
| | testWithPivotYear_intOverload_delegates | int→Integer overload |
| withDefaultYear | testDefaultYear_defaultIs2000, testWithDefaultYear_alwaysCreatesNewInstance | ไม่มี shortcut (always new) |
| print/printTo | testPrint_readableInstant_and_printTo_consistency | printTo(StringBuffer/Writer/Appendable, ReadableInstant) |
| | testPrint_nullInstant_usesNow_noException | instant==null → DateTimeUtils.getInstantMillis(null) |
| | testPrint_long_and_printTo_consistency | printTo(..., long) overloads |
| | testPrint_readablePartial_and_printTo_consistency | printTo(..., ReadablePartial) overloads |
| | testPrintTo_partial_null_throws_stringBuffer/_writer | `partial==null` throw IAE (2 overloads) |
| | testPrint_requiresPrinter_throwsWhenNoPrinter | requirePrinter() null-branch |
| selectChronology | testSelectChronology_chronoOverride_zoneFromChrono | `iChrono!=null` |
| | testSelectChronology_zoneOverride_overridesChronoZone | `iZone!=null` overrides chrono's zone |
| parseInto | testParseInto_nullInstant_throws | instant==null IAE |
| | testParseInto_offsetParsedBranch_andFinalZoneOverride | `iOffsetParsed && offsetInteger!=null` + final `iZone!=null` |
| | testParseInto_zoneBranch_viaZoneId | else-if `bucket.getZone()!=null` |
| | testParseInto_finalIZoneOverride | final zone override |
| | testParseInto_requiresParser_throwsWhenNoParser | requireParser() null |
| parseMillis | testParseMillis_success | `newPos>=0 && newPos>=length` success path |
| | testParseMillis_partialMatch_throws | `newPos>=0` แต่ `< length` |
| | testParseMillis_invalidText_throws | `newPos<0` |
| | testParseMillis_emptyString_throws | boundary ค่าว่าง |
| | testParseMillis_nullText_npe | ค่า null (สมมติฐานระบุคอมเมนต์) |
| | testParseMillis_requiresParser_throwsWhenNoParser | requireParser() |
| parseLocalDateTime | testParseLocalDateTime_offsetBranch | `offsetInteger!=null` |
| | testParseLocalDateTime_zoneBranch | else-if `zone!=null` |
| | testParseLocalDateTime_noOffsetNoZone | ทั้งสอง branch false |
| | testParseLocalDateTime_partialMatch_throws / _invalidText_throws | newPos branches |
| parseLocalDate/Time | testParseLocalDate_delegation / testParseLocalTime_delegation | delegation ไปยัง parseLocalDateTime |
| parseDateTime | testParseDateTime_neitherOffsetNorZoneBranchTaken | ทั้งสอง branch false |
| | testParseDateTime_offsetParsedBranch | branch1 true |
| | testParseDateTime_zoneIdBranch | branch2 true |
| | testParseDateTime_finalZoneOverride_keepsInstant | final `iZone!=null` |
| | testParseDateTime_partialMatch_throws / _invalidText_throws | newPos branches |
| | testParseDateTime_requiresParser_throws | requireParser() |
| parseMutableDateTime | testParseMutableDateTime_offsetParsedBranch | branch1 true |
| | testParseMutableDateTime_zoneBranch_andFinalOverride | branch2 true + final zone override |
| | testParseMutableDateTime_invalidText_throws / _partialMatch_throws | newPos branches |
| | testParseMutableDateTime_requiresParser_throws | requireParser() |

**หมายเหตุสำคัญ:** branch overflow ใน `printTo(StringBuffer/Writer, long, Chronology)` (เงื่อนไข `(instant ^ adjustedInstant) < 0 && (instant ^ offset) >= 0`) ไม่ได้เขียนเทสแบบยืนยันผลลัพธ์ เนื่องจากต้องใช้ค่า `long` ใกล้ขอบ overflow ซึ่งจะทำให้ Chronology ภายใน (ไม่ใช่คลาสเป้าหมาย) อาจโยน exception ที่ไม่ได้ระบุไว้ในซอร์สที่ให้มา จึงระบุเป็นคอมเมนต์กำกับไว้ตามข้อกำหนดที่ 4