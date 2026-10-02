package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Unit tests for org.jsoup.nodes.Attributes
 * (Defects4J: Jsoup-57b)
 *
 * หมายเหตุ: ใช้ Validate.notEmpty / Validate.notNull ของ jsoup ซึ่งจะ throw
 * IllegalArgumentException เมื่อ argument เป็น null หรือ empty string
 * (พฤติกรรมนี้อ้างอิงจาก org.jsoup.helper.Validate มาตรฐานของ jsoup,
 * ไม่ได้ปรากฏใน source ที่ให้มาโดยตรง แต่เป็น behavior ที่ทราบแน่ชัด)
 */
public class AttributesTest {

    private Attributes attrs;

    @Before
    public void setUp() {
        attrs = new Attributes();
    }

    // ---------------- get(String) ----------------
    @Test(expected = IllegalArgumentException.class)
    public void getWithNullKeyThrows() {
        attrs.get(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getWithEmptyKeyThrows() {
        attrs.get("");
    }

    @Test
    public void getReturnsEmptyWhenAttributesNull() {
        assertEquals("", attrs.get("foo"));
    }

    @Test
    public void getReturnsEmptyWhenKeyNotPresent() {
        attrs.put("foo", "bar");
        assertEquals("", attrs.get("baz"));
    }

    @Test
    public void getReturnsValueWhenPresent() {
        attrs.put("foo", "bar");
        assertEquals("bar", attrs.get("foo"));
    }

    // ---------------- getIgnoreCase(String) ----------------
    @Test(expected = IllegalArgumentException.class)
    public void getIgnoreCaseNullKeyThrows() {
        attrs.getIgnoreCase(null);
    }

    @Test
    public void getIgnoreCaseReturnsEmptyWhenAttributesNull() {
        assertEquals("", attrs.getIgnoreCase("foo"));
    }

    @Test
    public void getIgnoreCaseFindsMatch() {
        attrs.put("Foo", "bar");
        assertEquals("bar", attrs.getIgnoreCase("foo"));
    }

    @Test
    public void getIgnoreCaseNoMatchReturnsEmpty() {
        attrs.put("foo", "bar");
        assertEquals("", attrs.getIgnoreCase("baz"));
    }

    // ---------------- put(String,String) / put(Attribute) ----------------
    @Test(expected = IllegalArgumentException.class)
    public void putAttributeNullThrows() {
        attrs.put((Attribute) null);
    }

    @Test
    public void putCreatesNewMapAndAddsEntry() {
        assertEquals(0, attrs.size());
        attrs.put("foo", "bar");
        assertEquals(1, attrs.size());
        assertEquals("bar", attrs.get("foo"));
    }

    @Test
    public void putReplacesExistingKey() {
        attrs.put("foo", "bar");
        attrs.put("foo", "baz");
        assertEquals(1, attrs.size());
        assertEquals("baz", attrs.get("foo"));
    }

    // ---------------- put(String, boolean) ----------------
    @Test
    public void putBooleanTrueAddsAttribute() {
        attrs.put("disabled", true);
        assertTrue(attrs.hasKey("disabled"));
    }

    @Test
    public void putBooleanFalseRemovesAttribute() {
        attrs.put("disabled", true);
        attrs.put("disabled", false);
        assertFalse(attrs.hasKey("disabled"));
    }

    @Test
    public void putBooleanFalseWhenAttributesNullNoError() {
        attrs.put("disabled", false); // attributes map is still null -> remove() no-op branch
        assertEquals(0, attrs.size());
    }

    // ---------------- remove(String) ----------------
    @Test(expected = IllegalArgumentException.class)
    public void removeNullKeyThrows() {
        attrs.remove(null);
    }

    @Test
    public void removeWhenAttributesNullNoOp() {
        attrs.remove("foo");
        assertEquals(0, attrs.size());
    }

    @Test
    public void removeExistingKey() {
        attrs.put("foo", "bar");
        attrs.remove("foo");
        assertFalse(attrs.hasKey("foo"));
    }

    // ---------------- removeIgnoreCase(String) ----------------
    @Test(expected = IllegalArgumentException.class)
    public void removeIgnoreCaseNullKeyThrows() {
        attrs.removeIgnoreCase(null);
    }

    @Test
    public void removeIgnoreCaseWhenAttributesNullNoOp() {
        attrs.removeIgnoreCase("foo");
        assertEquals(0, attrs.size());
    }

    @Test
    public void removeIgnoreCaseMatches() {
        attrs.put("Foo", "bar");
        attrs.removeIgnoreCase("foo");
        assertFalse(attrs.hasKey("Foo"));
    }

    @Test
    public void removeIgnoreCaseNoMatch() {
        attrs.put("foo", "bar");
        attrs.removeIgnoreCase("baz");
        assertTrue(attrs.hasKey("foo"));
    }

    // ---------------- hasKey(String) ----------------
    @Test
    public void hasKeyWhenAttributesNull() {
        assertFalse(attrs.hasKey("foo"));
    }

    @Test
    public void hasKeyTrueFalse() {
        attrs.put("foo", "bar");
        assertTrue(attrs.hasKey("foo"));
        assertFalse(attrs.hasKey("baz"));
    }

    // ---------------- hasKeyIgnoreCase(String) ----------------
    @Test
    public void hasKeyIgnoreCaseWhenAttributesNull() {
        assertFalse(attrs.hasKeyIgnoreCase("foo"));
    }

    @Test
    public void hasKeyIgnoreCaseMatch() {
        attrs.put("Foo", "bar");
        assertTrue(attrs.hasKeyIgnoreCase("foo"));
    }

    @Test
    public void hasKeyIgnoreCaseNoMatch() {
        attrs.put("foo", "bar");
        assertFalse(attrs.hasKeyIgnoreCase("baz"));
    }

    // ---------------- size() ----------------
    @Test
    public void sizeWhenNull() {
        assertEquals(0, attrs.size());
    }

    @Test
    public void sizeAfterPuts() {
        attrs.put("a", "1");
        attrs.put("b", "2");
        assertEquals(2, attrs.size());
    }

    // ---------------- addAll(Attributes) ----------------
    @Test
    public void addAllWithEmptyIncomingDoesNothing() {
        Attributes incoming = new Attributes();
        attrs.put("a", "1");
        attrs.addAll(incoming);
        assertEquals(1, attrs.size());
    }

    @Test
    public void addAllWhenAttributesNullCreatesMap() {
        Attributes incoming = new Attributes();
        incoming.put("x", "y");
        attrs.addAll(incoming);
        assertEquals(1, attrs.size());
        assertEquals("y", attrs.get("x"));
    }

    @Test
    public void addAllMergesIntoExisting() {
        attrs.put("a", "1");
        Attributes incoming = new Attributes();
        incoming.put("b", "2");
        attrs.addAll(incoming);
        assertEquals(2, attrs.size());
    }

    // ---------------- iterator() ----------------
    @Test
    public void iteratorWhenAttributesNullIsEmpty() {
        Iterator<Attribute> it = attrs.iterator();
        assertFalse(it.hasNext());
    }

    @Test
    public void iteratorWhenAttributesEmptyMap() {
        // attributes != null แต่ isEmpty() == true (หลังจาก put แล้ว remove)
        attrs.put("a", "1");
        attrs.remove("a");
        Iterator<Attribute> it = attrs.iterator();
        assertFalse(it.hasNext());
    }

    @Test
    public void iteratorIteratesOverAttributes() {
        attrs.put("a", "1");
        attrs.put("b", "2");
        Iterator<Attribute> it = attrs.iterator();
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(2, count);
    }

    // ---------------- asList() ----------------
    @Test
    public void asListWhenAttributesNull() {
        List<Attribute> list = attrs.asList();
        assertTrue(list.isEmpty());
    }

    @Test
    public void asListReturnsEntries() {
        attrs.put("a", "1");
        attrs.put("b", "2");
        List<Attribute> list = attrs.asList();
        assertEquals(2, list.size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void asListIsUnmodifiable() {
        attrs.put("a", "1");
        List<Attribute> list = attrs.asList();
        list.add(new Attribute("b", "2"));
    }

    // ---------------- dataset() ----------------
    @Test
    public void datasetPutAndGet() {
        Map<String, String> dataset = attrs.dataset();
        dataset.put("foo", "bar");
        assertEquals("bar", attrs.get("data-foo"));
    }

    @Test
    public void datasetPutReplacesOldValueReturnsOld() {
        Map<String, String> dataset = attrs.dataset();
        dataset.put("foo", "bar");
        String old = dataset.put("foo", "baz");
        assertEquals("bar", old);
    }

    @Test
    public void datasetPutNewKeyReturnsNull() {
        Map<String, String> dataset = attrs.dataset();
        String old = dataset.put("foo", "bar");
        assertNull(old);
    }

    @Test
    public void datasetEntrySetIteratesOnlyDataAttributes() {
        attrs.put("foo", "bar"); // ไม่ใช่ data attribute
        Map<String, String> dataset = attrs.dataset();
        dataset.put("baz", "qux"); // จะถูกเก็บเป็น data-baz
        int count = 0;
        for (Map.Entry<String, String> e : dataset.entrySet()) {
            count++;
            assertEquals("baz", e.getKey());
            assertEquals("qux", e.getValue());
        }
        assertEquals(1, count);
    }

    @Test
    public void datasetEntrySetSize() {
        attrs.put("foo", "bar");
        Map<String, String> dataset = attrs.dataset();
        dataset.put("a", "1");
        dataset.put("b", "2");
        assertEquals(2, dataset.entrySet().size());
    }

    @Test
    public void datasetIteratorRemove() {
        Map<String, String> dataset = attrs.dataset();
        dataset.put("foo", "bar");
        Iterator<Map.Entry<String, String>> it = dataset.entrySet().iterator();
        assertTrue(it.hasNext());
        it.next();
        it.remove();
        assertFalse(attrs.hasKey("data-foo"));
    }

    @Test
    public void datasetHasNextFalseWhenNoDataAttrs() {
        attrs.put("foo", "bar"); // ไม่ใช่ data attribute เลย
        Map<String, String> dataset = attrs.dataset();
        Iterator<Map.Entry<String, String>> it = dataset.entrySet().iterator();
        assertFalse(it.hasNext());
    }

    // ---------------- html() / html(Appendable,...) ----------------
    @Test
    public void htmlWhenAttributesNullReturnsEmptyString() {
        assertEquals("", attrs.html());
    }

    @Test
    public void htmlWithAttributes() {
        attrs.put("foo", "bar");
        String html = attrs.html();
        assertTrue(html.contains("foo"));
        assertTrue(html.contains("bar"));
    }

    @Test
    public void htmlAppendableWhenAttributesNull() throws IOException {
        StringBuilder sb = new StringBuilder();
        attrs.html(sb, new Document("").outputSettings());
        assertEquals("", sb.toString());
    }

    @Test
    public void htmlAppendableWithAttributes() throws IOException {
        attrs.put("foo", "bar");
        StringBuilder sb = new StringBuilder();
        attrs.html(sb, new Document("").outputSettings());
        assertTrue(sb.toString().contains("foo"));
    }

    // ---------------- toString() ----------------
    @Test
    public void toStringCallsHtml() {
        attrs.put("foo", "bar");
        assertEquals(attrs.html(), attrs.toString());
    }

    // ---------------- equals() ----------------
    @Test
    public void equalsSameInstance() {
        assertTrue(attrs.equals(attrs));
    }

    @Test
    public void equalsNotInstanceOfAttributes() {
        assertFalse(attrs.equals("not attributes"));
    }

    @Test
    public void equalsBothNullAttributeMaps() {
        Attributes other = new Attributes();
        assertTrue(attrs.equals(other));
    }

    @Test
    public void equalsOneNullOneNotNull() {
        Attributes other = new Attributes();
        other.put("foo", "bar");
        assertFalse(attrs.equals(other));
        assertFalse(other.equals(attrs));
    }

    @Test
    public void equalsBothNotNullEqualContent() {
        attrs.put("foo", "bar");
        Attributes other = new Attributes();
        other.put("foo", "bar");
        assertTrue(attrs.equals(other));
    }

    @Test
    public void equalsBothNotNullDifferentContent() {
        attrs.put("foo", "bar");
        Attributes other = new Attributes();
        other.put("foo", "baz");
        assertFalse(attrs.equals(other));
    }

    // ---------------- hashCode() ----------------
    @Test
    public void hashCodeWhenAttributesNull() {
        assertEquals(0, attrs.hashCode());
    }

    @Test
    public void hashCodeWhenAttributesNotNull() {
        attrs.put("foo", "bar");
        assertNotEquals(0, attrs.hashCode());
    }

    // ---------------- clone() ----------------
    @Test
    public void cloneWhenAttributesNull() {
        Attributes clone = attrs.clone();
        assertNotNull(clone);
        assertNotSame(attrs, clone);
        assertEquals(0, clone.size());
    }

    @Test
    public void cloneDeepCopiesAttributes() {
        attrs.put("foo", "bar");
        Attributes clone = attrs.clone();
        assertEquals(attrs, clone);
        clone.put("foo", "changed");
        assertEquals("bar", attrs.get("foo")); // original ไม่ถูกกระทบ
        assertEquals("changed", clone.get("foo"));
    }
}
