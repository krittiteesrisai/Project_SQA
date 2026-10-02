package org.jsoup.select;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ElementsTest {

    // ---------- Helper ----------
    private Document parse(String html) {
        return Jsoup.parse(html);
    }

    // ---------- Constructors ----------

    @Test
    public void testDefaultConstructorEmpty() {
        Elements els = new Elements();
        assertTrue(els.isEmpty());
        assertEquals(0, els.size());
    }

    @Test
    public void testCollectionConstructorCopiesList() {
        Document doc = parse("<p>One</p><p>Two</p>");
        List<Element> ps = doc.select("p");
        List<Element> source = new ArrayList<Element>(ps);
        Elements els = new Elements(source);
        source.add(doc.select("body").first()); // mutate original after construction
        // Collection-constructor copies -> should NOT reflect mutation
        assertEquals(2, els.size());
    }

    @Test
    public void testListConstructorKeepsReference() {
        List<Element> list = new ArrayList<Element>();
        Document doc = parse("<p>One</p><p>Two</p>");
        list.add(doc.select("p").get(0));
        Elements els = new Elements(list);
        list.add(doc.select("p").get(1));
        // List-constructor stores the SAME reference -> mutation should reflect
        assertEquals(2, els.size());
    }

    @Test
    public void testVarargsConstructor() {
        Document doc = parse("<p>One</p><p>Two</p>");
        Element p1 = doc.select("p").get(0);
        Element p2 = doc.select("p").get(1);
        Elements els = new Elements(p1, p2);
        assertEquals(2, els.size());
    }

    // ---------- clone() ----------

    @Test
    public void testClone() {
        Document doc = parse("<div>One</div><div>Two</div>");
        Elements divs = doc.select("div");
        Elements cloned = divs.clone();
        assertEquals(divs.size(), cloned.size());
        assertNotSame(divs.get(0), cloned.get(0));
        assertEquals(divs.get(0).outerHtml(), cloned.get(0).outerHtml());

        // mutate clone must not affect original
        cloned.get(0).text("Changed");
        assertFalse(divs.get(0).text().equals("Changed"));
    }

    @Test
    public void testCloneEmpty() {
        Elements els = new Elements();
        Elements cloned = els.clone();
        assertTrue(cloned.isEmpty());
    }

    // ---------- attr() ----------

    @Test
    public void testAttrFound() {
        Document doc = parse("<div>One</div><div id=\"d2\">Two</div>");
        Elements divs = doc.select("div");
        // first element has no id, second has id="d2" -> loop should skip first
        assertEquals("d2", divs.attr("id"));
    }

    @Test
    public void testAttrNotFoundReturnsEmpty() {
        Document doc = parse("<div>One</div><div>Two</div>");
        Elements divs = doc.select("div");
        assertEquals("", divs.attr("missing"));
    }

    @Test
    public void testAttrOnEmptyListReturnsEmpty() {
        Elements els = new Elements();
        assertEquals("", els.attr("id"));
    }

    @Test
    public void testHasAttrTrue() {
        Document doc = parse("<div>One</div><div id=\"d2\">Two</div>");
        Elements divs = doc.select("div");
        assertTrue(divs.hasAttr("id"));
    }

    @Test
    public void testHasAttrFalse() {
        Document doc = parse("<div>One</div><div>Two</div>");
        Elements divs = doc.select("div");
        assertFalse(divs.hasAttr("id"));
    }

    @Test
    public void testSetAttrOnAll() {
        Document doc = parse("<div>One</div><div>Two</div>");
        Elements divs = doc.select("div");
        divs.attr("data-x", "v");
        for (Element e : divs) {
            assertEquals("v", e.attr("data-x"));
        }
    }

    @Test
    public void testRemoveAttr() {
        Document doc = parse("<div class=\"a\">One</div><div>Two</div>");
        Elements divs = doc.select("div");
        divs.removeAttr("class");
        assertFalse(divs.hasAttr("class"));
    }

    // ---------- class methods ----------

    @Test
    public void testAddClass() {
        Document doc = parse("<p>One</p><p>Two</p>");
        Elements ps = doc.select("p");
        ps.addClass("new-class");
        assertTrue(ps.hasClass("new-class"));
    }

    @Test
    public void testRemoveClass() {
        Document doc = parse("<p class=\"a\">One</p><p class=\"a\">Two</p>");
        Elements ps = doc.select("p");
        ps.removeClass("a");
        assertFalse(ps.hasClass("a"));
    }

    @Test
    public void testToggleClass() {
        Document doc = parse("<p class=\"a\">One</p><p>Two</p>");
        Elements ps = doc.select("p");
        ps.toggleClass("a");
        // First had 'a' -> removed; second lacked 'a' -> added
        assertFalse(ps.get(0).hasClass("a"));
        assertTrue(ps.get(1).hasClass("a"));
    }

    @Test
    public void testHasClassFalse() {
        Document doc = parse("<p>One</p>");
        Elements ps = doc.select("p");
        assertFalse(ps.hasClass("none"));
    }

    // ---------- val() ----------

    @Test
    public void testValOnNonEmpty() {
        Document doc = parse("<input value=\"x\">");
        Elements inputs = doc.select("input");
        assertEquals("x", inputs.val());
    }

    @Test
    public void testValOnEmptyReturnsEmptyString() {
        Elements els = new Elements();
        assertEquals("", els.val());
    }

    @Test
    public void testValSetter() {
        Document doc = parse("<input><input>");
        Elements inputs = doc.select("input");
        inputs.val("hello");
        for (Element e : inputs) {
            assertEquals("hello", e.val());
        }
    }

    // ---------- text / hasText ----------

    @Test
    public void testTextJoinsWithSpace() {
        Document doc = parse("<div>One</div><div>Two</div>");
        Elements divs = doc.select("div");
        assertEquals("One Two", divs.text());
    }

    @Test
    public void testTextOnEmptyIsEmptyString() {
        Elements els = new Elements();
        assertEquals("", els.text());
    }

    @Test
    public void testHasTextTrue() {
        Document doc = parse("<div>One</div><div></div>");
        Elements divs = doc.select("div");
        assertTrue(divs.hasText());
    }

    @Test
    public void testHasTextFalse() {
        Document doc = parse("<div></div><div></div>");
        Elements divs = doc.select("div");
        assertFalse(divs.hasText());
    }

    // ---------- html / outerHtml / toString ----------

    @Test
    public void testHtmlJoinsWithNewline() {
        Document doc = parse("<div>One</div><div>Two</div>");
        Elements divs = doc.select("div");
        assertEquals("One\nTwo", divs.html());
    }

    @Test
    public void testHtmlOnEmptyIsEmptyString() {
        Elements els = new Elements();
        assertEquals("", els.html());
    }

    @Test
    public void testOuterHtmlJoinsWithNewline() {
        Document doc = parse("<div>One</div><div>Two</div>");
        Elements divs = doc.select("div");
        String out = divs.outerHtml();
        assertTrue(out.contains("\n"));
        assertTrue(out.contains("<div>"));
    }

    @Test
    public void testToStringEqualsOuterHtml() {
        Document doc = parse("<div>One</div>");
        Elements divs = doc.select("div");
        assertEquals(divs.outerHtml(), divs.toString());
    }

    // ---------- tagName / html(set) / prepend / append / before / after ----------

    @Test
    public void testTagName() {
        Document doc = parse("<i>One</i><i>Two</i>");
        Elements is = doc.select("i");
        is.tagName("em");
        assertEquals(0, doc.select("i").size());
        assertEquals(2, doc.select("em").size());
    }

    @Test
    public void testHtmlSetter() {
        Document doc = parse("<div>One</div><div>Two</div>");
        Elements divs = doc.select("div");
        divs.html("<span>Changed</span>");
        for (Element e : divs) {
            assertEquals("<span>Changed</span>", e.html());
        }
    }

    @Test
    public void testPrepend() {
        Document doc = parse("<div>One</div>");
        Elements divs = doc.select("div");
        divs.prepend("<span>Pre</span>");
        assertTrue(divs.get(0).html().startsWith("<span>Pre</span>"));
    }

    @Test
    public void testAppend() {
        Document doc = parse("<div>One</div>");
        Elements divs = doc.select("div");
        divs.append("<span>Post</span>");
        assertTrue(divs.get(0).html().endsWith("<span>Post</span>"));
    }

    @Test
    public void testBefore() {
        Document doc = parse("<div><p>One</p></div>");
        Elements ps = doc.select("p");
        ps.before("<span>Before</span>");
        assertTrue(doc.body().html().indexOf("Before") < doc.body().html().indexOf("One"));
    }

    @Test
    public void testAfter() {
        Document doc = parse("<div><p>One</p></div>");
        Elements ps = doc.select("p");
        ps.after("<span>After</span>");
        assertTrue(doc.body().html().indexOf("After") > doc.body().html().indexOf("One"));
    }

    // ---------- wrap ----------

    @Test
    public void testWrapValid() {
        Document doc = parse("<p>One</p>");
        Elements ps = doc.select("p");
        ps.wrap("<div class=\"w\"></div>");
        assertNotNull(doc.select("div.w"));
        assertEquals(1, doc.select("div.w").size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWrapEmptyThrows() {
        Document doc = parse("<p>One</p>");
        Elements ps = doc.select("p");
        ps.wrap(""); // Validate.notEmpty should throw
    }

    // ---------- unwrap / empty / remove ----------

    @Test
    public void testUnwrap() {
        Document doc = parse("<div><font>One</font> <font><a href=\"/\">Two</a></font></div>");
        Elements fonts = doc.select("font");
        fonts.unwrap();
        assertEquals(0, doc.select("font").size());
        assertTrue(doc.body().html().contains("One"));
    }

    @Test
    public void testEmptyMethod() {
        Document doc = parse("<div><p>Hello <b>there</b></p></div>");
        Elements ps = doc.select("p");
        ps.empty();
        assertEquals("", ps.get(0).html());
    }

    @Test
    public void testRemoveMethod() {
        Document doc = parse("<div><p>Hello</p><p>there</p><img></div>");
        Elements ps = doc.select("p");
        ps.remove();
        assertEquals(0, doc.select("p").size());
        assertEquals(1, doc.select("img").size());
    }

    // ---------- select / not / eq / is ----------

    @Test
    public void testSelectNested() {
        Document doc = parse("<div><p class=\"a\">One</p><p>Two</p></div>");
        Elements divs = doc.select("div");
        Elements ps = divs.select("p.a");
        assertEquals(1, ps.size());
        assertEquals("One", ps.text());
    }

    @Test
    public void testNotFiltersOut() {
        Document doc = parse("<div class=\"logo\">One</div><div>Two</div>");
        Elements divs = doc.select("div");
        Elements result = divs.not("#logo"); // uses class selector incorrectly on purpose? use correct selector below
        // use correct selector for class
        Elements result2 = divs.not(".logo");
        assertEquals(1, result2.size());
        assertEquals("Two", result2.text());
    }

    @Test
    public void testEqWithinBounds() {
        Document doc = parse("<p>One</p><p>Two</p>");
        Elements ps = doc.select("p");
        Elements eq0 = ps.eq(0);
        assertEquals(1, eq0.size());
        assertEquals("One", eq0.text());
    }

    @Test
    public void testEqOutOfBoundsReturnsEmpty() {
        Document doc = parse("<p>One</p>");
        Elements ps = doc.select("p");
        Elements eq5 = ps.eq(5);
        assertTrue(eq5.isEmpty());
    }

    @Test
    public void testIsTrue() {
        Document doc = parse("<p class=\"a\">One</p>");
        Elements ps = doc.select("p");
        assertTrue(ps.is(".a"));
    }

    @Test
    public void testIsFalse() {
        Document doc = parse("<p>One</p>");
        Elements ps = doc.select("p");
        assertFalse(ps.is(".missing"));
    }

    // ---------- parents ----------

    @Test
    public void testParents() {
        Document doc = parse("<div><p>One</p></div>");
        Elements ps = doc.select("p");
        Elements parents = ps.parents();
        assertFalse(parents.isEmpty());
        // Should contain div, body, html
        boolean hasDiv = false;
        for (Element e : parents) {
            if (e.tagName().equals("div")) hasDiv = true;
        }
        assertTrue(hasDiv);
    }

    // ---------- first / last ----------

    @Test
    public void testFirstNonEmpty() {
        Document doc = parse("<p>One</p><p>Two</p>");
        Elements ps = doc.select("p");
        assertEquals("One", ps.first().text());
    }

    @Test
    public void testFirstEmptyReturnsNull() {
        Elements els = new Elements();
        assertNull(els.first());
    }

    @Test
    public void testLastNonEmpty() {
        Document doc = parse("<p>One</p><p>Two</p>");
        Elements ps = doc.select("p");
        assertEquals("Two", ps.last().text());
    }

    @Test
    public void testLastEmptyReturnsNull() {
        Elements els = new Elements();
        assertNull(els.last());
    }

    // ---------- traverse ----------

    @Test(expected = IllegalArgumentException.class)
    public void testTraverseNullThrows() {
        Document doc = parse("<p>One</p>");
        Elements ps = doc.select("p");
        ps.traverse(null); // Validate.notNull should throw
    }

    @Test
    public void testTraverseVisitsNodes() {
        Document doc = parse("<div><p>One</p></div>");
        Elements divs = doc.select("div");
        final int[] counter = {0};
        divs.traverse(new NodeVisitor() {
            public void head(Node node, int depth) {
                counter[0]++;
            }
            public void tail(Node node, int depth) {
                // no-op; not asserted, behavior not specified beyond callback invocation
            }
        });
        assertTrue(counter[0] > 0);
    }

    // ---------- List-like delegate methods ----------

    @Test
    public void testSizeAndIsEmpty() {
        Elements els = new Elements();
        assertEquals(0, els.size());
        assertTrue(els.isEmpty());

        Document doc = parse("<p>One</p>");
        Elements ps = doc.select("p");
        assertEquals(1, ps.size());
        assertFalse(ps.isEmpty());
    }

    @Test
    public void testContains() {
        Document doc = parse("<p>One</p>");
        Elements ps = doc.select("p");
        Element p = ps.get(0);
        assertTrue(ps.contains(p));
        assertFalse(ps.contains(new Object()));
    }

    @Test
    public void testIteratorIteratesAllElements() {
        Document doc = parse("<p>One</p><p>Two</p>");
        Elements ps = doc.select("p");
        int count = 0;
        for (Element e : ps) {
            assertNotNull(e);
            count++;
        }
        assertEquals(2, count);
    }

    @Test
    public void testToArray() {
        Document doc = parse("<p>One</p><p>Two</p>");
        Elements ps = doc.select("p");
        Object[] arr = ps.toArray();
        assertEquals(2, arr.length);
    }

    @Test
    public void testToArrayTyped() {
        Document doc = parse("<p>One</p><p>Two</p>");
        Elements ps = doc.select("p");
        Element[] arr = ps.toArray(new Element[0]);
        assertEquals(2, arr.length);
    }

    @Test
    public void testAddAndRemoveByObject() {
        Document doc = parse("<p>One</p>");
        Element extra = doc.select("p").get(0);
        Elements els = new Elements();
        assertTrue(els.add(extra));
        assertEquals(1, els.size());
        assertTrue(els.remove(extra));
        assertEquals(0, els.size());
    }

    @Test
    public void testContainsAll() {
        Document doc = parse("<p>One</p><p>Two</p>");
        Elements ps = doc.select("p");
        List<Element> subset = Arrays.asList(ps.get(0));
        assertTrue(ps.containsAll(subset));
    }

    @Test
    public void testAddAllCollection() {
        Document doc = parse("<p>One</p><p>Two</p>");
        Elements ps = doc.select("p");
        Elements els = new Elements();
        assertTrue(els.addAll(ps));
        assertEquals(2, els.size());
    }

    @Test
    public void testAddAllAtIndex() {
        Document doc = parse("<p>One</p><p>Two</p><p>Three</p>");
        Elements ps = doc.select("p");
        Elements els = new Elements();
        els.add(ps.get(0));
        els.addAll(1, Arrays.asList(ps.get(1), ps.get(2)));
        assertEquals(3, els.size());
        assertEquals("Two", els.get(1).text());
    }

    @Test
    public void testRemoveAll() {
        Document doc = parse("<p>One</p><p>Two</p>");
        Elements ps = doc.select("p");
        Elements els = new Elements(ps);
        els.removeAll(Arrays.asList(ps.get(0)));
        assertEquals(1, els.size());
        assertEquals("Two", els.get(0).text());
    }

    @Test
    public void testRetainAll() {
        Document doc = parse("<p>One</p><p>Two</p>");
        Elements ps = doc.select("p");
        Elements els = new Elements(ps);
        els.retainAll(Arrays.asList(ps.get(0)));
        assertEquals(1, els.size());
        assertEquals("One", els.get(0).text());
    }

    @Test
    public void testClear() {
        Document doc = parse("<p>One</p>");
        Elements ps = doc.select("p");
        ps.clear();
        assertTrue(ps.isEmpty());
    }

    @Test
    public void testEqualsAndHashCode() {
        Document doc = parse("<p>One</p>");
        Elements a = doc.select("p");
        Elements b = new Elements(a);
        assertTrue(a.equals(b));
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testGetAndSet() {
        Document doc = parse("<p>One</p><p>Two</p>");
        Elements ps = doc.select("p");
        Element original = ps.get(0);
        Element newEl = ps.get(1);
        Element old = ps.set(0, newEl);
        assertSame(original, old);
        assertSame(newEl, ps.get(0));
    }

    @Test
    public void testAddAtIndex() {
        Document doc = parse("<p>One</p><p>Two</p>");
        Elements ps = doc.select("p");
        Element extra = ps.get(1);
        ps.add(0, extra);
        assertEquals(3, ps.size());
        assertSame(extra, ps.get(0));
    }

    @Test
    public void testRemoveByIndex() {
        Document doc = parse("<p>One</p><p>Two</p>");
        Elements ps = doc.select("p");
        Element removed = ps.remove(0);
        assertEquals("One", removed.text());
        assertEquals(1, ps.size());
    }

    @Test
    public void testIndexOfAndLastIndexOf() {
        Document doc = parse("<p>One</p><p>Two</p>");
        Elements ps = doc.select("p");
        Element p0 = ps.get(0);
        assertEquals(0, ps.indexOf(p0));
        assertEquals(0, ps.lastIndexOf(p0));
    }

    @Test
    public void testListIterator() {
        Document doc = parse("<p>One</p><p>Two</p>");
        Elements ps = doc.select("p");
        int count = 0;
        for (java.util.ListIterator<Element> it = ps.listIterator(); it.hasNext(); ) {
            it.next();
            count++;
        }
        assertEquals(2, count);
    }

    @Test
    public void testListIteratorWithIndex() {
        Document doc = parse("<p>One</p><p>Two</p>");
        Elements ps = doc.select("p");
        java.util.ListIterator<Element> it = ps.listIterator(1);
        assertTrue(it.hasNext());
        assertEquals("Two", it.next().text());
    }

    @Test
    public void testSubList() {
        Document doc = parse("<p>One</p><p>Two</p><p>Three</p>");
        Elements ps = doc.select("p");
        List<Element> sub = ps.subList(1, 3);
        assertEquals(2, sub.size());
        assertEquals("Two", sub.get(0).text());
    }
}
