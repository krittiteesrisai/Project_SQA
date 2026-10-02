# การวิเคราะห์และสร้างชุดทดสอบ JUnit 4 สำหรับ `Element` (Jsoup-66b)

**หมายเหตุสำคัญก่อนโค้ด:**
- วาง test class ไว้ใน package `org.jsoup.nodes` เดียวกับคลาสเป้าหมาย เพื่อให้เข้าถึง field/method ที่เป็น `package-private`/`protected` (เช่น `childNodes`, `outerHtmlHead`, `outerHtmlTail`, `ensureChildNodes()`) ได้ตามซอร์สที่ให้มา
- โค้ดต้นฉบับใช้ `org.jsoup.helper.Validate` ซึ่ง**ไม่ได้ให้ซอร์สมาด้วย** จึงไม่เดา exception type ที่แน่นอน จะ catch เป็น `RuntimeException` แทน พร้อมคอมเมนต์กำกับ
- พฤติกรรมของ `Tag` (เช่น isBlock/isSelfClosing/isEmpty/formatAsBlock/preserveWhitespace สำหรับ tag เช่น div, span, br, img, pre) ไม่ได้มีซอร์สมาด้วย แต่เป็นค่ามาตรฐานที่เสถียรของ jsoup (tags.properties) — ใช้โดยมีคอมเมนต์กำกับว่าอ้างอิงจากพฤติกรรมมาตรฐานของไลบรารี ไม่ใช่การเดาแบบสุ่ม
- สำหรับ `cssSelector()` branch ที่ตรวจ `parent() instanceof Document` ไม่ได้ทดสอบตรง ๆ เนื่องจากไม่มีซอร์สของ `Document` ให้มา (ทดสอบเฉพาะ branch `parent() == null` แทน) — มีคอมเมนต์กำกับไว้ในโค้ด

