# QueryParserTest.java

```java
package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit4 tests for QueryParser (Jsoup-21b, Defects4J)
 * หมายเหตุ: QueryParser เป็น package-private class จึงต้องวาง test class ไว้ใน
 * package เดียวกัน (org.jsoup.select) เพื่อเข้าถึงได้
 *
 * ข้อสมมติฐานที่ใช้ (เนื่องจากไม่มี source ของ TokenQueue/Validate/StringUtil ให้ดู):
 *  - org.jsoup.helper.Validate.notEmpty(...) throw IllegalArgumentException เมื่อค่าว่าง/null
 *  - org.jsoup.helper.Validate.isTrue(...) throw IllegalArgumentException เมื่อเงื่อนไขเป็น false
 *  - org.jsoup.select.Selector.SelectorParseException เป็น RuntimeException ที่ถูก throw ตรง ๆ ในซอร์ส
 *  - TokenQueue(null) จะทำให้เกิด RuntimeException บางชนิด (ไม่ assert class ที่เฉพาะเจาะจงเกินไป)
 */
public class QueryParserTest {

    // ---------------- Basic single-element selectors ----------------

    @Test
    public void testParseSimpleTag() {
        Evaluator e = QueryParser.parse("div");
        assertTrue(e instanceof Evaluator.Tag);
    }

    @Test
    public void testParseById() {
        Evaluator e = QueryParser.parse("#id1");
        assertTrue(e instanceof Evaluator.Id);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseByIdEmpty_throws() {
        // "#" -> consumeCssIdentifier คืนค่าว่าง -> Validate.notEmpty throw
        QueryParser.parse("#");
    }

    @Test
    public void testParseByClass() {
        Evaluator e = QueryParser.parse(".foo");
        assertTrue(e instanceof Evaluator.Class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseByClassEmpty_throws() {
        QueryParser.parse(".");
    }

    @Test
    public void testParseByTagWithNamespace() {
        // ครอบคลุม branch tagName.contains("|") -> replace("|", ":")
        Evaluator e = QueryParser.parse("ns|div");
        assertTrue(e instanceof Evaluator.Tag);
    }

    @Test
    public void testParseAllElements() {
        Evaluator e = QueryParser.parse("*");
        assertTrue(e instanceof Evaluator.AllElements);
    }

    // ---------------- Attribute selectors ----------------

    @Test
    public void testAttributeNoValue() {
        Evaluator e = QueryParser.parse("[foo]");
        assertTrue(e instanceof Evaluator.Attribute);
    }

    @Test
    public void testAttributeStartingCaret() {
        Evaluator e = QueryParser.parse("[^data-]");
        assertTrue(e instanceof Evaluator.AttributeStarting);
    }

    @Test
    public void testAttributeEquals() {
        Evaluator e = QueryParser.parse("[foo=bar]");
        assertTrue(e instanceof Evaluator.AttributeWithValue);
    }

    @Test
    public void testAttributeNotEquals() {
        Evaluator e = QueryParser.parse("[foo!=bar]");
        assertTrue(e instanceof Evaluator.AttributeWithValueNot);
    }

    @Test
    public void testAttributeStartsWith() {
        Evaluator e = QueryParser.parse("[foo^=bar]");
        assertTrue(e instanceof Evaluator.AttributeWithValueStarting);
    }

    @Test
    public void testAttributeEndsWith() {
        Evaluator e = QueryParser.parse("[foo$=bar]");
        assertTrue(e instanceof Evaluator.AttributeWithValueEnding);
    }

    @Test
    public void testAttributeContains() {
        Evaluator e = QueryParser.parse("[foo*=bar]");
        assertTrue(e instanceof Evaluator.AttributeWithValueContaining);
    }

    @Test
    public void testAttributeMatches() {
        Evaluator e = QueryParser.parse("[foo~=bar]");
        assertTrue(e instanceof Evaluator.AttributeWithValueMatching);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAttributeEmptyKey_withOperator_throws() {
        // key ว่าง เพราะ "=" อยู่ตำแหน่งแรก -> Validate.notEmpty(key) throw
        QueryParser.parse("[=bar]");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAttributeEmptyBrackets_throws() {
        // "[]" -> key ว่างตั้งแต่แรก
        QueryParser.parse("[]");
    }

    // ---------------- Index pseudo-selectors ----------------

    @Test
    public void testIndexLessThan() {
        Evaluator e = QueryParser.parse(":lt(3)");
        assertTrue(e instanceof Evaluator.IndexLessThan);
    }

    @Test
    public void testIndexGreaterThan() {
        Evaluator e = QueryParser.parse(":gt(3)");
        assertTrue(e instanceof Evaluator.IndexGreaterThan);
    }

    @Test
    public void testIndexEquals_boundaryZero() {
        Evaluator e = QueryParser.parse(":eq(0)"); // boundary value
        assertTrue(e instanceof Evaluator.IndexEquals);
    }

    @Test
    public void testIndexEquals_withWhitespaceTrim() {
        // ครอบคลุม consumeIndex() ที่มีการ trim()
        Evaluator e = QueryParser.parse(":eq( 5 )");
        assertTrue(e instanceof Evaluator.IndexEquals);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIndexNotNumeric_throws() {
        QueryParser.parse(":lt(abc)");
    }

    // ---------------- :has / :contains / :matches / :not ----------------

    @Test
    public void testHas() {
        Evaluator e = QueryParser.parse(":has(p)");
        assertTrue(e instanceof StructuralEvaluator.Has);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHasEmpty_throws() {
        QueryParser.parse(":has()");
    }

    @Test
    public void testContains() {
        Evaluator e = QueryParser.parse(":contains(hello)");
        assertTrue(e instanceof Evaluator.ContainsText);
    }

    @Test
    public void testContainsOwn() {
        Evaluator e = QueryParser.parse(":containsOwn(hello)");
        assertTrue(e instanceof Evaluator.ContainsOwnText);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testContainsEmpty_throws() {
        QueryParser.parse(":contains()");
    }

    @Test
    public void testMatches() {
        Evaluator e = QueryParser.parse(":matches(\\d+)");
        assertTrue(e instanceof Evaluator.Matches);
    }

    @Test
    public void testMatchesOwn() {
        Evaluator e = QueryParser.parse(":matchesOwn(\\d+)");
        assertTrue(e instanceof Evaluator.MatchesOwn);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMatchesEmpty_throws() {
        QueryParser.parse(":matches()");
    }

    @Test
    public void testNot() {
        Evaluator e = QueryParser.parse(":not(p)");
        assertTrue(e instanceof StructuralEvaluator.Not);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNotEmpty_throws() {
        QueryParser.parse(":not()");
    }

    // ---------------- Unhandled / malformed tokens ----------------

    @Test(expected = Selector.SelectorParseException.class)
    public void testUnhandledToken_throws() {
        // "&" ไม่ตรงกับเงื่อนไขใดใน findElements() -> else throw
        QueryParser.parse("&foo");
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testEmptyQuery_throws() {
        QueryParser.parse("");
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testWhitespaceOnlyQuery_throws() {
        QueryParser.parse("    ");
    }

    @Test(expected = RuntimeException.class)
    // สมมติฐาน: TokenQueue(null)/ส่วนอื่นจะ throw RuntimeException บางชนิด (ไม่ assert class เฉพาะ)
    public void testNullQuery_throws() {
        QueryParser.parse(null);
    }

    // ---------------- Combinator at start of query ----------------

    @Test(expected = Selector.SelectorParseException.class)
    public void testLeadingCommaCombinator_throwsUnknownCombinator() {
        // "," matchesAny(combinators)=true แต่ combinator() ไม่รองรับ ',' -> else throw
        QueryParser.parse(",div");
    }

    @Test
    public void testLeadingGreaterThanCombinator() {
        Evaluator e = QueryParser.parse("> div");
        assertTrue(e instanceof CombiningEvaluator.And);
    }

    @Test
    public void testLeadingPlusCombinator() {
        Evaluator e = QueryParser.parse("+div");
        assertTrue(e instanceof CombiningEvaluator.And);
    }

    @Test
    public void testLeadingTildeCombinator() {
        Evaluator e = QueryParser.parse("~div");
        assertTrue(e instanceof CombiningEvaluator.And);
    }

    // ---------------- Main parse() while-loop branches ----------------

    @Test
    public void testCommaOrCombinator_twoParts() {
        Evaluator e = QueryParser.parse("div, p");
        assertTrue(e instanceof CombiningEvaluator.Or);
    }

    @Test
    public void testCommaOrCombinator_threeParts() {
        // ครอบคลุม inner while loop ที่วนมากกว่า 1 รอบ
        Evaluator e = QueryParser.parse("div, p, span");
        assertTrue(e instanceof CombiningEvaluator.Or);
    }

    @Test
    public void testWhitespaceDescendantCombinator() {
        // seenWhite == true -> combinator(' ')
        Evaluator e = QueryParser.parse("div p");
        assertTrue(e instanceof CombiningEvaluator.And);
    }

    @Test
    public void testExplicitGreaterThanCombinator() {
        Evaluator e = QueryParser.parse("div > p");
        assertTrue(e instanceof CombiningEvaluator.And);
    }

    @Test
    public void testExplicitPlusCombinator() {
        Evaluator e = QueryParser.parse("div + p");
        assertTrue(e instanceof CombiningEvaluator.And);
    }

    @Test
    public void testExplicitTildeCombinator() {
        Evaluator e = QueryParser.parse("div ~ p");
        assertTrue(e instanceof CombiningEvaluator.And);
    }

    @Test
    public void testAndConditionMultipleSelectorsNoCombinator() {
        // ไม่มี whitespace/combinator ระหว่าง selector -> else branch: findElements() ซ้ำ
        Evaluator e = QueryParser.parse("div.class1#id1");
        assertTrue(e instanceof CombiningEvaluator.And);
    }

    @Test
    public void testCombinatorWithMultipleEvalsBeforehand() {
        // evals.size() != 1 ก่อนเข้า combinator() -> ครอบคลุม branch else ของการสร้าง e
        Evaluator e = QueryParser.parse("div.class1 > p");
        assertTrue(e instanceof CombiningEvaluator.And);
    }

    @Test
    public void testConsumeSubQueryWithBracket() {
        // ครอบคลุม branch tq.matches("[") ใน consumeSubQuery()
        Evaluator e = QueryParser.parse("div > p[foo=bar]");
        assertTrue(e instanceof CombiningEvaluator.And);
    }

    @Test
    public void testConsumeSubQueryWithParenthesis() {
        // ครอบคลุม branch tq.matches("(") ใน consumeSubQuery()
        Evaluator e = QueryParser.parse("div > :has(p)");
        assertTrue(e instanceof CombiningEvaluator.And);
    }

    @Test
    public void testMultipleCombinatorsChain() {
        // ครอบคลุมการเรียก combinator() ซ้ำหลายครั้งในลูปเดียว
        Evaluator e = QueryParser.parse("div > p + span ~ a");
        assertTrue(e instanceof CombiningEvaluator.And);
    }

    @Test
    public void testLeadingWhitespace() {
        // ครอบคลุม tq.consumeWhitespace() ตอนต้นของ parse()
        Evaluator e = QueryParser.parse("   div");
        assertTrue(e instanceof Evaluator.Tag);
    }
}
```

