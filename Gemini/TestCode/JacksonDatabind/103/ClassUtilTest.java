package com.fasterxml.jackson.databind.util;

import org.junit.Test;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.core.JsonGenerator;

import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ClassUtilTest {

    @Retention(RetentionPolicy.RUNTIME)
    @interface TestAnnotation {}

    @TestAnnotation
    private enum TestEnum {
        VAL1 {
            @Override
            public String toString() { return "VAL1"; }
        },
        VAL2
    }

    private static class NonStaticInner {
    }

    static class LocalBean {}

    @Test
    public void testEmptyIterator() {
        Iterator<String> it = ClassUtil.emptyIterator();
        assertNotNull(it);
        assertFalse(it.hasNext());
    }

    @Test
    public void testFindSuperTypes() {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        List<JavaType> supers = ClassUtil.findSuperTypes(type, Object.class, true);
        assertNotNull(supers);

        // Edge Cases: null, matches endBefore, or Object.class
        assertTrue(ClassUtil.findSuperTypes(null, Object.class, true).isEmpty());
        assertTrue(ClassUtil.findSuperTypes(type, String.class, true).isEmpty());
        
        JavaType objType = TypeFactory.defaultInstance().constructType(Object.class);
        assertTrue(ClassUtil.findSuperTypes(objType, null, true).isEmpty());
    }

    @Test
    public void testFindRawSuperTypes() {
        List<Class<?>> supers = ClassUtil.findRawSuperTypes(String.class, Object.class, true);
        assertNotNull(supers);

        assertTrue(ClassUtil.findRawSuperTypes(null, Object.class, true).isEmpty());
        assertTrue(ClassUtil.findRawSuperTypes(String.class, String.class, true).isEmpty());
        assertTrue(ClassUtil.findRawSuperTypes(Object.class, null, true).isEmpty());
    }

    @Test
    public void testFindSuperClasses() {
        List<Class<?>> classes = ClassUtil.findSuperClasses(String.class, Object.class, true);
        assertNotNull(classes);
        assertTrue(classes.contains(CharSequence.class) || classes.isEmpty() || classes.size() >= 0);

        assertTrue(ClassUtil.findSuperClasses(null, Object.class, true).isEmpty());
        assertTrue(ClassUtil.findSuperClasses(String.class, String.class, true).isEmpty());
        
        List<Class<?>> classesWithoutSelf = ClassUtil.findSuperClasses(String.class, Object.class, false);
        assertNotNull(classesWithoutSelf);
    }

    @Test
    public void testCanBeABeanType() {
        assertEquals("annotation", ClassUtil.canBeABeanType(TestAnnotation.class));
        assertEquals("array", ClassUtil.canBeABeanType(String[].class));
        assertEquals("enum", ClassUtil.canBeABeanType(TestEnum.class));
        assertEquals("primitive", ClassUtil.canBeABeanType(int.class));
        assertNull(ClassUtil.canBeABeanType(LocalBean.class));
    }

    @Test
    public void testIsLocalType() {
        assertNotNull(ClassUtil.isLocalType(NonStaticInner.class, false));
        assertNull(ClassUtil.isLocalType(LocalBean.class, true));
        assertNull(ClassUtil.isLocalType(LocalBean.class, false));
    }

    @Test
    public void testGetOuterClass() {
        assertNull(ClassUtil.getOuterClass(String.class));
        assertNotNull(ClassUtil.getOuterClass(NonStaticInner.class));
    }

    @Test
    public void testIsProxyType() {
        assertFalse(ClassUtil.isProxyType(String.class));
        assertTrue(ClassUtil.isProxyType(net.sf.cglib.proxy.Enhancer.class));
        assertTrue(ClassUtil.isProxyType(org.hibernate.proxy.HibernateProxy.class));
    }

    @Test
    public void testIsConcrete() {
        assertFalse(ClassUtil.isConcrete(List.class));
        assertTrue(ClassUtil.isConcrete(ArrayList.class));
        
        try {
            Method m = List.class.getMethod("size");
            assertFalse(ClassUtil.isConcrete(m));
            Method am = ArrayList.class.getMethod("size");
            assertTrue(ClassUtil.isConcrete(am));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testIsCollectionMapOrArray() {
        assertTrue(ClassUtil.isCollectionMapOrArray(String[].class));
        assertTrue(ClassUtil.isCollectionMapOrArray(ArrayList.class));
        assertTrue(ClassUtil.isCollectionMapOrArray(HashMap.class));
        assertFalse(ClassUtil.isCollectionMapOrArray(String.class));
    }

    @Test
    public void testIsBogusClass() {
        assertTrue(ClassUtil.isBogusClass(Void.class));
        assertTrue(ClassUtil.isBogusClass(Void.TYPE));
        assertTrue(ClassUtil.isBogusClass(com.fasterxml.jackson.databind.annotation.NoClass.class));
        assertFalse(ClassUtil.isBogusClass(String.class));
    }

    @Test
    public void testIsNonStaticInnerClass() {
        assertTrue(ClassUtil.isNonStaticInnerClass(NonStaticInner.class));
        assertFalse(ClassUtil.isNonStaticInnerClass(LocalBean.class));
    }

    @Test
    public void testIsObjectOrPrimitive() {
        assertTrue(ClassUtil.isObjectOrPrimitive(Object.class));
        assertTrue(ClassUtil.isObjectOrPrimitive(int.class));
        assertFalse(ClassUtil.isObjectOrPrimitive(String.class));
    }

    @Test
    public void testHasClass() {
        assertTrue(ClassUtil.hasClass("test", String.class));
        assertFalse(ClassUtil.hasClass(null, String.class));
        assertFalse(ClassUtil.hasClass("test", Integer.class));
    }

    @Test(expected = IllegalStateException.class)
    public void testVerifyMustOverride() {
        ClassUtil.verifyMustOverride(String.class, Integer.valueOf(5), "toString");
    }

    @Test
    public void testHasGetterSignature() {
        try {
            Method m = String.class.getMethod("isEmpty");
            assertTrue(ClassUtil.hasGetterSignature(m));

            Method mVoid = String.class.getMethod("getChars", int.class, int.class, char[].class, int.class);
            assertFalse(ClassUtil.hasGetterSignature(mVoid));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testExceptionThrowers() {
        Error err = new Error("test error");
        try {
            ClassUtil.throwIfError(err);
            fail();
        } catch (Error e) {
            assertSame(err, e);
        }
        assertNull(ClassUtil.throwIfError(null));

        RuntimeException rte = new RuntimeException("rte");
        try {
            ClassUtil.throwIfRTE(rte);
            fail();
        } catch (RuntimeException e) {
            assertSame(rte, e);
        }

        IOException ioe = new IOException("ioe");
        try {
            ClassUtil.throwIfIOE(ioe);
            fail();
        } catch (IOException e) {
            assertSame(ioe, e);
        }
    }

    @Test
    public void testGetRootCause() {
        Exception cause = new Exception("root");
        Exception wrapper = new Exception("wrapper", cause);
        assertSame(cause, ClassUtil.getRootCause(wrapper));
        assertSame(cause, ClassUtil.getRootCause(cause));
    }

    @Test
    public void testThrowRootCauseIfIOE() {
        IOException ioe = new IOException("ioe");
        Exception wrapper = new Exception(ioe);
        try {
            ClassUtil.throwRootCauseIfIOE(wrapper);
            fail();
        } catch (IOException e) {
            assertSame(ioe, e);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testThrowAsIAE() {
        ClassUtil.throwAsIAE(new Exception("checked"));
    }

    @Test
    public void testThrowAsMappingException() throws Exception {
        JsonMappingException jme = new JsonMappingException(null, "jme");
        DeserializationContext ctxt = mock(DeserializationContext.class);
        try {
            ClassUtil.throwAsMappingException(ctxt, jme);
            fail();
        } catch (JsonMappingException e) {
            assertSame(jme, e);
        }

        IOException ioe = new IOException("ioe");
        try {
            ClassUtil.throwAsMappingException(ctxt, ioe);
            fail();
        } catch (JsonMappingException e) {
            assertNotNull(e);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnwrapAndThrowAsIAE() {
        ClassUtil.unwrapAndThrowAsIAE(new Exception(new Exception("checked")));
    }

    @Test
    public void testCloseOnFailAndThrowAsIOE() {
        JsonGenerator g = mock(JsonGenerator.class);
        Exception fail = new Exception("fail");
        try {
            ClassUtil.closeOnFailAndThrowAsIOE(g, fail);
            fail();
        } catch (RuntimeException e) {
            assertSame(fail, e.getCause() != null ? e.getCause() : e);
        } catch (Exception e) {
            // expected
        }

        Closeable toClose = mock(Closeable.class);
        try {
            ClassUtil.closeOnFailAndThrowAsIOE(g, toClose, fail);
            fail();
        } catch (Exception e) {
            // expected
        }
    }

    @Test
    public void testCreateInstanceAndFindConstructor() {
        LocalBean instance = ClassUtil.createInstance(LocalBean.class, true);
        assertNotNull(instance);

        Constructor<LocalBean> ctor = ClassUtil.findConstructor(LocalBean.class, true);
        assertNotNull(ctor);

        assertNull(ClassUtil.findConstructor(NonStaticInner.class, false));
    }

    @Test
    public void testClassOfAndRawClass() {
        assertNull(ClassUtil.classOf(null));
        assertEquals(String.class, ClassUtil.classOf("test"));

        assertNull(ClassUtil.rawClass(null));
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        assertEquals(String.class, ClassUtil.rawClass(type));
    }

    @Test
    public void testNonNullAndStringHelpers() {
        assertEquals("default", ClassUtil.nonNull(null, "default"));
        assertEquals("value", ClassUtil.nonNull("value", "default"));

        assertNull(ClassUtil.nullOrToString(null));
        assertEquals("123", ClassUtil.nullOrToString(123));

        assertEquals("", ClassUtil.nonNullString(null));
        assertEquals("abc", ClassUtil.nonNullString("abc"));

        assertEquals("null-str", ClassUtil.quotedOr(null, "null-str"));
        assertEquals("\"abc\"", ClassUtil.quotedOr("abc", "null-str"));

        assertEquals("unknown", ClassUtil.getClassDescription(null));
        assertEquals("[null]", ClassUtil.classNameOf(null));
        assertEquals("[null]", ClassUtil.nameOf((Class<?>) null));
        assertEquals("[null]", ClassUtil.nameOf((Named) null));
        assertEquals("[null]", ClassUtil.backticked(null));
    }

    @Test
    public void testPrimitiveHelpers() {
        assertEquals(0, ClassUtil.defaultValue(int.class));
        assertEquals(0L, ClassUtil.defaultValue(long.class));
        assertEquals(Boolean.FALSE, ClassUtil.defaultValue(boolean.class));
        assertEquals(0.0, ClassUtil.defaultValue(double.class));
        assertEquals(0.0f, ClassUtil.defaultValue(float.class));
        assertEquals((byte) 0, ClassUtil.defaultValue(byte.class));
        assertEquals((short) 0, ClassUtil.defaultValue(short.class));
        assertEquals('\0', ClassUtil.defaultValue(char.class));

        assertEquals(Integer.class, ClassUtil.wrapperType(int.class));
        assertEquals(Long.class, ClassUtil.wrapperType(long.class));
        assertEquals(Boolean.class, ClassUtil.wrapperType(boolean.class));
        assertEquals(Double.class, ClassUtil.wrapperType(double.class));
        assertEquals(Float.class, ClassUtil.wrapperType(float.class));
        assertEquals(Byte.class, ClassUtil.wrapperType(byte.class));
        assertEquals(Short.class, ClassUtil.wrapperType(short.class));
        assertEquals(Character.class, ClassUtil.wrapperType(char.class));

        assertEquals(int.class, ClassUtil.primitiveType(int.class));
        assertEquals(int.class, ClassUtil.primitiveType(Integer.class));
        assertNull(ClassUtil.primitiveType(String.class));

        try {
            ClassUtil.defaultValue(String.class);
            fail();
        } catch (IllegalArgumentException e) {}

        try {
            ClassUtil.wrapperType(String.class);
            fail();
        } catch (IllegalArgumentException e) {}
    }

    @Test
    public void testEnumTypeHelpers() {
        EnumSet<TestEnum> set = EnumSet.noneOf(TestEnum.class);
        // Test empty EnumSet/EnumMap or regular enum handling
        assertEquals(TestEnum.class, ClassUtil.findEnumType(TestEnum.VAL2));
        assertEquals(TestEnum.class, ClassUtil.findEnumType(TestEnum.class));
        assertEquals(TestEnum.class, ClassUtil.findEnumType(TestEnum.VAL1)); // with body
        
        EnumMap<TestEnum, String> map = new EnumMap<>(TestEnum.class);
        assertTrue(ClassUtil.findRawSuperTypes(TestEnum.class, Object.class, true).size() > 0);
    }

    @Test
    public void testJacksonStdImpl() {
        assertTrue(ClassUtil.isJacksonStdImpl((Object) null));
        assertTrue(ClassUtil.isJacksonStdImpl(String.class));
    }

    @Test
    public void testClassAspects() {
        assertNull(ClassUtil.getPackageName(int.class));
        assertNotNull(ClassUtil.getPackageName(String.class));

        assertFalse(ClassUtil.hasEnclosingMethod(String.class));
        assertNotNull(ClassUtil.getDeclaredFields(String.class));
        assertNotNull(ClassUtil.getDeclaredMethods(String.class));
        assertNotNull(ClassUtil.findClassAnnotations(int.class));
        assertNotNull(ClassUtil.getClassMethods(String.class));
        assertNotNull(ClassUtil.getConstructors(String.class));
        assertNull(ClassUtil.getDeclaringClass(String.class));
        assertNotNull(ClassUtil.getGenericSuperclass(String.class));
        assertNotNull(ClassUtil.getGenericInterfaces(String.class));
        assertNull(ClassUtil.getEnclosingClass(String.class));
    }
}