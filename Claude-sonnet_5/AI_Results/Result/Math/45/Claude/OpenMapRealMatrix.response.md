# วิเคราะห์และชุดทดสอบ JUnit 4 สำหรับ `OpenMapRealMatrix`

**หมายเหตุสำคัญ:** เนื่องจากไม่มีซอร์สของ `MatrixUtils`, `AbstractRealMatrix` และชนิด exception ที่แน่นอน (`OutOfRangeException`, `MatrixDimensionMismatchException`, `DimensionMismatchException`, `NotStrictlyPositiveException` ฯลฯ) จึงใช้การตรวจจับแบบ `RuntimeException` (base class) แทนการเดาชนิด exception ที่เจาะจง เพื่อไม่ให้เดา behavior ที่ไม่มีอยู่ในซอร์สที่ให้มา — มีคอมเมนต์กำกับไว้ทุกจุด

```java
package org.apache.commons.math.linear;

import static org.junit.Assert.*;
import org.junit.Test;

// import เป้าหมายให้ถูกต้องตามที่กำหนด (แม้อยู่ pacakge เดียวกันก็ import ได้)
import org.apache.commons.math.linear.OpenMapRealMatrix;

public class OpenMapRealMatrixTest {

    private static final double EPS = 1e-12;

    // ---------- Constructors ----------

    @Test
    public void testConstructorValidDimensions() {
        OpenMapRealMatrix m = new OpenMapRealMatrix(3, 4);
        assertEquals(3, m.getRowDimension());
        assertEquals(4, m.getColumnDimension());
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                assertEquals(0.0, m.getEntry(i, j), EPS);
            }
        }
    }

    @Test
    public void testConstructorZeroRowDimensionThrows() {
        // ไม่แน่ใจชนิด exception ที่แน่นอน (คาดว่ามาจาก super() / AbstractRealMatrix)
        try {
            new OpenMapRealMatrix(0, 3);
            fail("Expected exception for zero row dimension");
        } catch (RuntimeException e) {
            // expected - exact type unknown
        }
    }

    @Test
    public void testConstructorNegativeColumnDimensionThrows() {
        try {
            new OpenMapRealMatrix(3, -1);
            fail("Expected exception for negative column dimension");
        } catch (RuntimeException e) {
            // expected - exact type unknown
        }
    }

    @Test
    public void testCopyConstructor() {
        OpenMapRealMatrix original = new OpenMapRealMatrix(2, 2);
        original.setEntry(0, 0, 5.0);
        original.setEntry(1, 1, 7.0);

        OpenMapRealMatrix copy = new OpenMapRealMatrix(original);
        assertEquals(2, copy.getRowDimension());
        assertEquals(2, copy.getColumnDimension());
        assertEquals(5.0, copy.getEntry(0, 0), EPS);
        assertEquals(7.0, copy.getEntry(1, 1), EPS);

        // independence: แก้ copy ไม่ควรกระทบ original
        copy.setEntry(0, 0, 99.0);
        assertEquals(5.0, original.getEntry(0, 0), EPS);
        assertEquals(99.0, copy.getEntry(0, 0), EPS);
    }

    // ---------- copy() ----------

    @Test
    public void testCopyMethod() {
        OpenMapRealMatrix m = new OpenMapRealMatrix(2, 2);
        m.setEntry(0, 1, 3.0);
        OpenMapRealMatrix c = m.copy();
        assertNotSame(m, c);
        assertEquals(3.0, c.getEntry(0, 1), EPS);
        c.setEntry(0, 1, 10.0);
        assertEquals(3.0, m.getEntry(0, 1), EPS);
    }

    // ---------- createMatrix() ----------

    @Test
    public void testCreateMatrix() {
        OpenMapRealMatrix m = new OpenMapRealMatrix(2, 2);
        OpenMapRealMatrix created = m.createMatrix(4, 5);
        assertEquals(4, created.getRowDimension());
        assertEquals(5, created.getColumnDimension());
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                assertEquals(0.0, created.getEntry(i, j), EPS);
            }
        }
    }

    // ---------- getRowDimension / getColumnDimension ----------

    @Test
    public void testGetDimensions() {
        OpenMapRealMatrix m = new OpenMapRealMatrix(5, 7);
        assertEquals(5, m.getRowDimension());
        assertEquals(7, m.getColumnDimension());
    }

    // ---------- setEntry / getEntry ----------

    @Test
    public void testSetGetEntryNonZero() {
        OpenMapRealMatrix m = new OpenMapRealMatrix(3, 3);
        m.setEntry(1, 2, 4.5);
        assertEquals(4.5, m.getEntry(1, 2), EPS);
    }

    @Test
    public void testSetEntryZeroRemoves() {
        OpenMapRealMatrix m = new OpenMapRealMatrix(3, 3);
        m.setEntry(1, 2, 4.5);
        assertEquals(4.5, m.getEntry(1, 2), EPS);
        m.setEntry(1, 2, 0.0); // ควรลบ entry ออก
        assertEquals(0.0, m.getEntry(1, 2), EPS);
    }

    @Test
    public void testGetEntryDefaultZero() {
        OpenMapRealMatrix m = new OpenMapRealMatrix(2, 2);
        assertEquals(0.0, m.getEntry(0, 0), EPS);
    }

    @Test
    public void testGetEntryRowBoundaryValid() {
        OpenMapRealMatrix m = new OpenMapRealMatrix(3, 3);
        assertEquals(0.0, m.getEntry(0, 0), EPS); // boundary ต่ำสุด
        assertEquals(0.0, m.getEntry(2, 2), EPS); // boundary สูงสุด
    }

    @Test
    public void testGetEntryRowIndexNegativeThrows() {
        OpenMapRealMatrix m = new OpenMapRealMatrix(3, 3);
        try {
            m.getEntry(-1, 0);
            fail("Expected exception for negative row index");
        } catch (RuntimeException e) {
            // expected - likely OutOfRangeException
        }
    }

    @Test
    public void testGetEntryRowIndexTooLargeThrows() {
        OpenMapRealMatrix m = new OpenMapRealMatrix(3, 3);
        try {
            m.getEntry(3, 0); // valid range [0,2]
            fail("Expected exception for row index == rows");
        } catch (RuntimeException e) {
            // expected
        }
    }

    @Test
    public void testGetEntryColumnIndexNegativeThrows() {
        OpenMapRealMatrix m = new OpenMapRealMatrix(3, 3);
        try {
            m.getEntry(0, -1);
            fail("Expected exception for negative column index");
        } catch (RuntimeException e) {
            // expected
        }
    }

    @Test
    public void testGetEntryColumnIndexTooLargeThrows() {
        OpenMapRealMatrix m = new OpenMapRealMatrix(3, 3);
        try {
            m.getEntry(0, 3); // valid range [0,2]
            fail("Expected exception for column index == columns");
        } catch (RuntimeException e) {
            // expected
        }
    }

    // ---------- addToEntry ----------

    @Test
    public void testAddToEntryOnMissingEntryNonZeroIncrement() {
        OpenMapRealMatrix m = new OpenMapRealMatrix(2, 2);
        m.addToEntry(0, 0, 5.0); // 0 + 5 = 5 -> put
        assertEquals(5.0, m.getEntry(0, 0), EPS);
    }

    @Test
    public void testAddToEntryResultsInZeroRemoves() {
        OpenMapRealMatrix m = new OpenMapRealMatrix(2, 2);
        m.setEntry(0, 0, 5.0);
        m.addToEntry(0, 0, -5.0); // 5 + (-5) = 0 -> remove
        assertEquals(0.0, m.getEntry(0, 0), EPS);
    }

    @Test
    public void testAddToEntryOnMissingEntryZeroIncrement() {
        OpenMapRealMatrix m = new OpenMapRealMatrix(2, 2);
        m.addToEntry(1, 1, 0.0); // 0 + 0 = 0 -> remove (no-op)
        assertEquals(0.0, m.getEntry(1, 1), EPS);
    }

    // ---------- multiplyEntry ----------

    @Test
    public void testMultiplyEntryResultsNonZero() {
        OpenMapRealMatrix m = new OpenMapRealMatrix(2, 2);
        m.setEntry(0, 0, 5.0);
        m.multiplyEntry(0, 0, 2.0); // 5*2=10 -> put
        assertEquals(10.0, m.getEntry(0, 0), EPS);
    }

    @Test
    public void testMultiplyEntryResultsInZeroRemoves() {
        OpenMapRealMatrix m = new OpenMapRealMatrix(2, 2);
        m.setEntry(0, 0, 5.0);
        m.multiplyEntry(0, 0, 0.0); // 5*0=0 -> remove
        assertEquals(0.0, m.getEntry(0, 0), EPS);
    }

    @Test
    public void testMultiplyEntryOnMissingEntry() {
        OpenMapRealMatrix m = new OpenMapRealMatrix(2, 2);
        m.multiplyEntry(1, 1, 3.0); // 0*3=0 -> remove (no-op)
        assertEquals(0.0, m.getEntry(1, 1), EPS);
    }

    // ---------- add(OpenMapRealMatrix) ----------

    @Test
    public void testAddCompatible() {
        OpenMapRealMatrix a = new OpenMapRealMatrix(2, 2);
        a.setEntry(0, 0, 1.0);
        a.setEntry(1, 1, 2.0);

        OpenMapRealMatrix b = new OpenMapRealMatrix(2, 2);
        b.setEntry(0, 0, 3.0);
        b.setEntry(0, 1, 4.0);

        OpenMapRealMatrix sum = a.add(b);
        assertEquals(4.0, sum.getEntry(0, 0), EPS);
        assertEquals(4.0, sum.getEntry(0, 1), EPS);
        assertEquals(2.0, sum.getEntry(1, 1), EPS);
        assertEquals(0.0, sum.getEntry(1, 0), EPS);

        assertEquals(1.0, a.getEntry(0, 0), EPS); // original ไม่ถูกแก้
        assertEquals(3.0, b.getEntry(0, 0), EPS);
    }

    @Test
    public void testAddIncompatibleDimensionsThrows() {
        OpenMapRealMatrix a = new OpenMapRealMatrix(2, 2);
        OpenMapRealMatrix b = new OpenMapRealMatrix(3, 3);
        try {
            a.add(b);
            fail("Expected exception for incompatible dimensions");
        } catch (RuntimeException e) {
            // expected - likely MatrixDimensionMismatchException
        }
    }

    // ---------- subtract(OpenMapRealMatrix) ----------

    @Test
    public void testSubtractOpenMapCompatible() {
        OpenMapRealMatrix a = new OpenMapRealMatrix(2, 2);
        a.setEntry(0, 0, 5.0);
        a.setEntry(1, 1, 6.0);

        OpenMapRealMatrix b = new OpenMapRealMatrix(2, 2);
        b.setEntry(0, 0, 2.0);
        b.setEntry(0, 1, 1.0);

        OpenMapRealMatrix diff = a.subtract(b);
        assertEquals(3.0, diff.getEntry(0, 0), EPS);
        assertEquals(-1.0, diff.getEntry(0, 1), EPS);
        assertEquals(6.0, diff.getEntry(1, 1), EPS);
        assertEquals(0.0, diff.getEntry(1, 0), EPS);
    }

    @Test
    public void testSubtractOpenMapIncompatibleThrows() {
        OpenMapRealMatrix a = new OpenMapRealMatrix(2, 2);
        OpenMapRealMatrix b = new OpenMapRealMatrix(3, 2);
        try {
            a.subtract(b);
            fail("Expected exception for incompatible dimensions");
        } catch (RuntimeException e) {
            // expected
        }
    }

    // ---------- subtract(RealMatrix) overload ----------

    @Test
    public void testSubtractRealMatrixWithOpenMapInstance() {
        OpenMapRealMatrix a = new OpenMapRealMatrix(2, 2);
        a.setEntry(0, 0, 5.0);
        OpenMapRealMatrix b = new OpenMapRealMatrix(2, 2);
        b.setEntry(0, 0, 2.0);

        RealMatrix diff = a.subtract((RealMatrix) b); // cast สำเร็จ -> เรียก subtract(OpenMapRealMatrix) ตรง
        assertTrue(diff instanceof OpenMapRealMatrix);
        assertEquals(3.0, diff.getEntry(0, 0), EPS);
    }

    @Test
    public void testSubtractRealMatrixWithNonOpenMapInstance() {
        OpenMapRealMatrix a = new OpenMapRealMatrix(2, 2);
        a.setEntry(0, 0, 5.0);
        a.setEntry(1, 1, 7.0);

        Array2DRowRealMatrix b = new Array2DRowRealMatrix(2, 2);
        b.setEntry(0, 0, 2.0);
        b.setEntry(1, 1, 1.0);

        // ClassCastException path -> fallback ไป super.subtract(m)
        RealMatrix diff = a.subtract((RealMatrix) b);
        assertEquals(3.0, diff.getEntry(0, 0), EPS);
        assertEquals(6.0, diff.getEntry(1, 1), EPS);
        assertEquals(0.0, diff.getEntry(0, 1), EPS);
    }

    // ---------- multiply(OpenMapRealMatrix) ----------

    @Test
    public void testMultiplyOpenMapCompatible() {
        OpenMapRealMatrix a = new OpenMapRealMatrix(2, 2);
        a.setEntry(0, 0, 2.0);
        a.setEntry(0, 1, 4.0);
        // แถว 1 ของ a ว่างทั้งหมด (ทุกค่าเป็น 0)

        OpenMapRealMatrix b = new OpenMapRealMatrix(2, 2);
        b.setEntry(0, 0, 5.0);
        b.setEntry(0, 1, 1.0);
        b.setEntry(1, 0, -2.5);
        // b(1,1) ไม่ได้ตั้งค่า (เป็น 0 โดย default) -> เพื่อทดสอบ containsKey == false

        OpenMapRealMatrix product = a.multiply(b);

        // out(0,0) = 2*5 + 4*(-2.5) = 10 - 10 = 0 -> ทดสอบ branch "outValue==0 -> remove"
        assertEquals(0.0, product.getEntry(0, 0), EPS);
        // out(0,1) = 2*1 (ส่วน b(1,1) ถูก skip) = 2 -> ทดสอบ branch "put"
        assertEquals(2.0, product.getEntry(0, 1), EPS);
        assertEquals(0.0, product.getEntry(1, 0), EPS);
        assertEquals(0.0, product.getEntry(1, 1), EPS);
    }

    @Test
    public void testMultiplyOpenMapIncompatibleThrows() {
        OpenMapRealMatrix a = new OpenMapRealMatrix(2, 3);
        OpenMapRealMatrix b = new OpenMapRealMatrix(2, 2); // a.columns(3) != b.rows(2)
        try {
            a.multiply(b);
            fail("Expected exception for incompatible dimensions");
        } catch (RuntimeException e) {
            // expected
        }
    }

    // ---------- multiply(RealMatrix) overload ----------

    @Test
    public void testMultiplyRealMatrixWithOpenMapInstance() {
        OpenMapRealMatrix a = new OpenMapRealMatrix(2, 2);
        a.setEntry(0, 0, 3.0);
        OpenMapRealMatrix b = new OpenMapRealMatrix(2, 2);
        b.setEntry(0, 0, 2.0);

        RealMatrix product = a.multiply((RealMatrix) b); // cast สำเร็จ
        assertTrue(product instanceof OpenMapRealMatrix);
        assertEquals(6.0, product.getEntry(0, 0), EPS);
    }

    @Test
    public void testMultiplyRealMatrixWithNonOpenMapInstance() {
        OpenMapRealMatrix a = new OpenMapRealMatrix(2, 2);
        a.setEntry(0, 0, 2.0);
        a.setEntry(0, 1, 3.0);

        Array2DRowRealMatrix b = new Array2DRowRealMatrix(2, 2);
        b.setEntry(0, 0, 1.0);
        b.setEntry(1, 0, 4.0);
        b.setEntry(0, 1, 0.0);
        b.setEntry(1, 1, 0.0);

        // ClassCastException path -> ไปคำนวณผ่าน BlockRealMatrix
        RealMatrix product = a.multiply((RealMatrix) b);
        assertTrue(product instanceof BlockRealMatrix);
        // out(0,0) = 2*1 + 3*4 = 2 + 12 = 14
        assertEquals(14.0, product.getEntry(0, 0), EPS);
    }

    @Test
    public void testMultiplyRealMatrixIncompatibleThrows() {
        OpenMapRealMatrix a = new OpenMapRealMatrix(2, 3);
        Array2DRowRealMatrix b = new Array2DRowRealMatrix(2, 2); // a.cols(3)!=b.rows(2)
        try {
            a.multiply((RealMatrix) b);
            fail("Expected exception for incompatible dimensions");
        } catch (RuntimeException e) {
            // expected
        }
    }
}
```

