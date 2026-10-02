# JUnit 4 Test Suite สำหรับ `CombiningEvaluator`

## หมายเหตุสำคัญก่อนเริ่ม
- คลาส `CombiningEvaluator` และคลาสใน inner `And`, `Or` เป็น **package-private** (ไม่มี modifier) ดังนั้น test class ต้องอยู่ใน package เดียวกัน (`org.jsoup.select`) เพื่อให้ compile และเข้าถึง field `evaluators` ได้ (whitebox testing)
- สร้าง `Evaluator` ปลอมขึ้นมา (`RecordingEvaluator`) เพื่อควบคุมค่า return และตรวจสอบว่าถูกเรียก (`wasCalled`) หรือไม่ สำหรับตรวจ short-circuit ของ loop
- รูปแบบ string ที่แน่นอนของ `StringUtil.join(...)` **ไม่ได้อยู่ในซอร์สที่ให้มา** จึงไม่ assert ค่า exact string ในกรณีที่พึ่งพาการทำงานภายในของ `StringUtil.join` (คอมเมนต์กำกับไว้ในโค้ด) ส่วนรูปแบบของ `Or.toString()` ที่ใช้ `String.format(":or%s", evaluators)` พึ่งพา `ArrayList#toString()` ซึ่งเป็น standard Java behavior ที่แน่นอน จึง assert ตรง ๆ ได้

