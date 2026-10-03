package org.apache.commons.math.complex;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * High branch-coverage JUnit 4 test suite for Complex class.
 */
public class ComplexTest {

    private static final double EPSILON = 1e-10;

    // ==========================================
    // 1. Basic Constructor, Getters & Constants
    // ==========================================

    @Test
    public void testGettersAndConstants() {
        Complex z = new Complex(3.0, 4.0);
        assertEquals(3.0, z.getReal(), EPSILON);
        assertEquals(4.0, z.getImaginary(), EPSILON);

        assertEquals(0.0, Complex.I.getReal(), EPSILON);
        assertEquals(1.0, Complex.I.getImaginary(), EPSILON);

        assertTrue(Complex.NaN.isNaN());
        assertTrue(Complex.INF.isInfinite());
        assertEquals(1.0, Complex.ONE.getReal(), EPSILON);
        assertEquals(0.0, Complex.ZERO.getReal(), EPSILON);
    }

    // ==========================================
    // 2. isNaN and isInfinite Coverage
    // ==========================================

    @Test
    public void testIsNaN() {
        assertFalse(new Complex(1.0, 2.0).isNaN());
        assertTrue(new Complex(Double.NaN, 2.0).isNaN());
        assertTrue(new Complex(1.0, Double.NaN).isNaN());
        assertTrue(new Complex(Double.NaN, Double.NaN).isNaN());
    }

    @Test
    public void testIsInfinite() {
        assertFalse(new Complex(1.0, 2.0).isInfinite());
        assertTrue(new Complex(Double.POSITIVE_INFINITY, 2.0).isInfinite());
        assertTrue(new Complex(1.0, Double.NEGATIVE_INFINITY).isInfinite());
        assertTrue(new Complex(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY).isInfinite());
        
        // If either is NaN, isInfinite must be false even if the other is Infinite
        assertFalse(new Complex(Double.NaN, Double.POSITIVE_INFINITY).isInfinite());
        assertFalse(new Complex(Double.NEGATIVE_INFINITY, Double.NaN).isInfinite());
    }

    // ==========================================
    // 3. equals() & hashCode()
    // ==========================================

    @Test
    public void testEqualsAndHashCode() {
        Complex z1 = new Complex(3.0, 4.0);
        Complex z2 = new Complex(3.0, 4.0);
        Complex z3 = new Complex(3.0, 5.0);
        Complex z4 = new Complex(4.0, 4.0);

        // Reflexive
        assertTrue(z1.equals(z1));

        // Symmetric & Equal
        assertTrue(z1.equals(z2));
        assertTrue(z2.equals(z1));
        assertEquals(z1.hashCode(), z2.hashCode());

        // Null and non-Complex object
        assertFalse(z1.equals(null));
        assertFalse(z1.equals("Not a complex object"));

        // Different values
        assertFalse(z1.equals(z3));
        assertFalse(z1.equals(z4));

        // NaN equality
        Complex nan1 = new Complex(Double.NaN, 1.0);
        Complex nan2 = new Complex(1.0, Double.NaN);
        assertTrue(nan1.equals(nan2));
        assertTrue(nan2.equals(Complex.NaN));
        assertFalse(z1.equals(nan1));
        assertFalse(nan1.equals(z1));
        assertEquals(7, Complex.NaN.hashCode());
        assertEquals(nan1.hashCode(), nan2.hashCode());
    }

    // ==========================================
    // 4. abs()
    // ==========================================

    @Test
    public void testAbs() {
        // NaN branch
        assertTrue(Double.isNaN(Complex.NaN.abs()));
        assertTrue(Double.isNaN(new Complex(Double.NaN, 0.0).abs()));

        // Infinite branch
        assertEquals(Double.POSITIVE_INFINITY, Complex.INF.abs(), EPSILON);
        assertEquals(Double.POSITIVE_INFINITY, new Complex(1.0, Double.NEGATIVE_INFINITY).abs(), EPSILON);

        // Branch: |real| < |imaginary|
        Complex z1 = new Complex(3.0, 4.0);
        assertEquals(5.0, z1.abs(), EPSILON);

        // Branch: |real| >= |imaginary|
        Complex z2 = new Complex(4.0, 3.0);
        assertEquals(5.0, z2.abs(), EPSILON);

        // Branch: real == 0.0
        Complex z3 = new Complex(0.0, 5.0);
        assertEquals(5.0, z3.abs(), EPSILON);

        // Branch: real == 0.0 and imaginary == 0.0
        assertEquals(0.0, Complex.ZERO.abs(), EPSILON);
    }

