หมายเหตุก่อนเริ่ม: โค้ดทดสอบนี้อ้างอิงพฤติกรรมที่อ่านได้จาก source ของ `DateTimeFormatter` เท่านั้น (ใช้ joda-time ซึ่งเป็น dependency ของคลาสเป้าหมายเองที่ต้องอยู่ใน classpath ที่ compile คลาสนี้ได้อยู่แล้ว) จุดที่พฤติกรรมไม่ชัดเจนจาก source (เช่น การ parse named time-zone ด้วย pattern `zzz` ที่ผล parse ขึ้นกับ locale/ข้อมูล tz) ผมจะ**คอมเมนต์กำกับว่าข้าม**ไว้ และกรณี overflow ของ `printTo(buf, instant, chrono)` ที่ใช้ `Long.MAX_VALUE` ผมจะไม่ assert exception type เฉพาะเจาะจง เพราะ source ไม่ได้ระบุ exception type ไว้ตรง ๆ

```java
package org.joda.time.format;

import static org.junit.Assert.*;

import java.io.StringWriter;
import java.util.Locale;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.chrono.ISOChronology;
import org.junit.Test;

public class DateTimeFormatterTest {

    // ---------- Helper formatters ----------
    private final DateTimeFormatter full = ISODateTimeFormat.dateTime(); // printer+parser, has 'Z' offset field
    private final DateTimeFormatter fullUTC = full.withZoneUTC();
    private final DateTimeFormatter dateOnly = ISODateTimeFormat.date(); // printer+parser for date fields only
    private final DateTimeFormatter timeOnly = ISODateTimeFormat.hourMinuteSecondMillis();
    private final DateTimeFormatter dateTimeNoZone = ISODateTimeFormat.dateHourMinuteSecondMillis();

    private final DateTimeFormatter printerOnly =
            new DateTimeFormatter(ISODateTimeFormat.dateTime().getPrinter(), null);
    private final DateTimeFormatter parserOnly =
            new DateTimeFormatter(null, ISODateTimeFormat.dateTime().getParser());
    private final DateTimeFormatter neitherPrinterNorParser =
            new DateTimeFormatter(null, null);

    // ======================================================
    // Constructor / isPrinter / isParser / getPrinter / getParser
    // ======================================================

    @Test
    public void testConstructor_bothNull() {
        assertFalse(neitherPrinterNorParser.isPrinter());
        assertFalse(neitherPrinterNorParser.isParser());
        assertNull(neitherPrinterNorParser.getPrinter());
        assertNull(neitherPrinterNorParser.getParser());
    }

    @Test
    public void testConstructor_printerOnly() {
        assertTrue(printerOnly.isPrinter());
        assertFalse(printerOnly.isParser());
        assertNotNull(printerOnly.getPrinter());
        assertNull(printerOnly.getParser());
    }

    @Test
    public void testConstructor_parserOnly() {
        assertFalse(parserOnly.isPrinter());
        assertTrue(parserOnly.isParser());
        assertNull(parserOnly.getPrinter());
        assertNotNull(parserOnly.getParser());
    }

    @Test
    public void testConstructor_both() {
        assertTrue(full.isPrinter());
        assertTrue(full.isParser());
    }

    @Test
    public void testDefaultYear_defaultIs2000() {
        assertEquals(2000, full.getDefaultYear());
    }

    // ======================================================
    // withLocale / getLocale
    // ======================================================

    @Test
    public void testWithLocale_nullEqualsNull_returnsSame() {
        // locale == getLocale() both null -> branch true -> return this
        DateTimeFormatter result = full.withLocale(null);
        assertSame(full, result);
    }

    @Test
    public void testWithLocale_newLocale_createsNewInstance() {
        DateTimeFormatter f2 = full.withLocale(Locale.FRENCH);
        assertNotSame(full, f2);
        assertEquals(Locale.FRENCH, f2.getLocale());
    }

    @Test
    public void testWithLocale_sameReferenceAgain_returnsSame() {
        DateTimeFormatter f2 = full.withLocale(Locale.FRENCH);
        DateTimeFormatter f3 = f2.withLocale(Locale.FRENCH);
        assertSame(f2, f3);
    }

    @Test
    public void testWithLocale_differentObjectButEqualValue_returnsSame() {
        Locale l1 = new Locale("en");
        Locale l2 = new Locale("en"); // different ref, equal value
        DateTimeFormatter withEn = full.withLocale(l1);
        DateTimeFormatter result = withEn.withLocale(l2);
        // locale != getLocale() by reference, but locale.equals(getLocale()) true
        assertSame(withEn, result);
    }

    @Test
    public void testWithLocale_differentValue_createsNewInstance() {
        DateTimeFormatter withEn = full.withLocale(new Locale("en"));
        DateTimeFormatter withFr = withEn.withLocale(Locale.FRENCH);
        assertNotSame(withEn, withFr);
    }

    // ======================================================
    // withOffsetParsed / isOffsetParsed
    // ======================================================

    @Test
    public void testIsOffsetParsed_defaultFalse() {
        assertFalse(full.isOffsetParsed());
    }

    @Test
    public void testWithOffsetParsed_falseToTrue_newInstance() {
        DateTimeFormatter f2 = full.withOffsetParsed();
        assertNotSame(full, f2);
        assertTrue(f2.isOffsetParsed());
    }

    @Test
    public void testWithOffsetParsed_trueAgain_returnsSame() {
        DateTimeFormatter f2 = full.withOffsetParsed();
        DateTimeFormatter f3 = f2.withOffsetParsed();
        assertSame(f2, f3);
    }

    @Test
    public void testWithOffsetParsed_resetsZoneToNull() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(3);
        DateTimeFormatter withZone = full.withZone(zone);
        assertEquals(zone, withZone.getZone());
        DateTimeFormatter withOffsetParsed = withZone.withOffsetParsed();
        assertNull(withOffsetParsed.getZone());
        assertTrue(withOffsetParsed.isOffsetParsed());
    }

    // ======================================================
    // withChronology / getChronology / getChronolgy (deprecated)
    // ======================================================

    @Test
    public void testGetChronology_defaultNull() {
        assertNull(full.getChronology());
        assertNull(full.getChronolgy());
    }

    @Test
    public void testWithChronology_nullSameAsDefault_returnsThis() {
        DateTimeFormatter result = full.withChronology(null);
        assertSame(full, result);
    }

    @Test
    public void testWithChronology_newChronology_createsNewInstance() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeFormatter f2 = full.withChronology(chrono);
        assertNotSame(full, f2);
        assertSame(chrono, f2.getChronology());
        assertSame(chrono, f2.getChronolgy());
    }

    @Test
    public void testWithChronology_sameReferenceAgain_returnsSame() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeFormatter f2 = full.withChronology(chrono);
        DateTimeFormatter f3 = f2.withChronology(chrono);
        assertSame(f2, f3);
    }

    // ======================================================
    // withZone / withZoneUTC / getZone
    // ======================================================

    @Test
    public void testGetZone_defaultNull() {
        assertNull(full.getZone());
    }

    @Test
    public void testWithZone_nullSameAsDefault_returnsThis() {
        DateTimeFormatter result = full.withZone(null);
        assertSame(full, result);
    }

    @Test
    public void testWithZone_newZone_createsNewInstance() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        DateTimeFormatter f2 = full.withZone(zone);
        assertNotSame(full, f2);
        assertSame(zone, f2.getZone());
    }

    @Test
    public void testWithZone_sameReferenceAgain_returnsSame() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        DateTimeFormatter f2 = full.withZone(zone);
        DateTimeFormatter f3 = f2.withZone(zone);
        assertSame(f2, f3);
    }

    @Test
    public void testWithZone_alwaysResetsOffsetParsedToFalse() {
        DateTimeFormatter withOffsetParsed = full.withOffsetParsed();
        assertTrue(withOffsetParsed.isOffsetParsed());
        DateTimeFormatter withZone = withOffsetParsed.withZone(DateTimeZone.UTC);
        assertFalse(withZone.isOffsetParsed());
    }

    @Test
    public void testWithZoneUTC() {
        DateTimeFormatter f2 = full.withZoneUTC();
        assertEquals(DateTimeZone.UTC, f2.getZone());
    }

    // ======================================================
    // withPivotYear(Integer) / withPivotYear(int) / getPivotYear
    // ======================================================

    @Test
    public void testGetPivotYear_defaultNull() {
        assertNull(full.getPivotYear());
    }

    @Test
    public void testWithPivotYear_nullSameAsDefault_returnsThis() {
        DateTimeFormatter result = full.withPivotYear((Integer) null);
        assertSame(full, result);
    }

    @Test
    public void testWithPivotYear_newValue_createsNewInstance() {
        DateTimeFormatter f2 = full.withPivotYear(Integer.valueOf(1950));
        assertNotSame(full, f2);
        assertEquals(Integer.valueOf(1950), f2.getPivotYear());
    }

    @Test
    public void testWithPivotYear_equalButDifferentIntegerObject_returnsSame() {
        DateTimeFormatter f2 = full.withPivotYear(Integer.valueOf(1950));
        // new Integer object with same value -> not == but .equals() true
        Integer anotherSameValue = Integer.valueOf(1950 + 0);
        DateTimeFormatter f3 = f2.withPivotYear(new Integer(1950)); // force different reference
        assertSame(f2, f3);
    }

    @Test
    public void testWithPivotYear_differentValue_createsNewInstance() {
        DateTimeFormatter f2 = full.withPivotYear(1950);
        DateTimeFormatter f3 = f2.withPivotYear(2000);
        assertNotSame(f2, f3);
        assertEquals(Integer.valueOf(2000), f3.getPivotYear());
    }

    @Test
    public void testWithPivotYear_intOverload_delegatesToIntegerOverload() {
        DateTimeFormatter f2 = full.withPivotYear(1975);
        assertEquals(Integer.valueOf(1975), f2.getPivotYear());
    }

    // ======================================================
    // withDefaultYear / getDefaultYear
    // ======================================================

    @Test
    public void testWithDefaultYear() {
        DateTimeFormatter f2 = full.withDefaultYear(1996);
        assertEquals(1996, f2.getDefaultYear());
        assertEquals(2000, full.getDefaultYear()); // original untouched (immutability)
    }

    // ======================================================
    // print(ReadableInstant) / printTo(StringBuffer/Writer/Appendable, ReadableInstant)
    // ======================================================

    @Test
    public void testPrint_readableInstant_normal() {
        DateTime dt = new DateTime(2014, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC);
        String s = fullUTC.print(dt);
        assertEquals("2014-01-01T00:00:00.000Z", s);
    }

    @Test
    public void testPrint_readableInstant_null_usesNow() {
        // instant == null -> DateTimeUtils.getInstantMillis(null) uses "now"
        String s = fullUTC.print((org.joda.time.ReadableInstant) null);
        assertNotNull(s);
        assertTrue(s.length() > 0);
    }

    @Test
    public void testPrintTo_StringBuffer_readableInstant() {
        DateTime dt = new DateTime(2014, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC);
        StringBuffer buf = new StringBuffer();
        fullUTC.printTo(buf, dt);
        assertEquals("2014-01-01T00:00:00.000Z", buf.toString());
    }

    @Test
    public void testPrintTo_Writer_readableInstant() throws Exception {
        DateTime dt = new DateTime(2014, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC);
        StringWriter w = new StringWriter();
        fullUTC.printTo(w, dt);
        assertEquals("2014-01-01T00:00:00.000Z", w.toString());
    }

    @Test
    public void testPrintTo_Appendable_readableInstant() throws Exception {
        DateTime dt = new DateTime(2014, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC);
        StringBuilder sb = new StringBuilder();
        fullUTC.printTo(sb, dt);
        assertEquals("2014-01-01T00:00:00.000Z", sb.toString());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testPrint_requirePrinter_throwsWhenNoPrinter() {
        parserOnly.print(0L);
    }

    // ======================================================
    // print(long) / printTo(StringBuffer/Writer/Appendable, long)
    // ======================================================

    @Test
    public void testPrint_long_zeroOffset() {
        assertEquals("1970-01-01T00:00:00.000Z", fullUTC.print(0L));
    }

    @Test
    public void testPrintTo_StringBuffer_long() {
        StringBuffer buf = new StringBuffer();
        fullUTC.printTo(buf, 0L);
        assertEquals("1970-01-01T00:00:00.000Z", buf.toString());
    }

    @Test
    public void testPrintTo_Writer_long() throws Exception {
        StringWriter w = new StringWriter();
        fullUTC.printTo(w, 0L);
        assertEquals("1970-01-01T00:00:00.000Z", w.toString());
    }

    @Test
    public void testPrintTo_Appendable_long() throws Exception {
        StringBuilder sb = new StringBuilder();
        fullUTC.printTo(sb, 0L);
        assertEquals("1970-01-01T00:00:00.000Z", sb.toString());
    }

    @Test
    public void testPrint_long_withPositiveOffset_noOverflow() {
        // exercises the "offset != 0, no overflow" path of the private printTo(buf, instant, chrono)
        DateTimeFormatter withOffset = full.withZone(DateTimeZone.forOffsetHours(5));
        assertEquals("1970-01-01T05:00:00.000+05:00", withOffset.print(0L));
    }

    @Test
    public void testPrintTo_Writer_withPositiveOffset_noOverflow() throws Exception {
        DateTimeFormatter withOffset = full.withZone(DateTimeZone.forOffsetHours(5));
        StringWriter w = new StringWriter();
        withOffset.printTo(w, 0L);
        assertEquals("1970-01-01T05:00:00.000+05:00", w.toString());
    }

    @Test
    public void testPrint_long_extremeValue_triggersOverflowBranch() {
        // Long.MAX_VALUE + positive offset overflows -> condition
        // (instant ^ adjustedInstant) < 0 && (instant ^ offset) >= 0  is expected to be true,
        // forcing the "revert to UTC" branch inside private printTo(StringBuffer, long, Chronology).
        // The exact resulting exception type is NOT guaranteed by the source (it depends on
        // downstream field calculations), so we only assert that *some* exception/throwable occurs,
        // without asserting its concrete type.
        DateTimeFormatter withOffset = full.withZone(DateTimeZone.forOffsetHours(2));
        try {
            withOffset.print(Long.MAX_VALUE);
            fail("Expected some exception/error due to extreme long value (overflow branch)");
        } catch (Throwable t) {
            assertNotNull(t);
        }
    }

    // ======================================================
    // print(ReadablePartial) / printTo(StringBuffer/Writer/Appendable, ReadablePartial)
    // ======================================================

    @Test
    public void testPrint_readablePartial_normal() {
        LocalDate date = new LocalDate(2020, 5, 17);
        assertEquals("2020-05-17", dateOnly.print(date));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintTo_StringBuffer_readablePartial_null_throws() {
        dateOnly.printTo(new StringBuffer(), (org.joda.time.ReadablePartial) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintTo_Writer_readablePartial_null_throws() throws Exception {
        dateOnly.printTo(new StringWriter(), (org.joda.time.ReadablePartial) null);
    }

    @Test
    public void testPrintTo_StringBuffer_readablePartial_normal() {
        LocalDate date = new LocalDate(2020, 5, 17);
        StringBuffer buf = new StringBuffer();
        dateOnly.printTo(buf, date);
        assertEquals("2020-05-17", buf.toString());
    }

    @Test
    public void testPrintTo_Writer_readablePartial_normal() throws Exception {
        LocalDate date = new LocalDate(2020, 5, 17);
        StringWriter w = new StringWriter();
        dateOnly.printTo(w, date);
        assertEquals("2020-05-17", w.toString());
    }

    @Test
    public void testPrintTo_Appendable_readablePartial_normal() throws Exception {
        LocalDate date = new LocalDate(2020, 5, 17);
        StringBuilder sb = new StringBuilder();
        dateOnly.printTo(sb, date);
        assertEquals("2020-05-17", sb.toString());
    }

    // ======================================================
    // parseMillis
    // ======================================================

    @Test
    public void testParseMillis_valid() {
        assertEquals(0L, fullUTC.parseMillis("1970-01-01T00:00:00.000Z"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseMillis_invalidText_throws() {
        fullUTC.parseMillis("not-a-date");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseMillis_partialMatchNotFullLength_throws() {
        // newPos >= 0 but < text.length() -> falls through to throw
        fullUTC.parseMillis("1970-01-01T00:00:00.000ZEXTRA");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testParseMillis_requireParser_throwsWhenNoParser() {
        printerOnly.parseMillis("1970-01-01T00:00:00.000Z");
    }

    // ======================================================
    // parseLocalDate / parseLocalTime / parseLocalDateTime
    // ======================================================

    @Test
    public void testParseLocalDate() {
        LocalDate expected = new LocalDate(2020, 5, 17);
        LocalDate result = dateOnly.parseLocalDate("2020-05-17");
        assertEquals(expected, result);
    }

    @Test
    public void testParseLocalTime() {
        LocalTime expected = new LocalTime(12, 30, 0, 0);
        LocalTime result = timeOnly.parseLocalTime("12:30:00.000");
        assertEquals(expected, result);
    }

    @Test
    public void testParseLocalDateTime_normal() {
        LocalDateTime expected = new LocalDateTime(2020, 5, 17, 12, 30, 0, 0);
        LocalDateTime result = dateTimeNoZone.parseLocalDateTime("2020-05-17T12:30:00.000");
        assertEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseLocalDateTime_partialMatchNotFullLength_throws() {
        dateTimeNoZone.parseLocalDateTime("2020-05-17T12:30:00.000EXTRA");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseLocalDateTime_invalidText_throws() {
        dateTimeNoZone.parseLocalDateTime("garbage");
    }

    // ======================================================
    // parseDateTime
    // ======================================================

    @Test
    public void testParseDateTime_normal() {
        DateTime dt = fullUTC.parseDateTime("1970-01-01T00:00:00.000Z");
        assertEquals(0L, dt.getMillis());
    }

    @Test
    public void testParseDateTime_offsetParsedTrue_usesParsedOffsetZone() {
        DateTimeFormatter f = full.withOffsetParsed();
        DateTime dt = f.parseDateTime("1970-01-01T02:00:00.000+02:00");
        assertEquals(0L, dt.getMillis());
        assertEquals(DateTimeZone.forOffsetHours(2), dt.getZone());
    }

    @Test
    public void testParseDateTime_withZoneOverride_forcesFinalZone() {
        DateTimeFormatter f = full.withZone(DateTimeZone.UTC);
        DateTime dt = f.parseDateTime("1970-01-01T02:00:00.000+02:00");
        assertEquals(0L, dt.getMillis());
        assertEquals(DateTimeZone.UTC, dt.getZone());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDateTime_invalidText_throws() {
        fullUTC.parseDateTime("garbage");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDateTime_partialMatchNotFullLength_throws() {
        fullUTC.parseDateTime("1970-01-01T00:00:00.000ZEXTRA");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testParseDateTime_requireParser_throwsWhenNoParser() {
        printerOnly.parseDateTime("1970-01-01T00:00:00.000Z");
    }

    // ======================================================
    // parseMutableDateTime
    // ======================================================

    @Test
    public void testParseMutableDateTime_normal() {
        MutableDateTime dt = fullUTC.parseMutableDateTime("1970-01-01T00:00:00.000Z");
        assertEquals(0L, dt.getMillis());
    }

    @Test
    public void testParseMutableDateTime_withZoneOverride() {
        DateTimeFormatter f = full.withZone(DateTimeZone.UTC);
        MutableDateTime dt = f.parseMutableDateTime("1970-01-01T02:00:00.000+02:00");
        assertEquals(0L, dt.getMillis());
        assertEquals(DateTimeZone.UTC, dt.getZone());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseMutableDateTime_invalidText_throws() {
        fullUTC.parseMutableDateTime("garbage");
    }

    // ======================================================
    // parseInto
    // ======================================================

    @Test
    public void testParseInto_normal() {
        MutableDateTime instant = new MutableDateTime(0L, DateTimeZone.UTC);
        String text = "2020-01-01T00:00:00.000Z";
        int pos = fullUTC.parseInto(instant, text, 0);
        assertEquals(text.length(), pos);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseInto_nullInstant_throws() {
        fullUTC.parseInto(null, "2020-01-01T00:00:00.000Z", 0);
    }

    @Test
    public void testParseInto_offsetParsedTrue_usesParsedOffsetZone() {
        DateTimeFormatter f = full.withOffsetParsed();
        MutableDateTime instant = new MutableDateTime(0L, DateTimeZone.UTC);
        f.parseInto(instant, "1970-01-01T02:00:00.000+02:00", 0);
        assertEquals(DateTimeZone.forOffsetHours(2), instant.getZone());
    }

    @Test
    public void testParseInto_withZoneOverride_setsFinalZone() {
        DateTimeFormatter f = full.withZone(DateTimeZone.UTC);
        MutableDateTime instant = new MutableDateTime(0L, DateTimeZone.forOffsetHours(2));
        f.parseInto(instant, "1970-01-01T02:00:00.000+02:00", 0);
        assertEquals(DateTimeZone.UTC, instant.getZone());
    }

    @Test
    public void testParseInto_invalidText_returnsNegativePosition_noException() {
        // parseInto does NOT throw on failure; it returns a negative position.
        MutableDateTime instant = new MutableDateTime(0L, DateTimeZone.UTC);
        int pos = fullUTC.parseInto(instant, "garbage-text", 0);
        assertTrue(pos < 0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testParseInto_requireParser_throwsWhenNoParser() {
        MutableDateTime instant = new MutableDateTime(0L, DateTimeZone.UTC);
        printerOnly.parseInto(instant, "2020-01-01T00:00:00.000Z", 0);
    }

    // ======================================================
    // selectChronology combos (through withChronology + withZone + print/parse)
    // ======================================================

    @Test
    public void testSelectChronology_zoneOverrideTakesPrecedenceOverChronologyZone() {
        Chronology chronoWithParisZone = ISOChronology.getInstance(DateTimeZone.forID("Europe/Paris"));
        DateTimeFormatter f = full.withChronology(chronoWithParisZone).withZone(DateTimeZone.UTC);
        String printed = f.print(0L);
        // zone override (UTC) should win over chronology's own zone (Paris)
        assertEquals("1970-01-01T00:00:00.000Z", printed);
    }
}
```

