package com.fasterxml.jackson.databind.introspect;

import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.annotation.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.util.Annotations;

public class AnnotatedClassTest {

    // --- Dummy Annotations & Helper Classes for Testing ---
    
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    public @interface TestAnn {
        String value() default "default";
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.ANNOTATION_TYPE)
    @TestAnn("bundle")
    public @interface TestBundleAnn {}

    static class SimpleTargetClass {
        public String field1;
        
        public SimpleTargetClass() {}
        
        public SimpleTargetClass(String arg1) {
            this.field1 = arg1;
        }

        public static SimpleTargetClass create(String arg1) {
            return new SimpleTargetClass(arg1);
        }

        public void memberMethod(String arg) {}
        
        public static void staticMethod(String arg) {}
    }

    interface SampleInterface {
        void intfMethod();
    }

    static abstract class InterfaceImplClass implements SampleInterface {
        @Override
        public void intfMethod() {}
    }

    enum SampleEnum {
        VAL1, VAL2;
    }

    class NonStaticInnerClass {
        NonStaticInnerClass(String s) {}
    }

    static class DummyMixInResolver implements ClassIntrospector.MixInResolver {
        private final Class<?> mixinCls;

        public DummyMixInResolver(Class<?> mixinCls) {
            this.mixinCls = mixinCls;
        }

        @Override
        public Class<?> findMixInClassFor(Class<?> cls) {
            if (cls == SimpleTargetClass.class || cls == Object.class) {
                return mixinCls;
            }
            return null;
        }
    }

    static class DummyAnnotationIntrospector extends AnnotationIntrospector {
        private static final long serialVersionUID = 1L;

        @Override
        public boolean isAnnotationBundle(Annotation ann) {
            return ann instanceof TestBundleAnn;
        }

        @Override
        public boolean hasIgnoreMarker(AnnotatedMember m) {
            return m.hasAnnotation(Deprecated.class);
        }
    }

    @TestAnn("mixin")
    interface SimpleMixIn {
        @TestAnn("mixinMethod")
        void memberMethod(String arg);
    }

    // --- Test Cases ---

    @Test
    public void testConstructAndBasicAccessors() {
        AnnotatedClass ac = AnnotatedClass.construct(SimpleTargetClass.class, null, null);
        assertNotNull(ac);
        assertEquals(SimpleTargetClass.class, ac.getAnnotated());
        assertEquals(SimpleTargetClass.class.getName(), ac.getName());
        assertNotNull(ac.getModifiers());
        assertNotNull(ac.getGenericType());
        assertNotNull(ac.getRawType());
        assertEquals("[AnnotedClass " + SimpleTargetClass.class.getName() + "]", ac.toString());
    }

    @Test
    public void testConstructWithoutSuperTypes() {
        AnnotatedClass ac = AnnotatedClass.constructWithoutSuperTypes(SimpleTargetClass.class, null, null);
        assertNotNull(ac);
        assertEquals(SimpleTargetClass.class, ac.getAnnotated());
    }

    @Test
    public void testAnnotationsAndIntrospector() {
        DummyAnnotationIntrospector intr = new DummyAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.construct(SimpleTargetClass.class, intr, null);

        // Test caching / lazy loading of annotations
        assertNull(ac.getAnnotation(TestAnn.class));
        assertFalse(ac.hasAnnotations());
        assertNotNull(ac.annotations());
        assertNotNull(ac.getAnnotations());
        
        Annotations annotationsObj = ac.getAnnotations();
        assertTrue(annotationsObj instanceof AnnotationMap);
    }

    @Test
    public void testCreatorsResolutionAndConstructors() {
        DummyAnnotationIntrospector intr = new DummyAnnotationIntrospector();
        DummyMixInResolver mixInResolver = new DummyMixInResolver(SimpleMixIn.class);
        
        AnnotatedClass ac = AnnotatedClass.construct(SimpleTargetClass.class, intr, mixInResolver);
        
        assertNotNull(ac.getDefaultConstructor());
        List<AnnotatedConstructor> ctors = ac.getConstructors();
        assertNotNull(ctors);
        
        List<AnnotatedMethod> staticMethods = ac.getStaticMethods();
        assertNotNull(staticMethods);
    }

    @Test
    public void testMemberMethodsAndFiltering() {
        AnnotatedClass ac = AnnotatedClass.construct(SimpleTargetClass.class, new DummyAnnotationIntrospector(), null);
        
        assertNotNull(ac.memberMethods());
        assertTrue(ac.getMemberMethodCount() >= 0);
        
        AnnotatedMethod found = ac.findMethod("memberMethod", new Class<?>[] { String.class });
        assertNotNull(found);
        
        AnnotatedMethod notFound = ac.findMethod("nonExistent", new Class<?>[] {});
        assertNull(notFound);
    }

    @Test
    public void testFieldsResolution() {
        AnnotatedClass ac = AnnotatedClass.construct(SimpleTargetClass.class, null, null);
        assertTrue(ac.getFieldCount() >= 1);
        assertNotNull(ac.fields());
    }

    @Test
    public void testInterfaceToNonInterfaceMethodCombination() {
        AnnotatedClass ac = AnnotatedClass.construct(InterfaceImplClass.class, null, null);
        assertNotNull(ac.memberMethods());
        assertTrue(ac.getMemberMethodCount() > 0);
    }

    @Test(expected = IllegalStateException.class)
    public void testConstructorParameterMismatchException() {
        // Triggering the IllegalStateException branch inside _constructConstructor
        // by evaluating a member class where parameter count doesn't match expected inner class context properly without standard instantiation.
        Class<?> innerClass = NonStaticInnerClass.class;
        DummyAnnotationIntrospector intr = new DummyAnnotationIntrospector();
        // Constructing directly or forcing constructor analysis via AnnotatedClass
        AnnotatedClass ac = AnnotatedClass.construct(innerClass, intr, null);
        ac.getDefaultConstructor(); // Forces resolveCreators
        ac.getConstructors();
    }

    @Test
    public void testEnumConstructorHandling() {
        // Enums have hidden parameters (name, index) which test the Enum branch in _constructConstructor
        AnnotatedClass ac = AnnotatedClass.construct(SampleEnum.class, new DummyAnnotationIntrospector(), null);
        assertNotNull(ac.getConstructors());
    }

    @Test
    public void testAnnotationBundleHandling() {
        // Test annotation bundle logic
        Class<?> clsWithBundle = ClassWithBundleTarget.class;
        DummyAnnotationIntrospector intr = new DummyAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.construct(clsWithBundle, intr, null);
        assertNotNull(ac.getAllAnnotations());
    }

    @TestBundleAnn
    static class ClassWithBundleTarget {}
}