package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class ElementTest {

    @Test
    public void testConstructorAndBasicGetters() {
        Tag tag = Tag.valueOf("div");
        Element el = new Element(tag, "http://example.com");
        
        assertEquals("div", el.nodeName());
        assertEquals("div", el.tagName());
        assertFalse(el.isBlock()); // div tag default setting in jsoup depends on tag definition, but let's test tag retrieval
        assertNotNull(el.tag());
        assertEquals("", el.id());
    }

    @Test(expected = IllegalArgumentException.class)
    puid void testTagNameValidationEmpty() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.tagName("");
    }

    @Test
    public void testIdAndAttributes() {
        Element el = new Element(Tag.valueOf("span"), "http://example.com");
        assertEquals("", el.id());

        el.attr("id", "my-id");
        assertEquals("my-id", el.id());

        // Force attribute id to null to test branch in id()
        el.attributes().remove("id");
        el.attributes().put("id", null);
        assertEquals("", el.id());
    }

    @Test
    public void testCssSelectorWithId() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.attr("id", "unique-id");
        assertEquals("#unique-id", el.cssSelector());
    }

    @Test
    public void testCssSelectorComplex() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("p"), "http://example.com");
        child1.addClass("my-class");
        root.appendChild(child1);

        Element child2 = new Element(Tag.valueOf("p"), "http://example.com");
        root.appendChild(child2);

        // Test nth-child branch and classes
        assertEquals("div > p.my-class:nth-child(1)", child1.cssSelector());
        assertEquals("div > p:nth-child(2)", child2.cssSelector());
    }

    @Test
    public void testSiblingNavigationStandalone() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertNull(el.nextElementSibling());
        assertNull(el.previousElementSibling());
        assertEquals(0, el.siblingElements().size());
        assertEquals(0, el.elementSiblingIndex().intValue());
    }

    @Test
    public void testSiblingNavigationWithSiblings() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = parent.appendElement("span");
        Element el2 = parent.appendElement("span");
        Element el3 = parent.appendElement("span");

        assertEquals(el2, el1.nextElementSibling());
        assertNull(el3.nextElementSibling());

        assertEquals(el2, el3.previousElementSibling());
        assertNull(el1.previousElementSibling());

        assertEquals(el1, el1.firstElementSibling());
        assertEquals(el3, el1.lastElementSibling());

        assertEquals(0, el1.elementSiblingIndex().intValue());
        assertEquals(1, el2.elementSiblingIndex().intValue());
        assertEquals(2, el3.elementSiblingIndex().intValue());

        Elements siblings = el2.siblingElements();
        assertEquals(2, siblings.size());
        assertFalse(siblings.contains(el2));
    }

    @Test
    public void testTextAndOwnTextHandling() {
        Element p = new Element(Tag.valueOf("p"), "http://example.com");
        p.appendText("Hello ");
        Element b = p.appendElement("b");
        b.appendText("there");
        p.appendText(" now!");

        assertEquals("Hello there now!", p.text());
        assertEquals("Hello now!", p.ownText());
        assertTrue(p.hasText());

        Element emptyEl = new Element(Tag.valueOf("div"), "http://example.com");
        assertFalse(emptyEl.hasText());
    }

    @Test
    public void testValMethods() {
        Element textarea = new Element(Tag.valueOf("textarea"), "http://example.com");
        textarea.val("initial text");
        assertEquals("initial text", textarea.val());

        Element input = new Element(Tag.valueOf("input"), "http://example.com");
        input.val("input value");
        assertEquals("input value", input.val());
    }

    @Test
    public void testClassManagement() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.addClass("foo");
        el.addClass("bar");
        
        assertTrue(el.hasClass("FOO"));
        assertTrue(el.hasClass("bar"));
        
        Set<String> names = el.classNames();
        assertEquals(2, names.size());

        el.removeClass("foo");
        assertFalse(el.hasClass("foo"));

        el.toggleClass("bar"); // should remove
        assertFalse(el.hasClass("bar"));

        el.toggleClass("bar"); // should add back
        assertTrue(el.hasClass("bar"));

        el.classNames(new HashSet<>(Arrays.asList("class1", "class2")));
        assertEquals("class1 class2", el.className());
    }

    @Test
    public void testDomQueryMethods() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        root.attr("id", "root-id");
        root.addClass("container");
        Element child = root.appendElement("a");
        child.attr("href", "http://example.com");
        child.attr("data-test", "val");
        child.appendText("Click here");

        assertNotNull(root.getElementById("root-id"));
        assertNull(root.getElementById("non-existent"));

        assertEquals(1, root.getElementsByTag("a").size());
        assertEquals(1, root.getElementsByClass("container").size());
        assertEquals(1, root.getElementsByAttribute("href").size());
        assertEquals(1, root.getElementsByAttributeStarting("data-").size());
        assertEquals(1, root.getElementsByAttributeValue("href", "http://example.com").size());
        assertEquals(1, root.getElementsByAttributeValueNot("href", "wrong").size());
        assertEquals(1, root.getElementsByAttributeValueStarting("href", "http").size());
        assertEquals(1, root.getElementsByAttributeValueEnding("href", "com").size());
        assertEquals(1, root.getElementsByAttributeValueContaining("href", "example").size());
        assertEquals(1, root.getElementsByAttributeValueMatching("href", Pattern.compile("https?://.*")).size());
        assertEquals(1, root.getElementsByAttributeValueMatching("href", "https?://.*").size());

        assertEquals(1, root.getElementsByIndexLessThan(5).size());
        assertEquals(0, root.getElementsByIndexGreaterThan(5).size());
        assertEquals(0, root.getElementsByIndexEquals(5).size());

        assertEquals(1, root.getElementsContainingText("Click").size());
        assertEquals(0, root.getElementsContainingOwnText("Click").size()); // child has it, not root directly
        assertEquals(1, root.getElementsMatchingText(Pattern.compile("Click.*")).size());
        assertEquals(1, root.getElementsMatchingText("Click.*").size());
        assertEquals(1, root.getAllElements().size() > 0 ? 1 : 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRegexSyntaxErrorException() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        root.getElementsByAttributeValueMatching("href", "[unclosed-bracket");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTextRegexSyntaxErrorException() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        root.getElementsMatchingText("[unclosed-bracket");
    }

    @Test
    public void testDataAndHtmlManipulation() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.html("<span>content</span>");
        assertTrue(el.html().contains("span"));

        el.empty();
        assertEquals(0, el.childNodeSize());

        el.append("<p>appended</p>");
        el.prepend("<p>prepended</p>");
        assertNotNull(el.child(0));
    }
}