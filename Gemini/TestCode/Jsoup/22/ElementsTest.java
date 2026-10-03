package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ElementsTest {

    @Test
    public void testConstructorsAndClone() {
        Element el1 = new Element(Tag.valueOf("p"), "");
        el1.attr("id", "1");
        
        Elements elements1 = new Elements();
        assertTrue(elements1.isEmpty());

        Elements elements2 = new Elements(Arrays.asList(el1));
        assertEquals(1, elements2.size());

        List<Element> list = new ArrayList<Element>();
        list.add(el1);
        Elements elements3 = new Elements(list);
        assertEquals(1, elements3.size());

        Elements elements4 = new Elements(el1);
        assertEquals(1, elements4.size());

        Elements cloned = elements4.clone();
        assertNotSame(elements4.first(), cloned.first());
        assertEquals("1", cloned.attr("id"));
    }

    @Test
    public void testAttrGetAndHas() {
        Element el1 = new Element(Tag.valueOf("div"), "");
        Element el2 = new Element(Tag.valueOf("div"), "");
        el2.attr("class", "target");

        Elements elements = new Elements(el1, el2);

        // attr(String)
        assertEquals("target", elements.attr("class"));
        assertEquals("", elements.attr("nonexistent"));

        // empty elements attr
        Elements emptyElements = new Elements();
        assertEquals("", emptyElements.attr("class"));

        // hasAttr(String)
        assertTrue(elements.hasAttr("class"));
        assertFalse(elements.hasAttr("nonexistent"));
        assertFalse(emptyElements.hasAttr("class"));
    }

    @Test
    public void testAttrSetAndRemove() {
        Element el1 = new Element(Tag.valueOf("div"), "");
        Elements elements = new Elements(el1);

        elements.attr("data-test", "val");
        assertEquals("val", el1.attr("data-test"));

        elements.removeAttr("data-test");
        assertFalse(el1.hasAttr("data-test"));
    }

    @Test
    public void testClassManipulations() {
        Element el1 = new Element(Tag.valueOf("div"), "");
        Elements elements = new Elements(el1);

        elements.addClass("foo");
        assertTrue(elements.hasClass("foo"));

        elements.removeClass("foo");
        assertFalse(elements.hasClass("foo"));

        elements.toggleClass("bar");
        assertTrue(elements.hasClass("bar"));
        elements.toggleClass("bar");
        assertFalse(elements.hasClass("bar"));

        Elements emptyElements = new Elements();
        assertFalse(emptyElements.hasClass("foo"));
    }

    @Test
    public void testValHandling() {
        Element el1 = new Element(Tag.valueOf("input"), "");
        el1.val("testValue");
        Elements elements = new Elements(el1);

        assertEquals("testValue", elements.val());

        elements.val("newValue");
        assertEquals("newValue", el1.val());

        Elements emptyElements = new Elements();
        assertEquals("", emptyElements.val());
    }

    @Test
    public void testTextAndHasText() {
        Element el1 = new Element(Tag.valueOf("p"), "").text("Hello");
        Element el2 = new Element(Tag.valueOf("p"), "").text("World");
        Elements elements = new Elements(el1, el2);

        assertEquals("Hello World", elements.text());
        assertTrue(elements.hasText());

        Elements emptyElements = new Elements();
        assertEquals("", emptyElements.text());
        assertFalse(emptyElements.hasText());

        Element elNoText = new Element(Tag.valueOf("div"), "");
        Elements elementsNoText = new Elements(elNoText);
        assertFalse(elementsNoText.hasText());
    }

    @Test
    public void testHtmlAndOuterHtmlAndToString() {
        Element el1 = new Element(Tag.valueOf("div"), "").html("<span>1</span>");
        Element el2 = new Element(Tag.valueOf("div"), "").html("<span>2</span>");
        Elements elements = new Elements(el1, el2);

        assertEquals("<span>1</span>\n<span>2</span>", elements.html());
        assertEquals("<div>\n <span>1</span>\n</div>\n<div>\n <span>2</span>\n</div>", elements.outerHtml());
        assertEquals(elements.outerHtml(), elements.toString());

        Elements emptyElements = new Elements();
        assertEquals("", emptyElements.html());
        assertEquals("", emptyElements.outerHtml());
    }

    @Test
    public void testDomMutationsAndTransformations() {
        Element el1 = new Element(Tag.valueOf("div"), "").text("Content");
        Elements elements = new Elements(el1);

        elements.tagName("span");
        assertEquals("span", el1.tagName());

        elements.html("<b>New</b>");
        assertEquals("<b>New</b>", el1.html());

        elements.prepend("<i>Start</i> ");
        elements.append(" <i>End</i>");

        elements.before("<p>Before</p>");
        elements.after("<p>After</p>");

        elements.unwrap();
        elements.empty();
        elements.remove();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWrapValidation() {
        Element el1 = new Element(Tag.valueOf("span"), "");
        Elements elements = new Elements(el1);
        elements.wrap(""); // Should throw IllegalArgumentException due Validate.notEmpty
    }

    @Test
    public void testWrapValid() {
        Element el1 = new Element(Tag.valueOf("span"), "").text("Test");
        Elements elements = new Elements(el1);
        elements.wrap("<div></div>");
        assertTrue(el1.parent() != null);
    }

    @Test
    public void testFilteringAndQuerying() {
        Element el1 = new Element(Tag.valueOf("div"), "").attr("id", "one").text("One");
        Element el2 = new Element(Tag.valueOf("p"), "").attr("id", "two").text("Two");
        Elements elements = new Elements(el1, el2);

        Elements selected = elements.select("div");
        assertEquals(1, selected.size());

        Elements notElements = elements.not("p");
        assertEquals(1, notElements.size());

        Elements eqValid = elements.eq(0);
        assertEquals(1, eqValid.size());
        assertEquals("one", eqValid.first().attr("id"));

        Elements eqInvalid = elements.eq(5);
        assertTrue(eqInvalid.isEmpty());

        assertTrue(elements.is("div"));
        assertFalse(elements.is("a"));
    }

    @Test
    public void testParentsAndFirstLastTraversal() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = new Element(Tag.valueOf("p"), "");
        parent.appendChild(child);

        Elements elements = new Elements(child);
        Elements parents = elements.parents();
        assertEquals(1, parents.size());

        assertEquals(child, elements.first());
        assertEquals(child, elements.last());

        Elements emptyElements = new Elements();
        assertNull(emptyElements.first());
        assertNull(emptyElements.last());

        elements.traverse(new NodeVisitor() {
            public void head(org.jsoup.nodes.Node node, int depth) {}
            public void tail(org.jsoup.nodes.Node node, int depth) {}
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTraverseValidation() {
        Elements elements = new Elements(new Element(Tag.valueOf("div"), ""));
        elements.traverse(null);
    }

    @Test
    public void testListDelegates() {
        Element el1 = new Element(Tag.valueOf("div"), "");
        Elements elements = new Elements();
        elements.add(el1);

        assertEquals(1, elements.size());
        assertTrue(elements.contains(el1));
        assertNotNull(elements.iterator());
        assertNotNull(elements.toArray());
        assertNotNull(elements.toArray(new Element[0]));

        elements.remove(el1);
        assertTrue(elements.isEmpty());

        elements.add(el1);
        assertTrue(elements.containsAll(Arrays.asList(el1)));
        
        Elements other = new Elements(el1);
        assertTrue(elements.equals(other));
        assertEquals(elements.hashCode(), other.hashCode());

        assertEquals(el1, elements.get(0));
        elements.set(0, new Element(Tag.valueOf("p"), ""));
        elements.add(0, el1);
        elements.remove(0);
        
        elements.add(el1);
        assertEquals(0, elements.indexOf(el1));
        assertEquals(0, elements.lastIndexOf(el1));
        assertNotNull(elements.listIterator());
        assertNotNull(elements.listIterator(0));
        assertNotNull(elements.subList(0, 1));

        elements.addAll(Arrays.asList(el1));
        elements.addAll(0, Arrays.asList(el1));
        elements.removeAll(Arrays.asList(el1));
        elements.retainAll(Arrays.asList());
        elements.clear();
    }
}