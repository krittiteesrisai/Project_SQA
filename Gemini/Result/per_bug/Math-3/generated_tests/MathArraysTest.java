package org.apache.commons.math3.util;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NonMonotonicSequenceException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.fraction.Fraction;
import org.apache.commons.math3.fraction.FractionField;
import org.junit.Assert;
import org.junit.Test;

public class MathArraysTest {

    private static final double EPSILON = 1e-15;

    // ==========================================
    // scale & scaleInPlace Tests
    // ==========================================

    @Test
    public void testScale() {
        double[] test = new double[] { 1.0, -2.0, 3.5 };
        double[] scaled = MathArrays.scale(2.0, test);
        Assert.assertArrayEquals(new double[] { 2.0, -4.0, 7.0 }, scaled, EPSILON);
        // Original array must not be modified
        Assert.assertEquals(1.0, test[0], EPSILON);

        double[] empty = new double[0];
        Assert.assertEquals(0, MathArrays.scale(5.0, empty).length);
    }

    @Test
    public void testScaleInPlace() {
        double[] test = new double[] { 1.0, -2.0, 3.5 };
        MathArrays.scaleInPlace(-2.0, test);
        Assert.assertArrayEquals(new double[] { -2.0, 4.0, -7.0 }, test, EPSILON);
    }

    // ==========================================
    // ebe* (Element-by-Element) Tests
    // ==========================================

