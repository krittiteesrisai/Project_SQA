# FastDateParserTest.java

หมายเหตุสำคัญก่อนเริ่ม:
- คลาสเป้าหมายมี constructor เป็น `protected` และมีเมธอด/ฟิลด์ package-private หลายตัว (`getDisplayNames`, `adjustYear`, `isNextNumber`, `getFieldWidth`, `getParsePattern`, `JAPANESE_IMPERIAL`) จึงต้องวาง **FastDateParserTest ไว้ใน package เดียวกัน** (`org.apache.commons.lang3.time`) เพื่อให้เข้าถึงได้โดยไม่ต้องใช้ reflection
- คลาส `KeyValue` เป็น `private` nested class จึงไม่สามารถอ้างชนิดได้ตรง ๆ แม้จะอยู่ package เดียวกัน — จึงเลือกทดสอบผ่าน public API (parse) แทนการเรียก `getDisplayNames` โดยตรงกับชนิดนั้น
- บาง branch (เช่น race-condition ของ `tzsCache`/`nameValues.putIfAbsent` ที่ `prior!=null`, หรือ early-return ใน `escapeRegex` เมื่อ `++i==value.length()`) **ไม่สามารถ trigger ได้ผ่าน public API แบบ single-thread** จะระบุเป็นคอมเมนต์กำกับไว้ ไม่เดา behavior เพิ่ม

