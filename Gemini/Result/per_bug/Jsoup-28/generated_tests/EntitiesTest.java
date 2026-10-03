package org.jsoup.nodes;

import org.junit.Test;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

import static org.junit.Assert.*;

public class EntitiesTest {

    @Test
    public void testIsNamedEntityAndGetCharacter() {
        // ทดสอบทั้งกรณีมีอยู่จริงและไม่มีจริง (รวมถึง null)
        assertTrue(Entities.isNamedEntity("amp"));
        assertTrue(Entities.isNamedEntity("lt"));
        assertFalse(Entities.isNamedEntity("nonexistententity"));
        assertFalse(Entities.isNamedEntity(null));

        assertEquals(Character.valueOf('&'), Entities.getCharacterByName("amp"));
        assertEquals(Character.valueOf('<'), Entities.getCharacterByName("lt"));
        assertNull(Entities.getCharacterByName("nonexistententity"));
        assertNull(Entities.getCharacterByName(null));
    }

    @Test
    public void testEscapeModesAndEncoders() {
        CharsetEncoder asciiEncoder = Charset.forName("US-ASCII").newEncoder();
        
        // ทดสอบ EscapeMode: xhtml, base, extended
        String input = "A & B < C > D \" E ' F \u00A9"; // \u00A9 คือ Copyright symbol (©)
        
        String xhtmlResult = Entities.escape(input, asciiEncoder, Entities.EscapeMode.xhtml);
        assertTrue(xhtmlResult.contains("&amp;"));
        assertTrue(xhtmlResult.contains("&lt;"));
        assertTrue(xhtmlResult.contains("&gt;"));
        assertTrue(xhtmlResult.contains("&quot;"));
        assertTrue(xhtmlResult.contains("&apos;"));

        String baseResult = Entities.escape(input, asciiEncoder, Entities.EscapeMode.base);
        assertTrue(baseResult.contains("&amp;"));

        String extendedResult = Entities.escape(input, asciiEncoder, Entities.EscapeMode.extended);
        assertTrue(extendedResult.contains("&copy;") || extendedResult.contains("&#169;"));
    }

    @Test
    public void testEscapeEdgeCasesAndEncodable() {
        CharsetEncoder utf8Encoder = Charset.forName("UTF-8").newEncoder();
        
        // ทดสอบอักขระที่ encoder สามารถ encode ได้ตรงๆ กับที่ไม่ได้
        String plain = "Hello World 123";
        assertEquals("Hello World 123", Entities.escape(plain, utf8Encoder, Entities.EscapeMode.base));

        // ทดสอบสตริงว่าง
        assertEquals("", Entities.escape("", utf8Encoder, Entities.EscapeMode.base));
    }

    @Test
    public void testUnescapeWithoutAmpersand() {
        // Branch: !string.contains("&")
        String plain = "No ampersand here!";
        assertEquals(plain, Entities.unescape(plain));
        assertEquals(plain, Entities.unescape(plain, true));
    }

    @Test
    public void testUnescapeNamedEntities() {
        // ทดสอบ Named entities ปกติและแบบ Strict/Non-strict
        assertEquals("A & B", Entities.unescape("A &amp; B"));
        assertEquals("A & B", Entities.unescape("A &amp B", false)); // non-strict ยอมรับไม่มี ;
        
        // strict ควรจะไม่แปลงถ้าไม่มี semicolon ปิดท้าย
        assertEquals("A &amp B", Entities.unescape("A &amp B", true));
    }

    @Test
    public void testUnescapeNumericEntitiesDecimalAndHex() {
        // Decimal (ฐาน 10)
        assertEquals("A", Entities.unescape("&#65;"));
        assertEquals("A", Entities.unescape("&#65")); // non-strict

        // Hexadecimal (ฐาน 16 - ทั้ง lowercase และ uppercase x)
        assertEquals("A", Entities.unescape("&#x41;"));
        assertEquals("A", Entities.unescape("&#X41;"));
        assertEquals("A", Entities.unescape("&#x41")); // non-strict
    }

    @Test
    public void testUnescapeNumberFormatException() {
        // เคสที่แปลงเลขฐานไม่ได้ (NumberFormatException จะถูก catch ไว้)
        String malformed = "&#999999999999999999999999;";
        assertEquals(malformed, Entities.unescape(malformed));
    }

    @Test
    public void testUnescapeInvalidEntityName() {
        // ชื่อ Entity แปลกปลอมที่ไม่มีในระบบ
        String invalid = "&unknownentity;";
        assertEquals(invalid, Entities.unescape(invalid));
    }

    @Test
    public void testUnescapeEdgeCasesAndDefects4JFaultTrigger() {
        // กระตุ้นเงื่อนไข charval ของ unescape เพื่อให้ครอบคลุม Branch เชิงลึก (รวมถึงการดักจับ Fault Jsoup-28)
        assertEquals("", Entities.unescape("&;"));
        assertEquals("&", Entities.unescape("&#-1;"));
        
        // ทดสอบอักขระพิเศษหลากหลายรูปแบบติดกัน
        String complex = "&lt;&gt;&amp;&quot;&apos;&#65;&#x42;";
        assertEquals("<>&\"'AB", Entities.unescape(complex));
    }
}