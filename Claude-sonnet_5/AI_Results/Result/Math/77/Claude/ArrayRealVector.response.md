# การวิเคราะห์และชุดทดสอบ JUnit 4: `ArrayRealVectorTest`

**หมายเหตุสำคัญก่อนเริ่ม:**
- ซอร์สโค้ดที่ให้มาอ้างอิงคลาสในแพ็กเกจเดียวกัน (`RealVector`, `AbstractRealVector`, `RealMatrix`, `MatrixIndexException`, `MathRuntimeException` ฯลฯ) แต่ไม่มีซอร์สของคลาสเหล่านี้ให้วิเคราะห์ จึงจะไม่ "เดา" รายละเอียด implementation ของคลาสเหล่านั้น (เช่น `checkIndex()`, `MatrixIndexException` hierarchy) และจะใช้การตรวจจับ exception แบบทั่วไป (`catch (Exception e)`) ในกรณีที่ไม่แน่ใจชนิด exception ที่แท้จริง
- Branch ที่ต้องพึ่งพา `RealVector` ที่ **ไม่ใช่** `ArrayRealVector` (เช่น branch `else` ของ `instanceof ArrayRealVector`) ไม่สามารถทดสอบได้อย่างปลอดภัยโดยไม่มีซอร์ส `AbstractRealVector`/`RealVector` ที่สมบูรณ์ จึงคอมเมนต์กำกับไว้ว่า "ไม่ครอบคลุม" ในจุดนั้น ๆ
- ทดสอบ `getLInfNorm()` ตามพฤติกรรมที่ถูกต้องตามสัญญา (L-infinity norm = max(|a_i|)) เพื่อ "ดักจับข้อบกพร่อง" ที่พบในซอร์ส (`max += Math.max(...)` ซึ่งควรเป็น `max = Math.max(...)`)

