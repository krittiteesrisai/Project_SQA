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
import org.mockito.invocation.InvocationOnMock;

public class ReturnsSmartNullsTest {

    private ReturnsSmartNulls returnsSmartNulls;

    // Interface และ Class จำลองสำหรับใช้ทดสอบ
    interface SampleService {
        String returnString();
        int returnPrimitiveInt();
        List<String> returnList();
        FinalClass returnFinalClass();
        MockableClass returnMockable();
        MockableClass methodWithNoArgs();
        MockableClass methodWithArgs(String text, Integer count);
        MockableClass methodWithNullArg(Object obj);
    }

    static final class FinalClass {
        public void doFinalAction() {}
    }

    static class MockableClass {
        public String executeAction() {
            return "executed";
        }
    }

    @Before
    public void setUp() {
        returnsSmartNulls = new ReturnsSmartNulls();
    }

    // Helper ในการสร้าง InvocationOnMock จำลอง
    private InvocationOnMock createInvocation(final Method method, final Object[] args) {
        return new InvocationOnMock() {
            public Object getMock() {
                return this;
            }

            public Method getMethod() {
                return method;
            }

            public Object[] getArguments() {
                return args == null ? new Object[0] : args;
            }

            public Object callRealMethod() throws Throwable {
                return null;
            }
        };
    }

    @Test
    public void testAnswer_DelegateReturnsDefaultEmptyValues_ForPrimitivesAndCollections() throws Throwable {
        Method stringMethod = SampleService.class.getMethod("returnString");
        Method intMethod = SampleService.class.getMethod("returnPrimitiveInt");
        Method listMethod = SampleService.class.getMethod("returnList");

        // ReturnsMoreEmptyValues ควรคืนค่า empty string, 0, และ empty list
        Object stringResult = returnsSmartNulls.answer(createInvocation(stringMethod, new Object[0]));
        Object intResult = returnsSmartNulls.answer(createInvocation(intMethod, new Object[0]));
        Object listResult = returnsSmartNulls.answer(createInvocation(listMethod, new Object[0]));

        assertEquals("", stringResult);
        assertEquals(0, intResult);
        assertNotNull(listResult);
        assertTrue(((List<?>) listResult).isEmpty());
    }

    @Test
    public void testAnswer_ReturnsNull_WhenTypeCannotBeImposterised() throws Throwable {
        Method finalMethod = SampleService.class.getMethod("returnFinalClass");
        InvocationOnMock invocation = createInvocation(finalMethod, new Object[0]);

        Object result = returnsSmartNulls.answer(invocation);

        // Final class ไม่สามารถทำ proxy ได้ ต้องคืนค่า null
        assertNull("Should return null for non-mockable/final types", result);
    }

    @Test
    public void testAnswer_ReturnsSmartNullProxy_WhenTypeCanBeImposterised() throws Throwable {
        Method mockableMethod = SampleService.class.getMethod("returnMockable");
        InvocationOnMock invocation = createInvocation(mockableMethod, new Object[0]);

        Object result = returnsSmartNulls.answer(invocation);

        // ตรวจสอบว่าได้ SmartNull Proxy object กลับมา
        assertNotNull("Should return a proxy instance", result);
        assertTrue("Proxy should be instance of MockableClass", result instanceof MockableClass);
    }

    @Test
    public void testSmartNull_ToString_WithNoArguments() throws Throwable {
        Method method = SampleService.class.getMethod("methodWithNoArgs");
        InvocationOnMock invocation = createInvocation(method, new Object[0]);

        Object smartNull = returnsSmartNulls.answer(invocation);
        assertNotNull(smartNull);

        String toStringResult = smartNull.toString();
        assertEquals("SmartNull returned by unstubbed methodWithNoArgs() method on mock", toStringResult);
    }

    @Test
    public void testSmartNull_ToString_WithMultipleArguments() throws Throwable {
        Method method = SampleService.class.getMethod("methodWithArgs", String.class, Integer.class);
        InvocationOnMock invocation = createInvocation(method, new Object[]{"testValue", 42});

        Object smartNull = returnsSmartNulls.answer(invocation);
        assertNotNull(smartNull);

        String toStringResult = smartNull.toString();
        assertEquals("SmartNull returned by unstubbed methodWithArgs(testValue, 42) method on mock", toStringResult);
    }

    @Test
    public void testSmartNull_ToString_WithNullArgument() throws Throwable {
        Method method = SampleService.class.getMethod("methodWithNullArg", Object.class);
        InvocationOnMock invocation = createInvocation(method, new Object[]{null});

        Object smartNull = returnsSmartNulls.answer(invocation);
        assertNotNull(smartNull);

        String toStringResult = smartNull.toString();
        assertEquals("SmartNull returned by unstubbed methodWithNullArg(null) method on mock", toStringResult);
    }

    @Test
    public void testSmartNull_MethodInvocation_ThrowsSmartNullPointerException() throws Throwable {
        Method method = SampleService.class.getMethod("returnMockable");
        InvocationOnMock invocation = createInvocation(method, new Object[0]);

        MockableClass smartNull = (MockableClass) returnsSmartNulls.answer(invocation);
        assertNotNull(smartNull);

        try {
            // เรียกเมธอดปกติบน SmartNull proxy จะต้องโยน SmartNullPointerException เสมอ
            smartNull.executeAction();
            fail("Expected SmartNullPointerException when invoking a method on SmartNull proxy");
        } catch (SmartNullPointerException expected) {
            // Success
            assertNotNull(expected.getMessage());
        }
    }

    @Test
    public void testReturnsSmartNulls_IsSerializable() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(returnsSmartNulls);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object deserialized = ois.readObject();

        assertNotNull(deserialized);
        assertTrue(deserialized instanceof ReturnsSmartNulls);
    }
}