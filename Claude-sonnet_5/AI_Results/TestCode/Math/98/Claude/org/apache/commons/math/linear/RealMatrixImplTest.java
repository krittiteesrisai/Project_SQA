package org.apache.commons.math.linear;

import static org.junit.Assert.*;
import org.junit.Test;

public class RealMatrixImplTest {

    private static final double DELTA = 1e-9;

    // ---------- Helper ----------
    private void assertMatrixEquals(double[][] expected, double[][] actual, double delta) {
        assertEquals("row count", expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals("col count row " + i, expected[i].length, actual[i].length);
            for (int j = 0; j < expected[i].length; j++) {
                assertEquals("entry[" + i + "][" + j + "]", expected[i][j], actual[i][j], delta);
            }
        }
    }

    /**
     * Stub implementation of RealMatrix (NOT a RealMatrixImpl) used to exercise
     * the catch(ClassCastException) branches in add/subtract/multiply(RealMatrix).
     * Methods inferred from all public methods of RealMatrixImpl.
     */
    private static class OtherRealMatrix implements RealMatrix {
        private final RealMatrixImpl delegate;
        OtherRealMatrix(double[][] d) { delegate = new RealMatrixImpl(d); }

        public RealMatrix copy() { return delegate.copy(); }
        public RealMatrix add(RealMatrix m) { return delegate.add(m); }
        public RealMatrix subtract(RealMatrix m) { return delegate.subtract(m); }
        public RealMatrix scalarAdd(double d) { return delegate.scalarAdd(d); }
        public RealMatrix scalarMultiply(double d) { return delegate.scalarMultiply(d); }
        public RealMatrix multiply(RealMatrix m) { return delegate.multiply(m); }
        public RealMatrix preMultiply(RealMatrix m) { return delegate.preMultiply(m); }
        public double[][] getData() { return delegate.getData(); }
        public double[][] getDataRef() { return delegate.getDataRef(); }
        public double getNorm() { return delegate.getNorm(); }
        public RealMatrix getSubMatrix(int sr,int er,int sc,int ec) { return delegate.getSubMatrix(sr,er,sc,ec); }
        public RealMatrix getSubMatrix(int[] rows,int[] cols) { return delegate.getSubMatrix(rows,cols); }
        public void setSubMatrix(double[][] sub,int row,int col) { delegate.setSubMatrix(sub,row,col); }
        public RealMatrix getRowMatrix(int row) { return delegate.getRowMatrix(row); }
        public RealMatrix getColumnMatrix(int col) { return delegate.getColumnMatrix(col); }
        public double[] getRow(int row) { return delegate.getRow(row); }
        public double[] getColumn(int col) { return delegate.getColumn(col); }
        public double getEntry(int row,int col) { return delegate.getEntry(row,col); }
        public RealMatrix transpose() { return delegate.transpose(); }
        public RealMatrix inverse() { return delegate.inverse(); }
        public double getDeterminant() { return delegate.getDeterminant(); }
        public boolean isSquare() { return delegate.isSquare(); }
        public boolean isSingular() { return delegate.isSingular(); }
        public int getRowDimension() { return delegate.getRowDimension(); }
        public int getColumnDimension() { return delegate.getColumnDimension(); }
        public double getTrace() { return delegate.getTrace(); }
        public double[] operate(double[] v) { return delegate.operate(v); }
        public double[] preMultiply(double[] v) { return delegate.preMultiply(v); }
        public double[] solve(double[] b) { return delegate.solve(b); }
        public RealMatrix solve(RealMatrix b) { return delegate.solve(b); }
    }

    // ==================== Constructors ====================

    @Test
    public void testDefaultConstructor() {
        RealMatrixImpl m = new RealMatrixImpl();
        assertNull(m.getDataRef());
    }

