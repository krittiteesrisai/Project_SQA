package org.apache.commons.lang.time;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Calendar;
import java.util.TimeZone;

import org.apache.commons.lang.time.DurationFormatUtils;
import org.apache.commons.lang.time.DurationFormatUtils.Token;
import org.apache.commons.lang.time.DateUtils;

public class DurationFormatUtilsTest {

    // ===================== Helper =====================
    private long gmt(int year, int month, int day, int hour, int min, int sec, int ms) {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.set(year, month, day, hour, min, sec);
        cal.set(Calendar.MILLISECOND, ms);
        return cal.getTimeInMillis();
    }

    // ===================== formatDurationHMS =====================

    @Test
    public void testFormatDurationHMS_Zero() {
        assertEquals("0:00:00.000", DurationFormatUtils.formatDurationHMS(0L));
    }

    @Test
    public void testFormatDurationHMS_NonZero() {
        long millis = 1 * DateUtils.MILLIS_PER_HOUR + 1 * DateUtils.MILLIS_PER_MINUTE
                + 1 * DateUtils.MILLIS_PER_SECOND + 1L;
        assertEquals("1:01:01.001", DurationFormatUtils.formatDurationHMS(millis));
    }

    // ===================== formatDurationISO =====================

    @Test
    public void testFormatDurationISO_Zero() {
        assertEquals("P0Y0M0DT0H0M0.000S", DurationFormatUtils.formatDurationISO(0L));
    }

    @Test
    public void testFormatDurationISO_NonZero() {
        long millis = 1 * DateUtils.MILLIS_PER_DAY + 1 * DateUtils.MILLIS_PER_HOUR
                + 1 * DateUtils.MILLIS_PER_MINUTE + 1 * DateUtils.MILLIS_PER_SECOND + 1L;
        assertEquals("P0Y0M1DT1H1M1.001S", DurationFormatUtils.formatDurationISO(millis));
    }

    // ===================== formatDuration(2-arg) =====================

    @Test
    public void testFormatDuration2Arg_YearMonthAlwaysZero() {
        // formatDuration ไม่เคยคำนวณ years/months จริง (ส่ง 0,0 คงที่ให้ format())
        // ดังนั้นไม่ว่า millis จะเท่าไร ผลลัพธ์ของ token y/M จะเป็น 0 เสมอ
        assertEquals("0000", DurationFormatUtils.formatDuration(123456789L, "yyyy"));
        assertEquals("00", DurationFormatUtils.formatDuration(999L, "MM"));
    }

    // ===================== formatDuration(3-arg) branch isolation =====================

    @Test
    public void testFormatDuration3Arg_OnlyDayToken() {
        long millis = 2 * DateUtils.MILLIS_PER_DAY + 5 * DateUtils.MILLIS_PER_SECOND;
        assertEquals("2", DurationFormatUtils.formatDuration(millis, "d", true));
    }

    @Test
    public void testFormatDuration3Arg_OnlyHourToken() {
        long millis = 5 * DateUtils.MILLIS_PER_HOUR + 999L;
        assertEquals("5", DurationFormatUtils.formatDuration(millis, "H", true));
    }

    @Test
    public void testFormatDuration3Arg_OnlyMinuteToken() {
        long millis = 45 * DateUtils.MILLIS_PER_MINUTE + 500L;
        assertEquals("45", DurationFormatUtils.formatDuration(millis, "m", true));
    }

    @Test
    public void testFormatDuration3Arg_OnlySecondToken() {
        long millis = 59 * DateUtils.MILLIS_PER_SECOND + 123L;
        assertEquals("59", DurationFormatUtils.formatDuration(millis, "s", true));
    }

    @Test
    public void testFormatDuration3Arg_OnlyMillisToken() {
        assertEquals("789", DurationFormatUtils.formatDuration(789L, "S", true));
    }

    @Test
    public void testFormatDuration3Arg_AllTokens_PadFalse_LiteralBetweenSAndS() {
        long millis = 1 * DateUtils.MILLIS_PER_DAY + 2 * DateUtils.MILLIS_PER_HOUR
                + 3 * DateUtils.MILLIS_PER_MINUTE + 4 * DateUtils.MILLIS_PER_SECOND + 5L;
        // หมายเหตุ: literal '-' ระหว่าง s กับ S ไม่ reset flag lastOutputSeconds
        // ดังนั้น S ยังถูกบวก 1000 แล้ว substring(1) ตามลอจิกเดิม
        assertEquals("1-2-3-4-005",
                DurationFormatUtils.formatDuration(millis, "d-H-m-s-S", false));
    }

