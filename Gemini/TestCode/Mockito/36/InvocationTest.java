package org.mockito.internal.invocation;

import org.junit.Before;
import org.junit.Test;
import org.mockito.exceptions.PrintableInvocation;
import org.mockito.internal.invocation.realmethod.RealMethod;
import org.mockito.internal.reporting.PrintSettings;
import org.mockito.invocation.InvocationOnMock;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;

public class InvocationTest {

    private Object mockInstance;
    private DummyRealMethod dummyRealMethod;

    // Interface ตัวอย่างสำหรับการสะท้อน Method รูปแบบต่างๆ
    private interface SampleInterface {
        void voidMethod();
        int primitiveIntMethod();
        Number numberMethod(String s);
        void varArgsMethod(String prefix, Object... items);
        void nonVarArgsMethod(String a, String b);
        void throwingMethod() throws IOException;
        String longMethodNameToTriggerLineLengthBoundary(String param1, String param2, String param3);
        String toString();
    }

    private static class DummyRealMethod implements RealMethod {
        private static final long serialVersionUID = 1L;
        private Object returnValue;
        private Throwable exceptionToThrow;
        private boolean invoked = false;

        public DummyRealMethod(Object returnValue) {
            this.returnValue = returnValue;
        }

        public DummyRealMethod(Throwable exceptionToThrow) {
            this.exceptionToThrow = exceptionToThrow;
        }

        @Override
        public Object invoke(Object target, Object[] arguments) throws Throwable {
            this.invoked = true;
            if (exceptionToThrow != null) {
                throw exceptionToThrow;
            }
            return returnValue;
        }
    }

    private static class SimpleMockitoMethod implements MockitoMethod {
        private final Method method;

        public SimpleMockitoMethod(Method method) {
            this.method = method;
        }

        @Override
        public String getName() {
            return method.getName();
        }

        @Override
        public Class<?> getReturnType() {
            return method.getReturnType();
        }

        @Override
        public Class<?>[] getParameterTypes() {
            return method.getParameterTypes();
        }

        @Override
        public Class<?>[] getExceptionTypes() {
            return method.getExceptionTypes();
        }

        @Override
        public boolean isVarArgs() {
            return method.isVarArgs();
        }

        @Override
        public Method getJavaMethod() {
            return method;
        }
    }

