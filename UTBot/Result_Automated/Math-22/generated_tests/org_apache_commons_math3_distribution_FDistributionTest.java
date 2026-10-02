package org.apache.commons.math3.distribution;

import org.junit.Test;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public final class org_apache_commons_math3_distribution_FDistributionTest {
    ///region Test suites for executable org.apache.commons.math3.distribution.FDistribution.isSupportLowerBoundInclusive
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSupportLowerBoundInclusive()
    
    /**
    @utbot.classUnderTest {@link FDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.FDistribution#isSupportLowerBoundInclusive()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSupportLowerBoundInclusive_ReturnTrue() throws Exception  {
        FDistribution fDistribution = ((FDistribution) createInstance("org.apache.commons.math3.distribution.FDistribution"));
        
        boolean actual = fDistribution.isSupportLowerBoundInclusive();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.FDistribution.isSupportUpperBoundInclusive
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSupportUpperBoundInclusive()
    
    /**
    @utbot.classUnderTest {@link FDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.FDistribution#isSupportUpperBoundInclusive()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsSupportUpperBoundInclusive_ReturnFalse() throws Exception  {
        FDistribution fDistribution = ((FDistribution) createInstance("org.apache.commons.math3.distribution.FDistribution"));
        
        boolean actual = fDistribution.isSupportUpperBoundInclusive();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.FDistribution.getNumericalVariance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNumericalVariance()
    
    /**
    @utbot.classUnderTest {@link FDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.FDistribution#getNumericalVariance()}
 * @utbot.executesCondition {@code (!numericalVarianceIsCalculated): True}
 * @utbot.returnsFrom {@code return numericalVariance;}
 *  */
    @Test
    public void testGetNumericalVariance_NotNumericalVarianceIsCalculated() throws Exception  {
        FDistribution fDistribution = ((FDistribution) createInstance("org.apache.commons.math3.distribution.FDistribution"));
        setField(fDistribution, "org.apache.commons.math3.distribution.FDistribution", "numeratorDegreesOfFreedom", 0.0);
        setField(fDistribution, "org.apache.commons.math3.distribution.FDistribution", "denominatorDegreesOfFreedom", 2.68156158598852E154);
        setField(fDistribution, "org.apache.commons.math3.distribution.FDistribution", "numericalVariance", 0.0);
        
        double actual = fDistribution.getNumericalVariance();
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
        
        double finalFDistributionNumericalVariance = ((Double) getFieldValue(fDistribution, "org.apache.commons.math3.distribution.FDistribution", "numericalVariance"));
        boolean finalFDistributionNumericalVarianceIsCalculated = ((Boolean) getFieldValue(fDistribution, "org.apache.commons.math3.distribution.FDistribution", "numericalVarianceIsCalculated"));
        
        assertEquals(java.lang.Double.NaN, finalFDistributionNumericalVariance, 1.0E-6);
        
        assertTrue(finalFDistributionNumericalVarianceIsCalculated);
    }
    
    /**
    @utbot.classUnderTest {@link FDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.FDistribution#getNumericalVariance()}
 * @utbot.executesCondition {@code (!numericalVarianceIsCalculated): False}
 * @utbot.returnsFrom {@code return numericalVariance;}
 *  */
    @Test
    public void testGetNumericalVariance_NumericalVarianceIsCalculated() throws Exception  {
        FDistribution fDistribution = ((FDistribution) createInstance("org.apache.commons.math3.distribution.FDistribution"));
        setField(fDistribution, "org.apache.commons.math3.distribution.FDistribution", "numericalVariance", java.lang.Double.NaN);
        setField(fDistribution, "org.apache.commons.math3.distribution.FDistribution", "numericalVarianceIsCalculated", true);
        
        double actual = fDistribution.getNumericalVariance();
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.FDistribution#getNumericalVariance()}
 * @utbot.executesCondition {@code (!numericalVarianceIsCalculated): True}
 * @utbot.returnsFrom {@code return numericalVariance;}
 *  */
    @Test
    public void testGetNumericalVariance_NotNumericalVarianceIsCalculated_1() throws Exception  {
        FDistribution fDistribution = ((FDistribution) createInstance("org.apache.commons.math3.distribution.FDistribution"));
        setField(fDistribution, "org.apache.commons.math3.distribution.FDistribution", "denominatorDegreesOfFreedom", 4.0);
        setField(fDistribution, "org.apache.commons.math3.distribution.FDistribution", "numericalVariance", 0.0);
        
        double actual = fDistribution.getNumericalVariance();
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
        
        double finalFDistributionNumericalVariance = ((Double) getFieldValue(fDistribution, "org.apache.commons.math3.distribution.FDistribution", "numericalVariance"));
        boolean finalFDistributionNumericalVarianceIsCalculated = ((Boolean) getFieldValue(fDistribution, "org.apache.commons.math3.distribution.FDistribution", "numericalVarianceIsCalculated"));
        
        assertEquals(java.lang.Double.NaN, finalFDistributionNumericalVariance, 1.0E-6);
        
        assertTrue(finalFDistributionNumericalVarianceIsCalculated);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.FDistribution.getSupportLowerBound
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSupportLowerBound()
    
    /**
    @utbot.classUnderTest {@link FDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.FDistribution#getSupportLowerBound()}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testGetSupportLowerBound_ReturnZero() throws Exception  {
        FDistribution fDistribution = ((FDistribution) createInstance("org.apache.commons.math3.distribution.FDistribution"));
        
        double actual = fDistribution.getSupportLowerBound();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.FDistribution.getSupportUpperBound
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSupportUpperBound()
    
    /**
    @utbot.classUnderTest {@link FDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.FDistribution#getSupportUpperBound()}
 * @utbot.returnsFrom {@code return Double.POSITIVE_INFINITY;}
 *  */
    @Test
    public void testGetSupportUpperBound_ReturnDoublePOSITIVE_INFINITY() throws Exception  {
        FDistribution fDistribution = ((FDistribution) createInstance("org.apache.commons.math3.distribution.FDistribution"));
        
        double actual = fDistribution.getSupportUpperBound();
        
        assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.FDistribution.cumulativeProbability
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method cumulativeProbability(double)
    
    /**
    @utbot.classUnderTest {@link FDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.FDistribution#cumulativeProbability(double)}
 * @utbot.executesCondition {@code (x <= 0): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testCumulativeProbability_XLessOrEqualZero() throws Exception  {
        FDistribution fDistribution = ((FDistribution) createInstance("org.apache.commons.math3.distribution.FDistribution"));
        
        double actual = fDistribution.cumulativeProbability(-0.0);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method cumulativeProbability(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.distribution.FDistribution}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.FDistribution#cumulativeProbability(double)}
     */
    @Test
    public void testCumulativeProbabilityReturnsNan() {
        FDistribution fDistribution = new FDistribution(java.lang.Double.POSITIVE_INFINITY, 0.5, 0.5);
        
        double actual = fDistribution.cumulativeProbability(5.2829453113566525E269);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.distribution.FDistribution}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.FDistribution#cumulativeProbability(double)}
     */
    @Test
    public void testCumulativeProbability() {
        FDistribution fDistribution = new FDistribution(1.0, 0.5, java.lang.Double.POSITIVE_INFINITY);
        
        double actual = fDistribution.cumulativeProbability(1.112570881186256E-308);
        
        assertEquals(5.689009017647908E-155, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.FDistribution.calculateNumericalVariance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method calculateNumericalVariance()
    
    /**
    @utbot.classUnderTest {@link FDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.FDistribution#calculateNumericalVariance()}
 * @utbot.executesCondition {@code (denominatorDF > 4): True}
 * @utbot.invokes {@link org.apache.commons.math3.distribution.FDistribution#getNumeratorDegreesOfFreedom()}
 * @utbot.returnsFrom {@code return (2 * (denominatorDF * denominatorDF) * (numeratorDF + denominatorDF - 2)) / ((numeratorDF * (denomDFMinusTwo * denomDFMinusTwo) * (denominatorDF - 4)));}
 *  */
    @Test
    public void testCalculateNumericalVariance_DenominatorDFGreaterThan4() throws Exception  {
        FDistribution fDistribution = ((FDistribution) createInstance("org.apache.commons.math3.distribution.FDistribution"));
        setField(fDistribution, "org.apache.commons.math3.distribution.FDistribution", "numeratorDegreesOfFreedom", 0.0);
        setField(fDistribution, "org.apache.commons.math3.distribution.FDistribution", "denominatorDegreesOfFreedom", 2.68156158598852E154);
        
        double actual = fDistribution.calculateNumericalVariance();
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.FDistribution#calculateNumericalVariance()}
 * @utbot.executesCondition {@code (denominatorDF > 4): False}
 * @utbot.returnsFrom {@code return Double.NaN;}
 *  */
    @Test
    public void testCalculateNumericalVariance_DenominatorDFLessOrEqual4() throws Exception  {
        FDistribution fDistribution = ((FDistribution) createInstance("org.apache.commons.math3.distribution.FDistribution"));
        setField(fDistribution, "org.apache.commons.math3.distribution.FDistribution", "denominatorDegreesOfFreedom", 4.0);
        
        double actual = fDistribution.calculateNumericalVariance();
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.FDistribution.getNumeratorDegreesOfFreedom
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNumeratorDegreesOfFreedom()
    
    /**
    @utbot.classUnderTest {@link FDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.FDistribution#getNumeratorDegreesOfFreedom()}
 * @utbot.returnsFrom {@code return numeratorDegreesOfFreedom;}
 *  */
    @Test
    public void testGetNumeratorDegreesOfFreedom_ReturnNumeratorDegreesOfFreedom() throws Exception  {
        FDistribution fDistribution = ((FDistribution) createInstance("org.apache.commons.math3.distribution.FDistribution"));
        setField(fDistribution, "org.apache.commons.math3.distribution.FDistribution", "numeratorDegreesOfFreedom", 0.0);
        
        double actual = fDistribution.getNumeratorDegreesOfFreedom();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.FDistribution.getDenominatorDegreesOfFreedom
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDenominatorDegreesOfFreedom()
    
    /**
    @utbot.classUnderTest {@link FDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.FDistribution#getDenominatorDegreesOfFreedom()}
 * @utbot.returnsFrom {@code return denominatorDegreesOfFreedom;}
 *  */
    @Test
    public void testGetDenominatorDegreesOfFreedom_ReturnDenominatorDegreesOfFreedom() throws Exception  {
        FDistribution fDistribution = ((FDistribution) createInstance("org.apache.commons.math3.distribution.FDistribution"));
        setField(fDistribution, "org.apache.commons.math3.distribution.FDistribution", "denominatorDegreesOfFreedom", 0.0);
        
        double actual = fDistribution.getDenominatorDegreesOfFreedom();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.FDistribution.getSolverAbsoluteAccuracy
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSolverAbsoluteAccuracy()
    
    /**
    @utbot.classUnderTest {@link FDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.FDistribution#getSolverAbsoluteAccuracy()}
 * @utbot.returnsFrom {@code return solverAbsoluteAccuracy;}
 *  */
    @Test
    public void testGetSolverAbsoluteAccuracy_ReturnSolverAbsoluteAccuracy() throws Exception  {
        FDistribution fDistribution = ((FDistribution) createInstance("org.apache.commons.math3.distribution.FDistribution"));
        setField(fDistribution, "org.apache.commons.math3.distribution.FDistribution", "solverAbsoluteAccuracy", 0.0);
        
        double actual = fDistribution.getSolverAbsoluteAccuracy();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.FDistribution.density
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method density(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.distribution.FDistribution}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.FDistribution#density(double)}
     */
    @Test
    public void testDensityReturnsNan() {
        FDistribution fDistribution = new FDistribution(2.0, 1.0);
        
        double actual = fDistribution.density(-1.52587890625E-5);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.distribution.FDistribution}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.FDistribution#density(double)}
     */
    @Test
    public void testDensityReturnsNanWithCornerCase() {
        FDistribution fDistribution = new FDistribution(java.lang.Double.POSITIVE_INFINITY, 2.0);
        
        double actual = fDistribution.density(java.lang.Double.NEGATIVE_INFINITY);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.distribution.FDistribution}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.FDistribution#density(double)}
     */
    @Test
    public void testDensity() {
        FDistribution fDistribution = new FDistribution(2.0, 1.0);
        
        double actual = fDistribution.density(4.4841550858394146E-44);
        
        assertEquals(1.0000000000000018, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.distribution.FDistribution}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.FDistribution#density(double)}
     */
    @Test
    public void testDensity1() {
        FDistribution fDistribution = new FDistribution(2.0, 1.0);
        
        double actual = fDistribution.density(1.5259254723787308E-5);
        
        assertEquals(0.999954223982103, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.FDistribution.getNumericalMean
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNumericalMean()
    
    /**
    @utbot.classUnderTest {@link FDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.FDistribution#getNumericalMean()}
 * @utbot.executesCondition {@code (denominatorDF > 2): True}
 * @utbot.returnsFrom {@code return denominatorDF / (denominatorDF - 2);}
 *  */
    @Test
    public void testGetNumericalMean_DenominatorDFGreaterThan2() throws Exception  {
        FDistribution fDistribution = ((FDistribution) createInstance("org.apache.commons.math3.distribution.FDistribution"));
        setField(fDistribution, "org.apache.commons.math3.distribution.FDistribution", "denominatorDegreesOfFreedom", 2.681561585988529E154);
        
        double actual = fDistribution.getNumericalMean();
        
        assertEquals(1.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.FDistribution#getNumericalMean()}
 * @utbot.executesCondition {@code (denominatorDF > 2): False}
 * @utbot.returnsFrom {@code return Double.NaN;}
 *  */
    @Test
    public void testGetNumericalMean_DenominatorDFLessOrEqual2() throws Exception  {
        FDistribution fDistribution = ((FDistribution) createInstance("org.apache.commons.math3.distribution.FDistribution"));
        setField(fDistribution, "org.apache.commons.math3.distribution.FDistribution", "denominatorDegreesOfFreedom", 2.0);
        
        double actual = fDistribution.getNumericalMean();
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.FDistribution.isSupportConnected
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSupportConnected()
    
    /**
    @utbot.classUnderTest {@link FDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.FDistribution#isSupportConnected()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSupportConnected_ReturnTrue() throws Exception  {
        FDistribution fDistribution = ((FDistribution) createInstance("org.apache.commons.math3.distribution.FDistribution"));
        
        boolean actual = fDistribution.isSupportConnected();
        
        assertTrue(actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields721660333346200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields721660333346200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass721660333353700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields721660333346200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass721660333353700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields721660333826000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields721660333826000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass721660333830200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields721660333826000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass721660333830200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

