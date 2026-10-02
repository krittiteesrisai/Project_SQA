# การวิเคราะห์และชุดทดสอบ JUnit 4 สำหรับคลาส `Attribute`

## หมายเหตุสมมติฐาน (ตามข้อกำหนดที่ 4)

เนื่องจากซอร์สโค้ดที่ให้มาไม่ได้แสดง implementation ของ `Attributes`, `Entities`, `Validate` และ `Document.OutputSettings` แบบสมบูรณ์ จึงมีสมมติฐานดังนี้ (ระบุคอมเมนต์ในโค้ดด้วย):

1. `Validate.notNull()` / `Validate.notEmpty()` โยน exception บางชนิด (ตามพฤติกรรมจริงของ jsoup มักเป็น `IllegalArgumentException`) — ใช้ `Exception.class` แบบกว้างเพื่อไม่เดาเกินซอร์สที่ให้มา
2. `Attributes` มี public API มาตรฐาน `put(String,String)` และ `get(String)` ตามที่ `Attribute` เรียกใช้งานจริงในซอร์ส (`parent.get`, `parent.indexOfKey`, `parent.keys/vals`)
3. `Attributes.dataPrefix` มีค่า `"data-"` (ค่าที่ใช้จริงใน jsoup แต่ไม่ได้แสดงในซอร์สที่ให้มา)
4. `Document.OutputSettings` มี default constructor และ `syntax(Syntax)` / `syntax()` ตามที่อ้างอิงในซอร์ส

