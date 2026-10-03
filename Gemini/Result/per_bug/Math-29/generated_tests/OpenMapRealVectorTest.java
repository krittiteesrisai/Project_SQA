package org.apache.commons.math3.linear;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class OpenMapRealVectorTest {

    private static final double EPS = 1e-12;

    @Test
    public void testConstructors() {
        // Default constructor
        OpenMapRealVector v0 = new OpenMapRealVector();
        Assert.assertEquals(0, v0.getDimension());

        // Dimension constructor
        OpenMapRealVector v1 = new OpenMapRealVector(5);
        Assert.assertEquals(5, v1.getDimension());

        // Dimension and epsilon constructor
        OpenMapRealVector v2 = new OpenMapRealVector(5, 1e-6);
        Assert.assertEquals(5, v2.getDimension());

        // Dimension and expectedSize constructor
        OpenMapRealVector v3 = new OpenMapRealVector(5, 2);
        Assert.assertEquals(5, v3.getDimension());

        // Dimension, expectedSize, and epsilon constructor
        OpenMapRealVector v4 = new OpenMapRealVector(5, 2, 1e-6);
        Assert.assertEquals(5, v4.getDimension());

        // double[] constructor
        double[] dArr = new double[]{0.0, 1.0, 0.0, 2.0};
        OpenMapRealVector v5 = new OpenMapRealVector(dArr);
        Assert.assertEquals(4, v5.getDimension());
        Assert.assertEquals(1.0, v5.getEntry(1), EPS);
        Assert.assertEquals(2.0, v5.getEntry(3), EPS);

        // double[] with custom epsilon
        OpenMapRealVector v6 = new OpenMapRealVector(new double[]{0.0, 1e-5, 2.0}, 1e-4);
        Assert.assertEquals(0.0, v6.getEntry(1), EPS);
        Assert.assertEquals(2.0, v6.getEntry(2), EPS);

        // Double[] constructor
        Double[] objArr = new Double[]{0.0, 3.0, 0.0};
        OpenMapRealVector v7 = new OpenMapRealVector(objArr);
        Assert.assertEquals(3, v7.getDimension());
        Assert.assertEquals(3.0, v7.getEntry(1), EPS);

        // Double[] with custom epsilon
        OpenMapRealVector v8 = new OpenMapRealVector(new Double[]{0.0, 1e-5, 4.0}, 1e-4);
        Assert.assertEquals(0.0, v8.getEntry(1), EPS);
        Assert.assertEquals(4.0, v8.getEntry(2), EPS);

        // Copy constructor from OpenMapRealVector
        OpenMapRealVector v9 = new OpenMapRealVector(v5);
        Assert.assertEquals(v5.getDimension(), v9.getDimension());
        Assert.assertEquals(v5.getEntry(1), v9.getEntry(1), EPS);

        // Copy constructor from generic RealVector (ArrayRealVector)
        RealVector rv = new ArrayRealVector(new double[]{0.0, 5.0, 0.0});
        OpenMapRealVector v10 = new OpenMapRealVector(rv);
        Assert.assertEquals(3, v10.getDimension());
        Assert.assertEquals(5.0, v10.getEntry(1), EPS);
    }

    @Test
    public void testSetEntryAndDefaultValueHandling() {
        OpenMapRealVector v = new OpenMapRealVector(3, 1e-5);
        
        // Put non-default value
        v.setEntry(0, 5.0);
        Assert.assertEquals(5.0, v.getEntry(0), EPS);

        // Put default value into existing key (triggers removal)
        v.setEntry(0, 1e-7);
        Assert.assertEquals(0.0, v.getEntry(0), EPS);

        // Put default value into non-existing key (does nothing)
        v.setEntry(1, 1e-7);
        Assert.assertEquals(0.0, v.getEntry(1), EPS);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetEntryNegativeIndex() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.getEntry(-1);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetEntryIndexOutOfBounds() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.getEntry(3);
    }

    @Test
    public void testAddOpenMapRealVectorBranches() {
        // Case 1: this.size > v.size (copyThis = true)
        OpenMapRealVector v1 = new OpenMapRealVector(4);
        v1.setEntry(0, 1.0);
        v1.setEntry(1, 2.0);
        v1.setEntry(2, 3.0);

        OpenMapRealVector v2 = new OpenMapRealVector(4);
        v2.setEntry(1, 10.0); // key overlap
        v2.setEntry(3, 20.0); // key only in v2

        OpenMapRealVector sum1 = v1.add(v2);
        Assert.assertEquals(1.0, sum1.getEntry(0), EPS);
        Assert.assertEquals(12.0, sum1.getEntry(1), EPS);
        Assert.assertEquals(3.0, sum1.getEntry(2), EPS);
        Assert.assertEquals(20.0, sum1.getEntry(3), EPS);

        // Case 2: this.size <= v.size (copyThis = false)
        OpenMapRealVector sum2 = v2.add(v1);
        Assert.assertEquals(1.0, sum2.getEntry(0), EPS);
        Assert.assertEquals(12.0, sum2.getEntry(1), EPS);
        Assert.assertEquals(3.0, sum2.getEntry(2), EPS);
        Assert.assertEquals(20.0, sum2.getEntry(3), EPS);

        // Generic RealVector branch
        RealVector generic = new ArrayRealVector(new double[]{1.0, 2.0, 3.0, 4.0});
        RealVector sumGeneric = v1.add(generic);
        Assert.assertEquals(2.0, sumGeneric.getEntry(0), EPS);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testAddDimensionMismatch() {
        OpenMapRealVector v1 = new OpenMapRealVector(3);
        OpenMapRealVector v2 = new OpenMapRealVector(4);
        v1.add(v2);
    }

    @Test
    public void testSubtractBranches() {
        OpenMapRealVector v1 = new OpenMapRealVector(3);
        v1.setEntry(0, 10.0);
        v1.setEntry(1, 20.0);

        OpenMapRealVector v2 = new OpenMapRealVector(3);
        v2.setEntry(1, 5.0);  // Key present in both
        v2.setEntry(2, 15.0); // Key only in v2

        OpenMapRealVector diff = v1.subtract(v2);
        Assert.assertEquals(10.0, diff.getEntry(0), EPS);
        Assert.assertEquals(15.0, diff.getEntry(1), EPS);
        Assert.assertEquals(-15.0, diff.getEntry(2), EPS);

        // Generic subtract
        RealVector generic = new ArrayRealVector(new double[]{2.0, 5.0, 1.0});
        RealVector diffGeneric = v1.subtract(generic);
        Assert.assertEquals(8.0, diffGeneric.getEntry(0), EPS);
    }

    @Test
    public void testDotProductBranches() {
        // Case 1: thisIsSmaller = true
        OpenMapRealVector v1 = new OpenMapRealVector(3);
        v1.setEntry(1, 2.0);

        OpenMapRealVector v2 = new OpenMapRealVector(3);
        v2.setEntry(0, 10.0);
        v2.setEntry(1, 3.0);

        Assert.assertEquals(6.0, v1.dotProduct(v2), EPS);

        // Case 2: thisIsSmaller = false
        Assert.assertEquals(6.0, v2.dotProduct(v1), EPS);

        // Generic dotProduct
        RealVector generic = new ArrayRealVector(new double[]{1.0, 4.0, 0.0});
        Assert.assertEquals(8.0, v1.dotProduct(generic), EPS);
    }

    @Test
    public void testAppendBranches() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 0.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{0.0, 2.0});

        // Append OpenMapRealVector
        OpenMapRealVector app1 = v1.append(v2);
        Assert.assertEquals(4, app1.getDimension());
        Assert.assertEquals(1.0, app1.getEntry(0), EPS);
        Assert.assertEquals(0.0, app1.getEntry(1), EPS);
        Assert.assertEquals(0.0, app1.getEntry(2), EPS);
        Assert.assertEquals(2.0, app1.getEntry(3), EPS);

        // Append generic RealVector
        RealVector generic = new ArrayRealVector(new double[]{3.0, 4.0});
        OpenMapRealVector app2 = v1.append(generic);
        Assert.assertEquals(4, app2.getDimension());
        Assert.assertEquals(3.0, app2.getEntry(2), EPS);
        Assert.assertEquals(4.0, app2.getEntry(3), EPS);

        // Append double
        OpenMapRealVector app3 = v1.append(5.0);
        Assert.assertEquals(3, app3.getDimension());
        Assert.assertEquals(5.0, app3.getEntry(2), EPS);
    }

    @Test
    public void testEbeDivideAndEbeMultiply() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{2.0, 0.0, 4.0});
        RealVector v2 = new ArrayRealVector(new double[]{2.0, 5.0, 2.0});

        OpenMapRealVector divided = v1.ebeDivide(v2);
        Assert.assertEquals(1.0, divided.getEntry(0), EPS);
        Assert.assertEquals(0.0, divided.getEntry(1), EPS);
        Assert.assertEquals(2.0, divided.getEntry(2), EPS);

        OpenMapRealVector multiplied = v1.ebeMultiply(v2);
        Assert.assertEquals(4.0, multiplied.getEntry(0), EPS);
        Assert.assertEquals(0.0, multiplied.getEntry(1), EPS);
        Assert.assertEquals(8.0, multiplied.getEntry(2), EPS);
    }

    @Test
    public void testGetSubVectorAndSetSubVector() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0, 4.0, 5.0});
        OpenMapRealVector sub = v.getSubVector(1, 3);
        Assert.assertEquals(3, sub.getDimension());
        Assert.assertEquals(2.0, sub.getEntry(0), EPS);
        Assert.assertEquals(3.0, sub.getEntry(1), EPS);
        Assert.assertEquals(4.0, sub.getEntry(2), EPS);

        // setSubVector
        OpenMapRealVector target = new OpenMapRealVector(5);
        target.setSubVector(1, new ArrayRealVector(new double[]{9.0, 8.0}));
        Assert.assertEquals(0.0, target.getEntry(0), EPS);
        Assert.assertEquals(9.0, target.getEntry(1), EPS);
        Assert.assertEquals(8.0, target.getEntry(2), EPS);
        Assert.assertEquals(0.0, target.getEntry(3), EPS);
    }

    @Test(expected = NotPositiveException.class)
    public void testGetSubVectorNegativeSize() {
        OpenMapRealVector v = new OpenMapRealVector(5);
        v.getSubVector(1, -1);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetSubVectorOutOfBounds() {
        OpenMapRealVector v = new OpenMapRealVector(5);
        v.getSubVector(2, 4); // 2 + 4 > 5
    }

    @Test
    public void testDistances() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{0.0, 4.0, 3.0});

        // L2 Distance
        double d2 = v1.getDistance(v2);
        Assert.assertEquals(Math.sqrt(1.0 + 16.0), d2, EPS);

        // Generic L2 Distance
        double d2Gen = v1.getDistance((RealVector) new ArrayRealVector(new double[]{0.0, 4.0, 3.0}));
        Assert.assertEquals(d2, d2Gen, EPS);

        // L1 Distance
        double d1 = v1.getL1Distance(v2);
        Assert.assertEquals(1.0 + 4.0, d1, EPS);

        // Generic L1 Distance
        double d1Gen = v1.getL1Distance((RealVector) new ArrayRealVector(new double[]{0.0, 4.0, 3.0}));
        Assert.assertEquals(d1, d1Gen, EPS);

        // LInf Distance
        // v1 has key 0 (1.0), key 2 (3.0); v2 has key 1 (4.0), key 2 (3.0)
        // delta for key 0 = |1-0|=1, key 2 = |3-3|=0. Only in v2: key 1 = 4.0 -> max should be 4.0
        double dinf = v1.getLInfDistance((RealVector) v2);
        Assert.assertEquals(4.0, dinf, EPS);

        // Generic LInf Distance
        double dinfGen = v1.getLInfDistance((RealVector) new ArrayRealVector(new double[]{0.0, 4.0, 3.0}));
        Assert.assertEquals(dinf, dinfGen, EPS);
    }

    @Test
    public void testIsInfiniteAndIsNaN() {
        OpenMapRealVector vNormal = new OpenMapRealVector(new double[]{1.0, 2.0});
        Assert.assertFalse(vNormal.isInfinite());
        Assert.assertFalse(vNormal.isNaN());

        OpenMapRealVector vInf = new OpenMapRealVector(new double[]{1.0, Double.POSITIVE_INFINITY});
        Assert.assertTrue(vInf.isInfinite());
        Assert.assertFalse(vInf.isNaN());

        OpenMapRealVector vNaN = new OpenMapRealVector(new double[]{1.0, Double.NaN});
        Assert.assertFalse(vNaN.isInfinite());
        Assert.assertTrue(vNaN.isNaN());

        // Vector containing both NaN and Inf -> isInfinite should return false
        OpenMapRealVector vBoth = new OpenMapRealVector(new double[]{Double.POSITIVE_INFINITY, Double.NaN});
        Assert.assertFalse(vBoth.isInfinite());
        Assert.assertTrue(vBoth.isNaN());
    }

    @Test
    public void testMapAddAndMapAddToSelfAndSet() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 0.0, 2.0});
        OpenMapRealVector vAdded = v.mapAdd(2.0);
        Assert.assertEquals(3.0, vAdded.getEntry(0), EPS);
        Assert.assertEquals(2.0, vAdded.getEntry(1), EPS);
        Assert.assertEquals(4.0, vAdded.getEntry(2), EPS);

        // Ensure v is unchanged
        Assert.assertEquals(1.0, v.getEntry(0), EPS);

        // mapAddToSelf
        v.mapAddToSelf(2.0);
        Assert.assertEquals(3.0, v.getEntry(0), EPS);
        Assert.assertEquals(2.0, v.getEntry(1), EPS);
        Assert.assertEquals(4.0, v.getEntry(2), EPS);

        // set(value)
        v.set(5.0);
        for (int i = 0; i < v.getDimension(); i++) {
            Assert.assertEquals(5.0, v.getEntry(i), EPS);
        }
    }

    @Test
    public void testProjection() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        RealVector v2 = new ArrayRealVector(new double[]{0.0, 1.0, 0.0});
        RealVector proj = v1.projection(v2);
        Assert.assertEquals(0.0, proj.getEntry(0), EPS);
        Assert.assertEquals(2.0, proj.getEntry(1), EPS);
        Assert.assertEquals(0.0, proj.getEntry(2), EPS);
    }

    @Test
    public void testUnitVectorAndUnitize() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{3.0, 0.0, 4.0});
        OpenMapRealVector unit = v.unitVector();
        Assert.assertEquals(0.6, unit.getEntry(0), EPS);
        Assert.assertEquals(0.0, unit.getEntry(1), EPS);
        Assert.assertEquals(0.8, unit.getEntry(2), EPS);

        v.unitize();
        Assert.assertEquals(0.6, v.getEntry(0), EPS);
        Assert.assertEquals(0.8, v.getEntry(2), EPS);
    }

    @Test(expected = MathArithmeticException.class)
    public void testUnitizeZeroVector() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.unitize();
    }

    @Test
    public void testToArrayAndSparsity() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{0.0, 5.0, 0.0, 10.0});
        double[] arr = v.toArray();
        Assert.assertArrayEquals(new double[]{0.0, 5.0, 0.0, 10.0}, arr, EPS);
        Assert.assertEquals(0.5, v.getSparsity(), EPS); // 2 non-zero out of 4
    }

    @Test
    public void testEqualsAndHashCode() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 0.0, 2.0}, 1e-6);
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{1.0, 0.0, 2.0}, 1e-6);
        OpenMapRealVector v3 = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0}, 1e-6);
        OpenMapRealVector vDiffDim = new OpenMapRealVector(new double[]{1.0, 0.0}, 1e-6);
        OpenMapRealVector vDiffEps = new OpenMapRealVector(new double[]{1.0, 0.0, 2.0}, 1e-4);

        // Same instance
        Assert.assertTrue(v1.equals(v1));
        // Null / Non-vector object
        Assert.assertFalse(v1.equals(null));
        Assert.assertFalse(v1.equals("SomeString"));
        // Equal vectors
        Assert.assertTrue(v1.equals(v2));
        Assert.assertEquals(v1.hashCode(), v2.hashCode());
        // Different dimension
        Assert.assertFalse(v1.equals(vDiffDim));
        // Different epsilon
        Assert.assertFalse(v1.equals(vDiffEps));
        // Different entries (this -> other)
        Assert.assertFalse(v1.equals(v3));
        // Different entries (other -> this)
        OpenMapRealVector v4 = new OpenMapRealVector(new double[]{1.0, 5.0, 2.0}, 1e-6);
        Assert.assertFalse(v1.equals(v4));
    }

    @Test
    public void testSparseIterator() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{0.0, 10.0, 0.0, 20.0});
        Iterator<RealVector.Entry> it = v.sparseIterator();

        int count = 0;
        while (it.hasNext()) {
            RealVector.Entry entry = it.next();
            count++;
            if (entry.getIndex() == 1) {
                Assert.assertEquals(10.0, entry.getValue(), EPS);
                entry.setValue(15.0);
            } else if (entry.getIndex() == 3) {
                Assert.assertEquals(20.0, entry.getValue(), EPS);
            }
        }
        Assert.assertEquals(2, count);
        Assert.assertEquals(15.0, v.getEntry(1), EPS);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSparseIteratorRemove() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 2.0});
        Iterator<RealVector.Entry> it = v.sparseIterator();
        it.remove();
    }
}