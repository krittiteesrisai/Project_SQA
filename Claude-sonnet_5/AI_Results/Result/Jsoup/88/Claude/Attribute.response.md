# การวิเคราะห์และชุดทดสอบ JUnit 4 สำหรับ `Attribute` class

## หมายเหตุสำคัญก่อนเริ่ม

1. คลาสทดสอบถูกวางไว้ใน package `org.jsoup.nodes` (เดียวกับคลาสเป้าหมาย) เพื่อให้เข้าถึง package-private methods (`isDataAttribute`, `shouldCollapseAttribute`, `isBooleanAttribute` static/instance) และ field `Attributes.dataPrefix` ได้โดยตรง แทนการเดาค่า literal ของ prefix
2. พบจุดที่น่าสงสัยว่าเป็น **fault จริง** ในเมธอด `setValue()`:
   ```java
   public String setValue(String val) {
       String oldVal = parent.get(this.key); // เรียกใช้ parent ก่อนเช็ค null!
       if (parent != null) { ... }
       ...
   }
   ```
   หาก `parent == null` (เช่นสร้างด้วย constructor 2 arg) จะเกิด `NullPointerException` ทันที — มีการเขียนเทสเฉพาะเพื่อดักจับเคสนี้
3. พฤติกรรมของ `Attributes` class (เช่น `get`, `hasKey`, `put`, `checkNotNull`) ไม่มีซอร์สให้ จึงใช้ assumption ที่สมเหตุสมผลตาม API มาตรฐานของ jsoup พร้อมคอมเมนต์กำกับไว้ในโค้ด

