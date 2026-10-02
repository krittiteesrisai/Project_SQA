package org.mockito.internal.invocation;

import static org.hamcrest.CoreMatchers.anything;
import static org.junit.Assert.*;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.Test;
import org.mockito.internal.invocation.InvocationMatcher; // target class (ชี้ import ให้ชัดเจนตามข้อกำหนด)
import org.mockito.internal.matchers.CapturesArguments;
import org.mockito.internal.reporting.PrintSettings;

@SuppressWarnings("unchecked")
public class InvocationMatcherTest {

    // ---- helper: คลาสที่มีเมธอดชื่อซ้ำ (overload) สำหรับทดสอบ hasSimilarMethod/hasSameMethod ----
    public static class Multi {
        public Multi() {}
        public void call() {}
        public void call(String s) {}
        public void call(Object o) {}
        public void call(String a, String b) {}
        public void other(String s) {}
    }

    private static class CapturingMatcher extends BaseMatcher<Object> implements CapturesArguments {
        Object captured;
        public boolean matches(Object item) { return true; }
        public void describeTo(Description description) {}
        public void captureFrom(Object argument) { this.captured = argument; }
    }

    private Invocation invocation(Object mock, String methodName, Object... args) {
        return new InvocationBuilder().mock(mock).method(methodName).args(args).toInvocation();
    }

    private Invocation verifiedInvocation(Object mock, String methodName, Object... args) {
        return new InvocationBuilder().mock(mock).method(methodName).args(args).verified().toInvocation();
    }

    // ================= Constructor =================

    @Test
    public void shouldDeriveMatchersFromInvocation_whenMatchersListEmpty() {
        Multi m = new Multi();
        Invocation inv = invocation(m, "call", "a", "b");
        InvocationMatcher im = new InvocationMatcher(inv, Collections.<Matcher>emptyList());
        assertEquals(2, im.getMatchers().size()); // สมมติ 1 arg = 1 matcher
    }

    @Test
    public void shouldUseProvidedMatchers_whenMatchersListNotEmpty() {
        Multi m = new Multi();
        Invocation inv = invocation(m, "call", "a");
        List<Matcher> provided = Arrays.<Matcher>asList(anything());
        InvocationMatcher im = new InvocationMatcher(inv, provided);
        assertSame(provided, im.getMatchers());
    }

    @Test
    public void singleArgConstructor_behavesLikeEmptyMatchersList() {
        Multi m = new Multi();
        Invocation inv = invocation(m, "call", "a");
        InvocationMatcher im = new InvocationMatcher(inv);
        assertEquals(1, im.getMatchers().size());
    }

    @Test(expected = NullPointerException.class)
    public void constructor_shouldThrowNPE_whenMatchersListIsNull() {
        Multi m = new Multi();
        Invocation inv = invocation(m, "call", "a");
        // matchers.isEmpty() บน null -> NPE (พฤติกรรมปัจจุบันตาม source จริง ไม่มี null-check)
        new InvocationMatcher(inv, null);
    }

    @Test
    public void constructor_shouldNotTouchInvocation_whenMatchersListNotEmpty_evenIfInvocationNull() {
        // กรณี matchers ไม่ว่าง -> ไม่เรียก invocation.argumentsToMatchers() เลย จึงไม่ NPE แม้ invocation เป็น null
        List<Matcher> provided = Arrays.<Matcher>asList(anything());
        InvocationMatcher im = new InvocationMatcher(null, provided);
        assertNull(im.getInvocation());
        assertSame(provided, im.getMatchers());
    }

    // ================= Getters =================

    @Test
    public void getMethod_shouldReturnMethodFromInvocation() throws Exception {
        Multi m = new Multi();
        InvocationMatcher im = new InvocationMatcher(invocation(m, "call", "a"));
        Method expected = Multi.class.getMethod("call", String.class);
        assertEquals(expected, im.getMethod());
    }

