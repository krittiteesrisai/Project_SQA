package org.apache.commons.math.geometry;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.exception.MathArithmeticException;

/**
 * JUnit4 test suite for Vector3D (Defects4J Math-55b)
 * มุ่งเน้น branch/condition coverage ทุกจุดที่วิเคราะห์ได้จาก source
 */
public class Vector3DTest {

    private static final double EPS = 1e-10;

    // ---------- Constructors ----------
    @Test
    public void testConstructorXYZ() {
        Vector3D v = new Vector3D(1, 2, 3);
        assertEquals(1, v.getX(), EPS);
        assertEquals(2, v.getY(), EPS);
        assertEquals(3, v.getZ(), EPS);
    }

    @Test
    public void testConstructorAlphaDelta() {
        // alpha=0, delta=0 -> (cos0*cos0, sin0*cos0, sin0) = (1,0,0)
        Vector3D v = new Vector3D(0, 0);
        assertEquals(1, v.getX(), EPS);
        assertEquals(0, v.getY(), EPS);
        assertEquals(0, v.getZ(), EPS);
    }

    @Test
    public void testConstructorScale() {
        Vector3D u = new Vector3D(1, 2, 3);
        Vector3D v = new Vector3D(2, u);
        assertEquals(2, v.getX(), EPS);
        assertEquals(4, v.getY(), EPS);
        assertEquals(6, v.getZ(), EPS);
    }

    @Test
    public void testConstructorLinear2() {
        Vector3D u1 = new Vector3D(1, 0, 0);
        Vector3D u2 = new Vector3D(0, 1, 0);
        Vector3D v = new Vector3D(2, u1, 3, u2);
        assertEquals(2, v.getX(), EPS);
        assertEquals(3, v.getY(), EPS);
        assertEquals(0, v.getZ(), EPS);
    }

    @Test
    public void testConstructorLinear3() {
        Vector3D u1 = new Vector3D(1, 0, 0);
        Vector3D u2 = new Vector3D(0, 1, 0);
        Vector3D u3 = new Vector3D(0, 0, 1);
        Vector3D v = new Vector3D(2, u1, 3, u2, 4, u3);
        assertEquals(2, v.getX(), EPS);
        assertEquals(3, v.getY(), EPS);
        assertEquals(4, v.getZ(), EPS);
    }

    @Test
    public void testConstructorLinear4() {
        Vector3D u1 = new Vector3D(1, 0, 0);
        Vector3D u2 = new Vector3D(0, 1, 0);
        Vector3D u3 = new Vector3D(0, 0, 1);
        Vector3D u4 = new Vector3D(1, 1, 1);
        Vector3D v = new Vector3D(1, u1, 1, u2, 1, u3, 1, u4);
        assertEquals(2, v.getX(), EPS);
        assertEquals(2, v.getY(), EPS);
        assertEquals(2, v.getZ(), EPS);
    }

    // ---------- Norms ----------
    @Test
    public void testGetNorm1() {
        assertEquals(6, new Vector3D(-1, 2, -3).getNorm1(), EPS);
    }

    @Test
    public void testGetNorm() {
        Vector3D v = new Vector3D(2, 3, 4);
        assertEquals(Math.sqrt(4 + 9 + 16), v.getNorm(), EPS);
    }

    @Test
    public void testGetNormSq() {
        assertEquals(29, new Vector3D(2, 3, 4).getNormSq(), EPS);
    }

    @Test
    public void testGetNormInf() {
        assertEquals(5, new Vector3D(-5, 3, 4).getNormInf(), EPS);
    }

    // ---------- Alpha / Delta ----------
    @Test
    public void testGetAlpha() {
        assertEquals(Math.PI / 4, new Vector3D(1, 1, 0).getAlpha(), EPS);
    }

    @Test
    public void testGetDelta() {
        assertEquals(Math.PI / 2, new Vector3D(0, 0, 1).getDelta(), EPS);
    }

    // ---------- Add / Subtract ----------
    @Test
    public void testAdd() {
        Vector3D r = new Vector3D(1, 2, 3).add(new Vector3D(4, 5, 6));
        assertEquals(5, r.getX(), EPS);
        assertEquals(7, r.getY(), EPS);
        assertEquals(9, r.getZ(), EPS);
    }

    @Test
    public void testAddScaled() {
        Vector3D r = new Vector3D(1, 2, 3).add(2, new Vector3D(1, 1, 1));
        assertEquals(3, r.getX(), EPS);
        assertEquals(4, r.getY(), EPS);
        assertEquals(5, r.getZ(), EPS);
    }

