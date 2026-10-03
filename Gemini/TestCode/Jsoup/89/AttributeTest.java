package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.SerializationException;
import static org.junit.Assert.*;

public class AttributeTest {

    @Test
    public void testConstructorAndGetters() {
        Attribute attr = new Attribute("testKey", "testVal");
        assertEquals("testKey", attr.getKey());
        assertEquals("testVal", attr.getValue());
        assertFalse(attr.hasDeclaredValue()); // depending on implementation or just check normal flow
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullKey() {
        new Attribute(null, "val");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorEmptyKey() {
        new Attribute("   ", "val");
    }

    @Test
    public void testSetKeyWithoutParent() {
        Attribute attr = new Attribute("  oldKey  ", "val");
        attr.setKey("  newKey  ");
        assertEquals("newKey", attr.getKey());
    }

    @Test
    public void testSetKeyWithParent() {
        Attributes parent = new Attributes();
        parent.put("oldKey", "val");
        Attribute attr = parent.iterator().next(); // gets the attribute bound to parent
        
        attr.setKey("newKey");
        assertEquals("newKey", attr.getKey());
        assertEquals("val", parent.get("newKey"));
        assertEquals("", parent.get("oldKey")); // old key should be replaced/removed in attributes implementation
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetKeyNull() {
        Attribute attr = new Attribute("key", "val");
        attr.setKey(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetKeyEmpty() {
        Attribute attr = new Attribute("key", "val");
        attr.setKey("");
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
    public void testHtmlOutputStandard() {
        Attribute attr = new Attribute("href", "http://example.com");
        assertEquals("href=\"http://example.com\"", attr.html());
        assertEquals("href=\"http://example.com\"", attr.toString());
    }

    @Test
    public void testHtmlOutputBooleanAttribute() {
        Attribute attr = new Attribute("checked", "checked");
        // Depending on output settings, boolean attributes might collapse
        String html = attr.html();
        assertTrue(html.contains("checked"));
    }

    @Test
    public void testCreateFromEncoded() {
        Attribute attr = Attribute.createFromEncoded("data-test", "a&amp;b");
        assertEquals("data-test", attr.getKey());
        assertEquals("a&b", attr.getValue());
    }

    @Test
    public void testIsDataAttribute() {
        Attribute dataAttr = new Attribute("data-id", "123");
        assertTrue(dataAttr.isDataAttribute());

        Attribute normalAttr = new Attribute("class", "content");
        assertFalse(normalAttr.isDataAttribute());

        Attribute invalidData = new Attribute("data-", "123");
        assertFalse(invalidData.isDataAttribute());
    }

    @Test
    public void testBooleanAttributes() {
        assertTrue(Attribute.isBooleanAttribute("checked"));
        assertTrue(Attribute.isBooleanAttribute("disabled"));
        assertFalse(Attribute.isBooleanAttribute("class"));
        assertFalse(Attribute.isBooleanAttribute(""));
        assertFalse(Attribute.isBooleanAttribute(null)); // should handle safely if supported
    }

    @Test
    public void testShouldCollapseAttribute() {
        Document.OutputSettings outHtml = new Document("").outputSettings();
        outHtml.syntax(Document.OutputSettings.Syntax.html);

        // Boolean attribute with null value
        Attribute attr1 = new Attribute("checked", null);
        assertTrue(attr1.shouldCollapseAttribute(outHtml));

        // Boolean attribute with empty value
        Attribute attr2 = new Attribute("checked", "");
        assertTrue(attr2.shouldCollapseAttribute(outHtml));

        // Boolean attribute with same value as key
        Attribute attr3 = new Attribute("checked", "checked");
        assertTrue(attr3.shouldCollapseAttribute(outHtml));

        // Non-boolean attribute with empty value
        Attribute attr4 = new Attribute("class", "");
        assertFalse(attr4.shouldCollapseAttribute(outHtml));

        // XML syntax output settings
        Document.OutputSettings outXml = new Document("").outputSettings();
        outXml.syntax(Document.OutputSettings.Syntax.xml);
        assertFalse(attr1.shouldCollapseAttribute(outXml));
    }

    @Test
    public void testEqualsAndHashCode() {
        Attribute a1 = new Attribute("key1", "val1");
        Attribute a2 = new Attribute("key1", "val1");
        Attribute a3 = new Attribute("key2", "val1");
        Attribute a4 = new Attribute("key1", "val2");
        Attribute a5 = new Attribute(null, "val1");
        Attribute a6 = new Attribute("key1", null);

        assertEquals(a1, a1);
        assertEquals(a1, a2);
        assertEquals(a1.hashCode(), a2.hashCode());

        assertNotEquals(a1, null);
        assertNotEquals(a1, "someString");
        assertNotEquals(a1, a3);
        assertNotEquals(a1, a4);
        assertNotEquals(a1, a5);
        assertNotEquals(a1, a6);
        assertNotEquals(a5, a1);
        assertNotEquals(a6, a1);

        Attribute a7 = new Attribute(null, null);
        Attribute a8 = new Attribute(null, null);
        assertEquals(a7, a8);
        assertEquals(a7.hashCode(), a8.hashCode());
    }

    @Test
    public void testClone() {
        Attribute attr = new Attribute("key", "val");
        Attribute clone = attr.clone();

        assertEquals(attr, clone);
        assertNotSame(attr, clone);
    }
}