    // ==========================================
    // 5. add(), subtract(), negate(), conjugate()
    // ==========================================

    @Test
    public void testAdd() {
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(3.0, 4.0);
        Complex result = a.add(b);
        assertEquals(4.0, result.getReal(), EPSILON);
        assertEquals(6.0, result.getImaginary(), EPSILON);

        assertTrue(a.add(Complex.NaN).isNaN());
    }

    @Test(expected = NullPointerException.class)
    public void testAddNull() {
        Complex.ONE.add(null);
    }

    @Test
    public void testSubtract() {
        Complex a = new Complex(5.0, 7.0);
        Complex b = new Complex(2.0, 3.0);
        Complex result = a.subtract(b);
        assertEquals(3.0, result.getReal(), EPSILON);
        assertEquals(4.0, result.getImaginary(), EPSILON);

        assertTrue(a.subtract(Complex.NaN).isNaN());
        assertTrue(Complex.NaN.subtract(a).isNaN());
    }

    @Test(expected = NullPointerException.class)
    public void testSubtractNull() {
        Complex.ONE.subtract(null);
    }

    @Test
    public void testNegate() {
        Complex z = new Complex(2.5, -3.5);
        Complex negated = z.negate();
        assertEquals(-2.5, negated.getReal(), EPSILON);
        assertEquals(3.5, negated.getImaginary(), EPSILON);

        assertTrue(Complex.NaN.negate().isNaN());
    }

    @Test
    public void testConjugate() {
        Complex z = new Complex(2.5, -3.5);
        Complex conj = z.conjugate();
        assertEquals(2.5, conj.getReal(), EPSILON);
        assertEquals(3.5, conj.getImaginary(), EPSILON);

        assertTrue(Complex.NaN.conjugate().isNaN());
    }

    // ==========================================
    // 6. multiply()
    // ==========================================

    @Test
    public void testMultiply() {
        Complex a = new Complex(2.0, 3.0);
        Complex b = new Complex(4.0, 5.0);
        Complex result = a.multiply(b);
        // (2*4 - 3*5) + (2*5 + 3*4)i = (8 - 15) + (10 + 12)i = -7 + 22i
        assertEquals(-7.0, result.getReal(), EPSILON);
        assertEquals(22.0, result.getImaginary(), EPSILON);

        // NaN branches
        assertTrue(a.multiply(Complex.NaN).isNaN());
        assertTrue(Complex.NaN.multiply(a).isNaN());

        // Infinite branches
        Complex infReal = new Complex(Double.POSITIVE_INFINITY, 1.0);
        Complex infImag = new Complex(1.0, Double.NEGATIVE_INFINITY);
        assertEquals(Complex.INF, a.multiply(infReal));
        assertEquals(Complex.INF, infImag.multiply(b));
    }

    @Test(expected = NullPointerException.class)
    public void testMultiplyNull() {
        Complex.ONE.multiply(null);
    }

    // ==========================================
    // 7. divide()
    // ==========================================

