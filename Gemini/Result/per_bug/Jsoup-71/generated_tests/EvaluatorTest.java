package org.jsoup.select;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Tag;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class EvaluatorTest {

    @Test
    public void testTagEvaluator() {
        Evaluator eval = new Evaluator.Tag("div");
        Element match = new Element(Tag.valueOf("div"), "");
        Element noMatch = new Element(Tag.valueOf("span"), "");
        Element caseMatch = new Element(Tag.valueOf("DIV"), "");

        assertTrue(eval.matches(match, match));
        assertFalse(eval.matches(noMatch, noMatch));
        assertTrue(eval.matches(caseMatch, caseMatch));
        assertEquals("div", eval.toString());
    }

    @Test
    public void testTagEndsWithEvaluator() {
        Evaluator eval = new Evaluator.TagEndsWith("content");
        Element match = new Element(Tag.valueOf("div-content"), "");
        Element noMatch = new Element(Tag.valueOf("content-div"), "");

        assertTrue(eval.matches(match, match));
        assertFalse(eval.matches(noMatch, noMatch));
        assertEquals("content", eval.toString());
    }

    @Test
    public void testIdEvaluator() {
        Evaluator eval = new Evaluator.Id("main");
        Element match = new Element(Tag.valueOf("div"), "").id("main");
        Element noMatch = new Element(Tag.valueOf("div"), "").id("other");
        Element emptyMatch = new Element(Tag.valueOf("div"), "");

        assertTrue(eval.matches(match, match));
        assertFalse(eval.matches(noMatch, noMatch));
        assertFalse(eval.matches(emptyMatch, emptyMatch));
        assertEquals("#main", eval.toString());
    }

    @Test
    public void testClassEvaluator() {
        Evaluator eval = new Evaluator.Class("btn");
        Element match = new Element(Tag.valueOf("button"), "").addClass("btn");
        Element noMatch = new Element(Tag.valueOf("button"), "").addClass("link");

        assertTrue(eval.matches(match, match));
        assertFalse(eval.matches(noMatch, noMatch));
        assertEquals(".btn", eval.toString());
    }

    @Test
    public void testAttributeEvaluator() {
        Evaluator eval = new Evaluator.Attribute("href");
        Element match = new Element(Tag.valueOf("a"), "").attr("href", "#");
        Element noMatch = new Element(Tag.valueOf("a"), "");

        assertTrue(eval.matches(match, match));
        assertFalse(eval.matches(noMatch, noMatch));
        assertEquals("[href]", eval.toString());
    }

    @Test
    public void testAttributeStartingEvaluator() {
        Evaluator eval = new Evaluator.AttributeStarting("data-");
        Element match = new Element(Tag.valueOf("div"), "").attr("data-id", "123");
        Element noMatch = new Element(Tag.valueOf("div"), "").attr("id", "123");

        assertTrue(eval.matches(match, match));
        assertFalse(eval.matches(noMatch, noMatch));
        assertEquals("[^data-]", eval.toString());
    }

    @Test
    public void testAttributeKeyPairConstructorAndValues() {
        // Test quote stripping paths in AttributeKeyPair
        Evaluator.AttributeWithValue eval1 = new Evaluator.AttributeWithValue("class", "\"my-class\"");
        Evaluator.AttributeWithValue eval2 = new Evaluator.AttributeWithValue("class", "'my-class'");
        Evaluator.AttributeWithValue eval3 = new Evaluator.AttributeWithValue("class", "my-class");

        Element el = new Element(Tag.valueOf("div"), "").attr("class", "my-class");
        assertTrue(eval1.matches(el, el));
        assertTrue(eval2.matches(el, el));
        assertTrue(eval3.matches(el, el));
    }

    @Test
    public void testAttributeWithValueEvaluator() {
        Evaluator eval = new Evaluator.AttributeWithValue("target", "_blank");
        Element match = new Element(Tag.valueOf("a"), "").attr("target", "_blank");
        Element noMatchAttr = new Element(Tag.valueOf("a"), "");
        Element noMatchVal = new Element(Tag.valueOf("a"), "").attr("target", "_self");

        assertTrue(eval.matches(match, match));
        assertFalse(eval.matches(noMatchAttr, noMatchAttr));
        assertFalse(eval.matches(noMatchVal, noMatchVal));
        assertEquals("[target=_blank]", eval.toString());
    }

    @Test
    public void testAttributeWithValueNotEvaluator() {
        Evaluator eval = new Evaluator.AttributeWithValueNot("status", "active");
        Element match = new Element(Tag.valueOf("div"), "").attr("status", "pending");
        Element noMatch = new Element(Tag.valueOf("div"), "").attr("status", "active");

        assertTrue(eval.matches(match, match));
        assertFalse(eval.matches(noMatch, noMatch));
        assertEquals("[status!=active]", eval.toString());
    }

    @Test
    public void testAttributeWithValueStartingEvaluator() {
        Evaluator eval = new Evaluator.AttributeWithValueStarting("src", "https");
        Element match = new Element(Tag.valueOf("img"), "").attr("src", "HTTPS://example.com");
        Element noMatchAttr = new Element(Tag.valueOf("img"), "");
        Element noMatchVal = new Element(Tag.valueOf("img"), "").attr("src", "http://example.com");

        assertTrue(eval.matches(match, match));
        assertFalse(eval.matches(noMatchAttr, noMatchAttr));
        assertFalse(eval.matches(noMatchVal, noMatchVal));
        assertEquals("[src^=https]", eval.toString());
    }

    @Test
    public void testAttributeWithValueEndingEvaluator() {
        Evaluator eval = new Evaluator.AttributeWithValueEnding("class", "active");
        Element match = new Element(Tag.valueOf("div"), "").attr("class", "nav active");
        Element noMatchAttr = new Element(Tag.valueOf("div"), "");
        Element noMatchVal = new Element(Tag.valueOf("div"), "").attr("class", "active nav");

        assertTrue(eval.matches(match, match));
        assertFalse(eval.matches(noMatchAttr, noMatchAttr));
        assertFalse(eval.matches(noMatchVal, noMatchVal));
        assertEquals("[class$=active]", eval.toString());
    }

    @Test
    public void testAttributeWithValueContainingEvaluator() {
        Evaluator eval = new Evaluator.AttributeWithValueContaining("title", "test");
        Element match = new Element(Tag.valueOf("div"), "").attr("title", "A Test String");
        Element noMatchAttr = new Element(Tag.valueOf("div"), "");
        Element noMatchVal = new Element(Tag.valueOf("div"), "").attr("title", "No match here");

        assertTrue(eval.matches(match, match));
        assertFalse(eval.matches(noMatchAttr, noMatchAttr));
        assertFalse(eval.matches(noMatchVal, noMatchVal));
        assertEquals("[title*=test]", eval.toString());
    }

    @Test
    public void testAttributeWithValueMatchingEvaluator() {
        Pattern pattern = Pattern.compile("^\\d+$");
        Evaluator eval = new Evaluator.AttributeWithValueMatching("data-id", pattern);
        Element match = new Element(Tag.valueOf("div"), "").attr("data-id", "12345");
        Element noMatchAttr = new Element(Tag.valueOf("div"), "");
        Element noMatchVal = new Element(Tag.valueOf("div"), "").attr("data-id", "abc");

        assertTrue(eval.matches(match, match));
        assertFalse(eval.matches(noMatchAttr, noMatchAttr));
        assertFalse(eval.matches(noMatchVal, noMatchVal));
        assertEquals("[data-id~=^\\d+$]", eval.toString());
    }

    @Test
    public void testAllElementsEvaluator() {
        Evaluator eval = new Evaluator.AllElements();
        Element el = new Element(Tag.valueOf("div"), "");
        assertTrue(eval.matches(el, el));
        assertEquals("*", eval.toString());
    }

    @Test
    public void testIndexEvaluators() {
        Element root = new Element(Tag.valueOf("root"), "");
        Element child0 = new Element(Tag.valueOf("p"), "");
        Element child1 = new Element(Tag.valueOf("p"), "");
        Element child2 = new Element(Tag.valueOf("p"), "");
        root.appendChild(child0);
        root.appendChild(child1);
        root.appendChild(child2);

        // IndexLessThan
        Evaluator lt = new Evaluator.IndexLessThan(1);
        assertTrue(lt.matches(root, child0)); // root != element && 0 < 1
        assertFalse(lt.matches(root, root));  // root == element branch
        assertFalse(lt.matches(root, child1)); // 1 < 1 is false
        assertEquals(":lt(1)", lt.toString());

        // IndexGreaterThan
        Evaluator gt = new Evaluator.IndexGreaterThan(0);
        assertTrue(gt.matches(root, child1)); // 1 > 0
        assertFalse(gt.matches(root, child0)); // 0 > 0 is false
        assertEquals(":gt(0)", gt.toString());

        // IndexEquals
        Evaluator eq = new Evaluator.IndexEquals(1);
        assertTrue(eq.matches(root, child1)); // 1 == 1
        assertFalse(eq.matches(root, child0)); // 0 == 1 is false
        assertEquals(":eq(1)", eq.toString());
    }

    @Test
    public void testIsLastChildEvaluator() {
        Element root = new Element(Tag.valueOf("root"), "");
        Element child0 = new Element(Tag.valueOf("p"), "");
        Element child1 = new Element(Tag.valueOf("p"), "");
        root.appendChild(child0);
        root.appendChild(child1);

        Evaluator eval = new Evaluator.IsLastChild();
        assertTrue(eval.matches(root, child1));
        assertFalse(eval.matches(root, child0));

        // Edge case: parent is null or Document
        Element orphan = new Element(Tag.valueOf("div"), "");
        assertFalse(eval.matches(orphan, orphan));

        Document doc = new Document("");
        Element docChild = new Element(Tag.valueOf("html"), "");
        doc.appendChild(docChild);
        assertFalse(eval.matches(doc, docChild)); // parent instanceof Document
        assertEquals(":last-child", eval.toString());
    }

    @Test
    public void testIsFirstChildEvaluator() {
        Element root = new Element(Tag.valueOf("root"), "");
        Element child0 = new Element(Tag.valueOf("p"), "");
        Element child1 = new Element(Tag.valueOf("p"), "");
        root.appendChild(child0);
        root.appendChild(child1);

        Evaluator eval = new Evaluator.IsFirstChild();
        assertTrue(eval.matches(root, child0));
        assertFalse(eval.matches(root, child1));

        Element orphan = new Element(Tag.valueOf("div"), "");
        assertFalse(eval.matches(orphan, orphan));
        assertEquals(":first-child", eval.toString());
    }

    @Test
    public void testIsRootEvaluator() {
        Document doc = new Document("");
        Element root = new Element(Tag.valueOf("html"), "");
        doc.appendChild(root);
        Element child = new Element(Tag.valueOf("body"), "");
        root.appendChild(child);

        Evaluator eval = new Evaluator.IsRoot();
        assertTrue(eval.matches(doc, root)); // root instanceof Document -> child(0) is root
        assertFalse(eval.matches(doc, child));

        Element elementRoot = new Element(Tag.valueOf("div"), "");
        assertTrue(eval.matches(elementRoot, elementRoot)); // root not Document
        assertEquals(":root", eval.toString());
    }

    @Test
    public void testIsOnlyChildEvaluator() {
        Element root = new Element(Tag.valueOf("root"), "");
        Element onlyChild = new Element(Tag.valueOf("p"), "");
        root.appendChild(onlyChild);

        Element child1 = new Element(Tag.valueOf("p"), "");
        Element child2 = new Element(Tag.valueOf("p"), "");
        Element rootMultiple = new Element(Tag.valueOf("root"), "");
        rootMultiple.appendChild(child1);
        rootMultiple.appendChild(child2);

        Evaluator eval = new Evaluator.IsOnlyChild();
        assertTrue(eval.matches(root, onlyChild));
        assertFalse(eval.matches(rootMultiple, child1));

        Element orphan = new Element(Tag.valueOf("div"), "");
        assertFalse(eval.matches(orphan, orphan));
        assertEquals(":only-child", eval.toString());
    }

    @Test
    public void testIsOnlyOfTypeEvaluator() {
        Element root = new Element(Tag.valueOf("root"), "");
        Element p1 = new Element(Tag.valueOf("p"), "");
        Element span1 = new Element(Tag.valueOf("span"), "");
        root.appendChild(p1);
        root.appendChild(span1);

        Element rootMultiple = new Element(Tag.valueOf("root"), "");
        Element p2 = new Element(Tag.valueOf("p"), "");
        Element p3 = new Element(Tag.valueOf("p"), "");
        rootMultiple.appendChild(p2);
        rootMultiple.appendChild(p3);

        Evaluator eval = new Evaluator.IsOnlyOfType();
        assertTrue(eval.matches(root, p1));
        assertFalse(eval.matches(rootMultiple, p2));

        Element orphan = new Element(Tag.valueOf("div"), "");
        assertFalse(eval.matches(orphan, orphan));

        Document doc = new Document("");
        assertFalse(eval.matches(doc, doc));
        assertEquals(":only-of-type", eval.toString());
    }

    @Test
    public void testCssNthEvaluatorsAndSubclasses() {
        Element root = new Element(Tag.valueOf("root"), "");
        Element c1 = new Element(Tag.valueOf("p"), "");
        Element c2 = new Element(Tag.valueOf("span"), "");
        Element c3 = new Element(Tag.valueOf("p"), "");
        root.appendChild(c1);
        root.appendChild(c2);
        root.appendChild(c3);

        // IsNthChild (a = 0, b = 2 -> pos == 2)
        Evaluator nthChild = new Evaluator.IsNthChild(0, 2);
        assertTrue(nthChild.matches(root, c2));
        assertFalse(nthChild.matches(root, c1));
        assertEquals(":nth-child(2)", nthChild.toString());

        // IsNthChild with a != 0 (e.g., 2n+1)
        Evaluator nthChildFormula = new Evaluator.IsNthChild(2, 1);
        assertTrue(nthChildFormula.matches(root, c1)); // pos = 1 -> (1-1)*2 >= 0 && 0%2 == 0
        assertFalse(nthChildFormula.matches(root, c2)); // pos = 2
        assertEquals(":nth-last-child", new Evaluator.IsNthLastChild(0, 1).getPseudoClass() != null ? ":nth-last-child" : "");

        // IsNthLastChild
        Evaluator nthLastChild = new Evaluator.IsNthLastChild(0, 1);
        assertTrue(nthLastChild.matches(root, c3)); // size(3) - index(2) = 1

        // IsNthOfType & First/Last Of Type
        Evaluator nthOfType = new Evaluator.IsNthOfType(0, 2);
        assertTrue(nthOfType.matches(root, c3)); // p is 2nd of type

        Evaluator firstOfType = new Evaluator.IsFirstOfType();
        assertTrue(firstOfType.matches(root, c1));
        assertEquals(":first-of-type", firstOfType.toString());

        Evaluator lastOfType = new Evaluator.IsLastOfType();
        assertTrue(lastOfType.matches(root, c3));
        assertEquals(":last-of-type", lastOfType.toString());

        // Null parent branch coverage in CssNthEvaluator
        Element orphan = new Element(Tag.valueOf("div"), "");
        assertFalse(nthChild.matches(orphan, orphan));
    }

    @Test
    public void testIsEmptyEvaluator() {
        Element emptyEl = new Element(Tag.valueOf("div"), "");
        Element commentEl = new Element(Tag.valueOf("div"), "");
        commentEl.appendChild(new Comment("comment"));
        commentEl.appendChild(new XmlDeclaration("xml", ""));
        commentEl.appendChild(new DocumentType("html", "", ""));

        Element notEmptyEl = new Element(Tag.valueOf("div"), "").text("hello");

        Evaluator eval = new Evaluator.IsEmpty();
        assertTrue(eval.matches(emptyEl, emptyEl));
        assertTrue(eval.matches(commentEl, commentEl));
        assertFalse(eval.matches(notEmptyEl, notEmptyEl));
        assertEquals(":empty", eval.toString());
    }

    @Test
    public void testTextAndDataEvaluators() {
        Element el = new Element(Tag.valueOf("div"), "").text("Hello World Test").data("some data value");

        // ContainsText
        Evaluator containsText = new Evaluator.ContainsText("world");
        assertTrue(containsText.matches(el, el));
        assertFalse(new Evaluator.ContainsText("missing").matches(el, el));
        assertEquals(":contains(world)", containsText.toString());

        // ContainsData
        Evaluator containsData = new Evaluator.ContainsData("data");
        assertTrue(containsData.matches(el, el));
        assertFalse(new Evaluator.ContainsData("missing").matches(el, el));
        assertEquals(":containsData(data)", containsData.toString());

        // ContainsOwnText
        Element parent = new Element(Tag.valueOf("div"), "").text("Parent Text ");
        Element child = new Element(Tag.valueOf("span"), "").text("Child Text");
        parent.appendChild(child);

        Evaluator containsOwn = new Evaluator.ContainsOwnText("parent");
        assertTrue(containsOwn.matches(parent, parent));
        assertFalse(containsOwn.matches(child, child));
        assertEquals(":containsOwn(parent)", containsOwn.toString());

        // Matches Regex
        Evaluator matches = new Evaluator.Matches(Pattern.compile("World"));
        assertTrue(matches.matches(el, el));
        assertFalse(new Evaluator.Matches(Pattern.compile("^Test$")).matches(el, el));
        assertEquals(":matches(World)", matches.toString());

        // MatchesOwn Regex
        Evaluator matchesOwn = new Evaluator.MatchesOwn(Pattern.compile("Parent"));
        assertTrue(matchesOwn.matches(parent, parent));
        assertFalse(matchesOwn.matches(parent, child));
        assertEquals(":matchesOwn(Parent)", matchesOwn.toString());
    }
}