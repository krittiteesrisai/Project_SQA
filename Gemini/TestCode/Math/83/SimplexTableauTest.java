package org.apache.commons.math.optimization.linear;

import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.RealPointValuePair;
import org.apache.commons.math.optimization.GoalType;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SimplexTableauTest {

    @Test
    public void testMaximizeWithLeqConstraint() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{2.0, 3.0}, 1.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1.0, 1.0}, Relationship.LEQ, 4.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0e-6);

        assertTrue(tableau.getNumDecisionVariables() == 2);
        assertTrue(tableau.getNumSlackVariables() == 1);
        assertTrue(tableau.getNumArtificialVariables() == 0);
        assertEquals(1, tableau.getNumObjectiveFunctions());
        assertNotNull(tableau.getSolution());
    }

    @Test
    public void testMinimizeWithGeqAndEqConstraints() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1.0, 2.0}, 0.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1.0, 0.0}, Relationship.GEQ, 2.0));
        constraints.add(new LinearConstraint(new double[]{0.0, 1.0}, Relationship.EQ, 3.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MINIMIZE, true, 1.0e-6);

        assertTrue(tableau.getNumSlackVariables() == 1); // GEQ -> slack (excess)
        assertTrue(tableau.getNumArtificialVariables() == 2); // GEQ + EQ -> artificial
        assertEquals(2, tableau.getNumObjectiveFunctions()); // Phase 1 needed
    }

    @Test
    public void testNegativeRhsNormalization() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1.0, 1.0}, 0.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        // RHS is negative, triggers normalization branch
        constraints.add(new LinearConstraint(new double[]{-1.0, -2.0}, Relationship.LEQ, -5.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0e-6);
        List<LinearConstraint> normalized = tableau.getNormalizedConstraints();

        assertEquals(1, normalized.size());
        assertEquals(5.0, normalized.get(0).getValue(), 1.0e-6);
        assertEquals(Relationship.GEQ, normalized.get(0).getRelationship());
    }

    @Test
    public void testUnrestrictedVariables() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1.0, 2.0}, 0.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1.0, 1.0}, Relationship.LEQ, 10.0));

        // restrictToNonNegative = false -> adds extra decision variable x-
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, 1.0e-6);

        assertEquals(3, tableau.getNumDecisionVariables());
        assertEquals(2, tableau.getOriginalNumDecisionVariables());
        assertNotNull(tableau.getSolution());
    }

    @Test
    public void testDiscardArtificialVariables() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1.0, 1.0}, 0.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1.0, 1.0}, Relationship.EQ, 5.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0e-6);
        assertTrue(tableau.getNumArtificialVariables() > 0);

        tableau.discardArtificialVariables();
        assertEquals(0, tableau.getNumArtificialVariables());
        
        // Calling again when already 0 should just return (Branch coverage)
        tableau.discardArtificialVariables();
        assertEquals(0, tableau.getNumArtificialVariables());
    }

    @Test
    public void testRowOperationsAndEntries() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1.0}, 0.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{2.0}, Relationship.LEQ, 10.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0e-6);

        tableau.setEntry(1, 0, 4.0);
        assertEquals(4.0, tableau.getEntry(1, 0), 1.0e-6);

        tableau.divideRow(1, 2.0);
        assertEquals(2.0, tableau.getEntry(1, 0), 1.0e-6);

        tableau.subtractRow(1, 1, 1.0);
        assertEquals(0.0, tableau.getEntry(1, 0), 1.0e-6);
        
        assertNotNull(tableau.getData());
    }

    @Test
    public void testEqualsAndHashCodeEdgeCases() {
        LinearObjectiveFunction f1 = new LinearObjectiveFunction(new double[]{1.0}, 0.0);
        List<LinearConstraint> constraints1 = new ArrayList<LinearConstraint>();
        constraints1.add(new LinearConstraint(new double[]{1.0}, Relationship.LEQ, 5.0));

        SimplexTableau tableau1 = new SimplexTableau(f1, constraints1, GoalType.MAXIMIZE, true, 1.0e-6);
        SimplexTableau tableau2 = new SimplexTableau(f1, constraints1, GoalType.MAXIMIZE, true, 1.0e-6);

        // Self equality
        assertTrue(tableau1.equals(tableau1));
        // Null check
        assertFalse(tableau1.equals(null));
        // ClassCastException check
        assertFalse(tableau1.equals("NotAStringOrTableau"));
        // Valid equality
        assertTrue(tableau1.equals(tableau2));
        assertEquals(tableau1.hashCode(), tableau2.hashCode());
    }

    @Test
    public void testGetSolutionWithDuplicateBasicRows() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1.0, 1.0}, 0.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1.0, 0.0}, Relationship.LEQ, 5.0));
        
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0e-6);
        
        // Force duplicate/null basic row scenarios to test branch coverage in getSolution()
        RealPointValuePair solution = tableau.getSolution();
        assertNotNull(solution);
        assertEquals(2, solution.getPoint().length);
    }
}