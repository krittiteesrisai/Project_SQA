package org.jsoup.nodes;

import org.jsoup.helper.StringUtil;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class ElementTest {

    @Test
    public void testConstructorAndBasicGetters() {
        Element el = new Element("div");
        assertEquals("div", el.tagName());
        assertEquals("div", el.nodeName());
        assertNotNull(el.tag());
        assertFalse(el.isBlock()); // div tag depends on Tag.valueOf, default might be block or inline depending on Jsoup Tag definition
        assertEquals("", el.baseUri());
        assertTrue(el.hasAttributes());
    }

    @Test
    public void testTagNameChange() {
        Element el = new Element("span");
        el.tagName("div");
        assertEquals("div", el.tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameEmptyThrows() {
        Element el = new Element("div");
        el.tagName("");
    }

    @Test
    public void testId() {
        Element el = new Element("div");
        assertEquals("", el.id());
        el.attr("id", "myId");
        assertEquals("myId", el.id());
    }

    @Test
    public void testAttributesAndBooleanAttr() {
        Element el = new Element("div");
        el.attr("hidden", true);
        assertEquals("", el.attr("hidden"));
        
        el.attr("hidden", false);
        assertFalse(el.attributes().hasKey("hidden"));
    }

    @Test
    public void testDataset() {
        Element el = new Element("div");
        el.attr("data-test", "value");
        assertEquals("value", el.dataset().get("test"));
    }

    @Test
    public void testParents() {
        Element root = new Element("div");
        Element child = new Element("span");
        Element grandchild = new Element("a");
        
        root.appendChild(child);
        child.appendChild(grandchild);

        Elements parents = grandchild.parents();
        assertEquals(2, parents.size());
        assertEquals("span", parents.get(0).tagName());
        assertEquals("div", parents.get(1).tagName());
    }

    @Test
    public void testChildAndChildren() {
        Element parent = new Element("div");
        Element c1 = new Element("span");
        TextNode t1 = new TextNode("text");
        Element c2 = new Element("a");

        parent.appendChild(c1);
        parent.appendChild(t1);
        parent.appendChild(c2);

        assertEquals(2, parent.children().size());
        assertEquals("span", parent.child(0).tagName());
        assertEquals("a", parent.child(1).tagName());
        assertEquals(3, parent.childNodeSize());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildOutOfBounds() {
        Element parent = new Element("div");
        parent.child(0);
    }

    @Test
    public void testTextNodesAndDataNodes() {
        Element parent = new Element("div");
        TextNode tn = new TextNode("hello");
        DataNode dn = new DataNode("data");
        parent.appendChild(tn);
        parent.appendChild(dn);

        assertEquals(1, parent.textNodes().size());
        assertEquals(1, parent.dataNodes().size());
        assertEquals("hello", parent.textNodes().get(0).getWholeText());
        assertEquals("data", parent.dataNodes().get(0).getWholeData());
    }

    @Test
    public void testSelectAndIs() {
        Element parent = new Element("div");
        Element child = new Element("span");
        child.attr("class", "item");
        parent.appendChild(child);

        assertTrue(child.is("span"));
        assertTrue(child.is(".item"));
        
        Elements selected = parent.select("span");
        assertEquals(1, selected.size());
        
        Element first = parent.selectFirst(".item");
        assertNotNull(first);
        assertEquals("span", first.tagName());

        Element nullFirst = parent.selectFirst(".nonexistent");
        assertNull(nullFirst);
    }

    @Test
    public void testAppendAndPrependChild() {
        Element parent = new Element("div");
        Element c1 = new Element("span");
        Element c2 = new Element("a");

        parent.appendChild(c1);
        parent.prependChild(c2);

        assertEquals("a", parent.child(0).tagName());
        assertEquals("span", parent.child(1).tagName());
        
        c1.appendTo(parent); // Test appendTo
    }

    @Test
    public void testInsertChildrenCollectionAndArray() {
        Element parent = new Element("div");
        Element c1 = new Element("span");
        Element c2 = new Element("a");
        Element c3 = new Element("p");

        parent.insertChildren(0, Arrays.asList(c1, c2));
        assertEquals(2, parent.childNodeSize());

        // Negative index roll around (-1 -> end)
        parent.insertChildren(-1, c3);
        assertEquals("p", parent.child(2).tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenOutOfBounds() {
        Element parent = new Element("div");
        parent.insertChildren(5, new Element("span"));
    }

    @Test
    public void testAppendAndPrependElementAndText() {
        Element parent = new Element("div");
        parent.appendElement("span").attr("id", "s1");
        parent.prependElement("a").attr("id", "a1");
        parent.appendText("Hello");
        parent.prependText("World");

        assertEquals(4, parent.childNodeSize());
        assertEquals("a1", parent.child(0).id());
        assertEquals("s1", parent.child(3).id());
    }

    @Test
    public void testHtmlFragments() {
        Element parent = new Element("div");
        parent.append("<span>Appended</span>");
        parent.prepend("<span>Prepended</span>");

        assertEquals(2, parent.childNodeSize());
    }

    @Test
    public void testEmptyAndWrapAndClone() {
        Element parent = new Element("div");
        parent.appendElement("span");
        assertFalse(parent.childNodes.isEmpty());
        
        parent.empty();
        assertTrue(parent.childNodes.isEmpty());

        Element el = new Element("div");
        Element cloned = el.clone();
        assertNotNull(cloned);
        
        Element shallow = el.shallowClone();
        assertNotNull(shallow);
        assertEquals(0, shallow.childNodeSize());
    }

    @Test
    public void testCssSelectorBranches() {
        Element withId = new Element("div");
        withId.attr("id", "uniqueId");
        assertEquals("#uniqueId", withId.cssSelector());

        Element withClass = new Element("div");
        withClass.attr("class", "cls1 cls2");
        assertEquals("div.cls1.cls2", withClass.cssSelector());

        Element parent = new Element("div");
        Element child1 = new Element("span");
        Element child2 = new Element("span");
        parent.appendChild(child1);
        parent.appendChild(child2);

        // When parent has multiple matching children, nth-child should be appended
        assertTrue(child2.cssSelector().contains(":nth-child(2)"));
    }

    @Test
    public void testSiblingNavigation() {
        Element parent = new Element("div");
        Element c1 = new Element("span");
        Element c2 = new Element("a");
        Element c3 = new Element("p");
        parent.appendChild(c1);
        parent.appendChild(c2);
        parent.appendChild(c3);

        assertEquals(c2, c1.nextElementSibling());
        assertEquals(c1, c2.previousElementSibling());
        assertNull(c3.nextElementSibling());
        assertNull(c1.previousElementSibling());

        assertEquals(c1, c2.firstElementSibling());
        assertEquals(c3, c2.lastElementSibling());
        assertEquals(1, c2.elementSiblingIndex());

        Element standalone = new Element("div");
        assertNull(standalone.nextElementSibling());
        assertNull(standalone.previousElementSibling());
        assertEquals(0, standalone.elementSiblingIndex());
    }

    @Test
    public void testDomQueryMethods() {
        Element parent = new Element("div");
        Element c1 = new Element("span");
        c1.attr("id", "mySpan");
        c1.attr("class", "myClass");
        c1.attr("data-foo", "bar");
        parent.appendChild(c1);

        assertNotNull(parent.getElementsByTag("span").first());
        assertNotNull(parent.getElementById("mySpan"));
        assertNull(parent.getElementById("nonexistent"));
        assertNotNull(parent.getElementsByClass("myClass").first());
        assertNotNull(parent.getElementsByAttribute("data-foo").first());
        assertNotNull(parent.getElementsByAttributeStarting("data-").first());
        assertNotNull(parent.getElementsByAttributeValue("data-foo", "bar").first());
        assertNotNull(parent.getElementsByAttributeValueNot("data-foo", "notbar").first());
        assertNotNull(parent.getElementsByAttributeValueStarting("data-foo", "ba").first());
        assertNotNull(parent.getElementsByAttributeValueEnding("data-foo", "ar").first());
        assertNotNull(parent.getElementsByAttributeValueContaining("data-foo", "a").first());
        assertNotNull(parent.getElementsByAttributeValueMatching("data-foo", Pattern.compile("b.*")).first());
        assertNotNull(parent.getElementsByAttributeValueMatching("data-foo", "b.*").first());

        assertNotNull(parent.getElementsByIndexLessThan(5).first());
        assertNotNull(parent.getElementsByIndexGreaterThan(-1).first());
        assertNotNull(parent.getElementsByIndexEquals(0).first());

        c1.text("Searchable text here");
        assertNotNull(parent.getElementsContainingText("Searchable").first());
        assertNotNull(parent.getElementsContainingOwnText("Searchable").first());
        assertNotNull(parent.getElementsMatchingText(Pattern.compile("Search.*")).first());
        assertNotNull(parent.getElementsMatchingText("Search.*").first());
        assertNotNull(parent.getElementsMatchingOwnText(Pattern.compile("Search.*")).first());
        assertNotNull(parent.getElementsMatchingOwnText("Search.*").first());
        assertFalse(parent.getAllElements().isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidRegexSyntaxThrows() {
        Element parent = new Element("div");
        parent.getElementsMatchingText("[invalid-regex");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidOwnTextRegexSyntaxThrows() {
        Element parent = new Element("div");
        parent.getElementsMatchingOwnText("[invalid-regex");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidAttributeValueMatchingRegexThrows() {
        Element parent = new Element("div");
        parent.getElementsByAttributeValueMatching("class", "[invalid-regex");
    }

    @Test
    public void testTextAndOwnTextAndHasText() {
        Element p = new Element("p");
        p.text("Hello");
        assertEquals("Hello", p.text());
        assertEquals("Hello", p.ownText());
        assertTrue(p.hasText());

        Element complex = new Element("div");
        complex.appendText("One ");
        Element span = complex.appendElement("span");
        span.text("Two");
        complex.appendText(" Three");
        assertEquals("One Two Three", complex.text());
        assertEquals("One Three", complex.ownText());
    }

    @Test
    public void testDataAndComments() {
        Element script = new Element("script");
        script.appendChild(new DataNode("var i = 0;"));
        script.appendChild(new Comment("comment"));
        Element sub = script.appendElement("div");
        sub.appendChild(new DataNode("subdata"));

        String data = script.data();
        assertTrue(data.contains("var i = 0;"));
        assertTrue(data.contains("comment"));
        assertTrue(data.contains("subdata"));
    }

    @Test
    public void testClassNameOperations() {
        Element el = new Element("div");
        el.attr("class", "  foo   bar  ");
        assertEquals("foo   bar", el.className());
        
        Set<String> names = el.classNames();
        assertEquals(2, names.size());

        el.classNames(new HashSet<>(Arrays.asList("a", "b")));
        assertTrue(el.hasClass("a"));

        el.classNames(Collections.emptySet());
        assertFalse(el.attributes().hasKey("class"));

        el.addClass("newClass");
        assertTrue(el.hasClass("newClass"));

        el.removeClass("newClass");
        assertFalse(el.hasClass("newClass"));

        el.toggleClass("toggled");
        assertTrue(el.hasClass("toggled"));
        el.toggleClass("toggled");
        assertFalse(el.hasClass("toggled"));
    }

    @Test
    public void testHasClassEdgeBranches() {
        Element el = new Element("div");
        // len == 0
        el.attr("class", "");
        assertFalse(el.hasClass("foo"));

        // len < wantLen
        el.attr("class", "a");
        assertFalse(el.hasClass("toolong"));

        // len == wantLen
        el.attr("class", "foo");
        assertTrue(el.hasClass("FOO")); // case insensitive

        // multiple classes & scanning branches
        el.attr("class", "foo bar baz");
        assertTrue(el.hasClass("bar"));
        assertTrue(el.hasClass("baz")); // tests last entry branch
        assertFalse(el.hasClass("notfound"));
    }

    @Test
    public void testFormElementVal() {
        Element input = new Element("input");
        input.val("testValue");
        assertEquals("testValue", input.val());

        Element textarea = new Element("textarea");
        textarea.val("areaValue");
        assertEquals("areaValue", textarea.val());
        assertEquals("areaValue", textarea.text());
    }

    @Test
    public void testToStringAndHtml() {
        Element el = new Element("div");
        el.text("content");
        assertNotNull(el.toString());
        assertNotNull(el.html());
        assertNotNull(el.html(new StringBuilder()));
    }
}