```java
package org.apache.commons.math.linear;

import static org.junit.Assert.*;
import org.junit.Test;

public class ArrayRealVectorTest {

    private static final double DELTA = 1e-9;

    // ---------------------------------------------------------------
    // Constructors
    // ---------------------------------------------------------------

    @Test
    public void testDefaultConstructor() {
        ArrayRealVector v = new ArrayRealVector();
        assertEquals(0, v.getDimension());
    }

    @Test
    public void testSizeConstructor() {
        ArrayRealVector v = new ArrayRealVector(5);
        assertEquals(5, v.getDimension());
        for (int i = 0; i < 5; i++) {
            assertEquals(0.0, v.getEntry(i), DELTA);
        }
    }

    @Test
    public void testSizeConstructorZero() {
        ArrayRealVector v = new ArrayRealVector(0);
        assertEquals(0, v.getDimension());
    }

    @Test
    public void testSizePresetConstructor() {
        ArrayRealVector v = new ArrayRealVector(3, 7.0);
        assertEquals(3, v.getDimension());
        for (int i = 0; i < 3; i++) {
            assertEquals(7.0, v.getEntry(i), DELTA);
        }
    }

    @Test
    public void testDoubleArrayConstructorCopiesData() {
        double[] d = {1, 2, 3};
        ArrayRealVector v = new ArrayRealVector(d);
        d[0] = 99; // modify original
        assertEquals(1.0, v.getEntry(0), DELTA); // vector unaffected -> clone behavior
    }

    @Test
    public void testDoubleArrayCopyTrueConstructorCopies() {
        double[] d = {1, 2, 3};
        ArrayRealVector v = new ArrayRealVector(d, true);
        d[0] = 99;
        assertEquals(1.0, v.getEntry(0), DELTA);
    }

    @Test
    public void testDoubleArrayCopyFalseConstructorSharesReference() {
        double[] d = {1, 2, 3};
        ArrayRealVector v = new ArrayRealVector(d, false);
        d[0] = 99;
        assertEquals(99.0, v.getEntry(0), DELTA); // reference shared
        assertSame(d, v.getDataRef());
    }

    @Test(expected = NullPointerException.class)
    public void testDoubleArrayCopyConstructorNullThrows() {
        double[] d = null;
        new ArrayRealVector(d, true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDoubleArrayCopyConstructorEmptyThrows() {
        new ArrayRealVector(new double[0], true);
    }

    @Test
    public void testDoubleArrayPosSizeConstructorValid() {
        double[] d = {1, 2, 3, 4, 5};
        ArrayRealVector v = new ArrayRealVector(d, 1, 3);
        assertEquals(3, v.getDimension());
        assertEquals(2.0, v.getEntry(0), DELTA);
        assertEquals(4.0, v.getEntry(2), DELTA);
    }

    @Test
    public void testDoubleArrayPosSizeConstructorBoundaryExact() {
        double[] d = {1, 2, 3};
        ArrayRealVector v = new ArrayRealVector(d, 0, 3); // pos+size == d.length exactly
        assertEquals(3, v.getDimension());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDoubleArrayPosSizeConstructorOutOfRangeThrows() {
        double[] d = {1, 2, 3};
        new ArrayRealVector(d, 1, 3); // pos+size=4 > length=3
    }

    @Test
    public void testDoubleObjectArrayConstructor() {
        Double[] d = {1.0, 2.0, 3.0};
        ArrayRealVector v = new ArrayRealVector(d);
        assertEquals(3, v.getDimension());
        assertEquals(2.0, v.getEntry(1), DELTA);
    }

    @Test
    public void testDoubleObjectArrayPosSizeConstructorValid() {
        Double[] d = {1.0, 2.0, 3.0, 4.0};
        ArrayRealVector v = new ArrayRealVector(d, 1, 2);
        assertEquals(2, v.getDimension());
        assertEquals(2.0, v.getEntry(0), DELTA);
        assertEquals(3.0, v.getEntry(1), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDoubleObjectArrayPosSizeConstructorOutOfRangeThrows() {
        Double[] d = {1.0, 2.0, 3.0};
        new ArrayRealVector(d, 2, 3); // pos+size=5 > length=3
    }

    @Test
    public void testRealVectorConstructorDeepCopy() {
        RealVector src = new ArrayRealVector(new double[]{1, 2, 3});
        ArrayRealVector copy = new ArrayRealVector(src);
        assertEquals(3, copy.getDimension());
        assertEquals(2.0, copy.getEntry(1), DELTA);
    }

    @Test
    public void testArrayRealVectorCopyConstructorIsDeep() {
        ArrayRealVector orig = new ArrayRealVector(new double[]{1, 2, 3});
        ArrayRealVector copy = new ArrayRealVector(orig);
        copy.setEntry(0, 999);
        assertEquals(1.0, orig.getEntry(0), DELTA); // independent arrays
    }

    @Test
    public void testArrayRealVectorDeepConstructorTrueIsIndependent() {
        ArrayRealVector orig = new ArrayRealVector(new double[]{1, 2, 3});
        ArrayRealVector copy = new ArrayRealVector(orig, true);
        copy.setEntry(0, 999);
        assertEquals(1.0, orig.getEntry(0), DELTA);
    }

    @Test
    public void testArrayRealVectorDeepConstructorFalseSharesArray() {
        ArrayRealVector orig = new ArrayRealVector(new double[]{1, 2, 3});
        ArrayRealVector shallow = new ArrayRealVector(orig, false);
        shallow.setEntry(0, 999);
        assertEquals(999.0, orig.getEntry(0), DELTA); // shared reference
    }

    @Test
    public void testAppendConstructor_ArrayRealVector_ArrayRealVector() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1, 2});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{3, 4});
        ArrayRealVector v = new ArrayRealVector(v1, v2);
        assertEquals(4, v.getDimension());
        assertArrayEquals(new double[]{1, 2, 3, 4}, v.getData(), DELTA);
    }

    @Test
    public void testAppendConstructor_ArrayRealVector_RealVector() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1, 2});
        RealVector v2 = new ArrayRealVector(new double[]{3, 4});
        ArrayRealVector v = new ArrayRealVector(v1, v2);
        assertArrayEquals(new double[]{1, 2, 3, 4}, v.getData(), DELTA);
    }

    @Test
    public void testAppendConstructor_RealVector_ArrayRealVector() {
        RealVector v1 = new ArrayRealVector(new double[]{1, 2});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{3, 4});
        ArrayRealVector v = new ArrayRealVector(v1, v2);
        assertArrayEquals(new double[]{1, 2, 3, 4}, v.getData(), DELTA);
    }

    @Test
    public void testAppendConstructor_ArrayRealVector_doubleArray() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1, 2});
        double[] v2 = {3, 4};
        ArrayRealVector v = new ArrayRealVector(v1, v2);
        assertArrayEquals(new double[]{1, 2, 3, 4}, v.getData(), DELTA);
    }

    @Test
    public void testAppendConstructor_doubleArray_ArrayRealVector() {
        double[] v1 = {1, 2};
        ArrayRealVector v2 = new ArrayRealVector(new double[]{3, 4});
        ArrayRealVector v = new ArrayRealVector(v1, v2);
        assertArrayEquals(new double[]{1, 2, 3, 4}, v.getData(), DELTA);
    }

    @Test
    public void testAppendConstructor_doubleArray_doubleArray() {
        double[] v1 = {1, 2};
        double[] v2 = {3, 4};
        ArrayRealVector v = new ArrayRealVector(v1, v2);
        assertArrayEquals(new double[]{1, 2, 3, 4}, v.getData(), DELTA);
    }

    // ---------------------------------------------------------------
    // copy()
    // ---------------------------------------------------------------

    @Test
    public void testCopy() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1, 2, 3});
        AbstractRealVector c = v.copy();
        assertTrue(c instanceof ArrayRealVector);
        assertArrayEquals(new double[]{1, 2, 3}, ((ArrayRealVector) c).getData(), DELTA);
    }

    // ---------------------------------------------------------------
    // add / subtract
    // ---------------------------------------------------------------

    @Test
    public void testAddArrayRealVector() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1, 2, 3});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{10, 20, 30});
        ArrayRealVector r = v1.add(v2);
        assertArrayEquals(new double[]{11, 22, 33}, r.getData(), DELTA);
    }

    @Test
    public void testAddRealVector_instanceOfArrayRealVector_ifBranch() {
        // ครอบคลุมเฉพาะ branch "if (v instanceof ArrayRealVector)" เนื่องจากไม่มี
        // RealVector implementation อื่นที่ปลอดภัยต่อการสร้างโดยไม่มีซอร์สของ AbstractRealVector
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1, 2});
        RealVector v2 = new ArrayRealVector(new double[]{3, 4});
        RealVector r = v1.add(v2);
        assertArrayEquals(new double[]{4, 6}, ((ArrayRealVector) r).getData(), DELTA);
    }

    @Test
    public void testAddDoubleArray() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1, 2, 3});
        RealVector r = v1.add(new double[]{1, 1, 1});
        assertArrayEquals(new double[]{2, 3, 4}, ((ArrayRealVector) r).getData(), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDoubleArrayDimensionMismatchThrows() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1, 2, 3});
        v1.add(new double[]{1, 1});
    }

    @Test
    public void testSubtractArrayRealVector() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{5, 6, 7});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{1, 2, 3});
        ArrayRealVector r = v1.subtract(v2);
        assertArrayEquals(new double[]{4, 4, 4}, r.getData(), DELTA);
    }

    @Test
    public void testSubtractDoubleArray() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{5, 6, 7});
        RealVector r = v1.subtract(new double[]{1, 2, 3});
        assertArrayEquals(new double[]{4, 4, 4}, ((ArrayRealVector) r).getData(), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubtractDimensionMismatchThrows() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1, 2, 3});
        v1.subtract(new double[]{1});
    }

    // ---------------------------------------------------------------
    // mapXxxToSelf (ครอบคลุมตัวอย่างหลัก loop pattern เหมือนกันทั้งหมด)
    // ---------------------------------------------------------------

    @Test
    public void testMapAddToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1, 2, 3});
        v.mapAddToSelf(5);
        assertArrayEquals(new double[]{6, 7, 8}, v.getData(), DELTA);
    }

    @Test
    public void testMapSubtractToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{5, 6, 7});
        v.mapSubtractToSelf(2);
        assertArrayEquals(new double[]{3, 4, 5}, v.getData(), DELTA);
    }

    @Test
    public void testMapMultiplyToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1, 2, 3});
        v.mapMultiplyToSelf(3);
        assertArrayEquals(new double[]{3, 6, 9}, v.getData(), DELTA);
    }

    @Test
    public void testMapDivideToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{4, 8, 12});
        v.mapDivideToSelf(4);
        assertArrayEquals(new double[]{1, 2, 3}, v.getData(), DELTA);
    }

    @Test
    public void testMapInvToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1, 2, 4});
        v.mapInvToSelf();
        assertArrayEquals(new double[]{1, 0.5, 0.25}, v.getData(), DELTA);
    }

    @Test
    public void testMapInvToSelfZeroYieldsInfinity() {
        ArrayRealVector v = new ArrayRealVector(new double[]{0});
        v.mapInvToSelf();
        assertEquals(Double.POSITIVE_INFINITY, v.getEntry(0), DELTA);
    }

    @Test
    public void testMapAbsToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{-1, 2, -3});
        v.mapAbsToSelf();
        assertArrayEquals(new double[]{1, 2, 3}, v.getData(), DELTA);
    }

    @Test
    public void testMapSqrtToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{4, 9, 16});
        v.mapSqrtToSelf();
        assertArrayEquals(new double[]{2, 3, 4}, v.getData(), DELTA);
    }

    @Test
    public void testMapEmptyVectorLoopZeroIterations() {
        ArrayRealVector v = new ArrayRealVector(new double[0]);
        v.mapAddToSelf(5); // loop body ไม่ควรรัน
        assertEquals(0, v.getDimension());
    }

    // ---------------------------------------------------------------
    // ebeMultiply / ebeDivide
    // ---------------------------------------------------------------

    @Test
    public void testEbeMultiplyArrayRealVector() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1, 2, 3});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{2, 2, 2});
        ArrayRealVector r = v1.ebeMultiply(v2);
        assertArrayEquals(new double[]{2, 4, 6}, r.getData(), DELTA);
    }

    @Test
    public void testEbeMultiplyDoubleArray() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1, 2, 3});
        RealVector r = v1.ebeMultiply(new double[]{2, 2, 2});
        assertArrayEquals(new double[]{2, 4, 6}, ((ArrayRealVector) r).getData(), DELTA);
    }

    @Test
    public void testEbeDivideArrayRealVector() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{4, 6, 8});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{2, 2, 2});
        ArrayRealVector r = v1.ebeDivide(v2);
        assertArrayEquals(new double[]{2, 3, 4}, r.getData(), DELTA);
    }

    @Test
    public void testEbeDivideDoubleArray() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{4, 6, 8});
        RealVector r = v1.ebeDivide(new double[]{2, 2, 2});
        assertArrayEquals(new double[]{2, 3, 4}, ((ArrayRealVector) r).getData(), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEbeMultiplyDimensionMismatchThrows() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1, 2, 3});
        v1.ebeMultiply(new double[]{1, 2});
    }

    // ---------------------------------------------------------------
    // getData / getDataRef
    // ---------------------------------------------------------------

    @Test
    public void testGetDataReturnsClone() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1, 2, 3});
        double[] d = v.getData();
        d[0] = 999;
        assertEquals(1.0, v.getEntry(0), DELTA); // clone, ไม่กระทบ internal data
    }

    @Test
    public void testGetDataRefReturnsSameReference() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1, 2, 3});
        double[] ref = v.getDataRef();
        ref[0] = 999;
        assertEquals(999.0, v.getEntry(0), DELTA); // ไม่ clone
    }

    // ---------------------------------------------------------------
    // dotProduct
    // ---------------------------------------------------------------

    @Test
    public void testDotProductArrayRealVector() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1, 2, 3});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{4, 5, 6});
        assertEquals(32.0, v1.dotProduct(v2), DELTA); // 1*4+2*5+3*6
    }

    @Test
    public void testDotProductDoubleArray() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1, 2, 3});
        assertEquals(32.0, v1.dotProduct(new double[]{4, 5, 6}), DELTA);
    }

    // ---------------------------------------------------------------
    // Norms (**testGetLInfNorm ครอบคลุม defect ของซอร์สโค้ด**)
    // ---------------------------------------------------------------

    @Test
    public void testGetNorm() {
        ArrayRealVector v = new ArrayRealVector(new double[]{3, 4});
        assertEquals(5.0, v.getNorm(), DELTA); // sqrt(9+16)
    }

    @Test
    public void testGetNormEmptyVectorIsZero() {
        ArrayRealVector v = new ArrayRealVector(new double[0]);
        assertEquals(0.0, v.getNorm(), DELTA);
    }

    @Test
    public void testGetL1Norm() {
        ArrayRealVector v = new ArrayRealVector(new double[]{-3, 4, -5});
        assertEquals(12.0, v.getL1Norm(), DELTA);
    }

    @Test
    public void testGetLInfNorm_shouldBeMaxAbsoluteValue() {
        // *** ทดสอบตาม "สัญญา" ของ L-infinity norm (= max(|a_i|)) ***
        // ซอร์สโค้ดมี fault: "max += Math.max(max, Math.abs(a))" ควรเป็น
        // "max = Math.max(max, Math.abs(a))"
        // ผลลัพธ์ที่คาดหวังตามความหมายทางคณิตศาสตร์คือ 5.0
        // (ด้วยโค้ดที่มี bug ปัจจุบันผลที่ได้จะเป็น 16.0 ซึ่งทำให้เทสนี้ fail
        //  และช่วยดักจับ defect ได้ตามจุดประสงค์)
        ArrayRealVector v = new ArrayRealVector(new double[]{3, -5, 2});
        assertEquals(5.0, v.getLInfNorm(), DELTA);
    }

    @Test
    public void testGetLInfNormSingleElement() {
        ArrayRealVector v = new ArrayRealVector(new double[]{-7});
        assertEquals(7.0, v.getLInfNorm(), DELTA);
    }

    // ---------------------------------------------------------------
    // Distances
    // ---------------------------------------------------------------

    @Test
    public void testGetDistanceArrayRealVector() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{0, 0});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{3, 4});
        assertEquals(5.0, v1.getDistance(v2), DELTA);
    }

    @Test
    public void testGetDistanceDoubleArray() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{0, 0});
        assertEquals(5.0, v1.getDistance(new double[]{3, 4}), DELTA);
    }

    @Test
    public void testGetL1DistanceArrayRealVector() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{0, 0});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{3, -4});
        assertEquals(7.0, v1.getL1Distance(v2), DELTA);
    }

    @Test
    public void testGetLInfDistanceArrayRealVector() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{0, 0});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{3, -9});
        assertEquals(9.0, v1.getLInfDistance(v2), DELTA);
        // method นี้ implement ถูกต้อง (max = Math.max(...)) ต่างจาก getLInfNorm
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDistanceDimensionMismatchThrows() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1, 2, 3});
        v1.getDistance(new double[]{1, 2});
    }

    // ---------------------------------------------------------------
    // unitVector / unitize
    // ---------------------------------------------------------------

    @Test
    public void testUnitVector() {
        ArrayRealVector v = new ArrayRealVector(new double[]{3, 4});
        RealVector u = v.unitVector();
        assertEquals(1.0, u.getNorm(), DELTA);
        // ต้นฉบับไม่เปลี่ยนแปลง
        assertArrayEquals(new double[]{3, 4}, v.getData(), DELTA);
    }

    @Test(expected = ArithmeticException.class)
    public void testUnitVectorZeroNormThrows() {
        ArrayRealVector v = new ArrayRealVector(new double[]{0, 0});
        v.unitVector();
    }

    @Test
    public void testUnitize() {
        ArrayRealVector v = new ArrayRealVector(new double[]{3, 4});
        v.unitize();
        assertEquals(1.0, v.getNorm(), DELTA); // แก้ไข in-place
    }

    @Test(expected = ArithmeticException.class)
    public void testUnitizeZeroNormThrows() {
        ArrayRealVector v = new ArrayRealVector(new double[]{0, 0});
        v.unitize();
    }

    // ---------------------------------------------------------------
    // projection
    // ---------------------------------------------------------------

    @Test
    public void testProjectionArrayRealVector() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1, 0});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{2, 0});
        ArrayRealVector p = v1.projection(v2);
        assertArrayEquals(new double[]{1, 0}, p.getData(), DELTA);
    }

    @Test
    public void testProjectionDoubleArray() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1, 0});
        RealVector p = v1.projection(new double[]{2, 0});
        assertArrayEquals(new double[]{1, 0}, ((ArrayRealVector) p).getData(), DELTA);
    }

    // ---------------------------------------------------------------
    // outerProduct
    // ---------------------------------------------------------------

    @Test
    public void testOuterProductArrayRealVector() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1, 2});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{3, 4});
        RealMatrix m = v1.outerProduct(v2);
        // สมมติ (จากรูปแบบการใช้งานภายในซอร์ส) ว่า RealMatrix มี getEntry(i,j) แบบ public
        assertEquals(3.0, m.getEntry(0, 0), DELTA);
        assertEquals(4.0, m.getEntry(0, 1), DELTA);
        assertEquals(6.0, m.getEntry(1, 0), DELTA);
        assertEquals(8.0, m.getEntry(1, 1), DELTA);
    }

    @Test
    public void testOuterProductDoubleArray() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1, 2});
        RealMatrix m = v1.outerProduct(new double[]{3, 4});
        assertEquals(3.0, m.getEntry(0, 0), DELTA);
        assertEquals(8.0, m.getEntry(1, 1), DELTA);
    }

    // ---------------------------------------------------------------
    // getEntry / getDimension
    // ---------------------------------------------------------------

    @Test
    public void testGetEntry() {
        ArrayRealVector v = new ArrayRealVector(new double[]{10, 20, 30});
        assertEquals(20.0, v.getEntry(1), DELTA);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetEntryOutOfBoundsThrowsArrayIndexException() {
        // getEntry ไม่มี try/catch จึงปล่อย ArrayIndexOutOfBoundsException ตรง ๆ
        // แม้ signature ประกาศ "throws MatrixIndexException" ก็ตาม
        ArrayRealVector v = new ArrayRealVector(new double[]{1, 2, 3});
        v.getEntry(5);
    }

    @Test
    public void testGetDimension() {
        ArrayRealVector v = new ArrayRealVector(7);
        assertEquals(7, v.getDimension());
    }

    // ---------------------------------------------------------------
    // append (instance methods)
    // ---------------------------------------------------------------

    @Test
    public void testAppendRealVector_tryBranchSuccess() {
        // v เป็น ArrayRealVector จริง -> cast สำเร็จ ไม่เข้า catch(ClassCastException)
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1, 2});
        RealVector v2 = new ArrayRealVector(new double[]{3, 4});
        RealVector r = v1.append(v2);
        assertArrayEquals(new double[]{1, 2, 3, 4}, ((ArrayRealVector) r).getData(), DELTA);
    }

    @Test
    public void testAppendArrayRealVectorMethod() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1, 2});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{3, 4});
        ArrayRealVector r = v1.append(v2);
        assertArrayEquals(new double[]{1, 2, 3, 4}, r.getData(), DELTA);
    }

    @Test
    public void testAppendDouble() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1, 2});
        RealVector r = v1.append(99.0);
        assertArrayEquals(new double[]{1, 2, 99}, ((ArrayRealVector) r).getData(), DELTA);
    }

    @Test
    public void testAppendDoubleArrayMethod() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1, 2});
        RealVector r = v1.append(new double[]{3, 4});
        assertArrayEquals(new double[]{1, 2, 3, 4}, ((ArrayRealVector) r).getData(), DELTA);
    }

    // ---------------------------------------------------------------
    // getSubVector
    // ---------------------------------------------------------------

    @Test
    public void testGetSubVectorNormal() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1, 2, 3, 4, 5});
        RealVector sub = v.getSubVector(1, 3);
        assertArrayEquals(new double[]{2, 3, 4}, ((ArrayRealVector) sub).getData(), DELTA);
    }

    @Test
    public void testGetSubVectorOutOfBoundsThrows() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1, 2, 3});
        try {
            v.getSubVector(1, 10); // index+n เกินขอบเขต -> catch(IndexOutOfBoundsException) -> checkIndex
            fail("คาดว่าควร throw exception เมื่อ index/size เกินขอบเขต");
        } catch (Exception e) {
            // คาดหวังว่าจะมี exception ชนิดใดชนิดหนึ่งถูก throw จาก checkIndex()
            assertNotNull(e);
        }
    }

    // ---------------------------------------------------------------
    // setEntry
    // ---------------------------------------------------------------

    @Test
    public void testSetEntry() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1, 2, 3});
        v.setEntry(1, 99);
        assertEquals(99.0, v.getEntry(1), DELTA);
    }

    @Test
    public void testSetEntryOutOfBoundsThrows() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1, 2, 3});
        try {
            v.setEntry(10, 99);
            fail("คาดว่าควร throw exception เมื่อ index เกินขอบเขต");
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    // ---------------------------------------------------------------
    // setSubVector(RealVector) / setSubVector(double[])
    // ---------------------------------------------------------------

    @Test
    public void testSetSubVectorRealVector_castSuccessBranch() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1, 2, 3, 4, 5});
        RealVector sub = new ArrayRealVector(new double[]{10, 20});
        v.setSubVector(1, sub);
        assertArrayEquals(new double[]{1, 10, 20, 4, 5}, v.getData(), DELTA);
    }

    @Test
    public void testSetSubVectorRealVectorOutOfBoundsThrows() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1, 2, 3});
        RealVector sub = new ArrayRealVector(new double[]{10, 20, 30, 40});
        try {
            v.setSubVector(1, sub);
            fail("คาดว่าควร throw exception เมื่อ index+size เกินขอบเขต");
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testSetSubVectorDoubleArray() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1, 2, 3, 4, 5});
        v.setSubVector(2, new double[]{100, 200});
        assertArrayEquals(new double[]{1, 2, 100, 200, 5}, v.getData(), DELTA);
    }

    @Test
    public void testSetSubVectorDoubleArrayOutOfBoundsThrows() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1, 2, 3});
        try {
            v.setSubVector(2, new double[]{100, 200, 300});
            fail("คาดว่าควร throw exception เมื่อ index+size เกินขอบเขต");
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    // ---------------------------------------------------------------
    // set(int, ArrayRealVector) / set(double)
    // ---------------------------------------------------------------

    @Test
    public void testSetIndexArrayRealVector() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1, 2, 3, 4});
        ArrayRealVector sub = new ArrayRealVector(new double[]{50, 60});
        v.set(1, sub);
        assertArrayEquals(new double[]{1, 50, 60, 4}, v.getData(), DELTA);
    }

    @Test
    public void testSetDoubleFillsAll() {
        ArrayRealVector v = new ArrayRealVector(4);
        v.set(9.0);
        for (int i = 0; i < 4; i++) {
            assertEquals(9.0, v.getEntry(i), DELTA);
        }
    }

    // ---------------------------------------------------------------
    // toArray / toString
    // ---------------------------------------------------------------

    @Test
    public void testToArrayReturnsClone() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1, 2, 3});
        double[] a = v.toArray();
        a[0] = 999;
        assertEquals(1.0, v.getEntry(0), DELTA);
    }

    @Test
    public void testToStringNotNullOrEmpty() {
        // ไม่ทราบ format ที่แน่นอนของ RealVectorFormat จากซอร์สที่ให้มา
        // จึงตรวจสอบเพียงว่าไม่เป็น null/empty
        ArrayRealVector v = new ArrayRealVector(new double[]{1, 2, 3});
        String s = v.toString();
        assertNotNull(s);
        assertFalse(s.isEmpty());
    }

    // ---------------------------------------------------------------
    // isNaN / isInfinite
    // ---------------------------------------------------------------

    @Test
    public void testIsNaNTrue() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1, Double.NaN, 3});
        assertTrue(v.isNaN());
    }

    @Test
    public void testIsNaNFalse() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1, 2, 3});
        assertFalse(v.isNaN());
    }

    @Test
    public void testIsInfiniteTrue() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1, Double.POSITIVE_INFINITY, 3});
        assertTrue(v.isInfinite());
    }

    @Test
    public void testIsInfiniteFalseWhenNaNPresent() {
        // แม้มี Infinity ด้วย แต่เพราะมี NaN -> isNaN()=true -> isInfinite() return false ทันที
        ArrayRealVector v = new ArrayRealVector(new double[]{Double.NaN, Double.POSITIVE_INFINITY});
        assertFalse(v.isInfinite());
    }

    @Test
    public void testIsInfiniteFalseNormal() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1, 2, 3});
        assertFalse(v.isInfinite());
    }

    // ---------------------------------------------------------------
    // equals / hashCode
    // ---------------------------------------------------------------

    @Test
    public void testEqualsSameInstance() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1, 2, 3});
        assertTrue(v.equals(v));
    }

    @Test
    public void testEqualsNullReturnsFalse() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1, 2, 3});
        assertFalse(v.equals(null));
    }

    @Test
    public void testEqualsNonRealVectorTypeReturnsFalse() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1, 2, 3});
        assertFalse(v.equals("not a vector"));
    }

    @Test
    public void testEqualsDifferentDimensionReturnsFalse() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1, 2, 3});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{1, 2});
        assertFalse(v1.equals(v2));
    }

    @Test
    public void testEqualsBothNaNConsideredEqual() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{Double.NaN, 1});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{2, Double.NaN});
        assertTrue(v1.equals(v2)); // ทั้งคู่ isNaN() = true -> ถือว่าเท่ากัน
    }

    @Test
    public void testEqualsValuesDifferReturnsFalse() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1, 2, 3});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{1, 2, 999});
        assertFalse(v1.equals(v2));
    }

    @Test
    public void testEqualsSameValuesReturnsTrue() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1, 2, 3});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{1, 2, 3});
        assertTrue(v1.equals(v2));
    }

    @Test
    public void testHashCodeNaNIsConstant() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{Double.NaN, 1});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{2, Double.NaN});
        assertEquals(9, v1.hashCode());
        assertEquals(v1.hashCode(), v2.hashCode());
    }

    @Test
    public void testHashCodeConsistentForEqualObjects() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1, 2, 3});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{1, 2, 3});
        assertEquals(v1.hashCode(), v2.hashCode());
    }
}
```

