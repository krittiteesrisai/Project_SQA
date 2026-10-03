package org.apache.commons.math3.distribution;

import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.random.Well19937c;
import org.junit.Assert;
import org.junit.Test;

public class HypergeometricDistributionTest {

    private static final double EPSILON = 1e-12;

    // =========================================================================
    // Constructor Validation & Exception Branches
    // =========================================================================

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorPopulationSizeZero() {
        new HypergeometricDistribution(0, 0, 0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorPopulationSizeNegative() {
        new HypergeometricDistribution(-10, 5, 2);
    }

    @Test(expected = NotPositiveException.class)
    public void testConstructorNumberOfSuccessesNegative() {
        new HypergeometricDistribution(10, -1, 2);
    }

    @Test(expected = NotPositiveException.class)
    public void testConstructorSampleSizeNegative() {
        new HypergeometricDistribution(10, 5, -1);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testConstructorSuccessesLargerThanPopulation() {
        new HypergeometricDistribution(10, 11, 5);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testConstructorSampleSizeLargerThanPopulation() {
        new HypergeometricDistribution(10, 5, 11);
    }

    @Test
    public void testConstructorWithRandomGenerator() {
        Well19937c rng = new Well19937c(123456L);
        HypergeometricDistribution dist = new HypergeometricDistribution(rng, 10, 5, 3);
        Assert.assertEquals(10, dist.getPopulationSize());
        Assert.assertEquals(5, dist.getNumberOfSuccesses());
        Assert.assertEquals(3, dist.getSampleSize());
    }

    // =========================================================================
    // Getters & Support Bounds
    // =========================================================================

    @Test
    public void testGettersAndSupportProperties() {
        HypergeometricDistribution dist = new HypergeometricDistribution(100, 30, 20);
        Assert.assertEquals(100, dist.getPopulationSize());
        Assert.assertEquals(30, dist.getNumberOfSuccesses());
        Assert.assertEquals(20, dist.getSampleSize());

        // Support lower bound: max(0, 20 + 30 - 100) = 0
        Assert.assertEquals(0, dist.getSupportLowerBound());
        // Support upper bound: min(30, 20) = 20
        Assert.assertEquals(20, dist.getSupportUpperBound());
        Assert.assertTrue(dist.isSupportConnected());

        // Support with non-zero lower bound: N=10, m=7, n=5 -> lower = max(0, 7+5-10) = 2
        HypergeometricDistribution dist2 = new HypergeometricDistribution(10, 7, 5);
        Assert.assertEquals(2, dist2.getSupportLowerBound());
        Assert.assertEquals(5, dist2.getSupportUpperBound());
    }

    // =========================================================================
    // Probability Mass Function (PMF) Branches
    // =========================================================================

    @Test
    public void testProbabilityOutsideDomain() {
        // N=10, m=5, n=3 -> domain = [0, 3]
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 3);
        Assert.assertEquals(0.0, dist.probability(-1), EPSILON);
        Assert.assertEquals(0.0, dist.probability(4), EPSILON);

        // N=10, m=7, n=6 -> domain = [3, 6]
        HypergeometricDistribution dist2 = new HypergeometricDistribution(10, 7, 6);
        Assert.assertEquals(0.0, dist2.probability(2), EPSILON);
        Assert.assertEquals(0.0, dist2.probability(7), EPSILON);
    }

    @Test
    public void testProbabilityInsideDomain() {
        // N=10, m=5, n=4
        // P(X=2) = (5C2 * 5C2) / 10C4 = (10 * 10) / 210 = 100 / 210 = 10/21
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 4);
        double expected = 100.0 / 210.0;
        Assert.assertEquals(expected, dist.probability(2), EPSILON);

        // Sum of all probabilities in support must be 1.0
        double totalProb = 0.0;
        for (int x = dist.getSupportLowerBound(); x <= dist.getSupportUpperBound(); x++) {
            totalProb += dist.probability(x);
        }
        Assert.assertEquals(1.0, totalProb, EPSILON);
    }

    // =========================================================================
    // Cumulative Probability (CDF) Branches
    // =========================================================================

    @Test
    public void testCumulativeProbabilityBranches() {
        // N=10, m=5, n=3 -> domain = [0, 3]
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 3);

        // Branch 1: x < domain[0]
        Assert.assertEquals(0.0, dist.cumulativeProbability(-1), EPSILON);
        Assert.assertEquals(0.0, dist.cumulativeProbability(-100), EPSILON);

        // Branch 2: x >= domain[1]
        Assert.assertEquals(1.0, dist.cumulativeProbability(3), EPSILON);
        Assert.assertEquals(1.0, dist.cumulativeProbability(5), EPSILON);

        // Branch 3: domain[0] <= x < domain[1] (inner cumulative loop)
        double p0 = dist.probability(0);
        double p1 = dist.probability(1);
        Assert.assertEquals(p0, dist.cumulativeProbability(0), EPSILON);
        Assert.assertEquals(p0 + p1, dist.cumulativeProbability(1), EPSILON);
    }

    // =========================================================================
    // Upper Cumulative Probability Branches
    // =========================================================================

    @Test
    public void testUpperCumulativeProbabilityBranches() {
        // N=10, m=7, n=5 -> domain = [2, 5]
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 7, 5);

        // Branch 1: x <= domain[0]
        Assert.assertEquals(1.0, dist.upperCumulativeProbability(2), EPSILON);
        Assert.assertEquals(1.0, dist.upperCumulativeProbability(0), EPSILON);
        Assert.assertEquals(1.0, dist.upperCumulativeProbability(-5), EPSILON);

        // Branch 2: x > domain[1]
        Assert.assertEquals(0.0, dist.upperCumulativeProbability(6), EPSILON);
        Assert.assertEquals(0.0, dist.upperCumulativeProbability(10), EPSILON);

        // Branch 3: domain[0] < x <= domain[1] (inner cumulative loop in reverse)
        double p4 = dist.probability(4);
        double p5 = dist.probability(5);
        Assert.assertEquals(p5, dist.upperCumulativeProbability(5), EPSILON);
        Assert.assertEquals(p4 + p5, dist.upperCumulativeProbability(4), EPSILON);
    }

