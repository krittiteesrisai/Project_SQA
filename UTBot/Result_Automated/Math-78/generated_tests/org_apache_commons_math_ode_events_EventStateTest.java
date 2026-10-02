package org.apache.commons.math.ode.events;

import org.junit.Test;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public final class org_apache_commons_math_ode_events_EventStateTest {
    ///region Test suites for executable org.apache.commons.math.ode.events.EventState.stop
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method stop()
    
    /**
    @utbot.classUnderTest {@link EventState}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.events.EventState#stop()}
 * @utbot.returnsFrom {@code return nextAction == EventHandler.STOP;}
 *  */
    @Test
    public void testStop_NextActionNotEqualsEventHandlerSTOP() throws Exception  {
        EventState eventState = ((EventState) createInstance("org.apache.commons.math.ode.events.EventState"));
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "nextAction", -255);
        
        boolean actual = eventState.stop();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link EventState}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.events.EventState#stop()}
 * @utbot.returnsFrom {@code return nextAction == EventHandler.STOP;}
 *  */
    @Test
    public void testStop_NextActionEqualsEventHandlerSTOP() throws Exception  {
        EventState eventState = ((EventState) createInstance("org.apache.commons.math.ode.events.EventState"));
        
        boolean actual = eventState.stop();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.events.EventState.reset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reset(double, [D)
    
    /**
    @utbot.classUnderTest {@link EventState}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.events.EventState#reset(double,double[])}
 * @utbot.executesCondition {@code (!pendingEvent): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testReset_NotPendingEvent() throws Exception  {
        EventState eventState = ((EventState) createInstance("org.apache.commons.math.ode.events.EventState"));
        
        boolean actual = eventState.reset(java.lang.Double.NaN, null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link EventState}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.events.EventState#reset(double,double[])}
 * @utbot.executesCondition {@code (!pendingEvent): False}
 * @utbot.executesCondition {@code (nextAction == EventHandler.RESET_STATE): False}
 * @utbot.returnsFrom {@code return (nextAction == EventHandler.RESET_STATE) || (nextAction == EventHandler.RESET_DERIVATIVES);}
 *  */
    @Test
    public void testReset_NextActionNotEqualsEventHandlerRESET_STATEOrNextActionNotEqualsEventHandlerRESET_DERIVATIVES() throws Exception  {
        EventState eventState = ((EventState) createInstance("org.apache.commons.math.ode.events.EventState"));
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "pendingEvent", true);
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "pendingEventTime", 0.0);
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "nextAction", -255);
        
        boolean actual = eventState.reset(java.lang.Double.NaN, null);
        
        assertFalse(actual);
        
        boolean finalEventStatePendingEvent = ((Boolean) getFieldValue(eventState, "org.apache.commons.math.ode.events.EventState", "pendingEvent"));
        double finalEventStatePendingEventTime = ((Double) getFieldValue(eventState, "org.apache.commons.math.ode.events.EventState", "pendingEventTime"));
        
        assertFalse(finalEventStatePendingEvent);
        
        assertEquals(java.lang.Double.NaN, finalEventStatePendingEventTime, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link EventState}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.events.EventState#reset(double,double[])}
 * @utbot.executesCondition {@code (!pendingEvent): False}
 * @utbot.executesCondition {@code (nextAction == EventHandler.RESET_STATE): False}
 * @utbot.returnsFrom {@code return (nextAction == EventHandler.RESET_STATE) || (nextAction == EventHandler.RESET_DERIVATIVES);}
 *  */
    @Test
    public void testReset_NextActionEqualsEventHandlerRESET_STATEOrNextActionEqualsEventHandlerRESET_DERIVATIVES() throws Exception  {
        EventState eventState = ((EventState) createInstance("org.apache.commons.math.ode.events.EventState"));
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "pendingEvent", true);
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "pendingEventTime", 0.0);
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "nextAction", 2);
        
        boolean actual = eventState.reset(java.lang.Double.NaN, null);
        
        assertTrue(actual);
        
        boolean finalEventStatePendingEvent = ((Boolean) getFieldValue(eventState, "org.apache.commons.math.ode.events.EventState", "pendingEvent"));
        double finalEventStatePendingEventTime = ((Double) getFieldValue(eventState, "org.apache.commons.math.ode.events.EventState", "pendingEventTime"));
        
        assertFalse(finalEventStatePendingEvent);
        
        assertEquals(java.lang.Double.NaN, finalEventStatePendingEventTime, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link EventState}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.events.EventState#reset(double,double[])}
 * @utbot.executesCondition {@code (!pendingEvent): False}
 * @utbot.executesCondition {@code (nextAction == EventHandler.RESET_STATE): True}
 * @utbot.invokes {@link org.apache.commons.math.ode.events.EventHandler#resetState(double,double[])}
 * @utbot.returnsFrom {@code return (nextAction == EventHandler.RESET_STATE) || (nextAction == EventHandler.RESET_DERIVATIVES);}
 *  */
    @Test
    public void testReset_NextActionEqualsEventHandlerRESET_STATEOrNextActionEqualsEventHandlerRESET_DERIVATIVES_1() throws Exception  {
        EventState eventState = ((EventState) createInstance("org.apache.commons.math.ode.events.EventState"));
        Object handler = createInstance("org.apache.commons.math.ode.AbstractIntegrator$EndTimeChecker");
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "handler", handler);
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "pendingEvent", true);
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "pendingEventTime", 0.0);
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "nextAction", 1);
        
        boolean actual = eventState.reset(java.lang.Double.NaN, null);
        
        assertTrue(actual);
        
        boolean finalEventStatePendingEvent = ((Boolean) getFieldValue(eventState, "org.apache.commons.math.ode.events.EventState", "pendingEvent"));
        double finalEventStatePendingEventTime = ((Double) getFieldValue(eventState, "org.apache.commons.math.ode.events.EventState", "pendingEventTime"));
        
        assertFalse(finalEventStatePendingEvent);
        
        assertEquals(java.lang.Double.NaN, finalEventStatePendingEventTime, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reset(double, [D)
    
    /**
    @utbot.classUnderTest {@link EventState}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.events.EventState#reset(double,double[])}
 * @utbot.executesCondition {@code (!pendingEvent): False}
 * @utbot.executesCondition {@code (nextAction == EventHandler.RESET_STATE): True}
 * @utbot.invokes {@link org.apache.commons.math.ode.events.EventHandler#resetState(double,double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: handler.resetState(t, y);
 *  */
    @Test
    public void testReset_ThrowNullPointerException() throws Exception  {
        EventState eventState = ((EventState) createInstance("org.apache.commons.math.ode.events.EventState"));
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "pendingEvent", true);
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "nextAction", 1);
        
        /* This test fails because method [org.apache.commons.math.ode.events.EventState.reset] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.events.EventState.reset(EventState.java:324) */
        eventState.reset(java.lang.Double.NaN, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.events.EventState.getMaxCheckInterval
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMaxCheckInterval()
    
    /**
    @utbot.classUnderTest {@link EventState}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.events.EventState#getMaxCheckInterval()}
 * @utbot.returnsFrom {@code return maxCheckInterval;}
 *  */
    @Test
    public void testGetMaxCheckInterval_ReturnMaxCheckInterval() throws Exception  {
        EventState eventState = ((EventState) createInstance("org.apache.commons.math.ode.events.EventState"));
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "maxCheckInterval", 0.0);
        
        double actual = eventState.getMaxCheckInterval();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.events.EventState.getMaxIterationCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMaxIterationCount()
    
    /**
    @utbot.classUnderTest {@link EventState}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.events.EventState#getMaxIterationCount()}
 * @utbot.returnsFrom {@code return maxIterationCount;}
 *  */
    @Test
    public void testGetMaxIterationCount_ReturnMaxIterationCount() throws Exception  {
        EventState eventState = ((EventState) createInstance("org.apache.commons.math.ode.events.EventState"));
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "maxIterationCount", -255);
        
        int actual = eventState.getMaxIterationCount();
        
        org.junit.Assert.assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.events.EventState.stepAccepted
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method stepAccepted(double, [D)
    
    /**
    @utbot.classUnderTest {@link EventState}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.events.EventState#stepAccepted(double,double[])}
 * @utbot.executesCondition {@code (pendingEvent): False}
 * @utbot.executesCondition {@code (g0Positive = g0 >= 0;): True}
 *  */
    @Test
    public void testStepAccepted_NotPendingEvent() throws Exception  {
        EventState eventState = ((EventState) createInstance("org.apache.commons.math.ode.events.EventState"));
        Object handler = createInstance("org.apache.commons.math.ode.AbstractIntegrator$EndTimeChecker");
        setField(handler, "org.apache.commons.math.ode.AbstractIntegrator$EndTimeChecker", "endTime", 3.9999999999973848);
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "handler", handler);
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "t0", 0.0);
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "g0", 0.0);
        
        eventState.stepAccepted(4.000000000116756, null);
        
        double finalEventStateT0 = ((Double) getFieldValue(eventState, "org.apache.commons.math.ode.events.EventState", "t0"));
        double finalEventStateG0 = ((Double) getFieldValue(eventState, "org.apache.commons.math.ode.events.EventState", "g0"));
        boolean finalEventStateG0Positive = ((Boolean) getFieldValue(eventState, "org.apache.commons.math.ode.events.EventState", "g0Positive"));
        int finalEventStateNextAction = ((Integer) getFieldValue(eventState, "org.apache.commons.math.ode.events.EventState", "nextAction"));
        
        assertEquals(4.000000000116756, finalEventStateT0, 1.0E-6);
        
        assertEquals(1.1937162369690668E-10, finalEventStateG0, 1.0E-6);
        
        assertTrue(finalEventStateG0Positive);
        
        org.junit.Assert.assertEquals(3, finalEventStateNextAction);
    }
    
    /**
    @utbot.classUnderTest {@link EventState}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.events.EventState#stepAccepted(double,double[])}
 * @utbot.executesCondition {@code (pendingEvent): False}
 * @utbot.executesCondition {@code (g0Positive = g0 >= 0;): False}
 *  */
    @Test
    public void testStepAccepted_NotPendingEvent_1() throws Exception  {
        EventState eventState = ((EventState) createInstance("org.apache.commons.math.ode.events.EventState"));
        Object handler = createInstance("org.apache.commons.math.ode.AbstractIntegrator$EndTimeChecker");
        setField(handler, "org.apache.commons.math.ode.AbstractIntegrator$EndTimeChecker", "endTime", 7.529296934604879);
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "handler", handler);
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "t0", 0.0);
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "g0", 0.0);
        
        eventState.stepAccepted(-7.524902284145121, null);
        
        double finalEventStateT0 = ((Double) getFieldValue(eventState, "org.apache.commons.math.ode.events.EventState", "t0"));
        double finalEventStateG0 = ((Double) getFieldValue(eventState, "org.apache.commons.math.ode.events.EventState", "g0"));
        int finalEventStateNextAction = ((Integer) getFieldValue(eventState, "org.apache.commons.math.ode.events.EventState", "nextAction"));
        
        assertEquals(-7.524902284145121, finalEventStateT0, 1.0E-6);
        
        assertEquals(-15.05419921875, finalEventStateG0, 1.0E-6);
        
        org.junit.Assert.assertEquals(3, finalEventStateNextAction);
    }
    
    /**
    @utbot.classUnderTest {@link EventState}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.events.EventState#stepAccepted(double,double[])}
 * @utbot.executesCondition {@code (pendingEvent): True}
 * @utbot.executesCondition {@code (nextAction = handler.eventOccurred(t, y, !(increasing ^ forward));): True}
 *  */
    @Test
    public void testStepAccepted_PendingEvent() throws Exception  {
        EventState eventState = ((EventState) createInstance("org.apache.commons.math.ode.events.EventState"));
        Object handler = createInstance("org.apache.commons.math.ode.AbstractIntegrator$EndTimeChecker");
        setField(handler, "org.apache.commons.math.ode.AbstractIntegrator$EndTimeChecker", "endTime", 0.0);
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "handler", handler);
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "t0", 0.0);
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "g0", 0.0);
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "pendingEvent", true);
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "previousEventTime", 0.0);
        
        eventState.stepAccepted(java.lang.Double.NaN, null);
        
        double finalEventStateT0 = ((Double) getFieldValue(eventState, "org.apache.commons.math.ode.events.EventState", "t0"));
        double finalEventStateG0 = ((Double) getFieldValue(eventState, "org.apache.commons.math.ode.events.EventState", "g0"));
        double finalEventStatePreviousEventTime = ((Double) getFieldValue(eventState, "org.apache.commons.math.ode.events.EventState", "previousEventTime"));
        
        assertEquals(java.lang.Double.NaN, finalEventStateT0, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalEventStateG0, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalEventStatePreviousEventTime, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link EventState}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.events.EventState#stepAccepted(double,double[])}
 * @utbot.executesCondition {@code (pendingEvent): True}
 * @utbot.executesCondition {@code (nextAction = handler.eventOccurred(t, y, !(increasing ^ forward));): False}
 *  */
    @Test
    public void testStepAccepted_PendingEvent_1() throws Exception  {
        EventState eventState = ((EventState) createInstance("org.apache.commons.math.ode.events.EventState"));
        Object handler = createInstance("org.apache.commons.math.ode.AbstractIntegrator$EndTimeChecker");
        setField(handler, "org.apache.commons.math.ode.AbstractIntegrator$EndTimeChecker", "endTime", 0.0);
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "handler", handler);
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "t0", 0.0);
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "g0", 0.0);
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "pendingEvent", true);
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "previousEventTime", 0.0);
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "increasing", true);
        
        eventState.stepAccepted(java.lang.Double.NaN, null);
        
        double finalEventStateT0 = ((Double) getFieldValue(eventState, "org.apache.commons.math.ode.events.EventState", "t0"));
        double finalEventStateG0 = ((Double) getFieldValue(eventState, "org.apache.commons.math.ode.events.EventState", "g0"));
        boolean finalEventStateG0Positive = ((Boolean) getFieldValue(eventState, "org.apache.commons.math.ode.events.EventState", "g0Positive"));
        double finalEventStatePreviousEventTime = ((Double) getFieldValue(eventState, "org.apache.commons.math.ode.events.EventState", "previousEventTime"));
        
        assertEquals(java.lang.Double.NaN, finalEventStateT0, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalEventStateG0, 1.0E-6);
        
        assertTrue(finalEventStateG0Positive);
        
        assertEquals(java.lang.Double.NaN, finalEventStatePreviousEventTime, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method stepAccepted(double, [D)
    
    /**
    @utbot.classUnderTest {@link EventState}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.events.EventState#stepAccepted(double,double[])}
 * @utbot.invokes {@link org.apache.commons.math.ode.events.EventHandler#g(double,double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: g0 = handler.g(t, y);
 *  */
    @Test
    public void testStepAccepted_ThrowNullPointerException() throws Exception  {
        EventState eventState = ((EventState) createInstance("org.apache.commons.math.ode.events.EventState"));
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "t0", 0.0);
        
        /* This test fails because method [org.apache.commons.math.ode.events.EventState.stepAccepted] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.events.EventState.stepAccepted(EventState.java:286) */
        eventState.stepAccepted(java.lang.Double.NaN, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.events.EventState.reinitializeBegin
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reinitializeBegin(double, [D)
    
    /**
    @utbot.classUnderTest {@link EventState}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.events.EventState#reinitializeBegin(double,double[])}
 * @utbot.executesCondition {@code (g0Positive = g0 >= 0;): True}
 *  */
    @Test
    public void testReinitializeBegin() throws Exception  {
        EventState eventState = ((EventState) createInstance("org.apache.commons.math.ode.events.EventState"));
        Object handler = createInstance("org.apache.commons.math.ode.AbstractIntegrator$EndTimeChecker");
        setField(handler, "org.apache.commons.math.ode.AbstractIntegrator$EndTimeChecker", "endTime", 4.2758856668326935E-306);
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "handler", handler);
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "t0", 0.0);
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "g0", 0.0);
        
        eventState.reinitializeBegin(4.2758856668326935E-306, null);
        
        double finalEventStateT0 = ((Double) getFieldValue(eventState, "org.apache.commons.math.ode.events.EventState", "t0"));
        boolean finalEventStateG0Positive = ((Boolean) getFieldValue(eventState, "org.apache.commons.math.ode.events.EventState", "g0Positive"));
        
        assertEquals(4.2758856668326935E-306, finalEventStateT0, 1.0E-6);
        
        assertTrue(finalEventStateG0Positive);
    }
    
    /**
    @utbot.classUnderTest {@link EventState}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.events.EventState#reinitializeBegin(double,double[])}
 * @utbot.executesCondition {@code (g0Positive = g0 >= 0;): False}
 *  */
    @Test
    public void testReinitializeBegin_1() throws Exception  {
        EventState eventState = ((EventState) createInstance("org.apache.commons.math.ode.events.EventState"));
        Object handler = createInstance("org.apache.commons.math.ode.AbstractIntegrator$EndTimeChecker");
        setField(handler, "org.apache.commons.math.ode.AbstractIntegrator$EndTimeChecker", "endTime", 4.593354756132874E9);
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "handler", handler);
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "t0", 0.0);
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "g0", 0.0);
        
        eventState.reinitializeBegin(0.880859375, null);
        
        double finalEventStateT0 = ((Double) getFieldValue(eventState, "org.apache.commons.math.ode.events.EventState", "t0"));
        double finalEventStateG0 = ((Double) getFieldValue(eventState, "org.apache.commons.math.ode.events.EventState", "g0"));
        
        assertEquals(0.880859375, finalEventStateT0, 1.0E-6);
        
        assertEquals(-4.593354755252014E9, finalEventStateG0, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reinitializeBegin(double, [D)
    
    /**
    @utbot.classUnderTest {@link EventState}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.events.EventState#reinitializeBegin(double,double[])}
 * @utbot.invokes {@link org.apache.commons.math.ode.events.EventHandler#g(double,double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: g0 = handler.g(tStart, yStart);
 *  */
    @Test
    public void testReinitializeBegin_ThrowNullPointerException() throws Exception  {
        EventState eventState = ((EventState) createInstance("org.apache.commons.math.ode.events.EventState"));
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "t0", 0.0);
        
        /* This test fails because method [org.apache.commons.math.ode.events.EventState.reinitializeBegin] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.events.EventState.reinitializeBegin(EventState.java:152) */
        eventState.reinitializeBegin(java.lang.Double.NaN, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.events.EventState.getEventTime
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEventTime()
    
    /**
    @utbot.classUnderTest {@link EventState}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.events.EventState#getEventTime()}
 * @utbot.returnsFrom {@code return pendingEventTime;}
 *  */
    @Test
    public void testGetEventTime_ReturnPendingEventTime() throws Exception  {
        EventState eventState = ((EventState) createInstance("org.apache.commons.math.ode.events.EventState"));
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "pendingEventTime", 0.0);
        
        double actual = eventState.getEventTime();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.events.EventState.evaluateStep
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method evaluateStep(org.apache.commons.math.ode.sampling.StepInterpolator)
    
    /**
    @utbot.classUnderTest {@link EventState}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.events.EventState#evaluateStep(org.apache.commons.math.ode.sampling.StepInterpolator)}
 * @utbot.invokes {@link org.apache.commons.math.ode.sampling.StepInterpolator#isForward()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: forward = interpolator.isForward();
 *  */
    @Test
    public void testEvaluateStep_ThrowNullPointerException() throws Exception  {
        EventState eventState = ((EventState) createInstance("org.apache.commons.math.ode.events.EventState"));
        
        /* This test fails because method [org.apache.commons.math.ode.events.EventState.evaluateStep] produces [java.lang.NullPointerException]
            org.apache.commons.math.ode.events.EventState.evaluateStep(EventState.java:172) */
        eventState.evaluateStep(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.events.EventState.getEventHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEventHandler()
    
    /**
    @utbot.classUnderTest {@link EventState}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.events.EventState#getEventHandler()}
 * @utbot.returnsFrom {@code return handler;}
 *  */
    @Test
    public void testGetEventHandler_ReturnHandler() throws Exception  {
        EventState eventState = ((EventState) createInstance("org.apache.commons.math.ode.events.EventState"));
        Object handler = createInstance("org.apache.commons.math.ode.AbstractIntegrator$EndTimeChecker");
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "handler", handler);
        
        Object actual = eventState.getEventHandler();
        
        double handlerEndTime = ((Double) getFieldValue(handler, "org.apache.commons.math.ode.AbstractIntegrator$EndTimeChecker", "endTime"));
        double actualEndTime = ((Double) getFieldValue(actual, "org.apache.commons.math.ode.AbstractIntegrator$EndTimeChecker", "endTime"));
        assertEquals(handlerEndTime, actualEndTime, 1.0E-6);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.ode.events.EventState.getConvergence
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getConvergence()
    
    /**
    @utbot.classUnderTest {@link EventState}
 * @utbot.methodUnderTest {@link org.apache.commons.math.ode.events.EventState#getConvergence()}
 * @utbot.returnsFrom {@code return convergence;}
 *  */
    @Test
    public void testGetConvergence_ReturnConvergence() throws Exception  {
        EventState eventState = ((EventState) createInstance("org.apache.commons.math.ode.events.EventState"));
        setField(eventState, "org.apache.commons.math.ode.events.EventState", "convergence", 0.0);
        
        double actual = eventState.getConvergence();
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields740824821903400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields740824821903400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass740824821914700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields740824821903400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass740824821914700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields740824822943800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields740824822943800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass740824822948900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields740824822943800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass740824822948900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

