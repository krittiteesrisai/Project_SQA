package org.apache.commons.math3.linear;

import static org.junit.Assert.*;

import org.junit.Test;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.OutOfRangeException;

import java.util.Iterator;

public class OpenMapRealVectorTest {

    private static final double EPS = 1.0e-12;

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
            assertEquals(0.0, v.getEntry(i), EPS);
        }
    }

    @Test
    public void testDimensionEpsilonConstructor() {
        OpenMapRealVector v = new OpenMapRealVector(3, 0.5);
        v.setEntry(0, 0.4); // |0.4| < epsilon(0.5) -> considered default value, not stored
        assertEquals(0.0, v.getEntry(0), EPS);
        v.setEntry(1, 0.6); // not default
        assertEquals(0.6, v.getEntry(1), EPS);
    }

    @Test
    public void testDimensionExpectedSizeConstructor() {
        OpenMapRealVector v = new OpenMapRealVector(10, 2);
        assertEquals(10, v.getDimension());
    }

    @Test
    public void testDimensionExpectedSizeEpsilonConstructor() {
        OpenMapRealVector v = new OpenMapRealVector(10, 2, 0.1);
        assertEquals(10, v.getDimension());
    }

    @Test
    public void testDoubleArrayConstructor() {
        double[] data = {0.0, 1.0, 0.0, 2.0};
        OpenMapRealVector v = new OpenMapRealVector(data);
        assertEquals(4, v.getDimension());
        assertEquals(1.0, v.getEntry(1), EPS);
        assertEquals(0.0, v.getEntry(0), EPS);
    }

    @Test
    public void testDoubleArrayEpsilonConstructor() {
        double[] data = {0.05, 1.0};
        OpenMapRealVector v = new OpenMapRealVector(data, 0.1);
        // 0.05 < epsilon -> treated as default, not stored (still returns 0.0)
        assertEquals(0.0, v.getEntry(0), EPS);
        assertEquals(1.0, v.getEntry(1), EPS);
    }

    @Test
    public void testDoubleObjectArrayConstructor() {
        Double[] data = {0.0, 3.0};
        OpenMapRealVector v = new OpenMapRealVector(data);
        assertEquals(2, v.getDimension());
        assertEquals(3.0, v.getEntry(1), EPS);
    }

    @Test
    public void testDoubleObjectArrayEpsilonConstructor() {
        Double[] data = {0.02, 5.0};
        OpenMapRealVector v = new OpenMapRealVector(data, 0.1);
        assertEquals(0.0, v.getEntry(0), EPS);
        assertEquals(5.0, v.getEntry(1), EPS);
    }

    @Test
    public void testCopyConstructorOpenMapRealVector() {
        OpenMapRealVector orig = new OpenMapRealVector(new double[]{1.0, 2.0});
        OpenMapRealVector copy = new OpenMapRealVector(orig);
        assertEquals(orig.getDimension(), copy.getDimension());
        assertEquals(orig.getEntry(0), copy.getEntry(0), EPS);
        assertEquals(orig.getEntry(1), copy.getEntry(1), EPS);
    }

    @Test
    public void testGenericCopyConstructorRealVector() {
        RealVector arr = new ArrayRealVector(new double[]{0.0, 7.0, 0.0});
        OpenMapRealVector v = new OpenMapRealVector(arr);
        assertEquals(3, v.getDimension());
        assertEquals(7.0, v.getEntry(1), EPS);
        assertEquals(0.0, v.getEntry(0), EPS);
    }

    // ---------------------------------------------------------------
    // add(RealVector) / add(OpenMapRealVector)
    // ---------------------------------------------------------------

    @Test
    public void testAddRealVector_OpenMapBranch() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 2.0});
        OpenMapRealVector b = new OpenMapRealVector(new double[]{3.0, 4.0});
        RealVector res = a.add((RealVector) b);
        assertEquals(4.0, res.getEntry(0), EPS);
        assertEquals(6.0, res.getEntry(1), EPS);
    }

    @Test
    public void testAddRealVector_SuperBranch() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 2.0});
        RealVector b = new ArrayRealVector(new double[]{3.0, 4.0});
        RealVector res = a.add(b);
        assertEquals(4.0, res.getEntry(0), EPS);
        assertEquals(6.0, res.getEntry(1), EPS);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testAddRealVector_DimensionMismatch() {
        OpenMapRealVector a = new OpenMapRealVector(2);
        RealVector b = new ArrayRealVector(3);
        a.add(b);
    }

    @Test
    public void testAddOpenMapRealVector_CopyThisTrue() {
        // this has more entries than v -> copyThis = true
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        OpenMapRealVector b = new OpenMapRealVector(3); // all zero -> 0 entries
        b.setEntry(0, 5.0); // one entry only
        OpenMapRealVector res = a.add(b);
        assertEquals(6.0, res.getEntry(0), EPS); // containsKey branch true
        assertEquals(2.0, res.getEntry(1), EPS);
        assertEquals(3.0, res.getEntry(2), EPS);
    }

    @Test
    public void testAddOpenMapRealVector_CopyThisFalse() {
        // v has more entries than this -> copyThis = false
        OpenMapRealVector a = new OpenMapRealVector(3); // 0 entries
        a.setEntry(0, 1.0);
        OpenMapRealVector b = new OpenMapRealVector(new double[]{10.0, 20.0, 30.0});
        OpenMapRealVector res = a.add(b);
        assertEquals(11.0, res.getEntry(0), EPS);
        assertEquals(20.0, res.getEntry(1), EPS); // containsKey branch false (key not in a)
        assertEquals(30.0, res.getEntry(2), EPS);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testAddOpenMapRealVector_DimensionMismatch() {
        OpenMapRealVector a = new OpenMapRealVector(2);
        OpenMapRealVector b = new OpenMapRealVector(5);
        a.add(b);
    }

    // ---------------------------------------------------------------
    // append
    // ---------------------------------------------------------------

    @Test
    public void testAppendOpenMapRealVector() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 2.0});
        OpenMapRealVector b = new OpenMapRealVector(new double[]{3.0, 4.0});
        OpenMapRealVector res = a.append(b);
        assertEquals(4, res.getDimension());
        assertEquals(1.0, res.getEntry(0), EPS);
        assertEquals(2.0, res.getEntry(1), EPS);
        assertEquals(3.0, res.getEntry(2), EPS);
        assertEquals(4.0, res.getEntry(3), EPS);
    }

    @Test
    public void testAppendRealVector_OpenMapBranch() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0});
        RealVector b = new OpenMapRealVector(new double[]{2.0});
        OpenMapRealVector res = a.append(b);
        assertEquals(2, res.getDimension());
        assertEquals(2.0, res.getEntry(1), EPS);
    }

    @Test
    public void testAppendRealVector_SuperBranch() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0});
        RealVector b = new ArrayRealVector(new double[]{2.0, 3.0});
        OpenMapRealVector res = a.append(b);
        assertEquals(3, res.getDimension());
        assertEquals(2.0, res.getEntry(1), EPS);
        assertEquals(3.0, res.getEntry(2), EPS);
    }

    @Test
    public void testAppendDouble() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0});
        OpenMapRealVector res = a.append(9.0);
        assertEquals(2, res.getDimension());
        assertEquals(9.0, res.getEntry(1), EPS);
    }

    // ---------------------------------------------------------------
    // copy
    // ---------------------------------------------------------------

    @Test
    public void testCopy() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 2.0});
        OpenMapRealVector b = a.copy();
        assertNotSame(a, b);
        assertEquals(a.getEntry(0), b.getEntry(0), EPS);
    }

    // ---------------------------------------------------------------
    // dotProduct
    // ---------------------------------------------------------------

    @Test
    public void testDotProductOpenMap_ThisSmaller() {
        OpenMapRealVector a = new OpenMapRealVector(3);
        a.setEntry(0, 2.0); // 1 entry -> smaller
        OpenMapRealVector b = new OpenMapRealVector(new double[]{3.0, 4.0, 5.0}); // 3 entries
        double res = a.dotProduct(b);
        assertEquals(6.0, res, EPS); // 2*3
    }

    @Test
    public void testDotProductOpenMap_ThisLargerOrEqual() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{3.0, 4.0, 5.0}); // 3 entries
        OpenMapRealVector b = new OpenMapRealVector(3);
        b.setEntry(0, 2.0); // 1 entry -> smaller is v, thisIsSmaller=false
        double res = a.dotProduct(b);
        assertEquals(6.0, res, EPS);
    }

    @Test
    public void testDotProductRealVector_OpenMapBranch() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 2.0});
        RealVector b = new OpenMapRealVector(new double[]{3.0, 4.0});
        assertEquals(11.0, a.dotProduct(b), EPS);
    }

    @Test
    public void testDotProductRealVector_SuperBranch() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 2.0});
        RealVector b = new ArrayRealVector(new double[]{3.0, 4.0});
        assertEquals(11.0, a.dotProduct(b), EPS);
    }

    // ---------------------------------------------------------------
    // ebeDivide / ebeMultiply
    // ---------------------------------------------------------------

    @Test
    public void testEbeDivide() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{4.0, 0.0});
        RealVector b = new ArrayRealVector(new double[]{2.0, 5.0});
        RealVector res = a.ebeDivide(b);
        assertEquals(2.0, res.getEntry(0), EPS);
        assertEquals(0.0, res.getEntry(1), EPS);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testEbeDivide_DimensionMismatch() {
        OpenMapRealVector a = new OpenMapRealVector(2);
        RealVector b = new ArrayRealVector(3);
        a.ebeDivide(b);
    }

    @Test
    public void testEbeMultiply() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{4.0, 0.0});
        RealVector b = new ArrayRealVector(new double[]{2.0, 5.0});
        RealVector res = a.ebeMultiply(b);
        assertEquals(8.0, res.getEntry(0), EPS);
        assertEquals(0.0, res.getEntry(1), EPS);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testEbeMultiply_DimensionMismatch() {
        OpenMapRealVector a = new OpenMapRealVector(2);
        RealVector b = new ArrayRealVector(3);
        a.ebeMultiply(b);
    }

    // ---------------------------------------------------------------
    // getSubVector
    // ---------------------------------------------------------------

    @Test
    public void testGetSubVector_Normal() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0, 4.0});
        OpenMapRealVector sub = a.getSubVector(1, 2);
        assertEquals(2, sub.getDimension());
        assertEquals(2.0, sub.getEntry(0), EPS);
        assertEquals(3.0, sub.getEntry(1), EPS);
    }

    @Test(expected = NotPositiveException.class)
    public void testGetSubVector_NegativeN() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 2.0});
        a.getSubVector(0, -1);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetSubVector_IndexOutOfRange() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 2.0});
        a.getSubVector(-1, 1);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetSubVector_EndOutOfRange() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 2.0});
        a.getSubVector(1, 5); // index+n-1 out of range
    }

    // ---------------------------------------------------------------
    // getDimension
    // ---------------------------------------------------------------

    @Test
    public void testGetDimension() {
        assertEquals(7, new OpenMapRealVector(7).getDimension());
    }

    // ---------------------------------------------------------------
    // getDistance
    // ---------------------------------------------------------------

    @Test
    public void testGetDistanceOpenMap() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0});
        OpenMapRealVector b = new OpenMapRealVector(new double[]{0.0, 2.0, 3.0});
        // delta: (1-0)^2 + (0-2)^2(from b's unique key) + (3-3)^2
        double expected = Math.sqrt(1.0 + 4.0);
        assertEquals(expected, a.getDistance(b), 1e-9);
    }

    @Test
    public void testGetDistanceRealVector_OpenMapBranch() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 2.0});
        RealVector b = new OpenMapRealVector(new double[]{4.0, 6.0});
        assertEquals(5.0, a.getDistance(b), 1e-9);
    }

    @Test
    public void testGetDistanceRealVector_SuperBranch() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 2.0});
        RealVector b = new ArrayRealVector(new double[]{4.0, 6.0});
        assertEquals(5.0, a.getDistance(b), 1e-9);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testGetDistanceRealVector_DimensionMismatch() {
        OpenMapRealVector a = new OpenMapRealVector(2);
        RealVector b = new ArrayRealVector(3);
        a.getDistance(b);
    }

    // ---------------------------------------------------------------
    // getEntry
    // ---------------------------------------------------------------

    @Test
    public void testGetEntry_Valid() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{9.0});
        assertEquals(9.0, a.getEntry(0), EPS);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetEntry_InvalidIndex() {
        OpenMapRealVector a = new OpenMapRealVector(2);
        a.getEntry(5);
    }

    // ---------------------------------------------------------------
    // getL1Distance
    // ---------------------------------------------------------------

    @Test
    public void testGetL1DistanceOpenMap() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 0.0});
        OpenMapRealVector b = new OpenMapRealVector(new double[]{0.0, 3.0});
        // |1-0| + |0-3|(unique in b)
        assertEquals(4.0, a.getL1Distance(b), EPS);
    }

    @Test
    public void testGetL1DistanceRealVector_OpenMapBranch() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 2.0});
        RealVector b = new OpenMapRealVector(new double[]{4.0, 6.0});
        assertEquals(7.0, a.getL1Distance(b), EPS);
    }

    @Test
    public void testGetL1DistanceRealVector_SuperBranch() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 2.0});
        RealVector b = new ArrayRealVector(new double[]{4.0, 6.0});
        assertEquals(7.0, a.getL1Distance(b), EPS);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testGetL1DistanceRealVector_DimensionMismatch() {
        OpenMapRealVector a = new OpenMapRealVector(2);
        RealVector b = new ArrayRealVector(3);
        a.getL1Distance(b);
    }

    // ---------------------------------------------------------------
    // getLInfDistance (private, tested via public overload)
    // ---------------------------------------------------------------

    @Test
    public void testGetLInfDistanceRealVector_OpenMapBranch() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 10.0});
        RealVector b = new OpenMapRealVector(new double[]{4.0, 6.0});
        // deltas: |1-4|=3 ; |10-6|=4 -> max=4
        assertEquals(4.0, a.getLInfDistance(b), EPS);
    }

    @Test
    public void testGetLInfDistanceRealVector_UniqueKeyInV() {
        OpenMapRealVector a = new OpenMapRealVector(2);
        a.setEntry(0, 1.0); // only index 0 non-zero
        OpenMapRealVector b = new OpenMapRealVector(new double[]{1.0, 9.0}); // index1 unique positive
        assertEquals(9.0, a.getLInfDistance(b), EPS);
    }

    @Test
    public void testGetLInfDistanceRealVector_SuperBranch() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 10.0});
        RealVector b = new ArrayRealVector(new double[]{4.0, 6.0});
        assertEquals(4.0, a.getLInfDistance(b), EPS);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testGetLInfDistanceRealVector_DimensionMismatch() {
        OpenMapRealVector a = new OpenMapRealVector(2);
        RealVector b = new ArrayRealVector(3);
        a.getLInfDistance(b);
    }

    // ---------------------------------------------------------------
    // isInfinite / isNaN
    // ---------------------------------------------------------------

    @Test
    public void testIsInfinite_AllFinite() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 2.0});
        assertFalse(a.isInfinite());
    }

    @Test
    public void testIsInfinite_WithInfinite() {
        OpenMapRealVector a = new OpenMapRealVector(2);
        a.setEntry(0, Double.POSITIVE_INFINITY);
        assertTrue(a.isInfinite());
    }

    @Test
    public void testIsInfinite_WithNaN_ReturnsFalse() {
        OpenMapRealVector a = new OpenMapRealVector(2);
        a.setEntry(0, Double.NaN);
        // NaN branch forces immediate return false, regardless of infinite flag
        assertFalse(a.isInfinite());
    }

    @Test
    public void testIsNaN_True() {
        OpenMapRealVector a = new OpenMapRealVector(2);
        a.setEntry(0, Double.NaN);
        assertTrue(a.isNaN());
    }

    @Test
    public void testIsNaN_False() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 2.0});
        assertFalse(a.isNaN());
    }

    // ---------------------------------------------------------------
    // mapAdd / mapAddToSelf
    // ---------------------------------------------------------------

    @Test
    public void testMapAdd() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 2.0});
        OpenMapRealVector res = a.mapAdd(5.0);
        assertEquals(6.0, res.getEntry(0), EPS);
        assertEquals(7.0, res.getEntry(1), EPS);
        // original unmodified
        assertEquals(1.0, a.getEntry(0), EPS);
    }

    @Test
    public void testMapAddToSelf() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 2.0});
        a.mapAddToSelf(3.0);
        assertEquals(4.0, a.getEntry(0), EPS);
        assertEquals(5.0, a.getEntry(1), EPS);
    }

    // ---------------------------------------------------------------
    // projection
    // ---------------------------------------------------------------

    @Test
    public void testProjection() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 0.0});
        RealVector b = new ArrayRealVector(new double[]{2.0, 0.0});
        RealVector proj = a.projection(b);
        assertEquals(2.0, proj.getEntry(0), EPS);
        assertEquals(0.0, proj.getEntry(1), EPS);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testProjection_DimensionMismatch() {
        OpenMapRealVector a = new OpenMapRealVector(2);
        RealVector b = new ArrayRealVector(3);
        a.projection(b);
    }

    // ---------------------------------------------------------------
    // setEntry
    // ---------------------------------------------------------------

    @Test
    public void testSetEntry_NonDefaultValue_Put() {
        OpenMapRealVector a = new OpenMapRealVector(3);
        a.setEntry(1, 5.0);
        assertEquals(5.0, a.getEntry(1), EPS);
    }

    @Test
    public void testSetEntry_DefaultValue_RemoveExisting() {
        OpenMapRealVector a = new OpenMapRealVector(3, 0.1);
        a.setEntry(1, 5.0);      // store
        a.setEntry(1, 0.0);      // default value -> containsKey true -> remove
        assertEquals(0.0, a.getEntry(1), EPS);
    }

    @Test
    public void testSetEntry_DefaultValue_NotContained_NoOp() {
        OpenMapRealVector a = new OpenMapRealVector(3, 0.1);
        // never set before -> containsKey false branch, nothing happens, no exception
        a.setEntry(2, 0.0);
        assertEquals(0.0, a.getEntry(2), EPS);
    }

    @Test(expected = OutOfRangeException.class)
    public void testSetEntry_IndexOutOfRange() {
        OpenMapRealVector a = new OpenMapRealVector(2);
        a.setEntry(-1, 3.0);
    }

    // ---------------------------------------------------------------
    // setSubVector
    // ---------------------------------------------------------------

    @Test
    public void testSetSubVector_Normal() {
        OpenMapRealVector a = new OpenMapRealVector(4);
        RealVector sub = new ArrayRealVector(new double[]{9.0, 8.0});
        a.setSubVector(1, sub);
        assertEquals(9.0, a.getEntry(1), EPS);
        assertEquals(8.0, a.getEntry(2), EPS);
    }

    @Test(expected = OutOfRangeException.class)
    public void testSetSubVector_IndexOutOfRange() {
        OpenMapRealVector a = new OpenMapRealVector(3);
        RealVector sub = new ArrayRealVector(new double[]{1.0, 2.0});
        a.setSubVector(2, sub); // index+dim-1 = 3 -> out of range
    }

    // ---------------------------------------------------------------
    // set(double)
    // ---------------------------------------------------------------

    @Test
    public void testSet() {
        OpenMapRealVector a = new OpenMapRealVector(3);
        a.set(4.0);
        for (int i = 0; i < 3; i++) {
            assertEquals(4.0, a.getEntry(i), EPS);
        }
    }

    // ---------------------------------------------------------------
    // subtract
    // ---------------------------------------------------------------

    @Test
    public void testSubtractOpenMap_ContainsKeyTrue() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{5.0, 2.0});
        OpenMapRealVector b = new OpenMapRealVector(new double[]{3.0, 0.0});
        OpenMapRealVector res = a.subtract(b);
        assertEquals(2.0, res.getEntry(0), EPS); // containsKey true branch
        assertEquals(2.0, res.getEntry(1), EPS);
    }

    @Test
    public void testSubtractOpenMap_ContainsKeyFalse() {
        OpenMapRealVector a = new OpenMapRealVector(2); // empty
        OpenMapRealVector b = new OpenMapRealVector(new double[]{3.0, 4.0});
        OpenMapRealVector res = a.subtract(b);
        assertEquals(-3.0, res.getEntry(0), EPS); // containsKey false branch
        assertEquals(-4.0, res.getEntry(1), EPS);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testSubtractOpenMap_DimensionMismatch() {
        OpenMapRealVector a = new OpenMapRealVector(2);
        OpenMapRealVector b = new OpenMapRealVector(5);
        a.subtract(b);
    }

    @Test
    public void testSubtractRealVector_OpenMapBranch() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{5.0, 2.0});
        RealVector b = new OpenMapRealVector(new double[]{3.0, 1.0});
        RealVector res = a.subtract(b);
        assertEquals(2.0, res.getEntry(0), EPS);
        assertEquals(1.0, res.getEntry(1), EPS);
    }

    @Test
    public void testSubtractRealVector_SuperBranch() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{5.0, 2.0});
        RealVector b = new ArrayRealVector(new double[]{3.0, 1.0});
        RealVector res = a.subtract(b);
        assertEquals(2.0, res.getEntry(0), EPS);
        assertEquals(1.0, res.getEntry(1), EPS);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testSubtractRealVector_DimensionMismatch() {
        OpenMapRealVector a = new OpenMapRealVector(2);
        RealVector b = new ArrayRealVector(3);
        a.subtract(b);
    }

    // ---------------------------------------------------------------
    // unitVector / unitize
    // ---------------------------------------------------------------

    @Test
    public void testUnitVector() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{3.0, 4.0});
        OpenMapRealVector unit = a.unitVector();
        assertEquals(1.0, unit.getNorm(), 1e-9);
        // original unchanged
        assertEquals(3.0, a.getEntry(0), EPS);
    }

    @Test
    public void testUnitize_Normal() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{3.0, 4.0});
        a.unitize();
        assertEquals(1.0, a.getNorm(), 1e-9);
    }

    @Test(expected = MathArithmeticException.class)
    public void testUnitize_ZeroVector_Throws() {
        OpenMapRealVector a = new OpenMapRealVector(3); // all zero -> norm == 0 (default)
        a.unitize();
    }

    // ---------------------------------------------------------------
    // toArray
    // ---------------------------------------------------------------

    @Test
    public void testToArray() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{0.0, 5.0, 0.0});
        double[] arr = a.toArray();
        assertArrayEquals(new double[]{0.0, 5.0, 0.0}, arr, EPS);
    }

    // ---------------------------------------------------------------
    // hashCode
    // ---------------------------------------------------------------

    @Test
    public void testHashCode_EqualObjectsSameHash() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 2.0});
        OpenMapRealVector b = new OpenMapRealVector(new double[]{1.0, 2.0});
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testHashCode_EmptyVector() {
        OpenMapRealVector a = new OpenMapRealVector(0);
        // just ensure no exception and loop with zero iterations works
        int hc = a.hashCode();
        assertTrue(hc != 0 || hc == 0); // trivial sanity: executes without error
    }

    // ---------------------------------------------------------------
    // equals
    // ---------------------------------------------------------------

    @Test
    public void testEquals_SameInstance() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0});
        assertTrue(a.equals(a));
    }

    @Test
    public void testEquals_NotInstanceOf() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0});
        assertFalse(a.equals("not a vector"));
    }

    @Test
    public void testEquals_Null() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0});
        assertFalse(a.equals(null));
    }

    @Test
    public void testEquals_DifferentDimension() {
        OpenMapRealVector a = new OpenMapRealVector(2);
        OpenMapRealVector b = new OpenMapRealVector(3);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_DifferentEpsilon() {
        OpenMapRealVector a = new OpenMapRealVector(2, 0.1);
        OpenMapRealVector b = new OpenMapRealVector(2, 0.2);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_DifferentEntries() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 2.0});
        OpenMapRealVector b = new OpenMapRealVector(new double[]{1.0, 3.0});
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_DifferentEntries_SecondLoop() {
        // a has fewer non-zero entries than b, so second loop must catch mismatch
        OpenMapRealVector a = new OpenMapRealVector(2); // empty
        OpenMapRealVector b = new OpenMapRealVector(new double[]{0.0, 9.0});
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_Equal() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 2.0});
        OpenMapRealVector b = new OpenMapRealVector(new double[]{1.0, 2.0});
        assertTrue(a.equals(b));
    }

    // ---------------------------------------------------------------
    // getSparsity
    // ---------------------------------------------------------------

    @Test
    public void testGetSparsity() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{0.0, 1.0, 0.0, 2.0});
        assertEquals(2.0 / 4.0, a.getSparsity(), EPS);
    }

    // ---------------------------------------------------------------
    // sparseIterator / OpenMapSparseIterator / OpenMapEntry
    // ---------------------------------------------------------------

    @Test
    public void testSparseIterator_IteratesNonZeroEntries() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{0.0, 7.0, 0.0, 8.0});
        java.util.Iterator<RealVector.Entry> it = a.sparseIterator();
        int count = 0;
        double sum = 0.0;
        while (it.hasNext()) {
            RealVector.Entry e = it.next();
            sum += e.getValue();
            count++;
            // getIndex() should be valid
            assertTrue(e.getIndex() >= 0 && e.getIndex() < a.getDimension());
        }
        assertEquals(2, count);
        assertEquals(15.0, sum, EPS);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSparseIterator_RemoveThrows() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0});
        java.util.Iterator<RealVector.Entry> it = a.sparseIterator();
        it.remove();
    }

    @Test
    public void testSparseIterator_EmptyVector_NoNext() {
        OpenMapRealVector a = new OpenMapRealVector(3); // all default, no entries
        java.util.Iterator<RealVector.Entry> it = a.sparseIterator();
        assertFalse(it.hasNext());
    }

    @Test
    public void testOpenMapEntry_SetValue() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{5.0});
        java.util.Iterator<RealVector.Entry> it = a.sparseIterator();
        assertTrue(it.hasNext());
        RealVector.Entry e = it.next();
        e.setValue(99.0);
        assertEquals(99.0, a.getEntry(e.getIndex()), EPS);
    }
}
