# JUnit 4 Test Suite สำหรับ `org.jsoup.nodes.Node`

**หมายเหตุสำคัญก่อนเริ่ม:**
- เนื่องจาก `Node` เป็น `abstract class` จึงต้องทดสอบผ่านคลาส concrete ที่เป็นส่วนหนึ่งของ codebase เดียวกัน (`Document`, `Element`, `TextNode`) ซึ่งเป็นวิธีมาตรฐานที่ใช้ทดสอบคลาสนี้
- คลาส `org.jsoup.helper.Validate` ไม่ได้แสดง source มาให้ แต่ถูกเรียกใช้ทั่วทั้งคลาส — จากพฤติกรรมที่เป็นที่รู้จักทั่วไปของ jsoup สมมติว่า `Validate.notNull/notEmpty/isTrue` throw `IllegalArgumentException` (คอมเมนต์กำกับไว้ในโค้ดทุกจุดที่ใช้สมมติฐานนี้)
- บางเทสถูกออกแบบให้ "อาจ fail" บน source ที่ให้มา เพราะ assertion อ้างอิงจาก **javadoc ที่อยู่ในซอร์สโค้ดเอง** (ไม่ได้เดา) เพื่อจุดประสงค์ในการดักจับ fault ตามข้อ 4 — มีคอมเมนต์กำกับไว้ชัดเจนทุกจุด

