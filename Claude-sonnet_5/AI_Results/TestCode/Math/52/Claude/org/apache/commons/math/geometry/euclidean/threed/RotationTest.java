package org.apache.commons.math.geometry.euclidean.threed;

import static org.junit.Assert.*;
import org.junit.Test;

import org.apache.commons.math.geometry.euclidean.threed.Rotation;
import org.apache.commons.math.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math.geometry.euclidean.threed.RotationOrder;
import org.apache.commons.math.geometry.euclidean.threed.NotARotationMatrixException;
import org.apache.commons.math.geometry.euclidean.threed.CardanEulerSingularityException;

public class RotationTest {

    private static final double EPS = 1e-9;

    // ---------- helper ----------
    private void assertVectorEquals(Vector3D expected, Vector3D actual, double eps) {
        assertEquals(expected.getX(), actual.getX(), eps);
        assertEquals(expected.getY(), actual.getY(), eps);
        assertEquals(expected.getZ(), actual.getZ(), eps);
    }

    /** เปรียบเทียบ quaternion สองตัวว่าแทน rotation เดียวกัน (q และ -q ถือว่าเหมือนกัน) */
    private void assertSameRotation(Rotation a, Rotation b, double eps) {
        double dot = a.getQ0() * b.getQ0() + a.getQ1() * b.getQ1()
                   + a.getQ2() * b.getQ2() + a.getQ3() * b.getQ3();
        assertEquals(1.0, Math.abs(dot), eps);
    }

    // =========================================================
    // Constructor(q0,q1,q2,q3,needsNormalization)
    // =========================================================

    @Test
    public void testConstructorQuaternion_NoNormalization() {
        Rotation r = new Rotation(1.0, 0.0, 0.0, 0.0, false);
        assertEquals(1.0, r.getQ0(), EPS);
        assertEquals(0.0, r.getQ1(), EPS);
        assertEquals(0.0, r.getQ2(), EPS);
        assertEquals(0.0, r.getQ3(), EPS);
    }

    @Test
    public void testConstructorQuaternion_WithNormalization() {
        Rotation r = new Rotation(2.0, 0.0, 0.0, 0.0, true); // |q| = 2 -> normalize to 1
        assertEquals(1.0, r.getQ0(), EPS);
        assertEquals(0.0, r.getQ1(), EPS);
        assertEquals(0.0, r.getQ2(), EPS);
        assertEquals(0.0, r.getQ3(), EPS);
    }

    // =========================================================
    // Constructor(Vector3D axis, double angle)
    // =========================================================

    @Test(expected = ArithmeticException.class)
    public void testConstructorAxisAngle_ZeroNorm() {
        // norm == 0 -> ArithmeticException (ตาม MathRuntimeException.createArithmeticException)
        new Rotation(new Vector3D(0, 0, 0), Math.PI / 2);
    }

    @Test
    public void testConstructorAxisAngle_Normal() {
        // ตามเอกสาร: axis=+k, angle=PI/2, apply to +i -> +j
        Rotation r = new Rotation(Vector3D.PLUS_K, Math.PI / 2);
        Vector3D result = r.applyTo(Vector3D.PLUS_I);
        assertVectorEquals(Vector3D.PLUS_J, result, 1e-9);
    }

    // =========================================================
    // Constructor(double[][] m, double threshold)
    // =========================================================

    @Test(expected = NotARotationMatrixException.class)
    public void testConstructorMatrix_WrongRowCount() throws Exception {
        double[][] m = new double[2][3];
        new Rotation(m, 1e-10);
    }

    @Test(expected = NotARotationMatrixException.class)
    public void testConstructorMatrix_WrongColCount() throws Exception {
        double[][] m = new double[3][2];
        new Rotation(m, 1e-10);
    }

    @Test(expected = NotARotationMatrixException.class)
    public void testConstructorMatrix_NegativeDeterminant() throws Exception {
        // reflection matrix: orthogonal แต่ det = -1
        double[][] m = {
            {-1, 0, 0},
            { 0, 1, 0},
            { 0, 0, 1}
        };
        new Rotation(m, 1e-10);
    }

