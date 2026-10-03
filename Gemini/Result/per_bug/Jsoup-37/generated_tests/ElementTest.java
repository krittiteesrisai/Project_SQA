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
        assertFalse(el.isBlock()); // ขึ้นอยู่กับการนิยามของ Tag ใน Jsoup แต่ทดสอบการเรียกใช้งานผ่าน branch นี้ได้
        assertNotNull(el.tag());
        assertEquals("", el.id());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameEmptyValidation() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.tagName("");
    }

    @Test
    public void testIdAttribute() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertEquals("", el.id());
        
        el.attr("id", "my-id");
        assertEquals("my-id", el.id());
    }

    @Test
    public void testParentsAndAccumulateParents() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element child = new Element(Tag.valueOf("p"), "http://example.com");
        Element grandchild = new Element(Tag.valueOf("span"), "http://example.com");
        
        root.appendChild(child);
        child.appendChild(grandchild);
        
        Elements parents = grandchild.parents();
        assertEquals(2, parents.size());
        assertEquals("p", parents.get(0).tagName());
        assertEquals("div", parents.get(1).tagName());
    }

    @Test
    public void testChildMethodsAndFilters() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        TextNode textNode = new TextNode("Hello", "http://example.com");
        Element childEl = new Element(Tag.valueOf("span"), "http://example.com");
        DataNode dataNode = new DataNode("var a = 1;", "http://example.com");
        
        parent.appendChild(textNode);
        parent.appendChild(childEl);
        parent.appendChild(dataNode);
        
        assertEquals(1, parent.children().size());
        assertEquals(childEl, parent.child(0));
        
        List<TextNode> textNodes = parent.textNodes();
        assertEquals(1, textNodes.size());
        assertEquals("Hello", textNodes.get(0).getWholeText());
        
        List<DataNode> dataNodes = parent.dataNodes();
        assertEquals(1, dataNodes.size());
        assertEquals("var a = 1;", dataNodes.get(0).getWholeData());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildIndexOutOfBounds() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.child(0);
    }

    @Test
    public void testInsertChildrenEdgeCases() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element child2 = new Element(Tag.valueOf("span"), "http://example.com");
        
        // Test index < 0 (roll around branch: index += currentSize + 1)
        parent.insertChildren(-1, Arrays.asList(child1));
        assertEquals(1, parent.childNodeSize());
        assertEquals(child1, parent.child(0));
        
        // Test normal insert at start (index 0)
        parent.insertChildren(0, Arrays.asList(child2));
        assertEquals(2, parent.childNodeSize());
        assertEquals(child2, parent.child(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenOutOfBounds() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.insertChildren(5, Arrays.asList(new Element(Tag.valueOf("p"), "http://example.com")));
    }

    @Test
    public void testAppendAndPrependShortcuts() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        
        el.appendElement("span").attr("id", "span-id");
        assertEquals(1, el.children().size());
        assertEquals("span", el.child(0).tagName());
        
        el.prependElement("a");
        assertEquals(2, el.children().size());
        assertEquals("a", el.child(0).tagName());
        
        el.appendText("Some text");
        assertTrue(el.hasText());
        
        el.prependText("Prefix text");
        assertEquals("Prefix textSome text", el.text());
    }

    @Test
    public void testHtmlFragmentParsing() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.append("<p>Hello</p>");
        assertEquals(1, el.children().size());
        assertEquals("p", el.child(0).tagName());
        
        el.prepend("<span>First</span>");
        assertEquals(2, el.children().size());
        assertEquals("span", el.child(0).tagName());
    }

    @Test
    public void testEmptyAndClearing() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.appendChild(new Element(Tag.valueOf("p"), "http://example.com"));
        assertFalse(el.childNodes.isEmpty());
        
        el.empty();
        assertTrue(el.childNodes.isEmpty());
    }

    @Test
    public void testSiblingNavigationStandalone() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertNull(el.parent());
        assertNull(el.nextElementSibling());
        assertNull(el.previousElementSibling());
        assertNull(el.firstElementSibling());
        assertNull(el.lastElementSibling());
        assertEquals(Integer.valueOf(0), el.elementSiblingIndex());
        assertEquals(0, el.siblingElements().size());
    }

    @Test
    public void testSiblingNavigationWithSiblings() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element child2 = new Element(Tag.valueOf("span"), "http://example.com");
        Element child3 = new Element(Tag.valueOf("a"), "http://example.com");
        
        parent.appendChild(child1);
        parent.appendChild(child2);
        parent.appendChild(child3);
        
        assertEquals(child2, child1.nextElementSibling());
        assertNull(child3.nextElementSibling());
        
        assertEquals(child2, child3.previousElementSibling());
        assertNull(child1.previousElementSibling());
        
        assertEquals(child1, child2.firstElementSibling());
        assertEquals(child3, child2.lastElementSibling());
        assertEquals(Integer.valueOf(1), child2.elementSiblingIndex());
        
        assertEquals(2, child2.siblingElements().size());
    }

    @Test
    public void testQuerySelectorsAndCollectionMethods() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.attr("id", "main");
        parent.attr("class", "container active");
        parent.attr("data-test", "val");
        
        Element child = parent.appendElement("span");
        child.attr("id", "child-id");
        child.attr("class", "active item");
        child.appendText("Searchable text content");

        assertNotNull(parent.getElementById("main"));
        assertNotNull(parent.getElementById("child-id"));
        assertNull(parent.getElementById("non-existent"));

        assertEquals(1, parent.getElementsByTag("span").size());
        assertEquals(2, parent.getElementsByClass("active").size());
        assertEquals(2, parent.getElementsByAttribute("id").size());
        assertEquals(1, parent.getElementsByAttributeStarting("data-").size());
        assertEquals(1, parent.getElementsByAttributeValue("id", "main").size());
        assertEquals(1, parent.getElementsByAttributeValueNot("id", "main").size());
        assertEquals(1, parent.getElementsByAttributeValueStarting("id", "mai").size());
        assertEquals(1, parent.getElementsByAttributeValueEnding("id", "ain").size());
        assertEquals(1, parent.getElementsByAttributeValueContaining("id", "ai").size());
        assertEquals(1, parent.getElementsByAttributeValueMatching("id", Pattern.compile("^ma.*")) .size());
        assertEquals(1, parent.getElementsByAttributeValueMatching("id", "^ma.*").size());

        assertEquals(1, parent.getElementsByIndexLessThan(5).size());
        assertEquals(0, parent.getElementsByIndexGreaterThan(5).size());
        assertEquals(1, parent.getElementsByIndexEquals(0).size());

        assertEquals(1, parent.getElementsContainingText("Searchable").size());
        assertEquals(0, parent.getElementsContainingOwnText("Searchable").size()); // อยู่ในลูก ไม่ใช่ ownText โดยตรง
        assertEquals(1, parent.getElementsMatchingText(Pattern.compile("Searchable")).size());
        assertEquals(1, parent.getElementsMatchingText("Searchable").size());
        assertEquals(1, parent.getAllElements().size() > 0 ? parent.getAllElements().size() : 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidRegexPatternSyntax() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.getElementsByAttributeValueMatching("id", "[unclosed-bracket");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidTextRegexPatternSyntax() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.getElementsMatchingText("[unclosed-bracket");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidOwnTextRegexPatternSyntax() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.getElementsMatchingOwnText("[unclosed-bracket");
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
        
        // Test with <br> tag handling
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        div.appendText("Line1");
        div.appendElement("br");
        div.appendText("Line2");
        assertEquals("Line1 Line2", div.text());
    }

    @Test
    public void testTextSetterAndHasText() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertFalse(el.hasText());
        
        el.text("New text content");
        assertTrue(el.hasText());
        assertEquals("New text content", el.text());
    }

    @Test
    public void testDataMethod() {
        Element script = new Element(Tag.valueOf("script"), "http://example.com");
        script.appendChild(new DataNode("console.log('test');", "http://example.com"));
        
        assertEquals("console.log('test');", script.data());
    }

    @Test
    public void testClassManagement() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertEquals("", el.className());
        assertTrue(el.classNames().isEmpty());
        
        Set<String> classes = new HashSet<String>(Arrays.asList("c1", "c2"));
        el.classNames(classes);
        assertEquals("c1 c2", el.className());
        
        assertTrue(el.hasClass("C1")); // Case insensitive
        assertFalse(el.hasClass("c3"));
        
        el.addClass("c3");
        assertTrue(el.hasClass("c3"));
        
        el.removeClass("c1");
        assertFalse(el.hasClass("c1"));
        
        el.toggleClass("c2"); // should remove
        assertFalse(el.hasClass("c2"));
        
        el.toggleClass("c2"); // should add back
        assertTrue(el.hasClass("c2"));
    }

    @Test
    public void valFormElements() {
        Element textarea = new Element(Tag.valueOf("textarea"), "http://example.com");
        textarea.val("Area text");
        assertEquals("Area text", textarea.val());
        
        Element input = new Element(Tag.valueOf("input"), "http://example.com");
        input.val("Input value");
        assertEquals("Input value", input.val());
    }

    @Test
    public void testEqualsHashcodeAndClone() {
        Element el1 = new Element(Tag.valueOf("div"), "http://example.com");
        Element el2 = new Element(Tag.valueOf("div"), "http://example.com");
        
        assertTrue(el1.equals(el1));
        assertFalse(el1.equals(el2));
        assertNotEquals(0, el1.hashCode());
        
        Element clone = el1.clone();
        assertNotNull(clone);
        assertEquals(el1.tagName(), clone.tagName());
    }
}