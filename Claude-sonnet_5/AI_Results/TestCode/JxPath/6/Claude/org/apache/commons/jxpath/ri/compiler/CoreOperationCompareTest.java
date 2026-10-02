package org.apache.commons.jxpath.ri.compiler;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for {@link CoreOperationCompare}.
 *
 * ข้อสมมติที่จำเป็น (เนื่องจากคลาสเป้าหมายเป็น abstract และไม่มี mocking framework ใน classpath):
 * 1) ใช้ {@link CoreOperationEqual} ซึ่งเป็น subclass จริงที่มีอยู่ใน production code
 *    (ตาม Javadoc ของ CoreOperationCompare ที่ระบุว่าเป็น superclass ของ "=" และ "!=")
 *    เพื่อสร้าง instance รูปธรรม โดยไม่ต้องเดา abstract method อื่น ๆ ของ CoreOperation/Operation
 * 2) ใช้ {@link Constant} ซึ่งเป็น concrete Expression จริง และ override เฉพาะ compute(EvalContext)
 *    ซึ่งถูกเรียกใช้จริงในซอร์สที่ให้มา (left.compute(context) / right.compute(context))
 *    - สมมติว่า Constant มี constructor รับ String และ compute() ไม่ใช่ final (polymorphic ตามปกติ)
 * 3) สร้าง Pointer stub ด้วย java.lang.reflect.Proxy เพื่อเลี่ยงการเดา method ทั้งหมดของ interface Pointer
 * 4) Branch "l/r instanceof InitialContext/SelfContext" ไม่ได้ถูกทดสอบตรง ๆ เนื่องจากต้องสร้าง
 *    RootContext/NodePointer ที่ซับซ้อนเกินกว่าจะทำได้อย่างปลอดภัยด้วย library ที่กำหนด
 */
public class CoreOperationCompareTest {

    private CoreOperationCompare compareOp;

    @Before
    public void setUp() {
        compareOp = newCompare(new ValueExpression(null), new ValueExpression(null));
    }

    private static CoreOperationCompare newCompare(Expression a, Expression b) {
        return new CoreOperationEqual(a, b);
    }

    /** Expression stub ที่คืนค่าคงที่ไม่ว่า context จะเป็นอะไร (compute() ถูกเรียกจริงในซอร์สต้นทาง). */
    private static class ValueExpression extends Constant {
        private final Object val;

        ValueExpression(Object val) {
            super(""); // สมมติว่ามี constructor รับ String (literal ว่าง) - ไม่กระทบค่าที่ override คืนกลับ
            this.val = val;
        }

        public Object compute(EvalContext context) {
            return val;
        }
    }

    /** สร้าง Pointer proxy แบบ dynamic เพื่อควบคุม getValue()/equals() โดยไม่ต้องรู้ method ครบของ interface */
    private static Pointer pointer(final Object value, final Pointer equalsTargetTrueFor) {
        return (Pointer) Proxy.newProxyInstance(
            CoreOperationCompareTest.class.getClassLoader(),
            new Class[] { Pointer.class },
            new InvocationHandler() {
                public Object invoke(Object proxy, Method method, Object[] args) {
                    String name = method.getName();
                    if ("getValue".equals(name)) {
                        return value;
                    }
                    if ("equals".equals(name)) {
                        return equalsTargetTrueFor != null && args[0] == equalsTargetTrueFor;
                    }
                    if ("hashCode".equals(name)) {
                        return value == null ? 0 : value.hashCode();
                    }
                    if ("toString".equals(name)) {
                        return "PointerStub[" + value + "]";
                    }
                    return null; // สำหรับ method อื่น ๆ ที่ไม่ได้ใช้ในเส้นทางที่ทดสอบ
                }
            });
    }

    private static class NeverEqualObject {
        public boolean equals(Object o) {
            return false;
        }
    }

    private static class ValueHolder {
        final int v;
        ValueHolder(int v) { this.v = v; }
        public boolean equals(Object o) {
            return (o instanceof ValueHolder) && ((ValueHolder) o).v == v;
        }
    }

    // =========================================================
    // Constructor
    // =========================================================

