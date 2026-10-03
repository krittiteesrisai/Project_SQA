package org.apache.commons.math.geometry.euclidean.threed;

import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class RotationTest {

    private static final double EPSILON = 1.0e-10;

    @Test
    public void testQuaternionConstructor() {
        // needsNormalization = true
        Rotation r1 = new Rotation(2.0, 0.0, 0.0, 0.0, true);
        Assert.assertEquals(1.0, r1.getQ0(), EPSILON);
        Assert.assertEquals(0.0, r1.getQ1(), EPSILON);
        Assert.assertEquals(0.0, r1.getQ2(), EPSILON);
        Assert.assertEquals(0.0, r1.getQ3(), EPSILON);

        // needsNormalization = false
        Rotation r2 = new Rotation(1.0, 0.0, 0.0, 0.0, false);
        Assert.assertEquals(1.0, r2.getQ0(), EPSILON);
        Assert.assertEquals(0.0, r2.getQ1(), EPSILON);
        Assert.assertEquals(0.0, r2.getQ2(), EPSILON);
        Assert.assertEquals(0.0, r2.getQ3(), EPSILON);
    }

    @Test
    public void testAxisAngleConstructor() {
        Rotation r = new Rotation(new Vector3D(0, 0, 1), FastMath.PI / 2);
        Vector3D axis = r.getAxis();
        Assert.assertEquals(0.0, axis.getX(), EPSILON);
        Assert.assertEquals(0.0, axis.getY(), EPSILON);
        Assert.assertEquals(1.0, axis.getZ(), EPSILON);
        Assert.assertEquals(FastMath.PI / 2, r.getAngle(), EPSILON);
    }

    @Test(expected = MathRuntimeException.class)
    public void testAxisAngleZeroNorm() {
        new Rotation(Vector3D.ZERO, FastMath.PI / 2);
    }

    @Test
    public void testMatrixConstructorAllBranches() throws NotARotationMatrixException {
        // Branch 1: Trace > -0.19 (q0 computation)
        double[][] m1 = {
            { 1.0, 0.0, 0.0 },
            { 0.0, 1.0, 0.0 },
            { 0.0, 0.0, 1.0 }
        };
        Rotation r1 = new Rotation(m1, 1.0e-7);
        Assert.assertEquals(1.0, r1.getQ0(), EPSILON);

        // Branch 2: m00 - m11 - m22 > -0.19 (q1 computation) -> 180 deg around X
        double[][] m2 = {
            { 1.0,  0.0,  0.0 },
            { 0.0, -1.0,  0.0 },
            { 0.0,  0.0, -1.0 }
        };
        Rotation r2 = new Rotation(m2, 1.0e-7);
        Assert.assertEquals(0.0, r2.getQ0(), EPSILON);
        Assert.assertEquals(1.0, FastMath.abs(r2.getQ1()), EPSILON);

        // Branch 3: m11 - m00 - m22 > -0.19 (q2 computation) -> 180 deg around Y
        double[][] m3 = {
            { -1.0, 0.0,  0.0 },
            {  0.0, 1.0,  0.0 },
            {  0.0, 0.0, -1.0 }
        };
        Rotation r3 = new Rotation(m3, 1.0e-7);
        Assert.assertEquals(0.0, r3.getQ0(), EPSILON);
        Assert.assertEquals(1.0, FastMath.abs(r2.getQ1()), EPSILON);

        // Branch 4: else (q3 computation) -> 180 deg around Z
        double[][] m4 = {
            { -1.0,  0.0, 0.0 },
            {  0.0, -1.0, 0.0 },
            {  0.0,  0.0, 1.0 }
        };
        Rotation r4 = new Rotation(m4, 1.0e-7);
        Assert.assertEquals(0.0, r4.getQ0(), EPSILON);
        Assert.assertEquals(1.0, FastMath.abs(r4.getQ3()), EPSILON);
    }

    @Test(expected = NotARotationMatrixException.class)
    public void testMatrixConstructorInvalidDimension() throws NotARotationMatrixException {
        double[][] invalid = { { 1.0, 0.0 }, { 0.0, 1.0 } };
        new Rotation(invalid, 1.0e-7);
    }

    @Test(expected = NotARotationMatrixException.class)
    public void testMatrixConstructorNegativeDeterminant() throws NotARotationMatrixException {
        // Reflection matrix with determinant = -1
        double[][] reflection = {
            { -1.0, 0.0, 0.0 },
            {  0.0, 1.0, 0.0 },
            {  0.0, 0.0, 1.0 }
        };
        new Rotation(reflection, 1.0e-7);
    }

    @Test(expected = NotARotationMatrixException.class)
    public void testMatrixConstructorNonOrthogonalNonConvergent() throws NotARotationMatrixException {
        // Heavily non-orthogonal matrix that will not converge within 10 iterations
        double[][] nonOrthogonal = {
            { 10.0, 20.0, 30.0 },
            { 40.0, 50.0, 60.0 },
            { 70.0, 80.0, 90.0 }
        };
        new Rotation(nonOrthogonal, 1.0e-15);
    }

    @Test
    public void testTwoVectorsConstructor() {
        // General case
        Vector3D u = new Vector3D(1, 0, 0);
        Vector3D v = new Vector3D(0, 1, 0);
        Rotation r = new Rotation(u, v);
        Vector3D res = r.applyTo(u);
        Assert.assertEquals(0.0, res.getX(), EPSILON);
        Assert.assertEquals(1.0, res.getY(), EPSILON);
        Assert.assertEquals(0.0, res.getZ(), EPSILON);

        // Opposite vectors (u = -v)
        Vector3D uOpp = new Vector3D(1, 0, 0);
        Vector3D vOpp = new Vector3D(-1, 0, 0);
        Rotation rOpp = new Rotation(uOpp, vOpp);
        Vector3D resOpp = rOpp.applyTo(uOpp);
        Assert.assertEquals(-1.0, resOpp.getX(), EPSILON);
        Assert.assertEquals(0.0, resOpp.getY(), EPSILON);
        Assert.assertEquals(0.0, resOpp.getZ(), EPSILON);
    }

    @Test(expected = MathRuntimeException.class)
    public void testTwoVectorsZeroNorm() {
        new Rotation(Vector3D.ZERO, Vector3D.PLUS_I);
    }

    @Test
    public void testFourVectorsConstructor() {
        Vector3D u1 = new Vector3D(1, 0, 0);
        Vector3D u2 = new Vector3D(0, 1, 0);
        Vector3D v1 = new Vector3D(0, 1, 0);
        Vector3D v2 = new Vector3D(-1, 0, 0);
        Rotation r = new Rotation(u1, u2, v1, v2);

        Vector3D out1 = r.applyTo(u1);
        Vector3D out2 = r.applyTo(u2);
        Assert.assertEquals(0.0, out1.distance(v1), EPSILON);
        Assert.assertEquals(0.0, out2.distance(v2), EPSILON);

        // Identity case where c == 0 down to final return
        Rotation rIdent = new Rotation(u1, u2, u1, u2);
        Assert.assertEquals(1.0, rIdent.getQ0(), EPSILON);
        Assert.assertEquals(0.0, rIdent.getQ1(), EPSILON);
        Assert.assertEquals(0.0, rIdent.getQ2(), EPSILON);
        Assert.assertEquals(0.0, rIdent.getQ3(), EPSILON);
    }

    @Test
    public void testFourVectorsEdgeCaseDefects4JMath52() {
        // Edge vectors triggering potential NaN in sqrt or singular planes
        Vector3D u1 = new Vector3D(-0.42111226929892144, -0.4392094765106749, 0.7935669301321458);
        Vector3D u2 = new Vector3D(0.8378505772643856, 0.3497589703308578, 0.4188308429378875);
        Vector3D v1 = new Vector3D(-0.5530341957799379, -0.27196328682020887, 0.7877460262960095);
        Vector3D v2 = new Vector3D(0.7877460262960095, -0.4068153366712956, 0.4619614275001996);
        Rotation r = new Rotation(u1, u2, v1, v2);
        Assert.assertFalse(Double.isNaN(r.getQ0()));
        Assert.assertFalse(Double.isNaN(r.getQ1()));
        Assert.assertFalse(Double.isNaN(r.getQ2()));
        Assert.assertFalse(Double.isNaN(r.getQ3()));
    }

    @Test(expected = MathRuntimeException.class)
    public void testFourVectorsZeroNorm() {
        new Rotation(Vector3D.ZERO, Vector3D.PLUS_J, Vector3D.PLUS_I, Vector3D.PLUS_K);
    }

    @Test
    public void testGetAxisAndAngleBranches() {
        // Identity: squaredSine == 0
        Rotation rIdent = Rotation.IDENTITY;
        Assert.assertEquals(1.0, rIdent.getAxis().getX(), EPSILON);
        Assert.assertEquals(0.0, rIdent.getAngle(), EPSILON);

        // q0 < 0
        Rotation rNegQ0 = new Rotation(-0.5, 0.5, 0.5, 0.5, true);
        Vector3D axisNeg = rNegQ0.getAxis();
        Assert.assertNotNull(axisNeg);
        Assert.assertTrue(rNegQ0.getAngle() > 0);

        // |q0| <= 0.1, q0 >= 0 (close to PI)
        Rotation rNearPi = new Rotation(0.05, FastMath.sqrt(1 - 0.0025), 0, 0, false);
        Assert.assertTrue(rNearPi.getAngle() > 0);

        // |q0| <= 0.1, q0 < 0
        Rotation rNearNegPi = new Rotation(-0.05, FastMath.sqrt(1 - 0.0025), 0, 0, false);
        Assert.assertTrue(rNearNegPi.getAngle() > 0);
    }

    @Test
    public void testAllRotationOrders() throws CardanEulerSingularityException {
        RotationOrder[] orders = {
            RotationOrder.XYZ, RotationOrder.XZY, RotationOrder.YXZ,
            RotationOrder.YZX, RotationOrder.ZXY, RotationOrder.ZYX,
            RotationOrder.XYX, RotationOrder.XZX, RotationOrder.YXY,
            RotationOrder.YZY, RotationOrder.ZXZ, RotationOrder.ZYZ
        };

        for (RotationOrder order : orders) {
            double a1 = 0.2;
            double a2 = 0.3;
            double a3 = 0.4;
            Rotation r = new Rotation(order, a1, a2, a3);
            double[] angles = r.getAngles(order);
            Assert.assertEquals(a1, angles[0], 1.0e-5);
            Assert.assertEquals(a2, angles[1], 1.0e-5);
            Assert.assertEquals(a3, angles[2], 1.0e-5);
        }
    }

    @Test
    public void testCardanSingularities() {
        RotationOrder[] cardanOrders = {
            RotationOrder.XYZ, RotationOrder.XZY, RotationOrder.YXZ,
            RotationOrder.YZX, RotationOrder.ZXY, RotationOrder.ZYX
        };

        for (RotationOrder order : cardanOrders) {
            try {
                // Gimbal lock at second angle = PI/2
                Rotation r = new Rotation(order, 0.1, FastMath.PI / 2, 0.3);
                r.getAngles(order);
                Assert.fail("Expected CardanEulerSingularityException for order: " + order);
            } catch (CardanEulerSingularityException e) {
                Assert.assertTrue(e.getCardan());
            }
        }
    }

    @Test
    public void testEulerSingularities() {
        RotationOrder[] eulerOrders = {
            RotationOrder.XYX, RotationOrder.XZX, RotationOrder.YXY,
            RotationOrder.YZY, RotationOrder.ZXZ, RotationOrder.ZYZ
        };

        for (RotationOrder order : eulerOrders) {
            try {
                // Identity rotation is always singular for Euler angles (second angle = 0)
                Rotation.IDENTITY.getAngles(order);
                Assert.fail("Expected CardanEulerSingularityException for order: " + order);
            } catch (CardanEulerSingularityException e) {
                Assert.assertFalse(e.getCardan());
            }
        }
    }

    @Test
    public void testApplyAndInverses() {
        Rotation r = new Rotation(Vector3D.PLUS_K, FastMath.PI / 2);
        Vector3D v = Vector3D.PLUS_I;

        Vector3D applied = r.applyTo(v);
        Assert.assertEquals(0.0, applied.getX(), EPSILON);
        Assert.assertEquals(1.0, applied.getY(), EPSILON);
        Assert.assertEquals(0.0, applied.getZ(), EPSILON);

        Vector3D invApplied = r.applyInverseTo(applied);
        Assert.assertEquals(1.0, invApplied.getX(), EPSILON);
        Assert.assertEquals(0.0, invApplied.getY(), EPSILON);
        Assert.assertEquals(0.0, invApplied.getZ(), EPSILON);

        Rotation reverted = r.revert();
        Vector3D revApplied = reverted.applyTo(applied);
        Assert.assertEquals(1.0, revApplied.getX(), EPSILON);
        Assert.assertEquals(0.0, revApplied.getY(), EPSILON);

        Rotation rComp = r.applyTo(reverted);
        Assert.assertEquals(0.0, Rotation.distance(rComp, Rotation.IDENTITY), EPSILON);

        Rotation rInvComp = r.applyInverseTo(r);
        Assert.assertEquals(0.0, Rotation.distance(rInvComp, Rotation.IDENTITY), EPSILON);
    }

    @Test
    public void testGetMatrix() {
        Rotation r = new Rotation(Vector3D.PLUS_K, FastMath.PI / 2);
        double[][] m = r.getMatrix();
        Assert.assertEquals(3, m.length);
        Assert.assertEquals(3, m[0].length);

        Assert.assertEquals(0.0, m[0][0], EPSILON);
        Assert.assertEquals(-1.0, m[0][1], EPSILON);
        Assert.assertEquals(0.0, m[0][2], EPSILON);
        Assert.assertEquals(1.0, m[1][0], EPSILON);
        Assert.assertEquals(0.0, m[1][1], EPSILON);
        Assert.assertEquals(0.0, m[1][2], EPSILON);
        Assert.assertEquals(0.0, m[2][0], EPSILON);
        Assert.assertEquals(0.0, m[2][1], EPSILON);
        Assert.assertEquals(1.0, m[2][2], EPSILON);
    }
}