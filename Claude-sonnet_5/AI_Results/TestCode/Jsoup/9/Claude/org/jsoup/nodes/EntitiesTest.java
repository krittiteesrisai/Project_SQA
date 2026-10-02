package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/**
 * Unit tests for org.jsoup.nodes.Entities
 * (Defects4J: Jsoup-9b)
 *
 * หมายเหตุ:
 * - ทดสอบตรงที่ method escape(String, CharsetEncoder, EscapeMode) และ unescape(String)
 *   เพราะเป็น package-private static method ที่สามารถเรียกได้จาก class ใน package เดียวกัน
 * - ไม่ได้เขียนเทสสำหรับ escape(String, Document.OutputSettings) เนื่องจาก Document.OutputSettings
 *   ไม่มี source ให้ในโจทย์ จึงไม่ทราบ public API (constructor/setter) ที่แน่ชัด
 *   เพื่อไม่ "เดา" behavior ที่ไม่มีอยู่ในซอร์สที่ให้มา (ตามข้อกำหนดที่ 4)
 */
public class EntitiesTest {

    // ===================== escape(String, CharsetEncoder, EscapeMode) =====================

    @Test
    public void testEscapeEmptyString() {
        // loop ไม่ execute เลย (boundary: string.length() == 0)
        CharsetEncoder encoder = Charset.forName("UTF-8").newEncoder();
        String result = Entities.escape("", encoder, Entities.EscapeMode.base);
        assertEquals("", result);
    }

    @Test
    public void testEscapeXhtmlModeAllSpecialChars() {
        // ครอบคลุม map.containsKey(c) == true (ทุกตัวใน xhtml map) และ canEncode==true สำหรับ 'a'
        CharsetEncoder encoder = Charset.forName("UTF-8").newEncoder();
        String input = "<a>&'\""; // < a > & ' "
        String result = Entities.escape(input, encoder, Entities.EscapeMode.xhtml);
        assertEquals("&lt;a&gt;&amp;&apos;&quot;", result);
    }

    @Test
    public void testEscapeBaseMode_CharNotInMap_CanEncode() {
        // map.containsKey == false, encoder.canEncode == true -> append ตัวอักษรตรงๆ
        CharsetEncoder encoder = Charset.forName("UTF-8").newEncoder();
        String result = Entities.escape("hello", encoder, Entities.EscapeMode.base);
        assertEquals("hello", result);
    }

    @Test
    public void testEscapeBaseMode_CharInMap() {
        // map.containsKey == true สำหรับ base map: '\u00A9' (copyright) -> "copy"
        CharsetEncoder encoder = Charset.forName("UTF-8").newEncoder();
        String result = Entities.escape("\u00A9", encoder, Entities.EscapeMode.base);
        assertEquals("&copy;", result);
    }

    @Test
    public void testEscapeBaseMode_CharNotInMap_CannotEncode() {
        // map.containsKey == false, encoder.canEncode == false -> ใช้ numeric escape
        // '\u20AC' (Euro sign) ไม่อยู่ใน baseArray และ US-ASCII encoder ไม่สามารถ encode ได้
        CharsetEncoder encoder = Charset.forName("US-ASCII").newEncoder();
        String result = Entities.escape("\u20AC", encoder, Entities.EscapeMode.base);
        assertEquals("&#8364;", result);
    }

    @Test
    public void testEscapeExtendedMode_CharInFullMapOnly() {
        // ตัวอักษรที่อยู่ใน fullArray เท่านั้น (ไม่อยู่ใน baseArray) เพื่อยืนยันว่า extended ใช้ fullByVal map
        CharsetEncoder encoder = Charset.forName("UTF-8").newEncoder();
        String result = Entities.escape("\u20AC", encoder, Entities.EscapeMode.extended);
        assertEquals("&euro;", result);
    }

    @Test
    public void testEscapeCombinedBranches_MultipleCharsLoop() {
        // loop หลายครั้ง ผ่านทั้ง 3 branch: canEncode true, map hit (ไม่ได้ใช้ในเคสนี้), canEncode false
        CharsetEncoder encoder = Charset.forName("US-ASCII").newEncoder();
        String result = Entities.escape("A\u20ACB", encoder, Entities.EscapeMode.base);
        assertEquals("A&#8364;B", result);
    }

    @Test(expected = NullPointerException.class)
    public void testEscapeNullStringThrowsNPE() {
        // string.length() บน null -> NPE (ไม่ใช่การเดา เป็น Java semantics ปกติ)
        CharsetEncoder encoder = Charset.forName("UTF-8").newEncoder();
        Entities.escape(null, encoder, Entities.EscapeMode.base);
    }

    // ===================== unescape(String) =====================

    @Test
    public void testUnescapeNoAmpersandReturnsSameReference() {
        // !string.contains("&") == true -> early return ของ reference เดิม
        String input = "Hello World";
        assertSame(input, Entities.unescape(input));
    }

    @Test
    public void testUnescapeEmptyString() {
        // boundary: string ว่าง, ไม่มี "&" -> return ตัวเดิม
        assertEquals("", Entities.unescape(""));
    }

    @Test
    public void testUnescapeNamedEntityKnownWithSemicolon() {
        assertEquals("&", Entities.unescape("&amp;"));
    }

    @Test
    public void testUnescapeNamedEntityKnownWithoutSemicolon() {
        // base entities ตัดได้โดยไม่มี ; ท้าย เช่น &amp (ตาม comment ในซอร์ส)
        assertEquals("&", Entities.unescape("&amp"));
    }

