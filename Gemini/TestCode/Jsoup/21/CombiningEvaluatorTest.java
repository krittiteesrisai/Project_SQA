package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Tag;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class CombiningEvaluatorTest {

    // --- Mock Evaluators สำหรับใช้ในการทดสอบ ---
    
    // Evaluator ที่คืนค่า true เสมอ
    private static class TrueEvaluator extends Evaluator {
        @Override
        public boolean matches(Element root, Element node) {
            return true;
        }
    }

    // Evaluator ที่คืนค่า false เสมอ
    private static class FalseEvaluator extends Evaluator {
        @Override
        public boolean matches(Element root, Element node) {
            return false;
        }
    }

    // Evaluator ที่นับจำนวนครั้งที่ถูกเรียก (ใช้ตรวจสอบ Short-circuit)
    private static class CountingEvaluator extends Evaluator {
        private final boolean result;
        private int matchCount = 0;

        public CountingEvaluator(boolean result) {
            this.result = result;
        }

        @Override
        public boolean matches(Element root, Element node) {
            matchCount++;
            return result;
        }

        public int getMatchCount() {
            return matchCount;
        }
    }

    private final Element root = new Element(Tag.valueOf("div"), "");
    private final Element node = new Element(Tag.valueOf("p"), "");

    // ==================== Tests for And ====================

    @Test
    public void testAndMatchesAllTrue() {
        Evaluator andEval = new CombiningEvaluator.And(new TrueEvaluator(), new TrueEvaluator());
        assertTrue(andEval.matches(root, node));
    }

    @Test
    public void testAndMatchesShortCircuit() {
        CountingEvaluator first = new CountingEvaluator(false);
        CountingEvaluator second = new CountingEvaluator(true);
        
        Evaluator andEval = new CombiningEvaluator.And(first, second);
        assertFalse(andEval.matches(root, node));
        
        // ตรวจสอบว่าเกิด Short-circuit จริง (second ต้องไม่ถูกเรียก)
        assertEquals(1, first.getMatchCount());
        assertEquals(0, second.getMatchCount());
    }

    @Test
    public void testAndEmptyEvaluators() {
        // Edge Case: ไม่มี Evaluator ข้างใน AND ควรเป็น true (Vacuous truth)
        Evaluator andEval = new CombiningEvaluator.And();
        assertTrue(andEval.matches(root, node));
        assertEquals("", andEval.toString());
    }

    @Test
    public void testAndToString() {
        Evaluator e1 = new Evaluator.Tag("div");
        Evaluator e2 = new Evaluator.Tag("p");
        CombiningEvaluator.And andEval = new CombiningEvaluator.And(e1, e2);
        assertNotNull(andEval.toString());
    }

    // ==================== Tests for Or ====================

    @Test
    public void testOrConstructorWithSizeGreaterThanOne() {
        // ทดสอบ Branch: evaluators.size() > 1 -> ห่อด้วย And
        List<Evaluator> list = Arrays.asList(new TrueEvaluator(), new TrueEvaluator());
        CombiningEvaluator.Or orEval = new CombiningEvaluator.Or(list);
        
        // เนื่องจากถูกห่อด้วย And ซ้อนอยู่ข้างใน Or การ match จะยังคงเป็น true
        assertTrue(orEval.matches(root, node));
        assertTrue(orEval.toString().startsWith(":or"));
    }

    @Test
    public void testOrConstructorWithSizeZeroOrOne() {
        // ทดสอบ Branch: evaluators.size() <= 1 (กรณี size = 1)
        List<Evaluator> listSingle = Collections.singletonList(new TrueEvaluator());
        CombiningEvaluator.Or orEvalSingle = new CombiningEvaluator.Or(listSingle);
        assertTrue(orEvalSingle.matches(root, node));

        // ทดสอบ Branch: evaluators.size() <= 1 (กรณี size = 0)
        List<Evaluator> listEmpty = Collections.emptyList();
        CombiningEvaluator.Or orEvalEmpty = new CombiningEvaluator.Or(listEmpty);
        assertFalse(orEvalEmpty.matches(root, node));
    }

    @Test
    public void testOrMatchesShortCircuitAndFailure() {
        CountingEvaluator first = new CountingEvaluator(true);
        CountingEvaluator second = new CountingEvaluator(false);

        CombiningEvaluator.Or orEval = new CombiningEvaluator.Or(Collections.singletonList(first));
        orEval.add(second);

        // ตัวแรกเป็น true -> ต้อง Short-circuit และคืนค่า true ทันที
        assertTrue(orEval.matches(root, node));
        assertEquals(1, first.getMatchCount());
        assertEquals(0, second.getMatchCount());
    }

    @Test
    public void testOrAllFalse() {
        CountingEvaluator first = new CountingEvaluator(false);
        CountingEvaluator second = new CountingEvaluator(false);

        CombiningEvaluator.Or orEval = new CombiningEvaluator.Or(Collections.singletonList(first));
        orEval.add(second);

        // ทั้งหมดเป็น false -> ต้องคืนค่า false
        assertFalse(orEval.matches(root, node));
        assertEquals(1, first.getMatchCount());
        assertEquals(1, second.getMatchCount());
    }
}