    @Test
    public void testConstructor_withValidExpressions_doesNotThrow() {
        CoreOperationCompare op = newCompare(new ValueExpression("a"), new ValueExpression("b"));
        assertNotNull(op);
    }

    @Test
    public void testConstructor_withNullExpressions_doesNotThrowAtConstructionTime() {
        // constructor เพียง store array ไม่มี null-check ในซอร์ส
        CoreOperationCompare op = newCompare(null, null);
        assertNotNull(op);
    }

    // =========================================================
    // equal(EvalContext, Expression, Expression) - wrapper method
    // =========================================================

    @Test
    public void testEqualContext_plainScalars_fallsThroughToSimpleEqual() {
        Expression left = new ValueExpression("abc");
        Expression right = new ValueExpression("abc");
        assertTrue(compareOp.equal(null, left, right));
    }

    @Test
    public void testEqualContext_bothNullScalars_returnsTrue() {
        Expression left = new ValueExpression(null);
        Expression right = new ValueExpression(null);
        assertTrue(compareOp.equal(null, left, right));
    }

    @Test
    public void testEqualContext_leftCollection_rightScalar_match() {
        List<Object> coll = Arrays.asList("a", "b");
        Expression left = new ValueExpression(coll);
        Expression right = new ValueExpression("a");
        assertTrue(compareOp.equal(null, left, right));
    }

    @Test
    public void testEqualContext_leftCollection_rightScalar_noMatch() {
        List<Object> coll = Arrays.asList("a", "b");
        Expression left = new ValueExpression(coll);
        Expression right = new ValueExpression("z");
        assertFalse(compareOp.equal(null, left, right));
    }

    @Test
    public void testEqualContext_leftEmptyCollection_rightScalar_returnsFalse() {
        Expression left = new ValueExpression(Collections.emptyList());
        Expression right = new ValueExpression("x");
        assertFalse(compareOp.equal(null, left, right));
    }

    @Test
    public void testEqualContext_rightCollection_leftScalar_match() {
        Expression left = new ValueExpression("b");
        Expression right = new ValueExpression(Arrays.asList("a", "b"));
        assertTrue(compareOp.equal(null, left, right));
    }

    @Test
    public void testEqualContext_bothCollections_withIntersection_returnsTrue() {
        Expression left = new ValueExpression(Arrays.asList("a", "b"));
        Expression right = new ValueExpression(Arrays.asList("b", "c"));
        assertTrue(compareOp.equal(null, left, right));
    }

    @Test
    public void testEqualContext_bothCollections_noIntersection_returnsFalse() {
        Expression left = new ValueExpression(Arrays.asList("a", "b"));
        Expression right = new ValueExpression(Arrays.asList("c", "d"));
        assertFalse(compareOp.equal(null, left, right));
    }

    @Test
    public void testEqualContext_leftRawIterator_rightScalar_match() {
        // ทดสอบเส้นทางที่ l เป็น Iterator อยู่แล้ว (ไม่ผ่าน Collection-check) -> ยังเข้า branch Iterator ได้
        Expression left = new ValueExpression(Arrays.asList("x", "y").iterator());
        Expression right = new ValueExpression("y");
        assertTrue(compareOp.equal(null, left, right));
    }

    // =========================================================
    // contains(Iterator, Object)
    // =========================================================

    @Test
    public void testContains_emptyIterator_returnsFalse() {
        List<Object> list = Collections.emptyList();
        assertFalse(compareOp.contains(list.iterator(), "x"));
    }

    @Test
    public void testContains_matchFound_returnsTrue() {
        List<Object> list = new ArrayList<Object>(Arrays.asList("a", "b", "c"));
        assertTrue(compareOp.contains(list.iterator(), "b"));
    }

    @Test
    public void testContains_noMatch_returnsFalse() {
        List<Object> list = new ArrayList<Object>(Arrays.asList("a", "b"));
        assertFalse(compareOp.contains(list.iterator(), "z"));
    }

    // =========================================================
    // findMatch(Iterator, Iterator)
    // =========================================================

    @Test
    public void testFindMatch_bothEmpty_returnsFalse() {
        List<Object> l = Collections.emptyList();
        List<Object> r = Collections.emptyList();
        assertFalse(compareOp.findMatch(l.iterator(), r.iterator()));
    }

