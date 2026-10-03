package org.apache.commons.math.special;

import org.apache.commons.math.MathException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GammaTest {

    private static final double TOLERANCE = 1e-8;

    // -------------------------------------------------------------------------
    // Tests for logGamma(double x)
    // -------------------------------------------------------------------------

    @Test
    public void testLogGammaNanAndNonPositive() {
        assertTrue(Double.isNaN(Gamma.logGamma(Double.NaN)));
        assertTrue(Double.isNaN(Gamma.logGamma(0.0)));
        assertTrue(Double.isNaN(Gamma.logGamma(-0.0)));
        assertTrue(Double.isNaN(Gamma.logGamma(-1.0)));
        assertTrue(Double.isNaN(Gamma.logGamma(-100.5)));
    }

    @Test
    public void testLogGammaPositiveValues() {
        // Gamma(1) = 1 => logGamma(1) = 0
        assertEquals(0.0, Gamma.logGamma(1.0), TOLERANCE);

        // Gamma(2) = 1 => logGamma(2) = 0
        assertEquals(0.0, Gamma.logGamma(2.0), TOLERANCE);

        // Gamma(3) = 2! = 2 => logGamma(3) = ln(2)
        assertEquals(Math.log(2.0), Gamma.logGamma(3.0), TOLERANCE);

        // Gamma(4) = 3! = 6 => logGamma(4) = ln(6)
        assertEquals(Math.log(6.0), Gamma.logGamma(4.0), TOLERANCE);

        // Gamma(5) = 4! = 24 => logGamma(5) = ln(24)
        assertEquals(Math.log(24.0), Gamma.logGamma(5.0), TOLERANCE);

        // Gamma(0.5) = sqrt(PI) => logGamma(0.5) = 0.5 * ln(PI)
        assertEquals(0.5 * Math.log(Math.PI), Gamma.logGamma(0.5), TOLERANCE);
    }

    // -------------------------------------------------------------------------
    // Tests for regularizedGammaP
    // -------------------------------------------------------------------------

    @Test
    public void testRegularizedGammaPInvalidInputs() throws MathException {
        // a is NaN or non-positive
        assertTrue(Double.isNaN(Gamma.regularizedGammaP(Double.NaN, 1.0)));
        assertTrue(Double.isNaN(Gamma.regularizedGammaP(0.0, 1.0)));
        assertTrue(Double.isNaN(Gamma.regularizedGammaP(-1.0, 1.0)));

        // x is NaN or negative
        assertTrue(Double.isNaN(Gamma.regularizedGammaP(1.0, Double.NaN)));
        assertTrue(Double.isNaN(Gamma.regularizedGammaP(1.0, -1.0)));
        assertTrue(Double.isNaN(Gamma.regularizedGammaP(1.0, -0.0001)));

        // 4-parameter overload
        assertTrue(Double.isNaN(Gamma.regularizedGammaP(Double.NaN, 1.0, 1e-9, 100)));
        assertTrue(Double.isNaN(Gamma.regularizedGammaP(1.0, Double.NaN, 1e-9, 100)));
        assertTrue(Double.isNaN(Gamma.regularizedGammaP(-0.5, 1.0, 1e-9, 100)));
        assertTrue(Double.isNaN(Gamma.regularizedGammaP(1.0, -0.5, 1e-9, 100)));
    }

    @Test
    public void testRegularizedGammaPZeroX() throws MathException {
        assertEquals(0.0, Gamma.regularizedGammaP(1.0, 0.0), TOLERANCE);
        assertEquals(0.0, Gamma.regularizedGammaP(0.5, 0.0), TOLERANCE);
        assertEquals(0.0, Gamma.regularizedGammaP(5.0, 0.0, 1e-9, 100), TOLERANCE);
    }

    @Test
    public void testRegularizedGammaPDelegateToQ() throws MathException {
        // Condition: a >= 1.0 && x > a => delegate to 1.0 - regularizedGammaQ
        double a = 2.0;
        double x = 4.0;
        double p = Gamma.regularizedGammaP(a, x);
        double q = Gamma.regularizedGammaQ(a, x);
        assertEquals(1.0, p + q, TOLERANCE);
    }

    @Test
    public void testRegularizedGammaPSeriesComputation() throws MathException {
        // Condition: x <= a or a < 1.0 => series computation path
        // 1. a < 1.0
        double p1 = Gamma.regularizedGammaP(0.5, 1.0);
        assertTrue(p1 > 0.0 && p1 < 1.0);

        // 2. x <= a with a >= 1.0
        double p2 = Gamma.regularizedGammaP(3.0, 2.0);
        double q2 = Gamma.regularizedGammaQ(3.0, 2.0);
        assertEquals(1.0, p2 + q2, TOLERANCE);

        // a = 1, x = 1 (P(1, 1) = 1 - e^-1)
        assertEquals(1.0 - Math.exp(-1.0), Gamma.regularizedGammaP(1.0, 1.0), TOLERANCE);
    }

    @Test(expected = MaxIterationsExceededException.class)
    public void testRegularizedGammaPMaxIterationsExceeded() throws MathException {
        // Force series to not converge by allowing only 1 iteration with very small epsilon
        Gamma.regularizedGammaP(1.0, 0.5, 1e-20, 1);
    }

    // -------------------------------------------------------------------------
    // Tests for regularizedGammaQ
    // -------------------------------------------------------------------------

    @Test
    public void testRegularizedGammaQInvalidInputs() throws MathException {
        // a is NaN or non-positive
        assertTrue(Double.isNaN(Gamma.regularizedGammaQ(Double.NaN, 1.0)));
        assertTrue(Double.isNaN(Gamma.regularizedGammaQ(0.0, 1.0)));
        assertTrue(Double.isNaN(Gamma.regularizedGammaQ(-1.0, 1.0)));

        // x is NaN or negative
        assertTrue(Double.isNaN(Gamma.regularizedGammaQ(1.0, Double.NaN)));
        assertTrue(Double.isNaN(Gamma.regularizedGammaQ(1.0, -1.0)));

        // 4-parameter overload
        assertTrue(Double.isNaN(Gamma.regularizedGammaQ(Double.NaN, 1.0, 1e-9, 100)));
        assertTrue(Double.isNaN(Gamma.regularizedGammaQ(1.0, Double.NaN, 1e-9, 100)));
        assertTrue(Double.isNaN(Gamma.regularizedGammaQ(-0.5, 1.0, 1e-9, 100)));
        assertTrue(Double.isNaN(Gamma.regularizedGammaQ(1.0, -0.5, 1e-9, 100)));
    }

    @Test
    public void testRegularizedGammaQZeroX() throws MathException {
        assertEquals(1.0, Gamma.regularizedGammaQ(1.0, 0.0), TOLERANCE);
        assertEquals(1.0, Gamma.regularizedGammaQ(0.5, 0.0), TOLERANCE);
        assertEquals(1.0, Gamma.regularizedGammaQ(5.0, 0.0, 1e-9, 100), TOLERANCE);
    }

    @Test
    public void testRegularizedGammaQDelegateToP() throws MathException {
        // Condition: x < a || a < 1.0 => delegate to 1.0 - regularizedGammaP
        // 1. x < a
        double p1 = Gamma.regularizedGammaP(4.0, 2.0);
        double q1 = Gamma.regularizedGammaQ(4.0, 2.0);
        assertEquals(1.0, p1 + q1, TOLERANCE);

        // 2. a < 1.0
        double p2 = Gamma.regularizedGammaP(0.5, 2.0);
        double q2 = Gamma.regularizedGammaQ(0.5, 2.0);
        assertEquals(1.0, p2 + q2, TOLERANCE);
    }

    @Test
    public void testRegularizedGammaQContinuedFraction() throws MathException {
        // Condition: a >= 1.0 && x >= a => continued fraction path
        double a = 2.0;
        double x = 4.0;
        double q = Gamma.regularizedGammaQ(a, x, 1e-9, Integer.MAX_VALUE);
        double expected = (1.0 + x) * Math.exp(-x); // Q(2, x) = (1 + x)e^(-x)
        assertEquals(expected, q, TOLERANCE);

        // Boundary: x == a
        double qEqual = Gamma.regularizedGammaQ(3.0, 3.0);
        double pEqual = Gamma.regularizedGammaP(3.0, 3.0);
        assertEquals(1.0, pEqual + qEqual, TOLERANCE);
    }

    @Test(expected = MaxIterationsExceededException.class)
    public void testRegularizedGammaQMaxIterationsExceeded() throws MathException {
        // Force continued fraction to not converge by giving maxIterations = 1
        Gamma.regularizedGammaQ(10.0, 15.0, 1e-20, 1);
    }

    // -------------------------------------------------------------------------
    // Mathematical Consistency & High Precision Edge Cases
    // -------------------------------------------------------------------------

    @Test
    public void testGammaPAndQComplementarity() throws MathException {
        double[] testA = {0.1, 0.5, 1.0, 2.0, 5.0, 10.0};
        double[] testX = {0.1, 0.5, 1.0, 2.0, 5.0, 10.0, 20.0};

        for (double a : testA) {
            for (double x : testX) {
                double p = Gamma.regularizedGammaP(a, x);
                double q = Gamma.regularizedGammaQ(a, x);
                assertEquals("P + Q must equal 1 for a=" + a + ", x=" + x, 1.0, p + q, TOLERANCE);
            }
        }
    }
}