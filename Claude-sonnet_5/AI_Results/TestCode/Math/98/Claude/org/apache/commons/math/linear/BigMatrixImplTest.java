package org.apache.commons.math.linear;

import static org.junit.Assert.*;
import org.junit.Test;

import java.math.BigDecimal;

// Explicit imports per requirement #2 (redundant since same package, but harmless/legal in Java)
import org.apache.commons.math.linear.BigMatrixImpl;
import org.apache.commons.math.linear.BigMatrix;
import org.apache.commons.math.linear.MatrixIndexException;
import org.apache.commons.math.linear.InvalidMatrixException;

public class BigMatrixImplTest {

    // ---------- helpers ----------

    private static BigDecimal bd(double v) {
        return new BigDecimal(v);
    }

    private static BigDecimal[][] toBD(double[][] d) {
        BigDecimal[][] out = new BigDecimal[d.length][d[0].length];
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[0].length; j++) {
                out[i][j] = new BigDecimal(d[i][j]);
            }
        }
        return out;
    }

    /** Compare BigDecimal by numeric value (ignores scale differences from divide/multiply). */
    private static void assertBDEquals(BigDecimal expected, BigDecimal actual) {
        assertEquals(0, expected.compareTo(actual));
    }

    // ---------------- Constructors ----------------

    @Test
    public void testNoArgConstructor() {
        BigMatrixImpl m = new BigMatrixImpl();
        assertEquals("BigMatrixImpl{}", m.toString()); // data == null branch in toString()
    }

    @Test
    public void testDimensionConstructorValid() {
        BigMatrixImpl m = new BigMatrixImpl(2, 3);
        assertEquals(2, m.getRowDimension());
        assertEquals(3, m.getColumnDimension());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDimensionConstructorInvalidRow() {
        new BigMatrixImpl(0, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDimensionConstructorInvalidColumn() {
        new BigMatrixImpl(3, 0);
    }

    @Test
    public void testBigDecimalArrayConstructorValid() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        assertEquals(2, m.getRowDimension());
        assertEquals(2, m.getColumnDimension());
    }

    @Test(expected = NullPointerException.class)
    public void testBigDecimalArrayConstructorNull() {
        new BigMatrixImpl((BigDecimal[][]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBigDecimalArrayConstructorEmptyRows() {
        new BigMatrixImpl(new BigDecimal[0][0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBigDecimalArrayConstructorEmptyCols() {
        new BigMatrixImpl(new BigDecimal[][]{{}});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBigDecimalArrayConstructorRagged() {
        BigDecimal[][] d = new BigDecimal[][]{{bd(1), bd(2)}, {bd(3)}};
        new BigMatrixImpl(d);
    }

    @Test
    public void testBooleanConstructorCopyTrue() {
        BigDecimal[][] d = toBD(new double[][]{{1, 2}, {3, 4}});
        BigMatrixImpl m = new BigMatrixImpl(d, true);
        assertNotSame(d, m.getDataRef()); // copied
    }

    @Test
    public void testBooleanConstructorCopyFalseValid() {
        BigDecimal[][] d = toBD(new double[][]{{1, 2}, {3, 4}});
        BigMatrixImpl m = new BigMatrixImpl(d, false);
        assertSame(d, m.getDataRef()); // referenced not copied
    }

    @Test(expected = NullPointerException.class)
    public void testBooleanConstructorCopyFalseNull() {
        new BigMatrixImpl((BigDecimal[][]) null, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBooleanConstructorCopyFalseEmptyRows() {
        new BigMatrixImpl(new BigDecimal[0][0], false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBooleanConstructorCopyFalseEmptyCols() {
        new BigMatrixImpl(new BigDecimal[][]{{}}, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBooleanConstructorCopyFalseRagged() {
        BigDecimal[][] d = new BigDecimal[][]{{bd(1), bd(2)}, {bd(3)}};
        new BigMatrixImpl(d, false);
    }

    @Test
    public void testDoubleArrayConstructorValid() {
        BigMatrixImpl m = new BigMatrixImpl(new double[][]{{1, 2}, {3, 4}});
        assertEquals(2, m.getRowDimension());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDoubleArrayConstructorEmptyRows() {
        new BigMatrixImpl(new double[0][0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDoubleArrayConstructorEmptyCols() {
        new BigMatrixImpl(new double[][]{{}});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDoubleArrayConstructorRagged() {
        new BigMatrixImpl(new double[][]{{1, 2}, {3}});
    }

    @Test
    public void testStringArrayConstructorValid() {
        BigMatrixImpl m = new BigMatrixImpl(new String[][]{{"1", "2"}, {"3", "4"}});
        assertEquals(2, m.getRowDimension());
        assertBDEquals(bd(3), m.getEntry(1, 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStringArrayConstructorEmptyRows() {
        new BigMatrixImpl(new String[0][0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStringArrayConstructorEmptyCols() {
        new BigMatrixImpl(new String[][]{{}});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStringArrayConstructorRagged() {
        new BigMatrixImpl(new String[][]{{"1", "2"}, {"3"}});
    }

    @Test
    public void testVectorConstructor() {
        BigDecimal[] v = {bd(1), bd(2), bd(3)};
        BigMatrixImpl m = new BigMatrixImpl(v);
        assertEquals(3, m.getRowDimension());
        assertEquals(1, m.getColumnDimension());
        assertEquals(bd(2), m.getEntry(1, 0));
    }

    // ---------------- copy ----------------

    @Test
    public void testCopy() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        BigMatrix c = m.copy();
        assertTrue(m.equals(c));
        assertNotSame(m, c);
    }

    // ---------------- add / subtract ----------------

    @Test
    public void testAddBigMatrixImpl() {
        BigMatrixImpl a = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        BigMatrixImpl b = new BigMatrixImpl(toBD(new double[][]{{5, 6}, {7, 8}}));
        BigMatrixImpl sum = a.add(b);
        assertBDEquals(bd(6), sum.getEntry(0, 0));
        assertBDEquals(bd(12), sum.getEntry(1, 1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDimensionMismatch() {
        BigMatrixImpl a = new BigMatrixImpl(toBD(new double[][]{{1, 2}}));
        BigMatrixImpl b = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        a.add(b);
    }

    @Test
    public void testAddViaInterfaceTryBranch() {
        // Exercises add(BigMatrix) -> try-cast succeeds (no ClassCastException)
        BigMatrix a = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        BigMatrix b = new BigMatrixImpl(toBD(new double[][]{{1, 1}, {1, 1}}));
        BigMatrix sum = a.add(b);
        assertBDEquals(bd(2), sum.getEntry(0, 0));
    }
    // NOTE: ClassCastException catch-branch not covered - see explanation above code.

    @Test
    public void testSubtractBigMatrixImpl() {
        BigMatrixImpl a = new BigMatrixImpl(toBD(new double[][]{{5, 6}, {7, 8}}));
        BigMatrixImpl b = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        BigMatrixImpl diff = a.subtract(b);
        assertBDEquals(bd(4), diff.getEntry(0, 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubtractDimensionMismatch() {
        BigMatrixImpl a = new BigMatrixImpl(toBD(new double[][]{{1, 2}}));
        BigMatrixImpl b = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        a.subtract(b);
    }

    @Test
    public void testSubtractViaInterfaceTryBranch() {
        BigMatrix a = new BigMatrixImpl(toBD(new double[][]{{5, 6}}));
        BigMatrix b = new BigMatrixImpl(toBD(new double[][]{{1, 1}}));
        BigMatrix diff = a.subtract(b);
        assertBDEquals(bd(4), diff.getEntry(0, 0));
    }

    // ---------------- scalarAdd / scalarMultiply ----------------

    @Test
    public void testScalarAdd() {
        BigMatrixImpl a = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        BigMatrix r = a.scalarAdd(bd(10));
        assertBDEquals(bd(11), r.getEntry(0, 0));
        assertBDEquals(bd(14), r.getEntry(1, 1));
    }

    @Test
    public void testScalarMultiply() {
        BigMatrixImpl a = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        BigMatrix r = a.scalarMultiply(bd(2));
        assertBDEquals(bd(2), r.getEntry(0, 0));
        assertBDEquals(bd(8), r.getEntry(1, 1));
    }

    // ---------------- multiply / preMultiply ----------------

    @Test
    public void testMultiplyBigMatrixImpl() {
        BigMatrixImpl a = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        BigMatrixImpl b = new BigMatrixImpl(toBD(new double[][]{{1, 0}, {0, 1}}));
        BigMatrixImpl r = a.multiply(b);
        assertBDEquals(bd(1), r.getEntry(0, 0));
        assertBDEquals(bd(4), r.getEntry(1, 1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMultiplyDimensionMismatch() {
        BigMatrixImpl a = new BigMatrixImpl(toBD(new double[][]{{1, 2}}));
        BigMatrixImpl b = new BigMatrixImpl(toBD(new double[][]{{1, 2}}));
        a.multiply(b);
    }

    @Test
    public void testMultiplyViaInterfaceTryBranch() {
        BigMatrix a = new BigMatrixImpl(toBD(new double[][]{{2}}));
        BigMatrix b = new BigMatrixImpl(toBD(new double[][]{{3}}));
        BigMatrix r = a.multiply(b);
        assertBDEquals(bd(6), r.getEntry(0, 0));
    }

    @Test
    public void testPreMultiplyMatrix() {
        BigMatrixImpl a = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        BigMatrixImpl id = new BigMatrixImpl(toBD(new double[][]{{1, 0}, {0, 1}}));
        BigMatrix r = a.preMultiply(id); // id.multiply(a)
        assertBDEquals(bd(1), r.getEntry(0, 0));
    }

    // ---------------- getData / getDataAsDoubleArray / getDataRef ----------------

    @Test
    public void testGetDataIsFreshCopy() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        BigDecimal[][] copy = m.getData();
        copy[0][0] = bd(999);
        assertEquals(bd(1), m.getEntry(0, 0)); // unaffected
    }

    @Test
    public void testGetDataAsDoubleArray() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1.5, 2.5}}));
        double[][] d = m.getDataAsDoubleArray();
        assertEquals(1.5, d[0][0], 1e-9);
        assertEquals(2.5, d[0][1], 1e-9);
    }

    @Test
    public void testGetDataRefIsSameReference() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}}));
        BigDecimal[][] ref = m.getDataRef();
        ref[0][0] = bd(42);
        assertEquals(bd(42), m.getEntry(0, 0)); // affected (shared reference)
    }

    // ---------------- roundingMode / scale ----------------

    @Test
    public void testRoundingModeDefaultAndSetter() {
        BigMatrixImpl m = new BigMatrixImpl(1, 1);
        assertEquals(BigDecimal.ROUND_HALF_UP, m.getRoundingMode());
        m.setRoundingMode(BigDecimal.ROUND_DOWN);
        assertEquals(BigDecimal.ROUND_DOWN, m.getRoundingMode());
    }

    @Test
    public void testScaleDefaultAndSetter() {
        BigMatrixImpl m = new BigMatrixImpl(1, 1);
        assertEquals(64, m.getScale());
        m.setScale(10);
        assertEquals(10, m.getScale());
    }

    // ---------------- getNorm ----------------

    @Test
    public void testGetNorm() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, -2}, {-3, 4}}));
        // col0 abs-sum=4, col1 abs-sum=6 -> max=6
        assertBDEquals(bd(6), m.getNorm());
    }

    // ---------------- getSubMatrix(int,int,int,int) ----------------

    @Test
    public void testGetSubMatrixValid() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{
                {1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        BigMatrix sub = m.getSubMatrix(0, 1, 1, 2);
        assertEquals(2, sub.getRowDimension());
        assertEquals(2, sub.getColumnDimension());
        assertEquals(bd(2), sub.getEntry(0, 0));
        assertEquals(bd(6), sub.getEntry(1, 1));
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrixStartRowNegative() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        m.getSubMatrix(-1, 1, 0, 1);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrixStartRowGreaterThanEndRow() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        m.getSubMatrix(1, 0, 0, 1);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrixStartColumnNegative() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        m.getSubMatrix(0, 1, -1, 1);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrixStartColumnGreaterThanEndColumn() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        m.getSubMatrix(0, 1, 1, 0);
    }

    /*
     * FAULT-DETECTION TEST:
     * The boundary check in getSubMatrix(int,int,int,int) uses
     * "endRow > data.length" instead of "endRow >= data.length".
     * For a 2-row matrix (data.length == 2), endRow == 2 passes the
     * validation incorrectly, then System.arraycopy(data[i], ...) with
     * i == 2 throws ArrayIndexOutOfBoundsException instead of the expected
     * MatrixIndexException. This test documents/exploits that real defect.
     */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetSubMatrixEndRowOffByOneDefect() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        m.getSubMatrix(0, 2, 0, 1); // endRow == data.length (2) incorrectly accepted
    }

    /*
     * FAULT-DETECTION TEST:
     * Same off-by-one defect for columns: "endColumn > data[0].length"
     * should be ">=". endColumn == data[0].length passes validation then
     * fails inside System.arraycopy with ArrayIndexOutOfBoundsException.
     */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetSubMatrixEndColumnOffByOneDefect() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        m.getSubMatrix(0, 1, 0, 2); // endColumn == data[0].length (2) incorrectly accepted
    }

    // ---------------- getSubMatrix(int[],int[]) ----------------

    @Test
    public void testGetSubMatrixArraysValid() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{
                {1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        BigMatrix sub = m.getSubMatrix(new int[]{0, 2}, new int[]{1, 2});
        assertEquals(bd(2), sub.getEntry(0, 0));
        assertEquals(bd(9), sub.getEntry(1, 1));
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrixArraysEmpty() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        m.getSubMatrix(new int[]{}, new int[]{0, 1});
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrixArraysOutOfBounds() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        m.getSubMatrix(new int[]{0, 5}, new int[]{0, 1});
    }

    // ---------------- setSubMatrix ----------------

    @Test
    public void testSetSubMatrixValid() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{
                {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 0, 1, 2}}));
        BigDecimal[][] sub = toBD(new double[][]{{3, 4}, {5, 6}});
        m.setSubMatrix(sub, 1, 1);
        assertEquals(bd(3), m.getEntry(1, 1));
        assertEquals(bd(6), m.getEntry(2, 2));
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetSubMatrixNegativeRow() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        m.setSubMatrix(toBD(new double[][]{{1}}), -1, 0);
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetSubMatrixNegativeColumn() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        m.setSubMatrix(toBD(new double[][]{{1}}), 0, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSubMatrixEmptyRows() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        m.setSubMatrix(new BigDecimal[0][0], 0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSubMatrixEmptyCols() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        m.setSubMatrix(new BigDecimal[][]{{}}, 0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSubMatrixRagged() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        BigDecimal[][] sub = new BigDecimal[][]{{bd(1), bd(2)}, {bd(3)}};
        m.setSubMatrix(sub, 0, 0);
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetSubMatrixNullDataWithNonZeroRow() {
        BigMatrixImpl m = new BigMatrixImpl();
        m.setSubMatrix(toBD(new double[][]{{1, 2}}), 1, 0);
    }

    @Test
    public void testSetSubMatrixNullDataInit() {
        BigMatrixImpl m = new BigMatrixImpl();
        m.setSubMatrix(toBD(new double[][]{{1, 2}, {3, 4}}), 0, 0);
        assertEquals(2, m.getRowDimension());
        assertEquals(bd(4), m.getEntry(1, 1));
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetSubMatrixOutOfBoundsRow() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        m.setSubMatrix(toBD(new double[][]{{1, 2}, {3, 4}}), 1, 0);
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetSubMatrixOutOfBoundsColumn() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        m.setSubMatrix(toBD(new double[][]{{1, 2}, {3, 4}}), 0, 1);
    }

    // ---------------- getRowMatrix / getColumnMatrix ----------------

    @Test
    public void testGetRowMatrix() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2, 3}, {4, 5, 6}}));
        BigMatrix row = m.getRowMatrix(1);
        assertEquals(1, row.getRowDimension());
        assertEquals(3, row.getColumnDimension());
        assertEquals(bd(5), row.getEntry(0, 1));
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetRowMatrixInvalid() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}}));
        m.getRowMatrix(5);
    }

    @Test
    public void testGetColumnMatrix() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2, 3}, {4, 5, 6}}));
        BigMatrix col = m.getColumnMatrix(2);
        assertEquals(2, col.getRowDimension());
        assertEquals(1, col.getColumnDimension());
        assertEquals(bd(6), col.getEntry(1, 0));
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetColumnMatrixInvalid() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}}));
        m.getColumnMatrix(-1);
    }

    // ---------------- getRow / getColumn (BigDecimal[] & double[]) ----------------

    @Test
    public void testGetRow() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2, 3}}));
        BigDecimal[] row = m.getRow(0);
        assertArrayEquals(new BigDecimal[]{bd(1), bd(2), bd(3)}, row);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetRowInvalid() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}}));
        m.getRow(2);
    }

    @Test
    public void testGetRowAsDoubleArray() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1.5, 2.5}}));
        double[] row = m.getRowAsDoubleArray(0);
        assertArrayEquals(new double[]{1.5, 2.5}, row, 1e-9);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetRowAsDoubleArrayInvalid() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}}));
        m.getRowAsDoubleArray(-1);
    }

    @Test
    public void testGetColumn() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        BigDecimal[] col = m.getColumn(1);
        assertArrayEquals(new BigDecimal[]{bd(2), bd(4)}, col);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetColumnInvalid() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}}));
        m.getColumn(5);
    }

    @Test
    public void testGetColumnAsDoubleArray() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1.5}, {2.5}}));
        double[] col = m.getColumnAsDoubleArray(0);
        assertArrayEquals(new double[]{1.5, 2.5}, col, 1e-9);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetColumnAsDoubleArrayInvalid() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}}));
        m.getColumnAsDoubleArray(2);
    }

    // ---------------- getEntry / getEntryAsDouble ----------------

    @Test
    public void testGetEntryValid() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        assertEquals(bd(4), m.getEntry(1, 1));
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetEntryInvalid() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        m.getEntry(5, 5);
    }

    @Test
    public void testGetEntryAsDouble() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1.5, 2.5}}));
        assertEquals(1.5, m.getEntryAsDouble(0, 0), 1e-9);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetEntryAsDoubleInvalid() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}}));
        m.getEntryAsDouble(10, 10);
    }

    // ---------------- transpose ----------------

    @Test
    public void testTranspose() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2, 3}, {4, 5, 6}}));
        BigMatrix t = m.transpose();
        assertEquals(3, t.getRowDimension());
        assertEquals(2, t.getColumnDimension());
        assertEquals(bd(4), t.getEntry(0, 1));
    }

    // ---------------- isSquare ----------------

    @Test
    public void testIsSquareTrue() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        assertTrue(m.isSquare());
    }

    @Test
    public void testIsSquareFalse() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2, 3}}));
        assertFalse(m.isSquare());
    }

    // ---------------- isSingular ----------------

    @Test
    public void testIsSingularFalse() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{2, 0}, {0, 2}}));
        assertFalse(m.isSingular()); // lu==null -> luDecompose succeeds
    }

    @Test
    public void testIsSingularTrue() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {2, 4}}));
        assertTrue(m.isSingular()); // lu==null -> luDecompose throws -> caught
    }

    @Test
    public void testIsSingularWhenLuAlreadyComputed() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{2, 0}, {0, 2}}));
        m.luDecompose();
        assertFalse(m.isSingular()); // else branch: lu != null
    }

    // ---------------- getDeterminant ----------------

    @Test
    public void testGetDeterminantNonSingular() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{2, 0}, {0, 3}}));
        assertBDEquals(bd(6), m.getDeterminant());
    }

    @Test
    public void testGetDeterminantSingular() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {2, 4}}));
        assertBDEquals(BigMatrixImpl.ZERO, m.getDeterminant());
    }

    @Test(expected = InvalidMatrixException.class)
    public void testGetDeterminantNotSquare() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2, 3}}));
        m.getDeterminant();
    }

    @Test
    public void testGetDeterminantNegativeParity() {
        // requires row swap -> parity = -1 branch
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{0, 1}, {1, 0}}));
        assertBDEquals(bd(-1), m.getDeterminant());
    }

    // ---------------- getTrace ----------------

    @Test
    public void testGetTrace() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        assertBDEquals(bd(5), m.getTrace());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetTraceNotSquare() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2, 3}}));
        m.getTrace();
    }

    // ---------------- operate ----------------

    @Test
    public void testOperateBigDecimalArray() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        BigDecimal[] v = {bd(1), bd(1)};
        BigDecimal[] r = m.operate(v);
        assertBDEquals(bd(3), r[0]);
        assertBDEquals(bd(7), r[1]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOperateBigDecimalArrayWrongLength() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        m.operate(new BigDecimal[]{bd(1)});
    }

    @Test
    public void testOperateDoubleArray() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 0}, {0, 1}}));
        BigDecimal[] r = m.operate(new double[]{5.0, 6.0});
        assertBDEquals(bd(5), r[0]);
        assertBDEquals(bd(6), r[1]);
    }

    // ---------------- preMultiply(vector) ----------------

    @Test
    public void testPreMultiplyVector() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        BigDecimal[] v = {bd(1), bd(1)};
        BigDecimal[] r = m.preMultiply(v);
        assertBDEquals(bd(4), r[0]);
        assertBDEquals(bd(6), r[1]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPreMultiplyVectorWrongLength() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        m.preMultiply(new BigDecimal[]{bd(1)});
    }

    // ---------------- solve ----------------

    @Test
    public void testSolveBigDecimalArray() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{2, 0}, {0, 2}}));
        BigDecimal[] x = m.solve(new BigDecimal[]{bd(4), bd(6)});
        assertBDEquals(bd(2), x[0]);
        assertBDEquals(bd(3), x[1]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveBigDecimalArrayWrongLength() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{2, 0}, {0, 2}}));
        m.solve(new BigDecimal[]{bd(1)});
    }

    @Test
    public void testSolveDoubleArray() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{2, 0}, {0, 2}}));
        BigDecimal[] x = m.solve(new double[]{4.0, 6.0});
        assertBDEquals(bd(2), x[0]);
        assertBDEquals(bd(3), x[1]);
    }

    @Test
    public void testSolveBigMatrixValid() {
        BigMatrixImpl a = new BigMatrixImpl(toBD(new double[][]{{2, 0}, {0, 2}}));
        BigMatrixImpl b = new BigMatrixImpl(toBD(new double[][]{{4}, {6}}));
        BigMatrix x = a.solve(b);
        assertBDEquals(bd(2), x.getEntry(0, 0));
        assertBDEquals(bd(3), x.getEntry(1, 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveBigMatrixRowMismatch() {
        BigMatrixImpl a = new BigMatrixImpl(toBD(new double[][]{{2, 0}, {0, 2}}));
        BigMatrixImpl b = new BigMatrixImpl(toBD(new double[][]{{4}}));
        a.solve(b);
    }

    @Test(expected = InvalidMatrixException.class)
    public void testSolveBigMatrixNotSquare() {
        BigMatrixImpl a = new BigMatrixImpl(toBD(new double[][]{{1, 2, 3}, {4, 5, 6}}));
        BigMatrixImpl b = new BigMatrixImpl(toBD(new double[][]{{1}, {1}}));
        a.solve(b);
    }

    @Test(expected = InvalidMatrixException.class)
    public void testSolveBigMatrixSingular() {
        BigMatrixImpl a = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {2, 4}}));
        BigMatrixImpl b = new BigMatrixImpl(toBD(new double[][]{{1}, {1}}));
        a.solve(b);
    }

    @Test
    public void testSolveBigMatrixWithPivot() {
        // Requires pivot swap during LU decomposition
        BigMatrixImpl a = new BigMatrixImpl(toBD(new double[][]{{0, 1}, {1, 0}}));
        BigMatrixImpl b = new BigMatrixImpl(toBD(new double[][]{{1}, {2}}));
        BigMatrix x = a.solve(b);
        assertBDEquals(bd(2), x.getEntry(0, 0));
        assertBDEquals(bd(1), x.getEntry(1, 0));
    }

    // ---------------- inverse ----------------

    @Test
    public void testInverse() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{2, 0}, {0, 2}}));
        BigMatrix inv = m.inverse();
        assertBDEquals(bd(0.5), inv.getEntry(0, 0));
        assertBDEquals(bd(0.5), inv.getEntry(1, 1));
    }

    @Test(expected = InvalidMatrixException.class)
    public void testInverseSingular() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {2, 4}}));
        m.inverse();
    }

    // ---------------- luDecompose ----------------

    @Test
    public void testLuDecomposeValid() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{4, 3}, {6, 3}}));
        m.luDecompose(); // no exception
    }

    @Test(expected = InvalidMatrixException.class)
    public void testLuDecomposeNonSquare() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2, 3}}));
        m.luDecompose();
    }

    @Test(expected = InvalidMatrixException.class)
    public void testLuDecomposeSingular() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {2, 4}}));
        m.luDecompose();
    }

    @Test
    public void testLuDecomposeWithPivot() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{0, 1}, {1, 0}}));
        m.luDecompose(); // triggers max != col branch (pivot + parity flip)
    }

    // ---------------- protected getPermutation / getLUMatrix ----------------

    @Test
    public void testGetPermutationAfterPivot() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{0, 1}, {1, 0}}));
        m.luDecompose();
        assertArrayEquals(new int[]{1, 0}, m.getPermutation());
    }

    @Test
    public void testGetLUMatrixComputesWhenNull() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{2, 0}, {0, 2}}));
        BigMatrix lu = m.getLUMatrix(); // lu == null branch triggers luDecompose()
        assertNotNull(lu);
    }

    // ---------------- toString ----------------

    @Test
    public void testToStringNullData() {
        BigMatrixImpl m = new BigMatrixImpl();
        assertEquals("BigMatrixImpl{}", m.toString());
    }

    @Test
    public void testToStringWithData() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        String s = m.toString();
        assertTrue(s.startsWith("BigMatrixImpl{"));
        assertTrue(s.contains("1"));
        assertTrue(s.contains("4"));
    }

    // ---------------- equals / hashCode ----------------

    @Test
    public void testEqualsSameInstance() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}}));
        assertTrue(m.equals(m));
    }

    @Test
    public void testEqualsNotInstance() {
        BigMatrixImpl m = new BigMatrixImpl(toBD(new double[][]{{1, 2}}));
        assertFalse(m.equals("not a matrix"));
    }

    @Test
    public void testEqualsDimensionMismatch() {
        BigMatrixImpl a = new BigMatrixImpl(toBD(new double[][]{{1, 2}}));
        BigMatrixImpl b = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsEntriesDiffer() {
        BigMatrixImpl a = new BigMatrixImpl(toBD(new double[][]{{1, 2}}));
        BigMatrixImpl b = new BigMatrixImpl(toBD(new double[][]{{1, 3}}));
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsTrue() {
        BigMatrixImpl a = new BigMatrixImpl(toBD(new double[][]{{1, 2}}));
        BigMatrixImpl b = new BigMatrixImpl(toBD(new double[][]{{1, 2}}));
        assertTrue(a.equals(b));
    }

    @Test
    public void testHashCodeConsistency() {
        BigMatrixImpl a = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        BigMatrixImpl b = new BigMatrixImpl(toBD(new double[][]{{1, 2}, {3, 4}}));
        assertEquals(a.hashCode(), b.hashCode());
    }
}
