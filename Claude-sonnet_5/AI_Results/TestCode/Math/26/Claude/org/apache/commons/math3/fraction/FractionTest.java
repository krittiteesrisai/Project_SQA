package org.apache.commons.math3.fraction;

import static org.junit.Assert.*;
import org.junit.Test;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NullArgumentException;

public class FractionTest {

    // ---------- Helper ----------
    private void assertFraction(int expectedNumerator, int expectedDenominator, Fraction actual) {
        assertEquals("numerator", expectedNumerator, actual.getNumerator());
        assertEquals("denominator", expectedDenominator, actual.getDenominator());
    }

    // =========================================================
    // Constructor Fraction(int num, int den)
    // =========================================================

    @Test
    public void testConstructorIntInt_ReduceGcd() {
        // d = gcd(2,4) = 2 > 1  -> branch "reduce"
        assertFraction(1, 2, new Fraction(2, 4));
    }

    @Test
    public void testConstructorIntInt_NoReduceNeeded() {
        // d = gcd(3,5) = 1 -> branch "no reduce"
        assertFraction(3, 5, new Fraction(3, 5));
    }

    @Test
    public void testConstructorIntInt_NegativeDenominator() {
        // den < 0, num/den != MIN_VALUE -> sign flip branch
        assertFraction(-3, 4, new Fraction(3, -4));
    }

    @Test
    public void testConstructorIntInt_ZeroDenominatorThrows() {
        try {
            new Fraction(1, 0);
            fail("Expected MathArithmeticException");
        } catch (MathArithmeticException e) {
            // expected: ZERO_DENOMINATOR_IN_FRACTION
        }
    }

    @Test
    public void testConstructorIntInt_OverflowNumeratorMinValueThrows() {
        // den < 0 && num == Integer.MIN_VALUE -> overflow branch
        try {
            new Fraction(Integer.MIN_VALUE, -1);
            fail("Expected MathArithmeticException");
        } catch (MathArithmeticException e) {
            // expected: OVERFLOW_IN_FRACTION
        }
    }

    @Test
    public void testConstructorIntInt_OverflowDenominatorMinValueThrows() {
        // den < 0 && den == Integer.MIN_VALUE -> overflow branch
        try {
            new Fraction(5, Integer.MIN_VALUE);
            fail("Expected MathArithmeticException");
        } catch (MathArithmeticException e) {
            // expected: OVERFLOW_IN_FRACTION
        }
    }

    @Test
    public void testConstructorInt() {
        // Fraction(int) delegates to Fraction(num,1)
        assertFraction(5, 1, new Fraction(5));
    }

    // =========================================================
    // Constructor Fraction(double) / (double,eps,iter) / (double,maxDen)
    // =========================================================

    @Test
    public void testDoubleConstructor_ImmediateIntegerReturn() {
        // abs(a0 - value) < epsilon -> early return branch
        assertFraction(2, 1, new Fraction(2.0));
        assertFraction(-3, 1, new Fraction(-3.0));
    }

    @Test
    public void testDoubleConstructor_NormalConvergence() {
        // Known convergent continued-fraction results (loop runs, exits via
        // abs(convergent-value) <= epsilon)
        assertFraction(1, 2, new Fraction(0.5));
        assertFraction(1, 3, new Fraction(1.0 / 3.0));
        assertFraction(-1, 2, new Fraction(-0.5));
        assertFraction(17, 100, new Fraction(17.0 / 100.0));
    }

    @Test
    public void testDoubleConstructorMaxDenominator_Converged() {
        // Manually traced: value=1.6, maxDenominator=10, epsilon=0
        // loop stops because convergent == value exactly (8/5), q2(5) < 10
        // -> branch "q2 < maxDenominator" TRUE after loop
        assertFraction(8, 5, new Fraction(1.6, 10));
    }

    @Test
    public void testDoubleConstructorMaxDenominator_Fallback() {
        // Manually traced: value=1.6, maxDenominator=3, epsilon=0
        // loop stops because q2(5) >= maxDenominator(3) at n=3
        // after loop: q2(5) < maxDenominator(3) is FALSE -> fallback to p1/q1
        assertFraction(3, 2, new Fraction(1.6, 3));
    }