## ตารางสรุปความครอบคลุม Branch/Condition

| เมธอดเทส | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testConstructorValidDimensions` | Constructor(int,int) path ปกติ, default entry = 0.0 |
| `testConstructorZeroRowDimensionThrows` / `testConstructorNegativeColumnDimensionThrows` | boundary ค่าผิดรูปแบบของ constructor (0, ค่าลบ) |
| `testCopyConstructor` | Copy constructor, ความเป็นอิสระของ entries map |
| `testCopyMethod` | `copy()` สร้าง instance ใหม่และเป็นอิสระ |
| `testCreateMatrix` | `createMatrix()` คืนเมทริกซ์ว่างตามมิติที่กำหนด |
| `testGetDimensions` | `getRowDimension()`/`getColumnDimension()` |
| `testSetGetEntryNonZero` | `setEntry` กรณี value != 0 (branch `else -> put`) |
| `testSetEntryZeroRemoves` | `setEntry` กรณี value == 0 (branch `if -> remove`) |
| `testGetEntryDefaultZero` | `getEntry` entry ที่ยังไม่ตั้งค่า (default) |
| `testGetEntryRowBoundaryValid` | boundary ของ index ที่ valid (0 และ max-1) |
| `testGetEntryRowIndexNegativeThrows` / `TooLargeThrows` | `checkRowIndex` เงื่อนไข index ผิดช่วง (ทั้งขอบล่าง/บน) |
| `testGetEntryColumnIndexNegativeThrows` / `TooLargeThrows` | `checkColumnIndex` เงื่อนไข index ผิดช่วง |
| `testAddToEntryOnMissingEntryNonZeroIncrement` | `addToEntry` ผลลัพธ์ != 0 (branch put) |
| `testAddToEntryResultsInZeroRemoves` | `addToEntry` ผลลัพธ์ == 0 (branch remove) |
| `testAddToEntryOnMissingEntryZeroIncrement` | `addToEntry` กรณี remove แบบ no-op (key ไม่มีอยู่) |
| `testMultiplyEntryResultsNonZero` | `multiplyEntry` ผลลัพธ์ != 0 (branch put) |
| `testMultiplyEntryResultsInZeroRemoves` | `multiplyEntry` ผลลัพธ์ == 0 (branch remove) |
| `testMultiplyEntryOnMissingEntry` | `multiplyEntry` กรณี key ไม่มีอยู่ตั้งแต่ต้น |
| `testAddCompatible` | `add(OpenMapRealMatrix)` loop ปกติ, ตรวจ `getEntry`/`setEntry` ภายใน loop, ความไม่เปลี่ยนแปลงของ operand |
| `testAddIncompatibleDimensionsThrows` | `checkAdditionCompatible` branch ผิดมิติ |
| `testSubtractOpenMapCompatible` | `subtract(OpenMapRealMatrix)` loop ปกติ |
| `testSubtractOpenMapIncompatibleThrows` | `checkAdditionCompatible` ใน `subtract(OpenMapRealMatrix)` ผิดมิติ |
| `testSubtractRealMatrixWithOpenMapInstance` | `subtract(RealMatrix)` branch cast สำเร็จ (try) |
| `testSubtractRealMatrixWithNonOpenMapInstance` | `subtract(RealMatrix)` branch `catch(ClassCastException)` -> `super.subtract(m)` |
| `testMultiplyOpenMapCompatible` | `multiply(OpenMapRealMatrix)` ทั้ง branch `containsKey==true/false` และ `outValue==0 (remove)/!=0 (put)` |
| `testMultiplyOpenMapIncompatibleThrows` | `checkMultiplicationCompatible` ใน `multiply(OpenMapRealMatrix)` ผิดมิติ |
| `testMultiplyRealMatrixWithOpenMapInstance` | `multiply(RealMatrix)` branch cast สำเร็จ (try) |
| `testMultiplyRealMatrixWithNonOpenMapInstance` | `multiply(RealMatrix)` branch `catch(ClassCastException)` -> คำนวณผ่าน `BlockRealMatrix` + inner for-loop j |
| `testMultiplyRealMatrixIncompatibleThrows` | `checkMultiplicationCompatible` ใน catch branch ของ `multiply(RealMatrix)` ผิดมิติ |

**ข้อจำกัดที่ต้องระวัง:** ชนิด Exception ที่แท้จริงจาก `MatrixUtils.checkRowIndex/checkColumnIndex/checkAdditionCompatible/checkMultiplicationCompatible` และเงื่อนไขตรวจสอบมิติใน constructor ของ `AbstractRealMatrix` ไม่ได้ปรากฏในซอร์สที่ให้มา จึงใช้การตรวจจับแบบกว้าง (`RuntimeException`) เพื่อยืนยันว่ามี exception เกิดขึ้นจริง โดยไม่ระบุชนิดที่เฉพาะเจาะจงเกินกว่าที่ยืนยันได้จากซอร์ส