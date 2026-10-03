package org.mockito.internal.stubbing.defaultanswers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.exceptions.verification.SmartNullPointerException;
import org.mockito.internal.invocation.InvocationMatcher;
import org.mockito.internal.invocation.SerializableMethod;
import org.mockito.invocation.Invocation;
import org.mockito.invocation.InvocationOnMock;

public class ReturnsSmartNullsTest {

    private ReturnsSmartNulls answer;

    @Before
    public void setUp() {
        answer = new ReturnsSmartNulls();
    }

    // Helper Interfaces and Classes for testing
    interface SampleService {
        String getString();
        int getPrimitiveInt();
        List<String> getList();
        SampleService getSelf();
        FinalClass getFinalClass();
        void doNothing();
        String methodWithArgs(String param1, int param2);
    }

    static final class FinalClass {
        public void execute() {}
    }

    private static class DummyInvocation implements InvocationOnMock {
        private final Object mock;
        private final Method method;
        private final Object[] arguments;

        DummyInvocation(Object mock, Method method, Object[] arguments) {
            this.mock = mock;
            this.method = method;
            this.arguments = arguments != null ? arguments : new Object[0];
        }

        public Object getMock() {
            return mock;
        }

        public Method getMethod() {
            return method;
        }

        public Object[] getArguments() {
            return arguments;
        }

        public Object callRealMethod() throws Throwable {
            return null;
        }
    }

    private InvocationOnMock createInvocation(Class<?> clazz, String methodName, Class<?>... parameterTypes) throws NoSuchMethodException {
        return createInvocationWithArgs(clazz, methodName, new Object[parameterTypes.length], parameterTypes);
    }

    private InvocationOnMock createInvocationWithArgs(Class<?> clazz, String methodName, Object[] args, Class<?>... parameterTypes) throws NoSuchMethodException {
        Method method = clazz.getMethod(methodName, parameterTypes);
        return new DummyInvocation(new Object(), method, args);
    }

    @Test
    public void testReturnsDefaultEmptyValuesForSupportedTypes() throws Throwable {
        // String -> ""
        InvocationOnMock strInvocation = createInvocation(SampleService.class, "getString");
        Object strResult = answer.answer(strInvocation);
        assertEquals("", strResult);

        // int -> 0
        InvocationOnMock intInvocation = createInvocation(SampleService.class, "getPrimitiveInt");
        Object intResult = answer.answer(intInvocation);
        assertEquals(0, intResult);

        // List -> empty list
        InvocationOnMock listInvocation = createInvocation(SampleService.class, "getList");
        Object listResult = answer.answer(listInvocation);
        assertNotNull(listResult);
        assertTrue(listResult instanceof List);
        assertTrue(((List<?>) listResult).isEmpty());
    }

    @Test
    public void testReturnsSmartNullForMockableInterface() throws Throwable {
        InvocationOnMock selfInvocation = createInvocation(SampleService.class, "getSelf");
        Object result = answer.answer(selfInvocation);

        assertNotNull("SmartNull proxy should be returned for interface", result);
        assertTrue("Result should be an instance of SampleService", result instanceof SampleService);
    }

    @Test
    public void testReturnsNullForUnmockableFinalClass() throws Throwable {
        InvocationOnMock finalInvocation = createInvocation(SampleService.class, "getFinalClass");
        Object result = answer.answer(finalInvocation);

        assertNull("Ordinary null must be returned for final class", result);
    }

    @Test
    public void testReturnsNullForVoidReturnType() throws Throwable {
        InvocationOnMock voidInvocation = createInvocation(SampleService.class, "doNothing");
        Object result = answer.answer(voidInvocation);

        assertNull("Should return null for void method", result);
    }

    @Test
    public void testSmartNullToStringReturnsDescriptiveMessageWithoutArgs() throws Throwable {
        InvocationOnMock invocation = createInvocation(SampleService.class, "getSelf");
        Object smartNull = answer.answer(invocation);
        assertNotNull(smartNull);

        String toStringResult = smartNull.toString();
        assertTrue("toString should contain method name", toStringResult.contains("getSelf()"));
        assertTrue("toString should indicate it is a SmartNull", toStringResult.startsWith("SmartNull returned by unstubbed"));
    }

    @Test
    public void testSmartNullToStringWithArguments() throws Throwable {
        InvocationOnMock invocation = createInvocationWithArgs(
                SampleService.class, 
                "methodWithArgs", 
                new Object[]{"hello", 123}, 
                String.class, 
                int.class
        );
        
        // Return type is String, which ReturnsMoreEmptyValues handles ("")
        Object directResult = answer.answer(invocation);
        assertEquals("", directResult);
    }

    @Test
    public void testSmartNullThrowsSmartNullPointerExceptionOnInvocation() throws Throwable {
        InvocationOnMock invocation = createInvocation(SampleService.class, "getSelf");
        SampleService smartNull = (SampleService) answer.answer(invocation);

        try {
            smartNull.getString();
            fail("SmartNull should throw SmartNullPointerException when a method is called");
        } catch (SmartNullPointerException e) {
            assertNotNull(e.getMessage());
            assertTrue(e.getMessage().contains("You have a NullPointerException here:"));
        }
    }

    @Test
    public void testSerializationOfReturnsSmartNulls() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(answer);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        Object deserialized = ois.readObject();

        assertNotNull(deserialized);
        assertTrue(deserialized instanceof ReturnsSmartNulls);
    }
}