# JUnit 4 Test Suite: EigenDecompositionImplTest

## การวิเคราะห์

คลาส `EigenDecompositionImpl` มี method ส่วนใหญ่เป็น `private` ดังนั้นการทดสอบจะทำผ่าน **public API** เท่านั้น (constructor 2 แบบ, getV/getD/getVT, getRealEigenvalue(s), getImagEigenvalue(s), getEigenvector, getDeterminant, getSolver และ Solver inner class) โดยเลือก input ที่แตกต่างกันเพื่อบังคับให้ internal algorithm (process1/2/3RowsBlock, processGeneralBlock, computeSplits) ทำงานในแต่ละ branch

**หมายเหตุสำคัญ (ตามข้อ 4):**
- Branch `delta < 0` ใน `process2RowsBlock` และ `delta >= 0` (throw) ใน `process3RowsBlock` **ไม่สามารถ trigger ได้** ด้วย input ที่เป็น valid symmetric matrix เพราะ discriminant ของ eigenvalue ของเมทริกซ์สมมาตรจริงจะไม่เป็นลบเสมอ (เป็นคุณสมบัติทางคณิตศาสตร์) จึงไม่ทดสอบ branch นี้ตรง ๆ แต่คอมเมนต์กำกับไว้
- Boundary ของ `isSymmetric` ที่ใกล้ epsilon พอดี ไม่สามารถระบุค่าที่แน่นอนได้โดยไม่เดา internal epsilon จึงทดสอบเฉพาะกรณี true/false ที่ชัดเจน

