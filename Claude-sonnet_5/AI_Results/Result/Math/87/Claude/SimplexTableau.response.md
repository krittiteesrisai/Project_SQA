# การวิเคราะห์และออกแบบชุดทดสอบ

คลาส `SimplexTableau` เป็น package-private จึงต้องวาง test class ไว้ใน package เดียวกัน (`org.apache.commons.math.optimization.linear`)

**หมายเหตุสำคัญ (ตามข้อกำหนดที่ 4):** โค้ดต้นฉบับไม่ได้แสดง class `LinearObjectiveFunction`, `LinearConstraint`, `Relationship` แต่จากการเรียกใช้ใน source (เช่น `f.getCoefficients()`, `f.getConstantTerm()`, `f.getValue(double[])`, `constraint.getRelationship().oppositeRelationship()`) ผมอนุมาน constructor ตามรูปแบบมาตรฐานของ Apache Commons Math เวอร์ชันร่วมสมัย:
- `new LinearObjectiveFunction(double[] coefficients, double constantTerm)`
- `new LinearConstraint(double[] coefficients, Relationship relationship, double value)`
- `Relationship.{LEQ, GEQ, EQ}`

และพบ **จุดที่น่าสงสัยว่าเป็น fault จริง**: ใน constructor, `numSlackVariables`/`numArtificialVariables` ถูกนับจาก `constraints` (ดิบ, ยังไม่ normalize) แต่ `createTableau()` ใช้ `getNormalizedConstraints()` (ที่อาจเปลี่ยน `LEQ`→`GEQ` เมื่อ value ติดลบ) ในการตัดสินใจเขียน artificial variable ทำให้ column offset ที่คำนวณไว้ล่วงหน้าไม่ตรงกับที่เขียนจริง ⇒ อาจเขียนทับคอลัมน์ RHS ผมจึงเขียนเทสเพื่อตรวจสอบพฤติกรรมนี้โดยเฉพาะ (คอมเมนต์กำกับไว้ชัดเจน)

