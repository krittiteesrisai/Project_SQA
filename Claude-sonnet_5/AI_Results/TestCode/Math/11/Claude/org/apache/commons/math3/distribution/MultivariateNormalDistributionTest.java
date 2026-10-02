package org.apache.commons.math3.distribution;

import static org.junit.Assert.*;

import org.apache.commons.math3.distribution.MultivariateNormalDistribution;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.NonPositiveDefiniteMatrixException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.SingularMatrixException;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.util.FastMath;
import org.junit.Test;

public class MultivariateNormalDistributionTest {

    private static final double EPS = 1e-9;

    // ---------- Constructor (ปกติ) ----------

    @Test
    public void testConstructorWithDefaultRandomGenerator() {
        double[] means = {0.0, 0.0};
        double[][] covariances = {{1.0, 0.0}, {0.0, 1.0}};
        MultivariateNormalDistribution dist =
                new MultivariateNormalDistribution(means, covariances);
        assertNotNull(dist);
        assertArrayEquals(means, dist.getMeans(), EPS);
    }

    @Test
    public void testConstructorWithCustomRandomGenerator() {
        double[] means = {1.0, 2.0};
        double[][] covariances = {{2.0, 0.0}, {0.0, 3.0}};
        MultivariateNormalDistribution dist =
                new MultivariateNormalDistribution(new Well19937c(1234), means, covariances);
        assertNotNull(dist);
        assertArrayEquals(means, dist.getMeans(), EPS);
    }

    // ---------- Constructor: DimensionMismatchException (rows) ----------

    @Test(expected = DimensionMismatchException.class)
    public void testConstructorThrowsDimensionMismatchOnCovarianceRows() {
        double[] means = {0.0, 0.0};
        // covariances.length (1) != means.length (2)
        double[][] covariances = {{1.0, 0.0}};
        new MultivariateNormalDistribution(means, covariances);
    }

    // ---------- Constructor: DimensionMismatchException (columns) ----------

    @Test(expected = DimensionMismatchException.class)
    public void testConstructorThrowsDimensionMismatchOnCovarianceColumns() {
        double[] means = {0.0, 0.0};
        // row 1 มี length ไม่เท่ากับ dim(=2)
        double[][] covariances = {{1.0, 0.0}, {0.0, 1.0, 5.0}};
        new MultivariateNormalDistribution(means, covariances);
    }

    // ---------- Constructor: NonPositiveDefiniteMatrixException ----------

    @Test(expected = NonPositiveDefiniteMatrixException.class)
    public void testConstructorThrowsNonPositiveDefiniteForNegativeEigenvalue() {
        // Matrix [[1,2],[2,1]] -> eigenvalues = 3 and -1 (ค่าลบ)
        double[] means = {0.0, 0.0};
        double[][] covariances = {{1.0, 2.0}, {2.0, 1.0}};
        new MultivariateNormalDistribution(means, covariances);
    }

    // ---------- Constructor: SingularMatrixException (eigenvalue = 0) ----------

    @Test(expected = SingularMatrixException.class)
    public void testConstructorThrowsSingularMatrixExceptionForZeroEigenvalue() {
        // Matrix [[0,0],[0,1]] -> eigenvalue 0 -> getInverse() ควร throw SingularMatrixException
        double[] means = {0.0, 0.0};
        double[][] covariances = {{0.0, 0.0}, {0.0, 1.0}};
        new MultivariateNormalDistribution(means, covariances);
    }

    // ---------- getMeans() / getCovariances() เป็น copy ----------

    @Test
    public void testGetMeansReturnsDefensiveCopy() {
        double[] means = {5.0, -3.0};
        double[][] covariances = {{1.0, 0.0}, {0.0, 1.0}};
        MultivariateNormalDistribution dist =
                new MultivariateNormalDistribution(means, covariances);

        double[] got = dist.getMeans();
        got[0] = 999.0; // แก้ไข copy ไม่ควรกระทบ internal state

        double[] got2 = dist.getMeans();
        assertEquals(5.0, got2[0], EPS);
    }

    @Test
    public void testGetCovariancesReturnsDefensiveCopy() {
        double[] means = {0.0, 0.0};
        double[][] covariances = {{2.0, 0.0}, {0.0, 3.0}};
        MultivariateNormalDistribution dist =
                new MultivariateNormalDistribution(means, covariances);

        RealMatrix cov1 = dist.getCovariances();
        cov1.setEntry(0, 0, -100.0); // แก้ไข copy

        RealMatrix cov2 = dist.getCovariances();
        assertEquals(2.0, cov2.getEntry(0, 0), EPS);
    }

    // ---------- density(): DimensionMismatchException ----------

    @Test(expected = DimensionMismatchException.class)
    public void testDensityThrowsDimensionMismatch() {
        double[] means = {0.0, 0.0};
        double[][] covariances = {{1.0, 0.0}, {0.0, 1.0}};
        MultivariateNormalDistribution dist =
                new MultivariateNormalDistribution(means, covariances);
        dist.density(new double[] {1.0, 2.0, 3.0}); // length ไม่ตรง dim
    }

