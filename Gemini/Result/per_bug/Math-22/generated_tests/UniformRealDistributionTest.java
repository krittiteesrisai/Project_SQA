package org.apache.commons.math3.distribution;

import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.random.Well19937c;
import org.junit.Assert;
import org.junit.Test;

/**
 * High-coverage unit tests for {@link UniformRealDistribution}.
 */
public class UniformRealDistributionTest {

    private static final double EPSILON = 1e-9;

    // -------------------------------------------------------------------------
    // Constructor Tests
    // -------------------------------------------------------------------------

    @Test
    public void testDefaultConstructor() {
        UniformRealDistribution dist = new UniformRealDistribution();
        Assert.assertEquals("Default lower bound should be 0.0", 0.0, dist.getSupportLowerBound(), EPSILON);
        Assert.assertEquals("Default upper bound should be 1.0", 1.0, dist.getSupportUpperBound(), EPSILON);
        Assert.assertEquals("Default accuracy should be 1e-9", UniformRealDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY,
                dist.getSolverAbsoluteAccuracy(), EPSILON);
    }

    @Test
    public void testTwoArgConstructor() {
        UniformRealDistribution dist = new UniformRealDistribution(-2.5, 3.5);
        Assert.assertEquals(-2.5, dist.getSupportLowerBound(), EPSILON);
        Assert.assertEquals(3.5, dist.getSupportUpperBound(), EPSILON);
        Assert.assertEquals(UniformRealDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY,
                dist.getSolverAbsoluteAccuracy(), EPSILON);
    }

    @Test
    public void testThreeArgConstructor() {
        UniformRealDistribution dist = new UniformRealDistribution(1.0, 5.0, 1e-6);
        Assert.assertEquals(1.0, dist.getSupportLowerBound(), EPSILON);
        Assert.assertEquals(5.0, dist.getSupportUpperBound(), EPSILON);
        Assert.assertEquals(1e-6, dist.getSolverAbsoluteAccuracy(), EPSILON);
    }

