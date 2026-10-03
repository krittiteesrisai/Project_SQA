package org.apache.commons.math3.distribution;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.linear.NonPositiveDefiniteMatrixException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.stat.descriptive.moment.Mean;
import org.apache.commons.math3.stat.descriptive.moment.VectorialCovariance;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

/**
 * High-coverage unit tests for MultivariateNormalDistribution.
 * Targets edge cases, dimensional mismatch, non-positive definiteness,
 * defensive copying, and calculation accuracy (including Math-11 integer division bug).
 */
public class MultivariateNormalDistributionTest {

    private static final double TOLERANCE = 1e-9;

    /**
     * Test univariate case (dim = 1) to trigger and expose the integer division bug
     * where -dim / 2 evaluates to 0 instead of -0.5 when dim is odd (Math-11).
     */
    @Test
    public void testDensityUnivariateDimensionOne() {
        final double[] mu = { -1.5 };
        final double[][] sigma = { { 4.0 } }; // stdDev = 2.0
        final MultivariateNormalDistribution distribution = new MultivariateNormalDistribution(mu, sigma);

        final NormalDistribution univariateRef = new NormalDistribution(mu[0], FastMath.sqrt(sigma[0][0]));

        final double[] testPoints = { -3.5, -1.5, 0.0, 2.5 };
        for (double x : testPoints) {
            final double expected = univariateRef.density(x);
            final double actual = distribution.density(new double[] { x });
            Assert.assertEquals("Density calculation mismatch for 1-D case at x = " + x,
                    expected, actual, TOLERANCE);
        }
    }

    /**
     * Test density for a standard 2D multivariate normal distribution.
     */
    @Test
    public void testDensityBivariate() {
        final double[] mu = { 1.0, 2.0 };
        final double[][] sigma = {
            { 2.0, 0.5 },
            { 0.5, 3.0 }
        };
        final MultivariateNormalDistribution dist = new MultivariateNormalDistribution(mu, sigma);

        // Precalculated theoretical density at point [1.5, 2.5]
        // det(sigma) = 2*3 - 0.5^2 = 5.75
        // (2*pi)^(-2/2) * (5.75)^(-0.5) * exp(-0.5 * [0.5, 0.5] * sigma^-1 * [0.5, 0.5]^T)
        final double[] x = { 1.5, 2.5 };
        final double det = 2.0 * 3.0 - 0.5 * 0.5;
        final double normFactor = 1.0 / (2.0 * FastMath.PI * FastMath.sqrt(det));
        // Inverse matrix: [[3/5.75, -0.5/5.75], [-0.5/5.75, 2/5.75]]
        // centered = [0.5, 0.5]
        // exponent = -0.5 * (0.5 * (3*0.5 - 0.5*0.5)/5.75 + 0.5 * (-0.5*0.5 + 2*0.5)/5.75)
        // exponent = -0.5 * (0.5 * 1.25 + 0.5 * 0.75) / 5.75 = -0.5 * 1.0 / 5.75 = -0.5 / 5.75
        final double exponent = FastMath.exp(-0.5 / det);
        final double expected = normFactor * exponent;

        final double actual = dist.density(x);
        Assert.assertEquals(expected, actual, TOLERANCE);
    }

    /**
     * Branch coverage: DimensionMismatchException when covariance rows != means.length.
     */
    @Test(expected = DimensionMismatchException.class)
    public void testConstructorCovarianceRowCountMismatch() {
        final double[] mu = { 1.0, 2.0 };
        final double[][] sigma = {
            { 1.0, 0.0 }
        }; // 1 row, but mean has 2 dimensions
        new MultivariateNormalDistribution(mu, sigma);
    }

    /**
     * Branch coverage: DimensionMismatchException when covariance columns != means.length (ragged or non-square).
     */
    @Test(expected = DimensionMismatchException.class)
    public void testConstructorCovarianceColumnCountMismatch() {
        final double[] mu = { 1.0, 2.0 };
        final double[][] sigma = {
            { 1.0, 0.0, 0.0 }, // 3 columns
            { 0.0, 1.0 }
        };
        new MultivariateNormalDistribution(mu, sigma);
    }

