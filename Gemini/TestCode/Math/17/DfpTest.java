package org.apache.commons.math3.dfp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DfpTest {

    private DfpField factory20;
    private DfpField factory10;

    @Before
    public void setUp() {
        // Field with 20 radix digits (80 decimal digits)
        factory20 = new DfpField(20);
        // Field with 10 radix digits for precision mismatch testing
        factory10 = new DfpField(10);
    }

    // ==========================================
    // 1. Constructors & Factory Methods Tests
    // ==========================================

    @Test
    public void testConstructorLongSpecialCases() {
        Dfp minLong = factory20.newDfp(Long.MIN_VALUE);
        Assert.assertTrue(minLong.strictlyNegative());
        Assert.assertEquals("-9223372036854775808.", minLong.toString());

        Dfp zeroLong = factory20.newDfp(0L);
        Assert.assertTrue(zeroLong.isZero());
        Assert.assertEquals(1, zeroLong.sign);

        Dfp posLong = factory20.newDfp(1234567890123456789L);
        Assert.assertTrue(posLong.strictlyPositive());
    }

    @Test
    public void testConstructorDoubleSpecialCases() {
        Dfp posZero = factory20.newDfp(0.0);
        Assert.assertTrue(posZero.isZero());
        Assert.assertEquals(1, posZero.sign);

        Dfp negZero = factory20.newDfp(-0.0);
        Assert.assertTrue(negZero.isZero());
        Assert.assertEquals(-1, negZero.sign);

        Dfp posInf = factory20.newDfp(Double.POSITIVE_INFINITY);
        Assert.assertTrue(posInf.isInfinite());
        Assert.assertEquals(1, posInf.sign);

        Dfp negInf = factory20.newDfp(Double.NEGATIVE_INFINITY);
        Assert.assertTrue(negInf.isInfinite());
        Assert.assertEquals(-1, negInf.sign);

        Dfp nan = factory20.newDfp(Double.NaN);
        Assert.assertTrue(nan.isNaN());

        // Subnormal double
        Dfp subnormal = factory20.newDfp(Double.MIN_VALUE);
        Assert.assertTrue(subnormal.strictlyPositive());
        Assert.assertFalse(subnormal.isZero());
    }

    @Test
    public void testConstructorStringFormats() {
        Dfp pInf = factory20.newDfp("Infinity");
        Assert.assertTrue(pInf.isInfinite() && pInf.sign == 1);

        Dfp nInf = factory20.newDfp("-Infinity");
        Assert.assertTrue(nInf.isInfinite() && nInf.sign == -1);

        Dfp nan = factory20.newDfp("NaN");
        Assert.assertTrue(nan.isNaN());

        // Scientific notation: lower 'e', upper 'E', negative/positive exponents
        Dfp sci1 = factory20.newDfp("1.2345e2");
        Dfp sci2 = factory20.newDfp("1.2345E-2");
        Dfp sci3 = factory20.newDfp("-1.2345e+2");

        Assert.assertEquals(factory20.newDfp("123.45"), sci1);
        Assert.assertEquals(factory20.newDfp("0.012345"), sci2);
        Assert.assertEquals(factory20.newDfp("-123.45"), sci3);

        // Leading and trailing zeros
        Dfp zeros = factory20.newDfp("0000123.450000");
        Assert.assertEquals(factory20.newDfp("123.45"), zeros);

        Dfp zeroDec = factory20.newDfp("0.00000");
        Assert.assertTrue(zeroDec.isZero());

        Dfp noDec = factory20.newDfp("12345678");
        Assert.assertEquals(factory20.newDfp("12345678.0"), noDec);
    }

    @Test
    public void testPrecisionMismatchTrap() {
        factory20.clearIEEEFlags();
        Dfp d20 = factory20.getOne();
        Dfp d10 = factory10.getOne();

        Dfp result = d20.newInstance(d10);
        Assert.assertTrue(result.isNaN());
        Assert.assertTrue((factory20.getIEEEFlags() & DfpField.FLAG_INVALID) != 0);
    }

    // ==========================================
    // 2. Arithmetic & Edge Cases (Math-17 Target)
    // ==========================================

    @Test
    public void testMultiplyInteger() {
        Dfp a = factory20.newDfp("12345.6789");

        // Normal single digit multiplication (0 <= x < 10000)
        Dfp r1 = a.multiply(5);
        Assert.assertEquals(factory20.newDfp("61728.3945"), r1);

        // Multiplied by zero
        Dfp rZero = a.multiply(0);
        Assert.assertTrue(rZero.isZero());

        // Multiplied by RADIX boundary or larger / negative ints
        Dfp rRadix = a.multiply(10000);
        Assert.assertEquals(factory20.newDfp("123456789"), rRadix);

        Dfp rLarge = a.multiply(123456);
        Assert.assertEquals(a.multiply(factory20.newDfp(123456)), rLarge);

        Dfp rNeg = a.multiply(-1);
        Assert.assertEquals(a.negate(), rNeg);

        Dfp rNegLarge = a.multiply(-25000);
        Assert.assertEquals(a.multiply(factory20.newDfp(-25000)), rNegLarge);
    }

    @Test
    public void testMultiplySpecialValues() {
        Dfp inf = factory20.newDfp((byte) 1, Dfp.INFINITE);
        Dfp zero = factory20.getZero();
        Dfp nan = factory20.newDfp((byte) 1, Dfp.QNAN);

        // Inf * 0 -> Invalid Trap / NaN
        factory20.clearIEEEFlags();
        Dfp res = inf.multiply(zero);
        Assert.assertTrue(res.isNaN());
        Assert.assertTrue((factory20.getIEEEFlags() & DfpField.FLAG_INVALID) != 0);

        // Inf * Finite
        Assert.assertTrue(inf.multiply(factory20.newDfp(5)).isInfinite());

        // NaN * Any
        Assert.assertTrue(nan.multiply(factory20.newDfp(5)).isNaN());
    }

    @Test
    public void testAddSpecialCasesAndAlignment() {
        Dfp pInf = factory20.newDfp((byte) 1, Dfp.INFINITE);
        Dfp nInf = factory20.newDfp((byte) -1, Dfp.INFINITE);

        // +Inf + (-Inf) -> NaN
        factory20.clearIEEEFlags();
        Dfp infSum = pInf.add(nInf);
        Assert.assertTrue(infSum.isNaN());
        Assert.assertTrue((factory20.getIEEEFlags() & DfpField.FLAG_INVALID) != 0);

        // Large alignment shift exceeding precision
        Dfp huge = factory20.newDfp("1e50");
        Dfp tiny = factory20.newDfp("1e-50");
        Dfp sum = huge.add(tiny);
        Assert.assertEquals(huge, sum);

        // Opposite sign addition resulting in zero
        Dfp one = factory20.getOne();
        Dfp negOne = one.negate();
        Dfp zeroRes = one.add(negOne);
        Assert.assertTrue(zeroRes.isZero());
        Assert.assertEquals(1, zeroRes.sign);
    }

    @Test
    public void testDivideSpecialCases() {
        Dfp one = factory20.getOne();
        Dfp zero = factory20.getZero();
        Dfp pInf = factory20.newDfp((byte) 1, Dfp.INFINITE);

        // Divide by zero -> Infinity & FLAG_DIV_ZERO
        factory20.clearIEEEFlags();
        Dfp divZero = one.divide(zero);
        Assert.assertTrue(divZero.isInfinite());
        Assert.assertTrue((factory20.getIEEEFlags() & DfpField.FLAG_DIV_ZERO) != 0);

        // Inf / Inf -> NaN
        factory20.clearIEEEFlags();
        Dfp infDivInf = pInf.divide(pInf);
        Assert.assertTrue(infDivInf.isNaN());
        Assert.assertTrue((factory20.getIEEEFlags() & DfpField.FLAG_INVALID) != 0);

        // Integer divide
        Dfp divInt = factory20.newDfp("100").divide(4);
        Assert.assertEquals(factory20.newDfp("25"), divInt);

        // Integer divide by zero
        factory20.clearIEEEFlags();
        Dfp divIntZero = factory20.newDfp("100").divide(0);
        Assert.assertTrue(divIntZero.isInfinite());
        Assert.assertTrue((factory20.getIEEEFlags() & DfpField.FLAG_DIV_ZERO) != 0);
    }

    @Test
    public void testSqrt() {
        Dfp zero = factory20.getZero();
        Assert.assertTrue(zero.sqrt().isZero());

        Dfp four = factory20.newDfp(4);
        Assert.assertEquals(factory20.newDfp(2), four.sqrt());

        Dfp pInf = factory20.newDfp((byte) 1, Dfp.INFINITE);
        Assert.assertTrue(pInf.sqrt().isInfinite());

        // Negative sqrt -> NaN
        factory20.clearIEEEFlags();
        Dfp negSqrt = factory20.newDfp(-4).sqrt();
        Assert.assertTrue(negSqrt.isNaN());
        Assert.assertTrue((factory20.getIEEEFlags() & DfpField.FLAG_INVALID) != 0);
    }

    // ==========================================
    // 3. Rounding Modes & Truncation
    // ==========================================

    @Test
    public void testRoundingModes() {
        Dfp valPos = factory20.newDfp("2.5");
        Dfp valPosHalfOdd = factory20.newDfp("3.5");
        Dfp valNeg = factory20.newDfp("-2.5");

        // RINT (ROUND_HALF_EVEN)
        Assert.assertEquals(factory20.newDfp(2), valPos.rint());
        Assert.assertEquals(factory20.newDfp(4), valPosHalfOdd.rint());

        // FLOOR
        Assert.assertEquals(factory20.newDfp(2), valPos.floor());
        Assert.assertEquals(factory20.newDfp(-3), valNeg.floor());

        // CEIL
        Assert.assertEquals(factory20.newDfp(3), valPos.ceil());
        Assert.assertEquals(factory20.newDfp(-2), valNeg.ceil());

        // Truncation when exp < 0
        Dfp small = factory20.newDfp("0.000123");
        Assert.assertTrue(small.rint().isZero());

        // Remainder
        Dfp rem = factory20.newDfp("5.5").remainder(factory20.newDfp("2"));
        Assert.assertEquals(factory20.newDfp("-0.5"), rem);
    }

    // ==========================================
    // 4. Predicates, Comparisons & HashCode
    // ==========================================

    @Test
    public void testPredicatesAndComparisons() {
        Dfp pos = factory20.newDfp(10);
        Dfp neg = factory20.newDfp(-10);
        Dfp zero = factory20.getZero();
        Dfp nan = factory20.newDfp((byte) 1, Dfp.QNAN);

        Assert.assertTrue(pos.strictlyPositive());
        Assert.assertTrue(pos.positiveOrNull());
        Assert.assertFalse(pos.strictlyNegative());

        Assert.assertTrue(neg.strictlyNegative());
        Assert.assertTrue(neg.negativeOrNull());
        Assert.assertFalse(neg.strictlyPositive());

        Assert.assertTrue(zero.positiveOrNull());
        Assert.assertTrue(zero.negativeOrNull());
        Assert.assertFalse(zero.strictlyPositive());
        Assert.assertFalse(zero.strictlyNegative());

        // Comparisons with NaN
        factory20.clearIEEEFlags();
        Assert.assertFalse(pos.lessThan(nan));
        Assert.assertTrue((factory20.getIEEEFlags() & DfpField.FLAG_INVALID) != 0);

        Assert.assertTrue(neg.lessThan(pos));
        Assert.assertTrue(pos.greaterThan(neg));
        Assert.assertTrue(pos.unequal(neg));

        // Equals and HashCode
        Dfp copyPos = pos.newInstance(pos);
        Assert.assertEquals(pos, copyPos);
        Assert.assertEquals(pos.hashCode(), copyPos.hashCode());
        Assert.assertNotEquals(pos, neg);
        Assert.assertNotEquals(pos, new Object());
    }

    // ==========================================
    // 5. Conversions & Transformations
    // ==========================================

    @Test
    public void testConversions() {
        Dfp d = factory20.newDfp("12345.67");
        Assert.assertEquals(12345, d.intValue());

        Dfp maxInt = factory20.newDfp("999999999999");
        Assert.assertEquals(Integer.MAX_VALUE, maxInt.intValue());

        Dfp minInt = factory20.newDfp("-999999999999");
        Assert.assertEquals(Integer.MIN_VALUE, minInt.intValue());

        // toDouble edge cases
        Assert.assertEquals(Double.POSITIVE_INFINITY, factory20.newDfp((byte) 1, Dfp.INFINITE).toDouble(), 0.0);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, factory20.newDfp((byte) -1, Dfp.INFINITE).toDouble(), 0.0);
        Assert.assertTrue(Double.isNaN(factory20.newDfp((byte) 1, Dfp.QNAN).toDouble()));
        Assert.assertEquals(0.0, factory20.getZero().toDouble(), 0.0);
        Assert.assertEquals(123.456, factory20.newDfp("123.456").toDouble(), 1e-10);

        // toSplitDouble
        double[] split = factory20.newDfp("123.4567890123456789").toSplitDouble();
        Assert.assertEquals(123.4567890123456789, split[0] + split[1], 1e-15);

        // copysign
        Dfp c1 = Dfp.copysign(factory20.newDfp(10), factory20.newDfp(-1));
        Assert.assertEquals(-1, c1.sign);
        Assert.assertEquals(factory20.newDfp(-10), c1);
    }

    @Test
    public void testNextAfter() {
        Dfp zero = factory20.getZero();
        Dfp one = factory20.getOne();

        Dfp nextFromZero = zero.nextAfter(one);
        Assert.assertTrue(nextFromZero.strictlyPositive());

        Dfp nextDown = one.nextAfter(zero);
        Assert.assertTrue(nextDown.lessThan(one));

        // Precision mismatch
        factory20.clearIEEEFlags();
        Dfp res = one.nextAfter(factory10.getOne());
        Assert.assertTrue(res.isNaN());
        Assert.assertTrue((factory20.getIEEEFlags() & DfpField.FLAG_INVALID) != 0);
    }

    @Test
    public void testLogAndPowerMethods() {
        Dfp d = factory20.newDfp("10000");
        Assert.assertEquals(1, d.log10K());
        Assert.assertEquals(4, d.log10());

        Dfp pow10K = d.power10K(2);
        Assert.assertEquals(factory20.newDfp("100000000"), pow10K);

        Dfp pow10 = d.power10(3);
        Assert.assertEquals(factory20.newDfp("1000"), pow10);
    }
}