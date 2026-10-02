# AttributesTest.java

```java
package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * JUnit4 tests for org.jsoup.nodes.Attributes (Defects4J: Jsoup-75b)
 * Test class is placed in the same package (org.jsoup.nodes) to be able to
 * access package-private members (keys, vals, indexOfKey, putIgnoreCase, html(Appendable,...)).
 */
public class AttributesTest {

    // ---------- get / getIgnoreCase ----------

    @Test
    public void testGet_NotFound_ReturnsEmptyString() {
        Attributes attrs = new Attributes();
        assertEquals("", attrs.get("missing"));
    }

    @Test
    public void testGet_Found_ReturnsValue() {
        Attributes attrs = new Attributes();
        attrs.put("class", "foo");
        assertEquals("foo", attrs.get("class"));
    }

    @Test
    public void testGet_FoundButNullValue_ReturnsEmptyString() {
        // boolean attribute stored with null value -> checkNotNull converts to ""
        Attributes attrs = new Attributes();
        attrs.put("checked", true);
        assertEquals("", attrs.get("checked"));
    }

    @Test
    public void testGetIgnoreCase_NotFound() {
        Attributes attrs = new Attributes();
        assertEquals("", attrs.getIgnoreCase("Missing"));
    }

    @Test
    public void testGetIgnoreCase_Found_DifferentCase() {
        Attributes attrs = new Attributes();
        attrs.put("Class", "foo");
        assertEquals("foo", attrs.getIgnoreCase("class"));
    }

    // ---------- checkNotNull ----------

    @Test
    public void testCheckNotNull_Null() {
        assertEquals("", Attributes.checkNotNull(null));
    }

    @Test
    public void testCheckNotNull_NotNull() {
        assertEquals("abc", Attributes.checkNotNull("abc"));
    }

    // ---------- indexOfKey (package-private) ----------

    @Test
    public void testIndexOfKey_Found() {
        Attributes attrs = new Attributes();
        attrs.put("a", "1");
        attrs.put("b", "2");
        assertEquals(1, attrs.indexOfKey("b"));
    }

    @Test
    public void testIndexOfKey_NotFound() {
        Attributes attrs = new Attributes();
        attrs.put("a", "1");
        assertEquals(Attributes.NotFound, attrs.indexOfKey("zzz"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIndexOfKey_NullKeyThrows() {
        Attributes attrs = new Attributes();
        attrs.indexOfKey(null);
    }

    // ---------- put(String,String) ----------

    @Test
    public void testPut_NewKey() {
        Attributes attrs = new Attributes();
        attrs.put("a", "1");
        assertEquals(1, attrs.size());
        assertEquals("1", attrs.get("a"));
    }

    @Test
    public void testPut_ExistingKey_Overwrites() {
        Attributes attrs = new Attributes();
        attrs.put("a", "1");
        attrs.put("a", "2");
        assertEquals(1, attrs.size());
        assertEquals("2", attrs.get("a"));
    }

    // ---------- putIgnoreCase ----------

    @Test
    public void testPutIgnoreCase_NewKey() {
        Attributes attrs = new Attributes();
        attrs.putIgnoreCase("a", "1");
        assertEquals("1", attrs.get("a"));
    }

    @Test
    public void testPutIgnoreCase_ExistingKeySameCase_NoKeyChange() {
        Attributes attrs = new Attributes();
        attrs.put("a", "1");
        attrs.putIgnoreCase("a", "2");
        assertEquals("a", attrs.keys[0]);
        assertEquals("2", attrs.vals[0]);
    }

    @Test
    public void testPutIgnoreCase_ExistingKeyDifferentCase_KeyUpdated() {
        Attributes attrs = new Attributes();
        attrs.put("A", "1");
        attrs.putIgnoreCase("a", "2"); // case differs -> key should be updated to "a"
        assertEquals("a", attrs.keys[0]);
        assertEquals("2", attrs.vals[0]);
        assertEquals(1, attrs.size());
    }

    // ---------- put(String, boolean) ----------

    @Test
    public void testPutBoolean_True_AddsKeyWithNullValue() {
        Attributes attrs = new Attributes();
        attrs.put("checked", true);
        assertTrue(attrs.hasKeyIgnoreCase("checked"));
        assertEquals("", attrs.get("checked")); // null internally, exposed as ""
    }

    @Test
    public void testPutBoolean_False_RemovesKey() {
        Attributes attrs = new Attributes();
        attrs.put("checked", "checked");
        attrs.put("checked", false);
        assertFalse(attrs.hasKey("checked"));
        assertEquals(0, attrs.size());
    }

    @Test
    public void testPutBoolean_False_NonExistingKey_NoOp() {
        Attributes attrs = new Attributes();
        attrs.put("checked", false); // key doesn't exist, remove() should just no-op
        assertEquals(0, attrs.size());
    }

    // ---------- put(Attribute) ----------

    @Test
    public void testPutAttribute_SetsParent() {
        Attributes attrs = new Attributes();
        Attribute attribute = new Attribute("key", "value");
        attrs.put(attribute);
        assertEquals("value", attrs.get("key"));
        assertSame(attrs, attribute.parent);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPutAttribute_NullThrows() {
        Attributes attrs = new Attributes();
        attrs.put((Attribute) null);
    }

    // ---------- remove(String) / removeIgnoreCase ----------

    @Test
    public void testRemoveString_Found() {
        Attributes attrs = new Attributes();
        attrs.put("a", "1");
        attrs.remove("a");
        assertFalse(attrs.hasKey("a"));
        assertEquals(0, attrs.size());
    }

    @Test
    public void testRemoveString_NotFound_NoOp() {
        Attributes attrs = new Attributes();
        attrs.put("a", "1");
        attrs.remove("zzz");
        assertEquals(1, attrs.size());
    }

    @Test
    public void testRemoveIgnoreCase_Found() {
        Attributes attrs = new Attributes();
        attrs.put("A", "1");
        attrs.removeIgnoreCase("a");
        assertEquals(0, attrs.size());
    }

    @Test
    public void testRemoveIgnoreCase_NotFound_NoOp() {
        Attributes attrs = new Attributes();
        attrs.put("A", "1");
        attrs.removeIgnoreCase("zzz");
        assertEquals(1, attrs.size());
    }

    @Test
    public void testRemoveIndex_WithShift() {
        // removing a non-last element triggers the "shifted > 0" branch
        Attributes attrs = new Attributes();
        attrs.put("a", "1");
        attrs.put("b", "2");
        attrs.put("c", "3");
        attrs.remove("a"); // index 0, shifted = 2
        assertEquals(2, attrs.size());
        assertEquals("b", attrs.keys[0]);
        assertEquals("c", attrs.keys[1]);
    }

    @Test
    public void testRemoveIndex_NoShift_LastElement() {
        // removing the last element -> shifted == 0 branch
        Attributes attrs = new Attributes();
        attrs.put("a", "1");
        attrs.put("b", "2");
        attrs.remove("b"); // last index, shifted = 0
        assertEquals(1, attrs.size());
        assertEquals("a", attrs.keys[0]);
    }

    // ---------- hasKey / hasKeyIgnoreCase ----------

    @Test
    public void testHasKey_TrueFalse() {
        Attributes attrs = new Attributes();
        attrs.put("a", "1");
        assertTrue(attrs.hasKey("a"));
        assertFalse(attrs.hasKey("b"));
    }

    @Test
    public void testHasKeyIgnoreCase_TrueFalse() {
        Attributes attrs = new Attributes();
        attrs.put("A", "1");
        assertTrue(attrs.hasKeyIgnoreCase("a"));
        assertFalse(attrs.hasKeyIgnoreCase("zzz"));
    }

    // ---------- size ----------

    @Test
    public void testSize_EmptyAndNonEmpty() {
        Attributes attrs = new Attributes();
        assertEquals(0, attrs.size());
        attrs.put("a", "1");
        assertEquals(1, attrs.size());
    }

    // ---------- addAll ----------

    @Test
    public void testAddAll_EmptyIncoming_NoOp() {
        Attributes target = new Attributes();
        target.put("a", "1");
        Attributes incoming = new Attributes();
        target.addAll(incoming);
        assertEquals(1, target.size());
    }

    @Test
    public void testAddAll_NonEmptyIncoming_MergesAndOverwrites() {
        Attributes target = new Attributes();
        target.put("a", "1");
        Attributes incoming = new Attributes();
        incoming.put("a", "overwritten"); // existing key -> exercises put() overwrite path inside addAll loop
        incoming.put("b", "2");
        target.addAll(incoming);
        assertEquals(2, target.size());
        assertEquals("overwritten", target.get("a"));
        assertEquals("2", target.get("b"));
    }

    @Test
    public void testAddAll_TriggersMinNewSizeGreaterThanNewSize_Branch() {
        // fresh attrs: keys.length = 0. incoming has 5 attrs.
        // checkCapacity(5): curSize=0 (<4) -> newSize=InitialCapacity(4);
        // minNewSize(5) > newSize(4) -> newSize = 5  (exercises that specific branch)
        Attributes target = new Attributes();
        Attributes incoming = new Attributes();
        for (int i = 0; i < 5; i++) {
            incoming.put("k" + i, "v" + i);
        }
        target.addAll(incoming);
        assertEquals(5, target.size());
        assertEquals(5, target.keys.length);
    }

    // ---------- checkCapacity growth (via repeated put) ----------

    @Test
    public void testCheckCapacity_GrowthFactorBranch() {
        Attributes attrs = new Attributes();
        for (int i = 0; i < 4; i++) {
            attrs.put("k" + i, "v" + i);
        }
        assertEquals(4, attrs.keys.length); // InitialCapacity reached, curSize==minNewSize so no growth yet

        attrs.put("k4", "v4"); // 5th insert: curSize(4) >= InitialCapacity(4) -> newSize = size*GrowthFactor = 8
        assertEquals(8, attrs.keys.length);
        assertEquals(5, attrs.size());
    }

    // ---------- iterator ----------

    @Test
    public void testIterator_HasNextAndNext() {
        Attributes attrs = new Attributes();
        attrs.put("a", "1");
        attrs.put("b", "2");
        Iterator<Attribute> it = attrs.iterator();
        assertTrue(it.hasNext());
        Attribute first = it.next();
        assertEquals("a", first.getKey());
        assertTrue(it.hasNext());
        Attribute second = it.next();
        assertEquals("b", second.getKey());
        assertFalse(it.hasNext());
    }

    @Test
    public void testIterator_Remove() {
        Attributes attrs = new Attributes();
        attrs.put("a", "1");
        attrs.put("b", "2");
        Iterator<Attribute> it = attrs.iterator();
        it.next(); // "a"
        it.remove();
        assertEquals(1, attrs.size());
        assertFalse(attrs.hasKey("a"));
        assertTrue(attrs.hasKey("b"));
    }

    // ---------- asList ----------

    @Test
    public void testAsList_NullValue_ReturnsBooleanAttribute() {
        Attributes attrs = new Attributes();
        attrs.put("checked", true); // stored value == null
        List<Attribute> list = attrs.asList();
        assertEquals(1, list.size());
        assertTrue(list.get(0) instanceof BooleanAttribute);
    }

    @Test
    public void testAsList_NonNullValue_ReturnsPlainAttribute() {
        Attributes attrs = new Attributes();
        attrs.put("class", "foo");
        List<Attribute> list = attrs.asList();
        assertEquals(1, list.size());
        assertFalse(list.get(0) instanceof BooleanAttribute);
        assertEquals("foo", list.get(0).getValue());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAsList_IsUnmodifiable() {
        Attributes attrs = new Attributes();
        attrs.put("a", "1");
        List<Attribute> list = attrs.asList();
        list.add(new Attribute("b", "2"));
    }

    // ---------- dataset ----------

    @Test
    public void testDataset_Put_NewKey_ReturnsNull() {
        Attributes attrs = new Attributes();
        Map<String, String> dataset = attrs.dataset();
        String old = dataset.put("foo", "1");
        assertNull(old);
        assertEquals("1", attrs.get("data-foo"));
    }

    @Test
    public void testDataset_Put_ExistingKey_ReturnsOldValue() {
        Attributes attrs = new Attributes();
        attrs.put("data-foo", "1");
        Map<String, String> dataset = attrs.dataset();
        String old = dataset.put("foo", "2");
        assertEquals("1", old);
        assertEquals("2", attrs.get("data-foo"));
    }

    @Test
    public void testDataset_FiltersOnlyDataAttributes() {
        Attributes attrs = new Attributes();
        attrs.put("data-foo", "1");
        attrs.put("class", "not-data");
        Map<String, String> dataset = attrs.dataset();
        assertEquals(1, dataset.size());
        assertTrue(dataset.containsKey("foo"));
        assertFalse(dataset.containsKey("class"));
    }

    @Test
    public void testDatasetEntrySet_SizeViaIteration() {
        Attributes attrs = new Attributes();
        attrs.put("data-a", "1");
        attrs.put("data-b", "2");
        attrs.put("notdata", "3");
        Map<String, String> dataset = attrs.dataset();
        assertEquals(2, dataset.entrySet().size());
    }

    @Test
    public void testDatasetIterator_Remove() {
        Attributes attrs = new Attributes();
        attrs.put("data-foo", "1");
        attrs.put("class", "x");
        Map<String, String> dataset = attrs.dataset();
        Iterator<Map.Entry<String, String>> it = dataset.entrySet().iterator();
        assertTrue(it.hasNext());
        Map.Entry<String, String> e = it.next();
        assertEquals("foo", e.getKey());
        it.remove();
        assertFalse(attrs.hasKey("data-foo"));
        assertTrue(attrs.hasKey("class"));
    }

    @Test
    public void testDatasetIterator_HasNext_NoDataAttributes() {
        Attributes attrs = new Attributes();
        attrs.put("class", "x");
        Map<String, String> dataset = attrs.dataset();
        Iterator<Map.Entry<String, String>> it = dataset.entrySet().iterator();
        assertFalse(it.hasNext());
    }

    // ---------- html() / html(Appendable, OutputSettings) ----------

    @Test
    public void testHtml_NormalAttribute_Quoted() {
        Attributes attrs = new Attributes();
        attrs.put("class", "foo");
        assertEquals(" class=\"foo\"", attrs.html());
    }

    @Test
    public void testHtml_BooleanAttribute_NullValue_CollapsedUnderHtmlSyntax() {
        Attributes attrs = new Attributes();
        attrs.put("checked", true); // value stored as null
        // default html() uses (new Document("")).outputSettings() -> default syntax html
        assertEquals(" checked", attrs.html());
    }

    @Test
    public void testHtml_ValueEqualsKeyAndIsBooleanAttribute_Collapsed() {
        Attributes attrs = new Attributes();
        attrs.put("checked", "checked"); // val.equals(key) && isBooleanAttribute(key)
        assertEquals(" checked", attrs.html());
    }

    @Test
    public void testHtml_ValueEqualsKeyButNotBooleanAttribute_NotCollapsed() {
        Attributes attrs = new Attributes();
        attrs.put("foo", "foo"); // val.equals(key) but "foo" is not a recognized boolean attribute
        assertEquals(" foo=\"foo\"", attrs.html());
    }

    @Test
    public void testHtml_XmlSyntax_NullValue_NotCollapsed() {
        Attributes attrs = new Attributes();
        attrs.put("checked", true); // value null
        Document.OutputSettings out = new Document.OutputSettings();
        out.syntax(Document.OutputSettings.Syntax.xml);
        StringBuilder sb = new StringBuilder();
        try {
            attrs.html(sb, out);
        } catch (java.io.IOException e) {
            fail("unexpected IOException");
        }
        // syntax != html -> condition false -> goes to quote-writing branch, null becomes ""
        assertEquals(" checked=\"\"", sb.toString());
    }

    // ---------- toString ----------

    @Test
    public void testToString_DelegatesToHtml() {
        Attributes attrs = new Attributes();
        attrs.put("class", "foo");
        assertEquals(attrs.html(), attrs.toString());
    }

    // ---------- equals ----------

    @Test
    public void testEquals_SameInstance() {
        Attributes attrs = new Attributes();
        attrs.put("a", "1");
        assertTrue(attrs.equals(attrs));
    }

    @Test
    public void testEquals_Null() {
        Attributes attrs = new Attributes();
        assertFalse(attrs.equals(null));
    }

    @Test
    public void testEquals_DifferentClass() {
        Attributes attrs = new Attributes();
        assertFalse(attrs.equals("not attributes"));
    }

    @Test
    public void testEquals_DifferentSize() {
        Attributes a1 = new Attributes();
        a1.put("a", "1");
        Attributes a2 = new Attributes();
        a2.put("a", "1");
        a2.put("b", "2");
        assertFalse(a1.equals(a2));
    }

    @Test
    public void testEquals_SameContent_IdenticalConstructionSequence() {
        // Built via identical operations so backing arrays end up the same length too,
        // since equals() compares raw backing arrays (including capacity), not just logical content.
        Attributes a1 = new Attributes();
        a1.put("a", "1");
        Attributes a2 = new Attributes();
        a2.put("a", "1");
        assertTrue(a1.equals(a2));
        assertEquals(a1.hashCode(), a2.hashCode());
    }

    @Test
    public void testEquals_DifferentValues() {
        Attributes a1 = new Attributes();
        a1.put("a", "1");
        Attributes a2 = new Attributes();
        a2.put("a", "2");
        assertFalse(a1.equals(a2));
    }

    // ---------- hashCode ----------

    @Test
    public void testHashCode_ConsistentAcrossCalls() {
        Attributes attrs = new Attributes();
        attrs.put("a", "1");
        int h1 = attrs.hashCode();
        int h2 = attrs.hashCode();
        assertEquals(h1, h2);
    }

    // ---------- clone() : known defect Jsoup-75b ----------

    @Test
    public void testClone_BasicIndependenceOfLogicalContent() {
        Attributes original = new Attributes();
        original.put("a", "1");
        original.put("b", "2");
        Attributes clone = original.clone();

        assertEquals(original.size(), clone.size());
        assertEquals(original.get("a"), clone.get("a"));
        assertEquals(original.get("b"), clone.get("b"));
    }

    @Test
    public void testClone_KnownDefect_SideEffectOnOriginalArrays() {
        // Defects4J Jsoup-75b: Attributes.clone() mistakenly reassigns the
        // unqualified fields `keys`/`vals` (i.e., `this.keys`/`this.vals`)
        // instead of `clone.keys`/`clone.vals`.
        // Expected (correct) behavior: calling clone() should NOT mutate the
        // original object's internal arrays at all.
        // Actual (buggy) behavior: the ORIGINAL object's backing arrays get
        // trimmed down to `size`, while the clone keeps the OLD, full-capacity
        // array reference.
        Attributes original = new Attributes();
        original.put("a", "1");
        original.put("b", "2");

        assertEquals(4, original.keys.length); // capacity after 2 puts (InitialCapacity)
        String[] originalArrayRefBeforeClone = original.keys;

        Attributes clone = original.clone();

        // BUG: original's array got shrunk as a side effect of cloning it.
        assertEquals("Known defect: clone() mutates original's keys array length",
                2, original.keys.length);

        // The clone ends up holding the OLD array object (captured by the shallow
        // super.clone() before the buggy reassignment happened on `this`).
        assertSame("Known defect: clone holds the OLD backing array reference",
                originalArrayRefBeforeClone, clone.keys);

        // Consequently original and clone no longer share the same array object.
        assertNotSame(original.keys, clone.keys);
    }

    // ---------- normalize ----------

    @Test
    public void testNormalize_LowercasesAllKeys() {
        Attributes attrs = new Attributes();
        attrs.put("Class", "foo");
        attrs.put("ID", "bar");
        attrs.normalize();
        assertEquals("class", attrs.keys[0]);
        assertEquals("id", attrs.keys[1]);
    }

    @Test
    public void testNormalize_EmptyAttributes_NoOp() {
        Attributes attrs = new Attributes();
        attrs.normalize(); // loop body never executes (size == 0)
        assertEquals(0, attrs.size());
    }
}
```

