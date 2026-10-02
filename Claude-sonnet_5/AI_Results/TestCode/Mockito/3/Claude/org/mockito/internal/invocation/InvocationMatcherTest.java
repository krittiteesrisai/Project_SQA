package org.mockito.internal.invocation;

import org.junit.Test;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
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
 * Unit tests for {@link InvocationMatcher}.
 *
 * หมายเหตุสำคัญ (assumptions ที่ไม่สามารถยืนยันได้จาก source ที่ให้มา):
 * 1. Invocation/Location เป็น interface ของ Mockito เอง - เราไม่มี source ของ interface เหล่านี้
 *    จึงสร้าง dynamic proxy (InvocationHandler) ที่ handle เฉพาะ method ที่ InvocationMatcher
 *    เรียกใช้จริงตามที่เห็นใน source code เป้าหมาย ถ้ามี method อื่นถูกเรียก (ที่เราไม่รู้จัก)
 *    จะ return null ซึ่งอาจทำให้เกิด NPE หากเป็น primitive return type
 * 2. ArgumentsComparator.argumentsMatch(...) ไม่มี source ให้ - สมมติพฤติกรรมพื้นฐานตาม
 *    ความรู้ทั่วไปของ Mockito (เทียบ matcher กับ argument ตามตำแหน่ง) - กำกับด้วยคอมเมนต์ในแต่ละเทส
 * 3. ArgumentsProcessor.argumentsToMatchers(...) สมมติว่าสร้าง matcher แบบ equals-based
 *    จาก argument values จริง (พฤติกรรมที่ทราบกันทั่วไปของ Mockito แต่ไม่ได้ยืนยันจาก source ที่ให้)
 */
public class InvocationMatcherTest {

    // ---------- Fixture class providing real java.lang.reflect.Method objects ----------
    public static class Fixture {
        public void noArgMethod() {}
        public void simpleMethod(String a) {}
        public void simpleMethod(String a, String b) {}
        public void overload(Object a) {}
        public void overload(String a) {}
        public void varargsMethod(String first, String... rest) {}
        public void varargsOnly(String... rest) {}
    }

    private static Method m(String name, Class<?>... params) throws Exception {
        return Fixture.class.getMethod(name, params);
    }

    // ---------- Matcher implementations ----------
    static class CapturingMatcher extends BaseMatcher implements CapturesArguments {
        List<Object> captured = new ArrayList<Object>();
        public boolean matches(Object item) { return true; }
        public void describeTo(Description description) { description.appendText("capturing"); }
        public void captureFrom(Object argument) { captured.add(argument); }
    }

    static class SimpleMatcher extends BaseMatcher {
        public boolean matches(Object item) { return true; }
        public void describeTo(Description description) { description.appendText("simple"); }
    }

    // ---------- Dynamic proxy stub for Invocation ----------
    static class InvocationStub implements InvocationHandler {
        Object[] arguments = new Object[0];
        Object[] rawArguments = new Object[0];
        Object mock = new Object();
        Method method;
        boolean verified = false;
        final Location location = createLocation();

        static Location createLocation() {
            return (Location) Proxy.newProxyInstance(
                    InvocationMatcherTest.class.getClassLoader(),
                    new Class[]{Location.class},
                    new InvocationHandler() {
                        public Object invoke(Object proxy, Method m, Object[] args) {
                            String name = m.getName();
                            if ("toString".equals(name)) return "loc";
                            if ("hashCode".equals(name)) return 1;
                            if ("equals".equals(name)) return proxy == args[0];
                            // อื่น ๆ ไม่ถูกใช้ในซอร์สโค้ดเป้าหมาย - ไม่รองรับ
                            return null;
                        }
                    });
        }

