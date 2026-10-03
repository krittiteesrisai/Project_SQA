package org.apache.commons.math.linear;

import org.junit.Assert;
import org.junit.Test;

public class CholeskyDecompositionImplTest {

    private static final double EPSILON = 1.0e-11;

    // ------------------------------------------------------------------------
    // 1. Constructor Validation & Exception Branches
    // ------------------------------------------------------------------------

    @Test(expected = NonSquareMatrixException.class)
    public void testNonSquareMatrix() {
        double[][] nonSquareData = {
            { 1.0, 2.0, 3.0 },
            { 4.0, 5.0, 6.0 }
        };
        RealMatrix matrix = new Array2DRowRealMatrix(nonSquareData);
        new CholeskyDecompositionImpl(matrix);
    }

    @Test(expected = NotPositiveDefiniteMatrixException.class)
    public void testNotPositiveDefiniteDiagonalElement() {
        double[][] nonPositiveDiag = {
            { -1.0, 0.0 },
            {  0.0, 2.0 }
        };
        RealMatrix matrix = new Array2DRowRealMatrix(nonPositiveDiag);
        new CholeskyDecompositionImpl(matrix);
    }

    @Test(expected = NotPositiveDefiniteMatrixException.class)
    public void testZeroDiagonalElement() {
        double[][] zeroDiag = {
            { 0.0, 0.0 },
            { 0.0, 1.0 }
        };
        RealMatrix matrix = new Array2DRowRealMatrix(zeroDiag);
        new CholeskyDecompositionImpl(matrix);
    }

    @Test(expected = NotSymmetricMatrixException.class)
    public void testNotSymmetricMatrix() {
        double[][] nonSymmetric = {
            { 2.0, 1.0 },
            { 0.0, 2.0 }
        };
        RealMatrix matrix = new Array2DRowRealMatrix(nonSymmetric);
        new CholeskyDecompositionImpl(matrix);
    }

    @Test(expected = NotPositiveDefiniteMatrixException.class)
    public void testNotPositiveDefiniteDuringTransformation() {
        // เมทริกซ์นี้มี diagonal เริ่มต้นเป็นบวก แต่ไม่ใช่ Positive Definite (Det < 0)
        double[][] notPositiveDefinite = {
            { 1.0, 2.0 },
            { 2.0, 1.0 }
        };
        RealMatrix matrix = new Array2DRowRealMatrix(notPositiveDefinite);
        new CholeskyDecompositionImpl(matrix);
    }

    // ------------------------------------------------------------------------
    // 2. Decomposition, Caching, and Determinant
    // ------------------------------------------------------------------------