    // =========================================================================
    // Mean and Numerical Variance Calculations (Including Caching & Large Values)
    // =========================================================================

    @Test
    public void testNumericalMeanAndVariance() {
        // N=100, m=30, n=20
        HypergeometricDistribution dist = new HypergeometricDistribution(100, 30, 20);
        // Mean = n * m / N = 20 * 30 / 100 = 6.0
        Assert.assertEquals(6.0, dist.getNumericalMean(), EPSILON);

        // Variance = [n * m * (N - n) * (N - m)] / [N^2 * (N - 1)]
        // = [20 * 30 * 80 * 70] / [10000 * 99] = 3360000 / 990000 = 336 / 99 = 3.393939393939...
        double expectedVariance = 336.0 / 99.0;
        Assert.assertEquals(expectedVariance, dist.getNumericalVariance(), EPSILON);

        // Call again to test cached variance branch (numericalVarianceIsCalculated == true)
        Assert.assertEquals(expectedVariance, dist.getNumericalVariance(), EPSILON);
    }

    @Test
    public void testLargeValuesNumericalMeanOverflow() {
        // Edge case: Large numbers to detect Integer Overflow bugs
        int N = 3000000;
        int m = 2000000;
        int n = 1500000;
        HypergeometricDistribution dist = new HypergeometricDistribution(N, m, n);

        double expectedMean = ((double) n * (double) m) / (double) N; // 1,000,000.0
        Assert.assertEquals(expectedMean, dist.getNumericalMean(), EPSILON);
        Assert.assertTrue("Numerical mean should be positive", dist.getNumericalMean() > 0);
    }

    // =========================================================================
    // Boundary & Degenerate Cases
    // =========================================================================

    @Test
    public void testDegenerateZeroSuccessesOrSamples() {
        // N=10, m=0, n=5 -> All outcomes are 0 successes
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 0, 5);
        Assert.assertEquals(1.0, dist.probability(0), EPSILON);
        Assert.assertEquals(0.0, dist.probability(1), EPSILON);
        Assert.assertEquals(0.0, dist.getNumericalMean(), EPSILON);
        Assert.assertEquals(0.0, dist.getNumericalVariance(), EPSILON);

        // N=10, m=5, n=0 -> Sample size 0
        HypergeometricDistribution dist2 = new HypergeometricDistribution(10, 5, 0);
        Assert.assertEquals(1.0, dist2.probability(0), EPSILON);
        Assert.assertEquals(0.0, dist2.getNumericalMean(), EPSILON);
        Assert.assertEquals(0.0, dist2.getNumericalVariance(), EPSILON);
    }

    @Test
    public void testFullPopulationSample() {
        // N=10, m=6, n=10 -> Sample all items
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 6, 10);
        Assert.assertEquals(1.0, dist.probability(6), EPSILON);
        Assert.assertEquals(0.0, dist.probability(5), EPSILON);
        Assert.assertEquals(6.0, dist.getNumericalMean(), EPSILON);
        Assert.assertEquals(0.0, dist.getNumericalVariance(), EPSILON);
    }
}