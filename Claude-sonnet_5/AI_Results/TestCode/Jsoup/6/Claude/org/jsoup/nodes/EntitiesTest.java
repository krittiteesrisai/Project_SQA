package org.jsoup.nodes;

import static org.junit.Assert.*;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

import org.junit.Test;

/**
 * Unit tests for org.jsoup.nodes.Entities
 *
 * หมายเหตุ:
 * - escape()/unescape() เป็น package-private static method จึงต้องวางคลาสทดสอบไว้ใน package เดียวกัน (org.jsoup.nodes)
 * - escape(String, Document.OutputSettings) ทดสอบโดยเปรียบเทียบผลลัพธ์กับการเรียก escape(String, encoder, escapeMode)
 *   โดยตรง เพื่อยืนยัน delegation ตาม source (ไม่เดา default ภายใน OutputSettings)
 * - มีเทสที่ตั้งใจ "ดักจับ defect" ของเงื่อนไข
 *      if (charval != -1 || charval > 0xFFFF)
 *   ซึ่งตาม logic แล้วเมื่อ charval != -1 (เช่น parse สำเร็จแต่ค่าเกิน 0xFFFF) เงื่อนไขจะเป็น true เสมอ
 *   (เพราะ OR) ทำให้ไม่มีการกรองค่าที่เกินขอบเขต 0xFFFF ออกจริง ๆ แม้คอมเมนต์จะบอกว่า "out of range"
 *   ส่งผลให้เกิดการ cast (char) ที่ overflow/truncate โดยไม่ตั้งใจ
 */
public class EntitiesTest {

    private CharsetEncoder asciiEncoder() {
        return Charset.forName("US-ASCII").newEncoder();
    }

    private CharsetEncoder utf8Encoder() {
        return Charset.forName("UTF-8").newEncoder();
    }

    // ---------------------- EscapeMode enum ----------------------

    @Test
    public void testEscapeMode_Values() {
        Entities.EscapeMode[] values = Entities.EscapeMode.values();
        assertEquals(2, values.length);
        assertEquals(Entities.EscapeMode.base, values[0]);
        assertEquals(Entities.EscapeMode.extended, values[1]);
    }

    @Test
    public void testEscapeMode_ValueOf() {
        assertEquals(Entities.EscapeMode.base, Entities.EscapeMode.valueOf("base"));
        assertEquals(Entities.EscapeMode.extended, Entities.EscapeMode.valueOf("extended"));
    }

    // ---------------------- escape() ----------------------

    @Test
    public void testEscape_EmptyString() {
        String result = Entities.escape("", asciiEncoder(), Entities.EscapeMode.base);
        assertEquals("", result);
    }

    @Test
    public void testEscape_CharInBaseMap() {
        // '<' exists in baseByVal => map.containsKey branch TRUE
        String result = Entities.escape("<", asciiEncoder(), Entities.EscapeMode.base);
        assertEquals("&lt;", result);
    }

    @Test
    public void testEscape_CharInBaseMap_Ampersand() {
        String result = Entities.escape("&", asciiEncoder(), Entities.EscapeMode.base);
        assertEquals("&amp;", result);
    }

    @Test
    public void testEscape_CharInFullMapOnly_ExtendedMode() {
        // '\u0100' (Amacr) exists only in fullByVal, not baseByVal
        String input = String.valueOf('\u0100');
        String result = Entities.escape(input, asciiEncoder(), Entities.EscapeMode.extended);
        assertEquals("&Amacr;", result);
    }

    @Test
    public void testEscape_CharNotInBaseMap_BaseMode_NumericFallback() {
        // '\u0100' not in baseByVal; ASCII encoder cannot encode it => numeric escape branch
        String input = String.valueOf('\u0100');
        String result = Entities.escape(input, asciiEncoder(), Entities.EscapeMode.base);
        assertEquals("&#256;", result);
    }

    @Test
    public void testEscape_EncodableCharNotInMap_PassThrough() {
        // 'Z' is ASCII-encodable and not present in baseByVal => plain character appended
        String result = Entities.escape("Z", asciiEncoder(), Entities.EscapeMode.base);
        assertEquals("Z", result);
    }

    @Test
    public void testEscape_NonEncodableCharNotInMap_NumericFallback() {
        // '\uE000' (Private Use Area) is not in any entity map and not ASCII encodable
        String input = String.valueOf('\uE000');
        String result = Entities.escape(input, asciiEncoder(), Entities.EscapeMode.base);
        assertEquals("&#57344;", result);
    }

    @Test
    public void testEscape_UTF8Encoder_CanEncodeNonMappedChar() {
        // Using a UTF-8 encoder, canEncode() should be true for this char -> literal character pass-through,
        // not numeric escape, even though '\u0100' is not in baseByVal.
        String input = String.valueOf('\u0100');
        String result = Entities.escape(input, utf8Encoder(), Entities.EscapeMode.base);
        assertEquals(input, result);
    }

    @Test
    public void testEscape_MixedCharacters() {
        // Combination of: mapped char, encodable plain char, non-encodable/non-mapped char
        String input = "<a\uE000";
        String result = Entities.escape(input, asciiEncoder(), Entities.EscapeMode.base);
        assertEquals("&lt;a&#57344;", result);
    }

    @Test
    public void testEscapeWithOutputSettings_DelegatesToThreeArgVersion() {
        Document.OutputSettings out = new Document.OutputSettings();
        String input = "Hello <World> & \"Quotes\"";
        String viaOutputSettings = Entities.escape(input, out);
        String viaDirectCall = Entities.escape(input, out.encoder(), out.escapeMode());
        assertEquals(viaDirectCall, viaOutputSettings);
    }