    @Test
    public void testFormatDuration3Arg_EmptyFormat() {
        assertEquals("", DurationFormatUtils.formatDuration(1000L, "", true));
    }

    @Test
    public void testFormatDuration3Arg_LiteralOnly() {
        assertEquals("just text", DurationFormatUtils.formatDuration(1000L, "'just text'", true));
    }

    @Test
    public void testFormatDuration3Arg_UnterminatedQuote() {
        // input ผิดรูปแบบ: ไม่มี ' ปิด -> buffer เก็บทุกตัวอักษรที่เหลือเป็น literal
        assertEquals("abc", DurationFormatUtils.formatDuration(1000L, "'abc", true));
    }

    @Test(expected = NullPointerException.class)
    public void testFormatDuration3Arg_NullFormat_ThrowsNPE() {
        DurationFormatUtils.formatDuration(1000L, null, true);
    }

    // ===================== formatDurationWords =====================

    @Test
    public void testFormatDurationWords_AllZero_SuppressLeadingOnly() {
        assertEquals("0 seconds",
                DurationFormatUtils.formatDurationWords(0L, true, false));
    }

    @Test
    public void testFormatDurationWords_AllZero_SuppressTrailingOnly() {
        assertEquals("0 days",
                DurationFormatUtils.formatDurationWords(0L, false, true));
    }

    @Test
    public void testFormatDurationWords_AllZero_SuppressBoth() {
        assertEquals("0 seconds",
                DurationFormatUtils.formatDurationWords(0L, true, true));
    }

    @Test
    public void testFormatDurationWords_Ones_NoSuppress_PluralHandling() {
        long millis = 1 * DateUtils.MILLIS_PER_DAY + 1 * DateUtils.MILLIS_PER_HOUR
                + 1 * DateUtils.MILLIS_PER_MINUTE + 1 * DateUtils.MILLIS_PER_SECOND;
        assertEquals("1 day 1 hour 1 minute 1 second",
                DurationFormatUtils.formatDurationWords(millis, false, false));
    }

    @Test
    public void testFormatDurationWords_PartialZero_SuppressBoth() {
        // days=0, hours=2, minutes=0, seconds=5
        long millis = 2 * DateUtils.MILLIS_PER_HOUR + 5 * DateUtils.MILLIS_PER_SECOND;
        assertEquals("2 hours 0 minutes 5 seconds",
                DurationFormatUtils.formatDurationWords(millis, true, true));
    }

    @Test
    public void testFormatDurationWords_TrailingOnly_Cascade() {
        // days=3, hours=0, minutes=0, seconds=0 -> cascade ไล่ลบจนเหลือ "3 days"
        long millis = 3 * DateUtils.MILLIS_PER_DAY;
        assertEquals("3 days",
                DurationFormatUtils.formatDurationWords(millis, false, true));
    }

    @Test
    public void testFormatDurationWords_LeadingSuppress_NoEffectWhenDaysNonZero() {
        // days=5 (ไม่เท่ากับ 0) -> เงื่อนไข removal " 0 days" ไม่ match
        // ดังนั้น cascade ทั้งหมดถูก skip แม้ hours/minutes/seconds จะเป็น 0 ก็ตาม
        long millis = 5 * DateUtils.MILLIS_PER_DAY;
        assertEquals("5 days 0 hours 0 minutes 0 seconds",
                DurationFormatUtils.formatDurationWords(millis, true, false));
    }

    // ===================== formatPeriod* =====================

    @Test
    public void testFormatPeriodISO_UnderThreshold_DelegatesToFormatDurationISO() {
        long start = 1000L;
        long end = start + 10 * DateUtils.MILLIS_PER_DAY; // < 28 days
        String expected = DurationFormatUtils.formatDurationISO(end - start);
        assertEquals(expected, DurationFormatUtils.formatPeriodISO(start, end));
    }

    @Test
    public void testFormatPeriod3Arg_UnderThreshold_DelegatesToFormatDuration() {
        long start = 500L;
        long end = start + 5 * DateUtils.MILLIS_PER_DAY; // < 28 days
        String format = "H:mm:ss.SSS";
        String expected = DurationFormatUtils.formatDuration(end - start, format); // padWithZeros=true default
        assertEquals(expected, DurationFormatUtils.formatPeriod(start, end, format));
    }

