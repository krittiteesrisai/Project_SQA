package org.apache.commons.math.linear;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.math.BigDecimal;

public class BigMatrixImplTest {

    private double[][] testData;
    private double[][] singularData;
    private double[][] rectData; // 3x2

    @Before
    public void setUp() {
        testData = new double[][] {
            { 1.0, 2.0, 3.0 },
            { 2.0, 5.0, 3.0 },
            { 1.0, 0.0, 8.0 }
        };
        singularData = new double[][] {
            { 1.0, 2.0, 3.0 },
            { 2.0, 4.0, 6.0 },
            { 1.0, 1.0, 1.0 }
        };
        rectData = new double[][] {
            { 1.0, 2.0 },
            { 3.0, 4.0 },
            { 5.0, 6.0 }
        };
    }

    // ------------------------------------------------------------------------
    // Constructors & Dimension Tests
    // ------------------------------------------------------------------------

    @Test
    public void testDefaultConstructor() {
        BigMatrixImpl m = new BigMatrixImpl();
        assertNull(m.getDataRef());
        assertEquals("BigMatrixImpl{}", m.toString());
    }

    @Test
    public void testDimensionsConstructorValid() {
        BigMatrixImpl m = new BigMatrixImpl(3, 4);
        assertEquals(3, m.getRowDimension());
        assertEquals(4, m.getColumnDimension());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDimensionsConstructorInvalidRow() {
        new BigMatrixImpl(0, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDimensionsConstructorInvalidCol() {
        new BigMatrixImpl(3, -1);
    }

    @Test
    public void testBigDecimal2DConstructorCopy() {
        BigDecimal[][] data = new BigDecimal[][] {
            { new BigDecimal("1.0"), new BigDecimal("2.0") },
            { new BigDecimal("3.0"), new BigDecimal("4.0") }
        };
        BigMatrixImpl m = new BigMatrixImpl(data);
        assertEquals(2, m.getRowDimension());
        assertEquals(2, m.getColumnDimension());
        data[0][0] = new BigDecimal("99.0");
        assertNotEquals(data[0][0], m.getEntry(0, 0));
    }

    @Test
    public void testBigDecimal2DConstructorNoCopy() {
        BigDecimal[][] data = new BigDecimal[][] {
            { new BigDecimal("1.0"), new BigDecimal("2.0") },
            { new BigDecimal("3.0"), new BigDecimal("4.0") }
        };
        BigMatrixImpl m = new BigMatrixImpl(data, false);
        assertSame(data, m.getDataRef());
    }

    @Test(expected = NullPointerException.class)
    public void testBigDecimal2DConstructorNull() {
        new BigMatrixImpl((BigDecimal[][]) null, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBigDecimal2DConstructorEmptyRow() {
        new BigMatrixImpl(new BigDecimal[0][0], false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBigDecimal2DConstructorEmptyCol() {
        new BigMatrixImpl(new BigDecimal[][] { {} }, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBigDecimal2DConstructorRagged() {
        new BigDecimal[][] {
            { new BigDecimal("1.0"), new BigDecimal("2.0") },
            { new BigDecimal("3.0") }
        };
        new BigMatrixImpl(new BigDecimal[][] {
            { new BigDecimal("1.0"), new BigDecimal("2.0") },
            { new BigDecimal("3.0") }
        }, false);
    }

    @Test
    public void testDouble2DConstructor() {
        BigMatrixImpl m = new BigMatrixImpl(testData);
        assertEquals(3, m.getRowDimension());
        assertEquals(3, m.getColumnDimension());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDouble2DConstructorEmptyRow() {
        new BigMatrixImpl(new double[0][0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDouble2DConstructorEmptyCol() {
        new BigMatrixImpl(new double[][] { {} });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDouble2DConstructorRagged() {
        new BigMatrixImpl(new double[][] { { 1.0, 2.0 }, { 3.0 } });
    }

    @Test
    public void testString2DConstructor() {
        String[][] strData = new String[][] {
            { "1.0", "2.0" },
            { "3.0", "4.0" }
        };
        BigMatrixImpl m = new BigMatrixImpl(strData);
        assertEquals(new BigDecimal("1.0"), m.getEntry(0, 0));
        assertEquals(new BigDecimal("4.0"), m.getEntry(1, 1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testString2DConstructorEmptyRow() {
        new BigMatrixImpl(new String[0][0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testString2DConstructorEmptyCol() {
        new BigMatrixImpl(new String[][] { {} });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testString2DConstructorRagged() {
        new BigMatrixImpl(new String[][] { { "1.0", "2.0" }, { "3.0" } });
    }

    @Test
    public void testBigDecimalVectorConstructor() {
        BigDecimal[] v = new BigDecimal[] { new BigDecimal("1.0"), new BigDecimal("2.0"), new BigDecimal("3.0") };
        BigMatrixImpl m = new BigMatrixImpl(v);
        assertEquals(3, m.getRowDimension());
        assertEquals(1, m.getColumnDimension());
        assertEquals(new BigDecimal("2.0"), m.getEntry(1, 0));
    }

    // ------------------------------------------------------------------------
    // Basic Matrix Operations & Arithmetic
    // ------------------------------------------------------------------------

    @Test
    public void testCopy() {
        BigMatrixImpl m = new BigMatrixImpl(testData);
        BigMatrix copy = m.copy();
        assertEquals(m, copy);
        assertNotSame(m.getDataRef(), ((BigMatrixImpl) copy).getDataRef());
    }

    @Test
    public void testAddAndSubtractSameImpl() {
        BigMatrixImpl m1 = new BigMatrixImpl(testData);
        BigMatrixImpl m2 = new BigMatrixImpl(testData);

        BigMatrixImpl sum = m1.add(m2);
        assertEquals(new BigDecimal("2.0"), sum.getEntry(0, 0));
        assertEquals(new BigDecimal("10.0"), sum.getEntry(1, 1));

        BigMatrixImpl diff = sum.subtract(m1);
        assertEquals(m1, diff);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDimensionMismatch() {
        BigMatrixImpl m1 = new BigMatrixImpl(testData);
        BigMatrixImpl m2 = new BigMatrixImpl(rectData);
        m1.add(m2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubtractDimensionMismatch() {
        BigMatrixImpl m1 = new BigMatrixImpl(testData);
        BigMatrixImpl m2 = new BigMatrixImpl(rectData);
        m1.subtract(m2);
    }

    @Test
    public void testScalarAddAndMultiply() {
        BigMatrixImpl m = new BigMatrixImpl(testData);
        BigMatrix resAdd = m.scalarAdd(new BigDecimal("2.5"));
        assertEquals(new BigDecimal("3.5"), resAdd.getEntry(0, 0));

        BigMatrix resMul = m.scalarMultiply(new BigDecimal("2.0"));
        assertEquals(new BigDecimal("2.0"), resMul.getEntry(0, 0));
        assertEquals(new BigDecimal("10.0"), resMul.getEntry(1, 1));
    }

    @Test
    public void testMultiplyAndPreMultiply() {
        BigMatrixImpl m1 = new BigMatrixImpl(rectData); // 3x2
        BigMatrixImpl m2 = new BigMatrixImpl(new double[][] { { 1.0, 2.0, 3.0 }, { 4.0, 5.0, 6.0 } }); // 2x3

        BigMatrix res = m1.multiply(m2); // 3x3
        assertEquals(3, res.getRowDimension());
        assertEquals(3, res.getColumnDimension());
        // row 0: 1*1 + 2*4 = 9
        assertEquals(new BigDecimal("9.0"), res.getEntry(0, 0));

        BigMatrix preRes = m2.preMultiply(m1);
        assertEquals(res, preRes);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMultiplyDimensionMismatch() {
        BigMatrixImpl m1 = new BigMatrixImpl(rectData); // 3x2
        BigMatrixImpl m2 = new BigMatrixImpl(rectData); // 3x2
        m1.multiply(m2);
    }

    @Test
    public void testTranspose() {
        BigMatrixImpl m = new BigMatrixImpl(rectData); // 3x2
        BigMatrix t = m.transpose(); // 2x3
        assertEquals(2, t.getRowDimension());
        assertEquals(3, t.getColumnDimension());
        assertEquals(m.getEntry(2, 1), t.getEntry(1, 2));
    }

    @Test
    public void testGetNorm() {
        BigMatrixImpl m = new BigMatrixImpl(testData);
        // Column sums: col0 = 1+2+1=4, col1 = 2+5+0=7, col2 = 3+3+8=14
        assertEquals(new BigDecimal("14.0"), m.getNorm());
    }

    @Test
    public void testGetTrace() {
        BigMatrixImpl m = new BigMatrixImpl(testData);
        // 1 + 5 + 8 = 14
        assertEquals(new BigDecimal("14.0"), m.getTrace());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetTraceNonSquare() {
        BigMatrixImpl m = new BigMatrixImpl(rectData);
        m.getTrace();
    }

    // ------------------------------------------------------------------------
    // Submatrix Operations
    // ------------------------------------------------------------------------

    @Test
    public void testGetSubMatrixIndicesValid() {
        BigMatrixImpl m = new BigMatrixImpl(testData);
        BigMatrix sub = m.getSubMatrix(0, 1, 1, 2);
        assertEquals(2, sub.getRowDimension());
        assertEquals(2, sub.getColumnDimension());
        assertEquals(new BigDecimal("2.0"), sub.getEntry(0, 0));
        assertEquals(new BigDecimal("3.0"), sub.getEntry(1, 1));
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrixIndicesInvalid() {
        BigMatrixImpl m = new BigMatrixImpl(testData);
        m.getSubMatrix(1, 0, 0, 1);
    }

    @Test
    public void testGetSubMatrixArrayValid() {
        BigMatrixImpl m = new BigMatrixImpl(testData);
        BigMatrix sub = m.getSubMatrix(new int[] { 0, 2 }, new int[] { 1 });
        assertEquals(2, sub.getRowDimension());
        assertEquals(1, sub.getColumnDimension());
        assertEquals(new BigDecimal("2.0"), sub.getEntry(0, 0));
        assertEquals(new BigDecimal("0.0"), sub.getEntry(1, 0));
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrixArrayEmpty() {
        BigMatrixImpl m = new BigMatrixImpl(testData);
        m.getSubMatrix(new int[0], new int[] { 1 });
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrixArrayOutOfBounds() {
        BigMatrixImpl m = new BigMatrixImpl(testData);
        m.getSubMatrix(new int[] { 0, 5 }, new int[] { 1 });
    }

    @Test
    public void testSetSubMatrixValid() {
        BigMatrixImpl m = new BigMatrixImpl(testData);
        BigDecimal[][] sub = new BigDecimal[][] {
            { new BigDecimal("9.0"), new BigDecimal("9.0") },
            { new BigDecimal("9.0"), new BigDecimal("9.0") }
        };
        m.setSubMatrix(sub, 1, 1);
        assertEquals(new BigDecimal("9.0"), m.getEntry(1, 1));
        assertEquals(new BigDecimal("9.0"), m.getEntry(2, 2));
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetSubMatrixInvalidCoord() {
        BigMatrixImpl m = new BigMatrixImpl(testData);
        BigDecimal[][] sub = new BigDecimal[][] { { new BigDecimal("1.0") } };
        m.setSubMatrix(sub, -1, 0);
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetSubMatrixOverflow() {
        BigMatrixImpl m = new BigMatrixImpl(testData);
        BigDecimal[][] sub = new BigDecimal[][] {
            { new BigDecimal("1.0"), new BigDecimal("2.0") },
            { new BigDecimal("3.0"), new BigDecimal("4.0") }
        };
        m.setSubMatrix(sub, 2, 2);
    }

    // ------------------------------------------------------------------------
    // Get Row/Col & Element Access
    // ------------------------------------------------------------------------

    @Test
    public void testRowColumnGetters() {
        BigMatrixImpl m = new BigMatrixImpl(testData);

        BigDecimal[] row0 = m.getRow(0);
        assertEquals(3, row0.length);
        assertEquals(new BigDecimal("1.0"), row0[0]);

        double[] row0d = m.getRowAsDoubleArray(0);
        assertEquals(1.0, row0d[0], 1e-9);

        BigDecimal[] col1 = m.getColumn(1);
        assertEquals(3, col1.length);
        assertEquals(new BigDecimal("2.0"), col1[0]);

        double[] col1d = m.getColumnAsDoubleArray(1);
        assertEquals(2.0, col1d[0], 1e-9);

        BigMatrix rowMat = m.getRowMatrix(0);
        assertEquals(1, rowMat.getRowDimension());
        assertEquals(3, rowMat.getColumnDimension());

        BigMatrix colMat = m.getColumnMatrix(1);
        assertEquals(3, colMat.getRowDimension());
        assertEquals(1, colMat.getColumnDimension());

        assertEquals(1.0, m.getEntryAsDouble(0, 0), 1e-9);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetInvalidRow() {
        BigMatrixImpl m = new BigMatrixImpl(testData);
        m.getRow(10);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetInvalidColumn() {
        BigMatrixImpl m = new BigMatrixImpl(testData);
        m.getColumn(-1);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetEntryOutOfBounds() {
        BigMatrixImpl m = new BigMatrixImpl(testData);
        m.getEntry(5, 5);
    }

    @Test
    public void testGetDataAsDoubleArray() {
        BigMatrixImpl m = new BigMatrixImpl(testData);
        double[][] d = m.getDataAsDoubleArray();
        assertEquals(3, d.length);
        assertEquals(3, d[0].length);
        assertEquals(1.0, d[0][0], 1e-9);
    }

    // ------------------------------------------------------------------------
    // Vector Operations & Math-98 Bug Tests
    // ------------------------------------------------------------------------

    @Test
    public void testOperateRectangularMatrix() {
        // Math-98: Test operate on non-square matrix (3 rows x 2 cols)
        BigMatrixImpl m = new BigMatrixImpl(rectData);
        BigDecimal[] v = new BigDecimal[] { new BigDecimal("1.0"), new BigDecimal("2.0") };
        BigDecimal[] result = m.operate(v);

        // Result size should be equal to rowDimension (3), not columnDimension (2)
        assertEquals(3, result.length);
        // [1*1 + 2*2, 3*1 + 4*2, 5*1 + 6*2] = [5, 11, 17]
        assertEquals(new BigDecimal("5.0"), result[0]);
        assertEquals(new BigDecimal("11.0"), result[1]);
        assertEquals(new BigDecimal("17.0"), result[2]);

        double[] vDouble = new double[] { 1.0, 2.0 };
        BigDecimal[] resultDouble = m.operate(vDouble);
        assertEquals(3, resultDouble.length);
        assertEquals(new BigDecimal("5.0"), resultDouble[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOperateVectorLengthMismatch() {
        BigMatrixImpl m = new BigMatrixImpl(rectData);
        m.operate(new BigDecimal[] { new BigDecimal("1.0") });
    }

    @Test
    public void testPreMultiplyVector() {
        BigMatrixImpl m = new BigMatrixImpl(rectData); // 3x2
        BigDecimal[] v = new BigDecimal[] { new BigDecimal("1.0"), new BigDecimal("2.0"), new BigDecimal("3.0") };
        BigDecimal[] result = m.preMultiply(v);

        // Result size should be equal to colDimension (2)
        assertEquals(2, result.length);
        // [1*1 + 2*3 + 3*5, 1*2 + 2*4 + 3*6] = [22, 28]
        assertEquals(new BigDecimal("22.0"), result[0]);
        assertEquals(new BigDecimal("28.0"), result[1]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPreMultiplyVectorMismatch() {
        BigMatrixImpl m = new BigMatrixImpl(rectData);
        m.preMultiply(new BigDecimal[] { new BigDecimal("1.0") });
    }

    // ------------------------------------------------------------------------
    // LU Decomposition, Determinant, Inversion & Solver
    // ------------------------------------------------------------------------

    @Test
    public void testLUDecompositionAndSolve() {
        BigMatrixImpl m = new BigMatrixImpl(testData);
        assertFalse(m.isSingular());

        BigDecimal[] b = new BigDecimal[] { new BigDecimal("1.0"), new BigDecimal("1.0"), new BigDecimal("1.0") };
        BigDecimal[] x = m.solve(b);
        assertEquals(3, x.length);

        // Verify A * x == b
        BigDecimal[] ax = m.operate(x);
        for (int i = 0; i < b.length; i++) {
            assertEquals(0, b[i].compareTo(ax[i].setScale(b[i].scale(), BigDecimal.ROUND_HALF_UP)));
        }

        // Test solve with double array
        double[] bDouble = new double[] { 1.0, 1.0, 1.0 };
        BigDecimal[] xDouble = m.solve(bDouble);
        assertEquals(3, xDouble.length);
    }

    @Test
    public void testDeterminantAndInverse() {
        BigMatrixImpl m = new BigMatrixImpl(testData);
        BigDecimal det = m.getDeterminant();
        // Det for testData: 1*(40 - 0) - 2*(16 - 3) + 3*(0 - 5) = 40 - 26 - 15 = -1
        assertEquals(-1.0, det.doubleValue(), 1e-9);

        BigMatrix inv = m.inverse();
        BigMatrix identity = m.multiply(inv);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    assertEquals(1.0, identity.getEntryAsDouble(i, j), 1e-9);
                } else {
                    assertEquals(0.0, identity.getEntryAsDouble(i, j), 1e-9);
                }
            }
        }
    }

    @Test
    public void testSingularMatrix() {
        BigMatrixImpl m = new BigMatrixImpl(singularData);
        assertTrue(m.isSingular());
        assertEquals(BigDecimal.ZERO, m.getDeterminant());
    }

    @Test(expected = InvalidMatrixException.class)
    public void testSolveSingularMatrix() {
        BigMatrixImpl m = new BigMatrixImpl(singularData);
        m.solve(new BigDecimal[] { BigDecimal.ONE, BigDecimal.ONE, BigDecimal.ONE });
    }

    @Test(expected = InvalidMatrixException.class)
    public void testLUDecomposeNonSquare() {
        BigMatrixImpl m = new BigMatrixImpl(rectData);
        m.luDecompose();
    }

    @Test
    public void testScaleAndRoundingMode() {
        BigMatrixImpl m = new BigMatrixImpl(testData);
        m.setScale(32);
        assertEquals(32, m.getScale());
        m.setRoundingMode(BigDecimal.ROUND_FLOOR);
        assertEquals(BigDecimal.ROUND_FLOOR, m.getRoundingMode());
    }

    @Test
    public void testGetLUMatrixAndPermutation() {
        BigMatrixImpl m = new BigMatrixImpl(testData);
        BigMatrix lu = m.getLUMatrix();
        assertNotNull(lu);
        int[] perm = m.getPermutation();
        assertEquals(3, perm.length);
    }

    // ------------------------------------------------------------------------
    // Equals, HashCode, and ToString
    // ------------------------------------------------------------------------

    @Test
    public void testEqualsAndHashCode() {
        BigMatrixImpl m1 = new BigMatrixImpl(testData);
        BigMatrixImpl m2 = new BigMatrixImpl(testData);
        BigMatrixImpl m3 = new BigMatrixImpl(rectData);

        assertTrue(m1.equals(m1));
        assertTrue(m1.equals(m2));
        assertEquals(m1.hashCode(), m2.hashCode());

        assertFalse(m1.equals(null));
        assertFalse(m1.equals("StringObject"));
        assertFalse(m1.equals(m3));

        BigMatrixImpl mDiffValue = new BigMatrixImpl(new double[][] {
            { 1.0, 2.0, 3.0 },
            { 2.0, 5.0, 3.0 },
            { 1.0, 0.0, 99.0 }
        });
        assertFalse(m1.equals(mDiffValue));
    }

    @Test
    public void testToString() {
        BigMatrixImpl m = new BigMatrixImpl(new double[][] { { 1.0, 2.0 }, { 3.0, 4.0 } });
        String str = m.toString();
        assertTrue(str.startsWith("BigMatrixImpl{"));
        assertTrue(str.contains("1.0"));
        assertTrue(str.contains("4.0"));
    }
}