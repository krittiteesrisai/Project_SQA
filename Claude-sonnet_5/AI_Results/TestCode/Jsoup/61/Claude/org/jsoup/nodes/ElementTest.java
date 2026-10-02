package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class ElementTest {

    // ---------- Constructors ----------

    @Test
    public void testConstructorWithTagName() {
        Element el = new Element("div");
        assertEquals("div", el.tagName());
        assertEquals("div", el.nodeName());
        assertNotNull(el.tag());
    }

    @Test
    public void testConstructorWithTagBaseUriAttributes() {
        Attributes attrs = new Attributes();
        attrs.put("id", "abc");
        Element el = new Element(Tag.valueOf("span"), "http://example.com/", attrs);
        assertEquals("span", el.tagName());
        assertEquals("abc", el.id());
        assertEquals("http://example.com/", el.baseUri());
    }

    @Test
    public void testConstructorWithTagAndBaseUri() {
        Element el = new Element(Tag.valueOf("p"), "http://x.com/");
        assertEquals("p", el.tagName());
        assertEquals("http://x.com/", el.baseUri());
    }

    // Validate.notNull is assumed to throw IllegalArgumentException (standard jsoup behavior)
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullTagThrows() {
        new Element((Tag) null, "", new Attributes());
    }

    // ---------- tagName() setter ----------

    @Test
    public void testTagNameSetter() {
        Element el = new Element("div");
        Element same = el.tagName("SPAN");
        assertSame(el, same);
        assertEquals("SPAN", el.tagName()); // preserveCase settings
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameSetterEmptyThrows() {
        Element el = new Element("div");
        el.tagName("");
    }

    // ---------- isBlock ----------

    @Test
    public void testIsBlockTrueForDiv() {
        assertTrue(new Element("div").isBlock());
    }

    @Test
    public void testIsBlockFalseForSpan() {
        assertFalse(new Element("span").isBlock());
    }

    // ---------- id ----------

    @Test
    public void testIdEmptyWhenNotSet() {
        assertEquals("", new Element("div").id());
    }

    @Test
    public void testIdWhenSet() {
        Element el = new Element("div");
        el.attr("id", "main");
        assertEquals("main", el.id());
    }

    // ---------- attr ----------

    @Test
    public void testAttrStringStringChainable() {
        Element el = new Element("div");
        Element same = el.attr("data-x", "1");
        assertSame(el, same);
        assertEquals("1", el.attr("data-x"));
    }

    @Test
    public void testAttrBooleanTrueAndFalse() {
        Element el = new Element("input");
        el.attr("disabled", true);
        assertTrue(el.hasAttr("disabled"));
        el.attr("disabled", false);
        assertFalse(el.hasAttr("disabled"));
    }

    // ---------- dataset ----------

    @Test
    public void testDataset() {
        Element el = new Element("div");
        el.attr("data-package", "jsoup");
        el.attr("data-language", "Java");
        el.attr("class", "group");
        Map<String, String> dataset = el.dataset();
        assertEquals("jsoup", dataset.get("package"));
        assertEquals("Java", dataset.get("language"));
        assertEquals(2, dataset.size());
    }

    // ---------- parent / parents ----------

    @Test
    public void testParentsStopsAtRoot() {
        Document doc = Jsoup.parse("<html><body><div><p>Hi</p></div></body></html>");
        Element p = doc.select("p").first();
        Elements parents = p.parents();
        assertTrue(parents.size() >= 3);
        for (Element parent : parents) {
            assertNotEquals("#root", parent.tagName());
        }
    }

    @Test
    public void testParentNullForStandalone() {
        assertNull(new Element("div").parent());
    }

    // ---------- child / children ----------

    @Test
    public void testChildAndChildren() {
        Element parent = new Element("div");
        Element c1 = new Element("p");
        Element c2 = new Element("span");
        parent.appendChild(c1);
        parent.appendChild(c2);
        assertEquals(2, parent.children().size());
        assertSame(c1, parent.child(0));
        assertSame(c2, parent.child(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildOutOfBoundsThrows() {
        new Element("div").child(0);
    }

    @Test
    public void testChildrenEmptyWhenNoChildren() {
        assertEquals(0, new Element("div").children().size());
    }

    // ---------- textNodes / dataNodes ----------

    @Test
    public void testTextNodesAndDataNodes() {
        Element el = new Element("div");
        el.appendChild(new TextNode("hello", ""));
        el.appendChild(new DataNode("data-content", ""));
        assertEquals(1, el.textNodes().size());
        assertEquals(1, el.dataNodes().size());
    }

    // ---------- select / is ----------

    @Test
    public void testSelect() {
        Document doc = Jsoup.parse("<div><p class='a'>1</p><p class='b'>2</p></div>");
        assertEquals(1, doc.select("p.a").size());
    }

    @Test
    public void testIsCssQueryTrueFalse() {
        Document doc = Jsoup.parse("<div class='a'></div>");
        Element div = doc.select("div").first();
        assertTrue(div.is(".a"));
        assertFalse(div.is(".b"));
    }

    // ---------- appendChild / prependChild ----------

    @Test(expected = IllegalArgumentException.class)
    public void testAppendChildNullThrows() {
        new Element("div").appendChild(null);
    }

    @Test
    public void testPrependChild() {
        Element parent = new Element("div");
        Element c1 = new Element("p");
        Element c2 = new Element("span");
        parent.appendChild(c1);
        parent.prependChild(c2);
        assertSame(c2, parent.child(0));
        assertSame(c1, parent.child(1));
    }

    // ---------- insertChildren ----------

    @Test
    public void testInsertChildrenAtPositiveIndex() {
        Element parent = new Element("div");
        Element c1 = new Element("p");
        Element c2 = new Element("span");
        parent.appendChild(c1);
        parent.appendChild(c2);

        Element inserted = new Element("b");
        List<Node> toInsert = new ArrayList<Node>();
        toInsert.add(inserted);
        parent.insertChildren(1, toInsert);

        assertSame(c1, parent.child(0));
        assertSame(inserted, parent.child(1));
        assertSame(c2, parent.child(2));
    }

    @Test
    public void testInsertChildrenNegativeIndexRollsAround() {
        Element parent = new Element("div");
        Element c1 = new Element("p");
        parent.appendChild(c1);

        Element inserted = new Element("b");
        List<Node> toInsert = new ArrayList<Node>();
        toInsert.add(inserted);
        parent.insertChildren(-1, toInsert); // -1 -> end

        assertSame(c1, parent.child(0));
        assertSame(inserted, parent.child(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenOutOfBoundsThrows() {
        Element parent = new Element("div");
        List<Node> toInsert = new ArrayList<Node>();
        toInsert.add(new Element("b"));
        parent.insertChildren(5, toInsert);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenNullCollectionThrows() {
        new Element("div").insertChildren(0, null);
    }

    // ---------- appendElement / prependElement ----------

    @Test
    public void testAppendElement() {
        Element parent = new Element("div");
        Element child = parent.appendElement("p");
        assertEquals("p", child.tagName());
        assertSame(child, parent.child(0));
    }

    @Test
    public void testPrependElement() {
        Element parent = new Element("div");
        parent.appendElement("span");
        Element child = parent.prependElement("p");
        assertSame(child, parent.child(0));
    }

    // ---------- appendText / prependText ----------

    @Test
    public void testAppendTextAndPrependText() {
        Element el = new Element("div");
        el.appendText("World");
        el.prependText("Hello ");
        assertEquals("Hello World", el.text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendTextNullThrows() {
        new Element("div").appendText(null);
    }

    // ---------- append / prepend html ----------

    @Test
    public void testAppendHtml() {
        Element el = new Element("div");
        el.append("<p>1</p>");
        el.append("<p>2</p>");
        assertEquals(2, el.children().size());
        assertEquals("1", el.child(0).text());
        assertEquals("2", el.child(1).text());
    }

    @Test
    public void testPrependHtml() {
        Element el = new Element("div");
        el.append("<p>2</p>");
        el.prepend("<p>1</p>");
        assertEquals("1", el.child(0).text());
        assertEquals("2", el.child(1).text());
    }

    // ---------- before / after ----------

    @Test
    public void testBeforeAfterHtml() {
        Document doc = Jsoup.parse("<div><p>mid</p></div>");
        Element p = doc.select("p").first();
        p.before("<span>before</span>");
        p.after("<span>after</span>");
        assertEquals(2, doc.select("span").size());
    }

    // ---------- empty ----------

    @Test
    public void testEmpty() {
        Element el = new Element("div");
        el.appendChild(new Element("p"));
        Element same = el.empty();
        assertSame(el, same);
        assertEquals(0, el.children().size());
    }

    // ---------- wrap ----------

    @Test
    public void testWrap() {
        Document doc = Jsoup.parse("<div><p>Test</p></div>");
        Element p = doc.select("p").first();
        p.wrap("<section></section>");
        assertNotNull(p.parent());
        assertEquals("section", p.parent().tagName());
    }

    // ---------- cssSelector ----------

    @Test
    public void testCssSelectorWithId() {
        Element el = new Element("div");
        el.attr("id", "main");
        assertEquals("#main", el.cssSelector());
    }

    @Test
    public void testCssSelectorWithClassNoParent() {
        Element el = new Element("div");
        el.attr("class", "a b");
        assertTrue(el.cssSelector().startsWith("div."));
    }

    @Test
    public void testCssSelectorWithParentDocument() {
        Document doc = Jsoup.parse("<html><body><div></div></body></html>");
        Element div = doc.select("div").first();
        String selector = div.cssSelector();
        assertNotNull(selector);
        assertFalse(selector.contains("#root"));
    }

    @Test
    public void testCssSelectorNthChildWhenMultipleSameSelector() {
        Document doc = Jsoup.parse("<div><p class='x'>1</p><p class='x'>2</p></div>");
        Elements ps = doc.select("p.x");
        assertTrue(ps.get(1).cssSelector().contains(":nth-child"));
    }

    // ---------- siblingElements ----------

    @Test
    public void testSiblingElementsNoParent() {
        assertEquals(0, new Element("div").siblingElements().size());
    }

    @Test
    public void testSiblingElementsWithParent() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p><p id='b'>2</p><p id='c'>3</p></div>");
        Element b = doc.getElementById("b");
        Elements siblings = b.siblingElements();
        assertEquals(2, siblings.size());
        for (Element s : siblings) {
            assertNotEquals("b", s.id());
        }
    }

    // ---------- nextElementSibling / previousElementSibling ----------

    @Test
    public void testNextElementSiblingNoParent() {
        assertNull(new Element("div").nextElementSibling());
    }

    @Test
    public void testNextAndPreviousElementSibling() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p><p id='b'>2</p></div>");
        Element a = doc.getElementById("a");
        Element b = doc.getElementById("b");
        assertSame(b, a.nextElementSibling());
        assertNull(b.nextElementSibling());
        assertSame(a, b.previousElementSibling());
        assertNull(a.previousElementSibling());
    }

    @Test
    public void testPreviousElementSiblingNoParent() {
        assertNull(new Element("div").previousElementSibling());
    }

    // ---------- firstElementSibling / lastElementSibling ----------

    @Test
    public void testFirstAndLastElementSiblingSingleChild() {
        Document doc = Jsoup.parse("<div><p id='only'>1</p></div>");
        Element only = doc.getElementById("only");
        assertNull(only.firstElementSibling());
        assertNull(only.lastElementSibling());
    }

    @Test
    public void testFirstAndLastElementSiblingMultipleChildren() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p><p id='b'>2</p><p id='c'>3</p></div>");
        Element b = doc.getElementById("b");
        assertEquals("a", b.firstElementSibling().id());
        assertEquals("c", b.lastElementSibling().id());
    }

    // ---------- elementSiblingIndex ----------

    @Test
    public void testElementSiblingIndexNoParent() {
        assertEquals(Integer.valueOf(0), new Element("div").elementSiblingIndex());
    }

    @Test
    public void testElementSiblingIndexWithParent() {
        Document doc = Jsoup.parse("<div><p id='a'>1</p><p id='b'>2</p></div>");
        Element b = doc.getElementById("b");
        assertEquals(Integer.valueOf(1), b.elementSiblingIndex());
    }

    // ---------- getElementsByTag / getElementById ----------

    @Test
    public void testGetElementsByTag() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p></div>");
        assertEquals(2, doc.getElementsByTag("P").size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByTagEmptyThrows() {
        new Element("div").getElementsByTag("");
    }

    @Test
    public void testGetElementByIdFound() {
        Document doc = Jsoup.parse("<div><p id='x'>1</p></div>");
        Element found = doc.getElementById("x");
        assertNotNull(found);
        assertEquals("x", found.id());
    }

    @Test
    public void testGetElementByIdNotFound() {
        Document doc = Jsoup.parse("<div><p id='x'>1</p></div>");
        assertNull(doc.getElementById("nope"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementByIdEmptyThrows() {
        new Element("div").getElementById("");
    }

    // ---------- getElementsByClass / Attribute family ----------

    @Test
    public void testGetElementsByClass() {
        Document doc = Jsoup.parse("<div class='a b'></div><p class='b'></p>");
        assertEquals(2, doc.getElementsByClass("b").size());
    }

    @Test
    public void testGetElementsByAttribute() {
        Document doc = Jsoup.parse("<a href='x'>1</a><p>2</p>");
        assertEquals(1, doc.getElementsByAttribute("href").size());
    }

    @Test
    public void testGetElementsByAttributeStarting() {
        Document doc = Jsoup.parse("<div data-x='1'></div><p>2</p>");
        assertEquals(1, doc.getElementsByAttributeStarting("data-").size());
    }

    @Test
    public void testGetElementsByAttributeValue() {
        Document doc = Jsoup.parse("<a href='x'>1</a><a href='y'>2</a>");
        assertEquals(1, doc.getElementsByAttributeValue("href", "x").size());
    }

    @Test
    public void testGetElementsByAttributeValueNot() {
        Document doc = Jsoup.parse("<a href='x'>1</a><a href='y'>2</a>");
        Elements els = doc.getElementsByAttributeValueNot("href", "x");
        boolean hasY = false;
        for (Element e : els) if ("y".equals(e.attr("href"))) hasY = true;
        assertTrue(hasY);
    }

    @Test
    public void testGetElementsByAttributeValueStarting() {
        Document doc = Jsoup.parse("<a href='http://example.com'>1</a><a href='ftp://x'>2</a>");
        assertEquals(1, doc.getElementsByAttributeValueStarting("href", "http").size());
    }

    @Test
    public void testGetElementsByAttributeValueEnding() {
        Document doc = Jsoup.parse("<a href='file.pdf'>1</a><a href='file.doc'>2</a>");
        assertEquals(1, doc.getElementsByAttributeValueEnding("href", ".pdf").size());
    }

    @Test
    public void testGetElementsByAttributeValueContaining() {
        Document doc = Jsoup.parse("<a href='abcdef'>1</a><a href='xyz'>2</a>");
        assertEquals(1, doc.getElementsByAttributeValueContaining("href", "cde").size());
    }

    @Test
    public void testGetElementsByAttributeValueMatchingPattern() {
        Document doc = Jsoup.parse("<a href='123'>1</a><a href='abc'>2</a>");
        assertEquals(1, doc.getElementsByAttributeValueMatching("href", Pattern.compile("\\d+")).size());
    }

    @Test
    public void testGetElementsByAttributeValueMatchingRegexValid() {
        Document doc = Jsoup.parse("<a href='123'>1</a><a href='abc'>2</a>");
        assertEquals(1, doc.getElementsByAttributeValueMatching("href", "\\d+").size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueMatchingRegexInvalidThrows() {
        Jsoup.parse("<a href='123'>1</a>").getElementsByAttributeValueMatching("href", "[");
    }

    // ---------- Index based ----------

    @Test
    public void testGetElementsByIndexLessGreaterEquals() {
        Document doc = Jsoup.parse("<div><p>1</p><p>2</p><p>3</p></div>");
        assertTrue(doc.getElementsByIndexLessThan(1).size() >= 1);
        assertTrue(doc.getElementsByIndexGreaterThan(1).size() >= 1);
        assertTrue(doc.getElementsByIndexEquals(1).size() >= 1);
    }

    // ---------- text search ----------

    @Test
    public void testGetElementsContainingText() {
        Document doc = Jsoup.parse("<div><p>Hello World</p></div>");
        assertTrue(doc.getElementsContainingText("world").size() > 0);
    }

    @Test
    public void testGetElementsContainingOwnText() {
        Document doc = Jsoup.parse("<p>Hello <b>World</b></p>");
        assertTrue(doc.getElementsContainingOwnText("Hello").size() > 0);
    }

    @Test
    public void testGetElementsMatchingTextPattern() {
        Document doc = Jsoup.parse("<div><p>abc123</p></div>");
        assertTrue(doc.getElementsMatchingText(Pattern.compile("\\d+")).size() > 0);
    }

    @Test
    public void testGetElementsMatchingTextRegexValid() {
        Document doc = Jsoup.parse("<div><p>abc123</p></div>");
        assertTrue(doc.getElementsMatchingText("\\d+").size() > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingTextRegexInvalidThrows() {
        Jsoup.parse("<div><p>abc123</p></div>").getElementsMatchingText("[");
    }

    @Test
    public void testGetElementsMatchingOwnTextPattern() {
        Document doc = Jsoup.parse("<p>abc123<b>456</b></p>");
        assertTrue(doc.getElementsMatchingOwnText(Pattern.compile("abc\\d+")).size() > 0);
    }

    @Test
    public void testGetElementsMatchingOwnTextRegexValid() {
        Document doc = Jsoup.parse("<p>abc123<b>456</b></p>");
        assertTrue(doc.getElementsMatchingOwnText("abc\\d+").size() > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingOwnTextRegexInvalidThrows() {
        Jsoup.parse("<p>abc</p>").getElementsMatchingOwnText("[");
    }

    @Test
    public void testGetAllElements() {
        Document doc = Jsoup.parse("<div><p>1</p><span>2</span></div>");
        assertTrue(doc.getAllElements().size() >= 3);
    }

    // ---------- text() / ownText() ----------

    @Test
    public void testTextCombinesChildren() {
        Document doc = Jsoup.parse("<p>One <span>Two</span> Three <br> Four</p>");
        Element p = doc.select("p").first();
        assertEquals("One Two Three Four", p.text());
    }

    @Test
    public void testOwnTextExcludesChildren() {
        Document doc = Jsoup.parse("<p>One <span>Two</span> Three <br> Four</p>");
        Element p = doc.select("p").first();
        assertEquals("One Three Four", p.ownText());
    }

    @Test
    public void testTextEmptyWhenNoText() {
        assertEquals("", new Element("div").text());
    }

    // ---------- hasText ----------

    @Test
    public void testHasTextTrue() {
        Document doc = Jsoup.parse("<div><p>Hello</p></div>");
        assertTrue(doc.select("div").first().hasText());
    }

    @Test
    public void testHasTextFalseWhenBlank() {
        Document doc = Jsoup.parse("<div><p>   </p></div>");
        assertFalse(doc.select("div").first().hasText());
    }

    @Test
    public void testHasTextFalseWhenEmpty() {
        assertFalse(new Element("div").hasText());
    }

    // ---------- data() ----------

    @Test
    public void testDataFromScriptDataNode() {
        Document doc = Jsoup.parse("<script>var a = 1;</script>");
        Element script = doc.select("script").first();
        assertTrue(script.data().contains("var a = 1;"));
    }

    @Test
    public void testDataWithCommentAndNestedElement() {
        Element parent = new Element("div");
        parent.appendChild(new Comment(" a comment ", ""));
        Element child = new Element("div");
        child.appendChild(new DataNode("inner-data", ""));
        parent.appendChild(child);
        String data = parent.data();
        assertTrue(data.contains(" a comment "));
        assertTrue(data.contains("inner-data"));
    }

    // ---------- className / classNames ----------

    @Test
    public void testClassNameEmptyWhenNotSet() {
        assertEquals("", new Element("div").className());
    }

    @Test
    public void testClassNameTrimmed() {
        Element el = new Element("div");
        el.attr("class", " header gray ");
        assertEquals("header gray", el.className());
    }

    @Test
    public void testClassNamesParsesMultiple() {
        Element el = new Element("div");
        el.attr("class", "header gray");
        Set<String> names = el.classNames();
        assertEquals(2, names.size());
        assertTrue(names.contains("header"));
        assertTrue(names.contains("gray"));
    }

    @Test
    public void testClassNamesEmptyWhenNoClassAttr() {
        assertEquals(0, new Element("div").classNames().size());
    }

    @Test
    public void testClassNamesSetterUpdatesAttribute() {
        Element el = new Element("div");
        Set<String> names = new LinkedHashSet<String>();
        names.add("a");
        names.add("b");
        Element same = el.classNames(names);
        assertSame(el, same);
        assertEquals("a b", el.attr("class"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testClassNamesSetterNullThrows() {
        new Element("div").classNames(null);
    }

    // ---------- hasClass ----------

    @Test
    public void testHasClassEmptyAttrReturnsFalse() {
        assertFalse(new Element("div").hasClass("x"));
    }

    @Test
    public void testHasClassLenLessThanWantLenReturnsFalse() {
        Element el = new Element("div");
        el.attr("class", "a");
        assertFalse(el.hasClass("longclassname"));
    }

    @Test
    public void testHasClassEqualLengthMatch() {
        Element el = new Element("div");
        el.attr("class", "ABC");
        assertTrue(el.hasClass("abc"));
    }

    @Test
    public void testHasClassEqualLengthNoMatch() {
        Element el = new Element("div");
        el.attr("class", "abc");
        assertFalse(el.hasClass("xyz"));
    }

    @Test
    public void testHasClassMultipleClassesMatchFirst() {
        Element el = new Element("div");
        el.attr("class", "first second third");
        assertTrue(el.hasClass("first"));
    }

    @Test
    public void testHasClassMultipleClassesMatchMiddle() {
        Element el = new Element("div");
        el.attr("class", "first second third");
        assertTrue(el.hasClass("second"));
    }

    @Test
    public void testHasClassMultipleClassesMatchLast() {
        Element el = new Element("div");
        el.attr("class", "first second third");
        assertTrue(el.hasClass("third"));
    }

    @Test
    public void testHasClassMultipleClassesNoMatch() {
        Element el = new Element("div");
        el.attr("class", "first second third");
        assertFalse(el.hasClass("fourth"));
    }

    // ---------- addClass / removeClass / toggleClass ----------

    @Test
    public void testAddClass() {
        Element el = new Element("div");
        el.addClass("new-class");
        assertTrue(el.hasClass("new-class"));
    }

    @Test
    public void testRemoveClass() {
        Element el = new Element("div");
        el.attr("class", "a b");
        el.removeClass("a");
        assertFalse(el.hasClass("a"));
        assertTrue(el.hasClass("b"));
    }

    @Test
    public void testToggleClassAddsWhenAbsent() {
        Element el = new Element("div");
        el.toggleClass("x");
        assertTrue(el.hasClass("x"));
    }

    @Test
    public void testToggleClassRemovesWhenPresent() {
        Element el = new Element("div");
        el.attr("class", "x");
        el.toggleClass("x");
        assertFalse(el.hasClass("x"));
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
        el.text("hello");
        assertEquals("hello", el.val());
    }

    @Test
    public void testValSetterInput() {
        Element el = new Element("input");
        el.val("abc");
        assertEquals("abc", el.attr("value"));
    }

    @Test
    public void testValSetterTextarea() {
        Element el = new Element("textarea");
        el.val("abc");
        assertEquals("abc", el.text());
    }

    // ---------- html() ----------

    @Test
    public void testHtmlGetter() {
        Document doc = Jsoup.parse("<div><p></p></div>");
        assertTrue(doc.select("div").first().html().contains("<p>"));
    }

    @Test
    public void testHtmlSetter() {
        Element el = new Element("div");
        Element same = el.html("<p>Hello</p>");
        assertSame(el, same);
        assertEquals(1, el.children().size());
        assertEquals("p", el.child(0).tagName());
    }

    // ---------- toString ----------

    @Test
    public void testToStringReturnsOuterHtml() {
        Element el = new Element("div");
        el.text("hi");
        assertEquals(el.outerHtml(), el.toString());
    }

    // ---------- clone ----------

    @Test
    public void testCloneCreatesIndependentCopy() {
        Element el = new Element("div");
        el.attr("id", "x");
        el.appendChild(new Element("p"));
        Element cloned = el.clone();
        assertEquals(el.tagName(), cloned.tagName());
        assertEquals(el.id(), cloned.id());
        assertNotSame(el, cloned);
        cloned.attr("id", "y");
        assertEquals("x", el.id()); // original ต้องไม่ถูกกระทบ
    }
}