    @Test
    public void testDimensionConstructorValid() {
        RealMatrixImpl m = new RealMatrixImpl(3, 2);
        assertEquals(3, m.getRowDimension());
        assertEquals(2, m.getColumnDimension());
        assertMatrixEquals(new double[][]{{0,0},{0,0},{0,0}}, m.getData(), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDimensionConstructorInvalidRow() {
        new RealMatrixImpl(0, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDimensionConstructorInvalidColumn() {
        new RealMatrixImpl(2, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDimensionConstructorBothInvalid() {
        new RealMatrixImpl(-1, -1);
    }

    @Test
    public void testArrayConstructorCopiesData() {
        double[][] d = {{1, 2}, {3, 4}};
        RealMatrixImpl m = new RealMatrixImpl(d);
        d[0][0] = 99; // modify original
        assertEquals(1.0, m.getEntry(0, 0), DELTA); // unaffected -> proves copy
    }

    @Test(expected = NullPointerException.class)
    public void testArrayConstructorNullThrows() {
        double[][] d = null;
        new RealMatrixImpl(d);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayConstructorRaggedThrows() {
        double[][] d = {{1, 2}, {3}};
        new RealMatrixImpl(d);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayConstructorEmptyRowsThrows() {
        double[][] d = new double[0][];
        new RealMatrixImpl(d);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayConstructorEmptyColumnsThrows() {
        double[][] d = {{}};
        new RealMatrixImpl(d);
    }

    @Test
    public void testTwoArgConstructorCopyTrue() {
        double[][] d = {{1, 2}, {3, 4}};
        RealMatrixImpl m = new RealMatrixImpl(d, true);
        d[0][0] = 100;
        assertEquals(1.0, m.getEntry(0, 0), DELTA);
    }

    @Test
    public void testTwoArgConstructorCopyFalseReferences() {
        double[][] d = {{1, 2}, {3, 4}};
        RealMatrixImpl m = new RealMatrixImpl(d, false);
        assertSame(d, m.getDataRef());
    }

    @Test(expected = NullPointerException.class)
    public void testTwoArgConstructorCopyFalseNullThrows() {
        new RealMatrixImpl((double[][]) null, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTwoArgConstructorCopyFalseEmptyRowsThrows() {
        new RealMatrixImpl(new double[0][], false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTwoArgConstructorCopyFalseEmptyColumnsThrows() {
        new RealMatrixImpl(new double[][]{{}}, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTwoArgConstructorCopyFalseRaggedThrows() {
        new RealMatrixImpl(new double[][]{{1, 2}, {3}}, false);
    }

    @Test
    public void testColumnVectorConstructor() {
        RealMatrixImpl m = new RealMatrixImpl(new double[]{1, 2, 3});
        assertEquals(3, m.getRowDimension());
        assertEquals(1, m.getColumnDimension());
        assertMatrixEquals(new double[][]{{1},{2},{3}}, m.getData(), DELTA);
    }

    @Test(expected = NullPointerException.class)
    public void testColumnVectorConstructorNullThrows() {
        double[] v = null;
        new RealMatrixImpl(v);
    }

    // ==================== copy() ====================

    @Test
    public void testCopy() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1, 2}, {3, 4}});
        RealMatrix c = m.copy();
        assertMatrixEquals(m.getData(), c.getData(), DELTA);
        assertNotSame(m.getDataRef(), ((RealMatrixImpl) c).getDataRef());
    }

    // ==================== add ====================

    @Test
    public void testAddRealMatrixImplValid() {
        RealMatrixImpl a = new RealMatrixImpl(new double[][]{{1, 2}, {3, 4}});
        RealMatrixImpl b = new RealMatrixImpl(new double[][]{{5, 6}, {7, 8}});
        RealMatrixImpl r = a.add(b);
        assertMatrixEquals(new double[][]{{6, 8}, {10, 12}}, r.getData(), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddRealMatrixImplDimensionMismatch() {
        RealMatrixImpl a = new RealMatrixImpl(new double[][]{{1, 2}});
        RealMatrixImpl b = new RealMatrixImpl(new double[][]{{1, 2}, {3, 4}});
        a.add(b);
    }

    @Test
    public void testAddRealMatrix_NoCastException() {
        RealMatrixImpl a = new RealMatrixImpl(new double[][]{{1, 2}});
        RealMatrix b = new RealMatrixImpl(new double[][]{{3, 4}});
        RealMatrix r = a.add(b);
        assertMatrixEquals(new double[][]{{4, 6}}, r.getData(), DELTA);
    }

    @Test
    public void testAddRealMatrix_CastExceptionBranchValid() {
        RealMatrixImpl a = new RealMatrixImpl(new double[][]{{1, 2}});
        RealMatrix other = new OtherRealMatrix(new double[][]{{3, 4}});
        RealMatrix r = a.add(other);
        assertMatrixEquals(new double[][]{{4, 6}}, r.getData(), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddRealMatrix_CastExceptionBranchDimensionMismatch() {
        RealMatrixImpl a = new RealMatrixImpl(new double[][]{{1, 2}});
        RealMatrix other = new OtherRealMatrix(new double[][]{{1, 2, 3}});
        a.add(other);
    }

    // ==================== subtract ====================

    @Test
    public void testSubtractRealMatrixImplValid() {
        RealMatrixImpl a = new RealMatrixImpl(new double[][]{{5, 6}, {7, 8}});
        RealMatrixImpl b = new RealMatrixImpl(new double[][]{{1, 2}, {3, 4}});
        RealMatrixImpl r = a.subtract(b);
        assertMatrixEquals(new double[][]{{4, 4}, {4, 4}}, r.getData(), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubtractRealMatrixImplDimensionMismatch() {
        RealMatrixImpl a = new RealMatrixImpl(new double[][]{{1, 2}});
        RealMatrixImpl b = new RealMatrixImpl(new double[][]{{1, 2}, {3, 4}});
        a.subtract(b);
    }

    @Test
    public void testSubtractRealMatrix_CastExceptionBranchValid() {
        RealMatrixImpl a = new RealMatrixImpl(new double[][]{{5, 6}});
        RealMatrix other = new OtherRealMatrix(new double[][]{{1, 2}});
        RealMatrix r = a.subtract(other);
        assertMatrixEquals(new double[][]{{4, 4}}, r.getData(), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubtractRealMatrix_CastExceptionBranchDimensionMismatch() {
        RealMatrixImpl a = new RealMatrixImpl(new double[][]{{1, 2}});
        RealMatrix other = new OtherRealMatrix(new double[][]{{1}});
        a.subtract(other);
    }

    // ==================== scalarAdd / scalarMultiply ====================

    @Test
    public void testScalarAdd() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1, 2}, {3, 4}});
        RealMatrix r = m.scalarAdd(10);
        assertMatrixEquals(new double[][]{{11, 12}, {13, 14}}, r.getData(), DELTA);
    }

    @Test
    public void testScalarMultiply() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1, 2}, {3, 4}});
        RealMatrix r = m.scalarMultiply(2);
        assertMatrixEquals(new double[][]{{2, 4}, {6, 8}}, r.getData(), DELTA);
    }

    // ==================== multiply ====================

    @Test
    public void testMultiplyRealMatrixImplValid() {
        RealMatrixImpl a = new RealMatrixImpl(new double[][]{{1, 2}, {3, 4}});
        RealMatrixImpl b = new RealMatrixImpl(new double[][]{{5, 6}, {7, 8}});
        RealMatrixImpl r = a.multiply(b);
        assertMatrixEquals(new double[][]{{19, 22}, {43, 50}}, r.getData(), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMultiplyRealMatrixImplDimensionMismatch() {
        RealMatrixImpl a = new RealMatrixImpl(new double[][]{{1, 2}});
        RealMatrixImpl b = new RealMatrixImpl(new double[][]{{1, 2}});
        a.multiply(b);
    }

    @Test
    public void testMultiplyRealMatrix_CastExceptionBranchValid() {
        RealMatrixImpl a = new RealMatrixImpl(new double[][]{{1, 2}});
        RealMatrix other = new OtherRealMatrix(new double[][]{{1}, {1}});
        RealMatrix r = a.multiply(other);
        assertMatrixEquals(new double[][]{{3}}, r.getData(), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMultiplyRealMatrix_CastExceptionBranchDimensionMismatch() {
        RealMatrixImpl a = new RealMatrixImpl(new double[][]{{1, 2}});
        RealMatrix other = new OtherRealMatrix(new double[][]{{1}, {1}, {1}});
        a.multiply(other);
    }

    // ==================== preMultiply(RealMatrix) ====================

    @Test
    public void testPreMultiplyRealMatrix() {
        RealMatrixImpl a = new RealMatrixImpl(new double[][]{{1, 2}, {3, 4}});
        RealMatrixImpl b = new RealMatrixImpl(new double[][]{{5, 6}, {7, 8}});
        RealMatrix r1 = a.preMultiply(b); // == b.multiply(a)
        RealMatrix r2 = b.multiply(a);
        assertMatrixEquals(r2.getData(), r1.getData(), DELTA);
    }

    // ==================== getData / getDataRef ====================

    @Test
    public void testGetDataIsCopy() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1, 2}});
        double[][] d = m.getData();
        d[0][0] = 999;
        assertEquals(1.0, m.getEntry(0, 0), DELTA);
    }

    @Test
    public void testGetDataRefIsReference() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1, 2}});
        double[][] d = m.getDataRef();
        d[0][0] = 999;
        assertEquals(999.0, m.getEntry(0, 0), DELTA);
    }

    // ==================== getNorm ====================

    @Test
    public void testGetNorm() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1, -2}, {-3, 4}});
        // col0 sum abs = 4, col1 sum abs = 6 -> max = 6
        assertEquals(6.0, m.getNorm(), DELTA);
    }

    // ==================== getSubMatrix(4 ints) ====================

    @Test
    public void testGetSubMatrixValid() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2,3},{4,5,6},{7,8,9}});
        RealMatrix s = m.getSubMatrix(0, 1, 1, 2);
        assertMatrixEquals(new double[][]{{2,3},{5,6}}, s.getData(), DELTA);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrixStartRowNegative() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2},{3,4}});
        m.getSubMatrix(-1, 1, 0, 1);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrixStartRowGreaterThanEndRow() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2},{3,4}});
        m.getSubMatrix(1, 0, 0, 1);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrixEndRowTooLarge() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2},{3,4}});
        m.getSubMatrix(0, 3, 0, 1); // endRow(3) > data.length(2)+... clearly too large
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrixStartColumnNegative() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2},{3,4}});
        m.getSubMatrix(0, 1, -1, 1);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrixStartColumnGreaterThanEndColumn() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2},{3,4}});
        m.getSubMatrix(0, 1, 1, 0);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrixEndColumnTooLarge() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2},{3,4}});
        m.getSubMatrix(0, 1, 0, 3);
    }

    /**
     * Boundary off-by-one: data.length == 3 (valid row idx 0..2).
     * Check uses (endRow > data.length) i.e. endRow>3, so endRow==3 passes the
     * guard but then loop accesses data[3] -> ArrayIndexOutOfBoundsException.
     * This documents actual (possibly faulty) boundary behavior in source.
     */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetSubMatrixEndRowBoundaryOffByOne() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2,3},{4,5,6},{7,8,9}});
        m.getSubMatrix(0, 3, 0, 0); // endRow == data.length (3) -> passes check, then fails internally
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetSubMatrixEndColumnBoundaryOffByOne() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2,3},{4,5,6},{7,8,9}});
        m.getSubMatrix(0, 0, 0, 3); // endColumn == data[0].length (3) -> passes check, fails in arraycopy
    }

    // ==================== getSubMatrix(int[], int[]) ====================

    @Test
    public void testGetSubMatrixArraysValid() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2,3},{4,5,6},{7,8,9}});
        RealMatrix s = m.getSubMatrix(new int[]{0, 2}, new int[]{1, 2});
        assertMatrixEquals(new double[][]{{2,3},{8,9}}, s.getData(), DELTA);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrixArraysEmptyRows() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2},{3,4}});
        m.getSubMatrix(new int[0], new int[]{0, 1});
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrixArraysEmptyColumns() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2},{3,4}});
        m.getSubMatrix(new int[]{0, 1}, new int[0]);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrixArraysOutOfBounds() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2},{3,4}});
        m.getSubMatrix(new int[]{0, 5}, new int[]{0, 1});
    }

    // ==================== setSubMatrix ====================

    @Test
    public void testSetSubMatrixValid() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2,3,4},{5,6,7,8},{9,0,1,2}});
        m.setSubMatrix(new double[][]{{3,4},{5,6}}, 1, 1);
        assertMatrixEquals(new double[][]{{1,2,3,4},{5,3,4,8},{9,5,6,2}}, m.getData(), DELTA);
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetSubMatrixNegativeRow() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2},{3,4}});
        m.setSubMatrix(new double[][]{{1}}, -1, 0);
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetSubMatrixNegativeColumn() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2},{3,4}});
        m.setSubMatrix(new double[][]{{1}}, 0, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSubMatrixEmptyRows() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2},{3,4}});
        m.setSubMatrix(new double[0][], 0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSubMatrixEmptyColumns() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2},{3,4}});
        m.setSubMatrix(new double[][]{{}}, 0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSubMatrixRaggedRows() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2},{3,4}});
        m.setSubMatrix(new double[][]{{1,2},{3}}, 0, 0);
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetSubMatrixDataNullWithPositiveRow() {
        RealMatrixImpl m = new RealMatrixImpl(); // data == null
        m.setSubMatrix(new double[][]{{1,2}}, 1, 0);
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetSubMatrixExceedsRowDimension() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2},{3,4}});
        m.setSubMatrix(new double[][]{{1,2},{3,4}}, 1, 0); // 2 rows + row(1) > rowDim(2)
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetSubMatrixExceedsColumnDimension() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2},{3,4}});
        m.setSubMatrix(new double[][]{{1,2}}, 0, 1); // 2 cols + col(1) > colDim(2)
    }

    // ==================== getRowMatrix / getColumnMatrix ====================

    @Test
    public void testGetRowMatrixValid() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2,3},{4,5,6}});
        RealMatrix r = m.getRowMatrix(1);
        assertMatrixEquals(new double[][]{{4,5,6}}, r.getData(), DELTA);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetRowMatrixInvalid() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2},{3,4}});
        m.getRowMatrix(-1);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetRowMatrixOutOfUpperBound() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2},{3,4}});
        m.getRowMatrix(2);
    }

    @Test
    public void testGetColumnMatrixValid() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2,3},{4,5,6}});
        RealMatrix c = m.getColumnMatrix(2);
        assertMatrixEquals(new double[][]{{3},{6}}, c.getData(), DELTA);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetColumnMatrixInvalid() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2},{3,4}});
        m.getColumnMatrix(-1);
    }

    // ==================== getRow / getColumn ====================

    @Test
    public void testGetRowValid() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2,3},{4,5,6}});
        assertArrayEquals(new double[]{4,5,6}, m.getRow(1), DELTA);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetRowInvalid() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2},{3,4}});
        m.getRow(5);
    }

    @Test
    public void testGetColumnValid() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2,3},{4,5,6}});
        assertArrayEquals(new double[]{3,6}, m.getColumn(2), DELTA);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetColumnInvalid() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2},{3,4}});
        m.getColumn(5);
    }

    // ==================== getEntry ====================

    @Test
    public void testGetEntryValid() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2},{3,4}});
        assertEquals(4.0, m.getEntry(1,1), DELTA);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetEntryInvalidRow() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2},{3,4}});
        m.getEntry(-1, 0);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetEntryInvalidColumn() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2},{3,4}});
        m.getEntry(0, 5);
    }

    // ==================== transpose ====================

    @Test
    public void testTranspose() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2,3},{4,5,6}});
        RealMatrix t = m.transpose();
        assertMatrixEquals(new double[][]{{1,4},{2,5},{3,6}}, t.getData(), DELTA);
    }

    // ==================== inverse ====================

    @Test
    public void testInverseValid() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{4,7},{2,6}});
        RealMatrix inv = m.inverse();
        assertMatrixEquals(new double[][]{{0.6,-0.7},{-0.2,0.4}}, inv.getData(), 1e-6);
    }

    @Test(expected = InvalidMatrixException.class)
    public void testInverseSingularThrows() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2},{2,4}});
        m.inverse();
    }

    // ==================== getDeterminant ====================

    @Test(expected = InvalidMatrixException.class)
    public void testGetDeterminantNonSquareThrows() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2,3},{4,5,6}});
        m.getDeterminant();
    }

    @Test
    public void testGetDeterminantSingularReturnsZero() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2},{2,4}});
        assertEquals(0d, m.getDeterminant(), DELTA);
    }

    @Test
    public void testGetDeterminantValid() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{4,7},{2,6}});
        assertEquals(10d, m.getDeterminant(), DELTA);
    }

    @Test
    public void testGetDeterminantPivotCase() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{0,1},{1,0}});
        assertEquals(-1d, m.getDeterminant(), DELTA);
    }

    // ==================== isSquare ====================

    @Test
    public void testIsSquareTrue() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2},{3,4}});
        assertTrue(m.isSquare());
    }

    @Test
    public void testIsSquareFalse() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2,3},{4,5,6}});
        assertFalse(m.isSquare());
    }

    // ==================== isSingular ====================

    @Test
    public void testIsSingularTrueWhenLuNullAndDecomposeFails() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2},{2,4}});
        assertTrue(m.isSingular());
    }

    @Test
    public void testIsSingularFalseWhenLuNullAndDecomposeSucceeds() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,0},{0,1}});
        assertFalse(m.isSingular());
    }

    @Test
    public void testIsSingularFalseWhenLuAlreadyCached() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,0},{0,1}});
        m.luDecompose(); // lu != null now
        assertFalse(m.isSingular()); // else branch
    }

    // ==================== getRowDimension / getColumnDimension ====================

    @Test
    public void testGetRowAndColumnDimension() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2,3},{4,5,6}});
        assertEquals(2, m.getRowDimension());
        assertEquals(3, m.getColumnDimension());
    }

    // ==================== getTrace ====================

    @Test
    public void testGetTraceValid() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2},{3,4}});
        assertEquals(5d, m.getTrace(), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetTraceNonSquareThrows() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2,3},{4,5,6}});
        m.getTrace();
    }

    // ==================== operate ====================

    @Test
    public void testOperateValid() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2},{3,4}});
        double[] r = m.operate(new double[]{1,1});
        assertArrayEquals(new double[]{3,7}, r, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOperateWrongLengthThrows() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2},{3,4}});
        m.operate(new double[]{1,1,1});
    }

    // ==================== preMultiply(double[]) ====================

    @Test
    public void testPreMultiplyVectorValid() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2},{3,4}});
        double[] r = m.preMultiply(new double[]{1,1});
        assertArrayEquals(new double[]{4,6}, r, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPreMultiplyVectorWrongLengthThrows() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2},{3,4}});
        m.preMultiply(new double[]{1,1,1});
    }

    // ==================== solve(double[]) ====================

    @Test
    public void testSolveVectorValid() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{2,0},{0,2}});
        double[] r = m.solve(new double[]{4,6});
        assertArrayEquals(new double[]{2,3}, r, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveVectorWrongLengthThrows() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{2,0},{0,2}});
        m.solve(new double[]{1,2,3});
    }

    // ==================== solve(RealMatrix) ====================

    @Test
    public void testSolveMatrixValid() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{2,0},{0,2}});
        RealMatrix b = new RealMatrixImpl(new double[][]{{4},{6}});
        RealMatrix sol = m.solve(b);
        assertMatrixEquals(new double[][]{{2},{3}}, sol.getData(), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveMatrixRowDimensionMismatchThrows() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{2,0},{0,2}});
        RealMatrix b = new RealMatrixImpl(new double[][]{{4}});
        m.solve(b);
    }

    @Test(expected = InvalidMatrixException.class)
    public void testSolveMatrixNotSquareThrows() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2,3},{4,5,6}});
        RealMatrix b = new RealMatrixImpl(new double[][]{{1},{2}});
        m.solve(b);
    }

    @Test(expected = InvalidMatrixException.class)
    public void testSolveMatrixSingularThrows() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2},{2,4}});
        RealMatrix b = new RealMatrixImpl(new double[][]{{1},{2}});
        m.solve(b);
    }

    // ==================== luDecompose ====================

    @Test(expected = InvalidMatrixException.class)
    public void testLuDecomposeNonSquareThrows() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2,3},{4,5,6}});
        m.luDecompose();
    }

    @Test(expected = InvalidMatrixException.class)
    public void testLuDecomposeSingularThrows() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2},{2,4}});
        m.luDecompose();
    }

    @Test
    public void testLuDecomposePivotBranch() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{0,1},{1,0}});
        m.luDecompose(); // triggers max != col branch
        assertEquals(-1d, m.getDeterminant(), DELTA);
    }

    @Test
    public void testLuDecomposeNoPivotBranch() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,0},{0,1}});
        m.luDecompose(); // max == col throughout
        assertEquals(1d, m.getDeterminant(), DELTA);
    }

    // ==================== toString ====================

    @Test
    public void testToStringWithData() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2},{3,4}});
        String s = m.toString();
        assertTrue(s.startsWith("RealMatrixImpl{"));
        assertTrue(s.contains("1.0"));
        assertTrue(s.contains("4.0"));
    }

    @Test
    public void testToStringWithNullData() {
        RealMatrixImpl m = new RealMatrixImpl();
        assertEquals("RealMatrixImpl{}", m.toString());
    }

    // ==================== equals ====================

    @Test
    public void testEqualsSameInstance() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2}});
        assertTrue(m.equals(m));
    }

    @Test
    public void testEqualsNull() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2}});
        assertFalse(m.equals(null));
    }

    @Test
    public void testEqualsNotInstanceOfRealMatrixImpl() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2}});
        // Even though OtherRealMatrix numerically equal, equals() requires
        // instanceof RealMatrixImpl specifically -> expect false.
        RealMatrix other = new OtherRealMatrix(new double[][]{{1,2}});
        assertFalse(m.equals(other));
    }

    @Test
    public void testEqualsDifferentType() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1,2}});
        assertFalse(m.equals("not a matrix"));
    }

    @Test
    public void testEqualsDimensionMismatch() {
        RealMatrixImpl a = new RealMatrixImpl(new double[][]{{1,2}});
        RealMatrixImpl b = new RealMatrixImpl(new double[][]{{1,2,3}});
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsDifferentValues() {
        RealMatrixImpl a = new RealMatrixImpl(new double[][]{{1,2}});
        RealMatrixImpl b = new RealMatrixImpl(new double[][]{{1,3}});
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsEqualMatrices() {
        RealMatrixImpl a = new RealMatrixImpl(new double[][]{{1,2},{3,4}});
        RealMatrixImpl b = new RealMatrixImpl(new double[][]{{1,2},{3,4}});
        assertTrue(a.equals(b));
    }

    // ==================== hashCode ====================

    @Test
    public void testHashCodeConsistentForEqualObjects() {
        RealMatrixImpl a = new RealMatrixImpl(new double[][]{{1,2},{3,4}});
        RealMatrixImpl b = new RealMatrixImpl(new double[][]{{1,2},{3,4}});
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testHashCodeStableAcrossCalls() {
        RealMatrixImpl a = new RealMatrixImpl(new double[][]{{1,2},{3,4}});
        int h1 = a.hashCode();
        int h2 = a.hashCode();
        assertEquals(h1, h2);
    }
}