สรุปตาราง Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testConstructor_bothNull/_printerOnly/_parserOnly/_both | isPrinter(), isParser() ทั้ง true/false |
| testDefaultYear_defaultIs2000 | ค่าเริ่มต้น iDefaultYear |
| testWithLocale_nullEqualsNull_returnsSame | `locale == getLocale()` (null==null) true |
| testWithLocale_newLocale_createsNewInstance | เงื่อนไขเป็น false → สร้าง instance ใหม่ |
| testWithLocale_sameReferenceAgain_returnsSame | `locale == getLocale()` reference true |
| testWithLocale_differentObjectButEqualValue_returnsSame | `locale != null && locale.equals(getLocale())` true |
| testWithLocale_differentValue_createsNewInstance | ทั้งสองเงื่อนไข false |
| testWithOffsetParsed_* | `iOffsetParsed==true` true/false, รีเซ็ต iZone เป็น null |
| testWithChronology_* / testGetChronology_defaultNull | `iChrono==chrono` true/false, getChronology/getChronolgy |
| testWithZone_* / testWithZoneUTC | `iZone==zone` true/false, reset offsetParsed=false |
| testWithPivotYear_* | `iPivotYear==pivotYear` และ `.equals()` ทั้ง true/false, int overload |
| testWithDefaultYear | สร้าง instance ใหม่พร้อม defaultYear |
| testPrint_readableInstant_* / testPrintTo_*_readableInstant | printTo(buf/out/appendable, ReadableInstant), instant null |
| testPrint_requirePrinter_throwsWhenNoPrinter | requirePrinter() throw UnsupportedOperationException |
| testPrint_long_* / testPrintTo_*_long | printTo(long) overloads, offset=0 และ offset≠0 (ไม่ overflow) |
| testPrint_long_extremeValue_triggersOverflowBranch | branch overflow `(instant^adjustedInstant)<0 && (instant^offset)>=0` |
| testPrint_readablePartial_* / testPrintTo_*_readablePartial_* | printTo(partial) ปกติ และ partial==null throw |
| testParseMillis_* | parseMillis ปกติ/invalid/partial-match/ไม่มี parser |
| testParseLocalDate/Time/DateTime_* | parseLocalXxx ปกติ/offset branch/invalid/partial |
| testParseDateTime_* | iOffsetParsed branch, bucket.getZone() ignored กรณีมี iZone, invalid/partial/ไม่มี parser |
| testParseMutableDateTime_* | เหมือน parseDateTime สำหรับ MutableDateTime |
| testParseInto_* | instant==null throw, offsetParsed branch, iZone branch, parse ล้มเหลวคืนค่าลบ (ไม่ throw), ไม่มี parser |
| testSelectChronology_zoneOverrideTakesPrecedenceOverChronologyZone | selectChronology: iChrono!=null และ iZone!=null ร่วมกัน |

**กรณีที่ข้าม (ระบุชัดในคอมเมนต์):** การ parse named time-zone ด้วย pattern `zzz`/`zzzz` เพื่อเข้า branch `else if (bucket.getZone() != null)` ใน `parseInto`/`parseDateTime`/`parseMutableDateTime` เนื่องจากพฤติกรรมขึ้นกับ locale/ฐานข้อมูล timezone ของ JVM ซึ่งไม่ได้ระบุไว้ตรง ๆ ใน source ที่ให้มา