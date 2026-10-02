package org.apache.commons.math.linear;

import static org.junit.Assert.*;
import org.junit.Test;

public class OpenMapRealVectorTest {

    private static final double EPS = 1e-9;

    // ===================== Constructors =====================

    @Test
    public void testDefaultConstructor() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector();
        assertEquals(0, v.getDimension());
    }

    @Test
    public void testDimensionConstructor() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(4);
        assertEquals(4, v.getDimension());
        for (int i = 0; i < 4; i++) {
            assertEquals(0.0, v.getEntry(i), EPS);
        }
    }

    @Test
    public void testDimensionEpsilonConstructor_boundary() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(3, 0.5);
        v.setEntry(0, 0.4); // |0.4| < 0.5 -> default, not stored
        assertEquals(0.0, v.getEntry(0), EPS);
        v.setEntry(1, 0.6); // |0.6| >= 0.5 -> stored
        assertEquals(0.6, v.getEntry(1), EPS);
    }

    @Test
    public void testDimensionExpectedSizeConstructor() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(10, 2);
        assertEquals(10, v.getDimension());
    }

    @Test
    public void testDimensionExpectedSizeEpsilonConstructor() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(10, 2, 0.5);
        assertEquals(10, v.getDimension());
        v.setEntry(0, 0.1);
        assertEquals(0.0, v.getEntry(0), EPS); // below epsilon -> not stored
    }

    @Test
    public void testDoubleArrayConstructor() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{0, 5, 0, 7});
        assertEquals(4, v.getDimension());
        assertEquals(5.0, v.getEntry(1), EPS);
        assertEquals(0.0, v.getEntry(0), EPS);
    }

    @Test
    public void testDoubleArrayConstructorEmpty() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{});
        assertEquals(0, v.getDimension());
    }

    @Test(expected = NullPointerException.class)
    public void testDoubleArrayConstructorNull() throws Exception {
        double[] nullArray = null;
        new OpenMapRealVector(nullArray);
    }

    @Test
    public void testDoubleArrayEpsilonConstructor_boundary() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{0.4, 0.6}, 0.5);
        assertEquals(0.0, v.getEntry(0), EPS); // < epsilon -> not stored
        assertEquals(0.6, v.getEntry(1), EPS); // >= epsilon -> stored
    }

    @Test
    public void testDoubleObjectArrayConstructor() throws Exception {
        Double[] data = {0.0, 5.0, 0.0};
        OpenMapRealVector v = new OpenMapRealVector(data);
        assertEquals(3, v.getDimension());
        assertEquals(5.0, v.getEntry(1), EPS);
    }

    @Test
    public void testDoubleObjectArrayEpsilonConstructor() throws Exception {
        Double[] data = {0.4, 0.6};
        OpenMapRealVector v = new OpenMapRealVector(data, 0.5);
        assertEquals(0.0, v.getEntry(0), EPS);
        assertEquals(0.6, v.getEntry(1), EPS);
    }

    @Test
    public void testCopyConstructor() throws Exception {
        OpenMapRealVector original = new OpenMapRealVector(new double[]{1, 2, 3});
        OpenMapRealVector copyV = new OpenMapRealVector(original);
        assertNotSame(original, copyV);
        assertTrue(original.equals(copyV));
    }

    @Test
    public void testGenericRealVectorConstructor() throws Exception {
        ArrayRealVector src = new ArrayRealVector(new double[]{0, 3, 0, 4});
        OpenMapRealVector v = new OpenMapRealVector((RealVector) src);
        assertEquals(4, v.getDimension());
        assertEquals(3.0, v.getEntry(1), EPS);
        assertEquals(0.0, v.getEntry(0), EPS);
    }

    // ===================== isDefaultValue (via setEntry boundary) =====================

    @Test
    public void testIsDefaultValue_exactEpsilon_notDefault() throws Exception {
        double epsilon = 0.1;
        OpenMapRealVector v = new OpenMapRealVector(1, epsilon);
        v.setEntry(0, epsilon); // abs(epsilon) < epsilon -> false -> stored
        assertEquals(epsilon, v.getEntry(0), EPS);
    }

    @Test
    public void testIsDefaultValue_justBelowEpsilon_isDefault() throws Exception {
        double epsilon = 0.1;
        OpenMapRealVector v = new OpenMapRealVector(1, epsilon);
        v.setEntry(0, epsilon - 1e-9); // < epsilon -> default -> not stored
        assertEquals(0.0, v.getEntry(0), EPS);
    }

    // ===================== add =====================

    @Test
    public void testAddOpenMapRealVector_copyThisTrue() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1, 2, 3}); // 3 entries
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{0, 0, 4}); // 1 entry
        OpenMapRealVector res = v1.add(v2); // copyThis = true (v1 bigger)
        assertEquals(1.0, res.getEntry(0), EPS);
        assertEquals(2.0, res.getEntry(1), EPS);
        assertEquals(7.0, res.getEntry(2), EPS);
    }

    @Test
    public void testAddOpenMapRealVector_copyThisFalse() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{0, 0, 4}); // 1 entry
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{1, 2, 3}); // 3 entries
        OpenMapRealVector res = v1.add(v2); // copyThis = false
        assertEquals(1.0, res.getEntry(0), EPS);
        assertEquals(2.0, res.getEntry(1), EPS);
        assertEquals(7.0, res.getEntry(2), EPS);
    }

    @Test
    public void testAddOpenMapRealVector_containsKeyBothBranches() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{5, 0, 0}); // key0
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{1, 2, 0}); // key0,1
        OpenMapRealVector res = v1.add(v2);
        assertEquals(6.0, res.getEntry(0), EPS); // containsKey true
        assertEquals(2.0, res.getEntry(1), EPS); // containsKey false
    }

    @Test
    public void testAddRealVector_nonOpenMap() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1, 2, 3});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{1, 1, 1});
        RealVector res = v1.add((RealVector) v2);
        assertEquals(2.0, res.getEntry(0), EPS);
        assertEquals(3.0, res.getEntry(1), EPS);
        assertEquals(4.0, res.getEntry(2), EPS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_dimensionMismatch() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(3);
        OpenMapRealVector v2 = new OpenMapRealVector(4);
        v1.add(v2);
    }

    @Test(expected = NullPointerException.class)
    public void testAdd_nullVector() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(3);
        v1.add((RealVector) null);
    }

    // ===================== append =====================

    @Test
    public void testAppendOpenMapRealVector() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1, 2});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{3, 4, 5});
        OpenMapRealVector res = v1.append(v2);
        assertEquals(5, res.getDimension());
        assertEquals(1.0, res.getEntry(0), EPS);
        assertEquals(5.0, res.getEntry(4), EPS);
    }

    @Test
    public void testAppendRealVector_nonOpenMap() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1, 2});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{3, 4});
        OpenMapRealVector res = v1.append((RealVector) v2);
        assertEquals(4, res.getDimension());
        assertEquals(3.0, res.getEntry(2), EPS);
        assertEquals(4.0, res.getEntry(3), EPS);
    }

    @Test
    public void testAppendDouble() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1, 2});
        OpenMapRealVector res = v1.append(9.0);
        assertEquals(3, res.getDimension());
        assertEquals(9.0, res.getEntry(2), EPS);
    }

    @Test
    public void testAppendDoubleArray() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1, 2});
        OpenMapRealVector res = v1.append(new double[]{7, 8});
        assertEquals(4, res.getDimension());
        assertEquals(7.0, res.getEntry(2), EPS);
        assertEquals(8.0, res.getEntry(3), EPS);
    }

    // ===================== copy =====================

    @Test
    public void testCopy() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1, 2, 3});
        OpenMapRealVector c = v.copy();
        assertNotSame(v, c);
        assertTrue(v.equals(c));
    }

    // ===================== dotProduct =====================

    @Test
    public void testDotProduct_thisSmaller() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1, 0, 0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{2, 3, 4});
        assertEquals(2.0, v1.dotProduct(v2), EPS);
    }

    @Test
    public void testDotProduct_vSmaller() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1, 2, 3});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{0, 0, 4});
        assertEquals(12.0, v1.dotProduct(v2), EPS);
    }

    @Test
    public void testDotProduct_nonOpenMap() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1, 2, 3});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{1, 1, 1});
        assertEquals(6.0, v1.dotProduct((RealVector) v2), EPS);
    }

    // ===================== ebeDivide / ebeMultiply =====================

    @Test
    public void testEbeDivide_RealVector() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{6, 8, 0});
        ArrayRealVector d = new ArrayRealVector(new double[]{2, 4, 5});
        OpenMapRealVector res = v.ebeDivide((RealVector) d);
        assertEquals(3.0, res.getEntry(0), EPS);
        assertEquals(2.0, res.getEntry(1), EPS);
    }

    @Test
    public void testEbeDivide_doubleArray() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{6, 8, 0});
        double[] d = {2, 4, 5};
        OpenMapRealVector res = v.ebeDivide(d);
        assertEquals(3.0, res.getEntry(0), EPS);
        assertEquals(2.0, res.getEntry(1), EPS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEbeDivide_dimensionMismatch() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.ebeDivide(new double[]{1, 2});
    }

    @Test
    public void testEbeMultiply_RealVector() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{6, 8, 0});
        ArrayRealVector d = new ArrayRealVector(new double[]{2, 4, 5});
        OpenMapRealVector res = v.ebeMultiply((RealVector) d);
        assertEquals(12.0, res.getEntry(0), EPS);
        assertEquals(32.0, res.getEntry(1), EPS);
    }

    @Test
    public void testEbeMultiply_doubleArray() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{6, 8, 0});
        double[] d = {2, 4, 5};
        OpenMapRealVector res = v.ebeMultiply(d);
        assertEquals(12.0, res.getEntry(0), EPS);
        assertEquals(32.0, res.getEntry(1), EPS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEbeMultiply_dimensionMismatch() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.ebeMultiply(new double[]{1, 2});
    }

    // ===================== getSubVector =====================

    @Test
    public void testGetSubVector_valid_bothBranches() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{5, 1, 2, 3, 9});
        OpenMapRealVector sub = v.getSubVector(1, 3); // keys 0 & 4 excluded, 1..3 included
        assertEquals(3, sub.getDimension());
        assertEquals(1.0, sub.getEntry(0), EPS);
        assertEquals(2.0, sub.getEntry(1), EPS);
        assertEquals(3.0, sub.getEntry(2), EPS);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubVector_invalidIndex() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(5);
        v.getSubVector(4, 3); // index+n-1 = 6 out of range
    }

    // ===================== getData / getDimension =====================

    @Test
    public void testGetData() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{0, 5, 0, 7});
        assertArrayEquals(new double[]{0, 5, 0, 7}, v.getData(), EPS);
    }

    @Test
    public void testGetDimension() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(7);
        assertEquals(7, v.getDimension());
    }

    // ===================== getDistance =====================

    @Test
    public void testGetDistance_OpenMapRealVector_bothContainsKeyBranches() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1, 0, 3});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{0, 2, 3});
        double dist = v1.getDistance(v2);
        assertEquals(Math.sqrt(5), dist, EPS);
    }

    @Test
    public void testGetDistance_nonOpenMap() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1, 0, 3});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{0, 2, 3});
        assertEquals(Math.sqrt(5), v1.getDistance((RealVector) v2), EPS);
    }

    @Test
    public void testGetDistance_doubleArray() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1, 0, 3});
        double[] v2 = {0, 2, 3};
        assertEquals(Math.sqrt(5), v1.getDistance(v2), EPS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDistance_dimensionMismatch() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(3);
        v1.getDistance(new double[]{1, 2});
    }

    // ===================== getEntry =====================

    @Test
    public void testGetEntry_valid() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{0, 5, 0});
        assertEquals(5.0, v.getEntry(1), EPS);
        assertEquals(0.0, v.getEntry(0), EPS);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetEntry_negativeIndex() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.getEntry(-1);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetEntry_tooLargeIndex() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.getEntry(3);
    }

    // ===================== getL1Distance =====================

    @Test
    public void testGetL1Distance_OpenMapRealVector_bothBranches() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1, 0, 3});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{0, 2, 3});
        assertEquals(3.0, v1.getL1Distance(v2), EPS);
    }

    @Test
    public void testGetL1Distance_nonOpenMap() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1, 0, 3});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{0, 2, 3});
        assertEquals(3.0, v1.getL1Distance((RealVector) v2), EPS);
    }

    @Test
    public void testGetL1Distance_doubleArray() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1, 0, 3});
        double[] v2 = {0, 2, 3};
        assertEquals(3.0, v1.getL1Distance(v2), EPS);
    }

    // ===================== getLInfNorm (potential fault detection) =====================

    @Test
    public void testGetLInfNorm_shouldBeMaxAbsoluteValue() throws Exception {
        // ตามนิยามคณิตศาสตร์ของ Infinity norm คือ max(|x_i|)
        // โค้ดต้นฉบับ (getLInfNorm) รวมค่า (sum) ไม่ได้หาค่าสูงสุดของค่าสัมบูรณ์
        // -> เทสนี้ถูกออกแบบมาเพื่อดักจับ fault ถ้ามี ตามชื่อ/สัญญาของเมธอด
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, -5.0, 3.0});
        assertEquals(5.0, v.getLInfNorm(), EPS);
    }

    // ===================== getLInfDistance =====================

    @Test
    public void testGetLInfDistance_OpenMapRealVector_allBranches() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{0, 7, 7, 0, 0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{0, 7, 3, 9, 2});
        // loop1: key1 delta=0(false-branch), key2 delta=4(true-branch)->max=4
        // loop2: key3 !contains true, 9>4 true ->max=9 ; key4 !contains true, 2>max false
        assertEquals(9.0, v1.getLInfDistance(v2), EPS);
    }

    @Test
    public void testGetLInfDistance_nonOpenMap() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1, 0, 3});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{0, 5, 3});
        assertEquals(5.0, v1.getLInfDistance((RealVector) v2), EPS);
    }

    @Test
    public void testGetLInfDistance_doubleArray_bothBranches() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1, 0, 3});
        double[] v2 = {0, 5, 3};
        // i=0 delta1>0 true; i=1 delta5>1 true; i=2 delta0>5 false
        assertEquals(5.0, v1.getLInfDistance(v2), EPS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLInfDistance_dimensionMismatch() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(3);
        v1.getLInfDistance(new double[]{1, 2});
    }

    // ===================== isInfinite =====================

    @Test
    public void testIsInfinite_falseWhenEmpty() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(3);
        assertFalse(v.isInfinite());
    }

    @Test
    public void testIsInfinite_trueWhenInfiniteFound() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.setEntry(0, Double.POSITIVE_INFINITY);
        assertTrue(v.isInfinite());
    }

    @Test
    public void testIsInfinite_falseWhenNaNPresent() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.setEntry(0, Double.POSITIVE_INFINITY);
        v.setEntry(1, Double.NaN);
        // พบ NaN -> คืน false เสมอ ไม่ว่าจะพบ Infinite ก่อนหรือหลัง (ตาม logic ต้นฉบับ)
        assertFalse(v.isInfinite());
    }

    // ===================== isNaN =====================

    @Test
    public void testIsNaN_true() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.setEntry(0, Double.NaN);
        assertTrue(v.isNaN());
    }

    @Test
    public void testIsNaN_false() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1, 2, 3});
        assertFalse(v.isNaN());
    }

    // ===================== mapAdd / mapAddToSelf =====================

    @Test
    public void testMapAdd() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1, 2, 3});
        OpenMapRealVector r = v.mapAdd(5);
        assertEquals(6.0, r.getEntry(0), EPS);
        assertEquals(1.0, v.getEntry(0), EPS); // original unchanged
    }

    @Test
    public void testMapAddToSelf() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1, 2, 3});
        v.mapAddToSelf(5);
        assertEquals(6.0, v.getEntry(0), EPS);
    }

    // ===================== outerProduct =====================

    @Test
    public void testOuterProduct() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1, 2});
        double[] other = {3, 4};
        RealMatrix m = v.outerProduct(other);
        assertEquals(3.0, m.getEntry(0, 0), EPS);
        assertEquals(4.0, m.getEntry(0, 1), EPS);
        assertEquals(6.0, m.getEntry(1, 0), EPS);
        assertEquals(8.0, m.getEntry(1, 1), EPS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOuterProduct_dimensionMismatch() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.outerProduct(new double[]{1, 2});
    }

    // ===================== projection =====================

    @Test
    public void testProjection_RealVector() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{3, 4});
        OpenMapRealVector u = new OpenMapRealVector(new double[]{1, 0});
        RealVector p = v.projection(u);
        assertEquals(3.0, p.getEntry(0), EPS);
        assertEquals(0.0, p.getEntry(1), EPS);
    }

    @Test
    public void testProjection_doubleArray() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{3, 4});
        double[] u = {1, 0};
        OpenMapRealVector p = v.projection(u);
        assertEquals(3.0, p.getEntry(0), EPS);
        assertEquals(0.0, p.getEntry(1), EPS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProjection_dimensionMismatch() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.projection(new double[]{1, 2});
    }

    // ===================== setEntry =====================

    @Test
    public void testSetEntry_addsNonDefaultValue() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.setEntry(0, 5.0);
        assertEquals(5.0, v.getEntry(0), EPS);
    }

    @Test
    public void testSetEntry_doesNotAddDefaultValue() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(3, 0.1);
        v.setEntry(0, 0.05);
        assertEquals(0.0, v.getEntry(0), EPS);
    }

    @Test
    public void testSetEntry_removesExistingWhenSetToDefault() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(3, 0.1);
        v.setEntry(0, 5.0);   // stored
        v.setEntry(0, 0.0);   // becomes default -> containsKey true -> removed
        assertEquals(0.0, v.getEntry(0), EPS);
    }

    @Test
    public void testSetEntry_defaultOnUnstoredKey_noOp() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(3, 0.1);
        v.setEntry(1, 0.0); // containsKey false -> no-op branch
        assertEquals(0.0, v.getEntry(1), EPS);
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetEntry_invalidIndex() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.setEntry(5, 1.0);
    }

    // ===================== setSubVector =====================

    @Test
    public void testSetSubVector_doubleArray() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(5);
        v.setSubVector(1, new double[]{9, 8});
        assertEquals(9.0, v.getEntry(1), EPS);
        assertEquals(8.0, v.getEntry(2), EPS);
    }

    @Test
    public void testSetSubVector_RealVector() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(5);
        ArrayRealVector u = new ArrayRealVector(new double[]{9, 8});
        v.setSubVector(1, (RealVector) u);
        assertEquals(9.0, v.getEntry(1), EPS);
        assertEquals(8.0, v.getEntry(2), EPS);
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetSubVector_invalidIndex() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.setSubVector(2, new double[]{1, 2});
    }

    // ===================== set =====================

    @Test
    public void testSet() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.set(7.0);
        assertEquals(7.0, v.getEntry(0), EPS);
        assertEquals(7.0, v.getEntry(2), EPS);
    }

    // ===================== subtract =====================

    @Test
    public void testSubtract_OpenMapRealVector_containsKeyBothBranches() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{5, 0, 3});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{1, 2, 0});
        OpenMapRealVector res = v1.subtract(v2);
        assertEquals(4.0, res.getEntry(0), EPS);  // containsKey true
        assertEquals(-2.0, res.getEntry(1), EPS); // containsKey false
        assertEquals(3.0, res.getEntry(2), EPS);
    }

    @Test
    public void testSubtract_nonOpenMap() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{5, 0, 3});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{1, 2, 0});
        OpenMapRealVector res = v1.subtract((RealVector) v2);
        assertEquals(4.0, res.getEntry(0), EPS);
        assertEquals(-2.0, res.getEntry(1), EPS);
    }

    @Test
    public void testSubtract_doubleArray_containsKeyBothBranches() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{5, 0, 3});
        double[] v2 = {1, 2, 0};
        OpenMapRealVector res = v1.subtract(v2);
        assertEquals(4.0, res.getEntry(0), EPS);
        assertEquals(-2.0, res.getEntry(1), EPS);
        assertEquals(3.0, res.getEntry(2), EPS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubtract_dimensionMismatch() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(3);
        OpenMapRealVector v2 = new OpenMapRealVector(4);
        v1.subtract(v2);
    }

    // ===================== unitVector / unitize =====================

    @Test
    public void testUnitVector_andOriginalUnaffected() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{3, 4});
        OpenMapRealVector u = v.unitVector();
        assertEquals(0.6, u.getEntry(0), EPS);
        assertEquals(0.8, u.getEntry(1), EPS);
        assertEquals(3.0, v.getEntry(0), EPS);
    }

    @Test
    public void testUnitize_zeroNormThrows() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(3);
        try {
            v.unitize();
            fail("Expected exception for zero-norm vector");
        } catch (RuntimeException e) {
            // ชนิด exception ที่แน่ชัดไม่ยืนยันจากซอร์ส (MathRuntimeException.createArithmeticException)
            assertNotNull(e.getMessage());
        }
    }

    // ===================== toArray =====================

    @Test
    public void testToArray() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{0, 5, 0, 7});
        assertArrayEquals(new double[]{0, 5, 0, 7}, v.toArray(), EPS);
    }

    // ===================== hashCode / equals =====================

    @Test
    public void testEquals_sameObject() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1, 2, 3});
        assertTrue(v.equals(v));
    }

    @Test
    public void testEquals_null() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1, 2, 3});
        assertFalse(v.equals(null));
    }

    @Test
    public void testEquals_notInstance() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1, 2, 3});
        assertFalse(v.equals("not a vector"));
    }

    @Test
    public void testEquals_differentVirtualSize() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1, 2, 3});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{1, 2});
        assertFalse(v1.equals(v2));
    }

    @Test
    public void testEquals_differentEpsilon() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(3, 1e-12);
        OpenMapRealVector v2 = new OpenMapRealVector(3, 1e-6);
        assertFalse(v1.equals(v2));
    }

    @Test
    public void testEquals_differentEntries_firstLoop() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1, 2, 3});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{1, 2, 4});
        assertFalse(v1.equals(v2));
    }

    @Test
    public void testEquals_differentEntries_secondLoop() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1, 2, 0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{1, 2, 5});
        assertFalse(v1.equals(v2)); // mismatch found only when iterating v2's entries
    }

    @Test
    public void testEquals_trueForEqualVectors_andHashCodeConsistent() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1, 2, 3});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{1, 2, 3});
        assertTrue(v1.equals(v2));
        assertEquals(v1.hashCode(), v2.hashCode());
    }

    // ===================== getSparcity =====================

    @Test
    public void testGetSparcity() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1, 0, 0, 2});
        assertEquals(0.5, v.getSparcity(), EPS);
    }

    // ===================== sparseIterator / OpenMapEntry =====================

    @Test
    public void testSparseIterator_iterateNonZeroOnly() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{0, 5, 0, 7});
        java.util.Iterator<RealVector.Entry> it = v.sparseIterator();
        int count = 0;
        double sum = 0;
        while (it.hasNext()) {
            RealVector.Entry e = it.next();
            sum += e.getValue();
            count++;
        }
        assertEquals(2, count);
        assertEquals(12.0, sum, EPS);
    }

    @Test
    public void testSparseIterator_entrySetValueAndGetIndex() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{0, 5});
        java.util.Iterator<RealVector.Entry> it = v.sparseIterator();
        assertTrue(it.hasNext());
        RealVector.Entry e = it.next();
        assertEquals(1, e.getIndex());
        assertEquals(5.0, e.getValue(), EPS);
        e.setValue(9.0);
        assertEquals(9.0, v.getEntry(1), EPS);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSparseIterator_removeUnsupported() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1, 2});
        java.util.Iterator<RealVector.Entry> it = v.sparseIterator();
        it.remove();
    }
}
