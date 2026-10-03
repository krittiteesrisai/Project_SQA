package org.jsoup.nodes;

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
    public void testConstructorsAndBasics() {
        Element el = new Element("div");
        assertEquals("div", el.tagName());
        assertEquals("div", el.nodeName());
        assertTrue(el.isBlock());

        Element elWithBase = new Element(Tag.valueOf("span"), "http://example.com");
        assertEquals("http://example.com", elWithBase.baseUri());
        assertFalse(elWithBase.isBlock());

        Attributes attrs = new Attributes();
        attrs.put("id", "my-id");
        Element elFull = new Element(Tag.valueOf("p"), "http://example.com", attrs);
        assertEquals("my-id", elFull.id());
        assertTrue(elFull.hasAttributes());
    }

    @Test
    public void testTagNameMutation() {
        Element el = new Element("span");
        el.tagName("div");
        assertEquals("div", el.tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameEmptyThrowsException() {
        Element el = new Element("div");
        el.tagName("");
    }

    @Test
    public void testAttributesAndDataset() {
        Element el = new Element("div");
        el.attr("data-test", "value1");
        el.attr("class", "foo bar");
        
        assertEquals("value1", el.dataset().get("test"));
        assertEquals("foo bar", el.className());
        
        Set<String> classNames = el.classNames();
        assertEquals(2, classNames.size());
        assertTrue(classNames.contains("foo"));
        assertTrue(classNames.contains("bar"));

        el.classNames(new HashSet<>(Arrays.asList("alpha", "beta")));
        assertEquals("alpha beta", el.className());

        el.removeAttr("class");
        assertTrue(el.classNames().isEmpty());
    }

    @Test
    public void testHasClassEdgeCases() {
        Element el = new Element("div");
        
        // len == 0 or len < wantLen
        assertFalse(el.hasClass("foo"));
        el.attr("class", "a");
        assertFalse(el.hasClass("toolong"));

        // len == wantLen
        el.attr("class", "foo");
        assertTrue(el.hasClass("FOO")); // case insensitive
        assertFalse(el.hasClass("bar"));

        // Multiple classes and whitespace scanning logic
        el.attr("class", "  first   second  third  ");
        assertTrue(el.hasClass("first"));
        assertTrue(el.hasClass("SECOND"));
        assertTrue(el.hasClass("third"));
        assertFalse(el.hasClass("sec"));
        assertFalse(el.hasClass("nonexistent"));
        
        // Last entry check
        el.attr("class", "item last");
        assertTrue(el.hasClass("last"));
    }

    @Test
    public void testClassManipulations() {
        Element el = new Element("div").attr("class", "a b");
        el.addClass("c");
        assertTrue(el.hasClass("c"));

        el.removeClass("b");
        assertFalse(el.hasClass("b"));

        el.toggleClass("a"); // present -> remove
        assertFalse(el.hasClass("a"));

        el.toggleClass("a"); // not present -> add
        assertTrue(el.hasClass("a"));
    }

    @Test
    public void testChildNodesAndTraversal() {
        Element parent = new Element("div");
        Element child1 = new Element("span");
        Element child2 = new Element("a");

        parent.appendChild(child1);
        parent.appendChild(child2);

        assertEquals(2, parent.childNodeSize());
        assertEquals(child1, parent.child(0));
        assertEquals(child2, parent.child(1));
        assertEquals(2, parent.children().size());

        // Prepend child
        Element childZero = new Element("b");
        parent.prependChild(childZero);
        assertEquals(childZero, parent.child(0));

        // Sibling navigation
        assertEquals(child1, childZero.nextElementSibling());
        assertEquals(childZero, child1.previousElementSibling());
        assertEquals(childZero, child1.firstElementSibling());
        assertEquals(child2, child1.lastElementSibling());
        assertEquals(0, childZero.elementSiblingIndex());
        assertEquals(1, child1.elementSiblingIndex());

        // Standalone or unattached element sibling checks
        Element orphan = new Element("p");
        assertNull(orphan.nextElementSibling());
        assertNull(orphan.previousElementSibling());
        assertEquals(0, orphan.elementSiblingIndex());
        assertTrue(orphan.siblingElements().isEmpty());
    }

    @Test
    public void testInsertChildren() {
        Element parent = new Element("div");
        parent.appendChild(new Element("p1"));
        parent.appendChild(new Element("p2"));

        // Insert at index 1
        Element inserted = new Element("p-inserted");
        parent.insertChildren(1, inserted);
        assertEquals(inserted, parent.child(1));

        // Insert with negative index (roll around: index = index + currentSize + 1)
        Element negativeIndexEl = new Element("p-neg");
        parent.insertChildren(-1, negativeIndexEl); // -1 + 4 + 1 = 4 (end)
        assertEquals(negativeIndexEl, parent.child(parent.childNodeSize() - 1));

        // Collection insert
        Element c1 = new Element("c1");
        Element c2 = new Element("c2");
        parent.insertChildren(0, Arrays.asList(c1, c2));
        assertEquals(c1, parent.child(0));
        assertEquals(c2, parent.child(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenOutOfBoundsLow() {
        Element parent = new Element("div");
        parent.insertChildren(-100, new Element("p"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenOutOfBoundsHigh() {
        Element parent = new Element("div");
        parent.insertChildren(5, new Element("p"));
    }

    @Test
    public void testFormValHandling() {
        Element input = new Element("input");
        input.val("test-value");
        assertEquals("test-value", input.val());
        assertEquals("test-value", input.attr("value"));

        Element textarea = new Element("textarea");
        textarea.val("area-content");
        assertEquals("area-content", textarea.val());
        assertEquals("area-content", textarea.text());
    }

    @Test
    public void testCssSelector() {
        Element root = new Element("div");
        root.attr("id", "main-id");
        assertEquals("#main-id", root.cssSelector());

        Element child = new Element("span");
        child.addClass("my-class");
        root.appendChild(child);
        
        // Without ID, uses tag and class, checking parent context
        Document doc = new Document("http://example.com");
        doc.appendChild(root);
        
        assertEquals("div#main-id > span.my-class", child.cssSelector());
    }

    @Test
    public void testQueryMethodsAndCollectors() {
        Element root = new Element("div");
        root.attr("id", "container");
        Element child = new Element("a");
        child.attr("href", "http://example.com");
        child.addClass("link-class");
        child.appendText("Click Here");
        root.appendChild(child);

        assertNotNull(root.getElementById("container"));
        assertNull(root.getElementById("non-existent"));

        assertEquals(1, root.getElementsByTag("a").size());
        assertEquals(1, root.getElementsByClass("link-class").size());
        assertEquals(1, root.getElementsByAttribute("href").size());
        assertEquals(1, root.getElementsByAttributeStarting("hr").size());
        assertEquals(1, root.getElementsByAttributeValue("href", "http://example.com").size());
        assertEquals(1, root.getElementsByAttributeValueNot("href", "other").size());
        assertEquals(1, root.getElementsByAttributeValueStarting("href", "http").size());
        assertEquals(1, root.getElementsByAttributeValueEnding("href", "com").size());
        assertEquals(1, root.getElementsByAttributeValueContaining("href", "example").size());
        assertEquals(1, root.getElementsByAttributeValueMatching("href", Pattern.compile("https?://.*")).size());
        assertEquals(1, root.getElementsByAttributeValueMatching("href", "https?://.*").size());

        assertEquals(1, root.getElementsByIndexLessThan(5).size());
        assertEquals(1, root.getElementsByIndexGreaterThan(-1).size());
        assertEquals(1, root.getElementsByIndexEquals(0).size());

        assertEquals(1, root.getElementsContainingText("Click").size());
        assertEquals(1, root.getElementsContainingOwnText("Click").size());
        assertEquals(1, root.getElementsMatchingText(Pattern.compile("Click")).size());
        assertEquals(1, root.getElementsMatchingText("Click").size());
        assertEquals(1, root.getElementsMatchingOwnText(Pattern.compile("Click")).size());
        assertEquals(1, root.getElementsMatchingOwnText("Click").size());
        assertEquals(2, root.getAllElements().size()); // includes root itself + child
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidRegexPatternSyntaxThrowsException() {
        Element root = new Element("div");
        root.getElementsMatchingText("[unclosed-bracket");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidOwnRegexPatternSyntaxThrowsException() {
        Element root = new Element("div");
        root.getElementsMatchingOwnText("[unclosed-bracket");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidAttrRegexPatternSyntaxThrowsException() {
        Element root = new Element("div");
        root.getElementsByAttributeValueMatching("class", "[unclosed-bracket");
    }

    @Test
    public void testTextAndDataOperations() {
        Element p = new Element("p");
        p.appendText("Hello ");
        Element b = new Element("b");
        b.appendText("there");
        p.appendChild(b);
        p.appendText(" now!");

        assertEquals("Hello there now!", p.text());
        assertEquals("Hello now!", p.ownText());
        assertTrue(p.hasText());

        Element emptyEl = new Element("div");
        assertFalse(emptyEl.hasText());

        // Test Data / DataNodes / Comments
        Element script = new Element("script");
        script.appendChild(new DataNode("var i=0;"));
        assertEquals("var i=0;", script.data());

        script.empty();
        assertTrue(script.childNodes.isEmpty());
    }

    @Test
    public void testHtmlManipulationAndCloning() {
        Element el = new Element("div");
        el.html("<p>Child HTML</p>");
        assertEquals("<p>Child HTML</p>", el.html());

        el.prepend("<<span>bad-fragment>?"); // Just verify prepend fragment doesn't crash
        
        Element clone = el.clone();
        assertNotNull(clone);
        assertEquals(el.tagName(), clone.tagName());
        assertEquals(el.childNodeSize(), clone.childNodeSize());
    }
}