    @Test
    public void getInvocation_shouldReturnSameInstancePassedIn() {
        Multi m = new Multi();
        Invocation inv = invocation(m, "call", "a");
        InvocationMatcher im = new InvocationMatcher(inv);
        assertSame(inv, im.getInvocation());
    }

    @Test
    public void getLocation_shouldNotBeNull() {
        Multi m = new Multi();
        InvocationMatcher im = new InvocationMatcher(invocation(m, "call", "a"));
        assertNotNull(im.getLocation());
    }

    // ================= toString =================

    @Test
    public void toString_shouldNotBeNull() {
        Multi m = new Multi();
        InvocationMatcher im = new InvocationMatcher(invocation(m, "call", "a"));
        assertNotNull(im.toString());
    }

    @Test
    public void toStringWithPrintSettings_shouldNotBeNull() {
        Multi m = new Multi();
        InvocationMatcher im = new InvocationMatcher(invocation(m, "call", "a"));
        assertNotNull(im.toString(new PrintSettings()));
    }

    // ================= hasSameMethod =================

    @Test
    public void hasSameMethod_true_whenCandidateCallsSameMethod() {
        Multi m = new Multi();
        InvocationMatcher im = new InvocationMatcher(invocation(m, "call", "a"));
        assertTrue(im.hasSameMethod(invocation(m, "call", "z")));
    }

    @Test
    public void hasSameMethod_false_whenCandidateCallsDifferentMethod() {
        Multi m = new Multi();
        InvocationMatcher im = new InvocationMatcher(invocation(m, "call", "a"));
        assertFalse(im.hasSameMethod(invocation(m, "other", "a")));
    }

    // ================= matches =================

    @Test
    public void matches_true_whenSameMockMethodAndArguments() {
        Multi m = new Multi();
        InvocationMatcher im = new InvocationMatcher(invocation(m, "call", "x"));
        assertTrue(im.matches(invocation(m, "call", "x")));
    }

    @Test
    public void matches_false_whenDifferentMock() {
        Multi m1 = new Multi();
        Multi m2 = new Multi();
        InvocationMatcher im = new InvocationMatcher(invocation(m1, "call", "x"));
        assertFalse(im.matches(invocation(m2, "call", "x")));
    }

    @Test
    public void matches_false_whenDifferentMethod() {
        Multi m = new Multi();
        InvocationMatcher im = new InvocationMatcher(invocation(m, "call", "x"));
        assertFalse(im.matches(invocation(m, "other", "x")));
    }

    @Test
    public void matches_false_whenDifferentArguments() {
        Multi m = new Multi();
        InvocationMatcher im = new InvocationMatcher(invocation(m, "call", "x"));
        assertFalse(im.matches(invocation(m, "call", "y")));
    }

    // ================= hasSimilarMethod =================

    @Test
    public void hasSimilarMethod_false_whenMethodNameDiffers() {
        Multi m = new Multi();
        InvocationMatcher im = new InvocationMatcher(invocation(m, "call", "x"));
        assertFalse(im.hasSimilarMethod(invocation(m, "other", "x")));
    }

    @Test
    public void hasSimilarMethod_false_whenCandidateAlreadyVerified() {
        Multi m = new Multi();
        InvocationMatcher im = new InvocationMatcher(invocation(m, "call", "x"));
        assertFalse(im.hasSimilarMethod(verifiedInvocation(m, "call", "x")));
    }

    @Test
    public void hasSimilarMethod_false_whenDifferentMockInstance() {
        Multi m1 = new Multi();
        Multi m2 = new Multi();
        InvocationMatcher im = new InvocationMatcher(invocation(m1, "call", "x"));
        assertFalse(im.hasSimilarMethod(invocation(m2, "call", "x")));
    }

    @Test
    public void hasSimilarMethod_true_whenSameMethodSignature_regardlessOfArgs() {
        // methodEquals=true -> !methodEquals ลัดเป็น false ทันที (short-circuit &&) ไม่ต้องพึ่ง argumentsToMatchers
        Multi m = new Multi();
        InvocationMatcher im = new InvocationMatcher(invocation(m, "call", "x"));
        assertTrue(im.hasSimilarMethod(invocation(m, "call", "totally-different-value")));
    }