        public Object invoke(Object proxy, Method method, Object[] args) {
            String name = method.getName();
            if ("getArguments".equals(name)) return arguments;
            if ("getRawArguments".equals(name)) return rawArguments;
            if ("getMock".equals(name)) return mock;
            if ("getMethod".equals(name)) return this.method;
            if ("isVerified".equals(name)) return verified;
            if ("getLocation".equals(name)) return location;
            if ("getArgumentAt".equals(name)) return arguments[(Integer) args[0]];
            if ("markVerified".equals(name)) return null;
            if ("getSequenceNumber".equals(name)) return 0;
            if ("getStackTrace".equals(name)) return new StackTraceElement[0];
            if ("toString".equals(name)) return "invocation-stub";
            if ("hashCode".equals(name)) return System.identityHashCode(proxy);
            if ("equals".equals(name)) return proxy == args[0];
            // Unknown method - ไม่ยืนยันพฤติกรรมจาก source; return null (เสี่ยง NPE ถ้าเป็น primitive)
            return null;
        }

        Invocation asInvocation() {
            return (Invocation) Proxy.newProxyInstance(
                    InvocationMatcherTest.class.getClassLoader(),
                    new Class[]{Invocation.class},
                    this);
        }
    }

    // =====================================================================
    // Constructors
    // =====================================================================

    @Test
    public void constructor_emptyMatchers_generatesFromArguments() throws Exception {
        InvocationStub stub = new InvocationStub();
        stub.method = m("simpleMethod", String.class);
        stub.arguments = new Object[]{"hello"};
        Invocation invocation = stub.asInvocation();

        InvocationMatcher im = new InvocationMatcher(invocation, Collections.<Matcher>emptyList());

        assertEquals(1, im.getMatchers().size());
        // ArgumentsProcessor สมมติสร้าง matcher แบบ equals-based จาก argument จริง
        assertTrue(im.getMatchers().get(0).matches("hello"));
    }

    @Test
    public void constructor_nonEmptyMatchers_usesGivenMatchersAsIs() throws Exception {
        InvocationStub stub = new InvocationStub();
        stub.method = m("simpleMethod", String.class);
        stub.arguments = new Object[]{"hello"};
        Invocation invocation = stub.asInvocation();

        List<Matcher> custom = new ArrayList<Matcher>();
        custom.add(new SimpleMatcher());
        InvocationMatcher im = new InvocationMatcher(invocation, custom);

        assertSame(custom, im.getMatchers());
    }

    @Test
    public void singleArgConstructor_delegatesWithEmptyMatchers() throws Exception {
        InvocationStub stub = new InvocationStub();
        stub.method = m("noArgMethod");
        stub.arguments = new Object[0];
        Invocation invocation = stub.asInvocation();

        InvocationMatcher im = new InvocationMatcher(invocation);

        assertEquals(0, im.getMatchers().size());
    }

    // =====================================================================
    // Simple getters
    // =====================================================================

    @Test
    public void getMethod_returnsInvocationMethod() throws Exception {
        InvocationStub stub = new InvocationStub();
        stub.method = m("noArgMethod");
        Invocation invocation = stub.asInvocation();
        InvocationMatcher im = new InvocationMatcher(invocation);
        assertEquals(stub.method, im.getMethod());
    }

    @Test
    public void getInvocation_returnsOriginalInvocation() throws Exception {
        InvocationStub stub = new InvocationStub();
        stub.method = m("noArgMethod");
        Invocation invocation = stub.asInvocation();
        InvocationMatcher im = new InvocationMatcher(invocation);
        assertSame(invocation, im.getInvocation());
    }

    @Test
    public void getLocation_delegatesToInvocation() throws Exception {
        InvocationStub stub = new InvocationStub();
        stub.method = m("noArgMethod");
        Invocation invocation = stub.asInvocation();
        InvocationMatcher im = new InvocationMatcher(invocation);
        assertSame(stub.location, im.getLocation());
    }

