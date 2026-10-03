package org.jsoup.nodes;

import org.junit.Test;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

import static org.junit.Assert.*;

public class EntitiesTest {

    @Test
    public void testEscapeBaseMode() {
        // ทดสอบ escape ด้วย Base Mode และตัวอักษรที่มีใน baseByVal เช่น '&' -> '&amp;'
        Document.OutputSettings out = new Document.OutputSettings();
        out.escapeMode(Entities.EscapeMode.base);
        String input = "Hello & World <";
        String escaped = Entities.escape(input, out);
        assertEquals("Hello &amp; World &lt;", escaped);
    }

    @Test
    public void testEscapeExtendedMode() {
        // ทดสอบ escape ด้วย Extended Mode (ใช้ fullByVal)
        Document.OutputSettings out = new Document.OutputSettings();
        out.escapeMode(Entities.EscapeMode.extended);
        String input = "Aacute: \u00C1"; // ตัวอักษรที่มีใน fullByVal
        String escaped = Entities.escape(input, out);
        assertEquals("&aacute;", escaped);
    }

    @Test
    public void testEscapeEncoderFallback() {
        // ทดสอบกรณีที่ map ไม่มีตัวอักษร แต่ encoder ไม่สามารถ encode ได้ ต้องตกไปเป็น numeric escape (&#...;)
        CharsetEncoder asciiEncoder = Charset.forName("US-ASCII").newEncoder();
        String input = "ก"; // ตัวอักษรไทย ไม่อยู่ใน ASCII และไม่อยู่ใน map
        String escaped = Entities.escape(input, asciiEncoder, Entities.EscapeMode.base);
        assertEquals("&#3619;", escaped);
    }

    @Test
    public void testEscapeEncoderCanEncode() {
        // ทดสอบกรณีที่ encoder สามารถ encode ได้ปกติ
        CharsetEncoder asciiEncoder = Charset.forName("US-ASCII").newEncoder();
        String input = "ABC";
        String escaped = Entities.escape(input, asciiEncoder, Entities.EscapeMode.base);
        assertEquals("ABC", escaped);
    }

    @Test
    public void testUnescapeNoAmpersand() {
        // Branch: !string.contains("&") -> คืนค่าเดิมทันที
        String input = "No entities here";
        assertEquals(input, Entities.unescape(input));
    }

    @Test
    public void testUnescapeNumericDecimal() {
        // Branch: num != null, decimal base (10)
        String input = "Hello &#38; World";
        assertEquals("Hello & World", Entities.unescape(input));
    }

    @Test
    public void testUnescapeNumericHexLowercase() {
        // Branch: num != null, hex base (16) with 'x'
        String input = "Hello &#x26; World";
        assertEquals("Hello & World", Entities.unescape(input));
    }

    @Test
    public void testUnescapeNumericHexUppercase() {
        // Branch: num != null, hex base (16) with 'X'
        String input = "Hello &#X26; World";
        assertEquals("Hello & World", Entities.unescape(input));
    }

    @Test
    public void testUnescapeNumberFormatException() {
        // Branch: NumberFormatException เกิดขึ้นเมื่อตัวเลขพัง แล้วข้ามไป (catch block)
        String input = "Hello &#999999999999999; World"; // เกินขอบเขต Integer
        assertEquals(input, Entities.unescape(input));
    }

    @Test
    public void testUnescapeNamedEntityValid() {
        // Branch: num == null, full.containsKey(name) เป็น true
        String input = "Hello &amp; World";
        assertEquals("Hello & World", Entities.unescape(input));
    }

    @Test
    public void testUnescapeNamedEntityInvalid() {
        // Branch: num == null, full.containsKey(name) เป็น false (คงค่าเดิม)
        String input = "Hello &unknownentity; World";
        assertEquals(input, Entities.unescape(input));
    }

    @Test
    public void testUnescapeOutOfRangeCharval() {
        // Branch: charval > 0xFFFF (Out of range check)
        // สร้างสถานการณ์ที่ charval เกิน 0xFFFF หรือติดลบ
        String input = "&#x1D504;"; // ค่า hex ที่เกิน 0xFFFF (เช่น Fraktur A)
        String result = Entities.unescape(input);
        assertNotNull(result);
    }

    @Test
    public void testUnescapeWithoutTrailingSemicolon() {
        // ทดสอบ unescape แบบไม่มีเครื่องหมาย semicolon ปิดท้าย (ตามคอมเมนต์: base entities can be unescaped without trailing ;)
        String input = "&amp";
        assertEquals("&", Entities.unescape(input));
    }
}