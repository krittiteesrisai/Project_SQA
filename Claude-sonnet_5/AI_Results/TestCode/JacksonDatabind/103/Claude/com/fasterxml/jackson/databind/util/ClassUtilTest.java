package com.fasterxml.jackson.databind.util;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil.Ctor;

public class ClassUtilTest {

    // ===================== Fixtures =====================

    interface IFaceA { void doIt(); }
    static class BaseClass implements IFaceA { public void doIt() {} }
    static class SubClass extends BaseClass {}

    static abstract class AbstractClass {}

    @Retention(RetentionPolicy.RUNTIME)
    @interface TestAnno {}

    enum AnnoEnum {
        @TestAnno FOO, BAR
    }

    enum BodyEnum {
        A { void foo() {} },
        B
    }

    @JacksonStdImpl
    static class StdImplClass {}
    static class NonStdImplClass {}

    public static class PublicCtorBean { public PublicCtorBean() {} }
    static class PrivateCtorBean { private PrivateCtorBean() {} }
    static class NoArgThrowingBean { public NoArgThrowingBean() { throw new RuntimeException("boom"); } }
    static class ParamOnlyBean { public ParamOnlyBean(int x) {} }

    static class Outer {
        class Inner {}
        static class StaticInner {}
    }

    static class GetterBean {
        public static String staticGetter() { return null; }
        public String paramGetter(String s) { return s; }
        public void voidGetter() {}
        public String validGetter() { return "x"; }
    }

    static class FieldHolder {
        private int privateField;
        public int publicField;
    }

    Object getLocalClassInstance() {
        class LocalClass {}
        return new LocalClass();
    }

    Object getAnonymousInstance() {
        return new Object() {};
    }

    // ===================== emptyIterator =====================

    @Test
    public void testEmptyIterator() {
        Iterator<String> it = ClassUtil.emptyIterator();
        assertFalse(it.hasNext());
        try {
            it.next();
            fail("should throw");
        } catch (NoSuchElementException e) {
            // expected
        }
    }

    // ===================== findSuperTypes(JavaType,...) =====================

    @Test
    public void testFindSuperTypes_nullType() {
        assertTrue(ClassUtil.findSuperTypes(null, null, true).isEmpty());
    }

    @Test
    public void testFindSuperTypes_hasRawClassEndBefore() {
        JavaType type = TypeFactory.defaultInstance().constructType(SubClass.class);
        assertTrue(ClassUtil.findSuperTypes(type, SubClass.class, true).isEmpty());
    }

    @Test
    public void testFindSuperTypes_objectClass() {
        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        assertTrue(ClassUtil.findSuperTypes(type, null, true).isEmpty());
    }

    @Test
    public void testFindSuperTypes_addClassItselfTrue() {
        JavaType type = TypeFactory.defaultInstance().constructType(SubClass.class);
        List<JavaType> result = ClassUtil.findSuperTypes(type, null, true);
        assertEquals(3, result.size());
        assertEquals(SubClass.class, result.get(0).getRawClass());
        assertEquals(BaseClass.class, result.get(1).getRawClass());
        assertEquals(IFaceA.class, result.get(2).getRawClass());
    }

    @Test
    public void testFindSuperTypes_addClassItselfFalse() {
        JavaType type = TypeFactory.defaultInstance().constructType(SubClass.class);
        List<JavaType> result = ClassUtil.findSuperTypes(type, null, false);
        assertEquals(2, result.size());
        assertEquals(BaseClass.class, result.get(0).getRawClass());
        assertEquals(IFaceA.class, result.get(1).getRawClass());
    }

    // ===================== findRawSuperTypes =====================

    @Test
    public void testFindRawSuperTypes_nullCls() {
        assertTrue(ClassUtil.findRawSuperTypes(null, null, true).isEmpty());
    }

    @Test
    public void testFindRawSuperTypes_equalsEndBefore() {
        assertTrue(ClassUtil.findRawSuperTypes(SubClass.class, SubClass.class, true).isEmpty());
    }

    @Test
    public void testFindRawSuperTypes_objectClass() {
        assertTrue(ClassUtil.findRawSuperTypes(Object.class, null, true).isEmpty());
    }

    @Test
    public void testFindRawSuperTypes_normal() {
        List<Class<?>> result = ClassUtil.findRawSuperTypes(SubClass.class, null, true);
        assertEquals(3, result.size());
        assertEquals(SubClass.class, result.get(0));
        assertEquals(BaseClass.class, result.get(1));
        assertEquals(IFaceA.class, result.get(2));
    }

    // ===================== findSuperClasses =====================

    @Test
    public void testFindSuperClasses_nullCls() {
        assertTrue(ClassUtil.findSuperClasses(null, null, true).isEmpty());
    }

    @Test
    public void testFindSuperClasses_equalsEndBefore() {
        assertTrue(ClassUtil.findSuperClasses(BaseClass.class, BaseClass.class, true).isEmpty());
    }