    @Test
    public void testFormatPeriod_NegativeDifference_DelegatesCorrectly() {
        // end < start -> millis ติดลบ -> ยัง < 28 days -> delegate ไปที่ formatDuration
        long start = 10 * DateUtils.MILLIS_PER_DAY;
        long end = 0L;
        String format = "H:mm:ss.SSS";
        String expected = DurationFormatUtils.formatDuration(end - start, format, true);
        assertEquals(expected, DurationFormatUtils.formatPeriod(start, end, format, true, TimeZone.getDefault()));
    }

    @Test
    public void testFormatPeriod5Arg_OverThreshold_PadTrue() {
        long start = gmt(2023, Calendar.JANUARY, 1, 0, 0, 0, 0);
        long end = gmt(2023, Calendar.MARCH, 5, 5, 6, 7, 8); // diff = 63 days > 28 days
        String pattern = "d' days 'HH' hours 'm' minutes 's' seconds'";
        String result = DurationFormatUtils.formatPeriod(start, end, pattern, true, TimeZone.getTimeZone("GMT"));
        assertEquals("67 days 05 hours 6 minutes 7 seconds", result);
    }

    @Test
    public void testFormatPeriod5Arg_OverThreshold_PadFalse() {
        long start = gmt(2023, Calendar.JANUARY, 1, 0, 0, 0, 0);
        long end = gmt(2023, Calendar.MARCH, 5, 5, 6, 7, 8);
        String pattern = "d' days 'HH' hours 'm' minutes 's' seconds'";
        String result = DurationFormatUtils.formatPeriod(start, end, pattern, false, TimeZone.getTimeZone("GMT"));
        assertEquals("67 days 5 hours 6 minutes 7 seconds", result);
    }

    @Test
    public void testFormatPeriod5Arg_ExactlyAtThreshold_UsesCalendarBranch() {
        // millis == 28*MILLIS_PER_DAY พอดี -> เงื่อนไข (millis < 28*DAY) เป็น false
        // -> เข้า Calendar branch (ไม่ delegate ไป formatDuration)
        long start = 0L;
        long end = 28 * DateUtils.MILLIS_PER_DAY;
        String result = DurationFormatUtils.formatPeriod(start, end, "d", true, TimeZone.getTimeZone("GMT"));
        // หมายเหตุ: ผลลัพธ์ "56" มาจากลอจิกจริงของซอร์ส (เพราะ pattern ไม่มี token 'M'
        // ทำให้ day-of-year diff ถูกบวกเพิ่มเข้าไปซ้ำกับ day field diff ที่คำนวณไว้แล้ว
        // ซึ่งอาจเป็นจุดที่เกี่ยวข้องกับ known defect ของ Lang-63)
        assertEquals("56", result);
    }

    // ===================== format() (package-private) =====================

    @Test
    public void testFormat_TokenY() {
        Token[] tokens = new Token[] { new Token(DurationFormatUtils.y, 4) };
        assertEquals("0009", DurationFormatUtils.format(tokens, 9, 0, 0, 0, 0, 0, 0, true));
        assertEquals("9", DurationFormatUtils.format(tokens, 9, 0, 0, 0, 0, 0, 0, false));
    }

    @Test
    public void testFormat_TokenM_month() {
        Token[] tokens = new Token[] { new Token(DurationFormatUtils.M, 2) };
        assertEquals("07", DurationFormatUtils.format(tokens, 0, 7, 0, 0, 0, 0, 0, true));
        assertEquals("7", DurationFormatUtils.format(tokens, 0, 7, 0, 0, 0, 0, 0, false));
    }

    @Test
    public void testFormat_TokenD() {
        Token[] tokens = new Token[] { new Token(DurationFormatUtils.d, 2) };
        assertEquals("03", DurationFormatUtils.format(tokens, 0, 0, 3, 0, 0, 0, 0, true));
        assertEquals("3", DurationFormatUtils.format(tokens, 0, 0, 3, 0, 0, 0, 0, false));
    }

    @Test
    public void testFormat_TokenH() {
        Token[] tokens = new Token[] { new Token(DurationFormatUtils.H, 2) };
        assertEquals("04", DurationFormatUtils.format(tokens, 0, 0, 0, 4, 0, 0, 0, true));
        assertEquals("4", DurationFormatUtils.format(tokens, 0, 0, 0, 4, 0, 0, 0, false));
    }

    @Test
    public void testFormat_Tokenm_minute() {
        Token[] tokens = new Token[] { new Token(DurationFormatUtils.m, 2) };
        assertEquals("05", DurationFormatUtils.format(tokens, 0, 0, 0, 0, 5, 0, 0, true));
        assertEquals("5", DurationFormatUtils.format(tokens, 0, 0, 0, 0, 5, 0, 0, false));
    }

