package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.SerializationException;
import java.io.IOException;

import static org.junit.Assert.*;

public class AttributeTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullKey() {
        new Attribute(null, "value");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorEmptyKey() {
        new Attribute("", "value");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorBlankKeyTrimToEmpty() {
        new Attribute("   ", "value");
    }

    @Test
    public void testConstructorAndGetters() {
        Attribute attr = new Attribute("  href  ", "index.html");
        assertEquals("href", attr.getKey());
        assertEquals("index.html", attr.getValue());
        assertFalse(attr.isDataAttribute());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetKeyNull() {
        Attribute attr = new Attribute("key", "val");
        attr.setKey(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetKeyBlank() {
        Attribute attr = new Attribute("key", "val");
        attr.setKey("   ");
    }

    @Test
    public void testSetKeyWithoutParent() {
        Attribute attr = new Attribute("oldKey", "val");
        attr.setKey("  newKey  ");
        assertEquals("newKey", attr.getKey());
    }

    @Test
    public void testSetKeyWithParent() {
        Attributes parent = new Attributes();
        parent.put("oldKey", "val");
        Attribute attr = parent.iterator().next(); // get the attribute instance managed by parent
        
        attr.setKey("newKey");
        assertEquals("newKey", attr.getKey());
        assertEquals("val", parent.get("newKey"));
    }

    @Test(expected = NullPointerException.class)
    public void testSetValueWithoutParentPotentialBug() {
        // Defects4J Jsoup-85 bug trigger: parent.get(this.key) throws NPE if parent is null
        Attribute attr = new Attribute("key", "val");
        attr.setValue("newVal");
    }

    @Test
    public void testSetValueWithParent() {
        Attributes parent = new Attributes();
        parent.put("key", "oldVal");
        Attribute attr = parent.iterator().next();
        
        String old = attr.setValue("newVal");
        assertEquals("oldVal", old);
        assertEquals("newVal", attr.getValue());
        assertEquals("newVal", parent.get("key"));
    }

    @Test
    public void testHtmlOutput() {
        Attribute attr = new Attribute("class", "box");
        assertEquals("class=\"box\"", attr.html());
        assertEquals("class=\"box\"", attr.toString());
    }

    @Test
    public void testBooleanAttributeHtmlHtmlSyntax() {
        Attribute attr = new Attribute("checked", "");
        Document.OutputSettings out = new Document("").outputSettings();
        out.syntax(Document.OutputSettings.Syntax.html);
        
        assertEquals("checked", attr.html());
    }

    @Test
    public void testBooleanAttributeHtmlXmlSyntax() {
        Attribute attr = new Attribute("checked", "");
        Document.OutputSettings out = new Document("").outputSettings();
        out.syntax(Document.OutputSettings.Syntax.xml);
        
        assertEquals("checked=\"\"", attr.html(new StringBuilder(), out).toString());
    }

    @Test(expected = SerializationException.class)
    public void testHtmlSerializationException() {
        Attribute attr = new Attribute("key", "val");
        Appendable faultyAppendable = new Appendable() {
            @Override
            public Appendable append(CharSequence csq) throws IOException { throw new IOException(); }
            @Override
            public Appendable append(CharSequence csq, int start, int end) throws IOException { throw new IOException(); }
            @Override
            public Appendable append(char c) throws IOException { throw new IOException(); }
        };
        Document.OutputSettings out = new Document("").outputSettings();
        // Invoke private/protected html with faulty appendable
        attr.html(faultyAppendable, out);
    }

    @Test
    public void testDataAttributes() {
        assertTrue(Attribute.isDataAttribute("data-id"));
        assertFalse(Attribute.isDataAttribute("data-"));
        assertFalse(Attribute.isDataAttribute("id"));
        
        Attribute attr = new Attribute("data-name", "jsoup");
        assertTrue(attr.isDataAttribute());
    }

    @Test
    public void testIsBooleanAttribute() {
        assertTrue(Attribute.isBooleanAttribute("checked"));
        assertTrue(Attribute.isBooleanAttribute("allowfullscreen"));
        assertFalse(Attribute.isBooleanAttribute("href"));
    }

    @Test
    public void testEqualsAndHashCode() {
        Attribute a1 = new Attribute("key", "val");
        Attribute a2 = new Attribute("key", "val");
        Attribute a3 = new Attribute("key", "diff");
        Attribute a4 = new Attribute("diff", "val");
        Attribute aNullKey1 = new Attribute(null, "val"); // Note: constructor prevents null key, but testing defensively if possible or via direct object states if applicable
        
        assertEquals(a1, a1);
        assertEquals(a1, a2);
        assertEquals(a1.hashCode(), a2.hashCode());

        assertNotEquals(a1, null);
        assertNotEquals(a1, "some string");
        assertNotEquals(a1, a3);
        assertNotEquals(a1, a4);

        // Test with different key/val null combinations using equals contract directly
        Attribute kNull1 = new Attribute("a", "val");
        // Force internal null fields via clone or similar if needed, or rely on standard coverage
    }

    @Test
    public void testClone() {
        Attribute attr = new Attribute("key", "val");
        Attribute clone = attr.clone();
        
        assertEquals(attr, clone);
        assertNotSame(attr, clone);
    }
}