    // ---------- density(): กรณี dim เป็นเลขคู่ (ควรถูกต้อง) ----------

    @Test
    public void testDensityForEvenDimension_Correct() {
        // dim = 2 -> -dim/2 = -1 (integer division ไม่กระทบผลลัพธ์)
        double[] means = {0.0, 0.0};
        double[][] covariances = {{1.0, 0.0}, {0.0, 1.0}};
        MultivariateNormalDistribution dist =
                new MultivariateNormalDistribution(means, covariances);

        double actual = dist.density(new double[] {0.0, 0.0});
        double expected = 1.0 / (2 * FastMath.PI); // 1/(2*pi) * exp(0)
        assertEquals(expected, actual, 1e-6);
    }

    // ---------- density(): กรณี dim เป็นเลขคี่ (เผยบัค Math-11b) ----------

    @Test
    public void testDensityForOddDimension_ExposesIntegerDivisionBug() {
        // dim = 1 -> ค่าที่ถูกต้องทางคณิตศาสตร์คือ exponent = -0.5
        // แต่โค้ดคำนวณ (-dim/2) ด้วย int arithmetic -> -1/2 = 0 (ผิด)
        // ทดสอบนี้คาดหวังค่าที่ถูกต้องตามสูตร PDF ของ Normal distribution 1 มิติ
        // หากมี bug (Math-11b) การทดสอบนี้จะ FAIL เพื่อดักจับข้อบกพร่อง
        double[] means = {0.0};
        double[][] covariances = {{1.0}};
        MultivariateNormalDistribution dist =
                new MultivariateNormalDistribution(means, covariances);

        double actual = dist.density(new double[] {0.0});
        double expected = 1.0 / FastMath.sqrt(2 * FastMath.PI); // ค่าทางทฤษฎีที่ถูกต้อง
        assertEquals("ค่านี้คาดว่าจะต่างกันถ้ามีบัค integer-division ใน dim คี่ (Math-11b)",
                expected, actual, 1e-6);
    }

    // ---------- getStandardDeviations() ----------

    @Test
    public void testGetStandardDeviations() {
        double[] means = {0.0, 0.0, 0.0};
        double[][] covariances = {
                {4.0, 0.0, 0.0},
                {0.0, 9.0, 0.0},
                {0.0, 0.0, 16.0}
        };
        MultivariateNormalDistribution dist =
                new MultivariateNormalDistribution(means, covariances);

        double[] std = dist.getStandardDeviations();
        assertEquals(2.0, std[0], EPS);
        assertEquals(3.0, std[1], EPS);
        assertEquals(4.0, std[2], EPS);
    }

    // ---------- sample() ----------

    @Test
    public void testSampleReturnsCorrectDimension() {
        double[] means = {0.0, 0.0, 0.0};
        double[][] covariances = {
                {1.0, 0.0, 0.0},
                {0.0, 1.0, 0.0},
                {0.0, 0.0, 1.0}
        };
        MultivariateNormalDistribution dist =
                new MultivariateNormalDistribution(new Well19937c(42), means, covariances);

        double[] sample = dist.sample();
        assertEquals(3, sample.length);
        for (double v : sample) {
            assertFalse(Double.isNaN(v));
            assertFalse(Double.isInfinite(v));
        }
    }

    @Test
    public void testSampleWithNonZeroMeanProducesFiniteValues() {
        double[] means = {10.0, -5.0};
        double[][] covariances = {{2.0, 0.5}, {0.5, 2.0}};
        MultivariateNormalDistribution dist =
                new MultivariateNormalDistribution(new Well19937c(7), means, covariances);

        double[] sample = dist.sample();
        assertEquals(2, sample.length);
        assertFalse(Double.isNaN(sample[0]));
        assertFalse(Double.isNaN(sample[1]));
    }

    // ---------- boundary case: 1x1 covariance matrix (ขั้นต่ำสุด) ----------

    @Test
    public void testConstructorWithSingleDimension() {
        double[] means = {3.0};
        double[][] covariances = {{5.0}};
        MultivariateNormalDistribution dist =
                new MultivariateNormalDistribution(means, covariances);
        assertEquals(1, dist.getMeans().length);
        assertEquals(3.0, dist.getMeans()[0], EPS);
    }

    // ---------- null input: ไม่มีการป้องกันใน source -> คาด NullPointerException ----------

    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullMeansThrowsNPE() {
        // means.length จะถูกเรียกใน super(...) -> NPE ทันที (ไม่มี guard ใน source)
        new MultivariateNormalDistribution(null, new double[][] {{1.0}});
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullCovariancesThrowsNPE() {
        // covariances.length ถูกเรียกในบรรทัดตรวจ dim -> NPE
        new MultivariateNormalDistribution(new double[] {0.0}, null);
    }
}
