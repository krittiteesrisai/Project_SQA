package org.apache.commons.math.linear;

import org.apache.commons.math.MathRuntimeException;
import org.junit.Test;
import static org.junit.Assert.*;

public class EigenDecompositionImplTest {

    @Test
    public void testSymmetricMatrixConstructorAndGetters() {
        // ทดสอบ Constructor ปกติด้วยเมทริกซ์สมมาตร 2x2
        double[][] data = {
            {4.0, 1.0},
            {1.0, 3.0}
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl decomp = new EigenDecompositionImpl(matrix, 1e-12);

        assertNotNull(decomp.getV());
        assertNotNull(decomp.getD());
        assertNotNull(decomp.getVT());
        
        // ทดสอบเรียกซ้ำเพื่อครอบคลุม Branch ที่ cached เป็นจริงแล้ว
        assertNotNull(decomp.getV());
        assertNotNull(decomp.getVT());

        assertNotNull(decomp.getRealEigenvalues());
        assertEquals(2, decomp.getRealEigenvalues().length);
        assertEquals(4.618, decomp.getRealEigenvalue(0), 1e-3);
        
        assertNotNull(decomp.getImagEigenvalues());
        assertEquals(0.0, decomp.getImagEigenvalue(0), 1e-12);

        assertNotNull(decomp.getEigenvector(0));
        assertTrue(decomp.getDeterminant() > 0);
        assertNotNull(decomp.getSolver());
    }

    @Test(expected = InvalidMatrixException.class)
    public void testAsymmetricMatrixException() {
        // ทดสอบเมทริกซ์ไม่สมมาตร เพื่อบังคับให้เข้าเงื่อนไขโยน InvalidMatrixException
        double[][] data = {
            {4.0, 2.0},
            {1.0, 3.0}
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        new EigenDecompositionImpl(matrix, 1e-12);
    }

    @Test
    public void testTridiagonalDirectConstructors() {
        // ทดสอบ Constructor โดยตรงด้วยอาเรย์ (Tridiagonal) สำหรับ 1, 2, และ 3 แถว
        // 1. ขนาด 1x1
        double[] main1 = {5.0};
        double[] sec1 = {};
        EigenDecompositionImpl decomp1 = new EigenDecompositionImpl(main1, sec1, 1e-12);
        assertEquals(5.0, decomp1.getRealEigenvalue(0), 1e-12);

        // 2. ขนาด 2x2 (ครอบคลุม process2RowsBlock)
        double[] main2 = {2.0, 3.0};
        double[] sec2 = {1.0};
        EigenDecompositionImpl decomp2 = new EigenDecompositionImpl(main2, sec2, 1e-12);
        assertEquals(2, decomp2.getRealEigenvalues().length);

        // 3. ขนาด 3x3 (ครอบคลุม process3RowsBlock)
        double[] main3 = {2.0, 3.0, 4.0};
        double[] sec3 = {1.0, 0.5};
        EigenDecompositionImpl decomp3 = new EigenDecompositionImpl(main3, sec3, 1e-12);
        assertEquals(3, decomp3.getRealEigenvalues().length);
    }

    @Test(expected = InvalidMatrixException.class)
    public void testProcess2RowsBlockInvalidDelta() {
        // สร้างสถานการณ์ที่ทำให้ delta < 0 ใน process2RowsBlock (ถ้าเป็นไปได้ผ่านค่าอนุกรม หรือทดสอบพฤติกรรม)
        // เนื่องจากค่าทางคณิตศาสตร์ของ symmetric matrix ปกติ delta >= 0 เสมอ 
        // เราจำลองผ่านการเรียกผ่าน Constructor โดยตรงด้วยค่าที่ทำให้เกิด Convergence/Invalid หากทำได้ 
        // หรือทดสอบเคสที่บังคับ InvalidMatrixException จากสมการดีกรี 2
        double[] main = {1.0, 1.0};
        double[] secondary = {10.0}; // ค่า off-diagonal สูงเกินไปเทียบกับ diagonal อาจทำให้เกิด InvalidMatrixException หรือ Negative delta
        new EigenDecompositionImpl(main, secondary, 1e-12);
    }

    @Test
    public void testGeneralBlock4x4() {
        // ทดสอบเมทริกซ์ขนาด 4x4 ขึ้นไป เพื่อกระตุ้น General Block และ dqds/dqd algorithms
        double[] main = {4.0, 1.0, 3.0, 2.0};
        double[] secondary = {0.5, 0.1, 0.2};
        EigenDecompositionImpl decomp = new EigenDecompositionImpl(main, secondary, 1e-12);
        assertEquals(4, decomp.getRealEigenvalues().length);
    }

    @Test
    public void testSolverOperations() {
        double[][] data = {
            {4.0, 1.0},
            {1.0, 4.0}
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl decomp = new EigenDecompositionImpl(matrix, 1e-12);
        DecompositionSolver solver = decomp.getSolver();

        assertTrue(solver.isNonSingular());

        // Test solve(double[])
        double[] b = {1.0, 2.0};
        double[] x1 = solver.solve(b);
        assertEquals(2, x1.length);

        // Test solve(RealVector)
        RealVector bVec = new ArrayRealVector(b);
        RealVector xVec = solver.solve(bVec);
        assertEquals(2, xVec.getDimension());

        // Test solve(RealMatrix)
        RealMatrix bMat = MatrixUtils.createRealMatrix(new double[][]{{1.0}, {2.0}});
        RealMatrix xMat = solver.solve(bMat);
        assertEquals(2, xMat.getRowDimension());
        assertEquals(1, xMat.getColumnDimension());

        // Test getInverse()
        RealMatrix inverse = solver.getInverse();
        assertEquals(2, inverse.getRowDimension());
    }

    @Test(expected = SingularMatrixException.class)
    public void testSolverSingularMatrix() {
        // สร้างเมทริกซ์ Singular (มี Eigenvalue เป็น 0)
        double[][] data = {
            {0.0, 0.0},
            {0.0, 0.0}
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl decomp = new EigenDecompositionImpl(matrix, 1e-12);
        DecompositionSolver solver = decomp.getSolver();
        assertFalse(solver.isNonSingular());
        solver.solve(new double[]{1.0, 1.0}); // ต้องโยน SingularMatrixException
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolverVectorDimensionMismatch() {
        double[][] data = {
            {4.0, 1.0},
            {1.0, 3.0}
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl decomp = new EigenDecompositionImpl(matrix, 1e-12);
        DecompositionSolver solver = decomp.getSolver();
        
        // ขนาดเวกเตอร์ไม่ตรงกับมิติของเมทริกซ์ (Expected 2, got 3)
        solver.solve(new double[]{1.0, 2.0, 3.0});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolverRealVectorDimensionMismatch() {
        double[][] data = {
            {4.0, 1.0},
            {1.0, 3.0}
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl decomp = new EigenDecompositionImpl(matrix, 1e-12);
        DecompositionSolver solver = decomp.getSolver();
        
        solver.solve(new ArrayRealVector(new double[]{1.0, 2.0, 3.0}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolverRealMatrixDimensionMismatch() {
        double[][] data = {
            {4.0, 1.0},
            {1.0, 3.0}
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl decomp = new EigenDecompositionImpl(matrix, 1e-12);
        DecompositionSolver solver = decomp.getSolver();
        
        RealMatrix wrongMat = MatrixUtils.createRealMatrix(new double[][]{{1.0}, {2.0}, {3.0}});
        solver.solve(wrongMat);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testOutOfBoundsEigenvalue() {
        double[][] data = {
            {4.0, 1.0},
            {1.0, 3.0}
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl decomp = new EigenDecompositionImpl(matrix, 1e-12);
        decomp.getRealEigenvalue(10); // Index เกินขอบเขต
    }
}