ด้านล่างนี้คือชุดทดสอบ JUnit 4 สำหรับ `SimplexSolver` (Defects4J: Math-82b)

**หมายเหตุสำคัญก่อนโค้ด:**
- คลาส `SimplexSolver` สืบทอดจาก `AbstractLinearOptimizer` ซึ่ง**ไม่ได้ให้ซอร์สมาด้วย** เมธอด public ที่ใช้เรียกใช้งานจริง (`optimize(...)`) เป็นไปตาม API มาตรฐานของ Apache Commons Math 2.0 (`LinearObjectiveFunction`, `LinearConstraint`, `Relationship`, `GoalType`, `RealPointValuePair`) — จุดนี้เป็น**การอนุมานจาก dependency ที่ import ในซอร์สที่ให้มา** ไม่ใช่การเดา behavior ของ `SimplexSolver` เอง
- พฤติกรรมเมื่อ `constraints`/`f` เป็น `null` หรือ `empty` **ไม่มีการ handle null ให้เห็นในซอร์ส** จึงคอมเมนต์กำกับไว้ชัดเจนว่าเป็นการคาดเดาผลลัพธ์ (RuntimeException) จาก logic ของ loop เท่านั้น

```java
package org.apache.commons.math.optimization.linear;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.junit.Test;

/**
 * Unit tests for {@link SimplexSolver} (Defects4J Math-82b).
 *
 * หมายเหตุ: optimize(...) เป็น public API ที่ SimplexSolver ได้มาจาก AbstractLinearOptimizer
 * (ไม่มีซอร์สให้) แต่เป็น API มาตรฐานของ Apache Commons Math 2.0 ซึ่งจำเป็นต้องมีเพื่อให้
 * SimplexSolver.doOptimize() ถูกเรียกใช้งานได้จริง
 */
public class SimplexSolverTest {

    private static final double EPS = 1.0e-6;

    // ---------------------------------------------------------------
    // 1) Default constructor + ปัญหาปกติที่ไม่ต้องใช้ Phase1
    //    (เฉพาะ LEQ constraints -> numArtificialVariables == 0)
    //    ครอบคลุม: isPhase1Solved -> true ทันที (branch numArtificialVariables==0)
    //              isOptimal -> numArtificialVariables==0 (false branch ของ >0)
    //              getPivotColumn / getPivotRow ปกติ, doIteration วนหลายรอบ
    // ---------------------------------------------------------------
    @Test
    public void testMaximizeWithOnlyLeqConstraints() throws OptimizationException {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {3, 2}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {1, 1}, Relationship.LEQ, 4));
        constraints.add(new LinearConstraint(new double[] {1, 3}, Relationship.LEQ, 6));

        SimplexSolver solver = new SimplexSolver();
        RealPointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, true);

        assertNotNull(solution);
        assertEquals(12.0, solution.getValue(), EPS);
        assertArrayEquals(new double[] {4.0, 0.0}, solution.getPoint(), EPS);
    }

    // ---------------------------------------------------------------
    // 2) GEQ constraints -> ต้องมี artificial variable -> เข้า Phase1 จริง
    //    ครอบคลุม: solvePhase1 while-loop (!isPhase1Solved) วนหลายรอบ
    //              isPhase1Solved -> false branch (ยัง compareTo<0 อยู่) หลายครั้งก่อนจบ
    //              เงื่อนไข MathUtils.equals(W,0,epsilon) == true (ไม่ throw NoFeasible)
    // ---------------------------------------------------------------
    @Test
    public void testMinimizeWithGeqConstraintsTriggersPhase1() throws OptimizationException {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1, 1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {1, 2}, Relationship.GEQ, 4));
        constraints.add(new LinearConstraint(new double[] {3, 1}, Relationship.GEQ, 6));

        SimplexSolver solver = new SimplexSolver();
        RealPointValuePair solution = solver.optimize(f, constraints, GoalType.MINIMIZE, true);

        assertNotNull(solution);
        assertEquals(2.8, solution.getValue(), EPS);
        assertArrayEquals(new double[] {1.6, 1.2}, solution.getPoint(), EPS);
    }

    // ---------------------------------------------------------------
    // 3) ปัญหา infeasible: x>=5 และ x<=3 ขัดกัน
    //    ครอบคลุม: solvePhase1 จบลูปแล้ว W != 0 -> throw NoFeasibleSolutionException
    //              (branch "if (!MathUtils.equals(...)) throw")
    // ---------------------------------------------------------------
    @Test(expected = NoFeasibleSolutionException.class)
    public void testInfeasibleProblemThrowsNoFeasibleSolutionException() throws OptimizationException {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {1}, Relationship.GEQ, 5));
        constraints.add(new LinearConstraint(new double[] {1}, Relationship.LEQ, 3));

        SimplexSolver solver = new SimplexSolver();
        solver.optimize(f, constraints, GoalType.MINIMIZE, true);
    }

    // ---------------------------------------------------------------
    // 4) ปัญหา unbounded: maximize x โดยไม่มี constraint ที่บังคับ x
    //    ครอบคลุม: getPivotRow คืน null (ไม่มี entry>=0 ที่ให้ ratio จำกัด)
    //              doIteration -> throw UnboundedSolutionException
    //              (branch "if (pivotRow == null) throw")
    // ---------------------------------------------------------------
    @Test(expected = UnboundedSolutionException.class)
    public void testUnboundedProblemThrowsUnboundedSolutionException() throws OptimizationException {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1, 0}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {0, 1}, Relationship.LEQ, 10));

        SimplexSolver solver = new SimplexSolver();
        solver.optimize(f, constraints, GoalType.MAXIMIZE, true);
    }

    // ---------------------------------------------------------------
    // 5) restrictToNonNegative = false พร้อม EQ constraint
    //    ครอบคลุม: branch restrictToNonNegative=false (ส่งผ่านไปยัง SimplexTableau)
    //              EQ constraint -> numArtificialVariables>0 -> เข้า Phase1
    // ---------------------------------------------------------------
    @Test
    public void testEqualityConstraintWithNegativeAllowed() throws OptimizationException {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1, 1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {1, 1}, Relationship.EQ, 2));

        SimplexSolver solver = new SimplexSolver();
        RealPointValuePair solution = solver.optimize(f, constraints, GoalType.MINIMIZE, false);

        assertNotNull(solution);
        assertEquals(2.0, solution.getValue(), EPS);
        // เฉพาะค่า sum เท่านั้นที่พิสูจน์ได้ทางคณิตศาสตร์ ไม่ assert ค่าแต่ละตัวแยก
        assertEquals(2.0, solution.getPoint()[0] + solution.getPoint()[1], EPS);
    }

    // ---------------------------------------------------------------
    // 6) Constructor ที่กำหนด epsilon เอง -> ตรวจว่ายังทำงานได้ถูกต้อง
    //    ครอบคลุม: SimplexSolver(double epsilon) constructor
    //              การใช้ epsilon ใน MathUtils.compareTo ของ getPivotColumn/getPivotRow
    // ---------------------------------------------------------------
    @Test
    public void testCustomEpsilonConstructorStillSolvesCorrectly() throws OptimizationException {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {3, 2}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {1, 1}, Relationship.LEQ, 4));
        constraints.add(new LinearConstraint(new double[] {1, 3}, Relationship.LEQ, 6));

        SimplexSolver solver = new SimplexSolver(1.0e-3);
        RealPointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, true);

        assertEquals(12.0, solution.getValue(), 1.0e-3);
        assertArrayEquals(new double[] {4.0, 0.0}, solution.getPoint(), 1.0e-3);
    }

    // ---------------------------------------------------------------
    // 7) ไม่มี constraint เลย (empty collection) ขณะ maximize
    //    หมายเหตุ/ข้อสังเกต: พฤติกรรมนี้อนุมานจาก logic ของ getPivotRow loop
    //    (for i = numObjectiveFunctions; i < getHeight(); i++) ซึ่งเมื่อไม่มี
    //    constraint ใด ๆ ค่า getHeight() จะเท่ากับ numObjectiveFunctions ทำให้
    //    loop ไม่ทำงานเลย -> pivotRow เป็น null -> UnboundedSolutionException
    //    *** เป็นการอนุมานเชิง logic จาก source ที่ให้มา ไม่ใช่การเดา behavior
    //        ของคลาสอื่นที่ไม่มีซอร์ส ***
    // ---------------------------------------------------------------
    @Test(expected = UnboundedSolutionException.class)
    public void testEmptyConstraintsProducesUnbounded() throws OptimizationException {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1, 2}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();

        SimplexSolver solver = new SimplexSolver();
        solver.optimize(f, constraints, GoalType.MAXIMIZE, true);
    }

    // ---------------------------------------------------------------
    // 8) null constraints -> คาดว่าจะมี RuntimeException (เช่น NullPointerException)
    //    *** ไม่มี null-check ปรากฎในซอร์สที่ให้มา เป็นเพียงการอนุมานผลลัพธ์
    //        จากการที่ constraints ถูกใช้สร้าง SimplexTableau โดยตรงใน doOptimize() ***
    // ---------------------------------------------------------------
    @Test(expected = RuntimeException.class)
    public void testNullConstraintsThrowsRuntimeException() throws OptimizationException {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1, 2}, 0);
        SimplexSolver solver = new SimplexSolver();
        solver.optimize(f, null, GoalType.MAXIMIZE, true);
    }

    // ---------------------------------------------------------------
    // 9) null objective function -> คาดว่าจะมี RuntimeException
    //    *** เช่นเดียวกับข้อ 8 เป็นการอนุมาน ไม่ใช่ข้อเท็จจริงจากซอร์สที่ให้มา ***
    // ---------------------------------------------------------------
    @Test(expected = RuntimeException.class)
    public void testNullObjectiveFunctionThrowsRuntimeException() throws OptimizationException {
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {1, 1}, Relationship.LEQ, 4));

        SimplexSolver solver = new SimplexSolver();
        solver.optimize(null, constraints, GoalType.MAXIMIZE, true);
    }

    // ---------------------------------------------------------------
    // 10) ปัญหาที่ "เหมาะสมที่สุดอยู่แล้ว" (optimal ตั้งแต่เริ่ม)
    //     ครอบคลุม: isOptimal คืน true ตั้งแต่รอบแรก (ไม่มี coefficient<0 ในแถว objective)
    //               -> while(!isOptimal) ไม่ทำงานเลย -> ข้าม doIteration ไปเลย (branch loop 0 รอบ)
    // ---------------------------------------------------------------
    @Test
    public void testAlreadyOptimalNoIterationNeeded() throws OptimizationException {
        // objective ไม่มีค่า coefficient บวกเลย (สำหรับ maximize -> แปลงเป็น min ของค่าลบ
        // ซึ่งจะไม่มี entry<0 ในแถวแรกตั้งแต่ต้น เพราะ coefficient เป็น 0 ทั้งคู่)
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {0, 0}, 5);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {1, 1}, Relationship.LEQ, 4));

        SimplexSolver solver = new SimplexSolver();
        RealPointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, true);

        assertNotNull(solution);
        assertEquals(5.0, solution.getValue(), EPS);
    }
}
```