    @Test
    public void testEbeAdd() {
        double[] a = { 1, 2, 3 };
        double[] b = { 4, 5, 6 };
        Assert.assertArrayEquals(new double[] { 5, 7, 9 }, MathArrays.ebeAdd(a, b), EPSILON);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testEbeAddDimensionMismatch() {
        MathArrays.ebeAdd(new double[] { 1 }, new double[] { 1, 2 });
    }

    @Test
    public void testEbeSubtract() {
        double[] a = { 5, 7, 9 };
        double[] b = { 1, 2, 4 };
        Assert.assertArrayEquals(new double[] { 4, 5, 5 }, MathArrays.ebeSubtract(a, b), EPSILON);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testEbeSubtractDimensionMismatch() {
        MathArrays.ebeSubtract(new double[] { 1, 2 }, new double[] { 1 });
    }

    @Test
    public void testEbeMultiply() {
        double[] a = { 2, -3, 4 };
        double[] b = { 3, 2, -1 };
        Assert.assertArrayEquals(new double[] { 6, -6, -4 }, MathArrays.ebeMultiply(a, b), EPSILON);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testEbeMultiplyDimensionMismatch() {
        MathArrays.ebeMultiply(new double[] { 1 }, new double[0]);
    }

    @Test
    public void testEbeDivide() {
        double[] a = { 6, -6, 4 };
        double[] b = { 3, 2, 2 };
        Assert.assertArrayEquals(new double[] { 2, -3, 2 }, MathArrays.ebeDivide(a, b), EPSILON);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testEbeDivideDimensionMismatch() {
        MathArrays.ebeDivide(new double[0], new double[] { 1 });
    }

    // ==========================================
    // Distance Functions Tests
    // ==========================================

    @Test
    public void testDistancesDouble() {
        double[] p1 = { 1.0, -2.0, 3.0 };
        double[] p2 = { 4.0, 2.0, 3.0 };

        Assert.assertEquals(7.0, MathArrays.distance1(p1, p2), EPSILON);
        Assert.assertEquals(5.0, MathArrays.distance(p1, p2), EPSILON);
        Assert.assertEquals(4.0, MathArrays.distanceInf(p1, p2), EPSILON);
    }

    @Test
    public void testDistancesInt() {
        int[] p1 = { 1, -2, 3 };
        int[] p2 = { 4, 2, 3 };

        Assert.assertEquals(7, MathArrays.distance1(p1, p2));
        Assert.assertEquals(5.0, MathArrays.distance(p1, p2), EPSILON);
        Assert.assertEquals(4, MathArrays.distanceInf(p1, p2));
    }

    // ==========================================
    // Monotonicity and checkOrder Tests
    // ==========================================

    @Test
    public void testIsMonotonicComparable() {
        Integer[] incStrict = { 1, 2, 3 };
        Integer[] incNonStrict = { 1, 2, 2, 3 };
        Integer[] decStrict = { 3, 2, 1 };
        Integer[] decNonStrict = { 3, 2, 2, 1 };
        Integer[] nonMono = { 1, 3, 2 };

        // Increasing
        Assert.assertTrue(MathArrays.isMonotonic(incStrict, MathArrays.OrderDirection.INCREASING, true));
        Assert.assertFalse(MathArrays.isMonotonic(incNonStrict, MathArrays.OrderDirection.INCREASING, true));
        Assert.assertTrue(MathArrays.isMonotonic(incNonStrict, MathArrays.OrderDirection.INCREASING, false));
        Assert.assertFalse(MathArrays.isMonotonic(nonMono, MathArrays.OrderDirection.INCREASING, false));

        // Decreasing
        Assert.assertTrue(MathArrays.isMonotonic(decStrict, MathArrays.OrderDirection.DECREASING, true));
        Assert.assertFalse(MathArrays.isMonotonic(decNonStrict, MathArrays.OrderDirection.DECREASING, true));
        Assert.assertTrue(MathArrays.isMonotonic(decNonStrict, MathArrays.OrderDirection.DECREASING, false));
        Assert.assertFalse(MathArrays.isMonotonic(nonMono, MathArrays.OrderDirection.DECREASING, false));
    }

    @Test
    public void testCheckOrderDouble() {
        double[] inc = { 1.0, 2.0, 3.0 };
        double[] incDup = { 1.0, 2.0, 2.0 };
        double[] dec = { 3.0, 2.0, 1.0 };
        double[] decDup = { 3.0, 2.0, 2.0 };
        double[] single = { 42.0 };

        Assert.assertTrue(MathArrays.checkOrder(inc, MathArrays.OrderDirection.INCREASING, true, false));
        Assert.assertFalse(MathArrays.checkOrder(incDup, MathArrays.OrderDirection.INCREASING, true, false));
        Assert.assertTrue(MathArrays.checkOrder(incDup, MathArrays.OrderDirection.INCREASING, false, false));

        Assert.assertTrue(MathArrays.checkOrder(dec, MathArrays.OrderDirection.DECREASING, true, false));
        Assert.assertFalse(MathArrays.checkOrder(decDup, MathArrays.OrderDirection.DECREASING, true, false));
        Assert.assertTrue(MathArrays.checkOrder(decDup, MathArrays.OrderDirection.DECREASING, false, false));

        Assert.assertTrue(MathArrays.checkOrder(single, MathArrays.OrderDirection.INCREASING, true, false));
        Assert.assertTrue(MathArrays.isMonotonic(inc, MathArrays.OrderDirection.INCREASING, true));

        // Convenience overloads
        MathArrays.checkOrder(inc);
        MathArrays.checkOrder(dec, MathArrays.OrderDirection.DECREASING, true);
    }

    @Test(expected = NonMonotonicSequenceException.class)
    public void testCheckOrderAbortIncreasing() {
        MathArrays.checkOrder(new double[] { 1, 3, 2 }, MathArrays.OrderDirection.INCREASING, true);
    }

    @Test(expected = NonMonotonicSequenceException.class)
    public void testCheckOrderAbortDecreasing() {
        MathArrays.checkOrder(new double[] { 3, 1, 2 }, MathArrays.OrderDirection.DECREASING, true);
    }

    // ==========================================
    // checkRectangular / Positive / NonNegative
    // ==========================================

    @Test(expected = NullArgumentException.class)
    public void testCheckRectangularNull() {
        MathArrays.checkRectangular(null);
    }

    @Test
    public void testCheckRectangularValid() {
        long[][] m = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        MathArrays.checkRectangular(m);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testCheckRectangularInvalid() {
        long[][] m = { { 1, 2 }, { 3 } };
        MathArrays.checkRectangular(m);
    }

    @Test
    public void testCheckPositive() {
        MathArrays.checkPositive(new double[] { 0.1, 1.0, 500.0 });
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testCheckPositiveWithZero() {
        MathArrays.checkPositive(new double[] { 1.0, 0.0, 2.0 });
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testCheckPositiveWithNegative() {
        MathArrays.checkPositive(new double[] { 1.0, -0.5, 2.0 });
    }

    @Test
    public void testCheckNonNegative1D() {
        MathArrays.checkNonNegative(new long[] { 0L, 5L, 10L });
    }

    @Test(expected = NotPositiveException.class)
    public void testCheckNonNegative1DInvalid() {
        MathArrays.checkNonNegative(new long[] { 0L, -1L, 10L });
    }

    @Test
    public void testCheckNonNegative2D() {
        MathArrays.checkNonNegative(new long[][] { { 0L, 1L }, { 2L, 0L } });
    }

    @Test(expected = NotPositiveException.class)
    public void testCheckNonNegative2DInvalid() {
        MathArrays.checkNonNegative(new long[][] { { 0L, 1L }, { -2L, 0L } });
    }

    // ==========================================
    // safeNorm Tests (Underflow, Overflow, Zero)
    // ==========================================

    @Test
    public void testSafeNorm() {
        // Normal range
        Assert.assertEquals(5.0, MathArrays.safeNorm(new double[] { 3.0, 4.0 }), EPSILON);

        // Zero
        Assert.assertEquals(0.0, MathArrays.safeNorm(new double[] { 0.0, 0.0 }), EPSILON);

        // Giant numbers (overflow prevention branch)
        double[] giant = { 1e150, 1e150 };
        Assert.assertEquals(FastMath.sqrt(2.0) * 1e150, MathArrays.safeNorm(giant), 1e135);

        // Dwarf numbers (underflow prevention branch)
        double[] dwarf = { 1e-150, 1e-150 };
        Assert.assertEquals(FastMath.sqrt(2.0) * 1e-150, MathArrays.safeNorm(dwarf), 1e-165);

        // Mixed normal and dwarf
        double[] mixed = { 3.0, 4.0, 1e-100 };
        Assert.assertEquals(5.0, MathArrays.safeNorm(mixed), EPSILON);
    }

    // ==========================================
    // sortInPlace Tests
    // ==========================================

    @Test
    public void testSortInPlaceIncreasing() {
        double[] x = { 3.0, 1.0, 2.0 };
        double[] y = { 30.0, 10.0, 20.0 };
        double[] z = { 300.0, 100.0, 200.0 };

        MathArrays.sortInPlace(x, y, z);
        Assert.assertArrayEquals(new double[] { 1.0, 2.0, 3.0 }, x, EPSILON);
        Assert.assertArrayEquals(new double[] { 10.0, 20.0, 30.0 }, y, EPSILON);
        Assert.assertArrayEquals(new double[] { 100.0, 200.0, 300.0 }, z, EPSILON);
    }

    @Test
    public void testSortInPlaceDecreasing() {
        double[] x = { 3.0, 1.0, 2.0 };
        double[] y = { 30.0, 10.0, 20.0 };

        MathArrays.sortInPlace(x, MathArrays.OrderDirection.DECREASING, y);
        Assert.assertArrayEquals(new double[] { 3.0, 2.0, 1.0 }, x, EPSILON);
        Assert.assertArrayEquals(new double[] { 30.0, 20.0, 10.0 }, y, EPSILON);
    }

    @Test(expected = NullArgumentException.class)
    public void testSortInPlaceNullX() {
        MathArrays.sortInPlace(null, new double[] { 1 });
    }

    @Test(expected = NullArgumentException.class)
    public void testSortInPlaceNullY() {
        MathArrays.sortInPlace(new double[] { 1 }, (double[]) null);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testSortInPlaceDimensionMismatch() {
        MathArrays.sortInPlace(new double[] { 1, 2 }, new double[] { 1 });
    }

    // ==========================================
    // copyOf Tests
    // ==========================================

    @Test
    public void testCopyOfInt() {
        int[] src = { 1, 2, 3 };
        Assert.assertArrayEquals(new int[] { 1, 2, 3 }, MathArrays.copyOf(src));
        Assert.assertArrayEquals(new int[] { 1, 2 }, MathArrays.copyOf(src, 2));
        Assert.assertArrayEquals(new int[] { 1, 2, 3, 0, 0 }, MathArrays.copyOf(src, 5));
    }

    @Test
    public void testCopyOfDouble() {
        double[] src = { 1.5, 2.5, 3.5 };
        Assert.assertArrayEquals(new double[] { 1.5, 2.5, 3.5 }, MathArrays.copyOf(src), EPSILON);
        Assert.assertArrayEquals(new double[] { 1.5 }, MathArrays.copyOf(src, 1), EPSILON);
        Assert.assertArrayEquals(new double[] { 1.5, 2.5, 3.5, 0.0 }, MathArrays.copyOf(src, 4), EPSILON);
    }

    // ==========================================
    // linearCombination Tests (Covering Defect Edge-Cases)
    // ==========================================

    @Test
    public void testLinearCombinationArrayNormal() {
        double[] a = { -1e-100, 1.0, 1e100, 1e100 };
        double[] b = { 1e100, 1e100, -1e-100, 1e-100 };
        // a[0]*b[0] = -1, a[1]*b[1] = 1e100, a[2]*b[2] = -1, a[3]*b[3] = 1
        // sum = 1e100 - 1
        double dot = MathArrays.linearCombination(a, b);
        Assert.assertEquals(1e100 - 1.0, dot, 1e85);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testLinearCombinationDimensionMismatch() {
        MathArrays.linearCombination(new double[] { 1.0, 2.0 }, new double[] { 1.0 });
    }

    @Test
    public void testLinearCombinationArrayWithNaNAndInf() {
        double[] a = { Double.NaN, 2.0 };
        double[] b = { 1.0, 3.0 };
        Assert.assertTrue(Double.isNaN(MathArrays.linearCombination(a, b)));

        double[] aInf = { Double.POSITIVE_INFINITY, 2.0 };
        double[] bInf = { 1.0, 3.0 };
        Assert.assertTrue(Double.isInfinite(MathArrays.linearCombination(aInf, bInf)));
    }

    @Test
    public void testLinearCombination2Terms() {
        double res = MathArrays.linearCombination(10.0, 2.0, -3.0, 4.0);
        Assert.assertEquals(8.0, res, EPSILON);

        // Fallback on NaN/Inf
        double nanRes = MathArrays.linearCombination(Double.NaN, 1.0, 2.0, 3.0);
        Assert.assertTrue(Double.isNaN(nanRes));
    }

    @Test
    public void testLinearCombination3Terms() {
        double res = MathArrays.linearCombination(1.0, 2.0, 3.0, 4.0, 5.0, 6.0);
        Assert.assertEquals(44.0, res, EPSILON);

        // Fallback on NaN
        double nanRes = MathArrays.linearCombination(1.0, 2.0, Double.NaN, 4.0, 5.0, 6.0);
        Assert.assertTrue(Double.isNaN(nanRes));
    }

    @Test
    public void testLinearCombination4Terms() {
        double res = MathArrays.linearCombination(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0);
        Assert.assertEquals(100.0, res, EPSILON);

        // Fallback on NaN
        double nanRes = MathArrays.linearCombination(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, Double.NaN, 8.0);
        Assert.assertTrue(Double.isNaN(nanRes));
    }

    // ==========================================
    // equals & equalsIncludingNaN Tests
    // ==========================================

    @Test
    public void testEqualsDouble() {
        Assert.assertTrue(MathArrays.equals((double[]) null, (double[]) null));
        Assert.assertFalse(MathArrays.equals(new double[] { 1.0 }, null));
        Assert.assertFalse(MathArrays.equals(null, new double[] { 1.0 }));
        Assert.assertFalse(MathArrays.equals(new double[] { 1.0 }, new double[] { 1.0, 2.0 }));
        Assert.assertFalse(MathArrays.equals(new double[] { 1.0 }, new double[] { 2.0 }));
        Assert.assertTrue(MathArrays.equals(new double[] { 1.0, 2.0 }, new double[] { 1.0, 2.0 }));

        // NaN equality
        Assert.assertFalse(MathArrays.equals(new double[] { Double.NaN }, new double[] { Double.NaN }));
        Assert.assertTrue(MathArrays.equalsIncludingNaN(new double[] { Double.NaN }, new double[] { Double.NaN }));
        Assert.assertTrue(MathArrays.equalsIncludingNaN((double[]) null, (double[]) null));
        Assert.assertFalse(MathArrays.equalsIncludingNaN(new double[] { 1.0 }, new double[] { 1.0, 2.0 }));
    }

    @Test
    public void testEqualsFloat() {
        Assert.assertTrue(MathArrays.equals((float[]) null, (float[]) null));
        Assert.assertFalse(MathArrays.equals(new float[] { 1.0f }, null));
        Assert.assertFalse(MathArrays.equals(null, new float[] { 1.0f }));
        Assert.assertFalse(MathArrays.equals(new float[] { 1.0f }, new float[] { 1.0f, 2.0f }));
        Assert.assertFalse(MathArrays.equals(new float[] { 1.0f }, new float[] { 2.0f }));
        Assert.assertTrue(MathArrays.equals(new float[] { 1.0f, 2.0f }, new float[] { 1.0f, 2.0f }));

        // Float NaN equality
        Assert.assertFalse(MathArrays.equals(new float[] { Float.NaN }, new float[] { Float.NaN }));
        Assert.assertTrue(MathArrays.equalsIncludingNaN(new float[] { Float.NaN }, new float[] { Float.NaN }));
        Assert.assertTrue(MathArrays.equalsIncludingNaN((float[]) null, (float[]) null));
        Assert.assertFalse(MathArrays.equalsIncludingNaN(new float[] { 1.0f }, new float[] { 1.0f, 2.0f }));
    }

    // ==========================================
    // normalizeArray Tests
    // ==========================================

    @Test
    public void testNormalizeArrayNormal() {
        double[] values = { 1.0, 2.0, 3.0, Double.NaN };
        double[] normalized = MathArrays.normalizeArray(values, 12.0);
        // Non-NaN sum = 6.0; factor = 12 / 6 = 2
        Assert.assertEquals(2.0, normalized[0], EPSILON);
        Assert.assertEquals(4.0, normalized[1], EPSILON);
        Assert.assertEquals(6.0, normalized[2], EPSILON);
        Assert.assertTrue(Double.isNaN(normalized[3]));
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testNormalizeArrayInfiniteTarget() {
        MathArrays.normalizeArray(new double[] { 1.0 }, Double.POSITIVE_INFINITY);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testNormalizeArrayNanTarget() {
        MathArrays.normalizeArray(new double[] { 1.0 }, Double.NaN);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testNormalizeArrayContainsInfinite() {
        MathArrays.normalizeArray(new double[] { 1.0, Double.NEGATIVE_INFINITY }, 5.0);
    }

    @Test(expected = MathArithmeticException.class)
    public void testNormalizeArrayZeroSum() {
        MathArrays.normalizeArray(new double[] { -2.0, 2.0 }, 10.0);
    }

    // ==========================================
    // buildArray Tests
    // ==========================================

    @Test
    public void testBuildArray() {
        FractionField field = FractionField.getInstance();

        // 1D
        Fraction[] arr1D = MathArrays.buildArray(field, 3);
        Assert.assertEquals(3, arr1D.length);
        for (Fraction f : arr1D) {
            Assert.assertEquals(Fraction.ZERO, f);
        }

        // 2D Full
        Fraction[][] arr2D = MathArrays.buildArray(field, 2, 4);
        Assert.assertEquals(2, arr2D.length);
        Assert.assertEquals(4, arr2D[0].length);
        for (Fraction[] row : arr2D) {
            for (Fraction f : row) {
                Assert.assertEquals(Fraction.ZERO, f);
            }
        }

        // 2D Partial (columns < 0)
        Fraction[][] arrPartial = MathArrays.buildArray(field, 3, -1);
        Assert.assertEquals(3, arrPartial.length);
        Assert.assertNull(arrPartial[0]);
    }

    // ==========================================
    // convolve Tests
    // ==========================================

    @Test
    public void testConvolveNormal() {
        double[] x = { 1.0, 2.0, 3.0 };
        double[] h = { 0.5, 1.0 };
        // Length = 3 + 2 - 1 = 4
        // y[0] = 1*0.5 = 0.5
        // y[1] = 1*1.0 + 2*0.5 = 2.0
        // y[2] = 2*1.0 + 3*0.5 = 3.5
        // y[3] = 3*1.0 = 3.0
        double[] y = MathArrays.convolve(x, h);
        Assert.assertArrayEquals(new double[] { 0.5, 2.0, 3.5, 3.0 }, y, EPSILON);
    }

    @Test(expected = NullArgumentException.class)
    public void testConvolveNullX() {
        MathArrays.convolve(null, new double[] { 1 });
    }

    @Test(expected = NullArgumentException.class)
    public void testConvolveNullH() {
        MathArrays.convolve(new double[] { 1 }, null);
    }

    @Test(expected = NoDataException.class)
    public void testConvolveEmptyX() {
        MathArrays.convolve(new double[0], new double[] { 1 });
    }

    @Test(expected = NoDataException.class)
    public void testConvolveEmptyH() {
        MathArrays.convolve(new double[] { 1 }, new double[0]);
    }
}