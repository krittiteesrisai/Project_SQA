package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class EntitiesTest {

    @Test
    public void testEscapeXhtmlMode() {
        // ทดสอบ EscapeMode.xhtml (รองรับเฉพาะ quot, amp, apos, lt, gt)
        String input = "\" & ' < > a";
        CharsetEncoder encoder = Charset.forName("UTF-8").newEncoder();
        String escaped = Entities.escape(input, encoder, Entities.EscapeMode.xhtml);
        assertEquals("&quot; &amp; &apos; &lt; &gt; a", escaped);
    }

    @Test
    public void testEscapeBaseMode() {
        // ทดสอบ EscapeMode.base
        String input = "© < > &";
        CharsetEncoder encoder = Charset.forName("UTF-8").newEncoder();
        String escaped = Entities.escape(input, encoder, Entities.EscapeMode.base);
        assertEquals("&copy; &lt; &gt; &amp;", escaped);
    }

    @Test
    public void testEscapeExtendedModeAndUnencodable() {
        // ทดสอบ EscapeMode.extended และกรณีที่ encoder ไม่สามารถ encode ได้ (บังคับออก numeric entity)
        String input = "Ā"; // ประกอบด้วยตัวอักษรที่ extended map มี หรือตัวอักษรพิเศษ
        // สร้าง Dummy Encoder ที่ไม่สามารถ encode ตัวอักษรบางตัวได้เพื่อบังคับเข้าเงื่อนไข else
        CharsetEncoder restrictedEncoder = Charset.forName("US-ASCII").newEncoder();
        String escaped = Entities.escape("a£", restrictedEncoder, Entities.EscapeMode.extended);
        // 'a' encode ได้, '£' (163) encode ด้วย US-ASCII ไม่ได้ต้องกลายเป็น &#163;
        assertEquals("a&#163;", escaped);
    }

    @Test
    public void testUnescapeWithoutAmpersand() {
        // Edge Case: ไม่มีเครื่องหมาย & คืนค่าเดิมทันที
        String input = "Hello World";
        assertEquals("Hello World", Entities.unescape(input));
    }

    @Test
    public void testUnescapeNumericDecimal() {
        // ทดสอบ Decimal numeric entities เช่น &#38; (&)
        String input = "&#38;";
        assertEquals("&", Entities.unescape(input));
    }

    @Test
    public void testUnescapeNumericHex() {
        // ทดสอบ Hexadecimal numeric entities เช่น &#x26; หรือ &#X26;
        assertEquals("&", Entities.unescape("&#x26;"));
        assertEquals("&", Entities.unescape("&#X26;"));
    }

    @Test
    public void testUnescapeNumericNumberFormatException() {
        // Edge Case: เลขรอดพ้นจาก NumberFormatException (เช่น ตัวเลขเกินขอบเขต int)
        String input = "&#999999999999999;";
        // ควรข้าม (catch NumberFormatException) และคืนค่าสตริงเดิมตามการทำงานของลูป
        String result = Entities.unescape(input);
        assertEquals(input, result);
    }

    @Test
    public void testUnescapeNamedEntity() {
        // ทดสอบ Named entities ที่มีอยู่ใน full map
        String input = "&amp; &lt; &gt; &copy;";
        assertEquals("& < > ©", Entities.unescape(input));
    }

    @Test
    public void testUnescapeInvalidNamedEntity() {
        // Edge Case: Entity ที่ไม่มีอยู่จริงใน map
        String input = "&notarealentity;";
        assertEquals("&notarealentity;", Entities.unescape(input));
    }
    
    @Test
    public void testUnescapeOutOfRangeCharacter() {
        // Edge Case: ทดสอบค่า charval ออกนอกช่วง (Trigger เงื่อนไข charval > 0xFFFF)
        // เช่น &#x1D504; (Afr) ซึ่งมีค่าเกิน 0xFFFF
        String input = "&#x1D504;";
        String result = Entities.unescape(input);
        assertNotNull(result);
    }
}