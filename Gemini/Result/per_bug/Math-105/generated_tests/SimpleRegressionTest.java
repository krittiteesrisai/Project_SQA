package org.apache.commons.math.stat.regression;

import org.apache.commons.math.MathException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Test cases for SimpleRegression covering branch conditions,
 * edge cases, boundary limits, and mathematical correctness.
 */
public class SimpleRegressionTest {

    private SimpleRegression regression;
    private static final double TOLERANCE = 1e-10;

    @Before
    public void setUp() {
        regression = new SimpleRegression();
    }

    @Test
    public void testInitialStateAndGetN() {
        assertEquals(0, regression.getN());
        assertTrue(Double.isNaN(regression.getSlope()));
        assertTrue(Double.isNaN(regression.getIntercept()));
        assertTrue(Double.isNaN(regression.getTotalSumSquares()));
        assertTrue(Double.isNaN(regression.getMeanSquareError()));
        assertTrue(Double.isNaN(regression.getRSquare()));
        assertTrue(Double.isNaN(regression.getR()));
    }

    @Test
    public void testSingleObservation() {
        regression.addData(1.0, 2.0);
        assertEquals(1, regression.getN());
        assertTrue(Double.isNaN(regression.getSlope()));
        assertTrue(Double.isNaN(regression.getIntercept()));
        assertTrue(Double.isNaN(regression.getTotalSumSquares()));
        assertTrue(Double.isNaN(regression.getMeanSquareError()));
        assertTrue(Double.isNaN(regression.predict(5.0)));
    }

    @Test
    public void testClear() {
        regression.addData(1.0, 2.0);
        regression.addData(2.0, 4.0);
        assertEquals(2, regression.getN());
        
        regression.clear();
        assertEquals(0, regression.getN());
        assertTrue(Double.isNaN(regression.getSlope()));
        assertTrue(Double.isNaN(regression.getTotalSumSquares()));
    }

    @Test
    public void testAddData2DArray() {
        double[][] data = {
            {1.0, 3.0},
            {2.0, 5.0},
            {3.0, 7.0}
        };
        regression.addData(data);
        assertEquals(3, regression.getN());
        assertEquals(2.0, regression.getSlope(), TOLERANCE);
        assertEquals(1.0, regression.getIntercept(), TOLERANCE);
    }

    @Test
    public void testNoVariationInX() {
        // x values are identical, sumXX should be 0
        regression.addData(2.0, 1.0);
        regression.addData(2.0, 3.0);
        regression.addData(2.0, 5.0);

        assertEquals(3, regression.getN());
        assertTrue(Double.isNaN(regression.getSlope()));
        assertTrue(Double.isNaN(regression.getIntercept()));
        assertTrue(Double.isNaN(regression.getSlopeStdErr()));
        assertTrue(Double.isNaN(regression.getInterceptStdErr()));
    }

    @Test
    public void testTwoObservationsPositiveSlope() {
        regression.addData(1.0, 2.0);
        regression.addData(3.0, 6.0);

        assertEquals(2, regression.getN());
        assertEquals(2.0, regression.getSlope(), TOLERANCE);
        assertEquals(0.0, regression.getIntercept(), TOLERANCE);
        assertEquals(8.0, regression.getTotalSumSquares(), TOLERANCE);
        assertEquals(10.0, regression.predict(5.0), TOLERANCE);
        assertEquals(1.0, regression.getRSquare(), TOLERANCE);
        assertEquals(1.0, regression.getR(), TOLERANCE);
        
        // n < 3 returns NaN for MSE & Standard Errors
        assertTrue(Double.isNaN(regression.getMeanSquareError()));
        assertTrue(Double.isNaN(regression.getSlopeStdErr()));
        assertTrue(Double.isNaN(regression.getInterceptStdErr()));
    }

    @Test
    public void testNegativeSlopeAndRCalculation() {
        // Line: y = -3x + 10
        regression.addData(1.0, 7.0);
        regression.addData(2.0, 4.0);
        regression.addData(3.0, 1.0);

        assertEquals(3, regression.getN());
        assertEquals(-3.0, regression.getSlope(), TOLERANCE);
        assertEquals(10.0, regression.getIntercept(), TOLERANCE);
        assertEquals(-1.0, regression.getR(), TOLERANCE); // Negative correlation
        assertEquals(1.0, regression.getRSquare(), TOLERANCE);
        assertEquals(18.0, regression.getRegressionSumSquares(), TOLERANCE);
    }

    @Test
    public void testSumSquaredErrorsNonNegativeEdgeCase() {
        // Perfectly collinear points with potential floating-point cancellation
        regression.addData(1.0, 1.0);
        regression.addData(2.0, 2.0);
        regression.addData(3.0, 3.0);
        regression.addData(4.0, 4.0);
        regression.addData(5.0, 5.0);

        double sse = regression.getSumSquaredErrors();
        // SSE must not be negative due to precision issues
        assertTrue("Sum of squared errors should be >= 0.0 but was: " + sse, sse >= 0.0);
    }

    @Test
    public void testStatisticalEstimatesAndInference() throws MathException {
        // Standard dataset with variance in residuals
        double[][] data = {
            {1.0, 2.1},
            {2.0, 3.9},
            {3.0, 6.2},
            {4.0, 8.1},
            {5.0, 9.9}
        };
        regression.addData(data);

        assertEquals(5, regression.getN());
        assertEquals(1.97, regression.getSlope(), 1e-2);
        assertEquals(0.13, regression.getIntercept(), 1e-2);

        // Check non-NaN statistical results
        assertFalse(Double.isNaN(regression.getMeanSquareError()));
        assertFalse(Double.isNaN(regression.getSlopeStdErr()));
        assertFalse(Double.isNaN(regression.getInterceptStdErr()));

        double ci95 = regression.getSlopeConfidenceInterval();
        assertTrue("Confidence interval half-width should be positive", ci95 > 0.0);

        double significance = regression.getSignificance();
        assertTrue("Significance level should be between 0 and 1", significance >= 0.0 && significance <= 1.0);
    }

    @Test
    public void testConfidenceIntervalBoundaries() throws MathException {
        regression.addData(1.0, 2.0);
        regression.addData(2.0, 3.0);
        regression.addData(3.0, 5.0);

        // Valid alpha
        double ci99 = regression.getSlopeConfidenceInterval(0.01);
        double ci90 = regression.getSlopeConfidenceInterval(0.10);
        assertTrue(ci99 > ci90);

        // Invalid alpha: alpha <= 0
        try {
            regression.getSlopeConfidenceInterval(0.0);
            fail("Expected IllegalArgumentException for alpha = 0.0");
        } catch (IllegalArgumentException expected) {
            // Success
        }

        try {
            regression.getSlopeConfidenceInterval(-0.05);
            fail("Expected IllegalArgumentException for alpha < 0");
        } catch (IllegalArgumentException expected) {
            // Success
        }

        // Invalid alpha: alpha >= 1
        try {
            regression.getSlopeConfidenceInterval(1.0);
            fail("Expected IllegalArgumentException for alpha = 1.0");
        } catch (IllegalArgumentException expected) {
            // Success
        }

        try {
            regression.getSlopeConfidenceInterval(1.5);
            fail("Expected IllegalArgumentException for alpha > 1");
        } catch (IllegalArgumentException expected) {
            // Success
        }
    }
}