## ตารางสรุปการครอบคลุม Branch/Condition

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testParseSimpleTag | findElements() -> tq.matchesWord() true -> byTag() |
| testParseById | findElements() -> matchChomp("#") true -> byId() |
| testParseByIdEmpty_throws | byId() -> Validate.notEmpty(id) false-case (throw) |
| testParseByClass | findElements() -> matchChomp(".") true -> byClass() |
| testParseByClassEmpty_throws | byClass() -> Validate.notEmpty throw |
| testParseByTagWithNamespace | byTag() -> tagName.contains("\|") true branch |
| testParseAllElements | findElements() -> matchChomp("*") true -> allElements() |
| testAttributeNoValue | byAttribute() -> cq.isEmpty() true, key ไม่ขึ้นต้นด้วย "^" |
| testAttributeStartingCaret | byAttribute() -> cq.isEmpty() true, key.startsWith("^") true |
| testAttributeEquals | byAttribute() -> matchChomp("=") true |
| testAttributeNotEquals | byAttribute() -> matchChomp("!=") true |
| testAttributeStartsWith | byAttribute() -> matchChomp("^=") true |
| testAttributeEndsWith | byAttribute() -> matchChomp("$=") true |
| testAttributeContains | byAttribute() -> matchChomp("*=") true |
| testAttributeMatches | byAttribute() -> matchChomp("~=") true |
| testAttributeEmptyKey_withOperator_throws | byAttribute() -> Validate.notEmpty(key) throw (key ว่างจาก "=" นำหน้า) |
| testAttributeEmptyBrackets_throws | byAttribute() -> Validate.notEmpty(key) throw (เนื้อหาว่างทั้งหมด) |
| testIndexLessThan | findElements() -> matchChomp(":lt(") -> indexLessThan() |
| testIndexGreaterThan | findElements() -> matchChomp(":gt(") -> indexGreaterThan() |
| testIndexEquals_boundaryZero | findElements() -> matchChomp(":eq(") -> indexEquals(), boundary value 0 |
| testIndexEquals_withWhitespaceTrim | consumeIndex() -> trim() ก่อน parseInt |
| testIndexNotNumeric_throws | consumeIndex() -> Validate.isTrue(false) throw |
| testHas | findElements() -> matches(":has(") -> has() |
| testHasEmpty_throws | has() -> Validate.notEmpty(subQuery) throw |
| testContains | contains(false) -> ContainsText |
| testContainsOwn | contains(true) -> ContainsOwnText |
| testContainsEmpty_throws | contains() -> Validate.notEmpty throw |
| testMatches | matches(false) -> Matches |
| testMatchesOwn | matches(true) -> MatchesOwn |
| testMatchesEmpty_throws | matches() -> Validate.notEmpty throw |
| testNot | findElements() -> matches(":not(") -> not() |
| testNotEmpty_throws | not() -> Validate.notEmpty throw |
| testUnhandledToken_throws | findElements() -> else throw SelectorParseException |
| testEmptyQuery_throws | findElements() ด้วย queue ว่าง -> else throw |
| testWhitespaceOnlyQuery_throws | tq.consumeWhitespace() เคลียร์จนว่าง -> findElements() else throw |
| testNullQuery_throws | TokenQueue(null) constructor (สมมติฐาน RuntimeException) |
| testLeadingCommaCombinator_throwsUnknownCombinator | combinator() -> else throw (combinator ',' ไม่รองรับ) |
| testLeadingGreaterThanCombinator | parse() if-branch: matchesAny(combinators) true ตั้งต้น, combinator('>') |
| testLeadingPlusCombinator | parse() if-branch ตั้งต้น, combinator('+') |
| testLeadingTildeCombinator | parse() if-branch ตั้งต้น, combinator('~') |
| testCommaOrCombinator_twoParts | while-loop: matchChomp(",") true, inner while 1 รอบ |
| testCommaOrCombinator_threeParts | inner while loop วนมากกว่า 1 รอบ |
| testWhitespaceDescendantCombinator | while-loop: seenWhite true -> combinator(' ') |
| testExplicitGreaterThanCombinator | while-loop: matchesAny(combinators) true -> combinator('>') |
| testExplicitPlusCombinator | while-loop -> combinator('+') |
| testExplicitTildeCombinator | while-loop -> combinator('~') |
| testAndConditionMultipleSelectorsNoCombinator | while-loop else-branch: findElements() ซ้ำ (AND) |
| testCombinatorWithMultipleEvalsBeforehand | combinator(): evals.size()!=1 -> else branch สร้าง And |
| testConsumeSubQueryWithBracket | consumeSubQuery() -> tq.matches("[") true |
| testConsumeSubQueryWithParenthesis | consumeSubQuery() -> tq.matches("(") true |
| testMultipleCombinatorsChain | combinator() ถูกเรียกซ้ำหลายครั้งในลูปเดียว |
| testLeadingWhitespace | parse() -> tq.consumeWhitespace() ตอนต้น |

**หมายเหตุสำคัญ:** branch "else throw unknown operator" ใน `byAttribute()` (บรรทัดสุดท้ายของ if-else chain operator) วิเคราะห์แล้วพบว่าไม่สามารถเข้าถึงได้ด้วย input ที่ถูกต้องตามตรรกะของ `consumeToAny` (ซึ่งจะทำให้ remainder ตรงกับ operator ใด operator หนึ่งเสมอหากไม่ว่าง) จึงไม่ได้เขียนเทสสำหรับ branch นี้เพื่อหลีกเลี่ยงการเดา behavior ของ `TokenQueue.consumeToAny` ที่ไม่มีใน source ที่ให้มา