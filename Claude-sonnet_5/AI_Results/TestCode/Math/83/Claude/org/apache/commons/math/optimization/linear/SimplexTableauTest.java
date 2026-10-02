package org.apache.commons.math.optimization.linear;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.junit.Test;

public class SimplexTableauTest {

    private static final double EPS = 1.0e-6;

    // =========================================================
    // 1. getNumVariables()
    // =========================================================
    @Test
    public void testGetNumVariables() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{3, 5, 7}, 0);
        List<LinearConstraint> c = new ArrayList<LinearConstraint>();
        c.add(new LinearConstraint(new double[]{1, 0, 0}, Relationship.LEQ, 1));
        SimplexTableau t = new SimplexTableau(f, c, GoalType.MAXIMIZE, true, EPS);
        assertEquals(3, t.getNumVariables());
    }

    // =========================================================
    // 2. Constructor: LEQ only, maximize, restrictToNonNegative=true
    //    -> numArtificial=0 -> numObjFunctions=1 ; no x- column
    // =========================================================
    @Test
    public void testConstructor_LEQ_Maximize_TableauValues() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        List<LinearConstraint> c = new ArrayList<LinearConstraint>();
        c.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 4));
        c.add(new LinearConstraint(new double[]{0, 1}, Relationship.LEQ, 4));
        SimplexTableau t = new SimplexTableau(f, c, GoalType.MAXIMIZE, true, EPS);

        assertEquals(1, t.getNumObjectiveFunctions());
        assertEquals(2, t.getNumDecisionVariables());
        assertEquals(2, t.getOriginalNumDecisionVariables());
        assertEquals(2, t.getNumSlackVariables());
        assertEquals(0, t.getNumArtificialVariables());
        assertEquals(6, t.getWidth());
        assertEquals(3, t.getHeight());
        assertEquals(3, t.getSlackVariableOffset());
        assertEquals(5, t.getArtificialVariableOffset());
        assertEquals(5, t.getRhsOffset());

        double[][] expected = {
            {1, -1, -1, 0, 0, 0},
            {0,  1,  0, 1, 0, 4},
            {0,  0,  1, 0, 1, 4}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                assertEquals("row " + i + " col " + j, expected[i][j], t.getEntry(i, j), 1e-9);
            }
        }
    }

    // =========================================================
    // 3. getSolution() ปกติจาก tableau ข้อ 2
    // =========================================================
    @Test
    public void testGetSolution_SimpleBasic() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        List<LinearConstraint> c = new ArrayList<LinearConstraint>();
        c.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 4));
        c.add(new LinearConstraint(new double[]{0, 1}, Relationship.LEQ, 4));
        SimplexTableau t = new SimplexTableau(f, c, GoalType.MAXIMIZE, true, EPS);

        RealPointValuePair sol = t.getSolution();
        assertArrayEquals(new double[]{4, 4}, sol.getPoint(), 1e-9);
        assertEquals(8.0, sol.getValue(), 1e-9);
    }

    // =========================================================
    // 4. Constructor: GEQ -> artificial var -> initialize() subtractRow
    //    numObjFunctions=2, minimize
    // =========================================================
    @Test
    public void testConstructor_GEQ_Minimize_InitializeSubtractsArtificialRow() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        List<LinearConstraint> c = new ArrayList<LinearConstraint>();
        c.add(new LinearConstraint(new double[]{1, 1}, Relationship.GEQ, 2));
        SimplexTableau t = new SimplexTableau(f, c, GoalType.MINIMIZE, true, EPS);

        assertEquals(2, t.getNumObjectiveFunctions());
        assertEquals(1, t.getNumSlackVariables());
        assertEquals(1, t.getNumArtificialVariables());
        assertEquals(7, t.getWidth());
        assertEquals(3, t.getHeight());
        assertEquals(4, t.getSlackVariableOffset());
        assertEquals(5, t.getArtificialVariableOffset());
        assertEquals(6, t.getRhsOffset());

        double[][] expected = {
            {-1, 0, -1, -1, 1, 0, -2},
            { 0,-1,  1,  1, 0, 0,  0},
            { 0, 0,  1,  1,-1, 1,  2}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                assertEquals("row " + i + " col " + j, expected[i][j], t.getEntry(i, j), 1e-9);
            }
        }
    }

    // =========================================================
    // 5. Constructor: EQ only -> numObjFunctions=2, numSlack=0 (branch: no slack arm taken)
    // =========================================================
    @Test
    public void testConstructor_EQ_Only_TableauValues() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1}, 0);
        List<LinearConstraint> c = new ArrayList<LinearConstraint>();
        c.add(new LinearConstraint(new double[]{1}, Relationship.EQ, 5));
        SimplexTableau t = new SimplexTableau(f, c, GoalType.MAXIMIZE, true, EPS);

        assertEquals(2, t.getNumObjectiveFunctions());
        assertEquals(0, t.getNumSlackVariables());
        assertEquals(1, t.getNumArtificialVariables());
        assertEquals(5, t.getWidth());
        assertEquals(3, t.getHeight());
        assertEquals(3, t.getSlackVariableOffset());
        assertEquals(3, t.getArtificialVariableOffset());
        assertEquals(4, t.getRhsOffset());

        double[][] expected = {
            {-1, 0, -1, 0, -5},
            { 0, 1, -1, 0,  0},
            { 0, 0,  1, 1,  5}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                assertEquals("row " + i + " col " + j, expected[i][j], t.getEntry(i, j), 1e-9);
            }
        }
    }

    // =========================================================
    // 6. Constructor: restrictToNonNegative = false -> x- column branch
    // =========================================================
    @Test
    public void testConstructor_RestrictToNonNegativeFalse_TableauValues() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{2, 3}, 5);
        List<LinearConstraint> c = new ArrayList<LinearConstraint>();
        c.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 10));
        SimplexTableau t = new SimplexTableau(f, c, GoalType.MAXIMIZE, false, EPS);

        assertEquals(3, t.getNumDecisionVariables());
        assertEquals(2, t.getOriginalNumDecisionVariables());
        assertEquals(1, t.getNumSlackVariables());
        assertEquals(0, t.getNumArtificialVariables());
        assertEquals(6, t.getWidth());
        assertEquals(2, t.getHeight());
        assertEquals(3, t.getNegativeDecisionVariableOffset());

        double[][] expected = {
            {1, -2, -3, 5,  0,  5},
            {0,  1,  0, -1, 1, 10}
        };
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                assertEquals("row " + i + " col " + j, expected[i][j], t.getEntry(i, j), 1e-9);
            }
        }
    }

    // =========================================================
    // 7. Boundary: constraints ว่าง (empty collection)
    // =========================================================
    @Test
    public void testConstructor_EmptyConstraints_Boundary() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        List<LinearConstraint> c = new ArrayList<LinearConstraint>();
        SimplexTableau t = new SimplexTableau(f, c, GoalType.MAXIMIZE, true, EPS);

        assertEquals(4, t.getWidth());
        assertEquals(1, t.getHeight());
        double[] expectedRow0 = {1, -1, -1, 0};
        for (int j = 0; j < 4; j++) {
            assertEquals(expectedRow0[j], t.getEntry(0, j), 1e-9);
        }
    }

    // =========================================================
    // 8-9. Null input -> NPE (ไม่มี null-check ในซอร์ส -> ควร throw NPE)
    // =========================================================
    @Test(expected = NullPointerException.class)
    public void testConstructor_NullObjectiveFunction_ThrowsNPE() {
        List<LinearConstraint> c = new ArrayList<LinearConstraint>();
        c.add(new LinearConstraint(new double[]{1}, Relationship.LEQ, 1));
        new SimplexTableau(null, c, GoalType.MAXIMIZE, true, EPS);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructor_NullConstraints_ThrowsNPE() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1}, 0);
        new SimplexTableau(f, null, GoalType.MAXIMIZE, true, EPS);
    }

    // =========================================================
    // 10-11. getNormalizedConstraints()
    // =========================================================
    @Test
    public void testGetNormalizedConstraints_NegativeValueFlips() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        List<LinearConstraint> c = new ArrayList<LinearConstraint>();
        c.add(new LinearConstraint(new double[]{2, -3}, Relationship.LEQ, -5));
        SimplexTableau t = new SimplexTableau(f, c, GoalType.MAXIMIZE, true, EPS);

        List<LinearConstraint> norm = t.getNormalizedConstraints();
        assertEquals(1, norm.size());
        LinearConstraint n = norm.get(0);
        assertArrayEquals(new double[]{-2, 3}, n.getCoefficients().getData(), 1e-9);
        assertEquals(Relationship.GEQ, n.getRelationship());
        assertEquals(5.0, n.getValue(), 1e-9);
    }

    @Test
    public void testGetNormalizedConstraints_PositiveValueUnchanged() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        List<LinearConstraint> c = new ArrayList<LinearConstraint>();
        c.add(new LinearConstraint(new double[]{2, 3}, Relationship.GEQ, 5));
        SimplexTableau t = new SimplexTableau(f, c, GoalType.MAXIMIZE, true, EPS);

        List<LinearConstraint> norm = t.getNormalizedConstraints();
        LinearConstraint n = norm.get(0);
        assertArrayEquals(new double[]{2, 3}, n.getCoefficients().getData(), 1e-9);
        assertEquals(Relationship.GEQ, n.getRelationship());
        assertEquals(5.0, n.getValue(), 1e-9);
    }

    // =========================================================
    // 12. discardArtificialVariables() - numArtificialVariables == 0 (no-op)
    // =========================================================
    @Test
    public void testDiscardArtificialVariables_NoArtificial_NoOp() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        List<LinearConstraint> c = new ArrayList<LinearConstraint>();
        c.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 4));
        c.add(new LinearConstraint(new double[]{0, 1}, Relationship.LEQ, 4));
        SimplexTableau t = new SimplexTableau(f, c, GoalType.MAXIMIZE, true, EPS);

        int wBefore = t.getWidth();
        int hBefore = t.getHeight();
        t.discardArtificialVariables();
        assertEquals(0, t.getNumArtificialVariables());
        assertEquals(wBefore, t.getWidth());
        assertEquals(hBefore, t.getHeight());
        assertEquals(1.0, t.getEntry(1, 1), 1e-9); // ยังเท่าเดิม ไม่ถูกแก้ไข
    }

    // =========================================================
    // 13. discardArtificialVariables() - numArtificialVariables > 0
    // =========================================================
    @Test
    public void testDiscardArtificialVariables_WithArtificial_ReducesTableau() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        List<LinearConstraint> c = new ArrayList<LinearConstraint>();
        c.add(new LinearConstraint(new double[]{1, 1}, Relationship.GEQ, 2));
        SimplexTableau t = new SimplexTableau(f, c, GoalType.MINIMIZE, true, EPS);

        t.discardArtificialVariables();

        assertEquals(0, t.getNumArtificialVariables());
        assertEquals(5, t.getWidth());
        assertEquals(2, t.getHeight());

        double[][] expected = {
            {-1, 1, 1,  0, 0},
            { 0, 1, 1, -1, 2}
        };
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                assertEquals("row " + i + " col " + j, expected[i][j], t.getEntry(i, j), 1e-9);
            }
        }
    }

    // =========================================================
    // 14. getSolution() - duplicate basic row -> coefficient ที่ซ้ำถูกตั้งเป็น 0
    // (ปรับ entry ด้วยมือเพื่อ force สถานการณ์)
    // =========================================================
    @Test
    public void testGetSolution_DuplicateBasicRow_SetsZero() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        List<LinearConstraint> c = new ArrayList<LinearConstraint>();
        c.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 1));
        c.add(new LinearConstraint(new double[]{0, 1}, Relationship.LEQ, 1));
        SimplexTableau t = new SimplexTableau(f, c, GoalType.MAXIMIZE, true, EPS);

        // force: ทั้ง x1(col1) และ x2(col2) basic อยู่ row เดียวกัน (row1)
        t.setEntry(1, 1, 1); t.setEntry(1, 2, 1); t.setEntry(1, 3, 0); t.setEntry(1, 4, 0); t.setEntry(1, 5, 5);
        t.setEntry(2, 1, 0); t.setEntry(2, 2, 0); t.setEntry(2, 3, 0); t.setEntry(2, 4, 0); t.setEntry(2, 5, 0);

        RealPointValuePair sol = t.getSolution();
        assertArrayEquals(new double[]{5, 0}, sol.getPoint(), 1e-9);
        assertEquals(5.0, sol.getValue(), 1e-9);
    }

    // =========================================================
    // 15. getSolution() - ambiguous column (ไม่ใช่ 0/1) -> getBasicRow คืน null ทันที
    // =========================================================
    @Test
    public void testGetSolution_AmbiguousColumn_ReturnsNullBasicRow() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        List<LinearConstraint> c = new ArrayList<LinearConstraint>();
        c.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 1));
        c.add(new LinearConstraint(new double[]{0, 1}, Relationship.LEQ, 1));
        SimplexTableau t = new SimplexTableau(f, c, GoalType.MAXIMIZE, true, EPS);

        t.setEntry(1, 1, 1);   t.setEntry(2, 1, 0.5); // col1 ambiguous -> null
        t.setEntry(1, 2, 0);   t.setEntry(2, 2, 1);   // col2 clean basic row2
        t.setEntry(1, 5, 999); t.setEntry(2, 5, 7);

        RealPointValuePair sol = t.getSolution();
        assertArrayEquals(new double[]{0, 7}, sol.getPoint(), 1e-9);
        assertEquals(7.0, sol.getValue(), 1e-9);
    }

    // =========================================================
    // 16. getSolution() - restrictToNonNegative=false, negativeVarBasicRow != null
    //     -> หัก mostNegative
    // =========================================================
    @Test
    public void testGetSolution_RestrictFalse_MostNegativeSubtraction() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        List<LinearConstraint> c = new ArrayList<LinearConstraint>();
        c.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 1));
        SimplexTableau t = new SimplexTableau(f, c, GoalType.MAXIMIZE, false, EPS);
        // width=6 height=2, col: 0=obj,1=x1,2=x2,3=x-,4=slack,5=RHS

        t.setEntry(1, 1, 1); t.setEntry(1, 2, 0); t.setEntry(1, 3, 1);
        t.setEntry(1, 4, 0); t.setEntry(1, 5, 7);

        RealPointValuePair sol = t.getSolution();
        assertArrayEquals(new double[]{0, -7}, sol.getPoint(), 1e-9);
        assertEquals(-7.0, sol.getValue(), 1e-9);
    }

    // =========================================================
    // 17. getSolution() - restrictToNonNegative=false, negativeVarBasicRow == null
    //     -> mostNegative = 0
    // =========================================================
    @Test
    public void testGetSolution_RestrictFalse_NegativeVarBasicRowNull() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        List<LinearConstraint> c = new ArrayList<LinearConstraint>();
        c.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 1));
        SimplexTableau t = new SimplexTableau(f, c, GoalType.MAXIMIZE, false, EPS);

        t.setEntry(1, 1, 1); t.setEntry(1, 2, 0); t.setEntry(1, 3, 0);
        t.setEntry(1, 4, 0); t.setEntry(1, 5, 9);

        RealPointValuePair sol = t.getSolution();
        assertArrayEquals(new double[]{9, 0}, sol.getPoint(), 1e-9);
        assertEquals(9.0, sol.getValue(), 1e-9);
    }

    // =========================================================
    // 18. getSolution() - epsilon มีผลต่อ MathUtils.equals ใน getBasicRow
    // =========================================================
    @Test
    public void testGetSolution_EpsilonAffectsBasicRowTolerance_Loose() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        List<LinearConstraint> c = new ArrayList<LinearConstraint>();
        c.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 1));
        SimplexTableau t = new SimplexTableau(f, c, GoalType.MAXIMIZE, true, 1.0e-6);

        t.setEntry(1, 1, 1.0000005); t.setEntry(1, 2, 0.0); t.setEntry(1, 4, 3.0);

        RealPointValuePair sol = t.getSolution();
        assertArrayEquals(new double[]{3, 0}, sol.getPoint(), 1e-9);
    }

    @Test
    public void testGetSolution_EpsilonAffectsBasicRowTolerance_Tight() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        List<LinearConstraint> c = new ArrayList<LinearConstraint>();
        c.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 1));
        SimplexTableau t = new SimplexTableau(f, c, GoalType.MAXIMIZE, true, 1.0e-9);

        t.setEntry(1, 1, 1.0000005); t.setEntry(1, 2, 0.0); t.setEntry(1, 4, 3.0);

        RealPointValuePair sol = t.getSolution();
        assertArrayEquals(new double[]{0, 0}, sol.getPoint(), 1e-9);
    }

    // =========================================================
    // 19-20. divideRow / subtractRow
    // =========================================================
    @Test
    public void testDivideRow() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        List<LinearConstraint> c = new ArrayList<LinearConstraint>();
        c.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 4));
        c.add(new LinearConstraint(new double[]{0, 1}, Relationship.LEQ, 4));
        SimplexTableau t = new SimplexTableau(f, c, GoalType.MAXIMIZE, true, EPS);

        t.divideRow(1, 2.0);
        double[] expected = {0, 0.5, 0, 0.5, 0, 2};
        for (int j = 0; j < 6; j++) {
            assertEquals(expected[j], t.getEntry(1, j), 1e-9);
        }
    }

    @Test
    public void testSubtractRow() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        List<LinearConstraint> c = new ArrayList<LinearConstraint>();
        c.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 4));
        c.add(new LinearConstraint(new double[]{0, 1}, Relationship.LEQ, 4));
        SimplexTableau t = new SimplexTableau(f, c, GoalType.MAXIMIZE, true, EPS);

        t.subtractRow(2, 1, 1.0);
        double[] expected = {0, -1, 1, -1, 1, 0};
        for (int j = 0; j < 6; j++) {
            assertEquals(expected[j], t.getEntry(2, j), 1e-9);
        }
    }

    // =========================================================
    // 21. getEntry/setEntry round trip
    // =========================================================
    @Test
    public void testGetSetEntry_RoundTrip() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1}, 0);
        List<LinearConstraint> c = new ArrayList<LinearConstraint>();
        c.add(new LinearConstraint(new double[]{1}, Relationship.LEQ, 1));
        SimplexTableau t = new SimplexTableau(f, c, GoalType.MAXIMIZE, true, EPS);
        t.setEntry(0, 0, 42.5);
        assertEquals(42.5, t.getEntry(0, 0), 1e-9);
    }

    // =========================================================
    // 22. getData() ตรงกับ getEntry() ทุกตำแหน่ง
    // =========================================================
    @Test
    public void testGetData_MatchesEntries() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        List<LinearConstraint> c = new ArrayList<LinearConstraint>();
        c.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 4));
        c.add(new LinearConstraint(new double[]{0, 1}, Relationship.LEQ, 4));
        SimplexTableau t = new SimplexTableau(f, c, GoalType.MAXIMIZE, true, EPS);

        double[][] data = t.getData();
        for (int i = 0; i < t.getHeight(); i++) {
            for (int j = 0; j < t.getWidth(); j++) {
                assertEquals(t.getEntry(i, j), data[i][j], 1e-9);
            }
        }
    }

    // =========================================================
    // 23-27. equals()/hashCode()
    // =========================================================
    private SimplexTableau buildStandardTableau(boolean restrictToNonNegative) {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        List<LinearConstraint> c = new ArrayList<LinearConstraint>();
        c.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 4));
        return new SimplexTableau(f, c, GoalType.MAXIMIZE, restrictToNonNegative, EPS);
    }

    @Test
    public void testEquals_SameInstance() {
        SimplexTableau t = buildStandardTableau(true);
        assertTrue(t.equals(t));
    }

    @Test
    public void testEquals_Null() {
        SimplexTableau t = buildStandardTableau(true);
        assertFalse(t.equals(null));
    }

    @Test
    public void testEquals_DifferentClass() {
        SimplexTableau t = buildStandardTableau(true);
        assertFalse(t.equals("not a tableau"));
    }

    @Test
    public void testEquals_EqualObjects() {
        // สมมติว่า LinearObjectiveFunction/LinearConstraint มี equals() ที่ถูกต้อง (ตามที่ commons-math implement)
        SimplexTableau t1 = buildStandardTableau(true);
        SimplexTableau t2 = buildStandardTableau(true);
        assertTrue(t1.equals(t2));
        assertEquals(t1.hashCode(), t2.hashCode());
    }

    @Test
    public void testEquals_DifferentField() {
        SimplexTableau t1 = buildStandardTableau(true);
        SimplexTableau t2 = buildStandardTableau(false);
        assertFalse(t1.equals(t2));
    }

    // =========================================================
    // 28. Serialization round-trip (writeObject/readObject)
    // =========================================================
    @Test
    public void testSerialization_RoundTrip() throws Exception {
        SimplexTableau original = buildStandardTableau(true);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        SimplexTableau restored = (SimplexTableau) ois.readObject();
        ois.close();

        assertEquals(original.getWidth(), restored.getWidth());
        assertEquals(original.getHeight(), restored.getHeight());
        for (int i = 0; i < original.getHeight(); i++) {
            for (int j = 0; j < original.getWidth(); j++) {
                assertEquals(original.getEntry(i, j), restored.getEntry(i, j), 1e-9);
            }
        }
        assertTrue(original.equals(restored));
    }
}
