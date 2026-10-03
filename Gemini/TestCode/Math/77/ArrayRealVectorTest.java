package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayRealVectorTest {

    // --- Constructor Tests & Edge Cases ---

    @Test(expected = NullPointerException.class)
    public void testConstructorNullArray() {
        new ArrayRealVector((double[]) null, true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorEmptyArray() {
        new ArrayRealVector(new double[0], true);
    }

    @Test
    public void testConstructorCopyArrayFlag() {
        double[] original = {1.0, 2.0, 3.0};
        ArrayRealVector vCopy = new ArrayRealVector(original, true);
        assertNotSame(original, vCopy.getDataRef());

        ArrayRealVector vRef = new ArrayRealVector(original, false);
        assertSame(original, vRef.getDataRef());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorSubArrayOutOfBoundsDouble() {
        double[] d = {1.0, 2.0};
        new ArrayRealVector(d, 1, 2); // pos + size = 3 > length 2
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorSubArrayOutOfBoundsObjectDouble() {
        Double[] d = {1.0, 2.0};
        new ArrayRealVector(d, 1, 2); // pos + size = 3 > length 2
    }

    @Test
    public void testConstructorsAlternativeTypes() {
        Double[] dObj = {1.0, 2.0, 3.0};
        ArrayRealVector v1 = new ArrayRealVector(dObj);
        assertEquals(3, v1.getDimension());
        assertEquals(2.0, v1.getEntry(1), 1e-12);

        ArrayRealVector vSubObj = new ArrayRealVector(dObj, 1, 2);
        assertEquals(2, vSubObj.getDimension());
        assertEquals(2.0, vSubObj.getEntry(0), 1e-12);

        ArrayRealVector source = new ArrayRealVector(new double[]{5.0, 6.0});
        ArrayRealVector vClone = new ArrayRealVector(source);
        assertEquals(source, vClone);

        ArrayRealVector vDeep = new ArrayRealVector(source, true);
        ArrayRealVector vShallow = new ArrayRealVector(source, false);
        assertEquals(source, vDeep);
        assertEquals(source, vShallow);
    }

    @Test
    public void testAppendsAndCombinations() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{2.0});
        double[] arr = {3.0};

        assertNotNull(new ArrayRealVector(v1, v2));
        assertNotNull(new ArrayRealVector(v1, (RealVector) v2));
        assertNotNull(new ArrayRealVector((RealVector) v1, v2));
        assertNotNull(new ArrayRealVector(v1, arr));
        assertNotNull(new ArrayRealVector(arr, v2));
        assertNotNull(new ArrayRealVector(arr, arr));

        assertNotNull(v1.append((RealVector) v2));
        assertNotNull(v1.append(4.0));
        assertNotNull(v1.append(arr));
        assertNotNull(v1.copy());
    }

    // --- Arithmetic & Operations Branch Coverage ---

    @Test
    public void testAddAndSubtractWithDifferentVectorTypes() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0});
        // Dummy RealVector implementation for testing non-ArrayRealVector branches
        RealVector nonArrayVector = new AbstractRealVector() {
            public double getEntry(int index) { return 1.0; }
            public void setEntry(int index, double value) {}
            public int getDimension() { return 2; }
            public RealVector copy() { return this; }
            public RealVector add(RealVector v) { return this; }
            public RealVector subtract(RealVector v) { return this; }
            public RealVector mapMultiply(double d) { return this; }
            public RealVector mapDivide(double d) { return this; }
            public double dotProduct(RealVector v) { return 0; }
            public RealVector projection(RealVector v) { return this; }
            public RealMatrix outerProduct(RealVector v) { return null; }
        };

        RealVector added = v1.add(nonArrayVector);
        assertEquals(2.0, added.getEntry(0), 1e-12);

        RealVector subtracted = v1.subtract(nonArrayVector);
        assertEquals(0.0, subtracted.getEntry(0), 1e-12);

        RealVector ebeMul = v1.ebeMultiply(nonArrayVector);
        assertEquals(1.0, ebeMul.getEntry(0), 1e-12);

        RealVector ebeDiv = v1.ebeDivide(nonArrayVector);
        assertEquals(1.0, ebeDiv.getEntry(0), 1e-12);

        double dot = v1.dotProduct(nonArrayVector);
        assertEquals(3.0, dot, 1e-12);

        double dist = v1.getDistance(nonArrayVector);
        assertEquals(1.0, dist, 1e-12);

        double l1Dist = v1.getL1Distance(nonArrayVector);
        assertEquals(1.0, l1Dist, 1e-12);

        double lInfDist = v1.getLInfDistance(nonArrayVector);
        assertEquals(1.0, lInfDist, 1e-12);

        RealMatrix outer = v1.outerProduct(nonArrayVector);
        assertNotNull(outer);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDimensionMismatch() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0});
        v1.add(new double[]{1.0, 2.0});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubtractDimensionMismatch() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0});
        v1.subtract(new double[]{1.0, 2.0});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEbeMultiplyDimensionMismatch() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0});
        v1.ebeMultiply(new double[]{1.0, 2.0});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEbeDivideDimensionMismatch() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0});
        v1.ebeDivide(new double[]{1.0, 2.0});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDotProductDimensionMismatch() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0});
        v1.dotProduct(new double[]{1.0, 2.0});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDistanceDimensionMismatch() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0});
        v1.getDistance(new double[]{1.0, 2.0});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetL1DistanceDimensionMismatch() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0});
        v1.getL1Distance(new double[]{1.0, 2.0});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLInfDistanceDimensionMismatch() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0});
        v1.getLInfDistance(new double[]{1.0, 2.0});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOuterProductDimensionMismatch() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0});
        v1.outerProduct(new double[]{1.0, 2.0});
    }

    // --- Unary Mapping Functions To Self ---

    @Test
    public void testMapToSelfFunctions() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 4.0});
        v.mapAddToSelf(1.0);
        v.mapSubtractToSelf(1.0);
        v.mapMultiplyToSelf(2.0);
        v.mapDivideToSelf(2.0);
        v.mapPowToSelf(2.0);
        v.mapExpToSelf();
        v.mapExpm1ToSelf();
        v.mapLogToSelf();
        v.mapLog10ToSelf();
        v.mapLog1pToSelf();
        v.mapCoshToSelf();
        v.mapSinhToSelf();
        v.mapTanhToSelf();
        v.mapCosToSelf();
        v.mapSinToSelf();
        v.mapTanToSelf();
        v.mapAcosToSelf();
        v.mapAsinToSelf();
        v.mapAtanToSelf();
        v.mapInvToSelf();
        v.mapAbsToSelf();
        v.mapSqrtToSelf();
        v.mapCbrtToSelf();
        v.mapCeilToSelf();
        v.mapFloorToSelf();
        v.mapRintToSelf();
        v.mapSignumToSelf();
        v.mapUlpToSelf();
        assertNotNull(v);
    }

    // --- Norms, Unit Vector & Special States ---

    @Test
    public void testNormsAndProjections() {
        ArrayRealVector v = new ArrayRealVector(new double[]{3.0, -4.0});
        assertEquals(5.0, v.getNorm(), 1e-12);
        assertEquals(7.0, v.getL1Norm(), 1e-12);
        assertEquals(4.0, v.getLInfNorm(), 1e-12);

        ArrayRealVector unit = (ArrayRealVector) v.unitVector();
        assertEquals(1.0, unit.getNorm(), 1e-12);

        v.unitize();
        assertEquals(1.0, v.getNorm(), 1e-12);

        ArrayRealVector v2 = new ArrayRealVector(new double[]{1.0, 0.0});
        assertNotNull(v.projection(v2));
        assertNotNull(v.projection(new double[]{1.0, 0.0}));
    }

    @Test(expected = ArithmeticException.class)
    public void testUnitVectorZeroNorm() {
        ArrayRealVector v = new ArrayRealVector(new double[]{0.0, 0.0});
        v.unitVector();
    }

    @Test(expected = ArithmeticException.class)
    public void testUnitizeZeroNorm() {
        ArrayRealVector v = new ArrayRealVector(new double[]{0.0, 0.0});
        v.unitize();
    }

    @Test
    public void testNaNAndInfiniteStates() {
        ArrayRealVector vNormal = new ArrayRealVector(new double[]{1.0, 2.0});
        assertFalse(vNormal.isNaN());
        assertFalse(vNormal.isInfinite());

        ArrayRealVector vNaN = new ArrayRealVector(new double[]{1.0, Double.NaN});
        assertTrue(vNaN.isNaN());
        assertFalse(vNaN.isInfinite()); // isNaN() is checked first in isInfinite()

        ArrayRealVector vInf = new ArrayRealVector(new double[]{1.0, Double.POSITIVE_INFINITY});
        assertFalse(vInf.isNaN());
        assertTrue(vInf.isInfinite());
    }

    // --- Equals and HashCode Comprehensive Branch Coverage ---

    @Test
    public void testEqualsAndHashCodeBranches() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{1.0, 2.0});
        ArrayRealVector v3 = new ArrayRealVector(new double[]{1.0, 3.0});
        ArrayRealVector v4 = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});

        // 1. this == other
        assertTrue(v1.equals(v1));

        // 2. other == null or not instanceof RealVector
        assertFalse(v1.equals(null));
        assertFalse(v1.equals("Not a Vector"));

        // 3. length mismatch
        assertFalse(v1.equals(v4));

        // 4. rhs.isNaN() branch
        ArrayRealVector vNaN1 = new ArrayRealVector(new double[]{Double.NaN, Double.NaN});
        ArrayRealVector vNaN2 = new ArrayRealVector(new double[]{Double.NaN, 5.0});
        assertTrue(vNaN1.equals(vNaN1));
        
        // 5. standard equality and inequality values
        assertTrue(v1.equals(v2));
        assertFalse(v1.equals(v3));

        // HashCode branches
        assertEquals(9, vNaN1.hashCode());
        assertTrue(v1.hashCode() != 0);
    }

    // --- Additional Get/Set and SubVector Edge Cases ---

    @Test
    public void testGettersSettersAndSubVectors() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        assertEquals(3.0, v.getEntry(2), 1e-12);
        assertEquals(3, v.getDimension());
        assertNotNull(v.toArray());
        assertNotNull(v.toString());

        v.setEntry(0, 10.0);
        assertEquals(10.0, v.getEntry(0), 1e-12);

        v.set(5.0);
        assertEquals(5.0, v.getEntry(0), 1e-12);

        RealVector sub = v.getSubVector(0, 2);
        assertEquals(2, sub.getDimension());

        v.setSubVector(0, new double[]{1.0, 2.0});
        v.setSubVector(0, new ArrayRealVector(new double[]{1.0, 2.0}));
        
        // Trigger ClassCastException inside setSubVector
        RealVector customVec = new AbstractRealVector() {
            public double getEntry(int index) { return 1.0; }
            public void setEntry(int index, double value) {}
            public int getDimension() { return 1; }
            public RealVector copy() { return this; }
            public RealVector add(RealVector v) { return this; }
            public RealVector subtract(RealVector v) { return this; }
            public RealVector mapMultiply(double d) { return this; }
            public RealVector mapDivide(double d) { return this; }
            public double dotProduct(RealVector v) { return 0; }
            public RealVector projection(RealVector v) { return this; }
            public RealMatrix outerProduct(RealVector v) { return null; }
        };
        v.setSubVector(0, customVec);
    }
}