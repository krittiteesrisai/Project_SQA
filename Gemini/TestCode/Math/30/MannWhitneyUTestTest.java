package org.apache.commons.math3.stat.inference;

import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.stat.ranking.NaNStrategy;
import org.apache.commons.math3.stat.ranking.TiesStrategy;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MannWhitneyUTestTest {

    private MannWhitneyUTest testInstance;

    @Before
    public void setUp() {
        testInstance = new MannWhitneyUTest();
    }

    // -------------------------------------------------------------
    // Data Conformance & Exception Branches (Null & Empty checks)
    // -------------------------------------------------------------

    @Test(expected = NullArgumentException.class)
    public void testMannWhitneyUNullX() {
        testInstance.mannWhitneyU(null, new double[]{1.0, 2.0});
    }

    @Test(expected = NullArgumentException.class)
    public void testMannWhitneyUNullY() {
        testInstance.mannWhitneyU(new double[]{1.0, 2.0}, null);
    }

    @Test(expected = NullArgumentException.class)
    public void testMannWhitneyUTestNullX() {
        testInstance.mannWhitneyUTest(null, new double[]{1.0, 2.0});
    }

    @Test(expected = NullArgumentException.class)
    public void testMannWhitneyUTestNullY() {
        testInstance.mannWhitneyUTest(new double[]{1.0, 2.0}, null);
    }

    @Test(expected = NoDataException.class)
    public void testMannWhitneyUEmptyX() {
        testInstance.mannWhitneyU(new double[]{}, new double[]{1.0, 2.0});
    }

    @Test(expected = NoDataException.class)
    public void testMannWhitneyUEmptyY() {
        testInstance.mannWhitneyU(new double[]{1.0, 2.0}, new double[]{});
    }

    @Test(expected = NoDataException.class)
    public void testMannWhitneyUTestEmptyX() {
        testInstance.mannWhitneyUTest(new double[]{}, new double[]{1.0, 2.0});
    }

    @Test(expected = NoDataException.class)
    public void testMannWhitneyUTestEmptyY() {
        testInstance.mannWhitneyUTest(new double[]{1.0, 2.0}, new double[]{});
    }

    // -------------------------------------------------------------
    // Branch Coverage for mannWhitneyU (U1 > U2, U2 > U1, U1 == U2)
    // -------------------------------------------------------------

    @Test
    public void testMannWhitneyU_U1GreaterThanU2() {
        // x values are strictly greater than y values
        double[] x = {10.0, 11.0, 12.0};
        double[] y = {1.0, 2.0, 3.0};
        
        // n1 = 3, n2 = 3. Total U max should be 9.0
        double result = testInstance.mannWhitneyU(x, y);
        Assert.assertEquals(9.0, result, 1e-6);
    }

    @Test
    public void testMannWhitneyU_U2GreaterThanU1() {
        // y values are strictly greater than x values
        double[] x = {1.0, 2.0, 3.0};
        double[] y = {10.0, 11.0, 12.0};

        double result = testInstance.mannWhitneyU(x, y);
        Assert.assertEquals(9.0, result, 1e-6);
    }

    @Test
    public void testMannWhitneyU_Balanced() {
        double[] x = {1.0, 4.0};
        double[] y = {2.0, 3.0};

        // Ranks: 1->1, 2->2, 3->3, 4->4
        // sumRankX = 1 + 4 = 5. U1 = 5 - (2*3)/2 = 2. U2 = 4 - 2 = 2.
        double result = testInstance.mannWhitneyU(x, y);
        Assert.assertEquals(2.0, result, 1e-6);
    }

    // -------------------------------------------------------------
    // Constructor & Strategy Variations
    // -------------------------------------------------------------

    @Test
    public void testCustomConstructorWithNaNAndTies() {
        MannWhitneyUTest customTest = new MannWhitneyUTest(NaNStrategy.MAXIMAL, TiesStrategy.MAXIMUM);
        double[] x = {1.0, 2.0, Double.NaN};
        double[] y = {2.0, 3.0, 4.0};

        double u = customTest.mannWhitneyU(x, y);
        Assert.assertTrue(u >= 0.0);

        double p = customTest.mannWhitneyUTest(x, y);
        Assert.assertTrue(p >= 0.0 && p <= 1.0);
    }

    // -------------------------------------------------------------
    // Statistical Accuracy & Edge Conditions (p-value tests)
    // -------------------------------------------------------------

    @Test
    public void testMannWhitneyUTestStandard() {
        double[] x = {19.0, 22.0, 16.0, 29.0, 24.0};
        double[] y = {20.0, 11.0, 17.0, 12.0};

        double u = testInstance.mannWhitneyU(x, y);
        Assert.assertEquals(17.0, u, 1e-6);

        double p = testInstance.mannWhitneyUTest(x, y);
        Assert.assertTrue(p > 0.0 && p < 1.0);
    }

    @Test
    public void testMannWhitneyUTestIdenticalSamples() {
        double[] x = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] y = {1.0, 2.0, 3.0, 4.0, 5.0};

        double pValue = testInstance.mannWhitneyUTest(x, y);
        // With identical samples, p-value should be 1.0 (or very close)
        Assert.assertEquals(1.0, pValue, 1e-2);
    }

    @Test
    public void testMannWhitneyUTestCompletelySeparated() {
        double[] x = {100.0, 101.0, 102.0, 103.0, 104.0, 105.0, 106.0, 107.0};
        double[] y = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0};

        double pValue = testInstance.mannWhitneyUTest(x, y);
        // p-value should be extremely small
        Assert.assertTrue(pValue < 0.001);
    }

    @Test
    public void testMannWhitneyUTestDifferentLengths() {
        double[] x = {1.0, 2.0, 3.0};
        double[] y = {4.0, 5.0, 6.0, 7.0, 8.0, 9.0};

        double u = testInstance.mannWhitneyU(x, y);
        Assert.assertEquals(18.0, u, 1e-6);

        double p = testInstance.mannWhitneyUTest(x, y);
        Assert.assertTrue(p >= 0.0 && p <= 1.0);
    }

    /**
     * Test case designed to detect 32-bit Integer Overflow bug in Math-30.
     * When n1 * n2 * (n1 + n2 + 1) exceeds Integer.MAX_VALUE (2,147,483,647).
     * For n1 = 1500, n2 = 1500:
     * n1 * n2 = 2,250,000
     * n1 * n2 * (n1 + n2 + 1) = 2,250,000 * 3001 = 6,752,250,000 > Integer.MAX_VALUE
     */
    @Test
    public void testBigDataSetOverflow() {
        double[] x = new double[1500];
        double[] y = new double[1500];
        for (int i = 0; i < 1500; ++i) {
            x[i] = 2.0 * i;
            y[i] = 2.0 * i + 1.0;
        }

        double result = testInstance.mannWhitneyUTest(x, y);
        Assert.assertFalse("P-value must not be NaN due to integer overflow", Double.isNaN(result));
        Assert.assertTrue("P-value must be between 0 and 1", result >= 0.0 && result <= 1.0);
    }
}