    @Test
    public void testConstructorMatrix_Identity_Branch_S_GreaterThanMinus019() throws Exception {
        double[][] m = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        Rotation r = new Rotation(m, 1e-10);
        assertEquals(1.0, r.getQ0(), 1e-9);
        assertEquals(0.0, r.getQ1(), 1e-9);
        assertEquals(0.0, r.getQ2(), 1e-9);
        assertEquals(0.0, r.getQ3(), 1e-9);
    }

    @Test
    public void testConstructorMatrix_Branch_Q1() throws Exception {
        // trace = -1 -> ไม่เข้ากิ่งแรก, s2 = m00-m11-m22 = 3 > -0.19 -> กิ่ง q1
        double[][] m = {
            {1, 0, 0},
            {0, -1, 0},
            {0, 0, -1}
        };
        Rotation r = new Rotation(m, 1e-10);
        assertEquals(0.0, r.getQ0(), 1e-9);
        assertEquals(1.0, r.getQ1(), 1e-9);
        assertEquals(0.0, r.getQ2(), 1e-9);
        assertEquals(0.0, r.getQ3(), 1e-9);
    }

    @Test
    public void testConstructorMatrix_Branch_Q2() throws Exception {
        double[][] m = {
            {-1, 0, 0},
            {0, 1, 0},
            {0, 0, -1}
        };
        Rotation r = new Rotation(m, 1e-10);
        assertEquals(0.0, r.getQ0(), 1e-9);
        assertEquals(0.0, r.getQ1(), 1e-9);
        assertEquals(1.0, r.getQ2(), 1e-9);
        assertEquals(0.0, r.getQ3(), 1e-9);
    }

    @Test
    public void testConstructorMatrix_Branch_Q3_ElseBranch() throws Exception {
        double[][] m = {
            {-1, 0, 0},
            {0, -1, 0},
            {0, 0, 1}
        };
        Rotation r = new Rotation(m, 1e-10);
        assertEquals(0.0, r.getQ0(), 1e-9);
        assertEquals(0.0, r.getQ1(), 1e-9);
        assertEquals(0.0, r.getQ2(), 1e-9);
        assertEquals(1.0, r.getQ3(), 1e-9);
    }

    @Test(expected = NotARotationMatrixException.class)
    public void testConstructorMatrix_OrthogonalizeNotConverge() throws Exception {
        // threshold เป็นค่าลบ -> |fn1-fn| <= threshold จะไม่เป็นจริงเสมอ -> loop ครบ 10 รอบแล้ว throw
        double[][] m = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        new Rotation(m, -1.0);
    }

    // =========================================================
    // Constructor(u1,u2,v1,v2)
    // =========================================================

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorFourVectors_ZeroNorm() {
        Vector3D u1 = new Vector3D(0, 0, 0);
        Vector3D u2 = Vector3D.PLUS_J;
        Vector3D v1 = Vector3D.PLUS_I;
        Vector3D v2 = Vector3D.PLUS_J;
        new Rotation(u1, u2, v1, v2);
    }

    @Test
    public void testConstructorFourVectors_NormalPath_CNotZero() {
        Vector3D u1 = Vector3D.PLUS_I;
        Vector3D u2 = Vector3D.PLUS_J;
        Vector3D v1 = Vector3D.PLUS_J;
        Vector3D v2 = Vector3D.PLUS_K;
        Rotation r = new Rotation(u1, u2, v1, v2);
        // ตรวจสอบทิศทางคร่าว ๆ (ไม่ใช่ขนาด เพราะมี scale factor ตาม javadoc)
        Vector3D img = r.applyTo(u1);
        double cos = img.dotProduct(v1) / (img.getNorm() * v1.getNorm());
        assertEquals(1.0, cos, 1e-6);
    }

