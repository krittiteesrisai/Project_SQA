package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.SerializationException;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class AttributesTest {

    @Test
    public void testInitialState() {
        Attributes attrs = new Attributes();
        assertEquals(0, attrs.size());
        assertTrue(attrs.asList().isEmpty());
        assertEquals("", attrs.html());
    }

    @Test
    public void testPutAndGet() {
        Attributes attrs = new Attributes();
        attrs.put("id", "myId");
        attrs.put("class", "myClass");

        assertEquals(2, attrs.size());
        assertEquals("myId", attrs.get("id"));
        assertEquals("myClass", attrs.get("class"));
        assertEquals("", attrs.get("nonexistent"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIndexOfKeyNull() {
        Attributes attrs = new Attributes();
        attrs.get(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIndexOfKeyIgnoreCaseNull() {
        Attributes attrs = new Attributes();
        attrs.getIgnoreCase(null);
    }

    @Test
    public void testGetIgnoreCase() {
        Attributes attrs = new Attributes();
        attrs.put("TestKey", "value1");

        assertEquals("value1", attrs.getIgnoreCase("testkey"));
        assertEquals("value1", attrs.getIgnoreCase("TESTKEY"));
        assertEquals("", attrs.getIgnoreCase("wrong"));
    }

    @Test
    public void testCapacityGrowth() {
        Attributes attrs = new Attributes();
        // เกิน InitialCapacity (4) เพื่อ Trigger GrowthFactor
        attrs.put("k1", "v1");
        attrs.put("k2", "v2");
        attrs.put("k3", "v3");
        attrs.put("k4", "v4");
        attrs.put("k5", "v5");

        assertEquals(5, attrs.size());
        assertEquals("v5", attrs.get("k5"));
    }

    @Test
    public void testPutBooleanAttribute() {
        Attributes attrs = new Attributes();
        attrs.put("hidden", true);
        assertTrue(attrs.hasKey("hidden"));
        assertNull(attrs.vals[attrs.indexOfKey("hidden")]);
        assertEquals(" hidden", attrs.html());

        attrs.put("hidden", false);
        assertFalse(attrs.hasKey("hidden"));
        assertEquals(0, attrs.size());
    }

    @Test
    public void testPutAttributeObject() {
        Attributes attrs = new Attributes();
        Attribute attr = new Attribute("href", "http://example.com");
        attrs.put(attr);

        assertEquals(1, attrs.size());
        assertEquals("http://example.com", attrs.get("href"));
        assertSame(attrs, attr.parent);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPutNullAttributeObject() {
        Attributes attrs = new Attributes();
        attrs.put((Attribute) null);
    }

    @Test
    public void testPutIgnoreCaseUpdateAndCaseChange() {
        Attributes attrs = new Attributes();
        attrs.putIgnoreCase("AB", "1");
        attrs.putIgnoreCase("ab", "2"); // Case changed update
        assertEquals(1, attrs.size());
        assertEquals("2", attrs.get("ab"));
    }

    @Test
    public void testRemoveOperations() {
        Attributes attrs = new Attributes();
        attrs.put("a", "1");
        attrs.put("b", "2");
        attrs.put("c", "3");

        // ลบตรงกลาง (shift > 0)
        attrs.remove("b");
        assertEquals(2, attrs.size());
        assertFalse(attrs.hasKey("b"));
        assertEquals("1", attrs.get("a"));
        assertEquals("3", attrs.get("c"));

        // ลบแบบไม่เจอ (ไม่ทำอะไร)
        attrs.remove("nonexistent");
        assertEquals(2, attrs.size());

        // ลบแบบ IgnoreCase
        attrs.removeIgnoreCase("A");
        assertEquals(1, attrs.size());
        assertFalse(attrs.hasKey("a"));
    }

    @Test
    public void testHasKeyIgnoreCase() {
        Attributes attrs = new Attributes();
        attrs.put("Data-Name", "jsoup");

        assertTrue(attrs.hasKeyIgnoreCase("data-name"));
        assertFalse(attrs.hasKeyIgnoreCase("data-other"));
    }

    @Test
    public void testAddAll() {
        Attributes attrs1 = new Attributes();
        attrs1.put("one", "1");

        Attributes attrs2 = new Attributes();
        attrs2.put("two", "2");
        attrs2.put("three", "3");

        attrs1.addAll(attrs2);
        assertEquals(3, attrs1.size());
        assertEquals("2", attrs1.get("two"));
        assertEquals("3", attrs1.get("three"));

        // Test incoming empty
        Attributes empty = new Attributes();
        attrs1.addAll(empty);
        assertEquals(3, attrs1.size());
    }

    @Test
    public void testIteratorAndIteratorRemove() {
        Attributes attrs = new Attributes();
        attrs.put("k1", "v1");
        attrs.put("k2", "v2");

        Iterator<Attribute> it = attrs.iterator();
        assertTrue(it.hasNext());
        Attribute a1 = it.next();
        assertEquals("k1", a1.getKey());

        it.remove(); // ทดสอบ Iterator remove
        assertEquals(1, attrs.size());
        assertFalse(attrs.hasKey("k1"));
    }

    @Test
    public void testAsListWithBooleanAttribute() {
        Attributes attrs = new Attributes();
        attrs.put("checked", true); // val เป็น null
        attrs.put("normal", "val");

        List<Attribute> list = attrs.asList();
        assertEquals(2, list.size());
        assertTrue(list.get(0) instanceof BooleanAttribute);
        assertTrue(list.get(1) instanceof Attribute);
        // ทดสอบ unmodifiable list
        try {
            list.remove(0);
            fail("Should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testHtmlOutputAndBooleanCollapse() {
        Attributes attrs = new Attributes();
        attrs.put("checked", (String) null); // val == null
        attrs.put("disabled", "disabled"); // val.equals(key)
        attrs.put("class", "foo");

        Document.OutputSettings out = new Document.OutputSettings();
        out.syntax(Document.OutputSettings.Syntax.html);

        String html = attrs.html();
        assertTrue(html.contains("checked"));
        assertTrue(html.contains("disabled"));
        assertTrue(html.contains("class=\"foo\""));

        // ทดสอบ syntax เป็น xml จะไม่ยุบ
        out.syntax(Document.OutputSettings.Syntax.xml);
        StringBuilder sb = new StringBuilder();
        try {
            attrs.html(sb, out);
        } catch (Exception e) {
            fail(e.getMessage());
        }
        assertTrue(sb.toString().contains("checked=\"\""));
    }

    @Test
    public void testEqualsAndHashCode() {
        Attributes a1 = new Attributes();
        a1.put("k", "v");

        Attributes a2 = new Attributes();
        a2.put("k", "v");

        Attributes a3 = new Attributes();
        a3.put("k", "other");

        assertEquals(a1, a1);
        assertEquals(a1, a2);
        assertEquals(a1.hashCode(), a2.hashCode());
        assertNotEquals(a1, a3);
        assertNotEquals(a1, null);
        assertNotEquals(a1, "string-obj");

        Attributes a4 = new Attributes();
        a4.put("k1", "v");
        assertNotEquals(a1, a4);
    }

    @Test
    public void testClone() {
        Attributes attrs = new Attributes();
        attrs.put("key1", "val1");

        Attributes clone = attrs.clone();
        assertEquals(attrs, clone);
        assertNotSame(attrs.keys, clone.keys);
        assertNotSame(attrs.vals, clone.vals);
    }

    @Test
    public void testNormalize() {
        Attributes attrs = new Attributes();
        attrs.put("TEST-Key", "Value");
        attrs.normalize();

        assertEquals("Value", attrs.get("test-key"));
        assertFalse(attrs.hasKey("TEST-Key"));
    }

    @Test
    public void testDataset() {
        Attributes attrs = new Attributes();
        attrs.put("data-foo", "bar");
        attrs.put("normal", "val");

        Map<String, String> dataset = attrs.dataset();
        assertEquals(1, dataset.size());
        assertEquals("bar", dataset.get("foo"));

        dataset.put("baz", "qux");
        assertEquals("qux", attrs.get("data-baz"));
        assertEquals("bar", dataset.put("foo", "newbar"));
        assertEquals("newbar", attrs.get("data-foo"));

        // Test entrySet size & iteration & remove via dataset iterator
        Set<Map.Entry<String, String>> entries = dataset.entrySet();
        assertEquals(2, entries.size());

        Iterator<Map.Entry<String, String>> it = entries.iterator();
        while(it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            if (entry.getKey().equals("foo")) {
                it.remove();
            }
        }
        assertFalse(attrs.hasKey("data-foo"));
    }
}