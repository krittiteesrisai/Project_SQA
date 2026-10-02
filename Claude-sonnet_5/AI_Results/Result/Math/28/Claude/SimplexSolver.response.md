# SimplexSolverTest.java

```java
package org.apache.commons.math3.optimization.linear;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.junit.Test;

/**
 * Unit test สำหรับ {@link SimplexSolver} (Defects4J Math-28b)
 *
 * หมายเหตุสำคัญ: ซอร์สของ {@code SimplexTableau} ไม่ได้ให้มาในโจทย์นี้
 * ดังนั้นพฤติกรรมภายในบางจุด (เช่น จำนวนแถว/คอลัมน์ที่แน่นอน, การจัดสรร
 * slack/surplus/artificial variable) จะถูกทดสอบแบบ black-box ผ่าน public
 * API (optimize) เท่านั้น และจะมีคอมเมนต์กำกับไว้ทุกจุดที่เป็น "สมมติฐาน"
 * ที่อ้างอิงจากพฤติกรรมมาตรฐานของ Simplex method ทั่วไป มิใช่จากซอร์สที่ให้มาตรง ๆ
 */
public class SimplexSolverTest {

    private static final double FP_TOLERANCE = 1.0e-9;

    // =========================================================
    // 1. Constructor tests
    // =========================================================

    @Test
    public void testDefaultConstructorFields() throws Exception {
        SimplexSolver solver = new SimplexSolver();
        double eps = getPrivateDoubleField(solver, "epsilon");
        int ulps = getPrivateIntField(solver, "maxUlps");
        assertEquals(1.0e-6, eps, 0d);
        assertEquals(10, ulps);
    }

    @Test
    public void testParameterizedConstructorFields() throws Exception {
        SimplexSolver solver = new SimplexSolver(1.0e-3, 5);
        double eps = getPrivateDoubleField(solver, "epsilon");
        int ulps = getPrivateIntField(solver, "maxUlps");
        assertEquals(1.0e-3, eps, 0d);
        assertEquals(5, ulps);
    }

    // =========================================================
    // 2. solvePhase1: numArtificialVariables == 0 -> early return
    //    (ไม่มี equality constraint ⇒ ใช้ slack variable อย่างเดียว)
    // =========================================================

    @Test
    public void testOptimizeSimpleMaximizationNoPhase1() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {2, 3}, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {1, 1}, Relationship.LEQ, 4));

        SimplexSolver solver = new SimplexSolver();
        PointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, true);

        assertEquals(12d, solution.getValue(), FP_TOLERANCE);
        assertEquals(0d, solution.getPoint()[0], FP_TOLERANCE);
        assertEquals(4d, solution.getPoint()[1], FP_TOLERANCE);
    }

    @Test
    public void testOptimizeSimpleMinimizationWithGeqConstraints() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1, 1}, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {1, 0}, Relationship.GEQ, 1));
        constraints.add(new LinearConstraint(new double[] {0, 1}, Relationship.GEQ, 1));
        constraints.add(new LinearConstraint(new double[] {1, 1}, Relationship.LEQ, 10));

        SimplexSolver solver = new SimplexSolver();
        PointValuePair solution = solver.optimize(f, constraints, GoalType.MINIMIZE, true);

        assertEquals(2d, solution.getValue(), FP_TOLERANCE);
    }

    // =========================================================
    // 3. solvePhase1: artificial variables ต้องถูกใช้ (equality constraint)
    //    และ feasible ⇒ ไม่ throw NoFeasibleSolutionException
    // =========================================================

    @Test
    public void testOptimizeWithEqualityConstraintFeasiblePhase1() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1, 1}, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {1, 1}, Relationship.EQ, 4));

        SimplexSolver solver = new SimplexSolver();
        PointValuePair solution = solver.optimize(f, constraints, GoalType.MINIMIZE, true);

        assertEquals(4d, solution.getValue(), FP_TOLERANCE);
    }

    // =========================================================
    // 4. solvePhase1: infeasible ⇒ W != 0 ⇒ NoFeasibleSolutionException
    // =========================================================

    @Test(expected = NoFeasibleSolutionException.class)
    public void testOptimizeInfeasibleThrows() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1, 1}, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {1, 0}, Relationship.EQ, 1));
        constraints.add(new LinearConstraint(new double[] {0, 1}, Relationship.EQ, 1));
        // ขัดแย้งกัน: x=1, y=1 แต่ x+y ต้อง =3
        constraints.add(new LinearConstraint(new double[] {1, 1}, Relationship.EQ, 3));

        SimplexSolver solver = new SimplexSolver();
        solver.optimize(f, constraints, GoalType.MINIMIZE, true);
    }

    // =========================================================
    // 5. doIteration: pivotRow == null ⇒ UnboundedSolutionException
    // =========================================================

    @Test(expected = UnboundedSolutionException.class)
    public void testOptimizeUnboundedThrows() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1, 1}, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {1, 0}, Relationship.GEQ, 1));

        SimplexSolver solver = new SimplexSolver();
        solver.optimize(f, constraints, GoalType.MAXIMIZE, true);
    }

    // =========================================================
    // 6. getPivotRow: tie (cmp == 0, minRatioPositions.size() > 1)
    //    ใช้ constraint ซ้ำกัน (LEQ ⇒ ไม่มี artificial variable)
    //    ⇒ สมมติฐาน: เข้าทาง Bland's rule branch (ไม่ใช่ artificial-forced-out)
    //    เนื่องจาก getNumArtificialVariables()==0 ตามพฤติกรรม standard-form
    //    ของ simplex (slack สำหรับ <=) — ไม่ได้ยืนยันจาก source ที่ให้มาโดยตรง
    // =========================================================

    @Test
    public void testOptimizeDegenerateTieInRatioTest() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {3, 2}, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {1, 1}, Relationship.LEQ, 4));
        constraints.add(new LinearConstraint(new double[] {1, 1}, Relationship.LEQ, 4)); // duplicate -> tie

        SimplexSolver solver = new SimplexSolver();
        PointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, true);

        assertEquals(12d, solution.getValue(), FP_TOLERANCE);
    }

    // =========================================================
    // 7. restrictToNonNegative = false
    // =========================================================

    @Test
    public void testOptimizeRestrictToNonNegativeFalse() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1}, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {1}, Relationship.GEQ, -5));

        SimplexSolver solver = new SimplexSolver();
        PointValuePair solution = solver.optimize(f, constraints, GoalType.MINIMIZE, false);

        assertEquals(-5d, solution.getValue(), FP_TOLERANCE);
    }

    // =========================================================
    // 8. doOptimize: phase-2 loop วนหลายรอบ + getPivotColumn เลือกค่าติดลบที่น้อยที่สุดซ้ำ ๆ
    //    ค่า optimum คำนวณด้วยมือ (vertex enumeration) ไว้ล่วงหน้า = -20 ที่ (0,0,5)
    // =========================================================

    @Test
    public void testOptimizeMultipleIterationsPhase2() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {-2, -3, -4}, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {3, 2, 1}, Relationship.LEQ, 10));
        constraints.add(new LinearConstraint(new double[] {2, 5, 3}, Relationship.LEQ, 15));

        SimplexSolver solver = new SimplexSolver();
        PointValuePair solution = solver.optimize(f, constraints, GoalType.MINIMIZE, true);

        assertEquals(-20d, solution.getValue(), FP_TOLERANCE);
        assertArrayEquals(new double[] {0d, 0d, 5d}, solution.getPoint(), FP_TOLERANCE);
    }

    // =========================================================
    // 9. Boundary: objective coefficients ทั้งหมดเป็น 0, ไม่มี constraint
    //    สมมติฐาน: getPivotColumn คืนค่า null ตั้งแต่แรก ⇒ isOptimal() = true
    //    ⇒ loop ไม่ถูกวนแม้แต่รอบเดียว (ไม่สามารถยืนยัน isOptimal() จาก source
    //    ที่ให้มาได้ 100% เพราะอยู่ใน SimplexTableau ซึ่งไม่ได้แสดงในโจทย์)
    // =========================================================

    @Test
    public void testOptimizeNoConstraintsTrivialObjective() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {0, 0}, 5);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();

        SimplexSolver solver = new SimplexSolver();
        PointValuePair solution = solver.optimize(f, constraints, GoalType.MINIMIZE, true);

        assertEquals(5d, solution.getValue(), FP_TOLERANCE);
        assertArrayEquals(new double[] {0d, 0d}, solution.getPoint(), FP_TOLERANCE);
    }

    // =========================================================
    // 10. Null input: constraints == null
    //     สมมติฐาน: จะเกิด NullPointerException เมื่อพยายาม iterate
    //     บน collection ที่เป็น null ภายใน SimplexTableau (ไม่มีการ null-check
    //     ที่มองเห็นได้ใน SimplexSolver ที่ให้มา) — คอมเมนต์กำกับความไม่แน่นอนนี้
    //     ตามข้อกำหนดที่ 4
    // =========================================================

    @Test(expected = NullPointerException.class)
    public void testOptimizeNullConstraintsThrowsNPE() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1}, 0);
        SimplexSolver solver = new SimplexSolver();
        solver.optimize(f, null, GoalType.MINIMIZE, true);
    }

    // =========================================================
    // helpers (reflection)
    // =========================================================

    private double getPrivateDoubleField(Object obj, String name) throws Exception {
        Field field = SimplexSolver.class.getDeclaredField(name);
        field.setAccessible(true);
        return field.getDouble(obj);
    }

    private int getPrivateIntField(Object obj, String name) throws Exception {
        Field field = SimplexSolver.class.getDeclaredField(name);
        field.setAccessible(true);
        return field.getInt(obj);
    }
}
```

