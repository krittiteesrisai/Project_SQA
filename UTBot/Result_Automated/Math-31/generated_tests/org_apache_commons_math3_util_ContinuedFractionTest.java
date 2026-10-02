package org.apache.commons.math3.util;

import org.junit.Test;
import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public final class org_apache_commons_math3_util_ContinuedFractionTest {
    ///region Test suites for executable org.apache.commons.math3.util.ContinuedFraction.evaluate
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method evaluate(double, double)
    
    @Test(expected = ConvergenceException.class)
    public void testEvaluate1() throws Exception  {
        ContinuedFraction anonymousContinuedFraction = ((ContinuedFraction) createInstance("org.apache.commons.math3.special.Gamma$1"));
        setField(anonymousContinuedFraction, "org.apache.commons.math3.special.Gamma$1", "val$a", 0.999755859375);
        
        anonymousContinuedFraction.evaluate(-2.10190160032170016E17, java.lang.Double.NaN);
    }
    
    @Test(expected = ConvergenceException.class)
    public void testEvaluate2() throws Exception  {
        ContinuedFraction anonymousContinuedFraction = ((ContinuedFraction) createInstance("org.apache.commons.math3.special.Gamma$1"));
        setField(anonymousContinuedFraction, "org.apache.commons.math3.special.Gamma$1", "val$a", 1.0);
        
        anonymousContinuedFraction.evaluate(-1.79308648231937E-310, java.lang.Double.NaN);
    }
    
    @Test(expected = ConvergenceException.class)
    public void testEvaluate3() throws Exception  {
        ContinuedFraction anonymousContinuedFraction = ((ContinuedFraction) createInstance("org.apache.commons.math3.special.Gamma$1"));
        setField(anonymousContinuedFraction, "org.apache.commons.math3.special.Gamma$1", "val$a", 1.013183608651163);
        
        anonymousContinuedFraction.evaluate(-63.99997545791237, java.lang.Double.NaN);
    }
    
    @Test(expected = ConvergenceException.class)
    public void testEvaluate4() throws Exception  {
        ContinuedFraction anonymousContinuedFraction = ((ContinuedFraction) createInstance("org.apache.commons.math3.special.Gamma$1"));
        setField(anonymousContinuedFraction, "org.apache.commons.math3.special.Gamma$1", "val$a", 0.0);
        
        anonymousContinuedFraction.evaluate(7.1875, java.lang.Double.NaN);
    }
    
    @Test(expected = ConvergenceException.class)
    public void testEvaluate5() throws Exception  {
        ContinuedFraction anonymousContinuedFraction = ((ContinuedFraction) createInstance("org.apache.commons.math3.special.Gamma$1"));
        setField(anonymousContinuedFraction, "org.apache.commons.math3.special.Gamma$1", "val$a", 0.9999999846331775);
        
        anonymousContinuedFraction.evaluate(-1.5366822481155396E-8, java.lang.Double.NaN);
    }
    
    @Test(expected = ConvergenceException.class)
    public void testEvaluate6() throws Exception  {
        ContinuedFraction anonymousContinuedFraction = ((ContinuedFraction) createInstance("org.apache.commons.math3.special.Beta$1"));
        
        anonymousContinuedFraction.evaluate(java.lang.Double.NaN, java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.ContinuedFraction.evaluate
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method evaluate(double, int)
    
    @Test(expected = MaxCountExceededException.class)
    public void testEvaluate7() throws Exception  {
        ContinuedFraction anonymousContinuedFraction = ((ContinuedFraction) createInstance("org.apache.commons.math3.special.Gamma$1"));
        setField(anonymousContinuedFraction, "org.apache.commons.math3.special.Gamma$1", "val$a", 0.9375);
        
        anonymousContinuedFraction.evaluate(java.lang.Double.NaN, 0);
    }
    
    @Test(expected = MaxCountExceededException.class)
    public void testEvaluate8() throws Exception  {
        ContinuedFraction anonymousContinuedFraction = ((ContinuedFraction) createInstance("org.apache.commons.math3.special.Gamma$1"));
        setField(anonymousContinuedFraction, "org.apache.commons.math3.special.Gamma$1", "val$a", -0.03125000000000001);
        
        anonymousContinuedFraction.evaluate(-2.2250738585072014E-308, 0);
    }
    
    @Test(expected = MaxCountExceededException.class)
    public void testEvaluate9() throws Exception  {
        ContinuedFraction anonymousContinuedFraction = ((ContinuedFraction) createInstance("org.apache.commons.math3.special.Gamma$1"));
        setField(anonymousContinuedFraction, "org.apache.commons.math3.special.Gamma$1", "val$a", 0.0);
        
        anonymousContinuedFraction.evaluate(-32.0, 0);
    }
    
    @Test(expected = MaxCountExceededException.class)
    public void testEvaluate10() throws Exception  {
        ContinuedFraction anonymousContinuedFraction = ((ContinuedFraction) createInstance("org.apache.commons.math3.special.Gamma$1"));
        setField(anonymousContinuedFraction, "org.apache.commons.math3.special.Gamma$1", "val$a", 7.636728696525097E-6);
        
        anonymousContinuedFraction.evaluate(-0.9999923632713035, 0);
    }
    
    @Test(expected = MaxCountExceededException.class)
    public void testEvaluate11() throws Exception  {
        ContinuedFraction anonymousContinuedFraction = ((ContinuedFraction) createInstance("org.apache.commons.math3.special.Beta$1"));
        
        anonymousContinuedFraction.evaluate(java.lang.Double.NaN, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.ContinuedFraction.evaluate
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method evaluate(double, double, int)
    
    /**
    @utbot.classUnderTest {@link ContinuedFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.ContinuedFraction#evaluate(double,double,int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MaxCountExceededException} in: while(n < maxIterations)
 *  */
    @Test(expected = MaxCountExceededException.class)
    public void testEvaluate_ThrowMaxCountExceededException() throws Exception  {
        ContinuedFraction anonymousContinuedFraction = ((ContinuedFraction) createInstance("org.apache.commons.math3.special.Gamma$1"));
        setField(anonymousContinuedFraction, "org.apache.commons.math3.special.Gamma$1", "val$a", 0.25);
        
        anonymousContinuedFraction.evaluate(java.lang.Double.NaN, java.lang.Double.NaN, 1);
    }
    
    /**
    @utbot.classUnderTest {@link ContinuedFraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.ContinuedFraction#evaluate(double,double,int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MaxCountExceededException} in: while(n < maxIterations)
 *  */
    @Test(expected = MaxCountExceededException.class)
    public void testEvaluate_ThrowMaxCountExceededException_1() throws Exception  {
        ContinuedFraction anonymousContinuedFraction = ((ContinuedFraction) createInstance("org.apache.commons.math3.special.Gamma$1"));
        setField(anonymousContinuedFraction, "org.apache.commons.math3.special.Gamma$1", "val$a", 0.03124999999994316);
        
        anonymousContinuedFraction.evaluate(java.lang.Double.NaN, java.lang.Double.NaN, 1);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields724649230894000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields724649230894000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass724649230900100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields724649230894000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass724649230900100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

