# AttributesTest.java

หมายเหตุสำคัญก่อนโค้ด:
- วางคลาสทดสอบไว้ใน package เดียวกับคลาสเป้าหมาย (`org.jsoup.nodes`) เพราะมีเมธอด/ฟิลด์ package-private หลายตัว (เช่น `indexOfKey`, `putIgnoreCase`, `keys`, `vals`) ที่ต้องเข้าถึงเพื่อทดสอบ branch ได้ครบ
- สมมติฐานที่ไม่ได้อยู่ในซอร์สที่ให้มาตรง ๆ (กำกับด้วยคอมเมนต์ในโค้ด): `org.jsoup.helper.Validate.notNull/isTrue/isFalse` throw `IllegalArgumentException` (พฤติกรรมมาตรฐานของ jsoup), `Attribute` มี public constructor `(String key, String value)` และ `getKey()/getValue()`, `Attribute.parent` เป็น field ระดับ package-private ที่ `Attributes.put(Attribute)` set ได้ (อ้างอิงจาก `attribute.parent = this;` ในซอร์ส)
- ไม่ยืนยัน/ไม่เดารายละเอียดภายในของ `Attribute.shouldCollapseAttribute(...)` เพราะไม่มีซอร์สให้ จึงทดสอบ `html()` แบบกว้าง ๆ เท่านั้น
- มีเทสเฉพาะสำหรับ "fault" ที่รู้จักใน Defects4J Jsoup-92b คือ `clone()` ไปแก้ไข `this.keys/this.vals` (ของต้นฉบับ) แทนที่จะแก้ `clone.keys/clone.vals` — เทสนี้คาดหวังพฤติกรรมตาม contract ปกติของ `clone()` (ห้าม mutate original)

