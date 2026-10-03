package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.parser.Tag;

import java.util.List;

import static org.junit.Assert.*;

public class NodeTest {

    // Concrete subclass of Node for testing abstract methods
    private static class DummyNode extends Node {
        private final String nodeName;

        public DummyNode(String baseUri, Attributes attributes, String nodeName) {
            super(baseUri, attributes);
            this.nodeName = nodeName;
        }

        public DummyNode(String baseUri) {
            super(baseUri);
            this.nodeName = "dummy";
        }

        public DummyNode() {
            super();
            this.nodeName = "dummy";
        }

        @Override
        public String nodeName() {
            return nodeName;
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
    public void testConstructors() {
        DummyNode node1 = new DummyNode("http://example.com", new Attributes(), "test");
        assertEquals("http://example.com", node1.baseUri());
        assertNotNull(node1.attributes());

        DummyNode node2 = new DummyNode("http://example.com/");
        assertEquals("http://example.com/", node2.baseUri());

        DummyNode node3 = new DummyNode();
        assertNull(node3.attributes());
        assertTrue(node3.childNodes().isEmpty());
    }

    @Test
    public void testAttrGetAndSet() {
        DummyNode node = new DummyNode("http://example.com");
        node.attr("key1", "value1");

        // Existing attribute
        assertEquals("value1", node.attr("key1"));
        assertTrue(node.hasAttr("key1"));

        // Non-existing attribute falling back to abs:
        node.attr("href", "http://example.com/abs");
        assertEquals("http://example.com/abs", node.attr("abs:href"));

        // Non-existing attribute returning empty string
        assertEquals("", node.attr("nonexistent"));

        // Remove attribute
        node.removeAttr("key1");
        assertFalse(node.hasAttr("key1"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAttrNullKeyValidation() {
        DummyNode node = new DummyNode("http://example.com");
        node.attr(null);
    }

    @Test
    public void testAbsUrlEdgeCases() {
        DummyNode node = new DummyNode("http://example.com/path/file");

        // Missing attribute
        assertEquals("", node.absUrl("missing"));

        // Absolute URL in attribute
        node.attr("href", "https://other.com/page");
        assertEquals("https://other.com/page", node.absUrl("href"));

        // Relative URL
        node.attr("href", "subpage");
        assertEquals("http://example.com/path/subpage", node.absUrl("href"));

        // Relative URL starting with ? (query params)
        node.attr("href", "?query=1");
        assertEquals("http://example.com/path/file?query=1", node.absUrl("href"));

        // Malformed base URI, but absolute relUrl
        DummyNode badBase = new DummyNode("invalid-uri");
        badBase.attr("href", "http://absolute.com");
        assertEquals("http://absolute.com", badBase.absUrl("href"));

        // Malformed base and malformed rel
        DummyNode completelyBad = new DummyNode("invalid-uri");
        completelyBad.attr("href", "not-a-url");
        assertEquals("", completelyBad.absUrl("href"));
    }

    @Test
    public void testOwnerDocument() {
        Document doc = new Document("http://example.com");
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        doc.appendChild(el);

        DummyNode orphan = new DummyNode("http://example.com");

        assertSame(doc, doc.ownerDocument());
        assertSame(doc, el.ownerDocument());
        assertNull(orphan.ownerDocument());
    }

    @Test
    public void testSiblingNavigation() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        DummyNode child1 = new DummyNode("http://example.com");
        DummyNode child2 = new DummyNode("http://example.com");
        DummyNode child3 = new DummyNode("http://example.com");

        parent.addChildren(child1, child2, child3);

        assertNull(child1.previousSibling());
        assertSame(child2, child1.nextSibling());
        assertSame(child1, child2.previousSibling());
        assertSame(child3, child2.nextSibling());
        assertNull(child3.nextSibling());

        // Orphan node sibling checks
        DummyNode orphan = new DummyNode("http://example.com");
        assertNull(orphan.nextSibling());
    }

    @Test
    public void testDOMManipulationBeforeAfter() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        DummyNode middle = new DummyNode("http://example.com", new Attributes(), "mid");
        parent.appendChild(middle);

        // Before Node
        DummyNode beforeNode = new DummyNode("http://example.com", new Attributes(), "before");
        middle.before(beforeNode);
        assertSame(beforeNode, parent.childNode(0));

        // After Node
        DummyNode afterNode = new DummyNode("http://example.com", new Attributes(), "after");
        middle.after(afterNode);
        assertSame(afterNode, parent.childNode(2));

        // Before HTML & After HTML
        middle.before("<span id='b'>b</span>");
        middle.after("<span id='a'>a</span>");
        assertTrue(parent.childNode(0) instanceof Element);
    }

    @Test
    public void testReplaceAndRemove() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        DummyNode child = new DummyNode("http://example.com");
        parent.appendChild(child);

        DummyNode replacement = new DummyNode("http://example.com", new Attributes(), "rep");
        child.replaceWith(replacement);
        assertSame(replacement, parent.childNode(0));
        assertNull(child.parent());

        replacement.remove();
        assertTrue(parent.childNodes().isEmpty());
    }

    @Test
    public void testWrapAndDeepChild() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        DummyNode child = new DummyNode("http://example.com", new Attributes(), "span");
        parent.appendChild(child);

        child.wrap("<div class='wrapper'><p></p></div>");
        assertNotNull(child.parent());
        assertEquals("div", child.parent().nodeName());
    }

    @Test
    public void testCloneAndEqualsHashCode() {
        DummyNode node1 = new DummyNode("http://example.com", new Attributes(), "test");
        node1.attr("class", "box");

        Node clone = node1.clone();
        assertNotSame(node1, clone);
        assertEquals(node1.baseUri(), clone.baseUri());
        assertEquals(node1.attr("class"), clone.attr("class"));

        assertFalse(node1.equals(new Object()));
        assertFalse(node1.equals(null));
        assertTrue(node1.hashCode() != 0);
    }
}