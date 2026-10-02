package org.apache.commons.math.stat.inference;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.math.distribution.ChiSquaredDistributionImpl;
import org.apache.commons.math.distribution.GammaDistributionImpl;
import org.apache.commons.math.MathException;
import org.apache.commons.math.distribution.ChiSquaredDistribution;
import org.apache.commons.math.distribution.GammaDistribution;
import org.apache.commons.math.distribution.DistributionFactoryImpl;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_math_stat_inference_ChiSquareTestImplTest {
    ///region Test suites for executable org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkArray([[J)
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#checkArray(long[][])}
 * @utbot.executesCondition {@code (in.length < 2): False}
 * @utbot.executesCondition {@code (in[0].length < 2): False}
 * @utbot.executesCondition {@code (!isRectangular(in)): False}
 * @utbot.executesCondition {@code (!isNonNegative(in)): False}
 * @utbot.invokes org.apache.commons.math.stat.inference.ChiSquareTestImpl#isRectangular(long[][])
 * @utbot.invokes org.apache.commons.math.stat.inference.ChiSquareTestImpl#isNonNegative(long[][])
 *  */
    @Test
    public void testCheckArray_IsNonNegative() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = new long[2][];
        long[] longArray1 = {0L, 0L};
        longArray[0] = longArray1;
        longArray[1] = longArray1;
        
        Class chiSquareTestImplClazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class longArrayType = Class.forName("[[J");
        Method checkArrayMethod = chiSquareTestImplClazz.getDeclaredMethod("checkArray", longArrayType);
        checkArrayMethod.setAccessible(true);
        java.lang.Object[] checkArrayMethodArguments = new java.lang.Object[1];
        checkArrayMethodArguments[0] = ((Object) longArray);
        checkArrayMethod.invoke(chiSquareTestImpl, checkArrayMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkArray([[J)
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#checkArray(long[][])}
 * @utbot.executesCondition {@code (in.length < 2): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: in[0].length < 2
 *  */
    @Test
    public void testCheckArray_ThrowNullPointerException_1() throws Throwable  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = {
            null,
            null
        };
        
        /* This test fails because method [org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkArray] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkArray(ChiSquareTestImpl.java:298) */
        Class chiSquareTestImplClazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class longArrayType = Class.forName("[[J");
        Method checkArrayMethod = chiSquareTestImplClazz.getDeclaredMethod("checkArray", longArrayType);
        checkArrayMethod.setAccessible(true);
        java.lang.Object[] checkArrayMethodArguments = new java.lang.Object[1];
        checkArrayMethodArguments[0] = ((Object) longArray);
        try {
            checkArrayMethod.invoke(chiSquareTestImpl, checkArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#checkArray(long[][])}
 * @utbot.executesCondition {@code (in.length < 2): False}
 * @utbot.executesCondition {@code (in[0].length < 2): False}
 * @utbot.invokes org.apache.commons.math.stat.inference.ChiSquareTestImpl#isRectangular(long[][])
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !isRectangular(in)
 *  */
    @Test
    public void testCheckArray_ThrowNullPointerException_2() throws Throwable  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = new long[2][];
        long[] longArray1 = {0L, 0L};
        longArray[0] = longArray1;
        longArray[1] = ((long[]) null);
        
        /* This test fails because method [org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkArray] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.isRectangular(ChiSquareTestImpl.java:334)
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkArray(ChiSquareTestImpl.java:302) */
        Class chiSquareTestImplClazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class longArrayType = Class.forName("[[J");
        Method checkArrayMethod = chiSquareTestImplClazz.getDeclaredMethod("checkArray", longArrayType);
        checkArrayMethod.setAccessible(true);
        java.lang.Object[] checkArrayMethodArguments = new java.lang.Object[1];
        checkArrayMethodArguments[0] = ((Object) longArray);
        try {
            checkArrayMethod.invoke(chiSquareTestImpl, checkArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#checkArray(long[][])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: in.length < 2
 *  */
    @Test
    public void testCheckArray_ThrowNullPointerException() throws Throwable  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        
        /* This test fails because method [org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkArray] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkArray(ChiSquareTestImpl.java:294) */
        Class chiSquareTestImplClazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class longArrayType = Class.forName("[[J");
        Method checkArrayMethod = chiSquareTestImplClazz.getDeclaredMethod("checkArray", longArrayType);
        checkArrayMethod.setAccessible(true);
        java.lang.Object[] checkArrayMethodArguments = new java.lang.Object[1];
        checkArrayMethodArguments[0] = ((Object) null);
        try {
            checkArrayMethod.invoke(chiSquareTestImpl, checkArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method checkArray([[J)
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#checkArray(long[][])}
 * @utbot.executesCondition {@code (in.length < 2): False}
 * @utbot.executesCondition {@code (in[0].length < 2): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: in[0].length < 2
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCheckArray_ThrowIllegalArgumentException() throws Throwable  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = new long[2][];
        long[] longArray1 = {0L};
        longArray[0] = longArray1;
        longArray[1] = ((long[]) null);
        
        Class chiSquareTestImplClazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class longArrayType = Class.forName("[[J");
        Method checkArrayMethod = chiSquareTestImplClazz.getDeclaredMethod("checkArray", longArrayType);
        checkArrayMethod.setAccessible(true);
        java.lang.Object[] checkArrayMethodArguments = new java.lang.Object[1];
        checkArrayMethodArguments[0] = ((Object) longArray);
        try {
            checkArrayMethod.invoke(chiSquareTestImpl, checkArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#checkArray(long[][])}
 * @utbot.executesCondition {@code (in.length < 2): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: in.length < 2
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCheckArray_ThrowIllegalArgumentException_1() throws Throwable  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = {null};
        
        Class chiSquareTestImplClazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class longArrayType = Class.forName("[[J");
        Method checkArrayMethod = chiSquareTestImplClazz.getDeclaredMethod("checkArray", longArrayType);
        checkArrayMethod.setAccessible(true);
        java.lang.Object[] checkArrayMethodArguments = new java.lang.Object[1];
        checkArrayMethodArguments[0] = ((Object) longArray);
        try {
            checkArrayMethod.invoke(chiSquareTestImpl, checkArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#checkArray(long[][])}
 * @utbot.executesCondition {@code (in.length < 2): False}
 * @utbot.executesCondition {@code (in[0].length < 2): False}
 * @utbot.executesCondition {@code (!isRectangular(in)): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: !isRectangular(in)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCheckArray_ThrowIllegalArgumentException_2() throws Throwable  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = new long[2][];
        long[] longArray1 = {0L, 0L};
        longArray[0] = longArray1;
        long[] longArray2 = {0L};
        longArray[1] = longArray2;
        
        Class chiSquareTestImplClazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class longArrayType = Class.forName("[[J");
        Method checkArrayMethod = chiSquareTestImplClazz.getDeclaredMethod("checkArray", longArrayType);
        checkArrayMethod.setAccessible(true);
        java.lang.Object[] checkArrayMethodArguments = new java.lang.Object[1];
        checkArrayMethodArguments[0] = ((Object) longArray);
        try {
            checkArrayMethod.invoke(chiSquareTestImpl, checkArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#checkArray(long[][])}
 * @utbot.executesCondition {@code (in.length < 2): False}
 * @utbot.executesCondition {@code (in[0].length < 2): False}
 * @utbot.executesCondition {@code (!isRectangular(in)): False}
 * @utbot.executesCondition {@code (!isNonNegative(in)): True}
 * @utbot.invokes org.apache.commons.math.stat.inference.ChiSquareTestImpl#isNonNegative(long[][])
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: !isNonNegative(in)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCheckArray_ThrowIllegalArgumentException_3() throws Throwable  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = new long[2][];
        long[] longArray1 = {0L, 0L};
        longArray[0] = longArray1;
        long[] longArray2 = {-9223372036854775807L, 0L};
        longArray[1] = longArray2;
        
        Class chiSquareTestImplClazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class longArrayType = Class.forName("[[J");
        Method checkArrayMethod = chiSquareTestImplClazz.getDeclaredMethod("checkArray", longArrayType);
        checkArrayMethod.setAccessible(true);
        java.lang.Object[] checkArrayMethodArguments = new java.lang.Object[1];
        checkArrayMethodArguments[0] = ((Object) longArray);
        try {
            checkArrayMethod.invoke(chiSquareTestImpl, checkArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.inference.ChiSquareTestImpl.isPositive
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isPositive([D)
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#isPositive(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < in.length; i++)} once
 *  */
    @Test
    public void testIsPositive_IOfInLessOrEqualZero() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        double[] doubleArray = {-0.0};
        
        Class chiSquareTestImplClazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class doubleArrayType = Class.forName("[D");
        Method isPositiveMethod = chiSquareTestImplClazz.getDeclaredMethod("isPositive", doubleArrayType);
        isPositiveMethod.setAccessible(true);
        java.lang.Object[] isPositiveMethodArguments = new java.lang.Object[1];
        isPositiveMethodArguments[0] = ((Object) doubleArray);
        boolean actual = ((Boolean) isPositiveMethod.invoke(chiSquareTestImpl, isPositiveMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#isPositive(double[])}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsPositive_ReturnTrue() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        double[] doubleArray = {};
        
        Class chiSquareTestImplClazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class doubleArrayType = Class.forName("[D");
        Method isPositiveMethod = chiSquareTestImplClazz.getDeclaredMethod("isPositive", doubleArrayType);
        isPositiveMethod.setAccessible(true);
        java.lang.Object[] isPositiveMethodArguments = new java.lang.Object[1];
        isPositiveMethodArguments[0] = ((Object) doubleArray);
        boolean actual = ((Boolean) isPositiveMethod.invoke(chiSquareTestImpl, isPositiveMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#isPositive(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < in.length; i++)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsPositive_IOfInGreaterThanZero() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        double[] doubleArray = {3.337610787760802E-308};
        
        Class chiSquareTestImplClazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class doubleArrayType = Class.forName("[D");
        Method isPositiveMethod = chiSquareTestImplClazz.getDeclaredMethod("isPositive", doubleArrayType);
        isPositiveMethod.setAccessible(true);
        java.lang.Object[] isPositiveMethodArguments = new java.lang.Object[1];
        isPositiveMethodArguments[0] = ((Object) doubleArray);
        boolean actual = ((Boolean) isPositiveMethod.invoke(chiSquareTestImpl, isPositiveMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isPositive([D)
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#isPositive(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < in.length; i++)
 *  */
    @Test
    public void testIsPositive_ThrowNullPointerException() throws Throwable  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        
        /* This test fails because method [org.apache.commons.math.stat.inference.ChiSquareTestImpl.isPositive] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.isPositive(ChiSquareTestImpl.java:350) */
        Class chiSquareTestImplClazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class doubleArrayType = Class.forName("[D");
        Method isPositiveMethod = chiSquareTestImplClazz.getDeclaredMethod("isPositive", doubleArrayType);
        isPositiveMethod.setAccessible(true);
        java.lang.Object[] isPositiveMethodArguments = new java.lang.Object[1];
        isPositiveMethodArguments[0] = ((Object) null);
        try {
            isPositiveMethod.invoke(chiSquareTestImpl, isPositiveMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isPositive([D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#isPositive(double[])}
     */
    @Test
    public void testIsPositiveReturnsFalseWithNonEmptyPrimitiveArray() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        ChiSquareTestImpl chiSquareTestImpl = new ChiSquareTestImpl();
        double[] doubleArray = {1.0, java.lang.Double.NEGATIVE_INFINITY};
        
        Class chiSquareTestImplClazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class doubleArrayType = Class.forName("[D");
        Method isPositiveMethod = chiSquareTestImplClazz.getDeclaredMethod("isPositive", doubleArrayType);
        isPositiveMethod.setAccessible(true);
        java.lang.Object[] isPositiveMethodArguments = new java.lang.Object[1];
        isPositiveMethodArguments[0] = ((Object) doubleArray);
        boolean actual = ((Boolean) isPositiveMethod.invoke(chiSquareTestImpl, isPositiveMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareDataSetsComparison
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method chiSquareDataSetsComparison([J, [J)
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareDataSetsComparison(long[],long[])}
 * @utbot.executesCondition {@code (observed1.length < 2): False}
 * @utbot.executesCondition {@code (observed1.length != observed2.length): False}
 * @utbot.executesCondition {@code (!isNonNegative(observed1)): True}
 * @utbot.executesCondition {@code (!isNonNegative(observed2)): False}
 * @utbot.executesCondition {@code (countSum1 * countSum2 == 0): False}
 * @utbot.executesCondition {@code (unequalCounts = (countSum1 != countSum2);): False}
 * @utbot.executesCondition {@code (unequalCounts): False}
 * @utbot.invokes org.apache.commons.math.stat.inference.ChiSquareTestImpl#isNonNegative(long[])
 * @utbot.invokes org.apache.commons.math.stat.inference.ChiSquareTestImpl#isNonNegative(long[])
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < observed1.length; i++)} twice
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < observed1.length; i++)} twice
 * @utbot.returnsFrom {@code return sumSq;}
 *  */
    @Test
    public void testChiSquareDataSetsComparison_NotUnequalCounts() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[] longArray = {1L, 0L};
        long[] longArray1 = {0L, 1L};
        
        double actual = chiSquareTestImpl.chiSquareDataSetsComparison(longArray, longArray1);
        
        assertEquals(2.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method chiSquareDataSetsComparison([J, [J)
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareDataSetsComparison(long[],long[])}
 * @utbot.executesCondition {@code (observed1.length < 2): False}
 * @utbot.executesCondition {@code (observed1.length != observed2.length): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: (observed1.length < 2) || (observed1.length != observed2.length)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareDataSetsComparison_ThrowIllegalArgumentException() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[] longArray = {-255L, -255L};
        long[] longArray1 = {-255L};
        
        chiSquareTestImpl.chiSquareDataSetsComparison(longArray, longArray1);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareDataSetsComparison(long[],long[])}
 * @utbot.executesCondition {@code (observed1.length < 2): False}
 * @utbot.executesCondition {@code (observed1.length != observed2.length): False}
 * @utbot.executesCondition {@code (!isNonNegative(observed1)): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: !isNonNegative(observed1) || !isNonNegative(observed2)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareDataSetsComparison_ThrowIllegalArgumentException_2() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[] longArray = {-255L, -255L};
        long[] longArray1 = {-255L, -255L};
        
        chiSquareTestImpl.chiSquareDataSetsComparison(longArray, longArray1);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareDataSetsComparison(long[],long[])}
 * @utbot.executesCondition {@code (observed1.length < 2): False}
 * @utbot.executesCondition {@code (observed1.length != observed2.length): False}
 * @utbot.executesCondition {@code (!isNonNegative(observed1)): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: !isNonNegative(observed1) || !isNonNegative(observed2)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareDataSetsComparison_ThrowIllegalArgumentException_3() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[] longArray = {0L, -255L};
        long[] longArray1 = {-255L, -255L};
        
        chiSquareTestImpl.chiSquareDataSetsComparison(longArray, longArray1);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareDataSetsComparison(long[],long[])}
 * @utbot.executesCondition {@code (observed1.length < 2): False}
 * @utbot.executesCondition {@code (observed1.length != observed2.length): False}
 * @utbot.executesCondition {@code (!isNonNegative(observed1)): True}
 * @utbot.executesCondition {@code (!isNonNegative(observed2)): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: !isNonNegative(observed1) || !isNonNegative(observed2)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareDataSetsComparison_ThrowIllegalArgumentException_4() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[] longArray = {0L, 0L};
        long[] longArray1 = {-255L, -255L};
        
        chiSquareTestImpl.chiSquareDataSetsComparison(longArray, longArray1);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareDataSetsComparison(long[],long[])}
 * @utbot.executesCondition {@code (observed1.length < 2): False}
 * @utbot.executesCondition {@code (observed1.length != observed2.length): False}
 * @utbot.executesCondition {@code (!isNonNegative(observed1)): True}
 * @utbot.executesCondition {@code (!isNonNegative(observed2)): False}
 * @utbot.executesCondition {@code (countSum1 * countSum2 == 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < observed1.length; i++)} twice
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: countSum1 * countSum2 == 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareDataSetsComparison_ThrowIllegalArgumentException_5() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[] longArray = {0L, 0L};
        
        chiSquareTestImpl.chiSquareDataSetsComparison(longArray, longArray);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareDataSetsComparison(long[],long[])}
 * @utbot.executesCondition {@code (observed1.length < 2): False}
 * @utbot.executesCondition {@code (observed1.length != observed2.length): False}
 * @utbot.executesCondition {@code (!isNonNegative(observed1)): True}
 * @utbot.executesCondition {@code (!isNonNegative(observed2)): False}
 * @utbot.executesCondition {@code (countSum1 * countSum2 == 0): False}
 * @utbot.executesCondition {@code (unequalCounts = (countSum1 != countSum2);): False}
 * @utbot.executesCondition {@code (unequalCounts): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < observed1.length; i++)} twice
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < observed1.length; i++)} twice
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: observed1[i] == 0 && observed2[i] == 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareDataSetsComparison_ThrowIllegalArgumentException_6() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[] longArray = {1L, 0L};
        long[] longArray1 = {1L, 0L};
        
        chiSquareTestImpl.chiSquareDataSetsComparison(longArray, longArray1);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareDataSetsComparison(long[],long[])}
 * @utbot.executesCondition {@code (observed1.length < 2): False}
 * @utbot.executesCondition {@code (observed1.length != observed2.length): False}
 * @utbot.executesCondition {@code (!isNonNegative(observed1)): True}
 * @utbot.executesCondition {@code (!isNonNegative(observed2)): False}
 * @utbot.executesCondition {@code (countSum1 * countSum2 == 0): False}
 * @utbot.executesCondition {@code (unequalCounts = (countSum1 != countSum2);): True}
 * @utbot.executesCondition {@code (unequalCounts): True}
 * @utbot.invokes {@link java.lang.Math#sqrt(double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < observed1.length; i++)} twice
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < observed1.length; i++)} twice
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: observed1[i] == 0 && observed2[i] == 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareDataSetsComparison_ThrowIllegalArgumentException_7() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[] longArray = {35L, 0L};
        long[] longArray1 = {4L, 0L};
        
        chiSquareTestImpl.chiSquareDataSetsComparison(longArray, longArray1);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareDataSetsComparison(long[],long[])}
 * @utbot.executesCondition {@code (observed1.length < 2): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: (observed1.length < 2) || (observed1.length != observed2.length)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareDataSetsComparison_ThrowIllegalArgumentException_1() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[] longArray = {-255L};
        
        chiSquareTestImpl.chiSquareDataSetsComparison(longArray, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method chiSquareDataSetsComparison([J, [J)
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareDataSetsComparison(long[],long[])}
 * @utbot.executesCondition {@code (observed1.length < 2): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: (observed1.length < 2) || (observed1.length != observed2.length)
 *  */
    @Test
    public void testChiSquareDataSetsComparison_ThrowNullPointerException_1() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[] longArray = {-255L, -255L};
        
        /* This test fails because method [org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareDataSetsComparison] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareDataSetsComparison(ChiSquareTestImpl.java:201) */
        chiSquareTestImpl.chiSquareDataSetsComparison(longArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareDataSetsComparison(long[],long[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: (observed1.length < 2) || (observed1.length != observed2.length)
 *  */
    @Test
    public void testChiSquareDataSetsComparison_ThrowNullPointerException() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        
        /* This test fails because method [org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareDataSetsComparison] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareDataSetsComparison(ChiSquareTestImpl.java:201) */
        chiSquareTestImpl.chiSquareDataSetsComparison(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTestDataSetsComparison
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method chiSquareTestDataSetsComparison([J, [J, double)
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareTestDataSetsComparison(long[],long[],double)}
 * @utbot.executesCondition {@code (alpha <= 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: (alpha <= 0) || (alpha > 0.5)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTestDataSetsComparison_ThrowIllegalArgumentException() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        
        chiSquareTestImpl.chiSquareTestDataSetsComparison(null, null, -0.0);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareTestDataSetsComparison(long[],long[],double)}
 * @utbot.executesCondition {@code (alpha <= 0): False}
 * @utbot.executesCondition {@code (alpha > 0.5): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: (alpha <= 0) || (alpha > 0.5)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTestDataSetsComparison_ThrowIllegalArgumentException_1() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        
        chiSquareTestImpl.chiSquareTestDataSetsComparison(null, null, 4.000000000000001);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareTestDataSetsComparison(long[],long[],double)}
 * @utbot.executesCondition {@code (alpha <= 0): False}
 * @utbot.executesCondition {@code (alpha > 0.5): False}
 * @utbot.invokes {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareTestDataSetsComparison(long[],long[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return (chiSquareTestDataSetsComparison(observed1, observed2) < alpha);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTestDataSetsComparison_ThrowIllegalArgumentException_2() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        ChiSquaredDistributionImpl distribution = ((ChiSquaredDistributionImpl) createInstance("org.apache.commons.math.distribution.ChiSquaredDistributionImpl"));
        GammaDistributionImpl gamma = ((GammaDistributionImpl) createInstance("org.apache.commons.math.distribution.GammaDistributionImpl"));
        distribution.setGamma(gamma);
        chiSquareTestImpl.setDistribution(distribution);
        long[] longArray = {-255L};
        
        chiSquareTestImpl.chiSquareTestDataSetsComparison(longArray, null, 0.5);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method chiSquareTestDataSetsComparison([J, [J, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareTestDataSetsComparison(long[],long[],double)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTestDataSetsComparisonThrowsIAEWithNonEmptyPrimitiveArrays() throws MathException  {
        ChiSquareTestImpl chiSquareTestImpl = new ChiSquareTestImpl();
        long[] longArray = {0L, 0L, java.lang.Long.MIN_VALUE, -1L, -1L};
        long[] longArray1 = {java.lang.Long.MIN_VALUE, java.lang.Long.MIN_VALUE};
        
        chiSquareTestImpl.chiSquareTestDataSetsComparison(longArray, longArray1, 1.1125369375426468E-308);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTestDataSetsComparison
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method chiSquareTestDataSetsComparison([J, [J)
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareTestDataSetsComparison(long[],long[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: chiSquareDataSetsComparison(observed1, observed2)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTestDataSetsComparison_ThrowIllegalArgumentException1() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        ChiSquaredDistributionImpl distribution = ((ChiSquaredDistributionImpl) createInstance("org.apache.commons.math.distribution.ChiSquaredDistributionImpl"));
        GammaDistributionImpl gamma = ((GammaDistributionImpl) createInstance("org.apache.commons.math.distribution.GammaDistributionImpl"));
        gamma.setAlpha(0.0);
        distribution.setGamma(gamma);
        chiSquareTestImpl.setDistribution(distribution);
        long[] longArray = {0L, 0L};
        long[] longArray1 = {-255L, -255L};
        
        chiSquareTestImpl.chiSquareTestDataSetsComparison(longArray, longArray1);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareTestDataSetsComparison(long[],long[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: chiSquareDataSetsComparison(observed1, observed2)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTestDataSetsComparison_ThrowIllegalArgumentException_11() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        ChiSquaredDistributionImpl distribution = ((ChiSquaredDistributionImpl) createInstance("org.apache.commons.math.distribution.ChiSquaredDistributionImpl"));
        GammaDistributionImpl gamma = ((GammaDistributionImpl) createInstance("org.apache.commons.math.distribution.GammaDistributionImpl"));
        gamma.setAlpha(0.0);
        distribution.setGamma(gamma);
        chiSquareTestImpl.setDistribution(distribution);
        long[] longArray = {107L, 0L};
        long[] longArray1 = {107L, 0L};
        
        chiSquareTestImpl.chiSquareTestDataSetsComparison(longArray, longArray1);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareTestDataSetsComparison(long[],long[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: chiSquareDataSetsComparison(observed1, observed2)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTestDataSetsComparison_ThrowIllegalArgumentException_21() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        ChiSquaredDistributionImpl distribution = ((ChiSquaredDistributionImpl) createInstance("org.apache.commons.math.distribution.ChiSquaredDistributionImpl"));
        GammaDistributionImpl gamma = ((GammaDistributionImpl) createInstance("org.apache.commons.math.distribution.GammaDistributionImpl"));
        gamma.setAlpha(0.0);
        distribution.setGamma(gamma);
        chiSquareTestImpl.setDistribution(distribution);
        long[] longArray = {1L, 0L};
        long[] longArray1 = {128L, 0L};
        
        chiSquareTestImpl.chiSquareTestDataSetsComparison(longArray, longArray1);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareTestDataSetsComparison(long[],long[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: chiSquareDataSetsComparison(observed1, observed2)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTestDataSetsComparison_ThrowIllegalArgumentException_3() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        ChiSquaredDistributionImpl distribution = ((ChiSquaredDistributionImpl) createInstance("org.apache.commons.math.distribution.ChiSquaredDistributionImpl"));
        GammaDistributionImpl gamma = ((GammaDistributionImpl) createInstance("org.apache.commons.math.distribution.GammaDistributionImpl"));
        gamma.setAlpha(0.0);
        distribution.setGamma(gamma);
        chiSquareTestImpl.setDistribution(distribution);
        long[] longArray = {0L, 0L, 0L, 0L, 0L};
        long[] longArray1 = {0L, 0L, 0L, 0L, 0L};
        
        chiSquareTestImpl.chiSquareTestDataSetsComparison(longArray, longArray1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method chiSquareTestDataSetsComparison([J, [J)
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareTestDataSetsComparison(long[],long[])}
 * @utbot.invokes {@link org.apache.commons.math.distribution.ChiSquaredDistribution#setDegreesOfFreedom(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: distribution.setDegreesOfFreedom((double) observed1.length - 1);
 *  */
    @Test
    public void testChiSquareTestDataSetsComparison_ThrowNullPointerException_1() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[] longArray = {-255L};
        
        /* This test fails because method [org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTestDataSetsComparison] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTestDataSetsComparison(ChiSquareTestImpl.java:261) */
        chiSquareTestImpl.chiSquareTestDataSetsComparison(longArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareTestDataSetsComparison(long[],long[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: distribution.setDegreesOfFreedom((double) observed1.length - 1);
 *  */
    @Test
    public void testChiSquareTestDataSetsComparison_ThrowNullPointerException() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        
        /* This test fails because method [org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTestDataSetsComparison] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTestDataSetsComparison(ChiSquareTestImpl.java:261) */
        chiSquareTestImpl.chiSquareTestDataSetsComparison(null, null);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method chiSquareTestDataSetsComparison([J, [J)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareTestDataSetsComparison(long[],long[])}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTestDataSetsComparisonThrowsIAEWithNonEmptyPrimitiveArrays1() throws MathException  {
        ChiSquareTestImpl chiSquareTestImpl = new ChiSquareTestImpl();
        long[] longArray = {java.lang.Long.MIN_VALUE, java.lang.Long.MIN_VALUE};
        long[] longArray1 = {1L, 1L, 1L};
        
        chiSquareTestImpl.chiSquareTestDataSetsComparison(longArray, longArray1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method chiSquareTestDataSetsComparison([J, [J)
    
    @Test
    public void testChiSquareTestDataSetsComparison1() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        ChiSquaredDistributionImpl distribution = ((ChiSquaredDistributionImpl) createInstance("org.apache.commons.math.distribution.ChiSquaredDistributionImpl"));
        GammaDistributionImpl gamma = ((GammaDistributionImpl) createInstance("org.apache.commons.math.distribution.GammaDistributionImpl"));
        gamma.setAlpha(0.0);
        distribution.setGamma(gamma);
        chiSquareTestImpl.setDistribution(distribution);
        long[] longArray = {5227738140933886186L, 303221474330714287L, 7530074382551500384L, 483278194726L, 288802465810219041L};
        long[] longArray1 = {8259602820407230476L, 8764005688836882436L, 4395764028057609632L, 3458764513820542528L, 6918443969491801168L};
        
        double actual = chiSquareTestImpl.chiSquareTestDataSetsComparison(longArray, longArray1);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
        
        ChiSquaredDistribution chiSquareTestImplDistribution = ((ChiSquaredDistribution) getFieldValue(chiSquareTestImpl, "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "distribution"));
        GammaDistribution chiSquareTestImplDistributionDistributionGamma = ((GammaDistribution) getFieldValue(chiSquareTestImplDistribution, "org.apache.commons.math.distribution.ChiSquaredDistributionImpl", "gamma"));
        double finalChiSquareTestImplDistributionGammaAlpha = ((Double) getFieldValue(chiSquareTestImplDistributionDistributionGamma, "org.apache.commons.math.distribution.GammaDistributionImpl", "alpha"));
        
        assertEquals(2.0, finalChiSquareTestImplDistributionGammaAlpha, 1.0E-6);
    }
    
    @Test
    public void testChiSquareTestDataSetsComparison2() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        ChiSquaredDistributionImpl distribution = ((ChiSquaredDistributionImpl) createInstance("org.apache.commons.math.distribution.ChiSquaredDistributionImpl"));
        GammaDistributionImpl gamma = ((GammaDistributionImpl) createInstance("org.apache.commons.math.distribution.GammaDistributionImpl"));
        gamma.setAlpha(0.0);
        distribution.setGamma(gamma);
        chiSquareTestImpl.setDistribution(distribution);
        long[] longArray = {1736213341883965829L, 3461441757257925670L, 2305843833958959695L, 8656553974969159712L, 2305843009213693952L};
        long[] longArray1 = {7005030684349628544L, 202344860320343040L, 2017894687960536048L, 281750266807826L, 5392233729678083585L};
        
        double actual = chiSquareTestImpl.chiSquareTestDataSetsComparison(longArray, longArray1);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
        
        ChiSquaredDistribution chiSquareTestImplDistribution = ((ChiSquaredDistribution) getFieldValue(chiSquareTestImpl, "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "distribution"));
        GammaDistribution chiSquareTestImplDistributionDistributionGamma = ((GammaDistribution) getFieldValue(chiSquareTestImplDistribution, "org.apache.commons.math.distribution.ChiSquaredDistributionImpl", "gamma"));
        double finalChiSquareTestImplDistributionGammaAlpha = ((Double) getFieldValue(chiSquareTestImplDistributionDistributionGamma, "org.apache.commons.math.distribution.GammaDistributionImpl", "alpha"));
        
        assertEquals(2.0, finalChiSquareTestImplDistributionGammaAlpha, 1.0E-6);
    }
    
    @Test
    public void testChiSquareTestDataSetsComparison3() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        ChiSquaredDistributionImpl distribution = ((ChiSquaredDistributionImpl) createInstance("org.apache.commons.math.distribution.ChiSquaredDistributionImpl"));
        GammaDistributionImpl gamma = ((GammaDistributionImpl) createInstance("org.apache.commons.math.distribution.GammaDistributionImpl"));
        gamma.setAlpha(0.0);
        distribution.setGamma(gamma);
        chiSquareTestImpl.setDistribution(distribution);
        long[] longArray = {0L, 0L, 592256951378812959L, 3243295969458572353L, 1802434123866886673L, 8989868309279695376L};
        long[] longArray1 = {4613207201296261425L, 4327554928767635135L, 2884913486736394321L, 2306781992763529668L, 5744106509303824L, 579698823090298960L};
        
        double actual = chiSquareTestImpl.chiSquareTestDataSetsComparison(longArray, longArray1);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
        
        ChiSquaredDistribution chiSquareTestImplDistribution = ((ChiSquaredDistribution) getFieldValue(chiSquareTestImpl, "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "distribution"));
        GammaDistribution chiSquareTestImplDistributionDistributionGamma = ((GammaDistribution) getFieldValue(chiSquareTestImplDistribution, "org.apache.commons.math.distribution.ChiSquaredDistributionImpl", "gamma"));
        double finalChiSquareTestImplDistributionGammaAlpha = ((Double) getFieldValue(chiSquareTestImplDistributionDistributionGamma, "org.apache.commons.math.distribution.GammaDistributionImpl", "alpha"));
        
        assertEquals(2.5, finalChiSquareTestImplDistributionGammaAlpha, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.inference.ChiSquareTestImpl.getDistributionFactory
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDistributionFactory()
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#getDistributionFactory()}
 * @utbot.invokes {@link org.apache.commons.math.distribution.DistributionFactory#newInstance()}
 * @utbot.returnsFrom {@code return DistributionFactory.newInstance();}
 *  */
    @Test
    public void testGetDistributionFactory_DistributionFactoryNewInstance() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        
        DistributionFactoryImpl actual = ((DistributionFactoryImpl) chiSquareTestImpl.getDistributionFactory());
        
        DistributionFactoryImpl expected = new DistributionFactoryImpl();
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.inference.ChiSquareTestImpl.setDistribution
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDistribution(org.apache.commons.math.distribution.ChiSquaredDistribution)
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#setDistribution(org.apache.commons.math.distribution.ChiSquaredDistribution)}
 *  */
    @Test
    public void testSetDistribution() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        ChiSquaredDistributionImpl distribution = ((ChiSquaredDistributionImpl) createInstance("org.apache.commons.math.distribution.ChiSquaredDistributionImpl"));
        chiSquareTestImpl.setDistribution(distribution);
        
        chiSquareTestImpl.setDistribution(null);
        
        ChiSquaredDistribution finalChiSquareTestImplDistribution = ((ChiSquaredDistribution) getFieldValue(chiSquareTestImpl, "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "distribution"));
        
        assertNull(finalChiSquareTestImplDistribution);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.inference.ChiSquareTestImpl.isNonNegative
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isNonNegative([J)
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#isNonNegative(long[])}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsNonNegative_ReturnTrue() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[] longArray = {};
        
        Class chiSquareTestImplClazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class longArrayType = Class.forName("[J");
        Method isNonNegativeMethod = chiSquareTestImplClazz.getDeclaredMethod("isNonNegative", longArrayType);
        isNonNegativeMethod.setAccessible(true);
        java.lang.Object[] isNonNegativeMethodArguments = new java.lang.Object[1];
        isNonNegativeMethodArguments[0] = ((Object) longArray);
        boolean actual = ((Boolean) isNonNegativeMethod.invoke(chiSquareTestImpl, isNonNegativeMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#isNonNegative(long[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < in.length; i++)} once
 *  */
    @Test
    public void testIsNonNegative_IOfInLessThanZero() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[] longArray = {-255L};
        
        Class chiSquareTestImplClazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class longArrayType = Class.forName("[J");
        Method isNonNegativeMethod = chiSquareTestImplClazz.getDeclaredMethod("isNonNegative", longArrayType);
        isNonNegativeMethod.setAccessible(true);
        java.lang.Object[] isNonNegativeMethodArguments = new java.lang.Object[1];
        isNonNegativeMethodArguments[0] = ((Object) longArray);
        boolean actual = ((Boolean) isNonNegativeMethod.invoke(chiSquareTestImpl, isNonNegativeMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#isNonNegative(long[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < in.length; i++)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsNonNegative_IOfInGreaterOrEqualZero() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[] longArray = {0L};
        
        Class chiSquareTestImplClazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class longArrayType = Class.forName("[J");
        Method isNonNegativeMethod = chiSquareTestImplClazz.getDeclaredMethod("isNonNegative", longArrayType);
        isNonNegativeMethod.setAccessible(true);
        java.lang.Object[] isNonNegativeMethodArguments = new java.lang.Object[1];
        isNonNegativeMethodArguments[0] = ((Object) longArray);
        boolean actual = ((Boolean) isNonNegativeMethod.invoke(chiSquareTestImpl, isNonNegativeMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isNonNegative([J)
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#isNonNegative(long[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < in.length; i++)
 *  */
    @Test
    public void testIsNonNegative_ThrowNullPointerException() throws Throwable  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        
        /* This test fails because method [org.apache.commons.math.stat.inference.ChiSquareTestImpl.isNonNegative] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.isNonNegative(ChiSquareTestImpl.java:367) */
        Class chiSquareTestImplClazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class longArrayType = Class.forName("[J");
        Method isNonNegativeMethod = chiSquareTestImplClazz.getDeclaredMethod("isNonNegative", longArrayType);
        isNonNegativeMethod.setAccessible(true);
        java.lang.Object[] isNonNegativeMethodArguments = new java.lang.Object[1];
        isNonNegativeMethodArguments[0] = ((Object) null);
        try {
            isNonNegativeMethod.invoke(chiSquareTestImpl, isNonNegativeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isNonNegative([J)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#isNonNegative(long[])}
     */
    @Test
    public void testIsNonNegativeReturnsTrueWithNonEmptyPrimitiveArray() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        ChiSquareTestImpl chiSquareTestImpl = new ChiSquareTestImpl();
        long[] longArray = {255L, 0L};
        
        Class chiSquareTestImplClazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class longArrayType = Class.forName("[J");
        Method isNonNegativeMethod = chiSquareTestImplClazz.getDeclaredMethod("isNonNegative", longArrayType);
        isNonNegativeMethod.setAccessible(true);
        java.lang.Object[] isNonNegativeMethodArguments = new java.lang.Object[1];
        isNonNegativeMethodArguments[0] = ((Object) longArray);
        boolean actual = ((Boolean) isNonNegativeMethod.invoke(chiSquareTestImpl, isNonNegativeMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.inference.ChiSquareTestImpl.isNonNegative
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isNonNegative([[J)
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#isNonNegative(long[][])}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsNonNegative_ReturnTrue1() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = {};
        
        Class chiSquareTestImplClazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class longArrayType = Class.forName("[[J");
        Method isNonNegativeMethod = chiSquareTestImplClazz.getDeclaredMethod("isNonNegative", longArrayType);
        isNonNegativeMethod.setAccessible(true);
        java.lang.Object[] isNonNegativeMethodArguments = new java.lang.Object[1];
        isNonNegativeMethodArguments[0] = ((Object) longArray);
        boolean actual = ((Boolean) isNonNegativeMethod.invoke(chiSquareTestImpl, isNonNegativeMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#isNonNegative(long[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < in.length; i++)} once
 *  */
    @Test
    public void testIsNonNegative_JOfIniLessThanZero() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = new long[1][];
        long[] longArray1 = {-9223372036854775807L};
        longArray[0] = longArray1;
        
        Class chiSquareTestImplClazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class longArrayType = Class.forName("[[J");
        Method isNonNegativeMethod = chiSquareTestImplClazz.getDeclaredMethod("isNonNegative", longArrayType);
        isNonNegativeMethod.setAccessible(true);
        java.lang.Object[] isNonNegativeMethodArguments = new java.lang.Object[1];
        isNonNegativeMethodArguments[0] = ((Object) longArray);
        boolean actual = ((Boolean) isNonNegativeMethod.invoke(chiSquareTestImpl, isNonNegativeMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#isNonNegative(long[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < in.length; i++)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsNonNegative_ReturnTrue_1() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = new long[1][];
        long[] longArray1 = {};
        longArray[0] = longArray1;
        
        Class chiSquareTestImplClazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class longArrayType = Class.forName("[[J");
        Method isNonNegativeMethod = chiSquareTestImplClazz.getDeclaredMethod("isNonNegative", longArrayType);
        isNonNegativeMethod.setAccessible(true);
        java.lang.Object[] isNonNegativeMethodArguments = new java.lang.Object[1];
        isNonNegativeMethodArguments[0] = ((Object) longArray);
        boolean actual = ((Boolean) isNonNegativeMethod.invoke(chiSquareTestImpl, isNonNegativeMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#isNonNegative(long[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < in.length; i++)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsNonNegative_JOfIniGreaterOrEqualZero() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = new long[1][];
        long[] longArray1 = {0L};
        longArray[0] = longArray1;
        
        Class chiSquareTestImplClazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class longArrayType = Class.forName("[[J");
        Method isNonNegativeMethod = chiSquareTestImplClazz.getDeclaredMethod("isNonNegative", longArrayType);
        isNonNegativeMethod.setAccessible(true);
        java.lang.Object[] isNonNegativeMethodArguments = new java.lang.Object[1];
        isNonNegativeMethodArguments[0] = ((Object) longArray);
        boolean actual = ((Boolean) isNonNegativeMethod.invoke(chiSquareTestImpl, isNonNegativeMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isNonNegative([[J)
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#isNonNegative(long[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < in.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int j = 0; j < in[i].length; j++)
 *  */
    @Test
    public void testIsNonNegative_ThrowNullPointerException_1() throws Throwable  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = {null};
        
        /* This test fails because method [org.apache.commons.math.stat.inference.ChiSquareTestImpl.isNonNegative] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.isNonNegative(ChiSquareTestImpl.java:385) */
        Class chiSquareTestImplClazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class longArrayType = Class.forName("[[J");
        Method isNonNegativeMethod = chiSquareTestImplClazz.getDeclaredMethod("isNonNegative", longArrayType);
        isNonNegativeMethod.setAccessible(true);
        java.lang.Object[] isNonNegativeMethodArguments = new java.lang.Object[1];
        isNonNegativeMethodArguments[0] = ((Object) longArray);
        try {
            isNonNegativeMethod.invoke(chiSquareTestImpl, isNonNegativeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#isNonNegative(long[][])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < in.length; i++)
 *  */
    @Test
    public void testIsNonNegative_ThrowNullPointerException1() throws Throwable  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        
        /* This test fails because method [org.apache.commons.math.stat.inference.ChiSquareTestImpl.isNonNegative] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.isNonNegative(ChiSquareTestImpl.java:384) */
        Class chiSquareTestImplClazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class longArrayType = Class.forName("[[J");
        Method isNonNegativeMethod = chiSquareTestImplClazz.getDeclaredMethod("isNonNegative", longArrayType);
        isNonNegativeMethod.setAccessible(true);
        java.lang.Object[] isNonNegativeMethodArguments = new java.lang.Object[1];
        isNonNegativeMethodArguments[0] = ((Object) null);
        try {
            isNonNegativeMethod.invoke(chiSquareTestImpl, isNonNegativeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isNonNegative([[J)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#isNonNegative(long[][])}
     */
    @Test
    public void testIsNonNegativeReturnsFalseWithNonEmptyObjectArray() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        ChiSquareTestImpl chiSquareTestImpl = new ChiSquareTestImpl();
        long[][] longArray = new long[3][];
        long[] longArray1 = {0L, java.lang.Long.MIN_VALUE, 255L};
        longArray[0] = longArray1;
        long[] longArray2 = {0L, java.lang.Long.MIN_VALUE, 255L};
        longArray[1] = longArray2;
        long[] longArray3 = {0L, java.lang.Long.MIN_VALUE, 255L};
        longArray[2] = longArray3;
        
        Class chiSquareTestImplClazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class longArrayType = Class.forName("[[J");
        Method isNonNegativeMethod = chiSquareTestImplClazz.getDeclaredMethod("isNonNegative", longArrayType);
        isNonNegativeMethod.setAccessible(true);
        java.lang.Object[] isNonNegativeMethodArguments = new java.lang.Object[1];
        isNonNegativeMethodArguments[0] = ((Object) longArray);
        boolean actual = ((Boolean) isNonNegativeMethod.invoke(chiSquareTestImpl, isNonNegativeMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.inference.ChiSquareTestImpl.isRectangular
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isRectangular([[J)
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#isRectangular(long[][])}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsRectangular_ReturnTrue() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = {null};
        
        Class chiSquareTestImplClazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class longArrayType = Class.forName("[[J");
        Method isRectangularMethod = chiSquareTestImplClazz.getDeclaredMethod("isRectangular", longArrayType);
        isRectangularMethod.setAccessible(true);
        java.lang.Object[] isRectangularMethodArguments = new java.lang.Object[1];
        isRectangularMethodArguments[0] = ((Object) longArray);
        boolean actual = ((Boolean) isRectangularMethod.invoke(chiSquareTestImpl, isRectangularMethodArguments));
        
        assertTrue(actual);
        
        long[] finalLongArray0 = longArray[0];
        
        assertNull(finalLongArray0);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#isRectangular(long[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < in.length; i++)} once
 *  */
    @Test
    public void testIsRectangular_IniLengthNotEqualsIn0Length() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = new long[2][];
        long[] longArray1 = {0L};
        longArray[0] = longArray1;
        long[] longArray2 = {0L, 0L};
        longArray[1] = longArray2;
        
        Class chiSquareTestImplClazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class longArrayType = Class.forName("[[J");
        Method isRectangularMethod = chiSquareTestImplClazz.getDeclaredMethod("isRectangular", longArrayType);
        isRectangularMethod.setAccessible(true);
        java.lang.Object[] isRectangularMethodArguments = new java.lang.Object[1];
        isRectangularMethodArguments[0] = ((Object) longArray);
        boolean actual = ((Boolean) isRectangularMethod.invoke(chiSquareTestImpl, isRectangularMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#isRectangular(long[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < in.length; i++)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsRectangular_IniLengthEqualsIn0Length() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = new long[2][];
        long[] longArray1 = {};
        longArray[0] = longArray1;
        longArray[1] = longArray1;
        
        Class chiSquareTestImplClazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class longArrayType = Class.forName("[[J");
        Method isRectangularMethod = chiSquareTestImplClazz.getDeclaredMethod("isRectangular", longArrayType);
        isRectangularMethod.setAccessible(true);
        java.lang.Object[] isRectangularMethodArguments = new java.lang.Object[1];
        isRectangularMethodArguments[0] = ((Object) longArray);
        boolean actual = ((Boolean) isRectangularMethod.invoke(chiSquareTestImpl, isRectangularMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isRectangular([[J)
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#isRectangular(long[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < in.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: in[i].length != in[0].length
 *  */
    @Test
    public void testIsRectangular_ThrowNullPointerException_1() throws Throwable  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = new long[2][];
        longArray[0] = ((long[]) null);
        long[] longArray1 = {0L};
        longArray[1] = longArray1;
        
        /* This test fails because method [org.apache.commons.math.stat.inference.ChiSquareTestImpl.isRectangular] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.isRectangular(ChiSquareTestImpl.java:334) */
        Class chiSquareTestImplClazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class longArrayType = Class.forName("[[J");
        Method isRectangularMethod = chiSquareTestImplClazz.getDeclaredMethod("isRectangular", longArrayType);
        isRectangularMethod.setAccessible(true);
        java.lang.Object[] isRectangularMethodArguments = new java.lang.Object[1];
        isRectangularMethodArguments[0] = ((Object) longArray);
        try {
            isRectangularMethod.invoke(chiSquareTestImpl, isRectangularMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#isRectangular(long[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < in.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: in[i].length != in[0].length
 *  */
    @Test
    public void testIsRectangular_ThrowNullPointerException_2() throws Throwable  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = {
            null,
            null
        };
        
        /* This test fails because method [org.apache.commons.math.stat.inference.ChiSquareTestImpl.isRectangular] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.isRectangular(ChiSquareTestImpl.java:334) */
        Class chiSquareTestImplClazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class longArrayType = Class.forName("[[J");
        Method isRectangularMethod = chiSquareTestImplClazz.getDeclaredMethod("isRectangular", longArrayType);
        isRectangularMethod.setAccessible(true);
        java.lang.Object[] isRectangularMethodArguments = new java.lang.Object[1];
        isRectangularMethodArguments[0] = ((Object) longArray);
        try {
            isRectangularMethod.invoke(chiSquareTestImpl, isRectangularMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#isRectangular(long[][])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 1; i < in.length; i++)
 *  */
    @Test
    public void testIsRectangular_ThrowNullPointerException() throws Throwable  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        
        /* This test fails because method [org.apache.commons.math.stat.inference.ChiSquareTestImpl.isRectangular] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.isRectangular(ChiSquareTestImpl.java:333) */
        Class chiSquareTestImplClazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class longArrayType = Class.forName("[[J");
        Method isRectangularMethod = chiSquareTestImplClazz.getDeclaredMethod("isRectangular", longArrayType);
        isRectangularMethod.setAccessible(true);
        java.lang.Object[] isRectangularMethodArguments = new java.lang.Object[1];
        isRectangularMethodArguments[0] = ((Object) null);
        try {
            isRectangularMethod.invoke(chiSquareTestImpl, isRectangularMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isRectangular([[J)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#isRectangular(long[][])}
     */
    @Test
    public void testIsRectangularReturnsTrueWithNonEmptyObjectArray() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        ChiSquareTestImpl chiSquareTestImpl = new ChiSquareTestImpl();
        long[][] longArray = new long[3][];
        long[] longArray1 = {java.lang.Long.MAX_VALUE, java.lang.Long.MIN_VALUE, java.lang.Long.MIN_VALUE};
        longArray[0] = longArray1;
        long[] longArray2 = {java.lang.Long.MAX_VALUE, java.lang.Long.MIN_VALUE, java.lang.Long.MIN_VALUE};
        longArray[1] = longArray2;
        long[] longArray3 = {java.lang.Long.MAX_VALUE, java.lang.Long.MIN_VALUE, java.lang.Long.MIN_VALUE};
        longArray[2] = longArray3;
        
        Class chiSquareTestImplClazz = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class longArrayType = Class.forName("[[J");
        Method isRectangularMethod = chiSquareTestImplClazz.getDeclaredMethod("isRectangular", longArrayType);
        isRectangularMethod.setAccessible(true);
        java.lang.Object[] isRectangularMethodArguments = new java.lang.Object[1];
        isRectangularMethodArguments[0] = ((Object) longArray);
        boolean actual = ((Boolean) isRectangularMethod.invoke(chiSquareTestImpl, isRectangularMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method chiSquareTest([[J, double)
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareTest(long[][],double)}
 * @utbot.executesCondition {@code (alpha <= 0): False}
 * @utbot.executesCondition {@code (alpha > 0.5): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return (chiSquareTest(counts) < alpha);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTest_ThrowIllegalArgumentException_2() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = {null};
        
        chiSquareTestImpl.chiSquareTest(longArray, 0.5);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareTest(long[][],double)}
 * @utbot.executesCondition {@code (alpha <= 0): False}
 * @utbot.executesCondition {@code (alpha > 0.5): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return (chiSquareTest(counts) < alpha);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTest_ThrowIllegalArgumentException_3() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = new long[2][];
        long[] longArray1 = {0L};
        longArray[0] = longArray1;
        longArray[1] = ((long[]) null);
        
        chiSquareTestImpl.chiSquareTest(longArray, 0.5);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareTest(long[][],double)}
 * @utbot.executesCondition {@code (alpha <= 0): False}
 * @utbot.executesCondition {@code (alpha > 0.5): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return (chiSquareTest(counts) < alpha);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTest_ThrowIllegalArgumentException_4() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = new long[2][];
        long[] longArray1 = {0L, 0L};
        longArray[0] = longArray1;
        long[] longArray2 = {0L};
        longArray[1] = longArray2;
        
        chiSquareTestImpl.chiSquareTest(longArray, 0.5);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareTest(long[][],double)}
 * @utbot.executesCondition {@code (alpha <= 0): False}
 * @utbot.executesCondition {@code (alpha > 0.5): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return (chiSquareTest(counts) < alpha);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTest_ThrowIllegalArgumentException_5() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = new long[2][];
        long[] longArray1 = {0L, 0L};
        longArray[0] = longArray1;
        long[] longArray2 = {-9223372036854775807L, 4602678819172646912L};
        longArray[1] = longArray2;
        
        chiSquareTestImpl.chiSquareTest(longArray, 0.5);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareTest(long[][],double)}
 * @utbot.executesCondition {@code (alpha <= 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: (alpha <= 0) || (alpha > 0.5)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTest_ThrowIllegalArgumentException() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        
        chiSquareTestImpl.chiSquareTest(((long[][]) null), -0.0);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareTest(long[][],double)}
 * @utbot.executesCondition {@code (alpha <= 0): False}
 * @utbot.executesCondition {@code (alpha > 0.5): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: (alpha <= 0) || (alpha > 0.5)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTest_ThrowIllegalArgumentException_1() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        
        chiSquareTestImpl.chiSquareTest(((long[][]) null), 4.000000000000001);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method chiSquareTest([[J, double)
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareTest(long[][],double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (chiSquareTest(counts) < alpha);
 *  */
    @Test
    public void testChiSquareTest_ThrowNullPointerException() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = {
            null,
            null
        };
        
        /* This test fails because method [org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkArray(ChiSquareTestImpl.java:298)
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(ChiSquareTestImpl.java:169)
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(ChiSquareTestImpl.java:188) */
        chiSquareTestImpl.chiSquareTest(longArray, 0.5);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareTest(long[][],double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (chiSquareTest(counts) < alpha);
 *  */
    @Test
    public void testChiSquareTest_ThrowNullPointerException_2() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = new long[2][];
        long[] longArray1 = {0L, 0L};
        longArray[0] = longArray1;
        longArray[1] = ((long[]) null);
        
        /* This test fails because method [org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.isRectangular(ChiSquareTestImpl.java:334)
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkArray(ChiSquareTestImpl.java:302)
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(ChiSquareTestImpl.java:169)
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(ChiSquareTestImpl.java:188) */
        chiSquareTestImpl.chiSquareTest(longArray, 0.5);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareTest(long[][],double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (chiSquareTest(counts) < alpha);
 *  */
    @Test
    public void testChiSquareTest_ThrowNullPointerException_1() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        
        /* This test fails because method [org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkArray(ChiSquareTestImpl.java:294)
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(ChiSquareTestImpl.java:169)
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(ChiSquareTestImpl.java:188) */
        chiSquareTestImpl.chiSquareTest(((long[][]) null), 0.5);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method chiSquareTest([[J, double)
    
    @Test
    public void testChiSquareTest1() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        ChiSquaredDistributionImpl distribution = ((ChiSquaredDistributionImpl) createInstance("org.apache.commons.math.distribution.ChiSquaredDistributionImpl"));
        GammaDistributionImpl gamma = ((GammaDistributionImpl) createInstance("org.apache.commons.math.distribution.GammaDistributionImpl"));
        gamma.setAlpha(0.0);
        distribution.setGamma(gamma);
        chiSquareTestImpl.setDistribution(distribution);
        long[][] longArray = new long[2][];
        long[] longArray1 = {0L, 0L};
        longArray[0] = longArray1;
        longArray[1] = longArray1;
        
        boolean actual = chiSquareTestImpl.chiSquareTest(longArray, java.lang.Double.NaN);
        
        assertFalse(actual);
        
        ChiSquaredDistribution chiSquareTestImplDistribution = ((ChiSquaredDistribution) getFieldValue(chiSquareTestImpl, "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "distribution"));
        GammaDistribution chiSquareTestImplDistributionDistributionGamma = ((GammaDistribution) getFieldValue(chiSquareTestImplDistribution, "org.apache.commons.math.distribution.ChiSquaredDistributionImpl", "gamma"));
        double finalChiSquareTestImplDistributionGammaAlpha = ((Double) getFieldValue(chiSquareTestImplDistributionDistributionGamma, "org.apache.commons.math.distribution.GammaDistributionImpl", "alpha"));
        
        assertEquals(0.5, finalChiSquareTestImplDistributionGammaAlpha, 1.0E-6);
    }
    
    @Test
    public void testChiSquareTest2() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        ChiSquaredDistributionImpl distribution = ((ChiSquaredDistributionImpl) createInstance("org.apache.commons.math.distribution.ChiSquaredDistributionImpl"));
        GammaDistributionImpl gamma = ((GammaDistributionImpl) createInstance("org.apache.commons.math.distribution.GammaDistributionImpl"));
        gamma.setAlpha(java.lang.Double.NaN);
        distribution.setGamma(gamma);
        chiSquareTestImpl.setDistribution(distribution);
        long[][] longArray = new long[3][];
        long[] longArray1 = {0L, 0L};
        longArray[0] = longArray1;
        longArray[1] = longArray1;
        longArray[2] = longArray1;
        
        boolean actual = chiSquareTestImpl.chiSquareTest(longArray, java.lang.Double.NaN);
        
        assertFalse(actual);
        
        ChiSquaredDistribution chiSquareTestImplDistribution = ((ChiSquaredDistribution) getFieldValue(chiSquareTestImpl, "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "distribution"));
        GammaDistribution chiSquareTestImplDistributionDistributionGamma = ((GammaDistribution) getFieldValue(chiSquareTestImplDistribution, "org.apache.commons.math.distribution.ChiSquaredDistributionImpl", "gamma"));
        double finalChiSquareTestImplDistributionGammaAlpha = ((Double) getFieldValue(chiSquareTestImplDistributionDistributionGamma, "org.apache.commons.math.distribution.GammaDistributionImpl", "alpha"));
        
        assertEquals(1.0, finalChiSquareTestImplDistributionGammaAlpha, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method chiSquareTest([[J, double)
    
    @Test
    public void testChiSquareTest3() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = new long[2][];
        long[] longArray1 = new long[15];
        longArray1[7] = 9218868437227405313L;
        longArray1[8] = 9218868437227405313L;
        longArray1[9] = 9218868437227405313L;
        longArray1[10] = 9218868437227405313L;
        longArray1[11] = 9218868437227405313L;
        longArray1[12] = 9218868437227405313L;
        longArray1[13] = 9218868437227405313L;
        longArray1[14] = 9218868437227405313L;
        longArray[0] = longArray1;
        longArray[1] = longArray1;
        
        /* This test fails because method [org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(ChiSquareTestImpl.java:171)
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(ChiSquareTestImpl.java:188) */
        chiSquareTestImpl.chiSquareTest(longArray, java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method chiSquareTest([D, [J, double)
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareTest(double[],long[],double)}
 * @utbot.executesCondition {@code (alpha <= 0): False}
 * @utbot.executesCondition {@code (alpha > 0.5): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: (alpha <= 0) || (alpha > 0.5)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTest_ThrowIllegalArgumentException1() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        
        chiSquareTestImpl.chiSquareTest(null, null, 1.0000000000000002);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareTest(double[],long[],double)}
 * @utbot.executesCondition {@code (alpha <= 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: (alpha <= 0) || (alpha > 0.5)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTest_ThrowIllegalArgumentException_11() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        
        chiSquareTestImpl.chiSquareTest(null, null, -0.0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method chiSquareTest([D, [J)
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareTest(double[],long[])}
 * @utbot.invokes {@link org.apache.commons.math.distribution.ChiSquaredDistribution#setDegreesOfFreedom(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: distribution.setDegreesOfFreedom(expected.length - 1.0);
 *  */
    @Test
    public void testChiSquareTest_ThrowNullPointerException_11() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(ChiSquareTestImpl.java:97) */
        chiSquareTestImpl.chiSquareTest(doubleArray, ((long[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareTest(double[],long[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: distribution.setDegreesOfFreedom(expected.length - 1.0);
 *  */
    @Test
    public void testChiSquareTest_ThrowNullPointerException1() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        
        /* This test fails because method [org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(ChiSquareTestImpl.java:97) */
        chiSquareTestImpl.chiSquareTest(((double[]) null), ((long[]) null));
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method chiSquareTest([D, [J)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareTest(double[],long[])}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTestThrowsIAEWithNonEmptyPrimitiveArrays() throws MathException  {
        ChiSquareTestImpl chiSquareTestImpl = new ChiSquareTestImpl();
        double[] doubleArray = {-1.0, -1.0, -4.49423283715579E307};
        long[] longArray = {-1L};
        
        chiSquareTestImpl.chiSquareTest(doubleArray, longArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method chiSquareTest([[J)
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareTest(long[][])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: checkArray(counts);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTest_ThrowIllegalArgumentException2() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = new long[11][];
        long[] longArray1 = {0L, 0L};
        longArray[0] = longArray1;
        longArray[1] = longArray1;
        long[] longArray2 = {0L};
        longArray[2] = longArray2;
        longArray[3] = ((long[]) null);
        longArray[4] = ((long[]) null);
        longArray[5] = ((long[]) null);
        longArray[6] = ((long[]) null);
        longArray[7] = ((long[]) null);
        longArray[8] = ((long[]) null);
        longArray[9] = ((long[]) null);
        longArray[10] = ((long[]) null);
        
        chiSquareTestImpl.chiSquareTest(longArray);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareTest(long[][])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: checkArray(counts);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTest_ThrowIllegalArgumentException_12() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = new long[2][];
        long[] longArray1 = {0L, 0L};
        longArray[0] = longArray1;
        long[] longArray2 = {-9223372036854775807L, 0L};
        longArray[1] = longArray2;
        
        chiSquareTestImpl.chiSquareTest(longArray);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareTest(long[][])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: checkArray(counts);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTest_ThrowIllegalArgumentException_21() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = {null};
        
        chiSquareTestImpl.chiSquareTest(longArray);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareTest(long[][])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: checkArray(counts);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTest_ThrowIllegalArgumentException_31() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = new long[2][];
        long[] longArray1 = {0L};
        longArray[0] = longArray1;
        longArray[1] = ((long[]) null);
        
        chiSquareTestImpl.chiSquareTest(longArray);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareTest(long[][])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: checkArray(counts);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTest_ThrowIllegalArgumentException_41() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = new long[2][];
        long[] longArray1 = {0L, 0L};
        longArray[0] = longArray1;
        long[] longArray2 = {0L};
        longArray[1] = longArray2;
        
        chiSquareTestImpl.chiSquareTest(longArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method chiSquareTest([[J)
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareTest(long[][])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkArray(counts);
 *  */
    @Test
    public void testChiSquareTest_ThrowNullPointerException_12() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = {
            null,
            null
        };
        
        /* This test fails because method [org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkArray(ChiSquareTestImpl.java:298)
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(ChiSquareTestImpl.java:169) */
        chiSquareTestImpl.chiSquareTest(longArray);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareTest(long[][])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkArray(counts);
 *  */
    @Test
    public void testChiSquareTest_ThrowNullPointerException_21() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = new long[2][];
        long[] longArray1 = {0L, 0L};
        longArray[0] = longArray1;
        longArray[1] = ((long[]) null);
        
        /* This test fails because method [org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.isRectangular(ChiSquareTestImpl.java:334)
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkArray(ChiSquareTestImpl.java:302)
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(ChiSquareTestImpl.java:169) */
        chiSquareTestImpl.chiSquareTest(longArray);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareTest(long[][])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkArray(counts);
 *  */
    @Test
    public void testChiSquareTest_ThrowNullPointerException2() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        
        /* This test fails because method [org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkArray(ChiSquareTestImpl.java:294)
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(ChiSquareTestImpl.java:169) */
        chiSquareTestImpl.chiSquareTest(null);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquareTest(long[][])}
 * @utbot.invokes {@link org.apache.commons.math.distribution.ChiSquaredDistribution#setDegreesOfFreedom(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: distribution.setDegreesOfFreedom(df);
 *  */
    @Test
    public void testChiSquareTest_ThrowNullPointerException_3() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = new long[2][];
        long[] longArray1 = {0L, 0L};
        longArray[0] = longArray1;
        longArray[1] = longArray1;
        
        /* This test fails because method [org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquareTest(ChiSquareTestImpl.java:171) */
        chiSquareTestImpl.chiSquareTest(longArray);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method chiSquareTest([[J)
    
    @Test
    public void testChiSquareTest4() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        ChiSquaredDistributionImpl distribution = ((ChiSquaredDistributionImpl) createInstance("org.apache.commons.math.distribution.ChiSquaredDistributionImpl"));
        GammaDistributionImpl gamma = ((GammaDistributionImpl) createInstance("org.apache.commons.math.distribution.GammaDistributionImpl"));
        gamma.setAlpha(java.lang.Double.NaN);
        distribution.setGamma(gamma);
        chiSquareTestImpl.setDistribution(distribution);
        long[][] longArray = new long[2][];
        long[] longArray1 = {0L, 0L, 0L};
        longArray[0] = longArray1;
        longArray[1] = longArray1;
        
        double actual = chiSquareTestImpl.chiSquareTest(longArray);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
        
        ChiSquaredDistribution chiSquareTestImplDistribution = ((ChiSquaredDistribution) getFieldValue(chiSquareTestImpl, "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "distribution"));
        GammaDistribution chiSquareTestImplDistributionDistributionGamma = ((GammaDistribution) getFieldValue(chiSquareTestImplDistribution, "org.apache.commons.math.distribution.ChiSquaredDistributionImpl", "gamma"));
        double finalChiSquareTestImplDistributionGammaAlpha = ((Double) getFieldValue(chiSquareTestImplDistributionDistributionGamma, "org.apache.commons.math.distribution.GammaDistributionImpl", "alpha"));
        
        assertEquals(1.0, finalChiSquareTestImplDistributionGammaAlpha, 1.0E-6);
    }
    
    @Test
    public void testChiSquareTest5() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        ChiSquaredDistributionImpl distribution = ((ChiSquaredDistributionImpl) createInstance("org.apache.commons.math.distribution.ChiSquaredDistributionImpl"));
        GammaDistributionImpl gamma = ((GammaDistributionImpl) createInstance("org.apache.commons.math.distribution.GammaDistributionImpl"));
        gamma.setAlpha(java.lang.Double.NaN);
        distribution.setGamma(gamma);
        chiSquareTestImpl.setDistribution(distribution);
        long[][] longArray = new long[3][];
        long[] longArray1 = {1L, 0L};
        longArray[0] = longArray1;
        long[] longArray2 = {0L, 0L};
        longArray[1] = longArray2;
        longArray[2] = longArray2;
        
        double actual = chiSquareTestImpl.chiSquareTest(longArray);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
        
        ChiSquaredDistribution chiSquareTestImplDistribution = ((ChiSquaredDistribution) getFieldValue(chiSquareTestImpl, "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "distribution"));
        GammaDistribution chiSquareTestImplDistributionDistributionGamma = ((GammaDistribution) getFieldValue(chiSquareTestImplDistribution, "org.apache.commons.math.distribution.ChiSquaredDistributionImpl", "gamma"));
        double finalChiSquareTestImplDistributionGammaAlpha = ((Double) getFieldValue(chiSquareTestImplDistributionDistributionGamma, "org.apache.commons.math.distribution.GammaDistributionImpl", "alpha"));
        
        assertEquals(1.0, finalChiSquareTestImplDistributionGammaAlpha, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquare
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method chiSquare([D, [J)
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquare(double[],long[])}
 * @utbot.executesCondition {@code (expected.length < 2): False}
 * @utbot.executesCondition {@code (expected.length != observed.length): False}
 * @utbot.executesCondition {@code (!isPositive(expected)): True}
 * @utbot.executesCondition {@code (!isNonNegative(observed)): False}
 * @utbot.invokes org.apache.commons.math.stat.inference.ChiSquareTestImpl#isPositive(double[])
 * @utbot.invokes org.apache.commons.math.stat.inference.ChiSquareTestImpl#isNonNegative(long[])
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < observed.length; i++)} twice
 * @utbot.returnsFrom {@code return sumSq;}
 *  */
    @Test
    public void testChiSquare_IsNonNegative() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        double[] doubleArray = {3.337610787760802E-308, 3.337610787760802E-308};
        long[] longArray = {0L, 0L};
        
        double actual = chiSquareTestImpl.chiSquare(doubleArray, longArray);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method chiSquare([D, [J)
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquare(double[],long[])}
 * @utbot.executesCondition {@code (expected.length < 2): False}
 * @utbot.executesCondition {@code (expected.length != observed.length): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: (expected.length < 2) || (expected.length != observed.length)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquare_ThrowIllegalArgumentException() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        double[] doubleArray = {0.0, 0.0};
        long[] longArray = {-255L};
        
        chiSquareTestImpl.chiSquare(doubleArray, longArray);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquare(double[],long[])}
 * @utbot.executesCondition {@code (expected.length < 2): False}
 * @utbot.executesCondition {@code (expected.length != observed.length): False}
 * @utbot.executesCondition {@code (!isPositive(expected)): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: !isPositive(expected) || !isNonNegative(observed)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquare_ThrowIllegalArgumentException_2() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        double[] doubleArray = {-0.0, 0.0};
        long[] longArray = {-255L, -255L};
        
        chiSquareTestImpl.chiSquare(doubleArray, longArray);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquare(double[],long[])}
 * @utbot.executesCondition {@code (expected.length < 2): False}
 * @utbot.executesCondition {@code (expected.length != observed.length): False}
 * @utbot.executesCondition {@code (!isPositive(expected)): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: !isPositive(expected) || !isNonNegative(observed)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquare_ThrowIllegalArgumentException_3() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        double[] doubleArray = {3.337610787760802E-308, -0.0};
        long[] longArray = {-255L, -255L};
        
        chiSquareTestImpl.chiSquare(doubleArray, longArray);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquare(double[],long[])}
 * @utbot.executesCondition {@code (expected.length < 2): False}
 * @utbot.executesCondition {@code (expected.length != observed.length): False}
 * @utbot.executesCondition {@code (!isPositive(expected)): True}
 * @utbot.executesCondition {@code (!isNonNegative(observed)): True}
 * @utbot.invokes org.apache.commons.math.stat.inference.ChiSquareTestImpl#isNonNegative(long[])
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: !isPositive(expected) || !isNonNegative(observed)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquare_ThrowIllegalArgumentException_4() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        double[] doubleArray = {3.337610787760802E-308, 3.337610787760802E-308};
        long[] longArray = {0L, -255L};
        
        chiSquareTestImpl.chiSquare(doubleArray, longArray);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquare(double[],long[])}
 * @utbot.executesCondition {@code (expected.length < 2): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: (expected.length < 2) || (expected.length != observed.length)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquare_ThrowIllegalArgumentException_1() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        double[] doubleArray = {0.0};
        
        chiSquareTestImpl.chiSquare(doubleArray, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method chiSquare([D, [J)
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquare(double[],long[])}
 * @utbot.executesCondition {@code (expected.length < 2): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: (expected.length < 2) || (expected.length != observed.length)
 *  */
    @Test
    public void testChiSquare_ThrowNullPointerException_1() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        double[] doubleArray = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquare] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquare(ChiSquareTestImpl.java:66) */
        chiSquareTestImpl.chiSquare(doubleArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquare(double[],long[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: (expected.length < 2) || (expected.length != observed.length)
 *  */
    @Test
    public void testChiSquare_ThrowNullPointerException() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        
        /* This test fails because method [org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquare] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquare(ChiSquareTestImpl.java:66) */
        chiSquareTestImpl.chiSquare(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquare
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method chiSquare([[J)
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquare(long[][])}
 * @utbot.invokes org.apache.commons.math.stat.inference.ChiSquareTestImpl#checkArray(long[][])
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRows; row++)} once
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRows; row++)} once
 * @utbot.returnsFrom {@code return sumSq;}
 *  */
    @Test
    public void testChiSquare_ChiSquareTestImplCheckArray() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = new long[2][];
        long[] longArray1 = {0L, 0L};
        longArray[0] = longArray1;
        longArray[1] = longArray1;
        
        double actual = chiSquareTestImpl.chiSquare(longArray);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method chiSquare([[J)
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquare(long[][])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: checkArray(counts);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquare_ThrowIllegalArgumentException1() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = new long[11][];
        long[] longArray1 = {0L, 0L};
        longArray[0] = longArray1;
        longArray[1] = longArray1;
        long[] longArray2 = {0L};
        longArray[2] = longArray2;
        longArray[3] = ((long[]) null);
        longArray[4] = ((long[]) null);
        longArray[5] = ((long[]) null);
        longArray[6] = ((long[]) null);
        longArray[7] = ((long[]) null);
        longArray[8] = ((long[]) null);
        longArray[9] = ((long[]) null);
        longArray[10] = ((long[]) null);
        
        chiSquareTestImpl.chiSquare(longArray);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquare(long[][])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: checkArray(counts);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquare_ThrowIllegalArgumentException_11() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = new long[2][];
        long[] longArray1 = {0L, 0L};
        longArray[0] = longArray1;
        long[] longArray2 = {-9223372036854775807L, 0L};
        longArray[1] = longArray2;
        
        chiSquareTestImpl.chiSquare(longArray);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquare(long[][])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: checkArray(counts);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquare_ThrowIllegalArgumentException_21() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = {null};
        
        chiSquareTestImpl.chiSquare(longArray);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquare(long[][])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: checkArray(counts);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquare_ThrowIllegalArgumentException_31() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = new long[2][];
        long[] longArray1 = {0L};
        longArray[0] = longArray1;
        longArray[1] = ((long[]) null);
        
        chiSquareTestImpl.chiSquare(longArray);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquare(long[][])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: checkArray(counts);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testChiSquare_ThrowIllegalArgumentException_41() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = new long[2][];
        long[] longArray1 = {0L, 0L};
        longArray[0] = longArray1;
        long[] longArray2 = {0L};
        longArray[1] = longArray2;
        
        chiSquareTestImpl.chiSquare(longArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method chiSquare([[J)
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquare(long[][])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkArray(counts);
 *  */
    @Test
    public void testChiSquare_ThrowNullPointerException_11() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = {
            null,
            null
        };
        
        /* This test fails because method [org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquare] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkArray(ChiSquareTestImpl.java:298)
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquare(ChiSquareTestImpl.java:132) */
        chiSquareTestImpl.chiSquare(longArray);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquare(long[][])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkArray(counts);
 *  */
    @Test
    public void testChiSquare_ThrowNullPointerException_2() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        long[][] longArray = new long[2][];
        long[] longArray1 = {0L, 0L};
        longArray[0] = longArray1;
        longArray[1] = ((long[]) null);
        
        /* This test fails because method [org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquare] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.isRectangular(ChiSquareTestImpl.java:334)
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkArray(ChiSquareTestImpl.java:302)
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquare(ChiSquareTestImpl.java:132) */
        chiSquareTestImpl.chiSquare(longArray);
    }
    
    /**
    @utbot.classUnderTest {@link ChiSquareTestImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.inference.ChiSquareTestImpl#chiSquare(long[][])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkArray(counts);
 *  */
    @Test
    public void testChiSquare_ThrowNullPointerException1() throws Exception  {
        ChiSquareTestImpl chiSquareTestImpl = ((ChiSquareTestImpl) createInstance("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        
        /* This test fails because method [org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquare] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.checkArray(ChiSquareTestImpl.java:294)
            org.apache.commons.math.stat.inference.ChiSquareTestImpl.chiSquare(ChiSquareTestImpl.java:132) */
        chiSquareTestImpl.chiSquare(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields788899612031200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields788899612031200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass788899612038300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields788899612031200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass788899612038300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

