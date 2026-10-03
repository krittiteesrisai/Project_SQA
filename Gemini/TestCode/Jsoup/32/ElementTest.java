package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class ElementTest {

    @Test
    public void testIdEdgeCases() {
        Element elNoId = new Element(Tag.valueOf("div"), "");
        assertEquals("", elNoId.id());

        Element elWithId = new Element(Tag.valueOf("div"), "").attr("id", "my-id");
        assertEquals("my-id", elWithId.id());
    }

    @Test
    public void testTagNameAndChain() {
        Element el = new Element(Tag.valueOf("span"), "http://example.com");
        assertEquals("span", el.tagName());
        assertEquals("span", el.nodeName());

        Element chained = el.tagName("div");
        assertEquals("div", chained.tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameEmptyValidation() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.tagName("");
    }

    @Test
    public void testIsBlock() {
        Element blockEl = new Element(Tag.valueOf("div"), "");
        assertTrue(blockEl.isBlock());

        Element inlineEl = new Element(Tag.valueOf("span"), "");
        assertFalse(inlineEl.isBlock());
    }

    @Test
    public void testParentsAccumulation() {
        Document doc = Document.createShell("http://example.com");
        Element p = doc.body().appendElement("p");
        Element span = p.appendElement("span");

        Elements parents = span.parents();
        // Should contain p and body, but NOT #root (Document root)
        assertEquals(2, parents.size());
        assertEquals("p", parents.get(0).tagName());
        assertEquals("body", parents.get(1).tagName());
    }

    @Test
    public void testChildNavigationAndFilters() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendText("Text node 1");
        Element childEl1 = div.appendElement("span");
        div.appendText("Text node 2");
        Element childEl2 = div.appendElement("a");

        assertEquals(2, div.children().size());
        assertEquals("span", div.child(0).tagName());
        assertEquals("a", div.child(1).tagName());

        assertEquals(2, div.textNodes().size());
        
        div.appendData("console.log('test');");
        // Test data nodes filter
        assertEquals(0, div.dataNodes().size()); // appendData adds text/comment depending on usage, let's use DataNode explicitly if needed:
        div.appendChild(new DataNode("var x=1;", "http://example.com"));
        assertEquals(1, div.dataNodes().size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildIndexOutOfBounds() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.child(0);
    }

    @Test
    public void testInsertChildrenEdgeCases() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element c1 = new Element(Tag.valueOf("span"), "");
        Element c2 = new Element(Tag.valueOf("a"), "");

        // Insert with negative index (roll around)
        div.insertChildren(-1, Arrays.asList(c1));
        assertEquals(1, div.childNodeSize());
        assertEquals(c1, div.child(0));

        // Insert at valid index 0
        div.insertChildren(0, Arrays.asList(c2));
        assertEquals(2, div.childNodeSize());
        assertEquals(c2, div.child(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenNullCollection() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.insertChildren(0, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenOutOfBounds() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.insertChildren(5, Arrays.asList(new Element(Tag.valueOf("span"), "")));
    }

    @Test
    public void testAppendPrependHelpers() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendElement("p").text("Paragraph");
        assertEquals("<p>Paragraph</p>", div.html());

        div.prependElement("span").text("Span");
        assertEquals("<span>Span</span><p>Paragraph</p>", div.html());

        div.appendText(" Appended Text");
        div.prependText("Prepended Text ");
        assertTrue(div.text().contains("Prepended Text"));
    }

    @Test
    public void testFragmentParsingAppendPrepend() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.append("<b>Bold</b>");
        assertEquals("<b>Bold</b>", div.html());

        div.prepend("<i>Italic</i>");
        assertTrue(div.html().startsWith("<i>Italic</i>"));
    }

    @Test
    public void testSiblingNavigationStandalone() {
        Element standalone = new Element(Tag.valueOf("div"), "");
        assertNull(standalone.nextElementSibling());
        assertNull(standalone.previousElementSibling());
        assertNull(standalone.firstElementSibling());
        assertNull(standalone.lastElementSibling());
        assertEquals(Integer.valueOf(0), standalone.elementSiblingIndex());
        assertEquals(0, standalone.siblingElements().size());
    }

    @Test
    public void testSiblingNavigationWithSiblings() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element first = parent.appendElement("p");
        Element second = parent.appendElement("p");
        Element third = parent.appendElement("p");

        assertEquals(second, first.nextElementSibling());
        assertNull(first.previousElementSibling());

        assertEquals(third, second.nextElementSibling());
        assertEquals(first, second.previousElementSibling());

        assertNull(third.nextElementSibling());
        assertEquals(second, third.previousElementSibling());

        assertEquals(first, second.firstElementSibling());
        assertEquals(third, second.lastElementSibling());
        assertEquals(Integer.valueOf(1), second.elementSiblingIndex());
        assertEquals(2, second.siblingElements().size());
    }

    @Test
    public void testFormElementVal() {
        Element input = new Element(Tag.valueOf("input"), "");
        input.val("test-value");
        assertEquals("test-value", input.val());
        assertEquals("test-value", input.attr("value"));

        Element textarea = new Element(Tag.valueOf("textarea"), "");
        textarea.val("textarea-content");
        assertEquals("textarea-content", textarea.val());
        assertEquals("textarea-content", textarea.text());
    }

    @Test
    public void testClassManagement() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.attr("class", "foo bar baz");

        Set<String> classes = div.classNames();
        assertTrue(classes.contains("foo"));
        assertTrue(classes.contains("bar"));

        assertTrue(div.hasClass("FOO")); // Case insensitive check
        assertFalse(div.hasClass("nonexistent"));

        div.addClass("qux");
        assertTrue(div.hasClass("qux"));

        div.removeClass("bar");
        assertFalse(div.hasClass("bar"));

        div.toggleClass("foo"); // Should remove
        assertFalse(div.hasClass("foo"));

        div.toggleClass("foo"); // Should add back
        assertTrue(div.hasClass("foo"));

        div.classNames(new HashSet<String>(Arrays.asList("alpha", "beta")));
        assertEquals(2, div.classNames().size());
    }

    @Test
    public void testTextAndOwnTextWithFormattingAndBr() {
        Element p = new Element(Tag.valueOf("p"), "");
        p.appendText("Hello");
        p.appendElement("b").appendText("there");
        p.appendText("now!");

        assertEquals("Hello there now!", p.text());
        assertEquals("Hello now!", p.ownText());

        Element pWithBr = new Element(Tag.valueOf("p"), "");
        pWithBr.appendText("Line1");
        pWithBr.appendElement("br");
        pWithBr.appendText("Line2");
        assertEquals("Line1 Line2", pWithBr.text());

        assertTrue(p.hasText());
        
        Element emptyEl = new Element(Tag.valueOf("div"), "");
        assertFalse(emptyEl.hasText());
    }

    @Test
    public void testDataMethod() {
        Element script = new Element(Tag.valueOf("script"), "");
        script.appendChild(new DataNode("var a = 1;", ""));
        assertEquals("var a = 1;", script.data());
    }

    @Test
    public void testQuerySelectorsAndGetElementsBy() {
        Element doc = new Element(Tag.valueOf("div"), "").attr("id", "outer");
        Element child = doc.appendElement("span").attr("class", "inner-class").attr("data-test", "val");
        child.attr("id", "inner-id");

        assertNotNull(doc.getElementById("inner-id"));
        assertEquals(1, doc.getElementsByTag("span").size());
        assertEquals(1, doc.getElementsByClass("INNER-CLASS").size());
        assertEquals(1, doc.getElementsByAttribute("data-test").size());
        assertEquals(1, doc.getElementsByAttributeStarting("data-").size());
        assertEquals(1, doc.getElementsByAttributeValue("data-test", "val").size());
        assertEquals(1, doc.getElementsByAttributeValueNot("data-test", "wrong").size());
        assertEquals(1, doc.getElementsByAttributeValueStarting("data-test", "v").size());
        assertEquals(1, doc.getElementsByAttributeValueEnding("data-test", "al").size());
        assertEquals(1, doc.getElementsByAttributeValueContaining("data-test", "a").size());
        assertEquals(1, doc.getElementsByAttributeValueMatching("data-test", "v.*").size());
        
        // Test invalid regex handling for attribute value matching
        try {
            doc.getElementsByAttributeValueMatching("data-test", "[invalid-regex");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Pattern syntax error"));
        }

        assertEquals(1, doc.getElementsByIndexLessThan(5).size());
        assertEquals(0, doc.getElementsByIndexGreaterThan(5).size());
        assertEquals(0, doc.getElementsByIndexEquals(5).size());

        assertEquals(1, doc.getElementsContainingText("val").size());
        assertEquals(1, doc.getElementsContainingOwnText("").size());
        assertEquals(1, doc.getElementsMatchingText("val").size());
        
        try {
            doc.getElementsMatchingText("[invalid-regex");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Pattern syntax error"));
        }

        assertEquals(1, doc.getElementsMatchingOwnText(".*").size());
        try {
            doc.getElementsMatchingOwnText("[invalid-regex");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Pattern syntax error"));
        }

        assertEquals(2, doc.getAllElements().size());
        assertEquals(1, doc.select("span").size());
    }

    @Test
    public void testEmptyAndCloneAndEquals() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendElement("span");
        assertFalse(div.childNodes().isEmpty());

        div.empty();
        assertTrue(div.childNodes().isEmpty());

        Element clone = div.clone();
        assertNotNull(clone);
        assertNotSame(div, clone);

        assertTrue(div.equals(div));
        assertFalse(div.equals(clone)); // equals checks `this == o` in Element class

        assertEquals(div.hashCode(), div.hashCode());
    }
}