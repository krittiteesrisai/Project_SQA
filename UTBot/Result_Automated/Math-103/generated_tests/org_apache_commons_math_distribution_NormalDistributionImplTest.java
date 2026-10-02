package org.apache.commons.math.distribution;

import org.junit.Test;
import org.apache.commons.math.MathException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;

public final class org_apache_commons_math_distribution_NormalDistributionImplTest {
    ///region Test suites for executable org.apache.commons.math.distribution.NormalDistributionImpl.getMean
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMean()
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#getMean()}
 * @utbot.returnsFrom {@code return mean;}
 *  */
    @Test
    public void testGetMean_ReturnMean() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        normalDistributionImpl.setMean(0.0);
        
        double actual = normalDistributionImpl.getMean();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.distribution.NormalDistributionImpl.setMean
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setMean(double)
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#setMean(double)}
 *  */
    @Test
    public void testSetMean() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        normalDistributionImpl.setMean(0.0);
        
        normalDistributionImpl.setMean(java.lang.Double.NaN);
        
        double finalNormalDistributionImplMean = ((Double) getFieldValue(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "mean"));
        
        assertEquals(java.lang.Double.NaN, finalNormalDistributionImplMean, 1.0E-6);
    }
    ///endregion
    
    ///region FUZZER: TIMEOUTS for method setMean(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#setMean(double)}
     */
    @Test(timeout = 1000L)
    public void testSetMean1() {
        NormalDistributionImpl normalDistributionImpl = new NormalDistributionImpl();
        normalDistributionImpl.setMean(java.lang.Double.POSITIVE_INFINITY);
        normalDistributionImpl.setStandardDeviation(java.lang.Double.POSITIVE_INFINITY);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        normalDistributionImpl.setMean(-1.3310545804004066E269);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.distribution.NormalDistributionImpl.getInitialDomain
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInitialDomain(double)
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#getInitialDomain(double)}
 * @utbot.executesCondition {@code (p < .5): True}
 * @utbot.invokes {@link org.apache.commons.math.distribution.NormalDistributionImpl#getMean()}
 * @utbot.invokes {@link org.apache.commons.math.distribution.NormalDistributionImpl#getStandardDeviation()}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testGetInitialDomain_PLessThan0d() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        normalDistributionImpl.setMean(0.0);
        normalDistributionImpl.setStandardDeviation(0.0);
        
        double actual = normalDistributionImpl.getInitialDomain(4.9E-324);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#getInitialDomain(double)}
 * @utbot.executesCondition {@code (p < .5): False}
 * @utbot.executesCondition {@code (p > .5): True}
 * @utbot.invokes {@link org.apache.commons.math.distribution.NormalDistributionImpl#getMean()}
 * @utbot.invokes {@link org.apache.commons.math.distribution.NormalDistributionImpl#getStandardDeviation()}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testGetInitialDomain_PGreaterThan0d() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        normalDistributionImpl.setMean(0.0);
        normalDistributionImpl.setStandardDeviation(0.0);
        
        double actual = normalDistributionImpl.getInitialDomain(2.0000000000000004);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#getInitialDomain(double)}
 * @utbot.executesCondition {@code (p < .5): False}
 * @utbot.executesCondition {@code (p > .5): False}
 * @utbot.invokes {@link org.apache.commons.math.distribution.NormalDistributionImpl#getMean()}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testGetInitialDomain_PLessOrEqual0d() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        normalDistributionImpl.setMean(0.0);
        
        double actual = normalDistributionImpl.getInitialDomain(0.5);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.distribution.NormalDistributionImpl.setStandardDeviation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setStandardDeviation(double)
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#setStandardDeviation(double)}
 * @utbot.executesCondition {@code (sd <= 0.0): False}
 *  */
    @Test
    public void testSetStandardDeviation_SdGreaterThanZero() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        normalDistributionImpl.setStandardDeviation(0.0);
        
        normalDistributionImpl.setStandardDeviation(2.225073858507202E-308);
        
        double finalNormalDistributionImplStandardDeviation = ((Double) getFieldValue(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "standardDeviation"));
        
        assertEquals(2.225073858507202E-308, finalNormalDistributionImplStandardDeviation, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setStandardDeviation(double)
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#setStandardDeviation(double)}
 * @utbot.executesCondition {@code (sd <= 0.0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: sd <= 0.0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetStandardDeviation_ThrowIllegalArgumentException() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        
        normalDistributionImpl.setStandardDeviation(-0.0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.distribution.NormalDistributionImpl.getDomainLowerBound
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDomainLowerBound(double)
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#getDomainLowerBound(double)}
 * @utbot.executesCondition {@code (p < .5): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testGetDomainLowerBound_PLessThan0d() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        
        double actual = normalDistributionImpl.getDomainLowerBound(4.9E-324);
        
        assertEquals(-1.7976931348623157E308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#getDomainLowerBound(double)}
 * @utbot.executesCondition {@code (p < .5): False}
 * @utbot.invokes {@link org.apache.commons.math.distribution.NormalDistributionImpl#getMean()}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testGetDomainLowerBound_PGreaterOrEqual0d() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        normalDistributionImpl.setMean(0.0);
        
        double actual = normalDistributionImpl.getDomainLowerBound(0.5);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.distribution.NormalDistributionImpl.inverseCumulativeProbability
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inverseCumulativeProbability(double)
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#inverseCumulativeProbability(double)}
 * @utbot.executesCondition {@code (p == 0): True}
 * @utbot.returnsFrom {@code return Double.NEGATIVE_INFINITY;}
 *  */
    @Test
    public void testInverseCumulativeProbability_PEqualsZero() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        
        double actual = normalDistributionImpl.inverseCumulativeProbability(0.0);
        
        assertEquals(java.lang.Double.NEGATIVE_INFINITY, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#inverseCumulativeProbability(double)}
 * @utbot.executesCondition {@code (p == 0): False}
 * @utbot.executesCondition {@code (p == 1): True}
 * @utbot.returnsFrom {@code return Double.POSITIVE_INFINITY;}
 *  */
    @Test
    public void testInverseCumulativeProbability_PEquals1() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        
        double actual = normalDistributionImpl.inverseCumulativeProbability(1.0);
        
        assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method inverseCumulativeProbability(double)
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#inverseCumulativeProbability(double)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return super.inverseCumulativeProbability(p);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInverseCumulativeProbability_ThrowIllegalArgumentException() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        
        normalDistributionImpl.inverseCumulativeProbability(2.0000000000000004);
    }
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#inverseCumulativeProbability(double)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return super.inverseCumulativeProbability(p);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInverseCumulativeProbability_ThrowIllegalArgumentException_1() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        
        normalDistributionImpl.inverseCumulativeProbability(-2.225073858507202E-308);
    }
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#inverseCumulativeProbability(double)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return super.inverseCumulativeProbability(p);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInverseCumulativeProbability_ThrowIllegalArgumentException_2() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        normalDistributionImpl.setMean(java.lang.Double.POSITIVE_INFINITY);
        normalDistributionImpl.setStandardDeviation(-2.187336605866926E-303);
        
        normalDistributionImpl.inverseCumulativeProbability(0.5000000004656613);
    }
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#inverseCumulativeProbability(double)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return super.inverseCumulativeProbability(p);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInverseCumulativeProbability_ThrowIllegalArgumentException_3() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        normalDistributionImpl.setMean(33.00003053387627);
        normalDistributionImpl.setStandardDeviation(-4.936533895785032);
        
        normalDistributionImpl.inverseCumulativeProbability(0.75);
    }
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#inverseCumulativeProbability(double)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return super.inverseCumulativeProbability(p);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInverseCumulativeProbability_ThrowIllegalArgumentException_4() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        normalDistributionImpl.setMean(1.7976931348623157E308);
        
        normalDistributionImpl.inverseCumulativeProbability(0.5);
    }
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#inverseCumulativeProbability(double)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return super.inverseCumulativeProbability(p);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInverseCumulativeProbability_ThrowIllegalArgumentException_5() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        normalDistributionImpl.setMean(-1.7976931348623157E308);
        normalDistributionImpl.setStandardDeviation(-0.0);
        
        normalDistributionImpl.inverseCumulativeProbability(2.848094538889258E-306);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method inverseCumulativeProbability(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#inverseCumulativeProbability(double)}
     */
    @Test
    public void testInverseCumulativeProbability() throws MathException  {
        NormalDistributionImpl normalDistributionImpl = new NormalDistributionImpl();
        normalDistributionImpl.setMean(0.0);
        normalDistributionImpl.setStandardDeviation(java.lang.Double.NEGATIVE_INFINITY);
        
        double actual = normalDistributionImpl.inverseCumulativeProbability(0.251953125);
        
        assertEquals(-0.6683561963855529, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.distribution.NormalDistributionImpl.getDomainUpperBound
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDomainUpperBound(double)
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#getDomainUpperBound(double)}
 * @utbot.executesCondition {@code (p < .5): False}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testGetDomainUpperBound_PGreaterOrEqual0d() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        
        double actual = normalDistributionImpl.getDomainUpperBound(0.5);
        
        assertEquals(1.7976931348623157E308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#getDomainUpperBound(double)}
 * @utbot.executesCondition {@code (p < .5): True}
 * @utbot.invokes {@link org.apache.commons.math.distribution.NormalDistributionImpl#getMean()}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testGetDomainUpperBound_PLessThan0d() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        normalDistributionImpl.setMean(0.0);
        
        double actual = normalDistributionImpl.getDomainUpperBound(4.9E-324);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.distribution.NormalDistributionImpl.getStandardDeviation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getStandardDeviation()
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#getStandardDeviation()}
 * @utbot.returnsFrom {@code return standardDeviation;}
 *  */
    @Test
    public void testGetStandardDeviation_ReturnStandardDeviation() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        normalDistributionImpl.setStandardDeviation(0.0);
        
        double actual = normalDistributionImpl.getStandardDeviation();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.distribution.NormalDistributionImpl.cumulativeProbability
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method cumulativeProbability(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#cumulativeProbability(double)}
     */
    @Test
    public void testCumulativeProbabilityReturnsNan() throws MathException  {
        NormalDistributionImpl normalDistributionImpl = new NormalDistributionImpl();
        normalDistributionImpl.setMean(java.lang.Double.POSITIVE_INFINITY);
        normalDistributionImpl.setStandardDeviation(java.lang.Double.NaN);
        
        double actual = normalDistributionImpl.cumulativeProbability(2.015625);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields789033334158200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields789033334158200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass789033334165100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields789033334158200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass789033334165100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

