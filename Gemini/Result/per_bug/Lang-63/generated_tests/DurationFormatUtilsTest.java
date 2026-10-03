package org.apache.commons.lang.time;

import org.junit.Test;
import java.util.Calendar;
import java.util.TimeZone;

import static org.junit.Assert.*;

public class DurationFormatUtilsTest {

    // -----------------------------------------------------------------------
    // Constructor & Constants
    // -----------------------------------------------------------------------
    @Test
    public void testConstructorAndConstants() {
        DurationFormatUtils instance = new DurationFormatUtils();
        assertNotNull(instance);
        assertEquals("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", DurationFormatUtils.ISO_EXTENDED_FORMAT_PATTERN);
    }

    // -----------------------------------------------------------------------
    // formatDurationHMS & formatDurationISO
    // -----------------------------------------------------------------------
    @Test
    public void testFormatDurationHMS() {
        long millis = (3 * 3600 + 25 * 60 + 45) * 1000L + 678;
        String result = DurationFormatUtils.formatDurationHMS(millis);
        assertEquals("3:25:45.678", result);

        assertEquals("0:00:00.000", DurationFormatUtils.formatDurationHMS(0));
    }

    @Test
    public void testFormatDurationISO() {
        long millis = (2 * 86400 + 3 * 3600 + 4 * 60 + 5) * 1000L + 6;
        String result = DurationFormatUtils.formatDurationISO(millis);
        assertEquals("P0Y0M2DT3H4M5.006S", result);
    }

    // -----------------------------------------------------------------------
    // formatDuration with various patterns and padWithZeros
    // -----------------------------------------------------------------------
    @Test
    public void testFormatDuration() {
        long millis = (5 * 86400 + 4 * 3600 + 3 * 60 + 2) * 1000L + 1;
        
        // Default padding (true)
        assertEquals("05:04:03:02.001", DurationFormatUtils.formatDuration(millis, "dd:HH:mm:ss.SSS"));
        
        // Without padding
        assertEquals("5:4:3:2.1", DurationFormatUtils.formatDuration(millis, "d:H:m:s.S", false));

        // Subsets of tokens (missing d, H, m, s, S)
        assertEquals("124", DurationFormatUtils.formatDuration(millis, "H"));
        assertEquals("7443", DurationFormatUtils.formatDuration(millis, "m"));
        assertEquals("446582", DurationFormatUtils.formatDuration(millis, "s"));
        assertEquals(String.valueOf(millis), DurationFormatUtils.formatDuration(millis, "S"));
    }

    @Test
    public void testFormatDurationMillisecondsHandling() {
        // Test S without preceding s
        assertEquals("123", DurationFormatUtils.formatDuration(123, "SSS", true));
        assertEquals("123", DurationFormatUtils.formatDuration(123, "S", false));

        // Test S with preceding s
        assertEquals("01.050", DurationFormatUtils.formatDuration(1050, "ss.SSS", true));
        assertEquals("1.50", DurationFormatUtils.formatDuration(1050, "s.S", false));
    }

    // -----------------------------------------------------------------------
    // formatDurationWords
    // -----------------------------------------------------------------------
    @Test
    public void testFormatDurationWordsAllFields() {
        long millis = (2 * 86400 + 3 * 3600 + 4 * 60 + 5) * 1000L;
        String result = DurationFormatUtils.formatDurationWords(millis, false, false);
        assertEquals("2 days 3 hours 4 minutes 5 seconds", result);
    }

    @Test
    public void testFormatDurationWordsSingular() {
        long millis = (1 * 86400 + 1 * 3600 + 1 * 60 + 1) * 1000L;
        String result = DurationFormatUtils.formatDurationWords(millis, false, false);
        assertEquals("1 day 1 hour 1 minute 1 second", result);
    }

    @Test
    public void testFormatDurationWordsSuppressLeading() {
        long millis = (4 * 60 + 5) * 1000L; // 0 days, 0 hours, 4 minutes, 5 seconds
        String result = DurationFormatUtils.formatDurationWords(millis, true, false);
        assertEquals("4 minutes 5 seconds", result);

        long onlySeconds = 5 * 1000L;
        assertEquals("5 seconds", DurationFormatUtils.formatDurationWords(onlySeconds, true, false));
    }

