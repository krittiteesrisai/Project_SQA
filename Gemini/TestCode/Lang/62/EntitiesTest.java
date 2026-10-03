package org.apache.commons.lang;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class EntitiesTest {

    private Entities entities;

    @Before
    public void setUp() {
        entities = new Entities();
    }

    @Test
    public void testEscapeBasicEntities() {
        assertEquals("&quot;Hello &amp; World&quot;", Entities.XML.escape("\"Hello & World\""));
        assertEquals("&lt;tag&gt;", Entities.XML.escape("<tag>"));
        assertEquals("foo &apos; bar", Entities.XML.escape("foo ' bar"));
    }

    @Test
    public void testEscapeNonAsciiAndAscii() {
        entities.addEntity("alpha", 945);
        // ASCII normal char, Non-ASCII without entity, Non-ASCII with entity
        String input = "a\u0100\u03B1";
        String expected = "a&#256;&alpha;";
        assertEquals(expected, entities.escape(input));
    }

    @Test
    public void testEscapeWriter() throws IOException {
        StringWriter writer = new StringWriter();
        entities.addEntity("gt", 62);
        entities.escape(writer, "a>b\u0101");
        assertEquals("a&gt;b&#257;", writer.toString());
    }

    @Test
    public void testUnescapeNoAmpersand() {
        assertEquals("Hello World", entities.unescape("Hello World"));
    }

    @Test
    public void testUnescapeWriterNoAmpersand() throws IOException {
        StringWriter writer = new StringWriter();
        entities.unescape(writer, "Hello World");
        assertEquals("Hello World", writer.toString());
    }

    @Test
    public void testUnescapeMissingSemiColon() {
        assertEquals("&amp without semicolon", entities.unescape("&amp without semicolon"));
    }

    @Test
    public void testUnescapeWriterMissingSemiColon() throws IOException {
        StringWriter writer = new StringWriter();
        entities.unescape(writer, "&amp without semicolon");
        assertEquals("&amp without semicolon", writer.toString());
    }

    @Test
    public void testUnescapeNestedAmpersand() {
        assertEquals("&a&amp;b", Entities.XML.unescape("&a&amp;b"));
    }

    @Test
    public void testUnescapeWriterNestedAmpersand() throws IOException {
        StringWriter writer = new StringWriter();
        Entities.XML.unescape(writer, "&a&amp;b");
        assertEquals("&a&amp;b", writer.toString());
    }

    @Test
    public void testUnescapeEmptyEntity() {
        assertEquals("&;", entities.unescape("&;"));
        assertEquals("&#;", entities.unescape("&#;"));
    }

    @Test
    public void testUnescapeWriterEmptyEntity() throws IOException {
        StringWriter writer = new StringWriter();
        entities.unescape(writer, "&; and &#;");
        assertEquals("&; and &#;", writer.toString());
    }

    @Test
    public void testUnescapeDecimalEntities() {
        assertEquals("A", entities.unescape("&#65;"));
        assertEquals("&#xyz;", entities.unescape("&#xyz;")); // Invalid decimal NumberFormatException
    }

    @Test
    public void testUnescapeWriterDecimalEntities() throws IOException {
        StringWriter writer = new StringWriter();
        entities.unescape(writer, "&#65;&#xyz;");
        assertEquals("A&#xyz;", writer.toString());
    }

    @Test
    public void testUnescapeHexEntities() {
        assertEquals("A", entities.unescape("&#x41;"));
        assertEquals("B", entities.unescape("&#X42;"));
        assertEquals("&#xZZ;", entities.unescape("&#xZZ;")); // Invalid hex NumberFormatException
    }

    @Test
    public void testUnescapeNamedEntity() {
        entities.addEntity("copy", 169);
        assertEquals("\u00A9", entities.unescape("&copy;"));
        assertEquals("&unknown;", entities.unescape("&unknown;"));
    }

    @Test
    public void testUnescapeWriterNamedEntity() throws IOException {
        entities.addEntity("copy", 169);
        StringWriter writer = new StringWriter();
        entities.unescape(writer, "&copy;&unknown;");
        assertEquals("\u00A9&unknown;", writer.toString());
    }

    @Test
    public void testPredefinedHtmlEntities() {
        assertEquals("&copy;", Entities.HTML32.escape("\u00A9"));
        assertEquals("\u00A9", Entities.HTML32.unescape("&copy;"));

        assertEquals("&euro;", Entities.HTML40.escape("\u20AC"));
        assertEquals("\u20AC", Entities.HTML40.unescape("&euro;"));
    }

    @Test
    public void testPrimitiveEntityMap() {
        Entities.PrimitiveEntityMap map = new Entities.PrimitiveEntityMap();
        map.add("foo", 100);
        assertEquals("foo", map.name(100));
        assertNull(map.name(200));
        assertEquals(100, map.value("foo"));
        assertEquals(-1, map.value("unknown"));
    }

    @Test
    public void testHashEntityMap() {
        Entities.HashEntityMap map = new Entities.HashEntityMap();
        map.add("foo", 100);
        assertEquals("foo", map.name(100));
        assertNull(map.name(200));
        assertEquals(100, map.value("foo"));
        assertEquals(-1, map.value("unknown"));
    }

    @Test
    public void testTreeEntityMap() {
        Entities.TreeEntityMap map = new Entities.TreeEntityMap();
        map.add("foo", 100);
        assertEquals("foo", map.name(100));
        assertNull(map.name(200));
        assertEquals(100, map.value("foo"));
        assertEquals(-1, map.value("unknown"));
    }

    @Test
    public void testLookupEntityMap() {
        Entities.LookupEntityMap map = new Entities.LookupEntityMap();
        map.add("ascii", 65);
        map.add("large", 300);

        assertEquals("ascii", map.name(65));
        assertEquals("large", map.name(300));
        assertNull(map.name(66));
        assertNull(map.name(301));
    }

    @Test
    public void testArrayEntityMap() {
        Entities.ArrayEntityMap map = new Entities.ArrayEntityMap(2);
        map.add("first", 1);
        map.add("second", 2);
        map.add("third", 3); // trigger ensureCapacity

        assertEquals("first", map.name(1));
        assertEquals("second", map.name(2));
        assertEquals("third", map.name(3));
        assertNull(map.name(99));

        assertEquals(1, map.value("first"));
        assertEquals(2, map.value("second"));
        assertEquals(3, map.value("third"));
        assertEquals(-1, map.value("unknown"));
    }

    @Test
    public void testBinaryEntityMap() {
        Entities.BinaryEntityMap map = new Entities.BinaryEntityMap(2);
        map.add("c", 30);
        map.add("a", 10);
        map.add("b", 20); // binary insert and capacity growth
        map.add("duplicate", 20); // duplicate key insertion branch

        assertEquals("a", map.name(10));
        assertEquals("b", map.name(20));
        assertEquals("c", map.name(30));
        assertNull(map.name(5));
        assertNull(map.name(25));
        assertNull(map.name(40));
    }

    @Test
    public void testFillWithHtml40Entities() {
        Entities custom = new Entities();
        Entities.fillWithHtml40Entities(custom);
        assertEquals(945, custom.entityValue("alpha"));
        assertEquals("alpha", custom.entityName(945));
    }
}