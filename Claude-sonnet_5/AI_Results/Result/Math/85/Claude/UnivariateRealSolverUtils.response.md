# การวิเคราะห์โค้ดก่อนเขียนเทส

จากซอร์สโค้ด `UnivariateRealSolverUtils` มี branch/condition หลักที่ต้องครอบคลุม:

1. **`setup(f)`** (เรียกจาก `solve()` ทั้งสอง overload): `f == null` → throw / `f != null` → ผ่าน
2. **`bracket(...)` 4 args** – validation 3 เงื่อนไข:
   - `function == null`
   - `maximumIterations <= 0`
   - `initial < lowerBound || initial > upperBound || lowerBound >= upperBound` (3 sub-condition)
3. **do-while loop** ใน `bracket()`:
   - loop จบทันที (fa*fb<0) 
   - loop วนหลายรอบก่อนจบ
   - loop จบเพราะ `numIterations >= maximumIterations`
   - loop จบเพราะ bound หมด (`a==lowerBound && b==upperBound`)
4. **เงื่อนไขหลัง loop**: `fa*fb >= 0` → throw ConvergenceException / else return array
5. **`midpoint()`** – ไม่มี branch แต่ควรมี unit test พื้นฐาน
6. **FunctionEvaluationException propagation** จาก `function.value()`

---