    @Test
    public void testFormatDurationWordsSuppressTrailing() {
        long millis = (2 * 86400 + 3 * 3600) * 1000L; // 2 days, 3 hours, 0 mins, 0 secs
        String result = DurationFormatUtils.formatDurationWords(millis, false, true);
        assertEquals("2 days 3 hours", result);

        long onlyDays = 2 * 86400 * 1000L;
        assertEquals("2 days", DurationFormatUtils.formatDurationWords(onlyDays, false, true));
    }

    @Test
    public void testFormatDurationWordsSuppressBoth() {
        long millis = (3 * 3600) * 1000L; // 0 days, 3 hours, 0 mins, 0 secs
        String result = DurationFormatUtils.formatDurationWords(millis, true, true);
        assertEquals("3 hours", result);

        // Zero duration
        assertEquals("", DurationFormatUtils.formatDurationWords(0L, true, true));
    }

    // -----------------------------------------------------------------------
    // formatPeriodISO & formatPeriod shortcuts
    // -----------------------------------------------------------------------
    @Test
    public void testFormatPeriodShortDuration() {
        // Less than 28 days branches to formatDuration
        long start = 100000000L;
        long end = start + 5 * DateUtils.MILLIS_PER_DAY + 12345;
        String formatted = DurationFormatUtils.formatPeriod(start, end, "d' days 's' seconds'");
        assertEquals("5 days 12 seconds", formatted);

        assertEquals("P0Y0M5DT0H0M12.345S", DurationFormatUtils.formatPeriodISO(start, end));
    }

    @Test
    public void testFormatPeriodLongDurationStandard() {
        Calendar cal1 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal1.set(2020, Calendar.JANUARY, 1, 0, 0, 0);
        cal1.set(Calendar.MILLISECOND, 0);

        Calendar cal2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal2.set(2021, Calendar.MARCH, 5, 4, 30, 20);
        cal2.set(Calendar.MILLISECOND, 500);

        String result = DurationFormatUtils.formatPeriod(
                cal1.getTimeInMillis(), cal2.getTimeInMillis(),
                "y'Y' M'M' d'D' H'H' m'm' s's' S'S'",
                false,
                TimeZone.getTimeZone("UTC")
        );
        assertEquals("1Y 2M 4D 4H 30m 20s 500S", result);
    }

    // -----------------------------------------------------------------------
    // formatPeriod - Missing tokens handling
    // -----------------------------------------------------------------------
    @Test
    public void testFormatPeriodWithoutYears() {
        Calendar cal1 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal1.set(2020, Calendar.JANUARY, 1, 0, 0, 0);
        cal1.set(Calendar.MILLISECOND, 0);

        Calendar cal2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal2.set(2022, Calendar.MARCH, 1, 0, 0, 0);
        cal2.set(Calendar.MILLISECOND, 0);

        // Without 'y', but with 'M' -> months += 12 * years
        String withM = DurationFormatUtils.formatPeriod(
                cal1.getTimeInMillis(), cal2.getTimeInMillis(),
                "M'M' d'D'", true, TimeZone.getTimeZone("UTC")
        );
        assertEquals("26M 00D", withM);

        // Without 'y' and without 'M' -> days += 365 * years
        String withoutM = DurationFormatUtils.formatPeriod(
                cal1.getTimeInMillis(), cal2.getTimeInMillis(),
                "d'D'", true, TimeZone.getTimeZone("UTC")
        );
        assertTrue(Integer.parseInt(withoutM.replace("D", "")) >= 730);
    }

    @Test
    public void testFormatPeriodWithoutOtherTokens() {
        Calendar cal1 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal1.set(2020, Calendar.JANUARY, 1, 0, 0, 0);
        cal1.set(Calendar.MILLISECOND, 0);

        Calendar cal2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal2.set(2020, Calendar.FEBRUARY, 15, 10, 20, 30);
        cal2.set(Calendar.MILLISECOND, 400);

        // Without 'd' -> hours accumulated
        String withoutDays = DurationFormatUtils.formatPeriod(
                cal1.getTimeInMillis(), cal2.getTimeInMillis(), "H'H' m'm'", true, TimeZone.getTimeZone("UTC")
        );
        assertTrue(withoutDays.contains("H"));

        // Without 'H' -> minutes accumulated
        String withoutHours = DurationFormatUtils.formatPeriod(
                cal1.getTimeInMillis(), cal2.getTimeInMillis(), "m'm' s's'", true, TimeZone.getTimeZone("UTC")
        );
        assertTrue(withoutHours.contains("m"));

        // Without 'm' -> seconds accumulated
        String withoutMinutes = DurationFormatUtils.formatPeriod(
                cal1.getTimeInMillis(), cal2.getTimeInMillis(), "s's' S'S'", true, TimeZone.getTimeZone("UTC")
        );
        assertTrue(withoutMinutes.contains("s"));

        // Without 's' -> millis accumulated
        String withoutSeconds = DurationFormatUtils.formatPeriod(
                cal1.getTimeInMillis(), cal2.getTimeInMillis(), "S'S'", true, TimeZone.getTimeZone("UTC")
        );
        assertTrue(withoutSeconds.contains("S"));
    }

