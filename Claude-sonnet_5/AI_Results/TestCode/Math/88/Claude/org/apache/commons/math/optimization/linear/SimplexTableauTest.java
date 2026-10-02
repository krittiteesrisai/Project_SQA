package org.apache.commons.math.optimization.linear;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;

/**
 * Unit tests for {@link SimplexTableau} (Defects4J Math-88b).
 *
 * หมายเหตุสมมติฐาน (ไม่มีซอร์สของคลาสเหล่านี้ให้มา จึงอ้างอิงตาม public API
 * มาตรฐานของ commons-math 2.0 ที่ SimplexTableau เรียกใช้งานจริงในซอร์ส):
 *  - LinearObjectiveFunction(double[] coeffs, double constant)
 *      .getValue(double[] point) -> dot(coeffs,point)+constant
 *  - LinearConstraint(double[] coeffs, Relationship rel, double value)
 *  - Relationship.{LEQ,GEQ,EQ}.oppositeRelationship()
 *  - RealMatrixImpl.equals/hashCode เป็น content-based
 *    (อนุมานจากการที่ SimplexTableau.equals/hashCode เรียก tableau.equals()/hashCode())
 */
public class SimplexTableauTest {

    private static final double EPS = 1.0e-9;

    private List<LinearConstraint> list(LinearConstraint... cs) {
        List<LinearConstraint> l = new ArrayList<LinearConstraint>();
        for (LinearConstraint c : cs) {
            l.add(c);
        }
        return l;
    }

    // ---------------------------------------------------------------
    // 1) LEQ only, restrictToNonNegative = true, no artificial vars
    // ---------------------------------------------------------------
    @Test
    public void testCreateTableau_SimpleLEQ_NoArtificial() {
        LinearObjectiveFunction f =
            new LinearObjectiveFunction(new double[]{15, 10}, 0);
        List<LinearConstraint> cs = list(
            new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 2),
            new LinearConstraint(new double[]{0, 1}, Relationship.LEQ, 3)
        );

        SimplexTableau t = new SimplexTableau(f, cs, GoalType.MAXIMIZE, true, EPS);

        assertEquals(2, t.getNumDecisionVariables());
        assertEquals(2, t.getNumSlackVariables());
        assertEquals(0, t.getNumArtificialVariables());
        assertEquals(6, t.getWidth());
        assertEquals(3, t.getHeight());
        assertEquals(3, t.getSlackVariableOffset());
        assertEquals(5, t.getRhsOffset());

