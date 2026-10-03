package org.apache.commons.math3.optim.nonlinear.vector;

import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.NonSquareMatrixException;
import org.apache.commons.math3.linear.RealMatrix;
import org.junit.Assert;
import org.junit.Test;

/**
 * High-coverage unit test suite for {@link Weight}.
 */
public class WeightTest {

    private static final double EPSILON = 1e-10;

    // =========================================================================
    // Tests for Constructor: Weight(double[])
    // =========================================================================

    @Test
    public void testConstructorDoubleArrayStandard() {
        double[] diagonal = new double[] { 1.5, 2.0, 3.5 };
        Weight weight = new Weight(diagonal);
        RealMatrix matrix = weight.getWeight();

        Assert.assertEquals(3, matrix.getRowDimension());
        Assert.assertEquals(3, matrix.getColumnDimension());

        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal.length; j++) {
                if (i == j) {
                    Assert.assertEquals(diagonal[i], matrix.getEntry(i, j), EPSILON);
                } else {
                    Assert.assertEquals(0.0, matrix.getEntry(i, j), EPSILON);
                }
            }
        }
    }

    @Test
    public void testConstructorDoubleArraySingleElement() {
        double[] diagonal = new double[] { 42.0 };
        Weight weight = new Weight(diagonal);
        RealMatrix matrix = weight.getWeight();

        Assert.assertEquals(1, matrix.getRowDimension());
        Assert.assertEquals(1, matrix.getColumnDimension());
        Assert.assertEquals(42.0, matrix.getEntry(0, 0), EPSILON);
    }

    @Test
    public void testConstructorDoubleArrayWithSpecialValues() {
        double[] diagonal = new double[] {
            Double.NaN,
            Double.POSITIVE_INFINITY,
            Double.NEGATIVE_INFINITY,
            -0.0,
            -10.5
        };
        Weight weight = new Weight(diagonal);
        RealMatrix matrix = weight.getWeight();

        Assert.assertTrue(Double.isNaN(matrix.getEntry(0, 0)));
        Assert.assertEquals(Double.POSITIVE_INFINITY, matrix.getEntry(1, 1), 0.0);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, matrix.getEntry(2, 2), 0.0);
        Assert.assertEquals(-0.0, matrix.getEntry(3, 3), 0.0);
        Assert.assertEquals(-10.5, matrix.getEntry(4, 4), EPSILON);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorDoubleArrayNull() {
        new Weight((double[]) null);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorDoubleArrayEmpty() {
        // Empty array results in 0x0 dimension which is invalid for Matrix creation
        new Weight(new double[0]);
    }

    // =========================================================================
    // Tests for Constructor: Weight(RealMatrix)
    // =========================================================================

    @Test
    public void testConstructorSquareMatrix() {
        double[][] data = {
            { 1.0, 2.0 },
            { 3.0, 4.0 }
        };
        RealMatrix inputMatrix = new Array2DRowRealMatrix(data);
        Weight weight = new Weight(inputMatrix);
        RealMatrix result = weight.getWeight();

        Assert.assertEquals(2, result.getRowDimension());
        Assert.assertEquals(2, result.getColumnDimension());
        Assert.assertEquals(1.0, result.getEntry(0, 0), EPSILON);
        Assert.assertEquals(2.0, result.getEntry(0, 1), EPSILON);
        Assert.assertEquals(3.0, result.getEntry(1, 0), EPSILON);
        Assert.assertEquals(4.0, result.getEntry(1, 1), EPSILON);
    }

    @Test
    public void testConstructorWithDiagonalMatrix() {
        double[] diag = { 2.0, 4.0, 6.0 };
        RealMatrix diagMatrix = new DiagonalMatrix(diag);
        Weight weight = new Weight(diagMatrix);
        RealMatrix result = weight.getWeight();

        Assert.assertEquals(3, result.getRowDimension());
        Assert.assertEquals(3, result.getColumnDimension());
        for (int i = 0; i < diag.length; i++) {
            Assert.assertEquals(diag[i], result.getEntry(i, i), EPSILON);
        }
    }

    @Test(expected = NonSquareMatrixException.class)
    public void testConstructorNonSquareMatrixWide() {
        // 2 rows, 3 columns
        double[][] nonSquareData = {
            { 1.0, 2.0, 3.0 },
            { 4.0, 5.0, 6.0 }
        };
        RealMatrix matrix = new Array2DRowRealMatrix(nonSquareData);
        new Weight(matrix);
    }

    @Test(expected = NonSquareMatrixException.class)
    public void testConstructorNonSquareMatrixTall() {
        // 3 rows, 2 columns
        double[][] nonSquareData = {
            { 1.0, 2.0 },
            { 3.0, 4.0 },
            { 5.0, 6.0 }
        };
        RealMatrix matrix = new Array2DRowRealMatrix(nonSquareData);
        new Weight(matrix);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorMatrixNull() {
        new Weight((RealMatrix) null);
    }

    // =========================================================================
    // Tests for Immutability & Defensive Copying
    // =========================================================================

    @Test
    public void testImmutabilityInputMatrixModification() {
        double[][] data = { { 1.0, 2.0 }, { 3.0, 4.0 } };
        RealMatrix inputMatrix = new Array2DRowRealMatrix(data);
        Weight weight = new Weight(inputMatrix);

        // Modify original matrix after passing into constructor
        inputMatrix.setEntry(0, 0, 999.0);

        // Verify Weight internal matrix is unmodified
        Assert.assertEquals(1.0, weight.getWeight().getEntry(0, 0), EPSILON);
    }

    @Test
    public void testImmutabilityGetWeightDefensiveCopy() {
        Weight weight = new Weight(new double[] { 5.0, 10.0 });
        RealMatrix extractedMatrix1 = weight.getWeight();

        // Mutate the returned matrix
        extractedMatrix1.setEntry(0, 0, 999.0);

        // Fetch again and verify internal state remains intact
        RealMatrix extractedMatrix2 = weight.getWeight();
        Assert.assertEquals(5.0, extractedMatrix2.getEntry(0, 0), EPSILON);
        Assert.assertNotSame(extractedMatrix1, extractedMatrix2);
    }
}