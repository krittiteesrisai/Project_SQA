package org.mockito.internal.invocation;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.core.IsEqual;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.matchers.CapturesArguments;
import org.mockito.invocation.DescribedInvocation;
import org.mockito.invocation.Invocation;
import org.mockito.invocation.Location;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.*;

import static org.junit.Assert.*;

public class InvocationMatcherTest {

    private Object mockInstance1;
    private Object mockInstance2;

    private Method simpleMethod;
    private Method overloadedMethod;
    private Method differentMethod;
    private Method varargMethod;
    private Method multipleArgVarargMethod;

    // Interface สำหรับสะท้อน Method signatures ต่างๆ
    interface SampleInterface {
        void simpleMethod(String arg);
        void simpleMethod(Integer arg);
        void differentMethod(String arg);
        void varargMethod(String... args);
        void multipleArgVarargMethod(String prefix, int count, String... items);
    }

    @Before
    public void setUp() throws Exception {
        mockInstance1 = new Object();
        mockInstance2 = new Object();

        simpleMethod = SampleInterface.class.getMethod("simpleMethod", String.class);
        overloadedMethod = SampleInterface.class.getMethod("simpleMethod", Integer.class);
        differentMethod = SampleInterface.class.getMethod("differentMethod", String.class);
        varargMethod = SampleInterface.class.getMethod("varargMethod", String[].class);
        multipleArgVarargMethod = SampleInterface.class.getMethod("multipleArgVarargMethod", String.class, int.class, String[].class);
    }

    // --- Stub Classes สำหรับจำลอง Invocation & Matcher โดยไม่ต้องพึ่งภายนอก ---

    private static class CapturingMatcher implements Matcher<Object>, CapturesArguments, Serializable {
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
        public void _dont_implement_Matcher___instead_extend_BaseMatcher_() {}

        @Override
        public void captureFrom(Object argument) {
            captured.add(argument);
        }

        public List<Object> getCaptured() {
            return captured;
        }
    }

    private static class NonCapturingMatcher implements Matcher<Object>, Serializable {
        @Override
        public boolean matches(Object item) {
            return true;
        }

        @Override
        public void describeTo(Description description) {
            description.appendText("non-capturing");
        }

        @Override
        public void _dont_implement_Matcher___instead_extend_BaseMatcher_() {}
    }

    private static class FakeInvocation implements Invocation {
        private final Object mock;
        private final Method method;
        private final Object[] rawArguments;
        private final Object[] processedArguments;
        private boolean verified = false;

        public FakeInvocation(Object mock, Method method, Object[] rawArguments, Object[] processedArguments) {
            this.mock = mock;
            this.method = method;
            this.rawArguments = rawArguments != null ? rawArguments : new Object[0];
            this.processedArguments = processedArguments != null ? processedArguments : this.rawArguments;
        }

        public FakeInvocation(Object mock, Method method, Object[] rawArguments) {
            this(mock, method, rawArguments, rawArguments);
        }

        @Override public boolean isVerified() { return verified; }
        @Override public int getSequenceNumber() { return 1; }
        @Override public Location getLocation() { return new Location() { @Override public String toString() { return "fake_location"; } }; }
        @Override public Object[] getRawArguments() { return rawArguments; }
        @Override public Object[] getArguments() { return processedArguments; }
        @Override public <T> T getArgumentAt(int index, Class<T> clazz) { return clazz.cast(processedArguments[index]); }
        @Override public Method getMethod() { return method; }
        @Override public Object getMock() { return mock; }
        @Override public void markVerified() { this.verified = true; }
        @Override public StubInfo stubInfo() { return null; }
        @Override public void markStubbed(StubInfo stubInfo) {}
        @Override public boolean isIgnoredForVerification() { return false; }
        @Override public void ignoreForVerification() {}
    }

    // --- Test Cases ---

    @Test
    public void testConstructorWithEmptyMatchersPopulatesDefaultMatchers() {
        Invocation invocation = new FakeInvocation(mockInstance1, simpleMethod, new Object[]{"test"});
        InvocationMatcher matcher = new InvocationMatcher(invocation);

        assertEquals(invocation, matcher.getInvocation());
        assertEquals(simpleMethod, matcher.getMethod());
        assertEquals(1, matcher.getMatchers().size());
        assertNotNull(matcher.getLocation());
    }

    @Test
    public void testConstructorWithExplicitMatchers() {
        Invocation invocation = new FakeInvocation(mockInstance1, simpleMethod, new Object[]{"test"});
        Matcher customMatcher = new NonCapturingMatcher();
        InvocationMatcher matcher = new InvocationMatcher(invocation, Collections.singletonList(customMatcher));

        assertEquals(1, matcher.getMatchers().size());
        assertSame(customMatcher, matcher.getMatchers().get(0));
    }

