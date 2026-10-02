# JUnit 4 Test Suite สำหรับ `OpenMapRealVector`

```java
package org.apache.commons.math.linear;

import static org.junit.Assert.*;

import org.junit.Test;

import org.apache.commons.math.exception.MathArithmeticException;
import org.apache.commons.math.exception.OutOfRangeException;          // NOTE: สมมติฐาน - checkIndex() ไม่ได้แสดงใน source ที่ให้มา
import org.apache.commons.math.exception.DimensionMismatchException;    // NOTE: สมมติฐาน - checkVectorDimensions() ไม่ได้แสดงใน source ที่ให้มา

/**
 * JUnit4 test suite for {@link OpenMapRealVector} (Defects4J Math-49b).
 *
 * หมายเหตุสำคัญ:
 * - checkIndex(int) และ checkVectorDimensions(int) เป็นเมธอดที่สืบทอดมาจาก
 *   AbstractRealVector ซึ่งไม่ได้แสดงใน source ที่ให้มา จึงสมมติ (ตามความรู้ทั่วไปของ
 *   Apache Commons Math 2.x) ว่า throw OutOfRangeException / DimensionMismatchException
 *   ตามลำดับ หากไม่ตรงกับ behavior จริง ให้ถือว่าเป็นข้อสมมติที่ต้องตรวจสอบเพิ่มเติม
 * - RealVector.Entry ถูกสมมติว่าเป็น nested class ที่เข้าถึงได้แบบ public
 */
public class OpenMapRealVectorTest {

    private static final double TOL = 1.0e-12;

    // ---------------------------------------------------------------
    // Constructors
    // ---------------------------------------------------------------

    @Test
    public void testDefaultConstructor() {
        OpenMapRealVector v = new OpenMapRealVector();
        assertEquals(0, v.getDimension());
    }

    @Test
    public void testDimensionConstructor() {
        OpenMapRealVector v = new OpenMapRealVector(5);
        assertEquals(5, v.getDimension());
        for (int i = 0; i < 5; i++) {
            assertEquals(0.0, v.getEntry(i), TOL);
        }
    }

    @Test
    public void testDimensionEpsilonConstructor() {
        OpenMapRealVector v = new OpenMapRealVector(3, 0.5);
        v.setEntry(0, 0.3); // below epsilon -> considered zero (isDefaultValue branch true)
        assertEquals(0.0, v.getEntry(0), TOL);
        v.setEntry(1, 0.6); // above epsilon -> stored (isDefaultValue branch false)
        assertEquals(0.6, v.getEntry(1), TOL);
    }

    @Test
    public void testExpectedSizeConstructor() {
        OpenMapRealVector v = new OpenMapRealVector(4, 2);
        assertEquals(4, v.getDimension());
    }

    @Test
    public void testExpectedSizeEpsilonConstructor() {
        OpenMapRealVector v = new OpenMapRealVector(4, 2, 0.1);
        assertEquals(4, v.getDimension());
    }

    @Test
    public void testDoubleArrayConstructor() {
        double[] data = {0.0, 1.0, 0.0, 2.0};
        OpenMapRealVector v = new OpenMapRealVector(data);
        assertEquals(4, v.getDimension());
        assertEquals(0.0, v.getEntry(0), TOL);
        assertEquals(1.0, v.getEntry(1), TOL);
        assertEquals(2.0, v.getEntry(3), TOL);
    }

    @Test
    public void testDoubleArrayEpsilonConstructor() {
        double[] data = {0.4, 1.0};
        OpenMapRealVector v = new OpenMapRealVector(data, 0.5);
        // 0.4 < epsilon(0.5) -> default value, not stored
        assertEquals(0.0, v.getEntry(0), TOL);
        assertEquals(1.0, v.getEntry(1), TOL);
    }

    @Test
    public void testDoubleObjectArrayConstructor() {
        Double[] data = {0.0, 3.0};
        OpenMapRealVector v = new OpenMapRealVector(data);
        assertEquals(2, v.getDimension());
        assertEquals(0.0, v.getEntry(0), TOL);
        assertEquals(3.0, v.getEntry(1), TOL);
    }

    @Test
    public void testDoubleObjectArrayEpsilonConstructor() {
        Double[] data = {0.2, 3.0};
        OpenMapRealVector v = new OpenMapRealVector(data, 0.5);
        assertEquals(0.0, v.getEntry(0), TOL); // below epsilon
        assertEquals(3.0, v.getEntry(1), TOL);
    }

    @Test
    public void testCopyConstructor() {
        OpenMapRealVector orig = new OpenMapRealVector(new double[]{1.0, 2.0});
        OpenMapRealVector copy = new OpenMapRealVector(orig);
        assertEquals(orig.getDimension(), copy.getDimension());
        assertEquals(orig.getEntry(0), copy.getEntry(0), TOL);
        assertEquals(orig.getEntry(1), copy.getEntry(1), TOL);
    }

    @Test
    public void testGenericCopyConstructor() {
        RealVector arv = new ArrayRealVector(new double[]{0.0, 5.0, 0.0});
        OpenMapRealVector v = new OpenMapRealVector(arv);
        assertEquals(3, v.getDimension());
        assertEquals(0.0, v.getEntry(0), TOL);
        assertEquals(5.0, v.getEntry(1), TOL);
    }

    // ---------------------------------------------------------------
    // add()
    // ---------------------------------------------------------------

    @Test
    public void testAddOpenMapRealVector_copyThisTrue() {
        // entries.size() > v.entries.size() -> copyThis = true
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        OpenMapRealVector b = new OpenMapRealVector(new double[]{0.0, 0.0, 5.0});
        OpenMapRealVector res = a.add(b);
        assertEquals(1.0, res.getEntry(0), TOL);
        assertEquals(2.0, res.getEntry(1), TOL);
        assertEquals(8.0, res.getEntry(2), TOL); // containsKey true branch
    }

    @Test
    public void testAddOpenMapRealVector_copyThisFalse_containsKeyFalse() {
        // entries.size() <= v.entries.size() -> copyThis = false
        OpenMapRealVector a = new OpenMapRealVector(new double[]{0.0, 0.0});
        OpenMapRealVector b = new OpenMapRealVector(new double[]{4.0, 5.0});
        OpenMapRealVector res = a.add(b);
        assertEquals(4.0, res.getEntry(0), TOL); // containsKey false branch
        assertEquals(5.0, res.getEntry(1), TOL);
    }

    @Test
    public void testAddRealVector_instanceOfTrue() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 1.0});
        RealVector b = new OpenMapRealVector(new double[]{2.0, 2.0});
        RealVector res = a.add(b);
        assertEquals(3.0, res.getEntry(0), TOL);
    }

    @Test
    public void testAddRealVector_instanceOfFalse() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 1.0});
        RealVector b = new ArrayRealVector(new double[]{2.0, 2.0});
        RealVector res = a.add(b);
        assertEquals(3.0, res.getEntry(0), TOL);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testAddDimensionMismatch() {
        OpenMapRealVector a = new OpenMapRealVector(2);
        RealVector b = new OpenMapRealVector(3);
        a.add(b);
    }

    // ---------------------------------------------------------------
    // append()
    // ---------------------------------------------------------------

    @Test
    public void testAppendOpenMapRealVector() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 2.0});
        OpenMapRealVector b = new OpenMapRealVector(new double[]{3.0, 4.0});
        OpenMapRealVector res = a.append(b);
        assertEquals(4, res.getDimension());
        assertEquals(1.0, res.getEntry(0), TOL);
        assertEquals(3.0, res.getEntry(2), TOL);
        assertEquals(4.0, res.getEntry(3), TOL);
    }

    @Test
    public void testAppendRealVector_instanceOfTrue() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0});
        RealVector b = new OpenMapRealVector(new double[]{2.0});
        OpenMapRealVector res = a.append(b);
        assertEquals(2, res.getDimension());
        assertEquals(2.0, res.getEntry(1), TOL);
    }

    @Test
    public void testAppendRealVector_instanceOfFalse() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0});
        RealVector b = new ArrayRealVector(new double[]{2.0, 3.0});
        OpenMapRealVector res = a.append(b);
        assertEquals(3, res.getDimension());
        assertEquals(2.0, res.getEntry(1), TOL);
        assertEquals(3.0, res.getEntry(2), TOL);
    }

    @Test
    public void testAppendDouble() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0});
        OpenMapRealVector res = a.append(5.0);
        assertEquals(2, res.getDimension());
        assertEquals(5.0, res.getEntry(1), TOL);
    }

    @Test
    public void testAppendDoubleArray() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0});
        OpenMapRealVector res = a.append(new double[]{2.0, 3.0});
        assertEquals(3, res.getDimension());
        assertEquals(2.0, res.getEntry(1), TOL);
        assertEquals(3.0, res.getEntry(2), TOL);
    }

    @Test
    public void testAppendDoubleArrayEmpty() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0});
        OpenMapRealVector res = a.append(new double[]{}); // loop zero iterations
        assertEquals(1, res.getDimension());
    }

    // ---------------------------------------------------------------
    // copy()
    // ---------------------------------------------------------------

    @Test
    public void testCopy() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 2.0});
        OpenMapRealVector b = a.copy();
        assertNotSame(a, b);
        assertEquals(a.getEntry(0), b.getEntry(0), TOL);
    }

    // ---------------------------------------------------------------
    // dotProduct()
    // ---------------------------------------------------------------

    @Test
    public void testDotProductOpenMapRealVector_thisSmaller() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{0.0, 2.0}); // 1 entry
        OpenMapRealVector b = new OpenMapRealVector(new double[]{1.0, 3.0}); // 2 entries
        double d = a.dotProduct(b);
        assertEquals(6.0, d, TOL);
    }

    @Test
    public void testDotProductOpenMapRealVector_vSmaller() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 2.0});
        OpenMapRealVector b = new OpenMapRealVector(new double[]{0.0, 3.0});
        double d = a.dotProduct(b);
        assertEquals(6.0, d, TOL);
    }

    @Test
    public void testDotProductRealVector_instanceOfTrue() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 2.0});
        RealVector b = new OpenMapRealVector(new double[]{3.0, 4.0});
        assertEquals(11.0, a.dotProduct(b), TOL);
    }

    @Test
    public void testDotProductRealVector_instanceOfFalse() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 2.0});
        RealVector b = new ArrayRealVector(new double[]{3.0, 4.0});
        assertEquals(11.0, a.dotProduct(b), TOL);
    }

    // ---------------------------------------------------------------
    // ebeDivide / ebeMultiply
    // ---------------------------------------------------------------

    @Test
    public void testEbeDivideRealVector() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{4.0, 0.0});
        RealVector b = new OpenMapRealVector(new double[]{2.0, 5.0});
        OpenMapRealVector res = a.ebeDivide(b);
        assertEquals(2.0, res.getEntry(0), TOL);
    }

    @Test
    public void testEbeDivideDoubleArray() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{4.0, 0.0});
        OpenMapRealVector res = a.ebeDivide(new double[]{2.0, 5.0});
        assertEquals(2.0, res.getEntry(0), TOL);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testEbeDivideDoubleArrayMismatch() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{4.0, 0.0});
        a.ebeDivide(new double[]{1.0});
    }

    @Test
    public void testEbeMultiplyRealVector() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{4.0, 0.0});
        RealVector b = new OpenMapRealVector(new double[]{2.0, 5.0});
        OpenMapRealVector res = a.ebeMultiply(b);
        assertEquals(8.0, res.getEntry(0), TOL);
    }

    @Test
    public void testEbeMultiplyDoubleArray() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{4.0, 0.0});
        OpenMapRealVector res = a.ebeMultiply(new double[]{2.0, 5.0});
        assertEquals(8.0, res.getEntry(0), TOL);
    }

    // ---------------------------------------------------------------
    // getSubVector()
    // ---------------------------------------------------------------

    @Test
    public void testGetSubVector() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0, 4.0});
        OpenMapRealVector sub = a.getSubVector(1, 2);
        assertEquals(2, sub.getDimension());
        assertEquals(2.0, sub.getEntry(0), TOL);
        assertEquals(3.0, sub.getEntry(1), TOL);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetSubVectorOutOfRange() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 2.0});
        a.getSubVector(1, 5); // index + n -1 out of bound
    }

    // ---------------------------------------------------------------
    // getData / getDimension
    // ---------------------------------------------------------------

    @Test
    public void testGetData() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{0.0, 7.0});
        double[] data = a.getData();
        assertArrayEquals(new double[]{0.0, 7.0}, data, TOL);
    }

    @Test
    public void testGetDimension() {
        assertEquals(10, new OpenMapRealVector(10).getDimension());
    }

    // ---------------------------------------------------------------
    // getDistance()
    // ---------------------------------------------------------------

    @Test
    public void testGetDistanceOpenMapRealVector() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 0.0});
        OpenMapRealVector b = new OpenMapRealVector(new double[]{0.0, 1.0});
        double d = a.getDistance(b);
        assertEquals(Math.sqrt(2.0), d, TOL);
    }

    @Test
    public void testGetDistanceRealVector_instanceOfTrue() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 0.0});
        RealVector b = new OpenMapRealVector(new double[]{0.0, 1.0});
        assertEquals(Math.sqrt(2.0), a.getDistance(b), TOL);
    }

    @Test
    public void testGetDistanceRealVector_instanceOfFalse() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 0.0});
        RealVector b = new ArrayRealVector(new double[]{0.0, 1.0});
        assertEquals(Math.sqrt(2.0), a.getDistance(b), TOL);
    }

    @Test
    public void testGetDistanceDoubleArray() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 0.0});
        assertEquals(Math.sqrt(2.0), a.getDistance(new double[]{0.0, 1.0}), TOL);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testGetDistanceDimensionMismatch() {
        OpenMapRealVector a = new OpenMapRealVector(2);
        RealVector b = new OpenMapRealVector(3);
        a.getDistance(b);
    }

    // ---------------------------------------------------------------
    // getEntry()
    // ---------------------------------------------------------------

    @Test
    public void testGetEntry() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{9.0});
        assertEquals(9.0, a.getEntry(0), TOL);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetEntryOutOfRangeNegative() {
        new OpenMapRealVector(3).getEntry(-1);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetEntryOutOfRangeTooLarge() {
        new OpenMapRealVector(3).getEntry(3);
    }

    // ---------------------------------------------------------------
    // getL1Distance()
    // ---------------------------------------------------------------

    @Test
    public void testGetL1DistanceOpenMapRealVector() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 0.0});
        OpenMapRealVector b = new OpenMapRealVector(new double[]{0.0, 2.0});
        assertEquals(3.0, a.getL1Distance(b), TOL);
    }

    @Test
    public void testGetL1DistanceRealVector_instanceOfTrue() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 0.0});
        RealVector b = new OpenMapRealVector(new double[]{0.0, 2.0});
        assertEquals(3.0, a.getL1Distance(b), TOL);
    }

    @Test
    public void testGetL1DistanceRealVector_instanceOfFalse() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 0.0});
        RealVector b = new ArrayRealVector(new double[]{0.0, 2.0});
        assertEquals(3.0, a.getL1Distance(b), TOL);
    }

    @Test
    public void testGetL1DistanceDoubleArray() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 0.0});
        assertEquals(3.0, a.getL1Distance(new double[]{0.0, 2.0}), TOL);
    }

    // ---------------------------------------------------------------
    // getLInfDistance()
    // ---------------------------------------------------------------

    @Test
    public void testGetLInfDistanceRealVector_deltaGreaterBranch() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{5.0, 0.0});
        RealVector b = new OpenMapRealVector(new double[]{0.0, 1.0}); // other loop: value>max branch true
        double d = a.getLInfDistance(b);
        assertEquals(5.0, d, TOL);
    }

    @Test
    public void testGetLInfDistanceRealVector_instanceOfFalse() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 0.0});
        RealVector b = new ArrayRealVector(new double[]{0.0, 2.0});
        assertEquals(2.0, a.getLInfDistance(b), TOL);
    }

    @Test
    public void testGetLInfDistanceDoubleArray_deltaBranches() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 5.0});
        double d = a.getLInfDistance(new double[]{1.0, 1.0}); // delta=0 then delta=4>max
        assertEquals(4.0, d, TOL);
    }

    // ---------------------------------------------------------------
    // isInfinite() / isNaN()
    // ---------------------------------------------------------------

    @Test
    public void testIsInfiniteFalseOnZeroVector() {
        OpenMapRealVector a = new OpenMapRealVector(3);
        assertFalse(a.isInfinite());
    }

    @Test
    public void testIsInfiniteTrue() {
        OpenMapRealVector a = new OpenMapRealVector(2);
        a.setEntry(0, Double.POSITIVE_INFINITY);
        assertTrue(a.isInfinite());
    }

    @Test
    public void testIsInfiniteFalseWhenNaNPresent() {
        // NaN causes isInfinite() to immediately return false (per source)
        OpenMapRealVector a = new OpenMapRealVector(2);
        a.setEntry(0, Double.NaN);
        a.setEntry(1, Double.POSITIVE_INFINITY);
        assertFalse(a.isInfinite());
    }

    @Test
    public void testIsNaNFalse() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 2.0});
        assertFalse(a.isNaN());
    }

    @Test
    public void testIsNaNTrue() {
        OpenMapRealVector a = new OpenMapRealVector(2);
        a.setEntry(1, Double.NaN);
        assertTrue(a.isNaN());
    }

    // ---------------------------------------------------------------
    // mapAdd / mapAddToSelf
    // ---------------------------------------------------------------

    @Test
    public void testMapAdd() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 2.0});
        OpenMapRealVector res = a.mapAdd(3.0);
        assertEquals(4.0, res.getEntry(0), TOL);
        assertEquals(1.0, a.getEntry(0), TOL); // original unmodified
    }

    @Test
    public void testMapAddToSelf() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 2.0});
        OpenMapRealVector res = a.mapAddToSelf(3.0);
        assertSame(a, res);
        assertEquals(4.0, a.getEntry(0), TOL);
    }

    // ---------------------------------------------------------------
    // outerProduct()
    // ---------------------------------------------------------------

    @Test
    public void testOuterProduct() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{2.0, 0.0});
        RealMatrix m = a.outerProduct(new double[]{3.0, 4.0});
        assertEquals(6.0, m.getEntry(0, 0), TOL);
        assertEquals(8.0, m.getEntry(0, 1), TOL);
        assertEquals(0.0, m.getEntry(1, 0), TOL);
    }

    // ---------------------------------------------------------------
    // projection()
    // ---------------------------------------------------------------

    @Test
    public void testProjectionRealVector() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{3.0, 0.0});
        RealVector b = new OpenMapRealVector(new double[]{1.0, 0.0});
        RealVector res = a.projection(b);
        assertEquals(3.0, res.getEntry(0), TOL);
    }

    @Test
    public void testProjectionDoubleArray() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{3.0, 0.0});
        OpenMapRealVector res = a.projection(new double[]{1.0, 0.0});
        assertEquals(3.0, res.getEntry(0), TOL);
    }

    // ---------------------------------------------------------------
    // setEntry()
    // ---------------------------------------------------------------

    @Test
    public void testSetEntry_nonDefaultValue() {
        OpenMapRealVector a = new OpenMapRealVector(2);
        a.setEntry(0, 5.0);
        assertEquals(5.0, a.getEntry(0), TOL);
    }

    @Test
    public void testSetEntry_defaultValue_notContained() {
        OpenMapRealVector a = new OpenMapRealVector(2);
        a.setEntry(0, 0.0); // isDefaultValue true, containsKey false -> no-op branch
        assertEquals(0.0, a.getEntry(0), TOL);
    }

    @Test
    public void testSetEntry_defaultValue_contained_removed() {
        OpenMapRealVector a = new OpenMapRealVector(2);
        a.setEntry(0, 5.0);       // store nonzero
        a.setEntry(0, 0.0);       // now set to default -> containsKey true -> remove branch
        assertEquals(0.0, a.getEntry(0), TOL);
    }

    @Test(expected = OutOfRangeException.class)
    public void testSetEntryOutOfRange() {
        new OpenMapRealVector(2).setEntry(5, 1.0);
    }

    // ---------------------------------------------------------------
    // setSubVector()
    // ---------------------------------------------------------------

    @Test
    public void testSetSubVectorRealVector() {
        OpenMapRealVector a = new OpenMapRealVector(4);
        RealVector sub = new OpenMapRealVector(new double[]{7.0, 8.0});
        a.setSubVector(1, sub);
        assertEquals(7.0, a.getEntry(1), TOL);
        assertEquals(8.0, a.getEntry(2), TOL);
    }

    @Test
    public void testSetSubVectorDoubleArray() {
        OpenMapRealVector a = new OpenMapRealVector(4);
        a.setSubVector(1, new double[]{7.0, 8.0});
        assertEquals(7.0, a.getEntry(1), TOL);
        assertEquals(8.0, a.getEntry(2), TOL);
    }

    @Test(expected = OutOfRangeException.class)
    public void testSetSubVectorDoubleArrayOutOfRange() {
        OpenMapRealVector a = new OpenMapRealVector(2);
        a.setSubVector(1, new double[]{1.0, 2.0});
    }

    // ---------------------------------------------------------------
    // set()
    // ---------------------------------------------------------------

    @Test
    public void testSet() {
        OpenMapRealVector a = new OpenMapRealVector(3);
        a.set(9.0);
        for (int i = 0; i < 3; i++) {
            assertEquals(9.0, a.getEntry(i), TOL);
        }
    }

    @Test
    public void testSetZeroDimension() {
        OpenMapRealVector a = new OpenMapRealVector(0);
        a.set(9.0); // loop executes 0 times
        assertEquals(0, a.getDimension());
    }

    // ---------------------------------------------------------------
    // subtract()
    // ---------------------------------------------------------------

    @Test
    public void testSubtractOpenMapRealVector_containsKeyTrue() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{5.0, 0.0});
        OpenMapRealVector b = new OpenMapRealVector(new double[]{2.0, 3.0});
        OpenMapRealVector res = a.subtract(b);
        assertEquals(3.0, res.getEntry(0), TOL);   // containsKey true
        assertEquals(-3.0, res.getEntry(1), TOL);  // containsKey false
    }

    @Test
    public void testSubtractRealVector_instanceOfTrue() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{5.0, 0.0});
        RealVector b = new OpenMapRealVector(new double[]{2.0, 3.0});
        OpenMapRealVector res = a.subtract(b);
        assertEquals(3.0, res.getEntry(0), TOL);
    }

    @Test
    public void testSubtractRealVector_instanceOfFalse() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{5.0, 0.0});
        RealVector b = new ArrayRealVector(new double[]{2.0, 3.0});
        OpenMapRealVector res = a.subtract(b);
        assertEquals(3.0, res.getEntry(0), TOL);
        assertEquals(-3.0, res.getEntry(1), TOL);
    }

    @Test
    public void testSubtractDoubleArray_containsKeyBranches() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{5.0, 0.0});
        OpenMapRealVector res = a.subtract(new double[]{2.0, 3.0});
        assertEquals(3.0, res.getEntry(0), TOL);   // containsKey true
        assertEquals(-3.0, res.getEntry(1), TOL);  // containsKey false
    }

    // ---------------------------------------------------------------
    // unitVector() / unitize()
    // ---------------------------------------------------------------

    @Test
    public void testUnitVector() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{3.0, 4.0});
        OpenMapRealVector unit = a.unitVector();
        assertEquals(0.6, unit.getEntry(0), TOL);
        assertEquals(0.8, unit.getEntry(1), TOL);
        // original unaffected
        assertEquals(3.0, a.getEntry(0), TOL);
    }

    @Test
    public void testUnitize() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{3.0, 4.0});
        a.unitize();
        assertEquals(0.6, a.getEntry(0), TOL);
        assertEquals(0.8, a.getEntry(1), TOL);
    }

    @Test(expected = MathArithmeticException.class)
    public void testUnitizeZeroNormThrows() {
        OpenMapRealVector a = new OpenMapRealVector(3); // all zeros -> norm == 0
        a.unitize();
    }

    // ---------------------------------------------------------------
    // toArray()
    // ---------------------------------------------------------------

    @Test
    public void testToArray() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 0.0, 2.0});
        assertArrayEquals(new double[]{1.0, 0.0, 2.0}, a.toArray(), TOL);
    }

    // ---------------------------------------------------------------
    // hashCode() / equals()
    // ---------------------------------------------------------------

    @Test
    public void testHashCodeConsistency() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 2.0});
        OpenMapRealVector b = new OpenMapRealVector(new double[]{1.0, 2.0});
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testEqualsSameInstance() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0});
        assertTrue(a.equals(a));
    }

    @Test
    public void testEqualsNotInstanceOf() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0});
        assertFalse(a.equals("not a vector"));
    }

    @Test
    public void testEqualsNull() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0});
        assertFalse(a.equals(null));
    }

    @Test
    public void testEqualsDifferentDimension() {
        OpenMapRealVector a = new OpenMapRealVector(2);
        OpenMapRealVector b = new OpenMapRealVector(3);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsDifferentEpsilon() {
        OpenMapRealVector a = new OpenMapRealVector(2, 0.1);
        OpenMapRealVector b = new OpenMapRealVector(2, 0.2);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsDifferentEntries() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 2.0});
        OpenMapRealVector b = new OpenMapRealVector(new double[]{1.0, 3.0});
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsTrue() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 2.0});
        OpenMapRealVector b = new OpenMapRealVector(new double[]{1.0, 2.0});
        assertTrue(a.equals(b));
    }

    // ---------------------------------------------------------------
    // getSparsity()
    // ---------------------------------------------------------------

    @Test
    public void testGetSparsity() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 0.0, 0.0, 0.0});
        assertEquals(0.25, a.getSparsity(), TOL);
    }

    // ---------------------------------------------------------------
    // sparseIterator()
    // ---------------------------------------------------------------

    @Test
    public void testSparseIteratorHasNextNext() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{0.0, 5.0});
        java.util.Iterator<RealVector.Entry> it = a.sparseIterator();
        assertTrue(it.hasNext());
        RealVector.Entry e = it.next();
        assertEquals(1, e.getIndex());
        assertEquals(5.0, e.getValue(), TOL);
        assertFalse(it.hasNext());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSparseIteratorRemoveThrows() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0});
        java.util.Iterator<RealVector.Entry> it = a.sparseIterator();
        it.remove();
    }

    @Test
    public void testSparseIteratorSetValue() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{0.0, 5.0});
        java.util.Iterator<RealVector.Entry> it = a.sparseIterator();
        RealVector.Entry e = it.next();
        e.setValue(9.0);
        assertEquals(9.0, a.getEntry(1), TOL);
    }
}
```