```java
package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class AttributeTest {

    private Document.OutputSettings htmlSettings;
    private Document.OutputSettings xmlSettings;

    @Before
    public void setUp() {
        // Document("") ใช้ตรงกับที่ปรากฏในซอร์สต้นฉบับ (Attribute.html())
        htmlSettings = new Document("").outputSettings(); // default syntax = html
        // สมมติฐาน: OutputSettings มี fluent setter syntax(Syntax) -- ไม่มีในซอร์สที่ให้มา
        // แต่จำเป็นต้องใช้เพื่อทดสอบ branch ของ syntax == xml
        xmlSettings = new Document("").outputSettings().syntax(Document.OutputSettings.Syntax.xml);
    }

    // ===================== Constructor =====================

    @Test
    public void constructor_twoArg_setsKeyAndValue() {
        Attribute attr = new Attribute("href", "index.html");
        assertEquals("href", attr.getKey());
        assertEquals("index.html", attr.getValue());
    }

    @Test
    public void constructor_trimsKey() {
        Attribute attr = new Attribute("  href  ", "value");
        assertEquals("href", attr.getKey());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_nullKey_throws() {
        new Attribute(null, "value");
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_emptyKeyAfterTrim_throws() {
        new Attribute("   ", "value");
    }

    @Test
    public void constructor_nullValue_allowed() {
        // ไม่มี validate สำหรับ value ใน constructor
        Attribute attr = new Attribute("checked", null);
        assertNull(attr.getValue());
    }

    // ===================== getKey / getValue =====================

    @Test
    public void getKey_returnsStoredKey() {
        Attribute attr = new Attribute("Class", "test");
        assertEquals("Class", attr.getKey());
    }

    @Test
    public void getValue_returnsStoredValue() {
        Attribute attr = new Attribute("class", "test");
        assertEquals("test", attr.getValue());
    }

    // ===================== setKey =====================

    @Test(expected = IllegalArgumentException.class)
    public void setKey_null_throws() {
        Attribute attr = new Attribute("key", "value");
        attr.setKey(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setKey_emptyAfterTrim_throws() {
        Attribute attr = new Attribute("key", "value");
        attr.setKey("   ");
    }

    @Test
    public void setKey_withoutParent_updatesKeyOnly() {
        Attribute attr = new Attribute("key", "value"); // parent == null
        attr.setKey("newKey");
        assertEquals("newKey", attr.getKey());
    }

    @Test
    public void setKey_withParent_keyFound_updatesParentArray() {
        Attributes attrs = new Attributes();
        attrs.put("foo", "bar");
        Attribute attr = new Attribute("foo", "bar", attrs);
        attr.setKey("foo2");
        assertEquals("foo2", attr.getKey());
        // สมมติฐาน: Attributes.hasKey ตรวจสอบจาก keys array ที่ถูกอัปเดต
        assertTrue(attrs.hasKey("foo2"));
        assertFalse(attrs.hasKey("foo"));
    }

    @Test
    public void setKey_withParent_keyNotFound_parentUntouched() {
        Attributes attrs = new Attributes(); // ไม่มี "foo" ใน parent
        Attribute attr = new Attribute("foo", "bar", attrs);
        attr.setKey("baz");
        assertEquals("baz", attr.getKey());
        // เพราะ indexOfKey == NotFound จึงไม่มีการเขียนลง parent.keys
        assertFalse(attrs.hasKey("baz"));
    }

    // ===================== setValue =====================

    @Test(expected = NullPointerException.class)
    public void setValue_withoutParent_throwsNPE_FAULT() {
        // FAULT: setValue() เรียก parent.get(this.key) ก่อนเช็ค (parent != null)
        // เมื่อสร้างด้วย constructor 2-arg (parent == null) ต้องเกิด NPE
        Attribute attr = new Attribute("key", "value");
        attr.setValue("newValue");
    }

    @Test
    public void setValue_withParent_keyFound_updatesParentAndReturnsOldValue() {
        Attributes attrs = new Attributes();
        attrs.put("foo", "bar");
        Attribute attr = new Attribute("foo", "bar", attrs);
        String oldVal = attr.setValue("baz");
        assertEquals("bar", oldVal);
        assertEquals("baz", attr.getValue());
        assertEquals("baz", attrs.get("foo"));
    }

    @Test
    public void setValue_withParent_keyNotFound_doesNotUpdateParentArray() {
        Attributes attrs = new Attributes(); // "foo" ไม่อยู่ใน parent
        Attribute attr = new Attribute("foo", "bar", attrs);
        // ไม่ยืนยันค่า oldVal ที่แน่นอน เพราะพฤติกรรม Attributes.get() ตอน key หาไม่พบ
        // ไม่มีอยู่ในซอร์สของ Attribute.java ที่ให้มา
        attr.setValue("baz");
        assertEquals("baz", attr.getValue());
    }

    // ===================== html() / toString() =====================

    @Test
    public void html_basicAttribute() {
        Attribute attr = new Attribute("href", "index.html");
        assertEquals("href=\"index.html\"", attr.html());
    }

    @Test
    public void toString_matchesHtml() {
        Attribute attr = new Attribute("href", "index.html");
        assertEquals(attr.html(), attr.toString());
    }

    @Test
    public void html_staticMethod_basicAttribute() throws Exception {
        StringBuilder sb = new StringBuilder();
        Attribute.html("href", "index.html", sb, htmlSettings);
        assertEquals("href=\"index.html\"", sb.toString());
    }

    @Test
    public void html_booleanAttribute_nullValue_collapsed() throws Exception {
        StringBuilder sb = new StringBuilder();
        Attribute.html("hidden", null, sb, htmlSettings);
        assertEquals("hidden", sb.toString());
    }

    @Test
    public void html_booleanAttribute_emptyValue_collapsed() throws Exception {
        StringBuilder sb = new StringBuilder();
        Attribute.html("hidden", "", sb, htmlSettings);
        assertEquals("hidden", sb.toString());
    }

    @Test
    public void html_booleanAttribute_valueEqualsKeyIgnoreCase_collapsed() throws Exception {
        StringBuilder sb = new StringBuilder();
        Attribute.html("hidden", "HIDDEN", sb, htmlSettings);
        assertEquals("hidden", sb.toString());
    }

    @Test
    public void html_booleanAttribute_differentValue_notCollapsed() throws Exception {
        StringBuilder sb = new StringBuilder();
        Attribute.html("hidden", "true", sb, htmlSettings);
        assertEquals("hidden=\"true\"", sb.toString());
    }

    @Test
    public void html_xmlSyntax_neverCollapsed() throws Exception {
        StringBuilder sb = new StringBuilder();
        // สมมติฐาน: Attributes.checkNotNull(null) ไม่ throw แต่คืน ""
        // (จำเป็นสำหรับ path นี้ เพราะ shouldCollapseAttribute เป็น false ตั้งแต่ syntax != html)
        Attribute.html("hidden", null, sb, xmlSettings);
        assertEquals("hidden=\"\"", sb.toString());
    }

    @Test
    public void html_nonBooleanKey_emptyValue_notCollapsed() throws Exception {
        StringBuilder sb = new StringBuilder();
        Attribute.html("class", "", sb, htmlSettings);
        assertEquals("class=\"\"", sb.toString());
    }

    // ===================== createFromEncoded =====================

    @Test
    public void createFromEncoded_unescapesValue() {
        Attribute attr = Attribute.createFromEncoded("key", "A&amp;B");
        assertEquals("key", attr.getKey());
        assertEquals("A&B", attr.getValue());
    }

    // ===================== isDataAttribute =====================

    @Test
    public void isDataAttribute_instance_true() {
        Attribute attr = new Attribute(Attributes.dataPrefix + "foo", "value");
        assertTrue(attr.isDataAttribute());
    }

    @Test
    public void isDataAttribute_instance_false() {
        Attribute attr = new Attribute("foo", "value");
        assertFalse(attr.isDataAttribute());
    }

    @Test
    public void isDataAttribute_static_exactPrefixLength_false() {
        // length ต้อง > prefix length เท่านั้น, เท่ากันถือว่า false (boundary)
        assertFalse(Attribute.isDataAttribute(Attributes.dataPrefix));
    }

    @Test
    public void isDataAttribute_static_prefixPlusOneChar_true() {
        assertTrue(Attribute.isDataAttribute(Attributes.dataPrefix + "x"));
    }

    @Test
    public void isDataAttribute_static_noPrefix_false() {
        assertFalse(Attribute.isDataAttribute("foo"));
    }

    // ===================== shouldCollapseAttribute =====================

    @Test
    public void shouldCollapseAttribute_instance_delegatesToStatic() {
        Attribute attr = new Attribute("hidden", null);
        assertTrue(attr.shouldCollapseAttribute(htmlSettings));
    }

    @Test
    public void shouldCollapseAttribute_static_xmlSyntax_alwaysFalse() {
        assertFalse(Attribute.shouldCollapseAttribute("hidden", null, xmlSettings));
    }

    @Test
    public void shouldCollapseAttribute_static_htmlSyntax_nullValue_booleanKey_true() {
        assertTrue(Attribute.shouldCollapseAttribute("hidden", null, htmlSettings));
    }

    @Test
    public void shouldCollapseAttribute_static_htmlSyntax_emptyValue_booleanKey_true() {
        assertTrue(Attribute.shouldCollapseAttribute("hidden", "", htmlSettings));
    }

    @Test
    public void shouldCollapseAttribute_static_htmlSyntax_valueEqualsKeyIgnoreCase_true() {
        assertTrue(Attribute.shouldCollapseAttribute("hidden", "Hidden", htmlSettings));
    }

    @Test
    public void shouldCollapseAttribute_static_htmlSyntax_nonEmptyDifferentValue_false() {
        assertFalse(Attribute.shouldCollapseAttribute("hidden", "true", htmlSettings));
    }

    @Test
    public void shouldCollapseAttribute_static_htmlSyntax_nonBooleanKey_nullValue_false() {
        assertFalse(Attribute.shouldCollapseAttribute("class", null, htmlSettings));
    }

    // ===================== isBooleanAttribute (instance, deprecated) =====================

    @Test
    public void isBooleanAttribute_instance_nullValue_true() {
        Attribute attr = new Attribute("class", null); // ไม่อยู่ในลิสต์ แต่ val==null
        assertTrue(attr.isBooleanAttribute());
    }

    @Test
    public void isBooleanAttribute_instance_keyInList_true() {
        Attribute attr = new Attribute("hidden", "true");
        assertTrue(attr.isBooleanAttribute());
    }

    @Test
    public void isBooleanAttribute_instance_keyNotInList_valueNotNull_false() {
        Attribute attr = new Attribute("class", "value");
        assertFalse(attr.isBooleanAttribute());
    }

    // ===================== isBooleanAttribute (static) =====================

    @Test
    public void isBooleanAttribute_static_firstElement_true() {
        // boundary: ตัวแรกของ array ที่ sort แล้ว
        assertTrue(Attribute.isBooleanAttribute("allowfullscreen"));
    }

    @Test
    public void isBooleanAttribute_static_lastElement_true() {
        // boundary: ตัวสุดท้ายของ array ที่ sort แล้ว
        assertTrue(Attribute.isBooleanAttribute("typemustmatch"));
    }

    @Test
    public void isBooleanAttribute_static_notInList_false() {
        assertFalse(Attribute.isBooleanAttribute("class"));
    }

    // ===================== equals / hashCode =====================

    @Test
    public void equals_sameReference_true() {
        Attribute attr = new Attribute("key", "value");
        assertTrue(attr.equals(attr));
    }

    @Test
    public void equals_null_false() {
        Attribute attr = new Attribute("key", "value");
        assertFalse(attr.equals(null));
    }

    @Test
    public void equals_differentClass_false() {
        Attribute attr = new Attribute("key", "value");
        assertFalse(attr.equals("not an attribute"));
    }

    @Test
    public void equals_differentKey_false() {
        Attribute a1 = new Attribute("key1", "value");
        Attribute a2 = new Attribute("key2", "value");
        assertFalse(a1.equals(a2));
    }

    @Test
    public void equals_differentValue_false() {
        Attribute a1 = new Attribute("key", "value1");
        Attribute a2 = new Attribute("key", "value2");
        assertFalse(a1.equals(a2));
    }

    @Test
    public void equals_sameKeyAndValue_true() {
        Attribute a1 = new Attribute("key", "value");
        Attribute a2 = new Attribute("key", "value");
        assertTrue(a1.equals(a2));
    }

    @Test
    public void equals_bothValuesNull_true() {
        Attribute a1 = new Attribute("key", null);
        Attribute a2 = new Attribute("key", null);
        assertTrue(a1.equals(a2));
    }

    @Test
    public void equals_oneValueNull_falseBothDirections() {
        Attribute a1 = new Attribute("key", null);
        Attribute a2 = new Attribute("key", "value");
        assertFalse(a1.equals(a2));
        assertFalse(a2.equals(a1));
    }

    @Test
    public void equals_bothKeysNull_viaReflection_true() throws Exception {
        // equals() มีการเช็ค key == null ในเชิง defensive แม้ public constructor
        // จะไม่อนุญาตให้ key เป็น null; ใช้ reflection เพื่อให้ครอบคลุม branch นี้เท่านั้น
        Attribute a1 = new Attribute("key", "value");
        Attribute a2 = new Attribute("key", "value");
        setKeyField(a1, null);
        setKeyField(a2, null);
        assertTrue(a1.equals(a2));
    }

    @Test
    public void equals_oneKeyNull_viaReflection_false() throws Exception {
        Attribute a1 = new Attribute("key", "value");
        Attribute a2 = new Attribute("key", "value");
        setKeyField(a1, null);
        assertFalse(a1.equals(a2));
    }

    @Test
    public void hashCode_equalObjects_sameHashCode() {
        Attribute a1 = new Attribute("key", "value");
        Attribute a2 = new Attribute("key", "value");
        assertEquals(a1.hashCode(), a2.hashCode());
    }

    @Test
    public void hashCode_withNullValue_doesNotThrow() {
        Attribute attr = new Attribute("key", null);
        attr.hashCode();
    }

    @Test
    public void hashCode_withNullKey_viaReflection_doesNotThrow() throws Exception {
        Attribute attr = new Attribute("key", "value");
        setKeyField(attr, null);
        attr.hashCode();
    }

    // ===================== clone() =====================

    @Test
    public void clone_producesEqualButDistinctInstance() {
        Attribute attr = new Attribute("key", "value");
        Attribute clone = attr.clone();
        assertEquals(attr, clone);
        assertNotSame(attr, clone);
    }

    @Test
    public void clone_mutatingCloneDoesNotAffectOriginal() {
        Attribute attr = new Attribute("key", "value");
        Attribute clone = attr.clone();
        clone.setKey("newKey"); // clone.parent == null, ปลอดภัยไม่ throw
        assertEquals("key", attr.getKey());
        assertEquals("newKey", clone.getKey());
    }

    // ===================== helper =====================

    private static void setKeyField(Attribute attr, String value) throws Exception {
        Field field = Attribute.class.getDeclaredField("key");
        field.setAccessible(true);
        field.set(attr, value);
    }
}
```

