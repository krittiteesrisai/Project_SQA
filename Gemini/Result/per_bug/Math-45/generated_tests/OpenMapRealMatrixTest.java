package org.apache.commons.math.linear;

import org.apache.commons.math.exception.DimensionMismatchException;
import org.apache.commons.math.exception.NotStrictlyPositiveException;
import org.apache.commons.math.exception.NumberIsTooLargeException;
import org.apache.commons.math.exception.OutOfRangeException;
import org.junit.Assert;
import org.junit.Test;

public class OpenMapRealMatrixTest {

    private static final double EPSILON = 1e-10;

    @Test
    public void testConstructorAndDimensions() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(3, 5);
        Assert.assertEquals(3, matrix.getRowDimension());
        Assert.assertEquals(5, matrix.getColumnDimension());
        Assert.assertEquals(0.0, matrix.getEntry(0, 0), EPSILON);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorInvalidRows() {
        new OpenMapRealMatrix(0, 5);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorInvalidColumns() {
        new OpenMapRealMatrix(5, -1);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testConstructorDimensionOverflow() {
        // Defects4J Math-45: row * column >= Integer.MAX_VALUE should throw NumberIsTooLargeException
        new OpenMapRealMatrix(Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    @Test
    public void testCopyAndCreateMatrix() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(3, 3);
        matrix.setEntry(1, 1, 4.5);
        
        OpenMapRealMatrix copyConstructed = new OpenMapRealMatrix(matrix);
        Assert.assertEquals(4.5, copyConstructed.getEntry(1, 1), EPSILON);

        OpenMapRealMatrix copied = matrix.copy();
        Assert.assertEquals(4.5, copied.getEntry(1, 1), EPSILON);

        RealMatrix created = matrix.createMatrix(2, 4);
        Assert.assertEquals(2, created.getRowDimension());
        Assert.assertEquals(4, created.getColumnDimension());
        Assert.assertTrue(created instanceof OpenMapRealMatrix);
    }

    @Test
    public void testGetAndSetEntry() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(3, 3);
        // Initially empty / zero
        Assert.assertEquals(0.0, matrix.getEntry(1, 2), EPSILON);

        // Set non-zero value
        matrix.setEntry(1, 2, 5.0);
        Assert.assertEquals(5.0, matrix.getEntry(1, 2), EPSILON);

        // Set zero value (triggers entries.remove)
        matrix.setEntry(1, 2, 0.0);
        Assert.assertEquals(0.0, matrix.getEntry(1, 2), EPSILON);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetEntryInvalidRow() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(3, 3);
        matrix.getEntry(3, 1);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetEntryInvalidNegativeRow() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(3, 3);
        matrix.getEntry(-1, 1);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetEntryInvalidColumn() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(3, 3);
        matrix.getEntry(1, 3);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetEntryInvalidNegativeColumn() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(3, 3);
        matrix.getEntry(1, -1);
    }

    @Test(expected = OutOfRangeException.class)
    public void testSetEntryInvalidIndex() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(3, 3);
        matrix.setEntry(3, 0, 1.0);
    }

    @Test
    public void testAddToEntry() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(3, 3);
        
        // Add to zero -> non-zero
        matrix.addToEntry(1, 1, 3.5);
        Assert.assertEquals(3.5, matrix.getEntry(1, 1), EPSILON);

        // Add increment resulting in non-zero
        matrix.addToEntry(1, 1, 1.5);
        Assert.assertEquals(5.0, matrix.getEntry(1, 1), EPSILON);

        // Add increment resulting in zero (triggers entries.remove)
        matrix.addToEntry(1, 1, -5.0);
        Assert.assertEquals(0.0, matrix.getEntry(1, 1), EPSILON);
    }

