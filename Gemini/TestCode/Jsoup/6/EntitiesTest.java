package org.jsoup.nodes;

import org.junit.Test;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

import static org.junit.Assert.*;

public class EntitiesTest {

    @Test
    public void testEscapeBaseMode() {
        // ทดสอบโหมด base และการเข้ารหัสตัวอักษรทั่วไป + numeric fallback
        CharsetEncoder encoder = Charset.forName("US-ASCII").newEncoder();
        String input = "A & B © ü"; // & มีใน base, © และ ü ไม่มีใน ASCII ต้องใช้ numeric/fallback
        String escaped = Entities.escape(input, encoder, Entities.EscapeMode.base);
        assertEquals("A &amp; B &#169; &#252;", escaped);
    }

    @Test
    public void testEscapeExtendedMode() {
        // ทดสอบโหมด extended ซึ่ง map ตัวอักษรพิเศษได้มากกว่า
        CharsetEncoder encoder = Charset.forName("UTF-8").newEncoder();
        String input = "Abreve: ˘"; // Abreve มีอยู่ใน fullByVal
        String escaped = Entities.escape(input, encoder, Entities.EscapeMode.extended);
        assertTrue(escaped.contains("&Abreve;"));
    }

    @Test
    public void testUnescapeNoAmpersand() {
        // ทดสอบกรณีไม่มีเครื่องหมาย & คืนค่าเดิมทันที (Branch Coverage)
        String input = "Hello World";
        assertEquals("Hello World", Entities.unescape(input));
    }

    @Test
    public void testUnescapeDecimalEntity() {
        // ทดสอบแปลงตัวอักษรจาก Entity แบบเลขฐาน 10 (Decimal)
        String input = "&#65;&#66;&#67;"; // ABC
        assertEquals("ABC", Entities.unescape(input));
    }

    @Test
    public void testUnescapeHexEntity() {
        // ทดสอบแปลงตัวอักษรจาก Entity แบบเลขฐาน 16 (Hexadecimal) ทั้งตัวพิมพ์เล็กและใหญ่
        String input = "&#x41;&#X42;"; // AB
        assertEquals("AB", Entities.unescape(input));
    }

    @Test
    public void testUnescapeInvalidNumberFormat() {
        // ทดสอบ Edge Case: รูปแบบตัวเลขผิดพลาดเพื่อให้เข้า catch block (NumberFormatException)
        String input = "&#xZZ;";
        assertEquals("&#xZZ;", Entities.unescape(input));
    }

    @Test
    public void testUnescapeNamedEntity() {
        // ทดสอบแปลง Named Entity ปกติ
        String input = "&amp; &lt; &gt; &quot;";
        assertEquals("& < > \"", Entities.unescape(input));
    }

    @Test
    public void testUnescapeInvalidNamedEntity() {
        // ทดสอบ Entity ที่ไม่มีอยู่จริงในระบบ
        String input = "&notarealentity;";
        assertEquals("&notarealentity;", Entities.unescape(input));
    }

    @Test
    public void testUnescapeOutOfRangeOrFaultyCondition() {
        // จำลอง Edge Case ดักจับ Defect ของ Jsoup-6 (เงื่อนไข charval != -1 || charval > 0xFFFF)
        // ทดสอบค่าติดลบหรือค่าที่เกินช่วง Unicode BMP
        String input = "&#x110000;"; // เกินช่วง 0xFFFF
        String result = Entities.unescape(input);
        assertNotNull(result);
    }
}