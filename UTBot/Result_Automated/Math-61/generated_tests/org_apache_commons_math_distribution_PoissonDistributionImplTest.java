package org.apache.commons.math.distribution;

import org.junit.Test;
import org.apache.commons.math.random.RandomDataImpl;
import org.apache.commons.math.exception.NotStrictlyPositiveException;
import org.apache.commons.math.MathException;
import org.apache.commons.math.random.Well512a;
import org.apache.commons.math.random.MersenneTwister;
import org.apache.commons.math.MaxIterationsExceededException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;

public final class org_apache_commons_math_distribution_PoissonDistributionImplTest {
    ///region Test suites for executable org.apache.commons.math.distribution.PoissonDistributionImpl.sample
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method sample()
    
    /**
    @utbot.classUnderTest {@link PoissonDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.PoissonDistributionImpl#sample()}
 * @utbot.invokes {@link org.apache.commons.math.random.RandomDataImpl#nextPoisson(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (int) FastMath.min(randomData.nextPoisson(mean), Integer.MAX_VALUE);
 *  */
    @Test
    public void testSample_ThrowNullPointerException() throws Exception  {
        PoissonDistributionImpl poissonDistributionImpl = ((PoissonDistributionImpl) createInstance("org.apache.commons.math.distribution.PoissonDistributionImpl"));
        setField(poissonDistributionImpl, "org.apache.commons.math.distribution.PoissonDistributionImpl", "mean", 0.0);
        
        /* This test fails because method [org.apache.commons.math.distribution.PoissonDistributionImpl.sample] produces [java.lang.NullPointerException]
            org.apache.commons.math.distribution.PoissonDistributionImpl.sample(PoissonDistributionImpl.java:213) */
        poissonDistributionImpl.sample();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method sample()
    
    /**
    @utbot.classUnderTest {@link PoissonDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.PoissonDistributionImpl#sample()}
 * @utbot.invokes {@link org.apache.commons.math.random.RandomDataImpl#nextPoisson(double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NotStrictlyPositiveException} in: return (int) FastMath.min(randomData.nextPoisson(mean), Integer.MAX_VALUE);
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testSample_ThrowNotStrictlyPositiveException() throws Exception  {
        PoissonDistributionImpl poissonDistributionImpl = ((PoissonDistributionImpl) createInstance("org.apache.commons.math.distribution.PoissonDistributionImpl"));
        setField(poissonDistributionImpl, "org.apache.commons.math.distribution.PoissonDistributionImpl", "mean", -0.0);
        RandomDataImpl randomData = ((RandomDataImpl) createInstance("org.apache.commons.math.random.RandomDataImpl"));
        setField(poissonDistributionImpl, "org.apache.commons.math.distribution.AbstractIntegerDistribution", "randomData", randomData);
        
        poissonDistributionImpl.sample();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method sample()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.distribution.PoissonDistributionImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.PoissonDistributionImpl#sample()}
     */
    @Test(expected = VerifyError.class)
    public void testSampleThrowsVE() throws MathException  {
        PoissonDistributionImpl poissonDistributionImpl = new PoissonDistributionImpl(1.2882297539194267E-231, -1.0, Integer.MAX_VALUE);
        
        poissonDistributionImpl.sample();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method sample()
    
    @Test(expected = StackOverflowError.class)
    public void testSample1() throws Exception  {
        Class mathUtilsClazz = Class.forName("org.apache.commons.math.util.MathUtils");
        long[] prevFACTORIALS = ((long[]) getStaticFieldValue(mathUtilsClazz, "FACTORIALS"));
        try {
            long[] factorials = new long[21];
            factorials[0] = 1L;
            factorials[1] = 1L;
            factorials[2] = 2L;
            factorials[3] = 6L;
            factorials[4] = 24L;
            factorials[5] = 120L;
            factorials[6] = 720L;
            factorials[7] = 5040L;
            factorials[8] = 40320L;
            factorials[9] = 362880L;
            factorials[10] = 3628800L;
            factorials[11] = 39916800L;
            factorials[12] = 479001600L;
            factorials[13] = 6227020800L;
            factorials[14] = 87178291200L;
            factorials[15] = 1307674368000L;
            factorials[16] = 20922789888000L;
            factorials[17] = 355687428096000L;
            factorials[18] = 6402373705728000L;
            factorials[19] = 121645100408832000L;
            factorials[20] = 2432902008176640000L;
            setStaticField(mathUtilsClazz, "FACTORIALS", factorials);
            PoissonDistributionImpl poissonDistributionImpl = ((PoissonDistributionImpl) createInstance("org.apache.commons.math.distribution.PoissonDistributionImpl"));
            setField(poissonDistributionImpl, "org.apache.commons.math.distribution.PoissonDistributionImpl", "mean", java.lang.Double.NaN);
            RandomDataImpl randomData = ((RandomDataImpl) createInstance("org.apache.commons.math.random.RandomDataImpl"));
            Well512a rand = ((Well512a) createInstance("org.apache.commons.math.random.Well512a"));
            setField(randomData, "org.apache.commons.math.random.RandomDataImpl", "rand", rand);
            setField(poissonDistributionImpl, "org.apache.commons.math.distribution.AbstractIntegerDistribution", "randomData", randomData);
            
            poissonDistributionImpl.sample();
        } finally {
            setStaticField(org.apache.commons.math.util.MathUtils.class, "FACTORIALS", prevFACTORIALS);
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method sample()
    
    @Test(timeout = 1000L)
    public void testSample2() throws Exception  {
        PoissonDistributionImpl poissonDistributionImpl = ((PoissonDistributionImpl) createInstance("org.apache.commons.math.distribution.PoissonDistributionImpl"));
        setField(poissonDistributionImpl, "org.apache.commons.math.distribution.PoissonDistributionImpl", "mean", 4.503599627370496E15);
        RandomDataImpl randomData = ((RandomDataImpl) createInstance("org.apache.commons.math.random.RandomDataImpl"));
        MersenneTwister rand = ((MersenneTwister) createInstance("org.apache.commons.math.random.MersenneTwister"));
        setField(randomData, "org.apache.commons.math.random.RandomDataImpl", "rand", rand);
        setField(poissonDistributionImpl, "org.apache.commons.math.distribution.AbstractIntegerDistribution", "randomData", randomData);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        poissonDistributionImpl.sample();
    }
    
    @Test(timeout = 1000L)
    public void testSample3() throws Exception  {
        PoissonDistributionImpl poissonDistributionImpl = ((PoissonDistributionImpl) createInstance("org.apache.commons.math.distribution.PoissonDistributionImpl"));
        setField(poissonDistributionImpl, "org.apache.commons.math.distribution.PoissonDistributionImpl", "mean", 5.497558139525E11);
        RandomDataImpl randomData = ((RandomDataImpl) createInstance("org.apache.commons.math.random.RandomDataImpl"));
        Well512a rand = ((Well512a) createInstance("org.apache.commons.math.random.Well512a"));
        setField(randomData, "org.apache.commons.math.random.RandomDataImpl", "rand", rand);
        setField(poissonDistributionImpl, "org.apache.commons.math.distribution.AbstractIntegerDistribution", "randomData", randomData);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        poissonDistributionImpl.sample();
    }
    
    @Test(timeout = 1000L)
    public void testSample4() throws Exception  {
        PoissonDistributionImpl poissonDistributionImpl = ((PoissonDistributionImpl) createInstance("org.apache.commons.math.distribution.PoissonDistributionImpl"));
        setField(poissonDistributionImpl, "org.apache.commons.math.distribution.PoissonDistributionImpl", "mean", java.lang.Double.POSITIVE_INFINITY);
        RandomDataImpl randomData = ((RandomDataImpl) createInstance("org.apache.commons.math.random.RandomDataImpl"));
        MersenneTwister rand = ((MersenneTwister) createInstance("org.apache.commons.math.random.MersenneTwister"));
        setField(randomData, "org.apache.commons.math.random.RandomDataImpl", "rand", rand);
        setField(poissonDistributionImpl, "org.apache.commons.math.distribution.AbstractIntegerDistribution", "randomData", randomData);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        poissonDistributionImpl.sample();
    }
    
    @Test(timeout = 1000L)
    public void testSample5() throws Exception  {
        PoissonDistributionImpl poissonDistributionImpl = ((PoissonDistributionImpl) createInstance("org.apache.commons.math.distribution.PoissonDistributionImpl"));
        setField(poissonDistributionImpl, "org.apache.commons.math.distribution.PoissonDistributionImpl", "mean", java.lang.Double.POSITIVE_INFINITY);
        RandomDataImpl randomData = ((RandomDataImpl) createInstance("org.apache.commons.math.random.RandomDataImpl"));
        Well512a rand = ((Well512a) createInstance("org.apache.commons.math.random.Well512a"));
        setField(randomData, "org.apache.commons.math.random.RandomDataImpl", "rand", rand);
        setField(poissonDistributionImpl, "org.apache.commons.math.distribution.AbstractIntegerDistribution", "randomData", randomData);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        poissonDistributionImpl.sample();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.distribution.PoissonDistributionImpl.getMean
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMean()
    
    /**
    @utbot.classUnderTest {@link PoissonDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.PoissonDistributionImpl#getMean()}
 * @utbot.returnsFrom {@code return mean;}
 *  */
    @Test
    public void testGetMean_ReturnMean() throws Exception  {
        PoissonDistributionImpl poissonDistributionImpl = ((PoissonDistributionImpl) createInstance("org.apache.commons.math.distribution.PoissonDistributionImpl"));
        setField(poissonDistributionImpl, "org.apache.commons.math.distribution.PoissonDistributionImpl", "mean", 0.0);
        
        double actual = poissonDistributionImpl.getMean();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.distribution.PoissonDistributionImpl.probability
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method probability(int)
    
    /**
    @utbot.classUnderTest {@link PoissonDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.PoissonDistributionImpl#probability(int)}
 * @utbot.executesCondition {@code (x < 0): False}
 * @utbot.executesCondition {@code (x == Integer.MAX_VALUE): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testProbability_XEqualsIntegerMAX_VALUE() throws Exception  {
        PoissonDistributionImpl poissonDistributionImpl = ((PoissonDistributionImpl) createInstance("org.apache.commons.math.distribution.PoissonDistributionImpl"));
        
        double actual = poissonDistributionImpl.probability(Integer.MAX_VALUE);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link PoissonDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.PoissonDistributionImpl#probability(int)}
 * @utbot.executesCondition {@code (x < 0): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testProbability_XLessThanZero() throws Exception  {
        PoissonDistributionImpl poissonDistributionImpl = ((PoissonDistributionImpl) createInstance("org.apache.commons.math.distribution.PoissonDistributionImpl"));
        
        double actual = poissonDistributionImpl.probability(-1);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link PoissonDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.PoissonDistributionImpl#probability(int)}
 * @utbot.executesCondition {@code (x < 0): False}
 * @utbot.executesCondition {@code (x == Integer.MAX_VALUE): False}
 * @utbot.executesCondition {@code (x == 0): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testProbability_XEqualsZero() throws Exception  {
        PoissonDistributionImpl poissonDistributionImpl = ((PoissonDistributionImpl) createInstance("org.apache.commons.math.distribution.PoissonDistributionImpl"));
        setField(poissonDistributionImpl, "org.apache.commons.math.distribution.PoissonDistributionImpl", "mean", java.lang.Double.NEGATIVE_INFINITY);
        
        double actual = poissonDistributionImpl.probability(0);
        
        assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link PoissonDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.PoissonDistributionImpl#probability(int)}
 * @utbot.executesCondition {@code (x < 0): False}
 * @utbot.executesCondition {@code (x == Integer.MAX_VALUE): False}
 * @utbot.executesCondition {@code (x == 0): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testProbability_XEqualsZero_1() throws Exception  {
        PoissonDistributionImpl poissonDistributionImpl = ((PoissonDistributionImpl) createInstance("org.apache.commons.math.distribution.PoissonDistributionImpl"));
        setField(poissonDistributionImpl, "org.apache.commons.math.distribution.PoissonDistributionImpl", "mean", 747.0);
        
        double actual = poissonDistributionImpl.probability(0);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.distribution.PoissonDistributionImpl.cumulativeProbability
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method cumulativeProbability(int)
    
    /**
    @utbot.classUnderTest {@link PoissonDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.PoissonDistributionImpl#cumulativeProbability(int)}
 * @utbot.executesCondition {@code (x < 0): True}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testCumulativeProbability_XLessThanZero() throws Exception  {
        PoissonDistributionImpl poissonDistributionImpl = ((PoissonDistributionImpl) createInstance("org.apache.commons.math.distribution.PoissonDistributionImpl"));
        
        double actual = poissonDistributionImpl.cumulativeProbability(-1);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link PoissonDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.PoissonDistributionImpl#cumulativeProbability(int)}
 * @utbot.executesCondition {@code (x < 0): False}
 * @utbot.executesCondition {@code (x == Integer.MAX_VALUE): True}
 * @utbot.returnsFrom {@code return 1;}
 *  */
    @Test
    public void testCumulativeProbability_XEqualsIntegerMAX_VALUE() throws Exception  {
        PoissonDistributionImpl poissonDistributionImpl = ((PoissonDistributionImpl) createInstance("org.apache.commons.math.distribution.PoissonDistributionImpl"));
        
        double actual = poissonDistributionImpl.cumulativeProbability(Integer.MAX_VALUE);
        
        assertEquals(1.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link PoissonDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.PoissonDistributionImpl#cumulativeProbability(int)}
 * @utbot.executesCondition {@code (x < 0): False}
 * @utbot.executesCondition {@code (x == Integer.MAX_VALUE): False}
 * @utbot.returnsFrom {@code return Gamma.regularizedGammaQ((double) x + 1, mean, epsilon, maxIterations);}
 *  */
    @Test
    public void testCumulativeProbability_XNotEqualsIntegerMAX_VALUE() throws Exception  {
        PoissonDistributionImpl poissonDistributionImpl = ((PoissonDistributionImpl) createInstance("org.apache.commons.math.distribution.PoissonDistributionImpl"));
        setField(poissonDistributionImpl, "org.apache.commons.math.distribution.PoissonDistributionImpl", "mean", java.lang.Double.NaN);
        setField(poissonDistributionImpl, "org.apache.commons.math.distribution.PoissonDistributionImpl", "maxIterations", -255);
        setField(poissonDistributionImpl, "org.apache.commons.math.distribution.PoissonDistributionImpl", "epsilon", 0.0);
        
        double actual = poissonDistributionImpl.cumulativeProbability(0);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link PoissonDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.PoissonDistributionImpl#cumulativeProbability(int)}
 * @utbot.executesCondition {@code (x < 0): False}
 * @utbot.executesCondition {@code (x == Integer.MAX_VALUE): False}
 * @utbot.returnsFrom {@code return Gamma.regularizedGammaQ((double) x + 1, mean, epsilon, maxIterations);}
 *  */
    @Test
    public void testCumulativeProbability_XNotEqualsIntegerMAX_VALUE_1() throws Exception  {
        PoissonDistributionImpl poissonDistributionImpl = ((PoissonDistributionImpl) createInstance("org.apache.commons.math.distribution.PoissonDistributionImpl"));
        setField(poissonDistributionImpl, "org.apache.commons.math.distribution.PoissonDistributionImpl", "mean", -2.225073858507202E-308);
        setField(poissonDistributionImpl, "org.apache.commons.math.distribution.PoissonDistributionImpl", "maxIterations", -255);
        setField(poissonDistributionImpl, "org.apache.commons.math.distribution.PoissonDistributionImpl", "epsilon", 0.0);
        
        double actual = poissonDistributionImpl.cumulativeProbability(0);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method cumulativeProbability(int)
    
    /**
    @utbot.classUnderTest {@link PoissonDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.PoissonDistributionImpl#cumulativeProbability(int)}
 * @utbot.executesCondition {@code (x < 0): False}
 * @utbot.executesCondition {@code (x == Integer.MAX_VALUE): False}
 * @utbot.invokes {@link org.apache.commons.math.special.Gamma#regularizedGammaQ(double,double,double,int)}
 * @utbot.throwsException {@link org.apache.commons.math.MaxIterationsExceededException} in: return Gamma.regularizedGammaQ((double) x + 1, mean, epsilon, maxIterations);
 *  */
    @Test(expected = MaxIterationsExceededException.class)
    public void testCumulativeProbability_ThrowMaxIterationsExceededException() throws Exception  {
        PoissonDistributionImpl poissonDistributionImpl = ((PoissonDistributionImpl) createInstance("org.apache.commons.math.distribution.PoissonDistributionImpl"));
        setField(poissonDistributionImpl, "org.apache.commons.math.distribution.PoissonDistributionImpl", "mean", 2.0);
        setField(poissonDistributionImpl, "org.apache.commons.math.distribution.PoissonDistributionImpl", "epsilon", 0.0);
        
        poissonDistributionImpl.cumulativeProbability(0);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method cumulativeProbability(int)
    
    @Test
    public void testCumulativeProbability1() throws Exception  {
        PoissonDistributionImpl poissonDistributionImpl = ((PoissonDistributionImpl) createInstance("org.apache.commons.math.distribution.PoissonDistributionImpl"));
        setField(poissonDistributionImpl, "org.apache.commons.math.distribution.PoissonDistributionImpl", "mean", 7.351590266775795E190);
        setField(poissonDistributionImpl, "org.apache.commons.math.distribution.PoissonDistributionImpl", "maxIterations", 1);
        setField(poissonDistributionImpl, "org.apache.commons.math.distribution.PoissonDistributionImpl", "epsilon", java.lang.Double.NaN);
        
        double actual = poissonDistributionImpl.cumulativeProbability(117964811);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.distribution.PoissonDistributionImpl.getDomainLowerBound
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDomainLowerBound(double)
    
    /**
    @utbot.classUnderTest {@link PoissonDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.PoissonDistributionImpl#getDomainLowerBound(double)}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testGetDomainLowerBound_ReturnZero() throws Exception  {
        PoissonDistributionImpl poissonDistributionImpl = ((PoissonDistributionImpl) createInstance("org.apache.commons.math.distribution.PoissonDistributionImpl"));
        
        int actual = poissonDistributionImpl.getDomainLowerBound(java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.distribution.PoissonDistributionImpl.getDomainUpperBound
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDomainUpperBound(double)
    
    /**
    @utbot.classUnderTest {@link PoissonDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.PoissonDistributionImpl#getDomainUpperBound(double)}
 * @utbot.returnsFrom {@code return Integer.MAX_VALUE;}
 *  */
    @Test
    public void testGetDomainUpperBound_ReturnIntegerMAX_VALUE() throws Exception  {
        PoissonDistributionImpl poissonDistributionImpl = ((PoissonDistributionImpl) createInstance("org.apache.commons.math.distribution.PoissonDistributionImpl"));
        
        int actual = poissonDistributionImpl.getDomainUpperBound(java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(Integer.MAX_VALUE, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.distribution.PoissonDistributionImpl.normalApproximateProbability
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method normalApproximateProbability(int)
    
    /**
    @utbot.classUnderTest {@link PoissonDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.PoissonDistributionImpl#normalApproximateProbability(int)}
 * @utbot.invokes {@link org.apache.commons.math.distribution.NormalDistribution#cumulativeProbability(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return normal.cumulativeProbability(x + 0.5);
 *  */
    @Test
    public void testNormalApproximateProbability_ThrowNullPointerException() throws Exception  {
        PoissonDistributionImpl poissonDistributionImpl = ((PoissonDistributionImpl) createInstance("org.apache.commons.math.distribution.PoissonDistributionImpl"));
        
        /* This test fails because method [org.apache.commons.math.distribution.PoissonDistributionImpl.normalApproximateProbability] produces [java.lang.NullPointerException]
            org.apache.commons.math.distribution.PoissonDistributionImpl.normalApproximateProbability(PoissonDistributionImpl.java:191) */
        poissonDistributionImpl.normalApproximateProbability(-255);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields736158375521800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields736158375521800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass736158375529300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields736158375521800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass736158375529300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields736158375957800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields736158375957800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass736158375960400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields736158375957800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass736158375960400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields736158376637300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields736158376637300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass736158376640400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields736158376637300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass736158376640400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

