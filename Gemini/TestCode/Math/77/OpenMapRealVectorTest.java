package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;

public class OpenMapRealVectorTest {

    @Test
    public void testConstructorsAndGetters() {
        OpenMapRealVector v1 = new OpenMapRealVector();
        assertEquals(0, v1.getDimension());
        assertEquals(OpenMapRealVector.DEFAULT_ZERO_TOLERANCE, v1.getSparcity(), 1e-12);

        OpenMapRealVector v2 = new OpenMapRealVector(5);
        assertEquals(5, v2.getDimension());

        OpenMapRealVector v3 = new OpenMapRealVector(5, 1e-6);
        assertEquals(5, v3.getDimension());

        OpenMapRealVector v4 = new OpenMapRealVector(5, 2);
        assertEquals(5, v4.getDimension());

        double[] data = {0.0, 1.5, 0.0, -2.5, 0.0};
        OpenMapRealVector v5 = new OpenMapRealVector(data);
        assertEquals(5, v5.getDimension());
        assertEquals(1.5, v5.getEntry(1), 1e-12);

        Double[] boxedData = {0.0, 0.0, 3.5};
        OpenMapRealVector v6 = new OpenMapRealVector(boxedData, 1e-5);
        assertEquals(3, v6.getDimension());
        assertEquals(3.5, v6.getEntry(2), 1e-12);

        OpenMapRealVector v7 = new OpenMapRealVector(v5);
        assertEquals(v5.getDimension(), v7.getDimension());
        assertEquals(v5.getEntry(1), v7.getEntry(1), 1e-12);

        RealVector standardVector = new ArrayRealVector(new double[]{1.0, 0.0, 2.0});
        OpenMapRealVector v8 = new OpenMapRealVector(standardVector);
        assertEquals(3, v8.getDimension());
        assertEquals(1.0, v8.getEntry(0), 1e-12);
    }

    @Test
    public void testSetAndGetEntryWithDefaultValues() {
        OpenMapRealVector v = new OpenMapRealVector(3, 1e-3);
        v.setEntry(0, 0.0001); // ถือว่าเป็นค่า default (ต่ำกว่า epsilon) ควรไม่ถูกบันทึกหรือถูกลบ
        assertEquals(0.0, v.getEntry(0), 1e-12);

        v.setEntry(0, 5.0);
        assertEquals(5.0, v.getEntry(0), 1e-12);

        // เซ็ตให้ต่ำกว่า epsilon อีกครั้ง เพื่อเทส branch การลบออกจาก entries
        v.setEntry(0, 0.00001);
        assertEquals(0.0, v.getEntry(0), 1e-12);
    }

