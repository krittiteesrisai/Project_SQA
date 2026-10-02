package org.jsoup.nodes;

import org.jsoup.Jsoup; // สมมติฐาน: Jsoup.parse เป็น public API มาตรฐานของไลบรารีเดียวกัน (ไม่ได้อยู่ในซอร์ส Element.java ที่ให้มา)
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class ElementTest {

    private Document doc;

    @Before
    public void setUp() {
        doc = Jsoup.parse("<html><head></head><body>"
            + "<div id='1' class='foo bar'><p class='foo'>One <span>Two</span> Three <br> Four</p></div>"
            + "<div id='2'><p>Five</p><p>Six</p></div>"
            + "</body></html>");
    }

    // ---------- Constructor ----------

    @Test(expected = IllegalArgumentException.class)
    // สมมติฐาน: Validate.notNull โยน IllegalArgumentException (อ้างอิงพฤติกรรมมาตรฐานของ org.jsoup.helper.Validate
    // ซึ่งไม่ได้แสดง source มาด้วย)
    public void testConstructorNullTagThrows() {
        new Element(null, "http://example.com/");
    }

    @Test
    public void testConstructorWithDefaultAttributes() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com/");
        assertEquals("div", el.tagName());
        assertEquals("", el.id());
    }

    // ---------- tagName ----------

    @Test
    public void testTagNameGetSet() {
        Element el = new Element(Tag.valueOf("span"), "");
        assertEquals("span", el.tagName());
        el.tagName("div");
        assertEquals("div", el.tagName());
        assertEquals("div", el.nodeName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameEmptyThrows() {
        Element el = new Element(Tag.valueOf("span"), "");
        el.tagName("");
    }

    // ---------- isBlock ----------

    @Test
    public void testIsBlock() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element span = new Element(Tag.valueOf("span"), "");
        assertTrue(div.isBlock());
        assertFalse(span.isBlock());
    }

    // ---------- id ----------

    @Test
    public void testIdPresentAndAbsent() {
        Element withId = doc.select("div").get(0);
        assertEquals("1", withId.id());

        Element noId = new Element(Tag.valueOf("div"), "");
        assertEquals("", noId.id());
    }

    // ---------- attr chaining ----------

    @Test
    public void testAttrChaining() {
        Element el = new Element(Tag.valueOf("div"), "");
        Element returned = el.attr("data-x", "y");
        assertSame(el, returned);
        assertEquals("y", el.attr("data-x"));
    }

    // ---------- dataset ----------

    @Test
    public void testDataset() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("data-name", "jsoup");
        assertEquals("jsoup", el.dataset().get("name"));
    }

    // ---------- parent / parents ----------

    @Test
    public void testParentForRootIsNull() {
        assertNull(doc.parent());
    }

    @Test
    public void testParentsExcludesRootButIncludesHtml() {
        Element span = doc.select("span").get(0);
        Elements parents = span.parents();
        assertFalse(parents.isEmpty());
        for (Element p : parents) {
            assertFalse(p.tagName().equals("#root"));
        }
        // ควรไต่ขึ้นไปจนถึง html (แต่ไม่รวม #root)
        assertEquals("html", parents.get(parents.size() - 1).tagName());
    }

    // ---------- child / children ----------

    @Test
    public void testChildValidIndex() {
        Element div = doc.select("div").get(1);
        Element firstP = div.child(0);
        assertEquals("Five", firstP.text());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildOutOfBoundsThrows() {
        Element div = doc.select("div").get(1);
        div.child(99);
    }

    @Test
    public void testChildrenFiltersOnlyElements() {
        Element p = doc.select("p").get(0);
        Elements children = p.children();
        assertEquals(2, children.size()); // span + br, ไม่รวม text node
    }

    // ---------- textNodes / dataNodes ----------

    @Test
    public void testTextNodes() {
        Element p = doc.select("p").get(0);
        List<TextNode> textNodes = p.textNodes();
        assertFalse(textNodes.isEmpty());
    }

    @Test
    public void testDataNodesEmptyWhenNone() {
        Element p = doc.select("p").get(0);
        assertTrue(p.dataNodes().isEmpty());
    }

    @Test
    public void testDataNodesWithScript() {
        Document d = Jsoup.parse("<script>var a = 1;</script>");
        Element script = d.select("script").get(0);
        List<DataNode> dataNodes = script.dataNodes();
        assertEquals(1, dataNodes.size());
    }

    // ---------- select ----------

    @Test
    public void testSelect() {
        Elements found = doc.select("p.foo");
        assertEquals(1, found.size());
    }

    // ---------- appendChild / prependChild ----------

    @Test(expected = IllegalArgumentException.class)
    public void testAppendChildNullThrows() {
        new Element(Tag.valueOf("div"), "").appendChild(null);
    }

    @Test
    public void testAppendChildAddsAtEnd() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.appendText("a");
        el.appendText("b");
        assertEquals(2, el.childNodeSize());
        assertEquals("b", ((TextNode) el.childNode(1)).getWholeText());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrependChildNullThrows() {
        new Element(Tag.valueOf("div"), "").prependChild(null);
    }

    @Test
    public void testPrependChildAddsAtStart() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.appendText("a");
        el.prependText("b");
        assertEquals("b", ((TextNode) el.childNode(0)).getWholeText());
    }

    // ---------- insertChildren ----------

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenNullCollectionThrows() {
        new Element(Tag.valueOf("div"), "").insertChildren(0, null);
    }

    @Test
    public void testInsertChildrenNegativeIndexRollsAround() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.appendText("a");
        el.appendText("b");
        List<Node> toInsert = new ArrayList<Node>();
        toInsert.add(new TextNode("c", ""));
        el.insertChildren(-1, toInsert); // index = -1 -> currentSize+1-1 = currentSize (ปลายสุด)
        assertEquals(3, el.childNodeSize());
        assertEquals("c", ((TextNode) el.childNode(2)).getWholeText());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenOutOfBoundsThrows() {
        Element el = new Element(Tag.valueOf("div"), "");
        List<Node> toInsert = new ArrayList<Node>();
        toInsert.add(new TextNode("c", ""));
        el.insertChildren(5, toInsert);
    }

    // ---------- appendElement / prependElement ----------

    @Test
    public void testAppendElement() {
        Element el = new Element(Tag.valueOf("div"), "");
        Element span = el.appendElement("span");
        assertEquals("span", span.tagName());
        assertEquals(1, el.childNodeSize());
    }

    @Test
    public void testPrependElement() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.appendElement("span");
        Element p = el.prependElement("p");
        assertEquals("p", p.tagName());
        assertEquals("p", ((Element) el.childNode(0)).tagName());
    }

    // ---------- appendText / prependText ----------

    @Test
    public void testAppendText() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.appendText("Hello");
        assertEquals("Hello", el.text());
    }

    @Test
    public void testPrependText() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.appendText("World");
        el.prependText("Hello ");
        assertEquals("Hello World", el.text());
    }

    // ---------- append / prepend html ----------

    @Test(expected = IllegalArgumentException.class)
    public void testAppendNullThrows() {
        new Element(Tag.valueOf("div"), "").append(null);
    }

    @Test
    public void testAppendHtml() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.append("<p>Hi</p>");
        assertEquals(1, el.children().size());
        assertEquals("p", el.children().get(0).tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrependNullThrows() {
        new Element(Tag.valueOf("div"), "").prepend(null);
    }

    @Test
    public void testPrependHtml() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.append("<p>Second</p>");
        el.prepend("<p>First</p>");
        assertEquals("First", el.children().get(0).text());
    }

    // ---------- before / after ----------

    @Test
    public void testBeforeAfterString() {
        Element el = new Element(Tag.valueOf("div"), "");
        Element parent = new Element(Tag.valueOf("body"), "");
        parent.appendChild(el);
        el.before("<p>before</p>");
        el.after("<p>after</p>");
        assertEquals(3, parent.childNodeSize());
    }

    @Test
    public void testBeforeAfterNode() {
        Element el = new Element(Tag.valueOf("div"), "");
        Element parent = new Element(Tag.valueOf("body"), "");
        parent.appendChild(el);
        el.before(new TextNode("b", ""));
        el.after(new TextNode("a", ""));
        assertEquals(3, parent.childNodeSize());
    }

    // ---------- empty ----------

    @Test
    public void testEmpty() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.appendText("content");
        assertTrue(el.childNodeSize() > 0);
        el.empty();
        assertEquals(0, el.childNodeSize());
    }

    // ---------- wrap ----------

    @Test
    public void testWrap() {
        Element el = new Element(Tag.valueOf("div"), "");
        Element parent = new Element(Tag.valueOf("body"), "");
        parent.appendChild(el);
        el.wrap("<section></section>");
        assertEquals("section", el.parent().tagName());
    }

    // ---------- cssSelector ----------

    @Test
    public void testCssSelectorWithId() {
        Element div = doc.select("div").get(0);
        assertEquals("#1", div.cssSelector());
    }

    @Test
    public void testCssSelectorWithClassesNoId() {
        Element span = doc.select("span").get(0);
        assertTrue(span.cssSelector().contains("span"));
    }

    @Test
    public void testCssSelectorParentIsDocumentReturnsTagOnly() {
        Element html = doc.select("html").get(0);
        assertEquals("html", html.cssSelector());
    }

    @Test
    public void testCssSelectorNthChild() {
        Element div2 = doc.select("div").get(1);
        Elements ps = div2.children();
        String secondPSelector = ps.get(1).cssSelector();
        assertTrue(secondPSelector.contains(":nth-child(2)"));
    }

    // ---------- siblingElements ----------

    @Test
    public void testSiblingElementsNoParent() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertEquals(0, el.siblingElements().size());
    }

    @Test
    public void testSiblingElementsWithSiblings() {
        Element div2 = doc.select("div").get(1);
        Element first = div2.children().get(0);
        Elements siblings = first.siblingElements();
        assertEquals(1, siblings.size());
        assertEquals("Six", siblings.get(0).text());
    }

    // ---------- next / previous element sibling ----------

    @Test
    public void testNextElementSiblingNoParent() {
        assertNull(new Element(Tag.valueOf("div"), "").nextElementSibling());
    }

    @Test
    public void testNextElementSiblingExists() {
        Element div2 = doc.select("div").get(1);
        Element first = div2.children().get(0);
        assertEquals("Six", first.nextElementSibling().text());
    }

    @Test
    public void testNextElementSiblingNoneReturnsNull() {
        Element div2 = doc.select("div").get(1);
        Element last = div2.children().get(1);
        assertNull(last.nextElementSibling());
    }

    @Test
    public void testPreviousElementSiblingNoParent() {
        assertNull(new Element(Tag.valueOf("div"), "").previousElementSibling());
    }

    @Test
    public void testPreviousElementSiblingExists() {
        Element div2 = doc.select("div").get(1);
        Element last = div2.children().get(1);
        assertEquals("Five", last.previousElementSibling().text());
    }

    @Test
    public void testPreviousElementSiblingNoneReturnsNull() {
        Element div2 = doc.select("div").get(1);
        Element first = div2.children().get(0);
        assertNull(first.previousElementSibling());
    }

    // ---------- firstElementSibling / lastElementSibling ----------

    @Test
    public void testFirstElementSiblingMultiple() {
        Element div2 = doc.select("div").get(1);
        Element first = div2.children().get(0);
        assertEquals("Five", first.firstElementSibling().text());
    }

    @Test
    public void testFirstElementSiblingSingleReturnsNull() {
        Element div1 = doc.select("div").get(0);
        Element onlyP = div1.children().get(0);
        assertNull(onlyP.firstElementSibling());
    }

    @Test
    public void testLastElementSiblingMultiple() {
        Element div2 = doc.select("div").get(1);
        Element first = div2.children().get(0);
        assertEquals("Six", first.lastElementSibling().text());
    }

    @Test
    public void testLastElementSiblingSingleReturnsNull() {
        Element div1 = doc.select("div").get(0);
        Element onlyP = div1.children().get(0);
        assertNull(onlyP.lastElementSibling());
    }

    // ---------- elementSiblingIndex ----------

    @Test
    public void testElementSiblingIndexNoParent() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertEquals(Integer.valueOf(0), el.elementSiblingIndex());
    }

    @Test
    public void testElementSiblingIndexWithParent() {
        Element div2 = doc.select("div").get(1);
        Element second = div2.children().get(1);
        assertEquals(Integer.valueOf(1), second.elementSiblingIndex());
    }

    // ---------- getElementsByTag ----------

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByTagEmptyThrows() {
        doc.getElementsByTag("");
    }

    @Test
    public void testGetElementsByTag() {
        assertEquals(3, doc.getElementsByTag("P").size()); // ทดสอบ toLowerCase/trim ด้วย
    }

    // ---------- getElementById ----------

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementByIdEmptyThrows() {
        doc.getElementById("");
    }

    @Test
    public void testGetElementByIdFound() {
        assertNotNull(doc.getElementById("2"));
    }

    @Test
    public void testGetElementByIdNotFound() {
        assertNull(doc.getElementById("no-such-id"));
    }

    // ---------- getElementsByClass ----------

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByClassEmptyThrows() {
        doc.getElementsByClass("");
    }

    @Test
    public void testGetElementsByClass() {
        assertEquals(2, doc.getElementsByClass("foo").size());
    }

    // ---------- getElementsByAttribute ----------

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeEmptyThrows() {
        doc.getElementsByAttribute("");
    }

    @Test
    public void testGetElementsByAttribute() {
        assertEquals(2, doc.getElementsByAttribute("id").size());
    }

    // ---------- getElementsByAttributeStarting ----------

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeStartingEmptyThrows() {
        doc.getElementsByAttributeStarting("");
    }

    @Test
    public void testGetElementsByAttributeStarting() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("data-foo", "bar");
        doc.select("div").get(0).appendChild(el);
        assertEquals(1, doc.getElementsByAttributeStarting("data-").size());
    }

    // ---------- getElementsByAttributeValue* ----------

    @Test
    public void testGetElementsByAttributeValue() {
        assertEquals(1, doc.getElementsByAttributeValue("id", "1").size());
    }

    @Test
    public void testGetElementsByAttributeValueNot() {
        Elements els = doc.getElementsByAttributeValueNot("id", "1");
        assertTrue(els.size() > 0);
        for (Element e : els) {
            assertNotEquals("1", e.id());
        }
    }

    @Test
    public void testGetElementsByAttributeValueStarting() {
        assertEquals(1, doc.getElementsByAttributeValueStarting("id", "1").size());
    }

    @Test
    public void testGetElementsByAttributeValueEnding() {
        assertEquals(1, doc.getElementsByAttributeValueEnding("id", "1").size());
    }

    @Test
    public void testGetElementsByAttributeValueContaining() {
        assertEquals(2, doc.getElementsByAttributeValueContaining("class", "foo").size());
    }

    // ---------- getElementsByAttributeValueMatching ----------

    @Test
    public void testGetElementsByAttributeValueMatchingPattern() {
        assertEquals(1, doc.getElementsByAttributeValueMatching("id", Pattern.compile("^1$")).size());
    }

    @Test
    public void testGetElementsByAttributeValueMatchingValidRegexString() {
        assertEquals(1, doc.getElementsByAttributeValueMatching("id", "^1$").size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueMatchingInvalidRegexStringThrows() {
        doc.getElementsByAttributeValueMatching("id", "["); // PatternSyntaxException -> IllegalArgumentException
    }

    // ---------- getElementsByIndex* ----------

    @Test
    public void testGetElementsByIndexLessThan() {
        Element div2 = doc.select("div").get(1);
        assertFalse(div2.getElementsByIndexLessThan(1).isEmpty());
    }

    @Test
    public void testGetElementsByIndexGreaterThan() {
        Element div2 = doc.select("div").get(1);
        assertFalse(div2.getElementsByIndexGreaterThan(0).isEmpty());
    }

    @Test
    public void testGetElementsByIndexEquals() {
        Element div2 = doc.select("div").get(1);
        assertFalse(div2.getElementsByIndexEquals(0).isEmpty());
    }

    // ---------- getElementsContainingText / OwnText ----------

    @Test
    public void testGetElementsContainingText() {
        assertFalse(doc.getElementsContainingText("Five").isEmpty());
    }

    @Test
    public void testGetElementsContainingOwnText() {
        assertFalse(doc.getElementsContainingOwnText("Five").isEmpty());
    }

    // ---------- getElementsMatchingText / OwnText ----------

    @Test
    public void testGetElementsMatchingTextPattern() {
        assertFalse(doc.getElementsMatchingText(Pattern.compile("Five")).isEmpty());
    }

    @Test
    public void testGetElementsMatchingTextValidRegexString() {
        assertFalse(doc.getElementsMatchingText("Five").isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingTextInvalidRegexStringThrows() {
        doc.getElementsMatchingText("[");
    }

    @Test
    public void testGetElementsMatchingOwnTextPattern() {
        assertFalse(doc.getElementsMatchingOwnText(Pattern.compile("Five")).isEmpty());
    }

    @Test
    public void testGetElementsMatchingOwnTextValidRegexString() {
        assertFalse(doc.getElementsMatchingOwnText("Five").isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingOwnTextInvalidRegexStringThrows() {
        doc.getElementsMatchingOwnText("[");
    }

    // ---------- getAllElements ----------

    @Test
    public void testGetAllElements() {
        assertTrue(doc.getAllElements().size() > 1);
    }

    // ---------- text() ----------

    @Test
    public void testTextWithBlockAndBr() {
        Element p = doc.select("p").get(0);
        String text = p.text();
        assertTrue(text.contains("One"));
        assertTrue(text.contains("Two"));
        assertTrue(text.contains("Three"));
        assertTrue(text.contains("Four"));
    }

    @Test
    public void testTextEmptyWhenNoChildren() {
        assertEquals("", new Element(Tag.valueOf("div"), "").text());
    }

    // ---------- ownText() ----------

    @Test
    public void testOwnTextExcludesChildElementText() {
        Element p = doc.select("p").get(0);
        String ownText = p.ownText();
        assertFalse(ownText.contains("Two")); // "Two" อยู่ใน <span> ไม่ใช่ own text ของ p
        assertTrue(ownText.contains("One"));
    }

    // ---------- preserveWhitespace (ทดสอบผ่าน <pre>) ----------

    @Test
    // สมมติฐาน: tag "pre" มี preserveWhitespace()==true ตาม behavior มาตรฐานของ jsoup
    // (ไม่ได้แสดง source ของ Tag.java มาด้วย)
    public void testPreserveWhitespaceOnPreTag() {
        Document d = Jsoup.parse("<pre>  Hello   World  </pre>");
        Element pre = d.select("pre").get(0);
        String own = pre.ownText();
        assertTrue(own.contains("  ")); // ช่องว่างซ้อนไม่ถูกยุบ
    }

    @Test
    public void testNormalWhitespaceCollapsedOnNonPreTag() {
        Document d = Jsoup.parse("<div>  Hello   World  </div>");
        Element div = d.select("div").get(0);
        assertEquals("Hello World", div.text());
    }

    // ---------- text(String) setter ----------

    @Test(expected = IllegalArgumentException.class)
    public void testTextSetterNullThrows() {
        new Element(Tag.valueOf("div"), "").text(null);
    }

    @Test
    public void testTextSetterClearsAndSets() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.appendElement("span").text("old");
        el.text("new");
        assertEquals("new", el.text());
        assertEquals(1, el.childNodeSize());
    }

    // ---------- hasText ----------

    @Test
    public void testHasTextTrue() {
        assertTrue(doc.select("p").get(0).hasText());
    }

    @Test
    public void testHasTextFalseWhenBlank() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.appendText("   ");
        assertFalse(el.hasText());
    }

    @Test
    public void testHasTextTrueViaChildElement() {
        Element outer = new Element(Tag.valueOf("div"), "");
        outer.appendElement("span").appendText("content");
        assertTrue(outer.hasText());
    }

    // ---------- data() ----------

    @Test
    public void testData() {
        Document d = Jsoup.parse("<script>var a=1;</script><div><script>var b=2;</script></div>");
        String data = d.data();
        assertTrue(data.contains("var a=1;"));
        assertTrue(data.contains("var b=2;"));
    }

    @Test
    public void testDataEmptyWhenNoDataNodes() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.appendText("hello");
        assertEquals("", el.data());
    }

    // ---------- className / classNames ----------

    @Test
    public void testClassNameTrimmed() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("class", "  foo bar  ");
        assertEquals("foo bar", el.className());
    }

    @Test
    public void testClassNamesSplitAndRemoveEmpty() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("class", "foo bar");
        Set<String> names = el.classNames();
        assertEquals(2, names.size());
        assertTrue(names.contains("foo"));
        assertTrue(names.contains("bar"));
    }

    @Test
    public void testClassNamesEmptyWhenNoClassAttr() {
        assertTrue(new Element(Tag.valueOf("div"), "").classNames().isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testClassNamesSetterNullThrows() {
        new Element(Tag.valueOf("div"), "").classNames(null);
    }

    @Test
    public void testClassNamesSetterPersists() {
        Element el = new Element(Tag.valueOf("div"), "");
        Set<String> names = new LinkedHashSet<String>();
        names.add("a");
        names.add("b");
        el.classNames(names);
        assertEquals("a b", el.attr("class"));
    }

    // ---------- hasClass ----------

    @Test
    public void testHasClassEmptyAttrReturnsFalse() {
        assertFalse(new Element(Tag.valueOf("div"), "").hasClass("foo"));
    }

    @Test
    public void testHasClassShorterAttrReturnsFalse() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("class", "ab");
        assertFalse(el.hasClass("longclassname"));
    }

    @Test
    public void testHasClassMatchCaseInsensitive() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("class", "Foo Bar");
        assertTrue(el.hasClass("foo"));
        assertTrue(el.hasClass("BAR"));
    }

    @Test
    public void testHasClassNoMatch() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("class", "foo bar");
        assertFalse(el.hasClass("baz"));
    }

    // ---------- addClass / removeClass / toggleClass ----------

    @Test(expected = IllegalArgumentException.class)
    public void testAddClassNullThrows() {
        new Element(Tag.valueOf("div"), "").addClass(null);
    }

    @Test
    public void testAddClass() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.addClass("foo");
        assertTrue(el.hasClass("foo"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveClassNullThrows() {
        new Element(Tag.valueOf("div"), "").removeClass(null);
    }

    @Test
    public void testRemoveClass() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("class", "foo bar");
        el.removeClass("foo");
        assertFalse(el.hasClass("foo"));
        assertTrue(el.hasClass("bar"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToggleClassNullThrows() {
        new Element(Tag.valueOf("div"), "").toggleClass(null);
    }

    @Test
    public void testToggleClassAddsWhenAbsent() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.toggleClass("foo");
        assertTrue(el.hasClass("foo"));
    }

    @Test
    public void testToggleClassRemovesWhenPresent() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("class", "foo");
        el.toggleClass("foo");
        assertFalse(el.hasClass("foo"));
    }

    // ---------- val / val(String) ----------

    @Test
    public void testValTextarea() {
        Element textarea = new Element(Tag.valueOf("textarea"), "");
        textarea.text("hello");
        assertEquals("hello", textarea.val());
    }

    @Test
    public void testValInputAttr() {
        Element input = new Element(Tag.valueOf("input"), "");
        input.attr("value", "x");
        assertEquals("x", input.val());
    }

    @Test
    public void testValSetterTextarea() {
        Element textarea = new Element(Tag.valueOf("textarea"), "");
        textarea.val("content");
        assertEquals("content", textarea.text());
    }

    @Test
    public void testValSetterInput() {
        Element input = new Element(Tag.valueOf("input"), "");
        input.val("x");
        assertEquals("x", input.attr("value"));
    }

    // ---------- html() / html(String) ----------

    @Test
    public void testHtmlGet() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendElement("p").text("hi");
        assertTrue(div.html().contains("<p>hi</p>"));
    }

    @Test
    public void testHtmlSetterReplacesContent() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendText("old");
        div.html("<p>new</p>");
        assertEquals(1, div.children().size());
        assertEquals("new", div.children().get(0).text());
    }

    // ---------- toString ----------

    @Test
    public void testToStringEqualsOuterHtml() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendText("hi");
        assertEquals(div.outerHtml(), div.toString());
    }

    // ---------- equals / hashCode ----------
    // หมายเหตุ: ไม่เทสกรณี "สอง instance ต่างกันแต่เนื้อหาเหมือนกัน -> equals คืนค่า true"
    // เพราะ super.equals(o) เรียก Node.equals() ซึ่งไม่มี source ให้ดู จึงไม่ทราบว่าเป็น identity-based
    // หรือ content-based อย่างแน่ชัด (หลีกเลี่ยงการเดา behavior)

    @Test
    public void testEqualsSameInstance() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertTrue(el.equals(el));
    }

    @Test
    public void testEqualsNullReturnsFalse() {
        assertFalse(new Element(Tag.valueOf("div"), "").equals(null));
    }

    @Test
    public void testEqualsDifferentClassReturnsFalse() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertFalse(el.equals("not an element"));
    }

    @Test
    public void testEqualsDifferentTagReturnsFalse() {
        Element el1 = new Element(Tag.valueOf("div"), "");
        Element el2 = new Element(Tag.valueOf("span"), "");
        assertFalse(el1.equals(el2));
    }

    @Test
    public void testHashCodeStableAcrossCalls() {
        Element el = new Element(Tag.valueOf("div"), "");
        int h1 = el.hashCode();
        int h2 = el.hashCode();
        assertEquals(h1, h2);
    }

    // ---------- clone ----------

    @Test
    // สมมติฐาน: clone() ทำ deep copy ตาม contract ทั่วไปของ Object#clone (Node.clone() ไม่มี source ให้ดู)
    public void testClone() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("id", "x");
        el.appendText("content");
        Element clone = el.clone();
        assertEquals(el.outerHtml(), clone.outerHtml());
        assertNotSame(el, clone);
    }
}
