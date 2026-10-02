# PearsonsCorrelationTest - ชุดทดสอบ JUnit 4

```java
package org.apache.commons.math.stat.correlation;

import static org.junit.Assert.*;

import org.apache.commons.math.MathException;
import org.apache.commons.math.linear.BlockRealMatrix;
import org.apache.commons.math.linear.RealMatrix;
import org.junit.Test;

/**
 * หมายเหตุ: คลาสทดสอบนี้อยู่ใน package เดียวกับ PearsonsCorrelation (org.apache.commons.math.stat.correlation)
 * จึงไม่ต้อง import PearsonsCorrelation และ Covariance โดยตรง
 */
public class PearsonsCorrelationTest {

    private static final double DELTA = 1e-6;

    // ---------- Constructors ----------

    @Test
    public void testDefaultConstructor() {
        PearsonsCorrelation pc = new PearsonsCorrelation();
        assertNull(pc.getCorrelationMatrix());
    }

    @Test
    public void testConstructorRealMatrix_valid() {
        double[][] data = {
            {1, 2},
            {2, 4},
            {3, 6},
            {4, 8}
        };
        RealMatrix matrix = new BlockRealMatrix(data);
        PearsonsCorrelation pc = new PearsonsCorrelation(matrix);
        RealMatrix corr = pc.getCorrelationMatrix();
        assertNotNull(corr);
        assertEquals(1d, corr.getEntry(0, 0), DELTA);
        assertEquals(1d, corr.getEntry(1, 1), DELTA);
        assertEquals(1d, corr.getEntry(0, 1), DELTA);
    }

    @Test
    public void testConstructorRealMatrix_boundaryExactlyTwoRowsTwoCols() {
        // เคสขอบเขต: nRows=2, nCols=2 (เงื่อนไข nRows<2 || nCols<2 ต้องเป็น false ทั้งคู่)
        double[][] data = {
            {1, 2},
            {3, 4}
        };
        RealMatrix matrix = new BlockRealMatrix(data);
        PearsonsCorrelation pc = new PearsonsCorrelation(matrix);
        assertNotNull(pc.getCorrelationMatrix());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorRealMatrix_insufficientRows() {
        // nRows=1 < 2 -> branch true (short-circuit OR)
        double[][] data = {
            {1, 2}
        };
        new PearsonsCorrelation(new BlockRealMatrix(data));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorRealMatrix_insufficientCols() {
        // nRows=2 (false) แต่ nCols=1 < 2 (true) -> ตรวจสอบฝั่งขวาของ OR
        double[][] data = {
            {1},
            {2}
        };
        new PearsonsCorrelation(new BlockRealMatrix(data));
    }

    @Test
    public void testConstructorDoubleArray_valid() {
        double[][] data = {
            {1, 2},
            {2, 4},
            {3, 6}
        };
        PearsonsCorrelation pc = new PearsonsCorrelation(data);
        assertNotNull(pc.getCorrelationMatrix());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorDoubleArray_insufficientData() {
        double[][] data = {
            {1, 2}
        };
        new PearsonsCorrelation(data);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorCovariance_nullMatrix() {
        // หมายเหตุ/สมมติฐาน: สมมติว่า Covariance มี no-arg constructor ที่ตั้ง
        // covarianceMatrix เป็น null (ตามรูปแบบเดียวกับ PearsonsCorrelation() default constructor)
        // หากพฤติกรรมจริงของ Covariance ไม่ตรงกับสมมติฐานนี้ ให้ปรับ/ข้ามเทสนี้
        Covariance covariance = new Covariance();
        new PearsonsCorrelation(covariance);
    }

    @Test
    public void testConstructorCovariance_valid() {
        double[][] data = {
            {1, 2},
            {2, 4},
            {3, 6},
            {4, 8}
        };
        Covariance covariance = new Covariance(data);
        PearsonsCorrelation pc = new PearsonsCorrelation(covariance);
        assertNotNull(pc.getCorrelationMatrix());
        assertEquals(1d, pc.getCorrelationMatrix().getEntry(0, 0), DELTA);
    }

    @Test
    public void testConstructorCovarianceMatrixWithNObs() {
        double[][] covData = {
            {4, 2},
            {2, 4}
        };
        RealMatrix covMatrix = new BlockRealMatrix(covData);
        PearsonsCorrelation pc = new PearsonsCorrelation(covMatrix, 5);
        RealMatrix corr = pc.getCorrelationMatrix();
        assertEquals(1d, corr.getEntry(0, 0), DELTA);
        assertEquals(1d, corr.getEntry(1, 1), DELTA);
        assertEquals(0.5d, corr.getEntry(0, 1), DELTA);
        assertEquals(0.5d, corr.getEntry(1, 0), DELTA);
    }

    // ---------- getCorrelationMatrix ----------

    @Test
    public void testGetCorrelationMatrix() {
        double[][] data = {
            {1, 5},
            {2, 4},
            {3, 3},
            {4, 2},
            {5, 1}
        };
        PearsonsCorrelation pc = new PearsonsCorrelation(data);
        RealMatrix corr = pc.getCorrelationMatrix();
        assertEquals(-1d, corr.getEntry(0, 1), DELTA);
    }

    // ---------- getCorrelationStandardErrors ----------

    @Test
    public void testGetCorrelationStandardErrors() {
        double[][] data = {
            {1, 2},
            {2, 4},
            {3, 6},
            {4, 8}
        };
        PearsonsCorrelation pc = new PearsonsCorrelation(data);
        RealMatrix se = pc.getCorrelationStandardErrors();
        assertNotNull(se);
        assertEquals(2, se.getRowDimension());
        assertEquals(2, se.getColumnDimension());
        // r=1 บน diagonal -> (1 - 1*1)=0 -> sqrt(0/(n-2))=0
        assertEquals(0d, se.getEntry(0, 0), DELTA);
        assertEquals(0d, se.getEntry(1, 1), DELTA);
    }

    // ---------- getCorrelationPValues ----------

    @Test
    public void testGetCorrelationPValues() throws MathException {
        double[][] data = {
            {1, 2},
            {2, 3},
            {3, 5},
            {4, 7}
        };
        PearsonsCorrelation pc = new PearsonsCorrelation(data);
        RealMatrix pValues = pc.getCorrelationPValues();
        assertNotNull(pValues);
        // i == j branch -> ต้องเป็น 0
        assertEquals(0d, pValues.getEntry(0, 0), DELTA);
        assertEquals(0d, pValues.getEntry(1, 1), DELTA);
        // i != j branch -> ค่า p-value ต้องอยู่ในช่วง [0,1]
        double offDiag = pValues.getEntry(0, 1);
        assertTrue(offDiag >= 0d && offDiag <= 1d);
        assertEquals(offDiag, pValues.getEntry(1, 0), DELTA);
    }

    // ---------- computeCorrelationMatrix ----------

    @Test
    public void testComputeCorrelationMatrix_RealMatrix() {
        PearsonsCorrelation pc = new PearsonsCorrelation();
        double[][] data = {
            {1, 2, 1},
            {2, 4, 3},
            {3, 6, 2},
            {4, 8, 5}
        };
        RealMatrix matrix = new BlockRealMatrix(data);
        RealMatrix corr = pc.computeCorrelationMatrix(matrix);
        assertEquals(3, corr.getRowDimension());
        assertEquals(3, corr.getColumnDimension());
        assertEquals(1d, corr.getEntry(0, 0), DELTA);
        assertEquals(1d, corr.getEntry(1, 1), DELTA);
        assertEquals(1d, corr.getEntry(2, 2), DELTA);
        assertEquals(1d, corr.getEntry(0, 1), DELTA);
        assertEquals(corr.getEntry(0, 1), corr.getEntry(1, 0), DELTA);
    }

    @Test
    public void testComputeCorrelationMatrix_SingleColumn() {
        // เคสขอบเขต: 1 คอลัมน์ -> inner loop (j<i) ไม่ execute เมื่อ i=0
        PearsonsCorrelation pc = new PearsonsCorrelation();
        double[][] data = {
            {1},
            {2},
            {3}
        };
        RealMatrix matrix = new BlockRealMatrix(data);
        RealMatrix corr = pc.computeCorrelationMatrix(matrix);
        assertEquals(1, corr.getRowDimension());
        assertEquals(1, corr.getColumnDimension());
        assertEquals(1d, corr.getEntry(0, 0), DELTA);
    }

    @Test
    public void testComputeCorrelationMatrix_doubleArray() {
        PearsonsCorrelation pc = new PearsonsCorrelation();
        double[][] data = {
            {1, 2},
            {2, 4},
            {3, 6}
        };
        RealMatrix corr = pc.computeCorrelationMatrix(data);
        assertEquals(1d, corr.getEntry(0, 1), DELTA);
    }

    // ---------- correlation(double[], double[]) ----------

    @Test
    public void testCorrelation_perfectPositive() {
        PearsonsCorrelation pc = new PearsonsCorrelation();
        double[] x = {1, 2, 3, 4, 5};
        double[] y = {2, 4, 6, 8, 10};
        double r = pc.correlation(x, y);
        assertEquals(1d, r, DELTA);
    }

    @Test
    public void testCorrelation_perfectNegative() {
        PearsonsCorrelation pc = new PearsonsCorrelation();
        double[] x = {1, 2, 3, 4, 5};
        double[] y = {5, 4, 3, 2, 1};
        double r = pc.correlation(x, y);
        assertEquals(-1d, r, DELTA);
    }

    @Test
    public void testCorrelation_boundaryLengthTwo() {
        // เคสขอบเขต: length == 2 (เงื่อนไข xArray.length > 1 เป็น true พอดี)
        PearsonsCorrelation pc = new PearsonsCorrelation();
        double[] x = {1, 2};
        double[] y = {3, 4};
        double r = pc.correlation(x, y);
        assertEquals(1d, r, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCorrelation_mismatchedLengths() {
        PearsonsCorrelation pc = new PearsonsCorrelation();
        double[] x = {1, 2, 3};
        double[] y = {1, 2};
        pc.correlation(x, y);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCorrelation_lengthOne() {
        // เคสขอบเขต: length == 1 -> xArray.length > 1 เป็น false
        PearsonsCorrelation pc = new PearsonsCorrelation();
        double[] x = {1};
        double[] y = {2};
        pc.correlation(x, y);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCorrelation_lengthZero() {
        // เคสขอบเขต: length == 0 -> (0==0) true แต่ xArray.length>1 false
        PearsonsCorrelation pc = new PearsonsCorrelation();
        double[] x = {};
        double[] y = {};
        pc.correlation(x, y);
    }

    @Test(expected = NullPointerException.class)
    public void testCorrelation_nullArrays() {
        // หมายเหตุ: ซอร์สไม่ได้ตรวจสอบ null อย่างชัดเจน
        // การเรียก xArray.length บน null จะทำให้เกิด NullPointerException
        // (ไม่ตรงกับ Javadoc ที่ระบุว่าจะ throw IllegalArgumentException -> ถือเป็นข้อสังเกต/fault ที่อาจพบ)
        PearsonsCorrelation pc = new PearsonsCorrelation();
        pc.correlation(null, null);
    }

    // ---------- covarianceToCorrelation ----------

    @Test
    public void testCovarianceToCorrelation() {
        PearsonsCorrelation pc = new PearsonsCorrelation();
        double[][] covData = {
            {4, 2},
            {2, 9}
        };
        RealMatrix covMatrix = new BlockRealMatrix(covData);
        RealMatrix corr = pc.covarianceToCorrelation(covMatrix);
        assertEquals(1d, corr.getEntry(0, 0), DELTA);
        assertEquals(1d, corr.getEntry(1, 1), DELTA);
        double expected = 2d / (Math.sqrt(4d) * Math.sqrt(9d));
        assertEquals(expected, corr.getEntry(0, 1), DELTA);
        assertEquals(expected, corr.getEntry(1, 0), DELTA);
    }

    @Test
    public void testCovarianceToCorrelation_singleVariable() {
        // เคสขอบเขต: nVars = 1 -> inner loop (j<i) ไม่ execute
        PearsonsCorrelation pc = new PearsonsCorrelation();
        double[][] covData = {
            {4}
        };
        RealMatrix covMatrix = new BlockRealMatrix(covData);
        RealMatrix corr = pc.covarianceToCorrelation(covMatrix);
        assertEquals(1, corr.getRowDimension());
        assertEquals(1d, corr.getEntry(0, 0), DELTA);
    }
}
```

