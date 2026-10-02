# การวิเคราะห์

`LeafNode` เป็น `abstract class` ที่ไม่มี `public` modifier (package-private) จึงต้องสร้าง `LeafNodeTest` ไว้ใน package `org.jsoup.nodes` เดียวกัน และเนื่องจากเป็น abstract class ไม่สามารถ instantiate ได้ตรง ๆ จึงต้องใช้ concrete subclass ที่มีอยู่จริงในโค้ดเบส jsoup คือ `TextNode` (ซึ่ง extends `LeafNode`) เพื่อเรียกใช้เมธอดทั้งหมดที่ `LeafNode` ประกาศ

**หมายเหตุสำคัญ (assumption ที่ไม่มีอยู่ในซอร์สที่ให้มา แต่จำเป็นต่อการรันเทส):**
- `TextNode(String text)` constructor — เดาจาก fact ว่า `LeafNode.baseUri()` ถูก refactor ให้ delegate ไปยัง parent แล้ว (จึงไม่ควรมี baseUri เก็บต่อ node)
- `Document(String baseUri)`, `Node.appendChild(Node)`, `Node.parent()`, `Node.hasParent()` — เป็น public API มาตรฐานของ jsoup ที่ `LeafNode` เรียกใช้อยู่แล้ว (`hasParent()`, `parent()`) แต่ signature ไม่ได้แสดงในซอร์สที่ให้มา
- `Validate.notNull()` throw `IllegalArgumentException` — สมมติฐานจากพฤติกรรมทั่วไปของ jsoup's `Validate`
- `Node.EmptyString` มีค่าเท่ากับ `""`
- `super.absUrl(key)` คืนค่า `""` เมื่อไม่มี attribute — พฤติกรรมมาตรฐานของ `Node.absUrl`