    @Test
    public void testSubtract() {
        Vector3D r = new Vector3D(5, 5, 5).subtract(new Vector3D(1, 2, 3));
        assertEquals(4, r.getX(), EPS);
        assertEquals(3, r.getY(), EPS);
        assertEquals(2, r.getZ(), EPS);
    }

    @Test
    public void testSubtractScaled() {
        Vector3D r = new Vector3D(5, 5, 5).subtract(2, new Vector3D(1, 1, 1));
        assertEquals(3, r.getX(), EPS);
        assertEquals(3, r.getY(), EPS);
        assertEquals(3, r.getZ(), EPS);
    }

    // ---------- normalize() : if (s == 0) ----------
    @Test
    public void testNormalize() {
        Vector3D n = new Vector3D(3, 0, 0).normalize();
        assertEquals(1, n.getNorm(), EPS);
    }

    @Test(expected = MathArithmeticException.class)
    public void testNormalizeZeroThrows() {
        Vector3D.ZERO.normalize();
    }

    // ---------- orthogonal() : if/else if/else ----------
    @Test(expected = MathArithmeticException.class)
    public void testOrthogonalZeroThrows() {
        Vector3D.ZERO.orthogonal();
    }

    @Test
    public void testOrthogonal_xWithinThreshold() {
        // |x| <= threshold -> branch 1
        Vector3D v = new Vector3D(0.1, 5, 5);
        Vector3D o = v.orthogonal();
        assertEquals(0, Vector3D.dotProduct(v, o), 1e-8);
    }

    @Test
    public void testOrthogonal_yWithinThreshold() {
        // x out of range, y within -> branch 2 (else if)
        Vector3D v = new Vector3D(5, 0.1, 5);
        Vector3D o = v.orthogonal();
        assertEquals(0, Vector3D.dotProduct(v, o), 1e-8);
    }

    @Test
    public void testOrthogonal_elseBranch() {
        // both x,y out of range -> final else
        Vector3D v = new Vector3D(5, 5, 0.1);
        Vector3D o = v.orthogonal();
        assertEquals(0, Vector3D.dotProduct(v, o), 1e-8);
    }

    // ---------- angle() ----------
    @Test(expected = MathArithmeticException.class)
    public void testAngle_zeroNormThrows() {
        Vector3D.angle(Vector3D.ZERO, Vector3D.PLUS_I);
    }

    @Test
    public void testAngle_cosineBranch() {
        // well separated vectors -> uses acos
        double a = Vector3D.angle(Vector3D.PLUS_I, Vector3D.PLUS_J);
        assertEquals(Math.PI / 2, a, EPS);
    }

    @Test
    public void testAngle_sineBranch_dotPositive() {
        // almost aligned, dot >= 0
        Vector3D v1 = new Vector3D(1, 0, 0);
        Vector3D v2 = new Vector3D(1, 1e-6, 0);
        double a = Vector3D.angle(v1, v2);
        assertTrue(a >= 0);
    }

    @Test
    public void testAngle_sineBranch_dotNegative() {
        // almost aligned (opposite), dot < 0
        Vector3D v1 = new Vector3D(1, 0, 0);
        Vector3D v2 = new Vector3D(-1, 1e-6, 0);
        double a = Vector3D.angle(v1, v2);
        assertTrue(a > Math.PI / 2);
    }

    // ---------- negate / scalarMultiply ----------
    @Test
    public void testNegate() {
        Vector3D n = new Vector3D(1, -2, 3).negate();
        assertEquals(-1, n.getX(), EPS);
        assertEquals(2, n.getY(), EPS);
        assertEquals(-3, n.getZ(), EPS);
    }

    @Test
    public void testScalarMultiply() {
        Vector3D r = new Vector3D(1, 2, 3).scalarMultiply(3);
        assertEquals(3, r.getX(), EPS);
        assertEquals(6, r.getY(), EPS);
        assertEquals(9, r.getZ(), EPS);
    }

    // ---------- isNaN() : OR condition ----------
    @Test
    public void testIsNaN_xNaN() {
        assertTrue(new Vector3D(Double.NaN, 1, 1).isNaN());
    }

    @Test
    public void testIsNaN_yNaN() {
        assertTrue(new Vector3D(1, Double.NaN, 1).isNaN());
    }

    @Test
    public void testIsNaN_zNaN() {
        assertTrue(new Vector3D(1, 1, Double.NaN).isNaN());
    }

    @Test
    public void testIsNaN_false() {
        assertFalse(new Vector3D(1, 2, 3).isNaN());
    }

    // ---------- isInfinite() : !isNaN() && (OR condition) ----------
    @Test
    public void testIsInfinite_true_x() {
        assertTrue(new Vector3D(Double.POSITIVE_INFINITY, 1, 1).isInfinite());
    }

