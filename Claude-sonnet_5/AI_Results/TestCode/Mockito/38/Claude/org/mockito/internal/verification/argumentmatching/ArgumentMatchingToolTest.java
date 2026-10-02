package org.mockito.internal.verification.argumentmatching;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.Test;
import org.mockito.internal.matchers.ContainsExtraTypeInformation;

/**
 * Unit tests for {@link ArgumentMatchingTool}.
 *
 * หมายเหตุ: ContainsExtraTypeInformation เป็น interface ภายในของ Mockito
 * (ไม่ได้มาจาก jar ภายนอก) ที่ต้องมีอยู่แล้วใน classpath ของโมดูล Mockito
 * ที่กำลังถูกทดสอบ (ไม่ใช่ dependency jar แยก) จึง import ได้ตรง ๆ
 */
public class ArgumentMatchingToolTest {

    private final ArgumentMatchingTool tool = new ArgumentMatchingTool();

    // ---------- Test doubles ----------

    /** Matcher ธรรมดา ไม่ได้ implement ContainsExtraTypeInformation */
    private static Matcher<Object> plainMatcher(final String desc, final boolean matchResult) {
        return new BaseMatcher<Object>() {
            public boolean matches(Object item) {
                return matchResult;
            }
            public void describeTo(Description description) {
                description.appendText(desc);
            }
        };
    }

    /**
     * Matcher ที่ implement ทั้ง Matcher และ ContainsExtraTypeInformation
     * เพื่อควบคุมทุกเงื่อนไขภายใน getSuspiciouslyNotMatchingArgsIndexes
     */
    private static class FakeExtraMatcher extends BaseMatcher<Object>
            implements ContainsExtraTypeInformation {

        private final String desc;
        private final boolean matchResult;
        private final RuntimeException toThrow;
        private final boolean typeMatchResult;

        FakeExtraMatcher(String desc, boolean matchResult, RuntimeException toThrow,
                boolean typeMatchResult) {
            this.desc = desc;
            this.matchResult = matchResult;
            this.toThrow = toThrow;
            this.typeMatchResult = typeMatchResult;
        }

        @Override
        public boolean matches(Object item) {
            if (toThrow != null) {
                throw toThrow;
            }
            return matchResult;
        }

        @Override
        public void describeTo(Description description) {
            description.appendText(desc);
        }

        @Override
        public boolean typeMatches(Object target) {
            return typeMatchResult;
        }

        @Override
        public String toStringWithType() {
            return desc;
        }
    }

    // ---------- 1. Boundary: size mismatch -> branch "matchers.size() != arguments.length" = true ----------

