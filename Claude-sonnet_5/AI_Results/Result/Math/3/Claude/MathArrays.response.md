# MathArraysTest.java

```java
package org.apache.commons.math3.util;

import static org.junit.Assert.*;

import org.junit.Test;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NonMonotonicSequenceException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.util.MathArrays.OrderDirection;

/**
 * JUnit4 tests for {@link MathArrays} (Defects4J Math-3b).
 */
public class MathArraysTest {

    private static final double EPS = 1e-9;

    // ---------------------------------------------------------------
    // scale / scaleInPlace
    // ---------------------------------------------------------------

    @Test
    public void testScale() {
        double[] arr = {1, 2, 3};
        double[] result = MathArrays.scale(2.0, arr);
        assertArrayEquals(new double[]{2, 4, 6}, result, EPS);
        // original must remain unchanged
        assertArrayEquals(new double[]{1, 2, 3}, arr, EPS);
    }

    @Test
    public void testScaleWithZeroFactor() {
        double[] arr = {5, -3, 0};
        double[] result = MathArrays.scale(0.0, arr);
        assertArrayEquals(new double[]{0, 0, 0}, result, EPS);
    }

    @Test
    public void testScaleInPlace() {
        double[] arr = {1, 2, 3};
        MathArrays.scaleInPlace(3.0, arr);
        assertArrayEquals(new double[]{3, 6, 9}, arr, EPS);
    }

    // ---------------------------------------------------------------
    // ebeAdd / ebeSubtract / ebeMultiply / ebeDivide
    // ---------------------------------------------------------------

    @Test
    public void testEbeAddNormal() {
        double[] a = {1, 2, 3};
        double[] b = {4, 5, 6};
        assertArrayEquals(new double[]{5, 7, 9}, MathArrays.ebeAdd(a, b), EPS);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testEbeAddDimensionMismatch() {
        MathArrays.ebeAdd(new double[]{1, 2}, new double[]{1, 2, 3});
    }

    @Test
    public void testEbeSubtractNormal() {
        double[] a = {5, 7, 9};
        double[] b = {1, 2, 3};
        assertArrayEquals(new double[]{4, 5, 6}, MathArrays.ebeSubtract(a, b), EPS);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testEbeSubtractDimensionMismatch() {
        MathArrays.ebeSubtract(new double[]{1}, new double[]{1, 2});
    }

    @Test
    public void testEbeMultiplyNormal() {
        double[] a = {2, 3, 4};
        double[] b = {5, 6, 7};
        assertArrayEquals(new double[]{10, 18, 28}, MathArrays.ebeMultiply(a, b), EPS);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testEbeMultiplyDimensionMismatch() {
        MathArrays.ebeMultiply(new double[]{1, 2, 3}, new double[]{1});
    }

    @Test
    public void testEbeDivideNormal() {
        double[] a = {10, 18, 28};
        double[] b = {2, 3, 4};
        assertArrayEquals(new double[]{5, 6, 7}, MathArrays.ebeDivide(a, b), EPS);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testEbeDivideDimensionMismatch() {
        MathArrays.ebeDivide(new double[]{1, 2}, new double[]{1});
    }

    // ---------------------------------------------------------------
    // distance1 / distance / distanceInf (double & int)
    // ---------------------------------------------------------------

    @Test
    public void testDistance1Double() {
        double[] p1 = {0, 0};
        double[] p2 = {3, 4};
        assertEquals(7.0, MathArrays.distance1(p1, p2), EPS);
    }

    @Test
    public void testDistance1Int() {
        int[] p1 = {0, 0};
        int[] p2 = {3, 4};
        assertEquals(7, MathArrays.distance1(p1, p2));
    }

    @Test
    public void testDistanceDouble() {
        double[] p1 = {0, 0};
        double[] p2 = {3, 4};
        assertEquals(5.0, MathArrays.distance(p1, p2), EPS);
    }

    @Test
    public void testDistanceInt() {
        int[] p1 = {0, 0};
        int[] p2 = {3, 4};
        assertEquals(5.0, MathArrays.distance(p1, p2), EPS);
    }

    @Test
    public void testDistanceInfDouble() {
        double[] p1 = {0, 0, 0};
        double[] p2 = {1, -5, 3};
        assertEquals(5.0, MathArrays.distanceInf(p1, p2), EPS);
    }

    @Test
    public void testDistanceInfInt() {
        int[] p1 = {0, 0, 0};
        int[] p2 = {1, -5, 3};
        assertEquals(5, MathArrays.distanceInf(p1, p2));
    }

    // ---------------------------------------------------------------
    // isMonotonic (generic T[])
    // ---------------------------------------------------------------

    @Test
    public void testIsMonotonicGenericIncreasingStrictTrue() {
        Integer[] val = {1, 2, 3};
        assertTrue(MathArrays.isMonotonic(val, OrderDirection.INCREASING, true));
    }

    @Test
    public void testIsMonotonicGenericIncreasingStrictFalseOnEqual() {
        Integer[] val = {1, 1, 2};
        // strict=true -> comp>=0 -> false
        assertFalse(MathArrays.isMonotonic(val, OrderDirection.INCREASING, true));
        // strict=false -> equal allowed -> true
        assertTrue(MathArrays.isMonotonic(val, OrderDirection.INCREASING, false));
    }

    @Test
    public void testIsMonotonicGenericDecreasingStrict() {
        Integer[] val = {5, 3, 1};
        assertTrue(MathArrays.isMonotonic(val, OrderDirection.DECREASING, true));
    }

    @Test
    public void testIsMonotonicGenericDecreasingNonStrictEqualAllowed() {
        Integer[] val = {5, 5, 3};
        assertTrue(MathArrays.isMonotonic(val, OrderDirection.DECREASING, false));
        assertFalse(MathArrays.isMonotonic(val, OrderDirection.DECREASING, true));
    }

    @Test
    public void testIsMonotonicGenericBreaksOnWrongOrder() {
        Integer[] val = {1, 5, 2};
        assertFalse(MathArrays.isMonotonic(val, OrderDirection.INCREASING, true));
    }

    // ---------------------------------------------------------------
    // isMonotonic (double[]) - delegates to checkOrder
    // ---------------------------------------------------------------

    @Test
    public void testIsMonotonicDoubleArrayTrue() {
        double[] val = {1, 2, 3};
        assertTrue(MathArrays.isMonotonic(val, OrderDirection.INCREASING, true));
    }

    @Test
    public void testIsMonotonicDoubleArrayFalse() {
        double[] val = {1, 3, 2};
        assertFalse(MathArrays.isMonotonic(val, OrderDirection.INCREASING, true));
    }

    // ---------------------------------------------------------------
    // checkOrder(double[], dir, strict, abort)
    // ---------------------------------------------------------------

    @Test
    public void testCheckOrderIncreasingStrictPass() {
        assertTrue(MathArrays.checkOrder(new double[]{1, 2, 3},
                OrderDirection.INCREASING, true, false));
    }

    @Test
    public void testCheckOrderIncreasingStrictFailNoAbort() {
        assertFalse(MathArrays.checkOrder(new double[]{1, 1, 3},
                OrderDirection.INCREASING, true, false));
    }

    @Test(expected = NonMonotonicSequenceException.class)
    public void testCheckOrderIncreasingStrictFailAbortThrows() {
        MathArrays.checkOrder(new double[]{1, 1, 3},
                OrderDirection.INCREASING, true, true);
    }

    @Test
    public void testCheckOrderIncreasingNonStrictEqualAllowed() {
        assertTrue(MathArrays.checkOrder(new double[]{1, 1, 2},
                OrderDirection.INCREASING, false, false));
    }

    @Test
    public void testCheckOrderIncreasingNonStrictFailNoAbort() {
        // value lower than previous -> break
        assertFalse(MathArrays.checkOrder(new double[]{2, 1, 3},
                OrderDirection.INCREASING, false, false));
    }

    @Test
    public void testCheckOrderDecreasingStrictPass() {
        assertTrue(MathArrays.checkOrder(new double[]{3, 2, 1},
                OrderDirection.DECREASING, true, false));
    }

    @Test
    public void testCheckOrderDecreasingNonStrictEqualAllowed() {
        assertTrue(MathArrays.checkOrder(new double[]{3, 3, 1},
                OrderDirection.DECREASING, false, false));
    }

    @Test
    public void testCheckOrderDecreasingStrictFailNoAbort() {
        assertFalse(MathArrays.checkOrder(new double[]{3, 3, 1},
                OrderDirection.DECREASING, true, false));
    }

    @Test(expected = NonMonotonicSequenceException.class)
    public void testCheckOrderDecreasingFailAbort() {
        MathArrays.checkOrder(new double[]{1, 2, 3},
                OrderDirection.DECREASING, true, true);
    }

    @Test
    public void testCheckOrderSingleElementReturnsTrue() {
        // loop body never executes -> index==max immediately
        assertTrue(MathArrays.checkOrder(new double[]{42},
                OrderDirection.INCREASING, true, true));
    }

    // NOTE: checkOrder/isMonotonic access val[0] directly without a length
    // check. For an EMPTY array this throws ArrayIndexOutOfBoundsException.
    // This is actual behavior from the given source (not a guess).
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testCheckOrderEmptyArrayThrowsAIOOBE() {
        MathArrays.checkOrder(new double[]{}, OrderDirection.INCREASING, true, false);
    }

    @Test
    public void testCheckOrderTwoArgDelegatesWithAbortTrue() {
        try {
            MathArrays.checkOrder(new double[]{1, 0}, OrderDirection.INCREASING, true);
            fail("Expected NonMonotonicSequenceException");
        } catch (NonMonotonicSequenceException e) {
            // expected
        }
    }

    @Test
    public void testCheckOrderOneArgDefaultIncreasingStrict() {
        // valid strictly increasing array -> no exception
        MathArrays.checkOrder(new double[]{1, 2, 3});
    }

    @Test(expected = NonMonotonicSequenceException.class)
    public void testCheckOrderOneArgDefaultThrowsOnBadOrder() {
        MathArrays.checkOrder(new double[]{3, 2, 1});
    }

    // ---------------------------------------------------------------
    // checkRectangular
    // ---------------------------------------------------------------

    @Test
    public void testCheckRectangularOk() {
        long[][] in = {{1, 2}, {3, 4}};
        MathArrays.checkRectangular(in); // no exception
    }

    @Test(expected = DimensionMismatchException.class)
    public void testCheckRectangularMismatch() {
        long[][] in = {{1, 2}, {3}};
        MathArrays.checkRectangular(in);
    }

    @Test(expected = NullArgumentException.class)
    public void testCheckRectangularNull() {
        MathArrays.checkRectangular(null);
    }

    // ---------------------------------------------------------------
    // checkPositive
    // ---------------------------------------------------------------

    @Test
    public void testCheckPositiveOk() {
        MathArrays.checkPositive(new double[]{1, 2, 3});
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testCheckPositiveFailOnZero() {
        MathArrays.checkPositive(new double[]{1, 0, 3});
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testCheckPositiveFailOnNegative() {
        MathArrays.checkPositive(new double[]{1, -2, 3});
    }

    // ---------------------------------------------------------------
    // checkNonNegative (long[]) and (long[][])
    // ---------------------------------------------------------------

    @Test
    public void testCheckNonNegativeLongArrayOk() {
        MathArrays.checkNonNegative(new long[]{0, 1, 2});
    }

    @Test(expected = NotPositiveException.class)
    public void testCheckNonNegativeLongArrayFail() {
        MathArrays.checkNonNegative(new long[]{0, -1, 2});
    }

    @Test
    public void testCheckNonNegativeLong2DArrayOk() {
        MathArrays.checkNonNegative(new long[][]{{0, 1}, {2, 3}});
    }

    @Test(expected = NotPositiveException.class)
    public void testCheckNonNegativeLong2DArrayFail() {
        MathArrays.checkNonNegative(new long[][]{{0, 1}, {2, -3}});
    }

    // ---------------------------------------------------------------
    // safeNorm
    // ---------------------------------------------------------------

    @Test
    public void testSafeNormAllZero() {
        // s1=0, s2=0, s3=0 -> norm = x3max*sqrt(s3) = 0
        double norm = MathArrays.safeNorm(new double[]{0, 0, 0});
        assertEquals(0.0, norm, EPS);
    }

    @Test
    public void testSafeNormNormalRangeValues() {
        // triggers "else" main branch (s2 accumulation), s1==0,s2!=0,s2>=x3max(0)
        double norm = MathArrays.safeNorm(new double[]{3, 4});
        assertEquals(5.0, norm, 1e-6);
    }

    @Test
    public void testSafeNormLargeValuesTriggersS1Branch() {
        // both values > agiant -> xabs>x1max branch then xabs<=x1max branch
        double[] v = {2e19, 1e19};
        double norm = MathArrays.safeNorm(v);
        assertTrue(norm > 0);
        assertFalse(Double.isNaN(norm));
    }

    @Test
    public void testSafeNormSmallValuesTriggersS3Branch() {
        // values < rdwarf -> triggers x3max branch (both "if" and "else" sub-branches)
        double[] v = {1e-20, 1e-20};
        double norm = MathArrays.safeNorm(v);
        assertTrue(norm >= 0);
        assertFalse(Double.isNaN(norm));
    }

    @Test
    public void testSafeNormMixedTriggersS2LessThanX3maxBranch() {
        // small values build up x3max/s3, a tiny "normal" value keeps s2 < x3max
        double[] v = {1e-20, 1e-20, 1e-11};
        double norm = MathArrays.safeNorm(v);
        assertTrue(norm >= 0);
        assertFalse(Double.isNaN(norm));
    }

    // ---------------------------------------------------------------
    // sortInPlace
    // ---------------------------------------------------------------

    @Test
    public void testSortInPlaceIncreasingDefault() {
        double[] x = {3, 1, 2};
        double[] y = {1, 2, 3};
        double[] z = {0, 5, 7};
        MathArrays.sortInPlace(x, y, z);
        assertArrayEquals(new double[]{1, 2, 3}, x, EPS);
        assertArrayEquals(new double[]{2, 3, 1}, y, EPS);
        assertArrayEquals(new double[]{5, 7, 0}, z, EPS);
    }

    @Test
    public void testSortInPlaceDecreasing() {
        double[] x = {3, 1, 2};
        double[] y = {1, 2, 3};
        MathArrays.sortInPlace(x, OrderDirection.DECREASING, y);
        assertArrayEquals(new double[]{3, 2, 1}, x, EPS);
        assertArrayEquals(new double[]{1, 3, 2}, y, EPS);
    }

    @Test(expected = NullArgumentException.class)
    public void testSortInPlaceNullX() {
        MathArrays.sortInPlace(null, new double[]{1, 2});
    }

    @Test(expected = NullArgumentException.class)
    public void testSortInPlaceNullY() {
        MathArrays.sortInPlace(new double[]{1, 2}, (double[]) null);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testSortInPlaceDimensionMismatchY() {
        MathArrays.sortInPlace(new double[]{1, 2, 3}, new double[]{1, 2});
    }

    // ---------------------------------------------------------------
    // copyOf (int[] / double[])
    // ---------------------------------------------------------------

    @Test
    public void testCopyOfIntArraySameLength() {
        int[] src = {1, 2, 3};
        assertArrayEquals(src, MathArrays.copyOf(src));
    }

    @Test
    public void testCopyOfIntArrayTruncate() {
        int[] src = {1, 2, 3};
        assertArrayEquals(new int[]{1, 2}, MathArrays.copyOf(src, 2));
    }

    @Test
    public void testCopyOfIntArrayPad() {
        int[] src = {1, 2, 3};
        assertArrayEquals(new int[]{1, 2, 3, 0}, MathArrays.copyOf(src, 4));
    }

    @Test
    public void testCopyOfDoubleArraySameLength() {
        double[] src = {1, 2, 3};
        assertArrayEquals(src, MathArrays.copyOf(src), EPS);
    }

    @Test
    public void testCopyOfDoubleArrayTruncate() {
        double[] src = {1, 2, 3};
        assertArrayEquals(new double[]{1, 2}, MathArrays.copyOf(src, 2), EPS);
    }

    @Test
    public void testCopyOfDoubleArrayPad() {
        double[] src = {1, 2, 3};
        assertArrayEquals(new double[]{1, 2, 3, 0}, MathArrays.copyOf(src, 4), EPS);
    }

    // ---------------------------------------------------------------
    // linearCombination (array version)
    // ---------------------------------------------------------------

    @Test
    public void testLinearCombinationArrayNormal() {
        double[] a = {1, 2, 3};
        double[] b = {4, 5, 6};
        assertEquals(32.0, MathArrays.linearCombination(a, b), 1e-9);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testLinearCombinationArrayDimensionMismatch() {
        MathArrays.linearCombination(new double[]{1, 2}, new double[]{1, 2, 3});
    }

    @Test
    public void testLinearCombinationArrayNaNFallback() {
        double[] a = {Double.NaN, 1.0};
        double[] b = {1.0, 1.0};
        double result = MathArrays.linearCombination(a, b);
        assertTrue(Double.isNaN(result));
    }

    // ---------------------------------------------------------------
    // linearCombination (2 terms)
    // ---------------------------------------------------------------

    @Test
    public void testLinearCombination2TermsNormal() {
        // 1*2 + 3*4 = 14
        assertEquals(14.0, MathArrays.linearCombination(1, 2, 3, 4), 1e-9);
    }

    @Test
    public void testLinearCombination2TermsNaNFallback() {
        double result = MathArrays.linearCombination(Double.NaN, 1, 1, 1);
        assertTrue(Double.isNaN(result));
    }

    // ---------------------------------------------------------------
    // linearCombination (3 terms)
    // ---------------------------------------------------------------

    @Test
    public void testLinearCombination3TermsNormal() {
        // 1*2 + 3*4 + 5*6 = 44
        assertEquals(44.0, MathArrays.linearCombination(1, 2, 3, 4, 5, 6), 1e-9);
    }

    @Test
    public void testLinearCombination3TermsNaNFallback() {
        double result = MathArrays.linearCombination(Double.NaN, 1, 1, 1, 1, 1);
        assertTrue(Double.isNaN(result));
    }

    // ---------------------------------------------------------------
    // linearCombination (4 terms)
    // ---------------------------------------------------------------

    @Test
    public void testLinearCombination4TermsNormal() {
        // 1*2 + 3*4 + 5*6 + 7*8 = 100
        assertEquals(100.0, MathArrays.linearCombination(1, 2, 3, 4, 5, 6, 7, 8), 1e-9);
    }

    @Test
    public void testLinearCombination4TermsNaNFallback() {
        double result = MathArrays.linearCombination(Double.NaN, 1, 1, 1, 1, 1, 1, 1);
        assertTrue(Double.isNaN(result));
    }

    // ---------------------------------------------------------------
    // equals(float[], float[])
    // ---------------------------------------------------------------

    @Test
    public void testEqualsFloatBothNull() {
        assertTrue(MathArrays.equals((float[]) null, (float[]) null));
    }

    @Test
    public void testEqualsFloatOneNull() {
        assertFalse(MathArrays.equals(new float[]{1f}, null));
        assertFalse(MathArrays.equals(null, new float[]{1f}));
    }

    @Test
    public void testEqualsFloatLengthMismatch() {
        assertFalse(MathArrays.equals(new float[]{1f, 2f}, new float[]{1f}));
    }

    @Test
    public void testEqualsFloatElementMismatch() {
        assertFalse(MathArrays.equals(new float[]{1f, 2f}, new float[]{1f, 3f}));
    }

    @Test
    public void testEqualsFloatEqualArrays() {
        assertTrue(MathArrays.equals(new float[]{1f, 2f}, new float[]{1f, 2f}));
    }

    @Test
    public void testEqualsFloatWithNaNReturnsFalse() {
        // plain equals treats NaN as not equal
        assertFalse(MathArrays.equals(new float[]{Float.NaN}, new float[]{Float.NaN}));
    }

    // ---------------------------------------------------------------
    // equalsIncludingNaN(float[], float[])
    // ---------------------------------------------------------------

    @Test
    public void testEqualsIncludingNaNFloatBothNull() {
        assertTrue(MathArrays.equalsIncludingNaN((float[]) null, (float[]) null));
    }

    @Test
    public void testEqualsIncludingNaNFloatOneNull() {
        assertFalse(MathArrays.equalsIncludingNaN(new float[]{1f}, null));
    }

    @Test
    public void testEqualsIncludingNaNFloatLengthMismatch() {
        assertFalse(MathArrays.equalsIncludingNaN(new float[]{1f, 2f}, new float[]{1f}));
    }

    @Test
    public void testEqualsIncludingNaNFloatWithNaNEqual() {
        assertTrue(MathArrays.equalsIncludingNaN(new float[]{Float.NaN}, new float[]{Float.NaN}));
    }

    // ---------------------------------------------------------------
    // equals(double[], double[])
    // ---------------------------------------------------------------

    @Test
    public void testEqualsDoubleBothNull() {
        assertTrue(MathArrays.equals((double[]) null, (double[]) null));
    }

    @Test
    public void testEqualsDoubleOneNull() {
        assertFalse(MathArrays.equals(new double[]{1}, null));
    }

    @Test
    public void testEqualsDoubleLengthMismatch() {
        assertFalse(MathArrays.equals(new double[]{1, 2}, new double[]{1}));
    }

    @Test
    public void testEqualsDoubleElementMismatch() {
        assertFalse(MathArrays.equals(new double[]{1, 2}, new double[]{1, 3}));
    }

    @Test
    public void testEqualsDoubleEqualArrays() {
        assertTrue(MathArrays.equals(new double[]{1, 2}, new double[]{1, 2}));
    }

    // ---------------------------------------------------------------
    // equalsIncludingNaN(double[], double[])
    // ---------------------------------------------------------------

    @Test
    public void testEqualsIncludingNaNDoubleBothNull() {
        assertTrue(MathArrays.equalsIncludingNaN((double[]) null, (double[]) null));
    }

    @Test
    public void testEqualsIncludingNaNDoubleLengthMismatch() {
        assertFalse(MathArrays.equalsIncludingNaN(new double[]{1, 2}, new double[]{1}));
    }

    @Test
    public void testEqualsIncludingNaNDoubleWithNaNEqual() {
        assertTrue(MathArrays.equalsIncludingNaN(new double[]{Double.NaN}, new double[]{Double.NaN}));
    }

    // ---------------------------------------------------------------
    // normalizeArray
    // ---------------------------------------------------------------

    @Test(expected = MathIllegalArgumentException.class)
    public void testNormalizeArrayInfiniteSum() {
        MathArrays.normalizeArray(new double[]{1, 2, 3}, Double.POSITIVE_INFINITY);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testNormalizeArrayNaNSum() {
        MathArrays.normalizeArray(new double[]{1, 2, 3}, Double.NaN);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testNormalizeArrayInfiniteElement() {
        MathArrays.normalizeArray(new double[]{1, Double.POSITIVE_INFINITY, 3}, 10);
    }

    @Test(expected = MathArithmeticException.class)
    public void testNormalizeArraySumZero() {
        MathArrays.normalizeArray(new double[]{1, -1}, 10);
    }

    @Test
    public void testNormalizeArrayIgnoresNaNAndScalesRest() {
        double[] values = {1, Double.NaN, 3};
        double[] out = MathArrays.normalizeArray(values, 8.0);
        // sum of non-NaN = 4, target=8 -> factor 2
        assertEquals(2.0, out[0], EPS);
        assertTrue(Double.isNaN(out[1]));
        assertEquals(6.0, out[2], EPS);
    }

    @Test
    public void testNormalizeArrayNormalCase() {
        double[] values = {2, 2, 2, 2};
        double[] out = MathArrays.normalizeArray(values, 4.0);
        for (double v : out) {
            assertEquals(1.0, v, EPS);
        }
    }

    // ---------------------------------------------------------------
    // buildArray(Field, length) / buildArray(Field, rows, columns)
    // ---------------------------------------------------------------

    @Test
    public void testBuildArray1D() {
        BigReal zero = BigReal.ZERO;
        BigReal[] arr = MathArrays.buildArray(zero.getField(), 3);
        assertEquals(3, arr.length);
        for (BigReal v : arr) {
            assertEquals(BigReal.ZERO, v);
        }
    }

    @Test
    public void testBuildArray2DPositiveColumns() {
        BigReal zero = BigReal.ZERO;
        BigReal[][] arr = MathArrays.buildArray(zero.getField(), 2, 3);
        assertEquals(2, arr.length);
        for (BigReal[] row : arr) {
            assertEquals(3, row.length);
            for (BigReal v : row) {
                assertEquals(BigReal.ZERO, v);
            }
        }
    }

    @Test
    public void testBuildArray2DNegativeColumnsCreatesJaggedShell() {
        BigReal zero = BigReal.ZERO;
        BigReal[][] arr = MathArrays.buildArray(zero.getField(), 4, -1);
        assertEquals(4, arr.length);
        // rows are not pre-filled -> each row reference is null
        for (BigReal[] row : arr) {
            assertNull(row);
        }
    }

    // ---------------------------------------------------------------
    // convolve
    // ---------------------------------------------------------------

    @Test
    public void testConvolveNormal() {
        double[] x = {1, 2, 3};
        double[] h = {0, 1, 0.5};
        double[] result = MathArrays.convolve(x, h);
        // length must be xLen+hLen-1 = 5
        assertEquals(5, result.length);
        // manually verified convolution values
        double[] expected = {0.0, 1.0, 2.5, 4.0, 1.5};
        assertArrayEquals(expected, result, 1e-9);
    }

    @Test(expected = NullArgumentException.class)
    public void testConvolveNullX() {
        MathArrays.convolve(null, new double[]{1, 2});
    }

    @Test(expected = NullArgumentException.class)
    public void testConvolveNullH() {
        MathArrays.convolve(new double[]{1, 2}, null);
    }

    @Test(expected = NoDataException.class)
    public void testConvolveEmptyX() {
        MathArrays.convolve(new double[]{}, new double[]{1, 2});
    }

    @Test(expected = NoDataException.class)
    public void testConvolveEmptyH() {
        MathArrays.convolve(new double[]{1, 2}, new double[]{});
    }
}
```

