package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class ElementTest {

    // ---------- Helper ----------
    private Element el(String tag) {
        return new Element(tag);
    }

    // ===================== Constructor =====================

    @Test
    public void constructor_withTagString_setsTagName() {
        Element e = new Element("div");
        assertEquals("div", e.tagName());
        assertEquals("div", e.nodeName());
    }

    @Test
    public void constructor_tagBaseUriAttributes_setsFields() {
        Attributes attrs = new Attributes();
        Element e = new Element(Tag.valueOf("p"), "http://x.com", attrs);
        assertEquals("p", e.tagName());
        assertEquals("http://x.com", e.baseUri());
        assertTrue(e.hasAttributes());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_nullTag_throws() {
        new Element((Tag) null, "", new Attributes());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_nullBaseUri_throws() {
        new Element(Tag.valueOf("div"), null, new Attributes());
    }

    @Test
    public void constructor_tagBaseUri_nullAttributes_lazyInit() {
        Element e = new Element(Tag.valueOf("div"), "");
        assertFalse(e.hasAttributes()); // attributes == null branch
        Attributes a = e.attributes();  // triggers lazy creation
        assertNotNull(a);
        assertTrue(e.hasAttributes());
    }

    // ===================== ensureChildNodes / childNodeSize =====================

    @Test
    public void ensureChildNodes_createsNodeListWhenEmpty() {
        Element e = el("div");
        assertEquals(0, e.childNodeSize());
        e.ensureChildNodes(); // EMPTY_NODES branch -> creates NodeList
        assertEquals(0, e.childNodeSize());
    }

    @Test
    public void childNodeSize_afterAppend() {
        Element e = el("div");
        e.appendChild(new TextNode("x"));
        assertEquals(1, e.childNodeSize());
    }

    // ===================== attributes() / hasAttributes =====================

    @Test
    public void attributes_lazyCreation() {
        Element e = new Element(Tag.valueOf("div"), "");
        assertFalse(e.hasAttributes());
        e.attr("id", "x");
        assertTrue(e.hasAttributes());
    }

    // ===================== tagName() / tag() / isBlock() =====================

    @Test
    public void tagName_setter_changesTag() {
        Element e = el("span");
        e.tagName("div");
        assertEquals("div", e.tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void tagName_setter_empty_throws() {
        el("div").tagName("");
    }

    @Test
    public void isBlock_trueForDiv_falseForSpan() {
        assertTrue(el("div").isBlock());
        assertFalse(el("span").isBlock());
    }

    // ===================== id() =====================

    @Test
    public void id_presentAndAbsent() {
        Element e = el("div");
        assertEquals("", e.id());
        e.attr("id", "main");
        assertEquals("main", e.id());
    }

    // ===================== attr(String,boolean) / dataset() =====================

    @Test
    public void attrBoolean_trueThenFalse() {
        Element e = el("input");
        e.attr("disabled", true);
        assertEquals("", e.attributes().getIgnoreCase("disabled"));
        e.attr("disabled", false);
        assertFalse(e.attributes().hasKeyIgnoreCase("disabled"));
    }

    @Test
    public void dataset_readsDataAttributes() {
        Element e = el("div");
        e.attr("data-foo", "bar");
        assertEquals("bar", e.dataset().get("foo"));
    }

    // ===================== parent()/parents()/accumulateParents =====================

    @Test
    public void parent_nullWhenStandalone() {
        assertNull(el("div").parent());
    }

    @Test
    public void parents_stopsAtRootTag() {
        Element root = new Element(Tag.valueOf("#root"), "");
        Element child1 = el("div");
        Element child2 = el("p");
        Element child3 = el("span");
        root.appendChild(child1);
        child1.appendChild(child2);
        child2.appendChild(child3);

        Elements parents = child3.parents();
        assertEquals(2, parents.size()); // child2, child1 -- NOT root
        assertSame(child2, parents.get(0));
        assertSame(child1, parents.get(1));
    }

    // ===================== child(int) / children() / childElementsList caching =====================

    @Test
    public void child_validIndex() {
        Element parent = el("div");
        Element c1 = el("span");
        parent.appendChild(c1);
        assertSame(c1, parent.child(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void child_outOfBounds_throws() {
        el("div").child(0);
    }

    @Test
    public void children_filtersOnlyElementNodes() {
        Element parent = el("div");
        parent.appendChild(new TextNode("hello"));
        parent.appendChild(el("span"));
        Elements children = parent.children();
        assertEquals(1, children.size());
    }

    @Test
    public void childElementsList_cacheInvalidatedOnChange() {
        Element parent = el("div");
        parent.appendChild(el("span"));
        assertEquals(1, parent.children().size()); // build cache
        parent.appendChild(el("b"));
        assertEquals(2, parent.children().size()); // nodelistChanged must invalidate cache
    }

    @Test
    public void nodelistChanged_clearsShadowCache() {
        Element parent = el("div");
        parent.appendChild(el("span"));
        parent.children(); // populate shadow cache
        parent.nodelistChanged(); // direct package-private call
        parent.appendChild(el("b"));
        assertEquals(2, parent.children().size());
    }

    // ===================== textNodes() / dataNodes() =====================

    @Test
    public void textNodes_filtersOnlyTextNodes() {
        Element e = el("p");
        e.appendChild(new TextNode("a"));
        e.appendChild(el("b"));
        assertEquals(1, e.textNodes().size());
    }

    @Test
    public void dataNodes_filtersOnlyDataNodes() {
        Element e = el("script");
        e.appendChild(new DataNode("var x=1;"));
        e.appendChild(new TextNode("ignored"));
        assertEquals(1, e.dataNodes().size());
    }

    // ===================== select / selectFirst / is =====================

    @Test
    public void select_findsMatchingDescendant() {
        Element parent = el("div");
        Element child = el("span");
        parent.appendChild(child);
        Elements found = parent.select("span");
        assertEquals(1, found.size());
    }

    @Test
    public void selectFirst_returnsNullWhenNoMatch() {
        Element parent = el("div");
        assertNull(parent.selectFirst("span"));
    }

    @Test
    public void is_cssQuery_trueFalse() {
        Element e = el("div");
        e.attr("class", "box");
        assertTrue(e.is(".box"));
        assertFalse(e.is(".other"));
    }

    @Test
    public void is_evaluator() {
        Element e = el("div");
        assertTrue(e.is(new Evaluator.Tag("div")));
        assertFalse(e.is(new Evaluator.Tag("span")));
    }

    // ===================== appendChild / appendTo / prependChild =====================

    @Test(expected = IllegalArgumentException.class)
    public void appendChild_null_throws() {
        el("div").appendChild(null);
    }

    @Test
    public void appendChild_setsSiblingIndex() {
        Element parent = el("div");
        Node c1 = new TextNode("a");
        Node c2 = new TextNode("b");
        parent.appendChild(c1);
        parent.appendChild(c2);
        assertEquals(0, c1.siblingIndex());
        assertEquals(1, c2.siblingIndex());
    }

    @Test
    public void appendTo_addsToParent() {
        Element parent = el("div");
        Element child = el("span");
        child.appendTo(parent);
        assertEquals(1, parent.childNodeSize());
        assertSame(parent, child.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void appendTo_nullParent_throws() {
        el("span").appendTo(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void prependChild_null_throws() {
        el("div").prependChild(null);
    }

    @Test
    public void prependChild_addsAtStart() {
        Element parent = el("div");
        parent.appendChild(new TextNode("second"));
        parent.prependChild(new TextNode("first"));
        assertEquals("first", ((TextNode) parent.childNode(0)).text());
    }

    // ===================== insertChildren(int, Collection) =====================

    @Test(expected = IllegalArgumentException.class)
    public void insertChildrenCollection_null_throws() {
        el("div").insertChildren(0, (java.util.Collection<Node>) null);
    }

    @Test
    public void insertChildrenCollection_negativeIndexRollsAround() {
        Element parent = el("div");
        parent.appendChild(new TextNode("a"));
        java.util.List<Node> toInsert = java.util.Arrays.asList((Node) new TextNode("b"));
        parent.insertChildren(-1, toInsert); // -1 -> end
        assertEquals(2, parent.childNodeSize());
        assertEquals("b", ((TextNode) parent.childNode(1)).text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertChildrenCollection_outOfBounds_throws() {
        Element parent = el("div");
        parent.insertChildren(5, java.util.Collections.<Node>emptyList());
    }

    // ===================== insertChildren(int, Node...) =====================

    @Test(expected = IllegalArgumentException.class)
    public void insertChildrenVarargs_null_throws() {
        el("div").insertChildren(0, (Node[]) null);
    }

    @Test
    public void insertChildrenVarargs_validIndex() {
        Element parent = el("div");
        parent.appendChild(new TextNode("a"));
        parent.insertChildren(0, new TextNode("b"));
        assertEquals("b", ((TextNode) parent.childNode(0)).text());
    }

    // ===================== appendElement / prependElement =====================
    // หมายเหตุ: อาศัย NodeUtils.parser(this) fallback เป็น default parser สำหรับ standalone element

    @Test
    public void appendElement_createsAndAppendsChild() {
        Element parent = el("div");
        Element child = parent.appendElement("span");
        assertEquals("span", child.tagName());
        assertEquals(1, parent.childNodeSize());
    }

    @Test
    public void prependElement_createsAndPrependsChild() {
        Element parent = el("div");
        parent.appendElement("b");
        Element first = parent.prependElement("span");
        assertEquals("span", parent.child(0).tagName());
        assertSame(first, parent.child(0));
    }

    // ===================== appendText / prependText =====================

    @Test(expected = IllegalArgumentException.class)
    public void appendText_null_throws() {
        el("div").appendText(null);
    }

    @Test
    public void appendText_addsTextNode() {
        Element e = el("div");
        e.appendText("hello");
        assertEquals("hello", e.text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void prependText_null_throws() {
        el("div").prependText(null);
    }

    @Test
    public void prependText_addsAtStart() {
        Element e = el("div");
        e.appendText("b");
        e.prependText("a");
        assertEquals("a b", e.text());
    }

    // ===================== append(String) / prepend(String) =====================

    @Test(expected = IllegalArgumentException.class)
    public void append_null_throws() {
        el("div").append(null);
    }

    @Test
    public void append_parsesAndAddsAtEnd() {
        Element e = el("div");
        e.appendText("A");
        e.append("<span>B</span>");
        assertEquals(2, e.childNodeSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void prepend_null_throws() {
        el("div").prepend(null);
    }

    @Test
    public void prepend_parsesAndAddsAtStart() {
        Element e = el("div");
        e.appendText("B");
        e.prepend("<span>A</span>");
        assertEquals("span", e.child(0).tagName());
    }

    // ===================== empty() =====================

    @Test
    public void empty_removesAllChildren() {
        Element e = el("div");
        e.appendChild(new TextNode("x"));
        e.appendChild(el("span"));
        e.empty();
        assertEquals(0, e.childNodeSize());
    }

    // ===================== cssSelector() =====================

    @Test
    public void cssSelector_withId_returnsHash() {
        Element e = el("div");
        e.attr("id", "foo");
        assertEquals("#foo", e.cssSelector());
    }

    @Test
    public void cssSelector_noIdNoParent_tagOnly() {
        assertEquals("p", el("p").cssSelector());
    }

    @Test
    public void cssSelector_noIdWithClasses_noParent() {
        Element e = el("div");
        e.attr("class", "header gray");
        assertEquals("div.header.gray", e.cssSelector());
    }

    @Test
    public void cssSelector_withParent_nthChildWhenAmbiguous() {
        Element parent = el("div");
        Element s1 = parent.appendElement("span");
        Element s2 = parent.appendElement("span");
        assertEquals("div > span:nth-child(2)", s2.cssSelector());
    }

    // ===================== siblingElements() =====================

    @Test
    public void siblingElements_noParent_empty() {
        assertEquals(0, el("div").siblingElements().size());
    }

    @Test
    public void siblingElements_excludesSelf() {
        Element parent = el("div");
        Element a = parent.appendElement("a");
        Element b = parent.appendElement("b");
        Elements siblings = a.siblingElements();
        assertEquals(1, siblings.size());
        assertSame(b, siblings.get(0));
    }

    // ===================== nextElementSibling() / previousElementSibling() =====================

    @Test
    public void nextElementSibling_noParent_null() {
        assertNull(el("div").nextElementSibling());
    }

    @Test
    public void nextElementSibling_hasNext() {
        Element parent = el("div");
        Element a = parent.appendElement("a");
        Element b = parent.appendElement("b");
        assertSame(b, a.nextElementSibling());
    }

    @Test
    public void nextElementSibling_isLast_returnsNull() {
        Element parent = el("div");
        Element a = parent.appendElement("a");
        Element b = parent.appendElement("b");
        assertNull(b.nextElementSibling());
    }

    @Test
    public void previousElementSibling_noParent_null() {
        assertNull(el("div").previousElementSibling());
    }

    @Test
    public void previousElementSibling_isFirst_returnsNull() {
        Element parent = el("div");
        Element a = parent.appendElement("a");
        parent.appendElement("b");
        assertNull(a.previousElementSibling());
    }

    @Test
    public void previousElementSibling_hasPrevious() {
        Element parent = el("div");
        Element a = parent.appendElement("a");
        Element b = parent.appendElement("b");
        assertSame(a, b.previousElementSibling());
    }

    @Test
    public void nextElementSiblings_returnsFollowing() {
        Element parent = el("div");
        Element a = parent.appendElement("a");
        parent.appendElement("b");
        parent.appendElement("c");
        assertEquals(2, a.nextElementSiblings().size());
    }

    @Test
    public void previousElementSiblings_returnsPreceding() {
        Element parent = el("div");
        parent.appendElement("a");
        parent.appendElement("b");
        Element c = parent.appendElement("c");
        assertEquals(2, c.previousElementSiblings().size());
    }

    // ===================== firstElementSibling() / lastElementSibling() =====================
    // หมายเหตุ: ตาม source, ถ้ามี sibling เพียง 1 ตัว (คือตัวเอง) จะ return null ไม่ใช่ตัวเอง

    @Test
    public void firstElementSibling_onlyChild_returnsNull() {
        Element parent = el("div");
        Element only = parent.appendElement("span");
        assertNull(only.firstElementSibling());
    }

    @Test
    public void firstElementSibling_multipleChildren() {
        Element parent = el("div");
        Element a = parent.appendElement("a");
        parent.appendElement("b");
        Element c = parent.appendElement("c");
        assertSame(a, c.firstElementSibling());
    }

    @Test
    public void lastElementSibling_onlyChild_returnsNull() {
        Element parent = el("div");
        Element only = parent.appendElement("span");
        assertNull(only.lastElementSibling());
    }

    @Test
    public void lastElementSibling_multipleChildren() {
        Element parent = el("div");
        Element a = parent.appendElement("a");
        parent.appendElement("b");
        Element c = parent.appendElement("c");
        assertSame(c, a.lastElementSibling());
    }

    // ===================== elementSiblingIndex() =====================

    @Test
    public void elementSiblingIndex_noParent_zero() {
        assertEquals(0, el("div").elementSiblingIndex());
    }

    @Test
    public void elementSiblingIndex_withParent() {
        Element parent = el("div");
        parent.appendElement("a");
        Element b = parent.appendElement("b");
        assertEquals(1, b.elementSiblingIndex());
    }

    // ===================== getElementsByXxx (validation + basic) =====================

    @Test(expected = IllegalArgumentException.class)
    public void getElementsByTag_empty_throws() {
        el("div").getElementsByTag("");
    }

    @Test
    public void getElementsByTag_found() {
        Element parent = el("div");
        parent.appendElement("span");
        assertEquals(1, parent.getElementsByTag("span").size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementById_empty_throws() {
        el("div").getElementById("");
    }

    @Test
    public void getElementById_foundAndNotFound() {
        Element parent = el("div");
        Element child = parent.appendElement("span");
        child.attr("id", "target");
        assertSame(child, parent.getElementById("target"));
        assertNull(parent.getElementById("missing"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsByClass_empty_throws() {
        el("div").getElementsByClass("");
    }

    @Test
    public void getElementsByClass_found() {
        Element parent = el("div");
        Element c = parent.appendElement("span");
        c.attr("class", "foo");
        assertEquals(1, parent.getElementsByClass("foo").size());
    }

    @Test
    public void getElementsByAttribute_found() {
        Element parent = el("div");
        parent.appendElement("a").attr("href", "x");
        assertEquals(1, parent.getElementsByAttribute("href").size());
    }

    @Test
    public void getElementsByAttributeStarting_found() {
        Element parent = el("div");
        parent.appendElement("a").attr("data-x", "1");
        assertEquals(1, parent.getElementsByAttributeStarting("data-").size());
    }

    @Test
    public void getElementsByAttributeValue_found() {
        Element parent = el("div");
        parent.appendElement("a").attr("href", "test");
        assertEquals(1, parent.getElementsByAttributeValue("href", "test").size());
    }

    @Test
    public void getElementsByAttributeValueNot_found() {
        Element parent = el("div");
        parent.appendElement("a").attr("href", "other");
        assertEquals(1, parent.getElementsByAttributeValueNot("href", "test").size());
    }

    @Test
    public void getElementsByAttributeValueStarting_found() {
        Element parent = el("div");
        parent.appendElement("a").attr("href", "http://x.com");
        assertEquals(1, parent.getElementsByAttributeValueStarting("href", "http").size());
    }

    @Test
    public void getElementsByAttributeValueEnding_found() {
        Element parent = el("div");
        parent.appendElement("a").attr("href", "file.pdf");
        assertEquals(1, parent.getElementsByAttributeValueEnding("href", ".pdf").size());
    }

    @Test
    public void getElementsByAttributeValueContaining_found() {
        Element parent = el("div");
        parent.appendElement("a").attr("href", "abcxyz");
        assertEquals(1, parent.getElementsByAttributeValueContaining("href", "cxy").size());
    }

    @Test
    public void getElementsByAttributeValueMatching_pattern() {
        Element parent = el("div");
        parent.appendElement("a").attr("href", "123");
        assertEquals(1, parent.getElementsByAttributeValueMatching("href", Pattern.compile("\\d+")).size());
    }

    @Test
    public void getElementsByAttributeValueMatching_validRegexString() {
        Element parent = el("div");
        parent.appendElement("a").attr("href", "123");
        assertEquals(1, parent.getElementsByAttributeValueMatching("href", "\\d+").size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsByAttributeValueMatching_invalidRegexString_throws() {
        el("div").getElementsByAttributeValueMatching("href", "[");
    }

    @Test
    public void getElementsByIndex_lessGreaterEquals() {
        Element parent = el("div");
        parent.appendElement("a");
        parent.appendElement("b");
        parent.appendElement("c");
        assertEquals(1, parent.getElementsByIndexLessThan(1).size());
        assertEquals(1, parent.getElementsByIndexGreaterThan(1).size());
        assertEquals(1, parent.getElementsByIndexEquals(1).size());
    }

    @Test
    public void getElementsContainingText_found() {
        Element parent = el("div");
        parent.appendElement("p").text("Hello World");
        assertEquals(1, parent.getElementsContainingText("world").size());
    }

    @Test
    public void getElementsContainingOwnText_found() {
        Element parent = el("div");
        parent.appendElement("p").text("Hello Own");
        assertEquals(1, parent.getElementsContainingOwnText("own").size());
    }

    @Test
    public void getElementsMatchingText_patternAndString() {
        Element parent = el("div");
        parent.appendElement("p").text("abc123");
        assertEquals(1, parent.getElementsMatchingText(Pattern.compile("\\d+")).size());
        assertEquals(1, parent.getElementsMatchingText("\\d+").size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsMatchingText_invalidRegex_throws() {
        el("div").getElementsMatchingText("[");
    }

    @Test
    public void getElementsMatchingOwnText_patternAndString() {
        Element parent = el("div");
        parent.appendElement("p").text("xyz789");
        assertEquals(1, parent.getElementsMatchingOwnText(Pattern.compile("\\d+")).size());
        assertEquals(1, parent.getElementsMatchingOwnText("\\d+").size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsMatchingOwnText_invalidRegex_throws() {
        el("div").getElementsMatchingOwnText("[");
    }

    @Test
    public void getAllElements_includesSelfAndChildren() {
        Element parent = el("div");
        parent.appendElement("span");
        assertEquals(2, parent.getAllElements().size());
    }

    // ===================== text() / wholeText() / ownText() =====================

    @Test
    public void text_normalizesWhitespaceAndBlockSpacing() {
        Element div = el("div");
        div.appendText("Hello  ");
        Element span = div.appendElement("span");
        span.text("there");
        assertEquals("Hello there", div.text());
    }

    @Test
    public void text_blockElementAddsSpace() {
        Element outer = el("div");
        Element p1 = outer.appendElement("p");
        p1.text("One");
        Element p2 = outer.appendElement("p");
        p2.text("Two");
        assertEquals("One Two", outer.text());
    }

    @Test
    public void text_brAddsSpace() {
        Element p = el("p");
        p.appendText("One");
        p.appendElement("br");
        p.appendText("Two");
        assertTrue(p.text().contains("One") && p.text().contains("Two"));
    }

    @Test
    public void wholeText_preservesRawWhitespace() {
        Element p = el("p");
        p.appendText("  spaced  ");
        assertEquals("  spaced  ", p.wholeText());
    }

    @Test
    public void ownText_excludesChildElementText() {
        Element p = el("p");
        p.appendText("Hello ");
        Element b = p.appendElement("b");
        b.text("there");
        p.appendText(" now!");
        assertEquals("Hello now!", p.ownText());
    }

    @Test
    public void ownText_brInChild_addsSpace() {
        Element p = el("p");
        p.appendText("Hello");
        p.appendElement("br");
        assertFalse(p.ownText().isEmpty());
    }

    @Test
    public void preserveWhitespace_preTagPreservesSpaces() {
        Element pre = el("pre");
        pre.appendText("a   b");
        assertEquals("a   b", pre.wholeText());
        // ownText on pre should preserve whitespace due to appendNormalisedText branch
        assertTrue(pre.ownText().contains("a") && pre.ownText().contains("b"));
    }

    // ===================== hasText() =====================

    @Test
    public void hasText_falseWhenBlank() {
        Element e = el("div");
        e.appendText("   ");
        assertFalse(e.hasText());
    }

    @Test
    public void hasText_trueWhenDirectText() {
        Element e = el("div");
        e.appendText("hi");
        assertTrue(e.hasText());
    }

    @Test
    public void hasText_trueWhenNestedText() {
        Element parent = el("div");
        Element child = parent.appendElement("span");
        child.appendText("nested");
        assertTrue(parent.hasText());
    }

    @Test
    public void hasText_falseWhenEmpty() {
        assertFalse(el("div").hasText());
    }

    // ===================== data() =====================

    @Test
    public void data_combinesDataCommentAndNestedElement() {
        Element script = el("script");
        script.appendChild(new DataNode("var x=1;"));

        Element outer = el("div");
        outer.appendChild(new Comment(" comment "));
        outer.appendChild(script);
        outer.appendChild(new CDataNode("cdata-content"));

        String data = outer.data();
        assertTrue(data.contains(" comment "));
        assertTrue(data.contains("var x=1;"));
        assertTrue(data.contains("cdata-content"));
    }

    // ===================== className() / classNames() / classNames(Set) =====================

    @Test
    public void className_emptyWhenNoAttribute() {
        assertEquals("", el("div").className());
    }

    @Test
    public void className_trimmed() {
        Element e = el("div");
        e.attr("class", " foo ");
        assertEquals("foo", e.className());
    }

    @Test
    public void classNames_emptySetWhenNoClassAttr() {
        Set<String> names = el("div").classNames();
        assertTrue(names.isEmpty());
    }

    @Test
    public void classNames_parsesMultipleClasses() {
        Element e = el("div");
        e.attr("class", "a b c");
        Set<String> names = e.classNames();
        assertEquals(3, names.size());
        assertTrue(names.contains("a") && names.contains("b") && names.contains("c"));
    }

    @Test
    public void classNamesSet_emptySetRemovesAttribute() {
        Element e = el("div");
        e.attr("class", "a b");
        e.classNames(new LinkedHashSet<String>());
        assertEquals("", e.className());
    }

    @Test
    public void classNamesSet_nonEmptySetSetsAttribute() {
        Element e = el("div");
        Set<String> names = new LinkedHashSet<>();
        names.add("x");
        names.add("y");
        e.classNames(names);
        assertEquals("x y", e.className());
    }

    @Test(expected = IllegalArgumentException.class)
    public void classNamesSet_null_throws() {
        el("div").classNames(null);
    }

    // ===================== hasClass() - branch heavy =====================

    @Test
    public void hasClass_noAttribute_false() {
        assertFalse(el("div").hasClass("foo"));
    }

    @Test
    public void hasClass_classShorterThanSearch_false() {
        Element e = el("div");
        e.attr("class", "ab");
        assertFalse(e.hasClass("abcdef"));
    }

    @Test
    public void hasClass_equalLength_matchIgnoreCase() {
        Element e = el("div");
        e.attr("class", "FOO");
        assertTrue(e.hasClass("foo"));
    }

    @Test
    public void hasClass_equalLength_noMatch() {
        Element e = el("div");
        e.attr("class", "foo");
        assertFalse(e.hasClass("bar"));
    }

    @Test
    public void hasClass_middleClass_match() {
        Element e = el("div");
        e.attr("class", "alpha beta gamma");
        assertTrue(e.hasClass("beta"));
    }

    @Test
    public void hasClass_middleClass_lengthMismatch_noMatch() {
        Element e = el("div");
        e.attr("class", "alpha beta gamma");
        assertFalse(e.hasClass("bet"));
    }

    @Test
    public void hasClass_lastClass_noTrailingSpace_match() {
        Element e = el("div");
        e.attr("class", "a alpha");
        assertTrue(e.hasClass("alpha"));
    }

    @Test
    public void hasClass_lastClass_noMatch() {
        Element e = el("div");
        e.attr("class", "a alpha");
        assertFalse(e.hasClass("beta"));
    }

    // ===================== addClass / removeClass / toggleClass =====================

    @Test
    public void addClass_addsNewClass() {
        Element e = el("div");
        e.addClass("foo");
        assertTrue(e.hasClass("foo"));
    }

    @Test
    public void removeClass_removesExisting() {
        Element e = el("div");
        e.attr("class", "foo bar");
        e.removeClass("foo");
        assertFalse(e.hasClass("foo"));
        assertTrue(e.hasClass("bar"));
    }

    @Test
    public void toggleClass_addsWhenAbsent() {
        Element e = el("div");
        e.toggleClass("foo");
        assertTrue(e.hasClass("foo"));
    }

    @Test
    public void toggleClass_removesWhenPresent() {
        Element e = el("div");
        e.attr("class", "foo");
        e.toggleClass("foo");
        assertFalse(e.hasClass("foo"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void addClass_null_throws() {
        el("div").addClass(null);
    }

    // ===================== val() / val(String) =====================

    @Test
    public void val_textarea_usesText() {
        Element textarea = el("textarea");
        textarea.text("hello");
        assertEquals("hello", textarea.val());
    }

    @Test
    public void val_nonTextarea_usesAttr() {
        Element input = el("input");
        input.attr("value", "123");
        assertEquals("123", input.val());
    }

    @Test
    public void valSet_textarea_setsText() {
        Element textarea = el("textarea");
        textarea.val("content");
        assertEquals("content", textarea.text());
    }

    @Test
    public void valSet_nonTextarea_setsAttr() {
        Element input = el("input");
        input.val("abc");
        assertEquals("abc", input.attr("value"));
    }

    // ===================== html() / html(String) / html(Appendable) =====================

    @Test
    public void html_setAndGet() {
        Element e = el("div");
        e.html("<p>Hi</p>");
        assertTrue(e.html().contains("Hi"));
    }

    @Test
    public void htmlAppendable_appendsChildrenOuterHtml() {
        Element e = el("div");
        e.appendChild(new TextNode("hi"));
        StringBuilder sb = new StringBuilder();
        e.html(sb);
        assertTrue(sb.toString().contains("hi"));
    }

    // ===================== outerHtmlHead / outerHtmlTail =====================
    // หมายเหตุ: ใช้ Document/OutputSettings ตาม API มาตรฐานของ jsoup (ไม่ได้อยู่ใน source ที่ให้มาโดยตรง)

    @Test
    public void outerHtmlHead_selfClosingEmptyTag() throws IOException {
        Document doc = new Document("");
        Document.OutputSettings out = doc.outputSettings();
        Element br = el("br");
        StringBuilder sb = new StringBuilder();
        br.outerHtmlHead(sb, 0, out);
        assertTrue(sb.toString().startsWith("<br"));
    }

    @Test
    public void outerHtmlHead_normalTagNotSelfClosing() throws IOException {
        Document doc = new Document("");
        Document.OutputSettings out = doc.outputSettings();
        Element div = el("div");
        StringBuilder sb = new StringBuilder();
        div.outerHtmlHead(sb, 0, out);
        assertTrue(sb.toString().endsWith(">"));
        assertFalse(sb.toString().contains("/>"));
    }

    @Test
    public void outerHtmlTail_selfClosingNoClosingTag() throws IOException {
        Document doc = new Document("");
        Document.OutputSettings out = doc.outputSettings();
        Element br = el("br");
        StringBuilder sb = new StringBuilder();
        br.outerHtmlTail(sb, 0, out);
        assertEquals("", sb.toString());
    }

    @Test
    public void outerHtmlTail_normalTagHasClosingTag() throws IOException {
        Document doc = new Document("");
        Document.OutputSettings out = doc.outputSettings();
        Element div = el("div");
        StringBuilder sb = new StringBuilder();
        div.outerHtmlTail(sb, 0, out);
        assertTrue(sb.toString().contains("</div>"));
    }

    // ===================== clone() / shallowClone() =====================

    @Test
    public void clone_copiesStructureIndependently() {
        Element parent = el("div");
        parent.appendChild(new TextNode("x"));
        Element clone = parent.clone();
        assertEquals(parent.childNodeSize(), clone.childNodeSize());

        parent.appendChild(new TextNode("y"));
        assertEquals(1, clone.childNodeSize()); // independent after clone
        assertEquals(2, parent.childNodeSize());
    }

    @Test
    public void shallowClone_noChildrenCopied() {
        Element parent = el("div");
        parent.appendChild(new TextNode("x"));
        parent.attr("id", "p1");
        Element shallow = parent.shallowClone();
        assertEquals(0, shallow.childNodeSize());
        assertEquals("p1", shallow.attr("id"));
    }

    @Test
    public void shallowClone_nullAttributesPreserved() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element shallow = parent.shallowClone();
        assertFalse(shallow.hasAttributes());
    }
}
