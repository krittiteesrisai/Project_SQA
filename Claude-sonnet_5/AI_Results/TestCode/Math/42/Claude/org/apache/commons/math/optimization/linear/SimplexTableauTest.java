package org.apache.commons.math.optimization.linear;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.junit.Test;

public class SimplexTableauTest {

    private static final double EPS = 1.0e-9;

    // ================= Constructor / createTableau =================

    @Test
    public void testConstructor_defaultMaxUlps_matchesExplicitTen() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1, 1}, 0);
        List<LinearConstraint> cs = new ArrayList<LinearConstraint>();
        cs.add(new LinearConstraint(new double[] {1, 0}, Relationship.LEQ, 5));

        SimplexTableau withDefault =
            new SimplexTableau(f, cs, GoalType.MINIMIZE, true, 1e-6);
        SimplexTableau withExplicitTen =
            new SimplexTableau(f, cs, GoalType.MINIMIZE, true, 1e-6, 10);

        // maxUlps เป็น private field แต่ถูกเทียบใน equals() -> ใช้ equals เพื่อยืนยันค่า default
        assertTrue(withDefault.equals(withExplicitTen));
    }

    @Test(expected = NullPointerException.class)
    public void testConstructor_nullObjectiveFunction_throwsNPE() {
        // ไม่มี null-check ใน source -> f.getCoefficients() จะ NPE โดยธรรมชาติ
        new SimplexTableau(null, new ArrayList<LinearConstraint>(),
                            GoalType.MINIMIZE, true, 1e-6);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructor_nullConstraints_throwsNPE() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1}, 0);
        // normalizeConstraints(null) จะ NPE ตอน for-each
        new SimplexTableau(f, null, GoalType.MINIMIZE, true, 1e-6);
    }

    @Test
    public void testConstructor_emptyConstraints_validState() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1, 1}, 0);
        SimplexTableau t = new SimplexTableau(f, new ArrayList<LinearConstraint>(),
                                               GoalType.MINIMIZE, true, 1e-6);
        assertEquals(0, t.getNumSlackVariables());
        assertEquals(0, t.getNumArtificialVariables());
        assertEquals(1, t.getNumObjectiveFunctionsForTest());
        assertEquals(1, t.getHeight());
    }

    @Test
    public void testConstructor_leqConstraint_noArtificial() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1}, 0);
        List<LinearConstraint> cs = Arrays.asList(
            new LinearConstraint(new double[] {1}, Relationship.LEQ, 5));
        SimplexTableau t = new SimplexTableau(f, cs, GoalType.MINIMIZE, true, 1e-6);

        assertEquals(1, t.getNumSlackVariables());
        assertEquals(0, t.getNumArtificialVariables());
        assertEquals(1, t.getNumObjectiveFunctionsForTest());
        assertFalse(t.getColumnLabelsForTest().contains("W"));
    }

    @Test
    public void testConstructor_geqConstraint_createsSlackAndArtificial() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1}, 0);
        List<LinearConstraint> cs = Arrays.asList(
            new LinearConstraint(new double[] {1}, Relationship.GEQ, 1));
        SimplexTableau t = new SimplexTableau(f, cs, GoalType.MINIMIZE, true, 1e-6);

        assertEquals(1, t.getNumSlackVariables());
        assertEquals(1, t.getNumArtificialVariables());
        assertEquals(2, t.getNumObjectiveFunctionsForTest());
        assertTrue(t.getColumnLabelsForTest().contains("W"));
        assertTrue(t.getColumnLabelsForTest().contains("s0"));
        assertTrue(t.getColumnLabelsForTest().contains("a0"));
    }

    @Test
    public void testConstructor_eqConstraint_onlyArtificialNoSlack() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1}, 0);
        List<LinearConstraint> cs = Arrays.asList(
            new LinearConstraint(new double[] {1}, Relationship.EQ, 1));
        SimplexTableau t = new SimplexTableau(f, cs, GoalType.MINIMIZE, true, 1e-6);

        assertEquals(0, t.getNumSlackVariables());
        assertEquals(1, t.getNumArtificialVariables());
        assertFalse(t.getColumnLabelsForTest().contains("s0"));
        assertTrue(t.getColumnLabelsForTest().contains("a0"));
    }

    @Test
    public void testConstructor_mixedRelationships_correctCounts() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1, 1}, 0);
        List<LinearConstraint> cs = Arrays.asList(
            new LinearConstraint(new double[] {1, 0}, Relationship.LEQ, 1),
            new LinearConstraint(new double[] {0, 1}, Relationship.GEQ, 1),
            new LinearConstraint(new double[] {1, 1}, Relationship.EQ, 1));
        SimplexTableau t = new SimplexTableau(f, cs, GoalType.MINIMIZE, true, 1e-6);

        assertEquals(2, t.getNumSlackVariables());      // LEQ + GEQ
        assertEquals(2, t.getNumArtificialVariables());  // EQ + GEQ
    }

    @Test
    public void testConstructor_restrictToNonNegativeFalse_addsNegativeVarColumn() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1, 1}, 0);
        SimplexTableau t = new SimplexTableau(f, new ArrayList<LinearConstraint>(),
                                               GoalType.MINIMIZE, false, 1e-6);

        assertTrue(t.getColumnLabelsForTest().contains("x-"));
        assertEquals(3, t.getNumDecisionVariables()); // 2 + 1

        // getSlackVariableOffset = 1(obj) + 3(decision) = 4 -> col index 3
        assertEquals(-2.0, t.getEntry(0, 3), EPS); // getInvertedCoefficientSum([1,1]) = -2
    }

    @Test
    public void testConstructor_maximizeGoalType() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1, 1}, 10);
        SimplexTableau t = new SimplexTableau(f, new ArrayList<LinearConstraint>(),
                                               GoalType.MAXIMIZE, true, 1e-6);
        // zIndex = 0 (no artificial vars)
        assertEquals(1.0, t.getEntry(0, 0), EPS);
        assertEquals(-1.0, t.getEntry(0, 1), EPS); // coefficients negated
        assertEquals(-1.0, t.getEntry(0, 2), EPS);
        assertEquals(10.0, t.getEntry(0, 3), EPS); // RHS = constantTerm (not negated) for maximize
    }

    @Test
    public void testConstructor_normalizesNegativeConstraintValueDuringBuild() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1}, 0);
        // ค่าลบ -> normalize() ต้องพลิกเครื่องหมายและ relationship
        // (อ้างอิงจาก LEQ.oppositeRelationship() เป็น GEQ-like ซึ่งสังเกตได้จากพฤติกรรม
        //  ว่ามันไปสร้าง artificial variable - ไม่ได้ assume ภายในของ enum ตรงๆ)
        List<LinearConstraint> cs = Arrays.asList(
            new LinearConstraint(new double[] {1}, Relationship.LEQ, -5));
        SimplexTableau t = new SimplexTableau(f, cs, GoalType.MINIMIZE, true, 1e-6);

        assertEquals(1, t.getNumArtificialVariables()); // พิสูจน์ว่า relationship ถูกพลิกเป็น GEQ-like
        int row = t.getNumObjectiveFunctionsForTest(); // row ของ constraint แรก
        int rhsCol = t.getWidth() - 1;
        assertEquals(5.0, t.getEntry(row, rhsCol), EPS); // ค่าบวกแล้ว
    }

    // ================= normalizeConstraints / normalize =================

    @Test
    public void testNormalizeConstraints_negativeValueFlipsSignAndRelationship() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1}, 0);
        SimplexTableau dummy = new SimplexTableau(f,
            Arrays.asList(new LinearConstraint(new double[] {1}, Relationship.LEQ, 1)),
            GoalType.MINIMIZE, true, 1e-6);

        LinearConstraint original = new LinearConstraint(new double[] {1, -2}, Relationship.LEQ, -5);
        List<LinearConstraint> result =
            dummy.normalizeConstraints(Arrays.asList(original));

        LinearConstraint normalized = result.get(0);
        assertEquals(5.0, normalized.getValue(), EPS);
        assertEquals(original.getRelationship().oppositeRelationship(), normalized.getRelationship());
        assertArrayEquals(new double[] {-1, 2}, normalized.getCoefficients().toArray(), EPS);
    }

    @Test
    public void testNormalizeConstraints_nonNegativeValueUnchanged() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1}, 0);
        SimplexTableau dummy = new SimplexTableau(f,
            Arrays.asList(new LinearConstraint(new double[] {1}, Relationship.LEQ, 1)),
            GoalType.MINIMIZE, true, 1e-6);

        LinearConstraint original = new LinearConstraint(new double[] {1, 2}, Relationship.GEQ, 5);
        List<LinearConstraint> result =
            dummy.normalizeConstraints(Arrays.asList(original));

        LinearConstraint normalized = result.get(0);
        assertEquals(5.0, normalized.getValue(), EPS);
        assertEquals(Relationship.GEQ, normalized.getRelationship());
        assertArrayEquals(new double[] {1, 2}, normalized.getCoefficients().toArray(), EPS);
    }

    // ================= getInvertedCoefficientSum =================

    @Test
    public void testGetInvertedCoefficientSum_various() {
        assertEquals(-6.0,
            SimplexTableau.getInvertedCoefficientSum(new ArrayRealVector(new double[] {1, 2, 3})), EPS);
        assertEquals(0.0,
            SimplexTableau.getInvertedCoefficientSum(new ArrayRealVector(new double[] {})), EPS);
        assertEquals(3.0,
            SimplexTableau.getInvertedCoefficientSum(new ArrayRealVector(new double[] {-1, -2})), EPS);
    }

    // ================= getBasicRow =================

    private SimplexTableau build3RowTableau() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1, 1}, 0);
        List<LinearConstraint> cs = Arrays.asList(
            new LinearConstraint(new double[] {1, 0}, Relationship.LEQ, 5),
            new LinearConstraint(new double[] {0, 1}, Relationship.LEQ, 5));
        return new SimplexTableau(f, cs, GoalType.MINIMIZE, true, 1e-6);
    }

    @Test
    public void testGetBasicRow_singleOne() {
        SimplexTableau t = build3RowTableau(); // height = 3, width = 6
        t.setEntry(0, 1, 1); t.setEntry(1, 1, 0); t.setEntry(2, 1, 0);
        assertEquals(Integer.valueOf(0), t.getBasicRow(1));
    }

    @Test
    public void testGetBasicRow_doubleOne_returnsNull() {
        SimplexTableau t = build3RowTableau();
        t.setEntry(0, 2, 1); t.setEntry(1, 2, 1); t.setEntry(2, 2, 0);
        assertNull(t.getBasicRow(2));
    }

    @Test
    public void testGetBasicRow_allZero_returnsNull() {
        SimplexTableau t = build3RowTableau();
        t.setEntry(0, 3, 0); t.setEntry(1, 3, 0); t.setEntry(2, 3, 0);
        assertNull(t.getBasicRow(3));
    }

    @Test
    public void testGetBasicRow_nonZeroNonOne_returnsNullImmediately() {
        SimplexTableau t = build3RowTableau();
        t.setEntry(0, 4, 0.5); t.setEntry(1, 4, 0); t.setEntry(2, 4, 0);
        assertNull(t.getBasicRow(4));
    }

    // ================= isOptimal =================

    @Test
    public void testIsOptimal_trueInitially() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1, 1}, 0);
        SimplexTableau t = new SimplexTableau(f, new ArrayList<LinearConstraint>(),
                                               GoalType.MINIMIZE, true, 1e-6);
        assertTrue(t.isOptimal());
    }

    @Test
    public void testIsOptimal_falseAfterNegativeEntryBeyondEpsilon() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1, 1}, 0);
        SimplexTableau t = new SimplexTableau(f, new ArrayList<LinearConstraint>(),
                                               GoalType.MINIMIZE, true, 0.01);
        t.setEntry(0, 1, -0.02); // เกิน epsilon
        assertFalse(t.isOptimal());
    }

    @Test
    public void testIsOptimal_boundaryAtEpsilon() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1, 1}, 0);
        SimplexTableau t = new SimplexTableau(f, new ArrayList<LinearConstraint>(),
                                               GoalType.MINIMIZE, true, 0.01);
        t.setEntry(0, 1, -0.01); // เท่ากับ epsilon พอดี (boundary)
        t.setEntry(0, 2, 1);
        assertTrue(t.isOptimal());
    }

    // ================= divideRow / subtractRow =================

    @Test
    public void testDivideRow() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1}, 0);
        List<LinearConstraint> cs = Arrays.asList(
            new LinearConstraint(new double[] {1}, Relationship.LEQ, 5));
        SimplexTableau t = new SimplexTableau(f, cs, GoalType.MINIMIZE, true, 1e-6);
        // row1 = [0, 1, 1, 5]
        t.divideRow(1, 5.0);
        assertEquals(0.0, t.getEntry(1, 0), EPS);
        assertEquals(0.2, t.getEntry(1, 1), EPS);
        assertEquals(0.2, t.getEntry(1, 2), EPS);
        assertEquals(1.0, t.getEntry(1, 3), EPS);
    }

    @Test
    public void testSubtractRow() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1}, 0);
        List<LinearConstraint> cs = Arrays.asList(
            new LinearConstraint(new double[] {1}, Relationship.LEQ, 5));
        SimplexTableau t = new SimplexTableau(f, cs, GoalType.MINIMIZE, true, 1e-6);
        // row0 = [-1, 1, 0, 0], row1 = [0, 1, 1, 5]
        t.subtractRow(0, 1, 1.0);
        assertEquals(-1.0, t.getEntry(0, 0), EPS);
        assertEquals(0.0, t.getEntry(0, 1), EPS);
        assertEquals(-1.0, t.getEntry(0, 2), EPS);
        assertEquals(-5.0, t.getEntry(0, 3), EPS);
    }

    // ================= Getters =================

    @Test
    public void testGettersBasicConfiguration() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1, 1}, 0);
        List<LinearConstraint> cs = Arrays.asList(
            new LinearConstraint(new double[] {1, 0}, Relationship.GEQ, 1));
        SimplexTableau t = new SimplexTableau(f, cs, GoalType.MINIMIZE, true, 1e-6);

        assertEquals(7, t.getWidth());
        assertEquals(3, t.getHeight());
        assertEquals(2, t.getNumDecisionVariables());
        assertEquals(2, t.getOriginalNumDecisionVariables());
        assertEquals(1, t.getNumSlackVariables());
        assertEquals(1, t.getNumArtificialVariables());
        assertEquals(4, t.getSlackVariableOffset());     // 2(obj)+2(decision)
        assertEquals(5, t.getArtificialVariableOffset()); // 4+1
        assertEquals(6, t.getRhsOffset());                // width-1
    }

    @Test
    public void testGetData_isDefensiveCopy() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1}, 0);
        SimplexTableau t = new SimplexTableau(f, new ArrayList<LinearConstraint>(),
                                               GoalType.MINIMIZE, true, 1e-6);
        double[][] data = t.getData();
        data[0][0] = 999.0;
        assertNotEquals(999.0, t.getEntry(0, 0), EPS);
    }

    // ================= getSolution =================

    @Test
    public void testGetSolution_basicCase_basicRowNull() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1}, 0);
        List<LinearConstraint> cs = Arrays.asList(
            new LinearConstraint(new double[] {1}, Relationship.LEQ, 5));
        SimplexTableau t = new SimplexTableau(f, cs, GoalType.MINIMIZE, true, 1e-6);

        RealPointValuePair sol = t.getSolution();
        assertArrayEquals(new double[] {0.0}, sol.getPoint(), EPS);
        assertEquals(0.0, sol.getValue(), EPS);
    }

    @Test
    public void testGetSolution_sharedBasicRow_setsZeroForSecondVariable() {
        // height = 1 (ไม่มี constraint) -> ทั้งสองคอลัมน์ x0,x1 ถือว่า "basic" แถวเดียวกัน (0)
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1, 1}, 0);
        SimplexTableau t = new SimplexTableau(f, new ArrayList<LinearConstraint>(),
                                               GoalType.MINIMIZE, true, 1e-6);

        RealPointValuePair sol = t.getSolution();
        assertArrayEquals(new double[] {0.0, 0.0}, sol.getPoint(), EPS);
    }

    @Test
    public void testGetSolution_negativeVariableBasic_usesRhsAsOffset() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {5}, 0);
        SimplexTableau t = new SimplexTableau(f, new ArrayList<LinearConstraint>(),
                                               GoalType.MINIMIZE, false, 1e-6);
        // บังคับให้คอลัมน์ x- (index 2) เป็น basic ด้วย RHS = -7
        t.setEntry(0, 2, 1);
        t.setEntry(0, 3, -7);

        RealPointValuePair sol = t.getSolution();
        assertArrayEquals(new double[] {7.0}, sol.getPoint(), EPS);
        assertEquals(35.0, sol.getValue(), EPS);
    }

    // ================= dropPhase1Objective =================

    @Test
    public void testDropPhase1Objective_earlyReturnWhenNoArtificial() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1}, 0);
        List<LinearConstraint> cs = Arrays.asList(
            new LinearConstraint(new double[] {1}, Relationship.LEQ, 5));
        SimplexTableau t = new SimplexTableau(f, cs, GoalType.MINIMIZE, true, 1e-6);

        int widthBefore = t.getWidth();
        int heightBefore = t.getHeight();
        t.dropPhase1Objective();
        assertEquals(widthBefore, t.getWidth());
        assertEquals(heightBefore, t.getHeight());
    }

    @Test
    public void testDropPhase1Objective_dropsPositiveCostColumns_andGetSolutionHandlesMissingColumn() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1, 1}, 0);
        List<LinearConstraint> cs = Arrays.asList(
            new LinearConstraint(new double[] {1, -1}, Relationship.GEQ, 1));
        SimplexTableau t = new SimplexTableau(f, cs, GoalType.MINIMIZE, true, 1e-6);

        // ก่อน drop: width=7,height=3
        assertEquals(7, t.getWidth());
        assertEquals(3, t.getHeight());
        assertEquals(1, t.getNumArtificialVariables());

        t.dropPhase1Objective();

        assertEquals(4, t.getWidth());
        assertEquals(2, t.getHeight());
        assertEquals(0, t.getNumArtificialVariables());
        List<String> labels = t.getColumnLabelsForTest();
        assertEquals(Arrays.asList("Z", "x0", "a0", "RHS"), labels);

        // ค่าตาม matrix ที่คำนวณไว้
        assertEquals(-1.0, t.getEntry(0, 0), EPS);
        assertEquals(1.0, t.getEntry(0, 1), EPS);
        assertEquals(0.0, t.getEntry(0, 2), EPS);
        assertEquals(0.0, t.getEntry(0, 3), EPS);
        assertEquals(0.0, t.getEntry(1, 0), EPS);
        assertEquals(1.0, t.getEntry(1, 1), EPS);
        assertEquals(1.0, t.getEntry(1, 2), EPS);
        assertEquals(1.0, t.getEntry(1, 3), EPS);

        // getSolution ต้องเจอ colIndex < 0 สำหรับ "x1" (ถูก drop ไปแล้ว)
        RealPointValuePair sol = t.getSolution();
        assertArrayEquals(new double[] {0.0, 0.0}, sol.getPoint(), EPS);
        assertEquals(0.0, sol.getValue(), EPS);
    }

    // ================= equals / hashCode =================

    private SimplexTableau baseTableau(boolean restrict, double epsilon, int maxUlps, double value) {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1, 1}, 0);
        List<LinearConstraint> cs = Arrays.asList(
            new LinearConstraint(new double[] {1, 0}, Relationship.LEQ, value));
        return new SimplexTableau(f, cs, GoalType.MINIMIZE, restrict, epsilon, maxUlps);
    }

    @Test
    public void testEquals_sameInstance() {
        SimplexTableau t = baseTableau(true, 1e-6, 10, 5);
        assertTrue(t.equals(t));
    }

    @Test
    public void testEquals_differentType() {
        SimplexTableau t = baseTableau(true, 1e-6, 10, 5);
        assertFalse(t.equals("not a tableau"));
    }

    @Test
    public void testEquals_equalObjects() {
        SimplexTableau a = baseTableau(true, 1e-6, 10, 5);
        SimplexTableau b = baseTableau(true, 1e-6, 10, 5);
        assertTrue(a.equals(b));
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testEquals_differentRestrictToNonNegative() {
        SimplexTableau a = baseTableau(true, 1e-6, 10, 5);
        SimplexTableau b = baseTableau(false, 1e-6, 10, 5);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentEpsilon() {
        SimplexTableau a = baseTableau(true, 1e-6, 10, 5);
        SimplexTableau b = baseTableau(true, 1e-5, 10, 5);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentMaxUlps() {
        SimplexTableau a = baseTableau(true, 1e-6, 10, 5);
        SimplexTableau b = baseTableau(true, 1e-6, 5, 5);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentConstraints() {
        SimplexTableau a = baseTableau(true, 1e-6, 10, 5);
        SimplexTableau b = baseTableau(true, 1e-6, 10, 6); // ค่า RHS ต่างกัน
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentObjectiveFunction() {
        LinearObjectiveFunction f1 = new LinearObjectiveFunction(new double[] {1, 1}, 0);
        LinearObjectiveFunction f2 = new LinearObjectiveFunction(new double[] {2, 1}, 0);
        List<LinearConstraint> cs = Arrays.asList(
            new LinearConstraint(new double[] {1, 0}, Relationship.LEQ, 5));
        SimplexTableau a = new SimplexTableau(f1, cs, GoalType.MINIMIZE, true, 1e-6, 10);
        SimplexTableau b = new SimplexTableau(f2, cs, GoalType.MINIMIZE, true, 1e-6, 10);
        assertFalse(a.equals(b));
    }

    @Test
    public void testHashCode_consistentForEqualObjects() {
        SimplexTableau a = baseTableau(true, 1e-6, 10, 5);
        SimplexTableau b = baseTableau(true, 1e-6, 10, 5);
        assertEquals(a.hashCode(), a.hashCode());
        assertEquals(a.hashCode(), b.hashCode());
    }
}
