package org.apache.commons.math.distribution;

import org.apache.commons.math.MathException;
import org.apache.commons.math.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

/**
 * High-coverage unit test suite for {@link PoissonDistributionImpl}.
 * Targets branch coverage, boundary conditions, and exception scenarios.
 */
public class PoissonDistributionImplTest {

    private static final double TOLERANCE = 1E-12;

    // -------------------------------------------------------------------------
    // Constructor Tests & Validation
    // -------------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNonPositiveMeanZero() {
        new PoissonDistributionImpl(0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNegativeMean() {
        new PoissonDistributionImpl(-1.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNegativeMeanWithAllArgs() {
        new PoissonDistributionImpl(-5.0, 1e-10, 100);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNegativeInfinity() {
        new PoissonDistributionImpl(Double.NEGATIVE_INFINITY);
    }

    @Test
    public void testConstructorVariationsAndGetMean() {
        double mean = 4.0;
        
        // 1-arg constructor
        PoissonDistribution dist1 = new PoissonDistributionImpl(mean);
        Assert.assertEquals(mean, dist1.getMean(), TOLERANCE);

        // 2-arg constructor (mean, epsilon)
        PoissonDistribution dist2 = new PoissonDistributionImpl(mean, 1e-8);
        Assert.assertEquals(mean, dist2.getMean(), TOLERANCE);

        // 2-arg constructor (mean, maxIterations)
        PoissonDistribution dist3 = new PoissonDistributionImpl(mean, 5000);
        Assert.assertEquals(mean, dist3.getMean(), TOLERANCE);

        // 3-arg constructor (mean, epsilon, maxIterations)
        PoissonDistribution dist4 = new PoissonDistributionImpl(mean, 1e-8, 5000);
        Assert.assertEquals(mean, dist4.getMean(), TOLERANCE);
    }

    @Test
    public void testConstructorVerySmallPositiveMean() {
        PoissonDistribution dist = new PoissonDistributionImpl(Double.MIN_VALUE);
        Assert.assertEquals(Double.MIN_VALUE, dist.getMean(), 0.0);
    }

    // -------------------------------------------------------------------------
    // Probability Mass Function: probability(int x) Tests
    // -------------------------------------------------------------------------

    @Test
    public void testProbabilityNegativeX() {
        PoissonDistribution dist = new PoissonDistributionImpl(3.0);
        Assert.assertEquals(0.0, dist.probability(-1), 0.0);
        Assert.assertEquals(0.0, dist.probability(Integer.MIN_VALUE), 0.0);
    }

    @Test
    public void testProbabilityMaxIntegerX() {
        PoissonDistribution dist = new PoissonDistributionImpl(3.0);
        Assert.assertEquals(0.0, dist.probability(Integer.MAX_VALUE), 0.0);
    }

    @Test
    public void testProbabilityZeroX() {
        double mean = 2.5;
        PoissonDistribution dist = new PoissonDistributionImpl(mean);
        double expected = FastMath.exp(-mean);
        Assert.assertEquals(expected, dist.probability(0), TOLERANCE);
    }

    @Test
    public void testProbabilityPositiveX() {
        // Poisson PMF: P(X = k) = (lambda^k * exp(-lambda)) / k!
        // For lambda = 2.0, k = 1 => 2 * exp(-2) = 0.2706705664732254
        // For lambda = 2.0, k = 2 => (4 * exp(-2)) / 2 = 0.2706705664732254
        // For lambda = 2.0, k = 3 => (8 * exp(-2)) / 6 = 0.1804470443154836
        PoissonDistribution dist = new PoissonDistributionImpl(2.0);

        Assert.assertEquals(0.2706705664732254, dist.probability(1), 1E-10);
        Assert.assertEquals(0.2706705664732254, dist.probability(2), 1E-10);
        Assert.assertEquals(0.1804470443154836, dist.probability(3), 1E-10);
    }

    @Test
    public void testProbabilityLargeMeanAndX() {
        // Test SaddlePointExpansion behavior on large inputs
        PoissonDistribution dist = new PoissonDistributionImpl(100.0);
        double prob = dist.probability(100);
        Assert.assertTrue(prob > 0.0 && prob < 1.0);
    }

    // -------------------------------------------------------------------------
    // Cumulative Probability Tests: cumulativeProbability(int x)
    // -------------------------------------------------------------------------

    @Test
    public void testCumulativeProbabilityNegativeX() throws MathException {
        PoissonDistribution dist = new PoissonDistributionImpl(3.0);
        Assert.assertEquals(0.0, dist.cumulativeProbability(-1), 0.0);
        Assert.assertEquals(0.0, dist.cumulativeProbability(-100), 0.0);
        Assert.assertEquals(0.0, dist.cumulativeProbability(Integer.MIN_VALUE), 0.0);
    }

    @Test
    public void testCumulativeProbabilityMaxIntegerX() throws MathException {
        PoissonDistribution dist = new PoissonDistributionImpl(3.0);
        Assert.assertEquals(1.0, dist.cumulativeProbability(Integer.MAX_VALUE), 0.0);
    }

    @Test
    public void testCumulativeProbabilityZeroX() throws MathException {
        double mean = 2.0;
        PoissonDistribution dist = new PoissonDistributionImpl(mean);
        Assert.assertEquals(FastMath.exp(-mean), dist.cumulativeProbability(0), TOLERANCE);
    }

    @Test
    public void testCumulativeProbabilityStandard() throws MathException {
        // For lambda = 1.0:
        // P(X <= 0) = exp(-1) = 0.36787944117144233
        // P(X <= 1) = exp(-1) + exp(-1) = 0.7357588823428847
        PoissonDistribution dist = new PoissonDistributionImpl(1.0);
        Assert.assertEquals(0.36787944117144233, dist.cumulativeProbability(0), TOLERANCE);
        Assert.assertEquals(0.7357588823428847, dist.cumulativeProbability(1), TOLERANCE);
    }

    @Test(expected = MathException.class)
    public void testCumulativeProbabilityConvergenceFailure() throws MathException {
        // Force convergence failure using maxIterations = 1
        PoissonDistribution dist = new PoissonDistributionImpl(100.0, 1E-15, 1);
        dist.cumulativeProbability(50);
    }

    @Test
    public void testCumulativeProbabilityInterval() throws MathException {
        PoissonDistribution dist = new PoissonDistributionImpl(3.0);
        double p0to2 = dist.cumulativeProbability(0, 2);
        double expected = dist.probability(1) + dist.probability(2);
        Assert.assertEquals(expected, p0to2, 1E-10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCumulativeProbabilityInvalidInterval() throws MathException {
        PoissonDistribution dist = new PoissonDistributionImpl(3.0);
        dist.cumulativeProbability(5, 2);
    }

    // -------------------------------------------------------------------------
    // Normal Approximation Tests
    // -------------------------------------------------------------------------

    @Test
    public void testNormalApproximateProbability() throws MathException {
        PoissonDistribution dist = new PoissonDistributionImpl(100.0);
        // For lambda = 100, variance = 100, stddev = 10
        // Normal approximation at x = 100 with half correction evaluates at 100.5 -> (100.5 - 100) / 10 = 0.05
        double approxProb = dist.normalApproximateProbability(100);
        Assert.assertTrue(approxProb > 0.5 && approxProb < 0.6);

        // Approximation for extreme values
        Assert.assertTrue(dist.normalApproximateProbability(-50) < 1E-5);
        Assert.assertTrue(dist.normalApproximateProbability(200) > 0.999);
    }

    // -------------------------------------------------------------------------
    // Domain Bounds and Inverse Cumulative Probability Tests
    // -------------------------------------------------------------------------

    @Test
    public void testDomainBounds() {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(5.0);
        Assert.assertEquals(0, dist.getDomainLowerBound(0.5));
        Assert.assertEquals(Integer.MAX_VALUE, dist.getDomainUpperBound(0.5));
    }

    @Test
    public void testInverseCumulativeProbability() throws MathException {
        PoissonDistribution dist = new PoissonDistributionImpl(2.0);

        Assert.assertEquals(0, dist.inverseCumulativeProbability(0.0));
        Assert.assertEquals(Integer.MAX_VALUE, dist.inverseCumulativeProbability(1.0));

        // For lambda = 2.0: P(X <= 0) ~ 0.1353, P(X <= 1) ~ 0.4060
        Assert.assertEquals(0, dist.inverseCumulativeProbability(0.10));
        Assert.assertEquals(1, dist.inverseCumulativeProbability(0.20));
        Assert.assertEquals(1, dist.inverseCumulativeProbability(0.40));
        Assert.assertEquals(2, dist.inverseCumulativeProbability(0.50));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInverseCumulativeProbabilityNegativeP() throws MathException {
        PoissonDistribution dist = new PoissonDistributionImpl(2.0);
        dist.inverseCumulativeProbability(-0.1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInverseCumulativeProbabilityGreaterThanOne() throws MathException {
        PoissonDistribution dist = new PoissonDistributionImpl(2.0);
        dist.inverseCumulativeProbability(1.1);
    }

    // -------------------------------------------------------------------------
    // Sampling Tests
    // -------------------------------------------------------------------------

    @Test
    public void testSample() throws MathException {
        PoissonDistribution dist = new PoissonDistributionImpl(4.0);
        dist.reSeed(42L);

        for (int i = 0; i < 100; i++) {
            int val = dist.sample();
            Assert.assertTrue("Sample must be non-negative", val >= 0);
            Assert.assertTrue("Sample must be <= Integer.MAX_VALUE", val <= Integer.MAX_VALUE);
        }
    }

    @Test
    public void testSampleLargeMean() throws MathException {
        // Tests Devroye rejection sampling branch for large means (mean >= 12.0)
        PoissonDistribution dist = new PoissonDistributionImpl(50.0);
        dist.reSeed(999L);

        for (int i = 0; i < 50; i++) {
            int val = dist.sample();
            Assert.assertTrue(val >= 0);
        }
    }
}