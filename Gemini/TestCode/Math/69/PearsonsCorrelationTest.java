package org.apache.commons.math.stat.correlation;

import org.apache.commons.math.MathException;
import org.apache.commons.math.linear.BlockRealMatrix;
import org.apache.commons.math.linear.RealMatrix;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test suite for {@link PearsonsCorrelation} targeting high branch/condition coverage
 * and boundary edge cases.
 */
public class PearsonsCorrelationTest {

    private static final double TOLERANCE = 1e-12;

    @Test
    public void testDefaultConstructor() {
        PearsonsCorrelation corr = new PearsonsCorrelation();
        Assert.assertNull("Correlation matrix should be null on default init", corr.getCorrelationMatrix());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCheckSufficientData_RowsLessThan2() {
        double[][] data = {
            {1.0, 2.0, 3.0}
        };
        new PearsonsCorrelation(data);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCheckSufficientData_ColsLessThan2() {
        double[][] data = {
            {1.0},
            {2.0},
            {3.0}
        };
        new PearsonsCorrelation(data);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCheckSufficientData_BothRowsAndColsLessThan2() {
        double[][] data = {
            {1.0}
        };
        new PearsonsCorrelation(data);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCorrelation_ArrayLengthMismatch() {
        PearsonsCorrelation corr = new PearsonsCorrelation();
        double[] x = {1.0, 2.0, 3.0};
        double[] y = {1.0, 2.0};
        corr.correlation(x, y);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCorrelation_ArrayLengthOne() {
        PearsonsCorrelation corr = new PearsonsCorrelation();
        double[] x = {1.0};
        double[] y = {2.0};
        corr.correlation(x, y);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCorrelation_ArrayLengthZero() {
        PearsonsCorrelation corr = new PearsonsCorrelation();
        double[] x = {};
        double[] y = {};
        corr.correlation(x, y);
    }

    @Test
    public void testCorrelation_ValidArrays() {
        PearsonsCorrelation corr = new PearsonsCorrelation();
        double[] x = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] y = {2.0, 4.0, 6.0, 8.0, 10.0};
        
        double result = corr.correlation(x, y);
        Assert.assertEquals("Perfect positive linear correlation should be 1.0", 1.0, result, TOLERANCE);

        double[] yNeg = {-2.0, -4.0, -6.0, -8.0, -10.0};
        double resultNeg = corr.correlation(x, yNeg);
        Assert.assertEquals("Perfect negative linear correlation should be -1.0", -1.0, resultNeg, TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCovarianceConstructor_NullCovarianceMatrix() {
        Covariance nullMatrixCovariance = new Covariance() {
            @Override
            public RealMatrix getCovarianceMatrix() {
                return null;
            }
        };
        new PearsonsCorrelation(nullMatrixCovariance);
    }

    @Test
    public void testCovarianceConstructor_Valid() {
        double[][] data = {
            {1.0, 2.0},
            {3.0, 5.0},
            {5.0, 6.0}
        };
        Covariance cov = new Covariance(data);
        PearsonsCorrelation corrFromCov = new PearsonsCorrelation(cov);
        PearsonsCorrelation corrFromData = new PearsonsCorrelation(data);

        RealMatrix m1 = corrFromCov.getCorrelationMatrix();
        RealMatrix m2 = corrFromData.getCorrelationMatrix();

        Assert.assertEquals(m1.getRowDimension(), m2.getRowDimension());
        for (int i = 0; i < m1.getRowDimension(); i++) {
            for (int j = 0; j < m1.getColumnDimension(); j++) {
                Assert.assertEquals(m2.getEntry(i, j), m1.getEntry(i, j), TOLERANCE);
            }
        }
    }

    @Test
    public void testCovarianceMatrixAndNObsConstructor() {
        double[][] covData = {
            {4.0, 2.0},
            {2.0, 9.0}
        };
        RealMatrix covMatrix = new BlockRealMatrix(covData);
        PearsonsCorrelation corr = new PearsonsCorrelation(covMatrix, 10);
        RealMatrix corrMatrix = corr.getCorrelationMatrix();

        Assert.assertEquals(1.0, corrMatrix.getEntry(0, 0), TOLERANCE);
        Assert.assertEquals(1.0, corrMatrix.getEntry(1, 1), TOLERANCE);
        // r = 2.0 / (sqrt(4.0) * sqrt(9.0)) = 2.0 / 6.0 = 1/3
        Assert.assertEquals(1.0 / 3.0, corrMatrix.getEntry(0, 1), TOLERANCE);
        Assert.assertEquals(1.0 / 3.0, corrMatrix.getEntry(1, 0), TOLERANCE);
    }

    @Test
    public void testComputeCorrelationMatrix_DoubleArrayAndRealMatrix() {
        double[][] data = {
            {1.0, 2.0, 3.0},
            {2.0, 5.0, 6.0},
            {3.0, 8.0, 10.0},
            {4.0, 11.0, 12.0}
        };

        PearsonsCorrelation pc = new PearsonsCorrelation();
        RealMatrix m1 = pc.computeCorrelationMatrix(data);
        RealMatrix m2 = pc.computeCorrelationMatrix(new BlockRealMatrix(data));

        Assert.assertEquals(3, m1.getRowDimension());
        Assert.assertEquals(3, m1.getColumnDimension());
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Assert.assertEquals(m1.getEntry(i, j), m2.getEntry(i, j), TOLERANCE);
                if (i == j) {
                    Assert.assertEquals(1.0, m1.getEntry(i, j), TOLERANCE);
                }
            }
        }
    }

    @Test
    public void testGetCorrelationStandardErrors() {
        double[][] data = {
            {1.0, 2.0},
            {2.0, 4.0},
            {3.0, 7.0},
            {4.0, 8.0},
            {5.0, 10.0}
        };
        PearsonsCorrelation corr = new PearsonsCorrelation(data);
        RealMatrix se = corr.getCorrelationStandardErrors();
        RealMatrix r = corr.getCorrelationMatrix();

        int nObs = 5;
        for (int i = 0; i < se.getRowDimension(); i++) {
            for (int j = 0; j < se.getColumnDimension(); j++) {
                double rVal = r.getEntry(i, j);
                double expectedSE = Math.sqrt((1.0 - rVal * rVal) / (nObs - 2));
                Assert.assertEquals(expectedSE, se.getEntry(i, j), TOLERANCE);
            }
        }
    }

    @Test
    public void testGetCorrelationPValues_DiagonalAndOffDiagonal() throws MathException {
        double[][] data = {
            {1.0, 2.0, 5.0},
            {2.0, 3.0, 4.0},
            {3.0, 6.0, 2.0},
            {4.0, 8.0, 1.0},
            {5.0, 9.0, 0.0}
        };
        PearsonsCorrelation corr = new PearsonsCorrelation(data);
        RealMatrix pValues = corr.getCorrelationPValues();

        for (int i = 0; i < pValues.getRowDimension(); i++) {
            for (int j = 0; j < pValues.getColumnDimension(); j++) {
                if (i == j) {
                    Assert.assertEquals("Diagonal p-value should be 0.0", 0.0, pValues.getEntry(i, j), TOLERANCE);
                } else {
                    double p = pValues.getEntry(i, j);
                    Assert.assertTrue("P-value must be >= 0.0", p >= 0.0);
                    Assert.assertTrue("P-value must be <= 1.0", p <= 1.0);
                    Assert.assertEquals("P-value matrix should be symmetric", p, pValues.getEntry(j, i), TOLERANCE);
                }
            }
        }
    }

    @Test
    public void testGetCorrelationPValues_HighCorrelationBoundary() throws MathException {
        // High correlation dataset to exercise precision boundaries (Math-69)
        double[][] data = {
            {1.0, 1.00001},
            {2.0, 2.00002},
            {3.0, 3.00001},
            {4.0, 4.00003},
            {5.0, 5.00002}
        };
        PearsonsCorrelation corr = new PearsonsCorrelation(data);
        RealMatrix pValues = corr.getCorrelationPValues();
        
        double pVal = pValues.getEntry(0, 1);
        Assert.assertTrue("P-value for high correlation should be non-negative", pVal >= 0.0);
        Assert.assertTrue("P-value for near perfect correlation should be close to 0", pVal < 1e-4);
    }
}