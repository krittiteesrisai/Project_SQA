package org.apache.commons.math.geometry;

import org.apache.commons.math.exception.MathArithmeticException;
import org.apache.commons.math.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class Vector3DTest {

    private static final double EPSILON = 1e-12;

    @Test
    public void testConstructors() {
        // Simple (x, y, z)
        Vector3D v1 = new Vector3D(1.0, 2.0, 3.0);
        Assert.assertEquals(1.0, v1.getX(), EPSILON);
        Assert.assertEquals(2.0, v1.getY(), EPSILON);
        Assert.assertEquals(3.0, v1.getZ(), EPSILON);

        // Spherical constructor (alpha, delta)
        Vector3D vSpherical = new Vector3D(FastMath.PI / 2.0, 0.0);
        Assert.assertEquals(0.0, vSpherical.getX(), EPSILON);
        Assert.assertEquals(1.0, vSpherical.getY(), EPSILON);
        Assert.assertEquals(0.0, vSpherical.getZ(), EPSILON);

        // Multiplicative constructor
        Vector3D vMul = new Vector3D(2.5, v1);
        Assert.assertEquals(2.5, vMul.getX(), EPSILON);
        Assert.assertEquals(5.0, vMul.getY(), EPSILON);
        Assert.assertEquals(7.5, vMul.getZ(), EPSILON);

        // Linear constructor (2 vectors)
        Vector3D vLinear2 = new Vector3D(2.0, new Vector3D(1, 0, 0), -1.0, new Vector3D(0, 1, 0));
        Assert.assertEquals(2.0, vLinear2.getX(), EPSILON);
        Assert.assertEquals(-1.0, vLinear2.getY(), EPSILON);
        Assert.assertEquals(0.0, vLinear2.getZ(), EPSILON);

        // Linear constructor (3 vectors)
        Vector3D vLinear3 = new Vector3D(1.0, Vector3D.PLUS_I, 2.0, Vector3D.PLUS_J, 3.0, Vector3D.PLUS_K);
        Assert.assertEquals(1.0, vLinear3.getX(), EPSILON);
        Assert.assertEquals(2.0, vLinear3.getY(), EPSILON);
        Assert.assertEquals(3.0, vLinear3.getZ(), EPSILON);

        // Linear constructor (4 vectors)
        Vector3D vLinear4 = new Vector3D(1.0, Vector3D.PLUS_I, 1.0, Vector3D.PLUS_J, 1.0, Vector3D.PLUS_K, -1.0, Vector3D.PLUS_I);
        Assert.assertEquals(0.0, vLinear4.getX(), EPSILON);
        Assert.assertEquals(1.0, vLinear4.getY(), EPSILON);
        Assert.assertEquals(1.0, vLinear4.getZ(), EPSILON);
    }

    @Test
    public void testNormsAndAngles() {
        Vector3D v = new Vector3D(1.0, -2.0, 2.0);
        Assert.assertEquals(5.0, v.getNorm1(), EPSILON);
        Assert.assertEquals(3.0, v.getNorm(), EPSILON);
        Assert.assertEquals(9.0, v.getNormSq(), EPSILON);
        Assert.assertEquals(2.0, v.getNormInf(), EPSILON);

        Vector3D vAngle = new Vector3D(1.0, 1.0, 0.0);
        Assert.assertEquals(FastMath.PI / 4.0, vAngle.getAlpha(), EPSILON);
        Assert.assertEquals(0.0, vAngle.getDelta(), EPSILON);
    }

    @Test
    public void testBasicVectorArithmetic() {
        Vector3D v1 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D v2 = new Vector3D(4.0, 5.0, 6.0);

        Vector3D add = v1.add(v2);
        Assert.assertEquals(new Vector3D(5.0, 7.0, 9.0), add);

        Vector3D addScaled = v1.add(2.0, v2);
        Assert.assertEquals(new Vector3D(9.0, 12.0, 15.0), addScaled);

        Vector3D sub = v1.subtract(v2);
        Assert.assertEquals(new Vector3D(-3.0, -3.0, -3.0), sub);

        Vector3D subScaled = v1.subtract(2.0, v2);
        Assert.assertEquals(new Vector3D(-7.0, -8.0, -9.0), subScaled);

        Vector3D neg = v1.negate();
        Assert.assertEquals(new Vector3D(-1.0, -2.0, -3.0), neg);

        Vector3D scalar = v1.scalarMultiply(3.0);
        Assert.assertEquals(new Vector3D(3.0, 6.0, 9.0), scalar);
    }

    @Test
    public void testNormalizeSuccess() {
        Vector3D v = new Vector3D(3.0, 0.0, 4.0);
        Vector3D norm = v.normalize();
        Assert.assertEquals(0.6, norm.getX(), EPSILON);
        Assert.assertEquals(0.0, norm.getY(), EPSILON);
        Assert.assertEquals(0.8, norm.getZ(), EPSILON);
        Assert.assertEquals(1.0, norm.getNorm(), EPSILON);
    }

    @Test(expected = MathArithmeticException.class)
    public void testNormalizeZeroNormThrowsException() {
        Vector3D.ZERO.normalize();
    }

    @Test
    public void testOrthogonalBranches() {
        // Branch 1: |x| <= threshold (x is very small compared to norm)
        Vector3D vXSmall = new Vector3D(0.1, 3.0, 4.0);
        Vector3D ortho1 = vXSmall.orthogonal();
        Assert.assertEquals(0.0, Vector3D.dotProduct(vXSmall, ortho1), EPSILON);
        Assert.assertEquals(1.0, ortho1.getNorm(), EPSILON);

        // Branch 2: |x| > threshold but |y| <= threshold
        Vector3D vYSmall = new Vector3D(3.0, 0.1, 4.0);
        Vector3D ortho2 = vYSmall.orthogonal();
        Assert.assertEquals(0.0, Vector3D.dotProduct(vYSmall, ortho2), EPSILON);
        Assert.assertEquals(1.0, ortho2.getNorm(), EPSILON);

        // Branch 3: |x| > threshold and |y| > threshold (z is small or other components dominate)
        Vector3D vZSmall = new Vector3D(3.0, 3.0, 0.1);
        Vector3D ortho3 = vZSmall.orthogonal();
        Assert.assertEquals(0.0, Vector3D.dotProduct(vZSmall, ortho3), EPSILON);
        Assert.assertEquals(1.0, ortho3.getNorm(), EPSILON);
    }

    @Test(expected = MathArithmeticException.class)
    public void testOrthogonalZeroNormThrowsException() {
        Vector3D.ZERO.orthogonal();
    }

    @Test
    public void testAngleBranches() {
        // Branch: well separated vectors (cosine path)
        Vector3D v1 = new Vector3D(1.0, 0.0, 0.0);
        Vector3D v2 = new Vector3D(0.0, 1.0, 0.0);
        Assert.assertEquals(FastMath.PI / 2.0, Vector3D.angle(v1, v2), EPSILON);

        // Branch: almost aligned in same direction (dot >= 0)
        Vector3D vAlmostSame1 = new Vector3D(1.0, 0.0, 0.0);
        Vector3D vAlmostSame2 = new Vector3D(1.0, 1e-5, 0.0);
        double angleSame = Vector3D.angle(vAlmostSame1, vAlmostSame2);
        Assert.assertTrue(angleSame > 0.0 && angleSame < 1e-4);

        // Branch: almost aligned in opposite direction (dot < 0)
        Vector3D vAlmostOpp1 = new Vector3D(1.0, 0.0, 0.0);
        Vector3D vAlmostOpp2 = new Vector3D(-1.0, 1e-5, 0.0);
        double angleOpp = Vector3D.angle(vAlmostOpp1, vAlmostOpp2);
        Assert.assertTrue(angleOpp < FastMath.PI && angleOpp > FastMath.PI - 1e-4);
    }

    @Test(expected = MathArithmeticException.class)
    public void testAngleZeroNormThrowsException() {
        Vector3D.angle(Vector3D.ZERO, Vector3D.PLUS_I);
    }

    @Test
    public void testIsNaNAndIsInfinite() {
        // NaN cases across individual and multiple coordinates
        Assert.assertFalse(new Vector3D(1.0, 2.0, 3.0).isNaN());
        Assert.assertTrue(new Vector3D(Double.NaN, 2.0, 3.0).isNaN());
        Assert.assertTrue(new Vector3D(1.0, Double.NaN, 3.0).isNaN());
        Assert.assertTrue(new Vector3D(1.0, 2.0, Double.NaN).isNaN());
        Assert.assertTrue(Vector3D.NaN.isNaN());

        // Infinite cases
        Assert.assertFalse(new Vector3D(1.0, 2.0, 3.0).isInfinite());
        Assert.assertTrue(new Vector3D(Double.POSITIVE_INFINITY, 2.0, 3.0).isInfinite());
        Assert.assertTrue(new Vector3D(1.0, Double.NEGATIVE_INFINITY, 3.0).isInfinite());
        Assert.assertTrue(new Vector3D(1.0, 2.0, Double.POSITIVE_INFINITY).isInfinite());
        Assert.assertTrue(Vector3D.POSITIVE_INFINITY.isInfinite());
        Assert.assertTrue(Vector3D.NEGATIVE_INFINITY.isInfinite());

        // Mixed NaN and Infinity: NaN should take precedence (isInfinite must be false)
        Vector3D mixed = new Vector3D(Double.NaN, Double.POSITIVE_INFINITY, 1.0);
        Assert.assertTrue(mixed.isNaN());
        Assert.assertFalse(mixed.isInfinite());
    }

    @Test
    public void testEqualsAndHashCode() {
        Vector3D v1 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D v1Same = new Vector3D(1.0, 2.0, 3.0);
        Vector3D vDiffX = new Vector3D(1.5, 2.0, 3.0);
        Vector3D vDiffY = new Vector3D(1.0, 2.5, 3.0);
        Vector3D vDiffZ = new Vector3D(1.0, 2.0, 3.5);

        // Reflexive
        Assert.assertTrue(v1.equals(v1));

        // Symmetric & HashCode
        Assert.assertTrue(v1.equals(v1Same));
        Assert.assertEquals(v1.hashCode(), v1Same.hashCode());

        // Different coordinates
        Assert.assertFalse(v1.equals(vDiffX));
        Assert.assertFalse(v1.equals(vDiffY));
        Assert.assertFalse(v1.equals(vDiffZ));

        // Null and foreign type
        Assert.assertFalse(v1.equals(null));
        Assert.assertFalse(v1.equals("String Object"));

        // NaN equality & HashCode semantics
        Vector3D nan1 = new Vector3D(Double.NaN, 1.0, 2.0);
        Vector3D nan2 = new Vector3D(0.0, Double.NaN, 0.0);
        Assert.assertTrue(nan1.equals(nan2));
        Assert.assertTrue(nan1.equals(Vector3D.NaN));
        Assert.assertFalse(v1.equals(nan1));
        Assert.assertFalse(nan1.equals(v1));
        Assert.assertEquals(8, nan1.hashCode());
        Assert.assertEquals(8, Vector3D.NaN.hashCode());
    }

    @Test
    public void testDistances() {
        Vector3D v1 = new Vector3D(1.0, -2.0, 3.0);
        Vector3D v2 = new Vector3D(4.0, 2.0, 3.0);

        // dx = 3, dy = 4, dz = 0
        Assert.assertEquals(7.0, Vector3D.distance1(v1, v2), EPSILON);
        Assert.assertEquals(5.0, Vector3D.distance(v1, v2), EPSILON);
        Assert.assertEquals(25.0, Vector3D.distanceSq(v1, v2), EPSILON);
        Assert.assertEquals(4.0, Vector3D.distanceInf(v1, v2), EPSILON);
    }

    @Test
    public void testCrossProductAndNumericalStability() {
        // Standard orthogonal bases
        Vector3D k = Vector3D.crossProduct(Vector3D.PLUS_I, Vector3D.PLUS_J);
        Assert.assertEquals(Vector3D.PLUS_K, k);

        // Math-55 Defect Detection: Nearly parallel vectors with large coordinates
        // Checks precision and potential catastrophic cancellation
        Vector3D u1 = new Vector3D(-132100868464267988.0 / 268435456.0,
                                   -37700551354852588.0 / 268435456.0,
                                   -267998056498149.0 / 268435456.0);
        Vector3D u2 = new Vector3D(-103774614774633886.0 / 268435456.0,
                                   -29614930396868804.0 / 268435456.0,
                                   -210462141786009.0 / 268435456.0);
        Vector3D u3 = Vector3D.crossProduct(u1, u2);

        // Dot product of cross product with original vector should be accurately 0
        Assert.assertEquals(0.0, Vector3D.dotProduct(u1, u3), 1e-20);
        Assert.assertEquals(0.0, Vector3D.dotProduct(u2, u3), 1e-20);
    }

    @Test
    public void testToString() {
        Vector3D v = new Vector3D(1.0, 2.0, 3.0);
        String str = v.toString();
        Assert.assertNotNull(str);
        Assert.assertTrue(str.contains("1") && str.contains("2") && str.contains("3"));
    }
}