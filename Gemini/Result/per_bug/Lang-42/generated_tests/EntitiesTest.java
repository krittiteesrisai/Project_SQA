package org.apache.commons.lang;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import static org.junit.Assert.*;

/**
 * Comprehensive JUnit 4 test suite for {@link Entities} covering branches,
 * boundary limits, edge cases, and internal map structures.
 */
public class EntitiesTest {

    private Entities entities;

    @Before
    public void setUp() {
        entities = new Entities();
    }

    // ==========================================
    // 1. Predefined Standard Entities Instances
    // ==========================================

    @Test
    public void testPredefinedXmlEntities() {
        assertEquals("quot", Entities.XML.entityName(34));
        assertEquals(34, Entities.XML.entityValue("quot"));
        assertEquals("amp", Entities.XML.entityName(38));
        assertEquals("lt", Entities.XML.entityName(60));
        assertEquals("gt", Entities.XML.entityName(62));
        assertEquals("apos", Entities.XML.entityName(39));
        assertNull(Entities.XML.entityName(169)); // 'copy' not in XML
    }

    @Test
    public void testPredefinedHtml32Entities() {
        assertEquals("copy", Entities.HTML32.entityName(169));
        assertEquals(169, Entities.HTML32.entityValue("copy"));
        assertEquals("nbsp", Entities.HTML32.entityName(160));
        assertNull(Entities.HTML32.entityName(8364)); // 'euro' not in HTML 3.2
    }

    @Test
    public void testPredefinedHtml40Entities() {
        assertEquals("euro", Entities.HTML40.entityName(8364));
        assertEquals(8364, Entities.HTML40.entityValue("euro"));
        assertEquals("Alpha", Entities.HTML40.entityName(913));
        assertEquals("forall", Entities.HTML40.entityName(8704));
    }

    @Test
    public void testFillWithHtml40Entities() {
        Entities customEntities = new Entities();
        Entities.fillWithHtml40Entities(customEntities);
        assertEquals("euro", customEntities.entityName(8364));
        assertEquals("copy", customEntities.entityName(169));
        assertEquals("quot", customEntities.entityName(34));
    }

    // ==========================================
    // 2. EntityMap Implementations Branch Tests
    // ==========================================

    @Test
    public void testPrimitiveEntityMap() {
        Entities.PrimitiveEntityMap map = new Entities.PrimitiveEntityMap();
        map.add("foo", 100);
        map.add("bar", 200);

        assertEquals("foo", map.name(100));
        assertEquals(100, map.value("foo"));
        assertNull(map.name(999));
        assertEquals(-1, map.value("nonexistent"));
    }

    @Test
    public void testHashEntityMap() {
        Entities.HashEntityMap map = new Entities.HashEntityMap();
        map.add("alpha", 1);

        assertEquals("alpha", map.name(1));
        assertEquals(1, map.value("alpha"));
        assertNull(map.name(2));
        assertEquals(-1, map.value("beta"));
    }

    @Test
    public void testTreeEntityMap() {
        Entities.TreeEntityMap map = new Entities.TreeEntityMap();
        map.add("omega", 999);

        assertEquals("omega", map.name(999));
        assertEquals(999, map.value("omega"));
        assertNull(map.name(100));
        assertEquals(-1, map.value("zeta"));
    }

    @Test
    public void testLookupEntityMapBoundaries() {
        Entities.LookupEntityMap map = new Entities.LookupEntityMap();
        map.add("low", 65);       // < 256
        map.add("high", 300);     // >= 256

        // Hits lookupTable branch (< 256)
        assertEquals("low", map.name(65));
        assertNull(map.name(66)); // < 256 but unassigned

        // Hits super.name(value) branch (>= 256)
        assertEquals("high", map.name(300));
        assertNull(map.name(301)); // >= 256 and unassigned
    }

    @Test
    public void testArrayEntityMapOperationsAndExpansion() {
        Entities.ArrayEntityMap map = new Entities.ArrayEntityMap(2); // Small initial size
        map.add("e1", 1);
        map.add("e2", 2);
        map.add("e3", 3); // Triggers ensureCapacity expansion

        assertEquals("e1", map.name(1));
        assertEquals("e2", map.name(2));
        assertEquals("e3", map.name(3));
        assertNull(map.name(4));

        assertEquals(1, map.value("e1"));
        assertEquals(2, map.value("e2"));
        assertEquals(3, map.value("e3"));
        assertEquals(-1, map.value("e4"));

        // Default constructor branch
        Entities.ArrayEntityMap defaultMap = new Entities.ArrayEntityMap();
        defaultMap.add("test", 10);
        assertEquals("test", defaultMap.name(10));
    }

    @Test
    public void testBinaryEntityMapSearchAndDuplicateHandling() {
        Entities.BinaryEntityMap map = new Entities.BinaryEntityMap(2);
        map.add("mid", 50);
        map.add("low", 10);
        map.add("high", 100);
        map.add("midHigh", 75);

        // Branch: midVal == key (found)
        assertEquals("low", map.name(10));
        assertEquals("mid", map.name(50));
        assertEquals("midHigh", map.name(75));
        assertEquals("high", map.name(100));

        // Branch: not found (index < 0)
        assertNull(map.name(5));
        assertNull(map.name(60));
        assertNull(map.name(200));

        // Branch: duplicate value insert (insertAt > 0)
        map.add("duplicateHigh", 100);
        assertEquals("high", map.name(100)); // original remains

        // Default constructor branch
        Entities.BinaryEntityMap defaultMap = new Entities.BinaryEntityMap();
        defaultMap.add("item", 20);
        assertEquals("item", defaultMap.name(20));
    }

