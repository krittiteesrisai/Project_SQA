package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.assertEquals;

public final class org_apache_commons_math_analysis_solvers_UnivariateRealSolverUtilsTest {
    ///region Test suites for executable org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method midpoint(double, double)
    
    /**
    @utbot.classUnderTest {@link UnivariateRealSolverUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils#midpoint(double,double)}
 * @utbot.returnsFrom {@code return (a + b) * .5;}
 *  */
    @Test
    public void testMidpoint_ReturnAPlusBMultiply0d() {
        double actual = UnivariateRealSolverUtils.midpoint(java.lang.Double.NaN, java.lang.Double.NaN);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)
    
    /**
    @utbot.classUnderTest {@link UnivariateRealSolverUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils#solve(org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return solver.solve(f, x0, x1);}
 *  */
    @Test
    public void testSolve_ReturnSolverSolve() throws Exception  {
        Class lazyHolderClazz = Class.forName("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils$LazyHolder");
        UnivariateRealSolverFactory prevFACTORY = ((UnivariateRealSolverFactory) getStaticFieldValue(lazyHolderClazz, "FACTORY"));
        try {
            UnivariateRealSolverFactoryImpl factory = new UnivariateRealSolverFactoryImpl();
            setStaticField(lazyHolderClazz, "FACTORY", factory);
            PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
            double[] coefficients = {1.5566055517021083E-163};
            setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
            
            double actual = UnivariateRealSolverUtils.solve(polynomialFunction, -2.978930068422043E167, 8.633574794590988E-112, java.lang.Double.NaN);
            
            assertEquals(8.633574794590988E-112, actual, 1.0E-6);
        } finally {
            setStaticField(lazyHolderClazz, "FACTORY", prevFACTORY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link UnivariateRealSolverUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils#solve(org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.returnsFrom {@code return solver.solve(f, x0, x1);}
 *  */
    @Test
    public void testSolve_ReturnSolverSolve_1() throws Exception  {
        Class lazyHolderClazz = Class.forName("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils$LazyHolder");
        UnivariateRealSolverFactory prevFACTORY = ((UnivariateRealSolverFactory) getStaticFieldValue(lazyHolderClazz, "FACTORY"));
        try {
            UnivariateRealSolverFactoryImpl factory = new UnivariateRealSolverFactoryImpl();
            setStaticField(lazyHolderClazz, "FACTORY", factory);
            PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
            double[] coefficients = {-0.0};
            setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
            
            double actual = UnivariateRealSolverUtils.solve(polynomialFunction, -5.55082891103083E-187, 5.272505655497138E-94, java.lang.Double.NaN);
            
            assertEquals(-5.55082891103083E-187, actual, 1.0E-6);
        } finally {
            setStaticField(lazyHolderClazz, "FACTORY", prevFACTORY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link UnivariateRealSolverUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils#solve(org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link java.lang.Math#abs(double)}
 * @utbot.invokes {@link org.apache.commons.math.analysis.solvers.BrentSolver#setResult(double,int)}
 * @utbot.returnsFrom {@code return solver.solve(f, x0, x1);}
 *  */
    @Test
    public void testSolve_ReturnSolverSolve_2() throws Exception  {
        Class lazyHolderClazz = Class.forName("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils$LazyHolder");
        UnivariateRealSolverFactory prevFACTORY = ((UnivariateRealSolverFactory) getStaticFieldValue(lazyHolderClazz, "FACTORY"));
        try {
            UnivariateRealSolverFactoryImpl factory = new UnivariateRealSolverFactoryImpl();
            setStaticField(lazyHolderClazz, "FACTORY", factory);
            PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
            double[] coefficients = {1.0E-15};
            setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
            
            double actual = UnivariateRealSolverUtils.solve(polynomialFunction, 2.5174282875069372E-257, 2.650559204497565E69, java.lang.Double.NaN);
            
            assertEquals(2.5174282875069372E-257, actual, 1.0E-6);
        } finally {
            setStaticField(lazyHolderClazz, "FACTORY", prevFACTORY);
        }
    }
    ///endregion
    
    ///region Errors report for solve
    
    public void testSolve_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.analysis.solvers
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)
    
    /**
    @utbot.classUnderTest {@link UnivariateRealSolverUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils#solve(org.apache.commons.math.analysis.UnivariateRealFunction,double,double)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.returnsFrom {@code return LazyHolder.FACTORY.newDefaultSolver().solve(f, x0, x1);}
 *  */
    @Test
    public void testSolve_ReturnLazyHolderFACTORYNewDefaultSolverSolve() throws Exception  {
        Class lazyHolderClazz = Class.forName("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils$LazyHolder");
        UnivariateRealSolverFactory prevFACTORY = ((UnivariateRealSolverFactory) getStaticFieldValue(lazyHolderClazz, "FACTORY"));
        try {
            UnivariateRealSolverFactoryImpl factory = new UnivariateRealSolverFactoryImpl();
            setStaticField(lazyHolderClazz, "FACTORY", factory);
            PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
            double[] coefficients = {-0.0};
            setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
            
            double actual = UnivariateRealSolverUtils.solve(polynomialFunction, -4.6317440841133095E78, 1.8321346479282273E193);
            
            assertEquals(-4.6317440841133095E78, actual, 1.0E-6);
        } finally {
            setStaticField(lazyHolderClazz, "FACTORY", prevFACTORY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link UnivariateRealSolverUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils#solve(org.apache.commons.math.analysis.UnivariateRealFunction,double,double)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return LazyHolder.FACTORY.newDefaultSolver().solve(f, x0, x1);}
 *  */
    @Test
    public void testSolve_ReturnLazyHolderFACTORYNewDefaultSolverSolve_1() throws Exception  {
        Class lazyHolderClazz = Class.forName("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils$LazyHolder");
        UnivariateRealSolverFactory prevFACTORY = ((UnivariateRealSolverFactory) getStaticFieldValue(lazyHolderClazz, "FACTORY"));
        try {
            UnivariateRealSolverFactoryImpl factory = new UnivariateRealSolverFactoryImpl();
            setStaticField(lazyHolderClazz, "FACTORY", factory);
            PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
            double[] coefficients = {1.0737554092269958E-306};
            setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
            
            double actual = UnivariateRealSolverUtils.solve(polynomialFunction, -2.5040646810104534, 2.3643643815524223E-308);
            
            assertEquals(2.3643643815524223E-308, actual, 1.0E-6);
        } finally {
            setStaticField(lazyHolderClazz, "FACTORY", prevFACTORY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link UnivariateRealSolverUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils#solve(org.apache.commons.math.analysis.UnivariateRealFunction,double,double)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link java.lang.Math#abs(double)}
 * @utbot.invokes {@link org.apache.commons.math.analysis.solvers.BrentSolver#setResult(double,int)}
 * @utbot.returnsFrom {@code return LazyHolder.FACTORY.newDefaultSolver().solve(f, x0, x1);}
 *  */
    @Test
    public void testSolve_ReturnLazyHolderFACTORYNewDefaultSolverSolve_2() throws Exception  {
        Class lazyHolderClazz = Class.forName("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils$LazyHolder");
        UnivariateRealSolverFactory prevFACTORY = ((UnivariateRealSolverFactory) getStaticFieldValue(lazyHolderClazz, "FACTORY"));
        try {
            UnivariateRealSolverFactoryImpl factory = new UnivariateRealSolverFactoryImpl();
            setStaticField(lazyHolderClazz, "FACTORY", factory);
            PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
            double[] coefficients = {-4.264108224077882E-77};
            setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
            
            double actual = UnivariateRealSolverUtils.solve(polynomialFunction, 207113.79835584457, 6.015890399729645E77);
            
            assertEquals(207113.79835584457, actual, 1.0E-6);
        } finally {
            setStaticField(lazyHolderClazz, "FACTORY", prevFACTORY);
        }
    }
    ///endregion
    
    ///region Errors report for solve
    
    public void testSolve_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.analysis.solvers
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket
    
    ///region Errors report for bracket
    
    public void testBracket_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.analysis.solvers
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket
    
    ///region Errors report for bracket
    
    public void testBracket_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.analysis.solvers
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.setup
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setup(org.apache.commons.math.analysis.UnivariateRealFunction)
    
    /**
    @utbot.classUnderTest {@link UnivariateRealSolverUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils#setup(org.apache.commons.math.analysis.UnivariateRealFunction)}
 * @utbot.executesCondition {@code (f == null): False}
 *  */
    @Test
    public void testSetup_FNotEqualsNull() throws Exception  {
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        
        Class univariateRealSolverUtilsClazz = Class.forName("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils");
        Class polynomialFunctionType = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        Method setupMethod = univariateRealSolverUtilsClazz.getDeclaredMethod("setup", polynomialFunctionType);
        setupMethod.setAccessible(true);
        java.lang.Object[] setupMethodArguments = new java.lang.Object[1];
        setupMethodArguments[0] = polynomialFunction;
        setupMethod.invoke(null, setupMethodArguments);
    }
    ///endregion
    
    ///region Errors report for setup
    
    public void testSetup_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.analysis.solvers
        
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields742573313380900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields742573313380900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass742573313389400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields742573313380900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass742573313389400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields742573315391100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields742573315391100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass742573315394500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields742573315391100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass742573315394500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields742573315922700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields742573315922700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass742573315925400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields742573315922700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass742573315925400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

