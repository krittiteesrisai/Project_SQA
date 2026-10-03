package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class ElementTest {

    @Test
    public void testHasClass_EdgeCasesAndLengths() {
        Element el = new Element("div");

        // 1. len == 0 (Empty class attribute)
        assertFalse(el.hasClass("foo"));

        // 2. len < wantLen
        el.attr("class", "ab");
        assertFalse(el.hasClass("abcd"));

        // 3. len == wantLen (Exact match, case-insensitive)
        el.attr("class", "TestClass");
        assertTrue(el.hasClass("testclass"));
        assertFalse(el.hasClass("other"));

        // 4. Multiple classes with whitespace variations, leading/trailing spaces, and last entry check
        el.attr("class", "  alpha   BETA   gamma  ");
        assertTrue(el.hasClass("alpha"));
        assertTrue(el.hasClass("beta"));
        assertTrue(el.hasClass("gamma"));
        assertFalse(el.hasClass("alp"));
        assertFalse(el.hasClass("deltas")); // length mismatch at the end
    }

    @Test
    public void testTagNameAndManipulation() {
        Element el = new Element("span");
        assertEquals("span", el.tagName());
        assertEquals("span", el.nodeName());

        el.tagName("div");
        assertEquals("div", el.tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameEmptyValidation() {
        Element el = new Element("div");
        el.tagName("");
    }

    @Test
    public void testFormValHandling() {
        Element input = new Element("input");
        input.val("myValue");
        assertEquals("myValue", input.val());

        Element textarea = new Element("textarea");
        textarea.val("areaContent");
        assertEquals("areaContent", textarea.val());
        assertEquals("areaContent", textarea.text());
    }

    @Test
    public void testCssSelectorWithIdAndClasses() {
        Element el = new Element("div");
        el.attr("id", "uniqueId");
        assertEquals("#uniqueId", el.cssSelector());

        Element el2 = new Element("span");
        el2.addClass("cls1");
        el2.addClass("cls2");
        // เมื่อไม่มี id และ parent เป็น null หรือไม่มี root ซับซ้อน
        assertEquals("span.cls1.cls2", el2.cssSelector());
    }

    @Test
    public void testPreserveWhitespace() {
        Element el = new Element("pre");
        assertTrue(Element.preserveWhitespace(el));

        Element normalEl = new Element("div");
        assertFalse(Element.preserveWhitespace(normalEl));
        assertFalse(Element.preserveWhitespace(null));
    }

    @Test
    public void testSiblingNavigationNullParent() {
        Element el = new Element("div");
        assertNull(el.nextElementSibling());
        assertNull(el.previousElementSibling());
        assertEquals(Integer.valueOf(0), el.elementSiblingIndex());
    }

    @Test
    public void testClassNamesManipulation() {
        Element el = new Element("div");
        el.attr("class", "one two");
        Set<String> names = el.classNames();
        assertEquals(2, names.size());
        assertTrue(names.contains("one"));

        Set<String> newNames = new HashSet<String>(Arrays.asList("three", "four"));
        el.classNames(newNames);
        assertEquals("three four", el.className());

        el.toggleClass("three");
        assertFalse(el.hasClass("three"));
        assertTrue(el.hasClass("four"));
    }

    @Test
    public void testEmptyAndHasText() {
        Element el = new Element("div");
        assertFalse(el.hasText());

        el.text("Hello World");
        assertTrue(el.hasText());
        assertEquals("Hello World", el.text());

        el.empty();
        assertEquals(0, el.childNodeSize());
        assertFalse(el.hasText());
    }
}