package org.apache.commons.lang.math;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_lang_math_FractionTest {
    ///region Test suites for executable org.apache.commons.lang.math.Fraction.invert
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method invert()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#invert()}
 * @utbot.executesCondition {@code (numerator < 0): False}
 * @utbot.returnsFrom {@code return new Fraction(denominator, numerator);}
 *  */
    @Test
    public void testInvert_NumeratorGreaterOrEqualZero() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        
        Fraction actual = fraction.invert();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 1);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#invert()}
 * @utbot.executesCondition {@code (numerator < 0): True}
 * @utbot.returnsFrom {@code return new Fraction(-denominator, -numerator);}
 *  */
    @Test
    public void testInvert_NumeratorLessThanZero() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -1);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -3);
        
        Fraction actual = fraction.invert();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", 3);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 1);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method invert()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#invert()}
 * @utbot.executesCondition {@code (numerator == 0): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: numerator == 0
 *  */
    @Test(expected = ArithmeticException.class)
    public void testInvert_ThrowArithmeticException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        
        fraction.invert();
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#invert()}
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.executesCondition {@code (numerator == Integer.MIN_VALUE): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: numerator == Integer.MIN_VALUE
 *  */
    @Test(expected = ArithmeticException.class)
    public void testInvert_ThrowArithmeticException_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", Integer.MIN_VALUE);
        
        fraction.invert();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.Fraction.getNumerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNumerator()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#getNumerator()}
 * @utbot.returnsFrom {@code return numerator;}
 *  */
    @Test
    public void testGetNumerator_ReturnNumerator() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -255);
        
        int actual = fraction.getNumerator();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.Fraction.getDenominator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDenominator()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#getDenominator()}
 * @utbot.returnsFrom {@code return denominator;}
 *  */
    @Test
    public void testGetDenominator_ReturnDenominator() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -255);
        
        int actual = fraction.getDenominator();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.Fraction.getProperNumerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getProperNumerator()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#getProperNumerator()}
 * @utbot.invokes {@link java.lang.Math#abs(int)}
 * @utbot.returnsFrom {@code return Math.abs(numerator % denominator);}
 *  */
    @Test
    public void testGetProperNumerator_MathAbs() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -1);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -2);
        
        int actual = fraction.getProperNumerator();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getProperNumerator()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#getProperNumerator()}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return Math.abs(numerator % denominator);
 *  */
    @Test
    public void testGetProperNumerator_ThrowArithmeticException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -255);
        
        /* This test fails because method [org.apache.commons.lang.math.Fraction.getProperNumerator] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.lang.math.Fraction.getProperNumerator(Fraction.java:392) */
        fraction.getProperNumerator();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.Fraction.getProperWhole
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getProperWhole()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#getProperWhole()}
 * @utbot.returnsFrom {@code return numerator / denominator;}
 *  */
    @Test
    public void testGetProperWhole_ReturnNumeratorDivideDenominator() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -255);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -255);
        
        int actual = fraction.getProperWhole();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getProperWhole()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#getProperWhole()}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return numerator / denominator;
 *  */
    @Test
    public void testGetProperWhole_ThrowArithmeticException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -255);
        
        /* This test fails because method [org.apache.commons.lang.math.Fraction.getProperWhole] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.lang.math.Fraction.getProperWhole(Fraction.java:407) */
        fraction.getProperWhole();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.Fraction.divideBy
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method divideBy(org.apache.commons.lang.math.Fraction)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#divideBy(org.apache.commons.lang.math.Fraction)}
 * @utbot.executesCondition {@code (fraction == null): False}
 * @utbot.executesCondition {@code (fraction.numerator == 0): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: fraction.numerator == 0
 *  */
    @Test(expected = ArithmeticException.class)
    public void testDivideBy_ThrowArithmeticException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        
        fraction.divideBy(fraction);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#divideBy(org.apache.commons.lang.math.Fraction)}
 * @utbot.executesCondition {@code (fraction == null): False}
 * @utbot.executesCondition {@code (fraction.numerator == 0): False}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return multiplyBy(fraction.invert());
 *  */
    @Test(expected = ArithmeticException.class)
    public void testDivideBy_ThrowArithmeticException_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", Integer.MIN_VALUE);
        
        fraction.divideBy(fraction);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#divideBy(org.apache.commons.lang.math.Fraction)}
 * @utbot.executesCondition {@code (fraction == null): False}
 * @utbot.executesCondition {@code (fraction.numerator == 0): False}
 * @utbot.invokes {@link org.apache.commons.lang.math.Fraction#multiplyBy(org.apache.commons.lang.math.Fraction)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return multiplyBy(fraction.invert());
 *  */
    @Test(expected = ArithmeticException.class)
    public void testDivideBy_ThrowArithmeticException_2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", Integer.MIN_VALUE);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", 2);
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "denominator", -1);
        
        fraction.divideBy(fraction1);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#divideBy(org.apache.commons.lang.math.Fraction)}
 * @utbot.executesCondition {@code (fraction == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: fraction == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDivideBy_ThrowIllegalArgumentException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        
        fraction.divideBy(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method divideBy(org.apache.commons.lang.math.Fraction)
    
    @Test
    public void testDivideBy1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", 2);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "denominator", -4);
        
        Fraction actual = fraction.divideBy(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", -2);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 1);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivideBy2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -3);
        
        Fraction actual = fraction.divideBy(fraction);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 1);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivideBy3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", Integer.MIN_VALUE);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "denominator", 2);
        
        Fraction actual = fraction.divideBy(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", -1);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 1073741824);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivideBy4() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -806864902);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -2);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "denominator", 1);
        
        Fraction actual = fraction.divideBy(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", 403432451);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 1);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivideBy5() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        
        Fraction actual = fraction.divideBy(fraction);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 1);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivideBy6() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", -2);
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "denominator", -3);
        
        Fraction actual = fraction.divideBy(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 1);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivideBy7() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        
        Fraction actual = fraction.divideBy(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 1);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method divideBy(org.apache.commons.lang.math.Fraction)
    
    @Test(expected = ArithmeticException.class)
    public void testDivideBy8() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", 1073741824);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", 128);
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "denominator", -3);
        
        fraction.divideBy(fraction1);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testDivideBy9() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", Integer.MIN_VALUE);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", Integer.MIN_VALUE);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "denominator", 2);
        
        fraction.divideBy(fraction1);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testDivideBy10() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 1073741808);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", 1093084306);
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "denominator", 1024);
        
        fraction.divideBy(fraction1);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testDivideBy11() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -582484149);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", 791150593);
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "denominator", Integer.MIN_VALUE);
        
        fraction.divideBy(fraction1);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testDivideBy12() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 1610874877);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", -537133053);
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "denominator", -2050);
        
        fraction.divideBy(fraction1);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testDivideBy13() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -8);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", -2147483646);
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "denominator", -3);
        
        fraction.divideBy(fraction1);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testDivideBy14() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", Integer.MIN_VALUE);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", -2);
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "denominator", -3);
        
        fraction.divideBy(fraction1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.Fraction.multiplyBy
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method multiplyBy(org.apache.commons.lang.math.Fraction)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#multiplyBy(org.apache.commons.lang.math.Fraction)}
 * @utbot.executesCondition {@code (fraction == null): False}
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.executesCondition {@code (fraction.numerator == 0): False}
 * @utbot.invokes org.apache.commons.lang.math.Fraction#greatestCommonDivisor(int,int)
 * @utbot.invokes org.apache.commons.lang.math.Fraction#greatestCommonDivisor(int,int)
 * @utbot.invokes org.apache.commons.lang.math.Fraction#mulAndCheck(int,int)
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: mulAndCheck(numerator / d1, fraction.numerator / d2)
 *  */
    @Test(expected = ArithmeticException.class)
    public void testMultiplyBy_ThrowArithmeticException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", Integer.MIN_VALUE);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", -1);
        
        fraction.multiplyBy(fraction1);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#multiplyBy(org.apache.commons.lang.math.Fraction)}
 * @utbot.executesCondition {@code (fraction == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: fraction == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMultiplyBy_ThrowIllegalArgumentException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        
        fraction.multiplyBy(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.Fraction.subAndCheck
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method subAndCheck(int, int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#subAndCheck(int,int)}
 * @utbot.executesCondition {@code (s < Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (s > Integer.MAX_VALUE): False}
 * @utbot.returnsFrom {@code return (int) s;}
 *  */
    @Test
    public void testSubAndCheck_SLessOrEqualIntegerMAX_VALUE() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang.math.Fraction");
        Class intType = int.class;
        Method subAndCheckMethod = fractionClazz.getDeclaredMethod("subAndCheck", intType, intType);
        subAndCheckMethod.setAccessible(true);
        java.lang.Object[] subAndCheckMethodArguments = new java.lang.Object[2];
        subAndCheckMethodArguments[0] = 3;
        subAndCheckMethodArguments[1] = -252;
        int actual = ((Integer) subAndCheckMethod.invoke(null, subAndCheckMethodArguments));
        
        assertEquals(255, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method subAndCheck(int, int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#subAndCheck(int,int)}
 * @utbot.executesCondition {@code (s < Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (s > Integer.MAX_VALUE): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: s < Integer.MIN_VALUE || s > Integer.MAX_VALUE
 *  */
    @Test(expected = ArithmeticException.class)
    public void testSubAndCheck_ThrowArithmeticException() throws Throwable  {
        Class fractionClazz = Class.forName("org.apache.commons.lang.math.Fraction");
        Class intType = int.class;
        Method subAndCheckMethod = fractionClazz.getDeclaredMethod("subAndCheck", intType, intType);
        subAndCheckMethod.setAccessible(true);
        java.lang.Object[] subAndCheckMethodArguments = new java.lang.Object[2];
        subAndCheckMethodArguments[0] = 261718656;
        subAndCheckMethodArguments[1] = Integer.MIN_VALUE;
        try {
            subAndCheckMethod.invoke(null, subAndCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#subAndCheck(int,int)}
 * @utbot.executesCondition {@code (s < Integer.MIN_VALUE): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: s < Integer.MIN_VALUE || s > Integer.MAX_VALUE
 *  */
    @Test(expected = ArithmeticException.class)
    public void testSubAndCheck_ThrowArithmeticException_1() throws Throwable  {
        Class fractionClazz = Class.forName("org.apache.commons.lang.math.Fraction");
        Class intType = int.class;
        Method subAndCheckMethod = fractionClazz.getDeclaredMethod("subAndCheck", intType, intType);
        subAndCheckMethod.setAccessible(true);
        java.lang.Object[] subAndCheckMethodArguments = new java.lang.Object[2];
        subAndCheckMethodArguments[0] = -1879048191;
        subAndCheckMethodArguments[1] = 342654462;
        try {
            subAndCheckMethod.invoke(null, subAndCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.Fraction.mulPosAndCheck
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mulPosAndCheck(int, int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#mulPosAndCheck(int,int)}
 * @utbot.executesCondition {@code (m > Integer.MAX_VALUE): False}
 * @utbot.returnsFrom {@code return (int) m;}
 *  */
    @Test
    public void testMulPosAndCheck_MLessOrEqualIntegerMAX_VALUE() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang.math.Fraction");
        Class intType = int.class;
        Method mulPosAndCheckMethod = fractionClazz.getDeclaredMethod("mulPosAndCheck", intType, intType);
        mulPosAndCheckMethod.setAccessible(true);
        java.lang.Object[] mulPosAndCheckMethodArguments = new java.lang.Object[2];
        mulPosAndCheckMethodArguments[0] = 2113929222;
        mulPosAndCheckMethodArguments[1] = -1907935936;
        int actual = ((Integer) mulPosAndCheckMethod.invoke(null, mulPosAndCheckMethodArguments));
        
        assertEquals(-710197376, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method mulPosAndCheck(int, int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#mulPosAndCheck(int,int)}
 * @utbot.executesCondition {@code (m > Integer.MAX_VALUE): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: m > Integer.MAX_VALUE
 *  */
    @Test(expected = ArithmeticException.class)
    public void testMulPosAndCheck_ThrowArithmeticException() throws Throwable  {
        Class fractionClazz = Class.forName("org.apache.commons.lang.math.Fraction");
        Class intType = int.class;
        Method mulPosAndCheckMethod = fractionClazz.getDeclaredMethod("mulPosAndCheck", intType, intType);
        mulPosAndCheckMethod.setAccessible(true);
        java.lang.Object[] mulPosAndCheckMethodArguments = new java.lang.Object[2];
        mulPosAndCheckMethodArguments[0] = 302504781;
        mulPosAndCheckMethodArguments[1] = 1156589472;
        try {
            mulPosAndCheckMethod.invoke(null, mulPosAndCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.Fraction.addSub
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addSub(org.apache.commons.lang.math.Fraction, boolean)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#addSub(org.apache.commons.lang.math.Fraction,boolean)}
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.executesCondition {@code (fraction.numerator == 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAddSub_FractionNumeratorEqualsZero() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        
        Class fractionClazz = Class.forName("org.apache.commons.lang.math.Fraction");
        Class booleanType = boolean.class;
        Method addSubMethod = fractionClazz.getDeclaredMethod("addSub", fractionClazz, booleanType);
        addSubMethod.setAccessible(true);
        java.lang.Object[] addSubMethodArguments = new java.lang.Object[2];
        addSubMethodArguments[0] = fraction1;
        addSubMethodArguments[1] = false;
        Fraction actual = ((Fraction) addSubMethod.invoke(fraction, addSubMethodArguments));
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(fraction, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#addSub(org.apache.commons.lang.math.Fraction,boolean)}
 * @utbot.executesCondition {@code (numerator == 0): True}
 * @utbot.executesCondition {@code (isAdd): True}
 * @utbot.returnsFrom {@code return isAdd ? fraction : fraction.negate();}
 *  */
    @Test
    public void testAddSub_IsAdd() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        
        Class fractionClazz = Class.forName("org.apache.commons.lang.math.Fraction");
        Class booleanType = boolean.class;
        Method addSubMethod = fractionClazz.getDeclaredMethod("addSub", fractionClazz, booleanType);
        addSubMethod.setAccessible(true);
        java.lang.Object[] addSubMethodArguments = new java.lang.Object[2];
        addSubMethodArguments[0] = fraction;
        addSubMethodArguments[1] = true;
        Fraction actual = ((Fraction) addSubMethod.invoke(fraction, addSubMethodArguments));
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(fraction, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#addSub(org.apache.commons.lang.math.Fraction,boolean)}
 * @utbot.executesCondition {@code (numerator == 0): True}
 * @utbot.executesCondition {@code (isAdd): False}
 * @utbot.invokes {@link org.apache.commons.lang.math.Fraction#negate()}
 * @utbot.returnsFrom {@code return isAdd ? fraction : fraction.negate();}
 *  */
    @Test
    public void testAddSub_NotIsAdd() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        
        Class fractionClazz = Class.forName("org.apache.commons.lang.math.Fraction");
        Class booleanType = boolean.class;
        Method addSubMethod = fractionClazz.getDeclaredMethod("addSub", fractionClazz, booleanType);
        addSubMethod.setAccessible(true);
        java.lang.Object[] addSubMethodArguments = new java.lang.Object[2];
        addSubMethodArguments[0] = fraction;
        addSubMethodArguments[1] = false;
        Fraction actual = ((Fraction) addSubMethod.invoke(fraction, addSubMethodArguments));
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addSub(org.apache.commons.lang.math.Fraction, boolean)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#addSub(org.apache.commons.lang.math.Fraction,boolean)}
 * @utbot.executesCondition {@code (fraction == null): False}
 * @utbot.executesCondition {@code (numerator == 0): True}
 * @utbot.executesCondition {@code (isAdd): False}
 * @utbot.invokes {@link org.apache.commons.lang.math.Fraction#negate()}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: fraction.negate()
 *  */
    @Test(expected = ArithmeticException.class)
    public void testAddSub_ThrowArithmeticException() throws Throwable  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", Integer.MIN_VALUE);
        
        Class fractionClazz = Class.forName("org.apache.commons.lang.math.Fraction");
        Class booleanType = boolean.class;
        Method addSubMethod = fractionClazz.getDeclaredMethod("addSub", fractionClazz, booleanType);
        addSubMethod.setAccessible(true);
        java.lang.Object[] addSubMethodArguments = new java.lang.Object[2];
        addSubMethodArguments[0] = fraction1;
        addSubMethodArguments[1] = false;
        try {
            addSubMethod.invoke(fraction, addSubMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#addSub(org.apache.commons.lang.math.Fraction,boolean)}
 * @utbot.executesCondition {@code (fraction == null): False}
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.executesCondition {@code (fraction.numerator == 0): False}
 * @utbot.executesCondition {@code (d1 == 1): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: int uvp = mulAndCheck(numerator, fraction.denominator);
 *  */
    @Test(expected = ArithmeticException.class)
    public void testAddSub_ThrowArithmeticException_1() throws Throwable  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -763264000);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", -254);
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "denominator", -1483800576);
        
        Class fractionClazz = Class.forName("org.apache.commons.lang.math.Fraction");
        Class booleanType = boolean.class;
        Method addSubMethod = fractionClazz.getDeclaredMethod("addSub", fractionClazz, booleanType);
        addSubMethod.setAccessible(true);
        java.lang.Object[] addSubMethodArguments = new java.lang.Object[2];
        addSubMethodArguments[0] = fraction1;
        addSubMethodArguments[1] = false;
        try {
            addSubMethod.invoke(fraction, addSubMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#addSub(org.apache.commons.lang.math.Fraction,boolean)}
 * @utbot.executesCondition {@code (fraction == null): False}
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.executesCondition {@code (fraction.numerator == 0): False}
 * @utbot.executesCondition {@code (d1 == 1): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: int uvp = mulAndCheck(numerator, fraction.denominator);
 *  */
    @Test(expected = ArithmeticException.class)
    public void testAddSub_ThrowArithmeticException_2() throws Throwable  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 2);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", -252);
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "denominator", Integer.MIN_VALUE);
        
        Class fractionClazz = Class.forName("org.apache.commons.lang.math.Fraction");
        Class booleanType = boolean.class;
        Method addSubMethod = fractionClazz.getDeclaredMethod("addSub", fractionClazz, booleanType);
        addSubMethod.setAccessible(true);
        java.lang.Object[] addSubMethodArguments = new java.lang.Object[2];
        addSubMethodArguments[0] = fraction1;
        addSubMethodArguments[1] = false;
        try {
            addSubMethod.invoke(fraction, addSubMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#addSub(org.apache.commons.lang.math.Fraction,boolean)}
 * @utbot.executesCondition {@code (fraction == null): False}
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.executesCondition {@code (fraction.numerator == 0): False}
 * @utbot.executesCondition {@code (d1 == 1): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: int uvp = mulAndCheck(numerator, fraction.denominator);
 *  */
    @Test(expected = ArithmeticException.class)
    public void testAddSub_ThrowArithmeticException_3() throws Throwable  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 11430141);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", 16);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", 134217728);
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "denominator", Integer.MIN_VALUE);
        
        Class fractionClazz = Class.forName("org.apache.commons.lang.math.Fraction");
        Class booleanType = boolean.class;
        Method addSubMethod = fractionClazz.getDeclaredMethod("addSub", fractionClazz, booleanType);
        addSubMethod.setAccessible(true);
        java.lang.Object[] addSubMethodArguments = new java.lang.Object[2];
        addSubMethodArguments[0] = fraction1;
        addSubMethodArguments[1] = false;
        try {
            addSubMethod.invoke(fraction, addSubMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#addSub(org.apache.commons.lang.math.Fraction,boolean)}
 * @utbot.executesCondition {@code (fraction == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: fraction == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddSub_ThrowIllegalArgumentException() throws Throwable  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        
        Class fractionClazz = Class.forName("org.apache.commons.lang.math.Fraction");
        Class booleanType = boolean.class;
        Method addSubMethod = fractionClazz.getDeclaredMethod("addSub", fractionClazz, booleanType);
        addSubMethod.setAccessible(true);
        java.lang.Object[] addSubMethodArguments = new java.lang.Object[2];
        addSubMethodArguments[0] = ((Object) null);
        addSubMethodArguments[1] = false;
        try {
            addSubMethod.invoke(fraction, addSubMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.Fraction.addAndCheck
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addAndCheck(int, int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#addAndCheck(int,int)}
 * @utbot.executesCondition {@code (s < Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (s > Integer.MAX_VALUE): False}
 * @utbot.returnsFrom {@code return (int) s;}
 *  */
    @Test
    public void testAddAndCheck_SLessOrEqualIntegerMAX_VALUE() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang.math.Fraction");
        Class intType = int.class;
        Method addAndCheckMethod = fractionClazz.getDeclaredMethod("addAndCheck", intType, intType);
        addAndCheckMethod.setAccessible(true);
        java.lang.Object[] addAndCheckMethodArguments = new java.lang.Object[2];
        addAndCheckMethodArguments[0] = 4;
        addAndCheckMethodArguments[1] = -128;
        int actual = ((Integer) addAndCheckMethod.invoke(null, addAndCheckMethodArguments));
        
        assertEquals(-124, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addAndCheck(int, int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#addAndCheck(int,int)}
 * @utbot.executesCondition {@code (s < Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (s > Integer.MAX_VALUE): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: s < Integer.MIN_VALUE || s > Integer.MAX_VALUE
 *  */
    @Test(expected = ArithmeticException.class)
    public void testAddAndCheck_ThrowArithmeticException() throws Throwable  {
        Class fractionClazz = Class.forName("org.apache.commons.lang.math.Fraction");
        Class intType = int.class;
        Method addAndCheckMethod = fractionClazz.getDeclaredMethod("addAndCheck", intType, intType);
        addAndCheckMethod.setAccessible(true);
        java.lang.Object[] addAndCheckMethodArguments = new java.lang.Object[2];
        addAndCheckMethodArguments[0] = 1054867454;
        addAndCheckMethodArguments[1] = 1092616194;
        try {
            addAndCheckMethod.invoke(null, addAndCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#addAndCheck(int,int)}
 * @utbot.executesCondition {@code (s < Integer.MIN_VALUE): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: s < Integer.MIN_VALUE || s > Integer.MAX_VALUE
 *  */
    @Test(expected = ArithmeticException.class)
    public void testAddAndCheck_ThrowArithmeticException_1() throws Throwable  {
        Class fractionClazz = Class.forName("org.apache.commons.lang.math.Fraction");
        Class intType = int.class;
        Method addAndCheckMethod = fractionClazz.getDeclaredMethod("addAndCheck", intType, intType);
        addAndCheckMethod.setAccessible(true);
        java.lang.Object[] addAndCheckMethodArguments = new java.lang.Object[2];
        addAndCheckMethodArguments[0] = -2147219327;
        addAndCheckMethodArguments[1] = -2147483520;
        try {
            addAndCheckMethod.invoke(null, addAndCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.Fraction.mulAndCheck
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mulAndCheck(int, int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#mulAndCheck(int,int)}
 * @utbot.executesCondition {@code (m < Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (m > Integer.MAX_VALUE): False}
 * @utbot.returnsFrom {@code return (int) m;}
 *  */
    @Test
    public void testMulAndCheck_MLessOrEqualIntegerMAX_VALUE() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang.math.Fraction");
        Class intType = int.class;
        Method mulAndCheckMethod = fractionClazz.getDeclaredMethod("mulAndCheck", intType, intType);
        mulAndCheckMethod.setAccessible(true);
        java.lang.Object[] mulAndCheckMethodArguments = new java.lang.Object[2];
        mulAndCheckMethodArguments[0] = 36;
        mulAndCheckMethodArguments[1] = -105;
        int actual = ((Integer) mulAndCheckMethod.invoke(null, mulAndCheckMethodArguments));
        
        assertEquals(-3780, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method mulAndCheck(int, int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#mulAndCheck(int,int)}
 * @utbot.executesCondition {@code (m < Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (m > Integer.MAX_VALUE): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: m < Integer.MIN_VALUE || m > Integer.MAX_VALUE
 *  */
    @Test(expected = ArithmeticException.class)
    public void testMulAndCheck_ThrowArithmeticException() throws Throwable  {
        Class fractionClazz = Class.forName("org.apache.commons.lang.math.Fraction");
        Class intType = int.class;
        Method mulAndCheckMethod = fractionClazz.getDeclaredMethod("mulAndCheck", intType, intType);
        mulAndCheckMethod.setAccessible(true);
        java.lang.Object[] mulAndCheckMethodArguments = new java.lang.Object[2];
        mulAndCheckMethodArguments[0] = -96;
        mulAndCheckMethodArguments[1] = -536871168;
        try {
            mulAndCheckMethod.invoke(null, mulAndCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#mulAndCheck(int,int)}
 * @utbot.executesCondition {@code (m < Integer.MIN_VALUE): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: m < Integer.MIN_VALUE || m > Integer.MAX_VALUE
 *  */
    @Test(expected = ArithmeticException.class)
    public void testMulAndCheck_ThrowArithmeticException_1() throws Throwable  {
        Class fractionClazz = Class.forName("org.apache.commons.lang.math.Fraction");
        Class intType = int.class;
        Method mulAndCheckMethod = fractionClazz.getDeclaredMethod("mulAndCheck", intType, intType);
        mulAndCheckMethod.setAccessible(true);
        java.lang.Object[] mulAndCheckMethodArguments = new java.lang.Object[2];
        mulAndCheckMethodArguments[0] = -1862595568;
        mulAndCheckMethodArguments[1] = 2055246848;
        try {
            mulAndCheckMethod.invoke(null, mulAndCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.Fraction.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add(org.apache.commons.lang.math.Fraction)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#add(org.apache.commons.lang.math.Fraction)}
 * @utbot.returnsFrom {@code return addSub(fraction, true);}
 *  */
    @Test
    public void testAdd_ReturnAddSub() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        
        Fraction actual = fraction.add(fraction1);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(fraction1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#add(org.apache.commons.lang.math.Fraction)}
 * @utbot.returnsFrom {@code return addSub(fraction, true);}
 *  */
    @Test
    public void testAdd_ReturnAddSub_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -255);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        
        Fraction actual = fraction.add(fraction1);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(fraction, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(org.apache.commons.lang.math.Fraction)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#add(org.apache.commons.lang.math.Fraction)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return addSub(fraction, true);
 *  */
    @Test(expected = ArithmeticException.class)
    public void testAdd_ThrowArithmeticException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -268435614);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", -256);
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "denominator", 24246208);
        
        fraction.add(fraction1);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#add(org.apache.commons.lang.math.Fraction)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return addSub(fraction, true);
 *  */
    @Test(expected = ArithmeticException.class)
    public void testAdd_ThrowArithmeticException_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 353714206);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", -256);
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "denominator", 1629637528);
        
        fraction.add(fraction1);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#add(org.apache.commons.lang.math.Fraction)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return addSub(fraction, true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAdd_ThrowIllegalArgumentException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        
        fraction.add(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.Fraction.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_Obj() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        
        boolean actual = fraction.equals(fraction);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (obj instanceof Fraction == false): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEquals_ObjInstanceOfFractionEqualsFalse() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        
        boolean actual = fraction.equals(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method equals(java.lang.Object)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (obj): False},
    ///     {@code (obj instanceof Fraction == false): False}
    /// invoke:
    ///     {@link org.apache.commons.lang.math.Fraction#getNumerator()} twice
    /// return from: {@code return (getNumerator() == other.getNumerator() && getDenominator() == other.getDenominator());}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return (getNumerator() == other.getNumerator() && getDenominator() == other.getDenominator());}
 *  */
    @Test
    public void testEquals_GetNumeratorNotEqualsOtherGetNumeratorAndGetDenominatorNotEqualsOtherGetDenominator() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        
        boolean actual = fraction.equals(fraction1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (getDenominator() == other.getDenominator()): False}
 * @utbot.returnsFrom {@code return (getNumerator() == other.getNumerator() && getDenominator() == other.getDenominator());}
 *  */
    @Test
    public void testEquals_GetDenominatorNotEqualsOtherGetDenominator() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -255);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", -255);
        
        boolean actual = fraction.equals(fraction1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (getDenominator() == other.getDenominator()): True}
 * @utbot.returnsFrom {@code return (getNumerator() == other.getNumerator() && getDenominator() == other.getDenominator());}
 *  */
    @Test
    public void testEquals_GetDenominatorEqualsOtherGetDenominator() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -255);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -255);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", -255);
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "denominator", -255);
        
        boolean actual = fraction.equals(fraction1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.Fraction.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#toString()}
 * @utbot.executesCondition {@code (toString == null): False}
 * @utbot.returnsFrom {@code return toString;}
 *  */
    @Test
    public void testToString_ToStringNotEqualsNull() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        String toString = "";
        setField(fraction, "org.apache.commons.lang.math.Fraction", "toString", toString);
        
        String actual = fraction.toString();
        
        assertEquals(toString, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#toString()}
 * @utbot.executesCondition {@code (toString == null): True}
 * @utbot.invokes {@link org.apache.commons.lang.math.Fraction#getNumerator()}
 * @utbot.invokes {@link java.lang.StringBuffer#append(int)}
 * @utbot.invokes {@link java.lang.StringBuffer#append(char)}
 * @utbot.invokes {@link org.apache.commons.lang.math.Fraction#getDenominator()}
 * @utbot.invokes {@link java.lang.StringBuffer#append(int)}
 * @utbot.invokes {@link java.lang.StringBuffer#toString()}
 * @utbot.returnsFrom {@code return toString;}
 *  */
    @Test
    public void testToString_ToStringEqualsNull() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", Integer.MIN_VALUE);
        
        String actual = fraction.toString();
        
        String expected = "-2147483648/0";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.Fraction.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#hashCode()}
 * @utbot.executesCondition {@code (hashCode == 0): False}
 * @utbot.returnsFrom {@code return hashCode;}
 *  */
    @Test
    public void testHashCode_HashCodeNotEqualsZero() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "hashCode", -255);
        
        int actual = fraction.hashCode();
        
        assertEquals(-255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#hashCode()}
 * @utbot.executesCondition {@code (hashCode == 0): True}
 * @utbot.invokes {@link org.apache.commons.lang.math.Fraction#getNumerator()}
 * @utbot.invokes {@link org.apache.commons.lang.math.Fraction#getDenominator()}
 * @utbot.returnsFrom {@code return hashCode;}
 *  */
    @Test
    public void testHashCode_HashCodeEqualsZero() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -255);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -255);
        
        int actual = fraction.hashCode();
        
        assertEquals(13583, actual);
        
        int finalFractionHashCode = ((Integer) getFieldValue(fraction, "org.apache.commons.lang.math.Fraction", "hashCode"));
        
        assertEquals(13583, finalFractionHashCode);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.Fraction.abs
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method abs()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#abs()}
 * @utbot.executesCondition {@code (numerator >= 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAbs_NumeratorGreaterOrEqualZero() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        
        Fraction actual = fraction.abs();
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(fraction, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#abs()}
 * @utbot.executesCondition {@code (numerator >= 0): False}
 * @utbot.invokes {@link org.apache.commons.lang.math.Fraction#negate()}
 * @utbot.returnsFrom {@code return negate();}
 *  */
    @Test
    public void testAbs_NumeratorLessThanZero() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -1);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -255);
        
        Fraction actual = fraction.abs();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", -255);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method abs()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#abs()}
 * @utbot.executesCondition {@code (numerator >= 0): False}
 * @utbot.invokes {@link org.apache.commons.lang.math.Fraction#negate()}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return negate();
 *  */
    @Test(expected = ArithmeticException.class)
    public void testAbs_ThrowArithmeticException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", Integer.MIN_VALUE);
        
        fraction.abs();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.Fraction.pow
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method pow(int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#pow(int)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testPow_Return() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        
        Fraction actual = fraction.pow(1);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(fraction, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#pow(int)}
 * @utbot.executesCondition {@code (power == 1): False}
 * @utbot.executesCondition {@code (power == 0): False}
 * @utbot.executesCondition {@code (power < 0): True}
 * @utbot.executesCondition {@code (power == Integer.MIN_VALUE): False}
 * @utbot.triggersRecursion pow, where the test return from: {@code return this;}
 * @utbot.returnsFrom {@code return this.invert().pow(-power);}
 *  */
    @Test
    public void testPow_PowerNotEqualsIntegerMIN_VALUE() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -1);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -3);
        
        Fraction actual = fraction.pow(-1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", 3);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 1);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#pow(int)}
 * @utbot.executesCondition {@code (power == 1): False}
 * @utbot.executesCondition {@code (power == 0): False}
 * @utbot.executesCondition {@code (power < 0): True}
 * @utbot.executesCondition {@code (power == Integer.MIN_VALUE): False}
 * @utbot.triggersRecursion pow, where the test return from: {@code return this;}
 * @utbot.returnsFrom {@code return this.invert().pow(-power);}
 *  */
    @Test
    public void testPow_PowerNotEqualsIntegerMIN_VALUE_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        
        Fraction actual = fraction.pow(-1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 1);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method pow(int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#pow(int)}
 * @utbot.executesCondition {@code (power == Integer.MIN_VALUE): False}
 * @utbot.invokes {@link org.apache.commons.lang.math.Fraction#invert()}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return this.invert().pow(-power);
 *  */
    @Test(expected = ArithmeticException.class)
    public void testPow_ThrowArithmeticException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        
        fraction.pow(-1);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#pow(int)}
 * @utbot.executesCondition {@code (power == Integer.MIN_VALUE): True}
 * @utbot.invokes {@link org.apache.commons.lang.math.Fraction#invert()}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return this.invert().pow(2).pow(-(power / 2));
 *  */
    @Test(expected = ArithmeticException.class)
    public void testPow_ThrowArithmeticException_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", Integer.MIN_VALUE);
        
        fraction.pow(Integer.MIN_VALUE);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method pow(int)
    
    @Test
    public void testPow1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -2);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -1);
        
        Fraction actual = fraction.pow(-3);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 8);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -2);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -3);
        
        Fraction actual = fraction.pow(-3);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", 27);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 8);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -2);
        
        Fraction actual = fraction.pow(-3);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 1);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow4() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 2);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -3);
        
        Fraction actual = fraction.pow(-3);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", -27);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 8);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow5() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -3);
        
        Fraction actual = fraction.pow(-3);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", -27);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 1);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow6() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -1);
        
        Fraction actual = fraction.pow(-3);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", -1);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 1);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow7() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        
        Fraction actual = fraction.pow(-3);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 1);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow8() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -519159046);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", 2076636184);
        
        Fraction actual = fraction.pow(2);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 16);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow9() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -805771388);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -2014428470);
        
        Fraction actual = fraction.pow(2);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", 4);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 25);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow10() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 1258934670);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -251786934);
        
        Fraction actual = fraction.pow(8);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", 390625);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 1);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow11() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -307605342);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", 307605342);
        
        Fraction actual = fraction.pow(Integer.MIN_VALUE);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 1);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow12() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -2);
        
        Fraction actual = fraction.pow(Integer.MIN_VALUE);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 1);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow13() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        
        Fraction actual = fraction.pow(Integer.MIN_VALUE);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 1);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow14() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        
        Fraction actual = fraction.pow(2);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 1);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method pow(int)
    
    @Test(expected = ArithmeticException.class)
    public void testPow15() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -2147483646);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", 2013265916);
        
        fraction.pow(Integer.MIN_VALUE);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testPow16() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -652198743);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", 1304397486);
        
        fraction.pow(Integer.MIN_VALUE);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testPow17() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -2);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", 1);
        
        fraction.pow(Integer.MIN_VALUE);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testPow18() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -2);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -3);
        
        fraction.pow(Integer.MIN_VALUE);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testPow19() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -464963806);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", 1394891418);
        
        fraction.pow(2048);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testPow20() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -2);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", 2147483645);
        
        fraction.pow(2);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testPow21() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -2019547707);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", 673182569);
        
        fraction.pow(512);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testPow22() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 800587194);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -533724796);
        
        fraction.pow(64);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testPow23() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        
        fraction.pow(2);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testPow24() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -2);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", 2147483645);
        
        fraction.pow(-3);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testPow25() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 2);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", Integer.MIN_VALUE);
        
        fraction.pow(2);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testPow26() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -3);
        
        fraction.pow(2);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.Fraction.compareTo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method compareTo(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#compareTo(java.lang.Object)}
 * @utbot.executesCondition {@code (other): True}
 *  */
    @Test
    public void testCompareTo_Other() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        
        int actual = fraction.compareTo(fraction);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#compareTo(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (numerator == other.numerator): True}
 * @utbot.executesCondition {@code (denominator == other.denominator): True}
 *  */
    @Test
    public void testCompareTo_DenominatorEqualsOtherDenominator() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -255);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -255);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", -255);
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "denominator", -255);
        
        int actual = fraction.compareTo(fraction1);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#compareTo(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (numerator == other.numerator): False}
 * @utbot.executesCondition {@code (first == second): False}
 * @utbot.executesCondition {@code (first < second): True}
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void testCompareTo_FirstLessThanSecond() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 66);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", 1219790912);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", 996397141);
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "denominator", -2144274944);
        
        int actual = fraction.compareTo(fraction1);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#compareTo(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (numerator == other.numerator): False}
 * @utbot.executesCondition {@code (first == second): False}
 * @utbot.executesCondition {@code (first < second): False}
 * @utbot.returnsFrom {@code return 1;}
 *  */
    @Test
    public void testCompareTo_FirstGreaterOrEqualSecond() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -246);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -1886814165);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", 35684821);
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "denominator", -864220724);
        
        int actual = fraction.compareTo(fraction1);
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#compareTo(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (numerator == other.numerator): True}
 * @utbot.executesCondition {@code (denominator == other.denominator): False}
 * @utbot.executesCondition {@code (first == second): True}
 *  */
    @Test
    public void testCompareTo_FirstEqualsSecond() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "denominator", 67108864);
        
        int actual = fraction.compareTo(fraction1);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method compareTo(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#compareTo(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Fraction other = (Fraction) object;
 *  */
    @Test
    public void testCompareTo_ThrowClassCastException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.lang.math.Fraction.compareTo] produces [java.lang.ClassCastException: class [B cannot be cast to class org.apache.commons.lang.math.Fraction ([B is in module java.base of loader 'bootstrap'; org.apache.commons.lang.math.Fraction is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @302b9f3c)]
            org.apache.commons.lang.math.Fraction.compareTo(Fraction.java:867) */
        fraction.compareTo(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#compareTo(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: numerator == other.numerator && denominator == other.denominator
 *  */
    @Test
    public void testCompareTo_ThrowNullPointerException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -255);
        
        /* This test fails because method [org.apache.commons.lang.math.Fraction.compareTo] produces [java.lang.NullPointerException]
            org.apache.commons.lang.math.Fraction.compareTo(Fraction.java:871) */
        fraction.compareTo(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.Fraction.intValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method intValue()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#intValue()}
 * @utbot.returnsFrom {@code return numerator / denominator;}
 *  */
    @Test
    public void testIntValue_ReturnNumeratorDivideDenominator() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -255);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -255);
        
        int actual = fraction.intValue();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method intValue()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#intValue()}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return numerator / denominator;
 *  */
    @Test
    public void testIntValue_ThrowArithmeticException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -255);
        
        /* This test fails because method [org.apache.commons.lang.math.Fraction.intValue] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.lang.math.Fraction.intValue(Fraction.java:420) */
        fraction.intValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.Fraction.longValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method longValue()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#longValue()}
 * @utbot.returnsFrom {@code return (long) numerator / denominator;}
 *  */
    @Test
    public void testLongValue_ReturnNumeratorDivideDenominator() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -255);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -255);
        
        long actual = fraction.longValue();
        
        assertEquals(1L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method longValue()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#longValue()}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return (long) numerator / denominator;
 *  */
    @Test
    public void testLongValue_ThrowArithmeticException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -255);
        
        /* This test fails because method [org.apache.commons.lang.math.Fraction.longValue] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.lang.math.Fraction.longValue(Fraction.java:430) */
        fraction.longValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.Fraction.floatValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method floatValue()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#floatValue()}
 * @utbot.returnsFrom {@code return ((float) numerator) / ((float) denominator);}
 *  */
    @Test
    public void testFloatValue_ReturnNumeratorDivideDenominator() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -255);
        
        float actual = fraction.floatValue();
        
        org.junit.Assert.assertEquals(-0.003921569f, actual, 1.0E-6f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.Fraction.doubleValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method doubleValue()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#doubleValue()}
 * @utbot.returnsFrom {@code return ((double) numerator) / ((double) denominator);}
 *  */
    @Test
    public void testDoubleValue_ReturnNumeratorDivideDenominator() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -255);
        
        double actual = fraction.doubleValue();
        
        org.junit.Assert.assertEquals(-0.00392156862745098, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.Fraction.reduce
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reduce()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#reduce()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReduce_Return() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -1);
        
        Fraction actual = fraction.reduce();
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(fraction, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#reduce()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReduce_Return_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -2);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -1);
        
        Fraction actual = fraction.reduce();
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(fraction, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#reduce()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReduce_Return_2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -2);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -3);
        
        Fraction actual = fraction.reduce();
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(fraction, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#reduce()}
 * @utbot.invokes {@link org.apache.commons.lang.math.Fraction#getFraction(int,int)}
 * @utbot.returnsFrom {@code return Fraction.getFraction(numerator / gcd, denominator / gcd);}
 *  */
    @Test
    public void testReduce_FractionGetFraction() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -162);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", 162);
        
        Fraction actual = fraction.reduce();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", -1);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 1);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#reduce()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReduce_Return_3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -2);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", 5);
        
        Fraction actual = fraction.reduce();
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(fraction, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method reduce()
    
    @Test
    public void testReduce1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 2063563504);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -2139028848);
        
        Fraction actual = fraction.reduce();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", -128972719);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 133689303);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testReduce2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -1228865472);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -2147352608);
        
        Fraction actual = fraction.reduce();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", 38402046);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 67104769);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testReduce3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -1073741829);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", 1073741821);
        
        Fraction actual = fraction.reduce();
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(fraction, actual);
    }
    
    @Test
    public void testReduce4() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -562282503);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", 562020357);
        
        Fraction actual = fraction.reduce();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", -187427501);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 187340119);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testReduce5() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -3);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -4);
        
        Fraction actual = fraction.reduce();
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(fraction, actual);
    }
    
    @Test
    public void testReduce6() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -790531);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -3162124);
        
        Fraction actual = fraction.reduce();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 4);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testReduce7() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -2147221504);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", 115064560);
        
        Fraction actual = fraction.reduce();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", -134201344);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 7191535);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.Fraction.negate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method negate()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#negate()}
 * @utbot.executesCondition {@code (numerator == Integer.MIN_VALUE): False}
 * @utbot.returnsFrom {@code return new Fraction(-numerator, denominator);}
 *  */
    @Test
    public void testNegate_NumeratorNotEqualsIntegerMIN_VALUE() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -2);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -255);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", 2);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", -255);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method negate()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#negate()}
 * @utbot.executesCondition {@code (numerator == Integer.MIN_VALUE): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: numerator == Integer.MIN_VALUE
 *  */
    @Test(expected = ArithmeticException.class)
    public void testNegate_ThrowArithmeticException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", Integer.MIN_VALUE);
        
        fraction.negate();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.Fraction.subtract
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method subtract(org.apache.commons.lang.math.Fraction)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#subtract(org.apache.commons.lang.math.Fraction)}
 * @utbot.returnsFrom {@code return addSub(fraction, false);}
 *  */
    @Test
    public void testSubtract_ReturnAddSub() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -255);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        
        Fraction actual = fraction.subtract(fraction1);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(fraction, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#subtract(org.apache.commons.lang.math.Fraction)}
 * @utbot.returnsFrom {@code return addSub(fraction, false);}
 *  */
    @Test
    public void testSubtract_ReturnAddSub_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method subtract(org.apache.commons.lang.math.Fraction)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#subtract(org.apache.commons.lang.math.Fraction)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return addSub(fraction, false);
 *  */
    @Test(expected = ArithmeticException.class)
    public void testSubtract_ThrowArithmeticException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", Integer.MIN_VALUE);
        
        fraction.subtract(fraction1);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#subtract(org.apache.commons.lang.math.Fraction)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return addSub(fraction, false);
 *  */
    @Test(expected = ArithmeticException.class)
    public void testSubtract_ThrowArithmeticException_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -134217856);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", -254);
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "denominator", -1342174968);
        
        fraction.subtract(fraction1);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#subtract(org.apache.commons.lang.math.Fraction)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return addSub(fraction, false);
 *  */
    @Test(expected = ArithmeticException.class)
    public void testSubtract_ThrowArithmeticException_2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -1073741816);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", 1024);
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "denominator", 797049089);
        
        fraction.subtract(fraction1);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#subtract(org.apache.commons.lang.math.Fraction)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return addSub(fraction, false);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSubtract_ThrowIllegalArgumentException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        
        fraction.subtract(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method subtract(org.apache.commons.lang.math.Fraction)
    
    @Test
    public void testSubtract1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -4);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", 8192);
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "denominator", -2);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", 16383);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 4);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -3);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "denominator", -4);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", -1);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 12);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -2);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "denominator", -2);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 1);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract4() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -16);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -1073735678);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", 1048576);
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "denominator", 1073735678);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", 524280);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", -536867839);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract5() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -3);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "denominator", -1);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", 2);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 3);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract6() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        
        Fraction actual = fraction.subtract(fraction);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method subtract(org.apache.commons.lang.math.Fraction)
    
    @Test(expected = ArithmeticException.class)
    public void testSubtract7() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", Integer.MIN_VALUE);
        
        fraction.subtract(fraction);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testSubtract8() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 2);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -1602224150);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", 524288);
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "denominator", 1866465313);
        
        fraction.subtract(fraction1);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testSubtract9() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -1073741840);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -1073217539);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "denominator", 2146435078);
        
        fraction.subtract(fraction1);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testSubtract10() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 4194304);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -1606418434);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", 16);
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "denominator", -532676610);
        
        fraction.subtract(fraction1);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testSubtract11() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -2147483646);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "denominator", -4);
        
        fraction.subtract(fraction1);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testSubtract12() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -1342177283);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", 1048576);
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "denominator", -268435433);
        
        fraction.subtract(fraction1);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testSubtract13() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -1860698106);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "denominator", 393478141);
        
        fraction.subtract(fraction1);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testSubtract14() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -1993336797);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", 2);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "numerator", 16);
        setField(fraction1, "org.apache.commons.lang.math.Fraction", "denominator", Integer.MIN_VALUE);
        
        fraction.subtract(fraction1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.Fraction.getReducedFraction
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getReducedFraction(int, int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#getReducedFraction(int,int)}
 * @utbot.executesCondition {@code (denominator == Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (denominator < 0): True}
 * @utbot.executesCondition {@code (numerator == Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (denominator == Integer.MIN_VALUE): False}
 * @utbot.returnsFrom {@code return new Fraction(numerator, denominator);}
 *  */
    @Test
    public void testGetReducedFraction_DenominatorNotEqualsIntegerMIN_VALUE() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(-1, -1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 1);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#getReducedFraction(int,int)}
 * @utbot.executesCondition {@code (denominator == Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (denominator < 0): False}
 * @utbot.returnsFrom {@code return new Fraction(numerator, denominator);}
 *  */
    @Test
    public void testGetReducedFraction_DenominatorGreaterOrEqualZero() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(-1, 1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", -1);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 1);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#getReducedFraction(int,int)}
 * @utbot.executesCondition {@code (denominator == Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (denominator < 0): False}
 * @utbot.returnsFrom {@code return new Fraction(numerator, denominator);}
 *  */
    @Test
    public void testGetReducedFraction_DenominatorGreaterOrEqualZero_1() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(-255, 1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", -255);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 1);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#getReducedFraction(int,int)}
 * @utbot.executesCondition {@code (denominator == Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (denominator < 0): False}
 * @utbot.returnsFrom {@code return new Fraction(numerator, denominator);}
 *  */
    @Test
    public void testGetReducedFraction_DenominatorGreaterOrEqualZero_2() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(-12, 3);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", -4);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 1);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#getReducedFraction(int,int)}
 * @utbot.executesCondition {@code (denominator == Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (denominator < 0): True}
 * @utbot.executesCondition {@code (numerator == Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (denominator == Integer.MIN_VALUE): False}
 * @utbot.returnsFrom {@code return new Fraction(numerator, denominator);}
 *  */
    @Test
    public void testGetReducedFraction_DenominatorNotEqualsIntegerMIN_VALUE_1() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(149, -149);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", -1);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 1);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#getReducedFraction(int,int)}
 * @utbot.executesCondition {@code (denominator == Integer.MIN_VALUE): True}
 * @utbot.executesCondition {@code ((numerator & 1) == 0): True}
 * @utbot.executesCondition {@code (denominator < 0): True}
 * @utbot.executesCondition {@code (numerator == Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (denominator == Integer.MIN_VALUE): False}
 * @utbot.returnsFrom {@code return new Fraction(numerator, denominator);}
 *  */
    @Test
    public void testGetReducedFraction_NumeratorBitwiseAnd1EqualsZero() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(2, Integer.MIN_VALUE);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", -1);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 1073741824);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getReducedFraction(int, int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#getReducedFraction(int,int)}
 * @utbot.executesCondition {@code (denominator == 0): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: denominator == 0
 *  */
    @Test(expected = ArithmeticException.class)
    public void testGetReducedFraction_ThrowArithmeticException() {
        Fraction.getReducedFraction(1, 0);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#getReducedFraction(int,int)}
 * @utbot.executesCondition {@code (denominator == 0): False}
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.executesCondition {@code (denominator == Integer.MIN_VALUE): True}
 * @utbot.executesCondition {@code ((numerator & 1) == 0): False}
 * @utbot.executesCondition {@code (denominator < 0): True}
 * @utbot.executesCondition {@code (numerator == Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (denominator == Integer.MIN_VALUE): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: numerator == Integer.MIN_VALUE || denominator == Integer.MIN_VALUE
 *  */
    @Test(expected = ArithmeticException.class)
    public void testGetReducedFraction_ThrowArithmeticException_1() {
        Fraction.getReducedFraction(1, Integer.MIN_VALUE);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#getReducedFraction(int,int)}
 * @utbot.executesCondition {@code (denominator == 0): False}
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.executesCondition {@code (denominator == Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (denominator < 0): True}
 * @utbot.executesCondition {@code (numerator == Integer.MIN_VALUE): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: numerator == Integer.MIN_VALUE || denominator == Integer.MIN_VALUE
 *  */
    @Test(expected = ArithmeticException.class)
    public void testGetReducedFraction_ThrowArithmeticException_2() {
        Fraction.getReducedFraction(Integer.MIN_VALUE, -1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getReducedFraction(int, int)
    
    @Test
    public void testGetReducedFraction1() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(1088552430, 1088421358);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", 544276215);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 544210679);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetReducedFraction2() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(-2, -1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", 2);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 1);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetReducedFraction3() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(-8, -2147483646);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", 4);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 1073741823);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetReducedFraction4() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(2147483642, Integer.MIN_VALUE);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", -1073741821);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 1073741824);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetReducedFraction5() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(-33554428, Integer.MIN_VALUE);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", 8388607);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 536870912);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetReducedFraction6() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(0, 1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 1);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.Fraction.toProperString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toProperString()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#toProperString()}
 * @utbot.executesCondition {@code (toProperString == null): False}
 * @utbot.returnsFrom {@code return toProperString;}
 *  */
    @Test
    public void testToProperString_ToProperStringNotEqualsNull() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        String toProperString = "";
        setField(fraction, "org.apache.commons.lang.math.Fraction", "toProperString", toProperString);
        
        String actual = fraction.toProperString();
        
        assertEquals(toProperString, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#toProperString()}
 * @utbot.executesCondition {@code (toProperString == null): True}
 * @utbot.executesCondition {@code (numerator == 0): True}
 * @utbot.returnsFrom {@code return toProperString;}
 *  */
    @Test
    public void testToProperString_NumeratorEqualsZero() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        
        String actual = fraction.toProperString();
        
        String expected = "0";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#toProperString()}
 * @utbot.executesCondition {@code (toProperString == null): True}
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.executesCondition {@code (numerator == denominator): False}
 * @utbot.executesCondition {@code (numerator == -1 * denominator): True}
 * @utbot.returnsFrom {@code return toProperString;}
 *  */
    @Test
    public void testToProperString_NumeratorEqualsNegative1MultiplyDenominator() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 3);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -3);
        
        String actual = fraction.toProperString();
        
        String expected = "-1";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#toProperString()}
 * @utbot.executesCondition {@code (toProperString == null): True}
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.executesCondition {@code (numerator == denominator): True}
 * @utbot.returnsFrom {@code return toProperString;}
 *  */
    @Test
    public void testToProperString_NumeratorEqualsDenominator() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -255);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -255);
        
        String actual = fraction.toProperString();
        
        String expected = "1";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#toProperString()}
 * @utbot.executesCondition {@code (toProperString == null): True}
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.executesCondition {@code (numerator == denominator): False}
 * @utbot.executesCondition {@code (numerator == -1 * denominator): False}
 * @utbot.executesCondition {@code (numerator > 0): False}
 * @utbot.executesCondition {@code (numerator > 0): True}
 * @utbot.executesCondition {@code (properNumerator == 0): True}
 * @utbot.invokes {@link org.apache.commons.lang.math.Fraction#getProperNumerator()}
 * @utbot.invokes {@link org.apache.commons.lang.math.Fraction#getProperWhole()}
 * @utbot.invokes {@link java.lang.Integer#toString(int)}
 * @utbot.returnsFrom {@code return toProperString;}
 *  */
    @Test
    public void testToProperString_ProperNumeratorEqualsZero() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", Integer.MIN_VALUE);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", 1);
        
        String actual = fraction.toProperString();
        
        String expected = "-2147483648";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toProperString()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#toProperString()}
 * @utbot.executesCondition {@code (numerator > 0): False}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: int properNumerator = getProperNumerator();
 *  */
    @Test
    public void testToProperString_ThrowArithmeticException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -1);
        
        /* This test fails because method [org.apache.commons.lang.math.Fraction.toProperString] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.lang.math.Fraction.getProperNumerator(Fraction.java:392)
            org.apache.commons.lang.math.Fraction.toProperString(Fraction.java:926) */
        fraction.toProperString();
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#toProperString()}
 * @utbot.executesCondition {@code (numerator > 0): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: int properNumerator = getProperNumerator();
 *  */
    @Test
    public void testToProperString_ThrowArithmeticException_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        
        /* This test fails because method [org.apache.commons.lang.math.Fraction.toProperString] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.lang.math.Fraction.getProperNumerator(Fraction.java:392)
            org.apache.commons.lang.math.Fraction.toProperString(Fraction.java:926) */
        fraction.toProperString();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toProperString()
    
    @Test
    public void testToProperString1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", 17);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", -16777264);
        
        String actual = fraction.toProperString();
        
        String expected = "0 17/-16777264";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToProperString2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(fraction, "org.apache.commons.lang.math.Fraction", "numerator", -8);
        setField(fraction, "org.apache.commons.lang.math.Fraction", "denominator", 268435461);
        
        String actual = fraction.toProperString();
        
        String expected = "-8/268435461";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.Fraction.getFraction
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getFraction(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#getFraction(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: str == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetFraction_ThrowIllegalArgumentException() {
        Fraction.getFraction(((String) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getFraction(java.lang.String)
    
    @Test
    public void testGetFraction1() {
        String string = "\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang.math.Fraction.getFraction] produces [java.lang.NumberFormatException: For input string: "    "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:654)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            org.apache.commons.lang.math.Fraction.getFraction(Fraction.java:348) */
        Fraction.getFraction(string);
    }
    
    @Test
    public void testGetFraction2() {
        String string = "\u0000 ";
        
        /* This test fails because method [org.apache.commons.lang.math.Fraction.getFraction] produces [java.lang.NumberFormatException: For input string: " "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:654)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            org.apache.commons.lang.math.Fraction.getFraction(Fraction.java:332) */
        Fraction.getFraction(string);
    }
    
    @Test
    public void testGetFraction3() {
        String string = "!\u0000\u0000.!\u0002\u0001";
        
        /* This test fails because method [org.apache.commons.lang.math.Fraction.getFraction] produces [java.lang.NumberFormatException: For input string: "!  .!"]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            org.apache.commons.lang.math.Fraction.getFraction(Fraction.java:326) */
        Fraction.getFraction(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.Fraction.getFraction
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getFraction(double)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#getFraction(double)}
 * @utbot.executesCondition {@code (value < 0): False}
 * @utbot.executesCondition {@code (value > Integer.MAX_VALUE): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: value > Integer.MAX_VALUE || Double.isNaN(value)
 *  */
    @Test(expected = ArithmeticException.class)
    public void testGetFraction_ThrowArithmeticException() {
        Fraction.getFraction(2.68156158598852E154);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#getFraction(double)}
 * @utbot.executesCondition {@code (value < 0): False}
 * @utbot.executesCondition {@code (value > Integer.MAX_VALUE): False}
 * @utbot.executesCondition {@code (Double.isNaN(value)): True}
 * @utbot.invokes {@link java.lang.Double#isNaN(double)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: value > Integer.MAX_VALUE || Double.isNaN(value)
 *  */
    @Test(expected = ArithmeticException.class)
    public void testGetFraction_ThrowArithmeticException_1() {
        Fraction.getFraction(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#getFraction(double)}
 * @utbot.executesCondition {@code (value < 0): True}
 * @utbot.executesCondition {@code (value > Integer.MAX_VALUE): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: value > Integer.MAX_VALUE || Double.isNaN(value)
 *  */
    @Test(expected = ArithmeticException.class)
    public void testGetFraction_ThrowArithmeticException_2() {
        Fraction.getFraction(-2.352026812632985E77);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getFraction(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#getFraction(double)}
     */
    @Test
    public void testGetFraction() throws Exception  {
        Fraction actual = Fraction.getFraction(-1.1125369292536007E-308);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 1);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#getFraction(double)}
     */
    @Test
    public void testGetFraction4() throws Exception  {
        Fraction actual = Fraction.getFraction(1.7800590868057611E-307);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 1);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.Fraction.getFraction
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFraction(int, int, int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#getFraction(int,int,int)}
 * @utbot.executesCondition {@code (denominator == 0): False}
 * @utbot.executesCondition {@code (denominator < 0): False}
 * @utbot.executesCondition {@code (numerator < 0): False}
 * @utbot.executesCondition {@code (whole < 0): False}
 * @utbot.executesCondition {@code (numeratorValue < Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (numeratorValue > Integer.MAX_VALUE): False}
 * @utbot.returnsFrom {@code return new Fraction((int) numeratorValue, denominator);}
 *  */
    @Test
    public void testGetFraction_NumeratorValueLessOrEqualIntegerMAX_VALUE() throws Exception  {
        Fraction actual = Fraction.getFraction(4, 225, 4);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", 241);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 4);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getFraction(int, int, int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#getFraction(int,int,int)}
 * @utbot.executesCondition {@code (denominator == 0): False}
 * @utbot.executesCondition {@code (denominator < 0): False}
 * @utbot.executesCondition {@code (numerator < 0): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: numerator < 0
 *  */
    @Test(expected = ArithmeticException.class)
    public void testGetFraction_ThrowArithmeticException1() {
        Fraction.getFraction(1, -1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#getFraction(int,int,int)}
 * @utbot.executesCondition {@code (denominator == 0): False}
 * @utbot.executesCondition {@code (denominator < 0): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: denominator < 0
 *  */
    @Test(expected = ArithmeticException.class)
    public void testGetFraction_ThrowArithmeticException_11() {
        Fraction.getFraction(1, -255, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#getFraction(int,int,int)}
 * @utbot.executesCondition {@code (denominator == 0): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: denominator == 0
 *  */
    @Test(expected = ArithmeticException.class)
    public void testGetFraction_ThrowArithmeticException_21() {
        Fraction.getFraction(1, -255, 0);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#getFraction(int,int,int)}
 * @utbot.executesCondition {@code (denominator == 0): False}
 * @utbot.executesCondition {@code (denominator < 0): False}
 * @utbot.executesCondition {@code (numerator < 0): False}
 * @utbot.executesCondition {@code (whole < 0): False}
 * @utbot.executesCondition {@code (numeratorValue < Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (numeratorValue > Integer.MAX_VALUE): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: numeratorValue < Integer.MIN_VALUE || numeratorValue > Integer.MAX_VALUE
 *  */
    @Test(expected = ArithmeticException.class)
    public void testGetFraction_ThrowArithmeticException_3() {
        Fraction.getFraction(9962569, 8388608, 1491085840);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#getFraction(int,int,int)}
 * @utbot.executesCondition {@code (denominator == 0): False}
 * @utbot.executesCondition {@code (denominator < 0): False}
 * @utbot.executesCondition {@code (numerator < 0): False}
 * @utbot.executesCondition {@code (whole < 0): True}
 * @utbot.executesCondition {@code (numeratorValue < Integer.MIN_VALUE): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: numeratorValue < Integer.MIN_VALUE || numeratorValue > Integer.MAX_VALUE
 *  */
    @Test(expected = ArithmeticException.class)
    public void testGetFraction_ThrowArithmeticException_4() {
        Fraction.getFraction(-2008542653, 0, 940634688);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.Fraction.getFraction
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFraction(int, int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#getFraction(int,int)}
 * @utbot.executesCondition {@code (denominator < 0): False}
 * @utbot.returnsFrom {@code return new Fraction(numerator, denominator);}
 *  */
    @Test
    public void testGetFraction_DenominatorGreaterOrEqualZero() throws Exception  {
        Fraction actual = Fraction.getFraction(1, 1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "numerator", 1);
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 1);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#getFraction(int,int)}
 * @utbot.executesCondition {@code (denominator < 0): True}
 * @utbot.executesCondition {@code (numerator == Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (denominator == Integer.MIN_VALUE): False}
 * @utbot.returnsFrom {@code return new Fraction(numerator, denominator);}
 *  */
    @Test
    public void testGetFraction_DenominatorNotEqualsIntegerMIN_VALUE() throws Exception  {
        Fraction actual = Fraction.getFraction(0, -1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang.math.Fraction"));
        setField(expected, "org.apache.commons.lang.math.Fraction", "denominator", 1);
        
        // org.apache.commons.lang.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getFraction(int, int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#getFraction(int,int)}
 * @utbot.executesCondition {@code (denominator == 0): False}
 * @utbot.executesCondition {@code (denominator < 0): True}
 * @utbot.executesCondition {@code (numerator == Integer.MIN_VALUE): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: numerator == Integer.MIN_VALUE || denominator == Integer.MIN_VALUE
 *  */
    @Test(expected = ArithmeticException.class)
    public void testGetFraction_ThrowArithmeticException2() {
        Fraction.getFraction(Integer.MIN_VALUE, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#getFraction(int,int)}
 * @utbot.executesCondition {@code (denominator == 0): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: denominator == 0
 *  */
    @Test(expected = ArithmeticException.class)
    public void testGetFraction_ThrowArithmeticException_12() {
        Fraction.getFraction(1, 0);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#getFraction(int,int)}
 * @utbot.executesCondition {@code (denominator == 0): False}
 * @utbot.executesCondition {@code (denominator < 0): True}
 * @utbot.executesCondition {@code (numerator == Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (denominator == Integer.MIN_VALUE): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: numerator == Integer.MIN_VALUE || denominator == Integer.MIN_VALUE
 *  */
    @Test(expected = ArithmeticException.class)
    public void testGetFraction_ThrowArithmeticException_22() {
        Fraction.getFraction(2, Integer.MIN_VALUE);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.Fraction.greatestCommonDivisor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method greatestCommonDivisor(int, int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#greatestCommonDivisor(int,int)}
 * @utbot.returnsFrom {@code return 1;}
 *  */
    @Test
    public void testGreatestCommonDivisor_Return1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang.math.Fraction");
        Class intType = int.class;
        Method greatestCommonDivisorMethod = fractionClazz.getDeclaredMethod("greatestCommonDivisor", intType, intType);
        greatestCommonDivisorMethod.setAccessible(true);
        java.lang.Object[] greatestCommonDivisorMethodArguments = new java.lang.Object[2];
        greatestCommonDivisorMethodArguments[0] = -3;
        greatestCommonDivisorMethodArguments[1] = 0;
        int actual = ((Integer) greatestCommonDivisorMethod.invoke(null, greatestCommonDivisorMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#greatestCommonDivisor(int,int)}
 * @utbot.returnsFrom {@code return 1;}
 *  */
    @Test
    public void testGreatestCommonDivisor_Return1_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang.math.Fraction");
        Class intType = int.class;
        Method greatestCommonDivisorMethod = fractionClazz.getDeclaredMethod("greatestCommonDivisor", intType, intType);
        greatestCommonDivisorMethod.setAccessible(true);
        java.lang.Object[] greatestCommonDivisorMethodArguments = new java.lang.Object[2];
        greatestCommonDivisorMethodArguments[0] = 0;
        greatestCommonDivisorMethodArguments[1] = -255;
        int actual = ((Integer) greatestCommonDivisorMethod.invoke(null, greatestCommonDivisorMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#greatestCommonDivisor(int,int)}
 * @utbot.executesCondition {@code (u > 0): False}
 * @utbot.executesCondition {@code (v > 0): True}
 * @utbot.executesCondition {@code (k == 31): False}
 * @utbot.executesCondition {@code (((u & 1) == 1)): True}
 * @utbot.executesCondition {@code (t > 0): False}
 * @utbot.executesCondition {@code (t != 0): False}
 * @utbot.returnsFrom {@code return -u * (1 << k);}
 *  */
    @Test
    public void testGreatestCommonDivisor_TLessOrEqualZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang.math.Fraction");
        Class intType = int.class;
        Method greatestCommonDivisorMethod = fractionClazz.getDeclaredMethod("greatestCommonDivisor", intType, intType);
        greatestCommonDivisorMethod.setAccessible(true);
        java.lang.Object[] greatestCommonDivisorMethodArguments = new java.lang.Object[2];
        greatestCommonDivisorMethodArguments[0] = -187;
        greatestCommonDivisorMethodArguments[1] = 187;
        int actual = ((Integer) greatestCommonDivisorMethod.invoke(null, greatestCommonDivisorMethodArguments));
        
        assertEquals(187, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.Fraction#greatestCommonDivisor(int,int)}
 * @utbot.executesCondition {@code (u > 0): False}
 * @utbot.executesCondition {@code (v > 0): False}
 * @utbot.executesCondition {@code (k == 31): False}
 * @utbot.executesCondition {@code (((u & 1) == 1)): False}
 * @utbot.executesCondition {@code (t > 0): True}
 * @utbot.executesCondition {@code (t != 0): False}
 * @utbot.iterates iterate the loop {@code while((u & 1) == 0 && (v & 1) == 0 && k < 31)} once
 * @utbot.returnsFrom {@code return -u * (1 << k);}
 *  */
    @Test
    public void testGreatestCommonDivisor_TGreaterThanZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang.math.Fraction");
        Class intType = int.class;
        Method greatestCommonDivisorMethod = fractionClazz.getDeclaredMethod("greatestCommonDivisor", intType, intType);
        greatestCommonDivisorMethod.setAccessible(true);
        java.lang.Object[] greatestCommonDivisorMethodArguments = new java.lang.Object[2];
        greatestCommonDivisorMethodArguments[0] = -890685230;
        greatestCommonDivisorMethodArguments[1] = -445342615;
        int actual = ((Integer) greatestCommonDivisorMethod.invoke(null, greatestCommonDivisorMethodArguments));
        
        assertEquals(445342615, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method greatestCommonDivisor(int, int)
    
    @Test
    public void testGreatestCommonDivisor1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang.math.Fraction");
        Class intType = int.class;
        Method greatestCommonDivisorMethod = fractionClazz.getDeclaredMethod("greatestCommonDivisor", intType, intType);
        greatestCommonDivisorMethod.setAccessible(true);
        java.lang.Object[] greatestCommonDivisorMethodArguments = new java.lang.Object[2];
        greatestCommonDivisorMethodArguments[0] = 1950351360;
        greatestCommonDivisorMethodArguments[1] = 425721856;
        int actual = ((Integer) greatestCommonDivisorMethod.invoke(null, greatestCommonDivisorMethodArguments));
        
        assertEquals(2097152, actual);
    }
    
    @Test
    public void testGreatestCommonDivisor2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang.math.Fraction");
        Class intType = int.class;
        Method greatestCommonDivisorMethod = fractionClazz.getDeclaredMethod("greatestCommonDivisor", intType, intType);
        greatestCommonDivisorMethod.setAccessible(true);
        java.lang.Object[] greatestCommonDivisorMethodArguments = new java.lang.Object[2];
        greatestCommonDivisorMethodArguments[0] = 3;
        greatestCommonDivisorMethodArguments[1] = 2;
        int actual = ((Integer) greatestCommonDivisorMethod.invoke(null, greatestCommonDivisorMethodArguments));
        
        assertEquals(1, actual);
    }
    
    @Test
    public void testGreatestCommonDivisor3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang.math.Fraction");
        Class intType = int.class;
        Method greatestCommonDivisorMethod = fractionClazz.getDeclaredMethod("greatestCommonDivisor", intType, intType);
        greatestCommonDivisorMethod.setAccessible(true);
        java.lang.Object[] greatestCommonDivisorMethodArguments = new java.lang.Object[2];
        greatestCommonDivisorMethodArguments[0] = 1988100096;
        greatestCommonDivisorMethodArguments[1] = -8388608;
        int actual = ((Integer) greatestCommonDivisorMethod.invoke(null, greatestCommonDivisorMethodArguments));
        
        assertEquals(8388608, actual);
    }
    
    @Test
    public void testGreatestCommonDivisor4() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang.math.Fraction");
        Class intType = int.class;
        Method greatestCommonDivisorMethod = fractionClazz.getDeclaredMethod("greatestCommonDivisor", intType, intType);
        greatestCommonDivisorMethod.setAccessible(true);
        java.lang.Object[] greatestCommonDivisorMethodArguments = new java.lang.Object[2];
        greatestCommonDivisorMethodArguments[0] = 2;
        greatestCommonDivisorMethodArguments[1] = -3;
        int actual = ((Integer) greatestCommonDivisorMethod.invoke(null, greatestCommonDivisorMethodArguments));
        
        assertEquals(1, actual);
    }
    
    @Test
    public void testGreatestCommonDivisor5() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang.math.Fraction");
        Class intType = int.class;
        Method greatestCommonDivisorMethod = fractionClazz.getDeclaredMethod("greatestCommonDivisor", intType, intType);
        greatestCommonDivisorMethod.setAccessible(true);
        java.lang.Object[] greatestCommonDivisorMethodArguments = new java.lang.Object[2];
        greatestCommonDivisorMethodArguments[0] = -1954545664;
        greatestCommonDivisorMethodArguments[1] = 2143289344;
        int actual = ((Integer) greatestCommonDivisorMethod.invoke(null, greatestCommonDivisorMethodArguments));
        
        assertEquals(4194304, actual);
    }
    
    @Test
    public void testGreatestCommonDivisor6() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang.math.Fraction");
        Class intType = int.class;
        Method greatestCommonDivisorMethod = fractionClazz.getDeclaredMethod("greatestCommonDivisor", intType, intType);
        greatestCommonDivisorMethod.setAccessible(true);
        java.lang.Object[] greatestCommonDivisorMethodArguments = new java.lang.Object[2];
        greatestCommonDivisorMethodArguments[0] = -2147483646;
        greatestCommonDivisorMethodArguments[1] = -4;
        int actual = ((Integer) greatestCommonDivisorMethod.invoke(null, greatestCommonDivisorMethodArguments));
        
        assertEquals(2, actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields670263198289400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields670263198289400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass670263198294900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields670263198289400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass670263198294900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields670263198786100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields670263198786100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass670263198787800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields670263198786100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass670263198787800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

