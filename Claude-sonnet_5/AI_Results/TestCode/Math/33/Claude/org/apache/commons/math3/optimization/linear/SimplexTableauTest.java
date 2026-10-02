package org.apache.commons.math3.optimization.linear;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.junit.Test;

/**
 * JUnit4 test suite for {@link SimplexTableau} (Defects4J Math-33b).
 * Target class เป็น package-private -> test class ต้องอยู่ package เดียวกัน
 */
public class SimplexTableauTest {

    private static final double EPS = 1e-10;

    // ---------- Helper builders ----------

    /** maximize x1+x2 subject to x1<=2, x2<=3 (ไม่มี artificial variable) */
    private SimplexTableau createLeqTableau(boolean restrict) {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1, 1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {1, 0}, Relationship.LEQ, 2));
        constraints.add(new LinearConstraint(new double[] {0, 1}, Relationship.LEQ, 3));
        return new SimplexTableau(f, constraints, GoalType.MAXIMIZE, restrict, EPS);
    }

    /** มี GEQ constraint -> ต้องสร้าง artificial variable (2-phase) */
    private SimplexTableau createGeqTableau(boolean restrict) {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1, 1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {1, 0}, Relationship.GEQ, 2));
        constraints.add(new LinearConstraint(new double[] {0, 1}, Relationship.LEQ, 3));
        return new SimplexTableau(f, constraints, GoalType.MAXIMIZE, restrict, EPS);
    }

    /** มี EQ constraint -> ต้องสร้าง artificial variable, ไม่มี slack */
    private SimplexTableau createEqTableau(boolean restrict) {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1, 1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {1, 1}, Relationship.EQ, 4));
        return new SimplexTableau(f, constraints, GoalType.MAXIMIZE, restrict, EPS);
    }

    // ---------- Constructor / dimension tests ----------

    @Test
    public void testConstructor_AllLeq_RestrictTrue_NoArtificialVars() {
        SimplexTableau t = createLeqTableau(true);
        assertEquals(1, t.getNumObjectiveFunctions());
        assertEquals(0, t.getNumArtificialVariables());
        assertEquals(2, t.getNumSlackVariables());
        assertEquals(2, t.getNumDecisionVariables());
        assertEquals(2, t.getOriginalNumDecisionVariables());
    }

    @Test
    public void testConstructor_WithGeq_CreatesArtificialVariable() {
        SimplexTableau t = createGeqTableau(true);
        assertEquals(2, t.getNumObjectiveFunctions());
        assertEquals(1, t.getNumArtificialVariables());
        assertEquals(2, t.getNumSlackVariables());
    }

    @Test
    public void testConstructor_WithEq_CreatesArtificialVariable_NoSlack() {
        SimplexTableau t = createEqTableau(true);
        assertEquals(2, t.getNumObjectiveFunctions());
        assertEquals(1, t.getNumArtificialVariables());
        assertEquals(0, t.getNumSlackVariables());
    }

    @Test
    public void testConstructor_RestrictToNonNegativeFalse_ExtraDecisionVar() {
        SimplexTableau t1 = createLeqTableau(true);
        SimplexTableau t2 = createLeqTableau(false);
        assertEquals(t1.getNumDecisionVariables() + 1, t2.getNumDecisionVariables());
    }

    @Test
    public void testConstructorWithMaxUlps_DoesNotThrow() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1, 1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {1, 0}, Relationship.LEQ, 2));
        SimplexTableau t = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPS, 5);
        assertNotNull(t);
    }

    @Test
    public void testMinimizeGoalType_SetsNegativeOneAtZIndex() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1, 1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {1, 0}, Relationship.LEQ, 2));
        SimplexTableau t = new SimplexTableau(f, constraints, GoalType.MINIMIZE, true, EPS);
        // maximize==false -> matrix.setEntry(zIndex,zIndex,-1)
        assertEquals(-1.0, t.getEntry(0, 0), 0d);
    }

    // ---------- normalizeConstraints ----------

    @Test
    public void testNormalizeConstraints_NegativeRhs_FlipsRelationshipAndSign() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1, 1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {1, 1}, Relationship.LEQ, -5));
        SimplexTableau t = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPS);
        List<LinearConstraint> normalized = t.normalizeConstraints(constraints);
        assertEquals(1, normalized.size());
        LinearConstraint nc = normalized.get(0);
        assertEquals(5.0, nc.getValue(), 0d);
        assertEquals(Relationship.GEQ, nc.getRelationship());
        assertEquals(-1.0, nc.getCoefficients().getEntry(0), 0d);
        assertEquals(-1.0, nc.getCoefficients().getEntry(1), 0d);
    }

    @Test
    public void testNormalizeConstraints_PositiveRhs_NoChange() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1, 1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {1, 1}, Relationship.LEQ, 5));
        SimplexTableau t = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPS);
        List<LinearConstraint> normalized = t.normalizeConstraints(constraints);
        LinearConstraint nc = normalized.get(0);
        assertEquals(5.0, nc.getValue(), 0d);
        assertEquals(Relationship.LEQ, nc.getRelationship());
    }

    @Test
    public void testNormalizeConstraints_BoundaryZeroRhs_NoChange() {
        // value == 0 ไม่เข้าเงื่อนไข < 0 -> ไม่ normalize
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1, 1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {1, 1}, Relationship.GEQ, 0));
        SimplexTableau t = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPS);
        List<LinearConstraint> normalized = t.normalizeConstraints(constraints);
        assertEquals(Relationship.GEQ, normalized.get(0).getRelationship());
        assertEquals(0.0, normalized.get(0).getValue(), 0d);
    }

    // ---------- getBasicRow ----------

    @Test
    public void testGetBasicRow_FoundBasicColumn() {
        SimplexTableau t = createLeqTableau(true);
        int slackCol = t.getSlackVariableOffset(); // s0 column, basic in row1
        Integer basicRow = t.getBasicRow(slackCol);
        assertNotNull(basicRow);
        assertEquals(Integer.valueOf(1), basicRow);
    }

    @Test
    public void testGetBasicRow_NotBasic_NonZeroNonOneEntry() {
        SimplexTableau t = createLeqTableau(true);
        // x0 column: row0 = -1 (ไม่ใช่ 0 หรือ 1) -> return null ทันที (else-if branch)
        int decisionCol = t.getNumObjectiveFunctions(); // index ของ x0
        Integer basicRow = t.getBasicRow(decisionCol);
        assertNull(basicRow);
    }

    @Test
    public void testGetBasicRow_NoRowHasOne_ReturnsNull() {
        // ทดสอบ branch ที่ไม่มี row ใดเลยเป็น 1 -> row ยังเป็น null ท้ายสุด
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {0, 0}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {0, 0}, Relationship.LEQ, 2));
        SimplexTableau t = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPS);
        // column x0 (coeff ทุกแถวเป็น 0) ไม่มี row ใดเป็น 1 เลย
        int decisionCol = t.getNumObjectiveFunctions();
        Integer basicRow = t.getBasicRow(decisionCol);
        assertNull(basicRow);
    }

    // ---------- getInvertedCoefficientSum (static) ----------

    @Test
    public void testGetInvertedCoefficientSum() {
        RealVector v = new ArrayRealVector(new double[] {1, 2, 3});
        double sum = SimplexTableau.getInvertedCoefficientSum(v);
        assertEquals(-6.0, sum, 0d);
    }

    @Test
    public void testGetInvertedCoefficientSum_EmptyVector() {
        RealVector v = new ArrayRealVector(new double[] {});
        double sum = SimplexTableau.getInvertedCoefficientSum(v);
        assertEquals(0.0, sum, 0d);
    }

    // ---------- isOptimal ----------

    @Test
    public void testIsOptimal_True_WhenAllNonNegative() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {0, 0}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {1, 0}, Relationship.LEQ, 2));
        SimplexTableau t = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPS);
        assertTrue(t.isOptimal());
    }

    @Test
    public void testIsOptimal_False_WhenNegativeEntryExists() {
        SimplexTableau t = createLeqTableau(true);
        assertFalse(t.isOptimal());
    }

    // ---------- dropPhase1Objective ----------

    @Test
    public void testDropPhase1Objective_WhenSinglePhase_NoOp() {
        SimplexTableau t = createLeqTableau(true);
        int widthBefore = t.getWidth();
        int heightBefore = t.getHeight();
        t.dropPhase1Objective(); // numObjFunc==1 -> return ทันที
        assertEquals(widthBefore, t.getWidth());
        assertEquals(heightBefore, t.getHeight());
    }

    @Test
    public void testDropPhase1Objective_WhenTwoPhase_DropsRowAndColumns() {
        SimplexTableau t = createGeqTableau(true);
        int widthBefore = t.getWidth();
        int heightBefore = t.getHeight();
        t.dropPhase1Objective();
        assertEquals(0, t.getNumArtificialVariables());
        assertEquals(heightBefore - 1, t.getHeight());
        assertTrue("width ควรลดลงอย่างน้อย 1 คอลัมน์ (W column)",
                t.getWidth() < widthBefore);
    }

    // ---------- getSolution ----------

    @Test
    public void testGetSolution_RestrictToNonNegative() {
        SimplexTableau t = createLeqTableau(true);
        PointValuePair solution = t.getSolution();
        assertNotNull(solution);
        assertEquals(2, solution.getPoint().length);
    }

    @Test
    public void testGetSolution_NotRestrictToNonNegative() {
        SimplexTableau t = createLeqTableau(false);
        PointValuePair solution = t.getSolution();
        assertNotNull(solution);
        assertEquals(2, solution.getPoint().length);
    }

    // ---------- divideRow / subtractRow ----------

    @Test
    public void testDivideRow_UpdatesAllColumns() {
        SimplexTableau t = createLeqTableau(true);
        double[] before = t.getData()[1].clone();
        t.divideRow(1, 2.0);
        for (int j = 0; j < before.length; j++) {
            assertEquals(before[j] / 2.0, t.getEntry(1, j), 1e-9);
        }
    }

    @Test
    public void testSubtractRow_ComputesCorrectDifference() {
        SimplexTableau t = createLeqTableau(true);
        double[] rowA = t.getData()[1].clone();
        double[] rowB = t.getData()[2].clone();
        t.subtractRow(1, 2, 1.0);
        for (int j = 0; j < rowA.length; j++) {
            assertEquals(rowA[j] - rowB[j], t.getEntry(1, j), 1e-9);
        }
    }

    // ---------- width/height/offset getters ----------

    @Test
    public void testGetWidthAndHeight_MatchFormula() {
        SimplexTableau t = createLeqTableau(true);
        int expectedWidth = t.getNumDecisionVariables() + t.getNumSlackVariables() +
                t.getNumArtificialVariables() + t.getNumObjectiveFunctions() + 1;
        assertEquals(expectedWidth, t.getWidth());
        int expectedHeight = 2 + t.getNumObjectiveFunctions();
        assertEquals(expectedHeight, t.getHeight());
    }

    @Test
    public void testGetSlackArtificialRhsOffsets() {
        SimplexTableau t = createGeqTableau(true);
        assertEquals(t.getNumObjectiveFunctions() + t.getNumDecisionVariables(),
                t.getSlackVariableOffset());
        assertEquals(t.getNumObjectiveFunctions() + t.getNumDecisionVariables() +
                t.getNumSlackVariables(), t.getArtificialVariableOffset());
        assertEquals(t.getWidth() - 1, t.getRhsOffset());
    }

    @Test
    public void testSetEntryAndGetEntry() {
        SimplexTableau t = createLeqTableau(true);
        t.setEntry(0, 0, 42.0);
        assertEquals(42.0, t.getEntry(0, 0), 0d);
    }

    @Test
    public void testGetData_MatchesTableauDimensions() {
        SimplexTableau t = createLeqTableau(true);
        double[][] data = t.getData();
        assertEquals(t.getHeight(), data.length);
        assertEquals(t.getWidth(), data[0].length);
    }

    @Test
    public void testCreateTableau_NegativeVariableColumn_IncreasesWidth() {
        SimplexTableau restricted = createLeqTableau(true);
        SimplexTableau notRestricted = createLeqTableau(false);
        assertTrue(notRestricted.getWidth() > restricted.getWidth());
    }

    // ---------- equals / hashCode ----------

    @Test
    public void testEquals_SameInstance() {
        SimplexTableau t = createLeqTableau(true);
        assertTrue(t.equals(t));
    }

    @Test
    public void testEquals_DifferentType_ReturnsFalse() {
        SimplexTableau t = createLeqTableau(true);
        assertFalse(t.equals("not a tableau"));
    }

    @Test
    public void testEquals_Null_ReturnsFalse() {
        SimplexTableau t = createLeqTableau(true);
        assertFalse(t.equals(null));
    }

    @Test
    public void testEquals_EqualTableaux_AndHashCodeConsistency() {
        SimplexTableau t1 = createLeqTableau(true);
        SimplexTableau t2 = createLeqTableau(true);
        assertTrue(t1.equals(t2));
        assertEquals(t1.hashCode(), t2.hashCode());
    }

    @Test
    public void testEquals_DifferentRestrictToNonNegative_ReturnsFalse() {
        SimplexTableau t1 = createLeqTableau(true);
        SimplexTableau t2 = createLeqTableau(false);
        assertFalse(t1.equals(t2));
    }

    @Test
    public void testHashCode_ConsistentAcrossCalls() {
        SimplexTableau t = createLeqTableau(true);
        int h1 = t.hashCode();
        int h2 = t.hashCode();
        assertEquals(h1, h2);
    }
}
