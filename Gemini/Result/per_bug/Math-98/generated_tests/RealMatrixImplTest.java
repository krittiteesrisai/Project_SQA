package org.apache.commons.math.linear;

import org.junit.Assert;
import org.junit.Test;

public class RealMatrixImplTest {

    private static final double TOLERANCE = 10E-12;

    // Custom RealMatrix implementation for triggering ClassCastException paths
    private static class DummyRealMatrix implements RealMatrix {
        private final double[][] d;

        public DummyRealMatrix(double[][] data) {
            this.d = data;
        }

        public RealMatrix copy() { return new DummyRealMatrix(d); }
        public RealMatrix add(RealMatrix m) { return null; }
        public RealMatrix subtract(RealMatrix m) { return null; }
        public RealMatrix multiply(RealMatrix m) { return null; }
        public RealMatrix preMultiply(RealMatrix m) { return null; }
        public double[][] getData() { return d; }
        public double getNorm() { return 0; }
        public double getTrace() { return 0; }
        public double[] operate(double[] v) { return null; }
        public double[] preMultiply(double[] v) { return null; }
        public int getRowDimension() { return d.length; }
        public int getColumnDimension() { return d[0].length; }
        public double getEntry(int row, int column) { return d[row][column]; }
        public RealMatrix inverse() { return null; }
        public double getDeterminant() { return 0; }
        public boolean isSquare() { return d.length == d[0].length; }
        public boolean isSingular() { return false; }
        public RealMatrix solve(RealMatrix b) { return null; }
        public double[] solve(double[] b) { return null; }
        public RealMatrix transpose() { return null; }
        public RealMatrix getSubMatrix(int i, int j, int k, int l) { return null; }
        public RealMatrix getSubMatrix(int[] r, int[] c) { return null; }
        public void setSubMatrix(double[][] subMatrix, int row, int column) {}
        public RealMatrix getRowMatrix(int row) { return null; }
        public RealMatrix getColumnMatrix(int column) { return null; }
        public double[] getRow(int row) { return d[row]; }
        public double[] getColumn(int column) { return null; }
        public RealMatrix scalarAdd(double d) { return null; }
        public RealMatrix scalarMultiply(double d) { return null; }
    }

    // ==========================================
    // 1. Constructors & Factory Tests
    // ==========================================

