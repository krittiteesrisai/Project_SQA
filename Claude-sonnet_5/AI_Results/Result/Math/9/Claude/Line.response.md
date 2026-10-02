# การวิเคราะห์ Branch/Condition ของคลาส `Line`

ก่อนเขียนเทส ได้วิเคราะห์ branch ต่าง ๆ ในคลาสเป้าหมายดังนี้:

- `reset()`: `if (norm2 == 0.0)` → true/false
- `isSimilarTo()`: `(angle < 1e-10) || (angle > PI-1e-10)) && contains(...)` → ต้อง cover ทั้ง short-circuit และ full evaluation
- `contains()`: `distance(p) < 1e-10` → true/false
- `distance(Line)`: `if (n < Precision.SAFE_MIN)` → parallel/not-parallel
- `closestPoint()`: `if (n < Precision.EPSILON)` → parallel/not-parallel
- `intersection()`: ternary `line.contains(closest) ? closest : null` → true/false

## โค้ดชุดทดสอบ (LineTest.java)

```java
package org.apache.commons.math3.geometry.euclidean.threed;

import static org.junit.Assert.*;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.junit.Test;

public class LineTest {

    private static final double EPS = 1.0e-10;

    // ---------- Constructor / reset ----------

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructorEqualPointsThrows() {
        // boundary: p1 == p2 -> norm2 == 0.0 -> throw
        Vector3D p1 = new Vector3D(1, 2, 3);
        Vector3D p2 = new Vector3D(1, 2, 3);
        new Line(p1, p2);
    }

    @Test
    public void testConstructorValidPoints() {
        Vector3D p1 = new Vector3D(0, 0, 0);
        Vector3D p2 = new Vector3D(1, 0, 0);
        Line line = new Line(p1, p2);

        assertEquals(1.0, line.getDirection().getX(), EPS);
        assertEquals(0.0, line.getDirection().getY(), EPS);
        assertEquals(0.0, line.getDirection().getZ(), EPS);

        // line passes through origin -> closest point to origin = (0,0,0)
        assertEquals(0.0, line.getOrigin().getX(), EPS);
        assertEquals(0.0, line.getOrigin().getY(), EPS);
        assertEquals(0.0, line.getOrigin().getZ(), EPS);
    }

    @Test
    public void testResetChangesLine() {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));

        line.reset(new Vector3D(0, 0, 0), new Vector3D(0, 1, 0));

        assertEquals(0.0, line.getDirection().getX(), EPS);
        assertEquals(1.0, line.getDirection().getY(), EPS);
        assertEquals(0.0, line.getDirection().getZ(), EPS);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testResetEqualPointsThrows() {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        line.reset(new Vector3D(2, 2, 2), new Vector3D(2, 2, 2));
    }

    @Test
    public void testCopyConstructor() {
        Line original = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        Line copy = new Line(original);
        assertEquals(original.getDirection().getX(), copy.getDirection().getX(), EPS);
        assertEquals(original.getOrigin().getX(), copy.getOrigin().getX(), EPS);
    }

    // ---------- revert ----------

    @Test
    public void testRevertReversesDirection() {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        Line reverted = line.revert();
        assertEquals(-1.0, reverted.getDirection().getX(), EPS);
        assertEquals(0.0, reverted.getDirection().getY(), EPS);
        assertEquals(0.0, reverted.getDirection().getZ(), EPS);
    }

    // ---------- getAbscissa / pointAt ----------

    @Test
    public void testGetAbscissaAtOrigin() {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        assertEquals(0.0, line.getAbscissa(line.getOrigin()), EPS);
    }

    @Test
    public void testGetAbscissaPositiveAndNegative() {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        assertEquals(5.0, line.getAbscissa(new Vector3D(5, 0, 0)), EPS);
        assertEquals(-3.0, line.getAbscissa(new Vector3D(-3, 0, 0)), EPS);
    }

    @Test
    public void testPointAtRoundTrip() {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        Vector3D p = line.pointAt(4.0);
        assertEquals(4.0, line.getAbscissa(p), EPS);
    }

    // ---------- toSubSpace / toSpace ----------

    @Test
    public void testToSubSpaceAndToSpace() {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));

        Vector3D point = new Vector3D(7, 0, 0);
        Vector1D sub = line.toSubSpace(point);
        assertEquals(7.0, sub.getX(), EPS);

        Vector3D back = line.toSpace(sub);
        assertEquals(7.0, back.getX(), EPS);
        assertEquals(0.0, back.getY(), EPS);
        assertEquals(0.0, back.getZ(), EPS);
    }

    // ---------- isSimilarTo ----------

    @Test
    public void testIsSimilarTo_SameDirectionAndContains_True() {
        Line line1 = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        Line line2 = new Line(new Vector3D(5, 0, 0), new Vector3D(6, 0, 0));
        assertTrue(line1.isSimilarTo(line2));
    }

    @Test
    public void testIsSimilarTo_OppositeDirectionAndContains_True() {
        Line line1 = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        // reversed direction, but passes through same points -> zero stays (0,0,0)
        Line line2 = new Line(new Vector3D(6, 0, 0), new Vector3D(5, 0, 0));
        assertTrue(line1.isSimilarTo(line2));
    }

    @Test
    public void testIsSimilarTo_DifferentAngle_False() {
        Line line1 = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        Line line2 = new Line(new Vector3D(0, 0, 0), new Vector3D(0, 1, 0)); // perpendicular
        assertFalse(line1.isSimilarTo(line2));
    }

    @Test
    public void testIsSimilarTo_SameDirectionButNotContains_False() {
        Line line1 = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        // parallel but offset by y=1 -> angle small but contains() is false
        Line line2 = new Line(new Vector3D(5, 1, 0), new Vector3D(6, 1, 0));
        assertFalse(line1.isSimilarTo(line2));
    }

    // ---------- contains ----------

    @Test
    public void testContains_True() {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        assertTrue(line.contains(new Vector3D(3, 0, 0)));
    }

    @Test
    public void testContains_False() {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        assertFalse(line.contains(new Vector3D(3, 1, 0)));
    }

    // ---------- distance(Vector3D) ----------

    @Test
    public void testDistanceToPoint_OnLine() {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        assertEquals(0.0, line.distance(new Vector3D(5, 0, 0)), EPS);
    }

    @Test
    public void testDistanceToPoint_OffLine() {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        assertEquals(2.0, line.distance(new Vector3D(0, 2, 0)), EPS);
    }

    // ---------- distance(Line) ----------

    @Test
    public void testDistanceToLine_Parallel() {
        Line line1 = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        Line line2 = new Line(new Vector3D(0, 3, 0), new Vector3D(1, 3, 0));
        assertEquals(3.0, line1.distance(line2), EPS);
    }

    @Test
    public void testDistanceToLine_NotParallel_Intersecting() {
        Line line1 = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        Line line2 = new Line(new Vector3D(0, 0, 0), new Vector3D(0, 1, 0));
        assertEquals(0.0, line1.distance(line2), EPS);
    }

    @Test
    public void testDistanceToLine_NotParallel_Skew() {
        Line line1 = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        Line line2 = new Line(new Vector3D(0, 0, 1), new Vector3D(0, 1, 1));
        assertEquals(1.0, line1.distance(line2), EPS);
    }

    // ---------- closestPoint ----------

    @Test
    public void testClosestPoint_Parallel() {
        Line line1 = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        Line line2 = new Line(new Vector3D(0, 3, 0), new Vector3D(1, 3, 0));
        Vector3D closest = line1.closestPoint(line2);
        // when parallel, returns this.zero
        assertEquals(line1.getOrigin().getX(), closest.getX(), EPS);
        assertEquals(line1.getOrigin().getY(), closest.getY(), EPS);
        assertEquals(line1.getOrigin().getZ(), closest.getZ(), EPS);
    }

    @Test
    public void testClosestPoint_NotParallel() {
        Line line1 = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        Line line2 = new Line(new Vector3D(5, 0, 1), new Vector3D(5, 1, 1));
        Vector3D closest = line1.closestPoint(line2);
        assertEquals(5.0, closest.getX(), EPS);
        assertEquals(0.0, closest.getY(), EPS);
        assertEquals(0.0, closest.getZ(), EPS);
    }

    // ---------- intersection ----------

    @Test
    public void testIntersection_Found() {
        Line line1 = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        Line line2 = new Line(new Vector3D(3, -1, 0), new Vector3D(3, 1, 0));
        Vector3D intersection = line1.intersection(line2);
        assertNotNull(intersection);
        assertEquals(3.0, intersection.getX(), EPS);
        assertEquals(0.0, intersection.getY(), EPS);
        assertEquals(0.0, intersection.getZ(), EPS);
    }

    @Test
    public void testIntersection_NotFound() {
        Line line1 = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        Line line2 = new Line(new Vector3D(0, 0, 1), new Vector3D(0, 1, 1)); // skew line
        Vector3D intersection = line1.intersection(line2);
        assertNull(intersection);
    }

    // ---------- wholeLine ----------

    @Test
    public void testWholeLine() {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        SubLine subLine = line.wholeLine();
        assertNotNull(subLine);
    }
}
```