```java
package org.apache.commons.math.optimization.linear;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import org.apache.commons.math.linear.RealVector;
import org.apache.commons.math.linear.RealVectorImpl; // สมมติฐาน: เวอร์ชันนี้ของ commons-math ใช้ RealVectorImpl (สอดคล้องกับ RealMatrixImpl ที่ใช้จริงใน source)
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;

/**
 * Unit tests for {@link SimplexTableau}.
 *
 * หมายเหตุ: LinearObjectiveFunction / LinearConstraint ไม่ได้แสดงใน source ที่ให้มา
 * ผมอนุมาน constructor จากรูปแบบการเรียกใช้ในซอร์สโค้ดเป้าหมาย
 * ถ้า constructor จริงต่างจากนี้ ต้องปรับ test ให้ตรงกับ signature จริง
 */
public class SimplexTableauTest {

    private LinearObjectiveFunction f;
    private Collection<LinearConstraint> constraints;

    @Before
    public void setUp() {
        f = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        constraints = new ArrayList<LinearConstraint>();
    }

    // ---------- Constructor branch coverage ----------

    @Test
    public void testConstructor_LEQ_Maximize_RestrictNonNegative() {
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 2));
        constraints.add(new LinearConstraint(new double[] { 0, 1 }, Relationship.LEQ, 3));
        SimplexTableau t = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);

        assertEquals(2, t.getNumDecisionVariables());
        assertEquals(2, t.getNumSlackVariables());
        assertEquals(0, t.getNumArtificialVariables());
        assertEquals(1, t.getNumObjectiveFunctions());
        assertEquals(2, t.getOriginalNumDecisionVariables());
        assertEquals(6, t.getWidth());  // 1(obj)+2(dec)+2(slack)+0(art)+1(rhs)
        assertEquals(3, t.getHeight()); // 1(obj)+2(constraints)
    }

    @Test
    public void testConstructor_GEQ_CreatesArtificialVariable() {
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.GEQ, 1));
        SimplexTableau t = new SimplexTableau(f, constraints, GoalType.MINIMIZE, true, 1e-6);

        assertEquals(1, t.getNumSlackVariables());
        assertEquals(1, t.getNumArtificialVariables());
        assertEquals(2, t.getNumObjectiveFunctions());
    }

    @Test
    public void testConstructor_EQ_CreatesArtificialVariable() {
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.EQ, 4));
        SimplexTableau t = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);

        assertEquals(0, t.getNumSlackVariables()); // EQ ไม่สร้าง slack
        assertEquals(1, t.getNumArtificialVariables());
        assertEquals(2, t.getNumObjectiveFunctions());
    }

    @Test
    public void testConstructor_RestrictToNonNegativeFalse() {
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 2));
        SimplexTableau t = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, 1e-6);

        assertEquals(3, t.getNumDecisionVariables());       // 2 + 1 (x-)
        assertEquals(2, t.getOriginalNumDecisionVariables());
    }

    @Test
    public void testConstructor_MixedConstraintTypes() {
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 2));
        constraints.add(new LinearConstraint(new double[] { 0, 1 }, Relationship.GEQ, 1));
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.EQ, 4));
        SimplexTableau t = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);

        assertEquals(2, t.getNumSlackVariables());      // LEQ+GEQ
        assertEquals(2, t.getNumArtificialVariables());  // EQ+GEQ
        assertEquals(2, t.getNumObjectiveFunctions());
    }

    @Test
    public void testConstructor_EmptyConstraints() {
        // boundary: ไม่มี constraint เลย
        SimplexTableau t = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertEquals(0, t.getNumSlackVariables());
        assertEquals(0, t.getNumArtificialVariables());
        assertEquals(1, t.getHeight()); // เหลือแค่แถว objective
    }

    @Test(expected = NullPointerException.class)
    public void testConstructor_NullConstraints_ThrowsNPE() {
        // source ไม่มีการตรวจสอบ null -> คาดว่าเกิด NPE ตอน iterate collection
        new SimplexTableau(f, null, GoalType.MAXIMIZE, true, 1e-6);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructor_NullObjectiveFunction_ThrowsNPE() {
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 2));
        new SimplexTableau(null, constraints, GoalType.MAXIMIZE, true, 1e-6);
    }

    // ---------- normalize() branch coverage ----------

    @Test
    public void testNormalizedConstraints_NegativeValueFlipped() {
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.LEQ, -5));
        SimplexTableau t = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);

        List<LinearConstraint> normalized = t.getNormalizedConstraints();
        assertEquals(1, normalized.size());
        LinearConstraint nc = normalized.get(0);
        assertEquals(5.0, nc.getValue(), 1e-9);
        assertEquals(Relationship.GEQ, nc.getRelationship());
        assertEquals(-1.0, nc.getCoefficients().getEntry(0), 1e-9);
        assertEquals(-1.0, nc.getCoefficients().getEntry(1), 1e-9);
    }

    @Test
    public void testNormalizedConstraints_NonNegativeValueUnchanged() {
        constraints.add(new LinearConstraint(new double[] { 2, 3 }, Relationship.GEQ, 7));
        SimplexTableau t = new SimplexTableau(f, constraints, GoalType.MINIMIZE, true, 1e-6);

        List<LinearConstraint> normalized = t.getNormalizedConstraints();
        LinearConstraint nc = normalized.get(0);
        assertEquals(7.0, nc.getValue(), 1e-9);
        assertEquals(Relationship.GEQ, nc.getRelationship());
        assertEquals(2.0, nc.getCoefficients().getEntry(0), 1e-9);
    }

    /**
     * FAULT-DETECTION TEST:
     * พบจากการวิเคราะห์ source ว่า numSlackVariables/numArtificialVariables
     * ถูกนับจาก constraint "ก่อน normalize" (relationship เดิม) แต่ createTableau()
     * ใช้ constraint "หลัง normalize" (relationship อาจเปลี่ยนจาก LEQ เป็น GEQ เมื่อ value<0)
     * ในการตัดสินใจเขียน artificial variable -> อาจเขียนทับคอลัมน์ RHS เพราะ
     * getArtificialVariableOffset() คำนวณจาก numArtificialVariables (ของเดิม=0)
     * แต่พยายามเขียน index ที่ชนกับ RHS offset จริง
     * ถ้า implementation ถูกต้อง ค่า RHS ควรเป็น 5.0 (ค่าที่ normalize แล้ว)
     * ถ้าเกิด bug ค่าที่ได้จะถูกเขียนทับเป็น 1.0 จาก artificial-variable marker
     */
    @Test
    public void testConstructor_NegativeLEQConstraint_PotentialArtificialCountingFault() {
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.LEQ, -5));
        SimplexTableau t = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);

        int row = t.getNumObjectiveFunctions(); // แถวแรกของ constraint
        double rhs = t.getEntry(row, t.getRhsOffset());

        // คาดหวังค่าที่ถูกต้องตามความหมายของ normalized constraint (value=5)
        // *เทสนี้อาจ FAIL หากมี defect ตามที่วิเคราะห์ไว้ข้างบน*
        assertEquals(5.0, rhs, 1e-9);
    }

    // ---------- discardArtificialVariables() branch coverage ----------

    @Test
    public void testDiscardArtificialVariables_NoArtificialVars_EarlyReturn() {
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 2));
        SimplexTableau t = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);

        int widthBefore = t.getWidth();
        int heightBefore = t.getHeight();
        t.discardArtificialVariables();

        assertEquals(widthBefore, t.getWidth());
        assertEquals(heightBefore, t.getHeight());
        assertEquals(0, t.getNumArtificialVariables());
    }

    @Test
    public void testDiscardArtificialVariables_WithArtificialVars() {
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.GEQ, 1));
        SimplexTableau t = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);

        int widthBefore = t.getWidth();
        int heightBefore = t.getHeight();
        int artBefore = t.getNumArtificialVariables();

        t.discardArtificialVariables();

        assertEquals(0, t.getNumArtificialVariables());
        assertEquals(widthBefore - artBefore - 1, t.getWidth());
        assertEquals(heightBefore - 1, t.getHeight());
    }

    // ---------- equals()/hashCode() branch coverage ----------

    @Test
    public void testEquals_SameReference() {
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 2));
        SimplexTableau t = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertTrue(t.equals(t));
    }

    @Test
    public void testEquals_OtherNull() {
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 2));
        SimplexTableau t = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertFalse(t.equals(null));
    }

    @Test
    public void testEquals_DifferentClass_ClassCastExceptionBranch() {
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 2));
        SimplexTableau t = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertFalse(t.equals("not a tableau"));
    }

    @Test
    public void testEquals_EqualTableaus_SharedReferences() {
        // ใช้ reference เดียวกันของ f และ constraints เพื่อไม่ต้องพึ่งพา
        // equals() ของ LinearObjectiveFunction/LinearConstraint ที่ไม่ได้แสดงใน source
        LinearObjectiveFunction sharedF = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        Collection<LinearConstraint> sharedC = new ArrayList<LinearConstraint>();
        sharedC.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 2));

        SimplexTableau t1 = new SimplexTableau(sharedF, sharedC, GoalType.MAXIMIZE, true, 1e-6);
        SimplexTableau t2 = new SimplexTableau(sharedF, sharedC, GoalType.MAXIMIZE, true, 1e-6);

        assertTrue(t1.equals(t2));
        assertEquals(t1.hashCode(), t2.hashCode());
    }

    @Test
    public void testEquals_DifferentEpsilon_ReturnsFalse() {
        LinearObjectiveFunction sharedF = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        Collection<LinearConstraint> sharedC = new ArrayList<LinearConstraint>();
        sharedC.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 2));

        SimplexTableau t1 = new SimplexTableau(sharedF, sharedC, GoalType.MAXIMIZE, true, 1e-6);
        SimplexTableau t2 = new SimplexTableau(sharedF, sharedC, GoalType.MAXIMIZE, true, 1e-5);

        assertFalse(t1.equals(t2));
    }

    @Test
    public void testEquals_DifferentRestrictToNonNegative_ReturnsFalse() {
        LinearObjectiveFunction sharedF = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        Collection<LinearConstraint> sharedC = new ArrayList<LinearConstraint>();
        sharedC.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 2));

        SimplexTableau t1 = new SimplexTableau(sharedF, sharedC, GoalType.MAXIMIZE, true, 1e-6);
        SimplexTableau t2 = new SimplexTableau(sharedF, sharedC, GoalType.MAXIMIZE, false, 1e-6);

        assertFalse(t1.equals(t2));
    }

    // ---------- getSolution() / getBasicRow() branch coverage ----------

    @Test
    public void testGetSolution_InitialState_ReturnsCorrectLength() {
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 2));
        constraints.add(new LinearConstraint(new double[] { 0, 1 }, Relationship.LEQ, 3));
        SimplexTableau t = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);

        RealPointValuePair solution = t.getSolution();
        assertNotNull(solution);
        assertEquals(2, solution.getPoint().length);
    }

    @Test
    public void testGetSolution_DuplicateBasicRow_SetsCoefficientToZero() {
        // x1 และ x2 ปรากฏในแถวเดียวกัน (constraint เดียว) -> basicRow ของทั้งคู่เหมือนกัน
        // จะเข้า branch "basicRows.contains(basicRow)" == true -> coefficients[i] = 0
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.LEQ, 2));
        SimplexTableau t = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);

        RealPointValuePair solution = t.getSolution();
        double[] point = solution.getPoint();
        assertEquals(2.0, point[0], 1e-9);
        assertEquals(0.0, point[1], 1e-9); // ถูกตั้งเป็น 0 เพราะ basicRow ซ้ำ
    }

    @Test
    public void testGetSolution_NullBasicRow_MultipleNonZeroEntries() {
        // คอลัมน์ x1 มีค่า nonzero ในมากกว่า 1 แถว -> getBasicRow คืน null (not basic)
        // ทดสอบ branch "row==null ? row=i : return null" และ basicRows.contains(null)
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.LEQ, 2));
        constraints.add(new LinearConstraint(new double[] { 1, 2 }, Relationship.LEQ, 5));
        SimplexTableau t = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);

        RealPointValuePair solution = t.getSolution();
        double[] point = solution.getPoint();
        assertEquals(0.0, point[0], 1e-9); // basicRow == null -> 0
        assertEquals(0.0, point[1], 1e-9); // basicRows.contains(null)==true -> 0
    }

    // ---------- low-level matrix operation coverage ----------

    @Test
    public void testGetSetEntry_RoundTrip() {
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 2));
        SimplexTableau t = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);

        t.setEntry(0, 0, 99.0);
        assertEquals(99.0, t.getEntry(0, 0), 1e-9);
    }

    @Test
    public void testDivideRow() {
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 2));
        SimplexTableau t = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);

        double before = t.getEntry(1, 0);
        t.divideRow(1, 2.0);
        assertEquals(before / 2.0, t.getEntry(1, 0), 1e-9);
    }

    @Test
    public void testSubtractRow() {
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 2));
        constraints.add(new LinearConstraint(new double[] { 0, 1 }, Relationship.LEQ, 3));
        SimplexTableau t = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);

        double row0 = t.getEntry(0, 0);
        double row1 = t.getEntry(1, 0);
        t.subtractRow(0, 1, 1.0);
        assertEquals(row0 - row1, t.getEntry(0, 0), 1e-9);
    }

    @Test
    public void testGetInvertedCoefficientSum() {
        RealVector v = new RealVectorImpl(new double[] { 1, 2, 3 });
        double sum = SimplexTableau.getInvertedCoeffiecientSum(v);
        assertEquals(-6.0, sum, 1e-9);
    }

    @Test
    public void testGetInvertedCoefficientSum_EmptyVector_BoundaryCase() {
        RealVector v = new RealVectorImpl(new double[] {});
        double sum = SimplexTableau.getInvertedCoeffiecientSum(v);
        assertEquals(0.0, sum, 1e-9); // boundary: ไม่มี element เลย
    }

    // ---------- offsets & accessor coverage ----------

    @Test
    public void testOffsets_Consistency() {
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.GEQ, 1));
        SimplexTableau t = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);

        int numObj = t.getNumObjectiveFunctions();
        assertEquals(numObj + t.getNumDecisionVariables(), t.getSlackVariableOffset());
        assertEquals(numObj + t.getNumDecisionVariables() + t.getNumSlackVariables(),
                     t.getArtificialVariableOffset());
        assertEquals(t.getWidth() - 1, t.getRhsOffset());
    }

    @Test
    public void testGetData_DimensionsMatchWidthHeight() {
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 2));
        SimplexTableau t = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);

        double[][] data = t.getData();
        assertEquals(t.getHeight(), data.length);
        assertEquals(t.getWidth(), data[0].length);
    }
}
```