    // -----------------------------------------------------------------------
    // formatPeriod - Negative difference adjustment branches
    // -----------------------------------------------------------------------
    @Test
    public void testFormatPeriodNegativeFieldAdjustments() {
        Calendar cal1 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal1.set(2020, Calendar.JANUARY, 31, 23, 59, 59);
        cal1.set(Calendar.MILLISECOND, 900);

        Calendar cal2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal2.set(2020, Calendar.MARCH, 1, 0, 0, 0);
        cal2.set(Calendar.MILLISECOND, 100);

        String result = DurationFormatUtils.formatPeriod(
                cal1.getTimeInMillis(), cal2.getTimeInMillis(),
                "M'M' d'd' H'h' m'm' s's' S'ms'", false, TimeZone.getTimeZone("UTC")
        );
        assertNotNull(result);
        assertFalse(result.contains("-"));
    }

    // -----------------------------------------------------------------------
    // Lexx and Literal Parsing
    // -----------------------------------------------------------------------
    @Test
    public void testLexxLiteralsAndTokens() {
        // Test escaping with quotes and consecutive characters
        String pattern = "'Duration: 'yyyy'Y 'MM'M 'dd'D ''literal'''";
        DurationFormatUtils.Token[] tokens = DurationFormatUtils.lexx(pattern);
        assertNotNull(tokens);
        assertTrue(tokens.length > 0);

        long start = 0L;
        long end = 100L * DateUtils.MILLIS_PER_DAY;
        String formatted = DurationFormatUtils.formatPeriod(start, end, pattern, true, TimeZone.getTimeZone("UTC"));
        assertTrue(formatted.startsWith("Duration: "));
    }

    // -----------------------------------------------------------------------
    // DurationFormatUtils.Token Unit Tests
    // -----------------------------------------------------------------------
    @Test
    public void testTokenMethods() {
        DurationFormatUtils.Token token1 = new DurationFormatUtils.Token("y", 2);
        DurationFormatUtils.Token token2 = new DurationFormatUtils.Token("y", 2);
        DurationFormatUtils.Token token3 = new DurationFormatUtils.Token("y", 3);
        DurationFormatUtils.Token token4 = new DurationFormatUtils.Token("M", 2);
        DurationFormatUtils.Token numToken1 = new DurationFormatUtils.Token(new Integer(10), 1);
        DurationFormatUtils.Token numToken2 = new DurationFormatUtils.Token(new Integer(10), 1);
        DurationFormatUtils.Token sbToken1 = new DurationFormatUtils.Token(new StringBuffer("abc"), 1);
        DurationFormatUtils.Token sbToken2 = new DurationFormatUtils.Token(new StringBuffer("abc"), 1);

        // equals
        assertEquals(token1, token1);
        assertEquals(token1, token2);
        assertNotEquals(token1, token3);
        assertNotEquals(token1, token4);
        assertNotEquals(token1, "not-a-token");
        assertNotEquals(token1, null);
        assertNotEquals(token1, numToken1);
        assertEquals(numToken1, numToken2);
        assertEquals(sbToken1, sbToken2);

        // increment, getCount, getValue
        token1.increment();
        assertEquals(3, token1.getCount());
        assertEquals("y", token1.getValue());

        // hashCode & toString
        assertEquals(token2.hashCode(), token2.getValue().hashCode());
        assertEquals("yy", token2.toString());

        // containsTokenWithValue
        DurationFormatUtils.Token[] array = new DurationFormatUtils.Token[]{ token1, numToken1 };
        assertTrue(DurationFormatUtils.Token.containsTokenWithValue(array, "y"));
        assertFalse(DurationFormatUtils.Token.containsTokenWithValue(array, "d"));
    }
}