    @Test
    public void testFormat_TokenS_second_notAfterS_lastOutputFalse() {
        // token S เดี่ยว ไม่มี s มาก่อน -> lastOutputSeconds=false -> ไม่บวก 1000
        Token[] tokens = new Token[] { new Token(DurationFormatUtils.S, 3) };
        assertEquals("005", DurationFormatUtils.format(tokens, 0, 0, 0, 0, 0, 0, 5, true));
    }

    @Test
    public void testFormat_TokenS_millis_afterSecondToken() {
        // s แล้วตามด้วย S -> lastOutputSeconds=true -> milliseconds+=1000 แล้ว substring(1)
        Token[] tokens = new Token[] {
                new Token(DurationFormatUtils.s, 1),
                new Token(DurationFormatUtils.S, 3)
        };
        assertEquals("3005", DurationFormatUtils.format(tokens, 0, 0, 0, 0, 0, 3, 5, true));
    }

    @Test
    public void testFormat_LiteralStringBufferToken() {
        Token[] tokens = new Token[] { new Token(new StringBuffer("Hello")) };
        assertEquals("Hello", DurationFormatUtils.format(tokens, 0, 0, 0, 0, 0, 0, 0, true));
    }

    @Test
    public void testFormat_EmptyTokenArray() {
        assertEquals("", DurationFormatUtils.format(new Token[0], 1, 1, 1, 1, 1, 1, 1, true));
    }

    // ===================== reduceAndCorrect() =====================

    @Test
    public void testReduceAndCorrect_NoCorrectionNeeded() {
        Calendar start = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        start.set(2023, Calendar.JANUARY, 10, 0, 0, 0);
        start.set(Calendar.MILLISECOND, 0);

        Calendar end = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        end.set(2023, Calendar.JANUARY, 25, 0, 0, 0);
        end.set(Calendar.MILLISECOND, 0);

        // end - 10 = day15 >= start day10 -> ไม่ต้อง correct -> return 0
        int result = DurationFormatUtils.reduceAndCorrect(start, end, Calendar.DAY_OF_MONTH, 10);
        assertEquals(0, result);
    }

    @Test
    public void testReduceAndCorrect_CorrectionNeeded() {
        Calendar start = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        start.set(2023, Calendar.JANUARY, 20, 0, 0, 0);
        start.set(Calendar.MILLISECOND, 0);

        Calendar end = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        end.set(2023, Calendar.JANUARY, 25, 0, 0, 0);
        end.set(Calendar.MILLISECOND, 0);

        // end - 10 = day15 < start day20 -> ต้อง correct กลับ newdiff=5
        int result = DurationFormatUtils.reduceAndCorrect(start, end, Calendar.DAY_OF_MONTH, 10);
        assertEquals(5, result);
        assertEquals(20, end.get(Calendar.DAY_OF_MONTH)); // ถูก add กลับคืนแล้ว
    }

    // ===================== lexx() =====================

    @Test
    public void testLexx_EmptyString() {
        Token[] tokens = DurationFormatUtils.lexx("");
        assertEquals(0, tokens.length);
    }

    @Test
    public void testLexx_SingleQuoteOnly() {
        Token[] tokens = DurationFormatUtils.lexx("'");
        assertEquals(1, tokens.length);
        assertTrue(tokens[0].getValue() instanceof StringBuffer);
        assertEquals("", tokens[0].getValue().toString());
    }

    @Test
    public void testLexx_RepeatedTokenIncrement() {
        Token[] tokens = DurationFormatUtils.lexx("yyyy");
        assertEquals(1, tokens.length);
        assertSame(DurationFormatUtils.y, tokens[0].getValue());
        assertEquals(4, tokens[0].getCount());
    }

    @Test
    public void testLexx_MixedLiteralAndTokens() {
        Token[] tokens = DurationFormatUtils.lexx("yyyy-MM-dd");
        assertEquals(5, tokens.length);
        assertSame(DurationFormatUtils.y, tokens[0].getValue());
        assertEquals(4, tokens[0].getCount());
        assertEquals("-", tokens[1].getValue().toString());
        assertSame(DurationFormatUtils.M, tokens[2].getValue());
        assertEquals(2, tokens[2].getCount());
        assertEquals("-", tokens[3].getValue().toString());
        assertSame(DurationFormatUtils.d, tokens[4].getValue());
        assertEquals(2, tokens[4].getCount());
    }