```java
package org.apache.commons.math.analysis.solvers;

import static org.junit.Assert.*;

import org.apache.commons.math.ConvergenceException;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.junit.Test;

/**
 * JUnit4 test suite for {@link UnivariateRealSolverUtils}.
 *
 * หมายเหตุ: ค่าความแม่นยำ (accuracy) เริ่มต้นของ solver ที่ได้จาก
 * UnivariateRealSolverFactory เป็น implementation detail ที่ไม่ได้ระบุไว้ชัดเจน
 * ในซอร์สของ UnivariateRealSolverUtils เอง จึงใช้ delta ที่ค่อนข้างหลวม
 * เพื่อหลีกเลี่ยงการเดา behavior ของ solver ภายใน
 */
public class UnivariateRealSolverUtilsTest {

    // ---------- Helper test functions ----------

    /** f(x) = x - root */
    private static class LinearFunction implements UnivariateRealFunction {
        private final double root;
        LinearFunction(double root) { this.root = root; }
        public double value(double x) throws FunctionEvaluationException {
            return x - root;
        }
    }

    /** f(x) = x^2 + 1 : ไม่มี root จริงบนแกนจำนวนจริง (ค่าเป็นบวกเสมอ) */
    private static class AlwaysPositiveFunction implements UnivariateRealFunction {
        public double value(double x) throws FunctionEvaluationException {
            return x * x + 1.0;
        }
    }

    /** ฟังก์ชันที่ throw FunctionEvaluationException ทุกครั้งที่ถูกเรียก */
    private static class ThrowingFunction implements UnivariateRealFunction {
        public double value(double x) throws FunctionEvaluationException {
            throw new FunctionEvaluationException(x);
        }
    }

    // ================= solve(f, x0, x1) =================

    @Test(expected = IllegalArgumentException.class)
    public void testSolveNullFunctionThrowsIAE() throws Exception {
        UnivariateRealSolverUtils.solve(null, 0.0, 1.0);
    }

    @Test
    public void testSolveFindsRootNormalCase() throws Exception {
        UnivariateRealFunction f = new LinearFunction(1.5);
        double root = UnivariateRealSolverUtils.solve(f, 0.0, 3.0);
        assertEquals(1.5, root, 1e-3);
    }

    // ================= solve(f, x0, x1, accuracy) =================

    @Test(expected = IllegalArgumentException.class)
    public void testSolveWithAccuracyNullFunctionThrowsIAE() throws Exception {
        UnivariateRealSolverUtils.solve(null, 0.0, 1.0, 1e-6);
    }

    @Test
    public void testSolveWithAccuracyFindsRoot() throws Exception {
        UnivariateRealFunction f = new LinearFunction(2.0);
        double root = UnivariateRealSolverUtils.solve(f, 1.0, 3.0, 1e-8);
        assertEquals(2.0, root, 1e-4);
    }

    // ================= bracket(function, initial, lower, upper) 3-arg overload =================

    @Test
    public void testBracketThreeArgOverloadDelegatesCorrectly() throws Exception {
        // ตรวจว่า overload 3 args ทำงานเหมือน 4 args ด้วย maxIterations = Integer.MAX_VALUE
        UnivariateRealFunction f = new LinearFunction(1.0);
        double[] result = UnivariateRealSolverUtils.bracket(f, 0.5, -10.0, 10.0);
        assertEquals(-0.5, result[0], 1e-9);
        assertEquals(1.5, result[1], 1e-9);
    }

    // ================= bracket(...) validation branches =================

    @Test(expected = IllegalArgumentException.class)
    public void testBracketNullFunctionThrowsIAE() throws Exception {
        UnivariateRealSolverUtils.bracket(null, 0.0, -1.0, 1.0, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBracketZeroMaxIterationsThrowsIAE() throws Exception {
        UnivariateRealFunction f = new LinearFunction(0.0);
        UnivariateRealSolverUtils.bracket(f, 0.0, -1.0, 1.0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBracketNegativeMaxIterationsThrowsIAE() throws Exception {
        UnivariateRealFunction f = new LinearFunction(0.0);
        UnivariateRealSolverUtils.bracket(f, 0.0, -1.0, 1.0, -5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBracketInitialLessThanLowerBoundThrowsIAE() throws Exception {
        UnivariateRealFunction f = new LinearFunction(0.0);
        UnivariateRealSolverUtils.bracket(f, -5.0, -1.0, 1.0, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBracketInitialGreaterThanUpperBoundThrowsIAE() throws Exception {
        UnivariateRealFunction f = new LinearFunction(0.0);
        UnivariateRealSolverUtils.bracket(f, 5.0, -1.0, 1.0, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBracketLowerBoundEqualsUpperBoundThrowsIAE() throws Exception {
        UnivariateRealFunction f = new LinearFunction(0.0);
        UnivariateRealSolverUtils.bracket(f, 1.0, 1.0, 1.0, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBracketLowerBoundGreaterThanUpperBoundThrowsIAE() throws Exception {
        UnivariateRealFunction f = new LinearFunction(0.0);
        UnivariateRealSolverUtils.bracket(f, 1.0, 5.0, 2.0, 10);
    }

    // ================= bracket(...) success scenarios (loop branches) =================

    @Test
    public void testBracketSucceedsOnFirstIteration() throws Exception {
        // root = 1.0 ; initial=0.5 -> a=-0.5,b=1.5 -> f(a)*f(b)<0 ทันที (loop วนรอบเดียว)
        UnivariateRealFunction f = new LinearFunction(1.0);
        double[] result = UnivariateRealSolverUtils.bracket(f, 0.5, -10.0, 10.0, 100);
        assertEquals(-0.5, result[0], 1e-9);
        assertEquals(1.5, result[1], 1e-9);
    }

    @Test
    public void testBracketSucceedsAfterMultipleIterations() throws Exception {
        // root = 3.5 ; ต้องวน loop หลายรอบก่อนพบ sign change
        UnivariateRealFunction f = new LinearFunction(3.5);
        double[] result = UnivariateRealSolverUtils.bracket(f, 0.0, -100.0, 100.0, 1000);
        // ตามการคำนวณ: a=-4, b=4 คือรอบที่ 4 ที่ fa*fb<0
        assertEquals(-4.0, result[0], 1e-9);
        assertEquals(4.0, result[1], 1e-9);
    }

    @Test
    public void testBracketInitialEqualsLowerBoundEdgeCase() throws Exception {
        // ทดสอบ boundary: initial == lowerBound (เงื่อนไข initial < lowerBound ต้องเป็น false)
        UnivariateRealFunction f = new LinearFunction(0.5);
        double[] result = UnivariateRealSolverUtils.bracket(f, 0.0, 0.0, 10.0, 100);
        assertEquals(0.0, result[0], 1e-9);
        assertEquals(1.0, result[1], 1e-9);
    }

    @Test
    public void testBracketInitialEqualsUpperBoundEdgeCase() throws Exception {
        // ทดสอบ boundary: initial == upperBound (เงื่อนไข initial > upperBound ต้องเป็น false)
        UnivariateRealFunction f = new LinearFunction(9.5);
        double[] result = UnivariateRealSolverUtils.bracket(f, 10.0, 0.0, 10.0, 100);
        assertEquals(9.0, result[0], 1e-9);
        assertEquals(10.0, result[1], 1e-9);
    }

    // ================= bracket(...) failure / ConvergenceException branches =================

    @Test(expected = ConvergenceException.class)
    public void testBracketThrowsConvergenceExceptionWhenBoundsExhausted() throws Exception {
        // f ไม่มี root จริง (ค่าเป็นบวกเสมอ) ; loop จบเพราะ a=lowerBound และ b=upperBound
        UnivariateRealFunction f = new AlwaysPositiveFunction();
        UnivariateRealSolverUtils.bracket(f, 0.0, -5.0, 5.0, 50);
    }

    @Test(expected = ConvergenceException.class)
    public void testBracketThrowsConvergenceExceptionWhenMaxIterationsReached() throws Exception {
        // ช่วงกว้างมาก แต่ maximumIterations น้อย -> loop จบเพราะ numIterations >= maximumIterations
        // (ก่อนที่ a,b จะชน lowerBound/upperBound)
        UnivariateRealFunction f = new AlwaysPositiveFunction();
        UnivariateRealSolverUtils.bracket(f, 0.0, -1000.0, 1000.0, 3);
    }

    // ================= FunctionEvaluationException propagation =================

    @Test(expected = FunctionEvaluationException.class)
    public void testBracketPropagatesFunctionEvaluationException() throws Exception {
        UnivariateRealFunction f = new ThrowingFunction();
        UnivariateRealSolverUtils.bracket(f, 0.0, -5.0, 5.0, 10);
    }

    @Test(expected = FunctionEvaluationException.class)
    public void testSolvePropagatesFunctionEvaluationException() throws Exception {
        UnivariateRealFunction f = new ThrowingFunction();
        UnivariateRealSolverUtils.solve(f, 0.0, 1.0);
    }

    // ================= midpoint() =================

    @Test
    public void testMidpointPositiveValues() {
        assertEquals(2.0, UnivariateRealSolverUtils.midpoint(1.0, 3.0), 1e-12);
    }

    @Test
    public void testMidpointAcrossZero() {
        assertEquals(0.0, UnivariateRealSolverUtils.midpoint(-1.0, 1.0), 1e-12);
    }

    @Test
    public void testMidpointSameValue() {
        assertEquals(5.0, UnivariateRealSolverUtils.midpoint(5.0, 5.0), 1e-12);
    }

    @Test
    public void testMidpointLargeValues() {
        // boundary-style ค่า
        double a = Double.MAX_VALUE / 4;
        double b = Double.MAX_VALUE / 4;
        assertEquals(a, UnivariateRealSolverUtils.midpoint(a, b), 1e-6);
    }
}
```

