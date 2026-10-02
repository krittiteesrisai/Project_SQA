package org.apache.commons.math.distribution;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.commons.math.MathException;
import org.apache.commons.math.exception.NotStrictlyPositiveException;
import org.apache.commons.math.exception.OutOfRangeException;
import org.apache.commons.math.util.FastMath;
import org.junit.Test;

/**
 * JUnit4 tests for {@link NormalDistributionImpl}.
 */
public class NormalDistributionImplTest {

    private static final double EPS = 1e-9;

    // ---------------------------------------------------------------
    // Constructor tests
    // ---------------------------------------------------------------

    @Test
    public void testConstructorValidParameters() {
        NormalDistributionImpl dist = new NormalDistributionImpl(5.0, 2.0);
        assertEquals(5.0, dist.getMean(), EPS);
        assertEquals(2.0, dist.getStandardDeviation(), EPS);
    }

    @Test
    public void testConstructorWithAccuracy() {
        double accuracy = 1e-6;
        NormalDistributionImpl dist = new NormalDistributionImpl(1.0, 1.0, accuracy);
        assertEquals(accuracy, dist.getSolverAbsoluteAccuracy(), EPS);
    }

    @Test
    public void testDefaultConstructor() {
        NormalDistributionImpl dist = new NormalDistributionImpl();
        assertEquals(0.0, dist.getMean(), EPS);
        assertEquals(1.0, dist.getStandardDeviation(), EPS);
        assertEquals(NormalDistributionImpl.DEFAULT_INVERSE_ABSOLUTE_ACCURACY,
                dist.getSolverAbsoluteAccuracy(), EPS);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorZeroStandardDeviation() {
        new NormalDistributionImpl(0.0, 0.0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorNegativeStandardDeviation() {
        new NormalDistributionImpl(0.0, -1.0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorThreeArgNegativeSd() {
        new NormalDistributionImpl(0.0, -5.0, 1e-9);
    }

    // ---------------------------------------------------------------
    // density(x) tests
    // ---------------------------------------------------------------

    @Test
    public void testDensityAtMean() {
        NormalDistributionImpl dist = new NormalDistributionImpl(0.0, 1.0);
        double expected = 1.0 / FastMath.sqrt(2 * FastMath.PI);
        assertEquals(expected, dist.density(0.0), 1e-10);
    }

    @Test
    public void testDensitySymmetricAroundMean() {
        NormalDistributionImpl dist = new NormalDistributionImpl(2.0, 3.0);
        double dPlus = dist.density(2.0 + 1.5);
        double dMinus = dist.density(2.0 - 1.5);
        assertEquals(dPlus, dMinus, 1e-10);
    }

    @Test
    public void testDensityStandardNormalKnownValue() {
        NormalDistributionImpl dist = new NormalDistributionImpl(0.0, 1.0);
        // known standard normal density at x=0
        assertEquals(0.3989422804014327, dist.density(0.0), 1e-10);
    }

    @Test
    public void testDensityFarFromMeanIsNearZero() {
        NormalDistributionImpl dist = new NormalDistributionImpl(0.0, 1.0);
        double d = dist.density(100.0);
        assertTrue(d >= 0.0 && d < 1e-10);
    }

    // ---------------------------------------------------------------
    // cumulativeProbability(x) tests
    // ---------------------------------------------------------------

    @Test
    public void testCumulativeProbabilityAtMean() throws MathException {
        NormalDistributionImpl dist = new NormalDistributionImpl(5.0, 2.0);
        assertEquals(0.5, dist.cumulativeProbability(5.0), 1e-9);
    }

    @Test
    public void testCumulativeProbabilityStandardKnownValue() throws MathException {
        NormalDistributionImpl dist = new NormalDistributionImpl(0.0, 1.0);
        // P(X < 1.959963985) ~ 0.975 for standard normal
        assertEquals(0.975, dist.cumulativeProbability(1.959963985), 1e-6);
    }

    @Test
    public void testCumulativeProbabilitySymmetry() throws MathException {
        NormalDistributionImpl dist = new NormalDistributionImpl(0.0, 1.0);
        double cdfPlus = dist.cumulativeProbability(1.0);
        double cdfMinus = dist.cumulativeProbability(-1.0);
        assertEquals(1.0, cdfPlus + cdfMinus, 1e-9);
    }

    @Test
    public void testCumulativeProbabilityFarBelowMean() throws MathException {
        // x much lower than mean; expect value close to 0
        NormalDistributionImpl dist = new NormalDistributionImpl(0.0, 1.0);
        double cdf = dist.cumulativeProbability(-10.0);
        assertTrue(cdf >= 0.0 && cdf < 1e-6);
    }

    @Test
    public void testCumulativeProbabilityFarAboveMean() throws MathException {
        // x much higher than mean; expect value close to 1
        NormalDistributionImpl dist = new NormalDistributionImpl(0.0, 1.0);
        double cdf = dist.cumulativeProbability(10.0);
        assertTrue(cdf <= 1.0 && cdf > 1.0 - 1e-6);
    }

    // NOTE: branch "catch (MaxIterationsExceededException ex)" ภายใน cumulativeProbability
    // ไม่สามารถ trigger ได้ด้วยอินพุตปกติจาก unit test ระดับนี้
    // (ขึ้นกับ internal convergence ของ Erf.erf ซึ่งควบคุมไม่ได้โดยตรง)
    // จึงไม่ครอบคลุม branch ย่อยภายใน catch (if x<mean-20sd / x>mean+20sd / else throw)

    // ---------------------------------------------------------------
    // inverseCumulativeProbability(p) tests
    // ---------------------------------------------------------------

    @Test
    public void testInverseCumulativeProbabilityZero() throws MathException {
        NormalDistributionImpl dist = new NormalDistributionImpl(3.0, 1.0);
        assertEquals(Double.NEGATIVE_INFINITY, dist.inverseCumulativeProbability(0.0), 0.0);
    }

    @Test
    public void testInverseCumulativeProbabilityOne() throws MathException {
        NormalDistributionImpl dist = new NormalDistributionImpl(3.0, 1.0);
        assertEquals(Double.POSITIVE_INFINITY, dist.inverseCumulativeProbability(1.0), 0.0);
    }

    @Test
    public void testInverseCumulativeProbabilityHalf() throws MathException {
        NormalDistributionImpl dist = new NormalDistributionImpl(4.0, 2.0);
        // p=0.5 should invert back close to the mean
        assertEquals(4.0, dist.inverseCumulativeProbability(0.5), 1e-6);
    }

    @Test
    public void testInverseCumulativeProbabilityMidRange() throws MathException {
        NormalDistributionImpl dist = new NormalDistributionImpl(0.0, 1.0);
        double x = dist.inverseCumulativeProbability(0.975);
        assertEquals(1.959963985, x, 1e-4);
    }

    // Behavior อ้างอิงจาก Javadoc ของ inverseCumulativeProbability:
    // "@throws OutOfRangeException if p is not a valid probability"
    // แต่ validation logic อยู่ใน superclass ซึ่งไม่อยู่ใน source ที่ให้มา
    @Test(expected = OutOfRangeException.class)
    public void testInverseCumulativeProbabilityBelowZeroThrows() throws MathException {
        NormalDistributionImpl dist = new NormalDistributionImpl(0.0, 1.0);
        dist.inverseCumulativeProbability(-0.1);
    }

    @Test(expected = OutOfRangeException.class)
    public void testInverseCumulativeProbabilityAboveOneThrows() throws MathException {
        NormalDistributionImpl dist = new NormalDistributionImpl(0.0, 1.0);
        dist.inverseCumulativeProbability(1.1);
    }

    // ---------------------------------------------------------------
    // getDomainLowerBound(p) tests  (protected method, same package access)
    // ---------------------------------------------------------------

    @Test
    public void testGetDomainLowerBound_pLessThanHalf() {
        NormalDistributionImpl dist = new NormalDistributionImpl(10.0, 2.0);
        assertEquals(-Double.MAX_VALUE, dist.getDomainLowerBound(0.3), 0.0);
    }

    @Test
    public void testGetDomainLowerBound_pEqualsHalf() {
        NormalDistributionImpl dist = new NormalDistributionImpl(10.0, 2.0);
        // p == 0.5 falls into else branch (not < 0.5)
        assertEquals(10.0, dist.getDomainLowerBound(0.5), 0.0);
    }

    @Test
    public void testGetDomainLowerBound_pGreaterThanHalf() {
        NormalDistributionImpl dist = new NormalDistributionImpl(10.0, 2.0);
        assertEquals(10.0, dist.getDomainLowerBound(0.7), 0.0);
    }

    // ---------------------------------------------------------------
    // getDomainUpperBound(p) tests
    // ---------------------------------------------------------------

    @Test
    public void testGetDomainUpperBound_pLessThanHalf() {
        NormalDistributionImpl dist = new NormalDistributionImpl(5.0, 1.0);
        assertEquals(5.0, dist.getDomainUpperBound(0.2), 0.0);
    }

    @Test
    public void testGetDomainUpperBound_pEqualsHalf() {
        NormalDistributionImpl dist = new NormalDistributionImpl(5.0, 1.0);
        // p == 0.5 falls into else branch (not < 0.5)
        assertEquals(Double.MAX_VALUE, dist.getDomainUpperBound(0.5), 0.0);
    }

    @Test
    public void testGetDomainUpperBound_pGreaterThanHalf() {
        NormalDistributionImpl dist = new NormalDistributionImpl(5.0, 1.0);
        assertEquals(Double.MAX_VALUE, dist.getDomainUpperBound(0.8), 0.0);
    }

    // ---------------------------------------------------------------
    // getInitialDomain(p) tests
    // ---------------------------------------------------------------

    @Test
    public void testGetInitialDomain_pLessThanHalf() {
        NormalDistributionImpl dist = new NormalDistributionImpl(6.0, 2.0);
        assertEquals(4.0, dist.getInitialDomain(0.25), EPS); // mean - sd
    }

    @Test
    public void testGetInitialDomain_pGreaterThanHalf() {
        NormalDistributionImpl dist = new NormalDistributionImpl(6.0, 2.0);
        assertEquals(8.0, dist.getInitialDomain(0.75), EPS); // mean + sd
    }

    @Test
    public void testGetInitialDomain_pEqualsHalf() {
        NormalDistributionImpl dist = new NormalDistributionImpl(6.0, 2.0);
        assertEquals(6.0, dist.getInitialDomain(0.5), EPS); // else branch: mean
    }

    // ---------------------------------------------------------------
    // sample() smoke test
    // ---------------------------------------------------------------

    @Test
    public void testSampleReturnsFiniteValue() throws MathException {
        NormalDistributionImpl dist = new NormalDistributionImpl(0.0, 1.0);
        double sample = dist.sample();
        assertTrue(!Double.isNaN(sample));
        assertTrue(!Double.isInfinite(sample));
    }

    // ---------------------------------------------------------------
    // getMean()/getStandardDeviation() direct getter tests (boundary / edge values)
    // ---------------------------------------------------------------

    @Test
    public void testGetMeanNegativeValue() {
        NormalDistributionImpl dist = new NormalDistributionImpl(-5.5, 1.0);
        assertEquals(-5.5, dist.getMean(), EPS);
    }

    @Test
    public void testGetStandardDeviationSmallPositiveValue() {
        NormalDistributionImpl dist = new NormalDistributionImpl(0.0, 1e-6);
        assertEquals(1e-6, dist.getStandardDeviation(), 1e-12);
    }
}
