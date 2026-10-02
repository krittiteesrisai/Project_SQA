package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.parser.Tag;
import org.jsoup.select.NodeVisitor;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class NodeTest {

    // ---------------- attr() / attributes() / hasAttr() / removeAttr() ----------------

    @Test
    public void testAttrGetSetAndRemove() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com/");
        assertEquals("", el.attr("class")); // missing -> ""
        el.attr("class", "test");
        assertEquals("test", el.attr("class"));
        assertTrue(el.hasAttr("class"));
        el.removeAttr("class");
        assertFalse(el.hasAttr("class"));
        assertEquals("", el.attr("class"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAttrGetNullKeyThrows() {
        new Element(Tag.valueOf("div"), "").attr(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHasAttrNullKeyThrows() {
        new Element(Tag.valueOf("div"), "").hasAttr(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAttrNullKeyThrows() {
        new Element(Tag.valueOf("div"), "").removeAttr(null);
    }

    @Test
    public void testAttrAbsPrefixResolvesAbsUrl() {
        Document doc = Jsoup.parse("<a href='rel.html'>link</a>", "http://example.com/base/");
        Element a = doc.select("a").first();
        assertEquals("http://example.com/base/rel.html", a.attr("abs:href"));
    }

    @Test
    public void testAttrAbsPrefixCaseInsensitive() {
        Document doc = Jsoup.parse("<a href='rel.html'>link</a>", "http://example.com/base/");
        Element a = doc.select("a").first();
        assertEquals("http://example.com/base/rel.html", a.attr("ABS:href"));
    }

    @Test
    public void testHasAttrAbsTrue() {
        Document doc = Jsoup.parse("<a href='rel.html'>link</a>", "http://example.com/base/");
        Element a = doc.select("a").first();
        assertTrue(a.hasAttr("abs:href"));
    }

    @Test
    public void testHasAttrAbsFalseWhenKeyMissing() {
        Element el = new Element(Tag.valueOf("a"), "http://example.com/");
        assertFalse(el.hasAttr("abs:href")); // href not present at all
    }

    @Test
    public void testHasAttrAbsFalseWhenCannotResolve() {
        // baseUri ว่าง + href แบบ relative -> absUrl ได้ "" -> hasAttr ต้อง false
        Element el = new Element(Tag.valueOf("a"), "");
        el.attr("href", "rel.html");
        assertFalse(el.hasAttr("abs:href"));
    }

    @Test
    public void testAttributesGetterNotNull() {
        assertNotNull(new Element(Tag.valueOf("div"), "").attributes());
    }

    // ---------------- baseUri() / setBaseUri() ----------------

    @Test
    public void testBaseUriTrimmedOnConstruction() {
        Element el = new Element(Tag.valueOf("div"), "   http://example.com/   ");
        assertEquals("http://example.com/", el.baseUri());
    }

    @Test
    public void testSetBaseUriPropagatesToDescendants() {
        Document doc = Jsoup.parse("<div><p>Text</p></div>");
        doc.setBaseUri("http://new-base.com/");
        Element p = doc.select("p").first();
        assertEquals("http://new-base.com/", p.baseUri());
        assertEquals("http://new-base.com/", doc.baseUri());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetBaseUriNullThrows() {
        new Element(Tag.valueOf("div"), "").setBaseUri(null);
    }

    // ---------------- absUrl() ----------------

    @Test
    public void testAbsUrlNoAttrReturnsEmpty() {
        Element el = new Element(Tag.valueOf("a"), "http://example.com/");
        assertEquals("", el.absUrl("href"));
    }

    @Test
    public void testAbsUrlResolvesRelative() {
        Element el = new Element(Tag.valueOf("a"), "http://example.com/base/");
        el.attr("href", "rel.html");
        assertEquals("http://example.com/base/rel.html", el.absUrl("href"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbsUrlEmptyKeyThrows() {
        new Element(Tag.valueOf("a"), "").absUrl("");
    }

    // ---------------- childNode / childNodes / childNodeSize / childNodesCopy ----------------

    @Test
    public void testChildNodeAndSize() {
        Document doc = Jsoup.parse("<div><p>One</p><p>Two</p></div>");
        Element div = doc.select("div").first();
        assertEquals(2, div.childNodeSize());
        assertEquals("p", div.childNode(0).nodeName());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildNodeOutOfBoundsThrows() {
        Document doc = Jsoup.parse("<div></div>");
        doc.select("div").first().childNode(0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testChildNodesUnmodifiable() {
        Document doc = Jsoup.parse("<div><p>One</p></div>");
        List<Node> children = doc.select("div").first().childNodes();
        children.add(new TextNode("x", ""));
    }

    @Test
    public void testChildNodesCopyIndependence() {
        Document doc = Jsoup.parse("<div><p>One</p></div>");
        Element div = doc.select("div").first();
        List<Node> copy = div.childNodesCopy();
        assertEquals(1, copy.size());
        ((Element) copy.get(0)).attr("data-x", "1");
        Element originalP = (Element) div.childNode(0);
        assertFalse(originalP.hasAttr("data-x"));
    }

    // ---------------- parent / parentNode / ownerDocument ----------------

    @Test
    public void testParentAndParentNode() {
        Document doc = Jsoup.parse("<div><p>One</p></div>");
        Element p = doc.select("p").first();
        assertNotNull(p.parent());
        assertSame(p.parent(), p.parentNode());
        assertEquals("div", p.parent().nodeName());
    }

    @Test
    public void testOwnerDocumentForDocumentItself() {
        Document doc = Jsoup.parse("<p>One</p>");
        assertSame(doc, doc.ownerDocument());
    }

    @Test
    public void testOwnerDocumentForOrphanNode() {
        TextNode orphan = new TextNode("hi", "");
        assertNull(orphan.ownerDocument());
    }

    @Test
    public void testOwnerDocumentForNestedNode() {
        Document doc = Jsoup.parse("<div><p>One</p></div>");
        assertSame(doc, doc.select("p").first().ownerDocument());
    }

    // ---------------- remove() ----------------

    @Test
    public void testRemoveNodeFromParent() {
        Document doc = Jsoup.parse("<div><p id=one>One</p><p id=two>Two</p></div>");
        Element one = doc.getElementById("one");
        one.remove();
        assertNull(one.parent());
        assertEquals(1, doc.select("div").first().childNodeSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveOrphanThrows() {
        new TextNode("hi", "").remove();
    }

    // ---------------- before(String)/before(Node)/after(String)/after(Node) ----------------

    @Test
    public void testBeforeHtml() {
        Document doc = Jsoup.parse("<div><p id=one>One</p></div>");
        Element one = doc.getElementById("one");
        one.before("<span id=ins>Ins</span>");
        Element div = doc.select("div").first();
        assertEquals("span", div.childNode(0).nodeName());
        assertEquals("p", div.childNode(1).nodeName());
    }

    @Test
    public void testAfterHtml() {
        Document doc = Jsoup.parse("<div><p id=one>One</p></div>");
        Element one = doc.getElementById("one");
        one.after("<span id=aft>Aft</span>");
        Element div = doc.select("div").first();
        assertEquals("p", div.childNode(0).nodeName());
        assertEquals("span", div.childNode(1).nodeName());
    }

    @Test
    public void testBeforeNode() {
        Document doc = Jsoup.parse("<div><p id=one>One</p></div>");
        Element one = doc.getElementById("one");
        Element newEl = new Element(Tag.valueOf("b"), "");
        one.before(newEl);
        assertSame(newEl, doc.select("div").first().childNode(0));
    }

    @Test
    public void testAfterNode() {
        Document doc = Jsoup.parse("<div><p id=one>One</p></div>");
        Element one = doc.getElementById("one");
        Element newEl = new Element(Tag.valueOf("b"), "");
        one.after(newEl);
        assertSame(newEl, doc.select("div").first().childNode(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBeforeNodeNullThrows() {
        Document doc = Jsoup.parse("<div><p id=one>One</p></div>");
        doc.getElementById("one").before((Node) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAfterNodeNullThrows() {
        Document doc = Jsoup.parse("<div><p id=one>One</p></div>");
        doc.getElementById("one").after((Node) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBeforeHtmlOrphanThrows() {
        new TextNode("hi", "").before("<span></span>");
    }

    // ---------------- wrap() ----------------

    @Test
    public void testWrapValid() {
        Document doc = Jsoup.parse("<div><p id=one>One</p></div>");
        Element one = doc.getElementById("one");
        one.wrap("<div class=wrapper></div>");
        assertEquals("wrapper", one.parent().className());
    }

    @Test
    public void testWrapNotElementReturnsNullNoop() {
        // กรณี parseFragment แล้วได้ node แรกไม่ใช่ Element -> คืน null และไม่เปลี่ยนโครงสร้าง
        Document doc = Jsoup.parse("<p id=one>One</p>");
        Element one = doc.getElementById("one");
        Element originalParent = one.parent();
        Node result = one.wrap("just text");
        assertNull(result);
        assertSame(originalParent, one.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWrapEmptyHtmlThrows() {
        Document doc = Jsoup.parse("<p id=one>One</p>");
        doc.getElementById("one").wrap("");
    }

    // ---------------- unwrap() ----------------

    @Test
    public void testUnwrapReturnsFirstChild() {
        Document doc = Jsoup.parse("<div><span>Text</span></div>");
        Element div = doc.select("div").first();
        Element span = doc.select("span").first();
        Node first = span.unwrap();
        assertNotNull(first);
        assertEquals("Text", first.outerHtml());
        assertEquals(0, doc.select("span").size());
        assertEquals(1, div.childNodeSize());
    }

    @Test
    public void testUnwrapWithNoChildrenReturnsNull() {
        Document doc = Jsoup.parse("<div><br id=b/></div>");
        Node result = doc.getElementById("b").unwrap();
        assertNull(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnwrapOrphanThrows() {
        new TextNode("hi", "").unwrap();
    }

    // ---------------- replaceWith() ----------------

    @Test
    public void testReplaceWith() {
        Document doc = Jsoup.parse("<div><p id=one>One</p></div>");
        Element one = doc.getElementById("one");
        Element replacement = new Element(Tag.valueOf("span"), "");
        one.replaceWith(replacement);
        assertSame(replacement, doc.select("div").first().childNode(0));
        assertNull(one.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceWithNullThrows() {
        Document doc = Jsoup.parse("<div><p id=one>One</p></div>");
        doc.getElementById("one").replaceWith(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceWithOrphanThrows() {
        new TextNode("hi", "").replaceWith(new TextNode("bye", ""));
    }

    // ---------------- siblingNodes / nextSibling / previousSibling / siblingIndex ----------------

    @Test
    public void testSiblingNodesNoParent() {
        assertTrue(new TextNode("hi", "").siblingNodes().isEmpty());
    }

    @Test
    public void testSiblingNodesWithParentExcludesSelf() {
        Document doc = Jsoup.parse("<div><p id=one>One</p><p id=two>Two</p><p id=three>Three</p></div>");
        Element two = doc.getElementById("two");
        List<Node> siblings = two.siblingNodes();
        assertEquals(2, siblings.size());
        for (Node n : siblings) assertNotSame(two, n);
    }

    @Test
    public void testNextSiblingNullWhenNoParent() {
        assertNull(new TextNode("hi", "").nextSibling());
    }

    @Test
    public void testPreviousSiblingNullWhenNoParent() {
        assertNull(new TextNode("hi", "").previousSibling());
    }

    @Test
    public void testNextAndPreviousSiblingBoundaries() {
        Document doc = Jsoup.parse("<div><p id=one>One</p><p id=two>Two</p><p id=three>Three</p></div>");
        Element one = doc.getElementById("one");
        Element two = doc.getElementById("two");
        Element three = doc.getElementById("three");

        assertNull(one.previousSibling());
        assertSame(two, one.nextSibling());

        assertSame(one, two.previousSibling());
        assertSame(three, two.nextSibling());

        assertSame(two, three.previousSibling());
        assertNull(three.nextSibling());
    }

    @Test
    public void testSiblingIndexValues() {
        Document doc = Jsoup.parse("<div><p id=one>One</p><p id=two>Two</p><p id=three>Three</p></div>");
        assertEquals(0, doc.getElementById("one").siblingIndex());
        assertEquals(1, doc.getElementById("two").siblingIndex());
        assertEquals(2, doc.getElementById("three").siblingIndex());
    }

    // ---------------- traverse() ----------------

    @Test
    public void testTraverseVisitsAllNodes() {
        Document doc = Jsoup.parse("<div><p>One</p><p>Two</p></div>");
        final int[] count = {0};
        doc.traverse(new NodeVisitor() {
            public void head(Node node, int depth) { count[0]++; }
            public void tail(Node node, int depth) { }
        });
        assertTrue(count[0] > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTraverseNullThrows() {
        Jsoup.parse("<div></div>").traverse(null);
    }

    // ---------------- outerHtml() / toString() ----------------

    @Test
    public void testOuterHtmlEqualsToString() {
        Element div = Jsoup.parse("<div><p>Hello</p></div>").select("div").first();
        assertEquals(div.outerHtml(), div.toString());
    }

    @Test
    public void testOuterHtmlOrphanNodeUsesDefaultOutputSettings() {
        // getOutputSettings(): ownerDocument()==null -> ใช้ new Document("").outputSettings()
        TextNode orphan = new TextNode("hello world", "");
        String html = orphan.outerHtml();
        assertNotNull(html);
        assertTrue(html.contains("hello world"));
    }

    // ---------------- equals() / hashCode() ----------------

    @Test
    public void testEqualsSameInstance() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertTrue(el.equals(el));
    }

    @Test
    public void testEqualsNullAndDifferentClass() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertFalse(el.equals(null));
        assertFalse(el.equals("not a node"));
    }

    @Test
    public void testNotEqualsWhenAttributesDiffer() {
        Element div1 = new Element(Tag.valueOf("div"), "");
        Element div2 = new Element(Tag.valueOf("div"), "");
        div2.attr("id", "x");
        assertFalse(div1.equals(div2));
    }

    @Test
    public void testEqualsIgnoresNodeName_PotentialFaultDetector() {
        // จาก source: equals() เทียบแค่ childNodes และ attributes เท่านั้น (ไม่เทียบ nodeName)
        // ดังนั้น Element คนละ tag แต่ attributes/children เหมือนกัน (ว่างทั้งคู่) จะถูกมองว่า "equal"
        // -> นี่คือพฤติกรรมที่อ่านได้ตรงจาก source ที่ให้มา ใช้ทดสอบเพื่อดักจับข้อบกพร่องด้าน equals()
        Element div = new Element(Tag.valueOf("div"), "");
        Element span = new Element(Tag.valueOf("span"), "");
        assertTrue(div.equals(span));
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        Element div1 = new Element(Tag.valueOf("div"), "");
        Element div2 = new Element(Tag.valueOf("div"), "");
        assertEquals(div1.hashCode(), div2.hashCode());
        assertTrue(div1.equals(div2));
    }

    // ---------------- clone() / doClone() ----------------

    @Test
    public void testCloneIsIndependentCopy() {
        Document doc = Jsoup.parse("<div><p id=one>One</p></div>");
        Element div = doc.select("div").first();
        Element clone = (Element) div.clone();

        assertNotSame(div, clone);
        assertEquals(div.childNodeSize(), clone.childNodeSize());
        assertNull(clone.parent());
        assertEquals(0, clone.siblingIndex());

        clone.attr("data-cloned", "yes");
        assertFalse(div.hasAttr("data-cloned"));

        Element clonedP = (Element) clone.childNode(0);
        clonedP.attr("data-x", "1");
        Element originalP = (Element) div.childNode(0);
        assertFalse(originalP.hasAttr("data-x"));
    }

    @Test
    public void testDoCloneIsShallowForChildren() {
        // doClone(parent) ไม่ deep-copy children (ตาม comment ใน source)
        Document doc = Jsoup.parse("<div><p id=one>One</p></div>");
        Element div = doc.select("div").first();
        Node shallow = div.doClone(null);
        assertNull(shallow.parentNode);
        assertEquals(0, shallow.siblingIndex);
        // child reference เดียวกันกับต้นฉบับ (shallow)
        assertSame(div.childNodes.get(0), shallow.childNodes.get(0));
    }

    // ---------------- White-box: addChildren / ensureChildNodes / reparentChild / removeChild / replaceChild / setParentNode ----------------

    @Test
    public void testEnsureChildNodesSwitchesFromEmptyList() {
        Element fresh = new Element(Tag.valueOf("div"), "");
        assertEquals(0, fresh.childNodeSize());
        fresh.addChildren(new TextNode("x", ""));
        assertEquals(1, fresh.childNodeSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddChildrenWithIndexNullElementThrows() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.addChildren(0, new Node[]{null});
    }

    @Test
    public void testReparentChildMovesNodeBetweenParents() {
        Element parentA = new Element(Tag.valueOf("div"), "");
        Element parentB = new Element(Tag.valueOf("div"), "");
        TextNode t = new TextNode("x", "");

        parentA.addChildren(t);
        assertEquals(1, parentA.childNodeSize());

        parentB.addChildren(t); // ย้ายจาก parentA -> parentB
        assertEquals(0, parentA.childNodeSize());
        assertEquals(1, parentB.childNodeSize());
        assertSame(parentB, t.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveChildValidateIsTrueFailsWhenNotActualParent() {
        Element parentA = new Element(Tag.valueOf("div"), "");
        Element other = new Element(Tag.valueOf("div"), "");
        TextNode t = new TextNode("x", "");
        parentA.addChildren(t);
        other.removeChild(t); // t.parentNode != other -> Validate.isTrue ล้มเหลว
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceChildValidateIsTrueFailsWhenNotActualParent() {
        Element parentA = new Element(Tag.valueOf("div"), "");
        Element other = new Element(Tag.valueOf("div"), "");
        TextNode t = new TextNode("x", "");
        parentA.addChildren(t);
        other.replaceChild(t, new TextNode("y", ""));
    }

    @Test
    public void testSetParentNodeRemovesFromOldParent() {
        Element p1 = new Element(Tag.valueOf("div"), "");
        Element p2 = new Element(Tag.valueOf("div"), "");
        TextNode t = new TextNode("x", "");

        p1.addChildren(t);
        assertEquals(1, p1.childNodeSize());

        t.setParentNode(p2); // branch: this.parentNode != null -> true
        assertEquals(0, p1.childNodeSize()); // ถูกลบออกจาก p1
        assertSame(p2, t.parent());
    }

    @Test
    public void testSetParentNodeWhenNoOldParent() {
        TextNode t = new TextNode("x", "");
        Element p2 = new Element(Tag.valueOf("div"), "");
        t.setParentNode(p2); // branch: this.parentNode == null -> skip removal
        assertSame(p2, t.parent());
    }
}