        double[][] expected = {
            {1, -15, -10, 0, 0, 0},
            {0,   1,   0, 1, 0, 2},
            {0,   0,   1, 0, 1, 3}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                assertEquals("row " + i + " col " + j,
                             expected[i][j], t.getEntry(i, j), EPS);
            }
        }
    }

    // ---------------------------------------------------------------
    // 2) GEQ constraint -> artificial variable branch + initialize()
    //    loop actually executes (subtractRow called)
    // ---------------------------------------------------------------
    @Test
    public void testCreateTableau_GEQ_WithArtificial_Minimize() {
        LinearObjectiveFunction f =
            new LinearObjectiveFunction(new double[]{1, 1}, 0);
        List<LinearConstraint> cs = list(
            new LinearConstraint(new double[]{1, 1}, Relationship.GEQ, 2)
        );

        SimplexTableau t = new SimplexTableau(f, cs, GoalType.MINIMIZE, true, EPS);

        assertEquals(1, t.getNumSlackVariables());
        assertEquals(1, t.getNumArtificialVariables());
        assertEquals(7, t.getWidth());
        assertEquals(3, t.getHeight());
        assertEquals(5, t.getArtificialVariableOffset());

        // ค่าหลังผ่าน initialize() (subtractRow ถูกเรียกจริงเพราะ numArtificialVariables>0)
        double[][] expected = {
            {-1, 0, -1, -1, 1, 0, -2},
            { 0,-1,  1,  1, 0, 0,  0},
            { 0, 0,  1,  1,-1, 1,  2}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                assertEquals("row " + i + " col " + j,
                             expected[i][j], t.getEntry(i, j), EPS);
            }
        }
    }

    // ---------------------------------------------------------------
    // 3) EQ constraint -> artificial branch (EQ side of the OR condition),
    //    no slack variable created
    // ---------------------------------------------------------------
    @Test
    public void testCreateTableau_EQConstraint_ArtificialBranchNoSlack() {
        LinearObjectiveFunction f =
            new LinearObjectiveFunction(new double[]{1, 1}, 0);
        List<LinearConstraint> cs = list(
            new LinearConstraint(new double[]{1, 1}, Relationship.EQ, 5)
        );

        SimplexTableau t = new SimplexTableau(f, cs, GoalType.MINIMIZE, true, EPS);

        assertEquals(0, t.getNumSlackVariables());
        assertEquals(1, t.getNumArtificialVariables());
        assertEquals(2, t.getNumObjectiveFunctionsForTest());
    }

    // ---------------------------------------------------------------
    // 4) restrictToNonNegative = false -> extra "x-" decision variable
    // ---------------------------------------------------------------
    @Test
    public void testCreateTableau_RestrictToNonNegativeFalse() {
        LinearObjectiveFunction f =
            new LinearObjectiveFunction(new double[]{5}, 2);
        List<LinearConstraint> cs = list(
            new LinearConstraint(new double[]{1}, Relationship.LEQ, 3)
        );

        SimplexTableau t = new SimplexTableau(f, cs, GoalType.MINIMIZE, false, EPS);

        assertEquals(2, t.getNumDecisionVariables());
        assertEquals(1, t.getOriginalNumDecisionVariablesForTest());
        assertEquals(0, t.getNumArtificialVariables());
        assertEquals(5, t.getWidth());
        assertEquals(2, t.getHeight());

        double[][] expected = {
            {-1,  5, -5, 0, -2},
            { 0,  1, -1, 1,  3}
        };
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                assertEquals("row " + i + " col " + j,
                             expected[i][j], t.getEntry(i, j), EPS);
            }
        }
    }

    // ---------------------------------------------------------------
    // 5) Boundary: empty constraints collection
    // ---------------------------------------------------------------
    @Test
    public void testCreateTableau_EmptyConstraints_Boundary() {
        LinearObjectiveFunction f =
            new LinearObjectiveFunction(new double[]{1, 1}, 0);
        List<LinearConstraint> cs = list(); // empty but not null

        SimplexTableau t = new SimplexTableau(f, cs, GoalType.MAXIMIZE, true, EPS);

        assertEquals(0, t.getNumSlackVariables());
        assertEquals(0, t.getNumArtificialVariables());
        assertEquals(1, t.getHeight()); // แค่ objective row เดียว
        assertEquals(4, t.getWidth());
        assertEquals(1.0, t.getEntry(0, 0), EPS);
        assertEquals(-1.0, t.getEntry(0, 1), EPS);
        assertEquals(-1.0, t.getEntry(0, 2), EPS);
    }

    // ---------------------------------------------------------------
    // 6) normalize(): ค่า RHS ติดลบ -> flip เครื่องหมาย + สลับ relationship
    // ---------------------------------------------------------------
    @Test
    public void testGetNormalizedConstraints_NegativeValue_Flips() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1}, 0);
        LinearConstraint original =
            new LinearConstraint(new double[]{1}, Relationship.LEQ, -3);
        List<LinearConstraint> cs = list(original);

        SimplexTableau t = new SimplexTableau(f, cs, GoalType.MINIMIZE, true, EPS);
        List<LinearConstraint> norm = t.getNormalizedConstraints();

        assertEquals(1, norm.size());
        LinearConstraint n = norm.get(0);
        assertEquals(3.0, n.getValue(), EPS);
        assertEquals(Relationship.GEQ, n.getRelationship());
        assertEquals(-1.0, n.getCoefficients().getEntry(0), EPS);

        // ต้นฉบับต้องไม่ถูกแก้ไข (immutability)
        assertEquals(-3.0, original.getValue(), EPS);
        assertEquals(Relationship.LEQ, original.getRelationship());
    }

    @Test
    public void testGetNormalizedConstraints_NonNegativeValue_Unchanged() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1}, 0);
        LinearConstraint original =
            new LinearConstraint(new double[]{1}, Relationship.LEQ, 4);
        List<LinearConstraint> cs = list(original);

        SimplexTableau t = new SimplexTableau(f, cs, GoalType.MINIMIZE, true, EPS);
        LinearConstraint n = t.getNormalizedConstraints().get(0);

        assertEquals(4.0, n.getValue(), EPS);
        assertEquals(Relationship.LEQ, n.getRelationship());
    }

    // ---------------------------------------------------------------
    // 7) getSolution(): basicRow != null, restrictToNonNegative = true
    //    (inner reset-loop executes but ไม่ match -> ไม่ reset)
    // ---------------------------------------------------------------
    @Test
    public void testGetSolution_SimpleUniqueBasicRows() {
        LinearObjectiveFunction f =
            new LinearObjectiveFunction(new double[]{15, 10}, 0);
        List<LinearConstraint> cs = list(
            new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 2),
            new LinearConstraint(new double[]{0, 1}, Relationship.LEQ, 3)
        );
        SimplexTableau t = new SimplexTableau(f, cs, GoalType.MAXIMIZE, true, EPS);

        RealPointValuePair pair = t.getSolution();
        assertArrayEquals(new double[]{2.0, 3.0}, pair.getPoint(), EPS);
        assertEquals(60.0, pair.getValue(), EPS);
    }

    // ---------------------------------------------------------------
    // 8) getSolution(): degenerate case -> getBasicRow() คืนค่า null
    //    เพราะมีมากกว่า 1 แถว non-zero (else return null branch)
    //    และ inner reset-loop พบ match จริง -> coefficient ถูกเซ็ตเป็น 0
    // ---------------------------------------------------------------
    @Test
    public void testGetSolution_DegenerateMultipleBasicRows() {
        LinearObjectiveFunction f =
            new LinearObjectiveFunction(new double[]{1, 1}, 0);
        List<LinearConstraint> cs = list(
            new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 4),
            new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 5)
        );
        SimplexTableau t = new SimplexTableau(f, cs, GoalType.MAXIMIZE, true, EPS);

        RealPointValuePair pair = t.getSolution();
        assertArrayEquals(new double[]{0.0, 0.0}, pair.getPoint(), EPS);
        assertEquals(0.0, pair.getValue(), EPS);
    }

    // ---------------------------------------------------------------
    // 9) getSolution(): restrictToNonNegative = false -> ลบ mostNegative จริง
    // ---------------------------------------------------------------
    @Test
    public void testGetSolution_RestrictToNonNegativeFalse_SubtractsMostNegative() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1}, 0);
        List<LinearConstraint> cs = list(
            new LinearConstraint(new double[]{1}, Relationship.LEQ, 10)
        );
        SimplexTableau t = new SimplexTableau(f, cs, GoalType.MINIMIZE, false, EPS);

        RealPointValuePair pair = t.getSolution();
        assertArrayEquals(new double[]{0.0}, pair.getPoint(), EPS);
        assertEquals(0.0, pair.getValue(), EPS);
    }

    // ---------------------------------------------------------------
    // 10) getSolution(): ไม่มี constraint เลย -> basicRow == null ทุกจุด
    // ---------------------------------------------------------------
    @Test
    public void testGetSolution_NoConstraints_AllBasicRowNull() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        List<LinearConstraint> cs = list();
        SimplexTableau t = new SimplexTableau(f, cs, GoalType.MAXIMIZE, true, EPS);

        RealPointValuePair pair = t.getSolution();
        assertArrayEquals(new double[]{0.0, 0.0}, pair.getPoint(), EPS);
    }

    // ---------------------------------------------------------------
    // 11) discardArtificialVariables(): numArtificialVariables == 0 -> early return
    // ---------------------------------------------------------------
    @Test
    public void testDiscardArtificialVariables_EarlyReturn() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        List<LinearConstraint> cs = list(
            new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 2)
        );
        SimplexTableau t = new SimplexTableau(f, cs, GoalType.MAXIMIZE, true, EPS);

        int widthBefore = t.getWidth();
        int heightBefore = t.getHeight();
        t.discardArtificialVariables();

        assertEquals(widthBefore, t.getWidth());
        assertEquals(heightBefore, t.getHeight());
        assertEquals(0, t.getNumArtificialVariables());
    }

    // ---------------------------------------------------------------
    // 12) discardArtificialVariables(): numArtificialVariables > 0 -> rebuild matrix
    // ---------------------------------------------------------------
    @Test
    public void testDiscardArtificialVariables_RemovesArtificialColumnsAndRow() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        List<LinearConstraint> cs = list(
            new LinearConstraint(new double[]{1, 1}, Relationship.GEQ, 2)
        );
        SimplexTableau t = new SimplexTableau(f, cs, GoalType.MINIMIZE, true, EPS);

        t.discardArtificialVariables();

        assertEquals(0, t.getNumArtificialVariables());
        assertEquals(5, t.getWidth());  // 7 - 1(artificial) - 1 = 5
        assertEquals(2, t.getHeight()); // 3 - 1 = 2

        double[][] expected = {
            {-1, 1, 1,  0, 0},
            { 0, 1, 1, -1, 2}
        };
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                assertEquals("row " + i + " col " + j,
                             expected[i][j], t.getEntry(i, j), EPS);
            }
        }
    }

    // ---------------------------------------------------------------
    // 13) protected helper methods: getEntry/setEntry/divideRow/subtractRow
    // ---------------------------------------------------------------
    @Test
    public void testSetEntryAndGetEntry() {
        SimplexTableau t = buildSimpleLeqTableau();
        t.setEntry(0, 0, 99.0);
        assertEquals(99.0, t.getEntry(0, 0), EPS);
    }

    @Test
    public void testDivideRow() {
        SimplexTableau t = buildSimpleLeqTableau();
        // row1 เดิมคือ [0,1,0,1,0,2]
        t.divideRow(1, 2.0);
        double[] expected = {0, 0.5, 0, 0.5, 0, 1};
        for (int j = 0; j < 6; j++) {
            assertEquals(expected[j], t.getEntry(1, j), EPS);
        }
    }

    @Test
    public void testSubtractRow() {
        SimplexTableau t = buildSimpleLeqTableau();
        // row2 - 1*row1 : [0,0,1,0,1,3] - [0,1,0,1,0,2] = [0,-1,1,-1,1,1]
        t.subtractRow(2, 1, 1.0);
        double[] expected = {0, -1, 1, -1, 1, 1};
        for (int j = 0; j < 6; j++) {
            assertEquals(expected[j], t.getEntry(2, j), EPS);
        }
    }

    private SimplexTableau buildSimpleLeqTableau() {
        LinearObjectiveFunction f =
            new LinearObjectiveFunction(new double[]{15, 10}, 0);
        List<LinearConstraint> cs = list(
            new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 2),
            new LinearConstraint(new double[]{0, 1}, Relationship.LEQ, 3)
        );
        return new SimplexTableau(f, cs, GoalType.MAXIMIZE, true, EPS);
    }

    // ---------------------------------------------------------------
    // 14) getData() dimensions
    // ---------------------------------------------------------------
    @Test
    public void testGetDataDimensions() {
        SimplexTableau t = buildSimpleLeqTableau();
        double[][] data = t.getData();
        assertEquals(t.getHeight(), data.length);
        assertEquals(t.getWidth(), data[0].length);
    }

    // ---------------------------------------------------------------
    // 15) getNumVariables()
    // ---------------------------------------------------------------
    @Test
    public void testGetNumVariables() {
        SimplexTableau t = buildSimpleLeqTableau();
        assertEquals(2, t.getNumVariables());
    }

    // ---------------------------------------------------------------
    // 16) equals()/hashCode()
    // ---------------------------------------------------------------
    @Test
    public void testEquals_SameReference_True() {
        SimplexTableau t = buildSimpleLeqTableau();
        assertTrue(t.equals(t));
    }

    @Test
    public void testEquals_Null_False() {
        SimplexTableau t = buildSimpleLeqTableau();
        assertFalse(t.equals(null));
    }

    @Test
    public void testEquals_DifferentClass_False() {
        SimplexTableau t = buildSimpleLeqTableau();
        // ทำให้เข้า catch(ClassCastException) branch
        assertFalse(t.equals("not a tableau"));
    }

    @Test
    public void testEquals_DifferentRestrictToNonNegative_False() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        List<LinearConstraint> cs = list(
            new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 2)
        );
        SimplexTableau t1 = new SimplexTableau(f, cs, GoalType.MAXIMIZE, true, EPS);
        SimplexTableau t2 = new SimplexTableau(f, cs, GoalType.MAXIMIZE, false, EPS);
        assertFalse(t1.equals(t2));
    }

    @Test
    public void testEquals_SameValues_True_And_HashCodeConsistent() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        List<LinearConstraint> cs = list(
            new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 2)
        );
        // ใช้ f, cs เดียวกัน (reference) ทั้งสอง instance เพื่อไม่ต้องพึ่งพา
        // การ implement equals() ของ LinearObjectiveFunction/LinearConstraint โดยตรง
        SimplexTableau t1 = new SimplexTableau(f, cs, GoalType.MAXIMIZE, true, EPS);
        SimplexTableau t2 = new SimplexTableau(f, cs, GoalType.MAXIMIZE, true, EPS);

        assertTrue(t1.equals(t2));
        assertEquals(t1.hashCode(), t2.hashCode());
    }

    @Test
    public void testHashCode_SameObjectConsistent() {
        SimplexTableau t = buildSimpleLeqTableau();
        assertEquals(t.hashCode(), t.hashCode());
    }

    // ---------------------------------------------------------------
    // 17) ค่า null/ผิดรูปแบบ
    // ---------------------------------------------------------------
    @Test(expected = NullPointerException.class)
    public void testConstructor_NullObjectiveFunction_ThrowsNPE() {
        List<LinearConstraint> cs = list(
            new LinearConstraint(new double[]{1}, Relationship.LEQ, 1)
        );
        new SimplexTableau(null, cs, GoalType.MAXIMIZE, true, EPS);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructor_NullConstraints_ThrowsNPE() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1}, 0);
        new SimplexTableau(f, null, GoalType.MAXIMIZE, true, EPS);
    }

    /**
     * goalType == null: เงื่อนไข `goalType == GoalType.MAXIMIZE` ใช้ `==`
     * ดังนั้น null จะได้ผลเป็น false (ไม่ throw) และพฤติกรรมจะเหมือนกรณี minimize.
     * (อ้างอิงตรงจากซอร์สที่ให้มา ไม่ใช่การเดา)
     */
    @Test
    public void testConstructor_NullGoalType_TreatedAsMinimize() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1}, 0);
        List<LinearConstraint> cs = list(
            new LinearConstraint(new double[]{1}, Relationship.LEQ, 5)
        );
        SimplexTableau t = new SimplexTableau(f, cs, null, true, EPS);
        // zIndex = 0 (numObjFunctions == 1); maximize(false) -> matrix[0][0] = -1
        assertEquals(-1.0, t.getEntry(0, 0), EPS);
    }
}