## ตารางสรุป Branch/Condition Coverage

| เทสเมธอด | Branch / Condition ที่ครอบคลุม |
|---|---|
| testDefaultConstructor | default constructor - correlationMatrix=null, nObs=0 |
| testConstructorRealMatrix_valid | constructor(RealMatrix) ผ่าน checkSufficientData (false branch), เรียก computeCorrelationMatrix |
| testConstructorRealMatrix_boundaryExactlyTwoRowsTwoCols | checkSufficientData: nRows==2, nCols==2 (ขอบเขต, ทั้งสอง condition false) |
| testConstructorRealMatrix_insufficientRows | checkSufficientData: nRows<2 → true (OR ฝั่งซ้าย) → throw |
| testConstructorRealMatrix_insufficientCols | checkSufficientData: nRows<2 false, nCols<2 → true (OR ฝั่งขวา) → throw |
| testConstructorDoubleArray_valid | constructor(double[][]) → delegate ไป constructor(RealMatrix) สำเร็จ |
| testConstructorDoubleArray_insufficientData | constructor(double[][]) → delegate แล้ว throw จาก checkSufficientData |
| testConstructorCovariance_nullMatrix | constructor(Covariance): if (covarianceMatrix==null) → true → throw |
| testConstructorCovariance_valid | constructor(Covariance): if (covarianceMatrix==null) → false → covarianceToCorrelation ถูกเรียก |
| testConstructorCovarianceMatrixWithNObs | constructor(RealMatrix, int) - ไม่มี branch แต่ตรวจผลลัพธ์ covarianceToCorrelation |
| testGetCorrelationMatrix | getCorrelationMatrix() - คืนค่า non-null matrix |
| testGetCorrelationStandardErrors | getCorrelationStandardErrors(): nested loop (i,j) ทุกคู่ |
| testGetCorrelationPValues | getCorrelationPValues(): if(i==j) true branch (diag=0) และ false branch (คำนวณ t,p-value) |
| testComputeCorrelationMatrix_RealMatrix | computeCorrelationMatrix(RealMatrix): outer loop, inner loop j<i ทำงาน (i>0) |
| testComputeCorrelationMatrix_SingleColumn | computeCorrelationMatrix(RealMatrix): inner loop j<i ไม่ execute เมื่อ nVars=1 (i=0) |
| testComputeCorrelationMatrix_doubleArray | computeCorrelationMatrix(double[][]) delegate ไป computeCorrelationMatrix(RealMatrix) |
| testCorrelation_perfectPositive | correlation(): if-branch true (length เท่ากันและ >1), ค่า r=1 |
| testCorrelation_perfectNegative | correlation(): if-branch true, ค่า r=-1 |
| testCorrelation_boundaryLengthTwo | correlation(): ขอบเขต length==2 (xArray.length>1 เป็น true พอดี) |
| testCorrelation_mismatchedLengths | correlation(): else-branch (length ไม่เท่ากัน) → throw |
| testCorrelation_lengthOne | correlation(): else-branch (length==1, length>1 false) → throw |
| testCorrelation_lengthZero | correlation(): else-branch (length==0, length>1 false) → throw |
| testCorrelation_nullArrays | correlation(): null input → NullPointerException (พฤติกรรมจริง ไม่ตรง Javadoc, หมายเหตุกำกับ) |
| testCovarianceToCorrelation | covarianceToCorrelation(): outer loop, inner loop j<i ทำงาน (i>0) |
| testCovarianceToCorrelation_singleVariable | covarianceToCorrelation(): inner loop j<i ไม่ execute เมื่อ nVars=1 |

**หมายเหตุสำคัญ:**
- `testConstructorCovariance_nullMatrix` และ `testConstructorCovariance_valid` ใช้สมมติฐานเกี่ยวกับ API ของคลาส `Covariance` (constructor แบบ no-arg และ `Covariance(double[][])`, `getCovarianceMatrix()`, `getN()`) ซึ่งไม่ได้แสดงในซอร์สที่ให้มา แต่เป็นรูปแบบที่สอดคล้องกับ constructor pattern ของ `PearsonsCorrelation` เอง หากพฤติกรรมจริงต่างไป ควรปรับหรือข้ามเทสเหล่านี้
- `testCorrelation_nullArrays` สะท้อนพฤติกรรมจริงของโค้ด (NPE) ซึ่งไม่ตรงกับ Javadoc ที่ระบุว่าควร throw `IllegalArgumentException` — ถือเป็นจุดสังเกตเชิง fault ที่ควร flag ไว้