    @Test
    public void toString_doesNotThrow_andReturnsNonNull() throws Exception {
        // ไม่ทราบรูปแบบ exact string จาก PrintSettings - ตรวจสอบเพียงว่าไม่ throw และไม่ null
        InvocationStub stub = new InvocationStub();
        stub.method = m("simpleMethod", String.class);
        stub.arguments = new Object[]{"a"};
        Invocation invocation = stub.asInvocation();
        InvocationMatcher im = new InvocationMatcher(invocation);
        assertNotNull(im.toString());
    }

    // =====================================================================
    // matches(Invocation)
    // =====================================================================

    @Test
    public void matches_returnsFalse_whenMockDifferent() throws Exception {
        InvocationStub stubA = new InvocationStub();
        stubA.method = m("noArgMethod");
        stubA.mock = new Object();
        Invocation invA = stubA.asInvocation();
        InvocationMatcher im = new InvocationMatcher(invA);

        InvocationStub stubB = new InvocationStub();
        stubB.method = m("noArgMethod");
        stubB.mock = new Object(); // different instance
        Invocation invB = stubB.asInvocation();

        assertFalse(im.matches(invB));
    }

    @Test
    public void matches_returnsFalse_whenMethodDifferent() throws Exception {
        Object sharedMock = new Object();
        InvocationStub stubA = new InvocationStub();
        stubA.method = m("noArgMethod");
        stubA.mock = sharedMock;
        Invocation invA = stubA.asInvocation();
        InvocationMatcher im = new InvocationMatcher(invA);

        InvocationStub stubB = new InvocationStub();
        stubB.method = m("simpleMethod", String.class);
        stubB.mock = sharedMock;
        stubB.arguments = new Object[]{"x"};
        Invocation invB = stubB.asInvocation();

        assertFalse(im.matches(invB));
    }

    @Test
    public void matches_returnsTrue_whenMockMethodAndArgumentsMatch() throws Exception {
        // สมมติฐาน: ArgumentsComparator คืน true เมื่อไม่มี argument ให้ match (0==0)
        Object sharedMock = new Object();
        InvocationStub stubA = new InvocationStub();
        stubA.method = m("noArgMethod");
        stubA.mock = sharedMock;
        stubA.arguments = new Object[0];
        Invocation invA = stubA.asInvocation();
        InvocationMatcher im = new InvocationMatcher(invA);

        InvocationStub stubB = new InvocationStub();
        stubB.method = m("noArgMethod");
        stubB.mock = sharedMock;
        stubB.arguments = new Object[0];
        Invocation invB = stubB.asInvocation();

        assertTrue(im.matches(invB));
    }

    // =====================================================================
    // hasSameMethod(Invocation)
    // =====================================================================

    @Test
    public void hasSameMethod_falseWhenNameDiffers() throws Exception {
        InvocationStub stubA = new InvocationStub();
        stubA.method = m("noArgMethod");
        Invocation invA = stubA.asInvocation();
        InvocationMatcher im = new InvocationMatcher(invA);

        InvocationStub stubB = new InvocationStub();
        stubB.method = m("simpleMethod", String.class);
        stubB.arguments = new Object[]{"x"};
        Invocation invB = stubB.asInvocation();

        assertFalse(im.hasSameMethod(invB));
    }

    @Test
    public void hasSameMethod_falseWhenParamCountDiffers() throws Exception {
        InvocationStub stubA = new InvocationStub();
        stubA.method = m("simpleMethod", String.class);
        stubA.arguments = new Object[]{"a"};
        Invocation invA = stubA.asInvocation();
        InvocationMatcher im = new InvocationMatcher(invA);

        InvocationStub stubB = new InvocationStub();
        stubB.method = m("simpleMethod", String.class, String.class);
        stubB.arguments = new Object[]{"a", "b"};
        Invocation invB = stubB.asInvocation();

        assertFalse(im.hasSameMethod(invB));
    }

