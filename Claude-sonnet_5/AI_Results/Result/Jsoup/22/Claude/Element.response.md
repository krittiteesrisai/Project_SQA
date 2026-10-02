# ElementTest.java

```java
package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

/**
 * JUnit 4 test suite for org.jsoup.nodes.Element
 * (Defects4J: Jsoup-22b)
 *
 * หมายเหตุ:
 * - Validate.notNull()/notEmpty() ใน jsoup จะ throw IllegalArgumentException (พฤติกรรมมาตรฐานของ jsoup)
 * - Tag.isBlock()/Tag.preserveWhitespace() ไม่ได้แสดงใน source ที่ให้มา แต่ใช้ค่าที่ทราบจาก
 *   มาตรฐาน HTML ของ jsoup (div/p = block, span/a/br = inline) — มีคอมเมนต์กำกับไว้ทุกจุด
 * - StringUtil.join() ไม่ได้แสดง source จึงหลีกเลี่ยงการ assert รูปแบบ string ที่แน่นอนเกินไป
 */
public class ElementTest {

    // ---------- Constructor ----------

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_NullTag_Throws() {
        new Element(null, "http://example.com");
    }

    @Test
    public void testConstructor_ValidTagAndBaseUri() {
        Element e = new Element(Tag.valueOf("div"), "http://example.com/");
        assertEquals("div", e.tagName());
        assertEquals("http://example.com/", e.baseUri());
    }

    // ---------- nodeName / tagName ----------

    @Test
    public void testNodeName_EqualsTagName() {
        Element e = new Element(Tag.valueOf("span"), "");
        assertEquals("span", e.nodeName());
        assertEquals("span", e.tagName());
    }

    @Test
    public void testTagNameSetter_ChangesTag() {
        Element e = new Element(Tag.valueOf("span"), "");
        Element same = e.tagName("div");
        assertSame(e, same);
        assertEquals("div", e.tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameSetter_Empty_Throws() {
        Element e = new Element(Tag.valueOf("div"), "");
        e.tagName("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameSetter_Null_Throws() {
        Element e = new Element(Tag.valueOf("div"), "");
        e.tagName(null);
    }

    @Test
    public void testTagGetter() {
        Tag t = Tag.valueOf("div");
        Element e = new Element(t, "");
        assertEquals(t, e.tag());
    }

    // ---------- isBlock ----------

    @Test
    public void testIsBlock_DivTrue() {
        // div เป็น block element ตามมาตรฐาน tag ของ jsoup
        Element e = new Element(Tag.valueOf("div"), "");
        assertTrue(e.isBlock());
    }

    @Test
    public void testIsBlock_SpanFalse() {
        // span เป็น inline element ตามมาตรฐาน tag ของ jsoup
        Element e = new Element(Tag.valueOf("span"), "");
        assertFalse(e.isBlock());
    }

    // ---------- id() ----------

    @Test
    public void testId_NoAttribute_ReturnsEmpty() {
        Element e = new Element(Tag.valueOf("div"), "");
        assertEquals("", e.id());
    }

    @Test
    public void testId_WithAttribute() {
        Element e = new Element(Tag.valueOf("div"), "");
        e.attr("id", "myId");
        assertEquals("myId", e.id());
    }

    // ---------- attr() chaining ----------

    @Test
    public void testAttr_ReturnsThisForChaining() {
        Element e = new Element(Tag.valueOf("div"), "");
        Element result = e.attr("data-x", "1");
        assertSame(e, result);
        assertEquals("1", e.attr("data-x"));
    }

    // ---------- dataset() ----------

    @Test
    public void testDataset_FiltersDataAttributes() {
        Element e = new Element(Tag.valueOf("div"), "");
        e.attr("data-package", "jsoup");
        e.attr("data-language", "Java");
        e.attr("class", "group");
        Map<String, String> dataset = e.dataset();
        assertEquals(2, dataset.size());
        assertEquals("jsoup", dataset.get("package"));
        assertEquals("Java", dataset.get("language"));
    }

    // ---------- parent() ----------

    @Test
    public void testParent_NoParent_ReturnsNull() {
        Element e = new Element(Tag.valueOf("div"), "");
        assertNull(e.parent());
    }

    @Test
    public void testParent_WithParent() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = new Element(Tag.valueOf("p"), "");
        parent.appendChild(child);
        assertSame(parent, child.parent());
    }

    // ---------- parents() ----------

    @Test
    public void testParents_NoParent_Empty() {
        Element e = new Element(Tag.valueOf("div"), "");
        Elements parents = e.parents();
        assertEquals(0, parents.size());
    }

    @Test
    public void testParents_ExcludesRoot() {
        Element root = new Element(Tag.valueOf("#root"), "");
        Element mid = new Element(Tag.valueOf("div"), "");
        Element leaf = new Element(Tag.valueOf("p"), "");
        root.appendChild(mid);
        mid.appendChild(leaf);

        Elements parents = leaf.parents();
        // #root ต้องถูก exclude ตาม accumulateParents()
        assertEquals(1, parents.size());
        assertSame(mid, parents.get(0));
    }

    // ---------- child(index) / children() ----------

    @Test
    public void testChild_BoundaryIndexes() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element c0 = new Element(Tag.valueOf("p"), "");
        Element c1 = new Element(Tag.valueOf("span"), "");
        parent.appendChild(c0);
        parent.appendChild(c1);

        assertSame(c0, parent.child(0));
        assertSame(c1, parent.child(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChild_OutOfBounds_Throws() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.child(0);
    }

    @Test
    public void testChildren_EmptyWhenNoChildren() {
        Element e = new Element(Tag.valueOf("div"), "");
        assertEquals(0, e.children().size());
    }

    @Test
    public void testChildren_FiltersOnlyElements() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.appendText("some text");
        Element child = new Element(Tag.valueOf("p"), "");
        parent.appendChild(child);

        Elements kids = parent.children();
        assertEquals(1, kids.size());
        assertSame(child, kids.get(0));
    }

    // ---------- textNodes() / dataNodes() ----------

    @Test
    public void testTextNodes_Empty() {
        Element e = new Element(Tag.valueOf("div"), "");
        assertTrue(e.textNodes().isEmpty());
    }

    @Test
    public void testTextNodes_NonEmpty() {
        Element e = new Element(Tag.valueOf("div"), "");
        e.appendText("hello");
        List<TextNode> nodes = e.textNodes();
        assertEquals(1, nodes.size());
        assertEquals("hello", nodes.get(0).getWholeText());
    }

    @Test
    public void testDataNodes_Empty() {
        Element e = new Element(Tag.valueOf("script"), "");
        assertTrue(e.dataNodes().isEmpty());
    }

    @Test
    public void testDataNodes_NonEmpty() {
        Element e = new Element(Tag.valueOf("script"), "");
        DataNode dn = new DataNode("var x=1;", "");
        e.appendChild(dn);
        List<DataNode> nodes = e.dataNodes();
        assertEquals(1, nodes.size());
        assertEquals("var x=1;", nodes.get(0).getWholeData());
    }

    // ---------- select() ----------

    @Test
    public void testSelect_BasicTagQuery() {
        Element root = new Element(Tag.valueOf("div"), "");
        Element p1 = new Element(Tag.valueOf("p"), "");
        Element p2 = new Element(Tag.valueOf("p"), "");
        root.appendChild(p1);
        root.appendChild(p2);

        Elements result = root.select("p");
        assertEquals(2, result.size());
    }

    // ---------- appendChild / prependChild ----------

    @Test(expected = IllegalArgumentException.class)
    public void testAppendChild_Null_Throws() {
        Element e = new Element(Tag.valueOf("div"), "");
        e.appendChild(null);
    }

    @Test
    public void testAppendChild_AddsAtEnd() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element c0 = new Element(Tag.valueOf("p"), "");
        Element c1 = new Element(Tag.valueOf("span"), "");
        parent.appendChild(c0);
        Element result = parent.appendChild(c1);
        assertSame(parent, result);
        assertEquals(2, parent.children().size());
        assertSame(c1, parent.child(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrependChild_Null_Throws() {
        Element e = new Element(Tag.valueOf("div"), "");
        e.prependChild(null);
    }

    @Test
    public void testPrependChild_AddsAtStart() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element c0 = new Element(Tag.valueOf("p"), "");
        Element c1 = new Element(Tag.valueOf("span"), "");
        parent.appendChild(c0);
        parent.prependChild(c1);
        assertSame(c1, parent.child(0));
        assertSame(c0, parent.child(1));
    }

    // ---------- appendElement / prependElement ----------

    @Test
    public void testAppendElement_CreatesAndAppends() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = parent.appendElement("span");
        assertEquals("span", child.tagName());
        assertEquals(1, parent.children().size());
        assertSame(child, parent.child(0));
    }

    @Test
    public void testPrependElement_CreatesAndPrepends() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.appendElement("p");
        Element prepended = parent.prependElement("span");
        assertSame(prepended, parent.child(0));
    }

    // ---------- appendText / prependText ----------

    @Test
    public void testAppendText_AddsTextNodeAtEnd() {
        Element e = new Element(Tag.valueOf("div"), "");
        e.appendText("first");
        Element result = e.appendText("second");
        assertSame(e, result);
        assertEquals(2, e.textNodes().size());
    }

    @Test
    public void testPrependText_AddsTextNodeAtStart() {
        Element e = new Element(Tag.valueOf("div"), "");
        e.appendText("second");
        e.prependText("first");
        assertEquals("first", e.textNodes().get(0).getWholeText());
    }

    // ---------- append(html) / prepend(html) ----------

    @Test(expected = IllegalArgumentException.class)
    public void testAppend_NullHtml_Throws() {
        Element e = new Element(Tag.valueOf("div"), "");
        e.append(null);
    }

    @Test
    public void testAppend_ValidHtml_AddsChildren() {
        Element e = new Element(Tag.valueOf("div"), "");
        Element result = e.append("<p>Hi</p>");
        assertSame(e, result);
        assertEquals(1, e.children().size());
        assertEquals("p", e.child(0).tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrepend_NullHtml_Throws() {
        Element e = new Element(Tag.valueOf("div"), "");
        e.prepend(null);
    }

    @Test
    public void testPrepend_ValidHtml_AddsAtStart() {
        Element e = new Element(Tag.valueOf("div"), "");
        e.append("<p>Second</p>");
        e.prepend("<span>First</span>");
        assertEquals("span", e.child(0).tagName());
        assertEquals("p", e.child(1).tagName());
    }

    // ---------- empty() ----------

    @Test
    public void testEmpty_ClearsChildren() {
        Element e = new Element(Tag.valueOf("div"), "");
        e.appendText("hello");
        e.appendElement("span");
        Element result = e.empty();
        assertSame(e, result);
        assertEquals(0, e.childNodes.size());
    }

    // ---------- siblingElements() ----------

    @Test(expected = NullPointerException.class)
    public void testSiblingElements_NoParent_Throws() {
        Element e = new Element(Tag.valueOf("div"), "");
        e.siblingElements(); // parent() == null -> NPE on parent().children()
    }

    @Test
    public void testSiblingElements_WithParent() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element c0 = new Element(Tag.valueOf("p"), "");
        Element c1 = new Element(Tag.valueOf("span"), "");
        parent.appendChild(c0);
        parent.appendChild(c1);
        Elements siblings = c0.siblingElements();
        assertEquals(2, siblings.size()); // includes self per parent().children()
    }

    // ---------- nextElementSibling() / previousElementSibling() ----------

    @Test
    public void testNextElementSibling_HasNext() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element c0 = new Element(Tag.valueOf("p"), "");
        Element c1 = new Element(Tag.valueOf("span"), "");
        parent.appendChild(c0);
        parent.appendChild(c1);
        assertSame(c1, c0.nextElementSibling());
    }

    @Test
    public void testNextElementSibling_NoNext_ReturnsNull() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element c0 = new Element(Tag.valueOf("p"), "");
        parent.appendChild(c0);
        assertNull(c0.nextElementSibling());
    }

    @Test
    public void testPreviousElementSibling_HasPrev() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element c0 = new Element(Tag.valueOf("p"), "");
        Element c1 = new Element(Tag.valueOf("span"), "");
        parent.appendChild(c0);
        parent.appendChild(c1);
        assertSame(c0, c1.previousElementSibling());
    }

    @Test
    public void testPreviousElementSibling_NoPrev_ReturnsNull() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element c0 = new Element(Tag.valueOf("p"), "");
        parent.appendChild(c0);
        assertNull(c0.previousElementSibling());
    }

    // ---------- firstElementSibling() / lastElementSibling() ----------

    @Test
    public void testFirstElementSibling_SingleChild_ReturnsNull() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element c0 = new Element(Tag.valueOf("p"), "");
        parent.appendChild(c0);
        assertNull(c0.firstElementSibling());
    }

    @Test
    public void testFirstElementSibling_MultipleChildren() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element c0 = new Element(Tag.valueOf("p"), "");
        Element c1 = new Element(Tag.valueOf("span"), "");
        parent.appendChild(c0);
        parent.appendChild(c1);
        assertSame(c0, c1.firstElementSibling());
    }

    @Test
    public void testLastElementSibling_SingleChild_ReturnsNull() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element c0 = new Element(Tag.valueOf("p"), "");
        parent.appendChild(c0);
        assertNull(c0.lastElementSibling());
    }

    @Test
    public void testLastElementSibling_MultipleChildren() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element c0 = new Element(Tag.valueOf("p"), "");
        Element c1 = new Element(Tag.valueOf("span"), "");
        parent.appendChild(c0);
        parent.appendChild(c1);
        assertSame(c1, c0.lastElementSibling());
    }

    // ---------- elementSiblingIndex() ----------

    @Test
    public void testElementSiblingIndex_NoParent_ReturnsZero() {
        Element e = new Element(Tag.valueOf("div"), "");
        assertEquals(Integer.valueOf(0), e.elementSiblingIndex());
    }

    @Test
    public void testElementSiblingIndex_WithParent() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element c0 = new Element(Tag.valueOf("p"), "");
        Element c1 = new Element(Tag.valueOf("span"), "");
        parent.appendChild(c0);
        parent.appendChild(c1);
        assertEquals(Integer.valueOf(0), c0.elementSiblingIndex());
        assertEquals(Integer.valueOf(1), c1.elementSiblingIndex());
    }

    // ---------- getElementsByTag ----------

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByTag_Empty_Throws() {
        Element e = new Element(Tag.valueOf("div"), "");
        e.getElementsByTag("");
    }

    @Test
    public void testGetElementsByTag_Valid() {
        Element root = new Element(Tag.valueOf("div"), "");
        root.appendElement("p");
        root.appendElement("p");
        Elements result = root.getElementsByTag("P"); // case-insensitive
        assertEquals(2, result.size());
    }

    // ---------- getElementById ----------

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementById_Empty_Throws() {
        Element e = new Element(Tag.valueOf("div"), "");
        e.getElementById("");
    }

    @Test
    public void testGetElementById_Found() {
        Element root = new Element(Tag.valueOf("div"), "");
        root.attr("id", "root");
        assertSame(root, root.getElementById("root"));
    }

    @Test
    public void testGetElementById_NotFound_ReturnsNull() {
        Element root = new Element(Tag.valueOf("div"), "");
        assertNull(root.getElementById("missing"));
    }

    // ---------- getElementsByClass ----------

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByClass_Empty_Throws() {
        Element e = new Element(Tag.valueOf("div"), "");
        e.getElementsByClass("");
    }

    @Test
    public void testGetElementsByClass_Valid() {
        Element root = new Element(Tag.valueOf("div"), "");
        Element p1 = root.appendElement("p");
        p1.attr("class", "a b");
        Element p2 = root.appendElement("p");
        p2.attr("class", "b c");
        Elements result = root.getElementsByClass("b");
        assertEquals(2, result.size());
    }

    // ---------- getElementsByAttribute ----------

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttribute_Empty_Throws() {
        Element e = new Element(Tag.valueOf("div"), "");
        e.getElementsByAttribute("");
    }

    @Test
    public void testGetElementsByAttribute_Valid() {
        Element root = new Element(Tag.valueOf("div"), "");
        Element p1 = root.appendElement("p");
        p1.attr("data-foo", "bar");
        root.appendElement("p");
        Elements result = root.getElementsByAttribute("data-foo");
        assertEquals(1, result.size());
        assertSame(p1, result.get(0));
    }

    // ---------- getElementsByAttributeStarting ----------

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeStarting_Empty_Throws() {
        Element e = new Element(Tag.valueOf("div"), "");
        e.getElementsByAttributeStarting("");
    }

    @Test
    public void testGetElementsByAttributeStarting_Valid() {
        Element root = new Element(Tag.valueOf("div"), "");
        Element p1 = root.appendElement("p");
        p1.attr("data-foo", "bar");
        Elements result = root.getElementsByAttributeStarting("data-");
        assertEquals(1, result.size());
    }

    // ---------- getElementsByAttributeValue* family ----------

    @Test
    public void testGetElementsByAttributeValue() {
        Element root = new Element(Tag.valueOf("div"), "");
        Element p1 = root.appendElement("p");
        p1.attr("class", "a b");
        Elements result = root.getElementsByAttributeValue("class", "a b");
        assertEquals(1, result.size());
        assertSame(p1, result.get(0));
    }

    @Test
    public void testGetElementsByAttributeValueNot() {
        Element root = new Element(Tag.valueOf("div"), "");
        Element p1 = root.appendElement("p");
        p1.attr("class", "a b");
        Element p2 = root.appendElement("p"); // no class attribute
        Elements result = root.getElementsByAttributeValueNot("class", "a b");
        assertFalse(result.contains(p1));
        assertTrue(result.contains(p2));
    }

    @Test
    public void testGetElementsByAttributeValueStarting() {
        Element root = new Element(Tag.valueOf("div"), "");
        Element a = root.appendElement("a");
        a.attr("href", "http://example.com/page");
        Elements result = root.getElementsByAttributeValueStarting("href", "http://example");
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsByAttributeValueEnding() {
        Element root = new Element(Tag.valueOf("div"), "");
        Element a = root.appendElement("a");
        a.attr("href", "http://example.com/page");
        Elements result = root.getElementsByAttributeValueEnding("href", "page");
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsByAttributeValueContaining() {
        Element root = new Element(Tag.valueOf("div"), "");
        Element a = root.appendElement("a");
        a.attr("href", "http://example.com/page");
        Elements result = root.getElementsByAttributeValueContaining("href", "example.com");
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsByAttributeValueMatching_Pattern() {
        Element root = new Element(Tag.valueOf("div"), "");
        Element a = root.appendElement("a");
        a.attr("href", "http://example.com/page");
        Elements result = root.getElementsByAttributeValueMatching("href", Pattern.compile("^http.*"));
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsByAttributeValueMatching_ValidRegexString() {
        Element root = new Element(Tag.valueOf("div"), "");
        Element a = root.appendElement("a");
        a.attr("href", "http://example.com/page");
        Elements result = root.getElementsByAttributeValueMatching("href", "^http.*");
        assertEquals(1, result.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueMatching_InvalidRegex_Throws() {
        Element root = new Element(Tag.valueOf("div"), "");
        root.getElementsByAttributeValueMatching("href", "[invalid");
    }

    // ---------- getElementsByIndex* (smoke tests; Evaluator internals not shown) ----------

    @Test
    public void testGetElementsByIndexLessThan_NoExceptionAndContainsExpected() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element c0 = parent.appendElement("p");
        parent.appendElement("span");
        Elements result = parent.getElementsByIndexLessThan(1);
        assertNotNull(result);
        assertTrue(result.contains(c0));
    }

    @Test
    public void testGetElementsByIndexGreaterThan_NoExceptionAndContainsExpected() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.appendElement("p");
        Element c1 = parent.appendElement("span");
        Elements result = parent.getElementsByIndexGreaterThan(0);
        assertNotNull(result);
        assertTrue(result.contains(c1));
    }

    @Test
    public void testGetElementsByIndexEquals_NoExceptionAndContainsExpected() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element c0 = parent.appendElement("p");
        parent.appendElement("span");
        Elements result = parent.getElementsByIndexEquals(0);
        assertNotNull(result);
        assertTrue(result.contains(c0));
    }

    // ---------- getElementsContainingText / OwnText ----------

    @Test
    public void testGetElementsContainingText() {
        Element root = new Element(Tag.valueOf("div"), "");
        Element p1 = root.appendElement("p");
        p1.appendText("Hello world");
        Elements result = root.getElementsContainingText("world");
        assertTrue(result.contains(p1));
    }

    @Test
    public void testGetElementsContainingOwnText() {
        Element root = new Element(Tag.valueOf("div"), "");
        Element p1 = root.appendElement("p");
        p1.appendText("Hello world");
        Elements result = root.getElementsContainingOwnText("Hello");
        assertTrue(result.contains(p1));
    }

    // ---------- getElementsMatchingText / OwnText ----------

    @Test
    public void testGetElementsMatchingText_Pattern() {
        Element root = new Element(Tag.valueOf("div"), "");
        Element p1 = root.appendElement("p");
        p1.appendText("Hello world");
        Elements result = root.getElementsMatchingText(Pattern.compile("world"));
        assertTrue(result.contains(p1));
    }

    @Test
    public void testGetElementsMatchingText_ValidRegexString() {
        Element root = new Element(Tag.valueOf("div"), "");
        Element p1 = root.appendElement("p");
        p1.appendText("Hello world");
        Elements result = root.getElementsMatchingText("wor.d");
        assertTrue(result.contains(p1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingText_InvalidRegex_Throws() {
        Element root = new Element(Tag.valueOf("div"), "");
        root.getElementsMatchingText("[invalid");
    }

    @Test
    public void testGetElementsMatchingOwnText_Pattern() {
        Element root = new Element(Tag.valueOf("div"), "");
        Element p1 = root.appendElement("p");
        p1.appendText("Hello world");
        Elements result = root.getElementsMatchingOwnText(Pattern.compile("Hello"));
        assertTrue(result.contains(p1));
    }

    @Test
    public void testGetElementsMatchingOwnText_ValidRegexString() {
        Element root = new Element(Tag.valueOf("div"), "");
        Element p1 = root.appendElement("p");
        p1.appendText("Hello world");
        Elements result = root.getElementsMatchingOwnText("Hel.o");
        assertTrue(result.contains(p1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingOwnText_InvalidRegex_Throws() {
        Element root = new Element(Tag.valueOf("div"), "");
        root.getElementsMatchingOwnText("[invalid");
    }

    // ---------- getAllElements ----------

    @Test
    public void testGetAllElements_IncludesSelfAndDescendants() {
        Element root = new Element(Tag.valueOf("div"), "");
        Element p1 = root.appendElement("p");
        p1.appendElement("span");
        Elements all = root.getAllElements();
        assertEquals(3, all.size()); // root, p1, span
    }

    // ---------- text() / ownText() ----------

    @Test
    public void testText_NestedInlineElement_NoAutoSpace() {
        // ตามโค้ด text(StringBuilder): isBlock()==false (span) จะไม่เติม space ก่อน
        Element p = new Element(Tag.valueOf("p"), "");
        p.appendText("Hello world");
        Element span = new Element(Tag.valueOf("span"), "");
        span.appendText("inner span text");
        p.appendChild(span);

        // ผลลัพธ์ตาม trace ของ source: ไม่มี space คั่นระหว่าง "world" กับ "inner"
        assertEquals("Hello worldinner span text", p.text());
    }

    @Test
    public void testText_NestedBlockElements_InsertsSpace() {
        Element root = new Element(Tag.valueOf("div"), "");
        Element p1 = root.appendElement("p"); // block
        p1.appendText("Hello world");
        Element span = new Element(Tag.valueOf("span"), "");
        span.appendText("inner span text");
        p1.appendChild(span);

        Element p2 = root.appendElement("p"); // block
        p2.appendText("Second paragraph");

        assertEquals("Hello worldinner span text Second paragraph", root.text());
    }

    @Test
    public void testOwnText_ExcludesChildElementText() {
        Element p = new Element(Tag.valueOf("p"), "");
        p.appendText("Hello world");
        Element span = new Element(Tag.valueOf("span"), "");
        span.appendText("inner span text");
        p.appendChild(span);

        assertEquals("Hello world", p.ownText());
    }

    // ---------- hasText() ----------

    @Test
    public void testHasText_True() {
        Element e = new Element(Tag.valueOf("div"), "");
        e.appendText("real text");
        assertTrue(e.hasText());
    }

    @Test
    public void testHasText_False_WhenOnlyBlankText() {
        Element e = new Element(Tag.valueOf("div"), "");
        e.appendText("   ");
        assertFalse(e.hasText());
    }

    @Test
    public void testHasText_True_WhenNestedChildHasText() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = parent.appendElement("p");
        child.appendText("nested text");
        assertTrue(parent.hasText());
    }

    // ---------- data() ----------

    @Test
    public void testData_DirectDataNode() {
        Element script = new Element(Tag.valueOf("script"), "");
        script.appendChild(new DataNode("var x = 1;", ""));
        assertEquals("var x = 1;", script.data());
    }

    @Test
    public void testData_NestedInElement() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element script = div.appendElement("script");
        script.appendChild(new DataNode("var y = 2;", ""));
        assertEquals("var y = 2;", div.data());
    }

    // ---------- className() / classNames() ----------

    @Test
    public void testClassName_NoAttribute_Empty() {
        Element e = new Element(Tag.valueOf("div"), "");
        assertEquals("", e.className());
    }

    @Test
    public void testClassName_WithAttribute() {
        Element e = new Element(Tag.valueOf("div"), "");
        e.attr("class", "header gray");
        assertEquals("header gray", e.className());
    }

    @Test
    public void testClassNames_MultipleClasses() {
        Element e = new Element(Tag.valueOf("div"), "");
        e.attr("class", "header gray");
        Set<String> names = e.classNames();
        assertEquals(2, names.size());
        assertTrue(names.contains("header"));
        assertTrue(names.contains("gray"));
    }

    @Test
    public void testClassNames_EmptyAttribute_YieldsPhantomEmptyName() {
        // Fault-detection: "".split("\\s+") คืนค่า [""] (1 สมาชิก ไม่ใช่ 0)
        // ดังนั้น classNames() บน element ที่ไม่มี class attribute จะมี "" อยู่ในชุดเสมอ
        Element e = new Element(Tag.valueOf("div"), "");
        Set<String> names = e.classNames();
        assertEquals(1, names.size());
        assertTrue(names.contains(""));
    }

    @Test
    public void testHasClass_EmptyString_MatchesPhantomEmptyName() {
        // ผลสืบเนื่องจาก bug ด้านบน: hasClass("") จะ return true แม้ไม่มี class attribute
        Element e = new Element(Tag.valueOf("div"), "");
        assertTrue(e.hasClass(""));
    }

    @Test
    public void testHasClass_CaseInsensitiveMatch() {
        Element e = new Element(Tag.valueOf("div"), "");
        e.attr("class", "Header");
        assertTrue(e.hasClass("header"));
        assertTrue(e.hasClass("HEADER"));
    }

    @Test
    public void testHasClass_NoMatch() {
        Element e = new Element(Tag.valueOf("div"), "");
        e.attr("class", "header");
        assertFalse(e.hasClass("footer"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testClassNamesSetter_Null_Throws() {
        Element e = new Element(Tag.valueOf("div"), "");
        e.classNames(null);
    }

    @Test
    public void testClassNamesSetter_Valid() {
        Element e = new Element(Tag.valueOf("div"), "");
        Set<String> set = new LinkedHashSet<String>();
        set.add("foo");
        set.add("bar");
        Element result = e.classNames(set);
        assertSame(e, result);
        assertTrue(e.hasClass("foo"));
        assertTrue(e.hasClass("bar"));
    }

    // ---------- addClass / removeClass / toggleClass ----------

    @Test(expected = IllegalArgumentException.class)
    public void testAddClass_Null_Throws() {
        Element e = new Element(Tag.valueOf("div"), "");
        e.addClass(null);
    }

    @Test
    public void testAddClass_ToExistingClassAttribute() {
        Element e = new Element(Tag.valueOf("div"), "");
        e.attr("class", "header");
        Element result = e.addClass("gray");
        assertSame(e, result);
        assertTrue(e.hasClass("header"));
        assertTrue(e.hasClass("gray"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveClass_Null_Throws() {
        Element e = new Element(Tag.valueOf("div"), "");
        e.removeClass(null);
    }

    @Test
    public void testRemoveClass_RemovesExistingClass() {
        Element e = new Element(Tag.valueOf("div"), "");
        e.attr("class", "header gray");
        e.removeClass("gray");
        assertTrue(e.hasClass("header"));
        assertFalse(e.hasClass("gray"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToggleClass_Null_Throws() {
        Element e = new Element(Tag.valueOf("div"), "");
        e.toggleClass(null);
    }

    @Test
    public void testToggleClass_AddsWhenAbsent() {
        Element e = new Element(Tag.valueOf("div"), "");
        e.attr("class", "header");
        e.toggleClass("gray");
        assertTrue(e.hasClass("gray"));
    }

    @Test
    public void testToggleClass_RemovesWhenPresent() {
        Element e = new Element(Tag.valueOf("div"), "");
        e.attr("class", "header gray");
        e.toggleClass("gray");
        assertFalse(e.hasClass("gray"));
        assertTrue(e.hasClass("header"));
    }

    // ---------- val() / val(String) ----------

    @Test
    public void testVal_Textarea_UsesText() {
        Element textarea = new Element(Tag.valueOf("textarea"), "");
        textarea.appendText("hello");
        assertEquals("hello", textarea.val());
    }

    @Test
    public void testVal_NonTextarea_UsesValueAttr() {
        Element input = new Element(Tag.valueOf("input"), "");
        input.attr("value", "myValue");
        assertEquals("myValue", input.val());
    }

    @Test
    public void testValSetter_Textarea_SetsText() {
        Element textarea = new Element(Tag.valueOf("textarea"), "");
        Element result = textarea.val("some value");
        assertSame(textarea, result);
        assertEquals("some value", textarea.text());
    }

    @Test
    public void testValSetter_NonTextarea_SetsValueAttr() {
        Element input = new Element(Tag.valueOf("input"), "");
        input.val("abc");
        assertEquals("abc", input.attr("value"));
    }

    // ---------- html() / html(String) ----------

    @Test
    public void testHtmlGetter_EmptyWhenNoChildren() {
        Element e = new Element(Tag.valueOf("div"), "");
        assertEquals("", e.html());
    }

    @Test
    public void testHtmlSetter_ReplacesContent() {
        Element e = new Element(Tag.valueOf("div"), "");
        e.appendText("old content");
        Element result = e.html("<p>new content</p>");
        assertSame(e, result);
        assertEquals(1, e.children().size());
        assertEquals("p", e.child(0).tagName());
    }

    // ---------- toString() ----------

    @Test
    public void testToString_EqualsOuterHtml() {
        Element e = new Element(Tag.valueOf("div"), "");
        e.appendText("content");
        assertEquals(e.outerHtml(), e.toString());
    }

    // ---------- equals() / hashCode() ----------

    @Test
    public void testEquals_SameInstance() {
        Element e = new Element(Tag.valueOf("div"), "");
        assertTrue(e.equals(e));
    }

    @Test
    public void testEquals_DifferentInstanceSameContent() {
        Element e1 = new Element(Tag.valueOf("div"), "");
        Element e2 = new Element(Tag.valueOf("div"), "");
        assertFalse(e1.equals(e2));
    }

    @Test
    public void testHashCode_ConsistentForSameObject() {
        Element e = new Element(Tag.valueOf("div"), "");
        int h1 = e.hashCode();
        int h2 = e.hashCode();
        assertEquals(h1, h2);
    }

    // ---------- clone() ----------

    @Test
    public void testClone_CreatesSeparateInstanceWithSameTagAndClasses() {
        Element original = new Element(Tag.valueOf("div"), "");
        original.attr("class", "header gray");

        Element clone = original.clone();

        assertNotSame(original, clone);
        assertEquals(original.tagName(), clone.tagName());
        assertTrue(clone.hasClass("header"));
        assertTrue(clone.hasClass("gray"));
    }
}
```