```java
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.NodeVisitor;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class NodeTest {

    // ===================== attr() getter =====================

    @Test
    public void testAttrGetExisting() {
        Document doc = Jsoup.parse("<a href='http://example.com/'>link</a>");
        Element a = doc.select("a").first();
        assertEquals("http://example.com/", a.attr("href"));
    }

    @Test
    public void testAttrGetMissingReturnsEmptyString() {
        Document doc = Jsoup.parse("<a href='http://example.com/'>link</a>");
        Element a = doc.select("a").first();
        assertEquals("", a.attr("nonexistent"));
    }

    @Test
    public void testAttrGetAbsPrefixDelegatesToAbsUrl() {
        Document doc = Jsoup.parse("<a href='/foo'>link</a>", "http://example.com/");
        Element a = doc.select("a").first();
        assertEquals("http://example.com/foo", a.attr("abs:href"));
    }

    // Validate.notNull assumed to throw IllegalArgumentException (ไม่ได้แสดงใน source)
    @Test(expected = IllegalArgumentException.class)
    public void testAttrGetNullKeyThrows() {
        Document doc = Jsoup.parse("<a href='/foo'>link</a>");
        doc.select("a").first().attr(null);
    }

    // ===================== attr() setter =====================

    @Test
    public void testAttrSetReturnsThisAndReplacesValue() {
        Document doc = Jsoup.parse("<a href='/foo'>link</a>");
        Element a = doc.select("a").first();
        Node ret = a.attr("href", "/bar");
        assertSame(a, ret);
        assertEquals("/bar", a.attr("href"));
    }

    // ===================== hasAttr() =====================

    @Test
    public void testHasAttrPlainKeyTrueFalse() {
        Document doc = Jsoup.parse("<a href='/foo'>link</a>");
        Element a = doc.select("a").first();
        assertTrue(a.hasAttr("href"));
        assertFalse(a.hasAttr("nonexistent"));
    }

    @Test
    public void testHasAttrAbsPrefixTrueWhenResolvable() {
        Document doc = Jsoup.parse("<a href='/foo'>link</a>", "http://example.com/");
        Element a = doc.select("a").first();
        assertTrue(a.hasAttr("abs:href"));
    }

    @Test
    public void testHasAttrAbsPrefixFalseWhenAbsUrlEmpty() {
        // baseUri ผิดรูปแบบ + href เป็น relative -> absUrl("href") = "" -> เงื่อนไข !absUrl.equals("") เป็น false
        Document doc = Jsoup.parse("<a href='/foo'>link</a>", "not a url");
        Element a = doc.select("a").first();
        assertFalse(a.hasAttr("abs:href"));
    }

    @Test
    public void testHasAttrAbsPrefixFalseWhenKeyMissing() {
        Document doc = Jsoup.parse("<a>link</a>", "http://example.com/");
        Element a = doc.select("a").first();
        assertFalse(a.hasAttr("abs:href"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHasAttrNullKeyThrows() {
        Document doc = Jsoup.parse("<a href='/foo'>link</a>");
        doc.select("a").first().hasAttr(null);
    }

    // ===================== removeAttr() =====================

    @Test
    public void testRemoveAttr() {
        Document doc = Jsoup.parse("<a href='/foo'>link</a>");
        Element a = doc.select("a").first();
        a.removeAttr("href");
        assertFalse(a.hasAttr("href"));
    }

    // ===================== baseUri / setBaseUri =====================

    @Test
    public void testBaseUriIsTrimmedOnConstruction() {
        Document doc = Jsoup.parse("<a>link</a>", "  http://example.com/  ");
        assertEquals("http://example.com/", doc.baseUri());
    }

    @Test
    public void testSetBaseUriIsRecursiveViaTraverse() {
        Document doc = Jsoup.parse("<div><p>text</p></div>", "http://example.com/");
        doc.setBaseUri("http://foo.com/");
        Elements all = doc.select("*");
        for (Element el : all) {
            assertEquals("http://foo.com/", el.baseUri());
        }
    }

    // ===================== absUrl() =====================

    @Test
    public void testAbsUrlNoAttrReturnsEmpty() {
        Document doc = Jsoup.parse("<a>link</a>", "http://example.com/");
        assertEquals("", doc.select("a").first().absUrl("href"));
    }

    @Test
    public void testAbsUrlRelativeResolvedAgainstBase() {
        Document doc = Jsoup.parse("<a href='foo.html'>link</a>", "http://example.com/dir/");
        assertEquals("http://example.com/dir/foo.html", doc.select("a").first().absUrl("href"));
    }

    @Test
    public void testAbsUrlAbsoluteAttrIgnoresBase() {
        Document doc = Jsoup.parse("<a href='http://other.com/x'>link</a>", "http://example.com/");
        assertEquals("http://other.com/x", doc.select("a").first().absUrl("href"));
    }

    @Test
    public void testAbsUrlMalformedBaseButAbsoluteAttrSucceeds() {
        Document doc = Jsoup.parse("<a href='http://other.com/x'>link</a>", "not a url");
        assertEquals("http://other.com/x", doc.select("a").first().absUrl("href"));
    }

    @Test
    public void testAbsUrlMalformedBaseAndRelativeAttrReturnsEmpty() {
        Document doc = Jsoup.parse("<a href='/x'>link</a>", "not a url");
        assertEquals("", doc.select("a").first().absUrl("href"));
    }

    @Test
    public void testAbsUrlQueryStringOnlyWorkaround() {
        Document doc = Jsoup.parse("<a href='?foo=bar'>link</a>", "http://example.com/dir/file.html");
        assertEquals("http://example.com/dir/file.html?foo=bar",
                doc.select("a").first().absUrl("href"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbsUrlEmptyKeyThrows() {
        Document doc = Jsoup.parse("<a href='/x'>link</a>");
        doc.select("a").first().absUrl("");
    }

    // ===================== childNode / childNodes =====================

    @Test
    public void testChildNodeByIndex() {
        Document doc = Jsoup.parse("<div>A<b>B</b></div>");
        Element div = doc.select("div").first();
        assertEquals("A", ((TextNode) div.childNode(0)).text());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildNodeOutOfBoundsThrows() {
        Document doc = Jsoup.parse("<div></div>");
        doc.select("div").first().childNode(0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testChildNodesIsUnmodifiable() {
        Document doc = Jsoup.parse("<div>A</div>");
        List<Node> children = doc.select("div").first().childNodes();
        children.add(new TextNode("X", ""));
    }

    @Test
    public void testChildNodesEmptyWhenNoChildren() {
        Document doc = Jsoup.parse("<div></div>");
        assertTrue(doc.select("div").first().childNodes().isEmpty());
    }

    // ===================== parent / ownerDocument =====================

    @Test
    public void testParentNullForRootDocument() {
        Document doc = Jsoup.parse("<div></div>");
        assertNull(doc.parent());
    }

    @Test
    public void testOwnerDocumentReturnsDocumentForDescendant() {
        Document doc = Jsoup.parse("<div><p>x</p></div>");
        assertSame(doc, doc.select("p").first().ownerDocument());
    }

    @Test
    public void testOwnerDocumentOnDocumentItself() {
        Document doc = Jsoup.parse("<div></div>");
        assertSame(doc, doc.ownerDocument());
    }

    @Test
    public void testOwnerDocumentNullWhenOrphan() {
        TextNode orphan = new TextNode("hello", "");
        assertNull(orphan.ownerDocument());
    }

    // ===================== remove() =====================

    @Test
    public void testRemove() {
        Document doc = Jsoup.parse("<div><p>one</p><p>two</p></div>");
        Element div = doc.select("div").first();
        Element firstP = div.select("p").first();
        firstP.remove();
        assertEquals(1, div.children().size());
        assertNull(firstP.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveWithoutParentThrows() {
        Element orphan = new Element(Tag.valueOf("div"), "");
        orphan.remove();
    }

    // ===================== before(String) / after(String) =====================

    @Test
    public void testBeforeHtmlInsertsSiblingBeforeThisNode() {
        Document doc = Jsoup.parse("<div><p>Two</p></div>");
        Element div = doc.select("div").first();
        Element p = doc.select("p").first();
        p.before("<p>One</p>");
        assertEquals(2, div.childNodes().size());
        assertEquals("One", ((Element) div.childNode(0)).text());
        assertEquals("Two", ((Element) div.childNode(1)).text());
    }

    @Test
    public void testAfterHtmlInsertsSiblingAfterThisNode() {
        Document doc = Jsoup.parse("<div><p>One</p></div>");
        Element div = doc.select("div").first();
        Element p = doc.select("p").first();
        p.after("<p>Two</p>");
        assertEquals(2, div.childNodes().size());
        assertEquals("One", ((Element) div.childNode(0)).text());
        assertEquals("Two", ((Element) div.childNode(1)).text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBeforeHtmlNullThrows() {
        Document doc = Jsoup.parse("<div><p>Two</p></div>");
        doc.select("p").first().before((String) null);
    }

    // ===================== before(Node) / after(Node) =====================

    @Test
    public void testBeforeNode() {
        Document doc = Jsoup.parse("<div><p>Two</p></div>");
        Element div = doc.select("div").first();
        Element p = doc.select("p").first();
        TextNode newNode = new TextNode("New", doc.baseUri());
        p.before(newNode);
        assertSame(newNode, div.childNode(0));
    }

    @Test
    public void testAfterNode() {
        Document doc = Jsoup.parse("<div><p>One</p></div>");
        Element div = doc.select("div").first();
        Element p = doc.select("p").first();
        TextNode newNode = new TextNode("New", doc.baseUri());
        p.after(newNode);
        assertSame(newNode, div.childNode(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBeforeNodeNullThrows() {
        Document doc = Jsoup.parse("<div><p>Two</p></div>");
        doc.select("p").first().before((Node) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBeforeNodeWithoutParentThrows() {
        Element orphan = new Element(Tag.valueOf("p"), "");
        orphan.before(new TextNode("x", ""));
    }

    // ===================== wrap() =====================
    // NOTE: wrap() เป็นจุดที่คาดว่ามี defect (Jsoup-22) อยู่ในลูป "remainder" ของซอร์สที่ให้มา
    // assertion ด้านล่างอ้างอิงจาก "พฤติกรรมที่ถูกเอกสาร (javadoc)" ของ wrap() ไม่ได้เดาเอง
    // หาก fail แสดงว่าพบ fault ตามจุดประสงค์ของโจทย์

    @Test
    public void testWrapSimpleElementKeepsStructure() {
        Document doc = Jsoup.parse("<div><p>Text</p></div>");
        Element div = doc.select("div").first();
        Element p = doc.select("p").first();
        Node ret = p.wrap("<span></span>");
        assertSame(p, ret);

        // ตามเอกสาร: p ควรถูกห่อด้วย span และ span ควรยังเป็นลูกของ div เดิม
        assertEquals(1, div.childNodes().size());
        Node wrapped = div.childNode(0);
        assertTrue(wrapped instanceof Element);
        assertEquals("span", ((Element) wrapped).tagName());
        assertEquals(1, ((Element) wrapped).childNodes().size());
        assertSame(p, ((Element) wrapped).childNode(0));
    }

    @Test
    public void testWrapUnbalancedHtmlKeepsRemainderInsideWrap() {
        Document doc = Jsoup.parse("<div><p>Text</p></div>");
        Element div = doc.select("div").first();
        Element p = doc.select("p").first();
        p.wrap("<div class='head'></div><p>remainder</p>");

        // ตามเอกสาร javadoc: "The <p> is remainder" -> remainder ควรถูกเก็บไว้ใน wrap element (div.head)
        // ซึ่ง div.head เองควรยังอยู่ใน div เดิม
        assertEquals(1, div.childNodes().size());
        Node wrapEl = div.childNode(0);
        assertTrue(wrapEl instanceof Element);
        assertEquals("div", ((Element) wrapEl).tagName());
        assertEquals(2, ((Element) wrapEl).childNodes().size());
    }

    @Test
    public void testWrapWithPlainTextReturnsNullAndNoop() {
        Document doc = Jsoup.parse("<div><p>Text</p></div>");
        Element div = doc.select("div").first();
        Element p = doc.select("p").first();
        Node ret = p.wrap("not html");
        assertNull(ret);
        assertEquals(1, div.childNodes().size());
        assertSame(p, div.childNode(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWrapEmptyHtmlThrows() {
        Document doc = Jsoup.parse("<div><p>Text</p></div>");
        doc.select("p").first().wrap("");
    }

    // ===================== unwrap() =====================

    @Test
    public void testUnwrapMovesChildrenUpAndReturnsFirstChild() {
        Document doc = Jsoup.parse("<div>One <span>Two <b>Three</b></span></div>");
        Element div = doc.select("div").first();
        Element span = doc.select("span").first();

        Node firstChild = span.unwrap();

        assertTrue(firstChild instanceof TextNode);
        assertEquals("Two ", ((TextNode) firstChild).text());

        assertEquals(3, div.childNodes().size());
        assertEquals("One ", ((TextNode) div.childNode(0)).text());
        assertSame(firstChild, div.childNode(1));
        assertEquals("b", ((Element) div.childNode(2)).tagName());
    }

    @Test
    public void testUnwrapReturnsNullWhenNoChildren() {
        Document doc = Jsoup.parse("<div><span></span></div>");
        Element span = doc.select("span").first();
        assertNull(span.unwrap());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnwrapWithoutParentThrows() {
        Element orphan = new Element(Tag.valueOf("span"), "");
        orphan.unwrap();
    }

    // ===================== replaceWith() =====================

    @Test
    public void testReplaceWith() {
        Document doc = Jsoup.parse("<div><p>One</p></div>");
        Element div = doc.select("div").first();
        Element p = doc.select("p").first();
        Element newEl = new Element(Tag.valueOf("span"), doc.baseUri());
        newEl.text("New");

        p.replaceWith(newEl);

        assertSame(newEl, div.childNode(0));
        assertNull(p.parent());
        assertEquals("New", newEl.text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceWithNullThrows() {
        Document doc = Jsoup.parse("<div><p>One</p></div>");
        doc.select("p").first().replaceWith(null);
    }

    // ===================== siblingNodes() =====================
    // NOTE: javadoc ของ siblingNodes() ระบุว่า "does not include this node"
    // แต่ implementation คือ `return parent().childNodes();` ซึ่งรวมตัวเองด้วย
    // -> เทสนี้อ้างอิงจาก javadoc ในซอร์ส จึงมีโอกาสดักจับ fault ตามจุดประสงค์

    @Test
    public void testSiblingNodesShouldExcludeSelfPerJavadoc() {
        Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</p></div>");
        Element middle = doc.select("p").get(1);
        List<Node> siblings = middle.siblingNodes();
        assertFalse("ตาม javadoc ไม่ควรมีตัวเองอยู่ใน siblingNodes()", siblings.contains(middle));
        assertEquals(2, siblings.size());
    }

    @Test(expected = NullPointerException.class)
    public void testSiblingNodesOnRootThrowsNPE() {
        // siblingNodes() เรียก parent().childNodes() โดยไม่ตรวจ null ก่อน
        // สำหรับ root node ที่ parent()==null จะเกิด NPE ตาม source ที่ให้มา
        Document doc = Jsoup.parse("<div></div>");
        doc.siblingNodes();
    }

    // ===================== nextSibling() / previousSibling() =====================

    @Test
    public void testNextSiblingReturnsNextNode() {
        Document doc = Jsoup.parse("<div><p>One</p><p>Two</p></div>");
        Element first = doc.select("p").get(0);
        Element second = doc.select("p").get(1);
        assertSame(second, first.nextSibling());
    }

    @Test
    public void testNextSiblingNullWhenLast() {
        Document doc = Jsoup.parse("<div><p>One</p></div>");
        assertNull(doc.select("p").first().nextSibling());
    }

    @Test
    public void testNextSiblingNullForRoot() {
        // nextSibling() มีการตรวจ parentNode == null ก่อน จึงคืน null อย่างปลอดภัย
        Document doc = Jsoup.parse("<div></div>");
        assertNull(doc.nextSibling());
    }

    @Test
    public void testPreviousSiblingReturnsPreviousNode() {
        Document doc = Jsoup.parse("<div><p>One</p><p>Two</p></div>");
        Element first = doc.select("p").get(0);
        Element second = doc.select("p").get(1);
        assertSame(first, second.previousSibling());
    }

    @Test
    public void testPreviousSiblingNullWhenFirst() {
        Document doc = Jsoup.parse("<div><p>One</p><p>Two</p></div>");
        assertNull(doc.select("p").get(0).previousSibling());
    }

    @Test(expected = NullPointerException.class)
    public void testPreviousSiblingOnRootThrowsNPE() {
        // แตกต่างจาก nextSibling(): previousSibling() ไม่ตรวจ parentNode == null ก่อน
        // ที่ใช้ parentNode.childNodes -> เกิด NPE เมื่อไม่มี parent ตาม source ที่ให้มา
        Document doc = Jsoup.parse("<div></div>");
        doc.previousSibling();
    }

    // ===================== siblingIndex() =====================

    @Test
    public void testSiblingIndexReflectsPosition() {
        Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</p></div>");
        Elements ps = doc.select("p");
        assertEquals(0, ps.get(0).siblingIndex());
        assertEquals(1, ps.get(1).siblingIndex());
        assertEquals(2, ps.get(2).siblingIndex());
    }

    // ===================== traverse() =====================

    @Test
    public void testTraverseVisitsAllNodes() {
        Document doc = Jsoup.parse("<div><p>One</p></div>");
        final StringBuilder accum = new StringBuilder();
        doc.select("div").first().traverse(new NodeVisitor() {
            public void head(Node node, int depth) {
                accum.append("<").append(node.nodeName()).append(">");
            }
            public void tail(Node node, int depth) {
                accum.append("</").append(node.nodeName()).append(">");
            }
        });
        assertTrue(accum.toString().contains("<div>"));
        assertTrue(accum.toString().contains("<p>"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTraverseNullVisitorThrows() {
        Document doc = Jsoup.parse("<div></div>");
        doc.traverse(null);
    }

    // ===================== outerHtml() / toString() =====================

    @Test
    public void testOuterHtmlEqualsToString() {
        Document doc = Jsoup.parse("<div><p>Text</p></div>");
        Element p = doc.select("p").first();
        assertEquals(p.outerHtml(), p.toString());
        assertTrue(p.outerHtml().contains("Text"));
    }

    // ===================== equals() / hashCode() =====================

    @Test
    public void testEqualsSameInstanceTrue() {
        Document doc = Jsoup.parse("<div></div>");
        Element div = doc.select("div").first();
        assertTrue(div.equals(div));
    }

    @Test
    public void testEqualsDifferentInstanceFalse() {
        Document doc = Jsoup.parse("<div></div><div></div>");
        Elements divs = doc.select("div");
        assertFalse(divs.get(0).equals(divs.get(1)));
    }

    @Test
    public void testHashCodeIsConsistent() {
        Document doc = Jsoup.parse("<div></div>");
        Element div = doc.select("div").first();
        assertEquals(div.hashCode(), div.hashCode());
    }

    // ===================== clone() / doClone() =====================

    @Test
    public void testCloneCreatesIndependentOrphan() {
        Document doc = Jsoup.parse("<div><p>Text</p></div>");
        Element div = doc.select("div").first();
        Element clone = (Element) div.clone();

        clone.append("<p>Added</p>");

        assertEquals(1, div.children().size());
        assertEquals(2, clone.children().size());
        assertNull(clone.parent());
    }

    @Test
    public void testCloneDeepCopiesChildNodes() {
        Document doc = Jsoup.parse("<div><p>Text</p></div>");
        Element div = doc.select("div").first();
        Node clone = div.clone();
        assertNotSame(div.childNode(0), clone.childNode(0));
    }
}
```

