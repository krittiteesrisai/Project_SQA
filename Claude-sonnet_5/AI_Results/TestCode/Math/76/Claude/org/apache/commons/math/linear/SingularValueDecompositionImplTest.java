package org.apache.commons.math.linear;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingularValueDecompositionImplTest {

    private static final double TOL = 1e-8;

    // ---------- Helpers ----------

    private RealMatrix m(double[][] data) {
        return new Array2DRowRealMatrix(data);
    }

    private void assertMatrixEquals(RealMatrix expected, RealMatrix actual, double tol) {
        assertEquals("row dimension", expected.getRowDimension(), actual.getRowDimension());
        assertEquals("col dimension", expected.getColumnDimension(), actual.getColumnDimension());
        for (int i = 0; i < expected.getRowDimension(); i++) {
            for (int j = 0; j < expected.getColumnDimension(); j++) {
                assertEquals("entry(" + i + "," + j + ")",
                        expected.getEntry(i, j), actual.getEntry(i, j), tol);
            }
        }
    }

    /** Checks columns of m are orthonormal: m^T . m == Identity */
    private void assertOrthonormalColumns(RealMatrix matrix, double tol) {
        RealMatrix mtm = matrix.transpose().multiply(matrix);
        int dim = mtm.getRowDimension();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                double expected = (i == j) ? 1.0 : 0.0;
                assertEquals("orthonormal(" + i + "," + j + ")",
                        expected, mtm.getEntry(i, j), tol);
            }
        }
    }

    private void checkFullReconstruction(RealMatrix original) {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(original);
        RealMatrix reconstructed = svd.getU().multiply(svd.getS()).multiply(svd.getVT());
        assertMatrixEquals(original, reconstructed, TOL);
        assertOrthonormalColumns(svd.getU(), TOL);
        assertOrthonormalColumns(svd.getV(), TOL);
    }

    // ---------- Constructor / shape branches ----------

    @Test
    public void testSquareMatrixReconstruction() {
        RealMatrix a = m(new double[][] {
                {4, 0, 0},
                {0, 3, 0},
                {0, 0, 2}
        });
        checkFullReconstruction(a);
    }

    @Test
    public void testTallMatrix_M_GreaterEqual_N_Branch() {
        // m > n  -> exercises "if (m >= n)" branch in getU()/getV()
        RealMatrix a = m(new double[][] {
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8}
        });
        checkFullReconstruction(a);
    }

    @Test
    public void testWideMatrix_M_LessThan_N_Branch() {
        // m < n -> exercises "else" branch in getU()/getV()
        RealMatrix a = m(new double[][] {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        });
        checkFullReconstruction(a);
    }

    @Test
    public void testConstructorWithMaxParameter_Truncated() {
        RealMatrix a = m(new double[][] {
                {1, 0, 0},
                {0, 2, 0},
                {0, 0, 3},
                {0, 0, 0}
        });
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(a, 2);
        assertEquals(2, svd.getSingularValues().length);
        assertEquals(4, svd.getU().getRowDimension());
        assertEquals(2, svd.getU().getColumnDimension());
        assertEquals(3, svd.getV().getRowDimension());
        assertEquals(2, svd.getV().getColumnDimension());
    }

    @Test
    public void testConstructorWithMaxZero_EmptySingularValues() {
        // p = min(0, eigenValues.length) = 0  -> while-loop condition false immediately (p>0 false)
        RealMatrix a = m(new double[][] { {1, 0}, {0, 1} });
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(a, 0);
        assertEquals(0, svd.getSingularValues().length);
    }

    @Test(expected = NegativeArraySizeException.class)
    public void testConstructorWithNegativeMax_ThrowsNegativeArraySizeException() {
        // p becomes negative -> "new double[p]" throws NegativeArraySizeException
        RealMatrix a = m(new double[][] { {1, 0}, {0, 1} });
        new SingularValueDecompositionImpl(a, -1);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullMatrix_ThrowsNPE() {
        // Not explicitly validated in source; relies on Java calling matrix.getRowDimension() on null
        new SingularValueDecompositionImpl(null);
    }

    @Test
    public void testZeroMatrix_SingularValuesTrimmedToEmpty() {
        // all eigenvalues == 0 -> while((p>0)&&(eigenValues[p-1]<=0)) trims p to 0
        RealMatrix a = m(new double[][] { {0, 0}, {0, 0} });
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(a);
        assertEquals(0, svd.getSingularValues().length);
    }

    // ---------- getSingularValues() ----------

    @Test
    public void testGetSingularValuesReturnsClone() {
        RealMatrix a = m(new double[][] { {3, 0}, {0, 2} });
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(a);
        double[] sv1 = svd.getSingularValues();
        sv1[0] = -999; // mutate returned clone
        double[] sv2 = svd.getSingularValues();
        assertNotEquals(-999.0, sv2[0], 0);
    }

    @Test
    public void testSingularValuesAreNonNegativeAndDescendingOrConsistent() {
        RealMatrix a = m(new double[][] { {1, 2}, {3, 4}, {5, 6} });
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(a);
        double[] sv = svd.getSingularValues();
        for (double v : sv) {
            assertTrue("singular value must be >= 0", v >= 0);
        }
    }

    // ---------- Caching branches ----------

    @Test
    public void testGetUCachingReturnsSameInstance() {
        RealMatrix a = m(new double[][] { {1, 2}, {3, 4} });
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(a);
        RealMatrix u1 = svd.getU();
        RealMatrix u2 = svd.getU();
        assertSame(u1, u2);
    }

    @Test
    public void testGetUTCachingAndTransposeCorrectness() {
        RealMatrix a = m(new double[][] { {1, 2}, {3, 4} });
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(a);
        RealMatrix ut1 = svd.getUT();
        RealMatrix ut2 = svd.getUT();
        assertSame(ut1, ut2);
        assertMatrixEquals(svd.getU().transpose(), ut1, TOL);
    }

    @Test
    public void testGetSCachingAndDiagonalContent() {
        RealMatrix a = m(new double[][] { {5, 0}, {0, 2} });
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(a);
        RealMatrix s1 = svd.getS();
        RealMatrix s2 = svd.getS();
        assertSame(s1, s2);
        double[] sv = svd.getSingularValues();
        for (int i = 0; i < sv.length; i++) {
            for (int j = 0; j < sv.length; j++) {
                double expected = (i == j) ? sv[i] : 0.0;
                assertEquals(expected, s1.getEntry(i, j), TOL);
            }
        }
    }

    @Test
    public void testGetVCachingReturnsSameInstance() {
        RealMatrix a = m(new double[][] { {1, 2}, {3, 4} });
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(a);
        RealMatrix v1 = svd.getV();
        RealMatrix v2 = svd.getV();
        assertSame(v1, v2);
    }

    @Test
    public void testGetVTCachingAndTransposeCorrectness() {
        RealMatrix a = m(new double[][] { {1, 2}, {3, 4} });
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(a);
        RealMatrix vt1 = svd.getVT();
        RealMatrix vt2 = svd.getVT();
        assertSame(vt1, vt2);
        assertMatrixEquals(svd.getV().transpose(), vt1, TOL);
    }

    // ---------- getNorm / getConditionNumber ----------

    @Test
    public void testGetNorm_EqualsLargestSingularValue() {
        RealMatrix a = m(new double[][] { {3, 0}, {0, 1} });
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(a);
        assertEquals(svd.getSingularValues()[0], svd.getNorm(), TOL);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetNorm_EmptySingularValues_Throws() {
        RealMatrix a = m(new double[][] { {0, 0}, {0, 0} });
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(a);
        svd.getNorm(); // singularValues.length == 0 -> index [0] out of bounds
    }

    @Test
    public void testGetConditionNumber_RatioOfFirstToLast() {
        RealMatrix a = m(new double[][] { {4, 0}, {0, 2} });
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(a);
        double[] sv = svd.getSingularValues();
        double expected = sv[0] / sv[sv.length - 1];
        assertEquals(expected, svd.getConditionNumber(), TOL);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetConditionNumber_EmptySingularValues_Throws() {
        RealMatrix a = m(new double[][] { {0, 0}, {0, 0} });
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(a);
        svd.getConditionNumber();
    }

    // ---------- getRank ----------

    @Test
    public void testGetRank_FullRankMatrix() {
        RealMatrix a = m(new double[][] { {2, 0, 0}, {0, 3, 0}, {0, 0, 4} });
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(a);
        assertEquals(3, svd.getRank());
    }

    @Test
    public void testGetRank_DeficientRankMatrix() {
        // third row = row1 + row2 -> rank 2 out of 3
        RealMatrix a = m(new double[][] {
                {1, 0, 0},
                {0, 1, 0},
                {1, 1, 0}
        });
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(a);
        assertEquals(2, svd.getRank());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetRank_ZeroMatrix_ThrowsDueToEmptyArray() {
        // Known boundary defect: singularValues[0] accessed while array length == 0
        RealMatrix a = m(new double[][] { {0, 0}, {0, 0} });
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(a);
        svd.getRank();
    }

    // ---------- getCovariance ----------

    @Test
    public void testGetCovariance_IdentityMatrix_AllDimensionsIncluded() {
        RealMatrix a = m(new double[][] { {1, 0, 0}, {0, 1, 0}, {0, 0, 1} });
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(a);
        RealMatrix cov = svd.getCovariance(0.0);
        // For A = I, (A^T A)^-1 = I
        RealMatrix expected = m(new double[][] { {1, 0, 0}, {0, 1, 0}, {0, 0, 1} });
        assertMatrixEquals(expected, cov, 1e-6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetCovariance_ThresholdExceedsLargestSingularValue_Throws() {
        RealMatrix a = m(new double[][] { {1, 0}, {0, 1} });
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(a);
        svd.getCovariance(100.0); // dimension == 0 -> IllegalArgumentException
    }

    @Test
    public void testGetCovariance_PartialThreshold_ExcludesSmallSingularValues() {
        RealMatrix a = m(new double[][] { {3, 0}, {0, 1} });
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(a);
        // threshold between the two singular values (3 and 1) -> dimension == 1
        RealMatrix cov = svd.getCovariance(2.0);
        assertEquals(1, cov.getRowDimension());
        assertEquals(1, cov.getColumnDimension());
    }

    // ---------- getSolver() / Solver ----------

    @Test
    public void testGetSolver_NonSingularSquareFullRank() {
        RealMatrix a = m(new double[][] { {4, 3}, {6, 3} }); // det = -6, full rank
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(a);
        DecompositionSolver solver = svd.getSolver();
        assertTrue(solver.isNonSingular());
    }

    @Test
    public void testGetSolver_SingularSquareMatrix_NonSingularFalse() {
        RealMatrix a = m(new double[][] { {1, 2}, {2, 4} }); // rank 1
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(a);
        DecompositionSolver solver = svd.getSolver();
        assertFalse(solver.isNonSingular());
    }

    @Test
    public void testSolver_SolveDoubleArray() {
        RealMatrix a = m(new double[][] { {2, 0}, {0, 1} });
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(a);
        DecompositionSolver solver = svd.getSolver();
        double[] x = solver.solve(new double[] {4, 3});
        assertEquals(2.0, x[0], TOL);
        assertEquals(3.0, x[1], TOL);
    }

    @Test
    public void testSolver_SolveRealVector() {
        RealMatrix a = m(new double[][] { {2, 0}, {0, 1} });
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(a);
        DecompositionSolver solver = svd.getSolver();
        RealVector x = solver.solve(new ArrayRealVector(new double[] {4, 3}));
        assertEquals(2.0, x.getEntry(0), TOL);
        assertEquals(3.0, x.getEntry(1), TOL);
    }

    @Test
    public void testSolver_SolveRealMatrix() {
        RealMatrix a = m(new double[][] { {2, 0}, {0, 1} });
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(a);
        DecompositionSolver solver = svd.getSolver();
        RealMatrix b = m(new double[][] { {1, 0}, {0, 1} }); // identity
        RealMatrix x = solver.solve(b);
        // x should equal inverse(a) = diag(0.5, 1)
        assertEquals(0.5, x.getEntry(0, 0), TOL);
        assertEquals(1.0, x.getEntry(1, 1), TOL);
        assertEquals(0.0, x.getEntry(0, 1), TOL);
        assertEquals(0.0, x.getEntry(1, 0), TOL);
    }

    @Test
    public void testSolver_GetInverse() {
        RealMatrix a = m(new double[][] { {2, 0}, {0, 1} });
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(a);
        DecompositionSolver solver = svd.getSolver();
        RealMatrix inv = solver.getInverse();
        assertEquals(0.5, inv.getEntry(0, 0), TOL);
        assertEquals(1.0, inv.getEntry(1, 1), TOL);
    }
}
