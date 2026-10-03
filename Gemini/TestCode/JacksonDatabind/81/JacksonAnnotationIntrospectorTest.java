package com.fasterxml.jackson.databind.introspect;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

/**
 * ชุดทดสอบระดับ Advanced สำหรับ JacksonAnnotationIntrospector มุ่งเน้น Branch Coverage สูงสุด
 * และดักจับ Edge Cases ตามมาตรฐาน Defects4J
 */
public class JacksonAnnotationIntrospectorTest {

    private JacksonAnnotationIntrospector introspector;

    @Before
    public void setUp() {
        introspector = new JacksonAnnotationIntrospector();
    }

    @Test
    public void testVersion() {
        assertNotNull("Version should not be null", introspector.version());
    }

    @Test
    public void testReadResolve() {
        Object resolved = introspector.readResolve();
        assertNotNull("ReadResolve should return valid instance", resolved);
    }

    @Test
    public void testSetConstructorPropertiesImpliesCreator() {
        JacksonAnnotationIntrospector result = introspector.setConstructorPropertiesImpliesCreator(false);
        assertSame("Should support fluent configuration", introspector, result);
    }

    @Test
    public void testFindCreatorAnnotationExplicit() throws Exception {
        class DummyClass {
            @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
            public DummyClass(String arg) {}
        }
        Constructor<?> ctor = DummyClass.class.getDeclaredConstructor(String.class);
        AnnotatedConstructor ac = new AnnotatedConstructor(null, ctor, null, null);

        JsonCreator.Mode mode = introspector.findCreatorAnnotation(null, ac);
        assertEquals(JsonCreator.Mode.DELEGATING, mode);
    }

    @Test
    public void testResolveSetterConflictPrimitives() throws Exception {
        class DummySetter {
            public void setIntVal(int val) {}
            public void setIntegerVal(Integer val) {}
            public void setStringVal(String val) {}
            public void setObjVal(Object val) {}
        }

        Method mInt = DummySetter.class.getDeclaredMethod("setIntVal", int.class);
        Method mInteger = DummySetter.class.getDeclaredMethod("setIntegerVal", Integer.class);
        Method mString = DummySetter.class.getDeclaredMethod("setStringVal", String.class);
        Method mObj = DummySetter.class.getDeclaredMethod("setObjVal", Object.class);

        AnnotatedMethod amInt = new AnnotatedMethod(null, mInt, null, null);
        AnnotatedMethod amInteger = new AnnotatedMethod(null, mInteger, null, null);
        AnnotatedMethod amString = new AnnotatedMethod(null, mString, null, null);
        AnnotatedMethod amObj = new AnnotatedMethod(null, mObj, null, null);

        // Primitive vs Non-primitive
        assertEquals(amInt, introspector.resolveSetterConflict(null, amInt, amInteger));
        assertEquals(amInt, introspector.resolveSetterConflict(null, amInteger, amInt));

        // String vs Non-string
        assertEquals(amString, introspector.resolveSetterConflict(null, amString, amObj));
        assertEquals(amString, introspector.resolveSetterConflict(null, amObj, amString));

        // No conflict resolution
        assertNull(introspector.resolveSetterConflict(null, amInteger, amObj));
    }

    @Test
    public void testPropertyNameHelperEdges() throws Exception {
        // ใช้ Reflection เพื่อเข้าถึง protected method _propertyName
        java.lang.reflect.Method method = JacksonAnnotationIntrospector.class.getDeclaredMethod(
                "_propertyName", String.class, String.class);
        method.setAccessible(true);

        // Edge Case 1: Empty localName -> USE_DEFAULT
        PropertyName p1 = (PropertyName) method.invoke(introspector, "", "namespace");
        assertEquals(PropertyName.USE_DEFAULT, p1);

        // Edge Case 2: Empty namespace -> construct with localName only
        PropertyName p2 = (PropertyName) method.invoke(introspector, "local", "");
        assertEquals(PropertyName.construct("local"), p2);

        // Edge Case 3: Both present
        PropertyName p3 = (PropertyName) method.invoke(introspector, "local", "namespace");
        assertEquals(PropertyName.construct("local", "namespace"), p3);
    }

    @Test
    public void testClassIfExplicitEdges() throws Exception {
        java.lang.reflect.Method method = JacksonAnnotationIntrospector.class.getDeclaredMethod(
                "_classIfExplicit", Class.class, Class.class);
        method.setAccessible(true);

        // Null or Bogus
        assertNull(method.invoke(introspector, null, Object.class));
        assertNull(method.invoke(introspector, Void.class, Object.class)); // Void is typically a bogus/marker class in context

        // Equals implicit
        assertNull(method.invoke(introspector, String.class, String.class));

        // Valid explicit
        assertEquals(String.class, method.invoke(introspector, String.class, Integer.class));
    }
}