package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class EntitiesTest {

    private CharsetEncoder asciiEncoder;
    private CharsetEncoder utf8Encoder;

    @Before
    public void setUp() {
        asciiEncoder = Charset.forName("US-ASCII").newEncoder();
        utf8Encoder = Charset.forName("UTF-8").newEncoder();
    }

    // ===================== escape(String, CharsetEncoder, EscapeMode) =====================

    @Test
    public void escape_emptyString_returnsEmpty() {
        // loop ไม่ทำงานเลย เพราะ string.length() == 0
        String result = Entities.escape("", asciiEncoder, Entities.EscapeMode.base);
        assertEquals("", result);
    }

    @Test
    public void escape_charInBaseMap_base_producesNamedEntity() {
        // '<' (0x3C) อยู่ใน baseByVal -> "lt"
        String result = Entities.escape("<", asciiEncoder, Entities.EscapeMode.base);
        assertEquals("&lt;", result);
    }

    @Test
    public void escape_charInBothMaps_extendedMode_producesNamedEntity() {
        // ตรวจว่า ternary เลือก fullByVal ถูกต้องเมื่อ escapeMode = extended
        String result = Entities.escape("<", asciiEncoder, Entities.EscapeMode.extended);
        assertEquals("&lt;", result);
    }

    @Test
    public void escape_charInFullMapOnly_extendedMode_producesNamedEntity() {
        // alpha (0x3B1) มีเฉพาะใน fullByVal ไม่มีใน baseByVal
        char alpha = (char) 0x3B1;
        String result = Entities.escape(String.valueOf(alpha), asciiEncoder, Entities.EscapeMode.extended);
        assertEquals("&alpha;", result);
    }

    @Test
    public void escape_charNotInBaseMap_notEncodable_producesNumericEscape() {
        // alpha ไม่อยู่ใน baseByVal และ ASCII encoder encode ไม่ได้ -> else branch: &#945;
        char alpha = (char) 0x3B1;
        String result = Entities.escape(String.valueOf(alpha), asciiEncoder, Entities.EscapeMode.base);
        assertEquals("&#945;", result);
    }

    @Test
    public void escape_charNotInMap_encodable_appendsRawChar() {
        // 'z' (0x7A) ไม่เป็น entity codepoint และ ASCII encode ได้ -> append ตรง ๆ
        String result = Entities.escape("z", asciiEncoder, Entities.EscapeMode.base);
        assertEquals("z", result);
    }

    @Test
    public void escape_mixedString_allBranchesCovered() {
        // 'a' -> raw, '<' -> entity, 'b' -> raw : ทดสอบ loop หลายรอบ ครบทุก branch ในลูปเดียว
        String result = Entities.escape("a<b", asciiEncoder, Entities.EscapeMode.base);
        assertEquals("a&lt;b", result);
    }

    @Test
    public void escape_withUtf8Encoder_nonAsciiEncodableChar_appendsRawChar() {
        // alpha ไม่อยู่ baseByVal แต่ UTF-8 encoder encode ได้ -> raw char branch (ต่าง encoder, ต่างผลลัพธ์)
        char alpha = (char) 0x3B1;
        String result = Entities.escape(String.valueOf(alpha), utf8Encoder, Entities.EscapeMode.base);
        assertEquals(String.valueOf(alpha), result);
    }

    // ===================== escape(String, Document.OutputSettings) wrapper =====================
    // หมายเหตุ: Document.OutputSettings ไม่มีซอร์สโค้ดให้ในโจทย์
    // สมมติ public API มาตรฐานของ jsoup ("charset(String)", "escapeMode(EscapeMode)")
    // ตามที่ทราบจากโครงสร้างทั่วไปของ jsoup เวอร์ชันนี้ — เป็นการ delegate ไม่มี branch เพิ่ม
    @Test
    public void escape_withOutputSettings_delegatesToCoreEscape() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.charset("UTF-8");
        settings.escapeMode(Entities.EscapeMode.base);
        String result = Entities.escape("<", settings);
        assertEquals("&lt;", result);
    }

    // ===================== unescape(String) =====================

    @Test
    public void unescape_noAmpersand_returnsSameString() {
        // branch: !string.contains("&") == true -> return string เดิมทันที
        String input = "plain text without entities";
        assertEquals(input, Entities.unescape(input));
    }

    @Test
    public void unescape_emptyString_returnsEmpty() {
        assertEquals("", Entities.unescape(""));
    }

    @Test
    public void unescape_namedEntityWithSemicolon_isReplaced() {
        assertEquals("&", Entities.unescape("&amp;"));
    }

    @Test
    public void unescape_namedEntityWithoutSemicolon_isReplaced() {
        // base entity สามารถ unescape ได้แม้ไม่มี ';' ปิด (ตาม regex ";?" )
        assertEquals("&", Entities.unescape("&amp"));
    }

    @Test
    public void unescape_unknownNamedEntity_isKeptAsIs() {
        // full.containsKey("zzzz") == false -> charval = -1 -> เก็บข้อความเดิม
        String input = "&zzzz;";
        assertEquals(input, Entities.unescape(input));
    }

    @Test
    public void unescape_namedEntityCaseInsensitive() {
        // name.toLowerCase() ก่อนค้นหาใน full map
        assertEquals("&", Entities.unescape("&AMP;"));
    }

    @Test
    public void unescape_decimalNumericEntity_isReplaced() {
        // num != null, group(2) == null -> base 10
        assertEquals("A", Entities.unescape("&#65;"));
    }

    @Test
    public void unescape_hexNumericEntityLowercaseX_isReplaced() {
        // group(2) != null ("x") -> base 16
        assertEquals("A", Entities.unescape("&#x41;"));
    }

    @Test
    public void unescape_hexNumericEntityUppercaseX_isReplaced() {
        // group(2) != null ("X") -> base 16
        assertEquals("A", Entities.unescape("&#X41;"));
    }

    @Test
    public void unescape_invalidDecimalNumeric_throwsCaughtAndKeptAsIs() {
        // "1a" ไม่ใช่เลขฐาน 10 ที่ถูกต้อง -> NumberFormatException ถูก catch ภายใน
        // charval ยังคงเป็น -1 -> ข้อความเดิมถูกเก็บไว้ (ทดสอบ catch block)
        String input = "&#1a;";
        assertEquals(input, Entities.unescape(input));
    }

    @Test
    public void unescape_multipleEntitiesMixed() {
        // ทดสอบ loop while(m.find()) ทำงานหลายรอบ
        assertEquals("&<>", Entities.unescape("&amp;&lt;&gt;"));
    }

    @Test
    public void unescape_numericBoundary_maxCharValue() {
        // ค่าขอบเขตบนของ char: 0xFFFF (65535) -> แปลงสำเร็จ
        char expected = (char) 0xFFFF;
        assertEquals(String.valueOf(expected), Entities.unescape("&#65535;"));
    }

    @Test
    public void unescape_numericOutOfRange_currentBehaviorTruncates() {
        // หมายเหตุ/คำเตือนเรื่อง fault ที่อาจพบ:
        // เงื่อนไข "if (charval != -1 || charval > 0xFFFF)" ในซอร์สมีปัญหา operator precedence/logic:
        // เมื่อ charval != -1 เป็น true อยู่แล้ว (เช่นค่าตัวเลขที่ parse ได้ แต่เกิน 0xFFFF)
        // เงื่อนไขทั้งหมดจะ true เสมอ ทำให้ branch "// out of range" ไม่ถูกเข้าถึงจริงตามที่คอมเมนต์ตั้งใจไว้
        // ผลคือค่าที่เกินขนาด char ถูก cast แบบ truncate แทนที่จะถูกข้าม (skip)
        // เทสนี้ไม่ได้ "เดา" behavior ที่ถูกต้อง แต่บันทึกพฤติกรรมจริงตามโค้ดปัจจุบัน
        // เพื่อช่วยดักจับ regression/fault นี้ได้ในอนาคต
        // 1114112 (0x110000) mod 65536 == 0 -> (char)1114112 == '\u0000'
        String result = Entities.unescape("&#1114112;");
        assertEquals(String.valueOf((char) 0), result);
    }

    @Test
    public void unescape_textSurroundingEntities_isPreserved() {
        assertEquals("Hello & World <tag>", Entities.unescape("Hello &amp; World &lt;tag&gt;"));
    }

    @Test
    public void unescape_entityAtStringBoundaries() {
        // entity อยู่ที่ต้นและปลายสตริงพอดี
        assertEquals("<start and end>", Entities.unescape("&lt;start and end&gt;"));
    }

    @Test
    public void unescape_loneAmpersand_notMatchingPattern_keptAsIs() {
        // มี "&" แต่ตามด้วยช่องว่าง ไม่ match pattern เลย -> m.find() == false ตลอด
        // -> appendTail คืนข้อความเดิมทั้งหมด
        String input = "just & ampersand";
        assertEquals(input, Entities.unescape(input));
    }
}
