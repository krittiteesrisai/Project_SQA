```java
package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Document.OutputSettings.Syntax;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Unit tests for org.jsoup.nodes.Attribute
 *
 * NOTE: ประกาศ package เป็น org.jsoup.nodes (เช่นเดียวกับคลาสเป้าหมาย)
 * เพื่อให้สามารถเข้าถึง protected/package-private members
 * (shouldCollapseAttribute, isBooleanAttribute, isDataAttribute, html(..),
 * field parent) ได้ตรง ๆ สำหรับการทดสอบ branch coverage แบบลึก
 */
public class AttributeTest {

    // ---------- Constructor tests ----------

    @Test
    public void testConstructorBasic() {
        Attribute attr = new Attribute("href", "index.html");
        assertEquals("href", attr.getKey());
        assertEquals("index.html", attr.getValue());
    }

    @Test
    public void testConstructorTrimsKey() {
        Attribute attr = new Attribute("  href  ", "val");
        assertEquals("href", attr.getKey());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullKeyThrows() {
        new Attribute(null, "val");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorEmptyKeyAfterTrimThrows() {
        // trimming "   " -> "" ต้อง throw ตาม Validate.notEmpty
        new Attribute("   ", "val");
    }

    @Test
    public void testConstructorWithParent() {
        Attributes parent = new Attributes();
        Attribute attr = new Attribute("key", "val", parent);
        assertEquals("key", attr.getKey());
        assertSame(parent, attr.parent); // package-private field, accessible in same package
    }

    // ---------- getKey / setKey ----------

    @Test
    public void testGetKey() {
        Attribute attr = new Attribute("Key", "v");
        assertEquals("Key", attr.getKey());
    }

    @Test
    public void testSetKeyNoParent() {
        Attribute attr = new Attribute("key", "val");
        attr.setKey("newKey");
        assertEquals("newKey", attr.getKey());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetKeyNullThrows() {
        Attribute attr = new Attribute("key", "val");
        attr.setKey(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetKeyEmptyAfterTrimThrows() {
        Attribute attr = new Attribute("key", "val");
        attr.setKey("   ");
    }

    @Test
    public void testSetKeyWithParentFoundUpdatesParent() {
        Attributes attrs = new Attributes();
        attrs.put("foo", "bar");
        Attribute attr = attrs.asList().get(0); // real Attribute backed by attrs
        attr.setKey("foo2");
        assertEquals("foo2", attr.getKey());
        // parent's key array should now reflect new key -> get by old key empty, by new key returns value
        assertEquals("bar", attrs.get("foo2"));
        assertEquals("", attrs.get("foo")); // old key no longer present
    }

    @Test
    public void testSetKeyWithParentNotFoundDoesNotCrash() {
        // Attribute whose current key does NOT exist in parent's internal arrays
        Attributes attrs = new Attributes();
        attrs.put("foo", "bar");
        Attribute detachedAttr = new Attribute("other", "val", attrs); // "other" not in attrs
        detachedAttr.setKey("otherNew");
        assertEquals("otherNew", detachedAttr.getKey());
        // original attrs content untouched
        assertEquals("bar", attrs.get("foo"));
    }

    // ---------- getValue / setValue ----------

    @Test
    public void testGetValueNormal() {
        Attribute attr = new Attribute("key", "value");
        assertEquals("value", attr.getValue());
    }

    @Test
    public void testGetValueNullReturnsEmptyString() {
        Attribute attr = new Attribute("key", null);
        assertEquals("", attr.getValue());
    }

    @Test(expected = NullPointerException.class)
    public void testSetValueWithoutParentThrowsNPE() {
        // BUG-sensitive test: parent.get(this.key) is called unconditionally
        // even before checking "if (parent != null)". With no parent, this
        // should throw NullPointerException.
        Attribute attr = new Attribute("key", "val"); // parent == null
        attr.setValue("newVal");
    }

    @Test
    public void testSetValueWithParentFoundUpdatesValueAndReturnsOld() {
        Attributes attrs = new Attributes();
        attrs.put("foo", "bar");
        Attribute attr = attrs.asList().get(0);
        String old = attr.setValue("baz");
        assertEquals("bar", old);
        assertEquals("baz", attr.getValue());
        assertEquals("baz", attrs.get("foo"));
    }

    @Test
    public void testSetValueWithParentKeyNotFoundInParentArrays() {
        Attributes attrs = new Attributes();
        attrs.put("foo", "bar");
        // "other" key does not exist inside attrs' internal arrays,
        // but parent.get("other") will just return "" (not found), not null,
        // so no NPE occurs here (unlike the no-parent case).
        Attribute detachedAttr = new Attribute("other", "val", attrs);
        String old = detachedAttr.setValue("newVal");
        assertEquals("", old); // old value from parent.get("other") -> not found -> ""
        assertEquals("newVal", detachedAttr.getValue());
        // attrs' own "foo" entry remains unaffected
        assertEquals("bar", attrs.get("foo"));
    }

    // ---------- html() / toString() ----------

    @Test
    public void testHtmlNormalAttribute() {
        Attribute attr = new Attribute("href", "index.html");
        String html = attr.html();
        assertEquals("href=\"index.html\"", html);
    }

    @Test
    public void testHtmlCollapsedBooleanAttributeEmptyValue() {
        // "disabled" is in booleanAttributes array, default Document syntax = html
        Attribute attr = new Attribute("disabled", "");
        String html = attr.html();
        assertEquals("disabled", html); // collapsed, no ="..."
    }

    @Test
    public void testHtmlCollapsedBooleanAttributeValueEqualsKey() {
        Attribute attr = new Attribute("checked", "CHECKED"); // equalsIgnoreCase
        String html = attr.html();
        assertEquals("checked", html);
    }

    @Test
    public void testHtmlNotCollapsedWhenValueDiffersAndNotBoolean() {
        Attribute attr = new Attribute("class", "myclass");
        String html = attr.html();
        assertEquals("class=\"myclass\"", html);
    }

    @Test
    public void testToStringEqualsHtml() {
        Attribute attr = new Attribute("href", "page.html");
        assertEquals(attr.html(), attr.toString());
    }

    @Test
    public void testStaticHtmlMethodDirect() throws Exception {
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        Attribute.html("href", "a.html", sb, out);
        assertEquals("href=\"a.html\"", sb.toString());
    }

    // ---------- createFromEncoded ----------

    @Test
    public void testCreateFromEncodedUnescapesValue() {
        Attribute attr = Attribute.createFromEncoded("key", "a&amp;b");
        assertEquals("key", attr.getKey());
        assertEquals("a&b", attr.getValue());
    }

    // ---------- isDataAttribute ----------

    @Test
    public void testIsDataAttributeInstanceTrue() {
        String prefix = Attributes.dataPrefix; // package-private, accessible in same package
        Attribute attr = new Attribute(prefix + "foo", "v");
        assertTrue(attr.isDataAttribute());
    }

    @Test
    public void testIsDataAttributeStaticFalse_NoPrefix() {
        assertFalse(Attribute.isDataAttribute("foo"));
    }

    @Test
    public void testIsDataAttributeStaticFalse_ExactPrefixLength() {
        // key.length() > dataPrefix.length() is required; equal length should be false
        String prefix = Attributes.dataPrefix;
        assertFalse(Attribute.isDataAttribute(prefix)); // length equal, not greater
    }

    @Test
    public void testIsDataAttributeStaticTrue() {
        String prefix = Attributes.dataPrefix;
        assertTrue(Attribute.isDataAttribute(prefix + "x"));
    }

    // ---------- shouldCollapseAttribute (static) ----------

    @Test
    public void testShouldCollapseAttribute_XmlSyntaxAlwaysFalse() {
        OutputSettings out = new OutputSettings();
        out.syntax(Syntax.xml);
        assertFalse(Attribute.shouldCollapseAttribute("disabled", "", out));
        assertFalse(Attribute.shouldCollapseAttribute("disabled", null, out));
    }

    @Test
    public void testShouldCollapseAttribute_HtmlSyntax_ValNull_AnyKey() {
        // According to source, val == null short-circuits to true regardless
        // of isBooleanAttribute(key). This is tested as-is from source logic.
        OutputSettings out = new OutputSettings();
        out.syntax(Syntax.html);
        assertTrue(Attribute.shouldCollapseAttribute("href", null, out));
        assertTrue(Attribute.shouldCollapseAttribute("disabled", null, out));
    }

    @Test
    public void testShouldCollapseAttribute_HtmlSyntax_EmptyVal_BooleanKey() {
        OutputSettings out = new OutputSettings();
        out.syntax(Syntax.html);
        assertTrue(Attribute.shouldCollapseAttribute("disabled", "", out));
    }

    @Test
    public void testShouldCollapseAttribute_HtmlSyntax_EmptyVal_NonBooleanKey() {
        OutputSettings out = new OutputSettings();
        out.syntax(Syntax.html);
        assertFalse(Attribute.shouldCollapseAttribute("href", "", out));
    }

    @Test
    public void testShouldCollapseAttribute_HtmlSyntax_ValEqualsKey_BooleanKey() {
        OutputSettings out = new OutputSettings();
        out.syntax(Syntax.html);
        assertTrue(Attribute.shouldCollapseAttribute("checked", "CHECKED", out));
    }

    @Test
    public void testShouldCollapseAttribute_HtmlSyntax_ValDiffers_BooleanKey() {
        OutputSettings out = new OutputSettings();
        out.syntax(Syntax.html);
        assertFalse(Attribute.shouldCollapseAttribute("checked", "someval", out));
    }

    @Test
    public void testInstanceShouldCollapseAttributeDelegates() {
        Attribute attr = new Attribute("disabled", "");
        OutputSettings out = new OutputSettings();
        out.syntax(Syntax.html);
        assertTrue(attr.shouldCollapseAttribute(out));
    }

    // ---------- isBooleanAttribute (deprecated instance) ----------

    @Test
    public void testIsBooleanAttributeInstance_KeyInArray() {
        Attribute attr = new Attribute("checked", "yes");
        assertTrue(attr.isBooleanAttribute());
    }

    @Test
    public void testIsBooleanAttributeInstance_ValNull() {
        Attribute attr = new Attribute("href", null); // not in array, but val==null
        assertTrue(attr.isBooleanAttribute());
    }

    @Test
    public void testIsBooleanAttributeInstance_False() {
        Attribute attr = new Attribute("href", "somevalue");
        assertFalse(attr.isBooleanAttribute());
    }

    // ---------- isBooleanAttribute (static) ----------

    @Test
    public void testIsBooleanAttributeStaticTrue() {
        assertTrue(Attribute.isBooleanAttribute("checked"));
    }

    @Test
    public void testIsBooleanAttributeStaticFalse() {
        assertFalse(Attribute.isBooleanAttribute("href"));
    }

    // ---------- equals / hashCode ----------

    @Test
    public void testEqualsSameInstance() {
        Attribute attr = new Attribute("k", "v");
        assertTrue(attr.equals(attr));
    }

    @Test
    public void testEqualsNullObject() {
        Attribute attr = new Attribute("k", "v");
        assertFalse(attr.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        Attribute attr = new Attribute("k", "v");
        assertFalse(attr.equals("not-an-attribute"));
    }

    @Test
    public void testEqualsSameKeyAndValue() {
        Attribute a1 = new Attribute("k", "v");
        Attribute a2 = new Attribute("k", "v");
        assertTrue(a1.equals(a2));
        assertTrue(a2.equals(a1));
    }

    @Test
    public void testEqualsDifferentKey() {
        Attribute a1 = new Attribute("k1", "v");
        Attribute a2 = new Attribute("k2", "v");
        assertFalse(a1.equals(a2));
    }

    @Test
    public void testEqualsDifferentValue() {
        Attribute a1 = new Attribute("k", "v1");
        Attribute a2 = new Attribute("k", "v2");
        assertFalse(a1.equals(a2));
    }

    @Test
    public void testEqualsOneValNullOtherNot() {
        Attribute a1 = new Attribute("k", null);
        Attribute a2 = new Attribute("k", "v");
        assertFalse(a1.equals(a2));
        assertFalse(a2.equals(a1));
    }

    @Test
    public void testEqualsBothValNull() {
        Attribute a1 = new Attribute("k", null);
        Attribute a2 = new Attribute("k", null);
        assertTrue(a1.equals(a2));
    }

    @Test
    public void testHashCodeConsistentForEqualObjects() {
        Attribute a1 = new Attribute("k", "v");
        Attribute a2 = new Attribute("k", "v");
        assertEquals(a1.hashCode(), a2.hashCode());
    }

    @Test
    public void testHashCodeWithNullValDoesNotThrow() {
        Attribute attr = new Attribute("k", null);
        // should not throw, just verifying computed deterministically
        int h1 = attr.hashCode();
        int h2 = attr.hashCode();
        assertEquals(h1, h2);
    }

    // ---------- clone ----------

    @Test
    public void testCloneProducesEqualButDistinctObject() {
        Attributes parent = new Attributes();
        Attribute original = new Attribute("key", "val", parent);
        Attribute cloned = original.clone();

        assertNotSame(original, cloned);
        assertEquals(original, cloned);
        assertEquals(original.getKey(), cloned.getKey());
        assertEquals(original.getValue(), cloned.getValue());
        // shallow clone -> parent reference copied as-is
        assertSame(original.parent, cloned.parent);
    }
}
```

