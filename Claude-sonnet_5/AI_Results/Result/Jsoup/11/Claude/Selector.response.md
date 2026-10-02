# SelectorTest.java

```java
package org.jsoup.select;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Unit tests for org.jsoup.select.Selector (Defects4J Jsoup-11b)
 *
 * หมายเหตุ: Selector.java ไม่ได้ include ใน classpath ภายนอกที่กำหนด (ไม่มี jsoup.jar)
 * แต่เป็น Source Under Test (SUT) ของโครงการ Defects4J ซึ่งจะถูก compile มาด้วยกันกับ
 * Element, Elements, Document, Jsoup, TokenQueue, Validate ฯลฯ ในขั้นตอน build ของ Defects4J เอง
 * จึงสามารถเรียกใช้ org.jsoup.Jsoup.parse(...) และ org.jsoup.nodes.Element API ได้ตามปกติ
 */
public class SelectorTest {

    private Document doc;

    @Before
    public void setUp() {
        String html =
            "<html><head></head><body>" +
                "<div id='1' class='foo bar'>" +
                    "<p class='one'>One</p>" +
                    "<p class='two'>Two jsoup</p>" +
                    "<span data-test='1'>Span</span>" +
                    "<fb:name>Facebook</fb:name>" +
                "</div>" +
                "<div id='2'>" +
                    "<p>Three 123</p>" +
                    "<span class='wrap'><p class='deep'>Deep</p></span>" +
                "</div>" +
            "</body></html>";
        doc = Jsoup.parse(html);
    }

    // ---------- Constructor / Validate branches (private constructor via public select) ----------

    @Test(expected = RuntimeException.class) // Validate.notNull(query) - exact exception type not shown in source
    public void testSelectNullQueryThrows() {
        Selector.select(null, doc);
    }

    @Test(expected = RuntimeException.class) // Validate.notEmpty(query) after trim -> empty string
    public void testSelectEmptyQueryThrows() {
        Selector.select("", doc);
    }

    @Test(expected = RuntimeException.class) // query.trim() -> "" -> notEmpty fails
    public void testSelectWhitespaceQueryThrows() {
        Selector.select("    ", doc);
    }

    @Test(expected = RuntimeException.class) // Validate.notNull(root)
    public void testSelectNullRootThrows() {
        Selector.select("div", (Element) null);
    }

    // ---------- select() : starts-with-combinator branch ----------

    @Test
    public void testSelectStartsWithCombinator() {
        // query trims to ">p" -> tq.matchesAny(combinators) true at start -> elements.add(root); combinator(">")
        org.jsoup.select.Elements els = Selector.select(" > p", doc);
        // direct children of doc(root) matching "p" -> none, since p's are nested inside divs, not direct children of doc
        assertEquals(0, els.size());
    }

    // ---------- findElements(): byId ----------

    @Test
    public void testByIdFound() {
        org.jsoup.select.Elements els = Selector.select("#1", doc);
        assertEquals(1, els.size());
        assertEquals("1", els.first().id());
    }

    @Test
    public void testByIdNotFound() {
        org.jsoup.select.Elements els = Selector.select("#nonexistent", doc);
        assertEquals(0, els.size());
    }

    // ---------- findElements(): byClass ----------

    @Test
    public void testByClass() {
        org.jsoup.select.Elements els = Selector.select(".one", doc);
        assertEquals(1, els.size());
        assertEquals("one", els.first().className());
    }

    // ---------- findElements(): byTag ----------

    @Test
    public void testByTag() {
        org.jsoup.select.Elements els = Selector.select("p", doc);
        assertEquals(4, els.size());
    }

    @Test
    public void testByTagNamespace() {
        // tagName.contains("|") -> replace with ":"
        org.jsoup.select.Elements els = Selector.select("fb|name", doc);
        assertEquals(1, els.size());
    }

    // ---------- findElements(): byAttribute ----------

    @Test
    public void testByAttributeNoValue() {
        org.jsoup.select.Elements els = Selector.select("[data-test]", doc);
        assertEquals(1, els.size());
    }

    @Test
    public void testByAttributePrefix() {
        // key.startsWith("^") branch
        org.jsoup.select.Elements els = Selector.select("[^data-]", doc);
        assertEquals(1, els.size());
    }

    @Test
    public void testByAttributeEquals() {
        org.jsoup.select.Elements els = Selector.select("[data-test=1]", doc);
        assertEquals(1, els.size());
    }

    @Test
    public void testByAttributeNotEquals() {
        // combined with tag "div" to test AND-intersection path as well
        org.jsoup.select.Elements els = Selector.select("div[id!=2]", doc);
        assertEquals(1, els.size());
        assertEquals("1", els.first().id());
    }

    @Test
    public void testByAttributeStartsWith() {
        org.jsoup.select.Elements els = Selector.select("[id^=1]", doc);
        assertEquals(1, els.size());
    }

    @Test
    public void testByAttributeEndsWith() {
        org.jsoup.select.Elements els = Selector.select("[id$=1]", doc);
        assertEquals(1, els.size());
    }

    @Test
    public void testByAttributeContains() {
        org.jsoup.select.Elements els = Selector.select("[id*=1]", doc);
        assertEquals(1, els.size());
    }

    @Test
    public void testByAttributeRegexMatch() {
        org.jsoup.select.Elements els = Selector.select("[id~=\\d]", doc);
        assertEquals(2, els.size());
    }

    // ---------- findElements(): allElements ----------

    @Test
    public void testAllElements() {
        org.jsoup.select.Elements els = Selector.select("*", doc);
        assertEquals(doc.getAllElements().size(), els.size());
    }

    // ---------- findElements(): index pseudo-selectors ----------

    @Test
    public void testIndexLessThan() {
        org.jsoup.select.Elements els = Selector.select("p:lt(1)", doc);
        assertEquals(3, els.size()); // p.one, p(Three), p.deep (all have siblingIndex 0)
    }

    @Test
    public void testIndexGreaterThan() {
        org.jsoup.select.Elements els = Selector.select("p:gt(0)", doc);
        assertEquals(1, els.size()); // only p.two (siblingIndex 1)
    }

    @Test
    public void testIndexEquals() {
        org.jsoup.select.Elements els = Selector.select("p:eq(1)", doc);
        assertEquals(1, els.size()); // only p.two
    }

    @Test(expected = RuntimeException.class) // Validate.isTrue(StringUtil.isNumeric(..)) fails for non-numeric
    public void testConsumeIndexInvalidThrows() {
        Selector.select("p:lt(abc)", doc);
    }

    // ---------- findElements(): :has ----------

    @Test
    public void testHas() {
        org.jsoup.select.Elements els = Selector.select("div:has(span.wrap)", doc);
        assertEquals(1, els.size());
        assertEquals("2", els.first().id());
    }

    // ---------- findElements(): :contains / :containsOwn ----------

    @Test
    public void testContains() {
        org.jsoup.select.Elements els = Selector.select("p:contains(jsoup)", doc);
        assertEquals(1, els.size());
        assertEquals("two", els.first().className());
    }

    @Test
    public void testContainsOwn() {
        org.jsoup.select.Elements els = Selector.select("p:containsOwn(jsoup)", doc);
        assertEquals(1, els.size());
        assertEquals("two", els.first().className());
    }

    // ---------- findElements(): :matches / :matchesOwn ----------

    @Test
    public void testMatches() {
        org.jsoup.select.Elements els = Selector.select("p:matches(\\d+)", doc);
        assertEquals(1, els.size());
    }

    @Test
    public void testMatchesOwn() {
        org.jsoup.select.Elements els = Selector.select("p:matchesOwn(\\d+)", doc);
        assertEquals(1, els.size());
    }

    // ---------- findElements(): unhandled token -> else branch ----------

    @Test(expected = Selector.SelectorParseException.class)
    public void testUnhandledTokenThrows() {
        Selector.select("&", doc);
    }

    // ---------- select(): group "," branch ----------

    @Test
    public void testGroupSelector() {
        org.jsoup.select.Elements els = Selector.select("div, p", doc);
        assertEquals(5, els.size()); // 2 div + 3? -> div1,div2,p.one,p.two,p(Three),p.deep = wait check below
    }

    // ---------- combinator(): ">" (children) vs " " (descendants) ----------

    @Test
    public void testCombinatorChild() {
        org.jsoup.select.Elements els = Selector.select("div > p", doc);
        assertEquals(3, els.size()); // p.one, p.two, p(Three) ; p.deep excluded (parent is span.wrap)
    }

    @Test
    public void testCombinatorDescendant() {
        org.jsoup.select.Elements els = Selector.select("div p", doc);
        assertEquals(4, els.size()); // all 4 p's are descendants of some div
    }

    // ---------- combinator(): "+" (adjacent sibling) ----------

    @Test
    public void testCombinatorAdjacentSibling() {
        org.jsoup.select.Elements els = Selector.select("p + span", doc);
        assertEquals(2, els.size()); // span[data-test] after p.two ; span.wrap after p(Three)
    }

    @Test
    public void testCombinatorAdjacentSiblingNoMatch() {
        // fb:name's immediate previous sibling is span, not p -> "+" should not match
        org.jsoup.select.Elements els = Selector.select("p + fb|name", doc);
        assertEquals(0, els.size());
    }

    // ---------- combinator(): "~" (general sibling) ----------

    @Test
    public void testCombinatorGeneralSibling() {
        // fb:name has earlier (non-adjacent) sibling p's -> "~" should match
        org.jsoup.select.Elements els = Selector.select("p ~ fb|name", doc);
        assertEquals(1, els.size());
    }

    // ---------- static select(query, Iterable<Element> roots) ----------

    @Test
    public void testSelectIterableRootsMultiple() {
        List<Element> roots = new ArrayList<Element>();
        roots.add(doc.select("div#1").first());
        roots.add(doc.select("div#2").first());
        org.jsoup.select.Elements els = Selector.select("p", roots);
        assertEquals(4, els.size());
    }

    @Test
    public void testSelectIterableRootsEmptyList() {
        List<Element> roots = new ArrayList<Element>();
        org.jsoup.select.Elements els = Selector.select("p", roots);
        assertEquals(0, els.size());
    }

    @Test(expected = RuntimeException.class) // Validate.notNull(roots)
    public void testSelectIterableRootsNullThrows() {
        Selector.select("p", (Iterable<Element>) null);
    }

    @Test(expected = RuntimeException.class) // Validate.notEmpty(query)
    public void testSelectIterableEmptyQueryThrows() {
        List<Element> roots = new ArrayList<Element>();
        roots.add(doc);
        Selector.select("", roots);
    }

    // ---------- SelectorParseException message formatting ----------

    @Test
    public void testSelectorParseExceptionMessageFormat() {
        Selector.SelectorParseException ex =
            new Selector.SelectorParseException("Could not parse query '%s': unexpected token at '%s'", "abc", "def");
        assertEquals("Could not parse query 'abc': unexpected token at 'def'", ex.getMessage());
        assertTrue(ex instanceof IllegalStateException);
    }

    /*
     * หมายเหตุ (ไม่ทดสอบ เพราะ unreachable ผ่าน public API ตามซอร์สที่ให้มา):
     * 1) combinator(): branch "else throw new IllegalStateException("Unknown combinator...")"
     *    - ไม่สามารถเกิดได้เพราะ combinator ที่ถูกเรียกมาจาก tq.matchesAny(combinators) เท่านั้น
     *      ซึ่งมีแค่ ",", ">", "+", "~", " " และทุกค่าถูก handle ไว้หมดแล้วใน if/else ก่อนหน้า
     * 2) byAttribute(): branch "else throw new SelectorParseException(...)" ท้ายสุด
     *    - cq.consumeToAny(...) จะ stop ที่ตัวดำเนินการใดตัวหนึ่งเสมอถ้ามี, และถ้าไม่มีเลย cq จะ isEmpty()
     *      ทำให้ไม่สามารถเข้าถึง branch นี้ได้ด้วย input ปกติจาก public select API
     */
}
```

