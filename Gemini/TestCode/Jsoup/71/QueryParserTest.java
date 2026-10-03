package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;

public class QueryParserTest {

    @Test
    public void testParseSimpleTag() {
        Evaluator eval = QueryParser.parse("div");
        assertNotNull(eval);
        assertTrue(eval instanceof Evaluator.Tag);
    }

    @Test
    public void testParseStartsBypassingCombinator() {
        Evaluator eval = QueryParser.parse("> div");
        assertNotNull(eval);
    }

    @Test
    public void testParseCombinatorsAndHierarchy() {
        // Test combinators: ' ', '>', '+', '~', ','
        Evaluator eval = QueryParser.parse("div > p + span ~ a, .class");
        assertNotNull(eval);
    }

    @Test
    public void testParseOrPrecedenceReplacement() {
        // Triggers replaceRightMost in combinator method (Or combining with non-comma combinator)
        Evaluator eval = QueryParser.parse("div, p > span");
        assertNotNull(eval);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testUnknownCombinatorThrowsException() {
        QueryParser.parse("div ! p");
    }

    @Test
    public void testFindElementsByIdAndClass() {
        assertNotNull(QueryParser.parse("#myId"));
        assertNotNull(QueryParser.parse(".myClass"));
    }

    @Test
    public void testNamespacedTags() {
        assertNotNull(QueryParser.parse("*|tag"));
        assertNotNull(QueryParser.parse("ns|tag"));
    }

    @Test
    public void testAllElementsSelector() {
        assertNotNull(QueryParser.parse("*"));
    }

    @Test
    public void testIndexPseudoSelectors() {
        assertNotNull(QueryParser.parse(":lt(2)"));
        assertNotNull(QueryParser.parse(":gt(1)"));
        assertNotNull(QueryParser.parse(":eq(0)"));
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testInvalidIndexNumericThrowsException() {
        QueryParser.parse(":eq(abc)");
    }

    @Test
    public void testAttributeSelectors() {
        assertNotNull(QueryParser.parse("[attr]"));
        assertNotNull(QueryParser.parse("[attr=val]"));
        assertNotNull(QueryParser.parse("[attr!=val]"));
        assertNotNull(QueryParser.parse("[attr^=val]"));
        assertNotNull(QueryParser.parse("[attr$=val]"));
        assertNotNull(QueryParser.parse("[attr*=val]"));
        assertNotNull(QueryParser.parse("[attr~=val]"));
        assertNotNull(QueryParser.parse("[^attr]"));
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testInvalidAttributeOperatorThrowsException() {
        QueryParser.parse("[attr unknown val]");
    }

    @Test
    public void testNthChildVariants() {
        assertNotNull(QueryParser.parse(":nth-child(odd))".replace("))", ")"))); // ปรับ syntax ให้สมบูรณ์
        assertNotNull(QueryParser.parse(":nth-child(even)"));
        assertNotNull(QueryParser.parse(":nth-child(2n+1)"));
        assertNotNull(QueryParser.parse(":nth-child(5)"));
        assertNotNull(QueryParser.parse(":nth-last-child(2)"));
        assertNotNull(QueryParser.parse(":nth-of-type(2n)"));
        assertNotNull(QueryParser.parse(":nth-last-of-type(odd)"));
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testInvalidNthFormatThrowsException() {
        QueryParser.parse(":nth-child(invalid-format)");
    }

    @Test
    public void testStructuralPseudoSelectors() {
        assertNotNull(QueryParser.parse(":first-child"));
        assertNotNull(QueryParser.parse(":last-child"));
        assertNotNull(QueryParser.parse(":first-of-type"));
        assertNotNull(QueryParser.parse(":last-of-type"));
        assertNotNull(QueryParser.parse(":only-child"));
        assertNotNull(QueryParser.parse(":only-of-type"));
        assertNotNull(QueryParser.parse(":empty"));
        assertNotNull(QueryParser.parse(":root"));
    }

    @Test
    public void testFunctionalPseudoSelectors() {
        assertNotNull(QueryParser.parse(":has(div)"));
        assertNotNull(QueryParser.parse(":contains(text)"));
        assertNotNull(QueryParser.parse(":containsOwn(text)"));
        assertNotNull(QueryParser.parse(":containsData(data)"));
        assertNotNull(QueryParser.parse(":matches(regex)"));
        assertNotNull(QueryParser.parse(":matchesOwn(regex)"));
        assertNotNull(QueryParser.parse(":not(span)"));
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testEmptyHasSubQueryThrowsException() {
        QueryParser.parse(":has()");
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testEmptyNotSubQueryThrowsException() {
        QueryParser.parse(":not()");
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testUnexpectedTokenThrowsException() {
        QueryParser.parse("@@@invalid");
    }
}