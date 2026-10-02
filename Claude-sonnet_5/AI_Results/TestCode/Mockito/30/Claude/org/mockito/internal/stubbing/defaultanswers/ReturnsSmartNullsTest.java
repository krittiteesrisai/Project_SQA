package org.mockito.internal.stubbing.defaultanswers;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.lang.reflect.Method;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;

public class ReturnsSmartNullsTest {

    private ReturnsSmartNulls returnsSmartNulls;
    private InvocationOnMock invocation;

    // ---- fixtures ----
    public interface Foo {
        String getName();
    }

    public interface SampleInterface {
        int intMethod();
        boolean booleanMethod();
        long longMethod();
        String stringMethod();
        List<String> listMethod();
        void voidMethod();
        Foo fooMethod();
        FinalClass finalMethod();
        Foo doSomething(String a, int b);
    }

    // final class -> ไม่ mockable ตาม javadoc ของ ReturnsSmartNulls
    public static final class FinalClass {
    }

    @Before
    public void setUp() {
        returnsSmartNulls = new ReturnsSmartNulls();
        invocation = mock(InvocationOnMock.class);
        // stub ป้องกัน NPE กรณี delegate (ReturnsMoreEmptyValues) อ้างอิง getMock()
        when(invocation.getMock()).thenReturn(new Object());
    }

    private Method methodOf(String name, Class<?>... paramTypes) throws NoSuchMethodException {
        return SampleInterface.class.getMethod(name, paramTypes);
    }

    // =====================================================
    // Branch: defaultReturnValue != null  -> true
    // =====================================================

    @Test
    public void shouldReturnOrdinaryIntValue_whenDelegateProvidesNonNull() throws Throwable {
        when(invocation.getMethod()).thenReturn(methodOf("intMethod"));
        when(invocation.getArguments()).thenReturn(new Object[0]);

        Object result = returnsSmartNulls.answer(invocation);

        assertEquals(0, result);
    }

    @Test
    public void shouldReturnOrdinaryBooleanValue_whenDelegateProvidesNonNull() throws Throwable {
        when(invocation.getMethod()).thenReturn(methodOf("booleanMethod"));
        when(invocation.getArguments()).thenReturn(new Object[0]);

        Object result = returnsSmartNulls.answer(invocation);

        assertEquals(false, result);
    }

    @Test
    public void shouldReturnOrdinaryLongValue_whenDelegateProvidesNonNull() throws Throwable {
        when(invocation.getMethod()).thenReturn(methodOf("longMethod"));
        when(invocation.getArguments()).thenReturn(new Object[0]);

        Object result = returnsSmartNulls.answer(invocation);

        assertEquals(0L, result);
    }

    @Test
    public void shouldReturnEmptyString_whenDelegateProvidesNonNull() throws Throwable {
        when(invocation.getMethod()).thenReturn(methodOf("stringMethod"));
        when(invocation.getArguments()).thenReturn(new Object[0]);

        Object result = returnsSmartNulls.answer(invocation);

        assertEquals("", result);
    }

    @Test
    public void shouldReturnEmptyList_whenDelegateProvidesNonNull() throws Throwable {
        when(invocation.getMethod()).thenReturn(methodOf("listMethod"));
        when(invocation.getArguments()).thenReturn(new Object[0]);

        Object result = returnsSmartNulls.answer(invocation);

        assertNotNull(result);
        assertTrue(result instanceof List);
        assertTrue(((List<?>) result).isEmpty());
    }

    // =====================================================
    // Branch: defaultReturnValue == null && canImposterise == true
    // =====================================================

    @Test
    public void shouldReturnSmartNullProxy_forMockableInterfaceReturnType() throws Throwable {
        when(invocation.getMethod()).thenReturn(methodOf("fooMethod"));
        when(invocation.getArguments()).thenReturn(new Object[0]);

        Object result = returnsSmartNulls.answer(invocation);

        assertNotNull(result);
        assertTrue(result instanceof Foo);
    }

