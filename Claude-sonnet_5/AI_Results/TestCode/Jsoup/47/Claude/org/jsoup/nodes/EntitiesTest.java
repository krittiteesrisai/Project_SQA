package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EntitiesTest {

    private Document.OutputSettings settings(String charsetName, Entities.EscapeMode mode) {
        // สมมติฐาน: Document.OutputSettings มี public API charset(String) และ escapeMode(EscapeMode)
        // (ไม่ได้อยู่ใน source ที่ให้มา แต่จำเป็นต้องใช้เป็น dependency ของ escape())
        Document.OutputSettings os = new Document.OutputSettings();
        os.charset(charsetName);
        os.escapeMode(mode);
        return os;
    }

    // ---------------------------------------------------------------
    // isNamedEntity / isBaseNamedEntity / getCharacterByName
    // ---------------------------------------------------------------

    @Test
    public void testIsNamedEntity_Known() {
        assertTrue(Entities.isNamedEntity("amp"));
        assertTrue(Entities.isNamedEntity("lt"));
        assertTrue(Entities.isNamedEntity("gt"));
        assertTrue(Entities.isNamedEntity("quot"));
    }

    @Test
    public void testIsNamedEntity_Unknown() {
        assertFalse(Entities.isNamedEntity("notARealEntityNameXYZ"));
    }

    @Test
    public void testIsNamedEntity_EmptyAndNull() {
        assertFalse(Entities.isNamedEntity(""));
        // HashMap.containsKey(null) คืน false ไม่ throw NPE
        assertFalse(Entities.isNamedEntity(null));
    }

    @Test
    public void testIsBaseNamedEntity_Known() {
        assertTrue(Entities.isBaseNamedEntity("amp"));
        assertTrue(Entities.isBaseNamedEntity("lt"));
    }

    @Test
    public void testIsBaseNamedEntity_UnknownOrNull() {
        assertFalse(Entities.isBaseNamedEntity("notARealEntityNameXYZ"));
        assertFalse(Entities.isBaseNamedEntity(null));
    }

    @Test
    public void testGetCharacterByName_Known() {
        assertEquals(Character.valueOf('&'), Entities.getCharacterByName("amp"));
        assertEquals(Character.valueOf('<'), Entities.getCharacterByName("lt"));
        assertEquals(Character.valueOf('>'), Entities.getCharacterByName("gt"));
    }

    @Test
    public void testGetCharacterByName_UnknownReturnsNull() {
        assertNull(Entities.getCharacterByName("notARealEntityNameXYZ"));
        assertNull(Entities.getCharacterByName(null));
        assertNull(Entities.getCharacterByName(""));
    }

    // ---------------------------------------------------------------
    // escape(String, OutputSettings) wrapper + core '&' escape
    // ---------------------------------------------------------------

    @Test
    public void testEscape_Ampersand_WrapperMethod() {
        Document.OutputSettings out = settings("UTF-8", Entities.EscapeMode.base);
        String result = Entities.escape("A & B", out);
        assertEquals("A &amp; B", result);
    }

    @Test
    public void testEscape_EmptyString() {
        Document.OutputSettings out = settings("UTF-8", Entities.EscapeMode.base);
        assertEquals("", Entities.escape("", out));
    }

    @Test(expected = NullPointerException.class)
    public void testEscape_NullStringThrowsNPE() {
        Document.OutputSettings out = settings("UTF-8", Entities.EscapeMode.base);
        Entities.escape(null, out); // string.length() ทำให้ NPE
    }

    // ---------------------------------------------------------------
    // escape(...) core switch branches: nbsp (0xA0)
    // ---------------------------------------------------------------

    @Test
    public void testEscape_Nbsp_BaseMode() {
        Document.OutputSettings out = settings("UTF-8", Entities.EscapeMode.base);
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, "\u00A0", out, false, false, false);
        assertEquals("&nbsp;", sb.toString());
    }

    @Test
    public void testEscape_Nbsp_XhtmlMode() {
        Document.OutputSettings out = settings("UTF-8", Entities.EscapeMode.xhtml);
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, "\u00A0", out, false, false, false);
        assertEquals("&#xa0;", sb.toString());
    }

    // ---------------------------------------------------------------
    // '<' branch: inAttribute true/false
    // ---------------------------------------------------------------

    @Test
    public void testEscape_LessThan_NotInAttribute() {
        Document.OutputSettings out = settings("UTF-8", Entities.EscapeMode.base);
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, "<", out, false, false, false);
        assertEquals("&lt;", sb.toString());
    }

    @Test
    public void testEscape_LessThan_InAttribute() {
        Document.OutputSettings out = settings("UTF-8", Entities.EscapeMode.base);
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, "<", out, true, false, false);
        assertEquals("<", sb.toString());
    }

    // ---------------------------------------------------------------
    // '>' branch: inAttribute true/false
    // ---------------------------------------------------------------

    @Test
    public void testEscape_GreaterThan_NotInAttribute() {
        Document.OutputSettings out = settings("UTF-8", Entities.EscapeMode.base);
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, ">", out, false, false, false);
        assertEquals("&gt;", sb.toString());
    }

    @Test
    public void testEscape_GreaterThan_InAttribute() {
        Document.OutputSettings out = settings("UTF-8", Entities.EscapeMode.base);
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, ">", out, true, false, false);
        assertEquals(">", sb.toString());
    }

    // ---------------------------------------------------------------
    // '"' branch: inAttribute true/false
    // ---------------------------------------------------------------

    @Test
    public void testEscape_Quote_InAttribute() {
        Document.OutputSettings out = settings("UTF-8", Entities.EscapeMode.base);
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, "\"", out, true, false, false);
        assertEquals("&quot;", sb.toString());
    }

    @Test
    public void testEscape_Quote_NotInAttribute() {
        Document.OutputSettings out = settings("UTF-8", Entities.EscapeMode.base);
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, "\"", out, false, false, false);
        assertEquals("\"", sb.toString());
    }

    // ---------------------------------------------------------------
    // default branch: canEncode ตาม CoreCharset (ascii / utf / fallback)
    // ---------------------------------------------------------------

    @Test
    public void testEscape_Default_AsciiCharset_CanEncode() {
        // 'A' < 0x80 -> canEncode(ascii) = true -> append ตัวอักษรตรง ๆ
        Document.OutputSettings out = settings("US-ASCII", Entities.EscapeMode.base);
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, "A", out, false, false, false);
        assertEquals("A", sb.toString());
    }

    @Test
    public void testEscape_Default_AsciiCharset_CannotEncode_NumericFallback() {
        // \uE000 (Private Use Area) ไม่อยู่ใน entity map ใด ๆ -> escape เป็น numeric
        Document.OutputSettings out = settings("US-ASCII", Entities.EscapeMode.base);
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, "\uE000", out, false, false, false);
        assertEquals("&#xe000;", sb.toString());
    }

    @Test
    public void testEscape_Default_UtfCharset_AlwaysEncode() {
        // CoreCharset.utf -> canEncode คืน true เสมอ ไม่ผ่าน map เลย
        Document.OutputSettings out = settings("UTF-8", Entities.EscapeMode.base);
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, "\u00E9", out, false, false, false); // 'é'
        assertEquals("\u00E9", sb.toString());
    }

    @Test
    public void testEscape_Default_FallbackCharset_CanEncode() {
        // ISO-8859-1 ไม่ใช่ ascii/utf -> ใช้ fallback.canEncode จริง, 'é' เข้ารหัสได้ใน Latin-1
        Document.OutputSettings out = settings("ISO-8859-1", Entities.EscapeMode.base);
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, "\u00E9", out, false, false, false);
        assertEquals("\u00E9", sb.toString());
    }

    @Test
    public void testEscape_Default_FallbackCharset_CannotEncode_NumericFallback() {
        // '\u4e2d' (ไม่สามารถเข้ารหัสใน ISO-8859-1 และไม่อยู่ใน entity map) -> numeric escape
        Document.OutputSettings out = settings("ISO-8859-1", Entities.EscapeMode.base);
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, "\u4e2d", out, false, false, false);
        assertEquals("&#x4e2d;", sb.toString());
    }

    // ---------------------------------------------------------------
    // normaliseWhite / stripLeadingWhite branches
    // ---------------------------------------------------------------

    @Test
    public void testEscape_NormaliseWhite_CollapsesMultipleSpaces() {
        Document.OutputSettings out = settings("UTF-8", Entities.EscapeMode.base);
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, "a   b", out, false, true, false);
        assertEquals("a b", sb.toString());
    }

    @Test
    public void testEscape_NormaliseWhite_StripLeadingWhite_True() {
        Document.OutputSettings out = settings("UTF-8", Entities.EscapeMode.base);
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, "   abc", out, false, true, true);
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testEscape_NormaliseWhite_StripLeadingWhite_FalseKeepsLeadingAsSingleSpace() {
        Document.OutputSettings out = settings("UTF-8", Entities.EscapeMode.base);
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, "  abc", out, false, true, false);
        assertEquals(" abc", sb.toString());
    }

    // ---------------------------------------------------------------
    // surrogate pair (supplementary code point) branches
    // ---------------------------------------------------------------

    @Test
    public void testEscape_SurrogatePair_Encodable_Utf() {
        // U+1F600 (grinning face) ด้วย UTF-8 encoder.canEncode(String) ควรเป็น true
        Document.OutputSettings out = settings("UTF-8", Entities.EscapeMode.base);
        StringBuilder sb = new StringBuilder();
        String emoji = "\uD83D\uDE00";
        Entities.escape(sb, emoji, out, false, false, false);
        assertEquals(emoji, sb.toString());
    }

    @Test
    public void testEscape_SurrogatePair_NotEncodable_Ascii() {
        // ด้วย US-ASCII encoder.canEncode(String) ของอีโมจิต้องเป็น false -> numeric escape
        Document.OutputSettings out = settings("US-ASCII", Entities.EscapeMode.base);
        StringBuilder sb = new StringBuilder();
        String emoji = "\uD83D\uDE00";
        Entities.escape(sb, emoji, out, false, false, false);
        assertEquals("&#x1f600;", sb.toString());
    }

    // ---------------------------------------------------------------
    // unescape(...) - เป็น smoke test เท่านั้น เนื่องจาก delegate ไปยัง
    // Parser.unescapeEntities(...) ซึ่งไม่มี source ให้วิเคราะห์ (ข้อกำหนด #4)
    // ---------------------------------------------------------------

    @Test
    public void testUnescape_NoEntities_SmokeTest() {
        // ไม่มี entity syntax ใด ๆ ในข้อความ -> คาดว่าได้ข้อความเดิมกลับมา (สมมติฐานปลอดภัย)
        String result = Entities.unescape("plain text, no entities");
        assertEquals("plain text, no entities", result);
    }

    @Test
    public void testUnescapeStrict_NoEntities_SmokeTest() {
        String result = Entities.unescape("plain text, no entities", true);
        assertEquals("plain text, no entities", result);
    }

    @Test
    public void testUnescape_EmptyString_SmokeTest() {
        assertEquals("", Entities.unescape(""));
    }
}
