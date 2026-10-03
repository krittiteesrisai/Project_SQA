package org.apache.commons.math3.optimization.linear;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.junit.Assert;
import org.junit.Test;

public class SimplexTableauTest {

    private static final double EPSILON = 1e-6;
    private static final int MAX_ULPS = 10;

    @Test
    public void testConstructorMaximizeWithNonNegativeAndAllRelationshipTypes() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{2, 3}, 5);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 4));
        constraints.add(new LinearConstraint(new double[]{1, 2}, Relationship.GEQ, 2));
        constraints.add(new LinearConstraint(new double[]{2, 1}, Relationship.EQ, 3));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON, MAX_ULPS);

        Assert.assertEquals(2, tableau.getNumObjectiveFunctions());
        Assert.assertEquals(2, tableau.getNumDecisionVariables());
        Assert.assertEquals(2, tableau.getOriginalNumDecisionVariables());
        Assert.assertEquals(2, tableau.getNumSlackVariables()); // 1 LEQ + 1 GEQ
        Assert.assertEquals(2, tableau.getNumArtificialVariables()); // 1 GEQ + 1 EQ

        // Check Dimensions: height = 2 obj + 3 constraints = 5
        // width = 2 vars + 2 slack + 2 artificial + 2 obj + 1 RHS = 9
        Assert.assertEquals(5, tableau.getHeight());
        Assert.assertEquals(9, tableau.getWidth());
        Assert.assertNotNull(tableau.getData());
    }

    @Test
    public void testConstructorMinimizeWithNegativeAllowedAndNegativeRhsConstraint() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{-1, 4}, -10);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        // Negative RHS should be normalized to: -2*x0 - 1*x1 >= 5
        constraints.add(new LinearConstraint(new double[]{2, 1}, Relationship.LEQ, -5));

        // Using default maxUlps constructor
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MINIMIZE, false, EPSILON);

        Assert.assertEquals(3, tableau.getNumDecisionVariables()); // 2 + 1 (for negative var)
        Assert.assertEquals(1, tableau.getNumSlackVariables()); // Normalized to GEQ
        Assert.assertEquals(1, tableau.getNumArtificialVariables()); // Normalized to GEQ
        Assert.assertEquals(2, tableau.getNumObjectiveFunctions());

        // Verify normalized constraint
        LinearConstraint normalized = tableau.normalizeConstraints(constraints).get(0);
        Assert.assertEquals(5.0, normalized.getValue(), 1e-9);
        Assert.assertEquals(Relationship.GEQ, normalized.getRelationship());
        Assert.assertEquals(-2.0, normalized.getCoefficients().getEntry(0), 1e-9);
        Assert.assertEquals(-1.0, normalized.getCoefficients().getEntry(1), 1e-9);
    }

    @Test
    public void testInvertedCoefficientSum() {
        ArrayRealVector vec = new ArrayRealVector(new double[]{1.5, -2.5, 3.0});
        double sum = SimplexTableau.getInvertedCoefficientSum(vec);
        // sum = -(1.5 - 2.5 + 3.0) = -2.0
        Assert.assertEquals(-2.0, sum, 1e-9);
    }

    @Test
    public void testGetBasicRowVariations() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 2));
        constraints.add(new LinearConstraint(new double[]{0, 1}, Relationship.LEQ, 3));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);

        // Modify entries directly to test getBasicRow branches
        int col = tableau.getSlackVariableOffset(); // Slack variable for row 1

        // Scenario 1: Exactly one 1.0, all others 0.0 -> valid basic row
        tableau.setEntry(0, col, 0.0);
        tableau.setEntry(1, col, 1.0);
        tableau.setEntry(2, col, 0.0);
        Assert.assertEquals(Integer.valueOf(1), tableau.getBasicRow(col));

        // Scenario 2: Two 1.0 entries -> return null
        tableau.setEntry(2, col, 1.0);
        Assert.assertNull(tableau.getBasicRow(col));

        // Scenario 3: Non-zero and non-one value -> return null
        tableau.setEntry(2, col, 0.5);
        Assert.assertNull(tableau.getBasicRow(col));

        // Scenario 4: All zeros -> return null
        tableau.setEntry(0, col, 0.0);
        tableau.setEntry(1, col, 0.0);
        tableau.setEntry(2, col, 0.0);
        Assert.assertNull(tableau.getBasicRow(col));
    }

    @Test
    public void testDropPhase1ObjectiveWhenNumObjectiveFunctionsIsOne() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 2}, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 5));

        // LEQ only -> numArtificialVariables = 0 -> getNumObjectiveFunctions() = 1
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        int initialHeight = tableau.getHeight();
        int initialWidth = tableau.getWidth();

        tableau.dropPhase1Objective();

        // Must early-return without modifying tableau dimensions
        Assert.assertEquals(initialHeight, tableau.getHeight());
        Assert.assertEquals(initialWidth, tableau.getWidth());
    }

    @Test
    public void testDropPhase1ObjectiveWithPositiveCostAndNonBasicArtificialVariables() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{2, -1}, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.EQ, 4));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        Assert.assertEquals(2, tableau.getNumObjectiveFunctions());

        // Set entry in row 0 for a decision variable to be strictly positive to trigger positive cost drop
        int varCol = tableau.getNumObjectiveFunctions(); // x0
        tableau.setEntry(0, varCol, 2.5);

        tableau.dropPhase1Objective();

        Assert.assertEquals(1, tableau.getNumObjectiveFunctions());
        Assert.assertEquals(0, tableau.getNumArtificialVariables());
    }

    @Test
    public void testIsOptimal() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 2));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);

        // Put a negative entry in Row 0 -> not optimal
        tableau.setEntry(0, tableau.getNumObjectiveFunctions(), -2.0);
        Assert.assertFalse(tableau.isOptimal());

        // Set all entries in Row 0 to non-negative -> optimal
        for (int j = 0; j < tableau.getWidth(); j++) {
            tableau.setEntry(0, j, 1.0);
        }
        Assert.assertTrue(tableau.isOptimal());
    }

    @Test
    public void testRowOperations() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 2}, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{2, 4}, Relationship.LEQ, 8));
        constraints.add(new LinearConstraint(new double[]{1, 3}, Relationship.LEQ, 6));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);

        // Test divideRow
        tableau.setEntry(1, 0, 4.0);
        tableau.divideRow(1, 2.0);
        Assert.assertEquals(2.0, tableau.getEntry(1, 0), 1e-9);

        // Test subtractRow
        tableau.setEntry(2, 0, 5.0);
        // row2 = row2 - (2.0 * row1) -> 5.0 - (2.0 * 2.0) = 1.0
        tableau.subtractRow(2, 1, 2.0);
        Assert.assertEquals(1.0, tableau.getEntry(2, 0), 1e-9);
    }

    @Test
    public void testGetSolutionWithVariousBasicRowConditions() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{3, 5}, 10);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 7));
        constraints.add(new LinearConstraint(new double[]{0, 1}, Relationship.LEQ, 8));

        // Case 1: restrictToNonNegative = true
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);

        // Set x0 as basic in row 1 with RHS = 7
        int x0Col = tableau.getNumObjectiveFunctions();
        tableau.setEntry(0, x0Col, 0.0);
        tableau.setEntry(1, x0Col, 1.0);
        tableau.setEntry(2, x0Col, 0.0);

        // Set x1 as basic in row 0 (objective row) -> branch where basicRow == 0
        int x1Col = tableau.getNumObjectiveFunctions() + 1;
        tableau.setEntry(0, x1Col, 1.0);
        tableau.setEntry(1, x1Col, 0.0);
        tableau.setEntry(2, x1Col, 0.0);

        PointValuePair solution = tableau.getSolution();
        double[] point = solution.getPoint();
        Assert.assertEquals(7.0, point[0], 1e-9);
        Assert.assertEquals(0.0, point[1], 1e-9); // basicRow == 0 sets coefficient to 0

        // Case 2: Duplicate basic row in basicRows set
        tableau.setEntry(0, x1Col, 0.0);
        tableau.setEntry(1, x1Col, 1.0); // Both x0 and x1 are basic in row 1
        tableau.setEntry(2, x1Col, 0.0);

        PointValuePair dupSolution = tableau.getSolution();
        Assert.assertEquals(7.0, dupSolution.getPoint()[0], 1e-9);
        Assert.assertEquals(0.0, dupSolution.getPoint()[1], 1e-9);

        // Case 3: restrictToNonNegative = false with basic x- column
        SimplexTableau tableauNeg = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, EPSILON);
        int negVarCol = tableauNeg.getSlackVariableOffset() - 1;
        // Make negativeVarColumn basic in row 1 with RHS = 2.0
        tableauNeg.setEntry(0, negVarCol, 0.0);
        tableauNeg.setEntry(1, negVarCol, 1.0);
        tableauNeg.setEntry(2, negVarCol, 0.0);
        tableauNeg.setEntry(1, tableauNeg.getRhsOffset(), 2.0);

        PointValuePair negSolution = tableauNeg.getSolution();
        Assert.assertNotNull(negSolution);
    }

    @Test
    public void testEqualsAndHashCode() {
        LinearObjectiveFunction f1 = new LinearObjectiveFunction(new double[]{1, 2}, 0);
        LinearObjectiveFunction f2 = new LinearObjectiveFunction(new double[]{2, 3}, 0);
        List<LinearConstraint> c1 = Collections.singletonList(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 1));
        List<LinearConstraint> c2 = Collections.singletonList(new LinearConstraint(new double[]{2, 2}, Relationship.LEQ, 2));

        SimplexTableau t1 = new SimplexTableau(f1, c1, GoalType.MAXIMIZE, true, EPSILON, MAX_ULPS);
        SimplexTableau t1Clone = new SimplexTableau(f1, c1, GoalType.MAXIMIZE, true, EPSILON, MAX_ULPS);
        SimplexTableau t2 = new SimplexTableau(f2, c2, GoalType.MAXIMIZE, true, EPSILON, MAX_ULPS);

        // Reflexive
        Assert.assertTrue(t1.equals(t1));
        // Symmetric & Equal
        Assert.assertTrue(t1.equals(t1Clone));
        Assert.assertEquals(t1.hashCode(), t1Clone.hashCode());

        // Null and different object
        Assert.assertFalse(t1.equals(null));
        Assert.assertFalse(t1.equals("Not a Tableau"));

        // Different instances
        Assert.assertFalse(t1.equals(t2));
    }

    @Test
    public void testSerialization() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 2}, 3);
        List<LinearConstraint> constraints = Arrays.asList(
                new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 4),
                new LinearConstraint(new double[]{0, 1}, Relationship.GEQ, 1)
        );

        SimplexTableau original = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, EPSILON, MAX_ULPS);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        SimplexTableau deserialized = (SimplexTableau) ois.readObject();
        ois.close();

        Assert.assertEquals(original, deserialized);
        Assert.assertEquals(original.getWidth(), deserialized.getWidth());
        Assert.assertEquals(original.getHeight(), deserialized.getHeight());
        Assert.assertEquals(original.getEntry(0, 0), deserialized.getEntry(0, 0), 1e-9);
    }
}