    @Test
    public void testFourArgConstructor() {
        Well19937c rng = new Well19937c(42L);
        UniformRealDistribution dist = new UniformRealDistribution(rng, -10.0, 10.0, 1e-5);
        Assert.assertEquals(-10.0, dist.getSupportLowerBound(), EPSILON);
        Assert.assertEquals(10.0, dist.getSupportUpperBound(), EPSILON);
        Assert.assertEquals(1e-5, dist.getSolverAbsoluteAccuracy(), EPSILON);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testConstructorLowerGreaterThanUpperThrowsException() {
        new UniformRealDistribution(5.0, 2.0);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testConstructorLowerEqualsUpperThrowsException() {
        new UniformRealDistribution(3.0, 3.0);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testFourArgConstructorInvalidBoundsThrowsException() {
        new UniformRealDistribution(new Well19937c(), 10.0, -1.0, 1e-9);
    }

    // -------------------------------------------------------------------------
    // Density Tests (Branch & Condition Coverage)
    // -------------------------------------------------------------------------

    @Test
    public void testDensityInsideSupport() {
        UniformRealDistribution dist = new UniformRealDistribution(2.0, 6.0);
        double expectedDensity = 1.0 / (6.0 - 2.0); // 0.25

        Assert.assertEquals(expectedDensity, dist.density(2.0), EPSILON);
        Assert.assertEquals(expectedDensity, dist.density(4.0), EPSILON);
        Assert.assertEquals(expectedDensity, dist.density(6.0), EPSILON);
    }

    @Test
    public void testDensityOutsideSupport() {
        UniformRealDistribution dist = new UniformRealDistribution(2.0, 6.0);

        Assert.assertEquals(0.0, dist.density(1.999999), EPSILON);
        Assert.assertEquals(0.0, dist.density(6.000001), EPSILON);
        Assert.assertEquals(0.0, dist.density(-100.0), EPSILON);
        Assert.assertEquals(0.0, dist.density(100.0), EPSILON);
    }

    // -------------------------------------------------------------------------
    // Cumulative Probability Tests (Branch Coverage)
    // -------------------------------------------------------------------------

    @Test
    public void testCumulativeProbabilityAtAndBelowLowerBound() {
        UniformRealDistribution dist = new UniformRealDistribution(2.0, 6.0);

        Assert.assertEquals(0.0, dist.cumulativeProbability(2.0), EPSILON);
        Assert.assertEquals(0.0, dist.cumulativeProbability(1.0), EPSILON);
        Assert.assertEquals(0.0, dist.cumulativeProbability(Double.NEGATIVE_INFINITY), EPSILON);
    }

    @Test
    public void testCumulativeProbabilityAtAndAboveUpperBound() {
        UniformRealDistribution dist = new UniformRealDistribution(2.0, 6.0);

        Assert.assertEquals(1.0, dist.cumulativeProbability(6.0), EPSILON);
        Assert.assertEquals(1.0, dist.cumulativeProbability(7.0), EPSILON);
        Assert.assertEquals(1.0, dist.cumulativeProbability(Double.POSITIVE_INFINITY), EPSILON);
    }

    @Test
    public void testCumulativeProbabilityInsideInterval() {
        UniformRealDistribution dist = new UniformRealDistribution(2.0, 6.0);

        Assert.assertEquals(0.25, dist.cumulativeProbability(3.0), EPSILON);
        Assert.assertEquals(0.50, dist.cumulativeProbability(4.0), EPSILON);
        Assert.assertEquals(0.75, dist.cumulativeProbability(5.0), EPSILON);
    }

    // -------------------------------------------------------------------------
    // Statistical Moments Tests
    // -------------------------------------------------------------------------

    @Test
    public void testNumericalMeanAndVariance() {
        UniformRealDistribution dist = new UniformRealDistribution(2.0, 8.0);

        // Mean = 0.5 * (2 + 8) = 5.0
        Assert.assertEquals(5.0, dist.getNumericalMean(), EPSILON);

        // Variance = (8 - 2)^2 / 12 = 36 / 12 = 3.0
        Assert.assertEquals(3.0, dist.getNumericalVariance(), EPSILON);
    }

    @Test
    public void testNumericalMeanAndVarianceNegativeBounds() {
        UniformRealDistribution dist = new UniformRealDistribution(-6.0, -2.0);

        Assert.assertEquals(-4.0, dist.getNumericalMean(), EPSILON);
        Assert.assertEquals(16.0 / 12.0, dist.getNumericalVariance(), EPSILON);
    }

    // -------------------------------------------------------------------------
    // Support Boundaries & Characteristics
    // -------------------------------------------------------------------------

    @Test
    public void testSupportBoundsAndConnectivity() {
        UniformRealDistribution dist = new UniformRealDistribution(-5.0, 15.0);

        Assert.assertEquals(-5.0, dist.getSupportLowerBound(), EPSILON);
        Assert.assertEquals(15.0, dist.getSupportUpperBound(), EPSILON);
        Assert.assertTrue("Support should be connected", dist.isSupportConnected());
        Assert.assertTrue("Lower bound inclusive flag check", dist.isSupportLowerBoundInclusive());
        Assert.assertFalse("Upper bound inclusive flag check", dist.isSupportUpperBoundInclusive());
    }

    // -------------------------------------------------------------------------
    // Inverse Cumulative Probability & Sampling Edge Cases
    // -------------------------------------------------------------------------

    @Test
    public void testInverseCumulativeProbability() {
        UniformRealDistribution dist = new UniformRealDistribution(2.0, 6.0);

        Assert.assertEquals(2.0, dist.inverseCumulativeProbability(0.0), EPSILON);
        Assert.assertEquals(4.0, dist.inverseCumulativeProbability(0.5), EPSILON);
        Assert.assertEquals(6.0, dist.inverseCumulativeProbability(1.0), EPSILON);
    }

    @Test(expected = OutOfRangeException.class)
    public void testInverseCumulativeProbabilityNegativeOutOfRange() {
        UniformRealDistribution dist = new UniformRealDistribution(0.0, 1.0);
        dist.inverseCumulativeProbability(-0.01);
    }

    @Test(expected = OutOfRangeException.class)
    public void testInverseCumulativeProbabilityGreaterThanOneOutOfRange() {
        UniformRealDistribution dist = new UniformRealDistribution(0.0, 1.0);
        dist.inverseCumulativeProbability(1.01);
    }

    @Test
    public void testSample() {
        Well19937c rng = new Well19937c(123456L);
        UniformRealDistribution dist = new UniformRealDistribution(rng, 10.0, 20.0, 1e-9);

        for (int i = 0; i < 1000; i++) {
            double sample = dist.sample();
            Assert.assertTrue("Sample must be >= lower bound", sample >= 10.0);
            Assert.assertTrue("Sample must be <= upper bound", sample <= 20.0);
        }
    }

    @Test
    public void testExtremeRange() {
        UniformRealDistribution dist = new UniformRealDistribution(-Double.MAX_VALUE / 2, Double.MAX_VALUE / 2);
        Assert.assertEquals(0.0, dist.getNumericalMean(), 1e-5);
        Assert.assertEquals(0.5, dist.cumulativeProbability(0.0), EPSILON);
    }
}