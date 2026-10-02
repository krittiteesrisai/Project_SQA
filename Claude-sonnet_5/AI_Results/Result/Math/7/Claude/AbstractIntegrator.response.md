# การวิเคราะห์และสร้าง Unit Test สำหรับ `AbstractIntegrator`

เนื่องจาก `AbstractIntegrator` เป็น abstract class จึงต้องสร้าง **concrete subclass** สำหรับทดสอบ (`ConcreteIntegrator`) ที่ implement `integrate(ExpandableStatefulODE, double)` และเพิ่ม wrapper method เพื่อเปิดให้เทสเรียก protected method ได้โดยตรง

**ข้อจำกัดที่ต้องระวัง (ตามข้อ 4):** เมธอด `acceptStep(...)` ใช้ `AbstractStepInterpolator` ซึ่งเป็น abstract class ที่ไม่ได้ให้ source มาด้วย (abstract method `computeInterpolatedStateAndDerivatives` และ constructor ไม่ทราบ signature ที่แน่ชัด) การสร้าง fake/stub ของคลาสนี้จะเป็นการ "เดา behavior" ที่ไม่มีอยู่ในซอร์สที่ให้มา จึง **ไม่ทดสอบ `acceptStep` โดยตรง** (คอมเมนต์กำกับไว้ในโค้ด)

