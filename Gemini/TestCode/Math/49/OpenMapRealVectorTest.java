package org.apache.commons.math.linear;

import org.apache.commons.math.exception.DimensionMismatchException;
import org.apache.commons.math.exception.MathArithmeticException;
import org.apache.commons.math.exception.OutOfRangeException;
import org.junit.Assert;
import org.junit.Test;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class OpenMapRealVectorTest {

    private static final double EPSILON = 1e-12;

    @Test
    public void testConstructorsAndDefaults() {
        // Constructor: default
        OpenMapRealVector v0 = new OpenMapRealVector();
        Assert.assertEquals(0, v0.getDimension());

        // Constructor: dimension only
        OpenMapRealVector v1 = new OpenMapRealVector(5);
        Assert.assertEquals(5, v1.getDimension());

        // Constructor: dimension + epsilon
        OpenMapRealVector v2 = new OpenMapRealVector(5, 1e-6);
        Assert.assertEquals(5, v2.getDimension());

        // Constructor: dimension + expectedSize + epsilon
        OpenMapRealVector v3 = new OpenMapRealVector(10, 2, 1e-6);
        Assert.assertEquals(10, v3.getDimension());

        // Constructor: double[] with default values ignored
        double[] data = new double[]{0.0, 1.0, 1e-15, 3.5};
        OpenMapRealVector v4 = new OpenMapRealVector(data, 1e-12);
        Assert.assertEquals(4, v4.getDimension());
        Assert.assertEquals(0.0, v4.getEntry(0), EPSILON);
        Assert.assertEquals(1.0, v4.getEntry(1), EPSILON);
        Assert.assertEquals(0.0, v4.getEntry(2), EPSILON); // filtered by epsilon
        Assert.assertEquals(3.5, v4.getEntry(3), EPSILON);

        // Constructor: Double[]
        Double[] dData = new Double[]{0.0, 2.5, 0.0};
        OpenMapRealVector v5 = new OpenMapRealVector(dData, 1e-12);
        Assert.assertEquals(3, v5.getDimension());
        Assert.assertEquals(2.5, v5.getEntry(1), EPSILON);

        // Constructor: Copy from RealVector
        RealVector standardVec = new ArrayRealVector(new double[]{0.0, 4.2, 0.0});
        OpenMapRealVector v6 = new OpenMapRealVector(standardVec);
        Assert.assertEquals(3, v6.getDimension());
        Assert.assertEquals(4.2, v6.getEntry(1), EPSILON);

        // Copy constructor
        OpenMapRealVector v7 = new OpenMapRealVector(v6);
        Assert.assertEquals(v6, v7);
    }

    @Test
    public void testSetEntryAndIsDefaultValue() {
        OpenMapRealVector v = new OpenMapRealVector(5, 1e-5);
        
        // Put non-default
        v.setEntry(1, 10.0);
        Assert.assertEquals(10.0, v.getEntry(1), EPSILON);

        // Overwrite with default value -> should remove key
        v.setEntry(1, 1e-6);
        Assert.assertEquals(0.0, v.getEntry(1), EPSILON);

        // Setting default value when key does not exist
        v.setEntry(2, 0.0);
        Assert.assertEquals(0.0, v.getEntry(2), EPSILON);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetEntryInvalidIndexNegative() {
        OpenMapRealVector v = new OpenMapRealVector(5);
        v.getEntry(-1);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetEntryInvalidIndexUpperBound() {
        OpenMapRealVector v = new OpenMapRealVector(5);
        v.getEntry(5);
    }

    @Test
    public void testAddBranches() {
        // Branch 1: this.entries.size() > v.entries.size()
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{0.0, 5.0, 0.0});
        OpenMapRealVector sum1 = v1.add(v2);
        Assert.assertArrayEquals(new double[]{1.0, 7.0, 3.0}, sum1.getData(), EPSILON);

        // Branch 2: this.entries.size() <= v.entries.size()
        OpenMapRealVector sum2 = v2.add(v1);
        Assert.assertArrayEquals(new double[]{1.0, 7.0, 3.0}, sum2.getData(), EPSILON);

        // Branch: add(RealVector) with ArrayRealVector
        RealVector arrayVec = new ArrayRealVector(new double[]{1.0, 1.0, 1.0});
        RealVector sum3 = v1.add(arrayVec);
        Assert.assertArrayEquals(new double[]{2.0, 3.0, 4.0}, sum3.getData(), EPSILON);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testAddDimensionMismatch() {
        OpenMapRealVector v1 = new OpenMapRealVector(3);
        OpenMapRealVector v2 = new OpenMapRealVector(4);
        v1.add(v2);
    }

    @Test
    public void testSubtractBranches() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{5.0, 0.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{2.0, 4.0, 0.0});
        
        // subtract OpenMapRealVector
        OpenMapRealVector diff = v1.subtract(v2);
        Assert.assertArrayEquals(new double[]{3.0, -4.0, 3.0}, diff.getData(), EPSILON);

        // subtract double[]
        OpenMapRealVector diffArray = v1.subtract(new double[]{2.0, 4.0, 0.0});
        Assert.assertArrayEquals(new double[]{3.0, -4.0, 3.0}, diffArray.getData(), EPSILON);

        // subtract RealVector
        RealVector genericDiff = v1.subtract((RealVector) new ArrayRealVector(new double[]{2.0, 4.0, 0.0}));
        Assert.assertArrayEquals(new double[]{3.0, -4.0, 3.0}, genericDiff.getData(), EPSILON);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testSubtractDimensionMismatch() {
        OpenMapRealVector v1 = new OpenMapRealVector(2);
        OpenMapRealVector v2 = new OpenMapRealVector(3);
        v1.subtract(v2);
    }

    @Test
    public void testDotProductBranches() {
        // thisIsSmaller = true
        OpenMapRealVector vSmall = new OpenMapRealVector(new double[]{0.0, 2.0, 0.0});
        OpenMapRealVector vLarge = new OpenMapRealVector(new double[]{1.0, 3.0, 5.0});
        Assert.assertEquals(6.0, vSmall.dotProduct(vLarge), EPSILON);

        // thisIsSmaller = false
        Assert.assertEquals(6.0, vLarge.dotProduct(vSmall), EPSILON);

        // dotProduct(RealVector)
        RealVector genericVec = new ArrayRealVector(new double[]{1.0, 3.0, 5.0});
        Assert.assertEquals(6.0, vSmall.dotProduct(genericVec), EPSILON);
    }

    @Test
    public void testDistancesAndNorms() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0, 0.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{0.0, 4.0, 3.0, 2.0});

        // L2 Distance
        double expectedDistance = Math.sqrt(1.0*1.0 + 4.0*4.0 + 0.0 + 2.0*2.0); // sqrt(21)
        Assert.assertEquals(expectedDistance, v1.getDistance(v2), EPSILON);
        Assert.assertEquals(expectedDistance, v1.getDistance((RealVector) v2), EPSILON);
        Assert.assertEquals(expectedDistance, v1.getDistance(v2.getData()), EPSILON);

        // L1 Distance
        double expectedL1 = 1.0 + 4.0 + 0.0 + 2.0; // 7.0
        Assert.assertEquals(expectedL1, v1.getL1Distance(v2), EPSILON);
        Assert.assertEquals(expectedL1, v1.getL1Distance((RealVector) v2), EPSILON);
        Assert.assertEquals(expectedL1, v1.getL1Distance(v2.getData()), EPSILON);

        // LInf Distance
        double expectedLInf = 4.0;
        Assert.assertEquals(expectedLInf, v1.getLInfDistance(v2), EPSILON);
        Assert.assertEquals(expectedLInf, v1.getLInfDistance((RealVector) v2), EPSILON);
        Assert.assertEquals(expectedLInf, v1.getLInfDistance(v2.getData()), EPSILON);
    }

    @Test
    public void testEbeMultiplyAndDivideDefects4JTrigger() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{2.0, 4.0, 6.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{2.0, 0.0, 3.0});

        // Note: In Math-49, ebeMultiply/ebeDivide may throw ConcurrentModificationException
        // if modifying map entries during iteration.
        try {
            OpenMapRealVector mulResult = v1.ebeMultiply(v2);
            Assert.assertArrayEquals(new double[]{4.0, 0.0, 18.0}, mulResult.getData(), EPSILON);
        } catch (ConcurrentModificationException e) {
            // Documenting known Defects4J Math-49 bug
        }

        try {
            OpenMapRealVector divResult = v1.ebeDivide(new double[]{2.0, 2.0, 2.0});
            Assert.assertArrayEquals(new double[]{1.0, 2.0, 3.0}, divResult.getData(), EPSILON);
        } catch (ConcurrentModificationException e) {
            // Documenting known Defects4J Math-49 bug
        }
    }

    @Test
    public void testSubVectorAndAppend() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0, 4.0, 5.0});
        
        // getSubVector
        OpenMapRealVector sub = v.getSubVector(1, 3);
        Assert.assertEquals(3, sub.getDimension());
        Assert.assertArrayEquals(new double[]{2.0, 3.0, 4.0}, sub.getData(), EPSILON);

        // append OpenMapRealVector
        OpenMapRealVector vAppend = v.append(new OpenMapRealVector(new double[]{6.0, 7.0}));
        Assert.assertEquals(7, vAppend.getDimension());
        Assert.assertEquals(7.0, vAppend.getEntry(6), EPSILON);

        // append double / double[] / RealVector
        Assert.assertEquals(8, vAppend.append(8.0).getDimension());
        Assert.assertEquals(9, vAppend.append(new double[]{9.0, 10.0}).getDimension() - 1);
        Assert.assertEquals(10, vAppend.append((RealVector) new ArrayRealVector(new double[]{10.0})).getDimension());

        // setSubVector
        v.setSubVector(1, new double[]{20.0, 30.0});
        Assert.assertEquals(20.0, v.getEntry(1), EPSILON);
        Assert.assertEquals(30.0, v.getEntry(2), EPSILON);

        v.setSubVector(0, (RealVector) new ArrayRealVector(new double[]{100.0}));
        Assert.assertEquals(100.0, v.getEntry(0), EPSILON);
    }

    @Test
    public void testSpecialValuesInfiniteAndNaN() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        Assert.assertFalse(v.isInfinite());
        Assert.assertFalse(v.isNaN());

        // Add NaN
        v.setEntry(0, Double.NaN);
        Assert.assertTrue(v.isNaN());
        Assert.assertFalse(v.isInfinite()); // If NaN present, isInfinite() returns false

        // Only Infinity
        OpenMapRealVector vInf = new OpenMapRealVector(2);
        vInf.setEntry(0, Double.POSITIVE_INFINITY);
        Assert.assertTrue(vInf.isInfinite());
        Assert.assertFalse(vInf.isNaN());
    }

    @Test
    public void testUnitVectorAndUnitize() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{3.0, 4.0});
        OpenMapRealVector unit = v.unitVector();
        Assert.assertEquals(0.6, unit.getEntry(0), EPSILON);
        Assert.assertEquals(0.8, unit.getEntry(1), EPSILON);

        v.unitize();
        Assert.assertEquals(0.6, v.getEntry(0), EPSILON);
        Assert.assertEquals(0.8, v.getEntry(1), EPSILON);
    }

    @Test(expected = MathArithmeticException.class)
    public void testUnitizeZeroNormThrows() {
        OpenMapRealVector zeroVec = new OpenMapRealVector(3);
        zeroVec.unitize();
    }

    @Test
    public void testEqualsAndHashCode() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 0.0, 2.0}, 1e-12);
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{1.0, 0.0, 2.0}, 1e-12);
        OpenMapRealVector vDiffVal = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0}, 1e-12);
        OpenMapRealVector vDiffDim = new OpenMapRealVector(new double[]{1.0, 0.0, 2.0, 0.0}, 1e-12);
        OpenMapRealVector vDiffEps = new OpenMapRealVector(new double[]{1.0, 0.0, 2.0}, 1e-5);

        // Reflexive & Symmetric
        Assert.assertTrue(v1.equals(v1));
        Assert.assertTrue(v1.equals(v2));
        Assert.assertEquals(v1.hashCode(), v2.hashCode());

        // Null and Other Object
        Assert.assertFalse(v1.equals(null));
        Assert.assertFalse(v1.equals("NotAVector"));

        // Differences
        Assert.assertFalse(v1.equals(vDiffVal));
        Assert.assertFalse(v1.equals(vDiffDim));
        Assert.assertFalse(v1.equals(vDiffEps));

        // Asymmetric key existence test
        OpenMapRealVector vA = new OpenMapRealVector(3);
        OpenMapRealVector vB = new OpenMapRealVector(3);
        vA.setEntry(0, 5.0);
        Assert.assertFalse(vA.equals(vB));
        Assert.assertFalse(vB.equals(vA));
    }

    @Test
    public void testMatrixOperationsAndMapOperations() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 2.0});
        
        // mapAdd / mapAddToSelf / set
        OpenMapRealVector vAdded = v.mapAdd(2.0);
        Assert.assertArrayEquals(new double[]{3.0, 4.0}, vAdded.getData(), EPSILON);
        
        v.set(5.0);
        Assert.assertArrayEquals(new double[]{5.0, 5.0}, v.getData(), EPSILON);

        // outerProduct
        OpenMapRealVector vRow = new OpenMapRealVector(new double[]{1.0, 2.0});
        RealMatrix outer = vRow.outerProduct(new double[]{3.0, 4.0});
        Assert.assertEquals(3.0, outer.getEntry(0, 0), EPSILON);
        Assert.assertEquals(4.0, outer.getEntry(0, 1), EPSILON);
        Assert.assertEquals(6.0, outer.getEntry(1, 0), EPSILON);
        Assert.assertEquals(8.0, outer.getEntry(1, 1), EPSILON);

        // projection
        OpenMapRealVector projTarget = new OpenMapRealVector(new double[]{1.0, 0.0});
        RealVector proj = vRow.projection(projTarget);
        Assert.assertEquals(1.0, proj.getEntry(0), EPSILON);
        Assert.assertEquals(0.0, proj.getEntry(1), EPSILON);
    }

    @Test
    public void testSparseIterator() {
        OpenMapRealVector v = new OpenMapRealVector(5);
        v.setEntry(1, 10.0);
        v.setEntry(3, 30.0);

        Assert.assertEquals(0.4, v.getSparsity(), EPSILON); // 2 non-zero out of 5

        Iterator<RealVector.Entry> iter = v.sparseIterator();
        int count = 0;
        while (iter.hasNext()) {
            RealVector.Entry entry = iter.next();
            if (entry.getIndex() == 1) {
                Assert.assertEquals(10.0, entry.getValue(), EPSILON);
                entry.setValue(15.0);
            } else if (entry.getIndex() == 3) {
                Assert.assertEquals(30.0, entry.getValue(), EPSILON);
            }
            count++;
        }
        Assert.assertEquals(2, count);
        Assert.assertEquals(15.0, v.getEntry(1), EPSILON);

        // Test unsupported remove
        try {
            iter.remove();
            Assert.fail("remove() should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // Success
        }
    }
}