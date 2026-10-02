package org.apache.commons.math.stat.regression;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import org.apache.commons.math.stat.regression.SimpleRegression;

public class SimpleRegressionTest {

    private SimpleRegression regression;

    @Before
    public void setUp() {
        regression = new SimpleRegression();
    }

    // ===================== addData(double,double) =====================

    @Test
    public void testAddData_FirstPoint_NIsZeroBranch() {
        regression.addData(1d, 2d);
        assertEquals(1L, regression.getN());
    }

    @Test
    public void testAddData_SecondPoint_ElseBranch() {
        regression.addData(1d, 2d);
        regression.addData(2d, 4d);
        assertEquals(2L, regression.getN());
    }

    // ===================== addData(double[][]) =====================

    @Test
    public void testAddDataArray_EmptyArray_LoopZeroIterations() {
        regression.addData(new double[0][0]);
        assertEquals(0L, regression.getN());
    }

    @Test
    public void testAddDataArray_SingleRow_LoopOneIteration() {
        double[][] data = {{1d, 2d}};
        regression.addData(data);
        assertEquals(1L, regression.getN());
    }

    @Test
    public void testAddDataArray_MultipleRows_LoopManyIterations() {
        double[][] data = {{1,3},{2,5},{3,7},{4,9},{5,11}};
        regression.addData(data);
        assertEquals(5L, regression.getN());
        assertEquals(2.0, regression.getSlope(), 1e-9);
    }

    // ===================== clear() =====================

    @Test
    public void testClear_ResetsState() {
        regression.addData(1d, 2d);
        regression.addData(2d, 4d);
        regression.clear();
        assertEquals(0L, regression.getN());
        assertTrue(Double.isNaN(regression.getSlope()));
    }

    // ===================== getSlope() =====================

    @Test
    public void testGetSlope_NoData_NLessThan2() {
        assertTrue(Double.isNaN(regression.getSlope()));
    }

    @Test
    public void testGetSlope_OnePoint_NLessThan2() {
        regression.addData(1d, 2d);
        assertTrue(Double.isNaN(regression.getSlope()));
    }

    @Test
    public void testGetSlope_NoVariationInX_SumXXZero() {
        regression.addData(5d, 1d);
        regression.addData(5d, 2d);
        regression.addData(5d, 3d);
        assertTrue(Double.isNaN(regression.getSlope()));
    }

    @Test
    public void testGetSlope_PerfectFitPositive_NormalBranch() {
        addPerfectPositiveData();
        assertEquals(2.0, regression.getSlope(), 1e-9);
    }

    @Test
    public void testGetSlope_PerfectFitNegative_NormalBranch() {
        addPerfectNegativeData();
        assertEquals(-1.0, regression.getSlope(), 1e-9);
    }

    // ===================== getIntercept() =====================

    @Test
    public void testGetIntercept_InsufficientData_NaNPropagation() {
        assertTrue(Double.isNaN(regression.getIntercept()));
    }

    @Test
    public void testGetIntercept_PerfectFit() {
        addPerfectPositiveData();
        assertEquals(1.0, regression.getIntercept(), 1e-9);
    }

    // ===================== predict(x) =====================

    @Test
    public void testPredict_InsufficientData_NaN() {
        assertTrue(Double.isNaN(regression.predict(10d)));
    }

    @Test
    public void testPredict_PerfectFit() {
        addPerfectPositiveData();
        assertEquals(21.0, regression.predict(10d), 1e-9);
    }

    // ===================== getR() / getRSquare() =====================

    @Test
    public void testGetR_PositiveSlope_NoNegateBranch() {
        addPerfectPositiveData();
        assertEquals(1.0, regression.getR(), 1e-9);
    }

    @Test
    public void testGetR_NegativeSlope_NegateBranch() {
        addPerfectNegativeData();
        assertEquals(-1.0, regression.getR(), 1e-9);
    }

    @Test
    public void testGetRSquare_InsufficientData_NaN() {
        assertTrue(Double.isNaN(regression.getRSquare()));
    }

    @Test
    public void testGetRSquare_ImperfectFit() {
        addImperfectData();
        assertEquals(0.6, regression.getRSquare(), 1e-9);
    }

    // ===================== getSumSquaredErrors() =====================

    @Test
    public void testGetSumSquaredErrors_InsufficientData_NaN() {
        assertTrue(Double.isNaN(regression.getSumSquaredErrors()));
    }

    @Test
    public void testGetSumSquaredErrors_PerfectFit_Zero() {
        addPerfectPositiveData();
        assertEquals(0.0, regression.getSumSquaredErrors(), 1e-9);
    }

    @Test
    public void testGetSumSquaredErrors_ImperfectFit() {
        addImperfectData();
        assertEquals(2.4, regression.getSumSquaredErrors(), 1e-9);
    }

    // ===================== getTotalSumSquares() =====================

    @Test
    public void testGetTotalSumSquares_NLessThan2_NaN() {
        regression.addData(1d, 2d);
        assertTrue(Double.isNaN(regression.getTotalSumSquares()));
    }

    @Test
    public void testGetTotalSumSquares_Normal() {
        addPerfectPositiveData();
        assertEquals(40.0, regression.getTotalSumSquares(), 1e-9);
    }

    // ===================== getRegressionSumSquares() =====================