    @Test
    public void testDoubleConstructor_A0OverflowThrows() {
        // a0 = floor(value) > Integer.MAX_VALUE -> immediate overflow branch
        try {
            new Fraction(1.0e10);
            fail("Expected FractionConversionException");
        } catch (FractionConversionException e) {
            // expected
        }
        try {
            new Fraction(-1.0e10);
            fail("Expected FractionConversionException");
        } catch (FractionConversionException e) {
            // expected
        }
    }

    @Test
    public void testDoubleConstructor_MidLoopOverflowThrows() {
        // Known value that causes p2/q2 to exceed Integer.MAX_VALUE
        // during the convergence loop before converging within epsilon.
        try {
            new Fraction(0.75000000001455192, 1.0e-12, 1000);
            fail("Expected FractionConversionException");
        } catch (FractionConversionException e) {
            // expected
        }
    }

    @Test
    public void testDoubleConstructor_MaxIterationsExceededThrows() {
        // Manually traced with value=PI, epsilon=1e-20, maxIterations=2:
        // loop condition "n < maxIterations" becomes false at n=2 before
        // epsilon convergence is reached -> after loop n(2) >= maxIterations(2)
        try {
            new Fraction(Math.PI, 1.0e-20, 2);
            fail("Expected FractionConversionException");
        } catch (FractionConversionException e) {
            // expected
        }
    }

    // =========================================================
    // abs() / negate() / reciprocal()
    // =========================================================

    @Test
    public void testAbs_PositiveNumeratorReturnsSameInstance() {
        Fraction f = new Fraction(3, 4);
        assertSame(f, f.abs()); // numerator >= 0 branch
    }

    @Test
    public void testAbs_NegativeNumeratorReturnsNegated() {
        Fraction f = new Fraction(-3, 4);
        assertFraction(3, 4, f.abs()); // numerator < 0 -> negate() branch
    }

    @Test
    public void testNegate_Normal() {
        assertFraction(-3, 4, new Fraction(3, 4).negate());
    }

    @Test
    public void testNegate_OverflowThrows() {
        // numerator == Integer.MIN_VALUE -> overflow branch
        try {
            new Fraction(Integer.MIN_VALUE, 1).negate();
            fail("Expected MathArithmeticException");
        } catch (MathArithmeticException e) {
            // expected
        }
    }

    @Test
    public void testReciprocal_Normal() {
        assertFraction(4, 3, new Fraction(3, 4).reciprocal());
    }

    @Test
    public void testReciprocal_NegativeSignNormalization() {
        // reciprocal of -3/4 -> new Fraction(4,-3) -> sign flip inside ctor
        assertFraction(-4, 3, new Fraction(-3, 4).reciprocal());
    }

    // =========================================================
    // compareTo()
    // =========================================================

    @Test
    public void testCompareTo_Greater() {
        assertEquals(1, new Fraction(1, 2).compareTo(new Fraction(1, 3)));
    }

    @Test
    public void testCompareTo_Less() {
        assertEquals(-1, new Fraction(1, 3).compareTo(new Fraction(1, 2)));
    }

    @Test
    public void testCompareTo_Equal() {
        assertEquals(0, new Fraction(1, 2).compareTo(new Fraction(2, 4)));
    }

    // =========================================================
    // numeric conversions
    // =========================================================

    @Test
    public void testDoubleValue() {
        assertEquals(3.5, new Fraction(7, 2).doubleValue(), 0.0);
    }

    @Test
    public void testFloatValue() {
        assertEquals(3.5f, new Fraction(7, 2).floatValue(), 0.0f);
    }

    @Test
    public void testIntValueAndLongValue_Positive() {
        Fraction f = new Fraction(7, 2); // 3.5
        assertEquals(3, f.intValue());
        assertEquals(3L, f.longValue());
    }

    @Test
    public void testIntValueAndLongValue_Negative() {
        Fraction f = new Fraction(-7, 2); // -3.5
        assertEquals(-3, f.intValue());
        assertEquals(-3L, f.longValue());
    }

