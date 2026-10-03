package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;

public class LeafNodeTest {

    // Concrete subclass ของ LeafNode เพื่อใช้ในการทดสอบ
    private static class DummyLeafNode extends LeafNode {
        private final String nodeName;

        public DummyLeafNode(String nodeName, String value) {
            this.nodeName = nodeName;
            this.value = value;
        }

        @Override
        public String nodeName() {
            return nodeName;
        }
    }

    @Test
    public void testHasAttributesAndEnsureAttributes() {
        DummyLeafNode node = new DummyLeafNode("div", "initialValue");
        assertFalse(node.hasAttributes());

        // บังคับสร้าง Attributes (กรณี coreValue != null)
        Attributes attrs = node.attributes();
        assertNotNull(attrs);
        assertTrue(node.hasAttributes());
        assertEquals("initialValue", node.attr("div"));
    }

    @Test
    public void testEnsureAttributesWithNullCoreValue() {
        DummyLeafNode node = new DummyLeafNode("span", null);
        assertFalse(node.hasAttributes());

        Attributes attrs = node.attributes();
        assertNotNull(attrs);
        assertTrue(node.hasAttributes());
        assertEquals("", node.attr("span"));
    }

    @Test
    public void testCoreValueGetterAndSetter() {
        DummyLeafNode node = new DummyLeafNode("p", "hello");
        assertEquals("hello", node.coreValue());

        node.coreValue("world");
        assertEquals("world", node.coreValue());
    }

    @Test
    public void testAttrGetWithoutAttributes() {
        DummyLeafNode node = new DummyLeafNode("b", "boldText");
        
        // key ตรงกับ nodeName
        assertEquals("boldText", node.attr("b"));
        
        // key ไม่ตรงกับ nodeName (ควรได้ EmptyString "")
        assertEquals("", node.attr("otherKey"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAttrGetNullKey() {
        DummyLeafNode node = new DummyLeafNode("b", "boldText");
        node.attr(null);
    }

    @Test
    public void testAttrGetWithAttributes() {
        DummyLeafNode node = new DummyLeafNode("b", "boldText");
        node.attr("customAttr", "customVal"); // ทำให้แปลงเป็น Attributes
        
        assertTrue(node.hasAttributes());
        assertEquals("customVal", node.attr("customAttr"));
        assertEquals("", node.attr("nonExistent"));
    }

    @Test
    public void testAttrSetWithoutAttributesMatchingNodeName() {
        DummyLeafNode node = new DummyLeafNode("a", "oldVal");
        node.attr("a", "newVal");
        
        // ควรเปลี่ยน value โดยตรง ไม่สร้าง Attributes Map
        assertFalse(node.hasAttributes());
        assertEquals("newVal", node.coreValue());
    }

    @Test
    public void testAttrSetWithoutAttributesNotMatchingNodeName() {
        DummyLeafNode node = new DummyLeafNode("a", "oldVal");
        node.attr("href", "http://example.com");
        
        // ควรบังคับสร้าง Attributes และเพิ่มค่าเข้าไป
        assertTrue(node.hasAttributes());
        assertEquals("http://example.com", node.attr("href"));
    }

    @Test
    public void testHasAttr() {
        DummyLeafNode node = new DummyLeafNode("div", "val");
        assertFalse(node.hasAttr("other"));
        
        node.attr("other", "val2");
        assertTrue(node.hasAttr("other"));
    }

    @Test
    public void testRemoveAttr() {
        DummyLeafNode node = new DummyLeafNode("div", "val");
        node.attr("removable", "yes");
        assertTrue(node.hasAttr("removable"));
        
        node.removeAttr("removable");
        assertFalse(node.hasAttr("removable"));
    }

    @Test
    public void testAbsUrl() {
        DummyLeafNode node = new DummyLeafNode("a", "val");
        node.attr("abs:href", "http://example.com/path");
        // ทดสอบเรียก absUrl ผ่าน LeafNode
        assertEquals("http://example.com/path", node.absUrl("abs:href"));
    }

    @Test
    public void testBaseUriWithoutParent() {
        DummyLeafNode node = new DummyLeafNode("div", "val");
        assertEquals("", node.baseUri());
    }

    @Test
    public void testBaseUriWithParent() {
        Document doc = new Document("http://example.com");
        DummyLeafNode node = new DummyLeafNode("div", "val");
        doc.appendChild(node);

        assertEquals("http://example.com", node.baseUri());
    }

    @Test
    public void testDoSetBaseUri() {
        DummyLeafNode node = new DummyLeafNode("div", "val");
        node.doSetBaseUri("http://test.com"); // เป็น noop เมธอด ไม่ควรเกิด Exception ใดๆ
        assertEquals("", node.baseUri());
    }

    @Test
    public void testChildNodeSize() {
        DummyLeafNode node = new DummyLeafNode("div", "val");
        assertEquals(0, node.childNodeSize());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testEnsureChildNodesThrowsException() {
        DummyLeafNode node = new DummyLeafNode("div", "val");
        node.ensureChildNodes();
    }
}