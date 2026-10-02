# NodeTest.java

ผมสร้างคลาสย่อย `TestNode` ที่สืบทอดจาก `Node` (abstract) เพื่อ implement เมธอด abstract (`nodeName()`, `outerHtmlHead()`, `outerHtmlTail()`) แบบง่าย ๆ เพื่อทดสอบ logic ของ `Node` ได้ตรง ๆ โดยไม่ปนกับ logic ของ `Element`/`TextNode` จริง

**หมายเหตุสำคัญ (assumption ที่ประกาศไว้ชัดเจน):**
- สมมติว่า `Validate.notNull/notEmpty/isTrue/noNullElements` throw `IllegalArgumentException` เมื่อเงื่อนไขไม่ผ่าน (ตาม behavior มาตรฐานของ jsoup `Validate` class)
- `outerHtml()` เรียก `ownerDocument().outputSettings()` โดยไม่ check null — ถ้า node ไม่มี parent และไม่ใช่ Document จะเกิด `NullPointerException` จริงตาม source ที่ให้มา (นี่คือจุดที่อาจเป็น fault ของเวอร์ชันนี้) จึงเขียน test ให้ตรงกับ behavior จริงของ source

```java
package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class NodeTest {

    // ----- Minimal concrete Node subclass for white-box testing -----
    private static class TestNode extends Node {
        private String name;

        TestNode(String baseUri) {
            super(baseUri);
            this.name = "testnode";
        }

        TestNode(String baseUri, Attributes attrs) {
            super(baseUri, attrs);
            this.name = "testnode";
        }

        TestNode(String baseUri, String name) {
            super(baseUri);
            this.name = name;
        }

        TestNode() {
            super(); // default constructor: childNodes = EMPTY_LIST, attributes = null
            this.name = "testnode";
        }

        @Override
        public String nodeName() {
            return name;
        }

        @Override
        void outerHtmlHead(StringBuilder accum, int depth, Document.OutputSettings out) {
            accum.append("<").append(name).append(">");
        }

        @Override
        void outerHtmlTail(StringBuilder accum, int depth, Document.OutputSettings out) {
            accum.append("</").append(name).append(">");
        }
    }

    // ===================== Constructors =====================

    @Test
    public void testConstructorBaseUriAttributesNotNull_trimsBaseUri() {
        TestNode n = new TestNode("  http://example.com/  ", new Attributes());
        assertEquals("http://example.com/", n.baseUri());
        assertNotNull(n.attributes());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullBaseUriThrows() {
        new TestNode(null, new Attributes());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullAttributesThrows() {
        new TestNode("http://example.com/", (Attributes) null);
    }

    @Test
    public void testSingleArgConstructor_defaultAttributes() {
        TestNode n = new TestNode("http://example.com/");
        assertNotNull(n.attributes());
        assertEquals("", n.attr("missing"));
    }

    @Test
    public void testDefaultConstructor_attributesNullChildrenEmpty() {
        TestNode n = new TestNode();
        assertNull(n.attributes());
        assertTrue(n.childNodes().isEmpty());
    }

    @Test(expected = NullPointerException.class)
    public void testDefaultConstructor_hasAttrThrowsNPE_dueToNullAttributes() {
        TestNode n = new TestNode();
        n.hasAttr("x"); // attributes is null -> NPE (documented "use with caution")
    }

    // ===================== attr / hasAttr / removeAttr =====================

    @Test
    public void testAttrGetExisting() {
        TestNode n = new TestNode("http://example.com/");
        n.attr("k", "v");
        assertEquals("v", n.attr("k"));
    }

    @Test
    public void testAttrGetNonExisting_noAbsPrefix_returnsEmpty() {
        TestNode n = new TestNode("http://example.com/");
        assertEquals("", n.attr("missing"));
    }

    @Test
    public void testAttrGet_absPrefix_withMissingAttribute_returnsEmpty() {
        TestNode n = new TestNode("http://example.com/");
        // "href" attribute not set -> absUrl("href") => hasAttr false => ""
        assertEquals("", n.attr("abs:href"));
    }

    @Test
    public void testAttrGet_absPrefix_withPresentAttribute_resolvesAbsolute() {
        TestNode n = new TestNode("http://example.com/");
        n.attr("href", "/foo");
        assertEquals("http://example.com/foo", n.attr("abs:href"));
    }

    @Test(expected = NullPointerException.class)
    public void testAttrGetNullKeyThrows() {
        TestNode n = new TestNode("http://example.com/");
        n.attr((String) null);
    }

    @Test
    public void testAttrSetAndGet_chaining() {
        TestNode n = new TestNode("http://example.com/");
        Node result = n.attr("k", "v");
        assertSame(n, result);
        assertEquals("v", n.attr("k"));
    }

    @Test
    public void testHasAttrTrueFalse() {
        TestNode n = new TestNode("http://example.com/");
        assertFalse(n.hasAttr("k"));
        n.attr("k", "v");
        assertTrue(n.hasAttr("k"));
    }

    @Test(expected = NullPointerException.class)
    public void testHasAttrNullKeyThrows() {
        TestNode n = new TestNode("http://example.com/");
        n.hasAttr(null);
    }

    @Test
    public void testRemoveAttr_removesExisting() {
        TestNode n = new TestNode("http://example.com/");
        n.attr("k", "v");
        n.removeAttr("k");
        assertFalse(n.hasAttr("k"));
    }

    @Test(expected = NullPointerException.class)
    public void testRemoveAttrNullKeyThrows() {
        TestNode n = new TestNode("http://example.com/");
        n.removeAttr(null);
    }

    // ===================== baseUri / setBaseUri =====================

    @Test
    public void testBaseUriGetSet() {
        TestNode n = new TestNode("http://example.com/");
        n.setBaseUri("http://other.com/");
        assertEquals("http://other.com/", n.baseUri());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetBaseUriNullThrows() {
        TestNode n = new TestNode("http://example.com/");
        n.setBaseUri(null);
    }

    // ===================== absUrl =====================

    @Test
    public void testAbsUrl_attributeMissing_returnsEmpty() {
        TestNode n = new TestNode("http://example.com/");
        assertEquals("", n.absUrl("href"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbsUrl_emptyKey_throws() {
        TestNode n = new TestNode("http://example.com/");
        n.absUrl("");
    }

    @Test
    public void testAbsUrl_baseMalformed_relAlsoMalformed_returnsEmpty() {
        // baseUri = "" -> new URL("") malformed; relUrl "/foo" also malformed (no protocol)
        TestNode n = new TestNode("");
        n.attr("href", "/foo");
        assertEquals("", n.absUrl("href"));
    }

    @Test
    public void testAbsUrl_baseMalformed_relAbsoluteValid_returnsResolved() {
        TestNode n = new TestNode("");
        n.attr("href", "http://abc.com/foo");
        assertEquals("http://abc.com/foo", n.absUrl("href"));
    }

    @Test
    public void testAbsUrl_baseValid_relValid_returnsResolved() {
        TestNode n = new TestNode("http://example.com/");
        n.attr("href", "foo.html");
        assertEquals("http://example.com/foo.html", n.absUrl("href"));
    }

    @Test
    public void testAbsUrl_baseValid_relUnknownProtocol_returnsEmpty() {
        TestNode n = new TestNode("http://example.com/");
        n.attr("href", "unsupported://host/path");
        assertEquals("", n.absUrl("href"));
    }

    // ===================== childNode / childNodes / childNodesAsArray =====================

    @Test
    public void testChildNodeByIndex() {
        TestNode parent = new TestNode("http://example.com/");
        TestNode c0 = new TestNode("http://example.com/");
        parent.addChildren(c0);
        assertSame(c0, parent.childNode(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildNodeIndexOutOfBounds_throws() {
        TestNode parent = new TestNode("http://example.com/");
        parent.childNode(0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testChildNodesUnmodifiable() {
        TestNode parent = new TestNode("http://example.com/");
        TestNode c0 = new TestNode("http://example.com/");
        parent.addChildren(c0);
        List<Node> list = parent.childNodes();
        list.add(new TestNode("http://example.com/"));
    }

    @Test
    public void testChildNodesAsArray() {
        TestNode parent = new TestNode("http://example.com/");
        TestNode c0 = new TestNode("http://example.com/");
        TestNode c1 = new TestNode("http://example.com/");
        parent.addChildren(c0, c1);
        Node[] arr = parent.childNodesAsArray();
        assertEquals(2, arr.length);
    }

    // ===================== parent / ownerDocument =====================

    @Test
    public void testParent_nullForRoot() {
        TestNode n = new TestNode("http://example.com/");
        assertNull(n.parent());
    }

    @Test
    public void testParent_afterAddChildren() {
        TestNode parent = new TestNode("http://example.com/");
        TestNode c0 = new TestNode("http://example.com/");
        parent.addChildren(c0);
        assertSame(parent, c0.parent());
    }

    @Test
    public void testOwnerDocument_selfWhenIsDocument() {
        Document doc = new Document("http://example.com/");
        assertSame(doc, doc.ownerDocument());
    }

    @Test
    public void testOwnerDocument_nullWhenNoParentAndNotDocument() {
        TestNode n = new TestNode("http://example.com/");
        assertNull(n.ownerDocument());
    }

    @Test
    public void testOwnerDocument_recursesToParentDocument() {
        Document doc = new Document("http://example.com/");
        TestNode child = new TestNode("http://example.com/");
        doc.addChildren(child);
        assertSame(doc, child.ownerDocument());
    }

    // ===================== remove / replaceWith =====================

    @Test(expected = IllegalArgumentException.class)
    public void testRemove_noParent_throws() {
        TestNode n = new TestNode("http://example.com/");
        n.remove();
    }

    @Test
    public void testRemove_removesFromParent() {
        TestNode parent = new TestNode("http://example.com/");
        TestNode c0 = new TestNode("http://example.com/");
        TestNode c1 = new TestNode("http://example.com/");
        parent.addChildren(c0, c1);
        c0.remove();
        assertEquals(1, parent.childNodes().size());
        assertNull(c0.parent());
        assertSame(c1, parent.childNode(0));
        assertEquals(0, c1.siblingIndex().intValue()); // reindexed
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceWith_nullArgument_throws() {
        TestNode parent = new TestNode("http://example.com/");
        TestNode c0 = new TestNode("http://example.com/");
        parent.addChildren(c0);
        c0.replaceWith(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceWith_noParent_throws() {
        TestNode c0 = new TestNode("http://example.com/");
        TestNode c1 = new TestNode("http://example.com/");
        c0.replaceWith(c1);
    }

    @Test
    public void testReplaceWith_replacesNodeAtSamePosition() {
        TestNode parent = new TestNode("http://example.com/");
        TestNode c0 = new TestNode("http://example.com/");
        TestNode c1 = new TestNode("http://example.com/");
        TestNode newNode = new TestNode("http://example.com/");
        parent.addChildren(c0, c1);
        c0.replaceWith(newNode);
        assertSame(newNode, parent.childNode(0));
        assertNull(c0.parent());
        assertSame(parent, newNode.parent());
        assertEquals(0, newNode.siblingIndex().intValue());
    }

    // ===================== addChildren (varargs) =====================

    @Test
    public void testAddChildren_setsParentAndSiblingIndex() {
        TestNode parent = new TestNode("http://example.com/");
        TestNode c0 = new TestNode("http://example.com/");
        TestNode c1 = new TestNode("http://example.com/");
        parent.addChildren(c0, c1);
        assertEquals(2, parent.childNodes().size());
        assertSame(parent, c0.parent());
        assertEquals(0, c0.siblingIndex().intValue());
        assertEquals(1, c1.siblingIndex().intValue());
    }

    @Test
    public void testAddChildren_reparentsExistingChild() {
        TestNode parent1 = new TestNode("http://example.com/");
        TestNode parent2 = new TestNode("http://example.com/");
        TestNode child = new TestNode("http://example.com/");
        parent1.addChildren(child);
        assertEquals(1, parent1.childNodes().size());
        parent2.addChildren(child);
        assertEquals(0, parent1.childNodes().size());
        assertEquals(1, parent2.childNodes().size());
        assertSame(parent2, child.parent());
    }

    // ===================== addChildren(int, Node...) =====================

    @Test
    public void testAddChildrenAtIndex_insertsInOrder() {
        TestNode parent = new TestNode("http://example.com/");
        TestNode a = new TestNode("http://example.com/");
        TestNode b = new TestNode("http://example.com/");
        TestNode c = new TestNode("http://example.com/");
        parent.addChildren(a); // [a]
        parent.addChildren(0, b, c); // insert b,c at index 0 => [b, c, a]
        assertEquals(3, parent.childNodes().size());
        assertSame(b, parent.childNode(0));
        assertSame(c, parent.childNode(1));
        assertSame(a, parent.childNode(2));
        assertEquals(0, b.siblingIndex().intValue());
        assertEquals(1, c.siblingIndex().intValue());
        assertEquals(2, a.siblingIndex().intValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddChildrenAtIndex_nullElement_throws() {
        TestNode parent = new TestNode("http://example.com/");
        parent.addChildren(0, new Node[]{null});
    }

    // ===================== siblingNodes / nextSibling / previousSibling =====================

    @Test
    public void testSiblingNodes_returnsParentChildNodes() {
        TestNode parent = new TestNode("http://example.com/");
        TestNode c0 = new TestNode("http://example.com/");
        TestNode c1 = new TestNode("http://example.com/");
        parent.addChildren(c0, c1);
        List<Node> siblings = c0.siblingNodes();
        assertEquals(parent.childNodes().size(), siblings.size());
        assertTrue(siblings.contains(c0));
        assertTrue(siblings.contains(c1));
    }

    @Test
    public void testNextSibling_nullForRoot() {
        TestNode n = new TestNode("http://example.com/");
        assertNull(n.nextSibling());
    }

    @Test
    public void testNextSibling_returnsNextOrNullForLast() {
        TestNode parent = new TestNode("http://example.com/");
        TestNode c0 = new TestNode("http://example.com/");
        TestNode c1 = new TestNode("http://example.com/");
        TestNode c2 = new TestNode("http://example.com/");
        parent.addChildren(c0, c1, c2);
        assertSame(c1, c0.nextSibling());
        assertNull(c2.nextSibling());
    }

    @Test
    public void testPreviousSibling_nullForFirst() {
        TestNode parent = new TestNode("http://example.com/");
        TestNode c0 = new TestNode("http://example.com/");
        TestNode c1 = new TestNode("http://example.com/");
        parent.addChildren(c0, c1);
        assertNull(c0.previousSibling());
    }

    @Test
    public void testPreviousSibling_returnsPreviousForNonFirst() {
        TestNode parent = new TestNode("http://example.com/");
        TestNode c0 = new TestNode("http://example.com/");
        TestNode c1 = new TestNode("http://example.com/");
        parent.addChildren(c0, c1);
        assertSame(c0, c1.previousSibling());
    }

    // ===================== siblingIndex / setSiblingIndex =====================

    @Test
    public void testSiblingIndex_getSet() {
        TestNode n = new TestNode("http://example.com/");
        n.setSiblingIndex(5);
        assertEquals(5, n.siblingIndex().intValue());
    }

    // ===================== outerHtml / toString =====================

    @Test
    public void testOuterHtml_nonTextNode_includesHeadAndTail() {
        Document doc = new Document("http://example.com/");
        TestNode child = new TestNode("http://example.com/", "mynode");
        doc.addChildren(child);
        String html = child.outerHtml();
        assertEquals("<mynode></mynode>", html);
    }

    @Test
    public void testOuterHtml_textNode_skipsTail() {
        Document doc = new Document("http://example.com/");
        TestNode textNode = new TestNode("http://example.com/", "#text");
        doc.addChildren(textNode);
        String html = textNode.outerHtml();
        assertEquals("<#text>", html); // tail skipped because nodeName() == "#text"
    }

    @Test(expected = NullPointerException.class)
    public void testOuterHtml_detachedNonDocumentNode_throwsNPE() {
        // ownerDocument() is null for a detached, non-Document node;
        // ownerDocument().outputSettings() => NPE (fault inherent in given source)
        TestNode n = new TestNode("http://example.com/");
        n.outerHtml();
    }

    @Test
    public void testToString_delegatesToOuterHtml() {
        Document doc = new Document("http://example.com/");
        TestNode child = new TestNode("http://example.com/", "mynode");
        doc.addChildren(child);
        assertEquals(child.outerHtml(), child.toString());
    }

    // ===================== equals / hashCode =====================

    @Test
    public void testEquals_sameReference_true() {
        TestNode n = new TestNode("http://example.com/");
        assertTrue(n.equals(n));
    }

    @Test
    public void testEquals_differentReference_alwaysFalse() {
        TestNode n1 = new TestNode("http://example.com/");
        TestNode n2 = new TestNode("http://example.com/");
        // per source code comment: always false unless same reference
        assertFalse(n1.equals(n2));
    }

    @Test
    public void testHashCode_noParent_noException() {
        TestNode n = new TestNode("http://example.com/");
        // should not throw even though parentNode is null
        int hc = n.hashCode();
        assertEquals(hc, n.hashCode()); // consistent across calls
    }

    @Test
    public void testHashCode_withParent_noException() {
        TestNode parent = new TestNode("http://example.com/");
        TestNode child = new TestNode("http://example.com/");
        parent.addChildren(child);
        int hc = child.hashCode();
        assertEquals(hc, child.hashCode());
    }
}
```

