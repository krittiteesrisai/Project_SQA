package org.mockito.internal.creation;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class DelegatingMethodTest {

    // อินเทอร์เฟซและคลาสจำลองสำหรับดึง Method ผ่าน Reflection
    private interface SampleInterface {
        void abstractMethod() throws IOException, IllegalArgumentException;
        void varArgsMethod(String first, Object... rest);
        int nonVarArgsMethod(String[] array);
        void noArgsMethod();
    }

    private static class SampleClass implements SampleInterface {
        @Override
        public void abstractMethod() throws IOException, IllegalArgumentException {}

        @Override
        public void varArgsMethod(String first, Object... rest) {}

        @Override
        public int nonVarArgsMethod(String[] array) {
            return 42;
        }

        @Override
        public void noArgsMethod() {}

        public final String concreteFinalMethod() {
            return "test";
        }
    }

    private Method abstractMethodRef;
    private Method concreteMethodRef;
    private Method varArgsMethodRef;
    private Method nonVarArgsMethodRef;
    private Method noArgsMethodRef;
    private Method concreteFinalMethodRef;

    @Before
    public void setUp() throws Exception {
        abstractMethodRef = SampleInterface.class.getMethod("abstractMethod");
        concreteMethodRef = SampleClass.class.getMethod("abstractMethod");
        varArgsMethodRef = SampleInterface.class.getMethod("varArgsMethod", String.class, Object[].class);
        nonVarArgsMethodRef = SampleInterface.class.getMethod("nonVarArgsMethod", String[].class);
        noArgsMethodRef = SampleInterface.class.getMethod("noArgsMethod");
        concreteFinalMethodRef = SampleClass.class.getMethod("concreteFinalMethod");
    }

    @Test
    public void testGetJavaMethod() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(abstractMethodRef);
        assertSame(abstractMethodRef, delegatingMethod.getJavaMethod());
    }

    @Test
    public void testGetName() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(abstractMethodRef);
        assertEquals("abstractMethod", delegatingMethod.getName());
    }

    @Test
    public void testGetReturnTypeVoidAndPrimitive() {
        DelegatingMethod voidMethod = new DelegatingMethod(noArgsMethodRef);
        assertEquals(void.class, voidMethod.getReturnType());

        DelegatingMethod intMethod = new DelegatingMethod(nonVarArgsMethodRef);
        assertEquals(int.class, intMethod.getReturnType());

        DelegatingMethod stringMethod = new DelegatingMethod(concreteFinalMethodRef);
        assertEquals(String.class, stringMethod.getReturnType());
    }

    @Test
    public void testGetParameterTypesEmptyAndNonEmpty() {
        DelegatingMethod noArgs = new DelegatingMethod(noArgsMethodRef);
        assertEquals(0, noArgs.getParameterTypes().length);

        DelegatingMethod withArgs = new DelegatingMethod(nonVarArgsMethodRef);
        assertArrayEquals(new Class<?>[]{String[].class}, withArgs.getParameterTypes());
    }

    @Test
    public void testGetExceptionTypesEmptyAndDeclared() {
        DelegatingMethod noExceptions = new DelegatingMethod(noArgsMethodRef);
        assertEquals(0, noExceptions.getExceptionTypes().length);

        DelegatingMethod withExceptions = new DelegatingMethod(abstractMethodRef);
        assertArrayEquals(new Class<?>[]{IOException.class, IllegalArgumentException.class}, withExceptions.getExceptionTypes());
    }

    @Test
    public void testIsAbstractTrue() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(abstractMethodRef);
        assertTrue("Interface methods should be abstract", delegatingMethod.isAbstract());
    }

    @Test
    public void testIsAbstractFalse() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(concreteMethodRef);
        assertFalse("Concrete methods in class should not be abstract", delegatingMethod.isAbstract());
    }

    @Test
    public void testIsVarArgsTrue() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(varArgsMethodRef);
        assertTrue("Method declared with varargs must return true", delegatingMethod.isVarArgs());
    }

    @Test
    public void testIsVarArgsFalse() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(nonVarArgsMethodRef);
        assertFalse("Method with standard array parameter must return false for varargs", delegatingMethod.isVarArgs());
    }

    @Test
    public void testEqualsSameInstance() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(abstractMethodRef);
        assertEquals(delegatingMethod, delegatingMethod);
    }

    @Test
    public void testEqualsDelegatingMethodWithSameMethod() {
        DelegatingMethod method1 = new DelegatingMethod(abstractMethodRef);
        DelegatingMethod method2 = new DelegatingMethod(abstractMethodRef);
        
        // ตรวจสอบเงื่อนไขตาม Javadoc: return true if input is DelegatingMethod with equal internal Method
        assertEquals(method1, method2);
    }

    @Test
    public void testEqualsDelegatingMethodWithDifferentMethod() {
        DelegatingMethod method1 = new DelegatingMethod(abstractMethodRef);
        DelegatingMethod method2 = new DelegatingMethod(noArgsMethodRef);
        
        assertNotEquals(method1, method2);
    }

    @Test
    public void testEqualsWithRawMethodInstance() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(abstractMethodRef);
        
        // ตรวจสอบเงื่อนไขตาม Javadoc: return true if input is Method which is equal to internal Method
        assertEquals(delegatingMethod, abstractMethodRef);
    }

    @Test
    public void testEqualsWithDifferentRawMethodInstance() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(abstractMethodRef);
        assertNotEquals(delegatingMethod, noArgsMethodRef);
    }

    @Test
    public void testEqualsWithNull() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(abstractMethodRef);
        assertFalse(delegatingMethod.equals(null));
    }

    @Test
    public void testEqualsWithDifferentObjectType() {
        DelegatingMethod delegatingMethod = new DelegatingMethod(abstractMethodRef);
        assertFalse(delegatingMethod.equals("some arbitrary string"));
    }

    @Test
    public void testHashCode() {
        DelegatingMethod method1 = new DelegatingMethod(abstractMethodRef);
        DelegatingMethod method2 = new DelegatingMethod(noArgsMethodRef);
        
        assertEquals(1, method1.hashCode());
        assertEquals(method1.hashCode(), method2.hashCode());
    }
}