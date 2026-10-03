package org.apache.commons.math.distribution;

import org.apache.commons.math.MathException;
import org.apache.commons.math.exception.NotStrictlyPositiveException;
import org.apache.commons.math.exception.OutOfRangeException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * High-coverage unit test suite for {@link NormalDistributionImpl}.
 * Covers standard scenarios, edge cases, extreme values, and exception branches.
 */
public class NormalDistributionImplTest {

    private static final double TOLERANCE = 1e-7;
    private NormalDistributionImpl defaultDistribution;
    private NormalDistributionImpl customDistribution;

    @Before
    public void setUp() {
        defaultDistribution = new NormalDistributionImpl(); // mean = 0, sd = 1
        customDistribution = new NormalDistributionImpl(2.5, 1.5, 1e-9); // mean = 2.5, sd = 1.5
    }

    // -------------------------------------------------------------------------
    // 1. Constructor and Getter Tests
    // -------------------------------------------------------------------------

    @Test
    public void testDefaultConstructor() {
        NormalDistributionImpl dist = new NormalDistributionImpl();
        Assert.assertEquals(0.0, dist.getMean(), TOLERANCE);
        Assert.assertEquals(1.0, dist.getStandardDeviation(), TOLERANCE);
        Assert.assertEquals(NormalDistributionImpl.DEFAULT_INVERSE_ABSOLUTE_ACCURACY, 
                            dist.getSolverAbsoluteAccuracy(), TOLERANCE);
    }

    @Test
    public void testTwoArgConstructor() {
        NormalDistributionImpl dist = new NormalDistributionImpl(10.0, 2.0);
        Assert.assertEquals(10.0, dist.getMean(), TOLERANCE);
        Assert.assertEquals(2.0, dist.getStandardDeviation(), TOLERANCE);
        Assert.assertEquals(NormalDistributionImpl.DEFAULT_INVERSE_ABSOLUTE_ACCURACY, 
                            dist.getSolverAbsoluteAccuracy(), TOLERANCE);
    }