```java
package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;

public class AttributeTest {

    // ================= Constructor =================

    @Test
    public void testConstructorTrimsKey() {
        Attribute attr = new Attribute("  foo  ", "bar");
        assertEquals("foo", attr.getKey());
        assertEquals("bar", attr.getValue());
    }

    @Test(expected = Exception.class) // สมมติ Validate.notNull throws (ไม่ระบุ type ชัดเจนจากซอร์สที่ให้มา)
    public void testConstructorNullKeyThrows() {
        new Attribute(null, "value");
    }

    @Test(expected = Exception.class) // trim แล้วว่าง -> Validate.notEmpty throws
    public void testConstructorEmptyKeyAfterTrimThrows() {
        new Attribute("   ", "value");
    }

    @Test
    public void testConstructorAllowsNullValue() {
        Attribute attr = new Attribute("key", null);
        assertNull(attr.getValue());
    }

    @Test
    public void testConstructorWithParent() {
        Attributes attrs = new Attributes();
        Attribute attr = new Attribute("key", "value", attrs);
        assertEquals("key", attr.getKey());
        assertEquals("value", attr.getValue());
    }

    // ================= getKey / getValue =================

    @Test
    public void testGetKeyGetValue() {
        Attribute attr = new Attribute("key", "value");
        assertEquals("key", attr.getKey());
        assertEquals("value", attr.getValue());
    }

    // ================= setKey =================

    @Test(expected = Exception.class)
    public void testSetKeyNullThrows() {
        Attribute attr = new Attribute("key", "value");
        attr.setKey(null);
    }

    @Test(expected = Exception.class)
    public void testSetKeyEmptyAfterTrimThrows() {
        Attribute attr = new Attribute("key", "value");
        attr.setKey("   ");
    }

    @Test
    public void testSetKeyNoParentDoesNotThrow() {
        // branch: parent == null -> skip if block
        Attribute attr = new Attribute("key", "value");
        attr.setKey("newKey");
        assertEquals("newKey", attr.getKey());
    }

    @Test
    public void testSetKeyWithParentKeyFoundUpdatesParent() {
        // branch: parent != null && indexOfKey found
        Attributes attrs = new Attributes();
        attrs.put("foo", "bar");
        Attribute attr = new Attribute("foo", "bar", attrs);
        attr.setKey("baz");
        assertEquals("baz", attr.getKey());
        assertEquals("bar", attrs.get("baz"));
    }

    @Test
    public void testSetKeyWithParentKeyNotFoundDoesNotThrow() {
        // branch: parent != null && indexOfKey == NotFound -> skip update
        Attributes attrs = new Attributes(); // ไม่มี key "foo" อยู่
        Attribute attr = new Attribute("foo", "bar", attrs);
        attr.setKey("baz");
        assertEquals("baz", attr.getKey());
    }

    // ================= setValue =================

    @Test
    public void testSetValueWithParentKeyFound() {
        Attributes attrs = new Attributes();
        attrs.put("foo", "bar");
        Attribute attr = new Attribute("foo", "bar", attrs);
        String old = attr.setValue("newVal");
        assertEquals("bar", old);
        assertEquals("newVal", attr.getValue());
        assertEquals("newVal", attrs.get("foo"));
    }

    @Test(expected = NullPointerException.class)
    public void testSetValueNoParentThrowsNPE_bugDetection() {
        // BUG: setValue() เรียก parent.get(this.key) แบบไม่ตรวจ null ก่อน if(parent != null)
        // ดังนั้นถ้า parent == null จะเกิด NullPointerException แน่นอน
        Attribute attr = new Attribute("key", "value"); // parent == null
        attr.setValue("newValue");
    }

    // ================= html(String,String,Appendable,OutputSettings) =================

    @Test
    public void testHtmlNonCollapsibleOutputsKeyValue() throws IOException {
        Document.OutputSettings out = new Document.OutputSettings();
        StringBuilder sb = new StringBuilder();
        Attribute.html("href", "index.html", sb, out);
        assertEquals("href=\"index.html\"", sb.toString());
    }

    @Test
    public void testHtmlNullValueAlwaysCollapsesRegardlessOfBooleanAttribute() throws IOException {
        // branch: val == null -> short-circuit true โดยไม่สน isBooleanAttribute
        Document.OutputSettings out = new Document.OutputSettings();
        out.syntax(Document.OutputSettings.Syntax.html);
        StringBuilder sb = new StringBuilder();
        Attribute.html("customkey", null, sb, out);
        assertEquals("customkey", sb.toString());
    }

    @Test
    public void testHtmlEmptyValueBooleanAttrCollapses() throws IOException {
        Document.OutputSettings out = new Document.OutputSettings();
        out.syntax(Document.OutputSettings.Syntax.html);
        StringBuilder sb = new StringBuilder();
        Attribute.html("checked", "", sb, out);
        assertEquals("checked", sb.toString());
    }

    @Test
    public void testHtmlEmptyValueNonBooleanAttrDoesNotCollapse() throws IOException {
        Document.OutputSettings out = new Document.OutputSettings();
        out.syntax(Document.OutputSettings.Syntax.html);
        StringBuilder sb = new StringBuilder();
        Attribute.html("customkey", "", sb, out);
        assertEquals("customkey=\"\"", sb.toString());
    }

    @Test
    public void testHtmlValueEqualsKeyIgnoreCaseBooleanAttrCollapses() throws IOException {
        Document.OutputSettings out = new Document.OutputSettings();
        out.syntax(Document.OutputSettings.Syntax.html);
        StringBuilder sb = new StringBuilder();
        Attribute.html("checked", "CHECKED", sb, out);
        assertEquals("checked", sb.toString());
    }

    @Test
    public void testHtmlXmlSyntaxNeverCollapsesEvenIfBoolean() throws IOException {
        // branch: out.syntax() != html -> overall false เสมอ
        Document.OutputSettings out = new Document.OutputSettings();
        out.syntax(Document.OutputSettings.Syntax.xml);
        StringBuilder sb = new StringBuilder();
        Attribute.html("checked", "checked", sb, out);
        assertEquals("checked=\"checked\"", sb.toString());
    }

    // ================= html() / toString() =================

    @Test
    public void testHtmlInstanceMethod() {
        Attribute attr = new Attribute("href", "index.html");
        assertEquals("href=\"index.html\"", attr.html());
    }

    @Test
    public void testToStringDelegatesToHtml() {
        Attribute attr = new Attribute("href", "index.html");
        assertEquals(attr.html(), attr.toString());
    }

    // ================= createFromEncoded =================

    @Test
    public void testCreateFromEncoded() {
        Attribute attr = Attribute.createFromEncoded("key", "a &amp; b");
        assertEquals("key", attr.getKey());
        assertEquals("a & b", attr.getValue());
    }

    // ================= isDataAttribute =================

    @Test
    public void testIsDataAttributeTrue() {
        // สมมติ Attributes.dataPrefix = "data-"
        Attribute attr = new Attribute("data-foo", "bar");
        assertTrue(attr.isDataAttribute());
    }

    @Test
    public void testIsDataAttributeFalseNoPrefix() {
        Attribute attr = new Attribute("foo", "bar");
        assertFalse(attr.isDataAttribute());
    }

    @Test
    public void testIsDataAttributeFalseWhenEqualsPrefixExactly() {
        // branch: key.length() > prefix.length() ต้องเป็น false เมื่อ key == prefix พอดี
        Attribute attr = new Attribute("data-", "bar");
        assertFalse(attr.isDataAttribute());
    }

    @Test
    public void testIsDataAttributeTrueBoundaryPrefixPlusOneChar() {
        Attribute attr = new Attribute("data-a", "bar");
        assertTrue(attr.isDataAttribute());
    }

    // ================= shouldCollapseAttribute (instance) =================

    @Test
    public void testShouldCollapseAttributeInstanceTrue() {
        Attribute attr = new Attribute("checked", null);
        Document.OutputSettings out = new Document.OutputSettings();
        out.syntax(Document.OutputSettings.Syntax.html);
        assertTrue(attr.shouldCollapseAttribute(out));
    }

    @Test
    public void testShouldCollapseAttributeInstanceFalseWhenXml() {
        Attribute attr = new Attribute("checked", null);
        Document.OutputSettings out = new Document.OutputSettings();
        out.syntax(Document.OutputSettings.Syntax.xml);
        assertFalse(attr.shouldCollapseAttribute(out));
    }

    // ================= isBooleanAttribute (static) =================

    @Test
    public void testIsBooleanAttributeStaticTrue() {
        assertTrue(Attribute.isBooleanAttribute("checked"));
    }

    @Test
    public void testIsBooleanAttributeStaticFalse() {
        assertFalse(Attribute.isBooleanAttribute("href"));
    }

    @Test
    public void testIsBooleanAttributeStaticBoundaryFirstElement() {
        assertTrue(Attribute.isBooleanAttribute("allowfullscreen"));
    }

    @Test
    public void testIsBooleanAttributeStaticBoundaryLastElement() {
        assertTrue(Attribute.isBooleanAttribute("typemustmatch"));
    }

    // ================= isBooleanAttribute (deprecated instance) =================

    @Test
    public void testIsBooleanAttributeInstanceTrueByName() {
        Attribute attr = new Attribute("checked", "checked");
        assertTrue(attr.isBooleanAttribute());
    }

    @Test
    public void testIsBooleanAttributeInstanceTrueByNullValue() {
        // branch: val == null -> true แม้ key ไม่อยู่ใน booleanAttributes
        Attribute attr = new Attribute("href", null);
        assertTrue(attr.isBooleanAttribute());
    }

    @Test
    public void testIsBooleanAttributeInstanceFalse() {
        Attribute attr = new Attribute("href", "index.html");
        assertFalse(attr.isBooleanAttribute());
    }

    // ================= equals =================

    @Test
    public void testEqualsSameInstance() {
        Attribute attr = new Attribute("key", "value");
        assertTrue(attr.equals(attr));
    }

    @Test
    public void testEqualsNull() {
        Attribute attr = new Attribute("key", "value");
        assertFalse(attr.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        Attribute attr = new Attribute("key", "value");
        assertFalse(attr.equals("not an attribute"));
    }

    @Test
    public void testEqualsSameKeyValue() {
        Attribute a1 = new Attribute("key", "value");
        Attribute a2 = new Attribute("key", "value");
        assertTrue(a1.equals(a2));
    }

    @Test
    public void testEqualsDifferentKey() {
        Attribute a1 = new Attribute("key1", "value");
        Attribute a2 = new Attribute("key2", "value");
        assertFalse(a1.equals(a2));
    }

    @Test
    public void testEqualsDifferentValue() {
        Attribute a1 = new Attribute("key", "value1");
        Attribute a2 = new Attribute("key", "value2");
        assertFalse(a1.equals(a2));
    }

    @Test
    public void testEqualsBothValueNull() {
        Attribute a1 = new Attribute("key", null);
        Attribute a2 = new Attribute("key", null);
        assertTrue(a1.equals(a2));
    }

    @Test
    public void testEqualsOneValueNull() {
        Attribute a1 = new Attribute("key", null);
        Attribute a2 = new Attribute("key", "value");
        assertFalse(a1.equals(a2));
        assertFalse(a2.equals(a1));
    }

    @Test
    public void testEqualsIgnoresParent() {
        // javadoc: "note parent not considered"
        Attributes attrs1 = new Attributes();
        Attributes attrs2 = new Attributes();
        Attribute a1 = new Attribute("key", "value", attrs1);
        Attribute a2 = new Attribute("key", "value", attrs2);
        assertTrue(a1.equals(a2));
    }

    // ================= hashCode =================

    @Test
    public void testHashCodeConsistentForEqualObjects() {
        Attribute a1 = new Attribute("key", "value");
        Attribute a2 = new Attribute("key", "value");
        assertEquals(a1.hashCode(), a2.hashCode());
    }

    @Test
    public void testHashCodeWithNullValueDoesNotThrow() {
        Attribute attr = new Attribute("key", null);
        attr.hashCode(); // ต้องไม่ throw exception
    }

    @Test
    public void testHashCodeDifferentForDifferentAttributes() {
        Attribute a1 = new Attribute("key1", "value");
        Attribute a2 = new Attribute("key2", "value");
        assertNotEquals(a1.hashCode(), a2.hashCode());
    }

    // ================= clone =================

    @Test
    public void testClone() {
        Attribute attr = new Attribute("key", "value");
        Attribute cloned = attr.clone();
        assertEquals(attr, cloned);
        assertNotSame(attr, cloned);
    }

    @Test
    public void testCloneIndependentKeyModification() {
        Attribute attr = new Attribute("key", "value");
        Attribute cloned = attr.clone();
        cloned.setKey("newKey");
        assertEquals("key", attr.getKey());
        assertEquals("newKey", cloned.getKey());
    }
}
```

