package org.jsoup.nodes;

import org.jsoup.select.Elements;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.*;

public class ElementTest {

    // --- Test HasClass Branches & Edge Cases ---
    @Test
    public void testHasClassEmptyAttribute() {
        Element el = new Element("div");
        assertFalse(el.hasClass("foo"));
    }

    @Test
    public void testHasClassLengthMismatch() {
        Element el = new Element("div");
        el.attr("class", "fo");
        // attribute length (2) < search length (3)
        assertFalse(el.hasClass("foo"));
    }

    @Test
    public void testHasClassExactMatchCaseInsensitive() {
        Element el = new Element("div");
        el.attr("class", "FooBar");
        assertTrue(el.hasClass("foobar"));
        assertTrue(el.hasClass("FOOBAR"));
    }

    @Test
    public void testHasClassMultipleClassesAndWhitespace() {
        Element el = new Element("div");
        el.attr("class", "  alpha   beta   gamma  ");
        
        assertTrue(el.hasClass("alpha"));
        assertTrue(el.hasClass("beta"));
        assertTrue(el.hasClass("gamma"));
        assertFalse(el.hasClass("alt"));
        assertFalse(el.hasClass("bet"));
    }

    @Test
    public void testHasClassTrailingAndLeadingMatches() {
        Element el = new Element("div");
        // ทดสอบเคสคำแรกและคำสุดท้ายใน Attribute ยาวๆ
        el.attr("class", "start middle end");
        assertTrue(el.hasClass("start"));
        assertTrue(el.hasClass("middle"));
        assertTrue(el.hasClass("end"));
    }

    // --- Test InsertChildren & Boundary Limits ---
    @Test
    public void testInsertChildrenNegativeIndex() {
        Element el = new Element("div");
        el.appendChild(new TextNode("A"));
        el.appendChild(new TextNode("B"));
        
        // index = -1 จะคำนวณเป็น size + 1 - 1 = size (แทรกท้ายสุด)
        el.insertChildren(-1, new TextNode("C"));
        assertEquals(3, el.childNodeSize());
        assertEquals("C", el.childNode(2).outerHtml());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenOutOfBoundsNegative() {
        Element el = new Element("div");
        // -5 จะหลุดขอบเขตแน่นอน
        el.insertChildren(-10, Collections.singletonList(new TextNode("X")));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenOutOfBoundsPositive() {
        Element el = new Element("div");
        el.insertChildren(5, new TextNode("X"));
    }

    @Test
    public void testInsertChildrenWithCollection() {
        Element el = new Element("div");
        List<Node> nodes = Arrays.asList(new TextNode("1"), new TextNode("2"));
        el.insertChildren(0, nodes);
        assertEquals(2, el.childNodeSize());
        assertEquals("1", el.childNode(0).outerHtml());
    }

    // --- Test Form Val Branches ---
    @Test
    public void testValTextarea() {
        Element el = new Element("textarea");
        el.val("Hello Textarea");
        assertEquals("Hello Textarea", el.val());
        assertEquals("Hello Textarea", el.text());
    }

    @Test
    public void testValInput() {
        Element el = new Element("input");
        el.val("Hello Input");
        assertEquals("Hello Input", el.val());
        assertEquals("Hello Input", el.attr("value"));
    }

    // --- Test CssSelector Branches ---
    @Test
    public void testCssSelectorWithId() {
        Element el = new Element("div");
        el.attr("id", "unique-id");
        assertEquals("#unique-id", el.cssSelector());
    }

    @Test
    public void testCssSelectorWithClassesAndNamespace() {
        Element el = new Element("fb:secure");
        el.attr("class", "btn primary");
        // ไม่มี ID และไม่มี Parent ควรคืนค่าแท็กและคลาส
        assertEquals("fb|secure.btn.primary", el.cssSelector());
    }

    @Test
    public void testCssSelectorWithSiblingsNthChild() {
        Element parent = new Element("div");
        Element child1 = parent.appendElement("p");
        Element child2 = parent.appendElement("p"); // แท็กซ้ำกัน > 1 ตัว

        // เรียก cssSelector บน child2 ควรมี :nth-child(2)
        assertTrue(child2.cssSelector().contains(":nth-child(2)"));
    }

    // --- Test Sibling Elements & Navigation ---
    @Test
    public void testSiblingElementsNoParent() {
        Element el = new Element("div");
        assertTrue(el.siblingElements().isEmpty());
        assertNull(el.nextElementSibling());
        assertNull(el.previousElementSibling());
        assertNull(el.firstElementSibling());
        assertNull(el.lastElementSibling());
        assertEquals(0, el.elementSiblingIndex());
    }

    @Test
    public void testSiblingNavigationWithSiblings() {
        Element parent = new Element("div");
        Element first = parent.appendElement("span");
        Element second = parent.appendElement("span");
        Element third = parent.appendElement("span");

        assertEquals(second, first.nextElementSibling());
        assertEquals(first, second.previousElementSibling());
        assertNull(third.nextElementSibling());
        assertNull(first.previousElementSibling());

        assertEquals(first, second.firstElementSibling());
        assertEquals(third, second.lastElementSibling());
        assertEquals(1, second.elementSiblingIndex());
    }

    // --- Test ClassNames Manipulation ---
    @Test
    public void testClassNamesAddRemoveToggle() {
        Element el = new Element("div");
        el.addClass("foo");
        assertTrue(el.hasClass("foo"));

        el.toggleClass("foo");
        assertFalse(el.hasClass("foo"));

        el.toggleClass("foo");
        assertTrue(el.hasClass("foo"));

        el.removeClass("foo");
        assertFalse(el.hasClass("foo"));
        
        // ทดสอบ set classNames เป็น empty set
        el.classNames(new HashSet<String>());
        assertFalse(el.attributes().hasKey("class"));
    }
}