    @Test
    public void testAddVectors() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{0.0, 2.0, 3.0});
        
        // ทดสอบกรณี this ใหญ่กว่า v (copyThis = true)
        OpenMapRealVector sum1 = v1.add(v2);
        assertEquals(1.0, sum1.getEntry(0), 1e-12);
        assertEquals(2.0, sum1.getEntry(1), 1e-12);
        assertEquals(6.0, sum1.getEntry(2), 1e-12);

        // ทดสอบกรณี v ใหญ่กว่า this (copyThis = false) และทดสอบผ่าน RealVector interface ทั่วไป
        RealVector v3 = new ArrayRealVector(new double[]{1.0, 1.0, 1.0, 1.0});
        OpenMapRealVector v4 = new OpenMapRealVector(new double[]{2.0, 0.0, 0.0, 0.0});
        RealVector sum2 = v4.add(v3);
        assertEquals(3.0, sum2.getEntry(0), 1e-12);
        assertEquals(1.0, sum2.getEntry(1), 1e-12);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDimensionMismatch() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{1.0});
        v1.add(v2);
    }

    @Test
    public void testAppendOperations() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{3.0});
        
        OpenMapRealVector appended1 = v1.append(v2);
        assertEquals(3, appended1.getDimension());
        assertEquals(3.0, appended1.getEntry(2), 1e-12);

        RealVector standardVec = new ArrayRealVector(new double[]{4.0});
        OpenMapRealVector appended2 = v1.append(standardVec);
        assertEquals(3, appended2.getDimension());
        assertEquals(4.0, appended2.getEntry(2), 1e-12);

        OpenMapRealVector appended3 = v1.append(5.0);
        assertEquals(3, appended3.getDimension());
        assertEquals(5.0, appended3.getEntry(2), 1e-12);

        OpenMapRealVector appended4 = v1.append(new double[]{6.0, 7.0});
        assertEquals(4, appended4.getDimension());
        assertEquals(6.0, appended4.getEntry(2), 1e-12);
        assertEquals(7.0, appended4.getEntry(3), 1e-12);
    }

    @Test
    public void testDotProduct() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{2.0, 4.0, 0.0});
        
        assertEquals(2.0, v1.dotProduct(v2), 1e-12);

        RealVector standardVec = new ArrayRealVector(new double[]{2.0, 4.0, 0.0});
        assertEquals(2.0, v1.dotProduct(standardVec), 1e-12);
    }

    @Test
    public void testEbeOperations() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{2.0, 4.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{2.0, 2.0});

        RealVector div1 = v1.ebeDivide(v2);
        assertEquals(1.0, div1.getEntry(0), 1e-12);
        assertEquals(2.0, div1.getEntry(1), 1e-12);

        RealVector div2 = v1.ebeDivide(new double[]{2.0, 2.0});
        assertEquals(2.0, div2.getEntry(1), 1e-12);

        RealVector mult1 = v1.ebeMultiply(v2);
        assertEquals(4.0, mult1.getEntry(0), 1e-12);

        RealVector mult2 = v1.ebeMultiply(new double[]{3.0, 3.0});
        assertEquals(12.0, mult2.getEntry(1), 1e-12);
    }

    @Test
    public void testSubVectorAndData() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0, 4.0});
        OpenMapRealVector sub = v.getSubVector(1, 2);
        assertEquals(2, sub.getDimension());
        assertEquals(2.0, sub.getEntry(0), 1e-12);
        assertEquals(3.0, sub.getEntry(1), 1e-12);

        double[] data = v.getData();
        assertEquals(4, data.length);
        assertEquals(2.0, data[1], 1e-12);
        
        double[] array = v.toArray();
        assertEquals(4, array.length);

        v.setSubVector(1, new double[]{9.0, 8.0});
        assertEquals(9.0, v.getEntry(1), 1e-12);

        v.setSubVector(0, new ArrayRealVector(new double[]{5.0}));
        assertEquals(5.0, v.getEntry(0), 1e-12);
    }

    @Test
    public void testDistancesAndNorms() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{4.0, 6.0});

        assertEquals(5.0, v1.getDistance(v2), 1e-12);
        assertEquals(5.0, v1.getDistance(new double[]{4.0, 6.0}), 1e-12);
        assertEquals(5.0, v1.getDistance((RealVector)v2), 1e-12);

        assertEquals(7.0, v1.getL1Distance(v2), 1e-12);
        assertEquals(7.0, v1.getL1Distance(new double[]{4.0, 6.0}), 1e-12);
        assertEquals(7.0, v1.getL1Distance((RealVector)v2), 1e-12);

        assertEquals(4.0, v1.getLInfDistance(v2), 1e-12);
        assertEquals(4.0, v1.getLInfDistance(new double[]{4.0, 6.0}), 1e-12);
        assertEquals(4.0, v1.getLInfDistance((RealVector)v2), 1e-12);

        assertEquals(3.0, v1.getLInfNorm(), 1e-12);
    }

    @Test
    public void testSpecialValues() {
        OpenMapRealVector vValid = new OpenMapRealVector(new double[]{1.0, 2.0});
        assertFalse(vValid.isInfinite());
        assertFalse(vValid.isNaN());

        OpenMapRealVector vInfinite = new OpenMapRealVector(new double[]{Double.POSITIVE_INFINITY, 2.0});
        assertTrue(vInfinite.isInfinite());

        OpenMapRealVector vNaN = new OpenMapRealVector(new double[]{Double.NaN, 2.0});
        assertTrue(vNaN.isNaN());
        assertFalse(vNaN.isInfinite()); // เจอ NaN จะ return false ใน isInfinite
    }

    @Test
    public void testMapAndOtherOperations() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 2.0});
        OpenMapRealVector mapped = v.mapAdd(5.0);
        assertEquals(6.0, mapped.getEntry(0), 1e-12);

        v.mapAddToSelf(1.0);
        assertEquals(2.0, v.getEntry(0), 1e-12);

        RealMatrix outer = v.outerProduct(new double[]{1.0, 2.0});
        assertEquals(2, outer.getRowDimension());

        OpenMapRealVector proj = v.projection(new double[]{1.0, 1.0});
        assertEquals(2, proj.getDimension());

        v.set(10.0);
        assertEquals(10.0, v.getEntry(0), 1e-12);
    }

    @Test
    public void testSubtract() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{3.0, 5.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{1.0, 2.0});

        OpenMapRealVector res1 = v1.subtract(v2);
        assertEquals(2.0, res1.getEntry(0), 1e-12);

        OpenMapRealVector res2 = v1.subtract(new double[]{1.0, 2.0});
        assertEquals(2.0, res2.getEntry(0), 1e-12);

        RealVector res3 = v1.subtract((RealVector)v2);
        assertEquals(2.0, res3.getEntry(0), 1e-12);
    }

    @Test(expected = RuntimeException.class)
    public void testUnitizeZeroNormException() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{0.0, 0.0});
        v.unitize();
    }

    @Test
    public void testUnitVectorAndUnitize() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{3.0, 4.0});
        OpenMapRealVector unit = v.unitVector();
        assertEquals(0.6, unit.getEntry(0), 1e-12);
        assertEquals(0.8, unit.getEntry(1), 1e-12);
    }

    @Test
    public void testEqualsAndHashCode() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{1.0, 2.0});
        OpenMapRealVector v3 = new OpenMapRealVector(new double[]{1.0, 3.0});
        OpenMapRealVector v4 = new OpenMapRealVector(3);

        assertTrue(v1.equals(v1));
        assertFalse(v1.equals(null));
        assertFalse(v1.equals("NotAVector"));
        assertTrue(v1.equals(v2));
        assertFalse(v1.equals(v3));
        assertFalse(v1.equals(v4)); // ขนาดต่างกัน

        OpenMapRealVector v5 = new OpenMapRealVector(new double[]{1.0, 2.0}, 1e-5);
        OpenMapRealVector v6 = new OpenMapRealVector(new double[]{1.0, 2.0}, 1e-6);
        assertFalse(v5.equals(v6)); // epsilon ต่างกัน

        assertEquals(v1.hashCode(), v2.hashCode());
    }

    @Test
    public void testSparseIterator() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{0.0, 5.0});
        java.util.Iterator<RealVector.Entry> it = v.sparseIterator();
        assertTrue(it.hasNext());
        RealVector.Entry entry = it.next();
        assertEquals(1, entry.getIndex());
        assertEquals(5.0, entry.getValue(), 1e-12);

        entry.setValue(10.0);
        assertEquals(10.0, v.getEntry(1), 1e-12);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSparseIteratorRemoveUnsupported() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0});
        java.util.Iterator<RealVector.Entry> it = v.sparseIterator();
        it.remove();
    }
}