package org.jsoup.select;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;

import static org.junit.Assert.*;

public class SelectorTest {

    @Test
    public void testSelectBasicTagAndUniversal() {
        Document doc = Document.parse("<div><p>Hello</p><span>World</span></div>");
        Elements divs = Selector.select("div", doc);
        assertEquals(1, divs.size());

        Elements all = Selector.select("*", doc);
        assertTrue(all.size() >= 3);
    }

    @Test
    public void testSelectById() {
        Document doc = Document.parse("<div id='unique'>Content</div>");
        Elements found = Selector.select("#unique", doc);
        assertEquals(1, found.size());
        assertEquals("div", found.first().tagName());

        Elements notFound = Selector.select("#nonexistent", doc);
        assertTrue(notFound.isEmpty());
    }

    @Test
    public void testSelectByClass() {
        Document doc = Document.parse("<div class='test-class'>A</div><span class='test-class'>B</span>");
        Elements found = Selector.select(".test-class", doc);
        assertEquals(2, found.size());
    }

    @Test
    public void testSelectByNamespaceTag() {
        Document doc = Document.parse("<fb:name>Test</fb:name>");
        Elements found = Selector.select("fb|name", doc);
        assertEquals(1, found.size());
    }

    @Test
    public void testSelectByAttributes() {
        Document doc = Document.parse(
            "<a href='http://example.com' title='Ex' data-id='123'>Link</a>" +
            "<img src='image.png' width='500'/>" +
            "<div class='box' rel='nofollow'>Box</div>"
        );

        // [attr]
        assertEquals(1, Selector.select("a[href]", doc).size());
        // [^attrPrefix]
        assertEquals(1, Selector.select("a[^data-]", doc).size());
        // [attr=val]
        assertEquals(1, Selector.select("img[width=500]", doc).size());
        // [attr!=val]
        assertEquals(2, Selector.select("img[width!=100]", doc).size());
        // [attr^=val]
        assertEquals(1, Selector.select("a[href^=http]", doc).size());
        // [attr$=val]
        assertEquals(1, Selector.select("img[src$=.png]", doc).size());
        // [attr*=val]
        assertEquals(1, Selector.select("a[href*=example]", doc).size());
        // [attr~=val]
        assertEquals(1, Selector.select("div[rel~=(?i)nofollow]", doc).size());
    }

    @Test
    public void testSelectIterableRoots() {
        Document doc1 = Document.parse("<div><p>One</p></div>");
        Document doc2 = Document.parse("<div><p>Two</p></div>");
        Iterable<Element> roots = Arrays.asList(doc1.body().child(0), doc2.body().child(0));

        Elements results = Selector.select("p", roots);
        assertEquals(2, results.size());
    }

    @Test
    public void testCombinators() {
        Document doc = Document.parse("<div class='parent'><p>Child</p></div><p>Sibling</p><p>GenSibling</p>");
        
        // Descendant (space)
        assertEquals(1, Selector.select("div p", doc).size());
        // Child (>)
        assertEquals(1, Selector.select("div > p", doc).size());
        
        // Sibling (+) and (~)
        Document sibDoc = Document.parse("<div></div><p>First</p><p>Second</p><span>Other</span><p>Third</p>");
        Elements adj = Selector.select("p + p", sibDoc);
        assertEquals(1, adj.size());

        Elements gen = Selector.select("p ~ p", sibDoc);
        assertEquals(2, gen.size());

        // Starting with combinator
        Elements startsWithComb = Selector.select("> p", doc.body().child(0));
        assertEquals(1, startsWithComb.size());
    }

    @Test
    public void testPseudoSelectorsIndex() {
        Document doc = Document.parse("<ul><li>1</li><li>2</li><li>3</li></ul>");
        
        assertEquals(1, Selector.select("li:eq(1)", doc).size());
        assertEquals(2, Selector.select("li:lt(2)", doc).size());
        assertEquals(1, Selector.select("li:gt(1)", doc).size());
    }

    @Test
    public void testPseudoSelectorsContentAndMatching() {
        Document doc = Document.parse("<div><p>Hello Jsoup</p><p>Other Text</p></div>");

        assertEquals(1, Selector.select("p:contains(Jsoup)", doc).size());
        assertEquals(1, Selector.select("p:containsOwn(Hello)", doc).size());
        assertEquals(1, Selector.select("p:matches((?i)jsoup)", doc).size());
        assertEquals(1, Selector.select("p:matchesOwn((?i)hello)", doc).size());
    }

    @Test
    public void testPseudoSelectorsHasAndNot() {
        Document doc = Document.parse("<div><p class='target'>Inside</p></div><div><p>Outside</p></div>");

        assertEquals(1, Selector.select("div:has(.target)", doc).size());
        assertEquals(1, Selector.select("p:not(.target)", doc).size());
    }

    @Test
    public void testGroupOrQuery() {
        Document doc = Document.parse("<div><p>P</p><span>Span</span></div>");
        Elements results = Selector.select("p, span", doc);
        assertEquals(2, results.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidationNullQuery() {
        Selector.select(null, new Element(Tag.valueOf("div"), ""));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidationEmptyQuery() {
        Selector.select("   ", new Element(Tag.valueOf("div"), ""));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidationNullRoot() {
        Selector.select("div", (Element) null);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testInvalidTokenParserException() {
        Selector.select("@@@", Document.parse("<div></div>"));
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testInvalidAttributeQueryException() {
        Selector.select("[attr???val]", Document.parse("<div attr='val'></div>"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidIndexNumericException() {
        Selector.select("li:eq(abc)", Document.parse("<ul><li>1</li></ul>"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyHasSubQueryException() {
        Selector.select("div:has()", Document.parse("<div></div>"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyContainsQueryException() {
        Selector.select("p:contains()", Document.parse("<p></p>"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyNotSubQueryException() {
        Selector.select("div:not()", Document.parse("<div></div>"));
    }

    @Test(expected = IllegalStateException.class)
    public void testUnknownCombinatorException() throws Exception {
        // สะท้อนการทดสอบกรณี combinator ที่ไม่อยู่ในเงื่อนไขผ่าน Reflection หรือจำลองพฤติกรรมภายในถ้าทำได้
        // เนื่องจาก combinator ถูกจำกัดด้วยชุดอักขระ เราสามารถทดสอบผ่านโค้ดภายใน หรือข้ามหากถูกกรองโดย TokenQueue
        java.lang.reflect.Method method = Selector.class.getDeclaredMethod("combinator", char.class);
        method.setAccessible(true);
        Document doc = Document.parse("<div><p>A</p></div>");
        Selector selector = Selector.class.getDeclaredConstructor(String.class, Element.class).newInstance("div", doc);
        try {
            method.invoke(selector, '?');
        } catch (java.lang.reflect.InvocationTargetException e) {
            if (e.getCause() instanceof IllegalStateException) {
                throw (IllegalStateException) e.getCause();
            }
            throw e;
        }
    }
}