## ตารางสรุป Branch/Condition Coverage

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testDefaultConstructorFields` | Constructor `SimplexSolver()` → ค่า `DEFAULT_EPSILON`, `DEFAULT_ULPS` |
| `testParameterizedConstructorFields` | Constructor `SimplexSolver(epsilon, maxUlps)` กำหนดค่าเอง |
| `testOptimizeSimpleMaximizationNoPhase1` | `solvePhase1`: `numArtificialVariables()==0 → return` (true branch) |
| `testOptimizeSimpleMinimizationWithGeqConstraints` | GEQ constraint, phase1 loop รันปกติ, feasible |
| `testOptimizeWithEqualityConstraintFeasiblePhase1` | `solvePhase1`: while(!isOptimal) loop ≥1 รอบ, `W==0` (feasible, ไม่ throw) |
| `testOptimizeInfeasibleThrows` | `solvePhase1`: `W != 0` → throw `NoFeasibleSolutionException` |
| `testOptimizeUnboundedThrows` | `doIteration`: `pivotRow == null` → throw `UnboundedSolutionException` |
| `testOptimizeDegenerateTieInRatioTest` | `getPivotRow`: `cmp==0` (tie), `minRatioPositions.size()>1`, Bland's-rule fallback loop |
| `testOptimizeRestrictToNonNegativeFalse` | `doOptimize` กับ `restrictToNonNegative()=false` |
| `testOptimizeMultipleIterationsPhase2` | `getPivotColumn`: `entry<minValue` (true หลายรอบ), phase-2 loop วนหลายครั้ง, `doIteration` วน `subtractRow` ครบทุกแถว |
| `testOptimizeNoConstraintsTrivialObjective` | Boundary: ไม่มี constraint, objective เป็น 0 ทั้งหมด (`getPivotColumn` คืน null ทันที) |
| `testOptimizeNullConstraintsThrowsNPE` | Null-input case (constraints == null) |

**หมายเหตุ:** เมธอด `getPivotColumn`/`getPivotRow`/`doIteration`/`solvePhase1` เป็น `private`/`protected` จึงไม่สามารถเรียกตรงได้จากนอกคลาส — การทดสอบทั้งหมดใช้วิธี black-box ผ่าน `optimize()` (public API ที่สืบทอดจาก `AbstractLinearOptimizer`) เพื่อกระตุ้น branch ภายในตามที่วิเคราะห์ได้จาก logic ของซอร์สที่ให้มา จุดใดที่ไม่สามารถยืนยัน behavior จาก source ได้ 100% (เช่น โครงสร้างภายใน `SimplexTableau`) ได้ใส่คอมเมนต์กำกับไว้ตามข้อกำหนด