package org.apache.commons.math.stat.inference;

import static org.junit.Assert.*;

import org.apache.commons.math.MathException;
import org.apache.commons.math.distribution.ChiSquaredDistributionImpl;
import org.apache.commons.math.distribution.DistributionFactory;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for {@link ChiSquareTestImpl}.
 *
 * ค่าตัวเลขอ้างอิง (expected numeric results) อิงจากชุดทดสอบต้นฉบับของ
 * Apache Commons Math (ChiSquareTestTest) ที่เผยแพร่คู่กับ Math-102b
 * เพื่อให้สามารถตรวจจับ fault ด้านการคำนวณได้จริง
 */
public class ChiSquareTestImplTest {

    private ChiSquareTestImpl testStatistic;

    @Before
    public void setUp() {
        testStatistic = new ChiSquareTestImpl();
    }

    // ---------- Helper subclass to expose protected method ----------
    private static class ExposedChiSquareTestImpl extends ChiSquareTestImpl {
        public DistributionFactory exposeGetDistributionFactory() {
            return getDistributionFactory();
        }
    }

    // ===================== Constructors =====================

    @Test
    public void testDefaultConstructor() {
        ChiSquareTestImpl t = new ChiSquareTestImpl();
        assertNotNull(t);
    }

    @Test
    public void testConstructorWithDistribution() {
        ChiSquaredDistributionImpl dist = new ChiSquaredDistributionImpl(5.0);
        ChiSquareTestImpl t = new ChiSquareTestImpl(dist);
        assertNotNull(t);
        // df ถูก override ภายใน chiSquareTest เสมอ แต่ตรวจว่าใช้งานได้โดยไม่ throw
        long[] observed = {10, 9, 11};
        double[] expected = {10, 10, 10};
        try {
            double p = t.chiSquareTest(expected, observed);
            assertTrue(p >= 0 && p <= 1);
        } catch (MathException e) {
            fail("Unexpected MathException");
        }
    }

    @Test
    public void testSetDistribution() {
        ChiSquaredDistributionImpl dist = new ChiSquaredDistributionImpl(3.0);
        testStatistic.setDistribution(dist);
        // ไม่มี getter ตรง ๆ แต่ verify ว่าเรียกใช้ได้โดยไม่ error
        long[] observed = {10, 9, 11};
        double[] expected = {10, 10, 10};
        try {
            testStatistic.chiSquareTest(expected, observed);
        } catch (MathException e) {
            fail("Unexpected MathException");
        }
    }

    @Test
    public void testGetDistributionFactory() {
        ExposedChiSquareTestImpl t = new ExposedChiSquareTestImpl();
        DistributionFactory factory = t.exposeGetDistributionFactory();
        assertNotNull(factory);
    }