    @Test
    public void testUnescapeNamedEntityUnknown() {
        // full.containsKey(name) == false -> charval ยังเป็น -1 -> คืนค่า original match
        String input = "&foobarxyz;";
        assertEquals(input, Entities.unescape(input));
    }

    @Test
    public void testUnescapeDecimalEntityWithSemicolon() {
        // num != null, group(2) == null -> base 10
        assertEquals("A", Entities.unescape("&#65;"));
    }

    @Test
    public void testUnescapeDecimalEntityWithoutSemicolon() {
        // ทดสอบ ";?" optional ที่ปลาย pattern
        assertEquals("A", Entities.unescape("&#65"));
    }

    @Test
    public void testUnescapeHexEntityLowercaseX() {
        // group(2) != null ("x") -> base 16
        assertEquals("A", Entities.unescape("&#x41;"));
    }

    @Test
    public void testUnescapeHexEntityUppercaseX() {
        // group(2) != null ("X") -> base 16
        assertEquals("A", Entities.unescape("&#X41;"));
    }

    @Test
    public void testUnescapeNumberFormatExceptionBranch() {
        // "1a2" ถูกจับโดย [0-9a-fA-F]+ (hex chars) แต่ไม่มี x/X prefix -> พยายาม parse base 10
        // -> throw NumberFormatException -> ถูก catch -> charval ยังเป็น -1 -> คง original text
        String input = "&#1a2;";
        assertEquals(input, Entities.unescape(input));
    }

    @Test
    public void testUnescapeMultipleEntitiesInOneString() {
        // while loop match หลายครั้ง
        String input = "&amp;&lt;&gt;";
        assertEquals("&<>", Entities.unescape(input));
    }

    @Test
    public void testUnescapeMixedTextAndEntities() {
        String input = "5 &gt; 3 &amp;&amp; 2 &lt; 4";
        assertEquals("5 > 3 && 2 < 4", Entities.unescape(input));
    }

    @Test
    public void testUnescapeAmpersandNoMatchingPattern() {
        // มี "&" แต่ตามด้วย space ซึ่งไม่ match pattern เลย -> while loop ไม่ match
        // -> m.appendTail คัดลอกข้อความทั้งหมดกลับไปเหมือนเดิม
        String input = "Fish & Chips";
        assertEquals(input, Entities.unescape(input));
    }

    @Test
    public void testUnescapeSingleAmpersandNoFollowingChars() {
        // boundary: "&" อยู่ท้ายสตริง ไม่มีตัวอักษรตามมาให้ match
        assertEquals("&", Entities.unescape("&"));
    }

    @Test
    public void testUnescapeMalformedNumericEntityNoDigits() {
        // "&#;" ไม่มี hex digit เลย -> ไม่ match ทั้ง (#...) และ [a-zA-Z]+ -> คงเดิม
        String input = "Value: &#; end";
        assertEquals(input, Entities.unescape(input));
    }

    @Test
    public void testUnescapeOutOfRangeCodepoint_KnownDefectBehavior() {
        // "&Afr;" -> full.get("Afr") = 0x1D504 (> 0xFFFF)
        // เงื่อนไข (charval != -1 || charval > 0xFFFF) เป็น OR ไม่ใช่ AND/ช่วงที่ถูกต้อง
        // ทำให้ charval != -1 เป็น true (เพราะ charval ไม่ใช่ -1) จึงเข้า branch แปลงเป็น char
        // (char) 0x1D504 จะถูก narrowing cast ตัดบิตสูงออก เหลือ 0xD504 (ตาม Java cast semantics)
        // ค่านี้คำนวณได้จาก source ตรงๆ ไม่ใช่การเดา และสามารถใช้เป็น regression/fault-detecting test
        String input = "&Afr;";
        char truncated = (char) 0x1D504;
        String expected = Character.toString(truncated);
        assertEquals(expected, Entities.unescape(input));
    }

    @Test(expected = NullPointerException.class)
    public void testUnescapeNullStringThrowsNPE() {
        // string.contains("&") บน null -> NPE
        Entities.unescape(null);
    }

    // ===================== EscapeMode enum =====================

    @Test
    public void testEscapeModeMapsSizesAndContent() {
        assertNotNull(Entities.EscapeMode.xhtml.getMap());
        assertNotNull(Entities.EscapeMode.base.getMap());
        assertNotNull(Entities.EscapeMode.extended.getMap());

        // xhtmlArray มี 5 entries ตามซอร์ส
        assertEquals(5, Entities.EscapeMode.xhtml.getMap().size());
        // base ต้องมีมากกว่า xhtml, extended ต้องมีมากกว่า base
        assertTrue(Entities.EscapeMode.base.getMap().size() > Entities.EscapeMode.xhtml.getMap().size());
        assertTrue(Entities.EscapeMode.extended.getMap().size() > Entities.EscapeMode.base.getMap().size());

        // ตรวจสอบ key บางตัวที่รู้แน่ชัดจาก xhtmlArray
        assertEquals("lt", Entities.EscapeMode.xhtml.getMap().get('<'));
        assertEquals("quot", Entities.EscapeMode.xhtml.getMap().get('"'));
    }

    @Test
    public void testEscapeModeValuesAndValueOf() {
        Entities.EscapeMode[] modes = Entities.EscapeMode.values();
        assertEquals(3, modes.length);
        assertEquals(Entities.EscapeMode.xhtml, Entities.EscapeMode.valueOf("xhtml"));
        assertEquals(Entities.EscapeMode.base, Entities.EscapeMode.valueOf("base"));
        assertEquals(Entities.EscapeMode.extended, Entities.EscapeMode.valueOf("extended"));
    }
}