```java
package org.apache.commons.math.linear;

import static org.junit.Assert.*;
import org.junit.Test;

import org.apache.commons.math.util.MathUtils;

/**
 * Unit tests for {@link EigenDecompositionImpl}
 * มุ่งเน้น branch coverage ผ่าน public API เท่านั้น
 */
public class EigenDecompositionImplTest {

    private static final double EPS = 1e-8;

    private RealMatrix sym(double[][] data) {
        return MatrixUtils.createRealMatrix(data);
    }

    // ---------------------------------------------------------------
    // 1. Boundary case: 1x1 matrix -> process1RowBlock, isSymmetric loop ไม่รัน
    // ---------------------------------------------------------------
    @Test
    public void test1x1Matrix() {
        RealMatrix m = sym(new double[][]{{5.0}});
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        double[] ev = ed.getRealEigenvalues();
        assertEquals(1, ev.length);
        assertEquals(5.0, ev[0], EPS);
        assertEquals(5.0, ed.getDeterminant(), EPS);
        assertEquals(0.0, ed.getImagEigenvalue(0), EPS);
    }

    // ---------------------------------------------------------------
    // 2. 2x2 symmetric matrix -> process2RowsBlock, delta >= 0 branch
    // ---------------------------------------------------------------
    @Test
    public void test2x2SymmetricMatrix() {
        RealMatrix m = sym(new double[][]{{2, 1}, {1, 2}});
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        double[] ev = ed.getRealEigenvalues();
        assertEquals(2, ev.length);
        assertEquals(3.0, ev[0], EPS); // sorted descending
        assertEquals(1.0, ev[1], EPS);
        assertEquals(3.0, ed.getDeterminant(), EPS);
    }

    // ---------------------------------------------------------------
    // 3. Diagonal 3x3 matrix -> computeSplits เข้า branch "split" (secondary=0)
    //    ทุก block กลายเป็น n=1 -> process1RowBlock สามครั้ง
    // ---------------------------------------------------------------
    @Test
    public void testDiagonal3x3MatrixTriggersSplit() {
        RealMatrix m = sym(new double[][]{
            {2, 0, 0},
            {0, 3, 0},
            {0, 0, 4}
        });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        double[] ev = ed.getRealEigenvalues();
        assertEquals(3, ev.length);
        assertEquals(4.0, ev[0], EPS);
        assertEquals(3.0, ev[1], EPS);
        assertEquals(2.0, ev[2], EPS);
    }

    // ---------------------------------------------------------------
    // 4. 3x3 tridiagonal (ไม่ split) -> process3RowsBlock, delta < 0 branch (ไม่ throw)
    // ---------------------------------------------------------------
    @Test
    public void test3x3GeneralSymmetricMatrix() {
        RealMatrix m = sym(new double[][]{
            {2, 1, 0},
            {1, 2, 1},
            {0, 1, 2}
        });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        double[] ev = ed.getRealEigenvalues();
        assertEquals(3, ev.length);
        assertEquals(2 + Math.sqrt(2), ev[0], 1e-6);
        assertEquals(2.0, ev[1], 1e-6);
        assertEquals(2 - Math.sqrt(2), ev[2], 1e-6);
    }

    // ---------------------------------------------------------------
    // 5. Block diagonal 4x4 -> computeSplits สร้างหลาย block (n=1,n=2,n=1)
    //    ครอบคลุม switch-case ทั้ง case 1 และ case 2 ในรอบเดียว
    // ---------------------------------------------------------------
    @Test
    public void testMultiBlockSplitMatrix() {
        RealMatrix m = sym(new double[][]{
            {2, 0, 0, 0},
            {0, 3, 1, 0},
            {0, 1, 3, 0},
            {0, 0, 0, 5}
        });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        double[] ev = ed.getRealEigenvalues();
        assertEquals(4, ev.length);
        assertEquals(5.0, ev[0], 1e-6);
        assertEquals(4.0, ev[1], 1e-6);
        assertEquals(2.0, ev[2], 1e-6);
        assertEquals(2.0, ev[3], 1e-6);
    }

    // ---------------------------------------------------------------
    // 6. 4x4 general block (n>=4) -> processGeneralBlock / goodStep / dqds
    //    ตรวจสอบด้วยการ reconstruct A = V * D * V^T
    // ---------------------------------------------------------------
    @Test
    public void test4x4GeneralBlockMatrix() {
        RealMatrix m = sym(new double[][]{
            {4, 1, 0, 0},
            {1, 3, 1, 0},
            {0, 1, 2, 1},
            {0, 0, 1, 1}
        });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        double[] ev = ed.getRealEigenvalues();
        assertEquals(4, ev.length);
        for (int i = 0; i < ev.length - 1; i++) {
            assertTrue(ev[i] >= ev[i + 1]);
        }

        RealMatrix v = ed.getV();
        RealMatrix d = ed.getD();
        RealMatrix vt = ed.getVT();
        RealMatrix reconstructed = v.multiply(d).multiply(vt);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                assertEquals(m.getEntry(i, j), reconstructed.getEntry(i, j), 1e-6);
            }
        }
    }

    // ---------------------------------------------------------------
    // 7. 5x5 general block -> วน loop หลายรอบใน goodStep/processGeneralBlock
    // ---------------------------------------------------------------
    @Test
    public void test5x5MatrixLargerBlock() {
        RealMatrix m = sym(new double[][]{
            {4, 1, 0, 0, 0},
            {1, 3, 1, 0, 0},
            {0, 1, 2, 1, 0},
            {0, 0, 1, 5, 2},
            {0, 0, 0, 2, 6}
        });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        double[] ev = ed.getRealEigenvalues();
        assertEquals(5, ev.length);
        for (int i = 0; i < ev.length - 1; i++) {
            assertTrue(ev[i] >= ev[i + 1]);
        }
        RealMatrix v = ed.getV();
        RealMatrix d = ed.getD();
        RealMatrix vt = ed.getVT();
        RealMatrix reconstructed = v.multiply(d).multiply(vt);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                assertEquals(m.getEntry(i, j), reconstructed.getEntry(i, j), 1e-5);
            }
        }
    }

    // ---------------------------------------------------------------
    // 8. isSymmetric คืนค่า false -> throw InvalidMatrixException
    // ---------------------------------------------------------------
    @Test(expected = InvalidMatrixException.class)
    public void testAsymmetricMatrixThrows() {
        RealMatrix m = sym(new double[][]{
            {1, 2},
            {5, 1}
        });
        new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
    }

    // ---------------------------------------------------------------
    // 9. Tridiagonal constructor (double[],double[],double) โดยตรง
    // ---------------------------------------------------------------
    @Test
    public void testTridiagonalConstructorDirectly() {
        double[] main = {2.0, 3.0, 4.0};
        double[] secondary = {0.0, 0.0};
        EigenDecompositionImpl ed = new EigenDecompositionImpl(main, secondary, MathUtils.SAFE_MIN);
        double[] ev = ed.getRealEigenvalues();
        assertEquals(3, ev.length);
        assertEquals(4.0, ev[0], EPS);
        assertEquals(3.0, ev[1], EPS);
        assertEquals(2.0, ev[2], EPS);
    }

    // ---------------------------------------------------------------
    // 10. Boundary: main.length = 1, secondary ว่าง
    // ---------------------------------------------------------------
    @Test
    public void testTridiagonalConstructorSingleElement() {
        double[] main = {7.0};
        double[] secondary = {};
        EigenDecompositionImpl ed = new EigenDecompositionImpl(main, secondary, MathUtils.SAFE_MIN);
        double[] ev = ed.getRealEigenvalues();
        assertEquals(1, ev.length);
        assertEquals(7.0, ev[0], EPS);
    }

    // ---------------------------------------------------------------
    // 11. Boundary/edge: array ว่างทั้งคู่ -> ไม่มีการตรวจสอบ input ในซอร์ส
    //     คาดว่าจะเกิด ArrayIndexOutOfBoundsException จาก computeGershgorinCircles (main[-1])
    // ---------------------------------------------------------------
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testEmptyArraysThrows() {
        double[] main = {};
        double[] secondary = {};
        new EigenDecompositionImpl(main, secondary, MathUtils.SAFE_MIN);
    }

    // ---------------------------------------------------------------
    // 12. Null input: main = null -> NullPointerException จาก main.clone()
    // ---------------------------------------------------------------
    @Test(expected = NullPointerException.class)
    public void testNullMainArrayThrowsNPE() {
        new EigenDecompositionImpl((double[]) null, new double[]{1.0}, MathUtils.SAFE_MIN);
    }

    // ---------------------------------------------------------------
    // 13. Null input: matrix = null -> NullPointerException จาก isSymmetric()
    // ---------------------------------------------------------------
    @Test(expected = NullPointerException.class)
    public void testNullMatrixThrowsNPE() {
        new EigenDecompositionImpl((RealMatrix) null, MathUtils.SAFE_MIN);
    }

    // ---------------------------------------------------------------
    // 14. getRealEigenvalue(index) ผิดช่วง -> ArrayIndexOutOfBoundsException
    // ---------------------------------------------------------------
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetRealEigenvalueOutOfBounds() {
        RealMatrix m = sym(new double[][]{{1, 0}, {0, 2}});
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        ed.getRealEigenvalue(5);
    }

    // ---------------------------------------------------------------
    // 15. getImagEigenvalue(index) ผิดช่วง (index ลบ)
    // ---------------------------------------------------------------
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetImagEigenvalueOutOfBounds() {
        RealMatrix m = sym(new double[][]{{1, 0}, {0, 2}});
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        ed.getImagEigenvalue(-1);
    }

    // ---------------------------------------------------------------
    // 16. getEigenvector -> เรียก findEigenVectors() เมื่อ eigenvectors == null
    // ---------------------------------------------------------------
    @Test
    public void testGetEigenvectorNormalized() {
        RealMatrix m = sym(new double[][]{
            {2, 1, 0},
            {1, 2, 1},
            {0, 1, 2}
        });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        RealVector v0 = ed.getEigenvector(0);
        assertEquals(3, v0.getDimension());
        double norm2 = 0;
        for (int i = 0; i < v0.getDimension(); i++) {
            norm2 += v0.getEntry(i) * v0.getEntry(i);
        }
        assertEquals(1.0, norm2, 1e-6);
    }

    // ---------------------------------------------------------------
    // 17-19. Caching behavior ของ getV/getD/getVT (cachedX == null branch)
    // ---------------------------------------------------------------
    @Test
    public void testGetVCachingReturnsSameInstance() {
        RealMatrix m = sym(new double[][]{{2, 1}, {1, 2}});
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        RealMatrix v1 = ed.getV();
        RealMatrix v2 = ed.getV();
        assertSame(v1, v2);
    }

    @Test
    public void testGetDCachingReturnsSameInstance() {
        RealMatrix m = sym(new double[][]{{2, 1}, {1, 2}});
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        RealMatrix d1 = ed.getD();
        RealMatrix d2 = ed.getD();
        assertSame(d1, d2);
    }

    @Test
    public void testGetVTCachingReturnsSameInstance() {
        RealMatrix m = sym(new double[][]{{2, 1}, {1, 2}});
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        RealMatrix vt1 = ed.getVT();
        RealMatrix vt2 = ed.getVT();
        assertSame(vt1, vt2);
    }

    // ---------------------------------------------------------------
    // 20. getRealEigenvalues() คืนค่าแบบ clone (แก้ไข array ที่คืนมาไม่กระทบ internal state)
    // ---------------------------------------------------------------
    @Test
    public void testGetRealEigenvaluesReturnsClone() {
        RealMatrix m = sym(new double[][]{{2, 1}, {1, 2}});
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        double[] ev1 = ed.getRealEigenvalues();
        ev1[0] = -999;
        double[] ev2 = ed.getRealEigenvalues();
        assertFalse(Math.abs(ev2[0] - (-999)) < EPS);
    }

    // ---------------------------------------------------------------
    // 21. getImagEigenvalues ต้องเป็น 0 เสมอ (เมทริกซ์สมมาตร)
    // ---------------------------------------------------------------
    @Test
    public void testGetImagEigenvaluesAllZero() {
        RealMatrix m = sym(new double[][]{
            {2, 1, 0},
            {1, 2, 1},
            {0, 1, 2}
        });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        double[] imag = ed.getImagEigenvalues();
        for (double v : imag) {
            assertEquals(0.0, v, EPS);
        }
    }

    // ---------------------------------------------------------------
    // 22-23. Solver.isNonSingular() true/false branch
    // ---------------------------------------------------------------
    @Test
    public void testSolverIsNonSingularTrue() {
        RealMatrix m = sym(new double[][]{{2, 1}, {1, 2}});
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        DecompositionSolver solver = ed.getSolver();
        assertTrue(solver.isNonSingular());
    }

    @Test
    public void testSolverIsNonSingularFalse() {
        // eigen values = 2, 0 -> singular
        RealMatrix m = sym(new double[][]{{1, 1}, {1, 1}});
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        DecompositionSolver solver = ed.getSolver();
        assertFalse(solver.isNonSingular());
    }

    // ---------------------------------------------------------------
    // 24-27. Solver.solve/getInverse -> SingularMatrixException branch
    // ---------------------------------------------------------------
    @Test(expected = SingularMatrixException.class)
    public void testSolverSolveArrayThrowsOnSingular() {
        RealMatrix m = sym(new double[][]{{1, 1}, {1, 1}});
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        ed.getSolver().solve(new double[]{1, 1});
    }

    @Test(expected = SingularMatrixException.class)
    public void testSolverSolveVectorThrowsOnSingular() {
        RealMatrix m = sym(new double[][]{{1, 1}, {1, 1}});
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        ed.getSolver().solve(new ArrayRealVector(new double[]{1, 1}));
    }

    @Test(expected = SingularMatrixException.class)
    public void testSolverSolveMatrixThrowsOnSingular() {
        RealMatrix m = sym(new double[][]{{1, 1}, {1, 1}});
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        ed.getSolver().solve(MatrixUtils.createRealMatrix(new double[][]{{1}, {1}}));
    }

    @Test(expected = SingularMatrixException.class)
    public void testSolverGetInverseThrowsOnSingular() {
        RealMatrix m = sym(new double[][]{{1, 1}, {1, 1}});
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        ed.getSolver().getInverse();
    }

    // ---------------------------------------------------------------
    // 28-30. Solver.solve dimension mismatch -> IllegalArgumentException
    // ---------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testSolverSolveArrayDimensionMismatch() {
        RealMatrix m = sym(new double[][]{{2, 1}, {1, 2}});
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        ed.getSolver().solve(new double[]{1, 2, 3});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolverSolveVectorDimensionMismatch() {
        RealMatrix m = sym(new double[][]{{2, 1}, {1, 2}});
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        ed.getSolver().solve(new ArrayRealVector(new double[]{1, 2, 3}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolverSolveMatrixDimensionMismatch() {
        RealMatrix m = sym(new double[][]{{2, 1}, {1, 2}});
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        ed.getSolver().solve(MatrixUtils.createRealMatrix(new double[][]{{1}, {1}, {1}}));
    }

    // ---------------------------------------------------------------
    // 31-33. Solver.solve ถูกต้อง (non-singular) -- ยืนยันผลด้วย A*x = b
    // ---------------------------------------------------------------
    @Test
    public void testSolverSolveArrayCorrectResult() {
        RealMatrix m = sym(new double[][]{{4, 1}, {1, 3}});
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        DecompositionSolver solver = ed.getSolver();
        double[] b = {5.0, 2.0};
        double[] x = solver.solve(b);
        double[] Ax = {
            m.getEntry(0, 0) * x[0] + m.getEntry(0, 1) * x[1],
            m.getEntry(1, 0) * x[0] + m.getEntry(1, 1) * x[1]
        };
        assertEquals(b[0], Ax[0], 1e-6);
        assertEquals(b[1], Ax[1], 1e-6);
    }

    @Test
    public void testSolverSolveVectorCorrectResult() {
        RealMatrix m = sym(new double[][]{{1, 0}, {0, 1}});
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        DecompositionSolver solver = ed.getSolver();
        RealVector b = new ArrayRealVector(new double[]{3.0, 4.0});
        RealVector x = solver.solve(b);
        assertEquals(3.0, x.getEntry(0), 1e-6);
        assertEquals(4.0, x.getEntry(1), 1e-6);
    }

    @Test
    public void testSolverSolveMatrixCorrectResult() {
        RealMatrix m = sym(new double[][]{{1, 0}, {0, 1}});
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        DecompositionSolver solver = ed.getSolver();
        RealMatrix b = MatrixUtils.createRealMatrix(new double[][]{{3, 5}, {4, 6}});
        RealMatrix x = solver.solve(b);
        assertEquals(3.0, x.getEntry(0, 0), 1e-6);
        assertEquals(4.0, x.getEntry(1, 0), 1e-6);
        assertEquals(5.0, x.getEntry(0, 1), 1e-6);
        assertEquals(6.0, x.getEntry(1, 1), 1e-6);
    }

    // ---------------------------------------------------------------
    // 34. Solver.getInverse() ถูกต้อง -- ยืนยันผลด้วย inv * A = I
    // ---------------------------------------------------------------
    @Test
    public void testSolverGetInverseGeneralMatrix() {
        RealMatrix m = sym(new double[][]{{4, 1}, {1, 3}});
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        DecompositionSolver solver = ed.getSolver();
        RealMatrix inv = solver.getInverse();
        RealMatrix product = inv.multiply(m);
        assertEquals(1.0, product.getEntry(0, 0), 1e-6);
        assertEquals(0.0, product.getEntry(0, 1), 1e-6);
        assertEquals(0.0, product.getEntry(1, 0), 1e-6);
        assertEquals(1.0, product.getEntry(1, 1), 1e-6);
    }
}
```