```java
package org.apache.commons.math3.ode;

import static org.junit.Assert.*;

import java.util.Collection;

import org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.NoBracketingException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.sampling.StepHandler;
import org.apache.commons.math3.ode.sampling.StepInterpolator;
import org.junit.Test;

/**
 * JUnit4 test suite for {@link AbstractIntegrator}.
 *
 * หมายเหตุ: เมธอด acceptStep(...) ไม่ได้ถูกทดสอบโดยตรง เนื่องจากต้องใช้
 * AbstractStepInterpolator ซึ่งเป็น abstract class ที่ constructor/abstract
 * method ไม่ปรากฎใน source ที่ให้มา การสร้าง test double จึงเสี่ยงต่อการ
 * "เดา behavior" ที่ไม่มีหลักฐานในโค้ดต้นฉบับ (ตามข้อกำหนดข้อ 4)
 */
public class AbstractIntegratorTest {

    // ---------------------------------------------------------------
    // Test doubles
    // ---------------------------------------------------------------

    /** Concrete subclass to allow instantiation and to expose protected methods. */
    private static class ConcreteIntegrator extends AbstractIntegrator {

        ConcreteIntegrator(String name) {
            super(name);
        }

        ConcreteIntegrator() {
            super();
        }

        @Override
        public void integrate(ExpandableStatefulODE equations, double t)
            throws NumberIsTooSmallException, DimensionMismatchException,
                   MaxCountExceededException, NoBracketingException {
            sanityChecks(equations, t);
            setEquations(equations);
            initIntegration(equations.getTime(), equations.getPrimaryState(), t);
            double[] y = equations.getCompleteState();
            double[] yDot = new double[y.length];
            computeDerivatives(equations.getTime(), y, yDot);
            equations.setTime(t);
            equations.setCompleteState(y);
        }

        // --- wrappers to expose protected members for direct unit testing ---
        void callSanityChecks(ExpandableStatefulODE eq, double t) {
            sanityChecks(eq, t);
        }

        void callSetEquations(ExpandableStatefulODE eq) {
            setEquations(eq);
        }

        void callInitIntegration(double t0, double[] y0, double t) {
            initIntegration(t0, y0, t);
        }

        void callComputeDerivatives(double t, double[] y, double[] yDot) {
            computeDerivatives(t, y, yDot);
        }

        void callSetStateInitialized(boolean b) {
            setStateInitialized(b);
        }
    }

    /** Simple ODE with configurable dimension. */
    private static class SimpleEquations implements FirstOrderDifferentialEquations {
        private final int dim;

        SimpleEquations(int dim) {
            this.dim = dim;
        }

        public int getDimension() {
            return dim;
        }

        public void computeDerivatives(double t, double[] y, double[] yDot) {
            for (int i = 0; i < dim; i++) {
                yDot[i] = y[i];
            }
        }
    }

    /** Counting stub for EventHandler. */
    private static class CountingEventHandler implements EventHandler {
        int initCalls = 0;
        double lastT0;
        double lastT;
        double[] lastY0;

        public void init(double t0, double[] y0, double t) {
            initCalls++;
            lastT0 = t0;
            lastY0 = y0;
            lastT = t;
        }

        public double g(double t, double[] y) {
            return 0;
        }

        public Action eventOccurred(double t, double[] y, boolean increasing) {
            return Action.CONTINUE;
        }

        public void resetState(double t, double[] y) {
            // not used
        }
    }

    /** Counting stub for StepHandler. */
    private static class CountingStepHandler implements StepHandler {
        int initCalls = 0;

        public void init(double t0, double[] y0, double t) {
            initCalls++;
        }

        public void handleStep(StepInterpolator interpolator, boolean isLast)
            throws MaxCountExceededException {
            // not used in these tests - requires AbstractStepInterpolator (see class comment)
        }
    }

    // ---------------------------------------------------------------
    // Constructor / getName()
    // ---------------------------------------------------------------

    @Test
    public void testConstructorWithName() {
        ConcreteIntegrator integrator = new ConcreteIntegrator("MyIntegrator");
        assertEquals("MyIntegrator", integrator.getName());
    }

    @Test
    public void testConstructorWithEmptyName() {
        ConcreteIntegrator integrator = new ConcreteIntegrator("");
        assertEquals("", integrator.getName());
    }

    @Test
    public void testConstructorWithNullName() {
        ConcreteIntegrator integrator = new ConcreteIntegrator();
        assertNull(integrator.getName());
    }

    // ---------------------------------------------------------------
    // Step handlers
    // ---------------------------------------------------------------

    @Test
    public void testAddAndGetStepHandlers() {
        ConcreteIntegrator integrator = new ConcreteIntegrator("int");
        CountingStepHandler h = new CountingStepHandler();
        integrator.addStepHandler(h);
        Collection<StepHandler> handlers = integrator.getStepHandlers();
        assertEquals(1, handlers.size());
        assertTrue(handlers.contains(h));
    }

    @Test
    public void testClearStepHandlers() {
        ConcreteIntegrator integrator = new ConcreteIntegrator("int");
        integrator.addStepHandler(new CountingStepHandler());
        integrator.clearStepHandlers();
        assertEquals(0, integrator.getStepHandlers().size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetStepHandlersIsUnmodifiable() {
        ConcreteIntegrator integrator = new ConcreteIntegrator("int");
        Collection<StepHandler> handlers = integrator.getStepHandlers();
        handlers.add(new CountingStepHandler());
    }

    // ---------------------------------------------------------------
    // Event handlers
    // ---------------------------------------------------------------

    @Test
    public void testAddEventHandlerDefaultSolver() {
        ConcreteIntegrator integrator = new ConcreteIntegrator("int");
        CountingEventHandler handler = new CountingEventHandler();
        integrator.addEventHandler(handler, 1.0, 1e-6, 100);
        Collection<EventHandler> handlers = integrator.getEventHandlers();
        assertEquals(1, handlers.size());
        assertTrue(handlers.contains(handler));
    }

    @Test
    public void testAddEventHandlerWithExplicitSolver() {
        ConcreteIntegrator integrator = new ConcreteIntegrator("int");
        CountingEventHandler handler = new CountingEventHandler();
        UnivariateSolver solver = new BracketingNthOrderBrentSolver(1e-6, 5);
        integrator.addEventHandler(handler, 1.0, 1e-6, 100, solver);
        assertEquals(1, integrator.getEventHandlers().size());
    }

    @Test
    public void testClearEventHandlers() {
        ConcreteIntegrator integrator = new ConcreteIntegrator("int");
        integrator.addEventHandler(new CountingEventHandler(), 1.0, 1e-6, 100);
        assertEquals(1, integrator.getEventHandlers().size());
        integrator.clearEventHandlers();
        assertEquals(0, integrator.getEventHandlers().size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetEventHandlersIsUnmodifiable() {
        ConcreteIntegrator integrator = new ConcreteIntegrator("int");
        integrator.addEventHandler(new CountingEventHandler(), 1.0, 1e-6, 100);
        Collection<EventHandler> handlers = integrator.getEventHandlers();
        handlers.add(new CountingEventHandler());
    }

    // ---------------------------------------------------------------
    // Step start / step size (initial NaN state)
    // ---------------------------------------------------------------

    @Test
    public void testInitialStepStartAndSignedStepsizeAreNaN() {
        ConcreteIntegrator integrator = new ConcreteIntegrator("int");
        assertTrue(Double.isNaN(integrator.getCurrentStepStart()));
        assertTrue(Double.isNaN(integrator.getCurrentSignedStepsize()));
    }

    // ---------------------------------------------------------------
    // setMaxEvaluations / getMaxEvaluations  (branch: maxEvaluations < 0)
    // ---------------------------------------------------------------

    @Test
    public void testSetMaxEvaluationsNegativeMapsToIntegerMax() {
        ConcreteIntegrator integrator = new ConcreteIntegrator("int");
        integrator.setMaxEvaluations(-1);
        assertEquals(Integer.MAX_VALUE, integrator.getMaxEvaluations());
    }

    @Test
    public void testSetMaxEvaluationsZeroIsBoundary() {
        // boundary: 0 is NOT negative -> false branch
        ConcreteIntegrator integrator = new ConcreteIntegrator("int");
        integrator.setMaxEvaluations(0);
        assertEquals(0, integrator.getMaxEvaluations());
    }

    @Test
    public void testSetMaxEvaluationsPositive() {
        ConcreteIntegrator integrator = new ConcreteIntegrator("int");
        integrator.setMaxEvaluations(500);
        assertEquals(500, integrator.getMaxEvaluations());
    }

    // ---------------------------------------------------------------
    // getEvaluations (initial state + increment via computeDerivatives)
    // ---------------------------------------------------------------

    @Test
    public void testGetEvaluationsInitiallyZero() {
        ConcreteIntegrator integrator = new ConcreteIntegrator("int");
        assertEquals(0, integrator.getEvaluations());
    }

    @Test
    public void testComputeDerivativesIncrementsEvaluationCount() {
        ConcreteIntegrator integrator = new ConcreteIntegrator("int");
        ExpandableStatefulODE eq = new ExpandableStatefulODE(new SimpleEquations(2));
        eq.setTime(0.0);
        eq.setPrimaryState(new double[] {1.0, 1.0});
        integrator.callSetEquations(eq);

        double[] y = {1.0, 1.0};
        double[] yDot = new double[2];

        assertEquals(0, integrator.getEvaluations());
        integrator.callComputeDerivatives(0.0, y, yDot);
        assertEquals(1, integrator.getEvaluations());
        integrator.callComputeDerivatives(0.0, y, yDot);
        assertEquals(2, integrator.getEvaluations());
    }

    @Test(expected = NullPointerException.class)
    public void testComputeDerivativesWithoutSetEquationsThrowsNPE() {
        // expandable field is null if setEquations() never called -> NPE is
        // the deterministic consequence per Java semantics of the given source.
        ConcreteIntegrator integrator = new ConcreteIntegrator("int");
        double[] y = {1.0};
        double[] yDot = new double[1];
        integrator.callComputeDerivatives(0.0, y, yDot);
    }

    // ---------------------------------------------------------------
    // initIntegration
    // ---------------------------------------------------------------

    @Test
    public void testInitIntegrationResetsCountAndCallsInitOnHandlers() {
        ConcreteIntegrator integrator = new ConcreteIntegrator("int");

        CountingEventHandler eventHandler = new CountingEventHandler();
        integrator.addEventHandler(eventHandler, 1.0, 1e-6, 100);

        CountingStepHandler stepHandler = new CountingStepHandler();
        integrator.addStepHandler(stepHandler);

        ExpandableStatefulODE eq = new ExpandableStatefulODE(new SimpleEquations(2));
        eq.setTime(0.0);
        eq.setPrimaryState(new double[] {1.0, 2.0});
        integrator.callSetEquations(eq);

        // simulate some evaluations before init
        integrator.callComputeDerivatives(0.0, new double[] {1.0, 2.0}, new double[2]);
        assertEquals(1, integrator.getEvaluations());

        integrator.callInitIntegration(0.0, new double[] {1.0, 2.0}, 5.0);

        assertEquals(0, integrator.getEvaluations()); // evaluations.resetCount()
        assertEquals(1, eventHandler.initCalls);
        assertEquals(1, stepHandler.initCalls);
        assertEquals(0.0, eventHandler.lastT0, 1e-12);
        assertEquals(5.0, eventHandler.lastT, 1e-12);
        assertArrayEquals(new double[] {1.0, 2.0}, eventHandler.lastY0, 1e-12);
    }

    @Test
    public void testSetStateInitializedDoesNotThrow() {
        // statesInitialized is private with no public getter, so only
        // the absence of exceptions can be verified directly here.
        ConcreteIntegrator integrator = new ConcreteIntegrator("int");
        integrator.callSetStateInitialized(true);
        integrator.callSetStateInitialized(false);
    }

    // ---------------------------------------------------------------
    // sanityChecks  (branch: dt <= threshold)
    // ---------------------------------------------------------------

    @Test(expected = NumberIsTooSmallException.class)
    public void testSanityChecksThrowsWhenIntervalTooSmall() {
        ConcreteIntegrator integrator = new ConcreteIntegrator("int");
        ExpandableStatefulODE eq = new ExpandableStatefulODE(new SimpleEquations(2));
        eq.setTime(1.0);
        integrator.callSanityChecks(eq, 1.0); // dt = 0 <= threshold -> true branch
    }

    @Test
    public void testSanityChecksNoExceptionForValidInterval() {
        ConcreteIntegrator integrator = new ConcreteIntegrator("int");
        ExpandableStatefulODE eq = new ExpandableStatefulODE(new SimpleEquations(2));
        eq.setTime(0.0);
        integrator.callSanityChecks(eq, 10.0); // dt = 10 > threshold -> false branch
        // no exception expected
    }

    @Test
    public void testSanityChecksBackwardIntegrationValidInterval() {
        // dt computed with FastMath.abs(), so backward (t0 > t) must also pass
        ConcreteIntegrator integrator = new ConcreteIntegrator("int");
        ExpandableStatefulODE eq = new ExpandableStatefulODE(new SimpleEquations(2));
        eq.setTime(5.0);
        integrator.callSanityChecks(eq, 0.0); // dt = 5
    }

    // ---------------------------------------------------------------
    // integrate(FirstOrderDifferentialEquations, t0, y0, t, y)
    // ---------------------------------------------------------------

    @Test(expected = DimensionMismatchException.class)
    public void testIntegrateY0DimensionMismatch() {
        ConcreteIntegrator integrator = new ConcreteIntegrator("int");
        FirstOrderDifferentialEquations eq = new SimpleEquations(3);
        double[] y0 = new double[2]; // mismatch vs dimension 3
        double[] y = new double[3];
        integrator.integrate(eq, 0.0, y0, 1.0, y);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testIntegrateYDimensionMismatch() {
        ConcreteIntegrator integrator = new ConcreteIntegrator("int");
        FirstOrderDifferentialEquations eq = new SimpleEquations(3);
        double[] y0 = new double[3];
        double[] y = new double[2]; // mismatch vs dimension 3
        integrator.integrate(eq, 0.0, y0, 1.0, y);
    }

    @Test
    public void testIntegrateSuccessBothDimensionsMatch() {
        ConcreteIntegrator integrator = new ConcreteIntegrator("int");
        FirstOrderDifferentialEquations eq = new SimpleEquations(2);
        double[] y0 = {1.0, 2.0};
        double[] y = new double[2];

        double tEnd = integrator.integrate(eq, 0.0, y0, 5.0, y);

        assertEquals(5.0, tEnd, 1e-12);
        // ConcreteIntegrator.integrate copies state unchanged -> y should equal y0
        assertArrayEquals(y0, y, 1e-12);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testIntegrateEndToEndPropagatesSanityCheckException() {
        ConcreteIntegrator integrator = new ConcreteIntegrator("int");
        FirstOrderDifferentialEquations eq = new SimpleEquations(2);
        double[] y0 = {1.0, 2.0};
        double[] y = new double[2];
        // t0 == t -> sanityChecks() inside integrate(ExpandableStatefulODE,t) throws
        integrator.integrate(eq, 0.0, y0, 0.0, y);
    }
}
```

