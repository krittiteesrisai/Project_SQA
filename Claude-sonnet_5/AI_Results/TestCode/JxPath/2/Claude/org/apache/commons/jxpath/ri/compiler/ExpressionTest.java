package org.apache.commons.jxpath.ri.compiler;

import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;

/**
 * JUnit4 test suite for {@link Expression}.
 *
 * หมายเหตุ: Expression เป็น abstract class จึงต้องสร้าง subclass จำลอง (TestExpression)
 * และ stub ของ EvalContext เพื่อทดสอบ public/behavioral logic ของคลาสนี้
 */
public class ExpressionTest {

    // ---------------------------------------------------------------
    // Helper / Stub classes
    // ---------------------------------------------------------------

    /**
     * Concrete subclass ของ Expression สำหรับทดสอบ logic ของ base class
     * (isContextDependent caching, iterate, iteratePointers)
     */
    private static class TestExpression extends Expression {
        private final boolean dependentResult;
        private final Object computeResult;
        int computeContextDependentCalls = 0;

        TestExpression(boolean dependentResult, Object computeResult) {
            this.dependentResult = dependentResult;
            this.computeResult = computeResult;
        }

        public boolean computeContextDependent() {
            computeContextDependentCalls++;
            return dependentResult;
        }

        public Object computeValue(EvalContext context) {
            return computeResult;
        }

        public Object compute(EvalContext context) {
            return computeResult;
        }
    }

    /**
     * Minimal stub implementation ของ EvalContext
     *
     * *** คำเตือน / ข้อสมมติ ***
     * ซอร์สของ interface EvalContext ไม่ได้ให้มาในโจทย์ จึง implement ตาม public API
     * ที่ทราบว่า EvalContext extends Cloneable, Iterator (จำเป็นสำหรับการ cast
     * `(EvalContext) result` กลับเป็น Iterator ใน iteratePointers()).
     * หากโครงสร้างจริงมี method อื่นเพิ่ม/ต่าง ให้ปรับ stub นี้ตามจริง
     */
    private static class StubEvalContext implements EvalContext {
        private final NodePointer currentNodePointer;
        private final EvalContext rootContext;

        StubEvalContext(NodePointer currentNodePointer) {
            this.currentNodePointer = currentNodePointer;
            this.rootContext = this;
        }

        public EvalContext getParentContext() {
            return null;
        }

        public EvalContext getRootContext() {
            return rootContext;
        }

        public NodePointer getCurrentNodePointer() {
            return currentNodePointer;
        }

        public NodePointer getSingleNodePointer() {
            return currentNodePointer;
        }

        public int getCurrentPosition() {
            return 1;
        }

        public boolean setPosition(int position) {
            return false;
        }

        public boolean nextNode() {
            return false;
        }

        public boolean nextSet() {
            return false;
        }

        public void reset() {
        }

        public Object clone() {
            return this;
        }

        // Iterator part
        public boolean hasNext() {
            return false;
        }

