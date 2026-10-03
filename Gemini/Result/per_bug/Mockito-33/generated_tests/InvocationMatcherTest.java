package org.mockito.internal.invocation;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.core.IsEqual;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.debugging.Location;
import org.mockito.internal.matchers.CapturesArguments;
import org.mockito.internal.reporting.PrintSettings;

import java.lang.reflect.Method;
import java.util.*;

import static org.junit.Assert.*;

public class InvocationMatcherTest {

    private Object mockInstance1;
    private Object mockInstance2;
    private Method sampleMethod1;
    private Method sampleMethod2;
    private Method overloadedMethod;

    // Dummy interface สำหรับใช้สร้าง Method reflection
    private interface DummyTarget {
        void sampleMethod(String arg);
        void sampleMethod(Object arg);
        void otherMethod(String arg);
        int intMethod(int a, int b);
    }

    // Dummy implementation ของ CapturesArguments สำหรับทดสอบ ArgumentCaptor
    private static class DummyCapturingMatcher extends BaseMatcher<Object> implements CapturesArguments {
        private final List<Object> captured = new ArrayList<Object>();

        @Override
        public boolean matches(Object item) {
            return true;
        }

        @Override
        public void describeTo(Description description) {
            description.appendText("dummy capture");
        }

        @Override
        public void captureFrom(Object argument) {
            captured.add(argument);
        }

        public List<Object> getCaptured() {
            return captured;
        }
    }

    // Stub Invocation เพื่อจำลองพฤติกรรมโดยไม่พึ่งพา CGLIB/ByteBuddy/External Mocking
    private static class StubInvocation extends Invocation {
        private final Object mock;
        private final Method method;
        private final Object[] args;
        private final boolean verified;
        private final Location location;

        public StubInvocation(Object mock, Method method, Object[] args, boolean verified) {
            super(mock, new SerializableMockitoMethod(method), args != null ? args : new Object[0], 1, null);
            this.mock = mock;
            this.method = method;
            this.args = args != null ? args : new Object[0];
            this.verified = verified;
            this.location = new Location();
        }

        @Override
        public Object getMock() {
            return mock;
        }

        @Override
        public Method getMethod() {
            return method;
        }

        @Override
        public Object[] getArguments() {
            return args;
        }

        @Override
        public boolean isVerified() {
            return verified;
        }

        @Override
        public Location getLocation() {
            return location;
        }

        @Override
        public List<Matcher> argumentsToMatchers() {
            List<Matcher> matchers = new ArrayList<Matcher>();
            for (Object arg : args) {
                matchers.add(new IsEqual<Object>(arg));
            }
            return matchers;
        }

        @Override
        public String toString(List<Matcher> matchers, PrintSettings printSettings) {
            return method.getName() + "(" + Arrays.toString(args) + ")";
        }
    }

    @Before
    public void setUp() throws Exception {
        mockInstance1 = new Object();
        mockInstance2 = new Object();
        sampleMethod1 = DummyTarget.class.getMethod("sampleMethod", String.class);
        sampleMethod2 = DummyTarget.class.getMethod("otherMethod", String.class);
        overloadedMethod = DummyTarget.class.getMethod("sampleMethod", Object.class);
    }

    @Test
    public void testConstructorWithEmptyMatchersShouldUseArgumentsToMatchers() {
        Invocation invocation = new StubInvocation(mockInstance1, sampleMethod1, new Object[]{"hello"}, false);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation, Collections.<Matcher>emptyList());