    @Test(expected = OutOfRangeException.class)
    public void testAddToEntryInvalidIndex() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(3, 3);
        matrix.addToEntry(0, 3, 1.0);
    }

    @Test
    public void testMultiplyEntry() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(3, 3);
        matrix.setEntry(1, 1, 4.0);

        // Multiply by non-zero
        matrix.multiplyEntry(1, 1, 2.5);
        Assert.assertEquals(10.0, matrix.getEntry(1, 1), EPSILON);

        // Multiply by zero (triggers entries.remove)
        matrix.multiplyEntry(1, 1, 0.0);
        Assert.assertEquals(0.0, matrix.getEntry(1, 1), EPSILON);
    }

    @Test(expected = OutOfRangeException.class)
    public void testMultiplyEntryInvalidIndex() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(3, 3);
        matrix.multiplyEntry(4, 1, 2.0);
    }

    @Test
    public void testAdd() {
        OpenMapRealMatrix m1 = new OpenMapRealMatrix(2, 2);
        m1.setEntry(0, 0, 1.0);
        m1.setEntry(1, 1, 2.0);

        OpenMapRealMatrix m2 = new OpenMapRealMatrix(2, 2);
        m2.setEntry(0, 0, 3.0);
        m2.setEntry(0, 1, 4.0);

        OpenMapRealMatrix result = m1.add(m2);
        Assert.assertEquals(4.0, result.getEntry(0, 0), EPSILON);
        Assert.assertEquals(4.0, result.getEntry(0, 1), EPSILON);
        Assert.assertEquals(0.0, result.getEntry(1, 0), EPSILON);
        Assert.assertEquals(2.0, result.getEntry(1, 1), EPSILON);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testAddIncompatibleDimensions() {
        OpenMapRealMatrix m1 = new OpenMapRealMatrix(2, 2);
        OpenMapRealMatrix m2 = new OpenMapRealMatrix(2, 3);
        m1.add(m2);
    }

    @Test
    public void testSubtractOpenMapRealMatrix() {
        OpenMapRealMatrix m1 = new OpenMapRealMatrix(2, 2);
        m1.setEntry(0, 0, 5.0);
        m1.setEntry(1, 1, 2.0);

        OpenMapRealMatrix m2 = new OpenMapRealMatrix(2, 2);
        m2.setEntry(0, 0, 2.0);
        m2.setEntry(0, 1, 3.0);

        OpenMapRealMatrix result = m1.subtract(m2);
        Assert.assertEquals(3.0, result.getEntry(0, 0), EPSILON);
        Assert.assertEquals(-3.0, result.getEntry(0, 1), EPSILON);
        Assert.assertEquals(0.0, result.getEntry(1, 0), EPSILON);
        Assert.assertEquals(2.0, result.getEntry(1, 1), EPSILON);
    }

    @Test
    public void testSubtractGenericRealMatrix() {
        OpenMapRealMatrix m1 = new OpenMapRealMatrix(2, 2);
        m1.setEntry(0, 0, 5.0);

        RealMatrix m2 = new Array2DRowRealMatrix(new double[][] {
            { 2.0, 1.0 },
            { 0.0, 4.0 }
        });

        // Triggers ClassCastException and delegates to super.subtract(m)
        RealMatrix result = m1.subtract(m2);
        Assert.assertEquals(3.0, result.getEntry(0, 0), EPSILON);
        Assert.assertEquals(-1.0, result.getEntry(0, 1), EPSILON);
        Assert.assertEquals(0.0, result.getEntry(1, 0), EPSILON);
        Assert.assertEquals(-4.0, result.getEntry(1, 1), EPSILON);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testSubtractIncompatibleDimensions() {
        OpenMapRealMatrix m1 = new OpenMapRealMatrix(2, 2);
        OpenMapRealMatrix m2 = new OpenMapRealMatrix(3, 2);
        m1.subtract(m2);
    }

    @Test
    public void testMultiplyOpenMapRealMatrix() {
        OpenMapRealMatrix m1 = new OpenMapRealMatrix(2, 2);
        m1.setEntry(0, 0, 1.0);
        m1.setEntry(0, 1, 2.0);
        m1.setEntry(1, 0, 3.0);
        m1.setEntry(1, 1, 4.0);

        OpenMapRealMatrix m2 = new OpenMapRealMatrix(2, 2);
        m2.setEntry(0, 0, 2.0);
        m2.setEntry(1, 0, -1.0);
        m2.setEntry(0, 1, 0.0);
        m2.setEntry(1, 1, 1.0);

        // Result:
        // [0,0] = 1*2 + 2*(-1) = 0.0 (triggers outValue == 0.0 -> remove key)
        // [0,1] = 1*0 + 2*1    = 2.0 (triggers outValue != 0.0 -> put key)
        // [1,0] = 3*2 + 4*(-1) = 2.0
        // [1,1] = 3*0 + 4*1    = 4.0
        OpenMapRealMatrix result = m1.multiply(m2);
        Assert.assertEquals(0.0, result.getEntry(0, 0), EPSILON);
        Assert.assertEquals(2.0, result.getEntry(0, 1), EPSILON);
        Assert.assertEquals(2.0, result.getEntry(1, 0), EPSILON);
        Assert.assertEquals(4.0, result.getEntry(1, 1), EPSILON);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testMultiplyOpenMapIncompatibleDimensions() {
        OpenMapRealMatrix m1 = new OpenMapRealMatrix(2, 3);
        OpenMapRealMatrix m2 = new OpenMapRealMatrix(2, 2);
        m1.multiply(m2);
    }

    @Test
    public void testMultiplyGenericRealMatrix() {
        OpenMapRealMatrix m1 = new OpenMapRealMatrix(2, 2);
        m1.setEntry(0, 0, 2.0);
        m1.setEntry(1, 1, 3.0);

        RealMatrix m2 = new Array2DRowRealMatrix(new double[][] {
            { 1.0, 2.0 },
            { 3.0, 4.0 }
        });

        // Triggers ClassCastException branch in multiply(RealMatrix)
        RealMatrix result = m1.multiply(m2);
        Assert.assertTrue(result instanceof BlockRealMatrix);
        Assert.assertEquals(2.0, result.getEntry(0, 0), EPSILON);
        Assert.assertEquals(4.0, result.getEntry(0, 1), EPSILON);
        Assert.assertEquals(9.0, result.getEntry(1, 0), EPSILON);
        Assert.assertEquals(12.0, result.getEntry(1, 1), EPSILON);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testMultiplyGenericIncompatibleDimensions() {
        OpenMapRealMatrix m1 = new OpenMapRealMatrix(2, 2);
        RealMatrix m2 = new Array2DRowRealMatrix(new double[][] {
            { 1.0, 2.0 }
        });
        m1.multiply(m2);
    }
}