```java
package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

public class CombiningEvaluatorTest {

    /**
     * Fake Evaluator ใช้สำหรับควบคุมผลลัพธ์ matches() และตรวจสอบว่าถูกเรียกหรือไม่
     * (เพื่อตรวจ short-circuit behavior ของ And/Or loop)
     */
    static class RecordingEvaluator extends Evaluator {
        private final boolean result;
        private final String name;
        boolean wasCalled = false;

        RecordingEvaluator(boolean result, String name) {
            this.result = result;
            this.name = name;
        }

        @Override
        public boolean matches(Element root, Element element) {
            wasCalled = true;
            return result;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    private Element root;
    private Element node;

    @Before
    public void setUp() {
        root = new Element(Tag.valueOf("html"), "");
        node = new Element(Tag.valueOf("div"), "");
    }

    // ===================== And: constructor / loop branches =====================

    @Test
    public void testAnd_EmptyEvaluators_MatchesTrue() {
        // Boundary: evaluators ว่าง -> loop ไม่ทำงานเลย -> ค่า default true
        CombiningEvaluator.And and = new CombiningEvaluator.And(new ArrayList<Evaluator>());
        assertEquals(0, and.evaluators.size());
        assertTrue(and.matches(root, node));
    }

    @Test
    public void testAnd_AllTrue_ReturnsTrue() {
        RecordingEvaluator e1 = new RecordingEvaluator(true, "E1");
        RecordingEvaluator e2 = new RecordingEvaluator(true, "E2");
        CombiningEvaluator.And and = new CombiningEvaluator.And(e1, e2);

        assertTrue(and.matches(root, node));
        assertTrue(e1.wasCalled);
        assertTrue(e2.wasCalled);
    }

    @Test
    public void testAnd_FirstFalse_ShortCircuits() {
        RecordingEvaluator e1 = new RecordingEvaluator(false, "E1");
        RecordingEvaluator e2 = new RecordingEvaluator(true, "E2");
        CombiningEvaluator.And and = new CombiningEvaluator.And(e1, e2);

        assertFalse(and.matches(root, node));
        assertTrue(e1.wasCalled);
        assertFalse(e2.wasCalled); // ต้อง short-circuit: ไม่ถูกเรียกเลย
    }

    @Test
    public void testAnd_SecondFalse_ReturnsFalse() {
        RecordingEvaluator e1 = new RecordingEvaluator(true, "E1");
        RecordingEvaluator e2 = new RecordingEvaluator(false, "E2");
        CombiningEvaluator.And and = new CombiningEvaluator.And(e1, e2);

        assertFalse(and.matches(root, node));
        assertTrue(e1.wasCalled);
        assertTrue(e2.wasCalled);
    }

    @Test
    public void testAnd_VarargsConstructor_SingleEvaluator() {
        RecordingEvaluator e1 = new RecordingEvaluator(true, "E1");
        CombiningEvaluator.And and = new CombiningEvaluator.And(e1);
        assertEquals(1, and.evaluators.size());
        assertSame(e1, and.evaluators.get(0));
    }

    @Test(expected = NullPointerException.class)
    public void testAnd_NullCollectionConstructor_ThrowsNPE() {
        // ตรวจตาม source จริง: this.evaluators.addAll(evaluators) กับ null -> NPE
        new CombiningEvaluator.And((Collection<Evaluator>) null);
    }

    @Test
    public void testAnd_ToString_SingleEvaluator() {
        // กรณี single evaluator: join มักคืนค่า toString ของตัวนั้นตรง ๆ
        RecordingEvaluator e1 = new RecordingEvaluator(true, "E1");
        CombiningEvaluator.And and = new CombiningEvaluator.And(e1);
        assertEquals("E1", and.toString());
    }

    @Test
    public void testAnd_ToString_MultipleEvaluators_OrderPreserved() {
        // NOTE: รูปแบบ separator ที่แน่นอนขึ้นกับ StringUtil.join ซึ่งไม่มีซอร์สให้
        // ตรวจเฉพาะว่าค่า toString มีลำดับถูกต้อง ไม่ assert รูปแบบ exact
        RecordingEvaluator e1 = new RecordingEvaluator(true, "E1");
        RecordingEvaluator e2 = new RecordingEvaluator(true, "E2");
        CombiningEvaluator.And and = new CombiningEvaluator.And(e1, e2);

        String result = and.toString();
        assertNotNull(result);
        assertTrue(result.indexOf("E1") < result.indexOf("E2"));
    }

    @Test
    public void testCombiningEvaluator_CollectionConstructor_CopiesElements() {
        // ตรวจว่า constructor ใช้ addAll (copy) ไม่ใช่ reference เดียวกันกับ list ภายนอก
        RecordingEvaluator e1 = new RecordingEvaluator(true, "E1");
        List<Evaluator> list = new ArrayList<Evaluator>();
        list.add(e1);
        CombiningEvaluator.And and = new CombiningEvaluator.And(list);

        assertEquals(1, and.evaluators.size());
        list.clear();
        assertEquals(1, and.evaluators.size()); // ไม่ได้รับผลกระทบจาก list เดิม
    }

    // ===================== Or: constructor branches (size>1 / size<=1) =====================

    @Test
    public void testOr_ConstructorEmptyCollection() {
        // Boundary: size == 0 -> else branch -> addAll ของ list ว่าง
        CombiningEvaluator.Or or = new CombiningEvaluator.Or(new ArrayList<Evaluator>());
        assertEquals(0, or.evaluators.size());
    }

    @Test
    public void testOr_ConstructorSingleEvaluator_NotWrapped() {
        // Boundary: size == 1 -> else branch -> ไม่ wrap เป็น And
        RecordingEvaluator e1 = new RecordingEvaluator(true, "E1");
        List<Evaluator> list = new ArrayList<Evaluator>();
        list.add(e1);
        CombiningEvaluator.Or or = new CombiningEvaluator.Or(list);

        assertEquals(1, or.evaluators.size());
        assertSame(e1, or.evaluators.get(0));
    }

    @Test
    public void testOr_ConstructorMultipleEvaluators_WrappedInAnd() {
        // size > 1 -> if branch -> wrap เป็น And ตัวเดียว
        RecordingEvaluator e1 = new RecordingEvaluator(true, "E1");
        RecordingEvaluator e2 = new RecordingEvaluator(true, "E2");
        List<Evaluator> list = new ArrayList<Evaluator>();
        list.add(e1);
        list.add(e2);
        CombiningEvaluator.Or or = new CombiningEvaluator.Or(list);

        assertEquals(1, or.evaluators.size());
        assertTrue(or.evaluators.get(0) instanceof CombiningEvaluator.And);
    }

    @Test(expected = NullPointerException.class)
    public void testOr_NullCollectionConstructor_ThrowsNPE() {
        // ตามซอร์สจริง: if (evaluators.size() > 1) เรียก .size() บน null -> NPE
        new CombiningEvaluator.Or(null);
    }

    @Test
    public void testOr_Add() {
        CombiningEvaluator.Or or = new CombiningEvaluator.Or(new ArrayList<Evaluator>());
        RecordingEvaluator e1 = new RecordingEvaluator(true, "E1");
        or.add(e1);
        assertEquals(1, or.evaluators.size());
        assertSame(e1, or.evaluators.get(0));
    }

    // ===================== Or: matches() loop branches =====================

    @Test
    public void testOr_EmptyEvaluators_MatchesFalse() {
        // Boundary: evaluators ว่าง -> loop ไม่ทำงาน -> ค่า default false
        CombiningEvaluator.Or or = new CombiningEvaluator.Or(new ArrayList<Evaluator>());
        assertFalse(or.matches(root, node));
    }

    @Test
    public void testOr_FirstTrue_ShortCircuits() {
        RecordingEvaluator e1 = new RecordingEvaluator(true, "E1");
        RecordingEvaluator e2 = new RecordingEvaluator(true, "E2");
        CombiningEvaluator.Or or = new CombiningEvaluator.Or(new ArrayList<Evaluator>());
        or.add(e1);
        or.add(e2);

        assertTrue(or.matches(root, node));
        assertTrue(e1.wasCalled);
        assertFalse(e2.wasCalled); // short-circuit: e2 ไม่ควรถูกเรียก
    }

    @Test
    public void testOr_SecondTrue_ReturnsTrue() {
        RecordingEvaluator e1 = new RecordingEvaluator(false, "E1");
        RecordingEvaluator e2 = new RecordingEvaluator(true, "E2");
        CombiningEvaluator.Or or = new CombiningEvaluator.Or(new ArrayList<Evaluator>());
        or.add(e1);
        or.add(e2);

        assertTrue(or.matches(root, node));
        assertTrue(e1.wasCalled);
        assertTrue(e2.wasCalled);
    }

    @Test
    public void testOr_AllFalse_ReturnsFalse() {
        RecordingEvaluator e1 = new RecordingEvaluator(false, "E1");
        RecordingEvaluator e2 = new RecordingEvaluator(false, "E2");
        CombiningEvaluator.Or or = new CombiningEvaluator.Or(new ArrayList<Evaluator>());
        or.add(e1);
        or.add(e2);

        assertFalse(or.matches(root, node));
        assertTrue(e1.wasCalled);
        assertTrue(e2.wasCalled);
    }

    // ===================== Or: toString() =====================

    @Test
    public void testOr_ToString_SingleEvaluator() {
        // ArrayList#toString() เป็น standard Java behavior -> assert ตรง ๆ ได้
        RecordingEvaluator e1 = new RecordingEvaluator(true, "E1");
        List<Evaluator> list = new ArrayList<Evaluator>();
        list.add(e1);
        CombiningEvaluator.Or or = new CombiningEvaluator.Or(list);

        assertEquals(":or[E1]", or.toString());
    }

    @Test
    public void testOr_ToString_MultipleEvaluators_Wrapped() {
        // NOTE: toString ของ And ภายใน (wrapped) ขึ้นกับ StringUtil.join ที่ไม่มีซอร์สให้
        // จึงตรวจเฉพาะ wrapping format ":or[...]" และลำดับข้อมูล ไม่ assert exact string
        RecordingEvaluator e1 = new RecordingEvaluator(true, "E1");
        RecordingEvaluator e2 = new RecordingEvaluator(true, "E2");
        List<Evaluator> list = new ArrayList<Evaluator>();
        list.add(e1);
        list.add(e2);
        CombiningEvaluator.Or or = new CombiningEvaluator.Or(list);

        String result = or.toString();
        assertTrue(result.startsWith(":or["));
        assertTrue(result.endsWith("]"));
        assertTrue(result.indexOf("E1") < result.indexOf("E2"));
    }
}
```