```java
package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit tests for {@link LeafNode}.
 *
 * LeafNode is package-private & abstract -> ทดสอบผ่าน concrete subclass TextNode
 * ซึ่งมีอยู่จริงในโค้ดเบส jsoup (ไม่ได้ให้ source มาในโจทย์ จึงมีสมมติฐานบางส่วน
 * ตามที่ระบุไว้ด้านบนของคำตอบ)
 */
public class LeafNodeTest {

    private TextNode node;

    @Before
    public void setUp() {
        node = new TextNode("hello"); // assumption: TextNode(String) ctor
    }

    // ---------- hasAttributes() ----------

    @Test
    public void hasAttributes_falseBeforeAnyAttributeAccess() {
        assertFalse(node.hasAttributes());
    }

    @Test
    public void hasAttributes_trueAfterEnsureAttributesTriggered() {
        node.attributes(); // forces ensureAttributes()
        assertTrue(node.hasAttributes());
    }

    // ---------- attributes() / ensureAttributes() ----------

    @Test
    public void attributes_convertsCoreStringValueIntoAttributeUnderNodeName() {
        Attributes attrs = node.attributes();
        assertNotNull(attrs);
        assertEquals("hello", attrs.get(node.nodeName()));
    }

    @Test
    public void attributes_calledTwiceReturnsSameConvertedInstance() {
        Attributes first = node.attributes();
        Attributes second = node.attributes();
        assertSame(first, second); // ensureAttributes() ไม่สร้างใหม่ซ้ำ (if !hasAttributes() เป็น false รอบสอง)
    }

    // ---------- coreValue() / coreValue(String) ----------

    @Test
    public void coreValue_getReturnsInitialValue() {
        assertEquals("hello", node.coreValue());
    }

    @Test
    public void coreValue_setUpdatesValue() {
        node.coreValue("world");
        assertEquals("world", node.coreValue());
    }

    // ---------- attr(String key) ----------

    @Test
    public void attr_get_nullKeyThrows() {
        try {
            node.attr(null);
            fail("Expected exception for null key");
        } catch (IllegalArgumentException e) {
            // assumption: Validate.notNull throws IllegalArgumentException
        }
    }

    @Test
    public void attr_get_withoutAttributes_matchingNodeNameReturnsValue() {
        assertFalse(node.hasAttributes());
        assertEquals("hello", node.attr(node.nodeName()));
    }

    @Test
    public void attr_get_withoutAttributes_nonMatchingKeyReturnsEmptyString() {
        assertFalse(node.hasAttributes());
        assertEquals("", node.attr("doesNotExist")); // assumption: EmptyString == ""
    }

    @Test
    public void attr_get_withAttributes_delegatesToSuper() {
        node.attr("custom", "value"); // forces ensureAttributes via else-branch
        assertTrue(node.hasAttributes());
        assertEquals("value", node.attr("custom"));
        assertEquals("hello", node.attr(node.nodeName())); // core value ยังอยู่ใน attributes
    }

    // ---------- attr(String key, String value) ----------

    @Test
    public void attrSet_noAttributesYet_matchingNodeName_setsValueDirectly() {
        node.attr(node.nodeName(), "newCoreValue");
        assertFalse(node.hasAttributes()); // ไม่ควรสร้าง Attributes
        assertEquals("newCoreValue", node.coreValue());
    }

    @Test
    public void attrSet_noAttributesYet_differentKey_triggersEnsureAttributes() {
        node.attr("foo", "bar");
        assertTrue(node.hasAttributes());
        assertEquals("bar", node.attr("foo"));
    }

    @Test
    public void attrSet_alreadyHasAttributes_goesThroughElseBranch() {
        node.attributes(); // force attributes ไว้ก่อน
        node.attr(node.nodeName(), "updated");
        assertTrue(node.hasAttributes());
        assertEquals("updated", node.attr(node.nodeName()));
    }

    @Test
    public void attrSet_returnsSameNodeInstanceForChaining() {
        Node returned = node.attr("k", "v");
        assertSame(node, returned);
    }

    // ---------- hasAttr(String key) ----------

    @Test
    public void hasAttr_triggersEnsureAttributes_andReturnsFalseWhenAbsent() {
        assertFalse(node.hasAttributes());
        assertFalse(node.hasAttr("missing"));
        assertTrue(node.hasAttributes()); // ensureAttributes ถูกเรียกเสมอ
    }

    @Test
    public void hasAttr_returnsTrueWhenPresent() {
        node.attr("key1", "v1");
        assertTrue(node.hasAttr("key1"));
    }

    // ---------- removeAttr(String key) ----------

    @Test
    public void removeAttr_triggersEnsureAttributes_andRemovesKey() {
        node.attr("key2", "v2");
        assertTrue(node.hasAttr("key2"));
        node.removeAttr("key2");
        assertFalse(node.hasAttr("key2"));
    }

    @Test
    public void removeAttr_onNodeWithoutPriorAttributes_stillWorks() {
        assertFalse(node.hasAttributes());
        node.removeAttr("anything"); // ไม่ควร throw, ensureAttributes ถูกเรียก
        assertTrue(node.hasAttributes());
    }

    // ---------- absUrl(String key) ----------

    @Test
    public void absUrl_triggersEnsureAttributes_noAttrPresent() {
        assertFalse(node.hasAttributes());
        String result = node.absUrl("href");
        assertTrue(node.hasAttributes());
        assertEquals("", result); // assumption: super.absUrl คืน "" เมื่อไม่มี attribute
    }

    // ---------- baseUri() ----------

    @Test
    public void baseUri_noParent_returnsEmptyString() {
        assertFalse(node.hasParent());
        assertEquals("", node.baseUri());
    }

    @Test
    public void baseUri_withParent_delegatesToParentBaseUri() {
        Document doc = new Document("http://example.com/"); // assumption: ctor Document(String)
        doc.appendChild(node); // assumption: appendChild มีอยู่บน Node
        assertTrue(node.hasParent());
        assertEquals(doc.baseUri(), node.baseUri());
    }

    // ---------- doSetBaseUri(String) ----------

    @Test
    public void doSetBaseUri_isNoop_doesNotThrowAndDoesNotAffectBaseUri() {
        node.doSetBaseUri("http://ignored.example/");
        // เป็น no-op ตามซอร์ส -> baseUri ต้องยังเป็น "" (ไม่มี parent)
        assertEquals("", node.baseUri());
    }

    // ---------- childNodeSize() ----------

    @Test
    public void childNodeSize_isAlwaysZero() {
        assertEquals(0, node.childNodeSize());
    }

    // ---------- ensureChildNodes() ----------

    @Test(expected = UnsupportedOperationException.class)
    public void ensureChildNodes_throwsUnsupportedOperationException() {
        node.ensureChildNodes();
    }
}
```

