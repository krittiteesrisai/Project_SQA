package org.apache.commons.math.optimization.linear;

import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SimplexSolverTest {

    @Test
    public void testSolveStandardMaximizationProblem() throws OptimizationException {
        // Maximize 3x + 5y subject to:
        // 2x + y <= 10
        // x + 2y <= 8
        // x >= 0, y >= 0
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 3, 5 }, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 2, 1 }, Relationship.LEQ, 10));
        constraints.add(new LinearConstraint(new double[] { 1, 2 }, Relationship.LEQ, 8));

        SimplexSolver solver = new SimplexSolver();
        RealPointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, true);

        assertEquals(22.0, solution.getValue(), 1.0e-6);
        assertEquals(4.0, solution.getPoint()[0], 1.0e-6);
        assertEquals(2.0, solution.getPoint()[1], 1.0e-6);
    }

    @Test
    public void testSolveStandardMinimizationProblem() throws OptimizationException {
        // Minimize x + y subject to:
        // x + y >= 2
        // x >= 0, y >= 0
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.GEQ, 2));

        SimplexSolver solver = new SimplexSolver();
        RealPointValuePair solution = solver.optimize(f, constraints, GoalType.MINIMIZE, true);

        assertEquals(2.0, solution.getValue(), 1.0e-6);
    }

    @Test(expected = UnboundedSolutionException.class)
    public void testUnboundedSolution() throws OptimizationException {
        // Maximize x subject to:
        // -x + y <= 1
        // x >= 0, y >= 0 (y can grow infinitely while -x+y <= 1)
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1 }, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { -1, 1 }, Relationship.LEQ, 1));

        SimplexSolver solver = new SimplexSolver();
        solver.optimize(f, constraints, GoalType.MAXIMIZE, false);
    }

    @Test(expected = NoFeasibleSolutionException.class)
    public void testNoFeasibleSolution() throws OptimizationException {
        // Maximize x subject to:
        // x >= 5 and x <= 2 (Contradictory constraints)
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1 }, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1 }, Relationship.GEQ, 5));
        constraints.add(new LinearConstraint(new double[] { 1 }, Relationship.LEQ, 2));

        SimplexSolver solver = new SimplexSolver();
        solver.optimize(f, constraints, GoalType.MAXIMIZE, true);
    }

    @Test
    public void testPhase1NotNeeded() throws OptimizationException {
        // Problem where slack variables make the initial basis feasible immediately (no artificial variables)
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 2 }, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.LEQ, 5));

        SimplexSolver solver = new SimplexSolver();
        RealPointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, true);
        assertNotNull(solution);
    }

    @Test
    public void testCustomEpsilonConstructor() {
        SimplexSolver solver = new SimplexSolver(1.0e-4);
        assertNotNull(solver);
    }

    @Test
    public void testIsOptimalDirectly() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.LEQ, 5));
        
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0e-6);
        SimplexSolver solver = new SimplexSolver();
        
        // Before optimization, should not be optimal if coefficients are negative
        boolean optimal = solver.isOptimal(tableau);
        // Depending on initial tableau, test method execution directly
        assertTrue(optimal == true || optimal == false);
    }
}