## ตารางสรุปความครอบคลุม Branch/Condition

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `constructor_twoArg_setsKeyAndValue` | constructor delegation ปกติ |
| `constructor_trimsKey` | `key.trim()` ที่ส่งผลให้ key เปลี่ยน |
| `constructor_nullKey_throws` | `Validate.notNull(key)` → throw |
| `constructor_emptyKeyAfterTrim_throws` | `Validate.notEmpty(key)` หลัง trim → throw |
| `constructor_nullValue_allowed` | val ไม่ถูก validate, เป็น null ได้ |
| `setKey_null_throws` | setKey: null check throw |
| `setKey_emptyAfterTrim_throws` | setKey: empty after trim throw |
| `setKey_withoutParent_updatesKeyOnly` | `if (parent != null)` = false |
| `setKey_withParent_keyFound_updatesParentArray` | `parent != null` true, `i != NotFound` true |
| `setKey_withParent_keyNotFound_parentUntouched` | `parent != null` true, `i == NotFound` |
| `setValue_withoutParent_throwsNPE_FAULT` | **Fault**: ใช้ parent ก่อนเช็ค null |
| `setValue_withParent_keyFound_...` | `parent != null`, `i != NotFound` |
| `setValue_withParent_keyNotFound_...` | `parent != null`, `i == NotFound` |
| `html_basicAttribute`, `toString_matchesHtml` | html()/toString() ปกติ, try-block ไม่ throw |
| `html_booleanAttribute_nullValue_collapsed` | shouldCollapseAttribute: val==null, boolean key, html syntax → true |
| `html_booleanAttribute_emptyValue_collapsed` | val=="" branch → true |
| `html_booleanAttribute_valueEqualsKeyIgnoreCase_collapsed` | val.equalsIgnoreCase(key) branch |
| `html_booleanAttribute_differentValue_notCollapsed` | val ไม่ตรงเงื่อนไข → false |
| `html_xmlSyntax_neverCollapsed` | `out.syntax() == html` = false (short-circuit) |
| `html_nonBooleanKey_emptyValue_notCollapsed` | `isBooleanAttribute(key)` = false |
| `createFromEncoded_unescapesValue` | createFromEncoded + Entities.unescape |
| `isDataAttribute_*` | prefix check: true/false/boundary (length เท่ากัน) |
| `shouldCollapseAttribute_static_*` (6 เทส) | ทุก branch ของ OR/AND ใน condition |
| `isBooleanAttribute_instance_*` (3 เทส) | val==null / key in list / else |
| `isBooleanAttribute_static_*` (3 เทส) | boundary ต้น/ท้าย array, not found |
| `equals_*` (10 เทส) | this==o, null, class ผิด, key ต่าง, val ต่าง, ทั้งคู่ null (key/val) |
| `hashCode_*` (3 เทส) | val null, key null (reflection), ปกติ |
| `clone_*` (2 เทส) | ความถูกต้องของ shallow clone และ independence |

**หมายเหตุสมมติฐาน:** ค่า `oldVal`, `Attributes.get/hasKey/checkNotNull` behavior อ้างอิงจาก API มาตรฐานของ jsoup ที่ใช้ร่วมกับคลาส `Attribute` แต่ไม่มีซอร์สให้ตรวจสอบตรง ๆ — มีคอมเมนต์กำกับไว้ในโค้ดทุกจุดที่เกี่ยวข้อง