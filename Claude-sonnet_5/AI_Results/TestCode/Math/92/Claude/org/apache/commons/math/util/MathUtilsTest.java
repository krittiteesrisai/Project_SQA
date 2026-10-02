package org.apache.commons.math.util;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

/**
 * Unit tests for {@link MathUtils} (Defects4J Math-92b).
 * เน้น branch/condition coverage และพยายามจับ fault จริงเท่าที่วิเคราะห์ได้จาก source.
 */
public class MathUtilsTest {

    private static final double DELTA = 1e-9;

    // =====================================================================
    // addAndCheck(int, int)
    // =====================================================================

    @Test
    public void testAddAndCheckIntNormal() {
        assertEquals(5, MathUtils.addAndCheck(2, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckIntOverflowPositive() {
        MathUtils.addAndCheck(Integer.MAX_VALUE, 1);
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckIntOverflowNegative() {
        MathUtils.addAndCheck(Integer.MIN_VALUE, -1);
    }

    // =====================================================================
    // addAndCheck(long, long)  (ผ่าน private addAndCheck(a,b,msg))
    // =====================================================================

    @Test
    public void testAddAndCheckLongSwap_AGreaterB() {
        // a > b -> เข้า branch swap
        assertEquals(8L, MathUtils.addAndCheck(5L, 3L));
    }

    @Test
    public void testAddAndCheckLongBothNegativeNoOverflow() {
        assertEquals(-8L, MathUtils.addAndCheck(-5L, -3L));
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLongBothNegativeOverflow() {
        MathUtils.addAndCheck(Long.MIN_VALUE, -1L);
    }

    @Test
    public void testAddAndCheckLongOppositeSignsSafe() {
        assertEquals(-2L, MathUtils.addAndCheck(-5L, 3L));
    }

    @Test
    public void testAddAndCheckLongBothPositiveNoOverflow() {
        assertEquals(8L, MathUtils.addAndCheck(3L, 5L));
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLongBothPositiveOverflow() {
        MathUtils.addAndCheck(Long.MAX_VALUE - 2, 5L);
    }

    // =====================================================================
    // binomialCoefficient(n, k)
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientNLessThanK() {
        MathUtils.binomialCoefficient(3, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientNNegative() {
        MathUtils.binomialCoefficient(-1, 0);
    }

    @Test
    public void testBinomialCoefficientNEqualsK() {
        assertEquals(1L, MathUtils.binomialCoefficient(5, 5));
    }

    @Test
    public void testBinomialCoefficientKEqualsZero() {
        assertEquals(1L, MathUtils.binomialCoefficient(7, 0));
    }

    @Test
    public void testBinomialCoefficientKEqualsOne() {
        assertEquals(7L, MathUtils.binomialCoefficient(7, 1));
    }

    @Test
    public void testBinomialCoefficientKEqualsNMinusOne() {
        assertEquals(7L, MathUtils.binomialCoefficient(7, 6));
    }

    @Test
    public void testBinomialCoefficientGeneralSmall() {
        assertEquals(10L, MathUtils.binomialCoefficient(5, 2));
        assertEquals(120L, MathUtils.binomialCoefficient(10, 3));
        assertEquals(184756L, MathUtils.binomialCoefficient(20, 10));
    }

    @Test
    public void testBinomialCoefficientSymmetryProperty() {
        // Property-based check: C(n,k) == C(n, n-k)
        // อาจช่วยจับ fault เรื่องความคลาดเคลื่อนของ double-based calculation (ที่ทราบว่าเป็นจุดบั๊กของ Math-92)
        assertEquals(MathUtils.binomialCoefficient(40, 15),
                     MathUtils.binomialCoefficient(40, 25));
    }

    @Test
    public void testBinomialCoefficientPascalIdentity() {
        // Property-based check: C(n,k) == C(n-1,k-1) + C(n-1,k)
        long left = MathUtils.binomialCoefficient(50, 20);
        long right = MathUtils.binomialCoefficient(49, 19) + MathUtils.binomialCoefficient(49, 20);
        assertEquals(right, left);
    }

    // หมายเหตุ: branch "result == Long.MAX_VALUE throw ArithmeticException" ยากที่จะ trigger
    // อย่างแน่นอนด้วยค่าที่ปลอดภัยและ deterministic จาก source ที่ให้มา จึงไม่ทดสอบ branch นี้ตรง ๆ

    // =====================================================================
    // binomialCoefficientDouble(n, k)
    // =====================================================================

    @Test
    public void testBinomialCoefficientDoubleBasic() {
        assertEquals(10.0, MathUtils.binomialCoefficientDouble(5, 2), DELTA);
    }

    @Test
    public void testBinomialCoefficientDoubleOverflowToInfinity() {
        // ตาม javadoc: n > 1029 อาจทำให้ผลเกิน Double.MAX_VALUE -> Infinity
        double v = MathUtils.binomialCoefficientDouble(1040, 520);
        assertTrue(Double.isInfinite(v));
    }

    // =====================================================================
    // binomialCoefficientLog(n, k)
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientLogNLessThanK() {
        MathUtils.binomialCoefficientLog(2, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientLogNNegative() {
        MathUtils.binomialCoefficientLog(-2, 0);
    }

    @Test
    public void testBinomialCoefficientLogNEqualsKOrKZero() {
        assertEquals(0.0, MathUtils.binomialCoefficientLog(5, 5), DELTA);
        assertEquals(0.0, MathUtils.binomialCoefficientLog(5, 0), DELTA);
    }

    @Test
    public void testBinomialCoefficientLogKEqualsOneOrNMinusOne() {
        assertEquals(Math.log(7.0), MathUtils.binomialCoefficientLog(7, 1), DELTA);
        assertEquals(Math.log(7.0), MathUtils.binomialCoefficientLog(7, 6), DELTA);
    }

    @Test
    public void testBinomialCoefficientLogGeneralLoop() {
        // C(10,4) = 210 ; ln(210) = ln2+ln3+ln5+ln7
        double expected = Math.log(210.0);
        assertEquals(expected, MathUtils.binomialCoefficientLog(10, 4), 1e-9);
    }

    @Test
    public void testBinomialCoefficientLogConsistencyWithDoubleVersion() {
        double logVal = MathUtils.binomialCoefficientLog(30, 12);
        double expected = Math.log(MathUtils.binomialCoefficientDouble(30, 12));
        assertEquals(expected, logVal, 1e-6);
    }

    // =====================================================================
    // cosh / sinh
    // =====================================================================

    @Test
    public void testCoshZero() {
        assertEquals(1.0, MathUtils.cosh(0.0), DELTA);
    }

    @Test
    public void testSinhZero() {
        assertEquals(0.0, MathUtils.sinh(0.0), DELTA);
    }

    // =====================================================================
    // equals(double, double)
    // =====================================================================

    @Test
    public void testEqualsDoubleBothNaN() {
        assertTrue(MathUtils.equals(Double.NaN, Double.NaN));
    }

    @Test
    public void testEqualsDoubleEqualValues() {
        assertTrue(MathUtils.equals(1.5, 1.5));
    }

    @Test
    public void testEqualsDoubleNotEqual() {
        assertFalse(MathUtils.equals(1.5, 2.5));
    }

    @Test
    public void testEqualsDoubleOneNaNOnly() {
        assertFalse(MathUtils.equals(Double.NaN, 1.0));
    }

    // =====================================================================
    // equals(double[], double[])
    // =====================================================================

    @Test
    public void testEqualsArrayBothNull() {
        assertTrue(MathUtils.equals((double[]) null, (double[]) null));
    }

    @Test
    public void testEqualsArrayXNullYNotNull() {
        assertFalse(MathUtils.equals((double[]) null, new double[] {1.0}));
    }

    @Test
    public void testEqualsArrayXNotNullYNull() {
        assertFalse(MathUtils.equals(new double[] {1.0}, (double[]) null));
    }

    @Test
    public void testEqualsArrayDifferentLength() {
        assertFalse(MathUtils.equals(new double[] {1.0}, new double[] {1.0, 2.0}));
    }

    @Test
    public void testEqualsArrayEqualElements() {
        assertTrue(MathUtils.equals(new double[] {1.0, 2.0, Double.NaN},
                                     new double[] {1.0, 2.0, Double.NaN}));
    }

    @Test
    public void testEqualsArrayDifferentElements() {
        assertFalse(MathUtils.equals(new double[] {1.0, 2.0}, new double[] {1.0, 3.0}));
    }

    @Test
    public void testEqualsArrayEmpty() {
        assertTrue(MathUtils.equals(new double[0], new double[0]));
    }

    // =====================================================================
    // factorial(int)
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegative() {
        MathUtils.factorial(-1);
    }

    @Test(expected = ArithmeticException.class)
    public void testFactorialTooLarge() {
        MathUtils.factorial(21);
    }

    @Test
    public void testFactorialBoundaryZero() {
        assertEquals(1L, MathUtils.factorial(0));
    }

    @Test
    public void testFactorialBoundary20() {
        assertEquals(2432902008176640000L, MathUtils.factorial(20));
    }

    // =====================================================================
    // factorialDouble(int)
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialDoubleNegative() {
        MathUtils.factorialDouble(-1);
    }

    @Test
    public void testFactorialDoubleSmallUsesFactorial() {
        assertEquals(120.0, MathUtils.factorialDouble(5), DELTA);
    }

    @Test
    public void testFactorialDoubleLargeUsesLogPath() {
        // 21! = 51090942171709440000
        assertEquals(5.109094217170944E19, MathUtils.factorialDouble(21), 1e9);
    }

    // =====================================================================
    // factorialLog(int)
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialLogNegative() {
        MathUtils.factorialLog(-1);
    }

    @Test
    public void testFactorialLogSmall() {
        assertEquals(Math.log(MathUtils.factorial(5)), MathUtils.factorialLog(5), DELTA);
    }

    @Test
    public void testFactorialLogLargeUsesLoop() {
        double expected = Math.log(MathUtils.factorialDouble(25));
        assertEquals(expected, MathUtils.factorialLog(25), 1e-6);
    }

    // =====================================================================
    // gcd(int, int)
    // =====================================================================

    @Test
    public void testGcdUZero() {
        assertEquals(5, MathUtils.gcd(0, 5));
    }

    @Test
    public void testGcdVZero() {
        assertEquals(5, MathUtils.gcd(5, 0));
    }

    @Test
    public void testGcdBothZero() {
        assertEquals(0, MathUtils.gcd(0, 0));
    }

    @Test
    public void testGcdNormalPositive() {
        assertEquals(6, MathUtils.gcd(12, 18));
    }

    @Test
    public void testGcdCoprime() {
        assertEquals(1, MathUtils.gcd(17, 5));
    }

    @Test
    public void testGcdNegativeValues() {
        assertEquals(2, MathUtils.gcd(-4, 6));
    }

    @Test(expected = ArithmeticException.class)
    public void testGcdOverflow2Pow31() {
        // trigger k == 31 branch
        MathUtils.gcd(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    // =====================================================================
    // hash
    // =====================================================================

    @Test
    public void testHashDouble() {
        assertEquals(new Double(2.5).hashCode(), MathUtils.hash(2.5));
    }

    @Test
    public void testHashDoubleArrayNull() {
        assertEquals(0, MathUtils.hash((double[]) null));
    }

    @Test
    public void testHashDoubleArrayNonNull() {
        double[] arr = {1.0, 2.0};
        assertEquals(java.util.Arrays.hashCode(arr), MathUtils.hash(arr));
    }

    // =====================================================================
    // indicator(*) - ไม่มี zero branch (เฉพาะ >=0 / <0, และ NaN สำหรับ double/float)
    // =====================================================================

    @Test
    public void testIndicatorByte() {
        assertEquals((byte) 1, MathUtils.indicator((byte) 5));
        assertEquals((byte) -1, MathUtils.indicator((byte) -5));
        assertEquals((byte) 1, MathUtils.indicator((byte) 0));
    }

    @Test
    public void testIndicatorDouble() {
        assertEquals(1.0, MathUtils.indicator(3.0), DELTA);
        assertEquals(-1.0, MathUtils.indicator(-3.0), DELTA);
        assertEquals(1.0, MathUtils.indicator(0.0), DELTA);
    }

    @Test
    public void testIndicatorDoubleNaN() {
        assertTrue(Double.isNaN(MathUtils.indicator(Double.NaN)));
    }

    @Test
    public void testIndicatorFloat() {
        assertEquals(1.0F, MathUtils.indicator(3.0F), DELTA);
        assertEquals(-1.0F, MathUtils.indicator(-3.0F), DELTA);
    }

    @Test
    public void testIndicatorFloatNaN() {
        assertTrue(Float.isNaN(MathUtils.indicator(Float.NaN)));
    }

    @Test
    public void testIndicatorInt() {
        assertEquals(1, MathUtils.indicator(5));
        assertEquals(-1, MathUtils.indicator(-5));
        assertEquals(1, MathUtils.indicator(0));
    }

    @Test
    public void testIndicatorLong() {
        assertEquals(1L, MathUtils.indicator(5L));
        assertEquals(-1L, MathUtils.indicator(-5L));
    }

    @Test
    public void testIndicatorShort() {
        assertEquals((short) 1, MathUtils.indicator((short) 5));
        assertEquals((short) -1, MathUtils.indicator((short) -5));
    }

    // =====================================================================
    // lcm
    // =====================================================================

    @Test
    public void testLcmNormal() {
        assertEquals(36, MathUtils.lcm(12, 18));
    }

    @Test
    public void testLcmWithZero() {
        assertEquals(0, MathUtils.lcm(0, 5));
    }

    // =====================================================================
    // log(base, x)
    // =====================================================================

    @Test
    public void testLogBase2Of8() {
        assertEquals(3.0, MathUtils.log(2.0, 8.0), DELTA);
    }

    // =====================================================================
    // mulAndCheck(int, int)
    // =====================================================================

    @Test
    public void testMulAndCheckIntNormal() {
        assertEquals(12, MathUtils.mulAndCheck(3, 4));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckIntOverflow() {
        MathUtils.mulAndCheck(Integer.MAX_VALUE, 2);
    }

    // =====================================================================
    // mulAndCheck(long, long)
    // =====================================================================

    @Test
    public void testMulAndCheckLongSwap() {
        assertEquals(15L, MathUtils.mulAndCheck(5L, 3L));
    }

    @Test
    public void testMulAndCheckLongBothNegativeNoOverflow() {
        assertEquals(6L, MathUtils.mulAndCheck(-2L, -3L));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLongBothNegativeOverflow() {
        MathUtils.mulAndCheck(Long.MIN_VALUE, -1L);
    }

    @Test
    public void testMulAndCheckLongNegPosNoOverflow() {
        assertEquals(-15L, MathUtils.mulAndCheck(-5L, 3L));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLongNegPosOverflow() {
        MathUtils.mulAndCheck(Long.MIN_VALUE, 2L);
    }

    @Test
    public void testMulAndCheckLongNegZero() {
        assertEquals(0L, MathUtils.mulAndCheck(-5L, 0L));
    }

    @Test
    public void testMulAndCheckLongPosPosNoOverflow() {
        assertEquals(12L, MathUtils.mulAndCheck(3L, 4L));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLongPosPosOverflow() {
        MathUtils.mulAndCheck(Long.MAX_VALUE, 2L);
    }

    @Test
    public void testMulAndCheckLongZero() {
        assertEquals(0L, MathUtils.mulAndCheck(0L, 5L));
    }

    // =====================================================================
    // nextAfter
    // =====================================================================

    @Test
    public void testNextAfterNaN() {
        assertTrue(Double.isNaN(MathUtils.nextAfter(Double.NaN, 1.0)));
    }

    @Test
    public void testNextAfterInfinite() {
        assertEquals(Double.POSITIVE_INFINITY,
                MathUtils.nextAfter(Double.POSITIVE_INFINITY, 0.0), 0.0);
    }

    @Test
    public void testNextAfterZeroPositiveDirection() {
        assertEquals(Double.MIN_VALUE, MathUtils.nextAfter(0.0, 1.0), 0.0);
    }

    @Test
    public void testNextAfterZeroNegativeDirection() {
        assertEquals(-Double.MIN_VALUE, MathUtils.nextAfter(0.0, -1.0), 0.0);
    }

    @Test
    public void testNextAfterIncreaseMantissaNormal() {
        double result = MathUtils.nextAfter(1.0, 2.0);
        assertTrue(result > 1.0);
    }

    @Test
    public void testNextAfterIncreaseMantissaOverflowToExponent() {
        // mantissa ของ Double.MAX_VALUE เป็น all-1 -> ต้องขยับ exponent -> ได้ Infinity
        double result = MathUtils.nextAfter(Double.MAX_VALUE, Double.POSITIVE_INFINITY);
        assertEquals(Double.POSITIVE_INFINITY, result, 0.0);
    }

    @Test
    public void testNextAfterDecreaseMantissaNormal() {
        double result = MathUtils.nextAfter(1.0, 0.0);
        assertTrue(result < 1.0);
    }

    @Test
    public void testNextAfterDecreaseMantissaUnderflowToExponent() {
        // mantissa == 0 ของ MIN_NORMAL -> ลด exponent, mantissa กลายเป็น all-1 (denormal)
        double result = MathUtils.nextAfter(Double.MIN_NORMAL, 0.0);
        assertTrue(result < Double.MIN_NORMAL);
        assertTrue(result > 0.0);
    }

    // =====================================================================
    // scalb
    // =====================================================================

    @Test
    public void testScalbZero() {
        assertEquals(0.0, MathUtils.scalb(0.0, 5), 0.0);
    }

    @Test
    public void testScalbNaN() {
        assertTrue(Double.isNaN(MathUtils.scalb(Double.NaN, 3)));
    }

    @Test
    public void testScalbInfinite() {
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.scalb(Double.POSITIVE_INFINITY, 3), 0.0);
    }

    @Test
    public void testScalbNormal() {
        assertEquals(8.0, MathUtils.scalb(1.0, 3), DELTA);
    }

    // =====================================================================
    // normalizeAngle
    // =====================================================================

    @Test
    public void testNormalizeAngleBasic() {
        double result = MathUtils.normalizeAngle(3 * Math.PI, 0.0);
        assertEquals(Math.PI, result, 1e-9);
    }

    @Test
    public void testNormalizeAngleAlreadyInRange() {
        double result = MathUtils.normalizeAngle(0.5, 0.0);
        assertEquals(0.5, result, 1e-9);
    }

    // =====================================================================
    // round(double, scale) / round(double, scale, method)
    // =====================================================================

    @Test
    public void testRoundDoubleDefaultHalfUp() {
        assertEquals(123.46, MathUtils.round(123.455, 2), 1e-9);
    }

    @Test
    public void testRoundDoubleNaNCatchBranch() {
        // Double.toString(NaN) = "NaN" -> BigDecimal constructor throws NumberFormatException
        assertTrue(Double.isNaN(MathUtils.round(Double.NaN, 2)));
    }

    @Test
    public void testRoundDoublePositiveInfiniteCatchBranch() {
        assertEquals(Double.POSITIVE_INFINITY,
                MathUtils.round(Double.POSITIVE_INFINITY, 2), 0.0);
    }

    @Test
    public void testRoundDoubleNegativeInfiniteCatchBranch() {
        assertEquals(Double.NEGATIVE_INFINITY,
                MathUtils.round(Double.NEGATIVE_INFINITY, 2), 0.0);
    }

    // =====================================================================
    // round(float, scale) / round(float, scale, method) -> roundUnscaled branches
    // =====================================================================

    @Test
    public void testRoundFloatDefault() {
        assertEquals(3.0F, MathUtils.round(2.5F, 0), 1e-6);
    }

    @Test
    public void testRoundFloatCeilingPositive() {
        assertEquals(3.0F, MathUtils.round(2.5F, 0, BigDecimal.ROUND_CEILING), 1e-6);
    }

    @Test
    public void testRoundFloatCeilingNegative() {
        assertEquals(-2.0F, MathUtils.round(-2.5F, 0, BigDecimal.ROUND_CEILING), 1e-6);
    }

    @Test
    public void testRoundFloatFloorPositive() {
        assertEquals(2.0F, MathUtils.round(2.5F, 0, BigDecimal.ROUND_FLOOR), 1e-6);
    }

    @Test
    public void testRoundFloatFloorNegative() {
        assertEquals(-3.0F, MathUtils.round(-2.5F, 0, BigDecimal.ROUND_FLOOR), 1e-6);
    }

    @Test
    public void testRoundFloatDown() {
        assertEquals(2.0F, MathUtils.round(2.5F, 0, BigDecimal.ROUND_DOWN), 1e-6);
        assertEquals(-2.0F, MathUtils.round(-2.5F, 0, BigDecimal.ROUND_DOWN), 1e-6);
    }

    @Test
    public void testRoundFloatUp() {
        assertEquals(3.0F, MathUtils.round(2.5F, 0, BigDecimal.ROUND_UP), 1e-6);
        assertEquals(-3.0F, MathUtils.round(-2.5F, 0, BigDecimal.ROUND_UP), 1e-6);
    }

    @Test
    public void testRoundFloatHalfDownAtHalf() {
        assertEquals(2.0F, MathUtils.round(2.5F, 0, BigDecimal.ROUND_HALF_DOWN), 1e-6);
    }

    @Test
    public void testRoundFloatHalfDownAbove() {
        assertEquals(3.0F, MathUtils.round(2.6F, 0, BigDecimal.ROUND_HALF_DOWN), 1e-6);
    }

    @Test
    public void testRoundFloatHalfDownBelow() {
        assertEquals(2.0F, MathUtils.round(2.4F, 0, BigDecimal.ROUND_HALF_DOWN), 1e-6);
    }

    @Test
    public void testRoundFloatHalfEvenExactHalfToEven() {
        // 2.5 -> 2 (even)
        assertEquals(2.0F, MathUtils.round(2.5F, 0, BigDecimal.ROUND_HALF_EVEN), 1e-6);
    }

    @Test
    public void testRoundFloatHalfEvenExactHalfToOddRoundsUp() {
        // 3.5 -> 4 (เพื่อให้เป็นเลขคู่)
        assertEquals(4.0F, MathUtils.round(3.5F, 0, BigDecimal.ROUND_HALF_EVEN), 1e-6);
    }

    @Test
    public void testRoundFloatHalfEvenAboveHalf() {
        assertEquals(3.0F, MathUtils.round(2.6F, 0, BigDecimal.ROUND_HALF_EVEN), 1e-6);
    }

    @Test
    public void testRoundFloatHalfEvenBelowHalf() {
        assertEquals(2.0F, MathUtils.round(2.4F, 0, BigDecimal.ROUND_HALF_EVEN), 1e-6);
    }

    @Test
    public void testRoundFloatHalfUpPositive() {
        assertEquals(3.0F, MathUtils.round(2.5F, 0, BigDecimal.ROUND_HALF_UP), 1e-6);
    }

    @Test
    public void testRoundFloatHalfUpNegative() {
        assertEquals(-3.0F, MathUtils.round(-2.5F, 0, BigDecimal.ROUND_HALF_UP), 1e-6);
    }

    @Test
    public void testRoundFloatUnnecessaryNoThrow() {
        assertEquals(3.0F, MathUtils.round(3.0F, 0, BigDecimal.ROUND_UNNECESSARY), 1e-6);
    }

    @Test(expected = ArithmeticException.class)
    public void testRoundFloatUnnecessaryThrows() {
        MathUtils.round(2.5F, 0, BigDecimal.ROUND_UNNECESSARY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRoundFloatInvalidRoundingMethod() {
        MathUtils.round(2.5F, 0, 9999);
    }

    // =====================================================================
    // sign(*)
    // =====================================================================

    @Test
    public void testSignByte() {
        assertEquals((byte) 0, MathUtils.sign((byte) 0));
        assertEquals((byte) 1, MathUtils.sign((byte) 5));
        assertEquals((byte) -1, MathUtils.sign((byte) -5));
    }

    @Test
    public void testSignDouble() {
        assertEquals(0.0, MathUtils.sign(0.0), 0.0);
        assertEquals(1.0, MathUtils.sign(5.0), 0.0);
        assertEquals(-1.0, MathUtils.sign(-5.0), 0.0);
    }

    @Test
    public void testSignDoubleNaN() {
        assertTrue(Double.isNaN(MathUtils.sign(Double.NaN)));
    }

    @Test
    public void testSignFloat() {
        assertEquals(0.0F, MathUtils.sign(0.0F), 0.0);
        assertEquals(1.0F, MathUtils.sign(5.0F), 0.0);
        assertEquals(-1.0F, MathUtils.sign(-5.0F), 0.0);
    }

    @Test
    public void testSignFloatNaN() {
        assertTrue(Float.isNaN(MathUtils.sign(Float.NaN)));
    }

    @Test
    public void testSignInt() {
        assertEquals(0, MathUtils.sign(0));
        assertEquals(1, MathUtils.sign(5));
        assertEquals(-1, MathUtils.sign(-5));
    }

    @Test
    public void testSignLong() {
        assertEquals(0L, MathUtils.sign(0L));
        assertEquals(1L, MathUtils.sign(5L));
        assertEquals(-1L, MathUtils.sign(-5L));
    }

    @Test
    public void testSignShort() {
        assertEquals((short) 0, MathUtils.sign((short) 0));
        assertEquals((short) 1, MathUtils.sign((short) 5));
        assertEquals((short) -1, MathUtils.sign((short) -5));
    }

    // =====================================================================
    // subAndCheck(int, int)
    // =====================================================================

    @Test
    public void testSubAndCheckIntNormal() {
        assertEquals(2, MathUtils.subAndCheck(5, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckIntOverflow() {
        MathUtils.subAndCheck(Integer.MIN_VALUE, 1);
    }

    // =====================================================================
    // subAndCheck(long, long)
    // =====================================================================

    @Test
    public void testSubAndCheckLongBMinValueANegative() {
        long result = MathUtils.subAndCheck(-5L, Long.MIN_VALUE);
        assertEquals(Long.MAX_VALUE - 4, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckLongBMinValueAPositiveThrows() {
        MathUtils.subAndCheck(5L, Long.MIN_VALUE);
    }

    @Test
    public void testSubAndCheckLongNormalViaAddAndCheck() {
        assertEquals(7L, MathUtils.subAndCheck(10L, 3L));
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckLongOverflowViaAddAndCheck() {
        MathUtils.subAndCheck(Long.MAX_VALUE, -1L);
    }
}
