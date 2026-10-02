package org.apache.commons.math.ode;

import static org.junit.Assert.*;

import java.util.Collection;

import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math.analysis.solvers.UnivariateRealSolver;
import org.apache.commons.math.exception.DimensionMismatchException;
import org.apache.commons.math.exception.MaxCountExceededException;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import org.apache.commons.math.ode.events.EventHandler;
import org.apache.commons.math.ode.sampling.StepHandler;
import org.junit.Test;

/**
 * Unit tests for {@link AbstractIntegrator}.
 *
 * หมายเหตุ: ไม่ได้ทดสอบ acceptStep() โดยตรง เพราะต้องพึ่งพา
 * AbstractStepInterpolator / EventState ซึ่ง source ไม่ได้ให้มา
 * การสร้าง stub ที่แม่นยำจะเป็นการเดา behavior ที่ไม่มีในซอร์สที่ให้มา
 */
public class AbstractIntegratorTest {

    /** Concrete subclass สำหรับทดสอบ (เติมเฉพาะ abstract method ที่จำเป็น) */
    private static class DummyIntegrator extends AbstractIntegrator {

        boolean integrateCalled = false;

        DummyIntegrator(String name) {
            super(name);
        }

        DummyIntegrator() {
            super();
        }

        @Override
        public void integrate(ExpandableStatefulODE equations, double t) {
            integrateCalled = true;
            // จำลองการ integrate แบบ "ทันที" โดยไม่เปลี่ยน state ใด ๆ
            equations.setTime(t);
        }
    }

    /** ODE จำลอง มิติปรับได้ สำหรับทดสอบ dimension-mismatch branches */
    private static class SimpleODE implements FirstOrderDifferentialEquations {
        private final int dimension;

        SimpleODE(int dimension) {
            this.dimension = dimension;
        }

        public int getDimension() {
            return dimension;
        }

        public void computeDerivatives(double t, double[] y, double[] yDot) {
            for (int i = 0; i < yDot.length; i++) {
                yDot[i] = 1.0;
            }
        }
    }

    // =================================================================
    // Constructor / getName()
    // =================================================================

    @Test
    public void testConstructorWithName() {
        DummyIntegrator integ = new DummyIntegrator("my-method");
        assertEquals("my-method", integ.getName());
    }

    @Test
    public void testProtectedNoArgConstructorGivesNullName() {
        DummyIntegrator integ = new DummyIntegrator();
        assertNull(integ.getName());
    }

    @Test
    public void testExplicitNullNameArgument() {
        DummyIntegrator integ = new DummyIntegrator(null);
        assertNull(integ.getName());
    }

    // =================================================================
    // Step handlers (add / get / clear) - ไม่มี branch ภายใน แต่ทดสอบ
    // bookkeeping ให้ครบและทดสอบ unmodifiable-collection เป็น fault-detector
    // =================================================================

