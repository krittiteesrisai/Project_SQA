package org.jsoup.select;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class SelectorTest {

    // --- 1. Validation & Edge Cases (Null, Empty, Blank) ---

    @Test(expected = IllegalArgumentException.class)
    public void testSelectNullQuery() {
        Document doc = new Document("");
        Selector.select(null, doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelectEmptyQuery() {
        Document doc = new Document("");
        Selector.select("", doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelectBlankQuery() {
        Document doc = new Document("");
        Selector.select("   ", doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelectNullRoot() {
        Selector.select("div", (Element) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelectIterableRootsNullQuery() {
        Selector.select(null, Collections.emptyList());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSelectIterableRootsNullRoots() {
        Selector.select("div", (Iterable<Element>) null);
    }

    @Test
    public void testSelectIterableRootsValid() {
        Document doc1 = new Document("");
        doc1.appendChild(new Element(org.jsoup.parser.Tag.valueOf("div"), "").id("d1"));
        Document doc2 = new Document("");
        doc2.appendChild(new Element(org.jsoup.parser.Tag.valueOf("div"), "").id("d2"));

        Elements elements = Selector.select("div", Arrays.asList(doc1, doc2));
        assertEquals(2, elements.size());
    }

    // --- 2. Starting with Combinator & Combinator Branch Coverage ---

    @Test
    public void testSelectStartsWithCombinator() {
        Document doc = new Document("");
        Element parent = doc.appendChild(new Element(org.jsoup.parser.Tag.valueOf("div"), "").id("p"));
        parent.appendChild(new Element(org.jsoup.parser.Tag.valueOf("span"), "").id("s"));

        Elements elements = Selector.select("> span", parent);
        assertEquals(1, elements.size());
        assertEquals("s", elements.first().id());
    }

    @Test
    public void testAllCombinatorsAndFilters() {
        Document doc = new Document("");
        Element root = doc.appendElement("div");
        Element child1 = root.appendElement("div").attr("id", "c1");
        Element child2 = root.appendElement("div").attr("id", "c2");
        Element subChild = child2.appendElement("span").attr("id", "sc");

        // Descendant ( )
        Elements desc = Selector.select("div span", root);
        assertEquals(1, desc.size());

        // Adjacent sibling (+)
        Elements adj = Selector.select("#c1 + div", root);
        assertEquals(1, adj.size());
        assertEquals("c2", adj.first().id());

        // General sibling (~)
        Element child3 = root.appendElement("div").attr("id", "c3");
        Elements gen = Selector.select("#c1 ~ div", root);
        assertEquals(2, gen.size());
    }

    @Test(expected = IllegalStateException.class)
    public void testUnknownCombinatorThrowsException() {
        Document doc = new Document("");
        // ใช้ reflection หรือจำลองผ่าน query ที่ทำให้เกิด unknown combinator หากทำได้ หรือทดสอบผ่านโครงสร้างภายใน
        // ในที่นี้ Selector มีการเช็ค combinators เป็นชุดเฉพาะ ทางอ้อมอาจทดสอบผ่านการเรียกใช้ผ่าน query แปลกๆ ถ้า TokenQueue เอื้ออำนวย
        // หรือจำลองโดยตรงผ่าน Selector หากเข้าถึงได้ แต่เนื่องจาก modifier เป็น private จึงทดสอบผ่าน Token/Parser พฤติกรรมใกล้เคียง
        Selector.select("div ? span", doc);
    }

    // --- 3. Find Elements: ID, Class, Tag, Namespaces ---

    @Test
    public void testByIdFoundAndNotFound() {
        Document doc = new Document("");
        doc.appendElement("div").id("myId");

        Elements found = Selector.select("#myId", doc);
        assertEquals(1, found.size());

        Elements notFound = Selector.select("#nonExistent", doc);
        assertTrue(notFound.isEmpty());
    }

    @Test
    public void testByClass() {
        Document doc = new Document("");
        doc.appendElement("div").addClass("myClass");

        Elements found = Selector.select(".myClass", doc);
        assertEquals(1, found.size());
    }

    @Test
    public void testByTagWithNamespace() {
        Document doc = new Document("");
        doc.appendElement("fb:name");

        Elements found = Selector.select("fb|name", doc);
        assertEquals(1, found.size());
    }

    @Test
    public void testAllElementsWildcard() {
        Document doc = new Document("");
        doc.appendElement("p");
        doc.appendElement("span");

        Elements found = Selector.select("*", doc);
        assertTrue(found.size() >= 2);
    }

    // --- 4. Attributes Selectors Branch Coverage ---

    @Test
    public void testAttributesVariants() {
        Document doc = new Document("");
        doc.appendElement("a").attr("href", "http://example.com").attr("data-test", "val");
        doc.appendElement("img").attr("src", "image.png");
        doc.appendElement("div").attr("title", "hello world");

        // [attr]
        assertEquals(1, Selector.select("[href]", doc).size());
        // [^attrPrefix]
        assertEquals(1, Selector.select("[^data-]", doc).size());
        // [attr=val]
        assertEquals(1, Selector.select("[src=image.png]", doc).size());
        // [attr!=val]
        assertEquals(2, Selector.select("[src!=image.png]", doc).size());
        // [attr^=valPrefix]
        assertEquals(1, Selector.select("[href^=http]", doc).size());
        // [attr$=valSuffix]
        assertEquals(1, Selector.select("[src$=.png]", doc).size());
        // [attr*=valContaining]
        assertEquals(1, Selector.select("[title*=lo wo]", doc).size());
        // [attr~=regex]
        assertEquals(1, Selector.select("[src~=(?i)\\.png]", doc).size());
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testInvalidAttributeQuery() {
        Document doc = new Document("");
        Selector.select("[attr ??? val]", doc);
    }

    // --- 5. Pseudo Selectors: lt, gt, eq, has, contains, matches ---

    @Test
    public void testIndexPseudoSelectors() {
        Document doc = new Document("");
        doc.appendElement("li").text("1");
        doc.appendElement("li").text("2");
        doc.appendElement("li").text("3");

        assertEquals(1, Selector.select("li:eq(1)", doc).size());
        assertEquals(2, Selector.select("li:lt(2)", doc).size());
        assertEquals(1, Selector.select("li:gt(1)", doc).size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIndexNotNumeric() {
        Document doc = new Document("");
        doc.appendElement("li");
        Selector.select("li:eq(abc)", doc);
    }

    @Test
    public void testHasPseudoSelector() {
        Document doc = new Document("");
        Element div = doc.appendElement("div");
        div.appendElement("p");

        Elements found = Selector.select("div:has(p)", doc);
        assertEquals(1, found.size());
    }

    @Test
    public void testContainsPseudoSelectors() {
        Document doc = new Document("");
        doc.appendElement("p").text("Hello Jsoup World");

        assertEquals(1, Selector.select("p:contains(Jsoup)", doc).size());
        assertEquals(1, Selector.select("p:containsOwn(Jsoup)", doc).size());
    }

    @Test
    public void testMatchesPseudoSelectors() {
        Document doc = new Document("");
        doc.appendElement("p").text("Item 123");

        assertEquals(1, Selector.select("p:matches(\\d+)", doc).size());
        assertEquals(1, Selector.select("p:matchesOwn(\\d+)", doc).size());
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testUnrecognizedTokenThrowsParseException() {
        Document doc = new Document("");
        Selector.select(":::invalid", doc);
    }

    @Test
    public void testGroupOrQuery() {
        Document doc = new Document("");
        doc.appendElement("div").id("d");
        doc.appendElement("span").id("s");

        Elements found = Selector.select("div, span", doc);
        assertEquals(2, found.size());
    }
}