package org.apache.commons.math.linear;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Unit tests for {@link CholeskyDecompositionImpl}.
 *
 * หมายเหตุ:
 * - ใช้เฉพาะ JUnit 4 (junit-4.12) ตามที่กำหนด
 * - อ้างอิง constructor / method ตามซอร์สที่ให้มาเท่านั้น ไม่เดา behavior เพิ่ม
 * - บางกรณี (เช่น การส่ง RealVector implementation อื่นที่ไม่ใช่ RealVectorImpl
 *   เพื่อทดสอบ branch catch(ClassCastException) ใน solve(RealVector))
 *   ไม่สามารถทำได้ง่ายโดยไม่สร้าง mock ซับซ้อนเพิ่มเติม จึงข้ามไปพร้อมคอมเมนต์กำกับ
 */
public class CholeskyDecompositionImplTest {

    private static final double EPS = 1.0e-9;

    // ---------------------------------------------------------------
    // Constructor: NonSquareMatrixException branch
    // ---------------------------------------------------------------
    @Test(expected = NonSquareMatrixException.class)
    public void testConstructorNonSquareMatrixThrows() {
        double[][] data = {
            {1, 2, 3},
            {4, 5, 6}
        };
        RealMatrix m = new RealMatrixImpl(data);
        new CholeskyDecompositionImpl(m);
    }

    // ---------------------------------------------------------------
    // Constructor: NotPositiveDefiniteMatrixException branch
    // (diagonal element < absolutePositivityThreshold)
    // ---------------------------------------------------------------
    @Test(expected = NotPositiveDefiniteMatrixException.class)
    public void testConstructorNegativeDiagonalThrows() {
        double[][] data = { {-1.0} };
        RealMatrix m = new RealMatrixImpl(data);
        new CholeskyDecompositionImpl(m);
    }

    // Boundary: diagonal == threshold ควร "ไม่" throw (condition ใช้ < เท่านั้น)
    @Test
    public void testConstructorDiagonalEqualsThresholdDoesNotThrow() {
        double threshold = 0.001;
        double[][] data = { {threshold} };
        RealMatrix m = new RealMatrixImpl(data);
        // ไม่ควร throw เพราะ threshold ไม่ < threshold
        CholeskyDecompositionImpl c =
            new CholeskyDecompositionImpl(m, 1.0e-15, threshold);
        assertEquals(threshold, c.getDeterminant(), EPS);
    }

    // Boundary: diagonal ต่ำกว่า threshold เล็กน้อย -> throw
    @Test(expected = NotPositiveDefiniteMatrixException.class)
    public void testConstructorDiagonalJustBelowThresholdThrows() {
        double threshold = 0.001;
        double[][] data = { {threshold - 1.0e-9} };
        RealMatrix m = new RealMatrixImpl(data);
        new CholeskyDecompositionImpl(m, 1.0e-15, threshold);
    }

    // ---------------------------------------------------------------
    // Constructor: NotSymmetricMatrixException branch
    // ---------------------------------------------------------------
    @Test(expected = NotSymmetricMatrixException.class)
    public void testConstructorNotSymmetricThrows() {
        // diff = |1-3| = 2, maxDelta = 1e-15*3 -> ไม่ผ่าน
        double[][] data = {
            {2, 1},
            {3, 2}
        };
        RealMatrix m = new RealMatrixImpl(data);
        new CholeskyDecompositionImpl(m);
    }

    // Boundary: diff == maxDelta พอดี -> ไม่ throw (condition ใช้ >)
    @Test
    public void testConstructorSymmetryDiffEqualsMaxDeltaDoesNotThrow() {
        double relThreshold = 0.5;
        // a=4, b=2 -> diff=2, maxDelta = 0.5*max(4,2)=2 (ไม่ > 2)
        double[][] data = {
            {5, 4},
            {2, 5}
        };
        RealMatrix m = new RealMatrixImpl(data);
        CholeskyDecompositionImpl c =
            new CholeskyDecompositionImpl(m, relThreshold, 1.0e-10);
        assertTrue(c.getDeterminant() > 0);
    }

    // Boundary: diff เกิน maxDelta เล็กน้อย -> throw
    @Test(expected = NotSymmetricMatrixException.class)
    public void testConstructorSymmetryDiffExceedsMaxDeltaThrows() {
        double relThreshold = 0.5;
        // a=4, b=1 -> diff=3, maxDelta=0.5*4=2 -> throw
        double[][] data = {
            {5, 4},
            {1, 5}
        };
        RealMatrix m = new RealMatrixImpl(data);
        new CholeskyDecompositionImpl(m, relThreshold, 1.0e-10);
    }