        public Object next() {
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private NodePointer samplePointer;
    private StubEvalContext stubContext;

    @Before
    public void setUp() {
        samplePointer = NodePointer.newNodePointer(
                new QName(null, "root"), "rootValue", Locale.US);
        stubContext = new StubEvalContext(samplePointer);
    }

    // =================================================================
    // isContextDependent()
    // =================================================================

    @Test
    public void testIsContextDependent_trueCachedAfterFirstCall() {
        TestExpression expr = new TestExpression(true, "x");
        assertTrue(expr.isContextDependent());
        assertTrue(expr.isContextDependent());
        // computeContextDependent() ต้องถูกเรียกเพียงครั้งเดียว (cache ทำงานถูกต้อง)
        assertEquals(1, expr.computeContextDependentCalls);
    }

    @Test
    public void testIsContextDependent_falseCachedAfterFirstCall() {
        TestExpression expr = new TestExpression(false, "x");
        assertFalse(expr.isContextDependent());
        assertFalse(expr.isContextDependent());
        assertEquals(1, expr.computeContextDependentCalls);
    }

    // =================================================================
    // iterate(EvalContext)
    // =================================================================

    @Test
    public void testIterate_resultIsEvalContext() {
        // compute() คืนค่าเป็น EvalContext -> ต้อง wrap ด้วย ValueIterator
        TestExpression expr = new TestExpression(false, stubContext);
        Iterator it = expr.iterate(stubContext);
        assertTrue(it instanceof Expression.ValueIterator);
        assertFalse(it.hasNext()); // StubEvalContext.hasNext() == false
    }

    @Test
    public void testIterate_resultIsPlainValue() {
        // compute() คืนค่าธรรมดา -> path ValueUtils.iterate(result)
        TestExpression expr = new TestExpression(false, "hello");
        Iterator it = expr.iterate(stubContext);
        assertNotNull(it);
        assertTrue(it.hasNext());
        assertEquals("hello", it.next());
    }

    @Test
    public void testIterate_resultIsEmptyString() {
        // boundary: empty string value
        TestExpression expr = new TestExpression(false, "");
        Iterator it = expr.iterate(stubContext);
        assertNotNull(it);
        assertTrue(it.hasNext());
        assertEquals("", it.next());
    }

    @Test
    public void testIterate_resultIsNull() {
        // หมายเหตุ: พฤติกรรมละเอียดของ ValueUtils.iterate(null) ไม่ได้ระบุในซอร์สที่ให้มา
        // (เป็น utility class ภายนอก) จึงตรวจสอบเพียงว่าไม่เกิด NPE และคืน Iterator ที่ใช้งานได้
        TestExpression expr = new TestExpression(false, null);
        Iterator it = expr.iterate(stubContext);
        assertNotNull(it);
    }

    // =================================================================
    // iteratePointers(EvalContext)
    // =================================================================

    @Test
    public void testIteratePointers_resultIsNull() {
        // branch: result == null -> Collections.EMPTY_LIST.iterator()
        TestExpression expr = new TestExpression(false, null);
        Iterator it = expr.iteratePointers(stubContext);
        assertNotNull(it);
        assertFalse(it.hasNext());
    }

    @Test
    public void testIteratePointers_resultIsEvalContext() {
        // branch: result instanceof EvalContext -> คืนตัวมันเองในฐานะ Iterator
        TestExpression expr = new TestExpression(false, stubContext);
        Iterator it = expr.iteratePointers(stubContext);
        assertSame(stubContext, it);
    }

    @Test
    public void testIteratePointers_resultIsPlainValue_wrapsAsPointer() {
        // branch: else -> PointerIterator(ValueUtils.iterate(result), qname, locale)
        TestExpression expr = new TestExpression(false, "plainValue");
        Iterator it = expr.iteratePointers(stubContext);
        assertTrue(it.hasNext());
        Object o = it.next();
        assertTrue(o instanceof Pointer);
        assertEquals("plainValue", ((Pointer) o).getValue());
    }

    @Test
    public void testIteratePointers_resultIsPointerItself_notRewrapped() {
        // ถ้าค่าที่ ValueUtils.iterate คืนมาเป็น Pointer อยู่แล้ว ไม่ควรถูก wrap ซ้ำ
        TestExpression expr = new TestExpression(false, samplePointer);
        Iterator it = expr.iteratePointers(stubContext);
        assertTrue(it.hasNext());
        Object o = it.next();
        assertSame(samplePointer, o);
    }

    // =================================================================
    // PointerIterator (nested static class)
    // =================================================================

    @Test
    public void testPointerIterator_hasNextDelegatesAndIteratesAll() {
        Iterator inner = Arrays.asList("a", "b").iterator();
        Expression.PointerIterator pi = new Expression.PointerIterator(
                inner, new QName(null, "value"), Locale.US);
        assertTrue(pi.hasNext());
        pi.next();
        assertTrue(pi.hasNext());
        pi.next();
        assertFalse(pi.hasNext());
    }

    @Test
    public void testPointerIterator_nextWrapsNonPointer() {
        // branch: o is not instanceof Pointer -> NodePointer.newNodePointer(...)
        Iterator inner = Collections.singletonList("value1").iterator();
        Expression.PointerIterator pi = new Expression.PointerIterator(
                inner, new QName(null, "value"), Locale.US);
        Object o = pi.next();
        assertTrue(o instanceof Pointer);
        assertEquals("value1", ((Pointer) o).getValue());
    }

    @Test
    public void testPointerIterator_nextReturnsPointerAsIs() {
        // branch: o instanceof Pointer -> คืนค่าเดิม ไม่ wrap ซ้ำ
        List<Object> list = new ArrayList<Object>();
        list.add(samplePointer);
        Iterator inner = list.iterator();
        Expression.PointerIterator pi = new Expression.PointerIterator(
                inner, new QName(null, "value"), Locale.US);
        Object o = pi.next();
        assertSame(samplePointer, o);
    }

    @Test(expected = NoSuchElementException.class)
    public void testPointerIterator_next_emptyIterator_throws() {
        // boundary: empty underlying iterator
        Iterator inner = Collections.emptyList().iterator();
        Expression.PointerIterator pi = new Expression.PointerIterator(
                inner, new QName(null, "value"), Locale.US);
        assertFalse(pi.hasNext());
        pi.next(); // underlying iterator จะ throw NoSuchElementException
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testPointerIterator_removeThrows() {
        Iterator inner = Arrays.asList("a").iterator();
        Expression.PointerIterator pi = new Expression.PointerIterator(
                inner, new QName(null, "value"), Locale.US);
        pi.remove();
    }

    // =================================================================
    // ValueIterator (nested static class)
    // =================================================================

    @Test
    public void testValueIterator_hasNextDelegatesAndIteratesAll() {
        Iterator inner = Arrays.asList("a", "b").iterator();
        Expression.ValueIterator vi = new Expression.ValueIterator(inner);
        assertTrue(vi.hasNext());
        vi.next();
        assertTrue(vi.hasNext());
        vi.next();
        assertFalse(vi.hasNext());
    }

    @Test
    public void testValueIterator_nextUnwrapsPointer() {
        // branch: o instanceof Pointer -> คืนค่า getValue()
        List<Object> list = new ArrayList<Object>();
        list.add(samplePointer);
        Iterator inner = list.iterator();
        Expression.ValueIterator vi = new Expression.ValueIterator(inner);
        Object o = vi.next();
        assertEquals("rootValue", o);
    }

    @Test
    public void testValueIterator_nextReturnsPlainValueAsIs() {
        // branch: o is not instanceof Pointer -> คืนค่าเดิม
        Iterator inner = Collections.singletonList("plain").iterator();
        Expression.ValueIterator vi = new Expression.ValueIterator(inner);
        Object o = vi.next();
        assertEquals("plain", o);
    }

    @Test
    public void testValueIterator_nextReturnsNullAsIs() {
        // boundary: null element ในอิเทอเรเตอร์ (ไม่ใช่ Pointer -> คืน null ตรง ๆ)
        List<Object> list = new ArrayList<Object>();
        list.add(null);
        Iterator inner = list.iterator();
        Expression.ValueIterator vi = new Expression.ValueIterator(inner);
        assertNull(vi.next());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testValueIterator_removeThrows() {
        Iterator inner = Arrays.asList("a").iterator();
        Expression.ValueIterator vi = new Expression.ValueIterator(inner);
        vi.remove();
    }
}