## สรุปตาราง Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testConstructorWithName` | Constructor กำหนดชื่อ → `getName()` คืนค่าถูกต้อง |
| `testConstructorWithEmptyName` | ค่าขอบเขต: ชื่อเป็น empty string |
| `testConstructorWithNullName` | Constructor แบบ `protected AbstractIntegrator()` → name = null |
| `testAddAndGetStepHandlers` | `addStepHandler`/`getStepHandlers` ปกติ |
| `testClearStepHandlers` | `clearStepHandlers()` |
| `testGetStepHandlersIsUnmodifiable` | `getStepHandlers()` คืน unmodifiable collection |
| `testAddEventHandlerDefaultSolver` | Overload `addEventHandler` 4-arg (เรียก default solver ภายใน) |
| `testAddEventHandlerWithExplicitSolver` | Overload `addEventHandler` 5-arg (ระบุ solver เอง) |
| `testClearEventHandlers` | `clearEventHandlers()` |
| `testGetEventHandlersIsUnmodifiable` | `getEventHandlers()` คืน unmodifiable collection |
| `testInitialStepStartAndSignedStepsizeAreNaN` | ค่าเริ่มต้น `stepStart`/`stepSize` = NaN |
| `testSetMaxEvaluationsNegativeMapsToIntegerMax` | branch `maxEvaluations < 0` = true |
| `testSetMaxEvaluationsZeroIsBoundary` | branch `maxEvaluations < 0` = false (boundary 0) |
| `testSetMaxEvaluationsPositive` | branch false ด้วยค่าปกติ |
| `testGetEvaluationsInitiallyZero` | ค่าเริ่มต้น evaluations = 0 |
| `testComputeDerivativesIncrementsEvaluationCount` | `computeDerivatives` เพิ่ม count ทีละ 1 |
| `testComputeDerivativesWithoutSetEquationsThrowsNPE` | `expandable == null` → NPE (fault-detecting) |
| `testInitIntegrationResetsCountAndCallsInitOnHandlers` | loop event states + loop step handlers + `resetCount()` + `setStateInitialized(false)` |
| `testSetStateInitializedDoesNotThrow` | เรียก setter ตรง (ไม่มี observable state เพิ่มเติม) |
| `testSanityChecksThrowsWhenIntervalTooSmall` | branch `dt <= threshold` = true |
| `testSanityChecksNoExceptionForValidInterval` | branch `dt <= threshold` = false |
| `testSanityChecksBackwardIntegrationValidInterval` | `FastMath.abs()` ของ dt กรณี backward integration |
| `testIntegrateY0DimensionMismatch` | if แรก `y0.length != dim` = true |
| `testIntegrateYDimensionMismatch` | if แรก false, if สอง `y.length != dim` = true |
| `testIntegrateSuccessBothDimensionsMatch` | ทั้งสอง if = false (เส้นทาง success) |
| `testIntegrateEndToEndPropagatesSanityCheckException` | integration pipeline เต็มรูปแบบ + sanityChecks throw |

**หมายเหตุสำคัญ:** `acceptStep(...)` ไม่ได้ถูกทดสอบโดยตรง เนื่องจากต้องใช้ `AbstractStepInterpolator` (abstract class) ที่ไม่มี source ให้มาในโจทย์ จึงไม่สามารถสร้าง test double ที่ถูกต้องตาม behavior จริงได้โดยไม่เดา — เป็นไปตามข้อกำหนดข้อ 4