    // ---------------------------------------------------------------
    // Constructor: ค่าปกติ (ผ่านทุกเงื่อนไข) + getL / getLT / getDeterminant
    // ---------------------------------------------------------------
    private CholeskyDecompositionImpl buildValidDecomposition() {
        double[][] data = {
            {4, 2},
            {2, 3}
        };
        RealMatrix m = new RealMatrixImpl(data);
        return new CholeskyDecompositionImpl(m);
    }

    @Test
    public void testGetLT() {
        CholeskyDecompositionImpl c = buildValidDecomposition();
        RealMatrix lt = c.getLT();
        // LT = [[2,1],[0,sqrt(2)]]
        assertEquals(2.0, lt.getEntry(0, 0), EPS);
        assertEquals(1.0, lt.getEntry(0, 1), EPS);
        assertEquals(0.0, lt.getEntry(1, 0), EPS);
        assertEquals(Math.sqrt(2.0), lt.getEntry(1, 1), EPS);

        // เรียกซ้ำเพื่อทดสอบ branch "cachedLT != null" (ไม่สร้างใหม่)
        RealMatrix lt2 = c.getLT();
        assertEquals(lt.getEntry(0, 0), lt2.getEntry(0, 0), EPS);
    }

    @Test
    public void testGetL() {
        CholeskyDecompositionImpl c = buildValidDecomposition();
        RealMatrix l = c.getL();
        // L = LT^T = [[2,0],[1,sqrt(2)]]
        assertEquals(2.0, l.getEntry(0, 0), EPS);
        assertEquals(0.0, l.getEntry(0, 1), EPS);
        assertEquals(1.0, l.getEntry(1, 0), EPS);
        assertEquals(Math.sqrt(2.0), l.getEntry(1, 1), EPS);

        // เรียกซ้ำเพื่อทดสอบ branch "cachedL != null"
        RealMatrix l2 = c.getL();
        assertEquals(l.getEntry(1, 1), l2.getEntry(1, 1), EPS);

        // ตรวจสอบ A = L * LT
        RealMatrix a = l.multiply(c.getLT());
        assertEquals(4.0, a.getEntry(0, 0), EPS);
        assertEquals(2.0, a.getEntry(0, 1), EPS);
        assertEquals(2.0, a.getEntry(1, 0), EPS);
        assertEquals(3.0, a.getEntry(1, 1), EPS);
    }

    @Test
    public void testGetDeterminant() {
        CholeskyDecompositionImpl c = buildValidDecomposition();
        // det([[4,2],[2,3]]) = 4*3 - 2*2 = 8
        assertEquals(8.0, c.getDeterminant(), EPS);
    }

    // ---------------------------------------------------------------
    // Solver: isNonSingular always true
    // ---------------------------------------------------------------
    @Test
    public void testIsNonSingularAlwaysTrue() {
        CholeskyDecompositionImpl c = buildValidDecomposition();
        DecompositionSolver solver = c.getSolver();
        assertTrue(solver.isNonSingular());
    }

