package org.apache.commons.math.distribution;

import org.apache.commons.math.MathException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * High-coverage unit test suite for FDistributionImpl.
 */
public class FDistributionImplTest {

    private static final double TOLERANCE = 10e-5;
    private FDistributionImpl distribution;

    @Before
    public void setUp() {
        distribution = new FDistributionImpl(5.0, 6.0);
    }

    // -------------------------------------------------------------------------
    // Constructor & Parameter Validation Tests
    // -------------------------------------------------------------------------

    @Test
    public void testConstructorAndGettersValid() {
        FDistributionImpl dist = new FDistributionImpl(10.0, 20.0);
        assertEquals(10.0, dist.getNumeratorDegreesOfFreedom(), 0.0);
        assertEquals(20.0, dist.getDenominatorDegreesOfFreedom(), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInvalidNumeratorZero() {
        new FDistributionImpl(0.0, 5.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInvalidNumeratorNegative() {
        new FDistributionImpl(-1.0, 5.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInvalidDenominatorZero() {
        new FDistributionImpl(5.0, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInvalidDenominatorNegative() {
        new FDistributionImpl(5.0, -2.5);
    }

    @Test
    public void testSetNumeratorDegreesOfFreedom() {
        distribution.setNumeratorDegreesOfFreedom(8.0);
        assertEquals(8.0, distribution.getNumeratorDegreesOfFreedom(), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNumeratorDegreesOfFreedomZero() {
        distribution.setNumeratorDegreesOfFreedom(0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNumeratorDegreesOfFreedomNegative() {
        distribution.setNumeratorDegreesOfFreedom(-10.0);
    }

    @Test
    public void testSetDenominatorDegreesOfFreedom() {
        distribution.setDenominatorDegreesOfFreedom(12.0);
        assertEquals(12.0, distribution.getDenominatorDegreesOfFreedom(), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDenominatorDegreesOfFreedomZero() {
        distribution.setDenominatorDegreesOfFreedom(0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDenominatorDegreesOfFreedomNegative() {
        distribution.setDenominatorDegreesOfFreedom(-12.0);
    }

    // -------------------------------------------------------------------------
    // Cumulative Probability Tests (cumulativeProbability)
    // -------------------------------------------------------------------------

    @Test
    public void testCumulativeProbabilityNonPositive() throws MathException {
        assertEquals(0.0, distribution.cumulativeProbability(0.0), 0.0);
        assertEquals(0.0, distribution.cumulativeProbability(-0.0001), 0.0);
        assertEquals(0.0, distribution.cumulativeProbability(-100.0), 0.0);
        assertEquals(0.0, distribution.cumulativeProbability(-Double.MAX_VALUE), 0.0);
    }

    @Test
    public void testCumulativeProbabilityPositiveValues() throws MathException {
        // P(X < 1.0) with df1=5, df2=6 is approximately 0.51268
        double p1 = distribution.cumulativeProbability(1.0);
        assertTrue(p1 > 0.0 && p1 < 1.0);

        // Monotonicity check: P(X < a) <= P(X < b) for a < b
        double p2 = distribution.cumulativeProbability(2.0);
        double p3 = distribution.cumulativeProbability(5.0);
        assertTrue(p1 < p2);
        assertTrue(p2 < p3);

        // Near 1 as x -> infinity
        double pLarge = distribution.cumulativeProbability(1e6);
        assertEquals(1.0, pLarge, TOLERANCE);
    }

    // -------------------------------------------------------------------------
    // Inverse Cumulative Probability Tests (inverseCumulativeProbability)
    // -------------------------------------------------------------------------

    @Test
    public void testInverseCumulativeProbabilityBoundaries() throws MathException {
        assertEquals(0.0, distribution.inverseCumulativeProbability(0.0), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, distribution.inverseCumulativeProbability(1.0), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInverseCumulativeProbabilityBelowZero() throws MathException {
        distribution.inverseCumulativeProbability(-0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInverseCumulativeProbabilityAboveOne() throws MathException {
        distribution.inverseCumulativeProbability(1.01);
    }

    @Test
    public void testInverseCumulativeProbabilityStandard() throws MathException {
        double p = 0.5;
        double x = distribution.inverseCumulativeProbability(p);
        double reconstructedP = distribution.cumulativeProbability(x);
        assertEquals(p, reconstructedP, TOLERANCE);
    }

    @Test
    public void testInverseCumulativeProbabilitySmallDegreesOfFreedom() throws MathException {
        // Targeting Math-95: df2 <= 2 causes issues in getInitialDomain
        FDistributionImpl smallDf = new FDistributionImpl(2.0, 2.0);
        double p = 0.95;
        double x = smallDf.inverseCumulativeProbability(p);
        assertTrue(x > 0.0);
        assertEquals(p, smallDf.cumulativeProbability(x), TOLERANCE);

        FDistributionImpl smallDf1 = new FDistributionImpl(1.0, 1.0);
        double x1 = smallDf1.inverseCumulativeProbability(0.5);
        assertTrue(x1 > 0.0);
        assertEquals(0.5, smallDf1.cumulativeProbability(x1), TOLERANCE);
    }

    // -------------------------------------------------------------------------
    // Domain Bounds & Initial Domain Tests
    // -------------------------------------------------------------------------

    @Test
    public void testDomainBounds() {
        assertEquals(0.0, distribution.getDomainLowerBound(0.5), 0.0);
        assertEquals(Double.MAX_VALUE, distribution.getDomainUpperBound(0.5), 0.0);
    }

    @Test
    public void testInitialDomain() {
        // d = 6.0 -> 6.0 / (6.0 - 2.0) = 1.5
        assertEquals(1.5, distribution.getInitialDomain(0.5), 0.0);
    }
}