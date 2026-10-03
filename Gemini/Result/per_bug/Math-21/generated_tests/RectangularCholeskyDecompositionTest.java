package org.apache.commons.math3.linear;

import org.junit.Assert;
import org.junit.Test;

public class RectangularCholeskyDecompositionTest {

    private static final double DEFAULT_SMALL = 1.0e-10;

    /**
     * Helper method เพื่อตรวจสอบว่า B * B^T มีค่าใกล้เคียงกับเมทริกซ์ A เดิมหรือไม่
     */
    private void assertDecompositionMatches(RealMatrix matrix, RectangularCholeskyDecomposition rcd, double tolerance) {
        RealMatrix root = rcd.getRootMatrix();
        Assert.assertNotNull("Root matrix should not be null", root);
        Assert.assertEquals("Root matrix row count must match original matrix order",
                matrix.getRowDimension(), root.getRowDimension());
        Assert.assertEquals("Root matrix column count must match rank",
                rcd.getRank(), root.getColumnDimension());

        RealMatrix reconstructed = root.multiply(root.transpose());
        for (int i = 0; i < matrix.getRowDimension(); ++i) {
            for (int j = 0; j < matrix.getColumnDimension(); ++j) {
                Assert.assertEquals("Mismatch at entry (" + i + ", " + j + ")",
                        matrix.getEntry(i, j), reconstructed.getEntry(i, j), tolerance);
            }
        }
    }

    /**
     * ทดสอบกรณี Boundary: เมทริกซ์ขนาด 1x1 ที่มีค่าเป็นบวก (Full rank = 1)
     */
    @Test
    public void test1x1MatrixPositive() {
        RealMatrix m = MatrixUtils.createRealMatrix(new double[][] { { 4.0 } });
        RectangularCholeskyDecomposition rcd = new RectangularCholeskyDecomposition(m, DEFAULT_SMALL);

        Assert.assertEquals(1, rcd.getRank());
        Assert.assertEquals(2.0, rcd.getRootMatrix().getEntry(0, 0), 1e-12);
        assertDecompositionMatches(m, rcd, 1e-12);
    }

    /**
     * ทดสอบกรณี Boundary/Invalid: เมทริกซ์ขนาด 1x1 ที่มีค่าน้อยกว่า threshold ที่ r=0
     */
    @Test(expected = NonPositiveDefiniteMatrixException.class)
    public void test1x1MatrixNonPositiveThrowsException() {
        RealMatrix m = MatrixUtils.createRealMatrix(new double[][] { { -1.0 } });
        new RectangularCholeskyDecomposition(m, DEFAULT_SMALL);
    }

    /**
     * ทดสอบกรณี r=0 และค่า diagonal แรกน้อยกว่า small (ค่าใกล้ศูนย์แต่ไม่ผ่านเกณฑ์)
     */
    @Test(expected = NonPositiveDefiniteMatrixException.class)
    public void testFirstDiagonalLessThanSmallThrowsException() {
        RealMatrix m = MatrixUtils.createRealMatrix(new double[][] {
            { 1.0e-12, 0.0 },
            { 0.0, 2.0 }
        });
        // small threshold = 1.0e-6 ซึ่งมากกว่า 1.0e-12
        new RectangularCholeskyDecomposition(m, 1.0e-6);
    }

    /**
     * ทดสอบ Full Rank Matrix แบบเรียงลำดับ diagonal จากมากไปน้อยอยู่แล้ว (swap[r] == r)
     */
    @Test
    public void testFullRankWithoutPermutation() {
        RealMatrix m = MatrixUtils.createRealMatrix(new double[][] {
            { 10.0,  2.0,  1.0 },
            {  2.0,  8.0, -1.0 },
            {  1.0, -1.0,  5.0 }
        });

        RectangularCholeskyDecomposition rcd = new RectangularCholeskyDecomposition(m, DEFAULT_SMALL);
        Assert.assertEquals(3, rcd.getRank());
        assertDecompositionMatches(m, rcd, 1e-10);
    }

