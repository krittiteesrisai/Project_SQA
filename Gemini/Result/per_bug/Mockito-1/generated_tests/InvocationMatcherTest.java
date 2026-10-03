package org.mockito.internal.invocation;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.core.IsEqual;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.matchers.CapturesArguments;
import org.mockito.invocation.Invocation;
import org.mockito.invocation.Location;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class InvocationMatcherTest {

    private Method simpleMethod;
    private Method overloadedMethod;
    private Method differentMethod;
    private Method varargMethod;

    // Interface สำหรับสะท้อน Method types ต่างๆ
    interface TestMethods {
        void simple(String a, Integer b);
        void simple(String a, String b); // Overloaded
        void different(String a);
        void varargs(String... args);
    }

    @Before
    public void setUp() throws Exception {
        simpleMethod = TestMethods.class.getMethod("simple", String.class, Integer.class);
        overloadedMethod = TestMethods.class.getMethod("simple", String.class, String.class);
        differentMethod = TestMethods.class.getMethod("different", String.class);
        varargMethod = TestMethods.class.getMethod("varargs", String[].class);
    }

    // --- Helper Dummy Matcher สำหรับทดสอบ CapturesArguments ---
    private static class CapturingMatcher extends BaseMatcher<Object> implements CapturesArguments {
        private final List<Object> captured = new ArrayList<Object>();

        @Override
        public boolean matches(Object item) {
            return true;
        }

        @Override
        public void describeTo(Description description) {
            description.appendText("capturing matcher");
        }

        @Override
        public void captureFrom(Object argument) {
            captured.add(argument);
        }

        public List<Object> getCaptured() {
            return captured;
        }
    }

    // --- Helper Dummy Invocation Stub ---
    private static class DummyInvocation implements Invocation {
        private final Object mock;
        private final Method method;
        private final Object[] arguments;
        private final Object[] rawArguments;
        private final boolean isVerified;
        private final Location location;

        public DummyInvocation(Object mock, Method method, Object[] arguments, boolean isVerified) {
            this.mock = mock;
            this.method = method;
            this.arguments = arguments != null ? arguments : new Object[0];
            this.rawArguments = this.arguments;
            this.isVerified = isVerified;
            this.location = new Location() {
                @Override
                public String toString() {
                    return "-> at DummyLocation";
                }
            };
        }

        @Override public Object getMock() { return mock; }
        @Override public Method getMethod() { return method; }
        @Override public Object[] getArguments() { return arguments; }
        @Override public Object[] getRawArguments() { return rawArguments; }
        @Override public Class<?> getRawReturnType() { return method.getReturnType(); }
        @Override public boolean isVerified() { return isVerified; }
        @Override public int getSequenceNumber() { return 1; }
        @Override public Location getLocation() { return location; }
        @Override public boolean isIgnoredForVerification() { return false; }
        @Override public void ignoreForVerification() {}
        @Override public void markVerified() {}
        @Override public void markStubbed(org.mockito.invocation.StubInfo stubInfo) {}
        @Override public org.mockito.invocation.StubInfo stubInfo() { return null; }

        @Override
        @SuppressWarnings("unchecked")
        public <T> T getArgumentAt(int index, Class<T> clazz) {
            return (T) arguments[index];
        }
    }

    // 1. Constructor Tests
    @Test
    public void testConstructor_WithEmptyMatchers_ShouldAutoPopulateMatchers() {
        Object mock = new Object();
        Invocation invocation = new DummyInvocation(mock, simpleMethod, new Object[]{"val", 10}, false);
        
        InvocationMatcher matcher = new InvocationMatcher(invocation, Collections.<Matcher>emptyList());
        
        assertEquals(invocation, matcher.getInvocation());
        assertEquals(simpleMethod, matcher.getMethod());
        assertEquals(2, matcher.getMatchers().size());
        assertEquals(invocation.getLocation(), matcher.getLocation());
    }

    @Test
    public void testConstructor_WithExplicitMatchers_ShouldUseProvidedList() {
        Object mock = new Object();
        Invocation invocation = new DummyInvocation(mock, simpleMethod, new Object[]{"val", 10}, false);
        Matcher explicitMatcher = new IsEqual<Object>("val");
        List<Matcher> matchers = Collections.singletonList(explicitMatcher);

        InvocationMatcher matcher = new InvocationMatcher(invocation, matchers);

        assertEquals(1, matcher.getMatchers().size());
        assertSame(explicitMatcher, matcher.getMatchers().get(0));
    }

    @Test
    public void testSingleArgConstructor_ShouldDelegateWithEmptyMatchers() {
        Object mock = new Object();
        Invocation invocation = new DummyInvocation(mock, simpleMethod, new Object[]{"val", 10}, false);

        InvocationMatcher matcher = new InvocationMatcher(invocation);

        assertEquals(2, matcher.getMatchers().size());
    }

    // 2. hasSameMethod Tests
    @Test
    public void testHasSameMethod_SameMethodAndParams_ReturnsTrue() {
        Object mock = new Object();
        Invocation inv1 = new DummyInvocation(mock, simpleMethod, new Object[]{"a", 1}, false);
        Invocation inv2 = new DummyInvocation(mock, simpleMethod, new Object[]{"b", 2}, false);

        InvocationMatcher matcher = new InvocationMatcher(inv1);
        assertTrue(matcher.hasSameMethod(inv2));
    }

    @Test
    public void testHasSameMethod_DifferentMethodName_ReturnsFalse() {
        Object mock = new Object();
        Invocation inv1 = new DummyInvocation(mock, simpleMethod, new Object[]{"a", 1}, false);
        Invocation inv2 = new DummyInvocation(mock, differentMethod, new Object[]{"a"}, false);

        InvocationMatcher matcher = new InvocationMatcher(inv1);
        assertFalse(matcher.hasSameMethod(inv2));
    }

    @Test
    public void testHasSameMethod_SameNameDifferentParamTypes_ReturnsFalse() {
        Object mock = new Object();
        Invocation inv1 = new DummyInvocation(mock, simpleMethod, new Object[]{"a", 1}, false);
        Invocation inv2 = new DummyInvocation(mock, overloadedMethod, new Object[]{"a", "b"}, false);

        InvocationMatcher matcher = new InvocationMatcher(inv1);
        assertFalse(matcher.hasSameMethod(inv2));
    }

    // 3. hasSimilarMethod Tests
    @Test
    public void testHasSimilarMethod_SameMethodUnverifiedSameMock_ReturnsTrue() {
        Object mock = new Object();
        Invocation inv1 = new DummyInvocation(mock, simpleMethod, new Object[]{"a", 1}, false);
        Invocation inv2 = new DummyInvocation(mock, simpleMethod, new Object[]{"x", 2}, false);

        InvocationMatcher matcher = new InvocationMatcher(inv1);
        assertTrue(matcher.hasSimilarMethod(inv2));
    }

    @Test
    public void testHasSimilarMethod_DifferentMethodName_ReturnsFalse() {
        Object mock = new Object();
        Invocation inv1 = new DummyInvocation(mock, simpleMethod, new Object[]{"a", 1}, false);
        Invocation inv2 = new DummyInvocation(mock, differentMethod, new Object[]{"a"}, false);

        InvocationMatcher matcher = new InvocationMatcher(inv1);
        assertFalse(matcher.hasSimilarMethod(inv2));
    }

    @Test
    public void testHasSimilarMethod_AlreadyVerified_ReturnsFalse() {
        Object mock = new Object();
        Invocation inv1 = new DummyInvocation(mock, simpleMethod, new Object[]{"a", 1}, false);
        Invocation inv2 = new DummyInvocation(mock, simpleMethod, new Object[]{"a", 1}, true);

        InvocationMatcher matcher = new InvocationMatcher(inv1);
        assertFalse(matcher.hasSimilarMethod(inv2));
    }

    @Test
    public void testHasSimilarMethod_DifferentMockInstance_ReturnsFalse() {
        Object mock1 = new Object();
        Object mock2 = new Object();
        Invocation inv1 = new DummyInvocation(mock1, simpleMethod, new Object[]{"a", 1}, false);
        Invocation inv2 = new DummyInvocation(mock2, simpleMethod, new Object[]{"a", 1}, false);

        InvocationMatcher matcher = new InvocationMatcher(inv1);
        assertFalse(matcher.hasSimilarMethod(inv2));
    }

    @Test
    public void testHasSimilarMethod_OverloadedWithCompatibleArgs_ReturnsFalse() {
        Object mock = new Object();
        Invocation inv1 = new DummyInvocation(mock, simpleMethod, new Object[]{null, null}, false);
        Invocation inv2 = new DummyInvocation(mock, overloadedMethod, new Object[]{null, null}, false);

        InvocationMatcher matcher = new InvocationMatcher(inv1);
        assertFalse(matcher.hasSimilarMethod(inv2));
    }

    // 4. matches Tests
    @Test
    public void testMatches_IdenticalMockMethodAndArgs_ReturnsTrue() {
        Object mock = new Object();
        Invocation inv1 = new DummyInvocation(mock, simpleMethod, new Object[]{"test", 100}, false);
        Invocation inv2 = new DummyInvocation(mock, simpleMethod, new Object[]{"test", 100}, false);

        InvocationMatcher matcher = new InvocationMatcher(inv1);
        assertTrue(matcher.matches(inv2));
    }

    @Test
    public void testMatches_DifferentArguments_ReturnsFalse() {
        Object mock = new Object();
        Invocation inv1 = new DummyInvocation(mock, simpleMethod, new Object[]{"test", 100}, false);
        Invocation inv2 = new DummyInvocation(mock, simpleMethod, new Object[]{"test", 999}, false);

        InvocationMatcher matcher = new InvocationMatcher(inv1);
        assertFalse(matcher.matches(inv2));
    }

    @Test
    public void testMatches_DifferentMock_ReturnsFalse() {
        Invocation inv1 = new DummyInvocation(new Object(), simpleMethod, new Object[]{"test", 100}, false);
        Invocation inv2 = new DummyInvocation(new Object(), simpleMethod, new Object[]{"test", 100}, false);

        InvocationMatcher matcher = new InvocationMatcher(inv1);
        assertFalse(matcher.matches(inv2));
    }

    // 5. captureArgumentsFrom Tests
    @Test
    public void testCaptureArgumentsFrom_NonVarargsWithCapturingMatcher_CapturesSuccessfully() {
        Object mock = new Object();
        Invocation inv = new DummyInvocation(mock, simpleMethod, new Object[]{"capturedValue", 42}, false);

        CapturingMatcher capMatcher1 = new CapturingMatcher();
        CapturingMatcher capMatcher2 = new CapturingMatcher();
        List<Matcher> matchers = Arrays.<Matcher>asList(capMatcher1, capMatcher2);

        InvocationMatcher matcher = new InvocationMatcher(inv, matchers);
        matcher.captureArgumentsFrom(inv);

        assertEquals(1, capMatcher1.getCaptured().size());
        assertEquals("capturedValue", capMatcher1.getCaptured().get(0));
        assertEquals(1, capMatcher2.getCaptured().size());
        assertEquals(42, capMatcher2.getCaptured().get(0));
    }

    @Test
    public void testCaptureArgumentsFrom_NonVarargsNonCapturingMatcher_IgnoresGracefully() {
        Object mock = new Object();
        Invocation inv = new DummyInvocation(mock, simpleMethod, new Object[]{"val", 42}, false);
        Matcher nonCapturing = new IsEqual<Object>("val");

        InvocationMatcher matcher = new InvocationMatcher(inv, Collections.singletonList(nonCapturing));
        matcher.captureArgumentsFrom(inv);
        // Should execute loop without throwing ClassCastException
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCaptureArgumentsFrom_VarargsMethod_ThrowsUnsupportedOperationException() {
        Object mock = new Object();
        Invocation inv = new DummyInvocation(mock, varargMethod, new Object[]{new String[]{"a", "b"}}, false);

        InvocationMatcher matcher = new InvocationMatcher(inv);
        // Covers Defects4J Mockito-1 Varargs branch
        matcher.captureArgumentsFrom(inv);
    }

    // 6. createFrom & toString Tests
    @Test
    public void testCreateFrom_EmptyList_ReturnsEmptyList() {
        List<InvocationMatcher> result = InvocationMatcher.createFrom(Collections.<Invocation>emptyList());
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testCreateFrom_MultipleInvocations_ReturnsInvocationMatchersList() {
        Object mock = new Object();
        Invocation inv1 = new DummyInvocation(mock, simpleMethod, new Object[]{"a", 1}, false);
        Invocation inv2 = new DummyInvocation(mock, differentMethod, new Object[]{"b"}, false);

        List<InvocationMatcher> result = InvocationMatcher.createFrom(Arrays.asList(inv1, inv2));

        assertEquals(2, result.size());
        assertSame(inv1, result.get(0).getInvocation());
        assertSame(inv2, result.get(1).getInvocation());
    }

    @Test
    public void testToString_ReturnsFormattedString() {
        Object mock = new Object();
        Invocation inv = new DummyInvocation(mock, simpleMethod, new Object[]{"a", 1}, false);
        InvocationMatcher matcher = new InvocationMatcher(inv);

        String str = matcher.toString();
        assertNotNull(str);
        assertTrue(str.contains("simple"));
    }
}