package org.mockito.internal.invocation;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.Test;
import org.mockito.internal.matchers.CapturesArguments;
import org.mockito.internal.reporting.PrintSettings;

public class InvocationMatcherTest {

    // ---------- Fixtures: dummy interface สำหรับทดสอบ method จริง ----------
    interface Foo {
        void simple(String s);
        void simple(int i);   // overload: ชื่อเดียวกัน พารามิเตอร์ต่างกัน
        void other(String s); // ชื่อ method ต่างกัน
    }

    private static Method M_SIMPLE_STR;
    private static Method M_SIMPLE_INT;
    private static Method M_OTHER_STR;

    static {
        try {
            M_SIMPLE_STR = Foo.class.getMethod("simple", String.class);
            M_SIMPLE_INT = Foo.class.getMethod("simple", int.class);
            M_OTHER_STR  = Foo.class.getMethod("other", String.class);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    // ---------- Dummy RealMethod (สมมติ signature ตามที่กล่าวข้างต้น) ----------
    private static final RealMethod DUMMY_REAL_METHOD = new RealMethod() {
        public Object invoke(Object target, Object[] arguments) throws Throwable {
            return null;
        }
    };

    /** สมมติ constructor: Invocation(Object mock, Method method, Object[] args, int seq, RealMethod realMethod) */
    private Invocation newInvocation(Object mock, Method method, Object[] args) {
        return new Invocation(mock, method, args, 1, DUMMY_REAL_METHOD);
    }

    /** ใช้ reflection mark isVerified()==true โดยสมมติ field ชื่อ "verified" */
    private void markVerified(Invocation invocation) {
        try {
            Field f = Invocation.class.getDeclaredField("verified");
            f.setAccessible(true);
            f.setBoolean(invocation, true);
        } catch (Exception e) {
            fail("ไม่สามารถ mark verified ผ่าน reflection ได้ - field name อาจไม่ตรงกับซอร์สจริง: " + e);
        }
    }

    // ---------- Custom hamcrest Matchers ----------
    private static class AlwaysTrueMatcher extends BaseMatcher<Object> {
        public boolean matches(Object item) { return true; }
        public void describeTo(Description description) { description.appendText("any"); }
    }

    private static class EqualsLikeMatcher extends BaseMatcher<Object> {
        private final Object wanted;
        EqualsLikeMatcher(Object wanted) { this.wanted = wanted; }
        public boolean matches(Object item) {
            return wanted == null ? item == null : wanted.equals(item);
        }
        public void describeTo(Description description) { description.appendText("eq(" + wanted + ")"); }
    }

    private static class CapturingMatcher extends BaseMatcher<Object> implements CapturesArguments {
        Object captured;
        boolean capturedFlag = false;
        public boolean matches(Object item) { return true; }
        public void describeTo(Description description) { description.appendText("captor"); }
        public void captureFrom(Object argument) {
            this.captured = argument;
            this.capturedFlag = true;
        }
    }

    // =====================================================================
    // Constructor tests
    // =====================================================================

    @Test
    public void constructor_emptyMatchers_usesArgumentsToMatchers() {
        Object mock = new Object();
        Invocation inv = newInvocation(mock, M_SIMPLE_STR, new Object[]{"x"});

        InvocationMatcher im = new InvocationMatcher(inv); // ใช้ Collections.emptyList()

        assertNotNull(im.getMatchers());
        assertEquals(1, im.getMatchers().size());
    }

    @Test
    public void constructor_withExplicitMatchers_usesGivenList() {
        Object mock = new Object();
        Invocation inv = newInvocation(mock, M_SIMPLE_STR, new Object[]{"x"});
        List<Matcher> given = new ArrayList<Matcher>();
        given.add(new AlwaysTrueMatcher());

        InvocationMatcher im = new InvocationMatcher(inv, given);

        assertSame(given, im.getMatchers());
    }

    @Test(expected = NullPointerException.class)
    public void constructor_nullMatchersList_throwsNPE() {
        Object mock = new Object();
        Invocation inv = newInvocation(mock, M_SIMPLE_STR, new Object[]{"x"});
        new InvocationMatcher(inv, null); // matchers.isEmpty() -> NPE
    }

    // =====================================================================
    // getMethod / getInvocation / getMatchers / getLocation
    // =====================================================================

    @Test
    public void getMethod_returnsUnderlyingInvocationMethod() {
        Object mock = new Object();
        Invocation inv = newInvocation(mock, M_SIMPLE_STR, new Object[]{"x"});
        InvocationMatcher im = new InvocationMatcher(inv);

        assertEquals(M_SIMPLE_STR, im.getMethod());
    }

    @Test
    public void getInvocation_returnsSameReference() {
        Object mock = new Object();
        Invocation inv = newInvocation(mock, M_SIMPLE_STR, new Object[]{"x"});
        InvocationMatcher im = new InvocationMatcher(inv);

        assertSame(inv, im.getInvocation());
    }

    @Test
    public void getMatchers_derivedFromArguments_whenEmptyMatchersGiven() {
        Object mock = new Object();
        Invocation inv = newInvocation(mock, M_SIMPLE_STR, new Object[]{"hello"});
        InvocationMatcher im = new InvocationMatcher(inv, Collections.<Matcher>emptyList());

        assertFalse(im.getMatchers().isEmpty());
        assertEquals(1, im.getMatchers().size());
    }

    @Test
    public void getLocation_notNull() {
        Object mock = new Object();
        Invocation inv = newInvocation(mock, M_SIMPLE_STR, new Object[]{"x"});
        InvocationMatcher im = new InvocationMatcher(inv);

        assertNotNull(im.getLocation());
    }

    // =====================================================================
    // toString / toString(PrintSettings) - sanity (ไม่ assert content เพราะ format ไม่ทราบแน่ชัด)
    // =====================================================================

    @Test
    public void toString_doesNotThrow_andNotNull() {
        Object mock = new Object();
        Invocation inv = newInvocation(mock, M_SIMPLE_STR, new Object[]{"x"});
        InvocationMatcher im = new InvocationMatcher(inv);

        assertNotNull(im.toString());
    }

    @Test
    public void toStringWithPrintSettings_doesNotThrow_andNotNull() {
        Object mock = new Object();
        Invocation inv = newInvocation(mock, M_SIMPLE_STR, new Object[]{"x"});
        InvocationMatcher im = new InvocationMatcher(inv);

        assertNotNull(im.toString(new PrintSettings()));
    }

    // =====================================================================
    // matches(Invocation actual)
    // =====================================================================

    @Test
    public void matches_sameMockSameMethodSameArgs_true() {
        Object mock = new Object();
        Invocation inv1 = newInvocation(mock, M_SIMPLE_STR, new Object[]{"x"});
        Invocation inv2 = newInvocation(mock, M_SIMPLE_STR, new Object[]{"x"});
        InvocationMatcher im = new InvocationMatcher(inv1);

        assertTrue(im.matches(inv2));
    }

    @Test
    public void matches_differentMock_false() {
        Object mock1 = new Object();
        Object mock2 = new Object();
        Invocation inv1 = newInvocation(mock1, M_SIMPLE_STR, new Object[]{"x"});
        Invocation inv2 = newInvocation(mock2, M_SIMPLE_STR, new Object[]{"x"});
        InvocationMatcher im = new InvocationMatcher(inv1);

        assertFalse(im.matches(inv2));
    }

    @Test
    public void matches_differentMethod_false() {
        Object mock = new Object();
        Invocation inv1 = newInvocation(mock, M_SIMPLE_STR, new Object[]{"x"});
        Invocation inv2 = newInvocation(mock, M_OTHER_STR, new Object[]{"x"});
        InvocationMatcher im = new InvocationMatcher(inv1);

        assertFalse(im.matches(inv2));
    }

    @Test
    public void matches_sameMethodDifferentArgs_false() {
        Object mock = new Object();
        Invocation inv1 = newInvocation(mock, M_SIMPLE_STR, new Object[]{"x"});
        Invocation inv2 = newInvocation(mock, M_SIMPLE_STR, new Object[]{"y"});
        InvocationMatcher im = new InvocationMatcher(inv1);

        assertFalse(im.matches(inv2));
    }

    @Test(expected = NullPointerException.class)
    public void matches_actualNull_throwsNPE() {
        Object mock = new Object();
        Invocation inv1 = newInvocation(mock, M_SIMPLE_STR, new Object[]{"x"});
        InvocationMatcher im = new InvocationMatcher(inv1);

        im.matches(null);
    }

    // =====================================================================
    // hasSameMethod(Invocation candidate)
    // =====================================================================

    @Test
    public void hasSameMethod_sameMethod_true() {
        Object mock = new Object();
        Invocation inv1 = newInvocation(mock, M_SIMPLE_STR, new Object[]{"x"});
        Invocation inv2 = newInvocation(mock, M_SIMPLE_STR, new Object[]{"y"});
        InvocationMatcher im = new InvocationMatcher(inv1);

        assertTrue(im.hasSameMethod(inv2));
    }

    @Test
    public void hasSameMethod_differentMethod_false() {
        Object mock = new Object();
        Invocation inv1 = newInvocation(mock, M_SIMPLE_STR, new Object[]{"x"});
        Invocation inv2 = newInvocation(mock, M_OTHER_STR, new Object[]{"x"});
        InvocationMatcher im = new InvocationMatcher(inv1);

        assertFalse(im.hasSameMethod(inv2));
    }

    @Test(expected = NullPointerException.class)
    public void hasSameMethod_candidateNull_throwsNPE() {
        Object mock = new Object();
        Invocation inv1 = newInvocation(mock, M_SIMPLE_STR, new Object[]{"x"});
        InvocationMatcher im = new InvocationMatcher(inv1);

        im.hasSameMethod(null);
    }

    // =====================================================================
    // hasSimilarMethod(Invocation candidate)
    // =====================================================================

    @Test
    public void hasSimilarMethod_differentMethodName_false() {
        Object mock = new Object();
        Invocation inv1 = newInvocation(mock, M_SIMPLE_STR, new Object[]{"x"});
        Invocation inv2 = newInvocation(mock, M_OTHER_STR, new Object[]{"x"});
        InvocationMatcher im = new InvocationMatcher(inv1);

        assertFalse(im.hasSimilarMethod(inv2));
    }

    @Test
    public void hasSimilarMethod_candidateVerified_false() {
        Object mock = new Object();
        Invocation inv1 = newInvocation(mock, M_SIMPLE_STR, new Object[]{"x"});
        Invocation inv2 = newInvocation(mock, M_SIMPLE_STR, new Object[]{"x"});
        markVerified(inv2); // isUnverified -> false

        InvocationMatcher im = new InvocationMatcher(inv1);
        assertFalse(im.hasSimilarMethod(inv2));
    }

    @Test
    public void hasSimilarMethod_differentMock_false() {
        Object mock1 = new Object();
        Object mock2 = new Object();
        Invocation inv1 = newInvocation(mock1, M_SIMPLE_STR, new Object[]{"x"});
        Invocation inv2 = newInvocation(mock2, M_SIMPLE_STR, new Object[]{"x"});
        InvocationMatcher im = new InvocationMatcher(inv1);

        assertFalse(im.hasSimilarMethod(inv2));
    }

    @Test
    public void hasSimilarMethod_exactSameMethod_true() {
        Object mock = new Object();
        Invocation inv1 = newInvocation(mock, M_SIMPLE_STR, new Object[]{"x"});
        Invocation inv2 = newInvocation(mock, M_SIMPLE_STR, new Object[]{"y"});
        InvocationMatcher im = new InvocationMatcher(inv1);

        // methodEquals=true -> overloadedButSameArgs=false -> return true
        assertTrue(im.hasSimilarMethod(inv2));
    }

    @Test
    public void hasSimilarMethod_overloadedSameArgs_false() {
        Object mock = new Object();
        Invocation inv1 = newInvocation(mock, M_SIMPLE_STR, new Object[]{"x"});
        // overload: ชื่อ "simple" เหมือนกัน แต่ param type ต่างกัน, args value เดียวกัน
        Invocation inv2 = newInvocation(mock, M_SIMPLE_INT, new Object[]{"x"});
        InvocationMatcher im = new InvocationMatcher(inv1);

        // methodEquals=false, argsMatch=true -> overloadedButSameArgs=true -> return false
        assertFalse(im.hasSimilarMethod(inv2));
    }

    @Test
    public void hasSimilarMethod_overloadedDifferentArgs_true() {
        Object mock = new Object();
        Invocation inv1 = newInvocation(mock, M_SIMPLE_STR, new Object[]{"x"});
        Invocation inv2 = newInvocation(mock, M_SIMPLE_INT, new Object[]{"different"});
        InvocationMatcher im = new InvocationMatcher(inv1);

        // methodEquals=false, argsMatch=false -> overloadedButSameArgs=false -> return true
        assertTrue(im.hasSimilarMethod(inv2));
    }

    // =====================================================================
    // captureArgumentsFrom(Invocation i)
    // =====================================================================

    @Test
    public void captureArgumentsFrom_capturesWhenIndexWithinBounds() {
        Object mock = new Object();
        CapturingMatcher cm = new CapturingMatcher();
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(cm);

        Invocation declared = newInvocation(mock, M_SIMPLE_STR, new Object[]{"ignored"});
        InvocationMatcher im = new InvocationMatcher(declared, matchers);

        Invocation actual = newInvocation(mock, M_SIMPLE_STR, new Object[]{"captured-value"});
        im.captureArgumentsFrom(actual);

        assertTrue(cm.capturedFlag);
        assertEquals("captured-value", cm.captured);
    }

    @Test
    public void captureArgumentsFrom_skipsNonCapturingMatcher() {
        Object mock = new Object();
        EqualsLikeMatcher plain = new EqualsLikeMatcher("whatever");
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(plain);

        Invocation declared = newInvocation(mock, M_SIMPLE_STR, new Object[]{"x"});
        InvocationMatcher im = new InvocationMatcher(declared, matchers);

        Invocation actual = newInvocation(mock, M_SIMPLE_STR, new Object[]{"y"});
        // ไม่ควร throw exception แม้ matcher ไม่ใช่ CapturesArguments
        im.captureArgumentsFrom(actual);
    }

    @Test
    public void captureArgumentsFrom_boundaryIndexEqualsLength_noCaptureForThatMatcher() {
        Object mock = new Object();
        CapturingMatcher cm0 = new CapturingMatcher(); // k=0, args.length=2 -> capture
        CapturingMatcher cm1 = new CapturingMatcher(); // k=1, args.length=2 -> capture
        CapturingMatcher cm2 = new CapturingMatcher(); // k=2, args.length=2 -> 2>2 false -> ไม่ capture (boundary)
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(cm0);
        matchers.add(cm1);
        matchers.add(cm2);

        Invocation declared = newInvocation(mock, M_SIMPLE_STR, new Object[]{"a", "b"});
        InvocationMatcher im = new InvocationMatcher(declared, matchers);

        Invocation actual = newInvocation(mock, M_SIMPLE_STR, new Object[]{"a1", "b1"});
        im.captureArgumentsFrom(actual);

        assertTrue(cm0.capturedFlag);
        assertEquals("a1", cm0.captured);
        assertTrue(cm1.capturedFlag);
        assertEquals("b1", cm1.captured);
        assertFalse(cm2.capturedFlag); // สำคัญ: ตรวจจับ off-by-one fault ของ ">" operator
    }

    @Test
    public void captureArgumentsFrom_emptyMatchers_noException() {
        Object mock = new Object();
        Invocation declared = newInvocation(mock, M_SIMPLE_STR, new Object[]{"x"});
        InvocationMatcher im = new InvocationMatcher(declared, Collections.<Matcher>emptyList());

        Invocation actual = newInvocation(mock, M_SIMPLE_STR, new Object[]{"y"});
        im.captureArgumentsFrom(actual); // ไม่ loop เลย, ไม่ throw
    }

    @Test(expected = NullPointerException.class)
    public void captureArgumentsFrom_invocationNull_throwsNPE() {
        Object mock = new Object();
        CapturingMatcher cm = new CapturingMatcher();
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(cm);

        Invocation declared = newInvocation(mock, M_SIMPLE_STR, new Object[]{"x"});
        InvocationMatcher im = new InvocationMatcher(declared, matchers);

        im.captureArgumentsFrom(null); // i.getArguments() -> NPE
    }

    // =====================================================================
    // createFrom(List<Invocation> invocations)
    // =====================================================================

    @Test
    public void createFrom_emptyList_returnsEmptyList() {
        List<Invocation> empty = new LinkedList<Invocation>();
        List<InvocationMatcher> result = InvocationMatcher.createFrom(empty);

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void createFrom_multipleInvocations_wrapsEachCorrectly() {
        Object mock = new Object();
        Invocation inv1 = newInvocation(mock, M_SIMPLE_STR, new Object[]{"x"});
        Invocation inv2 = newInvocation(mock, M_OTHER_STR, new Object[]{"y"});

        List<Invocation> invocations = new LinkedList<Invocation>();
        invocations.add(inv1);
        invocations.add(inv2);

        List<InvocationMatcher> result = InvocationMatcher.createFrom(invocations);

        assertEquals(2, result.size());
        assertSame(inv1, result.get(0).getInvocation());
        assertSame(inv2, result.get(1).getInvocation());
    }

    @Test(expected = NullPointerException.class)
    public void createFrom_nullList_throwsNPE() {
        InvocationMatcher.createFrom(null); // for-each บน null -> NPE
    }
}
