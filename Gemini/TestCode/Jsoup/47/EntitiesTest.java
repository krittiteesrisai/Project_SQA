package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;

import java.nio.charset.Charset;

public class EntitiesTest {

    @Test
    public void testNamedEntitiesQueries() {
        // Test isNamedEntity
        assertTrue(Entities.isNamedEntity("amp"));
        assertTrue(Entities.isNamedEntity("lt"));
        assertFalse(Entities.isNamedEntity("nonexistententity"));

        // Test isBaseNamedEntity
        assertTrue(Entities.isBaseNamedEntity("amp"));
        assertFalse(Entities.isBaseNamedEntity("notabaseentity")); // บางตัวอาจมีใน extended แต่ไม่อยู่ใน base

        // Test getCharacterByName
        assertEquals(Character.valueOf('&'), Entities.getCharacterByName("amp"));
        assertEquals(Character.valueOf('<'), Entities.getCharacterByName("lt"));
        assertNull(Entities.getCharacterByName("invalidName"));
    }

    @Test
    public void testEscapeBasicAndXhtmlMode() {
        Document.OutputSettings outXhtml = new Document.OutputSettings();
        outXhtml.escapeMode(Entities.EscapeMode.xhtml);

        // 0xA0 in xhtml mode should be &#xa0;
        String xhtmlResult = Entities.escape("\u00A0", outXhtml);
        assertEquals("&#xa0;", xhtmlResult);

        Document.OutputSettings outBase = new Document.OutputSettings();
        outBase.escapeMode(Entities.EscapeMode.base);

        // 0xA0 in base/extended mode should be &nbsp;
        String baseResult = Entities.escape("\u00A0", outBase);
        assertEquals("&nbsp;", baseResult);
    }

    @Test
    public void testEscapeAttributesContext() {
        Document.OutputSettings out = new Document.OutputSettings();
        out.escapeMode(Entities.EscapeMode.base);

        // inAttribute = false: <, >, " behavior
        String outAttrFalse = Entities.escape("<>&\"", out);
        assertEquals("&lt;&gt;&amp;\"", outAttrFalse);

        // inAttribute = true: <, >, " behavior (Note: < and > are not escaped in attributes, " is escaped to &quot;)
        StringBuilder accum = new StringBuilder();
        Entities.escape(accum, "<>&\"", out, true, false, false);
        assertEquals("<>&&quot;", accum.toString());
    }

    @Test
    public void testEscapeWhitespaceNormalisation() {
        Document.OutputSettings out = new Document.OutputSettings();
        out.escapeMode(Entities.EscapeMode.base);

        StringBuilder accum1 = new StringBuilder();
        // normaliseWhite = true, stripLeadingWhite = true
        Entities.escape(accum1, "   hello   world   ", out, false, true, true);
        assertEquals("hello world ", accum1.toString());

        StringBuilder accum2 = new StringBuilder();
        // normaliseWhite = true, stripLeadingWhite = false
        Entities.escape(accum2, "   hello   world   ", out, false, true, false);
        assertEquals(" hello world ", accum2.toString());
    }

    @Test
    public void testEscapeCoreCharsetsAndSupplementary() {
        Document.OutputSettings outAscii = new Document.OutputSettings();
        outAscii.charset(Charset.forName("US-ASCII"));
        outAscii.escapeMode(Entities.EscapeMode.base);

        // ASCII characters vs Non-ASCII under US-ASCII charset
        String asciiRes = Entities.escape("a\u00A9", outAscii); // \u00A9 is copyright sign ©
        assertEquals("a&copy;", asciiRes);

        Document.OutputSettings outUtf = new Document.OutputSettings();
        outUtf.charset(Charset.forName("UTF-8"));

        // Supplementary characters (Surrogate pairs, code point >= 0x10000) e.g., Emoji 😀 (1F600)
        String supplementaryChar = new String(Character.toChars(0x1F600));
        String utfRes = Entities.escape(supplementaryChar, outUtf);
        assertEquals(supplementaryChar, utfRes);
        
        // Un-encodable supplementary or fallback
        // Test fallback charset name coverage via arbitrary or fallback path if applicable
        Document.OutputSettings outFallback = new Document.OutputSettings();
        outFallback.charset(Charset.forName("ISO-8859-1"));
        String fallbackRes = Entities.escape("a", outFallback);
        assertEquals("a", fallbackRes);
    }

    @Test
    public void testUnescapeMethods() {
        String escaped = "&lt;script&gt;&amp;";
        String unescapedStrict = Entities.unescape(escaped, true);
        assertEquals("<script>&", unescapedStrict);

        String unescapedNonStrict = Entities.unescape("&amp", false);
        assertEquals("&", unescapedNonStrict);
    }
}