    /**
     * ทดสอบ Full Rank Matrix ที่ diagonal ไม่ได้เรียงลำดับ เพื่อบังคับให้เกิด Permutation / Swapping (swap[r] != r)
     */
    @Test
    public void testFullRankWithPermutation() {
        RealMatrix m = MatrixUtils.createRealMatrix(new double[][] {
            {  1.0, -1.0,  2.0 },
            { -1.0,  5.0,  0.0 },
            {  2.0,  0.0, 10.0 }
        });

        RectangularCholeskyDecomposition rcd = new RectangularCholeskyDecomposition(m, DEFAULT_SMALL);
        Assert.assertEquals(3, rcd.getRank());
        assertDecompositionMatches(m, rcd, 1e-10);
    }

    /**
     * ทดสอบ Positive Semi-Definite Matrix ที่เป็น Rank Deficient (Rank = 2 ใน Matrix ขนาด 3x3)
     * คลุมเงื่อนไข c[ir][ir] < small โดยที่ r > 0 และสมาชิกที่เหลือ >= -small
     */
    @Test
    public void testRankDeficientPositiveSemidefinite() {
        // แถวที่ 3 เป็นผลบวกของแถวที่ 1 และ 2 (Rank 2)
        RealMatrix m = MatrixUtils.createRealMatrix(new double[][] {
            { 2.0, 1.0, 3.0 },
            { 1.0, 2.0, 3.0 },
            { 3.0, 3.0, 6.0 }
        });

        RectangularCholeskyDecomposition rcd = new RectangularCholeskyDecomposition(m, DEFAULT_SMALL);
        Assert.assertEquals(2, rcd.getRank());
        Assert.assertEquals(2, rcd.getRootMatrix().getColumnDimension());
        Assert.assertEquals(3, rcd.getRootMatrix().getRowDimension());
        assertDecompositionMatches(m, rcd, 1e-10);
    }

    /**
     * ทดสอบ Rank Deficient ที่มี Rank = 1 ใน Matrix ขนาด 3x3
     */
    @Test
    public void testRankDeficientRank1() {
        RealMatrix m = MatrixUtils.createRealMatrix(new double[][] {
            { 4.0, 2.0, 2.0 },
            { 2.0, 1.0, 1.0 },
            { 2.0, 1.0, 1.0 }
        });

        RectangularCholeskyDecomposition rcd = new RectangularCholeskyDecomposition(m, DEFAULT_SMALL);
        Assert.assertEquals(1, rcd.getRank());
        Assert.assertEquals(1, rcd.getRootMatrix().getColumnDimension());
        assertDecompositionMatches(m, rcd, 1e-10);
    }

    /**
     * ทดสอบกรณี r > 0 แล้วพบค่า diagonal ติดลบเกินเกณฑ์ (< -small) ในสมาชิกที่เหลือ
     * คลุม Branch: c[index[i]][index[i]] < -small -> throw NonPositiveDefiniteMatrixException
     */
    @Test(expected = NonPositiveDefiniteMatrixException.class)
    public void testRankDeficientWithNegativeRemainingDiagonalThrowsException() {
        // เมทริกซ์ symmetric แต่ไม่เป็น positive semi-definite (มี eigenvalue ติดลบเด่นชัด)
        RealMatrix m = MatrixUtils.createRealMatrix(new double[][] {
            { 2.0, 3.0, 0.0 },
            { 3.0, 1.0, 0.0 },
            { 0.0, 0.0, 2.0 }
        });

        new RectangularCholeskyDecomposition(m, DEFAULT_SMALL);
    }

    /**
     * ทดสอบ Matrix ขนาด 4x4 เพื่อทดสอบ nested loops (ทั้งตัวแปร i และ j) อย่างทั่วถึง
     */
    @Test
    public void testHigherOrderMatrixWithFullInnerLoop() {
        RealMatrix m = MatrixUtils.createRealMatrix(new double[][] {
            { 4.0, 1.0, 2.0, 1.0 },
            { 1.0, 5.0, 0.0, 2.0 },
            { 2.0, 0.0, 6.0, 1.0 },
            { 1.0, 2.0, 1.0, 7.0 }
        });

        RectangularCholeskyDecomposition rcd = new RectangularCholeskyDecomposition(m, DEFAULT_SMALL);
        Assert.assertEquals(4, rcd.getRank());
        assertDecompositionMatches(m, rcd, 1e-10);
    }

    /**
     * ทดสอบ Edge Case: ส่งค่า Matrix เป็น null
     */
    @Test(expected = NullPointerException.class)
    public void testNullMatrixThrowsException() {
        new RectangularCholeskyDecomposition(null, DEFAULT_SMALL);
    }
}