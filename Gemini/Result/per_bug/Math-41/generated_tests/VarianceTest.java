package org.apache.commons.math.stat.descriptive.moment;

import org.apache.commons.math.exception.NullArgumentException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Comprehensive test suite for {@link Variance}.
 */
public class VarianceTest {

    private static final double TOLERANCE = 10E-12;
    private double[] testArray;
    private double[] testWeights;

    @Before
    public void setUp() {
        testArray = new double[]{1.0, 2.0, 4.0, 5.0}; // Mean = 3.0, Var (unbiased) = 3.3333333333333335
        testWeights = new double[]{1.0, 2.0, 1.0, 2.0};
    }

    // ------------------------------------------------------------------------
    // Constructors & Property Tests
    // ------------------------------------------------------------------------

    @Test
    public void testConstructorsAndProperties() {
        Variance vDefault = new Variance();
        assertTrue(vDefault.isBiasCorrected());
        assertTrue(vDefault.incMoment);
        assertEquals(0, vDefault.getN());

        Variance vPopulation = new Variance(false);
        assertFalse(vPopulation.isBiasCorrected());
        assertTrue(vPopulation.incMoment);

        vPopulation.setBiasCorrected(true);
        assertTrue(vPopulation.isBiasCorrected());

        SecondMoment m2 = new SecondMoment();
        Variance vExternal = new Variance(m2);
        assertFalse(vExternal.incMoment);
        assertTrue(vExternal.isBiasCorrected());

        Variance vExternalPop = new Variance(false, m2);
        assertFalse(vExternalPop.incMoment);
        assertFalse(vExternalPop.isBiasCorrected());
    }

    @Test
    public void testCopyConstructorAndCopyMethod() {
        Variance original = new Variance(false);
        original.increment(10.0);
        original.increment(20.0);

        Variance copy1 = new Variance(original);
        assertEquals(original.getResult(), copy1.getResult(), TOLERANCE);
        assertEquals(original.getN(), copy1.getN());
        assertEquals(original.isBiasCorrected(), copy1.isBiasCorrected());

        Variance copy2 = original.copy();
        assertEquals(original.getResult(), copy2.getResult(), TOLERANCE);
        assertEquals(original.getN(), copy2.getN());
        assertEquals(original.isBiasCorrected(), copy2.isBiasCorrected());
    }

    @Test
    public void testCopyNullArguments() {
        try {
            Variance.copy(null, new Variance());
            fail("Expected NullArgumentException for null source");
        } catch (NullArgumentException ex) {
            // Expected
        }

        try {
            Variance.copy(new Variance(), null);
            fail("Expected NullArgumentException for null destination");
        } catch (NullArgumentException ex) {
            // Expected
        }
    }

    // ------------------------------------------------------------------------
    // Incremental Calculation Tests (getResult, increment, clear, getN)
    // ------------------------------------------------------------------------

    @Test
    public void testIncrementalSampleVariance() {
        Variance v = new Variance();
        assertTrue(Double.isNaN(v.getResult()));
        assertEquals(0, v.getN());

        v.increment(5.0);
        assertEquals(0.0, v.getResult(), TOLERANCE);
        assertEquals(1, v.getN());

        v.increment(15.0); // Values: 5.0, 15.0 -> Mean = 10, Sample Var = (25+25)/(2-1) = 50.0
        assertEquals(50.0, v.getResult(), TOLERANCE);
        assertEquals(2, v.getN());

        v.clear();
        assertTrue(Double.isNaN(v.getResult()));
        assertEquals(0, v.getN());
    }

    @Test
    public void testIncrementalPopulationVariance() {
        Variance v = new Variance(false);
        assertTrue(Double.isNaN(v.getResult()));

        v.increment(5.0);
        assertEquals(0.0, v.getResult(), TOLERANCE);

        v.increment(15.0); // Values: 5.0, 15.0 -> Population Var = (25+25)/2 = 25.0
        assertEquals(25.0, v.getResult(), TOLERANCE);
    }