    @Test
    public void testMatchesReturnsTrueWhenAllMatch() {
        Invocation invocation1 = new FakeInvocation(mockInstance1, simpleMethod, new Object[]{"hello"});
        Invocation invocation2 = new FakeInvocation(mockInstance1, simpleMethod, new Object[]{"hello"});

        InvocationMatcher matcher = new InvocationMatcher(invocation1);
        assertTrue(matcher.matches(invocation2));
    }

    @Test
    public void testMatchesReturnsFalseWhenMockDiffers() {
        Invocation invocation1 = new FakeInvocation(mockInstance1, simpleMethod, new Object[]{"hello"});
        Invocation invocation2 = new FakeInvocation(mockInstance2, simpleMethod, new Object[]{"hello"});

        InvocationMatcher matcher = new InvocationMatcher(invocation1);
        assertFalse(matcher.matches(invocation2));
    }

    @Test
    public void testMatchesReturnsFalseWhenMethodDiffers() {
        Invocation invocation1 = new FakeInvocation(mockInstance1, simpleMethod, new Object[]{"hello"});
        Invocation invocation2 = new FakeInvocation(mockInstance1, differentMethod, new Object[]{"hello"});

        InvocationMatcher matcher = new InvocationMatcher(invocation1);
        assertFalse(matcher.matches(invocation2));
    }

    @Test
    public void testMatchesReturnsFalseWhenArgumentsDoNotMatch() {
        Invocation invocation1 = new FakeInvocation(mockInstance1, simpleMethod, new Object[]{"hello"});
        Invocation invocation2 = new FakeInvocation(mockInstance1, simpleMethod, new Object[]{"world"});

        InvocationMatcher matcher = new InvocationMatcher(invocation1);
        assertFalse(matcher.matches(invocation2));
    }

    @Test
    public void testHasSameMethod() {
        Invocation invocation1 = new FakeInvocation(mockInstance1, simpleMethod, new Object[]{"hello"});
        InvocationMatcher matcher = new InvocationMatcher(invocation1);

        // Same method
        Invocation candidateSame = new FakeInvocation(mockInstance1, simpleMethod, new Object[]{"other"});
        assertTrue(matcher.hasSameMethod(candidateSame));

        // Different method name
        Invocation candidateDiffName = new FakeInvocation(mockInstance1, differentMethod, new Object[]{"hello"});
        assertFalse(matcher.hasSameMethod(candidateDiffName));

        // Overloaded method (different parameter types)
        Invocation candidateOverloaded = new FakeInvocation(mockInstance1, overloadedMethod, new Object[]{123});
        assertFalse(matcher.hasSameMethod(candidateOverloaded));

        // Different parameter count
        Invocation candidateDiffParamCount = new FakeInvocation(mockInstance1, multipleArgVarargMethod, new Object[]{"a", 1, new String[]{"b"}});
        assertFalse(matcher.hasSameMethod(candidateDiffParamCount));
    }

    @Test
    public void testHasSimilarMethodBranches() {
        Invocation baseInvocation = new FakeInvocation(mockInstance1, simpleMethod, new Object[]{"test"});
        InvocationMatcher matcher = new InvocationMatcher(baseInvocation);

        // Case 1: Method name differs
        Invocation diffNameInvocation = new FakeInvocation(mockInstance1, differentMethod, new Object[]{"test"});
        assertFalse(matcher.hasSimilarMethod(diffNameInvocation));

        // Case 2: Candidate is verified
        Invocation verifiedInvocation = new FakeInvocation(mockInstance1, simpleMethod, new Object[]{"test"});
        verifiedInvocation.markVerified();
        assertFalse(matcher.hasSimilarMethod(verifiedInvocation));

        // Case 3: Mock instance differs
        Invocation diffMockInvocation = new FakeInvocation(mockInstance2, simpleMethod, new Object[]{"test"});
        assertFalse(matcher.hasSimilarMethod(diffMockInvocation));

        // Case 4: Overloaded method with different argument types (should return true because safelyArgumentsMatch fails)
        Invocation overloadedDifferentArgs = new FakeInvocation(mockInstance1, overloadedMethod, new Object[]{100});
        assertTrue(matcher.hasSimilarMethod(overloadedDifferentArgs));

        // Case 5: Overloaded method with compatible arguments (should return false because overloadedButSameArgs is true)
        Invocation overloadedSameArgs = new FakeInvocation(mockInstance1, overloadedMethod, new Object[]{"test"});
        assertFalse(matcher.hasSimilarMethod(overloadedSameArgs));

        // Case 6: Exact same method and unverified
        Invocation validCandidate = new FakeInvocation(mockInstance1, simpleMethod, new Object[]{"test"});
        assertTrue(matcher.hasSimilarMethod(validCandidate));
    }

