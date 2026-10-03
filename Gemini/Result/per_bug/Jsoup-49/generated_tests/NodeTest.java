package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.parser.Parser;

import java.util.List;

import static org.junit.Assert.*;

public class NodeTest {

    // Helper concrete subclass of Node for testing abstract methods
    private static class DummyNode extends Node {
        private final String name;

        public DummyNode(String baseUri, String name) {
            super(baseUri);
            this.name = name;
        }

        public DummyNode() {
            super();
        }

        @Override
        public String nodeName() {
            return name != null ? name : "dummy";
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
    public void testConstructorsAndBasics() {
        DummyNode node = new DummyNode("http://example.com/path", "p");
        assertEquals("http://example.com/path", node.baseUri());
        assertEquals("p", node.nodeName());
        assertNotNull(node.attributes());
        assertEquals(0, node.childNodeSize());
        assertNull(node.parent());
        assertNull(node.parentNode());

        DummyNode emptyNode = new DummyNode();
        assertNull(emptyNode.attributes());
        assertEquals(0, emptyNode.childNodeSize());
    }

    @Test
    public void testAttrBranching() {
        Attributes attrs = new Attributes();
        attrs.put("id", "testId");
        DummyNode node = new DummyNode("http://example.com/", "div");
        node.attributes = attrs;

        // Branch 1: Attribute exists
        assertEquals("testId", node.attr("id"));

        // Branch 2: Attribute missing, but starts with "abs:"
        attrs.put("href", "/relative");
        assertEquals("http://example.com/relative", node.attr("abs:href"));

        // Branch 3: Attribute missing and not "abs:"
        assertEquals("", node.attr("nonexistent"));

        // Validate null handling
        try {
            node.attr(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testHasAttrBranching() {
        Attributes attrs = new Attributes();
        attrs.put("href", "http://example.com/abs");
        attrs.put("rel", "nofollow");
        DummyNode node = new DummyNode("http://example.com/", "a");
        node.attributes = attrs;

        // abs: attribute exists and absolute
        assertTrue(node.hasAttr("abs:href"));

        // standard attribute exists
        assertTrue(node.hasAttr("rel"));

        // attribute does not exist
        assertFalse(node.hasAttr("abs:missing"));
        assertFalse(node.hasAttr("missing"));

        try {
            node.hasAttr(null);
            fail();
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testAttrMutationAndRemoval() {
        DummyNode node = new DummyNode("http://example.com/", "span");
        node.attr("class", "my-class");
        assertEquals("my-class", node.attr("class"));

        node.removeAttr("class");
        assertFalse(node.hasAttr("class"));
        assertEquals("", node.attr("class"));
    }

    @Test
    public void testSetBaseUri() {
        DummyNode parent = new DummyNode("http://a.com", "div");
        DummyNode child = new DummyNode("http://a.com/child", "span");
        parent.addChildren(child);

        parent.setBaseUri("http://b.com");
        assertEquals("http://b.com", parent.baseUri());
        assertEquals("http://b.com", child.baseUri());
    }

    @Test
    public void testAbsUrlEdgeCases() {
        DummyNode node = new DummyNode("http://example.com/path/", "img");
        node.attr("src", "img.png");

        assertEquals("http://example.com/path/img.png", node.absUrl("src"));
        assertEquals("", node.absUrl("nonexistent"));

        try {
            node.absUrl("");
            fail();
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testOwnerDocumentBranching() {
        // Branch 1: Node is Document
        Document doc = new Document("http://example.com");
        assertSame(doc, doc.ownerDocument());

        // Branch 2: ParentNode is null
        DummyNode orphan = new DummyNode("http://example.com", "div");
        assertNull(orphan.ownerDocument());

        // Branch 3: Recursive parent lookup
        DummyNode child = new DummyNode("http://example.com", "span");
        doc.appendChild(child);
        assertSame(doc, child.ownerDocument());
    }

    @Test
    public void testChildNodeManagement() {
        DummyNode parent = new DummyNode("http://example.com", "div");
        DummyNode child1 = new DummyNode("http://example.com", "p1");
        DummyNode child2 = new DummyNode("http://example.com", "p2");

        parent.addChildren(child1, child2);
        assertEquals(2, parent.childNodeSize());
        assertSame(child1, parent.childNode(0));
        assertSame(child2, parent.childNode(1));

        // Test immutability of childNodes list
        List<Node> childrenList = parent.childNodes();
        try {
            childrenList.add(new DummyNode());
            fail();
        } catch (UnsupportedOperationException e) {
            // expected
        }

        // Test childNodesCopy
        List<Node> copy = parent.childNodesCopy();
        assertEquals(2, copy.size());
        assertNotSame(child1, copy.get(0));

        // Test remove child via Node.remove()
        child1.remove();
        assertEquals(1, parent.childNodeSize());
        assertSame(child2, parent.childNode(0));
        assertNull(child1.parent());
    }

    @Test
    public void testSiblingsNavigation() {
        DummyNode parent = new DummyNode("http://example.com", "div");
        DummyNode n1 = new DummyNode("http://example.com", "1");
        DummyNode n2 = new DummyNode("http://example.com", "2");
        DummyNode n3 = new DummyNode("http://example.com", "3");

        parent.addChildren(n1, n2, n3);

        assertNull(n1.previousSibling());
        assertSame(n2, n1.nextSibling());

        assertSame(n1, n2.previousSibling());
        assertSame(n3, n2.nextSibling());

        assertSame(n2, n3.previousSibling());
        assertNull(n3.nextSibling());

        DummyNode orphan = new DummyNode();
        assertNull(orphan.previousSibling());
        assertNull(orphan.nextSibling());
        assertTrue(orphan.siblingNodes().isEmpty());

        assertEquals(2, n1.siblingNodes().size());
    }

    @Test
    public void testReplaceAndWrap() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(child);

        Element replacement = new Element(Tag.valueOf("b"), "http://example.com");
        child.replaceWith(replacement);
        assertSame(replacement, parent.childNode(0));
        assertNull(child.parentNode());

        // Test wrap
        Element wrapTarget = new Element(Tag.valueOf("p"), "http://example.com");
        parent.appendChild(wrapTarget);
        Node wrappedResult = wrapTarget.wrap("<div class='wrap'></div>");
        assertNotNull(wrappedResult);
        assertEquals("div", parent.childNode(1).nodeName());
    }

    @Test
    public void testUnwrap() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element middle = new Element(Tag.valueOf("span"), "http://example.com");
        Element child = new Element(Tag.valueOf("b"), "http://example.com");
        middle.appendChild(child);
        parent.appendChild(middle);

        Node firstChild = middle.unwrap();
        assertSame(child, firstChild);
        assertEquals(1, parent.childNodeSize());
        assertSame(child, parent.childNode(0));
    }

    @Test
    public void testEqualsAndHashCode() {
        DummyNode n1 = new DummyNode("http://example.com", "div");
        n1.attr("class", "a");
        DummyNode n2 = new DummyNode("http://example.com", "div");
        n2.attr("class", "a");
        DummyNode n3 = new DummyNode("http://example.com", "div");
        n3.attr("class", "b");

        assertEquals(n1, n1);
        assertEquals(n1, n2);
        assertEquals(n1.hashCode(), n2.hashCode());

        assertNotEquals(n1, null);
        assertNotEquals(n1, "string-type");
        assertNotEquals(n1, n3);
    }

    @Test
    public void testCloneDeep() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(child);

        Node clone = parent.clone();
        assertNotSame(parent, clone);
        assertEquals(1, clone.childNodeSize());
        assertNotSame(child, clone.childNode(0));
        assertEquals(clone, clone.childNode(0).parentNode());
    }

    @Test
    public void testToStringAndOuterHtml() {
        DummyNode node = new DummyNode("http://example.com", "p");
        assertEquals("<p></p>", node.toString());
        assertEquals("<p></p>", node.outerHtml());
    }
}