    @Test
    public void testIncrementalWithExternalMoment() {
        SecondMoment m2 = new SecondMoment();
        Variance v = new Variance(m2);

        // increment() on variance should do nothing because incMoment = false
        v.increment(100.0);
        assertEquals(0, v.getN());
        assertTrue(Double.isNaN(v.getResult()));

        // clear() on variance should do nothing
        m2.increment(10.0);
        m2.increment(20.0);
        assertEquals(2, v.getN());
        assertEquals(50.0, v.getResult(), TOLERANCE);

        v.clear(); // Should not clear external moment
        assertEquals(2, v.getN());
    }

    // ------------------------------------------------------------------------
    // Array Evaluation Tests (Unweighted)
    // ------------------------------------------------------------------------

    @Test
    public void testEvaluateNullArray() {
        Variance v = new Variance();
        try {
            v.evaluate(null);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException ex) {
            // Expected
        }
    }

    @Test
    public void testEvaluateEmptyAndSingleElementArray() {
        Variance v = new Variance();
        assertTrue(Double.isNaN(v.evaluate(new double[]{})));
        assertTrue(Double.isNaN(v.evaluate(testArray, 0, 0)));

        assertEquals(0.0, v.evaluate(new double[]{42.0}), TOLERANCE);
        assertEquals(0.0, v.evaluate(testArray, 1, 1), TOLERANCE);
    }

    @Test
    public void testEvaluateFullArray() {
        Variance v = new Variance();
        // Values: 1, 2, 4, 5 -> Mean = 3.0, (4 + 1 + 1 + 4) / 3 = 10 / 3 = 3.3333333333333335
        assertEquals(10.0 / 3.0, v.evaluate(testArray), TOLERANCE);

        // Population variance
        v.setBiasCorrected(false);
        assertEquals(10.0 / 4.0, v.evaluate(testArray), TOLERANCE);
    }

    @Test
    public void testEvaluateSubArray() {
        Variance v = new Variance();
        // Subarray: indices 1 to 3 -> {2.0, 4.0, 5.0}, Mean = 11/3
        // Dev: -5/3, 1/3, 4/3 -> Dev^2 sum: (25 + 1 + 16)/9 = 42/9 = 14/3
        // Sample Var = (14/3) / 2 = 7/3 = 2.3333333333333335
        assertEquals(7.0 / 3.0, v.evaluate(testArray, 1, 3), TOLERANCE);
    }

    @Test
    public void testEvaluateWithPrecomputedMean() {
        Variance v = new Variance();
        double mean = 3.0;
        assertEquals(10.0 / 3.0, v.evaluate(testArray, mean), TOLERANCE);
        assertEquals(10.0 / 3.0, v.evaluate(testArray, mean, 0, testArray.length), TOLERANCE);

        // Precomputed with Population variance
        v.setBiasCorrected(false);
        assertEquals(10.0 / 4.0, v.evaluate(testArray, mean), TOLERANCE);
        assertEquals(10.0 / 4.0, v.evaluate(testArray, mean, 0, testArray.length), TOLERANCE);

        // Edge case: single element
        assertEquals(0.0, v.evaluate(testArray, mean, 0, 1), TOLERANCE);

        // Edge case: empty subarray
        assertTrue(Double.isNaN(v.evaluate(testArray, mean, 0, 0)));
    }

    // ------------------------------------------------------------------------
    // Weighted Array Evaluation Tests
    // ------------------------------------------------------------------------

    @Test
    public void testEvaluateWeightedFullArray() {
        Variance v = new Variance();
        // Values:  [1.0, 2.0, 4.0, 5.0]
        // Weights: [1.0, 2.0, 1.0, 2.0] -> sumWts = 6.0
        // Weighted mean = (1*1 + 2*2 + 4*1 + 5*2) / 6 = (1 + 4 + 4 + 10) / 6 = 19 / 6
        // Devs: (1 - 19/6) = -13/6; (2 - 19/6) = -7/6; (4 - 19/6) = 5/6; (5 - 19/6) = 11/6
        // W*Dev^2 sum = 1*(169/36) + 2*(49/36) + 1*(25/36) + 2*(121/36) = (169 + 98 + 25 + 242) / 36 = 534 / 36
        // Sample Var = (534/36) / (6 - 1) = 534 / 180 = 2.966666666666667
        double expectedSample = 534.0 / 180.0;
        assertEquals(expectedSample, v.evaluate(testArray, testWeights), TOLERANCE);

        // Population Var = (534/36) / 6 = 534 / 216 = 2.4722222222222223
        v.setBiasCorrected(false);
        double expectedPop = 534.0 / 216.0;
        assertEquals(expectedPop, v.evaluate(testArray, testWeights), TOLERANCE);
    }