## ตารางสรุป Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `test1x1Matrix` | isSymmetric loop ไม่รัน (rows=1), process1RowBlock |
| `test2x2SymmetricMatrix` | process2RowsBlock, delta ≥ 0 (ไม่ throw) |
| `testDiagonal3x3MatrixTriggersSplit` | computeSplits: branch split=true (`abs(secondary)<=max`) |
| `test3x3GeneralSymmetricMatrix` | process3RowsBlock, delta < 0 (ไม่ throw), computeSplits branch split=false |
| `testMultiBlockSplitMatrix` | switch-case n=1 และ n=2 ในการเรียกครั้งเดียว, mixed split/no-split |
| `test4x4GeneralBlockMatrix` | default case (n≥4): processGeneralBlock/goodStep/dqds/dqd, V·D·Vᵗ reconstruction |
| `test5x5MatrixLargerBlock` | loop หลายรอบใน goodStep, split detection ภายใน processGeneralBlock |
| `testAsymmetricMatrixThrows` | isSymmetric → false branch → throw InvalidMatrixException |
| `testTridiagonalConstructorDirectly` | tridiagonal constructor (double[],double[]) |
| `testTridiagonalConstructorSingleElement` | boundary: secondary.length = 0 |
| `testEmptyArraysThrows` | boundary/edge: array ว่าง → ArrayIndexOutOfBoundsException |
| `testNullMainArrayThrowsNPE` | null input → NPE จาก main.clone() |
| `testNullMatrixThrowsNPE` | null input → NPE จาก isSymmetric() |
| `testGetRealEigenvalueOutOfBounds` | index ผิดช่วง → AIOOBE |
| `testGetImagEigenvalueOutOfBounds` | index ลบ → AIOOBE |
| `testGetEigenvectorNormalized` | eigenvectors==null branch → findEigenVectors() |
| `testGetVCachingReturnsSameInstance` | cachedV==null branch (getV) |
| `testGetDCachingReturnsSameInstance` | cachedD==null branch (getD) |
| `testGetVTCachingReturnsSameInstance` | cachedVt==null branch (getVT) |
| `testGetRealEigenvaluesReturnsClone` | clone() behavior ของ getRealEigenvalues |
| `testGetImagEigenvaluesAllZero` | imagEigenvalues ทุกค่าเป็น 0 |
| `testSolverIsNonSingularTrue/False` | isNonSingular(): true/false branch |
| `testSolverSolve*ThrowsOnSingular`, `testSolverGetInverseThrowsOnSingular` | `!isNonSingular()` → throw SingularMatrixException (3 overload + getInverse) |
| `testSolverSolve*DimensionMismatch` | length/dimension mismatch → IllegalArgumentException (3 overload) |
| `testSolverSolve*CorrectResult` | solve() คำนวณถูกต้อง (3 overload) |
| `testSolverGetInverseGeneralMatrix` | getInverse() คำนวณถูกต้อง |

**หมายเหตุ:** Branch `delta<0` ใน `process2RowsBlock` และ `delta>=0` (throw) ใน `process3RowsBlock` ไม่สามารถทดสอบผ่าน public API ได้เนื่องจากคุณสมบัติทางคณิตศาสตร์ของเมทริกซ์สมมาตรจริงทำให้ discriminant ไม่เป็นลบเสมอ — คงไว้เป็นข้อจำกัดที่ทราบ (known limitation) ไม่ใช่การเดา behavior