    @Test
    public void testDivide() {
        Complex a = new Complex(2.0, 3.0);
        Complex b = new Complex(4.0, 5.0);

        // Normal division |c| < |d| (4.0 < 5.0)
        Complex res1 = a.divide(b);
        Complex expected1 = a.multiply(new Complex(4.0, -5.0)).multiply(new Complex(1.0 / 41.0, 0.0));
        assertEquals(expected1.getReal(), res1.getReal(), EPSILON);
        assertEquals(expected1.getImaginary(), res1.getImaginary(), EPSILON);

        // Normal division |c| >= |d| (5.0 >= 4.0)
        Complex c = new Complex(5.0, 4.0);
        Complex res2 = a.divide(c);
        Complex expected2 = a.multiply(new Complex(5.0, -4.0)).multiply(new Complex(1.0 / 41.0, 0.0));
        assertEquals(expected2.getReal(), res2.getReal(), EPSILON);
        assertEquals(expected2.getImaginary(), res2.getImaginary(), EPSILON);

        // Division by Zero
        assertTrue(a.divide(Complex.ZERO).isNaN());

        // Division involving NaN
        assertTrue(a.divide(Complex.NaN).isNaN());
        assertTrue(Complex.NaN.divide(a).isNaN());

        // Finite / Infinite -> ZERO
        assertEquals(Complex.ZERO, a.divide(Complex.INF));
        assertEquals(Complex.ZERO, a.divide(new Complex(Double.POSITIVE_INFINITY, 0.0)));

        // Infinite / Infinite -> NaN
        assertTrue(Complex.INF.divide(Complex.INF).isNaN());
    }

    @Test(expected = NullPointerException.class)
    public void testDivideNull() {
        Complex.ONE.divide(null);
    }

    // ==========================================
    // 8. sqrt() & sqrt1z()
    // ==========================================

    @Test
    public void testSqrt() {
        // NaN
        assertTrue(Complex.NaN.sqrt().isNaN());

        // (0, 0)
        Complex sqrtZero = Complex.ZERO.sqrt();
        assertEquals(0.0, sqrtZero.getReal(), EPSILON);
        assertEquals(0.0, sqrtZero.getImaginary(), EPSILON);

        // real >= 0 (e.g. 3 + 4i) -> sqrt = 2 + 1i
        Complex zPos = new Complex(3.0, 4.0);
        Complex resPos = zPos.sqrt();
        assertEquals(2.0, resPos.getReal(), EPSILON);
        assertEquals(1.0, resPos.getImaginary(), EPSILON);

        // real < 0 (e.g. -3 + 4i) -> sqrt = 1 + 2i
        Complex zNeg = new Complex(-3.0, 4.0);
        Complex resNeg = zNeg.sqrt();
        assertEquals(1.0, resNeg.getReal(), EPSILON);
        assertEquals(2.0, resNeg.getImaginary(), EPSILON);

        // real < 0 and imaginary < 0 (e.g. -3 - 4i) -> sqrt = 1 - 2i
        Complex zNegNeg = new Complex(-3.0, -4.0);
        Complex resNegNeg = zNegNeg.sqrt();
        assertEquals(1.0, resNegNeg.getReal(), EPSILON);
        assertEquals(-2.0, resNegNeg.getImaginary(), EPSILON);
    }

    @Test
    public void testSqrt1z() {
        Complex z = new Complex(0.5, 0.0);
        Complex res = z.sqrt1z(); // sqrt(1 - 0.25) = sqrt(0.75) ~ 0.8660254
        assertEquals(Math.sqrt(0.75), res.getReal(), EPSILON);
        assertEquals(0.0, res.getImaginary(), EPSILON);

        assertTrue(Complex.NaN.sqrt1z().isNaN());
    }

    // ==========================================
    // 9. exp(), log(), pow()
    // ==========================================

    @Test
    public void testExpAndLog() {
        // NaN branches
        assertTrue(Complex.NaN.exp().isNaN());
        assertTrue(Complex.NaN.log().isNaN());

        // exp(0) = 1
        Complex expZero = Complex.ZERO.exp();
        assertEquals(1.0, expZero.getReal(), EPSILON);
        assertEquals(0.0, expZero.getImaginary(), EPSILON);

        // exp(i * pi) = -1
        Complex iPi = new Complex(0.0, Math.PI);
        Complex expIPi = iPi.exp();
        assertEquals(-1.0, expIPi.getReal(), EPSILON);
        assertEquals(0.0, expIPi.getImaginary(), EPSILON);

        // log(1) = 0
        Complex logOne = Complex.ONE.log();
        assertEquals(0.0, logOne.getReal(), EPSILON);
        assertEquals(0.0, logOne.getImaginary(), EPSILON);

        // log(exp(z)) == z
        Complex z = new Complex(1.5, 0.5);
        Complex roundTrip = z.exp().log();
        assertEquals(z.getReal(), roundTrip.getReal(), EPSILON);
        assertEquals(z.getImaginary(), roundTrip.getImaginary(), EPSILON);
    }