```java
package org.apache.commons.lang3.time;

import static org.junit.Assert.*;

import java.io.*;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Test;

/**
 * Unit tests สำหรับ FastDateParser (Defects4J Lang-10b)
 * วางไว้ package เดียวกับคลาสเป้าหมายเพื่อเข้าถึง protected constructor
 * และเมธอด package-private ที่ใช้ทดสอบภายใน
 */
public class FastDateParserTest {

    private static final TimeZone UTC = TimeZone.getTimeZone("UTC");
    private static final Locale US = Locale.US;

    // ---------- helper ----------

    private int[] ymd(Date date, TimeZone tz, Locale locale) {
        Calendar c = Calendar.getInstance(tz, locale);
        c.setTime(date);
        return new int[]{c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH)};
    }

    private Calendar toCalendar(Date date, TimeZone tz, Locale locale) {
        Calendar c = Calendar.getInstance(tz, locale);
        c.setTime(date);
        return c;
    }

    // ---------- Accessors / equals / hashCode / toString ----------

    @Test
    public void testAccessors() {
        FastDateParser fdp = new FastDateParser("yyyy-MM-dd", UTC, US);
        assertEquals("yyyy-MM-dd", fdp.getPattern());
        assertEquals(UTC, fdp.getTimeZone());
        assertEquals(US, fdp.getLocale());
    }

    @Test
    public void testEqualsSameValues() {
        FastDateParser a = new FastDateParser("yyyy-MM-dd", UTC, US);
        FastDateParser b = new FastDateParser("yyyy-MM-dd", UTC, US);
        assertTrue(a.equals(b));
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testEqualsDifferentPattern() {
        FastDateParser a = new FastDateParser("yyyy-MM-dd", UTC, US);
        FastDateParser b = new FastDateParser("yyyy/MM/dd", UTC, US);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsDifferentTimeZone() {
        FastDateParser a = new FastDateParser("yyyy-MM-dd", UTC, US);
        FastDateParser b = new FastDateParser("yyyy-MM-dd", TimeZone.getTimeZone("GMT+1"), US);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsDifferentLocale() {
        FastDateParser a = new FastDateParser("yyyy-MM-dd", UTC, US);
        FastDateParser b = new FastDateParser("yyyy-MM-dd", UTC, Locale.GERMANY);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsNotInstanceOfSameClass() {
        FastDateParser a = new FastDateParser("yyyy-MM-dd", UTC, US);
        assertFalse(a.equals("not a FastDateParser"));
    }

    @Test
    public void testEqualsNull() {
        FastDateParser a = new FastDateParser("yyyy-MM-dd", UTC, US);
        assertFalse(a.equals(null));
    }

    @Test
    public void testToString() {
        FastDateParser fdp = new FastDateParser("yyyy", UTC, US);
        String s = fdp.toString();
        assertTrue(s.contains("yyyy"));
        assertTrue(s.contains("UTC"));
    }

    // ---------- Invalid pattern (init() throw branch) ----------

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPatternUnsupportedLetter() {
        // 'Q' ไม่อยู่ใน formatPattern -> lookingAt() = false ตั้งแต่ครั้งแรก
        new FastDateParser("QQQ", UTC, US);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPatternEmptyString() {
        // string ว่าง ไม่ match alternative ใดเลย (ทุก alternative ต้องมีอย่างน้อย 1 ตัวอักษร)
        new FastDateParser("", UTC, US);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPatternUnbalancedQuote() {
        // quote เปิดแต่ไม่ปิด -> ไม่ match 'quoted' alternative และไม่ match [^'A-Za-z]++ (เพราะ exclude quote)
        new FastDateParser("'abc", UTC, US);
    }

    // ---------- Null parameter behavior (ตาม JDK Calendar/Matcher, ไม่ได้เดาเพิ่ม) ----------

    @Test(expected = NullPointerException.class)
    public void testNullPatternThrowsNPE() {
        new FastDateParser(null, UTC, US);
    }

    @Test(expected = NullPointerException.class)
    public void testNullTimeZoneThrowsNPE() {
        // Calendar.getInstance(null, locale) ของ JDK จะ throw NPE
        new FastDateParser("yyyy", null, US);
    }

    @Test(expected = NullPointerException.class)
    public void testNullLocaleThrowsNPE() {
        new FastDateParser("yyyy", UTC, null);
    }

    // ---------- Basic numeric fields / literal separators (CopyQuotedStrategy) ----------

    @Test
    public void testParseSimpleDateWithLiteralSeparators() throws ParseException {
        FastDateParser fdp = new FastDateParser("yyyy-MM-dd", UTC, US);
        Date d = fdp.parse("2021-05-20");
        int[] ymd = ymd(d, UTC, US);
        assertEquals(2021, ymd[0]);
        assertEquals(Calendar.MAY, ymd[1]);
        assertEquals(20, ymd[2]);
    }

    @Test
    public void testParseAbbreviatedYearStrategyBelow100() throws ParseException {
        // 'yy' -> ABBREVIATED_YEAR_STRATEGY -> adjustYear ใช้คำนวณศตวรรษ
        FastDateParser fdp = new FastDateParser("yy-MM-dd", UTC, US);
        Date d = fdp.parse("21-05-20");
        int[] ymd = ymd(d, UTC, US);
        // ปีที่ได้ควรอยู่ในช่วง thisYear-80 .. thisYear+19 และลงท้ายด้วย 21
        assertEquals(21, ymd[0] % 100);
    }

    @Test
    public void testParseLiteralYearStrategyMoreThan2Digits() throws ParseException {
        FastDateParser fdp = new FastDateParser("yyyy", UTC, US);
        Date d = fdp.parse("1999");
        assertEquals(1999, ymd(d, UTC, US)[0]);
    }

    @Test
    public void testParseNumberMonthStrategyModifyMinusOne() throws ParseException {
        FastDateParser fdp = new FastDateParser("MM", UTC, US);
        Date d = fdp.parse("05");
        assertEquals(Calendar.MAY, ymd(d, UTC, US)[1]); // index 4 = MAY (0-based)
    }

    @Test
    public void testParseTextMonthStrategy() throws ParseException {
        // length>=3 -> TEXT_MONTH_STRATEGY, ใช้ short month name มาตรฐานของ Locale.US
        FastDateParser fdp = new FastDateParser("MMM", UTC, US);
        Date d = fdp.parse("Jan");
        assertEquals(Calendar.JANUARY, ymd(d, UTC, US)[1]);
    }

    @Test
    public void testParseDayOfWeekText() throws ParseException {
        FastDateParser fdp = new FastDateParser("EEE", UTC, US);
        Date d = fdp.parse("Mon");
        Calendar cal = toCalendar(d, UTC, US);
        assertEquals(Calendar.MONDAY, cal.get(Calendar.DAY_OF_WEEK));
    }

    @Test
    public void testParseEraText() throws ParseException {
        FastDateParser fdp = new FastDateParser("GG", UTC, US);
        Date d = fdp.parse("AD");
        Calendar cal = toCalendar(d, UTC, US);
        assertEquals(1 /* GregorianCalendar.AD */, cal.get(Calendar.ERA));
    }

    @Test
    public void testParseAmPmText() throws ParseException {
        FastDateParser fdp = new FastDateParser("a", UTC, US);
        Date d = fdp.parse("PM");
        Calendar cal = toCalendar(d, UTC, US);
        assertEquals(Calendar.PM, cal.get(Calendar.AM_PM));
    }

    // ---------- Hour strategies: modulo vs no-modulo branches ----------

    @Test
    public void testModuloHourOfDayStrategy_HH_over24() throws ParseException {
        // 'H' -> MODULO_HOUR_OF_DAY_STRATEGY: 25 % 24 = 1
        FastDateParser fdp = new FastDateParser("HH", UTC, US);
        Date d = fdp.parse("25");
        Calendar cal = toCalendar(d, UTC, US);
        assertEquals(1, cal.get(Calendar.HOUR_OF_DAY));
    }

    @Test
    public void testModuloHourStrategy_hh_over12() throws ParseException {
        // 'h' -> MODULO_HOUR_STRATEGY: 13 % 12 = 1
        FastDateParser fdp = new FastDateParser("hh", UTC, US);
        Date d = fdp.parse("13");
        Calendar cal = toCalendar(d, UTC, US);
        assertEquals(1, cal.get(Calendar.HOUR));
    }

    @Test
    public void testHourStrategy_K_noModulo() throws ParseException {
        // 'K' -> HOUR_STRATEGY (ไม่ modulo)
        FastDateParser fdp = new FastDateParser("KK", UTC, US);
        Date d = fdp.parse("05");
        Calendar cal = toCalendar(d, UTC, US);
        assertEquals(5, cal.get(Calendar.HOUR));
    }

    @Test
    public void testHourOfDayStrategy_k_noModulo() throws ParseException {
        // 'k' -> HOUR_OF_DAY_STRATEGY (ไม่ modulo) ใช้ค่าปลอดภัยในช่วง 0-23 เพื่อไม่ normalize
        FastDateParser fdp = new FastDateParser("kk", UTC, US);
        Date d = fdp.parse("05");
        Calendar cal = toCalendar(d, UTC, US);
        assertEquals(5, cal.get(Calendar.HOUR_OF_DAY));
    }

    @Test
    public void testMinuteSecondMillisecondStrategies() throws ParseException {
        FastDateParser fdp = new FastDateParser("mm:ss.SSS", UTC, US);
        Date d = fdp.parse("30:45.123");
        Calendar cal = toCalendar(d, UTC, US);
        assertEquals(30, cal.get(Calendar.MINUTE));
        assertEquals(45, cal.get(Calendar.SECOND));
        assertEquals(123, cal.get(Calendar.MILLISECOND));
    }

    // ---------- isNextNumber() = true branch: adjacent numeric fields ----------

    @Test
    public void testAdjacentNumericFieldsFixedWidth() throws ParseException {
        // 'HHmm' -> H ต้อง addRegex ด้วย fixed width (isNextNumber()==true ขณะ init())
        FastDateParser fdp = new FastDateParser("HHmm", UTC, US);
        Date d = fdp.parse("0530");
        Calendar cal = toCalendar(d, UTC, US);
        assertEquals(5, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(30, cal.get(Calendar.MINUTE));
    }

    // ---------- Day-of-year / week-of-month etc. (เน้นให้ parse สำเร็จ ครอบคลุม strategy) ----------

    @Test
    public void testDayOfYearStrategy() throws ParseException {
        FastDateParser fdp = new FastDateParser("yyyy-DDD", UTC, US);
        Date d = fdp.parse("2021-050");
        Calendar cal = toCalendar(d, UTC, US);
        assertEquals(2021, cal.get(Calendar.YEAR));
        assertEquals(50, cal.get(Calendar.DAY_OF_YEAR));
    }

    @Test
    public void testWeekOfMonthAndDayOfWeekInMonthStrategiesDoNotThrow() throws ParseException {
        // 'W' และ 'F' - เน้นว่า parse ไม่ throw (ค่า field อาจถูก normalize โดย Calendar)
        FastDateParser fdp1 = new FastDateParser("W", UTC, US);
        assertNotNull(fdp1.parse("2"));
        FastDateParser fdp2 = new FastDateParser("F", UTC, US);
        assertNotNull(fdp2.parse("1"));
    }

    @Test
    public void testWeekOfYearStrategyDoesNotThrow() throws ParseException {
        FastDateParser fdp = new FastDateParser("w", UTC, US);
        assertNotNull(fdp.parse("5"));
    }

    // ---------- TimeZoneStrategy: 3 branches ของ setCalendar ----------

    @Test
    public void testTimeZoneStrategyLeadingSign() throws ParseException {
        FastDateParser fdp = new FastDateParser("Z", UTC, US);
        Date d = fdp.parse("+0100");
        assertNotNull(d);
    }

    @Test
    public void testTimeZoneStrategyGmtPrefix() throws ParseException {
        FastDateParser fdp = new FastDateParser("z", UTC, US);
        Date d = fdp.parse("GMT+01");
        assertNotNull(d);
    }

    @Test
    public void testTimeZoneStrategyNamedZone() throws ParseException {
        // ใช้ชื่อย่อโซนเวลาที่พบทั่วไปใน JDK TZ DB (อาจแตกต่างได้ตามแพลตฟอร์ม)
        FastDateParser fdp = new FastDateParser("z", UTC, US);
        Date d = fdp.parse("EST");
        assertNotNull(d);
    }

    @Test
    public void testTimeZoneStrategyCacheReuseSameLocale() throws ParseException {
        // สร้าง 2 instance ด้วย locale เดียวกัน เพื่อให้ tzsCache ถูก hit (tzs != null) ในครั้งที่สอง
        FastDateParser fdp1 = new FastDateParser("z", UTC, Locale.FRANCE);
        FastDateParser fdp2 = new FastDateParser("z", UTC, Locale.FRANCE);
        assertNotNull(fdp1.parse("+0200"));
        assertNotNull(fdp2.parse("+0200"));
    }

    // ---------- Quoted literal (CopyQuotedStrategy + escapeRegex) ----------

    @Test
    public void testQuotedLiteralStrippedWhenLengthGreaterThan2() throws ParseException {
        // "'T'" length=3>2 -> strip quotes -> formatField = "T"
        FastDateParser fdp = new FastDateParser("yyyy'T'HH", UTC, US);
        Date d = fdp.parse("2021T05");
        Calendar cal = toCalendar(d, UTC, US);
        assertEquals(2021, cal.get(Calendar.YEAR));
        assertEquals(5, cal.get(Calendar.HOUR_OF_DAY));
    }

    @Test
    public void testDoubledQuoteAsLiteralApostrophe() throws ParseException {
        // "''" (สองตัว) -> literal เครื่องหมาย ' ตัวเดียว
        FastDateParser fdp = new FastDateParser("yyyy''MM", UTC, US);
        Date d = fdp.parse("2021'05");
        Calendar cal = toCalendar(d, UTC, US);
        assertEquals(2021, cal.get(Calendar.YEAR));
        assertEquals(Calendar.MAY, cal.get(Calendar.MONTH));
    }

    @Test
    public void testQuotedTextWithEmbeddedEscapedQuote() throws ParseException {
        // literal เพียวล้วน แทนคำว่า don't (ไม่มี date field)
        FastDateParser fdp = new FastDateParser("'don''t'", UTC, US);
        Date d = fdp.parse("don't");
        assertNotNull(d);
    }

    @Test
    public void testLiteralWithSpecialRegexCharacters() throws ParseException {
        // '.' ต้องถูก escape ใน escapeRegex (switch-case default escaping)
        FastDateParser fdp = new FastDateParser("yyyy.MM.dd", UTC, US);
        Date d = fdp.parse("2021.05.20");
        int[] ymd = ymd(d, UTC, US);
        assertEquals(2021, ymd[0]);
        assertEquals(Calendar.MAY, ymd[1]);
        assertEquals(20, ymd[2]);
    }

    @Test
    public void testLiteralWithMultipleSpecialCharacters() throws ParseException {
        // ครอบคลุม '[' '+' '*' ']' ในคราวเดียว
        FastDateParser fdp = new FastDateParser("yyyy[+*]MM", UTC, US);
        Date d = fdp.parse("2021[+*]05");
        int[] ymd = ymd(d, UTC, US);
        assertEquals(2021, ymd[0]);
        assertEquals(Calendar.MAY, ymd[1]);
    }

    @Test
    public void testWhitespaceLiteralCollapsesToFlexibleRegex() throws ParseException {
        // escapeRegex: whitespace -> "\\s*+" ยอมรับช่องว่างได้หลายตัว/ไม่มีก็ได้ตามรูปแบบ regex ที่สร้าง
        FastDateParser fdp = new FastDateParser("yyyy MM", UTC, US);
        Date d1 = fdp.parse("2021 05");
        Date d2 = fdp.parse("2021   05");
        assertNotNull(d1);
        assertNotNull(d2);
    }

    // ---------- parse(String, ParsePosition) mismatch -> null / ParseException ----------

    @Test
    public void testParseWithParsePositionReturnsNullOnMismatch() {
        FastDateParser fdp = new FastDateParser("yyyy", UTC, US);
        ParsePosition pos = new ParsePosition(0);
        Date d = fdp.parse("abcd", pos);
        assertNull(d);
    }

    @Test
    public void testParseStringThrowsParseExceptionOnMismatch() {
        FastDateParser fdp = new FastDateParser("yyyy", UTC, US);
        try {
            fdp.parse("abcd");
            fail("ควร throw ParseException");
        } catch (ParseException e) {
            assertTrue(e.getMessage().startsWith("Unparseable date:"));
            // locale ปกติไม่ควรมีข้อความพิเศษเกี่ยวกับ 1868 AD
            assertFalse(e.getMessage().contains("1868 AD"));
        }
    }

    @Test
    public void testParseStringJapaneseImperialLocaleSpecialMessage() {
        // ตรง branch locale.equals(JAPANESE_IMPERIAL) ใน parse(String)
        FastDateParser fdp = new FastDateParser("yyyy", UTC, FastDateParser.JAPANESE_IMPERIAL);
        try {
            fdp.parse("abcd");
            fail("ควร throw ParseException");
        } catch (ParseException e) {
            assertTrue(e.getMessage().contains("1868 AD"));
        }
    }

    // ---------- parseObject delegation ----------

    @Test
    public void testParseObjectStringDelegatesToParse() throws ParseException {
        FastDateParser fdp = new FastDateParser("yyyy", UTC, US);
        Object result = fdp.parseObject("2021");
        assertTrue(result instanceof Date);
    }

    @Test
    public void testParseObjectWithPositionDelegatesToParse() {
        FastDateParser fdp = new FastDateParser("yyyy", UTC, US);
        ParsePosition pos = new ParsePosition(0);
        Object result = fdp.parseObject("2021", pos);
        assertTrue(result instanceof Date);
    }

    // ---------- Serialization (readObject -> init()) ----------

    @Test
    public void testSerializationReinitializesTransientFields() throws Exception {
        FastDateParser original = new FastDateParser("yyyy-MM-dd", UTC, US);

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        FastDateParser deserialized = (FastDateParser) ois.readObject();
        ois.close();

        assertEquals(original.getPattern(), deserialized.getPattern());
        assertEquals(original.getTimeZone(), deserialized.getTimeZone());
        assertEquals(original.getLocale(), deserialized.getLocale());

        Date d = deserialized.parse("2021-07-04");
        int[] ymd = ymd(d, UTC, US);
        assertEquals(2021, ymd[0]);
        assertEquals(Calendar.JULY, ymd[1]);
        assertEquals(4, ymd[2]);
    }

    // ---------- Package-private helper methods: adjustYear / isNextNumber ----------

    @Test
    public void testAdjustYearBothBranchesAcrossRange() {
        FastDateParser fdp = new FastDateParser("yy", UTC, US);
        int thisYear = Calendar.getInstance(UTC, US).get(Calendar.YEAR);
        int base = thisYear - (thisYear % 100);

        for (int twoDigit = 0; twoDigit <= 99; twoDigit++) {
            int trial = twoDigit + base;
            int expected = (trial < thisYear + 20) ? trial : trial - 100;
            assertEquals("twoDigit=" + twoDigit, expected, fdp.adjustYear(twoDigit));
        }
    }

    @Test
    public void testIsNextNumberFalseAfterConstruction() {
        // หลัง init() เสร็จ nextStrategy ถูกเซ็ตเป็น null เสมอ (ดูลูปใน init())
        FastDateParser fdp = new FastDateParser("yyyy-MM-dd", UTC, US);
        assertFalse(fdp.isNextNumber());
    }

    @Test(expected = NullPointerException.class)
    public void testGetFieldWidthThrowsAfterConstruction() {
        // currentFormatField ถูกเซ็ตเป็น null หลัง init() เสร็จ (ตามซอร์สโค้ด)
        // หมายเหตุ: ใช้ภายในระหว่าง init() เท่านั้น เรียกหลัง construct คาดว่า NPE ตามพฤติกรรมจริงของซอร์ส
        FastDateParser fdp = new FastDateParser("yyyy", UTC, US);
        fdp.getFieldWidth();
    }

    // ---------- getDisplayNames: default-case throws ----------

    @Test(expected = IllegalArgumentException.class)
    public void testGetDisplayNamesInvalidFieldThrows() {
        FastDateParser fdp = new FastDateParser("yyyy", UTC, US);
        // Calendar.YEAR ไม่อยู่ใน switch(ERA/DAY_OF_WEEK/AM_PM/MONTH) -> default throw
        fdp.getDisplayNames(Calendar.YEAR);
    }

    @Test
    public void testGetDisplayNamesCachesResultSameReference() {
        FastDateParser fdp = new FastDateParser("MMM", UTC, US);
        Object first = fdp.getDisplayNames(Calendar.MONTH);
        Object second = fdp.getDisplayNames(Calendar.MONTH);
        assertSame(first, second); // nameValues cache hit (ข้าม switch ทั้งหมดในครั้งที่สอง)
    }
}
```