    @Test
    public void testAddGetClearStepHandlers() {
        DummyIntegrator integ = new DummyIntegrator("n");
        assertTrue(integ.getStepHandlers().isEmpty());

        // ใช้ null เป็น handler: addStepHandler/getStepHandlers/clearStepHandlers
        // เป็นแค่ list bookkeeping ไม่มีการเรียก method ของ handler ภายใน
        // AbstractIntegrator เอง จึงไม่จำเป็นต้องเดา signature ของ StepHandler
        integ.addStepHandler(null);
        integ.addStepHandler(null);

        Collection<StepHandler> handlers = integ.getStepHandlers();
        assertEquals(2, handlers.size());

        integ.clearStepHandlers();
        assertTrue(integ.getStepHandlers().isEmpty());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetStepHandlersReturnsUnmodifiableCollection() {
        DummyIntegrator integ = new DummyIntegrator("n");
        integ.getStepHandlers().add(null);
    }

    // =================================================================
    // Event handlers (add 4-arg / 5-arg overload, get, clear)
    // =================================================================

    @Test
    public void testAddEventHandlerFourArgOverloadAndGetEventHandlers() {
        DummyIntegrator integ = new DummyIntegrator("n");
        assertTrue(integ.getEventHandlers().isEmpty());

        // handler = null: addEventHandler เพียงสร้าง EventState แล้วเก็บ
        // reference, getEventHandlers() คืนค่า reference เดิมกลับมา
        // (ไม่มีการเรียก method ของ EventHandler โดยตรงใน path นี้)
        integ.addEventHandler(null, 10.0, 1.0e-10, 100);

        Collection<EventHandler> handlers = integ.getEventHandlers();
        assertEquals(1, handlers.size());
        assertNull(handlers.iterator().next());
    }

    @Test
    public void testAddEventHandlerFiveArgOverloadWithExplicitSolver() {
        DummyIntegrator integ = new DummyIntegrator("n");
        UnivariateRealSolver solver = new BracketingNthOrderBrentSolver(1.0e-10, 5);

        integ.addEventHandler(null, 10.0, 1.0e-10, 100, solver);

        assertEquals(1, integ.getEventHandlers().size());
    }

    @Test
    public void testClearEventHandlers() {
        DummyIntegrator integ = new DummyIntegrator("n");
        integ.addEventHandler(null, 10.0, 1.0e-10, 100);
        assertEquals(1, integ.getEventHandlers().size());

        integ.clearEventHandlers();
        assertTrue(integ.getEventHandlers().isEmpty());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetEventHandlersReturnsUnmodifiableCollection() {
        DummyIntegrator integ = new DummyIntegrator("n");
        integ.getEventHandlers().add(null);
    }

    // =================================================================
    // stepStart / stepSize accessors (ค่าเริ่มต้น)
    // =================================================================

    @Test
    public void testInitialStepStartAndStepSizeAreNaN() {
        DummyIntegrator integ = new DummyIntegrator("n");
        assertTrue(Double.isNaN(integ.getCurrentStepStart()));
        assertTrue(Double.isNaN(integ.getCurrentSignedStepsize()));
    }

    // =================================================================
    // setMaxEvaluations / getMaxEvaluations
    // (if maxEvaluations < 0) -> ทั้งสองสาขา + boundary
    // =================================================================

    @Test
    public void testSetMaxEvaluationsNegativeMapsToIntegerMax() {
        DummyIntegrator integ = new DummyIntegrator("n");
        integ.setMaxEvaluations(-5);
        assertEquals(Integer.MAX_VALUE, integ.getMaxEvaluations());
    }

    @Test
    public void testSetMaxEvaluationsMinValueMapsToIntegerMax() {
        DummyIntegrator integ = new DummyIntegrator("n");
        integ.setMaxEvaluations(Integer.MIN_VALUE);
        assertEquals(Integer.MAX_VALUE, integ.getMaxEvaluations());
    }

    @Test
    public void testSetMaxEvaluationsZeroBoundary() {
        DummyIntegrator integ = new DummyIntegrator("n");
        integ.setMaxEvaluations(0);
        assertEquals(0, integ.getMaxEvaluations());
    }

    @Test
    public void testSetMaxEvaluationsPositive() {
        DummyIntegrator integ = new DummyIntegrator("n");
        integ.setMaxEvaluations(42);
        assertEquals(42, integ.getMaxEvaluations());
    }

    @Test
    public void testDefaultMaxEvaluationsFromConstructor() {
        // constructor เรียก setMaxEvaluations(-1) ภายใน
        DummyIntegrator integ = new DummyIntegrator("n");
        assertEquals(Integer.MAX_VALUE, integ.getMaxEvaluations());
    }

    // =================================================================
    // evaluations counter / resetEvaluations / computeDerivatives
    // =================================================================

    @Test
    public void testEvaluationsStartAtZero() {
        DummyIntegrator integ = new DummyIntegrator("n");
        assertEquals(0, integ.getEvaluations());
    }

    @Test
    public void testComputeDerivativesIncrementsEvaluationCount() {
        DummyIntegrator integ = new DummyIntegrator("n");
        SimpleODE ode = new SimpleODE(2);
        ExpandableStatefulODE expandable = new ExpandableStatefulODE(ode);
        expandable.setTime(0.0);
        expandable.setPrimaryState(new double[] {1.0, 2.0});
        integ.setEquations(expandable);

        double[] y = {1.0, 2.0};
        double[] yDot = new double[2];

        integ.computeDerivatives(0.0, y, yDot);
        assertEquals(1, integ.getEvaluations());

        integ.computeDerivatives(0.0, y, yDot);
        assertEquals(2, integ.getEvaluations());
    }

    @Test
    public void testResetEvaluationsSetsCountBackToZero() {
        DummyIntegrator integ = new DummyIntegrator("n");
        SimpleODE ode = new SimpleODE(1);
        ExpandableStatefulODE expandable = new ExpandableStatefulODE(ode);
        expandable.setTime(0.0);
        expandable.setPrimaryState(new double[] {1.0});
        integ.setEquations(expandable);

        integ.computeDerivatives(0.0, new double[] {1.0}, new double[1]);
        assertEquals(1, integ.getEvaluations());

        integ.resetEvaluations();
        assertEquals(0, integ.getEvaluations());
    }

    @Test(expected = MaxCountExceededException.class)
    public void testComputeDerivativesThrowsWhenMaxEvaluationsExceeded() {
        DummyIntegrator integ = new DummyIntegrator("n");
        integ.setMaxEvaluations(1);

        SimpleODE ode = new SimpleODE(1);
        ExpandableStatefulODE expandable = new ExpandableStatefulODE(ode);
        expandable.setTime(0.0);
        expandable.setPrimaryState(new double[] {1.0});
        integ.setEquations(expandable);

        double[] y = {1.0};
        double[] yDot = new double[1];

        integ.computeDerivatives(0.0, y, yDot); // count=1, max=1 -> OK
        integ.computeDerivatives(0.0, y, yDot); // count=2 > max=1 -> throw
    }

    // =================================================================
    // integrate(FirstOrderDifferentialEquations, t0, y0, t, y) facade
    // -- ครอบคลุมทั้ง 2 if (y0 mismatch, y mismatch) + success path
    // =================================================================

    @Test(expected = DimensionMismatchException.class)
    public void testIntegrateThrowsOnY0DimensionMismatch() {
        DummyIntegrator integ = new DummyIntegrator("n");
        SimpleODE ode = new SimpleODE(2);
        double[] y0 = {1.0}; // ผิดมิติ (ควรเป็น 2)
        double[] y = new double[2];
        integ.integrate(ode, 0.0, y0, 1.0, y);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testIntegrateThrowsOnYDimensionMismatch() {
        DummyIntegrator integ = new DummyIntegrator("n");
        SimpleODE ode = new SimpleODE(2);
        double[] y0 = {1.0, 2.0};
        double[] y = new double[1]; // ผิดมิติ (ควรเป็น 2)
        integ.integrate(ode, 0.0, y0, 1.0, y);
    }

    @Test
    public void testIntegrateSuccessDelegatesAndExtractsResult() {
        DummyIntegrator integ = new DummyIntegrator("n");
        SimpleODE ode = new SimpleODE(2);
        double[] y0 = {1.0, 2.0};
        double[] y = new double[2];

        double finalTime = integ.integrate(ode, 0.0, y0, 5.0, y);

        assertTrue(integ.integrateCalled);
        assertEquals(5.0, finalTime, 1.0e-15);
        // DummyIntegrator ไม่เปลี่ยน primary state ดังนั้น y ควรเท่ากับ y0 เดิม
        assertArrayEquals(y0, y, 1.0e-15);
    }

    // =================================================================
    // sanityChecks - if (dt <= threshold) throw / else ไม่ throw
    // =================================================================

    @Test(expected = NumberIsTooSmallException.class)
    public void testSanityChecksThrowsWhenIntervalTooSmall() {
        DummyIntegrator integ = new DummyIntegrator("n");
        SimpleODE ode = new SimpleODE(1);
        ExpandableStatefulODE expandable = new ExpandableStatefulODE(ode);
        expandable.setTime(0.0);
        expandable.setPrimaryState(new double[] {1.0});

        // t == equations.getTime() -> dt = 0 <= threshold -> ต้อง throw
        integ.sanityChecks(expandable, 0.0);
    }

    @Test
    public void testSanityChecksDoesNotThrowWhenIntervalIsLargeEnough() {
        DummyIntegrator integ = new DummyIntegrator("n");
        SimpleODE ode = new SimpleODE(1);
        ExpandableStatefulODE expandable = new ExpandableStatefulODE(ode);
        expandable.setTime(0.0);
        expandable.setPrimaryState(new double[] {1.0});

        // span ใหญ่พอ -> ไม่ throw
        integ.sanityChecks(expandable, 10.0);
    }

    // =================================================================
    // setStateInitialized - เป็น simple setter เท่านั้น
    // ผลของมันสังเกตได้เฉพาะภายใน acceptStep() ซึ่งไม่ได้ทดสอบ (ดูหมายเหตุบนไฟล์)
    // =================================================================

    @Test
    public void testSetStateInitializedIsCallableWithBothValues() {
        DummyIntegrator integ = new DummyIntegrator("n");
        integ.setStateInitialized(true);
        integ.setStateInitialized(false);
        // ไม่มี public side-effect ที่ตรวจสอบได้โดยไม่ผ่าน acceptStep()
    }
}
