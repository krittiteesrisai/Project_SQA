package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * JUnit 4 test suite for org.jsoup.nodes.Element (Defects4J: Jsoup-3b)
 *
 * หมายเหตุ: วางคลาสทดสอบไว้ใน package เดียวกับ Element (org.jsoup.nodes)
 * เพื่อให้สามารถใช้ constructor/คลาสช่วยที่จำเป็น (Tag, Attributes, TextNode, DataNode)
 * ซึ่งเป็นส่วนหนึ่งของซอร์สเดียวกันที่ Element ต้องพึ่งพาอยู่แล้ว
 */
public class ElementTest {

    // ---------- Constructor ----------

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullTagThrows() {
        // Validate.notNull(tag) -> IllegalArgumentException
        new Element(null, "http://example.com/");
    }

    @Test
    public void testConstructorWithoutAttributes() {
        Element e = new Element(Tag.valueOf("div"), "http://example.com/");
        assertEquals("div", e.tagName());
        assertNotNull(e.attributes());
    }

    // ---------- tagName / tag / nodeName / isBlock ----------

    @Test
    public void testTagNameAndTagAndNodeName() {
        Element div = new Element(Tag.valueOf("div"), "");
        assertEquals("div", div.tagName());
        assertEquals("div", div.nodeName());
        assertNotNull(div.tag());
        assertEquals("div", div.tag().getName());
    }

    @Test
    public void testIsBlockTrueForDiv() {
        Element div = new Element(Tag.valueOf("div"), "");
        assertTrue(div.isBlock());
    }

    @Test
    public void testIsBlockFalseForSpan() {
        Element span = new Element(Tag.valueOf("span"), "");
        assertFalse(span.isBlock());
    }

    // ---------- id() ----------

    @Test
    public void testIdEmptyWhenNotSet() {
        Element e = new Element(Tag.valueOf("div"), "");
        assertEquals("", e.id());
    }

    @Test
    public void testIdWhenSet() {
        Element e = new Element(Tag.valueOf("div"), "");
        e.attr("id", "myid");
        assertEquals("myid", e.id());
    }

    // ---------- attr(key,value) chaining ----------

    @Test
    public void testAttrChainingReturnsSameElement() {
        Element e = new Element(Tag.valueOf("div"), "");
        Element returned = e.attr("data-x", "1");
        assertSame(e, returned);
        assertEquals("1", e.attr("data-x"));
    }

    // ---------- parent() / parents() ----------

    @Test
    public void testParentReturnsElementType() {
        Document doc = Jsoup.parse("<html><body><div><p>text</p></div></body></html>");
        Element p = doc.select("p").first();
        Element div = p.parent();
        assertEquals("div", div.tagName());
    }

    @Test
    public void testParentsExcludesRoot() {
        Document doc = Jsoup.parse("<html><body><div><p>text</p></div></body></html>");
        Element p = doc.select("p").first();
        Elements parents = p.parents();
        // div, body, html -- #root (Document) ต้องไม่ถูกรวม
        assertEquals(3, parents.size());
        assertEquals("div", parents.get(0).tagName());
        assertEquals("body", parents.get(1).tagName());
        assertEquals("html", parents.get(2).tagName());
    }

    @Test
    public void testParentsStandaloneElementEmpty() {
        Element e = new Element(Tag.valueOf("div"), "");
        Elements parents = e.parents();
        assertEquals(0, parents.size());
    }

    // ---------- child(index) / children() ----------