# สรุปตาราง Test Coverage

| กลุ่มเมธอด | Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| Constructor | testConstructorBaseUriAttributesNotNull_trimsBaseUri | baseUri/attributes ไม่ null, trim() ทำงาน |
| Constructor | testConstructorNullBaseUriThrows | Validate.notNull(baseUri) == null branch |
| Constructor | testConstructorNullAttributesThrows | Validate.notNull(attributes) == null branch |
| Constructor | testSingleArgConstructor_defaultAttributes | this(baseUri, new Attributes()) |
| Constructor | testDefaultConstructor_attributesNullChildrenEmpty | default constructor: EMPTY_LIST, attributes=null |
| Constructor | testDefaultConstructor_hasAttrThrowsNPE_dueToNullAttributes | NPE จาก attributes null (fault เชิง usage) |
| attr/hasAttr/removeAttr | testAttrGetExisting | hasAttr true branch ใน attr() |
| attr | testAttrGetNonExisting_noAbsPrefix_returnsEmpty | hasAttr false, ไม่ขึ้นด้วย "abs:" → else return "" |
| attr | testAttrGet_absPrefix_withMissingAttribute_returnsEmpty | hasAttr false, startsWith("abs:") true → absUrl path (hasAttr false) |
| attr | testAttrGet_absPrefix_withPresentAttribute_resolvesAbsolute | abs: branch ร่วมกับ absUrl success path |
| attr | testAttrGetNullKeyThrows | Validate.notNull(attributeKey) null branch |
| attr(set) | testAttrSetAndGet_chaining | attr(key,value) + chaining |
| hasAttr | testHasAttrTrueFalse | true/false branch ของ hasAttr |
| hasAttr | testHasAttrNullKeyThrows | Validate.notNull null branch |
| removeAttr | testRemoveAttr_removesExisting | remove แล้ว hasAttr=false |
| removeAttr | testRemoveAttrNullKeyThrows | null key branch |
| baseUri | testBaseUriGetSet / testSetBaseUriNullThrows | setBaseUri ปกติ / null throw |
| absUrl | testAbsUrl_attributeMissing_returnsEmpty | hasAttr false → "" |
| absUrl | testAbsUrl_emptyKey_throws | Validate.notEmpty branch |
| absUrl | testAbsUrl_baseMalformed_relAlsoMalformed_returnsEmpty | base malformed → inner catch → relUrl malformed → outer catch → "" |
| absUrl | testAbsUrl_baseMalformed_relAbsoluteValid_returnsResolved | base malformed → inner catch → relUrl valid → return abs |
| absUrl | testAbsUrl_baseValid_relValid_returnsResolved | base valid, new URL(base,rel) success |
| absUrl | testAbsUrl_baseValid_relUnknownProtocol_returnsEmpty | base valid, new URL(base,rel) throws → outer catch → "" |
| childNode/childNodes | testChildNodeByIndex / IndexOutOfBounds / Unmodifiable / AsArray | ปกติ, out-of-range, immutability, array conversion |
| parent/ownerDocument | testParent_nullForRoot / afterAddChildren | parentNode null/not null |
| ownerDocument | testOwnerDocument_selfWhenIsDocument | instanceof Document == true |
| ownerDocument | testOwnerDocument_nullWhenNoParentAndNotDocument | parentNode==null, not Document |
| ownerDocument | testOwnerDocument_recursesToParentDocument | else recurse branch |
| remove | testRemove_noParent_throws | Validate.notNull(parentNode) null branch |
| remove | testRemove_removesFromParent | removeChild + reindexChildren |
| replaceWith | testReplaceWith_nullArgument_throws | Validate.notNull(in) null branch |
| replaceWith | testReplaceWith_noParent_throws | Validate.notNull(parentNode) null branch |
| replaceWith | testReplaceWith_replacesNodeAtSamePosition | replaceChild logic ปกติ (in.parentNode==null branch) |
| addChildren(varargs) | testAddChildren_setsParentAndSiblingIndex | reparentChild (parentNode==null branch) |
| addChildren(varargs) | testAddChildren_reparentsExistingChild | reparentChild (parentNode!=null branch → removeChild) |
| addChildren(int,...) | testAddChildrenAtIndex_insertsInOrder | loop ย้อนกลับ, reindexChildren |
| addChildren(int,...) | testAddChildrenAtIndex_nullElement_throws | Validate.noNullElements branch |
| siblingNodes | testSiblingNodes_returnsParentChildNodes | parent().childNodes() |
| nextSibling | testNextSibling_nullForRoot | parentNode==null branch |
| nextSibling | testNextSibling_returnsNextOrNullForLast | size>index+1 true/false branch |
| previousSibling | testPreviousSibling_nullForFirst / returnsPreviousForNonFirst | index>0 false/true branch |
| siblingIndex | testSiblingIndex_getSet | getter/setter |
| outerHtml | testOuterHtml_nonTextNode_includesHeadAndTail | OuterHtmlVisitor.tail: nodeName != "#text" branch |
| outerHtml | testOuterHtml_textNode_skipsTail | OuterHtmlVisitor.tail: nodeName == "#text" branch (skip) |
| outerHtml | testOuterHtml_detachedNonDocumentNode_throwsNPE | ownerDocument()==null → NPE (fault exposure) |
| toString | testToString_delegatesToOuterHtml | toString() == outerHtml() |
| equals | testEquals_sameReference_true | this==o true branch |
| equals | testEquals_differentReference_alwaysFalse | this==o false branch (always false) |
| hashCode | testHashCode_noParent_noException | parentNode==null ternary branch |
| hashCode | testHashCode_withParent_noException | parentNode!=null ternary branch |