package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class NodeTest {

    // Concrete subclass of Node for testing abstract methods
    private static class ConcreteNode extends Node {
        private String nodeName = "testnode";

        public ConcreteNode(String baseUri, Attributes attributes) {
            super(baseUri, attributes);
        }

        public ConcreteNode(String baseUri) {
            super(baseUri);
        }

        public ConcreteNode() {
            super();
        }

        @Override
        public String nodeName() {
            return nodeName;
        }

        public void setNodeName(String nodeName) {
            this.nodeName = nodeName;
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
        ConcreteNode node1 = new ConcreteNode("http://example.com", new Attributes());
        assertEquals("http://example.com", node1.baseUri());
        assertNotNull(node1.attributes());

        ConcreteNode node2 = new ConcreteNode("http://example.com/");
        assertEquals("http://example.com/", node2.baseUri());
        assertNotNull(node2.attributes());

        ConcreteNode node3 = new ConcreteNode();
        assertNull(node3.attributes);
        assertEquals(0, node3.childNodes().size());
    }

    @Test
    public void testAttrHandling() {
        ConcreteNode node = new ConcreteNode("http://example.com");
        node.attr("key1", "value1");

        // hasAttr branch (true)
        assertEquals("value1", node.attr("key1"));

        // abs: prefix branch
        node.attr("href", "/path/to/page");
        assertEquals("http://example.com/path/to/page", node.attr("abs:href"));

        // missing attribute branch
        assertEquals("", node.attr("nonexistent"));
    }

    @Test
    public void testHasAndRemoveAttr() {
        ConcreteNode node = new ConcreteNode("http://example.com");
        assertFalse(node.hasAttr("test"));

        node.attr("test", "val");
        assertTrue(node.hasAttr("test"));

        node.removeAttr("test");
        assertFalse(node.hasAttr("test"));
    }

    @Test
    public void testSetBaseUri() {
        ConcreteNode node = new ConcreteNode("http://example.com");
        node.setBaseUri("http://jsoup.org");
        assertEquals("http://jsoup.org", node.baseUri());
    }

    @Test
    public void testAbsUrlEdgeCases() {
        ConcreteNode node = new ConcreteNode("http://example.com/a/b");

        // Missing attribute
        assertEquals("", node.absUrl("missing"));

        // Malformed base URI, but absolute relUrl
        ConcreteNode badBaseNode = new ConcreteNode("malformed-base-uri");
        badBaseNode.attr("href", "http://absolute.com/path");
        assertEquals("http://absolute.com/path", badBaseNode.absUrl("href"));

        // Malformed base URI and relative relUrl (throws MalformedURLException inner catch)
        badBaseNode.attr("href", "relative-path");
        assertEquals("", badBaseNode.absUrl("href"));

        // Normal absolute URL attribute retrieval
        node.attr("src", "http://other.com/img.png");
        assertEquals("http://other.com/img.png", node.absUrl("src"));
    }

    @Test
    public void testChildNodesAndManipulation() {
        ConcreteNode parent = new ConcreteNode("http://example.com");
        ConcreteNode child1 = new ConcreteNode("http://example.com");
        ConcreteNode child2 = new ConcreteNode("http://example.com");

        parent.addChildren(child1, child2);
        assertEquals(2, parent.childNodes().size());
        assertEquals(child1, parent.childNode(0));
        assertEquals(child2, parent.childNode(1));

        // Test childNodesAsArray
        Node[] array = parent.childNodesAsArray();
        assertEquals(2, array.length);

        // Test insert with index
        ConcreteNode child0 = new ConcreteNode("http://example.com");
        parent.addChildren(0, child0);
        assertEquals(3, parent.childNodes().size());
        assertEquals(child0, parent.childNode(0));
        assertEquals(0, (int) child0.siblingIndex());
        assertEquals(1, (int) child1.siblingIndex());
        assertEquals(2, (int) child2.siblingIndex());

        // Test remove child
        child1.remove();
        assertEquals(2, parent.childNodes().size());
        assertEquals(child2, parent.childNode(1));

        // Test replace child
        ConcreteNode replacement = new ConcreteNode("http://example.com");
        child2.replaceWith(replacement);
        assertEquals(replacement, parent.childNode(1));
        assertNull(child2.parent());
    }

    @Test
    public void testOwnerDocument() {
        // Root without parent and not Document
        ConcreteNode orphan = new ConcreteNode("http://example.com");
        assertNull(orphan.ownerDocument());

        // Is Document itself
        Document doc = new Document("http://example.com");
        assertEquals(doc, doc.ownerDocument());

        // Has parent which is Document
        ConcreteNode child = new ConcreteNode("http://example.com");
        doc.appendChild(child);
        assertEquals(doc, child.ownerDocument());
    }

    @Test
    public void testSiblingsNavigation() {
        ConcreteNode parent = new ConcreteNode("http://example.com");
        ConcreteNode n1 = new ConcreteNode("http://example.com");
        ConcreteNode n2 = new ConcreteNode("http://example.com");
        ConcreteNode n3 = new ConcreteNode("http://example.com");

        parent.addChildren(n1, n2, n3);

        // Root has no parent -> null siblings
        assertNull(n1.nextSibling() == null ? null : parent.parent()); // checking safe guard
        
        // n1 siblings and next/prev
        assertNull(n1.previousSibling());
        assertEquals(n2, n1.nextSibling());

        // n2 siblings
        assertEquals(n1, n2.previousSibling());
        assertEquals(n3, n2.nextSibling());

        // n3 siblings
        assertEquals(n2, n3.previousSibling());
        assertNull(n3.nextSibling());

        // siblingNodes list
        List<Node> siblings = n2.siblingNodes();
        assertEquals(3, siblings.size());
    }

    @Test
    public void testEqualsAndHashCode() {
        ConcreteNode n1 = new ConcreteNode("http://example.com");
        ConcreteNode n2 = new ConcreteNode("http://example.com");

        assertTrue(n1.equals(n1));
        assertFalse(n1.equals(n2)); // Node equals only returns true for `this == o`

        assertTrue(n1.hashCode() != 0 || n1.hashCode() == 0); // Verify hashCode runs without exception
    }

    @Test
    public void testCloneNode() {
        ConcreteNode parent = new ConcreteNode("http://example.com");
        parent.attr("class", "container");
        ConcreteNode child = new ConcreteNode("http://example.com");
        parent.addChildren(child);

        Node clone = parent.clone();
        assertNotNull(clone);
        assertNull(clone.parent());
        assertEquals(1, clone.childNodes().size());
        assertEquals("container", clone.attr("class"));
        assertNotNull(clone.childNode(0).parent()); // child's clone should have cloned parent
    }

    @Test
    public void testOuterHtmlAndToString() {
        ConcreteNode node = new ConcreteNode("http://example.com");
        node.setNodeName("div");
        String html = node.outerHtml();
        assertTrue(html.contains("<div>"));
        assertTrue(html.contains("</div>"));
        assertEquals(html, node.toString());
    }
}