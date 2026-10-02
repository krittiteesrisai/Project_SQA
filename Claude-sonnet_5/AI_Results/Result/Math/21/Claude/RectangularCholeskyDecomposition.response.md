# JUnit 4 Test Suite: RectangularCholeskyDecompositionTest

## การวิเคราะห์ Branch สำคัญในซอร์สโค้ด

1. `if (c[ii][ii] > c[isi][isi])` — true/false (หา max diagonal / swap)
2. `if (swap[r] != r)` — true/false (มีการ swap จริงหรือไม่)
3. `if (c[ir][ir] < small)` — true (deficient) / false (build column)
4. `if (r == 0)` ภายในเงื่อนไข deficient — throw ทันที
5. loop ตรวจ remaining diagonal: `if (c[index[i]][index[i]] < -small)` — throw ที่ r>0
6. ผ่าน loop ตรวจ remaining diagonal โดยไม่ throw → `++r; loop=false;` (จุดที่เกี่ยวข้องกับ defect Math-21: rank อาจถูกนับเกิน 1)
7. loop `for i=r+1..order` (inner build) และ nested `for j=r+1..i` (อัปเดต off-diagonal)
8. `loop = ++r < order` — true/false (วนต่อ/จบ)

```java
package org.apache.commons.math3.linear;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for {@link RectangularCholeskyDecomposition} (Defects4J Math-21b).
 *
 * หมายเหตุสำคัญ:
 * - บางเทส (testRankDeficientNoException_ExposesPotentialRankBug) ถูกออกแบบมาเพื่อ
 *   ตรวจสอบ contract ตาม Javadoc ("rank = จำนวนแถวอิสระ") โดยอ้างอิงจากการไล่ดูซอร์สโค้ดจริง
 *   พบว่าในกรณี matrix rank-deficient โค้ดอาจเพิ่ม r เกินจำนวนคอลัมน์ที่เป็นอิสระจริง
 *   (ตรงกับ known defect Math-21: off-by-one ใน branch "++r; loop=false;")
 *   เทสนี้จึงมีโอกาส FAIL บนโค้ดเวอร์ชันที่มี defect ตามจุดประสงค์ของการทดสอบ fault-detection
 * - ไม่ได้เดา behavior ของ matrix ขนาด 0x0 เนื่องจาก RealMatrix/MatrixUtils implementation
 *   ไม่ได้อยู่ในซอร์สที่ให้มา จึงไม่ทดสอบกรณีนี้
 */
public class RectangularCholeskyDecompositionTest {

    private static final double DELTA = 1e-9;

    /** ช่วยตรวจสอบว่า B * B^T ใกล้เคียงกับ matrix ต้นฉบับ */
    private void assertReconstruction(double[][] original, RealMatrix root, double delta) {
        RealMatrix r = MatrixUtils.createRealMatrix(root.getData());
        RealMatrix rt = r.multiply(r.transpose());
        int n = original.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                assertEquals("mismatch at (" + i + "," + j + ")",
                        original[i][j], rt.getEntry(i, j), delta);
            }
        }
    }

    // ---------------------------------------------------------------
    // 1) Full rank, diagonal ลดลงเรื่อย ๆ -> ไม่มี swap เลย (false branch ของ > ตลอด)
    // ---------------------------------------------------------------
    @Test
    public void testFullRankDescendingDiagonalNoSwap() {
        double[][] data = {
            {6, 2, 1},
            {2, 5, 1},
            {1, 1, 4}
        };
        RealMatrix m = MatrixUtils.createRealMatrix(data);
        RectangularCholeskyDecomposition d =
            new RectangularCholeskyDecomposition(m, 1e-10);

        assertEquals(3, d.getRank());
        assertEquals(3, d.getRootMatrix().getRowDimension());
        assertEquals(3, d.getRootMatrix().getColumnDimension());
        assertReconstruction(data, d.getRootMatrix(), DELTA);
    }

    // ---------------------------------------------------------------
    // 2) Full rank, diagonal เพิ่มขึ้น -> ต้องมี swap (true branch ของ > และ swap!=r)
    // ---------------------------------------------------------------
    @Test
    public void testSwapNeededAscendingDiagonal() {
        double[][] data = {
            {2, 1},
            {1, 5}
        };
        RealMatrix m = MatrixUtils.createRealMatrix(data);
        RectangularCholeskyDecomposition d =
            new RectangularCholeskyDecomposition(m, 1e-10);

        assertEquals(2, d.getRank());
        assertReconstruction(data, d.getRootMatrix(), DELTA);
    }

    // ---------------------------------------------------------------
    // 3) Boundary: matrix 1x1 positive definite ธรรมดา
    // ---------------------------------------------------------------
    @Test
    public void test1x1PositiveDefinite() {
        double[][] data = {{9.0}};
        RealMatrix m = MatrixUtils.createRealMatrix(data);
        RectangularCholeskyDecomposition d =
            new RectangularCholeskyDecomposition(m, 1e-10);

        assertEquals(1, d.getRank());
        assertEquals(3.0, d.getRootMatrix().getEntry(0, 0), DELTA);
    }

    // ---------------------------------------------------------------
    // 4) Boundary: diagonal == small พอดี -> เงื่อนไข "< small" ต้องเป็น false (strict less-than)
    // ---------------------------------------------------------------
    @Test
    public void test1x1BoundaryEqualToSmallNotThrow() {
        double[][] data = {{2.0}};
        RealMatrix m = MatrixUtils.createRealMatrix(data);
        RectangularCholeskyDecomposition d =
            new RectangularCholeskyDecomposition(m, 2.0); // small == diagonal

        assertEquals(1, d.getRank());
        assertEquals(Math.sqrt(2.0), d.getRootMatrix().getEntry(0, 0), DELTA);
    }

    // ---------------------------------------------------------------
    // 5) r == 0 branch -> throw ทันทีเมื่อ diagonal แรกต่ำกว่า small
    // ---------------------------------------------------------------
    @Test(expected = NonPositiveDefiniteMatrixException.class)
    public void test1x1NonPositiveDefiniteThrowsAtR0() {
        double[][] data = {{-5.0}};
        RealMatrix m = MatrixUtils.createRealMatrix(data);
        new RectangularCholeskyDecomposition(m, 1e-10);
    }

    @Test(expected = NonPositiveDefiniteMatrixException.class)
    public void test1x1ZeroDiagonalThrowsAtR0() {
        double[][] data = {{0.0}};
        RealMatrix m = MatrixUtils.createRealMatrix(data);
        new RectangularCholeskyDecomposition(m, 1e-10);
    }

    // ---------------------------------------------------------------
    // 6) r > 0 branch -> ตรวจ remaining diagonal แล้วพบค่าต่ำกว่า -small -> throw
    //    (matrix ไม่เป็น PSD จริง: det = 1 - 4 = -3 < 0)
    // ---------------------------------------------------------------
    @Test(expected = NonPositiveDefiniteMatrixException.class)
    public void testNonPositiveDefiniteAtLaterR() {
        double[][] data = {
            {1, 2},
            {2, 1}
        };
        RealMatrix m = MatrixUtils.createRealMatrix(data);
        new RectangularCholeskyDecomposition(m, 1e-10);
    }

    // ---------------------------------------------------------------
    // 7) Rank-deficient matrix (PSD แต่ singular) -> ไม่ throw, เข้า branch
    //    "all remaining diagonal close to zero" (++r; loop=false;)
    //    matrix = [2,1]^T * [2,1] = [[4,2],[2,1]] มี rank ทางคณิตศาสตร์ = 1
    // ---------------------------------------------------------------
    @Test
    public void testRankDeficientNoException_ExposesPotentialRankBug() {
        double[][] data = {
            {4, 2},
            {2, 1}
        };
        RealMatrix m = MatrixUtils.createRealMatrix(data);
        RectangularCholeskyDecomposition d =
            new RectangularCholeskyDecomposition(m, 1e-10);

        // การ reconstruct ต้องถูกต้องเสมอ (B*B^T ~ A) แม้ rank จะถูกนับผิด
        assertReconstruction(data, d.getRootMatrix(), DELTA);

        // ตาม Javadoc rank ควรเท่ากับจำนวนแถวที่เป็นอิสระจริง = 1
        // เทสนี้อาจ FAIL บนโค้ดที่มี defect Math-21 (นับ rank เกิน 1 กลายเป็น 2)
        assertEquals("Mathematical rank of [[4,2],[2,1]] should be 1",
                1, d.getRank());
    }

    // ---------------------------------------------------------------
    // 8) Full rank 4x4 ซับซ้อน: กระตุ้น swap + inner for-i + nested for-j
    //    matrix สร้างจาก L*L^T (L เป็น lower-triangular diag บวก) จึงเป็น PD แน่นอน
    // ---------------------------------------------------------------
    @Test
    public void testComplexFullRank4x4WithSwapAndInnerLoops() {
        double[][] data = {
            {4, 2, 2, 2},
            {2, 10, 4, 4},
            {2, 4, 18, 6},
            {2, 4, 6, 28}
        };
        RealMatrix m = MatrixUtils.createRealMatrix(data);
        RectangularCholeskyDecomposition d =
            new RectangularCholeskyDecomposition(m, 1e-9);

        assertEquals(4, d.getRank());
        assertEquals(4, d.getRootMatrix().getRowDimension());
        assertEquals(4, d.getRootMatrix().getColumnDimension());
        assertReconstruction(data, d.getRootMatrix(), 1e-6);
    }

    // ---------------------------------------------------------------
    // 9) Null matrix -> NullPointerException (matrix.getRowDimension() ถูกเรียกตรง ๆ)
    // ---------------------------------------------------------------
    @Test(expected = NullPointerException.class)
    public void testNullMatrixThrowsNPE() {
        new RectangularCholeskyDecomposition(null, 1e-10);
    }

    // ---------------------------------------------------------------
    // 10) ตรวจความสอดคล้องระหว่าง getRootMatrix() กับ getRank()
    // ---------------------------------------------------------------
    @Test
    public void testRootMatrixColumnCountMatchesRank() {
        double[][] data = {
            {6, 2, 1},
            {2, 5, 1},
            {1, 1, 4}
        };
        RealMatrix m = MatrixUtils.createRealMatrix(data);
        RectangularCholeskyDecomposition d =
            new RectangularCholeskyDecomposition(m, 1e-10);

        assertEquals(d.getRank(), d.getRootMatrix().getColumnDimension());
    }
}
```