## สรุปตาราง Branch/Condition ที่ครอบคลุม

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| testConstructor_LEQ_Maximize_RestrictNonNegative | constructor พื้นฐาน, numObjFunctions==1, width/height คำนวณถูกต้อง |
| testConstructor_GEQ_CreatesArtificialVariable | `Relationship.GEQ` branch ใน createTableau (slack=-1 + artificial), numObjFunctions==2 |
| testConstructor_EQ_CreatesArtificialVariable | `Relationship.EQ` branch (ไม่มี slack แต่มี artificial) |
| testConstructor_RestrictToNonNegativeFalse | branch `!restrictToNonNegative` (x- variable เพิ่ม, getInvertedCoeffiecientSum ถูกเรียก) |
| testConstructor_MixedConstraintTypes | LEQ+GEQ+EQ ผสมกัน, loop ทุก branch ในแถว constraint |
| testConstructor_EmptyConstraints | boundary: loop 0 ครั้งใน createTableau และ getConstraintTypeCounts |
| testConstructor_NullConstraints_ThrowsNPE | null input, ไม่มีการป้องกันใน source |
| testConstructor_NullObjectiveFunction_ThrowsNPE | null input ของ f |
| testNormalizedConstraints_NegativeValueFlipped | normalize(): `constraint.getValue() < 0` = true |
| testNormalizedConstraints_NonNegativeValueUnchanged | normalize(): else branch |
| testConstructor_NegativeLEQConstraint_PotentialArtificialCountingFault | fault-detection: ตรวจสอบความสอดคล้องของการนับ artificial var ก่อน/หลัง normalize |
| testDiscardArtificialVariables_NoArtificialVars_EarlyReturn | `numArtificialVariables==0` → early return |
| testDiscardArtificialVariables_WithArtificialVars | `numArtificialVariables>0` → rebuild matrix |
| testEquals_SameReference | `this==other` |
| testEquals_OtherNull | `other==null` |
| testEquals_DifferentClass_ClassCastExceptionBranch | catch(ClassCastException) |
| testEquals_EqualTableaus_SharedReferences | all fields equal → true, hashCode consistency |
| testEquals_DifferentEpsilon_ReturnsFalse | epsilon field mismatch |
| testEquals_DifferentRestrictToNonNegative_ReturnsFalse | restrictToNonNegative field mismatch |
| testGetSolution_InitialState_ReturnsCorrectLength | getSolution() ปกติ |
| testGetSolution_DuplicateBasicRow_SetsCoefficientToZero | `basicRows.contains(basicRow)==true` branch |
| testGetSolution_NullBasicRow_MultipleNonZeroEntries | getBasicRow() คืน null (multiple nonzero), `contains(null)` branch |
| testGetSetEntry_RoundTrip | getEntry/setEntry |
| testDivideRow | divideRow loop |
| testSubtractRow | subtractRow loop |
| testGetInvertedCoefficientSum | getInvertedCoeffiecientSum ปกติ |
| testGetInvertedCoefficientSum_EmptyVector_BoundaryCase | boundary: vector ว่าง (loop 0 ครั้ง) |
| testOffsets_Consistency | getSlackVariableOffset/getArtificialVariableOffset/getRhsOffset |
| testGetData_DimensionsMatchWidthHeight | getData() ตรวจสอบขนาด matrix |

**ข้อจำกัดที่ทราบ:** การทดสอบพึ่งพาสมมติฐานเรื่อง constructor signature ของ `LinearObjectiveFunction`/`LinearConstraint` และ class `RealVectorImpl` ซึ่งไม่ได้แสดงในซอร์สที่ให้มา หากไม่ตรงกับ signature จริงต้องปรับการเรียกใช้ให้สอดคล้อง