package org.mockito.internal.creation.instance;

import org.junit.Test;

import java.lang.reflect.Constructor;

import static org.junit.Assert.*;

/**
 * Unit tests for {@link ConstructorInstantiator}.
 * Covers: null/non-null outer instance branch, exceptions ที่ catch ได้ (InstantationException)
 * และกรณี edge-case ที่ cls == null ซึ่งจะทำให้เกิด NullPointerException แทน InstantationException
 * (วิเคราะห์จากซอร์สโค้ด: cls.getSimpleName() ใน catch block จะ throw NPE ถ้า cls เป็น null)
 */
public class ConstructorInstantiatorTest {

    // ---------- Helper classes สำหรับทดสอบ noArgConstructor() ----------

    public static class NoArgConstructorClass {
        public NoArgConstructorClass() {}
    }

    public static class ThrowingConstructorClass {
        public ThrowingConstructorClass() {
            throw new RuntimeException("boom");
        }
    }

    public abstract static class AbstractClass {
        public AbstractClass() {}
    }

    private static class PrivateConstructorClass {
        private PrivateConstructorClass() {}
    }

    // ---------- Helper classes สำหรับทดสอบ withOuterClass() ----------

    // non-static inner class -> compiler จะ generate constructor ที่รับ outer instance โดยอัตโนมัติ
    public class InnerClass {
        public InnerClass() {}
    }

    public class ThrowingOuterClass {
        public ThrowingOuterClass() {
            throw new RuntimeException("boom outer");
        }
    }

    // static nested class ที่มี constructor รับ Integer (ไม่ match กับ outer instance type String)
    public static class NoMatchingConstructorClass {
        public NoMatchingConstructorClass(Integer i) {}
    }

    // =====================================================================
    // Branch: outerClassInstance == null -> noArgConstructor(cls)
    // =====================================================================

    @Test
    public void shouldCreateInstance_whenOuterIsNull_andClassHasNoArgConstructor() {
        ConstructorInstantiator instantiator = new ConstructorInstantiator(null);

        NoArgConstructorClass instance = instantiator.newInstance(NoArgConstructorClass.class);

        assertNotNull(instance);
    }

    @Test
    public void shouldThrowInstantationException_whenNoArgConstructorThrowsException() {
        ConstructorInstantiator instantiator = new ConstructorInstantiator(null);

        try {
            instantiator.newInstance(ThrowingConstructorClass.class);
            fail("Expected InstantationException");
        } catch (InstantationException e) {
            assertTrue(e.getMessage().contains("ThrowingConstructorClass"));
            assertTrue(e.getMessage().contains("parameter-less constructor"));
            assertNotNull(e.getCause());
        }
    }

    @Test
    public void shouldThrowInstantationException_whenClassIsAbstract() {
        ConstructorInstantiator instantiator = new ConstructorInstantiator(null);

        try {
            instantiator.newInstance(AbstractClass.class);
            fail("Expected InstantationException");
        } catch (InstantationException e) {
            assertTrue(e.getMessage().contains("AbstractClass"));
            assertNotNull(e.getCause());
        }
    }

    @Test
    public void shouldThrowInstantationException_whenConstructorIsPrivate() {
        ConstructorInstantiator instantiator = new ConstructorInstantiator(null);

        try {
            instantiator.newInstance(PrivateConstructorClass.class);
            fail("Expected InstantationException");
        } catch (InstantationException e) {
            assertTrue(e.getMessage().contains("PrivateConstructorClass"));
        }
    }

    @Test
    public void shouldThrowInstantationException_whenClassIsInterface() {
        // boundary: interface ไม่สามารถ instantiate ได้ -> InstantiationException ภายใน
        ConstructorInstantiator instantiator = new ConstructorInstantiator(null);

        try {
            instantiator.newInstance(Runnable.class);
            fail("Expected InstantationException");
        } catch (InstantationException e) {
            assertTrue(e.getMessage().contains("Runnable"));
        }
    }