    @Test
    public void testFindMatch_leftEmpty_rightNonEmpty_returnsFalse() {
        List<Object> l = Collections.emptyList();
        List<Object> r = Arrays.asList("x");
        assertFalse(compareOp.findMatch(l.iterator(), r.iterator()));
    }

    @Test
    public void testFindMatch_leftNonEmpty_rightEmpty_returnsFalse() {
        List<Object> l = Arrays.asList("x");
        List<Object> r = Collections.emptyList();
        assertFalse(compareOp.findMatch(l.iterator(), r.iterator()));
    }

    @Test
    public void testFindMatch_noIntersection_returnsFalse() {
        List<Object> l = Arrays.asList("a", "b");
        List<Object> r = Arrays.asList("c", "d");
        assertFalse(compareOp.findMatch(l.iterator(), r.iterator()));
    }

    @Test
    public void testFindMatch_withIntersection_returnsTrue() {
        List<Object> l = Arrays.asList("a", "b", "c");
        List<Object> r = Arrays.asList("x", "b");
        assertTrue(compareOp.findMatch(l.iterator(), r.iterator()));
    }

    // =========================================================
    // equal(Object, Object)
    // =========================================================

    @Test
    public void testEqualObject_bothPointers_equalsTrue_shortCircuits() {
        Pointer p2 = pointer("ignored-2", null);
        Pointer p1 = pointer("ignored-1", p2); // p1.equals(p2) == true ตาม stub
        assertTrue(compareOp.equal(p1, p2));
    }

    @Test
    public void testEqualObject_bothPointers_equalsFalse_fallsBackToValueComparison() {
        Pointer p1 = pointer(new Double(1.0), null); // equals() คืน false เสมอ (ไม่มี target ตรงกัน)
        Pointer p2 = pointer(new Double(2.0), null);
        assertFalse(compareOp.equal(p1, p2)); // getValue(): 1.0 vs 2.0 -> Number branch -> false
    }

    @Test
    public void testEqualObject_leftPointerOnly_unwrapsValue() {
        Pointer p1 = pointer("hello", null);
        assertTrue(compareOp.equal(p1, "hello"));
    }

    @Test
    public void testEqualObject_rightPointerOnly_unwrapsValue() {
        Pointer p2 = pointer("hello", null);
        assertTrue(compareOp.equal("hello", p2));
    }

    @Test
    public void testEqualObject_sameReference_shortCircuitsBeforeEquals() {
        Object o = new NeverEqualObject(); // equals() คืน false เสมอ ถ้าไม่ผ่าน l==r จะได้ false
        assertTrue(compareOp.equal(o, o));
    }

    @Test
    public void testEqualObject_bothNull_returnsTrue() {
        assertTrue(compareOp.equal(null, null));
    }

    @Test
    public void testEqualObject_leftNull_rightNonSpecialObject_returnsFalse() {
        assertFalse(compareOp.equal(null, new Object()));
    }

    @Test
    public void testEqualObject_booleanBoolean_sameValue_true() {
        assertTrue(compareOp.equal(Boolean.TRUE, Boolean.TRUE));
    }

    @Test
    public void testEqualObject_booleanBoolean_differentValue_false() {
        assertFalse(compareOp.equal(Boolean.TRUE, Boolean.FALSE));
    }

    @Test
    public void testEqualObject_numberNumber_equalValues_true() {
        assertTrue(compareOp.equal(new Double(3.0), new Integer(3)));
    }

    @Test
    public void testEqualObject_numberNumber_differentValues_false() {
        assertFalse(compareOp.equal(new Double(3.0), new Integer(4)));
    }

    @Test
    public void testEqualObject_stringString_equalValues_true() {
        assertTrue(compareOp.equal(new String("abc"), new String("abc")));
    }

    @Test
    public void testEqualObject_stringString_differentValues_false() {
        assertFalse(compareOp.equal("abc", "xyz"));
    }

    @Test
    public void testEqualObject_fallbackEquals_true() {
        assertTrue(compareOp.equal(new ValueHolder(5), new ValueHolder(5)));
    }

    @Test
    public void testEqualObject_fallbackEquals_false() {
        assertFalse(compareOp.equal(new ValueHolder(5), new ValueHolder(6)));
    }
}
