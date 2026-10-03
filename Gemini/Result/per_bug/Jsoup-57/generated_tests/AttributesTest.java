package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.SerializationException;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class AttributesTest {

    @Test
    public void testGet_NullAttributes() {
        Attributes attrs = new Attributes();
        assertEquals("", attrs.get("test"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGet_EmptyKey() {
        Attributes attrs = new Attributes();
        attrs.get("");
    }

    @Test
    public void testGet_ExistingAndNonExisting() {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        assertEquals("value1", attrs.get("key1"));
        assertEquals("", attrs.get("nonexistent"));
    }

    @Test
    public void testGetIgnoreCase() {
        Attributes attrs = new Attributes();
        attrs.put("TestKey", "val");
        assertEquals("val", attrs.getIgnoreCase("testkey"));
        assertEquals("val", attrs.getIgnoreCase("TESTKEY"));
        assertEquals("", attrs.getIgnoreCase("notfound"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetIgnoreCase_EmptyKey() {
        Attributes attrs = new Attributes();
        attrs.getIgnoreCase("");
    }

    @Test
    public void testPutBoolean() {
        Attributes attrs = new Attributes();
        attrs.put("boolTrue", true);
        assertTrue(attrs.hasKey("boolTrue"));

        attrs.put("boolTrue", false);
        assertFalse(attrs.hasKey("boolTrue"));
    }

    @Test
    public void testRemove() {
        Attributes attrs = new Attributes();
        attrs.remove("nonexistent"); // attributes is null branch

        attrs.put("k", "v");
        attrs.remove("k");
        assertFalse(attrs.hasKey("k"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemove_EmptyKey() {
        Attributes attrs = new Attributes();
        attrs.remove("");
    }

    @Test
    public void testRemoveIgnoreCase() {
        Attributes attrs = new Attributes();
        attrs.removeIgnoreCase("none"); // attributes is null branch

        attrs.put("MyKey", "val");
        attrs.removeIgnoreCase("mykey");
        assertFalse(attrs.hasKey("MyKey"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveIgnoreCase_EmptyKey() {
        Attributes attrs = new Attributes();
        attrs.removeIgnoreCase("");
    }

    @Test
    public void testHasKeyIgnoreCase() {
        Attributes attrs = new Attributes();
        assertFalse(attrs.hasKeyIgnoreCase("any"));

        attrs.put("Target", "v");
        assertTrue(attrs.hasKeyIgnoreCase("target"));
        assertFalse(attrs.hasKeyIgnoreCase("other"));
    }

    @Test
    public void testSize() {
        Attributes attrs = new Attributes();
        assertEquals(0, attrs.size());

        attrs.put("a", "1");
        assertEquals(1, attrs.size());
    }

    @Test
    public void testAddAll() {
        Attributes source = new Attributes();
        // incoming size == 0 branch
        Attributes target = new Attributes();
        target.addAll(source);
        assertEquals(0, target.size());

        source.put("a", "1");
        target.addAll(source); // attributes == null in target branch
        assertEquals(1, target.size());
        assertEquals("1", target.get("a"));
    }

    @Test
    public void testIterator() {
        Attributes attrs = new Attributes();
        assertFalse(attrs.iterator().hasNext());

        attrs.put("a", "1");
        Iterator<Attribute> it = attrs.iterator();
        assertTrue(it.hasNext());
        assertEquals("a", it.next().getKey());
    }

    @Test
    public void testAsList() {
        Attributes attrs = new Attributes();
        List<Attribute> list = attrs.asList();
        assertTrue(list.isEmpty());

        attrs.put("a", "1");
        list = attrs.asList();
        assertEquals(1, list.size());
        assertEquals("a", list.get(0).getKey());
    }

    @Test
    public void testHtmlAndToString() {
        Attributes attrs = new Attributes();
        assertEquals("", attrs.html());
        assertEquals("", attrs.toString());

        attrs.put("foo", "bar");
        assertEquals(" foo=\"bar\"", attrs.html());
        assertEquals(" foo=\"bar\"", attrs.toString());
    }

    @Test
    public void testEqualsAndHashCode() {
        Attributes a1 = new Attributes();
        Attributes a2 = new Attributes();

        assertEquals(a1, a1);
        assertNotEquals(a1, "someString");
        assertEquals(a1, a2);
        assertEquals(a1.hashCode(), a2.hashCode());

        a1.put("k", "v");
        assertNotEquals(a1, a2);

        a2.put("k", "v");
        assertEquals(a1, a2);
        assertEquals(a1.hashCode(), a2.hashCode());

        // attributes != null vs null branch
        Attributes a3 = new Attributes();
        a3.attributes = null; // direct test if package-private or structure allows, or via normal flow
        assertNotEquals(a1, a3);
        assertEquals(0, a3.hashCode());
    }

    @Test
    public void testClone() {
        Attributes attrs = new Attributes();
        Attributes cloneNull = attrs.clone();
        assertNotNull(cloneNull);

        attrs.put("key", "val");
        Attributes cloneFull = attrs.clone();
        assertEquals(attrs, cloneFull);
        assertNotSame(attrs, cloneFull);
    }

    @Test
    public void testDataset() {
        Attributes attrs = new Attributes();
        Map<String, String> dataset = attrs.dataset();
        
        dataset.put("name", "jsoup");
        assertEquals("jsoup", attrs.get("data-name"));
        assertEquals("jsoup", dataset.get("name"));
        
        // Add non-data attribute to test iterator filtering
        attrs.put("normal", "val");
        
        assertEquals(1, dataset.size());
        
        Iterator<Map.Entry<String, String>> it = dataset.entrySet().iterator();
        assertTrue(it.hasNext());
        Map.Entry<String, EntryTestDummy> entry = (Map.Entry) it.next();
        assertEquals("name", entry.getKey());
        
        it.remove();
        assertFalse(attrs.hasKey("data-name"));
    }
    
    // Dummy class just to satisfy casting cleanly if needed in test
    private static class EntryTestDummy {}
}