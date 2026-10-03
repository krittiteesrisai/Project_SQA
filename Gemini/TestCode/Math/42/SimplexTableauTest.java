package org.apache.commons.math.optimization.linear;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.RealVector;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.junit.Assert;
import org.junit.Test;

/**
 * High branch/condition coverage tests for SimplexTableau.
 */
public class SimplexTableauTest {

    private static final double EPSILON = 1e-6;
    private static final int MAX_ULPS = 10;

    @Test
    public void testConstructorsAndDimensionCalculations() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 2, 3 }, 5);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.LEQ, 10)); // slack 1
        constraints.add(new LinearConstraint(new double[] { 1, 2 }, Relationship.GEQ, 4));  // slack 1, art 1
        constraints.add(new LinearConstraint(new double[] { 2, 1 }, Relationship.EQ, 6));   // art 1

        // restrictToNonNegative = true
        SimplexTableau tableau1 = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        Assert.assertEquals(2, tableau1.getOriginalNumDecisionVariables());
        Assert.assertEquals(2, tableau1.getNumDecisionVariables());
        Assert.assertEquals(2, tableau1.getNumSlackVariables());
        Assert.assertEquals(2, tableau1.getNumArtificialVariables());
        Assert.assertEquals(2, tableau1.getNumObjectiveFunctions());
        Assert.assertEquals(5, tableau1.getHeight()); // 2 obj + 3 constraints
        // width = 2 dec + 2 slack + 2 art + 2 obj + 1 rhs = 9
        Assert.assertEquals(9, tableau1.getWidth());

        // restrictToNonNegative = false (should add 1 extra decision variable x-)
        SimplexTableau tableau2 = new SimplexTableau(f, constraints, GoalType.MINIMIZE, false, EPSILON, MAX_ULPS);
        Assert.assertEquals(2, tableau2.getOriginalNumDecisionVariables());
        Assert.assertEquals(3, tableau2.getNumDecisionVariables());
        Assert.assertEquals(2, tableau2.getNumSlackVariables());
        Assert.assertEquals(2, tableau2.getNumArtificialVariables());
        Assert.assertEquals(10, tableau2.getWidth());
    }

    @Test
    public void testNormalizeConstraintsNegativeRHS() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 2 }, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, -1 }, Relationship.LEQ, -5));
        constraints.add(new LinearConstraint(new double[] { 2, 3 }, Relationship.GEQ, -7));
        constraints.add(new LinearConstraint(new double[] { -1, 4 }, Relationship.EQ, -2));
        constraints.add(new LinearConstraint(new double[] { 3, 3 }, Relationship.LEQ, 10));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MINIMIZE, true, EPSILON);
        List<LinearConstraint> normalized = tableau.normalizeConstraints(constraints);

        Assert.assertEquals(4, normalized.size());
        
        // LEQ with -5 -> GEQ with +5, coeffs [-1, 1]
        Assert.assertEquals(5.0, normalized.get(0).getValue(), 1e-12);
        Assert.assertEquals(Relationship.GEQ, normalized.get(0).getRelationship());
        Assert.assertArrayEquals(new double[] { -1, 1 }, normalized.get(0).getCoefficients().toArray(), 1e-12);

        // GEQ with -7 -> LEQ with +7, coeffs [-2, -3]
        Assert.assertEquals(7.0, normalized.get(1).getValue(), 1e-12);
        Assert.assertEquals(Relationship.LEQ, normalized.get(1).getRelationship());
        Assert.assertArrayEquals(new double[] { -2, -3 }, normalized.get(1).getCoefficients().toArray(), 1e-12);

        // EQ with -2 -> EQ with +2, coeffs [1, -4]
        Assert.assertEquals(2.0, normalized.get(2).getValue(), 1e-12);
        Assert.assertEquals(Relationship.EQ, normalized.get(2).getRelationship());
        Assert.assertArrayEquals(new double[] { 1, -4 }, normalized.get(2).getCoefficients().toArray(), 1e-12);

        // Positive RHS unchanged
        Assert.assertEquals(10.0, normalized.get(3).getValue(), 1e-12);
        Assert.assertEquals(Relationship.LEQ, normalized.get(3).getRelationship());
    }

    @Test
    public void testInvertedCoefficientSum() {
        RealVector vec = new ArrayRealVector(new double[] { 1.5, -2.5, 3.0 });
        double sum = SimplexTableau.getInvertedCoefficientSum(vec);
        // sum = -(1.5) - (-2.5) - (3.0) = -2.0
        Assert.assertEquals(-2.0, sum, 1e-12);
    }

    @Test
    public void testTableauCreationMaximizeAndMinimizeNoArtificial() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 3, 5 }, 10);
        List<LinearConstraint> constraints = Collections.singletonList(
                new LinearConstraint(new double[] { 1, 2 }, Relationship.LEQ, 8)
        );

        // Maximize, 1 objective function (no artificial vars)
        SimplexTableau maxTableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        Assert.assertEquals(1, maxTableau.getNumObjectiveFunctions());
        // Z row entry at (0, 0) is 1.0 for maximize
        Assert.assertEquals(1.0, maxTableau.getEntry(0, 0), 1e-12);
        // Objective coefficients multiplied by -1: [-3, -5]
        Assert.assertEquals(-3.0, maxTableau.getEntry(0, 1), 1e-12);
        Assert.assertEquals(-5.0, maxTableau.getEntry(0, 2), 1e-12);
        // RHS on Z row: 10
        Assert.assertEquals(10.0, maxTableau.getEntry(0, maxTableau.getRhsOffset()), 1e-12);

        // Minimize, 1 objective function
        SimplexTableau minTableau = new SimplexTableau(f, constraints, GoalType.MINIMIZE, true, EPSILON);
        // Z row entry at (0, 0) is -1.0 for minimize
        Assert.assertEquals(-1.0, minTableau.getEntry(0, 0), 1e-12);
        // Objective coefficients unmodified: [3, 5]
        Assert.assertEquals(3.0, minTableau.getEntry(0, 1), 1e-12);
        Assert.assertEquals(5.0, minTableau.getEntry(0, 2), 1e-12);
        // RHS on Z row: -10
        Assert.assertEquals(-10.0, minTableau.getEntry(0, minTableau.getRhsOffset()), 1e-12);
    }

    @Test
    public void testGetBasicRow() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        List<LinearConstraint> constraints = Arrays.asList(
                new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 2),
                new LinearConstraint(new double[] { 0, 1 }, Relationship.LEQ, 3)
        );
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);

        // s0 is at index 3, s1 at index 4 (0: Z, 1: x0, 2: x1, 3: s0, 4: s1, 5: RHS)
        // s0 is basic in row 1
        Assert.assertEquals(Integer.valueOf(1), tableau.getBasicRow(3));
        // s1 is basic in row 2
        Assert.assertEquals(Integer.valueOf(2), tableau.getBasicRow(4));
        // x0 (col 1) has entries: row0=-1, row1=1, row2=0 -> not basic, returns null
        Assert.assertNull(tableau.getBasicRow(1));

        // Test non-basic column having multiple 1.0 entries
        tableau.setEntry(1, 1, 1.0);
        tableau.setEntry(2, 1, 1.0);
        tableau.setEntry(0, 1, 0.0);
        Assert.assertNull(tableau.getBasicRow(1));

        // Test non-basic column having arbitrary non-zero/non-one entry
        tableau.setEntry(1, 1, 0.5);
        Assert.assertNull(tableau.getBasicRow(1));
    }

    @Test
    public void testDropPhase1Objective() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 2, -1 }, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.EQ, 4));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MINIMIZE, true, EPSILON);
        Assert.assertEquals(2, tableau.getNumObjectiveFunctions());
        Assert.assertEquals(1, tableau.getNumArtificialVariables());

        // Call dropPhase1Objective
        tableau.dropPhase1Objective();

        Assert.assertEquals(1, tableau.getNumObjectiveFunctions());
        Assert.assertEquals(0, tableau.getNumArtificialVariables());

        // Calling dropPhase1Objective again when numObjectiveFunctions == 1 should simply return without error
        tableau.dropPhase1Objective();
        Assert.assertEquals(1, tableau.getNumObjectiveFunctions());
    }

    @Test
    public void testIsOptimal() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { -2, 3 }, 0);
        List<LinearConstraint> constraints = Collections.singletonList(
                new LinearConstraint(new double[] { 1, 1 }, Relationship.LEQ, 5)
        );

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        // Objective row 0 has coefficients: -(-2) = 2, -(3) = -3
        // Since -3 < 0, isOptimal should be false
        Assert.assertFalse(tableau.isOptimal());

        // Modify row to make all objective entries >= 0
        tableau.setEntry(0, 2, 0.0);
        Assert.assertTrue(tableau.isOptimal());
    }

    @Test
    public void testGetSolutionWithRestrictedAndUnrestrictedVariables() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 3, 2 }, 7);
        List<LinearConstraint> constraints = Arrays.asList(
                new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 4),
                new LinearConstraint(new double[] { 0, 1 }, Relationship.LEQ, 5)
        );

        // Case 1: restrictToNonNegative = true
        SimplexTableau tableau1 = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        RealPointValuePair solution1 = tableau1.getSolution();
        Assert.assertNotNull(solution1);
        Assert.assertEquals(2, solution1.getPoint().length);

        // Case 2: restrictToNonNegative = false
        SimplexTableau tableau2 = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, EPSILON);
        RealPointValuePair solution2 = tableau2.getSolution();
        Assert.assertNotNull(solution2);
        Assert.assertEquals(2, solution2.getPoint().length);
    }

    @Test
    public void testGetSolutionWhenBasicRowsOverlap() {
        // Test scenario where two variables resolve to the same basic row or basicRow == null
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        List<LinearConstraint> constraints = Collections.singletonList(
                new LinearConstraint(new double[] { 1, 1 }, Relationship.LEQ, 10)
        );

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, EPSILON);
        // Explicitly simulate basic columns
        int x0Col = 1;
        int x1Col = 2;
        // Set both x0 and x1 columns to be basic in row 1
        tableau.setEntry(0, x0Col, 0.0);
        tableau.setEntry(1, x0Col, 1.0);
        tableau.setEntry(0, x1Col, 0.0);
        tableau.setEntry(1, x1Col, 1.0);

        RealPointValuePair solution = tableau.getSolution();
        Assert.assertNotNull(solution);
        double[] point = solution.getPoint();
        // First variable gets the value from row 1 (10.0), second gets 0.0
        Assert.assertEquals(10.0, point[0], 1e-12);
        Assert.assertEquals(0.0, point[1], 1e-12);
    }

    @Test
    public void testRowOperations() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        List<LinearConstraint> constraints = Collections.singletonList(
                new LinearConstraint(new double[] { 2, 4 }, Relationship.LEQ, 8)
        );

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        int constraintRow = 1;

        // divideRow
        tableau.divideRow(constraintRow, 2.0);
        Assert.assertEquals(1.0, tableau.getEntry(constraintRow, 1), 1e-12);
        Assert.assertEquals(2.0, tableau.getEntry(constraintRow, 2), 1e-12);
        Assert.assertEquals(4.0, tableau.getEntry(constraintRow, tableau.getRhsOffset()), 1e-12);

        // subtractRow
        tableau.subtractRow(0, constraintRow, 1.0);
        // Objective row was -1.0 at col 1, subtracted 1.0*1.0 => -2.0
        Assert.assertEquals(-2.0, tableau.getEntry(0, 1), 1e-12);
    }

    @Test
    public void testGettersAndOffsets() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 2, 3 }, 0);
        List<LinearConstraint> constraints = Arrays.asList(
                new LinearConstraint(new double[] { 1, 0, 0 }, Relationship.LEQ, 1),
                new LinearConstraint(new double[] { 0, 1, 0 }, Relationship.GEQ, 2)
        );

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, EPSILON);

        // numObjectiveFunctions = 2 (due to GEQ artificial var)
        // numDecisionVariables = 3 + 1 (for x-) = 4
        // numSlackVariables = 2 (1 LEQ, 1 GEQ)
        // numArtificialVariables = 1 (1 GEQ)
        Assert.assertEquals(2, tableau.getNumObjectiveFunctions());
        Assert.assertEquals(6, tableau.getSlackVariableOffset());      // 2 + 4 = 6
        Assert.assertEquals(8, tableau.getArtificialVariableOffset()); // 2 + 4 + 2 = 8
        Assert.assertEquals(9, tableau.getRhsOffset());                // total width - 1 = 10 - 1 = 9

        double[][] data = tableau.getData();
        Assert.assertNotNull(data);
        Assert.assertEquals(tableau.getHeight(), data.length);
        Assert.assertEquals(tableau.getWidth(), data[0].length);
    }

    @Test
    public void testEqualsAndHashCode() {
        LinearObjectiveFunction f1 = new LinearObjectiveFunction(new double[] { 1, 2 }, 0);
        LinearObjectiveFunction f2 = new LinearObjectiveFunction(new double[] { 1, 3 }, 0);
        List<LinearConstraint> c1 = Collections.singletonList(new LinearConstraint(new double[] { 1, 1 }, Relationship.LEQ, 5));
        List<LinearConstraint> c2 = Collections.singletonList(new LinearConstraint(new double[] { 1, 1 }, Relationship.LEQ, 6));

        SimplexTableau t1 = new SimplexTableau(f1, c1, GoalType.MAXIMIZE, true, EPSILON, MAX_ULPS);
        SimplexTableau t1Duplicate = new SimplexTableau(f1, c1, GoalType.MAXIMIZE, true, EPSILON, MAX_ULPS);
        SimplexTableau tDiffF = new SimplexTableau(f2, c1, GoalType.MAXIMIZE, true, EPSILON, MAX_ULPS);
        SimplexTableau tDiffC = new SimplexTableau(f1, c2, GoalType.MAXIMIZE, true, EPSILON, MAX_ULPS);
        SimplexTableau tDiffRestrict = new SimplexTableau(f1, c1, GoalType.MAXIMIZE, false, EPSILON, MAX_ULPS);
        SimplexTableau tDiffEps = new SimplexTableau(f1, c1, GoalType.MAXIMIZE, true, 1e-4, MAX_ULPS);
        SimplexTableau tDiffUlps = new SimplexTableau(f1, c1, GoalType.MAXIMIZE, true, EPSILON, 20);

        // Reflexive
        Assert.assertTrue(t1.equals(t1));

        // Symmetric equal
        Assert.assertTrue(t1.equals(t1Duplicate));
        Assert.assertEquals(t1.hashCode(), t1Duplicate.hashCode());

        // Null and different types
        Assert.assertFalse(t1.equals(null));
        Assert.assertFalse(t1.equals("Not a SimplexTableau"));

        // Differences
        Assert.assertFalse(t1.equals(tDiffF));
        Assert.assertFalse(t1.equals(tDiffC));
        Assert.assertFalse(t1.equals(tDiffRestrict));
        Assert.assertFalse(t1.equals(tDiffEps));
        Assert.assertFalse(t1.equals(tDiffUlps));
    }

    @Test
    public void testSerialization() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 2, 4 }, 1);
        List<LinearConstraint> constraints = Arrays.asList(
                new LinearConstraint(new double[] { 1, 1 }, Relationship.LEQ, 10),
                new LinearConstraint(new double[] { 1, 2 }, Relationship.GEQ, 2)
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
        Assert.assertEquals(original.hashCode(), deserialized.hashCode());
        Assert.assertEquals(original.getWidth(), deserialized.getWidth());
        Assert.assertEquals(original.getHeight(), deserialized.getHeight());
        Assert.assertEquals(original.getEntry(0, 0), deserialized.getEntry(0, 0), 1e-12);
    }
}