    // ---------------------- unescape() ----------------------

    @Test
    public void testUnescape_NoAmpersand_ReturnsSameString() {
        String input = "Hello World, nothing to unescape here.";
        assertEquals(input, Entities.unescape(input));
    }

    @Test
    public void testUnescape_EmptyString() {
        assertEquals("", Entities.unescape(""));
    }

    @Test
    public void testUnescape_AmpersandAlone_NoMatch() {
        // "&" with nothing following does not match the regex -> unchanged
        assertEquals("&", Entities.unescape("&"));
    }

    @Test
    public void testUnescape_NamedEntityWithSemicolon() {
        assertEquals("&", Entities.unescape("&amp;"));
    }

    @Test
    public void testUnescape_NamedEntityWithoutTrailingSemicolon() {
        assertEquals("I'm & happy", Entities.unescape("I'm &amp happy"));
    }

    @Test
    public void testUnescape_UnknownNamedEntity_Unchanged() {
        assertEquals("&foobar;", Entities.unescape("&foobar;"));
    }

    @Test
    public void testUnescape_CaseSensitiveNamedEntity_UnknownMixedCase() {
        // "Amp" (mixed case) is not a key in full map -> unchanged
        assertEquals("&Amp;", Entities.unescape("&Amp;"));
    }

    @Test
    public void testUnescape_NamedEntity_UppercaseAMP() {
        // "AMP" (all caps) IS present in full map
        assertEquals("&", Entities.unescape("&AMP;"));
    }

    @Test
    public void testUnescape_DecimalNumeric() {
        assertEquals("A", Entities.unescape("&#65;"));
    }

    @Test
    public void testUnescape_HexNumeric_Lowercase_x() {
        assertEquals("?", Entities.unescape("&#x3f;"));
    }

    @Test
    public void testUnescape_HexNumeric_Uppercase_X() {
        assertEquals("A", Entities.unescape("&#X41;"));
    }

    @Test
    public void testUnescape_DecimalZero() {
        assertEquals("\u0000", Entities.unescape("&#0;"));
    }

    @Test
    public void testUnescape_MalformedNumber_InvalidDigitForBase_NumberFormatException() {
        // base=10 (no x/X) but digits contain 'F' which is invalid for radix 10 -> NumberFormatException -> charval stays -1 -> literal kept
        assertEquals("&#1F;", Entities.unescape("&#1F;"));
    }

    @Test
    public void testUnescape_MalformedNumber_TooLargeForInteger_NumberFormatException() {
        // Number too large to fit in an int -> NumberFormatException -> charval stays -1 -> literal kept
        String input = "&#99999999999;";
        assertEquals(input, Entities.unescape(input));
    }

    @Test
    public void testUnescape_BoundaryValue_0xFFFF() {
        // exactly at char boundary, should convert correctly
        assertEquals("\uFFFF", Entities.unescape("&#65535;"));
    }

    /**
     * FAULT-DETECTING TEST:
     * ตาม source: if (charval != -1 || charval > 0xFFFF)
     * เมื่อ charval ถูก parse สำเร็จ (!= -1) และมีค่าเกิน 0xFFFF (เช่น 128512 = U+1F600)
     * เงื่อนไขจะเป็น true อยู่ดี (เพราะ OR) แม้ค่าจะ "out of range" ตามคอมเมนต์ในซอร์ส
     * ผลคือ (char) charval จะถูก cast/truncate แบบ wrap-around (128512 mod 65536 = 62976 = 0xF600)
     * ทำให้ได้ผลลัพธ์ตัวอักษรที่ไม่ถูกต้อง แทนที่จะถูกปล่อยผ่านแบบ literal ตามที่คอมเมนต์ตั้งใจ
     */
    @Test
    public void testUnescape_OutOfRangeNumeric_DemonstratesTruncationDefect() {
        String result = Entities.unescape("&#128512;");
        assertEquals("\uF600", result); // 128512 mod 65536 == 0xF600, per actual (char) cast behavior in source
    }

    @Test
    public void testUnescape_OutOfRangeNumeric_ExactBoundary_0x10000_WrapsToZero() {
        // 65536 (0x10000) mod 65536 == 0 -> (char) cast wraps to NUL character due to same defect
        String result = Entities.unescape("&#65536;");
        assertEquals("\u0000", result);
    }

    @Test
    public void testUnescape_MultipleEntitiesAndPlainText() {
        String input = "A &amp; B &lt; C &gt; D";
        assertEquals("A & B < C > D", Entities.unescape(input));
    }

    @Test
    public void testUnescape_EntityAtStartAndEndOfString() {
        assertEquals("& at start, and end &", Entities.unescape("&amp; at start, and end &amp;"));
    }

    @Test
    public void testUnescape_EntityWithTrailingTextAfterLastMatch_AppendTail() {
        // ensures m.appendTail(accum) correctly appends remaining text after the last match
        assertEquals("Fish & Chips!", Entities.unescape("Fish &amp; Chips!"));
    }

    @Test
    public void testUnescape_NoTrailingTextAfterLastMatch() {
        assertEquals("Fish &", Entities.unescape("Fish &amp;"));
    }

    @Test
    public void testUnescape_MixedNamedAndNumericEntities() {
        String input = "&lt;tag&gt; &#65; &#x42;";
        assertEquals("<tag> A B", Entities.unescape(input));
    }
}
