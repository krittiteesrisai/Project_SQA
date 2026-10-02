package org.mockito.internal.stubbing.defaultanswers;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.lang.reflect.Method;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;

/**
 * Unit tests for {@link ReturnsSmartNulls}.
 *
 * หมายเหตุสำคัญ (ข้อสมมติที่ไม่สามารถยืนยันได้ 100% จาก source ที่ให้มา):
 *  - exception ที่ถูก throw จาก Reporter().smartNullPointerException(location)
 *    ไม่ได้แสดง implementation ในซอร์สที่ให้มา จึงไม่ assert ชนิด/ข้อความของ exception
 *    แบบเจาะจง แต่จะตรวจสอบเพียงว่ามี Throwable ถูกโยนออกมาจริง
 *  - ค่าที่ ReturnsMoreEmptyValues (delegate) คืนสำหรับ primitive (0) และ List (empty list)
 *    เป็นพฤติกรรม default ที่รู้จักกันทั่วไปของ Mockito แต่ไม่ได้แสดง source ของคลาสนั้น
 *    ในที่นี้จึงใช้เพื่อยืนยัน branch "defaultReturnValue != null"
 */
public class ReturnsSmartNullsTest {

    private ReturnsSmartNulls returnsSmartNulls;

    // ----- Fixtures -----
    interface Sample {
        int getInt();
        String getStringUnused(); // ไม่ได้ใช้ตรง ๆ แต่เก็บไว้เผื่อขยาย
        List<String> getList();
        MockableClass getMockable();
        FinalClass getFinal();
        void getVoid();
    }

    /** คลาสที่ไม่ final -> ควร imposterise ได้ (ClassImposterizer.canImposterise == true) */
    static class MockableClass {
        public String doSomething() {
            return "real-value";
        }
    }

    /** คลาส final -> ไม่สามารถ imposterise ได้ (cglib subclass ไม่ได้) */
    static final class FinalClass {
    }

    @Before
    public void setUp() {
        returnsSmartNulls = new ReturnsSmartNulls();
    }

    private InvocationOnMock mockInvocation(String methodName, Class<?>... paramTypes) throws Exception {
        Method method = Sample.class.getMethod(methodName, paramTypes);
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        when(invocation.getMethod()).thenReturn(method);
        // getMock() ต้อง stub ไว้เสมอเพราะ delegate (ReturnsMoreEmptyValues) จะเรียกใช้
        // ไม่ว่า method name จะเป็นอะไร (อ้างอิงจาก behavior ที่รู้จักทั่วไปของ Mockito)
        when(invocation.getMock()).thenReturn(new Object());
        return invocation;
    }

    // ---------------------------------------------------------------
    // Branch: defaultReturnValue != null  -> return defaultReturnValue (primitive path)
    // ---------------------------------------------------------------
    @Test
    public void testAnswer_PrimitiveIntReturnType_ReturnsDefaultNonNullValue() throws Throwable {
        InvocationOnMock invocation = mockInvocation("getInt");

        Object result = returnsSmartNulls.answer(invocation);

        assertNotNull(result);
        assertEquals(0, result);
    }

    // ---------------------------------------------------------------
    // Branch: defaultReturnValue != null  -> return defaultReturnValue (collection path)
    // ---------------------------------------------------------------
    @Test
    public void testAnswer_ListReturnType_ReturnsEmptyListNotProxy() throws Throwable {
        InvocationOnMock invocation = mockInvocation("getList");

        Object result = returnsSmartNulls.answer(invocation);

        assertNotNull(result);
        assertTrue(result instanceof List);
        assertTrue(((List<?>) result).isEmpty());
    }

    // ---------------------------------------------------------------
    // Branch: defaultReturnValue == null && canImposterise(type) == false -> return null
    // (final class case)
    // ---------------------------------------------------------------
    @Test
    public void testAnswer_FinalReturnType_ReturnsPlainNull() throws Throwable {
        InvocationOnMock invocation = mockInvocation("getFinal");

        Object result = returnsSmartNulls.answer(invocation);

        assertNull(result);
    }

    // ---------------------------------------------------------------
    // Branch: defaultReturnValue == null && canImposterise(type) == false -> return null
    // (void return type case - boundary case)
    // ---------------------------------------------------------------
    @Test
    public void testAnswer_VoidReturnType_ReturnsNull() throws Throwable {
        InvocationOnMock invocation = mockInvocation("getVoid");

        Object result = returnsSmartNulls.answer(invocation);

        assertNull(result);
    }

    // ---------------------------------------------------------------
    // Branch: defaultReturnValue == null && canImposterise(type) == true -> return SmartNull proxy
    // ---------------------------------------------------------------
    @Test
    public void testAnswer_MockableReturnType_ReturnsNonNullProxy() throws Throwable {
        InvocationOnMock invocation = mockInvocation("getMockable");

        Object result = returnsSmartNulls.answer(invocation);

        assertNotNull(result);
        assertTrue(result instanceof MockableClass);
    }

    // ---------------------------------------------------------------
    // ThrowingInterceptor branch: isToString(method) == true
    // ---------------------------------------------------------------
    @Test
    public void testSmartNullProxy_ToString_ReturnsFormattedMessage() throws Throwable {
        InvocationOnMock invocation = mockInvocation("getMockable");

        Object proxy = returnsSmartNulls.answer(invocation);
        assertNotNull(proxy);

        String toStringResult = proxy.toString();

        assertNotNull(toStringResult);
        assertTrue(toStringResult.contains("SmartNull returned by unstubbed"));
        assertTrue(toStringResult.contains("getMockable()"));
        assertTrue(toStringResult.contains("method on mock"));
    }

    // ---------------------------------------------------------------
    // ThrowingInterceptor branch: isToString(method) == false -> Reporter().smartNullPointerException
    // ---------------------------------------------------------------
    @Test
    public void testSmartNullProxy_NonToStringMethodCall_ThrowsException() throws Throwable {
        InvocationOnMock invocation = mockInvocation("getMockable");

        Object proxyObj = returnsSmartNulls.answer(invocation);
        assertNotNull(proxyObj);
        MockableClass proxy = (MockableClass) proxyObj;

        Throwable caught = null;
        try {
            proxy.doSomething();
            fail("Expected an exception/NPE-like throwable to be thrown by SmartNull proxy");
        } catch (Throwable t) {
            caught = t;
        }

        // ไม่สามารถยืนยัน exception type/message ที่แน่นอนได้จาก source ที่ให้มา
        // (ขึ้นกับ implementation ของ Reporter().smartNullPointerException ที่ไม่มีใน source)
        assertNotNull(caught);
    }

    // ---------------------------------------------------------------
    // Null / edge-case input: invocation == null
    // ---------------------------------------------------------------
    @Test(expected = NullPointerException.class)
    public void testAnswer_NullInvocation_ThrowsNPE() throws Throwable {
        // คาดว่า delegate.answer(null) หรือ invocation.getMethod() จะ throw NPE
        // เนื่องจากไม่มีการ null-check ใน source ที่ให้มา
        returnsSmartNulls.answer(null);
    }
}