    @Test
    public void testDefaultConstructor() {
        RealMatrixImpl m = new RealMatrixImpl();
        Assert.assertNull(m.getDataRef());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInvalidDimensionsRow() {
        new RealMatrixImpl(0, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInvalidDimensionsCol() {
        new RealMatrixImpl(5, -1);
    }

    @Test
    public void testConstructorValidDimensions() {
        RealMatrixImpl m = new RealMatrixImpl(2, 3);
        Assert.assertEquals(2, m.getRowDimension());
        Assert.assertEquals(3, m.getColumnDimension());
        Assert.assertEquals(0.0, m.getEntry(0, 0), TOLERANCE);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorNullArrayCopyTrue() {
        new RealMatrixImpl((double[][]) null);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorNullArrayCopyFalse() {
        new RealMatrixImpl((double[][]) null, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorEmptyRowCopyFalse() {
        new RealMatrixImpl(new double[0][0], false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorEmptyColumnCopyFalse() {
        new RealMatrixImpl(new double[][]{{}}, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorRaggedCopyFalse() {
        new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0}}, false);
    }

    @Test
    public void testConstructorVector() {
        double[] v = {1.0, 2.0, 3.0};
        RealMatrixImpl m = new RealMatrixImpl(v);
        Assert.assertEquals(3, m.getRowDimension());
        Assert.assertEquals(1, m.getColumnDimension());
        Assert.assertEquals(2.0, m.getEntry(1, 0), TOLERANCE);
    }

    @Test
    public void testCopyAndDataRef() {
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        RealMatrixImpl m = new RealMatrixImpl(data);
        RealMatrix copy = m.copy();
        Assert.assertEquals(m, copy);
        Assert.assertNotSame(m.getDataRef(), copy.getData());
        Assert.assertSame(m.getDataRef(), m.getDataRef());
    }

    // ==========================================
    // 2. Arithmetic & Matrix Operations
    // ==========================================

    @Test
    public void testAddAndSubtractSameImpl() {
        double[][] d1 = {{1.0, 2.0}, {3.0, 4.0}};
        double[][] d2 = {{5.0, 6.0}, {7.0, 8.0}};
        RealMatrixImpl m1 = new RealMatrixImpl(d1);
        RealMatrixImpl m2 = new RealMatrixImpl(d2);

        RealMatrix sum = m1.add(m2);
        Assert.assertEquals(6.0, sum.getEntry(0, 0), TOLERANCE);
        Assert.assertEquals(12.0, sum.getEntry(1, 1), TOLERANCE);

        RealMatrix diff = m2.subtract(m1);
        Assert.assertEquals(4.0, diff.getEntry(0, 0), TOLERANCE);
        Assert.assertEquals(4.0, diff.getEntry(1, 1), TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDimensionMismatch() {
        RealMatrixImpl m1 = new RealMatrixImpl(2, 2);
        RealMatrixImpl m2 = new RealMatrixImpl(2, 3);
        m1.add(m2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubtractDimensionMismatch() {
        RealMatrixImpl m1 = new RealMatrixImpl(2, 2);
        RealMatrixImpl m2 = new RealMatrixImpl(3, 2);
        m1.subtract(m2);
    }

    @Test
    public void testAddAndSubtractPolymorphicFallback() {
        double[][] d1 = {{1.0, 2.0}, {3.0, 4.0}};
        double[][] d2 = {{5.0, 6.0}, {7.0, 8.0}};
        RealMatrixImpl m1 = new RealMatrixImpl(d1);
        RealMatrix dummy = new DummyRealMatrix(d2);

        RealMatrix sum = m1.add(dummy);
        Assert.assertEquals(6.0, sum.getEntry(0, 0), TOLERANCE);

        RealMatrix diff = m1.subtract(dummy);
        Assert.assertEquals(-4.0, diff.getEntry(0, 0), TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddPolymorphicDimensionMismatch() {
        RealMatrixImpl m1 = new RealMatrixImpl(2, 2);
        RealMatrix dummy = new DummyRealMatrix(new double[][]{{1.0}});
        m1.add(dummy);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubtractPolymorphicDimensionMismatch() {
        RealMatrixImpl m1 = new RealMatrixImpl(2, 2);
        RealMatrix dummy = new DummyRealMatrix(new double[][]{{1.0}});
        m1.subtract(dummy);
    }

    @Test
    public void testScalarOperations() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1.0, -2.0}, {3.0, 4.0}});
        RealMatrix added = m.scalarAdd(2.0);
        Assert.assertEquals(3.0, added.getEntry(0, 0), TOLERANCE);
        Assert.assertEquals(0.0, added.getEntry(0, 1), TOLERANCE);

        RealMatrix multiplied = m.scalarMultiply(3.0);
        Assert.assertEquals(3.0, multiplied.getEntry(0, 0), TOLERANCE);
        Assert.assertEquals(-6.0, multiplied.getEntry(0, 1), TOLERANCE);
    }

    @Test
    public void testMultiply() {
        RealMatrixImpl m1 = new RealMatrixImpl(new double[][]{{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}});
        RealMatrixImpl m2 = new RealMatrixImpl(new double[][]{{7.0, 8.0}, {9.0, 1.0}, {2.0, 3.0}});

        RealMatrix product = m1.multiply(m2);
        Assert.assertEquals(2, product.getRowDimension());
        Assert.assertEquals(2, product.getColumnDimension());
        Assert.assertEquals(31.0, product.getEntry(0, 0), TOLERANCE);
        Assert.assertEquals(85.0, product.getEntry(1, 1), TOLERANCE);

        RealMatrix preProd = m2.preMultiply(m1);
        Assert.assertEquals(product, preProd);
    }

    @Test
    public void testMultiplyPolymorphic() {
        RealMatrixImpl m1 = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        RealMatrix dummy = new DummyRealMatrix(new double[][]{{2.0, 0.0}, {1.0, 2.0}});
        RealMatrix product = m1.multiply(dummy);
        Assert.assertEquals(4.0, product.getEntry(0, 0), TOLERANCE);
        Assert.assertEquals(4.0, product.getEntry(0, 1), TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMultiplyDimensionMismatch() {
        RealMatrixImpl m1 = new RealMatrixImpl(2, 3);
        RealMatrixImpl m2 = new RealMatrixImpl(2, 3);
        m1.multiply(m2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMultiplyPolymorphicDimensionMismatch() {
        RealMatrixImpl m1 = new RealMatrixImpl(2, 3);
        RealMatrix dummy = new DummyRealMatrix(new double[2][3]);
        m1.multiply(dummy);
    }

    // ==========================================
    // 3. Matrix Properties & Vector Multiply
    // ==========================================

    @Test
    public void testNormTraceTranspose() {
        double[][] data = {{1.0, -2.0, 3.0}, {-4.0, 5.0, -6.0}};
        RealMatrixImpl m = new RealMatrixImpl(data);

        // Max column sum: col 0 = 5.0, col 1 = 7.0, col 2 = 9.0 -> Norm = 9.0
        Assert.assertEquals(9.0, m.getNorm(), TOLERANCE);

        RealMatrix transpose = m.transpose();
        Assert.assertEquals(3, transpose.getRowDimension());
        Assert.assertEquals(2, transpose.getColumnDimension());
        Assert.assertEquals(-4.0, transpose.getEntry(0, 1), TOLERANCE);

        RealMatrixImpl square = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        Assert.assertEquals(5.0, square.getTrace(), TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetTraceNonSquare() {
        RealMatrixImpl m = new RealMatrixImpl(2, 3);
        m.getTrace();
    }

    @Test
    public void testOperateAndPreMultiply() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}, {5.0, 6.0}});
        double[] v = {1.0, 2.0};
        double[] result = m.operate(v);
        Assert.assertEquals(3, result.length);
        Assert.assertEquals(5.0, result[0], TOLERANCE);
        Assert.assertEquals(11.0, result[1], TOLERANCE);
        Assert.assertEquals(17.0, result[2], TOLERANCE);

        double[] vPre = {1.0, 2.0, 3.0};
        double[] preResult = m.preMultiply(vPre);
        Assert.assertEquals(2, preResult.length);
        Assert.assertEquals(22.0, preResult[0], TOLERANCE);
        Assert.assertEquals(28.0, preResult[1], TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOperateWrongLength() {
        RealMatrixImpl m = new RealMatrixImpl(2, 3);
        m.operate(new double[]{1.0, 2.0});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPreMultiplyWrongLength() {
        RealMatrixImpl m = new RealMatrixImpl(2, 3);
        m.preMultiply(new double[]{1.0});
    }

    // ==========================================
    // 4. SubMatrix & Element Access Tests
    // ==========================================

    @Test
    public void testGetSubMatrixRangeValid() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 0, 1, 2}
        });
        RealMatrix sub = m.getSubMatrix(1, 2, 1, 3);
        Assert.assertEquals(2, sub.getRowDimension());
        Assert.assertEquals(3, sub.getColumnDimension());
        Assert.assertEquals(6.0, sub.getEntry(0, 0), TOLERANCE);
        Assert.assertEquals(2.0, sub.getEntry(1, 2), TOLERANCE);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrixRangeInvalidStartRow() {
        RealMatrixImpl m = new RealMatrixImpl(3, 3);
        m.getSubMatrix(-1, 1, 0, 1);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrixRangeInvalidRowOrder() {
        RealMatrixImpl m = new RealMatrixImpl(3, 3);
        m.getSubMatrix(2, 1, 0, 1);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrixRangeInvalidEndRow() {
        RealMatrixImpl m = new RealMatrixImpl(3, 3);
        m.getSubMatrix(0, 4, 0, 1);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrixRangeInvalidCol() {
        RealMatrixImpl m = new RealMatrixImpl(3, 3);
        m.getSubMatrix(0, 1, 1, 0);
    }

    @Test
    public void testGetSubMatrixIndicesValid() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        });
        RealMatrix sub = m.getSubMatrix(new int[]{0, 2}, new int[]{1, 2});
        Assert.assertEquals(2, sub.getRowDimension());
        Assert.assertEquals(2, sub.getColumnDimension());
        Assert.assertEquals(2.0, sub.getEntry(0, 0), TOLERANCE);
        Assert.assertEquals(9.0, sub.getEntry(1, 1), TOLERANCE);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrixEmptyIndices() {
        RealMatrixImpl m = new RealMatrixImpl(3, 3);
        m.getSubMatrix(new int[0], new int[]{1});
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrixOutOfBoundsIndices() {
        RealMatrixImpl m = new RealMatrixImpl(3, 3);
        m.getSubMatrix(new int[]{0, 5}, new int[]{1});
    }

    @Test
    public void testSetSubMatrixValid() {
        RealMatrixImpl m = new RealMatrixImpl(3, 3);
        double[][] sub = {{1.0, 2.0}, {3.0, 4.0}};
        m.setSubMatrix(sub, 1, 1);
        Assert.assertEquals(1.0, m.getEntry(1, 1), TOLERANCE);
        Assert.assertEquals(4.0, m.getEntry(2, 2), TOLERANCE);
    }

    @Test
    public void testSetSubMatrixOnUninitializedMatrix() {
        RealMatrixImpl m = new RealMatrixImpl();
        double[][] sub = {{1.0, 2.0}, {3.0, 4.0}};
        m.setSubMatrix(sub, 0, 0);
        Assert.assertEquals(2, m.getRowDimension());
        Assert.assertEquals(1.0, m.getEntry(0, 0), TOLERANCE);
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetSubMatrixOnUninitializedMatrixNonZeroOffset() {
        RealMatrixImpl m = new RealMatrixImpl();
        m.setSubMatrix(new double[][]{{1.0}}, 1, 0);
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetSubMatrixNegativeIndex() {
        RealMatrixImpl m = new RealMatrixImpl(3, 3);
        m.setSubMatrix(new double[][]{{1.0}}, -1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSubMatrixEmpty() {
        RealMatrixImpl m = new RealMatrixImpl(3, 3);
        m.setSubMatrix(new double[0][0], 0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSubMatrixRagged() {
        RealMatrixImpl m = new RealMatrixImpl(3, 3);
        m.setSubMatrix(new double[][]{{1.0, 2.0}, {3.0}}, 0, 0);
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetSubMatrixOutOfBounds() {
        RealMatrixImpl m = new RealMatrixImpl(2, 2);
        m.setSubMatrix(new double[][]{{1.0, 2.0}, {3.0, 4.0}}, 1, 1);
    }

    @Test
    public void testRowAndColumnGetters() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});

        RealMatrix rowM = m.getRowMatrix(1);
        Assert.assertEquals(1, rowM.getRowDimension());
        Assert.assertEquals(3.0, rowM.getEntry(0, 0), TOLERANCE);

        RealMatrix colM = m.getColumnMatrix(0);
        Assert.assertEquals(2, colM.getRowDimension());
        Assert.assertEquals(3.0, colM.getEntry(1, 0), TOLERANCE);

        double[] row = m.getRow(0);
        Assert.assertArrayEquals(new double[]{1.0, 2.0}, row, TOLERANCE);

        double[] col = m.getColumn(1);
        Assert.assertArrayEquals(new double[]{2.0, 4.0}, col, TOLERANCE);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetRowInvalid() {
        RealMatrixImpl m = new RealMatrixImpl(2, 2);
        m.getRow(2);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetColumnInvalid() {
        RealMatrixImpl m = new RealMatrixImpl(2, 2);
        m.getColumn(-1);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetRowMatrixInvalid() {
        RealMatrixImpl m = new RealMatrixImpl(2, 2);
        m.getRowMatrix(-1);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetColumnMatrixInvalid() {
        RealMatrixImpl m = new RealMatrixImpl(2, 2);
        m.getColumnMatrix(3);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetEntryInvalid() {
        RealMatrixImpl m = new RealMatrixImpl(2, 2);
        m.getEntry(5, 5);
    }

    // ==========================================
    // 5. LU Decomposition, Solve, Invert, Det
    // ==========================================

    @Test
    public void testLUDecomposeAndSolve() {
        // Linear system:
        //  2x + y - z = 8
        // -3x - y + 2z = -11
        // -2x + y + 2z = -3
        // Solution: x = 2, y = 3, z = -1
        RealMatrixImpl A = new RealMatrixImpl(new double[][]{
                {2.0, 1.0, -1.0},
                {-3.0, -1.0, 2.0},
                {-2.0, 1.0, 2.0}
        });

        double[] b = {8.0, -11.0, -3.0};
        double[] x = A.solve(b);
        Assert.assertEquals(2.0, x[0], 1E-6);
        Assert.assertEquals(3.0, x[1], 1E-6);
        Assert.assertEquals(-1.0, x[2], 1E-6);

        RealMatrix bMatrix = new RealMatrixImpl(new double[][]{{8.0}, {-11.0}, {-3.0}});
        RealMatrix xMatrix = A.solve(bMatrix);
        Assert.assertEquals(2.0, xMatrix.getEntry(0, 0), 1E-6);

        Assert.assertFalse(A.isSingular());
        Assert.assertEquals(-3.0, A.getDeterminant(), 1E-6);

        RealMatrix inv = A.inverse();
        RealMatrix identity = A.multiply(inv);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Assert.assertEquals(i == j ? 1.0 : 0.0, identity.getEntry(i, j), 1E-6);
            }
        }

        Assert.assertNotNull(A.getLUMatrix());
        Assert.assertNotNull(A.getPermutation());
    }

    @Test(expected = InvalidMatrixException.class)
    public void testLUDecomposeNonSquare() {
        RealMatrixImpl m = new RealMatrixImpl(2, 3);
        m.luDecompose();
    }

    @Test(expected = InvalidMatrixException.class)
    public void testLUDecomposeSingular() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{
                {1.0, 2.0},
                {2.0, 4.0}
        });
        m.luDecompose();
    }

    @Test
    public void testDeterminantSingular() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{
                {1.0, 2.0},
                {2.0, 4.0}
        });
        Assert.assertTrue(m.isSingular());
        Assert.assertEquals(0.0, m.getDeterminant(), TOLERANCE);
    }

    @Test(expected = InvalidMatrixException.class)
    public void testDeterminantNonSquare() {
        RealMatrixImpl m = new RealMatrixImpl(2, 3);
        m.getDeterminant();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveVectorDimensionMismatch() {
        RealMatrixImpl m = new RealMatrixImpl(2, 2);
        m.solve(new double[]{1.0, 2.0, 3.0});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveMatrixDimensionMismatch() {
        RealMatrixImpl m = new RealMatrixImpl(2, 2);
        RealMatrix b = new RealMatrixImpl(3, 1);
        m.solve(b);
    }

    @Test(expected = InvalidMatrixException.class)
    public void testSolveNonSquare() {
        RealMatrixImpl m = new RealMatrixImpl(2, 3);
        m.solve(new RealMatrixImpl(2, 1));
    }

    @Test(expected = InvalidMatrixException.class)
    public void testSolveSingularMatrix() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {2.0, 4.0}});
        m.solve(new RealMatrixImpl(new double[][]{{1.0}, {2.0}}));
    }

    // ==========================================
    // 6. Object Methods (equals, hashCode, toString)
    // ==========================================

    @Test
    public void testEqualsAndHashCode() {
        RealMatrixImpl m1 = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        RealMatrixImpl m2 = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        RealMatrixImpl mDiffVal = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 5.0}});
        RealMatrixImpl mDiffDim = new RealMatrixImpl(new double[][]{{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}});

        Assert.assertTrue(m1.equals(m1));
        Assert.assertTrue(m1.equals(m2));
        Assert.assertEquals(m1.hashCode(), m2.hashCode());

        Assert.assertFalse(m1.equals(null));
        Assert.assertFalse(m1.equals("Not a matrix"));
        Assert.assertFalse(m1.equals(mDiffVal));
        Assert.assertFalse(m1.equals(mDiffDim));
    }

    @Test
    public void testToString() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        Assert.assertEquals("RealMatrixImpl{{1.0,2.0},{3.0,4.0}}", m.toString());

        RealMatrixImpl empty = new RealMatrixImpl();
        Assert.assertEquals("RealMatrixImpl{}", empty.toString());
    }
}