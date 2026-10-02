# JUnit 4 Test Suite สำหรับ Weight Class

## การวิเคราะห์ Branch/Condition

จากซอร์สโค้ด พบจุดที่ต้องทดสอบดังนี้:
1. **Constructor(double[])**: for-loop (0 ครั้ง, 1 ครั้ง, N ครั้ง), ค่า `weight.length` เมื่อ array เป็น null จะ throw NPE
2. **Constructor(RealMatrix)**: if-condition `getColumnDimension() != getRowDimension()` (true/false branch)
3. **getWeight()**: ตรวจสอบว่า return เป็น copy (immutability)

```java
package org.apache.commons.math3.optim.nonlinear.vector;

import static org.junit.Assert.*;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.NonSquareMatrixException;
import org.apache.commons.math3.linear.RealMatrix;
import org.junit.Test;

/**
 * Unit tests for {@link Weight}.
 * Target: Defects4J Math-14b
 */
public class WeightTest {

    // ---------- Constructor(double[] weight) ----------

    /**
     * Boundary case: empty array -> loop ไม่ execute เลย (0 iterations)
     * ผลลัพธ์ควรได้ matrix ขนาด 0x0
     */
    @Test
    public void testArrayConstructor_emptyArray() {
        double[] weight = new double[0];
        Weight w = new Weight(weight);
        RealMatrix m = w.getWeight();
        assertEquals(0, m.getRowDimension());
        assertEquals(0, m.getColumnDimension());
    }

    /**
     * Boundary case: single element -> loop ทำงาน 1 ครั้ง
     */
    @Test
    public void testArrayConstructor_singleElement() {
        double[] weight = {5.0};
        Weight w = new Weight(weight);
        RealMatrix m = w.getWeight();
        assertEquals(1, m.getRowDimension());
        assertEquals(1, m.getColumnDimension());
        assertEquals(5.0, m.getEntry(0, 0), 0.0);
    }

    /**
     * Normal case: multiple elements -> loop ทำงานหลายครั้ง (N iterations)
     * ตรวจสอบว่าเป็น diagonal matrix จริง (off-diagonal = 0)
     */
    @Test
    public void testArrayConstructor_multipleElements() {
        double[] weight = {1.0, 2.0, 3.0};
        Weight w = new Weight(weight);
        RealMatrix m = w.getWeight();

        assertEquals(3, m.getRowDimension());
        assertEquals(3, m.getColumnDimension());

        // ตรวจสอบ diagonal values
        assertEquals(1.0, m.getEntry(0, 0), 0.0);
        assertEquals(2.0, m.getEntry(1, 1), 0.0);
        assertEquals(3.0, m.getEntry(2, 2), 0.0);

        // ตรวจสอบ off-diagonal เป็น 0 (ค่า default)
        assertEquals(0.0, m.getEntry(0, 1), 0.0);
        assertEquals(0.0, m.getEntry(1, 0), 0.0);
        assertEquals(0.0, m.getEntry(0, 2), 0.0);
        assertEquals(0.0, m.getEntry(2, 0), 0.0);
        assertEquals(0.0, m.getEntry(1, 2), 0.0);
        assertEquals(0.0, m.getEntry(2, 1), 0.0);
    }

    /**
     * Null/invalid input: array เป็น null -> คาด NullPointerException
     * เนื่องจาก weight.length จะ throw NPE ทันที (ไม่มี null check ในซอร์ส)
     */
    @Test(expected = NullPointerException.class)
    public void testArrayConstructor_nullArray() {
        double[] weight = null;
        new Weight(weight);
    }

    /**
     * ทดสอบว่าค่า NaN/Infinity ใน array สามารถเก็บได้ (ไม่มี validation ในซอร์ส)
     * หมายเหตุ: ไม่แน่ใจว่าเป็น behavior ที่ตั้งใจ แต่ซอร์สไม่มีการตรวจสอบค่าพิเศษเหล่านี้
     */
    @Test
    public void testArrayConstructor_withSpecialValues() {
        double[] weight = {Double.NaN, Double.POSITIVE_INFINITY, -1.0};
        Weight w = new Weight(weight);
        RealMatrix m = w.getWeight();
        assertTrue(Double.isNaN(m.getEntry(0, 0)));
        assertTrue(Double.isInfinite(m.getEntry(1, 1)));
        assertEquals(-1.0, m.getEntry(2, 2), 0.0);
    }

    // ---------- Constructor(RealMatrix weight) ----------

    /**
     * Branch: square matrix (condition false) -> ไม่ throw exception
     */
    @Test
    public void testMatrixConstructor_squareMatrix() {
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };
        RealMatrix square = new Array2DRowRealMatrix(data);
        Weight w = new Weight(square);
        RealMatrix result = w.getWeight();

        assertEquals(2, result.getRowDimension());
        assertEquals(2, result.getColumnDimension());
        assertEquals(1.0, result.getEntry(0, 0), 0.0);
        assertEquals(2.0, result.getEntry(0, 1), 0.0);
        assertEquals(3.0, result.getEntry(1, 0), 0.0);
        assertEquals(4.0, result.getEntry(1, 1), 0.0);
    }

    /**
     * Boundary: square matrix ขนาด 1x1
     */
    @Test
    public void testMatrixConstructor_squareMatrix_1x1() {
        double[][] data = { {7.0} };
        RealMatrix square = new Array2DRowRealMatrix(data);
        Weight w = new Weight(square);
        RealMatrix result = w.getWeight();

        assertEquals(1, result.getRowDimension());
        assertEquals(1, result.getColumnDimension());
        assertEquals(7.0, result.getEntry(0, 0), 0.0);
    }

    /**
     * Branch: non-square matrix (rows > columns) condition true -> throw NonSquareMatrixException
     */
    @Test(expected = NonSquareMatrixException.class)
    public void testMatrixConstructor_nonSquare_moreRows() {
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0},
            {5.0, 6.0}
        };
        RealMatrix nonSquare = new Array2DRowRealMatrix(data);
        new Weight(nonSquare);
    }

    /**
     * Branch: non-square matrix (columns > rows) condition true -> throw NonSquareMatrixException
     */
    @Test(expected = NonSquareMatrixException.class)
    public void testMatrixConstructor_nonSquare_moreColumns() {
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0}
        };
        RealMatrix nonSquare = new Array2DRowRealMatrix(data);
        new Weight(nonSquare);
    }

    /**
     * Null input: matrix เป็น null -> คาด NullPointerException
     * เนื่องจาก weight.getColumnDimension() จะถูกเรียกบน null reference
     */
    @Test(expected = NullPointerException.class)
    public void testMatrixConstructor_nullMatrix() {
        RealMatrix nullMatrix = null;
        new Weight(nullMatrix);
    }

    // ---------- getWeight() - Immutability tests ----------

    /**
     * ตรวจสอบว่า getWeight() คืนค่าเป็น copy ไม่ใช่ reference เดิม
     * (ป้องกันการแก้ไขจากภายนอกกระทบ internal state)
     */
    @Test
    public void testGetWeight_returnsNewCopyEachTime() {
        double[] weight = {1.0, 2.0};
        Weight w = new Weight(weight);

        RealMatrix m1 = w.getWeight();
        RealMatrix m2 = w.getWeight();

        assertNotSame("getWeight() ควร return object คนละตัวในแต่ละครั้งที่เรียก", m1, m2);
        assertEquals(m1.getEntry(0, 0), m2.getEntry(0, 0), 0.0);
    }

    /**
     * ตรวจสอบว่าแก้ไข matrix ที่ได้จาก getWeight() ไม่กระทบ internal state
     */
    @Test
    public void testGetWeight_modifyingReturnedMatrixDoesNotAffectInternal() {
        double[] weight = {10.0, 20.0};
        Weight w = new Weight(weight);

        RealMatrix m1 = w.getWeight();
        m1.setEntry(0, 0, 999.0);

        RealMatrix m2 = w.getWeight();
        assertEquals("internal state ไม่ควรถูกแก้ไขจากภายนอก",
                     10.0, m2.getEntry(0, 0), 0.0);
    }

    /**
     * ตรวจสอบว่า constructor(RealMatrix) ทำการ copy เช่นกัน
     * (แก้ไข matrix ต้นฉบับหลังสร้าง Weight ไม่ควรกระทบ internal state)
     */
    @Test
    public void testMatrixConstructor_copiesInputMatrix() {
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };
        RealMatrix original = new Array2DRowRealMatrix(data);
        Weight w = new Weight(original);

        // แก้ไข matrix ต้นฉบับ
        original.setEntry(0, 0, 999.0);

        RealMatrix internal = w.getWeight();
        assertEquals("Weight ควร copy matrix ตอนสร้าง ไม่ใช่เก็บ reference",
                     1.0, internal.getEntry(0, 0), 0.0);
    }
}
```

