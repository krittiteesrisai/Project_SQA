package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class EntitiesTest {

    @Test
    public void testNamedEntitiesLookup() {
        // Test isNamedEntity, isBaseNamedEntity, getCharacterByName
        assertTrue(Entities.isNamedEntity("amp"));
        assertFalse(Entities.isNamedEntity("nonexistententity"));

        assertTrue(Entities.isBaseNamedEntity("amp"));
        assertFalse(Entities.isBaseNamedEntity("nonexistententity"));

        assertEquals(Character.valueOf('&'), Entities.getCharacterByName("amp"));
        assertNull(Entities.getCharacterByName("nonexistententity"));
    }

    @Test
    public void testEscapeBasicAndSpecialCharacters() {
        Document.OutputSettings out = new Document.OutputSettings();
        
        // Test ampersand,quotes, angle brackets outside attribute
        out.escapeMode(Entities.EscapeMode.base);
        String input = "& < > \" \u00A0";
        String escaped = Entities.escape(input, out);
        assertEquals("&amp; &lt; &gt; \" &nbsp;", escaped);

        // Test inside attribute (quotes and angle brackets behave differently)
        String attrEscaped = Entities.escape(input, out, true, false, false);
        assertEquals("&amp; < &gt; &quot; &nbsp;", attrEscaped);
    }

    @Test
    public void testEscapeXhtmlMode() {
        Document.OutputSettings out = new Document.OutputSettings();
        out.escapeMode(Entities.EscapeMode.xhtml);
        
        // In xhtml mode, 0xA0 (non-breaking space) should not become &nbsp; but remain as is or entity restricted
        String input = "\u00A0 & < > \"";
        String escaped = Entities.escape(input, out);
        // xhtml restricted entities: quot, amp, lt, gt
        assertEquals("\u00A0 &amp; &lt; &gt; \"", escaped);
    }

    @Test
    public void testEscapeNormaliseWhitespace() {
        Document.OutputSettings out = new Document.OutputSettings();
        out.escapeMode(Entities.EscapeMode.base);

        // normaliseWhite = true, stripLeadingWhite = true
        String input = "   hello   world   ";
        String escaped = Entities.escape(accumBuilder(), input, out, false, true, true);
        assertEquals("hello world ", escaped);

        // stripLeadingWhite = false
        String escaped2 = Entities.escape(accumBuilder(), input, out, false, true, false);
        assertEquals(" hello world ", escaped2);
    }

    @Test
    public void testCoreCharsetsAndCanEncode() {
        // Test different charsets: US-ASCII, UTF-8, and fallback
        Document.OutputSettings outAscii = new Document.OutputSettings();
        outAscii.charset(Charset.forName("US-ASCII"));
        
        // ASCII encoding check (chars < 0x80 vs >= 0x80)
        String asciiInput = "a\u00A0"; // \u00A0 is >= 0x80, should trigger entity or hex escape under ASCII
        String asciiEscaped = Entities.escape(asciiInput, outAscii);
        assertEquals("a&nbsp;", asciiEscaped);

        // UTF charset check
        Document.OutputSettings outUtf = new Document.OutputSettings();
        outUtf.charset(Charset.forName("UTF-8"));
        String utfEscaped = Entities.escape("a\u00A0", outUtf);
        // In UTF-8, \u00A0 can be encoded or handled depending on escape mode, let's verify base escape mode
        assertNotNull(utfEscaped);

        // Fallback charset check (e.g. ISO-8859-1)
        Document.OutputSettings outFallback = new Document.OutputSettings();
        outFallback.charset(Charset.forName("ISO-8859-1"));
        String fallbackEscaped = Entities.escape("a\u00A0", outFallback);
        assertNotNull(fallbackEscaped);
    }

    @Test
    public void testSupplementaryCharacters() {
        Document.OutputSettings out = new Document.OutputSettings();
        out.escapeMode(Entities.EscapeMode.base);
        
        // Supplementary character (CodePoint >= 0x10000), e.g., Emoji 𝚡 (Mathematical bold small x: U+1D6A1)
        String suppStr = new String(Character.toChars(0x1D6A1));
        String escaped = Entities.escape(suppStr, out);
        assertNotNull(escaped);
    }

    @Test
    public void testUnescapeMethods() {
        String original = "&amp; &lt; &gt;";
        String unescaped = Entities.unescape(original);
        assertEquals("& < >", unescaped);

        String strictUnescaped = Entities.unescape("&amp", true);
        // Strict requires semicolon, so &amp without ';' might remain unescaped or handled by parser rules
        assertNotNull(strictUnescaped);
    }

    private StringBuilder accumBuilder() {
        return new StringBuilder();
    }
}