**หมายเหตุเกี่ยวกับ branch ที่ไม่สามารถทดสอบได้จากซอร์สที่ให้มา:**
ใน `ensureAttributes()` มีเงื่อนไข `if (coreValue != null)` — ไม่สามารถทดสอบกรณี `coreValue == null` ได้ เพราะไม่มี concrete subclass ที่สร้าง `LeafNode.value = null` ได้จาก public API ที่ทราบ (TextNode constructor บังคับ text ไม่ null) จึงไม่เขียนเทสสำหรับ branch นี้ตามข้อกำหนดห้ามเดา

## ตารางสรุป Branch/Condition Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `hasAttributes_falseBeforeAnyAttributeAccess` | `hasAttributes()` → false (value เป็น String) |
| `hasAttributes_trueAfterEnsureAttributesTriggered` | `hasAttributes()` → true (value เป็น Attributes) |
| `attributes_convertsCoreStringValueIntoAttributeUnderNodeName` | `ensureAttributes()`: `!hasAttributes()`=true, `coreValue != null`=true |
| `attributes_calledTwiceReturnsSameConvertedInstance` | `ensureAttributes()`: `!hasAttributes()`=false (ครั้งที่ 2) |
| `coreValue_getReturnsInitialValue` | `coreValue()` → `attr(nodeName())` path ไม่มี attributes |
| `coreValue_setUpdatesValue` | `coreValue(String)` → `attr(key,value)` |
| `attr_get_nullKeyThrows` | `attr(String key)`: `Validate.notNull` throw |
| `attr_get_withoutAttributes_matchingNodeNameReturnsValue` | `attr(key)`: `!hasAttributes()`=true, `key.equals(nodeName())`=true |
| `attr_get_withoutAttributes_nonMatchingKeyReturnsEmptyString` | `attr(key)`: `!hasAttributes()`=true, key ไม่ตรง → EmptyString |
| `attr_get_withAttributes_delegatesToSuper` | `attr(key)`: `hasAttributes()`=true → `super.attr(key)` |
| `attrSet_noAttributesYet_matchingNodeName_setsValueDirectly` | `attr(key,value)`: `!hasAttributes() && key.equals(nodeName())` = true |
| `attrSet_noAttributesYet_differentKey_triggersEnsureAttributes` | `attr(key,value)`: condition false เพราะ key ไม่ตรง → else branch |
| `attrSet_alreadyHasAttributes_goesThroughElseBranch` | `attr(key,value)`: condition false เพราะ `hasAttributes()`=true → else branch |
| `attrSet_returnsSameNodeInstanceForChaining` | return value ของ `attr(key,value)` |
| `hasAttr_triggersEnsureAttributes_andReturnsFalseWhenAbsent` | `hasAttr()` → ensureAttributes + super.hasAttr false case |
| `hasAttr_returnsTrueWhenPresent` | `hasAttr()` → super.hasAttr true case |
| `removeAttr_triggersEnsureAttributes_andRemovesKey` | `removeAttr()` → ensureAttributes + super.removeAttr (มี key) |
| `removeAttr_onNodeWithoutPriorAttributes_stillWorks` | `removeAttr()` → ensureAttributes เมื่อยังไม่มี attributes |
| `absUrl_triggersEnsureAttributes_noAttrPresent` | `absUrl()` → ensureAttributes + super.absUrl |
| `baseUri_noParent_returnsEmptyString` | `baseUri()`: `hasParent()`=false |
| `baseUri_withParent_delegatesToParentBaseUri` | `baseUri()`: `hasParent()`=true |
| `doSetBaseUri_isNoop_doesNotThrowAndDoesNotAffectBaseUri` | `doSetBaseUri()` no-op |
| `childNodeSize_isAlwaysZero` | `childNodeSize()` → 0 |
| `ensureChildNodes_throwsUnsupportedOperationException` | `ensureChildNodes()` → throw |