package org.apache.commons.math.fraction;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_math_fraction_FractionTest {
    ///region Test suites for executable org.apache.commons.math.fraction.Fraction.addSub
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addSub(org.apache.commons.math.fraction.Fraction, boolean)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#addSub(org.apache.commons.math.fraction.Fraction,boolean)}
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.executesCondition {@code (fraction.numerator == 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAddSub_FractionNumeratorEqualsZero() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        
        Class fractionClazz = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class booleanType = boolean.class;
        Method addSubMethod = fractionClazz.getDeclaredMethod("addSub", fractionClazz, booleanType);
        addSubMethod.setAccessible(true);
        java.lang.Object[] addSubMethodArguments = new java.lang.Object[2];
        addSubMethodArguments[0] = fraction1;
        addSubMethodArguments[1] = false;
        Fraction actual = ((Fraction) addSubMethod.invoke(fraction, addSubMethodArguments));
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(fraction, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#addSub(org.apache.commons.math.fraction.Fraction,boolean)}
 * @utbot.executesCondition {@code (numerator == 0): True}
 * @utbot.executesCondition {@code (isAdd): True}
 * @utbot.returnsFrom {@code return isAdd ? fraction : fraction.negate();}
 *  */
    @Test
    public void testAddSub_IsAdd() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        
        Class fractionClazz = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class booleanType = boolean.class;
        Method addSubMethod = fractionClazz.getDeclaredMethod("addSub", fractionClazz, booleanType);
        addSubMethod.setAccessible(true);
        java.lang.Object[] addSubMethodArguments = new java.lang.Object[2];
        addSubMethodArguments[0] = fraction;
        addSubMethodArguments[1] = true;
        Fraction actual = ((Fraction) addSubMethod.invoke(fraction, addSubMethodArguments));
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(fraction, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addSub(org.apache.commons.math.fraction.Fraction, boolean)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#addSub(org.apache.commons.math.fraction.Fraction,boolean)}
 * @utbot.executesCondition {@code (fraction == null): False}
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.executesCondition {@code (fraction.numerator == 0): False}
 * @utbot.executesCondition {@code (d1 == 1): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: int uvp = MathUtils.mulAndCheck(numerator, fraction.denominator);
 *  */
    @Test(expected = ArithmeticException.class)
    public void testAddSub_ThrowArithmeticException() throws Throwable  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", 1073807360);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "denominator", -2);
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "numerator", -254);
        
        Class fractionClazz = Class.forName("org.apache.commons.math.fraction.Fraction");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#addSub(org.apache.commons.math.fraction.Fraction,boolean)}
 * @utbot.executesCondition {@code (fraction == null): False}
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.executesCondition {@code (fraction.numerator == 0): False}
 * @utbot.executesCondition {@code (d1 == 1): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: int uvp = MathUtils.mulAndCheck(numerator, fraction.denominator);
 *  */
    @Test(expected = ArithmeticException.class)
    public void testAddSub_ThrowArithmeticException_1() throws Throwable  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", -1);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", -1941635071);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "denominator", -2);
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "numerator", 2);
        
        Class fractionClazz = Class.forName("org.apache.commons.math.fraction.Fraction");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#addSub(org.apache.commons.math.fraction.Fraction,boolean)}
 * @utbot.executesCondition {@code (fraction == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: fraction == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddSub_ThrowIllegalArgumentException() throws Throwable  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        
        Class fractionClazz = Class.forName("org.apache.commons.math.fraction.Fraction");
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
    
    ///region Test suites for executable org.apache.commons.math.fraction.Fraction.reciprocal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reciprocal()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#reciprocal()}
 * @utbot.returnsFrom {@code return new Fraction(denominator, numerator);}
 *  */
    @Test
    public void testReciprocal_Return() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", -1);
        
        Fraction actual = fraction.reciprocal();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", -1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#reciprocal()}
 * @utbot.returnsFrom {@code return new Fraction(denominator, numerator);}
 *  */
    @Test
    public void testReciprocal_Return_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", -1229389963);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", -1229389963);
        
        Fraction actual = fraction.reciprocal();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", 1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#reciprocal()}
 * @utbot.returnsFrom {@code return new Fraction(denominator, numerator);}
 *  */
    @Test
    public void testReciprocal_Return_2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", -1);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", -2);
        
        Fraction actual = fraction.reciprocal();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 2);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", 1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#reciprocal()}
 * @utbot.returnsFrom {@code return new Fraction(denominator, numerator);}
 *  */
    @Test
    public void testReciprocal_Return_3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", 67108862);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", -67108862);
        
        Fraction actual = fraction.reciprocal();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", -1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#reciprocal()}
 * @utbot.returnsFrom {@code return new Fraction(denominator, numerator);}
 *  */
    @Test
    public void testReciprocal_Return_4() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", 2);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", -3);
        
        Fraction actual = fraction.reciprocal();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 3);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", -2);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#reciprocal()}
 * @utbot.returnsFrom {@code return new Fraction(denominator, numerator);}
 *  */
    @Test
    public void testReciprocal_Return_5() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", -1);
        
        Fraction actual = fraction.reciprocal();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method reciprocal()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.fraction.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#reciprocal()}
     */
    @Test
    public void testReciprocal() throws Exception  {
        Fraction fraction = new Fraction(-2146959359, -1);
        
        Fraction actual = fraction.reciprocal();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 2146959359);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", 1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.Fraction.getReducedFraction
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getReducedFraction(int, int)
    
    @Test
    public void testGetReducedFraction1() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(-190141787, -570425361);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 3);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", 1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetReducedFraction2() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(-12, -2147483646);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 357913941);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", 2);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetReducedFraction3() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(-2147483647, 1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", -2147483647);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetReducedFraction4() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(-16778232, 2147479548);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 178956629);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", -1398186);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetReducedFraction5() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(-522248, Integer.MIN_VALUE);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 268435456);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", 65281);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetReducedFraction6() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(713031683, -2138570753);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 2138570753);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", -713031683);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetReducedFraction7() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(8, -2147483646);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1073741823);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", -4);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetReducedFraction8() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(772413011, 1544825990);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1544825990);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", 772413011);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetReducedFraction9() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(16, 2147483646);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1073741823);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", 8);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetReducedFraction10() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(2147483644, Integer.MIN_VALUE);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 536870912);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", -536870911);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetReducedFraction11() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(0, 1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for getReducedFraction
    
    public void testGetReducedFraction_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$1 is not accessible from package org.apache.commons.math.fraction
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.Fraction.getDenominator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDenominator()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#getDenominator()}
 * @utbot.returnsFrom {@code return denominator;}
 *  */
    @Test
    public void testGetDenominator_ReturnDenominator() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", -255);
        
        int actual = fraction.getDenominator();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.Fraction.getNumerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNumerator()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#getNumerator()}
 * @utbot.returnsFrom {@code return numerator;}
 *  */
    @Test
    public void testGetNumerator_ReturnNumerator() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", -255);
        
        int actual = fraction.getNumerator();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.Fraction.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add(org.apache.commons.math.fraction.Fraction)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#add(org.apache.commons.math.fraction.Fraction)}
 * @utbot.returnsFrom {@code return addSub(fraction, true);}
 *  */
    @Test
    public void testAdd_ReturnAddSub() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        
        Fraction actual = fraction.add(fraction1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(fraction1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#add(org.apache.commons.math.fraction.Fraction)}
 * @utbot.returnsFrom {@code return addSub(fraction, true);}
 *  */
    @Test
    public void testAdd_ReturnAddSub_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", -255);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        
        Fraction actual = fraction.add(fraction1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(fraction, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(org.apache.commons.math.fraction.Fraction)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#add(org.apache.commons.math.fraction.Fraction)}
 * @utbot.invokes org.apache.commons.math.fraction.Fraction#addSub(org.apache.commons.math.fraction.Fraction,boolean)
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return addSub(fraction, true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAdd_ThrowIllegalArgumentException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        
        fraction.add(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method add(org.apache.commons.math.fraction.Fraction)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.fraction.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#add(org.apache.commons.math.fraction.Fraction)}
     */
    @Test
    public void testAdd() throws Exception  {
        Fraction fraction = new Fraction(1, Integer.MAX_VALUE);
        Fraction fraction1 = new Fraction(-1, 1);
        
        Fraction actual = fraction.add(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", Integer.MAX_VALUE);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", -2147483646);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.Fraction.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testEquals_Other() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        
        boolean actual = fraction.equals(fraction);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other == null): False}
 * @utbot.returnsFrom {@code return ret;}
 * @utbot.caughtException {@code ClassCastException ex}
 *  */
    @Test
    public void testEquals_CatchClassCastException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        byte[] byteArray = {};
        
        boolean actual = fraction.equals(byteArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other == null): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testEquals_OtherEqualsNull() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        
        boolean actual = fraction.equals(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method equals(java.lang.Object)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (other): False},
    ///     {@code (other == null): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (ret = (numerator == rhs.numerator) && (denominator == rhs.denominator);): False}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testEquals_ReturnRet() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        
        boolean actual = fraction.equals(fraction1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (ret = (numerator == rhs.numerator) && (denominator == rhs.denominator);): True}
 * @utbot.executesCondition {@code (ret = (numerator == rhs.numerator) && (denominator == rhs.denominator);): False}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testEquals_ReturnRet_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", -255);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "numerator", -255);
        
        boolean actual = fraction.equals(fraction1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (ret = (numerator == rhs.numerator) && (denominator == rhs.denominator);): True}
 * @utbot.executesCondition {@code (ret = (numerator == rhs.numerator) && (denominator == rhs.denominator);): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testEquals_ReturnRet_2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", -255);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", -255);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "denominator", -255);
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "numerator", -255);
        
        boolean actual = fraction.equals(fraction1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.Fraction.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#hashCode()}
 * @utbot.invokes {@link org.apache.commons.math.fraction.Fraction#getNumerator()}
 * @utbot.invokes {@link org.apache.commons.math.fraction.Fraction#getDenominator()}
 * @utbot.returnsFrom {@code return 37 * (37 * 17 + getNumerator()) + getDenominator();}
 *  */
    @Test
    public void testHashCode_FractionGetDenominator() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", -255);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", 1);
        
        int actual = fraction.hashCode();
        
        assertEquals(23055, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.Fraction.abs
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method abs()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#abs()}
 * @utbot.executesCondition {@code (numerator >= 0): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testAbs_NumeratorGreaterOrEqualZero() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        
        Fraction actual = fraction.abs();
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(fraction, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#abs()}
 * @utbot.executesCondition {@code (numerator >= 0): False}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testAbs_NumeratorLessThanZero() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", 58723423);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", -117446846);
        
        Fraction actual = fraction.abs();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", 2);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#abs()}
 * @utbot.executesCondition {@code (numerator >= 0): False}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testAbs_NumeratorLessThanZero_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", 106);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", -106);
        
        Fraction actual = fraction.abs();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", 1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method abs()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (numerator >= 0): False}
    /// invoke:
    ///     {@link org.apache.commons.math.fraction.Fraction#negate()} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#abs()}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testAbs_ReturnRet() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", -1);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", -1);
        
        Fraction actual = fraction.abs();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", -1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#abs()}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testAbs_ReturnRet_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", -1946715534);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", -973357767);
        
        Fraction actual = fraction.abs();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 2);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", -1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#abs()}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testAbs_ReturnRet_2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", -5111841);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", -3407894);
        
        Fraction actual = fraction.abs();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 3);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", -2);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.Fraction.compareTo
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method compareTo(org.apache.commons.math.fraction.Fraction)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#compareTo(org.apache.commons.math.fraction.Fraction)}
 * @utbot.invokes {@link org.apache.commons.math.fraction.Fraction#doubleValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double dOn = object.doubleValue();
 *  */
    @Test
    public void testCompareTo_ThrowNullPointerException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", -255);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", -255);
        
        /* This test fails because method [org.apache.commons.math.fraction.Fraction.compareTo] produces [java.lang.NullPointerException]
            org.apache.commons.math.fraction.Fraction.compareTo(Fraction.java:260) */
        fraction.compareTo(((Fraction) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method compareTo(org.apache.commons.math.fraction.Fraction)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.fraction.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#compareTo(org.apache.commons.math.fraction.Fraction)}
     */
    @Test
    public void testCompareToReturnsOne() {
        Fraction fraction = new Fraction(0, 129);
        Fraction fraction1 = new Fraction(-1, 255);
        
        int actual = fraction.compareTo(fraction1);
        
        assertEquals(1, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.fraction.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#compareTo(org.apache.commons.math.fraction.Fraction)}
     */
    @Test
    public void testCompareTo() {
        Fraction fraction = new Fraction(Integer.MIN_VALUE, 129);
        Fraction fraction1 = new Fraction(-1, 255);
        
        int actual = fraction.compareTo(fraction1);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.Fraction.intValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method intValue()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#intValue()}
 * @utbot.invokes {@link org.apache.commons.math.fraction.Fraction#doubleValue()}
 * @utbot.returnsFrom {@code return (int) doubleValue();}
 *  */
    @Test
    public void testIntValue_FractionDoubleValue() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", -255);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", 1);
        
        int actual = fraction.intValue();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.Fraction.longValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method longValue()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#longValue()}
 * @utbot.invokes {@link org.apache.commons.math.fraction.Fraction#doubleValue()}
 * @utbot.returnsFrom {@code return (long) doubleValue();}
 *  */
    @Test
    public void testLongValue_FractionDoubleValue() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", -255);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", 1);
        
        long actual = fraction.longValue();
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.Fraction.floatValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method floatValue()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#floatValue()}
 * @utbot.invokes {@link org.apache.commons.math.fraction.Fraction#doubleValue()}
 * @utbot.returnsFrom {@code return (float) doubleValue();}
 *  */
    @Test
    public void testFloatValue_FractionDoubleValue() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", -255);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", 1);
        
        float actual = fraction.floatValue();
        
        org.junit.Assert.assertEquals(-0.003921569f, actual, 1.0E-6f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.Fraction.doubleValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method doubleValue()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#doubleValue()}
 * @utbot.returnsFrom {@code return (double) numerator / (double) denominator;}
 *  */
    @Test
    public void testDoubleValue_ReturnNumeratorDivideDenominator() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", -255);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", 1);
        
        double actual = fraction.doubleValue();
        
        org.junit.Assert.assertEquals(-0.00392156862745098, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.Fraction.multiply
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method multiply(org.apache.commons.math.fraction.Fraction)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#multiply(org.apache.commons.math.fraction.Fraction)}
 * @utbot.executesCondition {@code (fraction == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: fraction == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMultiply_ThrowIllegalArgumentException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        
        fraction.multiply(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method multiply(org.apache.commons.math.fraction.Fraction)
    
    @Test
    public void testMultiply1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", -2147483647);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", -872827170);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "denominator", -872827170);
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "numerator", 1);
        
        Fraction actual = fraction.multiply(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", Integer.MAX_VALUE);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", -1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", -324171);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "denominator", -648342);
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "numerator", 512);
        
        Fraction actual = fraction.multiply(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", 256);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", -2147483646);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", 1827438586);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "denominator", 913719293);
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "numerator", 4);
        
        Fraction actual = fraction.multiply(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1073741823);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", -4);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply4() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", 2);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", 1875834686);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "denominator", 937917343);
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "numerator", -2147483646);
        
        Fraction actual = fraction.multiply(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", -2147483646);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply5() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", -2147483584);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", -1619218987);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "denominator", 1619218987);
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "numerator", -2147483646);
        
        Fraction actual = fraction.multiply(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 34636832);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", -34636833);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply6() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", -2031916110);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "denominator", 2031916110);
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "numerator", -2147483646);
        
        Fraction actual = fraction.multiply(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", 2147483646);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply7() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        
        Fraction actual = fraction.multiply(fraction);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply8() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        
        Fraction actual = fraction.multiply(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply9() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", -2147483647);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", 1073985275);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "denominator", -1073985275);
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "numerator", 1);
        
        Fraction actual = fraction.multiply(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", Integer.MAX_VALUE);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", 1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply10() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", 250);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "denominator", -250);
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "numerator", -256);
        
        Fraction actual = fraction.multiply(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", 256);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for multiply
    
    public void testMultiply_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$1 is not accessible from package org.apache.commons.math.fraction
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.Fraction.negate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method negate()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#negate()}
 * @utbot.returnsFrom {@code return new Fraction(-numerator, denominator);}
 *  */
    @Test
    public void testNegate_Return() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", 348161);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", 348161);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", -1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#negate()}
 * @utbot.returnsFrom {@code return new Fraction(-numerator, denominator);}
 *  */
    @Test
    public void testNegate_Return_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", -1);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", 2);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", 2);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#negate()}
 * @utbot.returnsFrom {@code return new Fraction(-numerator, denominator);}
 *  */
    @Test
    public void testNegate_Return_2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", -271076158);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", 135538079);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 2);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", 1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#negate()}
 * @utbot.returnsFrom {@code return new Fraction(-numerator, denominator);}
 *  */
    @Test
    public void testNegate_Return_3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", -1);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", 3);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", 3);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#negate()}
 * @utbot.returnsFrom {@code return new Fraction(-numerator, denominator);}
 *  */
    @Test
    public void testNegate_Return_4() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#negate()}
 * @utbot.returnsFrom {@code return new Fraction(-numerator, denominator);}
 *  */
    @Test
    public void testNegate_Return_5() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", 254);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", -254);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", 1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method negate()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.fraction.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#negate()}
     */
    @Test
    public void testNegate() throws Exception  {
        Fraction fraction = new Fraction(-2146959359, -1);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", -2146959359);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.fraction.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#negate()}
     */
    @Test
    public void testNegate1() throws Exception  {
        Fraction fraction = new Fraction(1, -1);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", 1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.Fraction.divide
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method divide(org.apache.commons.math.fraction.Fraction)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#divide(org.apache.commons.math.fraction.Fraction)}
 * @utbot.executesCondition {@code (fraction == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: fraction == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDivide_ThrowIllegalArgumentException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        
        fraction.divide(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method divide(org.apache.commons.math.fraction.Fraction)
    
    @Test
    public void testDivide1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "denominator", 1059928003);
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "numerator", -2119856006);
        
        Fraction actual = fraction.divide(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", 2147483644);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", -2147483646);
        
        Fraction actual = fraction.divide(fraction);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", 1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", 537704074);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", 268852037);
        
        Fraction actual = fraction.divide(fraction);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", 1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide4() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "denominator", 403153022);
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "numerator", 604729533);
        
        Fraction actual = fraction.divide(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide5() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "denominator", -2013583086);
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "numerator", 2013583086);
        
        Fraction actual = fraction.divide(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide6() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", -8);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", 2147483646);
        
        Fraction actual = fraction.divide(fraction);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", 1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide7() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", -1073675774);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", -2147351548);
        
        Fraction actual = fraction.divide(fraction);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", 1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide8() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "denominator", -3);
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "numerator", -1);
        
        Fraction actual = fraction.divide(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide9() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", -2147483647);
        
        Fraction actual = fraction.divide(fraction);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide10() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", 1);
        
        Fraction actual = fraction.divide(fraction);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide11() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "numerator", 32768);
        
        Fraction actual = fraction.divide(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide12() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "numerator", 67108907);
        
        Fraction actual = fraction.divide(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for divide
    
    public void testDivide_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$1 is not accessible from package org.apache.commons.math.fraction
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.fraction.Fraction.subtract
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method subtract(org.apache.commons.math.fraction.Fraction)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#subtract(org.apache.commons.math.fraction.Fraction)}
 * @utbot.invokes org.apache.commons.math.fraction.Fraction#addSub(org.apache.commons.math.fraction.Fraction,boolean)
 * @utbot.returnsFrom {@code return addSub(fraction, false);}
 *  */
    @Test
    public void testSubtract_FractionAddSub() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", -255);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        
        Fraction actual = fraction.subtract(fraction1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(fraction, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method subtract(org.apache.commons.math.fraction.Fraction)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math.fraction.Fraction#subtract(org.apache.commons.math.fraction.Fraction)}
 * @utbot.invokes org.apache.commons.math.fraction.Fraction#addSub(org.apache.commons.math.fraction.Fraction,boolean)
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return addSub(fraction, false);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSubtract_ThrowIllegalArgumentException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        
        fraction.subtract(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method subtract(org.apache.commons.math.fraction.Fraction)
    
    @Test
    public void testSubtract1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", 268439595);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", -1073741839);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "denominator", -268439595);
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "numerator", 16384);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 17895973);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", -71581697);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", 2);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", 4);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "denominator", -1);
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "numerator", 4096);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", 4098);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", 2);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "denominator", 2);
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "numerator", 1);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract4() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", -1);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "denominator", 2);
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "numerator", 1);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 2);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", -3);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract5() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", -2147483646);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "denominator", -2147483646);
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "numerator", 1);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract6() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", -1073330190);
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "numerator", -16);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "denominator", -536665095);
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "numerator", 33554432);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 107333019);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", 6710888);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract7() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "denominator", -3);
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "numerator", 2);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 3);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", 2);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract8() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "denominator", -2147483647);
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "numerator", 1);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", Integer.MAX_VALUE);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", 1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract9() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "denominator", -3);
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "numerator", -2147483646);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", -715827882);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract10() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "denominator", -2147483647);
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "numerator", -2147483647);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", -1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract11() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "numerator", 1);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", -1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract12() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        setField(fraction1, "org.apache.commons.math.fraction.Fraction", "numerator", -3);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math.fraction.Fraction", "numerator", 3);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract13() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        
        Fraction actual = fraction.subtract(fraction);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract14() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math.fraction.Fraction", "denominator", -2147483647);
        
        Fraction actual = fraction.subtract(fraction);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math.fraction.Fraction"));
        setField(expected, "org.apache.commons.math.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for subtract
    
    public void testSubtract_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$1 is not accessible from package org.apache.commons.math.fraction
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields786491034068100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields786491034068100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass786491034072300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields786491034068100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass786491034072300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