    @Test
    public void testCaptureArgumentsFromNonVarargs() {
        CapturingMatcher capturingMatcher = new CapturingMatcher();
        NonCapturingMatcher nonCapturingMatcher = new NonCapturingMatcher();

        Invocation baseInvocation = new FakeInvocation(mockInstance1, multipleArgVarargMethod, new Object[]{"prefix", 1, new String[]{"a"}});
        List<Matcher> matchers = Arrays.asList(capturingMatcher, nonCapturingMatcher, capturingMatcher);

        InvocationMatcher invocationMatcher = new InvocationMatcher(baseInvocation, matchers);

        Invocation actualInvocation = new FakeInvocation(
                mockInstance1,
                simpleMethod, // non-vararg method
                new Object[]{"captured1", 99, "captured2"}
        );

        invocationMatcher.captureArgumentsFrom(actualInvocation);

        assertEquals(2, capturingMatcher.getCaptured().size());
        assertEquals("captured1", capturingMatcher.getCaptured().get(0));
        assertEquals("captured2", capturingMatcher.getCaptured().get(1));
    }

    @Test
    public void testCaptureArgumentsFromVarargsSingleElement() {
        CapturingMatcher arg1 = new CapturingMatcher();
        CapturingMatcher arg2 = new CapturingMatcher();
        CapturingMatcher varargMatcher = new CapturingMatcher();

        List<Matcher> matchers = Arrays.asList(arg1, arg2, varargMatcher);

        Invocation baseInvocation = new FakeInvocation(mockInstance1, multipleArgVarargMethod, new Object[]{"prefix", 1, new String[]{"item1"}});
        InvocationMatcher invocationMatcher = new InvocationMatcher(baseInvocation, matchers);

        // Vararg invocation with 1 vararg item
        Object[] rawArgs = new Object[]{"prefixValue", 10, new String[]{"item1"}};
        Object[] processedArgs = new Object[]{"prefixValue", 10, "item1"};
        Invocation actualInvocation = new FakeInvocation(mockInstance1, multipleArgVarargMethod, rawArgs, processedArgs);

        invocationMatcher.captureArgumentsFrom(actualInvocation);

        assertEquals(1, arg1.getCaptured().size());
        assertEquals("prefixValue", arg1.getCaptured().get(0));

        assertEquals(1, arg2.getCaptured().size());
        assertEquals(10, arg2.getCaptured().get(0));

        assertEquals(1, varargMatcher.getCaptured().size());
        assertNotNull(varargMatcher.getCaptured().get(0));
    }

    @Test
    public void testCaptureArgumentsFromVarargsMultipleElements() {
        CapturingMatcher matcher1 = new CapturingMatcher();
        CapturingMatcher matcher2 = new CapturingMatcher();

        List<Matcher> matchers = Arrays.asList(matcher1, matcher2);

        Invocation baseInvocation = new FakeInvocation(mockInstance1, varargMethod, new Object[]{new String[]{"a", "b"}});
        InvocationMatcher invocationMatcher = new InvocationMatcher(baseInvocation, matchers);

        Object[] rawArgs = new Object[]{new String[]{"a", "b"}};
        Object[] processedArgs = new Object[]{"a", "b"};
        Invocation actualInvocation = new FakeInvocation(mockInstance1, varargMethod, rawArgs, processedArgs);

        invocationMatcher.captureArgumentsFrom(actualInvocation);

        // Vararg position 0 และ position 1
        assertEquals(1, matcher1.getCaptured().size());
    }

    @Test
    public void testCreateFromList() {
        Invocation inv1 = new FakeInvocation(mockInstance1, simpleMethod, new Object[]{"1"});
        Invocation inv2 = new FakeInvocation(mockInstance1, simpleMethod, new Object[]{"2"});

        List<Invocation> list = Arrays.asList(inv1, inv2);
        List<InvocationMatcher> result = InvocationMatcher.createFrom(list);

        assertEquals(2, result.size());
        assertSame(inv1, result.get(0).getInvocation());
        assertSame(inv2, result.get(1).getInvocation());

        // Empty list handling
        List<InvocationMatcher> emptyResult = InvocationMatcher.createFrom(Collections.<Invocation>emptyList());
        assertTrue(emptyResult.isEmpty());
    }

    @Test
    public void testToStringDoesNotThrow() {
        Invocation invocation = new FakeInvocation(mockInstance1, simpleMethod, new Object[]{"test"});
        InvocationMatcher matcher = new InvocationMatcher(invocation);

        String rendered = matcher.toString();
        assertNotNull(rendered);
        assertTrue(rendered.contains("simpleMethod"));
    }
}