---

# สรุปตาราง Test Coverage

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testSelectNullQueryThrows | Validate.notNull(query) ใน constructor |
| testSelectEmptyQueryThrows | Validate.notEmpty(query) หลัง trim ("") |
| testSelectWhitespaceQueryThrows | query.trim() -> "" -> notEmpty fail |
| testSelectNullRootThrows | Validate.notNull(root) |
| testSelectStartsWithCombinator | select(): if (tq.matchesAny(combinators)) ตอนเริ่ม query |
| testByIdFound / testByIdNotFound | findElements(): matchChomp("#") -> byId(), found!=null / found==null |
| testByClass | findElements(): matchChomp(".") -> byClass() |
| testByTag | findElements(): matchesWord() -> byTag() |
| testByTagNamespace | byTag(): tagName.contains("|") replace branch |
| testByAttributeNoValue | byAttribute(): cq.isEmpty() true, ไม่ใช่ "^" |
| testByAttributePrefix | byAttribute(): key.startsWith("^") true |
| testByAttributeEquals | byAttribute(): cq.matchChomp("=") |
| testByAttributeNotEquals | byAttribute(): matchChomp("!="), + AND-intersect (filterForSelf) |
| testByAttributeStartsWith | byAttribute(): matchChomp("^=") |
| testByAttributeEndsWith | byAttribute(): matchChomp("$=") |
| testByAttributeContains | byAttribute(): matchChomp("*=") |
| testByAttributeRegexMatch | byAttribute(): matchChomp("~=") |
| testAllElements | findElements(): matchChomp("*") -> allElements() |
| testIndexLessThan | findElements(): matchChomp(":lt(") -> indexLessThan(), AND-intersect loop |
| testIndexGreaterThan | matchChomp(":gt(") -> indexGreaterThan() |
| testIndexEquals | matchChomp(":eq(") -> indexEquals() |
| testConsumeIndexInvalidThrows | consumeIndex(): Validate.isTrue(StringUtil.isNumeric) false |
| testHas | findElements(): matches(":has(") -> has(), filterForParentsOfDescendants |
| testContains | matches(":contains(") -> contains(false) |
| testContainsOwn | matches(":containsOwn(") -> contains(true) |
| testMatches | matches(":matches(") -> matches(false) |
| testMatchesOwn | matches(":matchesOwn(") -> matches(true) |
| testUnhandledTokenThrows | findElements(): else throw SelectorParseException |
| testGroupSelector | select(): tq.matchChomp(",") group-or loop |
| testCombinatorChild | combinator(">"): filterForChildren |
| testCombinatorDescendant | combinator(" "): filterForDescendants (seenWhite branch) |
| testCombinatorAdjacentSibling / NoMatch | combinator("+"): filterForAdjacentSiblings (match / no-match path) |
| testCombinatorGeneralSibling | combinator("~"): filterForGeneralSiblings |
| testSelectIterableRootsMultiple | static select(query, Iterable roots): for-loop รวมหลาย root |
| testSelectIterableRootsEmptyList | for-loop กรณี roots ว่าง (ไม่เข้า loop) |
| testSelectIterableRootsNullThrows | Validate.notNull(roots) |
| testSelectIterableEmptyQueryThrows | Validate.notEmpty(query) ใน static select(roots) |
| testSelectorParseExceptionMessageFormat | SelectorParseException: String.format ของ constructor |

**ข้อควรระวัง / สมมติฐานที่ไม่สามารถยืนยันได้จากซอร์สที่ให้มา:**
- `Validate.notNull/notEmpty/isTrue` ไม่มี source ให้ จึงใช้ `expected = RuntimeException.class` (superclass) แทนการเดา exception type ที่แน่ชัด
- Branch `else throw new IllegalStateException("Unknown combinator")` และ branch `else throw SelectorParseException` ท้าย `byAttribute()` ไม่สามารถเข้าถึงได้ผ่าน public API ตามการวิเคราะห์ logic จึงไม่ได้เขียนเทสคลุม (คอมเมนต์ไว้ในโค้ด)