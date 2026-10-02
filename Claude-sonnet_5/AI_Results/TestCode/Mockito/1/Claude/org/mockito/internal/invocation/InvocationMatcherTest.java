package org.mockito.internal.invocation;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.matchers.CapturesArguments;
import org.mockito.invocation.Invocation;
import org.mockito.invocation.Location;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Unit test สำหรับ {@link InvocationMatcher} (Defects4J Mockito-1b)
 *
 * หมายเหตุสมมติฐานที่ใช้ (ไม่ได้เดา behavior ของคลาสเป้าหมาย แต่เป็น dependency ที่ไม่มี source):
 *  (A) เมื่อไม่ระบุ matcher เอง ArgumentsProcessor จะสร้าง matcher จำนวนเท่ากับ argument และ
 *      จับคู่ด้วย equality ของค่า (นี่คือสัญญาพื้นฐานของ Mockito ไม่ใช่การเดาแบบสุ่ม)
 */
public class InvocationMatcherTest {

    // ---------- Sample class สำหรับสร้าง java.lang.reflect.Method จริง ----------
    static class Sample {
        public void noArgs() {}
        public void oneArg(String s) {}
        public void oneArg(Integer i) {} // overload: ชื่อเดียวกัน, จำนวน param เท่ากัน, type ต่างกัน
        public void twoArgs(String s, int i) {}
        public void varArgsMethod(String... args) {}
    }

    private Method mNoArgs;
    private Method mOneArgString;
    private Method mOneArgInteger;
    private Method mTwoArgs;
    private Method mVarArgs;

    private final Object MOCK_A = new Object();
    private final Object MOCK_B = new Object();

    @Before
    public void setUp() throws Exception {
        mNoArgs = Sample.class.getMethod("noArgs");
        mOneArgString = Sample.class.getMethod("oneArg", String.class);
        mOneArgInteger = Sample.class.getMethod("oneArg", Integer.class);
        mTwoArgs = Sample.class.getMethod("twoArgs", String.class, int.class);
        mVarArgs = Sample.class.getMethod("varArgsMethod", String[].class);
    }

    // ---------- Fake Invocation / Location ผ่าน dynamic proxy ----------

