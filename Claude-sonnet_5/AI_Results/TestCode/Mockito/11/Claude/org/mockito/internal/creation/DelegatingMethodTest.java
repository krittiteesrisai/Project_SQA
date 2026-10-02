package org.mockito.internal.creation;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class DelegatingMethodTest {

    // ---------- Fixture interfaces/classes สำหรับสร้าง Method object ที่หลากหลาย ----------

    interface SampleInterface {
        void abstractMethod();
    }

    static class SampleClass implements SampleInterface {
        public void abstractMethod() { /* overridden -> ไม่ abstract แล้ว */ }

        public void noArgsNoExceptionMethod() { }

        public int withExceptionMethod() throws IOException {
            return 0;
        }

        public void varArgsMethod(String... args) { }

        public String withParamsMethod(int a, String b) {
            return null;
        }
    }

    private Method noArgsMethod;
    private Method exceptionMethod;
    private Method varArgsMethodRef;
    private Method withParamsMethodRef;
    private Method abstractMethodRef;   // จาก interface -> เป็น abstract โดยธรรมชาติ
    private Method concreteMethodRef;   // override แล้ว -> ไม่ abstract

    @Before
    public void setUp() throws Exception {
        noArgsMethod       = SampleClass.class.getMethod("noArgsNoExceptionMethod");
        exceptionMethod    = SampleClass.class.getMethod("withExceptionMethod");
        varArgsMethodRef   = SampleClass.class.getMethod("varArgsMethod", String[].class);
        withParamsMethodRef= SampleClass.class.getMethod("withParamsMethod", int.class, String.class);
        abstractMethodRef  = SampleInterface.class.getMethod("abstractMethod");
        concreteMethodRef  = SampleClass.class.getMethod("abstractMethod");
    }

    // ---------- Constructor & getJavaMethod ----------

    @Test
    public void testConstructorWithValidMethod() {
        DelegatingMethod dm = new DelegatingMethod(noArgsMethod);
        assertNotNull(dm);
    }

    @Test
    public void testGetJavaMethodReturnsOriginalMethodInstance() {
        DelegatingMethod dm = new DelegatingMethod(noArgsMethod);
        assertSame(noArgsMethod, dm.getJavaMethod());
    }

    /**
     * Note: assert ใน constructor ทำงานเฉพาะเมื่อรันด้วย -ea flag
     * เทสนี้ตรวจสอบทั้งสองสถานะของ assertion (enabled/disabled)
     * เพื่อไม่ให้เดา behavior ที่ไม่แน่นอน
     */
    @Test
    public void testConstructorWithNullMethod() {
        boolean assertionsEnabled = false;
        assert assertionsEnabled = true; // ถ้า -ea ถูกเปิด บรรทัดนี้จะรัน และ assertionsEnabled=true

        if (assertionsEnabled) {
            try {
                new DelegatingMethod(null);
                fail("ควรโยน AssertionError เมื่อ assertions เปิดและ method เป็น null");
            } catch (AssertionError e) {
                // expected ตาม source: assert method != null
            }
        } else {
            // เมื่อ assertions ปิด, constructor จะไม่ throw แต่ field จะเป็น null
            DelegatingMethod dm = new DelegatingMethod(null);
            assertNotNull(dm);
            try {
                dm.getName(); // เรียก method บน field null -> ควร NPE
                fail("ควรโยน NullPointerException เนื่องจาก internal method เป็น null");
            } catch (NullPointerException e) {
                // expected
            }
        }
    }

    // ---------- getName ----------

    @Test
    public void testGetNameReturnsCorrectMethodName() {
        DelegatingMethod dm = new DelegatingMethod(noArgsMethod);
        assertEquals("noArgsNoExceptionMethod", dm.getName());
    }

    // ---------- getExceptionTypes ----------

    @Test
    public void testGetExceptionTypesWithNoExceptions() {
        DelegatingMethod dm = new DelegatingMethod(noArgsMethod);
        Class<?>[] exceptions = dm.getExceptionTypes();
        assertNotNull(exceptions);
        assertEquals(0, exceptions.length);
    }

    @Test
    public void testGetExceptionTypesWithOneException() {
        DelegatingMethod dm = new DelegatingMethod(exceptionMethod);
        Class<?>[] exceptions = dm.getExceptionTypes();
        assertEquals(1, exceptions.length);
        assertEquals(IOException.class, exceptions[0]);
    }

    // ---------- getParameterTypes ----------

    @Test
    public void testGetParameterTypesWithNoParams() {
        DelegatingMethod dm = new DelegatingMethod(noArgsMethod);
        Class<?>[] params = dm.getParameterTypes();
        assertEquals(0, params.length);
    }

    @Test
    public void testGetParameterTypesWithMultipleParams() {
        DelegatingMethod dm = new DelegatingMethod(withParamsMethodRef);
        Class<?>[] params = dm.getParameterTypes();
        assertEquals(2, params.length);
        assertEquals(int.class, params[0]);
        assertEquals(String.class, params[1]);
    }

    // ---------- getReturnType ----------

    @Test
    public void testGetReturnTypeVoid() {
        DelegatingMethod dm = new DelegatingMethod(noArgsMethod);
        assertEquals(void.class, dm.getReturnType());
    }

    @Test
    public void testGetReturnTypeNonVoid() {
        DelegatingMethod dm = new DelegatingMethod(withParamsMethodRef);
        assertEquals(String.class, dm.getReturnType());
    }

    // ---------- isVarArgs ----------

    @Test
    public void testIsVarArgsTrue() {
        DelegatingMethod dm = new DelegatingMethod(varArgsMethodRef);
        assertTrue(dm.isVarArgs());
    }

    @Test
    public void testIsVarArgsFalse() {
        DelegatingMethod dm = new DelegatingMethod(noArgsMethod);
        assertFalse(dm.isVarArgs());
    }

    // ---------- isAbstract ----------

    @Test
    public void testIsAbstractTrueForInterfaceMethod() {
        DelegatingMethod dm = new DelegatingMethod(abstractMethodRef);
        assertTrue(dm.isAbstract());
    }

    @Test
    public void testIsAbstractFalseForConcreteMethod() {
        DelegatingMethod dm = new DelegatingMethod(concreteMethodRef);
        assertFalse(dm.isAbstract());
    }

    // ---------- hashCode ----------

    @Test
    public void testHashCodeAlwaysReturnsOne() {
        DelegatingMethod dm1 = new DelegatingMethod(noArgsMethod);
        DelegatingMethod dm2 = new DelegatingMethod(exceptionMethod);
        assertEquals(1, dm1.hashCode());
        assertEquals(1, dm2.hashCode());
    }

    // ---------- equals ----------

    @Test
    public void testEqualsWithSameMethodObject() {
        // method.equals(o) เมื่อ o คือ Method ตัวเดียวกัน -> true
        DelegatingMethod dm = new DelegatingMethod(noArgsMethod);
        assertTrue(dm.equals(noArgsMethod));
    }

    @Test
    public void testEqualsWithDifferentMethodObject() {
        DelegatingMethod dm = new DelegatingMethod(noArgsMethod);
        assertFalse(dm.equals(exceptionMethod));
    }

    @Test
    public void testEqualsWithNull() {
        DelegatingMethod dm = new DelegatingMethod(noArgsMethod);
        assertFalse(dm.equals(null));
    }

    @Test
    public void testEqualsWithUnrelatedObjectType() {
        DelegatingMethod dm = new DelegatingMethod(noArgsMethod);
        assertFalse(dm.equals("not a method"));
    }

    /**
     * สำคัญ: ตาม Javadoc ของ equals() ระบุว่าควร return true
     * ถ้า o เป็น DelegatingMethod ที่ wrap Method ตัวเดียวกัน
     * แต่ source จริงเรียก method.equals(o) ตรงๆ โดยไม่เช็ค instanceof DelegatingMethod
     * ทำให้ Method.equals() คืน false เสมอเมื่อ o ไม่ใช่ Method -> เป็น known fault (Mockito-11b)
     * เทสนี้ยืนยัน behavior จริงของ source (ไม่ได้เดาตาม Javadoc)
     */
    @Test
    public void testEqualsWithAnotherDelegatingMethodWrappingSameMethod_DocumentsKnownFault() {
        DelegatingMethod dm1 = new DelegatingMethod(noArgsMethod);
        DelegatingMethod dm2 = new DelegatingMethod(noArgsMethod);
        assertFalse(dm1.equals(dm2)); // ตาม source จริง, ไม่ตรงกับ Javadoc behavior ที่คาดหวัง
    }
}