## สรุปตาราง Test Coverage

| เมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|
| testConstructorBasic | Constructor ปกติ, delegate ไปยัง constructor 3-arg |
| testConstructorTrimsKey | key.trim() เปลี่ยนค่า key |
| testConstructorNullKeyThrows | Validate.notNull(key) → throw เมื่อ key = null |
| testConstructorEmptyKeyAfterTrimThrows | Validate.notEmpty หลัง trim ว่าง → throw |
| testConstructorWithParent | ตั้งค่า parent field ถูกต้อง |
| testGetKey | getKey() คืนค่าตรง |
| testSetKeyNoParent | setKey เมื่อ parent == null (if (parent != null) → false) |
| testSetKeyNullThrows | setKey ด้วย null → throw |
| testSetKeyEmptyAfterTrimThrows | setKey ด้วยค่าว่างหลัง trim → throw |
| testSetKeyWithParentFoundUpdatesParent | if (parent!=null) true, indexOfKey found (i != NotFound) → อัปเดต parent.keys |
| testSetKeyWithParentNotFoundDoesNotCrash | indexOfKey ไม่พบ (i == NotFound) → ข้าม branch อัปเดต parent |
| testGetValueNormal | getValue คืนค่าปกติ |
| testGetValueNullReturnsEmptyString | checkNotNull แปลง null → "" |
| testSetValueWithoutParentThrowsNPE | Bug-sensitive: parent.get() เรียกก่อนเช็ค null → NPE |
| testSetValueWithParentFoundUpdatesValueAndReturnsOld | setValue กรณี parent!=null และ indexOfKey found |
| testSetValueWithParentKeyNotFoundInParentArrays | setValue กรณี parent!=null แต่ indexOfKey not found |
| testHtmlNormalAttribute | html() กรณีไม่ collapse |
| testHtmlCollapsedBooleanAttributeEmptyValue | shouldCollapseAttribute: val="" และ boolean key → collapse |
| testHtmlCollapsedBooleanAttributeValueEqualsKey | val equalsIgnoreCase(key) และ boolean key → collapse |
| testHtmlNotCollapsedWhenValueDiffersAndNotBoolean | ไม่ collapse เพราะไม่ใช่ boolean attribute |
| testToStringEqualsHtml | toString() == html() |
| testStaticHtmlMethodDirect | html(key,val,accum,out) แบบ static โดยตรง |
| testCreateFromEncodedUnescapesValue | createFromEncoded ใช้ Entities.unescape |
| testIsDataAttributeInstanceTrue / StaticFalse_NoPrefix / StaticFalse_ExactPrefixLength / StaticTrue | isDataAttribute: startsWith true/false, length > prefix.length() true/false |
| testShouldCollapseAttribute_XmlSyntaxAlwaysFalse | out.syntax()!=html → false เสมอ (short-circuit) |
| testShouldCollapseAttribute_HtmlSyntax_ValNull_AnyKey | val==null → true แม้ key ไม่ boolean (ตรวจตาม source จริง) |
| testShouldCollapseAttribute_HtmlSyntax_EmptyVal_BooleanKey | val="" && isBooleanAttribute true → true |
| testShouldCollapseAttribute_HtmlSyntax_EmptyVal_NonBooleanKey | val="" แต่ isBooleanAttribute false → false |
| testShouldCollapseAttribute_HtmlSyntax_ValEqualsKey_BooleanKey | val.equalsIgnoreCase(key) && boolean → true |
| testShouldCollapseAttribute_HtmlSyntax_ValDiffers_BooleanKey | val ไม่ตรงเงื่อนไขใดเลย → false |
| testInstanceShouldCollapseAttributeDelegates | instance method delegate ไป static method |
| testIsBooleanAttributeInstance_KeyInArray / ValNull / False | isBooleanAttribute (deprecated): binarySearch>=0 หรือ val==null หรือ false |
| testIsBooleanAttributeStaticTrue / False | isBooleanAttribute(static): binarySearch>=0 true/false |
| testEqualsSameInstance / NullObject / DifferentClass / SameKeyAndValue / DifferentKey / DifferentValue / OneValNullOtherNot / BothValNull | equals(): ทุก branch (this==o, null, class ไม่ตรง, key เท่ากัน/ไม่เท่ากัน, val เท่ากัน/ไม่เท่ากัน/null) |
| testHashCodeConsistentForEqualObjects / WithNullValDoesNotThrow | hashCode(): กรณี val != null และ val == null |
| testCloneProducesEqualButDistinctObject | clone(): shallow copy, equals แต่ไม่ใช่ object เดียวกัน |

