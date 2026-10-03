package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class ElementTest {

    @Test
    public void testIdWhenPresentAndAbsent() {
        Element elWithoutId = new Element(Tag.valueOf("div"), "http://example.com");
        assertEquals("", elWithoutId.id());

        Element elWithId = new Element(Tag.valueOf("div"), "http://example.com");
        elWithId.attr("id", "my-id");
        assertEquals("my-id", elWithId.id());
    }

    @Test
    public void testParentsAccumulation() {
        Element root = new Element(Tag.valueOf("#root"), "http://example.com");
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child = new Element(Tag.valueOf("span"), "http://example.com");

        root.appendChild(parent);
        parent.appendChild(child);

        Elements parents = child.parents();
        // Should include 'parent', but exclude '#root'
        assertEquals(1, parents.size());
        assertEquals("div", parents.get(0.tagName());
    }

    @Test
    public void testValForTextareaAndInput() {
        Element textarea = new Element(Tag.valueOf("textarea"), "http://example.com");
        textarea.val("hello textarea");
        assertEquals("hello textarea", textarea.val());

        Element input = new Element(Tag.valueOf("input"), "http://example.com");
        input.val("hello input");
        assertEquals("hello input", input.val());
        assertEquals("hello input", input.attr("value"));
    }

    @Test
    public void testWrapValidAndEdgeCases() {
        Element el = new Element(Tag.valueOf("span"), "http://example.com");
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        root.appendChild(el);

        // Edge case: wrapping with multiple nodes (remainder handling)
        Element wrapped = el.wrap("<div class='outer'></div><p>remainder</p>");
        assertNotNull(wrapped);
        assertEquals("div", root.child(0).tagName());
        assertTrue(root.html().contains("outer"));
    }

    @Test
    public void testWrapNullOrEmpty() {
        Element el = new Element(Tag.valueOf("span"), "http://example.com");
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        root.appendChild(el);

        // Parsing comment or empty body fragment resulting in null wrap
        Element result = el.wrap("<!-- just a comment -->");
        assertNull(result);
    }

    @Test
    public void testClassNameAndManipulation() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertEquals("", el.className());
        assertTrue(el.classNames().isEmpty());

        el.attr("class", "foo bar baz");
        Set<String> classes = el.classNames();
        assertEquals(3, classes.size());
        assertTrue(el.hasClass("bar"));

        el.removeClass("bar");
        assertFalse(el.hasClass("bar"));

        el.toggleClass("foo"); // Should remove
        assertFalse(el.hasClass("foo"));

        el.toggleClass("foo"); // Should add back
        assertTrue(el.hasClass("foo"));

        Set<String> newClasses = new HashSet<String>();
        newClasses.add("alpha");
        newClasses.add("beta");
        el.classNames(newClasses);
        assertEquals(2, el.classNames().size());
        assertTrue(el.hasClass("alpha"));
    }

    @Test
    public void testTextAndHasTextWithWhitespaceAndChildren() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertFalse(el.hasText());
        assertEquals("", el.text());

        el.appendText("  Hello   World  ");
        assertTrue(el.hasText());
        assertEquals("Hello World", el.text());

        Element child = el.appendElement("span");
        child.text("Inner Text");
        assertTrue(el.hasText());
        assertTrue(el.text().contains("Inner Text"));
    }

    @Test
    public void testDataRetrieval() {
        Element el = new Element(Tag.valueOf("script"), "http://example.com");
        DataNode dataNode = new DataNode("var i = 0;", "http://example.com");
        el.appendChild(dataNode);

        Element childEl = new Element(Tag.valueOf("div"), "http://example.com");
        DataNode nestedData = new DataNode("console.log(i);", "http://example.com");
        childEl.appendChild(nestedData);
        el.appendChild(childEl);

        String data = el.data();
        assertTrue(data.contains("var i = 0;"));
        assertTrue(data.contains("console.log(i);"));
    }

    @Test
    public void testSiblingNavigationMethods() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element first = parent.appendElement("p").attr("id", "p1");
        Element second = parent.appendElement("p").attr("id", "p2");
        Element third = parent.appendElement("p").attr("id", "p3");

        assertEquals(second, first.nextElementSibling());
        assertEquals(first, second.previousElementSibling());
        assertNull(third.nextElementSibling());
        assertNull(first.previousElementSibling());

        assertEquals(first, second.firstElementSibling());
        assertEquals(third, second.lastElementSibling());
        assertEquals(1, second.elementSiblingIndex());
    }

    @Test
    public void testElementQueryMethods() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com").attr("id", "root-id");
        Element child1 = root.appendElement("a").attr("href", "http://example.com").attr("class", "link-cls");
        Element child2 = root.appendElement("div").attr("id", "target-id");

        assertNotNull(root.getElementById("target-id"));
        assertNull(root.getElementById("non-existent"));

        assertEquals(1, root.getElementsByTag("a").size());
        assertEquals(1, root.getElementsByClass("link-cls").size());
        assertEquals(1, root.getElementsByAttribute("href").size());
        assertEquals(1, root.getElementsByAttributeValue("href", "http://example.com").size());
        assertEquals(1, root.getElementsByAttributeValueNot("href", "wrong").size());
        assertEquals(1, root.getElementsByAttributeValueStarting("href", "http").size());
        assertEquals(1, root.getElementsByAttributeValueEnding("href", "com").size());
        assertEquals(1, root.getElementsByAttributeValueContaining("href", "example").size());

        assertEquals(1, root.getElementsByIndexLessThan(2).size());
        assertEquals(1, root.getElementsByIndexGreaterThan(0).size());
        assertEquals(1, root.getElementsByIndexEquals(0).size());
        assertTrue(root.getAllElements().size() >= 3);
    }

    @Test
    public void testEqualsAndHashCodeEdgeCases() {
        Tag divTag = Tag.valueOf("div");
        Tag spanTag = Tag.valueOf("span");

        Element el1 = new Element(divTag, "http://example.com");
        Element el2 = new Element(divTag, "http://example.com");
        Element el3 = new Element(spanTag, "http://example.com");

        assertEquals(el1, el1);
        assertEquals(el1, el2);
        assertEquals(el1.hashCode(), el2.hashCode());

        assertFalse(el1.equals(null));
        assertFalse(el1.equals("some string"));
        assertFalse(el1.equals(el3));
    }

    @Test
    public void testHtmlAndOuterHtmlVariations() {
        Element el = new Element(Tag.valueOf("br"), "http://example.com");
        // Test self-closing tag rendering via outerHtml
        String outer = el.outerHtml();
        assertTrue(outer.contains("br"));

        Element container = new Element(Tag.valueOf("div"), "http://example.com");
        container.html("<p>Hello</p>");
        assertEquals("<p>Hello</p>", container.html());
        
        container.empty();
        assertTrue(container.children().isEmpty());
    }
}