    private Invocation fakeInvocation(final Object mock, final Method method, final Object[] args,
                                       final boolean verified, final Location location) {
        return (Invocation) Proxy.newProxyInstance(
                getClass().getClassLoader(),
                new Class[]{Invocation.class},
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method m, Object[] a) {
                        String name = m.getName();
                        if (name.equals("getMethod")) return method;
                        if (name.equals("getMock")) return mock;
                        if (name.equals("getArguments")) return args;
                        if (name.equals("getRawArguments")) return args;
                        if (name.equals("getArgumentAt")) {
                            int idx = (Integer) a[0];
                            return args[idx];
                        }
                        if (name.equals("getLocation")) return location;
                        if (name.equals("isVerified")) return verified;
                        if (name.equals("toString")) return "FakeInvocation";
                        if (name.equals("equals")) return proxy == a[0];
                        if (name.equals("hashCode")) return System.identityHashCode(proxy);
                        // Fallback: method อื่นที่ไม่รู้จัก (ไม่ถูกเรียกจาก source ที่ให้มา)
                        Class<?> rt = m.getReturnType();
                        if (rt == boolean.class) return false;
                        if (rt.isPrimitive()) return 0;
                        return null;
                    }
                }
        );
    }

    private Invocation fakeInvocation(Object mock, Method method, Object[] args) {
        return fakeInvocation(mock, method, args, false, fakeLocation());
    }

    private Location fakeLocation() {
        return (Location) Proxy.newProxyInstance(
                getClass().getClassLoader(),
                new Class[]{Location.class},
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method m, Object[] a) {
                        if (m.getName().equals("toString")) return "at FakeLocation";
                        if (m.getName().equals("equals")) return proxy == a[0];
                        if (m.getName().equals("hashCode")) return System.identityHashCode(proxy);
                        Class<?> rt = m.getReturnType();
                        if (rt == boolean.class) return false;
                        if (rt.isPrimitive()) return 0;
                        return null;
                    }
                }
        );
    }

    // ---------- Custom Matcher implementations ----------

    private static class EqualToMatcher extends BaseMatcher<Object> {
        private final Object expected;
        EqualToMatcher(Object expected) { this.expected = expected; }
        public boolean matches(Object item) {
            return expected == null ? item == null : expected.equals(item);
        }
        public void describeTo(Description description) { description.appendValue(expected); }
    }

    private static class CapturingMatcher extends BaseMatcher<Object> implements CapturesArguments {
        Object captured;
        boolean called = false;
        public boolean matches(Object item) { return true; }
        public void describeTo(Description description) { description.appendText("captures"); }
        public void captureFrom(Object argument) {
            called = true;
            captured = argument;
        }
    }

    private static class ThrowingMatcher extends BaseMatcher<Object> {
        public boolean matches(Object item) { throw new RuntimeException("boom"); }
        public void describeTo(Description description) { description.appendText("throwing"); }
    }

    // =========================================================
    // Constructor
    // =========================================================

    @Test
    public void constructor_usesProvidedMatchers_whenListNotEmpty() {
        Invocation inv = fakeInvocation(MOCK_A, mOneArgString, new Object[]{"x"});
        List<Matcher> provided = Arrays.<Matcher>asList(new EqualToMatcher("x"));

        InvocationMatcher im = new InvocationMatcher(inv, provided);

        assertSame(provided, im.getMatchers());
    }

    @Test
    public void constructor_generatesMatchersFromArguments_whenListEmpty() {
        Invocation inv = fakeInvocation(MOCK_A, mTwoArgs, new Object[]{"a", 1});

        InvocationMatcher im = new InvocationMatcher(inv, Collections.<Matcher>emptyList());

        // สมมติฐาน (A): จำนวน matcher ที่ generate ควรเท่ากับจำนวน argument
        assertEquals(2, im.getMatchers().size());
    }

    @Test
    public void constructor_emptyArguments_producesEmptyMatchersList() {
        // boundary: no-args method -> args array ว่าง
        Invocation inv = fakeInvocation(MOCK_A, mNoArgs, new Object[0]);

        InvocationMatcher im = new InvocationMatcher(inv, Collections.<Matcher>emptyList());

        assertTrue(im.getMatchers().isEmpty());
    }

    @Test
    public void singleArgConstructor_delegatesToTwoArgConstructor_withEmptyMatchers() {
        Invocation inv = fakeInvocation(MOCK_A, mOneArgString, new Object[]{"x"});

        InvocationMatcher im = new InvocationMatcher(inv);

        assertEquals(1, im.getMatchers().size());
        assertSame(inv, im.getInvocation());
    }

    @Test(expected = NullPointerException.class)
    public void constructor_nullMatchersList_throwsNPE_onIsEmptyCall() {
        // ตามซอร์ส: matchers.isEmpty() ถูกเรียกตรง ๆ กับพารามิเตอร์ -> null จะ NPE ทันที
        Invocation inv = fakeInvocation(MOCK_A, mOneArgString, new Object[]{"x"});
        new InvocationMatcher(inv, null);
    }

    @Test
    public void constructor_nullInvocation_withNonEmptyMatchers_doesNotThrow_butLaterAccessFails() {
        // matchers ไม่ว่าง -> constructor ไม่แตะ invocation เลย จึงไม่ throw ตรงนี้
        List<Matcher> provided = Arrays.<Matcher>asList(new EqualToMatcher("x"));
        InvocationMatcher im = new InvocationMatcher(null, provided);

        assertNull(im.getInvocation());
        try {
            im.getMethod(); // ใช้ invocation.getMethod() -> NPE เพราะ invocation เป็น null
            fail("expected NPE");
        } catch (NullPointerException expected) {
            // ok
        }
    }

    // =========================================================
    // Simple getters
    // =========================================================

    @Test
    public void getMethod_returnsUnderlyingInvocationMethod() {
        Invocation inv = fakeInvocation(MOCK_A, mTwoArgs, new Object[]{"a", 1});
        InvocationMatcher im = new InvocationMatcher(inv);
        assertSame(mTwoArgs, im.getMethod());
    }

    @Test
    public void getInvocation_returnsSameReference() {
        Invocation inv = fakeInvocation(MOCK_A, mNoArgs, new Object[0]);
        InvocationMatcher im = new InvocationMatcher(inv);
        assertSame(inv, im.getInvocation());
    }

    @Test
    public void getLocation_delegatesToInvocation() {
        Location loc = fakeLocation();
        Invocation inv = fakeInvocation(MOCK_A, mNoArgs, new Object[0], false, loc);
        InvocationMatcher im = new InvocationMatcher(inv);
        assertSame(loc, im.getLocation());
    }

    @Test
    public void toString_doesNotThrow_andReturnsNonNull() {
        // หมายเหตุ: รูปแบบข้อความที่แน่นอนขึ้นกับ PrintSettings ซึ่งไม่มี source ให้
        // จึงทดสอบแบบ smoke-test เท่านั้น (ไม่มี branch ภายใน toString() ของคลาสเป้าหมาย)
        Invocation inv = fakeInvocation(MOCK_A, mOneArgString, new Object[]{"x"});
        InvocationMatcher im = new InvocationMatcher(inv);
        assertNotNull(im.toString());
    }

    // =========================================================
    // matches(Invocation actual)
    // =========================================================

    @Test
    public void matches_returnsFalse_whenMockDiffers() {
        Invocation thisInv = fakeInvocation(MOCK_A, mOneArgString, new Object[]{"x"});
        Invocation actual = fakeInvocation(MOCK_B, mOneArgString, new Object[]{"x"});
        InvocationMatcher im = new InvocationMatcher(thisInv);

        assertFalse(im.matches(actual));
    }

    @Test
    public void matches_returnsFalse_whenMethodDiffers() {
        Invocation thisInv = fakeInvocation(MOCK_A, mNoArgs, new Object[0]);
        Invocation actual = fakeInvocation(MOCK_A, mOneArgString, new Object[]{"x"});
        InvocationMatcher im = new InvocationMatcher(thisInv);

        assertFalse(im.matches(actual)); // hasSameMethod=false -> short-circuit, ไม่ไปแตะ ArgumentsComparator
    }

    @Test
    public void matches_returnsTrue_whenMockMethodAndArgumentsAllMatch() {
        Invocation thisInv = fakeInvocation(MOCK_A, mOneArgString, new Object[]{"x"});
        Invocation actual = fakeInvocation(MOCK_A, mOneArgString, new Object[]{"x"});
        InvocationMatcher im = new InvocationMatcher(thisInv);

        assertTrue(im.matches(actual)); // อิงสมมติฐาน (A)
    }

    @Test
    public void matches_returnsFalse_whenArgumentValueDiffers() {
        Invocation thisInv = fakeInvocation(MOCK_A, mOneArgString, new Object[]{"x"});
        Invocation actual = fakeInvocation(MOCK_A, mOneArgString, new Object[]{"y"});
        InvocationMatcher im = new InvocationMatcher(thisInv);

        assertFalse(im.matches(actual)); // อิงสมมติฐาน (A)
    }

    // =========================================================
    // hasSimilarMethod(Invocation candidate)
    // =========================================================

    @Test
    public void hasSimilarMethod_returnsFalse_whenMethodNameDiffers() {
        Invocation thisInv = fakeInvocation(MOCK_A, mNoArgs, new Object[0]);
        Invocation candidate = fakeInvocation(MOCK_A, mOneArgString, new Object[]{"x"}, false, fakeLocation());
        InvocationMatcher im = new InvocationMatcher(thisInv);

        assertFalse(im.hasSimilarMethod(candidate));
    }

    @Test
    public void hasSimilarMethod_returnsFalse_whenCandidateIsVerified() {
        Invocation thisInv = fakeInvocation(MOCK_A, mNoArgs, new Object[0]);
        Invocation candidate = fakeInvocation(MOCK_A, mNoArgs, new Object[0], true, fakeLocation());
        InvocationMatcher im = new InvocationMatcher(thisInv);

        assertFalse(im.hasSimilarMethod(candidate)); // isUnverified = false
    }

    @Test
    public void hasSimilarMethod_returnsFalse_whenMockDiffers() {
        Invocation thisInv = fakeInvocation(MOCK_A, mNoArgs, new Object[0]);
        Invocation candidate = fakeInvocation(MOCK_B, mNoArgs, new Object[0]);
        InvocationMatcher im = new InvocationMatcher(thisInv);

        assertFalse(im.hasSimilarMethod(candidate)); // mockIsTheSame = false (reference check)
    }

    @Test
    public void hasSimilarMethod_returnsTrue_whenSameMethodUnverifiedSameMock() {
        Invocation thisInv = fakeInvocation(MOCK_A, mNoArgs, new Object[0]);
        Invocation candidate = fakeInvocation(MOCK_A, mNoArgs, new Object[0]);
        InvocationMatcher im = new InvocationMatcher(thisInv);

        assertTrue(im.hasSimilarMethod(candidate)); // methodEquals=true -> overloadedButSameArgs=false
    }

    @Test
    public void hasSimilarMethod_returnsFalse_whenOverloadedWithSameArgumentValue() {
        // ชื่อ method เดียวกัน ("oneArg"), overload ต่าง param type, แต่ argument value เท่ากัน
        Invocation thisInv = fakeInvocation(MOCK_A, mOneArgString, new Object[]{"X"});
        Invocation candidate = fakeInvocation(MOCK_A, mOneArgInteger, new Object[]{"X"});
        InvocationMatcher im = new InvocationMatcher(thisInv);

        // methodEquals=false, safelyArgumentsMatch=true (อิงสมมติฐาน A) -> overloadedButSameArgs=true -> false
        assertFalse(im.hasSimilarMethod(candidate));
    }

    @Test
    public void hasSimilarMethod_returnsTrue_whenOverloadedWithDifferentArgumentValue() {
        Invocation thisInv = fakeInvocation(MOCK_A, mOneArgString, new Object[]{"X"});
        Invocation candidate = fakeInvocation(MOCK_A, mOneArgInteger, new Object[]{"Y"});
        InvocationMatcher im = new InvocationMatcher(thisInv);

        // methodEquals=false, safelyArgumentsMatch=false -> overloadedButSameArgs=false -> true
        assertTrue(im.hasSimilarMethod(candidate));
    }

    @Test
    public void hasSimilarMethod_returnsTrue_whenArgumentsComparatorThrows_caughtBySafelyArgumentsMatch() {
        // ทดสอบ catch(Throwable) ใน safelyArgumentsMatch ตรง ๆ ตามซอร์สที่ให้มา
        Invocation thisInv = fakeInvocation(MOCK_A, mOneArgString, new Object[]{"X"});
        Invocation candidate = fakeInvocation(MOCK_A, mOneArgInteger, new Object[]{"X"});
        InvocationMatcher im = new InvocationMatcher(thisInv, Arrays.<Matcher>asList(new ThrowingMatcher()));

        assertTrue(im.hasSimilarMethod(candidate));
    }

    // =========================================================
    // hasSameMethod(Invocation candidate)
    // =========================================================

    @Test
    public void hasSameMethod_returnsTrue_whenNameAndParamTypesMatch() {
        Invocation thisInv = fakeInvocation(MOCK_A, mTwoArgs, new Object[]{"a", 1});
        Invocation candidate = fakeInvocation(MOCK_A, mTwoArgs, new Object[]{"b", 2});
        InvocationMatcher im = new InvocationMatcher(thisInv);

        assertTrue(im.hasSameMethod(candidate));
    }

    @Test
    public void hasSameMethod_returnsFalse_whenNamesDiffer() {
        Invocation thisInv = fakeInvocation(MOCK_A, mNoArgs, new Object[0]);
        Invocation candidate = fakeInvocation(MOCK_A, mOneArgString, new Object[]{"x"});
        InvocationMatcher im = new InvocationMatcher(thisInv);

        assertFalse(im.hasSameMethod(candidate));
    }

    @Test
    public void hasSameMethod_returnsFalse_whenParamCountDiffers() {
        Invocation thisInv = fakeInvocation(MOCK_A, mOneArgString, new Object[]{"x"});
        Invocation candidate = fakeInvocation(MOCK_A, mTwoArgs, new Object[]{"x", 1});
        InvocationMatcher im = new InvocationMatcher(thisInv);

        // ชื่อ method ต่างกัน (oneArg vs twoArgs) อยู่แล้ว แต่ใส่ไว้เพื่อความชัดเจนของ edge case จำนวน param
        assertFalse(im.hasSameMethod(candidate));
    }

    @Test
    public void hasSameMethod_returnsFalse_whenParamTypesDifferInLoop() {
        Invocation thisInv = fakeInvocation(MOCK_A, mOneArgString, new Object[]{"x"});
        Invocation candidate = fakeInvocation(MOCK_A, mOneArgInteger, new Object[]{1});
        InvocationMatcher im = new InvocationMatcher(thisInv);

        // ชื่อเหมือนกัน, จำนวน param เท่ากัน, แต่ type ต่างกันใน loop -> return false กลางทาง
        assertFalse(im.hasSameMethod(candidate));
    }

    // (ไม่ทดสอบ branch "m1.getName() != null" เป็น false เพราะ Method.getName() ของ reflection จริง
    //  ไม่สามารถคืน null ได้ -> เป็น defensive/dead branch)

    // =========================================================
    // captureArgumentsFrom(Invocation invocation)
    // =========================================================

    @Test(expected = UnsupportedOperationException.class)
    public void captureArgumentsFrom_throwsUnsupportedOperationException_whenVarArgs() {
        // นี่คือ behavior ปัจจุบัน (บั๊ก Mockito-1b) ตามซอร์สที่ให้มาโดยตรง
        Invocation thisInv = fakeInvocation(MOCK_A, mNoArgs, new Object[0]);
        InvocationMatcher im = new InvocationMatcher(thisInv);

        Invocation varArgInvocation = fakeInvocation(MOCK_A, mVarArgs, new Object[]{new String[]{"a", "b"}});
        im.captureArgumentsFrom(varArgInvocation);
    }

    @Test
    public void captureArgumentsFrom_invokesCaptureFrom_onCapturesArgumentsMatcher_andSkipsOthers() {
        CapturingMatcher capturingMatcher = new CapturingMatcher();
        EqualToMatcher plainMatcher = new EqualToMatcher("ignored");

        Invocation baseInv = fakeInvocation(MOCK_A, mTwoArgs, new Object[]{"base1", 1});
        InvocationMatcher im = new InvocationMatcher(
                baseInv, Arrays.<Matcher>asList(capturingMatcher, plainMatcher));

        Invocation paramInv = fakeInvocation(MOCK_A, mTwoArgs, new Object[]{"capturedValue", "other"});
        im.captureArgumentsFrom(paramInv);

        assertTrue(capturingMatcher.called);
        assertEquals("capturedValue", capturingMatcher.captured);
        // plainMatcher ไม่ใช่ CapturesArguments -> ไม่มี side effect ให้ตรวจ แต่ไม่ควร throw
    }

    @Test
    public void captureArgumentsFrom_withEmptyMatchers_doesNothing_andDoesNotThrow() {
        Invocation baseInv = fakeInvocation(MOCK_A, mNoArgs, new Object[0]);
        InvocationMatcher im = new InvocationMatcher(baseInv); // matchers ว่าง (เพราะ args ว่าง)

        Invocation paramInv = fakeInvocation(MOCK_A, mNoArgs, new Object[0]);
        im.captureArgumentsFrom(paramInv); // loop ไม่ execute เลย (matchers.size()==0)
    }

    // =========================================================
    // createFrom(List<Invocation> invocations)
    // =========================================================

    @Test
    public void createFrom_emptyList_returnsEmptyList() {
        List<InvocationMatcher> result = InvocationMatcher.createFrom(Collections.<Invocation>emptyList());
        assertTrue(result.isEmpty());
    }

    @Test
    public void createFrom_nonEmptyList_wrapsEachInvocationPreservingOrder() {
        Invocation i1 = fakeInvocation(MOCK_A, mNoArgs, new Object[0]);
        Invocation i2 = fakeInvocation(MOCK_A, mOneArgString, new Object[]{"x"});
        List<Invocation> invocations = new ArrayList<Invocation>();
        invocations.add(i1);
        invocations.add(i2);

        List<InvocationMatcher> result = InvocationMatcher.createFrom(invocations);

        assertEquals(2, result.size());
        assertSame(i1, result.get(0).getInvocation());
        assertSame(i2, result.get(1).getInvocation());
    }
}
