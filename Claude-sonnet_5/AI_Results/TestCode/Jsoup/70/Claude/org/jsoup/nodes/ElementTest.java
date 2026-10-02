package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

/**
 * JUnit4 test suite for org.jsoup.nodes.Element (Defects4J Jsoup-70b).
 * Focus: branch/condition coverage, boundary values, null/empty inputs, malformed inputs.
 */
public class ElementTest {

    // ---------- Constructors ----------

    @Test
    public void testConstructorWithTagString() {
        Element el = new Element("div");
        assertEquals("div", el.tagName());
        assertEquals("", el.baseUri());
        assertEquals(0, el.childNodeSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullTagThrows() {
        new Element((Tag) null, "");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullBaseUriThrows() {
        new Element(Tag.valueOf("div"), null);
    }

    @Test
    public void testConstructorTagBaseUriNoAttributes() {
        // attributes = null path -> hasAttributes() false until attributes() called
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertFalse(el.hasAttributes());
        assertNotNull(el.attributes()); // lazily creates
        assertTrue(el.hasAttributes());
    }

    // ---------- attributes / baseUri ----------

    @Test
    public void testAttributesLazyInit() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertFalse(el.hasAttributes());
        el.attr("id", "x");
        assertTrue(el.hasAttributes());
    }

    @Test
    public void testChildNodeSizeEmpty() {
        Element el = new Element("div");
        assertEquals(0, el.childNodeSize());
    }

    // ---------- tagName ----------

    @Test
    public void testTagNameChange() {
        Element el = new Element("span");
        el.tagName("DIV");
        assertEquals("DIV", el.tagName()); // preserveCase
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameEmptyThrows() {
        Element el = new Element("div");
        el.tagName("");
    }

    @Test
    public void testIsBlock() {
        Element div = new Element("div");
        Element span = new Element("span");
        assertTrue(div.isBlock());
        assertFalse(span.isBlock());
    }

    // ---------- id ----------

    @Test
    public void testIdPresentAndAbsent() {
        Element el = new Element("div");
        assertEquals("", el.id());
        el.attr("id", "main");
        assertEquals("main", el.id());
    }

    // ---------- attr ----------

    @Test
    public void testAttrStringValue() {
        Element el = new Element("div");
        el.attr("data-x", "1");
        assertEquals("1", el.attr("data-x"));
    }

    @Test
    public void testAttrBooleanTrueAddsThenFalseRemoves() {
        Element el = new Element("input");
        el.attr("disabled", true);
        assertTrue(el.hasAttr("disabled"));
        el.attr("disabled", false);
        assertFalse(el.hasAttr("disabled"));
    }

    @Test
    public void testDataset() {
        Element el = new Element("div");
        el.attr("data-package", "jsoup");
        assertEquals("jsoup", el.dataset().get("package"));
    }

    // ---------- parent / parents ----------

    @Test
    public void testParentNullForStandalone() {
        Element el = new Element("div");
        assertNull(el.parent());
    }

    @Test
    public void testParentsEmptyWhenNoParent() {
        Element el = new Element("div");
        Elements parents = el.parents();
        assertEquals(0, parents.size());
    }

    @Test
    public void testParentsWithHierarchyStopsAtRoot() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<html><body><div><p>hi</p></div></body></html>");
        Element p = doc.select("p").first();
        Elements parents = p.parents();
        // should include div, body, html but not #root document
        assertTrue(parents.size() >= 3);
        for (Element pa : parents) {
            assertNotEquals("#root", pa.tagName());
        }
    }

    // ---------- child / children ----------

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildIndexOutOfBounds() {
        Element el = new Element("div");
        el.child(0);
    }

    @Test
    public void testChildrenEmpty() {
        Element el = new Element("div");
        assertEquals(0, el.children().size());
    }

    @Test
    public void testChildrenFiltersOnlyElements() {
        Element el = new Element("div");
        el.appendText("text-node");
        el.appendElement("span");
        assertEquals(1, el.children().size());
        assertEquals("span", el.child(0).tagName());
    }

    @Test
    public void testChildElementsListShadowCacheInvalidatedOnChange() {
        Element el = new Element("div");
        el.appendElement("span");
        Elements first = el.children();
        assertEquals(1, first.size());
        el.appendElement("em");
        Elements second = el.children();
        assertEquals(2, second.size());
    }

    // ---------- textNodes / dataNodes ----------

    @Test
    public void testTextNodes() {
        Element el = new Element("div");
        el.appendText("hello");
        el.appendElement("span");
        List<TextNode> textNodes = el.textNodes();
        assertEquals(1, textNodes.size());
        assertEquals("hello", textNodes.get(0).text());
    }

    @Test
    public void testDataNodesEmpty() {
        Element el = new Element("div");
        assertEquals(0, el.dataNodes().size());
    }

    @Test
    public void testDataNodesWithScript() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<script>var x=1;</script>");
        Element script = doc.select("script").first();
        assertEquals(1, script.dataNodes().size());
    }

    // ---------- select / selectFirst / is ----------

    @Test
    public void testSelect() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<div><p class='a'>1</p><p>2</p></div>");
        Elements found = doc.select("p.a");
        assertEquals(1, found.size());
    }