    /**
     * Branch coverage: NonPositiveDefiniteMatrixException when an eigenvalue < 0.
     */
    @Test(expected = NonPositiveDefiniteMatrixException.class)
    public void testConstructorNonPositiveDefiniteCovariance() {
        final double[] mu = { 0.0, 0.0 };
        final double[][] sigma = {
            { 1.0, 2.0 },
            { 2.0, 1.0 } // Determinant = 1 - 4 = -3, eigenvalues are 3 and -1
        };
        new MultivariateNormalDistribution(mu, sigma);
    }

    /**
     * Branch coverage: DimensionMismatchException when density input dimension != distribution dimension.
     */
    @Test(expected = DimensionMismatchException.class)
    public void testDensityDimensionMismatch() {
        final double[] mu = { 0.0, 0.0 };
        final double[][] sigma = {
            { 1.0, 0.0 },
            { 0.0, 1.0 }
        };
        final MultivariateNormalDistribution dist = new MultivariateNormalDistribution(mu, sigma);
        dist.density(new double[] { 1.0, 2.0, 3.0 }); // 3 elements instead of 2
    }

    /**
     * Verify getter methods and defensive copying (Immutability check).
     */
    @Test
    public void testGettersAndDefensiveCopying() {
        final double[] mu = { 1.0, 3.0 };
        final double[][] sigma = {
            { 2.0, 0.5 },
            { 0.5, 4.0 }
        };
        final MultivariateNormalDistribution dist = new MultivariateNormalDistribution(mu, sigma);

        // Verify Means
        final double[] returnedMeans = dist.getMeans();
        Assert.assertArrayEquals(mu, returnedMeans, TOLERANCE);
        returnedMeans[0] = 999.0;
        Assert.assertEquals(1.0, dist.getMeans()[0], TOLERANCE); // Must not change internal state

        // Verify Covariances
        final RealMatrix returnedCov = dist.getCovariances();
        Assert.assertEquals(sigma[0][0], returnedCov.getEntry(0, 0), TOLERANCE);
        returnedCov.setEntry(0, 0, 999.0);
        Assert.assertEquals(2.0, dist.getCovariances().getEntry(0, 0), TOLERANCE); // Must not change

        // Verify Standard Deviations
        final double[] expectedStd = { FastMath.sqrt(2.0), FastMath.sqrt(4.0) };
        Assert.assertArrayEquals(expectedStd, dist.getStandardDeviations(), TOLERANCE);
    }

    /**
     * Test sampling behavior and ensure statistical properties converge.
     */
    @Test
    public void testSamplingStatistics() {
        final double[] mu = { 2.0, -3.0 };
        final double[][] sigma = {
            { 4.0, 1.2 },
            { 1.2, 9.0 }
        };
        final Well19937c rng = new Well19937c(42L);
        final MultivariateNormalDistribution dist = new MultivariateNormalDistribution(rng, mu, sigma);

        final int sampleSize = 20000;
        final double[][] samples = dist.sample(sampleSize);

        final Mean mean0 = new Mean();
        final Mean mean1 = new Mean();
        final VectorialCovariance cov = new VectorialCovariance(2, true);

        for (int i = 0; i < sampleSize; i++) {
            mean0.increment(samples[i][0]);
            mean1.increment(samples[i][1]);
            cov.increment(samples[i]);
        }

        Assert.assertEquals(mu[0], mean0.getResult(), 0.1);
        Assert.assertEquals(mu[1], mean1.getResult(), 0.1);

        final RealMatrix sampleCov = cov.getResult();
        Assert.assertEquals(sigma[0][0], sampleCov.getEntry(0, 0), 0.2);
        Assert.assertEquals(sigma[0][1], sampleCov.getEntry(0, 1), 0.2);
        Assert.assertEquals(sigma[1][1], sampleCov.getEntry(1, 1), 0.2);
    }

    /**
     * Boundary limit: Invalid sample size <= 0 should throw NotStrictlyPositiveException.
     */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testSampleInvalidSize() {
        final double[] mu = { 0.0 };
        final double[][] sigma = { { 1.0 } };
        final MultivariateNormalDistribution dist = new MultivariateNormalDistribution(mu, sigma);
        dist.sample(0);
    }
}