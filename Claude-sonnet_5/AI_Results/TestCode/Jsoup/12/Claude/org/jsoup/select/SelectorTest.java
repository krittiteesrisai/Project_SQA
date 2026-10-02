package org.jsoup.select;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Selector; // explicit import ตามข้อกำหนด (redundant แต่ไม่ผิด)
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SelectorTest {

    private Document doc;
    private Element root; // body element ใช้เป็น root หลักในการทดสอบ

    @Before
    public void setUp() {
        String html =
            "<html><head></head><body>" +
            "<div id='1' class='outer'>" +
            "  <p class='foo' data-test='x'>One</p>" +
            "  <p class='bar'>Two</p>" +
            "  <span>SpanText</span>" +
            "</div>" +
            "<div id='2' class='outer'>" +
            "  <span id='only'>Three</span>" +
            "</div>" +
            "<fb:name>Namespaced</fb:name>" +
            "</body></html>";
        doc = Jsoup.parse(html);
        root = doc.body();
    }

    // ================= Validate (constructor) =================

    @Test(expected = IllegalArgumentException.class)
    public void testNullQueryThrows() {
        Selector.select(null, root);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyQueryThrows() {
        Selector.select("", root);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWhitespaceOnlyQueryThrows() {
        // query.trim() -> "" -> Validate.notEmpty throws
        Selector.select("   ", root);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullRootThrows() {
        Selector.select("p", (Element) null);
    }

    // ================= findElements(): basic matchers =================

    @Test
    public void testSelectByTag() {
        Elements els = Selector.select("p", root);
        assertEquals(2, els.size());
    }

    @Test
    public void testSelectById_found() {
        Elements els = Selector.select("#1", root);
        assertEquals(1, els.size());
        assertEquals("1", els.first().id());
    }

    @Test
    public void testSelectById_notFound() {
        // found == null branch ใน byId()
        Elements els = Selector.select("#missing", root);
        assertEquals(0, els.size());
    }

    @Test
    public void testSelectByClass() {
        Elements els = Selector.select(".outer", root);
        assertEquals(2, els.size());
    }

    @Test
    public void testSelectUniversal() {
        Elements els = Selector.select("*", root);
        assertTrue(els.size() > 0);
    }

    @Test
    public void testSelectNamespaceTag() {
        // ทดสอบ tagName.contains("|") -> replace("|", ":")
        Elements els = Selector.select("fb|name", root);
        assertEquals(1, els.size());
    }

    // ================= byAttribute() branches =================

    @Test
    public void testAttributeExists() {
        Elements els = Selector.select("[data-test]", root);
        assertEquals(1, els.size());
    }

    @Test
    public void testAttributePrefix() {
        // key.startsWith("^") branch
        Elements els = Selector.select("[^data-]", root);
        assertEquals(1, els.size());
    }

    @Test
    public void testAttributeEquals() {
        Elements els = Selector.select("[class=foo]", root);
        assertEquals(1, els.size());
    }

    @Test
    public void testAttributeNotEquals() {
        Elements els = Selector.select("p[class!=foo]", root);
        assertEquals(1, els.size());
    }

    @Test
    public void testAttributeStartingWith() {
        Elements els = Selector.select("[class^=ou]", root);
        assertEquals(2, els.size());
    }

    @Test
    public void testAttributeEndingWith() {
        Elements els = Selector.select("[class$=ter]", root);
        assertEquals(2, els.size());
    }

    @Test
    public void testAttributeContaining() {
        Elements els = Selector.select("[class*=out]", root);
        assertEquals(2, els.size());
    }

    @Test
    public void testAttributeMatchingRegex() {
        Elements els = Selector.select("[id~=\\d+]", root);
        assertEquals(2, els.size());
    }

    // else-throw ใน byAttribute() ไม่สามารถถูก trigger ได้จริง -> ไม่เขียนเทส (ดูคำอธิบายด้านบน)

    // ================= pseudo index selectors =================

    @Test
    public void testIndexLessThan() {
        Elements els = Selector.select("div:lt(2)", root);
        assertTrue(els.size() >= 1);
    }

    @Test
    public void testIndexGreaterThan() {
        Elements els = Selector.select("div:gt(0)", root);
        assertTrue(els.size() >= 1);
    }

    @Test
    public void testIndexEquals() {
        Elements els = Selector.select("div:eq(0)", root);
        assertEquals(1, els.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIndexNonNumericThrows() {
        // Validate.isTrue(StringUtil.isNumeric(...)) ใน consumeIndex()
        Selector.select("div:eq(abc)", root);
    }

    // ================= :has =================

    @Test
    public void testHasTopLevelBranch() {
        // ครอบคลุม tq.matches(":has(") branch ใน select() หลัก (ก่อนเข้า while loop)
        Elements els = Selector.select(":has(p)", root);
        assertTrue(els.size() >= 1);
    }

    @Test
    public void testHasNested() {
        Elements els = Selector.select("div:has(p)", root);
        assertEquals(1, els.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHasEmptySubQueryThrows() {
        Selector.select("div:has()", root);
    }

    // ================= :contains / :containsOwn =================

    @Test
    public void testContains() {
        Elements els = Selector.select(":contains(Three)", root);
        assertTrue(els.size() >= 1);
    }

    @Test
    public void testContainsOwn() {
        Elements els = Selector.select(":containsOwn(Three)", root);
        assertTrue(els.size() >= 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testContainsEmptyThrows() {
        Selector.select(":contains()", root);
    }

    // ================= :matches / :matchesOwn =================

    @Test
    public void testMatches() {
        Elements els = Selector.select(":matches(Three)", root);
        assertTrue(els.size() >= 1);
    }

    @Test
    public void testMatchesOwn() {
        Elements els = Selector.select(":matchesOwn(Three)", root);
        assertTrue(els.size() >= 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMatchesEmptyThrows() {
        Selector.select(":matches()", root);
    }

    // ================= :not =================

    @Test
    public void testNot() {
        Elements els = Selector.select(":not(p)", root);
        assertTrue(els.size() >= 1);
        for (Element e : els) {
            assertFalse("p".equals(e.tagName()));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNotEmptyThrows() {
        Selector.select(":not()", root);
    }

    // ================= combinators =================

    @Test
    public void testChildCombinator() {
        Elements els = Selector.select("div > p", root);
        assertEquals(2, els.size());
    }

    @Test
    public void testDescendantCombinator() {
        Elements els = Selector.select("div p", root);
        assertEquals(2, els.size());
    }

    @Test
    public void testAdjacentSiblingCombinator() {
        Elements els = Selector.select("p.foo + p", root);
        assertEquals(1, els.size());
    }

    @Test
    public void testGeneralSiblingCombinator() {
        Elements els = Selector.select("p.foo ~ span", root);
        assertEquals(1, els.size());
    }

    @Test
    public void testLeadingCombinator() {
        // ครอบคลุม branch: tq.matchesAny(combinators) ที่จุดเริ่มต้นของ select()
        Elements els = Selector.select("> div", root);
        assertEquals(2, els.size());
    }

    @Test
    public void testGroupCombinator() {
        // ครอบคลุม tq.matchChomp(",") branch และ recursive select()
        Elements els = Selector.select("p, span", root);
        assertEquals(4, els.size());
    }

    @Test
    public void testAndSelector() {
        // ครอบคลุม else-branch (AND, filterForSelf + intersectElements)
        Elements els = Selector.select("p.foo", root);
        assertEquals(1, els.size());
    }

    // combinator() else-throw ไม่สามารถถูก trigger ได้จริงผ่าน public API -> ไม่เขียนเทส

    // ================= unknown / malformed token =================

    @Test(expected = Selector.SelectorParseException.class)
    public void testUnknownTokenThrows() {
        Selector.select("$unknown", root);
    }

    // ================= select(String, Iterable<Element>) =================

    @Test
    public void testSelectWithIterableRoots() {
        List<Element> roots = new ArrayList<Element>();
        for (Element div : doc.select("div")) {
            roots.add(div);
        }
        Elements els = Selector.select("p", roots);
        assertEquals(2, els.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelectIterableEmptyQueryThrows() {
        List<Element> roots = new ArrayList<Element>();
        roots.add(root);
        Selector.select("", roots);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelectIterableNullRootsThrows() {
        Selector.select("p", (Iterable<Element>) null);
    }
}
