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
        // Trigger: patternMatcher.lookingAt() fails for empty string or invalid construct
        new FastDateParser("", GMT, US);
    }

    @Test
    public void testParseValidDate() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", GMT, US);
        Date date = parser.parse("2023-10-05");
        assertNotNull(date);
        
        Calendar cal = Calendar.getInstance(GMT, US);
        cal.setTime(date);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH));
        assertEquals(5, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testParseWithParsePosition() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", GMT, US);
        ParsePosition pos = new ParsePosition(0);
        Date date = parser.parse("2023-10-05 extra", pos);
        assertNotNull(date);
        assertEquals(10, pos.getIndex());
    }

    @Test
    public void testParseFailureReturnsNull() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", GMT, US);
        ParsePosition pos = new ParsePosition(0);
        Date date = parser.parse("Invalid-Date", pos);
        assertNull(date);
        assertEquals(0, pos.getIndex());
    }

    @Test(expected = ParseException.class)
    public void testParseJapaneseImperialException() throws ParseException {
        // Trigger Japanese Imperial locale restriction branch (< 1868 AD)
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", GMT, FastDateParser.JAPANESE_IMPERIAL);
        parser.parse("0010-10-05");
    }

    @Test
    public void testEqualsAndHashCode() {
        FastDateParser parser1 = new FastDateParser("yyyy-MM-dd", GMT, US);
        FastDateParser parser2 = new FastDateParser("yyyy-MM-dd", GMT, US);
        FastDateParser parser3 = new FastDateParser("yyyy/MM/dd", GMT, US);
        FastDateParser parser4 = new FastDateParser("yyyy-MM-dd", TimeZone.getTimeZone("UTC"), US);
        FastDateParser parser5 = new FastDateParser("yyyy-MM-dd", GMT, Locale.GERMAN);

        assertTrue(parser1.equals(parser1));
        assertTrue(parser1.equals(parser2));
        assertEquals(parser1.hashCode(), parser2.hashCode());

        assertFalse(parser1.equals(null));
        assertFalse(parser1.equals("NotADataParser"));
        assertFalse(parser1.equals(parser3));
        assertFalse(parser1.equals(parser4));
        assertFalse(parser1.equals(parser5));
    }

    @Test
    public void testToString() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", GMT, US);
        String str = parser.toString();
        assertTrue(str.contains("yyyy-MM-dd"));
        assertTrue(str.contains("GMT"));
    }

    @Test
    public void testAccessors() {
        FastDateParser parser = new FastDateParser("HH:mm:ss", GMT, US);
        assertEquals("HH:mm:ss", parser.getPattern());
        assertEquals(GMT, parser.getTimeZone());
        assertEquals(US, parser.getLocale());
    }

    @Test
    public void testSerialization() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", GMT, US);

        // Serialize
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(parser);
        oos.close();

        // Deserialize
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        FastDateParser deserialized = (FastDateParser) ois.readObject();
        ois.close();

        assertEquals(parser, deserialized);
        assertNotNull(deserialized.parse("2020-01-01"));
    }

    @Test
    public void testAbbreviatedYearStrategy() throws ParseException {
        // Trigger adjustYear logic (two-digit years)
        FastDateParser parser = new FastDateParser("yy-MM-dd", GMT, US);
        Date date = parser.parse("23-05-12");
        assertNotNull(date);
    }

    @Test
    public void testTimeZoneStrategyParsing() throws ParseException {
        // Test different timezone formats: GMT offset, explicit GMT, and short/long names
        FastDateParser parser = new FastDateParser("yyyy-MM-dd z", GMT, US);
        Date date = parser.parse("2023-01-01 EST");
        assertNotNull(date);

        FastDateParser parserOffset = new FastDateParser("yyyy-MM-dd Z", GMT, US);
        Date dateOffset = parserOffset.parse("2023-01-01 +0200");
        assertNotNull(dateOffset);
        
        Date dateOffsetGmt = parserOffset.parse("2023-01-01 GMT+2");
        assertNotNull(dateOffsetGmt);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidTimeZoneThrowsException() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd z", GMT, US);
        parser.parse("2023-01-01 InvalidTZName");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidCalendarFieldInGetDisplayNames() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", GMT, US);
        // Pass an unsupported field to getDisplayNames to hit the default throw branch
        parser.getDisplayNames(9999);
    }

    @Test
    public void testTextStrategyAndNumberStrategyModifiers() throws ParseException {
        // Testing Month (text vs number), AM/PM, Day of week, etc.
        FastDateParser parserTextMonth = new FastDateParser("MMM dd yyyy", GMT, US);
        assertNotNull(parserTextMonth.parse("Jan 15 2023"));

        FastDateParser parserNumMonth = new FastDateParser("M dd yyyy", GMT, US);
        assertNotNull(parserNumMonth.parse("1 15 2023"));

        FastDateParser parserHourMod = new FastDateParser("K h H k", GMT, US);
        assertNotNull(parserHourMod.parse("1 2 3 4"));
    }
}