---

## ตารางสรุป Test Case กับ Branch/Condition ที่ครอบคลุม

| เมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testMaximizeWithOnlyLeqConstraints` | `isPhase1Solved`: `numArtificialVariables==0` → true; `isOptimal`: `numArtificialVariables>0` → false branch; `getPivotColumn`/`getPivotRow` ปกติ; `doIteration` วนหลายรอบ (loop ปกติ) |
| `testMinimizeWithGeqConstraintsTriggersPhase1` | `solvePhase1`: `numArtificialVariables!=0` เข้า while-loop จริง; `isPhase1Solved` false หลายรอบก่อนจบ; `MathUtils.equals(W,0,eps)==true` (ไม่ throw) |
| `testInfeasibleProblemThrowsNoFeasibleSolutionException` | `solvePhase1` จบลูปแล้ว `W!=0` → throw `NoFeasibleSolutionException` (branch throw) |
| `testUnboundedProblemThrowsUnboundedSolutionException` | `getPivotRow` คืน `null`; `doIteration`: `if (pivotRow==null) throw UnboundedSolutionException` |
| `testEqualityConstraintWithNegativeAllowed` | `restrictToNonNegative=false` branch; EQ constraint → `numArtificialVariables>0` เข้า Phase1 |
| `testCustomEpsilonConstructorStillSolvesCorrectly` | Constructor `SimplexSolver(double epsilon)`; การใช้ `epsilon` ใน `MathUtils.compareTo` |
| `testEmptyConstraintsProducesUnbounded` | `getPivotRow` loop range เป็นค่าว่าง (ไม่มี constraint) → `pivotRow=null` → Unbounded (อนุมานจาก logic) |
| `testNullConstraintsThrowsRuntimeException` | Null-input edge case (ไม่มี explicit check ในซอร์ส, คาดเดาเป็น RuntimeException) |
| `testNullObjectiveFunctionThrowsRuntimeException` | Null-input edge case (เช่นเดียวกับด้านบน) |
| `testAlreadyOptimalNoIterationNeeded` | `isOptimal` คืน `true` ตั้งแต่ต้น → `while(!isOptimal(tableau))` ไม่ทำงานเลย (loop 0 รอบ) |

**ข้อจำกัด:** เนื่องจากไม่มีซอร์สของ `AbstractLinearOptimizer`, `SimplexTableau`, `LinearConstraint`, `LinearObjectiveFunction` ให้มาโดยตรง การทดสอบในข้อ 7–9 จึงเป็นการทดสอบระดับ integration ที่อนุมานผลลัพธ์จาก logic ของ `getPivotRow`/`getPivotColumn` เท่านั้น และคอมเมนต์กำกับไว้ชัดเจนตามข้อกำหนดที่ 4