**หมายเหตุสำคัญ (ตามข้อกำหนดที่ 4):**
- `testSetValueWithoutParentThrowsNPE` เขียนขึ้นเพื่อดักจับ **fault จริงในซอร์สโค้ด**: เมธอด `setValue()` เรียก `parent.get(this.key)` **ก่อน** ตรวจสอบ `if (parent != null)` ทำให้เกิด `NullPointerException` เมื่อไม่มี parent ซึ่งขัดกับ constructor สาธารณะ `Attribute(key, value)` ที่อนุญาตให้ parent เป็น null ได้
- `testShouldCollapseAttribute_HtmlSyntax_ValNull_AnyKey` ครอบคลุม branch ที่เกิดจาก operator precedence (`val == null || (A && B)`) ซึ่งทำให้ val=null ส่งผลเป็น `true` แม้ key ไม่ใช่ boolean attribute — เป็นพฤติกรรมจริงตามซอร์สที่ให้มา ไม่ใช่การเดา
- สมมติฐานเรื่อง `Attributes.asList()`, `Attributes.get()`, `Attributes.dataPrefix`, `Attributes.NotFound` อ้างอิงจาก field/method ที่ถูกเรียกใช้จริงในซอร์สของ `Attribute` ที่ให้มา (เช่น `parent.indexOfKey`, `parent.get`, `Attributes.dataPrefix`, `Attributes.NotFound`) จึงมั่นใจว่ามีอยู่ใน classpath จริงของโปรเจกต์ Jsoup-89b