## สรุปตาราง Test Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testArrayConstructor_emptyArray` | Loop executes 0 times (boundary: dim=0) |
| `testArrayConstructor_singleElement` | Loop executes 1 time (boundary: dim=1) |
| `testArrayConstructor_multipleElements` | Loop executes N times + ตรวจ diagonal/off-diagonal values |
| `testArrayConstructor_nullArray` | Null input → NPE จาก `weight.length` |
| `testArrayConstructor_withSpecialValues` | ค่า NaN/Infinity ไม่มี validation (หมายเหตุ: ไม่มีการป้องกันในซอร์ส) |
| `testMatrixConstructor_squareMatrix` | if-condition = **false** (square matrix, ไม่ throw) |
| `testMatrixConstructor_squareMatrix_1x1` | Boundary case: square matrix ขนาดเล็กสุด (1x1) |
| `testMatrixConstructor_nonSquare_moreRows` | if-condition = **true** (rows > columns) → throw exception |
| `testMatrixConstructor_nonSquare_moreColumns` | if-condition = **true** (columns > rows) → throw exception |
| `testMatrixConstructor_nullMatrix` | Null input → NPE จาก `weight.getColumnDimension()` |
| `testGetWeight_returnsNewCopyEachTime` | ตรวจสอบ `.copy()` behavior - object อ้างอิงต่างกัน |
| `testGetWeight_modifyingReturnedMatrixDoesNotAffectInternal` | Immutability: แก้ matrix ที่ return ไม่กระทบ internal |
| `testMatrixConstructor_copiesInputMatrix` | Immutability: constructor ทำ `.copy()` ของ input matrix |

### หมายเหตุสำคัญ
- **Branch coverage ครบทั้ง 2 branch ของ if-condition** ใน `Weight(RealMatrix)` (true/false)
- **Loop coverage ครบ 3 กรณี**: 0, 1, N iterations ใน `Weight(double[])`
- ไม่มีการตรวจสอบ null ในซอร์สโค้ดต้นฉบับ ดังนั้น NPE test cases เป็นการยืนยัน behavior ที่เกิดขึ้นจริงจาก JVM ไม่ใช่ validation logic ที่ตั้งใจเขียนในคลาส
- ทดสอบ immutability ตาม Javadoc ที่ระบุว่าเป็น "Immutable class"