    @Test
    public void testFindSuperClasses_includesObject() {
        List<Class<?>> result = ClassUtil.findSuperClasses(SubClass.class, null, true);
        assertEquals(3, result.size());
        assertEquals(SubClass.class, result.get(0));
        assertEquals(BaseClass.class, result.get(1));
        assertEquals(Object.class, result.get(2));
    }

    @Test
    public void testFindSuperClasses_excludeSelf() {
        List<Class<?>> result = ClassUtil.findSuperClasses(SubClass.class, null, false);
        assertEquals(2, result.size());
        assertEquals(BaseClass.class, result.get(0));
    }

    @Test
    public void testFindSuperClasses_endBeforeStopsEarly() {
        List<Class<?>> result = ClassUtil.findSuperClasses(SubClass.class, BaseClass.class, true);
        assertEquals(1, result.size());
        assertEquals(SubClass.class, result.get(0));
    }

    // ===================== deprecated findSuperTypes(Class,...) =====================

    @Test
    public void testDeprecatedFindSuperTypes() {
        List<Class<?>> result = ClassUtil.findSuperTypes(SubClass.class, null);
        assertTrue(result.contains(BaseClass.class));
        assertTrue(result.contains(IFaceA.class));
    }

    // ===================== canBeABeanType =====================

    @Test
    public void testCanBeABeanType_annotation() {
        assertEquals("annotation", ClassUtil.canBeABeanType(TestAnno.class));
    }

    @Test
    public void testCanBeABeanType_array() {
        assertEquals("array", ClassUtil.canBeABeanType(int[].class));
    }

    @Test
    public void testCanBeABeanType_enum() {
        assertEquals("enum", ClassUtil.canBeABeanType(AnnoEnum.class));
    }

    @Test
    public void testCanBeABeanType_primitive() {
        assertEquals("primitive", ClassUtil.canBeABeanType(int.class));
    }

    @Test
    public void testCanBeABeanType_normal() {
        assertNull(ClassUtil.canBeABeanType(String.class));
    }

    // ===================== isLocalType / getOuterClass =====================

    @Test
    public void testIsLocalType_topLevel() {
        assertNull(ClassUtil.isLocalType(SubClass.class, false));
    }

    @Test
    public void testIsLocalType_localClass() {
        assertEquals("local/anonymous", ClassUtil.isLocalType(getLocalClassInstance().getClass(), false));
    }

    @Test
    public void testIsLocalType_anonymousClass() {
        assertEquals("local/anonymous", ClassUtil.isLocalType(getAnonymousInstance().getClass(), false));
    }

    @Test
    public void testIsLocalType_nonStaticInner_disallowed() {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        assertEquals("non-static member class", ClassUtil.isLocalType(inner.getClass(), false));
    }

    @Test
    public void testIsLocalType_nonStaticInner_allowed() {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        assertNull(ClassUtil.isLocalType(inner.getClass(), true));
    }

    @Test
    public void testIsLocalType_staticNested() {
        assertNull(ClassUtil.isLocalType(Outer.StaticInner.class, false));
    }

    @Test
    public void testGetOuterClass_localClass() {
        assertNull(ClassUtil.getOuterClass(getLocalClassInstance().getClass()));
    }

    @Test
    public void testGetOuterClass_staticNested() {
        assertNull(ClassUtil.getOuterClass(Outer.StaticInner.class));
    }

    @Test
    public void testGetOuterClass_nonStaticInner() {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        assertEquals(Outer.class, ClassUtil.getOuterClass(inner.getClass()));
    }

    // ===================== isProxyType =====================
    // หมายเหตุ: Class เป็น final class, ไม่สามารถ mock ด้วย Mockito core ได้
    // และการสร้าง class จริงที่ชื่อขึ้นต้นด้วย net.sf.cglib.proxy./org.hibernate.proxy. ในเทสทำได้ยาก
    // จึงทดสอบเฉพาะกรณี false (ไม่เดา behavior ของกรณี true)
    @Test
    public void testIsProxyType_normalClass() {
        assertFalse(ClassUtil.isProxyType(String.class));
    }

    // ===================== isConcrete =====================

    @Test
    public void testIsConcrete_interface() {
        assertFalse(ClassUtil.isConcrete(IFaceA.class));
    }

    @Test
    public void testIsConcrete_abstractClass() {
        assertFalse(ClassUtil.isConcrete(AbstractClass.class));
    }

    @Test
    public void testIsConcrete_concreteClass() {
        assertTrue(ClassUtil.isConcrete(SubClass.class));
    }

    @Test
    public void testIsConcrete_member_abstractMethod() throws Exception {
        Method m = IFaceA.class.getDeclaredMethod("doIt");
        assertFalse(ClassUtil.isConcrete(m));
    }

    @Test
    public void testIsConcrete_member_concreteMethod() throws Exception {
        Method m = GetterBean.class.getDeclaredMethod("validGetter");
        assertTrue(ClassUtil.isConcrete(m));
    }