    @Test
    public void testPercentageValue() {
        assertEquals(25.0, new Fraction(1, 4).percentageValue(), 0.0);
    }

    // =========================================================
    // equals() / hashCode()
    // =========================================================

    @Test
    public void testEquals_SameReference() {
        Fraction f = Fraction.ONE;
        assertTrue(f.equals(f));
    }

    @Test
    public void testEquals_EqualValueDifferentInstance() {
        assertTrue(new Fraction(1, 2).equals(new Fraction(2, 4)));
    }

    @Test
    public void testEquals_DifferentValue() {
        assertFalse(new Fraction(1, 2).equals(new Fraction(1, 3)));
    }

    @Test
    public void testEquals_Null() {
        assertFalse(new Fraction(1, 2).equals(null));
    }

    @Test
    public void testEquals_NonFractionType() {
        assertFalse(new Fraction(1, 2).equals("1/2"));
    }

    @Test
    public void testHashCode_EqualFractionsHaveEqualHashCode() {
        assertEquals(new Fraction(1, 2).hashCode(), new Fraction(2, 4).hashCode());
    }

    // =========================================================
    // getters
    // =========================================================

    @Test
    public void testGetNumeratorDenominator() {
        Fraction f = new Fraction(3, 7);
        assertEquals(3, f.getNumerator());
        assertEquals(7, f.getDenominator());
    }

    // =========================================================
    // add()
    // =========================================================

    @Test
    public void testAdd_NullThrows() {
        try {
            new Fraction(1, 2).add((Fraction) null);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
            // expected
        }
    }

    @Test
    public void testAdd_ThisNumeratorZero_ReturnsOtherDirectly() {
        Fraction other = new Fraction(3, 4);
        assertSame(other, Fraction.ZERO.add(other));
    }

    @Test
    public void testAdd_OtherNumeratorZero_ReturnsThisDirectly() {
        Fraction self = new Fraction(3, 4);
        assertSame(self, self.add(Fraction.ZERO));
    }

    @Test
    public void testAdd_D1EqualsOneBranch() {
        // gcd(2,3) = 1
        assertFraction(5, 6, new Fraction(1, 2).add(new Fraction(1, 3)));
    }

    @Test
    public void testAdd_D1NotOneBigIntegerBranch() {
        // gcd(4,6) = 2 -> BigInteger path
        assertFraction(5, 12, new Fraction(1, 4).add(new Fraction(1, 6)));
    }

    @Test
    public void testAdd_OverflowInD1EqualsOneBranchThrows() {
        try {
            new Fraction(Integer.MAX_VALUE, 1).add(Fraction.ONE);
            fail("Expected MathArithmeticException");
        } catch (MathArithmeticException e) {
            // expected (addAndCheck overflow)
        }
    }

    @Test
    public void testAddInt() {
        assertFraction(7, 2, new Fraction(1, 2).add(3));
    }

    // =========================================================
    // subtract()
    // =========================================================