## ตารางสรุป Branch/Condition ที่แต่ละเทสครอบคลุม

| เทสเมธอด | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testFullRankDescendingDiagonalNoSwap` | `c[ii][ii] > c[isi][isi]` = false ตลอด, `swap[r]!=r` = false, else-branch (build column) ทำงานซ้ำทุก r, `loop=++r<order` = true/false ปกติ |
| `testSwapNeededAscendingDiagonal` | `c[ii][ii] > c[isi][isi]` = true, `swap[r]!=r` = true (เกิด swap จริง) |
| `test1x1PositiveDefinite` | boundary order=1, else-branch (`c[ir][ir] < small` = false), loop จบทันที (`r<order` false) |
| `test1x1BoundaryEqualToSmallNotThrow` | boundary `c[ir][ir] == small` → condition `<` = false (strict less-than) |
| `test1x1NonPositiveDefiniteThrowsAtR0` / `test1x1ZeroDiagonalThrowsAtR0` | `c[ir][ir] < small` = true และ `r==0` = true → throw |
| `testNonPositiveDefiniteAtLaterR` | `c[ir][ir] < small` = true, `r==0` = false, inner loop `c[...] < -small` = true → throw |
| `testRankDeficientNoException_ExposesPotentialRankBug` | `c[ir][ir] < small` = true, `r==0` = false, inner loop ไม่ throw (ค่าไม่ติดลบมากพอ), branch `++r; loop=false;` (จุด defect Math-21) |
| `testComplexFullRank4x4WithSwapAndInnerLoops` | ครบ: swap true/false สลับกันหลาย r, else-branch build column หลายรอบ, inner `for i=r+1..order` และ nested `for j=r+1..i` ทำงานจริง (i>r+1), loop จบตามเงื่อนไข `r<order` false ที่ r=order |
| `testNullMatrixThrowsNPE` | null input → NPE จาก `matrix.getRowDimension()` (ไม่มีการตรวจ null ในซอร์ส) |
| `testRootMatrixColumnCountMatchesRank` | ตรวจ invariant `root.getColumnDimension() == rank` ทั่วไปหลัง constructor จบ |

**หมายเหตุ:** เทส `testRankDeficientNoException_ExposesPotentialRankBug` เขียนขึ้นตาม contract ใน Javadoc (ไม่ได้เดา behavior ใหม่) และมีโอกาส **FAIL** บนซอร์สที่ให้มา หากมี off-by-one defect ในบรรทัด `++r; loop = false;` ตรงตามลักษณะ known defect Math-21 ซึ่งเป็นจุดประสงค์ของการทดสอบ fault-detection ตามข้อกำหนด