    // ===================== isCollectionMapOrArray =====================

    @Test
    public void testIsCollectionMapOrArray_array() {
        assertTrue(ClassUtil.isCollectionMapOrArray(int[].class));
    }

    @Test
    public void testIsCollectionMapOrArray_collection() {
        assertTrue(ClassUtil.isCollectionMapOrArray(java.util.ArrayList.class));
    }

    @Test
    public void testIsCollectionMapOrArray_map() {
        assertTrue(ClassUtil.isCollectionMapOrArray(java.util.HashMap.class));
    }

    @Test
    public void testIsCollectionMapOrArray_none() {
        assertFalse(ClassUtil.isCollectionMapOrArray(String.class));
    }

    // ===================== isBogusClass =====================

    @Test
    public void testIsBogusClass_void() {
        assertTrue(ClassUtil.isBogusClass(Void.class));
        assertTrue(ClassUtil.isBogusClass(Void.TYPE));
    }

    @Test
    public void testIsBogusClass_noClass() {
        assertTrue(ClassUtil.isBogusClass(com.fasterxml.jackson.databind.annotation.NoClass.class));
    }

    @Test
    public void testIsBogusClass_normal() {
        assertFalse(ClassUtil.isBogusClass(String.class));
    }

    // ===================== isNonStaticInnerClass =====================

    @Test
    public void testIsNonStaticInnerClass_true() {
        assertTrue(ClassUtil.isNonStaticInnerClass(Outer.Inner.class));
    }

    @Test
    public void testIsNonStaticInnerClass_false_static() {
        assertFalse(ClassUtil.isNonStaticInnerClass(Outer.StaticInner.class));
    }

    // ===================== isObjectOrPrimitive =====================

    @Test
    public void testIsObjectOrPrimitive() {
        assertTrue(ClassUtil.isObjectOrPrimitive(Object.class));
        assertTrue(ClassUtil.isObjectOrPrimitive(int.class));
        assertFalse(ClassUtil.isObjectOrPrimitive(String.class));
    }

    // ===================== hasClass =====================

    @Test
    public void testHasClass() {
        assertFalse(ClassUtil.hasClass(null, String.class));
        assertTrue(ClassUtil.hasClass("abc", String.class));
        assertFalse(ClassUtil.hasClass("abc", Object.class));
    }

    // ===================== verifyMustOverride =====================

    @Test
    public void testVerifyMustOverride_matching() {
        ClassUtil.verifyMustOverride(String.class, "abc", "someMethod");
        // no exception expected
    }