    @Test
    public void testConstructorFourVectors_DeepestCEqualsZeroBranch_IdentityResult() {
        // u1=v1, u2=v2 (ขนานกันสนิท) -> ทุกชั้น c==0 -> คืน identity โดยตรง
        Vector3D u1 = Vector3D.PLUS_I;
        Vector3D u2 = Vector3D.PLUS_J;
        Vector3D v1 = Vector3D.PLUS_I;
        Vector3D v2 = Vector3D.PLUS_J;
        Rotation r = new Rotation(u1, u2, v1, v2);
        assertEquals(1.0, r.getQ0(), 1e-9);
        assertEquals(0.0, r.getQ1(), 1e-9);
        assertEquals(0.0, r.getQ2(), 1e-9);
        assertEquals(0.0, r.getQ3(), 1e-9);
    }

    // หมายเหตุ: กิ่ง "c==0 ชั้นแรกแต่ไม่ใช่ชั้นสอง" และ "c==0 สองชั้นแรกแต่ไม่ใช่ชั้นสาม"
    // (ที่ต้อง uRef/vRef = u2/v2) ต้องใช้เวกเตอร์ที่ออกแบบเชิงวิเคราะห์อย่างละเอียดมาก
    // ไม่สามารถยืนยัน behavior ได้แน่ชัดจากซอร์สที่ให้มาเพียงอย่างเดียว จึงไม่ได้ทดสอบ
    // เพื่อป้องกันการ "เดา" ผลลัพธ์ที่ไม่ถูกต้อง

    // =========================================================
    // Constructor(u, v)
    // =========================================================

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorTwoVectors_ZeroNorm() {
        new Rotation(new Vector3D(0, 0, 0), Vector3D.PLUS_I);
    }

    @Test
    public void testConstructorTwoVectors_GeneralCase() {
        Rotation r = new Rotation(Vector3D.PLUS_I, Vector3D.PLUS_J);
        Vector3D result = r.applyTo(Vector3D.PLUS_I);
        assertVectorEquals(Vector3D.PLUS_J, result, 1e-9);
    }

    @Test
    public void testConstructorTwoVectors_OppositeVectors_SpecialCase() {
        // u = -v (เกือบตรงข้ามสนิท) -> branch dot < (2e-15-1)*normProduct
        Vector3D u = Vector3D.PLUS_I;
        Vector3D v = new Vector3D(-1, 0, 0);
        Rotation r = new Rotation(u, v);
        Vector3D result = r.applyTo(u);
        assertVectorEquals(v, result, 1e-9);
    }

    // =========================================================
    // Constructor(RotationOrder, a1, a2, a3)
    // =========================================================

    @Test
    public void testConstructorRotationOrder_ComposesCorrectly() {
        RotationOrder order = RotationOrder.ZXZ;
        double a1 = 0.1, a2 = 0.2, a3 = 0.3;
        Rotation r = new Rotation(order, a1, a2, a3);

        Rotation r1 = new Rotation(order.getA1(), a1);
        Rotation r2 = new Rotation(order.getA2(), a2);
        Rotation r3 = new Rotation(order.getA3(), a3);
        Rotation expected = r1.applyTo(r2.applyTo(r3));

        assertSameRotation(expected, r, 1e-9);
    }

    // =========================================================
    // revert()
    // =========================================================

    @Test
    public void testRevert() {
        Rotation r = new Rotation(Vector3D.PLUS_K, Math.PI / 2);
        Rotation inv = r.revert();
        Vector3D v = new Vector3D(1, 2, 3);
        Vector3D roundTrip = inv.applyTo(r.applyTo(v));
        assertVectorEquals(v, roundTrip, 1e-9);
        assertEquals(-r.getQ0(), inv.getQ0(), EPS);
        assertEquals(r.getQ1(), inv.getQ1(), EPS);
    }

    // =========================================================
    // getQ0..getQ3 (getters)
    // =========================================================

    @Test
    public void testGetters() {
        Rotation r = new Rotation(0.5, 0.5, 0.5, 0.5, false);
        assertEquals(0.5, r.getQ0(), EPS);
        assertEquals(0.5, r.getQ1(), EPS);
        assertEquals(0.5, r.getQ2(), EPS);
        assertEquals(0.5, r.getQ3(), EPS);
    }

    // =========================================================
    // getAxis()
    // =========================================================