## สรุปตารางความครอบคลุม (Coverage Mapping)

| เมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testDefaultConstructor`, `testDimensionConstructor`, ... | constructor overloads ต่าง ๆ, ตรวจ `virtualSize`, zero-fill |
| `testDimensionEpsilonConstructor` | `isDefaultValue` true/false ผ่าน `setEntry` |
| `testDoubleArrayConstructor/EpsilonConstructor` | loop + `isDefaultValue` branch ใน constructor array |
| `testDoubleObjectArrayConstructor/EpsilonConstructor` | loop + `isDefaultValue` บน `Double[]` |
| `testGenericCopyConstructor` | loop + `isDefaultValue` บน generic `RealVector` |
| `testAddOpenMapRealVector_copyThisTrue/False` | `copyThis` true/false, `containsKey` true/false ใน `add(OpenMapRealVector)` |
| `testAddRealVector_instanceOfTrue/False` | instanceof branch ใน `add(RealVector)` |
| `testAddDimensionMismatch` | `checkVectorDimensions` exception |
| `testAppend*` | `append(OpenMapRealVector)`, instanceof branch ใน `append(RealVector)`, `append(double)`, `append(double[])`, empty array (loop 0 ครั้ง) |
| `testCopy` | `copy()` |
| `testDotProductOpenMapRealVector_thisSmaller/vSmaller` | `thisIsSmaller` true/false |
| `testDotProductRealVector_instanceOfTrue/False` | instanceof branch |
| `testEbeDivide*/testEbeMultiply*` | `ebeDivide/Multiply(RealVector/double[])`, dimension mismatch |
| `testGetSubVector`, `testGetSubVectorOutOfRange` | key range check (`key>=index && key<end`), `checkIndex` exception |
| `testGetData`, `testGetDimension` | basic accessor |
| `testGetDistance*` | สองลูป (`containsKey` true/false), instanceof branch, dimension mismatch |
| `testGetEntry*` | `checkIndex` boundary (negative, ≥size) |
| `testGetL1Distance*` | สองลูป + `containsKey` branch, instanceof branch |
| `testGetLInfDistance*` | `delta>max` true/false ทั้งสองลูป, instanceof branch |
| `testIsInfinite*` | NaN-return-false branch, infiniteFound true/false |
| `testIsNaN*` | true/false branch |
| `testMapAdd`, `testMapAddToSelf` | loop ปรับค่า, ตรวจ immutability vs mutability |
| `testOuterProduct` | nested loop คำนวณ matrix |
| `testProjection*` | `projection(RealVector/double[])` |
| `testSetEntry_*` | `isDefaultValue` true/false, `containsKey` true/false (remove branch), out-of-range |
| `testSetSubVector*` | `setSubVector(RealVector/double[])`, out-of-range |
| `testSet`, `testSetZeroDimension` | loop ปกติ, loop 0 ครั้ง (`virtualSize=0`) |
| `testSubtract*` | `containsKey` true/false ทั้ง `OpenMapRealVector` และ `double[]`, instanceof branch |
| `testUnitVector`, `testUnitize`, `testUnitizeZeroNormThrows` | normal case, `isDefaultValue(norm)` throw branch |
| `testToArray` | เรียกผ่าน `getData()` |
| `testHashCodeConsistency` | hashCode loop |
| `testEquals*` | ทุก early-return branch: same instance, not instanceof, null, dimension ต่าง, epsilon ต่าง, entries ต่าง, true case |
| `testGetSparsity` | คำนวณสัดส่วน non-zero |
| `testSparseIterator*` | `hasNext/next`, `remove` throw, `OpenMapEntry.setValue/getValue/getIndex` |

**หมายเหตุ:** เนื่องจาก `checkIndex` และ `checkVectorDimensions` ไม่ได้แสดงอยู่ใน source ที่ให้มา (สืบทอดจาก `AbstractRealVector`) การใช้ `OutOfRangeException` และ `DimensionMismatchException` เป็นข้อสมมติตามพฤติกรรมทั่วไปของ Apache Commons Math 2.x หากพฤติกรรมจริงต่างไป ต้องปรับ `expected =` ให้ตรงกับ exception จริง