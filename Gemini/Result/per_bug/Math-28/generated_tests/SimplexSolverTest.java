package org.apache.commons.math3.optimization.linear;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.junit.Assert;
import org.junit.Test;

/**
 * High-coverage unit test suite for SimplexSolver focusing on edge cases,
 * degeneracy, unbounded problems, infeasible problems, and Phase 1 / Phase 2 branches.
 */
public class SimplexSolverTest {

    private static final double EPSILON = 1.0e-6;

    /**
     * Test basic minimization problem (Phase 2 only, single pivot row winner).
     */
    @Test
    public void testStandardMinimizationPhase2Only() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { -2.0, 1.0 }, 0.0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0, 2.0 }, Relationship.LEQ, 6.0));
        constraints.add(new LinearConstraint(new double[] { 3.0, 2.0 }, Relationship.LEQ, 12.0));

        SimplexSolver solver = new SimplexSolver();
        PointValuePair solution = solver.optimize(f, constraints, GoalType.MINIMIZE, true);

        Assert.assertNotNull(solution);
        Assert.assertEquals(4.0, solution.getPoint()[0], EPSILON);
        Assert.assertEquals(0.0, solution.getPoint()[1], EPSILON);
        Assert.assertEquals(-8.0, solution.getValue(), EPSILON);
    }

    /**
     * Test basic maximization problem with custom epsilon and maxUlps constructor.
     */
    @Test
    public void testStandardMaximizationWithCustomConstructor() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 3.0, 5.0 }, 0.0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0, 0.0 }, Relationship.LEQ, 4.0));
        constraints.add(new LinearConstraint(new double[] { 0.0, 2.0 }, Relationship.LEQ, 12.0));
        constraints.add(new LinearConstraint(new double[] { 3.0, 2.0 }, Relationship.LEQ, 18.0));

        SimplexSolver solver = new SimplexSolver(1e-7, 15);
        PointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, true);

        Assert.assertNotNull(solution);
        Assert.assertEquals(2.0, solution.getPoint()[0], EPSILON);
        Assert.assertEquals(6.0, solution.getPoint()[1], EPSILON);
        Assert.assertEquals(36.0, solution.getValue(), EPSILON);
    }

    /**
     * Test Phase 1 execution with equality and GEQ constraints (introduces artificial variables).
     */
    @Test
    public void testPhase1WithArtificialVariables() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 2.0, 3.0, 1.0 }, 0.0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0, 1.0, 1.0 }, Relationship.EQ, 10.0));
        constraints.add(new LinearConstraint(new double[] { 2.0, 1.0, 0.0 }, Relationship.GEQ, 4.0));

        SimplexSolver solver = new SimplexSolver();
        PointValuePair solution = solver.optimize(f, constraints, GoalType.MINIMIZE, true);

        Assert.assertNotNull(solution);
        Assert.assertEquals(0.0, solution.getPoint()[0], EPSILON);
        Assert.assertEquals(0.0, solution.getPoint()[1], EPSILON);
        Assert.assertEquals(10.0, solution.getPoint()[2], EPSILON);
        Assert.assertEquals(10.0, solution.getValue(), EPSILON);
    }

    /**
     * Test infeasible problem: Phase 1 objective cannot reach 0.
     * Expects NoFeasibleSolutionException.
     */
    @Test(expected = NoFeasibleSolutionException.class)
    public void testInfeasibleProblem() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1.0, 1.0 }, 0.0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0, 1.0 }, Relationship.LEQ, 2.0));
        constraints.add(new LinearConstraint(new double[] { 1.0, 1.0 }, Relationship.GEQ, 5.0));

        SimplexSolver solver = new SimplexSolver();
        solver.optimize(f, constraints, GoalType.MINIMIZE, true);
    }

    /**
     * Test unbounded problem: pivot row test finds no valid positive entries (pivotRow == null).
     * Expects UnboundedSolutionException.
     */
    @Test(expected = UnboundedSolutionException.class)
    public void testUnboundedProblem() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 2.0, 1.0 }, 0.0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0, -1.0 }, Relationship.LEQ, 10.0));

        SimplexSolver solver = new SimplexSolver();
        solver.optimize(f, constraints, GoalType.MAXIMIZE, true);
    }

    /**
     * Test degeneracy handling where Bland's rule / tie-breaker logic is triggered.
     * Tests Math-828 / Math-28 scenarios with multiple tied rows.
     */
    @Test
    public void testDegeneracyTieBreakingBlandsRule() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 10.0, -57.0, -9.0, -24.0 }, 0.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 0.5, -5.5, -2.5, 9.0 }, Relationship.LEQ, 0.0));
        constraints.add(new LinearConstraint(new double[] { 0.5, -1.5, -0.5, 1.0 }, Relationship.LEQ, 0.0));
        constraints.add(new LinearConstraint(new double[] { 1.0, 0.0, 0.0, 0.0 }, Relationship.LEQ, 1.0));

        SimplexSolver solver = new SimplexSolver();
        PointValuePair solution = solver.optimize(f, constraints, GoalType.MINIMIZE, true);

        Assert.assertNotNull(solution);
        Assert.assertTrue(solution.getValue() <= 0.0);
    }

    /**
     * Test tie-breaking when artificial variables are present in degenerate minimum ratio positions.
     */
    @Test
    public void testDegeneracyWithArtificialVariableTie() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1.0, 1.0 }, 0.0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0, 0.0 }, Relationship.EQ, 0.0));
        constraints.add(new LinearConstraint(new double[] { 0.0, 1.0 }, Relationship.EQ, 0.0));
        constraints.add(new LinearConstraint(new double[] { 1.0, 1.0 }, Relationship.LEQ, 0.0));

        SimplexSolver solver = new SimplexSolver();
        PointValuePair solution = solver.optimize(f, constraints, GoalType.MINIMIZE, true);

        Assert.assertNotNull(solution);
        Assert.assertEquals(0.0, solution.getPoint()[0], EPSILON);
        Assert.assertEquals(0.0, solution.getPoint()[1], EPSILON);
    }

    /**
     * Test optimization allowing negative variables (restrictToNonNegative = false).
     */
    @Test
    public void testAllowNegativeVariables() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1.0, 1.0 }, 0.0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0, 0.0 }, Relationship.GEQ, -5.0));
        constraints.add(new LinearConstraint(new double[] { 0.0, 1.0 }, Relationship.GEQ, -5.0));
        constraints.add(new LinearConstraint(new double[] { 1.0, 1.0 }, Relationship.GEQ, -8.0));

        SimplexSolver solver = new SimplexSolver();
        PointValuePair solution = solver.optimize(f, constraints, GoalType.MINIMIZE, false);

        Assert.assertNotNull(solution);
        Assert.assertEquals(-8.0, solution.getValue(), EPSILON);
    }

    /**
     * Test exceeding max iterations limit.
     * Expects MaxCountExceededException.
     */
    @Test(expected = MaxCountExceededException.class)
    public void testMaxIterationsExceeded() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1.0, 1.0 }, 0.0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0, 0.0 }, Relationship.LEQ, 5.0));
        constraints.add(new LinearConstraint(new double[] { 0.0, 1.0 }, Relationship.LEQ, 5.0));

        SimplexSolver solver = new SimplexSolver();
        solver.setMaxIterations(0);
        solver.optimize(f, constraints, GoalType.MAXIMIZE, true);
    }

    /**
     * Test problem that is already optimal at the initial tableau state.
     */
    @Test
    public void testAlreadyOptimalInitialTableau() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1.0, 2.0 }, 0.0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0, 1.0 }, Relationship.GEQ, 0.0));

        SimplexSolver solver = new SimplexSolver();
        PointValuePair solution = solver.optimize(f, constraints, GoalType.MINIMIZE, true);

        Assert.assertNotNull(solution);
        Assert.assertEquals(0.0, solution.getPoint()[0], EPSILON);
        Assert.assertEquals(0.0, solution.getPoint()[1], EPSILON);
        Assert.assertEquals(0.0, solution.getValue(), EPSILON);
    }

    /**
     * Specific regression case for Math-28 / Math-828 cycling under degeneracy.
     */
    @Test
    public void testMath28CycleModel() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(
            new double[] { 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0 }, 0.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 }, Relationship.LEQ, 1.0));
        constraints.add(new LinearConstraint(new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 }, Relationship.LEQ, 1.0));
        constraints.add(new LinearConstraint(new double[] { 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0 }, Relationship.LEQ, 1.0));
        constraints.add(new LinearConstraint(new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0 }, Relationship.LEQ, 1.0));
        constraints.add(new LinearConstraint(new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0 }, Relationship.LEQ, 1.0));
        constraints.add(new LinearConstraint(new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0 }, Relationship.LEQ, 1.0));
        constraints.add(new LinearConstraint(new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0 }, Relationship.LEQ, 1.0));
        constraints.add(new LinearConstraint(new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0 }, Relationship.LEQ, 1.0));

        SimplexSolver solver = new SimplexSolver();
        PointValuePair solution = solver.optimize(f, constraints, GoalType.MINIMIZE, true);

        Assert.assertNotNull(solution);
        Assert.assertEquals(0.0, solution.getValue(), EPSILON);
    }
}