---

## ตารางสรุปความครอบคลุม (Branch/Condition Coverage)

| เมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testSolveNullFunctionThrowsIAE` | `setup(f)`: `f == null` → true (solve 3-arg) |
| `testSolveFindsRootNormalCase` | `setup(f)`: `f == null` → false, flow ปกติของ `solve(f,x0,x1)` |
| `testSolveWithAccuracyNullFunctionThrowsIAE` | `setup(f)`: `f == null` → true (solve 4-arg) |
| `testSolveWithAccuracyFindsRoot` | flow ปกติของ `solve(f,x0,x1,accuracy)` |
| `testBracketThreeArgOverloadDelegatesCorrectly` | overload 3-arg เรียก 4-arg ด้วย `Integer.MAX_VALUE` |
| `testBracketNullFunctionThrowsIAE` | `function == null` → true |
| `testBracketZeroMaxIterationsThrowsIAE` | `maximumIterations <= 0` → true (ขอบเขต = 0) |
| `testBracketNegativeMaxIterationsThrowsIAE` | `maximumIterations <= 0` → true (ค่าติดลบ) |
| `testBracketInitialLessThanLowerBoundThrowsIAE` | `initial < lowerBound` → true |
| `testBracketInitialGreaterThanUpperBoundThrowsIAE` | `initial > upperBound` → true |
| `testBracketLowerBoundEqualsUpperBoundThrowsIAE` | `lowerBound >= upperBound` → true (เท่ากัน) |
| `testBracketLowerBoundGreaterThanUpperBoundThrowsIAE` | `lowerBound >= upperBound` → true (มากกว่า) |
| `testBracketSucceedsOnFirstIteration` | loop วนรอบเดียว, `fa*fb < 0` → exit loop ทันที |
| `testBracketSucceedsAfterMultipleIterations` | loop วนหลายรอบก่อน `fa*fb < 0` |
| `testBracketInitialEqualsLowerBoundEdgeCase` | boundary: `initial == lowerBound` (เงื่อนไข false) |
| `testBracketInitialEqualsUpperBoundEdgeCase` | boundary: `initial == upperBound` (เงื่อนไข false) |
| `testBracketThrowsConvergenceExceptionWhenBoundsExhausted` | loop จบจาก `(a>lowerBound \|\| b<upperBound)==false`, `fa*fb>=0` → throw |
| `testBracketThrowsConvergenceExceptionWhenMaxIterationsReached` | loop จบจาก `numIterations < maximumIterations == false` |
| `testBracketPropagatesFunctionEvaluationException` | exception propagation จาก `function.value()` ภายใน loop |
| `testSolvePropagatesFunctionEvaluationException` | exception propagation ผ่าน `solve()` |
| `testMidpoint*` (4 เมธอด) | ตรวจความถูกต้องของการคำนวณ `midpoint()` ในกรณีต่าง ๆ |

**หมายเหตุสำคัญ:** การทดสอบ `solve()` ขึ้นกับ default solver ที่สร้างจาก `UnivariateRealSolverFactory` ซึ่งเป็น dependency ภายนอกที่ไม่ได้แสดงใน source ที่ให้มา — ใช้ delta ที่หลวมพอสมควรเพื่อไม่เดา behavior ภายในของ solver นั้น