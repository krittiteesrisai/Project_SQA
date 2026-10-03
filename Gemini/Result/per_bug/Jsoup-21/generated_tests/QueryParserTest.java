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
    public void testParseTagWithNamespacePipe() {
        Evaluator eval = QueryParser.parse("fb|div");
        assertNotNull(eval);
    }

    @Test
    public void testParseStartingWithCombinator() {
        Evaluator eval = QueryParser.parse("> span");
        assertNotNull(eval);
    }

    @Test
    public void testParseWithDescendantCombinator() {
        Evaluator eval = QueryParser.parse("div span");
        assertNotNull(eval);
    }

    @Test
    public void testParseWithChildCombinator() {
        Evaluator eval = QueryParser.parse("div > span");
        assertNotNull(eval);
    }

    @Test
    public void testParseWithAdjacentSiblingCombinator() {
        Evaluator eval = QueryParser.parse("div + span");
        assertNotNull(eval);
    }

    @Test
    public void testParseWithGeneralSiblingCombinator() {
        Evaluator eval = QueryParser.parse("div ~ span");
        assertNotNull(eval);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParseUnknownCombinator() {
        // ใช้ตัวอักษรที่ไม่รู้จักเป็น combinator เพื่อกระตุ้น Exception
        QueryParser.parse("div % span");
    }

    @Test
    public void testParseOrCombinator() {
        Evaluator eval = QueryParser.parse("div, span, p");
        assertNotNull(eval);
        assertTrue(eval instanceof CombiningEvaluator.Or);
    }

    @Test
    public void testParseAndMultipleEvaluators() {
        Evaluator eval = QueryParser.parse("div.class#id[attr]");
        assertNotNull(eval);
    }

    @Test
    public void testParseById() {
        Evaluator eval = QueryParser.parse("#myId");
        assertNotNull(eval);
        assertTrue(eval instanceof Evaluator.Id);
    }

    @Test
    public void testParseByClass() {
        Evaluator eval = QueryParser.parse(".myClass");
        assertNotNull(eval);
        assertTrue(eval instanceof Evaluator.Class);
    }

    @Test
    public void testParseAllElements() {
        Evaluator eval = QueryParser.parse("*");
        assertNotNull(eval);
        assertTrue(eval instanceof Evaluator.AllElements);
    }

    @Test
    public void testParseIndexPseudoSelectors() {
        assertNotNull(QueryParser.parse("p:lt(3))".substring(0, 7))); // :lt(3)
        assertNotNull(QueryParser.parse("p:gt(2)"));
        assertNotNull(QueryParser.parse("p:eq(1)"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseIndexNonNumeric() {
        QueryParser.parse("p:eq(abc)");
    }

    @Test
    public void testParseHasPseudo() {
        Evaluator eval = QueryParser.parse("div:has(span)");
        assertNotNull(eval);
    }

    @Test
    public void testParseContainsPseudo() {
        Evaluator eval1 = QueryParser.parse("div:contains(hello)");
        Evaluator eval2 = QueryParser.parse("div:containsOwn(world)");
        assertNotNull(eval1);
        assertNotNull(eval2);
    }

    @Test
    public void testParseMatchesPseudo() {
        Evaluator eval1 = QueryParser.parse("div:matches(abc.*)");
        Evaluator eval2 = QueryParser.parse("div:matchesOwn(xyz.*)");
        assertNotNull(eval1);
        assertNotNull(eval2);
    }

    @Test
    public void testParseNotPseudo() {
        Evaluator eval = QueryParser.parse("div:not(span)");
        assertNotNull(eval);
    }

    @Test
    public void testParseAttributes() {
        assertNotNull(QueryParser.parse("a[href]"));           // Attribute exists
        assertNotNull(QueryParser.parse("a[^href]"));         // Attribute starting with
        assertNotNull(QueryParser.parse("a[href=val]"));      // Equals
        assertNotNull(QueryParser.parse("a[href!=val]"));     // Not equals
        assertNotNull(QueryParser.parse("a[href^=val]"));     // Starts with value
        assertNotNull(QueryParser.parse("a[href$=val]"));     // Ends with value
        assertNotNull(QueryParser.parse("a[href*=val]"));     // Contains value
        assertNotNull(QueryParser.parse("a[href~=val]"));     // Matching regex value
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParseInvalidAttributeOperator() {
        QueryParser.parse("a[href???val]");
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParseUnexpectedToken() {
        // กระตุ้นเงื่อนไข else สุดท้ายใน findElements()
        QueryParser.parse("@@@");
    }
}