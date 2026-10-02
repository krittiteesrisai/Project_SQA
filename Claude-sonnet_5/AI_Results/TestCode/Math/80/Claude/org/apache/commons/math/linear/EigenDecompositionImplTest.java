package org.apache.commons.math.linear;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.util.MathUtils;

public class EigenDecompositionImplTest {

    private static final double EPS = 1e-6;

    // ---------- Helper utilities ----------

    private RealMatrix m(double[][] data) {
        return MatrixUtils.createRealMatrix(data);
    }

    private void assertMatrixEquals(double[][] expected, RealMatrix actual, double delta) {
        assertEquals(expected.length, actual.getRowDimension());
        assertEquals(expected[0].length, actual.getColumnDimension());
        for (int i = 0; i < expected.length; i++) {
            for (int j = 0; j < expected[i].length; j++) {
                assertEquals("at (" + i + "," + j + ")",
                        expected[i][j], actual.getEntry(i, j), delta);
            }
        }
    }

    private void assertOrthogonal(RealMatrix v, int dim, double delta) {
        RealMatrix prod = v.transpose().multiply(v);
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                double expected = (i == j) ? 1.0 : 0.0;
                assertEquals(expected, prod.getEntry(i, j), delta);
            }
        }
    }

    private void assertEigenEquation(RealMatrix a, RealMatrix v,
                                      double[] eigenvalues, double delta) {
        int m = eigenvalues.length;
        for (int k = 0; k < m; k++) {
            double[] vk = new double[m];
            for (int i = 0; i < m; i++) {
                vk[i] = v.getEntry(i, k);
            }
            double[] avk = a.operate(vk);
            for (int i = 0; i < m; i++) {
                assertEquals(eigenvalues[k] * vk[i], avk[i], delta);
            }
        }
    }

    // ---------- Constructor: symmetry checks ----------

    @Test(expected = InvalidMatrixException.class)
    public void testAsymmetricMatrixThrows() {
        RealMatrix a = m(new double[][] { { 1, 2 }, { 3, 4 } });
        new EigenDecompositionImpl(a, MathUtils.SAFE_MIN);
    }

    @Test
    public void testNearlySymmetricMatrixWithinToleranceDoesNotThrow() {
        // difference เล็กมากเทียบกับ eps threshold -> ควรผ่าน ไม่ throw
        RealMatrix a = m(new double[][] { { 1, 1 }, { 1 + 1e-16, 1 } });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(a, MathUtils.SAFE_MIN);
        assertEquals(2, ed.getRealEigenvalues().length);
    }

    @Test(expected = NullPointerException.class)
    public void testNullMatrixThrowsNPE() {
        new EigenDecompositionImpl((RealMatrix) null, MathUtils.SAFE_MIN);
    }

    @Test(expected = NullPointerException.class)
    public void testNullMainArrayThrowsNPE() {
        new EigenDecompositionImpl((double[]) null, new double[] { 1 }, MathUtils.SAFE_MIN);
    }

    // ---------- Boundary: empty / mismatched arrays (ไม่มี validation ในซอร์ส) ----------

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testEmptyArraysThrowsAIOOBE() {
        // main.length == 0 -> computeGershgorinCircles เข้าถึง main[-1]
        new EigenDecompositionImpl(new double[0], new double[0], MathUtils.SAFE_MIN);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testMismatchedArrayLengthsThrowsAIOOBE() {
        // secondary สั้นเกินไป -> ไม่มีการตรวจสอบ ขนาด, เกิด exception ภายใน
        new EigenDecompositionImpl(new double[] { 1, 2 }, new double[0], MathUtils.SAFE_MIN);
    }

    // ---------- 1-row block ----------

    @Test
    public void testSingleElementMatrix() {
        RealMatrix a = m(new double[][] { { 5.0 } });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(a, MathUtils.SAFE_MIN);
        assertEquals(5.0, ed.getRealEigenvalue(0), EPS);
        assertEquals(0.0, ed.getImagEigenvalue(0), EPS);
        assertEquals(5.0, ed.getDeterminant(), EPS);
    }

    @Test
    public void testDiagonalMatrixAllSingleBlocks() {
        // off-diagonal = 0 ทั้งหมด -> computeSplits จะ split ทุกจุด -> process1RowBlock x3
        RealMatrix a = m(new double[][] {
                { 2, 0, 0 },
                { 0, 3, 0 },
                { 0, 0, 4 }
        });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(a, MathUtils.SAFE_MIN);
        double[] ev = ed.getRealEigenvalues();
        assertArrayEquals(new double[] { 4, 3, 2 }, ev, EPS);
        assertEquals(24.0, ed.getDeterminant(), EPS);
    }

    // ---------- 2-row block ----------

    @Test
    public void test2x2MatrixViaFullMatrixConstructor() {
        RealMatrix a = m(new double[][] { { 2, 1 }, { 1, 2 } });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(a, MathUtils.SAFE_MIN);
        double[] ev = ed.getRealEigenvalues();
        assertArrayEquals(new double[] { 3.0, 1.0 }, ev, EPS);
        assertEquals(3.0, ed.getDeterminant(), EPS);

        RealMatrix v = ed.getV();
        assertOrthogonal(v, 2, 1e-6);
        assertEigenEquation(a, v, ev, 1e-6);

        RealMatrix vt = ed.getVT();
        assertMatrixEquals(
                new double[][] {
                        { v.getEntry(0, 0), v.getEntry(1, 0) },
                        { v.getEntry(0, 1), v.getEntry(1, 1) }
                }, vt, 1e-9);
    }

    @Test
    public void test2x2TridiagonalConstructorDirect() {
        // transformer == null branch ของ findEigenVectors / getEigenvector
        EigenDecompositionImpl ed = new EigenDecompositionImpl(
                new double[] { 5, 1 }, new double[] { 2 }, MathUtils.SAFE_MIN);
        double[] ev = ed.getRealEigenvalues();
        assertEquals(6.0, ev[0] + ev[1], EPS);   // trace
        assertEquals(1.0, ed.getDeterminant(), EPS);
        assertEquals(5.828427, ev[0], 1e-5);
        assertEquals(0.171573, ev[1], 1e-5);

        RealVector vec = ed.getEigenvector(0);
        assertEquals(2, vec.getDimension());
    }

    // ---------- 3-row block ----------

    @Test
    public void test3x3TridiagonalMatrix() {
        RealMatrix a = m(new double[][] {
                { 2, 1, 0 },
                { 1, 2, 1 },
                { 0, 1, 2 }
        });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(a, MathUtils.SAFE_MIN);
        double[] ev = ed.getRealEigenvalues();
        assertArrayEquals(new double[] { 2 + Math.sqrt(2), 2.0, 2 - Math.sqrt(2) }, ev, EPS);
        assertEquals(4.0, ed.getDeterminant(), EPS);

        RealMatrix v = ed.getV();
        assertOrthogonal(v, 3, 1e-6);
        assertEigenEquation(a, v, ev, 1e-6);
    }

    // ---------- Multi-block split + mix of 2-row & 3-row blocks ----------

    @Test
    public void testMultipleSplitBlocks() {
        // secondary[1] == 0 ทำให้เกิดการ split เป็น block ขนาด 2 และ 3
        double[] main = { 5, 1, 2, 2, 2 };
        double[] secondary = { 2, 0, 1, 1 };
        EigenDecompositionImpl ed = new EigenDecompositionImpl(main, secondary, MathUtils.SAFE_MIN);
        double[] ev = ed.getRealEigenvalues();

        assertEquals(5, ev.length);
        double sum = 0;
        for (double e : ev) sum += e;
        assertEquals(12.0, sum, EPS); // trace = 5+1+2+2+2

        assertEquals(5.828427, ev[0], 1e-4);
        assertEquals(3.414214, ev[1], 1e-4);
        assertEquals(2.0, ev[2], 1e-4);
        assertEquals(0.585786, ev[3], 1e-4);
        assertEquals(0.171573, ev[4], 1e-4);

        assertEquals(4.0, ed.getDeterminant(), 1e-4);
    }

    // ---------- Default branch (n >= 4, processGeneralBlock) ----------

    @Test
    public void test4x4FullSymmetricMatrixDefaultBlock() {
        RealMatrix a = m(new double[][] {
                { 4, 1, -2, 2 },
                { 1, 2, 0, 1 },
                { -2, 0, 3, -2 },
                { 2, 1, -2, -1 }
        });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(a, MathUtils.SAFE_MIN);
        double[] ev = ed.getRealEigenvalues();
        assertEquals(4, ev.length);

        double sum = 0;
        for (double e : ev) sum += e;
        assertEquals(8.0, sum, 1e-5); // trace = 4+2+3-1

        // sorted descending
        for (int i = 0; i < ev.length - 1; i++) {
            assertTrue(ev[i] >= ev[i + 1]);
        }

        RealMatrix v = ed.getV();
        assertOrthogonal(v, 4, 1e-5);
        assertEigenEquation(a, v, ev, 1e-4);

        double detFromEigen = 1;
        for (double e : ev) detFromEigen *= e;
        assertEquals(detFromEigen, ed.getDeterminant(), 1e-9);
    }

    // ---------- getD / cache behaviour ----------

    @Test
    public void testGetDCreatesDiagonalMatrixAndCaches() {
        RealMatrix a = m(new double[][] { { 2, 1 }, { 1, 2 } });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(a, MathUtils.SAFE_MIN);
        RealMatrix d1 = ed.getD();
        RealMatrix d2 = ed.getD(); // cached branch (cachedD != null)
        assertSame(d1, d2);
        assertEquals(0.0, d1.getEntry(0, 1), EPS);
        assertEquals(0.0, d1.getEntry(1, 0), EPS);
    }

    @Test
    public void testGetVCached() {
        RealMatrix a = m(new double[][] { { 2, 1 }, { 1, 2 } });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(a, MathUtils.SAFE_MIN);
        RealMatrix v1 = ed.getV();
        RealMatrix v2 = ed.getV(); // cached branch
        assertSame(v1, v2);
    }

    @Test
    public void testGetVTCached() {
        RealMatrix a = m(new double[][] { { 2, 1 }, { 1, 2 } });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(a, MathUtils.SAFE_MIN);
        RealMatrix vt1 = ed.getVT();
        RealMatrix vt2 = ed.getVT();
        assertSame(vt1, vt2);
    }

    // ---------- Imag eigenvalues & clone semantics ----------

    @Test
    public void testImagEigenvaluesAlwaysZero() {
        RealMatrix a = m(new double[][] { { 2, 1 }, { 1, 2 } });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(a, MathUtils.SAFE_MIN);
        double[] imag = ed.getImagEigenvalues();
        assertArrayEquals(new double[] { 0.0, 0.0 }, imag, 0.0);
        assertEquals(0.0, ed.getImagEigenvalue(0), 0.0);
        assertEquals(0.0, ed.getImagEigenvalue(1), 0.0);
    }

    @Test
    public void testGetRealEigenvaluesReturnsClone() {
        RealMatrix a = m(new double[][] { { 2, 1 }, { 1, 2 } });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(a, MathUtils.SAFE_MIN);
        double[] ev1 = ed.getRealEigenvalues();
        ev1[0] = -999.0;
        double[] ev2 = ed.getRealEigenvalues();
        assertNotEquals(-999.0, ev2[0], 0.0);
    }

    // ---------- Out-of-bounds access ----------

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetRealEigenvalueOutOfBounds() {
        RealMatrix a = m(new double[][] { { 2, 1 }, { 1, 2 } });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(a, MathUtils.SAFE_MIN);
        ed.getRealEigenvalue(5);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetImagEigenvalueOutOfBounds() {
        RealMatrix a = m(new double[][] { { 2, 1 }, { 1, 2 } });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(a, MathUtils.SAFE_MIN);
        ed.getImagEigenvalue(-1);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetEigenvectorOutOfBounds() {
        RealMatrix a = m(new double[][] { { 2, 1 }, { 1, 2 } });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(a, MathUtils.SAFE_MIN);
        ed.getEigenvector(10);
    }

    // ---------- Singular matrix -> mu branch (true) + solver singular checks ----------

    @Test
    public void testSingularMatrixEigenvalues() {
        RealMatrix a = m(new double[][] { { 1, 1 }, { 1, 1 } });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(a, MathUtils.SAFE_MIN);
        double[] ev = ed.getRealEigenvalues();
        assertArrayEquals(new double[] { 2.0, 0.0 }, ev, EPS);

        // trigger findEigenVectors -> mu branch true (last eigenvalue <=0, first >0)
        RealMatrix v = ed.getV();
        assertEquals(2, v.getColumnDimension());

        DecompositionSolver solver = ed.getSolver();
        assertFalse(solver.isNonSingular());
    }

    @Test(expected = SingularMatrixException.class)
    public void testSolverSolveDoubleArrayOnSingularMatrixThrows() {
        RealMatrix a = m(new double[][] { { 1, 1 }, { 1, 1 } });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(a, MathUtils.SAFE_MIN);
        ed.getSolver().solve(new double[] { 1, 2 });
    }

    @Test(expected = SingularMatrixException.class)
    public void testSolverGetInverseOnSingularMatrixThrows() {
        RealMatrix a = m(new double[][] { { 1, 1 }, { 1, 1 } });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(a, MathUtils.SAFE_MIN);
        ed.getSolver().getInverse();
    }

    // ---------- Solver correctness on non-singular matrix (mu branch false) ----------

    @Test
    public void testSolverIsNonSingularTrue() {
        RealMatrix a = m(new double[][] { { 2, 1 }, { 1, 2 } });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(a, MathUtils.SAFE_MIN);
        assertTrue(ed.getSolver().isNonSingular());
    }

    @Test
    public void testSolverSolveDoubleArray() {
        RealMatrix a = m(new double[][] { { 2, 1 }, { 1, 2 } });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(a, MathUtils.SAFE_MIN);
        double[] x = ed.getSolver().solve(new double[] { 1, 0 });
        assertEquals(2.0 / 3.0, x[0], 1e-5);
        assertEquals(-1.0 / 3.0, x[1], 1e-5);
    }

    @Test
    public void testSolverSolveRealVector() {
        RealMatrix a = m(new double[][] { { 2, 1 }, { 1, 2 } });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(a, MathUtils.SAFE_MIN);
        RealVector b = new ArrayRealVector(new double[] { 1, 0 });
        RealVector x = ed.getSolver().solve(b);
        assertEquals(2.0 / 3.0, x.getEntry(0), 1e-5);
        assertEquals(-1.0 / 3.0, x.getEntry(1), 1e-5);
    }

    @Test
    public void testSolverSolveRealMatrixEqualsInverse() {
        RealMatrix a = m(new double[][] { { 2, 1 }, { 1, 2 } });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(a, MathUtils.SAFE_MIN);
        RealMatrix identity = m(new double[][] { { 1, 0 }, { 0, 1 } });
        RealMatrix inv = ed.getSolver().solve(identity);
        assertMatrixEquals(new double[][] {
                { 2.0 / 3.0, -1.0 / 3.0 },
                { -1.0 / 3.0, 2.0 / 3.0 }
        }, inv, 1e-5);
    }

    @Test
    public void testSolverGetInverse() {
        RealMatrix a = m(new double[][] { { 2, 1 }, { 1, 2 } });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(a, MathUtils.SAFE_MIN);
        RealMatrix inv = ed.getSolver().getInverse();
        assertMatrixEquals(new double[][] {
                { 2.0 / 3.0, -1.0 / 3.0 },
                { -1.0 / 3.0, 2.0 / 3.0 }
        }, inv, 1e-5);
    }

    // ---------- Solver dimension mismatch ----------

    @Test(expected = IllegalArgumentException.class)
    public void testSolverSolveDoubleArrayWrongLength() {
        RealMatrix a = m(new double[][] { { 2, 1 }, { 1, 2 } });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(a, MathUtils.SAFE_MIN);
        ed.getSolver().solve(new double[] { 1, 2, 3 });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolverSolveRealVectorWrongLength() {
        RealMatrix a = m(new double[][] { { 2, 1 }, { 1, 2 } });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(a, MathUtils.SAFE_MIN);
        ed.getSolver().solve(new ArrayRealVector(new double[] { 1, 2, 3 }));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolverSolveRealMatrixWrongRowDimension() {
        RealMatrix a = m(new double[][] { { 2, 1 }, { 1, 2 } });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(a, MathUtils.SAFE_MIN);
        RealMatrix b = m(new double[][] { { 1 }, { 2 }, { 3 } });
        ed.getSolver().solve(b);
    }
}
