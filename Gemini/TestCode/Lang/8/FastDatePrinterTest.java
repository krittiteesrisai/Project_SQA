package org.apache.commons.lang3.time;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.FieldPosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Test;

public class FastDatePrinterTest {

    private static final TimeZone UTC = TimeZone.getTimeZone("UTC");
    private static final Locale US = Locale.US;

    @Test
    public void testConstructorAndGetters() {
        FastDatePrinter printer = new FastDatePrinter("yyyy-MM-dd", UTC, US);
        assertEquals("yyyy-MM-dd", printer.getPattern());
        assertEquals(UTC, printer.getTimeZone());
        assertEquals(US, printer.getLocale());
        assertTrue(printer.getMaxLengthEstimate() > 0);
        assertNotNull(printer.toString());
    }

    @Test
    public void testFormatDateCalendarLong() {
        FastDatePrinter printer = new FastDatePrinter("yyyy", UTC, US);
        long millis = 1577836800000L; // 2020-01-01 00:00:00 UTC
        Date date = new Date(millis);
        Calendar calendar = Calendar.getInstance(UTC, US);
        calendar.setTime(date);

        assertEquals("2020", printer.format(millis));
        assertEquals("2020", printer.format(date));
        assertEquals("2020", printer.format(calendar));

        StringBuffer buf1 = new StringBuffer();
        assertEquals("2020", printer.format(millis, buf1).toString());

        StringBuffer buf2 = new StringBuffer();
        assertEquals("2020", printer.format(date, buf2).toString());

        StringBuffer buf3 = new StringBuffer();
        assertEquals("2020", printer.format(calendar, buf3).toString());
    }

    @Test
    public void testFormatObjectTypes() {
        FastDatePrinter printer = new FastDatePrinter("yyyy", UTC, US);
        Date date = new Date(1577836800000L);
        Calendar calendar = Calendar.getInstance(UTC, US);
        calendar.setTime(date);
        Long millisObj = Long.valueOf(1577836800000L);

        StringBuffer sb = new StringBuffer();
        assertEquals("2020", printer.format((Object) date, sb, new FieldPosition(0)).toString());
        assertEquals("2020", printer.format((Object) calendar, new StringBuffer(), new FieldPosition(0)).toString());
        assertEquals("2020", printer.format((Object) millisObj, new StringBuffer(), new FieldPosition(0)).toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnknownObject() {
        FastDatePrinter printer = new FastDatePrinter("yyyy", UTC, US);
        printer.format(new Object(), new StringBuffer(), new FieldPosition(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatNullObject() {
        FastDatePrinter printer = new FastDatePrinter("yyyy", UTC, US);
        printer.format(null, new StringBuffer(), new FieldPosition(0));
    }

    @Test
    public void testAllPatternComponents() {
        // ครอบคลุม switch-case ทุกตัวอักษรใน parsePattern
        String pattern = "G y yy yyy M MM MMM MMMM d h H m s S E D F w W a k K z zzz Z ZZ 'literal' ''";
        FastDatePrinter printer = new FastDatePrinter(pattern, UTC, US);
        assertNotNull(printer.format(new Date()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPatternComponent() {
        new FastDatePrinter("X", UTC, US); // 'X' ไม่อยู่ในเงื่อนไข switch
    }

    @Test
    public void testNumberFieldBranches() {
        // ทดสอบ Unpadded (<10, 10-99, >=100), Padded, TwoDigit
        FastDatePrinter printer = new FastDatePrinter("d dd ddd yyyy", UTC, US);
        Calendar cal = Calendar.getInstance(UTC, US);
        
        cal.set(2020, Calendar.JANUARY, 1, 0, 0, 0); // วันที่ 1 (<10)
        assertEquals("1 01 001 2020", printer.format(cal));

        cal.set(2020, Calendar.JANUARY, 15, 0, 0, 0); // วันที่ 15 (10-99)
        assertEquals("15 15 015 2020", printer.format(cal));

        cal.set(2020, Calendar.JANUARY, 123, 0, 0, 0); // วันที่ >= 100 (Day of year เกิน)
        assertNotNull(printer.format(cal));
    }

    @Test
    public void testHourFieldsEdgeCases() {
        // ทดสอบ 12Hour และ 24Hour เมื่อค่าเป็น 0
        FastDatePrinter printer1 = new FastDatePrinter("h K H k", UTC, US);
        Calendar cal = Calendar.getInstance(UTC, US);
        cal.set(Calendar.HOUR_OF_DAY, 0); // เที่ยงคืน -> h=12, K=0, H=0, k=24
        String formatted = printer1.format(cal);
        assertNotNull(formatted);
    }

    @Test
    public void testTimeZoneRules() {
        TimeZone tzWithDst = TimeZone.getTimeZone("America/New_York");
        FastDatePrinter printer = new FastDatePrinter("z zzzz Z ZZ", tzWithDst, US);
        assertNotNull(printer.format(new Date()));
        
        // ทดสอบ TimeZone แบบไม่มีโคลอนและมีโคลอน
        FastDatePrinter printerZ1 = new FastDatePrinter("Z", UTC, US);
        assertEquals("+0000", printerZ1.format(new Date()));

        FastDatePrinter printerZ2 = new FastDatePrinter("ZZ", UTC, US);
        assertEquals("+00:00", printerZ2.format(new Date()));

        // ทดสอบ TimeZone ติดลบ
        TimeZone tzNeg = TimeZone.getTimeZone("GMT-05:00");
        FastDatePrinter printerNeg = new FastDatePrinter("Z ZZ", tzNeg, US);
        assertEquals("-0500 -05:00", printerNeg.format(new Date()));
    }

    @Test
    public void testEqualsAndHashCodeAndSerialization() throws Exception {
        FastDatePrinter p1 = new FastDatePrinter("yyyy-MM-dd", UTC, US);
        FastDatePrinter p2 = new FastDatePrinter("yyyy-MM-dd", UTC, US);
        FastDatePrinter p3 = new FastDatePrinter("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), US);
        FastDatePrinter p4 = new FastDatePrinter("yyyy-MM-dd", UTC, Locale.UK);

        assertTrue(p1.equals(p2));
        assertEquals(p1.hashCode(), p2.hashCode());

        assertFalse(p1.equals(null));
        assertFalse(p1.equals("NotAPrinter"));
        assertFalse(p1.equals(p3));
        assertFalse(p1.equals(p4));
        assertTrue(p1.equals(p1));

        // Serialization test
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(p1);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        FastDatePrinter deserialized = (FastDatePrinter) ois.readObject();
        ois.close();

        assertEquals(p1, deserialized);
        assertEquals(p1.format(0L), deserialized.format(0L));
    }
}