    @Test
    public void hasSameMethod_falseWhenParamTypeDiffersInLoop() throws Exception {
        InvocationStub stubA = new InvocationStub();
        stubA.method = m("overload", Object.class);
        stubA.arguments = new Object[]{"a"};
        Invocation invA = stubA.asInvocation();
        InvocationMatcher im = new InvocationMatcher(invA);

        InvocationStub stubB = new InvocationStub();
        stubB.method = m("overload", String.class);
        stubB.arguments = new Object[]{"a"};
        Invocation invB = stubB.asInvocation();

        assertFalse(im.hasSameMethod(invB));
    }

    @Test
    public void hasSameMethod_trueWhenNoArgs_loopNotExecuted() throws Exception {
        InvocationStub stubA = new InvocationStub();
        stubA.method = m("noArgMethod");
        Invocation invA = stubA.asInvocation();
        InvocationMatcher im = new InvocationMatcher(invA);

        InvocationStub stubB = new InvocationStub();
        stubB.method = m("noArgMethod");
        Invocation invB = stubB.asInvocation();

        assertTrue(im.hasSameMethod(invB));
    }

    @Test
    public void hasSameMethod_trueWhenAllParamsMatch() throws Exception {
        InvocationStub stubA = new InvocationStub();
        stubA.method = m("simpleMethod", String.class, String.class);
        stubA.arguments = new Object[]{"a", "b"};
        Invocation invA = stubA.asInvocation();
        InvocationMatcher im = new InvocationMatcher(invA);

        InvocationStub stubB = new InvocationStub();
        stubB.method = m("simpleMethod", String.class, String.class);
        stubB.arguments = new Object[]{"c", "d"};
        Invocation invB = stubB.asInvocation();

        assertTrue(im.hasSameMethod(invB));
    }

    // Note: branch "m1.getName() != null -> false" ไม่สามารถทดสอบได้จริงเพราะ
    // java.lang.reflect.Method.getName() ไม่คืน null ตามสัญญาของ JDK - ข้ามการทดสอบ branch นี้

    // =====================================================================
    // hasSimilarMethod(Invocation)
    // =====================================================================

    @Test
    public void hasSimilarMethod_falseWhenMethodNameDiffers() throws Exception {
        Object sharedMock = new Object();
        InvocationStub stubA = new InvocationStub();
        stubA.method = m("noArgMethod");
        stubA.mock = sharedMock;
        Invocation invA = stubA.asInvocation();
        InvocationMatcher im = new InvocationMatcher(invA);

        InvocationStub stubB = new InvocationStub();
        stubB.method = m("simpleMethod", String.class);
        stubB.arguments = new Object[]{"x"};
        stubB.mock = sharedMock;
        stubB.verified = false;
        Invocation invB = stubB.asInvocation();

        assertFalse(im.hasSimilarMethod(invB));
    }

    @Test
    public void hasSimilarMethod_falseWhenCandidateAlreadyVerified() throws Exception {
        Object sharedMock = new Object();
        InvocationStub stubA = new InvocationStub();
        stubA.method = m("noArgMethod");
        stubA.mock = sharedMock;
        Invocation invA = stubA.asInvocation();
        InvocationMatcher im = new InvocationMatcher(invA);

        InvocationStub stubB = new InvocationStub();
        stubB.method = m("noArgMethod");
        stubB.mock = sharedMock;
        stubB.verified = true; // isUnverified -> false
        Invocation invB = stubB.asInvocation();

        assertFalse(im.hasSimilarMethod(invB));
    }

    @Test
    public void hasSimilarMethod_falseWhenMockDiffers() throws Exception {
        InvocationStub stubA = new InvocationStub();
        stubA.method = m("noArgMethod");
        stubA.mock = new Object();
        Invocation invA = stubA.asInvocation();
        InvocationMatcher im = new InvocationMatcher(invA);

        InvocationStub stubB = new InvocationStub();
        stubB.method = m("noArgMethod");
        stubB.mock = new Object(); // different
        stubB.verified = false;
        Invocation invB = stubB.asInvocation();

        assertFalse(im.hasSimilarMethod(invB));
    }