    @Test
    public void testEvaluateWeightedSubArray() {
        Variance v = new Variance();
        // Subarray: indices 1 to 2 -> values: [2.0, 4.0], weights: [2.0, 1.0]
        // sumWts = 3.0
        // Weighted Mean = (2*2 + 4*1) / 3 = 8 / 3
        // Devs: (2 - 8/3) = -2/3; (4 - 8/3) = 4/3
        // W*Dev^2 = 2*(4/9) + 1*(16/9) = 24/9
        // Sample Var = (24/9) / (3 - 1) = 24 / 18 = 4 / 3 = 1.3333333333333333
        double expected = 4.0 / 3.0;
        assertEquals(expected, v.evaluate(testArray, testWeights, 1, 2), TOLERANCE);

        // Population Var = (24/9) / 3 = 24 / 27 = 8 / 9
        v.setBiasCorrected(false);
        assertEquals(8.0 / 9.0, v.evaluate(testArray, testWeights, 1, 2), TOLERANCE);
    }

    @Test
    public void testEvaluateWeightedPrecomputedMean() {
        Variance v = new Variance();
        double weightedMean = 19.0 / 6.0;
        double expectedSample = 534.0 / 180.0;

        assertEquals(expectedSample, v.evaluate(testArray, testWeights, weightedMean), TOLERANCE);
        assertEquals(expectedSample, v.evaluate(testArray, testWeights, weightedMean, 0, testArray.length), TOLERANCE);

        // Population Var
        v.setBiasCorrected(false);
        double expectedPop = 534.0 / 216.0;
        assertEquals(expectedPop, v.evaluate(testArray, testWeights, weightedMean), TOLERANCE);
        assertEquals(expectedPop, v.evaluate(testArray, testWeights, weightedMean, 0, testArray.length), TOLERANCE);

        // Edge case: single element
        assertEquals(0.0, v.evaluate(testArray, testWeights, weightedMean, 0, 1), TOLERANCE);

        // Edge case: empty subarray
        assertTrue(Double.isNaN(v.evaluate(testArray, testWeights, weightedMean, 0, 0)));
    }

    @Test
    public void testEvaluateWeightedInvalidInputs() {
        Variance v = new Variance();

        // Null arrays
        try {
            v.evaluate(null, testWeights);
            fail("Expected IllegalArgumentException for null values");
        } catch (IllegalArgumentException ex) {
            // Expected
        }

        try {
            v.evaluate(testArray, null);
            fail("Expected IllegalArgumentException for null weights");
        } catch (IllegalArgumentException ex) {
            // Expected
        }

        // Array length mismatch
        try {
            v.evaluate(testArray, new double[]{1.0, 2.0});
            fail("Expected IllegalArgumentException for array length mismatch");
        } catch (IllegalArgumentException ex) {
            // Expected
        }

        // Negative weight
        try {
            v.evaluate(testArray, new double[]{1.0, -2.0, 1.0, 2.0});
            fail("Expected IllegalArgumentException for negative weight");
        } catch (IllegalArgumentException ex) {
            // Expected
        }

        // NaN weight
        try {
            v.evaluate(testArray, new double[]{1.0, Double.NaN, 1.0, 2.0});
            fail("Expected IllegalArgumentException for NaN weight");
        } catch (IllegalArgumentException ex) {
            // Expected
        }

        // Infinite weight
        try {
            v.evaluate(testArray, new double[]{1.0, Double.POSITIVE_INFINITY, 1.0, 2.0});
            fail("Expected IllegalArgumentException for Infinite weight");
        } catch (IllegalArgumentException ex) {
            // Expected
        }

        // Invalid subarray bounds
        try {
            v.evaluate(testArray, testWeights, -1, 2);
            fail("Expected IllegalArgumentException for negative begin index");
        } catch (IllegalArgumentException ex) {
            // Expected
        }

        try {
            v.evaluate(testArray, testWeights, 0, 10);
            fail("Expected IllegalArgumentException for length exceeding array size");
        } catch (IllegalArgumentException ex) {
            // Expected
        }
    }
}