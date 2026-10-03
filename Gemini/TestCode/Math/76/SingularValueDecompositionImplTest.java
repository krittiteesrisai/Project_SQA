package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;

public class SingularValueDecompositionImplTest {

    @Test
    public void testSquareMatrixDecomposition() {
        // ทดสอบเมทริกซ์จัตุรัส m == n (กรณี m >= n)
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(data, false);
        SingularValueDecomposition svd = new SingularValueDecompositionImpl(matrix);

        assertNotNull(svd.getU());
        assertNotNull(svd.getUT());
        assertNotNull(svd.getS());
        assertNotNull(svd.getV());
        assertNotNull(svd.getVT());
        assertNotNull(svd.getSingularValues());
        
        // ทดสอบ Caching (เรียกซ้ำต้องได้ Object เดิม)
        assertSame(svd.getU(), svd.getU());
        assertSame(svd.getUT(), svd.getUT());
        assertSame(svd.getS(), svd.getS());
        assertSame(svd.getV(), svd.getV());
        assertSame(svd.getVT(), svd.getVT());

        // ตรวจสอบ Norm, Condition Number และ Rank
        assertTrue(svd.getNorm() > 0);
        assertTrue(svd.getConditionNumber() >= 1.0);
        assertEquals(2, svd.getRank());
    }

    @Test
    public void testRectangularMatrixMGreaterThanN() {
        // ทดสอบเมทริกซ์ทรงสูง m > n
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0},
            {5.0, 6.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(data, false);
        SingularValueDecomposition svd = new SingularValueDecompositionImpl(matrix);

        assertNotNull(svd.getU());
        assertNotNull(svd.getV());
        assertEquals(3, svd.getU().getRowDimension());
        assertEquals(2, svd.getV().getRowDimension());
    }

    @Test
    public void testRectangularMatrixMLessThanN() {
        // ทดสอบเมทริกซ์ทรงกว้าง m < n (บังคับใช้ Branch B.Bt และ Lower bidiagonal)
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(data, false);
        SingularValueDecomposition svd = new SingularValueDecompositionImpl(matrix);

        assertNotNull(svd.getU());
        assertNotNull(svd.getV());
        assertEquals(2, svd.getU().getColumnDimension());
        assertEquals(3, svd.getV().getRowDimension());
    }

    @Test
    public void testSingleElementMatrix() {
        // ทดสอบขอบเขต (Boundary Limit): เมทริกซ์ขนาด 1x1 เพื่อครอบคลุมลูปที่ความยาว 1 หรือ 0
        double[][] data = {{5.0}};
        RealMatrix matrix = new Array2DRowRealMatrix(data, false);
        SingularValueDecomposition svd = new SingularValueDecompositionImpl(matrix);

        assertEquals(1, svd.getSingularValues().length);
        assertEquals(5.0, svd.getNorm(), 1e-12);
        assertEquals(1, svd.getRank());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetCovarianceDimensionZeroException() {
        // ทดสอบ Edge Case: กำหนด minSingularValue สูงเกินไปจน dimension == 0 เพื่อ trigger Exception
        double[][] data = {
            {1.0, 0.0},
            {0.0, 1.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(data, false);
        SingularValueDecomposition svd = new SingularValueDecompositionImpl(matrix);
        
        // ค่า Singular Value จะเป็น 1.0 ดังนั้นถ้ากำหนดตัดที่ 10.0 จะทำให้ dimension เป็น 0
        svd.getCovariance(10.0);
    }

    @Test
    public void testGetCovarianceNormal() {
        // ทดสอบการคำนวณ Covariance ปกติ
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(data, false);
        SingularValueDecomposition svd = new SingularValueDecompositionImpl(matrix);
        
        RealMatrix cov = svd.getCovariance(0.1);
        assertNotNull(cov);
    }

    @Test
    public void testSolverOperations() {
        // ทดสอบ DecompositionSolver (solve ด้วย double[], RealVector, RealMatrix และ isNonSingular)
        double[][] data = {
            {2.0, 1.0},
            {1.0, 2.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(data, false);
        SingularValueDecomposition svd = new SingularValueDecompositionImpl(matrix);
        DecompositionSolver solver = svd.getSolver();

        assertNotNull(solver);
        assertTrue(solver.isNonSingular());
        assertNotNull(solver.getInverse());

        double[] bArray = {1.0, 2.0};
        double[] solutionArray = solver.solve(bArray);
        assertEquals(2, solutionArray.length);

        RealVector bVector = new ArrayRealVector(bArray);
        RealVector solutionVector = solver.solve(bVector);
        assertNotNull(solutionVector);

        RealMatrix bMatrix = new Array2DRowRealMatrix(new double[][]{{1.0}, {2.0}});
        RealMatrix solutionMatrix = solver.solve(bMatrix);
        assertNotNull(solutionMatrix);
    }
}