# ElementTest.java

ด้านล่างนี้คือชุดทดสอบ JUnit 4 สำหรับคลาส `org.jsoup.nodes.Element` โดยใช้ `org.jsoup.Jsoup` (อยู่ใน classpath เดียวกับคลาสเป้าหมาย) เพื่อสร้างโครงสร้าง DOM จริงสำหรับทดสอบ parent/sibling/selector logic และสร้าง `Element` แบบ standalone สำหรับทดสอบ constructor/validate logic โดยตรง

```java
package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class ElementTest {

    private Element standalone;

    @Before
    public void setUp() {
        standalone = new Element(Tag.valueOf("div"), "http://example.com/");
    }

    // ---------- Constructor ----------

    @Test(expected = IllegalArgumentException.class)
    public void constructor_nullTag_throws() {
        new Element((Tag) null, "http://example.com/");
    }

    @Test
    public void constructor_withBaseUri_createsEmptyAttributes() {
        Element el = new Element(Tag.valueOf("p"), "http://a.com/");
        assertEquals("p", el.tagName());
        assertEquals("http://a.com/", el.baseUri());
        assertEquals(0, el.attributes().size());
    }

    // ---------- nodeName / tagName ----------

    @Test
    public void nodeName_and_tagName_matchTag() {
        assertEquals("div", standalone.nodeName());
        assertEquals("div", standalone.tagName());
    }

    @Test
    public void tagName_change_updatesTag() {
        standalone.tagName("span");
        assertEquals("span", standalone.tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void tagName_empty_throws() {
        standalone.tagName("");
    }

    @Test
    public void tag_returnsCurrentTagObject() {
        assertNotNull(standalone.tag());
        assertEquals("div", standalone.tag().getName());
    }

    // ---------- isBlock ----------

    @Test
    public void isBlock_trueForDiv_falseForSpan() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element span = new Element(Tag.valueOf("span"), "");
        assertTrue(div.isBlock());
        assertFalse(span.isBlock());
    }

    // ---------- id() ----------

    @Test
    public void id_absent_returnsEmptyString() {
        assertEquals("", standalone.id());
    }

    @Test
    public void id_present_returnsValue() {
        standalone.attr("id", "main");
        assertEquals("main", standalone.id());
    }

    // ---------- attr(key,value) chaining ----------

    @Test
    public void attr_setAndChain_returnsThis() {
        Element returned = standalone.attr("data-x", "1");
        assertSame(standalone, returned);
        assertEquals("1", standalone.attr("data-x"));
    }

    // ---------- dataset() ----------

    @Test
    public void dataset_filtersDataPrefixedAttributes() {
        standalone.attr("data-package", "jsoup");
        standalone.attr("class", "group"); // not a data- attribute
        assertEquals("jsoup", standalone.dataset().get("package"));
        assertFalse(standalone.dataset().containsKey("class"));
    }

    // ---------- parent() / parents() ----------

    @Test
    public void parent_standalone_isNull() {
        assertNull(standalone.parent());
    }

    @Test
    public void parents_stopsAtRoot() {
        Document doc = Jsoup.parse("<html><body><div><p>Hi</p></div></body></html>");
        Element p = doc.select("p").first();
        Elements parents = p.parents();
        // div, body, html -- but NOT #root
        assertTrue(parents.size() >= 3);
        for (Element e : parents) {
            assertNotEquals("#root", e.tagName());
        }
    }

    // ---------- children() / child(index) / textNodes() / dataNodes() ----------

    @Test
    public void children_filtersOnlyElementNodes() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.appendText("text1");
        parent.appendElement("span");
        parent.appendText("text2");

        Elements kids = parent.children();
        assertEquals(1, kids.size());
        assertEquals("span", kids.get(0).tagName());
    }

    @Test
    public void child_returnsCorrectElementByIndex() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.appendElement("a");
        parent.appendElement("b");
        assertEquals("b", parent.child(1).tagName());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void child_invalidIndex_throws() {
        standalone.child(0);
    }

    @Test
    public void textNodes_filtersOnlyTextNodes() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.appendText("hello");
        parent.appendElement("span");
        assertEquals(1, parent.textNodes().size());
    }

    @Test
    public void dataNodes_filtersOnlyDataNodes() {
        Document doc = Jsoup.parse("<script>var x = 1;</script>");
        Element script = doc.select("script").first();
        assertEquals(1, script.dataNodes().size());
    }

    // ---------- select ----------

    @Test
    public void select_findsMatchingElements() {
        Document doc = Jsoup.parse("<div><p class='x'>A</p><p>B</p></div>");
        Elements found = doc.select("p.x");
        assertEquals(1, found.size());
        assertEquals("A", found.first().text());
    }

    // ---------- appendChild / prependChild ----------

    @Test(expected = IllegalArgumentException.class)
    public void appendChild_null_throws() {
        standalone.appendChild(null);
    }

    @Test
    public void appendChild_addsAtEnd() {
        standalone.appendElement("a");
        TextNode t = new TextNode("txt", "");
        standalone.appendChild(t);
        assertEquals(2, standalone.childNodeSize());
        assertTrue(standalone.childNode(1) instanceof TextNode);
    }

    @Test(expected = IllegalArgumentException.class)
    public void prependChild_null_throws() {
        standalone.prependChild(null);
    }

    @Test
    public void prependChild_addsAtStart() {
        standalone.appendElement("a");
        TextNode t = new TextNode("txt", "");
        standalone.prependChild(t);
        assertTrue(standalone.childNode(0) instanceof TextNode);
    }

    // ---------- insertChildren ----------

    @Test(expected = IllegalArgumentException.class)
    public void insertChildren_nullCollection_throws() {
        standalone.insertChildren(0, null);
    }

    @Test
    public void insertChildren_negativeIndex_rollsAroundToEnd() {
        Element a = standalone.appendElement("a");
        Document doc = Jsoup.parse("<span>new</span>");
        java.util.List<Node> toInsert = new java.util.ArrayList<Node>();
        toInsert.add(doc.select("span").first());
        standalone.insertChildren(-1, toInsert);
        assertEquals(2, standalone.childNodeSize());
        assertEquals("span", ((Element) standalone.childNode(1)).tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertChildren_outOfBounds_throws() {
        java.util.List<Node> toInsert = new java.util.ArrayList<Node>();
        toInsert.add(new TextNode("x", ""));
        standalone.insertChildren(5, toInsert); // currentSize == 0
    }

    // ---------- appendElement / prependElement ----------

    @Test
    public void appendElement_addsAtEndAndReturnsChild() {
        Element child = standalone.appendElement("span");
        assertEquals("span", child.tagName());
        assertEquals(1, standalone.children().size());
    }

    @Test
    public void prependElement_addsAtStart() {
        standalone.appendElement("a");
        Element child = standalone.prependElement("span");
        assertEquals("span", standalone.child(0).tagName());
        assertSame(child, standalone.child(0));
    }

    // ---------- appendText / prependText ----------

    @Test
    public void appendText_addsTextNodeAtEnd() {
        standalone.appendText("hello");
        assertEquals("hello", standalone.text());
    }

    @Test
    public void prependText_addsTextNodeAtStart() {
        standalone.appendText("world");
        standalone.prependText("hello ");
        assertEquals("hello world", standalone.text());
    }

    // ---------- append / prepend (HTML string) ----------

    @Test(expected = IllegalArgumentException.class)
    public void append_null_throws() {
        standalone.append(null);
    }

    @Test
    public void append_parsesAndAddsAtEnd() {
        standalone.append("<p>Hi</p>");
        assertEquals(1, standalone.children().size());
        assertEquals("p", standalone.child(0).tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void prepend_null_throws() {
        standalone.prepend(null);
    }

    @Test
    public void prepend_parsesAndAddsAtStart() {
        standalone.appendElement("a");
        standalone.prepend("<p>Hi</p>");
        assertEquals("p", standalone.child(0).tagName());
    }

    // ---------- before / after (String & Node) ----------

    @Test
    public void before_withHtmlString_insertsSibling() {
        Document doc = Jsoup.parse("<div><p>mid</p></div>");
        Element p = doc.select("p").first();
        p.before("<span>before</span>");
        Elements kids = doc.select("div").first().children();
        assertEquals("span", kids.get(0).tagName());
    }

    @Test
    public void after_withHtmlString_insertsSibling() {
        Document doc = Jsoup.parse("<div><p>mid</p></div>");
        Element p = doc.select("p").first();
        p.after("<span>after</span>");
        Elements kids = doc.select("div").first().children();
        assertEquals("span", kids.get(1).tagName());
    }

    // ---------- empty() ----------

    @Test
    public void empty_removesAllChildren() {
        standalone.appendElement("a");
        standalone.appendText("x");
        standalone.empty();
        assertEquals(0, standalone.childNodeSize());
    }

    // ---------- wrap ----------

    @Test
    public void wrap_wrapsElementWithHtml() {
        Document doc = Jsoup.parse("<div><p>content</p></div>");
        Element p = doc.select("p").first();
        p.wrap("<section></section>");
        assertNotNull(doc.select("section").first());
        assertEquals("p", doc.select("section").first().child(0).tagName());
    }

    // ---------- siblingElements ----------

    @Test
    public void siblingElements_noParent_returnsEmpty() {
        assertEquals(0, standalone.siblingElements().size());
    }

    @Test
    public void siblingElements_excludesSelf() {
        Document doc = Jsoup.parse("<div><a></a><b></b><c></c></div>");
        Element b = doc.select("b").first();
        Elements siblings = b.siblingElements();
        assertEquals(2, siblings.size());
        for (Element e : siblings) {
            assertNotSame(b, e);
        }
    }

    // ---------- nextElementSibling / previousElementSibling ----------

    @Test
    public void nextElementSibling_noParent_returnsNull() {
        assertNull(standalone.nextElementSibling());
    }

    @Test
    public void nextElementSibling_hasNext_returnsIt() {
        Document doc = Jsoup.parse("<div><a></a><b></b></div>");
        Element a = doc.select("a").first();
        Element next = a.nextElementSibling();
        assertNotNull(next);
        assertEquals("b", next.tagName());
    }

    @Test
    public void nextElementSibling_lastChild_returnsNull() {
        Document doc = Jsoup.parse("<div><a></a><b></b></div>");
        Element b = doc.select("b").first();
        assertNull(b.nextElementSibling());
    }

    @Test
    public void previousElementSibling_noParent_returnsNull() {
        assertNull(standalone.previousElementSibling());
    }

    @Test
    public void previousElementSibling_firstChild_returnsNull() {
        Document doc = Jsoup.parse("<div><a></a><b></b></div>");
        Element a = doc.select("a").first();
        assertNull(a.previousElementSibling());
    }

    @Test
    public void previousElementSibling_hasPrevious_returnsIt() {
        Document doc = Jsoup.parse("<div><a></a><b></b></div>");
        Element b = doc.select("b").first();
        Element prev = b.previousElementSibling();
        assertNotNull(prev);
        assertEquals("a", prev.tagName());
    }

    // ---------- firstElementSibling / lastElementSibling ----------

    @Test
    public void firstElementSibling_multipleSiblings_returnsFirst() {
        Document doc = Jsoup.parse("<div><a></a><b></b></div>");
        Element b = doc.select("b").first();
        Element first = b.firstElementSibling();
        assertNotNull(first);
        assertEquals("a", first.tagName());
    }

    @Test
    public void firstElementSibling_onlyChild_returnsNull() {
        Document doc = Jsoup.parse("<div><a></a></div>");
        Element a = doc.select("a").first();
        assertNull(a.firstElementSibling());
    }

    @Test
    public void lastElementSibling_multipleSiblings_returnsLast() {
        Document doc = Jsoup.parse("<div><a></a><b></b></div>");
        Element a = doc.select("a").first();
        Element last = a.lastElementSibling();
        assertNotNull(last);
        assertEquals("b", last.tagName());
    }

    @Test
    public void lastElementSibling_onlyChild_returnsNull() {
        Document doc = Jsoup.parse("<div><a></a></div>");
        Element a = doc.select("a").first();
        assertNull(a.lastElementSibling());
    }

    // ---------- elementSiblingIndex ----------

    @Test
    public void elementSiblingIndex_noParent_returnsZero() {
        assertEquals(Integer.valueOf(0), standalone.elementSiblingIndex());
    }

    @Test
    public void elementSiblingIndex_withParent_returnsCorrectIndex() {
        Document doc = Jsoup.parse("<div><a></a><b></b><c></c></div>");
        Element c = doc.select("c").first();
        assertEquals(Integer.valueOf(2), c.elementSiblingIndex());
    }

    // ---------- getElementsByTag ----------

    @Test(expected = IllegalArgumentException.class)
    public void getElementsByTag_empty_throws() {
        standalone.getElementsByTag("");
    }

    @Test
    public void getElementsByTag_findsCaseInsensitive() {
        Document doc = Jsoup.parse("<div><P>a</P><p>b</p></div>");
        Elements found = doc.getElementsByTag("P");
        assertEquals(2, found.size());
    }

    // ---------- getElementById ----------

    @Test(expected = IllegalArgumentException.class)
    public void getElementById_empty_throws() {
        standalone.getElementById("");
    }

    @Test
    public void getElementById_found_returnsElement() {
        Document doc = Jsoup.parse("<div id='target'>x</div>");
        Element found = doc.getElementById("target");
        assertNotNull(found);
        assertEquals("target", found.id());
    }

    @Test
    public void getElementById_notFound_returnsNull() {
        Document doc = Jsoup.parse("<div id='other'>x</div>");
        assertNull(doc.getElementById("missing"));
    }

    // ---------- getElementsByClass ----------

    @Test(expected = IllegalArgumentException.class)
    public void getElementsByClass_empty_throws() {
        standalone.getElementsByClass("");
    }

    @Test
    public void getElementsByClass_findsMatches() {
        Document doc = Jsoup.parse("<div class='header round'></div><p class='header'></p>");
        Elements found = doc.getElementsByClass("header");
        assertEquals(2, found.size());
    }

    // ---------- getElementsByAttribute / Starting ----------

    @Test(expected = IllegalArgumentException.class)
    public void getElementsByAttribute_empty_throws() {
        standalone.getElementsByAttribute("");
    }

    @Test
    public void getElementsByAttribute_findsMatches() {
        Document doc = Jsoup.parse("<a href='x'></a><b></b>");
        Elements found = doc.getElementsByAttribute("href");
        assertEquals(1, found.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsByAttributeStarting_empty_throws() {
        standalone.getElementsByAttributeStarting("");
    }

    @Test
    public void getElementsByAttributeStarting_findsMatches() {
        Document doc = Jsoup.parse("<div data-x='1' data-y='2'></div>");
        Elements found = doc.getElementsByAttributeStarting("data-");
        assertEquals(1, found.size());
    }

    // ---------- getElementsByAttributeValueMatching(regex) ----------

    @Test
    public void getElementsByAttributeValueMatching_validRegex_findsMatches() {
        Document doc = Jsoup.parse("<a href='http://x.com'></a>");
        Elements found = doc.getElementsByAttributeValueMatching("href", "^http.*");
        assertEquals(1, found.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsByAttributeValueMatching_invalidRegex_throws() {
        standalone.getElementsByAttributeValueMatching("href", "[unclosed");
    }

    @Test
    public void getElementsByAttributeValueMatching_withPattern_findsMatches() {
        Document doc = Jsoup.parse("<a href='http://x.com'></a>");
        Elements found = doc.getElementsByAttributeValueMatching("href", Pattern.compile("^http.*"));
        assertEquals(1, found.size());
    }

    // ---------- getElementsMatchingText(regex) ----------

    @Test
    public void getElementsMatchingText_validRegex_findsMatches() {
        Document doc = Jsoup.parse("<p>Hello World</p>");
        Elements found = doc.getElementsMatchingText("World");
        assertTrue(found.size() > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsMatchingText_invalidRegex_throws() {
        standalone.getElementsMatchingText("[bad");
    }

    // ---------- getElementsMatchingOwnText(regex) ----------

    @Test
    public void getElementsMatchingOwnText_validRegex_findsMatches() {
        Document doc = Jsoup.parse("<p>OwnText<span>Child</span></p>");
        Elements found = doc.getElementsMatchingOwnText("OwnText");
        assertTrue(found.size() > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsMatchingOwnText_invalidRegex_throws() {
        standalone.getElementsMatchingOwnText("[bad");
    }

    // ---------- getAllElements ----------

    @Test
    public void getAllElements_includesSelfAndChildren() {
        Document doc = Jsoup.parse("<div><p><span></span></p></div>");
        Element div = doc.select("div").first();
        Elements all = div.getAllElements();
        // div itself + p + span
        assertEquals(3, all.size());
    }

    // ---------- text() / ownText() ----------

    @Test
    public void text_combinesChildText_withBlockSpacing() {
        Document doc = Jsoup.parse("<p>One <b>Two</b> Three<br>Four</p>");
        Element p = doc.select("p").first();
        String txt = p.text();
        assertTrue(txt.contains("One"));
        assertTrue(txt.contains("Two"));
        assertTrue(txt.contains("Three"));
        assertTrue(txt.contains("Four"));
    }

    @Test
    public void ownText_excludesChildElementText() {
        Document doc = Jsoup.parse("<p>One <b>Two</b> Three</p>");
        Element p = doc.select("p").first();
        String own = p.ownText();
        assertFalse(own.contains("Two"));
        assertTrue(own.contains("One"));
        assertTrue(own.contains("Three"));
    }

    @Test
    public void text_setter_clearsAndSetsText() {
        standalone.appendElement("span");
        standalone.text("newtext");
        assertEquals("newtext", standalone.text());
        assertEquals(1, standalone.childNodeSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void text_setter_null_throws() {
        standalone.text(null);
    }

    // ---------- hasText ----------

    @Test
    public void hasText_blankOnly_returnsFalse() {
        standalone.appendText("   ");
        assertFalse(standalone.hasText());
    }

    @Test
    public void hasText_nonBlank_returnsTrue() {
        standalone.appendText("content");
        assertTrue(standalone.hasText());
    }

    @Test
    public void hasText_viaChildElement_returnsTrue() {
        standalone.appendElement("span").appendText("content");
        assertTrue(standalone.hasText());
    }

    // ---------- data() ----------

    @Test
    public void data_returnsScriptContent() {
        Document doc = Jsoup.parse("<script>var a=1;</script>");
        Element script = doc.select("script").first();
        assertTrue(script.data().contains("var a=1;"));
    }

    @Test
    public void data_recursesIntoChildElements() {
        Document doc = Jsoup.parse("<div><script>abc</script></div>");
        Element div = doc.select("div").first();
        assertTrue(div.data().contains("abc"));
    }

    // ---------- className / classNames ----------

    @Test
    public void className_absent_returnsEmptyString() {
        assertEquals("", standalone.className());
    }

    @Test
    public void className_present_returnsValue() {
        standalone.attr("class", "header gray");
        assertEquals("header gray", standalone.className());
    }

    // NOTE: "".split("\\s+") in Java returns an array with a single empty-string
    // element; this is a documented quirk of String.split and is directly
    // derivable from the source — not an assumption about undocumented behavior.
    @Test
    public void classNames_noClassAttr_returnsSetWithSingleEmptyString() {
        Set<String> names = standalone.classNames();
        assertEquals(1, names.size());
        assertTrue(names.contains(""));
    }

    @Test
    public void classNames_withMultipleClasses_returnsAllNames() {
        standalone.attr("class", "a b c");
        Set<String> names = standalone.classNames();
        assertEquals(3, names.size());
        assertTrue(names.contains("a"));
        assertTrue(names.contains("b"));
        assertTrue(names.contains("c"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void classNamesSetter_null_throws() {
        standalone.classNames(null);
    }

    @Test
    public void classNamesSetter_updatesClassAttribute() {
        Set<String> set = new LinkedHashSet<String>();
        set.add("x");
        set.add("y");
        standalone.classNames(set);
        assertEquals("x y", standalone.className());
    }

    // ---------- hasClass ----------

    @Test
    public void hasClass_caseInsensitiveMatch_returnsTrue() {
        standalone.attr("class", "Header");
        assertTrue(standalone.hasClass("header"));
    }

    @Test
    public void hasClass_noMatch_returnsFalse() {
        standalone.attr("class", "header");
        assertFalse(standalone.hasClass("footer"));
    }

    // ---------- addClass / removeClass / toggleClass ----------

    @Test(expected = IllegalArgumentException.class)
    public void addClass_null_throws() {
        standalone.addClass(null);
    }

    @Test
    public void addClass_addsNewClass() {
        standalone.addClass("new");
        assertTrue(standalone.hasClass("new"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void removeClass_null_throws() {
        standalone.removeClass(null);
    }

    @Test
    public void removeClass_removesExistingClass() {
        standalone.attr("class", "a b");
        standalone.removeClass("a");
        assertFalse(standalone.hasClass("a"));
        assertTrue(standalone.hasClass("b"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void toggleClass_null_throws() {
        standalone.toggleClass(null);
    }

    @Test
    public void toggleClass_addsWhenAbsent_removesWhenPresent() {
        standalone.toggleClass("x"); // absent -> add
        assertTrue(standalone.hasClass("x"));
        standalone.toggleClass("x"); // present -> remove
        assertFalse(standalone.hasClass("x"));
    }

    // ---------- val() / val(value) ----------

    @Test
    public void val_textarea_returnsText() {
        Element textarea = new Element(Tag.valueOf("textarea"), "");
        textarea.text("content");
        assertEquals("content", textarea.val());
    }

    @Test
    public void val_nonTextarea_returnsValueAttr() {
        Element input = new Element(Tag.valueOf("input"), "");
        input.attr("value", "abc");
        assertEquals("abc", input.val());
    }

    @Test
    public void valSetter_textarea_setsText() {
        Element textarea = new Element(Tag.valueOf("textarea"), "");
        textarea.val("hello");
        assertEquals("hello", textarea.text());
    }

    @Test
    public void valSetter_nonTextarea_setsValueAttribute() {
        Element input = new Element(Tag.valueOf("input"), "");
        input.val("abc");
        assertEquals("abc", input.attr("value"));
    }

    // ---------- html() / html(String) ----------

    @Test
    public void html_getter_returnsInnerHtml() {
        standalone.append("<p>Hi</p>");
        assertTrue(standalone.html().contains("<p>Hi</p>"));
    }

    @Test
    public void html_setter_clearsAndSetsNewHtml() {
        standalone.appendElement("span");
        standalone.html("<p>New</p>");
        assertEquals(1, standalone.children().size());
        assertEquals("p", standalone.child(0).tagName());
    }

    // ---------- toString ----------

    @Test
    public void toString_returnsOuterHtml() {
        standalone.attr("id", "x");
        String s = standalone.toString();
        assertTrue(s.contains("<div"));
    }

    // ---------- equals / hashCode ----------

    @Test
    public void equals_sameReference_returnsTrue() {
        assertTrue(standalone.equals(standalone));
    }

    @Test
    public void equals_differentInstanceSameContent_returnsFalse() {
        Element other = new Element(Tag.valueOf("div"), "http://example.com/");
        assertFalse(standalone.equals(other));
    }

    @Test
    public void hashCode_consistentAcrossCalls() {
        int h1 = standalone.hashCode();
        int h2 = standalone.hashCode();
        assertEquals(h1, h2);
    }

    // ---------- clone ----------

    @Test
    public void clone_createsDistinctEqualContentElement() {
        standalone.attr("class", "a b");
        Element clone = standalone.clone();
        assertNotSame(standalone, clone);
        assertEquals(standalone.tagName(), clone.tagName());
        assertEquals(standalone.className(), clone.className());
        assertFalse(standalone.equals(clone)); // equals is reference-based
    }
}
```

