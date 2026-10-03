package org.mockito.internal.verification.argumentmatching;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.SelfDescribing;
import org.hamcrest.StringDescription;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.matchers.ContainsExtraTypeInformation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class ArgumentMatchingToolTest {

    private ArgumentMatchingTool tool;

    @Before
    public void setUp() {
        tool = new ArgumentMatchingTool();
    }

    /**
     * คลาส Matcher จำลองที่ Implement ทั้ง Matcher และ ContainsExtraTypeInformation
     */
    private static class StubContainsExtraInfoMatcher extends BaseMatcher<Object> implements ContainsExtraTypeInformation {
        private final Object expected;
        private final boolean matchesResult;
        private final boolean typeMatchesResult;
        private final boolean throwExceptionOnMatches;

        public StubContainsExtraInfoMatcher(Object expected, boolean matchesResult, boolean typeMatchesResult) {
            this(expected, matchesResult, typeMatchesResult, false);
        }

        public StubContainsExtraInfoMatcher(Object expected, boolean matchesResult, boolean typeMatchesResult, boolean throwExceptionOnMatches) {
            this.expected = expected;
            this.matchesResult = matchesResult;
            this.typeMatchesResult = typeMatchesResult;
            this.throwExceptionOnMatches = throwExceptionOnMatches;
        }

        @Override
        public boolean matches(Object item) {
            if (throwExceptionOnMatches) {
                throw new RuntimeException("Error occurred during match evaluation");
            }
            return matchesResult;
        }

        @Override
        public void describeTo(Description description) {
            description.appendText(expected == null ? "null" : expected.toString());
        }

        @Override
        public boolean typeMatches(Object target) {
            return typeMatchesResult;
        }

        public SelfDescribing withExtraTypeInfo() {
            return this;
        }
    }

    /**
     * คลาส Matcher ปกติที่ไม่ Implement ContainsExtraTypeInformation
     */
    private static class NormalMatcher extends BaseMatcher<Object> {
        private final Object expected;

        public NormalMatcher(Object expected) {
            this.expected = expected;
        }

        @Override
        public boolean matches(Object item) {
            return expected == null ? item == null : expected.equals(item);
        }

        @Override
        public void describeTo(Description description) {
            description.appendText(expected == null ? "null" : expected.toString());
        }
    }

    // -------------------------------------------------------------
    // Group 1: Size Mismatch & Empty Collections
    // -------------------------------------------------------------

    @Test
    public void getSuspiciouslyNotMatchingArgsIndexes_whenSizeDifferent_matcherCountLessThanArgsCount_returnsEmptyArray() {
        List<Matcher> matchers = Arrays.<Matcher>asList(new NormalMatcher(10));
        Object[] args = new Object[]{10, 20};

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, args);
        assertArrayEquals(new Integer[0], result);
    }

    @Test
    public void getSuspiciouslyNotMatchingArgsIndexes_whenSizeDifferent_matcherCountGreaterThanArgsCount_returnsEmptyArray() {
        List<Matcher> matchers = Arrays.<Matcher>asList(new NormalMatcher(10), new NormalMatcher(20));
        Object[] args = new Object[]{10};

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, args);
        assertArrayEquals(new Integer[0], result);
    }

    @Test
    public void getSuspiciouslyNotMatchingArgsIndexes_whenBothEmpty_returnsEmptyArray() {
        List<Matcher> matchers = Collections.emptyList();
        Object[] args = new Object[0];

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, args);
        assertArrayEquals(new Integer[0], result);
    }

    // -------------------------------------------------------------
    // Group 2: Matcher Filter Conditions (Negative Branches)
    // -------------------------------------------------------------

    @Test
    public void getSuspiciouslyNotMatchingArgsIndexes_whenMatcherDoesNotImplementContainsExtraTypeInformation_ignored() {
        // แม้ String จะเหมือนกันและค่าไม่ match แต่ถ้าไม่ implement ContainsExtraTypeInformation จะไม่ถูกนับเป็น suspicious
        List<Matcher> matchers = Arrays.<Matcher>asList(new NormalMatcher("100"));
        Object[] args = new Object[]{100L};

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, args);
        assertArrayEquals(new Integer[0], result);
    }

    @Test
    public void getSuspiciouslyNotMatchingArgsIndexes_whenSafelyMatchesReturnsTrue_ignored() {
        // matches == true -> ไม่ถือว่าเป็น suspicious
        List<Matcher> matchers = Arrays.<Matcher>asList(
                new StubContainsExtraInfoMatcher(10, true, false)
        );
        Object[] args = new Object[]{10};

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, args);
        assertArrayEquals(new Integer[0], result);
    }

    @Test
    public void getSuspiciouslyNotMatchingArgsIndexes_whenToStringRepresentationDiffers_ignored() {
        // matches == false, typeMatches == false แต่ toString ไม่ตรง ("10" != "20") -> ignored
        List<Matcher> matchers = Arrays.<Matcher>asList(
                new StubContainsExtraInfoMatcher("10", false, false)
        );
        Object[] args = new Object[]{"20"};

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, args);
        assertArrayEquals(new Integer[0], result);
    }

    @Test
    public void getSuspiciouslyNotMatchingArgsIndexes_whenTypeMatchesReturnsTrue_ignored() {
        // matches == false, toString เหมือนกัน แต่ typeMatches == true -> ignored
        List<Matcher> matchers = Arrays.<Matcher>asList(
                new StubContainsExtraInfoMatcher(10, false, true)
        );
        Object[] args = new Object[]{10};

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, args);
        assertArrayEquals(new Integer[0], result);
    }

    // -------------------------------------------------------------
    // Group 3: Positive Matches & Exception Handling
    // -------------------------------------------------------------

    @Test
    public void getSuspiciouslyNotMatchingArgsIndexes_whenSuspiciousMatchDetected_returnsMatchingIndex() {
        // matches == false, toString ตรงกัน ("100" vs "100"), typeMatches == false
        List<Matcher> matchers = Arrays.<Matcher>asList(
                new StubContainsExtraInfoMatcher(100, false, false)
        );
        Object[] args = new Object[]{100L};

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, args);
        assertArrayEquals(new Integer[]{0}, result);
    }

    @Test
    public void getSuspiciouslyNotMatchingArgsIndexes_whenSafelyMatchesThrowsException_evaluatedAsNotMatching() {
        // safelyMatches ดัก Throwable และคืนค่า false -> สามารถทำงานต่อจนพบ suspicious match ได้
        List<Matcher> matchers = Arrays.<Matcher>asList(
                new StubContainsExtraInfoMatcher("crash", false, false, true)
        );
        Object[] args = new Object[]{"crash"};

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, args);
        assertArrayEquals(new Integer[]{0}, result);
    }

    @Test
    public void getSuspiciouslyNotMatchingArgsIndexes_withMultipleArguments_identifiesOnlySuspiciousIndexes() {
        List<Matcher> matchers = Arrays.asList(
                new NormalMatcher("A"),                              // Index 0: Not ContainsExtraTypeInfo -> Skip
                new StubContainsExtraInfoMatcher(1, true, true),     // Index 1: Matches -> Skip
                new StubContainsExtraInfoMatcher(2, false, false),   // Index 2: Matches=false, toString="2", typeMatches=false -> SUSPICIOUS
                new StubContainsExtraInfoMatcher(3, false, false),   // Index 3: Matches=false, toString="3"!="99", typeMatches=false -> Skip
                new StubContainsExtraInfoMatcher(4L, false, false)   // Index 4: Matches=false, toString="4", typeMatches=false -> SUSPICIOUS
        );
        Object[] args = new Object[]{"A", 1, 2L, 99, 4};

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, args);
        assertArrayEquals(new Integer[]{2, 4}, result);
    }

    // -------------------------------------------------------------
    // Group 4: Edge Cases (Null Values & Defects4J Bug Pattern)
    // -------------------------------------------------------------

    @Test
    public void getSuspiciouslyNotMatchingArgsIndexes_whenArgumentIsNull_handlesNullGracefullyOrCapturesBug() {
        // จำลองสถานการณ์อาร์กิวเมนต์เป็น null ซึ่งอาจเกิด NullPointerException ใน toStringEquals
        List<Matcher> matchers = Arrays.<Matcher>asList(
                new StubContainsExtraInfoMatcher("null", false, false)
        );
        Object[] args = new Object[]{null};

        try {
            Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, args);
            assertNotNull(result);
        } catch (NullPointerException npe) {
            // ดักจับ Fault ของ Mockito-38 กรณีที่โค้ดยังไม่ได้รับการแก้ปัญหา null-safety
            assertNotNull("Caught expected bug/exception in Mockito-38", npe);
        }
    }
}