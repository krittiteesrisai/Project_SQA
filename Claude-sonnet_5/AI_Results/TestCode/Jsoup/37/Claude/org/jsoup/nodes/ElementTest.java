package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.DataNode;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class ElementTest {

    // ---------- Constructor ----------

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullTagThrows() {
        new Element(null, "http://example.com");
    }

    @Test
    public void testConstructorBasic() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com/");
        assertEquals("div", el.tagName());
        assertEquals("http://example.com/", el.baseUri());
    }

    // ---------- tagName ----------

    @Test
    public void testTagNameGetterSetter() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertEquals("div", el.tagName());
        el.tagName("span");
        assertEquals("span", el.tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameSetterEmptyThrows() {
        new Element(Tag.valueOf("div"), "").tagName("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameSetterNullThrows() {
        new Element(Tag.valueOf("div"), "").tagName(null);
    }

    // ---------- tag()/isBlock ----------

    @Test
    public void testTagAndIsBlock() {
        Element div = new Element(Tag.valueOf("div"), "");
        assertTrue(div.isBlock());
        Element span = new Element(Tag.valueOf("span"), "");
        assertFalse(span.isBlock());
    }

    // ---------- id() ----------

    @Test
    public void testIdPresent() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("id", "main");
        assertEquals("main", el.id());
    }

    @Test
    public void testIdAbsent() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertEquals("", el.id());
    }

    // ---------- attr chaining ----------

    @Test
    public void testAttrChaining() {
        Element el = new Element(Tag.valueOf("div"), "");
        Element returned = el.attr("data-x", "1");
        assertSame(el, returned);
        assertEquals("1", el.attr("data-x"));
    }

    // ---------- dataset ----------

    @Test
    public void testDataset() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("data-name", "jsoup");
        el.attr("class", "test");
        assertEquals("jsoup", el.dataset().get("name"));
        assertFalse(el.dataset().containsKey("class"));
    }

    // ---------- parent / parents ----------

    @Test
    public void testParentNullForStandalone() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertNull(el.parent());
    }

    @Test
    public void testParentsExcludesRoot() {
        Document doc = Jsoup.parse("<html><body><div id=d><p id=p>Text</p></div></body></html>");
        Element p = doc.getElementById("p");
        Elements parents = p.parents();
        for (Element parent : parents) {
            assertFalse(parent.tagName().equals("#root"));
        }
        assertTrue(parents.size() > 0);
    }

    // ---------- child / children ----------

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildOutOfBounds() {
        new Element(Tag.valueOf("div"), "").child(0);
    }

    @Test
    public void testChildAndChildren() {
        Document doc = Jsoup.parse("<div>Text<span>A</span><b>B</b></div>");
        Element div = doc.select("div").first();
        Elements children = div.children();
        assertEquals(2, children.size());
        assertEquals("span", div.child(0).tagName());
        assertEquals("b", div.child(1).tagName());
    }

    @Test
    public void testChildrenEmpty() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertEquals(0, el.children().size());
    }

    // ---------- textNodes / dataNodes ----------

    @Test
    public void testTextNodes() {
        Document doc = Jsoup.parse("<p>Hello <b>world</b></p>");
        Element p = doc.select("p").first();
        List<TextNode> textNodes = p.textNodes();
        assertEquals(1, textNodes.size());
        assertEquals("Hello ", textNodes.get(0).text());
    }

    @Test
    public void testDataNodes() {
        Document doc = Jsoup.parse("<script>var a = 1;</script>");
        Element script = doc.select("script").first();
        List<DataNode> dataNodes = script.dataNodes();
        assertEquals(1, dataNodes.size());
    }

    @Test
    public void testDataNodesEmpty() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertEquals(0, el.dataNodes().size());
    }

    // ---------- select ----------

    @Test
    public void testSelect() {
        Document doc = Jsoup.parse("<div><p class=x>A</p><p>B</p></div>");
        assertEquals(1, doc.select("p.x").size());
    }

    // ---------- appendChild / prependChild ----------

    @Test(expected = IllegalArgumentException.class)
    public void testAppendChildNullThrows() {
        new Element(Tag.valueOf("div"), "").appendChild(null);
    }

    @Test
    public void testAppendChild() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.appendChild(new TextNode("hello", ""));
        assertEquals(1, parent.childNodes().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrependChildNullThrows() {
        new Element(Tag.valueOf("div"), "").prependChild(null);
    }

    @Test
    public void testPrependChild() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.appendChild(new TextNode("B", ""));
        parent.prependChild(new TextNode("A", ""));
        assertEquals("AB", parent.text());
    }

    // ---------- insertChildren ----------

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenNullCollectionThrows() {
        new Element(Tag.valueOf("div"), "").insertChildren(0, null);
    }

    @Test
    public void testInsertChildrenNegativeIndexRollsAround() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.appendChild(new TextNode("A", ""));
        List<Node> nodes = new ArrayList<Node>();
        nodes.add(new TextNode("B", ""));
        parent.insertChildren(-1, nodes); // -1 => insert at end
        assertEquals("AB", parent.text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenOutOfBoundsThrows() {
        Element parent = new Element(Tag.valueOf("div"), "");
        List<Node> nodes = new ArrayList<Node>();
        nodes.add(new TextNode("B", ""));
        parent.insertChildren(5, nodes); // empty parent, out of bounds
    }

    // ---------- appendElement / prependElement ----------

    @Test
    public void testAppendElement() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = parent.appendElement("span");
        assertEquals("span", child.tagName());
        assertEquals(1, parent.children().size());
    }

    @Test
    public void testPrependElement() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.appendElement("b");
        parent.prependElement("span");
        assertEquals("span", parent.child(0).tagName());
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
    public void testAppendHtmlNullThrows() {
        new Element(Tag.valueOf("div"), "").append(null);
    }

    @Test
    public void testAppendHtml() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.append("<p>Hi</p>");
        assertEquals(1, el.children().size());
        assertEquals("p", el.child(0).tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrependHtmlNullThrows() {
        new Element(Tag.valueOf("div"), "").prepend(null);
    }

    @Test
    public void testPrependHtml() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.append("<p>Second</p>");
        el.prepend("<p>First</p>");
        assertEquals("First", el.child(0).text());
    }

    // ---------- before / after ----------

    @Test
    public void testBeforeHtml() {
        Document doc = Jsoup.parse("<div><p id=target>Mid</p></div>");
        Element p = doc.getElementById("target");
        p.before("<span>Before</span>");
        Elements siblings = p.parent().children();
        assertEquals("span", siblings.get(0).tagName());
    }

    @Test
    public void testAfterHtml() {
        Document doc = Jsoup.parse("<div><p id=target>Mid</p></div>");
        Element p = doc.getElementById("target");
        p.after("<span>After</span>");
        Elements siblings = p.parent().children();
        assertEquals("span", siblings.get(1).tagName());
    }

    @Test
    public void testBeforeNode() {
        Document doc = Jsoup.parse("<div><p id=target>Mid</p></div>");
        Element p = doc.getElementById("target");
        p.before(new TextNode("X", doc.baseUri()));
        assertTrue(p.parent().html().startsWith("X"));
    }

    @Test
    public void testAfterNode() {
        Document doc = Jsoup.parse("<div><p id=target>Mid</p></div>");
        Element p = doc.getElementById("target");
        p.after(new TextNode("Y", doc.baseUri()));
        assertTrue(p.parent().html().endsWith("Y"));
    }

    // ---------- empty ----------

    @Test
    public void testEmpty() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.appendChild(new TextNode("X", ""));
        assertEquals(1, el.childNodes().size());
        el.empty();
        assertEquals(0, el.childNodes().size());
    }

    // ---------- wrap ----------

    @Test
    public void testWrap() {
        Document doc = Jsoup.parse("<p>Text</p>");
        Element p = doc.select("p").first();
        p.wrap("<div class=wrapper></div>");
        assertEquals("wrapper", p.parent().className());
    }

    // ---------- siblingElements ----------

    @Test
    public void testSiblingElementsNoParent() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertEquals(0, el.siblingElements().size());
    }

    @Test
    public void testSiblingElementsWithParent() {
        Document doc = Jsoup.parse("<div><p id=a>A</p><p id=b>B</p><p id=c>C</p></div>");
        Element b = doc.getElementById("b");
        Elements siblings = b.siblingElements();
        assertEquals(2, siblings.size());
        for (Element s : siblings) assertNotSame(b, s);
    }

    // ---------- nextElementSibling ----------

    @Test
    public void testNextElementSiblingNoParent() {
        assertNull(new Element(Tag.valueOf("div"), "").nextElementSibling());
    }

    @Test
    public void testNextElementSiblingHasNext() {
        Document doc = Jsoup.parse("<div><p id=a>A</p><p id=b>B</p></div>");
        Element a = doc.getElementById("a");
        Element next = a.nextElementSibling();
        assertNotNull(next);
        assertEquals("b", next.id());
    }

    @Test
    public void testNextElementSiblingIsLast() {
        Document doc = Jsoup.parse("<div><p id=a>A</p><p id=b>B</p></div>");
        Element b = doc.getElementById("b");
        assertNull(b.nextElementSibling());
    }

    // ---------- previousElementSibling ----------

    @Test
    public void testPreviousElementSiblingNoParent() {
        assertNull(new Element(Tag.valueOf("div"), "").previousElementSibling());
    }

    @Test
    public void testPreviousElementSiblingIsFirst() {
        Document doc = Jsoup.parse("<div><p id=a>A</p><p id=b>B</p></div>");
        Element a = doc.getElementById("a");
        assertNull(a.previousElementSibling());
    }

    @Test
    public void testPreviousElementSiblingHasPrev() {
        Document doc = Jsoup.parse("<div><p id=a>A</p><p id=b>B</p></div>");
        Element b = doc.getElementById("b");
        Element prev = b.previousElementSibling();
        assertNotNull(prev);
        assertEquals("a", prev.id());
    }

    // ---------- firstElementSibling / lastElementSibling ----------

    @Test
    public void testFirstElementSiblingSingleReturnsNull() {
        Document doc = Jsoup.parse("<div><p id=a>Only</p></div>");
        assertNull(doc.getElementById("a").firstElementSibling());
    }

    @Test
    public void testFirstElementSiblingMultiple() {
        Document doc = Jsoup.parse("<div><p id=a>A</p><p id=b>B</p></div>");
        Element first = doc.getElementById("b").firstElementSibling();
        assertNotNull(first);
        assertEquals("a", first.id());
    }

    // ซอร์สโค้ดไม่เช็ค parentNode==null ก่อนเรียก parent().children()
    // -> ถ้า standalone element ไม่มี parent จะได้ NullPointerException (อาจเป็น fault จริง)
    @Test(expected = NullPointerException.class)
    public void testFirstElementSiblingNoParentThrowsNPE() {
        new Element(Tag.valueOf("div"), "").firstElementSibling();
    }

    @Test
    public void testLastElementSiblingSingleReturnsNull() {
        Document doc = Jsoup.parse("<div><p id=a>Only</p></div>");
        assertNull(doc.getElementById("a").lastElementSibling());
    }

    @Test
    public void testLastElementSiblingMultiple() {
        Document doc = Jsoup.parse("<div><p id=a>A</p><p id=b>B</p></div>");
        Element last = doc.getElementById("a").lastElementSibling();
        assertNotNull(last);
        assertEquals("b", last.id());
    }

    @Test(expected = NullPointerException.class)
    public void testLastElementSiblingNoParentThrowsNPE() {
        new Element(Tag.valueOf("div"), "").lastElementSibling();
    }

    // ---------- elementSiblingIndex ----------

    @Test
    public void testElementSiblingIndexNoParent() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertEquals(Integer.valueOf(0), el.elementSiblingIndex());
    }

    @Test
    public void testElementSiblingIndexWithParent() {
        Document doc = Jsoup.parse("<div><p id=a>A</p><p id=b>B</p><p id=c>C</p></div>");
        assertEquals(Integer.valueOf(2), doc.getElementById("c").elementSiblingIndex());
    }

    // ---------- getElementsByTag ----------

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByTagEmptyThrows() {
        new Element(Tag.valueOf("div"), "").getElementsByTag("");
    }

    @Test
    public void testGetElementsByTag() {
        Document doc = Jsoup.parse("<div><P>A</P><p>B</p></div>");
        assertEquals(2, doc.getElementsByTag("P").size());
    }

    // ---------- getElementById ----------

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementByIdEmptyThrows() {
        new Element(Tag.valueOf("div"), "").getElementById("");
    }

    @Test
    public void testGetElementByIdFound() {
        Document doc = Jsoup.parse("<div id=main>Content</div>");
        assertNotNull(doc.getElementById("main"));
    }

    @Test
    public void testGetElementByIdNotFound() {
        Document doc = Jsoup.parse("<div>Content</div>");
        assertNull(doc.getElementById("missing"));
    }

    // ---------- getElementsByClass / Attribute family ----------

    @Test
    public void testGetElementsByClass() {
        Document doc = Jsoup.parse("<div class='a b'>X</div><p class=a>Y</p>");
        assertEquals(2, doc.getElementsByClass("a").size());
    }

    @Test
    public void testGetElementsByAttribute() {
        Document doc = Jsoup.parse("<a href=x>1</a><p>2</p>");
        assertEquals(1, doc.getElementsByAttribute("href").size());
    }

    @Test
    public void testGetElementsByAttributeStarting() {
        Document doc = Jsoup.parse("<div data-foo=1>A</div><p>B</p>");
        assertEquals(1, doc.getElementsByAttributeStarting("data-").size());
    }

    @Test
    public void testGetElementsByAttributeValue() {
        Document doc = Jsoup.parse("<a href=x>1</a><a href=y>2</a>");
        assertEquals(1, doc.getElementsByAttributeValue("href", "x").size());
    }

    @Test
    public void testGetElementsByAttributeValueNot() {
        Document doc = Jsoup.parse("<a href=x>1</a><a href=y>2</a>");
        assertEquals(1, doc.getElementsByAttributeValueNot("href", "x").size());
    }

    @Test
    public void testGetElementsByAttributeValueStarting() {
        Document doc = Jsoup.parse("<a href=xyz>1</a><a href=abc>2</a>");
        assertEquals(1, doc.getElementsByAttributeValueStarting("href", "xy").size());
    }

    @Test
    public void testGetElementsByAttributeValueEnding() {
        Document doc = Jsoup.parse("<a href=xyz>1</a><a href=abc>2</a>");
        assertEquals(1, doc.getElementsByAttributeValueEnding("href", "yz").size());
    }

    @Test
    public void testGetElementsByAttributeValueContaining() {
        Document doc = Jsoup.parse("<a href=xyz>1</a><a href=abc>2</a>");
        assertEquals(1, doc.getElementsByAttributeValueContaining("href", "y").size());
    }

    @Test
    public void testGetElementsByAttributeValueMatchingPattern() {
        Document doc = Jsoup.parse("<a href=123>1</a><a href=abc>2</a>");
        assertEquals(1, doc.getElementsByAttributeValueMatching("href", Pattern.compile("\\d+")).size());
    }

    @Test
    public void testGetElementsByAttributeValueMatchingStringValid() {
        Document doc = Jsoup.parse("<a href=123>1</a><a href=abc>2</a>");
        assertEquals(1, doc.getElementsByAttributeValueMatching("href", "\\d+").size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueMatchingStringInvalidThrows() {
        Jsoup.parse("<a href=123>1</a>").getElementsByAttributeValueMatching("href", "[");
    }

    // ---------- getElementsByIndex* ----------

    @Test
    public void testGetElementsByIndexLessThan() {
        Document doc = Jsoup.parse("<div><p>0</p><p>1</p><p>2</p></div>");
        assertTrue(doc.select("div").first().getElementsByIndexLessThan(1).size() >= 1);
    }

    @Test
    public void testGetElementsByIndexGreaterThan() {
        Document doc = Jsoup.parse("<div><p>0</p><p>1</p><p>2</p></div>");
        assertTrue(doc.select("div").first().getElementsByIndexGreaterThan(1).size() >= 1);
    }

    @Test
    public void testGetElementsByIndexEquals() {
        Document doc = Jsoup.parse("<div><p>0</p><p>1</p><p>2</p></div>");
        assertTrue(doc.select("div").first().getElementsByIndexEquals(1).size() >= 1);
    }

    // ---------- getElementsContainingText / OwnText ----------

    @Test
    public void testGetElementsContainingText() {
        assertTrue(Jsoup.parse("<p>Hello World</p>").getElementsContainingText("World").size() > 0);
    }

    @Test
    public void testGetElementsContainingOwnText() {
        assertTrue(Jsoup.parse("<p>Hello <b>World</b></p>").getElementsContainingOwnText("Hello").size() > 0);
    }

    // ---------- getElementsMatchingText / OwnText ----------

    @Test
    public void testGetElementsMatchingTextPattern() {
        assertTrue(Jsoup.parse("<p>Hello123</p>").getElementsMatchingText(Pattern.compile("\\d+")).size() > 0);
    }

    @Test
    public void testGetElementsMatchingTextStringValid() {
        assertTrue(Jsoup.parse("<p>Hello123</p>").getElementsMatchingText("\\d+").size() > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingTextStringInvalidThrows() {
        Jsoup.parse("<p>Hello</p>").getElementsMatchingText("[");
    }

    @Test
    public void testGetElementsMatchingOwnTextPattern() {
        assertTrue(Jsoup.parse("<p>Hello123</p>").getElementsMatchingOwnText(Pattern.compile("\\d+")).size() > 0);
    }

    @Test
    public void testGetElementsMatchingOwnTextStringValid() {
        assertTrue(Jsoup.parse("<p>Hello123</p>").getElementsMatchingOwnText("\\d+").size() > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingOwnTextStringInvalidThrows() {
        Jsoup.parse("<p>Hello</p>").getElementsMatchingOwnText("[");
    }

    // ---------- getAllElements ----------

    @Test
    public void testGetAllElements() {
        Document doc = Jsoup.parse("<div><p>A</p><span>B</span></div>");
        assertEquals(3, doc.select("div").first().getAllElements().size());
    }

    // ---------- text() ----------

    @Test
    public void testTextCombined() {
        // ตัวอย่างตรงจาก javadoc ของ Element#textNodes()
        Document doc = Jsoup.parse("<p>One <span>Two</span> Three <br> Four</p>");
        assertEquals("One Two Three Four", doc.select("p").first().text());
    }

    @Test
    public void testTextEmpty() {
        assertEquals("", new Element(Tag.valueOf("div"), "").text());
    }

    // ---------- ownText() ----------

    @Test
    public void testOwnTextExcludesChildren() {
        Document doc = Jsoup.parse("<p>One <span>Two</span> Three <br> Four</p>");
        assertEquals("One Three Four", doc.select("p").first().ownText());
    }

    // ---------- hasText() ----------

    @Test
    public void testHasTextTrueDirect() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.appendText("Hello");
        assertTrue(el.hasText());
    }

    @Test
    public void testHasTextFalseBlank() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.appendText("   ");
        assertFalse(el.hasText());
    }

    @Test
    public void testHasTextNestedElementTrue() {
        Document doc = Jsoup.parse("<div><p><b>Hi</b></p></div>");
        assertTrue(doc.select("div").first().hasText());
    }

    @Test
    public void testHasTextNestedElementFalse() {
        Document doc = Jsoup.parse("<div><p></p></div>");
        assertFalse(doc.select("div").first().hasText());
    }

    // ---------- data() ----------

    @Test
    public void testDataFromScript() {
        Document doc = Jsoup.parse("<script>var x=1;</script>");
        assertEquals("var x=1;", doc.select("script").first().data());
    }

    @Test
    public void testDataNestedElement() {
        Document doc = Jsoup.parse("<div><script>abc</script></div>");
        assertEquals("abc", doc.select("div").first().data());
    }

    // ---------- className / classNames ----------

    @Test
    public void testClassNameEmpty() {
        assertEquals("", new Element(Tag.valueOf("div"), "").className());
    }

    @Test
    public void testClassNamesMultiple() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("class", "foo bar");
        Set<String> names = el.classNames();
        assertEquals(2, names.size());
        assertTrue(names.contains("foo"));
        assertTrue(names.contains("bar"));
    }

    @Test
    public void testClassNamesSetter() {
        Element el = new Element(Tag.valueOf("div"), "");
        Set<String> names = new LinkedHashSet<String>();
        names.add("x");
        names.add("y");
        el.classNames(names);
        assertEquals("x y", el.className());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testClassNamesSetterNullThrows() {
        new Element(Tag.valueOf("div"), "").classNames(null);
    }

    // ---------- hasClass ----------

    @Test
    public void testHasClassTrueCaseInsensitive() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("class", "Foo");
        assertTrue(el.hasClass("foo"));
    }

    @Test
    public void testHasClassFalse() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("class", "foo");
        assertFalse(el.hasClass("bar"));
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

    // ---------- val() / val(String) ----------

    @Test
    public void testValInputAttribute() {
        Element input = new Element(Tag.valueOf("input"), "");
        input.attr("value", "hello");
        assertEquals("hello", input.val());
    }

    @Test
    public void testValTextareaUsesText() {
        Element textarea = new Element(Tag.valueOf("textarea"), "");
        textarea.text("content");
        assertEquals("content", textarea.val());
    }

    @Test
    public void testValSetterInput() {
        Element input = new Element(Tag.valueOf("input"), "");
        input.val("myvalue");
        assertEquals("myvalue", input.attr("value"));
    }

    @Test
    public void testValSetterTextarea() {
        Element textarea = new Element(Tag.valueOf("textarea"), "");
        textarea.val("mytext");
        assertEquals("mytext", textarea.text());
    }

    // ---------- html() / html(String) ----------

    @Test
    public void testHtmlGetter() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.appendChild(new Element(Tag.valueOf("p"), ""));
        assertTrue(el.html().contains("<p>"));
    }

    @Test
    public void testHtmlSetter() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.appendChild(new TextNode("Old", ""));
        el.html("<p>New</p>");
        assertEquals(1, el.children().size());
        assertEquals("p", el.child(0).tagName());
    }

    // ---------- toString ----------

    @Test
    public void testToString() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("id", "x");
        assertTrue(el.toString().contains("div"));
    }

    // ---------- equals / hashCode ----------

    @Test
    public void testEqualsSameReference() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertTrue(el.equals(el));
    }

    @Test
    public void testEqualsDifferentInstances() {
        Element a = new Element(Tag.valueOf("div"), "");
        Element b = new Element(Tag.valueOf("div"), "");
        assertFalse(a.equals(b));
    }

    @Test
    public void testHashCodeConsistent() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertEquals(el.hashCode(), el.hashCode());
    }

    // ---------- clone() ----------

    @Test
    public void testCloneIndependentClassNames() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("class", "foo bar");
        el.classNames(); // populate cache
        Element clone = el.clone();
        assertNotSame(el, clone);
        assertEquals(el.className(), clone.className());
        assertNotSame(el.classNames(), clone.classNames());
    }
}