    @Test
    public void testVerifyMustOverride_mismatch() {
        try {
            ClassUtil.verifyMustOverride(Object.class, "abc", "someMethod");
            fail("should throw");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("someMethod"));
            assertTrue(e.getMessage().contains("java.lang.String"));
            assertTrue(e.getMessage().contains("java.lang.Object"));
        }
    }

    // ===================== hasGetterSignature (deprecated) =====================

    @Test
    public void testHasGetterSignature() throws Exception {
        assertFalse(ClassUtil.hasGetterSignature(GetterBean.class.getMethod("staticGetter")));
        assertFalse(ClassUtil.hasGetterSignature(GetterBean.class.getMethod("paramGetter", String.class)));
        assertFalse(ClassUtil.hasGetterSignature(GetterBean.class.getMethod("voidGetter")));
        assertTrue(ClassUtil.hasGetterSignature(GetterBean.class.getMethod("validGetter")));
    }

    // ===================== throwIfError / throwIfRTE / throwIfIOE =====================

    @Test
    public void testThrowIfError() {
        Error err = new Error("e");
        try {
            ClassUtil.throwIfError(err);
            fail("should throw");
        } catch (Error e) {
            assertSame(err, e);
        }
        Throwable rte = new RuntimeException("not an error");
        assertSame(rte, ClassUtil.throwIfError(rte));
    }

    @Test
    public void testThrowIfRTE() {
        RuntimeException rte = new RuntimeException("r");
        try {
            ClassUtil.throwIfRTE(rte);
            fail("should throw");
        } catch (RuntimeException e) {
            assertSame(rte, e);
        }
        Throwable checked = new IOException("io");
        assertSame(checked, ClassUtil.throwIfRTE(checked));
    }

    @Test
    public void testThrowIfIOE() throws IOException {
        IOException ioe = new IOException("io");
        try {
            ClassUtil.throwIfIOE(ioe);
            fail("should throw");
        } catch (IOException e) {
            assertSame(ioe, e);
        }
        Throwable other = new RuntimeException("rte");
        assertSame(other, ClassUtil.throwIfIOE(other));
    }

    // ===================== getRootCause / throwRootCauseIfIOE =====================

    @Test
    public void testGetRootCause_noCause() {
        Throwable t = new RuntimeException("top");
        assertSame(t, ClassUtil.getRootCause(t));
    }

    @Test
    public void testGetRootCause_chained() {
        Throwable root = new IllegalStateException("root");
        Throwable mid = new RuntimeException("mid", root);
        Throwable top = new RuntimeException("top", mid);
        assertSame(root, ClassUtil.getRootCause(top));
    }

    @Test
    public void testThrowRootCauseIfIOE_isIOE() throws IOException {
        Throwable root = new IOException("root-io");
        Throwable top = new RuntimeException("top", root);
        try {
            ClassUtil.throwRootCauseIfIOE(top);
            fail("should throw");
        } catch (IOException e) {
            assertSame(root, e);
        }
    }

    @Test
    public void testThrowRootCauseIfIOE_notIOE() throws IOException {
        Throwable root = new IllegalStateException("root");
        Throwable top = new RuntimeException("top", root);
        assertSame(root, ClassUtil.throwRootCauseIfIOE(top));
    }

    // ===================== throwAsIAE =====================

    @Test
    public void testThrowAsIAE_checkedException() {
        Exception checked = new Exception("checked-msg");
        try {
            ClassUtil.throwAsIAE(checked);
            fail("should throw");
        } catch (IllegalArgumentException e) {
            assertEquals("checked-msg", e.getMessage());
            assertSame(checked, e.getCause());
        }
    }

    @Test
    public void testThrowAsIAE_runtimeException() {
        RuntimeException rte = new RuntimeException("rte-msg");
        try {
            ClassUtil.throwAsIAE(rte);
            fail("should throw");
        } catch (RuntimeException e) {
            assertSame(rte, e);
        }
    }

    @Test
    public void testThrowAsIAE_error() {
        Error err = new Error("err-msg");
        try {
            ClassUtil.throwAsIAE(err);
            fail("should throw");
        } catch (Error e) {
            assertSame(err, e);
        }
    }

    @Test
    public void testThrowAsIAE_withCustomMessage() {
        Exception checked = new Exception("ignored");
        try {
            ClassUtil.throwAsIAE(checked, "custom-msg");
            fail("should throw");
        } catch (IllegalArgumentException e) {
            assertEquals("custom-msg", e.getMessage());
        }
    }

    // ===================== throwAsMappingException =====================

    @Test
    public void testThrowAsMappingException_alreadyMappingException() throws Exception {
        JsonMappingException jme = new JsonMappingException("already");
        try {
            ClassUtil.throwAsMappingException(null, jme);
            fail("should throw");
        } catch (JsonMappingException e) {
            assertSame(jme, e);
        }
    }
    // หมายเหตุ: กรณี e0 ไม่ใช่ JsonMappingException ต้องเรียก JsonMappingException.from(ctxt,...)
    // ซึ่งพฤติกรรมภายในขึ้นกับ DeserializationContext จริง (ไม่ได้แสดงใน source ที่ให้มา)
    // จึงไม่ทดสอบ branch นี้เพื่อไม่เดา behavior ที่ไม่มีอยู่ใน source

    // ===================== unwrapAndThrowAsIAE =====================

    @Test
    public void testUnwrapAndThrowAsIAE() {
        Throwable root = new Exception("root-msg");
        Throwable top = new RuntimeException("top", root);
        try {
            ClassUtil.unwrapAndThrowAsIAE(top);
            fail("should throw");
        } catch (IllegalArgumentException e) {
            assertEquals("root-msg", e.getMessage());
            assertSame(root, e.getCause());
        }
    }

    @Test
    public void testUnwrapAndThrowAsIAE_withMsg() {
        Throwable root = new Exception("root-msg");
        Throwable top = new RuntimeException("top", root);
        try {
            ClassUtil.unwrapAndThrowAsIAE(top, "custom");
            fail("should throw");
        } catch (IllegalArgumentException e) {
            assertEquals("custom", e.getMessage());
        }
    }

    // ===================== closeOnFailAndThrowAsIOE(JsonGenerator, Exception) =====================

    @Test
    public void testCloseOnFail2Arg_ioException() throws Exception {
        JsonGenerator g = mock(JsonGenerator.class);
        IOException fail = new IOException("ioFail");
        try {
            ClassUtil.closeOnFailAndThrowAsIOE(g, fail);
            fail("should throw");
        } catch (IOException e) {
            assertSame(fail, e);
        }
        verify(g).disable(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
        verify(g).close();
    }

    @Test
    public void testCloseOnFail2Arg_runtimeException() throws Exception {
        JsonGenerator g = mock(JsonGenerator.class);
        RuntimeException fail = new RuntimeException("rteFail");
        try {
            ClassUtil.closeOnFailAndThrowAsIOE(g, fail);
            fail("should throw");
        } catch (RuntimeException e) {
            assertSame(fail, e);
        }
    }

    @Test
    public void testCloseOnFail2Arg_checkedException_wrapsAsRuntime() throws Exception {
        JsonGenerator g = mock(JsonGenerator.class);
        Exception fail = new Exception("checkedFail");
        try {
            ClassUtil.closeOnFailAndThrowAsIOE(g, fail);
            fail("should throw");
        } catch (RuntimeException e) {
            assertSame(fail, e.getCause());
        }
    }

    @Test
    public void testCloseOnFail2Arg_closeThrows_suppressed() throws Exception {
        JsonGenerator g = mock(JsonGenerator.class);
        doThrow(new RuntimeException("closeBoom")).when(g).close();
        IOException fail = new IOException("ioFail");
        try {
            ClassUtil.closeOnFailAndThrowAsIOE(g, fail);
            fail("should throw");
        } catch (IOException e) {
            assertSame(fail, e);
            assertEquals(1, e.getSuppressed().length);
            assertEquals("closeBoom", e.getSuppressed()[0].getMessage());
        }
    }

    // ===================== closeOnFailAndThrowAsIOE(JsonGenerator, Closeable, Exception) =====================

    @Test
    public void testCloseOnFail3Arg_bothNull() throws Exception {
        IOException fail = new IOException("ioFail");
        try {
            ClassUtil.closeOnFailAndThrowAsIOE(null, null, fail);
            fail("should throw");
        } catch (IOException e) {
            assertSame(fail, e);
        }
    }

    @Test
    public void testCloseOnFail3Arg_bothNonNull() throws Exception {
        JsonGenerator g = mock(JsonGenerator.class);
        Closeable c = mock(Closeable.class);
        RuntimeException fail = new RuntimeException("rteFail");
        try {
            ClassUtil.closeOnFailAndThrowAsIOE(g, c, fail);
            fail("should throw");
        } catch (RuntimeException e) {
            assertSame(fail, e);
        }
        verify(g).close();
        verify(c).close();
    }

    @Test
    public void testCloseOnFail3Arg_closeableThrows_suppressed() throws Exception {
        Closeable c = mock(Closeable.class);
        doThrow(new RuntimeException("closeableBoom")).when(c).close();
        IOException fail = new IOException("ioFail");
        try {
            ClassUtil.closeOnFailAndThrowAsIOE(null, c, fail);
            fail("should throw");
        } catch (IOException e) {
            assertSame(fail, e);
            assertEquals(1, e.getSuppressed().length);
        }
    }

    // ===================== createInstance / findConstructor =====================

    @Test
    public void testFindConstructor_public_noForce() throws Exception {
        Constructor<PublicCtorBean> ctor = ClassUtil.findConstructor(PublicCtorBean.class, false);
        assertNotNull(ctor);
    }

    @Test
    public void testFindConstructor_private_noForce_throws() {
        try {
            ClassUtil.findConstructor(PrivateCtorBean.class, false);
            fail("should throw");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("is not accessible"));
        }
    }

    @Test
    public void testFindConstructor_private_force_succeeds() throws Exception {
        Constructor<PrivateCtorBean> ctor = ClassUtil.findConstructor(PrivateCtorBean.class, true);
        assertNotNull(ctor);
        assertTrue(ctor.isAccessible());
    }

    @Test
    public void testFindConstructor_noDefaultCtor_returnsNull() {
        assertNull(ClassUtil.findConstructor(ParamOnlyBean.class, false));
    }

    @Test
    public void testCreateInstance_success() {
        PublicCtorBean bean = ClassUtil.createInstance(PublicCtorBean.class, false);
        assertNotNull(bean);
    }

    @Test
    public void testCreateInstance_noDefaultCtor_throwsIAE() {
        try {
            ClassUtil.createInstance(ParamOnlyBean.class, false);
            fail("should throw");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("has no default"));
        }
    }

    @Test
    public void testCreateInstance_privateNoForce_throws() {
        try {
            ClassUtil.createInstance(PrivateCtorBean.class, false);
            fail("should throw");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("is not accessible"));
        }
    }

    @Test
    public void testCreateInstance_privateForce_succeeds() {
        PrivateCtorBean bean = ClassUtil.createInstance(PrivateCtorBean.class, true);
        assertNotNull(bean);
    }

    @Test
    public void testCreateInstance_ctorThrowsRuntime_rethrown() {
        try {
            ClassUtil.createInstance(NoArgThrowingBean.class, true);
            fail("should throw");
        } catch (RuntimeException e) {
            assertEquals("boom", e.getMessage());
        }
    }

    // ===================== classOf / rawClass / nonNull / nullOrToString / nonNullString / quotedOr =====================

    @Test
    public void testClassOf() {
        assertNull(ClassUtil.classOf(null));
        assertEquals(String.class, ClassUtil.classOf("abc"));
    }

    @Test
    public void testRawClass() {
        assertNull(ClassUtil.rawClass(null));
        JavaType t = TypeFactory.defaultInstance().constructType(String.class);
        assertEquals(String.class, ClassUtil.rawClass(t));
    }

    @Test
    public void testNonNull() {
        assertEquals("default", ClassUtil.nonNull(null, "default"));
        assertEquals("value", ClassUtil.nonNull("value", "default"));
    }

    @Test
    public void testNullOrToString() {
        assertNull(ClassUtil.nullOrToString(null));
        assertEquals("123", ClassUtil.nullOrToString(Integer.valueOf(123)));
    }

    @Test
    public void testNonNullString() {
        assertEquals("", ClassUtil.nonNullString(null));
        assertEquals("abc", ClassUtil.nonNullString("abc"));
    }

    @Test
    public void testQuotedOr() {
        assertEquals("NULL", ClassUtil.quotedOr(null, "NULL"));
        assertEquals("\"hi\"", ClassUtil.quotedOr("hi", "NULL"));
        assertEquals("\"123\"", ClassUtil.quotedOr(Integer.valueOf(123), "NULL"));
    }

    // ===================== getClassDescription / classNameOf / nameOf / backticked =====================

    @Test
    public void testGetClassDescription_null() {
        assertEquals("unknown", ClassUtil.getClassDescription(null));
    }

    @Test
    public void testGetClassDescription_classArg() {
        assertEquals("`java.lang.String`", ClassUtil.getClassDescription(String.class));
    }

    @Test
    public void testGetClassDescription_instanceArg() {
        assertEquals("`java.lang.String`", ClassUtil.getClassDescription("abc"));
    }

    @Test
    public void testClassNameOf() {
        assertEquals("[null]", ClassUtil.classNameOf(null));
        assertEquals("`java.lang.String`", ClassUtil.classNameOf("abc"));
    }

    @Test
    public void testNameOfClass_null() {
        assertEquals("[null]", ClassUtil.nameOf((Class<?>) null));
    }

    @Test
    public void testNameOfClass_primitive() {
        assertEquals("`int`", ClassUtil.nameOf(int.class));
    }

    @Test
    public void testNameOfClass_array() {
        assertEquals("`int[]`", ClassUtil.nameOf(int[].class));
    }

    @Test
    public void testNameOfClass_2dArray() {
        assertEquals("`int[][]`", ClassUtil.nameOf(int[][].class));
    }

    @Test
    public void testNameOfClass_normal() {
        assertEquals("`java.lang.String`", ClassUtil.nameOf(String.class));
    }

    @Test
    public void testNameOfNamed_null() {
        assertEquals("[null]", ClassUtil.nameOf((Named) null));
    }

    @Test
    public void testNameOfNamed_nonNull() {
        Named named = mock(Named.class);
        when(named.getName()).thenReturn("foo");
        assertEquals("`foo`", ClassUtil.nameOf(named));
    }

    @Test
    public void testBackticked() {
        assertEquals("[null]", ClassUtil.backticked(null));
        assertEquals("`abc`", ClassUtil.backticked("abc"));
    }

    // ===================== defaultValue / wrapperType / primitiveType =====================

    @Test
    public void testDefaultValue_allPrimitives() {
        assertEquals(Integer.valueOf(0), ClassUtil.defaultValue(Integer.TYPE));
        assertEquals(Long.valueOf(0L), ClassUtil.defaultValue(Long.TYPE));
        assertEquals(Boolean.FALSE, ClassUtil.defaultValue(Boolean.TYPE));
        assertEquals(Double.valueOf(0.0), ClassUtil.defaultValue(Double.TYPE));
        assertEquals(Float.valueOf(0.0f), ClassUtil.defaultValue(Float.TYPE));
        assertEquals(Byte.valueOf((byte) 0), ClassUtil.defaultValue(Byte.TYPE));
        assertEquals(Short.valueOf((short) 0), ClassUtil.defaultValue(Short.TYPE));
        assertEquals(Character.valueOf('\0'), ClassUtil.defaultValue(Character.TYPE));
    }

    @Test
    public void testDefaultValue_invalid() {
        try {
            ClassUtil.defaultValue(String.class);
            fail("should throw");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testWrapperType_all() {
        assertEquals(Integer.class, ClassUtil.wrapperType(Integer.TYPE));
        assertEquals(Long.class, ClassUtil.wrapperType(Long.TYPE));
        assertEquals(Boolean.class, ClassUtil.wrapperType(Boolean.TYPE));
        assertEquals(Double.class, ClassUtil.wrapperType(Double.TYPE));
        assertEquals(Float.class, ClassUtil.wrapperType(Float.TYPE));
        assertEquals(Byte.class, ClassUtil.wrapperType(Byte.TYPE));
        assertEquals(Short.class, ClassUtil.wrapperType(Short.TYPE));
        assertEquals(Character.class, ClassUtil.wrapperType(Character.TYPE));
    }

    @Test
    public void testWrapperType_invalid() {
        try {
            ClassUtil.wrapperType(String.class);
            fail("should throw");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testPrimitiveType_primitiveInput() {
        assertEquals(int.class, ClassUtil.primitiveType(int.class));
    }

    @Test
    public void testPrimitiveType_wrapperInputs() {
        assertEquals(Integer.TYPE, ClassUtil.primitiveType(Integer.class));
        assertEquals(Long.TYPE, ClassUtil.primitiveType(Long.class));
        assertEquals(Boolean.TYPE, ClassUtil.primitiveType(Boolean.class));
        assertEquals(Double.TYPE, ClassUtil.primitiveType(Double.class));
        assertEquals(Float.TYPE, ClassUtil.primitiveType(Float.class));
        assertEquals(Byte.TYPE, ClassUtil.primitiveType(Byte.class));
        assertEquals(Short.TYPE, ClassUtil.primitiveType(Short.class));
        assertEquals(Character.TYPE, ClassUtil.primitiveType(Character.class));
    }

    @Test
    public void testPrimitiveType_notMatching() {
        assertNull(ClassUtil.primitiveType(String.class));
    }

    // ===================== checkAndFixAccess =====================

    @Test
    public void testCheckAndFixAccess_publicNoForce() throws Exception {
        Field f = FieldHolder.class.getField("publicField");
        assertFalse(f.isAccessible());
        ClassUtil.checkAndFixAccess(f, false);
        assertFalse(f.isAccessible());
    }

    @Test
    public void testCheckAndFixAccess_privateNoForce_setsAccessible() throws Exception {
        Field f = FieldHolder.class.getDeclaredField("privateField");
        assertFalse(f.isAccessible());
        ClassUtil.checkAndFixAccess(f, false);
        assertTrue(f.isAccessible());
    }

    @Test
    public void testCheckAndFixAccess_force() throws Exception {
        Field f = FieldHolder.class.getField("publicField");
        ClassUtil.checkAndFixAccess(f, true);
        assertTrue(f.isAccessible());
    }

    @Test
    public void testCheckAndFixAccess_deprecatedOverload() throws Exception {
        Field f = FieldHolder.class.getDeclaredField("privateField");
        ClassUtil.checkAndFixAccess(f);
        assertTrue(f.isAccessible());
    }

    // ===================== findEnumType =====================

    @Test
    public void testFindEnumType_enumSet_nonEmpty() {
        EnumSet<AnnoEnum> set = EnumSet.of(AnnoEnum.FOO);
        assertEquals(AnnoEnum.class, ClassUtil.findEnumType(set));
    }

    @Test
    public void testFindEnumType_enumSet_empty() {
        EnumSet<AnnoEnum> set = EnumSet.noneOf(AnnoEnum.class);
        assertEquals(AnnoEnum.class, ClassUtil.findEnumType(set));
    }

    @Test
    public void testFindEnumType_enumMap_nonEmpty() {
        EnumMap<AnnoEnum, String> map = new EnumMap<AnnoEnum, String>(AnnoEnum.class);
        map.put(AnnoEnum.FOO, "x");
        assertEquals(AnnoEnum.class, ClassUtil.findEnumType(map));
    }

    @Test
    public void testFindEnumType_enumMap_empty() {
        EnumMap<AnnoEnum, String> map = new EnumMap<AnnoEnum, String>(AnnoEnum.class);
        assertEquals(AnnoEnum.class, ClassUtil.findEnumType(map));
    }

    @Test
    public void testFindEnumType_enumInstance_simple() {
        assertEquals(AnnoEnum.class, ClassUtil.findEnumType(AnnoEnum.FOO));
    }

    @Test
    public void testFindEnumType_enumInstance_withBody() {
        assertEquals(BodyEnum.class, ClassUtil.findEnumType(BodyEnum.A));
    }

    @Test
    public void testFindEnumType_class_simple() {
        assertEquals(AnnoEnum.class, ClassUtil.findEnumType(AnnoEnum.class));
    }

    @Test
    public void testFindEnumType_class_withBody() {
        assertEquals(BodyEnum.class, ClassUtil.findEnumType(BodyEnum.A.getClass()));
    }

    // ===================== findFirstAnnotatedEnumValue =====================

    @SuppressWarnings("unchecked")
    @Test
    public void testFindFirstAnnotatedEnumValue_found() {
        Class<Enum<?>> cls = (Class<Enum<?>>) (Class<?>) AnnoEnum.class;
        Enum<?> result = ClassUtil.findFirstAnnotatedEnumValue(cls, TestAnno.class);
        assertEquals(AnnoEnum.FOO, result);
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testFindFirstAnnotatedEnumValue_notFound() {
        Class<Enum<?>> cls = (Class<Enum<?>>) (Class<?>) BodyEnum.class;
        Enum<?> result = ClassUtil.findFirstAnnotatedEnumValue(cls, TestAnno.class);
        assertNull(result);
    }

    // ===================== isJacksonStdImpl =====================

    @Test
    public void testIsJacksonStdImpl_object_null() {
        assertTrue(ClassUtil.isJacksonStdImpl((Object) null));
    }

    @Test
    public void testIsJacksonStdImpl_object_annotated() {
        assertTrue(ClassUtil.isJacksonStdImpl(new StdImplClass()));
    }

    @Test
    public void testIsJacksonStdImpl_object_notAnnotated() {
        assertFalse(ClassUtil.isJacksonStdImpl(new NonStdImplClass()));
    }

    @Test
    public void testIsJacksonStdImpl_class() {
        assertTrue(ClassUtil.isJacksonStdImpl(StdImplClass.class));
        assertFalse(ClassUtil.isJacksonStdImpl(NonStdImplClass.class));
    }

    // ===================== getPackageName =====================

    @Test
    public void testGetPackageName_normal() {
        assertEquals("java.lang", ClassUtil.getPackageName(String.class));
    }

    @Test
    public void testGetPackageName_primitive_null() {
        assertNull(ClassUtil.getPackageName(int.class));
    }

    // ===================== hasEnclosingMethod =====================

    @Test
    public void testHasEnclosingMethod_topLevel() {
        assertFalse(ClassUtil.hasEnclosingMethod(SubClass.class));
    }

    @Test
    public void testHasEnclosingMethod_localClass() {
        assertTrue(ClassUtil.hasEnclosingMethod(getLocalClassInstance().getClass()));
    }

    @Test
    public void testHasEnclosingMethod_objectOrPrimitive() {
        assertFalse(ClassUtil.hasEnclosingMethod(Object.class));
        assertFalse(ClassUtil.hasEnclosingMethod(int.class));
    }

    // ===================== getDeclaredFields / getDeclaredMethods / findClassAnnotations =====================

    @Test
    public void testGetDeclaredFields() {
        Field[] fields = ClassUtil.getDeclaredFields(FieldHolder.class);
        assertEquals(2, fields.length);
    }

    @Test
    public void testGetDeclaredMethods() {
        Method[] methods = ClassUtil.getDeclaredMethods(GetterBean.class);
        assertEquals(4, methods.length);
    }

    @Test
    public void testFindClassAnnotations_objectOrPrimitive() {
        assertEquals(0, ClassUtil.findClassAnnotations(Object.class).length);
        assertEquals(0, ClassUtil.findClassAnnotations(int.class).length);
    }

    @Test
    public void testFindClassAnnotations_normal() {
        assertEquals(1, ClassUtil.findClassAnnotations(StdImplClass.class).length);
    }

    // ===================== getClassMethods =====================

    @Test
    public void testGetClassMethods_happyPath() {
        Method[] methods = ClassUtil.getClassMethods(GetterBean.class);
        assertEquals(4, methods.length);
    }

    // ===================== getConstructors =====================

    @Test
    public void testGetConstructors_interface() {
        assertEquals(0, ClassUtil.getConstructors(IFaceA.class).length);
    }

    @Test
    public void testGetConstructors_objectOrPrimitive() {
        assertEquals(0, ClassUtil.getConstructors(Object.class).length);
    }

    @Test
    public void testGetConstructors_normal() {
        Ctor[] ctors = ClassUtil.getConstructors(PublicCtorBean.class);
        assertEquals(1, ctors.length);
        Ctor c = ctors[0];
        assertEquals(0, c.getParamCount());
        assertEquals(PublicCtorBean.class, c.getDeclaringClass());
        assertNotNull(c.getDeclaredAnnotations());
        assertNotNull(c.getParameterAnnotations());
        assertNotNull(c.getConstructor());
    }

    // ===================== getDeclaringClass / getGenericSuperclass / getGenericInterfaces / getEnclosingClass =====================

    @Test
    public void testGetDeclaringClass_objectOrPrimitive() {
        assertNull(ClassUtil.getDeclaringClass(Object.class));
        assertNull(ClassUtil.getDeclaringClass(int.class));
    }

    @Test
    public void testGetDeclaringClass_normal() {
        assertEquals(Outer.class, ClassUtil.getDeclaringClass(Outer.StaticInner.class));
    }

    @Test
    public void testGetGenericSuperclass() {
        assertEquals(Object.class, ClassUtil.getGenericSuperclass(SubClass.class) == null
                ? null : BaseClass.class); // just sanity that call doesn't throw; real check below
        assertEquals(BaseClass.class, ClassUtil.getGenericSuperclass(SubClass.class));
    }

    @Test
    public void testGetGenericInterfaces() {
        assertEquals(0, ClassUtil.getGenericInterfaces(SubClass.class).length);
        assertEquals(1, ClassUtil.getGenericInterfaces(BaseClass.class).length);
    }

    @Test
    public void testGetEnclosingClass_objectOrPrimitive() {
        assertNull(ClassUtil.getEnclosingClass(Object.class));
        assertNull(ClassUtil.getEnclosingClass(int.class));
    }

    @Test
    public void testGetEnclosingClass_topLevel() {
        assertNull(ClassUtil.getEnclosingClass(SubClass.class));
    }

    @Test
    public void testGetEnclosingClass_innerClass() {
        assertEquals(Outer.class, ClassUtil.getEnclosingClass(Outer.Inner.class));
    }
}
