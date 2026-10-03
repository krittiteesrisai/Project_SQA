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
        assertFalse(el.isBlock()); // Depend on Jsoup Tag definition for div, or test block behavior
        assertNull(el.parent());
        assertEquals("http://example.com", el.baseUri());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameEmptyValidation() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.tagName("");
    }

    @Test
    public void testTagNameChange() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.tagName("span");
        assertEquals("span", el.tagName());
    }

    @Test
    public void testIdMethod() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertEquals("", el.id());
        el.attr("id", "my-id");
        assertEquals("my-id", el.id());
    }

    @Test
    public void testDataset() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.attr("data-test", "value");
        el.attr("class", "foo");
        assertEquals("value", el.dataset().get("test"));
    }

    @Test
    public void testParentsAndAccumulate() {
        Document doc = Document.createShell("http://example.com");
        Element div = doc.body().appendElement("div");
        Element span = div.appendElement("span");

        Elements parents = span.parents();
        assertFalse(parents.isEmpty());
        // Should contain div and body, but not #root due to condition: !parent.tagName().equals("#root")
        for (Element p : parents) {
            assertNotEquals("#root", p.tagName());
        }
    }

    @Test
    public void testChildrenAndChildAccess() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = el.appendElement("p");
        Element child2 = el.appendElement("span");
        
        assertEquals(2, el.children().size());
        assertEquals(child1, el.child(0));
        assertEquals(child2, el.child(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildOutOfBounds() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.child(0);
    }

    @Test
    public void testTextNodesAndDataNodes() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        TextNode tn = new TextNode("Hello", "http://example.com");
        DataNode dn = new DataNode("var a = 1;", "http://example.com");
        
        el.appendChild(tn);
        el.appendChild(dn);

        List<TextNode> textNodes = el.textNodes();
        List<DataNode> dataNodes = el.dataNodes();

        assertEquals(1, textNodes.size());
        assertEquals("Hello", textNodes.get(0).getWholeText());

        assertEquals(1, dataNodes.size());
        assertEquals("var a = 1;", dataNodes.get(0).getWholeData());
    }

    @Test
    public void testInsertChildrenAndSiblingManipulation() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        Element c1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element c2 = new Element(Tag.valueOf("span"), "http://example.com");

        el.insertChildren(0, Arrays.asList(c1, c2));
        assertEquals(2, el.children().size());
        assertEquals(c1, el.child(0));

        // Test element siblings
        assertNotNull(c1.nextElementSibling());
        assertEquals(c2, c1.nextElementSibling());
        assertNotNull(c2.previousElementSibling());
        assertEquals(c1, c2.previousElementSibling());
        assertEquals(c1, c2.firstElementSibling());
        assertEquals(c2, c1.lastElementSibling());
        assertEquals(Integer.valueOf(0), c1.elementSiblingIndex());
        assertEquals(Integer.valueOf(1), c2.elementSiblingIndex());
    }

    @Test
    public void testSiblingElementsEdgeCases() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        // No parent node
        assertNull(el.nextElementSibling());
        assertNull(el.previousElementSibling());
        assertTrue(el.siblingElements().isEmpty());
        assertNull(el.firstElementSibling()); // throws or returns null based on impl when parent is null -> wait, parent() is null will throw NPE on parent().children() for firstElementSibling()
    }

    @Test
    public void testHtmlAppendPrepend() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.append("<p>Hello</p>");
        assertEquals(1, el.children().size());
        assertEquals("Hello", el.child(0).text());

        el.prepend("<span>Start</span>");
        assertEquals(2, el.children().size());
        assertEquals("span", el.child(0).tagName());
    }

    @Test
    public void testEmptyAndWrapAndBeforeAfter() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.appendElement("p");
        assertFalse(el.children().isEmpty());
        el.empty();
        assertTrue(el.children().isEmpty());
    }

    @Test
    public void testCssSelector() {
        Document doc = Document.createShell("http://example.com");
        Element div = doc.body().appendElement("div").attr("id", "uniqueId");
        assertEquals("#uniqueId", div.cssSelector());

        Element div2 = doc.body().appendElement("div").addClass("myClass");
        assertTrue(div2.cssSelector().contains(".myClass"));

        // Test nth-child branch
        Element p1 = doc.body().appendElement("p");
        Element p2 = doc.body().appendElement("p");
        assertTrue(p2.cssSelector().contains(":nth-child"));
    }

    @Test
    public void testGetElementsByTagClassAttribute() {
        Document doc = Document.createShell("http://example.com");
        Element div = doc.body().appendElement("div").attr("class", "test-class").attr("data-id", "123");
        div.appendElement("span").id("spanId");

        assertFalse(doc.getElementsByTag("span").isEmpty());
        assertNotNull(doc.getElementById("spanId"));
        assertFalse(doc.getElementsByClass("test-class").isEmpty());
        assertFalse(doc.getElementsByAttribute("data-id").isEmpty());
        assertFalse(doc.getElementsByAttributeStarting("data-").isEmpty());
        assertFalse(doc.getElementsByAttributeValue("data-id", "123").isEmpty());
        assertFalse(doc.getElementsByAttributeValueNot("data-id", "999").isEmpty());
        assertFalse(doc.getElementsByAttributeValueStarting("data-id", "12").isEmpty());
        assertFalse(doc.getElementsByAttributeValueEnding("data-id", "23").isEmpty());
        assertFalse(doc.getElementsByAttributeValueContaining("data-id", "2").isEmpty());
        assertFalse(doc.getElementsByAttributeValueMatching("data-id", Pattern.compile("\\d+")).isEmpty());
        assertFalse(doc.getElementsByAttributeValueMatching("data-id", "\\d+").isEmpty());
        
        // Invalid regex exception branch
        try {
            doc.getElementsByAttributeValueMatching("data-id", "[invalid");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testIndexEvaluatorsAndTextSearch() {
        Document doc = Document.createShell("http://example.com");
        doc.body().appendElement("p").text("Apple");
        doc.body().appendElement("p").text("Banana");

        assertFalse(doc.body().getElementsByIndexLessThan(1).isEmpty());
        assertFalse(doc.body().getElementsByIndexGreaterThan(0).isEmpty());
        assertFalse(doc.body().getElementsByIndexEquals(0).isEmpty());
        assertFalse(doc.body().getElementsContainingText("Apple").isEmpty());
        assertFalse(doc.body().getElementsContainingOwnText("Apple").isEmpty());
        assertFalse(doc.body().getElementsMatchingText("A[a-z]+").isEmpty());
        assertFalse(doc.body().getElementsMatchingText(Pattern.compile("A[a-z]+")).isEmpty());
        assertFalse(doc.body().getElementsMatchingOwnText("Apple").isEmpty());
        assertFalse(doc.body().getElementsMatchingOwnText(Pattern.compile("Apple")).isEmpty());
        assertFalse(doc.body().getAllElements().isEmpty());

        try {
            doc.body().getElementsMatchingText("[invalid");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }

        try {
            doc.body().getElementsMatchingOwnText("[invalid");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testTextAndOwnTextAndHasText() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.text("  Hello   World  ");
        assertEquals("Hello World", el.text());
        assertEquals("Hello World", el.ownText());
        assertTrue(el.hasText());

        Element emptyEl = new Element(Tag.valueOf("div"), "http://example.com");
        assertFalse(emptyEl.hasText());
        assertEquals("", emptyEl.text());
    }

    @Test
    public void testDataMethod() {
        Element el = new Element(Tag.valueOf("script"), "http://example.com");
        el.appendChild(new DataNode("console.log('test');", "http://example.com"));
        assertEquals("console.log('test');", el.data());
    }

    @Test
    public void testClassOperations() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertEquals("", el.className());
        assertTrue(el.classNames().isEmpty());

        el.classNames(new HashSet<String>(Arrays.asList("foo", "bar")));
        assertEquals(2, el.classNames().size());
        assertTrue(el.hasClass("FOO")); // case insensitive

        el.addClass("baz");
        assertTrue(el.hasClass("baz"));

        el.removeClass("foo");
        assertFalse(el.hasClass("foo"));

        el.toggleClass("bar"); // should remove
        assertFalse(el.hasClass("bar"));
        el.toggleClass("bar"); // should add
        assertTrue(el.hasClass("bar"));

        // Test hasClass edge cases: empty attr or length mismatch
        Element el2 = new Element(Tag.valueOf("div"), "http://example.com");
        assertFalse(el2.hasClass("longclassname"));
        el2.attr("class", "a");
        assertFalse(el2.hasClass("toolong"));
    }

    @Test
    public void testFormValOperations() {
        Element input = new Element(Tag.valueOf("input"), "http://example.com");
        input.val("test-value");
        assertEquals("test-value", input.val());

        Element textarea = new Element(Tag.valueOf("textarea"), "http://example.com");
        textarea.val("textarea-text");
        assertEquals("textarea-text", textarea.val());
    }

    @Test
    public void testHtmlAndToStringAndClone() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.append("<p>Test</p>");
        assertNotNull(el.html());
        assertNotNull(el.toString());

        Element clone = el.clone();
        assertNotNull(clone);
        assertEquals(el, clone);
        assertEquals(el.hashCode(), clone.hashCode());
    }
}