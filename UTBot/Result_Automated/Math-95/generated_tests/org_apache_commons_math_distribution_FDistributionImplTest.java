package org.apache.commons.math.distribution;

import org.junit.Test;
import org.apache.commons.math.MathException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;

public final class org_apache_commons_math_distribution_FDistributionImplTest {
    ///region Test suites for executable org.apache.commons.math.distribution.FDistributionImpl.setNumeratorDegreesOfFreedom
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setNumeratorDegreesOfFreedom(double)
    
    /**
    @utbot.classUnderTest {@link FDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.FDistributionImpl#setNumeratorDegreesOfFreedom(double)}
 * @utbot.executesCondition {@code (degreesOfFreedom <= 0.0): False}
 *  */
    @Test
    public void testSetNumeratorDegreesOfFreedom_DegreesOfFreedomGreaterThanZero() throws Exception  {
        FDistributionImpl fDistributionImpl = ((FDistributionImpl) createInstance("org.apache.commons.math.distribution.FDistributionImpl"));
        fDistributionImpl.setNumeratorDegreesOfFreedom(0.0);
        
        fDistributionImpl.setNumeratorDegreesOfFreedom(2.225073858507202E-308);
        
        double finalFDistributionImplNumeratorDegreesOfFreedom = ((Double) getFieldValue(fDistributionImpl, "org.apache.commons.math.distribution.FDistributionImpl", "numeratorDegreesOfFreedom"));
        
        assertEquals(2.225073858507202E-308, finalFDistributionImplNumeratorDegreesOfFreedom, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setNumeratorDegreesOfFreedom(double)
    
    /**
    @utbot.classUnderTest {@link FDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.FDistributionImpl#setNumeratorDegreesOfFreedom(double)}
 * @utbot.executesCondition {@code (degreesOfFreedom <= 0.0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: degreesOfFreedom <= 0.0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetNumeratorDegreesOfFreedom_ThrowIllegalArgumentException() throws Exception  {
        FDistributionImpl fDistributionImpl = ((FDistributionImpl) createInstance("org.apache.commons.math.distribution.FDistributionImpl"));
        
        fDistributionImpl.setNumeratorDegreesOfFreedom(-0.0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.distribution.FDistributionImpl.cumulativeProbability
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method cumulativeProbability(double)
    
    /**
    @utbot.classUnderTest {@link FDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.FDistributionImpl#cumulativeProbability(double)}
 * @utbot.executesCondition {@code (x <= 0.0): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testCumulativeProbability_XLessOrEqualZero() throws Exception  {
        FDistributionImpl fDistributionImpl = ((FDistributionImpl) createInstance("org.apache.commons.math.distribution.FDistributionImpl"));
        
        double actual = fDistributionImpl.cumulativeProbability(-0.0);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method cumulativeProbability(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.distribution.FDistributionImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.FDistributionImpl#cumulativeProbability(double)}
     */
    @Test
    public void testCumulativeProbabilityReturnsNan() throws MathException  {
        FDistributionImpl fDistributionImpl = new FDistributionImpl(1.0, java.lang.Double.POSITIVE_INFINITY);
        fDistributionImpl.setNumeratorDegreesOfFreedom(java.lang.Double.NaN);
        fDistributionImpl.setDenominatorDegreesOfFreedom(java.lang.Double.NaN);
        
        double actual = fDistributionImpl.cumulativeProbability(7.2911220195563975E-304);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.distribution.FDistributionImpl.getDomainLowerBound
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDomainLowerBound(double)
    
    /**
    @utbot.classUnderTest {@link FDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.FDistributionImpl#getDomainLowerBound(double)}
 * @utbot.returnsFrom {@code return 0.0;}
 *  */
    @Test
    public void testGetDomainLowerBound_ReturnZero() throws Exception  {
        FDistributionImpl fDistributionImpl = ((FDistributionImpl) createInstance("org.apache.commons.math.distribution.FDistributionImpl"));
        
        double actual = fDistributionImpl.getDomainLowerBound(java.lang.Double.NaN);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.distribution.FDistributionImpl.getDomainUpperBound
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDomainUpperBound(double)
    
    /**
    @utbot.classUnderTest {@link FDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.FDistributionImpl#getDomainUpperBound(double)}
 * @utbot.returnsFrom {@code return Double.MAX_VALUE;}
 *  */
    @Test
    public void testGetDomainUpperBound_ReturnDoubleMAX_VALUE() throws Exception  {
        FDistributionImpl fDistributionImpl = ((FDistributionImpl) createInstance("org.apache.commons.math.distribution.FDistributionImpl"));
        
        double actual = fDistributionImpl.getDomainUpperBound(java.lang.Double.NaN);
        
        assertEquals(1.7976931348623157E308, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.distribution.FDistributionImpl.getNumeratorDegreesOfFreedom
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNumeratorDegreesOfFreedom()
    
    /**
    @utbot.classUnderTest {@link FDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.FDistributionImpl#getNumeratorDegreesOfFreedom()}
 * @utbot.returnsFrom {@code return numeratorDegreesOfFreedom;}
 *  */
    @Test
    public void testGetNumeratorDegreesOfFreedom_ReturnNumeratorDegreesOfFreedom() throws Exception  {
        FDistributionImpl fDistributionImpl = ((FDistributionImpl) createInstance("org.apache.commons.math.distribution.FDistributionImpl"));
        fDistributionImpl.setNumeratorDegreesOfFreedom(0.0);
        
        double actual = fDistributionImpl.getNumeratorDegreesOfFreedom();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.distribution.FDistributionImpl.getDenominatorDegreesOfFreedom
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDenominatorDegreesOfFreedom()
    
    /**
    @utbot.classUnderTest {@link FDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.FDistributionImpl#getDenominatorDegreesOfFreedom()}
 * @utbot.returnsFrom {@code return denominatorDegreesOfFreedom;}
 *  */
    @Test
    public void testGetDenominatorDegreesOfFreedom_ReturnDenominatorDegreesOfFreedom() throws Exception  {
        FDistributionImpl fDistributionImpl = ((FDistributionImpl) createInstance("org.apache.commons.math.distribution.FDistributionImpl"));
        fDistributionImpl.setDenominatorDegreesOfFreedom(0.0);
        
        double actual = fDistributionImpl.getDenominatorDegreesOfFreedom();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.distribution.FDistributionImpl.inverseCumulativeProbability
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inverseCumulativeProbability(double)
    
    /**
    @utbot.classUnderTest {@link FDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.FDistributionImpl#inverseCumulativeProbability(double)}
 * @utbot.executesCondition {@code (p == 0): True}
 * @utbot.returnsFrom {@code return 0d;}
 *  */
    @Test
    public void testInverseCumulativeProbability_PEqualsZero() throws Exception  {
        FDistributionImpl fDistributionImpl = ((FDistributionImpl) createInstance("org.apache.commons.math.distribution.FDistributionImpl"));
        
        double actual = fDistributionImpl.inverseCumulativeProbability(0.0);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.FDistributionImpl#inverseCumulativeProbability(double)}
 * @utbot.executesCondition {@code (p == 0): False}
 * @utbot.executesCondition {@code (p == 1): True}
 * @utbot.returnsFrom {@code return Double.POSITIVE_INFINITY;}
 *  */
    @Test
    public void testInverseCumulativeProbability_PEquals1() throws Exception  {
        FDistributionImpl fDistributionImpl = ((FDistributionImpl) createInstance("org.apache.commons.math.distribution.FDistributionImpl"));
        
        double actual = fDistributionImpl.inverseCumulativeProbability(1.0);
        
        assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method inverseCumulativeProbability(double)
    
    /**
    @utbot.classUnderTest {@link FDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.FDistributionImpl#inverseCumulativeProbability(double)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return super.inverseCumulativeProbability(p);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInverseCumulativeProbability_ThrowIllegalArgumentException() throws Exception  {
        FDistributionImpl fDistributionImpl = ((FDistributionImpl) createInstance("org.apache.commons.math.distribution.FDistributionImpl"));
        
        fDistributionImpl.inverseCumulativeProbability(2.0000000000000004);
    }
    
    /**
    @utbot.classUnderTest {@link FDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.FDistributionImpl#inverseCumulativeProbability(double)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return super.inverseCumulativeProbability(p);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInverseCumulativeProbability_ThrowIllegalArgumentException_1() throws Exception  {
        FDistributionImpl fDistributionImpl = ((FDistributionImpl) createInstance("org.apache.commons.math.distribution.FDistributionImpl"));
        
        fDistributionImpl.inverseCumulativeProbability(-2.225073858507202E-308);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method inverseCumulativeProbability(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.distribution.FDistributionImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.FDistributionImpl#inverseCumulativeProbability(double)}
     */
    @Test
    public void testInverseCumulativeProbabilityReturnsNan() throws MathException  {
        FDistributionImpl fDistributionImpl = new FDistributionImpl(1.0, java.lang.Double.POSITIVE_INFINITY);
        fDistributionImpl.setNumeratorDegreesOfFreedom(java.lang.Double.NaN);
        fDistributionImpl.setDenominatorDegreesOfFreedom(java.lang.Double.NaN);
        
        double actual = fDistributionImpl.inverseCumulativeProbability(7.2911220195563975E-304);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.distribution.FDistributionImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.FDistributionImpl#inverseCumulativeProbability(double)}
     */
    @Test
    public void testInverseCumulativeProbabilityReturnsNan1() throws MathException  {
        FDistributionImpl fDistributionImpl = new FDistributionImpl(1.0, java.lang.Double.POSITIVE_INFINITY);
        fDistributionImpl.setNumeratorDegreesOfFreedom(java.lang.Double.NaN);
        fDistributionImpl.setDenominatorDegreesOfFreedom(java.lang.Double.POSITIVE_INFINITY);
        
        double actual = fDistributionImpl.inverseCumulativeProbability(7.2911220195563975E-304);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.distribution.FDistributionImpl.setDenominatorDegreesOfFreedom
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDenominatorDegreesOfFreedom(double)
    
    /**
    @utbot.classUnderTest {@link FDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.FDistributionImpl#setDenominatorDegreesOfFreedom(double)}
 * @utbot.executesCondition {@code (degreesOfFreedom <= 0.0): False}
 *  */
    @Test
    public void testSetDenominatorDegreesOfFreedom_DegreesOfFreedomGreaterThanZero() throws Exception  {
        FDistributionImpl fDistributionImpl = ((FDistributionImpl) createInstance("org.apache.commons.math.distribution.FDistributionImpl"));
        fDistributionImpl.setDenominatorDegreesOfFreedom(0.0);
        
        fDistributionImpl.setDenominatorDegreesOfFreedom(2.225073858507202E-308);
        
        double finalFDistributionImplDenominatorDegreesOfFreedom = ((Double) getFieldValue(fDistributionImpl, "org.apache.commons.math.distribution.FDistributionImpl", "denominatorDegreesOfFreedom"));
        
        assertEquals(2.225073858507202E-308, finalFDistributionImplDenominatorDegreesOfFreedom, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setDenominatorDegreesOfFreedom(double)
    
    /**
    @utbot.classUnderTest {@link FDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.FDistributionImpl#setDenominatorDegreesOfFreedom(double)}
 * @utbot.executesCondition {@code (degreesOfFreedom <= 0.0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: degreesOfFreedom <= 0.0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDenominatorDegreesOfFreedom_ThrowIllegalArgumentException() throws Exception  {
        FDistributionImpl fDistributionImpl = ((FDistributionImpl) createInstance("org.apache.commons.math.distribution.FDistributionImpl"));
        
        fDistributionImpl.setDenominatorDegreesOfFreedom(-0.0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.distribution.FDistributionImpl.getInitialDomain
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInitialDomain(double)
    
    /**
    @utbot.classUnderTest {@link FDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.FDistributionImpl#getInitialDomain(double)}
 * @utbot.invokes {@link org.apache.commons.math.distribution.FDistributionImpl#getDenominatorDegreesOfFreedom()}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testGetInitialDomain_FDistributionImplGetDenominatorDegreesOfFreedom() throws Exception  {
        FDistributionImpl fDistributionImpl = ((FDistributionImpl) createInstance("org.apache.commons.math.distribution.FDistributionImpl"));
        fDistributionImpl.setDenominatorDegreesOfFreedom(java.lang.Double.NaN);
        
        double actual = fDistributionImpl.getInitialDomain(java.lang.Double.NaN);
        
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
        
            java.lang.reflect.Method methodForGetDeclaredFields787661513324900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields787661513324900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass787661513333400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields787661513324900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass787661513333400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

