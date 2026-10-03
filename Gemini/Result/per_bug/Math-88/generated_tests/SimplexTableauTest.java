package org.apache.commons.math.optimization.linear;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.RealVector;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.junit.Assert;
import org.junit.Test;

public class SimplexTableauTest {

    private static final double EPSILON = 1e-6;

    @Test
    public void testMaximizeWithRestrictedNonNegative() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 3, 5 }, 10.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 4));
        constraints.add(new LinearConstraint(new double[] { 0, 2 }, Relationship.LEQ, 12));
        constraints.add(new LinearConstraint(new double[] { 3, 2 }, Relationship.LEQ, 18));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);

        Assert.assertEquals(2, tableau.getNumVariables());
        Assert.assertEquals(2, tableau.getNumDecisionVariables());
        Assert.assertEquals(2, tableau.getOriginalNumDecisionVariables());
        Assert.assertEquals(3, tableau.getNumSlackVariables());
        Assert.assertEquals(0, tableau.getNumArtificialVariables());
        Assert.assertEquals(1, tableau.getNumObjectiveFunctions());
        Assert.assertEquals(4, tableau.getHeight()); // 1 objective + 3 constraints
        Assert.assertEquals(7, tableau.getWidth());  // 1 obj + 2 vars + 3 slacks + 1 RHS

        // Check objective row
        Assert.assertEquals(1.0, tableau.getEntry(0, 0), EPSILON);
        Assert.assertEquals(-3.0, tableau.getEntry(0, 1), EPSILON);
        Assert.assertEquals(-5.0, tableau.getEntry(0, 2), EPSILON);
        Assert.assertEquals(10.0, tableau.getEntry(0, tableau.getRhsOffset()), EPSILON);
    }

    @Test
    public void testMinimizeWithUnrestrictedVariables() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { -2, 1 }, -5.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.LEQ, 10));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MINIMIZE, false, EPSILON);

        Assert.assertEquals(2, tableau.getNumVariables());
        Assert.assertEquals(3, tableau.getNumDecisionVariables()); // 2 + 1 for negative var
        Assert.assertEquals(2, tableau.getOriginalNumDecisionVariables());
        Assert.assertEquals(1, tableau.getNumSlackVariables());
        Assert.assertEquals(0, tableau.getNumArtificialVariables());

        // Objective row check for MINIMIZE
        Assert.assertEquals(-1.0, tableau.getEntry(0, 0), EPSILON);
        Assert.assertEquals(-2.0, tableau.getEntry(0, 1), EPSILON);
        Assert.assertEquals(1.0, tableau.getEntry(0, 2), EPSILON);
        // Inverted coefficient sum for objective: -(-2 + 1) = 1.0
        Assert.assertEquals(1.0, tableau.getEntry(0, 3), EPSILON);
        Assert.assertEquals(5.0, tableau.getEntry(0, tableau.getRhsOffset()), EPSILON);
    }

    @Test
    public void testNegativeConstraintValueNormalization() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 2 }, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        // Constraint with negative RHS: 2x - 3y <= -6  --> -2x + 3y >= 6
        constraints.add(new LinearConstraint(new double[] { 2, -3 }, Relationship.LEQ, -6.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);

        List<LinearConstraint> normalized = tableau.getNormalizedConstraints();
        Assert.assertEquals(1, normalized.size());
        LinearConstraint normConstraint = normalized.get(0);
        Assert.assertEquals(6.0, normConstraint.getValue(), EPSILON);
        Assert.assertEquals(Relationship.GEQ, normConstraint.getRelationship());
        Assert.assertEquals(-2.0, normConstraint.getCoefficients().getEntry(0), EPSILON);
        Assert.assertEquals(3.0, normConstraint.getCoefficients().getEntry(1), EPSILON);

        // Since it's GEQ, it requires 1 slack and 1 artificial variable
        Assert.assertEquals(1, tableau.getNumSlackVariables());
        Assert.assertEquals(1, tableau.getNumArtificialVariables());
        Assert.assertEquals(2, tableau.getNumObjectiveFunctions());
    }

    @Test
    public void testMixedConstraintRelationshipsAndOffsets() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 5)); // +1 slack
        constraints.add(new LinearConstraint(new double[] { 0, 1 }, Relationship.GEQ, 2)); // +1 slack (excess), +1 art
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.EQ, 7));  // +1 art

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);

        Assert.assertEquals(2, tableau.getNumSlackVariables());
        Assert.assertEquals(2, tableau.getNumArtificialVariables());
        Assert.assertEquals(2, tableau.getNumObjectiveFunctions());

        int slackOffset = tableau.getSlackVariableOffset();
        int artOffset = tableau.getArtificialVariableOffset();
        int rhsOffset = tableau.getRhsOffset();

        Assert.assertEquals(4, slackOffset); // 2 obj + 2 vars
        Assert.assertEquals(6, artOffset);   // 4 + 2 slacks
        Assert.assertEquals(8, rhsOffset);   // 6 + 2 art
    }

    @Test
    public void testDiscardArtificialVariables() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 2 }, Relationship.EQ, 4));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);

        Assert.assertEquals(1, tableau.getNumArtificialVariables());
        Assert.assertEquals(2, tableau.getNumObjectiveFunctions());
        int initialHeight = tableau.getHeight();
        int initialWidth = tableau.getWidth();

        tableau.discardArtificialVariables();

        Assert.assertEquals(0, tableau.getNumArtificialVariables());
        Assert.assertEquals(initialHeight - 1, tableau.getHeight());
        Assert.assertEquals(initialWidth - 1 - 1, tableau.getWidth()); // - numArt - 1

        // Discard again when numArtificialVariables == 0 should do nothing
        int heightAfter = tableau.getHeight();
        int widthAfter = tableau.getWidth();
        tableau.discardArtificialVariables();
        Assert.assertEquals(heightAfter, tableau.getHeight());
        Assert.assertEquals(widthAfter, tableau.getWidth());
    }

    @Test
    public void testGetSolutionBasicAndNonBasic() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 2, 3 }, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 4));
        constraints.add(new LinearConstraint(new double[] { 0, 1 }, Relationship.LEQ, 6));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);

        // Manually manipulate tableau to represent an optimal basic state
        // Row 1 represents x0 = 4, Row 2 represents x1 = 6
        RealPointValuePair solution = tableau.getSolution();
        Assert.assertNotNull(solution);
        double[] point = solution.getPoint();
        Assert.assertEquals(2, point.length);
        Assert.assertEquals(4.0, point[0], EPSILON);
        Assert.assertEquals(6.0, point[1], EPSILON);
        Assert.assertEquals(26.0, solution.getValue(), EPSILON); // 2*4 + 3*6 = 26
    }

    @Test
    public void testGetSolutionUnrestrictedVariables() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, -1 }, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 5));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, EPSILON);

        // Check solution generation when restrictToNonNegative is false
        RealPointValuePair solution = tableau.getSolution();
        Assert.assertNotNull(solution);
        Assert.assertEquals(2, solution.getPoint().length);
    }

    @Test
    public void testGetSolutionDegenerateVariablesHandling() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.LEQ, 10));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);

        // When multiple decision variables have entry 1 in the same basic row,
        // subsequent variables should be set to 0.
        tableau.setEntry(1, 1, 1.0); // Var 0 column
        tableau.setEntry(1, 2, 1.0); // Var 1 column
        tableau.setEntry(1, tableau.getRhsOffset(), 10.0);

        RealPointValuePair solution = tableau.getSolution();
        double[] point = solution.getPoint();
        Assert.assertEquals(10.0, point[0], EPSILON);
        Assert.assertEquals(0.0, point[1], EPSILON);
    }

    @Test
    public void testRowOperationsAndSetters() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 2 }, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 2, 4 }, Relationship.LEQ, 8));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);

        tableau.setEntry(1, 1, 10.0);
        Assert.assertEquals(10.0, tableau.getEntry(1, 1), EPSILON);

        tableau.divideRow(1, 2.0);
        Assert.assertEquals(5.0, tableau.getEntry(1, 1), EPSILON);

        // subtractRow(minuendRow, subtrahendRow, multiple)
        // row 0 entry 1 currently is -1.0; subtract 1 * row 1 (which is 5.0) -> -6.0
        tableau.subtractRow(0, 1, 1.0);
        Assert.assertEquals(-6.0, tableau.getEntry(0, 1), EPSILON);

        double[][] data = tableau.getData();
        Assert.assertEquals(tableau.getHeight(), data.length);
        Assert.assertEquals(tableau.getWidth(), data[0].length);
    }

    @Test
    public void testInvertedCoefficientSumHelper() {
        RealVector vector = new ArrayRealVector(new double[] { 2.5, -1.5, 4.0 });
        double sum = SimplexTableau.getInvertedCoeffiecientSum(vector);
        // -(2.5 + (-1.5) + 4.0) = -5.0
        Assert.assertEquals(-5.0, sum, EPSILON);

        RealVector emptyVector = new ArrayRealVector(new double[] {});
        Assert.assertEquals(0.0, SimplexTableau.getInvertedCoeffiecientSum(emptyVector), EPSILON);
    }

    @Test
    public void testEqualsAndHashCodeContract() {
        LinearObjectiveFunction f1 = new LinearObjectiveFunction(new double[] { 1, 2 }, 3);
        LinearObjectiveFunction f2 = new LinearObjectiveFunction(new double[] { 1, 2 }, 3);
        LinearObjectiveFunction f3 = new LinearObjectiveFunction(new double[] { 2, 1 }, 3);

        List<LinearConstraint> c1 = new ArrayList<LinearConstraint>();
        c1.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 4));

        List<LinearConstraint> c2 = new ArrayList<LinearConstraint>();
        c2.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 4));

        List<LinearConstraint> c3 = new ArrayList<LinearConstraint>();
        c3.add(new LinearConstraint(new double[] { 0, 1 }, Relationship.LEQ, 4));

        SimplexTableau t1 = new SimplexTableau(f1, c1, GoalType.MAXIMIZE, true, EPSILON);
        SimplexTableau t2 = new SimplexTableau(f2, c2, GoalType.MAXIMIZE, true, EPSILON);
        SimplexTableau tDifferentObj = new SimplexTableau(f3, c1, GoalType.MAXIMIZE, true, EPSILON);
        SimplexTableau tDifferentConstraints = new SimplexTableau(f1, c3, GoalType.MAXIMIZE, true, EPSILON);
        SimplexTableau tDifferentGoal = new SimplexTableau(f1, c1, GoalType.MINIMIZE, true, EPSILON);
        SimplexTableau tDifferentRestricted = new SimplexTableau(f1, c1, GoalType.MAXIMIZE, false, EPSILON);
        SimplexTableau tDifferentEpsilon = new SimplexTableau(f1, c1, GoalType.MAXIMIZE, true, 1e-4);

        // Reflexivity & standard equality
        Assert.assertTrue(t1.equals(t1));
        Assert.assertTrue(t1.equals(t2));
        Assert.assertEquals(t1.hashCode(), t2.hashCode());

        // Null and different class
        Assert.assertFalse(t1.equals(null));
        Assert.assertFalse(t1.equals("NotATableau"));

        // Field differences
        Assert.assertFalse(t1.equals(tDifferentObj));
        Assert.assertFalse(t1.equals(tDifferentConstraints));
        Assert.assertFalse(t1.equals(tDifferentGoal));
        Assert.assertFalse(t1.equals(tDifferentRestricted));
        Assert.assertFalse(t1.equals(tDifferentEpsilon));
    }

    @Test
    public void testSerialization() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 3, 4 }, 5);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 2 }, Relationship.LEQ, 10));

        SimplexTableau original = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        SimplexTableau deserialized = (SimplexTableau) ois.readObject();
        ois.close();

        Assert.assertNotNull(deserialized);
        Assert.assertEquals(original, deserialized);
        Assert.assertEquals(original.getHeight(), deserialized.getHeight());
        Assert.assertEquals(original.getWidth(), deserialized.getWidth());
        Assert.assertEquals(original.getEntry(0, 1), deserialized.getEntry(0, 1), EPSILON);
    }
}