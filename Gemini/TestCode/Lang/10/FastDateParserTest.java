package org.apache.commons.lang3.time;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Test;

public class FastDateParserTest {

    private static final TimeZone GMT = TimeZone.getTimeZone("GMT");
    private static final Locale US = Locale.US;

    @Test(expected = IllegalArgumentException.class)
    public void testInitInvalidPattern() {
        // Trigger IllegalArgumentException in init() when patternMatcher.lookingAt() fails
        new FastDateParser("", GMT, US);
    }

    @Test
    public void testEqualsAndHashCode() {
        FastDateParser parser1 = new FastDateParser("yyyy-MM-dd", GMT, US);
        FastDateParser parser2 = new FastDateParser("yyyy-MM-dd", GMT, US);
        FastDateParser parser3 = new FastDateParser("yyyy-MM-dd", TimeZone.getTimeZone("UTC"), US);
        FastDateParser parser4 = new FastDateParser("yyyy-MM-dd", GMT, Locale.GERMAN);
        FastDateParser parser5 = new FastDateParser("yyyy-MM", GMT, US);

        assertTrue(parser1.equals(parser1));
        assertTrue(parser1.equals(parser2));
        assertEquals(parser1.hashCode(), parser2.hashCode());

        assertFalse(parser1.equals(null));
        assertFalse(parser1.equals("NotAFastDateParser"));
        assertFalse(parser1.equals(parser3));
        assertFalse(parser1.equals(parser4));
        assertFalse(parser1.equals(parser5));
        
        assertEquals("yyyy-MM-dd", parser1.getPattern());
        assertEquals(GMT, parser1.getTimeZone());
        assertEquals(US, parser1.getLocale());
        assertNotNull(parser1.getParsePattern());
        assertTrue(parser1.toString().contains("yyyy-MM-dd"));
    }

    @Test
    public void testSerialization() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", GMT, US);
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(parser);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        FastDateParser deserialized = (FastDateParser) ois.readObject();
        ois.close();

        assertEquals(parser, deserialized);
        assertNotNull(deserialized.parse("2023-10-05"));
    }

    @Test
    public void testParseValidDates() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd HH:mm:ss", GMT, US);
        Date date = parser.parse("2023-05-12 15:30:45");
        assertNotNull(date);

        Calendar cal = Calendar.getInstance(GMT, US);
        cal.setTime(date);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.MAY, cal.get(Calendar.MONTH));
        assertEquals(12, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(15, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(30, cal.get(Calendar.MINUTE));
        assertEquals(45, cal.get(Calendar.SECOND));
    }

    @Test
    public void testParseWithParsePosition() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", GMT, US);
        ParsePosition pos = new ParsePosition(0);
        Date date = parser.parse("2023-05-12 extra", pos);
        
        assertNotNull(date);
        assertEquals(10, pos.getIndex());

        // Test invalid matching starting from offset
        ParsePosition invalidPos = new ParsePosition(5);
        assertNull(parser.parse("2023-X5-12", invalidPos));
    }

    @Test(expected = ParseException.class)
    public void testParseUnparseableThrowsException() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", GMT, US);
        parser.parse("invalid-date");
    }

    @Test
    public void testJapaneseImperialLocaleException() {
        // Trigger Japanese Imperial special ParseException branch
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", GMT, FastDateParser.JAPANESE_IMPERIAL);
        try {
            parser.parse("1200-01-01");
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertTrue(e.getMessage().contains("does not support dates before 1868 AD"));
        }
    }

    @Test
    public void testAbbreviatedYearStrategy() throws ParseException {
        // Tests two-digit year adjustment (< 100) vs full year (>= 100)
        FastDateParser parser2Digit = new FastDateParser("yy", GMT, US);
        Date d1 = parser2Digit.parse("15"); // e.g., 2015 depending on current year
        assertNotNull(d1);

        FastDateParser parser4Digit = new FastDateParser("yyyy", GMT, US);
        Date d2 = parser4Digit.parse("2020");
        assertNotNull(d2);
    }

    @Test
    public void testTextStrategiesAndInvalidValues() throws ParseException {
        FastDateParser parser = new FastDateParser("EEEE MMMM a G", GMT, US);
        Date d = parser.parse("Monday January PM AD");
        assertNotNull(d);

        // Invalid text value triggering IllegalArgumentException inside TextStrategy
        try {
            parser.parse("NotADay January PM AD");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("not in"));
        }
    }

    @Test
    public void testTimeZoneStrategy() throws ParseException {
        FastDateParser parser = new FastDateParser("z Z", GMT, US);
        Date d1 = parser.parse("GMT +0200");
        assertNotNull(d1);

        Date d2 = parser.parse("UTC -05:00");
        assertNotNull(d2);

        Date d3 = parser.parse("UTC +0");
        assertNotNull(d3);

        try {
            parser.parse("InvalidTZ +0200");
            fail("Expected IllegalArgumentException for invalid tz");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("is not a supported timezone name"));
        }
    }

    @Test
    public void testCopyQuotedStrategyAndEscapeRegex() throws ParseException {
        // Tests quoted strings and escape handling including ''
        FastDateParser parser = new FastDateParser("yyyy''MM''dd 'T'HH:mm:ss [?]", GMT, US);
        Date d = parser.parse("2023'05'12 T10:20:30 [?]");
        assertNotNull(d);
    }

    @Test
    public void testAllRemainingStrategies() throws ParseException {
        // Covers D, F, H, K, S, W, w, d, h, k, m, s
        String pattern = "D F H K S W w d h k m s";
        FastDateParser parser = new FastDateParser(pattern, GMT, US);
        Date d = parser.parse("100 2 13 1 500 3 15 20 5 14 30 45");
        assertNotNull(d);
    }
}