## ตารางสรุป Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testAttrGetExisting | `attr()`: `attributes.hasKey()==true` |
| testAttrGetMissingReturnsEmptyString | `attr()`: hasKey false, ไม่ขึ้นต้น `abs:` -> else `""` |
| testAttrGetAbsPrefixDelegatesToAbsUrl | `attr()`: hasKey false, ขึ้นต้น `abs:` true |
| testAttrGetNullKeyThrows | `Validate.notNull(attributeKey)` throw |
| testAttrSetReturnsThisAndReplacesValue | `attr(key,val)` setter, chaining |
| testHasAttrPlainKeyTrueFalse | `hasAttr()`: ไม่ใช่ abs: ทั้ง true/false |
| testHasAttrAbsPrefixTrueWhenResolvable | `hasAttr()`: abs: + hasKey true + absUrl≠"" |
| testHasAttrAbsPrefixFalseWhenAbsUrlEmpty | `hasAttr()`: abs: + hasKey true + absUrl=="" |
| testHasAttrAbsPrefixFalseWhenKeyMissing | `hasAttr()`: abs: + hasKey false |
| testHasAttrNullKeyThrows | `Validate.notNull` ใน hasAttr |
| testRemoveAttr | `removeAttr()` |
| testBaseUriIsTrimmedOnConstruction | constructor `baseUri.trim()` |
| testSetBaseUriIsRecursiveViaTraverse | `setBaseUri()` + anonymous NodeVisitor |
| testAbsUrlNoAttrReturnsEmpty | `absUrl()`: `!hasAttr` true |
| testAbsUrlRelativeResolvedAgainstBase | base valid, relUrl ไม่ขึ้นด้วย `?` |
| testAbsUrlAbsoluteAttrIgnoresBase | base valid, attr absolute |
| testAbsUrlMalformedBaseButAbsoluteAttrSucceeds | inner catch: base invalid, attr absolute สำเร็จ |
| testAbsUrlMalformedBaseAndRelativeAttrReturnsEmpty | outer catch: base invalid, attr ก็ invalid |
| testAbsUrlQueryStringOnlyWorkaround | `relUrl.startsWith("?")==true` |
| testAbsUrlEmptyKeyThrows | `Validate.notEmpty` ใน absUrl |
| testChildNodeByIndex / testChildNodeOutOfBoundsThrows | `childNode(index)` boundary |
| testChildNodesIsUnmodifiable / testChildNodesEmptyWhenNoChildren | `childNodes()` immutability + empty |
| testParentNullForRootDocument | `parent()` null |
| testOwnerDocumentReturnsDocumentForDescendant | `ownerDocument()`: not Document, recurse |
| testOwnerDocumentOnDocumentItself | `ownerDocument()`: instanceof Document true |
| testOwnerDocumentNullWhenOrphan | `ownerDocument()`: parentNode null |
| testRemove / testRemoveWithoutParentThrows | `remove()` ปกติ / Validate throw |
| testBeforeHtmlInsertsSiblingBeforeThisNode / testAfterHtmlInsertsSiblingAfterThisNode | `before(String)/after(String)` + `addSiblingHtml` |
| testBeforeHtmlNullThrows | Validate.notNull(html) |
| testBeforeNode / testAfterNode | `before(Node)/after(Node)` |
| testBeforeNodeNullThrows / testBeforeNodeWithoutParentThrows | Validate throw ทั้งสองกรณี |
| testWrapSimpleElementKeepsStructure | `wrap()` กรณี element เดี่ยว (เป้าหมายดักจับ fault) |
| testWrapUnbalancedHtmlKeepsRemainderInsideWrap | `wrap()` remainder loop (เป้าหมายดักจับ fault) |
| testWrapWithPlainTextReturnsNullAndNoop | `wrap()`: `wrapNode` ไม่ใช่ Element -> return null |
| testWrapEmptyHtmlThrows | `Validate.notEmpty(html)` |
| testUnwrapMovesChildrenUpAndReturnsFirstChild | `unwrap()` ปกติ มี children |
| testUnwrapReturnsNullWhenNoChildren | `unwrap()`: childNodes.size()==0 |
| testUnwrapWithoutParentThrows | Validate throw |
| testReplaceWith / testReplaceWithNullThrows | `replaceWith()` ปกติ/throw |
| testSiblingNodesShouldExcludeSelfPerJavadoc | `siblingNodes()` ตรวจตาม javadoc (เป้าหมายดักจับ fault) |
| testSiblingNodesOnRootThrowsNPE | NPE จาก `parent()==null` |
| testNextSiblingReturnsNextNode / testNextSiblingNullWhenLast / testNextSiblingNullForRoot | `nextSibling()`: 3 branch |
| testPreviousSiblingReturnsPreviousNode / testPreviousSiblingNullWhenFirst | `previousSibling()`: `index>0` true/false |
| testPreviousSiblingOnRootThrowsNPE | ขาด null-check (เป้าหมายดักจับ fault) |
| testSiblingIndexReflectsPosition | `siblingIndex()` |
| testTraverseVisitsAllNodes / testTraverseNullVisitorThrows | `traverse()` ปกติ/throw |
| testOuterHtmlEqualsToString | `outerHtml()`/`toString()` |
| testEqualsSameInstanceTrue / testEqualsDifferentInstanceFalse | `equals()`: `this==o` true/false |
| testHashCodeIsConsistent | `hashCode()` |
| testCloneCreatesIndependentOrphan / testCloneDeepCopiesChildNodes | `clone()/doClone()` deep copy + orphan |