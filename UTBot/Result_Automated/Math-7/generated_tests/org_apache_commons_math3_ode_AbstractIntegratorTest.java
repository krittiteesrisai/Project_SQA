package org.apache.commons.math3.ode;

import org.junit.Test;
import org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import java.util.HashSet;
import org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import java.util.ArrayList;
import org.apache.commons.math3.ode.events.EventState;
import org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator;
import org.apache.commons.math3.util.Incrementor;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.exception.TooManyIterationsException;
import org.apache.commons.math3.util.Incrementor.MaxCountExceededCallback;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator;
import org.apache.commons.math3.ode.nonstiff.EulerIntegrator;
import java.lang.reflect.Method;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.ode.nonstiff.GillIntegrator;
import org.apache.commons.math3.ode.sampling.DummyStepHandler;
import org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math3.ode.nonstiff.MidpointIntegrator;
import org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static java.lang.reflect.Array.get;

public final class org_apache_commons_math3_ode_AbstractIntegratorTest {
    ///region Test suites for executable org.apache.commons.math3.ode.AbstractIntegrator.getName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getName()
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#getName()}
 * @utbot.returnsFrom {@code return name;}
 *  */
    @Test
    public void testGetName_ReturnName() throws Exception  {
        AdamsBashforthIntegrator adamsBashforthIntegrator = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator"));
        
        String actual = adamsBashforthIntegrator.getName();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.ode.AbstractIntegrator.getCurrentStepStart
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCurrentStepStart()
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#getCurrentStepStart()}
 * @utbot.returnsFrom {@code return stepStart;}
 *  */
    @Test
    public void testGetCurrentStepStart_ReturnStepStart() throws Exception  {
        AdamsBashforthIntegrator adamsBashforthIntegrator = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator"));
        adamsBashforthIntegrator.stepStart = 0.0;
        
        double actual = adamsBashforthIntegrator.getCurrentStepStart();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.ode.AbstractIntegrator.getCurrentSignedStepsize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCurrentSignedStepsize()
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#getCurrentSignedStepsize()}
 * @utbot.returnsFrom {@code return stepSize;}
 *  */
    @Test
    public void testGetCurrentSignedStepsize_ReturnStepSize() throws Exception  {
        AdamsBashforthIntegrator adamsBashforthIntegrator = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator"));
        adamsBashforthIntegrator.stepSize = 0.0;
        
        double actual = adamsBashforthIntegrator.getCurrentSignedStepsize();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.ode.AbstractIntegrator.setStateInitialized
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setStateInitialized(boolean)
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#setStateInitialized(boolean)}
 *  */
    @Test
    public void testSetStateInitialized() throws Exception  {
        AdamsBashforthIntegrator adamsBashforthIntegrator = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator"));
        
        adamsBashforthIntegrator.setStateInitialized(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.ode.AbstractIntegrator.addStepHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addStepHandler(org.apache.commons.math3.ode.sampling.StepHandler)
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#addStepHandler(org.apache.commons.math3.ode.sampling.StepHandler)}
 * @utbot.invokes {@link java.util.Collection#add(java.lang.Object)}
 *  */
    @Test
    public void testAddStepHandler_CollectionAdd() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator"));
        HashSet stepHandlers = new HashSet();
        stepHandlers.add(null);
        setField(dormandPrince853Integrator, "org.apache.commons.math3.ode.AbstractIntegrator", "stepHandlers", stepHandlers);
        
        dormandPrince853Integrator.addStepHandler(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addStepHandler(org.apache.commons.math3.ode.sampling.StepHandler)
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#addStepHandler(org.apache.commons.math3.ode.sampling.StepHandler)}
 * @utbot.invokes {@link java.util.Collection#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: stepHandlers.add(handler);
 *  */
    @Test
    public void testAddStepHandler_ThrowNullPointerException() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator"));
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.addStepHandler] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.AbstractIntegrator.addStepHandler(AbstractIntegrator.java:109) */
        dormandPrince853Integrator.addStepHandler(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.ode.AbstractIntegrator.clearStepHandlers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clearStepHandlers()
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#clearStepHandlers()}
 * @utbot.invokes {@link java.util.Collection#clear()}
 *  */
    @Test
    public void testClearStepHandlers_CollectionClear() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator"));
        HashSet stepHandlers = new HashSet();
        setField(dormandPrince853Integrator, "org.apache.commons.math3.ode.AbstractIntegrator", "stepHandlers", stepHandlers);
        
        dormandPrince853Integrator.clearStepHandlers();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clearStepHandlers()
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#clearStepHandlers()}
 * @utbot.invokes {@link java.util.Collection#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: stepHandlers.clear();
 *  */
    @Test
    public void testClearStepHandlers_ThrowNullPointerException() throws Exception  {
        AdamsBashforthIntegrator adamsBashforthIntegrator = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator"));
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.clearStepHandlers] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.AbstractIntegrator.clearStepHandlers(AbstractIntegrator.java:119) */
        adamsBashforthIntegrator.clearStepHandlers();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addEventHandler(org.apache.commons.math3.ode.events.EventHandler, double, double, int, org.apache.commons.math3.analysis.solvers.UnivariateSolver)
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#addEventHandler(org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver)}
 *  */
    @Test
    public void testAddEventHandler_1() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator"));
        HashSet eventsStates = new HashSet();
        setField(dormandPrince853Integrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        dormandPrince853Integrator.addEventHandler(null, java.lang.Double.NaN, java.lang.Double.NaN, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#addEventHandler(org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver)}
 *  */
    @Test
    public void testAddEventHandler() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator"));
        HashSet eventsStates = new HashSet();
        eventsStates.add(null);
        setField(dormandPrince853Integrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        dormandPrince853Integrator.addEventHandler(null, java.lang.Double.NaN, -4.9E-324, -255, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addEventHandler(org.apache.commons.math3.ode.events.EventHandler, double, double, int, org.apache.commons.math3.analysis.solvers.UnivariateSolver)
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#addEventHandler(org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: eventsStates.add(new EventState(handler, maxCheckInterval, convergence, maxIterationCount, solver));
 *  */
    @Test
    public void testAddEventHandler_ThrowNullPointerException() throws Exception  {
        AdamsBashforthIntegrator adamsBashforthIntegrator = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator"));
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:138) */
        adamsBashforthIntegrator.addEventHandler(null, java.lang.Double.NaN, -4.9E-324, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#addEventHandler(org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: eventsStates.add(new EventState(handler, maxCheckInterval, convergence, maxIterationCount, solver));
 *  */
    @Test
    public void testAddEventHandler_ThrowNullPointerException_1() throws Exception  {
        AdamsBashforthIntegrator adamsBashforthIntegrator = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator"));
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:138) */
        adamsBashforthIntegrator.addEventHandler(null, java.lang.Double.NaN, -0.0, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#addEventHandler(org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: eventsStates.add(new EventState(handler, maxCheckInterval, convergence, maxIterationCount, solver));
 *  */
    @Test
    public void testAddEventHandler_ThrowNullPointerException_2() throws Exception  {
        AdamsMoultonIntegrator adamsMoultonIntegrator = ((AdamsMoultonIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator"));
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:138) */
        adamsMoultonIntegrator.addEventHandler(null, java.lang.Double.NaN, java.lang.Double.NaN, -255, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addEventHandler(org.apache.commons.math3.ode.events.EventHandler, double, double, int)
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#addEventHandler(org.apache.commons.math3.ode.events.EventHandler,double,double,int)}
 * @utbot.invokes {@link org.apache.commons.math3.ode.AbstractIntegrator#addEventHandler(org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver)}
 *  */
    @Test
    public void testAddEventHandler_AbstractIntegratorAddEventHandler() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator"));
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "maxOrder", 2);
        int[] costPerStep = {0};
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerStep", costPerStep);
        double[] costPerTimeUnit = {0.0};
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerTimeUnit", costPerTimeUnit);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "optimalStep", costPerTimeUnit);
        double[][] coeff = {null};
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff", coeff);
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        int[] initialGraggBulirschStoerIntegratorSequence = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence"));
        int[] initialGraggBulirschStoerIntegratorCostPerStep = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerStep"));
        double[] initialGraggBulirschStoerIntegratorCostPerTimeUnit = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerTimeUnit"));
        double[] initialGraggBulirschStoerIntegratorOptimalStep = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "optimalStep"));
        double[][] initialGraggBulirschStoerIntegratorCoeff = ((double[][]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff"));
        
        graggBulirschStoerIntegrator.addEventHandler(null, java.lang.Double.NaN, -4.9E-324, -255);
        
        int[] finalGraggBulirschStoerIntegratorSequence = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence"));
        int[] finalGraggBulirschStoerIntegratorCostPerStep = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerStep"));
        double[] finalGraggBulirschStoerIntegratorCostPerTimeUnit = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerTimeUnit"));
        double[] finalGraggBulirschStoerIntegratorOptimalStep = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "optimalStep"));
        double[][] finalGraggBulirschStoerIntegratorCoeff = ((double[][]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff"));
        
        assertFalse(initialGraggBulirschStoerIntegratorSequence == finalGraggBulirschStoerIntegratorSequence);
        
        assertFalse(initialGraggBulirschStoerIntegratorCostPerStep == finalGraggBulirschStoerIntegratorCostPerStep);
        
        assertFalse(initialGraggBulirschStoerIntegratorCostPerTimeUnit == finalGraggBulirschStoerIntegratorCostPerTimeUnit);
        
        assertFalse(initialGraggBulirschStoerIntegratorOptimalStep == finalGraggBulirschStoerIntegratorOptimalStep);
        
        assertFalse(initialGraggBulirschStoerIntegratorCoeff == finalGraggBulirschStoerIntegratorCoeff);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addEventHandler(org.apache.commons.math3.ode.events.EventHandler, double, double, int)
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#addEventHandler(org.apache.commons.math3.ode.events.EventHandler,double,double,int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: addEventHandler(handler, maxCheckInterval, convergence, maxIterationCount, new BracketingNthOrderBrentSolver(convergence, 5));
 *  */
    @Test
    public void testAddEventHandler_ThrowNegativeArraySizeException_1() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator"));
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "maxOrder", -1073741824);
        int[] sequence = {0};
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence", sequence);
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler] produces [java.lang.NegativeArraySizeException: -536870912]
            org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.initializeArrays(GraggBulirschStoerIntegrator.java:369)
            org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.addEventHandler(GraggBulirschStoerIntegrator.java:358)
            org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:127) */
        graggBulirschStoerIntegrator.addEventHandler(null, java.lang.Double.NaN, 2.0000000000000036, -255);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#addEventHandler(org.apache.commons.math3.ode.events.EventHandler,double,double,int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: addEventHandler(handler, maxCheckInterval, convergence, maxIterationCount, new BracketingNthOrderBrentSolver(convergence, 5));
 *  */
    @Test
    public void testAddEventHandler_ThrowNegativeArraySizeException() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator"));
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "maxOrder", -1073741824);
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler] produces [java.lang.NegativeArraySizeException: -536870912]
            org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.initializeArrays(GraggBulirschStoerIntegrator.java:369)
            org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.addEventHandler(GraggBulirschStoerIntegrator.java:358)
            org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:127) */
        graggBulirschStoerIntegrator.addEventHandler(null, java.lang.Double.NaN, -2.0522684006491881E-289, -256);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#addEventHandler(org.apache.commons.math3.ode.events.EventHandler,double,double,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: addEventHandler(handler, maxCheckInterval, convergence, maxIterationCount, new BracketingNthOrderBrentSolver(convergence, 5));
 *  */
    @Test
    public void testAddEventHandler_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator"));
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "maxOrder", 2);
        int[] sequence = {0};
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence", sequence);
        int[] costPerStep = {};
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerStep", costPerStep);
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.initializeArrays(GraggBulirschStoerIntegrator.java:383)
            org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.addEventHandler(GraggBulirschStoerIntegrator.java:358)
            org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:127) */
        graggBulirschStoerIntegrator.addEventHandler(null, java.lang.Double.NaN, -4.9E-324, -255);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#addEventHandler(org.apache.commons.math3.ode.events.EventHandler,double,double,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: addEventHandler(handler, maxCheckInterval, convergence, maxIterationCount, new BracketingNthOrderBrentSolver(convergence, 5));
 *  */
    @Test
    public void testAddEventHandler_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator"));
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "maxOrder", 2);
        int[] sequence = {0};
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence", sequence);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerStep", sequence);
        double[][] coeff = {};
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff", coeff);
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.initializeArrays(GraggBulirschStoerIntegrator.java:390)
            org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.addEventHandler(GraggBulirschStoerIntegrator.java:358)
            org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:127) */
        graggBulirschStoerIntegrator.addEventHandler(null, java.lang.Double.NaN, 0.0, -255);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#addEventHandler(org.apache.commons.math3.ode.events.EventHandler,double,double,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: addEventHandler(handler, maxCheckInterval, convergence, maxIterationCount, new BracketingNthOrderBrentSolver(convergence, 5));
 *  */
    @Test
    public void testAddEventHandler_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator"));
        int[] sequence = {0};
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence", sequence);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerStep", sequence);
        double[] costPerTimeUnit = {0.0};
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerTimeUnit", costPerTimeUnit);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "optimalStep", costPerTimeUnit);
        double[][] coeff = {null};
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff", coeff);
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.initializeArrays(GraggBulirschStoerIntegrator.java:383)
            org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.addEventHandler(GraggBulirschStoerIntegrator.java:358)
            org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:127) */
        graggBulirschStoerIntegrator.addEventHandler(null, java.lang.Double.NaN, -4.9E-324, -256);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#addEventHandler(org.apache.commons.math3.ode.events.EventHandler,double,double,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: addEventHandler(handler, maxCheckInterval, convergence, maxIterationCount, new BracketingNthOrderBrentSolver(convergence, 5));
 *  */
    @Test
    public void testAddEventHandler_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator"));
        int[] costPerStep = {0};
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerStep", costPerStep);
        double[] costPerTimeUnit = {0.0};
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerTimeUnit", costPerTimeUnit);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "optimalStep", costPerTimeUnit);
        double[][] coeff = {null};
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff", coeff);
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.initializeArrays(GraggBulirschStoerIntegrator.java:383)
            org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.addEventHandler(GraggBulirschStoerIntegrator.java:358)
            org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:127) */
        graggBulirschStoerIntegrator.addEventHandler(null, java.lang.Double.NaN, -4.9E-324, -256);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#addEventHandler(org.apache.commons.math3.ode.events.EventHandler,double,double,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: addEventHandler(handler, maxCheckInterval, convergence, maxIterationCount, new BracketingNthOrderBrentSolver(convergence, 5));
 *  */
    @Test
    public void testAddEventHandler_ThrowNullPointerException1() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator"));
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "maxOrder", 2);
        int[] sequence = {0};
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence", sequence);
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.initializeArrays(GraggBulirschStoerIntegrator.java:383)
            org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.addEventHandler(GraggBulirschStoerIntegrator.java:358)
            org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:127) */
        graggBulirschStoerIntegrator.addEventHandler(null, java.lang.Double.NaN, -0.0, -255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addEventHandler(org.apache.commons.math3.ode.events.EventHandler, double, double, int)
    
    @Test
    public void testAddEventHandler1() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator"));
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "maxOrder", 2);
        int[] sequence = {0};
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence", sequence);
        int[] costPerStep = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerStep", costPerStep);
        double[][] coeff = {
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        };
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff", coeff);
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        graggBulirschStoerIntegrator.addEventHandler(null, java.lang.Double.NaN, java.lang.Double.NaN, 0);
        
        int[] graggBulirschStoerIntegratorSequence = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence"));
        int finalGraggBulirschStoerIntegratorSequence0 = ((Integer) get(graggBulirschStoerIntegratorSequence, 0));
        int[] graggBulirschStoerIntegratorCostPerStep = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerStep"));
        int finalGraggBulirschStoerIntegratorCostPerStep0 = ((Integer) get(graggBulirschStoerIntegratorCostPerStep, 0));
        double[][] graggBulirschStoerIntegratorCoeff = ((double[][]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff"));
        double[] finalGraggBulirschStoerIntegratorCoeff0 = ((double[]) get(graggBulirschStoerIntegratorCoeff, 0));
        double[][] graggBulirschStoerIntegratorCoeff1 = ((double[][]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff"));
        double[] finalGraggBulirschStoerIntegratorCoeff1 = ((double[]) get(graggBulirschStoerIntegratorCoeff1, 1));
        double[][] graggBulirschStoerIntegratorCoeff2 = ((double[][]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff"));
        double[] finalGraggBulirschStoerIntegratorCoeff2 = ((double[]) get(graggBulirschStoerIntegratorCoeff2, 2));
        double[][] graggBulirschStoerIntegratorCoeff3 = ((double[][]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff"));
        double[] finalGraggBulirschStoerIntegratorCoeff3 = ((double[]) get(graggBulirschStoerIntegratorCoeff3, 3));
        double[][] graggBulirschStoerIntegratorCoeff4 = ((double[][]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff"));
        double[] finalGraggBulirschStoerIntegratorCoeff4 = ((double[]) get(graggBulirschStoerIntegratorCoeff4, 4));
        double[][] graggBulirschStoerIntegratorCoeff5 = ((double[][]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff"));
        double[] finalGraggBulirschStoerIntegratorCoeff5 = ((double[]) get(graggBulirschStoerIntegratorCoeff5, 5));
        double[][] graggBulirschStoerIntegratorCoeff6 = ((double[][]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff"));
        double[] finalGraggBulirschStoerIntegratorCoeff6 = ((double[]) get(graggBulirschStoerIntegratorCoeff6, 6));
        double[][] graggBulirschStoerIntegratorCoeff7 = ((double[][]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff"));
        double[] finalGraggBulirschStoerIntegratorCoeff7 = ((double[]) get(graggBulirschStoerIntegratorCoeff7, 7));
        double[][] graggBulirschStoerIntegratorCoeff8 = ((double[][]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff"));
        double[] finalGraggBulirschStoerIntegratorCoeff8 = ((double[]) get(graggBulirschStoerIntegratorCoeff8, 8));
        
        org.junit.Assert.assertEquals(2, finalGraggBulirschStoerIntegratorSequence0);
        
        org.junit.Assert.assertEquals(3, finalGraggBulirschStoerIntegratorCostPerStep0);
        
        assertNull(finalGraggBulirschStoerIntegratorCoeff0);
        
        assertNull(finalGraggBulirschStoerIntegratorCoeff1);
        
        assertNull(finalGraggBulirschStoerIntegratorCoeff2);
        
        assertNull(finalGraggBulirschStoerIntegratorCoeff3);
        
        assertNull(finalGraggBulirschStoerIntegratorCoeff4);
        
        assertNull(finalGraggBulirschStoerIntegratorCoeff5);
        
        assertNull(finalGraggBulirschStoerIntegratorCoeff6);
        
        assertNull(finalGraggBulirschStoerIntegratorCoeff7);
        
        assertNull(finalGraggBulirschStoerIntegratorCoeff8);
    }
    
    @Test
    public void testAddEventHandler2() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator"));
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "maxOrder", 2);
        int[] sequence = {0};
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence", sequence);
        int[] costPerStep = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerStep", costPerStep);
        double[][] coeff = {
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        };
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff", coeff);
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        graggBulirschStoerIntegrator.addEventHandler(null, java.lang.Double.NaN, 0.0, 0);
        
        int[] graggBulirschStoerIntegratorSequence = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence"));
        int finalGraggBulirschStoerIntegratorSequence0 = ((Integer) get(graggBulirschStoerIntegratorSequence, 0));
        int[] graggBulirschStoerIntegratorCostPerStep = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerStep"));
        int finalGraggBulirschStoerIntegratorCostPerStep0 = ((Integer) get(graggBulirschStoerIntegratorCostPerStep, 0));
        double[][] graggBulirschStoerIntegratorCoeff = ((double[][]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff"));
        double[] finalGraggBulirschStoerIntegratorCoeff0 = ((double[]) get(graggBulirschStoerIntegratorCoeff, 0));
        double[][] graggBulirschStoerIntegratorCoeff1 = ((double[][]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff"));
        double[] finalGraggBulirschStoerIntegratorCoeff1 = ((double[]) get(graggBulirschStoerIntegratorCoeff1, 1));
        double[][] graggBulirschStoerIntegratorCoeff2 = ((double[][]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff"));
        double[] finalGraggBulirschStoerIntegratorCoeff2 = ((double[]) get(graggBulirschStoerIntegratorCoeff2, 2));
        double[][] graggBulirschStoerIntegratorCoeff3 = ((double[][]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff"));
        double[] finalGraggBulirschStoerIntegratorCoeff3 = ((double[]) get(graggBulirschStoerIntegratorCoeff3, 3));
        double[][] graggBulirschStoerIntegratorCoeff4 = ((double[][]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff"));
        double[] finalGraggBulirschStoerIntegratorCoeff4 = ((double[]) get(graggBulirschStoerIntegratorCoeff4, 4));
        double[][] graggBulirschStoerIntegratorCoeff5 = ((double[][]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff"));
        double[] finalGraggBulirschStoerIntegratorCoeff5 = ((double[]) get(graggBulirschStoerIntegratorCoeff5, 5));
        double[][] graggBulirschStoerIntegratorCoeff6 = ((double[][]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff"));
        double[] finalGraggBulirschStoerIntegratorCoeff6 = ((double[]) get(graggBulirschStoerIntegratorCoeff6, 6));
        double[][] graggBulirschStoerIntegratorCoeff7 = ((double[][]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff"));
        double[] finalGraggBulirschStoerIntegratorCoeff7 = ((double[]) get(graggBulirschStoerIntegratorCoeff7, 7));
        double[][] graggBulirschStoerIntegratorCoeff8 = ((double[][]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff"));
        double[] finalGraggBulirschStoerIntegratorCoeff8 = ((double[]) get(graggBulirschStoerIntegratorCoeff8, 8));
        
        org.junit.Assert.assertEquals(2, finalGraggBulirschStoerIntegratorSequence0);
        
        org.junit.Assert.assertEquals(3, finalGraggBulirschStoerIntegratorCostPerStep0);
        
        assertNull(finalGraggBulirschStoerIntegratorCoeff0);
        
        assertNull(finalGraggBulirschStoerIntegratorCoeff1);
        
        assertNull(finalGraggBulirschStoerIntegratorCoeff2);
        
        assertNull(finalGraggBulirschStoerIntegratorCoeff3);
        
        assertNull(finalGraggBulirschStoerIntegratorCoeff4);
        
        assertNull(finalGraggBulirschStoerIntegratorCoeff5);
        
        assertNull(finalGraggBulirschStoerIntegratorCoeff6);
        
        assertNull(finalGraggBulirschStoerIntegratorCoeff7);
        
        assertNull(finalGraggBulirschStoerIntegratorCoeff8);
    }
    
    @Test
    public void testAddEventHandler3() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator"));
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "maxOrder", 46);
        int[] sequence = new int[40];
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence", sequence);
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        int[] initialGraggBulirschStoerIntegratorSequence = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence"));
        int[] initialGraggBulirschStoerIntegratorCostPerStep = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerStep"));
        double[] initialGraggBulirschStoerIntegratorCostPerTimeUnit = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerTimeUnit"));
        double[] initialGraggBulirschStoerIntegratorOptimalStep = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "optimalStep"));
        double[][] initialGraggBulirschStoerIntegratorCoeff = ((double[][]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff"));
        
        graggBulirschStoerIntegrator.addEventHandler(null, java.lang.Double.NaN, 3.31561842E-316, 0);
        
        int[] finalGraggBulirschStoerIntegratorSequence = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence"));
        int[] finalGraggBulirschStoerIntegratorCostPerStep = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerStep"));
        double[] finalGraggBulirschStoerIntegratorCostPerTimeUnit = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerTimeUnit"));
        double[] finalGraggBulirschStoerIntegratorOptimalStep = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "optimalStep"));
        double[][] finalGraggBulirschStoerIntegratorCoeff = ((double[][]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff"));
        
        assertFalse(initialGraggBulirschStoerIntegratorSequence == finalGraggBulirschStoerIntegratorSequence);
        
        assertFalse(initialGraggBulirschStoerIntegratorCostPerStep == finalGraggBulirschStoerIntegratorCostPerStep);
        
        assertFalse(initialGraggBulirschStoerIntegratorCostPerTimeUnit == finalGraggBulirschStoerIntegratorCostPerTimeUnit);
        
        assertFalse(initialGraggBulirschStoerIntegratorOptimalStep == finalGraggBulirschStoerIntegratorOptimalStep);
        
        assertFalse(initialGraggBulirschStoerIntegratorCoeff == finalGraggBulirschStoerIntegratorCoeff);
    }
    
    @Test
    public void testAddEventHandler4() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator"));
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "maxOrder", 46);
        int[] sequence = new int[40];
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence", sequence);
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        int[] initialGraggBulirschStoerIntegratorSequence = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence"));
        int[] initialGraggBulirschStoerIntegratorCostPerStep = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerStep"));
        double[] initialGraggBulirschStoerIntegratorCostPerTimeUnit = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerTimeUnit"));
        double[] initialGraggBulirschStoerIntegratorOptimalStep = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "optimalStep"));
        double[][] initialGraggBulirschStoerIntegratorCoeff = ((double[][]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff"));
        
        graggBulirschStoerIntegrator.addEventHandler(null, java.lang.Double.NaN, -0.0, 0);
        
        int[] finalGraggBulirschStoerIntegratorSequence = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence"));
        int[] finalGraggBulirschStoerIntegratorCostPerStep = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerStep"));
        double[] finalGraggBulirschStoerIntegratorCostPerTimeUnit = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerTimeUnit"));
        double[] finalGraggBulirschStoerIntegratorOptimalStep = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "optimalStep"));
        double[][] finalGraggBulirschStoerIntegratorCoeff = ((double[][]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff"));
        
        assertFalse(initialGraggBulirschStoerIntegratorSequence == finalGraggBulirschStoerIntegratorSequence);
        
        assertFalse(initialGraggBulirschStoerIntegratorCostPerStep == finalGraggBulirschStoerIntegratorCostPerStep);
        
        assertFalse(initialGraggBulirschStoerIntegratorCostPerTimeUnit == finalGraggBulirschStoerIntegratorCostPerTimeUnit);
        
        assertFalse(initialGraggBulirschStoerIntegratorOptimalStep == finalGraggBulirschStoerIntegratorOptimalStep);
        
        assertFalse(initialGraggBulirschStoerIntegratorCoeff == finalGraggBulirschStoerIntegratorCoeff);
    }
    
    @Test
    public void testAddEventHandler5() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator"));
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "maxOrder", 50);
        int[] sequence = new int[38];
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence", sequence);
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        int[] initialGraggBulirschStoerIntegratorSequence = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence"));
        int[] initialGraggBulirschStoerIntegratorCostPerStep = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerStep"));
        double[] initialGraggBulirschStoerIntegratorCostPerTimeUnit = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerTimeUnit"));
        double[] initialGraggBulirschStoerIntegratorOptimalStep = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "optimalStep"));
        double[][] initialGraggBulirschStoerIntegratorCoeff = ((double[][]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff"));
        
        graggBulirschStoerIntegrator.addEventHandler(null, java.lang.Double.NaN, -4.9E-324, 0);
        
        int[] finalGraggBulirschStoerIntegratorSequence = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence"));
        int[] finalGraggBulirschStoerIntegratorCostPerStep = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerStep"));
        double[] finalGraggBulirschStoerIntegratorCostPerTimeUnit = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerTimeUnit"));
        double[] finalGraggBulirschStoerIntegratorOptimalStep = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "optimalStep"));
        double[][] finalGraggBulirschStoerIntegratorCoeff = ((double[][]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff"));
        
        assertFalse(initialGraggBulirschStoerIntegratorSequence == finalGraggBulirschStoerIntegratorSequence);
        
        assertFalse(initialGraggBulirschStoerIntegratorCostPerStep == finalGraggBulirschStoerIntegratorCostPerStep);
        
        assertFalse(initialGraggBulirschStoerIntegratorCostPerTimeUnit == finalGraggBulirschStoerIntegratorCostPerTimeUnit);
        
        assertFalse(initialGraggBulirschStoerIntegratorOptimalStep == finalGraggBulirschStoerIntegratorOptimalStep);
        
        assertFalse(initialGraggBulirschStoerIntegratorCoeff == finalGraggBulirschStoerIntegratorCoeff);
    }
    
    @Test
    public void testAddEventHandler6() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator"));
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "maxOrder", 18);
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        int[] initialGraggBulirschStoerIntegratorSequence = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence"));
        int[] initialGraggBulirschStoerIntegratorCostPerStep = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerStep"));
        double[] initialGraggBulirschStoerIntegratorCostPerTimeUnit = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerTimeUnit"));
        double[] initialGraggBulirschStoerIntegratorOptimalStep = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "optimalStep"));
        double[][] initialGraggBulirschStoerIntegratorCoeff = ((double[][]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff"));
        
        graggBulirschStoerIntegrator.addEventHandler(null, java.lang.Double.NaN, 0.0, 0);
        
        int[] finalGraggBulirschStoerIntegratorSequence = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence"));
        int[] finalGraggBulirschStoerIntegratorCostPerStep = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerStep"));
        double[] finalGraggBulirschStoerIntegratorCostPerTimeUnit = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerTimeUnit"));
        double[] finalGraggBulirschStoerIntegratorOptimalStep = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "optimalStep"));
        double[][] finalGraggBulirschStoerIntegratorCoeff = ((double[][]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff"));
        
        assertFalse(initialGraggBulirschStoerIntegratorSequence == finalGraggBulirschStoerIntegratorSequence);
        
        assertFalse(initialGraggBulirschStoerIntegratorCostPerStep == finalGraggBulirschStoerIntegratorCostPerStep);
        
        assertFalse(initialGraggBulirschStoerIntegratorCostPerTimeUnit == finalGraggBulirschStoerIntegratorCostPerTimeUnit);
        
        assertFalse(initialGraggBulirschStoerIntegratorOptimalStep == finalGraggBulirschStoerIntegratorOptimalStep);
        
        assertFalse(initialGraggBulirschStoerIntegratorCoeff == finalGraggBulirschStoerIntegratorCoeff);
    }
    
    @Test
    public void testAddEventHandler7() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator"));
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "maxOrder", 18);
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        int[] initialGraggBulirschStoerIntegratorSequence = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence"));
        int[] initialGraggBulirschStoerIntegratorCostPerStep = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerStep"));
        double[] initialGraggBulirschStoerIntegratorCostPerTimeUnit = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerTimeUnit"));
        double[] initialGraggBulirschStoerIntegratorOptimalStep = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "optimalStep"));
        double[][] initialGraggBulirschStoerIntegratorCoeff = ((double[][]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff"));
        
        graggBulirschStoerIntegrator.addEventHandler(null, java.lang.Double.NaN, java.lang.Double.NaN, 0);
        
        int[] finalGraggBulirschStoerIntegratorSequence = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence"));
        int[] finalGraggBulirschStoerIntegratorCostPerStep = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerStep"));
        double[] finalGraggBulirschStoerIntegratorCostPerTimeUnit = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerTimeUnit"));
        double[] finalGraggBulirschStoerIntegratorOptimalStep = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "optimalStep"));
        double[][] finalGraggBulirschStoerIntegratorCoeff = ((double[][]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff"));
        
        assertFalse(initialGraggBulirschStoerIntegratorSequence == finalGraggBulirschStoerIntegratorSequence);
        
        assertFalse(initialGraggBulirschStoerIntegratorCostPerStep == finalGraggBulirschStoerIntegratorCostPerStep);
        
        assertFalse(initialGraggBulirschStoerIntegratorCostPerTimeUnit == finalGraggBulirschStoerIntegratorCostPerTimeUnit);
        
        assertFalse(initialGraggBulirschStoerIntegratorOptimalStep == finalGraggBulirschStoerIntegratorOptimalStep);
        
        assertFalse(initialGraggBulirschStoerIntegratorCoeff == finalGraggBulirschStoerIntegratorCoeff);
    }
    
    @Test
    public void testAddEventHandler8() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator"));
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "maxOrder", 5);
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        int[] initialGraggBulirschStoerIntegratorSequence = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence"));
        int[] initialGraggBulirschStoerIntegratorCostPerStep = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerStep"));
        double[] initialGraggBulirschStoerIntegratorCostPerTimeUnit = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerTimeUnit"));
        double[] initialGraggBulirschStoerIntegratorOptimalStep = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "optimalStep"));
        double[][] initialGraggBulirschStoerIntegratorCoeff = ((double[][]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff"));
        
        graggBulirschStoerIntegrator.addEventHandler(null, java.lang.Double.NaN, -4.9E-324, 0);
        
        int[] finalGraggBulirschStoerIntegratorSequence = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence"));
        int[] finalGraggBulirschStoerIntegratorCostPerStep = ((int[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerStep"));
        double[] finalGraggBulirschStoerIntegratorCostPerTimeUnit = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerTimeUnit"));
        double[] finalGraggBulirschStoerIntegratorOptimalStep = ((double[]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "optimalStep"));
        double[][] finalGraggBulirschStoerIntegratorCoeff = ((double[][]) getFieldValue(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "coeff"));
        
        assertFalse(initialGraggBulirschStoerIntegratorSequence == finalGraggBulirschStoerIntegratorSequence);
        
        assertFalse(initialGraggBulirschStoerIntegratorCostPerStep == finalGraggBulirschStoerIntegratorCostPerStep);
        
        assertFalse(initialGraggBulirschStoerIntegratorCostPerTimeUnit == finalGraggBulirschStoerIntegratorCostPerTimeUnit);
        
        assertFalse(initialGraggBulirschStoerIntegratorOptimalStep == finalGraggBulirschStoerIntegratorOptimalStep);
        
        assertFalse(initialGraggBulirschStoerIntegratorCoeff == finalGraggBulirschStoerIntegratorCoeff);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addEventHandler(org.apache.commons.math3.ode.events.EventHandler, double, double, int)
    
    @Test
    public void testAddEventHandler9() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator"));
        HashSet eventsStates = new HashSet();
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.initializeArrays(GraggBulirschStoerIntegrator.java:383)
            org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.addEventHandler(GraggBulirschStoerIntegrator.java:358)
            org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:127) */
        graggBulirschStoerIntegrator.addEventHandler(null, java.lang.Double.NaN, 2.22724678219715E-308, 0);
    }
    
    @Test
    public void testAddEventHandler10() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator"));
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "maxOrder", -1073741824);
        int[] sequence = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence", sequence);
        HashSet eventsStates = new HashSet();
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler] produces [java.lang.NegativeArraySizeException: -536870912]
            org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.initializeArrays(GraggBulirschStoerIntegrator.java:369)
            org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.addEventHandler(GraggBulirschStoerIntegrator.java:358)
            org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:127) */
        graggBulirschStoerIntegrator.addEventHandler(null, java.lang.Double.NaN, -0.0, 0);
    }
    
    @Test
    public void testAddEventHandler11() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator"));
        HashSet eventsStates = new HashSet();
        EventState eventState = ((EventState) createInstance("org.apache.commons.math3.ode.events.EventState"));
        eventsStates.add(eventState);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.initializeArrays(GraggBulirschStoerIntegrator.java:383)
            org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.addEventHandler(GraggBulirschStoerIntegrator.java:358)
            org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:127) */
        graggBulirschStoerIntegrator.addEventHandler(null, java.lang.Double.NaN, 0.0, 0);
    }
    
    @Test
    public void testAddEventHandler12() throws Exception  {
        AdamsBashforthIntegrator adamsBashforthIntegrator = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator"));
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:138)
            org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:127) */
        adamsBashforthIntegrator.addEventHandler(null, -2.0, 0.0, 0);
    }
    
    @Test
    public void testAddEventHandler13() throws Exception  {
        ThreeEighthesIntegrator threeEighthesIntegrator = ((ThreeEighthesIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator"));
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:138)
            org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:127) */
        threeEighthesIntegrator.addEventHandler(null, -2.0, java.lang.Double.NaN, 0);
    }
    
    @Test
    public void testAddEventHandler14() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator"));
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "maxOrder", 65);
        int[] sequence = new int[32];
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence", sequence);
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.initializeArrays(GraggBulirschStoerIntegrator.java:383)
            org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.addEventHandler(GraggBulirschStoerIntegrator.java:358)
            org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:127) */
        graggBulirschStoerIntegrator.addEventHandler(null, java.lang.Double.NaN, -4.9E-324, 0);
    }
    
    @Test
    public void testAddEventHandler15() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator"));
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "maxOrder", 65);
        int[] sequence = new int[32];
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence", sequence);
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.initializeArrays(GraggBulirschStoerIntegrator.java:383)
            org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.addEventHandler(GraggBulirschStoerIntegrator.java:358)
            org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:127) */
        graggBulirschStoerIntegrator.addEventHandler(null, java.lang.Double.NaN, java.lang.Double.NaN, 0);
    }
    
    @Test
    public void testAddEventHandler16() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator"));
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "maxOrder", 2);
        int[] sequence = {0};
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence", sequence);
        int[] costPerStep = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerStep", costPerStep);
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.initializeArrays(GraggBulirschStoerIntegrator.java:390)
            org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.addEventHandler(GraggBulirschStoerIntegrator.java:358)
            org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:127) */
        graggBulirschStoerIntegrator.addEventHandler(null, java.lang.Double.NaN, -4.9E-324, 0);
    }
    
    @Test
    public void testAddEventHandler17() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator"));
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "maxOrder", 2);
        int[] sequence = {0};
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence", sequence);
        int[] costPerStep = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerStep", costPerStep);
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.initializeArrays(GraggBulirschStoerIntegrator.java:390)
            org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.addEventHandler(GraggBulirschStoerIntegrator.java:358)
            org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:127) */
        graggBulirschStoerIntegrator.addEventHandler(null, java.lang.Double.NaN, 2.2250739911319383E-308, 0);
    }
    
    @Test
    public void testAddEventHandler18() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator"));
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "maxOrder", 2);
        int[] sequence = {0};
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "sequence", sequence);
        int[] costPerStep = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", "costPerStep", costPerStep);
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.initializeArrays(GraggBulirschStoerIntegrator.java:390)
            org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.addEventHandler(GraggBulirschStoerIntegrator.java:358)
            org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler(AbstractIntegrator.java:127) */
        graggBulirschStoerIntegrator.addEventHandler(null, java.lang.Double.NaN, -0.0, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.ode.AbstractIntegrator.getStepHandlers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getStepHandlers()
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#getStepHandlers()}
 * @utbot.invokes {@link java.util.Collections#unmodifiableCollection(java.util.Collection)}
 * @utbot.returnsFrom {@code return Collections.unmodifiableCollection(stepHandlers);}
 *  */
    @Test
    public void testGetStepHandlers_CollectionsUnmodifiableCollection() throws Exception  {
        AdamsMoultonIntegrator adamsMoultonIntegrator = ((AdamsMoultonIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator"));
        ArrayList stepHandlers = new ArrayList();
        setField(adamsMoultonIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "stepHandlers", stepHandlers);
        
        Object actual = adamsMoultonIntegrator.getStepHandlers();
        
        Object expected = createInstance("java.util.Collections$UnmodifiableCollection");
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.ode.AbstractIntegrator.getMaxEvaluations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMaxEvaluations()
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#getMaxEvaluations()}
 * @utbot.invokes {@link org.apache.commons.math3.util.Incrementor#getMaximalCount()}
 * @utbot.returnsFrom {@code return evaluations.getMaximalCount();}
 *  */
    @Test
    public void testGetMaxEvaluations_IncrementorGetMaximalCount() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        evaluations.setMaximalCount(-255);
        setField(dormandPrince853Integrator, "org.apache.commons.math3.ode.AbstractIntegrator", "evaluations", evaluations);
        
        int actual = dormandPrince853Integrator.getMaxEvaluations();
        
        org.junit.Assert.assertEquals(-255, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getMaxEvaluations()
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#getMaxEvaluations()}
 * @utbot.invokes {@link org.apache.commons.math3.util.Incrementor#getMaximalCount()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return evaluations.getMaximalCount();
 *  */
    @Test
    public void testGetMaxEvaluations_ThrowNullPointerException() throws Exception  {
        AdamsBashforthIntegrator adamsBashforthIntegrator = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator"));
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.getMaxEvaluations] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.AbstractIntegrator.getMaxEvaluations(AbstractIntegrator.java:173) */
        adamsBashforthIntegrator.getMaxEvaluations();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.ode.AbstractIntegrator.setEquations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setEquations(org.apache.commons.math3.ode.ExpandableStatefulODE)
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#setEquations(org.apache.commons.math3.ode.ExpandableStatefulODE)}
 *  */
    @Test
    public void testSetEquations() throws Exception  {
        AdamsBashforthIntegrator adamsBashforthIntegrator = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator"));
        
        adamsBashforthIntegrator.setEquations(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.ode.AbstractIntegrator.setMaxEvaluations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setMaxEvaluations(int)
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#setMaxEvaluations(int)}
 * @utbot.executesCondition {@code ((maxEvaluations < 0)): True}
 * @utbot.invokes {@link org.apache.commons.math3.util.Incrementor#setMaximalCount(int)}
 *  */
    @Test
    public void testSetMaxEvaluations_MaxEvaluationsLessThanZero() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(dormandPrince853Integrator, "org.apache.commons.math3.ode.AbstractIntegrator", "evaluations", evaluations);
        
        dormandPrince853Integrator.setMaxEvaluations(-1);
        
        Incrementor dormandPrince853IntegratorEvaluations = ((Incrementor) getFieldValue(dormandPrince853Integrator, "org.apache.commons.math3.ode.AbstractIntegrator", "evaluations"));
        int finalDormandPrince853IntegratorEvaluationsMaximalCount = ((Integer) getFieldValue(dormandPrince853IntegratorEvaluations, "org.apache.commons.math3.util.Incrementor", "maximalCount"));
        
        org.junit.Assert.assertEquals(Integer.MAX_VALUE, finalDormandPrince853IntegratorEvaluationsMaximalCount);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setMaxEvaluations(int)
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#setMaxEvaluations(int)}
 * @utbot.executesCondition {@code ((maxEvaluations < 0)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: evaluations.setMaximalCount((maxEvaluations < 0) ? Integer.MAX_VALUE : maxEvaluations);
 *  */
    @Test
    public void testSetMaxEvaluations_ThrowNullPointerException() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator"));
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.setMaxEvaluations] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.AbstractIntegrator.setMaxEvaluations(AbstractIntegrator.java:168) */
        dormandPrince853Integrator.setMaxEvaluations(0);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#setMaxEvaluations(int)}
 * @utbot.executesCondition {@code ((maxEvaluations < 0)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: evaluations.setMaximalCount((maxEvaluations < 0) ? Integer.MAX_VALUE : maxEvaluations);
 *  */
    @Test
    public void testSetMaxEvaluations_ThrowNullPointerException_1() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator"));
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.setMaxEvaluations] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.AbstractIntegrator.setMaxEvaluations(AbstractIntegrator.java:168) */
        dormandPrince853Integrator.setMaxEvaluations(-1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.ode.AbstractIntegrator.getEvaluations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEvaluations()
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#getEvaluations()}
 * @utbot.invokes {@link org.apache.commons.math3.util.Incrementor#getCount()}
 * @utbot.returnsFrom {@code return evaluations.getCount();}
 *  */
    @Test
    public void testGetEvaluations_IncrementorGetCount() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", -255);
        setField(dormandPrince853Integrator, "org.apache.commons.math3.ode.AbstractIntegrator", "evaluations", evaluations);
        
        int actual = dormandPrince853Integrator.getEvaluations();
        
        org.junit.Assert.assertEquals(-255, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getEvaluations()
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#getEvaluations()}
 * @utbot.invokes {@link org.apache.commons.math3.util.Incrementor#getCount()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return evaluations.getCount();
 *  */
    @Test
    public void testGetEvaluations_ThrowNullPointerException() throws Exception  {
        AdamsBashforthIntegrator adamsBashforthIntegrator = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator"));
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.getEvaluations] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.AbstractIntegrator.getEvaluations(AbstractIntegrator.java:178) */
        adamsBashforthIntegrator.getEvaluations();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.ode.AbstractIntegrator.computeDerivatives
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method computeDerivatives(double, [D, [D)
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#computeDerivatives(double,double[],double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: expandable.computeDerivatives(t, y, yDot);
 *  */
    @Test
    public void testComputeDerivatives_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        evaluations.setMaximalCount(256);
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", 255);
        setField(dormandPrince853Integrator, "org.apache.commons.math3.ode.AbstractIntegrator", "evaluations", evaluations);
        ExpandableStatefulODE expandable = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        Object primary = createInstance("org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode = createInstance("org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper");
        FirstOrderConverter ode1 = ((FirstOrderConverter) createInstance("org.apache.commons.math3.ode.FirstOrderConverter"));
        setField(ode1, "org.apache.commons.math3.ode.FirstOrderConverter", "dimension", -1);
        double[] z = {0.0};
        setField(ode1, "org.apache.commons.math3.ode.FirstOrderConverter", "z", z);
        setField(ode, "org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode1);
        setField(primary, "org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode);
        setField(expandable, "org.apache.commons.math3.ode.ExpandableStatefulODE", "primary", primary);
        EquationsMapper primaryMapper = ((EquationsMapper) createInstance("org.apache.commons.math3.ode.EquationsMapper"));
        setField(expandable, "org.apache.commons.math3.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper);
        double[] primaryState = {};
        expandable.setPrimaryState(primaryState);
        setField(dormandPrince853Integrator, "org.apache.commons.math3.ode.AbstractIntegrator", "expandable", expandable);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.computeDerivatives] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -1 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.ode.FirstOrderConverter.computeDerivatives(FirstOrderConverter.java:103)
            org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:454)
            org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:454)
            org.apache.commons.math3.ode.ExpandableStatefulODE.computeDerivatives(ExpandableStatefulODE.java:119)
            org.apache.commons.math3.ode.AbstractIntegrator.computeDerivatives(AbstractIntegrator.java:269) */
        dormandPrince853Integrator.computeDerivatives(java.lang.Double.NaN, doubleArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#computeDerivatives(double,double[],double[])}
 * @utbot.invokes {@link org.apache.commons.math3.util.Incrementor#incrementCount()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: evaluations.incrementCount();
 *  */
    @Test
    public void testComputeDerivatives_ThrowNullPointerException() throws Exception  {
        AdamsBashforthIntegrator adamsBashforthIntegrator = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator"));
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.computeDerivatives] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.AbstractIntegrator.computeDerivatives(AbstractIntegrator.java:268) */
        adamsBashforthIntegrator.computeDerivatives(java.lang.Double.NaN, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#computeDerivatives(double,double[],double[])}
 * @utbot.invokes {@link org.apache.commons.math3.ode.ExpandableStatefulODE#computeDerivatives(double,double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: expandable.computeDerivatives(t, y, yDot);
 *  */
    @Test
    public void testComputeDerivatives_ThrowNullPointerException_1() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        evaluations.setMaximalCount(256);
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", 255);
        setField(dormandPrince853Integrator, "org.apache.commons.math3.ode.AbstractIntegrator", "evaluations", evaluations);
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.computeDerivatives] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.AbstractIntegrator.computeDerivatives(AbstractIntegrator.java:269) */
        dormandPrince853Integrator.computeDerivatives(java.lang.Double.NaN, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#computeDerivatives(double,double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: expandable.computeDerivatives(t, y, yDot);
 *  */
    @Test
    public void testComputeDerivatives_ThrowNullPointerException_2() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        evaluations.setMaximalCount(256);
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", 255);
        setField(dormandPrince853Integrator, "org.apache.commons.math3.ode.AbstractIntegrator", "evaluations", evaluations);
        ExpandableStatefulODE expandable = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        EquationsMapper primaryMapper = ((EquationsMapper) createInstance("org.apache.commons.math3.ode.EquationsMapper"));
        setField(primaryMapper, "org.apache.commons.math3.ode.EquationsMapper", "firstIndex", -255);
        setField(primaryMapper, "org.apache.commons.math3.ode.EquationsMapper", "dimension", 1);
        setField(expandable, "org.apache.commons.math3.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper);
        double[] primaryState = {0.0};
        expandable.setPrimaryState(primaryState);
        setField(dormandPrince853Integrator, "org.apache.commons.math3.ode.AbstractIntegrator", "expandable", expandable);
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.computeDerivatives] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.ode.EquationsMapper.extractEquationData(EquationsMapper.java:80)
            org.apache.commons.math3.ode.ExpandableStatefulODE.computeDerivatives(ExpandableStatefulODE.java:118)
            org.apache.commons.math3.ode.AbstractIntegrator.computeDerivatives(AbstractIntegrator.java:269) */
        dormandPrince853Integrator.computeDerivatives(java.lang.Double.NaN, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#computeDerivatives(double,double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: expandable.computeDerivatives(t, y, yDot);
 *  */
    @Test
    public void testComputeDerivatives_ThrowNullPointerException_3() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        evaluations.setMaximalCount(256);
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", 255);
        setField(dormandPrince853Integrator, "org.apache.commons.math3.ode.AbstractIntegrator", "evaluations", evaluations);
        ExpandableStatefulODE expandable = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        FirstOrderConverter primary = ((FirstOrderConverter) createInstance("org.apache.commons.math3.ode.FirstOrderConverter"));
        setField(expandable, "org.apache.commons.math3.ode.ExpandableStatefulODE", "primary", primary);
        EquationsMapper primaryMapper = ((EquationsMapper) createInstance("org.apache.commons.math3.ode.EquationsMapper"));
        setField(expandable, "org.apache.commons.math3.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper);
        double[] primaryState = {};
        expandable.setPrimaryState(primaryState);
        setField(dormandPrince853Integrator, "org.apache.commons.math3.ode.AbstractIntegrator", "expandable", expandable);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.computeDerivatives] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.ode.FirstOrderConverter.computeDerivatives(FirstOrderConverter.java:103)
            org.apache.commons.math3.ode.ExpandableStatefulODE.computeDerivatives(ExpandableStatefulODE.java:119)
            org.apache.commons.math3.ode.AbstractIntegrator.computeDerivatives(AbstractIntegrator.java:269) */
        dormandPrince853Integrator.computeDerivatives(java.lang.Double.NaN, doubleArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#computeDerivatives(double,double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: expandable.computeDerivatives(t, y, yDot);
 *  */
    @Test
    public void testComputeDerivatives_ThrowNullPointerException_4() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        evaluations.setMaximalCount(256);
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", 255);
        setField(dormandPrince853Integrator, "org.apache.commons.math3.ode.AbstractIntegrator", "evaluations", evaluations);
        ExpandableStatefulODE expandable = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        FirstOrderConverter primary = ((FirstOrderConverter) createInstance("org.apache.commons.math3.ode.FirstOrderConverter"));
        double[] z = {0.0};
        setField(primary, "org.apache.commons.math3.ode.FirstOrderConverter", "z", z);
        setField(expandable, "org.apache.commons.math3.ode.ExpandableStatefulODE", "primary", primary);
        EquationsMapper primaryMapper = ((EquationsMapper) createInstance("org.apache.commons.math3.ode.EquationsMapper"));
        setField(expandable, "org.apache.commons.math3.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper);
        double[] primaryState = {};
        expandable.setPrimaryState(primaryState);
        setField(dormandPrince853Integrator, "org.apache.commons.math3.ode.AbstractIntegrator", "expandable", expandable);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.computeDerivatives] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.ode.FirstOrderConverter.computeDerivatives(FirstOrderConverter.java:104)
            org.apache.commons.math3.ode.ExpandableStatefulODE.computeDerivatives(ExpandableStatefulODE.java:119)
            org.apache.commons.math3.ode.AbstractIntegrator.computeDerivatives(AbstractIntegrator.java:269) */
        dormandPrince853Integrator.computeDerivatives(java.lang.Double.NaN, doubleArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#computeDerivatives(double,double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: expandable.computeDerivatives(t, y, yDot);
 *  */
    @Test
    public void testComputeDerivatives_ThrowNullPointerException_5() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        evaluations.setMaximalCount(256);
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", 255);
        setField(dormandPrince853Integrator, "org.apache.commons.math3.ode.AbstractIntegrator", "evaluations", evaluations);
        ExpandableStatefulODE expandable = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        Object primary = createInstance("org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper");
        FirstOrderConverter ode = ((FirstOrderConverter) createInstance("org.apache.commons.math3.ode.FirstOrderConverter"));
        setField(primary, "org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode);
        setField(expandable, "org.apache.commons.math3.ode.ExpandableStatefulODE", "primary", primary);
        EquationsMapper primaryMapper = ((EquationsMapper) createInstance("org.apache.commons.math3.ode.EquationsMapper"));
        setField(expandable, "org.apache.commons.math3.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper);
        double[] primaryState = {};
        expandable.setPrimaryState(primaryState);
        setField(dormandPrince853Integrator, "org.apache.commons.math3.ode.AbstractIntegrator", "expandable", expandable);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.computeDerivatives] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.ode.FirstOrderConverter.computeDerivatives(FirstOrderConverter.java:103)
            org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:454)
            org.apache.commons.math3.ode.ExpandableStatefulODE.computeDerivatives(ExpandableStatefulODE.java:119)
            org.apache.commons.math3.ode.AbstractIntegrator.computeDerivatives(AbstractIntegrator.java:269) */
        dormandPrince853Integrator.computeDerivatives(java.lang.Double.NaN, doubleArray, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method computeDerivatives(double, [D, [D)
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#computeDerivatives(double,double[],double[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.TooManyEvaluationsException} in: evaluations.incrementCount();
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testComputeDerivatives_ThrowTooManyEvaluationsException() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        evaluations.setMaximalCount(-254);
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", -254);
        Object maxCountCallback = createInstance("org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback");
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "maxCountCallback", maxCountCallback);
        setField(dormandPrince853Integrator, "org.apache.commons.math3.ode.AbstractIntegrator", "evaluations", evaluations);
        
        dormandPrince853Integrator.computeDerivatives(java.lang.Double.NaN, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#computeDerivatives(double,double[],double[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.TooManyIterationsException} in: evaluations.incrementCount();
 *  */
    @Test(expected = TooManyIterationsException.class)
    public void testComputeDerivatives_ThrowTooManyIterationsException() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        evaluations.setMaximalCount(-254);
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", -254);
        Object maxCountCallback = createInstance("org.apache.commons.math3.optim.BaseOptimizer$MaxIterCallback");
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "maxCountCallback", maxCountCallback);
        setField(dormandPrince853Integrator, "org.apache.commons.math3.ode.AbstractIntegrator", "evaluations", evaluations);
        
        dormandPrince853Integrator.computeDerivatives(java.lang.Double.NaN, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#computeDerivatives(double,double[],double[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MaxCountExceededException} in: evaluations.incrementCount();
 *  */
    @Test(expected = MaxCountExceededException.class)
    public void testComputeDerivatives_ThrowMaxCountExceededException() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        evaluations.setMaximalCount(-254);
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", -254);
        Incrementor.MaxCountExceededCallback maxCountCallback = ((Incrementor.MaxCountExceededCallback) createInstance("org.apache.commons.math3.util.Incrementor$1"));
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "maxCountCallback", maxCountCallback);
        setField(dormandPrince853Integrator, "org.apache.commons.math3.ode.AbstractIntegrator", "evaluations", evaluations);
        
        dormandPrince853Integrator.computeDerivatives(java.lang.Double.NaN, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#computeDerivatives(double,double[],double[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: expandable.computeDerivatives(t, y, yDot);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testComputeDerivatives_ThrowDimensionMismatchException() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        evaluations.setMaximalCount(256);
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", 255);
        setField(dormandPrince853Integrator, "org.apache.commons.math3.ode.AbstractIntegrator", "evaluations", evaluations);
        ExpandableStatefulODE expandable = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        EquationsMapper primaryMapper = ((EquationsMapper) createInstance("org.apache.commons.math3.ode.EquationsMapper"));
        setField(primaryMapper, "org.apache.commons.math3.ode.EquationsMapper", "dimension", -3);
        setField(expandable, "org.apache.commons.math3.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper);
        double[] primaryState = {0.0, 0.0};
        expandable.setPrimaryState(primaryState);
        setField(dormandPrince853Integrator, "org.apache.commons.math3.ode.AbstractIntegrator", "expandable", expandable);
        
        dormandPrince853Integrator.computeDerivatives(java.lang.Double.NaN, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#computeDerivatives(double,double[],double[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.TooManyEvaluationsException} in: expandable.computeDerivatives(t, y, yDot);
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testComputeDerivatives_ThrowTooManyEvaluationsException_1() throws Exception  {
        AdamsMoultonIntegrator adamsMoultonIntegrator = ((AdamsMoultonIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        evaluations.setMaximalCount(256);
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", 255);
        setField(adamsMoultonIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "evaluations", evaluations);
        ExpandableStatefulODE expandable = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        Object primary = createInstance("org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode = createInstance("org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode1 = createInstance("org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode2 = createInstance("org.apache.commons.math3.ode.MultistepIntegrator$CountingDifferentialEquations");
        AdamsMoultonIntegrator this$0 = ((AdamsMoultonIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator"));
        Incrementor evaluations1 = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        evaluations1.setMaximalCount(Integer.MIN_VALUE);
        setField(evaluations1, "org.apache.commons.math3.util.Incrementor", "count", Integer.MAX_VALUE);
        setField(this$0, "org.apache.commons.math3.ode.AbstractIntegrator", "evaluations", evaluations1);
        ExpandableStatefulODE expandable1 = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        Object primary1 = createInstance("org.apache.commons.math3.ode.MultistepIntegrator$CountingDifferentialEquations");
        AdamsMoultonIntegrator this$01 = ((AdamsMoultonIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator"));
        Incrementor evaluations2 = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        Object maxCountCallback = createInstance("org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback");
        setField(evaluations2, "org.apache.commons.math3.util.Incrementor", "maxCountCallback", maxCountCallback);
        setField(this$01, "org.apache.commons.math3.ode.AbstractIntegrator", "evaluations", evaluations2);
        setField(primary1, "org.apache.commons.math3.ode.MultistepIntegrator$CountingDifferentialEquations", "this$0", this$01);
        setField(expandable1, "org.apache.commons.math3.ode.ExpandableStatefulODE", "primary", primary1);
        EquationsMapper primaryMapper = ((EquationsMapper) createInstance("org.apache.commons.math3.ode.EquationsMapper"));
        setField(expandable1, "org.apache.commons.math3.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper);
        double[] primaryState = {};
        expandable1.setPrimaryState(primaryState);
        double[] primaryStateDot = {0.0};
        setField(expandable1, "org.apache.commons.math3.ode.ExpandableStatefulODE", "primaryStateDot", primaryStateDot);
        setField(this$0, "org.apache.commons.math3.ode.AbstractIntegrator", "expandable", expandable1);
        setField(ode2, "org.apache.commons.math3.ode.MultistepIntegrator$CountingDifferentialEquations", "this$0", this$0);
        setField(ode1, "org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode2);
        setField(ode, "org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode1);
        setField(primary, "org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode);
        setField(expandable, "org.apache.commons.math3.ode.ExpandableStatefulODE", "primary", primary);
        setField(expandable, "org.apache.commons.math3.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper);
        expandable.setPrimaryState(primaryState);
        setField(adamsMoultonIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "expandable", expandable);
        double[] doubleArray = {};
        
        adamsMoultonIntegrator.computeDerivatives(java.lang.Double.NaN, doubleArray, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method computeDerivatives(double, [D, [D)
    
    @Test
    public void testComputeDerivatives1() throws Exception  {
        ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator = ((ClassicalRungeKuttaIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", -2);
        setField(classicalRungeKuttaIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "evaluations", evaluations);
        ExpandableStatefulODE expandable = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        Object primary = createInstance("org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode = createInstance("org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode1 = createInstance("org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode2 = createInstance("org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode3 = createInstance("org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode4 = createInstance("org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode5 = createInstance("org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode6 = createInstance("org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode7 = createInstance("org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode8 = createInstance("org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode9 = createInstance("org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper");
        FirstOrderConverter ode10 = ((FirstOrderConverter) createInstance("org.apache.commons.math3.ode.FirstOrderConverter"));
        setField(ode10, "org.apache.commons.math3.ode.FirstOrderConverter", "dimension", 1);
        double[] z = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(ode10, "org.apache.commons.math3.ode.FirstOrderConverter", "z", z);
        setField(ode10, "org.apache.commons.math3.ode.FirstOrderConverter", "zDot", z);
        setField(ode9, "org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode10);
        setField(ode8, "org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode9);
        setField(ode7, "org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode8);
        setField(ode6, "org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode7);
        setField(ode5, "org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode6);
        setField(ode4, "org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode5);
        setField(ode3, "org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode4);
        setField(ode2, "org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode3);
        setField(ode1, "org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode2);
        setField(ode, "org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode1);
        setField(primary, "org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode);
        setField(expandable, "org.apache.commons.math3.ode.ExpandableStatefulODE", "primary", primary);
        EquationsMapper primaryMapper = ((EquationsMapper) createInstance("org.apache.commons.math3.ode.EquationsMapper"));
        setField(primaryMapper, "org.apache.commons.math3.ode.EquationsMapper", "firstIndex", 2147483617);
        setField(primaryMapper, "org.apache.commons.math3.ode.EquationsMapper", "dimension", 32);
        setField(expandable, "org.apache.commons.math3.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper);
        double[] primaryState = new double[32];
        expandable.setPrimaryState(primaryState);
        setField(classicalRungeKuttaIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "expandable", expandable);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.computeDerivatives] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 2147483649 out of bounds for double[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.ode.EquationsMapper.extractEquationData(EquationsMapper.java:80)
            org.apache.commons.math3.ode.ExpandableStatefulODE.computeDerivatives(ExpandableStatefulODE.java:118)
            org.apache.commons.math3.ode.AbstractIntegrator.computeDerivatives(AbstractIntegrator.java:269) */
        classicalRungeKuttaIntegrator.computeDerivatives(java.lang.Double.NaN, doubleArray, null);
    }
    
    @Test
    public void testComputeDerivatives2() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", -72384448);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "evaluations", evaluations);
        ExpandableStatefulODE expandable = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        Object primary = createInstance("org.apache.commons.math3.ode.MultistepIntegrator$CountingDifferentialEquations");
        AdamsBashforthIntegrator this$0 = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator"));
        Incrementor evaluations1 = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(evaluations1, "org.apache.commons.math3.util.Incrementor", "count", -2);
        setField(this$0, "org.apache.commons.math3.ode.AbstractIntegrator", "evaluations", evaluations1);
        ExpandableStatefulODE expandable1 = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        Object primary1 = createInstance("org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode = createInstance("org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode1 = createInstance("org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode2 = createInstance("org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode3 = createInstance("org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper");
        FirstOrderConverter ode4 = ((FirstOrderConverter) createInstance("org.apache.commons.math3.ode.FirstOrderConverter"));
        setField(ode3, "org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode4);
        setField(ode2, "org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode3);
        setField(ode1, "org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode2);
        setField(ode, "org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode1);
        setField(primary1, "org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode);
        setField(expandable1, "org.apache.commons.math3.ode.ExpandableStatefulODE", "primary", primary1);
        EquationsMapper primaryMapper = ((EquationsMapper) createInstance("org.apache.commons.math3.ode.EquationsMapper"));
        setField(primaryMapper, "org.apache.commons.math3.ode.EquationsMapper", "firstIndex", 2147483616);
        setField(primaryMapper, "org.apache.commons.math3.ode.EquationsMapper", "dimension", 33);
        setField(expandable1, "org.apache.commons.math3.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper);
        double[] primaryState = new double[33];
        expandable1.setPrimaryState(primaryState);
        setField(this$0, "org.apache.commons.math3.ode.AbstractIntegrator", "expandable", expandable1);
        setField(primary, "org.apache.commons.math3.ode.MultistepIntegrator$CountingDifferentialEquations", "this$0", this$0);
        setField(expandable, "org.apache.commons.math3.ode.ExpandableStatefulODE", "primary", primary);
        EquationsMapper primaryMapper1 = ((EquationsMapper) createInstance("org.apache.commons.math3.ode.EquationsMapper"));
        setField(primaryMapper1, "org.apache.commons.math3.ode.EquationsMapper", "firstIndex", 1);
        setField(expandable, "org.apache.commons.math3.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper1);
        double[] primaryState1 = {};
        expandable.setPrimaryState(primaryState1);
        setField(graggBulirschStoerIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "expandable", expandable);
        double[] doubleArray = new double[32];
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.computeDerivatives] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 2147483649 out of bounds for double[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.ode.EquationsMapper.extractEquationData(EquationsMapper.java:80)
            org.apache.commons.math3.ode.ExpandableStatefulODE.computeDerivatives(ExpandableStatefulODE.java:118)
            org.apache.commons.math3.ode.AbstractIntegrator.computeDerivatives(AbstractIntegrator.java:269)
            org.apache.commons.math3.ode.MultistepIntegrator$CountingDifferentialEquations.computeDerivatives(MultistepIntegrator.java:430)
            org.apache.commons.math3.ode.ExpandableStatefulODE.computeDerivatives(ExpandableStatefulODE.java:119)
            org.apache.commons.math3.ode.AbstractIntegrator.computeDerivatives(AbstractIntegrator.java:269) */
        graggBulirschStoerIntegrator.computeDerivatives(java.lang.Double.NaN, doubleArray, doubleArray1);
    }
    
    @Test
    public void testComputeDerivatives3() throws Exception  {
        EulerIntegrator eulerIntegrator = ((EulerIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.EulerIntegrator"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", -805240962);
        setField(eulerIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "evaluations", evaluations);
        ExpandableStatefulODE expandable = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        Object primary = createInstance("org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode = createInstance("org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode1 = createInstance("org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode2 = createInstance("org.apache.commons.math3.ode.MultistepIntegrator$CountingDifferentialEquations");
        AdamsMoultonIntegrator this$0 = ((AdamsMoultonIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator"));
        Incrementor evaluations1 = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(evaluations1, "org.apache.commons.math3.util.Incrementor", "count", -2);
        setField(this$0, "org.apache.commons.math3.ode.AbstractIntegrator", "evaluations", evaluations1);
        ExpandableStatefulODE expandable1 = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        Object primary1 = createInstance("org.apache.commons.math3.ode.MultistepIntegrator$CountingDifferentialEquations");
        AdamsMoultonIntegrator this$01 = ((AdamsMoultonIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator"));
        Incrementor evaluations2 = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(evaluations2, "org.apache.commons.math3.util.Incrementor", "count", -2);
        setField(this$01, "org.apache.commons.math3.ode.AbstractIntegrator", "evaluations", evaluations2);
        ExpandableStatefulODE expandable2 = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        Object primary2 = createInstance("org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode3 = createInstance("org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode4 = createInstance("org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode5 = createInstance("org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper");
        setField(ode5, "org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode);
        setField(ode4, "org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode5);
        setField(ode3, "org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode4);
        setField(primary2, "org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode3);
        setField(expandable2, "org.apache.commons.math3.ode.ExpandableStatefulODE", "primary", primary2);
        EquationsMapper primaryMapper = ((EquationsMapper) createInstance("org.apache.commons.math3.ode.EquationsMapper"));
        setField(primaryMapper, "org.apache.commons.math3.ode.EquationsMapper", "firstIndex", 2147483609);
        setField(primaryMapper, "org.apache.commons.math3.ode.EquationsMapper", "dimension", 40);
        setField(expandable2, "org.apache.commons.math3.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper);
        double[] primaryState = new double[40];
        expandable2.setPrimaryState(primaryState);
        setField(this$01, "org.apache.commons.math3.ode.AbstractIntegrator", "expandable", expandable2);
        setField(primary1, "org.apache.commons.math3.ode.MultistepIntegrator$CountingDifferentialEquations", "this$0", this$01);
        setField(expandable1, "org.apache.commons.math3.ode.ExpandableStatefulODE", "primary", primary1);
        EquationsMapper primaryMapper1 = ((EquationsMapper) createInstance("org.apache.commons.math3.ode.EquationsMapper"));
        setField(primaryMapper1, "org.apache.commons.math3.ode.EquationsMapper", "firstIndex", 33);
        setField(expandable1, "org.apache.commons.math3.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper1);
        double[] primaryState1 = {};
        expandable1.setPrimaryState(primaryState1);
        setField(this$0, "org.apache.commons.math3.ode.AbstractIntegrator", "expandable", expandable1);
        setField(ode2, "org.apache.commons.math3.ode.MultistepIntegrator$CountingDifferentialEquations", "this$0", this$0);
        setField(ode1, "org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode2);
        setField(ode, "org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode1);
        setField(primary, "org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode);
        setField(expandable, "org.apache.commons.math3.ode.ExpandableStatefulODE", "primary", primary);
        EquationsMapper primaryMapper2 = ((EquationsMapper) createInstance("org.apache.commons.math3.ode.EquationsMapper"));
        setField(primaryMapper2, "org.apache.commons.math3.ode.EquationsMapper", "firstIndex", 1);
        setField(primaryMapper2, "org.apache.commons.math3.ode.EquationsMapper", "dimension", 34);
        setField(expandable, "org.apache.commons.math3.ode.ExpandableStatefulODE", "primaryMapper", primaryMapper2);
        double[] primaryState2 = new double[34];
        expandable.setPrimaryState(primaryState2);
        setField(expandable, "org.apache.commons.math3.ode.ExpandableStatefulODE", "primaryStateDot", primaryState);
        setField(eulerIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "expandable", expandable);
        double[] doubleArray = new double[38];
        double[] doubleArray1 = {};
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.computeDerivatives] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 2147483649 out of bounds for double[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.ode.EquationsMapper.extractEquationData(EquationsMapper.java:80)
            org.apache.commons.math3.ode.ExpandableStatefulODE.computeDerivatives(ExpandableStatefulODE.java:118)
            org.apache.commons.math3.ode.AbstractIntegrator.computeDerivatives(AbstractIntegrator.java:269)
            org.apache.commons.math3.ode.MultistepIntegrator$CountingDifferentialEquations.computeDerivatives(MultistepIntegrator.java:430)
            org.apache.commons.math3.ode.ExpandableStatefulODE.computeDerivatives(ExpandableStatefulODE.java:119)
            org.apache.commons.math3.ode.AbstractIntegrator.computeDerivatives(AbstractIntegrator.java:269)
            org.apache.commons.math3.ode.MultistepIntegrator$CountingDifferentialEquations.computeDerivatives(MultistepIntegrator.java:430)
            org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:454)
            org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:454)
            org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper.computeDerivatives(JacobianMatrices.java:454)
            org.apache.commons.math3.ode.ExpandableStatefulODE.computeDerivatives(ExpandableStatefulODE.java:119)
            org.apache.commons.math3.ode.AbstractIntegrator.computeDerivatives(AbstractIntegrator.java:269) */
        eulerIntegrator.computeDerivatives(java.lang.Double.NaN, doubleArray, doubleArray1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.ode.AbstractIntegrator.clearEventHandlers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clearEventHandlers()
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#clearEventHandlers()}
 * @utbot.invokes {@link java.util.Collection#clear()}
 *  */
    @Test
    public void testClearEventHandlers_CollectionClear() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator"));
        HashSet eventsStates = new HashSet();
        setField(dormandPrince853Integrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        dormandPrince853Integrator.clearEventHandlers();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clearEventHandlers()
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#clearEventHandlers()}
 * @utbot.invokes {@link java.util.Collection#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: eventsStates.clear();
 *  */
    @Test
    public void testClearEventHandlers_ThrowNullPointerException() throws Exception  {
        AdamsBashforthIntegrator adamsBashforthIntegrator = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator"));
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.clearEventHandlers] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.AbstractIntegrator.clearEventHandlers(AbstractIntegrator.java:153) */
        adamsBashforthIntegrator.clearEventHandlers();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.ode.AbstractIntegrator.integrate
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method integrate(org.apache.commons.math3.ode.FirstOrderDifferentialEquations, double, [D, double, [D)
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#integrate(org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: y.length != equations.getDimension()
 *  */
    @Test
    public void testIntegrate_ThrowNullPointerException_2() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator"));
        FirstOrderConverter firstOrderConverter = ((FirstOrderConverter) createInstance("org.apache.commons.math3.ode.FirstOrderConverter"));
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.AbstractIntegrator.integrate(AbstractIntegrator.java:218) */
        dormandPrince853Integrator.integrate(firstOrderConverter, java.lang.Double.NaN, doubleArray, java.lang.Double.NaN, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#integrate(org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: y0.length != equations.getDimension()
 *  */
    @Test
    public void testIntegrate_ThrowNullPointerException_1() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator"));
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.AbstractIntegrator.integrate(AbstractIntegrator.java:215) */
        dormandPrince853Integrator.integrate(null, java.lang.Double.NaN, doubleArray, java.lang.Double.NaN, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#integrate(org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: y.length != equations.getDimension()
 *  */
    @Test
    public void testIntegrate_ThrowNullPointerException_3() throws Throwable  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator"));
        Object mainStateJacobianWrapper = createInstance("org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper");
        FirstOrderConverter ode = ((FirstOrderConverter) createInstance("org.apache.commons.math3.ode.FirstOrderConverter"));
        setField(mainStateJacobianWrapper, "org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.AbstractIntegrator.integrate(AbstractIntegrator.java:218) */
        Class abstractIntegratorClazz = Class.forName("org.apache.commons.math3.ode.AbstractIntegrator");
        Class mainStateJacobianWrapperType = Class.forName("org.apache.commons.math3.ode.FirstOrderDifferentialEquations");
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
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#integrate(org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: y0.length != equations.getDimension()
 *  */
    @Test
    public void testIntegrate_ThrowNullPointerException() throws Exception  {
        AdamsBashforthIntegrator adamsBashforthIntegrator = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator"));
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.integrate] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.AbstractIntegrator.integrate(AbstractIntegrator.java:215) */
        adamsBashforthIntegrator.integrate(null, java.lang.Double.NaN, null, java.lang.Double.NaN, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method integrate(org.apache.commons.math3.ode.FirstOrderDifferentialEquations, double, [D, double, [D)
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#integrate(org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} when: y.length != equations.getDimension()
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testIntegrate_ThrowDimensionMismatchException_1() throws Exception  {
        AdamsMoultonIntegrator adamsMoultonIntegrator = ((AdamsMoultonIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator"));
        FirstOrderConverter firstOrderConverter = ((FirstOrderConverter) createInstance("org.apache.commons.math3.ode.FirstOrderConverter"));
        setField(firstOrderConverter, "org.apache.commons.math3.ode.FirstOrderConverter", "dimension", 1);
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        adamsMoultonIntegrator.integrate(firstOrderConverter, java.lang.Double.NaN, doubleArray, java.lang.Double.NaN, doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#integrate(org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[])}
 * @utbot.invokes {@link org.apache.commons.math3.ode.ExpandableStatefulODE#setTime(double)}
 * @utbot.invokes {@link org.apache.commons.math3.ode.ExpandableStatefulODE#setPrimaryState(double[])}
 * @utbot.invokes {@link org.apache.commons.math3.ode.AbstractIntegrator#integrate(org.apache.commons.math3.ode.ExpandableStatefulODE,double)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NumberIsTooSmallException} in: integrate(expandableODE, t);
 *  */
    @Test(expected = NumberIsTooSmallException.class)
    public void testIntegrate_ThrowNumberIsTooSmallException() throws Exception  {
        AdamsBashforthIntegrator adamsBashforthIntegrator = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator"));
        FirstOrderConverter firstOrderConverter = ((FirstOrderConverter) createInstance("org.apache.commons.math3.ode.FirstOrderConverter"));
        double[] doubleArray = {};
        double[] doubleArray1 = {};
        
        adamsBashforthIntegrator.integrate(firstOrderConverter, java.lang.Double.NEGATIVE_INFINITY, doubleArray, -2.4464992464071706E-296, doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#integrate(org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} when: y0.length != equations.getDimension()
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testIntegrate_ThrowDimensionMismatchException() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator"));
        FirstOrderConverter firstOrderConverter = ((FirstOrderConverter) createInstance("org.apache.commons.math3.ode.FirstOrderConverter"));
        setField(firstOrderConverter, "org.apache.commons.math3.ode.FirstOrderConverter", "dimension", 2147483646);
        double[] doubleArray = {0.0, 0.0};
        
        dormandPrince853Integrator.integrate(firstOrderConverter, java.lang.Double.NaN, doubleArray, java.lang.Double.NaN, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#integrate(org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} when: y.length != equations.getDimension()
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testIntegrate_ThrowDimensionMismatchException_3() throws Throwable  {
        AdamsMoultonIntegrator adamsMoultonIntegrator = ((AdamsMoultonIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator"));
        Object mainStateJacobianWrapper = createInstance("org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper");
        FirstOrderConverter ode = ((FirstOrderConverter) createInstance("org.apache.commons.math3.ode.FirstOrderConverter"));
        setField(ode, "org.apache.commons.math3.ode.FirstOrderConverter", "dimension", 1);
        setField(mainStateJacobianWrapper, "org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode);
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        Class abstractIntegratorClazz = Class.forName("org.apache.commons.math3.ode.AbstractIntegrator");
        Class mainStateJacobianWrapperType = Class.forName("org.apache.commons.math3.ode.FirstOrderDifferentialEquations");
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
            integrateMethod.invoke(adamsMoultonIntegrator, integrateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#integrate(org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} when: y0.length != equations.getDimension()
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testIntegrate_ThrowDimensionMismatchException_2() throws Throwable  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator"));
        Object mainStateJacobianWrapper = createInstance("org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper");
        Object ode = createInstance("org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper");
        FirstOrderConverter ode1 = ((FirstOrderConverter) createInstance("org.apache.commons.math3.ode.FirstOrderConverter"));
        setField(ode1, "org.apache.commons.math3.ode.FirstOrderConverter", "dimension", 2147483646);
        setField(ode, "org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode1);
        setField(mainStateJacobianWrapper, "org.apache.commons.math3.ode.JacobianMatrices$MainStateJacobianWrapper", "ode", ode);
        double[] doubleArray = {0.0, 0.0};
        
        Class abstractIntegratorClazz = Class.forName("org.apache.commons.math3.ode.AbstractIntegrator");
        Class mainStateJacobianWrapperType = Class.forName("org.apache.commons.math3.ode.FirstOrderDifferentialEquations");
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
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.ode.AbstractIntegrator.initIntegration
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method initIntegration(double, [D, double)
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#initIntegration(double,double[],double)}
 * @utbot.invokes {@link org.apache.commons.math3.util.Incrementor#resetCount()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.invokes {@link org.apache.commons.math3.ode.AbstractIntegrator#setStateInitialized(boolean)}
 *  */
    @Test
    public void testInitIntegration_AbstractIntegratorSetStateInitialized() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator"));
        HashSet stepHandlers = new HashSet();
        setField(dormandPrince853Integrator, "org.apache.commons.math3.ode.AbstractIntegrator", "stepHandlers", stepHandlers);
        ArrayList eventsStates = new ArrayList();
        setField(dormandPrince853Integrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", -255);
        setField(dormandPrince853Integrator, "org.apache.commons.math3.ode.AbstractIntegrator", "evaluations", evaluations);
        
        dormandPrince853Integrator.initIntegration(java.lang.Double.NaN, null, java.lang.Double.NaN);
        
        Incrementor dormandPrince853IntegratorEvaluations = ((Incrementor) getFieldValue(dormandPrince853Integrator, "org.apache.commons.math3.ode.AbstractIntegrator", "evaluations"));
        int finalDormandPrince853IntegratorEvaluationsCount = ((Integer) getFieldValue(dormandPrince853IntegratorEvaluations, "org.apache.commons.math3.util.Incrementor", "count"));
        
        org.junit.Assert.assertEquals(0, finalDormandPrince853IntegratorEvaluationsCount);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method initIntegration(double, [D, double)
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#initIntegration(double,double[],double)}
 * @utbot.invokes {@link org.apache.commons.math3.util.Incrementor#resetCount()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: evaluations.resetCount();
 *  */
    @Test
    public void testInitIntegration_ThrowNullPointerException() throws Exception  {
        AdamsBashforthIntegrator adamsBashforthIntegrator = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator"));
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.initIntegration] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.AbstractIntegrator.initIntegration(AbstractIntegrator.java:188) */
        adamsBashforthIntegrator.initIntegration(java.lang.Double.NaN, null, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#initIntegration(double,double[],double)}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final EventState state: eventsStates)
 *  */
    @Test
    public void testInitIntegration_ThrowNullPointerException_1() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", -255);
        setField(dormandPrince853Integrator, "org.apache.commons.math3.ode.AbstractIntegrator", "evaluations", evaluations);
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.initIntegration] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.AbstractIntegrator.initIntegration(AbstractIntegrator.java:190) */
        dormandPrince853Integrator.initIntegration(java.lang.Double.NaN, null, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#initIntegration(double,double[],double)}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(StepHandler handler: stepHandlers)
 *  */
    @Test
    public void testInitIntegration_ThrowNullPointerException_2() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator"));
        ArrayList eventsStates = new ArrayList();
        setField(dormandPrince853Integrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", -255);
        setField(dormandPrince853Integrator, "org.apache.commons.math3.ode.AbstractIntegrator", "evaluations", evaluations);
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.initIntegration] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.AbstractIntegrator.initIntegration(AbstractIntegrator.java:194) */
        dormandPrince853Integrator.initIntegration(java.lang.Double.NaN, null, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#initIntegration(double,double[],double)}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.iterates iterate the loop {@code for(StepHandler handler: stepHandlers)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: handler.init(t0, y0, t);
 *  */
    @Test
    public void testInitIntegration_ThrowNullPointerException_4() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator"));
        HashSet stepHandlers = new HashSet();
        stepHandlers.add(null);
        setField(dormandPrince853Integrator, "org.apache.commons.math3.ode.AbstractIntegrator", "stepHandlers", stepHandlers);
        ArrayList eventsStates = new ArrayList();
        setField(dormandPrince853Integrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", -255);
        setField(dormandPrince853Integrator, "org.apache.commons.math3.ode.AbstractIntegrator", "evaluations", evaluations);
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.initIntegration] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.AbstractIntegrator.initIntegration(AbstractIntegrator.java:195) */
        dormandPrince853Integrator.initIntegration(java.lang.Double.NaN, null, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#initIntegration(double,double[],double)}
 * @utbot.iterates iterate the loop {@code for(final EventState state: eventsStates)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: state.getEventHandler().init(t0, y0, t);
 *  */
    @Test
    public void testInitIntegration_ThrowNullPointerException_3() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator"));
        ArrayList eventsStates = new ArrayList();
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(dormandPrince853Integrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", -255);
        setField(dormandPrince853Integrator, "org.apache.commons.math3.ode.AbstractIntegrator", "evaluations", evaluations);
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.initIntegration] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.AbstractIntegrator.initIntegration(AbstractIntegrator.java:191) */
        dormandPrince853Integrator.initIntegration(java.lang.Double.NaN, null, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method initIntegration(double, [D, double)
    
    @Test
    public void testInitIntegration1() throws Exception  {
        GillIntegrator gillIntegrator = ((GillIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GillIntegrator"));
        HashSet stepHandlers = new HashSet();
        DummyStepHandler dummyStepHandler = ((DummyStepHandler) createInstance("org.apache.commons.math3.ode.sampling.DummyStepHandler"));
        stepHandlers.add(dummyStepHandler);
        setField(gillIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "stepHandlers", stepHandlers);
        ArrayList eventsStates = new ArrayList();
        setField(gillIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(gillIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "evaluations", evaluations);
        
        gillIntegrator.initIntegration(java.lang.Double.NaN, null, java.lang.Double.NaN);
    }
    
    @Test
    public void testInitIntegration2() throws Exception  {
        GillIntegrator gillIntegrator = ((GillIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GillIntegrator"));
        HashSet stepHandlers = new HashSet();
        ContinuousOutputModel continuousOutputModel = ((ContinuousOutputModel) createInstance("org.apache.commons.math3.ode.ContinuousOutputModel"));
        setField(continuousOutputModel, "org.apache.commons.math3.ode.ContinuousOutputModel", "initialTime", java.lang.Double.NaN);
        setField(continuousOutputModel, "org.apache.commons.math3.ode.ContinuousOutputModel", "finalTime", java.lang.Double.NaN);
        ArrayList steps = new ArrayList();
        setField(continuousOutputModel, "org.apache.commons.math3.ode.ContinuousOutputModel", "steps", steps);
        stepHandlers.add(continuousOutputModel);
        setField(gillIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "stepHandlers", stepHandlers);
        ArrayList eventsStates = new ArrayList();
        setField(gillIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(gillIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "evaluations", evaluations);
        
        gillIntegrator.initIntegration(java.lang.Double.NaN, null, java.lang.Double.NaN);
    }
    
    @Test
    public void testInitIntegration3() throws Exception  {
        GillIntegrator gillIntegrator = ((GillIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GillIntegrator"));
        HashSet stepHandlers = new HashSet();
        Object nordsieckInitializer = createInstance("org.apache.commons.math3.ode.MultistepIntegrator$NordsieckInitializer");
        stepHandlers.add(nordsieckInitializer);
        Object nordsieckInitializer1 = createInstance("org.apache.commons.math3.ode.MultistepIntegrator$NordsieckInitializer");
        stepHandlers.add(nordsieckInitializer1);
        setField(gillIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "stepHandlers", stepHandlers);
        ArrayList eventsStates = new ArrayList();
        setField(gillIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(gillIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "evaluations", evaluations);
        
        gillIntegrator.initIntegration(java.lang.Double.NaN, null, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method initIntegration(double, [D, double)
    
    @Test
    public void testInitIntegration4() throws Exception  {
        GillIntegrator gillIntegrator = ((GillIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GillIntegrator"));
        HashSet eventsStates = new HashSet();
        EventState eventState = ((EventState) createInstance("org.apache.commons.math3.ode.events.EventState"));
        eventsStates.add(eventState);
        setField(gillIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(gillIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "evaluations", evaluations);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.initIntegration] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.AbstractIntegrator.initIntegration(AbstractIntegrator.java:191) */
        gillIntegrator.initIntegration(java.lang.Double.NaN, doubleArray, java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.ode.AbstractIntegrator.acceptStep
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method acceptStep(org.apache.commons.math3.ode.sampling.AbstractStepInterpolator, [D, [D, double)
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#acceptStep(org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double previousT = interpolator.getGlobalPreviousTime();
 *  */
    @Test
    public void testAcceptStep_ThrowNullPointerException() throws Exception  {
        AdamsBashforthIntegrator adamsBashforthIntegrator = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator"));
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.acceptStep] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.AbstractIntegrator.acceptStep(AbstractIntegrator.java:300) */
        adamsBashforthIntegrator.acceptStep(null, null, null, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#acceptStep(org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double)}
 * @utbot.executesCondition {@code (!statesInitialized): True}
 * @utbot.invokes {@link org.apache.commons.math3.ode.sampling.AbstractStepInterpolator#getGlobalPreviousTime()}
 * @utbot.invokes {@link org.apache.commons.math3.ode.sampling.AbstractStepInterpolator#getGlobalCurrentTime()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(EventState state: eventsStates)
 *  */
    @Test
    public void testAcceptStep_ThrowNullPointerException_1() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator"));
        NordsieckStepInterpolator nordsieckStepInterpolator = ((NordsieckStepInterpolator) createInstance("org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator"));
        setField(nordsieckStepInterpolator, "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", "globalPreviousTime", 0.0);
        setField(nordsieckStepInterpolator, "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", "globalCurrentTime", 0.0);
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.acceptStep] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.AbstractIntegrator.acceptStep(AbstractIntegrator.java:305) */
        dormandPrince853Integrator.acceptStep(nordsieckStepInterpolator, null, null, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method acceptStep(org.apache.commons.math3.ode.sampling.AbstractStepInterpolator, [D, [D, double)
    
    @Test
    public void testAcceptStep1() throws Exception  {
        GillIntegrator gillIntegrator = ((GillIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GillIntegrator"));
        HashSet eventsStates = new HashSet();
        setField(gillIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        setField(gillIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "statesInitialized", true);
        NordsieckStepInterpolator nordsieckStepInterpolator = ((NordsieckStepInterpolator) createInstance("org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator"));
        setField(nordsieckStepInterpolator, "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", "globalPreviousTime", 0.0);
        setField(nordsieckStepInterpolator, "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", "globalCurrentTime", 0.0);
        setField(nordsieckStepInterpolator, "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", "forward", true);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.acceptStep] produces [java.lang.NullPointerException]
            java.base/java.util.Arrays.fill(Arrays.java:3357)
            org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator.computeInterpolatedStateAndDerivatives(NordsieckStepInterpolator.java:195)
            org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.evaluateCompleteInterpolatedState(AbstractStepInterpolator.java:410)
            org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.getInterpolatedState(AbstractStepInterpolator.java:417)
            org.apache.commons.math3.ode.AbstractIntegrator.acceptStep(AbstractIntegrator.java:391) */
        gillIntegrator.acceptStep(nordsieckStepInterpolator, doubleArray, doubleArray1, java.lang.Double.NaN);
    }
    
    @Test
    public void testAcceptStep2() throws Throwable  {
        GillIntegrator gillIntegrator = ((GillIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GillIntegrator"));
        ArrayList eventsStates = new ArrayList();
        setField(gillIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        Object graggBulirschStoerStepInterpolator = createInstance("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerStepInterpolator");
        setField(graggBulirschStoerStepInterpolator, "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", "globalPreviousTime", 0.0);
        setField(graggBulirschStoerStepInterpolator, "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", "globalCurrentTime", 0.0);
        setField(graggBulirschStoerStepInterpolator, "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", "forward", true);
        double[] doubleArray = new double[17];
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.acceptStep] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerStepInterpolator.computeInterpolatedStateAndDerivatives(GraggBulirschStoerStepInterpolator.java:319)
            org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.evaluateCompleteInterpolatedState(AbstractStepInterpolator.java:410)
            org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.getInterpolatedState(AbstractStepInterpolator.java:417)
            org.apache.commons.math3.ode.AbstractIntegrator.acceptStep(AbstractIntegrator.java:391) */
        Class abstractIntegratorClazz = Class.forName("org.apache.commons.math3.ode.AbstractIntegrator");
        Class graggBulirschStoerStepInterpolatorType = Class.forName("org.apache.commons.math3.ode.sampling.AbstractStepInterpolator");
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
            acceptStepMethod.invoke(gillIntegrator, acceptStepMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAcceptStep3() throws Throwable  {
        GillIntegrator gillIntegrator = ((GillIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GillIntegrator"));
        HashSet eventsStates = new HashSet();
        setField(gillIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        Object threeEighthesStepInterpolator = createInstance("org.apache.commons.math3.ode.nonstiff.ThreeEighthesStepInterpolator");
        setField(threeEighthesStepInterpolator, "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", "globalPreviousTime", 0.0);
        setField(threeEighthesStepInterpolator, "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", "globalCurrentTime", 0.0);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.acceptStep] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.nonstiff.ThreeEighthesStepInterpolator.computeInterpolatedStateAndDerivatives(ThreeEighthesStepInterpolator.java:129)
            org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.evaluateCompleteInterpolatedState(AbstractStepInterpolator.java:410)
            org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.getInterpolatedState(AbstractStepInterpolator.java:417)
            org.apache.commons.math3.ode.AbstractIntegrator.acceptStep(AbstractIntegrator.java:391) */
        Class abstractIntegratorClazz = Class.forName("org.apache.commons.math3.ode.AbstractIntegrator");
        Class threeEighthesStepInterpolatorType = Class.forName("org.apache.commons.math3.ode.sampling.AbstractStepInterpolator");
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
            acceptStepMethod.invoke(gillIntegrator, acceptStepMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAcceptStep4() throws Throwable  {
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator"));
        HashSet eventsStates = new HashSet();
        EventState eventState = ((EventState) createInstance("org.apache.commons.math3.ode.events.EventState"));
        eventsStates.add(eventState);
        setField(dormandPrince54Integrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        Object threeEighthesStepInterpolator = createInstance("org.apache.commons.math3.ode.nonstiff.ThreeEighthesStepInterpolator");
        setField(threeEighthesStepInterpolator, "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", "globalPreviousTime", 0.0);
        setField(threeEighthesStepInterpolator, "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", "globalCurrentTime", 0.0);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.acceptStep] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.nonstiff.ThreeEighthesStepInterpolator.computeInterpolatedStateAndDerivatives(ThreeEighthesStepInterpolator.java:129)
            org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.evaluateCompleteInterpolatedState(AbstractStepInterpolator.java:410)
            org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.getInterpolatedState(AbstractStepInterpolator.java:417)
            org.apache.commons.math3.ode.events.EventState.reinitializeBegin(EventState.java:159)
            org.apache.commons.math3.ode.AbstractIntegrator.acceptStep(AbstractIntegrator.java:306) */
        Class abstractIntegratorClazz = Class.forName("org.apache.commons.math3.ode.AbstractIntegrator");
        Class threeEighthesStepInterpolatorType = Class.forName("org.apache.commons.math3.ode.sampling.AbstractStepInterpolator");
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
            acceptStepMethod.invoke(dormandPrince54Integrator, acceptStepMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAcceptStep5() throws Throwable  {
        GillIntegrator gillIntegrator = ((GillIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GillIntegrator"));
        HashSet eventsStates = new HashSet();
        eventsStates.add(null);
        setField(gillIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        Object threeEighthesStepInterpolator = createInstance("org.apache.commons.math3.ode.nonstiff.ThreeEighthesStepInterpolator");
        setField(threeEighthesStepInterpolator, "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", "globalPreviousTime", 0.0);
        setField(threeEighthesStepInterpolator, "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", "globalCurrentTime", 0.0);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.acceptStep] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.AbstractIntegrator.acceptStep(AbstractIntegrator.java:306) */
        Class abstractIntegratorClazz = Class.forName("org.apache.commons.math3.ode.AbstractIntegrator");
        Class threeEighthesStepInterpolatorType = Class.forName("org.apache.commons.math3.ode.sampling.AbstractStepInterpolator");
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
            acceptStepMethod.invoke(gillIntegrator, acceptStepMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAcceptStep6() throws Throwable  {
        GillIntegrator gillIntegrator = ((GillIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GillIntegrator"));
        HashSet eventsStates = new HashSet();
        eventsStates.add(null);
        setField(gillIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        setField(gillIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "statesInitialized", true);
        Object graggBulirschStoerStepInterpolator = createInstance("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerStepInterpolator");
        setField(graggBulirschStoerStepInterpolator, "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", "globalPreviousTime", 0.0);
        setField(graggBulirschStoerStepInterpolator, "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", "globalCurrentTime", 0.0);
        setField(graggBulirschStoerStepInterpolator, "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", "forward", true);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.acceptStep] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.AbstractIntegrator.acceptStep(AbstractIntegrator.java:323) */
        Class abstractIntegratorClazz = Class.forName("org.apache.commons.math3.ode.AbstractIntegrator");
        Class graggBulirschStoerStepInterpolatorType = Class.forName("org.apache.commons.math3.ode.sampling.AbstractStepInterpolator");
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
            acceptStepMethod.invoke(gillIntegrator, acceptStepMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAcceptStep7() throws Exception  {
        GillIntegrator gillIntegrator = ((GillIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GillIntegrator"));
        HashSet eventsStates = new HashSet();
        eventsStates.add(null);
        setField(gillIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        setField(gillIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "statesInitialized", true);
        NordsieckStepInterpolator nordsieckStepInterpolator = ((NordsieckStepInterpolator) createInstance("org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator"));
        setField(nordsieckStepInterpolator, "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", "globalPreviousTime", 0.0);
        setField(nordsieckStepInterpolator, "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", "globalCurrentTime", 0.0);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.acceptStep] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.AbstractIntegrator.acceptStep(AbstractIntegrator.java:323) */
        gillIntegrator.acceptStep(nordsieckStepInterpolator, doubleArray, doubleArray1, java.lang.Double.NaN);
    }
    
    @Test
    public void testAcceptStep8() throws Throwable  {
        GillIntegrator gillIntegrator = ((GillIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GillIntegrator"));
        HashSet eventsStates = new HashSet();
        EventState eventState = ((EventState) createInstance("org.apache.commons.math3.ode.events.EventState"));
        eventsStates.add(eventState);
        setField(gillIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        setField(gillIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "statesInitialized", true);
        Object gillStepInterpolator = createInstance("org.apache.commons.math3.ode.nonstiff.GillStepInterpolator");
        setField(gillStepInterpolator, "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", "globalPreviousTime", 0.0);
        setField(gillStepInterpolator, "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", "globalCurrentTime", 0.0);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.acceptStep] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.nonstiff.GillStepInterpolator.computeInterpolatedStateAndDerivatives(GillStepInterpolator.java:135)
            org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.evaluateCompleteInterpolatedState(AbstractStepInterpolator.java:410)
            org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.getInterpolatedState(AbstractStepInterpolator.java:417)
            org.apache.commons.math3.ode.events.EventState.evaluateStep(EventState.java:224)
            org.apache.commons.math3.ode.AbstractIntegrator.acceptStep(AbstractIntegrator.java:323) */
        Class abstractIntegratorClazz = Class.forName("org.apache.commons.math3.ode.AbstractIntegrator");
        Class gillStepInterpolatorType = Class.forName("org.apache.commons.math3.ode.sampling.AbstractStepInterpolator");
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
            acceptStepMethod.invoke(gillIntegrator, acceptStepMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAcceptStep9() throws Throwable  {
        ThreeEighthesIntegrator threeEighthesIntegrator = ((ThreeEighthesIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator"));
        HashSet eventsStates = new HashSet();
        EventState eventState = ((EventState) createInstance("org.apache.commons.math3.ode.events.EventState"));
        eventsStates.add(eventState);
        EventState eventState1 = ((EventState) createInstance("org.apache.commons.math3.ode.events.EventState"));
        eventsStates.add(eventState1);
        setField(threeEighthesIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        setField(threeEighthesIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "statesInitialized", true);
        Object eulerStepInterpolator = createInstance("org.apache.commons.math3.ode.nonstiff.EulerStepInterpolator");
        setField(eulerStepInterpolator, "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", "globalPreviousTime", 0.0);
        setField(eulerStepInterpolator, "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", "globalCurrentTime", 0.0);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.acceptStep] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.nonstiff.EulerStepInterpolator.computeInterpolatedStateAndDerivatives(EulerStepInterpolator.java:92)
            org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.evaluateCompleteInterpolatedState(AbstractStepInterpolator.java:410)
            org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.getInterpolatedState(AbstractStepInterpolator.java:417)
            org.apache.commons.math3.ode.events.EventState.evaluateStep(EventState.java:224)
            org.apache.commons.math3.ode.AbstractIntegrator.acceptStep(AbstractIntegrator.java:323) */
        Class abstractIntegratorClazz = Class.forName("org.apache.commons.math3.ode.AbstractIntegrator");
        Class eulerStepInterpolatorType = Class.forName("org.apache.commons.math3.ode.sampling.AbstractStepInterpolator");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method acceptStepMethod = abstractIntegratorClazz.getDeclaredMethod("acceptStep", eulerStepInterpolatorType, doubleArrayType, doubleArrayType, doubleType);
        acceptStepMethod.setAccessible(true);
        java.lang.Object[] acceptStepMethodArguments = new java.lang.Object[4];
        acceptStepMethodArguments[0] = eulerStepInterpolator;
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
    public void testAcceptStep10() throws Exception  {
        GillIntegrator gillIntegrator = ((GillIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GillIntegrator"));
        ArrayList eventsStates = new ArrayList();
        EventState eventState = ((EventState) createInstance("org.apache.commons.math3.ode.events.EventState"));
        setField(eventState, "org.apache.commons.math3.ode.events.EventState", "t0", 0.0);
        eventsStates.add(eventState);
        eventsStates.add(null);
        eventsStates.add(null);
        setField(gillIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        NordsieckStepInterpolator nordsieckStepInterpolator = ((NordsieckStepInterpolator) createInstance("org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator"));
        double[] stateVariation = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(nordsieckStepInterpolator, "org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator", "stateVariation", stateVariation);
        setField(nordsieckStepInterpolator, "org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator", "scalingH", java.lang.Double.NaN);
        setField(nordsieckStepInterpolator, "org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator", "referenceTime", java.lang.Double.NaN);
        setField(nordsieckStepInterpolator, "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", "h", 2.225073858507202E-308);
        nordsieckStepInterpolator.setInterpolatedTime(0.0);
        setField(nordsieckStepInterpolator, "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", "globalPreviousTime", 0.0);
        setField(nordsieckStepInterpolator, "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", "globalCurrentTime", 0.0);
        nordsieckStepInterpolator.setSoftPreviousTime(0.0);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.acceptStep] produces [java.lang.NullPointerException]
            java.base/java.util.Arrays.fill(Arrays.java:3357)
            org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator.computeInterpolatedStateAndDerivatives(NordsieckStepInterpolator.java:196)
            org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.evaluateCompleteInterpolatedState(AbstractStepInterpolator.java:410)
            org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.getInterpolatedState(AbstractStepInterpolator.java:417)
            org.apache.commons.math3.ode.events.EventState.reinitializeBegin(EventState.java:159)
            org.apache.commons.math3.ode.AbstractIntegrator.acceptStep(AbstractIntegrator.java:306) */
        gillIntegrator.acceptStep(nordsieckStepInterpolator, doubleArray, doubleArray, java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.ode.AbstractIntegrator.getEventHandlers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEventHandlers()
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#getEventHandlers()}
 * @utbot.returnsFrom {@code return Collections.unmodifiableCollection(list);}
 *  */
    @Test
    public void testGetEventHandlers_ReturnCollectionsUnmodifiableCollection() throws Exception  {
        AdamsBashforthIntegrator adamsBashforthIntegrator = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator"));
        ArrayList eventsStates = new ArrayList();
        setField(adamsBashforthIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        Object actual = adamsBashforthIntegrator.getEventHandlers();
        
        Object expected = createInstance("java.util.Collections$UnmodifiableCollection");
        
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#getEventHandlers()}
 * @utbot.iterates iterate the loop {@code for(EventState state: eventsStates)} once
 * @utbot.returnsFrom {@code return Collections.unmodifiableCollection(list);}
 *  */
    @Test
    public void testGetEventHandlers_ListAdd() throws Exception  {
        AdamsMoultonIntegrator adamsMoultonIntegrator = ((AdamsMoultonIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator"));
        ArrayList eventsStates = new ArrayList();
        EventState eventState = ((EventState) createInstance("org.apache.commons.math3.ode.events.EventState"));
        eventsStates.add(eventState);
        setField(adamsMoultonIntegrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        Object actual = adamsMoultonIntegrator.getEventHandlers();
        
        Object expected = createInstance("java.util.Collections$UnmodifiableCollection");
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getEventHandlers()
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#getEventHandlers()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(EventState state: eventsStates)
 *  */
    @Test
    public void testGetEventHandlers_ThrowNullPointerException() throws Exception  {
        AdamsBashforthIntegrator adamsBashforthIntegrator = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator"));
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.getEventHandlers] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.AbstractIntegrator.getEventHandlers(AbstractIntegrator.java:145) */
        adamsBashforthIntegrator.getEventHandlers();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#getEventHandlers()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.iterates iterate the loop {@code for(EventState state: eventsStates)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: list.add(state.getEventHandler());
 *  */
    @Test
    public void testGetEventHandlers_ThrowNullPointerException_1() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator"));
        HashSet eventsStates = new HashSet();
        eventsStates.add(null);
        setField(dormandPrince853Integrator, "org.apache.commons.math3.ode.AbstractIntegrator", "eventsStates", eventsStates);
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.getEventHandlers] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.AbstractIntegrator.getEventHandlers(AbstractIntegrator.java:146) */
        dormandPrince853Integrator.getEventHandlers();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.ode.AbstractIntegrator.sanityChecks
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method sanityChecks(org.apache.commons.math3.ode.ExpandableStatefulODE, double)
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#sanityChecks(org.apache.commons.math3.ode.ExpandableStatefulODE,double)}
 * @utbot.invokes {@link org.apache.commons.math3.ode.ExpandableStatefulODE#getTime()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double threshold = 1000 * FastMath.ulp(FastMath.max(FastMath.abs(equations.getTime()), FastMath.abs(t)));
 *  */
    @Test
    public void testSanityChecks_ThrowNullPointerException() throws Exception  {
        AdamsBashforthIntegrator adamsBashforthIntegrator = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator"));
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.sanityChecks] produces [java.lang.NullPointerException]
            org.apache.commons.math3.ode.AbstractIntegrator.sanityChecks(AbstractIntegrator.java:417) */
        adamsBashforthIntegrator.sanityChecks(null, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method sanityChecks(org.apache.commons.math3.ode.ExpandableStatefulODE, double)
    
    /**
    @utbot.classUnderTest {@link AbstractIntegrator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.ode.AbstractIntegrator#sanityChecks(org.apache.commons.math3.ode.ExpandableStatefulODE,double)}
 * @utbot.executesCondition {@code (dt <= threshold): True}
 * @utbot.invokes {@link org.apache.commons.math3.ode.ExpandableStatefulODE#getTime()}
 * @utbot.invokes {@link org.apache.commons.math3.util.FastMath#abs(double)}
 * @utbot.invokes {@link org.apache.commons.math3.util.FastMath#abs(double)}
 * @utbot.invokes {@link org.apache.commons.math3.util.FastMath#max(double,double)}
 * @utbot.invokes {@link org.apache.commons.math3.util.FastMath#ulp(double)}
 * @utbot.invokes {@link org.apache.commons.math3.ode.ExpandableStatefulODE#getTime()}
 * @utbot.invokes {@link org.apache.commons.math3.util.FastMath#abs(double)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NumberIsTooSmallException} in: dt
 *  */
    @Test(expected = NumberIsTooSmallException.class)
    public void testSanityChecks_ThrowNumberIsTooSmallException() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(-9.39453918754206E-294);
        
        dormandPrince853Integrator.sanityChecks(expandableStatefulODE, java.lang.Double.POSITIVE_INFINITY);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method sanityChecks(org.apache.commons.math3.ode.ExpandableStatefulODE, double)
    
    @Test
    public void testSanityChecks1() throws Exception  {
        ThreeEighthesIntegrator threeEighthesIntegrator = ((ThreeEighthesIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(2.2250738585072014E-308);
        
        threeEighthesIntegrator.sanityChecks(expandableStatefulODE, -3.78576699573368E-270);
    }
    
    @Test
    public void testSanityChecks2() throws Exception  {
        EulerIntegrator eulerIntegrator = ((EulerIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.EulerIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(java.lang.Double.POSITIVE_INFINITY);
        
        eulerIntegrator.sanityChecks(expandableStatefulODE, java.lang.Double.POSITIVE_INFINITY);
    }
    
    @Test
    public void testSanityChecks3() throws Exception  {
        ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator = ((ClassicalRungeKuttaIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(java.lang.Double.NaN);
        
        classicalRungeKuttaIntegrator.sanityChecks(expandableStatefulODE, -0.0);
    }
    
    @Test
    public void testSanityChecks4() throws Exception  {
        GillIntegrator gillIntegrator = ((GillIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GillIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(java.lang.Double.NEGATIVE_INFINITY);
        
        gillIntegrator.sanityChecks(expandableStatefulODE, java.lang.Double.NaN);
    }
    
    @Test
    public void testSanityChecks5() throws Exception  {
        ThreeEighthesIntegrator threeEighthesIntegrator = ((ThreeEighthesIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(-8.454031231205645E-309);
        
        threeEighthesIntegrator.sanityChecks(expandableStatefulODE, 8.454031231205645E-309);
    }
    
    @Test
    public void testSanityChecks6() throws Exception  {
        ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator = ((ClassicalRungeKuttaIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(-2.0522723150405163E-289);
        
        classicalRungeKuttaIntegrator.sanityChecks(expandableStatefulODE, 4.104544630081033E-289);
    }
    
    @Test
    public void testSanityChecks7() throws Exception  {
        MidpointIntegrator midpointIntegrator = ((MidpointIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.MidpointIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(-4.2506895026791614E77);
        
        midpointIntegrator.sanityChecks(expandableStatefulODE, -0.0);
    }
    
    @Test
    public void testSanityChecks8() throws Exception  {
        ThreeEighthesIntegrator threeEighthesIntegrator = ((ThreeEighthesIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(-2.2250738585072014E-308);
        
        threeEighthesIntegrator.sanityChecks(expandableStatefulODE, -2.0000000000000004);
    }
    
    @Test
    public void testSanityChecks9() throws Exception  {
        GillIntegrator gillIntegrator = ((GillIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GillIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(java.lang.Double.NEGATIVE_INFINITY);
        
        gillIntegrator.sanityChecks(expandableStatefulODE, java.lang.Double.NEGATIVE_INFINITY);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method sanityChecks(org.apache.commons.math3.ode.ExpandableStatefulODE, double)
    
    @Test
    public void testSanityChecks10() throws Exception  {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator = ((GraggBulirschStoerIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(4.393472597453579E158);
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.sanityChecks] produces [java.lang.NullPointerException] */
        graggBulirschStoerIntegrator.sanityChecks(expandableStatefulODE, -1.6812182738118153E-285);
    }
    
    @Test
    public void testSanityChecks11() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(1.4916681462400417E-154);
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.sanityChecks] produces [java.lang.NullPointerException] */
        dormandPrince853Integrator.sanityChecks(expandableStatefulODE, -1.4916681462400417E-154);
    }
    
    @Test
    public void testSanityChecks12() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.sanityChecks] produces [java.lang.NullPointerException] */
        dormandPrince853Integrator.sanityChecks(expandableStatefulODE, -8.989659334899987E307);
    }
    
    @Test
    public void testSanityChecks13() throws Exception  {
        AdamsMoultonIntegrator adamsMoultonIntegrator = ((AdamsMoultonIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(-2.1841702676406E-310);
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.sanityChecks] produces [java.lang.NullPointerException] */
        adamsMoultonIntegrator.sanityChecks(expandableStatefulODE, 2.1729236899484E-311);
    }
    
    @Test
    public void testSanityChecks14() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(java.lang.Double.NEGATIVE_INFINITY);
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.sanityChecks] produces [java.lang.NullPointerException] */
        dormandPrince853Integrator.sanityChecks(expandableStatefulODE, java.lang.Double.NEGATIVE_INFINITY);
    }
    
    @Test
    public void testSanityChecks15() throws Exception  {
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(0.0);
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.sanityChecks] produces [java.lang.NullPointerException] */
        dormandPrince54Integrator.sanityChecks(expandableStatefulODE, java.lang.Double.NaN);
    }
    
    @Test
    public void testSanityChecks16() throws Exception  {
        HighamHall54Integrator highamHall54Integrator = ((HighamHall54Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(0.0);
        
        /* This test fails because method [org.apache.commons.math3.ode.AbstractIntegrator.sanityChecks] produces [java.lang.NullPointerException] */
        highamHall54Integrator.sanityChecks(expandableStatefulODE, -2.1729236899484E-311);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method sanityChecks(org.apache.commons.math3.ode.ExpandableStatefulODE, double)
    
    @Test(expected = NumberIsTooSmallException.class)
    public void testSanityChecks17() throws Exception  {
        DormandPrince853Integrator dormandPrince853Integrator = ((DormandPrince853Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(java.lang.Double.NEGATIVE_INFINITY);
        
        dormandPrince853Integrator.sanityChecks(expandableStatefulODE, java.lang.Double.POSITIVE_INFINITY);
    }
    
    @Test(expected = NumberIsTooSmallException.class)
    public void testSanityChecks18() throws Exception  {
        MidpointIntegrator midpointIntegrator = ((MidpointIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.MidpointIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(-4.9E-324);
        
        midpointIntegrator.sanityChecks(expandableStatefulODE, -0.0);
    }
    
    @Test(expected = NumberIsTooSmallException.class)
    public void testSanityChecks19() throws Exception  {
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(0.21851484625572384);
        
        dormandPrince54Integrator.sanityChecks(expandableStatefulODE, 0.21851484625572384);
    }
    
    @Test(expected = NumberIsTooSmallException.class)
    public void testSanityChecks20() throws Exception  {
        AdamsBashforthIntegrator adamsBashforthIntegrator = ((AdamsBashforthIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(4.9E-324);
        
        adamsBashforthIntegrator.sanityChecks(expandableStatefulODE, 0.0);
    }
    
    @Test(expected = NumberIsTooSmallException.class)
    public void testSanityChecks21() throws Exception  {
        ThreeEighthesIntegrator threeEighthesIntegrator = ((ThreeEighthesIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(2.781342323134002E-309);
        
        threeEighthesIntegrator.sanityChecks(expandableStatefulODE, java.lang.Double.NEGATIVE_INFINITY);
    }
    
    @Test(expected = NumberIsTooSmallException.class)
    public void testSanityChecks22() throws Exception  {
        GillIntegrator gillIntegrator = ((GillIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GillIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(0.0);
        
        gillIntegrator.sanityChecks(expandableStatefulODE, -0.0);
    }
    
    @Test(expected = NumberIsTooSmallException.class)
    public void testSanityChecks23() throws Exception  {
        HighamHall54Integrator highamHall54Integrator = ((HighamHall54Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(0.0);
        
        highamHall54Integrator.sanityChecks(expandableStatefulODE, -4.9E-324);
    }
    
    @Test(expected = NumberIsTooSmallException.class)
    public void testSanityChecks24() throws Exception  {
        EulerIntegrator eulerIntegrator = ((EulerIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.EulerIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(0.0);
        
        eulerIntegrator.sanityChecks(expandableStatefulODE, java.lang.Double.NEGATIVE_INFINITY);
    }
    
    @Test(expected = NumberIsTooSmallException.class)
    public void testSanityChecks25() throws Exception  {
        ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator = ((ClassicalRungeKuttaIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(-1.2578740903581507);
        
        classicalRungeKuttaIntegrator.sanityChecks(expandableStatefulODE, -1.2578740903581507);
    }
    
    @Test(expected = NumberIsTooSmallException.class)
    public void testSanityChecks26() throws Exception  {
        DormandPrince54Integrator dormandPrince54Integrator = ((DormandPrince54Integrator) createInstance("org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(java.lang.Double.NEGATIVE_INFINITY);
        
        dormandPrince54Integrator.sanityChecks(expandableStatefulODE, -4.1145930515952665E303);
    }
    
    @Test(expected = NumberIsTooSmallException.class)
    public void testSanityChecks27() throws Exception  {
        GillIntegrator gillIntegrator = ((GillIntegrator) createInstance("org.apache.commons.math3.ode.nonstiff.GillIntegrator"));
        ExpandableStatefulODE expandableStatefulODE = ((ExpandableStatefulODE) createInstance("org.apache.commons.math3.ode.ExpandableStatefulODE"));
        expandableStatefulODE.setTime(-1.0);
        
        gillIntegrator.sanityChecks(expandableStatefulODE, java.lang.Double.NEGATIVE_INFINITY);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields716415330229200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields716415330229200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass716415330239900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields716415330229200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass716415330239900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields716415331093100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields716415331093100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass716415331097100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields716415331093100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass716415331097100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