    @Test
    public void testLexx_DefaultCharBufferReuse() {
        // 'a','b','c' เป็น default-case ธรรมดาต่อเนื่องกัน -> ใช้ buffer เดียวกัน (ไม่สร้าง token ใหม่ทุกตัว)
        Token[] tokens = DurationFormatUtils.lexx("abc");
        assertEquals(1, tokens.length);
        assertEquals("abc", tokens[0].getValue().toString());
    }

    @Test(expected = NullPointerException.class)
    public void testLexx_NullFormat_ThrowsNPE() {
        DurationFormatUtils.lexx(null);
    }

    // ===================== Token class =====================

    @Test
    public void testToken_ContainsTokenWithValue_True() {
        Token[] tokens = DurationFormatUtils.lexx("d H m");
        assertTrue(Token.containsTokenWithValue(tokens, DurationFormatUtils.d));
    }

    @Test
    public void testToken_ContainsTokenWithValue_False_NotFound() {
        Token[] tokens = DurationFormatUtils.lexx("d H m");
        assertFalse(Token.containsTokenWithValue(tokens, DurationFormatUtils.y));
    }

    @Test
    public void testToken_ContainsTokenWithValue_False_EmptyArray() {
        assertFalse(Token.containsTokenWithValue(new Token[0], DurationFormatUtils.d));
    }

    @Test
    public void testToken_Equals_NotTokenInstance() {
        Token t = new Token(DurationFormatUtils.d, 1);
        assertFalse(t.equals("not a token"));
    }

    @Test
    public void testToken_Equals_DifferentValueClass() {
        Token t1 = new Token(DurationFormatUtils.d, 1);       // value is String
        Token t2 = new Token(new StringBuffer("d"), 1);       // value is StringBuffer
        assertFalse(t1.equals(t2));
    }

    @Test
    public void testToken_Equals_DifferentCount() {
        Token t1 = new Token(DurationFormatUtils.y, 1);
        Token t2 = new Token(DurationFormatUtils.y, 2);
        assertFalse(t1.equals(t2));
    }

    @Test
    public void testToken_Equals_StringBufferContent_EqualAndNotEqual() {
        Token t1 = new Token(new StringBuffer("abc"), 1);
        Token t2 = new Token(new StringBuffer("abc"), 1);
        Token t3 = new Token(new StringBuffer("xyz"), 1);
        assertTrue(t1.equals(t2));
        assertFalse(t1.equals(t3));
    }

    @Test
    public void testToken_Equals_NumberValue_EqualAndNotEqual() {
        // หมายเหตุ: path นี้ไม่ได้ถูกใช้งานจริงผ่าน lexx() (value ปกติเป็น String/StringBuffer)
        // แต่มีอยู่ในซอร์สโค้ดจริง จึงทดสอบตรงผ่าน constructor เพื่อ coverage
        Token t1 = new Token(new Integer(5), 1);
        Token t2 = new Token(new Integer(5), 1);
        Token t3 = new Token(new Integer(6), 1);
        assertTrue(t1.equals(t2));
        assertFalse(t1.equals(t3));
    }

    @Test
    public void testToken_Equals_ReferenceValue_EqualAndNotEqual() {
        Token t1 = new Token(DurationFormatUtils.y, 1);
        Token t2 = new Token(DurationFormatUtils.y, 1);
        Token t3 = new Token(DurationFormatUtils.M, 1);
        assertTrue(t1.equals(t2));
        assertFalse(t1.equals(t3));
    }

    @Test
    public void testToken_HashCode_SameRegardlessOfCount() {
        Token t1 = new Token(DurationFormatUtils.y, 1);
        Token t4 = new Token(DurationFormatUtils.y, 4);
        assertEquals(DurationFormatUtils.y.hashCode(), t1.hashCode());
        assertEquals(t1.hashCode(), t4.hashCode());
    }

    @Test
    public void testToken_ToString_RepeatsValue() {
        Token t = new Token(DurationFormatUtils.y, 4);
        assertEquals("yyyy", t.toString());

        Token literal = new Token(new StringBuffer("abc"), 1);
        assertEquals("abc", literal.toString());
    }

    @Test
    public void testToken_IncrementAndGetCount() {
        Token t = new Token(DurationFormatUtils.d);
        assertEquals(1, t.getCount());
        t.increment();
        assertEquals(2, t.getCount());
        t.increment();
        assertEquals(3, t.getCount());
    }

    @Test
    public void testToken_GetValue() {
        Token t = new Token(DurationFormatUtils.H, 2);
        assertSame(DurationFormatUtils.H, t.getValue());
    }
}
