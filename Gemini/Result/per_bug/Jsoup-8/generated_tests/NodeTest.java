package org.jsoup.nodes;

import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;

public class NodeTest {

    // Concrete subclass of Node for testing abstract class methods
    private static class ConcreteNode extends Node {
        private final String nodeName;

        public ConcreteNode(String baseUri, Attributes attributes, String nodeName) {
            super(baseUri, attributes);
            this.nodeName = nodeName;
        }

        public ConcreteNode(String baseUri) {
            super(baseUri);
            this.nodeName = "testNode";
        }

        public ConcreteNode() {
            super();
            this.nodeName = "emptyNode";
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
    public void testConstructorsAndBasicGetters() {
        // Test default constructor
        Node emptyNode = new ConcreteNode();
        assertNotNull(emptyNode.childNodes());
        assertNull(emptyNode.attributes());

        // Test baseUri constructor
        Node uriNode = new ConcreteNode("http://example.com");
        assertEquals("http://example.com", uriNode.baseUri());
        assertNotNull(uriNode.attributes());

        // Test full constructor
        Attributes attrs = new Attributes();
        attrs.put("key", "val");
        Node fullNode = new ConcreteNode(" http://example.com/path ", attrs, "custom");
        assertEquals("http://example.com/path", fullNode.baseUri());
        assertEquals("custom", fullNode.nodeName());
        assertTrue(fullNode.hasAttr("key"));
    }

    @Test
    public void testAttrBranchCoverage() {
        Attributes attrs = new Attributes();
        attrs.put("href", "/relative");
        attrs.put("abs:href", "http://example.com/absolute");
        Node node = new ConcreteNode("http://example.com", attrs);

        // Branch 1: Attribute exists directly
        assertEquals("/relative", node.attr("href"));

        // Branch 2: Attribute does not exist, but starts with "abs:"
        Node nodeNoBase = new ConcreteNode("http://invalid-base", new Attributes());
        nodeNoBase.attr("href", "http://absolute.com/path");
        assertEquals("http://absolute.com/path", nodeNoBase.attr("abs:href"));

        // Branch 3: Attribute does not exist and does not start with "abs:"
        assertEquals("", node.attr("nonexistent"));
    }

    @Test
    public void testAbsUrlEdgeCases() {
        Attributes attrs = new Attributes();
        attrs.put("valid", "/path");
        attrs.put("absolute", "https://jsoup.org");
        attrs.put("malformed", "http://invalid domain with spaces");

        Node node = new ConcreteNode("http://example.com", attrs);

        // Valid relative URL made absolute
        assertEquals("http://example.com/path", node.absUrl("valid"));

        // Already absolute URL
        assertEquals("https://jsoup.org", node.absUrl("absolute"));

        // Missing attribute
        assertEquals("", node.absUrl("missing"));

        // Malformed base URI -> falls back to parsing relUrl directly
        Node badBaseNode = new ConcreteNode("malformed-uri", attrs);
        assertEquals("https://jsoup.org", badBaseNode.absUrl("absolute"));

        // Malformed both base and rel URL -> returns empty string
        assertEquals("", badBaseNode.absUrl("malformed"));
    }

    @Test
    public void testOwnerDocument() {
        Document doc = new Document("http://example.com");
        ConcreteNode child = new ConcreteNode("http://example.com");
        ConcreteNode grandchild = new ConcreteNode("http://example.com");

        // Case 1: Node is Document itself
        assertEquals(doc, doc.ownerDocument());

        // Case 2: Parent is null, not a Document
        assertNull(child.ownerDocument());

        // Case 3: Parent is attached, eventually reaches Document via recursion
        doc.appendChild(child);
        child.appendChild(grandchild);

        assertEquals(doc, grandchild.ownerDocument());
    }

    @Test
    public void testNodeTreeManipulation() {
        Node parent = new ConcreteNode("http://example.com");
        Node child1 = new ConcreteNode("http://example.com");
        Node child2 = new ConcreteNode("http://example.com");
        Node replacement = new ConcreteNode("http://example.com");

        parent.addChildren(child1, child2);
        assertEquals(2, parent.childNodes().size());
        assertEquals(0, child1.siblingIndex());
        assertEquals(1, child2.siblingIndex());
        assertEquals(parent, child1.parent());

        // Test addChildren with index
        Node insertedChild = new ConcreteNode("http://example.com");
        parent.addChildren(1, insertedChild);
        assertEquals(3, parent.childNodes().size());
        assertEquals(insertedChild, parent.childNode(1));
        assertEquals(1, insertedChild.siblingIndex());
        assertEquals(2, child2.siblingIndex());

        // Test replaceChild / replaceWith
        child1.replaceWith(replacement);
        assertEquals(replacement, parent.childNode(0));
        assertNull(child1.parent());

        // Test removeChild / remove
        replacement.remove();
        assertEquals(2, parent.childNodes().size());
        assertNull(replacement.parent());
    }

    @Test
    public void testSiblingsNavigation() {
        Node parent = new ConcreteNode("http://example.com");
        Node n1 = new ConcreteNode("http://example.com");
        Node n2 = new ConcreteNode("http://example.com");
        Node n3 = new ConcreteNode("http://example.com");

        parent.addChildren(n1, n2, n3);

        // Root node siblings/next/previous
        assertNull(parent.nextSibling());
        assertNull(parent.previousSibling());

        // n1 navigation
        assertNull(n1.previousSibling());
        assertEquals(n2, n1.nextSibling());

        // n2 navigation
        assertEquals(n1, n2.previousSibling());
        assertEquals(n3, n2.nextSibling());

        // n3 navigation
        assertEquals(n2, n3.previousSibling());
        assertNull(n3.nextSibling());

        // siblingNodes
        List<Node> siblings = n2.siblingNodes();
        assertEquals(3, siblings.size());
    }

    @Test
    public void testAttributesAndMisc() {
        Node node = new ConcreteNode("http://example.com");
        node.attr("testKey", "testVal");
        assertTrue(node.hasAttr("testKey"));
        assertEquals("testVal", node.attributes().get("testKey"));

        node.removeAttr("testKey");
        assertFalse(node.hasAttr("testKey"));

        node.setBaseUri("http://new-base.com");
        assertEquals("http://new-base.com", node.baseUri());

        assertNotNull(node.toString());
        assertNotNull(node.outerHtml());

        // Equals and HashCode basic check
        assertTrue(node.equals(node));
        assertFalse(node.equals(new Object()));
        assertTrue(node.hashCode() != 0);
    }
}