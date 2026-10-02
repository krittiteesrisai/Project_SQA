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