    @Test
    public void testSizeMismatch_matchersMoreThanArguments_returnsEmptyArray() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(plainMatcher("a", true));
        matchers.add(plainMatcher("b", true));
        Object[] arguments = new Object[] { "a" };

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        assertArrayEquals(new Integer[0], result);
    }

    @Test
    public void testSizeMismatch_argumentsMoreThanMatchers_returnsEmptyArray() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(plainMatcher("a", true));
        Object[] arguments = new Object[] { "a", "b" };

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        assertArrayEquals(new Integer[0], result);
    }

    // ---------- 2. Boundary: empty lists (size equal = 0) -> loop ไม่ทำงานเลย ----------

    @Test
    public void testEmptyInputs_returnsEmptyArray() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        Object[] arguments = new Object[0];

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        assertArrayEquals(new Integer[0], result);
    }

    // ---------- 3. matcher ไม่ implement ContainsExtraTypeInformation -> branch instanceof = false ----------

    @Test
    public void testMatcherNotContainsExtraTypeInformation_notSuspicious() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        // toString "x" เหมือน argument แต่ไม่ implement ContainsExtraTypeInformation
        matchers.add(plainMatcher("x", false));
        Object[] arguments = new Object[] { "x" };

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        assertArrayEquals(new Integer[0], result);
    }

    // ---------- 4. safelyMatches() คืน true -> branch !safelyMatches = false ----------

    @Test
    public void testSafelyMatchesTrue_notSuspicious() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(new FakeExtraMatcher("x", true, null, false));
        Object[] arguments = new Object[] { "x" };

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        assertArrayEquals(new Integer[0], result);
    }

    // ---------- 5. toStringEquals() คืน false -> branch toStringEquals = false ----------

    @Test
    public void testToStringDiffers_notSuspicious() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        // description ไม่เท่ากับ arg.toString()
        matchers.add(new FakeExtraMatcher("differentDescription", false, null, false));
        Object[] arguments = new Object[] { "actualArgument" };

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        assertArrayEquals(new Integer[0], result);
    }

    // ---------- 6. typeMatches() คืน true -> branch !typeMatches = false ----------

    @Test
    public void testTypeMatchesTrue_notSuspicious() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(new FakeExtraMatcher("x", false, null, true));
        Object[] arguments = new Object[] { "x" };

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        assertArrayEquals(new Integer[0], result);
    }

    // ---------- 7. ครบทุกเงื่อนไข -> index ถูกเพิ่มเข้า suspicious list ----------

    @Test
    public void testAllConditionsMet_indexIsSuspicious() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(new FakeExtraMatcher("x", false, null, false));
        Object[] arguments = new Object[] { "x" };

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        assertArrayEquals(new Integer[] { 0 }, result);
    }

    // ---------- 8. safelyMatches() ดัก Throwable จาก matches() แล้วถือว่า false ----------

    @Test
    public void testSafelyMatchesCatchesThrowable_thenEvaluatesRestOfCondition_suspicious() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(new FakeExtraMatcher("x", false,
                new RuntimeException("boom"), false));
        Object[] arguments = new Object[] { "x" };

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        // matches() throw -> catch -> safelyMatches=false -> toStringEquals=true -> typeMatches=false
        // => ควรถูกจัดว่า suspicious (index 0)
        assertArrayEquals(new Integer[] { 0 }, result);
    }

    @Test
    public void testSafelyMatchesCatchesThrowable_butToStringDiffers_notSuspicious() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(new FakeExtraMatcher("differentDesc",
                false, new RuntimeException("boom"), false));
        Object[] arguments = new Object[] { "x" };

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        assertArrayEquals(new Integer[0], result);
    }

    // ---------- 9. multiple matchers: ทดสอบ loop หลายรอบ และ index ที่ถูกต้อง ----------

    @Test
    public void testMultipleMatchers_mixedResults_correctIndexesReturned() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(new FakeExtraMatcher("x", false, null, false)); // index 0 - suspicious
        matchers.add(plainMatcher("y", true));                       // index 1 - not instanceof, not suspicious
        matchers.add(new FakeExtraMatcher("z", true, null, false));  // index 2 - matches()=true -> not suspicious
        matchers.add(new FakeExtraMatcher("w", false, null, false)); // index 3 - suspicious

        Object[] arguments = new Object[] { "x", "y", "z", "w" };

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        assertArrayEquals(new Integer[] { 0, 3 }, result);
    }

    @Test
    public void testMultipleMatchers_noneSuspicious_returnsEmptyArray() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(plainMatcher("a", true));
        matchers.add(new FakeExtraMatcher("b", true, null, false));
        matchers.add(new FakeExtraMatcher("c", false, null, true));

        Object[] arguments = new Object[] { "a", "b", "c" };

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        assertArrayEquals(new Integer[0], result);
    }

    // ---------- 10. Edge case: argument เป็น null ----------
    // หมายเหตุ: ซอร์สไม่มีการเช็ค null ก่อนเรียก arg.toString() ใน toStringEquals()
    // ดังนั้นถ้า argument เป็น null และเงื่อนไขไปถึงจุดนั้น จะเกิด NullPointerException จริง
    // (พฤติกรรมนี้มีอยู่ในซอร์สโค้ดจริง ไม่ได้เดา)
    @Test
    public void testNullArgument_safelyMatchesFalse_thenNPEFromToStringEquals() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        // matches(null) คืน false อย่างปลอดภัย (ไม่ throw) แต่ toStringEquals จะ NPE
        matchers.add(new FakeExtraMatcher("x", false, null, false));
        Object[] arguments = new Object[] { null };

        try {
            tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);
            fail("Expected NullPointerException due to arg.toString() on null argument");
        } catch (NullPointerException expected) {
            // พฤติกรรมตามซอร์สโค้ดจริง: ไม่มีการป้องกัน null
        }
    }

    // ---------- 11. ตรวจสอบ return type เป็น Integer[] ไม่ใช่ List ----------

    @Test
    public void testReturnTypeIsIntegerArrayWithCorrectSize() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(new FakeExtraMatcher("x", false, null, false));
        matchers.add(new FakeExtraMatcher("y", false, null, false));
        Object[] arguments = new Object[] { "x", "y" };

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        assertEquals(2, result.length);
        assertArrayEquals(new Integer[] { 0, 1 }, result);
    }
}