> **หมายเหตุ (ตามข้อกำหนดที่ 4):**
> - ไม่ได้ทดสอบ `Vector3D` null เพราะ class `Line` ไม่มีการตรวจสอบ null อย่างชัดเจนในซอร์สโค้ด (ถ้าส่ง null จะเกิด `NullPointerException` จาก `Vector3D` ภายใน ซึ่งไม่ใช่ behavior ที่ประกาศไว้ใน `Line` เอง จึงไม่เขียนเทสสำหรับกรณีนี้โดยตรง)
> - ค่า boundary ของ `angle` ที่ใกล้ `1.0e-10` หรือ `PI - 1.0e-10` แบบ exact ไม่ได้ทดสอบ เนื่องจากต้องคำนวณมุมแบบละเอียดมาก ซึ่งขึ้นกับ floating point precision และไม่สามารถ derive ได้อย่างแน่นอนจากซอร์สที่ให้มา

## ตารางสรุป Branch/Condition Coverage

| Test Method | Method ที่ทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| `testConstructorEqualPointsThrows` | `reset()` | `norm2 == 0.0` → true (throw exception) |
| `testConstructorValidPoints` | `reset()` | `norm2 == 0.0` → false (normal case) |
| `testResetChangesLine` | `reset()` | false branch, เปลี่ยนสถานะ instance |
| `testResetEqualPointsThrows` | `reset()` | true branch ผ่าน public `reset()` โดยตรง |
| `testCopyConstructor` | copy constructor | ไม่มี branch, เช็ค deep/shallow fields |
| `testRevertReversesDirection` | `revert()` | ไม่มี branch, เช็คผลลัพธ์ direction |
| `testGetAbscissaAtOrigin` | `getAbscissa()` | ไม่มี branch, boundary = 0 |
| `testGetAbscissaPositiveAndNegative` | `getAbscissa()` | ค่า positive/negative abscissa |
| `testPointAtRoundTrip` | `pointAt()` | ไม่มี branch, round-trip กับ `getAbscissa` |
| `testToSubSpaceAndToSpace` | `toSubSpace()`, `toSpace()` | cast และ round-trip |
| `testIsSimilarTo_SameDirectionAndContains_True` | `isSimilarTo()` | `angle < 1e-10` = true, `contains` = true |
| `testIsSimilarTo_OppositeDirectionAndContains_True` | `isSimilarTo()` | `angle > PI-1e-10` = true, `contains` = true |
| `testIsSimilarTo_DifferentAngle_False` | `isSimilarTo()` | ทั้งสอง angle condition = false (short-circuit, contains ไม่ถูกเรียก) |
| `testIsSimilarTo_SameDirectionButNotContains_False` | `isSimilarTo()` | angle condition = true, `contains` = false |
| `testContains_True` | `contains()` | `distance(p) < 1e-10` = true |
| `testContains_False` | `contains()` | `distance(p) < 1e-10` = false |
| `testDistanceToPoint_OnLine` | `distance(Vector3D)` | boundary distance = 0 |
| `testDistanceToPoint_OffLine` | `distance(Vector3D)` | distance > 0 |
| `testDistanceToLine_Parallel` | `distance(Line)` | `n < SAFE_MIN` = true (parallel branch) |
| `testDistanceToLine_NotParallel_Intersecting` | `distance(Line)` | `n < SAFE_MIN` = false, offset = 0 |
| `testDistanceToLine_NotParallel_Skew` | `distance(Line)` | `n < SAFE_MIN` = false, offset ≠ 0 |
| `testClosestPoint_Parallel` | `closestPoint()` | `n < EPSILON` = true (parallel branch) |
| `testClosestPoint_NotParallel` | `closestPoint()` | `n < EPSILON` = false |
| `testIntersection_Found` | `intersection()` | ternary = true (contains closest) |
| `testIntersection_NotFound` | `intersection()` | ternary = false (null) |
| `testWholeLine` | `wholeLine()` | ไม่มี branch, สร้าง SubLine สำเร็จ |