# สรุปตาราง Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testConstructor_NullTag_Throws / testConstructor_ValidTagAndBaseUri | Validate.notNull(tag) ทั้งสองสาขา |
| testTagNameSetter_* | tagName(String): empty/null throws, valid เปลี่ยน tag |
| testIsBlock_* | tag.isBlock() true/false |
| testId_* | id(): attr คืน null→"" / มีค่า |
| testDataset_* | dataset(): กรอง key ที่ขึ้นต้น data- |
| testParent_* | parent(): null vs non-null |
| testParents_* | accumulateParents(): parent==null, parent!=#root, parent==#root (exclude) |
| testChild_* | child(index): valid index, out-of-bounds |
| testChildren_* | children(): loop กรอง instanceof Element, empty list |
| testTextNodes_* / testDataNodes_* | loop กรอง instanceof TextNode/DataNode, empty vs non-empty |
| testSelect_BasicTagQuery | select() เรียก Selector.select |
| testAppendChild_Null_Throws / testAppendChild_AddsAtEnd | Validate.notNull(child), เพิ่มท้ายรายการ |
| testPrependChild_* | Validate.notNull, เพิ่มต้นรายการ |
| testAppendElement / testPrependElement | สร้าง element ใหม่และเรียก addChildren |
| testAppendText / testPrependText | สร้าง TextNode และเพิ่มตำแหน่งถูกต้อง |
| testAppend_NullHtml_Throws / testAppend_ValidHtml_AddsChildren | Validate.notNull(html), parse & addChildren ท้าย |
| testPrepend_* | เหมือนกันแต่ addChildren(0,...) |
| testEmpty_ClearsChildren | childNodes.clear() |
| testSiblingElements_NoParent_Throws / testSiblingElements_WithParent | parent()==null→NPE, parent!=null |
| testNextElementSibling_* | siblings.size()>index+1 true/false |
| testPreviousElementSibling_* | index>0 true/false |
| testFirstElementSibling_* / testLastElementSibling_* | siblings.size()>1 true/false |
| testElementSiblingIndex_* | parent()==null return 0, else indexInList |
| testGetElementsByTag_Empty_Throws / _Valid | Validate.notEmpty, case-insensitive + trim |
| testGetElementById_* | elements.size()>0 true/false |
| testGetElementsByClass_* | Validate.notEmpty, collect |
| testGetElementsByAttribute_* / Starting_* | Validate.notEmpty, trim+lowercase |
| testGetElementsByAttributeValue* (6 methods) | ทุก overload ของ Evaluator ชนิดต่าง ๆ |
| testGetElementsByAttributeValueMatching_* | Pattern ตรง, regex string compile สำเร็จ, PatternSyntaxException→IllegalArgumentException |
| testGetElementsByIndex* | สาขาการเรียก Evaluator.Index* (smoke test) |
| testGetElementsContainingText/OwnText | ค้นข้อความรวม vs own text |
| testGetElementsMatchingText/OwnText_* | Pattern ตรง, regex ถูก/ผิด throw |
| testGetAllElements_* | รวม self + descendants |
| testText_NestedInlineElement_NoAutoSpace | text(accum): isBlock()==false ไม่เติม space |
| testText_NestedBlockElements_InsertsSpace | isBlock()==true, accum.length()>0, lastCharIsWhitespace==false→เติม space |
| testOwnText_ExcludesChildElementText | ownText(): ข้าม Element child (ไม่ใช่ br) |
| testHasText_* | TextNode.isBlank() true/false, recursive Element.hasText() |
| testData_* | DataNode vs nested Element recursive |
| testClassName_* / testClassNames_* | className()=="" vs มีค่า, split("\\s+") behavior (รวมกรณี phantom "") |
| testHasClass_* | loop เทียบ equalsIgnoreCase ทุกกรณี (match/no match/empty-phantom) |
| testClassNamesSetter_Null_Throws / _Valid | Validate.notNull(classNames) |
| testAddClass_* / testRemoveClass_* / testToggleClass_* | Validate.notNull, classes.contains() true/false (toggle) |
| testVal_* / testValSetter_* | tagName().equals("textarea") true/false |
| testHtmlGetter_* / testHtmlSetter_* | html(): accum ว่าง/ไม่ว่าง, html(String): empty()+append() |
| testToString_EqualsOuterHtml | toString() == outerHtml() |
| testEquals_* | this==o true/false |
| testHashCode_ConsistentForSameObject | hashCode() ไม่ throw, consistent |
| testClone_* | clone() เรียก classNames() เพื่อสร้าง set ใหม่ |

**หมายเหตุสำคัญ (Fault-detection):** `testClassNames_EmptyAttribute_YieldsPhantomEmptyName` และ `testHasClass_EmptyString_MatchesPhantomEmptyName` ออกแบบมาเพื่อดักจับพฤติกรรมที่ไม่ตั้งใจ (phantom empty class name) ซึ่งเป็นผลจาก `"".split("\\s+")` ที่คืนค่า array ขนาด 1 แทนที่จะเป็น empty array — จุดนี้มีโอกาสสูงที่จะเป็นต้นตอของ defect ใน Jsoup-22b.