    @Test
    public void testIsInfinite_true_y() {
        assertTrue(new Vector3D(1, Double.NEGATIVE_INFINITY, 1).isInfinite());
    }

    @Test
    public void testIsInfinite_true_z() {
        assertTrue(new Vector3D(1, 1, Double.POSITIVE_INFINITY).isInfinite());
    }

    @Test
    public void testIsInfinite_false_normal() {
        assertFalse(new Vector3D(1, 2, 3).isInfinite());
    }

    @Test
    public void testIsInfinite_false_whenAlsoNaN() {
        // short-circuit: !isNaN() == false -> overall false even though infinite coord exists
        Vector3D v = new Vector3D(Double.NaN, Double.POSITIVE_INFINITY, 1);
        assertFalse(v.isInfinite());
    }

    // ---------- equals() ----------
    @Test
    public void testEquals_sameInstance() {
        Vector3D v = new Vector3D(1, 2, 3);
        assertTrue(v.equals(v));
    }

    @Test
    public void testEquals_notInstanceOf() {
        assertFalse(new Vector3D(1, 2, 3).equals("not-a-vector"));
    }

    @Test
    public void testEquals_null() {
        assertFalse(new Vector3D(1, 2, 3).equals(null));
    }

    @Test
    public void testEquals_bothNaN() {
        Vector3D v1 = new Vector3D(Double.NaN, 1, 1);
        Vector3D v2 = new Vector3D(1, Double.NaN, 1);
        assertTrue(v1.equals(v2));
    }

    @Test
    public void testEquals_rhsNaN_thisNot() {
        Vector3D v1 = new Vector3D(1, 2, 3);
        Vector3D v2 = new Vector3D(Double.NaN, 2, 3);
        assertFalse(v1.equals(v2));
    }

    @Test
    public void testEquals_equalCoordinates() {
        assertTrue(new Vector3D(1, 2, 3).equals(new Vector3D(1, 2, 3)));
    }

    @Test
    public void testEquals_differentCoordinates() {
        assertFalse(new Vector3D(1, 2, 3).equals(new Vector3D(1, 2, 4)));
    }

    // ---------- hashCode() ----------
    @Test
    public void testHashCode_NaN() {
        assertEquals(8, new Vector3D(Double.NaN, 1, 1).hashCode());
    }

    @Test
    public void testHashCode_consistentForEqualObjects() {
        Vector3D v1 = new Vector3D(1, 2, 3);
        Vector3D v2 = new Vector3D(1, 2, 3);
        assertEquals(v1.hashCode(), v2.hashCode());
    }

    // ---------- dotProduct / crossProduct ----------
    @Test
    public void testDotProduct() {
        assertEquals(32, Vector3D.dotProduct(new Vector3D(1, 2, 3), new Vector3D(4, 5, 6)), EPS);
    }

    @Test
    public void testCrossProduct() {
        Vector3D r = Vector3D.crossProduct(Vector3D.PLUS_I, Vector3D.PLUS_J);
        assertEquals(0, r.getX(), EPS);
        assertEquals(0, r.getY(), EPS);
        assertEquals(1, r.getZ(), EPS);
    }

    // ---------- distances ----------
    @Test
    public void testDistance1() {
        assertEquals(3 + 4 + 5, Vector3D.distance1(new Vector3D(1, 2, 3), new Vector3D(4, 6, 8)), EPS);
    }

    @Test
    public void testDistance() {
        assertEquals(5, Vector3D.distance(new Vector3D(0, 0, 0), new Vector3D(3, 4, 0)), EPS);
    }

    @Test
    public void testDistanceInf() {
        assertEquals(7, Vector3D.distanceInf(new Vector3D(1, 2, 3), new Vector3D(4, 1, 10)), EPS);
    }

    @Test
    public void testDistanceSq() {
        assertEquals(25, Vector3D.distanceSq(new Vector3D(0, 0, 0), new Vector3D(3, 4, 0)), EPS);
    }

    // ---------- toString ----------
    @Test
    public void testToString_notNullOrEmpty() {
        String s = new Vector3D(1, 2, 3).toString();
        assertNotNull(s);
        assertTrue(s.length() > 0);
    }

    // ---------- Static constants sanity ----------
    @Test
    public void testStaticConstants() {
        assertEquals(0, Vector3D.ZERO.getNorm(), EPS);
        assertTrue(Vector3D.NaN.isNaN());
        assertTrue(Vector3D.POSITIVE_INFINITY.isInfinite());
        assertTrue(Vector3D.NEGATIVE_INFINITY.isInfinite());
    }
}
