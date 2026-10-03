package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;

public class QueryParserTest {

    @Test
    public void testParseWithInitialCombinator() {
        // Trigger initial combinator branch
        Evaluator eval = QueryParser.parse("> div");
        assertNotNull(eval);
    }

    @Test
    public void testParseSimpleTag() {
        Evaluator eval = QueryParser.parse("div");
        assertNotNull(eval);
    }

    @Test
    public void testParseAllElementsAndCombinators() {
        // Test space, >, +, ~, and comma combinators
        Evaluator eval = QueryParser.parse("div > span + p ~ a, .class");
        assertNotNull(eval);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testUnknownCombinatorThrowsException() {
        // Force unknown combinator branch (e.g., using an invalid character like '|')
        QueryParser.parse("div | span");
    }

    @Test
    public void testTagNamespaces() {
        Evaluator evalWildcard = QueryParser.parse("*|div");
        assertNotNull(evalWildcard);

        Evaluator evalPipe = QueryParser.parse("fb|div");
        assertNotNull(evalPipe);
    }

    @Test
    public void testAttributesVariations() {
        assertNotNull(QueryParser.parse("[attr]"));
        assertNotNull(QueryParser.parse("[^attr]"));
        assertNotNull(QueryParser.parse("[attr=val]"));
        assertNotNull(QueryParser.parse("[attr!=val]"));
        assertNotNull(QueryParser.parse("[attr^=val]"));
        assertNotNull(QueryParser.parse("[attr$=val]"));
        assertNotNull(QueryParser.parse("[attr*=val]"));
        assertNotNull(QueryParser.parse("[attr~=val]"));
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testUnknownAttributeOperatorThrowsException() {
        QueryParser.parse("[attr??val]");
    }

    @Test
    public void testIdAndClassSelectors() {
        assertNotNull(QueryParser.parse("#myId"));
        assertNotNull(QueryParser.parse(".myClass"));
    }

    @Test
    public void testIndexPseudoSelectors() {
        assertNotNull(QueryParser.parse(":lt(2)"));
        assertNotNull(QueryParser.parse(":gt(2)"));
        assertNotNull(QueryParser.parse(":eq(2)"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIndexNotNumericThrowsException() {
        QueryParser.parse(":eq(abc)");
    }

    @Test
    public void testNthChildVariations() {
        assertNotNull(QueryParser.parse(":nth-child(odd)"));
        assertNotNull(QueryParser.parse(":nth-child(even)"));
        assertNotNull(QueryParser.parse(":nth-child(2n+1)"));
        assertNotNull(QueryParser.parse(":nth-child(5)"));
        assertNotNull(QueryParser.parse(":nth-last-child(odd)"));
        assertNotNull(QueryParser.parse(":nth-of-type(odd)"));
        assertNotNull(QueryParser.parse(":nth-last-of-type(odd)"));
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testInvalidNthChildFormatThrowsException() {
        QueryParser.parse(":nth-child(invalid_format)");
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
    public void testComplexPseudoSelectors() {
        assertNotNull(QueryParser.parse(":has(div)"));
        assertNotNull(QueryParser.parse(":contains(hello)"));
        assertNotNull(QueryParser.parse(":containsOwn(world)"));
        assertNotNull(QueryParser.parse(":containsData(data)"));
        assertNotNull(QueryParser.parse(":matches(foo.*)"));
        assertNotNull(QueryParser.parse(":matchesOwn(bar.*)"));
        assertNotNull(QueryParser.parse(":not(span)"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHasEmptySubQueryThrowsException() {
        QueryParser.parse(":has()");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testContainsEmptyQueryThrowsException() {
        QueryParser.parse(":contains()");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNotEmpySubQueryThrowsException() {
        QueryParser.parse(":not()");
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testUnexpectedTokenThrowsException() {
        QueryParser.parse("::unknownToken");
    }
}