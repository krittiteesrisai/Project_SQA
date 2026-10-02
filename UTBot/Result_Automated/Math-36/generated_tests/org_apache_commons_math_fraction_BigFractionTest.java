package org.apache.commons.math.fraction;

import org.junit.Test;
import java.math.BigInteger;
import java.math.BigDecimal;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.exception.NotPositiveException;
import org.apache.commons.math.exception.ZeroException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_math_fraction_BigFractionTest {
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.getNumerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNumerator()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#getNumerator()}
 * @utbot.returnsFrom {@code return numerator;}
 *  */
    @Test
    public void testGetNumerator_ReturnNumerator() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        BigInteger actual = bigFraction.getNumerator();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.getReducedFraction
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getReducedFraction(int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#getReducedFraction(int,int)}
     */
    @Test
    public void testGetReducedFractionWithCornerCase() throws Exception  {
        BigFraction actual = BigFraction.getReducedFraction(0, 2);
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.getDenominator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDenominator()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#getDenominator()}
 * @utbot.returnsFrom {@code return denominator;}
 *  */
    @Test
    public void testGetDenominator_ReturnDenominator() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        BigInteger actual = bigFraction.getDenominator();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.getNumeratorAsInt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNumeratorAsInt()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#getNumeratorAsInt()}
 * @utbot.invokes {@link java.math.BigInteger#intValue()}
 * @utbot.returnsFrom {@code return numerator.intValue();}
 *  */
    @Test
    public void testGetNumeratorAsInt_BigIntegerIntValue() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {-255};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        
        int actual = bigFraction.getNumeratorAsInt();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNumeratorAsInt()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#getNumeratorAsInt()}
 * @utbot.invokes {@link java.math.BigInteger#intValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return numerator.intValue();
 *  */
    @Test
    public void testGetNumeratorAsInt_ThrowNullPointerException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.getNumeratorAsInt] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.getNumeratorAsInt(BigFraction.java:790) */
        bigFraction.getNumeratorAsInt();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.getNumeratorAsLong
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNumeratorAsLong()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#getNumeratorAsLong()}
 * @utbot.invokes {@link java.math.BigInteger#longValue()}
 * @utbot.returnsFrom {@code return numerator.longValue();}
 *  */
    @Test
    public void testGetNumeratorAsLong_BigIntegerLongValue() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", -1);
        int[] mag = {-255};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(numerator, "java.math.BigInteger", "firstNonzeroIntNumPlusTwo", 1);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        
        long actual = bigFraction.getNumeratorAsLong();
        
        assertEquals(-4294967042L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNumeratorAsLong()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#getNumeratorAsLong()}
 * @utbot.invokes {@link java.math.BigInteger#longValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return numerator.longValue();
 *  */
    @Test
    public void testGetNumeratorAsLong_ThrowNullPointerException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.getNumeratorAsLong] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.getNumeratorAsLong(BigFraction.java:801) */
        bigFraction.getNumeratorAsLong();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.bigDecimalValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method bigDecimalValue(int, int)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#bigDecimalValue(int,int)}
 * @utbot.invokes {@link java.math.BigDecimal#divide(java.math.BigDecimal,int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new BigDecimal(numerator).divide(new BigDecimal(denominator), scale, roundingMode);
 *  */
    @Test
    public void testBigDecimalValue_ThrowIllegalArgumentException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {0, -255};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag1 = {-1, -255};
        setField(denominator, "java.math.BigInteger", "mag", mag1);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.bigDecimalValue] produces [java.lang.IllegalArgumentException: Invalid rounding mode]
            java.base/java.math.BigDecimal.divide(BigDecimal.java:1647)
            org.apache.commons.math.fraction.BigFraction.bigDecimalValue(BigFraction.java:579) */
        bigFraction.bigDecimalValue(-255, 9);
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#bigDecimalValue(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new BigDecimal(numerator).divide(new BigDecimal(denominator), scale, roundingMode);
 *  */
    @Test
    public void testBigDecimalValue_ThrowNullPointerException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.bigDecimalValue] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.toStrictBigInteger(BigDecimal.java:1069)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:1083)
            org.apache.commons.math.fraction.BigFraction.bigDecimalValue(BigFraction.java:579) */
        bigFraction.bigDecimalValue(-255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#bigDecimalValue(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new BigDecimal(numerator).divide(new BigDecimal(denominator), scale, roundingMode);
 *  */
    @Test
    public void testBigDecimalValue_ThrowNullPointerException_1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.bigDecimalValue] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.toStrictBigInteger(BigDecimal.java:1069)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:1083)
            org.apache.commons.math.fraction.BigFraction.bigDecimalValue(BigFraction.java:579) */
        bigFraction.bigDecimalValue(-255, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.bigDecimalValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method bigDecimalValue(int)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#bigDecimalValue(int)}
 * @utbot.invokes {@link java.math.BigDecimal#divide(java.math.BigDecimal,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new BigDecimal(numerator).divide(new BigDecimal(denominator), roundingMode);
 *  */
    @Test
    public void testBigDecimalValue_ThrowIllegalArgumentException1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {0, -255};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag1 = {-255, -255, -255};
        setField(denominator, "java.math.BigInteger", "mag", mag1);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.bigDecimalValue] produces [java.lang.IllegalArgumentException: Invalid rounding mode]
            java.base/java.math.BigDecimal.divide(BigDecimal.java:1647)
            java.base/java.math.BigDecimal.divide(BigDecimal.java:1712)
            org.apache.commons.math.fraction.BigFraction.bigDecimalValue(BigFraction.java:560) */
        bigFraction.bigDecimalValue(9);
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#bigDecimalValue(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new BigDecimal(numerator).divide(new BigDecimal(denominator), roundingMode);
 *  */
    @Test
    public void testBigDecimalValue_ThrowNullPointerException1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.bigDecimalValue] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.toStrictBigInteger(BigDecimal.java:1069)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:1083)
            org.apache.commons.math.fraction.BigFraction.bigDecimalValue(BigFraction.java:560) */
        bigFraction.bigDecimalValue(-255);
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#bigDecimalValue(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new BigDecimal(numerator).divide(new BigDecimal(denominator), roundingMode);
 *  */
    @Test
    public void testBigDecimalValue_ThrowNullPointerException_11() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {-255, -255, -255};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.bigDecimalValue] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.toStrictBigInteger(BigDecimal.java:1069)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:1083)
            org.apache.commons.math.fraction.BigFraction.bigDecimalValue(BigFraction.java:560) */
        bigFraction.bigDecimalValue(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.bigDecimalValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method bigDecimalValue()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#bigDecimalValue()}
 * @utbot.invokes {@link java.math.BigDecimal#divide(java.math.BigDecimal)}
 * @utbot.returnsFrom {@code return new BigDecimal(numerator).divide(new BigDecimal(denominator));}
 *  */
    @Test
    public void testBigDecimalValue_BigDecimalDivide() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", 1);
        int[] mag1 = {-1, -255};
        setField(denominator, "java.math.BigInteger", "mag", mag1);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        BigDecimal actual = bigFraction.bigDecimalValue();
        
        BigDecimal expected = new BigDecimal(0);
        
        // java.math.BigDecimal has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method bigDecimalValue()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#bigDecimalValue()}
 * @utbot.invokes {@link java.math.BigDecimal#divide(java.math.BigDecimal)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return new BigDecimal(numerator).divide(new BigDecimal(denominator));
 *  */
    @Test
    public void testBigDecimalValue_ThrowArithmeticException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag1 = {-255, -255, -255};
        setField(denominator, "java.math.BigInteger", "mag", mag1);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.bigDecimalValue] produces [java.lang.ArithmeticException: Division undefined]
            java.base/java.math.BigDecimal.divide(BigDecimal.java:1754)
            org.apache.commons.math.fraction.BigFraction.bigDecimalValue(BigFraction.java:541) */
        bigFraction.bigDecimalValue();
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#bigDecimalValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new BigDecimal(numerator).divide(new BigDecimal(denominator));
 *  */
    @Test
    public void testBigDecimalValue_ThrowNullPointerException2() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.bigDecimalValue] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.toStrictBigInteger(BigDecimal.java:1069)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:1083)
            org.apache.commons.math.fraction.BigFraction.bigDecimalValue(BigFraction.java:541) */
        bigFraction.bigDecimalValue();
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#bigDecimalValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new BigDecimal(numerator).divide(new BigDecimal(denominator));
 *  */
    @Test
    public void testBigDecimalValue_ThrowNullPointerException_12() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", -1);
        int[] mag = {-3};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.bigDecimalValue] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.toStrictBigInteger(BigDecimal.java:1069)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:1083)
            org.apache.commons.math.fraction.BigFraction.bigDecimalValue(BigFraction.java:541) */
        bigFraction.bigDecimalValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.percentageValue
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method percentageValue()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#percentageValue()}
     */
    @Test
    public void testPercentageValue() {
        BigFraction bigFraction = new BigFraction(16385);
        
        double actual = bigFraction.percentageValue();
        
        org.junit.Assert.assertEquals(1638500.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.reciprocal
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method reciprocal()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#reciprocal()}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} in: return new BigFraction(denominator, numerator);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testReciprocal_ThrowNullArgumentException_1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        bigFraction.reciprocal();
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#reciprocal()}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} in: return new BigFraction(denominator, numerator);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testReciprocal_ThrowNullArgumentException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        bigFraction.reciprocal();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method reciprocal()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#reciprocal()}
     */
    @Test
    public void testReciprocal() throws Exception  {
        BigFraction bigFraction = new BigFraction(16385);
        
        BigFraction actual = bigFraction.reciprocal();
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.getDenominatorAsInt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDenominatorAsInt()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#getDenominatorAsInt()}
 * @utbot.invokes {@link java.math.BigInteger#intValue()}
 * @utbot.returnsFrom {@code return denominator.intValue();}
 *  */
    @Test
    public void testGetDenominatorAsInt_BigIntegerIntValue() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {-255};
        setField(denominator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        int actual = bigFraction.getDenominatorAsInt();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDenominatorAsInt()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#getDenominatorAsInt()}
 * @utbot.invokes {@link java.math.BigInteger#intValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return denominator.intValue();
 *  */
    @Test
    public void testGetDenominatorAsInt_ThrowNullPointerException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.getDenominatorAsInt] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.getDenominatorAsInt(BigFraction.java:757) */
        bigFraction.getDenominatorAsInt();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.getDenominatorAsLong
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDenominatorAsLong()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#getDenominatorAsLong()}
 * @utbot.invokes {@link java.math.BigInteger#longValue()}
 * @utbot.returnsFrom {@code return denominator.longValue();}
 *  */
    @Test
    public void testGetDenominatorAsLong_BigIntegerLongValue() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", -1);
        int[] mag = {-255};
        setField(denominator, "java.math.BigInteger", "mag", mag);
        setField(denominator, "java.math.BigInteger", "firstNonzeroIntNumPlusTwo", 1);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        long actual = bigFraction.getDenominatorAsLong();
        
        assertEquals(-4294967042L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDenominatorAsLong()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#getDenominatorAsLong()}
 * @utbot.invokes {@link java.math.BigInteger#longValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return denominator.longValue();
 *  */
    @Test
    public void testGetDenominatorAsLong_ThrowNullPointerException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.getDenominatorAsLong] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.getDenominatorAsLong(BigFraction.java:768) */
        bigFraction.getDenominatorAsLong();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.add
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(long)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#add(long)}
 * @utbot.invokes {@link org.apache.commons.math.fraction.BigFraction#add(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return add(BigInteger.valueOf(l));
 *  */
    @Test
    public void testAdd_ThrowNullPointerException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.add] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.add(BigFraction.java:464)
            org.apache.commons.math.fraction.BigFraction.add(BigFraction.java:492) */
        bigFraction.add(-16L);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method add(long)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#add(long)}
     */
    @Test
    public void testAdd() throws Exception  {
        BigFraction bigFraction = new BigFraction(1);
        
        BigFraction actual = bigFraction.add(-9L);
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.add
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(int)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#add(int)}
 * @utbot.invokes {@link org.apache.commons.math.fraction.BigFraction#add(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return add(BigInteger.valueOf(i));
 *  */
    @Test
    public void testAdd_ThrowNullPointerException1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.add] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.add(BigFraction.java:464)
            org.apache.commons.math.fraction.BigFraction.add(BigFraction.java:478) */
        bigFraction.add(-16);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method add(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#add(int)}
     */
    @Test
    public void testAdd1() throws Exception  {
        BigFraction bigFraction = new BigFraction(1);
        
        BigFraction actual = bigFraction.add(-3);
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.add
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(java.math.BigInteger)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#add(java.math.BigInteger)}
 * @utbot.invokes {@link java.math.BigInteger#multiply(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new BigFraction(numerator.add(denominator.multiply(bg)), denominator);
 *  */
    @Test
    public void testAdd_ThrowNullPointerException_1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", 1);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.add] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.add(BigFraction.java:464) */
        bigFraction.add(bigInteger);
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#add(java.math.BigInteger)}
 * @utbot.invokes {@link java.math.BigInteger#multiply(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new BigFraction(numerator.add(denominator.multiply(bg)), denominator);
 *  */
    @Test
    public void testAdd_ThrowNullPointerException2() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.add] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.add(BigFraction.java:464) */
        bigFraction.add(bigInteger);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(java.math.BigInteger)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#add(java.math.BigInteger)}
 * @utbot.invokes {@link org.apache.commons.math.util.MathUtils#checkNotNull(java.lang.Object)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} in: MathUtils.checkNotNull(bg);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testAdd_ThrowNullArgumentException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        bigFraction.add(((BigInteger) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.add
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(org.apache.commons.math.fraction.BigFraction)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#add(org.apache.commons.math.fraction.BigFraction)}
 * @utbot.executesCondition {@code (fraction == null): True}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} when: fraction == null
 *  */
    @Test(expected = NullArgumentException.class)
    public void testAdd_ThrowNullArgumentException1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        bigFraction.add(((BigFraction) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testEquals_Other() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        boolean actual = bigFraction.equals(bigFraction);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof BigFraction): False}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testEquals_NotOtherNotInstanceOfBigFraction() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        boolean actual = bigFraction.equals(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof BigFraction): True}
 * @utbot.invokes {@link org.apache.commons.math.fraction.BigFraction#reduce()}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: BigFraction rhs = ((BigFraction) other).reduce();
 *  */
    @Test
    public void testEquals_ThrowArithmeticException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigFraction bigFraction1 = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction1, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        setField(bigFraction1, "org.apache.commons.math.fraction.BigFraction", "denominator", numerator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.equals] produces [java.lang.ArithmeticException: BigInteger divide by zero]
            java.base/java.math.MutableBigInteger.divideKnuth(MutableBigInteger.java:1184)
            java.base/java.math.BigInteger.divideKnuth(BigInteger.java:2318)
            java.base/java.math.BigInteger.divide(BigInteger.java:2299)
            org.apache.commons.math.fraction.BigFraction.reduce(BigFraction.java:1029)
            org.apache.commons.math.fraction.BigFraction.equals(BigFraction.java:713) */
        bigFraction.equals(bigFraction1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#toString()}
 * @utbot.executesCondition {@code (BigInteger.ONE.equals(denominator)): True}
 * @utbot.invokes {@link java.math.BigInteger#equals(java.lang.Object)}
 * @utbot.invokes {@link java.math.BigInteger#toString()}
 *  */
    @Test
    public void testToString_BigIntegerONEEquals() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", -255);
        int[] mag = {};
        setField(denominator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        String actual = bigFraction.toString();
        
        String expected = "null / -";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#toString()}
 * @utbot.executesCondition {@code (BigInteger.ONE.equals(denominator)): False}
 * @utbot.executesCondition {@code (BigInteger.ZERO.equals(numerator)): True}
 * @utbot.invokes {@link java.math.BigInteger#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return str;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return str;
 *  */
    @Test
    public void testToString_ThrowNullPointerException_1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", -1);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", numerator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.toString] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.<init>(BigInteger.java:1138)
            java.base/java.math.BigInteger.negate(BigInteger.java:2683)
            java.base/java.math.BigInteger.abs(BigInteger.java:2674)
            java.base/java.math.BigInteger.toString(BigInteger.java:3967)
            java.base/java.math.BigInteger.toString(BigInteger.java:4156)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            org.apache.commons.math.fraction.BigFraction.toString(BigFraction.java:1123) */
        bigFraction.toString();
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#toString()}
 * @utbot.executesCondition {@code (BigInteger.ONE.equals(denominator)): True}
 * @utbot.invokes {@link java.math.BigInteger#toString()}
 * @utbot.returnsFrom {@code return str;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return str;
 *  */
    @Test
    public void testToString_ThrowNullPointerException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", -255);
        int[] mag = {};
        setField(denominator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.toString] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.equals(BigInteger.java:3895)
            org.apache.commons.math.fraction.BigFraction.toString(BigFraction.java:1120) */
        bigFraction.toString();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#toString()}
     */
    @Test
    public void testToString() {
        BigFraction bigFraction = new BigFraction(16385);
        
        String actual = bigFraction.toString();
        
        String expected = "16385";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#hashCode()}
 * @utbot.invokes {@link java.math.BigInteger#hashCode()}
 * @utbot.invokes {@link java.math.BigInteger#hashCode()}
 * @utbot.returnsFrom {@code return 37 * (37 * 17 + numerator.hashCode()) + denominator.hashCode();}
 *  */
    @Test
    public void testHashCode_BigIntegerHashCode() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", -255);
        int[] mag = {};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", -255);
        int[] mag1 = {};
        setField(denominator, "java.math.BigInteger", "mag", mag1);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        int actual = bigFraction.hashCode();
        
        assertEquals(23273, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hashCode()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#hashCode()}
 * @utbot.invokes {@link java.math.BigInteger#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return 37 * (37 * 17 + numerator.hashCode()) + denominator.hashCode();
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.hashCode(BigFraction.java:814) */
        bigFraction.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#hashCode()}
 * @utbot.invokes {@link java.math.BigInteger#hashCode()}
 * @utbot.invokes {@link java.math.BigInteger#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return 37 * (37 * 17 + numerator.hashCode()) + denominator.hashCode();
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException_1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", -255);
        int[] mag = {};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.hashCode(BigFraction.java:814) */
        bigFraction.hashCode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.abs
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method abs()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#abs()}
 * @utbot.invokes {@link java.math.BigInteger#compareTo(java.math.BigInteger)}
 * @utbot.returnsFrom {@code return (BigInteger.ZERO.compareTo(numerator) <= 0) ? this : negate();}
 *  */
    @Test
    public void testAbs_BigIntegerCompareTo() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", 1);
        int[] mag = {-255};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        
        BigFraction actual = bigFraction.abs();
        
        // org.apache.commons.math.fraction.BigFraction has overridden equals method
        assertEquals(bigFraction, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method abs()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#abs()}
 * @utbot.invokes {@link java.math.BigInteger#compareTo(java.math.BigInteger)}
 * @utbot.returnsFrom {@code return (BigInteger.ZERO.compareTo(numerator) <= 0) ? this : negate();}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} in: return (BigInteger.ZERO.compareTo(numerator) <= 0) ? this : negate();
 *  */
    @Test(expected = NullArgumentException.class)
    public void testAbs_ThrowNullArgumentException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", -1);
        int[] mag = {};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        
        bigFraction.abs();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.pow
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method pow(java.math.BigInteger)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#pow(java.math.BigInteger)}
 * @utbot.invokes {@link java.math.BigInteger#compareTo(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: exponent.compareTo(BigInteger.ZERO) < 0
 *  */
    @Test
    public void testPow_ThrowNullPointerException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.pow] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.pow(BigFraction.java:984) */
        bigFraction.pow(((BigInteger) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method pow(java.math.BigInteger)
    
    @Test
    public void testPow1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        
        BigFraction actual = bigFraction.pow(bigInteger);
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow2() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        
        BigFraction actual = bigFraction.pow(bigInteger);
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method pow(java.math.BigInteger)
    
    @Test
    public void testPow3() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", 1);
        int[] mag = new int[35];
        mag[2] = 1;
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.pow] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.ArithmeticUtils.pow(ArithmeticUtils.java:878)
            org.apache.commons.math.fraction.BigFraction.pow(BigFraction.java:989) */
        bigFraction.pow(bigInteger);
    }
    
    @Test
    public void testPow4() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", -1);
        int[] mag = new int[35];
        mag[2] = 16777216;
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.pow] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.ArithmeticUtils.pow(ArithmeticUtils.java:878)
            org.apache.commons.math.fraction.BigFraction.pow(BigFraction.java:986) */
        bigFraction.pow(bigInteger);
    }
    
    @Test
    public void testPow5() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", 1);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.pow] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.getInt(BigInteger.java:4628)
            java.base/java.math.BigInteger.testBit(BigInteger.java:3584)
            org.apache.commons.math.util.ArithmeticUtils.pow(ArithmeticUtils.java:875)
            org.apache.commons.math.fraction.BigFraction.pow(BigFraction.java:989) */
        bigFraction.pow(bigInteger);
    }
    
    @Test
    public void testPow6() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {1};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.pow] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.multiply(BigInteger.java:1598)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1586)
            org.apache.commons.math.util.ArithmeticUtils.pow(ArithmeticUtils.java:876)
            org.apache.commons.math.fraction.BigFraction.pow(BigFraction.java:989) */
        bigFraction.pow(bigInteger);
    }
    
    @Test
    public void testPow7() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.pow] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.equals(BigInteger.java:3895)
            org.apache.commons.math.util.ArithmeticUtils.pow(ArithmeticUtils.java:874)
            org.apache.commons.math.fraction.BigFraction.pow(BigFraction.java:989) */
        bigFraction.pow(bigInteger);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method pow(java.math.BigInteger)
    
    @Test(expected = RuntimeException.class)
    public void testPow8() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {0};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        setField(bigInteger, "java.math.BigInteger", "firstNonzeroIntNumPlusTwo", 1);
        
        bigFraction.pow(bigInteger);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.pow
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method pow(long)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#pow(long)}
 * @utbot.executesCondition {@code (exponent < 0): True}
 * @utbot.invokes {@link org.apache.commons.math.util.ArithmeticUtils#pow(java.math.BigInteger,long)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NotPositiveException} in: return new BigFraction(ArithmeticUtils.pow(denominator, -exponent), ArithmeticUtils.pow(numerator, -exponent));
 *  */
    @Test(expected = NotPositiveException.class)
    public void testPow_ThrowNotPositiveException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        bigFraction.pow(java.lang.Long.MIN_VALUE);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method pow(long)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#pow(long)}
     */
    @Test(expected = ZeroException.class)
    public void testPowThrowsZE() {
        BigFraction bigFraction = new BigFraction(0);
        
        bigFraction.pow(-9L);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method pow(long)
    
    @Test
    public void testPow9() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", 1);
        int[] mag = {1};
        setField(denominator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.pow] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.multiply(BigInteger.java:1598)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1586)
            org.apache.commons.math.util.ArithmeticUtils.pow(ArithmeticUtils.java:849)
            org.apache.commons.math.fraction.BigFraction.pow(BigFraction.java:967) */
        bigFraction.pow(-1440004571139L);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method pow(long)
    
    @Test(timeout = 1000L)
    public void testPow10() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", 8192);
        int[] mag = {1048576};
        setField(denominator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        bigFraction.pow(-9120089624432082956L);
    }
    
    @Test(timeout = 1000L)
    public void testPow11() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", 8);
        int[] mag = {-468446895};
        setField(denominator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        bigFraction.pow(-9223213698590441475L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.pow
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method pow(int)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#pow(int)}
 * @utbot.executesCondition {@code (exponent < 0): True}
 * @utbot.invokes {@link java.math.BigInteger#pow(int)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return new BigFraction(denominator.pow(-exponent), numerator.pow(-exponent));
 *  */
    @Test
    public void testPow_ThrowArithmeticException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.pow] produces [java.lang.ArithmeticException: Negative exponent]
            java.base/java.math.BigInteger.pow(BigInteger.java:2423)
            org.apache.commons.math.fraction.BigFraction.pow(BigFraction.java:949) */
        bigFraction.pow(Integer.MIN_VALUE);
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#pow(int)}
 * @utbot.executesCondition {@code (exponent < 0): False}
 * @utbot.invokes {@link java.math.BigInteger#pow(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new BigFraction(numerator.pow(exponent), denominator.pow(exponent));
 *  */
    @Test
    public void testPow_ThrowNullPointerException1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.pow] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.pow(BigFraction.java:951) */
        bigFraction.pow(0);
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#pow(int)}
 * @utbot.executesCondition {@code (exponent < 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new BigFraction(denominator.pow(-exponent), numerator.pow(-exponent));
 *  */
    @Test
    public void testPow_ThrowNullPointerException_1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.pow] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.pow(BigFraction.java:949) */
        bigFraction.pow(-1);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method pow(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#pow(int)}
     */
    @Test
    public void testPow() throws Exception  {
        BigFraction bigFraction = new BigFraction(-1);
        
        BigFraction actual = bigFraction.pow(2);
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method pow(int)
    
    @Test
    public void testPow12() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", 256);
        int[] mag = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(numerator, "java.math.BigInteger", "lowestSetBitPlusTwo", -1271791581);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.pow] produces [java.lang.ArithmeticException: BigInteger would overflow supported range]
            java.base/java.math.BigInteger.reportOverflow(BigInteger.java:1171)
            java.base/java.math.BigInteger.pow(BigInteger.java:2504)
            org.apache.commons.math.fraction.BigFraction.pow(BigFraction.java:951) */
        bigFraction.pow(945818184);
    }
    
    @Test
    public void testPow13() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", 256);
        int[] mag = {};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(numerator, "java.math.BigInteger", "lowestSetBitPlusTwo", -337626616);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.pow] produces [java.lang.IllegalArgumentException: invalid input length: 0]
            java.base/java.math.BigInteger.implSquareToLenChecks(BigInteger.java:2132)
            java.base/java.math.BigInteger.squareToLen(BigInteger.java:2123)
            java.base/java.math.BigInteger.square(BigInteger.java:2093)
            java.base/java.math.BigInteger.square(BigInteger.java:2076)
            java.base/java.math.BigInteger.pow(BigInteger.java:2520)
            org.apache.commons.math.fraction.BigFraction.pow(BigFraction.java:951) */
        bigFraction.pow(1838615552);
    }
    
    @Test
    public void testPow14() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", 512);
        int[] mag = {
            1, -2110783488, -2110783488, -2110783488, -2110783488, -2110783488, -2110783488, -2110783488,
            -2110783488
        };
        setField(denominator, "java.math.BigInteger", "mag", mag);
        setField(denominator, "java.math.BigInteger", "lowestSetBitPlusTwo", -2110783486);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.pow] produces [java.lang.ArithmeticException: BigInteger would overflow supported range]
            java.base/java.math.BigInteger.reportOverflow(BigInteger.java:1171)
            java.base/java.math.BigInteger.pow(BigInteger.java:2504)
            org.apache.commons.math.fraction.BigFraction.pow(BigFraction.java:949) */
        bigFraction.pow(-990446081);
    }
    
    @Test
    public void testPow15() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", 512);
        int[] mag = {};
        setField(denominator, "java.math.BigInteger", "mag", mag);
        setField(denominator, "java.math.BigInteger", "lowestSetBitPlusTwo", -772395646);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.pow] produces [java.lang.IllegalArgumentException: invalid input length: 0]
            java.base/java.math.BigInteger.implSquareToLenChecks(BigInteger.java:2132)
            java.base/java.math.BigInteger.squareToLen(BigInteger.java:2123)
            java.base/java.math.BigInteger.square(BigInteger.java:2093)
            java.base/java.math.BigInteger.square(BigInteger.java:2076)
            java.base/java.math.BigInteger.pow(BigInteger.java:2520)
            org.apache.commons.math.fraction.BigFraction.pow(BigFraction.java:949) */
        bigFraction.pow(-1913717248);
    }
    
    @Test
    public void testPow16() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", 4194304);
        setField(numerator, "java.math.BigInteger", "lowestSetBitPlusTwo", 40);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.pow] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.shiftRightImpl(BigInteger.java:3420)
            java.base/java.math.BigInteger.shiftRight(BigInteger.java:3399)
            java.base/java.math.BigInteger.pow(BigInteger.java:2446)
            org.apache.commons.math.fraction.BigFraction.pow(BigFraction.java:951) */
        bigFraction.pow(34078720);
    }
    
    @Test
    public void testPow17() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.pow] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.pow(BigFraction.java:951) */
        bigFraction.pow(0);
    }
    
    @Test
    public void testPow18() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", 8);
        int[] mag = {1073741825};
        setField(denominator, "java.math.BigInteger", "mag", mag);
        setField(denominator, "java.math.BigInteger", "lowestSetBitPlusTwo", 2);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.pow] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.pow(BigFraction.java:949) */
        bigFraction.pow(-54);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method pow(int)
    
    @Test(timeout = 1000L)
    public void testPow19() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", -2);
        int[] mag = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        bigFraction.pow(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.pow
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method pow(double)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#pow(double)}
 * @utbot.invokes {@link java.math.BigInteger#doubleValue()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return FastMath.pow(numerator.doubleValue(), exponent) / FastMath.pow(denominator.doubleValue(), exponent);
 *  */
    @Test
    public void testPow_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", -255);
        int[] mag = {};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.pow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.math.BigInteger.doubleValue(BigInteger.java:4342)
            org.apache.commons.math.fraction.BigFraction.pow(BigFraction.java:1004) */
        bigFraction.pow(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#pow(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return FastMath.pow(numerator.doubleValue(), exponent) / FastMath.pow(denominator.doubleValue(), exponent);
 *  */
    @Test
    public void testPow_ThrowNullPointerException2() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.pow] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.pow(BigFraction.java:1004) */
        bigFraction.pow(java.lang.Double.NaN);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method pow(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#pow(double)}
     */
    @Test
    public void testPowReturnsOne() {
        BigFraction bigFraction = new BigFraction(1);
        
        double actual = bigFraction.pow(1.0);
        
        org.junit.Assert.assertEquals(1.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method pow(double)
    
    @Test
    public void testPow20() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        double actual = bigFraction.pow(0.0);
        
        org.junit.Assert.assertEquals(1.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method pow(double)
    
    @Test
    public void testPow21() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.pow] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.pow(BigFraction.java:1005) */
        bigFraction.pow(2.225073858507202E-308);
    }
    
    @Test
    public void testPow22() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.pow] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.pow(BigFraction.java:1005) */
        bigFraction.pow(-2.225073858507202E-308);
    }
    
    @Test
    public void testPow23() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", -2147483647);
        int[] mag = new int[33];
        mag[0] = 1;
        mag[1] = 3;
        mag[2] = 3;
        mag[3] = 3;
        mag[4] = 3;
        mag[5] = 3;
        mag[6] = 3;
        mag[7] = 3;
        mag[8] = 3;
        mag[9] = 3;
        mag[10] = 3;
        mag[11] = 3;
        mag[12] = 3;
        mag[13] = 3;
        mag[14] = 3;
        mag[15] = 3;
        mag[16] = 3;
        mag[17] = 3;
        mag[18] = 3;
        mag[19] = 3;
        mag[20] = 3;
        mag[21] = 3;
        mag[22] = 3;
        mag[23] = 3;
        mag[24] = 3;
        mag[25] = 3;
        mag[26] = 3;
        mag[27] = 3;
        mag[28] = 3;
        mag[29] = 3;
        mag[30] = 3;
        mag[31] = 3;
        mag[32] = 3;
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.pow] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.pow(BigFraction.java:1005) */
        bigFraction.pow(0.0);
    }
    
    @Test
    public void testPow24() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", -2147483647);
        int[] mag = new int[33];
        mag[0] = 1;
        mag[1] = 3;
        mag[2] = 3;
        mag[3] = 3;
        mag[4] = 3;
        mag[5] = 3;
        mag[6] = 3;
        mag[7] = 3;
        mag[8] = 3;
        mag[9] = 3;
        mag[10] = 3;
        mag[11] = 3;
        mag[12] = 3;
        mag[13] = 3;
        mag[14] = 3;
        mag[15] = 3;
        mag[16] = 3;
        mag[17] = 3;
        mag[18] = 3;
        mag[19] = 3;
        mag[20] = 3;
        mag[21] = 3;
        mag[22] = 3;
        mag[23] = 3;
        mag[24] = 3;
        mag[25] = 3;
        mag[26] = 3;
        mag[27] = 3;
        mag[28] = 3;
        mag[29] = 3;
        mag[30] = 3;
        mag[31] = 3;
        mag[32] = 3;
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.pow] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.pow(BigFraction.java:1005) */
        bigFraction.pow(2.225073858507202E-308);
    }
    
    @Test
    public void testPow25() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", 1);
        int[] mag = {16, 3};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.pow] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.pow(BigFraction.java:1005) */
        bigFraction.pow(java.lang.Double.NaN);
    }
    
    @Test
    public void testPow26() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {0};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.pow] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.pow(BigFraction.java:1005) */
        bigFraction.pow(java.lang.Double.NaN);
    }
    
    @Test
    public void testPow27() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", 1);
        int[] mag = {1};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.pow] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.pow(BigFraction.java:1005) */
        bigFraction.pow(java.lang.Double.NaN);
    }
    
    @Test
    public void testPow28() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", -2147483647);
        int[] mag = new int[34];
        mag[0] = 16;
        mag[1] = -2147483646;
        mag[2] = -2147483646;
        mag[3] = -2147483646;
        mag[4] = -2147483646;
        mag[5] = -2147483646;
        mag[6] = -2147483646;
        mag[7] = -2147483646;
        mag[8] = -2147483646;
        mag[9] = -2147483646;
        mag[10] = -2147483646;
        mag[11] = -2147483646;
        mag[12] = -2147483646;
        mag[13] = -2147483646;
        mag[14] = -2147483646;
        mag[15] = -2147483646;
        mag[16] = -2147483646;
        mag[17] = -2147483646;
        mag[18] = -2147483646;
        mag[19] = -2147483646;
        mag[20] = -2147483646;
        mag[21] = -2147483646;
        mag[22] = -2147483646;
        mag[23] = -2147483646;
        mag[24] = -2147483646;
        mag[25] = -2147483646;
        mag[26] = -2147483646;
        mag[27] = -2147483646;
        mag[28] = -2147483646;
        mag[29] = -2147483646;
        mag[30] = -2147483646;
        mag[31] = -2147483646;
        mag[32] = -2147483646;
        mag[33] = -2147483646;
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.pow] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.pow(BigFraction.java:1005) */
        bigFraction.pow(java.lang.Double.NaN);
    }
    
    @Test
    public void testPow29() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", 1);
        int[] mag = new int[40];
        mag[0] = -2147483647;
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.pow] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.pow(BigFraction.java:1005) */
        bigFraction.pow(2.225073858507202E-308);
    }
    
    @Test
    public void testPow30() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", 1);
        int[] mag = new int[34];
        mag[0] = 65536;
        mag[1] = 3;
        mag[2] = 3;
        mag[3] = 3;
        mag[4] = 3;
        mag[5] = 3;
        mag[6] = 3;
        mag[7] = 3;
        mag[8] = 3;
        mag[9] = 3;
        mag[10] = 3;
        mag[11] = 3;
        mag[12] = 3;
        mag[13] = 3;
        mag[14] = 3;
        mag[15] = 3;
        mag[16] = 3;
        mag[17] = 3;
        mag[18] = 3;
        mag[19] = 3;
        mag[20] = 3;
        mag[21] = 3;
        mag[22] = 3;
        mag[23] = 3;
        mag[24] = 3;
        mag[25] = 3;
        mag[26] = 3;
        mag[27] = 3;
        mag[28] = 3;
        mag[29] = 3;
        mag[30] = 3;
        mag[31] = 3;
        mag[32] = 3;
        mag[33] = 3;
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.pow] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.pow(BigFraction.java:1005) */
        bigFraction.pow(java.lang.Double.NaN);
    }
    
    @Test
    public void testPow31() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", 1);
        int[] mag = {0};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.pow] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.pow(BigFraction.java:1005) */
        bigFraction.pow(java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.compareTo
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method compareTo(org.apache.commons.math.fraction.BigFraction)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#compareTo(org.apache.commons.math.fraction.BigFraction)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: BigInteger nOd = numerator.multiply(object.denominator);
 *  */
    @Test
    public void testCompareTo_ThrowNullPointerException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.compareTo] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.compareTo(BigFraction.java:594) */
        bigFraction.compareTo(((BigFraction) null));
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#compareTo(org.apache.commons.math.fraction.BigFraction)}
 * @utbot.invokes {@link java.math.BigInteger#multiply(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: BigInteger nOd = numerator.multiply(object.denominator);
 *  */
    @Test
    public void testCompareTo_ThrowNullPointerException_2() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.compareTo] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.multiply(BigInteger.java:1598)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1586)
            org.apache.commons.math.fraction.BigFraction.compareTo(BigFraction.java:594) */
        bigFraction.compareTo(bigFraction);
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#compareTo(org.apache.commons.math.fraction.BigFraction)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: BigInteger nOd = numerator.multiply(object.denominator);
 *  */
    @Test
    public void testCompareTo_ThrowNullPointerException_1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.compareTo] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.compareTo(BigFraction.java:594) */
        bigFraction.compareTo(bigFraction);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method compareTo(org.apache.commons.math.fraction.BigFraction)
    
    @Test
    public void testCompareTo1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        int actual = bigFraction.compareTo(bigFraction);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method compareTo(org.apache.commons.math.fraction.BigFraction)
    
    @Test
    public void testCompareTo2() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", 1);
        int[] mag = {};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigFraction bigFraction1 = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        setField(bigFraction1, "org.apache.commons.math.fraction.BigFraction", "denominator", numerator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.compareTo] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/java.math.BigInteger.implMultiplyToLen(BigInteger.java:1776)
            java.base/java.math.BigInteger.multiplyToLen(BigInteger.java:1758)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1617)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1586)
            org.apache.commons.math.fraction.BigFraction.compareTo(BigFraction.java:594) */
        bigFraction.compareTo(bigFraction1);
    }
    
    @Test
    public void testCompareTo3() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", 1);
        int[] mag = {};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigFraction bigFraction1 = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", 2);
        int[] mag1 = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(denominator, "java.math.BigInteger", "mag", mag1);
        setField(bigFraction1, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.compareTo] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/java.math.BigInteger.implMultiplyToLen(BigInteger.java:1771)
            java.base/java.math.BigInteger.multiplyToLen(BigInteger.java:1758)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1617)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1586)
            org.apache.commons.math.fraction.BigFraction.compareTo(BigFraction.java:594) */
        bigFraction.compareTo(bigFraction1);
    }
    
    @Test
    public void testCompareTo4() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", 1);
        int[] mag = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigFraction bigFraction1 = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", 1);
        int[] mag1 = {512};
        setField(denominator, "java.math.BigInteger", "mag", mag1);
        setField(bigFraction1, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.compareTo] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.compareTo(BigFraction.java:595) */
        bigFraction.compareTo(bigFraction1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.intValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method intValue()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#intValue()}
 * @utbot.invokes {@link java.math.BigInteger#divide(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return numerator.divide(denominator).intValue();
 *  */
    @Test
    public void testIntValue_ThrowArithmeticException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {-255};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag1 = {};
        setField(denominator, "java.math.BigInteger", "mag", mag1);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.intValue] produces [java.lang.ArithmeticException: BigInteger divide by zero]
            java.base/java.math.MutableBigInteger.divideKnuth(MutableBigInteger.java:1184)
            java.base/java.math.BigInteger.divideKnuth(BigInteger.java:2318)
            java.base/java.math.BigInteger.divide(BigInteger.java:2299)
            org.apache.commons.math.fraction.BigFraction.intValue(BigFraction.java:828) */
        bigFraction.intValue();
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#intValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return numerator.divide(denominator).intValue();
 *  */
    @Test
    public void testIntValue_ThrowNullPointerException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.intValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.intValue(BigFraction.java:828) */
        bigFraction.intValue();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method intValue()
    
    @Test
    public void testIntValue1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", numerator);
        
        int actual = bigFraction.intValue();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method intValue()
    
    @Test
    public void testIntValue2() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {0, 0};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag1 = {0};
        setField(denominator, "java.math.BigInteger", "mag", mag1);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.intValue] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.math.MutableBigInteger.divideOneWord(MutableBigInteger.java:1117)
            java.base/java.math.MutableBigInteger.divideKnuth(MutableBigInteger.java:1208)
            java.base/java.math.BigInteger.divideKnuth(BigInteger.java:2318)
            java.base/java.math.BigInteger.divide(BigInteger.java:2299)
            org.apache.commons.math.fraction.BigFraction.intValue(BigFraction.java:828) */
        bigFraction.intValue();
    }
    
    @Test
    public void testIntValue3() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = new int[17];
        mag[0] = -2147483647;
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag1 = new int[17];
        setField(denominator, "java.math.BigInteger", "mag", mag1);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.intValue] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.math.MutableBigInteger.divWord(MutableBigInteger.java:1858)
            java.base/java.math.MutableBigInteger.divideMagnitude(MutableBigInteger.java:1626)
            java.base/java.math.MutableBigInteger.divideKnuth(MutableBigInteger.java:1232)
            java.base/java.math.BigInteger.divideKnuth(BigInteger.java:2318)
            java.base/java.math.BigInteger.divide(BigInteger.java:2299)
            org.apache.commons.math.fraction.BigFraction.intValue(BigFraction.java:828) */
        bigFraction.intValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.longValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method longValue()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#longValue()}
 * @utbot.invokes {@link java.math.BigInteger#divide(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return numerator.divide(denominator).longValue();
 *  */
    @Test
    public void testLongValue_ThrowArithmeticException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {-255};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag1 = {};
        setField(denominator, "java.math.BigInteger", "mag", mag1);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.longValue] produces [java.lang.ArithmeticException: BigInteger divide by zero]
            java.base/java.math.MutableBigInteger.divideKnuth(MutableBigInteger.java:1184)
            java.base/java.math.BigInteger.divideKnuth(BigInteger.java:2318)
            java.base/java.math.BigInteger.divide(BigInteger.java:2299)
            org.apache.commons.math.fraction.BigFraction.longValue(BigFraction.java:842) */
        bigFraction.longValue();
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#longValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return numerator.divide(denominator).longValue();
 *  */
    @Test
    public void testLongValue_ThrowNullPointerException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.longValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.longValue(BigFraction.java:842) */
        bigFraction.longValue();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method longValue()
    
    @Test
    public void testLongValue1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {1342177730};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", numerator);
        
        long actual = bigFraction.longValue();
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method longValue()
    
    @Test
    public void testLongValue2() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {0, 0};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag1 = {0};
        setField(denominator, "java.math.BigInteger", "mag", mag1);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.longValue] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.math.MutableBigInteger.divideOneWord(MutableBigInteger.java:1117)
            java.base/java.math.MutableBigInteger.divideKnuth(MutableBigInteger.java:1208)
            java.base/java.math.BigInteger.divideKnuth(BigInteger.java:2318)
            java.base/java.math.BigInteger.divide(BigInteger.java:2299)
            org.apache.commons.math.fraction.BigFraction.longValue(BigFraction.java:842) */
        bigFraction.longValue();
    }
    
    @Test
    public void testLongValue3() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {-2147483647, 0};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag1 = {0, 0};
        setField(denominator, "java.math.BigInteger", "mag", mag1);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.longValue] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.math.MutableBigInteger.divWord(MutableBigInteger.java:1858)
            java.base/java.math.MutableBigInteger.divideMagnitude(MutableBigInteger.java:1626)
            java.base/java.math.MutableBigInteger.divideKnuth(MutableBigInteger.java:1232)
            java.base/java.math.BigInteger.divideKnuth(BigInteger.java:2318)
            java.base/java.math.BigInteger.divide(BigInteger.java:2299)
            org.apache.commons.math.fraction.BigFraction.longValue(BigFraction.java:842) */
        bigFraction.longValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.floatValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method floatValue()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#floatValue()}
 * @utbot.invokes {@link java.math.BigInteger#floatValue()}
 * @utbot.invokes {@link java.math.BigInteger#floatValue()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testFloatValue_BigIntegerFloatValue() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", numerator);
        
        float actual = bigFraction.floatValue();
        
        org.junit.Assert.assertEquals(java.lang.Float.NaN, actual, 1.0E-6f);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method floatValue()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#floatValue()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: float result = numerator.floatValue() / denominator.floatValue();
 *  */
    @Test
    public void testFloatValue_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", -255);
        int[] mag = {};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.floatValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.math.BigInteger.floatValue(BigInteger.java:4257)
            org.apache.commons.math.fraction.BigFraction.floatValue(BigFraction.java:732) */
        bigFraction.floatValue();
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#floatValue()}
 * @utbot.invokes {@link java.math.BigInteger#floatValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: float result = numerator.floatValue() / denominator.floatValue();
 *  */
    @Test
    public void testFloatValue_ThrowNullPointerException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.floatValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.floatValue(BigFraction.java:732) */
        bigFraction.floatValue();
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#floatValue()}
 * @utbot.invokes {@link java.math.BigInteger#floatValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: float result = numerator.floatValue() / denominator.floatValue();
 *  */
    @Test
    public void testFloatValue_ThrowNullPointerException_1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.floatValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.floatValue(BigFraction.java:732) */
        bigFraction.floatValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.doubleValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method doubleValue()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#doubleValue()}
 * @utbot.invokes {@link java.math.BigInteger#doubleValue()}
 * @utbot.invokes {@link java.math.BigInteger#doubleValue()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testDoubleValue_BigIntegerDoubleValue() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", numerator);
        
        double actual = bigFraction.doubleValue();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method doubleValue()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#doubleValue()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double result = numerator.doubleValue() / denominator.doubleValue();
 *  */
    @Test
    public void testDoubleValue_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", -255);
        int[] mag = {};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.doubleValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.math.BigInteger.doubleValue(BigInteger.java:4342)
            org.apache.commons.math.fraction.BigFraction.doubleValue(BigFraction.java:685) */
        bigFraction.doubleValue();
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#doubleValue()}
 * @utbot.invokes {@link java.math.BigInteger#doubleValue()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double result = numerator.doubleValue() / denominator.doubleValue();
 *  */
    @Test
    public void testDoubleValue_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", -255);
        int[] mag = {};
        setField(denominator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.doubleValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.math.BigInteger.doubleValue(BigInteger.java:4342)
            org.apache.commons.math.fraction.BigFraction.doubleValue(BigFraction.java:685) */
        bigFraction.doubleValue();
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#doubleValue()}
 * @utbot.invokes {@link java.math.BigInteger#doubleValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double result = numerator.doubleValue() / denominator.doubleValue();
 *  */
    @Test
    public void testDoubleValue_ThrowNullPointerException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.doubleValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.doubleValue(BigFraction.java:685) */
        bigFraction.doubleValue();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method doubleValue()
    
    @Test
    public void testDoubleValue1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {16, -2147483646};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(numerator, "java.math.BigInteger", "firstNonzeroIntNumPlusTwo", 1073741826);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.doubleValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.doubleValue(BigFraction.java:685) */
        bigFraction.doubleValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.getField
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getField()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#getField()}
 * @utbot.invokes {@link org.apache.commons.math.fraction.BigFractionField#getInstance()}
 * @utbot.returnsFrom {@code return BigFractionField.getInstance();}
 *  */
    @Test
    public void testGetField_BigFractionFieldGetInstance() throws Exception  {
        Class lazyHolderClazz = Class.forName("org.apache.commons.math.fraction.BigFractionField$LazyHolder");
        BigFractionField prevINSTANCE = ((BigFractionField) getStaticFieldValue(lazyHolderClazz, "INSTANCE"));
        try {
            Class bigFractionFieldClazz = Class.forName("org.apache.commons.math.fraction.BigFractionField");
            Class anonymousObjectType = Class.forName("org.apache.commons.math.fraction.BigFractionField$1");
            Constructor bigFractionFieldConstructor = bigFractionFieldClazz.getDeclaredConstructor(anonymousObjectType);
            bigFractionFieldConstructor.setAccessible(true);
            java.lang.Object[] bigFractionFieldConstructorArguments = new java.lang.Object[1];
            bigFractionFieldConstructorArguments[0] = ((Object) null);
            BigFractionField instance = ((BigFractionField) bigFractionFieldConstructor.newInstance(bigFractionFieldConstructorArguments));
            setStaticField(lazyHolderClazz, "INSTANCE", instance);
            BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
            
            BigFractionField actual = bigFraction.getField();
            
        } finally {
            setStaticField(lazyHolderClazz, "INSTANCE", prevINSTANCE);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getField()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#getField()}
     */
    @Test
    public void testGetField() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        BigFraction bigFraction = new BigFraction(16385);
        
        BigFractionField actual = bigFraction.getField();
        
        Class bigFractionFieldClazz = Class.forName("org.apache.commons.math.fraction.BigFractionField");
        Class anonymousObjectType = Class.forName("org.apache.commons.math.fraction.BigFractionField$1");
        Constructor bigFractionFieldConstructor = bigFractionFieldClazz.getDeclaredConstructor(anonymousObjectType);
        bigFractionFieldConstructor.setAccessible(true);
        java.lang.Object[] bigFractionFieldConstructorArguments = new java.lang.Object[1];
        bigFractionFieldConstructorArguments[0] = ((Object) null);
        BigFractionField expected = ((BigFractionField) bigFractionFieldConstructor.newInstance(bigFractionFieldConstructorArguments));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.reduce
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reduce()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#reduce()}
 * @utbot.invokes {@link java.math.BigInteger#gcd(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final BigInteger gcd = numerator.gcd(denominator);
 *  */
    @Test
    public void testReduce_ThrowNullPointerException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.reduce] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.reduce(BigFraction.java:1028) */
        bigFraction.reduce();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method reduce()
    
    @Test
    public void testReduce1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {1073742822};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", 1);
        setField(denominator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        BigFraction actual = bigFraction.reduce();
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator1 = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator1);
        BigInteger denominator1 = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator1);
        
        // org.apache.commons.math.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testReduce2() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", 1);
        int[] mag = new int[40];
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", 1);
        int[] mag1 = {0, 0, 0, 0, 0, 0, 0, 0};
        setField(denominator, "java.math.BigInteger", "mag", mag1);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        BigFraction actual = bigFraction.reduce();
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator1 = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator1);
        BigInteger denominator1 = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator1);
        
        // org.apache.commons.math.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method reduce()
    
    @Test
    public void testReduce3() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", numerator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.reduce] produces [java.lang.ArithmeticException: BigInteger divide by zero]
            java.base/java.math.MutableBigInteger.divideKnuth(MutableBigInteger.java:1184)
            java.base/java.math.BigInteger.divideKnuth(BigInteger.java:2318)
            java.base/java.math.BigInteger.divide(BigInteger.java:2299)
            org.apache.commons.math.fraction.BigFraction.reduce(BigFraction.java:1029) */
        bigFraction.reduce();
    }
    
    @Test
    public void testReduce4() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = new int[16];
        mag[0] = -2147483647;
        mag[15] = 1;
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", 1);
        int[] mag1 = new int[16];
        setField(denominator, "java.math.BigInteger", "mag", mag1);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.reduce] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.math.MutableBigInteger.divWord(MutableBigInteger.java:1858)
            java.base/java.math.MutableBigInteger.divideMagnitude(MutableBigInteger.java:1626)
            java.base/java.math.MutableBigInteger.divideKnuth(MutableBigInteger.java:1232)
            java.base/java.math.BigInteger.divideKnuth(BigInteger.java:2318)
            java.base/java.math.BigInteger.divide(BigInteger.java:2299)
            org.apache.commons.math.fraction.BigFraction.reduce(BigFraction.java:1029) */
        bigFraction.reduce();
    }
    
    @Test
    public void testReduce5() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {1, 0};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", 1);
        int[] mag1 = {0, 0};
        setField(denominator, "java.math.BigInteger", "mag", mag1);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.reduce] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.math.MutableBigInteger.divideMagnitude(MutableBigInteger.java:1623)
            java.base/java.math.MutableBigInteger.divideKnuth(MutableBigInteger.java:1232)
            java.base/java.math.BigInteger.divideKnuth(BigInteger.java:2318)
            java.base/java.math.BigInteger.divide(BigInteger.java:2299)
            org.apache.commons.math.fraction.BigFraction.reduce(BigFraction.java:1029) */
        bigFraction.reduce();
    }
    
    @Test
    public void testReduce6() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {-2147483647};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(denominator, "java.math.BigInteger", "signum", 1);
        int[] mag1 = {0};
        setField(denominator, "java.math.BigInteger", "mag", mag1);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.reduce] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.math.MutableBigInteger.divideOneWord(MutableBigInteger.java:1096)
            java.base/java.math.MutableBigInteger.divideKnuth(MutableBigInteger.java:1208)
            java.base/java.math.BigInteger.divideKnuth(BigInteger.java:2318)
            java.base/java.math.BigInteger.divide(BigInteger.java:2299)
            org.apache.commons.math.fraction.BigFraction.reduce(BigFraction.java:1029) */
        bigFraction.reduce();
    }
    
    @Test
    public void testReduce7() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", -2);
        int[] mag = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.reduce] produces [java.lang.NullPointerException]
            java.base/java.math.MutableBigInteger.<init>(MutableBigInteger.java:123)
            java.base/java.math.BigInteger.divideKnuth(BigInteger.java:2315)
            java.base/java.math.BigInteger.divide(BigInteger.java:2299)
            org.apache.commons.math.fraction.BigFraction.reduce(BigFraction.java:1029) */
        bigFraction.reduce();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method reduce()
    
    @Test(expected = ZeroException.class)
    public void testReduce8() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {0};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", numerator);
        
        bigFraction.reduce();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.multiply
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method multiply(org.apache.commons.math.fraction.BigFraction)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#multiply(org.apache.commons.math.fraction.BigFraction)}
 * @utbot.executesCondition {@code (fraction == null): True}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} when: fraction == null
 *  */
    @Test(expected = NullArgumentException.class)
    public void testMultiply_ThrowNullArgumentException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        bigFraction.multiply(((BigFraction) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method multiply(org.apache.commons.math.fraction.BigFraction)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#multiply(org.apache.commons.math.fraction.BigFraction)}
 * @utbot.executesCondition {@code (fraction == null): False}
 * @utbot.invokes {@link java.math.BigInteger#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: numerator.equals(BigInteger.ZERO) || fraction.numerator.equals(BigInteger.ZERO)
 *  */
    @Test
    public void testMultiply_ThrowNullPointerException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.multiply(BigFraction.java:904) */
        bigFraction.multiply(bigFraction);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method multiply(org.apache.commons.math.fraction.BigFraction)
    
    @Test
    public void testMultiply1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigFraction bigFraction1 = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        BigFraction actual = bigFraction.multiply(bigFraction1);
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator1 = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator1);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method multiply(org.apache.commons.math.fraction.BigFraction)
    
    @Test
    public void testMultiply2() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigFraction bigFraction1 = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator1 = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator1, "java.math.BigInteger", "signum", 1);
        setField(bigFraction1, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator1);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.multiply] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.equals(BigInteger.java:3893)
            org.apache.commons.math.fraction.BigFraction.multiply(BigFraction.java:904) */
        bigFraction.multiply(bigFraction1);
    }
    
    @Test
    public void testMultiply3() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {0};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigFraction bigFraction1 = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.multiply(BigFraction.java:905) */
        bigFraction.multiply(bigFraction1);
    }
    
    @Test
    public void testMultiply4() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", 1);
        int[] mag = {0};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigFraction bigFraction1 = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator1 = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction1, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator1);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.multiply] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.equals(BigInteger.java:3893)
            org.apache.commons.math.fraction.BigFraction.multiply(BigFraction.java:905) */
        bigFraction.multiply(bigFraction1);
    }
    
    @Test
    public void testMultiply5() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", 1);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigFraction bigFraction1 = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator1 = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {0};
        setField(numerator1, "java.math.BigInteger", "mag", mag);
        setField(bigFraction1, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator1);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.multiply(BigFraction.java:909) */
        bigFraction.multiply(bigFraction1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.multiply
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method multiply(int)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#multiply(int)}
 * @utbot.invokes {@link org.apache.commons.math.fraction.BigFraction#multiply(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return multiply(BigInteger.valueOf(i));
 *  */
    @Test
    public void testMultiply_ThrowNullPointerException1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.multiply] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.multiply(BigInteger.java:1598)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1586)
            org.apache.commons.math.fraction.BigFraction.multiply(BigFraction.java:859)
            org.apache.commons.math.fraction.BigFraction.multiply(BigFraction.java:873) */
        bigFraction.multiply(-16);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method multiply(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#multiply(int)}
     */
    @Test
    public void testMultiply() throws Exception  {
        BigFraction bigFraction = new BigFraction(1);
        
        BigFraction actual = bigFraction.multiply(-3);
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method multiply(int)
    
    @Test
    public void testMultiply6() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", 1);
        int[] mag = {};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.multiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.math.BigInteger.shiftLeft(BigInteger.java:3359)
            java.base/java.math.BigInteger.multiplyByInt(BigInteger.java:1689)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1615)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1586)
            org.apache.commons.math.fraction.BigFraction.multiply(BigFraction.java:859)
            org.apache.commons.math.fraction.BigFraction.multiply(BigFraction.java:873) */
        bigFraction.multiply(-16);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method multiply(int)
    
    @Test(expected = NullArgumentException.class)
    public void testMultiply7() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        
        bigFraction.multiply(16);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.multiply
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method multiply(long)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#multiply(long)}
 * @utbot.invokes {@link org.apache.commons.math.fraction.BigFraction#multiply(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return multiply(BigInteger.valueOf(l));
 *  */
    @Test
    public void testMultiply_ThrowNullPointerException2() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.multiply] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.multiply(BigInteger.java:1598)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1586)
            org.apache.commons.math.fraction.BigFraction.multiply(BigFraction.java:859)
            org.apache.commons.math.fraction.BigFraction.multiply(BigFraction.java:887) */
        bigFraction.multiply(-16L);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method multiply(long)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#multiply(long)}
     */
    @Test
    public void testMultiply8() throws Exception  {
        BigFraction bigFraction = new BigFraction(1);
        
        BigFraction actual = bigFraction.multiply(-9L);
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method multiply(long)
    
    @Test
    public void testMultiply9() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", 1);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.multiply] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.multiply(BigInteger.java:1607)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1586)
            org.apache.commons.math.fraction.BigFraction.multiply(BigFraction.java:859)
            org.apache.commons.math.fraction.BigFraction.multiply(BigFraction.java:887) */
        bigFraction.multiply(2L);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method multiply(long)
    
    @Test(expected = NullArgumentException.class)
    public void testMultiply10() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        
        bigFraction.multiply(8L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.multiply
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method multiply(java.math.BigInteger)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#multiply(java.math.BigInteger)}
 * @utbot.executesCondition {@code (bg == null): True}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} when: bg == null
 *  */
    @Test(expected = NullArgumentException.class)
    public void testMultiply_ThrowNullArgumentException1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        bigFraction.multiply(((BigInteger) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method multiply(java.math.BigInteger)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#multiply(java.math.BigInteger)}
 * @utbot.executesCondition {@code (bg == null): False}
 * @utbot.invokes {@link java.math.BigInteger#multiply(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new BigFraction(bg.multiply(numerator), denominator);
 *  */
    @Test
    public void testMultiply_ThrowNullPointerException3() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.multiply] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.multiply(BigInteger.java:1598)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1586)
            org.apache.commons.math.fraction.BigFraction.multiply(BigFraction.java:859) */
        bigFraction.multiply(bigInteger);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method multiply(java.math.BigInteger)
    
    @Test(expected = NullArgumentException.class)
    public void testMultiply11() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", 1);
        int[] mag = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", 1);
        int[] mag1 = {65536};
        setField(bigInteger, "java.math.BigInteger", "mag", mag1);
        
        bigFraction.multiply(bigInteger);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method multiply(java.math.BigInteger)
    
    @Test
    public void testMultiply12() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", 1);
        int[] mag = {67108864};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", 1);
        int[] mag1 = {};
        setField(bigInteger, "java.math.BigInteger", "mag", mag1);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.multiply] produces [java.lang.ArrayIndexOutOfBoundsException] */
        bigFraction.multiply(bigInteger);
    }
    
    @Test
    public void testMultiply13() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", 2);
        int[] mag = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", 1);
        int[] mag1 = {};
        setField(bigInteger, "java.math.BigInteger", "mag", mag1);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.multiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/java.math.BigInteger.implMultiplyToLen(BigInteger.java:1771)
            java.base/java.math.BigInteger.multiplyToLen(BigInteger.java:1758)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1617)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1586)
            org.apache.commons.math.fraction.BigFraction.multiply(BigFraction.java:859) */
        bigFraction.multiply(bigInteger);
    }
    
    @Test
    public void testMultiply14() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", 1);
        int[] mag = {};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", 1);
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.multiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/java.math.BigInteger.implMultiplyToLen(BigInteger.java:1776)
            java.base/java.math.BigInteger.multiplyToLen(BigInteger.java:1758)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1617)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1586)
            org.apache.commons.math.fraction.BigFraction.multiply(BigFraction.java:859) */
        bigFraction.multiply(bigInteger);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.negate
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method negate()
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#negate()}
 * @utbot.invokes {@link java.math.BigInteger#negate()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new BigFraction(numerator.negate(), denominator);
 *  */
    @Test
    public void testNegate_ThrowNullPointerException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.negate] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.negate(BigFraction.java:921) */
        bigFraction.negate();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method negate()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#negate()}
     */
    @Test
    public void testNegate() throws Exception  {
        BigFraction bigFraction = new BigFraction(16385);
        
        BigFraction actual = bigFraction.negate();
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.divide
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method divide(org.apache.commons.math.fraction.BigFraction)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#divide(org.apache.commons.math.fraction.BigFraction)}
 * @utbot.executesCondition {@code (fraction == null): True}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} when: fraction == null
 *  */
    @Test(expected = NullArgumentException.class)
    public void testDivide_ThrowNullArgumentException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        bigFraction.divide(((BigFraction) null));
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#divide(org.apache.commons.math.fraction.BigFraction)}
 * @utbot.executesCondition {@code (fraction == null): False}
 * @utbot.executesCondition {@code (BigInteger.ZERO.equals(fraction.numerator)): True}
 * @utbot.invokes {@link java.math.BigInteger#equals(java.lang.Object)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} when: BigInteger.ZERO.equals(fraction.numerator)
 *  */
    @Test(expected = NullArgumentException.class)
    public void testDivide_ThrowNullArgumentException_1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(numerator, "java.math.BigInteger", "signum", -255);
        int[] mag = {};
        setField(numerator, "java.math.BigInteger", "mag", mag);
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        
        bigFraction.divide(bigFraction);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.divide
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method divide(int)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#divide(int)}
 * @utbot.invokes {@link org.apache.commons.math.fraction.BigFraction#divide(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return divide(BigInteger.valueOf(i));
 *  */
    @Test
    public void testDivide_ThrowNullPointerException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.divide] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.divide(BigFraction.java:617)
            org.apache.commons.math.fraction.BigFraction.divide(BigFraction.java:633) */
        bigFraction.divide(-16);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method divide(int)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#divide(int)}
 * @utbot.invokes {@link org.apache.commons.math.fraction.BigFraction#divide(java.math.BigInteger)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} 
 *  */
    @Test(expected = NullArgumentException.class)
    public void testDivide_ThrowNullArgumentException1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        bigFraction.divide(-16);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method divide(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#divide(int)}
     */
    @Test
    public void testDivide() throws Exception  {
        BigFraction bigFraction = new BigFraction(1);
        
        BigFraction actual = bigFraction.divide(-3);
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.divide
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method divide(java.math.BigInteger)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#divide(java.math.BigInteger)}
 * @utbot.executesCondition {@code (BigInteger.ZERO.equals(bg)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: BigInteger.ZERO.equals(bg)
 *  */
    @Test
    public void testDivide_ThrowNullPointerException1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", -255);
        int[] mag = {};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.divide] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.divide(BigFraction.java:617) */
        bigFraction.divide(bigInteger);
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#divide(java.math.BigInteger)}
 * @utbot.executesCondition {@code (BigInteger.ZERO.equals(bg)): False}
 * @utbot.invokes {@link java.math.BigInteger#multiply(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new BigFraction(numerator, denominator.multiply(bg));
 *  */
    @Test
    public void testDivide_ThrowNullPointerException_1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.divide] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.multiply(BigInteger.java:1598)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1586)
            org.apache.commons.math.fraction.BigFraction.divide(BigFraction.java:617) */
        bigFraction.divide(((BigInteger) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.divide
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method divide(long)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#divide(long)}
 * @utbot.invokes {@link org.apache.commons.math.fraction.BigFraction#divide(java.math.BigInteger)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.ZeroException} in: return divide(BigInteger.valueOf(l));
 *  */
    @Test(expected = ZeroException.class)
    public void testDivide_ThrowZeroException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        bigFraction.divide(0L);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method divide(long)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#divide(long)}
 * @utbot.invokes {@link org.apache.commons.math.fraction.BigFraction#divide(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return divide(BigInteger.valueOf(l));
 *  */
    @Test
    public void testDivide_ThrowNullPointerException2() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.divide] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.divide(BigFraction.java:617)
            org.apache.commons.math.fraction.BigFraction.divide(BigFraction.java:649) */
        bigFraction.divide(4294967313L);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method divide(long)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#divide(long)}
     */
    @Test
    public void testDivide1() throws Exception  {
        BigFraction bigFraction = new BigFraction(1);
        
        BigFraction actual = bigFraction.divide(-9L);
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.subtract
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method subtract(org.apache.commons.math.fraction.BigFraction)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#subtract(org.apache.commons.math.fraction.BigFraction)}
 * @utbot.executesCondition {@code (fraction == null): True}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} when: fraction == null
 *  */
    @Test(expected = NullArgumentException.class)
    public void testSubtract_ThrowNullArgumentException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        bigFraction.subtract(((BigFraction) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.subtract
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method subtract(long)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#subtract(long)}
 * @utbot.invokes {@link org.apache.commons.math.fraction.BigFraction#subtract(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return subtract(BigInteger.valueOf(l));
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.subtract(BigFraction.java:1046)
            org.apache.commons.math.fraction.BigFraction.subtract(BigFraction.java:1072) */
        bigFraction.subtract(-16L);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method subtract(long)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#subtract(long)}
     */
    @Test
    public void testSubtract() throws Exception  {
        BigFraction bigFraction = new BigFraction(1);
        
        BigFraction actual = bigFraction.subtract(-9L);
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.subtract
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method subtract(int)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#subtract(int)}
 * @utbot.invokes {@link org.apache.commons.math.fraction.BigFraction#subtract(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return subtract(BigInteger.valueOf(i));
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.subtract(BigFraction.java:1046)
            org.apache.commons.math.fraction.BigFraction.subtract(BigFraction.java:1059) */
        bigFraction.subtract(0);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method subtract(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.fraction.BigFraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#subtract(int)}
     */
    @Test
    public void testSubtract1() throws Exception  {
        BigFraction bigFraction = new BigFraction(1);
        
        BigFraction actual = bigFraction.subtract(-3);
        
        BigFraction expected = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger numerator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math.fraction.BigFraction", "numerator", numerator);
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(expected, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        
        // org.apache.commons.math.fraction.BigFraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.BigFraction.subtract
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method subtract(java.math.BigInteger)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#subtract(java.math.BigInteger)}
 * @utbot.executesCondition {@code (bg == null): True}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} when: bg == null
 *  */
    @Test(expected = NullArgumentException.class)
    public void testSubtract_ThrowNullArgumentException1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        
        bigFraction.subtract(((BigInteger) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method subtract(java.math.BigInteger)
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#subtract(java.math.BigInteger)}
 * @utbot.invokes {@link java.math.BigInteger#multiply(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new BigFraction(numerator.subtract(denominator.multiply(bg)), denominator);
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException_1() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger denominator = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigFraction, "org.apache.commons.math.fraction.BigFraction", "denominator", denominator);
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.subtract(BigFraction.java:1046) */
        bigFraction.subtract(bigInteger);
    }
    
    /**
    @utbot.classUnderTest {@link BigFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.BigFraction#subtract(java.math.BigInteger)}
 * @utbot.invokes {@link java.math.BigInteger#multiply(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new BigFraction(numerator.subtract(denominator.multiply(bg)), denominator);
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException2() throws Exception  {
        BigFraction bigFraction = ((BigFraction) createInstance("org.apache.commons.math.fraction.BigFraction"));
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        
        /* This test fails because method [org.apache.commons.math.fraction.BigFraction.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.BigFraction.subtract(BigFraction.java:1046) */
        bigFraction.subtract(bigInteger);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields726257376825600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields726257376825600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass726257376832300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields726257376825600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass726257376832300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields726257377154200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields726257377154200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass726257377157800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields726257377154200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass726257377157800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
                modifiersField.setAccessible(true);
                modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
                
                return field.get(null);
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (java.lang.reflect.InvocationTargetException e3) {
                e3.printStackTrace();
            }
        } while (clazz != null);
    
        throw new NoSuchFieldException("Field '" + fieldName + "' not found on class " + originClass);
    }
    
    private static void setStaticField(Class<?> clazz, String fieldName, Object fieldValue) throws NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field field;
    
        try {
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
            } catch (Exception e) {
                clazz = clazz.getSuperclass();
                field = null;
            }
        } while (field == null);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields726257377946000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields726257377946000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass726257377947500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields726257377946000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass726257377947500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(null, fieldValue);
        }
        catch(java.lang.reflect.InvocationTargetException e){
            e.printStackTrace();
        }
        catch(NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