## สรุปตาราง Test coverage

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testGet_NotFound/_Found/_FoundButNullValue | `get()`: i==NotFound / found+non-null / found+null (checkNotNull) |
| testGetIgnoreCase_* | `getIgnoreCase()`: found/not found (case-insensitive) |
| testCheckNotNull_* | `checkNotNull()`: val==null / val!=null |
| testIndexOfKey_Found/_NotFound/_NullKeyThrows | `indexOfKey()`: loop match/no match, Validate.notNull throw |
| testPut_NewKey/_ExistingKey | `put(String,String)`: i==NotFound (add) / i!=NotFound (overwrite) |
| testPutIgnoreCase_* | `putIgnoreCase()`: not found(add) / found same-case / found different-case (key update if) |
| testPutBoolean_True/_False/_False_NonExisting | `put(String,boolean)`: value true→putIgnoreCase / false→remove (found & not found) |
| testPutAttribute_SetsParent/_NullThrows | `put(Attribute)`: normal path + Validate.notNull throw |
| testRemoveString_Found/_NotFound | `remove(String)`: found/not found |
| testRemoveIgnoreCase_Found/_NotFound | `removeIgnoreCase()`: found/not found |
| testRemoveIndex_WithShift/_NoShift | `remove(int)`: shifted>0 branch / shifted==0 branch |
| testHasKey_TrueFalse / testHasKeyIgnoreCase_TrueFalse | `hasKey()`/`hasKeyIgnoreCase()` true/false |
| testSize_EmptyAndNonEmpty | `size()` |
| testAddAll_EmptyIncoming/_NonEmptyIncoming/_TriggersBranch | `addAll()`: incoming.size==0 early return / merge+overwrite / checkCapacity minNewSize>newSize branch |
| testCheckCapacity_GrowthFactorBranch | `checkCapacity()`: curSize>=InitialCapacity growth branch |
| testIterator_HasNextAndNext/_Remove | `iterator()`: hasNext/next, remove() |
| testAsList_NullValue/_NonNullValue/_IsUnmodifiable | `asList()`: val==null (BooleanAttribute) / val!=null (Attribute) / unmodifiable list |
| testDataset_Put_NewKey/_ExistingKey/_FiltersOnlyDataAttributes | `Dataset.put()`: hasKey true/false; filter by `isDataAttribute()` |
| testDatasetEntrySet_SizeViaIteration | `EntrySet.size()` loop |
| testDatasetIterator_Remove/_HasNext_NoDataAttributes | `DatasetIterator.hasNext()/remove()`: found data-attr / none found |
| testHtml_NormalAttribute_Quoted | `html()`: else(quote) branch, normal attribute |
| testHtml_BooleanAttribute_NullValue_Collapsed | `html()`: val==null collapse branch |
| testHtml_ValueEqualsKeyAndIsBooleanAttribute_Collapsed | `html()`: val.equals(key)&&isBooleanAttribute collapse branch |
| testHtml_ValueEqualsKeyButNotBooleanAttribute_NotCollapsed | `html()`: val.equals(key) but not boolean attr → quote branch |
| testHtml_XmlSyntax_NullValue_NotCollapsed | `html()`: syntax != html → quote branch even if val==null |
| testToString_DelegatesToHtml | `toString()` |
| testEquals_SameInstance/_Null/_DifferentClass/_DifferentSize/_SameContent/_DifferentValues | `equals()`: this==o / null / class mismatch / size mismatch / keys&vals equal / vals differ |
| testHashCode_ConsistentAcrossCalls | `hashCode()` consistency |
| testClone_BasicIndependenceOfLogicalContent | `clone()`: logical content preserved |
| testClone_KnownDefect_SideEffectOnOriginalArrays | **Jsoup-75b defect**: clone() wrongly reassigns `this.keys/vals` instead of `clone.keys/vals` |
| testNormalize_LowercasesAllKeys/_EmptyAttributes_NoOp | `normalize()`: loop executes / loop skipped (size==0) |

**หมายเหตุ:** branch ของ `html()` ที่ดัก `IOException` (catch block) ไม่สามารถ trigger ได้จริงด้วย `StringBuilder` (ไม่โยน `IOException`) จึงไม่ได้เขียนเทสสำหรับ branch นี้ตามข้อกำหนดห้ามเดา behavior ที่ไม่สามารถยืนยันได้จากซอร์ส เช่นเดียวกับ `Validate.isTrue`/`Validate.isFalse` ภายใน `checkCapacity`/`remove(int)` ซึ่งไม่สามารถถูกละเมิดผ่าน public API ได้ตามการวิเคราะห์โค้ด