## ตารางสรุปการครอบคลุม Branch/Condition

| กลุ่มเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `constructor_*` | `Validate.notNull(tag)` true/false path |
| `tagName_*` | `Validate.notEmpty` true/false path (empty string throws) |
| `isBlock_*` | `tag.isBlock()` true (div) / false (span) |
| `id_*` | `id == null ? "" : id` ทั้งสองสาขา |
| `dataset_*` | filter เฉพาะ attribute ที่ขึ้นต้น `data-` |
| `parent_*` / `parents_*` | `parentNode == null`, recursive `accumulateParents`, `#root` check |
| `children_*` / `child_*` | `instanceof Element` filter, index ถูก/ผิดขอบเขต (`IndexOutOfBoundsException`) |
| `textNodes_*` / `dataNodes_*` | `instanceof TextNode` / `instanceof DataNode` filter |
| `select_*` | เรียก `Selector.select` ผ่าน query ปกติ |
| `appendChild_*` / `prependChild_*` | `Validate.notNull(child)` throw/ไม่ throw, ตำแหน่งเพิ่ม (ต้น/ปลาย) |
| `insertChildren_*` | null check, `index < 0` roll-around, `Validate.isTrue` out-of-bounds |
| `appendElement_*` / `prependElement_*` | สร้าง element ใหม่และเพิ่มที่ปลาย/ต้น |
| `appendText_*` / `prependText_*` | เพิ่ม TextNode ที่ปลาย/ต้น |
| `append_*` / `prepend_*` | null check, parse fragment และเพิ่มที่ปลาย/ต้น |
| `before_*` / `after_*` | covariant override, แทรก sibling ก่อน/หลัง |
| `empty_*` | `childNodes.clear()` |
| `wrap_*` | wrap ผ่าน parent override |
| `siblingElements_*` | `parentNode == null` true/false, exclude self (`el != this`) |
| `nextElementSibling_*` / `previousElementSibling_*` | `parentNode == null`, index ท้าย/กลาง/ต้นของ list |
| `firstElementSibling_*` / `lastElementSibling_*` | `siblings.size() > 1` true/false |
| `elementSiblingIndex_*` | `parent() == null` true/false |
| `getElementsByTag_*` / `getElementById_*` / `getElementsByClass_*` / `getElementsByAttribute*` | `Validate.notEmpty` throw, พบ/ไม่พบผลลัพธ์ (`elements.size() > 0`) |
| `getElementsByAttributeValueMatching_*(regex)` | try/catch `PatternSyntaxException` → `IllegalArgumentException`, regex ถูกต้อง |
| `getElementsMatchingText_*` / `getElementsMatchingOwnText_*` | เช่นเดียวกับข้างบน (regex ผิด/ถูก) |
| `getAllElements_*` | รวม self + descendants |
| `text_*` / `ownText_*` | logic `instanceof TextNode`/`Element`, การเว้นวรรค `<br>`, `isBlock()` ใน `text(StringBuilder)` |
| `text_setter_*` | `Validate.notNull(text)` throw, เคลียร์แล้วเซ็ตใหม่ |
| `hasText_*` | recursive check TextNode `isBlank()` และ child Element |
| `data_*` | `instanceof DataNode` / recursive ผ่าน child Element |
| `className_*` / `classNames_*` | attribute ว่าง (`split` quirk) / มีหลายคลาส |
| `classNamesSetter_*` | null check, เขียนกลับ attribute |
| `hasClass_*` | case-insensitive match / ไม่ match |
| `addClass_*` / `removeClass_*` / `toggleClass_*` | null check, เพิ่ม/ลบ/สลับสถานะคลาส |
| `val_*` / `valSetter_*` | `tagName().equals("textarea")` true/false |
| `html_*` | getter concatenation, setter เคลียร์ก่อน append |
| `toString_*` | `outerHtml()` เส้นทางเรียกใช้งาน |
| `equals_*` / `hashCode_*` | `this == o` true/false, hashCode consistency |
| `clone_*` | deep behavior ของ `super.clone()` + `classNames()` populate |

**หมายเหตุ:** บางพฤติกรรม เช่น `"".split("\\s+")` ที่ให้ผลลัพธ์เป็น array ที่มีสมาชิกเดียวคือ `""` เป็นพฤติกรรมมาตรฐานของ Java String API ซึ่งสามารถพิสูจน์ได้จาก source code ที่ให้มาโดยตรง ไม่ได้เป็นการเดา behavior ที่ไม่มีอยู่ในซอร์ส