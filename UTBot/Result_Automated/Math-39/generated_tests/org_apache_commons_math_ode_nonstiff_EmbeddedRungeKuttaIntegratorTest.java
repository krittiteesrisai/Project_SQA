package org.apache.commons.math.ode.nonstiff;

import org.junit.Test;
import org.apache.commons.math.ode.ExpandableStatefulODE;
import org.apache.commons.math.ode.EquationsMapper;
import java.util.ArrayList;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import org.apache.commons.math.exception.DimensionMismatchException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;

public final class org_apache_commons_math_ode_nonstiff_EmbeddedRungeKuttaIntegratorTest {
    ///region Test suites for executable org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method integrate(org.apache.commons.math.ode.ExpandableStatefulODE, double)
    
    /**
    @utbot.classUnderTest {@link EmbeddedRungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#integrate(org.apache.commons.math.ode.ExpandableStatefulODE,double)}
 * @utbot.invokes {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#sanityChecks(org.apache.commons.math.ode.ExpandableStatefulODE,double)}
 * @utbot.invokes {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#setEquations(org.apache.commons.math.ode.ExpandableStatefulODE)}
 * @utbot.invokes {@link org.apache.commons.math.ode.ExpandableStatefulODE#getTime()}
 * @utbot.invokes {@link org.apache.commons.math.ode.ExpandableStatefulODE#getCompleteState()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double[] y0 = equations.getCompleteState();
 *  */
    @Test
    public void testIntegrate_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator"));
        double[] vecRelativeTolerance = {};
        dormandPrince54Integrator.vecRelativeTolerance = vecRelativeTolerance;
        ExpandableStatefulODE expandable = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        setField(dormandPrince54Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "expandable", expandable);
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        EquationsMapper primaryMapper = ((EquationsMapper) createInstance("org.apache.commons.math.ode.EquationsMapper"));
        setField(primaryMapper, "org.apache.commons.math.ode.EquationsMapper", "firstIndex", -1);
        setField(expandableStatefulODE, "org.apache.commons.math.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper);
        expandableStatefulODE.setTime(java.lang.Double.NEGATIVE_INFINITY);
        expandableStatefulODE.setPrimaryState(vecRelativeTolerance);
        ArrayList components = new ArrayList();
        setField(expandableStatefulODE, "org.apache.commons.math.ode.ExpandableStatefulODE", "components", components);
        
        /* This test fails because method [org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -1 out of bounds for double[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.ode.EquationsMapper.insertEquationData(EquationsMapper.java:95)
            org.apache.commons.math.ode.ExpandableStatefulODE.getCompleteState(ExpandableStatefulODE.java:288)
            org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate(EmbeddedRungeKuttaIntegrator.java:199) */
        dormandPrince54Integrator.integrate(expandableStatefulODE, java.lang.Double.NEGATIVE_INFINITY);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method integrate(org.apache.commons.math.ode.ExpandableStatefulODE, double)
    
    /**
    @utbot.classUnderTest {@link EmbeddedRungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#integrate(org.apache.commons.math.ode.ExpandableStatefulODE,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NumberIsTooSmallException} in: sanityChecks(equations, t);
 *  */
    @Test(expected = NumberIsTooSmallException.class)
    public void testIntegrate_ThrowNumberIsTooSmallException() throws Exception  {
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(-0.0);
        
        dormandPrince54Integrator.integrate(expandableStatefulODE, java.lang.Double.POSITIVE_INFINITY);
    }
    
    /**
    @utbot.classUnderTest {@link EmbeddedRungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#integrate(org.apache.commons.math.ode.ExpandableStatefulODE,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NumberIsTooSmallException} in: sanityChecks(equations, t);
 *  */
    @Test(expected = NumberIsTooSmallException.class)
    public void testIntegrate_ThrowNumberIsTooSmallException_1() throws Exception  {
        HighamHall54Integrator highamHall54Integrator = ((HighamHall54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.HighamHall54Integrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(-0.0);
        
        highamHall54Integrator.integrate(expandableStatefulODE, 0.0);
    }
    
    /**
    @utbot.classUnderTest {@link EmbeddedRungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#integrate(org.apache.commons.math.ode.ExpandableStatefulODE,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NumberIsTooSmallException} in: sanityChecks(equations, t);
 *  */
    @Test(expected = NumberIsTooSmallException.class)
    public void testIntegrate_ThrowNumberIsTooSmallException_2() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(java.lang.Double.POSITIVE_INFINITY);
        
        dormandPrince853Integrator.integrate(expandableStatefulODE, -1.0);
    }
    
    /**
    @utbot.classUnderTest {@link EmbeddedRungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#integrate(org.apache.commons.math.ode.ExpandableStatefulODE,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NumberIsTooSmallException} in: sanityChecks(equations, t);
 *  */
    @Test(expected = NumberIsTooSmallException.class)
    public void testIntegrate_ThrowNumberIsTooSmallException_3() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(java.lang.Double.NEGATIVE_INFINITY);
        
        dormandPrince853Integrator.integrate(expandableStatefulODE, java.lang.Double.POSITIVE_INFINITY);
    }
    
    /**
    @utbot.classUnderTest {@link EmbeddedRungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#integrate(org.apache.commons.math.ode.ExpandableStatefulODE,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: sanityChecks(equations, t);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testIntegrate_ThrowDimensionMismatchException() throws Exception  {
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator"));
        double[] vecAbsoluteTolerance = {0.0, 0.0};
        dormandPrince54Integrator.vecAbsoluteTolerance = vecAbsoluteTolerance;
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        EquationsMapper primaryMapper = ((EquationsMapper) createInstance("org.apache.commons.math.ode.EquationsMapper"));
        setField(primaryMapper, "org.apache.commons.math.ode.EquationsMapper", "dimension", -3);
        setField(expandableStatefulODE, "org.apache.commons.math.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper);
        expandableStatefulODE.setTime(java.lang.Double.NEGATIVE_INFINITY);
        
        dormandPrince54Integrator.integrate(expandableStatefulODE, java.lang.Double.NEGATIVE_INFINITY);
    }
    
    /**
    @utbot.classUnderTest {@link EmbeddedRungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#integrate(org.apache.commons.math.ode.ExpandableStatefulODE,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: sanityChecks(equations, t);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testIntegrate_ThrowDimensionMismatchException_1() throws Exception  {
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator"));
        double[] vecRelativeTolerance = {0.0, 0.0};
        dormandPrince54Integrator.vecRelativeTolerance = vecRelativeTolerance;
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        EquationsMapper primaryMapper = ((EquationsMapper) createInstance("org.apache.commons.math.ode.EquationsMapper"));
        setField(primaryMapper, "org.apache.commons.math.ode.EquationsMapper", "dimension", -3);
        setField(expandableStatefulODE, "org.apache.commons.math.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper);
        expandableStatefulODE.setTime(java.lang.Double.NEGATIVE_INFINITY);
        
        dormandPrince54Integrator.integrate(expandableStatefulODE, java.lang.Double.NEGATIVE_INFINITY);
    }
    
    /**
    @utbot.classUnderTest {@link EmbeddedRungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#integrate(org.apache.commons.math.ode.ExpandableStatefulODE,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: final double[] y0 = equations.getCompleteState();
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testIntegrate_ThrowDimensionMismatchException_2() throws Exception  {
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator"));
        double[] vecRelativeTolerance = {};
        dormandPrince54Integrator.vecRelativeTolerance = vecRelativeTolerance;
        ExpandableStatefulODE expandable = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        setField(dormandPrince54Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "expandable", expandable);
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        EquationsMapper primaryMapper = ((EquationsMapper) createInstance("org.apache.commons.math.ode.EquationsMapper"));
        setField(expandableStatefulODE, "org.apache.commons.math.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper);
        expandableStatefulODE.setTime(java.lang.Double.NEGATIVE_INFINITY);
        double[] primaryState = {0.0};
        expandableStatefulODE.setPrimaryState(primaryState);
        ArrayList components = new ArrayList();
        setField(expandableStatefulODE, "org.apache.commons.math.ode.ExpandableStatefulODE", "components", components);
        
        dormandPrince54Integrator.integrate(expandableStatefulODE, java.lang.Double.NEGATIVE_INFINITY);
    }
    
    /**
    @utbot.classUnderTest {@link EmbeddedRungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#integrate(org.apache.commons.math.ode.ExpandableStatefulODE,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: final double[] y0 = equations.getCompleteState();
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testIntegrate_ThrowDimensionMismatchException_3() throws Exception  {
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator"));
        double[] vecAbsoluteTolerance = {};
        dormandPrince54Integrator.vecAbsoluteTolerance = vecAbsoluteTolerance;
        ExpandableStatefulODE expandable = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        setField(dormandPrince54Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "expandable", expandable);
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        EquationsMapper primaryMapper = ((EquationsMapper) createInstance("org.apache.commons.math.ode.EquationsMapper"));
        setField(expandableStatefulODE, "org.apache.commons.math.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper);
        expandableStatefulODE.setTime(java.lang.Double.NEGATIVE_INFINITY);
        double[] primaryState = {0.0};
        expandableStatefulODE.setPrimaryState(primaryState);
        ArrayList components = new ArrayList();
        setField(expandableStatefulODE, "org.apache.commons.math.ode.ExpandableStatefulODE", "components", components);
        
        dormandPrince54Integrator.integrate(expandableStatefulODE, java.lang.Double.NEGATIVE_INFINITY);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method integrate(org.apache.commons.math.ode.ExpandableStatefulODE, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator}
     * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#integrate(org.apache.commons.math.ode.ExpandableStatefulODE,double)}
     */
    @Test
    public void testIntegrateThrowsNPEWithCornerCase() {
        double[] doubleArray = {0.0, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY, 0.0};
        double[] doubleArray1 = {0.0, -1.0, 1.0, 1.0, 10.0};
        DormandPrince54Integrator dormandPrince54Integrator = new DormandPrince54Integrator(0.0, java.lang.Double.POSITIVE_INFINITY, doubleArray, doubleArray1);
        dormandPrince54Integrator.setSafety(0.0);
        dormandPrince54Integrator.setMaxGrowth(java.lang.Double.POSITIVE_INFINITY);
        dormandPrince54Integrator.setMinReduction(0.0);
        
        /* This test fails because method [org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.AbstractIntegrator.sanityChecks(AbstractIntegrator.java:404)
            org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.sanityChecks(AdaptiveStepsizeIntegrator.java:221)
            org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate(EmbeddedRungeKuttaIntegrator.java:194) */
        dormandPrince54Integrator.integrate(null, java.lang.Double.POSITIVE_INFINITY);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method integrate(org.apache.commons.math.ode.ExpandableStatefulODE, double)
    
    @Test
    public void testIntegrate1() throws Exception  {
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(-4.0405E-320);
        
        /* This test fails because method [org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.sanityChecks(AdaptiveStepsizeIntegrator.java:223)
            org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate(EmbeddedRungeKuttaIntegrator.java:194) */
        dormandPrince54Integrator.integrate(expandableStatefulODE, java.lang.Double.NaN);
    }
    
    @Test
    public void testIntegrate2() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(-1.7835459533725144E-307);
        
        /* This test fails because method [org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.sanityChecks(AdaptiveStepsizeIntegrator.java:223)
            org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate(EmbeddedRungeKuttaIntegrator.java:194) */
        dormandPrince853Integrator.integrate(expandableStatefulODE, -0.0);
    }
    
    @Test
    public void testIntegrate3() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(-0.0);
        
        /* This test fails because method [org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.sanityChecks(AdaptiveStepsizeIntegrator.java:223)
            org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate(EmbeddedRungeKuttaIntegrator.java:194) */
        dormandPrince853Integrator.integrate(expandableStatefulODE, 3.6377568166968965E-12);
    }
    
