package org.apache.commons.math.distribution;

import org.apache.commons.math.MathException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * High-coverage unit tests for {@link NormalDistributionImpl}.
 */
public class NormalDistributionImplTest {

    private static final double TOLERANCE = 1e-5;
    private NormalDistributionImpl defaultDistribution;
    private NormalDistributionImpl customDistribution;

    @Before
    public void setUp() {
        defaultDistribution = new NormalDistributionImpl();
        customDistribution = new NormalDistributionImpl(2.5, 1.5);
    }

    // -------------------------------------------------------------------------
    // Constructor & Parameter Validation Tests
    // -------------------------------------------------------------------------

    @Test
    public void testDefaultConstructor() {
        assertEquals(0.0, defaultDistribution.getMean(), TOLERANCE);
        assertEquals(1.0, defaultDistribution.getStandardDeviation(), TOLERANCE);
    }

    @Test
    public void testCustomConstructorAndSetters() {
        assertEquals(2.5, customDistribution.getMean(), TOLERANCE);
        assertEquals(1.5, customDistribution.getStandardDeviation(), TOLERANCE);

        customDistribution.setMean(-10.0);
        assertEquals(-10.0, customDistribution.getMean(), TOLERANCE);

        customDistribution.setStandardDeviation(5.0);
        assertEquals(5.0, customDistribution.getStandardDeviation(), TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetStandardDeviationZeroThrowsException() {
        defaultDistribution.setStandardDeviation(0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetStandardDeviationNegativeThrowsException() {
        defaultDistribution.setStandardDeviation(-1.5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithInvalidStandardDeviation() {
        new NormalDistributionImpl(0.0, -0.001);
    }

    // -------------------------------------------------------------------------
    // cumulativeProbability(double x) Tests
    // -------------------------------------------------------------------------

    @Test
    public void testCumulativeProbabilitySymmetric() throws MathException {
        // CDF at mean should be exactly 0.5
        assertEquals(0.5, defaultDistribution.cumulativeProbability(0.0), TOLERANCE);
        assertEquals(0.5, customDistribution.cumulativeProbability(2.5), TOLERANCE);
    }

    @Test
    public void testCumulativeProbabilityStandardDeviations() throws MathException {
        // ~68.27% within 1 SD -> P(X < mean + 1*SD) = 0.5 + 0.34134 = 0.84134
        assertEquals(0.84134, defaultDistribution.cumulativeProbability(1.0), TOLERANCE);
        assertEquals(0.15866, defaultDistribution.cumulativeProbability(-1.0), TOLERANCE);

        // ~95.45% within 2 SD -> P(X < mean + 2*SD) = 0.97725
        assertEquals(0.97725, defaultDistribution.cumulativeProbability(2.0), TOLERANCE);
        assertEquals(0.02275, defaultDistribution.cumulativeProbability(-2.0), TOLERANCE);
    }

    /**
     * Defects4J Math-103 specific edge-case:
     * Extreme outliers (> 20 standard deviations from the mean).
     */
    @Test
    public void testCumulativeProbabilityExtremeValues() throws MathException {
        // Normal(0, 1) at x = -20 and x = 20
        assertEquals(0.0, defaultDistribution.cumulativeProbability(-20.0), 1e-15);
        assertEquals(1.0, defaultDistribution.cumulativeProbability(20.0), 1e-15);

        // Extreme bounds
        assertEquals(0.0, defaultDistribution.cumulativeProbability(-100.0), 1e-15);
        assertEquals(1.0, defaultDistribution.cumulativeProbability(100.0), 1e-15);
    }

    // -------------------------------------------------------------------------
    // inverseCumulativeProbability(double p) Tests
    // -------------------------------------------------------------------------

    @Test
    public void testInverseCumulativeProbabilityBoundaries() throws MathException {
        assertEquals(Double.NEGATIVE_INFINITY, defaultDistribution.inverseCumulativeProbability(0.0), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, defaultDistribution.inverseCumulativeProbability(1.0), 0.0);
    }

    @Test
    public void testInverseCumulativeProbabilityStandardValues() throws MathException {
        assertEquals(0.0, defaultDistribution.inverseCumulativeProbability(0.5), TOLERANCE);
        assertEquals(2.5, customDistribution.inverseCumulativeProbability(0.5), TOLERANCE);

        assertEquals(1.0, defaultDistribution.inverseCumulativeProbability(0.8413447), TOLERANCE);
        assertEquals(-1.0, defaultDistribution.inverseCumulativeProbability(0.1586553), TOLERANCE);
    }

    @Test
    public void testInverseCumulativeProbabilityInvalidInput() {
        try {
            defaultDistribution.inverseCumulativeProbability(-0.1);
            fail("Expected IllegalArgumentException for p < 0");
        } catch (IllegalArgumentException expected) {
            // Success
        } catch (MathException e) {
            fail("Expected IllegalArgumentException, but got MathException");
        }

        try {
            defaultDistribution.inverseCumulativeProbability(1.1);
            fail("Expected IllegalArgumentException for p > 1");
        } catch (IllegalArgumentException expected) {
            // Success
        } catch (MathException e) {
            fail("Expected IllegalArgumentException, but got MathException");
        }
    }

    // -------------------------------------------------------------------------
    // Protected Domain Methods Tests (Branch & Boundary Coverage)
    // -------------------------------------------------------------------------

    @Test
    public void testGetDomainLowerBound() {
        // p < 0.5
        assertEquals(-Double.MAX_VALUE, customDistribution.getDomainLowerBound(0.49), 0.0);
        assertEquals(-Double.MAX_VALUE, customDistribution.getDomainLowerBound(0.0), 0.0);

        // p == 0.5
        assertEquals(2.5, customDistribution.getDomainLowerBound(0.5), 0.0);

        // p > 0.5
        assertEquals(2.5, customDistribution.getDomainLowerBound(0.51), 0.0);
        assertEquals(2.5, customDistribution.getDomainLowerBound(1.0), 0.0);
    }

    @Test
    public void testGetDomainUpperBound() {
        // p < 0.5
        assertEquals(2.5, customDistribution.getDomainUpperBound(0.49), 0.0);
        assertEquals(2.5, customDistribution.getDomainUpperBound(0.0), 0.0);

        // p == 0.5
        assertEquals(Double.MAX_VALUE, customDistribution.getDomainUpperBound(0.5), 0.0);

        // p > 0.5
        assertEquals(Double.MAX_VALUE, customDistribution.getDomainUpperBound(0.51), 0.0);
        assertEquals(Double.MAX_VALUE, customDistribution.getDomainUpperBound(1.0), 0.0);
    }

    @Test
    public void testGetInitialDomain() {
        double mean = customDistribution.getMean();
        double sd = customDistribution.getStandardDeviation();

        // p < 0.5 -> mean - sd
        assertEquals(mean - sd, customDistribution.getInitialDomain(0.49), TOLERANCE);
        assertEquals(mean - sd, customDistribution.getInitialDomain(0.1), TOLERANCE);

        // p > 0.5 -> mean + sd
        assertEquals(mean + sd, customDistribution.getInitialDomain(0.51), TOLERANCE);
        assertEquals(mean + sd, customDistribution.getInitialDomain(0.9), TOLERANCE);

        // p == 0.5 -> mean
        assertEquals(mean, customDistribution.getInitialDomain(0.5), TOLERANCE);
    }
}