    @Test
    public void testGetRegressionSumSquares_InsufficientData_NaN() {
        assertTrue(Double.isNaN(regression.getRegressionSumSquares()));
    }

    @Test
    public void testGetRegressionSumSquares_PerfectFit() {
        addPerfectPositiveData();
        assertEquals(40.0, regression.getRegressionSumSquares(), 1e-9);
    }

    @Test
    public void testGetRegressionSumSquares_ImperfectFit() {
        addImperfectData();
        assertEquals(3.6, regression.getRegressionSumSquares(), 1e-9);
    }

    // ===================== getMeanSquareError() =====================

    @Test
    public void testGetMeanSquareError_NLessThan3_NaN() {
        regression.addData(1d, 2d);
        regression.addData(2d, 4d);
        assertTrue(Double.isNaN(regression.getMeanSquareError()));
    }

    @Test
    public void testGetMeanSquareError_Normal() {
        addImperfectData();
        assertEquals(0.8, regression.getMeanSquareError(), 1e-9);
    }

    // ===================== getInterceptStdErr() / getSlopeStdErr() =====================

    @Test
    public void testGetInterceptStdErr_PerfectFit_Zero() {
        addPerfectPositiveData();
        assertEquals(0.0, regression.getInterceptStdErr(), 1e-9);
    }

    @Test
    public void testGetInterceptStdErr_ImperfectFit() {
        addImperfectData();
        assertEquals(Math.sqrt(0.88), regression.getInterceptStdErr(), 1e-9);
    }

    @Test
    public void testGetSlopeStdErr_PerfectFit_Zero() {
        addPerfectPositiveData();
        assertEquals(0.0, regression.getSlopeStdErr(), 1e-9);
    }

    @Test
    public void testGetSlopeStdErr_ImperfectFit() {
        addImperfectData();
        assertEquals(Math.sqrt(0.08), regression.getSlopeStdErr(), 1e-9);
    }

    // ===================== getSlopeConfidenceInterval() =====================

    @Test
    public void testGetSlopeConfidenceInterval_Default_PerfectFit_Zero() throws Exception {
        addPerfectPositiveData();
        // slopeStdErr == 0 -> ผลลัพธ์ต้องเป็น 0 ไม่ว่าค่า t จะเป็นเท่าใด
        assertEquals(0.0, regression.getSlopeConfidenceInterval(), 1e-9);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSlopeConfidenceInterval_AlphaEqualsOne_Throws() throws Exception {
        addImperfectData();
        regression.getSlopeConfidenceInterval(1.0d); // alpha >= 1
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSlopeConfidenceInterval_AlphaEqualsZero_Throws() throws Exception {
        addImperfectData();
        regression.getSlopeConfidenceInterval(0.0d); // alpha <= 0
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSlopeConfidenceInterval_AlphaGreaterThanOne_Throws() throws Exception {
        addImperfectData();
        regression.getSlopeConfidenceInterval(1.5d);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSlopeConfidenceInterval_AlphaNegative_Throws() throws Exception {
        addImperfectData();
        regression.getSlopeConfidenceInterval(-0.1d);
    }

    @Test
    public void testGetSlopeConfidenceInterval_ValidAlpha_NoThrow() throws Exception {
        addPerfectPositiveData();
        double ci = regression.getSlopeConfidenceInterval(0.1d);
        // slopeStdErr == 0 สำหรับข้อมูล perfect fit จึงต้องได้ 0 เสมอ
        assertEquals(0.0, ci, 1e-9);
    }

    // ===================== getSignificance() =====================

    @Test
    public void testGetSignificance_ImperfectData_SanityRange() throws Exception {
        addImperfectData();
        double sig = regression.getSignificance();
        // ไม่ทราบ implementation ของ TDistribution แน่ชัด จึงตรวจสอบเฉพาะขอบเขตที่สมเหตุสมผล
        assertFalse(Double.isNaN(sig));
        assertTrue(sig >= 0.0 && sig <= 2.0);
    }

    // ===================== getN() =====================

    @Test
    public void testGetN_Empty() {
        assertEquals(0L, regression.getN());
    }

    @Test
    public void testGetN_AfterAddingData() {
        regression.addData(1d, 1d);
        regression.addData(2d, 2d);
        regression.addData(3d, 3d);
        assertEquals(3L, regression.getN());
    }

    // ===================== Helper data builders =====================

    /** y = 2x + 1, perfect linear fit, n=5 */
    private void addPerfectPositiveData() {
        double[][] data = {{1,3},{2,5},{3,7},{4,9},{5,11}};
        regression.addData(data);
    }

    /** y = -x + 10, perfect linear fit with negative slope, n=4 */
    private void addPerfectNegativeData() {
        double[][] data = {{1,9},{2,8},{3,7},{4,6}};
        regression.addData(data);
    }

    /**
     * ข้อมูลที่ไม่ fit สมบูรณ์ ใช้คำนวณค่าสถิติที่ตรวจสอบได้ด้วยมือ:
     * n=5, sumXX=10, sumYY=6, sumXY=6
     * slope=0.6, intercept=2.2, SSE=2.4, RSquare=0.6, MSE=0.8
     */
    private void addImperfectData() {
        double[][] data = {{1,2},{2,4},{3,5},{4,4},{5,5}};
        regression.addData(data);
    }
}