    @Test
    public void testSubtract_NullThrows() {
        try {
            new Fraction(1, 2).subtract((Fraction) null);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSubtract_ThisNumeratorZero_ReturnsNegatedOther() {
        Fraction other = new Fraction(3, 4);
        assertFraction(-3, 4, Fraction.ZERO.subtract(other));
    }

    @Test
    public void testSubtract_OtherNumeratorZero_ReturnsThisDirectly() {
        Fraction self = new Fraction(3, 4);
        assertSame(self, self.subtract(Fraction.ZERO));
    }

    @Test
    public void testSubtract_D1NotOneBigIntegerBranch() {
        assertFraction(1, 12, new Fraction(1, 4).subtract(new Fraction(1, 6)));
    }

    @Test
    public void testSubtractInt() {
        assertFraction(-5, 2, new Fraction(1, 2).subtract(3));
    }

    // =========================================================
    // multiply()
    // =========================================================

    @Test
    public void testMultiply_NullThrows() {
        try {
            new Fraction(1, 2).multiply((Fraction) null);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
            // expected
        }
    }

    @Test
    public void testMultiply_ThisNumeratorZero_ReturnsZero() {
        assertEquals(Fraction.ZERO, Fraction.ZERO.multiply(new Fraction(5, 7)));
    }

    @Test
    public void testMultiply_OtherNumeratorZero_ReturnsZero() {
        assertEquals(Fraction.ZERO, new Fraction(5, 7).multiply(Fraction.ZERO));
    }

    @Test
    public void testMultiply_Normal() {
        assertFraction(1, 2, new Fraction(2, 3).multiply(new Fraction(3, 4)));
    }

    @Test
    public void testMultiplyInt() {
        assertFraction(3, 2, new Fraction(1, 2).multiply(3));
    }

    // =========================================================
    // divide()
    // =========================================================

    @Test
    public void testDivide_NullThrows() {
        try {
            new Fraction(1, 2).divide((Fraction) null);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
            // expected
        }
    }

    @Test
    public void testDivide_ByZeroFractionThrows() {
        try {
            new Fraction(1, 2).divide(Fraction.ZERO);
            fail("Expected MathArithmeticException");
        } catch (MathArithmeticException e) {
            // expected: ZERO_FRACTION_TO_DIVIDE_BY
        }
    }

    @Test
    public void testDivide_Normal() {
        assertFraction(2, 3, new Fraction(1, 2).divide(new Fraction(3, 4)));
    }

    @Test
    public void testDivideInt() {
        assertFraction(1, 4, new Fraction(1, 2).divide(2));
    }

    // =========================================================
    // getReducedFraction()
    // =========================================================

    @Test
    public void testGetReducedFraction_ZeroDenominatorThrows() {
        try {
            Fraction.getReducedFraction(1, 0);
            fail("Expected MathArithmeticException");
        } catch (MathArithmeticException e) {
            // expected
        }
    }

    @Test
    public void testGetReducedFraction_ZeroNumeratorReturnsZero() {
        assertEquals(Fraction.ZERO, Fraction.getReducedFraction(0, 5));
    }

    @Test
    public void testGetReducedFraction_DenominatorMinValueEvenNumerator_Halved() {
        // numerator even -> halving branch, then negative-denominator sign flip
        // Manually traced: (2, MIN_VALUE) -> (1, MIN_VALUE/2) -> sign flip -> (-1, 1073741824)
        assertFraction(-1, 1073741824, Fraction.getReducedFraction(2, Integer.MIN_VALUE));
    }

    @Test
    public void testGetReducedFraction_NegativeDenominatorNormal() {
        assertFraction(-3, 4, Fraction.getReducedFraction(3, -4));
    }

    @Test
    public void testGetReducedFraction_OverflowNumeratorMinValueThrows() {
        try {
            Fraction.getReducedFraction(Integer.MIN_VALUE, -5);
            fail("Expected MathArithmeticException");
        } catch (MathArithmeticException e) {
            // expected
        }
    }

    @Test
    public void testGetReducedFraction_OverflowDenominatorMinValueOddNumeratorThrows() {
        // numerator odd -> skip halving branch -> falls into denominator<0 overflow check
        try {
            Fraction.getReducedFraction(3, Integer.MIN_VALUE);
            fail("Expected MathArithmeticException");
        } catch (MathArithmeticException e) {
            // expected
        }
    }

    // =========================================================
    // toString()
    // =========================================================

    @Test
    public void testToString_DenominatorOne() {
        assertEquals("5", new Fraction(5, 1).toString());
    }

    @Test
    public void testToString_Normal() {
        assertEquals("3 / 4", new Fraction(3, 4).toString());
    }

    @Test
    public void testToString_ZeroViaDenominatorOneBranch() {
        // NOTE: branch "numerator == 0 && denominator != 1" in toString() appears
        // unreachable via the public API, because getReducedFraction()/constructor
        // always reduce denominator to 1 when numerator is 0 (gcd(0,den)=den).
        // We can only verify ZERO.toString() == "0" via the denominator==1 branch.
        assertEquals("0", Fraction.ZERO.toString());
    }

    // =========================================================
    // getField()
    // =========================================================

    @Test
    public void testGetField() {
        Fraction f = new Fraction(1, 2);
        assertNotNull(f.getField());
        assertEquals(FractionField.getInstance(), f.getField());
    }
}