    @Test
    public void testDecompositionAndCache() {
        double[][] data = {
            { 4.0,  12.0, -16.0 },
            { 12.0, 37.0, -43.0 },
            {-16.0, -43.0, 98.0 }
        };
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        CholeskyDecomposition cholesky = new CholeskyDecompositionImpl(matrix);

        // ทดสอบ Caching (เรียกซ้ำเพื่อครอบคลุมกรณี cached != null)
        RealMatrix l1 = cholesky.getL();
        RealMatrix l2 = cholesky.getL();
        Assert.assertSame(l1, l2);

        RealMatrix lt1 = cholesky.getLT();
        RealMatrix lt2 = cholesky.getLT();
        Assert.assertSame(lt1, lt2);

        // ตรวจสอบคุณสมบัติ L * L^T = A
        RealMatrix reconstructed = l1.multiply(lt1);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                Assert.assertEquals(data[i][j], reconstructed.getEntry(i, j), EPSILON);
            }
        }

        // Determinant = (2 * 1 * 3)^2 = 36
        Assert.assertEquals(36.0, cholesky.getDeterminant(), EPSILON);
    }

    @Test
    public void testDimension1() {
        double[][] data = { { 9.0 } };
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        CholeskyDecomposition cholesky = new CholeskyDecompositionImpl(matrix);

        Assert.assertEquals(3.0, cholesky.getL().getEntry(0, 0), EPSILON);
        Assert.assertEquals(3.0, cholesky.getLT().getEntry(0, 0), EPSILON);
        Assert.assertEquals(9.0, cholesky.getDeterminant(), EPSILON);
    }

    // ------------------------------------------------------------------------
    // 3. Solver Tests (Vector & Matrix)
    // ------------------------------------------------------------------------

    @Test
    public void testSolverSolveDoubleArray() {
        double[][] data = {
            { 2.0, -1.0, 0.0 },
            {-1.0,  2.0, -1.0 },
            { 0.0, -1.0, 2.0 }
        };
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        DecompositionSolver solver = new CholeskyDecompositionImpl(matrix).getSolver();

        Assert.assertTrue(solver.isNonSingular());

        double[] b = { 1.0, 0.0, 1.0 };
        double[] x = solver.solve(b);

        // ตรวจสอบคำตอบ A * x = b
        Assert.assertEquals(1.0, x[0], EPSILON);
        Assert.assertEquals(1.0, x[1], EPSILON);
        Assert.assertEquals(1.0, x[2], EPSILON);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolverSolveDoubleArrayDimensionMismatch() {
        double[][] data = { { 2.0, 0.0 }, { 0.0, 2.0 } };
        DecompositionSolver solver = new CholeskyDecompositionImpl(new Array2DRowRealMatrix(data)).getSolver();
        solver.solve(new double[]{ 1.0, 2.0, 3.0 });
    }

    @Test
    public void testSolverSolveRealVectorImpl() {
        double[][] data = {
            { 4.0, 2.0 },
            { 2.0, 2.0 }
        };
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        DecompositionSolver solver = new CholeskyDecompositionImpl(matrix).getSolver();

        RealVectorImpl b = new RealVectorImpl(new double[]{ 6.0, 4.0 });
        RealVector x = solver.solve(b);

        Assert.assertEquals(1.0, x.getEntry(0), EPSILON);
        Assert.assertEquals(1.0, x.getEntry(1), EPSILON);
    }

    @Test
    public void testSolverSolveCustomRealVector() {
        // ทดสอบสาขา ClassCastException เพื่อเข้าเงื่อนไข RealVector ทั่วไปที่ไม่ใช่ RealVectorImpl
        double[][] data = {
            { 4.0, 2.0 },
            { 2.0, 2.0 }
        };
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        DecompositionSolver solver = new CholeskyDecompositionImpl(matrix).getSolver();

        RealVector customVector = new ArrayRealVector(new double[]{ 6.0, 4.0 });
        RealVector x = solver.solve(customVector);

        Assert.assertEquals(1.0, x.getEntry(0), EPSILON);
        Assert.assertEquals(1.0, x.getEntry(1), EPSILON);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolverSolveCustomRealVectorDimensionMismatch() {
        double[][] data = {
            { 4.0, 2.0 },
            { 2.0, 2.0 }
        };
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        DecompositionSolver solver = new CholeskyDecompositionImpl(matrix).getSolver();

        RealVector invalidDimensionVector = new ArrayRealVector(new double[]{ 1.0, 2.0, 3.0 });
        solver.solve(invalidDimensionVector);
    }

    @Test
    public void testSolverSolveMatrix() {
        double[][] data = {
            { 2.0, -1.0, 0.0 },
            {-1.0,  2.0, -1.0 },
            { 0.0, -1.0, 2.0 }
        };
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        DecompositionSolver solver = new CholeskyDecompositionImpl(matrix).getSolver();

        RealMatrix b = new Array2DRowRealMatrix(new double[][]{
            { 1.0, 2.0 },
            { 0.0, 1.0 },
            { 1.0, 2.0 }
        });

        RealMatrix x = solver.solve(b);
        RealMatrix ax = matrix.multiply(x);

        for (int i = 0; i < b.getRowDimension(); i++) {
            for (int j = 0; j < b.getColumnDimension(); j++) {
                Assert.assertEquals(b.getEntry(i, j), ax.getEntry(i, j), EPSILON);
            }
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolverSolveMatrixDimensionMismatch() {
        double[][] data = { { 2.0, 0.0 }, { 0.0, 2.0 } };
        DecompositionSolver solver = new CholeskyDecompositionImpl(new Array2DRowRealMatrix(data)).getSolver();
        RealMatrix b = new Array2DRowRealMatrix(new double[][]{ { 1.0 }, { 2.0 }, { 3.0 } });
        solver.solve(b);
    }

    @Test
    public void testSolverGetInverse() {
        double[][] data = {
            { 2.0, -1.0, 0.0 },
            {-1.0,  2.0, -1.0 },
            { 0.0, -1.0, 2.0 }
        };
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        DecompositionSolver solver = new CholeskyDecompositionImpl(matrix).getSolver();
        RealMatrix inverse = solver.getInverse();

        RealMatrix identity = matrix.multiply(inverse);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                double expected = (i == j) ? 1.0 : 0.0;
                Assert.assertEquals(expected, identity.getEntry(i, j), EPSILON);
            }
        }
    }
}