    @Test
    public void hasSimilarMethod_trueWhenSameMethodSameMockUnverified() throws Exception {
        Object sharedMock = new Object();
        InvocationStub stubA = new InvocationStub();
        stubA.method = m("noArgMethod");
        stubA.mock = sharedMock;
        Invocation invA = stubA.asInvocation();
        InvocationMatcher im = new InvocationMatcher(invA);

        InvocationStub stubB = new InvocationStub();
        stubB.method = m("noArgMethod");
        stubB.mock = sharedMock;
        stubB.verified = false;
        Invocation invB = stubB.asInvocation();

        assertTrue(im.hasSimilarMethod(invB));
    }

    @Test
    public void hasSimilarMethod_falseWhenOverloadedButArgumentsEqual() throws Exception {
        // hasSameMethod=false (param type ต่าง) แต่ arguments equal -> overloadedButSameArgs=true -> false
        Object sharedMock = new Object();
        InvocationStub stubA = new InvocationStub();
        stubA.method = m("overload", Object.class);
        stubA.mock = sharedMock;
        stubA.arguments = new Object[]{"hello"};
        Invocation invA = stubA.asInvocation();
        InvocationMatcher im = new InvocationMatcher(invA);

        InvocationStub stubB = new InvocationStub();
        stubB.method = m("overload", String.class);
        stubB.mock = sharedMock;
        stubB.arguments = new Object[]{"hello"};
        stubB.verified = false;
        Invocation invB = stubB.asInvocation();

        assertFalse(im.hasSimilarMethod(invB));
    }

    @Test
    public void hasSimilarMethod_trueWhenOverloadedAndArgumentsDiffer() throws Exception {
        // hasSameMethod=false, safelyArgumentsMatch=false -> overloadedButSameArgs=false -> true
        Object sharedMock = new Object();
        InvocationStub stubA = new InvocationStub();
        stubA.method = m("overload", Object.class);
        stubA.mock = sharedMock;
        stubA.arguments = new Object[]{"hello"};
        Invocation invA = stubA.asInvocation();
        InvocationMatcher im = new InvocationMatcher(invA);

        InvocationStub stubB = new InvocationStub();
        stubB.method = m("overload", String.class);
        stubB.mock = sharedMock;
        stubB.arguments = new Object[]{"world"};
        stubB.verified = false;
        Invocation invB = stubB.asInvocation();

        assertTrue(im.hasSimilarMethod(invB));
    }

    // =====================================================================
    // captureArgumentsFrom(Invocation) - private safelyArgumentsMatch ถูกเทสอ้อมด้านบนแล้ว
    // =====================================================================

    @Test
    public void captureArgumentsFrom_nonVarargs_capturesEachArgumentInOrder() throws Exception {
        InvocationStub stub = new InvocationStub();
        stub.method = m("simpleMethod", String.class, String.class);
        stub.arguments = new Object[]{"a1", "a2"};
        Invocation invocation = stub.asInvocation();

        CapturingMatcher cm0 = new CapturingMatcher();
        CapturingMatcher cm1 = new CapturingMatcher();
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(cm0);
        matchers.add(cm1);

        InvocationMatcher im = new InvocationMatcher(invocation, matchers);
        im.captureArgumentsFrom(invocation);

        assertEquals(Arrays.asList((Object) "a1"), cm0.captured);
        assertEquals(Arrays.asList((Object) "a2"), cm1.captured);
    }

    @Test
    public void captureArgumentsFrom_nonVarargs_skipsNonCapturingMatcher() throws Exception {
        InvocationStub stub = new InvocationStub();
        stub.method = m("simpleMethod", String.class);
        stub.arguments = new Object[]{"a1"};
        Invocation invocation = stub.asInvocation();

        SimpleMatcher sm = new SimpleMatcher();
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(sm);

        InvocationMatcher im = new InvocationMatcher(invocation, matchers);
        // ไม่ควร throw เนื่องจาก matcher ไม่ implement CapturesArguments (instanceof=false)
        im.captureArgumentsFrom(invocation);
    }