    // ---------------------------------------------------------------
    // Solver.solve(double[]) - normal case
    // ---------------------------------------------------------------
    @Test
    public void testSolveDoubleArray() {
        CholeskyDecompositionImpl c = buildValidDecomposition();
        DecompositionSolver solver = c.getSolver();
        // A=[[4,2],[2,3]], b=[6,5] -> x=[1,1]
        double[] b = {6, 5};
        double[] x = solver.solve(b);
        assertEquals(1.0, x[0], EPS);
        assertEquals(1.0, x[1], EPS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveDoubleArrayLengthMismatchThrows() {
        CholeskyDecompositionImpl c = buildValidDecomposition();
        DecompositionSolver solver = c.getSolver();
        double[] b = {1, 2, 3}; // length != matrix order (2)
        solver.solve(b);
    }

    // ---------------------------------------------------------------
    // Solver.solve(RealVector) - ผ่าน RealVectorImpl (branch try สำเร็จ)
    // ---------------------------------------------------------------
    @Test
    public void testSolveRealVectorImplInstance() {
        CholeskyDecompositionImpl c = buildValidDecomposition();
        DecompositionSolver solver = c.getSolver();
        RealVector b = new RealVectorImpl(new double[]{6, 5});
        RealVector x = solver.solve(b);
        assertEquals(1.0, x.getEntry(0), EPS);
        assertEquals(1.0, x.getEntry(1), EPS);
    }

    // หมายเหตุ: branch "catch(ClassCastException)" ใน solve(RealVector)
    // จะถูก execute เมื่อ b ไม่ใช่ RealVectorImpl แต่การสร้าง RealVector
    // implementation อื่นต้อง implement interface ทั้งหมด (ซับซ้อนเกินกว่าที่
    // ซอร์สที่ให้มาระบุ) จึงไม่ทดสอบ branch นี้ตรง ๆ เพื่อไม่ guess behavior เพิ่ม

    // ---------------------------------------------------------------
    // Solver.solve(RealMatrix) - normal + mismatch
    // ---------------------------------------------------------------
    @Test
    public void testSolveRealMatrix() {
        CholeskyDecompositionImpl c = buildValidDecomposition();
        DecompositionSolver solver = c.getSolver();
        // ใช้ identity เป็น B เพื่อเทียบกับ getInverse()
        RealMatrix identity = MatrixUtils.createRealIdentityMatrix(2);
        RealMatrix inv = solver.solve(identity);
        // inverse ของ [[4,2],[2,3]] = [[0.375,-0.25],[-0.25,0.5]]
        assertEquals(0.375, inv.getEntry(0, 0), EPS);
        assertEquals(-0.25, inv.getEntry(0, 1), EPS);
        assertEquals(-0.25, inv.getEntry(1, 0), EPS);
        assertEquals(0.5, inv.getEntry(1, 1), EPS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveRealMatrixRowDimensionMismatchThrows() {
        CholeskyDecompositionImpl c = buildValidDecomposition();
        DecompositionSolver solver = c.getSolver();
        double[][] data = { {1}, {2}, {3} }; // 3 rows != order 2
        RealMatrix b = new RealMatrixImpl(data);
        solver.solve(b);
    }

    // ---------------------------------------------------------------
    // Solver.getInverse()
    // ---------------------------------------------------------------
    @Test
    public void testGetInverse() {
        CholeskyDecompositionImpl c = buildValidDecomposition();
        DecompositionSolver solver = c.getSolver();
        RealMatrix inv = solver.getInverse();
        assertEquals(0.375, inv.getEntry(0, 0), EPS);
        assertEquals(-0.25, inv.getEntry(0, 1), EPS);
        assertEquals(-0.25, inv.getEntry(1, 0), EPS);
        assertEquals(0.5, inv.getEntry(1, 1), EPS);
    }

    // ---------------------------------------------------------------
    // ทดสอบ loop หลายรอบ (order > 2) เพื่อครอบคลุม inner for-loop มากขึ้น
    // ---------------------------------------------------------------
    @Test
    public void testThreeByThreeValidMatrix() {
        // Symmetric positive-definite 3x3:
        // A = [[6,3,4],[3,6,5],[4,5,10]]
        double[][] data = {
            {6, 3, 4},
            {3, 6, 5},
            {4, 5, 10}
        };
        RealMatrix m = new RealMatrixImpl(data);
        CholeskyDecompositionImpl c = new CholeskyDecompositionImpl(m);
        RealMatrix l = c.getL();
        RealMatrix lt = c.getLT();
        RealMatrix recomposed = l.multiply(lt);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                assertEquals(data[i][j], recomposed.getEntry(i, j), 1e-8);
            }
        }
    }

    // ---------------------------------------------------------------
    // ทดสอบกรณี "fault-detection": matrix ที่สมมาตรและ diagonal เริ่มต้น
    // ผ่านเงื่อนไขตรวจสอบตอนต้น (>= threshold) แต่ไม่ positive-definite จริง
    // ตามทฤษฎีควร throw NotPositiveDefiniteMatrixException แต่ลูป "transform"
    // ไม่ได้ตรวจซ้ำระหว่างคำนวณ -> อาจได้ NaN แทน exception (บั๊กที่รู้จักของ Math-86b)
    //
    // Test นี้ตั้งความคาดหวังตาม "สัญญาของ decomposition" (ควร throw)
    // หาก implementation มีบั๊กดังกล่าว test จะ FAIL ซึ่งคือการดักจับ fault ได้สำเร็จ
    // ---------------------------------------------------------------
    @Test(expected = NotPositiveDefiniteMatrixException.class)
    public void testNonPositiveDefiniteNotDetectedDuringTransform() {
        // Symmetric แต่ไม่ positive-definite:
        // diagonal ทั้งหมด = 1 (>= default threshold) ผ่าน initial check
        // แต่ principal minors ไม่เป็นบวกทั้งหมด
        double[][] data = {
            {1, 2, 3},
            {2, 1, 4},
            {3, 4, 1}
        };
        RealMatrix m = new RealMatrixImpl(data);
        new CholeskyDecompositionImpl(m);
        // ถ้าไม่ throw แสดงว่าเป็นบั๊กที่ pivot ติดลบระหว่าง transform
        // ทำให้เกิด NaN จาก Math.sqrt(negative) โดยไม่มีการตรวจจับ
    }
}