    @Test
    public void hasSimilarMethod_false_whenOverloadedMethod_butArgumentsConsideredMatching() {
        // ใช้ explicit matcher = anything() บังคับ safelyArgumentsMatch = true โดยไม่พึ่ง argumentsToMatchers จริง
        Multi m = new Multi();
        Invocation wanted = invocation(m, "call", "x"); // call(String)
        InvocationMatcher im = new InvocationMatcher(wanted, Arrays.<Matcher>asList(anything()));

        Invocation candidate = invocation(m, "call", new Object()); // call(Object) -> overload, methodEquals=false
        assertFalse(im.hasSameMethod(candidate));
        assertFalse(im.hasSimilarMethod(candidate));
    }

    @Test
    public void hasSimilarMethod_true_whenOverloadedMethod_andArgumentsDoNotMatch() {
        Multi m = new Multi();
        InvocationMatcher im = new InvocationMatcher(invocation(m, "call", "x")); // matcher สมมติ=Equals("x")
        Invocation candidate = invocation(m, "call", new Object()); // call(Object), arg ไม่ตรง "x"
        assertFalse(im.hasSameMethod(candidate));
        assertTrue(im.hasSimilarMethod(candidate));
    }

    @Test
    public void hasSimilarMethod_true_whenArgumentCountMismatch_safelyArgumentsMatchIsFalse() {
        // boundary: matcher 2 ตัว (จาก call(String,String)) เทียบกับ argument จริง 1 ตัว (call(Object))
        // คาดว่า safelyArgumentsMatch=false (อาจผ่าน catch) -> overloadedButSameArgs=false -> similar=true
        // หมายเหตุ: เกี่ยวข้องกับลักษณะ index/ขนาดไม่ตรงกันที่สัมพันธ์กับธรรมชาติของบั๊ก Mockito-34
        Multi m = new Multi();
        InvocationMatcher im = new InvocationMatcher(invocation(m, "call", "a", "b")); // call(String,String)
        Invocation candidate = invocation(m, "call", new Object()); // call(Object), 1 arg
        assertFalse(im.hasSameMethod(candidate));
        assertTrue(im.hasSimilarMethod(candidate));
    }

    // ================= captureArgumentsFrom =================

    @Test
    public void captureArgumentsFrom_shouldDoNothing_whenMatchersListEmpty() {
        Multi m = new Multi();
        InvocationMatcher im = new InvocationMatcher(invocation(m, "call")); // 0 args -> matchers ว่าง
        assertEquals(0, im.getMatchers().size());
        im.captureArgumentsFrom(invocation(m, "call", "any")); // ต้องไม่ throw
    }

    @Test
    public void captureArgumentsFrom_shouldCallCaptureFrom_onlyForCapturingMatchers() {
        CapturingMatcher capturing = new CapturingMatcher();
        Matcher nonCapturing = anything();
        List<Matcher> matchers = Arrays.<Matcher>asList((Matcher) capturing, nonCapturing);

        Multi m = new Multi();
        InvocationMatcher im = new InvocationMatcher(invocation(m, "call", "p1", "p2"), matchers);

        im.captureArgumentsFrom(invocation(m, "call", "foo", "bar"));

        assertEquals("foo", capturing.captured);
    }

    @Test
    public void captureArgumentsFrom_shouldCaptureAtCorrectIndex_forMultipleCapturingMatchers() {
        CapturingMatcher first = new CapturingMatcher();
        CapturingMatcher second = new CapturingMatcher();
        List<Matcher> matchers = Arrays.<Matcher>asList((Matcher) first, (Matcher) second);

        Multi m = new Multi();
        InvocationMatcher im = new InvocationMatcher(invocation(m, "call", "p1", "p2"), matchers);

        im.captureArgumentsFrom(invocation(m, "call", "foo", "bar"));

        assertEquals("foo", first.captured);
        assertEquals("bar", second.captured);
    }
}