    @Test
    public void captureArgumentsFrom_varargs_capturesFixedAndVarargPositions() throws Exception {
        InvocationStub stub = new InvocationStub();
        stub.method = Fixture.class.getMethod("varargsMethod", String.class, String[].class);
        // rawArguments: [first, varargsArray] length=2 -> indexOfVararg=1
        stub.rawArguments = new Object[]{"first", new String[]{"v1", "v2"}};
        stub.arguments = new Object[]{"first", "v1", "v2"};
        Invocation invocation = stub.asInvocation();

        CapturingMatcher m0 = new CapturingMatcher(); // loop1 (fixed position 0)
        CapturingMatcher m1 = new CapturingMatcher(); // loop2 position=1 (index=0)
        CapturingMatcher m2 = new CapturingMatcher(); // loop2 position=2 (index=1)
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(m0);
        matchers.add(m1);
        matchers.add(m2);

        InvocationMatcher im = new InvocationMatcher(invocation, matchers);
        im.captureArgumentsFrom(invocation);

        // loop1: position=0<indexOfVararg(1) -> getArgumentAt(0) => "first"
        assertEquals(Arrays.asList((Object) "first"), m0.captured);
        // loop2: position=1 -> rawArguments[1-1=0] => "first"
        // หมายเหตุ: นี่คือ literal behavior ตาม source code จริง (อาจเป็นจุดบั๊กของ varargs capturing)
        assertEquals(Arrays.asList((Object) "first"), m1.captured);
        // loop2: position=2 -> rawArguments[2-1=1] => array ทั้งก้อน (ไม่ expand)
        assertEquals(1, m2.captured.size());
        assertTrue(m2.captured.get(0) instanceof String[]);
    }

    @Test
    public void captureArgumentsFrom_varargs_noFixedParams_onlyLoop2Executes() throws Exception {
        InvocationStub stub = new InvocationStub();
        stub.method = Fixture.class.getMethod("varargsOnly", String[].class);
        // rawArguments length=1 -> indexOfVararg=0 -> loop1 ไม่ execute (0<0 false)
        stub.rawArguments = new Object[]{new String[]{"x", "y"}};
        stub.arguments = new Object[]{"x", "y"};
        Invocation invocation = stub.asInvocation();

        CapturingMatcher m0 = new CapturingMatcher();
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(m0);

        InvocationMatcher im = new InvocationMatcher(invocation, matchers);
        im.captureArgumentsFrom(invocation);

        // loop2: position=0 -> rawArguments[0-0=0] => array ทั้งก้อน
        assertEquals(1, m0.captured.size());
        assertTrue(m0.captured.get(0) instanceof String[]);
    }

    // =====================================================================
    // createFrom(List<Invocation>)
    // =====================================================================

    @Test
    public void createFrom_emptyList_returnsEmptyList() {
        List<Invocation> input = new ArrayList<Invocation>();
        List<InvocationMatcher> result = InvocationMatcher.createFrom(input);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void createFrom_multipleInvocations_wrapsEachInOrder() throws Exception {
        InvocationStub stubA = new InvocationStub();
        stubA.method = m("noArgMethod");
        Invocation invA = stubA.asInvocation();

        InvocationStub stubB = new InvocationStub();
        stubB.method = m("simpleMethod", String.class);
        stubB.arguments = new Object[]{"x"};
        Invocation invB = stubB.asInvocation();

        List<Invocation> input = new ArrayList<Invocation>();
        input.add(invA);
        input.add(invB);

        List<InvocationMatcher> result = InvocationMatcher.createFrom(input);

        assertEquals(2, result.size());
        assertSame(invA, result.get(0).getInvocation());
        assertSame(invB, result.get(1).getInvocation());
    }
}