    @Test
    public void testGetAxis_SquaredSineZero() {
        Rotation r = new Rotation(1.0, 0.0, 0.0, 0.0, false); // identity -> squaredSine == 0
        Vector3D axis = r.getAxis();
        assertVectorEquals(new Vector3D(1, 0, 0), axis, EPS);
    }

    @Test
    public void testGetAxis_Q0Negative() {
        // normalize (-1,1,0,0) -> q0 = -0.7071, q1 = 0.7071
        Rotation r = new Rotation(-1.0, 1.0, 0.0, 0.0, true);
        Vector3D axis = r.getAxis();
        assertVectorEquals(new Vector3D(1, 0, 0), axis, 1e-6);
    }

    @Test
    public void testGetAxis_Q0Positive() {
        // normalize (1,1,0,0) -> q0 = 0.7071, q1 = 0.7071
        Rotation r = new Rotation(1.0, 1.0, 0.0, 0.0, true);
        Vector3D axis = r.getAxis();
        assertVectorEquals(new Vector3D(-1, 0, 0), axis, 1e-6);
    }

    // =========================================================
    // getAngle()
    // =========================================================

    @Test
    public void testGetAngle_Branch_AbsQ0GreaterThan0Point1() {
        double angle = Math.PI / 3; // q0 = cos(angle/2) ~ 0.866 > 0.1
        Rotation r = new Rotation(Vector3D.PLUS_K, angle);
        assertEquals(angle, r.getAngle(), 1e-6);
    }

    @Test
    public void testGetAngle_Branch_Q0NegativeSmall() {
        // angle = PI + 0.1 -> q0 = cos(angle/2) ~ -0.05 (อยู่ในช่วง (-0.1,0))
        double angle = Math.PI + 0.1;
        Rotation r = new Rotation(Vector3D.PLUS_K, angle);
        double expectedEffective = 2 * Math.PI - angle; // = PI - 0.1
        assertEquals(expectedEffective, r.getAngle(), 1e-6);
    }

    @Test
    public void testGetAngle_Branch_Q0PositiveSmall() {
        // angle = PI - 0.1 -> q0 = cos(angle/2) ~ 0.05 (อยู่ในช่วง [0,0.1])
        double angle = Math.PI - 0.1;
        Rotation r = new Rotation(Vector3D.PLUS_K, angle);
        assertEquals(angle, r.getAngle(), 1e-6);
    }

    // =========================================================
    // getAngles(RotationOrder) - round trip สำหรับทุก order (ไม่ singular)
    // =========================================================

    @Test
    public void testGetAngles_RoundTrip_AllOrders() throws Exception {
        RotationOrder[] orders = {
            RotationOrder.XYZ, RotationOrder.XZY, RotationOrder.YXZ,
            RotationOrder.YZX, RotationOrder.ZXY, RotationOrder.ZYX,
            RotationOrder.XYX, RotationOrder.XZX, RotationOrder.YXY,
            RotationOrder.YZY, RotationOrder.ZXZ, RotationOrder.ZYZ
        };
        for (RotationOrder order : orders) {
            Rotation original = new Rotation(order, 0.1, 0.2, 0.3);
            double[] angles = original.getAngles(order);
            Rotation rebuilt = new Rotation(order, angles[0], angles[1], angles[2]);
            assertSameRotation(original, rebuilt, 1e-6);
        }
    }

    @Test
    public void testGetAngles_Identity_CardanOrders_NoSingularity() throws Exception {
        RotationOrder[] cardan = {
            RotationOrder.XYZ, RotationOrder.XZY, RotationOrder.YXZ,
            RotationOrder.YZX, RotationOrder.ZXY, RotationOrder.ZYX
        };
        Rotation identity = Rotation.IDENTITY;
        for (RotationOrder order : cardan) {
            double[] angles = identity.getAngles(order);
            assertEquals(0.0, angles[0], 1e-9);
            assertEquals(0.0, angles[1], 1e-9);
            assertEquals(0.0, angles[2], 1e-9);
        }
    }