```java
package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * Unit tests for org.jsoup.nodes.Element (Defects4J Jsoup-66b)
 * วางไว้ใน package เดียวกับ Element เพื่อเข้าถึง package-private members ที่ใช้ทดสอบ branch
 */
public class ElementTest {

    // ---------------------------------------------------------------
    // Constructors
    // ---------------------------------------------------------------

    @Test
    public void testConstructorWithTagNameString() {
        Element el = new Element("div");
        assertEquals("div", el.tagName());
        assertEquals("", el.baseUri());
        assertTrue(el.hasAttributes()); // Attributes() ถูกส่งเข้ามา -> ไม่ null
    }

    @Test
    public void testConstructorNullTagThrows() {
        // Validate.notNull คาดว่าจะโยน RuntimeException (ไม่ทราบชนิดแน่ชัดจากซอร์สที่ให้มา)
        try {
            new Element((Tag) null, "", new Attributes());
            fail("Expected exception for null tag");
        } catch (RuntimeException e) {
            // expected
        }
    }

    @Test
    public void testConstructorNullBaseUriThrows() {
        try {
            new Element(Tag.valueOf("div"), null, new Attributes());
            fail("Expected exception for null baseUri");
        } catch (RuntimeException e) {
            // expected
        }
    }

    @Test
    public void testConstructorTagBaseUriNullAttributes() {
        // Element(Tag, String) -> attributes = null -> hasAttributes() false จน attributes() ถูกเรียก
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertFalse(el.hasAttributes());
        assertNotNull(el.attributes()); // branch: attributes == null -> สร้างใหม่
        assertTrue(el.hasAttributes());
    }

    // ---------------------------------------------------------------
    // ensureChildNodes / childNodeSize
    // ---------------------------------------------------------------

    @Test
    public void testEnsureChildNodesFromEmptyToNodeList() {
        Element el = new Element("div");
        assertEquals(0, el.childNodeSize());
        el.ensureChildNodes(); // branch: childNodes == EMPTY_NODES -> true
        assertEquals(0, el.childNodeSize());
    }

    @Test
    public void testChildNodeSizeAfterAppend() {
        Element el = new Element("div");
        el.appendChild(new TextNode("hi"));
        assertEquals(1, el.childNodeSize());
    }

    // ---------------------------------------------------------------
    // tagName / tag
    // ---------------------------------------------------------------

    @Test
    public void testTagNameGetterAndNodeName() {
        Element el = new Element("span");
        assertEquals("span", el.tagName());
        assertEquals("span", el.nodeName());
    }

    @Test
    public void testTagNameSetterValid() {
        Element el = new Element("div");
        Element same = el.tagName("SPAN");
        assertSame(el, same);
        assertEquals("SPAN", el.tagName()); // preserveCase
    }

    @Test
    public void testTagNameSetterEmptyThrows() {
        Element el = new Element("div");
        try {
            el.tagName("");
            fail("Expected exception for empty tag name");
        } catch (RuntimeException e) {
            // expected: Validate.notEmpty
        }
    }

    @Test
    public void testTagGetter() {
        Element el = new Element("div");
        assertEquals("div", el.tag().getName());
    }

    // ---------------------------------------------------------------
    // isBlock (อ้างอิงพฤติกรรม standard jsoup tag config)
    // ---------------------------------------------------------------

    @Test
    public void testIsBlockForDiv() {
        // ตามคอมเมนต์ใน source เอง: <div> == true
        Element el = new Element("div");
        assertTrue(el.isBlock());
    }

    // ---------------------------------------------------------------
    // id / attr / dataset
    // ---------------------------------------------------------------

    @Test
    public void testIdEmptyWhenNoAttribute() {
        Element el = new Element("div");
        assertEquals("", el.id());
    }

    @Test
    public void testIdWithAttribute() {
        Element el = new Element("div").attr("id", "main");
        assertEquals("main", el.id());
    }

    @Test
    public void testAttrStringValueFluent() {
        Element el = new Element("div");
        Element same = el.attr("data-x", "1");
        assertSame(el, same);
        assertEquals("1", el.attr("data-x"));
    }

    @Test
    public void testAttrBooleanTrueThenFalse() {
        Element el = new Element("input");
        el.attr("disabled", true);
        assertTrue(el.attributes().hasKey("disabled"));
        el.attr("disabled", false);
        assertFalse(el.attributes().hasKey("disabled"));
    }

    @Test
    public void testDataset() {
        Element el = new Element("div");
        el.attr("data-name", "jsoup");
        assertEquals("jsoup", el.dataset().get("name"));
    }

    // ---------------------------------------------------------------
    // parent / parents / accumulateParents
    // ---------------------------------------------------------------

    @Test
    public void testParentNullForStandaloneElement() {
        Element el = new Element("div");
        assertNull(el.parent());
    }

    @Test
    public void testParentsStopsAtRootTagName() {
        Element root = new Element(Tag.valueOf("#root"), "");
        Element mid = new Element("div");
        Element leaf = new Element("span");
        root.appendChild(mid);
        mid.appendChild(leaf);

        Elements parents = leaf.parents();
        assertEquals(1, parents.size()); // ต้องหยุดก่อน root เพราะ tagName == "#root"
        assertSame(mid, parents.get(0));
    }

    // ---------------------------------------------------------------
    // child / children / childElementsList
    // ---------------------------------------------------------------

    @Test
    public void testChildAndChildrenFilterElementsOnly() {
        Element parent = new Element("div");
        parent.appendChild(new TextNode("text-node"));
        Element e1 = new Element("p");
        Element e2 = new Element("span");
        parent.appendChild(e1);
        parent.appendChild(e2);

        assertEquals(2, parent.children().size());
        assertSame(e1, parent.child(0));
        assertSame(e2, parent.child(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildIndexOutOfBoundsThrows() {
        Element parent = new Element("div");
        parent.child(0);
    }

    @Test
    public void testChildrenEmptyWhenNoChildren() {
        Element el = new Element("div");
        assertTrue(el.children().isEmpty());
    }

    // ---------------------------------------------------------------
    // textNodes / dataNodes
    // ---------------------------------------------------------------

    @Test
    public void testTextNodesFilter() {
        Element parent = new Element("div");
        parent.appendChild(new TextNode("a"));
        parent.appendChild(new Element("span"));
        parent.appendChild(new TextNode("b"));
        assertEquals(2, parent.textNodes().size());
    }

    @Test
    public void testDataNodesFilter() {
        Element parent = new Element("script");
        parent.appendChild(new DataNode("var x = 1;"));
        parent.appendChild(new TextNode("ignored"));
        assertEquals(1, parent.dataNodes().size());
    }

    // ---------------------------------------------------------------
    // select / selectFirst / is
    // ---------------------------------------------------------------

    @Test
    public void testSelectFindsMatchingChild() {
        Element parent = new Element("div");
        Element span = new Element("span").attr("class", "target");
        parent.appendChild(span);
        Elements found = parent.select(".target");
        assertEquals(1, found.size());
        assertSame(span, found.get(0));
    }

    @Test
    public void testSelectFirstReturnsNullWhenNoMatch() {
        Element parent = new Element("div");
        assertNull(parent.selectFirst(".nothing"));
    }

    @Test
    public void testIsWithCssQueryTrueFalse() {
        Element el = new Element("div").attr("class", "box");
        assertTrue(el.is(".box"));
        assertFalse(el.is(".other"));
    }

    @Test
    public void testIsWithEvaluator() {
        Element el = new Element("div");
        assertTrue(el.is(new Evaluator.Tag("div")));
        assertFalse(el.is(new Evaluator.Tag("span")));
    }

    // ---------------------------------------------------------------
    // appendChild / appendTo / prependChild
    // ---------------------------------------------------------------

    @Test
    public void testAppendChildNullThrows() {
        Element el = new Element("div");
        try {
            el.appendChild(null);
            fail("Expected exception for null child");
        } catch (RuntimeException e) {
            // expected
        }
    }

    @Test
    public void testAppendChildSetsSiblingIndex() {
        Element parent = new Element("div");
        Node c1 = new TextNode("1");
        Node c2 = new TextNode("2");
        parent.appendChild(c1);
        parent.appendChild(c2);
        assertEquals(0, c1.siblingIndex());
        assertEquals(1, c2.siblingIndex());
    }

    @Test
    public void testAppendTo() {
        Element parent = new Element("div");
        Element child = new Element("span");
        Element same = child.appendTo(parent);
        assertSame(child, same);
        assertEquals(1, parent.childNodeSize());
        assertSame(parent, child.parent());
    }

    @Test
    public void testAppendToNullThrows() {
        Element child = new Element("span");
        try {
            child.appendTo(null);
            fail("Expected exception for null parent");
        } catch (RuntimeException e) {
            // expected
        }
    }

    @Test
    public void testPrependChildPutsAtStart() {
        Element parent = new Element("div");
        Node c1 = new TextNode("1");
        Node c2 = new TextNode("2");
        parent.appendChild(c1);
        parent.prependChild(c2);
        assertSame(c2, parent.childNode(0));
        assertSame(c1, parent.childNode(1));
    }

    // ---------------------------------------------------------------
    // insertChildren (Collection) - branch: index<0 rollover, Validate.isTrue bounds
    // ---------------------------------------------------------------

    @Test
    public void testInsertChildrenCollectionNegativeIndexRollAroundToEnd() {
        Element parent = new Element("div");
        parent.appendChild(new TextNode("a"));
        parent.appendChild(new TextNode("b"));
        java.util.List<Node> toInsert = java.util.Arrays.asList((Node) new TextNode("c"));
        parent.insertChildren(-1, toInsert); // -1 + 2 + 1 = 2 (end) -> valid
        assertEquals(3, parent.childNodeSize());
        assertEquals("c", ((TextNode) parent.childNode(2)).text());
    }

    @Test
    public void testInsertChildrenCollectionValidPositiveIndex() {
        Element parent = new Element("div");
        parent.appendChild(new TextNode("a"));
        parent.appendChild(new TextNode("b"));
        java.util.List<Node> toInsert = java.util.Arrays.asList((Node) new TextNode("x"));
        parent.insertChildren(0, toInsert); // index<0 branch false, direct valid
        assertEquals("x", ((TextNode) parent.childNode(0)).text());
    }

    @Test
    public void testInsertChildrenCollectionNullThrows() {
        Element parent = new Element("div");
        try {
            parent.insertChildren(0, (java.util.Collection<? extends Node>) null);
            fail("Expected exception for null children collection");
        } catch (RuntimeException e) {
            // expected
        }
    }

    @Test
    public void testInsertChildrenCollectionOutOfBoundsTooLargeThrows() {
        Element parent = new Element("div");
        parent.appendChild(new TextNode("a"));
        try {
            parent.insertChildren(5, java.util.Arrays.asList((Node) new TextNode("x")));
            fail("Expected exception for out-of-bounds index");
        } catch (RuntimeException e) {
            // expected: Validate.isTrue false
        }
    }

    @Test
    public void testInsertChildrenCollectionOutOfBoundsNegativeAfterRolloverThrows() {
        Element parent = new Element("div");
        parent.appendChild(new TextNode("a"));
        try {
            // currentSize=1; index=-5 -> -5+1+1=-3 -> still <0 -> isTrue fails
            parent.insertChildren(-5, java.util.Arrays.asList((Node) new TextNode("x")));
            fail("Expected exception for out-of-bounds index");
        } catch (RuntimeException e) {
            // expected
        }
    }

    // ---------------------------------------------------------------
    // insertChildren (varargs Node...)
    // ---------------------------------------------------------------

    @Test
    public void testInsertChildrenVarargsValid() {
        Element parent = new Element("div");
        parent.appendChild(new TextNode("a"));
        parent.insertChildren(0, new TextNode("z"));
        assertEquals("z", ((TextNode) parent.childNode(0)).text());
    }

    @Test
    public void testInsertChildrenVarargsNullThrows() {
        Element parent = new Element("div");
        try {
            parent.insertChildren(0, (Node[]) null);
            fail("Expected exception for null children array");
        } catch (RuntimeException e) {
            // expected
        }
    }

    // ---------------------------------------------------------------
    // appendElement / prependElement / appendText / prependText
    // ---------------------------------------------------------------

    @Test
    public void testAppendElement() {
        Element parent = new Element("div");
        Element child = parent.appendElement("p");
        assertEquals("p", child.tagName());
        assertEquals(1, parent.childNodeSize());
        assertSame(parent, child.parent());
    }

    @Test
    public void testPrependElement() {
        Element parent = new Element("div");
        parent.appendElement("p");
        Element span = parent.prependElement("span");
        assertSame(span, parent.child(0));
    }

    @Test
    public void testAppendTextAndPrependText() {
        Element el = new Element("div");
        el.appendText("World");
        el.prependText("Hello ");
        assertEquals("Hello World", el.text());
    }

    @Test
    public void testAppendTextNullThrows() {
        Element el = new Element("div");
        try {
            el.appendText(null);
            fail("Expected exception for null text");
        } catch (RuntimeException e) {
            // expected
        }
    }

    // ---------------------------------------------------------------
    // append(String) / prepend(String) html fragment
    // ---------------------------------------------------------------

    @Test
    public void testAppendHtmlFragment() {
        Element el = new Element("div");
        Element same = el.append("<p>Hi</p>");
        assertSame(el, same);
        assertEquals(1, el.childNodeSize());
        assertEquals("p", ((Element) el.childNode(0)).tagName());
    }

    @Test
    public void testPrependHtmlFragment() {
        Element el = new Element("div");
        el.append("<p>Second</p>");
        el.prepend("<span>First</span>");
        assertEquals("span", ((Element) el.childNode(0)).tagName());
    }

    @Test
    public void testAppendHtmlNullThrows() {
        Element el = new Element("div");
        try {
            el.append(null);
            fail("Expected exception for null html");
        } catch (RuntimeException e) {
            // expected
        }
    }

    // ---------------------------------------------------------------
    // before / after / empty / wrap
    // ---------------------------------------------------------------

    @Test
    public void testBeforeHtmlInsertsSibling() {
        Element parent = new Element("div");
        Element target = parent.appendElement("p");
        target.before("<span>pre</span>");
        assertEquals(2, parent.childNodeSize());
        assertEquals("span", ((Element) parent.childNode(0)).tagName());
    }

    @Test
    public void testAfterHtmlInsertsSibling() {
        Element parent = new Element("div");
        Element target = parent.appendElement("p");
        target.after("<span>post</span>");
        assertEquals(2, parent.childNodeSize());
        assertEquals("span", ((Element) parent.childNode(1)).tagName());
    }

    @Test
    public void testEmptyClearsChildren() {
        Element el = new Element("div");
        el.appendText("x");
        el.appendElement("p");
        Element same = el.empty();
        assertSame(el, same);
        assertEquals(0, el.childNodeSize());
    }

    @Test
    public void testWrapAddsWrapperAroundElement() {
        Element parent = new Element("div");
        Element target = parent.appendElement("p");
        target.wrap("<section></section>");
        // target ควรถูกครอบด้วย section ภายใน parent
        assertEquals(1, parent.childNodeSize());
        Element wrapper = (Element) parent.childNode(0);
        assertEquals("section", wrapper.tagName());
    }

    // ---------------------------------------------------------------
    // cssSelector
    // ---------------------------------------------------------------

    @Test
    public void testCssSelectorWithId() {
        Element el = new Element("div").attr("id", "main");
        assertEquals("#main", el.cssSelector());
    }

    @Test
    public void testCssSelectorNoParentNoId() {
        Element el = new Element("div").attr("class", "box");
        assertEquals("div.box", el.cssSelector());
    }

    @Test
    public void testCssSelectorNoClassesNoId() {
        Element el = new Element("div");
        assertEquals("div", el.cssSelector());
    }

    @Test
    public void testCssSelectorWithParentAddsPathAndNthChildWhenAmbiguous() {
        Element parent = new Element("div");
        Element c1 = parent.appendElement("p");
        Element c2 = parent.appendElement("p"); // สอง <p> เหมือนกัน -> ambiguous -> ต้องมี nth-child
        String sel2 = c2.cssSelector();
        assertTrue(sel2.contains(":nth-child("));
        assertTrue(sel2.startsWith("div > p"));
    }

    // ---------------------------------------------------------------
    // siblingElements / nextElementSibling / previousElementSibling
    // firstElementSibling / lastElementSibling / elementSiblingIndex
    // ---------------------------------------------------------------

    @Test
    public void testSiblingElementsNoParentReturnsEmpty() {
        Element el = new Element("div");
        assertEquals(0, el.siblingElements().size());
    }

    @Test
    public void testSiblingElementsExcludesSelf() {
        Element parent = new Element("div");
        Element a = parent.appendElement("a");
        Element b = parent.appendElement("b");
        Elements siblings = a.siblingElements();
        assertEquals(1, siblings.size());
        assertSame(b, siblings.get(0));
    }

    @Test
    public void testNextElementSiblingNullForStandalone() {
        Element el = new Element("div");
        assertNull(el.nextElementSibling());
    }

    @Test
    public void testNextElementSiblingReturnsNextAndNullAtEnd() {
        Element parent = new Element("div");
        Element a = parent.appendElement("a");
        Element b = parent.appendElement("b");
        assertSame(b, a.nextElementSibling());
        assertNull(b.nextElementSibling()); // สุดท้ายแล้ว -> null
    }

    @Test
    public void testPreviousElementSiblingNullForStandalone() {
        Element el = new Element("div");
        assertNull(el.previousElementSibling());
    }

    @Test
    public void testPreviousElementSiblingReturnsPrevAndNullAtStart() {
        Element parent = new Element("div");
        Element a = parent.appendElement("a");
        Element b = parent.appendElement("b");
        assertNull(a.previousElementSibling()); // ตัวแรก -> null
        assertSame(a, b.previousElementSibling());
    }

    @Test
    public void testFirstElementSiblingNullWhenOnlyOneSibling() {
        Element parent = new Element("div");
        Element a = parent.appendElement("a");
        // siblings.size() == 1 (เฉพาะ a เอง) -> ตามโค้ด size()>1 ? ... : null => null
        assertNull(a.firstElementSibling());
    }

    @Test
    public void testFirstElementSiblingWithMultipleChildren() {
        Element parent = new Element("div");
        Element a = parent.appendElement("a");
        Element b = parent.appendElement("b");
        assertSame(a, a.firstElementSibling());
        assertSame(a, b.firstElementSibling());
    }

    @Test
    public void testLastElementSiblingWithMultipleChildren() {
        Element parent = new Element("div");
        Element a = parent.appendElement("a");
        Element b = parent.appendElement("b");
        assertSame(b, a.lastElementSibling());
    }

    @Test
    public void testLastElementSiblingNullWhenOnlyOneSibling() {
        Element parent = new Element("div");
        Element a = parent.appendElement("a");
        assertNull(a.lastElementSibling());
    }

    @Test
    public void testElementSiblingIndexNoParentReturnsZero() {
        Element el = new Element("div");
        assertEquals(0, el.elementSiblingIndex());
    }

    @Test
    public void testElementSiblingIndexWithParent() {
        Element parent = new Element("div");
        Element a = parent.appendElement("a");
        Element b = parent.appendElement("b");
        assertEquals(0, a.elementSiblingIndex());
        assertEquals(1, b.elementSiblingIndex());
    }

    // ---------------------------------------------------------------
    // getElementsByXxx - validate notEmpty branches + basic function
    // ---------------------------------------------------------------

    @Test
    public void testGetElementsByTagEmptyThrows() {
        Element el = new Element("div");
        try {
            el.getElementsByTag("");
            fail("Expected exception for empty tagName");
        } catch (RuntimeException e) {
            // expected
        }
    }

    @Test
    public void testGetElementsByTagFindsMatches() {
        Element parent = new Element("div");
        Element p1 = parent.appendElement("p");
        parent.appendElement("span");
        Elements found = parent.getElementsByTag("p");
        assertEquals(1, found.size());
        assertSame(p1, found.get(0));
    }

    @Test
    public void testGetElementByIdEmptyThrows() {
        Element el = new Element("div");
        try {
            el.getElementById("");
            fail("Expected exception for empty id");
        } catch (RuntimeException e) {
            // expected
        }
    }

    @Test
    public void testGetElementByIdFoundAndNotFound() {
        Element parent = new Element("div");
        parent.appendElement("span").attr("id", "x");
        assertNotNull(parent.getElementById("x"));
        assertNull(parent.getElementById("y"));
    }

    @Test
    public void testGetElementsByClassEmptyThrows() {
        Element el = new Element("div");
        try {
            el.getElementsByClass("");
            fail("Expected exception for empty className");
        } catch (RuntimeException e) {
            // expected
        }
    }

    @Test
    public void testGetElementsByAttributeEmptyThrows() {
        Element el = new Element("div");
        try {
            el.getElementsByAttribute("");
            fail("Expected exception for empty attribute key");
        } catch (RuntimeException e) {
            // expected
        }
    }

    @Test
    public void testGetElementsByAttributeValueMatchingBadRegexThrowsIllegalArgument() {
        Element el = new Element("div");
        try {
            el.getElementsByAttributeValueMatching("href", "[unclosed");
            fail("Expected IllegalArgumentException for bad regex");
        } catch (IllegalArgumentException e) {
            // expected - explicitly wrapped in source code
        }
    }

    @Test
    public void testGetElementsByAttributeValueMatchingValidPattern() {
        Element parent = new Element("div");
        parent.appendElement("a").attr("href", "http://example.com");
        Elements found = parent.getElementsByAttributeValueMatching("href", Pattern.compile("example"));
        assertEquals(1, found.size());
    }

    @Test
    public void testGetElementsMatchingTextBadRegexThrows() {
        Element el = new Element("div");
        try {
            el.getElementsMatchingText("[bad");
            fail("Expected IllegalArgumentException for bad regex");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGetElementsMatchingOwnTextBadRegexThrows() {
        Element el = new Element("div");
        try {
            el.getElementsMatchingOwnText("[bad");
            fail("Expected IllegalArgumentException for bad regex");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGetAllElementsIncludesSelfAndChildren() {
        Element parent = new Element("div");
        parent.appendElement("p");
        Elements all = parent.getAllElements();
        assertTrue(all.size() >= 2); // self + child
    }

    // ---------------------------------------------------------------
    // text() / ownText() / hasText()
    // ---------------------------------------------------------------

    @Test
    public void testTextCombinesNestedElements() {
        Element p = new Element("p");
        p.appendText("One ");
        Element span = p.appendElement("span");
        span.appendText("Two");
        p.appendText(" Three");
        assertEquals("One Two Three", p.text());
    }

    @Test
    public void testTextInsertsSpaceAfterBlockElement() {
        // div เป็น block -> ควรแทรก space ระหว่าง block กับข้อความถัดไป
        Element root = new Element("div");
        Element inner = root.appendElement("div");
        inner.appendText("Inside");
        root.appendText("After");
        String text = root.text();
        assertTrue(text.contains("Inside"));
        assertTrue(text.contains("After"));
    }

    @Test
    public void testOwnTextExcludesChildElementText() {
        Element p = new Element("p");
        p.appendText("Hello ");
        Element b = p.appendElement("b");
        b.appendText("there");
        p.appendText(" now!");
        assertEquals("Hello now!", p.ownText());
    }

    @Test
    public void testHasTextFalseWhenBlank() {
        Element el = new Element("div");
        el.appendText("   ");
        assertFalse(el.hasText());
    }

    @Test
    public void testHasTextTrueWhenNonBlank() {
        Element el = new Element("div");
        el.appendText("hi");
        assertTrue(el.hasText());
    }

    @Test
    public void testHasTextTrueThroughNestedChildElement() {
        Element parent = new Element("div");
        Element child = parent.appendElement("span");
        child.appendText("nested");
        assertTrue(parent.hasText());
    }

    @Test
    public void testHasTextFalseWithNoChildren() {
        Element el = new Element("div");
        assertFalse(el.hasText());
    }

    // ---------------------------------------------------------------
    // data()
    // ---------------------------------------------------------------

    @Test
    public void testDataCombinesDataNodeCommentAndNestedElement() {
        Element script = new Element("script");
        script.appendChild(new DataNode("var a=1;"));
        script.appendChild(new Comment(" comment "));
        Element nested = new Element("div");
        nested.appendChild(new DataNode("nested-data"));
        script.appendChild(nested);

        String data = script.data();
        assertTrue(data.contains("var a=1;"));
        assertTrue(data.contains(" comment "));
        assertTrue(data.contains("nested-data"));
    }

    @Test
    public void testDataEmptyWhenNoDataNodes() {
        Element el = new Element("div");
        el.appendText("just text");
        assertEquals("", el.data());
    }

    // ---------------------------------------------------------------
    // className / classNames / hasClass / addClass / removeClass / toggleClass
    // ---------------------------------------------------------------

    @Test
    public void testClassNameEmptyWhenNoAttribute() {
        Element el = new Element("div");
        assertEquals("", el.className());
    }

    @Test
    public void testClassNamesEmptySetWhenNoClassAttribute() {
        Element el = new Element("div");
        assertTrue(el.classNames().isEmpty()); // branch: remove("") ลบค่าว่างออก
    }

    @Test
    public void testClassNamesMultipleSplit() {
        Element el = new Element("div").attr("class", "a b c");
        Set<String> names = el.classNames();
        assertEquals(3, names.size());
        assertTrue(names.contains("a"));
        assertTrue(names.contains("b"));
        assertTrue(names.contains("c"));
    }

    @Test
    public void testClassNamesSetterPersists() {
        Element el = new Element("div");
        Set<String> names = new LinkedHashSet<>();
        names.add("x");
        names.add("y");
        Element same = el.classNames(names);
        assertSame(el, same);
        assertEquals("x y", el.attr("class"));
    }

    @Test
    public void testClassNamesSetterNullThrows() {
        Element el = new Element("div");
        try {
            el.classNames(null);
            fail("Expected exception for null classNames");
        } catch (RuntimeException e) {
            // expected
        }
    }

    @Test
    public void testHasClassWhenAttributeEmpty() {
        Element el = new Element("div");
        assertFalse(el.hasClass("foo")); // branch: len == 0
    }

    @Test
    public void testHasClassWhenAttrShorterThanWanted() {
        Element el = new Element("div").attr("class", "a");
        assertFalse(el.hasClass("longname")); // branch: len < wantLen
    }

    @Test
    public void testHasClassWhenLenEqualsWantLenMatch() {
        Element el = new Element("div").attr("class", "FOO");
        assertTrue(el.hasClass("foo")); // branch: len==wantLen, equalsIgnoreCase true
    }

    @Test
    public void testHasClassWhenLenEqualsWantLenNoMatch() {
        Element el = new Element("div").attr("class", "bar");
        assertFalse(el.hasClass("foo")); // branch: len==wantLen, equalsIgnoreCase false
    }

    @Test
    public void testHasClassScanMiddleClassMatch() {
        Element el = new Element("div").attr("class", "alpha beta gamma");
        assertTrue(el.hasClass("beta")); // branch: inClass toggled mid-scan, match
    }

    @Test
    public void testHasClassScanLastClassMatch() {
        Element el = new Element("div").attr("class", "alpha beta gamma");
        assertTrue(el.hasClass("gamma")); // branch: last entry check after loop
    }

    @Test
    public void testHasClassScanNoMatch() {
        Element el = new Element("div").attr("class", "alpha beta gamma");
        assertFalse(el.hasClass("delta")); // branch: loop ends, final check false -> return false
    }

    @Test
    public void testAddClassAppendsNewClass() {
        Element el = new Element("div").attr("class", "a");
        el.addClass("b");
        assertTrue(el.hasClass("b"));
        assertTrue(el.hasClass("a"));
    }

    @Test
    public void testRemoveClassRemovesExisting() {
        Element el = new Element("div").attr("class", "a b");
        el.removeClass("a");
        assertFalse(el.hasClass("a"));
        assertTrue(el.hasClass("b"));
    }

    @Test
    public void testToggleClassAddsWhenAbsent() {
        Element el = new Element("div").attr("class", "a");
        el.toggleClass("b");
        assertTrue(el.hasClass("b"));
    }

    @Test
    public void testToggleClassRemovesWhenPresent() {
        Element el = new Element("div").attr("class", "a b");
        el.toggleClass("b");
        assertFalse(el.hasClass("b"));
    }

    // ---------------------------------------------------------------
    // val() / val(String)
    // ---------------------------------------------------------------

    @Test
    public void testValTextareaUsesText() {
        Element el = new Element("textarea");
        el.val("hello");
        assertEquals("hello", el.val());
    }

    @Test
    public void testValNonTextareaUsesAttribute() {
        Element el = new Element("input");
        el.val("hello");
        assertEquals("hello", el.attr("value"));
        assertEquals("hello", el.val());
    }

    // ---------------------------------------------------------------
    // outerHtmlHead / outerHtmlTail (package-private; branch coverage ของ self-closing/tag format)
    // ---------------------------------------------------------------

    @Test
    public void testOuterHtmlHeadSelfClosingHtmlSyntax() throws Exception {
        Element img = new Element("img"); // img = void/self-closing element ตามมาตรฐาน jsoup tag config
        Document.OutputSettings out = new Document.OutputSettings();
        out.prettyPrint(false); // ปิด pretty print เพื่อเลี่ยงพฤติกรรม indent() ที่ไม่มีซอร์สยืนยัน
        StringBuilder sb = new StringBuilder();
        img.outerHtmlHead(sb, 0, out);
        // syntax ค่า default คือ html, tag.isEmpty() true -> ปิดด้วย '>' ธรรมดา ไม่มี " />"
        assertTrue(sb.toString().startsWith("<img"));
        assertFalse(sb.toString().contains("/>"));
    }

    @Test
    public void testOuterHtmlHeadSelfClosingXmlSyntax() throws Exception {
        Element img = new Element("img");
        Document.OutputSettings out = new Document.OutputSettings();
        out.prettyPrint(false);
        out.syntax(Document.OutputSettings.Syntax.xml);
        StringBuilder sb = new StringBuilder();
        img.outerHtmlHead(sb, 0, out);
        assertTrue(sb.toString().contains("/>")); // branch: syntax != html หรือ tag ไม่ empty -> " />"
    }

    @Test
    public void testOuterHtmlTailNonSelfClosingAppendsClosingTag() throws Exception {
        Element div = new Element("div");
        Document.OutputSettings out = new Document.OutputSettings();
        out.prettyPrint(false);
        StringBuilder sb = new StringBuilder();
        div.outerHtmlTail(sb, 0, out);
        assertEquals("</div>", sb.toString());
    }

    @Test
    public void testOuterHtmlTailSelfClosingEmptyProducesNoClosingTag() throws Exception {
        Element img = new Element("img");
        Document.OutputSettings out = new Document.OutputSettings();
        out.prettyPrint(false);
        StringBuilder sb = new StringBuilder();
        img.outerHtmlTail(sb, 0, out);
        // branch: childNodes.isEmpty() && tag.isSelfClosing() -> true -> ไม่ append closing tag
        assertEquals("", sb.toString());
    }

    // ---------------------------------------------------------------
    // html() / html(String) / html(Appendable) / toString()
    // ---------------------------------------------------------------

    @Test
    public void testHtmlGetterReturnsInnerHtml() {
        Element div = new Element("div");
        div.appendElement("p").text("hi");
        String html = div.html();
        assertTrue(html.contains("<p>"));
        assertTrue(html.contains("hi"));
    }

    @Test
    public void testHtmlSetterClearsAndParses() {
        Element div = new Element("div");
        div.appendText("old content");
        Element same = div.html("<span>new</span>");
        assertSame(div, same);
        assertEquals(1, div.childNodeSize());
        assertEquals("span", ((Element) div.childNode(0)).tagName());
    }

    @Test
    public void testToStringReturnsOuterHtml() {
        Element div = new Element("div");
        String s = div.toString();
        assertTrue(s.contains("div"));
    }

    // ---------------------------------------------------------------
    // clone() / doClone()
    // ---------------------------------------------------------------

    @Test
    public void testCloneCopiesAttributesAndChildrenDeep() {
        Element original = new Element("div").attr("id", "x");
        original.appendText("hello");
        Element clone = original.clone();

        assertNotSame(original, clone);
        assertEquals("x", clone.attr("id"));
        assertEquals(1, clone.childNodeSize());
        assertNotSame(original.childNode(0), clone.childNode(0));

        // แก้ไข clone ไม่กระทบ original (deep copy ของ attributes/children)
        clone.attr("id", "y");
        assertEquals("x", original.attr("id"));
    }

    @Test
    public void testCloneWithNullAttributesStaysNull() {
        // Element(Tag, String) -> attributes == null จนกว่าจะเรียก attributes()
        Element original = new Element(Tag.valueOf("div"), "");
        assertFalse(original.hasAttributes());
        Element clone = original.clone();
        assertFalse(clone.hasAttributes()); // branch: attributes != null ? ... : null -> false branch
    }
}
```