---

## ตารางสรุป Branch/Condition Coverage

| กลุ่มเมธอดทดสอบ | Method ที่ทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| testScale*, testScaleInPlace | `scale`, `scaleInPlace` | loop ปกติ, ค่า factor=0 |
| testEbeAdd/Subtract/Multiply/Divide* | `ebeAdd/Subtract/Multiply/Divide` | if length ไม่เท่ากัน (throw), length เท่ากัน (loop ปกติ) |
| testDistance1/Distance/DistanceInf* | `distance1`, `distance`, `distanceInf` (double/int) | loop คำนวณปกติทั้ง double/int overload |
| testIsMonotonicGeneric* | `isMonotonic(T[],...)` | switch INCREASING/DECREASING, strict true/false, comp>=0 / comp>0, early return false, loop ครบ |
| testIsMonotonicDoubleArray* | `isMonotonic(double[],...)` | delegate ไป checkOrder true/false |
| testCheckOrder* | `checkOrder(double[],dir,strict,abort)` และ overload | INCREASING/DECREASING × strict/non-strict, index==max (true) vs early break (false), abort=true (throw) / false (return false), single-element, empty array (AIOOBE) |
| testCheckRectangular* | `checkRectangular` | null (NullArgumentException), mismatch length (throw), ok |
| testCheckPositive* | `checkPositive` | <=0 (throw), ok |
| testCheckNonNegative* | `checkNonNegative(long[])`, `(long[][])` | <0 (throw) ทั้ง 1D/2D, ok |
| testSafeNorm* | `safeNorm` | s1 branch (if/else r), s3 branch (if/else, xabs!=0), s2 branch, final if s1!=0 / s2==0 / s2>=x3max / s2<x3max |
| testSortInPlace* | `sortInPlace` (2 overload) | x null, y null, dimension mismatch, INCREASING/DECREASING comparator |
| testCopyOf* | `copyOf(int[]/double[], len)` | len<source, len=source, len>source (padding) |
| testLinearCombinationArray* | `linearCombination(double[],double[])` | dimension mismatch, normal, NaN fallback branch |
| testLinearCombination2/3/4Terms* | `linearCombination` overload 4,6,8 args | normal case, NaN fallback (`Double.isNaN(result)` true) |
| testEqualsFloat*/testEqualsIncludingNaNFloat* | `equals/equalsIncludingNaN(float[])` | null/null, one null, length mismatch, element mismatch, equal, NaN handling |
| testEqualsDouble*/testEqualsIncludingNaNDouble* | `equals/equalsIncludingNaN(double[])` | เหมือนด้านบนสำหรับ double[] |
| testNormalizeArray* | `normalizeArray` | infinite sum, NaN sum, infinite element, sum==0, NaN ignored, normal scaling |
| testBuildArray* | `buildArray(Field,len)`, `buildArray(Field,rows,cols)` | columns>=0 (fill zero), columns<0 (jagged, ไม่ fill) |
| testConvolve* | `convolve` | null x/h (NullArgumentException), empty x/h (NoDataException), normal while-loop k<hLen && j>=0 |

**หมายเหตุ:**
- บางพฤติกรรม (เช่น `checkOrder`/`isMonotonic` กับ array ว่าง throw `ArrayIndexOutOfBoundsException`) เป็นผลจากโค้ดจริงที่เข้าถึง `val[0]` โดยไม่ตรวจสอบความยาวก่อน ไม่ใช่การเดา behavior
- การทดสอบ `safeNorm` กรณี branch ซับซ้อน (s2<x3max) ใช้การตรวจสอบ sanity (non-negative, finite) เนื่องจากค่าที่แม่นยำขึ้นกับ floating-point rounding ของอัลกอริทึมโดยตรง
- `linearCombination` แบบ array (`linearCombination(double[],double[])`) เข้าถึง `prodHigh[1]` โดยไม่ตรวจสอบว่า `len>=2` จึงไม่ได้ทดสอบกรณี length=1 เพื่อเลี่ยง exception ที่ไม่เกี่ยวกับจุดประสงค์การทดสอบ