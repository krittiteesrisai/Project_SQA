package org.apache.commons.math.dfp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DfpTest {

    private DfpField factory20;
    private DfpField factory10;

    @Before
    public void setUp() {
        // Field มาตรฐาน 20 digits (base 10000)
        factory20 = new DfpField(20);
        factory10 = new DfpField(10);
    }

    // --- Constructor & Parsing Tests ---

    @Test
    public void testLongConstructorSpecialCases() {
        Dfp minLong = factory20.newDfp(Long.MIN_VALUE);
        assertEquals("-9223372036854775808", minLong.toString());

        Dfp zeroLong = factory20.newDfp(0L);
        assertEquals("0.", zeroLong.toString());

        Dfp posLong = factory20.newDfp(12345678901234L);
        assertTrue(posLong.greaterThan(factory20.getZero()));

        Dfp negLong = factory20.newDfp(-42L);
        assertEquals((byte) -1, negLong.sign);
    }

    @Test
    public void testDoubleConstructorSpecialCases() {
        Dfp zeroDfp = factory20.newDfp(0.0);
        assertTrue(zeroDfp.equals(factory20.getZero()));

        Dfp posInf = factory20.newDfp(Double.POSITIVE_INFINITY);
        assertTrue(posInf.isInfinite());
        assertEquals((byte) 1, posInf.sign);

        Dfp negInf = factory20.newDfp(Double.NEGATIVE_INFINITY);
        assertTrue(negInf.isInfinite());
        assertEquals((byte) -1, negInf.sign);

        Dfp nanDfp = factory20.newDfp(Double.NaN);
        assertTrue(nanDfp.isNaN());

        // Subnormal double
        double subnormal = Double.longBitsToDouble(0x0000000000000001L);
        Dfp subDfp = factory20.newDfp(subnormal);
        assertTrue(subDfp.greaterThan(factory20.getZero()));
    }

    @Test
    public void testStringConstructorSpecialCases() {
        Dfp posInf = factory20.newDfp("Infinity");
        assertTrue(posInf.isInfinite());
        assertEquals((byte) 1, posInf.sign);

        Dfp negInf = factory20.newDfp("-Infinity");
        assertTrue(negInf.isInfinite());
        assertEquals((byte) -1, negInf.sign);

        Dfp nanDfp = factory20.newDfp("NaN");
        assertTrue(nanDfp.isNaN());

        Dfp sci1 = factory20.newDfp("1.2345e-5");
        Dfp sci2 = factory20.newDfp("1.2345E5");
        assertTrue(sci2.greaterThan(sci1));

        Dfp zeros = factory20.newDfp("0.00000");
        assertTrue(zeros.equals(factory20.getZero()));

        Dfp noDecimal = factory20.newDfp("12345");
        assertEquals("12345.", noDecimal.toString());
    }

    // --- toDouble() & Math-54 Tests ---

    @Test
    public void testToDoubleSpecialValues() {
        assertEquals(Double.POSITIVE_INFINITY, factory20.newDfp("Infinity").toDouble(), 0.0);
        assertEquals(Double.NEGATIVE_INFINITY, factory20.newDfp("-Infinity").toDouble(), 0.0);
        assertTrue(Double.isNaN(factory20.newDfp("NaN").toDouble()));
        
        // Zero conversion checks (Defects4J Math-54 bug check)
        Dfp zero = factory20.getZero();
        assertEquals(0.0, zero.toDouble(), 0.0);
        
        Dfp negZero = factory20.getZero().negate();
        double negZeroDouble = negZero.toDouble();
        assertEquals(0.0, negZeroDouble, 0.0);
    }

    @Test
    public void testToDoubleRangeBoundaries() {
        // Exponent overflow (> 1023)
        Dfp huge = factory20.newDfp("1e400");
        assertEquals(Double.POSITIVE_INFINITY, huge.toDouble(), 0.0);
        assertEquals(Double.NEGATIVE_INFINITY, huge.negate().toDouble(), 0.0);

        // Exponent underflow (< -1074)
        Dfp tiny = factory20.newDfp("1e-400");
        assertEquals(0.0, tiny.toDouble(), 0.0);

        // Normal values and split double
        Dfp num = factory20.newDfp("12345.6789");
        double[] split = num.toSplitDouble();
        assertEquals(12345.6789, split[0] + split[1], 1e-10);
    }

    // --- Arithmetic & Precision Trap Tests ---

    @Test
    public void testMismatchedPrecisionTraps() {
        Dfp a = factory20.newDfp("10");
        Dfp b = factory10.newDfp("10");

        Dfp resAdd = a.add(b);
        assertTrue(resAdd.isNaN());

        Dfp resMul = a.multiply(b);
        assertTrue(resMul.isNaN());

        Dfp resDiv = a.divide(b);
        assertTrue(resDiv.isNaN());

        assertFalse(a.equals(b));
        assertFalse(a.lessThan(b));
        assertFalse(a.greaterThan(b));
        assertFalse(a.unequal(b));

        Dfp newInst = a.newInstance(b);
        assertTrue(newInst.isNaN());
    }

    @Test
    public void testAdditionBranches() {
        Dfp zero = factory20.getZero();
        Dfp one = factory20.getOne();
        Dfp nan = factory20.newDfp(Double.NaN);
        Dfp posInf = factory20.newDfp("Infinity");
        Dfp negInf = factory20.newDfp("-Infinity");

        // NaN cases
        assertTrue(one.add(nan).isNaN());
        assertTrue(nan.add(one).isNaN());

        // Infinity cases
        assertEquals(posInf, posInf.add(one));
        assertEquals(posInf, one.add(posInf));
        assertEquals(posInf, posInf.add(posInf));
        assertTrue(posInf.add(negInf).isNaN()); // +Inf + -Inf = NaN

        // Zero addition sign
        Dfp negZero = zero.negate();
        Dfp zeroSum = negZero.add(zero);
        assertEquals(1, zeroSum.sign); // IEEE 854 sign rule
    }

    @Test
    public void testMultiplicationBranches() {
        Dfp zero = factory20.getZero();
        Dfp one = factory20.getOne();
        Dfp posInf = factory20.newDfp("Infinity");

        // Inf * 0 is NaN
        assertTrue(posInf.multiply(zero).isNaN());
        assertTrue(zero.multiply(posInf).isNaN());

        // Inf * finite
        assertEquals(posInf, posInf.multiply(one));

        // Multiply by single digit int
        Dfp num = factory20.newDfp("123");
        assertEquals(factory20.newDfp("246"), num.multiply(2));
        assertTrue(num.multiply(-1).isNaN()); // Invalid digit range
        assertTrue(num.multiply(10000).isNaN()); // Invalid digit >= RADIX
        assertTrue(posInf.multiply(0).isNaN());
    }

    @Test
    public void testDivisionBranches() {
        Dfp zero = factory20.getZero();
        Dfp one = factory20.getOne();
        Dfp posInf = factory20.newDfp("Infinity");

        // Div by zero
        Dfp divZero = one.divide(zero);
        assertTrue(divZero.isInfinite());

        // 0 / 0 = NaN
        assertTrue(zero.divide(zero).isNaN());

        // Inf / Inf = NaN
        assertTrue(posInf.divide(posInf).isNaN());

        // Div by int
        Dfp num = factory20.newDfp("246");
        assertEquals(factory20.newDfp("123"), num.divide(2));
        assertTrue(num.divide(0).isInfinite());
        assertTrue(num.divide(-1).isNaN());
    }

    @Test
    public void testSqrtBranches() {
        Dfp zero = factory20.getZero();
        Dfp posInf = factory20.newDfp("Infinity");
        Dfp negOne = factory20.newDfp("-1");
        Dfp snan = factory20.newDfp((byte) 1, Dfp.SNAN);
        Dfp qnan = factory20.newDfp((byte) 1, Dfp.QNAN);

        assertEquals(zero, zero.sqrt());
        assertEquals(posInf, posInf.sqrt());
        assertTrue(qnan.sqrt().isNaN());
        assertTrue(snan.sqrt().isNaN());
        assertTrue(negOne.sqrt().isNaN()); // sqrt of negative is NaN

        Dfp four = factory20.newDfp("4");
        assertEquals(factory20.newDfp("2"), four.sqrt());
    }

    // --- Rounding, Truncation & Integer Conversion ---

    @Test
    public void testRoundingModes() {
        Dfp val = factory20.newDfp("2.5");
        assertEquals(factory20.newDfp("2."), val.rint()); // HALF_EVEN: 2.5 -> 2
        assertEquals(factory20.newDfp("2."), val.floor());
        assertEquals(factory20.newDfp("3."), val.ceil());

        Dfp negVal = factory20.newDfp("-2.5");
        assertEquals(factory20.newDfp("-3."), negVal.floor());
        assertEquals(factory20.newDfp("-2."), negVal.ceil());

        Dfp smallExp = factory20.newDfp("0.0001");
        assertEquals(factory20.getZero(), smallExp.trunc(DfpField.RoundingMode.ROUND_DOWN));
    }

    @Test
    public void testIntValueBoundaries() {
        Dfp maxInt = factory20.newDfp("3000000000");
        assertEquals(2147483647, maxInt.intValue());

        Dfp minInt = factory20.newDfp("-3000000000");
        assertEquals(-2147483648, minInt.intValue());

        Dfp normal = factory20.newDfp("12345");
        assertEquals(12345, normal.intValue());

        Dfp negNormal = factory20.newDfp("-12345");
        assertEquals(-12345, negNormal.intValue());
    }

    // --- Comparison, Helper & Edge Methods ---

    @Test
    public void testComparisonsAndHashCode() {
        Dfp a = factory20.newDfp("10");
        Dfp b = factory20.newDfp("20");
        Dfp zero1 = factory20.getZero();
        Dfp zero2 = factory20.getZero().negate();

        assertTrue(a.lessThan(b));
        assertTrue(b.greaterThan(a));
        assertTrue(a.unequal(b));
        assertTrue(zero1.equals(zero2)); // +0 == -0

        assertEquals(a.hashCode(), factory20.newDfp("10").hashCode());
        assertFalse(a.equals("Not a Dfp"));
    }

    @Test
    public void testNextAfter() {
        Dfp one = factory20.getOne();
        Dfp two = factory20.getTwo();
        Dfp zero = factory20.getZero();

        Dfp nextUp = one.nextAfter(two);
        assertTrue(nextUp.greaterThan(one));

        Dfp nextDown = one.nextAfter(zero);
        assertTrue(nextDown.lessThan(one));

        assertEquals(one, one.nextAfter(one));
    }

    @Test
    public void testPowerAndLogarithms() {
        Dfp num = factory20.newDfp("10000");
        assertEquals(1, num.log10K());
        assertEquals(4, num.log10());

        Dfp pow10K = num.power10K(2);
        assertEquals(factory20.newDfp("100000000"), pow10K);

        Dfp pow10 = num.power10(3);
        assertEquals(factory20.newDfp("1000"), pow10);
        
        Dfp pow10Neg = num.power10(-1);
        assertEquals(factory20.newDfp("0.1"), pow10Neg);
    }

    @Test
    public void testMiscellaneousBranches() {
        Dfp pos = factory20.newDfp("5");
        Dfp neg = factory20.newDfp("-5");

        assertEquals((byte) -1, Dfp.copysign(pos, neg).sign);
        assertEquals((byte) 1, Dfp.copysign(neg, pos).sign);

        Dfp rem = factory20.newDfp("7").remainder(factory20.newDfp("3"));
        assertEquals(factory20.newDfp("1"), rem);

        // Scientific string output
        Dfp sciVal = factory20.newDfp("1.2345e50");
        assertTrue(sciVal.toString().contains("e"));
    }
}