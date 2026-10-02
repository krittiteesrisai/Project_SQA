package org.mockito.internal.stubbing.answers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.Serializable;
import java.lang.reflect.Method;

import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;

public class CallsRealMethodsTest {

    /**
     * Fake implementation ของ InvocationOnMock สำหรับควบคุมพฤติกรรมของ
     * callRealMethod() เพื่อทดสอบ CallsRealMethods.answer() โดยไม่พึ่ง
     * mockito-core mocking framework (ไม่มีอยู่ใน classpath ที่กำหนด)
     */
    private static class FakeInvocation implements InvocationOnMock, Serializable {
        private static final long serialVersionUID = 1L;
        private final Object returnValue;
        private final Throwable throwableToThrow;
        private boolean callRealMethodInvoked = false;

        FakeInvocation(Object returnValue) {
            this.returnValue = returnValue;
            this.throwableToThrow = null;
        }

        FakeInvocation(Throwable throwableToThrow) {
            this.returnValue = null;
            this.throwableToThrow = throwableToThrow;
        }

        boolean wasCallRealMethodInvoked() {
            return callRealMethodInvoked;
        }

        @Override
        public Object callRealMethod() throws Throwable {
            callRealMethodInvoked = true;
            if (throwableToThrow != null) {
                throw throwableToThrow;
            }
            return returnValue;
        }

        // เมธอดด้านล่างไม่ถูกใช้โดย CallsRealMethods.answer() แต่ต้อง implement
        // ให้ครบตาม interface InvocationOnMock
        @Override
        public Object getMock() {
            throw new UnsupportedOperationException("not needed for this test");
        }

        @Override
        public Method getMethod() {
            throw new UnsupportedOperationException("not needed for this test");
        }

        @Override
        public Object[] getArguments() {
            throw new UnsupportedOperationException("not needed for this test");
        }
    }

    private final CallsRealMethods callsRealMethods = new CallsRealMethods();

    // ----- กรณีปกติ: callRealMethod() คืนค่าไม่เป็น null -----
    @Test
    public void testAnswer_ReturnsNonNullValueFromRealMethod() throws Throwable {
        String expected = "real-result";
        FakeInvocation invocation = new FakeInvocation((Object) expected);

        Object result = callsRealMethods.answer(invocation);

        assertSame("answer() ต้องคืนค่าเดียวกับที่ callRealMethod() คืนมา",
                expected, result);
        assertTrue("callRealMethod() ต้องถูกเรียกจริง",
                invocation.wasCallRealMethodInvoked());
    }

    // ----- กรณีขอบ (boundary): callRealMethod() คืน null -----
    @Test
    public void testAnswer_ReturnsNullValueFromRealMethod() throws Throwable {
        FakeInvocation invocation = new FakeInvocation((Object) null);

        Object result = callsRealMethods.answer(invocation);

        assertNull("answer() ต้องคืน null ถ้า real method คืน null", result);
        assertTrue(invocation.wasCallRealMethodInvoked());
    }

    // ----- กรณี exception: checked Exception ต้องถูก propagate โดยไม่ถูก wrap/swallow -----
    @Test
    public void testAnswer_PropagatesCheckedException() {
        Exception expected = new Exception("checked exception from real method");
        FakeInvocation invocation = new FakeInvocation(expected);

        try {
            callsRealMethods.answer(invocation);
            fail("คาดว่าจะมีการ throw exception ออกมา");
        } catch (Throwable t) {
            assertSame("exception ที่ throw ออกมาต้องเป็นตัวเดียวกับที่ real method throw",
                    expected, t);
        }
        assertTrue(invocation.wasCallRealMethodInvoked());
    }

    // ----- กรณี exception: RuntimeException -----
    @Test
    public void testAnswer_PropagatesRuntimeException() {
        RuntimeException expected = new RuntimeException("runtime exception from real method");
        FakeInvocation invocation = new FakeInvocation(expected);

        try {
            callsRealMethods.answer(invocation);
            fail("คาดว่าจะมีการ throw RuntimeException ออกมา");
        } catch (Throwable t) {
            assertSame(expected, t);
        }
        assertTrue(invocation.wasCallRealMethodInvoked());
    }

    // ----- กรณี exception: Error (ไม่ใช่ Exception) -----
    @Test
    public void testAnswer_PropagatesError() {
        Error expected = new Error("error from real method");
        FakeInvocation invocation = new FakeInvocation(expected);

        try {
            callsRealMethods.answer(invocation);
            fail("คาดว่าจะมีการ throw Error ออกมา");
        } catch (Throwable t) {
            assertSame(expected, t);
        }
        assertTrue(invocation.wasCallRealMethodInvoked());
    }

    // ----- กรณีค่าตัวแทนประเภทอื่น (wrapper type) เพื่อยืนยันความถูกต้องของ passthrough -----
    @Test
    public void testAnswer_ReturnsPrimitiveWrapperValue() throws Throwable {
        Integer expected = Integer.valueOf(42);
        FakeInvocation invocation = new FakeInvocation((Object) expected);

        Object result = callsRealMethods.answer(invocation);

        assertEquals(expected, result);
        assertTrue(invocation.wasCallRealMethodInvoked());
    }

    // ----- ตรวจสัญญา Serializable ของคลาสเป้าหมาย (ประกาศ implements Serializable) -----
    @Test
    public void testCallsRealMethods_isSerializable() {
        org.mockito.stubbing.Answer<Object> answer = callsRealMethods;
        assertTrue("CallsRealMethods ต้อง implement Serializable",
                answer instanceof Serializable);
    }
}
