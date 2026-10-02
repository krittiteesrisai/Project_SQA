package org.apache.commons.math3.stat.inference;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.stat.ranking.NaNStrategy;
import org.apache.commons.math3.stat.ranking.TiesStrategy;
import org.apache.commons.math3.stat.ranking.NaturalRanking;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public final class org_apache_commons_math3_stat_inference_MannWhitneyUTestTest {
    ///region Test suites for executable org.apache.commons.math3.stat.inference.MannWhitneyUTest.ensureDataConformance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ensureDataConformance([D, [D)
    
    /**
    @utbot.classUnderTest {@link MannWhitneyUTest}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.stat.inference.MannWhitneyUTest#ensureDataConformance(double[],double[])}
 * @utbot.executesCondition {@code (x == null): False}
 * @utbot.executesCondition {@code (y == null): False}
 * @utbot.executesCondition {@code (x.length == 0): False}
 * @utbot.executesCondition {@code (y.length == 0): False}
 *  */
    @Test
    public void testEnsureDataConformance_YLengthNotEqualsZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        MannWhitneyUTest mannWhitneyUTest = new MannWhitneyUTest();
        double[] doubleArray = {0.0};
        
        Class mannWhitneyUTestClazz = Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest");
        Class doubleArrayType = Class.forName("[D");
        Method ensureDataConformanceMethod = mannWhitneyUTestClazz.getDeclaredMethod("ensureDataConformance", doubleArrayType, doubleArrayType);
        ensureDataConformanceMethod.setAccessible(true);
        java.lang.Object[] ensureDataConformanceMethodArguments = new java.lang.Object[2];
        ensureDataConformanceMethodArguments[0] = ((Object) doubleArray);
        ensureDataConformanceMethodArguments[1] = ((Object) doubleArray);
        ensureDataConformanceMethod.invoke(mannWhitneyUTest, ensureDataConformanceMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method ensureDataConformance([D, [D)
    
    /**
    @utbot.classUnderTest {@link MannWhitneyUTest}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.stat.inference.MannWhitneyUTest#ensureDataConformance(double[],double[])}
 * @utbot.executesCondition {@code (x == null): False}
 * @utbot.executesCondition {@code (y == null): False}
 * @utbot.executesCondition {@code (x.length == 0): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} when: x.length == 0 || y.length == 0
 *  */
    @Test(expected = NoDataException.class)
    public void testEnsureDataConformance_ThrowNoDataException() throws Throwable  {
        MannWhitneyUTest mannWhitneyUTest = new MannWhitneyUTest();
        double[] doubleArray = {};
        double[] doubleArray1 = {0.0};
        
        Class mannWhitneyUTestClazz = Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest");
        Class doubleArrayType = Class.forName("[D");
        Method ensureDataConformanceMethod = mannWhitneyUTestClazz.getDeclaredMethod("ensureDataConformance", doubleArrayType, doubleArrayType);
        ensureDataConformanceMethod.setAccessible(true);
        java.lang.Object[] ensureDataConformanceMethodArguments = new java.lang.Object[2];
        ensureDataConformanceMethodArguments[0] = ((Object) doubleArray);
        ensureDataConformanceMethodArguments[1] = ((Object) doubleArray1);
        try {
            ensureDataConformanceMethod.invoke(mannWhitneyUTest, ensureDataConformanceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MannWhitneyUTest}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.stat.inference.MannWhitneyUTest#ensureDataConformance(double[],double[])}
 * @utbot.executesCondition {@code (x == null): False}
 * @utbot.executesCondition {@code (y == null): False}
 * @utbot.executesCondition {@code (x.length == 0): False}
 * @utbot.executesCondition {@code (y.length == 0): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} when: x.length == 0 || y.length == 0
 *  */
    @Test(expected = NoDataException.class)
    public void testEnsureDataConformance_ThrowNoDataException_1() throws Throwable  {
        MannWhitneyUTest mannWhitneyUTest = new MannWhitneyUTest();
        double[] doubleArray = {0.0};
        double[] doubleArray1 = {};
        
        Class mannWhitneyUTestClazz = Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest");
        Class doubleArrayType = Class.forName("[D");
        Method ensureDataConformanceMethod = mannWhitneyUTestClazz.getDeclaredMethod("ensureDataConformance", doubleArrayType, doubleArrayType);
        ensureDataConformanceMethod.setAccessible(true);
        java.lang.Object[] ensureDataConformanceMethodArguments = new java.lang.Object[2];
        ensureDataConformanceMethodArguments[0] = ((Object) doubleArray);
        ensureDataConformanceMethodArguments[1] = ((Object) doubleArray1);
        try {
            ensureDataConformanceMethod.invoke(mannWhitneyUTest, ensureDataConformanceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MannWhitneyUTest}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.stat.inference.MannWhitneyUTest#ensureDataConformance(double[],double[])}
 * @utbot.executesCondition {@code (x == null): False}
 * @utbot.executesCondition {@code (y == null): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NullArgumentException} when: x == null || y == null
 *  */
    @Test(expected = NullArgumentException.class)
    public void testEnsureDataConformance_ThrowNullArgumentException_1() throws Throwable  {
        MannWhitneyUTest mannWhitneyUTest = new MannWhitneyUTest();
        double[] doubleArray = {0.0};
        
        Class mannWhitneyUTestClazz = Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest");
        Class doubleArrayType = Class.forName("[D");
        Method ensureDataConformanceMethod = mannWhitneyUTestClazz.getDeclaredMethod("ensureDataConformance", doubleArrayType, doubleArrayType);
        ensureDataConformanceMethod.setAccessible(true);
        java.lang.Object[] ensureDataConformanceMethodArguments = new java.lang.Object[2];
        ensureDataConformanceMethodArguments[0] = ((Object) doubleArray);
        ensureDataConformanceMethodArguments[1] = ((Object) null);
        try {
            ensureDataConformanceMethod.invoke(mannWhitneyUTest, ensureDataConformanceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MannWhitneyUTest}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.stat.inference.MannWhitneyUTest#ensureDataConformance(double[],double[])}
 * @utbot.executesCondition {@code (x == null): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NullArgumentException} when: x == null || y == null
 *  */
    @Test(expected = NullArgumentException.class)
    public void testEnsureDataConformance_ThrowNullArgumentException() throws Throwable  {
        MannWhitneyUTest mannWhitneyUTest = new MannWhitneyUTest();
        
        Class mannWhitneyUTestClazz = Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest");
        Class doubleArrayType = Class.forName("[D");
        Method ensureDataConformanceMethod = mannWhitneyUTestClazz.getDeclaredMethod("ensureDataConformance", doubleArrayType, doubleArrayType);
        ensureDataConformanceMethod.setAccessible(true);
        java.lang.Object[] ensureDataConformanceMethodArguments = new java.lang.Object[2];
        ensureDataConformanceMethodArguments[0] = ((Object) null);
        ensureDataConformanceMethodArguments[1] = ((Object) null);
        try {
            ensureDataConformanceMethod.invoke(mannWhitneyUTest, ensureDataConformanceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.stat.inference.MannWhitneyUTest.calculateAsymptoticPValue
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method calculateAsymptoticPValue(double, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.stat.inference.MannWhitneyUTest}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.stat.inference.MannWhitneyUTest#calculateAsymptoticPValue(double,int,int)}
     */
    @Test
    public void testCalculateAsymptoticPValueReturnsNan() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        NaNStrategy naNStrategy = NaNStrategy.MAXIMAL;
        TiesStrategy tiesStrategy = TiesStrategy.MAXIMUM;
        MannWhitneyUTest mannWhitneyUTest = new MannWhitneyUTest(naNStrategy, tiesStrategy);
        
        Class mannWhitneyUTestClazz = Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest");
        Class doubleType = double.class;
        Class intType = int.class;
        Method calculateAsymptoticPValueMethod = mannWhitneyUTestClazz.getDeclaredMethod("calculateAsymptoticPValue", doubleType, intType, intType);
        calculateAsymptoticPValueMethod.setAccessible(true);
        java.lang.Object[] calculateAsymptoticPValueMethodArguments = new java.lang.Object[3];
        calculateAsymptoticPValueMethodArguments[0] = -8.636168555094445E-78;
        calculateAsymptoticPValueMethodArguments[1] = -1;
        calculateAsymptoticPValueMethodArguments[2] = 12;
        double actual = ((Double) calculateAsymptoticPValueMethod.invoke(mannWhitneyUTest, calculateAsymptoticPValueMethodArguments));
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.stat.inference.MannWhitneyUTest}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.stat.inference.MannWhitneyUTest#calculateAsymptoticPValue(double,int,int)}
     */
    @Test
    public void testCalculateAsymptoticPValueReturnsNan1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        NaNStrategy naNStrategy = NaNStrategy.MAXIMAL;
        TiesStrategy tiesStrategy = TiesStrategy.MAXIMUM;
        MannWhitneyUTest mannWhitneyUTest = new MannWhitneyUTest(naNStrategy, tiesStrategy);
        
        Class mannWhitneyUTestClazz = Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest");
        Class doubleType = double.class;
        Class intType = int.class;
        Method calculateAsymptoticPValueMethod = mannWhitneyUTestClazz.getDeclaredMethod("calculateAsymptoticPValue", doubleType, intType, intType);
        calculateAsymptoticPValueMethod.setAccessible(true);
        java.lang.Object[] calculateAsymptoticPValueMethodArguments = new java.lang.Object[3];
        calculateAsymptoticPValueMethodArguments[0] = -8.636168555094445E-78;
        calculateAsymptoticPValueMethodArguments[1] = -1;
        calculateAsymptoticPValueMethodArguments[2] = 4108;
        double actual = ((Double) calculateAsymptoticPValueMethod.invoke(mannWhitneyUTest, calculateAsymptoticPValueMethodArguments));
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyU
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mannWhitneyU([D, [D)
    
    /**
    @utbot.classUnderTest {@link MannWhitneyUTest}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.stat.inference.MannWhitneyUTest#mannWhitneyU(double[],double[])}
 * @utbot.invokes org.apache.commons.math3.stat.inference.MannWhitneyUTest#ensureDataConformance(double[],double[])
 * @utbot.invokes org.apache.commons.math3.stat.inference.MannWhitneyUTest#concatenateSamples(double[],double[])
 * @utbot.invokes {@link org.apache.commons.math3.stat.ranking.NaturalRanking#rank(double[])}
 *  */
    @Test
    public void testMannWhitneyU_NaturalRankingRank() throws Exception  {
        MannWhitneyUTest mannWhitneyUTest = ((MannWhitneyUTest) createInstance("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        NaturalRanking naturalRanking = ((NaturalRanking) createInstance("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        NaNStrategy nanStrategy = NaNStrategy.MINIMAL;
        setField(naturalRanking, "org.apache.commons.math3.stat.ranking.NaturalRanking", "nanStrategy", nanStrategy);
        setField(mannWhitneyUTest, "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "naturalRanking", naturalRanking);
        double[] doubleArray = {4.9E-324};
        double[] doubleArray1 = {3.16E-322};
        
        double actual = mannWhitneyUTest.mannWhitneyU(doubleArray, doubleArray1);
        
        assertEquals(1.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method mannWhitneyU([D, [D)
    
    /**
    @utbot.classUnderTest {@link MannWhitneyUTest}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.stat.inference.MannWhitneyUTest#mannWhitneyU(double[],double[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: ensureDataConformance(x, y);
 *  */
    @Test(expected = NoDataException.class)
    public void testMannWhitneyU_ThrowNoDataException() {
        MannWhitneyUTest mannWhitneyUTest = new MannWhitneyUTest();
        double[] doubleArray = {};
        double[] doubleArray1 = {0.0};
        
        mannWhitneyUTest.mannWhitneyU(doubleArray, doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link MannWhitneyUTest}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.stat.inference.MannWhitneyUTest#mannWhitneyU(double[],double[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: ensureDataConformance(x, y);
 *  */
    @Test(expected = NoDataException.class)
    public void testMannWhitneyU_ThrowNoDataException_1() {
        MannWhitneyUTest mannWhitneyUTest = new MannWhitneyUTest();
        double[] doubleArray = {0.0};
        double[] doubleArray1 = {};
        
        mannWhitneyUTest.mannWhitneyU(doubleArray, doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link MannWhitneyUTest}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.stat.inference.MannWhitneyUTest#mannWhitneyU(double[],double[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NullArgumentException} in: ensureDataConformance(x, y);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testMannWhitneyU_ThrowNullArgumentException() {
        MannWhitneyUTest mannWhitneyUTest = new MannWhitneyUTest();
        double[] doubleArray = {0.0};
        
        mannWhitneyUTest.mannWhitneyU(doubleArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link MannWhitneyUTest}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.stat.inference.MannWhitneyUTest#mannWhitneyU(double[],double[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NullArgumentException} in: ensureDataConformance(x, y);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testMannWhitneyU_ThrowNullArgumentException_1() {
        MannWhitneyUTest mannWhitneyUTest = new MannWhitneyUTest();
        
        mannWhitneyUTest.mannWhitneyU(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mannWhitneyU([D, [D)
    
    /**
    @utbot.classUnderTest {@link MannWhitneyUTest}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.stat.inference.MannWhitneyUTest#mannWhitneyU(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double[] ranks = naturalRanking.rank(z);
 *  */
    @Test
    public void testMannWhitneyU_ThrowNullPointerException() throws Exception  {
        MannWhitneyUTest mannWhitneyUTest = ((MannWhitneyUTest) createInstance("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyU] produces [java.lang.NullPointerException]
            org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyU(MannWhitneyUTest.java:132) */
        mannWhitneyUTest.mannWhitneyU(doubleArray, doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link MannWhitneyUTest}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.stat.inference.MannWhitneyUTest#mannWhitneyU(double[],double[])}
 * @utbot.invokes {@link org.apache.commons.math3.stat.ranking.NaturalRanking#rank(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double[] ranks = naturalRanking.rank(z);
 *  */
    @Test
    public void testMannWhitneyU_ThrowNullPointerException_1() throws Exception  {
        MannWhitneyUTest mannWhitneyUTest = ((MannWhitneyUTest) createInstance("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        NaturalRanking naturalRanking = ((NaturalRanking) createInstance("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        NaNStrategy nanStrategy = NaNStrategy.FIXED;
        setField(naturalRanking, "org.apache.commons.math3.stat.ranking.NaturalRanking", "nanStrategy", nanStrategy);
        setField(mannWhitneyUTest, "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "naturalRanking", naturalRanking);
        double[] doubleArray = {4.9E-324};
        double[] doubleArray1 = {4.9E-324};
        
        /* This test fails because method [org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyU] produces [java.lang.NullPointerException]
            org.apache.commons.math3.stat.ranking.NaturalRanking.resolveTie(NaturalRanking.java:334)
            org.apache.commons.math3.stat.ranking.NaturalRanking.rank(NaturalRanking.java:243)
            org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyU(MannWhitneyUTest.java:132) */
        mannWhitneyUTest.mannWhitneyU(doubleArray, doubleArray1);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method mannWhitneyU([D, [D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.stat.inference.MannWhitneyUTest}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.stat.inference.MannWhitneyUTest#mannWhitneyU(double[],double[])}
     */
    @Test
    public void testMannWhitneyUWithNonEmptyPrimitiveArrays() {
        NaNStrategy naNStrategy = NaNStrategy.MAXIMAL;
        TiesStrategy tiesStrategy = TiesStrategy.MAXIMUM;
        MannWhitneyUTest mannWhitneyUTest = new MannWhitneyUTest(naNStrategy, tiesStrategy);
        double[] doubleArray = {1.0, java.lang.Double.NaN, java.lang.Double.POSITIVE_INFINITY};
        double[] doubleArray1 = {java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY, 0.0};
        
        double actual = mannWhitneyUTest.mannWhitneyU(doubleArray, doubleArray1);
        
        assertEquals(9.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method mannWhitneyU([D, [D)
    
    @Test
    public void testMannWhitneyU1() throws Exception  {
        MannWhitneyUTest mannWhitneyUTest = ((MannWhitneyUTest) createInstance("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        NaturalRanking naturalRanking = ((NaturalRanking) createInstance("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        NaNStrategy nanStrategy = NaNStrategy.REMOVED;
        setField(naturalRanking, "org.apache.commons.math3.stat.ranking.NaturalRanking", "nanStrategy", nanStrategy);
        setField(mannWhitneyUTest, "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "naturalRanking", naturalRanking);
        double[] doubleArray = {java.lang.Double.NaN};
        double[] doubleArray1 = {1.4916681462400417E-154};
        
        double actual = mannWhitneyUTest.mannWhitneyU(doubleArray, doubleArray1);
        
        assertEquals(1.0, actual, 1.0E-6);
    }
    
    @Test
    public void testMannWhitneyU2() throws Exception  {
        MannWhitneyUTest mannWhitneyUTest = ((MannWhitneyUTest) createInstance("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        NaturalRanking naturalRanking = ((NaturalRanking) createInstance("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        NaNStrategy nanStrategy = NaNStrategy.FIXED;
        setField(naturalRanking, "org.apache.commons.math3.stat.ranking.NaturalRanking", "nanStrategy", nanStrategy);
        setField(mannWhitneyUTest, "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "naturalRanking", naturalRanking);
        double[] doubleArray = {0.0};
        double[] doubleArray1 = {-2.225073858507202E-308};
        
        double actual = mannWhitneyUTest.mannWhitneyU(doubleArray, doubleArray1);
        
        assertEquals(1.0, actual, 1.0E-6);
    }
    
    @Test
    public void testMannWhitneyU3() throws Exception  {
        MannWhitneyUTest mannWhitneyUTest = ((MannWhitneyUTest) createInstance("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        NaturalRanking naturalRanking = ((NaturalRanking) createInstance("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        NaNStrategy nanStrategy = NaNStrategy.REMOVED;
        setField(naturalRanking, "org.apache.commons.math3.stat.ranking.NaturalRanking", "nanStrategy", nanStrategy);
        setField(mannWhitneyUTest, "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "naturalRanking", naturalRanking);
        double[] doubleArray = {-2.2250749236658094E-308};
        double[] doubleArray1 = {4.3469125465997E-311};
        
        double actual = mannWhitneyUTest.mannWhitneyU(doubleArray, doubleArray1);
        
        assertEquals(1.0, actual, 1.0E-6);
    }
    
    @Test
    public void testMannWhitneyU4() throws Exception  {
        MannWhitneyUTest mannWhitneyUTest = ((MannWhitneyUTest) createInstance("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        NaturalRanking naturalRanking = ((NaturalRanking) createInstance("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        NaNStrategy nanStrategy = NaNStrategy.FIXED;
        setField(naturalRanking, "org.apache.commons.math3.stat.ranking.NaturalRanking", "nanStrategy", nanStrategy);
        setField(mannWhitneyUTest, "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "naturalRanking", naturalRanking);
        double[] doubleArray = {java.lang.Double.NaN};
        double[] doubleArray1 = {1.0E-323};
        
        double actual = mannWhitneyUTest.mannWhitneyU(doubleArray, doubleArray1);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method mannWhitneyU([D, [D)
    
    @Test
    public void testMannWhitneyU5() throws Exception  {
        MannWhitneyUTest mannWhitneyUTest = ((MannWhitneyUTest) createInstance("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        NaturalRanking naturalRanking = ((NaturalRanking) createInstance("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        NaNStrategy nanStrategy = NaNStrategy.REMOVED;
        setField(naturalRanking, "org.apache.commons.math3.stat.ranking.NaturalRanking", "nanStrategy", nanStrategy);
        setField(mannWhitneyUTest, "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "naturalRanking", naturalRanking);
        double[] doubleArray = {java.lang.Double.NaN};
        double[] doubleArray1 = {java.lang.Double.NaN};
        
        /* This test fails because method [org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyU] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.stat.ranking.NaturalRanking.rank(NaturalRanking.java:224)
            org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyU(MannWhitneyUTest.java:132) */
        mannWhitneyUTest.mannWhitneyU(doubleArray, doubleArray1);
    }
    
    @Test
    public void testMannWhitneyU6() throws Exception  {
        MannWhitneyUTest mannWhitneyUTest = ((MannWhitneyUTest) createInstance("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        NaturalRanking naturalRanking = ((NaturalRanking) createInstance("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        setField(mannWhitneyUTest, "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "naturalRanking", naturalRanking);
        double[] doubleArray = {2.0, 0.0};
        double[] doubleArray1 = {java.lang.Double.NaN};
        
        /* This test fails because method [org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyU] produces [java.lang.NullPointerException]
            org.apache.commons.math3.stat.ranking.NaturalRanking.rank(NaturalRanking.java:200)
            org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyU(MannWhitneyUTest.java:132) */
        mannWhitneyUTest.mannWhitneyU(doubleArray, doubleArray1);
    }
    
    @Test
    public void testMannWhitneyU7() throws Exception  {
        MannWhitneyUTest mannWhitneyUTest = ((MannWhitneyUTest) createInstance("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        NaturalRanking naturalRanking = ((NaturalRanking) createInstance("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        NaNStrategy nanStrategy = NaNStrategy.MINIMAL;
        setField(naturalRanking, "org.apache.commons.math3.stat.ranking.NaturalRanking", "nanStrategy", nanStrategy);
        setField(mannWhitneyUTest, "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "naturalRanking", naturalRanking);
        double[] doubleArray = {2.121995791E-314};
        double[] doubleArray1 = {2.121995791E-314};
        
        /* This test fails because method [org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyU] produces [java.lang.NullPointerException]
            org.apache.commons.math3.stat.ranking.NaturalRanking.resolveTie(NaturalRanking.java:334)
            org.apache.commons.math3.stat.ranking.NaturalRanking.rank(NaturalRanking.java:243)
            org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyU(MannWhitneyUTest.java:132) */
        mannWhitneyUTest.mannWhitneyU(doubleArray, doubleArray1);
    }
    
    @Test
    public void testMannWhitneyU8() throws Exception  {
        MannWhitneyUTest mannWhitneyUTest = ((MannWhitneyUTest) createInstance("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        NaturalRanking naturalRanking = ((NaturalRanking) createInstance("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        NaNStrategy nanStrategy = NaNStrategy.MAXIMAL;
        setField(naturalRanking, "org.apache.commons.math3.stat.ranking.NaturalRanking", "nanStrategy", nanStrategy);
        setField(mannWhitneyUTest, "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "naturalRanking", naturalRanking);
        double[] doubleArray = {java.lang.Double.NaN};
        double[] doubleArray1 = {java.lang.Double.POSITIVE_INFINITY};
        
        /* This test fails because method [org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyU] produces [java.lang.NullPointerException]
            org.apache.commons.math3.stat.ranking.NaturalRanking.resolveTie(NaturalRanking.java:334)
            org.apache.commons.math3.stat.ranking.NaturalRanking.rank(NaturalRanking.java:243)
            org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyU(MannWhitneyUTest.java:132) */
        mannWhitneyUTest.mannWhitneyU(doubleArray, doubleArray1);
    }
    
    @Test
    public void testMannWhitneyU9() throws Exception  {
        MannWhitneyUTest mannWhitneyUTest = ((MannWhitneyUTest) createInstance("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        NaturalRanking naturalRanking = ((NaturalRanking) createInstance("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        NaNStrategy nanStrategy = NaNStrategy.REMOVED;
        setField(naturalRanking, "org.apache.commons.math3.stat.ranking.NaturalRanking", "nanStrategy", nanStrategy);
        setField(mannWhitneyUTest, "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "naturalRanking", naturalRanking);
        double[] doubleArray = {0.0};
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyU] produces [java.lang.NullPointerException]
            org.apache.commons.math3.stat.ranking.NaturalRanking.resolveTie(NaturalRanking.java:334)
            org.apache.commons.math3.stat.ranking.NaturalRanking.rank(NaturalRanking.java:243)
            org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyU(MannWhitneyUTest.java:132) */
        mannWhitneyUTest.mannWhitneyU(doubleArray, doubleArray1);
    }
    
    @Test
    public void testMannWhitneyU10() throws Exception  {
        MannWhitneyUTest mannWhitneyUTest = ((MannWhitneyUTest) createInstance("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        NaturalRanking naturalRanking = ((NaturalRanking) createInstance("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        NaNStrategy nanStrategy = NaNStrategy.FIXED;
        setField(naturalRanking, "org.apache.commons.math3.stat.ranking.NaturalRanking", "nanStrategy", nanStrategy);
        setField(mannWhitneyUTest, "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "naturalRanking", naturalRanking);
        double[] doubleArray = {java.lang.Double.NaN};
        double[] doubleArray1 = {java.lang.Double.NaN};
        
        /* This test fails because method [org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyU] produces [java.lang.NullPointerException]
            org.apache.commons.math3.stat.ranking.NaturalRanking.resolveTie(NaturalRanking.java:334)
            org.apache.commons.math3.stat.ranking.NaturalRanking.rank(NaturalRanking.java:243)
            org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyU(MannWhitneyUTest.java:132) */
        mannWhitneyUTest.mannWhitneyU(doubleArray, doubleArray1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyUTest
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method mannWhitneyUTest([D, [D)
    
    /**
    @utbot.classUnderTest {@link MannWhitneyUTest}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.stat.inference.MannWhitneyUTest#mannWhitneyUTest(double[],double[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: ensureDataConformance(x, y);
 *  */
    @Test(expected = NoDataException.class)
    public void testMannWhitneyUTest_ThrowNoDataException() {
        MannWhitneyUTest mannWhitneyUTest = new MannWhitneyUTest();
        double[] doubleArray = {};
        double[] doubleArray1 = {0.0};
        
        mannWhitneyUTest.mannWhitneyUTest(doubleArray, doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link MannWhitneyUTest}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.stat.inference.MannWhitneyUTest#mannWhitneyUTest(double[],double[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: ensureDataConformance(x, y);
 *  */
    @Test(expected = NoDataException.class)
    public void testMannWhitneyUTest_ThrowNoDataException_1() {
        MannWhitneyUTest mannWhitneyUTest = new MannWhitneyUTest();
        double[] doubleArray = {0.0};
        double[] doubleArray1 = {};
        
        mannWhitneyUTest.mannWhitneyUTest(doubleArray, doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link MannWhitneyUTest}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.stat.inference.MannWhitneyUTest#mannWhitneyUTest(double[],double[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NullArgumentException} in: ensureDataConformance(x, y);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testMannWhitneyUTest_ThrowNullArgumentException() {
        MannWhitneyUTest mannWhitneyUTest = new MannWhitneyUTest();
        double[] doubleArray = {0.0};
        
        mannWhitneyUTest.mannWhitneyUTest(doubleArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link MannWhitneyUTest}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.stat.inference.MannWhitneyUTest#mannWhitneyUTest(double[],double[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NullArgumentException} in: ensureDataConformance(x, y);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testMannWhitneyUTest_ThrowNullArgumentException_1() {
        MannWhitneyUTest mannWhitneyUTest = new MannWhitneyUTest();
        
        mannWhitneyUTest.mannWhitneyUTest(null, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method mannWhitneyUTest([D, [D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.stat.inference.MannWhitneyUTest}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.stat.inference.MannWhitneyUTest#mannWhitneyUTest(double[],double[])}
     */
    @Test
    public void testMannWhitneyUTestWithNonEmptyPrimitiveArrays() {
        NaNStrategy naNStrategy = NaNStrategy.MAXIMAL;
        TiesStrategy tiesStrategy = TiesStrategy.MAXIMUM;
        MannWhitneyUTest mannWhitneyUTest = new MannWhitneyUTest(naNStrategy, tiesStrategy);
        double[] doubleArray = {java.lang.Double.NaN, 0.0, java.lang.Double.NEGATIVE_INFINITY};
        double[] doubleArray1 = {java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY};
        
        double actual = mannWhitneyUTest.mannWhitneyUTest(doubleArray, doubleArray1);
        
        assertEquals(0.8272593465627113, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method mannWhitneyUTest([D, [D)
    
    @Test
    public void testMannWhitneyUTest1() throws Exception  {
        MannWhitneyUTest mannWhitneyUTest = ((MannWhitneyUTest) createInstance("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        NaturalRanking naturalRanking = ((NaturalRanking) createInstance("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        NaNStrategy nanStrategy = NaNStrategy.REMOVED;
        setField(naturalRanking, "org.apache.commons.math3.stat.ranking.NaturalRanking", "nanStrategy", nanStrategy);
        setField(mannWhitneyUTest, "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "naturalRanking", naturalRanking);
        double[] doubleArray = {java.lang.Double.NaN};
        double[] doubleArray1 = {0.0};
        
        double actual = mannWhitneyUTest.mannWhitneyUTest(doubleArray, doubleArray1);
        
        assertEquals(0.31731050786291404, actual, 1.0E-6);
    }
    
    @Test
    public void testMannWhitneyUTest2() throws Exception  {
        MannWhitneyUTest mannWhitneyUTest = ((MannWhitneyUTest) createInstance("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        NaturalRanking naturalRanking = ((NaturalRanking) createInstance("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        NaNStrategy nanStrategy = NaNStrategy.MINIMAL;
        setField(naturalRanking, "org.apache.commons.math3.stat.ranking.NaturalRanking", "nanStrategy", nanStrategy);
        setField(mannWhitneyUTest, "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "naturalRanking", naturalRanking);
        double[] doubleArray = {4.144523E-317};
        double[] doubleArray1 = {java.lang.Double.NaN};
        
        double actual = mannWhitneyUTest.mannWhitneyUTest(doubleArray, doubleArray1);
        
        assertEquals(0.31731050786291404, actual, 1.0E-6);
    }
    
    @Test
    public void testMannWhitneyUTest3() throws Exception  {
        MannWhitneyUTest mannWhitneyUTest = ((MannWhitneyUTest) createInstance("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        NaturalRanking naturalRanking = ((NaturalRanking) createInstance("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        NaNStrategy nanStrategy = NaNStrategy.FIXED;
        setField(naturalRanking, "org.apache.commons.math3.stat.ranking.NaturalRanking", "nanStrategy", nanStrategy);
        setField(mannWhitneyUTest, "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "naturalRanking", naturalRanking);
        double[] doubleArray = {0.0};
        double[] doubleArray1 = {2.2250738585072014E-308};
        
        double actual = mannWhitneyUTest.mannWhitneyUTest(doubleArray, doubleArray1);
        
        assertEquals(0.31731050786291404, actual, 1.0E-6);
    }
    
    @Test
    public void testMannWhitneyUTest4() throws Exception  {
        MannWhitneyUTest mannWhitneyUTest = ((MannWhitneyUTest) createInstance("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        NaturalRanking naturalRanking = ((NaturalRanking) createInstance("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        NaNStrategy nanStrategy = NaNStrategy.FIXED;
        setField(naturalRanking, "org.apache.commons.math3.stat.ranking.NaturalRanking", "nanStrategy", nanStrategy);
        setField(mannWhitneyUTest, "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "naturalRanking", naturalRanking);
        double[] doubleArray = {java.lang.Double.NaN};
        double[] doubleArray1 = {2.172924726079E-311};
        
        double actual = mannWhitneyUTest.mannWhitneyUTest(doubleArray, doubleArray1);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    @Test
    public void testMannWhitneyUTest5() throws Exception  {
        MannWhitneyUTest mannWhitneyUTest = ((MannWhitneyUTest) createInstance("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        NaturalRanking naturalRanking = ((NaturalRanking) createInstance("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        NaNStrategy nanStrategy = NaNStrategy.REMOVED;
        setField(naturalRanking, "org.apache.commons.math3.stat.ranking.NaturalRanking", "nanStrategy", nanStrategy);
        setField(mannWhitneyUTest, "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "naturalRanking", naturalRanking);
        double[] doubleArray = {0.0};
        double[] doubleArray1 = {-2.225073858507202E-308};
        
        double actual = mannWhitneyUTest.mannWhitneyUTest(doubleArray, doubleArray1);
        
        assertEquals(0.31731050786291404, actual, 1.0E-6);
    }
    
    @Test
    public void testMannWhitneyUTest6() throws Exception  {
        MannWhitneyUTest mannWhitneyUTest = ((MannWhitneyUTest) createInstance("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        NaturalRanking naturalRanking = ((NaturalRanking) createInstance("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        NaNStrategy nanStrategy = NaNStrategy.MAXIMAL;
        setField(naturalRanking, "org.apache.commons.math3.stat.ranking.NaturalRanking", "nanStrategy", nanStrategy);
        setField(mannWhitneyUTest, "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "naturalRanking", naturalRanking);
        double[] doubleArray = {0.0};
        double[] doubleArray1 = {java.lang.Double.NaN};
        
        double actual = mannWhitneyUTest.mannWhitneyUTest(doubleArray, doubleArray1);
        
        assertEquals(0.31731050786291404, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method mannWhitneyUTest([D, [D)
    
    @Test
    public void testMannWhitneyUTest7() throws Exception  {
        MannWhitneyUTest mannWhitneyUTest = ((MannWhitneyUTest) createInstance("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        NaturalRanking naturalRanking = ((NaturalRanking) createInstance("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        NaNStrategy nanStrategy = NaNStrategy.REMOVED;
        setField(naturalRanking, "org.apache.commons.math3.stat.ranking.NaturalRanking", "nanStrategy", nanStrategy);
        setField(mannWhitneyUTest, "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "naturalRanking", naturalRanking);
        double[] doubleArray = {java.lang.Double.NaN};
        double[] doubleArray1 = {java.lang.Double.NaN};
        
        /* This test fails because method [org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyUTest] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.stat.ranking.NaturalRanking.rank(NaturalRanking.java:224)
            org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyU(MannWhitneyUTest.java:132)
            org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyUTest(MannWhitneyUTest.java:224) */
        mannWhitneyUTest.mannWhitneyUTest(doubleArray, doubleArray1);
    }
    
    @Test
    public void testMannWhitneyUTest8() throws Exception  {
        MannWhitneyUTest mannWhitneyUTest = ((MannWhitneyUTest) createInstance("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        NaturalRanking naturalRanking = ((NaturalRanking) createInstance("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        setField(mannWhitneyUTest, "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "naturalRanking", naturalRanking);
        double[] doubleArray = {0.0};
        double[] doubleArray1 = {4.9E-324, 2.0E-323, java.lang.Double.NaN, 0.0, 0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyUTest] produces [java.lang.NullPointerException]
            org.apache.commons.math3.stat.ranking.NaturalRanking.rank(NaturalRanking.java:200)
            org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyU(MannWhitneyUTest.java:132)
            org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyUTest(MannWhitneyUTest.java:224) */
        mannWhitneyUTest.mannWhitneyUTest(doubleArray, doubleArray1);
    }
    
    @Test
    public void testMannWhitneyUTest9() throws Exception  {
        MannWhitneyUTest mannWhitneyUTest = ((MannWhitneyUTest) createInstance("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        NaturalRanking naturalRanking = ((NaturalRanking) createInstance("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        NaNStrategy nanStrategy = NaNStrategy.MINIMAL;
        setField(naturalRanking, "org.apache.commons.math3.stat.ranking.NaturalRanking", "nanStrategy", nanStrategy);
        setField(mannWhitneyUTest, "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "naturalRanking", naturalRanking);
        double[] doubleArray = {java.lang.Double.NaN};
        double[] doubleArray1 = {java.lang.Double.NaN};
        
        /* This test fails because method [org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyUTest] produces [java.lang.NullPointerException]
            org.apache.commons.math3.stat.ranking.NaturalRanking.resolveTie(NaturalRanking.java:334)
            org.apache.commons.math3.stat.ranking.NaturalRanking.rank(NaturalRanking.java:243)
            org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyU(MannWhitneyUTest.java:132)
            org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyUTest(MannWhitneyUTest.java:224) */
        mannWhitneyUTest.mannWhitneyUTest(doubleArray, doubleArray1);
    }
    
    @Test
    public void testMannWhitneyUTest10() throws Exception  {
        MannWhitneyUTest mannWhitneyUTest = ((MannWhitneyUTest) createInstance("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        NaturalRanking naturalRanking = ((NaturalRanking) createInstance("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        NaNStrategy nanStrategy = NaNStrategy.MAXIMAL;
        setField(naturalRanking, "org.apache.commons.math3.stat.ranking.NaturalRanking", "nanStrategy", nanStrategy);
        setField(mannWhitneyUTest, "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "naturalRanking", naturalRanking);
        double[] doubleArray = {java.lang.Double.POSITIVE_INFINITY};
        double[] doubleArray1 = {java.lang.Double.NaN};
        
        /* This test fails because method [org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyUTest] produces [java.lang.NullPointerException]
            org.apache.commons.math3.stat.ranking.NaturalRanking.resolveTie(NaturalRanking.java:334)
            org.apache.commons.math3.stat.ranking.NaturalRanking.rank(NaturalRanking.java:243)
            org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyU(MannWhitneyUTest.java:132)
            org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyUTest(MannWhitneyUTest.java:224) */
        mannWhitneyUTest.mannWhitneyUTest(doubleArray, doubleArray1);
    }
    
    @Test
    public void testMannWhitneyUTest11() throws Exception  {
        MannWhitneyUTest mannWhitneyUTest = ((MannWhitneyUTest) createInstance("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        NaturalRanking naturalRanking = ((NaturalRanking) createInstance("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        NaNStrategy nanStrategy = NaNStrategy.FIXED;
        setField(naturalRanking, "org.apache.commons.math3.stat.ranking.NaturalRanking", "nanStrategy", nanStrategy);
        setField(mannWhitneyUTest, "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "naturalRanking", naturalRanking);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyUTest] produces [java.lang.NullPointerException]
            org.apache.commons.math3.stat.ranking.NaturalRanking.resolveTie(NaturalRanking.java:334)
            org.apache.commons.math3.stat.ranking.NaturalRanking.rank(NaturalRanking.java:243)
            org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyU(MannWhitneyUTest.java:132)
            org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyUTest(MannWhitneyUTest.java:224) */
        mannWhitneyUTest.mannWhitneyUTest(doubleArray, doubleArray);
    }
    
    @Test
    public void testMannWhitneyUTest12() throws Exception  {
        MannWhitneyUTest mannWhitneyUTest = ((MannWhitneyUTest) createInstance("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        NaturalRanking naturalRanking = ((NaturalRanking) createInstance("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        NaNStrategy nanStrategy = NaNStrategy.REMOVED;
        setField(naturalRanking, "org.apache.commons.math3.stat.ranking.NaturalRanking", "nanStrategy", nanStrategy);
        setField(mannWhitneyUTest, "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "naturalRanking", naturalRanking);
        double[] doubleArray = {3.39519326554E-313};
        double[] doubleArray1 = {3.39519326554E-313};
        
        /* This test fails because method [org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyUTest] produces [java.lang.NullPointerException]
            org.apache.commons.math3.stat.ranking.NaturalRanking.resolveTie(NaturalRanking.java:334)
            org.apache.commons.math3.stat.ranking.NaturalRanking.rank(NaturalRanking.java:243)
            org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyU(MannWhitneyUTest.java:132)
            org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyUTest(MannWhitneyUTest.java:224) */
        mannWhitneyUTest.mannWhitneyUTest(doubleArray, doubleArray1);
    }
    
    @Test
    public void testMannWhitneyUTest13() throws Exception  {
        MannWhitneyUTest mannWhitneyUTest = ((MannWhitneyUTest) createInstance("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        NaturalRanking naturalRanking = ((NaturalRanking) createInstance("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        NaNStrategy nanStrategy = NaNStrategy.FIXED;
        setField(naturalRanking, "org.apache.commons.math3.stat.ranking.NaturalRanking", "nanStrategy", nanStrategy);
        setField(mannWhitneyUTest, "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "naturalRanking", naturalRanking);
        double[] doubleArray = {java.lang.Double.NaN};
        double[] doubleArray1 = {java.lang.Double.NaN};
        
        /* This test fails because method [org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyUTest] produces [java.lang.NullPointerException]
            org.apache.commons.math3.stat.ranking.NaturalRanking.resolveTie(NaturalRanking.java:334)
            org.apache.commons.math3.stat.ranking.NaturalRanking.rank(NaturalRanking.java:243)
            org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyU(MannWhitneyUTest.java:132)
            org.apache.commons.math3.stat.inference.MannWhitneyUTest.mannWhitneyUTest(MannWhitneyUTest.java:224) */
        mannWhitneyUTest.mannWhitneyUTest(doubleArray, doubleArray1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.stat.inference.MannWhitneyUTest.concatenateSamples
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method concatenateSamples([D, [D)
    
    /**
    @utbot.classUnderTest {@link MannWhitneyUTest}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.stat.inference.MannWhitneyUTest#concatenateSamples(double[],double[])}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.returnsFrom {@code return z;}
 *  */
    @Test
    public void testConcatenateSamples_SystemArraycopy() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        MannWhitneyUTest mannWhitneyUTest = new MannWhitneyUTest();
        double[] doubleArray = {};
        double[] doubleArray1 = {};
        
        Class mannWhitneyUTestClazz = Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest");
        Class doubleArrayType = Class.forName("[D");
        Method concatenateSamplesMethod = mannWhitneyUTestClazz.getDeclaredMethod("concatenateSamples", doubleArrayType, doubleArrayType);
        concatenateSamplesMethod.setAccessible(true);
        java.lang.Object[] concatenateSamplesMethodArguments = new java.lang.Object[2];
        concatenateSamplesMethodArguments[0] = ((Object) doubleArray);
        concatenateSamplesMethodArguments[1] = ((Object) doubleArray1);
        double[] actual = ((double[]) concatenateSamplesMethod.invoke(mannWhitneyUTest, concatenateSamplesMethodArguments));
        
        double[] expected = {};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method concatenateSamples([D, [D)
    
    /**
    @utbot.classUnderTest {@link MannWhitneyUTest}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.stat.inference.MannWhitneyUTest#concatenateSamples(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double[] z = new double[x.length + y.length];
 *  */
    @Test
    public void testConcatenateSamples_ThrowNullPointerException_1() throws Throwable  {
        MannWhitneyUTest mannWhitneyUTest = new MannWhitneyUTest();
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.stat.inference.MannWhitneyUTest.concatenateSamples] produces [java.lang.NullPointerException]
            org.apache.commons.math3.stat.inference.MannWhitneyUTest.concatenateSamples(MannWhitneyUTest.java:90) */
        Class mannWhitneyUTestClazz = Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest");
        Class doubleArrayType = Class.forName("[D");
        Method concatenateSamplesMethod = mannWhitneyUTestClazz.getDeclaredMethod("concatenateSamples", doubleArrayType, doubleArrayType);
        concatenateSamplesMethod.setAccessible(true);
        java.lang.Object[] concatenateSamplesMethodArguments = new java.lang.Object[2];
        concatenateSamplesMethodArguments[0] = ((Object) doubleArray);
        concatenateSamplesMethodArguments[1] = ((Object) null);
        try {
            concatenateSamplesMethod.invoke(mannWhitneyUTest, concatenateSamplesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MannWhitneyUTest}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.stat.inference.MannWhitneyUTest#concatenateSamples(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double[] z = new double[x.length + y.length];
 *  */
    @Test
    public void testConcatenateSamples_ThrowNullPointerException() throws Throwable  {
        MannWhitneyUTest mannWhitneyUTest = new MannWhitneyUTest();
        
        /* This test fails because method [org.apache.commons.math3.stat.inference.MannWhitneyUTest.concatenateSamples] produces [java.lang.NullPointerException]
            org.apache.commons.math3.stat.inference.MannWhitneyUTest.concatenateSamples(MannWhitneyUTest.java:90) */
        Class mannWhitneyUTestClazz = Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest");
        Class doubleArrayType = Class.forName("[D");
        Method concatenateSamplesMethod = mannWhitneyUTestClazz.getDeclaredMethod("concatenateSamples", doubleArrayType, doubleArrayType);
        concatenateSamplesMethod.setAccessible(true);
        java.lang.Object[] concatenateSamplesMethodArguments = new java.lang.Object[2];
        concatenateSamplesMethodArguments[0] = ((Object) null);
        concatenateSamplesMethodArguments[1] = ((Object) null);
        try {
            concatenateSamplesMethod.invoke(mannWhitneyUTest, concatenateSamplesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
        
                java.lang.reflect.Method methodForGetDeclaredFields724290729083500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields724290729083500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass724290729091700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields724290729083500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass724290729091700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

