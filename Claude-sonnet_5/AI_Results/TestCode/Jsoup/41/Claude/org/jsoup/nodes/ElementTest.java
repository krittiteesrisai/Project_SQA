package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class ElementTest {

    // ---------- Constructor / tagName / tag / isBlock ----------

    @Test(expected = IllegalArgumentException.class)
    public void constructor_nullTag_throws() {
        // Validate.notNull(tag) -> คาดว่า throw IllegalArgumentException (ตาม jsoup Validate ปกติ)
        new Element(null, "http://example.com");
    }

    @Test
    public void constructor_defaultAttributes() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertEquals("div", el.tagName());
        assertEquals("div", el.nodeName());
        assertNotNull(el.tag());
    }

    @Test
    public void tagName_setValid_changesTag() {
        Element el = new Element(Tag.valueOf("span"), "");
        Element same = el.tagName("div");
        assertSame(el, same);
        assertEquals("div", el.tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void tagName_empty_throws() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.tagName("");
    }

    @Test
    public void isBlock_trueForDiv_falseForSpan() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element span = new Element(Tag.valueOf("span"), "");
        assertTrue(div.isBlock());
        assertFalse(span.isBlock());
    }

    // ---------- id() / attr() ----------

    @Test
    public void id_presentAndAbsent() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertEquals("", el.id()); // attr("id") null -> ""
        el.attr("id", "main");
        assertEquals("main", el.id());
    }

    @Test
    public void attr_setReturnsThisElement_forChaining() {
        Element el = new Element(Tag.valueOf("div"), "");
        Element result = el.attr("data-x", "y");
        assertSame(el, result);
        assertEquals("y", el.attr("data-x"));
    }

    @Test
    public void dataset_reflectsDataAttributes() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("data-package", "jsoup");
        el.attr("class", "ignored");
        assertEquals("jsoup", el.dataset().get("package"));
        assertFalse(el.dataset().containsKey("class"));
    }

    // ---------- parent() / parents() ----------

    @Test
    public void parent_nullWhenStandalone() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertNull(el.parent());
    }

    @Test
    public void parents_emptyWhenNoParent() {
        Element el = new Element(Tag.valueOf("div"), "");
        Elements parents = el.parents();
        assertEquals(0, parents.size());
    }

    @Test
    public void parents_excludesRootDocument() {
        Document doc = Jsoup.parse("<html><body><div><p>x</p></div></body></html>");
        Element p = doc.select("p").first();
        Elements parents = p.parents();
        // div, body, html -- ไม่รวม #root(document)
        assertTrue(parents.size() >= 3);
        assertEquals("div", parents.get(0).tagName());
    }

    // ---------- child(int) / children() / textNodes() / dataNodes() ----------

    @Test
    public void child_validIndex() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element c1 = parent.appendElement("p");
        assertSame(c1, parent.child(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void child_outOfBounds_throws() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.child(0);
    }

    @Test
    public void children_filtersOnlyElements() {
        Document doc = Jsoup.parse("<div>text<p>a</p>more text<span>b</span></div>");
        Element div = doc.select("div").first();
        Elements children = div.children();
        assertEquals(2, children.size());
        assertEquals("p", children.get(0).tagName());
        assertEquals("span", children.get(1).tagName());
    }

    @Test
    public void children_emptyWhenNoChildren() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertEquals(0, el.children().size());
    }

    @Test
    public void textNodes_filtersOnlyTextNodes() {
        Document doc = Jsoup.parse("<div>hello<p>inner</p>world</div>");
        Element div = doc.select("div").first();
        assertEquals(2, div.textNodes().size());
    }

    @Test
    public void textNodes_emptyWhenNone() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertTrue(el.textNodes().isEmpty());
    }

    @Test
    public void dataNodes_filtersOnlyDataNodes() {
        Document doc = Jsoup.parse("<div><script>var a=1;</script></div>");
        Element div = doc.select("div").first();
        assertEquals(1, div.dataNodes().size());
    }

    @Test
    public void dataNodes_emptyWhenNone() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertTrue(el.dataNodes().isEmpty());
    }

    // ---------- select() ----------

    @Test
    public void select_findsMatchingElements() {
        Document doc = Jsoup.parse("<div><p class='a'>1</p><p>2</p></div>");
        Elements result = doc.select("p.a");
        assertEquals(1, result.size());
    }

    // ---------- appendChild / prependChild ----------

    @Test(expected = IllegalArgumentException.class)
    public void appendChild_null_throws() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.appendChild(null);
    }

    @Test
    public void appendChild_setsSiblingIndex() {
        Element parent = new Element(Tag.valueOf("div"), "");
        TextNode t1 = new TextNode("a", "");
        TextNode t2 = new TextNode("b", "");
        parent.appendChild(t1);
        parent.appendChild(t2);
        assertEquals(0, t1.siblingIndex());
        assertEquals(1, t2.siblingIndex());
    }

    @Test(expected = IllegalArgumentException.class)
    public void prependChild_null_throws() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.prependChild(null);
    }

    @Test
    public void prependChild_insertsAtStart() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element c1 = parent.appendElement("p");
        Element c2 = new Element(Tag.valueOf("span"), "");
        parent.prependChild(c2);
        assertSame(c2, parent.childNode(0));
        assertSame(c1, parent.childNode(1));
    }

    // ---------- insertChildren ----------

    @Test(expected = IllegalArgumentException.class)
    public void insertChildren_nullCollection_throws() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.insertChildren(0, null);
    }

    @Test
    public void insertChildren_negativeIndexRollsAround() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.appendElement("a");
        parent.appendElement("b");
        Element c = new Element(Tag.valueOf("c"), "");
        parent.insertChildren(-1, Arrays.asList((Node) c)); // -1 -> currentSize(2)+1-1=2 (append at end)
        assertEquals(3, parent.childNodeSize());
        assertSame(c, parent.childNode(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertChildren_outOfBounds_throws() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.appendElement("a");
        Element c = new Element(Tag.valueOf("c"), "");
        parent.insertChildren(5, Arrays.asList((Node) c)); // currentSize=1, 5>1 -> invalid
    }

    @Test
    public void insertChildren_validIndex() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.appendElement("a");
        parent.appendElement("b");
        Element c = new Element(Tag.valueOf("c"), "");
        parent.insertChildren(1, Arrays.asList((Node) c));
        assertEquals("c", ((Element) parent.childNode(1)).tagName());
    }

    // ---------- appendElement / prependElement / appendText / prependText ----------

    @Test
    public void appendElement_addsAsLastChild() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = parent.appendElement("p");
        assertEquals("p", child.tagName());
        assertSame(child, parent.child(0));
    }

    @Test
    public void prependElement_addsAsFirstChild() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.appendElement("a");
        Element child = parent.prependElement("b");
        assertEquals("b", child.tagName());
        assertSame(child, parent.child(0));
    }

    @Test
    public void appendText_addsTextNodeAtEnd() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element result = parent.appendText("hello");
        assertSame(parent, result);
        assertEquals("hello", parent.text());
    }

    @Test
    public void prependText_addsTextNodeAtStart() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.appendText("world");
        parent.prependText("hello ");
        assertEquals("hello world", parent.text());
    }

    // ---------- append(html) / prepend(html) ----------

    @Test(expected = IllegalArgumentException.class)
    public void appendHtml_null_throws() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.append(null);
    }

    @Test
    public void appendHtml_addsParsedNodes() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.append("<p>x</p>");
        assertEquals(1, el.children().size());
        assertEquals("p", el.children().get(0).tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void prependHtml_null_throws() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.prepend(null);
    }

    @Test
    public void prependHtml_addsAtStart() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.append("<p>second</p>");
        el.prepend("<span>first</span>");
        assertEquals("span", el.children().get(0).tagName());
        assertEquals("p", el.children().get(1).tagName());
    }

    // ---------- before / after (String / Node) ----------

    @Test
    public void beforeAfter_html_insertsSiblings() {
        Document doc = Jsoup.parse("<div><p>mid</p></div>");
        Element p = doc.select("p").first();
        p.before("<span>before</span>");
        p.after("<span>after</span>");
        Elements children = p.parent().children();
        assertEquals(3, children.size());
        assertEquals("before", children.get(0).text());
        assertEquals("mid", children.get(1).text());
        assertEquals("after", children.get(2).text());
    }

    @Test
    public void beforeAfter_node_insertsSiblings() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element middle = div.appendElement("p");
        Element beforeNode = new Element(Tag.valueOf("span"), "");
        Element afterNode = new Element(Tag.valueOf("span"), "");
        middle.before(beforeNode);
        middle.after(afterNode);
        assertEquals(3, div.children().size());
        assertSame(beforeNode, div.children().get(0));
        assertSame(middle, div.children().get(1));
        assertSame(afterNode, div.children().get(2));
    }

    // ---------- empty() ----------

    @Test
    public void empty_clearsChildren_keepsAttributes() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("id", "keep");
        el.appendElement("p");
        Element result = el.empty();
        assertSame(el, result);
        assertEquals(0, el.childNodeSize());
        assertEquals("keep", el.attr("id"));
    }

    // ---------- wrap ----------

    @Test
    public void wrap_wrapsElementWithHtml() {
        Document doc = Jsoup.parse("<div><p>hi</p></div>");
        Element p = doc.select("p").first();
        p.wrap("<section></section>");
        assertEquals("section", p.parent().tagName());
    }

    // ---------- cssSelector ----------

    @Test
    public void cssSelector_withId() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("id", "foo");
        assertEquals("#foo", el.cssSelector());
    }

    @Test
    public void cssSelector_noParent_noClass() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertEquals("div", el.cssSelector());
    }

    @Test
    public void cssSelector_parentIsDocument_noPrefix() {
        Document doc = Jsoup.parse("<html><head></head><body></body></html>");
        Element html = doc.child(0); // <html>, parent() is Document
        assertEquals("html", html.cssSelector());
    }

    @Test
    public void cssSelector_withClassAndNormalParent() {
        Document doc = Jsoup.parse("<div><p class='a'>hi</p><span>world</span></div>");
        Element p = doc.select("p").first();
        String sel = p.cssSelector();
        assertTrue(sel.endsWith("p.a"));
    }

    @Test
    public void cssSelector_duplicateSiblings_addsNthChild() {
        Document doc = Jsoup.parse("<div><p>one</p><p>two</p></div>");
        Element firstP = doc.select("p").first();
        String sel = firstP.cssSelector();
        assertTrue(sel.contains(":nth-child(1)"));
    }

    // ---------- siblingElements ----------

    @Test
    public void siblingElements_noParent_empty() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertEquals(0, el.siblingElements().size());
    }

    @Test
    public void siblingElements_withParent_excludesSelf() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p><p id='b'>2</p></div>");
        Element first = doc.select("#a").first();
        Elements siblings = first.siblingElements();
        assertEquals(1, siblings.size());
        assertEquals("b", siblings.get(0).id());
    }

    // ---------- nextElementSibling / previousElementSibling ----------

    @Test
    public void nextElementSibling_noParent_null() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertNull(el.nextElementSibling());
    }

    @Test
    public void nextElementSibling_hasNext() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p><p id='b'>2</p></div>");
        Element first = doc.select("#a").first();
        Element next = first.nextElementSibling();
        assertNotNull(next);
        assertEquals("b", next.id());
    }

    @Test
    public void nextElementSibling_noNext_returnsNull() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p></div>");
        Element only = doc.select("#a").first();
        assertNull(only.nextElementSibling());
    }

    @Test
    public void previousElementSibling_noParent_null() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertNull(el.previousElementSibling());
    }

    @Test
    public void previousElementSibling_hasPrev() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p><p id='b'>2</p></div>");
        Element second = doc.select("#b").first();
        Element prev = second.previousElementSibling();
        assertNotNull(prev);
        assertEquals("a", prev.id());
    }

    @Test
    public void previousElementSibling_noPrev_returnsNull() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p></div>");
        Element only = doc.select("#a").first();
        assertNull(only.previousElementSibling());
    }

    // ---------- firstElementSibling / lastElementSibling ----------
    // NOTE: ไม่มี null-check สำหรับ parent() ใน source ของสองเมธอดนี้ -> คาด NPE (เป็นจุดที่ควรดักจับ)

    @Test(expected = NullPointerException.class)
    public void firstElementSibling_noParent_npe() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.firstElementSibling();
    }

    @Test
    public void firstElementSibling_singleChild_null() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p></div>");
        Element only = doc.select("#a").first();
        assertNull(only.firstElementSibling());
    }

    @Test
    public void firstElementSibling_multipleChildren_returnsFirst() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p><p id='b'>2</p></div>");
        Element second = doc.select("#b").first();
        Element first = second.firstElementSibling();
        assertNotNull(first);
        assertEquals("a", first.id());
    }

    @Test(expected = NullPointerException.class)
    public void lastElementSibling_noParent_npe() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.lastElementSibling();
    }

    @Test
    public void lastElementSibling_singleChild_null() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p></div>");
        Element only = doc.select("#a").first();
        assertNull(only.lastElementSibling());
    }

    @Test
    public void lastElementSibling_multipleChildren_returnsLast() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p><p id='b'>2</p></div>");
        Element first = doc.select("#a").first();
        Element last = first.lastElementSibling();
        assertNotNull(last);
        assertEquals("b", last.id());
    }

    // ---------- elementSiblingIndex ----------

    @Test
    public void elementSiblingIndex_noParent_zero() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertEquals(Integer.valueOf(0), el.elementSiblingIndex());
    }

    @Test
    public void elementSiblingIndex_withParent() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p><p id='b'>2</p></div>");
        Element second = doc.select("#b").first();
        assertEquals(Integer.valueOf(1), second.elementSiblingIndex());
    }

    // ---------- getElementsByXxx / getElementById ----------

    @Test(expected = IllegalArgumentException.class)
    public void getElementsByTag_empty_throws() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.getElementsByTag("");
    }

    @Test
    public void getElementsByTag_found() {
        Document doc = Jsoup.parse("<div><P>x</P></div>");
        assertEquals(1, doc.getElementsByTag("p").size()); // lower-cased internally
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementById_empty_throws() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.getElementById("");
    }

    @Test
    public void getElementById_foundAndNotFound() {
        Document doc = Jsoup.parse("<div id='x'>1</div>");
        assertNotNull(doc.getElementById("x"));
        assertNull(doc.getElementById("nope"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsByClass_empty_throws() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.getElementsByClass("");
    }

    @Test
    public void getElementsByClass_found() {
        Document doc = Jsoup.parse("<div class='header'>1</div>");
        assertEquals(1, doc.getElementsByClass("header").size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsByAttribute_empty_throws() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.getElementsByAttribute("");
    }

    @Test
    public void getElementsByAttribute_found() {
        Document doc = Jsoup.parse("<a href='x'>link</a>");
        assertEquals(1, doc.getElementsByAttribute("href").size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsByAttributeStarting_empty_throws() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.getElementsByAttributeStarting("");
    }

    @Test
    public void getElementsByAttributeStarting_found() {
        Document doc = Jsoup.parse("<div data-foo='1'>x</div>");
        assertEquals(1, doc.getElementsByAttributeStarting("data-").size());
    }

    @Test
    public void getElementsByAttributeValue_found() {
        Document doc = Jsoup.parse("<a href='x'>link</a>");
        assertEquals(1, doc.getElementsByAttributeValue("href", "x").size());
    }

    @Test
    public void getElementsByAttributeValueNot_found() {
        Document doc = Jsoup.parse("<a href='x'>link</a><a href='y'>link2</a>");
        assertEquals(1, doc.getElementsByAttributeValueNot("href", "x").size());
    }

    @Test
    public void getElementsByAttributeValueStarting_found() {
        Document doc = Jsoup.parse("<a href='http://x'>link</a>");
        assertEquals(1, doc.getElementsByAttributeValueStarting("href", "http").size());
    }

    @Test
    public void getElementsByAttributeValueEnding_found() {
        Document doc = Jsoup.parse("<a href='file.png'>link</a>");
        assertEquals(1, doc.getElementsByAttributeValueEnding("href", ".png").size());
    }

    @Test
    public void getElementsByAttributeValueContaining_found() {
        Document doc = Jsoup.parse("<a href='http://example.com'>link</a>");
        assertEquals(1, doc.getElementsByAttributeValueContaining("href", "example").size());
    }

    @Test
    public void getElementsByAttributeValueMatching_pattern_found() {
        Document doc = Jsoup.parse("<a href='http://example.com'>link</a>");
        Elements result = doc.getElementsByAttributeValueMatching("href", Pattern.compile("^http.*"));
        assertEquals(1, result.size());
    }

    @Test
    public void getElementsByAttributeValueMatching_validRegexString() {
        Document doc = Jsoup.parse("<a href='http://example.com'>link</a>");
        Elements result = doc.getElementsByAttributeValueMatching("href", "^http.*");
        assertEquals(1, result.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsByAttributeValueMatching_invalidRegexString_throws() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.getElementsByAttributeValueMatching("href", "[");
    }

    @Test
    public void getElementsByIndexLessThan_found() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p><p>3</p></div>");
        assertEquals(2, doc.select("div").first().getElementsByIndexLessThan(2).size());
    }

    @Test
    public void getElementsByIndexGreaterThan_found() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p><p>3</p></div>");
        assertEquals(1, doc.select("div").first().getElementsByIndexGreaterThan(1).size());
    }

    @Test
    public void getElementsByIndexEquals_found() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        assertEquals(1, doc.select("div").first().getElementsByIndexEquals(0).size());
    }

    @Test
    public void getElementsContainingText_found() {
        Document doc = Jsoup.parse("<div><p>Hello World</p></div>");
        assertEquals(1, doc.getElementsContainingText("hello").size()); // case-insensitive
    }

    @Test
    public void getElementsContainingOwnText_found() {
        Document doc = Jsoup.parse("<div>Hello<p>World</p></div>");
        assertEquals(1, doc.getElementsContainingOwnText("hello").size());
    }

    @Test
    public void getElementsMatchingText_pattern_found() {
        Document doc = Jsoup.parse("<div><p>Hello 123</p></div>");
        assertEquals(1, doc.getElementsMatchingText(Pattern.compile("\\d+")).size());
    }

    @Test
    public void getElementsMatchingText_validRegexString() {
        Document doc = Jsoup.parse("<div><p>Hello 123</p></div>");
        assertEquals(1, doc.getElementsMatchingText("\\d+").size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsMatchingText_invalidRegexString_throws() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.getElementsMatchingText("[");
    }

    @Test
    public void getElementsMatchingOwnText_pattern_found() {
        Document doc = Jsoup.parse("<div>123<p>abc</p></div>");
        assertEquals(1, doc.getElementsMatchingOwnText(Pattern.compile("\\d+")).size());
    }

    @Test
    public void getElementsMatchingOwnText_validRegexString() {
        Document doc = Jsoup.parse("<div>123<p>abc</p></div>");
        assertEquals(1, doc.getElementsMatchingOwnText("\\d+").size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsMatchingOwnText_invalidRegexString_throws() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.getElementsMatchingOwnText("[");
    }

    @Test
    public void getAllElements_includesSelfAndDescendants() {
        Document doc = Jsoup.parse("<div><p><span>x</span></p></div>");
        Element div = doc.select("div").first();
        Elements all = div.getAllElements();
        assertEquals(3, all.size()); // div, p, span
    }

    // ---------- text() / ownText() / hasText() / data() ----------

    @Test
    public void text_combinesChildTextWithBlockSpacing() {
        Element p = Jsoup.parse("<p>Hello<div>World</div></p>").select("p").first();
        assertEquals("Hello World", p.text());
    }

    @Test
    public void text_brInsertsSpace() {
        Element p = Jsoup.parse("<p>Hello<br>World</p>").select("p").first();
        assertEquals("Hello World", p.text());
    }

    @Test
    public void ownText_excludesNestedElementText() {
        Element p = Jsoup.parse("<p>Hello <b>there</b> now!</p>").select("p").first();
        assertEquals("Hello now!", p.ownText());
    }

    @Test
    public void hasText_falseWhenOnlyWhitespace() {
        Element p = Jsoup.parse("<p>   </p>").select("p").first();
        assertFalse(p.hasText());
    }

    @Test
    public void hasText_trueWhenDirectText() {
        Element p = Jsoup.parse("<p>Hi</p>").select("p").first();
        assertTrue(p.hasText());
    }

    @Test
    public void hasText_trueWhenNestedElementHasText() {
        Element div = Jsoup.parse("<div><span>Hi</span></div>").select("div").first();
        assertTrue(div.hasText());
    }

    @Test
    public void hasText_falseWhenNestedElementAlsoBlank() {
        Element div = Jsoup.parse("<div><span>   </span></div>").select("div").first();
        assertFalse(div.hasText());
    }

    @Test
    public void data_combinesDataNodesAndNestedElements() {
        Document doc = Jsoup.parse("<div><script>var a=1;</script><p><script>var b=2;</script></p></div>");
        Element div = doc.select("div").first();
        String data = div.data();
        assertTrue(data.contains("var a=1;"));
        assertTrue(data.contains("var b=2;"));
    }

    // ---------- className / classNames / hasClass / addClass / removeClass / toggleClass ----------

    @Test
    public void className_emptyWhenNoAttribute() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertEquals("", el.className());
    }

    @Test
    public void className_presentValue() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("class", "a b c");
        assertEquals("a b c", el.className());
    }

    @Test
    public void classNames_emptySetWhenNoClass() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertTrue(el.classNames().isEmpty());
    }

    @Test
    public void classNames_multipleClasses() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("class", "a b c");
        Set<String> names = el.classNames();
        assertEquals(3, names.size());
        assertTrue(names.containsAll(Arrays.asList("a", "b", "c")));
    }

    @Test(expected = IllegalArgumentException.class)
    public void classNamesSetter_null_throws() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.classNames(null);
    }

    @Test
    public void classNamesSetter_setsClassAttribute() {
        Element el = new Element(Tag.valueOf("div"), "");
        Set<String> names = new LinkedHashSet<String>(Arrays.asList("x", "y"));
        el.classNames(names);
        assertEquals("x y", el.className());
    }

    @Test
    public void hasClass_caseInsensitiveTrueFalse() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("class", "Header");
        assertTrue(el.hasClass("header"));
        assertFalse(el.hasClass("footer"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void addClass_null_throws() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.addClass(null);
    }

    @Test
    public void addClass_addsNewClass() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.addClass("new");
        assertTrue(el.hasClass("new"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void removeClass_null_throws() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.removeClass(null);
    }

    @Test
    public void removeClass_removesExistingClass() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.addClass("temp");
        el.removeClass("temp");
        assertFalse(el.hasClass("temp"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void toggleClass_null_throws() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.toggleClass(null);
    }

    @Test
    public void toggleClass_addsWhenAbsent_removesWhenPresent() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.toggleClass("t"); // absent -> add
        assertTrue(el.hasClass("t"));
        el.toggleClass("t"); // present -> remove
        assertFalse(el.hasClass("t"));
    }

    // ---------- val() / val(String) ----------

    @Test
    public void val_textareaUsesText() {
        Element textarea = new Element(Tag.valueOf("textarea"), "");
        textarea.text("hello");
        assertEquals("hello", textarea.val());
    }

    @Test
    public void val_otherUsesValueAttribute() {
        Element input = new Element(Tag.valueOf("input"), "");
        input.attr("value", "abc");
        assertEquals("abc", input.val());
    }

    @Test
    public void valSetter_textareaSetsText() {
        Element textarea = new Element(Tag.valueOf("textarea"), "");
        textarea.val("content");
        assertEquals("content", textarea.text());
    }

    @Test
    public void valSetter_otherSetsValueAttribute() {
        Element input = new Element(Tag.valueOf("input"), "");
        input.val("xyz");
        assertEquals("xyz", input.attr("value"));
    }

    // ---------- html() / html(String) / toString() ----------

    @Test
    public void htmlGetter_returnsInnerHtml() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.append("<p>Hi</p>");
        assertTrue(div.html().contains("Hi"));
    }

    @Test
    public void htmlSetter_clearsAndReplacesContent() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendElement("span");
        Element result = div.html("<p>New</p>");
        assertSame(div, result);
        assertEquals(1, div.children().size());
        assertEquals("p", div.children().get(0).tagName());
    }

    @Test
    public void toString_equalsOuterHtml() {
        Element div = new Element(Tag.valueOf("div"), "");
        assertEquals(div.outerHtml(), div.toString());
    }

    // ---------- equals / hashCode / clone ----------

    @Test
    public void equals_sameInstance_true() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertTrue(el.equals(el));
    }

    @Test
    public void equals_null_false() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertFalse(el.equals(null));
    }

    @Test
    public void equals_differentClass_false() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertFalse(el.equals("not an element"));
    }

    @Test
    public void equals_differentInstanceSameContent_false() {
        // ตาม source: หลัง super.equals(o) เช็คผ่าน ยังคืนค่า (this == o) เท่านั้น
        // -> สอง instance ที่ "เหมือนกัน" แต่ต่าง reference จะไม่ equal
        Element a = new Element(Tag.valueOf("div"), "");
        Element b = new Element(Tag.valueOf("div"), "");
        assertFalse(a.equals(b));
    }

    @Test
    public void hashCode_consistentAcrossCalls() {
        Element el = new Element(Tag.valueOf("div"), "");
        int h1 = el.hashCode();
        int h2 = el.hashCode();
        assertEquals(h1, h2);
    }

    @Test
    public void clone_producesNewInstance_notEqualDueToIdentityEquals() {
        Element original = new Element(Tag.valueOf("div"), "");
        original.attr("id", "x");
        Element cloned = original.clone();
        assertNotSame(original, cloned);
        assertEquals(original.attr("id"), cloned.attr("id"));
        // ตาม behavior จริงของ equals() ใน source (identity-based)
        assertFalse(original.equals(cloned));
    }
}
