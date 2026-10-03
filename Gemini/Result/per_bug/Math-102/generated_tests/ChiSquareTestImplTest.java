package org.apache.commons.math.stat.inference;

import org.apache.commons.math.MathException;
import org.apache.commons.math.distribution.ChiSquaredDistribution;
import org.apache.commons.math.distribution.ChiSquaredDistributionImpl;
import org.apache.commons.math.distribution.DistributionFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Comprehensive JUnit 4 Test Suite for ChiSquareTestImpl.
 * Focuses on Branch/Condition coverage and edge cases.
 */
public class ChiSquareTestImplTest {

    private ChiSquareTestImpl testStatistic;

    @Before
    public void setUp() {
        testStatistic = new ChiSquareTestImpl();
    }

    // -------------------------------------------------------------------------
    // 1. Tests for chiSquare(double[] expected, long[] observed) and chiSquareTest
    // -------------------------------------------------------------------------

    @Test
    public void testChiSquareGoodnessOfFitSuccess() throws Exception {
        double[] expected = new double[]{500, 500};
        long[] observed = new long[]{485, 515};
        
        // Chi-Square statistic = (485-500)^2 / 500 + (515-500)^2 / 500 = 225/500 + 225/500 = 0.9
        double stat = testStatistic.chiSquare(expected, observed);
        assertEquals(0.9, stat, 1E-6);

        double pValue = testStatistic.chiSquareTest(expected, observed);
        assertTrue(pValue > 0.0 && pValue <= 1.0);

        // Alpha comparisons
        assertFalse(testStatistic.chiSquareTest(expected, observed, 0.05));
        assertTrue(testStatistic.chiSquareTest(expected, observed, 0.5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareExpectedLengthTooShort() {
        double[] expected = new double[]{10.0};
        long[] observed = new long[]{10};
        testStatistic.chiSquare(expected, observed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareArrayLengthMismatch() {
        double[] expected = new double[]{10.0, 20.0, 30.0};
        long[] observed = new long[]{10, 20};
        testStatistic.chiSquare(expected, observed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareExpectedContainsZero() {
        double[] expected = new double[]{10.0, 0.0};
        long[] observed = new long[]{10, 20};
        testStatistic.chiSquare(expected, observed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareExpectedContainsNegative() {
        double[] expected = new double[]{10.0, -5.0};
        long[] observed = new long[]{10, 20};
        testStatistic.chiSquare(expected, observed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareObservedContainsNegative() {
        double[] expected = new double[]{10.0, 20.0};
        long[] observed = new long[]{10, -1};
        testStatistic.chiSquare(expected, observed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareAlphaZero() throws Exception {
        double[] expected = new double[]{10.0, 20.0};
        long[] observed = new long[]{10, 20};
        testStatistic.chiSquareTest(expected, observed, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareAlphaNegative() throws Exception {
        double[] expected = new double[]{10.0, 20.0};
        long[] observed = new long[]{10, 20};
        testStatistic.chiSquareTest(expected, observed, -0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareAlphaTooHigh() throws Exception {
        double[] expected = new double[]{10.0, 20.0};
        long[] observed = new long[]{10, 20};
        testStatistic.chiSquareTest(expected, observed, 0.50001);
    }

    // -------------------------------------------------------------------------
    // 2. Tests for 2-Way Contingency Table: chiSquare(long[][]) & chiSquareTest(long[][])
    // -------------------------------------------------------------------------

    @Test
    public void testChiSquare2WayTableSuccess() throws Exception {
        long[][] counts = new long[][]{
            {40, 60},
            {60, 40}
        };
        // 2x2 table: df = 1.0
        double stat = testStatistic.chiSquare(counts);
        assertEquals(8.0, stat, 1E-6);

        double pValue = testStatistic.chiSquareTest(counts);
        assertTrue(pValue < 0.01);
        assertTrue(testStatistic.chiSquareTest(counts, 0.01));
        assertFalse(testStatistic.chiSquareTest(counts, 0.001));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTableRowsTooFew() {
        long[][] counts = new long[][]{{10, 20, 30}};
        testStatistic.chiSquare(counts);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTableColsTooFew() {
        long[][] counts = new long[][]{{10}, {20}};
        testStatistic.chiSquare(counts);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTableNonRectangular() {
        long[][] counts = new long[][]{
            {10, 20, 30},
            {40, 50}
        };
        testStatistic.chiSquare(counts);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTableNegativeEntry() {
        long[][] counts = new long[][]{
            {10, 20},
            {30, -1}
        };
        testStatistic.chiSquare(counts);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTableAlphaInvalidLow() throws Exception {
        long[][] counts = new long[][]{{10, 20}, {30, 40}};
        testStatistic.chiSquareTest(counts, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTableAlphaInvalidHigh() throws Exception {
        long[][] counts = new long[][]{{10, 20}, {30, 40}};
        testStatistic.chiSquareTest(counts, 0.6);
    }

    // -------------------------------------------------------------------------
    // 3. Tests for 2-Sample Data Sets Comparison
    // -------------------------------------------------------------------------

    @Test
    public void testChiSquareDataSetsEqualCounts() throws Exception {
        long[] observed1 = new long[]{10, 20, 30};
        long[] observed2 = new long[]{10, 20, 30};
        // Identical counts: chi-square should be 0.0
        double stat = testStatistic.chiSquareDataSetsComparison(observed1, observed2);
        assertEquals(0.0, stat, 1E-6);

        double pValue = testStatistic.chiSquareTestDataSetsComparison(observed1, observed2);
        assertEquals(1.0, pValue, 1E-6);
        assertFalse(testStatistic.chiSquareTestDataSetsComparison(observed1, observed2, 0.05));
    }

    @Test
    public void testChiSquareDataSetsUnequalCounts() throws Exception {
        long[] observed1 = new long[]{10, 20, 30}; // sum = 60
        long[] observed2 = new long[]{20, 40, 60}; // sum = 120
        // Same proportion, different sample sizes: chi-square statistic should be 0.0
        double stat = testStatistic.chiSquareDataSetsComparison(observed1, observed2);
        assertEquals(0.0, stat, 1E-6);

        double pVal = testStatistic.chiSquareTestDataSetsComparison(observed1, observed2);
        assertEquals(1.0, pVal, 1E-6);
    }

    @Test
    public void testChiSquareDataSetsComparisonSignificantDifference() throws Exception {
        long[] observed1 = new long[]{50, 10, 20};
        long[] observed2 = new long[]{10, 40, 30};
        double stat = testStatistic.chiSquareDataSetsComparison(observed1, observed2);
        assertTrue(stat > 0.0);

        double pVal = testStatistic.chiSquareTestDataSetsComparison(observed1, observed2);
        assertTrue(pVal < 0.05);
        assertTrue(testStatistic.chiSquareTestDataSetsComparison(observed1, observed2, 0.05));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataSetsComparisonLengthTooShort() {
        long[] obs1 = new long[]{10};
        long[] obs2 = new long[]{10};
        testStatistic.chiSquareDataSetsComparison(obs1, obs2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataSetsComparisonLengthMismatch() {
        long[] obs1 = new long[]{10, 20, 30};
        long[] obs2 = new long[]{10, 20};
        testStatistic.chiSquareDataSetsComparison(obs1, obs2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataSetsComparisonObserved1Negative() {
        long[] obs1 = new long[]{-1, 20};
        long[] obs2 = new long[]{10, 20};
        testStatistic.chiSquareDataSetsComparison(obs1, obs2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataSetsComparisonObserved2Negative() {
        long[] obs1 = new long[]{10, 20};
        long[] obs2 = new long[]{10, -5};
        testStatistic.chiSquareDataSetsComparison(obs1, obs2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataSetsComparisonAllZeroSample1() {
        long[] obs1 = new long[]{0, 0};
        long[] obs2 = new long[]{10, 20};
        testStatistic.chiSquareDataSetsComparison(obs1, obs2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataSetsComparisonAllZeroSample2() {
        long[] obs1 = new long[]{10, 20};
        long[] obs2 = new long[]{0, 0};
        testStatistic.chiSquareDataSetsComparison(obs1, obs2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataSetsComparisonBothCellsZero() {
        long[] obs1 = new long[]{10, 0, 30};
        long[] obs2 = new long[]{20, 0, 40};
        testStatistic.chiSquareDataSetsComparison(obs1, obs2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataSetsComparisonAlphaZero() throws Exception {
        long[] obs1 = new long[]{10, 20};
        long[] obs2 = new long[]{15, 25};
        testStatistic.chiSquareTestDataSetsComparison(obs1, obs2, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataSetsComparisonAlphaTooLarge() throws Exception {
        long[] obs1 = new long[]{10, 20};
        long[] obs2 = new long[]{15, 25};
        testStatistic.chiSquareTestDataSetsComparison(obs1, obs2, 0.51);
    }

    // -------------------------------------------------------------------------
    // 4. Tests for Constructors & Custom Distribution
    // -------------------------------------------------------------------------

    @Test
    public void testCustomDistributionConstructorAndSetter() throws Exception {
        ChiSquaredDistribution customDist = new ChiSquaredDistributionImpl(2.0);
        ChiSquareTestImpl customTest = new ChiSquareTestImpl(customDist);

        double[] expected = new double[]{10.0, 10.0};
        long[] observed = new long[]{10, 10};

        double p = customTest.chiSquareTest(expected, observed);
        assertEquals(1.0, p, 1E-6);

        // Test setDistribution
        ChiSquaredDistribution anotherDist = new ChiSquaredDistributionImpl(1.0);
        customTest.setDistribution(anotherDist);
        double p2 = customTest.chiSquareTest(expected, observed);
        assertEquals(1.0, p2, 1E-6);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testGetDistributionFactory() {
        DistributionFactory factory = testStatistic.getDistributionFactory();
        assertNotNull(factory);
    }
}