    @Test
    public void testSelectFirstNullWhenNoMatch() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<div></div>");
        assertNull(doc.selectFirst("span"));
    }

    @Test
    public void testIsCssQueryTrueFalse() {
        Element el = new Element("div");
        el.attr("class", "foo");
        assertTrue(el.is(".foo"));
        assertFalse(el.is(".bar"));
    }

    // ---------- appendChild / appendTo / prependChild ----------

    @Test(expected = IllegalArgumentException.class)
    public void testAppendChildNullThrows() {
        Element el = new Element("div");
        el.appendChild(null);
    }

    @Test
    public void testAppendChild() {
        Element el = new Element("div");
        Element child = new Element("span");
        el.appendChild(child);
        assertEquals(1, el.childNodeSize());
        assertEquals(0, child.siblingIndex());
    }

    @Test
    public void testAppendTo() {
        Element parent = new Element("div");
        Element child = new Element("span");
        child.appendTo(parent);
        assertEquals(1, parent.childNodeSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendToNullThrows() {
        Element child = new Element("span");
        child.appendTo(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrependChildNullThrows() {
        Element el = new Element("div");
        el.prependChild(null);
    }

    @Test
    public void testPrependChild() {
        Element el = new Element("div");
        el.appendElement("span");
        Element prepended = new Element("em");
        el.prependChild(prepended);
        assertEquals("em", el.child(0).tagName());
    }

    // ---------- insertChildren(int, Collection) ----------

    @Test
    public void testInsertChildrenNegativeIndexRollsAround() {
        Element el = new Element("div");
        el.appendElement("a");
        el.appendElement("b");
        Element c = new Element("c");
        el.insertChildren(-1, java.util.Collections.singletonList(c));
        assertEquals("c", el.child(el.children().size() - 1).tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenCollectionOutOfBoundsThrows() {
        Element el = new Element("div");
        el.insertChildren(5, java.util.Collections.singletonList(new Element("a")));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenCollectionNullThrows() {
        Element el = new Element("div");
        el.insertChildren(0, (java.util.Collection<Node>) null);
    }

    @Test
    public void testInsertChildrenCollectionValidIndex() {
        Element el = new Element("div");
        el.appendElement("a");
        el.insertChildren(0, java.util.Collections.singletonList(new Element("b")));
        assertEquals("b", el.child(0).tagName());
    }

    // ---------- insertChildren(int, Node...) ----------

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenVarargsNullThrows() {
        Element el = new Element("div");
        el.insertChildren(0, (Node[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenVarargsOutOfBoundsThrows() {
        Element el = new Element("div");
        el.insertChildren(5, new Element("a"));
    }

    @Test
    public void testInsertChildrenVarargsValid() {
        Element el = new Element("div");
        el.appendElement("a");
        el.insertChildren(0, new Element("b"));
        assertEquals("b", el.child(0).tagName());
    }

    // ---------- appendElement / prependElement ----------

    @Test
    public void testAppendElement() {
        Element el = new Element("div");
        Element child = el.appendElement("span");
        assertEquals("span", child.tagName());
        assertEquals(1, el.childNodeSize());
    }

    @Test
    public void testPrependElement() {
        Element el = new Element("div");
        el.appendElement("span");
        Element child = el.prependElement("em");
        assertEquals("em", el.child(0).tagName());
        assertSame(child, el.child(0));
    }

    // ---------- appendText / prependText ----------

    @Test(expected = IllegalArgumentException.class)
    public void testAppendTextNullThrows() {
        Element el = new Element("div");
        el.appendText(null);
    }

    @Test
    public void testAppendText() {
        Element el = new Element("div");
        el.appendText("hello");
        assertEquals("hello", el.text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrependTextNullThrows() {
        Element el = new Element("div");
        el.prependText(null);
    }

    @Test
    public void testPrependText() {
        Element el = new Element("div");
        el.appendText("World");
        el.prependText("Hello ");
        assertEquals("Hello World", el.text());
    }

    // ---------- append / prepend (HTML) ----------

    @Test(expected = IllegalArgumentException.class)
    public void testAppendHtmlNullThrows() {
        Element el = new Element("div");
        el.append(null);
    }

    @Test
    public void testAppendHtml() {
        Element el = new Element("div");
        el.append("<p>hi</p>");
        assertEquals(1, el.children().size());
        assertEquals("p", el.child(0).tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrependHtmlNullThrows() {
        Element el = new Element("div");
        el.prepend(null);
    }

    @Test
    public void testPrependHtml() {
        Element el = new Element("div");
        el.append("<p>second</p>");
        el.prepend("<span>first</span>");
        assertEquals("span", el.child(0).tagName());
    }

    // ---------- before / after ----------

    @Test
    public void testBeforeString() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<div><p>hi</p></div>");
        Element p = doc.select("p").first();
        p.before("<span>before</span>");
        assertEquals("span", p.parent().child(0).tagName());
    }

    @Test
    public void testAfterString() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<div><p>hi</p></div>");
        Element p = doc.select("p").first();
        p.after("<span>after</span>");
        assertEquals("span", p.parent().child(1).tagName());
    }

    @Test
    public void testBeforeNode() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<div><p>hi</p></div>");
        Element p = doc.select("p").first();
        Element newEl = new Element("em");
        p.before(newEl);
        assertEquals("em", p.parent().child(0).tagName());
    }

    @Test
    public void testAfterNode() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<div><p>hi</p></div>");
        Element p = doc.select("p").first();
        Element newEl = new Element("em");
        p.after(newEl);
        assertEquals("em", p.parent().child(1).tagName());
    }

    // ---------- empty ----------

    @Test
    public void testEmpty() {
        Element el = new Element("div");
        el.appendText("x");
        el.appendElement("span");
        el.empty();
        assertEquals(0, el.childNodeSize());
    }

    // ---------- wrap ----------

    @Test
    public void testWrap() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<p>hi</p>");
        Element p = doc.select("p").first();
        p.wrap("<div class='wrapper'></div>");
        assertEquals("div", p.parent().tagName());
    }

    // ---------- cssSelector ----------

    @Test
    public void testCssSelectorWithId() {
        Element el = new Element("div");
        el.attr("id", "main");
        assertEquals("#main", el.cssSelector());
    }

    @Test
    public void testCssSelectorNoIdNoClassRoot() {
        Element el = new Element("div"); // standalone, no parent
        assertEquals("div", el.cssSelector());
    }

    @Test
    public void testCssSelectorWithClassNoId() {
        Element el = new Element("div");
        el.addClass("foo");
        assertEquals("div.foo", el.cssSelector());
    }

    @Test
    public void testCssSelectorParentIsDocumentNotIncluded() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<html><body></body></html>");
        Element html = doc.child(0); // html element, parent = #root Document
        String sel = html.cssSelector();
        assertEquals("html", sel);
    }

    @Test
    public void testCssSelectorNestedWithNthChildWhenDuplicateMatches() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<div id='wrap'><p class='a'>1</p><p class='a'>2</p></div>");
        Element wrap = doc.getElementById("wrap");
        Elements ps = wrap.children();
        String sel0 = ps.get(0).cssSelector();
        String sel1 = ps.get(1).cssSelector();
        assertTrue(sel0.contains(":nth-child(1)"));
        assertTrue(sel1.contains(":nth-child(2)"));
    }

    @Test
    public void testCssSelectorNoNthChildWhenUnique() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<div id='wrap'><p class='unique'>only</p></div>");
        Element wrap = doc.getElementById("wrap");
        Element p = wrap.child(0);
        String sel = p.cssSelector();
        assertFalse(sel.contains(":nth-child"));
    }

    // ---------- siblingElements ----------

    @Test
    public void testSiblingElementsNoParent() {
        Element el = new Element("div");
        assertEquals(0, el.siblingElements().size());
    }

    @Test
    public void testSiblingElementsWithParent() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<div><p>1</p><p>2</p><p>3</p></div>");
        Element middle = doc.select("p").get(1);
        Elements sibs = middle.siblingElements();
        assertEquals(2, sibs.size());
        for (Element s : sibs) {
            assertNotSame(middle, s);
        }
    }

    // ---------- nextElementSibling / previousElementSibling ----------

    @Test
    public void testNextElementSiblingNullWhenNoParent() {
        Element el = new Element("div");
        assertNull(el.nextElementSibling());
    }

    @Test
    public void testNextElementSiblingPresent() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Element first = doc.select("p").get(0);
        Element next = first.nextElementSibling();
        assertNotNull(next);
        assertEquals("2", next.text());
    }

    @Test
    public void testNextElementSiblingNullAtEnd() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Element last = doc.select("p").get(1);
        assertNull(last.nextElementSibling());
    }

    @Test
    public void testPreviousElementSiblingNullWhenNoParent() {
        Element el = new Element("div");
        assertNull(el.previousElementSibling());
    }

    @Test
    public void testPreviousElementSiblingNullAtStart() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Element first = doc.select("p").get(0);
        assertNull(first.previousElementSibling());
    }

    @Test
    public void testPreviousElementSiblingPresent() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Element second = doc.select("p").get(1);
        Element prev = second.previousElementSibling();
        assertNotNull(prev);
        assertEquals("1", prev.text());
    }

    // ---------- firstElementSibling / lastElementSibling ----------

    @Test
    public void testFirstElementSiblingSingleChildReturnsNull() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<div><p>only</p></div>");
        Element only = doc.select("p").first();
        assertNull(only.firstElementSibling());
    }

    @Test
    public void testFirstElementSiblingMultiple() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Element second = doc.select("p").get(1);
        Element first = second.firstElementSibling();
        assertNotNull(first);
        assertEquals("1", first.text());
    }

    @Test
    public void testLastElementSiblingSingleChildReturnsNull() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<div><p>only</p></div>");
        Element only = doc.select("p").first();
        assertNull(only.lastElementSibling());
    }

    @Test
    public void testLastElementSiblingMultiple() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Element first = doc.select("p").get(0);
        Element last = first.lastElementSibling();
        assertNotNull(last);
        assertEquals("2", last.text());
    }

    // ---------- elementSiblingIndex ----------

    @Test
    public void testElementSiblingIndexNoParent() {
        Element el = new Element("div");
        assertEquals(0, el.elementSiblingIndex());
    }

    @Test
    public void testElementSiblingIndexWithParent() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<div><p>1</p><p>2</p><p>3</p></div>");
        Element third = doc.select("p").get(2);
        assertEquals(2, third.elementSiblingIndex());
    }

    // ---------- getElementsByTag / getElementById / getElementsByClass ----------

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByTagEmptyThrows() {
        Element el = new Element("div");
        el.getElementsByTag("");
    }

    @Test
    public void testGetElementsByTag() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<div><p>1</p><SPAN>2</SPAN></div>");
        Elements ps = doc.getElementsByTag("p");
        assertEquals(1, ps.size());
        Elements spans = doc.getElementsByTag("SPAN"); // case-insensitive normalize
        assertEquals(1, spans.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementByIdEmptyThrows() {
        Element el = new Element("div");
        el.getElementById("");
    }

    @Test
    public void testGetElementByIdFound() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<div><p id='x'>hi</p></div>");
        Element found = doc.getElementById("x");
        assertNotNull(found);
    }

    @Test
    public void testGetElementByIdNotFoundReturnsNull() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<div><p>hi</p></div>");
        assertNull(doc.getElementById("missing"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByClassEmptyThrows() {
        Element el = new Element("div");
        el.getElementsByClass("");
    }

    @Test
    public void testGetElementsByClass() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<div class='a'><p class='a'>hi</p></div>");
        Elements found = doc.getElementsByClass("a");
        assertEquals(2, found.size());
    }

    // ---------- attribute based finders ----------

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeEmptyThrows() {
        Element el = new Element("div");
        el.getElementsByAttribute("");
    }

    @Test
    public void testGetElementsByAttribute() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<a href='x'>link</a>");
        Elements found = doc.getElementsByAttribute("href");
        assertEquals(1, found.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeStartingEmptyThrows() {
        Element el = new Element("div");
        el.getElementsByAttributeStarting("");
    }

    @Test
    public void testGetElementsByAttributeStarting() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<div data-x='1'></div>");
        Elements found = doc.getElementsByAttributeStarting("data-");
        assertEquals(1, found.size());
    }

    @Test
    public void testGetElementsByAttributeValue() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<a href='x'>link</a>");
        Elements found = doc.getElementsByAttributeValue("href", "x");
        assertEquals(1, found.size());
    }

    @Test
    public void testGetElementsByAttributeValueNot() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<a href='x'>1</a><a href='y'>2</a>");
        Elements found = doc.getElementsByAttributeValueNot("href", "x");
        // excludes href=x
        for (Element e : found) assertNotEquals("x", e.attr("href"));
    }

    @Test
    public void testGetElementsByAttributeValueStarting() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<a href='http://x.com'>1</a>");
        Elements found = doc.getElementsByAttributeValueStarting("href", "http://");
        assertEquals(1, found.size());
    }

    @Test
    public void testGetElementsByAttributeValueEnding() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<a href='file.pdf'>1</a>");
        Elements found = doc.getElementsByAttributeValueEnding("href", ".pdf");
        assertEquals(1, found.size());
    }

    @Test
    public void testGetElementsByAttributeValueContaining() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<a href='http://example.com/x'>1</a>");
        Elements found = doc.getElementsByAttributeValueContaining("href", "example");
        assertEquals(1, found.size());
    }

    @Test
    public void testGetElementsByAttributeValueMatchingPattern() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<a href='123'>1</a>");
        Elements found = doc.getElementsByAttributeValueMatching("href", Pattern.compile("\\d+"));
        assertEquals(1, found.size());
    }

    @Test
    public void testGetElementsByAttributeValueMatchingRegexValid() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<a href='123'>1</a>");
        Elements found = doc.getElementsByAttributeValueMatching("href", "\\d+");
        assertEquals(1, found.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueMatchingRegexInvalidThrows() {
        Element el = new Element("div");
        el.getElementsByAttributeValueMatching("href", "[");
    }

    // ---------- index based finders ----------

    @Test
    public void testGetElementsByIndexLessThan() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<div><p>1</p><p>2</p><p>3</p></div>");
        Elements found = doc.getElementsByIndexLessThan(1);
        assertTrue(found.size() >= 1);
    }

    @Test
    public void testGetElementsByIndexGreaterThan() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<div><p>1</p><p>2</p><p>3</p></div>");
        Elements found = doc.getElementsByIndexGreaterThan(0);
        assertTrue(found.size() >= 1);
    }

    @Test
    public void testGetElementsByIndexEquals() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Elements found = doc.getElementsByIndexEquals(0);
        assertTrue(found.size() >= 1);
    }

    // ---------- text containing / matching ----------

    @Test
    public void testGetElementsContainingText() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<p>Hello World</p>");
        Elements found = doc.getElementsContainingText("hello");
        assertTrue(found.size() >= 1);
    }

    @Test
    public void testGetElementsContainingOwnText() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<p>Hello <b>World</b></p>");
        Elements found = doc.getElementsContainingOwnText("hello");
        assertTrue(found.size() >= 1);
    }

    @Test
    public void testGetElementsMatchingTextPattern() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<p>Hello123</p>");
        Elements found = doc.getElementsMatchingText(Pattern.compile("\\d+"));
        assertTrue(found.size() >= 1);
    }

    @Test
    public void testGetElementsMatchingTextRegexValid() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<p>Hello123</p>");
        Elements found = doc.getElementsMatchingText("\\d+");
        assertTrue(found.size() >= 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingTextRegexInvalidThrows() {
        Element el = new Element("div");
        el.getElementsMatchingText("[");
    }

    @Test
    public void testGetElementsMatchingOwnTextPattern() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<p>Hello123</p>");
        Elements found = doc.getElementsMatchingOwnText(Pattern.compile("\\d+"));
        assertTrue(found.size() >= 1);
    }

    @Test
    public void testGetElementsMatchingOwnTextRegexValid() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<p>Hello123</p>");
        Elements found = doc.getElementsMatchingOwnText("\\d+");
        assertTrue(found.size() >= 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingOwnTextRegexInvalidThrows() {
        Element el = new Element("div");
        el.getElementsMatchingOwnText("[");
    }

    @Test
    public void testGetAllElements() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<div><p>1</p><span>2</span></div>");
        Elements all = doc.getAllElements();
        assertTrue(all.size() >= 3); // html, body, div, p, span etc (depending on parse) - at least several
    }

    // ---------- text() ----------

    @Test
    public void testTextSimple() {
        Element el = new Element("p");
        el.appendText("Hello");
        assertEquals("Hello", el.text());
    }

    @Test
    public void testTextWithBlockChildAddsSpace() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<div>One<div>Two</div></div>");
        Element outer = doc.select("div").first();
        String text = outer.text();
        assertTrue(text.contains("One"));
        assertTrue(text.contains("Two"));
    }

    @Test
    public void testTextWithBrAddsSpace() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<p>One<br>Two</p>");
        Element p = doc.select("p").first();
        assertEquals("One Two", p.text());
    }

    @Test
    public void testTextEmptyWhenNoContent() {
        Element el = new Element("div");
        assertEquals("", el.text());
    }

    // ---------- ownText() ----------

    @Test
    public void testOwnText() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<p>Hello <b>there</b> now!</p>");
        Element p = doc.select("p").first();
        assertEquals("Hello now!", p.ownText());
    }

    @Test
    public void testOwnTextWithBrChild() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<p>One<br>Two</p>");
        Element p = doc.select("p").first();
        assertEquals("One Two", p.ownText());
    }

    // ---------- hasText() ----------

    @Test
    public void testHasTextFalseWhenBlank() {
        Element el = new Element("div");
        el.appendText("   ");
        assertFalse(el.hasText());
    }

    @Test
    public void testHasTextTrueDirect() {
        Element el = new Element("div");
        el.appendText("hi");
        assertTrue(el.hasText());
    }

    @Test
    public void testHasTextTrueNestedRecursion() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<div><span>  </span><span>real</span></div>");
        Element div = doc.select("div").first();
        assertTrue(div.hasText());
    }

    @Test
    public void testHasTextFalseWhenEmptyNoChildren() {
        Element el = new Element("div");
        assertFalse(el.hasText());
    }

    // ---------- data() ----------

    @Test
    public void testDataFromScript() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<script>var a=1;</script>");
        Element script = doc.select("script").first();
        assertEquals("var a=1;", script.data());
    }

    @Test
    public void testDataFromComment() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<div><!-- comment --></div>");
        Element div = doc.select("div").first();
        assertTrue(div.data().contains("comment"));
    }

    @Test
    public void testDataRecursiveThroughElement() {
        org.jsoup.nodes.Document doc = Jsoup.parse("<div><script>x=1;</script></div>");
        Element div = doc.select("div").first();
        assertEquals("x=1;", div.data());
    }

    @Test
    public void testDataEmptyWhenNone() {
        Element el = new Element("div");
        assertEquals("", el.data());
    }

    // ---------- className / classNames ----------

    @Test
    public void testClassNameEmpty() {
        Element el = new Element("div");
        assertEquals("", el.className());
    }

    @Test
    public void testClassNameSet() {
        Element el = new Element("div");
        el.attr("class", " foo bar ");
        assertEquals("foo bar", el.className());
    }

    @Test
    public void testClassNamesEmptySet() {
        Element el = new Element("div");
        Set<String> names = el.classNames();
        assertTrue(names.isEmpty());
    }

    @Test
    public void testClassNamesMultiple() {
        Element el = new Element("div");
        el.attr("class", "foo bar");
        Set<String> names = el.classNames();
        assertEquals(2, names.size());
        assertTrue(names.contains("foo"));
        assertTrue(names.contains("bar"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testClassNamesSetNullThrows() {
        Element el = new Element("div");
        el.classNames(null);
    }

    @Test
    public void testClassNamesSetEmptyRemovesAttribute() {
        Element el = new Element("div");
        el.attr("class", "foo");
        el.classNames(new LinkedHashSet<String>());
        assertFalse(el.hasAttr("class"));
    }

    @Test
    public void testClassNamesSetNonEmptyJoins() {
        Element el = new Element("div");
        Set<String> names = new LinkedHashSet<>();
        names.add("foo");
        names.add("bar");
        el.classNames(names);
        assertEquals("foo bar", el.attr("class"));
    }

    // ---------- hasClass ----------

    @Test
    public void testHasClassLenZero() {
        Element el = new Element("div");
        assertFalse(el.hasClass("foo"));
    }

    @Test
    public void testHasClassLenLessThanWant() {
        Element el = new Element("div");
        el.attr("class", "ab");
        assertFalse(el.hasClass("abcdef"));
    }

    @Test
    public void testHasClassEqualLenCaseInsensitiveMatch() {
        Element el = new Element("div");
        el.attr("class", "ABC");
        assertTrue(el.hasClass("abc"));
    }

    @Test
    public void testHasClassEqualLenNoMatch() {
        Element el = new Element("div");
        el.attr("class", "abc");
        assertFalse(el.hasClass("xyz"));
    }

    @Test
    public void testHasClassScanMiddleAndLastToken() {
        Element el = new Element("div");
        el.attr("class", "foo bar baz");
        assertTrue(el.hasClass("bar"));  // middle token
        assertTrue(el.hasClass("baz"));  // last token (no trailing ws)
        assertFalse(el.hasClass("qux"));
    }

    @Test
    public void testHasClassFirstToken() {
        Element el = new Element("div");
        el.attr("class", "foo bar baz");
        assertTrue(el.hasClass("foo"));
    }

    // ---------- addClass / removeClass / toggleClass ----------

    @Test(expected = IllegalArgumentException.class)
    public void testAddClassNullThrows() {
        Element el = new Element("div");
        el.addClass(null);
    }

    @Test
    public void testAddClass() {
        Element el = new Element("div");
        el.addClass("foo");
        assertTrue(el.hasClass("foo"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveClassNullThrows() {
        Element el = new Element("div");
        el.removeClass(null);
    }

    @Test
    public void testRemoveClass() {
        Element el = new Element("div");
        el.attr("class", "foo bar");
        el.removeClass("foo");
        assertFalse(el.hasClass("foo"));
        assertTrue(el.hasClass("bar"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToggleClassNullThrows() {
        Element el = new Element("div");
        el.toggleClass(null);
    }

    @Test
    public void testToggleClassAddsWhenAbsent() {
        Element el = new Element("div");
        el.toggleClass("foo");
        assertTrue(el.hasClass("foo"));
    }

    @Test
    public void testToggleClassRemovesWhenPresent() {
        Element el = new Element("div");
        el.attr("class", "foo");
        el.toggleClass("foo");
        assertFalse(el.hasClass("foo"));
    }

    // ---------- val() ----------

    @Test
    public void testValInputReturnsValueAttr() {
        Element el = new Element("input");
        el.attr("value", "hello");
        assertEquals("hello", el.val());
    }

    @Test
    public void testValTextareaReturnsText() {
        Element el = new Element("textarea");
        el.appendText("content");
        assertEquals("content", el.val());
    }

    @Test
    public void testValSetInput() {
        Element el = new Element("input");
        el.val("hi");
        assertEquals("hi", el.attr("value"));
    }

    @Test
    public void testValSetTextarea() {
        Element el = new Element("textarea");
        el.val("hi");
        assertEquals("hi", el.text());
    }

    // ---------- html() / outerHtml-related ----------

    @Test
    public void testHtmlGet() {
        Element el = new Element("div");
        el.appendElement("p").text("hi");
        String html = el.html();
        assertTrue(html.contains("<p>hi</p>"));
    }

    @Test
    public void testHtmlSetClearsAndParses() {
        Element el = new Element("div");
        el.appendText("old");
        el.html("<p>new</p>");
        assertEquals(1, el.children().size());
        assertEquals("p", el.child(0).tagName());
    }

    @Test
    public void testOuterHtmlSelfClosingTag() {
        Element img = new Element("img");
        img.attr("src", "x.png");
        String out = img.outerHtml();
        assertTrue(out.contains("img"));
    }

    @Test
    public void testToStringEqualsOuterHtml() {
        Element el = new Element("div");
        el.appendText("hi");
        assertEquals(el.outerHtml(), el.toString());
    }

    // ---------- clone / shallowClone ----------

    @Test
    public void testCloneCopiesChildren() {
        Element el = new Element("div");
        el.appendElement("p").text("hi");
        Element clone = el.clone();
        assertEquals(1, clone.children().size());
        assertNotSame(el.child(0), clone.child(0));
    }

    @Test
    public void testShallowCloneNoChildren() {
        Element el = new Element("div");
        el.attr("id", "x");
        el.appendElement("p");
        Element shallow = el.shallowClone();
        assertEquals(0, shallow.childNodeSize());
        assertEquals("x", shallow.id());
    }
}