    @Test
    public void testIntegrate4() throws Exception  {
        HighamHall54Integrator highamHall54Integrator = ((HighamHall54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.HighamHall54Integrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.sanityChecks(AdaptiveStepsizeIntegrator.java:223)
            org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate(EmbeddedRungeKuttaIntegrator.java:194) */
        highamHall54Integrator.integrate(expandableStatefulODE, -0.0019731540814973414);
    }
    
    @Test
    public void testIntegrate5() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(java.lang.Double.POSITIVE_INFINITY);
        
        /* This test fails because method [org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.sanityChecks(AdaptiveStepsizeIntegrator.java:223)
            org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate(EmbeddedRungeKuttaIntegrator.java:194) */
        dormandPrince853Integrator.integrate(expandableStatefulODE, java.lang.Double.POSITIVE_INFINITY);
    }
    
    @Test
    public void testIntegrate6() throws Exception  {
        HighamHall54Integrator highamHall54Integrator = ((HighamHall54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.HighamHall54Integrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(1.4113013666904937E-48);
        
        /* This test fails because method [org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.sanityChecks(AdaptiveStepsizeIntegrator.java:223)
            org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate(EmbeddedRungeKuttaIntegrator.java:194) */
        highamHall54Integrator.integrate(expandableStatefulODE, -4.58026264710133E192);
    }
    
    @Test
    public void testIntegrate7() throws Exception  {
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(0.003969192504883007);
        
        /* This test fails because method [org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.sanityChecks(AdaptiveStepsizeIntegrator.java:223)
            org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate(EmbeddedRungeKuttaIntegrator.java:194) */
        dormandPrince54Integrator.integrate(expandableStatefulODE, -0.0);
    }
    
    @Test
    public void testIntegrate8() throws Exception  {
        HighamHall54Integrator highamHall54Integrator = ((HighamHall54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.HighamHall54Integrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        EquationsMapper primaryMapper = ((EquationsMapper) createInstance("org.apache.commons.math.ode.EquationsMapper"));
        setField(expandableStatefulODE, "org.apache.commons.math.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper);
        expandableStatefulODE.setTime(java.lang.Double.NEGATIVE_INFINITY);
        
        /* This test fails because method [org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.ExpandableStatefulODE.getTotalDimension(ExpandableStatefulODE.java:96)
            org.apache.commons.math.ode.ExpandableStatefulODE.getCompleteState(ExpandableStatefulODE.java:285)
            org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate(EmbeddedRungeKuttaIntegrator.java:199) */
        highamHall54Integrator.integrate(expandableStatefulODE, java.lang.Double.NEGATIVE_INFINITY);
    }
    
    @Test
    public void testIntegrate9() throws Exception  {
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        EquationsMapper primaryMapper = ((EquationsMapper) createInstance("org.apache.commons.math.ode.EquationsMapper"));
        setField(expandableStatefulODE, "org.apache.commons.math.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper);
        expandableStatefulODE.setTime(-0.0);
        
        /* This test fails because method [org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.ExpandableStatefulODE.getTotalDimension(ExpandableStatefulODE.java:96)
            org.apache.commons.math.ode.ExpandableStatefulODE.getCompleteState(ExpandableStatefulODE.java:285)
            org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate(EmbeddedRungeKuttaIntegrator.java:199) */
        dormandPrince54Integrator.integrate(expandableStatefulODE, java.lang.Double.NaN);
    }
    
    @Test
    public void testIntegrate10() throws Exception  {
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator"));
        double[] vecAbsoluteTolerance = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        dormandPrince54Integrator.vecAbsoluteTolerance = vecAbsoluteTolerance;
        dormandPrince54Integrator.vecRelativeTolerance = vecAbsoluteTolerance;
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        EquationsMapper primaryMapper = ((EquationsMapper) createInstance("org.apache.commons.math.ode.EquationsMapper"));
        setField(primaryMapper, "org.apache.commons.math.ode.EquationsMapper", "dimension", 9);
        setField(expandableStatefulODE, "org.apache.commons.math.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper);
        expandableStatefulODE.setTime(java.lang.Double.NEGATIVE_INFINITY);
        double[] primaryState = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        expandableStatefulODE.setPrimaryState(primaryState);
        ArrayList components = new ArrayList();
        setField(expandableStatefulODE, "org.apache.commons.math.ode.ExpandableStatefulODE", "components", components);
        
        /* This test fails because method [org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate(EmbeddedRungeKuttaIntegrator.java:201) */
        dormandPrince54Integrator.integrate(expandableStatefulODE, java.lang.Double.NEGATIVE_INFINITY);
    }
    
    @Test
    public void testIntegrate11() throws Exception  {
        HighamHall54Integrator highamHall54Integrator = ((HighamHall54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.HighamHall54Integrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        EquationsMapper primaryMapper = ((EquationsMapper) createInstance("org.apache.commons.math.ode.EquationsMapper"));
        setField(expandableStatefulODE, "org.apache.commons.math.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper);
        expandableStatefulODE.setTime(java.lang.Double.NEGATIVE_INFINITY);
        ArrayList components = new ArrayList();
        setField(expandableStatefulODE, "org.apache.commons.math.ode.ExpandableStatefulODE", "components", components);
        
        /* This test fails because method [org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.EquationsMapper.insertEquationData(EquationsMapper.java:92)
            org.apache.commons.math.ode.ExpandableStatefulODE.getCompleteState(ExpandableStatefulODE.java:288)
            org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate(EmbeddedRungeKuttaIntegrator.java:199) */
        highamHall54Integrator.integrate(expandableStatefulODE, java.lang.Double.NEGATIVE_INFINITY);
    }
    
    @Test
    public void testIntegrate12() throws Exception  {
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator"));
        double[] vecAbsoluteTolerance = {};
        dormandPrince54Integrator.vecAbsoluteTolerance = vecAbsoluteTolerance;
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        EquationsMapper primaryMapper = ((EquationsMapper) createInstance("org.apache.commons.math.ode.EquationsMapper"));
        setField(expandableStatefulODE, "org.apache.commons.math.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper);
        expandableStatefulODE.setTime(java.lang.Double.NEGATIVE_INFINITY);
        ArrayList components = new ArrayList();
        components.add(null);
        components.add(null);
        components.add(null);
        setField(expandableStatefulODE, "org.apache.commons.math.ode.ExpandableStatefulODE", "components", components);
        
        /* This test fails because method [org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.ExpandableStatefulODE$SecondaryComponent.access$000(ExpandableStatefulODE.java:298)
            org.apache.commons.math.ode.ExpandableStatefulODE.getTotalDimension(ExpandableStatefulODE.java:101)
            org.apache.commons.math.ode.ExpandableStatefulODE.getCompleteState(ExpandableStatefulODE.java:285)
            org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate(EmbeddedRungeKuttaIntegrator.java:199) */
        dormandPrince54Integrator.integrate(expandableStatefulODE, java.lang.Double.NEGATIVE_INFINITY);
    }
    
    @Test
    public void testIntegrate13() throws Exception  {
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator"));
        double[] vecRelativeTolerance = {};
        dormandPrince54Integrator.vecRelativeTolerance = vecRelativeTolerance;
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        EquationsMapper primaryMapper = ((EquationsMapper) createInstance("org.apache.commons.math.ode.EquationsMapper"));
        setField(expandableStatefulODE, "org.apache.commons.math.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper);
        expandableStatefulODE.setTime(java.lang.Double.NEGATIVE_INFINITY);
        ArrayList components = new ArrayList();
        components.add(null);
        components.add(null);
        Object secondaryComponent = createInstance("org.apache.commons.math.ode.ExpandableStatefulODE$SecondaryComponent");
        components.add(secondaryComponent);
        setField(expandableStatefulODE, "org.apache.commons.math.ode.ExpandableStatefulODE", "components", components);
        
        /* This test fails because method [org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.ExpandableStatefulODE.getTotalDimension(ExpandableStatefulODE.java:102)
            org.apache.commons.math.ode.ExpandableStatefulODE.getCompleteState(ExpandableStatefulODE.java:285)
            org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate(EmbeddedRungeKuttaIntegrator.java:199) */
        dormandPrince54Integrator.integrate(expandableStatefulODE, java.lang.Double.NEGATIVE_INFINITY);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method integrate(org.apache.commons.math.ode.ExpandableStatefulODE, double)
    
    @Test(expected = NumberIsTooSmallException.class)
    public void testIntegrate14() throws Exception  {
        HighamHall54Integrator highamHall54Integrator = ((HighamHall54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.HighamHall54Integrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(-6.699436168886052E-299);
        
        highamHall54Integrator.integrate(expandableStatefulODE, -6.699436168886052E-299);
    }
    
    @Test(expected = NumberIsTooSmallException.class)
    public void testIntegrate15() throws Exception  {
        HighamHall54Integrator highamHall54Integrator = ((HighamHall54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.HighamHall54Integrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(-1.0);
        
        highamHall54Integrator.integrate(expandableStatefulODE, java.lang.Double.NEGATIVE_INFINITY);
    }
    
    @Test(expected = NumberIsTooSmallException.class)
    public void testIntegrate16() throws Exception  {
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(1.7272337110251726E-77);
        
        dormandPrince54Integrator.integrate(expandableStatefulODE, 1.7272337110251726E-77);
    }
    
    @Test(expected = NumberIsTooSmallException.class)
    public void testIntegrate17() throws Exception  {
        HighamHall54Integrator highamHall54Integrator = ((HighamHall54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.HighamHall54Integrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(java.lang.Double.NEGATIVE_INFINITY);
        
        highamHall54Integrator.integrate(expandableStatefulODE, -0.0);
    }
    
    @Test(expected = DimensionMismatchException.class)
    public void testIntegrate18() throws Exception  {
        HighamHall54Integrator highamHall54Integrator = ((HighamHall54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.HighamHall54Integrator"));
        double[] vecAbsoluteTolerance = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        highamHall54Integrator.vecAbsoluteTolerance = vecAbsoluteTolerance;
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        EquationsMapper primaryMapper = ((EquationsMapper) createInstance("org.apache.commons.math.ode.EquationsMapper"));
        setField(expandableStatefulODE, "org.apache.commons.math.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper);
        expandableStatefulODE.setTime(-0.0);
        
        highamHall54Integrator.integrate(expandableStatefulODE, java.lang.Double.NaN);
    }
    
    @Test(expected = DimensionMismatchException.class)
    public void testIntegrate19() throws Exception  {
        HighamHall54Integrator highamHall54Integrator = ((HighamHall54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.HighamHall54Integrator"));
        double[] vecRelativeTolerance = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        highamHall54Integrator.vecRelativeTolerance = vecRelativeTolerance;
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        EquationsMapper primaryMapper = ((EquationsMapper) createInstance("org.apache.commons.math.ode.EquationsMapper"));
        setField(expandableStatefulODE, "org.apache.commons.math.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper);
        expandableStatefulODE.setTime(-0.0);
        
        highamHall54Integrator.integrate(expandableStatefulODE, java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.setSafety
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSafety(double)
    
    /**
    @utbot.classUnderTest {@link EmbeddedRungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#setSafety(double)}
 *  */
    @Test
    public void testSetSafety() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        dormandPrince853Integrator.setSafety(0.0);
        
        dormandPrince853Integrator.setSafety(java.lang.Double.NaN);
        
        double finalDormandPrince853IntegratorSafety = ((Double) getFieldValue(dormandPrince853Integrator, "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "safety"));
        
        assertEquals(java.lang.Double.NaN, finalDormandPrince853IntegratorSafety, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.getSafety
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSafety()
    
    /**
    @utbot.classUnderTest {@link EmbeddedRungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#getSafety()}
 * @utbot.returnsFrom {@code return safety;}
 *  */
    @Test
    public void testGetSafety_ReturnSafety() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        dormandPrince853Integrator.setSafety(0.0);
        
        double actual = dormandPrince853Integrator.getSafety();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.setMaxGrowth
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setMaxGrowth(double)
    
    /**
    @utbot.classUnderTest {@link EmbeddedRungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#setMaxGrowth(double)}
 *  */
    @Test
    public void testSetMaxGrowth() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        dormandPrince853Integrator.setMaxGrowth(0.0);
        
        dormandPrince853Integrator.setMaxGrowth(java.lang.Double.NaN);
        
        double finalDormandPrince853IntegratorMaxGrowth = ((Double) getFieldValue(dormandPrince853Integrator, "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "maxGrowth"));
        
        assertEquals(java.lang.Double.NaN, finalDormandPrince853IntegratorMaxGrowth, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.setMinReduction
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setMinReduction(double)
    
    /**
    @utbot.classUnderTest {@link EmbeddedRungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#setMinReduction(double)}
 *  */
    @Test
    public void testSetMinReduction() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        dormandPrince853Integrator.setMinReduction(0.0);
        
        dormandPrince853Integrator.setMinReduction(java.lang.Double.NaN);
        
        double finalDormandPrince853IntegratorMinReduction = ((Double) getFieldValue(dormandPrince853Integrator, "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "minReduction"));
        
        assertEquals(java.lang.Double.NaN, finalDormandPrince853IntegratorMinReduction, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.getMinReduction
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMinReduction()
    
    /**
    @utbot.classUnderTest {@link EmbeddedRungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#getMinReduction()}
 * @utbot.returnsFrom {@code return minReduction;}
 *  */
    @Test
    public void testGetMinReduction_ReturnMinReduction() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        dormandPrince853Integrator.setMinReduction(0.0);
        
        double actual = dormandPrince853Integrator.getMinReduction();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.getMaxGrowth
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMaxGrowth()
    
    /**
    @utbot.classUnderTest {@link EmbeddedRungeKuttaIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator#getMaxGrowth()}
 * @utbot.returnsFrom {@code return maxGrowth;}
 *  */
    @Test
    public void testGetMaxGrowth_ReturnMaxGrowth() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        dormandPrince853Integrator.setMaxGrowth(0.0);
        
        double actual = dormandPrince853Integrator.getMaxGrowth();
        
        assertEquals(0.0, actual, 1.0E-6);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields727329364709300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields727329364709300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass727329364715400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields727329364709300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass727329364715400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields727329365203000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields727329365203000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass727329365206300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields727329365203000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass727329365206300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