    private Method getMethod(String name, Class<?>... parameterTypes) {
        try {
            return SampleInterface.class.getMethod(name, parameterTypes);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    @Before
    public void setUp() {
        mockInstance = new Object();
        dummyRealMethod = new DummyRealMethod("success");
    }

    @Test
    public void shouldHandleNullArgumentsWhenNotVarArgs() {
        MockitoMethod method = new SimpleMockitoMethod(getMethod("voidMethod"));
        Invocation invocation = new Invocation(mockInstance, method, null, 1, dummyRealMethod);

        assertNotNull(invocation.getArguments());
        assertEquals(0, invocation.getArguments().length);
        assertEquals(0, invocation.getArgumentsCount());
        assertNull(invocation.getRawArguments());
    }

    @Test
    public void shouldKeepArgumentsWhenNotVarArgs() {
        MockitoMethod method = new SimpleMockitoMethod(getMethod("nonVarArgsMethod", String.class, String.class));
        Object[] args = new Object[]{"val1", "val2"};
        Invocation invocation = new Invocation(mockInstance, method, args, 1, dummyRealMethod);

        assertArrayEquals(args, invocation.getArguments());
        assertArrayEquals(args, invocation.getRawArguments());
        assertEquals(2, invocation.getArgumentsCount());
    }

    @Test
    public void shouldExpandVarArgsWhenLastArgIsAnObjectArray() {
        MockitoMethod method = new SimpleMockitoMethod(getMethod("varArgsMethod", String.class, Object[].class));
        Object[] args = new Object[]{"prefix", new String[]{"elem1", "elem2"}};
        Invocation invocation = new Invocation(mockInstance, method, args, 1, dummyRealMethod);

        assertEquals(3, invocation.getArguments().length);
        assertEquals("prefix", invocation.getArguments()[0]);
        assertEquals("elem1", invocation.getArguments()[1]);
        assertEquals("elem2", invocation.getArguments()[2]);
        assertSame(args, invocation.getRawArguments());
    }

    @Test
    public void shouldExpandVarArgsWhenLastArgIsPrimitiveArray() {
        MockitoMethod method = new SimpleMockitoMethod(getMethod("varArgsMethod", String.class, Object[].class));
        Object[] args = new Object[]{"prefix", new int[]{10, 20}};
        Invocation invocation = new Invocation(mockInstance, method, args, 1, dummyRealMethod);

        assertEquals(3, invocation.getArguments().length);
        assertEquals("prefix", invocation.getArguments()[0]);
        assertEquals(10, invocation.getArguments()[1]);
        assertEquals(20, invocation.getArguments()[2]);
    }

    @Test
    public void shouldHandleNullVarArgArrayAsNullElement() {
        MockitoMethod method = new SimpleMockitoMethod(getMethod("varArgsMethod", String.class, Object[].class));
        Object[] args = new Object[]{"prefix", null};
        Invocation invocation = new Invocation(mockInstance, method, args, 1, dummyRealMethod);

        assertEquals(2, invocation.getArguments().length);
        assertEquals("prefix", invocation.getArguments()[0]);
        assertNull(invocation.getArguments()[1]);
    }

    @Test
    public void shouldNotExpandVarArgsWhenLastArgIsNotAnArray() {
        MockitoMethod method = new SimpleMockitoMethod(getMethod("varArgsMethod", String.class, Object[].class));
        Object[] args = new Object[]{"prefix", "singleElement"};
        Invocation invocation = new Invocation(mockInstance, method, args, 1, dummyRealMethod);

        assertEquals(2, invocation.getArguments().length);
        assertEquals("prefix", invocation.getArguments()[0]);
        assertEquals("singleElement", invocation.getArguments()[1]);
    }

    @Test
    public void shouldVerifyEqualsAndHashCode() {
        MockitoMethod method1 = new SimpleMockitoMethod(getMethod("nonVarArgsMethod", String.class, String.class));
        MockitoMethod method2 = new SimpleMockitoMethod(getMethod("voidMethod"));

        Invocation inv1 = new Invocation(mockInstance, method1, new Object[]{"a", "b"}, 1, dummyRealMethod);
        Invocation inv2 = new Invocation(mockInstance, method1, new Object[]{"a", "b"}, 1, dummyRealMethod);
        Invocation invDiffMock = new Invocation(new Object(), method1, new Object[]{"a", "b"}, 1, dummyRealMethod);
        Invocation invDiffMethod = new Invocation(mockInstance, method2, new Object[]{}, 1, dummyRealMethod);
        Invocation invDiffArgs = new Invocation(mockInstance, method1, new Object[]{"a", "diff"}, 1, dummyRealMethod);

        // Branch: self and identical
        assertTrue(inv1.equals(inv1));
        assertTrue(inv1.equals(inv2));

        // Branch: null and different class
        assertFalse(inv1.equals(null));
        assertFalse(inv1.equals("Some String Object"));

        // Branch: differences in fields
        assertFalse(inv1.equals(invDiffMock));
        assertFalse(inv1.equals(invDiffMethod));
        assertFalse(inv1.equals(invDiffArgs));

        // hashCode contract branch: always throws exception
        try {
            inv1.hashCode();
            fail("Expected RuntimeException on hashCode()");
        } catch (RuntimeException e) {
            assertEquals("hashCode() is not implemented", e.getMessage());
        }
    }

    @Test
    public void shouldValidateExceptionTypes() {
        MockitoMethod method = new SimpleMockitoMethod(getMethod("throwingMethod"));
        Invocation invocation = new Invocation(mockInstance, method, new Object[0], 1, dummyRealMethod);

        assertTrue(invocation.isValidException(new IOException()));
        assertTrue(invocation.isValidException(new FileNotFoundException())); // Subclass
        assertFalse(invocation.isValidException(new SQLException()));         // Unrelated
        assertFalse(invocation.isValidException(new Exception()));            // Superclass
    }

    @Test
    public void shouldValidatePrimitiveReturnTypes() {
        MockitoMethod intMethod = new SimpleMockitoMethod(getMethod("primitiveIntMethod"));
        Invocation invocation = new Invocation(mockInstance, intMethod, new Object[0], 1, dummyRealMethod);

        assertTrue(invocation.returnsPrimitive());
        assertTrue(invocation.isValidReturnType(Integer.class));
        assertFalse(invocation.isValidReturnType(String.class));
        assertFalse(invocation.isValidReturnType(Double.class));
        assertEquals("int", invocation.printMethodReturnType());
        assertFalse(invocation.isVoid());
    }

    @Test
    public void shouldValidateNonPrimitiveReturnTypes() {
        MockitoMethod numberMethod = new SimpleMockitoMethod(getMethod("numberMethod", String.class));
        Invocation invocation = new Invocation(mockInstance, numberMethod, new Object[]{"test"}, 1, dummyRealMethod);

        assertFalse(invocation.returnsPrimitive());
        assertTrue(invocation.isValidReturnType(Number.class));
        assertTrue(invocation.isValidReturnType(Integer.class)); // Subtype
        assertFalse(invocation.isValidReturnType(String.class));  // Incompatible
        assertEquals("Number", invocation.printMethodReturnType());
        assertFalse(invocation.isVoid());
    }

    @Test
    public void shouldIdentifyVoidMethod() {
        MockitoMethod voidMethod = new SimpleMockitoMethod(getMethod("voidMethod"));
        Invocation invocation = new Invocation(mockInstance, voidMethod, new Object[0], 1, dummyRealMethod);

        assertTrue(invocation.isVoid());
        assertTrue(invocation.returnsPrimitive());
        assertEquals("void", invocation.printMethodReturnType());
        assertEquals("voidMethod", invocation.getMethodName());
    }

    @Test
    public void shouldTrackVerificationStatus() {
        MockitoMethod method = new SimpleMockitoMethod(getMethod("voidMethod"));
        Invocation invocation = new Invocation(mockInstance, method, new Object[0], 1, dummyRealMethod);

        assertFalse(invocation.isVerified());
        assertFalse(invocation.isVerifiedInOrder());

        invocation.markVerified();
        assertTrue(invocation.isVerified());
        assertFalse(invocation.isVerifiedInOrder());

        invocation.markVerifiedInOrder();
        assertTrue(invocation.isVerified());
        assertTrue(invocation.isVerifiedInOrder());
    }

    @Test
    public void shouldExecuteRealMethodSuccessfully() throws Throwable {
        MockitoMethod method = new SimpleMockitoMethod(getMethod("numberMethod", String.class));
        Invocation invocation = new Invocation(mockInstance, method, new Object[]{"val"}, 1, dummyRealMethod);

        Object result = invocation.callRealMethod();
        assertEquals("success", result);
        assertTrue(dummyRealMethod.invoked);
    }

    @Test(expected = IOException.class)
    public void shouldPropagateExceptionFromRealMethod() throws Throwable {
        DummyRealMethod failingRealMethod = new DummyRealMethod(new IOException("Disk read error"));
        MockitoMethod method = new SimpleMockitoMethod(getMethod("throwingMethod"));
        Invocation invocation = new Invocation(mockInstance, method, new Object[0], 1, failingRealMethod);

        invocation.callRealMethod();
    }

    @Test
    public void shouldRenderShortToString() {
        MockitoMethod method = new SimpleMockitoMethod(getMethod("voidMethod"));
        Invocation invocation = new Invocation(mockInstance, method, new Object[0], 1, dummyRealMethod);

        String str = invocation.toString();
        assertNotNull(str);
        assertTrue(str.contains("voidMethod()"));
        assertFalse(str.contains("\n"));
    }

    @Test
    public void shouldRenderMultilineToStringWhenConfiguredOrLong() {
        MockitoMethod method = new SimpleMockitoMethod(getMethod(
                "longMethodNameToTriggerLineLengthBoundary",
                String.class, String.class, String.class
        ));
        Invocation invocation = new Invocation(
                mockInstance, method,
                new Object[]{"parameterValueOne", "parameterValueTwo", "parameterValueThree"},
                1, dummyRealMethod
        );

        PrintSettings multilineSettings = new PrintSettings();
        multilineSettings.setMultiline(true);
        String multilineResult = invocation.toString(multilineSettings);
        assertTrue(multilineResult.contains("\n"));

        // Trigger length > 45 boundary naturally
        PrintSettings defaultSettings = new PrintSettings();
        String autoMultilineResult = invocation.toString(defaultSettings);
        assertTrue(autoMultilineResult.contains("\n"));
    }

    @Test
    public void shouldConvertArrayAndNullArgumentsToMatchersInToString() {
        MockitoMethod method = new SimpleMockitoMethod(getMethod("varArgsMethod", String.class, Object[].class));
        Object[] args = new Object[]{null, new String[]{"elem1"}};
        Invocation invocation = new Invocation(mockInstance, method, args, 1, dummyRealMethod);

        String result = invocation.toString();
        assertNotNull(result);
        assertTrue(result.contains("null"));
        assertTrue(result.contains("elem1"));
    }

    @Test
    public void shouldCheckIsToStringMethod() {
        MockitoMethod toStringMethod = new SimpleMockitoMethod(getMethod("toString"));
        Invocation toStringInvocation = new Invocation(mockInstance, toStringMethod, new Object[0], 1, dummyRealMethod);
        assertTrue(Invocation.isToString(toStringInvocation));

        MockitoMethod voidMethod = new SimpleMockitoMethod(getMethod("voidMethod"));
        Invocation voidInvocation = new Invocation(mockInstance, voidMethod, new Object[0], 2, dummyRealMethod);
        assertFalse(Invocation.isToString(voidInvocation));
    }

    @Test
    public void shouldVerifyBasicGetters() {
        MockitoMethod method = new SimpleMockitoMethod(getMethod("voidMethod"));
        Invocation invocation = new Invocation(mockInstance, method, new Object[0], 42, dummyRealMethod);

        assertSame(mockInstance, invocation.getMock());
        assertSame(method, invocation.getMethod());
        assertEquals(Integer.valueOf(42), invocation.getSequenceNumber());
        assertNotNull(invocation.getLocation());
    }
}