## สรุปตาราง Test coverage

| Test method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testAccessors | getPattern/getTimeZone/getLocale |
| testEquals* (5 methods) | equals(): instanceof false, pattern/tz/locale mismatch, null |
| testToString | toString() format |
| testInvalidPatternUnsupportedLetter/Empty/UnbalancedQuote | init(): `!patternMatcher.lookingAt()` → throw IllegalArgumentException |
| testNullPatternThrowsNPE / testNullTimeZoneThrowsNPE / testNullLocaleThrowsNPE | boundary: null input (พฤติกรรมจาก JDK ไม่ได้เดา) |
| testParseSimpleDateWithLiteralSeparators | CopyQuotedStrategy (literal `-`), loop หลาย field |
| testParseAbbreviatedYearStrategyBelow100 | `y` length≤2 → ABBREVIATED_YEAR_STRATEGY + adjustYear path |
| testParseLiteralYearStrategyMoreThan2Digits | `y` length>2 → LITERAL_YEAR_STRATEGY |
| testParseNumberMonthStrategyModifyMinusOne | `M` length<3 → NUMBER_MONTH_STRATEGY, modify() |
| testParseTextMonthStrategy | `M` length≥3 → TEXT_MONTH_STRATEGY, TextStrategy.setCalendar (binarySearch idx≥0) |
| testParseDayOfWeekText | `E` → DAY_OF_WEEK_STRATEGY |
| testParseEraText | `G` → ERA_STRATEGY |
| testParseAmPmText | `a` → AM_PM_STRATEGY |
| testModuloHourOfDayStrategy_HH_over24 | `H` → modulo %24 |
| testModuloHourStrategy_hh_over12 | `h` → modulo %12 |
| testHourStrategy_K_noModulo | `K` → ไม่ modulo |
| testHourOfDayStrategy_k_noModulo | `k` → ไม่ modulo |
| testMinuteSecondMillisecondStrategies | `m`,`s`,`S` strategies |
| testAdjacentNumericFieldsFixedWidth | NumberStrategy.addRegex: `isNextNumber()==true` branch (fixed width) |
| testDayOfYearStrategy | `D` → DAY_OF_YEAR_STRATEGY |
| testWeekOfMonthAndDayOfWeekInMonthStrategiesDoNotThrow | `W`,`F` strategies (ไม่ assert ค่าแน่นอนเพราะ Calendar normalize) |
| testWeekOfYearStrategyDoesNotThrow | `w` strategy |
| testTimeZoneStrategyLeadingSign | TimeZoneStrategy.setCalendar: `value.charAt(0)=='+'/'-'` |
| testTimeZoneStrategyGmtPrefix | `value.startsWith("GMT")` |
| testTimeZoneStrategyNamedZone | else branch: `tzNames.get(value)` |
| testTimeZoneStrategyCacheReuseSameLocale | getStrategy(): tzsCache miss→create และ cache hit |
| testQuotedLiteralStrippedWhenLengthGreaterThan2 | getStrategy(): `'` case, `length()>2` strip quotes |
| testDoubledQuoteAsLiteralApostrophe | `''` token, escapeRegex quote-unquote (continue branch) |
| testQuotedTextWithEmbeddedEscapedQuote | quoted-string alternative พร้อม escaped quote ภายใน |
| testLiteralWithSpecialRegexCharacters / testLiteralWithMultipleSpecialCharacters | escapeRegex switch-case escape อักขระพิเศษ |
| testWhitespaceLiteralCollapsesToFlexibleRegex | escapeRegex: whitespace branch (`wasWhite`) |
| testParseWithParsePositionReturnsNullOnMismatch | parse(String,ParsePosition): `!matcher.lookingAt()` → null |
| testParseStringThrowsParseExceptionOnMismatch | parse(String): `date==null` → ParseException (ปกติ locale) |
| testParseStringJapaneseImperialLocaleSpecialMessage | parse(String): `locale.equals(JAPANESE_IMPERIAL)` branch |
| testParseObjectStringDelegatesToParse / testParseObjectWithPositionDelegatesToParse | delegation methods |
| testSerializationReinitializesTransientFields | readObject() → init() ใหม่หลัง deserialize |
| testAdjustYearBothBranchesAcrossRange | adjustYear(): ทั้ง `trial<thisYear+20` true/false ครบช่วง 0-99 |
| testIsNextNumberFalseAfterConstruction | isNextNumber() หลัง init() (nextStrategy==null) |
| testGetFieldWidthThrowsAfterConstruction | getFieldWidth() หลัง init() (currentFormatField==null) — ระบุเป็น assumption จากซอร์ส |
| testGetDisplayNamesInvalidFieldThrows | getDisplayNames(): default case throw |
| testGetDisplayNamesCachesResultSameReference | getDisplayNames(): nameValues cache hit (ข้าม switch) |

**Branch ที่ไม่สามารถทดสอบผ่าน public API (ระบุไว้ ไม่เดา behavior เพิ่ม):**
- `escapeRegex` early-return `if(++i==value.length()) return regex;` — ไม่มี pattern จาก `formatPattern` ที่ส่ง formatField ลักษณะนี้เข้ามาได้
- `nameValues.putIfAbsent(...)` ที่ `prior!=null` และ `tzsCache.putIfAbsent` ที่ `inCache!=null` — เป็น race-condition path ต้องใช้ multi-thread harness ซึ่งไม่ deterministic สำหรับ unit test เดี่ยว
- `TimeZoneStrategy.setCalendar` ที่ `tz==null` throw IllegalArgumentException — regex ถูกสร้างจาก `tzNames.keySet()` เองเสมอ ทำให้ value ที่ match ได้จะพบใน map เสมอ จึง unreachable ผ่าน public parse API