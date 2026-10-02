package org.apache.commons.math.ode;

import org.junit.Test;
import org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator;
import java.util.HashSet;
import org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator;
import org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator;
import java.util.ArrayList;
import org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math.ode.nonstiff.EulerIntegrator;
import org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math.util.Incrementor;
import org.apache.commons.math.ode.events.EventState;
import java.lang.reflect.Method;
import org.apache.commons.math.exception.DimensionMismatchException;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import org.apache.commons.math.ode.nonstiff.ThreeEighthesIntegrator;
import org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator;
import org.apache.commons.math.ode.nonstiff.MidpointIntegrator;
import org.apache.commons.math.util.Incrementor.MaxCountExceededCallback;
import org.apache.commons.math.exception.MaxCountExceededException;
import org.apache.commons.math.ode.sampling.NordsieckStepInterpolator;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.ode.sampling.AbstractStepInterpolator;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_math_ode_AbstractIntegratorTest {
    ///region Test suites for executable org.apache.commons.math.ode.AbstractIntegrator.getCurrentSignedStepsize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCurrentSignedStepsize()
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#getCurrentSignedStepsize()}
 * @utbot.returnsFrom {@code return stepSize;}
 *  */
    @Test
    public void testGetCurrentSignedStepsize_ReturnStepSize() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        dormandPrince853Integrator.stepSize = 0.0;
        
        double actual = dormandPrince853Integrator.getCurrentSignedStepsize();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.AbstractIntegrator.getCurrentStepStart
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCurrentStepStart()
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#getCurrentStepStart()}
 * @utbot.returnsFrom {@code return stepStart;}
 *  */
    @Test
    public void testGetCurrentStepStart_ReturnStepStart() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        dormandPrince853Integrator.stepStart = 0.0;
        
        double actual = dormandPrince853Integrator.getCurrentStepStart();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.AbstractIntegrator.setStateInitialized
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setStateInitialized(boolean)
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#setStateInitialized(boolean)}
 *  */
    @Test
    public void testSetStateInitialized() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        
        dormandPrince853Integrator.setStateInitialized(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.AbstractIntegrator.clearEventHandlers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clearEventHandlers()
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#clearEventHandlers()}
 * @utbot.invokes {@link java.util.Collection#clear()}
 *  */
    @Test
    public void testClearEventHandlers_CollectionClear() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        HashSet eventsStates = new HashSet();
        setField(dormandPrince853Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        dormandPrince853Integrator.clearEventHandlers();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clearEventHandlers()
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#clearEventHandlers()}
 * @utbot.invokes {@link java.util.Collection#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: eventsStates.clear();
 *  */
    @Test
    public void testClearEventHandlers_ThrowNullPointerException() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.clearEventHandlers] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.AbstractIntegrator.clearEventHandlers(AbstractIntegrator.java:154) */
        dormandPrince853Integrator.clearEventHandlers();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.AbstractIntegrator.addEventHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addEventHandler(org.apache.commons.math.ode.events.EventHandler, double, double, int, org.apache.commons.math.analysis.solvers.UnivariateRealSolver)
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#addEventHandler(org.apache.commons.math.ode.events.EventHandler,double,double,int,org.apache.commons.math.analysis.solvers.UnivariateRealSolver)}
 *  */
    @Test
    public void testAddEventHandler_1() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        HashSet eventsStates = new HashSet();
        setField(dormandPrince853Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        dormandPrince853Integrator.addEventHandler(null, java.lang.Double.NaN, java.lang.Double.NaN, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#addEventHandler(org.apache.commons.math.ode.events.EventHandler,double,double,int,org.apache.commons.math.analysis.solvers.UnivariateRealSolver)}
 *  */
    @Test
    public void testAddEventHandler() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        HashSet eventsStates = new HashSet();
        eventsStates.add(null);
        setField(dormandPrince853Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        dormandPrince853Integrator.addEventHandler(null, java.lang.Double.NaN, -4.9E-324, -255, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addEventHandler(org.apache.commons.math.ode.events.EventHandler, double, double, int, org.apache.commons.math.analysis.solvers.UnivariateRealSolver)
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#addEventHandler(org.apache.commons.math.ode.events.EventHandler,double,double,int,org.apache.commons.math.analysis.solvers.UnivariateRealSolver)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: eventsStates.add(new EventState(handler, maxCheckInterval, convergence, maxIterationCount, solver));
 *  */
    @Test
    public void testAddEventHandler_ThrowNullPointerException() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.addEventHandler] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:139) */
        dormandPrince853Integrator.addEventHandler(null, java.lang.Double.NaN, -4.9E-324, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#addEventHandler(org.apache.commons.math.ode.events.EventHandler,double,double,int,org.apache.commons.math.analysis.solvers.UnivariateRealSolver)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: eventsStates.add(new EventState(handler, maxCheckInterval, convergence, maxIterationCount, solver));
 *  */
    @Test
    public void testAddEventHandler_ThrowNullPointerException_1() throws Exception  {
        AdamsBashforthIntegrator adamsBashforthIntegrator = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator"));
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.addEventHandler] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:139) */
        adamsBashforthIntegrator.addEventHandler(null, java.lang.Double.NaN, -0.0, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#addEventHandler(org.apache.commons.math.ode.events.EventHandler,double,double,int,org.apache.commons.math.analysis.solvers.UnivariateRealSolver)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: eventsStates.add(new EventState(handler, maxCheckInterval, convergence, maxIterationCount, solver));
 *  */
    @Test
    public void testAddEventHandler_ThrowNullPointerException_2() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.addEventHandler] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:139) */
        dormandPrince853Integrator.addEventHandler(null, java.lang.Double.NaN, java.lang.Double.NaN, -255, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.AbstractIntegrator.addEventHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addEventHandler(org.apache.commons.math.ode.events.EventHandler, double, double, int)
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#addEventHandler(org.apache.commons.math.ode.events.EventHandler,double,double,int)}
 *  */
    @Test
    public void testAddEventHandler_11() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        HashSet eventsStates = new HashSet();
        setField(dormandPrince853Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        dormandPrince853Integrator.addEventHandler(null, java.lang.Double.NaN, java.lang.Double.NaN, -255);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#addEventHandler(org.apache.commons.math.ode.events.EventHandler,double,double,int)}
 *  */
    @Test
    public void testAddEventHandler1() throws Exception  {
        AdamsMoultonIntegrator adamsMoultonIntegrator = ((AdamsMoultonIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator"));
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(adamsMoultonIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        adamsMoultonIntegrator.addEventHandler(null, java.lang.Double.NaN, -4.9E-324, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addEventHandler(org.apache.commons.math.ode.events.EventHandler, double, double, int)
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#addEventHandler(org.apache.commons.math.ode.events.EventHandler,double,double,int)}
 * @utbot.invokes {@link org.apache.commons.math.ode.AbstractIntegrator#addEventHandler(org.apache.commons.math.ode.events.EventHandler,double,double,int,org.apache.commons.math.analysis.solvers.UnivariateRealSolver)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: addEventHandler(handler, maxCheckInterval, convergence, maxIterationCount, new BracketingNthOrderBrentSolver(convergence, 5));
 *  */
    @Test
    public void testAddEventHandler_ThrowNegativeArraySizeException() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator"));
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "maxOrder", -1073741824);
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.addEventHandler] produces [java.lang.NegativeArraySizeException: -536870912]
            org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.initializeArrays(GraggBulirschStoerIntegrator.java:367)
            org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.addEventHandler(GraggBulirschStoerIntegrator.java:356)
            org.apache.commons.math.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:128) */
        graggBulirschStoerIntegrator.addEventHandler(null, 2.2250738585072024E-308, -2.2250738585072014E-307, -255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addEventHandler(org.apache.commons.math.ode.events.EventHandler, double, double, int)
    
    @Test
    public void testAddEventHandler2() throws Exception  {
        EulerIntegrator eulerIntegrator = ((EulerIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.EulerIntegrator"));
        HashSet eventsStates = new HashSet();
        setField(eulerIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        eulerIntegrator.addEventHandler(null, java.lang.Double.NaN, -4.9E-324, 0);
    }
    
    @Test
    public void testAddEventHandler3() throws Exception  {
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator"));
        HashSet eventsStates = new HashSet();
        eventsStates.add(null);
        setField(dormandPrince54Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        dormandPrince54Integrator.addEventHandler(null, java.lang.Double.NaN, -0.0, 0);
    }
    
    @Test
    public void testAddEventHandler4() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator"));
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "maxOrder", 46);
        int[] sequence = new int[40];
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence", sequence);
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        int[] initialGraggBulirschStoerIntegratorSequence = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence"));
        int[] initialGraggBulirschStoerIntegratorCostPerStep = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerStep"));
        double[] initialGraggBulirschStoerIntegratorCostPerTimeUnit = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerTimeUnit"));
        double[] initialGraggBulirschStoerIntegratorOptimalStep = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "optimalStep"));
        double[][] initialGraggBulirschStoerIntegratorCoeff = ((double[][]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff"));
        
        graggBulirschStoerIntegrator.addEventHandler(null, java.lang.Double.NaN, java.lang.Double.NaN, 0);
        
        int[] finalGraggBulirschStoerIntegratorSequence = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence"));
        int[] finalGraggBulirschStoerIntegratorCostPerStep = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerStep"));
        double[] finalGraggBulirschStoerIntegratorCostPerTimeUnit = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerTimeUnit"));
        double[] finalGraggBulirschStoerIntegratorOptimalStep = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "optimalStep"));
        double[][] finalGraggBulirschStoerIntegratorCoeff = ((double[][]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff"));
        
        assertFalse(initialGraggBulirschStoerIntegratorSequence == finalGraggBulirschStoerIntegratorSequence);
        
        assertFalse(initialGraggBulirschStoerIntegratorCostPerStep == finalGraggBulirschStoerIntegratorCostPerStep);
        
        assertFalse(initialGraggBulirschStoerIntegratorCostPerTimeUnit == finalGraggBulirschStoerIntegratorCostPerTimeUnit);
        
        assertFalse(initialGraggBulirschStoerIntegratorOptimalStep == finalGraggBulirschStoerIntegratorOptimalStep);
        
        assertFalse(initialGraggBulirschStoerIntegratorCoeff == finalGraggBulirschStoerIntegratorCoeff);
    }
    
    @Test
    public void testAddEventHandler5() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator"));
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "maxOrder", 18);
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        int[] initialGraggBulirschStoerIntegratorSequence = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence"));
        int[] initialGraggBulirschStoerIntegratorCostPerStep = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerStep"));
        double[] initialGraggBulirschStoerIntegratorCostPerTimeUnit = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerTimeUnit"));
        double[] initialGraggBulirschStoerIntegratorOptimalStep = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "optimalStep"));
        double[][] initialGraggBulirschStoerIntegratorCoeff = ((double[][]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff"));
        
        graggBulirschStoerIntegrator.addEventHandler(null, java.lang.Double.NaN, -4.9E-324, 0);
        
        int[] finalGraggBulirschStoerIntegratorSequence = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence"));
        int[] finalGraggBulirschStoerIntegratorCostPerStep = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerStep"));
        double[] finalGraggBulirschStoerIntegratorCostPerTimeUnit = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerTimeUnit"));
        double[] finalGraggBulirschStoerIntegratorOptimalStep = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "optimalStep"));
        double[][] finalGraggBulirschStoerIntegratorCoeff = ((double[][]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff"));
        
        assertFalse(initialGraggBulirschStoerIntegratorSequence == finalGraggBulirschStoerIntegratorSequence);
        
        assertFalse(initialGraggBulirschStoerIntegratorCostPerStep == finalGraggBulirschStoerIntegratorCostPerStep);
        
        assertFalse(initialGraggBulirschStoerIntegratorCostPerTimeUnit == finalGraggBulirschStoerIntegratorCostPerTimeUnit);
        
        assertFalse(initialGraggBulirschStoerIntegratorOptimalStep == finalGraggBulirschStoerIntegratorOptimalStep);
        
        assertFalse(initialGraggBulirschStoerIntegratorCoeff == finalGraggBulirschStoerIntegratorCoeff);
    }
    
    @Test
    public void testAddEventHandler6() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator"));
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "maxOrder", 2);
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        int[] initialGraggBulirschStoerIntegratorSequence = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence"));
        int[] initialGraggBulirschStoerIntegratorCostPerStep = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerStep"));
        double[] initialGraggBulirschStoerIntegratorCostPerTimeUnit = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerTimeUnit"));
        double[] initialGraggBulirschStoerIntegratorOptimalStep = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "optimalStep"));
        double[][] initialGraggBulirschStoerIntegratorCoeff = ((double[][]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff"));
        
        graggBulirschStoerIntegrator.addEventHandler(null, java.lang.Double.NaN, 3.785766995761224E-270, 0);
        
        int[] finalGraggBulirschStoerIntegratorSequence = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence"));
        int[] finalGraggBulirschStoerIntegratorCostPerStep = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerStep"));
        double[] finalGraggBulirschStoerIntegratorCostPerTimeUnit = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerTimeUnit"));
        double[] finalGraggBulirschStoerIntegratorOptimalStep = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "optimalStep"));
        double[][] finalGraggBulirschStoerIntegratorCoeff = ((double[][]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff"));
        
        assertFalse(initialGraggBulirschStoerIntegratorSequence == finalGraggBulirschStoerIntegratorSequence);
        
        assertFalse(initialGraggBulirschStoerIntegratorCostPerStep == finalGraggBulirschStoerIntegratorCostPerStep);
        
        assertFalse(initialGraggBulirschStoerIntegratorCostPerTimeUnit == finalGraggBulirschStoerIntegratorCostPerTimeUnit);
        
        assertFalse(initialGraggBulirschStoerIntegratorOptimalStep == finalGraggBulirschStoerIntegratorOptimalStep);
        
        assertFalse(initialGraggBulirschStoerIntegratorCoeff == finalGraggBulirschStoerIntegratorCoeff);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addEventHandler(org.apache.commons.math.ode.events.EventHandler, double, double, int)
    
    @Test
    public void testAddEventHandler7() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator"));
        HashSet eventsStates = new HashSet();
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.addEventHandler] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.initializeArrays(GraggBulirschStoerIntegrator.java:381)
            org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.addEventHandler(GraggBulirschStoerIntegrator.java:356)
            org.apache.commons.math.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:128) */
        graggBulirschStoerIntegrator.addEventHandler(null, -1.0E-323, java.lang.Double.NaN, 0);
    }
    
    @Test
    public void testAddEventHandler8() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator"));
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "maxOrder", -2147483640);
        int[] sequence = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence", sequence);
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.addEventHandler] produces [java.lang.NegativeArraySizeException: -1073741820]
            org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.initializeArrays(GraggBulirschStoerIntegrator.java:367)
            org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.addEventHandler(GraggBulirschStoerIntegrator.java:356)
            org.apache.commons.math.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:128) */
        graggBulirschStoerIntegrator.addEventHandler(null, -2.0, java.lang.Double.NaN, 0);
    }
    
    @Test
    public void testAddEventHandler9() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator"));
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "maxOrder", -2147483640);
        int[] sequence = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence", sequence);
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.addEventHandler] produces [java.lang.NegativeArraySizeException: -1073741820]
            org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.initializeArrays(GraggBulirschStoerIntegrator.java:367)
            org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.addEventHandler(GraggBulirschStoerIntegrator.java:356)
            org.apache.commons.math.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:128) */
        graggBulirschStoerIntegrator.addEventHandler(null, -2.0, -2.0, 0);
    }
    
    @Test
    public void testAddEventHandler10() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator"));
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "maxOrder", -2147483640);
        int[] sequence = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence", sequence);
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.addEventHandler] produces [java.lang.NegativeArraySizeException: -1073741820]
            org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.initializeArrays(GraggBulirschStoerIntegrator.java:367)
            org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.addEventHandler(GraggBulirschStoerIntegrator.java:356)
            org.apache.commons.math.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:128) */
        graggBulirschStoerIntegrator.addEventHandler(null, -2.0, -0.0, 0);
    }
    
    @Test
    public void testAddEventHandler11() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator"));
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "maxOrder", -1073741824);
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.addEventHandler] produces [java.lang.NegativeArraySizeException: -536870912]
            org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.initializeArrays(GraggBulirschStoerIntegrator.java:367)
            org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.addEventHandler(GraggBulirschStoerIntegrator.java:356)
            org.apache.commons.math.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:128) */
        graggBulirschStoerIntegrator.addEventHandler(null, -0.0, 0.0, 0);
    }
    
    @Test
    public void testAddEventHandler12() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator"));
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "maxOrder", -1073741824);
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.addEventHandler] produces [java.lang.NegativeArraySizeException: -536870912]
            org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.initializeArrays(GraggBulirschStoerIntegrator.java:367)
            org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.addEventHandler(GraggBulirschStoerIntegrator.java:356)
            org.apache.commons.math.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:128) */
        graggBulirschStoerIntegrator.addEventHandler(null, java.lang.Double.NaN, java.lang.Double.NaN, 0);
    }
    
    @Test
    public void testAddEventHandler13() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator"));
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "maxOrder", -1);
        int[] sequence = {};
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence", sequence);
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.addEventHandler] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.initializeArrays(GraggBulirschStoerIntegrator.java:381)
            org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.addEventHandler(GraggBulirschStoerIntegrator.java:356)
            org.apache.commons.math.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:128) */
        graggBulirschStoerIntegrator.addEventHandler(null, java.lang.Double.NaN, -0.0, 0);
    }
    
    @Test
    public void testAddEventHandler14() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator"));
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "maxOrder", 1);
        int[] sequence = {};
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence", sequence);
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.addEventHandler] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.initializeArrays(GraggBulirschStoerIntegrator.java:381)
            org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.addEventHandler(GraggBulirschStoerIntegrator.java:356)
            org.apache.commons.math.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:128) */
        graggBulirschStoerIntegrator.addEventHandler(null, java.lang.Double.NaN, java.lang.Double.NaN, 0);
    }
    
    @Test
    public void testAddEventHandler15() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator"));
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "maxOrder", 1);
        int[] sequence = {};
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence", sequence);
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.addEventHandler] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.initializeArrays(GraggBulirschStoerIntegrator.java:381)
            org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.addEventHandler(GraggBulirschStoerIntegrator.java:356)
            org.apache.commons.math.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:128) */
        graggBulirschStoerIntegrator.addEventHandler(null, java.lang.Double.NaN, -4.9E-324, 0);
    }
    
    @Test
    public void testAddEventHandler16() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator"));
        int[] sequence = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence", sequence);
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.addEventHandler] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.initializeArrays(GraggBulirschStoerIntegrator.java:381)
            org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.addEventHandler(GraggBulirschStoerIntegrator.java:356)
            org.apache.commons.math.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:128) */
        graggBulirschStoerIntegrator.addEventHandler(null, 2.2250738585072024E-308, java.lang.Double.NaN, 0);
    }
    
    @Test
    public void testAddEventHandler17() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator"));
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.addEventHandler] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.initializeArrays(GraggBulirschStoerIntegrator.java:381)
            org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.addEventHandler(GraggBulirschStoerIntegrator.java:356)
            org.apache.commons.math.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:128) */
        graggBulirschStoerIntegrator.addEventHandler(null, 2.2250738585072024E-308, -4.9E-324, 0);
    }
    
    @Test
    public void testAddEventHandler18() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator"));
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "maxOrder", 65);
        int[] sequence = new int[32];
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence", sequence);
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.addEventHandler] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.initializeArrays(GraggBulirschStoerIntegrator.java:381)
            org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.addEventHandler(GraggBulirschStoerIntegrator.java:356)
            org.apache.commons.math.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:128) */
        graggBulirschStoerIntegrator.addEventHandler(null, java.lang.Double.NaN, -0.0, 0);
    }
    
    @Test
    public void testAddEventHandler19() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator"));
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "maxOrder", 65);
        int[] sequence = new int[32];
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence", sequence);
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.addEventHandler] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.initializeArrays(GraggBulirschStoerIntegrator.java:381)
            org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.addEventHandler(GraggBulirschStoerIntegrator.java:356)
            org.apache.commons.math.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:128) */
        graggBulirschStoerIntegrator.addEventHandler(null, java.lang.Double.NaN, java.lang.Double.NaN, 0);
    }
    
    @Test
    public void testAddEventHandler20() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator"));
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "maxOrder", 65);
        int[] sequence = new int[32];
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence", sequence);
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.addEventHandler] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.initializeArrays(GraggBulirschStoerIntegrator.java:381)
            org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.addEventHandler(GraggBulirschStoerIntegrator.java:356)
            org.apache.commons.math.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:128) */
        graggBulirschStoerIntegrator.addEventHandler(null, java.lang.Double.NaN, -4.9E-324, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.AbstractIntegrator.setMaxEvaluations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setMaxEvaluations(int)
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#setMaxEvaluations(int)}
 * @utbot.executesCondition {@code ((maxEvaluations < 0)): True}
 * @utbot.invokes {@link org.apache.commons.math.util.Incrementor#setMaximalCount(int)}
 *  */
    @Test
    public void testSetMaxEvaluations_MaxEvaluationsLessThanZero() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(dormandPrince853Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "evaluations", evaluations);
        
        dormandPrince853Integrator.setMaxEvaluations(-1);
        
        Incrementor dormandPrince853IntegratorEvaluations = ((Incrementor) getFieldValue(dormandPrince853Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "evaluations"));
        int finalDormandPrince853IntegratorEvaluationsMaximalCount = ((Integer) getFieldValue(dormandPrince853IntegratorEvaluations, "org.apache.commons.math.util.Incrementor", "maximalCount"));
        
        org.junit.Assert.assertEquals(Integer.MAX_VALUE, finalDormandPrince853IntegratorEvaluationsMaximalCount);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setMaxEvaluations(int)
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#setMaxEvaluations(int)}
 * @utbot.executesCondition {@code ((maxEvaluations < 0)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: evaluations.setMaximalCount((maxEvaluations < 0) ? Integer.MAX_VALUE : maxEvaluations);
 *  */
    @Test
    public void testSetMaxEvaluations_ThrowNullPointerException() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.setMaxEvaluations] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.AbstractIntegrator.setMaxEvaluations(AbstractIntegrator.java:169) */
        dormandPrince853Integrator.setMaxEvaluations(0);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#setMaxEvaluations(int)}
 * @utbot.executesCondition {@code ((maxEvaluations < 0)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: evaluations.setMaximalCount((maxEvaluations < 0) ? Integer.MAX_VALUE : maxEvaluations);
 *  */
    @Test
    public void testSetMaxEvaluations_ThrowNullPointerException_1() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.setMaxEvaluations] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.AbstractIntegrator.setMaxEvaluations(AbstractIntegrator.java:169) */
        dormandPrince853Integrator.setMaxEvaluations(-1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.AbstractIntegrator.clearStepHandlers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clearStepHandlers()
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#clearStepHandlers()}
 * @utbot.invokes {@link java.util.Collection#clear()}
 *  */
    @Test
    public void testClearStepHandlers_CollectionClear() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        HashSet stepHandlers = new HashSet();
        setField(dormandPrince853Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "stepHandlers", stepHandlers);
        
        dormandPrince853Integrator.clearStepHandlers();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clearStepHandlers()
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#clearStepHandlers()}
 * @utbot.invokes {@link java.util.Collection#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: stepHandlers.clear();
 *  */
    @Test
    public void testClearStepHandlers_ThrowNullPointerException() throws Exception  {
        AdamsMoultonIntegrator adamsMoultonIntegrator = ((AdamsMoultonIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator"));
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.clearStepHandlers] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.AbstractIntegrator.clearStepHandlers(AbstractIntegrator.java:120) */
        adamsMoultonIntegrator.clearStepHandlers();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.AbstractIntegrator.getMaxEvaluations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMaxEvaluations()
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#getMaxEvaluations()}
 * @utbot.invokes {@link org.apache.commons.math.util.Incrementor#getMaximalCount()}
 * @utbot.returnsFrom {@code return evaluations.getMaximalCount();}
 *  */
    @Test
    public void testGetMaxEvaluations_IncrementorGetMaximalCount() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(-255);
        setField(dormandPrince853Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "evaluations", evaluations);
        
        int actual = dormandPrince853Integrator.getMaxEvaluations();
        
        org.junit.Assert.assertEquals(-255, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getMaxEvaluations()
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#getMaxEvaluations()}
 * @utbot.invokes {@link org.apache.commons.math.util.Incrementor#getMaximalCount()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return evaluations.getMaximalCount();
 *  */
    @Test
    public void testGetMaxEvaluations_ThrowNullPointerException() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.getMaxEvaluations] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.AbstractIntegrator.getMaxEvaluations(AbstractIntegrator.java:174) */
        dormandPrince853Integrator.getMaxEvaluations();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.AbstractIntegrator.getStepHandlers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getStepHandlers()
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#getStepHandlers()}
 * @utbot.invokes {@link java.util.Collections#unmodifiableCollection(java.util.Collection)}
 * @utbot.returnsFrom {@code return Collections.unmodifiableCollection(stepHandlers);}
 *  */
    @Test
    public void testGetStepHandlers_CollectionsUnmodifiableCollection() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        HashSet stepHandlers = new HashSet();
        setField(dormandPrince853Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "stepHandlers", stepHandlers);
        
        Object actual = dormandPrince853Integrator.getStepHandlers();
        
        Object expected = createInstance("java.util.Collections$UnmodifiableCollection");
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.AbstractIntegrator.resetEvaluations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method resetEvaluations()
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#resetEvaluations()}
 * @utbot.invokes {@link org.apache.commons.math.util.Incrementor#resetCount()}
 *  */
    @Test
    public void testResetEvaluations_IncrementorResetCount() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", -255);
        setField(dormandPrince853Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "evaluations", evaluations);
        
        dormandPrince853Integrator.resetEvaluations();
        
        Incrementor dormandPrince853IntegratorEvaluations = ((Incrementor) getFieldValue(dormandPrince853Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "evaluations"));
        int finalDormandPrince853IntegratorEvaluationsCount = ((Integer) getFieldValue(dormandPrince853IntegratorEvaluations, "org.apache.commons.math.util.Incrementor", "count"));
        
        org.junit.Assert.assertEquals(0, finalDormandPrince853IntegratorEvaluationsCount);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resetEvaluations()
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#resetEvaluations()}
 * @utbot.invokes {@link org.apache.commons.math.util.Incrementor#resetCount()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: evaluations.resetCount();
 *  */
    @Test
    public void testResetEvaluations_ThrowNullPointerException() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.resetEvaluations] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.AbstractIntegrator.resetEvaluations(AbstractIntegrator.java:185) */
        dormandPrince853Integrator.resetEvaluations();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.AbstractIntegrator.setEquations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setEquations(org.apache.commons.math.ode.ExpandableStatefulODE)
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#setEquations(org.apache.commons.math.ode.ExpandableStatefulODE)}
 *  */
    @Test
    public void testSetEquations() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        
        dormandPrince853Integrator.setEquations(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.AbstractIntegrator.getEventHandlers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEventHandlers()
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#getEventHandlers()}
 * @utbot.returnsFrom {@code return Collections.unmodifiableCollection(list);}
 *  */
    @Test
    public void testGetEventHandlers_ReturnCollectionsUnmodifiableCollection() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        ArrayList eventsStates = new ArrayList();
        setField(dormandPrince853Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        Object actual = dormandPrince853Integrator.getEventHandlers();
        
        Object expected = createInstance("java.util.Collections$UnmodifiableCollection");
        
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#getEventHandlers()}
 * @utbot.iterates iterate the loop {@code for(EventState state: eventsStates)} once
 * @utbot.returnsFrom {@code return Collections.unmodifiableCollection(list);}
 *  */
    @Test
    public void testGetEventHandlers_ListAdd() throws Exception  {
        AdamsBashforthIntegrator adamsBashforthIntegrator = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator"));
        ArrayList eventsStates = new ArrayList();
        EventState eventState = ((EventState) createInstance("org.apache.commons.math.ode.events.EventState"));
        eventsStates.add(eventState);
        setField(adamsBashforthIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        Object actual = adamsBashforthIntegrator.getEventHandlers();
        
        Object expected = createInstance("java.util.Collections$UnmodifiableCollection");
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getEventHandlers()
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#getEventHandlers()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(EventState state: eventsStates)
 *  */
    @Test
    public void testGetEventHandlers_ThrowNullPointerException() throws Exception  {
        AdamsBashforthIntegrator adamsBashforthIntegrator = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator"));
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.getEventHandlers] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.AbstractIntegrator.getEventHandlers(AbstractIntegrator.java:146) */
        adamsBashforthIntegrator.getEventHandlers();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#getEventHandlers()}
 * @utbot.iterates iterate the loop {@code for(EventState state: eventsStates)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: list.add(state.getEventHandler());
 *  */
    @Test
    public void testGetEventHandlers_ThrowNullPointerException_1() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        HashSet eventsStates = new HashSet();
        eventsStates.add(null);
        setField(dormandPrince853Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.getEventHandlers] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.AbstractIntegrator.getEventHandlers(AbstractIntegrator.java:147) */
        dormandPrince853Integrator.getEventHandlers();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#getEventHandlers()}
 * @utbot.iterates iterate the loop {@code for(EventState state: eventsStates)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} in: list.add(state.getEventHandler());
 *  */
    @Test
    public void testGetEventHandlers_ThrowNullPointerException_2() throws Exception  {
        AdamsMoultonIntegrator adamsMoultonIntegrator = ((AdamsMoultonIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator"));
        HashSet eventsStates = new HashSet();
        EventState eventState = ((EventState) createInstance("org.apache.commons.math.ode.events.EventState"));
        eventsStates.add(eventState);
        eventsStates.add(null);
        setField(adamsMoultonIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.getEventHandlers] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.AbstractIntegrator.getEventHandlers(AbstractIntegrator.java:147) */
        adamsMoultonIntegrator.getEventHandlers();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.AbstractIntegrator.getEvaluations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEvaluations()
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#getEvaluations()}
 * @utbot.invokes {@link org.apache.commons.math.util.Incrementor#getCount()}
 * @utbot.returnsFrom {@code return evaluations.getCount();}
 *  */
    @Test
    public void testGetEvaluations_IncrementorGetCount() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", -255);
        setField(dormandPrince853Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "evaluations", evaluations);
        
        int actual = dormandPrince853Integrator.getEvaluations();
        
        org.junit.Assert.assertEquals(-255, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getEvaluations()
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#getEvaluations()}
 * @utbot.invokes {@link org.apache.commons.math.util.Incrementor#getCount()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return evaluations.getCount();
 *  */
    @Test
    public void testGetEvaluations_ThrowNullPointerException() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.getEvaluations] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.AbstractIntegrator.getEvaluations(AbstractIntegrator.java:179) */
        dormandPrince853Integrator.getEvaluations();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.AbstractIntegrator.integrate
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, [D, double, [D)
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: y.length != equations.getDimension()
 *  */
    @Test
    public void testIntegrate_ThrowNullPointerException_2() throws Exception  {
        AdamsMoultonIntegrator adamsMoultonIntegrator = ((AdamsMoultonIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator"));
        FirstOrderConverter firstOrderConverter = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.AbstractIntegrator.integrate(AbstractIntegrator.java:203) */
        adamsMoultonIntegrator.integrate(firstOrderConverter, java.lang.Double.NaN, doubleArray, java.lang.Double.NaN, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: y0.length != equations.getDimension()
 *  */
    @Test
    public void testIntegrate_ThrowNullPointerException_1() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.AbstractIntegrator.integrate(AbstractIntegrator.java:200) */
        dormandPrince853Integrator.integrate(null, java.lang.Double.NaN, doubleArray, java.lang.Double.NaN, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: y.length != equations.getDimension()
 *  */
    @Test
    public void testIntegrate_ThrowNullPointerException_3() throws Throwable  {
        AdamsMoultonIntegrator adamsMoultonIntegrator = ((AdamsMoultonIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator"));
        Object mainStateJacobianWrapper = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        FirstOrderConverter ode = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        setField(mainStateJacobianWrapper, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.AbstractIntegrator.integrate(AbstractIntegrator.java:203) */
        Class abstractIntegratorClazz = Class.forName("org.apache.commons.math.ode.AbstractIntegrator");
        Class mainStateJacobianWrapperType = Class.forName("org.apache.commons.math.ode.FirstOrderDifferentialEquations");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method integrateMethod = abstractIntegratorClazz.getDeclaredMethod("integrate", mainStateJacobianWrapperType, doubleType, doubleArrayType, doubleType, doubleArrayType);
        integrateMethod.setAccessible(true);
        java.lang.Object[] integrateMethodArguments = new java.lang.Object[5];
        integrateMethodArguments[0] = mainStateJacobianWrapper;
        integrateMethodArguments[1] = java.lang.Double.NaN;
        integrateMethodArguments[2] = ((Object) doubleArray);
        integrateMethodArguments[3] = java.lang.Double.NaN;
        integrateMethodArguments[4] = ((Object) null);
        try {
            integrateMethod.invoke(adamsMoultonIntegrator, integrateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: y0.length != equations.getDimension()
 *  */
    @Test
    public void testIntegrate_ThrowNullPointerException() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.AbstractIntegrator.integrate(AbstractIntegrator.java:200) */
        dormandPrince853Integrator.integrate(null, java.lang.Double.NaN, null, java.lang.Double.NaN, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, [D, double, [D)
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[])}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} when: y.length != equations.getDimension()
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testIntegrate_ThrowDimensionMismatchException_1() throws Exception  {
        AdamsBashforthIntegrator adamsBashforthIntegrator = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator"));
        FirstOrderConverter firstOrderConverter = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        setField(firstOrderConverter, "org.apache.commons.math.ode.FirstOrderConverter", "dimension", 1);
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        adamsBashforthIntegrator.integrate(firstOrderConverter, java.lang.Double.NaN, doubleArray, java.lang.Double.NaN, doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[])}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NumberIsTooSmallException} in: integrate(expandableODE, t);
 *  */
    @Test(expected = NumberIsTooSmallException.class)
    public void testIntegrate_ThrowNumberIsTooSmallException() throws Exception  {
        AdamsBashforthIntegrator adamsBashforthIntegrator = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator"));
        FirstOrderConverter firstOrderConverter = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        double[] doubleArray = {};
        double[] doubleArray1 = {};
        
        adamsBashforthIntegrator.integrate(firstOrderConverter, -8.991085969997845E-308, doubleArray, java.lang.Double.NEGATIVE_INFINITY, doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[])}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} when: y0.length != equations.getDimension()
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testIntegrate_ThrowDimensionMismatchException() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        FirstOrderConverter firstOrderConverter = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        setField(firstOrderConverter, "org.apache.commons.math.ode.FirstOrderConverter", "dimension", 2147483646);
        double[] doubleArray = {0.0, 0.0};
        
        dormandPrince853Integrator.integrate(firstOrderConverter, java.lang.Double.NaN, doubleArray, java.lang.Double.NaN, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[])}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} when: y.length != equations.getDimension()
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testIntegrate_ThrowDimensionMismatchException_4() throws Throwable  {
        AdamsBashforthIntegrator adamsBashforthIntegrator = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator"));
        Object mainStateJacobianWrapper = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        FirstOrderConverter ode = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        setField(ode, "org.apache.commons.math.ode.FirstOrderConverter", "dimension", 1);
        setField(mainStateJacobianWrapper, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode);
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        Class abstractIntegratorClazz = Class.forName("org.apache.commons.math.ode.AbstractIntegrator");
        Class mainStateJacobianWrapperType = Class.forName("org.apache.commons.math.ode.FirstOrderDifferentialEquations");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method integrateMethod = abstractIntegratorClazz.getDeclaredMethod("integrate", mainStateJacobianWrapperType, doubleType, doubleArrayType, doubleType, doubleArrayType);
        integrateMethod.setAccessible(true);
        java.lang.Object[] integrateMethodArguments = new java.lang.Object[5];
        integrateMethodArguments[0] = mainStateJacobianWrapper;
        integrateMethodArguments[1] = java.lang.Double.NaN;
        integrateMethodArguments[2] = ((Object) doubleArray);
        integrateMethodArguments[3] = java.lang.Double.NaN;
        integrateMethodArguments[4] = ((Object) doubleArray1);
        try {
            integrateMethod.invoke(adamsBashforthIntegrator, integrateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[])}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: integrate(expandableODE, t);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testIntegrate_ThrowDimensionMismatchException_2() throws Exception  {
        AdamsBashforthIntegrator adamsBashforthIntegrator = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator"));
        double[] vecAbsoluteTolerance = {};
        setField(adamsBashforthIntegrator, "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", "vecAbsoluteTolerance", vecAbsoluteTolerance);
        double[] vecRelativeTolerance = {0.0, 0.0};
        setField(adamsBashforthIntegrator, "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", "vecRelativeTolerance", vecRelativeTolerance);
        FirstOrderConverter firstOrderConverter = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        double[] doubleArray = {};
        
        adamsBashforthIntegrator.integrate(firstOrderConverter, java.lang.Double.NEGATIVE_INFINITY, doubleArray, java.lang.Double.NEGATIVE_INFINITY, doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[])}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} when: y0.length != equations.getDimension()
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testIntegrate_ThrowDimensionMismatchException_3() throws Throwable  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        Object mainStateJacobianWrapper = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        FirstOrderConverter ode1 = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        setField(ode1, "org.apache.commons.math.ode.FirstOrderConverter", "dimension", 2147483646);
        setField(ode, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode1);
        setField(mainStateJacobianWrapper, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode);
        double[] doubleArray = {0.0, 0.0};
        
        Class abstractIntegratorClazz = Class.forName("org.apache.commons.math.ode.AbstractIntegrator");
        Class mainStateJacobianWrapperType = Class.forName("org.apache.commons.math.ode.FirstOrderDifferentialEquations");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method integrateMethod = abstractIntegratorClazz.getDeclaredMethod("integrate", mainStateJacobianWrapperType, doubleType, doubleArrayType, doubleType, doubleArrayType);
        integrateMethod.setAccessible(true);
        java.lang.Object[] integrateMethodArguments = new java.lang.Object[5];
        integrateMethodArguments[0] = mainStateJacobianWrapper;
        integrateMethodArguments[1] = java.lang.Double.NaN;
        integrateMethodArguments[2] = ((Object) doubleArray);
        integrateMethodArguments[3] = java.lang.Double.NaN;
        integrateMethodArguments[4] = ((Object) null);
        try {
            integrateMethod.invoke(dormandPrince853Integrator, integrateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, [D, double, [D)
    
    @Test(expected = StackOverflowError.class)
    public void testIntegrate1() throws Throwable  {
        ThreeEighthesIntegrator threeEighthesIntegrator = ((ThreeEighthesIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.ThreeEighthesIntegrator"));
        Object mainStateJacobianWrapper = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        setField(ode, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode);
        setField(mainStateJacobianWrapper, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode);
        double[] doubleArray = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        
        Class abstractIntegratorClazz = Class.forName("org.apache.commons.math.ode.AbstractIntegrator");
        Class mainStateJacobianWrapperType = Class.forName("org.apache.commons.math.ode.FirstOrderDifferentialEquations");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method integrateMethod = abstractIntegratorClazz.getDeclaredMethod("integrate", mainStateJacobianWrapperType, doubleType, doubleArrayType, doubleType, doubleArrayType);
        integrateMethod.setAccessible(true);
        java.lang.Object[] integrateMethodArguments = new java.lang.Object[5];
        integrateMethodArguments[0] = mainStateJacobianWrapper;
        integrateMethodArguments[1] = java.lang.Double.NaN;
        integrateMethodArguments[2] = ((Object) doubleArray);
        integrateMethodArguments[3] = java.lang.Double.NaN;
        integrateMethodArguments[4] = ((Object) doubleArray);
        try {
            integrateMethod.invoke(threeEighthesIntegrator, integrateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testIntegrate2() throws Exception  {
        AdamsBashforthIntegrator adamsBashforthIntegrator = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator"));
        FirstOrderConverter firstOrderConverter = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.AbstractIntegrator.resetEvaluations(AbstractIntegrator.java:185)
            org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator.integrate(AdamsBashforthIntegrator.java:197)
            org.apache.commons.math.ode.AbstractIntegrator.integrate(AbstractIntegrator.java:213) */
        adamsBashforthIntegrator.integrate(firstOrderConverter, 2.7059462195904512E17, doubleArray, -0.0, doubleArray);
    }
    
    @Test
    public void testIntegrate3() throws Exception  {
        AdamsBashforthIntegrator adamsBashforthIntegrator = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator"));
        FirstOrderConverter firstOrderConverter = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        setField(firstOrderConverter, "org.apache.commons.math.ode.FirstOrderConverter", "dimension", 1);
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.AbstractIntegrator.resetEvaluations(AbstractIntegrator.java:185)
            org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator.integrate(AdamsBashforthIntegrator.java:197)
            org.apache.commons.math.ode.AbstractIntegrator.integrate(AbstractIntegrator.java:213) */
        adamsBashforthIntegrator.integrate(firstOrderConverter, 6.503898174780929E-260, doubleArray, -7.268387242956069E134, doubleArray1);
    }
    
    @Test
    public void testIntegrate4() throws Exception  {
        AdamsMoultonIntegrator adamsMoultonIntegrator = ((AdamsMoultonIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator"));
        FirstOrderConverter firstOrderConverter = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.AbstractIntegrator.resetEvaluations(AbstractIntegrator.java:185)
            org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator.integrate(AdamsMoultonIntegrator.java:214)
            org.apache.commons.math.ode.AbstractIntegrator.integrate(AbstractIntegrator.java:213) */
        adamsMoultonIntegrator.integrate(firstOrderConverter, java.lang.Double.NaN, doubleArray, java.lang.Double.NaN, doubleArray);
    }
    
    @Test
    public void testIntegrate5() throws Exception  {
        ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator = ((ClassicalRungeKuttaIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator"));
        FirstOrderConverter firstOrderConverter = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.AbstractIntegrator.resetEvaluations(AbstractIntegrator.java:185)
            org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator.integrate(RungeKuttaIntegrator.java:98)
            org.apache.commons.math.ode.AbstractIntegrator.integrate(AbstractIntegrator.java:213) */
        classicalRungeKuttaIntegrator.integrate(firstOrderConverter, java.lang.Double.NaN, doubleArray, java.lang.Double.NaN, doubleArray);
    }
    
    @Test
    public void testIntegrate6() throws Throwable  {
        ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator = ((ClassicalRungeKuttaIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator"));
        Object mainStateJacobianWrapper = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        FirstOrderConverter ode = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        setField(mainStateJacobianWrapper, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.AbstractIntegrator.resetEvaluations(AbstractIntegrator.java:185)
            org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator.integrate(RungeKuttaIntegrator.java:98)
            org.apache.commons.math.ode.AbstractIntegrator.integrate(AbstractIntegrator.java:213) */
        Class abstractIntegratorClazz = Class.forName("org.apache.commons.math.ode.AbstractIntegrator");
        Class mainStateJacobianWrapperType = Class.forName("org.apache.commons.math.ode.FirstOrderDifferentialEquations");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method integrateMethod = abstractIntegratorClazz.getDeclaredMethod("integrate", mainStateJacobianWrapperType, doubleType, doubleArrayType, doubleType, doubleArrayType);
        integrateMethod.setAccessible(true);
        java.lang.Object[] integrateMethodArguments = new java.lang.Object[5];
        integrateMethodArguments[0] = mainStateJacobianWrapper;
        integrateMethodArguments[1] = java.lang.Double.NaN;
        integrateMethodArguments[2] = ((Object) doubleArray);
        integrateMethodArguments[3] = java.lang.Double.NaN;
        integrateMethodArguments[4] = ((Object) doubleArray);
        try {
            integrateMethod.invoke(classicalRungeKuttaIntegrator, integrateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testIntegrate7() throws Exception  {
        AdamsBashforthIntegrator adamsBashforthIntegrator = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator"));
        double[] vecAbsoluteTolerance = {0.0, 0.0};
        setField(adamsBashforthIntegrator, "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", "vecAbsoluteTolerance", vecAbsoluteTolerance);
        double[] vecRelativeTolerance = {0.0, 0.0};
        setField(adamsBashforthIntegrator, "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", "vecRelativeTolerance", vecRelativeTolerance);
        FirstOrderConverter firstOrderConverter = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        setField(firstOrderConverter, "org.apache.commons.math.ode.FirstOrderConverter", "dimension", 1);
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.AbstractIntegrator.resetEvaluations(AbstractIntegrator.java:185)
            org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator.integrate(AdamsBashforthIntegrator.java:197)
            org.apache.commons.math.ode.AbstractIntegrator.integrate(AbstractIntegrator.java:213) */
        adamsBashforthIntegrator.integrate(firstOrderConverter, java.lang.Double.NEGATIVE_INFINITY, doubleArray, java.lang.Double.NEGATIVE_INFINITY, doubleArray1);
    }
    
    @Test
    public void testIntegrate8() throws Exception  {
        AdamsBashforthIntegrator adamsBashforthIntegrator = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator"));
        double[] vecAbsoluteTolerance = {};
        setField(adamsBashforthIntegrator, "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", "vecAbsoluteTolerance", vecAbsoluteTolerance);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(adamsBashforthIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "evaluations", evaluations);
        FirstOrderConverter firstOrderConverter = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator.integrate(AdamsBashforthIntegrator.java:211)
            org.apache.commons.math.ode.AbstractIntegrator.integrate(AbstractIntegrator.java:213) */
        adamsBashforthIntegrator.integrate(firstOrderConverter, java.lang.Double.NEGATIVE_INFINITY, doubleArray, java.lang.Double.NEGATIVE_INFINITY, doubleArray);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, [D, double, [D)
    
    @Test(expected = NumberIsTooSmallException.class)
    public void testIntegrate9() throws Exception  {
        AdamsBashforthIntegrator adamsBashforthIntegrator = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator"));
        FirstOrderConverter firstOrderConverter = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        double[] doubleArray = {};
        
        adamsBashforthIntegrator.integrate(firstOrderConverter, -4.9E-324, doubleArray, -0.0, doubleArray);
    }
    
    @Test(expected = DimensionMismatchException.class)
    public void testIntegrate10() throws Throwable  {
        ThreeEighthesIntegrator threeEighthesIntegrator = ((ThreeEighthesIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.ThreeEighthesIntegrator"));
        Object countingDifferentialEquations = createInstance("org.apache.commons.math.ode.MultistepIntegrator$CountingDifferentialEquations");
        double[] doubleArray = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        
        Class abstractIntegratorClazz = Class.forName("org.apache.commons.math.ode.AbstractIntegrator");
        Class countingDifferentialEquationsType = Class.forName("org.apache.commons.math.ode.FirstOrderDifferentialEquations");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method integrateMethod = abstractIntegratorClazz.getDeclaredMethod("integrate", countingDifferentialEquationsType, doubleType, doubleArrayType, doubleType, doubleArrayType);
        integrateMethod.setAccessible(true);
        java.lang.Object[] integrateMethodArguments = new java.lang.Object[5];
        integrateMethodArguments[0] = countingDifferentialEquations;
        integrateMethodArguments[1] = java.lang.Double.NaN;
        integrateMethodArguments[2] = ((Object) doubleArray);
        integrateMethodArguments[3] = java.lang.Double.NaN;
        integrateMethodArguments[4] = ((Object) doubleArray);
        try {
            integrateMethod.invoke(threeEighthesIntegrator, integrateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = DimensionMismatchException.class)
    public void testIntegrate11() throws Throwable  {
        ThreeEighthesIntegrator threeEighthesIntegrator = ((ThreeEighthesIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.ThreeEighthesIntegrator"));
        Object mainStateJacobianWrapper = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        FirstOrderConverter ode = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        setField(mainStateJacobianWrapper, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode);
        double[] doubleArray = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        
        Class abstractIntegratorClazz = Class.forName("org.apache.commons.math.ode.AbstractIntegrator");
        Class mainStateJacobianWrapperType = Class.forName("org.apache.commons.math.ode.FirstOrderDifferentialEquations");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method integrateMethod = abstractIntegratorClazz.getDeclaredMethod("integrate", mainStateJacobianWrapperType, doubleType, doubleArrayType, doubleType, doubleArrayType);
        integrateMethod.setAccessible(true);
        java.lang.Object[] integrateMethodArguments = new java.lang.Object[5];
        integrateMethodArguments[0] = mainStateJacobianWrapper;
        integrateMethodArguments[1] = java.lang.Double.NaN;
        integrateMethodArguments[2] = ((Object) doubleArray);
        integrateMethodArguments[3] = java.lang.Double.NaN;
        integrateMethodArguments[4] = ((Object) doubleArray);
        try {
            integrateMethod.invoke(threeEighthesIntegrator, integrateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = DimensionMismatchException.class)
    public void testIntegrate12() throws Throwable  {
        EulerIntegrator eulerIntegrator = ((EulerIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.EulerIntegrator"));
        Object mainStateJacobianWrapper = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        FirstOrderConverter ode1 = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        setField(ode, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode1);
        setField(mainStateJacobianWrapper, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode);
        double[] doubleArray = {};
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        Class abstractIntegratorClazz = Class.forName("org.apache.commons.math.ode.AbstractIntegrator");
        Class mainStateJacobianWrapperType = Class.forName("org.apache.commons.math.ode.FirstOrderDifferentialEquations");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method integrateMethod = abstractIntegratorClazz.getDeclaredMethod("integrate", mainStateJacobianWrapperType, doubleType, doubleArrayType, doubleType, doubleArrayType);
        integrateMethod.setAccessible(true);
        java.lang.Object[] integrateMethodArguments = new java.lang.Object[5];
        integrateMethodArguments[0] = mainStateJacobianWrapper;
        integrateMethodArguments[1] = java.lang.Double.NaN;
        integrateMethodArguments[2] = ((Object) doubleArray);
        integrateMethodArguments[3] = java.lang.Double.NaN;
        integrateMethodArguments[4] = ((Object) doubleArray1);
        try {
            integrateMethod.invoke(eulerIntegrator, integrateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.AbstractIntegrator.addStepHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addStepHandler(org.apache.commons.math.ode.sampling.StepHandler)
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#addStepHandler(org.apache.commons.math.ode.sampling.StepHandler)}
 * @utbot.invokes {@link java.util.Collection#add(java.lang.Object)}
 *  */
    @Test
    public void testAddStepHandler_CollectionAdd() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        HashSet stepHandlers = new HashSet();
        stepHandlers.add(null);
        setField(dormandPrince853Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "stepHandlers", stepHandlers);
        ContinuousOutputModel continuousOutputModel = ((ContinuousOutputModel) createInstance("org.apache.commons.math.ode.ContinuousOutputModel"));
        
        dormandPrince853Integrator.addStepHandler(continuousOutputModel);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addStepHandler(org.apache.commons.math.ode.sampling.StepHandler)
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#addStepHandler(org.apache.commons.math.ode.sampling.StepHandler)}
 * @utbot.invokes {@link java.util.Collection#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: stepHandlers.add(handler);
 *  */
    @Test
    public void testAddStepHandler_ThrowNullPointerException() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.addStepHandler] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.AbstractIntegrator.addStepHandler(AbstractIntegrator.java:110) */
        dormandPrince853Integrator.addStepHandler(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.AbstractIntegrator.sanityChecks
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method sanityChecks(org.apache.commons.math.ode.ExpandableStatefulODE, double)
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#sanityChecks(org.apache.commons.math.ode.ExpandableStatefulODE,double)}
 * @utbot.invokes {@link org.apache.commons.math.ode.ExpandableStatefulODE#getTime()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double threshold = 1000 * FastMath.ulp(FastMath.max(FastMath.abs(equations.getTime()), FastMath.abs(t)));
 *  */
    @Test
    public void testSanityChecks_ThrowNullPointerException() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.sanityChecks] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.AbstractIntegrator.sanityChecks(AbstractIntegrator.java:384) */
        dormandPrince853Integrator.sanityChecks(null, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method sanityChecks(org.apache.commons.math.ode.ExpandableStatefulODE, double)
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#sanityChecks(org.apache.commons.math.ode.ExpandableStatefulODE,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NumberIsTooSmallException} in: dt
 *  */
    @Test(expected = NumberIsTooSmallException.class)
    public void testSanityChecks_ThrowNumberIsTooSmallException() throws Exception  {
        AdamsBashforthIntegrator adamsBashforthIntegrator = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(-2.0E-323);
        
        adamsBashforthIntegrator.sanityChecks(expandableStatefulODE, java.lang.Double.POSITIVE_INFINITY);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#sanityChecks(org.apache.commons.math.ode.ExpandableStatefulODE,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NumberIsTooSmallException} in: dt
 *  */
    @Test(expected = NumberIsTooSmallException.class)
    public void testSanityChecks_ThrowNumberIsTooSmallException_1() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(-0.0);
        
        dormandPrince853Integrator.sanityChecks(expandableStatefulODE, java.lang.Double.NEGATIVE_INFINITY);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method sanityChecks(org.apache.commons.math.ode.ExpandableStatefulODE, double)
    
    @Test
    public void testSanityChecks1() throws Exception  {
        MidpointIntegrator midpointIntegrator = ((MidpointIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.MidpointIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(-8.900295434028806E-308);
        
        midpointIntegrator.sanityChecks(expandableStatefulODE, 8.900295434028806E-308);
    }
    
    @Test
    public void testSanityChecks2() throws Exception  {
        EulerIntegrator eulerIntegrator = ((EulerIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.EulerIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(-1.1125369292536007E-308);
        
        eulerIntegrator.sanityChecks(expandableStatefulODE, 8.6916947597938E-311);
    }
    
    @Test
    public void testSanityChecks3() throws Exception  {
        ThreeEighthesIntegrator threeEighthesIntegrator = ((ThreeEighthesIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.ThreeEighthesIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(-5.62997846644E-313);
        
        threeEighthesIntegrator.sanityChecks(expandableStatefulODE, 2.2251301582918663E-308);
    }
    
    @Test
    public void testSanityChecks4() throws Exception  {
        ThreeEighthesIntegrator threeEighthesIntegrator = ((ThreeEighthesIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.ThreeEighthesIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(java.lang.Double.NEGATIVE_INFINITY);
        
        threeEighthesIntegrator.sanityChecks(expandableStatefulODE, java.lang.Double.NaN);
    }
    
    @Test
    public void testSanityChecks5() throws Exception  {
        ThreeEighthesIntegrator threeEighthesIntegrator = ((ThreeEighthesIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.ThreeEighthesIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(0.0);
        
        threeEighthesIntegrator.sanityChecks(expandableStatefulODE, 2.225073858507202E-308);
    }
    
    @Test
    public void testSanityChecks6() throws Exception  {
        EulerIntegrator eulerIntegrator = ((EulerIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.EulerIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(0.0);
        
        eulerIntegrator.sanityChecks(expandableStatefulODE, java.lang.Double.NaN);
    }
    
    @Test
    public void testSanityChecks7() throws Exception  {
        ThreeEighthesIntegrator threeEighthesIntegrator = ((ThreeEighthesIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.ThreeEighthesIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(java.lang.Double.NaN);
        
        threeEighthesIntegrator.sanityChecks(expandableStatefulODE, -0.0);
    }
    
    @Test
    public void testSanityChecks8() throws Exception  {
        ThreeEighthesIntegrator threeEighthesIntegrator = ((ThreeEighthesIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.ThreeEighthesIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(java.lang.Double.POSITIVE_INFINITY);
        
        threeEighthesIntegrator.sanityChecks(expandableStatefulODE, java.lang.Double.POSITIVE_INFINITY);
    }
    
    @Test
    public void testSanityChecks9() throws Exception  {
        EulerIntegrator eulerIntegrator = ((EulerIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.EulerIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(java.lang.Double.NaN);
        
        eulerIntegrator.sanityChecks(expandableStatefulODE, -8.98850264135853E307);
    }
    
    @Test
    public void testSanityChecks10() throws Exception  {
        EulerIntegrator eulerIntegrator = ((EulerIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.EulerIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(-1.8018747976163452E-145);
        
        eulerIntegrator.sanityChecks(expandableStatefulODE, -7.588550388571169E81);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method sanityChecks(org.apache.commons.math.ode.ExpandableStatefulODE, double)
    
    @Test
    public void testSanityChecks11() throws Exception  {
        AdamsMoultonIntegrator adamsMoultonIntegrator = ((AdamsMoultonIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(1.73833895195875E-310);
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.sanityChecks] produces [java.lang.NullPointerException] */
        adamsMoultonIntegrator.sanityChecks(expandableStatefulODE, -2.211119614186E-311);
    }
    
    @Test
    public void testSanityChecks12() throws Exception  {
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(5.1253327236687384E-144);
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.sanityChecks] produces [java.lang.NullPointerException] */
        dormandPrince54Integrator.sanityChecks(expandableStatefulODE, 4.355614296588013E40);
    }
    
    @Test
    public void testSanityChecks13() throws Exception  {
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(java.lang.Double.POSITIVE_INFINITY);
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.sanityChecks] produces [java.lang.NullPointerException] */
        dormandPrince54Integrator.sanityChecks(expandableStatefulODE, java.lang.Double.POSITIVE_INFINITY);
    }
    
    @Test
    public void testSanityChecks14() throws Exception  {
        AdamsBashforthIntegrator adamsBashforthIntegrator = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(-1.000625610355346);
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.sanityChecks] produces [java.lang.NullPointerException] */
        adamsBashforthIntegrator.sanityChecks(expandableStatefulODE, -0.0);
    }
    
    @Test
    public void testSanityChecks15() throws Exception  {
        AdamsMoultonIntegrator adamsMoultonIntegrator = ((AdamsMoultonIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(java.lang.Double.NEGATIVE_INFINITY);
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.sanityChecks] produces [java.lang.NullPointerException] */
        adamsMoultonIntegrator.sanityChecks(expandableStatefulODE, java.lang.Double.NEGATIVE_INFINITY);
    }
    
    @Test
    public void testSanityChecks16() throws Exception  {
        AdamsMoultonIntegrator adamsMoultonIntegrator = ((AdamsMoultonIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(0.0);
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.sanityChecks] produces [java.lang.NullPointerException] */
        adamsMoultonIntegrator.sanityChecks(expandableStatefulODE, -1.6578092E-316);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method sanityChecks(org.apache.commons.math.ode.ExpandableStatefulODE, double)
    
    @Test(expected = NumberIsTooSmallException.class)
    public void testSanityChecks17() throws Exception  {
        AdamsBashforthIntegrator adamsBashforthIntegrator = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(-4.9E-324);
        
        adamsBashforthIntegrator.sanityChecks(expandableStatefulODE, -0.0);
    }
    
    @Test(expected = NumberIsTooSmallException.class)
    public void testSanityChecks18() throws Exception  {
        AdamsMoultonIntegrator adamsMoultonIntegrator = ((AdamsMoultonIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(java.lang.Double.NEGATIVE_INFINITY);
        
        adamsMoultonIntegrator.sanityChecks(expandableStatefulODE, java.lang.Double.POSITIVE_INFINITY);
    }
    
    @Test(expected = NumberIsTooSmallException.class)
    public void testSanityChecks19() throws Exception  {
        ThreeEighthesIntegrator threeEighthesIntegrator = ((ThreeEighthesIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.ThreeEighthesIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(0.0);
        
        threeEighthesIntegrator.sanityChecks(expandableStatefulODE, -0.0);
    }
    
    @Test(expected = NumberIsTooSmallException.class)
    public void testSanityChecks20() throws Exception  {
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(-4.749305221739813E-28);
        
        dormandPrince54Integrator.sanityChecks(expandableStatefulODE, -4.749305221739813E-28);
    }
    
    @Test(expected = NumberIsTooSmallException.class)
    public void testSanityChecks21() throws Exception  {
        AdamsMoultonIntegrator adamsMoultonIntegrator = ((AdamsMoultonIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(java.lang.Double.NEGATIVE_INFINITY);
        
        adamsMoultonIntegrator.sanityChecks(expandableStatefulODE, -1.0087890625);
    }
    
    @Test(expected = NumberIsTooSmallException.class)
    public void testSanityChecks22() throws Exception  {
        ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator = ((ClassicalRungeKuttaIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(-1.0);
        
        classicalRungeKuttaIntegrator.sanityChecks(expandableStatefulODE, java.lang.Double.NEGATIVE_INFINITY);
    }
    
    @Test(expected = NumberIsTooSmallException.class)
    public void testSanityChecks23() throws Exception  {
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(7.41114602403682E78);
        
        dormandPrince54Integrator.sanityChecks(expandableStatefulODE, java.lang.Double.NEGATIVE_INFINITY);
    }
    
    @Test(expected = NumberIsTooSmallException.class)
    public void testSanityChecks24() throws Exception  {
        AdamsBashforthIntegrator adamsBashforthIntegrator = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(4.9E-324);
        
        adamsBashforthIntegrator.sanityChecks(expandableStatefulODE, 0.0);
    }
    
    @Test(expected = NumberIsTooSmallException.class)
    public void testSanityChecks25() throws Exception  {
        AdamsMoultonIntegrator adamsMoultonIntegrator = ((AdamsMoultonIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(2.38939427856319E-207);
        
        adamsMoultonIntegrator.sanityChecks(expandableStatefulODE, 2.38939427856319E-207);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.AbstractIntegrator.computeDerivatives
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method computeDerivatives(double, [D, [D)
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#computeDerivatives(double,double[],double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: expandable.computeDerivatives(t, y, yDot);
 *  */
    @Test
    public void testComputeDerivatives_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(256);
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", 255);
        setField(dormandPrince853Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "evaluations", evaluations);
        ExpandableStatefulODE expandable = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        Object primary = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        FirstOrderConverter ode = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        setField(ode, "org.apache.commons.math.ode.FirstOrderConverter", "dimension", -1);
        double[] z = {0.0};
        setField(ode, "org.apache.commons.math.ode.FirstOrderConverter", "z", z);
        setField(primary, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode);
        setField(expandable, "org.apache.commons.math.ode.ExpandableStatefulODE", "primary", primary);
        EquationsMapper primaryMapper = ((EquationsMapper) createInstance("org.apache.commons.math.ode.EquationsMapper"));
        setField(expandable, "org.apache.commons.math.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper);
        double[] primaryState = {};
        expandable.setPrimaryState(primaryState);
        setField(dormandPrince853Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "expandable", expandable);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.computeDerivatives] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -1 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.ode.FirstOrderConverter.computeDerivatives(FirstOrderConverter.java:103)
            org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:445)
            org.apache.commons.math.ode.ExpandableStatefulODE.computeDerivatives(ExpandableStatefulODE.java:115)
            org.apache.commons.math.ode.AbstractIntegrator.computeDerivatives(AbstractIntegrator.java:250) */
        dormandPrince853Integrator.computeDerivatives(java.lang.Double.NaN, doubleArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#computeDerivatives(double,double[],double[])}
 * @utbot.invokes {@link org.apache.commons.math.util.Incrementor#incrementCount()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: evaluations.incrementCount();
 *  */
    @Test
    public void testComputeDerivatives_ThrowNullPointerException() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.computeDerivatives] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.AbstractIntegrator.computeDerivatives(AbstractIntegrator.java:249) */
        dormandPrince853Integrator.computeDerivatives(java.lang.Double.NaN, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#computeDerivatives(double,double[],double[])}
 * @utbot.invokes {@link org.apache.commons.math.ode.ExpandableStatefulODE#computeDerivatives(double,double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: expandable.computeDerivatives(t, y, yDot);
 *  */
    @Test
    public void testComputeDerivatives_ThrowNullPointerException_1() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(256);
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", 255);
        setField(dormandPrince853Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "evaluations", evaluations);
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.computeDerivatives] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.AbstractIntegrator.computeDerivatives(AbstractIntegrator.java:250) */
        dormandPrince853Integrator.computeDerivatives(java.lang.Double.NaN, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#computeDerivatives(double,double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: expandable.computeDerivatives(t, y, yDot);
 *  */
    @Test
    public void testComputeDerivatives_ThrowNullPointerException_2() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(256);
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", 255);
        setField(dormandPrince853Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "evaluations", evaluations);
        ExpandableStatefulODE expandable = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        EquationsMapper primaryMapper = ((EquationsMapper) createInstance("org.apache.commons.math.ode.EquationsMapper"));
        setField(primaryMapper, "org.apache.commons.math.ode.EquationsMapper", "firstIndex", -255);
        setField(primaryMapper, "org.apache.commons.math.ode.EquationsMapper", "dimension", 1);
        setField(expandable, "org.apache.commons.math.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper);
        double[] primaryState = {0.0};
        expandable.setPrimaryState(primaryState);
        setField(dormandPrince853Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "expandable", expandable);
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.computeDerivatives] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.ode.EquationsMapper.extractEquationData(EquationsMapper.java:80)
            org.apache.commons.math.ode.ExpandableStatefulODE.computeDerivatives(ExpandableStatefulODE.java:114)
            org.apache.commons.math.ode.AbstractIntegrator.computeDerivatives(AbstractIntegrator.java:250) */
        dormandPrince853Integrator.computeDerivatives(java.lang.Double.NaN, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#computeDerivatives(double,double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: expandable.computeDerivatives(t, y, yDot);
 *  */
    @Test
    public void testComputeDerivatives_ThrowNullPointerException_3() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(256);
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", 255);
        setField(dormandPrince853Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "evaluations", evaluations);
        ExpandableStatefulODE expandable = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        FirstOrderConverter primary = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        setField(expandable, "org.apache.commons.math.ode.ExpandableStatefulODE", "primary", primary);
        EquationsMapper primaryMapper = ((EquationsMapper) createInstance("org.apache.commons.math.ode.EquationsMapper"));
        setField(expandable, "org.apache.commons.math.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper);
        double[] primaryState = {};
        expandable.setPrimaryState(primaryState);
        setField(dormandPrince853Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "expandable", expandable);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.computeDerivatives] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.ode.FirstOrderConverter.computeDerivatives(FirstOrderConverter.java:103)
            org.apache.commons.math.ode.ExpandableStatefulODE.computeDerivatives(ExpandableStatefulODE.java:115)
            org.apache.commons.math.ode.AbstractIntegrator.computeDerivatives(AbstractIntegrator.java:250) */
        dormandPrince853Integrator.computeDerivatives(java.lang.Double.NaN, doubleArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#computeDerivatives(double,double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: expandable.computeDerivatives(t, y, yDot);
 *  */
    @Test
    public void testComputeDerivatives_ThrowNullPointerException_4() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(256);
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", 255);
        setField(dormandPrince853Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "evaluations", evaluations);
        ExpandableStatefulODE expandable = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        FirstOrderConverter primary = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        double[] z = {0.0};
        setField(primary, "org.apache.commons.math.ode.FirstOrderConverter", "z", z);
        setField(expandable, "org.apache.commons.math.ode.ExpandableStatefulODE", "primary", primary);
        EquationsMapper primaryMapper = ((EquationsMapper) createInstance("org.apache.commons.math.ode.EquationsMapper"));
        setField(expandable, "org.apache.commons.math.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper);
        double[] primaryState = {};
        expandable.setPrimaryState(primaryState);
        setField(dormandPrince853Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "expandable", expandable);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.computeDerivatives] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.ode.FirstOrderConverter.computeDerivatives(FirstOrderConverter.java:104)
            org.apache.commons.math.ode.ExpandableStatefulODE.computeDerivatives(ExpandableStatefulODE.java:115)
            org.apache.commons.math.ode.AbstractIntegrator.computeDerivatives(AbstractIntegrator.java:250) */
        dormandPrince853Integrator.computeDerivatives(java.lang.Double.NaN, doubleArray, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method computeDerivatives(double, [D, [D)
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#computeDerivatives(double,double[],double[])}
 * @utbot.throwsException {@link org.apache.commons.math.exception.MaxCountExceededException} in: evaluations.incrementCount();
 *  */
    @Test(expected = MaxCountExceededException.class)
    public void testComputeDerivatives_ThrowMaxCountExceededException() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(-254);
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", -254);
        Incrementor.MaxCountExceededCallback maxCountCallback = ((Incrementor.MaxCountExceededCallback) createInstance("org.apache.commons.math.util.Incrementor$1"));
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "maxCountCallback", maxCountCallback);
        setField(dormandPrince853Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "evaluations", evaluations);
        
        dormandPrince853Integrator.computeDerivatives(java.lang.Double.NaN, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#computeDerivatives(double,double[],double[])}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: expandable.computeDerivatives(t, y, yDot);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testComputeDerivatives_ThrowDimensionMismatchException() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(256);
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", 255);
        setField(dormandPrince853Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "evaluations", evaluations);
        ExpandableStatefulODE expandable = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        EquationsMapper primaryMapper = ((EquationsMapper) createInstance("org.apache.commons.math.ode.EquationsMapper"));
        setField(primaryMapper, "org.apache.commons.math.ode.EquationsMapper", "dimension", -3);
        setField(expandable, "org.apache.commons.math.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper);
        double[] primaryState = {0.0, 0.0};
        expandable.setPrimaryState(primaryState);
        setField(dormandPrince853Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "expandable", expandable);
        
        dormandPrince853Integrator.computeDerivatives(java.lang.Double.NaN, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#computeDerivatives(double,double[],double[])}
 * @utbot.throwsException {@link org.apache.commons.math.exception.MaxCountExceededException} in: expandable.computeDerivatives(t, y, yDot);
 *  */
    @Test(expected = MaxCountExceededException.class)
    public void testComputeDerivatives_ThrowMaxCountExceededException_1() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(256);
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", 255);
        setField(dormandPrince853Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "evaluations", evaluations);
        ExpandableStatefulODE expandable = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        Object primary = createInstance("org.apache.commons.math.ode.MultistepIntegrator$CountingDifferentialEquations");
        AdamsMoultonIntegrator this$0 = ((AdamsMoultonIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator"));
        Incrementor evaluations1 = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        Incrementor.MaxCountExceededCallback maxCountCallback = ((Incrementor.MaxCountExceededCallback) createInstance("org.apache.commons.math.util.Incrementor$1"));
        setField(evaluations1, "org.apache.commons.math.util.Incrementor", "maxCountCallback", maxCountCallback);
        setField(this$0, "org.apache.commons.math.ode.AbstractIntegrator", "evaluations", evaluations1);
        setField(primary, "org.apache.commons.math.ode.MultistepIntegrator$CountingDifferentialEquations", "this$0", this$0);
        setField(expandable, "org.apache.commons.math.ode.ExpandableStatefulODE", "primary", primary);
        EquationsMapper primaryMapper = ((EquationsMapper) createInstance("org.apache.commons.math.ode.EquationsMapper"));
        setField(expandable, "org.apache.commons.math.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper);
        double[] primaryState = {};
        expandable.setPrimaryState(primaryState);
        setField(dormandPrince853Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "expandable", expandable);
        double[] doubleArray = {};
        
        dormandPrince853Integrator.computeDerivatives(java.lang.Double.NaN, doubleArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#computeDerivatives(double,double[],double[])}
 * @utbot.throwsException {@link org.apache.commons.math.exception.MaxCountExceededException} in: expandable.computeDerivatives(t, y, yDot);
 *  */
    @Test(expected = MaxCountExceededException.class)
    public void testComputeDerivatives_ThrowMaxCountExceededException_2() throws Exception  {
        AdamsMoultonIntegrator adamsMoultonIntegrator = ((AdamsMoultonIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(256);
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", 255);
        setField(adamsMoultonIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "evaluations", evaluations);
        ExpandableStatefulODE expandable = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        Object primary = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode1 = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode2 = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode3 = createInstance("org.apache.commons.math.ode.MultistepIntegrator$CountingDifferentialEquations");
        AdamsMoultonIntegrator this$0 = ((AdamsMoultonIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator"));
        Incrementor evaluations1 = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        Incrementor.MaxCountExceededCallback maxCountCallback = ((Incrementor.MaxCountExceededCallback) createInstance("org.apache.commons.math.util.Incrementor$1"));
        setField(evaluations1, "org.apache.commons.math.util.Incrementor", "maxCountCallback", maxCountCallback);
        setField(this$0, "org.apache.commons.math.ode.AbstractIntegrator", "evaluations", evaluations1);
        setField(ode3, "org.apache.commons.math.ode.MultistepIntegrator$CountingDifferentialEquations", "this$0", this$0);
        setField(ode2, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode3);
        setField(ode1, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode2);
        setField(ode, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode1);
        setField(primary, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode);
        setField(expandable, "org.apache.commons.math.ode.ExpandableStatefulODE", "primary", primary);
        EquationsMapper primaryMapper = ((EquationsMapper) createInstance("org.apache.commons.math.ode.EquationsMapper"));
        setField(expandable, "org.apache.commons.math.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper);
        double[] primaryState = {};
        expandable.setPrimaryState(primaryState);
        double[] primaryStateDot = {0.0};
        setField(expandable, "org.apache.commons.math.ode.ExpandableStatefulODE", "primaryStateDot", primaryStateDot);
        setField(adamsMoultonIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "expandable", expandable);
        double[] doubleArray = {};
        
        adamsMoultonIntegrator.computeDerivatives(java.lang.Double.NaN, doubleArray, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method computeDerivatives(double, [D, [D)
    
    @Test
    public void testComputeDerivatives1() throws Exception  {
        AdamsBashforthIntegrator adamsBashforthIntegrator = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", -2);
        setField(adamsBashforthIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "evaluations", evaluations);
        ExpandableStatefulODE expandable = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        EquationsMapper primaryMapper = ((EquationsMapper) createInstance("org.apache.commons.math.ode.EquationsMapper"));
        setField(primaryMapper, "org.apache.commons.math.ode.EquationsMapper", "firstIndex", Integer.MIN_VALUE);
        setField(expandable, "org.apache.commons.math.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper);
        double[] primaryState = {};
        expandable.setPrimaryState(primaryState);
        setField(adamsBashforthIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "expandable", expandable);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.computeDerivatives] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -2147483648 out of bounds for double[9]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.ode.EquationsMapper.extractEquationData(EquationsMapper.java:80)
            org.apache.commons.math.ode.ExpandableStatefulODE.computeDerivatives(ExpandableStatefulODE.java:114)
            org.apache.commons.math.ode.AbstractIntegrator.computeDerivatives(AbstractIntegrator.java:250) */
        adamsBashforthIntegrator.computeDerivatives(java.lang.Double.NaN, doubleArray, doubleArray);
    }
    
    @Test
    public void testComputeDerivatives2() throws Exception  {
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(256);
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", 255);
        setField(dormandPrince54Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "evaluations", evaluations);
        ExpandableStatefulODE expandable = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        Object primary = createInstance("org.apache.commons.math.ode.MultistepIntegrator$CountingDifferentialEquations");
        AdamsMoultonIntegrator this$0 = ((AdamsMoultonIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator"));
        Incrementor evaluations1 = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations1.setMaximalCount(Integer.MIN_VALUE);
        setField(evaluations1, "org.apache.commons.math.util.Incrementor", "count", Integer.MAX_VALUE);
        setField(this$0, "org.apache.commons.math.ode.AbstractIntegrator", "evaluations", evaluations1);
        ExpandableStatefulODE expandable1 = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        EquationsMapper primaryMapper = ((EquationsMapper) createInstance("org.apache.commons.math.ode.EquationsMapper"));
        setField(primaryMapper, "org.apache.commons.math.ode.EquationsMapper", "firstIndex", -1);
        setField(expandable1, "org.apache.commons.math.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper);
        double[] primaryState = {};
        expandable1.setPrimaryState(primaryState);
        setField(this$0, "org.apache.commons.math.ode.AbstractIntegrator", "expandable", expandable1);
        setField(primary, "org.apache.commons.math.ode.MultistepIntegrator$CountingDifferentialEquations", "this$0", this$0);
        setField(expandable, "org.apache.commons.math.ode.ExpandableStatefulODE", "primary", primary);
        EquationsMapper primaryMapper1 = ((EquationsMapper) createInstance("org.apache.commons.math.ode.EquationsMapper"));
        setField(expandable, "org.apache.commons.math.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper1);
        expandable.setPrimaryState(primaryState);
        setField(dormandPrince54Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "expandable", expandable);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.computeDerivatives] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for double[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.ode.EquationsMapper.extractEquationData(EquationsMapper.java:80)
            org.apache.commons.math.ode.ExpandableStatefulODE.computeDerivatives(ExpandableStatefulODE.java:114)
            org.apache.commons.math.ode.AbstractIntegrator.computeDerivatives(AbstractIntegrator.java:250)
            org.apache.commons.math.ode.MultistepIntegrator$CountingDifferentialEquations.computeDerivatives(MultistepIntegrator.java:420)
            org.apache.commons.math.ode.ExpandableStatefulODE.computeDerivatives(ExpandableStatefulODE.java:115)
            org.apache.commons.math.ode.AbstractIntegrator.computeDerivatives(AbstractIntegrator.java:250) */
        dormandPrince54Integrator.computeDerivatives(java.lang.Double.NaN, doubleArray, null);
    }
    
    @Test
    public void testComputeDerivatives3() throws Exception  {
        AdamsBashforthIntegrator adamsBashforthIntegrator = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(256);
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", 255);
        setField(adamsBashforthIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "evaluations", evaluations);
        ExpandableStatefulODE expandable = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        Object primary = createInstance("org.apache.commons.math.ode.MultistepIntegrator$CountingDifferentialEquations");
        AdamsMoultonIntegrator this$0 = ((AdamsMoultonIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator"));
        Incrementor evaluations1 = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations1.setMaximalCount(Integer.MIN_VALUE);
        setField(evaluations1, "org.apache.commons.math.util.Incrementor", "count", Integer.MAX_VALUE);
        setField(this$0, "org.apache.commons.math.ode.AbstractIntegrator", "evaluations", evaluations1);
        ExpandableStatefulODE expandable1 = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        Object primary1 = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        FirstOrderConverter ode = ((FirstOrderConverter) createInstance("org.apache.commons.math.ode.FirstOrderConverter"));
        setField(ode, "org.apache.commons.math.ode.FirstOrderConverter", "dimension", 1);
        double[] z = {0.0};
        setField(ode, "org.apache.commons.math.ode.FirstOrderConverter", "z", z);
        setField(ode, "org.apache.commons.math.ode.FirstOrderConverter", "zDot", z);
        setField(primary1, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode);
        setField(expandable1, "org.apache.commons.math.ode.ExpandableStatefulODE", "primary", primary1);
        EquationsMapper primaryMapper = ((EquationsMapper) createInstance("org.apache.commons.math.ode.EquationsMapper"));
        setField(primaryMapper, "org.apache.commons.math.ode.EquationsMapper", "dimension", 1);
        setField(expandable1, "org.apache.commons.math.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper);
        expandable1.setPrimaryState(z);
        setField(this$0, "org.apache.commons.math.ode.AbstractIntegrator", "expandable", expandable1);
        setField(primary, "org.apache.commons.math.ode.MultistepIntegrator$CountingDifferentialEquations", "this$0", this$0);
        setField(expandable, "org.apache.commons.math.ode.ExpandableStatefulODE", "primary", primary);
        EquationsMapper primaryMapper1 = ((EquationsMapper) createInstance("org.apache.commons.math.ode.EquationsMapper"));
        setField(primaryMapper1, "org.apache.commons.math.ode.EquationsMapper", "dimension", 2);
        setField(expandable, "org.apache.commons.math.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper1);
        double[] primaryState = {0.0, 0.0};
        expandable.setPrimaryState(primaryState);
        setField(adamsBashforthIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "expandable", expandable);
        double[] doubleArray = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.computeDerivatives] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 2 out of bounds for double[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.ode.FirstOrderConverter.computeDerivatives(FirstOrderConverter.java:104)
            org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:445)
            org.apache.commons.math.ode.ExpandableStatefulODE.computeDerivatives(ExpandableStatefulODE.java:115)
            org.apache.commons.math.ode.AbstractIntegrator.computeDerivatives(AbstractIntegrator.java:250)
            org.apache.commons.math.ode.MultistepIntegrator$CountingDifferentialEquations.computeDerivatives(MultistepIntegrator.java:420)
            org.apache.commons.math.ode.ExpandableStatefulODE.computeDerivatives(ExpandableStatefulODE.java:115)
            org.apache.commons.math.ode.AbstractIntegrator.computeDerivatives(AbstractIntegrator.java:250) */
        adamsBashforthIntegrator.computeDerivatives(java.lang.Double.NaN, doubleArray, null);
    }
    
    @Test
    public void testComputeDerivatives4() throws Exception  {
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(256);
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", 255);
        setField(dormandPrince54Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "evaluations", evaluations);
        ExpandableStatefulODE expandable = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        Object primary = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode1 = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode2 = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode3 = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode4 = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode5 = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode6 = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode7 = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode8 = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode9 = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode10 = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode11 = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode12 = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode13 = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode14 = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode15 = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode16 = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode17 = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode18 = createInstance("org.apache.commons.math.ode.MultistepIntegrator$CountingDifferentialEquations");
        setField(ode17, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode18);
        setField(ode16, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode17);
        setField(ode15, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode16);
        setField(ode14, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode15);
        setField(ode13, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode14);
        setField(ode12, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode13);
        setField(ode11, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode12);
        setField(ode10, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode11);
        setField(ode9, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode10);
        setField(ode8, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode9);
        setField(ode7, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode8);
        setField(ode6, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode7);
        setField(ode5, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode6);
        setField(ode4, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode5);
        setField(ode3, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode4);
        setField(ode2, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode3);
        setField(ode1, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode2);
        setField(ode, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode1);
        setField(primary, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode);
        setField(expandable, "org.apache.commons.math.ode.ExpandableStatefulODE", "primary", primary);
        EquationsMapper primaryMapper = ((EquationsMapper) createInstance("org.apache.commons.math.ode.EquationsMapper"));
        setField(expandable, "org.apache.commons.math.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper);
        double[] primaryState = {};
        expandable.setPrimaryState(primaryState);
        setField(dormandPrince54Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "expandable", expandable);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.computeDerivatives] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.MultistepIntegrator$CountingDifferentialEquations.computeDerivatives(MultistepIntegrator.java:420)
            org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:445)
            org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:445)
            org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:445)
            org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:445)
            org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:445)
            org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:445)
            org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:445)
            org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:445)
            org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:445)
            org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:445)
            org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:445)
            org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:445)
            org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:445)
            org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:445)
            org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:445)
            org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:445)
            org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:445)
            org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:445)
            org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:445)
            org.apache.commons.math.ode.ExpandableStatefulODE.computeDerivatives(ExpandableStatefulODE.java:115)
            org.apache.commons.math.ode.AbstractIntegrator.computeDerivatives(AbstractIntegrator.java:250) */
        dormandPrince54Integrator.computeDerivatives(java.lang.Double.NaN, doubleArray, null);
    }
    
    @Test
    public void testComputeDerivatives5() throws Exception  {
        AdamsMoultonIntegrator adamsMoultonIntegrator = ((AdamsMoultonIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(256);
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", 255);
        setField(adamsMoultonIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "evaluations", evaluations);
        ExpandableStatefulODE expandable = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        Object primary = createInstance("org.apache.commons.math.ode.MultistepIntegrator$CountingDifferentialEquations");
        AdamsMoultonIntegrator this$0 = ((AdamsMoultonIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator"));
        Incrementor evaluations1 = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations1.setMaximalCount(Integer.MIN_VALUE);
        setField(evaluations1, "org.apache.commons.math.util.Incrementor", "count", Integer.MAX_VALUE);
        setField(this$0, "org.apache.commons.math.ode.AbstractIntegrator", "evaluations", evaluations1);
        ExpandableStatefulODE expandable1 = ((ExpandableStatefulODE) createInstance("org.apache.commons.math.ode.ExpandableStatefulODE"));
        Object primary1 = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode1 = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode2 = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode3 = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode4 = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode5 = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode6 = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode7 = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode8 = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode9 = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode10 = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode11 = createInstance("org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper");
        setField(ode11, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", primary);
        setField(ode10, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode11);
        setField(ode9, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode10);
        setField(ode8, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode9);
        setField(ode7, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode8);
        setField(ode6, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode7);
        setField(ode5, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode6);
        setField(ode4, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode5);
        setField(ode3, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode4);
        setField(ode2, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode3);
        setField(ode1, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode2);
        setField(ode, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode1);
        setField(primary1, "org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode);
        setField(expandable1, "org.apache.commons.math.ode.ExpandableStatefulODE", "primary", primary1);
        EquationsMapper primaryMapper = ((EquationsMapper) createInstance("org.apache.commons.math.ode.EquationsMapper"));
        setField(expandable1, "org.apache.commons.math.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper);
        double[] primaryState = {};
        expandable1.setPrimaryState(primaryState);
        setField(this$0, "org.apache.commons.math.ode.AbstractIntegrator", "expandable", expandable1);
        setField(primary, "org.apache.commons.math.ode.MultistepIntegrator$CountingDifferentialEquations", "this$0", this$0);
        setField(expandable, "org.apache.commons.math.ode.ExpandableStatefulODE", "primary", primary);
        EquationsMapper primaryMapper1 = ((EquationsMapper) createInstance("org.apache.commons.math.ode.EquationsMapper"));
        setField(expandable, "org.apache.commons.math.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper1);
        double[] primaryState1 = {};
        expandable.setPrimaryState(primaryState1);
        setField(adamsMoultonIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "expandable", expandable);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.computeDerivatives] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.Incrementor.incrementCount(Incrementor.java:151)
            org.apache.commons.math.ode.AbstractIntegrator.computeDerivatives(AbstractIntegrator.java:249)
            org.apache.commons.math.ode.MultistepIntegrator$CountingDifferentialEquations.computeDerivatives(MultistepIntegrator.java:420)
            org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:445)
            org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:445)
            org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:445)
            org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:445)
            org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:445)
            org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:445)
            org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:445)
            org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:445)
            org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:445)
            org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:445)
            org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:445)
            org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:445)
            org.apache.commons.math.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:445)
            org.apache.commons.math.ode.ExpandableStatefulODE.computeDerivatives(ExpandableStatefulODE.java:115)
            org.apache.commons.math.ode.AbstractIntegrator.computeDerivatives(AbstractIntegrator.java:250)
            org.apache.commons.math.ode.MultistepIntegrator$CountingDifferentialEquations.computeDerivatives(MultistepIntegrator.java:420)
            org.apache.commons.math.ode.ExpandableStatefulODE.computeDerivatives(ExpandableStatefulODE.java:115)
            org.apache.commons.math.ode.AbstractIntegrator.computeDerivatives(AbstractIntegrator.java:250) */
        adamsMoultonIntegrator.computeDerivatives(java.lang.Double.NaN, doubleArray, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.AbstractIntegrator.acceptStep
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method acceptStep(org.apache.commons.math.ode.sampling.AbstractStepInterpolator, [D, [D, double)
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#acceptStep(org.apache.commons.math.ode.sampling.AbstractStepInterpolator,double[],double[],double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double previousT = interpolator.getGlobalPreviousTime();
 *  */
    @Test
    public void testAcceptStep_ThrowNullPointerException() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.acceptStep] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.AbstractIntegrator.acceptStep(AbstractIntegrator.java:278) */
        dormandPrince853Integrator.acceptStep(null, null, null, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#acceptStep(org.apache.commons.math.ode.sampling.AbstractStepInterpolator,double[],double[],double)}
 * @utbot.executesCondition {@code (!statesInitialized): True}
 * @utbot.invokes {@link org.apache.commons.math.ode.sampling.AbstractStepInterpolator#getGlobalPreviousTime()}
 * @utbot.invokes {@link org.apache.commons.math.ode.sampling.AbstractStepInterpolator#getGlobalCurrentTime()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(EventState state: eventsStates)
 *  */
    @Test
    public void testAcceptStep_ThrowNullPointerException_1() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        NordsieckStepInterpolator nordsieckStepInterpolator = ((NordsieckStepInterpolator) createInstance("org.apache.commons.math.ode.sampling.NordsieckStepInterpolator"));
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "globalPreviousTime", 0.0);
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "globalCurrentTime", 0.0);
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.acceptStep] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.AbstractIntegrator.acceptStep(AbstractIntegrator.java:284) */
        dormandPrince853Integrator.acceptStep(nordsieckStepInterpolator, null, null, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method acceptStep(org.apache.commons.math.ode.sampling.AbstractStepInterpolator, [D, [D, double)
    
    @Test
    public void testAcceptStep1() throws Exception  {
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator"));
        ArrayList eventsStates = new ArrayList();
        EventState eventState = ((EventState) createInstance("org.apache.commons.math.ode.events.EventState"));
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "t0", 0.0);
        eventsStates.add(eventState);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(dormandPrince54Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        NordsieckStepInterpolator nordsieckStepInterpolator = ((NordsieckStepInterpolator) createInstance("org.apache.commons.math.ode.sampling.NordsieckStepInterpolator"));
        double[] stateVariation = {};
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator", "stateVariation", stateVariation);
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator", "scalingH", 0.0);
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator", "referenceTime", 0.0);
        Array2DRowRealMatrix nordsieck = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(nordsieck, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator", "nordsieck", nordsieck);
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "h", 4.9E-324);
        double[] currentState = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "currentState", currentState);
        nordsieckStepInterpolator.setInterpolatedTime(0.0);
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "interpolatedDerivatives", stateVariation);
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "globalPreviousTime", 0.0);
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "globalCurrentTime", 0.0);
        nordsieckStepInterpolator.setSoftPreviousTime(0.0);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.acceptStep] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.computeInterpolatedStateAndDerivatives(NordsieckStepInterpolator.java:211)
            org.apache.commons.math.ode.sampling.AbstractStepInterpolator.evaluateCompleteInterpolatedState(AbstractStepInterpolator.java:405)
            org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getInterpolatedState(AbstractStepInterpolator.java:412)
            org.apache.commons.math.ode.events.EventState.reinitializeBegin(EventState.java:156)
            org.apache.commons.math.ode.AbstractIntegrator.acceptStep(AbstractIntegrator.java:285) */
        dormandPrince54Integrator.acceptStep(nordsieckStepInterpolator, doubleArray, doubleArray, java.lang.Double.NaN);
    }
    
    @Test
    public void testAcceptStep2() throws Throwable  {
        EulerIntegrator eulerIntegrator = ((EulerIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.EulerIntegrator"));
        HashSet eventsStates = new HashSet();
        setField(eulerIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        Object dormandPrince853StepInterpolator = createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator");
        setField(dormandPrince853StepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "globalPreviousTime", 0.0);
        setField(dormandPrince853StepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "globalCurrentTime", 0.0);
        setField(dormandPrince853StepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "forward", true);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.acceptStep] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.computeInterpolatedStateAndDerivatives(DormandPrince853StepInterpolator.java:323)
            org.apache.commons.math.ode.sampling.AbstractStepInterpolator.evaluateCompleteInterpolatedState(AbstractStepInterpolator.java:405)
            org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getInterpolatedState(AbstractStepInterpolator.java:412)
            org.apache.commons.math.ode.AbstractIntegrator.acceptStep(AbstractIntegrator.java:360) */
        Class abstractIntegratorClazz = Class.forName("org.apache.commons.math.ode.AbstractIntegrator");
        Class dormandPrince853StepInterpolatorType = Class.forName("org.apache.commons.math.ode.sampling.AbstractStepInterpolator");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method acceptStepMethod = abstractIntegratorClazz.getDeclaredMethod("acceptStep", dormandPrince853StepInterpolatorType, doubleArrayType, doubleArrayType, doubleType);
        acceptStepMethod.setAccessible(true);
        java.lang.Object[] acceptStepMethodArguments = new java.lang.Object[4];
        acceptStepMethodArguments[0] = dormandPrince853StepInterpolator;
        acceptStepMethodArguments[1] = ((Object) doubleArray);
        acceptStepMethodArguments[2] = ((Object) doubleArray);
        acceptStepMethodArguments[3] = java.lang.Double.NaN;
        try {
            acceptStepMethod.invoke(eulerIntegrator, acceptStepMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAcceptStep3() throws Throwable  {
        ThreeEighthesIntegrator threeEighthesIntegrator = ((ThreeEighthesIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.ThreeEighthesIntegrator"));
        ArrayList eventsStates = new ArrayList();
        setField(threeEighthesIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        Object dormandPrince853StepInterpolator = createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator");
        setField(dormandPrince853StepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "globalPreviousTime", 0.0);
        setField(dormandPrince853StepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "globalCurrentTime", 0.0);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.acceptStep] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.computeInterpolatedStateAndDerivatives(DormandPrince853StepInterpolator.java:323)
            org.apache.commons.math.ode.sampling.AbstractStepInterpolator.evaluateCompleteInterpolatedState(AbstractStepInterpolator.java:405)
            org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getInterpolatedState(AbstractStepInterpolator.java:412)
            org.apache.commons.math.ode.AbstractIntegrator.acceptStep(AbstractIntegrator.java:360) */
        Class abstractIntegratorClazz = Class.forName("org.apache.commons.math.ode.AbstractIntegrator");
        Class dormandPrince853StepInterpolatorType = Class.forName("org.apache.commons.math.ode.sampling.AbstractStepInterpolator");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method acceptStepMethod = abstractIntegratorClazz.getDeclaredMethod("acceptStep", dormandPrince853StepInterpolatorType, doubleArrayType, doubleArrayType, doubleType);
        acceptStepMethod.setAccessible(true);
        java.lang.Object[] acceptStepMethodArguments = new java.lang.Object[4];
        acceptStepMethodArguments[0] = dormandPrince853StepInterpolator;
        acceptStepMethodArguments[1] = ((Object) doubleArray);
        acceptStepMethodArguments[2] = ((Object) null);
        acceptStepMethodArguments[3] = java.lang.Double.NaN;
        try {
            acceptStepMethod.invoke(threeEighthesIntegrator, acceptStepMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAcceptStep4() throws Throwable  {
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator"));
        HashSet eventsStates = new HashSet();
        EventState eventState = ((EventState) createInstance("org.apache.commons.math.ode.events.EventState"));
        eventsStates.add(eventState);
        setField(dormandPrince54Integrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        Object gillStepInterpolator = createInstance("org.apache.commons.math.ode.nonstiff.GillStepInterpolator");
        setField(gillStepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "globalPreviousTime", 0.0);
        setField(gillStepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "globalCurrentTime", 0.0);
        (((AbstractStepInterpolator) gillStepInterpolator)).setSoftPreviousTime(java.lang.Double.NaN);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.acceptStep] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.nonstiff.GillStepInterpolator.computeInterpolatedStateAndDerivatives(GillStepInterpolator.java:110)
            org.apache.commons.math.ode.sampling.AbstractStepInterpolator.evaluateCompleteInterpolatedState(AbstractStepInterpolator.java:405)
            org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getInterpolatedState(AbstractStepInterpolator.java:412)
            org.apache.commons.math.ode.events.EventState.reinitializeBegin(EventState.java:156)
            org.apache.commons.math.ode.AbstractIntegrator.acceptStep(AbstractIntegrator.java:285) */
        Class abstractIntegratorClazz = Class.forName("org.apache.commons.math.ode.AbstractIntegrator");
        Class gillStepInterpolatorType = Class.forName("org.apache.commons.math.ode.sampling.AbstractStepInterpolator");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method acceptStepMethod = abstractIntegratorClazz.getDeclaredMethod("acceptStep", gillStepInterpolatorType, doubleArrayType, doubleArrayType, doubleType);
        acceptStepMethod.setAccessible(true);
        java.lang.Object[] acceptStepMethodArguments = new java.lang.Object[4];
        acceptStepMethodArguments[0] = gillStepInterpolator;
        acceptStepMethodArguments[1] = ((Object) doubleArray);
        acceptStepMethodArguments[2] = ((Object) doubleArray);
        acceptStepMethodArguments[3] = java.lang.Double.NaN;
        try {
            acceptStepMethod.invoke(dormandPrince54Integrator, acceptStepMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAcceptStep5() throws Throwable  {
        ThreeEighthesIntegrator threeEighthesIntegrator = ((ThreeEighthesIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.ThreeEighthesIntegrator"));
        HashSet eventsStates = new HashSet();
        EventState eventState = ((EventState) createInstance("org.apache.commons.math.ode.events.EventState"));
        eventsStates.add(eventState);
        setField(threeEighthesIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        setField(threeEighthesIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "statesInitialized", true);
        Object graggBulirschStoerStepInterpolator = createInstance("org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator");
        setField(graggBulirschStoerStepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "globalPreviousTime", 0.0);
        setField(graggBulirschStoerStepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "globalCurrentTime", 0.0);
        setField(graggBulirschStoerStepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "forward", true);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.acceptStep] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.computeInterpolatedStateAndDerivatives(GraggBulirschStoerStepInterpolator.java:319)
            org.apache.commons.math.ode.sampling.AbstractStepInterpolator.evaluateCompleteInterpolatedState(AbstractStepInterpolator.java:405)
            org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getInterpolatedState(AbstractStepInterpolator.java:412)
            org.apache.commons.math.ode.events.EventState.evaluateStep(EventState.java:214)
            org.apache.commons.math.ode.AbstractIntegrator.acceptStep(AbstractIntegrator.java:302) */
        Class abstractIntegratorClazz = Class.forName("org.apache.commons.math.ode.AbstractIntegrator");
        Class graggBulirschStoerStepInterpolatorType = Class.forName("org.apache.commons.math.ode.sampling.AbstractStepInterpolator");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method acceptStepMethod = abstractIntegratorClazz.getDeclaredMethod("acceptStep", graggBulirschStoerStepInterpolatorType, doubleArrayType, doubleArrayType, doubleType);
        acceptStepMethod.setAccessible(true);
        java.lang.Object[] acceptStepMethodArguments = new java.lang.Object[4];
        acceptStepMethodArguments[0] = graggBulirschStoerStepInterpolator;
        acceptStepMethodArguments[1] = ((Object) doubleArray);
        acceptStepMethodArguments[2] = ((Object) doubleArray1);
        acceptStepMethodArguments[3] = java.lang.Double.NaN;
        try {
            acceptStepMethod.invoke(threeEighthesIntegrator, acceptStepMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAcceptStep6() throws Throwable  {
        EulerIntegrator eulerIntegrator = ((EulerIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.EulerIntegrator"));
        HashSet eventsStates = new HashSet();
        eventsStates.add(null);
        setField(eulerIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        Object dormandPrince853StepInterpolator = createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator");
        setField(dormandPrince853StepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "globalPreviousTime", 0.0);
        setField(dormandPrince853StepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "globalCurrentTime", 0.0);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.acceptStep] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.AbstractIntegrator.acceptStep(AbstractIntegrator.java:285) */
        Class abstractIntegratorClazz = Class.forName("org.apache.commons.math.ode.AbstractIntegrator");
        Class dormandPrince853StepInterpolatorType = Class.forName("org.apache.commons.math.ode.sampling.AbstractStepInterpolator");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method acceptStepMethod = abstractIntegratorClazz.getDeclaredMethod("acceptStep", dormandPrince853StepInterpolatorType, doubleArrayType, doubleArrayType, doubleType);
        acceptStepMethod.setAccessible(true);
        java.lang.Object[] acceptStepMethodArguments = new java.lang.Object[4];
        acceptStepMethodArguments[0] = dormandPrince853StepInterpolator;
        acceptStepMethodArguments[1] = ((Object) doubleArray);
        acceptStepMethodArguments[2] = ((Object) doubleArray);
        acceptStepMethodArguments[3] = java.lang.Double.NaN;
        try {
            acceptStepMethod.invoke(eulerIntegrator, acceptStepMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAcceptStep7() throws Throwable  {
        ThreeEighthesIntegrator threeEighthesIntegrator = ((ThreeEighthesIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.ThreeEighthesIntegrator"));
        HashSet eventsStates = new HashSet();
        eventsStates.add(null);
        setField(threeEighthesIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        setField(threeEighthesIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "statesInitialized", true);
        Object threeEighthesStepInterpolator = createInstance("org.apache.commons.math.ode.nonstiff.ThreeEighthesStepInterpolator");
        setField(threeEighthesStepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "globalPreviousTime", 0.0);
        setField(threeEighthesStepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "globalCurrentTime", 0.0);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.acceptStep] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.AbstractIntegrator.acceptStep(AbstractIntegrator.java:302) */
        Class abstractIntegratorClazz = Class.forName("org.apache.commons.math.ode.AbstractIntegrator");
        Class threeEighthesStepInterpolatorType = Class.forName("org.apache.commons.math.ode.sampling.AbstractStepInterpolator");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method acceptStepMethod = abstractIntegratorClazz.getDeclaredMethod("acceptStep", threeEighthesStepInterpolatorType, doubleArrayType, doubleArrayType, doubleType);
        acceptStepMethod.setAccessible(true);
        java.lang.Object[] acceptStepMethodArguments = new java.lang.Object[4];
        acceptStepMethodArguments[0] = threeEighthesStepInterpolator;
        acceptStepMethodArguments[1] = ((Object) doubleArray);
        acceptStepMethodArguments[2] = ((Object) doubleArray);
        acceptStepMethodArguments[3] = java.lang.Double.NaN;
        try {
            acceptStepMethod.invoke(threeEighthesIntegrator, acceptStepMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAcceptStep8() throws Throwable  {
        ThreeEighthesIntegrator threeEighthesIntegrator = ((ThreeEighthesIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.ThreeEighthesIntegrator"));
        HashSet eventsStates = new HashSet();
        EventState eventState = ((EventState) createInstance("org.apache.commons.math.ode.events.EventState"));
        eventsStates.add(eventState);
        EventState eventState1 = ((EventState) createInstance("org.apache.commons.math.ode.events.EventState"));
        eventsStates.add(eventState1);
        setField(threeEighthesIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        setField(threeEighthesIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "statesInitialized", true);
        Object gillStepInterpolator = createInstance("org.apache.commons.math.ode.nonstiff.GillStepInterpolator");
        setField(gillStepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "globalPreviousTime", 0.0);
        setField(gillStepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "globalCurrentTime", 0.0);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.acceptStep] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.nonstiff.GillStepInterpolator.computeInterpolatedStateAndDerivatives(GillStepInterpolator.java:110)
            org.apache.commons.math.ode.sampling.AbstractStepInterpolator.evaluateCompleteInterpolatedState(AbstractStepInterpolator.java:405)
            org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getInterpolatedState(AbstractStepInterpolator.java:412)
            org.apache.commons.math.ode.events.EventState.evaluateStep(EventState.java:214)
            org.apache.commons.math.ode.AbstractIntegrator.acceptStep(AbstractIntegrator.java:302) */
        Class abstractIntegratorClazz = Class.forName("org.apache.commons.math.ode.AbstractIntegrator");
        Class gillStepInterpolatorType = Class.forName("org.apache.commons.math.ode.sampling.AbstractStepInterpolator");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method acceptStepMethod = abstractIntegratorClazz.getDeclaredMethod("acceptStep", gillStepInterpolatorType, doubleArrayType, doubleArrayType, doubleType);
        acceptStepMethod.setAccessible(true);
        java.lang.Object[] acceptStepMethodArguments = new java.lang.Object[4];
        acceptStepMethodArguments[0] = gillStepInterpolator;
        acceptStepMethodArguments[1] = ((Object) doubleArray);
        acceptStepMethodArguments[2] = ((Object) doubleArray);
        acceptStepMethodArguments[3] = java.lang.Double.NaN;
        try {
            acceptStepMethod.invoke(threeEighthesIntegrator, acceptStepMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAcceptStep9() throws Throwable  {
        ThreeEighthesIntegrator threeEighthesIntegrator = ((ThreeEighthesIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.ThreeEighthesIntegrator"));
        HashSet eventsStates = new HashSet();
        eventsStates.add(null);
        setField(threeEighthesIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        setField(threeEighthesIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "statesInitialized", true);
        Object dormandPrince853StepInterpolator = createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator");
        setField(dormandPrince853StepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "globalPreviousTime", 0.0);
        setField(dormandPrince853StepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "globalCurrentTime", 0.0);
        setField(dormandPrince853StepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "forward", true);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.acceptStep] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.AbstractIntegrator.acceptStep(AbstractIntegrator.java:302) */
        Class abstractIntegratorClazz = Class.forName("org.apache.commons.math.ode.AbstractIntegrator");
        Class dormandPrince853StepInterpolatorType = Class.forName("org.apache.commons.math.ode.sampling.AbstractStepInterpolator");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method acceptStepMethod = abstractIntegratorClazz.getDeclaredMethod("acceptStep", dormandPrince853StepInterpolatorType, doubleArrayType, doubleArrayType, doubleType);
        acceptStepMethod.setAccessible(true);
        java.lang.Object[] acceptStepMethodArguments = new java.lang.Object[4];
        acceptStepMethodArguments[0] = dormandPrince853StepInterpolator;
        acceptStepMethodArguments[1] = ((Object) null);
        acceptStepMethodArguments[2] = ((Object) doubleArray);
        acceptStepMethodArguments[3] = java.lang.Double.NaN;
        try {
            acceptStepMethod.invoke(threeEighthesIntegrator, acceptStepMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAcceptStep10() throws Throwable  {
        ThreeEighthesIntegrator threeEighthesIntegrator = ((ThreeEighthesIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.ThreeEighthesIntegrator"));
        HashSet eventsStates = new HashSet();
        EventState eventState = ((EventState) createInstance("org.apache.commons.math.ode.events.EventState"));
        eventsStates.add(eventState);
        EventState eventState1 = ((EventState) createInstance("org.apache.commons.math.ode.events.EventState"));
        eventsStates.add(eventState1);
        setField(threeEighthesIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        setField(threeEighthesIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "statesInitialized", true);
        Object gillStepInterpolator = createInstance("org.apache.commons.math.ode.nonstiff.GillStepInterpolator");
        setField(gillStepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "globalPreviousTime", 0.0);
        setField(gillStepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "globalCurrentTime", 0.0);
        setField(gillStepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "forward", true);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.acceptStep] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.nonstiff.GillStepInterpolator.computeInterpolatedStateAndDerivatives(GillStepInterpolator.java:110)
            org.apache.commons.math.ode.sampling.AbstractStepInterpolator.evaluateCompleteInterpolatedState(AbstractStepInterpolator.java:405)
            org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getInterpolatedState(AbstractStepInterpolator.java:412)
            org.apache.commons.math.ode.events.EventState.evaluateStep(EventState.java:214)
            org.apache.commons.math.ode.AbstractIntegrator.acceptStep(AbstractIntegrator.java:302) */
        Class abstractIntegratorClazz = Class.forName("org.apache.commons.math.ode.AbstractIntegrator");
        Class gillStepInterpolatorType = Class.forName("org.apache.commons.math.ode.sampling.AbstractStepInterpolator");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method acceptStepMethod = abstractIntegratorClazz.getDeclaredMethod("acceptStep", gillStepInterpolatorType, doubleArrayType, doubleArrayType, doubleType);
        acceptStepMethod.setAccessible(true);
        java.lang.Object[] acceptStepMethodArguments = new java.lang.Object[4];
        acceptStepMethodArguments[0] = gillStepInterpolator;
        acceptStepMethodArguments[1] = ((Object) null);
        acceptStepMethodArguments[2] = ((Object) doubleArray);
        acceptStepMethodArguments[3] = java.lang.Double.NaN;
        try {
            acceptStepMethod.invoke(threeEighthesIntegrator, acceptStepMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAcceptStep11() throws Throwable  {
        ThreeEighthesIntegrator threeEighthesIntegrator = ((ThreeEighthesIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.ThreeEighthesIntegrator"));
        HashSet eventsStates = new HashSet();
        EventState eventState = ((EventState) createInstance("org.apache.commons.math.ode.events.EventState"));
        eventsStates.add(eventState);
        EventState eventState1 = ((EventState) createInstance("org.apache.commons.math.ode.events.EventState"));
        eventsStates.add(eventState1);
        eventsStates.add(eventState1);
        setField(threeEighthesIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        setField(threeEighthesIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "statesInitialized", true);
        Object highamHall54StepInterpolator = createInstance("org.apache.commons.math.ode.nonstiff.HighamHall54StepInterpolator");
        setField(highamHall54StepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "globalPreviousTime", 0.0);
        setField(highamHall54StepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "globalCurrentTime", 0.0);
        setField(highamHall54StepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "forward", true);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.acceptStep] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.nonstiff.HighamHall54StepInterpolator.computeInterpolatedStateAndDerivatives(HighamHall54StepInterpolator.java:87)
            org.apache.commons.math.ode.sampling.AbstractStepInterpolator.evaluateCompleteInterpolatedState(AbstractStepInterpolator.java:405)
            org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getInterpolatedState(AbstractStepInterpolator.java:412)
            org.apache.commons.math.ode.events.EventState.evaluateStep(EventState.java:214)
            org.apache.commons.math.ode.AbstractIntegrator.acceptStep(AbstractIntegrator.java:302) */
        Class abstractIntegratorClazz = Class.forName("org.apache.commons.math.ode.AbstractIntegrator");
        Class highamHall54StepInterpolatorType = Class.forName("org.apache.commons.math.ode.sampling.AbstractStepInterpolator");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method acceptStepMethod = abstractIntegratorClazz.getDeclaredMethod("acceptStep", highamHall54StepInterpolatorType, doubleArrayType, doubleArrayType, doubleType);
        acceptStepMethod.setAccessible(true);
        java.lang.Object[] acceptStepMethodArguments = new java.lang.Object[4];
        acceptStepMethodArguments[0] = highamHall54StepInterpolator;
        acceptStepMethodArguments[1] = ((Object) null);
        acceptStepMethodArguments[2] = ((Object) doubleArray);
        acceptStepMethodArguments[3] = java.lang.Double.NaN;
        try {
            acceptStepMethod.invoke(threeEighthesIntegrator, acceptStepMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAcceptStep12() throws Exception  {
        AdamsMoultonIntegrator adamsMoultonIntegrator = ((AdamsMoultonIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator"));
        ArrayList eventsStates = new ArrayList();
        EventState eventState = ((EventState) createInstance("org.apache.commons.math.ode.events.EventState"));
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "t0", 0.0);
        eventsStates.add(eventState);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(adamsMoultonIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        NordsieckStepInterpolator nordsieckStepInterpolator = ((NordsieckStepInterpolator) createInstance("org.apache.commons.math.ode.sampling.NordsieckStepInterpolator"));
        double[] stateVariation = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator", "stateVariation", stateVariation);
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator", "scalingH", java.lang.Double.NaN);
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator", "referenceTime", java.lang.Double.NaN);
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "h", -0.0);
        nordsieckStepInterpolator.setInterpolatedTime(0.0);
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "globalPreviousTime", 0.0);
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "globalCurrentTime", 0.0);
        nordsieckStepInterpolator.setSoftPreviousTime(0.0);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.acceptStep] produces [java.lang.NullPointerException]
            java.base/java.util.Arrays.fill(Arrays.java:3357)
            org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.computeInterpolatedStateAndDerivatives(NordsieckStepInterpolator.java:194)
            org.apache.commons.math.ode.sampling.AbstractStepInterpolator.evaluateCompleteInterpolatedState(AbstractStepInterpolator.java:405)
            org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getInterpolatedState(AbstractStepInterpolator.java:412)
            org.apache.commons.math.ode.events.EventState.reinitializeBegin(EventState.java:156)
            org.apache.commons.math.ode.AbstractIntegrator.acceptStep(AbstractIntegrator.java:285) */
        adamsMoultonIntegrator.acceptStep(nordsieckStepInterpolator, doubleArray, doubleArray, java.lang.Double.NaN);
    }
    
    @Test
    public void testAcceptStep13() throws Exception  {
        AdamsMoultonIntegrator adamsMoultonIntegrator = ((AdamsMoultonIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator"));
        ArrayList eventsStates = new ArrayList();
        EventState eventState = ((EventState) createInstance("org.apache.commons.math.ode.events.EventState"));
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "t0", 0.0);
        eventsStates.add(eventState);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(adamsMoultonIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        NordsieckStepInterpolator nordsieckStepInterpolator = ((NordsieckStepInterpolator) createInstance("org.apache.commons.math.ode.sampling.NordsieckStepInterpolator"));
        double[] stateVariation = {};
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator", "stateVariation", stateVariation);
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator", "scalingH", 0.0);
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator", "referenceTime", 0.0);
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "h", 4.9E-324);
        nordsieckStepInterpolator.setInterpolatedTime(0.0);
        double[] interpolatedDerivatives = {0.0};
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "interpolatedDerivatives", interpolatedDerivatives);
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "globalPreviousTime", 0.0);
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "globalCurrentTime", 0.0);
        nordsieckStepInterpolator.setSoftPreviousTime(0.0);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.acceptStep] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.computeInterpolatedStateAndDerivatives(NordsieckStepInterpolator.java:198)
            org.apache.commons.math.ode.sampling.AbstractStepInterpolator.evaluateCompleteInterpolatedState(AbstractStepInterpolator.java:405)
            org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getInterpolatedState(AbstractStepInterpolator.java:412)
            org.apache.commons.math.ode.events.EventState.reinitializeBegin(EventState.java:156)
            org.apache.commons.math.ode.AbstractIntegrator.acceptStep(AbstractIntegrator.java:285) */
        adamsMoultonIntegrator.acceptStep(nordsieckStepInterpolator, doubleArray, doubleArray, java.lang.Double.NaN);
    }
    
    @Test
    public void testAcceptStep14() throws Exception  {
        ThreeEighthesIntegrator threeEighthesIntegrator = ((ThreeEighthesIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.ThreeEighthesIntegrator"));
        ArrayList eventsStates = new ArrayList();
        EventState eventState = ((EventState) createInstance("org.apache.commons.math.ode.events.EventState"));
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "t0", 0.0);
        eventsStates.add(eventState);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(threeEighthesIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        NordsieckStepInterpolator nordsieckStepInterpolator = ((NordsieckStepInterpolator) createInstance("org.apache.commons.math.ode.sampling.NordsieckStepInterpolator"));
        double[] stateVariation = {};
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator", "stateVariation", stateVariation);
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator", "scalingH", 0.0);
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator", "referenceTime", 0.0);
        Array2DRowRealMatrix nordsieck = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[35][];
        data[0] = ((double[]) null);
        data[1] = ((double[]) null);
        data[2] = ((double[]) null);
        data[3] = ((double[]) null);
        data[4] = ((double[]) null);
        data[5] = ((double[]) null);
        data[6] = ((double[]) null);
        data[7] = ((double[]) null);
        data[8] = ((double[]) null);
        data[9] = ((double[]) null);
        data[10] = ((double[]) null);
        data[11] = ((double[]) null);
        data[12] = ((double[]) null);
        data[13] = ((double[]) null);
        data[14] = ((double[]) null);
        data[15] = ((double[]) null);
        data[16] = ((double[]) null);
        data[17] = ((double[]) null);
        data[18] = ((double[]) null);
        data[19] = ((double[]) null);
        data[20] = ((double[]) null);
        data[21] = ((double[]) null);
        data[22] = ((double[]) null);
        data[23] = ((double[]) null);
        data[24] = ((double[]) null);
        data[25] = ((double[]) null);
        data[26] = ((double[]) null);
        data[27] = ((double[]) null);
        data[28] = ((double[]) null);
        data[29] = ((double[]) null);
        data[30] = ((double[]) null);
        data[31] = ((double[]) null);
        data[32] = ((double[]) null);
        data[33] = ((double[]) null);
        data[34] = ((double[]) null);
        setField(nordsieck, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator", "nordsieck", nordsieck);
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "h", 4.9E-324);
        nordsieckStepInterpolator.setInterpolatedTime(0.0);
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "interpolatedDerivatives", stateVariation);
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "globalPreviousTime", 0.0);
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "globalCurrentTime", 0.0);
        nordsieckStepInterpolator.setSoftPreviousTime(0.0);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.acceptStep] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.computeInterpolatedStateAndDerivatives(NordsieckStepInterpolator.java:203)
            org.apache.commons.math.ode.sampling.AbstractStepInterpolator.evaluateCompleteInterpolatedState(AbstractStepInterpolator.java:405)
            org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getInterpolatedState(AbstractStepInterpolator.java:412)
            org.apache.commons.math.ode.events.EventState.reinitializeBegin(EventState.java:156)
            org.apache.commons.math.ode.AbstractIntegrator.acceptStep(AbstractIntegrator.java:285) */
        threeEighthesIntegrator.acceptStep(nordsieckStepInterpolator, doubleArray, doubleArray1, java.lang.Double.NaN);
    }
    
    @Test
    public void testAcceptStep15() throws Exception  {
        ThreeEighthesIntegrator threeEighthesIntegrator = ((ThreeEighthesIntegrator) createInstance("org.apache.commons.math.ode.nonstiff.ThreeEighthesIntegrator"));
        ArrayList eventsStates = new ArrayList();
        EventState eventState = ((EventState) createInstance("org.apache.commons.math.ode.events.EventState"));
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "t0", 0.0);
        eventsStates.add(eventState);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(threeEighthesIntegrator, "org.apache.commons.math.ode.AbstractIntegrator", "eventsStates", eventsStates);
        NordsieckStepInterpolator nordsieckStepInterpolator = ((NordsieckStepInterpolator) createInstance("org.apache.commons.math.ode.sampling.NordsieckStepInterpolator"));
        double[] stateVariation = {};
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator", "stateVariation", stateVariation);
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator", "scalingH", 0.0);
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator", "referenceTime", 0.0);
        Array2DRowRealMatrix nordsieck = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(nordsieck, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator", "nordsieck", nordsieck);
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "h", 4.9E-324);
        double[] currentState = {};
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "currentState", currentState);
        nordsieckStepInterpolator.setInterpolatedTime(0.0);
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "interpolatedDerivatives", stateVariation);
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "globalPreviousTime", 0.0);
        setField(nordsieckStepInterpolator, "org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "globalCurrentTime", 0.0);
        nordsieckStepInterpolator.setSoftPreviousTime(0.0);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math.ode.AbstractIntegrator.acceptStep] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getInterpolatedState(AbstractStepInterpolator.java:413)
            org.apache.commons.math.ode.events.EventState.reinitializeBegin(EventState.java:156)
            org.apache.commons.math.ode.AbstractIntegrator.acceptStep(AbstractIntegrator.java:285) */
        threeEighthesIntegrator.acceptStep(nordsieckStepInterpolator, doubleArray, doubleArray, java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.AbstractIntegrator.getName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getName()
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.AbstractIntegrator#getName()}
 * @utbot.returnsFrom {@code return name;}
 *  */
    @Test
    public void testGetName_ReturnName() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator"));
        
        String actual = dormandPrince853Integrator.getName();
        
        assertNull(actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields728799623807300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields728799623807300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass728799623812600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields728799623807300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass728799623812600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields728799624119400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields728799624119400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass728799624120600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields728799624119400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass728799624120600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

