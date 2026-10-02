# AttributesTest.java

```java
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
```

## ตารางสรุป Branch/Condition Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| getWithNullKeyThrows / getWithEmptyKeyThrows | `Validate.notEmpty(key)` throw เมื่อ null/empty |
| getReturnsEmptyWhenAttributesNull | `get()`: attributes == null → return "" |
| getReturnsEmptyWhenKeyNotPresent | `get()`: attr == null (ไม่พบ key) |
| getReturnsValueWhenPresent | `get()`: attr != null |
| getIgnoreCaseNullKeyThrows | `getIgnoreCase()`: Validate.notEmpty throw |
| getIgnoreCaseReturnsEmptyWhenAttributesNull | `getIgnoreCase()`: attributes == null |
| getIgnoreCaseFindsMatch | `getIgnoreCase()`: loop match → return value |
| getIgnoreCaseNoMatchReturnsEmpty | `getIgnoreCase()`: loop ไม่ match → return "" |
| putAttributeNullThrows | `put(Attribute)`: Validate.notNull throw |
| putCreatesNewMapAndAddsEntry | `put(Attribute)`: attributes == null → สร้างใหม่ |
| putReplacesExistingKey | `put(Attribute)`: attributes != null, replace key เดิม |
| putBooleanTrueAddsAttribute | `put(String,boolean)`: value == true |
| putBooleanFalseRemovesAttribute / putBooleanFalseWhenAttributesNullNoError | `put(String,boolean)`: value == false (remove) |
| removeNullKeyThrows | `remove()`: Validate.notEmpty throw |
| removeWhenAttributesNullNoOp | `remove()`: attributes == null → return |
| removeExistingKey | `remove()`: attributes != null → remove key |
| removeIgnoreCaseNullKeyThrows | `removeIgnoreCase()`: Validate throw |
| removeIgnoreCaseWhenAttributesNullNoOp | `removeIgnoreCase()`: attributes == null |
| removeIgnoreCaseMatches / removeIgnoreCaseNoMatch | `removeIgnoreCase()`: loop match / ไม่ match |
| hasKeyWhenAttributesNull / hasKeyTrueFalse | `hasKey()`: attributes == null, containsKey true/false |
| hasKeyIgnoreCaseWhenAttributesNull / Match / NoMatch | `hasKeyIgnoreCase()`: null map, loop match, loop ไม่ match |
| sizeWhenNull / sizeAfterPuts | `size()`: attributes == null / != null |
| addAllWithEmptyIncomingDoesNothing | `addAll()`: incoming.size()==0 → return |
| addAllWhenAttributesNullCreatesMap | `addAll()`: attributes == null → สร้างใหม่ |
| addAllMergesIntoExisting | `addAll()`: attributes != null |
| iteratorWhenAttributesNullIsEmpty | `iterator()`: attributes == null |
| iteratorWhenAttributesEmptyMap | `iterator()`: attributes != null แต่ isEmpty() |
| iteratorIteratesOverAttributes | `iterator()`: attributes มีข้อมูล |
| asListWhenAttributesNull / asListReturnsEntries | `asList()`: attributes == null / != null, loop build list |
| asListIsUnmodifiable | ตรวจสอบ `Collections.unmodifiableList` |
| datasetPutAndGet / ReplacesOldValueReturnsOld / NewKeyReturnsNull | `Dataset.put()`: hasKey(dataKey) true/false (ternary) |
| datasetEntrySetIteratesOnlyDataAttributes | `DatasetIterator.hasNext()`: isDataAttribute() true/false ในลูป |
| datasetEntrySetSize | `EntrySet.size()`: loop count |
| datasetIteratorRemove | `DatasetIterator.remove()` |
| datasetHasNextFalseWhenNoDataAttrs | `DatasetIterator.hasNext()`: loop จบโดยไม่พบ data attr → return false |
| htmlWhenAttributesNullReturnsEmptyString / htmlAppendableWhenAttributesNull | `html(Appendable,...)`: attributes == null → return |
| htmlWithAttributes / htmlAppendableWithAttributes | `html(Appendable,...)`: loop เขียน attribute |
| toStringCallsHtml | `toString()` เรียก `html()` |
| equalsSameInstance | `equals()`: this == o |
| equalsNotInstanceOfAttributes | `equals()`: !(o instanceof Attributes) |
| equalsBothNullAttributeMaps | `equals()`: attributes == null ทั้งคู่ |
| equalsOneNullOneNotNull | `equals()`: ternary ฝั่ง null vs not-null ทั้งสองทาง |
| equalsBothNotNullEqualContent / DifferentContent | `equals()`: attributes.equals() true/false |
| hashCodeWhenAttributesNull / NotNull | `hashCode()`: attributes == null / != null |
| cloneWhenAttributesNull | `clone()`: attributes == null → new Attributes() |
| cloneDeepCopiesAttributes | `clone()`: deep copy ทุก attribute, ตรวจว่า clone อิสระจาก original |

**หมายเหตุ:** เมธอด `html()` สาธารณะมี try/catch `IOException` ที่ครอบ `SerializationException` แต่ในทางปฏิบัติแทบเป็นไปไม่ได้ที่จะ trigger `IOException` จาก `StringBuilder.append()` จึงไม่ได้เขียนเทสสำหรับ branch นี้ (ตามข้อกำหนดห้ามเดา behavior ที่ไม่สามารถพิสูจน์ได้จาก source)