    @Test
    public void testGetAngles_Identity_EulerOrders_ThrowsSingularity() {
        RotationOrder[] euler = {
            RotationOrder.XYX, RotationOrder.XZX, RotationOrder.YXY,
            RotationOrder.YZY, RotationOrder.ZXZ, RotationOrder.ZYZ
        };
        Rotation identity = Rotation.IDENTITY;
        for (RotationOrder order : euler) {
            try {
                identity.getAngles(order);
                fail("ควร throw CardanEulerSingularityException สำหรับ order=" + order);
            } catch (CardanEulerSingularityException e) {
                // คาดหวัง
            }
        }
    }

    // =========================================================
    // getMatrix()
    // =========================================================

    @Test
    public void testGetMatrix_Identity() {
        Rotation r = Rotation.IDENTITY;
        double[][] m = r.getMatrix();
        double[][] expected = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                assertEquals(expected[i][j], m[i][j], EPS);
            }
        }
    }

    @Test
    public void testGetMatrix_RotationAboutZ90() {
        Rotation r = new Rotation(Vector3D.PLUS_K, Math.PI / 2);
        double[][] m = r.getMatrix();
        double[][] expected = {
            {0, -1, 0},
            {1,  0, 0},
            {0,  0, 1}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                assertEquals(expected[i][j], m[i][j], 1e-9);
            }
        }
    }

    // =========================================================
    // applyTo(Vector3D) / applyInverseTo(Vector3D)
    // =========================================================

    @Test
    public void testApplyTo_And_ApplyInverseTo_Vector_RoundTrip() {
        Rotation r = new Rotation(Vector3D.PLUS_K, Math.PI / 4);
        Vector3D v = new Vector3D(2, 3, 5);
        Vector3D rotated = r.applyTo(v);
        Vector3D back = r.applyInverseTo(rotated);
        assertVectorEquals(v, back, 1e-9);
    }

    // =========================================================
    // applyTo(Rotation) / applyInverseTo(Rotation)
    // =========================================================

    @Test
    public void testApplyToRotation_Composition() {
        Rotation r1 = new Rotation(Vector3D.PLUS_K, Math.PI / 2);
        Rotation r2 = new Rotation(Vector3D.PLUS_K, Math.PI / 3);
        Rotation comp = r1.applyTo(r2);

        Vector3D v = new Vector3D(1, 0, 0);
        Vector3D viaComp = comp.applyTo(v);
        Vector3D viaSequential = r1.applyTo(r2.applyTo(v));
        assertVectorEquals(viaSequential, viaComp, 1e-9);
    }

    @Test
    public void testApplyInverseToRotation_Composition() {
        Rotation r1 = new Rotation(Vector3D.PLUS_K, Math.PI / 2);
        Rotation r2 = new Rotation(Vector3D.PLUS_K, Math.PI / 3);
        Rotation comp = r1.applyInverseTo(r2);

        Vector3D v = new Vector3D(1, 0, 0);
        Vector3D viaComp = comp.applyTo(v);
        Vector3D viaSequential = r1.revert().applyTo(r2.applyTo(v));
        assertVectorEquals(viaSequential, viaComp, 1e-9);
    }

    // =========================================================
    // distance(r1, r2)
    // =========================================================

    @Test
    public void testDistance_SameRotation_IsZero() {
        Rotation r = new Rotation(Vector3D.PLUS_K, Math.PI / 5);
        assertEquals(0.0, Rotation.distance(r, r), 1e-9);
    }

    @Test
    public void testDistance_FromIdentity_EqualsAngle() {
        Rotation r = new Rotation(Vector3D.PLUS_K, Math.PI / 5);
        double d = Rotation.distance(Rotation.IDENTITY, r);
        assertEquals(r.getAngle(), d, 1e-9);
    }

    @Test
    public void testDistance_Symmetric() {
        Rotation r1 = new Rotation(Vector3D.PLUS_K, Math.PI / 4);
        Rotation r2 = new Rotation(Vector3D.PLUS_I, Math.PI / 6);
        double d1 = Rotation.distance(r1, r2);
        double d2 = Rotation.distance(r2, r1);
        assertEquals(d1, d2, 1e-9);
    }
}
