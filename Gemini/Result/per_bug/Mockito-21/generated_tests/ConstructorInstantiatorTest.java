package org.mockito.internal.creation.instance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructorInstantiatorTest {

    // --- Helper Classes สำหรับจำลองสถานการณ์ต่างๆ ---

    public static class SimplePublicClass {
        public SimplePublicClass() {}
    }

    public static class PrivateConstructorClass {
        private PrivateConstructorClass() {}
    }

    public abstract static class AbstractClass {
        public AbstractClass() {}
    }

    public interface InterfaceType {}

    public static class ExceptionThrowingClass {
        public ExceptionThrowingClass() {
            throw new RuntimeException("Constructor failed intentionally");
        }
    }

    public static class OuterClass {
        public class InnerClass {
            public InnerClass() {}
        }

        public class ExceptionThrowingInnerClass {
            public ExceptionThrowingInnerClass() {
                throw new IllegalStateException("Inner constructor error");
            }
        }
    }

    public static class SubOuterClass extends OuterClass {
    }

    // --- Test Cases ---

    /**
     * Branch 1 -> 1.1: outerClassInstance เป็น null และคลาสเป้าหมายมี public no-arg constructor
     */
    @Test
    public void testNewInstance_withNullOuter_success() {
        ConstructorInstantiator instantiator = new ConstructorInstantiator(null);
        SimplePublicClass instance = instantiator.newInstance(SimplePublicClass.class);

        assertNotNull("Instance should not be null", instance);
        assertTrue("Should be instance of SimplePublicClass", instance instanceof SimplePublicClass);
    }

    /**
     * Branch 1 -> 1.2: outerClassInstance เป็น null แต่คลาสเป้าหมายมี private constructor
     */
    @Test
    public void testNewInstance_withNullOuter_privateConstructorThrowsException() {
        ConstructorInstantiator instantiator = new ConstructorInstantiator(null);
        try {
            instantiator.newInstance(PrivateConstructorClass.class);
            fail("Expected InstantationException was not thrown");
        } catch (InstantationException e) {
            assertTrue("Message should contain class name",
                    e.getMessage().contains("PrivateConstructorClass"));
            assertTrue("Message should explain parameter-less constructor requirement",
                    e.getMessage().contains("Please ensure it has parameter-less constructor."));
            assertNotNull("Cause should not be null", e.getCause());
        }
    }

    /**
     * Branch 1 -> 1.2: outerClassInstance เป็น null แต่สร้าง Abstract Class
     */
    @Test
    public void testNewInstance_withNullOuter_abstractClassThrowsException() {
        ConstructorInstantiator instantiator = new ConstructorInstantiator(null);
        try {
            instantiator.newInstance(AbstractClass.class);
            fail("Expected InstantationException was not thrown");
        } catch (InstantationException e) {
            assertTrue("Message should contain class name",
                    e.getMessage().contains("AbstractClass"));
            assertNotNull("Cause should not be null", e.getCause());
        }
    }

    /**
     * Branch 1 -> 1.2: outerClassInstance เป็น null แต่สร้าง Interface
     */
    @Test
    public void testNewInstance_withNullOuter_interfaceThrowsException() {
        ConstructorInstantiator instantiator = new ConstructorInstantiator(null);
        try {
            instantiator.newInstance(InterfaceType.class);
            fail("Expected InstantationException was not thrown");
        } catch (InstantationException e) {
            assertTrue("Message should contain class name",
                    e.getMessage().contains("InterfaceType"));
            assertNotNull("Cause should not be null", e.getCause());
        }
    }

    /**
     * Branch 1 -> 1.2: outerClassInstance เป็น null แต่ constructor โยน exception ภายใน
     */
    @Test
    public void testNewInstance_withNullOuter_constructorThrowsException() {
        ConstructorInstantiator instantiator = new ConstructorInstantiator(null);
        try {
            instantiator.newInstance(ExceptionThrowingClass.class);
            fail("Expected InstantationException was not thrown");
        } catch (InstantationException e) {
            assertTrue("Message should contain class name",
                    e.getMessage().contains("ExceptionThrowingClass"));
            assertNotNull("Cause should not be null", e.getCause());
        }
    }

    /**
     * Branch 2 -> 2.1: outerClassInstance ไม่เป็น null และสามารถสร้าง Inner class สำเร็จ
     */
    @Test
    public void testNewInstance_withOuterInstance_success() {
        OuterClass outer = new OuterClass();
        ConstructorInstantiator instantiator = new ConstructorInstantiator(outer);
        OuterClass.InnerClass inner = instantiator.newInstance(OuterClass.InnerClass.class);

        assertNotNull("Inner instance should not be null", inner);
        assertTrue("Should be instance of InnerClass", inner instanceof OuterClass.InnerClass);
    }

    /**
     * Branch 2 -> 2.2: outerClassInstance ไม่เป็น null แต่คลาสเป้าหมายเป็น Simple Top-Level Class (ไม่มี constructor รับ outer)
     */
    @Test
    public void testNewInstance_withOuterInstance_targetLacksMatchingConstructor() {
        OuterClass outer = new OuterClass();
        ConstructorInstantiator instantiator = new ConstructorInstantiator(outer);
        try {
            instantiator.newInstance(SimplePublicClass.class);
            fail("Expected InstantationException was not thrown");
        } catch (InstantationException e) {
            assertTrue("Message should contain class name",
                    e.getMessage().contains("SimplePublicClass"));
            assertTrue("Message should describe outer instance type problem",
                    e.getMessage().contains("Please ensure that the outer instance has correct type"));
            assertNotNull("Cause should not be null", e.getCause());
        }
    }

    /**
     * Branch 2 -> 2.2: outerClassInstance เป็น Subclass ของ Outer Class ที่ Inner Class คาดหวัง
     * (Defects4J Edge Case: getDeclaredConstructor(outerClassInstance.getClass()) จะโยน NoSuchMethodException)
     */
    @Test
    public void testNewInstance_withSubclassOuterInstance_throwsException() {
        SubOuterClass subOuter = new SubOuterClass();
        ConstructorInstantiator instantiator = new ConstructorInstantiator(subOuter);
        try {
            instantiator.newInstance(OuterClass.InnerClass.class);
            fail("Expected InstantationException was not thrown");
        } catch (InstantationException e) {
            assertTrue("Message should contain class name",
                    e.getMessage().contains("InnerClass"));
            assertTrue("Message should describe outer instance type problem",
                    e.getMessage().contains("Please ensure that the outer instance has correct type"));
            assertNotNull("Cause should be NoSuchMethodException", e.getCause());
        }
    }

    /**
     * Branch 2 -> 2.2: outerClassInstance ไม่เป็น null และ Inner class constructor เกิด RuntimeException ระหว่างสร้าง
     */
    @Test
    public void testNewInstance_withOuterInstance_innerConstructorThrowsException() {
        OuterClass outer = new OuterClass();
        ConstructorInstantiator instantiator = new ConstructorInstantiator(outer);
        try {
            instantiator.newInstance(OuterClass.ExceptionThrowingInnerClass.class);
            fail("Expected InstantationException was not thrown");
        } catch (InstantationException e) {
            assertTrue("Message should contain class name",
                    e.getMessage().contains("ExceptionThrowingInnerClass"));
            assertNotNull("Cause should not be null", e.getCause());
        }
    }
}