package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.ArgumentOutsideDomainException;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.optimization.fitting.HarmonicFunction;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public final class org_apache_commons_math_analysis_solvers_BisectionSolverTest {
    ///region Test suites for executable org.apache.commons.math.analysis.solvers.BisectionSolver.solve
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)
    
    /**
    @utbot.classUnderTest {@link BisectionSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BisectionSolver#solve(org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return solve(min, max);
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        BisectionSolver bisectionSolver = ((BisectionSolver) createInstance("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        PolynomialSplineFunction f = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {4.9E-324};
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "n", 1073741824);
        setField(bisectionSolver, "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl", "f", f);
        bisectionSolver.setMaximalIterationCount(1);
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BisectionSolver.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction.value(PolynomialSplineFunction.java:136)
            org.apache.commons.math.analysis.solvers.BisectionSolver.solve(BisectionSolver.java:88)
            org.apache.commons.math.analysis.solvers.BisectionSolver.solve(BisectionSolver.java:66)
            org.apache.commons.math.analysis.solvers.BisectionSolver.solve(BisectionSolver.java:72) */
        bisectionSolver.solve(null, 4.9E-324, 2.2250738585072024E-308, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link BisectionSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BisectionSolver#solve(org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return solve(min, max);
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        BisectionSolver bisectionSolver = ((BisectionSolver) createInstance("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        PolynomialSplineFunction f = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {};
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        setField(bisectionSolver, "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl", "f", f);
        bisectionSolver.setMaximalIterationCount(1);
        
        /* This test fails because method [org.apache.commons.math.analysis.solvers.BisectionSolver.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction.value(PolynomialSplineFunction.java:136)
            org.apache.commons.math.analysis.solvers.BisectionSolver.solve(BisectionSolver.java:88)
            org.apache.commons.math.analysis.solvers.BisectionSolver.solve(BisectionSolver.java:66)
            org.apache.commons.math.analysis.solvers.BisectionSolver.solve(BisectionSolver.java:72) */
        bisectionSolver.solve(null, -2.7229430204786197E39, 6.183656142056666E-230, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)
    
    /**
    @utbot.classUnderTest {@link BisectionSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BisectionSolver#solve(org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.MaxIterationsExceededException} in: return solve(min, max);
 *  */
    @Test(expected = MaxIterationsExceededException.class)
    public void testSolve_ThrowMaxIterationsExceededException() throws Exception  {
        BisectionSolver bisectionSolver = ((BisectionSolver) createInstance("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        PolynomialSplineFunction f = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        setField(bisectionSolver, "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl", "f", f);
        
        bisectionSolver.solve(null, -9.002304E7, 8.215267652506841E-296, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link BisectionSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BisectionSolver#solve(org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.ArgumentOutsideDomainException} in: return solve(min, max);
 *  */
    @Test(expected = ArgumentOutsideDomainException.class)
    public void testSolve_ThrowArgumentOutsideDomainException() throws Exception  {
        BisectionSolver bisectionSolver = ((BisectionSolver) createInstance("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        PolynomialSplineFunction f = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {4.45016469298073E-308, -2.2250823464903657E-308};
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "n", 1);
        setField(bisectionSolver, "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl", "f", f);
        bisectionSolver.setMaximalIterationCount(1);
        
        bisectionSolver.solve(null, 4.45016469298073E-308, 1.0936683029334598E-303, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link BisectionSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BisectionSolver#solve(org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.ArgumentOutsideDomainException} in: return solve(min, max);
 *  */
    @Test(expected = ArgumentOutsideDomainException.class)
    public void testSolve_ThrowArgumentOutsideDomainException_1() throws Exception  {
        BisectionSolver bisectionSolver = ((BisectionSolver) createInstance("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        PolynomialSplineFunction f = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {1.0395579833724686E-304};
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        setField(bisectionSolver, "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl", "f", f);
        bisectionSolver.setMaximalIterationCount(1);
        
        bisectionSolver.solve(null, -144.00439453125, 256.50781250000006, java.lang.Double.NaN);
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
    
    ///region Test suites for executable org.apache.commons.math.analysis.solvers.BisectionSolver.solve
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)
    
    /**
    @utbot.classUnderTest {@link BisectionSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BisectionSolver#solve(org.apache.commons.math.analysis.UnivariateRealFunction,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.MaxIterationsExceededException} in: throw new MaxIterationsExceededException(maximalIterationCount);
 *  */
    @Test(expected = MaxIterationsExceededException.class)
    public void testSolve_ThrowMaxIterationsExceededException1() throws Exception  {
        BisectionSolver bisectionSolver = ((BisectionSolver) createInstance("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        
        bisectionSolver.solve(((UnivariateRealFunction) null), -9.299556963720468E77, 5.696195295308995E-306);
    }
    
    /**
    @utbot.classUnderTest {@link BisectionSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BisectionSolver#solve(org.apache.commons.math.analysis.UnivariateRealFunction,double,double)}
 * @utbot.iterates iterate the loop {@code while(i < maximalIterationCount)} once
 * @utbot.throwsException {@link org.apache.commons.math.ArgumentOutsideDomainException} in: fmin = f.value(min);
 *  */
    @Test(expected = ArgumentOutsideDomainException.class)
    public void testSolve_ThrowArgumentOutsideDomainException1() throws Exception  {
        BisectionSolver bisectionSolver = ((BisectionSolver) createInstance("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        bisectionSolver.setMaximalIterationCount(1);
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {6.191194620733833E-135};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        
        bisectionSolver.solve(polynomialSplineFunction, -1.9770617261176164E159, -2.364140974663902E-308);
    }
    
    /**
    @utbot.classUnderTest {@link BisectionSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BisectionSolver#solve(org.apache.commons.math.analysis.UnivariateRealFunction,double,double)}
 * @utbot.iterates iterate the loop {@code while(i < maximalIterationCount)} once
 * @utbot.throwsException {@link org.apache.commons.math.ArgumentOutsideDomainException} in: fm = f.value(m);
 *  */
    @Test(expected = ArgumentOutsideDomainException.class)
    public void testSolve_ThrowArgumentOutsideDomainException_11() throws Exception  {
        BisectionSolver bisectionSolver = ((BisectionSolver) createInstance("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        bisectionSolver.setMaximalIterationCount(1);
        PolynomialSplineFunction polynomialSplineFunction = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {-1.5525180923007117E231, 2.781480252862948E-308, 0.0};
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomials = new org.apache.commons.math.analysis.polynomials.PolynomialFunction[32];
        PolynomialFunction polynomialFunction = ((PolynomialFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        double[] coefficients = {0.0, 0.0};
        setField(polynomialFunction, "org.apache.commons.math.analysis.polynomials.PolynomialFunction", "coefficients", coefficients);
        polynomials[0] = polynomialFunction;
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "polynomials", polynomials);
        setField(polynomialSplineFunction, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "n", 1);
        
        bisectionSolver.solve(polynomialSplineFunction, -0.0, 4.5059918691093924E-307);
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
    
    ///region Test suites for executable org.apache.commons.math.analysis.solvers.BisectionSolver.solve
    
    ///region Errors report for solve
    
    public void testSolve_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.analysis.solvers
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.analysis.solvers.BisectionSolver.solve
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method solve(double, double, double)
    
    /**
    @utbot.classUnderTest {@link BisectionSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BisectionSolver#solve(double,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.MaxIterationsExceededException} in: return solve(f, min, max);
 *  */
    @Test(expected = MaxIterationsExceededException.class)
    public void testSolve_ThrowMaxIterationsExceededException2() throws Exception  {
        BisectionSolver bisectionSolver = ((BisectionSolver) createInstance("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        PolynomialSplineFunction f = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        setField(bisectionSolver, "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl", "f", f);
        
        bisectionSolver.solve(-8.375028967973776, 6.141561787812788E-306, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link BisectionSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BisectionSolver#solve(double,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.ArgumentOutsideDomainException} in: return solve(f, min, max);
 *  */
    @Test(expected = ArgumentOutsideDomainException.class)
    public void testSolve_ThrowArgumentOutsideDomainException2() throws Exception  {
        BisectionSolver bisectionSolver = ((BisectionSolver) createInstance("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        PolynomialSplineFunction f = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {3.007417482951305E-154};
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        setField(bisectionSolver, "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl", "f", f);
        bisectionSolver.setMaximalIterationCount(1);
        
        bisectionSolver.solve(-5.237148083445411E-116, 7.867556985999392E-270, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link BisectionSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.analysis.solvers.BisectionSolver#solve(double,double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.ArgumentOutsideDomainException} in: return solve(f, min, max);
 *  */
    @Test(expected = ArgumentOutsideDomainException.class)
    public void testSolve_ThrowArgumentOutsideDomainException_12() throws Exception  {
        BisectionSolver bisectionSolver = ((BisectionSolver) createInstance("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        PolynomialSplineFunction f = ((PolynomialSplineFunction) createInstance("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] knots = {3.223523846550187E-58, 3.5084455708558785E-77};
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "knots", knots);
        setField(f, "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", "n", 1);
        setField(bisectionSolver, "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl", "f", f);
        bisectionSolver.setMaximalIterationCount(1);
        
        bisectionSolver.solve(3.223523846550187E-58, 5.425975544645912E154, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region Errors report for solve
    
    public void testSolve_errors3()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.analysis.solvers
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields738765334328900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields738765334328900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass738765334338200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields738765334328900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass738765334338200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