        assertEquals(1, invocationMatcher.getMatchers().size());
        assertEquals(sampleMethod1, invocationMatcher.getMethod());
        assertSame(invocation, invocationMatcher.getInvocation());
    }

    @Test
    public void testConstructorWithExplicitMatchers() {
        Invocation invocation = new StubInvocation(mockInstance1, sampleMethod1, new Object[]{"hello"}, false);
        List<Matcher> customMatchers = Collections.<Matcher>singletonList(new IsEqual<Object>("custom"));
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation, customMatchers);

        assertEquals(1, invocationMatcher.getMatchers().size());
        assertSame(customMatchers, invocationMatcher.getMatchers());
    }

    @Test
    public void testConvenienceConstructorWithInvocationOnly() {
        Invocation invocation = new StubInvocation(mockInstance1, sampleMethod1, new Object[]{"test"}, false);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);

        assertNotNull(invocationMatcher.getMatchers());
        assertEquals(1, invocationMatcher.getMatchers().size());
    }

    @Test
    public void testMatchesReturnsTrueWhenAllAttributesMatch() {
        Invocation wantedInvocation = new StubInvocation(mockInstance1, sampleMethod1, new Object[]{"arg1"}, false);
        Invocation actualInvocation = new StubInvocation(mockInstance1, sampleMethod1, new Object[]{"arg1"}, false);

        InvocationMatcher matcher = new InvocationMatcher(wantedInvocation);
        assertTrue(matcher.matches(actualInvocation));
    }

    @Test
    public void testMatchesReturnsFalseWhenMockDiffers() {
        Invocation wantedInvocation = new StubInvocation(mockInstance1, sampleMethod1, new Object[]{"arg1"}, false);
        Invocation actualInvocation = new StubInvocation(mockInstance2, sampleMethod1, new Object[]{"arg1"}, false);

        InvocationMatcher matcher = new InvocationMatcher(wantedInvocation);
        assertFalse(matcher.matches(actualInvocation));
    }

    @Test
    public void testMatchesReturnsFalseWhenMethodDiffers() {
        Invocation wantedInvocation = new StubInvocation(mockInstance1, sampleMethod1, new Object[]{"arg1"}, false);
        Invocation actualInvocation = new StubInvocation(mockInstance1, sampleMethod2, new Object[]{"arg1"}, false);

        InvocationMatcher matcher = new InvocationMatcher(wantedInvocation);
        assertFalse(matcher.matches(actualInvocation));
    }

    @Test
    public void testMatchesReturnsFalseWhenArgumentsDoNotMatch() {
        Invocation wantedInvocation = new StubInvocation(mockInstance1, sampleMethod1, new Object[]{"arg1"}, false);
        Invocation actualInvocation = new StubInvocation(mockInstance1, sampleMethod1, new Object[]{"arg2"}, false);

        InvocationMatcher matcher = new InvocationMatcher(wantedInvocation);
        assertFalse(matcher.matches(actualInvocation));
    }

    @Test
    public void testHasSimilarMethodWhenMethodsAreIdenticalAndUnverified() {
        Invocation wantedInvocation = new StubInvocation(mockInstance1, sampleMethod1, new Object[]{"test"}, false);
        Invocation candidate = new StubInvocation(mockInstance1, sampleMethod1, new Object[]{"test"}, false);

        InvocationMatcher matcher = new InvocationMatcher(wantedInvocation);
        assertTrue(matcher.hasSimilarMethod(candidate));
    }

    @Test
    public void testHasSimilarMethodReturnsFalseWhenMethodNamesDiffer() {
        Invocation wantedInvocation = new StubInvocation(mockInstance1, sampleMethod1, new Object[]{"test"}, false);
        Invocation candidate = new StubInvocation(mockInstance1, sampleMethod2, new Object[]{"test"}, false);

        InvocationMatcher matcher = new InvocationMatcher(wantedInvocation);
        assertFalse(matcher.hasSimilarMethod(candidate));
    }

    @Test
    public void testHasSimilarMethodReturnsFalseWhenCandidateIsVerified() {
        Invocation wantedInvocation = new StubInvocation(mockInstance1, sampleMethod1, new Object[]{"test"}, false);
        Invocation verifiedCandidate = new StubInvocation(mockInstance1, sampleMethod1, new Object[]{"test"}, true);

        InvocationMatcher matcher = new InvocationMatcher(wantedInvocation);
        assertFalse(matcher.hasSimilarMethod(verifiedCandidate));
    }

    @Test
    public void testHasSimilarMethodReturnsFalseWhenMocksDiffer() {
        Invocation wantedInvocation = new StubInvocation(mockInstance1, sampleMethod1, new Object[]{"test"}, false);
        Invocation candidate = new StubInvocation(mockInstance2, sampleMethod1, new Object[]{"test"}, false);

        InvocationMatcher matcher = new InvocationMatcher(wantedInvocation);
        assertFalse(matcher.hasSimilarMethod(candidate));
    }

    @Test
    public void testHasSimilarMethodReturnsFalseWhenOverloadedWithSameArgs() {
        // Method name is the same, mock is same, but method signatures differ and args match
        Invocation wantedInvocation = new StubInvocation(mockInstance1, sampleMethod1, new Object[]{"test"}, false);
        Invocation candidate = new StubInvocation(mockInstance1, overloadedMethod, new Object[]{"test"}, false);

        InvocationMatcher matcher = new InvocationMatcher(wantedInvocation);
        // overloadedButSameArgs is true => returns !true = false
        assertFalse(matcher.hasSimilarMethod(candidate));
    }

    @Test
    public void testHasSimilarMethodReturnsTrueWhenOverloadedWithDifferentArgs() {
        // Method name is the same, mock is same, method signature differs, and args do not match
        Invocation wantedInvocation = new StubInvocation(mockInstance1, sampleMethod1, new Object[]{"test1"}, false);
        Invocation candidate = new StubInvocation(mockInstance1, overloadedMethod, new Object[]{"test2"}, false);

        InvocationMatcher matcher = new InvocationMatcher(wantedInvocation);
        // overloadedButSameArgs is false => returns !false = true
        assertTrue(matcher.hasSimilarMethod(candidate));
    }

    @Test
    public void testCaptureArgumentsFromSuccess() {
        DummyCapturingMatcher capturingMatcher = new DummyCapturingMatcher();
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(capturingMatcher);

        Invocation wantedInvocation = new StubInvocation(mockInstance1, sampleMethod1, new Object[]{"expected"}, false);
        Invocation actualInvocation = new StubInvocation(mockInstance1, sampleMethod1, new Object[]{"captured_value"}, false);

        InvocationMatcher invocationMatcher = new InvocationMatcher(wantedInvocation, matchers);
        invocationMatcher.captureArgumentsFrom(actualInvocation);

        assertEquals(1, capturingMatcher.getCaptured().size());
        assertEquals("captured_value", capturingMatcher.getCaptured().get(0));
    }

    @Test
    public void testCaptureArgumentsFromWithFewerActualArgumentsThanMatchers() {
        // Boundary case: actual invocation has fewer arguments than matchers to avoid ArrayIndexOutOfBoundsException
        DummyCapturingMatcher matcher1 = new DummyCapturingMatcher();
        DummyCapturingMatcher matcher2 = new DummyCapturingMatcher();
        List<Matcher> matchers = Arrays.<Matcher>asList(matcher1, matcher2);

        Invocation wantedInvocation = new StubInvocation(mockInstance1, sampleMethod1, new Object[]{"a", "b"}, false);
        // Actual invocation only has 1 argument
        Invocation actualInvocation = new StubInvocation(mockInstance1, sampleMethod1, new Object[]{"only_one"}, false);

        InvocationMatcher invocationMatcher = new InvocationMatcher(wantedInvocation, matchers);
        invocationMatcher.captureArgumentsFrom(actualInvocation);

        assertEquals(1, matcher1.getCaptured().size());
        assertEquals("only_one", matcher1.getCaptured().get(0));
        assertEquals(0, matcher2.getCaptured().size());
    }

    @Test
    public void testCaptureArgumentsFromWithNonCapturingMatcher() {
        Matcher nonCapturingMatcher = new IsEqual<Object>("val");
        List<Matcher> matchers = Collections.singletonList(nonCapturingMatcher);

        Invocation wantedInvocation = new StubInvocation(mockInstance1, sampleMethod1, new Object[]{"val"}, false);
        Invocation actualInvocation = new StubInvocation(mockInstance1, sampleMethod1, new Object[]{"val"}, false);

        InvocationMatcher invocationMatcher = new InvocationMatcher(wantedInvocation, matchers);
        // Should not throw class cast exception
        invocationMatcher.captureArgumentsFrom(actualInvocation);
    }

    @Test
    public void testCreateFromWithList() {
        Invocation inv1 = new StubInvocation(mockInstance1, sampleMethod1, new Object[]{"1"}, false);
        Invocation inv2 = new StubInvocation(mockInstance1, sampleMethod2, new Object[]{"2"}, false);

        List<Invocation> invocations = Arrays.asList(inv1, inv2);
        List<InvocationMatcher> matchers = InvocationMatcher.createFrom(invocations);

        assertEquals(2, matchers.size());
        assertSame(inv1, matchers.get(0).getInvocation());
        assertSame(inv2, matchers.get(1).getInvocation());
    }

    @Test
    public void testCreateFromWithEmptyList() {
        List<InvocationMatcher> matchers = InvocationMatcher.createFrom(Collections.<Invocation>emptyList());
        assertNotNull(matchers);
        assertTrue(matchers.isEmpty());
    }

    @Test
    public void testGetLocationAndToString() {
        Invocation invocation = new StubInvocation(mockInstance1, sampleMethod1, new Object[]{"arg"}, false);
        InvocationMatcher matcher = new InvocationMatcher(invocation);

        assertNotNull(matcher.getLocation());
        assertEquals("sampleMethod([arg])", matcher.toString());
        assertEquals("sampleMethod([arg])", matcher.toString(new PrintSettings()));
    }

    @Test
    public void testSafelyArgumentsMatchCatchesException() {
        // Matcher ที่จงใจโยน RuntimeException ตอน matches() เพื่อทดสอบ catch block ใน safelyArgumentsMatch
        Matcher faultyMatcher = new BaseMatcher<Object>() {
            @Override
            public boolean matches(Object item) {
                throw new RuntimeException("Simulated comparison failure");
            }

            @Override
            public void describeTo(Description description) {
            }
        };

        Invocation wantedInvocation = new StubInvocation(mockInstance1, sampleMethod1, new Object[]{"arg"}, false);
        Invocation candidate = new StubInvocation(mockInstance1, overloadedMethod, new Object[]{"arg"}, false);

        InvocationMatcher matcher = new InvocationMatcher(wantedInvocation, Collections.singletonList(faultyMatcher));

        // safelyArgumentsMatch() จะ catch RuntimeException แล้ว return false
        // ดังนั้น overloadedButSameArgs = (!methodEquals && false) = false
        // hasSimilarMethod() จะ return !false = true
        assertTrue(matcher.hasSimilarMethod(candidate));
    }
}