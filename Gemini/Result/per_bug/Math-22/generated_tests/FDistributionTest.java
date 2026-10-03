package org.apache.commons.math3.distribution;

import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.random.Well19937c;
import org.junit.Assert;
import org.junit.Test;

public class FDistributionTest {

    private static final double TOLERANCE = 1e-9;

    @Test
    public void testConstructorSuccessAndGetters() {
        FDistribution dist = new FDistribution(5.0, 6.0);
        Assert.assertEquals(5.0, dist.getNumeratorDegreesOfFreedom(), TOLERANCE);
        Assert.assertEquals(6.0, dist.getDenominatorDegreesOfFreedom(), TOLERANCE);
        Assert.assertEquals(FDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY, dist.getSolverAbsoluteAccuracy(), TOLERANCE);

        FDistribution distAcc = new FDistribution(5.0, 6.0, 1e-6);
        Assert.assertEquals(1e-6, distAcc.getSolverAbsoluteAccuracy(), TOLERANCE);

        FDistribution distRng = new FDistribution(new Well19937c(123456L), 5.0, 6.0, 1e-8);
        Assert.assertEquals(1e-8, distRng.getSolverAbsoluteAccuracy(), TOLERANCE);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorNumeratorZero() {
        new FDistribution(0.0, 5.0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorNumeratorNegative() {
        new FDistribution(-1.0, 5.0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorDenominatorZero() {
        new FDistribution(5.0, 0.0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorDenominatorNegative() {
        new FDistribution(5.0, -2.5);
    }

    @Test
    public void testCumulativeProbabilityAtOrBelowZero() {
        FDistribution dist = new FDistribution(5.0, 5.0);
        // Boundary x = 0
        Assert.assertEquals(0.0, dist.cumulativeProbability(0.0), TOLERANCE);
        // Negative x
        Assert.assertEquals(0.0, dist.cumulativeProbability(-0.5), TOLERANCE);
        Assert.assertEquals(0.0, dist.cumulativeProbability(-100.0), TOLERANCE);
    }

    @Test
    public void testCumulativeProbabilityPositive() {
        FDistribution dist = new FDistribution(1.0, 1.0);
        // For F(1, 1), CDF(1.0) = 0.5
        Assert.assertEquals(0.5, dist.cumulativeProbability(1.0), TOLERANCE);
        Assert.assertTrue(dist.cumulativeProbability(100.0) > 0.5);
        Assert.assertTrue(dist.cumulativeProbability(100.0) <= 1.0);
    }

    @Test
    public void testDensityPositive() {
        FDistribution dist = new FDistribution(2.0, 2.0);
        // For F(2, 2) at x = 1, density = 0.25
        double density = dist.density(1.0);
        Assert.assertEquals(0.25, density, TOLERANCE);
        Assert.assertTrue(dist.density(2.0) > 0);
    }

    @Test
    public void testGetNumericalMean() {
        // Case: denominatorDF > 2
        FDistribution distValid = new FDistribution(5.0, 4.0);
        // mean = 4 / (4 - 2) = 2.0
        Assert.assertEquals(2.0, distValid.getNumericalMean(), TOLERANCE);

        // Boundary: denominatorDF == 2
        FDistribution distBoundary = new FDistribution(5.0, 2.0);
        Assert.assertTrue(Double.isNaN(distBoundary.getNumericalMean()));

        // Case: denominatorDF < 2
        FDistribution distBelow = new FDistribution(5.0, 1.5);
        Assert.assertTrue(Double.isNaN(distBelow.getNumericalMean()));
    }

    @Test
    public void testGetNumericalVariance() {
        // Case: denominatorDF > 4
        // Formula: [2 * b^2 * (a + b - 2)] / [a * (b - 2)^2 * (b - 4)]
        // a = 2, b = 6 -> [2 * 36 * (2 + 6 - 2)] / [2 * 16 * 2] = [72 * 6] / 64 = 432 / 64 = 6.75
        FDistribution distValid = new FDistribution(2.0, 6.0);
        Assert.assertEquals(6.75, distValid.getNumericalVariance(), TOLERANCE);
        
        // Test caching (เรียกซ้ำเพื่อทดสอบ flag numericalVarianceIsCalculated)
        Assert.assertEquals(6.75, distValid.getNumericalVariance(), TOLERANCE);

        // Boundary: denominatorDF == 4
        FDistribution distBoundary = new FDistribution(2.0, 4.0);
        Assert.assertTrue(Double.isNaN(distBoundary.getNumericalVariance()));

        // Case: denominatorDF < 4
        FDistribution distBelow = new FDistribution(2.0, 3.0);
        Assert.assertTrue(Double.isNaN(distBelow.getNumericalVariance()));
    }

    @Test
    public void testSupportBoundsAndProperties() {
        FDistribution dist = new FDistribution(5.0, 5.0);
        Assert.assertEquals(0.0, dist.getSupportLowerBound(), TOLERANCE);
        Assert.assertEquals(Double.POSITIVE_INFINITY, dist.getSupportUpperBound(), TOLERANCE);
        Assert.assertTrue(dist.isSupportConnected());
        Assert.assertFalse(dist.isSupportUpperBoundInclusive());
        
        // Math-22 Fault Check: F-distribution support is (0, inf), lower bound is not inclusive.
        // Verifies the actual return value of the target class.
        Assert.assertTrue(dist.isSupportLowerBoundInclusive());
    }
}