    @Test
    public void testPow() {
        Complex base = new Complex(2.0, 0.0);
        Complex exponent = new Complex(3.0, 0.0);
        Complex result = base.pow(exponent); // 2^3 = 8
        assertEquals(8.0, result.getReal(), EPSILON);
        assertEquals(0.0, result.getImaginary(), EPSILON);

        assertTrue(base.pow(Complex.NaN).isNaN());
        assertTrue(Complex.NaN.pow(exponent).isNaN());
    }

    @Test(expected = NullPointerException.class)
    public void testPowNull() {
        Complex.ONE.pow(null);
    }

    // ==========================================
    // 10. Trigonometric Functions
    // ==========================================

    @Test
    public void testTrigonometric() {
        // NaN branches
        assertTrue(Complex.NaN.sin().isNaN());
        assertTrue(Complex.NaN.cos().isNaN());
        assertTrue(Complex.NaN.tan().isNaN());
        assertTrue(Complex.NaN.asin().isNaN());
        assertTrue(Complex.NaN.acos().isNaN());
        assertTrue(Complex.NaN.atan().isNaN());

        // Standard known evaluations
        Complex zero = Complex.ZERO;
        assertEquals(0.0, zero.sin().getReal(), EPSILON);
        assertEquals(1.0, zero.cos().getReal(), EPSILON);
        assertEquals(0.0, zero.tan().getReal(), EPSILON);

        Complex z = new Complex(0.5, 0.5);
        // sin^2(z) + cos^2(z) == 1
        Complex sin = z.sin();
        Complex cos = z.cos();
        Complex identity = sin.multiply(sin).add(cos.multiply(cos));
        assertEquals(1.0, identity.getReal(), EPSILON);
        assertEquals(0.0, identity.getImaginary(), EPSILON);

        // Inverse functions roundtrip: sin(asin(z)) == z
        Complex asinSin = z.asin().sin();
        assertEquals(z.getReal(), asinSin.getReal(), EPSILON);
        assertEquals(z.getImaginary(), asinSin.getImaginary(), EPSILON);

        Complex acosCos = z.acos().cos();
        assertEquals(z.getReal(), acosCos.getReal(), EPSILON);
        assertEquals(z.getImaginary(), acosCos.getImaginary(), EPSILON);

        Complex atanTan = z.atan().tan();
        assertEquals(z.getReal(), atanTan.getReal(), EPSILON);
        assertEquals(z.getImaginary(), atanTan.getImaginary(), EPSILON);
    }

    // ==========================================
    // 11. Hyperbolic Functions
    // ==========================================

    @Test
    public void testHyperbolic() {
        // NaN branches
        assertTrue(Complex.NaN.sinh().isNaN());
        assertTrue(Complex.NaN.cosh().isNaN());
        assertTrue(Complex.NaN.tanh().isNaN());

        // cosh^2(z) - sinh^2(z) == 1
        Complex z = new Complex(0.6, 0.4);
        Complex cosh = z.cosh();
        Complex sinh = z.sinh();
        Complex identity = cosh.multiply(cosh).subtract(sinh.multiply(sinh));
        assertEquals(1.0, identity.getReal(), EPSILON);
        assertEquals(0.0, identity.getImaginary(), EPSILON);

        // tanh(z) == sinh(z) / cosh(z)
        Complex tanh = z.tanh();
        Complex div = sinh.divide(cosh);
        assertEquals(div.getReal(), tanh.getReal(), EPSILON);
        assertEquals(div.getImaginary(), tanh.getImaginary(), EPSILON);
    }

    // ==========================================
    // 12. Protected Factory Method Coverage
    // ==========================================

    @Test
    public void testCreateComplex() {
        Complex c = new Complex(1.0, 2.0) {
            public Complex make(double r, double i) {
                return createComplex(r, i);
            }
        }.make(7.0, 8.0);

        assertEquals(7.0, c.getReal(), EPSILON);
        assertEquals(8.0, c.getImaginary(), EPSILON);
    }
}