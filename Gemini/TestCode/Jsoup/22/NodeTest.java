package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.parser.Parser;
import java.util.List;

import static org.junit.Assert.*;

public class NodeTest {

    // Concrete subclass ย่อยสำหรับใช้ทดสอบ Abstract Class Node
    private static class DummyNode extends Node {
        private final String nodeName;

        public DummyNode(String baseUri, String nodeName) {
            super(baseUri);
            this.nodeName = nodeName;
        }

        public DummyNode() {
            super();
        }

        @Override
        public String nodeName() {
            return nodeName != null ? nodeName : "dummy";
        }

        @Override
        void outerHtmlHead(StringBuilder accum, int depth, Document.OutputSettings out) {
            accum.append("<").append(nodeName()).append(">");
        }

        @Override
        void outerHtmlTail(StringBuilder accum, int depth, Document.OutputSettings out) {
            accum.append("</").append(nodeName()).append(">");
        }
    }

    @Test
    public void testConstructorAndBasicGetters() {
        Attributes attrs = new Attributes();
        attrs.put("key1", "val1");
        DummyNode node = new DummyNode("http://example.com/path", "test");
        
        assertEquals("http://example.com/path", node.baseUri());
        assertNotNull(node.attributes());
        assertNotNull(node.childNodes());
        assertTrue(node.childNodes().isEmpty());
        assertNull(node.parent());
    }

    @Test
    public void testDefaultConstructorEdgeCases() {
        DummyNode node = new DummyNode();
        assertNull(node.attributes());
        assertNotNull(node.childNodes());
        assertTrue(node.childNodes().isEmpty());
    }

    @Test
    public void testAttrBranches() {
        DummyNode node = new DummyNode("http://example.com/", "test");
        node.attr("normal", "value");
        node.attr("href", "http://abs.com/page");

        // Branch 1: Attribute exists
        assertEquals("value", node.attr("normal"));

        // Branch 2: Starts with abs: (resolves relative url)
        assertEquals("http://example.com/page", node.attr("abs:href"));

        // Branch 3: Not present, returns empty string
        assertEquals("", node.attr("missing"));
    }

    @Test
    public void testHasAttrBranches() {
        DummyNode node = new DummyNode("http://example.com/", "test");
        node.attr("href", "page.html");

        // abs: prefix where absUrl is valid
        assertTrue(node.hasAttr("abs:href"));
        
        // normal attribute exists
        assertTrue(node.hasAttr("href"));

        // attribute does not exist
        assertFalse(node.hasAttr("abs:missing"));
        assertFalse(node.hasAttr("missing"));
    }

    @Test
    public void testAbsUrlEdgeCases() {
        // Case 1: Missing attribute -> returns ""
        DummyNode node = new DummyNode("http://example.com/base", "test");
        assertEquals("", node.absUrl("missing"));

        // Case 2: Base URI is malformed, but attribute is absolute URL
        DummyNode badBaseNode = new DummyNode("malformed-uri", "test");
        badBaseNode.attr("href", "https://absolute.com/path");
        assertEquals("https://absolute.com/path", badBaseNode.absUrl("href"));

        // Case 3: Relative URL starts with '?' (forces base.getPath() + relUrl)
        DummyNode queryNode = new DummyNode("http://example.com/path/file.html", "test");
        queryNode.attr("href", "?query=1");
        assertEquals("http://example.com/path/?query=1", queryNode.absUrl("href"));

        // Case 4: Completely malformed both base and rel -> returns ""
        DummyNode failNode = new DummyNode("bad-base", "test");
        failNode.attr("href", "bad-rel");
        assertEquals("", failNode.absUrl("href"));
    }

    @Test
    public void testOwnerDocumentHierarchy() {
        Document doc = new Document("http://example.com");
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        DummyNode child = new DummyNode("http://example.com", "span");

        // Orphan node with no parent -> ownerDocument should be null
        assertNull(child.ownerDocument());

        // Attach hierarchy
        doc.appendChild(el);
        el.appendChild(child);

        // Should traverse up to Document
        assertEquals(doc, child.ownerDocument());
        assertEquals(doc, el.ownerDocument());
        assertEquals(doc, doc.ownerDocument());
    }

    @Test
    public void testSiblingNavigationEdges() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        DummyNode node1 = new DummyNode("http://example.com", "a");
        DummyNode node2 = new DummyNode("http://example.com", "b");
        DummyNode node3 = new DummyNode("http://example.com", "c");

        parent.addChildren(node1, node2, node3);

        // Root / No parent siblings
        DummyNode orphan = new DummyNode("http://example.com", "orphan");
        assertNull(orphan.nextSibling());
        assertNull(orphan.previousSibling());

        // Node 1
        assertNull(node1.previousSibling());
        assertEquals(node2, node1.nextSibling());

        // Node 2
        assertEquals(node1, node2.previousSibling());
        assertEquals(node3, node2.nextSibling());

        // Node 3
        assertEquals(node2, node3.previousSibling());
        assertNull(node3.nextSibling());
    }

    @Test
    public void testSetBaseUriTraversal() {
        Element parent = new Element(Tag.valueOf("div"), "http://old.com");
        DummyNode child = new DummyNode("http://old.com", "span");
        parent.appendChild(child);

        parent.setBaseUri("http://new.com");

        assertEquals("http://new.com", parent.baseUri());
        assertEquals("http://new.com", child.baseUri());
    }

    @Test
    public void testCloneNode() {
        DummyNode original = new DummyNode("http://example.com", "orig");
        original.attr("key", "val");
        DummyNode child = new DummyNode("http://example.com", "child");
        original.appendChild(child);

        Node clone = original.clone();
        
        assertNotSame(original, clone);
        assertEquals(original.nodeName(), clone.nodeName());
        assertEquals(original.baseUri(), clone.baseUri());
        assertEquals("val", clone.attr("key"));
        assertEquals(1, clone.childNodes().size());
        assertNull(clone.parent());
        assertNotNull(clone.childNodes().get(0).parent());
    }

    @Test
    public void testRemoveAndReplaceChild() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        DummyNode node1 = new DummyNode("http://example.com", "1");
        DummyNode node2 = new DummyNode("http://example.com", "2");

        parent.addChildren(node1, node2);
        assertEquals(2, parent.childNodes().size());

        node1.remove();
        assertEquals(1, parent.childNodes().size());
        assertEquals(node2, parent.childNode(0));
        assertEquals(0, node2.siblingIndex());

        DummyNode node3 = new DummyNode("http://example.com", "3");
        node2.replaceWith(node3);
        assertEquals(node3, parent.childNode(0));
        assertNull(node2.parent());
        assertEquals(parent, node3.parent());
    }

    @Test
    public void testUnwrapNode() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element wrapper = new Element(Tag.valueOf("span"), "http://example.com");
        DummyNode textChild = new DummyNode("http://example.com", "#text");
        
        wrapper.appendChild(textChild);
        parent.appendChild(wrapper);

        Node result = wrapper.unwrap();
        
        assertEquals(textChild, result);
        assertNull(wrapper.parent());
        assertEquals(1, parent.childNodes().size());
        assertEquals(textChild, parent.childNode(0));
    }
}