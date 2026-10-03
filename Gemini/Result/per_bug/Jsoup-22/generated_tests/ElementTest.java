package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class ElementTest {

    @Test
    public void testTagNameAndCreation() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertEquals("div", el.tagName());
        assertEquals("div", el.nodeName());
        assertFalse(el.isBlock()); // div in Jsoup default tag definition or check tag properties

        el.tagName("span");
        assertEquals("span", el.tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameEmptyValidation() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.tagName("");
    }

    @Test
    public void testIdAndAttributes() {
        Element el = new Element(Tag.valueOf("p"), "http://example.com");
        assertEquals("", el.id());

        el.attr("id", "my-id");
        assertEquals("my-id", el.id());

        el.attr("id", null);
        assertEquals("", el.id());
    }

    @Test
    public void testDataset() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.attr("data-test", "value");
        assertEquals("value", el.dataset().get("test"));
    }

    @Test
    public void testParentsAndHierarchy() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child = new Element(Tag.valueOf("span"), "http://example.com");

        root.appendChild(parent);
        parent.appendChild(child);

        assertSame(parent, child.parent());
        Elements parents = child.parents();
        assertEquals(2, parents.size()); // parent and root (assuming root tag is not #root or handled correctly)
    }

    @Test
    public void testChildrenFilteringAndChildAccess() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        TextNode textNode = new TextNode("Hello", "http://example.com");
        Element childEl = new Element(Tag.valueOf("span"), "http://example.com");

        el.appendChild(textNode);
        el.appendChild(childEl);

        assertEquals(1, el.children().size());
        assertSame(childEl, el.child(0));
        assertEquals(1, el.textNodes().size());
        assertEquals(0, el.dataNodes().size());
    }

    @Test
    public void testAppendPrependHtmlAndText() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.appendText("World");
        el.prependText("Hello ");
        assertEquals("Hello World", el.text());

        el.append("<p>Child HTML</p>");
        assertEquals(1, el.children().size());

        el.prepend("<span>Prepend HTML</span>");
        assertEquals(2, el.children().size());
    }

    @Test
    public void testSiblingNavigationEdges() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element el2 = new Element(Tag.valueOf("p"), "http://example.com");
        Element el3 = new Element(Tag.valueOf("p"), "http://example.com");

        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);

        assertSame(el2, el1.nextElementSibling());
        assertSame(el1, el2.previousElementSibling());
        assertNull(el3.nextElementSibling());
        assertNull(el1.previousElementSibling());

        assertSame(el1, el1.firstElementSibling());
        assertSame(el3, el1.lastElementSibling());
        assertEquals(0, el1.elementSiblingIndex().intValue());
        assertEquals(1, el2.elementSiblingIndex().intValue());
    }

    @Test
    public void testElementSingleSiblingEdge() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        parent.appendChild(el1);

        assertNull(el1.firstElementSibling());
        assertNull(el1.lastElementSibling());
    }

    @Test
    public void testClassManagementAndToggle() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.attr("class", "  foo   BAR  ");

        Set<String> classNames = el.classNames();
        assertTrue(classNames.contains("foo"));
        assertTrue(classNames.contains("BAR"));

        assertTrue(el.hasClass("FOO")); // case-insensitive check
        assertFalse(el.hasClass("baz"));

        el.addClass("baz");
        assertTrue(el.hasClass("baz"));

        el.removeClass("bar"); // case-insensitive remove via set operations or standard
        el.toggleClass("foo"); // present -> remove
        assertFalse(el.hasClass("foo"));

        el.toggleClass("newClass"); // absent -> add
        assertTrue(el.hasClass("newClass"));

        Set<String> newClasses = new HashSet<String>(Arrays.asList("a", "b"));
        el.classNames(newClasses);
        assertEquals(2, el.classNames().size());
    }

    @Test
    public void testFormValHandling() {
        Element input = new Element(Tag.valueOf("input"), "http://example.com");
        input.val("test-value");
        assertEquals("test-value", input.val());

        Element textarea = new Element(Tag.valueOf("textarea"), "http://example.com");
        textarea.val("area-content");
        assertEquals("area-content", textarea.val());
        assertEquals("area-content", textarea.text());
    }

    @Test
    public void testTextExtractionAndOwnText() {
        Element p = new Element(Tag.valueOf("p"), "http://example.com");
        p.appendText("Hello ");
        Element b = new Element(Tag.valueOf("b"), "http://example.com");
        b.appendText("there");
        p.appendChild(b);
        p.appendText(" now!");

        assertEquals("Hello there now!", p.text());
        assertEquals("Hello now!", p.ownText());
        assertTrue(p.hasText());

        Element emptyEl = new Element(Tag.valueOf("div"), "http://example.com");
        assertFalse(emptyEl.hasText());
    }

    @Test
    public void testDataExtraction() {
        Element script = new Element(Tag.valueOf("script"), "http://example.com");
        DataNode dataNode = new DataNode("var x = 1;", "http://example.com");
        script.appendChild(dataNode);

        assertEquals("var x = 1;", script.data());
    }

    @Test
    public void testQuerySelectorsAndFindMethods() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        root.attr("id", "main");
        Element child = new Element(Tag.valueOf("span"), "http://example.com");
        child.attr("class", "item");
        child.attr("data-id", "123");
        root.appendChild(child);

        assertNotNull(root.getElementById("main"));
        assertNull(root.getElementById("non-existent"));

        assertEquals(1, root.getElementsByTag("span").size());
        assertEquals(1, root.getElementsByClass("ITEM").size());
        assertEquals(1, root.getElementsByAttribute("data-id").size());
        assertEquals(1, root.getElementsByAttributeStarting("data-").size());
        assertEquals(1, root.getElementsByAttributeValue("data-id", "123").size());
        assertEquals(1, root.getElementsByAttributeValueNot("data-id", "999").size());
        assertEquals(1, root.getElementsByAttributeValueStarting("data-id", "12").size());
        assertEquals(1, root.getElementsByAttributeValueEnding("data-id", "23").size());
        assertEquals(1, root.getElementsByAttributeValueContaining("data-id", "2").size());
        assertEquals(1, root.getElementsByAttributeValueMatching("data-id", "[0-9]+").size());

        assertEquals(1, root.getElementsByIndexLessThan(5).size());
        assertEquals(0, root.getElementsByIndexGreaterThan(5).size());
        assertEquals(1, root.getElementsByIndexEquals(0).size());

        assertEquals(1, root.getElementsContainingText("123").size());
        assertEquals(0, root.getElementsContainingOwnText("123").size()); // child has it, not own text of root
        assertEquals(1, root.getElementsMatchingText("[0-9]+").size());
        assertEquals(1, root.getElementsMatchingOwnText("").size());
        assertEquals(1, root.getAllElements().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidRegexPatternSyntax() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        root.getElementsByAttributeValueMatching("data-id", "[Unclosed-Bracket");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidRegexPatternSyntaxForText() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        root.getElementsMatchingText("[Unclosed-Bracket");
    }

    @Test
    public void testEmptyAndCloneAndEquals() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.appendText("Content");
        assertFalse(el.childNodes.isEmpty());

        el.empty();
        assertTrue(el.childNodes.isEmpty());

        Element clone = el.clone();
        assertNotNull(clone);
        assertTrue(el.equals(el));
        assertFalse(el.equals(clone)); // equals method returns this == o in Element class implementation

        assertNotNull(el.hashCode());
        assertNotNull(el.toString());
    }
}