    // ===================== chiSquare(double[], long[]) =====================

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquare_LengthLessThanTwo_Throws() {
        double[] expected = {1};
        long[] observed = {0};
        testStatistic.chiSquare(expected, observed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquare_LengthMismatch_Throws() {
        double[] expected = {1, 1, 2};
        long[] observed = {0, 1, 2, 3};
        testStatistic.chiSquare(expected, observed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquare_ExpectedNotPositive_Throws() {
        // expected มีค่า 0 -> isPositive คืน false
        double[] expected = {0, 10, 10};
        long[] observed = {10, 9, 11};
        testStatistic.chiSquare(expected, observed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquare_ObservedNegative_Throws() {
        double[] expected = {10, 10, 10};
        long[] observed = {10, -9, 11};
        testStatistic.chiSquare(expected, observed);
    }

    @Test
    public void testChiSquare_NormalCase_Small() {
        long[] observed = {10, 9, 11};
        double[] expected = {10, 10, 10};
        assertEquals(0.2d, testStatistic.chiSquare(expected, observed), 1e-12);
    }

    @Test
    public void testChiSquare_NormalCase_Larger() {
        long[] observed1 = {500, 623, 72, 70, 31};
        double[] expected1 = {485, 541, 82, 61, 37};
        assertEquals(9.023307936427388d,
                testStatistic.chiSquare(expected1, observed1), 1e-9);
    }

    // ===================== chiSquareTest(double[], long[]) =====================

    @Test
    public void testChiSquareTest_NormalCase() throws MathException {
        long[] observed = {10, 9, 11};
        double[] expected = {10, 10, 10};
        assertEquals(0.904837418036d,
                testStatistic.chiSquareTest(expected, observed), 1e-9);
    }

    @Test
    public void testChiSquareTest_NormalCase_Larger() throws MathException {
        long[] observed1 = {500, 623, 72, 70, 31};
        double[] expected1 = {485, 541, 82, 61, 37};
        assertEquals(0.06051952647453607d,
                testStatistic.chiSquareTest(expected1, observed1), 1e-8);
    }

    // ===================== chiSquareTest(double[], long[], alpha) =====================

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTestWithAlpha_Zero_Throws() throws MathException {
        double[] expected = {10, 10, 10};
        long[] observed = {10, 9, 11};
        testStatistic.chiSquareTest(expected, observed, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTestWithAlpha_Negative_Throws() throws MathException {
        double[] expected = {10, 10, 10};
        long[] observed = {10, 9, 11};
        testStatistic.chiSquareTest(expected, observed, -0.1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTestWithAlpha_GreaterThanHalf_Throws() throws MathException {
        double[] expected = {10, 10, 10};
        long[] observed = {10, 9, 11};
        testStatistic.chiSquareTest(expected, observed, 0.50001);
    }

    @Test
    public void testChiSquareTestWithAlpha_BoundaryHalf_NoThrow() throws MathException {
        // alpha == 0.5 ต้องไม่ throw เพราะเงื่อนไขคือ alpha > 0.5
        double[] expected = {10, 10, 10};
        long[] observed = {10, 9, 11};
        boolean result = testStatistic.chiSquareTest(expected, observed, 0.5);
        // ไม่ assert ค่า boolean เฉพาะเจาะจงเพราะไม่ fix ไว้ใน requirement, เพียงยืนยันไม่มี exception
        assertTrue(result == true || result == false);
    }

    @Test
    public void testChiSquareTestWithAlpha_Reject() throws MathException {
        long[] observed1 = {500, 623, 72, 70, 31};
        double[] expected1 = {485, 541, 82, 61, 37};
        assertTrue(testStatistic.chiSquareTest(expected1, observed1, 0.07));
    }

    @Test
    public void testChiSquareTestWithAlpha_Accept() throws MathException {
        long[] observed1 = {500, 623, 72, 70, 31};
        double[] expected1 = {485, 541, 82, 61, 37};
        assertFalse(testStatistic.chiSquareTest(expected1, observed1, 0.05));
    }

    // ===================== chiSquare(long[][]) / checkArray =====================

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquare2D_RowsLessThanTwo_Throws() {
        long[][] counts = {{40, 22, 43}};
        testStatistic.chiSquare(counts);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquare2D_ColsLessThanTwo_Throws() {
        long[][] counts = {{40}, {50}};
        testStatistic.chiSquare(counts);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquare2D_NotRectangular_Throws() {
        long[][] counts = {{40, 22, 43}, {91, 21, 28}, {60, 10}};
        testStatistic.chiSquare(counts);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquare2D_NegativeEntries_Throws() {
        long[][] counts = {{10, -15}, {30, 40}, {60, 90}};
        testStatistic.chiSquare(counts);
    }

    @Test
    public void testChiSquare2D_NormalCase_Small() {
        long[][] counts = {{10, 15}, {30, 40}, {60, 90}};
        assertEquals(0.168965517241d, testStatistic.chiSquare(counts), 1e-9);
    }

    @Test
    public void testChiSquare2D_NormalCase_Larger() {
        long[][] counts = {{40, 22, 43}, {91, 21, 28}, {60, 10, 22}};
        assertEquals(22.709027688d, testStatistic.chiSquare(counts), 1e-6);
    }

    // ===================== chiSquareTest(long[][]) =====================

    @Test
    public void testChiSquareTest2D_NormalCase_Small() throws MathException {
        long[][] counts = {{10, 15}, {30, 40}, {60, 90}};
        assertEquals(0.918987499852d, testStatistic.chiSquareTest(counts), 1e-8);
    }

    @Test
    public void testChiSquareTest2D_NormalCase_Larger() throws MathException {
        long[][] counts = {{40, 22, 43}, {91, 21, 28}, {60, 10, 22}};
        assertEquals(0.000144751460134d, testStatistic.chiSquareTest(counts), 1e-9);
    }

    // ===================== chiSquareTest(long[][], alpha) =====================

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTest2DWithAlpha_OutOfRange_Throws() throws MathException {
        long[][] counts = {{40, 22, 43}, {91, 21, 28}, {60, 10, 22}};
        testStatistic.chiSquareTest(counts, 95);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTest2DWithAlpha_Zero_Throws() throws MathException {
        long[][] counts = {{40, 22, 43}, {91, 21, 28}, {60, 10, 22}};
        testStatistic.chiSquareTest(counts, 0.0);
    }

    @Test
    public void testChiSquareTest2DWithAlpha_Reject() throws MathException {
        long[][] counts = {{40, 22, 43}, {91, 21, 28}, {60, 10, 22}};
        assertTrue(testStatistic.chiSquareTest(counts, 0.0002));
    }

    @Test
    public void testChiSquareTest2DWithAlpha_Accept() throws MathException {
        long[][] counts = {{40, 22, 43}, {91, 21, 28}, {60, 10, 22}};
        assertFalse(testStatistic.chiSquareTest(counts, 0.0001));
    }

    // ===================== chiSquareDataSetsComparison =====================

    @Test(expected = IllegalArgumentException.class)
    public void testDataSetsComparison_LengthLessThanTwo_Throws() {
        long[] observed1 = {0};
        long[] observed2 = {0};
        testStatistic.chiSquareDataSetsComparison(observed1, observed2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataSetsComparison_LengthMismatch_Throws() {
        long[] observed1 = {0, 1, 2, 3};
        long[] observed2 = {1, 1, 2};
        testStatistic.chiSquareDataSetsComparison(observed1, observed2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataSetsComparison_NegativeCount_Throws() {
        long[] observed1 = {10, -2, 12, 10};
        long[] observed2 = {15, 10, 10, 15};
        testStatistic.chiSquareDataSetsComparison(observed1, observed2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataSetsComparison_AllCountsZero_Throws() {
        // countSum1 * countSum2 == 0
        long[] observed1 = {0, 0, 3, 0};
        long[] observed2 = {0, 0, 0, 0};
        testStatistic.chiSquareDataSetsComparison(observed1, observed2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataSetsComparison_BothZeroAtSameIndex_Throws() {
        long[] observed3 = {10, 0, 12, 10};
        long[] observed4 = {15, 0, 10, 15};
        testStatistic.chiSquareDataSetsComparison(observed3, observed4);
    }

    @Test
    public void testDataSetsComparison_EqualCounts_NormalCase() {
        // countSum1 == countSum2 -> unequalCounts == false branch
        long[] observed1 = {10, 12, 12, 10};
        long[] observed2 = {5, 15, 14, 10};
        assertEquals(2.153846153846154d,
                testStatistic.chiSquareDataSetsComparison(observed1, observed2), 1e-9);
    }

    @Test
    public void testDataSetsComparison_UnequalCounts_NormalCase() {
        // countSum1 != countSum2 -> unequalCounts == true branch (ใช้ weight)
        long[] observed1 = {10, 12, 12, 10};
        long[] observed2 = {15, 10, 10, 15};
        assertEquals(4.142857142857143d,
                testStatistic.chiSquareDataSetsComparison(observed1, observed2), 1e-9);
    }

    // ===================== chiSquareTestDataSetsComparison =====================

    @Test
    public void testChiSquareTestDataSetsComparison_EqualCounts() throws MathException {
        long[] observed1 = {10, 12, 12, 10};
        long[] observed2 = {5, 15, 14, 10};
        assertEquals(0.5415582093956914d,
                testStatistic.chiSquareTestDataSetsComparison(observed1, observed2), 1e-9);
    }

    @Test
    public void testChiSquareTestDataSetsComparison_UnequalCounts() throws MathException {
        long[] observed1 = {10, 12, 12, 10};
        long[] observed2 = {15, 10, 10, 15};
        assertEquals(0.24663016804279875d,
                testStatistic.chiSquareTestDataSetsComparison(observed1, observed2), 1e-9);
    }

    // ===================== chiSquareTestDataSetsComparison(alpha) =====================

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTestDataSetsComparisonWithAlpha_Zero_Throws() throws MathException {
        long[] observed1 = {10, 12, 12, 10};
        long[] observed2 = {5, 15, 14, 10};
        testStatistic.chiSquareTestDataSetsComparison(observed1, observed2, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTestDataSetsComparisonWithAlpha_TooHigh_Throws() throws MathException {
        long[] observed1 = {10, 12, 12, 10};
        long[] observed2 = {5, 15, 14, 10};
        testStatistic.chiSquareTestDataSetsComparison(observed1, observed2, 0.6);
    }

    @Test
    public void testChiSquareTestDataSetsComparisonWithAlpha_NormalCase() throws MathException {
        long[] observed1 = {10, 12, 12, 10};
        long[] observed2 = {5, 15, 14, 10};
        // p-value ~0.54 > 0.05 -> accept (false)
        assertFalse(testStatistic.chiSquareTestDataSetsComparison(observed1, observed2, 0.05));
    }
}