    @Test
    public void shouldThrowInstantationException_whenClassIsPrimitive() {
        // boundary: primitive type ไม่สามารถ instantiate ได้
        ConstructorInstantiator instantiator = new ConstructorInstantiator(null);

        try {
            instantiator.newInstance(int.class);
            fail("Expected InstantationException");
        } catch (InstantationException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void shouldThrowNullPointerException_whenOuterIsNull_andClassIsNull() {
        // NOTE: วิเคราะห์จากซอร์ส - ถ้า cls เป็น null, cls.newInstance() จะ throw NPE
        // ซึ่งถูก catch (Exception e) แล้วแต่ตอนสร้าง InstantationException เรียก cls.getSimpleName()
        // บน cls ที่เป็น null อีกครั้ง -> เกิด NullPointerException ใหม่หลุดออกมาแทน InstantationException
        ConstructorInstantiator instantiator = new ConstructorInstantiator(null);

        try {
            instantiator.newInstance(null);
            fail("Expected NullPointerException (fault in source: cls.getSimpleName() on null cls)");
        } catch (NullPointerException npe) {
            // expected behavior based on source analysis
        } catch (InstantationException ie) {
            fail("Did not expect InstantationException - cls.getSimpleName() should NPE first");
        }
    }

    // =====================================================================
    // Branch: outerClassInstance != null -> withOuterClass(cls)
    // =====================================================================

    @Test
    public void shouldCreateInstance_whenOuterIsNotNull_andConstructorMatchesOuterType() {
        ConstructorInstantiatorTest outer = this;
        ConstructorInstantiator instantiator = new ConstructorInstantiator(outer);

        InnerClass instance = instantiator.newInstance(InnerClass.class);

        assertNotNull(instance);
    }

    @Test
    public void shouldThrowInstantationException_whenOuterConstructorThrowsException() {
        ConstructorInstantiatorTest outer = this;
        ConstructorInstantiator instantiator = new ConstructorInstantiator(outer);

        try {
            instantiator.newInstance(ThrowingOuterClass.class);
            fail("Expected InstantationException");
        } catch (InstantationException e) {
            assertTrue(e.getMessage().contains("ThrowingOuterClass"));
            assertTrue(e.getMessage().contains("outer instance has correct type"));
            assertNotNull(e.getCause());
        }
    }

    @Test
    public void shouldThrowInstantationException_whenNoConstructorMatchesOuterType() {
        // outer instance เป็น String แต่ class ต้องการ constructor รับ Integer -> NoSuchMethodException
        ConstructorInstantiator instantiator = new ConstructorInstantiator("someOuterInstance");

        try {
            instantiator.newInstance(NoMatchingConstructorClass.class);
            fail("Expected InstantationException");
        } catch (InstantationException e) {
            assertTrue(e.getMessage().contains("NoMatchingConstructorClass"));
            assertTrue(e.getMessage().contains("outer instance has correct type"));
            assertNotNull(e.getCause());
        }
    }

    @Test
    public void shouldThrowInstantationException_whenOuterInstanceIsEmptyStringAndNoMatch() {
        // boundary: outer instance เป็น empty string (non-null แต่ว่าง)
        ConstructorInstantiator instantiator = new ConstructorInstantiator("");

        try {
            instantiator.newInstance(NoMatchingConstructorClass.class);
            fail("Expected InstantationException");
        } catch (InstantationException e) {
            assertTrue(e.getMessage().contains("NoMatchingConstructorClass"));
        }
    }

    @Test
    public void shouldThrowNullPointerException_whenOuterIsNotNull_andClassIsNull() {
        // NOTE: วิเคราะห์จากซอร์ส - cls.getDeclaredConstructor(...) บน null cls -> NPE
        // ถูก catch (Exception e) แต่ paramsException(cls, e) เรียก cls.getSimpleName() บน null -> NPE หลุดออกมา
        ConstructorInstantiator instantiator = new ConstructorInstantiator("outer");

        try {
            instantiator.newInstance(null);
            fail("Expected NullPointerException (fault in source: cls.getSimpleName() on null cls)");
        } catch (NullPointerException npe) {
            // expected behavior based on source analysis
        } catch (InstantationException ie) {
            fail("Did not expect InstantationException - cls.getSimpleName() should NPE first");
        }
    }
}
