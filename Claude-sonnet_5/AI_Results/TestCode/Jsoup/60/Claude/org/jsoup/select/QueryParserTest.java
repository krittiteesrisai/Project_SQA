package org.jsoup.select;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

/**
 * JUnit 4 tests for {@link QueryParser} (Jsoup-60b, Defects4J).
 *
 * หมายเหตุทั่วไป:
 * - ตรวจสอบโครงสร้างผลลัพธ์ด้วย instanceof กับคลาสที่ QueryParser เองอ้างอิงอยู่แล้ว
 *   (Evaluator.*, CombiningEvaluator.*, StructuralEvaluator.*, Selector.SelectorParseException)
 * - ไม่ assert รายละเอียดภายใน (field/toString) ของคลาสเหล่านั้น เพราะไม่มีซอร์สโค้ดยืนยัน
 * - การ throw IllegalArgumentException จาก Validate.notEmpty/isTrue เป็น "สมมติฐาน"
 *   ตามรูปแบบทั่วไปของ org.jsoup.helper.Validate (ไม่มีซอร์สให้ในชุดนี้) — กำกับด้วยคอมเมนต์
 */
public class QueryParserTest {

    // ---------------------------------------------------------------
    // parse() : top-level branches
    // ---------------------------------------------------------------

    @Test
    public void testSingleTag_resultIsSingleEvaluator() {
        Evaluator eval = QueryParser.parse("div");
        assertTrue(eval instanceof Evaluator.Tag); // evals.size()==1 branch
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testEmptyQuery_throwsParseException() {
        // tq.isEmpty() -> findElements() ไม่ match อะไรเลย -> else (unhandled) throw
        QueryParser.parse("");
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testWhitespaceOnlyQuery_throwsParseException() {
        // consumeWhitespace() ทำให้ queue ว่าง แล้วตกไป findElements() -> unhandled
        QueryParser.parse("   ");
    }

    @Test
    public void testLeadingCombinator_addsRootAndCombines() {
        // if (tq.matchesAny(combinators)) ตอนเริ่ม -> เพิ่ม Root แล้ว combinator('>')
        Evaluator eval = QueryParser.parse("> p");
        assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testLeadingCombinatorWithEmptySubquery_throws() {
        // combinator('>') -> subQuery ว่าง -> parse("") ภายใน -> throw ซ้อน
        QueryParser.parse("> ");
    }

    @Test
    public void testAndBranch_topLevel_multipleEvals_noWhitespace() {
        // "div.class": ไม่มี whitespace, ไม่ใช่ combinator -> else: findElements() (AND)
        // ผลสุดท้าย evals.size()!=1 -> return new CombiningEvaluator.And(evals)
        Evaluator eval = QueryParser.parse("div.class");
        assertTrue(eval instanceof CombiningEvaluator.And);
    }

    // ---------------------------------------------------------------
    // findElements(): byId / byClass
    // ---------------------------------------------------------------

    @Test
    public void testById_valid() {
        Evaluator eval = QueryParser.parse("#main");
        assertTrue(eval instanceof Evaluator.Id);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testById_empty_throws() {
        // สมมติฐาน: consumeCssIdentifier() บน queue ว่าง -> "" -> Validate.notEmpty throw IAE
        QueryParser.parse("#");
    }

    @Test
    public void testByClass_valid() {
        Evaluator eval = QueryParser.parse(".foo");
        assertTrue(eval instanceof Evaluator.Class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testByClass_empty_throws() {
        QueryParser.parse(".");
    }

    // ---------------------------------------------------------------
    // findElements(): byTag (รวม namespace)
    // ---------------------------------------------------------------

    @Test
    public void testByTag_plain() {
        Evaluator eval = QueryParser.parse("span");
        assertTrue(eval instanceof Evaluator.Tag);
    }

    @Test
    public void testByTag_namespaceWildcard() {
        // tagName.startsWith("*|") -> Or(Tag, TagEndsWith)
        Evaluator eval = QueryParser.parse("*|div");
        assertTrue(eval instanceof CombiningEvaluator.Or);
    }

    @Test
    public void testByTag_namespacePipe() {
        // tagName.contains("|") -> replace("|",":") -> ยังเป็น Tag ปกติ
        Evaluator eval = QueryParser.parse("ns|div");
        assertTrue(eval instanceof Evaluator.Tag);
    }

    // ---------------------------------------------------------------
    // findElements(): byAttribute - ทุก operator branch
    // ---------------------------------------------------------------

    @Test
    public void testAttribute_noValue() {
        Evaluator eval = QueryParser.parse("[foo]");
        assertTrue(eval instanceof Evaluator.Attribute);
    }

    @Test
    public void testAttribute_startingCaret() {
        // key.startsWith("^") -> AttributeStarting
        Evaluator eval = QueryParser.parse("[^data-]");
        assertTrue(eval instanceof Evaluator.AttributeStarting);
    }

    @Test
    public void testAttribute_equals() {
        Evaluator eval = QueryParser.parse("[foo=bar]");
        assertTrue(eval instanceof Evaluator.AttributeWithValue);
    }

    @Test
    public void testAttribute_notEquals() {
        Evaluator eval = QueryParser.parse("[foo!=bar]");
        assertTrue(eval instanceof Evaluator.AttributeWithValueNot);
    }

    @Test
    public void testAttribute_startsWith() {
        Evaluator eval = QueryParser.parse("[foo^=bar]");
        assertTrue(eval instanceof Evaluator.AttributeWithValueStarting);
    }

    @Test
    public void testAttribute_endsWith() {
        Evaluator eval = QueryParser.parse("[foo$=bar]");
        assertTrue(eval instanceof Evaluator.AttributeWithValueEnding);
    }

    @Test
    public void testAttribute_contains() {
        Evaluator eval = QueryParser.parse("[foo*=bar]");
        assertTrue(eval instanceof Evaluator.AttributeWithValueContaining);
    }

    @Test
    public void testAttribute_matchesRegex() {
        Evaluator eval = QueryParser.parse("[foo~=bar]");
        assertTrue(eval instanceof Evaluator.AttributeWithValueMatching);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAttribute_emptyKey_throws() {
        QueryParser.parse("[]");
    }

    // ---------------------------------------------------------------
    // findElements(): allElements
    // ---------------------------------------------------------------

    @Test
    public void testAllElements() {
        Evaluator eval = QueryParser.parse("*");
        assertTrue(eval instanceof Evaluator.AllElements);
    }

    // ---------------------------------------------------------------
    // findElements(): :lt / :gt / :eq
    // ---------------------------------------------------------------

    @Test
    public void testIndexLessThan_valid() {
        Evaluator eval = QueryParser.parse(":lt(3)");
        assertTrue(eval instanceof Evaluator.IndexLessThan);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIndexLessThan_invalid_throws() {
        // StringUtil.isNumeric("abc") สมมติว่า false -> Validate.isTrue throw IAE
        QueryParser.parse(":lt(abc)");
    }

    @Test
    public void testIndexGreaterThan_valid() {
        Evaluator eval = QueryParser.parse(":gt(2)");
        assertTrue(eval instanceof Evaluator.IndexGreaterThan);
    }

    @Test
    public void testIndexEquals_valid() {
        Evaluator eval = QueryParser.parse(":eq(0)");
        assertTrue(eval instanceof Evaluator.IndexEquals);
    }

    // ---------------------------------------------------------------
    // findElements(): :has / :contains / :containsOwn / :containsData
    // ---------------------------------------------------------------

    @Test
    public void testHas_valid() {
        Evaluator eval = QueryParser.parse(":has(p)");
        assertTrue(eval instanceof StructuralEvaluator.Has);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHas_empty_throws() {
        QueryParser.parse(":has()");
    }

    @Test
    public void testContains_valid() {
        Evaluator eval = QueryParser.parse(":contains(hello)");
        assertTrue(eval instanceof Evaluator.ContainsText);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testContains_empty_throws() {
        QueryParser.parse(":contains()");
    }

    @Test
    public void testContainsOwn_valid() {
        Evaluator eval = QueryParser.parse(":containsOwn(hello)");
        assertTrue(eval instanceof Evaluator.ContainsOwnText);
    }

    @Test
    public void testContainsData_valid() {
        Evaluator eval = QueryParser.parse(":containsData(abc)");
        assertTrue(eval instanceof Evaluator.ContainsData);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testContainsData_empty_throws() {
        QueryParser.parse(":containsData()");
    }

    // ---------------------------------------------------------------
    // findElements(): :matches / :matchesOwn
    // ---------------------------------------------------------------

    @Test
    public void testMatches_valid() {
        Evaluator eval = QueryParser.parse(":matches(\\d+)");
        assertTrue(eval instanceof Evaluator.Matches);
    }

    @Test
    public void testMatchesOwn_valid() {
        Evaluator eval = QueryParser.parse(":matchesOwn(\\d+)");
        assertTrue(eval instanceof Evaluator.MatchesOwn);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMatches_empty_throws() {
        QueryParser.parse(":matches()");
    }

    // ---------------------------------------------------------------
    // findElements(): :not
    // ---------------------------------------------------------------

    @Test
    public void testNot_valid() {
        Evaluator eval = QueryParser.parse(":not(p)");
        assertTrue(eval instanceof StructuralEvaluator.Not);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNot_empty_throws() {
        QueryParser.parse(":not()");
    }

    // ---------------------------------------------------------------
    // findElements(): nth-child family & cssNthChild() branches
    // ---------------------------------------------------------------

    @Test
    public void testNthChild_numeric() {
        Evaluator eval = QueryParser.parse(":nth-child(2)");
        assertTrue(eval instanceof Evaluator.IsNthChild); // mB.matches() branch
    }

    @Test
    public void testNthChild_odd() {
        Evaluator eval = QueryParser.parse(":nth-child(odd)");
        assertTrue(eval instanceof Evaluator.IsNthChild);
    }

    @Test
    public void testNthChild_even() {
        Evaluator eval = QueryParser.parse(":nth-child(even)");
        assertTrue(eval instanceof Evaluator.IsNthChild);
    }

    @Test
    public void testNthChild_formulaWithCoefficient() {
        // mAB.matches(), group(3)!=null และ group(4)!=null
        Evaluator eval = QueryParser.parse(":nth-child(2n+1)");
        assertTrue(eval instanceof Evaluator.IsNthChild);
    }

    @Test
    public void testNthChild_formulaWithoutCoefficient() {
        // "n" -> mAB.matches(), group(3)==null -> a=1 (ไม่พึ่ง sign); group(4)==null -> b=0
        // หมายเหตุ: นี่คือพื้นที่ที่เกี่ยวข้องกับ defect ของ Jsoup-60 (สัมประสิทธิ์ลบแบบ "-n")
        // แต่เนื่องจากไม่มีซอร์ส Evaluator.IsNthChild ให้ยืนยันค่า a/b ภายใน จึงตรวจสอบเพียง
        // ว่า parse ไม่ throw และ type ถูกต้อง (ไม่ assert ค่า a/b ตรง ๆ)
        Evaluator eval = QueryParser.parse(":nth-child(n)");
        assertTrue(eval instanceof Evaluator.IsNthChild);
    }

    @Test
    public void testNthChild_negativeCoefficientFormat_noExceptionExpected() {
        // ":nth-child(-n+3)" ควร match ด้วย mAB (ไม่ throw) — เป็นจุดที่ควรตรวจค่า a=-1
        // ด้วยมือ/เครื่องมือ coverage อื่นเพิ่มเติม เนื่องจาก field ภายในไม่ปรากฏในซอร์สที่ให้มา
        Evaluator eval = QueryParser.parse(":nth-child(-n+3)");
        assertTrue(eval instanceof Evaluator.IsNthChild);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testNthChild_invalidFormat_throws() {
        // ไม่ตรง odd/even, ไม่ match mAB, ไม่ match mB -> throw SelectorParseException
        QueryParser.parse(":nth-child(xyz)");
    }

    @Test
    public void testNthLastChild() {
        Evaluator eval = QueryParser.parse(":nth-last-child(2)");
        assertTrue(eval instanceof Evaluator.IsNthLastChild);
    }

    @Test
    public void testNthOfType() {
        Evaluator eval = QueryParser.parse(":nth-of-type(2)");
        assertTrue(eval instanceof Evaluator.IsNthOfType);
    }

    @Test
    public void testNthLastOfType() {
        Evaluator eval = QueryParser.parse(":nth-last-of-type(2)");
        assertTrue(eval instanceof Evaluator.IsNthLastOfType);
    }

    // ---------------------------------------------------------------
    // findElements(): pseudo-selectors ไม่มี argument (ครบทุกตัว)
    // ---------------------------------------------------------------

    @Test
    public void testFirstChild() {
        assertTrue(QueryParser.parse(":first-child") instanceof Evaluator.IsFirstChild);
    }

    @Test
    public void testLastChild() {
        assertTrue(QueryParser.parse(":last-child") instanceof Evaluator.IsLastChild);
    }

    @Test
    public void testFirstOfType() {
        assertTrue(QueryParser.parse(":first-of-type") instanceof Evaluator.IsFirstOfType);
    }

    @Test
    public void testLastOfType() {
        assertTrue(QueryParser.parse(":last-of-type") instanceof Evaluator.IsLastOfType);
    }

    @Test
    public void testOnlyChild() {
        assertTrue(QueryParser.parse(":only-child") instanceof Evaluator.IsOnlyChild);
    }

    @Test
    public void testOnlyOfType() {
        assertTrue(QueryParser.parse(":only-of-type") instanceof Evaluator.IsOnlyOfType);
    }

    @Test
    public void testEmptyPseudo() {
        assertTrue(QueryParser.parse(":empty") instanceof Evaluator.IsEmpty);
    }

    @Test
    public void testRootPseudo() {
        assertTrue(QueryParser.parse(":root") instanceof Evaluator.IsRoot);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testUnknownPseudo_throws() {
        // token ไม่ match เงื่อนไขใดใน findElements() -> else (unhandled) throw
        QueryParser.parse(":unknown-pseudo");
    }

    // ---------------------------------------------------------------
    // combinator(): ทุก combinator char + evals.size() branch ต่าง ๆ
    // ---------------------------------------------------------------

    @Test
    public void testCombinator_childAnd_evalsSizeOne() {
        // "div > p": evals.size()==1 ตอนเรียก combinator('>'), rootEval ไม่ใช่ Or
        Evaluator eval = QueryParser.parse("div > p");
        assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testCombinator_descendant_space() {
        // seenWhite==true, ไม่ matchesAny(combinators) -> combinator(' ')
        Evaluator eval = QueryParser.parse("div p");
        assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testCombinator_immediateSibling_plus() {
        Evaluator eval = QueryParser.parse("div + p");
        assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testCombinator_generalSibling_tilde() {
        Evaluator eval = QueryParser.parse("div ~ p");
        assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testCombinator_or_comma_newOr() {
        // currentEval ไม่ใช่ Or อยู่แล้ว -> สร้าง Or ใหม่
        Evaluator eval = QueryParser.parse("div, p");
        assertTrue(eval instanceof CombiningEvaluator.Or);
    }

    @Test
    public void testCombinator_or_chained_existingOr() {
        // comma ที่สอง: currentEval instanceof Or อยู่แล้ว -> or.add(newEval)
        Evaluator eval = QueryParser.parse("div, p, span");
        assertTrue(eval instanceof CombiningEvaluator.Or);
    }

    @Test
    public void testCombinator_evalsSizeNotOne_beforeCombinator() {
        // "div.class > p": ก่อนถึง combinator('>') evals.size()==2 -> else branch
        // (rootEval = currentEval = new CombiningEvaluator.And(evals))
        Evaluator eval = QueryParser.parse("div.class > p");
        assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testCombinator_orReplaceRightMost() {
        // "div, p > span": หลังจาก Or(div,p) แล้วพบ '>' โดยไม่ใช่ ','
        // -> rootEval instanceof Or && combinator!=',' -> replaceRightMost = true
        Evaluator eval = QueryParser.parse("div, p > span");
        assertTrue(eval instanceof CombiningEvaluator.Or);
    }

    @Test
    public void testConsumeSubQuery_withParens() {
        // consumeSubQuery() พบ '(' ระหว่างทาง -> ใช้ chompBalanced('(',')')
        Evaluator eval = QueryParser.parse("div > p:eq(0)");
        assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testConsumeSubQuery_withBrackets() {
        // consumeSubQuery() พบ '[' ระหว่างทาง -> ใช้ chompBalanced('[',']')
        Evaluator eval = QueryParser.parse("div > p[foo=bar]");
        assertTrue(eval instanceof CombiningEvaluator.And);
    }

    // ---------------------------------------------------------------
    // Boundary / malformed / null
    // ---------------------------------------------------------------

    @Test(expected = RuntimeException.class)
    public void testNullQuery_throwsRuntimeException() {
        // สมมติฐาน: TokenQueue(null) จะทำให้เกิด RuntimeException (เช่น NPE)
        // เนื่องจากไม่มีซอร์ส TokenQueue ยืนยันพฤติกรรมนี้โดยตรง
        QueryParser.parse(null);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testMalformedAttribute_unexpectedToken_throws() {
        // บังคับ cq ไม่ว่างแต่ไม่ match operator ใด ๆ ที่รองรับ
        // (อิงพฤติกรรม consumeToAny ตาม AttributeEvals ที่ประกาศในซอร์ส)
        QueryParser.parse("[foo?=bar]");
    }

    // ---------------------------------------------------------------
    // Reflection: เข้าถึง private method combinator() เพื่อบังคับ branch
    // "Unknown combinator" ซึ่งไม่สามารถเรียกถึงได้ผ่าน public API ตามปกติ
    // ---------------------------------------------------------------

    @Test
    public void testCombinator_unknownCombinator_throwsViaReflection() throws Exception {
        Constructor<QueryParser> ctor = QueryParser.class.getDeclaredConstructor(String.class);
        ctor.setAccessible(true);
        QueryParser qp = ctor.newInstance("div");

        Method combinatorMethod = QueryParser.class.getDeclaredMethod("combinator", char.class);
        combinatorMethod.setAccessible(true);

        try {
            combinatorMethod.invoke(qp, 'x'); // ไม่อยู่ใน {',','>','+','~',' '}
            fail("Expected Selector.SelectorParseException to be thrown");
        } catch (InvocationTargetException ite) {
            assertTrue(ite.getCause() instanceof Selector.SelectorParseException);
        }
    }
}