## ตารางสรุป Branch/Condition ที่แต่ละเทสครอบคลุม

| กลุ่มเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| Constructors (`testDefaultConstructor` ... `testAppendConstructor_*`) | ทุก constructor overload, boundary `d.length < pos+size` (true/false), null check, empty array check, copyArray true/false (deep/shallow) |
| `testAddArrayRealVector`, `testAddRealVector_instanceOfArrayRealVector_ifBranch`, `testAddDoubleArray*` | `instanceof ArrayRealVector` → if-branch, dimension mismatch exception branch ของ `checkVectorDimensions` |
| `testSubtract*` | เช่นเดียวกับ add, dimension mismatch branch |
| `testMap*ToSelf` | for-loop ปกติ (iterate ทุก element) + `testMapEmptyVectorLoopZeroIterations` ครอบคลุม loop 0 รอบ, `testMapInvToSelfZeroYieldsInfinity` ครอบคลุม division-by-zero (ไม่ throw) |
| `testEbeMultiply*/testEbeDivide*` | if-branch (`instanceof ArrayRealVector`), dimension mismatch exception |
| `testGetData*/testGetDataRef*` | clone vs reference semantics |
| `testDotProduct*` | สอง overload (ArrayRealVector, double[]) |
| `testGetNorm*`, `testGetL1Norm`, `testGetLInfNorm_shouldBeMaxAbsoluteValue` | Loop accumulation ปกติ, boundary empty vector = 0, **ดักจับ defect ของ `getLInfNorm` (`max +=` ผิด ควรเป็น `max =`)** |
| `testGetDistance*/testGetL1Distance*/testGetLInfDistance*` | if-branch (instanceof), dimension mismatch exception |
| `testUnitVector*/testUnitize*` | norm==0 → throw `ArithmeticException` (if-branch) vs normal path (else) |
| `testProjection*` | overload ArrayRealVector/double[] |
| `testOuterProduct*` | nested for-loop (i,j), overload ArrayRealVector/double[] |
| `testGetEntry/testGetEntryOutOfBoundsThrowsArrayIndexException` | path ปกติ และ path ที่ไม่มี try/catch จริง (เผย ArrayIndexOutOfBoundsException) |
| `testAppend*` (instance methods) | try-cast สำเร็จ branch (catch(ClassCastException) ไม่ถูกทดสอบ — คอมเมนต์กำกับ) |
| `testGetSubVector*` | try-success branch, catch(IndexOutOfBoundsException) → checkIndex branch |
| `testSetEntry*` | try-success, catch branch |
| `testSetSubVector*` | cast-success branch (`set(index,(ArrayRealVector)v)`), catch(IndexOutOfBoundsException) branch, double[] overload + exception |
| `testSetIndexArrayRealVector/testSetDoubleFillsAll` | `set(int,ArrayRealVector)`, `set(double)` |
| `testToArray*/testToString*` | clone semantics, non-null/non-empty check |
| `testIsNaN*/testIsInfinite*` | loop early-return (NaN found), early return จาก `isNaN()` ภายใน `isInfinite()`, loop ครบไม่พบ |
| `testEquals*` | `this==other`, `null`/ไม่ใช่ RealVector, dimension mismatch, `rhs.isNaN()` true/false, ค่าต่างกัน, ค่าเท่ากัน |
| `testHashCode*` | `isNaN()` true (`return 9`) vs false (`MathUtils.hash`) |

**จุดที่ตั้งใจดักจับ fault:** `testGetLInfNorm_shouldBeMaxAbsoluteValue` และ `testGetLInfNormSingleElement` เขียนตามความหมายทางคณิตศาสตร์ที่ถูกต้องของ L∞-norm ซึ่งจะ **fail** กับโค้ดต้นฉบับที่มี fault (`max += Math.max(...)`) — ตรงตามจุดประสงค์ของ Defects4J bug Math-77b