    // ==========================================
    // 3. Escape Branch Tests
    // ==========================================

    @Test
    public void testEscapeNullAndEmpty() {
        assertEquals("", entities.escape(""));
    }

    @Test
    public void testEscapeNoEntitiesAscii() {
        String input = "The quick brown fox jumps over the lazy dog 12345.";
        assertEquals(input, entities.escape(input));
    }

    @Test
    public void testEscapeMappedEntities() {
        entities.addEntity("gt", 62);
        entities.addEntity("lt", 60);
        entities.addEntity("amp", 38);

        assertEquals("&lt;tag attr=&quot;val&quot;&gt;&amp;&lt;/tag&gt;",
                entities.escape("<tag attr=\"val\">&</tag>"));
    }

    @Test
    public void testEscapeUnmappedHighUnicodeCharacters() {
        // Character > 0x7F without mapped entity name
        String input = "Hello \u0080 \u0100 \u20AC";
        String expected = "Hello &#128; &#256; &#8364;";
        assertEquals(expected, entities.escape(input));
    }

    @Test(expected = IOException.class)
    public void testEscapeWriterThrowsException() throws IOException {
        Writer failingWriter = new Writer() {
            @Override
            public void write(char[] cbuf, int off, int len) throws IOException {
                throw new IOException("Simulated write failure");
            }

            @Override
            public void write(int c) throws IOException {
                throw new IOException("Simulated write failure");
            }

            @Override
            public void flush() {}

            @Override
            public void close() {}
        };
        entities.escape(failingWriter, "test & string");
    }

    // ==========================================
    // 4. Unescape Branch Tests
    // ==========================================

    @Test
    public void testUnescapeWithoutAmpersand() {
        String input = "Pure string without any ampersand characters.";
        assertEquals(input, entities.unescape(input));
    }

    @Test
    public void testUnescapeWriterWithoutAmpersand() throws IOException {
        StringWriter writer = new StringWriter();
        entities.unescape(writer, "No ampersands here.");
        assertEquals("No ampersands here.", writer.toString());
    }

    @Test
    public void testUnescapeIncompleteEntityNoSemicolon() {
        String input = "This &that and &more";
        assertEquals(input, entities.unescape(input));
    }

    @Test
    public void testUnescapeConsecutiveAmpersandsBeforeSemicolon() {
        // Tests branch: amphersandIdx != -1 && amphersandIdx < semiColonIdx
        String input = "Check &foo&amp; bar";
        Entities html = Entities.HTML40;
        assertEquals("Check &foo& bar", html.unescape(input));
    }

    @Test
    public void testUnescapeEmptyEntityContent() {
        // Tests: "&;"
        String input = "Empty &; entity";
        assertEquals("Empty &; entity", entities.unescape(input));
    }

    @Test
    public void testUnescapeSingleHashEntity() {
        // Tests: "&#;"
        String input = "Invalid &#; entity";
        assertEquals("Invalid &#; entity", entities.unescape(input));
    }

    @Test
    public void testUnescapeDecimalEntities() {
        String input = "&#65;&#66;&#67; and &#160;";
        assertEquals("ABC and \u00A0", entities.unescape(input));
    }

    @Test
    public void testUnescapeHexEntities() {
        // Lowercase 'x' and Uppercase 'X'
        String input = "&#x41;&#X42;&#x43; and &#x20ac;";
        assertEquals("ABC and \u20AC", entities.unescape(input));
    }

    @Test
    public void testUnescapeInvalidNumberFormat() {
        // NumberFormatException handling
        String input = "&#XYZ; and &#xG1; and &#-10;";
        assertEquals("&#XYZ; and &#xG1; and &#-10;", entities.unescape(input));
    }

    @Test
    public void testUnescapeOutOfBoundsEntityValue() {
        // Value > 0xFFFF (65535)
        String input = "&#70000; and &#x10000;";
        assertEquals("&#70000; and &#x10000;", entities.unescape(input));
    }

    @Test
    public void testUnescapeNamedEntities() {
        Entities custom = new Entities();
        custom.addEntity("trade", 8482);
        custom.addEntity("copy", 169);

        String input = "&trade; Brand &copy; 2023 &unknown;";
        assertEquals("\u2122 Brand \u00A9 2023 &unknown;", custom.unescape(input));
    }

    @Test
    public void testUnescapeComplexMixedString() {
        Entities html = Entities.HTML40;
        String input = "&lt;div class=&quot;test&quot;&gt;&#x48;&#101;llo &amp; welcome &#8482;&lt;/div&gt;";
        String expected = "<div class=\"test\">Hello & welcome \u2122</div>";
        assertEquals(expected, html.unescape(input));
    }

    @Test(expected = IOException.class)
    public void testUnescapeWriterThrowsException() throws IOException {
        Writer failingWriter = new Writer() {
            @Override
            public void write(char[] cbuf, int off, int len) throws IOException {
                throw new IOException("Simulated write failure");
            }

            @Override
            public void write(int c) throws IOException {
                throw new IOException("Simulated write failure");
            }

            @Override
            public void flush() {}

            @Override
            public void close() {}
        };
        Entities.HTML40.unescape(failingWriter, "Test &amp; string");
    }
}