    // intercept(): isToString == true, formatMethodCall() กรณี args ว่าง (boundary)
    @Test
    public void smartNullToString_shouldFormatMethodCall_withNoArgs() throws Throwable {
        when(invocation.getMethod()).thenReturn(methodOf("fooMethod"));
        when(invocation.getArguments()).thenReturn(new Object[0]);

        Foo result = (Foo) returnsSmartNulls.answer(invocation);

        String description = result.toString();
        assertEquals("SmartNull returned by fooMethod() method on mock", description);
    }

    // intercept(): isToString == true, formatMethodCall() กรณีมี arguments
    @Test
    public void smartNullToString_shouldFormatMethodCall_withArgs() throws Throwable {
        when(invocation.getMethod()).thenReturn(methodOf("doSomething", String.class, int.class));
        when(invocation.getArguments()).thenReturn(new Object[]{"hello", 5});

        Foo result = (Foo) returnsSmartNulls.answer(invocation);

        String description = result.toString();
        assertEquals("SmartNull returned by doSomething(hello, 5) method on mock", description);
    }

    // อินพุตผิดรูปแบบ: getArguments() คืน null -> Arrays.toString(null) = "null"
    // (พฤติกรรมนี้มาจาก JDK Arrays.toString ตามมาตรฐาน ไม่ใช่การเดา logic ของ Mockito)
    @Test
    public void smartNullToString_withNullArguments_shouldNotThrow_butProduceMalformedMessage() throws Throwable {
        when(invocation.getMethod()).thenReturn(methodOf("fooMethod"));
        when(invocation.getArguments()).thenReturn(null);

        Foo result = (Foo) returnsSmartNulls.answer(invocation);

        // ไม่ควร throw exception แม้ arguments เป็น null
        String description = result.toString();
        // "null" -> substring(1,3) = "ul" ตาม logic ของ formatMethodCall()
        assertEquals("SmartNull returned by fooMethod(ul) method on mock", description);
    }

    // intercept(): isToString == false -> Reporter().smartNullPointerException(...)
    @Test(expected = Throwable.class)
    public void smartNullProxy_shouldThrow_whenCallingNonToStringMethod() throws Throwable {
        when(invocation.getMethod()).thenReturn(methodOf("fooMethod"));
        when(invocation.getArguments()).thenReturn(new Object[0]);

        Foo result = (Foo) returnsSmartNulls.answer(invocation);

        // เรียก method อื่นที่ไม่ใช่ toString -> ต้อง throw ตาม logic ปัจจุบัน
        // (ไม่ assert exception type ที่เฉพาะเจาะจงเพราะ Reporter ไม่ได้อยู่ในซอร์สที่ให้มา)
        result.getName();
    }

    // เพิ่มเติม: ยืนยันว่า equals() ก็ถูกตีความเป็น "ไม่ใช่ toString" เช่นกัน
    // (สะท้อน logic จริงของซอร์ส อาจเป็นจุดที่ fault เกิดขึ้นได้ในเวอร์ชันนี้)
    @Test(expected = Throwable.class)
    public void smartNullProxy_shouldAlsoThrow_whenCallingEquals() throws Throwable {
        when(invocation.getMethod()).thenReturn(methodOf("fooMethod"));
        when(invocation.getArguments()).thenReturn(new Object[0]);

        Foo result = (Foo) returnsSmartNulls.answer(invocation);

        result.equals(result);
    }

    // =====================================================
    // Branch: defaultReturnValue == null && canImposterise == false
    // =====================================================

    @Test
    public void shouldReturnNull_forFinalClassReturnType() throws Throwable {
        when(invocation.getMethod()).thenReturn(methodOf("finalMethod"));
        when(invocation.getArguments()).thenReturn(new Object[0]);

        Object result = returnsSmartNulls.answer(invocation);

        assertNull(result);
    }

    @Test
    public void shouldReturnNull_forVoidReturnType() throws Throwable {
        when(invocation.getMethod()).thenReturn(methodOf("voidMethod"));
        when(invocation.getArguments()).thenReturn(new Object[0]);

        Object result = returnsSmartNulls.answer(invocation);

        assertNull(result);
    }
}