```java
package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class AttributesTest {

    private Attributes attrs;

    @Before
    public void setUp() {
        attrs = new Attributes();
    }

    // ---------- get / getIgnoreCase ----------

    @Test
    public void testGet_NotFound_ReturnsEmptyString() {
        assertEquals("", attrs.get("missing"));
    }

    @Test
    public void testGet_Found_ReturnsValue() {
        attrs.put("key", "value");
        assertEquals("value", attrs.get("key"));
    }

    @Test
    public void testGet_FoundBooleanAttribute_NullValue_ReturnsEmptyString() {
        attrs.put("checked", true); // boolean attribute stored as null value
        assertEquals("", attrs.get("checked"));
    }

    @Test(expected = IllegalArgumentException.class) // Validate.notNull expected to throw
    public void testGet_NullKey_Throws() {
        attrs.get(null);
    }

    @Test
    public void testGetIgnoreCase_NotFound_ReturnsEmptyString() {
        assertEquals("", attrs.getIgnoreCase("missing"));
    }

    @Test
    public void testGetIgnoreCase_FoundDifferentCase_ReturnsValue() {
        attrs.put("Foo", "Bar");
        assertEquals("Bar", attrs.getIgnoreCase("foo"));
        assertEquals("Bar", attrs.getIgnoreCase("FOO"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetIgnoreCase_NullKey_Throws() {
        attrs.getIgnoreCase(null);
    }

    // ---------- indexOfKey (package-private) ----------

    @Test
    public void testIndexOfKey_FoundAndNotFound() {
        attrs.put("a", "1");
        assertEquals(0, attrs.indexOfKey("a"));
        assertEquals(Attributes.NotFound, attrs.indexOfKey("z"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIndexOfKey_NullKey_Throws() {
        attrs.indexOfKey(null);
    }

    // ---------- put(String,String) ----------

    @Test
    public void testPut_NewKey_AddsAttribute() {
        attrs.put("key", "value");
        assertEquals(1, attrs.size());
        assertEquals("value", attrs.get("key"));
    }

    @Test
    public void testPut_ExistingKey_UpdatesValue_NoDuplicate() {
        attrs.put("key", "v1");
        attrs.put("key", "v2");
        assertEquals(1, attrs.size());
        assertEquals("v2", attrs.get("key"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPut_NullKey_Throws() {
        attrs.put((String) null, "value");
    }

    @Test
    public void testPut_EmptyKeyAndValue() {
        attrs.put("", "");
        assertEquals("", attrs.get(""));
        assertTrue(attrs.hasKey(""));
    }

    // ---------- putIgnoreCase (package-private) ----------

    @Test
    public void testPutIgnoreCase_NewKey_Adds() {
        attrs.putIgnoreCase("foo", "1");
        assertEquals(1, attrs.size());
        assertEquals("1", attrs.get("foo"));
    }

    @Test
    public void testPutIgnoreCase_ExistingSameCase_NoKeyChange() {
        attrs.putIgnoreCase("bar", "1");
        attrs.putIgnoreCase("bar", "2");
        assertEquals(1, attrs.size());
        assertEquals("2", attrs.get("bar"));
    }

    @Test
    public void testPutIgnoreCase_ExistingDifferentCase_UpdatesKeyAndValue() {
        attrs.putIgnoreCase("foo", "1");
        attrs.putIgnoreCase("FOO", "2"); // case changed branch
        assertEquals(1, attrs.size());
        assertFalse(attrs.hasKey("foo"));
        assertTrue(attrs.hasKey("FOO"));
        assertEquals("2", attrs.get("FOO"));
    }

    // ---------- put(String,boolean) ----------

    @Test
    public void testPutBoolean_True_AddsNullValuedAttribute() {
        attrs.put("checked", true);
        assertTrue(attrs.hasKey("checked"));
        assertEquals("", attrs.get("checked"));
    }

    @Test
    public void testPutBoolean_False_RemovesExistingAttribute() {
        attrs.put("checked", true);
        attrs.put("checked", false);
        assertFalse(attrs.hasKey("checked"));
        assertEquals(0, attrs.size());
    }

    @Test
    public void testPutBoolean_False_NonExistingKey_NoOp() {
        attrs.put("notexist", false);
        assertFalse(attrs.hasKey("notexist"));
        assertEquals(0, attrs.size());
    }

    @Test
    public void testPutBoolean_CaseInsensitive_NoDuplicate() {
        attrs.put("Checked", true);
        attrs.put("CHECKED", true); // uses putIgnoreCase internally, case-changed branch
        assertEquals(1, attrs.size());
    }

    // ---------- put(Attribute) ----------

    @Test
    public void testPutAttribute_AddsAndSetsParent() {
        Attribute attribute = new Attribute("foo", "bar");
        attrs.put(attribute);
        assertEquals("bar", attrs.get("foo"));
        assertSame(attrs, attribute.parent); // field access ok (same package)
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPutAttribute_Null_Throws() {
        attrs.put((Attribute) null);
    }

    // ---------- remove(String) ----------

    @Test
    public void testRemove_ExistingKey_Removes() {
        attrs.put("a", "1");
        attrs.remove("a");
        assertFalse(attrs.hasKey("a"));
        assertEquals(0, attrs.size());
    }

    @Test
    public void testRemove_NonExistingKey_NoOp() {
        attrs.put("a", "1");
        attrs.remove("nonexistent");
        assertEquals(1, attrs.size());
    }

    @Test
    public void testRemove_FirstOfThree_ShiftsRemaining() {
        attrs.put("a", "1");
        attrs.put("b", "2");
        attrs.put("c", "3");
        attrs.remove("a"); // shifted > 0 branch
        assertEquals(2, attrs.size());
        assertEquals("2", attrs.get("b"));
        assertEquals("3", attrs.get("c"));
        assertFalse(attrs.hasKey("a"));
    }

    @Test
    public void testRemove_LastOfThree_NoShiftNeeded() {
        attrs.put("a", "1");
        attrs.put("b", "2");
        attrs.put("c", "3");
        attrs.remove("c"); // shifted == 0 branch
        assertEquals(2, attrs.size());
        assertTrue(attrs.hasKey("a"));
        assertTrue(attrs.hasKey("b"));
        assertFalse(attrs.hasKey("c"));
    }

    // ---------- removeIgnoreCase ----------

    @Test
    public void testRemoveIgnoreCase_ExistingKey_Removes() {
        attrs.put("Foo", "1");
        attrs.removeIgnoreCase("foo");
        assertFalse(attrs.hasKey("Foo"));
    }

    @Test
    public void testRemoveIgnoreCase_NonExistingKey_NoOp() {
        attrs.put("Foo", "1");
        attrs.removeIgnoreCase("bar");
        assertEquals(1, attrs.size());
    }

    // ---------- hasKey / hasKeyIgnoreCase ----------

    @Test
    public void testHasKey_TrueAndFalse() {
        attrs.put("a", "1");
        assertTrue(attrs.hasKey("a"));
        assertFalse(attrs.hasKey("b"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHasKey_NullKey_Throws() {
        attrs.hasKey(null);
    }

    @Test
    public void testHasKeyIgnoreCase_TrueAndFalse() {
        attrs.put("Foo", "1");
        assertTrue(attrs.hasKeyIgnoreCase("foo"));
        assertFalse(attrs.hasKeyIgnoreCase("bar"));
    }

    // ---------- size ----------

    @Test
    public void testSize_EmptyThenGrows() {
        assertEquals(0, attrs.size());
        attrs.put("a", "1");
        attrs.put("b", "2");
        assertEquals(2, attrs.size());
        attrs.remove("a");
        assertEquals(1, attrs.size());
    }

    // ---------- addAll ----------

    @Test
    public void testAddAll_EmptyIncoming_NoChange() {
        attrs.put("a", "1");
        Attributes incoming = new Attributes();
        attrs.addAll(incoming); // incoming.size()==0 -> early return branch
        assertEquals(1, attrs.size());
    }

    @Test
    public void testAddAll_NonEmptyIncoming_AddsAll() {
        attrs.put("a", "1");
        Attributes incoming = new Attributes();
        incoming.put("b", "2");
        incoming.put("c", "3");
        attrs.addAll(incoming);
        assertEquals(3, attrs.size());
        assertEquals("2", attrs.get("b"));
        assertEquals("3", attrs.get("c"));
    }

    @Test
    public void testAddAll_OverlappingKey_Replaces() {
        attrs.put("x", "old");
        Attributes incoming = new Attributes();
        incoming.put("x", "new");
        attrs.addAll(incoming);
        assertEquals(1, attrs.size());
        assertEquals("new", attrs.get("x"));
    }

    // ---------- checkCapacity / growth (via keys array, package-private field) ----------

    @Test
    public void testCheckCapacity_InitialAllocation() {
        assertEquals(0, attrs.keys.length); // starts as Empty array
        attrs.put("a", "1");
        assertEquals(4, attrs.keys.length); // InitialCapacity branch
    }

    @Test
    public void testCheckCapacity_GrowthFactorDoubling() {
        for (int i = 0; i < 4; i++) {
            attrs.put("k" + i, "v" + i);
        }
        assertEquals(4, attrs.keys.length);
        attrs.put("k4", "v4"); // forces growth: curSize>=InitialCapacity branch
        assertEquals(8, attrs.keys.length); // size(4)*GrowthFactor(2)
        assertEquals(5, attrs.size());
    }

    @Test
    public void testCheckCapacity_MinNewSizeGreaterThanComputedGrowth() {
        for (int i = 0; i < 4; i++) {
            attrs.put("k" + i, "v" + i);
        }
        assertEquals(4, attrs.keys.length);

        Attributes incoming = new Attributes();
        for (int i = 0; i < 10; i++) {
            incoming.put("ik" + i, "iv" + i);
        }
        attrs.addAll(incoming); // checkCapacity(14): computed growth(8) < minNewSize(14) branch
        assertEquals(14, attrs.size());
        assertEquals(14, attrs.keys.length);
    }

    // ---------- iterator ----------

    @Test
    public void testIterator_HasNextAndNext() {
        attrs.put("a", "1");
        attrs.put("b", "2");
        Iterator<Attribute> it = attrs.iterator();
        assertTrue(it.hasNext());
        Attribute first = it.next();
        assertEquals("a", first.getKey());
        assertEquals("1", first.getValue());
        assertTrue(it.hasNext());
        Attribute second = it.next();
        assertEquals("b", second.getKey());
        assertFalse(it.hasNext());
    }

    @Test
    public void testIterator_EmptyAttributes_HasNextFalse() {
        Iterator<Attribute> it = attrs.iterator();
        assertFalse(it.hasNext());
    }

    @Test
    public void testIterator_Remove() {
        attrs.put("a", "1");
        attrs.put("b", "2");
        Iterator<Attribute> it = attrs.iterator();
        it.next(); // "a"
        it.remove();
        assertFalse(attrs.hasKey("a"));
        assertEquals(1, attrs.size());
        assertTrue(attrs.hasKey("b"));
    }

    // ---------- asList ----------

    @Test
    public void testAsList_Empty() {
        List<Attribute> list = attrs.asList();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testAsList_MixedNormalAndBooleanAttributes() {
        attrs.put("a", "1");
        attrs.put("bool", true); // null value -> BooleanAttribute branch
        List<Attribute> list = attrs.asList();
        assertEquals(2, list.size());
        assertFalse(list.get(0) instanceof BooleanAttribute);
        assertTrue(list.get(1) instanceof BooleanAttribute);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAsList_IsUnmodifiable() {
        attrs.put("a", "1");
        List<Attribute> list = attrs.asList();
        list.add(new Attribute("x", "y"));
    }

    // ---------- dataset / Dataset / DatasetIterator / EntrySet ----------

    @Test
    public void testDataset_Put_NewKey_OldValueNull() {
        Map<String, String> dataset = attrs.dataset();
        String old = dataset.put("foo", "bar");
        assertNull(old);
        assertEquals("bar", attrs.get("data-foo"));
    }

    @Test
    public void testDataset_Put_ExistingKey_ReturnsOldValue() {
        Map<String, String> dataset = attrs.dataset();
        dataset.put("foo", "bar");
        String old = dataset.put("foo", "baz");
        assertEquals("bar", old);
        assertEquals("baz", attrs.get("data-foo"));
    }

    @Test
    public void testDataset_EntrySet_FiltersOnlyDataAttributes() {
        attrs.put("data-foo", "bar");
        attrs.put("notdata", "value");
        Map<String, String> dataset = attrs.dataset();

        int count = 0;
        for (Map.Entry<String, String> e : dataset.entrySet()) {
            count++;
            assertEquals("foo", e.getKey());
            assertEquals("bar", e.getValue());
        }
        assertEquals(1, count);
    }

    @Test
    public void testDataset_EntrySet_Size() {
        attrs.put("data-foo", "1");
        attrs.put("data-bar", "2");
        attrs.put("notdata", "x");
        Map<String, String> dataset = attrs.dataset();
        assertEquals(2, dataset.entrySet().size());
    }

    @Test
    public void testDataset_NoDataAttributes_EmptyEntrySet() {
        attrs.put("foo", "bar");
        Map<String, String> dataset = attrs.dataset();
        assertEquals(0, dataset.size());
        assertFalse(dataset.entrySet().iterator().hasNext());
    }

    @Test
    public void testDatasetIterator_Remove() {
        attrs.put("data-foo", "bar");
        Map<String, String> dataset = attrs.dataset();
        Iterator<Map.Entry<String, String>> it = dataset.entrySet().iterator();
        assertTrue(it.hasNext());
        it.next();
        it.remove();
        assertFalse(attrs.hasKey("data-foo"));
    }

    // ---------- html / toString ----------

    @Test
    public void testHtml_ContainsAttributeKeyValue() {
        attrs.put("class", "test");
        String html = attrs.html();
        assertTrue(html.contains("class"));
        assertTrue(html.contains("test"));
    }

    @Test
    public void testHtml_EmptyAttributes_EmptyOrBlankString() {
        String html = attrs.html();
        assertNotNull(html);
        assertEquals("", html.trim());
    }

    @Test
    public void testHtml_BooleanAttribute_DoesNotThrow() {
        // ไม่ทราบรายละเอียดการ collapse จาก Attribute.shouldCollapseAttribute (ไม่มีซอร์สให้)
        // จึงตรวจสอบเพียงว่าไม่มี exception และ key ปรากฏอยู่ใน html
        attrs.put("checked", true);
        String html = attrs.html();
        assertTrue(html.contains("checked"));
    }

    @Test
    public void testToString_EqualsHtml() {
        attrs.put("a", "1");
        assertEquals(attrs.html(), attrs.toString());
    }

    // ---------- equals / hashCode ----------

    @Test
    public void testEquals_SameInstance_True() {
        attrs.put("a", "1");
        assertTrue(attrs.equals(attrs));
    }

    @Test
    public void testEquals_Null_False() {
        assertFalse(attrs.equals(null));
    }

    @Test
    public void testEquals_DifferentClass_False() {
        assertFalse(attrs.equals("not attributes"));
    }

    @Test
    public void testEquals_BothEmpty_True() {
        Attributes other = new Attributes();
        assertTrue(attrs.equals(other));
    }

    @Test
    public void testEquals_DifferentSize_False() {
        attrs.put("a", "1");
        Attributes other = new Attributes();
        other.put("a", "1");
        other.put("b", "2");
        assertFalse(attrs.equals(other));
    }

    @Test
    public void testEquals_SameKeyDifferentValue_False() {
        attrs.put("a", "1");
        Attributes other = new Attributes();
        other.put("a", "2");
        assertFalse(attrs.equals(other));
    }

    @Test
    public void testEquals_DifferentKey_False() {
        attrs.put("a", "1");
        Attributes other = new Attributes();
        other.put("z", "1");
        assertFalse(attrs.equals(other));
    }

    @Test
    public void testEquals_SameContent_True() {
        attrs.put("a", "1");
        attrs.put("b", "2");
        Attributes other = new Attributes();
        other.put("a", "1");
        other.put("b", "2");
        assertTrue(attrs.equals(other));
    }

    @Test
    public void testHashCode_ConsistentForEqualObjects() {
        attrs.put("a", "1");
        Attributes other = new Attributes();
        other.put("a", "1");
        assertEquals(attrs.hashCode(), other.hashCode());
    }

    // ---------- clone ----------

    @Test
    public void testClone_EqualButNotSame() {
        attrs.put("a", "1");
        attrs.put("b", "2");
        Attributes clone = attrs.clone();
        assertNotSame(attrs, clone);
        assertEquals(attrs, clone);
    }

    @Test
    public void testClone_ModifyingCloneDoesNotAffectOriginal() {
        attrs.put("a", "1");
        Attributes clone = attrs.clone();
        clone.put("c", "3");
        assertFalse(attrs.hasKey("c"));
        assertTrue(clone.hasKey("c"));
    }

    @Test
    public void testClone_EmptyAttributes() {
        Attributes clone = attrs.clone();
        assertEquals(0, clone.size());
        assertEquals(attrs, clone);
    }

    @Test
    public void testClone_DoesNotMutateOriginalBackingArrayCapacity() {
        // ทดสอบตรงจุดที่เป็น known defect ของ Jsoup-92b:
        // clone() ควรไม่แก้ไข state ภายในของ "ตัวต้นฉบับ" (this),
        // แต่ใน source โค้ดที่ให้มา มีการเขียน `keys = copyOf(keys, size);`
        // โดยไม่ระบุ `clone.` นำหน้า จึงไป mutate this.keys/this.vals แทน
        for (int i = 0; i < 5; i++) {
            attrs.put("k" + i, "v" + i);
        }
        int originalCapacityBeforeClone = attrs.keys.length; // คาดว่าเป็น 8 (growth)
        assertEquals(8, originalCapacityBeforeClone);

        attrs.clone();

        // พฤติกรรมที่ถูกต้องตาม contract ของ clone(): ต้นฉบับไม่ควรถูกแก้ไข
        assertEquals("clone() ไม่ควรแก้ไข backing array ของอ็อบเจ็กต์ต้นฉบับ",
                originalCapacityBeforeClone, attrs.keys.length);
    }

    // ---------- normalize ----------

    @Test
    public void testNormalize_LowercasesAllKeys() {
        attrs.put("Class", "value");
        attrs.put("ID", "val2");
        attrs.normalize();
        assertTrue(attrs.hasKey("class"));
        assertTrue(attrs.hasKey("id"));
        assertFalse(attrs.hasKey("Class"));
        assertFalse(attrs.hasKey("ID"));
    }

    @Test
    public void testNormalize_EmptyAttributes_NoError() {
        attrs.normalize(); // loop ไม่ทำงานเลย เพราะ size==0
        assertEquals(0, attrs.size());
    }
}
```