    @Test
    public void testChildrenFiltersOnlyElements() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendText("plain text");
        div.appendElement("p");
        Elements children = div.children();
        assertEquals(1, children.size());
        assertEquals("p", children.get(0).tagName());
    }

    @Test
    public void testChildReturnsCorrectIndex() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendElement("p").text("1");
        div.appendElement("p").text("2");
        assertEquals("1", div.child(0).text());
        assertEquals("2", div.child(1).text());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildOutOfBoundsThrows() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.child(0); // no children
    }

    @Test
    public void testChildrenEmptyWhenNoChildren() {
        Element div = new Element(Tag.valueOf("div"), "");
        assertEquals(0, div.children().size());
    }

    // ---------- select() ----------

    @Test
    public void testSelectBasicQuery() {
        Document doc = Jsoup.parse("<div><p class='a'>1</p><p>2</p></div>");
        Element div = doc.select("div").first();
        Elements ps = div.select("p.a");
        assertEquals(1, ps.size());
        assertEquals("1", ps.first().text());
    }

    // ---------- appendChild / prependChild ----------

    @Test(expected = IllegalArgumentException.class)
    public void testAppendChildNullThrows() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendChild(null);
    }

    @Test
    public void testAppendChildOrder() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendChild(new TextNode("a", ""));
        div.appendChild(new TextNode("b", ""));
        assertEquals(2, div.childNodes().size());
        assertEquals("a", ((TextNode) div.childNodes().get(0)).text());
        assertEquals("b", ((TextNode) div.childNodes().get(1)).text());
    }

    @Test
    public void testPrependChildOrder() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendChild(new TextNode("b", ""));
        div.prependChild(new TextNode("a", ""));
        assertEquals("a", ((TextNode) div.childNodes().get(0)).text());
        assertEquals("b", ((TextNode) div.childNodes().get(1)).text());
    }

    // ---------- appendElement / prependElement ----------

    @Test
    public void testAppendElement() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element child = div.appendElement("span");
        assertEquals("span", child.tagName());
        assertEquals(1, div.children().size());
        assertSame(child.parent(), div);
    }

    @Test
    public void testPrependElement() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendElement("p1");
        Element first = div.prependElement("p0");
        assertEquals("p0", div.child(0).tagName());
        assertSame(first, div.child(0));
    }

    // ---------- appendText / prependText ----------

    @Test
    public void testAppendText() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendText("hello");
        assertEquals("hello", div.text());
    }

    @Test
    public void testPrependText() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendText("world");
        div.prependText("hello ");
        assertEquals("hello world", div.text());
    }

    // ---------- append(html) / prepend(html) ----------

    @Test(expected = IllegalArgumentException.class)
    public void testAppendNullHtmlThrows() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.append(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrependNullHtmlThrows() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.prepend(null);
    }

    @Test
    public void testAppendHtmlMultipleNodesOrder() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.append("<p>1</p><p>2</p>");
        assertEquals(2, div.children().size());
        assertEquals("1", div.children().get(0).text());
        assertEquals("2", div.children().get(1).text());
    }

    @Test
    public void testPrependHtmlMultipleNodesOrderPreserved() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.append("<p>2</p>");
        div.prepend("<p>0</p><p>1</p>");
        assertEquals(3, div.children().size());
        assertEquals("0", div.children().get(0).text());
        assertEquals("1", div.children().get(1).text());
        assertEquals("2", div.children().get(2).text());
    }

    // ---------- empty() ----------

    @Test
    public void testEmptyClearsChildren() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendElement("p");
        div.appendText("text");
        div.empty();
        assertEquals(0, div.childNodes().size());
    }

    // ---------- wrap() ----------

    @Test(expected = IllegalArgumentException.class)
    public void testWrapEmptyHtmlThrows() {
        Element p = new Element(Tag.valueOf("p"), "");
        p.wrap("");
    }

    @Test
    public void testWrapNoElementReturnsNull() {
        // wrap html ไม่มี element เลย -> wrapChildren ว่าง -> wrap == null -> return null
        Element p = new Element(Tag.valueOf("p"), "");
        Element result = p.wrap("just plain text, no tag");
        assertNull(result);
    }

    @Test
    public void testWrapNormalCase() {
        Document doc = Jsoup.parse("<body><p>Hello</p></body>");
        Element body = doc.body();
        Element p = body.child(0);

        Element result = p.wrap("<div class=\"wrap\"></div>");

        assertSame(p, result);
        Element div = body.child(0);
        assertEquals("div", div.tagName());
        assertEquals("wrap", div.className());
        assertEquals(1, div.children().size());
        assertSame(p, div.children().get(0));
        assertEquals("Hello", p.text());
    }

    @Test
    public void testWrapWithRemainder() {
        Document doc = Jsoup.parse("<body><p>Hello</p></body>");
        Element body = doc.body();
        Element p = body.child(0);

        p.wrap("<div></div><span></span>");

        assertEquals(1, body.children().size());
        Element div = body.child(0);
        assertEquals("div", div.tagName());
        assertEquals(2, div.children().size());
        assertSame(p, div.children().get(0));
        assertEquals("span", div.children().get(1).tagName());
    }

    // ---------- siblingElements ----------

    @Test
    public void testSiblingElements() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p><p>3</p></div>");
        Element middle = doc.select("p").get(1);
        Elements siblings = middle.siblingElements();
        assertEquals(3, siblings.size());
    }

    // ---------- nextElementSibling ----------

    @Test
    public void testNextElementSiblingHasNext() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Element first = doc.select("p").get(0);
        Element next = first.nextElementSibling();
        assertNotNull(next);
        assertEquals("2", next.text());
    }

    @Test
    public void testNextElementSiblingNoNextReturnsNull() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Element last = doc.select("p").get(1);
        assertNull(last.nextElementSibling());
    }

    // ---------- previousElementSibling ----------

    @Test
    public void testPreviousElementSiblingHasPrev() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Element second = doc.select("p").get(1);
        Element prev = second.previousElementSibling();
        assertNotNull(prev);
        assertEquals("1", prev.text());
    }

    @Test
    public void testPreviousElementSiblingNoPrevReturnsNull() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Element first = doc.select("p").get(0);
        assertNull(first.previousElementSibling());
    }

    // ---------- firstElementSibling / lastElementSibling ----------
    // NOTE (potential fault per Javadoc contract):
    // Javadoc: "the first sibling that is an element (aka the parent's first element child)"
    // แต่ซอร์สใช้เงื่อนไข siblings.size() > 1 ? ... : null
    // ซึ่งหมายความว่าถ้ามีลูกเพียงตัวเดียว (size==1) จะคืน null แทนที่จะคืนตัวเอง
    // เทสนี้อ้างอิงตาม Javadoc contract และอาจ "fail" บนโค้ดที่มี fault นี้ -- นั่นคือจุดประสงค์
    @Test
    public void testFirstElementSiblingMultipleChildren() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Element first = doc.select("p").get(0);
        Element result = first.firstElementSibling();
        assertNotNull(result);
        assertEquals("1", result.text());
    }

    @Test
    public void testFirstElementSiblingSingleChild_PerJavadocContract() {
        Document doc = Jsoup.parse("<div><p>only</p></div>");
        Element only = doc.select("p").get(0);
        Element result = only.firstElementSibling();
        // ตาม Javadoc ควรคืนตัวเอง (ลูกคนเดียวของ parent) ไม่ใช่ null
        assertNotNull("ตาม Javadoc ควรคืนค่า element ตัวเอง ไม่ใช่ null เมื่อมีลูกเพียงตัวเดียว", result);
    }

    @Test
    public void testLastElementSiblingMultipleChildren() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Element first = doc.select("p").get(0);
        Element result = first.lastElementSibling();
        assertNotNull(result);
        assertEquals("2", result.text());
    }

    @Test
    public void testLastElementSiblingSingleChild_PerJavadocContract() {
        Document doc = Jsoup.parse("<div><p>only</p></div>");
        Element only = doc.select("p").get(0);
        Element result = only.lastElementSibling();
        // เช่นเดียวกับ firstElementSibling, ตาม Javadoc ควรคืนตัวเองไม่ใช่ null
        assertNotNull("ตาม Javadoc ควรคืนค่า element ตัวเอง ไม่ใช่ null เมื่อมีลูกเพียงตัวเดียว", result);
    }

    // ---------- elementSiblingIndex ----------

    @Test
    public void testElementSiblingIndexNoParentReturnsZero() {
        Element e = new Element(Tag.valueOf("div"), "");
        assertEquals(Integer.valueOf(0), e.elementSiblingIndex());
    }

    @Test
    public void testElementSiblingIndexWithParent() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p><p>3</p></div>");
        Element second = doc.select("p").get(1);
        assertEquals(Integer.valueOf(1), second.elementSiblingIndex());
    }

    // ---------- getElementsByTag / getElementById ----------

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByTagEmptyThrows() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.getElementsByTag("");
    }

    @Test
    public void testGetElementsByTagFindsAll() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        Element div = doc.select("div").first();
        Elements ps = div.getElementsByTag("P"); // case-insensitive
        assertEquals(2, ps.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementByIdEmptyThrows() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.getElementById("");
    }

    @Test
    public void testGetElementByIdFound() {
        Document doc = Jsoup.parse("<div><p id='pid'>text</p></div>");
        Element div = doc.select("div").first();
        Element found = div.getElementById("pid");
        assertNotNull(found);
        assertEquals("text", found.text());
    }

    @Test
    public void testGetElementByIdNotFoundReturnsNull() {
        Document doc = Jsoup.parse("<div><p id='pid'>text</p></div>");
        Element div = doc.select("div").first();
        assertNull(div.getElementById("nope"));
    }

    // ---------- getElementsByClass / getElementsByAttribute* (one-line delegates) ----------

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByClassEmptyThrows() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.getElementsByClass("");
    }

    @Test
    public void testGetElementsByClassFinds() {
        Document doc = Jsoup.parse("<div><p class='a'>1</p><p>2</p></div>");
        Element div = doc.select("div").first();
        Elements found = div.getElementsByClass("a");
        assertEquals(1, found.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeEmptyThrows() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.getElementsByAttribute("");
    }

    @Test
    public void testGetElementsByAttributeFinds() {
        Document doc = Jsoup.parse("<div><a href='x'>link</a><p>no</p></div>");
        Element div = doc.select("div").first();
        Elements found = div.getElementsByAttribute("href");
        assertEquals(1, found.size());
    }

    @Test
    public void testGetElementsByAttributeValue() {
        Document doc = Jsoup.parse("<div><p id='pid'>1</p><p>2</p></div>");
        Element div = doc.select("div").first();
        Elements found = div.getElementsByAttributeValue("id", "pid");
        assertEquals(1, found.size());
    }

    @Test
    public void testGetElementsByAttributeValueNot() {
        Document doc = Jsoup.parse("<div id='root'><p id='pid'>1</p><p>2</p></div>");
        Element div = doc.select("div").first();
        Elements found = div.getElementsByAttributeValueNot("id", "pid");
        // div (id=root) และ p ตัวที่สอง (ไม่มี id) ต้องถูกรวม, p#pid ต้องไม่ถูกรวม
        boolean containsPid = false;
        for (Element e : found) {
            if ("pid".equals(e.id())) containsPid = true;
        }
        assertFalse(containsPid);
        assertTrue(found.size() >= 1);
    }

    @Test
    public void testGetElementsByAttributeValueStarting() {
        Document doc = Jsoup.parse("<div><a href='http://a.com'>1</a><a href='ftp://b.com'>2</a></div>");
        Element div = doc.select("div").first();
        Elements found = div.getElementsByAttributeValueStarting("href", "http");
        assertEquals(1, found.size());
    }

    @Test
    public void testGetElementsByAttributeValueEnding() {
        Document doc = Jsoup.parse("<div><a href='http://a.com'>1</a><a href='http://a.org'>2</a></div>");
        Element div = doc.select("div").first();
        Elements found = div.getElementsByAttributeValueEnding("href", ".com");
        assertEquals(1, found.size());
    }

    @Test
    public void testGetElementsByAttributeValueContaining() {
        Document doc = Jsoup.parse("<div><a href='http://a.com/foo'>1</a><a href='http://a.com/bar'>2</a></div>");
        Element div = doc.select("div").first();
        Elements found = div.getElementsByAttributeValueContaining("href", "foo");
        assertEquals(1, found.size());
    }

    @Test
    public void testGetElementsByIndexLessThan() {
        Document doc = Jsoup.parse("<div><p>0</p><p>1</p><p>2</p></div>");
        Element div = doc.select("div").first();
        Elements found = div.getElementsByIndexLessThan(2);
        assertTrue(found.size() >= 2);
    }

    @Test
    public void testGetElementsByIndexGreaterThan() {
        Document doc = Jsoup.parse("<div><p>0</p><p>1</p><p>2</p></div>");
        Element div = doc.select("div").first();
        Elements found = div.getElementsByIndexGreaterThan(0);
        assertTrue(found.size() >= 1);
    }

    @Test
    public void testGetElementsByIndexEquals() {
        Document doc = Jsoup.parse("<div><p>0</p><p>1</p><p>2</p></div>");
        Element div = doc.select("div").first();
        Elements found = div.getElementsByIndexEquals(1);
        assertEquals(1, found.size());
    }

    @Test
    public void testGetAllElements() {
        Document doc = Jsoup.parse("<div><p>1</p><span>2</span></div>");
        Element div = doc.select("div").first();
        Elements all = div.getAllElements();
        // div ตัวเอง + p + span
        assertEquals(3, all.size());
    }

    // ---------- text() ----------

    @Test
    public void testTextSimple() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendChild(new TextNode("  Hello   World  ", ""));
        String result = div.text();
        // tag ปกติ (ไม่ preserveWhitespace) -> normalise whitespace หลายตัวติดกันเป็นตัวเดียว
        assertEquals("Hello World", result);
    }

    @Test
    public void testTextPreserveWhitespaceForPreTag() {
        Element pre = new Element(Tag.valueOf("pre"), "");
        pre.appendChild(new TextNode("  Hello   World  ", ""));
        String result = pre.text();
        // preserveWhitespace -> ไม่ normalise ภายใน, แต่ค่าสุดท้าย trim() หัว-ท้าย
        assertEquals("Hello   World", result);
    }

    @Test
    public void testTextWithNestedBlockElementAddsSpace() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendText("Hello");
        Element innerDiv = div.appendElement("div"); // block
        innerDiv.appendText("World");
        String result = div.text();
        assertEquals("Hello World", result);
    }

    @Test
    public void testTextEmptyWhenNoChildren() {
        Element div = new Element(Tag.valueOf("div"), "");
        assertEquals("", div.text());
    }

    // ---------- text(String) setter ----------

    @Test(expected = IllegalArgumentException.class)
    public void testTextSetterNullThrows() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.text(null);
    }

    @Test
    public void testTextSetterClearsAndSets() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendElement("p");
        div.text("new text");
        assertEquals("new text", div.text());
        assertEquals(1, div.childNodes().size()); // only the new TextNode
    }

    // ---------- hasText() ----------

    @Test
    public void testHasTextTrueDirectTextNode() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendText("content");
        assertTrue(div.hasText());
    }

    @Test
    public void testHasTextTrueNestedElement() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element span = div.appendElement("span");
        span.appendText("nested");
        assertTrue(div.hasText());
    }

    @Test
    public void testHasTextFalseWhenBlank() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendChild(new TextNode("   ", ""));
        assertFalse(div.hasText());
    }

    @Test
    public void testHasTextFalseWhenEmpty() {
        Element div = new Element(Tag.valueOf("div"), "");
        assertFalse(div.hasText());
    }

    // ---------- data() ----------

    @Test
    public void testDataDirectDataNode() {
        Element script = new Element(Tag.valueOf("script"), "");
        script.appendChild(new DataNode("var a = 1;", ""));
        assertEquals("var a = 1;", script.data());
    }

    @Test
    public void testDataNestedElement() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element script = div.appendElement("script");
        script.appendChild(new DataNode("x=1;", ""));
        assertEquals("x=1;", div.data());
    }

    @Test
    public void testDataEmptyWhenNoDataNodes() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendText("just text");
        assertEquals("", div.data());
    }

    // ---------- className() / classNames() / classNames(Set) ----------

    @Test
    public void testClassNameEmptyWhenNoAttribute() {
        Element div = new Element(Tag.valueOf("div"), "");
        assertEquals("", div.className());
    }

    @Test
    public void testClassNameWhenSet() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.attr("class", "header gray");
        assertEquals("header gray", div.className());
    }

    @Test
    public void testClassNamesMultipleValues() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.attr("class", "header gray");
        Set<String> classes = div.classNames();
        assertTrue(classes.contains("header"));
        assertTrue(classes.contains("gray"));
        assertEquals(2, classes.size());
    }

    @Test
    public void testClassNamesCachedOnSecondCall() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.attr("class", "a b");
        Set<String> first = div.classNames();
        Set<String> second = div.classNames();
        // ตามโค้ด: if (classNames == null) ... -> เรียกครั้งที่สองควรได้ reference เดิม (cache)
        assertSame(first, second);
    }

    @Test
    public void testClassNamesSetPersistsToAttribute() {
        Element div = new Element(Tag.valueOf("div"), "");
        Set<String> classes = new LinkedHashSet<String>();
        classes.add("foo");
        classes.add("bar");
        Element result = div.classNames(classes);
        assertSame(div, result);
        assertEquals("foo bar", div.className());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testClassNamesSetNullThrows() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.classNames(null);
    }

    // ---------- hasClass ----------

    @Test
    public void testHasClassTrue() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.attr("class", "foo bar");
        assertTrue(div.hasClass("foo"));
    }

    @Test
    public void testHasClassFalse() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.attr("class", "foo bar");
        assertFalse(div.hasClass("baz"));
    }

    // ---------- addClass / removeClass / toggleClass ----------

    @Test(expected = IllegalArgumentException.class)
    public void testAddClassNullThrows() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.addClass(null);
    }

    @Test
    public void testAddClass() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.addClass("newclass");
        assertTrue(div.hasClass("newclass"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveClassNullThrows() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.removeClass(null);
    }

    @Test
    public void testRemoveClass() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.attr("class", "foo bar");
        div.removeClass("foo");
        assertFalse(div.hasClass("foo"));
        assertTrue(div.hasClass("bar"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToggleClassNullThrows() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.toggleClass(null);
    }

    @Test
    public void testToggleClassAddsWhenAbsent() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.toggleClass("foo");
        assertTrue(div.hasClass("foo"));
    }

    @Test
    public void testToggleClassRemovesWhenPresent() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.attr("class", "foo");
        div.toggleClass("foo");
        assertFalse(div.hasClass("foo"));
    }

    // ---------- val() / val(String) ----------

    @Test
    public void testValTextareaReturnsText() {
        Element textarea = new Element(Tag.valueOf("textarea"), "");
        textarea.text("hello");
        assertEquals("hello", textarea.val());
    }

    @Test
    public void testValInputReturnsValueAttr() {
        Element input = new Element(Tag.valueOf("input"), "");
        input.attr("value", "hi");
        assertEquals("hi", input.val());
    }

    @Test
    public void testValSetterTextarea() {
        Element textarea = new Element(Tag.valueOf("textarea"), "");
        Element result = textarea.val("new value");
        assertSame(textarea, result);
        assertEquals("new value", textarea.text());
    }

    @Test
    public void testValSetterInput() {
        Element input = new Element(Tag.valueOf("input"), "");
        input.val("abc");
        assertEquals("abc", input.attr("value"));
    }

    // ---------- html() getter/setter, outerHtml()/toString() ----------

    @Test
    public void testHtmlGetter() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendElement("p").text("hi");
        String html = div.html();
        assertTrue(html.contains("<p>"));
        assertTrue(html.contains("hi"));
    }

    @Test
    public void testHtmlSetterClearsAndAppends() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendElement("span");
        div.html("<p>new</p>");
        assertEquals(1, div.children().size());
        assertEquals("p", div.children().get(0).tagName());
    }

    @Test
    public void testToStringSelfClosingEmptyTag() {
        // img เป็น empty tag (tag.isEmpty() == true) และไม่มี children
        Element img = new Element(Tag.valueOf("img"), "");
        String out = img.toString();
        assertTrue(out.contains("<img"));
        assertTrue(out.contains("/>"));
    }

    @Test
    public void testToStringNonEmptyTagWithChildren() {
        Element span = new Element(Tag.valueOf("span"), "");
        span.appendText("content");
        String out = span.toString();
        assertTrue(out.contains("<span>"));
        assertTrue(out.contains("content"));
        assertTrue(out.contains("</span>"));
    }

    // ---------- equals() / hashCode() ----------

    @Test
    public void testEqualsSameInstance() {
        Element div = new Element(Tag.valueOf("div"), "");
        assertTrue(div.equals(div));
    }

    @Test
    public void testEqualsNonElementReturnsFalse() {
        Element div = new Element(Tag.valueOf("div"), "");
        assertFalse(div.equals("not an element"));
    }

    @Test
    public void testEqualsNullReturnsFalse() {
        Element div = new Element(Tag.valueOf("div"), "");
        assertFalse(div.equals(null));
    }

    @Test
    public void testHashCodeConsistentAcrossCalls() {
        Element div = new Element(Tag.valueOf("div"), "");
        int h1 = div.hashCode();
        int h2 = div.hashCode();
        assertEquals(h1, h2);
    }
}