    @Test
    public void testThreeArgConstructorValid() {
        NormalDistributionImpl dist = new NormalDistributionImpl(-5.0, 0.5, 1e-6);
        Assert.assertEquals(-5.0, dist.getMean(), TOLERANCE);
        Assert.assertEquals(0.5, dist.getStandardDeviation(), TOLERANCE);
        Assert.assertEquals(1e-6, dist.getSolverAbsoluteAccuracy(), TOLERANCE);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorThrowsOnZeroStandardDeviation() {
        new NormalDistributionImpl(0.0, 0.0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorThrowsOnNegativeStandardDeviation() {
        new NormalDistributionImpl(0.0, -1.5);
    }

    // -------------------------------------------------------------------------
    // 2. Density Tests
    // -------------------------------------------------------------------------

    @Test
    public void testDensityStandardNormal() {
        // At mean (x = 0), density = 1 / sqrt(2 * PI) ~= 0.3989422804014327
        Assert.assertEquals(0.3989422804014327, defaultDistribution.density(0.0), TOLERANCE);
        
        // At x = 1 and x = -1 (symmetry check)
        double densityAt1 = defaultDistribution.density(1.0);
        double densityAtMinus1 = defaultDistribution.density(-1.0);
        Assert.assertEquals(densityAt1, densityAtMinus1, TOLERANCE);
        Assert.assertEquals(0.24197072451914337, densityAt1, TOLERANCE);
    }

    @Test
    public void testDensityExtremeValues() {
        // Density far away from the mean should approach zero
        Assert.assertEquals(0.0, defaultDistribution.density(100.0), TOLERANCE);
        Assert.assertEquals(0.0, defaultDistribution.density(-100.0), TOLERANCE);
    }

    // -------------------------------------------------------------------------
    // 3. Cumulative Probability & Math-60 Specific Edge Cases
    // -------------------------------------------------------------------------

    @Test
    public void testCumulativeProbabilityStandardValues() throws MathException {
        // At mean: CDF = 0.5
        Assert.assertEquals(0.5, defaultDistribution.cumulativeProbability(0.0), TOLERANCE);
        
        // At mean + 1*sd and mean - 1*sd
        Assert.assertEquals(0.8413447460685429, defaultDistribution.cumulativeProbability(1.0), TOLERANCE);
        Assert.assertEquals(0.15865525393145705, defaultDistribution.cumulativeProbability(-1.0), TOLERANCE);
    }

    @Test
    public void testCumulativeProbabilityExtremeValuesMath60() throws MathException {
        // Triggers extreme bounds (> 20 & 40 standard deviations)
        Assert.assertEquals(0.0, defaultDistribution.cumulativeProbability(-50.0), TOLERANCE);
        Assert.assertEquals(1.0, defaultDistribution.cumulativeProbability(50.0), TOLERANCE);

        // Extreme bounds with large mean and sd
        NormalDistributionImpl largeDist = new NormalDistributionImpl(100.0, 10.0);
        Assert.assertEquals(0.0, largeDist.cumulativeProbability(-1000.0), TOLERANCE);
        Assert.assertEquals(1.0, largeDist.cumulativeProbability(1200.0), TOLERANCE);

        // Double boundary limits
        Assert.assertEquals(0.0, defaultDistribution.cumulativeProbability(-Double.MAX_VALUE), TOLERANCE);
        Assert.assertEquals(1.0, defaultDistribution.cumulativeProbability(Double.MAX_VALUE), TOLERANCE);
    }

    // -------------------------------------------------------------------------
    // 4. Inverse Cumulative Probability Tests
    // -------------------------------------------------------------------------

    @Test
    public void testInverseCumulativeProbabilitySpecialPoints() throws MathException {
        Assert.assertEquals(Double.NEGATIVE_INFINITY, defaultDistribution.inverseCumulativeProbability(0.0), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, defaultDistribution.inverseCumulativeProbability(1.0), 0.0);
        Assert.assertEquals(0.0, defaultDistribution.inverseCumulativeProbability(0.5), TOLERANCE);
        Assert.assertEquals(2.5, customDistribution.inverseCumulativeProbability(0.5), TOLERANCE);
    }

    @Test(expected = OutOfRangeException.class)
    public void testInverseCumulativeProbabilityBelowZero() throws MathException {
        defaultDistribution.inverseCumulativeProbability(-0.01);
    }

    @Test(expected = OutOfRangeException.class)
    public void testInverseCumulativeProbabilityAboveOne() throws MathException {
        defaultDistribution.inverseCumulativeProbability(1.01);
    }

    // -------------------------------------------------------------------------
    // 5. Protected Domain Helper Methods Tests
    // -------------------------------------------------------------------------

    @Test
    public void testDomainBoundsAndInitialDomain() {
        // Subclass exposing protected methods for 100% branch verification
        class TestableNormalDistribution extends NormalDistributionImpl {
            TestableNormalDistribution(double mean, double sd) {
                super(mean, sd);
            }
            @Override public double getDomainLowerBound(double p) { return super.getDomainLowerBound(p); }
            @Override public double getDomainUpperBound(double p) { return super.getDomainUpperBound(p); }
            @Override public double getInitialDomain(double p) { return super.getInitialDomain(p); }
        }

        TestableNormalDistribution dist = new TestableNormalDistribution(10.0, 2.0);

        // p < 0.5
        Assert.assertEquals(-Double.MAX_VALUE, dist.getDomainLowerBound(0.25), 0.0);
        Assert.assertEquals(10.0, dist.getDomainUpperBound(0.25), TOLERANCE);
        Assert.assertEquals(8.0, dist.getInitialDomain(0.25), TOLERANCE); // mean - sd

        // p > 0.5
        Assert.assertEquals(10.0, dist.getDomainLowerBound(0.75), TOLERANCE); // mean
        Assert.assertEquals(Double.MAX_VALUE, dist.getDomainUpperBound(0.75), 0.0);
        Assert.assertEquals(12.0, dist.getInitialDomain(0.75), TOLERANCE); // mean + sd

        // p == 0.5
        Assert.assertEquals(10.0, dist.getDomainLowerBound(0.5), TOLERANCE); // mean
        Assert.assertEquals(Double.MAX_VALUE, dist.getDomainUpperBound(0.5), 0.0);
        Assert.assertEquals(10.0, dist.getInitialDomain(0.5), TOLERANCE); // mean
    }

    // -------------------------------------------------------------------------
    // 6. Sampling Test
    // -------------------------------------------------------------------------

    @Test
    public void testSample() throws MathException {
        double sample = defaultDistribution.sample();
        Assert.assertFalse(Double.isNaN(sample));
        Assert.assertFalse(Double.isInfinite(sample));
    }
}