# สรุป Branch/Condition Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| testGet_NotFound_ReturnsEmptyString | `get`: index==NotFound |
| testGet_Found_ReturnsValue | `get`: index found, value != null |
| testGet_FoundBooleanAttribute_NullValue_ReturnsEmptyString | `checkNotNull`: val==null |
| testGet_NullKey_Throws | `indexOfKey` → Validate.notNull throw |
| testGetIgnoreCase_* | `indexOfKeyIgnoreCase` found/not found, case-insensitive match |
| testIndexOfKey_FoundAndNotFound / NullKey_Throws | loop match/no match, null guard |
| testPut_NewKey_AddsAttribute / ExistingKey_UpdatesValue | `put(String,String)`: i==NotFound (add) vs i!=NotFound (update) |
| testPut_NullKey_Throws | null validation ผ่าน indexOfKey |
| testPut_EmptyKeyAndValue | boundary: empty string key/value |
| testPutIgnoreCase_NewKey_Adds | `putIgnoreCase`: i==NotFound → add |
| testPutIgnoreCase_ExistingSameCase_NoKeyChange | i!=NotFound, keys[i].equals(key) true → ไม่เปลี่ยน key |
| testPutIgnoreCase_ExistingDifferentCase_UpdatesKeyAndValue | i!=NotFound, keys[i].equals(key) false → เปลี่ยน key |
| testPutBoolean_True_* / False_* / CaseInsensitive_* | `put(String,boolean)`: value true/false branches |
| testPutAttribute_AddsAndSetsParent / Null_Throws | `put(Attribute)`: normal path, Validate.notNull throw |
| testRemove_ExistingKey / NonExistingKey_NoOp | `remove(String)`: i!=NotFound vs i==NotFound |
| testRemove_FirstOfThree_ShiftsRemaining | `remove(int)`: shifted>0 |
| testRemove_LastOfThree_NoShiftNeeded | `remove(int)`: shifted==0 |
| testRemoveIgnoreCase_* | case-insensitive found/not found |
| testHasKey_* / HasKeyIgnoreCase_* | true/false branches, null throw |
| testSize_EmptyThenGrows | size() ค่าเปลี่ยนตามสถานะ |
| testAddAll_EmptyIncoming_NoChange | `addAll`: incoming.size()==0 → early return |
| testAddAll_NonEmptyIncoming_AddsAll / OverlappingKey_Replaces | `addAll`: loop + put() ภายใน (add vs update) |
| testCheckCapacity_InitialAllocation | `checkCapacity`: curSize<InitialCapacity → newSize=InitialCapacity |
| testCheckCapacity_GrowthFactorDoubling | curSize>=InitialCapacity → newSize=size*GrowthFactor |
| testCheckCapacity_MinNewSizeGreaterThanComputedGrowth | minNewSize>newSize → newSize=minNewSize |
| testIterator_HasNextAndNext / EmptyAttributes_HasNextFalse | iterator hasNext true/false, next() |
| testIterator_Remove | iterator.remove() → Attributes.remove(index) |
| testAsList_Empty / MixedNormalAndBooleanAttributes / IsUnmodifiable | asList: val==null (BooleanAttribute) vs !=null (Attribute), unmodifiableList |
| testDataset_Put_* | Dataset.put: oldValue null/not-null branch |
| testDataset_EntrySet_FiltersOnlyDataAttributes / EntrySet_Size / NoDataAttributes_EmptyEntrySet | DatasetIterator.hasNext loop + isDataAttribute filter |
| testDatasetIterator_Remove | DatasetIterator.remove() |
| testHtml_* | `html(Appendable,...)` loop, key/value append (ไม่ยืนยัน collapse logic) |
| testToString_EqualsHtml | toString() เรียก html() |
| testEquals_* (7 เทส) | equals: this==o, null, getClass diff, size diff, keys diff, vals diff, equal content |
| testHashCode_ConsistentForEqualObjects | hashCode สอดคล้องกับ equals |
| testClone_* (4 เทส) | clone(): equal-but-not-same, independence, empty case, **และเทสจับ known defect เรื่อง clone() mutate original array** |
| testNormalize_LowercasesAllKeys / EmptyAttributes_NoError | normalize loop มี/ไม่มี element |

ชุดทดสอบนี้ครอบคลุมแทบทุก if/else และ loop-condition ที่วิเคราะห์ได้จากซอร์สที่ให้มา รวมถึงเทสที่ตั้งใจออกแบบมาเพื่อดักจับ fault จริงของ `clone()` ตาม Defects4J Jsoup-92b