package org.apache.commons.math.stat.descriptive.moment;

import org.junit.Test;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.exception.DimensionMismatchException;
import org.apache.commons.math.exception.MathIllegalArgumentException;
import org.apache.commons.math.exception.NotPositiveException;
import org.apache.commons.math.exception.NumberIsTooLargeException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public final class org_apache_commons_math_stat_descriptive_moment_VarianceTest {
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.moment.Variance.clear
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clear()
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#clear()}
 * @utbot.executesCondition {@code (incMoment): False}
 *  */
    @Test
    public void testClear_NotIncMoment() {
        Variance variance = new Variance(false, null);
        variance.incMoment = false;
        
        variance.clear();
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#clear()}
 * @utbot.executesCondition {@code (incMoment): True}
 *  */
    @Test
    public void testClear_IncMoment() {
        SecondMoment secondMoment = new SecondMoment();
        secondMoment.m2 = java.lang.Double.NaN;
        secondMoment.n = 0L;
        secondMoment.m1 = java.lang.Double.NaN;
        secondMoment.dev = java.lang.Double.NaN;
        secondMoment.nDev = java.lang.Double.NaN;
        Variance variance = new Variance(false, secondMoment);
        variance.moment = secondMoment;
        variance.incMoment = true;
        
        variance.clear();
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#clear()}
 * @utbot.executesCondition {@code (incMoment): True}
 *  */
    @Test
    public void testClear_IncMoment_2() {
        ThirdMoment thirdMoment = new ThirdMoment();
        thirdMoment.m3 = java.lang.Double.NaN;
        thirdMoment.nDevSq = java.lang.Double.NaN;
        thirdMoment.m2 = java.lang.Double.NaN;
        thirdMoment.n = 0L;
        thirdMoment.m1 = java.lang.Double.NaN;
        thirdMoment.dev = java.lang.Double.NaN;
        thirdMoment.nDev = java.lang.Double.NaN;
        Variance variance = new Variance(false, thirdMoment);
        variance.moment = thirdMoment;
        variance.incMoment = true;
        
        variance.clear();
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#clear()}
 * @utbot.executesCondition {@code (incMoment): True}
 *  */
    @Test
    public void testClear_IncMoment_1() {
        FourthMoment fourthMoment = new FourthMoment();
        fourthMoment.m4 = java.lang.Double.NaN;
        fourthMoment.m3 = java.lang.Double.NaN;
        fourthMoment.nDevSq = java.lang.Double.NaN;
        fourthMoment.m2 = java.lang.Double.NaN;
        fourthMoment.n = 0L;
        fourthMoment.m1 = java.lang.Double.NaN;
        fourthMoment.dev = java.lang.Double.NaN;
        fourthMoment.nDev = java.lang.Double.NaN;
        Variance variance = new Variance(false, fourthMoment);
        variance.moment = fourthMoment;
        variance.incMoment = true;
        
        variance.clear();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clear()
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#clear()}
 * @utbot.executesCondition {@code (incMoment): True}
 * @utbot.invokes {@link org.apache.commons.math.stat.descriptive.moment.SecondMoment#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: moment.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException() {
        Variance variance = new Variance(false, null);
        variance.moment = null;
        variance.incMoment = true;
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.moment.Variance.clear] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.moment.Variance.clear(Variance.java:205) */
        variance.clear();
    }
    ///endregion
    
    ///region FUZZER: TIMEOUTS for method clear()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance}
     * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#clear()}
     */
    @Test(timeout = 1000L)
    public void testClear() {
        Variance variance = new Variance();
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        variance.clear();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.moment.Variance.increment
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method increment(double)
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#increment(double)}
 * @utbot.executesCondition {@code (incMoment): False}
 *  */
    @Test
    public void testIncrement_NotIncMoment() {
        Variance variance = new Variance(false, null);
        variance.incMoment = false;
        
        variance.increment(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#increment(double)}
 * @utbot.executesCondition {@code (incMoment): True}
 *  */
    @Test
    public void testIncrement_IncMoment() {
        SecondMoment secondMoment = new SecondMoment();
        secondMoment.m2 = 0.0;
        secondMoment.n = 0L;
        secondMoment.m1 = 0.0;
        secondMoment.dev = 0.0;
        secondMoment.nDev = 0.0;
        Variance variance = new Variance(false, secondMoment);
        variance.moment = secondMoment;
        variance.incMoment = true;
        
        variance.increment(java.lang.Double.NaN);
        
        double finalVarianceMomentM2 = variance.moment.m2;
        long finalVarianceMomentN = variance.moment.n;
        double finalVarianceMomentM1 = variance.moment.m1;
        double finalVarianceMomentDev = variance.moment.dev;
        double finalVarianceMomentNDev = variance.moment.nDev;
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM2, 1.0E-6);
        
        org.junit.Assert.assertEquals(1L, finalVarianceMomentN);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM1, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentDev, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentNDev, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#increment(double)}
 * @utbot.executesCondition {@code (incMoment): True}
 *  */
    @Test
    public void testIncrement_IncMoment_1() {
        SecondMoment secondMoment = new SecondMoment();
        secondMoment.m2 = 0.0;
        secondMoment.n = 1L;
        secondMoment.m1 = 0.0;
        secondMoment.dev = 0.0;
        secondMoment.nDev = 0.0;
        Variance variance = new Variance(false, secondMoment);
        variance.moment = secondMoment;
        variance.incMoment = true;
        
        variance.increment(java.lang.Double.NaN);
        
        double finalVarianceMomentM2 = variance.moment.m2;
        long finalVarianceMomentN = variance.moment.n;
        double finalVarianceMomentM1 = variance.moment.m1;
        double finalVarianceMomentDev = variance.moment.dev;
        double finalVarianceMomentNDev = variance.moment.nDev;
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM2, 1.0E-6);
        
        org.junit.Assert.assertEquals(2L, finalVarianceMomentN);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM1, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentDev, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentNDev, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#increment(double)}
 * @utbot.executesCondition {@code (incMoment): True}
 *  */
    @Test
    public void testIncrement_IncMoment_4() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        ThirdMoment thirdMoment = new ThirdMoment();
        thirdMoment.m3 = 0.0;
        thirdMoment.nDevSq = 0.0;
        thirdMoment.m2 = 0.0;
        thirdMoment.n = 1L;
        thirdMoment.m1 = 0.0;
        thirdMoment.dev = 0.0;
        thirdMoment.nDev = 0.0;
        Variance variance = new Variance(false, thirdMoment);
        variance.moment = thirdMoment;
        variance.incMoment = true;
        
        variance.increment(java.lang.Double.NaN);
        
        SecondMoment secondMoment = variance.moment;
        double finalVarianceMomentM3 = ((Double) getFieldValue(secondMoment, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "m3"));
        SecondMoment secondMoment1 = variance.moment;
        double finalVarianceMomentNDevSq = ((Double) getFieldValue(secondMoment1, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "nDevSq"));
        double finalVarianceMomentM2 = variance.moment.m2;
        long finalVarianceMomentN = variance.moment.n;
        double finalVarianceMomentM1 = variance.moment.m1;
        double finalVarianceMomentDev = variance.moment.dev;
        double finalVarianceMomentNDev = variance.moment.nDev;
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM3, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentNDevSq, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM2, 1.0E-6);
        
        org.junit.Assert.assertEquals(2L, finalVarianceMomentN);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM1, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentDev, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentNDev, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#increment(double)}
 * @utbot.executesCondition {@code (incMoment): True}
 *  */
    @Test
    public void testIncrement_IncMoment_2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        FourthMoment fourthMoment = new FourthMoment();
        fourthMoment.m4 = 0.0;
        fourthMoment.m3 = 0.0;
        fourthMoment.nDevSq = 0.0;
        fourthMoment.m2 = 0.0;
        fourthMoment.n = -9223372036854775806L;
        fourthMoment.m1 = 0.0;
        fourthMoment.dev = 0.0;
        fourthMoment.nDev = 0.0;
        Variance variance = new Variance(false, fourthMoment);
        variance.moment = fourthMoment;
        variance.incMoment = true;
        
        variance.increment(java.lang.Double.NaN);
        
        SecondMoment secondMoment = variance.moment;
        double finalVarianceMomentM4 = ((Double) getFieldValue(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FourthMoment", "m4"));
        SecondMoment secondMoment1 = variance.moment;
        double finalVarianceMomentM3 = ((Double) getFieldValue(secondMoment1, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "m3"));
        SecondMoment secondMoment2 = variance.moment;
        double finalVarianceMomentNDevSq = ((Double) getFieldValue(secondMoment2, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "nDevSq"));
        double finalVarianceMomentM2 = variance.moment.m2;
        long finalVarianceMomentN = variance.moment.n;
        double finalVarianceMomentM1 = variance.moment.m1;
        double finalVarianceMomentDev = variance.moment.dev;
        double finalVarianceMomentNDev = variance.moment.nDev;
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM4, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM3, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentNDevSq, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM2, 1.0E-6);
        
        org.junit.Assert.assertEquals(-9223372036854775805L, finalVarianceMomentN);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM1, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentDev, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentNDev, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#increment(double)}
 * @utbot.executesCondition {@code (incMoment): True}
 *  */
    @Test
    public void testIncrement_IncMoment_3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        FourthMoment fourthMoment = new FourthMoment();
        fourthMoment.m4 = 0.0;
        fourthMoment.m3 = 0.0;
        fourthMoment.nDevSq = 0.0;
        fourthMoment.m2 = 0.0;
        fourthMoment.n = 1L;
        fourthMoment.m1 = 0.0;
        fourthMoment.dev = 0.0;
        fourthMoment.nDev = 0.0;
        Variance variance = new Variance(false, fourthMoment);
        variance.moment = fourthMoment;
        variance.incMoment = true;
        
        variance.increment(java.lang.Double.NaN);
        
        SecondMoment secondMoment = variance.moment;
        double finalVarianceMomentM4 = ((Double) getFieldValue(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FourthMoment", "m4"));
        SecondMoment secondMoment1 = variance.moment;
        double finalVarianceMomentM3 = ((Double) getFieldValue(secondMoment1, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "m3"));
        SecondMoment secondMoment2 = variance.moment;
        double finalVarianceMomentNDevSq = ((Double) getFieldValue(secondMoment2, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "nDevSq"));
        double finalVarianceMomentM2 = variance.moment.m2;
        long finalVarianceMomentN = variance.moment.n;
        double finalVarianceMomentM1 = variance.moment.m1;
        double finalVarianceMomentDev = variance.moment.dev;
        double finalVarianceMomentNDev = variance.moment.nDev;
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM4, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM3, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentNDevSq, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM2, 1.0E-6);
        
        org.junit.Assert.assertEquals(2L, finalVarianceMomentN);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM1, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentDev, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentNDev, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method increment(double)
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#increment(double)}
 * @utbot.executesCondition {@code (incMoment): True}
 * @utbot.invokes {@link org.apache.commons.math.stat.descriptive.moment.SecondMoment#increment(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: moment.increment(d);
 *  */
    @Test
    public void testIncrement_ThrowNullPointerException() {
        Variance variance = new Variance(false, null);
        variance.moment = null;
        variance.incMoment = true;
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.moment.Variance.increment] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.moment.Variance.increment(Variance.java:170) */
        variance.increment(java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.moment.Variance.copy
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method copy()
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#copy()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testCopy_ReturnResult() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        SecondMoment secondMoment = new SecondMoment();
        secondMoment.m2 = 0.0;
        secondMoment.n = 0L;
        secondMoment.m1 = 0.0;
        secondMoment.dev = 0.0;
        secondMoment.nDev = 0.0;
        Variance variance = new Variance(false, secondMoment);
        variance.moment = secondMoment;
        variance.incMoment = false;
        variance.setBiasCorrected(false);
        double[] doubleArray = {1.265E-321, 0.0};
        variance.setData(doubleArray);
        
        double[] initialVarianceStoredData = ((double[]) getFieldValue(variance, "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", "storedData"));
        
        Variance actual = variance.copy();
        
        SecondMoment secondMoment1 = new SecondMoment();
        secondMoment1.m2 = 0.0;
        secondMoment1.n = 0L;
        secondMoment1.m1 = 0.0;
        secondMoment1.dev = 0.0;
        secondMoment1.nDev = 0.0;
        Variance expected = new Variance(false, secondMoment1);
        expected.moment = secondMoment1;
        expected.incMoment = false;
        expected.setBiasCorrected(false);
        double[] doubleArray1 = {1.265E-321, 0.0};
        expected.setData(doubleArray1);
        
        SecondMoment expectedMoment = expected.moment;
        SecondMoment actualMoment = actual.moment;
        double expectedMomentM2 = expectedMoment.m2;
        double actualMomentM2 = actualMoment.m2;
        assertEquals(expectedMomentM2, actualMomentM2, 1.0E-6);
        
        long expectedMomentN = expectedMoment.n;
        long actualMomentN = actualMoment.n;
        org.junit.Assert.assertEquals(expectedMomentN, actualMomentN);
        
        double expectedMomentM1 = expectedMoment.m1;
        double actualMomentM1 = actualMoment.m1;
        assertEquals(expectedMomentM1, actualMomentM1, 1.0E-6);
        
        double expectedMomentDev = expectedMoment.dev;
        double actualMomentDev = actualMoment.dev;
        assertEquals(expectedMomentDev, actualMomentDev, 1.0E-6);
        
        double expectedMomentNDev = expectedMoment.nDev;
        double actualMomentNDev = actualMoment.nDev;
        assertEquals(expectedMomentNDev, actualMomentNDev, 1.0E-6);
        
        double[] actualMomentStoredData = ((double[]) getFieldValue(actualMoment, "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", "storedData"));
        assertNull(actualMomentStoredData);
        
        boolean actualIncMoment = actual.incMoment;
        assertFalse(actualIncMoment);
        
        boolean actualIsBiasCorrected = ((Boolean) getFieldValue(actual, "org.apache.commons.math.stat.descriptive.moment.Variance", "isBiasCorrected"));
        assertFalse(actualIsBiasCorrected);
        
        double[] expectedStoredData = ((double[]) getFieldValue(expected, "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", "storedData"));
        double[] actualStoredData = ((double[]) getFieldValue(actual, "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", "storedData"));
        int expectedStoredDataSize = expectedStoredData.length;
        org.junit.Assert.assertEquals(expectedStoredDataSize, actualStoredData.length);
        assertArrayEquals(expectedStoredData, actualStoredData, 1.0E-6);
        
        double[] finalVarianceStoredData = ((double[]) getFieldValue(variance, "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", "storedData"));
        
        assertFalse(initialVarianceStoredData == finalVarianceStoredData);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#copy()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testCopy_ReturnResult_2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        ThirdMoment thirdMoment = new ThirdMoment();
        thirdMoment.m3 = 0.0;
        thirdMoment.nDevSq = 0.0;
        thirdMoment.m2 = 0.0;
        thirdMoment.n = 0L;
        thirdMoment.m1 = 0.0;
        thirdMoment.dev = 0.0;
        thirdMoment.nDev = 0.0;
        Variance variance = new Variance(false, thirdMoment);
        variance.moment = thirdMoment;
        variance.incMoment = false;
        variance.setBiasCorrected(false);
        
        Variance actual = variance.copy();
        
        ThirdMoment thirdMoment1 = new ThirdMoment();
        thirdMoment1.m3 = 0.0;
        thirdMoment1.nDevSq = 0.0;
        thirdMoment1.m2 = 0.0;
        thirdMoment1.n = 0L;
        thirdMoment1.m1 = 0.0;
        thirdMoment1.dev = 0.0;
        thirdMoment1.nDev = 0.0;
        Variance expected = new Variance(false, thirdMoment1);
        expected.moment = thirdMoment1;
        expected.incMoment = false;
        expected.setBiasCorrected(false);
        
        SecondMoment expectedMoment = expected.moment;
        SecondMoment actualMoment = actual.moment;
        double expectedMomentM3 = ((Double) getFieldValue(expectedMoment, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "m3"));
        double actualMomentM3 = ((Double) getFieldValue(actualMoment, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "m3"));
        assertEquals(expectedMomentM3, actualMomentM3, 1.0E-6);
        
        double expectedMomentNDevSq = ((Double) getFieldValue(expectedMoment, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "nDevSq"));
        double actualMomentNDevSq = ((Double) getFieldValue(actualMoment, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "nDevSq"));
        assertEquals(expectedMomentNDevSq, actualMomentNDevSq, 1.0E-6);
        
        double expectedMomentM2 = expectedMoment.m2;
        double actualMomentM2 = actualMoment.m2;
        assertEquals(expectedMomentM2, actualMomentM2, 1.0E-6);
        
        long expectedMomentN = expectedMoment.n;
        long actualMomentN = actualMoment.n;
        org.junit.Assert.assertEquals(expectedMomentN, actualMomentN);
        
        double expectedMomentM1 = expectedMoment.m1;
        double actualMomentM1 = actualMoment.m1;
        assertEquals(expectedMomentM1, actualMomentM1, 1.0E-6);
        
        double expectedMomentDev = expectedMoment.dev;
        double actualMomentDev = actualMoment.dev;
        assertEquals(expectedMomentDev, actualMomentDev, 1.0E-6);
        
        double expectedMomentNDev = expectedMoment.nDev;
        double actualMomentNDev = actualMoment.nDev;
        assertEquals(expectedMomentNDev, actualMomentNDev, 1.0E-6);
        
        double[] actualMomentStoredData = ((double[]) getFieldValue(actualMoment, "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", "storedData"));
        assertNull(actualMomentStoredData);
        
        boolean actualIncMoment = actual.incMoment;
        assertFalse(actualIncMoment);
        
        boolean actualIsBiasCorrected = ((Boolean) getFieldValue(actual, "org.apache.commons.math.stat.descriptive.moment.Variance", "isBiasCorrected"));
        assertFalse(actualIsBiasCorrected);
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#copy()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testCopy_ReturnResult_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        FourthMoment fourthMoment = new FourthMoment();
        fourthMoment.m4 = 0.0;
        fourthMoment.m3 = 0.0;
        fourthMoment.nDevSq = 0.0;
        fourthMoment.m2 = 0.0;
        fourthMoment.n = 0L;
        fourthMoment.m1 = 0.0;
        fourthMoment.dev = 0.0;
        fourthMoment.nDev = 0.0;
        Variance variance = new Variance(false, fourthMoment);
        variance.moment = fourthMoment;
        variance.incMoment = false;
        variance.setBiasCorrected(false);
        double[] doubleArray = {1.1125369292536007E-308};
        variance.setData(doubleArray);
        
        double[] initialVarianceStoredData = ((double[]) getFieldValue(variance, "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", "storedData"));
        
        Variance actual = variance.copy();
        
        FourthMoment fourthMoment1 = new FourthMoment();
        fourthMoment1.m4 = 0.0;
        fourthMoment1.m3 = 0.0;
        fourthMoment1.nDevSq = 0.0;
        fourthMoment1.m2 = 0.0;
        fourthMoment1.n = 0L;
        fourthMoment1.m1 = 0.0;
        fourthMoment1.dev = 0.0;
        fourthMoment1.nDev = 0.0;
        Variance expected = new Variance(false, fourthMoment1);
        expected.moment = fourthMoment1;
        expected.incMoment = false;
        expected.setBiasCorrected(false);
        double[] doubleArray1 = {1.1125369292536007E-308};
        expected.setData(doubleArray1);
        
        SecondMoment expectedMoment = expected.moment;
        SecondMoment actualMoment = actual.moment;
        double expectedMomentM4 = ((Double) getFieldValue(expectedMoment, "org.apache.commons.math.stat.descriptive.moment.FourthMoment", "m4"));
        double actualMomentM4 = ((Double) getFieldValue(actualMoment, "org.apache.commons.math.stat.descriptive.moment.FourthMoment", "m4"));
        assertEquals(expectedMomentM4, actualMomentM4, 1.0E-6);
        
        double expectedMomentM3 = ((Double) getFieldValue(expectedMoment, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "m3"));
        double actualMomentM3 = ((Double) getFieldValue(actualMoment, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "m3"));
        assertEquals(expectedMomentM3, actualMomentM3, 1.0E-6);
        
        double expectedMomentNDevSq = ((Double) getFieldValue(expectedMoment, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "nDevSq"));
        double actualMomentNDevSq = ((Double) getFieldValue(actualMoment, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "nDevSq"));
        assertEquals(expectedMomentNDevSq, actualMomentNDevSq, 1.0E-6);
        
        double expectedMomentM2 = expectedMoment.m2;
        double actualMomentM2 = actualMoment.m2;
        assertEquals(expectedMomentM2, actualMomentM2, 1.0E-6);
        
        long expectedMomentN = expectedMoment.n;
        long actualMomentN = actualMoment.n;
        org.junit.Assert.assertEquals(expectedMomentN, actualMomentN);
        
        double expectedMomentM1 = expectedMoment.m1;
        double actualMomentM1 = actualMoment.m1;
        assertEquals(expectedMomentM1, actualMomentM1, 1.0E-6);
        
        double expectedMomentDev = expectedMoment.dev;
        double actualMomentDev = actualMoment.dev;
        assertEquals(expectedMomentDev, actualMomentDev, 1.0E-6);
        
        double expectedMomentNDev = expectedMoment.nDev;
        double actualMomentNDev = actualMoment.nDev;
        assertEquals(expectedMomentNDev, actualMomentNDev, 1.0E-6);
        
        double[] actualMomentStoredData = ((double[]) getFieldValue(actualMoment, "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", "storedData"));
        assertNull(actualMomentStoredData);
        
        boolean actualIncMoment = actual.incMoment;
        assertFalse(actualIncMoment);
        
        boolean actualIsBiasCorrected = ((Boolean) getFieldValue(actual, "org.apache.commons.math.stat.descriptive.moment.Variance", "isBiasCorrected"));
        assertFalse(actualIsBiasCorrected);
        
        double[] expectedStoredData = ((double[]) getFieldValue(expected, "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", "storedData"));
        double[] actualStoredData = ((double[]) getFieldValue(actual, "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", "storedData"));
        int expectedStoredDataSize = expectedStoredData.length;
        org.junit.Assert.assertEquals(expectedStoredDataSize, actualStoredData.length);
        assertArrayEquals(expectedStoredData, actualStoredData, 1.0E-6);
        
        double[] finalVarianceStoredData = ((double[]) getFieldValue(variance, "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", "storedData"));
        
        assertFalse(initialVarianceStoredData == finalVarianceStoredData);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.moment.Variance.copy
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method copy(org.apache.commons.math.stat.descriptive.moment.Variance, org.apache.commons.math.stat.descriptive.moment.Variance)
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#copy(org.apache.commons.math.stat.descriptive.moment.Variance,org.apache.commons.math.stat.descriptive.moment.Variance)}
 *  */
    @Test
    public void testCopy_2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        SecondMoment secondMoment = new SecondMoment();
        secondMoment.m2 = 0.0;
        secondMoment.n = 0L;
        secondMoment.m1 = 0.0;
        secondMoment.dev = 0.0;
        secondMoment.nDev = 0.0;
        Variance variance = new Variance(false, secondMoment);
        variance.moment = secondMoment;
        variance.incMoment = false;
        variance.setBiasCorrected(false);
        double[] doubleArray = {};
        variance.setData(doubleArray);
        Variance variance1 = new Variance(false, null);
        variance1.moment = null;
        variance1.incMoment = false;
        variance1.setBiasCorrected(false);
        
        double[] initialVarianceStoredData = ((double[]) getFieldValue(variance, "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", "storedData"));
        
        SecondMoment initialVariance1Moment = variance1.moment;
        double[] initialVariance1StoredData = ((double[]) getFieldValue(variance1, "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", "storedData"));
        
        Variance.copy(variance, variance1);
        
        double[] finalVarianceStoredData = ((double[]) getFieldValue(variance, "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", "storedData"));
        
        SecondMoment finalVariance1Moment = variance1.moment;
        double[] finalVariance1StoredData = ((double[]) getFieldValue(variance1, "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", "storedData"));
        
        assertFalse(initialVarianceStoredData == finalVarianceStoredData);
        
        assertFalse(initialVariance1Moment == finalVariance1Moment);
        
        assertFalse(initialVariance1StoredData == finalVariance1StoredData);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#copy(org.apache.commons.math.stat.descriptive.moment.Variance,org.apache.commons.math.stat.descriptive.moment.Variance)}
 *  */
    @Test
    public void testCopy() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        FourthMoment fourthMoment = new FourthMoment();
        fourthMoment.m4 = 0.0;
        fourthMoment.m3 = 0.0;
        fourthMoment.nDevSq = 0.0;
        fourthMoment.m2 = 0.0;
        fourthMoment.n = 0L;
        fourthMoment.m1 = 0.0;
        fourthMoment.dev = 0.0;
        fourthMoment.nDev = 0.0;
        double[] doubleArray = {};
        fourthMoment.setData(doubleArray);
        Variance variance = new Variance(false, fourthMoment);
        variance.moment = fourthMoment;
        variance.incMoment = false;
        variance.setBiasCorrected(false);
        SecondMoment secondMoment = new SecondMoment();
        Variance variance1 = new Variance(false, secondMoment);
        variance1.moment = secondMoment;
        variance1.incMoment = false;
        variance1.setBiasCorrected(false);
        
        SecondMoment secondMoment1 = variance.moment;
        double[] initialVarianceMomentStoredData = ((double[]) getFieldValue(secondMoment1, "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", "storedData"));
        
        SecondMoment initialVariance1Moment = variance1.moment;
        
        Variance.copy(variance, variance1);
        
        SecondMoment secondMoment2 = variance.moment;
        double[] finalVarianceMomentStoredData = ((double[]) getFieldValue(secondMoment2, "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", "storedData"));
        
        SecondMoment finalVariance1Moment = variance1.moment;
        
        assertFalse(initialVarianceMomentStoredData == finalVarianceMomentStoredData);
        
        assertFalse(initialVariance1Moment == finalVariance1Moment);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#copy(org.apache.commons.math.stat.descriptive.moment.Variance,org.apache.commons.math.stat.descriptive.moment.Variance)}
 *  */
    @Test
    public void testCopy_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        ThirdMoment thirdMoment = new ThirdMoment();
        thirdMoment.m3 = 0.0;
        thirdMoment.nDevSq = 0.0;
        thirdMoment.m2 = 0.0;
        thirdMoment.n = 0L;
        thirdMoment.m1 = 0.0;
        thirdMoment.dev = 0.0;
        thirdMoment.nDev = 0.0;
        double[] doubleArray = {};
        thirdMoment.setData(doubleArray);
        Variance variance = new Variance(false, thirdMoment);
        variance.moment = thirdMoment;
        variance.incMoment = false;
        variance.setBiasCorrected(false);
        Variance variance1 = new Variance(false, null);
        variance1.moment = null;
        variance1.incMoment = false;
        variance1.setBiasCorrected(false);
        
        SecondMoment secondMoment = variance.moment;
        double[] initialVarianceMomentStoredData = ((double[]) getFieldValue(secondMoment, "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", "storedData"));
        
        SecondMoment initialVariance1Moment = variance1.moment;
        
        Variance.copy(variance, variance1);
        
        SecondMoment secondMoment1 = variance.moment;
        double[] finalVarianceMomentStoredData = ((double[]) getFieldValue(secondMoment1, "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", "storedData"));
        
        SecondMoment finalVariance1Moment = variance1.moment;
        
        assertFalse(initialVarianceMomentStoredData == finalVarianceMomentStoredData);
        
        assertFalse(initialVariance1Moment == finalVariance1Moment);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method copy(org.apache.commons.math.stat.descriptive.moment.Variance, org.apache.commons.math.stat.descriptive.moment.Variance)
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#copy(org.apache.commons.math.stat.descriptive.moment.Variance,org.apache.commons.math.stat.descriptive.moment.Variance)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} in: MathUtils.checkNotNull(source);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testCopy_ThrowNullArgumentException() {
        Variance.copy(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#copy(org.apache.commons.math.stat.descriptive.moment.Variance,org.apache.commons.math.stat.descriptive.moment.Variance)}
 * @utbot.invokes {@link org.apache.commons.math.util.MathUtils#checkNotNull(java.lang.Object)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} in: MathUtils.checkNotNull(dest);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testCopy_ThrowNullArgumentException_1() {
        Variance variance = new Variance();
        
        Variance.copy(variance, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method copy(org.apache.commons.math.stat.descriptive.moment.Variance, org.apache.commons.math.stat.descriptive.moment.Variance)
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#copy(org.apache.commons.math.stat.descriptive.moment.Variance,org.apache.commons.math.stat.descriptive.moment.Variance)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: dest.moment = source.moment.copy();
 *  */
    @Test
    public void testCopy_ThrowNullPointerException_1() {
        Variance variance = new Variance(false, null);
        variance.moment = null;
        Variance variance1 = new Variance(false, null);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.moment.Variance.copy] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.moment.Variance.copy(Variance.java:616) */
        Variance.copy(variance, variance1);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#copy(org.apache.commons.math.stat.descriptive.moment.Variance,org.apache.commons.math.stat.descriptive.moment.Variance)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: dest.moment = source.moment.copy();
 *  */
    @Test
    public void testCopy_ThrowNullPointerException() {
        Variance variance = new Variance(false, null);
        variance.moment = null;
        double[] doubleArray = {6.7903865311E-313};
        variance.setData(doubleArray);
        Variance variance1 = new Variance(false, null);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.moment.Variance.copy] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.moment.Variance.copy(Variance.java:616) */
        Variance.copy(variance, variance1);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method copy(org.apache.commons.math.stat.descriptive.moment.Variance, org.apache.commons.math.stat.descriptive.moment.Variance)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance}
     * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#copy(org.apache.commons.math.stat.descriptive.moment.Variance,org.apache.commons.math.stat.descriptive.moment.Variance)}
     */
    @Test
    public void testCopy1() {
        Variance variance = new Variance();
        Variance variance1 = new Variance();
        
        Variance.copy(variance, variance1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.moment.Variance.evaluate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method evaluate([D, [D, double, int, int)
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[],double,int,int)}
 * @utbot.executesCondition {@code (length == 1): True}
 * @utbot.returnsFrom {@code return var;}
 *  */
    @Test
    public void testEvaluate_LengthEquals1() {
        Variance variance = new Variance();
        double[] doubleArray = {3.337610787760802E-308};
        
        double actual = variance.evaluate(doubleArray, doubleArray, java.lang.Double.NaN, 0, 1);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[],double,int,int)}
 * @utbot.executesCondition {@code (length == 1): False}
 * @utbot.executesCondition {@code (length > 1): True}
 * @utbot.executesCondition {@code (isBiasCorrected): False}
 * @utbot.iterates iterate the loop {@code for(int i = begin; i < begin + length; i++)} twice
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < weights.length; i++)} twice
 * @utbot.returnsFrom {@code return var;}
 *  */
    @Test
    public void testEvaluate_NotIsBiasCorrected() {
        Variance variance = new Variance(false, null);
        variance.setBiasCorrected(false);
        double[] doubleArray = {3.337610787760802E-308, -0.0};
        
        double actual = variance.evaluate(doubleArray, doubleArray, java.lang.Double.NaN, 0, 2);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[],double,int,int)}
 * @utbot.executesCondition {@code (length == 1): False}
 * @utbot.executesCondition {@code (length > 1): True}
 * @utbot.executesCondition {@code (isBiasCorrected): True}
 * @utbot.iterates iterate the loop {@code for(int i = begin; i < begin + length; i++)} twice
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < weights.length; i++)} twice
 * @utbot.returnsFrom {@code return var;}
 *  */
    @Test
    public void testEvaluate_IsBiasCorrected() {
        Variance variance = new Variance(true, null);
        variance.setBiasCorrected(true);
        double[] doubleArray = {3.337610787760802E-308, -0.0};
        
        double actual = variance.evaluate(doubleArray, doubleArray, java.lang.Double.NaN, 0, 2);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method evaluate([D, [D, double, int, int)
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[],double,int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} when: test(values, weights, begin, length)
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testEvaluate_ThrowDimensionMismatchException() {
        Variance variance = new Variance();
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        variance.evaluate(doubleArray, doubleArray1, java.lang.Double.NaN, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[],double,int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.MathIllegalArgumentException} when: test(values, weights, begin, length)
 *  */
    @Test(expected = MathIllegalArgumentException.class)
    public void testEvaluate_ThrowMathIllegalArgumentException() {
        Variance variance = new Variance();
        double[] doubleArray = {};
        
        variance.evaluate(doubleArray, doubleArray, java.lang.Double.NaN, -1, 0);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[],double,int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.MathIllegalArgumentException} when: test(values, weights, begin, length)
 *  */
    @Test(expected = MathIllegalArgumentException.class)
    public void testEvaluate_ThrowMathIllegalArgumentException_1() {
        Variance variance = new Variance();
        double[] doubleArray = {java.lang.Double.NaN};
        
        variance.evaluate(doubleArray, doubleArray, java.lang.Double.NaN, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[],double,int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.MathIllegalArgumentException} when: test(values, weights, begin, length)
 *  */
    @Test(expected = MathIllegalArgumentException.class)
    public void testEvaluate_ThrowMathIllegalArgumentException_2() {
        Variance variance = new Variance();
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0, -2.225073858507202E-308};
        
        variance.evaluate(doubleArray, doubleArray1, java.lang.Double.NaN, 1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[],double,int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.MathIllegalArgumentException} when: test(values, weights, begin, length)
 *  */
    @Test(expected = MathIllegalArgumentException.class)
    public void testEvaluate_ThrowMathIllegalArgumentException_3() {
        Variance variance = new Variance();
        double[] doubleArray = {-0.0};
        
        variance.evaluate(doubleArray, doubleArray, java.lang.Double.NaN, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[],double,int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} when: test(values, weights, begin, length)
 *  */
    @Test(expected = NullArgumentException.class)
    public void testEvaluate_ThrowNullArgumentException() {
        Variance variance = new Variance();
        
        variance.evaluate(null, null, java.lang.Double.NaN, -255, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method evaluate([D, [D, double, int, int)
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[],double,int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: test(values, weights, begin, length)
 *  */
    @Test
    public void testEvaluate_ThrowArrayIndexOutOfBoundsException() {
        Variance variance = new Variance();
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.moment.Variance.evaluate] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 0]
            org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic.test(AbstractUnivariateStatistic.java:268)
            org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic.test(AbstractUnivariateStatistic.java:222)
            org.apache.commons.math.stat.descriptive.moment.Variance.evaluate(Variance.java:506) */
        variance.evaluate(doubleArray, doubleArray, java.lang.Double.NaN, -256, 1);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[],double,int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: test(values, weights, begin, length)
 *  */
    @Test
    public void testEvaluate_ThrowArrayIndexOutOfBoundsException_1() {
        Variance variance = new Variance();
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {3.337610787760802E-308, -0.0};
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.moment.Variance.evaluate] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic.test(AbstractUnivariateStatistic.java:268)
            org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic.test(AbstractUnivariateStatistic.java:222)
            org.apache.commons.math.stat.descriptive.moment.Variance.evaluate(Variance.java:506) */
        variance.evaluate(doubleArray, doubleArray1, java.lang.Double.NaN, 0, 3);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method evaluate([D, [D, double, int, int)
    
    @Test
    public void testEvaluate1() {
        Variance variance = new Variance();
        double[] doubleArray = new double[39];
        double[] doubleArray1 = new double[39];
        doubleArray1[37] = -0.0;
        doubleArray1[38] = 2.0;
        
        double actual = variance.evaluate(doubleArray, doubleArray1, java.lang.Double.NaN, 37, 2);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method evaluate([D, [D, double, int, int)
    
    @Test(expected = MathIllegalArgumentException.class)
    public void testEvaluate2() {
        Variance variance = new Variance();
        double[] doubleArray = new double[35];
        double[] doubleArray1 = new double[35];
        doubleArray1[24] = -0.0;
        doubleArray1[25] = -0.0;
        doubleArray1[26] = -0.0;
        doubleArray1[27] = -0.0;
        doubleArray1[28] = -0.0;
        doubleArray1[29] = 3.337610787760802E-308;
        doubleArray1[30] = -0.0;
        doubleArray1[31] = -0.0;
        doubleArray1[32] = -0.0;
        doubleArray1[33] = -0.0;
        doubleArray1[34] = java.lang.Double.POSITIVE_INFINITY;
        
        variance.evaluate(doubleArray, doubleArray1, java.lang.Double.NaN, 24, 11);
    }
    
    @Test(expected = MathIllegalArgumentException.class)
    public void testEvaluate3() {
        Variance variance = new Variance();
        double[] doubleArray = new double[39];
        doubleArray[22] = -0.0;
        doubleArray[23] = -0.0;
        doubleArray[24] = -0.0;
        doubleArray[25] = 3.337610787760802E-308;
        doubleArray[26] = -0.0;
        doubleArray[27] = -0.0;
        doubleArray[28] = -0.0;
        doubleArray[29] = -0.0;
        doubleArray[30] = -0.0;
        doubleArray[31] = -0.0;
        doubleArray[32] = java.lang.Double.NaN;
        
        variance.evaluate(doubleArray, doubleArray, java.lang.Double.NaN, 22, 4137);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method evaluate([D, [D, double, int, int)
    
    @Test
    public void testEvaluate4() {
        Variance variance = new Variance();
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, -0.0
        };
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.moment.Variance.evaluate] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic.test(AbstractUnivariateStatistic.java:268)
            org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic.test(AbstractUnivariateStatistic.java:222)
            org.apache.commons.math.stat.descriptive.moment.Variance.evaluate(Variance.java:506) */
        variance.evaluate(doubleArray, doubleArray, java.lang.Double.NaN, 8, 3);
    }
    
    @Test
    public void testEvaluate5() {
        Variance variance = new Variance();
        double[] doubleArray = new double[33];
        doubleArray[23] = -0.0;
        doubleArray[24] = -0.0;
        doubleArray[25] = -0.0;
        doubleArray[26] = -0.0;
        doubleArray[27] = 3.337610787760802E-308;
        doubleArray[28] = -0.0;
        doubleArray[29] = -0.0;
        doubleArray[30] = -0.0;
        doubleArray[31] = -0.0;
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.moment.Variance.evaluate] produces [java.lang.ArrayIndexOutOfBoundsException: Index 33 out of bounds for length 33]
            org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic.test(AbstractUnivariateStatistic.java:268)
            org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic.test(AbstractUnivariateStatistic.java:222)
            org.apache.commons.math.stat.descriptive.moment.Variance.evaluate(Variance.java:506) */
        variance.evaluate(doubleArray, doubleArray, java.lang.Double.NaN, 23, 40);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.moment.Variance.evaluate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method evaluate([D, [D, double)
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[],double)}
 * @utbot.returnsFrom {@code return evaluate(values, weights, mean, 0, values.length);}
 *  */
    @Test
    public void testEvaluate_ReturnEvaluate() {
        Variance variance = new Variance();
        double[] doubleArray = {3.337610787760802E-308};
        
        double actual = variance.evaluate(doubleArray, doubleArray, java.lang.Double.NaN);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[],double)}
 * @utbot.returnsFrom {@code return evaluate(values, weights, mean, 0, values.length);}
 *  */
    @Test
    public void testEvaluate_ReturnEvaluate_1() {
        Variance variance = new Variance(true, null);
        variance.setBiasCorrected(true);
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {3.337610787760802E-308, -0.0};
        
        double actual = variance.evaluate(doubleArray, doubleArray1, java.lang.Double.NaN);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[],double)}
 * @utbot.returnsFrom {@code return evaluate(values, weights, mean, 0, values.length);}
 *  */
    @Test
    public void testEvaluate_ReturnEvaluate_2() {
        Variance variance = new Variance(false, null);
        variance.setBiasCorrected(false);
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {3.337610787760802E-308, -0.0};
        
        double actual = variance.evaluate(doubleArray, doubleArray1, java.lang.Double.NaN);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method evaluate([D, [D, double)
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[],double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: return evaluate(values, weights, mean, 0, values.length);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testEvaluate_ThrowDimensionMismatchException1() {
        Variance variance = new Variance();
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        variance.evaluate(doubleArray, doubleArray1, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[],double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.MathIllegalArgumentException} in: return evaluate(values, weights, mean, 0, values.length);
 *  */
    @Test(expected = MathIllegalArgumentException.class)
    public void testEvaluate_ThrowMathIllegalArgumentException1() {
        Variance variance = new Variance();
        double[] doubleArray = {};
        
        variance.evaluate(doubleArray, doubleArray, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[],double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.MathIllegalArgumentException} in: return evaluate(values, weights, mean, 0, values.length);
 *  */
    @Test(expected = MathIllegalArgumentException.class)
    public void testEvaluate_ThrowMathIllegalArgumentException_11() {
        Variance variance = new Variance();
        double[] doubleArray = {java.lang.Double.NaN};
        
        variance.evaluate(doubleArray, doubleArray, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[],double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.MathIllegalArgumentException} in: return evaluate(values, weights, mean, 0, values.length);
 *  */
    @Test(expected = MathIllegalArgumentException.class)
    public void testEvaluate_ThrowMathIllegalArgumentException_21() {
        Variance variance = new Variance();
        double[] doubleArray = {-2.225073858507202E-308};
        
        variance.evaluate(doubleArray, doubleArray, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[],double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.MathIllegalArgumentException} in: return evaluate(values, weights, mean, 0, values.length);
 *  */
    @Test(expected = MathIllegalArgumentException.class)
    public void testEvaluate_ThrowMathIllegalArgumentException_31() {
        Variance variance = new Variance();
        double[] doubleArray = {java.lang.Double.POSITIVE_INFINITY};
        
        variance.evaluate(doubleArray, doubleArray, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[],double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.MathIllegalArgumentException} in: return evaluate(values, weights, mean, 0, values.length);
 *  */
    @Test(expected = MathIllegalArgumentException.class)
    public void testEvaluate_ThrowMathIllegalArgumentException_4() {
        Variance variance = new Variance();
        double[] doubleArray = {-0.0};
        
        variance.evaluate(doubleArray, doubleArray, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[],double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} in: return evaluate(values, weights, mean, 0, values.length);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testEvaluate_ThrowNullArgumentException1() {
        Variance variance = new Variance();
        double[] doubleArray = {0.0};
        
        variance.evaluate(doubleArray, ((double[]) null), java.lang.Double.NaN);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method evaluate([D, [D, double)
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[],double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return evaluate(values, weights, mean, 0, values.length);
 *  */
    @Test
    public void testEvaluate_ThrowNullPointerException() {
        Variance variance = new Variance();
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.moment.Variance.evaluate] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.moment.Variance.evaluate(Variance.java:576) */
        variance.evaluate(((double[]) null), ((double[]) null), java.lang.Double.NaN);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method evaluate([D, [D, double)
    
    @Test
    public void testEvaluate6() {
        Variance variance = new Variance();
        double[] doubleArray = new double[11];
        doubleArray[0] = -0.0;
        doubleArray[1] = -0.0;
        doubleArray[2] = -0.0;
        doubleArray[3] = -0.0;
        doubleArray[4] = -0.0;
        doubleArray[5] = -0.0;
        doubleArray[6] = -0.0;
        doubleArray[7] = -0.0;
        doubleArray[8] = -0.0;
        doubleArray[9] = 3.337610787760802E-308;
        
        double actual = variance.evaluate(doubleArray, doubleArray, java.lang.Double.NaN);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method evaluate([D, [D, double)
    
    @Test(expected = MathIllegalArgumentException.class)
    public void testEvaluate7() {
        Variance variance = new Variance();
        double[] doubleArray = new double[11];
        doubleArray[0] = -0.0;
        doubleArray[1] = -0.0;
        doubleArray[2] = -0.0;
        doubleArray[3] = -0.0;
        doubleArray[4] = -0.0;
        doubleArray[5] = -0.0;
        doubleArray[6] = -0.0;
        doubleArray[7] = 3.337610787760802E-308;
        doubleArray[8] = -0.0;
        doubleArray[9] = -0.0;
        doubleArray[10] = java.lang.Double.NaN;
        
        variance.evaluate(doubleArray, doubleArray, java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.moment.Variance.evaluate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method evaluate([D, [D, int, int)
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[],int,int)}
 * @utbot.returnsFrom {@code return var;}
 *  */
    @Test
    public void testEvaluate_ReturnVar() {
        Variance variance = new Variance(false, null);
        variance.incMoment = false;
        double[] doubleArray = {3.337610787760802E-308};
        
        double actual = variance.evaluate(doubleArray, doubleArray, 0, 1);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[],int,int)}
 * @utbot.returnsFrom {@code return var;}
 *  */
    @Test
    public void testEvaluate_ReturnVar_1() {
        SecondMoment secondMoment = new SecondMoment();
        secondMoment.m2 = 0.0;
        secondMoment.n = 0L;
        secondMoment.m1 = 0.0;
        secondMoment.dev = 0.0;
        secondMoment.nDev = 0.0;
        Variance variance = new Variance(false, secondMoment);
        variance.moment = secondMoment;
        variance.incMoment = true;
        double[] doubleArray = {3.337610787760802E-308};
        
        double actual = variance.evaluate(doubleArray, doubleArray, 0, 1);
        
        assertEquals(0.0, actual, 1.0E-6);
        
        double finalVarianceMomentM2 = variance.moment.m2;
        double finalVarianceMomentM1 = variance.moment.m1;
        double finalVarianceMomentDev = variance.moment.dev;
        double finalVarianceMomentNDev = variance.moment.nDev;
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM2, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM1, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentDev, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentNDev, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[],int,int)}
 * @utbot.returnsFrom {@code return var;}
 *  */
    @Test
    public void testEvaluate_ReturnVar_2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        FourthMoment fourthMoment = new FourthMoment();
        fourthMoment.m4 = 0.0;
        fourthMoment.m3 = 0.0;
        fourthMoment.nDevSq = 0.0;
        fourthMoment.m2 = 0.0;
        fourthMoment.n = 0L;
        fourthMoment.m1 = 0.0;
        fourthMoment.dev = 0.0;
        fourthMoment.nDev = 0.0;
        Variance variance = new Variance(false, fourthMoment);
        variance.moment = fourthMoment;
        variance.incMoment = true;
        double[] doubleArray = {3.337610787760802E-308};
        
        double actual = variance.evaluate(doubleArray, doubleArray, 0, 1);
        
        assertEquals(0.0, actual, 1.0E-6);
        
        SecondMoment secondMoment = variance.moment;
        double finalVarianceMomentM4 = ((Double) getFieldValue(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FourthMoment", "m4"));
        SecondMoment secondMoment1 = variance.moment;
        double finalVarianceMomentM3 = ((Double) getFieldValue(secondMoment1, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "m3"));
        SecondMoment secondMoment2 = variance.moment;
        double finalVarianceMomentNDevSq = ((Double) getFieldValue(secondMoment2, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "nDevSq"));
        double finalVarianceMomentM2 = variance.moment.m2;
        double finalVarianceMomentM1 = variance.moment.m1;
        double finalVarianceMomentDev = variance.moment.dev;
        double finalVarianceMomentNDev = variance.moment.nDev;
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM4, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM3, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentNDevSq, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM2, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM1, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentDev, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentNDev, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method evaluate([D, [D, int, int)
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[],int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} when: test(values, weights, begin, length)
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testEvaluate_ThrowDimensionMismatchException2() {
        Variance variance = new Variance();
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        variance.evaluate(doubleArray, doubleArray1, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[],int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.MathIllegalArgumentException} when: test(values, weights, begin, length)
 *  */
    @Test(expected = MathIllegalArgumentException.class)
    public void testEvaluate_ThrowMathIllegalArgumentException2() {
        Variance variance = new Variance();
        double[] doubleArray = {};
        
        variance.evaluate(doubleArray, doubleArray, -1, 0);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[],int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.MathIllegalArgumentException} when: test(values, weights, begin, length)
 *  */
    @Test(expected = MathIllegalArgumentException.class)
    public void testEvaluate_ThrowMathIllegalArgumentException_12() {
        Variance variance = new Variance();
        double[] doubleArray = {java.lang.Double.NaN};
        
        variance.evaluate(doubleArray, doubleArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[],int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.MathIllegalArgumentException} when: test(values, weights, begin, length)
 *  */
    @Test(expected = MathIllegalArgumentException.class)
    public void testEvaluate_ThrowMathIllegalArgumentException_22() {
        Variance variance = new Variance();
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0, -2.225073858507202E-308};
        
        variance.evaluate(doubleArray, doubleArray1, 1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[],int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.MathIllegalArgumentException} when: test(values, weights, begin, length)
 *  */
    @Test(expected = MathIllegalArgumentException.class)
    public void testEvaluate_ThrowMathIllegalArgumentException_32() {
        Variance variance = new Variance();
        double[] doubleArray = {-0.0};
        
        variance.evaluate(doubleArray, doubleArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[],int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} when: test(values, weights, begin, length)
 *  */
    @Test(expected = NullArgumentException.class)
    public void testEvaluate_ThrowNullArgumentException2() {
        Variance variance = new Variance();
        
        variance.evaluate(((double[]) null), ((double[]) null), -255, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method evaluate([D, [D, int, int)
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: test(values, weights, begin, length)
 *  */
    @Test
    public void testEvaluate_ThrowArrayIndexOutOfBoundsException1() {
        Variance variance = new Variance();
        double[] doubleArray = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.moment.Variance.evaluate] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic.test(AbstractUnivariateStatistic.java:268)
            org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic.test(AbstractUnivariateStatistic.java:222)
            org.apache.commons.math.stat.descriptive.moment.Variance.evaluate(Variance.java:318) */
        variance.evaluate(doubleArray, doubleArray, 129, 1);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: test(values, weights, begin, length)
 *  */
    @Test
    public void testEvaluate_ThrowArrayIndexOutOfBoundsException_11() {
        Variance variance = new Variance();
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {3.337610787760802E-308, -0.0};
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.moment.Variance.evaluate] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic.test(AbstractUnivariateStatistic.java:268)
            org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic.test(AbstractUnivariateStatistic.java:222)
            org.apache.commons.math.stat.descriptive.moment.Variance.evaluate(Variance.java:318) */
        variance.evaluate(doubleArray, doubleArray1, 0, 3);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method evaluate([D, [D, int, int)
    
    @Test
    public void testEvaluate8() {
        Variance variance = new Variance(false, null);
        variance.incMoment = false;
        double[] doubleArray = {-0.0, -0.0, 3.337610787760802E-308};
        
        double actual = variance.evaluate(doubleArray, doubleArray, 0, 3);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    @Test
    public void testEvaluate9() {
        Variance variance = new Variance(false, null);
        variance.incMoment = false;
        double[] doubleArray = {
            0.0, 0.0, 3.337610787760802E-308, -0.0, -0.0, -0.0,
            0.0
        };
        
        double actual = variance.evaluate(doubleArray, doubleArray, 2, 4);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    @Test
    public void testEvaluate10() {
        ThirdMoment thirdMoment = new ThirdMoment();
        Variance variance = new Variance(false, thirdMoment);
        variance.moment = thirdMoment;
        variance.incMoment = true;
        double[] doubleArray = {3.337610787760802E-308};
        
        double actual = variance.evaluate(doubleArray, doubleArray, 0, 1);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    @Test
    public void testEvaluate11() {
        ThirdMoment thirdMoment = new ThirdMoment();
        Variance variance = new Variance(false, thirdMoment);
        variance.moment = thirdMoment;
        variance.incMoment = true;
        double[] doubleArray = {0.0, 0.0, 0.0, 0.0};
        double[] doubleArray1 = {-0.0, -0.0, -0.0, 3.337610787760802E-308};
        
        double actual = variance.evaluate(doubleArray, doubleArray1, 0, 4);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    @Test
    public void testEvaluate12() {
        ThirdMoment thirdMoment = new ThirdMoment();
        Variance variance = new Variance(false, thirdMoment);
        variance.moment = thirdMoment;
        variance.incMoment = true;
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {3.337610787760802E-308, -0.0};
        
        double actual = variance.evaluate(doubleArray, doubleArray1, 0, 2);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    @Test
    public void testEvaluate13() {
        SecondMoment secondMoment = new SecondMoment();
        secondMoment.m2 = 0.0;
        secondMoment.n = 0L;
        secondMoment.m1 = 0.0;
        secondMoment.dev = 0.0;
        secondMoment.nDev = 0.0;
        Variance variance = new Variance(false, secondMoment);
        variance.moment = secondMoment;
        variance.incMoment = true;
        double[] doubleArray = {
            0.0, 0.0, -0.0, -0.0, -0.0, 3.337610787760802E-308,
            0.0
        };
        
        double actual = variance.evaluate(doubleArray, doubleArray, 2, 4);
        
        assertEquals(0.0, actual, 1.0E-6);
        
        double finalVarianceMomentM2 = variance.moment.m2;
        double finalVarianceMomentM1 = variance.moment.m1;
        double finalVarianceMomentDev = variance.moment.dev;
        double finalVarianceMomentNDev = variance.moment.nDev;
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM2, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM1, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentDev, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentNDev, 1.0E-6);
    }
    
    @Test
    public void testEvaluate14() {
        SecondMoment secondMoment = new SecondMoment();
        secondMoment.m2 = 0.0;
        secondMoment.n = 0L;
        secondMoment.m1 = 0.0;
        secondMoment.dev = 0.0;
        secondMoment.nDev = 0.0;
        Variance variance = new Variance(false, secondMoment);
        variance.moment = secondMoment;
        variance.incMoment = true;
        double[] doubleArray = {
            0.0, 0.0, 3.337610787760802E-308, -0.0, -0.0, -0.0,
            0.0
        };
        
        double actual = variance.evaluate(doubleArray, doubleArray, 2, 4);
        
        assertEquals(0.0, actual, 1.0E-6);
        
        double finalVarianceMomentM2 = variance.moment.m2;
        double finalVarianceMomentM1 = variance.moment.m1;
        double finalVarianceMomentDev = variance.moment.dev;
        double finalVarianceMomentNDev = variance.moment.nDev;
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM2, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM1, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentDev, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentNDev, 1.0E-6);
    }
    
    @Test
    public void testEvaluate15() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        FourthMoment fourthMoment = new FourthMoment();
        fourthMoment.m4 = 0.0;
        fourthMoment.m3 = 0.0;
        fourthMoment.nDevSq = 0.0;
        fourthMoment.m2 = 0.0;
        fourthMoment.n = 0L;
        fourthMoment.m1 = 0.0;
        fourthMoment.dev = 0.0;
        fourthMoment.nDev = 0.0;
        Variance variance = new Variance(false, fourthMoment);
        variance.moment = fourthMoment;
        variance.incMoment = true;
        double[] doubleArray = {0.0, 0.0, 0.0};
        double[] doubleArray1 = {-0.0, 3.337610787760802E-308, -0.0};
        
        double actual = variance.evaluate(doubleArray, doubleArray1, 0, 3);
        
        assertEquals(0.0, actual, 1.0E-6);
        
        SecondMoment secondMoment = variance.moment;
        double finalVarianceMomentM4 = ((Double) getFieldValue(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FourthMoment", "m4"));
        SecondMoment secondMoment1 = variance.moment;
        double finalVarianceMomentM3 = ((Double) getFieldValue(secondMoment1, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "m3"));
        SecondMoment secondMoment2 = variance.moment;
        double finalVarianceMomentNDevSq = ((Double) getFieldValue(secondMoment2, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "nDevSq"));
        double finalVarianceMomentM2 = variance.moment.m2;
        double finalVarianceMomentM1 = variance.moment.m1;
        double finalVarianceMomentDev = variance.moment.dev;
        double finalVarianceMomentNDev = variance.moment.nDev;
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM4, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM3, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentNDevSq, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM2, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM1, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentDev, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentNDev, 1.0E-6);
    }
    
    @Test
    public void testEvaluate16() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        FourthMoment fourthMoment = new FourthMoment();
        fourthMoment.m4 = 0.0;
        fourthMoment.m3 = 0.0;
        fourthMoment.nDevSq = 0.0;
        fourthMoment.m2 = 0.0;
        fourthMoment.n = 0L;
        fourthMoment.m1 = 0.0;
        fourthMoment.dev = 0.0;
        fourthMoment.nDev = 0.0;
        Variance variance = new Variance(false, fourthMoment);
        variance.moment = fourthMoment;
        variance.incMoment = true;
        double[] doubleArray = {3.337610787760802E-308, -0.0, -0.0};
        
        double actual = variance.evaluate(doubleArray, doubleArray, 0, 3);
        
        assertEquals(0.0, actual, 1.0E-6);
        
        SecondMoment secondMoment = variance.moment;
        double finalVarianceMomentM4 = ((Double) getFieldValue(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FourthMoment", "m4"));
        SecondMoment secondMoment1 = variance.moment;
        double finalVarianceMomentM3 = ((Double) getFieldValue(secondMoment1, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "m3"));
        SecondMoment secondMoment2 = variance.moment;
        double finalVarianceMomentNDevSq = ((Double) getFieldValue(secondMoment2, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "nDevSq"));
        double finalVarianceMomentM2 = variance.moment.m2;
        double finalVarianceMomentM1 = variance.moment.m1;
        double finalVarianceMomentDev = variance.moment.dev;
        double finalVarianceMomentNDev = variance.moment.nDev;
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM4, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM3, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentNDevSq, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM2, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM1, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentDev, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentNDev, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method evaluate([D, [D, int, int)
    
    @Test(expected = MathIllegalArgumentException.class)
    public void testEvaluate17() {
        Variance variance = new Variance();
        double[] doubleArray = new double[33];
        doubleArray[28] = -0.0;
        doubleArray[29] = -0.0;
        doubleArray[30] = 3.337610787760802E-308;
        doubleArray[31] = -0.0;
        doubleArray[32] = java.lang.Double.NaN;
        
        variance.evaluate(doubleArray, doubleArray, 28, 35);
    }
    
    @Test(expected = MathIllegalArgumentException.class)
    public void testEvaluate18() {
        Variance variance = new Variance();
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 3.337610787760802E-308, -0.0,
            -0.0, -0.0, java.lang.Double.POSITIVE_INFINITY
        };
        
        variance.evaluate(doubleArray, doubleArray, 4, 11);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method evaluate([D, [D, int, int)
    
    @Test
    public void testEvaluate19() {
        Variance variance = new Variance();
        double[] doubleArray = new double[33];
        double[] doubleArray1 = new double[33];
        doubleArray1[28] = -0.0;
        doubleArray1[29] = 3.337610787760802E-308;
        doubleArray1[30] = -0.0;
        doubleArray1[31] = -0.0;
        doubleArray1[32] = 2.2250738585072014E-308;
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.moment.Variance.evaluate] produces [java.lang.ArrayIndexOutOfBoundsException: Index 33 out of bounds for length 33]
            org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic.test(AbstractUnivariateStatistic.java:268)
            org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic.test(AbstractUnivariateStatistic.java:222)
            org.apache.commons.math.stat.descriptive.moment.Variance.evaluate(Variance.java:318) */
        variance.evaluate(doubleArray, doubleArray1, 28, 35);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.moment.Variance.evaluate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method evaluate([D)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): True}
    /// invoke:
    ///     {@link org.apache.commons.math.stat.descriptive.moment.Variance#clear()} twice
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[])}
 * @utbot.returnsFrom {@code return evaluate(values, 0, values.length);}
 *  */
    @Test
    public void testEvaluate_ReturnEvaluate1() {
        Variance variance = new Variance(false, null);
        variance.incMoment = false;
        double[] doubleArray = {0.0};
        
        double actual = variance.evaluate(doubleArray);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[])}
 * @utbot.returnsFrom {@code return evaluate(values, 0, values.length);}
 *  */
    @Test
    public void testEvaluate_ReturnEvaluate_21() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        ThirdMoment thirdMoment = new ThirdMoment();
        thirdMoment.m3 = 0.0;
        thirdMoment.nDevSq = 0.0;
        thirdMoment.m2 = 0.0;
        thirdMoment.n = 0L;
        thirdMoment.m1 = 0.0;
        thirdMoment.dev = 0.0;
        thirdMoment.nDev = 0.0;
        Variance variance = new Variance(false, thirdMoment);
        variance.moment = thirdMoment;
        variance.incMoment = true;
        double[] doubleArray = {0.0};
        
        double actual = variance.evaluate(doubleArray);
        
        assertEquals(0.0, actual, 1.0E-6);
        
        SecondMoment secondMoment = variance.moment;
        double finalVarianceMomentM3 = ((Double) getFieldValue(secondMoment, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "m3"));
        SecondMoment secondMoment1 = variance.moment;
        double finalVarianceMomentNDevSq = ((Double) getFieldValue(secondMoment1, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "nDevSq"));
        double finalVarianceMomentM2 = variance.moment.m2;
        double finalVarianceMomentM1 = variance.moment.m1;
        double finalVarianceMomentDev = variance.moment.dev;
        double finalVarianceMomentNDev = variance.moment.nDev;
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM3, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentNDevSq, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM2, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM1, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentDev, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentNDev, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[])}
 * @utbot.returnsFrom {@code return evaluate(values, 0, values.length);}
 *  */
    @Test
    public void testEvaluate_ReturnEvaluate_11() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        FourthMoment fourthMoment = new FourthMoment();
        fourthMoment.m4 = 0.0;
        fourthMoment.m3 = 0.0;
        fourthMoment.nDevSq = 0.0;
        fourthMoment.m2 = 0.0;
        fourthMoment.n = 0L;
        fourthMoment.m1 = 0.0;
        fourthMoment.dev = 0.0;
        fourthMoment.nDev = 0.0;
        Variance variance = new Variance(false, fourthMoment);
        variance.moment = fourthMoment;
        variance.incMoment = true;
        double[] doubleArray = {0.0};
        
        double actual = variance.evaluate(doubleArray);
        
        assertEquals(0.0, actual, 1.0E-6);
        
        SecondMoment secondMoment = variance.moment;
        double finalVarianceMomentM4 = ((Double) getFieldValue(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FourthMoment", "m4"));
        SecondMoment secondMoment1 = variance.moment;
        double finalVarianceMomentM3 = ((Double) getFieldValue(secondMoment1, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "m3"));
        SecondMoment secondMoment2 = variance.moment;
        double finalVarianceMomentNDevSq = ((Double) getFieldValue(secondMoment2, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "nDevSq"));
        double finalVarianceMomentM2 = variance.moment.m2;
        double finalVarianceMomentM1 = variance.moment.m1;
        double finalVarianceMomentDev = variance.moment.dev;
        double finalVarianceMomentNDev = variance.moment.nDev;
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM4, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM3, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentNDevSq, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM2, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM1, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentDev, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentNDev, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method evaluate([D)
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[])}
 * @utbot.returnsFrom {@code return evaluate(values, 0, values.length);}
 *  */
    @Test
    public void testEvaluate_ReturnEvaluate_5() {
        Variance variance = new Variance();
        double[] doubleArray = {};
        
        double actual = variance.evaluate(doubleArray);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[])}
 * @utbot.returnsFrom {@code return evaluate(values, 0, values.length);}
 *  */
    @Test
    public void testEvaluate_ReturnEvaluate_3() {
        SecondMoment secondMoment = new SecondMoment();
        secondMoment.m2 = 0.0;
        secondMoment.n = 0L;
        secondMoment.m1 = 0.0;
        secondMoment.dev = 0.0;
        secondMoment.nDev = 0.0;
        Variance variance = new Variance(false, secondMoment);
        variance.moment = secondMoment;
        variance.incMoment = true;
        variance.setBiasCorrected(false);
        double[] doubleArray = {0.0, 0.0};
        
        double actual = variance.evaluate(doubleArray);
        
        assertEquals(0.0, actual, 1.0E-6);
        
        double finalVarianceMomentM2 = variance.moment.m2;
        double finalVarianceMomentM1 = variance.moment.m1;
        double finalVarianceMomentDev = variance.moment.dev;
        double finalVarianceMomentNDev = variance.moment.nDev;
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM2, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM1, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentDev, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentNDev, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[])}
 * @utbot.returnsFrom {@code return evaluate(values, 0, values.length);}
 *  */
    @Test
    public void testEvaluate_ReturnEvaluate_4() {
        SecondMoment secondMoment = new SecondMoment();
        secondMoment.m2 = 0.0;
        secondMoment.n = 0L;
        secondMoment.m1 = 0.0;
        secondMoment.dev = 0.0;
        secondMoment.nDev = 0.0;
        Variance variance = new Variance(true, secondMoment);
        variance.moment = secondMoment;
        variance.incMoment = true;
        variance.setBiasCorrected(true);
        double[] doubleArray = {0.0, 0.0};
        
        double actual = variance.evaluate(doubleArray);
        
        assertEquals(0.0, actual, 1.0E-6);
        
        double finalVarianceMomentM2 = variance.moment.m2;
        double finalVarianceMomentM1 = variance.moment.m1;
        double finalVarianceMomentDev = variance.moment.dev;
        double finalVarianceMomentNDev = variance.moment.nDev;
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM2, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM1, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentDev, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentNDev, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method evaluate([D)
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[])}
 * @utbot.executesCondition {@code (values == null): True}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} when: values == null
 *  */
    @Test(expected = NullArgumentException.class)
    public void testEvaluate_ThrowNullArgumentException3() {
        Variance variance = new Variance();
        
        variance.evaluate(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.moment.Variance.evaluate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method evaluate([D, int, int)
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],int,int)}
 * @utbot.returnsFrom {@code return var;}
 *  */
    @Test
    public void testEvaluate_ReturnVar1() {
        Variance variance = new Variance();
        double[] doubleArray = {};
        
        double actual = variance.evaluate(doubleArray, 0, 0);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],int,int)}
 * @utbot.executesCondition {@code (length > 1): True}
 * @utbot.returnsFrom {@code return var;}
 *  */
    @Test
    public void testEvaluate_LengthGreaterThan1() {
        Variance variance = new Variance(false, null);
        variance.incMoment = false;
        variance.setBiasCorrected(false);
        double[] doubleArray = {0.0};
        
        double actual = variance.evaluate(doubleArray, 1082859529, 1937047826);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],int,int)}
 * @utbot.executesCondition {@code (length > 1): True}
 * @utbot.returnsFrom {@code return var;}
 *  */
    @Test
    public void testEvaluate_LengthGreaterThan1_1() {
        Variance variance = new Variance(true, null);
        variance.incMoment = false;
        variance.setBiasCorrected(true);
        double[] doubleArray = {0.0, 0.0};
        
        double actual = variance.evaluate(doubleArray, 0, 2);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],int,int)}
 * @utbot.returnsFrom {@code return var;}
 *  */
    @Test
    public void testEvaluate_ReturnVar_11() {
        SecondMoment secondMoment = new SecondMoment();
        secondMoment.m2 = 0.0;
        secondMoment.n = 0L;
        secondMoment.m1 = 0.0;
        secondMoment.dev = 0.0;
        secondMoment.nDev = 0.0;
        Variance variance = new Variance(false, secondMoment);
        variance.moment = secondMoment;
        variance.incMoment = true;
        double[] doubleArray = {0.0};
        
        double actual = variance.evaluate(doubleArray, 0, 1);
        
        assertEquals(0.0, actual, 1.0E-6);
        
        double finalVarianceMomentM2 = variance.moment.m2;
        double finalVarianceMomentM1 = variance.moment.m1;
        double finalVarianceMomentDev = variance.moment.dev;
        double finalVarianceMomentNDev = variance.moment.nDev;
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM2, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM1, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentDev, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentNDev, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],int,int)}
 * @utbot.returnsFrom {@code return var;}
 *  */
    @Test
    public void testEvaluate_ReturnVar_3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        ThirdMoment thirdMoment = new ThirdMoment();
        thirdMoment.m3 = 0.0;
        thirdMoment.nDevSq = 0.0;
        thirdMoment.m2 = 0.0;
        thirdMoment.n = 0L;
        thirdMoment.m1 = 0.0;
        thirdMoment.dev = 0.0;
        thirdMoment.nDev = 0.0;
        Variance variance = new Variance(false, thirdMoment);
        variance.moment = thirdMoment;
        variance.incMoment = true;
        double[] doubleArray = {0.0};
        
        double actual = variance.evaluate(doubleArray, 0, 1);
        
        assertEquals(0.0, actual, 1.0E-6);
        
        SecondMoment secondMoment = variance.moment;
        double finalVarianceMomentM3 = ((Double) getFieldValue(secondMoment, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "m3"));
        SecondMoment secondMoment1 = variance.moment;
        double finalVarianceMomentNDevSq = ((Double) getFieldValue(secondMoment1, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "nDevSq"));
        double finalVarianceMomentM2 = variance.moment.m2;
        double finalVarianceMomentM1 = variance.moment.m1;
        double finalVarianceMomentDev = variance.moment.dev;
        double finalVarianceMomentNDev = variance.moment.nDev;
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM3, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentNDevSq, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM2, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM1, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentDev, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentNDev, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],int,int)}
 * @utbot.returnsFrom {@code return var;}
 *  */
    @Test
    public void testEvaluate_ReturnVar_21() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        FourthMoment fourthMoment = new FourthMoment();
        fourthMoment.m4 = 0.0;
        fourthMoment.m3 = 0.0;
        fourthMoment.nDevSq = 0.0;
        fourthMoment.m2 = 0.0;
        fourthMoment.n = 0L;
        fourthMoment.m1 = 0.0;
        fourthMoment.dev = 0.0;
        fourthMoment.nDev = 0.0;
        Variance variance = new Variance(false, fourthMoment);
        variance.moment = fourthMoment;
        variance.incMoment = true;
        double[] doubleArray = {0.0};
        
        double actual = variance.evaluate(doubleArray, 0, 1);
        
        assertEquals(0.0, actual, 1.0E-6);
        
        SecondMoment secondMoment = variance.moment;
        double finalVarianceMomentM4 = ((Double) getFieldValue(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FourthMoment", "m4"));
        SecondMoment secondMoment1 = variance.moment;
        double finalVarianceMomentM3 = ((Double) getFieldValue(secondMoment1, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "m3"));
        SecondMoment secondMoment2 = variance.moment;
        double finalVarianceMomentNDevSq = ((Double) getFieldValue(secondMoment2, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "nDevSq"));
        double finalVarianceMomentM2 = variance.moment.m2;
        double finalVarianceMomentM1 = variance.moment.m1;
        double finalVarianceMomentDev = variance.moment.dev;
        double finalVarianceMomentNDev = variance.moment.nDev;
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM4, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM3, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentNDevSq, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM2, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM1, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentDev, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentNDev, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method evaluate([D, int, int)
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NotPositiveException} when: test(values, begin, length)
 *  */
    @Test(expected = NotPositiveException.class)
    public void testEvaluate_ThrowNotPositiveException() {
        Variance variance = new Variance();
        double[] doubleArray = {0.0};
        
        variance.evaluate(doubleArray, -1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NotPositiveException} when: test(values, begin, length)
 *  */
    @Test(expected = NotPositiveException.class)
    public void testEvaluate_ThrowNotPositiveException_1() {
        Variance variance = new Variance();
        double[] doubleArray = {0.0};
        
        variance.evaluate(doubleArray, 0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NumberIsTooLargeException} when: test(values, begin, length)
 *  */
    @Test(expected = NumberIsTooLargeException.class)
    public void testEvaluate_ThrowNumberIsTooLargeException() {
        Variance variance = new Variance();
        double[] doubleArray = {};
        
        variance.evaluate(doubleArray, 1, 0);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} when: test(values, begin, length)
 *  */
    @Test(expected = NullArgumentException.class)
    public void testEvaluate_ThrowNullArgumentException4() {
        Variance variance = new Variance();
        
        variance.evaluate(((double[]) null), -255, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.moment.Variance.evaluate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method evaluate([D, [D)
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[])}
 * @utbot.returnsFrom {@code return evaluate(values, weights, 0, values.length);}
 *  */
    @Test
    public void testEvaluate_ReturnEvaluate2() {
        Variance variance = new Variance(false, null);
        variance.incMoment = false;
        double[] doubleArray = {3.337610787760802E-308};
        
        double actual = variance.evaluate(doubleArray, doubleArray);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[])}
 * @utbot.returnsFrom {@code return evaluate(values, weights, 0, values.length);}
 *  */
    @Test
    public void testEvaluate_ReturnEvaluate_12() {
        SecondMoment secondMoment = new SecondMoment();
        secondMoment.m2 = 0.0;
        secondMoment.n = 0L;
        secondMoment.m1 = 0.0;
        secondMoment.dev = 0.0;
        secondMoment.nDev = 0.0;
        Variance variance = new Variance(false, secondMoment);
        variance.moment = secondMoment;
        variance.incMoment = true;
        double[] doubleArray = {3.337610787760802E-308};
        
        double actual = variance.evaluate(doubleArray, doubleArray);
        
        assertEquals(0.0, actual, 1.0E-6);
        
        double finalVarianceMomentM2 = variance.moment.m2;
        double finalVarianceMomentM1 = variance.moment.m1;
        double finalVarianceMomentDev = variance.moment.dev;
        double finalVarianceMomentNDev = variance.moment.nDev;
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM2, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM1, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentDev, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentNDev, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[])}
 * @utbot.returnsFrom {@code return evaluate(values, weights, 0, values.length);}
 *  */
    @Test
    public void testEvaluate_ReturnEvaluate_22() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        FourthMoment fourthMoment = new FourthMoment();
        fourthMoment.m4 = 0.0;
        fourthMoment.m3 = 0.0;
        fourthMoment.nDevSq = 0.0;
        fourthMoment.m2 = 0.0;
        fourthMoment.n = 0L;
        fourthMoment.m1 = 0.0;
        fourthMoment.dev = 0.0;
        fourthMoment.nDev = 0.0;
        Variance variance = new Variance(false, fourthMoment);
        variance.moment = fourthMoment;
        variance.incMoment = true;
        double[] doubleArray = {3.337610787760802E-308};
        
        double actual = variance.evaluate(doubleArray, doubleArray);
        
        assertEquals(0.0, actual, 1.0E-6);
        
        SecondMoment secondMoment = variance.moment;
        double finalVarianceMomentM4 = ((Double) getFieldValue(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FourthMoment", "m4"));
        SecondMoment secondMoment1 = variance.moment;
        double finalVarianceMomentM3 = ((Double) getFieldValue(secondMoment1, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "m3"));
        SecondMoment secondMoment2 = variance.moment;
        double finalVarianceMomentNDevSq = ((Double) getFieldValue(secondMoment2, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "nDevSq"));
        double finalVarianceMomentM2 = variance.moment.m2;
        double finalVarianceMomentM1 = variance.moment.m1;
        double finalVarianceMomentDev = variance.moment.dev;
        double finalVarianceMomentNDev = variance.moment.nDev;
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM4, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM3, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentNDevSq, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM2, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM1, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentDev, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentNDev, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method evaluate([D, [D)
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[])}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: return evaluate(values, weights, 0, values.length);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testEvaluate_ThrowDimensionMismatchException3() {
        Variance variance = new Variance();
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        variance.evaluate(doubleArray, doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[])}
 * @utbot.throwsException {@link org.apache.commons.math.exception.MathIllegalArgumentException} in: return evaluate(values, weights, 0, values.length);
 *  */
    @Test(expected = MathIllegalArgumentException.class)
    public void testEvaluate_ThrowMathIllegalArgumentException3() {
        Variance variance = new Variance();
        double[] doubleArray = {};
        
        variance.evaluate(doubleArray, doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[])}
 * @utbot.throwsException {@link org.apache.commons.math.exception.MathIllegalArgumentException} in: return evaluate(values, weights, 0, values.length);
 *  */
    @Test(expected = MathIllegalArgumentException.class)
    public void testEvaluate_ThrowMathIllegalArgumentException_13() {
        Variance variance = new Variance();
        double[] doubleArray = {-2.225073858507202E-308};
        
        variance.evaluate(doubleArray, doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[])}
 * @utbot.throwsException {@link org.apache.commons.math.exception.MathIllegalArgumentException} in: return evaluate(values, weights, 0, values.length);
 *  */
    @Test(expected = MathIllegalArgumentException.class)
    public void testEvaluate_ThrowMathIllegalArgumentException_23() {
        Variance variance = new Variance();
        double[] doubleArray = {-0.0};
        
        variance.evaluate(doubleArray, doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[])}
 * @utbot.throwsException {@link org.apache.commons.math.exception.MathIllegalArgumentException} in: return evaluate(values, weights, 0, values.length);
 *  */
    @Test(expected = MathIllegalArgumentException.class)
    public void testEvaluate_ThrowMathIllegalArgumentException_33() {
        Variance variance = new Variance();
        double[] doubleArray = {java.lang.Double.NaN};
        
        variance.evaluate(doubleArray, doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[])}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} in: return evaluate(values, weights, 0, values.length);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testEvaluate_ThrowNullArgumentException5() {
        Variance variance = new Variance();
        double[] doubleArray = {0.0};
        
        variance.evaluate(doubleArray, ((double[]) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method evaluate([D, [D)
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return evaluate(values, weights, 0, values.length);
 *  */
    @Test
    public void testEvaluate_ThrowNullPointerException1() {
        Variance variance = new Variance();
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.moment.Variance.evaluate] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.moment.Variance.evaluate(Variance.java:370) */
        variance.evaluate(((double[]) null), ((double[]) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method evaluate([D, [D)
    
    @Test
    public void testEvaluate20() {
        Variance variance = new Variance();
        double[] doubleArray = {-0.0, -0.0, 3.337610787760802E-308, -0.0, 0.0};
        
        double actual = variance.evaluate(doubleArray, doubleArray);
        
        assertEquals(-0.0, actual, 1.0E-6);
    }
    
    @Test
    public void testEvaluate21() {
        Variance variance = new Variance();
        double[] doubleArray = {3.337610787760802E-308, -0.0, -0.0, -0.0, -0.0};
        
        double actual = variance.evaluate(doubleArray, doubleArray);
        
        assertEquals(-0.0, actual, 1.0E-6);
    }
    
    @Test
    public void testEvaluate22() {
        Variance variance = new Variance(false, null);
        variance.incMoment = false;
        double[] doubleArray = {-0.0, 3.337610787760802E-308, -0.0};
        
        double actual = variance.evaluate(doubleArray, doubleArray);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    @Test
    public void testEvaluate23() {
        Variance variance = new Variance(false, null);
        variance.incMoment = false;
        double[] doubleArray = {3.337610787760802E-308, -0.0, -0.0};
        
        double actual = variance.evaluate(doubleArray, doubleArray);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    @Test
    public void testEvaluate24() {
        ThirdMoment thirdMoment = new ThirdMoment();
        Variance variance = new Variance(false, thirdMoment);
        variance.moment = thirdMoment;
        variance.incMoment = true;
        double[] doubleArray = {3.337610787760802E-308};
        
        double actual = variance.evaluate(doubleArray, doubleArray);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    @Test
    public void testEvaluate25() {
        ThirdMoment thirdMoment = new ThirdMoment();
        Variance variance = new Variance(false, thirdMoment);
        variance.moment = thirdMoment;
        variance.incMoment = true;
        double[] doubleArray = {-0.0, -0.0, -0.0, 2.2250738585072014E-308};
        
        double actual = variance.evaluate(doubleArray, doubleArray);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    @Test
    public void testEvaluate26() {
        ThirdMoment thirdMoment = new ThirdMoment();
        Variance variance = new Variance(false, thirdMoment);
        variance.moment = thirdMoment;
        variance.incMoment = true;
        double[] doubleArray = {3.337610787760802E-308, -0.0, -0.0, -0.0};
        
        double actual = variance.evaluate(doubleArray, doubleArray);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    @Test
    public void testEvaluate27() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        FourthMoment fourthMoment = new FourthMoment();
        fourthMoment.m4 = 0.0;
        fourthMoment.m3 = 0.0;
        fourthMoment.nDevSq = 0.0;
        fourthMoment.m2 = 0.0;
        fourthMoment.n = 0L;
        fourthMoment.m1 = 0.0;
        fourthMoment.dev = 0.0;
        fourthMoment.nDev = 0.0;
        Variance variance = new Variance(false, fourthMoment);
        variance.moment = fourthMoment;
        variance.incMoment = true;
        double[] doubleArray = {-0.0, 3.337610787760802E-308, -0.0};
        
        double actual = variance.evaluate(doubleArray, doubleArray);
        
        assertEquals(0.0, actual, 1.0E-6);
        
        SecondMoment secondMoment = variance.moment;
        double finalVarianceMomentM4 = ((Double) getFieldValue(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FourthMoment", "m4"));
        SecondMoment secondMoment1 = variance.moment;
        double finalVarianceMomentM3 = ((Double) getFieldValue(secondMoment1, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "m3"));
        SecondMoment secondMoment2 = variance.moment;
        double finalVarianceMomentNDevSq = ((Double) getFieldValue(secondMoment2, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "nDevSq"));
        double finalVarianceMomentM2 = variance.moment.m2;
        double finalVarianceMomentM1 = variance.moment.m1;
        double finalVarianceMomentDev = variance.moment.dev;
        double finalVarianceMomentNDev = variance.moment.nDev;
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM4, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM3, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentNDevSq, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM2, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM1, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentDev, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentNDev, 1.0E-6);
    }
    
    @Test
    public void testEvaluate28() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        FourthMoment fourthMoment = new FourthMoment();
        fourthMoment.m4 = 0.0;
        fourthMoment.m3 = 0.0;
        fourthMoment.nDevSq = 0.0;
        fourthMoment.m2 = 0.0;
        fourthMoment.n = 0L;
        fourthMoment.m1 = 0.0;
        fourthMoment.dev = 0.0;
        fourthMoment.nDev = 0.0;
        Variance variance = new Variance(false, fourthMoment);
        variance.moment = fourthMoment;
        variance.incMoment = true;
        double[] doubleArray = {3.337610787760802E-308, -0.0, -0.0, -0.0};
        
        double actual = variance.evaluate(doubleArray, doubleArray);
        
        assertEquals(0.0, actual, 1.0E-6);
        
        SecondMoment secondMoment = variance.moment;
        double finalVarianceMomentM4 = ((Double) getFieldValue(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FourthMoment", "m4"));
        SecondMoment secondMoment1 = variance.moment;
        double finalVarianceMomentM3 = ((Double) getFieldValue(secondMoment1, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "m3"));
        SecondMoment secondMoment2 = variance.moment;
        double finalVarianceMomentNDevSq = ((Double) getFieldValue(secondMoment2, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "nDevSq"));
        double finalVarianceMomentM2 = variance.moment.m2;
        double finalVarianceMomentM1 = variance.moment.m1;
        double finalVarianceMomentDev = variance.moment.dev;
        double finalVarianceMomentNDev = variance.moment.nDev;
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM4, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM3, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentNDevSq, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM2, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentM1, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentDev, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalVarianceMomentNDev, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method evaluate([D, [D)
    
    @Test(expected = MathIllegalArgumentException.class)
    public void testEvaluate29() {
        Variance variance = new Variance();
        double[] doubleArray = {-0.0, -0.0, -0.0, -0.0, java.lang.Double.NaN};
        
        variance.evaluate(doubleArray, doubleArray);
    }
    
    @Test(expected = MathIllegalArgumentException.class)
    public void testEvaluate30() {
        Variance variance = new Variance();
        double[] doubleArray = {3.337610787760802E-308, -0.0, -0.0, -0.0, java.lang.Double.NEGATIVE_INFINITY};
        
        variance.evaluate(doubleArray, doubleArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.moment.Variance.evaluate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method evaluate([D, double)
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double)}
 * @utbot.returnsFrom {@code return evaluate(values, mean, 0, values.length);}
 *  */
    @Test
    public void testEvaluate_ReturnEvaluate_23() {
        Variance variance = new Variance();
        double[] doubleArray = {};
        
        double actual = variance.evaluate(doubleArray, java.lang.Double.NaN);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double)}
 * @utbot.returnsFrom {@code return evaluate(values, mean, 0, values.length);}
 *  */
    @Test
    public void testEvaluate_ReturnEvaluate_31() {
        Variance variance = new Variance();
        double[] doubleArray = {0.0};
        
        double actual = variance.evaluate(doubleArray, java.lang.Double.NaN);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double)}
 * @utbot.returnsFrom {@code return evaluate(values, mean, 0, values.length);}
 *  */
    @Test
    public void testEvaluate_ReturnEvaluate3() {
        Variance variance = new Variance(true, null);
        variance.setBiasCorrected(true);
        double[] doubleArray = {0.0, 0.0};
        
        double actual = variance.evaluate(doubleArray, java.lang.Double.NaN);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double)}
 * @utbot.returnsFrom {@code return evaluate(values, mean, 0, values.length);}
 *  */
    @Test
    public void testEvaluate_ReturnEvaluate_13() {
        Variance variance = new Variance(false, null);
        variance.setBiasCorrected(false);
        double[] doubleArray = {0.0, 0.0};
        
        double actual = variance.evaluate(doubleArray, java.lang.Double.NaN);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method evaluate([D, double)
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return evaluate(values, mean, 0, values.length);
 *  */
    @Test
    public void testEvaluate_ThrowNullPointerException2() {
        Variance variance = new Variance();
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.moment.Variance.evaluate] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.moment.Variance.evaluate(Variance.java:453) */
        variance.evaluate(((double[]) null), java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.moment.Variance.evaluate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method evaluate([D, double, int, int)
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double,int,int)}
 * @utbot.executesCondition {@code (test(values, begin, length)): False}
 * @utbot.returnsFrom {@code return var;}
 *  */
    @Test
    public void testEvaluate_NotTest() {
        Variance variance = new Variance();
        double[] doubleArray = {};
        
        double actual = variance.evaluate(doubleArray, java.lang.Double.NaN, 0, 0);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double,int,int)}
 * @utbot.executesCondition {@code (test(values, begin, length)): True}
 * @utbot.executesCondition {@code (length == 1): True}
 * @utbot.returnsFrom {@code return var;}
 *  */
    @Test
    public void testEvaluate_LengthEquals11() {
        Variance variance = new Variance();
        double[] doubleArray = {0.0};
        
        double actual = variance.evaluate(doubleArray, java.lang.Double.NaN, 0, 1);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double,int,int)}
 * @utbot.executesCondition {@code (test(values, begin, length)): True}
 * @utbot.executesCondition {@code (length == 1): False}
 * @utbot.executesCondition {@code (length > 1): True}
 * @utbot.executesCondition {@code (isBiasCorrected): True}
 * @utbot.returnsFrom {@code return var;}
 *  */
    @Test
    public void testEvaluate_IsBiasCorrected1() {
        Variance variance = new Variance(true, null);
        variance.setBiasCorrected(true);
        double[] doubleArray = {0.0, 0.0};
        
        double actual = variance.evaluate(doubleArray, java.lang.Double.NaN, 1490026496, 1074003989);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double,int,int)}
 * @utbot.executesCondition {@code (test(values, begin, length)): True}
 * @utbot.executesCondition {@code (length == 1): False}
 * @utbot.executesCondition {@code (length > 1): True}
 * @utbot.executesCondition {@code (isBiasCorrected): False}
 * @utbot.returnsFrom {@code return var;}
 *  */
    @Test
    public void testEvaluate_NotIsBiasCorrected1() {
        Variance variance = new Variance(false, null);
        variance.setBiasCorrected(false);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        double actual = variance.evaluate(doubleArray, java.lang.Double.NaN, 1610617856, 1142156299);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double,int,int)}
 * @utbot.executesCondition {@code (test(values, begin, length)): True}
 * @utbot.executesCondition {@code (length == 1): False}
 * @utbot.executesCondition {@code (length > 1): True}
 * @utbot.executesCondition {@code (isBiasCorrected): True}
 * @utbot.iterates iterate the loop {@code for(int i = begin; i < begin + length; i++)} twice
 * @utbot.returnsFrom {@code return var;}
 *  */
    @Test
    public void testEvaluate_IsBiasCorrected_1() {
        Variance variance = new Variance(true, null);
        variance.setBiasCorrected(true);
        double[] doubleArray = {0.0, 0.0};
        
        double actual = variance.evaluate(doubleArray, java.lang.Double.NaN, 0, 2);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method evaluate([D, double, int, int)
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double,int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NotPositiveException} when: test(values, begin, length)
 *  */
    @Test(expected = NotPositiveException.class)
    public void testEvaluate_ThrowNotPositiveException1() {
        Variance variance = new Variance();
        double[] doubleArray = {0.0};
        
        variance.evaluate(doubleArray, java.lang.Double.NaN, 0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double,int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NotPositiveException} when: test(values, begin, length)
 *  */
    @Test(expected = NotPositiveException.class)
    public void testEvaluate_ThrowNotPositiveException_11() {
        Variance variance = new Variance();
        double[] doubleArray = {0.0};
        
        variance.evaluate(doubleArray, java.lang.Double.NaN, -1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double,int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NumberIsTooLargeException} when: test(values, begin, length)
 *  */
    @Test(expected = NumberIsTooLargeException.class)
    public void testEvaluate_ThrowNumberIsTooLargeException1() {
        Variance variance = new Variance();
        double[] doubleArray = {};
        
        variance.evaluate(doubleArray, java.lang.Double.NaN, 1, 0);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#evaluate(double[],double,int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} when: test(values, begin, length)
 *  */
    @Test(expected = NullArgumentException.class)
    public void testEvaluate_ThrowNullArgumentException6() {
        Variance variance = new Variance();
        
        variance.evaluate(((double[]) null), java.lang.Double.NaN, -255, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.moment.Variance.getResult
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getResult()
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#getResult()}
 * @utbot.executesCondition {@code (moment.n == 0): True}
 * @utbot.returnsFrom {@code return Double.NaN;}
 *  */
    @Test
    public void testGetResult_MomentNEqualsZero() {
        FourthMoment fourthMoment = new FourthMoment();
        fourthMoment.n = 0L;
        Variance variance = new Variance(false, fourthMoment);
        variance.moment = fourthMoment;
        
        double actual = variance.getResult();
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#getResult()}
 * @utbot.executesCondition {@code (moment.n == 0): False}
 * @utbot.executesCondition {@code (moment.n == 1): True}
 * @utbot.returnsFrom {@code return 0d;}
 *  */
    @Test
    public void testGetResult_MomentNEquals1() {
        FourthMoment fourthMoment = new FourthMoment();
        fourthMoment.n = 1L;
        Variance variance = new Variance(false, fourthMoment);
        variance.moment = fourthMoment;
        
        double actual = variance.getResult();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#getResult()}
 * @utbot.executesCondition {@code (moment.n == 0): False}
 * @utbot.executesCondition {@code (moment.n == 1): False}
 * @utbot.executesCondition {@code (isBiasCorrected): False}
 * @utbot.returnsFrom {@code return moment.m2 / (moment.n);}
 *  */
    @Test
    public void testGetResult_NotIsBiasCorrected() {
        FourthMoment fourthMoment = new FourthMoment();
        fourthMoment.m2 = 0.0;
        fourthMoment.n = 2L;
        Variance variance = new Variance(false, fourthMoment);
        variance.moment = fourthMoment;
        variance.setBiasCorrected(false);
        
        double actual = variance.getResult();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#getResult()}
 * @utbot.executesCondition {@code (moment.n == 0): False}
 * @utbot.executesCondition {@code (moment.n == 1): False}
 * @utbot.executesCondition {@code (isBiasCorrected): True}
 * @utbot.returnsFrom {@code return moment.m2 / (moment.n - 1d);}
 *  */
    @Test
    public void testGetResult_IsBiasCorrected() {
        FourthMoment fourthMoment = new FourthMoment();
        fourthMoment.m2 = 0.0;
        fourthMoment.n = 2L;
        Variance variance = new Variance(true, fourthMoment);
        variance.moment = fourthMoment;
        variance.setBiasCorrected(true);
        
        double actual = variance.getResult();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getResult()
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#getResult()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: moment.n == 0
 *  */
    @Test
    public void testGetResult_ThrowNullPointerException() {
        Variance variance = new Variance(false, null);
        variance.moment = null;
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.moment.Variance.getResult] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.moment.Variance.getResult(Variance.java:179) */
        variance.getResult();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.moment.Variance.isBiasCorrected
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isBiasCorrected()
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#isBiasCorrected()}
 * @utbot.returnsFrom {@code return isBiasCorrected;}
 *  */
    @Test
    public void testIsBiasCorrected_ReturnIsBiasCorrected() {
        Variance variance = new Variance(false, null);
        variance.setBiasCorrected(false);
        
        boolean actual = variance.isBiasCorrected();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.moment.Variance.getN
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getN()
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#getN()}
 * @utbot.invokes {@link org.apache.commons.math.stat.descriptive.moment.SecondMoment#getN()}
 * @utbot.returnsFrom {@code return moment.getN();}
 *  */
    @Test
    public void testGetN_SecondMomentGetN() {
        FourthMoment fourthMoment = new FourthMoment();
        fourthMoment.n = -255L;
        Variance variance = new Variance(false, fourthMoment);
        variance.moment = fourthMoment;
        
        long actual = variance.getN();
        
        org.junit.Assert.assertEquals(-255L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getN()
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#getN()}
 * @utbot.invokes {@link org.apache.commons.math.stat.descriptive.moment.SecondMoment#getN()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return moment.getN();
 *  */
    @Test
    public void testGetN_ThrowNullPointerException() {
        Variance variance = new Variance(false, null);
        variance.moment = null;
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.moment.Variance.getN] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.moment.Variance.getN(Variance.java:196) */
        variance.getN();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.moment.Variance.setBiasCorrected
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setBiasCorrected(boolean)
    
    /**
    @utbot.classUnderTest {@link Variance}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.moment.Variance#setBiasCorrected(boolean)}
 *  */
    @Test
    public void testSetBiasCorrected() {
        Variance variance = new Variance(false, null);
        variance.setBiasCorrected(false);
        
        variance.setBiasCorrected(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields727892799363500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields727892799363500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass727892799375600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields727892799363500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass727892799375600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    static class FieldsPair {
        final Object o1;
        final Object o2;
    
        public FieldsPair(Object o1, Object o2) {
            this.o1 = o1;
            this.o2 = o2;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FieldsPair that = (FieldsPair) o;
            return java.util.Objects.equals(o1, that.o1) && java.util.Objects.equals(o2, that.o2);
        }
    
        @Override
        public int hashCode() {
            return java.util.Objects.hash(o1, o2);
        }
    }
    
    private static boolean deepEquals(Object o1, Object o2) {
        return deepEquals(o1, o2, new java.util.HashSet<>());
    }
    
    private static boolean deepEquals(Object o1, Object o2, java.util.Set<FieldsPair> visited) {
        visited.add(new FieldsPair(o1, o2));
    
        if (o1 == o2) {
            return true;
        }
    
        if (o1 == null || o2 == null) {
            return false;
        }
    
        if (o1 instanceof Iterable) {
            if (!(o2 instanceof Iterable)) {
                return false;
            }
    
            return iterablesDeepEquals((Iterable<?>) o1, (Iterable<?>) o2, visited);
        }
        
        if (o2 instanceof Iterable) {
            return false;
        }
        
        if (o1 instanceof java.util.stream.BaseStream) {
            if (!(o2 instanceof java.util.stream.BaseStream)) {
                return false;
            }
    
            return streamsDeepEquals((java.util.stream.BaseStream<?, ?>) o1, (java.util.stream.BaseStream<?, ?>) o2, visited);
        }
    
        if (o2 instanceof java.util.stream.BaseStream) {
            return false;
        }
    
        if (o1 instanceof java.util.Map) {
            if (!(o2 instanceof java.util.Map)) {
                return false;
            }
    
            return mapsDeepEquals((java.util.Map<?, ?>) o1, (java.util.Map<?, ?>) o2, visited);
        }
        
        if (o2 instanceof java.util.Map) {
            return false;
        }
    
        Class<?> firstClass = o1.getClass();
        if (firstClass.isArray()) {
            if (!o2.getClass().isArray()) {
                return false;
            }
    
            // Primitive arrays should not appear here
            return arraysDeepEquals(o1, o2, visited);
        }
    
        // common classes
    
        // check if class has custom equals method (including wrappers and strings)
        // It is very important to check it here but not earlier because iterables and maps also have custom equals 
        // based on elements equals 
        if (hasCustomEquals(firstClass)) {
            return o1.equals(o2);
        }
    
        // common classes without custom equals, use comparison by fields
        final java.util.List<java.lang.reflect.Field> fields = new java.util.ArrayList<>();
        while (firstClass != Object.class) {
            fields.addAll(java.util.Arrays.asList(firstClass.getDeclaredFields()));
            // Interface should not appear here
            firstClass = firstClass.getSuperclass();
        }
    
        for (java.lang.reflect.Field field : fields) {
            field.setAccessible(true);
            try {
                final Object field1 = field.get(o1);
                final Object field2 = field.get(o2);
                if (!visited.contains(new FieldsPair(field1, field2)) && !deepEquals(field1, field2, visited)) {
                    return false;
                }
            } catch (IllegalArgumentException e) {
                return false;
            } catch (IllegalAccessException e) {
                // should never occur because field was set accessible
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean arraysDeepEquals(Object arr1, Object arr2, java.util.Set<FieldsPair> visited) {
        final int length = java.lang.reflect.Array.getLength(arr1);
        if (length != java.lang.reflect.Array.getLength(arr2)) {
            return false;
        }
    
        for (int i = 0; i < length; i++) {
            if (!deepEquals(java.lang.reflect.Array.get(arr1, i), java.lang.reflect.Array.get(arr2, i), visited)) {
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean iterablesDeepEquals(Iterable<?> i1, Iterable<?> i2, java.util.Set<FieldsPair> visited) {
        final java.util.Iterator<?> firstIterator = i1.iterator();
        final java.util.Iterator<?> secondIterator = i2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean streamsDeepEquals(
        java.util.stream.BaseStream<?, ?> s1, 
        java.util.stream.BaseStream<?, ?> s2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<?> firstIterator = s1.iterator();
        final java.util.Iterator<?> secondIterator = s2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean mapsDeepEquals(
        java.util.Map<?, ?> m1, 
        java.util.Map<?, ?> m2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> firstIterator = m1.entrySet().iterator();
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> secondIterator = m2.entrySet().iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            final java.util.Map.Entry<?, ?> firstEntry = firstIterator.next();
            final java.util.Map.Entry<?, ?> secondEntry = secondIterator.next();
    
            if (!deepEquals(firstEntry.getKey(), secondEntry.getKey(), visited)) {
                return false;
            }
    
            if (!deepEquals(firstEntry.getValue(), secondEntry.getValue(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean hasCustomEquals(Class<?> clazz) {
        while (!Object.class.equals(clazz)) {
            try {
                clazz.getDeclaredMethod("equals", Object.class);
                return true;
            } catch (Exception e) { 
                // Interface should not appear here
                clazz = clazz.getSuperclass();
            }
        }
    
        return false;
    }
    ///endregion
}