## ตารางสรุปความครอบคลุม Branch/Condition

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testAnd_EmptyEvaluators_MatchesTrue` | `And.matches` loop ว่าง (0 รอบ) -> คืน `true` (boundary) |
| `testAnd_AllTrue_ReturnsTrue` | `And.matches` loop ทุกตัว true -> ไม่ `return false` เลย |
| `testAnd_FirstFalse_ShortCircuits` | `And.matches` if `!s.matches()` true ที่ตัวแรก -> short-circuit, `return false` |
| `testAnd_SecondFalse_ReturnsFalse` | `And.matches` if เป็น false ที่ตัวที่สอง -> ทดสอบ loop ดำเนินถึงรอบที่ 2 |
| `testAnd_VarargsConstructor_SingleEvaluator` | `And(Evaluator...)` constructor, size = 1 |
| `testAnd_NullCollectionConstructor_ThrowsNPE` | `CombiningEvaluator(Collection)` กับ null -> NPE (null input) |
| `testAnd_ToString_SingleEvaluator` | `And.toString()` กรณี 1 evaluator |
| `testAnd_ToString_MultipleEvaluators_OrderPreserved` | `And.toString()` กรณีหลาย evaluator (ตรวจลำดับ) |
| `testCombiningEvaluator_CollectionConstructor_CopiesElements` | base constructor `addAll` copy semantics |
| `testOr_ConstructorEmptyCollection` | `Or` constructor, `evaluators.size() > 1` = false (size=0, boundary) |
| `testOr_ConstructorSingleEvaluator_NotWrapped` | `Or` constructor, `size > 1` = false (size=1, boundary) -> else branch |
| `testOr_ConstructorMultipleEvaluators_WrappedInAnd` | `Or` constructor, `size > 1` = true -> if branch, wrap `And` |
| `testOr_NullCollectionConstructor_ThrowsNPE` | `Or` constructor กับ null -> NPE ที่ `evaluators.size()` |
| `testOr_Add` | เมธอด `Or.add()` |
| `testOr_EmptyEvaluators_MatchesFalse` | `Or.matches` loop ว่าง -> คืน `false` (boundary) |
| `testOr_FirstTrue_ShortCircuits` | `Or.matches` if true ที่ตัวแรก -> short-circuit, `return true` |
| `testOr_SecondTrue_ReturnsTrue` | `Or.matches` if false ตัวแรก, true ตัวที่สอง -> ทดสอบ loop ดำเนินถึงรอบ 2 |
| `testOr_AllFalse_ReturnsFalse` | `Or.matches` ทุกตัว false -> ไม่ `return true` เลย |
| `testOr_ToString_SingleEvaluator` | `Or.toString()` format `:or[...]` กรณี 1 ตัว |
| `testOr_ToString_MultipleEvaluators_Wrapped` | `Or.toString()` format `:or[...]` กรณีหลายตัว (wrapped And) |

### จุดที่เดา behavior ไม่ได้ / คอมเมนต์กำกับไว้
- รูปแบบ string ของ `StringUtil.join(...)` ที่ใช้ใน `And.toString()` ไม่มีซอร์สโค้ดให้ จึงไม่ assert ค่า exact string ที่ขึ้นกับ separator/edge case ของ join แต่ตรวจเฉพาะลำดับและเนื้อหาที่ปรากฏ