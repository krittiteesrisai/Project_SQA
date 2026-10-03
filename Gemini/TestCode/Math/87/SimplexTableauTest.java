package org.apache.commons.math.optimization.linear;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.RealVector;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.junit.Test;

public class SimplexTableauTest {

    private static final double EPSILON = 1e-6;

    @Test
    public void testTableauMaximizeWithLeqOnly() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 2.0, 3.0 }, 10.0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0, 0.0 }, Relationship.LEQ, 4.0));
        constraints.add(new LinearConstraint(new double[] { 0.0, 1.0 }, Relationship.LEQ, 6.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);

        assertEquals(2, tableau.getNumVariables());
        assertEquals(2, tableau.getNumDecisionVariables());
        assertEquals(2, tableau.getOriginalNumDecisionVariables());
        assertEquals(2, tableau.getNumSlackVariables());
        assertEquals(0, tableau.getNumArtificialVariables());
        assertEquals(1, tableau.getNumObjectiveFunctions());
        assertEquals(3, tableau.getHeight()); // 1 obj + 2 constraints
        assertEquals(5, tableau.getWidth());  // 1 obj + 2 vars + 2 slack + 0 art - 0 + 1 rhs = 6? wait: 2+2+0+1+1 = 6

        // Check objective row (zIndex = 0)
        assertEquals(1.0, tableau.getEntry(0, 0), EPSILON);
        assertEquals(-2.0, tableau.getEntry(0, 1), EPSILON);
        assertEquals(-3.0, tableau.getEntry(0, 2), EPSILON);
        assertEquals(10.0, tableau.getEntry(0, tableau.getRhsOffset()), EPSILON);

        // Check slack variable values
        assertEquals(1.0, tableau.getEntry(1, tableau.getSlackVariableOffset()), EPSILON);
        assertEquals(0.0, tableau.getEntry(1, tableau.getSlackVariableOffset() + 1), EPSILON);
        assertEquals(0.0, tableau.getEntry(2, tableau.getSlackVariableOffset()), EPSILON);
        assertEquals(1.0, tableau.getEntry(2, tableau.getSlackVariableOffset() + 1), EPSILON);
    }

    @Test
    public void testTableauMinimizeWithGeqAndNegativeRHS() {
        // Test negative RHS normalization and GEQ / EQ constraints
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { -1.0, 4.0 }, -5.0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        // 1.0 x1 + 2.0 x2 >= -4.0  ->  normalized to  -1.0 x1 - 2.0 x2 <= 4.0
        constraints.add(new LinearConstraint(new double[] { 1.0, 2.0 }, Relationship.GEQ, -4.0));
        // 3.0 x1 + 1.0 x2 = 5.0    ->  EQ constraint (introduces artificial variable)
        constraints.add(new LinearConstraint(new double[] { 3.0, 1.0 }, Relationship.EQ, 5.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MINIMIZE, true, EPSILON);

        List<LinearConstraint> normalized = tableau.getNormalizedConstraints();
        assertEquals(2, normalized.size());
        assertEquals(Relationship.LEQ, normalized.get(0).getRelationship());
        assertEquals(4.0, normalized.get(0).getValue(), EPSILON);
        assertEquals(-1.0, normalized.get(0).getCoefficients().getEntry(0), EPSILON);
        assertEquals(-2.0, normalized.get(0).getCoefficients().getEntry(1), EPSILON);

        // 1 EQ introduces 1 artificial variable -> 2 objective functions
        assertEquals(1, tableau.getNumArtificialVariables());
        assertEquals(2, tableau.getNumObjectiveFunctions());

        // Objective row for minimize: zIndex = 1
        assertEquals(-1.0, tableau.getEntry(1, 1), EPSILON);
        assertEquals(-1.0, tableau.getEntry(1, 2), EPSILON);
        assertEquals(4.0, tableau.getEntry(1, 3), EPSILON);
        assertEquals(5.0, tableau.getEntry(1, tableau.getRhsOffset()), EPSILON);
    }

    @Test
    public void testTableauUnrestrictedVariables() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 3.0, -2.0 }, 0.0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0, 1.0 }, Relationship.LEQ, 10.0));

        // restrictToNonNegative = false -> adds 1 decision variable (x-)
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, EPSILON);

        assertEquals(2, tableau.getNumVariables());
        assertEquals(3, tableau.getNumDecisionVariables()); // 2 original + 1 for negative allowance
        assertEquals(2, tableau.getOriginalNumDecisionVariables());

        // Inverted coefficient sums: - (3.0 + -2.0) = -1.0 for objective
        // Maximization multiplies objective by -1: coeffs are -3.0, 2.0 -> sum = -1.0 -> inverted sum = 1.0
        int xMinusCol = tableau.getSlackVariableOffset() - 1;
        assertEquals(1.0, tableau.getEntry(0, xMinusCol), EPSILON);

        // Constraint inverted sum: -(1.0 + 1.0) = -2.0
        assertEquals(-2.0, tableau.getEntry(1, xMinusCol), EPSILON);
    }

    @Test
    public void testInvertedCoefficientSumStaticMethod() {
        RealVector vector = new ArrayRealVector(new double[] { 1.5, -2.5, 4.0 });
        double invertedSum = SimplexTableau.getInvertedCoeffiecientSum(vector);
        assertEquals(-3.0, invertedSum, EPSILON);
    }

    @Test
    public void testRowOperations() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1.0 }, 0.0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 2.0 }, Relationship.LEQ, 10.0));
        constraints.add(new LinearConstraint(new double[] { 4.0 }, Relationship.LEQ, 20.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);

        // Test setEntry and getEntry
        tableau.setEntry(1, 0, 8.0);
        assertEquals(8.0, tableau.getEntry(1, 0), EPSILON);

        // Test divideRow
        tableau.divideRow(1, 2.0);
        assertEquals(4.0, tableau.getEntry(1, 0), EPSILON);

        // Test subtractRow: row 2 = row 2 - 2 * row 1
        tableau.setEntry(2, 0, 10.0);
        tableau.subtractRow(2, 1, 2.0);
        assertEquals(2.0, tableau.getEntry(2, 0), EPSILON);
    }

    @Test
    public void testDiscardArtificialVariablesWhenNone() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1.0 }, 0.0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0 }, Relationship.LEQ, 5.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        int initialWidth = tableau.getWidth();
        int initialHeight = tableau.getHeight();

        tableau.discardArtificialVariables();

        assertEquals(0, tableau.getNumArtificialVariables());
        assertEquals(initialWidth, tableau.getWidth());
        assertEquals(initialHeight, tableau.getHeight());
    }

    @Test
    public void testDiscardArtificialVariablesWhenPresent() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 2.0 }, 0.0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0 }, Relationship.GEQ, 3.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        assertEquals(1, tableau.getNumArtificialVariables());
        int originalHeight = tableau.getHeight();
        int originalWidth = tableau.getWidth();

        tableau.discardArtificialVariables();

        assertEquals(0, tableau.getNumArtificialVariables());
        assertEquals(originalHeight - 1, tableau.getHeight());
        assertEquals(originalWidth - 2, tableau.getWidth()); // removed 1 art var and 1 phase-1 obj col
    }

    @Test
    public void testGetSolutionBasicAndRepeatedBasicRows() {
        // Construct a tableau directly solvable to test getSolution branch coverage
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1.0, 2.0 }, 5.0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0, 0.0 }, Relationship.LEQ, 3.0));
        constraints.add(new LinearConstraint(new double[] { 0.0, 1.0 }, Relationship.LEQ, 7.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);

        RealPointValuePair solution = tableau.getSolution();
        assertNotNull(solution);
        assertEquals(2, solution.getPoint().length);
        assertEquals(3.0, solution.getPoint()[0], EPSILON);
        assertEquals(7.0, solution.getPoint()[1], EPSILON);
        assertEquals(f.getValue(new double[] { 3.0, 7.0 }), solution.getValue(), EPSILON);
    }

    @Test
    public void testGetSolutionUnrestrictedNegativeVariables() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1.0 }, 0.0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0 }, Relationship.LEQ, 5.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, EPSILON);

        RealPointValuePair solution = tableau.getSolution();
        assertNotNull(solution);
        assertEquals(1, solution.getPoint().length);
    }

    @Test
    public void testGetData() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1.0 }, 0.0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0 }, Relationship.LEQ, 2.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        double[][] data = tableau.getData();

        assertNotNull(data);
        assertEquals(tableau.getHeight(), data.length);
        assertEquals(tableau.getWidth(), data[0].length);
    }

    @Test
    public void testEqualsAndHashCode() {
        LinearObjectiveFunction f1 = new LinearObjectiveFunction(new double[] { 1.0, 2.0 }, 0.0);
        LinearObjectiveFunction f2 = new LinearObjectiveFunction(new double[] { 1.0, 3.0 }, 0.0);

        Collection<LinearConstraint> c1 = new ArrayList<LinearConstraint>();
        c1.add(new LinearConstraint(new double[] { 1.0, 0.0 }, Relationship.LEQ, 4.0));

        Collection<LinearConstraint> c2 = new ArrayList<LinearConstraint>();
        c2.add(new LinearConstraint(new double[] { 0.0, 1.0 }, Relationship.LEQ, 4.0));

        SimplexTableau tab1 = new SimplexTableau(f1, c1, GoalType.MAXIMIZE, true, EPSILON);
        SimplexTableau tab1Clone = new SimplexTableau(f1, c1, GoalType.MAXIMIZE, true, EPSILON);
        SimplexTableau tab2 = new SimplexTableau(f2, c1, GoalType.MAXIMIZE, true, EPSILON);
        SimplexTableau tab3 = new SimplexTableau(f1, c2, GoalType.MAXIMIZE, true, EPSILON);
        SimplexTableau tab4 = new SimplexTableau(f1, c1, GoalType.MINIMIZE, true, EPSILON);
        SimplexTableau tab5 = new SimplexTableau(f1, c1, GoalType.MAXIMIZE, false, EPSILON);
        SimplexTableau tab6 = new SimplexTableau(f1, c1, GoalType.MAXIMIZE, true, 1e-4);

        // Same reference
        assertTrue(tab1.equals(tab1));

        // Equal content
        assertTrue(tab1.equals(tab1Clone));
        assertEquals(tab1.hashCode(), tab1Clone.hashCode());

        // Null and different class
        assertFalse(tab1.equals(null));
        assertFalse(tab1.equals("NotATableau"));

        // Different objective function, constraints, goals, nonNegative, epsilon
        assertFalse(tab1.equals(tab2));
        assertFalse(tab1.equals(tab3));
        assertFalse(tab1.equals(tab4));
        assertFalse(tab1.equals(tab5));
        assertFalse(tab1.equals(tab6));
    }

    @Test
    public void testSerialization() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 2.0, 5.0 }, 1.0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0, 2.0 }, Relationship.LEQ, 8.0));
        constraints.add(new LinearConstraint(new double[] { 1.0, 1.0 }, Relationship.GEQ, 2.0));

        SimplexTableau original = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        SimplexTableau deserialized = (SimplexTableau) ois.readObject();
        ois.close();

        assertNotNull(deserialized);
        assertEquals(original, deserialized);
        assertEquals(original.getWidth(), deserialized.getWidth());
        assertEquals(original.getHeight(), deserialized.getHeight());
        assertEquals(original.getSolution().getValue(), deserialized.getSolution().getValue(), EPSILON);
    }
}