package org.apache.commons.lang3.math;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_lang3_math_FractionTest {
    ///region Test suites for executable org.apache.commons.lang3.math.Fraction.greatestCommonDivisor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method greatestCommonDivisor(int, int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#greatestCommonDivisor(int,int)}
 * @utbot.executesCondition {@code (Math.abs(u) <= 1): False}
 * @utbot.executesCondition {@code (Math.abs(v) <= 1): False}
 * @utbot.executesCondition {@code (u > 0): False}
 * @utbot.executesCondition {@code (v > 0): True}
 * @utbot.executesCondition {@code (k == 31): False}
 * @utbot.executesCondition {@code (((u & 1) == 1)): True}
 * @utbot.executesCondition {@code (t > 0): False}
 * @utbot.executesCondition {@code (t != 0): False}
 * @utbot.returnsFrom {@code return -u * (1 << k);}
 *  */
    @Test
    public void testGreatestCommonDivisor_TEqualsZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
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
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#greatestCommonDivisor(int,int)}
 * @utbot.executesCondition {@code (Math.abs(u) <= 1): True}
 * @utbot.returnsFrom {@code return 1;}
 *  */
    @Test
    public void testGreatestCommonDivisor_MathAbsLessOrEqual1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method greatestCommonDivisorMethod = fractionClazz.getDeclaredMethod("greatestCommonDivisor", intType, intType);
        greatestCommonDivisorMethod.setAccessible(true);
        java.lang.Object[] greatestCommonDivisorMethodArguments = new java.lang.Object[2];
        greatestCommonDivisorMethodArguments[0] = 0;
        greatestCommonDivisorMethodArguments[1] = -255;
        int actual = ((Integer) greatestCommonDivisorMethod.invoke(null, greatestCommonDivisorMethodArguments));
        
        assertEquals(255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#greatestCommonDivisor(int,int)}
 * @utbot.executesCondition {@code (Math.abs(u) <= 1): False}
 * @utbot.executesCondition {@code (Math.abs(v) <= 1): True}
 * @utbot.returnsFrom {@code return 1;}
 *  */
    @Test
    public void testGreatestCommonDivisor_MathAbsLessOrEqual1_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method greatestCommonDivisorMethod = fractionClazz.getDeclaredMethod("greatestCommonDivisor", intType, intType);
        greatestCommonDivisorMethod.setAccessible(true);
        java.lang.Object[] greatestCommonDivisorMethodArguments = new java.lang.Object[2];
        greatestCommonDivisorMethodArguments[0] = -3;
        greatestCommonDivisorMethodArguments[1] = 0;
        int actual = ((Integer) greatestCommonDivisorMethod.invoke(null, greatestCommonDivisorMethodArguments));
        
        assertEquals(3, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method greatestCommonDivisor(int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#greatestCommonDivisor(int,int)}
     */
    @Test
    public void testGreatestCommonDivisorReturnsOne() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method greatestCommonDivisorMethod = fractionClazz.getDeclaredMethod("greatestCommonDivisor", intType, intType);
        greatestCommonDivisorMethod.setAccessible(true);
        java.lang.Object[] greatestCommonDivisorMethodArguments = new java.lang.Object[2];
        greatestCommonDivisorMethodArguments[0] = 31;
        greatestCommonDivisorMethodArguments[1] = 2147483645;
        int actual = ((Integer) greatestCommonDivisorMethod.invoke(null, greatestCommonDivisorMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#greatestCommonDivisor(int,int)}
     */
    @Test
    public void testGreatestCommonDivisorReturnsOne1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method greatestCommonDivisorMethod = fractionClazz.getDeclaredMethod("greatestCommonDivisor", intType, intType);
        greatestCommonDivisorMethod.setAccessible(true);
        java.lang.Object[] greatestCommonDivisorMethodArguments = new java.lang.Object[2];
        greatestCommonDivisorMethodArguments[0] = 31;
        greatestCommonDivisorMethodArguments[1] = -3;
        int actual = ((Integer) greatestCommonDivisorMethod.invoke(null, greatestCommonDivisorMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#greatestCommonDivisor(int,int)}
     */
    @Test
    public void testGreatestCommonDivisorWithCornerCases() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method greatestCommonDivisorMethod = fractionClazz.getDeclaredMethod("greatestCommonDivisor", intType, intType);
        greatestCommonDivisorMethod.setAccessible(true);
        java.lang.Object[] greatestCommonDivisorMethodArguments = new java.lang.Object[2];
        greatestCommonDivisorMethodArguments[0] = Integer.MAX_VALUE;
        greatestCommonDivisorMethodArguments[1] = 0;
        int actual = ((Integer) greatestCommonDivisorMethod.invoke(null, greatestCommonDivisorMethodArguments));
        
        assertEquals(Integer.MAX_VALUE, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#greatestCommonDivisor(int,int)}
     */
    @Test
    public void testGreatestCommonDivisorReturns2WithCornerCase() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method greatestCommonDivisorMethod = fractionClazz.getDeclaredMethod("greatestCommonDivisor", intType, intType);
        greatestCommonDivisorMethod.setAccessible(true);
        java.lang.Object[] greatestCommonDivisorMethodArguments = new java.lang.Object[2];
        greatestCommonDivisorMethodArguments[0] = -2147483646;
        greatestCommonDivisorMethodArguments[1] = Integer.MIN_VALUE;
        int actual = ((Integer) greatestCommonDivisorMethod.invoke(null, greatestCommonDivisorMethodArguments));
        
        assertEquals(2, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#greatestCommonDivisor(int,int)}
     */
    @Test
    public void testGreatestCommonDivisorReturnsOne2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method greatestCommonDivisorMethod = fractionClazz.getDeclaredMethod("greatestCommonDivisor", intType, intType);
        greatestCommonDivisorMethod.setAccessible(true);
        java.lang.Object[] greatestCommonDivisorMethodArguments = new java.lang.Object[2];
        greatestCommonDivisorMethodArguments[0] = -4194305;
        greatestCommonDivisorMethodArguments[1] = 1;
        int actual = ((Integer) greatestCommonDivisorMethod.invoke(null, greatestCommonDivisorMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#greatestCommonDivisor(int,int)}
     */
    @Test
    public void testGreatestCommonDivisorReturnsOne3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method greatestCommonDivisorMethod = fractionClazz.getDeclaredMethod("greatestCommonDivisor", intType, intType);
        greatestCommonDivisorMethod.setAccessible(true);
        java.lang.Object[] greatestCommonDivisorMethodArguments = new java.lang.Object[2];
        greatestCommonDivisorMethodArguments[0] = -4194305;
        greatestCommonDivisorMethodArguments[1] = -2147483647;
        int actual = ((Integer) greatestCommonDivisorMethod.invoke(null, greatestCommonDivisorMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#greatestCommonDivisor(int,int)}
     */
    @Test
    public void testGreatestCommonDivisorReturnsOne4() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method greatestCommonDivisorMethod = fractionClazz.getDeclaredMethod("greatestCommonDivisor", intType, intType);
        greatestCommonDivisorMethod.setAccessible(true);
        java.lang.Object[] greatestCommonDivisorMethodArguments = new java.lang.Object[2];
        greatestCommonDivisorMethodArguments[0] = -1;
        greatestCommonDivisorMethodArguments[1] = -2147483647;
        int actual = ((Integer) greatestCommonDivisorMethod.invoke(null, greatestCommonDivisorMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#greatestCommonDivisor(int,int)}
     */
    @Test
    public void testGreatestCommonDivisorReturnsOne5() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method greatestCommonDivisorMethod = fractionClazz.getDeclaredMethod("greatestCommonDivisor", intType, intType);
        greatestCommonDivisorMethod.setAccessible(true);
        java.lang.Object[] greatestCommonDivisorMethodArguments = new java.lang.Object[2];
        greatestCommonDivisorMethodArguments[0] = -1;
        greatestCommonDivisorMethodArguments[1] = -2147483645;
        int actual = ((Integer) greatestCommonDivisorMethod.invoke(null, greatestCommonDivisorMethodArguments));
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.Fraction.getFraction
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFraction(double)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(double)}
 * @utbot.executesCondition {@code (value > Integer.MAX_VALUE): False}
 * @utbot.executesCondition {@code (Double.isNaN(value)): True}
 * @utbot.invokes {@link java.lang.Double#isNaN(double)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: value > Integer.MAX_VALUE || Double.isNaN(value)
 *  */
    @Test
    public void testGetFraction_ThrowArithmeticException() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.ArithmeticException: The value must not be greater than Integer.MAX_VALUE or NaN]
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:252) */
        Fraction.getFraction(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(double)}
 * @utbot.executesCondition {@code (value > Integer.MAX_VALUE): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: value > Integer.MAX_VALUE || Double.isNaN(value)
 *  */
    @Test
    public void testGetFraction_ThrowArithmeticException_1() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.ArithmeticException: The value must not be greater than Integer.MAX_VALUE or NaN]
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:252) */
        Fraction.getFraction(2.68156158598852E154);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getFraction(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(double)}
     */
    @Test
    public void testGetFraction() throws Exception  {
        Fraction actual = Fraction.getFraction(-1.1125369292536007E-308);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(double)}
     */
    @Test
    public void testGetFraction1() throws Exception  {
        Fraction actual = Fraction.getFraction(-1.7800590868057611E-307);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(double)}
     */
    @Test
    public void testGetFraction2() throws Exception  {
        Fraction actual = Fraction.getFraction(-1.780059093436998E-307);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(double)}
     */
    @Test
    public void testGetFraction3() throws Exception  {
        Fraction actual = Fraction.getFraction(1.7800590868057611E-307);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(double)}
     */
    @Test
    public void testGetFraction4() throws Exception  {
        Fraction actual = Fraction.getFraction(1.1665795231290236E-302);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(double)}
     */
    @Test
    public void testGetFraction5() throws Exception  {
        Fraction actual = Fraction.getFraction(-1.1125369292536007E-308);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(double)}
     */
    @Test
    public void testGetFraction6() throws Exception  {
        Fraction actual = Fraction.getFraction(-1.1125369292536086E-308);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(double)}
     */
    @Test
    public void testGetFraction7() throws Exception  {
        Fraction actual = Fraction.getFraction(-3.785766995733706E-270);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getFraction(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(double)}
     */
    @Test
    public void testGetFractionThrowsAE() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.ArithmeticException: The value must not be greater than Integer.MAX_VALUE or NaN]
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:252) */
        Fraction.getFraction(1.0533358212083882E306);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(double)}
     */
    @Test
    public void testGetFractionThrowsAE1() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.ArithmeticException: The value must not be greater than Integer.MAX_VALUE or NaN]
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:252) */
        Fraction.getFraction(1.0533358264403638E306);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(double)}
     */
    @Test
    public void testGetFractionThrowsAE2() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.ArithmeticException: The value must not be greater than Integer.MAX_VALUE or NaN]
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:252) */
        Fraction.getFraction(-1.0533358264403638E306);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(double)}
     */
    @Test
    public void testGetFractionThrowsAE3() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.ArithmeticException: The value must not be greater than Integer.MAX_VALUE or NaN]
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:252) */
        Fraction.getFraction(-1.054021591948963E306);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(double)}
     */
    @Test
    public void testGetFractionThrowsAE4() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.ArithmeticException: The value must not be greater than Integer.MAX_VALUE or NaN]
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:252) */
        Fraction.getFraction(1.7976931347576762E308);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(double)}
     */
    @Test
    public void testGetFractionThrowsAE5() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.ArithmeticException: The value must not be greater than Integer.MAX_VALUE or NaN]
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:252) */
        Fraction.getFraction(1.7974736897949244E308);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(double)}
     */
    @Test
    public void testGetFractionThrowsAE6() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.ArithmeticException: The value must not be greater than Integer.MAX_VALUE or NaN]
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:252) */
        Fraction.getFraction(1.3407807929942597E154);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(double)}
     */
    @Test
    public void testGetFractionThrowsAE7() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.ArithmeticException: The value must not be greater than Integer.MAX_VALUE or NaN]
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:252) */
        Fraction.getFraction(-1.3407807929942597E154);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(double)}
     */
    @Test
    public void testGetFractionThrowsAEWithCornerCase() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.ArithmeticException: The value must not be greater than Integer.MAX_VALUE or NaN]
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:252) */
        Fraction.getFraction(java.lang.Double.NEGATIVE_INFINITY);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getFraction(double)
    
    @Test
    public void testGetFraction8() throws Exception  {
        Fraction actual = Fraction.getFraction(-0.0);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.Fraction.getFraction
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFraction(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: str == null
 *  */
    @Test
    public void testGetFraction_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.NullPointerException: The string must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:315) */
        Fraction.getFraction(((String) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getFraction(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(java.lang.String)}
     */
    @Test
    public void testGetFractionWithNonEmptyString() throws Exception  {
        Fraction actual = Fraction.getFraction("01");
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(java.lang.String)}
     */
    @Test
    public void testGetFractionWithNonEmptyString1() throws Exception  {
        Fraction actual = Fraction.getFraction("1");
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getFraction(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(java.lang.String)}
     */
    @Test
    public void testGetFractionThrowsNFEWithNonEmptyString() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.NumberFormatException: For input string: "XZb"]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:668)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:340) */
        Fraction.getFraction("XZb");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(java.lang.String)}
     */
    @Test
    public void testGetFractionThrowsNFEWithNonEmptyString1() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.NumberFormatException: For input string: "Z"]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:668)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:340) */
        Fraction.getFraction("Z");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(java.lang.String)}
     */
    @Test
    public void testGetFractionThrowsNFEWithNonEmptyString2() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.NumberFormatException: For input string: "Z"]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:668)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:340) */
        Fraction.getFraction("Z");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(java.lang.String)}
     */
    @Test
    public void testGetFractionThrowsNFEWithNonEmptyString3() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.NumberFormatException: For input string: "Z"]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:668)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:340) */
        Fraction.getFraction("\u0090Z");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(java.lang.String)}
     */
    @Test
    public void testGetFractionThrowsNFEWithNonEmptyString4() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.NumberFormatException: For input string: "'#"\$"]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:654)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:340) */
        Fraction.getFraction("'#\"\\$");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(java.lang.String)}
     */
    @Test
    public void testGetFractionThrowsNFEWithNonEmptyString5() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.NumberFormatException: For input string: "The"]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:668)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:325) */
        Fraction.getFraction("The string mus not be null");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(java.lang.String)}
     */
    @Test
    public void testGetFractionThrowsNFEWithNonEmptyString6() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.NumberFormatException: For input string: "\"#'$"]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:668)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:340) */
        Fraction.getFraction("\\\"#'$");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(java.lang.String)}
     */
    @Test
    public void testGetFractionThrowsNFEWithNonEmptyString7() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.NumberFormatException: For input string: "The"]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:668)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:325) */
        Fraction.getFraction("The fraction could not be parsed as the frmat X Y/Z");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(java.lang.String)}
     */
    @Test
    public void testGetFractionThrowsNFEWithNonEmptyString8() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.NumberFormatException: For input string: "
        ￣    
        "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:654)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:340) */
        Fraction.getFraction("\n\uFFE3\t\r");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(java.lang.String)}
     */
    @Test
    public void testGetFractionThrowsNFEWithNonEmptyString9() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.NumberFormatException: For input string: "
        ￣    
        "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:654)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:340) */
        Fraction.getFraction("\n\uFFE3\t\r");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(java.lang.String)}
     */
    @Test
    public void testGetFractionThrowsNPE() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.NullPointerException: The string must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:315) */
        Fraction.getFraction(((String) null));
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(java.lang.String)}
     */
    @Test
    public void testGetFractionThrowsNPE1() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.NullPointerException: The string must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:315) */
        Fraction.getFraction(((String) null));
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(java.lang.String)}
     */
    @Test
    public void testGetFractionThrowsNPE2() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.NullPointerException: The string must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:315) */
        Fraction.getFraction(((String) null));
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(java.lang.String)}
     */
    @Test
    public void testGetFractionThrowsNPE3() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.NullPointerException: The string must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:315) */
        Fraction.getFraction(((String) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getFraction(java.lang.String)
    
    @Test
    public void testGetFraction9() {
        String string = "\u0000";
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.NumberFormatException: For input string: " "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:654)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:340) */
        Fraction.getFraction(string);
    }
    
    @Test
    public void testGetFraction10() {
        String string = "!.\u0001\u0001\u0001";
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.NumberFormatException: For input string: "!."]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:319) */
        Fraction.getFraction(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.Fraction.getFraction
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFraction(int, int, int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(int,int,int)}
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
        Fraction actual = Fraction.getFraction(0, 256, 2);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFraction(int, int, int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(int,int,int)}
 * @utbot.executesCondition {@code (denominator == 0): False}
 * @utbot.executesCondition {@code (denominator < 0): False}
 * @utbot.executesCondition {@code (numerator < 0): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: numerator < 0
 *  */
    @Test
    public void testGetFraction_ThrowArithmeticException1() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.ArithmeticException: The numerator must not be negative]
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:180) */
        Fraction.getFraction(1, -1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(int,int,int)}
 * @utbot.executesCondition {@code (denominator == 0): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: denominator == 0
 *  */
    @Test
    public void testGetFraction_ThrowArithmeticException_11() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.ArithmeticException: The denominator must not be zero]
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:174) */
        Fraction.getFraction(1, -255, 0);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(int,int,int)}
 * @utbot.executesCondition {@code (denominator == 0): False}
 * @utbot.executesCondition {@code (denominator < 0): False}
 * @utbot.executesCondition {@code (numerator < 0): False}
 * @utbot.executesCondition {@code (whole < 0): False}
 * @utbot.executesCondition {@code (numeratorValue < Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (numeratorValue > Integer.MAX_VALUE): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: numeratorValue < Integer.MIN_VALUE || numeratorValue > Integer.MAX_VALUE
 *  */
    @Test
    public void testGetFraction_ThrowArithmeticException_2() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.ArithmeticException: Numerator too large to represent as an Integer.]
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:189) */
        Fraction.getFraction(9962569, 8388608, 1491085840);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(int,int,int)}
 * @utbot.executesCondition {@code (denominator == 0): False}
 * @utbot.executesCondition {@code (denominator < 0): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: denominator < 0
 *  */
    @Test
    public void testGetFraction_ThrowArithmeticException_3() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.ArithmeticException: The denominator must not be negative]
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:177) */
        Fraction.getFraction(1, -255, -1);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getFraction(int, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(int,int,int)}
     */
    @Test
    public void testGetFractionThrowsAEWithCornerCase1() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.ArithmeticException: The numerator must not be negative]
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:180) */
        Fraction.getFraction(2147475455, Integer.MIN_VALUE, 255);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(int,int,int)}
     */
    @Test
    public void testGetFractionThrowsAEWithCornerCase2() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.ArithmeticException: The numerator must not be negative]
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:180) */
        Fraction.getFraction(2147475455, Integer.MIN_VALUE, 127);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(int,int,int)}
     */
    @Test
    public void testGetFractionThrowsAEWithCornerCase3() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.ArithmeticException: The numerator must not be negative]
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:180) */
        Fraction.getFraction(2147475455, Integer.MIN_VALUE, 127);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(int,int,int)}
     */
    @Test
    public void testGetFractionThrowsAEWithCornerCases() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.ArithmeticException: The denominator must not be negative]
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:177) */
        Fraction.getFraction(0, 127, Integer.MIN_VALUE);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(int,int,int)}
     */
    @Test
    public void testGetFractionThrowsAEWithCornerCase4() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.ArithmeticException: The numerator must not be negative]
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:180) */
        Fraction.getFraction(1073733631, Integer.MIN_VALUE, 127);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(int,int,int)}
     */
    @Test
    public void testGetFractionThrowsAEWithCornerCase5() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.ArithmeticException: The numerator must not be negative]
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:180) */
        Fraction.getFraction(1073733631, Integer.MIN_VALUE, 255);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(int,int,int)}
     */
    @Test
    public void testGetFractionThrowsAEWithCornerCase6() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.ArithmeticException: The numerator must not be negative]
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:180) */
        Fraction.getFraction(1073733631, Integer.MIN_VALUE, 255);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(int,int,int)}
     */
    @Test
    public void testGetFractionThrowsAE8() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.ArithmeticException: The numerator must not be negative]
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:180) */
        Fraction.getFraction(1073733631, -2147483640, 255);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(int,int,int)}
     */
    @Test
    public void testGetFractionThrowsAEWithCornerCase7() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.ArithmeticException: The numerator must not be negative]
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:180) */
        Fraction.getFraction(1073733631, Integer.MIN_VALUE, 127);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(int,int,int)}
     */
    @Test
    public void testGetFractionThrowsAEWithCornerCase8() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.ArithmeticException: The numerator must not be negative]
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:180) */
        Fraction.getFraction(1073733631, Integer.MIN_VALUE, 127);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.Fraction.getFraction
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFraction(int, int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(int,int)}
 * @utbot.executesCondition {@code (denominator == 0): False}
 * @utbot.executesCondition {@code (denominator < 0): False}
 * @utbot.returnsFrom {@code return new Fraction(numerator, denominator);}
 *  */
    @Test
    public void testGetFraction_DenominatorGreaterOrEqualZero() throws Exception  {
        Fraction actual = Fraction.getFraction(1, 1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFraction(int, int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(int,int)}
 * @utbot.executesCondition {@code (denominator == 0): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: denominator == 0
 *  */
    @Test
    public void testGetFraction_ThrowArithmeticException2() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.ArithmeticException: The denominator must not be zero]
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:144) */
        Fraction.getFraction(1, 0);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(int,int)}
 * @utbot.executesCondition {@code (denominator == 0): False}
 * @utbot.executesCondition {@code (denominator < 0): True}
 * @utbot.executesCondition {@code (numerator == Integer.MIN_VALUE): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: numerator == Integer.MIN_VALUE || denominator == Integer.MIN_VALUE
 *  */
    @Test
    public void testGetFraction_ThrowArithmeticException_12() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.ArithmeticException: overflow: can't negate]
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:148) */
        Fraction.getFraction(Integer.MIN_VALUE, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(int,int)}
 * @utbot.executesCondition {@code (denominator == 0): False}
 * @utbot.executesCondition {@code (denominator < 0): True}
 * @utbot.executesCondition {@code (numerator == Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (denominator == Integer.MIN_VALUE): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: numerator == Integer.MIN_VALUE || denominator == Integer.MIN_VALUE
 *  */
    @Test
    public void testGetFraction_ThrowArithmeticException_21() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.ArithmeticException: overflow: can't negate]
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:148) */
        Fraction.getFraction(2, Integer.MIN_VALUE);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getFraction(int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(int,int)}
     */
    @Test
    public void testGetFractionWithCornerCase() throws Exception  {
        Fraction actual = Fraction.getFraction(Integer.MIN_VALUE, 2);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(int,int)}
     */
    @Test
    public void testGetFractionWithCornerCase1() throws Exception  {
        Fraction actual = Fraction.getFraction(0, -2147483647);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(int,int)}
     */
    @Test
    public void testGetFractionWithCornerCase2() throws Exception  {
        Fraction actual = Fraction.getFraction(Integer.MAX_VALUE, -1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(int,int)}
     */
    @Test
    public void testGetFraction11() throws Exception  {
        Fraction actual = Fraction.getFraction(2143289343, -1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(int,int)}
     */
    @Test
    public void testGetFractionWithCornerCase3() throws Exception  {
        Fraction actual = Fraction.getFraction(2143289343, Integer.MAX_VALUE);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(int,int)}
     */
    @Test
    public void testGetFractionWithCornerCases() throws Exception  {
        Fraction actual = Fraction.getFraction(Integer.MAX_VALUE, Integer.MAX_VALUE);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(int,int)}
     */
    @Test
    public void testGetFractionWithCornerCase4() throws Exception  {
        Fraction actual = Fraction.getFraction(Integer.MAX_VALUE, 2147483645);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(int,int)}
     */
    @Test
    public void testGetFractionWithCornerCase5() throws Exception  {
        Fraction actual = Fraction.getFraction(Integer.MAX_VALUE, 2113929215);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(int,int)}
     */
    @Test
    public void testGetFraction12() throws Exception  {
        Fraction actual = Fraction.getFraction(2147479551, 2113929215);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(int,int)}
     */
    @Test
    public void testGetFraction13() throws Exception  {
        Fraction actual = Fraction.getFraction(2147217407, 2113929215);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getFraction(int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(int,int)}
     */
    @Test
    public void testGetFractionThrowsAEWithCornerCase9() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.ArithmeticException: overflow: can't negate]
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:148) */
        Fraction.getFraction(Integer.MIN_VALUE, -2147483646);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(int,int)}
     */
    @Test
    public void testGetFractionThrowsAEWithCornerCases1() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.ArithmeticException: overflow: can't negate]
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:148) */
        Fraction.getFraction(0, Integer.MIN_VALUE);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(int,int)}
     */
    @Test
    public void testGetFractionThrowsAEWithCornerCase10() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.ArithmeticException: overflow: can't negate]
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:148) */
        Fraction.getFraction(4096, Integer.MIN_VALUE);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(int,int)}
     */
    @Test
    public void testGetFractionThrowsAEWithCornerCase11() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.ArithmeticException: overflow: can't negate]
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:148) */
        Fraction.getFraction(-9, Integer.MIN_VALUE);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getFraction(int,int)}
     */
    @Test
    public void testGetFractionThrowsAEWithCornerCase12() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getFraction] produces [java.lang.ArithmeticException: overflow: can't negate]
            org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:148) */
        Fraction.getFraction(2147483639, Integer.MIN_VALUE);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.Fraction.getNumerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNumerator()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getNumerator()}
 * @utbot.returnsFrom {@code return numerator;}
 *  */
    @Test
    public void testGetNumerator_ReturnNumerator() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -255);
        
        int actual = fraction.getNumerator();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.Fraction.toProperString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toProperString()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#toProperString()}
 * @utbot.executesCondition {@code (toProperString == null): False}
 * @utbot.returnsFrom {@code return toProperString;}
 *  */
    @Test
    public void testToProperString_ToProperStringNotEqualsNull() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        String toProperString = "";
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "toProperString", toProperString);
        
        String actual = fraction.toProperString();
        
        assertEquals(toProperString, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#toProperString()}
 * @utbot.executesCondition {@code (toProperString == null): True}
 * @utbot.executesCondition {@code (numerator == 0): True}
 * @utbot.returnsFrom {@code return toProperString;}
 *  */
    @Test
    public void testToProperString_NumeratorEqualsZero() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        String actual = fraction.toProperString();
        
        String expected = "0";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#toProperString()}
 * @utbot.executesCondition {@code (toProperString == null): True}
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.executesCondition {@code (numerator == denominator): False}
 * @utbot.executesCondition {@code (numerator == -1 * denominator): True}
 * @utbot.returnsFrom {@code return toProperString;}
 *  */
    @Test
    public void testToProperString_NumeratorEqualsNegative1MultiplyDenominator() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 3);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -3);
        
        String actual = fraction.toProperString();
        
        String expected = "-1";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#toProperString()}
 * @utbot.executesCondition {@code (toProperString == null): True}
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.executesCondition {@code (numerator == denominator): True}
 * @utbot.returnsFrom {@code return toProperString;}
 *  */
    @Test
    public void testToProperString_NumeratorEqualsDenominator() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -255);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -255);
        
        String actual = fraction.toProperString();
        
        String expected = "1";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#toProperString()}
 * @utbot.executesCondition {@code (toProperString == null): True}
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.executesCondition {@code (numerator == denominator): False}
 * @utbot.executesCondition {@code (numerator == -1 * denominator): False}
 * @utbot.executesCondition {@code (numerator > 0): False}
 * @utbot.executesCondition {@code (numerator > 0): True}
 * @utbot.executesCondition {@code (properNumerator == 0): True}
 * @utbot.invokes {@link org.apache.commons.lang3.math.Fraction#getProperNumerator()}
 * @utbot.invokes {@link org.apache.commons.lang3.math.Fraction#getProperWhole()}
 * @utbot.invokes {@link java.lang.Integer#toString(int)}
 * @utbot.returnsFrom {@code return toProperString;}
 *  */
    @Test
    public void testToProperString_ProperNumeratorEqualsZero() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", Integer.MIN_VALUE);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", 1);
        
        String actual = fraction.toProperString();
        
        String expected = "-2147483648";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toProperString()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#toProperString()}
 * @utbot.executesCondition {@code (numerator > 0): False}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: int properNumerator = getProperNumerator();
 *  */
    @Test
    public void testToProperString_ThrowArithmeticException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -1);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.toProperString] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.lang3.math.Fraction.getProperNumerator(Fraction.java:383)
            org.apache.commons.lang3.math.Fraction.toProperString(Fraction.java:912) */
        fraction.toProperString();
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#toProperString()}
 * @utbot.executesCondition {@code (numerator > 0): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: int properNumerator = getProperNumerator();
 *  */
    @Test
    public void testToProperString_ThrowArithmeticException_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 1);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.toProperString] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.lang3.math.Fraction.getProperNumerator(Fraction.java:383)
            org.apache.commons.lang3.math.Fraction.toProperString(Fraction.java:912) */
        fraction.toProperString();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toProperString()
    
    @Test
    public void testToProperString1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 17);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -18);
        
        String actual = fraction.toProperString();
        
        String expected = "0 17/-18";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToProperString2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 177);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -178);
        
        String actual = fraction.toProperString();
        
        String expected = "0 177/-178";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToProperString3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -65536);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", 134232061);
        
        String actual = fraction.toProperString();
        
        String expected = "-65536/134232061";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToProperString4() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -13632321);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", 16385);
        
        String actual = fraction.toProperString();
        
        String expected = "-832 1/16385";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToProperString5() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 1777);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -1778);
        
        String actual = fraction.toProperString();
        
        String expected = "0 1777/-1778";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToProperString6() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 130096);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -735);
        
        String actual = fraction.toProperString();
        
        String expected = "-177 1/-735";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.Fraction.getDenominator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDenominator()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getDenominator()}
 * @utbot.returnsFrom {@code return denominator;}
 *  */
    @Test
    public void testGetDenominator_ReturnDenominator() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -255);
        
        int actual = fraction.getDenominator();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.Fraction.getProperNumerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getProperNumerator()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getProperNumerator()}
 * @utbot.invokes {@link java.lang.Math#abs(int)}
 * @utbot.returnsFrom {@code return Math.abs(numerator % denominator);}
 *  */
    @Test
    public void testGetProperNumerator_MathAbs() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -1);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -2);
        
        int actual = fraction.getProperNumerator();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getProperNumerator()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getProperNumerator()}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return Math.abs(numerator % denominator);
 *  */
    @Test
    public void testGetProperNumerator_ThrowArithmeticException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -255);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getProperNumerator] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.lang3.math.Fraction.getProperNumerator(Fraction.java:383) */
        fraction.getProperNumerator();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.Fraction.getReducedFraction
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getReducedFraction(int, int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getReducedFraction(int,int)}
 * @utbot.executesCondition {@code (denominator == 0): False}
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.executesCondition {@code (denominator == Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (denominator < 0): False}
 * @utbot.invokes org.apache.commons.lang3.math.Fraction#greatestCommonDivisor(int,int)
 * @utbot.returnsFrom {@code return new Fraction(numerator, denominator);}
 *  */
    @Test
    public void testGetReducedFraction_DenominatorGreaterOrEqualZero() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(-1, 1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getReducedFraction(int, int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getReducedFraction(int,int)}
 * @utbot.executesCondition {@code (denominator == 0): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: denominator == 0
 *  */
    @Test
    public void testGetReducedFraction_ThrowArithmeticException() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getReducedFraction] produces [java.lang.ArithmeticException: The denominator must not be zero]
            org.apache.commons.lang3.math.Fraction.getReducedFraction(Fraction.java:210) */
        Fraction.getReducedFraction(1, 0);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getReducedFraction(int,int)}
 * @utbot.executesCondition {@code (denominator == 0): False}
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.executesCondition {@code (denominator == Integer.MIN_VALUE): True}
 * @utbot.executesCondition {@code ((numerator & 1) == 0): False}
 * @utbot.executesCondition {@code (denominator < 0): True}
 * @utbot.executesCondition {@code (numerator == Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (denominator == Integer.MIN_VALUE): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: numerator == Integer.MIN_VALUE || denominator == Integer.MIN_VALUE
 *  */
    @Test
    public void testGetReducedFraction_ThrowArithmeticException_1() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getReducedFraction] produces [java.lang.ArithmeticException: overflow: can't negate]
            org.apache.commons.lang3.math.Fraction.getReducedFraction(Fraction.java:222) */
        Fraction.getReducedFraction(1, Integer.MIN_VALUE);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getReducedFraction(int,int)}
 * @utbot.executesCondition {@code (denominator == 0): False}
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.executesCondition {@code (denominator == Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (denominator < 0): True}
 * @utbot.executesCondition {@code (numerator == Integer.MIN_VALUE): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: numerator == Integer.MIN_VALUE || denominator == Integer.MIN_VALUE
 *  */
    @Test
    public void testGetReducedFraction_ThrowArithmeticException_2() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getReducedFraction] produces [java.lang.ArithmeticException: overflow: can't negate]
            org.apache.commons.lang3.math.Fraction.getReducedFraction(Fraction.java:222) */
        Fraction.getReducedFraction(Integer.MIN_VALUE, -1);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getReducedFraction(int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getReducedFraction(int,int)}
     */
    @Test
    public void testGetReducedFraction() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(1, -3);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getReducedFraction(int,int)}
     */
    @Test
    public void testGetReducedFraction1() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(1, 2147483645);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getReducedFraction(int,int)}
     */
    @Test
    public void testGetReducedFractionWithCornerCases() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(Integer.MIN_VALUE, Integer.MAX_VALUE);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getReducedFraction(int,int)}
     */
    @Test
    public void testGetReducedFractionWithCornerCases1() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(Integer.MAX_VALUE, Integer.MAX_VALUE);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getReducedFraction(int,int)}
     */
    @Test
    public void testGetReducedFractionWithCornerCase() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(-2143289344, Integer.MAX_VALUE);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getReducedFraction(int,int)}
     */
    @Test
    public void testGetReducedFraction2() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(-2143289344, -1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getReducedFraction(int,int)}
     */
    @Test
    public void testGetReducedFraction3() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(-2147479552, -33554433);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getReducedFraction(int,int)}
     */
    @Test
    public void testGetReducedFraction4() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(-2147217408, -33554433);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getReducedFraction(int,int)}
     */
    @Test
    public void testGetReducedFractionWithCornerCase1() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(0, 16385);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getReducedFraction(int,int)}
     */
    @Test
    public void testGetReducedFraction5() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(-2147483647, -2147483632);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getReducedFraction(int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getReducedFraction(int,int)}
     */
    @Test
    public void testGetReducedFractionThrowsAEWithCornerCase() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getReducedFraction] produces [java.lang.ArithmeticException: overflow: can't negate]
            org.apache.commons.lang3.math.Fraction.getReducedFraction(Fraction.java:222) */
        Fraction.getReducedFraction(Integer.MIN_VALUE, -1);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getReducedFraction(int,int)}
     */
    @Test
    public void testGetReducedFractionThrowsAEWithCornerCase1() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getReducedFraction] produces [java.lang.ArithmeticException: overflow: can't negate]
            org.apache.commons.lang3.math.Fraction.getReducedFraction(Fraction.java:222) */
        Fraction.getReducedFraction(Integer.MIN_VALUE, -3);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getReducedFraction(int,int)}
     */
    @Test
    public void testGetReducedFractionThrowsAEWithCornerCase2() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getReducedFraction] produces [java.lang.ArithmeticException: overflow: can't negate]
            org.apache.commons.lang3.math.Fraction.getReducedFraction(Fraction.java:222) */
        Fraction.getReducedFraction(Integer.MIN_VALUE, -33554433);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getReducedFraction(int,int)}
     */
    @Test
    public void testGetReducedFractionThrowsAEWithCornerCase3() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getReducedFraction] produces [java.lang.ArithmeticException: overflow: can't negate]
            org.apache.commons.lang3.math.Fraction.getReducedFraction(Fraction.java:222) */
        Fraction.getReducedFraction(-2147483647, Integer.MIN_VALUE);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getReducedFraction(int,int)}
     */
    @Test
    public void testGetReducedFractionThrowsAEWithCornerCase4() {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getReducedFraction] produces [java.lang.ArithmeticException: overflow: can't negate]
            org.apache.commons.lang3.math.Fraction.getReducedFraction(Fraction.java:222) */
        Fraction.getReducedFraction(-2147479551, Integer.MIN_VALUE);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.Fraction.addSub
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addSub(org.apache.commons.lang3.math.Fraction, boolean)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#addSub(org.apache.commons.lang3.math.Fraction,boolean)}
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.executesCondition {@code (fraction.numerator == 0): False}
 * @utbot.executesCondition {@code (d1 == 1): True}
 * @utbot.invokes org.apache.commons.lang3.math.Fraction#greatestCommonDivisor(int,int)
 * @utbot.invokes org.apache.commons.lang3.math.Fraction#mulAndCheck(int,int)
 *  */
    @Test
    public void testAddSub_D1Equals1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 281346050);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "numerator", -256);
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "denominator", 1117276601);
        
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class booleanType = boolean.class;
        Method addSubMethod = fractionClazz.getDeclaredMethod("addSub", fractionClazz, booleanType);
        addSubMethod.setAccessible(true);
        java.lang.Object[] addSubMethodArguments = new java.lang.Object[2];
        addSubMethodArguments[0] = fraction1;
        addSubMethodArguments[1] = false;
        Fraction actual = ((Fraction) addSubMethod.invoke(fraction, addSubMethodArguments));
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#addSub(org.apache.commons.lang3.math.Fraction,boolean)}
 * @utbot.executesCondition {@code (numerator == 0): True}
 * @utbot.executesCondition {@code (isAdd): False}
 * @utbot.invokes {@link org.apache.commons.lang3.math.Fraction#negate()}
 * @utbot.returnsFrom {@code return isAdd ? fraction : fraction.negate();}
 *  */
    @Test
    public void testAddSub_NotIsAdd() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class booleanType = boolean.class;
        Method addSubMethod = fractionClazz.getDeclaredMethod("addSub", fractionClazz, booleanType);
        addSubMethod.setAccessible(true);
        java.lang.Object[] addSubMethodArguments = new java.lang.Object[2];
        addSubMethodArguments[0] = fraction;
        addSubMethodArguments[1] = false;
        Fraction actual = ((Fraction) addSubMethod.invoke(fraction, addSubMethodArguments));
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#addSub(org.apache.commons.lang3.math.Fraction,boolean)}
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.executesCondition {@code (fraction.numerator == 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAddSub_FractionNumeratorEqualsZero() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class booleanType = boolean.class;
        Method addSubMethod = fractionClazz.getDeclaredMethod("addSub", fractionClazz, booleanType);
        addSubMethod.setAccessible(true);
        java.lang.Object[] addSubMethodArguments = new java.lang.Object[2];
        addSubMethodArguments[0] = fraction1;
        addSubMethodArguments[1] = false;
        Fraction actual = ((Fraction) addSubMethod.invoke(fraction, addSubMethodArguments));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(fraction, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#addSub(org.apache.commons.lang3.math.Fraction,boolean)}
 * @utbot.executesCondition {@code (numerator == 0): True}
 * @utbot.executesCondition {@code (isAdd): True}
 * @utbot.returnsFrom {@code return isAdd ? fraction : fraction.negate();}
 *  */
    @Test
    public void testAddSub_IsAdd() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class booleanType = boolean.class;
        Method addSubMethod = fractionClazz.getDeclaredMethod("addSub", fractionClazz, booleanType);
        addSubMethod.setAccessible(true);
        java.lang.Object[] addSubMethodArguments = new java.lang.Object[2];
        addSubMethodArguments[0] = fraction;
        addSubMethodArguments[1] = true;
        Fraction actual = ((Fraction) addSubMethod.invoke(fraction, addSubMethodArguments));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(fraction, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addSub(org.apache.commons.lang3.math.Fraction, boolean)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#addSub(org.apache.commons.lang3.math.Fraction,boolean)}
 * @utbot.executesCondition {@code (fraction == null): False}
 * @utbot.executesCondition {@code (numerator == 0): True}
 * @utbot.executesCondition {@code (isAdd): False}
 * @utbot.invokes {@link org.apache.commons.lang3.math.Fraction#negate()}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: fraction.negate()
 *  */
    @Test
    public void testAddSub_ThrowArithmeticException() throws Throwable  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "numerator", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.addSub] produces [java.lang.ArithmeticException: overflow: too large to negate]
            org.apache.commons.lang3.math.Fraction.negate(Fraction.java:503)
            org.apache.commons.lang3.math.Fraction.addSub(Fraction.java:736) */
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
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
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#addSub(org.apache.commons.lang3.math.Fraction,boolean)}
 * @utbot.executesCondition {@code (fraction == null): False}
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.executesCondition {@code (fraction.numerator == 0): False}
 * @utbot.executesCondition {@code (d1 == 1): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: int uvp = mulAndCheck(numerator, fraction.denominator);
 *  */
    @Test
    public void testAddSub_ThrowArithmeticException_1() throws Throwable  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 2045862976);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "numerator", -254);
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "denominator", -1486701370);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.addSub] produces [java.lang.ArithmeticException: overflow: mul]
            org.apache.commons.lang3.math.Fraction.mulAndCheck(Fraction.java:637)
            org.apache.commons.lang3.math.Fraction.addSub(Fraction.java:746) */
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
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
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#addSub(org.apache.commons.lang3.math.Fraction,boolean)}
 * @utbot.executesCondition {@code (fraction == null): False}
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.executesCondition {@code (fraction.numerator == 0): False}
 * @utbot.executesCondition {@code (d1 == 1): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: int uvp = mulAndCheck(numerator, fraction.denominator);
 *  */
    @Test
    public void testAddSub_ThrowArithmeticException_2() throws Throwable  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 1610612736);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", 2);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "numerator", 1);
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "denominator", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.addSub] produces [java.lang.ArithmeticException: overflow: numerator too large after multiply]
            org.apache.commons.lang3.math.Fraction.addSub(Fraction.java:765) */
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
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
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#addSub(org.apache.commons.lang3.math.Fraction,boolean)}
 * @utbot.executesCondition {@code (fraction == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: fraction == null
 *  */
    @Test
    public void testAddSub_ThrowNullPointerException() throws Throwable  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.addSub] produces [java.lang.NullPointerException: The fraction must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.math.Fraction.addSub(Fraction.java:733) */
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
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
    
    ///region Test suites for executable org.apache.commons.lang3.math.Fraction.mulAndCheck
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mulAndCheck(int, int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#mulAndCheck(int,int)}
 * @utbot.executesCondition {@code (m < Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (m > Integer.MAX_VALUE): False}
 * @utbot.returnsFrom {@code return (int) m;}
 *  */
    @Test
    public void testMulAndCheck_MLessOrEqualIntegerMAX_VALUE() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method mulAndCheckMethod = fractionClazz.getDeclaredMethod("mulAndCheck", intType, intType);
        mulAndCheckMethod.setAccessible(true);
        java.lang.Object[] mulAndCheckMethodArguments = new java.lang.Object[2];
        mulAndCheckMethodArguments[0] = 1;
        mulAndCheckMethodArguments[1] = -231;
        int actual = ((Integer) mulAndCheckMethod.invoke(null, mulAndCheckMethodArguments));
        
        assertEquals(-231, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mulAndCheck(int, int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#mulAndCheck(int,int)}
 * @utbot.executesCondition {@code (m < Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (m > Integer.MAX_VALUE): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: m < Integer.MIN_VALUE || m > Integer.MAX_VALUE
 *  */
    @Test
    public void testMulAndCheck_ThrowArithmeticException() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.mulAndCheck] produces [java.lang.ArithmeticException: overflow: mul]
            org.apache.commons.lang3.math.Fraction.mulAndCheck(Fraction.java:637) */
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method mulAndCheckMethod = fractionClazz.getDeclaredMethod("mulAndCheck", intType, intType);
        mulAndCheckMethod.setAccessible(true);
        java.lang.Object[] mulAndCheckMethodArguments = new java.lang.Object[2];
        mulAndCheckMethodArguments[0] = -16777415;
        mulAndCheckMethodArguments[1] = -192;
        try {
            mulAndCheckMethod.invoke(null, mulAndCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method mulAndCheck(int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#mulAndCheck(int,int)}
     */
    @Test
    public void testMulAndCheckReturnsZeroWithCornerCase() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method mulAndCheckMethod = fractionClazz.getDeclaredMethod("mulAndCheck", intType, intType);
        mulAndCheckMethod.setAccessible(true);
        java.lang.Object[] mulAndCheckMethodArguments = new java.lang.Object[2];
        mulAndCheckMethodArguments[0] = 0;
        mulAndCheckMethodArguments[1] = -2147483640;
        int actual = ((Integer) mulAndCheckMethod.invoke(null, mulAndCheckMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#mulAndCheck(int,int)}
     */
    @Test
    public void testMulAndCheckReturnsZeroWithCornerCase1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method mulAndCheckMethod = fractionClazz.getDeclaredMethod("mulAndCheck", intType, intType);
        mulAndCheckMethod.setAccessible(true);
        java.lang.Object[] mulAndCheckMethodArguments = new java.lang.Object[2];
        mulAndCheckMethodArguments[0] = 0;
        mulAndCheckMethodArguments[1] = -2147483640;
        int actual = ((Integer) mulAndCheckMethod.invoke(null, mulAndCheckMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#mulAndCheck(int,int)}
     */
    @Test
    public void testMulAndCheckReturnsZeroWithCornerCase2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method mulAndCheckMethod = fractionClazz.getDeclaredMethod("mulAndCheck", intType, intType);
        mulAndCheckMethod.setAccessible(true);
        java.lang.Object[] mulAndCheckMethodArguments = new java.lang.Object[2];
        mulAndCheckMethodArguments[0] = 0;
        mulAndCheckMethodArguments[1] = 1;
        int actual = ((Integer) mulAndCheckMethod.invoke(null, mulAndCheckMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#mulAndCheck(int,int)}
     */
    @Test
    public void testMulAndCheckWithCornerCase() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method mulAndCheckMethod = fractionClazz.getDeclaredMethod("mulAndCheck", intType, intType);
        mulAndCheckMethod.setAccessible(true);
        java.lang.Object[] mulAndCheckMethodArguments = new java.lang.Object[2];
        mulAndCheckMethodArguments[0] = Integer.MAX_VALUE;
        mulAndCheckMethodArguments[1] = -1;
        int actual = ((Integer) mulAndCheckMethod.invoke(null, mulAndCheckMethodArguments));
        
        assertEquals(-2147483647, actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method mulAndCheck(int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#mulAndCheck(int,int)}
     */
    @Test
    public void testMulAndCheckThrowsAE() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.mulAndCheck] produces [java.lang.ArithmeticException: overflow: mul]
            org.apache.commons.lang3.math.Fraction.mulAndCheck(Fraction.java:637) */
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method mulAndCheckMethod = fractionClazz.getDeclaredMethod("mulAndCheck", intType, intType);
        mulAndCheckMethod.setAccessible(true);
        java.lang.Object[] mulAndCheckMethodArguments = new java.lang.Object[2];
        mulAndCheckMethodArguments[0] = 2143289343;
        mulAndCheckMethodArguments[1] = 255;
        try {
            mulAndCheckMethod.invoke(null, mulAndCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#mulAndCheck(int,int)}
     */
    @Test
    public void testMulAndCheckThrowsAE1() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.mulAndCheck] produces [java.lang.ArithmeticException: overflow: mul]
            org.apache.commons.lang3.math.Fraction.mulAndCheck(Fraction.java:637) */
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method mulAndCheckMethod = fractionClazz.getDeclaredMethod("mulAndCheck", intType, intType);
        mulAndCheckMethod.setAccessible(true);
        java.lang.Object[] mulAndCheckMethodArguments = new java.lang.Object[2];
        mulAndCheckMethodArguments[0] = 2143289343;
        mulAndCheckMethodArguments[1] = 127;
        try {
            mulAndCheckMethod.invoke(null, mulAndCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#mulAndCheck(int,int)}
     */
    @Test
    public void testMulAndCheckThrowsAEWithCornerCase() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.mulAndCheck] produces [java.lang.ArithmeticException: overflow: mul]
            org.apache.commons.lang3.math.Fraction.mulAndCheck(Fraction.java:637) */
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method mulAndCheckMethod = fractionClazz.getDeclaredMethod("mulAndCheck", intType, intType);
        mulAndCheckMethod.setAccessible(true);
        java.lang.Object[] mulAndCheckMethodArguments = new java.lang.Object[2];
        mulAndCheckMethodArguments[0] = Integer.MAX_VALUE;
        mulAndCheckMethodArguments[1] = 127;
        try {
            mulAndCheckMethod.invoke(null, mulAndCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#mulAndCheck(int,int)}
     */
    @Test
    public void testMulAndCheckThrowsAEWithCornerCase1() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.mulAndCheck] produces [java.lang.ArithmeticException: overflow: mul]
            org.apache.commons.lang3.math.Fraction.mulAndCheck(Fraction.java:637) */
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method mulAndCheckMethod = fractionClazz.getDeclaredMethod("mulAndCheck", intType, intType);
        mulAndCheckMethod.setAccessible(true);
        java.lang.Object[] mulAndCheckMethodArguments = new java.lang.Object[2];
        mulAndCheckMethodArguments[0] = Integer.MAX_VALUE;
        mulAndCheckMethodArguments[1] = 126;
        try {
            mulAndCheckMethod.invoke(null, mulAndCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#mulAndCheck(int,int)}
     */
    @Test
    public void testMulAndCheckThrowsAEWithCornerCase2() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.mulAndCheck] produces [java.lang.ArithmeticException: overflow: mul]
            org.apache.commons.lang3.math.Fraction.mulAndCheck(Fraction.java:637) */
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method mulAndCheckMethod = fractionClazz.getDeclaredMethod("mulAndCheck", intType, intType);
        mulAndCheckMethod.setAccessible(true);
        java.lang.Object[] mulAndCheckMethodArguments = new java.lang.Object[2];
        mulAndCheckMethodArguments[0] = Integer.MAX_VALUE;
        mulAndCheckMethodArguments[1] = 255;
        try {
            mulAndCheckMethod.invoke(null, mulAndCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#mulAndCheck(int,int)}
     */
    @Test
    public void testMulAndCheckThrowsAE2() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.mulAndCheck] produces [java.lang.ArithmeticException: overflow: mul]
            org.apache.commons.lang3.math.Fraction.mulAndCheck(Fraction.java:637) */
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method mulAndCheckMethod = fractionClazz.getDeclaredMethod("mulAndCheck", intType, intType);
        mulAndCheckMethod.setAccessible(true);
        java.lang.Object[] mulAndCheckMethodArguments = new java.lang.Object[2];
        mulAndCheckMethodArguments[0] = 2147479551;
        mulAndCheckMethodArguments[1] = 255;
        try {
            mulAndCheckMethod.invoke(null, mulAndCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#mulAndCheck(int,int)}
     */
    @Test
    public void testMulAndCheckThrowsAE3() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.mulAndCheck] produces [java.lang.ArithmeticException: overflow: mul]
            org.apache.commons.lang3.math.Fraction.mulAndCheck(Fraction.java:637) */
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method mulAndCheckMethod = fractionClazz.getDeclaredMethod("mulAndCheck", intType, intType);
        mulAndCheckMethod.setAccessible(true);
        java.lang.Object[] mulAndCheckMethodArguments = new java.lang.Object[2];
        mulAndCheckMethodArguments[0] = 2147217407;
        mulAndCheckMethodArguments[1] = 255;
        try {
            mulAndCheckMethod.invoke(null, mulAndCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#mulAndCheck(int,int)}
     */
    @Test
    public void testMulAndCheckThrowsAEWithCornerCases() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.mulAndCheck] produces [java.lang.ArithmeticException: overflow: mul]
            org.apache.commons.lang3.math.Fraction.mulAndCheck(Fraction.java:637) */
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method mulAndCheckMethod = fractionClazz.getDeclaredMethod("mulAndCheck", intType, intType);
        mulAndCheckMethod.setAccessible(true);
        java.lang.Object[] mulAndCheckMethodArguments = new java.lang.Object[2];
        mulAndCheckMethodArguments[0] = Integer.MAX_VALUE;
        mulAndCheckMethodArguments[1] = Integer.MAX_VALUE;
        try {
            mulAndCheckMethod.invoke(null, mulAndCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#mulAndCheck(int,int)}
     */
    @Test
    public void testMulAndCheckThrowsAEWithCornerCase3() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.mulAndCheck] produces [java.lang.ArithmeticException: overflow: mul]
            org.apache.commons.lang3.math.Fraction.mulAndCheck(Fraction.java:637) */
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method mulAndCheckMethod = fractionClazz.getDeclaredMethod("mulAndCheck", intType, intType);
        mulAndCheckMethod.setAccessible(true);
        java.lang.Object[] mulAndCheckMethodArguments = new java.lang.Object[2];
        mulAndCheckMethodArguments[0] = 128;
        mulAndCheckMethodArguments[1] = Integer.MIN_VALUE;
        try {
            mulAndCheckMethod.invoke(null, mulAndCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#mulAndCheck(int,int)}
     */
    @Test
    public void testMulAndCheckThrowsAE4() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.mulAndCheck] produces [java.lang.ArithmeticException: overflow: mul]
            org.apache.commons.lang3.math.Fraction.mulAndCheck(Fraction.java:637) */
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method mulAndCheckMethod = fractionClazz.getDeclaredMethod("mulAndCheck", intType, intType);
        mulAndCheckMethod.setAccessible(true);
        java.lang.Object[] mulAndCheckMethodArguments = new java.lang.Object[2];
        mulAndCheckMethodArguments[0] = 128;
        mulAndCheckMethodArguments[1] = -2147483632;
        try {
            mulAndCheckMethod.invoke(null, mulAndCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.Fraction.divideBy
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method divideBy(org.apache.commons.lang3.math.Fraction)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#divideBy(org.apache.commons.lang3.math.Fraction)}
 * @utbot.executesCondition {@code (fraction == null): False}
 * @utbot.executesCondition {@code (fraction.numerator == 0): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: fraction.numerator == 0
 *  */
    @Test
    public void testDivideBy_ThrowArithmeticException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.divideBy] produces [java.lang.ArithmeticException: The fraction to divide by must not be zero]
            org.apache.commons.lang3.math.Fraction.divideBy(Fraction.java:806) */
        fraction.divideBy(fraction);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#divideBy(org.apache.commons.lang3.math.Fraction)}
 * @utbot.executesCondition {@code (fraction == null): False}
 * @utbot.executesCondition {@code (fraction.numerator == 0): False}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return multiplyBy(fraction.invert());
 *  */
    @Test
    public void testDivideBy_ThrowArithmeticException_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.divideBy] produces [java.lang.ArithmeticException: overflow: can't negate numerator]
            org.apache.commons.lang3.math.Fraction.invert(Fraction.java:485)
            org.apache.commons.lang3.math.Fraction.divideBy(Fraction.java:808) */
        fraction.divideBy(fraction);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#divideBy(org.apache.commons.lang3.math.Fraction)}
 * @utbot.executesCondition {@code (fraction == null): False}
 * @utbot.executesCondition {@code (fraction.numerator == 0): False}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return multiplyBy(fraction.invert());
 *  */
    @Test
    public void testDivideBy_ThrowArithmeticException_2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 1);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", Integer.MIN_VALUE);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "numerator", 2);
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "denominator", -1);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.divideBy] produces [java.lang.ArithmeticException: The denominator must not be zero]
            org.apache.commons.lang3.math.Fraction.getReducedFraction(Fraction.java:210)
            org.apache.commons.lang3.math.Fraction.multiplyBy(Fraction.java:789)
            org.apache.commons.lang3.math.Fraction.divideBy(Fraction.java:808) */
        fraction.divideBy(fraction1);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#divideBy(org.apache.commons.lang3.math.Fraction)}
 * @utbot.executesCondition {@code (fraction == null): False}
 * @utbot.executesCondition {@code (fraction.numerator == 0): False}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return multiplyBy(fraction.invert());
 *  */
    @Test
    public void testDivideBy_ThrowArithmeticException_3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -1);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", 1577060352);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "numerator", 940574768);
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "denominator", 1);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.divideBy] produces [java.lang.ArithmeticException: overflow: mulPos]
            org.apache.commons.lang3.math.Fraction.mulPosAndCheck(Fraction.java:655)
            org.apache.commons.lang3.math.Fraction.multiplyBy(Fraction.java:790)
            org.apache.commons.lang3.math.Fraction.divideBy(Fraction.java:808) */
        fraction.divideBy(fraction1);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#divideBy(org.apache.commons.lang3.math.Fraction)}
 * @utbot.executesCondition {@code (fraction == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: fraction == null
 *  */
    @Test
    public void testDivideBy_ThrowNullPointerException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.divideBy] produces [java.lang.NullPointerException: The fraction must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.math.Fraction.divideBy(Fraction.java:804) */
        fraction.divideBy(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.Fraction.subAndCheck
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method subAndCheck(int, int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#subAndCheck(int,int)}
 * @utbot.executesCondition {@code (s < Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (s > Integer.MAX_VALUE): False}
 * @utbot.returnsFrom {@code return (int) s;}
 *  */
    @Test
    public void testSubAndCheck_SLessOrEqualIntegerMAX_VALUE() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method subAndCheck(int, int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#subAndCheck(int,int)}
 * @utbot.executesCondition {@code (s < Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (s > Integer.MAX_VALUE): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: s < Integer.MIN_VALUE || s > Integer.MAX_VALUE
 *  */
    @Test
    public void testSubAndCheck_ThrowArithmeticException() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.subAndCheck] produces [java.lang.ArithmeticException: overflow: add]
            org.apache.commons.lang3.math.Fraction.subAndCheck(Fraction.java:689) */
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
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
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#subAndCheck(int,int)}
 * @utbot.executesCondition {@code (s < Integer.MIN_VALUE): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: s < Integer.MIN_VALUE || s > Integer.MAX_VALUE
 *  */
    @Test
    public void testSubAndCheck_ThrowArithmeticException_1() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.subAndCheck] produces [java.lang.ArithmeticException: overflow: add]
            org.apache.commons.lang3.math.Fraction.subAndCheck(Fraction.java:689) */
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
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
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method subAndCheck(int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#subAndCheck(int,int)}
     */
    @Test
    public void testSubAndCheckWithCornerCase() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method subAndCheckMethod = fractionClazz.getDeclaredMethod("subAndCheck", intType, intType);
        subAndCheckMethod.setAccessible(true);
        java.lang.Object[] subAndCheckMethodArguments = new java.lang.Object[2];
        subAndCheckMethodArguments[0] = 0;
        subAndCheckMethodArguments[1] = -2147483640;
        int actual = ((Integer) subAndCheckMethod.invoke(null, subAndCheckMethodArguments));
        
        assertEquals(2147483640, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#subAndCheck(int,int)}
     */
    @Test
    public void testSubAndCheckWithCornerCase1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method subAndCheckMethod = fractionClazz.getDeclaredMethod("subAndCheck", intType, intType);
        subAndCheckMethod.setAccessible(true);
        java.lang.Object[] subAndCheckMethodArguments = new java.lang.Object[2];
        subAndCheckMethodArguments[0] = 0;
        subAndCheckMethodArguments[1] = -2147483640;
        int actual = ((Integer) subAndCheckMethod.invoke(null, subAndCheckMethodArguments));
        
        assertEquals(2147483640, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#subAndCheck(int,int)}
     */
    @Test
    public void testSubAndCheckWithCornerCase2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method subAndCheckMethod = fractionClazz.getDeclaredMethod("subAndCheck", intType, intType);
        subAndCheckMethod.setAccessible(true);
        java.lang.Object[] subAndCheckMethodArguments = new java.lang.Object[2];
        subAndCheckMethodArguments[0] = 0;
        subAndCheckMethodArguments[1] = 1;
        int actual = ((Integer) subAndCheckMethod.invoke(null, subAndCheckMethodArguments));
        
        assertEquals(-1, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#subAndCheck(int,int)}
     */
    @Test
    public void testSubAndCheck() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method subAndCheckMethod = fractionClazz.getDeclaredMethod("subAndCheck", intType, intType);
        subAndCheckMethod.setAccessible(true);
        java.lang.Object[] subAndCheckMethodArguments = new java.lang.Object[2];
        subAndCheckMethodArguments[0] = 2143289343;
        subAndCheckMethodArguments[1] = 255;
        int actual = ((Integer) subAndCheckMethod.invoke(null, subAndCheckMethodArguments));
        
        assertEquals(2143289088, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#subAndCheck(int,int)}
     */
    @Test
    public void testSubAndCheck1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method subAndCheckMethod = fractionClazz.getDeclaredMethod("subAndCheck", intType, intType);
        subAndCheckMethod.setAccessible(true);
        java.lang.Object[] subAndCheckMethodArguments = new java.lang.Object[2];
        subAndCheckMethodArguments[0] = 2143289343;
        subAndCheckMethodArguments[1] = 127;
        int actual = ((Integer) subAndCheckMethod.invoke(null, subAndCheckMethodArguments));
        
        assertEquals(2143289216, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#subAndCheck(int,int)}
     */
    @Test
    public void testSubAndCheckWithCornerCase3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method subAndCheckMethod = fractionClazz.getDeclaredMethod("subAndCheck", intType, intType);
        subAndCheckMethod.setAccessible(true);
        java.lang.Object[] subAndCheckMethodArguments = new java.lang.Object[2];
        subAndCheckMethodArguments[0] = Integer.MAX_VALUE;
        subAndCheckMethodArguments[1] = 127;
        int actual = ((Integer) subAndCheckMethod.invoke(null, subAndCheckMethodArguments));
        
        assertEquals(2147483520, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#subAndCheck(int,int)}
     */
    @Test
    public void testSubAndCheckWithCornerCase4() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method subAndCheckMethod = fractionClazz.getDeclaredMethod("subAndCheck", intType, intType);
        subAndCheckMethod.setAccessible(true);
        java.lang.Object[] subAndCheckMethodArguments = new java.lang.Object[2];
        subAndCheckMethodArguments[0] = Integer.MAX_VALUE;
        subAndCheckMethodArguments[1] = 126;
        int actual = ((Integer) subAndCheckMethod.invoke(null, subAndCheckMethodArguments));
        
        assertEquals(2147483521, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#subAndCheck(int,int)}
     */
    @Test
    public void testSubAndCheckWithCornerCase5() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method subAndCheckMethod = fractionClazz.getDeclaredMethod("subAndCheck", intType, intType);
        subAndCheckMethod.setAccessible(true);
        java.lang.Object[] subAndCheckMethodArguments = new java.lang.Object[2];
        subAndCheckMethodArguments[0] = Integer.MAX_VALUE;
        subAndCheckMethodArguments[1] = 255;
        int actual = ((Integer) subAndCheckMethod.invoke(null, subAndCheckMethodArguments));
        
        assertEquals(2147483392, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#subAndCheck(int,int)}
     */
    @Test
    public void testSubAndCheck2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method subAndCheckMethod = fractionClazz.getDeclaredMethod("subAndCheck", intType, intType);
        subAndCheckMethod.setAccessible(true);
        java.lang.Object[] subAndCheckMethodArguments = new java.lang.Object[2];
        subAndCheckMethodArguments[0] = 2147479551;
        subAndCheckMethodArguments[1] = 255;
        int actual = ((Integer) subAndCheckMethod.invoke(null, subAndCheckMethodArguments));
        
        assertEquals(2147479296, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#subAndCheck(int,int)}
     */
    @Test
    public void testSubAndCheck3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method subAndCheckMethod = fractionClazz.getDeclaredMethod("subAndCheck", intType, intType);
        subAndCheckMethod.setAccessible(true);
        java.lang.Object[] subAndCheckMethodArguments = new java.lang.Object[2];
        subAndCheckMethodArguments[0] = 2147217407;
        subAndCheckMethodArguments[1] = 255;
        int actual = ((Integer) subAndCheckMethod.invoke(null, subAndCheckMethodArguments));
        
        assertEquals(2147217152, actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method subAndCheck(int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#subAndCheck(int,int)}
     */
    @Test
    public void testSubAndCheckThrowsAEWithCornerCase() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.subAndCheck] produces [java.lang.ArithmeticException: overflow: add]
            org.apache.commons.lang3.math.Fraction.subAndCheck(Fraction.java:689) */
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method subAndCheckMethod = fractionClazz.getDeclaredMethod("subAndCheck", intType, intType);
        subAndCheckMethod.setAccessible(true);
        java.lang.Object[] subAndCheckMethodArguments = new java.lang.Object[2];
        subAndCheckMethodArguments[0] = Integer.MAX_VALUE;
        subAndCheckMethodArguments[1] = -1;
        try {
            subAndCheckMethod.invoke(null, subAndCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#subAndCheck(int,int)}
     */
    @Test
    public void testSubAndCheckThrowsAEWithCornerCase1() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.subAndCheck] produces [java.lang.ArithmeticException: overflow: add]
            org.apache.commons.lang3.math.Fraction.subAndCheck(Fraction.java:689) */
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method subAndCheckMethod = fractionClazz.getDeclaredMethod("subAndCheck", intType, intType);
        subAndCheckMethod.setAccessible(true);
        java.lang.Object[] subAndCheckMethodArguments = new java.lang.Object[2];
        subAndCheckMethodArguments[0] = 128;
        subAndCheckMethodArguments[1] = Integer.MIN_VALUE;
        try {
            subAndCheckMethod.invoke(null, subAndCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#subAndCheck(int,int)}
     */
    @Test
    public void testSubAndCheckThrowsAE() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.subAndCheck] produces [java.lang.ArithmeticException: overflow: add]
            org.apache.commons.lang3.math.Fraction.subAndCheck(Fraction.java:689) */
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method subAndCheckMethod = fractionClazz.getDeclaredMethod("subAndCheck", intType, intType);
        subAndCheckMethod.setAccessible(true);
        java.lang.Object[] subAndCheckMethodArguments = new java.lang.Object[2];
        subAndCheckMethodArguments[0] = 128;
        subAndCheckMethodArguments[1] = -2147483632;
        try {
            subAndCheckMethod.invoke(null, subAndCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#subAndCheck(int,int)}
     */
    @Test
    public void testSubAndCheckThrowsAEWithCornerCase2() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.subAndCheck] produces [java.lang.ArithmeticException: overflow: add]
            org.apache.commons.lang3.math.Fraction.subAndCheck(Fraction.java:689) */
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method subAndCheckMethod = fractionClazz.getDeclaredMethod("subAndCheck", intType, intType);
        subAndCheckMethod.setAccessible(true);
        java.lang.Object[] subAndCheckMethodArguments = new java.lang.Object[2];
        subAndCheckMethodArguments[0] = 192;
        subAndCheckMethodArguments[1] = Integer.MIN_VALUE;
        try {
            subAndCheckMethod.invoke(null, subAndCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#subAndCheck(int,int)}
     */
    @Test
    public void testSubAndCheckThrowsAEWithCornerCase3() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.subAndCheck] produces [java.lang.ArithmeticException: overflow: add]
            org.apache.commons.lang3.math.Fraction.subAndCheck(Fraction.java:689) */
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method subAndCheckMethod = fractionClazz.getDeclaredMethod("subAndCheck", intType, intType);
        subAndCheckMethod.setAccessible(true);
        java.lang.Object[] subAndCheckMethodArguments = new java.lang.Object[2];
        subAndCheckMethodArguments[0] = 2147483639;
        subAndCheckMethodArguments[1] = Integer.MIN_VALUE;
        try {
            subAndCheckMethod.invoke(null, subAndCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.Fraction.getProperWhole
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getProperWhole()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getProperWhole()}
 * @utbot.returnsFrom {@code return numerator / denominator;}
 *  */
    @Test
    public void testGetProperWhole_ReturnNumeratorDivideDenominator() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -255);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -255);
        
        int actual = fraction.getProperWhole();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getProperWhole()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#getProperWhole()}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return numerator / denominator;
 *  */
    @Test
    public void testGetProperWhole_ThrowArithmeticException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -255);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.getProperWhole] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.lang3.math.Fraction.getProperWhole(Fraction.java:398) */
        fraction.getProperWhole();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.Fraction.invert
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method invert()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#invert()}
 * @utbot.executesCondition {@code (numerator < 0): False}
 * @utbot.returnsFrom {@code return new Fraction(denominator, numerator);}
 *  */
    @Test
    public void testInvert_NumeratorGreaterOrEqualZero() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 1);
        
        Fraction actual = fraction.invert();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#invert()}
 * @utbot.executesCondition {@code (numerator < 0): True}
 * @utbot.returnsFrom {@code return new Fraction(-denominator, -numerator);}
 *  */
    @Test
    public void testInvert_NumeratorLessThanZero() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -1);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -3);
        
        Fraction actual = fraction.invert();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method invert()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#invert()}
 * @utbot.executesCondition {@code (numerator == 0): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: numerator == 0
 *  */
    @Test
    public void testInvert_ThrowArithmeticException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.invert] produces [java.lang.ArithmeticException: Unable to invert zero.]
            org.apache.commons.lang3.math.Fraction.invert(Fraction.java:482) */
        fraction.invert();
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#invert()}
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.executesCondition {@code (numerator == Integer.MIN_VALUE): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: numerator == Integer.MIN_VALUE
 *  */
    @Test
    public void testInvert_ThrowArithmeticException_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.invert] produces [java.lang.ArithmeticException: overflow: can't negate numerator]
            org.apache.commons.lang3.math.Fraction.invert(Fraction.java:485) */
        fraction.invert();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.Fraction.addAndCheck
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addAndCheck(int, int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#addAndCheck(int,int)}
 * @utbot.executesCondition {@code (s < Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (s > Integer.MAX_VALUE): False}
 * @utbot.returnsFrom {@code return (int) s;}
 *  */
    @Test
    public void testAddAndCheck_SLessOrEqualIntegerMAX_VALUE() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addAndCheck(int, int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#addAndCheck(int,int)}
 * @utbot.executesCondition {@code (s < Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (s > Integer.MAX_VALUE): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: s < Integer.MIN_VALUE || s > Integer.MAX_VALUE
 *  */
    @Test
    public void testAddAndCheck_ThrowArithmeticException() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.addAndCheck] produces [java.lang.ArithmeticException: overflow: add]
            org.apache.commons.lang3.math.Fraction.addAndCheck(Fraction.java:672) */
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
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
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#addAndCheck(int,int)}
 * @utbot.executesCondition {@code (s < Integer.MIN_VALUE): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: s < Integer.MIN_VALUE || s > Integer.MAX_VALUE
 *  */
    @Test
    public void testAddAndCheck_ThrowArithmeticException_1() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.addAndCheck] produces [java.lang.ArithmeticException: overflow: add]
            org.apache.commons.lang3.math.Fraction.addAndCheck(Fraction.java:672) */
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
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
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addAndCheck(int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#addAndCheck(int,int)}
     */
    @Test
    public void testAddAndCheckWithCornerCase() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method addAndCheckMethod = fractionClazz.getDeclaredMethod("addAndCheck", intType, intType);
        addAndCheckMethod.setAccessible(true);
        java.lang.Object[] addAndCheckMethodArguments = new java.lang.Object[2];
        addAndCheckMethodArguments[0] = 0;
        addAndCheckMethodArguments[1] = -2147483640;
        int actual = ((Integer) addAndCheckMethod.invoke(null, addAndCheckMethodArguments));
        
        assertEquals(-2147483640, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#addAndCheck(int,int)}
     */
    @Test
    public void testAddAndCheckWithCornerCase1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method addAndCheckMethod = fractionClazz.getDeclaredMethod("addAndCheck", intType, intType);
        addAndCheckMethod.setAccessible(true);
        java.lang.Object[] addAndCheckMethodArguments = new java.lang.Object[2];
        addAndCheckMethodArguments[0] = 0;
        addAndCheckMethodArguments[1] = -2147483640;
        int actual = ((Integer) addAndCheckMethod.invoke(null, addAndCheckMethodArguments));
        
        assertEquals(-2147483640, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#addAndCheck(int,int)}
     */
    @Test
    public void testAddAndCheckReturnsOneWithCornerCase() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method addAndCheckMethod = fractionClazz.getDeclaredMethod("addAndCheck", intType, intType);
        addAndCheckMethod.setAccessible(true);
        java.lang.Object[] addAndCheckMethodArguments = new java.lang.Object[2];
        addAndCheckMethodArguments[0] = 0;
        addAndCheckMethodArguments[1] = 1;
        int actual = ((Integer) addAndCheckMethod.invoke(null, addAndCheckMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#addAndCheck(int,int)}
     */
    @Test
    public void testAddAndCheckWithCornerCase2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method addAndCheckMethod = fractionClazz.getDeclaredMethod("addAndCheck", intType, intType);
        addAndCheckMethod.setAccessible(true);
        java.lang.Object[] addAndCheckMethodArguments = new java.lang.Object[2];
        addAndCheckMethodArguments[0] = Integer.MAX_VALUE;
        addAndCheckMethodArguments[1] = -1;
        int actual = ((Integer) addAndCheckMethod.invoke(null, addAndCheckMethodArguments));
        
        assertEquals(2147483646, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#addAndCheck(int,int)}
     */
    @Test
    public void testAddAndCheck() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method addAndCheckMethod = fractionClazz.getDeclaredMethod("addAndCheck", intType, intType);
        addAndCheckMethod.setAccessible(true);
        java.lang.Object[] addAndCheckMethodArguments = new java.lang.Object[2];
        addAndCheckMethodArguments[0] = 2143289343;
        addAndCheckMethodArguments[1] = 255;
        int actual = ((Integer) addAndCheckMethod.invoke(null, addAndCheckMethodArguments));
        
        assertEquals(2143289598, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#addAndCheck(int,int)}
     */
    @Test
    public void testAddAndCheck1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method addAndCheckMethod = fractionClazz.getDeclaredMethod("addAndCheck", intType, intType);
        addAndCheckMethod.setAccessible(true);
        java.lang.Object[] addAndCheckMethodArguments = new java.lang.Object[2];
        addAndCheckMethodArguments[0] = 2143289343;
        addAndCheckMethodArguments[1] = 127;
        int actual = ((Integer) addAndCheckMethod.invoke(null, addAndCheckMethodArguments));
        
        assertEquals(2143289470, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#addAndCheck(int,int)}
     */
    @Test
    public void testAddAndCheck2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method addAndCheckMethod = fractionClazz.getDeclaredMethod("addAndCheck", intType, intType);
        addAndCheckMethod.setAccessible(true);
        java.lang.Object[] addAndCheckMethodArguments = new java.lang.Object[2];
        addAndCheckMethodArguments[0] = 2147479551;
        addAndCheckMethodArguments[1] = 255;
        int actual = ((Integer) addAndCheckMethod.invoke(null, addAndCheckMethodArguments));
        
        assertEquals(2147479806, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#addAndCheck(int,int)}
     */
    @Test
    public void testAddAndCheck3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method addAndCheckMethod = fractionClazz.getDeclaredMethod("addAndCheck", intType, intType);
        addAndCheckMethod.setAccessible(true);
        java.lang.Object[] addAndCheckMethodArguments = new java.lang.Object[2];
        addAndCheckMethodArguments[0] = 2147217407;
        addAndCheckMethodArguments[1] = 255;
        int actual = ((Integer) addAndCheckMethod.invoke(null, addAndCheckMethodArguments));
        
        assertEquals(2147217662, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#addAndCheck(int,int)}
     */
    @Test
    public void testAddAndCheckWithCornerCase3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method addAndCheckMethod = fractionClazz.getDeclaredMethod("addAndCheck", intType, intType);
        addAndCheckMethod.setAccessible(true);
        java.lang.Object[] addAndCheckMethodArguments = new java.lang.Object[2];
        addAndCheckMethodArguments[0] = 128;
        addAndCheckMethodArguments[1] = Integer.MIN_VALUE;
        int actual = ((Integer) addAndCheckMethod.invoke(null, addAndCheckMethodArguments));
        
        assertEquals(-2147483520, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#addAndCheck(int,int)}
     */
    @Test
    public void testAddAndCheck4() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method addAndCheckMethod = fractionClazz.getDeclaredMethod("addAndCheck", intType, intType);
        addAndCheckMethod.setAccessible(true);
        java.lang.Object[] addAndCheckMethodArguments = new java.lang.Object[2];
        addAndCheckMethodArguments[0] = 128;
        addAndCheckMethodArguments[1] = -2147483632;
        int actual = ((Integer) addAndCheckMethod.invoke(null, addAndCheckMethodArguments));
        
        assertEquals(-2147483504, actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method addAndCheck(int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#addAndCheck(int,int)}
     */
    @Test
    public void testAddAndCheckThrowsAEWithCornerCase() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.addAndCheck] produces [java.lang.ArithmeticException: overflow: add]
            org.apache.commons.lang3.math.Fraction.addAndCheck(Fraction.java:672) */
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method addAndCheckMethod = fractionClazz.getDeclaredMethod("addAndCheck", intType, intType);
        addAndCheckMethod.setAccessible(true);
        java.lang.Object[] addAndCheckMethodArguments = new java.lang.Object[2];
        addAndCheckMethodArguments[0] = Integer.MAX_VALUE;
        addAndCheckMethodArguments[1] = 127;
        try {
            addAndCheckMethod.invoke(null, addAndCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#addAndCheck(int,int)}
     */
    @Test
    public void testAddAndCheckThrowsAEWithCornerCase1() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.addAndCheck] produces [java.lang.ArithmeticException: overflow: add]
            org.apache.commons.lang3.math.Fraction.addAndCheck(Fraction.java:672) */
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method addAndCheckMethod = fractionClazz.getDeclaredMethod("addAndCheck", intType, intType);
        addAndCheckMethod.setAccessible(true);
        java.lang.Object[] addAndCheckMethodArguments = new java.lang.Object[2];
        addAndCheckMethodArguments[0] = Integer.MAX_VALUE;
        addAndCheckMethodArguments[1] = 126;
        try {
            addAndCheckMethod.invoke(null, addAndCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#addAndCheck(int,int)}
     */
    @Test
    public void testAddAndCheckThrowsAEWithCornerCase2() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.addAndCheck] produces [java.lang.ArithmeticException: overflow: add]
            org.apache.commons.lang3.math.Fraction.addAndCheck(Fraction.java:672) */
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method addAndCheckMethod = fractionClazz.getDeclaredMethod("addAndCheck", intType, intType);
        addAndCheckMethod.setAccessible(true);
        java.lang.Object[] addAndCheckMethodArguments = new java.lang.Object[2];
        addAndCheckMethodArguments[0] = Integer.MAX_VALUE;
        addAndCheckMethodArguments[1] = 255;
        try {
            addAndCheckMethod.invoke(null, addAndCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#addAndCheck(int,int)}
     */
    @Test
    public void testAddAndCheckThrowsAEWithCornerCases() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.addAndCheck] produces [java.lang.ArithmeticException: overflow: add]
            org.apache.commons.lang3.math.Fraction.addAndCheck(Fraction.java:672) */
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method addAndCheckMethod = fractionClazz.getDeclaredMethod("addAndCheck", intType, intType);
        addAndCheckMethod.setAccessible(true);
        java.lang.Object[] addAndCheckMethodArguments = new java.lang.Object[2];
        addAndCheckMethodArguments[0] = Integer.MAX_VALUE;
        addAndCheckMethodArguments[1] = Integer.MAX_VALUE;
        try {
            addAndCheckMethod.invoke(null, addAndCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#addAndCheck(int,int)}
     */
    @Test
    public void testAddAndCheckThrowsAEWithCornerCase3() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.addAndCheck] produces [java.lang.ArithmeticException: overflow: add]
            org.apache.commons.lang3.math.Fraction.addAndCheck(Fraction.java:672) */
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method addAndCheckMethod = fractionClazz.getDeclaredMethod("addAndCheck", intType, intType);
        addAndCheckMethod.setAccessible(true);
        java.lang.Object[] addAndCheckMethodArguments = new java.lang.Object[2];
        addAndCheckMethodArguments[0] = -9;
        addAndCheckMethodArguments[1] = Integer.MIN_VALUE;
        try {
            addAndCheckMethod.invoke(null, addAndCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.Fraction.mulPosAndCheck
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mulPosAndCheck(int, int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#mulPosAndCheck(int,int)}
 * @utbot.executesCondition {@code (m > Integer.MAX_VALUE): False}
 * @utbot.returnsFrom {@code return (int) m;}
 *  */
    @Test
    public void testMulPosAndCheck_MLessOrEqualIntegerMAX_VALUE() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method mulPosAndCheckMethod = fractionClazz.getDeclaredMethod("mulPosAndCheck", intType, intType);
        mulPosAndCheckMethod.setAccessible(true);
        java.lang.Object[] mulPosAndCheckMethodArguments = new java.lang.Object[2];
        mulPosAndCheckMethodArguments[0] = -2121091076;
        mulPosAndCheckMethodArguments[1] = 1375901696;
        int actual = ((Integer) mulPosAndCheckMethod.invoke(null, mulPosAndCheckMethodArguments));
        
        assertEquals(1161142272, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mulPosAndCheck(int, int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#mulPosAndCheck(int,int)}
 * @utbot.executesCondition {@code (m > Integer.MAX_VALUE): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: m > Integer.MAX_VALUE
 *  */
    @Test
    public void testMulPosAndCheck_ThrowArithmeticException() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.mulPosAndCheck] produces [java.lang.ArithmeticException: overflow: mulPos]
            org.apache.commons.lang3.math.Fraction.mulPosAndCheck(Fraction.java:655) */
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method mulPosAndCheckMethod = fractionClazz.getDeclaredMethod("mulPosAndCheck", intType, intType);
        mulPosAndCheckMethod.setAccessible(true);
        java.lang.Object[] mulPosAndCheckMethodArguments = new java.lang.Object[2];
        mulPosAndCheckMethodArguments[0] = 1174404931;
        mulPosAndCheckMethodArguments[1] = 1542439521;
        try {
            mulPosAndCheckMethod.invoke(null, mulPosAndCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method mulPosAndCheck(int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#mulPosAndCheck(int,int)}
     */
    @Test
    public void testMulPosAndCheckWithCornerCase() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method mulPosAndCheckMethod = fractionClazz.getDeclaredMethod("mulPosAndCheck", intType, intType);
        mulPosAndCheckMethod.setAccessible(true);
        java.lang.Object[] mulPosAndCheckMethodArguments = new java.lang.Object[2];
        mulPosAndCheckMethodArguments[0] = -2147483647;
        mulPosAndCheckMethodArguments[1] = Integer.MAX_VALUE;
        int actual = ((Integer) mulPosAndCheckMethod.invoke(null, mulPosAndCheckMethodArguments));
        
        assertEquals(-1, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#mulPosAndCheck(int,int)}
     */
    @Test
    public void testMulPosAndCheckWithCornerCases() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method mulPosAndCheckMethod = fractionClazz.getDeclaredMethod("mulPosAndCheck", intType, intType);
        mulPosAndCheckMethod.setAccessible(true);
        java.lang.Object[] mulPosAndCheckMethodArguments = new java.lang.Object[2];
        mulPosAndCheckMethodArguments[0] = Integer.MIN_VALUE;
        mulPosAndCheckMethodArguments[1] = Integer.MAX_VALUE;
        int actual = ((Integer) mulPosAndCheckMethod.invoke(null, mulPosAndCheckMethodArguments));
        
        assertEquals(Integer.MIN_VALUE, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#mulPosAndCheck(int,int)}
     */
    @Test
    public void testMulPosAndCheckReturnsZeroWithCornerCase() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method mulPosAndCheckMethod = fractionClazz.getDeclaredMethod("mulPosAndCheck", intType, intType);
        mulPosAndCheckMethod.setAccessible(true);
        java.lang.Object[] mulPosAndCheckMethodArguments = new java.lang.Object[2];
        mulPosAndCheckMethodArguments[0] = 16;
        mulPosAndCheckMethodArguments[1] = Integer.MIN_VALUE;
        int actual = ((Integer) mulPosAndCheckMethod.invoke(null, mulPosAndCheckMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#mulPosAndCheck(int,int)}
     */
    @Test
    public void testMulPosAndCheckReturnsZeroWithCornerCase1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method mulPosAndCheckMethod = fractionClazz.getDeclaredMethod("mulPosAndCheck", intType, intType);
        mulPosAndCheckMethod.setAccessible(true);
        java.lang.Object[] mulPosAndCheckMethodArguments = new java.lang.Object[2];
        mulPosAndCheckMethodArguments[0] = 16;
        mulPosAndCheckMethodArguments[1] = 0;
        int actual = ((Integer) mulPosAndCheckMethod.invoke(null, mulPosAndCheckMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#mulPosAndCheck(int,int)}
     */
    @Test
    public void testMulPosAndCheckReturnsZeroWithCornerCases() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method mulPosAndCheckMethod = fractionClazz.getDeclaredMethod("mulPosAndCheck", intType, intType);
        mulPosAndCheckMethod.setAccessible(true);
        java.lang.Object[] mulPosAndCheckMethodArguments = new java.lang.Object[2];
        mulPosAndCheckMethodArguments[0] = 0;
        mulPosAndCheckMethodArguments[1] = 0;
        int actual = ((Integer) mulPosAndCheckMethod.invoke(null, mulPosAndCheckMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#mulPosAndCheck(int,int)}
     */
    @Test
    public void testMulPosAndCheckReturnsZeroWithCornerCase2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method mulPosAndCheckMethod = fractionClazz.getDeclaredMethod("mulPosAndCheck", intType, intType);
        mulPosAndCheckMethod.setAccessible(true);
        java.lang.Object[] mulPosAndCheckMethodArguments = new java.lang.Object[2];
        mulPosAndCheckMethodArguments[0] = 0;
        mulPosAndCheckMethodArguments[1] = 2;
        int actual = ((Integer) mulPosAndCheckMethod.invoke(null, mulPosAndCheckMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#mulPosAndCheck(int,int)}
     */
    @Test
    public void testMulPosAndCheckReturnsZeroWithCornerCase3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method mulPosAndCheckMethod = fractionClazz.getDeclaredMethod("mulPosAndCheck", intType, intType);
        mulPosAndCheckMethod.setAccessible(true);
        java.lang.Object[] mulPosAndCheckMethodArguments = new java.lang.Object[2];
        mulPosAndCheckMethodArguments[0] = 0;
        mulPosAndCheckMethodArguments[1] = 33554432;
        int actual = ((Integer) mulPosAndCheckMethod.invoke(null, mulPosAndCheckMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#mulPosAndCheck(int,int)}
     */
    @Test
    public void testMulPosAndCheckReturnsZeroWithCornerCase4() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method mulPosAndCheckMethod = fractionClazz.getDeclaredMethod("mulPosAndCheck", intType, intType);
        mulPosAndCheckMethod.setAccessible(true);
        java.lang.Object[] mulPosAndCheckMethodArguments = new java.lang.Object[2];
        mulPosAndCheckMethodArguments[0] = 0;
        mulPosAndCheckMethodArguments[1] = 33554432;
        int actual = ((Integer) mulPosAndCheckMethod.invoke(null, mulPosAndCheckMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#mulPosAndCheck(int,int)}
     */
    @Test
    public void testMulPosAndCheckReturns5() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method mulPosAndCheckMethod = fractionClazz.getDeclaredMethod("mulPosAndCheck", intType, intType);
        mulPosAndCheckMethod.setAccessible(true);
        java.lang.Object[] mulPosAndCheckMethodArguments = new java.lang.Object[2];
        mulPosAndCheckMethodArguments[0] = 1;
        mulPosAndCheckMethodArguments[1] = 5;
        int actual = ((Integer) mulPosAndCheckMethod.invoke(null, mulPosAndCheckMethodArguments));
        
        assertEquals(5, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#mulPosAndCheck(int,int)}
     */
    @Test
    public void testMulPosAndCheckWithCornerCases1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method mulPosAndCheckMethod = fractionClazz.getDeclaredMethod("mulPosAndCheck", intType, intType);
        mulPosAndCheckMethod.setAccessible(true);
        java.lang.Object[] mulPosAndCheckMethodArguments = new java.lang.Object[2];
        mulPosAndCheckMethodArguments[0] = Integer.MAX_VALUE;
        mulPosAndCheckMethodArguments[1] = Integer.MIN_VALUE;
        int actual = ((Integer) mulPosAndCheckMethod.invoke(null, mulPosAndCheckMethodArguments));
        
        assertEquals(Integer.MIN_VALUE, actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method mulPosAndCheck(int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#mulPosAndCheck(int,int)}
     */
    @Test
    public void testMulPosAndCheckThrowsAEWithCornerCase() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.mulPosAndCheck] produces [java.lang.ArithmeticException: overflow: mulPos]
            org.apache.commons.lang3.math.Fraction.mulPosAndCheck(Fraction.java:655) */
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method mulPosAndCheckMethod = fractionClazz.getDeclaredMethod("mulPosAndCheck", intType, intType);
        mulPosAndCheckMethod.setAccessible(true);
        java.lang.Object[] mulPosAndCheckMethodArguments = new java.lang.Object[2];
        mulPosAndCheckMethodArguments[0] = Integer.MIN_VALUE;
        mulPosAndCheckMethodArguments[1] = -2147483640;
        try {
            mulPosAndCheckMethod.invoke(null, mulPosAndCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#mulPosAndCheck(int,int)}
     */
    @Test
    public void testMulPosAndCheckThrowsAEWithCornerCase1() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.mulPosAndCheck] produces [java.lang.ArithmeticException: overflow: mulPos]
            org.apache.commons.lang3.math.Fraction.mulPosAndCheck(Fraction.java:655) */
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method mulPosAndCheckMethod = fractionClazz.getDeclaredMethod("mulPosAndCheck", intType, intType);
        mulPosAndCheckMethod.setAccessible(true);
        java.lang.Object[] mulPosAndCheckMethodArguments = new java.lang.Object[2];
        mulPosAndCheckMethodArguments[0] = Integer.MIN_VALUE;
        mulPosAndCheckMethodArguments[1] = -2147483640;
        try {
            mulPosAndCheckMethod.invoke(null, mulPosAndCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#mulPosAndCheck(int,int)}
     */
    @Test
    public void testMulPosAndCheckThrowsAE() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.mulPosAndCheck] produces [java.lang.ArithmeticException: overflow: mulPos]
            org.apache.commons.lang3.math.Fraction.mulPosAndCheck(Fraction.java:655) */
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method mulPosAndCheckMethod = fractionClazz.getDeclaredMethod("mulPosAndCheck", intType, intType);
        mulPosAndCheckMethod.setAccessible(true);
        java.lang.Object[] mulPosAndCheckMethodArguments = new java.lang.Object[2];
        mulPosAndCheckMethodArguments[0] = 64;
        mulPosAndCheckMethodArguments[1] = 33554432;
        try {
            mulPosAndCheckMethod.invoke(null, mulPosAndCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#mulPosAndCheck(int,int)}
     */
    @Test
    public void testMulPosAndCheckThrowsAEWithCornerCase2() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.mulPosAndCheck] produces [java.lang.ArithmeticException: overflow: mulPos]
            org.apache.commons.lang3.math.Fraction.mulPosAndCheck(Fraction.java:655) */
        Class fractionClazz = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class intType = int.class;
        Method mulPosAndCheckMethod = fractionClazz.getDeclaredMethod("mulPosAndCheck", intType, intType);
        mulPosAndCheckMethod.setAccessible(true);
        java.lang.Object[] mulPosAndCheckMethodArguments = new java.lang.Object[2];
        mulPosAndCheckMethodArguments[0] = 8;
        mulPosAndCheckMethodArguments[1] = Integer.MAX_VALUE;
        try {
            mulPosAndCheckMethod.invoke(null, mulPosAndCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.Fraction.multiplyBy
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method multiplyBy(org.apache.commons.lang3.math.Fraction)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#multiplyBy(org.apache.commons.lang3.math.Fraction)}
 * @utbot.executesCondition {@code (fraction == null): False}
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.executesCondition {@code (fraction.numerator == 0): False}
 * @utbot.invokes org.apache.commons.lang3.math.Fraction#greatestCommonDivisor(int,int)
 * @utbot.invokes org.apache.commons.lang3.math.Fraction#greatestCommonDivisor(int,int)
 * @utbot.invokes org.apache.commons.lang3.math.Fraction#mulAndCheck(int,int)
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: mulAndCheck(numerator / d1, fraction.numerator / d2)
 *  */
    @Test
    public void testMultiplyBy_ThrowArithmeticException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", Integer.MIN_VALUE);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "numerator", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.multiplyBy] produces [java.lang.ArithmeticException: overflow: gcd is 2^31]
            org.apache.commons.lang3.math.Fraction.greatestCommonDivisor(Fraction.java:569)
            org.apache.commons.lang3.math.Fraction.multiplyBy(Fraction.java:787) */
        fraction.multiplyBy(fraction1);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#multiplyBy(org.apache.commons.lang3.math.Fraction)}
 * @utbot.executesCondition {@code (fraction == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: fraction == null
 *  */
    @Test
    public void testMultiplyBy_ThrowNullPointerException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.multiplyBy] produces [java.lang.NullPointerException: The fraction must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.math.Fraction.multiplyBy(Fraction.java:781) */
        fraction.multiplyBy(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.Fraction.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add(org.apache.commons.lang3.math.Fraction)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#add(org.apache.commons.lang3.math.Fraction)}
 *  */
    @Test
    public void testAdd() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 2080374789);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "numerator", 4096);
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "denominator", 276885512);
        
        Fraction actual = fraction.add(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#add(org.apache.commons.lang3.math.Fraction)}
 * @utbot.returnsFrom {@code return addSub(fraction, true);}
 *  */
    @Test
    public void testAdd_ReturnAddSub() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        Fraction actual = fraction.add(fraction);
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(fraction, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#add(org.apache.commons.lang3.math.Fraction)}
 * @utbot.returnsFrom {@code return addSub(fraction, true);}
 *  */
    @Test
    public void testAdd_ReturnAddSub_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        Fraction actual = fraction.add(fraction1);
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(fraction, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(org.apache.commons.lang3.math.Fraction)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#add(org.apache.commons.lang3.math.Fraction)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return addSub(fraction, true);
 *  */
    @Test
    public void testAdd_ThrowArithmeticException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 2045862976);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "numerator", -254);
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "denominator", -1486701370);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.add] produces [java.lang.ArithmeticException: overflow: mul]
            org.apache.commons.lang3.math.Fraction.mulAndCheck(Fraction.java:637)
            org.apache.commons.lang3.math.Fraction.addSub(Fraction.java:746)
            org.apache.commons.lang3.math.Fraction.add(Fraction.java:705) */
        fraction.add(fraction1);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#add(org.apache.commons.lang3.math.Fraction)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return addSub(fraction, true);
 *  */
    @Test
    public void testAdd_ThrowNullPointerException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.add] produces [java.lang.NullPointerException: The fraction must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.math.Fraction.addSub(Fraction.java:733)
            org.apache.commons.lang3.math.Fraction.add(Fraction.java:705) */
        fraction.add(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.Fraction.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_Obj() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        boolean actual = fraction.equals(fraction);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (obj instanceof Fraction == false): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEquals_ObjInstanceOfFractionEqualsFalse() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
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
    ///     {@link org.apache.commons.lang3.math.Fraction#getNumerator()} twice
    /// return from: {@code return (getNumerator() == other.getNumerator() && getDenominator() == other.getDenominator());}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return (getNumerator() == other.getNumerator() && getDenominator() == other.getDenominator());}
 *  */
    @Test
    public void testEquals_GetNumeratorNotEqualsOtherGetNumeratorAndGetDenominatorNotEqualsOtherGetDenominator() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        boolean actual = fraction.equals(fraction1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (getDenominator() == other.getDenominator()): False}
 * @utbot.returnsFrom {@code return (getNumerator() == other.getNumerator() && getDenominator() == other.getDenominator());}
 *  */
    @Test
    public void testEquals_GetDenominatorNotEqualsOtherGetDenominator() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -255);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "numerator", -255);
        
        boolean actual = fraction.equals(fraction1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (getDenominator() == other.getDenominator()): True}
 * @utbot.returnsFrom {@code return (getNumerator() == other.getNumerator() && getDenominator() == other.getDenominator());}
 *  */
    @Test
    public void testEquals_GetDenominatorEqualsOtherGetDenominator() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -255);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -255);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "numerator", -255);
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "denominator", -255);
        
        boolean actual = fraction.equals(fraction1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.Fraction.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#toString()}
 * @utbot.executesCondition {@code (toString == null): False}
 * @utbot.returnsFrom {@code return toString;}
 *  */
    @Test
    public void testToString_ToStringNotEqualsNull() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        String toString = "";
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "toString", toString);
        
        String actual = fraction.toString();
        
        assertEquals(toString, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#toString()}
 * @utbot.executesCondition {@code (toString == null): True}
 * @utbot.invokes {@link org.apache.commons.lang3.math.Fraction#getNumerator()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(char)}
 * @utbot.invokes {@link org.apache.commons.lang3.math.Fraction#getDenominator()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return toString;}
 *  */
    @Test
    public void testToString_ToStringEqualsNull() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        String actual = fraction.toString();
        
        String expected = "0/0";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString()
    
    @Test
    public void testToString1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -1);
        
        String actual = fraction.toString();
        
        String expected = "-1/0";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", 1777);
        
        String actual = fraction.toString();
        
        String expected = "0/1777";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", Integer.MIN_VALUE);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", 1777);
        
        String actual = fraction.toString();
        
        String expected = "-2147483648/1777";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString4() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -17);
        
        String actual = fraction.toString();
        
        String expected = "0/-17";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString5() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", Integer.MIN_VALUE);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -177);
        
        String actual = fraction.toString();
        
        String expected = "-2147483648/-177";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString6() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", 177);
        
        String actual = fraction.toString();
        
        String expected = "0/177";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString7() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -137);
        
        String actual = fraction.toString();
        
        String expected = "-137/0";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString8() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -1737);
        
        String actual = fraction.toString();
        
        String expected = "-1737/0";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString9() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -1);
        
        String actual = fraction.toString();
        
        String expected = "0/-1";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.Fraction.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#hashCode()}
 * @utbot.executesCondition {@code (hashCode == 0): False}
 * @utbot.returnsFrom {@code return hashCode;}
 *  */
    @Test
    public void testHashCode_HashCodeNotEqualsZero() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "hashCode", -255);
        
        int actual = fraction.hashCode();
        
        assertEquals(-255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#hashCode()}
 * @utbot.executesCondition {@code (hashCode == 0): True}
 * @utbot.invokes {@link org.apache.commons.lang3.math.Fraction#getNumerator()}
 * @utbot.invokes {@link org.apache.commons.lang3.math.Fraction#getDenominator()}
 * @utbot.returnsFrom {@code return hashCode;}
 *  */
    @Test
    public void testHashCode_HashCodeEqualsZero() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -255);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -255);
        
        int actual = fraction.hashCode();
        
        assertEquals(13583, actual);
        
        int finalFractionHashCode = ((Integer) getFieldValue(fraction, "org.apache.commons.lang3.math.Fraction", "hashCode"));
        
        assertEquals(13583, finalFractionHashCode);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.Fraction.abs
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method abs()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#abs()}
 * @utbot.executesCondition {@code (numerator >= 0): False}
 * @utbot.invokes {@link org.apache.commons.lang3.math.Fraction#negate()}
 * @utbot.returnsFrom {@code return negate();}
 *  */
    @Test
    public void testAbs_NumeratorLessThanZero() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -1);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -255);
        
        Fraction actual = fraction.abs();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#abs()}
 * @utbot.executesCondition {@code (numerator >= 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAbs_NumeratorGreaterOrEqualZero() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        Fraction actual = fraction.abs();
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(fraction, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method abs()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#abs()}
 * @utbot.executesCondition {@code (numerator >= 0): False}
 * @utbot.invokes {@link org.apache.commons.lang3.math.Fraction#negate()}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return negate();
 *  */
    @Test
    public void testAbs_ThrowArithmeticException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.abs] produces [java.lang.ArithmeticException: overflow: too large to negate]
            org.apache.commons.lang3.math.Fraction.negate(Fraction.java:503)
            org.apache.commons.lang3.math.Fraction.abs(Fraction.java:521) */
        fraction.abs();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.Fraction.pow
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method pow(int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#pow(int)}
 * @utbot.executesCondition {@code (power == 1): False}
 * @utbot.executesCondition {@code (power == 0): False}
 * @utbot.executesCondition {@code (power < 0): True}
 * @utbot.executesCondition {@code (power == Integer.MIN_VALUE): False}
 * @utbot.triggersRecursion pow, where the test return from: {@code return this;}
 * @utbot.returnsFrom {@code return this.invert().pow(-power);}
 *  */
    @Test
    public void testPow_PowerNotEqualsIntegerMIN_VALUE() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -1);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -3);
        
        Fraction actual = fraction.pow(-1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#pow(int)}
 * @utbot.executesCondition {@code (power == 1): False}
 * @utbot.executesCondition {@code (power == 0): False}
 * @utbot.executesCondition {@code (power < 0): True}
 * @utbot.executesCondition {@code (power == Integer.MIN_VALUE): False}
 * @utbot.triggersRecursion pow, where the test return from: {@code return this;}
 * @utbot.returnsFrom {@code return this.invert().pow(-power);}
 *  */
    @Test
    public void testPow_PowerNotEqualsIntegerMIN_VALUE_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 1);
        
        Fraction actual = fraction.pow(-1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#pow(int)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testPow_Return() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        Fraction actual = fraction.pow(1);
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(fraction, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method pow(int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#pow(int)}
 * @utbot.executesCondition {@code (power == Integer.MIN_VALUE): False}
 * @utbot.invokes {@link org.apache.commons.lang3.math.Fraction#invert()}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return this.invert().pow(-power);
 *  */
    @Test
    public void testPow_ThrowArithmeticException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.pow] produces [java.lang.ArithmeticException: Unable to invert zero.]
            org.apache.commons.lang3.math.Fraction.invert(Fraction.java:482)
            org.apache.commons.lang3.math.Fraction.pow(Fraction.java:545) */
        fraction.pow(-1);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#pow(int)}
 * @utbot.executesCondition {@code (power == Integer.MIN_VALUE): True}
 * @utbot.invokes {@link org.apache.commons.lang3.math.Fraction#invert()}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return this.invert().pow(2).pow(-(power / 2));
 *  */
    @Test
    public void testPow_ThrowArithmeticException_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.pow] produces [java.lang.ArithmeticException: overflow: can't negate numerator]
            org.apache.commons.lang3.math.Fraction.invert(Fraction.java:485)
            org.apache.commons.lang3.math.Fraction.pow(Fraction.java:543) */
        fraction.pow(Integer.MIN_VALUE);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method pow(int)
    
    @Test
    public void testPow1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -2);
        
        Fraction actual = fraction.pow(-3);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 1008);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", 126);
        
        Fraction actual = fraction.pow(2);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 8);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -3);
        
        Fraction actual = fraction.pow(2);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow4() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 268219461);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -1072877844);
        
        Fraction actual = fraction.pow(2);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow5() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 8);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", 3);
        
        Fraction actual = fraction.pow(2);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow6() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -974511944);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -121813993);
        
        Fraction actual = fraction.pow(2);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow7() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 4);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", 3);
        
        Fraction actual = fraction.pow(2);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow8() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 1);
        
        Fraction actual = fraction.pow(-3);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method pow(int)
    
    @Test
    public void testPow9() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 957775612);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", 2072716994);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.pow] produces [java.lang.ArithmeticException: overflow: mul]
            org.apache.commons.lang3.math.Fraction.mulAndCheck(Fraction.java:637)
            org.apache.commons.lang3.math.Fraction.multiplyBy(Fraction.java:789)
            org.apache.commons.lang3.math.Fraction.pow(Fraction.java:547) */
        fraction.pow(16);
    }
    
    @Test
    public void testPow10() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -7);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", Integer.MAX_VALUE);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.pow] produces [java.lang.ArithmeticException: overflow: mulPos]
            org.apache.commons.lang3.math.Fraction.mulPosAndCheck(Fraction.java:655)
            org.apache.commons.lang3.math.Fraction.multiplyBy(Fraction.java:790)
            org.apache.commons.lang3.math.Fraction.pow(Fraction.java:547) */
        fraction.pow(2);
    }
    
    @Test
    public void testPow11() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -1);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.pow] produces [java.lang.ArithmeticException: The denominator must not be zero]
            org.apache.commons.lang3.math.Fraction.getReducedFraction(Fraction.java:210)
            org.apache.commons.lang3.math.Fraction.multiplyBy(Fraction.java:789)
            org.apache.commons.lang3.math.Fraction.pow(Fraction.java:547) */
        fraction.pow(4);
    }
    
    @Test
    public void testPow12() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 1073741830);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -536870911);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.pow] produces [java.lang.ArithmeticException: overflow: mul]
            org.apache.commons.lang3.math.Fraction.mulAndCheck(Fraction.java:637)
            org.apache.commons.lang3.math.Fraction.multiplyBy(Fraction.java:789)
            org.apache.commons.lang3.math.Fraction.pow(Fraction.java:547) */
        fraction.pow(2);
    }
    
    @Test
    public void testPow13() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 957762700);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", 462104130);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.pow] produces [java.lang.ArithmeticException: overflow: mul]
            org.apache.commons.lang3.math.Fraction.mulAndCheck(Fraction.java:637)
            org.apache.commons.lang3.math.Fraction.multiplyBy(Fraction.java:789)
            org.apache.commons.lang3.math.Fraction.pow(Fraction.java:547) */
        fraction.pow(16);
    }
    
    @Test
    public void testPow14() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -1073741828);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", 268435455);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.pow] produces [java.lang.ArithmeticException: overflow: mul]
            org.apache.commons.lang3.math.Fraction.mulAndCheck(Fraction.java:637)
            org.apache.commons.lang3.math.Fraction.multiplyBy(Fraction.java:789)
            org.apache.commons.lang3.math.Fraction.pow(Fraction.java:547) */
        fraction.pow(2);
    }
    
    @Test
    public void testPow15() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 10354704);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -647169);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.pow] produces [java.lang.ArithmeticException: overflow: mul]
            org.apache.commons.lang3.math.Fraction.mulAndCheck(Fraction.java:637)
            org.apache.commons.lang3.math.Fraction.multiplyBy(Fraction.java:789)
            org.apache.commons.lang3.math.Fraction.pow(Fraction.java:547)
            org.apache.commons.lang3.math.Fraction.pow(Fraction.java:549)
            org.apache.commons.lang3.math.Fraction.pow(Fraction.java:549) */
        fraction.pow(16777216);
    }
    
    @Test
    public void testPow16() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 134209540);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", 2147481597);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.pow] produces [java.lang.ArithmeticException: overflow: mul]
            org.apache.commons.lang3.math.Fraction.mulAndCheck(Fraction.java:637)
            org.apache.commons.lang3.math.Fraction.multiplyBy(Fraction.java:789)
            org.apache.commons.lang3.math.Fraction.pow(Fraction.java:547) */
        fraction.pow(2);
    }
    
    @Test
    public void testPow17() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -1881194758);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -807452930);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.pow] produces [java.lang.ArithmeticException: overflow: mul]
            org.apache.commons.lang3.math.Fraction.mulAndCheck(Fraction.java:637)
            org.apache.commons.lang3.math.Fraction.multiplyBy(Fraction.java:789)
            org.apache.commons.lang3.math.Fraction.pow(Fraction.java:547) */
        fraction.pow(2);
    }
    
    @Test
    public void testPow18() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 3);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -4);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.pow] produces [java.lang.ArithmeticException: overflow: mulPos]
            org.apache.commons.lang3.math.Fraction.mulPosAndCheck(Fraction.java:655)
            org.apache.commons.lang3.math.Fraction.multiplyBy(Fraction.java:790)
            org.apache.commons.lang3.math.Fraction.pow(Fraction.java:547)
            org.apache.commons.lang3.math.Fraction.pow(Fraction.java:549)
            org.apache.commons.lang3.math.Fraction.pow(Fraction.java:549)
            org.apache.commons.lang3.math.Fraction.pow(Fraction.java:549) */
        fraction.pow(1048576);
    }
    
    @Test
    public void testPow19() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 202375169);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", 809500668);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.pow] produces [java.lang.ArithmeticException: overflow: mul]
            org.apache.commons.lang3.math.Fraction.mulAndCheck(Fraction.java:637)
            org.apache.commons.lang3.math.Fraction.multiplyBy(Fraction.java:789)
            org.apache.commons.lang3.math.Fraction.pow(Fraction.java:547) */
        fraction.pow(2);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.Fraction.compareTo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method compareTo(org.apache.commons.lang3.math.Fraction)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#compareTo(org.apache.commons.lang3.math.Fraction)}
 * @utbot.executesCondition {@code (other): True}
 *  */
    @Test
    public void testCompareTo_Other() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        int actual = fraction.compareTo(fraction);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#compareTo(org.apache.commons.lang3.math.Fraction)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (numerator == other.numerator): True}
 * @utbot.executesCondition {@code (denominator == other.denominator): True}
 *  */
    @Test
    public void testCompareTo_DenominatorEqualsOtherDenominator() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 1);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -255);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "numerator", 1);
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "denominator", -255);
        
        int actual = fraction.compareTo(fraction1);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#compareTo(org.apache.commons.lang3.math.Fraction)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (numerator == other.numerator): False}
 * @utbot.executesCondition {@code (first == second): True}
 *  */
    @Test
    public void testCompareTo_FirstEqualsSecond() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -188);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -3008);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "numerator", -16);
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "denominator", -256);
        
        int actual = fraction.compareTo(fraction1);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method compareTo(org.apache.commons.lang3.math.Fraction)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (other): False},
    ///     {@code (first == second): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#compareTo(org.apache.commons.lang3.math.Fraction)}
 * @utbot.executesCondition {@code (numerator == other.numerator): False}
 * @utbot.executesCondition {@code (first < second): True}
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void testCompareTo_FirstLessThanSecond() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 1);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", 1444413952);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "numerator", 98);
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "denominator", -254);
        
        int actual = fraction.compareTo(fraction1);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#compareTo(org.apache.commons.lang3.math.Fraction)}
 * @utbot.executesCondition {@code (numerator == other.numerator): False}
 * @utbot.executesCondition {@code (first < second): False}
 * @utbot.returnsFrom {@code return 1;}
 *  */
    @Test
    public void testCompareTo_FirstGreaterOrEqualSecond() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 176);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -526104929);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "numerator", 145);
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "denominator", 23);
        
        int actual = fraction.compareTo(fraction1);
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#compareTo(org.apache.commons.lang3.math.Fraction)}
 * @utbot.executesCondition {@code (numerator == other.numerator): True}
 * @utbot.executesCondition {@code (denominator == other.denominator): False}
 * @utbot.executesCondition {@code (first < second): True}
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void testCompareTo_DenominatorNotEqualsOtherDenominator() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 9);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -240);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "numerator", 9);
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "denominator", -512636927);
        
        int actual = fraction.compareTo(fraction1);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method compareTo(org.apache.commons.lang3.math.Fraction)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#compareTo(org.apache.commons.lang3.math.Fraction)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: numerator == other.numerator && denominator == other.denominator
 *  */
    @Test
    public void testCompareTo_ThrowNullPointerException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -255);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.compareTo] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.math.Fraction.compareTo(Fraction.java:865) */
        fraction.compareTo(((Fraction) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.Fraction.intValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method intValue()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#intValue()}
 * @utbot.returnsFrom {@code return numerator / denominator;}
 *  */
    @Test
    public void testIntValue_ReturnNumeratorDivideDenominator() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -255);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -255);
        
        int actual = fraction.intValue();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method intValue()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#intValue()}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return numerator / denominator;
 *  */
    @Test
    public void testIntValue_ThrowArithmeticException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -255);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.intValue] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.lang3.math.Fraction.intValue(Fraction.java:412) */
        fraction.intValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.Fraction.longValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method longValue()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#longValue()}
 * @utbot.returnsFrom {@code return (long) numerator / denominator;}
 *  */
    @Test
    public void testLongValue_ReturnNumeratorDivideDenominator() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -255);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -255);
        
        long actual = fraction.longValue();
        
        assertEquals(1L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method longValue()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#longValue()}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return (long) numerator / denominator;
 *  */
    @Test
    public void testLongValue_ThrowArithmeticException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -255);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.longValue] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.lang3.math.Fraction.longValue(Fraction.java:423) */
        fraction.longValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.Fraction.floatValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method floatValue()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#floatValue()}
 * @utbot.returnsFrom {@code return ((float) numerator) / ((float) denominator);}
 *  */
    @Test
    public void testFloatValue_ReturnNumeratorDivideDenominator() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 1);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -255);
        
        float actual = fraction.floatValue();
        
        org.junit.Assert.assertEquals(-0.003921569f, actual, 1.0E-6f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.Fraction.doubleValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method doubleValue()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#doubleValue()}
 * @utbot.returnsFrom {@code return ((double) numerator) / ((double) denominator);}
 *  */
    @Test
    public void testDoubleValue_ReturnNumeratorDivideDenominator() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 1);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -255);
        
        double actual = fraction.doubleValue();
        
        org.junit.Assert.assertEquals(-0.00392156862745098, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.Fraction.reduce
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reduce()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#reduce()}
 * @utbot.returnsFrom {@code return Fraction.getFraction(numerator / gcd, denominator / gcd);}
 *  */
    @Test
    public void testReduce_ReturnFractionGetFraction() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -179);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -179);
        
        Fraction actual = fraction.reduce();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#reduce()}
 * @utbot.returnsFrom {@code return Fraction.getFraction(numerator / gcd, denominator / gcd);}
 *  */
    @Test
    public void testReduce_ReturnFractionGetFraction_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -10);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -5);
        
        Fraction actual = fraction.reduce();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#reduce()}
 * @utbot.returnsFrom {@code return Fraction.getFraction(numerator / gcd, denominator / gcd);}
 *  */
    @Test
    public void testReduce_ReturnFractionGetFraction_2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -4);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -2);
        
        Fraction actual = fraction.reduce();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#reduce()}
 * @utbot.returnsFrom {@code return Fraction.getFraction(numerator / gcd, denominator / gcd);}
 *  */
    @Test
    public void testReduce_ReturnFractionGetFraction_3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -12);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", 3);
        
        Fraction actual = fraction.reduce();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#reduce()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReduce_Return() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -1);
        
        Fraction actual = fraction.reduce();
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(fraction, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#reduce()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReduce_Return_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -2);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -1);
        
        Fraction actual = fraction.reduce();
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(fraction, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#reduce()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReduce_Return_2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -3);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -2);
        
        Fraction actual = fraction.reduce();
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(fraction, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#reduce()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReduce_Return_3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -2);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", 3);
        
        Fraction actual = fraction.reduce();
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(fraction, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method reduce()
    
    @Test
    public void testReduce1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -4);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", 2147475452);
        
        Fraction actual = fraction.reduce();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testReduce2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        Fraction actual = fraction.reduce();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testReduce3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 4);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -20476);
        
        Fraction actual = fraction.reduce();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.Fraction.negate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method negate()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#negate()}
 * @utbot.executesCondition {@code (numerator == Integer.MIN_VALUE): False}
 * @utbot.returnsFrom {@code return new Fraction(-numerator, denominator);}
 *  */
    @Test
    public void testNegate_NumeratorNotEqualsIntegerMIN_VALUE() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -2);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -255);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method negate()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#negate()}
 * @utbot.executesCondition {@code (numerator == Integer.MIN_VALUE): True}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: numerator == Integer.MIN_VALUE
 *  */
    @Test
    public void testNegate_ThrowArithmeticException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.negate] produces [java.lang.ArithmeticException: overflow: too large to negate]
            org.apache.commons.lang3.math.Fraction.negate(Fraction.java:503) */
        fraction.negate();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.Fraction.subtract
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method subtract(org.apache.commons.lang3.math.Fraction)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#subtract(org.apache.commons.lang3.math.Fraction)}
 * @utbot.returnsFrom {@code return addSub(fraction, false);}
 *  */
    @Test
    public void testSubtract_ReturnAddSub_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        Fraction actual = fraction.subtract(fraction);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#subtract(org.apache.commons.lang3.math.Fraction)}
 *  */
    @Test
    public void testSubtract() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -2147483646);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "numerator", -256);
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "denominator", -1069547520);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#subtract(org.apache.commons.lang3.math.Fraction)}
 *  */
    @Test
    public void testSubtract_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 128);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "numerator", 2);
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "denominator", -2147483519);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#subtract(org.apache.commons.lang3.math.Fraction)}
 * @utbot.returnsFrom {@code return addSub(fraction, false);}
 *  */
    @Test
    public void testSubtract_ReturnAddSub() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        Fraction actual = fraction.subtract(fraction1);
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(fraction, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method subtract(org.apache.commons.lang3.math.Fraction)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#subtract(org.apache.commons.lang3.math.Fraction)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return addSub(fraction, false);
 *  */
    @Test
    public void testSubtract_ThrowArithmeticException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "numerator", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.subtract] produces [java.lang.ArithmeticException: overflow: too large to negate]
            org.apache.commons.lang3.math.Fraction.negate(Fraction.java:503)
            org.apache.commons.lang3.math.Fraction.addSub(Fraction.java:736)
            org.apache.commons.lang3.math.Fraction.subtract(Fraction.java:719) */
        fraction.subtract(fraction1);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.Fraction#subtract(org.apache.commons.lang3.math.Fraction)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return addSub(fraction, false);
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.subtract] produces [java.lang.NullPointerException: The fraction must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.math.Fraction.addSub(Fraction.java:733)
            org.apache.commons.lang3.math.Fraction.subtract(Fraction.java:719) */
        fraction.subtract(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method subtract(org.apache.commons.lang3.math.Fraction)
    
    @Test
    public void testSubtract1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 1);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", 3);
        
        Fraction actual = fraction.subtract(fraction);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 1);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", 1043017782);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "numerator", 1);
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "denominator", -521508891);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 16777216);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -385523252);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "numerator", 32);
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "denominator", 96380813);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract4() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 1);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", 2);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "numerator", 1);
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "denominator", -2);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract5() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 16);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -1073741793);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "numerator", Integer.MIN_VALUE);
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "denominator", 2147483586);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract6() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -1073741840);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -1074262602);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "numerator", 1);
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "denominator", -537131301);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract7() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 17);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -1078235722);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "numerator", 1);
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "denominator", -539117861);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        
        // org.apache.commons.lang3.math.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method subtract(org.apache.commons.lang3.math.Fraction)
    
    @Test
    public void testSubtract8() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 1);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -4);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "numerator", 2);
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "denominator", 2147483645);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.subtract] produces [java.lang.ArithmeticException: overflow: add]
            org.apache.commons.lang3.math.Fraction.subAndCheck(Fraction.java:689)
            org.apache.commons.lang3.math.Fraction.addSub(Fraction.java:748)
            org.apache.commons.lang3.math.Fraction.subtract(Fraction.java:719) */
        fraction.subtract(fraction1);
    }
    
    @Test
    public void testSubtract9() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -1408499710);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", 8);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "numerator", 134217728);
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "denominator", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.subtract] produces [java.lang.ArithmeticException: overflow: numerator too large after multiply]
            org.apache.commons.lang3.math.Fraction.addSub(Fraction.java:765)
            org.apache.commons.lang3.math.Fraction.subtract(Fraction.java:719) */
        fraction.subtract(fraction1);
    }
    
    @Test
    public void testSubtract10() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 1);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -1073741827);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "numerator", 1);
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "denominator", -1073741823);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.subtract] produces [java.lang.ArithmeticException: overflow: mulPos]
            org.apache.commons.lang3.math.Fraction.mulPosAndCheck(Fraction.java:655)
            org.apache.commons.lang3.math.Fraction.addSub(Fraction.java:748)
            org.apache.commons.lang3.math.Fraction.subtract(Fraction.java:719) */
        fraction.subtract(fraction1);
    }
    
    @Test
    public void testSubtract11() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", Integer.MIN_VALUE);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -1342702225);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "numerator", 8192);
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "denominator", -263847577);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.subtract] produces [java.lang.ArithmeticException: overflow: mul]
            org.apache.commons.lang3.math.Fraction.mulAndCheck(Fraction.java:637)
            org.apache.commons.lang3.math.Fraction.addSub(Fraction.java:746)
            org.apache.commons.lang3.math.Fraction.subtract(Fraction.java:719) */
        fraction.subtract(fraction1);
    }
    
    @Test
    public void testSubtract12() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 1);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.subtract] produces [java.lang.ArithmeticException: overflow: gcd is 2^31]
            org.apache.commons.lang3.math.Fraction.greatestCommonDivisor(Fraction.java:595)
            org.apache.commons.lang3.math.Fraction.addSub(Fraction.java:743)
            org.apache.commons.lang3.math.Fraction.subtract(Fraction.java:719) */
        fraction.subtract(fraction);
    }
    
    @Test
    public void testSubtract13() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 1);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.subtract] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.lang3.math.Fraction.addSub(Fraction.java:754)
            org.apache.commons.lang3.math.Fraction.subtract(Fraction.java:719) */
        fraction.subtract(fraction);
    }
    
    @Test
    public void testSubtract14() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -1073741838);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -534842158);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "numerator", 4194304);
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "denominator", 802263237);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.subtract] produces [java.lang.ArithmeticException: overflow: numerator too large after multiply]
            org.apache.commons.lang3.math.Fraction.addSub(Fraction.java:765)
            org.apache.commons.lang3.math.Fraction.subtract(Fraction.java:719) */
        fraction.subtract(fraction1);
    }
    
    @Test
    public void testSubtract15() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 1);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -2147483646);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "numerator", 1);
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "denominator", -4);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.subtract] produces [java.lang.ArithmeticException: overflow: mulPos]
            org.apache.commons.lang3.math.Fraction.mulPosAndCheck(Fraction.java:655)
            org.apache.commons.lang3.math.Fraction.addSub(Fraction.java:767)
            org.apache.commons.lang3.math.Fraction.subtract(Fraction.java:719) */
        fraction.subtract(fraction1);
    }
    
    @Test
    public void testSubtract16() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -1073741840);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -1073217539);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "numerator", 1);
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "denominator", 2146435078);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.subtract] produces [java.lang.ArithmeticException: overflow: numerator too large after multiply]
            org.apache.commons.lang3.math.Fraction.addSub(Fraction.java:765)
            org.apache.commons.lang3.math.Fraction.subtract(Fraction.java:719) */
        fraction.subtract(fraction1);
    }
    
    @Test
    public void testSubtract17() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -1073741839);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -1056964526);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "numerator", 1);
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "denominator", 2113929052);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.subtract] produces [java.lang.ArithmeticException: overflow: numerator too large after multiply]
            org.apache.commons.lang3.math.Fraction.addSub(Fraction.java:765)
            org.apache.commons.lang3.math.Fraction.subtract(Fraction.java:719) */
        fraction.subtract(fraction1);
    }
    
    @Test
    public void testSubtract18() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 16);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -14);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "numerator", Integer.MIN_VALUE);
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "denominator", 7);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.subtract] produces [java.lang.ArithmeticException: overflow: numerator too large after multiply]
            org.apache.commons.lang3.math.Fraction.addSub(Fraction.java:765)
            org.apache.commons.lang3.math.Fraction.subtract(Fraction.java:719) */
        fraction.subtract(fraction1);
    }
    
    @Test
    public void testSubtract19() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 256);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -1610612742);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "numerator", 1);
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "denominator", 536870898);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.subtract] produces [java.lang.ArithmeticException: overflow: numerator too large after multiply]
            org.apache.commons.lang3.math.Fraction.addSub(Fraction.java:765)
            org.apache.commons.lang3.math.Fraction.subtract(Fraction.java:719) */
        fraction.subtract(fraction1);
    }
    
    @Test
    public void testSubtract20() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", -16);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -14);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "numerator", Integer.MIN_VALUE);
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "denominator", 7);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.subtract] produces [java.lang.ArithmeticException: overflow: numerator too large after multiply]
            org.apache.commons.lang3.math.Fraction.addSub(Fraction.java:765)
            org.apache.commons.lang3.math.Fraction.subtract(Fraction.java:719) */
        fraction.subtract(fraction1);
    }
    
    @Test
    public void testSubtract21() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 29);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", 4);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "numerator", 1048576);
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "denominator", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.subtract] produces [java.lang.ArithmeticException: overflow: numerator too large after multiply]
            org.apache.commons.lang3.math.Fraction.addSub(Fraction.java:765)
            org.apache.commons.lang3.math.Fraction.subtract(Fraction.java:719) */
        fraction.subtract(fraction1);
    }
    
    @Test
    public void testSubtract22() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "numerator", 1);
        setField(fraction, "org.apache.commons.lang3.math.Fraction", "denominator", -6);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.lang3.math.Fraction"));
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "numerator", 1);
        setField(fraction1, "org.apache.commons.lang3.math.Fraction", "denominator", Integer.MAX_VALUE);
        
        /* This test fails because method [org.apache.commons.lang3.math.Fraction.subtract] produces [java.lang.ArithmeticException: overflow: add]
            org.apache.commons.lang3.math.Fraction.subAndCheck(Fraction.java:689)
            org.apache.commons.lang3.math.Fraction.addSub(Fraction.java:748)
            org.apache.commons.lang3.math.Fraction.subtract(Fraction.java:719) */
        fraction.subtract(fraction1);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields628121484639200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields628121484639200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass628121484645500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields628121484639200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass628121484645500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields628121485706100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields628121485706100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass628121485707900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields628121485706100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass628121485707900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