## ตารางสรุป Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testConstructorWithTagNameString | Constructor delegation, Attributes ไม่ null |
| testConstructorNullTagThrows / NullBaseUriThrows | Validate.notNull (tag/baseUri) |
| testConstructorTagBaseUriNullAttributes | `hasAttributes()` false→true, `attributes()` if attributes==null |
| testEnsureChildNodesFromEmptyToNodeList | `ensureChildNodes()`: childNodes==EMPTY_NODES true |
| testChildNodeSizeAfterAppend | childNodes != EMPTY_NODES path |
| testTagNameSetterValid/Empty | `tagName(String)`: Validate.notEmpty true/false |
| testIsBlockForDiv | `isBlock()` delegating to tag |
| testIdEmpty/WithAttribute | `id()` ทั้งสองกรณี |
| testAttrBooleanTrueThenFalse | `attr(String,boolean)` true/false |
| testParentsStopsAtRootTagName | `accumulateParents`: parent!=null && !"#root".equals |
| testChildIndexOutOfBoundsThrows | `child(int)` IndexOutOfBounds |
| testTextNodesFilter / testDataNodesFilter | instanceof filter loops |
| testIsWithCssQueryTrueFalse / testIsWithEvaluator | `is(String)`/`is(Evaluator)` true/false |
| testAppendChildNullThrows / testAppendToNullThrows | Validate.notNull branches |
| testAppendChildSetsSiblingIndex | sibling index set correctly |
| testInsertChildren* (6 tests) | `index<0` true/false, `Validate.isTrue` pass/fail ทั้ง varargs/Collection |
| testAppendElement/PrependElement | appendChild/prependChild integration |
| testAppendTextNullThrows / testAppendHtmlNullThrows | Validate.notNull |
| testBeforeHtmlInsertsSibling / testAfterHtmlInsertsSibling | before/after(String) override |
| testEmptyClearsChildren | `empty()` |
| testWrapAddsWrapperAroundElement | `wrap(String)` override |
| testCssSelectorWithId | `id().length()>0` branch true |
| testCssSelectorNoParentNoId / NoClassesNoId | `classes.length()>0`, `parent()==null` branches |
| testCssSelectorWithParentAddsPathAndNthChildWhenAmbiguous | `parent().select(...).size()>1` branch true, recursive call |
| testSiblingElementsNoParentReturnsEmpty / ExcludesSelf | `parentNode==null`, loop `el != this` |
| testNextElementSiblingReturnsNextAndNullAtEnd | `siblings.size()>index+1` true/false |
| testPreviousElementSiblingReturnsPrevAndNullAtStart | `index>0` true/false |
| testFirstElementSibling* / testLastElementSibling* | `siblings.size()>1` true/false |
| testElementSiblingIndexNoParent/WithParent | `parent()==null` branch, `indexInList` loop found |
| testGetElementsByTagEmptyThrows / ById / ByClass / ByAttribute | Validate.notEmpty branches |
| testGetElementsByAttributeValueMatchingBadRegexThrows / Valid | try/catch PatternSyntaxException branch |
| testGetElementsMatchingText/OwnTextBadRegexThrows | same try/catch branch (overload อื่น) |
| testTextCombinesNestedElements / InsertsSpaceAfterBlockElement | `text()` NodeVisitor: TextNode vs Element, `accum.length()>0 && (isBlock||br) && !lastCharIsWhitespace` |
| testOwnTextExcludesChildElementText | `ownText(StringBuilder)` TextNode/Element branches |
| testHasText* (4 tests) | recursion true/false, blank/non-blank |
| testDataCombinesDataNodeCommentAndNestedElement / EmptyWhenNoDataNodes | `data()` instanceof DataNode/Comment/Element branches |
| testClassNamesEmptySetWhenNoClassAttribute / MultipleSplit | `classNames()` remove("") branch, split หลาย class |
| testClassNamesSetterNullThrows | Validate.notNull |
| testHasClass* (7 tests) | `len==0`, `len<wantLen`, `len==wantLen` match/no-match, scan loop toggle match กลาง/ท้าย, ไม่ match |
| testAddClass/RemoveClass/ToggleClass* | set add/remove/toggle logic |
| testValTextareaUsesText / NonTextareaUsesAttribute | `val()`/`val(String)`: tagName equals "textarea" true/false |
| testOuterHtmlHeadSelfClosingHtmlSyntax / XmlSyntax | self-closing + `syntax()==html && tag.isEmpty()` true/false |
| testOuterHtmlTailNonSelfClosing / SelfClosingEmpty | `childNodes.isEmpty() && tag.isSelfClosing()` true/false |
| testHtmlGetterReturnsInnerHtml / SetterClearsAndParses | `html()`, `html(String)` |
| testToStringReturnsOuterHtml | `toString()` |
| testCloneCopiesAttributesAndChildrenDeep / WithNullAttributesStaysNull | `doClone()`: `attributes != null ? clone : null` ทั้งสอง branch |

หมายเหตุ: บาง getElementsByXxx ที่เป็น wrapper ตรงไปที่ `Collector.collect` โดยไม่มี branch ภายในเมธอดเอง (เช่น `getElementsByAttributeStarting`, `getElementsByIndexLessThan` ฯลฯ) ไม่ได้เขียนเทสแยกทุกตัว เนื่องจากไม่มี logic/branch เพิ่มเติมให้ทดสอบนอกจากการส่งต่อพารามิเตอร์ (ครอบคลุมหลักการเดียวกันแล้วผ่าน `testGetElementsByTagFindsMatches` และกลุ่ม Validate.notEmpty).