## ตารางสรุป Branch/Condition ที่แต่ละเทสครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testConstructorTrimsKey` | constructor: key trim สำเร็จ (ไม่ throw) |
| `testConstructorNullKeyThrows` | constructor: `Validate.notNull(key)` throw เมื่อ key null |
| `testConstructorEmptyKeyAfterTrimThrows` | constructor: `Validate.notEmpty` throw หลัง trim เป็นค่าว่าง |
| `testConstructorAllowsNullValue` | constructor: val เป็น null ได้ (ไม่มีการ validate val) |
| `testConstructorWithParent` | constructor แบบมี parent |
| `testGetKeyGetValue` | getter ปกติ |
| `testSetKeyNullThrows` | setKey: null throw |
| `testSetKeyEmptyAfterTrimThrows` | setKey: trim ว่าง throw |
| `testSetKeyNoParentDoesNotThrow` | setKey: branch `parent == null` |
| `testSetKeyWithParentKeyFoundUpdatesParent` | setKey: branch `parent != null && indexOfKey found` |
| `testSetKeyWithParentKeyNotFoundDoesNotThrow` | setKey: branch `parent != null && indexOfKey == NotFound` |
| `testSetValueWithParentKeyFound` | setValue: branch `parent != null && indexOfKey found`, คืนค่า oldVal ถูกต้อง |
| `testSetValueNoParentThrowsNPE_bugDetection` | **ดักจับบัค**: `parent.get()` ถูกเรียกก่อนตรวจ null |
| `testHtmlNonCollapsibleOutputsKeyValue` | static html(): branch `shouldCollapseAttribute == false` |
| `testHtmlNullValueAlwaysCollapsesRegardlessOfBooleanAttribute` | shouldCollapseAttribute: branch `val == null` short-circuit |
| `testHtmlEmptyValueBooleanAttrCollapses` | shouldCollapseAttribute: `"".equals(val) && isBooleanAttribute == true` |
| `testHtmlEmptyValueNonBooleanAttrDoesNotCollapse` | shouldCollapseAttribute: `"".equals(val) && isBooleanAttribute == false` |
| `testHtmlValueEqualsKeyIgnoreCaseBooleanAttrCollapses` | shouldCollapseAttribute: `val.equalsIgnoreCase(key) && isBooleanAttribute` |
| `testHtmlXmlSyntaxNeverCollapsesEvenIfBoolean` | shouldCollapseAttribute: branch `syntax != html` → false เสมอ |
| `testHtmlInstanceMethod` | instance `html()` call path |
| `testToStringDelegatesToHtml` | `toString()` delegate |
| `testCreateFromEncoded` | static factory + unescape |
| `testIsDataAttributeTrue` / `...FalseNoPrefix` / `...FalseWhenEqualsPrefixExactly` / `...TrueBoundaryPrefixPlusOneChar` | isDataAttribute: ทุกเงื่อนไข prefix + length boundary |
| `testShouldCollapseAttributeInstanceTrue` / `...FalseWhenXml` | instance wrapper ของ shouldCollapseAttribute |
| `testIsBooleanAttributeStaticTrue/False/BoundaryFirst/BoundaryLast` | static binarySearch: true/false + ขอบเขต array |
| `testIsBooleanAttributeInstanceTrueByName/TrueByNullValue/False` | deprecated instance method: ทั้งสอง branch ของ OR |
| `testEqualsSameInstance` | equals: `this == o` |
| `testEqualsNull` | equals: `o == null` |
| `testEqualsDifferentClass` | equals: class ต่างกัน |
| `testEqualsSameKeyValue` | equals: true case ปกติ |
| `testEqualsDifferentKey` / `...DifferentValue` | equals: false cases |
| `testEqualsBothValueNull` / `...OneValueNull` | equals: null-safety ของ val |
| `testEqualsIgnoresParent` | equals: parent ไม่ถูกนำมาพิจารณา |
| `testHashCodeConsistentForEqualObjects` / `...WithNullValueDoesNotThrow` / `...DifferentForDifferentAttributes` | hashCode: val null/not-null branch |
| `testClone` / `testCloneIndependentKeyModification` | clone(): การทำงานปกติและ independence |

**ข้อจำกัดที่ควรทราบ:** เทส `testSetValueNoParentThrowsNPE_bugDetection` ออกแบบมาเพื่อดักจับข้อบกพร่องจริงในซอร์สโค้ด (`parent.get(this.key)` ถูกเรียกก่อนตรวจสอบ `if (parent != null)`) ซึ่งเป็นจุดที่มีโอกาสสูงที่จะเป็น fault ตามที่ระบุใน Defects4J Jsoup-85b